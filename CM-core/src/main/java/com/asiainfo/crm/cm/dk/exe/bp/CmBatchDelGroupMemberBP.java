package com.asiainfo.crm.cm.dk.exe.bp;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
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
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupMemberSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;

public class CmBatchDelGroupMemberBP implements IBpProcess, IBpNotify {

	private final static int FILE_COL_COUNT = 1;

	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception {
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(TenantIDFactory.getTenant());
		userInfo.setID(bpInfo.getProcessOpId());
		userInfo.setOrgId(bpInfo.getProcessOrgId());
		ServiceManager.setServiceUserInfo(userInfo);
		if (null != bpCols && bpCols.length > 0) {
			for (int i = 0; i < bpCols.length; i++) {
				BpCol[] bpCol = bpCols[i];
				if (bpCol == null || bpCol.length != FILE_COL_COUNT) // 行内容参数与配置的不一致
				{
					// // 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String
							.valueOf(FILE_COL_COUNT));
				}
				
				long memberId = -1;

				for (int j = 0; j < FILE_COL_COUNT; j++) {
					switch (bpCol[j].getPosition()) // 按照顺序处理
					{
					case 1:
						if (StringUtils.isNotBlank(bpCol[j].getValue())) {
							memberId = Long.parseLong(bpCol[j].getValue());
						}
						break;

					default:
						break;
					}
				}
				ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				ICustomerValue value = service.queryCustomerByCustId(memberId);
				if(value==null){
					ExceptionUtil.throwBusinessException("CMS0012385");
				}else{
					if(!partyRoleSV.IsPartyRoleUnique(value.getPartyId(), CmConstants.PartyRoleType.EMPLOYEE)){
						// 删除参与人角色
						IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRoles(value.getPartyId(),CmConstants.PartyRoleType.EMPLOYEE, -1, -1);
						if (partyRoles != null && partyRoles.length > 0) {
							BOCmPartyRoleBean partyRoleBean = null;
							partyRoleBean = new BOCmPartyRoleBean();
							partyRoleBean.copy(partyRoles[0]);
							partyRoleBean.delete();
							partyRoleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
							partyRoleBean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
							partyRoleSV.savePartyRole(partyRoleBean);
							
						}
						//删除集团成员
						IBOCmGroupMemberValue[] groupMembers =service.getBoCmGrpMemberByCustIdOrMemCustId(-1, memberId);
						IBOCmGroupMemberValue  groupMember = new BOCmGroupMemberBean();
						
						if (groupMembers != null && groupMembers.length > 0) {
							groupMember.copy(groupMembers[0]);
							groupMember.delete();
							groupMember.setRegionId(CmCommonUtil.getDefaultRegionId());
							groupMember.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
							CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmGroupMemberBean)groupMember);
						}else{
							ExceptionUtil.throwBusinessException("CMS0012385");
						}
					}else{
						// 删除参与人角色
						IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRoles(value.getPartyId(),CmConstants.PartyRoleType.EMPLOYEE, -1, -1);
						if (partyRoles != null && partyRoles.length > 0) {
							BOCmPartyRoleBean partyRoleBean = null;
							partyRoleBean = new BOCmPartyRoleBean();
							partyRoleBean.copy(partyRoles[0]);
							partyRoleBean.delete();
							partyRoleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
							partyRoleBean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
							partyRoleSV.savePartyRole(partyRoleBean);
							
						}
						//删除集团成员
						IBOCmGroupMemberValue[] groupMembers =service.getBoCmGrpMemberByCustIdOrMemCustId(-1, memberId);
						IBOCmGroupMemberValue  groupMember = new BOCmGroupMemberBean();
						
						if (groupMembers != null && groupMembers.length > 0) {
							groupMember.copy(groupMembers[0]);
							groupMember.delete();
							groupMember.setRegionId(CmCommonUtil.getDefaultRegionId());
							groupMember.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
							CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmGroupMemberBean)groupMember);
						}else{
							ExceptionUtil.throwBusinessException("CMS0012385");
						}
						
						IBOCmIndivCustomerValue indivCustomer = new BOCmIndivCustomerBean();
						indivCustomer.copy(value);
						indivCustomer.setCustStatus(CmConstants.CustomerStatus.INDIV_TERMINATED);
						indivCustomer.setState(CmConstants.RecordState.ERASE);
						indivCustomer.setExpireDate(CmCommonUtil.getSysDate());
						indivCustomer.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
						CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmIndivCustomerBean)indivCustomer);
						//退订cpr
						ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
						requestTaskSV.saveCustRequestTaskInfo(value.getCustId(), 1, "C");
					}
				}
			}
		}
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
		 BpFrameWork.main(new String[] { "-ftp", "BATCH_DELETE_GROUP_MEMBER_21" });
		// 根据入库文件执行业务逻辑
		//BpFrameWork.main(new String[] { "-dispatcher", "BATCH_DELETE_GROUP_MEMBER_21:21:1:0" });
	}

}
