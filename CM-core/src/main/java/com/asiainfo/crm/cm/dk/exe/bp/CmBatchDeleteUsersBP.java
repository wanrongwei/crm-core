package com.asiainfo.crm.cm.dk.exe.bp;

import java.rmi.RemoteException;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.bp.BpFrameWork;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpNotify;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;

public class CmBatchDeleteUsersBP implements IBpProcess, IBpNotify {

	private final static int FILE_COL_COUNT = 1;	// 上传文件每行的项目列数

	@Override
	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception {
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(TenantIDFactory.getTenant());
		userInfo.setID(bpInfo.getProcessOpId());
		userInfo.setOrgId(bpInfo.getProcessOrgId());
		ServiceManager.setServiceUserInfo(userInfo);

		if (null != bpCols && bpCols.length > 0) {

			long custId = -1;
			for (int i = 0; i < bpCols.length; i++)	// 对每行记录处理
			{
				BpCol[] bpCol = bpCols[i];
				if (bpCol == null || bpCol.length != FILE_COL_COUNT)	// 行内容参数与配置的不一致
				{
					// // 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String.valueOf(FILE_COL_COUNT));
				}
				custId = Long.parseLong(bpCol[0].getValue());
				deleteIndivCust(custId);
			}
		}
	}

	// 删除
	private void deleteIndivCust(long custId) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue value = service.queryCustomerByCustId(custId);
		//如果客户下只有user角色，才删除CPR和将state置为E
		if(judgeIsOnlyUserRole(value)) {
			value.setState(CmConstants.RecordState.ERASE);
			value.setExpireDate(CmCommonUtil.getSysDate());
			// 删除CPR号码
			value.setCustCertCode(null);
			service.saveCustomer(value);
		}
		
		// 删除参与人角色
		ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRole(value.getPartyId(), CmConstants.PartyRoleType.USER, -1, -1);
		if (partyRoles != null && partyRoles.length > 0) {
			BOCmPartyRoleBean partyRoleBean = null;
			for (int i = 0; i < partyRoles.length; i++) {
				partyRoleBean = new BOCmPartyRoleBean();
				partyRoleBean.copy(partyRoles[i]);
				partyRoleBean.delete();
				partyRoleSV.savePartyRole(partyRoleBean);
			}
		}
	}

	/**
	 * 	判断客户下是否只有user角色
	 * 		如果只有user角色，返回 true,否则返回false
	 * @param value
	 * @return
	 * @throws Exception 
	 * @throws RemoteException 
	 */
	private boolean judgeIsOnlyUserRole(ICustomerValue value) throws RemoteException, Exception {
		ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRoleByPartyId(value.getPartyId());
		if(roleValues != null && roleValues.length > 0) {
			for (IBOCmPartyRoleValue roleValue : roleValues) {
				long roleType = roleValue.getRoleType();
				if(roleType != CmConstants.PartyRoleType.USER) {
					return false;
				}
			}
		}
		return true;
	}

	public void statusNotify(String notifyBillId, String notifyMsg) throws Exception {
		// 调用发送短信接口完成短信发送
		if (StringUtils.isNotBlank(notifyBillId) && StringUtils.isNotBlank(notifyMsg)) {
			CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.BILL_ID, notifyBillId);
			CmServiceFactory.getTeamInvokeSV().sendSms(notifyBillId, notifyMsg);
		}
	}

	public static void main(String[] args) throws Exception {
		// 启动下载FTP文件入库
		// BpFrameWork.main(new String[]{"-ftp","BATCH_DELETE_USERS_21"});
		// 根据入库文件执行业务逻辑
		BpFrameWork.main(new String[] { "-dispatcher", "BATCH_DELETE_USERS_21:21:1:0" });
	}
}