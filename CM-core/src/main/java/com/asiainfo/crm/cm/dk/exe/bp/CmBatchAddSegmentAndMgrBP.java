package com.asiainfo.crm.cm.dk.exe.bp;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpNotify;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.cache.CmSegmentManagerCacheImpl;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;

public class CmBatchAddSegmentAndMgrBP implements IBpProcess, IBpNotify {

	private final static int FILE_COL_COUNT = 3; // 上传文件每行的项目列数.

	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception {
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(TenantIDFactory.getTenant());
		userInfo.setID(bpInfo.getProcessOpId());
		userInfo.setOrgId(bpInfo.getProcessOrgId());
		ServiceManager.setServiceUserInfo(userInfo);
		if (null != bpCols && bpCols.length > 0) {
			for (int i = 0; i < bpCols.length; i++) {
				String kobNumber = null;
				String segment = null;
				String managerCode = null;
				BpCol[] bpCol = bpCols[i];
				if (bpCol == null || bpCol.length != FILE_COL_COUNT) // 行内容参数与配置的不一致
				{
					// // 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String.valueOf(FILE_COL_COUNT));
				}
				kobNumber = bpCol[0].getValue();
				segment = bpCol[1].getValue();
				managerCode = bpCol[2].getValue();
				if (StringUtils.isNotBlank(kobNumber) && StringUtils.isNotBlank(segment) && StringUtils.isNotBlank(managerCode)) {
					if (kobNumber.length() <= 10||kobNumber.contains("K")) {
						// 不足10位补足十位
						if(!kobNumber.contains("K")){
							int betLength = 10 - kobNumber.length();
							for (int j = 0; j < betLength; j++) {
								kobNumber = "0" + kobNumber;
							}
						}
						ICmGroupCustomerSV groupSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
						com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV groupService = (com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV) ServiceFactory
								.getService(com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV.class);
						IBOCmGroupCustomerValue GroupCustValue = groupSV.queryGroupCustomer("", CmConstants.CertificateType.KOB_NUMBER, kobNumber);
						if (CmCommonUtil.isNotEmptyObject(GroupCustValue)) {
							long custId = GroupCustValue.getCustId();
							String doDomain = null;
							// 调用权限的接口查询出operId
							IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("AD_DOMAIN_CODE");
							if (CmCommonUtil.isNotEmptyObject(staticValues)) {
								doDomain = staticValues[0].getCodeValue();
							}
							// SA保存客户与客户经理组的关系
							if ("SA".equals(segment.toUpperCase())) {
								long groupCode = DataType.getAsLong(CacheFactory.get(CmSegmentManagerCacheImpl.class, DataType.getAsLong(CmConstants.segment.SA)));
								groupService.saveManager(custId, groupCode);
							} else {
								// 保存客户与客户经理经理信息
								IBOSecOperatorValue[] secValues = OrgmodelClient.getSecOperInfosByADCodeAndDomain(managerCode, doDomain);
								if (CmCommonUtil.isNotEmptyObject(secValues)) {
									groupService.saveManager(custId, secValues[0].getOperatorId());
								} else {
									ExceptionUtil.throwBusinessException("CMS9988959");
								}
							}
							ICmCustSegmentRelaSV segmentRela = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
							IBOCmCustSegmentRelaValue segmentRelaBean = segmentRela.querySegmentRelaByCustId(custId);
							if (CmCommonUtil.isNotEmptyObject(segmentRelaBean)) {
								// 更新细分信息
								ICmCustSegmentSV segmentSV = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
								IBoCmCustSegmentValue segInfo = segmentSV.querySegmentByNamefromCache(segment);
								if (CmCommonUtil.isNotEmptyObject(segInfo)) {
									segmentRelaBean.setSegmentId(segInfo.getSegmentId());
									// 保存细分信息
									segmentRela.saveSegmentRela(segmentRelaBean);
									// 细分送billing
									groupService.sendSegmentToBilling(custId, segInfo.getSegmentId());
								} else {
									// 细分在系统中不存在
									ExceptionUtil.throwBusinessException("CMS9988962");
								}
							} else {
								// 细分在系统中不存在
								ExceptionUtil.throwBusinessException("CMS9988962");
							}
						} else {
							// 根据kob查询不出来客户
							ExceptionUtil.throwBusinessException("CMS9988960");
						}
					} else {
						ExceptionUtil.throwBusinessException("AMS0350505");// 参数不对
					}
				} else {
					ExceptionUtil.throwBusinessException("AMS0350505");// 参数不对
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

}
