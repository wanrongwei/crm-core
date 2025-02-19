package com.asiainfo.crm.cm.teaminvoke.in.service.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.asiainfo.crm.inter.sms.service.interfaces.SMSConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.common.service.interfaces.CenterConst;
import com.ai.omframe.instance.ivalues.IInsUserOsStateValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.service.interfaces.IInstanceQrySV;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecStaffValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecEntityValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecPrivValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecRoleGrantValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmInsAccrelValue;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV;
import com.asiainfo.crm.cm.model.bo.SoUserBean;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.teaminvoke.in.factory.CmInterAdapterFactory;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.inter.sms.so.service.interfaces.ISoSmsPendingSV;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.exe.remote.third.ConfirmResultDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustInfoMoveRspDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustScoreAndGradeInfoDataBean;
import com.asiainfo.crm.so.exe.remote.third.TransferResultDataBean;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IStopOpenOsStatusSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class CmTeamInvokeSVImpl implements ICmTeamInvokeSV {

	private static transient Log log = LogFactory.getLog(CmTeamInvokeSVImpl.class);

	public DataContainer[] queryBceFieldDefine(long busiId, String userParam) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().queryBceFieldDefine(busiId, userParam);
	}

	public ISoUserValue getSoUserByUserId(long userId) throws Exception {
		IInstanceQrySV sv = (IInstanceQrySV) ServiceFactory.getService(IInstanceQrySV.class);
		IInsUserValue[] results = sv.getInstUserByUserId(userId, OrderConst.VALID_TYPE_NOW);
		if (results == null || results.length == 0) {
			return null;
		}
		ISoUserValue userValue = new SoUserBean();
		userValue.copy(results[0]);
		return userValue;
	}

	public ISoUserValue getSoUserByBillId(String billId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoUserByBillId(billId);
	}

	public IBOUserInfoValue queryUserInfoByBillId(String billId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().queryUserInfoByBillId(billId);
	}

	public ISoUserValue[] getSoUsersByCustId(long custId, int startNum, int endNum) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoUsersByCustId(custId, startNum, endNum);
	}

	public int getSoUserCountByCustId(long custId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoUserCountByCustId(custId);
	}

	public ISoUserValue[] getSoUsersByAcctId(long acctId, int payType, int startNum, int endNum) throws Exception {
		ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		IBOCmInsAccrelValue[] vals = sv.getInsAccrelsByAcctFor360(acctId, payType, startNum, endNum);
		if (vals != null && vals.length > 0) {
			ISoUserValue[] soUserValue = new ISoUserValue[vals.length];
			for (int i = 0; i < soUserValue.length; i++) {
				soUserValue[i] = new SoUserBean();
				soUserValue[i].copy(vals[i]);
				String billId = String.valueOf(vals[i].getDispalyAttr("USER_ID", "USER_ID"));
				soUserValue[i].setBillId(billId);
			}
			return soUserValue;
		}
		return new ISoUserValue[0];
	}

	public int getSoUserCountByAcctId(long acctId, int payType) throws Exception {
		ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		return sv.getInsAccrelsCountByAcctFor360(acctId, payType);
	}

	public ISoAccrelValue getSoAccrelById(long acctRelateId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoAccrelById(acctRelateId);
	}

	public ISoAccrelValue[] getSoAccrelsByAcctId(long acctId, int payType, int startNum, int endNum) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoAccrelsByAcctId(acctId, payType, startNum, endNum);
	}

	public int getSoAccrelCountByAcctId(long acctId, int payType) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoAccrelCountByAcctId(acctId, payType);
	}

	public ISoAccrelValue[] getSoAccrelsByUserId(long userId, int payType, int startNum, int endNum) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoAccrelsByUserId(userId, payType, startNum, endNum);
	}

	public int getSoAccrelCountByUserId(long userId, int payType) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoAccrelCountByUserId(userId, payType);
	}

	public ISoAccrelValue[] getSoAccrelsByBillId(String billId, int payType, int startNum, int endNum) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoAccrelsByBillId(billId, payType, startNum, endNum);
	}

	public ISoAccrelValue[] getSoAccrelsByBillId2(String billId, int payType, int startNum, int endNum) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoAccrelsByBillId2(billId, payType, startNum, endNum);
	}

	public int getSoAccrelCountByBillId(String billId, int payType) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSoAccrelCountByBillId(billId, payType);
	}

	public boolean checkSecEntityPermission(long operId, long entId, long privId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().checkSecEntityPermission(operId, entId, privId);
	}

	public IBOSecStaffValue getSecStaffById(long staffId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecStaffById(staffId);
	}

	public IBOSecStaffValue[] getSecStaffByStaffIds(long[] staffIds) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecStaffByStaffIds(staffIds);
	}

	public IBOSecStaffValue[] getSecStaffByOrgId(long orgId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecStaffByOrgId(orgId);
	}

	public void sendCustInfo2Boss(IVOCustValue custValue) throws Exception {
		CmInterAdapterFactory.getInstance().getService().sendCustInfo2Boss(custValue);
	}

	public void sendCustInfo2Billing(IVOCustValue custValue, String regionId) throws Exception {
		CmInterAdapterFactory.getInstance().getService().sendCustInfo2Billing(custValue, regionId);
	}

	public void sendMapOrderInfoToBilling(Map map) throws Exception {
		CmInterAdapterFactory.getInstance().getService().sendMapOrderInfoToBilling(map);
	}

	public Map getGroupScoreByCustId(long custId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getGroupScoreByCustId(custId);
	}

	public String[] getBillIdByAcctId(long acctId, int payType) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getBillIdByAcctId(acctId, payType);
	}

	public Map getProdSpecByBillId(String billId, int validType) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getProdSpecByBillId(billId, validType);
	}

	public Map getOsStatusType(String billId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getOsStatusType(billId);
	}

	public IBOSecStaffValue[] getManagerByOrgId(long orgId, int startNum, int endNum) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getManagerByOrgId(orgId, startNum, endNum);

	}

	public int getManagerCountByOrgId(long orgId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getManagerCountByOrgId(orgId);
	}

	public IBOSecOrganizeValue getSecOrganizeByOrgId(long organizeId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecOrganizeByOrgId(organizeId);
	}

	public IBOSecOperatorValue getSecOperatorById(long opId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecOperatorById(opId);
	}

	public IQBOSecOrgStaffOperValue getOperQBOByOperId(long operId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getOperQBOByOperId(operId);
	}

	public IBOSecEntityValue getSecEntityByEntId(long entId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecEntityByEntId(entId);
	}

	public IBOSecPrivValue getSecPrivByPrivId(long privId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecPrivByPrivId(privId);
	}

	public IBOSecPrivValue[] getSecPrivByEntClassId(int classId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecPrivByEntClassId(classId);
	}

	public IBOSecEntityValue[] getSecEntitysByEntClassId(int classId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getSecEntitysByEntClassId(classId);
	}

	public IBOSecRoleGrantValue[] getEntitysByOperatorId(long operId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getEntitysByOperatorId(operId);
	}

	public void sendSms(String billId, String smsContent) throws Exception {
		CmInterAdapterFactory.getInstance().getService().sendSms(billId, smsContent);
	}

	public long createGroupScAcct(long custId, String remarks) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().createGroupScAcct(custId, remarks);
	}

	public void invalidGroupScAcct(long custId) throws Exception {
		CmInterAdapterFactory.getInstance().getService().invalidGroupScAcct(custId);
	}

	public void reduceScore(long userId, long totalScore, String reason, int codeType) throws Exception {
		CmInterAdapterFactory.getInstance().getService().reduceScore(userId, totalScore, reason, codeType);
	}

	public long getIndivScoreByUserId(long userId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getIndivScoreByUserId(userId);
	}

	public String getUserStatusTypeByUserId(long userId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getUserStatusTypeByUserId(userId);
	}

	public ConfirmResultDataBean innetClearScore(CustInfoMoveRspDataBean inBean) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().innetClearScore(inBean);
	}

	public TransferResultDataBean transferScore(CustScoreAndGradeInfoDataBean custData) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().transferScore(custData);
	}

	public String getUserStatusTypeByUserId(long userId, int validType) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getUserStatusTypeByUserId(userId, validType);
	}

	public boolean getIsCloseByAccountId(long accountId) throws Exception {
		return CmInterAdapterFactory.getInstance().getService().getIsCloseByAccountId(accountId);
	}

	public void saveSoBusiLog(ICmBusiLogValue mainBusiLogValue) throws Exception {
		CmInterAdapterFactory.getInstance().getService().saveSoBusiLog(mainBusiLogValue);
	}

	public IInsUserValue getInsUser(long userId, String billId) throws Exception {
		ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return crmFSV.getInsUser(userId, billId);
	}

	public void updateInsDataForAcctZQChg(long acctId, int oldZhangqi, int newZhangqi, int validType) throws Exception {
		ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		crmFSV.updateInsDataForAcctZQChg(acctId, oldZhangqi, newZhangqi, validType);
	}

	public IQUserBaseInfoValue getUserBaseInfoByBillId(String billId) throws Exception {
		ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return crmFSV.getUserBaseInfoByBillId(billId);
	}

	public IQUserBaseInfoValue getUserBaseInfoByUserId(long userId) throws Exception {
		ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return crmFSV.getUserBaseInfoByUserId(userId);
	}

	public void changeEnturstUser(long acctId) throws Exception {
		// IAm2CustFSV iAm2CustFSV = (IAm2CustFSV) ServiceFactory.getService(IAm2CustFSV.class);
		// iAm2CustFSV.changeEnturstUser(acctId);
	}

	// 判断用户账户是否欠费
	public boolean decideAccoutCost(long acctId) throws Exception {
		boolean leap = true;// 未欠费
		// IAm2CustFSV iAm2CustFSV = (IAm2CustFSV) ServiceFactory.getService(IAm2CustFSV.class);
		Map map = null;// iAm2CustFSV.getAcctFeeInfoByAcctId(acctId);
		long balance = -1;
		if(null!=map){
			if (map.get("balance") != null) {
				balance = Long.valueOf(map.get("balance").toString());
			}
		}
		if (balance < 0) {
			leap = false;// 欠费
		}
		return leap;
	}

	public long getAcctFeeByBillId(String billId) throws Exception {
		// IAm2CustFSV iAm2CustFSV = (IAm2CustFSV) ServiceFactory.getService(IAm2CustFSV.class);
		// return iAm2CustFSV.getAcctFeeByBillId(billId);
		return -1;
	}

	public Map getAcctFeeInfoByAcctId(long acctId) throws Exception {
		// IAm2CustFSV iAm2CustFSV = (IAm2CustFSV) ServiceFactory.getService(IAm2CustFSV.class);
		// return iAm2CustFSV.getAcctFeeInfoByAcctId(acctId);
		return null;
	}

	public boolean hasUserAppBalRec(long userId, long acctId) throws Exception {
		// IAm2CustFSV iAm2CustFSV = (IAm2CustFSV) ServiceFactory.getService(IAm2CustFSV.class);
		// return iAm2CustFSV.hasUserAppBalRec(userId, acctId);
		return false;
	}

	public List groupQueryByBillIdCustId(String billId, String custId) throws Exception {
		ICrmFSV icrmFsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return icrmFsv.groupQueryByBillIdCustId(billId, custId);
	}

	public Map unifiedGroupQuery(String billId, String custId) throws Exception {
		ICrmFSV icrmFsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return icrmFsv.unifiedGroupQuery(billId, custId);
	}

	public long queryVpmnIdByCustId(long custId) throws Exception {
		ICrmFSV icrmFsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return icrmFsv.queryVpmnIdByCustId(custId);
	}

	public Map updateUserPassword(String serviceNum, int isVerifyOldPwd, String oldPwd, String newPwd, int isVerifyCertCard, String certCardType, String certCardCode,
			int isSMSNotify) throws Exception, RemoteException {
		ICrmFSV iCrmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return iCrmFSV.updateUserPassword(serviceNum, isVerifyOldPwd, oldPwd, newPwd, isVerifyCertCard, certCardType, certCardCode, isSMSNotify);
	}

	public void changeCreditPlan(long acctId) throws Exception {
		// IAm2CustFSV am2CustFSV = (IAm2CustFSV) ServiceFactory.getService(IAm2CustFSV.class);
		// am2CustFSV.changeCreditPlan(acctId, -1, -1, null, null, -1, null, null, null);
	}

	public void saveSmsPendings(HashMap[] smsMaps) throws Exception {
		ISoSmsPendingSV iCrmFSV = (ISoSmsPendingSV) ServiceFactory.getService(ISoSmsPendingSV.class);
		iCrmFSV.saveSmsPendings(SMSConstants.SMS_BATCH_PENDING, smsMaps);
	}

	public boolean isAcctOweInfoFree(long acctId) throws Exception {
		boolean leap = true;
		Map parameter = null;// ((IAm2CustFSV)
								// ServiceFactory.getService(IAm2CustFSV.class)).getAcctOweInfoByAcctId(acctId, false);
		long hisOweFee =0L; 
		if(null!=parameter){	
			hisOweFee=Long.valueOf(parameter.get("hisOweFee").toString());
		}
		if (hisOweFee > 0) {
			leap = false;
		}
		return leap;
	}

	// 0:开机,1:停机
	public boolean isUserOsState(String billId) throws Exception {
		boolean leap = true;
		ICrmFSV icrmFsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		int billState = icrmFsv.queryUserOsState2CM(billId);
		if (billState == 1) {
			leap = false;
		}
		return leap;
	}

	// 0:开机,1:停机
	public boolean isUserOsStateByUserId(long userId) throws Exception {
		IStopOpenOsStatusSV stopOpenOsStatusSV = (IStopOpenOsStatusSV) ServiceFactory.getService(IStopOpenOsStatusSV.class);
		String result = "";
		if (userId != -1) {
			result = stopOpenOsStatusSV.getOsStatusValue(userId, OrderConst.VALID_TYPE_NOW);
		}
		if (result.indexOf("1") < 0) {
			return true;// 正常开机
		}
		return false;// 停机
	}

	public Map upCbossForVipCard(Map vipcard) throws Exception {
		// IUpCbossBusiSV upcboss = (IUpCbossBusiSV) ServiceFactory.getService(IUpCbossBusiSV.class);
		// return upcboss.upCbossForVipCard(vipcard);
		return null;
	}

	public IInsUserOsStateValue getUserOutState(String billId, int memberType) throws Exception {
		IInsUserOsStateValue value = null;
		if (memberType == 1) {
			ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
			CenterFactory.setCenterInfoByTypeAndValue(CenterConst.BILL_ID, billId);
			value = crmFSV.getInstUserOsStateValueByBillId(billId);
		}
		return value;
	}

	public String getOsStatusAndTime(String osFlag, IInsUserOsStateValue insUserOsState) throws Exception, RemoteException {
		ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		String sStatuString = crmFSV.getOsStatusAndTime(osFlag, insUserOsState);
		return sStatuString;
	}

	public int getUserNetAge(String billId) throws Exception, RemoteException {
		ICrmFSV icrmFsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return icrmFsv.getUserNetAge(billId);
	}

	// 判断是否订购集团业务
	public boolean isUserByCustIdState(long grpCustId) throws Exception {
		ICrmFSV icrmFsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		IInsUserValue[] iUserValues = icrmFsv.getInstUserByCustId(grpCustId);
		if (iUserValues == null || iUserValues.length <= 0) {
			return true;
		}
		log.info("Order of business :" + grpCustId + "Usually the group's business");
		return false;
	}

	public long getCustIdByVpmnId(String vpmnId) throws Exception {
		return -1;
	}

	public DataContainerInterface[] getGroupVpmnRelationByVpmnId(String vpmnId) throws Exception {
		ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return crmFSV.getGroupVpmnRelationByVpmnId(vpmnId);
	}

	public String getVpmnIdByCustId(long custId, String regionId) throws Exception {
		return null;
	}

	public List queryGroupCustIdByBillId(String billId) throws Exception, RemoteException {
		return null;
	}

	public boolean unifiedGroupCustQuery(String billId, long custId) throws Exception {
		ICrmFSV crmFsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return crmFsv.unifiedGroupCustQuery(billId, custId);
	}
}
