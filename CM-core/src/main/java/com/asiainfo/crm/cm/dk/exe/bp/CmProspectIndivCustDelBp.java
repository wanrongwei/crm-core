package com.asiainfo.crm.cm.dk.exe.bp;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.bp.BpFrameWork;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpNotify;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmProspectIndivCustDelBp implements IBpProcess, IBpNotify {

	private final static int FILE_COL_COUNT = 1;	// 上传文件每行的项目列数.

	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception {
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(TenantIDFactory.getTenant());
		userInfo.setID(bpInfo.getProcessOpId());
		userInfo.setOrgId(bpInfo.getProcessOrgId());
		ServiceManager.setServiceUserInfo(userInfo);

		if (null != bpCols && bpCols.length > 0) {

			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
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
				ICustomerValue value = customerSV.queryCustomerByCustId(custId);
				if (value != null) {
					String regionId = value.getRegionId();
					if (StringUtils.isNotBlank(regionId)) {
						CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.REGION_ID, regionId);
					}
					if (value.getCustStatus() != CmConstants.CustomerStatus.INDIV_POTENTIAL) {
						// 该客户[{0}],不是潜在客户
						ExceptionUtil.throwBusinessException("CMS0001243");
					}
					customerSV.deleteIndivCust(custId);
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
		BpFrameWork.main(new String[] { "-ftp", "BATCH_DEL_PROSPECT_INDIV_CUST_21" });
		// 根据入库文件执行业务逻辑
		// BpFrameWork.main(new String[] { "-dispatcher", "BATCH_DEL_PROSPECT_INDIV_CUST_21:240:1:0" });
	}

}
