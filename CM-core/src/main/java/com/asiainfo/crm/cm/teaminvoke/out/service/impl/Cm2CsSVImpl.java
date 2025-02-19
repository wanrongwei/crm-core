package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import org.apache.commons.lang.ArrayUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IContactValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustPreferenceInfoSV;
import com.asiainfo.crm.cm.dk.ws.ImsWrapQueryServiceClient;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfomationValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.VOCustAddressBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2CsSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV;

public class Cm2CsSVImpl implements ICm2CsSV {

	public IBOCmCustPerferInfomationValue[] getCmCustPerferInfomation(long custId, int perferType) throws Exception {
		ICmCustPreferenceInfoSV sv = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
		IBOCmCustPerferInfomationValue[] vals = sv.queryCustPreferInformation(custId, -1, -1);
		if (vals != null && vals.length > 0) {
			List<IBOCmCustPerferInfomationValue> list = new ArrayList<IBOCmCustPerferInfomationValue>();
			int preferTypeId = -1;
			for (int i = 0; i < vals.length; i++) {
				preferTypeId = vals[i].getPerferType();
				if (preferTypeId == perferType) {
					list.add(vals[i]);
				}
			}
			if (!list.isEmpty()) {
				return (IBOCmCustPerferInfomationValue[]) list.toArray(new IBOCmCustPerferInfomationValue[0]);
			}
		}
		return null;
	}

	public IBOCmCustPerferInfoValue[] getBOCmPreferPeriods(long preferId) throws Exception {
		ICmCustPreferenceInfoSV sv = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
		return sv.queryCustPreferTimeInfor(preferId, -1, -1);
	}

	public IBOCmxIndivCustomerValue getCmxIndivCustomerByCustId(long custId) throws Exception {
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		return sv.queryCmxIndivCustomerByCustId(custId);
	}

