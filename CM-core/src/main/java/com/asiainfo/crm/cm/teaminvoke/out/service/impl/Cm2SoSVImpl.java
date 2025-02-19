package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

import com.asiainfo.crm.util.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.comframe.vm.common.Constant;
import com.ai.common.i18n.BusinessException;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.bill.teaminvoke.out.interfaces.IInterfaceBillCrmSV;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustOrganizeQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmInsCmrelBean;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmGroupPartyValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoHValue;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctBillFormatBean;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctContactBean;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctSubStatusBean;
import com.asiainfo.crm.cm.dk.bo.BOCmPayChannelBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmAcctBillFormatValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmAcctContactValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmBillingAcctValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPayChannelValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmAcctSubStatusSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmBillingAcctSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDKAccountSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumPojoBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICMCustAdditionalInfoDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmContactContMediumInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.party.bo.BOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmIndivPartyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.bo.BOCmInsAccrelEngine;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmInsAccrelValue;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV;
import com.asiainfo.crm.cm.ln.common.bo.BOLnCmInsCmRelBean;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOCustAddressBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.bo.AcctAgreemnetRelBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.bo.CmBusiLogBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.bo.PartyRoleBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctAgreemnetRelValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyRoleValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.support.bce.service.interfaces.ICmAccountBceDealSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2InterFSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class Cm2SoSVImpl implements ICm2SoSV {
	public Map queryGroupOrgUpSegmentByRelCustId(Map inMap) throws Exception {
		// SAP 正在使用这个接口 2016-01-12 20:26
		long CustId = Long.valueOf((String) inMap.get("CustId"));
		if (CustId <= 0) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		Map returnMap = new HashMap();

		ICmCustSegmentRelaSV segSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue segRelValue = segSV.querySegmentRelaByCustId(CustId);
		if (segRelValue != null) {
			ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
			IBoCmCustSegmentValue segValue = sv.querySegmentByIdfromCache(segRelValue.getSegmentId());
			returnMap.put("segment", segValue);
			returnMap.put("segmentrel", segRelValue);

		}
		return returnMap;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#
	 * queryCustContactMediaByCond(long, java.util.List, java.lang.String)
	 */
	public Map queryCustContactMediaByCond(long custId, List conMedTypeIds, String districtId) throws Exception {
		Map map = null;
		if (custId <= 0) {
			ExceptionUtil.throwBusinessException("CMC0094009");
		} else if (StringUtils.isBlank(districtId)) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		} else {
			if (!conMedTypeIds.isEmpty()) {
				map = new HashMap();
				long mediumType = -1;
				long addressId = -1;
				for (int i = 0; i < conMedTypeIds.size(); i++) {
					ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					mediumType = Long.parseLong(String.valueOf(conMedTypeIds.get(i)));
					IQBOCmCustContMediumAndTypeValue[] vals = sv.queryCustContactMediums(custId, mediumType, -1, -1, -1);
					if (vals != null && vals.length > 0) {
						addressId = vals[0].getAddressId();
						IAddressSV assdrssSv = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
						address address = assdrssSv.getAddress(addressId, districtId);
						map.put(mediumType, address);
					}
				}
			}
		}
		return map;
	}

	public Map queryCustElectronicContactMediaByCond(long custId, List conMedTypeIds) throws Exception {
		Map<String, IBOCmCustContactMediumValue> map = new HashMap<String, IBOCmCustContactMediumValue>();
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		for (int i = 0; i < conMedTypeIds.size(); i++) {
			String typeId = String.valueOf(conMedTypeIds.get(i));
			IBOCmCustContactMediumValue value = sv.queryCustContactMediumByCustIdAndType(custId, typeId);
			map.put(typeId, value);
		}
		return map;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#
	 * getInsAccrelsByAcct(long, int, int)
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int startIdx, int endIdx) throws Exception {
		ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		return sv.getInsAccrelsByAcct(acctId, payType, startIdx, endIdx);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#
	 * getInsAccrelsCountByAcct(long)
	 */
	public int getInsAccrelsCountByAcct(long acctId, long payType) throws Exception {
		ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		return sv.getInsAccrelsCountByAcct(acctId, payType);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#saveInsAccrel
	 * (com.asiainfo.crm.cm.ln.account.ivalues .IBOCmInsAccrelValue, long)
	 */
	public void saveInsAccrel(IBOCmInsAccrelValue val, long operation) throws Exception {
		ICmLnAccountSV sv = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		sv.saveInsAccrel(val, operation);

	}

	public IAccountProfileValue getAccountById(long acctId, String reginId) throws Exception {
		ICmAccountSV sv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		if (reginId == null || reginId.equals("")) {
			reginId = CmCommonUtil.getDefaultRegionId();
		}
		IAccountProfileValue[] vals = sv.queryAcctDtsByIds(new long[] { acctId }, reginId);
		if (vals != null && vals.length > 0) {
			return vals[0];
		}
		return null;
	}

	public IVOCustValue queryIndivCustByNumber(String serviceNumber, int relaType) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.queryIndivCustByNumber(serviceNumber, relaType);
	}

	public IAccountProfileValue getAllAccountById(long acctId, String regionId) throws Exception {
		ICmAccountSV sv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountProfileValue[] vals = sv.queryAllAcctDtsByIds(new long[] { acctId }, regionId);
		if (vals != null && vals.length > 0) {
			return vals[0];
		}
		return null;

	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#
	 * updateCustCreditInfo(java.util.Map)
	 */
	public void updateCustCreditInfo(Map map) throws Exception {
		if (map == null) {
			ExceptionUtil.throwBusinessException("CMS0403001", new String[] { "map" });
		} else {
			Map transactXmlDataMap = (Map) map.get("TransactXmlData");
			Map transactMap = (Map) transactXmlDataMap.get("TransactData");
			Map result = (Map) transactMap.get("RESULTS");
			Object cprCvrKey = result.get("Cpr_cvr_key");
			if (cprCvrKey != null) {
				String innerprCvrKey = String.valueOf(cprCvrKey);
				String creditLevel = String.valueOf(result.get("Recommended_credit_class"));// 信用度等级
				String creditValue = String.valueOf(result.get("Recommended_invoice_credit_limit"));// 信用度额度
				ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				if (innerprCvrKey.startsWith("R")) {// CPR NUMBER
					long custId = Long.parseLong(String.valueOf(map.get("CUST_ID")));
					IBOCmIndivCustomerValue cmIndivCustVal = cmCustomerSV.queryIndivCustomerInfo(custId);
					if (cmIndivCustVal != null) {
						ICustomerValue customerVal = new CustomerBean();
						customerVal.copy(cmIndivCustVal);
						customerVal.setCreditLevel(creditLevel);
						if (StringUtils.isNotBlank(creditValue)) {
							customerVal.setCreditValue(Long.parseLong(creditValue));
						}
						customerVal.setCustType(CmConstants.CustomerType.INDIVIDUAL);
						cmCustomerSV.saveCustomer(customerVal);

					}
				} else if (innerprCvrKey.startsWith("B")) {// CVR NUMBER
					ICustomerValue custVal = cmCustomerSV.queryCustomerByCustId(DataType.getAsLong(map.get("CUST_ID")));
					custVal.setCreditLevel(creditLevel);
					if (StringUtils.isNotBlank(creditValue)) {
						custVal.setCreditValue(Long.parseLong(creditValue));
					}
					cmCustomerSV.saveCustomer(custVal);
				} else {
					// do nothing
				}
			}
		}

	}

	public IBOCmCustSegmentRelaValue queryCmCustSegmentRelaInfo(long custId) throws Exception {
		if (custId > 0) {
			StringBuffer condition = new StringBuffer(" 1=1 ");
			HashMap parameter = new HashMap();
			condition.append(" AND ").append(IBOCmCustSegmentRelaValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
			IBOCmCustSegmentRelaValue[] values = (IBOCmCustSegmentRelaValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustSegmentRelaBean.class,
					condition.toString(), parameter, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
				IBoCmCustSegmentValue val = sv.querySegmentByIdfromCache(values[0].getSegmentId());
				if (val != null) {
					values[0].setNoticePeriod(val.getNoticePeriod());
					values[0].setNotifyType(val.getNotifyType());
				}
				return values[0];
			}
		}
		return null;
	}

	public void ChangeCmInsStateToDelete(long userId, long[] custIds) throws Exception {
		if (userId > 0 && custIds != null && custIds.length > 0) {
			StringBuffer condition = new StringBuffer(" 1=1 ");
			HashMap parameter = new HashMap();
			ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			for (int m = 0; m < custIds.length; m++) {
				if (custIds[m] > 0) {
					condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
					parameter.put("userId", userId);
					condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
					parameter.put("CUST_ID", custIds[m]);
					IBOCmInsCmrelValue[] insValues = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(),
							parameter, -1, -1);
					if (CmCommonUtil.isNotEmptyObject(insValues)) {
						for (int i = 0; i < insValues.length; i++) {
							BOCmInsCmrelBean bean = new BOCmInsCmrelBean();
							bean.copy(insValues[i]);
							bean.setState(CmConstants.CmInsRela.TERMINATED);
							// 保存客户用户关系
							sv.saveCmInsCmrel(bean);
						}
					}
				}
			}
		}
	}
	
	
	public void ChangeCmInsStateToDelete4Reaccess(long userId, long[] custIds) throws Exception {
		if (userId > 0 && custIds != null && custIds.length > 0) {
			StringBuffer condition = new StringBuffer(" 1=1 ");
			HashMap parameter = new HashMap();
			ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			for (int m = 0; m < custIds.length; m++) {
				if (custIds[m] > 0) {
					condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
					parameter.put("userId", userId);
					condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
					parameter.put("CUST_ID", custIds[m]);
					IBOCmInsCmrelValue[] insValues = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(),
							parameter, -1, -1);
					if (CmCommonUtil.isNotEmptyObject(insValues)) {
						for (int i = 0; i < insValues.length; i++) {
							BOCmInsCmrelBean bean = new BOCmInsCmrelBean();
							bean.copy(insValues[i]);
							bean.setState(CmConstants.CmInsRela.TERMINATED);
							// 保存客户用户关系
							sv.saveCmInsCmrel4Reaccess(bean);
						}
					}
				}
			}
		}
	}

	public IAccountProfileValue[] queryAcctProfile(long custId, String payMethod) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		String regionId = CmCommonUtil.getDefaultRegionId();
		return accountSV.queryAcctDtsByCustIdAndBillId(custId, regionId, null, payMethod, -1, -1, -1);
	}

	public boolean queryGroupAcccess(long custId) throws Exception {
		ICmGroupCustomerSV sv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		return sv.queryGroupAccess(custId);
	}

	public void modifyCmInsCmrelValue(IBOCmInsCmrelValue[] cmInsCmrelValues) throws Exception {
		if (null != cmInsCmrelValues && cmInsCmrelValues.length > 0) {
			ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			for (int i = 0; i < cmInsCmrelValues.length; i++) {
				long custId = cmInsCmrelValues[i].getCustId();
				long userId = cmInsCmrelValues[i].getUserId();
				IBOCmInsCmrelValue[] localValues = cmCustomerSV.queryCmInsByUserIdAndCustId(custId, userId, 0);
				if (null != localValues && localValues.length > 0) {
					// 走修改流程
					// cmInsCmrelValues[i].setStsToOld();
					cmInsCmrelValues[i].initProperty("CMREL_ID", cmInsCmrelValues[i].getCmrelId());
					cmCustomerSV.saveCmInsCmrel(cmInsCmrelValues[i]);
				} else {
					throw new Exception(String.valueOf(custId) + ":" + String.valueOf(userId) + " customer is null.");
				}
			}
		}

	}

	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId, int start, int end) throws Exception {
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return cmCustomerSV.queryCmInsCmrel(custId, userId, relType, userType, prodCatalogId, offerId, start, end);
	}
	
	
	public IBOCmInsCmrelValue[] queryCmInsCmrelNew(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		if (relType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		if (userType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserType).append(" =:userType ");
			parameter.put("userType", userType);
		}
		if (prodCatalogId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" =:prodCatalogId ");
			parameter.put("prodCatalogId", prodCatalogId);
		}
		if (prodCatalogId == 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" NOT IN( ").append(RBossConst.PROD_CATALOG_GSM).append(",").append(RBossConst.PROD_CATALOG_FIXEDPHONE).append(",").append(RBossConst.PROD_CATALOG_BROADBAND).append(",").append(RBossConst.PROD_CATALOG_MULTIPLAN).append(",").append(RBossConst.PROD_CATALOG_NODICCONNECT).append(")");
		}
		if (offerId < 0) {// 如果offerId为-2，过滤掉VPN用户，VPN的offerId为70130  @龚佩要求改为70130
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_OfferId).append(" !=:offerId ");
			parameter.put("offerId", 70130);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		condition.append(" ORDER BY CREATE_DATE ASC ");

		IBOCmInsCmrelValue[] contMediums = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, start,
				end);
		if (null != contMediums && contMediums.length > 0) {
			return contMediums;
		}
		return new IBOCmInsCmrelValue[0];
	}

	public IBOCmInsCmrelValue[] queryCmInsCmrelNew(long custId, long userId, int relType, int userType, long prodCatalogId, List offerIdList, int Ext1, boolean vpnFlag, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		if (relType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		if (userType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserType).append(" =:userType ");
			parameter.put("userType", userType);
		}
		if (prodCatalogId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" =:prodCatalogId ");
			parameter.put("prodCatalogId", prodCatalogId);
		}
		if (prodCatalogId == 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" NOT IN( ").append(RBossConst.PROD_CATALOG_GSM).append(",").append(RBossConst.PROD_CATALOG_FIXEDPHONE).append(",").append(RBossConst.PROD_CATALOG_BROADBAND).append(",").append(RBossConst.PROD_CATALOG_MULTIPLAN).append(",").append(RBossConst.PROD_CATALOG_NODICCONNECT).append(")");
		}
		if (offerIdList != null &&offerIdList.size()>0){
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_OfferId).append(" IN (");
			String str2="";
			for(int j=0;j<offerIdList.size();j++){
				str2 =str2 + offerIdList.get(j) + ",";
			}
			condition.append(str2.substring(0, str2.length()-1)).append(")");
		}else if(vpnFlag){
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_OfferId).append(" !=:offerId ");
			parameter.put("offerId", 70130);
		}
		if (Ext1>0){
			//对应页面上suspend情况。
			if(Ext1 == 8){
				condition.append(" AND ").append(IBOCmInsCmrelValue.S_Ext1).append(" =:Ext1 ");
				parameter.put("Ext1", 1);
				condition.append(" AND LOCATE('1',").append(IBOCmInsCmrelValue.S_Ext2).append(") >0 ");
			}else{
				condition.append(" AND ").append(IBOCmInsCmrelValue.S_Ext1).append(" =:Ext1 ");
				parameter.put("Ext1", Ext1);
			}
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		condition.append(" ORDER BY CREATE_DATE ASC ");

		IBOCmInsCmrelValue[] contMediums = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, start,
				end);
		if (null != contMediums && contMediums.length > 0) {
			return contMediums;
		}
		return new IBOCmInsCmrelValue[0];
	}

	public int queryCmInsCmrelCount(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId) throws Exception {
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return cmCustomerSV.queryCmInsCmrelCount(custId, userId, relType, userType, prodCatalogId, offerId);
	}

	public int queryCmInsCmrelCountWithoutSelf(long custId, long userId, int relType) throws Exception {
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return cmCustomerSV.queryCmInsCmrelCountWithoutSelf(custId, userId, relType);
	}

	public void createCmInsCmrelValue(IBOCmInsCmrelValue cmInsCmrelValues) throws Exception {
		if (cmInsCmrelValues != null) {
			IBOCmInsCmrelValue value = new BOCmInsCmrelBean();
			value.setCmrelId(CmCommonUtil.getNewSequence(BOLnCmInsCmRelBean.class));
			value.setCustId(cmInsCmrelValues.getCustId());
			value.setUserId(cmInsCmrelValues.getUserId());
			value.setUserRegionCode(cmInsCmrelValues.getUserRegionCode());
			if (cmInsCmrelValues.getRelaType() == 0) {
				value.setRelaType(CmConstants.RelaType.OWNER);
			} else {
				value.setRelaType(cmInsCmrelValues.getRelaType());
			}
			value.setState(CmConstants.CmInsRela.NORMAL);
			value.setEffectiveDateType(0);
			value.setExpireDateType(0);
			value.setOfferId(cmInsCmrelValues.getOfferId());
			value.setUserType(cmInsCmrelValues.getUserType());
			value.setProdCatalogId(cmInsCmrelValues.getProdCatalogId());
			value.setExt1(cmInsCmrelValues.getExt1());
			value.setExt2(cmInsCmrelValues.getExt2());
			value.setExt3(cmInsCmrelValues.getExt3());
			if (cmInsCmrelValues.getEffectiveDate() != null) {
				value.setEffectiveDate(cmInsCmrelValues.getEffectiveDate());
			}
			// 保存客户用户关系
			ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			sv.saveCmInsCmrel(value);
		}

	}

	public void saveGroupMembers(IBOCmGroupMemberValue[] groupMemberValues) throws Exception {
		if (groupMemberValues != null && groupMemberValues.length > 0) {
			IVOCustValue custValue = new VOCustBean();
			ICustRelationshipValue custRelValue = null;
			for (int i = 0; i < groupMemberValues.length; i++) {
				custRelValue = new CustRelationshipBean();
				groupMemberValues[i].setMemberType(CmLnConstants.MemberStatus.NUMBER_MEMBER);
				groupMemberValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
				groupMemberValues[i].setState(CmConstants.RecordState.USE);
				custRelValue.copy(groupMemberValues[i]);
				custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
				custValue.addCustRel(custRelValue);
			}
			CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		}

	}

	public void modifyGroupNumMember(long srcDeptId, long destDeptId, String billId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_DeptId, srcDeptId);
		condition.set(IGroupMemberValue.S_BillId, billId);
		IGroupMemberValue[] memberValues = customerSV.queryGroupMembers(condition, -1, -1);
		if (memberValues != null && memberValues.length > 0) {
			IVOCustValue custValue = new VOCustBean();
			ICustRelationshipValue custRelValue = new CustRelationshipBean();
			custRelValue.copy(memberValues[0]);
			custRelValue.setDeptId(destDeptId);
			custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
			custValue.addCustRel(custRelValue);
			customerSV.saveCustomer(custValue);
		} else {
			ExceptionUtil.throwBusinessException("CMS0001236");
		}
	}

	public void delGroupNumMember(long groupCustId, String billId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_CustId, groupCustId);
		condition.set(IGroupMemberValue.S_BillId, billId);
		IGroupMemberValue[] memberValues = customerSV.queryGroupMembers(condition, -1, -1);
		if (memberValues != null && memberValues.length > 0) {
			IVOCustValue custValue = new VOCustBean();
			ICustRelationshipValue custRelValue = new CustRelationshipBean();
			custRelValue.copy(memberValues[0]);
			custRelValue.delete();
			custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
			custValue.addCustRel(custRelValue);
			customerSV.saveCustomer(custValue);
		}
	}

	public void delGroupNumMemberForOSE(long userId,long deptId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_UserId, userId);
		condition.set(IGroupMemberValue.S_DeptId, deptId);
		IGroupMemberValue[] memberValues = customerSV.queryGroupMembers(condition, -1, -1);
		if (memberValues != null && memberValues.length > 0) {
			IVOCustValue custValue = new VOCustBean();
			ICustRelationshipValue custRelValue = new CustRelationshipBean();
			custRelValue.copy(memberValues[0]);
			custRelValue.delete();
			custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
			custValue.addCustRel(custRelValue);
			customerSV.saveCustomer(custValue);
		}
	}

	public void saveAccount(List<IAccountValue> list) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		for (int i = 0; i < list.size(); i++) {
			IAccountValue acctValue = list.get(i);
			long acctId = acctValue.getAcctId();
			IAccountValue acctValueTmp = acctSV.queryAccountById(acctId);
			if (acctValueTmp == null) {
				throw new Exception("Can Not Find Account Information By accountId");
			}
			acctValueTmp.setAcctStatus(acctValue.getAcctStatus());
			acctValueTmp.setRemarks(acctValue.getRemarks());
			IVOAccountValue voacctValue = new VOAccountBean();
			voacctValue.setAccount(acctValueTmp);
			acctSV.saveAccount(voacctValue);
		}

	}

	private long queryCustIdByPartyId(long partyId) throws Exception {
		StringBuilder condition = new StringBuilder();
		StringBuilder indivCondition = new StringBuilder();
		StringBuilder groupCondition = new StringBuilder();
		indivCondition.append(" SELECT A.CUST_ID FROM {CM_INDIV_CUSTOMER} A WHERE A.STATE='U' AND A.PARTY_ID=:partyId ");
		groupCondition.append(" SELECT B.CUST_ID FROM {CM_GROUP_CUSTOMER} B WHERE B.STATE='U' AND B.PARTY_ID=:partyId ");
		condition.append(indivCondition).append(" UNION ALL ").append(groupCondition);
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			return dcs[0].getAsLong("CUST_ID");
		}
		return 0;
	}

	public IVOCustValue queryCustomerDtl(long ttId) throws Exception {
		long custId = 0L;
		if (String.valueOf(ttId).length() == 14) {
			// 说明是客户
			custId = ttId;
		} else {
			// 说明是其他角色，是partyId
			custId = queryCustIdByPartyId(ttId);

		}
		IVOCustValue voCustValue = new VOCustBean();
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		if (custId > 0) {
			// 针对的是客户，使用者，成员
			// 查询客户信息
			ICustomerValue customerValue = null;
			if (custId > 0) {
				customerValue = new CustomerBean();
				DataContainer conditionDC = new DataContainer();
				if (custId > 0) {
					conditionDC.set(ICustomerValue.S_CustId, Long.valueOf(custId));
				}
				ICustomerValue[] customers = customerSV.queryCustomers(conditionDC, -1, -1);
				if (customers != null && customers.length > 0) {
					customerValue.copy(customers[0]);
					voCustValue.setCustomer(customerValue);
				}

			}
			// 客户的联系信息
			IQBOCmCustContMediumAndTypeValue[] custContMediums = customerSV.queryCustElectronicMediumForPage(custId, -1, -1);
			IBOCmCustContactMediumValue custContMediu = null;
			List custContList = new ArrayList();
			if (custContMediums != null && custContMediums.length > 0) {
				for (int i = 0; i < custContMediums.length; i++) {
					custContMediu = new BOCmCustContactMediumBean();
					custContMediu.copy(custContMediums[i]);
					custContList.add(custContMediu);
				}
			}
			if (custContList != null && !custContList.isEmpty()) {
				voCustValue.addCustContMedium((IBOCmCustContactMediumValue[]) custContList.toArray(new IBOCmCustContactMediumValue[0]));
			}

			// 客户的地址信息
			IQBOCmCustContMediumAndTypeValue[] custAddress = customerSV.queryCustContactMediums(custId, -1, CmConstants.ContMedium.ENTITY_ADDR, -1, -1);
			IVOCustAddressValue voCustAddressValue = null;
			IBOCmCustContactMediumValue contMedium = null;
			List custAddrList = null;
			long addrId = 0;
			address addr = null;
			if (custAddress != null && custAddress.length > 0) {
				custAddrList = new ArrayList();
				for (int i = 0; i < custAddress.length; i++) {
					voCustAddressValue = new VOCustAddressBean();
					addrId = custAddress[i].getAddressId();
					addr = addrService.getAddress(addrId, CmConstants.AddressDistrictId.DISTRICT_ID);
					voCustAddressValue.addAddress(addr);
					contMedium = new BOCmCustContactMediumBean();
					contMedium.copy(custAddress[i]);
					voCustAddressValue.addContMedium(contMedium);
					custAddrList.add(voCustAddressValue);
					// 如果法律地址受保护，则设置客户为受保护
					if (customerValue != null && custAddress[i].getContMedTypeId() == CmConstants.AddressId.legalAddress) {
						customerValue.setIsProtected(custAddress[i].getIsProtected());
					}
				}
			}
			if (custAddrList != null && !custAddrList.isEmpty()) {
				voCustValue.addCustAddress((IVOCustAddressValue[]) custAddrList.toArray(new IVOCustAddressValue[0]));
			}
		} else {
			// 说明是payer
			ICustomerValue custValue = new CustomerBean();
			// 通过partyId查询payer信息
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue partyValue = partySV.queryPayerByPartyId(ttId);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				custValue.setFirstName(partyValue.getFirstName());
				custValue.setLastName(partyValue.getLastName());
				custValue.setCustName(partyValue.getPartyName());
				custValue.setCustCertType(partyValue.getCertType());
				custValue.setCustCertCode(partyValue.getCertCode());
				custValue.setDirectMarketingProtection(DataType.getAsInt(partyValue.getDirectMarketingProtection()));
				custValue.setProtectEffDate(partyValue.getProtectEffDate());
				custValue.setProtectExpireDate(partyValue.getProtectExpireDate());
				custValue.setManualCommercialProtection(DataType.getAsInt(partyValue.getManualCommercialProtection()));
				custValue.setManualProtectEffectiveDate(partyValue.getManualProtectEffectiveDate());
				custValue.setManualProtectExpireDate(partyValue.getManualProtectExpireDate());
				if(StringUtils.isNotBlank(partyValue.getExt1())){
					custValue.setIsProtected(DataType.getAsInt(partyValue.getExt1()));
				}else{
					custValue.setIsProtected(0);
				}		
				custValue.setBirthday(partyValue.getBirthday());
			}
			voCustValue.setCustomer(custValue);
			// 查询payer的地址信息partyValue
			IVOCustAddressValue voCustAddressValue = new VOCustAddressBean();
			IBOCmCustContactMediumValue contMedium = new BOCmCustContactMediumBean();
			if (StringUtils.isNotBlank(partyValue.getContAddress())) {
				address address = addrService.getAddress(Long.parseLong(partyValue.getContAddress().trim()), CmConstants.AddressDistrictId.DISTRICT_ID);
				if (null != address) {
					voCustAddressValue.addAddress(address);
					contMedium.setAddressId(Long.parseLong(partyValue.getContAddress().trim()));
					contMedium.setAddressDetail(address.getAddrDesc());
					contMedium.setContMedTypeId(CmConstants.AddressId.legalAddress);
					if(StringUtils.isNotBlank(partyValue.getExt1())){
						contMedium.setIsNoDisturbing(DataType.getAsInt(partyValue.getExt1()));
					}else{
						contMedium.setIsNoDisturbing(0);
					}
					contMedium.setProtectEffDate(partyValue.getExt9());
					contMedium.setExpireDate(partyValue.getExt10());
				}
			}
			if (CmCommonUtil.isNotEmptyObject(contMedium)) {
				voCustAddressValue.addContMedium(contMedium);
			}
			if (null != voCustAddressValue) {
				voCustValue.addCustAddress(new IVOCustAddressValue[] { voCustAddressValue });
			}
			// 查询payer的联系信息
			IQBOCmCustContMediumAndTypeValue[] custContMediums = customerSV.queryCustElectronicMediumForPage(ttId, -1, -1);
			IBOCmCustContactMediumValue custContMediu = null;
			List custContList = new ArrayList();
			if (custContMediums != null && custContMediums.length > 0) {
				for (int i = 0; i < custContMediums.length; i++) {
					custContMediu = new BOCmCustContactMediumBean();
					custContMediu.copy(custContMediums[i]);
					custContList.add(custContMediu);
				}
			}
			if (custContList != null && !custContList.isEmpty()) {
				voCustValue.addCustContMedium((IBOCmCustContactMediumValue[]) custContList.toArray(new IBOCmCustContactMediumValue[0]));
			}
		}
		return voCustValue;
	}
	
	/**
	 * 为PushC重写，只返回一个有效的法律地址
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-8-13
	* ICm2SoSV
	 */
	public IVOCustValue queryCustomerDtlForPushC(long cId) throws Exception {
		long custId = 0L;
		if (String.valueOf(cId).length() == 14) {
			// 说明是客户
			custId = cId;
		} else {
			// 说明是其他角色，是partyId
			custId = queryCustIdByPartyId(cId);
			
		}
		IVOCustValue voCustValue = new VOCustBean();
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		if (custId > 0) {
			// 针对的是客户，使用者，成员
			// 查询客户信息
			ICustomerValue customerValue = null;
			if (custId > 0) {
				customerValue = new CustomerBean();
				DataContainer conditionDC = new DataContainer();
				if (custId > 0) {
					conditionDC.set(ICustomerValue.S_CustId, Long.valueOf(custId));
				}
				ICustomerValue[] customers = customerSV.queryCustomers(conditionDC, -1, -1);
				if (customers != null && customers.length > 0) {
					customerValue.copy(customers[0]);
					voCustValue.setCustomer(customerValue);
				}
				
			}
			// 客户的联系信息
			IQBOCmCustContMediumAndTypeValue[] custContMediums = customerSV.queryCustElectronicMediumForPage(custId, -1, -1);
			IBOCmCustContactMediumValue custContMediu = null;
			List custContList = new ArrayList();
			if (custContMediums != null && custContMediums.length > 0) {
				for (int i = 0; i < custContMediums.length; i++) {
					custContMediu = new BOCmCustContactMediumBean();
					custContMediu.copy(custContMediums[i]);
					custContList.add(custContMediu);
				}
			}
			if (custContList != null && !custContList.isEmpty()) {
				voCustValue.addCustContMedium((IBOCmCustContactMediumValue[]) custContList.toArray(new IBOCmCustContactMediumValue[0]));
			}
			
			// 客户的地址信息
			IQBOCmCustContMediumAndTypeValue[] custAddress = customerSV.queryCustContactMediums(custId, 11, CmConstants.ContMedium.ENTITY_ADDR, 0, 1);
			IVOCustAddressValue voCustAddressValue = null;
			IBOCmCustContactMediumValue contMedium = null;
			List custAddrList = null;
			long addrId = 0;
			address addr = null;
			if (custAddress != null && custAddress.length > 0) {
				custAddrList = new ArrayList();
				for (int i = 0; i < custAddress.length; i++) {
					voCustAddressValue = new VOCustAddressBean();
					addrId = custAddress[i].getAddressId();
					addr = addrService.getAddress(addrId, CmConstants.AddressDistrictId.DISTRICT_ID);
					voCustAddressValue.addAddress(addr);
					contMedium = new BOCmCustContactMediumBean();
					contMedium.copy(custAddress[i]);
					voCustAddressValue.addContMedium(contMedium);
					custAddrList.add(voCustAddressValue);
					// 如果法律地址受保护，则设置客户为受保护
					if (customerValue != null && custAddress[i].getContMedTypeId() == CmConstants.AddressId.legalAddress) {
						customerValue.setIsProtected(custAddress[i].getIsProtected());
					}
				}
			}
			if (custAddrList != null && !custAddrList.isEmpty()) {
				voCustValue.addCustAddress((IVOCustAddressValue[]) custAddrList.toArray(new IVOCustAddressValue[0]));
			}
		} else {
			// 说明是payer
			ICustomerValue custValue = new CustomerBean();
			// 通过partyId查询payer信息
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue partyValue = partySV.queryPayerByPartyId(cId);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				custValue.setFirstName(partyValue.getFirstName());
				custValue.setLastName(partyValue.getLastName());
				custValue.setCustName(partyValue.getPartyName());
				custValue.setCustCertType(partyValue.getCertType());
				custValue.setCustCertCode(partyValue.getCertCode());
				custValue.setDirectMarketingProtection(DataType.getAsInt(partyValue.getDirectMarketingProtection()));
				custValue.setProtectEffDate(partyValue.getProtectEffDate());
				custValue.setProtectExpireDate(partyValue.getProtectExpireDate());
				custValue.setManualCommercialProtection(DataType.getAsInt(partyValue.getManualCommercialProtection()));
				custValue.setManualProtectEffectiveDate(partyValue.getManualProtectEffectiveDate());
				custValue.setManualProtectExpireDate(partyValue.getManualProtectExpireDate());
				if(StringUtils.isNotBlank(partyValue.getExt1())){
					custValue.setIsProtected(DataType.getAsInt(partyValue.getExt1()));
				}else{
					custValue.setIsProtected(0);
				}		
				custValue.setBirthday(partyValue.getBirthday());
			}
			voCustValue.setCustomer(custValue);
			// 查询payer的地址信息partyValue
			IVOCustAddressValue voCustAddressValue = new VOCustAddressBean();
			IBOCmCustContactMediumValue contMedium = new BOCmCustContactMediumBean();
			if (StringUtils.isNotBlank(partyValue.getContAddress())) {
				address address = addrService.getAddress(Long.parseLong(partyValue.getContAddress().trim()), CmConstants.AddressDistrictId.DISTRICT_ID);
				if (null != address) {
					voCustAddressValue.addAddress(address);
					contMedium.setAddressId(Long.parseLong(partyValue.getContAddress().trim()));
					contMedium.setAddressDetail(address.getAddrDesc());
					contMedium.setContMedTypeId(CmConstants.AddressId.legalAddress);
					if(StringUtils.isNotBlank(partyValue.getExt1())){
						contMedium.setIsNoDisturbing(DataType.getAsInt(partyValue.getExt1()));
					}else{
						contMedium.setIsNoDisturbing(0);
					}
					contMedium.setProtectEffDate(partyValue.getExt9());
					contMedium.setExpireDate(partyValue.getExt10());
				}
			}
			if (CmCommonUtil.isNotEmptyObject(contMedium)) {
				voCustAddressValue.addContMedium(contMedium);
			}
			if (null != voCustAddressValue) {
				voCustValue.addCustAddress(new IVOCustAddressValue[] { voCustAddressValue });
			}
			// 查询payer的联系信息
			IQBOCmCustContMediumAndTypeValue[] custContMediums = customerSV.queryCustElectronicMediumForPage(cId, -1, -1);
			IBOCmCustContactMediumValue custContMediu = null;
			List custContList = new ArrayList();
			if (custContMediums != null && custContMediums.length > 0) {
				for (int i = 0; i < custContMediums.length; i++) {
					custContMediu = new BOCmCustContactMediumBean();
					custContMediu.copy(custContMediums[i]);
					custContList.add(custContMediu);
				}
			}
			if (custContList != null && !custContList.isEmpty()) {
				voCustValue.addCustContMedium((IBOCmCustContactMediumValue[]) custContList.toArray(new IBOCmCustContactMediumValue[0]));
			}
		}
		return voCustValue;
	}
	
	public IVOCustValue queryCustomerDtlForTT(long ttId) throws Exception {
		long custId = 0L;
		if (String.valueOf(ttId).length() == 14) {
			// 说明是客户
			custId = ttId;
		} else {
			// 说明是其他角色，是partyId
			custId = queryCustIdByPartyId(ttId);
			
		}
		IVOCustValue voCustValue = new VOCustBean();
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		if (custId > 0) {
			// 针对的是客户，使用者，成员
			// 查询客户信息
			ICustomerValue customerValue = null;
			if (custId > 0) {
				customerValue = new CustomerBean();
				DataContainer conditionDC = new DataContainer();
				if (custId > 0) {
					conditionDC.set(ICustomerValue.S_CustId, Long.valueOf(custId));
				}
				ICustomerValue[] customers = customerSV.queryCustomers(conditionDC, -1, -1);
				if (customers != null && customers.length > 0) {
					customerValue.copy(customers[0]);
					voCustValue.setCustomer(customerValue);
				}
				
			}
			// 客户的联系信息
			IQBOCmCustContMediumAndTypeValue[] custContMediums = customerSV.queryCustElectronicMediumForPage(custId, -1, -1);
			IBOCmCustContactMediumValue custContMediu = null;
			List custContList = new ArrayList();
			if (custContMediums != null && custContMediums.length > 0) {
				for (int i = 0; i < custContMediums.length; i++) {
					custContMediu = new BOCmCustContactMediumBean();
					custContMediu.copy(custContMediums[i]);
					custContList.add(custContMediu);
				}
			}
			if (custContList != null && !custContList.isEmpty()) {
				voCustValue.addCustContMedium((IBOCmCustContactMediumValue[]) custContList.toArray(new IBOCmCustContactMediumValue[0]));
			}
			
		} else {
			// 说明是payer
			ICustomerValue custValue = new CustomerBean();
			// 通过partyId查询payer信息
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue partyValue = partySV.queryPayerByPartyId(ttId);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				custValue.setFirstName(partyValue.getFirstName());
				custValue.setLastName(partyValue.getLastName());
				custValue.setCustName(partyValue.getPartyName());
				custValue.setCustCertType(partyValue.getCertType());
				custValue.setCustCertCode(partyValue.getCertCode());
				custValue.setDirectMarketingProtection(DataType.getAsInt(partyValue.getDirectMarketingProtection()));
				custValue.setProtectEffDate(partyValue.getProtectEffDate());
				custValue.setProtectExpireDate(partyValue.getProtectExpireDate());
				custValue.setManualCommercialProtection(DataType.getAsInt(partyValue.getManualCommercialProtection()));
				custValue.setManualProtectEffectiveDate(partyValue.getManualProtectEffectiveDate());
				custValue.setManualProtectExpireDate(partyValue.getManualProtectExpireDate());
				if(StringUtils.isNotBlank(partyValue.getExt1())){
					custValue.setIsProtected(DataType.getAsInt(partyValue.getExt1()));
				}else{
					custValue.setIsProtected(0);
				}		
				custValue.setBirthday(partyValue.getBirthday());
			}
			voCustValue.setCustomer(custValue);

			// 查询payer的联系信息
			IQBOCmCustContMediumAndTypeValue[] custContMediums = customerSV.queryCustElectronicMediumForPage(ttId, -1, -1);
			IBOCmCustContactMediumValue custContMediu = null;
			List custContList = new ArrayList();
			if (custContMediums != null && custContMediums.length > 0) {
				for (int i = 0; i < custContMediums.length; i++) {
					custContMediu = new BOCmCustContactMediumBean();
					custContMediu.copy(custContMediums[i]);
					custContList.add(custContMediu);
				}
			}
			if (custContList != null && !custContList.isEmpty()) {
				voCustValue.addCustContMedium((IBOCmCustContactMediumValue[]) custContList.toArray(new IBOCmCustContactMediumValue[0]));
			}
		}
		return voCustValue;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#
	 * query360AllUserList(long, java.lang.String, java.lang.String, long, int,
	 * int)
	 */
	public DataContainerInterface[] query360AllUserList(long custId, String prodCatalogId, String billId, long offerId, int strIdx, int endIdx) throws Exception {
		ICrmFSV sv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		DataContainerInterface[] dc = sv.query360AllUserList(custId, prodCatalogId, billId, offerId, strIdx, endIdx);
		if (dc != null && dc.length > 0) {
			String action = "";
			String innerAction = "";
			int firstIdx = -1;
			for (int i = 0; i < dc.length; i++) {
				action = dc[i].getAsString("ACTION");
				if (StringUtils.isNotBlank(action)) {
					firstIdx = action.indexOf("</a>");
					if (firstIdx > -1) {
						innerAction = action.substring(0, firstIdx + 4);
					} else {
						innerAction = action;
					}

					dc[i].set("ACTION", innerAction);
				}
			}
		}
		return dc;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#
	 * query360AllUserListCount(long, java.lang.String, java.lang.String, long)
	 */
	public int query360AllUserListCount(long custId, String prodCatalogId, String billId, long offerId) throws Exception {
		ICrmFSV sv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		return sv.query360AllUserListCount(custId, prodCatalogId, billId, offerId);
	}

	public long queryUserDept(long userId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer condition = new DataContainer();
		condition.set(IGroupMemberValue.S_UserId, userId);
		condition.set(IGroupMemberValue.S_MemberType, CmLnConstants.MemberStatus.NUMBER_MEMBER);
		IGroupMemberValue[] memberValues = customerSV.queryGroupMembers(condition, -1, -1);
		if (memberValues != null && memberValues.length > 0) {
			return memberValues[0].getDeptId();
		}
		return 0;
	}

	public address queryAddressInfo(long addressId) throws Exception {
		if (addressId > 0) {
			IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			return addressSV.getAddress(addressId, "012002002");
		}
		return null;
	}

	public IBOCmCustAcctRelValue[] queryCsutAcctRel(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd <= 0 && acctId <= 0) {
			return new IBOCmCustAcctRelValue[0];
		}
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		// 记录日志
		ICmCommonSV commomSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commomSV.saveCommonQryBusiLogWithCustId(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG, relCustd);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);
		return result;
	}

	@Override
	public int queryCsutAcctRelCount(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd <= 0 && acctId <= 0) {
			return 0;
		}
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		int count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
		return count;
	}

	public int queryAcctPaymentType(long acctId) throws Exception {
		ICmBillingAcctSV billingAcctSV = (ICmBillingAcctSV) ServiceFactory.getService(ICmBillingAcctSV.class);
		IBOCmPayChannelValue payChannelValue = billingAcctSV.queryAcctPayChannel(acctId);
		if (payChannelValue != null) {
			return payChannelValue.getPaymentType();
		}
		return -1;
	}

	public void dealChangeUser(long userId, long newCustId, long oldCustId, long newUserCustId, long oldUserCustId, long orderId) throws Exception {
		long newCustType = CmCommonUtil.getCustType(newCustId);
		long oldCustType = CmCommonUtil.getCustType(oldCustId);
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		if (newCustType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人过给个人
			service.dealIndivUserToIndivCust(newCustId, oldCustId, userId, orderId);
		} else if (newCustType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.GROUP) {
			// 集团过给个人
			service.dealGroupUserToIndivCust(newCustId, userId, oldCustId, orderId);
		} else if (newCustType == CmConstants.CustomerType.GROUP && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人过给集团
			service.dealIndivUserToGroupCust(newCustId, userId, oldCustId, orderId);
			// 如果集团客户不是在网要变成在网
			changeStatusToOnline(newCustId);
		} else if (newCustType == CmConstants.CustomerType.GROUP && oldCustType == CmConstants.CustomerType.GROUP) {
			// 集团过给集团
			service.dealGroupUserToGroupCust(newCustId, userId, oldCustId, orderId);
			// 如果集团不是在网要变成在网
			changeStatusToOnline(newCustId);
		}
		// 订购聋哑offer
		ifOrderOfferForTransferCust(newCustId, oldCustId, userId);
		// 退订phoneBook
		unSubscribePhoneBook(newCustId, oldCustId, userId);
		// 过户对于使用者的逻辑
		dealForUser(newUserCustId, oldUserCustId, userId);
		// 过户时对于营销免打扰的逻辑
		dealCommercialProtection(newCustId, userId);
	}

	/*
	 * 过户时判断是否订购聋哑offer
	 */
	private void ifOrderOfferForTransferCust(long custId, long oldCustId, long userId) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		int custType = CmCommonUtil.getCustType(custId);
		int oldCustType = CmCommonUtil.getCustType(oldCustId);
		int state = custSV.queryCustomerByCustId(custId).getPhysiologicalState();
		int oldState = custSV.queryCustomerByCustId(oldCustId).getPhysiologicalState();
		if (custType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人过给个人
			if (oldState == CmConstants.PhysiologicalState.NormalPerson && state > CmConstants.PhysiologicalState.NormalPerson) {
				// 需要订购聋哑人offer
				custSV.orderForUnormalPerson(userId);
			}
		} else if (custType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.GROUP) {
			// 集团过给个人
			if (state > CmConstants.PhysiologicalState.NormalPerson) {
				// 需要订购聋哑人offer
				custSV.orderForUnormalPerson(userId);
			}
		}
	}

	/*
	 * 过户时判断是否退订phonebook
	 */
	private void unSubscribePhoneBook(long custId, long oldCustId, long userId) throws Exception {
		ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
		int custType = CmCommonUtil.getCustType(custId);
		int oldCustType = CmCommonUtil.getCustType(oldCustId);
		// 个人过给个人
		if (custType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 查询老客户是否受保护
			boolean oldFlag = indivService.ifCustIsProtected(oldCustId);
			// 查询新客户是否受保护
			boolean newFlag = indivService.ifCustIsProtected(custId);
			if (oldFlag == true && newFlag == false) {
				// 退订phonebook
				commonSV.savePsPublicInfo(custValue, CmConstants.PsPublicAction.PHONE_NUM_HIDE, userId);
			}
		}
		// 个人过给集团
		if (custType == CmConstants.CustomerType.GROUP && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 查询老客户是否是受保护
			boolean oldFlag = indivService.ifCustIsProtected(oldCustId);
			if (oldFlag == true) {
				// 退订phonebook
				commonSV.savePsPublicInfo(custValue, CmConstants.PsPublicAction.PHONE_NUM_HIDE, userId);
			}
		}
	}

	/*
	 * 过户对于使用者的逻辑
	 */
	private void dealForUser(long newUserCustId, long oldUserCustId, long userId) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 对于老使用者的逻辑
		if (oldUserCustId > 0) {
			IBOCmInsCmrelValue[] insValues = custSV.queryCmInsCmrel(oldUserCustId, userId, CmConstants.RelaType.USER, -1, -1, -1, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(insValues)) {
				insValues[0].setState(CmConstants.CmInsRela.TERMINATED);
				custSV.saveCmInsCmrel(insValues[0]);
			}
		}
		// 对于新使用者的逻辑
		if (newUserCustId > 0) {
			// IBOCmInsCmrelValue[]
			// insValues=custSV.queryCmInsCmrel(newUserCustId, userId,
			// CmConstants.RelaType.USER,
			// -1,-1, -1, -1, -1);
			// if(CmCommonUtil.isEmptyObj(insValues)){
			custSV.dealCreateDefaultUser(newUserCustId, userId, "N");
			// }
		}
	}

	public void saveCustCertCode(long custId, String custCertCode) throws Exception {
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		if (custId > 0 && CmConstants.CustomerType.INDIVIDUAL == commonSV.getCustType(custId)) {
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue customerValue = customerSV.queryCustomerByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(customerValue)) {
				if (StringUtils.isNotBlank(custCertCode) && StringUtils.isNumeric(custCertCode)) {
					customerValue.setCustCertType(CmConstants.CertificateType.CPR);
					customerValue.setCustCertCode(custCertCode);
					customerValue.setAnonymousFlag(CmConstants.YesOrNo.NO);
					CmServiceFactory.getCustomerSV().saveCustomer(customerValue);
				}
			} else {
				ExceptionUtil.throwBusinessException("The customer is not exist");
			}
		} else {
			ExceptionUtil.throwBusinessException("The custId can not be empty");
		}
	}

	public void dealCommercialProtection(long custId, long userId) throws Exception {
		if (custId > 0 && userId > 0) {
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(custValue)) {
				commonSV.savePsPublicInfo(custValue, CmConstants.PsPublicAction.COMMERCIAL_PROTECTION, userId);
			}
		}
	}

	public DataContainer queryPayerByAcctId(long acctId) throws Exception {
		// 由于payer增加多种联系方式，联系方式查询修改(默认主要联系方式)
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCMPartyAcctRelValue[] partyAcctRelValues = accountSV.queryPartyAccRel(acctId, -1);
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dc = null;
		if (partyAcctRelValues != null && partyAcctRelValues.length > 0) {
			long partyId = partyAcctRelValues[0].getPartyId();
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue result = partySV.queryPayerByPartyId(partyId);
			if (CmCommonUtil.isNotEmptyObject(result)) {
				dc = new DataContainer();
				// 已经是payer获取contId
				long contId = result.getContId();
				IQBOCmContactContMediumInfoValue[] mediums = cmCustomerSV.queryContactContMediumInfo(contId, -1, -1);
				// 201主要邮箱301主要电话
				if (null != mediums && mediums.length > 0) {
					for (int i = 0; i < mediums.length; i++) {
						long medType = mediums[i].getContMedTypeId();
						if (medType == 201) {
							dc.set("PAYER_EMAIL", mediums[i].getEmailAddress());
						}
						if (medType == 301) {
							dc.set("PAYER_PHONE", mediums[i].getContNumber());
						}
					}

				}
				dc.set("PAYER_NAME", result.getPartyName());
				dc.set("PAYER_ADDRESS", result.getRemarks());
				dc.set("ACCT_TYPE", CmConstants.AccountConstants.REAL_ACCT);
				dc.set("ACCT_ID", acctId);
			} else {// 自有账户
				dc = new DataContainer();
				dc.set("ACCT_TYPE", CmConstants.AccountConstants.SELF_ACCT);
				ICm2SoSV sv = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
				IBOCmCustAcctRelValue[] vals = sv.queryCsutAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1);
				long custId = -1;
				if (vals != null && vals.length > 0) {
					custId = vals[0].getRelCustId();
					ICustomerValue customerval = cmCustomerSV.queryCustomerByCustId(custId);
					if (customerval != null) {
						dc.set("PAYER_NAME", customerval.getCustName());
					}
					IBOCmCustContactMediumValue[] cmCustContactMediumValue = cmCustomerSV.queryContactMediumByCondition(custId, CmConstants.AddressId.legalAddress);
					if (cmCustContactMediumValue != null && cmCustContactMediumValue.length > 0) {
						dc.set("PAYER_ADDRESS", cmCustContactMediumValue[0].getAddressDetail());
					}
					cmCustContactMediumValue = cmCustomerSV.queryContactMediumByCondition(custId, CmConstants.AddressId.EMAIL);
					if (cmCustContactMediumValue != null && cmCustContactMediumValue.length > 0) {
						dc.set("PAYER_EMAIL", cmCustContactMediumValue[0].getEmailAddress());
					}
					cmCustContactMediumValue = cmCustomerSV.queryContactMediumByCondition(custId, CmConstants.AddressId.CONTACT_NUMBER);
					if (cmCustContactMediumValue != null && cmCustContactMediumValue.length > 0) {
						dc.set("PAYER_PHONE", cmCustContactMediumValue[0].getContNumber());
					}
				}
				dc.set("ACCT_ID", acctId);

			}
		}
		return dc;
	}

	public DataContainer queryCustomerById(long custId) throws Exception {
		DataContainer dc = null;
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICustomerValue customer = customerSV.queryCustomerByCustId(custId);
		IBOCmCustContactMediumValue address = customerSV.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.legalAddress));
		IBOCmCustContactMediumValue email = customerSV.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.CONTACT_NUMBER));
		if (customer != null) {
			dc = new DataContainer();
			dc.set("CODE", customer.getCustCertCode());
			dc.set("NAME", customer.getCustName());
			dc.set("POST_CODE", customer.getCustZipcode());
			dc.set("CERT_TYPE", customer.getCustCertType());
			dc.set("CERT_CODE", customer.getCustCertCode());
			if (address != null) {
				dc.set("ADDRESS_ID", address.getAddressId());
				dc.set("ADDRESS_DETAIL", address.getAddressDetail());
			}
			if (email != null) {
				dc.set("EMAIL", email.getEmailAddress());
			}
		}
		return dc;
	}

	public void changeStatusToOnline(long custId) throws Exception {
		if (custId > 0) {
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(custValue)) {
				if (CmConstants.CustomerStatus.INDIV_ACTIVE != custValue.getCustStatus()) {
					// 转在网
					custValue.setCustStatus(CmConstants.CustomerStatus.INDIV_ACTIVE);
					CmServiceFactory.getCustomerSV().saveCustomer(custValue);
				}
			} else {
				// 查不到该客户信息
				ExceptionUtil.throwBusinessException("CMS0070191");
			}
		} else {
			// 客户编号不能为空
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#queryCustAcctRelByCnd(long, long[],
	 * java.lang.String, int, int, int, java.lang.String, int, int)
	 */
	public IBOCmCustAcctRelValue[] queryCustAcctRelByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctIds != null && acctIds.length > 0) {
			StringBuffer accts = new StringBuffer("");
			for (int i = 0; i < acctIds.length; i++) {
				if (i == acctIds.length - 1) {
					accts.append(acctIds[i]);
				} else {
					accts.append(acctIds[i]).append(",");
				}
			}
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append(" IN (").append(accts.toString()).append(")");
		}
		if (StringUtils.isNotBlank(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		// 记录日志
		ICmCommonSV commomSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commomSV.saveCommonQryBusiLogWithCustId(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG, relCustd);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);
		return result;
	}

	public IBOCmCustAcctRelValue[] queryCustAcctRelByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			long agrId, int start, int end) throws Exception {
		// AI-12562 Crm app occurred out of memory problem
		if (relCustd <= 0 && ArrayUtils.isEmpty(acctIds) && agrId <=0) {
			return new IBOCmCustAcctRelValue[0];
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctIds != null && acctIds.length > 0) {
			StringBuffer accts = new StringBuffer("");
			for (int i = 0; i < acctIds.length; i++) {
				if (i == acctIds.length - 1) {
					accts.append(acctIds[i]);
				} else {
					accts.append(acctIds[i]).append(",");
				}
			}
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append(" IN (").append(accts.toString()).append(")");
		}
		if (StringUtils.isNotBlank(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (agrId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext3).append("=:agrId");
			parameter.put("agrId", agrId);
		}
		if (agrId == 0) {
			condition.append(" and (").append(IBOCmCustAcctRelValue.S_Ext3).append(" IS NULL ");
			condition.append(" OR ").append(IBOCmCustAcctRelValue.S_Ext3).append(" =:agrId )");
			parameter.put("agrId", agrId);
		}
		// 记录日志
		ICmCommonSV commomSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commomSV.saveCommonQryBusiLogWithCustId(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG, relCustd);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);
		return result;
	}

	@Deprecated
	public IBOCmCustAcctRelValue[] queryCustAcctRelByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String agrId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctIds != null && acctIds.length > 0) {
			StringBuffer accts = new StringBuffer("");
			for (int i = 0; i < acctIds.length; i++) {
				if (i == acctIds.length - 1) {
					accts.append(acctIds[i]);
				} else {
					accts.append(acctIds[i]).append(",");
				}
			}
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append(" IN (").append(accts.toString()).append(")");
		}
		if (StringUtils.isNotBlank(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(agrId) ) {
			if ( StringUtils.contains(agrId, ",") ){
				condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext3).append(" in ( ").append(agrId).append(" ) ");
			}else{
				long agrIdL = Long.parseLong(agrId);
				if ( agrIdL>0 ){
					condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext3).append(" in ( ").append(agrId).append(" ) ");
				}else if ( agrIdL==0 ){
					condition.append(" and (").append(IBOCmCustAcctRelValue.S_Ext3).append(" IS NULL ");
					condition.append(" OR ").append(IBOCmCustAcctRelValue.S_Ext3).append(" = 0 )");
				}
			}
		}else{
			condition.append(" and (").append(IBOCmCustAcctRelValue.S_Ext3).append(" IS NULL ");
			condition.append(" OR ").append(IBOCmCustAcctRelValue.S_Ext3).append(" = 0 )");
		}
		// 记录日志
		ICmCommonSV commomSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commomSV.saveCommonQryBusiLogWithCustId(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG, relCustd);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);
		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#queryCustAcctRelCountByCnd(long, long[],
	 * java.lang.String, int, int, int, java.lang.String)
	 */
	public int queryCustAcctRelCountByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctIds != null && acctIds.length > 0) {
			StringBuffer accts = new StringBuffer("");
			for (int i = 0; i < acctIds.length; i++) {
				if (i == acctIds.length - 1) {
					accts.append(acctIds[i]);
				} else {
					accts.append(acctIds[i]).append(",");
				}
			}
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append(" IN (").append(accts.toString()).append(")");
		}
		if (StringUtils.isNotBlank(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#queryPayerByAcctId4Contract(long)
	 */

	public DataContainer queryPayerByAcctId4Contract(long acctId) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCMPartyAcctRelValue[] partyAcctRelValues = accountSV.queryPartyAccRel(acctId, -1);
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dc = null;
		// IAddressSV addressSv = (IAddressSV)ServiceFactory.getService(IAddressSV.class);
		if (partyAcctRelValues != null && partyAcctRelValues.length > 0) {
			long partyId = partyAcctRelValues[0].getPartyId();
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue result = partySV.queryPayerByPartyId(partyId);
			if (CmCommonUtil.isNotEmptyObject(result)) {
				dc = new DataContainer();
				// 已经是payer获取contId
				long contId = result.getContId();
				if (contId > 0) {
					IQBOCmContactContMediumInfoValue[] mediums = cmCustomerSV.queryContactContMediumInfo(contId, -1, -1);
					// 201主要邮箱301主要电话
					if (null != mediums && mediums.length > 0) {
						for (int i = 0; i < mediums.length; i++) {
							long medType = mediums[i].getContMedTypeId();
							if (medType == 201) {
								dc.set("PAYER_EMAIL", mediums[i].getEmailAddress());
							}
							if (medType == 301) {
								dc.set("PAYER_PHONE", mediums[i].getContNumber());
							}
						}
					}
				} else {
					dc.set("PAYER_EMAIL", "");
					dc.set("PAYER_PHONE", "");
				}
				dc.set("PAYER_NAME", result.getPartyName());
				dc.set("PAYER_ADDRESS", result.getRemarks());
				dc.set("ACCT_TYPE", CmConstants.AccountConstants.REAL_ACCT);
				dc.set("ACCT_ID", acctId);
			}
		} else {// 自有账户
			dc = new DataContainer();
			dc.set("ACCT_TYPE", CmConstants.AccountConstants.SELF_ACCT);
			ICm2SoSV sv = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
			IBOCmCustAcctRelValue[] vals = sv.queryCsutAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1);
			long custId = -1;
			if (vals != null && vals.length > 0) {
				custId = vals[0].getRelCustId();
				ICustomerValue customerval = cmCustomerSV.queryCustomerByCustId(custId);
				if (customerval != null) {
					dc.set("PAYER_NAME", customerval.getCustName());
				}
				IBOCmCustContactMediumValue[] cmCustContactMediumValue = cmCustomerSV.queryContactMediumByCondition(custId, CmConstants.AddressId.legalAddress);
				if (cmCustContactMediumValue != null && cmCustContactMediumValue.length > 0) {
					dc.set("PAYER_ADDRESS", cmCustContactMediumValue[0].getAddressDetail());
				}
				cmCustContactMediumValue = cmCustomerSV.queryContactMediumByCondition(custId, CmConstants.AddressId.EMAIL);
				if (cmCustContactMediumValue != null && cmCustContactMediumValue.length > 0) {
					dc.set("PAYER_EMAIL", cmCustContactMediumValue[0].getEmailAddress());
				}
				cmCustContactMediumValue = cmCustomerSV.queryContactMediumByCondition(custId, CmConstants.AddressId.CONTACT_NUMBER);
				if (cmCustContactMediumValue != null && cmCustContactMediumValue.length > 0) {
					dc.set("PAYER_PHONE", cmCustContactMediumValue[0].getContNumber());
				}
			}
			dc.set("ACCT_ID", acctId);
		}
		return dc;

	}

	@Override
	public DataContainer[] queryPayerByDts(int custType, long custId, String firstName, String LastName, String cpr, String birthDay, long addressId, String companyName,
			String kob, String cvr, int start, int end) throws AIException, Exception {
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		return partySV.queryPayerByDts(custType, custId, firstName, LastName, cpr, birthDay, addressId, companyName, kob, cvr, start, end);

	}

	@Override
	public int queryPayerByDtsCount(int custType, long custId, String firstName, String LastName, String cpr, String birthDay, long addressId, String companyName, String kob,
			String cvr) throws AIException, Exception {
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);

		return partySV.queryPayerByDtsCount(custType, custId, firstName, LastName, cpr, birthDay, addressId, companyName, kob, cvr);
	}

	public boolean ifCustProtected(long custId) throws Exception {
		if (custId > 0) {
			ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			if (indivSV.ifCustIsProtected(custId)) {
				return true;
			}
		} else {
			ExceptionUtil.throwBusinessException("the custId can not be empty");
		}
		return false;
	}

	public long getIndivCustomerByCPR(String cpr) throws Exception {
		if (StringUtils.isNotBlank(cpr)) {
			StringBuilder condition = new StringBuilder(" 1=1 ");
			HashMap parameter = new HashMap();
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertType).append(" =:certType ");
			parameter.put("certType", CmConstants.CertificateType.CPR);
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertCode).append(" =:certCode ");
			parameter.put("certCode", cpr);
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_IndivCustType).append(" =:indivCustType ");
			parameter.put("indivCustType", CmConstants.EntityType.CUSTOMER);
			IBOCmIndivCustomerValue[] values = (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(),
					parameter, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				// 存在这样一个客户返回custId
				return values[0].getCustId();
			} else {
				IVOCustValue voValue = new VOCustBean();
				// 不存在则创建
				ICmCommonSV cmcommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				long custId = cmcommonSV.getCustId(CmConstants.CustomerType.INDIVIDUAL);
				// 根据CPR去CPR系统校验CPR
				ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
				DataContainer dc = getInfoFromCPR(custId, cpr);
				// 创建客户基本信息
				ICustomerValue custValue = new CustomerBean();
				custValue.setCustId(custId);
				custValue.setAnonymousFlag(0);
				custValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
				custValue.setNationality("00400");
				custValue.setProvinceId("9999");
				custValue.setIndivCustType(String.valueOf(CmConstants.EntityType.CUSTOMER));
				if (CmCommonUtil.isNotEmptyObject(dc)) {
					custValue.setFirstName(dc.getAsString("firstName").trim());
					custValue.setLastName(dc.getAsString("lastName").trim());
					Date date = new SimpleDateFormat("yyyyMMdd").parse(dc.getAsString("birth"));
					custValue.setBirthday(new Timestamp(date.getTime()));
				}
				custValue.setCustStatus(CmConstants.CustomerStatus.INDIV_POTENTIAL);
				custValue.setRealNameFlag(0);
				// cprnumber奇数为male,偶数为female
				if (Long.parseLong(cpr) % 2 == 1) {
					custValue.setGender(1);
				} else {
					custValue.setGender(2);
				}
				custValue.setPhysiologicalState(0);
				custValue.setCustLanguage("1");
				custValue.setState(CmConstants.RecordState.USE);
				custValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				voValue.setCustomer(custValue);
				// 创建客户扩展信息
				DataContainerInterface addtion = new DataContainer();
				addtion.set("CONTACT_PROTECTION", 0);
				addtion.set("EXT4", "0");
				addtion.set("EXT6", "0");
				addtion.set("EXT7", "0");
				addtion.set("EXT8", "0");
				addtion.set("EXT9", "0");
				addtion.set("CUST_ID", custId);
				addtion.set("STATE", CmConstants.RecordState.USE);
				addtion.set("REGION_ID", CmCommonUtil.getDefaultRegionId());
				voValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, addtion);
				IBOCmCustSegmentRelaValue value = new BOCmCustSegmentRelaBean();
				value.setCustId(custId);
				value.setSegmentId(Long.parseLong(CmConstants.segment.NEW));
				voValue.setUserObject("cmSegmentRela", value);
				// 保存客户信息
				return CmServiceFactory.getCustomerSV().saveCustomer(voValue);
			}
		} else {
			ExceptionUtil.throwBusinessException("the param is not correct");
		}
		return 0;
	}

	private DataContainer getInfoFromCPR(long custId, String cpr) throws Exception {
		DataContainer dc = new DataContainer();
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		if (StringUtils.isNotBlank(cpr) && custId > 0) {
			IBOCmIndivCustomerValue[] values = service.queryCustomerByCPR(cpr);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				ExceptionUtil.throwBusinessException("CMS9988771");
			}
			Map params = new HashMap();
			params.put("PNR", cpr);
			Map cprData = indivSV.validateCPR(params);
			String FEJLNR = (String) cprData.get("FEJLNR");
			if (!FEJLNR.equals("00")) {
				// CPR在CPR系统中不存在。
				ExceptionUtil.throwBusinessException("CMS9988772");
			}
			Map data1 = (Map) cprData.get("DATA");
			Map data2 = (Map) data1.get("INFO");
			Map currentData = (Map) data2.get("Current_data");
			// 是否受保护
			String isProtected = (String) currentData.get("NVNADRBESKHAENSTART");
			String personStatus = (String) currentData.get("STATUS");
			String var = "[0]*";
			if (!isProtected.matches(var) || "70".equals(personStatus) || "80".equals(personStatus)) {
				// 受保护
				dc.set("protected", "Y");
			} else {
				// 从CPR返回的客户名称
				String firstName = (String) currentData.get("FORNVN");
				String lastName = (String) currentData.get("EFTERNVN");
				// 从CPR返回的生日
				String birthDay = (String) currentData.get("FOEDDTO");
				// 从CPR返回的地址
				String houseNum = ((String) currentData.get("HUSNR")).trim();
				String floor = (String) currentData.get("ETAGE");
				String sideOrApartNum = (String) currentData.get("SIDEDOER");
				String buildNum = (String) currentData.get("SIDEDOER");
				String streetName = (String) currentData.get("VEJADRNVN");
				String city = (String) currentData.get("POSTDISTTXT");
				String smallCity = (String) currentData.get("BYNVN");
				String postCode = (String) currentData.get("POSTNR");
				String coName = (String) currentData.get("CONVN");
				String munici = (String) currentData.get("KOMKOD");
				// 不受保护
				dc.set("protected", "N");
				dc.set("firstName", CmCommonUtil.capitalizeFirstLetter(firstName));
				dc.set("lastName", CmCommonUtil.capitalizeFirstLetter(lastName));
				dc.set("birth", birthDay);
				address address = new address();
				address.setAddressType(CmConstants.Address.ADDRESSTYPE);
				address.setDistrictId(CmConstants.Address.DISTRICTID);
				if (StringUtils.isNotBlank(houseNum)) {
					if (Character.isLetter(houseNum.charAt(houseNum.length() - 1))) {
						address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.substring(0, houseNum.length() - 1).trim())));
						address.setHouseLetter(String.valueOf(houseNum.charAt(houseNum.length() - 1)));
					} else {
						address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.trim())));
						address.setHouseLetter("");
					}
				}
				if (StringUtils.isNotBlank(floor)) {
					address.setFloor(floor.trim());
				} else {
					address.setFloor("");
				}
				if (StringUtils.isNotBlank(streetName)) {
					address.setStreetName(streetName.trim());
				} else {
					address.setStreetName("");
				}
				if (StringUtils.isNotBlank(city)) {
					address.setCity(city.trim());
				} else {
					address.setCity("");
				}
				if (StringUtils.isNotBlank(smallCity)) {
					address.setCounty(smallCity.trim());
				} else {
					address.setCounty("");
				}
				// 根据特殊规则判断sidedoer的走向
				if (StringUtils.isNotBlank(sideOrApartNum)) {
					if (CmCommonUtil.validateSidedoer(sideOrApartNum)) {
						address.setApartment(sideOrApartNum.trim());
						address.setDoorNumber("");
					} else {
						address.setDoorNumber(sideOrApartNum.trim());
						address.setApartment("");
					}
				} else {
					address.setApartment("");
					address.setDoorNumber("");
				}
				if (StringUtils.isNotBlank(postCode)) {
					address.setZipcode(postCode);
				} else {
					address.setZipcode("");
				}
				if (StringUtils.isNotBlank(munici)) {
					address.setMunicipality(munici);
				} else {
					address.setMunicipality("");
				}
				// if (StringUtils.isNotBlank(addressDesc)) {
				// address.setAddrDesc(addressDesc);
				// } else {
				address.setAddrDesc("");
				// }
				address.setMainDoor("");

				// 地址层级中增加CO_NAME
				if (StringUtils.isNotBlank(coName)) {
					address.setCoName(coName);
				} else {
					address.setCoName("");
				}

				// 查询出地址ID
				IAddressSV addressService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
				long addressId = addressService.saveAddress(address);
				// 更新地址
				indivSV.saveCustAddress(custId, addressId);
			}
		}
		return dc;
	}

	public long createDefaultAccount(long custId, String accountName, boolean isUBL, Map UBLInfo) throws Exception {
		if (custId <= 0) {
			ExceptionUtil.throwBusinessException("CMS0010011", String.valueOf(custId));
		}
		int custType = CmCommonUtil.getCustType(custId);
		int acctType = CmConstants.InstallmentFlag.Ordinary_Account;
		String regionId = CmCommonUtil.getDefaultRegionId();
		IVOAccountValue voaAccountValue = new VOAccountBean();

		// 1.设置账户信息
		IAccountValue accountValue = new AccountBean();
		accountValue.setAcctName(accountName);
		accountValue.setCustId(custId);
		accountValue.setState(CmConstants.RecordState.USE);
		accountValue.setRegionId(regionId);
		accountValue.setInstallmentFlag(acctType);// 普通账户
		if (UBLInfo != null && UBLInfo.get("INSTALLMENT_FLAG") != null) {
			// 如果传递了账户类型，则设置
			acctType = Integer.parseInt(UBLInfo.get("INSTALLMENT_FLAG").toString());
			if (acctType == CmConstants.InstallmentFlag.Hardware_Account && custType != CmConstants.CustomerType.GROUP) {
				// 只有集团才能创建Hardware Sale账户
				ExceptionUtil.throwBusinessException("CMS90000096");
			}
			accountValue.setInstallmentFlag(acctType);
		}
		accountValue.setUrgeStopFlag("1");// Normal Tax rate
		if (custType == CmConstants.CustomerType.GROUP) {
			// 如果是集团，tax_flag取集团扩展表属性
			IBOLnCmxGroupCustValue cmxGroupCustValue = CmxServiceFactory.getLnGroupSV().queryGroupCustExtById(custId);
			if (cmxGroupCustValue != null) {
				accountValue.setUrgeStopFlag(String.valueOf(cmxGroupCustValue.getTaxFlag()));
			} else {
				ExceptionUtil.throwBusinessException("CMS8000049");
			}
		}
		accountValue.setAcctBehalfPhone(String.valueOf(CmConstants.YesOrNo.NO));
		voaAccountValue.setAccount(accountValue);

		// 2.设置账户支付信息
		IAcctPaymentValue acctPaymentValue = new AcctPaymentBean();
		acctPaymentValue.setPayMethod(2);// 代付
		acctPaymentValue.setRegionId(regionId);
		acctPaymentValue.setState(CmConstants.RecordState.USE);
		// 设置账户是否出账
		acctPaymentValue.setPaymentAccountType(0);
		if (UBLInfo != null && UBLInfo.get("OUT_ACCOUNT") != null) {
			acctPaymentValue.setPaymentAccountType(Integer.parseInt(UBLInfo.get("OUT_ACCOUNT").toString()));
		}
		voaAccountValue.addPayment(acctPaymentValue);
		voaAccountValue.setPayMethod(2);

		// 3.设置账期
		IAcctBillCycleValue acctBillCycleValue = new AcctBillCycleBean();
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		// 获取账期
		Map result = accountSV.getBillDayAndBillCycle(custId, UBLInfo);
		acctBillCycleValue.setCycleType(Integer.parseInt(result.get("CYCLE_TYPE").toString()));
		acctBillCycleValue.setBillDay(Integer.parseInt(result.get("BILL_DAY").toString()));
		if (acctType == CmConstants.InstallmentFlag.Hardware_Account) {
			// Payment Terms默认8天
			acctBillCycleValue.setBillDueDate(8);
		}
		// 从合同获取
		if (result.get("PAYMENT_TERMS") != null) {
			acctBillCycleValue.setBillDueDate(Long.parseLong(result.get("PAYMENT_TERMS").toString()));
		}
		// 设置账户关联的合同号
		if ((UBLInfo != null) && (UBLInfo.get("AGREEMENT_ID") != null)) {
			accountValue.setAcctPassword(UBLInfo.get("AGREEMENT_ID").toString());
		} else {
			if (result.get("AGREEMENT_ID") != null) {
				accountValue.setAcctPassword(result.get("AGREEMENT_ID").toString());
			}
		}
		acctBillCycleValue.setRegionId(regionId);
		acctBillCycleValue.setState(CmConstants.RecordState.USE);
		voaAccountValue.setBillCycle(acctBillCycleValue);
		voaAccountValue.setPayMethod(2);

		// 如果有传cpr，则用该cpr创建payer
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		if (UBLInfo != null && UBLInfo.get("CPR") != null) {
			long partyId = partySV.createPayer(UBLInfo.get("CPR").toString());
			voaAccountValue.setPayerId(partyId);
		} else {
			// 4.默认创建payer是客户自己
			IQBOCmPartyValue value = partySV.queryPayerbyCustId(custId);
			partySV.createPayerByCds(value);
			voaAccountValue.setPayerId(value.getPartyId());
		}
		// 5.保存账户基本信息
		long acctId = CmServiceFactory.getAccountSV().saveAccount(voaAccountValue);

		// 同步创建billing账单模板，支付方式，账单地址等信息
		// 6.设置支付方式信息
		IBOCmPayChannelValue payChannelValue = new BOCmPayChannelBean();
		payChannelValue.setPaymentType(2);// cash

		// 7.设置账单格式
		IBOCmAcctBillFormatValue bllAcctBillFormatValue = new BOCmAcctBillFormatBean();
		//bllAcctBillFormatValue.setDeliveryMethod(1);// paper
		//bllAcctBillFormatValue.setBillFormat("101110100");// pd
		bllAcctBillFormatValue.setPrintBill(1);// yes
		bllAcctBillFormatValue.setLanguage(5);// Danmark
		bllAcctBillFormatValue.setSidePrinting("1");// single-sideed
		bllAcctBillFormatValue.setEffectiveMethod("0");// Current Cycle
		bllAcctBillFormatValue.setBillingType(1);// DK全部为后付费
		if (isUBL) {
			//bllAcctBillFormatValue.setDeliveryMethod(3);// oioubl
			//bllAcctBillFormatValue.setBillFormat("301111100");// ud
			bllAcctBillFormatValue.setEanQualificator(UBLInfo.get("EAN_QUALIFICATOR").toString());
			bllAcctBillFormatValue.setOioCotactName(UBLInfo.get("OIO_CONTACT_NAME").toString());
			bllAcctBillFormatValue.setOioAccountCode(UBLInfo.get("OIO_ACCOUNT_CODE").toString());
			bllAcctBillFormatValue.setOioUblProfile(UBLInfo.get("OIO_UBL_PROFILE").toString());
			bllAcctBillFormatValue.setOioUtsProfile(UBLInfo.get("OIO_UTS_PROFILE").toString());
			bllAcctBillFormatValue.setOioOrderCode(UBLInfo.get("OIO_ORDER_CODE").toString());
		}

		// 8.设置账单地址
		IBOCmAcctContactValue acctContactValue = new BOCmAcctContactBean();
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		IQBOCmCustContMediumAndTypeValue[] contMediumAndTypeValues = customerSV.queryCustContactMediums(custId, CmConstants.AddressId.legalAddress,
				CmConstants.ContMedium.ENTITY_ADDR, -1, -1);
		if (contMediumAndTypeValues != null && contMediumAndTypeValues.length > 0) {
			acctContactValue.setAddressDetail(contMediumAndTypeValues[0].getAddressDetail());
			acctContactValue.setAddressId(String.valueOf(contMediumAndTypeValues[0].getAddressId()));
		}
		if (isUBL) {
			IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			address address = (address) UBLInfo.get("POSTOAL_ADDRESS");
			long addressId = addressSV.saveAddress(address);
			address realAddress = addressSV.getAddress(addressId, CmConstants.Address.DISTRICTID);
			acctContactValue.setAddressDetail(realAddress.getAddrDesc());
			acctContactValue.setAddressId(String.valueOf(addressId));
		}

		// 9.调用billing实时ws接口
		ICmBillingAcctSV billingAcctSV = (ICmBillingAcctSV) ServiceFactory.getService(ICmBillingAcctSV.class);
		billingAcctSV.saveAcctPayment(acctId, custId, payChannelValue, new IBOCmAcctBillFormatValue[] { bllAcctBillFormatValue }, acctContactValue);
		return acctId;
	}

	public DataContainer queryCustInfoByConditions(long custId, boolean isTop) throws Exception {
		if (custId > 0) {
			DataContainer dc = new DataContainer();
			if (CmConstants.CustomerType.INDIVIDUAL == CmCommonUtil.getCustType(custId)) {
				// 针对个人客户
				StringBuilder condition = new StringBuilder(" SELECT A.GENDER,A.CUST_PASSWORD,A.CUST_CERT_CODE,A.BIRTHDAY,A.FIRST_NAME,A.LAST_NAME,");
				condition.append("B.CPR_ID,D.REQUEST_STATUS,D.STATUS_DATE,C.ADDRESS_ID,C.PROTECT_EFF_DATE FROM {CM_INDIV_CUSTOMER} A,{CM_PARTY} B,");
				condition.append(" {CM_CUST_CONTACT_MEDIUM} C LEFT JOIN {CM_CUST_REQUEST_TASK} D ON C.CUST_ID=D.CUST_ID WHERE A.PARTY_ID=B.PARTY_ID AND A.CUST_ID=C.CUST_ID ");
				condition.append(" AND A.CUST_ID =:custId AND C.CONT_MED_TYPE_ID =:type ");
				HashMap parameter = new HashMap();
				parameter.put("custId", custId);
				parameter.put("type", CmConstants.AddressId.legalAddress);
				DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
				if (CmCommonUtil.isNotEmptyObject(dcs)) {
					dc.set("BUSINESS_TYPE", "Private");
					dc.set("CUSTOMER_PASSWORD", dcs[0].getAsString("CUST_PASSWORD"));
					dc.set("CPR_ID", dcs[0].getAsString("CPR_ID"));
					dc.set("CPR_NO", dcs[0].getAsString("CUST_CERT_CODE"));
					dc.set("BIETHDAY", dcs[0].getAsString("BIRTHDAY"));
					dc.set("CPR_STATUS", dcs[0].getAsString("REQUEST_STATUS"));
					dc.set("CPR_STATUS_DATE", dcs[0].getAsString("STATUS_DATE"));
					dc.set("NAME_ADDRESS_PRO_DATE", dcs[0].getAsString("PROTECT_EFF_DATE"));
					dc.set("FIRST_NAME", dcs[0].getAsString("FIRST_NAME"));
					dc.set("LAST_NAME", dcs[0].getAsString("LAST_NAME"));
					dc.set("GENDER", dcs[0].getAsString("GENDER"));
					// 查询地址信息
					if (null != dcs[0].get("ADDRESS_ID")) {
						IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
						address address = addressSV.getAddress(dcs[0].getAsLong("ADDRESS_ID"), "");
						if (null != address) {
							dc.set("ADDRESS", address);
						}
					}
					return dc;
				}
			} else {
				long rootCustId = 0L;
				if (isTop) {
					// 查询出该层级的根客户
					IBOCmGroupOrgStructValue[] values = (IBOCmGroupOrgStructValue[]) queryGroupOrgStruct(custId);
					if (CmCommonUtil.isNotEmptyObject(values)) {
						rootCustId = values[0].getCustId();

					}
				} else {
					// 查询当前客户
					rootCustId = custId;
				}
				StringBuilder condition = new StringBuilder(" SELECT A.CUST_NAME,A.CUST_CERT_CODE,B.TAX_ID,C.ADDRESS_ID FROM ");
				HashMap parameter = new HashMap();
				condition.append(" {CM_GROUP_CUSTOMER} A,{CMX_GROUP_CUSTOMER} B,{CM_CUST_CONTACT_MEDIUM} C WHERE A.CUST_ID ");
				condition.append(" =B.CUST_ID AND A.CUST_ID=C.CUST_ID AND A.CUST_ID =:custId AND C.CONT_MED_TYPE_ID =:type ");
				parameter.put("custId", rootCustId);
				parameter.put("type", CmConstants.AddressId.legalAddress);
				DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
				if (CmCommonUtil.isNotEmptyObject(dcs)) {
					dc.set("BUSINESS_TYPE", "Company");
					dc.set("CUST_NAME", dcs[0].getAsString("CUST_NAME"));
					dc.set("CVR_NO", dcs[0].getAsString("TAX_ID"));
					dc.set("KOB", dcs[0].getAsString("CUST_CERT_CODE"));
					if (null != dcs[0].get("ADDRESS_ID")) {
						IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
						address address = addressSV.getAddress(dcs[0].getAsLong("ADDRESS_ID"), "");
						dc.set("ADDRESS", address);
					}
					return dc;
				}
			}
		}
		return null;
	}

	private IBOCmGroupOrgStructValue[] queryGroupOrgStruct(long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_RelCustId).append(" =:custId ");
		parameter.put("custId", custId);
		return (IBOCmGroupOrgStructValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean.class,
				condition.toString(), parameter, -1, -1);
	}

	public IQBOCmGroupPartyValue[] queryGroupContact(long custId, int contType, int startNum, int endNum) throws Exception {
		ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		return contactSV.queryGroupContact(custId, contType, startNum, endNum);
	}

	public int queryGroupContactCount(long custId, int contType) throws Exception {
		ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		return contactSV.queryGroupContactCount(custId, contType);
	}

	public Map queryPayerAddress(long acctId) throws Exception {
		Map map = new HashMap();
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCMPartyAcctRelValue[] partyAcctValue = acctSV.queryPartyAccRel(acctId, -1);
		if (CmCommonUtil.isNotEmptyObject(partyAcctValue)) {
			long partyId = partyAcctValue[0].getPartyId();
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue payerValue = partySV.queryPayerByPartyId(partyId);
			if (CmCommonUtil.isNotEmptyObject(payerValue)) {
				if (payerValue.getPartyType() == CmConstants.PartyType.INDIVIDUAL) {
					// 个人
					map.put("FIRST_NAME", payerValue.getFirstName());
					map.put("CPR_ID", payerValue.getCertCode());
				} else {
					// 集团
					map.put("KOB", payerValue.getCertCode());
					map.put("LAST_BUSINESS_NAME", payerValue.getPartyName());
					// 查询税号
					if (StringUtils.isNotBlank(payerValue.getCertCode())) {
						ICmGroupCustomerSV customerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
						ICustomerValue custValue = customerSV.queryCustomerByKobNumber(payerValue.getCertCode());
						if (custValue != null) {
							map.put("CVR", custValue.getTaxId());
						}
					}
				}
				// 查询地址信息
				IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
				address address = addressSV.getAddress(DataType.getAsLong(payerValue.getContAddress()), null);
				if (address != null) {
					map.put("ADDRESS_OBJECT", address);
					map.put("ZIP", address.getZipcode());
					map.put("CITY", address.getCity());
					map.put("COUNTRY", address.getCountry());
					map.put("DIRECTORY", address.getApartment());
					map.put("DISTRICT", address.getDistrictId());
					map.put("DOOR_NUMBER", address.getDoorNumber());
					map.put("HOUSE_LETTER", address.getHouseLetter());
					map.put("HOUSE_NUMBER", address.getHouseNumber());
					map.put("ADDRESS", address.getAddrDesc());
					// map.put("STORY", address.);
					map.put("STREET_NAME", address.getStreetName());
					// map.put("CO_ADDRESS", address.get);
					map.put("BUILDING_NUMBER", address.getApartment());

				}

			} else {
				// 根据partyId查询不到payer信息
				return null;
			}
		} else {
			// 账户没有payer
			return null;
		}
		return map;
	}

	// CONTACT_ROLE FULL_NAME PHONE_NUMBER EMAIL CONTACT_ROLE_NAME
	public DataContainerInterface[] queryGroupContactsInfo(long custId, int contType, boolean isTop) throws Exception {
		if (custId > 0) {
			IContactValue[] contacts = null;
			if (isTop) {
				ICustOrganizeValue custOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(custId);
				if (custOrganizeValue != null) {
					custId = custOrganizeValue.getCustId();
				}
			}
			ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			contacts = customerSV.queryGroupCustomerContacts(custId, contType);
			if (contacts != null && contacts.length > 0) {
				DataContainerInterface[] results = new DataContainerInterface[contacts.length];

				for (int i = 0; i < contacts.length; i++) {
					results[i] = new DataContainer();
					results[i].set("CONTACT_ROLE", contacts[i].getContType());
					IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_GROUP_CUST_CONT_TYPE", String.valueOf(contacts[i].getContType()));
					if (staticDataValue != null) {
						results[i].set("CONTACT_ROLE_NAME", staticDataValue.getCodeName());
					}

					results[i].set("FULL_NAME", contacts[i].getContName());
					String phone = StringUtils.isBlank(contacts[i].getMainContNumber()) ? contacts[i].getSecondContNumber() : contacts[i].getMainContNumber();
					results[i].set("PHONE_NUMBER", phone);
					String email = StringUtils.isBlank(contacts[i].getMainEmail()) ? contacts[i].getSecondEmail() : contacts[i].getMainEmail();
					results[i].set("EMAIL", email);
				}
				return results;
			}
		}
		return new DataContainerInterface[0];
	}

	public IBOCmCustContactMediumValue[] queryCustContactMediaByCond(long custId, List conMedTypeIds) throws Exception {
		List result = new ArrayList();
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		for (int i = 0; i < conMedTypeIds.size(); i++) {
			String typeId = String.valueOf(conMedTypeIds.get(i));
			IBOCmCustContactMediumValue[] values = sv.queryCustContactMediums(custId, typeId);
			if (values != null && values.length > 0) {
				for (int j = 0; j < values.length; j++) {
					result.add(values[j]);
				}
			}
		}
		if (!result.isEmpty()) {
			return (IBOCmCustContactMediumValue[]) result.toArray(new IBOCmCustContactMediumValue[0]);
		}
		return new IBOCmCustContactMediumValue[0];
	}

	@Override
	public int queryCustAcctRelCountByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, long agrId)
			throws Exception {
		int count = 0;
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctIds != null && acctIds.length > 0) {
			StringBuffer accts = new StringBuffer("");
			for (int i = 0; i < acctIds.length; i++) {
				if (i == acctIds.length - 1) {
					accts.append(acctIds[i]);
				} else {
					accts.append(acctIds[i]).append(",");
				}
			}
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append(" IN (").append(accts.toString()).append(")");
		}
		if (StringUtils.isNotBlank(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (agrId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext3).append("=:agrId");
			parameter.put("agrId", agrId);
		}
		if (agrId == 0) {
			condition.append(" and (").append(IBOCmCustAcctRelValue.S_Ext3).append(" IS NULL ");
			condition.append(" OR ").append(IBOCmCustAcctRelValue.S_Ext3).append(" =:agrId )");
			parameter.put("agrId", agrId);
		}
		count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
		return count;
	}

	@Override
	public int queryCustAcctRelCountByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, String agrId)
			throws Exception {
		int count = 0;
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctIds != null && acctIds.length > 0) {
			StringBuffer accts = new StringBuffer("");
			for (int i = 0; i < acctIds.length; i++) {
				if (i == acctIds.length - 1) {
					accts.append(acctIds[i]);
				} else {
					accts.append(acctIds[i]).append(",");
				}
			}
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append(" IN (").append(accts.toString()).append(")");
		}
		if (StringUtils.isNotBlank(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(agrId) ) {
			if ( StringUtils.contains(agrId, ",") ){
				condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext3).append(" in ( ").append(agrId).append(" ) ");
			}else{
				long agrIdL = Long.parseLong(agrId);
				if ( agrIdL>0 ){
					condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext3).append(" in ( ").append(agrId).append(" ) ");
				}else if ( agrIdL==0 ){
					condition.append(" and (").append(IBOCmCustAcctRelValue.S_Ext3).append(" IS NULL ");
					condition.append(" OR ").append(IBOCmCustAcctRelValue.S_Ext3).append(" = 0 )");
				}
			}
		}else{
			condition.append(" and (").append(IBOCmCustAcctRelValue.S_Ext3).append(" IS NULL ");
			condition.append(" OR ").append(IBOCmCustAcctRelValue.S_Ext3).append(" = 0 )");
		}
		count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
		return count;
	}
	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV#isWholesaleCustomerCanNewConnction(long)
	 */
	public boolean isWholesaleCustomerCanNewConnction(long custId) throws Exception {
		boolean isWholesaleCustomerCanNewConnction = false;
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue customerVal = cmCustomerSV.queryDKCustomer(custId);
		if (customerVal != null && customerVal.getCustStatus() != CmConstants.CustomerStatus.GROUP_TERMINATED) {
			isWholesaleCustomerCanNewConnction = true;
		}
		return isWholesaleCustomerCanNewConnction;
	}

	public boolean validateCustomerName(long custId, String custName) throws Exception {
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return customerSV.validateCustomerName(custId, custName);
	}

	public long saveDefaultCustomer(String firstName, String lastName) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return customerSV.saveDefaultCustomer(-1, firstName, lastName);
	}
	
	public DataContainer[] queryAcctByCustId(long custId, long accountId,String accountName,String ean,String payerName,int substatesFilter, boolean containAddress, int aStartNum,int aEndNum) throws Exception {
		
		if (custId > 0) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT  a.ACCT_NAME,  a.ACCT_ID,  c.PARTY_ID,c.PARTY_NAME ,c.FIRST_NAME,c.LAST_NAME,  c.PARTY_TYPE,  c.CERT_CODE,  d.CONT_ADDRESS,  e.BIRTHDAY,  f.ean, g.SUB_ACCT_STATUS ");
			sql.append(" FROM  {CM_CUST_ACCT_REL} a ");
			sql.append(" LEFT JOIN {CM_BILLING_ACCT} f ");
			sql.append(" ON a.ACCT_ID=f.acct_id  ");
			sql.append(" LEFT JOIN {CM_PARTY_ACCT_REL} b");
			sql.append(" ON a.ACCT_ID = b.ACCT_ID ");
			sql.append(" LEFT JOIN {CM_PARTY} c ");
			sql.append(" ON b.PARTY_ID = c.PARTY_ID  ");
			sql.append(" LEFT JOIN {CM_PARTY_CONTACT} d ");
			sql.append(" ON c.PARTY_ID=d.PARTY_ID ");
			sql.append(" LEFT JOIN {CM_INDIV_PARTY} e");
			sql.append(" ON e.PARTY_ID=d.PARTY_ID");
			sql.append(" LEFT JOIN {CM_ACCT_SUB_STATUS} g");
			sql.append(" ON a.ACCT_ID=g.ACCT_ID");
			sql.append("  WHERE 1=1 AND a.EXT1 IN(1,2,3) AND a.STATE = 'U' ");
			Map parameter = new HashMap();
			
			if (accountId > 0) {
				sql.append(" AND a.ACCT_ID = ").append(":acctId");
				parameter.put("acctId", accountId);
			}
			if (custId > 0) {
				sql.append(" AND a.REL_CUST_ID = ").append(":custId");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(accountName)) {
				sql.append(" AND a.ACCT_NAME like ").append(":acctName");
				parameter.put("acctName", "%" + accountName + "%");
			}
			if (StringUtils.isNotBlank(ean)) {
				sql.append(" AND f.ean like ").append(":ean");
				parameter.put("ean", "%" + ean + "%");
			}
			if (StringUtils.isNotBlank(payerName)) {
				sql.append(" AND c.PARTY_NAME like ").append(":payerName");
				parameter.put("payerName", "%" + payerName + "%");
			}
			if ( substatesFilter==0 ){
				// 如果 substatesFilter ==0  需要过滤调   SUB_ACCT_STATUS == 1 SUB_ACCT_STATUS ==2 的数据
				sql.append(" AND ( g.SUB_ACCT_STATUS IS NULL OR (g.SUB_ACCT_STATUS <> 1 AND g.SUB_ACCT_STATUS <> 2) ) ");
			}
			if ((aStartNum >= 0) || (aEndNum >= 0)) {
				if ((aStartNum < 0) && (aEndNum >= 0)) {
					sql.append(" limit ").append("0").append(",").append(aEndNum);
				} else if ((aEndNum < 0) && (aStartNum >= 0)) {
					if (aStartNum > 0) {
						sql.append(" limit ").append(aStartNum - 1).append(",").append("18446744073709551615");
					} else {
						sql.append(" limit ").append(aStartNum).append(",").append("18446744073709551615");
					}

				} else if (aEndNum < aStartNum) {
					sql.append(" limit ").append("0").append(",").append("0");
				} else {
					int offset = aEndNum - aStartNum + 1;
					int tmpStart = 0;
					if (aStartNum > 0) {
						tmpStart = aStartNum - 1;
					} else {
						tmpStart = 0;
					}
					sql.append(" limit ").append(tmpStart).append(",").append(offset);
				}
			}
			DataContainer dc[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			int count = 0;
			// 查询服务性能优化
			if (StringUtils.isBlank(ean) && StringUtils.isBlank(payerName) && StringUtils.isBlank(accountName)) {
				if (accountId <= 0) {
					count = queryCustAcctRelCountByCnd(custId, null, null, -1, -1, -1, null);
				} else {
					count = queryCustAcctRelCountByCnd(custId, new long[] { accountId }, null, -1, -1, -1, null);
				}
			} else {
				count = queryAcctCountByCustId(custId, accountId, accountName, ean, payerName, 1);
			}
			if (CmCommonUtil.isNotEmptyObject(dc)) {
				// add by zhaiwg TELENOR_REQ_20190107_0001
				if(!containAddress) {
					return dc;
				}
				
				IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
				for (int i = 0; i < dc.length; i++) {
					long addressId = dc[i].getAsLong("CONT_ADDRESS");
					if (addressId > 0) {
						address address = addressSV.getAddress(addressId, null);
						dc[i].set("ADDRESS", address);
						dc[i].set("COUNT", count);
					} else {
						dc[i].set("ADDRESS", null);
						dc[i].set("COUNT", count);
					}

				}
				return dc;
			} else {
				return null;
			}
		} else {
			return null;
		}

	}
	public DataContainer[] queryAcctIdsByCustId(long custId,int substatesFilter,  int aStartNum,int aEndNum) throws Exception {
		
		if (custId > 0) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT   a.ACCT_ID ");
			sql.append(" FROM  {CM_CUST_ACCT_REL} a ");
			sql.append(" LEFT JOIN {CM_BILLING_ACCT} f ");
			sql.append(" ON a.ACCT_ID=f.acct_id  ");
			sql.append(" LEFT JOIN {CM_PARTY_ACCT_REL} b");
			sql.append(" ON a.ACCT_ID = b.ACCT_ID ");
			sql.append(" LEFT JOIN {CM_PARTY} c ");
			sql.append(" ON b.PARTY_ID = c.PARTY_ID  ");
			sql.append(" LEFT JOIN {CM_PARTY_CONTACT} d ");
			sql.append(" ON c.PARTY_ID=d.PARTY_ID ");
			sql.append(" LEFT JOIN {CM_INDIV_PARTY} e");
			sql.append(" ON e.PARTY_ID=d.PARTY_ID");
			sql.append(" LEFT JOIN {CM_ACCT_SUB_STATUS} g");
			sql.append(" ON a.ACCT_ID=g.ACCT_ID");
			sql.append("  WHERE 1=1 AND a.EXT1 IN(1,2,3) AND a.STATE = 'U' ");
			Map parameter = new HashMap();
			if (custId > 0) {
				sql.append(" AND a.REL_CUST_ID = ").append(":custId");
				parameter.put("custId", custId);
			}
			if ( substatesFilter==0 ){
				// 如果 substatesFilter ==0  需要过滤调   SUB_ACCT_STATUS == 1 SUB_ACCT_STATUS ==2 的数据
				sql.append(" AND ( g.SUB_ACCT_STATUS IS NULL OR (g.SUB_ACCT_STATUS <> 1 AND g.SUB_ACCT_STATUS <> 2) ) ");
			}
			if ((aStartNum >= 0) || (aEndNum >= 0)) {
				if ((aStartNum < 0) && (aEndNum >= 0)) {
					sql.append(" limit ").append("0").append(",").append(aEndNum);
				} else if ((aEndNum < 0) && (aStartNum >= 0)) {
					if (aStartNum > 0) {
						sql.append(" limit ").append(aStartNum - 1).append(",").append("18446744073709551615");
					} else {
						sql.append(" limit ").append(aStartNum).append(",").append("18446744073709551615");
					}
					
				} else if (aEndNum < aStartNum) {
					sql.append(" limit ").append("0").append(",").append("0");
				} else {
					int offset = aEndNum - aStartNum + 1;
					int tmpStart = 0;
					if (aStartNum > 0) {
						tmpStart = aStartNum - 1;
					} else {
						tmpStart = 0;
					}
					sql.append(" limit ").append(tmpStart).append(",").append(offset);
				}
			}
			DataContainer dc[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			return dc;
		} 
		return null;
	}

	public DataContainer[] queryAcctByCustId(long custId, long accountId, String accountName, String ean, String payerName, int substatesFilter, int aStartNum, int aEndNum) throws Exception {
		return queryAcctByCustId(custId, accountId, accountName, ean, payerName, substatesFilter, true, aStartNum, aEndNum);
	}

	public int queryAcctCountByCustId(long custId, long accountId, String accountName, String ean, String payerName, int substatesFilter) throws Exception {
		if (custId > 0) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT COUNT(1) as COUNT ");
			sql.append(" FROM  {CM_CUST_ACCT_REL} a ");
			sql.append(" LEFT JOIN {CM_BILLING_ACCT} f ");
			sql.append(" ON a.ACCT_ID=f.acct_id  ");
			sql.append(" LEFT JOIN {CM_PARTY_ACCT_REL} b");
			sql.append(" ON a.ACCT_ID = b.ACCT_ID ");
			sql.append(" LEFT JOIN {CM_PARTY} c ");
			sql.append(" ON b.PARTY_ID = c.PARTY_ID  ");
			sql.append(" LEFT JOIN {CM_PARTY_CONTACT} d ");
			sql.append(" ON c.PARTY_ID=d.PARTY_ID ");
			sql.append(" LEFT JOIN {CM_INDIV_PARTY} e");
			sql.append(" ON e.PARTY_ID=d.PARTY_ID");
			sql.append(" LEFT JOIN {CM_ACCT_SUB_STATUS} g");
			sql.append(" ON a.ACCT_ID=g.ACCT_ID");
			sql.append("  WHERE 1=1 AND a.EXT1 IN(1,2,3) AND a.STATE = 'U'");
			
			Map parameter = new HashMap();
			if (accountId > 0) {
				sql.append(" AND a.ACCT_ID = ").append(":acctId");
				parameter.put("acctId", accountId);
			}
			if (custId > 0) {
				sql.append(" AND a.REL_CUST_ID = ").append(":custId");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(accountName)) {
				sql.append(" AND a.ACCT_NAME like ").append(":acctName");
				parameter.put("acctName", "%" + accountName + "%");
			}
			if (StringUtils.isNotBlank(ean)) {
				sql.append(" AND f.ean like ").append(":ean");
				parameter.put("ean", "%" + ean + "%");
			}
			if (StringUtils.isNotBlank(payerName)) {
				sql.append(" AND c.PARTY_NAME like ").append(":payerName");
				parameter.put("payerName", "%" + payerName + "%");
			}
			if ( substatesFilter==0 ){
				// 如果 substatesFilter ==0  需要过滤调   SUB_ACCT_STATUS == 1 SUB_ACCT_STATUS ==2 的数据
				sql.append(" AND ( g.SUB_ACCT_STATUS IS NULL OR (g.SUB_ACCT_STATUS <> 1 AND g.SUB_ACCT_STATUS <> 2) ) ");
			}
			DataContainer dc[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			if (CmCommonUtil.isNotEmptyObject(dc)) {
				return dc[0].getAsInt("COUNT");
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public DataContainer[] queryAcctByAcctIds(Long acctIds[]) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(acctIds)) {
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
			IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			ICmDKAccountSV dkAccountSV = (ICmDKAccountSV) ServiceFactory.getService(ICmDKAccountSV.class);
			List<DataContainer> list = new ArrayList();
			for (long acctId : acctIds) {
				IBOCmCustAcctRelValue[] custAcctRelValue = accountSV.queryCustAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1, null, null);
				if (CmCommonUtil.isNotEmptyObject(custAcctRelValue)) {
					for (IBOCmCustAcctRelValue value : custAcctRelValue) {
						if ((Integer.parseInt(value.getExt1()) == CmConstants.AccountStatus.NORMAL || Integer.parseInt(value.getExt1()) == CmConstants.AccountStatus.DUNING || Integer
								.parseInt(value.getExt1()) == CmConstants.AccountStatus.PRE_TERM) && value.getState().equalsIgnoreCase(CmConstants.RecordState.USE)) {
							DataContainer dc = new DataContainer();
							dc.set("ACCT_NAME", value.getAcctName());
							dc.set("ACCT_ID", value.getAcctId());
							IBOCMPartyAcctRelValue[] partyAcctValue = accountSV.queryPartyAccRel(value.getAcctId(), -1);
							if (CmCommonUtil.isNotEmptyObject(partyAcctValue)) {
								IQBOCmPartyValue payerInfo = partySV.queryPayerByPartyId(partyAcctValue[0].getPartyId());
								if (CmCommonUtil.isNotEmptyObject(payerInfo)) {
									dc.set("PAYER", payerInfo);
									address address = addressSV.getAddress(DataType.getAsLong(payerInfo.getContAddress()), null);
									dc.set("Address", address);
									list.add(dc);
									IBOCmBillingAcctValue[] billAcctValue = dkAccountSV.queryBillingAcct(acctId,null,null);
									if (CmCommonUtil.isNotEmptyObject(billAcctValue)) {
										dc.set("EAN", billAcctValue[0].getEan());
									}
								}
							}
						}
					}

				}
			}
			return (DataContainer[]) list.toArray(new DataContainer[0]);
		} else {
			return null;
		}

	}

	public long saveDefaultCustomerNew(String firstName, String lastName, Map paraMap) throws Exception {
		if (StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName)) {
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IVOCustValue custValue = new VOCustBean();
			// 提供给订单创建默认客户
			ICustomerValue customerValue = new CustomerBean();
			if (StringUtils.isNotBlank(firstName)) {
				customerValue.setFirstName(firstName);
			}
			if (StringUtils.isNotBlank(lastName)) {
				customerValue.setLastName(lastName);
			}
			if (paraMap != null) {
				Iterator iter = paraMap.entrySet().iterator();
				Entry entry;
				while (iter.hasNext()) {
					entry = (Entry) iter.next();
					customerValue.set(entry.getKey().toString(), entry.getValue().toString());
				}
			}
			custValue.setCustomer(customerValue);
			return customerSV.saveDefaultCustomer(custValue);
		}
		return -1;
	}

	public ICustOrganizeValue[] queryCustOrganizesByCdns(long rootCustId, long childCustId, String childCustName, int startNum, int endNum) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, rootCustId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.SUB_COMPANY);// 查询子公司
		if (childCustId > 0) {
			dContainer.set(ICustOrganizeValue.S_RelCustId, childCustId);
		}
		if (StringUtils.isNotBlank(childCustName)) {
			dContainer.set(ICustOrganizeValue.S_DeptName, childCustName);
			dContainer.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.RIGHT_MATCH);
		}
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
		return values;
	}

	public int queryCustOrganizeCountByCdns(long rootCustId, long childCustId, String childCustName) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, rootCustId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.SUB_COMPANY);// 查询子公司
		if (childCustId > 0) {
			dContainer.set(ICustOrganizeValue.S_RelCustId, childCustId);
		}
		if (StringUtils.isNotBlank(childCustName)) {
			dContainer.set(ICustOrganizeValue.S_DeptName, childCustName);
			dContainer.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.RIGHT_MATCH);
		}
		return busi.queryCount(new DataContainer[] { dContainer });
	}

	public ICustOrganizeValue[] queryCustOrganizesSubOrgCustId(long childCustId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICustOrganizeValue temp = customerSV.queryCustOrganizesByrelCustId(childCustId);
		if (temp != null) {
			long rootCustId = temp.getCustId();
			ICustOrganizeValue[] results = customerSV.queryCustOrganizesByCustId(rootCustId, -1, -1);
			if (results != null && results.length > 0) {
				return results;
			}
		}
		return null;

	}
	
	
	public void updateAcctAgreement(long acctId, long agreementId , Map otherMap) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountValue acctValue  = acctSV.queryAccountById(acctId);
		String oldAreeId  = acctValue.getAcctPassword();
		acctValue.setAcctPassword(String.valueOf(agreementId));
		IVOAccountValue value = new VOAccountBean();
		value.setAccount(acctValue);
		acctSV.saveAccount(value);
		
