package com.asiainfo.crm.cm.ln.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.bill.teaminvoke.out.interfaces.IInterfaceBillCrmSV;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.evaluation.bo.BOCmSpecialListBean;
import com.asiainfo.crm.cm.inner.evaluation.ivalues.IBOCmSpecialListValue;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerBean;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmUserManagerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.bo.BOLnCmInsCmRelBean;
import com.asiainfo.crm.cm.ln.common.bo.BOLnCmInsDesRelBean;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsDesRelValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnCommonServiceSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmLnCommonServiceSVImpl implements ICmLnCommonServiceSV {

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId, long userId) throws Exception {
		if (custId <= 0 && userId <= 0) {
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_State).append(" <>:state ");
		parameter.put("state", Integer.valueOf(0));
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_EffectiveDate).append(" <= now() ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_ExpireDate).append(" >= now() ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", Long.valueOf(custId));
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		return (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValueByUserId(long userId) throws Exception {
		if (userId <= 0)
			ExceptionUtil.throwBusinessException("CMS5000001");

		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" and ").append(IBOLnCmInsCmRelValue.S_UserId).append(" = :userId ");
		condition.append(" and ").append(IBOLnCmInsCmRelValue.S_EffectiveDate).append(" <= now() ");
		condition.append(" and ").append(IBOLnCmInsCmRelValue.S_ExpireDate).append(" >= now() ");
		parameter.put("userId", userId);
		return (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, -1, -1);
	}

	public void saveCmInsCmRelValues(IBOLnCmInsCmRelValue[] lnCmInsCmRelValues) throws Exception {
		if (lnCmInsCmRelValues != null && lnCmInsCmRelValues.length > 0) {
			for (int i = 0; i < lnCmInsCmRelValues.length; i++) {
				if (lnCmInsCmRelValues[i].getRelaType() == 0) {
					lnCmInsCmRelValues[i].setRelaType(2);
				}
			}
			 sendToBilling(lnCmInsCmRelValues);
			BOLnCmInsCmRelBean[] tmpBeans = new BOLnCmInsCmRelBean[lnCmInsCmRelValues.length];
			for (int i = 0; i < lnCmInsCmRelValues.length; i++) {
				lnCmInsCmRelValues[i].setDoneDate(ServiceManager.getOpDateTime());
				lnCmInsCmRelValues[i].setEffectiveDate(ServiceManager.getOpDateTime());
			}
			System.arraycopy(lnCmInsCmRelValues, 0, tmpBeans, 0, lnCmInsCmRelValues.length);
			for (int i = 0; i < tmpBeans.length; i++) {
				if (tmpBeans[i].isDeleted()) {
					tmpBeans[i].setStsToOld();
					tmpBeans[i].set("STATE", CmLnConstants.UserState.USER_DES);
					tmpBeans[i].setExpireDate(ServiceManager.getOpDateTime());
				}
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) tmpBeans);
		}
	}

	public IBOCmSpecialListValue[] queryCmSpecialListByCustId(long custId) throws Exception {
		// TODO Auto-generated method stub
		if (custId <= 0) {
			// 客户编号不能为空！
			ExceptionUtil.throwBusinessException("CMS5000001");
		}

		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" and ").append(IBOCmSpecialListValue.S_CustId).append(" = :custId ");
		condition.append(" and ").append(IBOCmSpecialListValue.S_State).append(" = ").append("'" + CmConstants.RecordState.USE + "'");
		condition.append(" and ").append(IBOCmSpecialListValue.S_EffectiveDate).append(" <= now() ");
		condition.append(" and ").append(IBOCmSpecialListValue.S_ExpireDate).append(" >= now() ");
		parameter.put("custId", custId);
		return (IBOCmSpecialListValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmSpecialListBean.class, condition.toString(), parameter, -1, -1);

	}

	public IBOLnCmInsCmRelValue[] queryDesUsers(long custId) throws Exception {
		if (custId <= 0) {
			// 客户编号不能为空！
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_State).append(" =:state ");
		parameter.put("CUST_ID", Long.valueOf(custId));
		parameter.put("state", Integer.valueOf(CmLnConstants.UserState.USER_DES));
		return (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOLnCmInsDesRelValue[] queryCustDesUsers(long custId) throws Exception {
		if (custId <= 0) {
			// 客户编号不能为空！
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" AND ").append(IBOLnCmInsDesRelValue.S_CustId).append(" =:custId ");
		parameter.put("custId", Long.valueOf(custId));
		return (IBOLnCmInsDesRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsDesRelBean.class, condition.toString(), parameter, -1, -1);
	}

	public void saveDesUsers(IBOLnCmInsDesRelValue[] insDesRelValues) throws Exception {
		if (insDesRelValues != null && insDesRelValues.length > 0) {
			BOLnCmInsDesRelBean[] tmpBeans = new BOLnCmInsDesRelBean[insDesRelValues.length];
			System.arraycopy(insDesRelValues, 0, tmpBeans, 0, insDesRelValues.length);
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) insDesRelValues);
		}
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId) throws Exception {
		if (custId <= 0) {
			// 客户编号不能为空！
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", Long.valueOf(custId));
			condition.append(" and ").append(IBOLnCmInsCmRelValue.S_EffectiveDate).append(" <= now() ");
			condition.append(" and ").append(IBOLnCmInsCmRelValue.S_ExpireDate).append(" >= now() ");
		}
		return (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByIds(long[] custIds) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		if (custIds == null || custIds.length < 1) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		condition.append(IBOLnCmInsCmRelValue.S_CustId).append(" IN ( ");
		for (int i = 0, len = custIds.length; i < len; i++) {
			condition.append(":CUST_ID").append(i).append(" ");
			parameter.put("CUST_ID" + i, Long.valueOf(custIds[i]));
			if (i != len - 1) {
				condition.append(",");
			}
		}
		condition.append(")");
		return (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOCmUserManagerValue[] getUserManager(DataContainer da) throws Exception {
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		long relId = (Long) da.get(IBOCmUserManagerValue.S_RelId);
		long memberId = (Long) da.get(IBOCmUserManagerValue.S_MemberId);
		int relType = (Integer) da.get(IBOCmUserManagerValue.S_RelType);
		if (relId != -1) {
			condition.append(" AND ").append(IBOCmUserManagerValue.S_RelId).append(" =:relId ");
			parameter.put("relId", Long.valueOf(relId));
		}
		if (memberId != -1) {
			condition.append(" AND ").append(IBOCmUserManagerValue.S_MemberId).append(" =:memberId ");
			parameter.put("memberId", memberId);
		}

		if (relType != -1) {
			condition.append(" AND ").append(IBOCmUserManagerValue.S_RelType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		condition.append(" AND ").append(IBOCmUserManagerValue.S_State).append(" =:stats ");
		parameter.put("stats", CmLnConstants.GroupManagerState.State_U);
		return (IBOCmUserManagerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmUserManagerBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCds(long custId, long userId, int state) throws Exception {
		if (custId <= 0 && userId <= 0) {
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_EffectiveDate).append(" <= now() ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_ExpireDate).append(" >= now() ");
		if (state >= 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_State).append(" =:state ");
			parameter.put("state", Integer.valueOf(state));
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", Long.valueOf(custId));
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		return (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, -1, -1);
	}

	public void delCustomerLevel(long grpCustId, int custLevel) throws Exception {
		// 根据集团编号查询集团对象qrySubordinateGrpCust
		ICmCustomerSV icmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue customerValue = icmCustomerSV.queryCustomerByCustId(grpCustId);
		if (CmCommonUtil.isEmptyObj(customerValue)) {
			return;
		}
		if (customerValue.getCustLevel() != custLevel) {
			DataContainer dt = new DataContainer();
			dt.set(ICustomerValue.S_ParentCustId, grpCustId);
			dt.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
			dt.set(ICustomerValue.S_State, CmConstants.RecordState.USE);
			ICustomerValue[] iCustomerValues = icmCustomerSV.queryCustomers(dt, -1, -1);
			IVOCustValue custValue = new VOCustBean();
			customerValue.setStsToOld();
			customerValue.set(ICustomerValue.S_ParentCustId, "");
			customerValue.setCustLevel(custLevel);
			custValue.setCustomer(customerValue);
			CmServiceFactory.getCustomerSV().saveCustomer(custValue);
			ICustomerValue custValue2 = null;
			if (CmCommonUtil.isNotEmptyObject(iCustomerValues)) {
				for (int i = 0; i < iCustomerValues.length && iCustomerValues.length > 0; i++) {
					custValue2 = new CustomerBean();
					custValue2.copy(iCustomerValues[i]);
					custValue2.setStsToOld();
					custValue2.setCustId(iCustomerValues[i].getCustId());
					custValue2.set(ICustomerValue.S_ParentCustId, "");
					custValue.setCustomer(custValue2);
					CmServiceFactory.getCustomerSV().saveCustomer(custValue);
				}
			}

		}
	}

	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId, long userId, int start, int end) throws Exception {
		if (custId <= 0 && userId <= 0) {
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_State).append(" <>:state ");
		parameter.put("state", Integer.valueOf(0));
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_EffectiveDate).append(" <= now() ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_ExpireDate).append(" >= now() ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", Long.valueOf(custId));
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		return (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, start, end);

	}

	public int queryCmInsCmRelValuesCount(long custId, long userId) throws Exception {
		if (custId <= 0 && userId <= 0) {
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_State).append(" <>:state ");
		parameter.put("state", Integer.valueOf(0));
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_EffectiveDate).append(" <= now() ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_ExpireDate).append(" >= now() ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", Long.valueOf(custId));
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOLnCmInsCmRelBean.class, condition.toString(), parameter);

	}

	@Override
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCdns(long custId, long userId, int relType, int userType) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		if (relType > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_RelaType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		if (userType > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserType).append(" =:userType ");
			parameter.put("userType", userType);
		}
		return (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, -1, -1);
	}

	public void sendToBilling(IBOLnCmInsCmRelValue[] lnCmInsCmRelValues) throws Exception {
		for (int i = 0; i < lnCmInsCmRelValues.length; i++) {
			lnCmInsCmRelValues[i].setDoneCode(ServiceManager.getDoneCode());
		}
        String regionId=CmCommonUtil.getDefaultRegionId();
//        if (!CenterFactory.isSetCenterInfo()) {
//            regionId = CmCommonUtil.getDefaultRegionId();
//            CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, regionId);
//        } else {
//            regionId = CenterFactory.getCenterInfo().getRegion();
//        }
        List<HashMap> list = new ArrayList<HashMap>();
		for (int i = 0; i < lnCmInsCmRelValues.length; i++) {
			HashMap map1 = new HashMap();
			map1.put(IBOLnCmInsCmRelValue.S_UserId, lnCmInsCmRelValues[i].getUserId());
			map1.put(IBOLnCmInsCmRelValue.S_CustId, lnCmInsCmRelValues[i].getCustId());
			map1.put("RELATIONSHIP_TYPE", lnCmInsCmRelValues[i].getRelaType());
			if(lnCmInsCmRelValues[i].getOfferId() >0){
				map1.put("OFFER_ID", lnCmInsCmRelValues[i].getOfferId());
			}
			// map1.put(IBOLnCmInsCmRelValue.S_EffectiveDate, lnCmInsCmRelValues[i].getEffectiveDate());
			// map1.put(IBOLnCmInsCmRelValue.S_ExpireDate, lnCmInsCmRelValues[i].getExpireDate());
			map1.put(IBOLnCmInsCmRelValue.S_DoneCode, lnCmInsCmRelValues[i].getDoneCode());
			map1.put(IBOLnCmInsCmRelValue.S_DoneDate, ServiceManager.getOpDateTime());
			// map1.put(IBOLnCmInsCmRelValue.S_EffectiveDate,ServiceManager.getOpDateTime());
			map1.put("REGION_ID", regionId);
			if (lnCmInsCmRelValues[i].isDeleted()) {
				map1.put("OPER_TYPE", 3);
				map1.put(IBOLnCmInsCmRelValue.S_ExpireDate, ServiceManager.getOpDateTime());
				map1.put(IBOLnCmInsCmRelValue.S_EffectiveDate, lnCmInsCmRelValues[i].getEffectiveDate());
				list.add(map1);
			}else if (lnCmInsCmRelValues[i].isNew()) {
				map1.put(IBOLnCmInsCmRelValue.S_UserType, lnCmInsCmRelValues[i].getUserType());
				if(null!=lnCmInsCmRelValues[i].getEffectiveDate()){
					map1.put(IBOLnCmInsCmRelValue.S_EffectiveDate, lnCmInsCmRelValues[i].getEffectiveDate());
				}else{
					map1.put(IBOLnCmInsCmRelValue.S_EffectiveDate, ServiceManager.getOpDateTime());
				}
				map1.put(IBOLnCmInsCmRelValue.S_ExpireDate, TimeUtil.getMaxExpire());
				map1.put("OPER_TYPE", 1);
				list.add(map1);
			}else if (lnCmInsCmRelValues[i].isModified()) {
				map1.put(IBOLnCmInsCmRelValue.S_EffectiveDate, ServiceManager.getOpDateTime());
				map1.put(IBOLnCmInsCmRelValue.S_ExpireDate, lnCmInsCmRelValues[i].getExpireDate());
				HashMap map2 = new HashMap();
				long cmrelId = lnCmInsCmRelValues[i].getCmrelId();
//				IBOLnCmInsCmRelValue bean = new BOLnCmInsCmRelBean();
//				bean.setCmrelId(cmrelId);
//				bean.setCustId(lnCmInsCmRelValues[i].getCustId());
				//IBOLnCmInsCmRelValue value = (IBOLnCmInsCmRelValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
				ICmCustomerSV cmCustomerSv =  (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
				IBOCmInsCmrelValue value = cmCustomerSv.queryCmInsByCmrelId(cmrelId, lnCmInsCmRelValues[i].getCustId());
				map2.put(IBOLnCmInsCmRelValue.S_UserId, value.getUserId());
				map2.put(IBOLnCmInsCmRelValue.S_CustId, value.getCustId());
				map2.put("RELATIONSHIP_TYPE", value.getRelaType());
				map2.put(IBOLnCmInsCmRelValue.S_EffectiveDate, value.getEffectiveDate());
				map2.put(IBOLnCmInsCmRelValue.S_ExpireDate, ServiceManager.getOpDateTime());
				map2.put(IBOLnCmInsCmRelValue.S_DoneCode, ServiceManager.getDoneCode());
				map2.put(IBOLnCmInsCmRelValue.S_DoneDate, ServiceManager.getOpDateTime());
				map2.put("REGION_ID", regionId);
				map2.put("OPER_TYPE", 3);
				list.add(map2);
				map1.put("OPER_TYPE", 1);
				list.add(map1);
			}
		}
		HashMap maps = new HashMap();
		maps.put("I_CUST_USER", list);
		IInterfaceBillCrmSV service = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
		service.sendMapOrderInfoToBilling(maps);
	}
	// public static void main(String[] args) throws Exception {
	// UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
	// userInfo.setTenantId("02");
	// userInfo.set("REGION_ID","021");
	// userInfo.setID(123);
	// userInfo.setOrgId(23123);
	// ServiceManager.setServiceUserInfo(userInfo);
	// //IBOLnCmInsCmRelValue[] boLnCmInsCmRelValueUser =
	// CmxServiceFactory.getLnCommonServiceSV().queryCmInsCmRelValues(23111000000027l, 41110000000227l);
	// BOLnCmInsCmRelBean cmInsCmRelBean = new BOLnCmInsCmRelBean();
	// cmInsCmRelBean.setCustId(23111000000027l);
	// cmInsCmRelBean.setRelaType(2);
	// cmInsCmRelBean.setState(1);
	// cmInsCmRelBean.setUserRegionCode("021");
	// //cmInsCmRelBean.copy(boLnCmInsCmRelValueUser[0]);
	// cmInsCmRelBean.set("STATE", CmLnConstants.UserState.USER_DES);
	// //cmInsCmRelBean.delete();
	// ICmLnCommonServiceSV service=(ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
	// service.saveCmInsCmRelValues(new BOLnCmInsCmRelBean[] { cmInsCmRelBean });
	// }
}