	public ICustomerValue queryCustByEmail(String email) throws Exception {
		com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		IQBOCmCustContMediumAndTypeValue[] contMediumAndTypeValues = customerSV.queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.ELECTRONIC_ADDRESS,
				CmDkConstants.CustContMedium.EMAIL, email);
		if (contMediumAndTypeValues != null && contMediumAndTypeValues.length > 0) {
			long custId = contMediumAndTypeValues[0].getCustId();
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(ICustomerValue.S_CustId, custId);
			conditionDC.set(ICustomerValue.S_IndivCustType, CmConstants.CustSubType.INDIV_CUSTOMER);
			ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
			if (customerValues != null && customerValues.length > 0) {
				return customerValues[0];
			}
		}
		return null;
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustContactMediums(long custId) throws Exception {
		IQBOCmCustContMediumAndTypeValue[] custContMediums = CmServiceFactory.getCustomerSV().queryCustElectronicMediumForPage(custId, -1, -1);
		if (custContMediums != null && custContMediums.length > 0) {
			return custContMediums;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public void saveGroupContaces(IContactValue[] contactValues) throws Exception {

	}

	public address getAddress(long addressId) throws Exception {
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		return addressSV.getAddress(addressId, null);
	}

	public DoQueryResponse getAcctInfo(long acctId) throws RemoteException, Exception {
		return ImsWrapQueryServiceClient.getInstance().getAcctInfo(acctId);
	}

	public IBOCmxIndivCustomerValue queryCmxIndivCustomerValue(long custId) throws Exception {
		return CmServiceFactory.getCustomerSV().queryCmxIndivCustomerValue(custId);
	}

	public IBOCmCustContactMediumValue queryCustContactMediumByCustIdAndType(long custId, String contMedTypeId) throws Exception {
		return CmServiceFactory.getCustomerSV().queryCustContactMediumByCustIdAndType(custId, contMedTypeId);
	}

	public IVOCustValue[] queryCustByCustIds(long[] custIds) throws Exception {
		List<IVOCustValue> list = new ArrayList<IVOCustValue>();
		if (null != custIds && custIds.length > 0) {
			List<Long> indivList = new ArrayList<Long>();
			List<Long> groupList = new ArrayList<Long>();
			for (long custId : custIds) {
				if (CmConstants.CustomerType.INDIVIDUAL == CmCommonUtil.getCustType(custId)) {
					// 个人客户
					indivList.add(custId);
				} else {
					// 集团客户
					groupList.add(custId);
				}
			}
			DataContainer[] indivDC = null;
			DataContainer[] groupDC = null;
			// 查询个人客户
			if (null != indivList && indivList.size() > 0) {
				indivDC = queryCustInfo(indivList.toArray(new Long[0]), "CM_INDIV_CUSTOMER");
			}
			// 查询集团客户
			if (null != groupList && groupList.size() > 0) {
				groupDC = queryCustInfo(groupList.toArray(new Long[0]), "CM_GROUP_CUSTOMER");
			}
			// 合并两个类型的客户
			DataContainer[] dcs = (DataContainer[]) ArrayUtils.addAll(indivDC, groupDC);
			// 用作客户信息缓存和地址缓存
			HashMap<Long, IVOCustValue> custInfoMap = new HashMap();
			HashMap<Long, address> addressMap = new HashMap();
			if (CmCommonUtil.isNotEmptyObject(indivDC) || CmCommonUtil.isNotEmptyObject(groupDC)) {
				for (int i = 0; i < dcs.length; i++) {
					IVOCustValue voCustValue = null;
					if (!(custInfoMap.containsKey((Long) dcs[i].getAsLong("CUST_ID")))) {
						voCustValue = new VOCustBean();
						ICustomerValue custValue = new CustomerBean();
						custValue.copy(dcs[i]);
						voCustValue.setCustomer(custValue);
						custInfoMap.put((Long) dcs[i].getAsLong("CUST_ID"), voCustValue);
						list.add(voCustValue);
					} else {
						voCustValue = custInfoMap.get((Long) dcs[i].getAsLong("CUST_ID"));
					}
					// 塞上他的联系媒介信息
					IBOCmCustContactMediumValue contValue = new BOCmCustContactMediumBean();
					contValue.copy(dcs[i]);
					voCustValue.addCustContMedium(new IBOCmCustContactMediumValue[] { contValue });
					// 塞上他的地址层级信息
					address address = null;
					// 针对地址
					if (dcs[i].getAsString("CONT_MED_TYPE_ID").startsWith("1")) {
						if (!(addressMap.containsKey((Long) dcs[i].getAsLong("ADDRESS_ID")))) {
							IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
							address = addressSV.getAddress(dcs[i].getAsLong("ADDRESS_ID"), "");
							addressMap.put((Long) dcs[i].getAsLong("ADDRESS_ID"), address);
						} else {
							address = addressMap.get((Long) dcs[i].getAsLong("ADDRESS_ID"));
						}
						IVOCustAddressValue voCustAddress = new VOCustAddressBean();
						voCustAddress.addAddress(address);
						voCustAddress.addContMedium(contValue);
						voCustValue.addCustAddress(new IVOCustAddressValue[] { voCustAddress });
					}
				}
			}
		}
		return list.toArray(new IVOCustValue[0]);
	}

	private DataContainer[] queryCustInfo(Long[] custIds, String custTable) throws Exception {
		StringBuilder condition = new StringBuilder("SELECT A.CUST_ID,A.CUST_NAME,B.* FROM ");
		condition.append("{").append(custTable.toUpperCase()).append("}").append(" A ");
		condition.append(" ,{CM_CUST_CONTACT_MEDIUM} B WHERE A.CUST_ID=B.CUST_ID AND A.CUST_ID IN ( ");
		for (int i = 0; i < custIds.length; i++) {
			if (i == custIds.length - 1) {
				condition.append(custIds[i]);
			} else {
				condition.append(custIds[i] + ",");
			}
		}
		condition.append(" )");
		condition.append(" ORDER BY A.CUST_ID,B.CONT_MED_TYPE_ID,B.PRIORITY ");
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), new HashMap());
	}
}