//		// 同步合同和账户的关系
//		IAcctAgreemnetRelValue oldacctAgrRel = new AcctAgreemnetRelBean();
//		IAcctAgreemnetRelValue nowacctAgrRel = new AcctAgreemnetRelBean();
//		//计算生效时间
//		IBOCmCustAcctRelValue[] custAcctRelValue= acctSV.queryCustAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1, null, String.valueOf(oldAreeId));
//		// 删除
//		oldacctAgrRel.setAgreementId(Long.parseLong(oldAreeId));
//		oldacctAgrRel.setAcctId(acctId);
//		oldacctAgrRel.setTenantId(ServiceManager.getUser().getTenantId());
//		oldacctAgrRel.setCommitDate(ServiceManager.getOpDateTime());
//		if (CmCommonUtil.isNotEmptyObject(custAcctRelValue)) {
//			oldacctAgrRel.setValidDate(custAcctRelValue[0].getEffectiveDate());
//		}else {
//			oldacctAgrRel.setValidDate(acctValue.getCreateDate());
//		}
//		oldacctAgrRel.setExtAttr("EXPIRE_DATE", ServiceManager.getOpDateTime());
//		oldacctAgrRel.setOperType(AcctAgreemnetRelBean.DELETE);
//		//新增
//		nowacctAgrRel.setAgreementId(agreementId);
//		nowacctAgrRel.setAcctId(acctId);
//		nowacctAgrRel.setTenantId(ServiceManager.getUser().getTenantId());
//		nowacctAgrRel.setCommitDate(ServiceManager.getOpDateTime());
//		nowacctAgrRel.setValidDate(ServiceManager.getOpDateTime());
//		nowacctAgrRel.setExtAttr("EXPIRE_DATE", TimeUtil.MAX_EXPIRE_DATE);
//		nowacctAgrRel.setOperType(AcctAgreemnetRelBean.ADD);	
//		IVOAccountValue accountValue = new VOAccountBean();
//		accountValue.addAcctAgrRelValue(oldacctAgrRel);	
//		accountValue.addAcctAgrRelValue(nowacctAgrRel);	
//		
//		IVOCustValue custValue = new VOCustBean();
//		custValue.addAccount(accountValue);
//		IInterfaceBillCrmSV billingSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
//		billingSV.sendCustOrderInfoToBilling(custValue, acctValue.getRegionId());
		
		// 同步合同和账户的关系
		List acctAgrRelList =new ArrayList();
		Map temp0=new HashMap();
		Map temp1=new HashMap();
		//过滤没有旧的账户合同关系
		if (StringUtils.isNotBlank(oldAreeId)){
			//删除旧的关系
			temp0.put(IAcctAgreemnetRelValue.S_AcctId, acctId);
			temp0.put(IAcctAgreemnetRelValue.S_AgreementId, oldAreeId);
			temp0.put(IAcctAgreemnetRelValue.S_OperType, AcctAgreemnetRelBean.DELETE);
			//计算生效时间
			IBOCmCustAcctRelValue[] custAcctRelValue= acctSV.queryCustAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1, null, String.valueOf(oldAreeId));
			if (CmCommonUtil.isNotEmptyObject(custAcctRelValue)){
				temp0.put(IAcctAgreemnetRelValue.S_ValidDate, custAcctRelValue[0].getEffectiveDate());
			}else {
				temp0.put(IAcctAgreemnetRelValue.S_ValidDate, acctValue.getCreateDate());
			}
			temp0.put("EXPIRE_DATE", ServiceManager.getOpDateTime());
			temp0.put(IAcctAgreemnetRelValue.S_CommitDate, ServiceManager.getOpDateTime());
			temp0.put("DONE_CODE", ServiceManager.getDoneCode());
			temp0.put(IAcctAgreemnetRelValue.S_DoneDate, ServiceManager.getOpDateTime());
			temp0.put(IAcctAgreemnetRelValue.S_TenantId, TenantIDFactory.getTenantId());
			temp0.put("OPERATOR_ID",ServiceManager.getUser().getID());
			temp0.put("OPERATOR_DATE",ServiceManager.getOpDateTime());
			temp0.put("ORG_ID",ServiceManager.getUser().getOrgId());
			acctAgrRelList.add(temp0);
		}
		//新增新的关系
		temp1.put(IAcctAgreemnetRelValue.S_AcctId, acctId);
		temp1.put(IAcctAgreemnetRelValue.S_AgreementId, agreementId);
		temp1.put(IAcctAgreemnetRelValue.S_OperType, AcctAgreemnetRelBean.ADD);
		temp1.put(IAcctAgreemnetRelValue.S_ValidDate, ServiceManager.getOpDateTime());
		temp1.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
		temp1.put(IAcctAgreemnetRelValue.S_CommitDate, ServiceManager.getOpDateTime());
		temp1.put("DONE_CODE", ServiceManager.getDoneCode());
		temp1.put(IAcctAgreemnetRelValue.S_DoneDate, ServiceManager.getOpDateTime());
		temp1.put(IAcctAgreemnetRelValue.S_TenantId, TenantIDFactory.getTenantId());
		temp1.put("OPERATOR_ID",ServiceManager.getUser().getID());
		temp1.put("OPERATOR_DATE",ServiceManager.getOpDateTime());
		temp1.put("ORG_ID",ServiceManager.getUser().getOrgId());
		acctAgrRelList.add(temp1);
		Map result = new HashMap();
		result.put("I_ACCT_AGR_REL", acctAgrRelList);
		IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
		interfaceBillCrmSV.sendMapOrderInfoToBilling(result);
		
	}
	
	public int queryCmInsCmrelCountNew(long custId, long userId, int relType, int userType, long prodCatalogId, List offerIdList, int Ext1, boolean vpnFlag) throws Exception{
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		if (relType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		if (userType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserType).append(" =:userType ");
			parameter.put("userType", userType);
		}
		if (prodCatalogId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" =:prodCatalogId ");
			parameter.put("prodCatalogId", prodCatalogId);
		}
		if (prodCatalogId == 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" NOT IN( ").append(RBossConst.PROD_CATALOG_GSM).append(",").append(RBossConst.PROD_CATALOG_FIXEDPHONE).append(",").append(RBossConst.PROD_CATALOG_BROADBAND).append(",").append(RBossConst.PROD_CATALOG_MULTIPLAN).append(",").append(RBossConst.PROD_CATALOG_NODICCONNECT).append(")");
		}
		if (offerIdList != null &&offerIdList.size()>0){
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_OfferId).append(" IN (");
			String str2="";
			for(int j=0;j<offerIdList.size();j++){
				str2 =str2 + offerIdList.get(j) + ",";
			}
			condition.append(str2.substring(0, str2.length()-1)).append(")");
		}else if(vpnFlag){
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_OfferId).append(" !=:offerId ");
			parameter.put("offerId", 70130);
		}
		if (Ext1>0){
			//对应页面上suspend情况。
			if(Ext1 == 8){
				condition.append(" AND ").append(IBOCmInsCmrelValue.S_Ext1).append(" =:Ext1 ");
				parameter.put("Ext1", 1);
				condition.append(" AND LOCATE('1',").append(IBOCmInsCmrelValue.S_Ext2).append(") >0 ");
			}else{
				condition.append(" AND ").append(IBOCmInsCmrelValue.S_Ext1).append(" =:Ext1 ");
				parameter.put("Ext1", Ext1);
			}
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmInsCmrelBean.class, condition.toString(), parameter);
	}
	
	public boolean compareHierarchy(long custId1, long custId2) throws Exception{
		IBOCmGroupOrgStructValue[] value1 = queryGroupOrgStruct(custId1);
		IBOCmGroupOrgStructValue[] value2 = queryGroupOrgStruct(custId2);
		if (CmCommonUtil.isNotEmptyObject(value1) && CmCommonUtil.isNotEmptyObject(value2) && value1[0].getCustId() == value2[0].getCustId()){
			return true;
		}
		return false;
	}

	@Override
	public List<Long> getSameHierarchyCustId(long custId) throws Exception {
		List<Long> custList = new ArrayList<Long>();
		//根据custid查出层级记录
		ICustOrganizeValue custOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(custId);
		//根据该客户的层级记录，查出同一个父层级下的所有层级
		if(custOrganizeValue.getParentDeptId()>0){
			ICustOrganizeValue[] custOrganizeValues = CmServiceFactory.getCustomerSV().queryCustOrganizesByParentId(custOrganizeValue.getParentDeptId(), -1, -1);
			if (null != custOrganizeValues && custOrganizeValues.length > 0) {
				for (int i = 0; i < custOrganizeValues.length; i++) {
					getSubNodeDeptIds(custOrganizeValues[i],custList);
				}
			}
		}else{
			//如果没有parentDeptId，那么就直接判断custId并返回
			ICmCustomerSV custsv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue cust = custsv.queryDKCustomer(custOrganizeValue.getRelCustId());
			if(cust != null && cust.getState().equals(CmConstants.RecordState.USE) &&
					(cust.getCustStatus()==CmConstants.CustomerStatus.GROUP_ACTIVE || cust.getCustStatus()==CmConstants.CustomerStatus.GROUP_PAUSE)){
				custList.add(custId);
			}
		}
		
		return custList;
	}
	private void getSubNodeDeptIds(ICustOrganizeValue custOrganizeValue, List<Long> deptIdsList) throws Exception {
		if(custOrganizeValue.getRelCustId() > 0){
			ICmCustomerSV custsv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue cust = custsv.queryDKCustomer(custOrganizeValue.getRelCustId());
			if(cust != null && cust.getState().equals(CmConstants.RecordState.USE) &&
					(cust.getCustStatus()==CmConstants.CustomerStatus.GROUP_ACTIVE || cust.getCustStatus()==CmConstants.CustomerStatus.GROUP_PAUSE)){
				deptIdsList.add(custOrganizeValue.getRelCustId());
			}
		}
		ICustOrganizeValue[] custOrganizeValues = CmServiceFactory.getCustomerSV().queryCustOrganizesByParentId(custOrganizeValue.getDeptId(), -1, -1);
		if (null != custOrganizeValues && custOrganizeValues.length > 0) {
			for (int i = 0; i < custOrganizeValues.length; i++) {
				getSubNodeDeptIds(custOrganizeValues[i], deptIdsList);
			}
		}
	}

	
	/**
	 * 查询当前账户的Payer
	 * add by tanyan 2017-11-20
	 * @param map{AcctId}
	 * @return DataContainer{
	 * CustId
	 * CustName 公司名称
	 * CVR
	 * KOB
	 * EAN
	 * PayerId
	 * PayerName
	 * Address：地址id
	 * PayerType：1表示个人 3表示公司
	 * Remarks：地址
	 * }
	 * @throws Exception
	 */
	public DataContainer queryPayerByAcctIdCR6(Map map) throws Exception{
		long acctId = (Long)map.get("AcctId");
		DataContainer dc = new DataContainer();
		
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		ICmDKAccountSV dkAccountSV = (ICmDKAccountSV) ServiceFactory.getService(ICmDKAccountSV.class);
		
		ICm2InterFSV cmInterSV = (ICm2InterFSV) ServiceFactory.getService(ICm2InterFSV.class);
		
		IQBOCmPartyValue partyValue = accountSV.querPayerByAcctId(acctId);
		if(CmCommonUtil.isNotEmptyObject(partyValue)){
			dc.set("PayerId", partyValue.getPartyId());
			dc.set("PayerName", partyValue.getPartyName());
			dc.set("Address", partyValue.getContAddress());
			dc.set("PayerType", partyValue.getPartyType());//1 Person 3 Organize
			dc.set("Remarks", partyValue.getRemarks());
			
			IBOCmBillingAcctValue[] billAcctValue = dkAccountSV.queryBillingAcct(acctId, null, null);
			if (CmCommonUtil.isNotEmptyObject(billAcctValue)) {
				dc.set("EAN", billAcctValue[0].getEan());
			}
			
			//根据partyId找到b2b客户信息
			int partyType = partyValue.getPartyType();//1 Person 3 Organize
			if(partyType == 3){//只查询出公司
				ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRole(partyValue.getPartyId(), CmConstants.PartyRoleType.CUSTOMER, -1, -1);
				if (partyRoles != null && partyRoles.length > 0) {
					IBOCmPartyRoleValue partyRoleBean = partyRoles[0];
					long custId = partyRoleBean.getEntityId();
					ICustomerValue[] groupCustomers = cmInterSV.queryGroupCustomers(custId, null, null, null, -1, -1);
					if(groupCustomers != null && groupCustomers.length > 0){
						ICustomerValue customer = groupCustomers[0];
						dc.set("CustId", customer.getCustId());
						dc.set("CustName", customer.getCustName());
						dc.set("CVR", customer.getTaxId());
						dc.set("KOB", customer.getCustCertCode());
					}
				}
			}
		}
		return dc;
	}
	
	/**
	 * 查询当前客户下的所有公司类型的Payer(包括客户所在的company)
	 * add by tanyan 2017-11-20
	 * @param map{CustId}
	 * @return DataContainer{
	 * CustId
	 * CustName 公司名称
	 * CVR
	 * KOB
	 * EAN
	 * PayerId
	 * PayerName
	 * Address：地址id
	 * PayerType：1表示个人 3表示公司
	 * Remarks：地址
	 * }
	 * @throws Exception
	 */
	public DataContainer[] queryPayerByCustIdCR6(Map map) throws Exception{
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		ICmDKAccountSV dkAccountSV = (ICmDKAccountSV) ServiceFactory.getService(ICmDKAccountSV.class);
		ICm2InterFSV cmInterSV = (ICm2InterFSV) ServiceFactory.getService(ICm2InterFSV.class);

		List<DataContainer> payerList = new ArrayList<DataContainer>();
		long custId = (Long)map.get("CustId");
		
		Set set = new  HashSet();
		
		IBOCmCustAcctRelValue[] custAcctRelValue = accountSV.queryCustAcctRel(custId, -1, null, -1, -1, -1, null, -1, -1, null, null);
		if(custAcctRelValue != null && custAcctRelValue.length > 0){
			for(IBOCmCustAcctRelValue custAcctRel:custAcctRelValue){
				
				long acctId = custAcctRel.getAcctId();
				IQBOCmPartyValue partyValue = accountSV.querPayerByAcctId(acctId);
				if(CmCommonUtil.isNotEmptyObject(partyValue)){
					int partyType = partyValue.getPartyType();//1 Person 3 Organize
					if(partyType == 3){//只查询出公司
						DataContainer dc = new DataContainer();
						
						dc.set("PayerId", partyValue.getPartyId());
						dc.set("PayerName", partyValue.getPartyName());
						dc.set("Address", partyValue.getContAddress());
						dc.set("PayerType", partyValue.getPartyType());//1 Person 3 Organize
						dc.set("Remarks", partyValue.getRemarks());
						
//						address address = addressSV.getAddress(DataType.getAsLong(partyValue.getContAddress()), null);
//						dc.set("AddressObject", address);
						
						IBOCmBillingAcctValue[] billAcctValue = dkAccountSV.queryBillingAcct(acctId, null, null);
						if (CmCommonUtil.isNotEmptyObject(billAcctValue)) {
							dc.set("EAN", billAcctValue[0].getEan());
						}

						ICustomerValue[] groupCustomers = cmInterSV.queryGroupCustomers(-1, null, null, partyValue.getCertCode(), -1, -1);
						if(groupCustomers != null && groupCustomers.length > 0){
							ICustomerValue customer = groupCustomers[0];
							dc.set("CustId", customer.getCustId());
							dc.set("CustName", customer.getCustName());
							dc.set("CVR", customer.getTaxId());
							dc.set("KOB", customer.getCustCertCode());
							
							if(set.add(customer.getCustId())){//公司去重复
								payerList.add(dc);
							}
						}
					}
				}
			}
		}
		return payerList.toArray(new DataContainer[0]);
	}
	
	/**
	 * 换Payer
	 * add by tanyan 2017-11-20
	 * @param map{
	 * AcctId：账户ID（必传）
	 * OldPayerId：老payerId（必传）
	 * PayerType：1 换成个人 3 换成公司（必传）
	 * NewPartyId：新payerId（只有换成公司类型的payer时必传）
	 * CertCode：传CPR，换成个人时可传值
	 * FirstName：换成个人时可传值
	 * LastName：换成个人时可传值
	 * BirthDay：换成个人时可传值
	 * AddressId：地址ID，换成个人时可传值
	 * Remarks：地址字符串，换成个人时可传值
	 * 
	 * 换成个人支付时，CPR可不填。如果CPR不填，那么FIRST_NAME，LAST_NAME，BIRTHDAY，AddressId，REMARKS都必须传值。
	 * 1、当CPR必须传值时，CRM会根据CPR去查已有的Payer
	 * 1.1 查到已有的Payer，则换Payer直至完成。
	 * 1.2 查不到已有的Payer,则检查FIRST_NAME，LAST_NAME，BIRTHDAY，AddressId，REMARKS是否有传值：
	 * 1.2.1 未传值，报错，无法换Payer
	 * 1.2.2 有传值，则根据FIRST_NAME，LAST_NAME，BIRTHDAY，AddressId，REMARKS去查已有的Payer，
	 * 1.2.2.1 查到已有的Payer，则换Payer直至完成。
	 * 1.2.2.2查不到已有的Payer，则创建Payer，然后换Payer。
	 * 
	 * 2018/03/08 modify/request from ose wangkun 
	 * 换成个人支付者时，如果newPartyId有值就直接换。没有话再去判断CPR或者name address那些有没有值。
	 * }
	 * @return 
	 * @throws Exception
	 * CMS1000001 Can not find the company payer.
	 * CMS1000002 Create the individual payer failed.
	 * CMS1000004 The creation of individual payers lacks the required parameters.
	 * CMS1000005 Can Not Find Account Information By accountId.
	 * CMS1000003 Can Not Find PayerId And OldPayerId.
	 * 其他异常 换payer失败
	 */
	public Map modifyAccountPayerCR6(Map map) throws Exception {
		Map retMap = new HashMap();
		retMap.put("FLAG", "N");
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		
		int partyType = DataType.getAsInt(map.get("PayerType"));
		long acctId = DataType.getAsLong(map.get("AcctId"));
		long oldPayerId = DataType.getAsLong(map.get("OldPayerId"));
		long newPayerId = 0;
		try{
			newPayerId = DataType.getAsLong(map.get("NewPayerId"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		DataContainer newPayer = new DataContainer();
		
		if(partyType == 3){
			newPayer.set("CERT_TYPE", 17);
			if(newPayerId <= 0){
				String kob = (String)map.get("CertCode");
				ICm2InterFSV cm2InterSV = (ICm2InterFSV) ServiceFactory.getService(ICm2InterFSV.class);
				IQBOCmPayerInfoValue payerInfo = cm2InterSV.queryPayerInfo(kob);
				
				if(payerInfo != null){
					newPayerId = payerInfo.getPartyId();
				}else{
					IBOCmPartyValue[] partyArr = partySV.queryPartyByCertTypeAndCertCode(17, kob, -1, -1);
					if (CmCommonUtil.isNotEmptyObject(partyArr)) {
						newPayerId = partyArr[0].getPartyId();
					}
				}
				if(newPayerId <= 0){
					ExceptionUtil.throwBusinessException("CMS1000001");//Can not find the company payer.
				}
				newPayer.set("PARTY_ID", newPayerId);
				newPayer.set("CERT_CODE", kob);
			}
			createOrgPayer(newPayerId);
		}else if(partyType == 1){
			newPayer.set("CERT_TYPE", 8);
			//add by tanyan 2018/03/08 换成个人支付者时，如果newPartyId有值就直接换，没有话再去判断CPR或者name address那些有没有值
			if(newPayerId <= 0){
				ICm2InterFSV cm2InterSV = (ICm2InterFSV) ServiceFactory.getService(ICm2InterFSV.class);
				String cpr = (String)map.get("CertCode");
				String firstName = DataType.getAsString(map.get("FirstName"));
				String lastName = DataType.getAsString(map.get("LastName"));
				String birthDay = DataType.getAsString(map.get("BirthDay"));
				long addressId = 0;
				try{
					addressId = DataType.getAsLong(map.get("AddressId"));
				}catch(Exception e){
					e.printStackTrace();
				}
				
				String remarks = DataType.getAsString(map.get("Remarks"));
				
				boolean indivflag = false;//个人payer的传参是否充分
				boolean existflag = false;//能查到已有payer
				
				if(StringUtils.isNotBlank(cpr)){
					indivflag = true;
					IQBOCmPayerInfoValue payerInfo = cm2InterSV.queryPayerInfo(cpr);
					if(payerInfo != null){
						newPayerId = payerInfo.getPartyId();
						existflag = true;
					}else{
						IBOCmPartyValue[] partyArr = partySV.queryPartyByCertTypeAndCertCode(8, cpr, -1, -1);
						if (CmCommonUtil.isNotEmptyObject(partyArr)) {
							newPayerId = partyArr[0].getPartyId();
						}
					}
				}
				
				if(newPayerId <= 0 && addressId > 0 && StringUtils.isNotBlank(firstName) && StringUtils.isNotBlank(lastName) && StringUtils.isNotBlank(birthDay)){
					indivflag = true;
					String custName = firstName + " " + lastName;
					IQBOCmPayerInfoValue[] payerVales = cm2InterSV.queryPayerByAddress(new long[]{addressId},custName);
					if(payerVales != null && payerVales.length > 0){
						newPayerId = payerVales[0].getPartyId();
						existflag = true;
					}
				}
				
				if(!indivflag){
					ExceptionUtil.throwBusinessException("CMS1000004");//The creation of individual payers lacks the required parameters.
				}

				if (!existflag) {
					try {
						if (addressId > 0) {
							IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
							address realAddress = addrService.getAddress(addressId, CmConstants.Address.DISTRICTID);
							if (realAddress != null) {
								remarks = CmCommonUtil.getStandAddressDesc(realAddress);
							}
						}

						newPayer.set("CERT_CODE", cpr);
						newPayer.set("FIRST_NAME", firstName);
						newPayer.set("LAST_NAME", lastName);
						newPayer.set("BIRTHDAY", birthDay);//2017-11-21
						newPayer.set("CONT_ADDRESS", addressId);
						newPayer.set("REMARKS", remarks);//Mariendalsvej 48 A.5 2000 Frederiksberg

						if (newPayerId <= 0) {
							retMap.put("FLAG", "Y");
							newPayer.set("PARTY_ID", "");
						}
						newPayerId = createPayer(newPayer);
					} catch (Exception e) {
						ExceptionUtil.throwBusinessException("CMS1000002");//Create the individual payer failed.
					}
				}
			}else{
				//检测partyId,是否有payer对应的资格
				ICmPartyRoleSV service = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				IBOCmPartyRoleValue[] roleVal = service.queryAllPartyRoles(newPayerId, ICmPartySV.ROLE_PAYER, -1, -1);
				if(null!=roleVal&&roleVal.length>0){
					//有角色，无需进行相应的party修复
				}else{
					try{
						newPayer.set("PARTY_ID", newPayerId);
						newPayerId = checkPartyPayer(newPayer);
					}catch(Exception e){
						ExceptionUtil.throwBusinessException("CMS1000002");//Create the individual payer failed.
					}
				}
			}
		}
		
		IVOAccountValue voAccountValue = new VOAccountBean();
		IAccountValue acount = new AccountBean();
		acount.setAcctId(acctId);
		voAccountValue.setAccount(acount);
		voAccountValue.setOldPayerId(oldPayerId);
		voAccountValue.setPayerId(newPayerId);
		
		modifyAccountPayer(voAccountValue);
		retMap.put("PARTY_ID", newPayerId);
		return retMap;
	}

	private void createOrgPayer(long newPayerId) throws Exception, AIException, BusinessException {
		//fix AI-11789
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		ICmPartyRoleSV service = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV cmGroupCustomerSV = (com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV) ServiceFactory.getService(com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV.class);
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		
		IBOCmPartyRoleValue roleVal[] = (IBOCmPartyRoleValue[]) service.queryAllPartyRoles(newPayerId, ICmPartySV.ROLE_PAYER, -1, -1);
		if (roleVal.length == 0 || roleVal == null) {// 未查到数据，参与人角色不是payer
			IBOCmGroupCustomerValue[] groupCustomers = cmGroupCustomerSV.queryCmGroupCustByPartyId(String.valueOf(newPayerId));
			if(null!=groupCustomers&&groupCustomers.length>0) {
				IQBOCmCustContMediumAndTypeValue[] mediaValue = cmCustomerSV.queryCustContactMediums(groupCustomers[0].getCustId(), 11, 1, -1, -1);
				if (mediaValue != null && mediaValue.length > 0) {
					IBOCmPartyContactValue contactVal = new BOCmPartyContactBean();
					contactVal.setPartyId(newPayerId);
					IPartyContactValue partyContactValue = getPartyContactValue(contactVal);
					partyContactValue.setContAddress(mediaValue[0].getAddressId() + "");
					partyContactValue.setRemarks(mediaValue[0].getAddressDetail());
					
					// 创建角色为payer的参与人
					BOCmPartyRoleBean roleBean = new BOCmPartyRoleBean();
					roleBean.setPartyId(newPayerId);
					roleBean.setRoleType(CmConstants.PartyRoleType.PAYER);
					roleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
					roleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
					roleBean.setState(CmConstants.RecordState.USE);
					roleBean.setCreateOpId(ServiceManager.getUser().getID());
					roleBean.setCreateOrgId(ServiceManager.getUser().getOrgId());
					roleBean.setEntityId(newPayerId);
					roleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
					IPartyRoleValue partyRoleValue = new PartyRoleBean();
					partyRoleValue.copy(roleBean);
					
					IPartyValue partyValue = partySV.queryPartyById(newPayerId);
					IVOPartyValue voPartyValue = new VOPartyBean();
					voPartyValue.setParty(partyValue);
					voPartyValue.setPartyRole(partyRoleValue);
					voPartyValue.setPartyContact(partyContactValue);
					voPartyValue.setBusinessId(CmConstants.BusiLogId.PAYER);
					partySV.saveParty(voPartyValue);
				}else {
					ExceptionUtil.throwBusinessException("CMS1000001");//Can not find the company payer.
				}
			}else {
				ExceptionUtil.throwBusinessException("CMS1000001");//Can not find the company payer.
			}
		}
	}
	
	/**
	 * 创建payer
	 * CERT_TYPE:8
	 * REMARKS:Mariendalsvej 48 A.5 2000 Frederiksberg
	 * LAST_NAME:Yan
	 * CONT_ADDRESS:5307971
	 * FIRST_NAME:Tan
	 * BIRTHDAY:2017-11-21
	 * 
	 * CERT_TYPE = 17
	 * PARTY_ID 需要有值
	 * @param payer
	 * @return
	 * @throws Exception
	 */
	public long createPayer(DataContainer payer) throws Exception{
		String temp = payer.getAsString("PARTY_ID");
		long certType = payer.getAsLong("CERT_TYPE");
		
		// 参与人联系信息
		IBOCmPartyContactValue contactVal = new BOCmPartyContactBean();
		contactVal.copy(payer);
		// 个人类参与人信息表
		IBOCmIndivPartyValue indivPartyVal = new BOCmIndivPartyBean();
		indivPartyVal.copy(payer);
		// 参与人信息表
		IBOCmPartyValue partyVal = new BOCmPartyBean();
		partyVal.copy(payer);
		// 不存在与crm系统中,只可能是个人客户
		if (StringUtils.isBlank(temp)) {
			IVOPartyValue vovalue = new VOPartyBean();
			// 保存参与人信息
			IPartyValue partyValue = new PartyBean();
			partyValue.copy(partyVal);
			if (StringUtils.isBlank(partyValue.getPartyName())) {
				partyValue.setPartyName(partyValue.getFirstName() + " " + partyValue.getLastName());
			}
			partyValue.setFirstNameQry(StringUtils.upperCase(partyVal.getFirstName()));
			partyValue.setLastNameQry(StringUtils.upperCase(partyVal.getLastName()));
			partyValue.setMiddleNameQry(StringUtils.upperCase(partyVal.getMiddleName()));
			partyValue.setPartyNameQry(StringUtils.upperCase(partyVal.getPartyName()));
			partyValue.setCertType(CmConstants.CertificateType.CPR);
			partyValue.setPartyType(CmConstants.PartyType.INDIVIDUAL);
			partyValue.setPartyId(CmCommonUtil.getNewSequence(BOCmPartyBean.class));
			partyValue.setCprId(Long.toString(CmCommonUtil.getNewSequence(BOCmClubBean.class)));
			partyValue.setStsToNew();
			partyValue.setBirthday(indivPartyVal.getBirthday());
			vovalue.setParty(partyValue);
			// 保存参与人角色信息
			IPartyRoleValue partyRoleValue = new PartyRoleBean();
			partyRoleValue.setRoleType(CmConstants.PartyRoleType.PAYER);
			partyRoleValue.setEntityId(partyValue.getPartyId());
			partyRoleValue.setPartyId(partyValue.getPartyId());
			partyRoleValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			partyRoleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
			partyRoleValue.setState(CmConstants.RecordState.USE);
			vovalue.setPartyRole(partyRoleValue);
			// 保存参与人联系信息
			IPartyContactValue contactValue = new PartyContactBean();
			contactValue.copy(contactVal);
			contactValue.setPartyId(partyValue.getPartyId());
			contactValue.setFirstNameQry(partyVal.getFirstNameQry());
			contactValue.setLastNameQry(partyVal.getLastNameQry());
			contactValue.setMiddleNameQry(partyVal.getMiddleNameQry());
			contactValue.setContName(partyVal.getPartyName());
			contactValue.setContNameQry(partyVal.getPartyNameQry());
			vovalue.setPartyContact(contactValue);
			vovalue.setBusinessId(CmConstants.BusiLogId.PAYER);
			ICmPartySV service = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			service.saveParty(vovalue);
			return partyValue.getPartyId();
		} else {
			// 存在与crm系统中
			long partyId = Long.parseLong(temp);
			// 查询party，如果cprId为空则插入partyId
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IPartyValue partyValue = partySV.queryPartyById(partyId);
			// 修改firsrtName和lastName
			if(!StringUtils.isEmpty(payer.getAsString("FIRST_NAME"))&&!"null".equalsIgnoreCase(payer.getAsString("FIRST_NAME"))){
				partyValue.setFirstName(payer.getAsString("FIRST_NAME"));
			}
			if(!StringUtils.isEmpty(payer.getAsString("LAST_NAME"))&&!"null".equalsIgnoreCase(payer.getAsString("LAST_NAME"))){
				partyValue.setLastName(payer.getAsString("LAST_NAME"));
			}
			// 修改生日
			if(null!=indivPartyVal.getBirthday()){
				partyValue.setBirthday(indivPartyVal.getBirthday());
			}
			
			if (partyValue != null && partyValue.getPartyType() == 1 && StringUtils.isBlank(partyValue.getCprId())) {
				partyValue.setCprId(Long.toString(CmCommonUtil.getNewSequence(BOCmClubBean.class)));
			}
			IVOPartyValue voPartyValue = new VOPartyBean();
			voPartyValue.setParty(partyValue);
			IPartyRoleValue partyRoleValue = getPartyRoleValue(partyId);
			// 若不存在payer角色则插入cm_party_role表创建角色payer
			if (partyRoleValue != null) {
				voPartyValue.setPartyRole(partyRoleValue);
			}
			// 保存参与人联系信息
			contactVal.setPartyId(partyId);
			IPartyContactValue partyContactValue = getPartyContactValue(contactVal);
			voPartyValue.setPartyContact(partyContactValue);
			ICmPartySV service = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			voPartyValue.setBusinessId(CmConstants.BusiLogId.PAYER);
			service.saveParty(voPartyValue);
			return partyId;
		}
	}
	
	//查询联系人联系媒介的addressid
	private long queryContactContMediumAddressId(long contId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmContactContMediumPojoValue.S_ContId).append(" =:contId ");
		parameter.put("contId", contId);
		long addressId_result = 0;
		IBOCmContactContMediumPojoValue[] cmContactContMediumValues =  (IBOCmContactContMediumPojoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmContactContMediumPojoBean.class, condition.toString(), parameter, -1, -1);
		if(null!=cmContactContMediumValues&&cmContactContMediumValues.length>0){
			for (int i = 0; i < cmContactContMediumValues.length; i++) {
				BOCmContactContMediumPojoBean cmContacBean =  (BOCmContactContMediumPojoBean) cmContactContMediumValues[i];
				if(cmContacBean.getContMedTypeId()==11){
					addressId_result = cmContacBean.getAddressId();
					break;
				}
			}
		}
		return addressId_result;
	}
	
	/**
	 * 查询客户联系媒介表的addresid
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-12-5
	* Cm2SoSVImpl
	 */
	public long queryCustElectronicContactMediaAddressIdByCond(long custId) throws Exception {
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue valueMedium = sv.queryCustContactMediumByCustIdAndType(custId, "11");
		if(null!=valueMedium){
			return valueMedium.getAddressId();
		}else{
			return 0;
		}
	}
	
	public long checkPartyPayer(DataContainer payer) throws Exception{
		String temp = payer.getAsString("PARTY_ID");
		long certType = payer.getAsLong("CERT_TYPE");
		
		// 参与人联系信息
		IBOCmPartyContactValue contactVal = new BOCmPartyContactBean();
		contactVal.copy(payer);
		// 个人类参与人信息表
		IBOCmIndivPartyValue indivPartyVal = new BOCmIndivPartyBean();
		indivPartyVal.copy(payer);
		// 参与人信息表
		IBOCmPartyValue partyVal = new BOCmPartyBean();
		partyVal.copy(payer);
		// 不存在与crm系统中,只可能是个人客户
			IVOPartyValue vovalue = new VOPartyBean();
			// 存在与crm系统中
			long partyId = Long.parseLong(temp);
			// 查询party，如果cprId为空则插入partyId
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IPartyValue partyValue = partySV.queryPartyById(partyId);
			vovalue.setParty(partyValue);
			// 保存参与人角色信息
			IPartyRoleValue partyRoleValue = new PartyRoleBean();
			partyRoleValue.setRoleType(CmConstants.PartyRoleType.PAYER);
			partyRoleValue.setEntityId(partyValue.getPartyId());
			partyRoleValue.setPartyId(partyValue.getPartyId());
			partyRoleValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			partyRoleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
			partyRoleValue.isNew();
			vovalue.setPartyRole(partyRoleValue);
			// 保存参与人联系信息
			contactVal.setPartyId(partyId);
			IPartyContactValue partyContactValue = getPartyContactValue(contactVal);
			if(null!=partyContactValue){
				//检测partyId,是否有payer对应的资格
				ICmPartyRoleSV service = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				IBOCmPartyRoleValue roleVal[] = (IBOCmPartyRoleValue[]) service.queryAllPartyRoles(partyValue.getPartyId(), -1, -1, -1);
				boolean isCustomer = false; // ture表示是，false表示不是
				for (int i = 0; i < roleVal.length; i++) {
					if(roleVal[i].getRoleType()==1||roleVal[i].getRoleType()==2||roleVal[i].getRoleType()==3){
						isCustomer = true;
						break;
					}
				}
				long addressId = 0;
				//查询addressid
				if(isCustomer){
					ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					IBOCmIndivCustomerValue cmIndivCust = custSV.queryIndivCustValue(-1, partyValue.getPartyId());
					addressId = queryCustElectronicContactMediaAddressIdByCond(cmIndivCust.getCustId());
				}else{
					addressId = queryContactContMediumAddressId(partyContactValue.getContId());
				}
				partyContactValue.setContAddress(String.valueOf(addressId));

				try {
					IAddressSV addrService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
					address addressInfo = addrService.getAddress(addressId, "");
					if (addressInfo != null && StringUtils.isNotEmpty(addressInfo.getAddrDesc())) {
						// 设置地址的详细描述
						partyContactValue.setRemarks(addressInfo.getAddrDesc());
					}
				} catch (Exception ignored) {

				}

				vovalue.setPartyContact(partyContactValue);
			}else{
				// 保存参与人联系信息
				IPartyContactValue contactValue = new PartyContactBean();
				contactValue.copy(contactVal);
				contactValue.setPartyId(partyValue.getPartyId());
				contactValue.setFirstNameQry(partyValue.getFirstNameQry());
				contactValue.setLastNameQry(partyValue.getLastNameQry());
				contactValue.setMiddleNameQry(partyValue.getMiddleNameQry());
				contactValue.setContName(partyValue.getPartyName());
				contactValue.setContNameQry(partyValue.getPartyNameQry());
				vovalue.setPartyContact(contactValue);
			}
			vovalue.setBusinessId(CmConstants.BusiLogId.PAYER);
			ICmPartySV service = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			service.saveParty(vovalue);
			return partyValue.getPartyId();
	}
	
	/**
	 * 更换payer
	 * add by tanyan 2017-11-23
	 * @param voAccountValue
	 * @throws Exception
	 * CMS1000005 Can Not Find Account Information By accountId.
	 * CMS1000003 Can Not Find PayerId And OldPayerId.
	 */
	public void modifyAccountPayer(IVOAccountValue voAccountValue) throws Exception {
		ICmAccountBceDealSV cmAcctBceSV = (ICmAccountBceDealSV) ServiceFactory.getService(ICmAccountBceDealSV.class);
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		Long bceFrameId = 128072L;
		String businessId = "2300001300";
		
		long acctId = voAccountValue.getAcctId();
		IAccountValue acctValueTmp = acctSV.queryAccountById(acctId);
		if (acctValueTmp == null) {
			ExceptionUtil.throwBusinessException("CMS1000005");//Can Not Find Account Information By accountId.
		}
		
		if(voAccountValue.getPayerId() <= 0 ||voAccountValue.getOldPayerId() <= 0){
			ExceptionUtil.throwBusinessException("CMS1000003");//Can Not Find PayerId And OldPayerId.
		}
		
		IVOAccountValue finalVoAccountValue = new VOAccountBean();
		finalVoAccountValue.setAccount(acctValueTmp);
		finalVoAccountValue.setPayerId(voAccountValue.getPayerId());
		finalVoAccountValue.setOldPayerId(voAccountValue.getOldPayerId());
		
		IBOCmCustAcctRelValue[] acctRelValue = acctSV.queryCustAcctRel4CR128(-1, acctId, null, -1, -1, -1, null, -1, -1);
		if (acctRelValue == null || acctRelValue.length <= 0) {
			throw new Exception("There is no CustAcctRel.");
		}
		finalVoAccountValue.setPayMethod( Integer.valueOf(acctRelValue[0].getPayMethod()+""));
		
		cmAcctBceSV.dealModifyAccount(finalVoAccountValue, bceFrameId, businessId);
	}
	
	/**
	 * 创建参与人角色。存在则不创建
	 * @param partyId
	 * @throws Exception
	 */
	private IPartyRoleValue getPartyRoleValue(long partyId) throws Exception {
		ICmPartyRoleSV service = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] roleVal = service.queryAllPartyRoles(partyId, ICmPartySV.ROLE_PAYER, -1, -1);
		// 未查到数据，参与人角色不是payer
		if (roleVal.length == 0) {
			// 创建角色为payer的参与人
			BOCmPartyRoleBean roleBean = new BOCmPartyRoleBean();
			roleBean.setPartyId(partyId);
			roleBean.setRoleType(CmConstants.PartyRoleType.PAYER);
			roleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
			roleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
			roleBean.setState(CmConstants.RecordState.USE);
			roleBean.setCreateOpId(ServiceManager.getUser().getID());
			roleBean.setCreateOrgId(ServiceManager.getUser().getOrgId());
			roleBean.setEntityId(partyId);
			roleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
			IPartyRoleValue value = new PartyRoleBean();
			value.copy(roleBean);
			return value;
		} else {
			// 创建代付账户将entityId改成partyId
			BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
			bean.copy(roleVal[0]);
			bean.setEntityId(partyId);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
			return null;
		}
	}
	
	/**
	 * 保存参与人联系信息，不存在则创建
	 * @param partyContactVal
	 * @throws Exception
	 * @throws AIException
	 */
	private IPartyContactValue getPartyContactValue(IBOCmPartyContactValue partyContactVal) throws Exception, AIException {
		Long partyId = partyContactVal.getPartyId();
		if (partyId != null && !partyId.equals("")) {
			StringBuilder sql = new StringBuilder();
			sql.append("1=1").append(" and ").append(IBOCmPartyContactValue.S_PartyId).append("=:partyId");
			Map parameter = new HashMap();
			parameter.put("partyId", partyId);
			IBOCmPartyContactValue[] result = (IBOCmPartyContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyContactBean.class, sql.toString(), parameter,
					-1, -1);
			if (null == result || result.length == 0) {
				// 使用前台传过来的contId
				partyContactVal.setContId(partyContactVal.getContId());
				IPartyContactValue bean = new PartyContactBean();
				bean.copy(partyContactVal);
				bean.setStsToNew();
				return bean;
			} else {
				IPartyContactValue bean = new PartyContactBean();
				bean.copy(partyContactVal);
				bean.setStsToNew();
				bean.setContId(result[0].getContId());
				bean.initProperty("CONT_ID", result[0].getContId());
				return bean;
			}
		} else {
			throw new Exception("PartyId does not exsists");
		}
	}
	
	/**
	 * 变更支付方式 
	 * add by tanyan 2017-11-20 建议OSE直接调用billing接口DoModifyAccountBasicInfo
	 * @param acctId
	 * @param custId
	 * @param payChannelValue
	 * @param bllAcctBillFormatValues
	 * @param acctContactValue
	 * @return
	 * @throws Exception
	 */
	public Map changeBillingPayment(long acctId, long custId, IBOCmPayChannelValue payChannelValue, IBOCmAcctBillFormatValue[] bllAcctBillFormatValues,
			IBOCmAcctContactValue acctContactValue) throws Exception{
		Map retMap = new HashMap();
		ICmBillingAcctSV billingAcctSV = (ICmBillingAcctSV) ServiceFactory.getService(ICmBillingAcctSV.class);
		billingAcctSV.saveAcctPayment(acctId, custId, payChannelValue, bllAcctBillFormatValues , acctContactValue);
		return retMap;
	}
	
	public DataContainer[]  queryCustAcctRelByCond(long custId,long acctId,String ean, Map extMap) throws Exception{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT T1.* ");
		sql.append(" FROM  {CM_CUST_ACCT_REL} T1 ");
		sql.append(" LEFT JOIN {CM_BILLING_ACCT} T2 ");
		sql.append(" ON T1.ACCT_ID=T2.ACCT_ID  ");
		sql.append("  WHERE 1=1 AND T1.EXT1 IN(1,2,3) AND T1.STATE = 'U' ");
		Map parameter = new HashMap();
		if (acctId > 0) {
			sql.append(" AND T1.ACCT_ID = ").append(":acctId");
			parameter.put("acctId", acctId);
		}
		if (custId > 0) {
			sql.append(" AND T1.REL_CUST_ID = ").append(":custId");
			parameter.put("custId", custId);
		}
		if(StringUtils.isNotBlank(ean)){
			sql.append(" AND T2.EAN = ").append(":ean");
			parameter.put("ean", ean);
		}
		DataContainer dc[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
		if(null != dc && dc.length >0){
			return dc;
		}
		return null;
	}

	public String querySubAccountStatus(long accountId) throws Exception {
		ICmAcctSubStatusSV acctSubStatusSV = (ICmAcctSubStatusSV) ServiceFactory.getService(ICmAcctSubStatusSV.class);
		BOCmAcctSubStatusBean subStatusValue = acctSubStatusSV.getAcctSubStatusValue(accountId);
		if ( subStatusValue!=null ){
			return String.valueOf(subStatusValue.getSubAcctStatus());
		}
		return "0";
	}

	@Override
	public IBOCmInsCmrelValue[] queryUserList(long custId, long userId, int start, int end)
			throws Exception {

		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relType ");
		parameter.put("relType", 2);
			
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		
		condition.append(" ORDER BY CREATE_DATE ASC ");

		IBOCmInsCmrelValue[] contMediums = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, start, end);
		if (null != contMediums && contMediums.length > 0) {
			ICrmFSV crmFsv = (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
			List<IBOCmInsCmrelValue> conditions=new ArrayList<>();
			//过滤掉虚用户
			for(int i = 0 ; i < contMediums.length ; i++) {
				if(!crmFsv.isSpecialVirtualSubscriber(contMediums[i].getOfferId())) {
					conditions.add(contMediums[i]);
				}
			}
			return conditions.toArray(new IBOCmInsCmrelValue[0]);
		}
		return new IBOCmInsCmrelValue[0];
	}
	
	@Override
	public int queryUserListCount(long custId, long userId) throws Exception {
		return queryUserList(custId, userId, -1, -1).length;
	}
	
	public IBOCmInsAccrelValue[] queryCmInsAccrels(long userId) throws Exception{
		List<IBOCmInsAccrelValue> returnList = new ArrayList<IBOCmInsAccrelValue>();
		int num = 9;
		for(int n=0;n<=9;n++){
			String tableName = "party.cm_ins_accrel_210" + n;
			StringBuilder condition = new StringBuilder(" select * from "+ tableName +" where ");
			HashMap paraMap = new HashMap();
			condition.append(IBOCmInsAccrelValue.S_UserId).append(" =:USER_ID ");
			paraMap.put("USER_ID", userId);
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_PayType).append(" =:payType");
			paraMap.put("payType", 1);
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_EffectiveDate).append(" <= NOW()");
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_ExpireDate).append(" >= NOW()");
			IBOCmInsAccrelValue[] insAccrels = BOCmInsAccrelEngine.getBeansFromSql(condition.toString(), paraMap);
			if(insAccrels!=null && insAccrels.length>0){
				for (IBOCmInsAccrelValue insAccrelVal : insAccrels) {
					returnList.add(insAccrelVal);
				}
			}
		}
		return returnList.toArray(new IBOCmInsAccrelValue[0]);
	}
	
	public DataContainer[] queryAcctByCustIdForOse(long custId, long accountId,String accountName,String ean,String payerName,int substatesFilter, boolean containAddress, int aStartNum,int aEndNum) throws Exception {
		
		if (custId > 0) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT  a.ACCT_NAME,  a.ACCT_ID,  c.PARTY_ID,c.PARTY_NAME ,c.FIRST_NAME,c.LAST_NAME,  c.PARTY_TYPE,  c.CERT_CODE,  d.CONT_ADDRESS,  e.BIRTHDAY,  f.ean, g.SUB_ACCT_STATUS ");
			sql.append(" FROM  {CM_CUST_ACCT_REL} a ");
			sql.append(" LEFT JOIN {CM_BILLING_ACCT} f ");
			sql.append(" ON a.ACCT_ID=f.acct_id  ");
			sql.append(" LEFT JOIN {CM_PARTY_ACCT_REL} b");
			sql.append(" ON a.ACCT_ID = b.ACCT_ID ");
			sql.append(" LEFT JOIN {CM_PARTY} c ");
			sql.append(" ON b.PARTY_ID = c.PARTY_ID  ");
			sql.append(" LEFT JOIN {CM_PARTY_CONTACT} d ");
			sql.append(" ON c.PARTY_ID=d.PARTY_ID ");
			sql.append(" LEFT JOIN {CM_INDIV_PARTY} e");
			sql.append(" ON e.PARTY_ID=d.PARTY_ID");
			sql.append(" LEFT JOIN {CM_ACCT_SUB_STATUS} g");
			sql.append(" ON a.ACCT_ID=g.ACCT_ID");
			sql.append("  WHERE 1=1 AND a.EXT1 IN(1,2,3) AND (a.STATE = 'U' or a.STATE = 'T') ");
			Map parameter = new HashMap();
			
			if (accountId > 0) {
				sql.append(" AND a.ACCT_ID = ").append(":acctId");
				parameter.put("acctId", accountId);
			}
			if (custId > 0) {
				sql.append(" AND a.REL_CUST_ID = ").append(":custId");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(accountName)) {
				sql.append(" AND a.ACCT_NAME like ").append(":acctName");
				parameter.put("acctName", "%" + accountName + "%");
			}
			if (StringUtils.isNotBlank(ean)) {
				sql.append(" AND f.ean like ").append(":ean");
				parameter.put("ean", "%" + ean + "%");
			}
			if (StringUtils.isNotBlank(payerName)) {
				sql.append(" AND c.PARTY_NAME like ").append(":payerName");
				parameter.put("payerName", "%" + payerName + "%");
			}
			if ( substatesFilter==0 ){
				// 如果 substatesFilter ==0  需要过滤调   SUB_ACCT_STATUS == 1 SUB_ACCT_STATUS ==2 的数据
				sql.append(" AND ( g.SUB_ACCT_STATUS IS NULL OR (g.SUB_ACCT_STATUS <> 1 AND g.SUB_ACCT_STATUS <> 2) ) ");
			}
			if ((aStartNum >= 0) || (aEndNum >= 0)) {
				if ((aStartNum < 0) && (aEndNum >= 0)) {
					sql.append(" limit ").append("0").append(",").append(aEndNum);
				} else if ((aEndNum < 0) && (aStartNum >= 0)) {
					if (aStartNum > 0) {
						sql.append(" limit ").append(aStartNum - 1).append(",").append("18446744073709551615");
					} else {
						sql.append(" limit ").append(aStartNum).append(",").append("18446744073709551615");
					}

				} else if (aEndNum < aStartNum) {
					sql.append(" limit ").append("0").append(",").append("0");
				} else {
					int offset = aEndNum - aStartNum + 1;
					int tmpStart = 0;
					if (aStartNum > 0) {
						tmpStart = aStartNum - 1;
					} else {
						tmpStart = 0;
					}
					sql.append(" limit ").append(tmpStart).append(",").append(offset);
				}
			}
			DataContainer dc[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			int count = 0;
			// 查询服务性能优化
			if (StringUtils.isBlank(ean) && StringUtils.isBlank(payerName) && StringUtils.isBlank(accountName)) {
				if (accountId <= 0) {
					count = queryCustAcctRelCountByCnd(custId, null, null, -1, -1, -1, null);
				} else {
					count = queryCustAcctRelCountByCnd(custId, new long[] { accountId }, null, -1, -1, -1, null);
				}
			} else {
				count = queryAcctCountByCustIdForOse(custId, accountId, accountName, ean, payerName, 1);
			}
			if (CmCommonUtil.isNotEmptyObject(dc)) {
				// add by zhaiwg TELENOR_REQ_20190107_0001
				if(!containAddress) {
					return dc;
				}
				
				IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
				for (int i = 0; i < dc.length; i++) {
					long addressId = dc[i].getAsLong("CONT_ADDRESS");
					if (addressId > 0) {
						address address = addressSV.getAddress(addressId, null);
						dc[i].set("ADDRESS", address);
						dc[i].set("COUNT", count);
					} else {
						dc[i].set("ADDRESS", null);
						dc[i].set("COUNT", count);
					}

				}
				return dc;
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	@Override
	public int queryAcctCountByCustIdForOse(long custId, long accountId, String accountName, String ean,
			String payerName, int substatesFilter) throws Exception {

		if (custId > 0) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT COUNT(1) as COUNT ");
			sql.append(" FROM  {CM_CUST_ACCT_REL} a ");
			sql.append(" LEFT JOIN {CM_BILLING_ACCT} f ");
			sql.append(" ON a.ACCT_ID=f.acct_id  ");
			sql.append(" LEFT JOIN {CM_PARTY_ACCT_REL} b");
			sql.append(" ON a.ACCT_ID = b.ACCT_ID ");
			sql.append(" LEFT JOIN {CM_PARTY} c ");
			sql.append(" ON b.PARTY_ID = c.PARTY_ID  ");
			sql.append(" LEFT JOIN {CM_PARTY_CONTACT} d ");
			sql.append(" ON c.PARTY_ID=d.PARTY_ID ");
			sql.append(" LEFT JOIN {CM_INDIV_PARTY} e");
			sql.append(" ON e.PARTY_ID=d.PARTY_ID");
			sql.append(" LEFT JOIN {CM_ACCT_SUB_STATUS} g");
			sql.append(" ON a.ACCT_ID=g.ACCT_ID");
			sql.append("  WHERE 1=1 AND a.EXT1 IN(1,2,3) AND (a.STATE = 'U' or a.STATE = 'T') ");
			
			Map parameter = new HashMap();
			if (accountId > 0) {
				sql.append(" AND a.ACCT_ID = ").append(":acctId");
				parameter.put("acctId", accountId);
			}
			if (custId > 0) {
				sql.append(" AND a.REL_CUST_ID = ").append(":custId");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(accountName)) {
				sql.append(" AND a.ACCT_NAME like ").append(":acctName");
				parameter.put("acctName", "%" + accountName + "%");
			}
			if (StringUtils.isNotBlank(ean)) {
				sql.append(" AND f.ean like ").append(":ean");
				parameter.put("ean", "%" + ean + "%");
			}
			if (StringUtils.isNotBlank(payerName)) {
				sql.append(" AND c.PARTY_NAME like ").append(":payerName");
				parameter.put("payerName", "%" + payerName + "%");
			}
			if ( substatesFilter==0 ){
				// 如果 substatesFilter ==0  需要过滤调   SUB_ACCT_STATUS == 1 SUB_ACCT_STATUS ==2 的数据
				sql.append(" AND ( g.SUB_ACCT_STATUS IS NULL OR (g.SUB_ACCT_STATUS <> 1 AND g.SUB_ACCT_STATUS <> 2) ) ");
			}
			DataContainer dc[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			if (CmCommonUtil.isNotEmptyObject(dc)) {
				return dc[0].getAsInt("COUNT");
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	
	}

	@Override
	public IBOCmCustAdditionalInfoValue[] queryCustAdditionalInfo(long custId) throws Exception {
		ICMCustAdditionalInfoDAO custAddionalInfoDao = (ICMCustAdditionalInfoDAO)ServiceFactory.getService(ICMCustAdditionalInfoDAO.class);
		return custAddionalInfoDao.queryCustAdditionalInfo(custId);
	}

	@Override
	public void saveCustAdditionalInfo(IBOCmCustAdditionalInfoValue[] boCustAdditionalInfo) throws Exception {
		ICMCustAdditionalInfoDAO custAddionalInfoDao = (ICMCustAdditionalInfoDAO)ServiceFactory.getService(ICMCustAdditionalInfoDAO.class);
		custAddionalInfoDao.saveCustAdditionalInfo(boCustAdditionalInfo);
		
		if(boCustAdditionalInfo!=null && boCustAdditionalInfo.length>0) {
			ICmBusiLogValue busiLogValue = new CmBusiLogBean();
			busiLogValue.setBusinessId(192200000004L);
			busiLogValue.setCustId(boCustAdditionalInfo[0].getCustId());
			busiLogValue.setRemarks("update Additional info");
			busiLogValue.setBusiDetail("This is just a log of update additional info,ignore the incorrect businessId 192200000004");
			// 生成业务明细
			CmBusiLogFactory.log(busiLogValue);
		}
		
	}
	public void saveCustAdditionalHisInfo(IBOCmCustAdditionalInfoHValue[] boCustAdditionalInfo) throws Exception {
		ICMCustAdditionalInfoDAO custAddionalInfoDao = (ICMCustAdditionalInfoDAO)ServiceFactory.getService(ICMCustAdditionalInfoDAO.class);
		custAddionalInfoDao.saveCustAdditionalHisInfo(boCustAdditionalInfo);
	}
	
	public String getNoteString(IBOCmCustAdditionalInfoValue[] addionalInfo) {
		StringBuilder noteBuilder = new StringBuilder("");
		if(addionalInfo!=null) {
			List<IBOCmCustAdditionalInfoValue> additionalList = Arrays.asList(addionalInfo);
			if(additionalList.size()>1) {
				Collections.sort(additionalList, new Comparator<IBOCmCustAdditionalInfoValue>() {
					public int compare(IBOCmCustAdditionalInfoValue o1, IBOCmCustAdditionalInfoValue o2) {
						int index1 = StringUtils.isBlank(o1.getExt1())?0:Integer.parseInt(o1.getExt1());
						int index2 = StringUtils.isBlank(o2.getExt1())?0:Integer.parseInt(o2.getExt1());
						if (index1 < index2) {
							return -1;
						}
						else if (index1 == index2) {
							return 0;
						}
						else {
							return 1;
						}
					}
				});
			}
			for(int i = 0;i<additionalList.size() && additionalList.get(i)!=null;i++) {
				noteBuilder.append(additionalList.get(i).getNote());
			}
		}
		String noteString = noteBuilder.toString();
		return noteString;
	}

	@Override
	public DataContainer queryPayerNameByAcctId(long acctId) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCMPartyAcctRelValue[] partyAcctRelValues = accountSV.queryPartyAccRel(acctId, -1);
		DataContainer dc = null;
		if (partyAcctRelValues != null && partyAcctRelValues.length > 0) {
			long partyId = partyAcctRelValues[0].getPartyId();
			ICmPartySV partySv = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IPartyValue partyValue = partySv.queryPartyById(partyId);
			if (partyValue != null) {
				dc = new DataContainer();
				dc.set("PAYER_NAME", partyValue.getPartyName());
			}
		}
		return dc;
	}
}
