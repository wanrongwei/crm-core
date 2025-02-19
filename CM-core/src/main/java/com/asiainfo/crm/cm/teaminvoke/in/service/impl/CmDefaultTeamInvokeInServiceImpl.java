package com.asiainfo.crm.cm.teaminvoke.in.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.bce.ivalues.IQBceBusinessAttrValue;
import com.ai.bce.service.interfaces.IBceFrameSV;
import com.ai.bce.util.BceServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.instance.ivalues.IInsAccrelValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.service.interfaces.IInstanceQrySV;
import com.ai.omframe.order.bo.BOSoBusiLogBean;
import com.ai.omframe.order.ivalues.IBOSoBusiLogValue;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.client.SecframeClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecStaffValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecEntityValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecPrivValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecRoleGrantValue;
import com.asiainfo.crm.bill.teaminvoke.out.interfaces.IInterfaceBillCrmSV;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.bo.SoAccrelBean;
import com.asiainfo.crm.cm.model.bo.SoUserBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeInService;
import com.asiainfo.crm.inter.outdata.teaminvoke.out.interfaces.IUcm2CrmFSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.exe.remote.third.ConfirmResultDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustInfoMoveRspDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustScoreAndGradeInfoDataBean;
import com.asiainfo.crm.so.exe.remote.third.TransferResultDataBean;
import com.asiainfo.crm.so.query.ivalues.IQUserRelInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class CmDefaultTeamInvokeInServiceImpl implements ICmTeamInvokeInService {

	private IInstanceQrySV getInstanceQrySV() throws Exception {
		return (IInstanceQrySV) ServiceFactory.getService(IInstanceQrySV.class);
	}

	private ICrmFSV getCrmFSV() {
		return (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
	}

	// private ICrmQrySV getCrmQrySV() {
	// return (ICrmQrySV) ServiceFactory.getService(ICrmQrySV.class);
	// }

	public DataContainer[] queryBceFieldDefine(long busiId, String userParam) throws Exception {
		// 首先解析自定义参数
		Map userParams = CmCommonUtil.getUserParams(userParam);
		// 调用bce接口查询数据
		// IBceFrameSV frameSV = (IBceFrameSV)ServiceFactory.getService(IBceFrameSV.class);
		IBceFrameSV frameSV = BceServiceFactory.getBceFrameSV();
		IQBceBusinessAttrValue[] atrrs = frameSV.getQBceBusinessAttrsByBusinessId(busiId, userParams, null);

		// 数据对象转换
		DataContainer[] result = null;
		if (atrrs == null || atrrs.length == 0) {
			result = new DataContainer[0];
		} else {
			List tmpList = new ArrayList();
			DataContainer oneRecord = null;
			for (int i = 0, len = atrrs.length; i < len; i++) {
				if (atrrs[i].getFormId().startsWith("frm")) {
					oneRecord = new DataContainer();
					// oneRecord.set(IQBOCmOperFieldValue.S_BceFrameId, Long.valueOf(atrrs[i].getBceFrameId()));
					// oneRecord.set(IQBOCmOperFieldValue.S_BceFormId, atrrs[i].getFormId());
					// oneRecord.set(IQBOCmOperFieldValue.S_FieldName, atrrs[i].getAttrCode());
					oneRecord.set("FIELD_TEXT", atrrs[i].getAttrName());
					tmpList.add(oneRecord);
				}
			}
			result = (DataContainer[]) tmpList.toArray(new DataContainer[0]);
		}
		return result;
	}

	public ISoUserValue getSoUserByUserId(long userId) throws Exception {
		IInsUserValue insUserValue = getInstanceQrySV().getInstUserByUserId(userId);
		if (insUserValue != null) {
			ISoUserValue soUserValue = new SoUserBean();
			soUserValue.copy(insUserValue);
			return soUserValue;
		}
		return null;
	}

	public ISoUserValue getSoUserByBillId(String billId) throws Exception {
		IInsUserValue insUserValue = getInstanceQrySV().getInstUserByBillId(billId);
		if (insUserValue != null) {
			ISoUserValue soUserValue = new SoUserBean();
			soUserValue.copy(insUserValue);
			return soUserValue;
		}
		return null;
	}

	public IBOUserInfoValue queryUserInfoByBillId(String billId) throws Exception {
		return getCrmFSV().queryUserInfo4CM(billId);
	}

	public ISoUserValue[] getSoUsersByCustId(long custId, int startNum, int endNum) throws Exception {
		IInsUserValue[] insUserValues = getCrmFSV().getInstUserByCustId(custId);
		if (CmCommonUtil.isNotEmptyObject(insUserValues)) {
			List result = new ArrayList();
			for (int i = 0; i < insUserValues.length; i++) {
				if (insUserValues[i] == null) {
					continue;
				}
				ISoUserValue soUserValue = new SoUserBean();
				soUserValue.copy(insUserValues[i]);
				result.add(soUserValue);
			}
			return (ISoUserValue[]) result.toArray(new ISoUserValue[0]);
		}
		return new SoUserBean[0];
	}

	public int getSoUserCountByCustId(long custId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public ISoUserValue[] getSoUsersByAcctId(long acctId, int payType, int startNum, int endNum) throws Exception {
		IQUserRelInfoValue[] insUserValues = getCrmFSV().getUsersByAcctId(acctId, payType, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(insUserValues)) {
			ISoUserValue[] soUserValues = new SoUserBean[insUserValues.length];
			for (int i = 0; i < soUserValues.length; i++) {
				soUserValues[i] = new SoUserBean();
				soUserValues[i].copy(insUserValues[i]);
			}
			return soUserValues;
		}
		return new SoUserBean[0];
	}

	public int getSoUserCountByAcctId(long acctId, int payType) throws Exception {
		return getCrmFSV().getUsersCountByAcctId(acctId, payType);
	}

	public ISoAccrelValue getSoAccrelById(long acctRelateId) throws Exception {
		IInsAccrelValue accrelValue = getInstanceQrySV().getInstAccrelByRelatId(acctRelateId);
		if (accrelValue != null) {
			ISoAccrelValue soAccrelValue = new SoAccrelBean();
			soAccrelValue.copy(accrelValue);
			return soAccrelValue;
		}
		return null;
	}

	public ISoAccrelValue[] getSoAccrelsByAcctId(long acctId, int payType, int startNum, int endNum) throws Exception {
		IInsAccrelValue[] accrelValues = getInstanceQrySV().getInstAccrelByAcctId(acctId, payType, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(accrelValues)) {
			ISoAccrelValue[] soAccrelValues = new SoAccrelBean[accrelValues.length];
			for (int i = 0; i < soAccrelValues.length; i++) {
				soAccrelValues[i] = new SoAccrelBean();
				soAccrelValues[i].copy(accrelValues[i]);
			}
			return soAccrelValues;
		}
		return new SoAccrelBean[0];
	}

	public int getSoAccrelCountByAcctId(long acctId, int payType) throws Exception {
		return getInstanceQrySV().getInstAccrelByAcctIdCount(acctId, payType);
	}

	public ISoAccrelValue[] getSoAccrelsByUserId(long userId, int payType, int startNum, int endNum) throws Exception {
		IInsAccrelValue[] accrelValues = getInstanceQrySV().getInstAccrelByUserId(userId, payType);
		if (CmCommonUtil.isNotEmptyObject(accrelValues)) {
			ISoAccrelValue[] soAccrelValues = new SoAccrelBean[accrelValues.length];
			for (int i = 0; i < soAccrelValues.length; i++) {
				soAccrelValues[i] = new SoAccrelBean();
				soAccrelValues[i].copy(accrelValues[i]);
			}
			return soAccrelValues;
		}
		return new SoAccrelBean[0];
	}

	public int getSoAccrelCountByUserId(long userId, int payType) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public ISoAccrelValue[] getSoAccrelsByBillId2(String billId, int payType, int startNum, int endNum) throws Exception {
		IInsUserValue insUserValue = getInstanceQrySV().getInstUserByBillId(billId);
		if (insUserValue != null) {
			IInsAccrelValue[] accrelValues = getInstanceQrySV().getInstAccrelByUserId(insUserValue.getUserId(), payType);
			if (CmCommonUtil.isNotEmptyObject(accrelValues)) {
				ISoAccrelValue[] soAccrelValues = new SoAccrelBean[accrelValues.length];
				for (int i = 0; i < soAccrelValues.length; i++) {
					soAccrelValues[i] = new SoAccrelBean();
					soAccrelValues[i].copy(accrelValues[i]);
				}
				return soAccrelValues;
			}
		}
		return new SoAccrelBean[0];
	}

	// xiaozb专用,可以查询销户的用户
	public ISoAccrelValue[] getSoAccrelsByBillId(String billId, int payType, int startNum, int endNum) throws Exception {
		IInsUserValue[] insUserValues = getInstanceQrySV().getInstUserByBillId(billId, -99);
		if (insUserValues != null && insUserValues.length > 0) {
			IInsAccrelValue[] accrelValues = null;
			if (insUserValues[0].getState().equals(RBossConst.USER_STATE_ACCT_DESTROY) || insUserValues[0].getState().equals(RBossConst.USER_STATE_SO_DESTROY)
					|| insUserValues[0].getState().equals(RBossConst.USER_STATE_TK_DESTROY)) {
				accrelValues = getInstanceQrySV().getInstAccrelByUserId(insUserValues[0].getUserId(), payType, OrderConst.VALID_TYPE_EXPIRED);
			} else {
				accrelValues = getInstanceQrySV().getInstAccrelByUserId(insUserValues[0].getUserId(), payType, OrderConst.VALID_TYPE_NOW);
			}
			if (CmCommonUtil.isNotEmptyObject(accrelValues)) {
				ISoAccrelValue[] soAccrelValues = new SoAccrelBean[accrelValues.length];
				for (int i = 0; i < soAccrelValues.length; i++) {
					soAccrelValues[i] = new SoAccrelBean();
					soAccrelValues[i].copy(accrelValues[i]);
				}
				return soAccrelValues;
			}
		}
		return new SoAccrelBean[0];
	}

	public int getSoAccrelCountByBillId(String billId, int payType) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean checkSecEntityPermission(long operId, long entId, long privId) throws Exception {
		return SecframeClient.checkEntityPermission(operId, entId, privId);
	}

	public IBOSecStaffValue getSecStaffById(long staffId) throws Exception {
		return OrgmodelClient.getStaffById(staffId);
	}

	public IBOSecStaffValue[] getSecStaffByStaffIds(long[] staffIds) throws Exception {
		return OrgmodelClient.getStaffByStaffIds(staffIds);
	}

	public IBOSecStaffValue[] getSecStaffByOrgId(long orgId) throws Exception {
		// return OrgmodelClient.getManagerStaffsByOrgId(orgId);
		return new IBOSecStaffValue[0];
	}

	public void sendCustInfo2Boss(IVOCustValue custValue) throws Exception {
		IVOAccountValue voAccountValue = custValue.getAccounts()[0];
		String operType = CmCommonUtil.isEmptyObj(voAccountValue.getUserObject("OPER_TYPE")) ? "" : voAccountValue.getUserObject("OPER_TYPE").toString();
		IAccountValue accountValue = voAccountValue.getAccount();
		long aBusinessId = 0;
		int state = 0;
		long acctId = accountValue.getAcctId();
		if (accountValue.isDeleted()) {
			aBusinessId = CmConstants.MODIFY_ACCT_MODEL.ACCT_DEL;
			state = OrderConst.DATA_DELETE_STATE;
		} else if (StringUtils.isNotBlank(operType) && CmConstants.MODIFY_ACCT_MODEL.ACCT_OPER_TYPE_MODIFY.equalsIgnoreCase(operType)) {
			aBusinessId = CmConstants.MODIFY_ACCT_MODEL.ACCT_MOD;
			state = OrderConst.DATA_MODIFY_STATE;
		} else if (StringUtils.isNotBlank(operType) && CmConstants.MODIFY_ACCT_MODEL.ACCT_OPER_TYPE_NEW.equalsIgnoreCase(operType)) {
			aBusinessId = CmConstants.MODIFY_ACCT_MODEL.ACCT_NEW;
			state = OrderConst.DATA_NEW_STATE;
		} else {
			state = OrderConst.DATA_OLD_STATE;
		}
		HashMap aIDataEKEL = new HashMap();
		accountValue = CmServiceFactory.getAccountSV().queryAccountById(acctId);
		aIDataEKEL.put("DONE_CODE", Long.valueOf(ServiceManager.getDoneCode()));
		aIDataEKEL.put("DONE_DATE", accountValue.getDoneDate());
		aIDataEKEL.put("REGION_ID", accountValue.getRegionId());
		aIDataEKEL.put("ORG_ID", Long.valueOf(accountValue.getOrgId()));
		aIDataEKEL.put("OP_ID", Long.valueOf(accountValue.getOpId()));
		// 封装账户map
		Map acctMap = new HashMap();
		acctMap.put("ACCT_ID", Long.valueOf(acctId));
		acctMap.put("STATE", Integer.valueOf(state));
		aIDataEKEL.put("CM_ACCOUNT", acctMap);
		// ServiceFactory.getCrossCenterService();
		// ucm2CrmFSV.unifybilling(aBusinessId, aIDataEKEL);
	}

	public void sendCustInfo2Billing(IVOCustValue custValue, String regionId) throws Exception {
		IInterfaceBillCrmSV billingSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
		billingSV.sendCustOrderInfoToBilling(custValue, regionId);
	}

	public void sendMapOrderInfoToBilling(Map map) throws Exception {
		IInterfaceBillCrmSV billingSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
		billingSV.sendMapOrderInfoToBilling(map);
	}

	public Map getGroupScoreByCustId(long custId) throws Exception {
		// IScoreFSV scoreFSV = (IScoreFSV) ServiceFactory.getService(IScoreFSV.class);
		// return scoreFSV.getGroupScoreByCustId(custId);
		return null;
	}

	public String[] getBillIdByAcctId(long acctId, int payType) throws Exception {
		/*
		 * String regionId = ""; if (CenterFactory.isSetCenterInfo()) { regionId =
		 * CenterFactory.getCenterInfo().getRegion(); } else { regionId = ((ICommonSV)
		 * ServiceFactory.getService(ICommonSV.class)).getRegionIdByNewUser(); } return
		 * getCrmQrySV().getBillIdByAcctId(acctId, regionId, payType);
		 */
		return new String[0];
	}

	public Map getProdSpecByBillId(String billId, int validType) throws Exception {
		// return getCrmQrySV().getProdSpecByBillId(billId, validType);
		return null;
	}

	public Map getOsStatusType(String billId) throws Exception {
		// return getCrmQrySV().getOsStatusType(billId);
		return null;
	}

	public IBOSecStaffValue[] getManagerByOrgId(long orgId, int startNum, int endNum) throws Exception {
		// return OrgmodelClient.getManagerByOrgId(orgId, startNum, endNum);
		return new IBOSecStaffValue[0];
	}

	public int getManagerCountByOrgId(long orgId) throws Exception {
		// return OrgmodelClient.getManagerCountByOrgId(orgId);
		return 0;
	}

	public IBOSecOrganizeValue getSecOrganizeByOrgId(long organizeId) throws Exception {
		return OrgmodelClient.getSecOrganizeById(organizeId);
	}

	public IBOSecOperatorValue getSecOperatorById(long opId) throws Exception {
		return OrgmodelClient.getOperatorById(opId);
	}

	public IQBOSecOrgStaffOperValue getOperQBOByOperId(long operId) throws Exception {
		return OrgmodelClient.getOperQBOByOperId(operId);
	}

	public void reduceScore(long userId, long totalScore, String reason, int codeType) throws Exception {
		// ((IScoreCMSV) ServiceFactory.getService(IScoreCMSV.class)).deductScore(userId, totalScore, reason,codeType);
	}

	public String getUserStatusTypeByUserId(long userId, int validType) throws Exception {
		// return getCrmQrySV().getUserStatusTypeByUserId(userId, validType);
		return null;
	}

	public IBOSecRoleGrantValue[] getEntitysByOperatorId(long operId) throws Exception {
		return SecframeClient.getEntitysByOperatorId(operId);
	}

	public IBOSecEntityValue[] getSecEntitysByEntClassId(int classId) throws Exception {
		return SecframeClient.getEntitysByEntClassId(classId);
	}

	public IBOSecPrivValue[] getSecPrivByEntClassId(int classId) throws Exception {
		return SecframeClient.querySecPriv(null, classId);
	}

	public IBOSecPrivValue getSecPrivByPrivId(long privId) throws Exception {
		String condition = IBOSecPrivValue.S_PrivId + " = :privId ";
		Map map = new HashMap();
		map.put("privId", privId);
		IBOSecPrivValue[] privValues = SecframeClient.querySecPriv(condition, map);
		if (CmCommonUtil.isNotEmptyObject(privValues)) {
			return privValues[0];
		}
		return null;
	}

	public IBOSecEntityValue getSecEntityByEntId(long entId) throws Exception {
		return SecframeClient.getEntityByEntId(entId);
	}

	public void sendSms(String billId, String smsContent) throws Exception {
		if (StringUtils.isBlank(billId) || StringUtils.isBlank(smsContent)) {
			// 数据有误，请检查!
			ExceptionUtil.throwBusinessException("CMS0030186");
		}
		HashMap<String, String> sendPackage = new HashMap<String, String>();
		sendPackage.put("smsContent", smsContent);
		CmCommonUtil.sendMsm("CM_BP_NOTIFICATION", sendPackage, billId, -1, -1);
	}

	public long createGroupScAcct(long custId, String remarks) throws Exception {
		// return getScoreSV().createGroupScAcct(custId, remarks);
		return 0;
	}

	public void invalidGroupScAcct(long custId) throws Exception {
		// getScoreSV().invalidGroupScAcct(custId);
	}

	public long getIndivScoreByUserId(long userId) throws Exception {
		// long s = ((IScoreCMSV) ServiceFactory.getService(IScoreCMSV.class)).getUserScoreByUserId(userId);
		return -1;
	}

	public String getUserStatusTypeByUserId(long userId) throws Exception {
		// return getCrmQrySV().getUserStatusTypeByUserId(userId, -1);
		return null;
	}

	public ConfirmResultDataBean innetClearScore(CustInfoMoveRspDataBean inBean) throws Exception {
		// IScore2CbossFSV scoreFSV = (IScore2CbossFSV) ServiceFactory.getService(IScore2CbossFSV.class);
		// return scoreFSV.innetClearScore(inBean);
		return null;
	}

	public TransferResultDataBean transferScore(CustScoreAndGradeInfoDataBean custData) throws Exception {
		/*
		 * IScore2CbossFSV scoreFSV = (IScore2CbossFSV) ServiceFactory.getService(IScore2CbossFSV.class); return
		 * scoreFSV.transferScore(custData);
		 */
		return null;
	}

	public boolean getIsCloseByAccountId(long accountId) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	public void saveSoBusiLog(ICmBusiLogValue mainBusiLogValue) throws Exception {
		IBOSoBusiLogValue busiLogValue = new BOSoBusiLogBean();
		busiLogValue.setAcctId(busiLogValue.getAcctId());
		busiLogValue.setActionState(mainBusiLogValue.getOperType());
		busiLogValue.setBillId(mainBusiLogValue.getBillId());
		busiLogValue.setBusiDetail(mainBusiLogValue.getBusiDetail());
		busiLogValue.setBusinessId(mainBusiLogValue.getBusinessId());
		busiLogValue.setChannelType(mainBusiLogValue.getChannelType());
		busiLogValue.setCreateDate(mainBusiLogValue.getCreateDate());
		busiLogValue.setCustId(mainBusiLogValue.getCustId());
		busiLogValue.setDoneCode(mainBusiLogValue.getDoneCode());
		busiLogValue.setDoneDate(mainBusiLogValue.getDoneDate());
		busiLogValue.setEffectiveDate(mainBusiLogValue.getEffectiveDate());
		busiLogValue.setExpireDate(mainBusiLogValue.getExpireDate());
		busiLogValue.setHasChild("");
		busiLogValue.setOperType("");
		busiLogValue.setOpId(mainBusiLogValue.getOpId());
		busiLogValue.setOrgId(mainBusiLogValue.getOrgId());
		busiLogValue.setSourceType("CM");
		// ISoBusiSV soBusiSV = (ISoBusiSV) ServiceFactory.getService(ISoBusiSV.class);
		// soBusiSV.addBusiLog(busiLogValue);
	}

}
