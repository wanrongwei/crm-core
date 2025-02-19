package com.asiainfo.crm.cm.dk.exe.bp;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.appframe.ext.exeframe.bp.BpFrameWork;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpNotify;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.cache.CmSegmentManagerCacheImpl;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustPreferChannelBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOCmIndivManagerValue;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV;

public class CmBatchCustMgrBP implements IBpProcess, IBpNotify {

	private final static int FILE_COL_COUNT = 4;

	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception {
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(TenantIDFactory.getTenant());
		userInfo.setID(bpInfo.getProcessOpId());
		userInfo.setOrgId(bpInfo.getProcessOrgId());
		ServiceManager.setServiceUserInfo(userInfo);
		if (null != bpCols && bpCols.length > 0) {
			ICmGroupCustomerSV customerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			long custId = -1;
			long managerId = -1;
			long action = 0;
			int relType = 0;
			String operCode ="";
			String kobNumber ="";
			for (int i = 0; i < bpCols.length; i++) {
				IVOCustValue custValue = new VOCustBean();
				BpCol[] bpCol = bpCols[i];
				if (bpCol == null || bpCol.length != FILE_COL_COUNT) // 行内容参数与配置的不一致
				{
					// // 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String.valueOf(FILE_COL_COUNT));
				}
				for (int j = 0; j < FILE_COL_COUNT; j++) {
					switch (bpCol[j].getPosition()) // 按照顺序处理
					{
						case 1:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								kobNumber = bpCol[j].getValue();
							}
							break;

						case 2:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								operCode = bpCol[j].getValue();
							}
							break;

						case 3:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								relType = Integer.parseInt(bpCol[j].getValue());
							}
							break;

						case 4:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								action = Long.parseLong(bpCol[j].getValue());// 1:add,2:delete
							}
							break;

						default:
							break;
					}
				}
				operCode = TenantIDFactory.getTenantId() + operCode;
				ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
				IBOSecOperatorValue value = iseCm.getOperatorByCode(operCode);
				if (value == null){
					ExceptionUtil.throwBusinessException("CMS0012390");
				}else{
					managerId = value.getOperatorId();
				}
				if (managerId <= 0) {
					ExceptionUtil.throwBusinessException("CMS0012390");
				} else {
					
					IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(managerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
					if (kobNumber.indexOf("K") != 0){
						int len = kobNumber.length();
						if (len != 10){
							for(int t=0; t< 10-len;t++){
								kobNumber = "0" + kobNumber;
							}
						}
					}
					IBOCmGroupCustomerValue ictv = customerSV.queryGroupcustomerByKOB(kobNumber);
					if (ictv != null){
						custId = ictv.getCustId();
					}else {
						ExceptionUtil.throwBusinessException("CMS0012387");
					}
					if (ictv.getCustStatus() == CmConstants.CustomerStatus.GROUP_TERMINATED){
						ExceptionUtil.throwBusinessException("CMS0012397");
					}
					ICm2SoSV cm2SoSV = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
					IBOCmCustSegmentRelaValue ictv1 = cm2SoSV.queryCmCustSegmentRelaInfo(custId);
					if (ictv1 == null){
						ExceptionUtil.throwBusinessException("CMS0012394");
					}
					long segment = ictv1.getSegmentId();
					if (segment > 0) {
						if (segment == Long.parseLong("200000000005")) {
							ExceptionUtil.throwBusinessException("CMS0012393");
						} else {
							if (ictv != null && secStaff != null) {
								if (CmConstants.CustomerType.GROUP == CmCommonUtil.getCustType(custId)) {
									if (ictv.getState().equals(CmConstants.RecordState.USE)) {
										if(CmStaticDataUtil.isLegalStaticData("CM_CUST_MGR_REL_TYPE", String.valueOf(relType))){
											if (relType == CmConstants.custMgrRole.ACCOUNT_MANAGER){
												  ExceptionUtil.throwBusinessException("CMS0012395");
										    } else {
											      if (action == CmConstants.action.ADD) {
												      addGrpCustManager(custId, managerId, relType, custValue);
											      } else if (action == CmConstants.action.DELETE) {
												      deleGrpCustManager(custId, managerId, relType, custValue);
											      } else {
												       ExceptionUtil.throwBusinessException("CMS1100098");
											      }
										   }
										}else {
										    ExceptionUtil.throwBusinessException("CMS0012386");
										}
									} else {
										// 客户销户
										ExceptionUtil.throwBusinessException("CMS0012388");
									}
								} else {
									ExceptionUtil.throwBusinessException("CMS0012387");
								}
							} else if (secStaff != null) {
								ExceptionUtil.throwBusinessException("CMS0012387");
							} else if (ictv != null) {
								ExceptionUtil.throwBusinessException("CMS0012390");
							} else {
								ExceptionUtil.throwBusinessException("CMS0012391");
							}

						}
					} else {
						ExceptionUtil.throwBusinessException("CMS0012394");
					}

				}

			}

		}

	}

	public void addGrpCustManager(long custId, long managerId, int relType, IVOCustValue custValue) throws Exception {

		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmGroupManagerValue[] groupManagerValues = null;

		groupManagerValues = new IBOCmGroupManagerValue[1];
		for (int i = 0; i < 1; i++) {
			groupManagerValues[i] = new BOCmGroupManagerBean();
			groupManagerValues[i].setCustId(custId);
			groupManagerValues[i].setRelType(relType);
			groupManagerValues[i].setOperType(1);
			groupManagerValues[i].setManagerId(managerId);
			groupManagerValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
			groupManagerValues[i].setState(CmLnConstants.GroupManagerState.State_U);
			groupManagerValues[i].setRelId(CmCommonUtil.getNewSequence(BOCmGroupManagerBean.class));
		}
		custValue.setUserObject(CmConstants.ObjectKey.MANAGER_TYPE_KEY, CmConstants.ObjectKey.MANAGER_TYPE_GROUP);
		custValue.setUserObject(CmConstants.ObjectKey.MANAGER_KEY, groupManagerValues);
		custValue.setUserObject(CmConstants.ObjectKey.MANAGER_TOPE_TYPE, CmLnConstants.DealCustInfo.OP_NEW);

		customerSV.saveMgrRel(custValue);
		// 记录变更日志
		ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
		BOCmGroupManagerBean temp =new BOCmGroupManagerBean();
		temp.copy(groupManagerValues[0]);
		sv.saveCustMgrChangeHistory(temp);
	}

	public void deleGrpCustManager(long custId, long managerId, int relType, IVOCustValue custValue) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmGroupManagerValue[] groupManagerValues = null;
		// 根据客户编号客户经理标识查询客户经理对象
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		ICmCustomerSV icm = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer da = new DataContainer();
		da.set(IBOCmGroupManagerValue.S_CustId, custId);
		da.set(IBOCmGroupManagerValue.S_ManagerId, managerId);
		da.set(IBOCmGroupManagerValue.S_RelType, relType);
		IBOCmGroupManagerValue[] cmGrpManager = icm.queryManagerValue(da, CmConstants.CustomerType.GROUP, -1, -1);
		if (cmGrpManager != null && cmGrpManager.length > 0) {
			groupManagerValues = new IBOCmGroupManagerValue[1];
			groupManagerValues[0] = new BOCmGroupManagerBean();
			groupManagerValues[0].initProperty(IBOCmGroupManagerValue.S_RelId, cmGrpManager[0].getRelId());
			groupManagerValues[0].copy(cmGrpManager[0]);
			groupManagerValues[0].setStsToOld();
			groupManagerValues[0].delete();
			custValue.setUserObject(CmConstants.ObjectKey.MANAGER_TYPE_KEY, CmConstants.ObjectKey.MANAGER_TYPE_GROUP);
			custValue.setUserObject(CmConstants.ObjectKey.MANAGER_KEY, groupManagerValues);
			custValue.setUserObject(CmConstants.ObjectKey.MANAGER_TOPE_TYPE, CmLnConstants.DealCustInfo.OP_DEL);
			customerSV.saveMgrRel(custValue);
			// 记录变更日志
			ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
			BOCmGroupManagerBean temp =new BOCmGroupManagerBean();
			temp.copy(groupManagerValues[0]);
			sv.saveCustMgrChangeHistory(temp);
		} else {
			ExceptionUtil.throwBusinessException("CMS0012392");
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
		//BpFrameWork.main(new String[] { "-ftp", "BATCH_GROUP_MANAGER_21" });
		// 根据入库文件执行业务逻辑
		BpFrameWork.main(new String[] { "-dispatcher", "BATCH_GROUP_MANAGER_21:21:1:0" });
	}

}
