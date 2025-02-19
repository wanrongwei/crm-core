package com.asiainfo.crm.cm.service.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsParaDetailValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.secframe.client.SecframeClient;
import com.asiainfo.crm.cm.busimodel.rule.CmIndivCustomerBusiRule;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmConstants.controlCprNumber;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustRequestTaskBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustRequestTaskEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmIndivCustomerDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.inter.exe.webservice.client.cpr.CPRServiceClient;
import com.asiainfo.crm.util.SoConstUtil;

public class CmIndivCustomerSVImpl implements ICmIndivCustomerSV {

	private static final transient Log log = LogFactory.getLog(CmIndivCustomerSVImpl.class);

	public IBOCmIndivCustomerValue queryIndivCustomerById(long indivCustId) throws Exception, RemoteException {
		ICmIndivCustomerDAO indivCustomerDAO = (ICmIndivCustomerDAO) ServiceFactory.getService(ICmIndivCustomerDAO.class);
		IBOCmIndivCustomerValue customerValue = indivCustomerDAO.queryIndivCustomerById(indivCustId);
		if (customerValue != null) {
			// 需要取没有被模糊化的证件号码 Modified by huzq2 at 20110927.
			if (CmIndivCustomerBusiRule.isRealNameCust(null, null, customerValue.getCustName(), String.valueOf(customerValue.getCustCertType()),
					DataType.getAsString(customerValue.getOldObj(IBOCmIndivCustomerValue.S_CustCertCode)))) {
				customerValue.setRealNameFlag(1);
			} else {
				customerValue.setRealNameFlag(0);
			}
		}
		return customerValue;
	}

	public IBOCmIndivCustomerValue[] queryIndivCustomerByCustNameAndBirthday(String custName, String birthday) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustName).append(" =:custName ");
		parameter.put("custName", custName);
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_Birthday).append(" = date_format( :startDate ,'%Y-%m-%d %H:%i:%s') ");
		parameter.put("startDate", birthday + " 00:00:00");
		return (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOCmCustContactMediumValue queryCustAddressByCustId(String type, long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ContMedTypeId).append(" =:type ");
		parameter.put("type", type);
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public ICustomerValue[] queryDuplicateCust(String cprIds, int start, int end) throws Exception {
		long[] cprs = null;
		if (StringUtils.isNotBlank(cprIds)) {
			String[] ids = cprIds.split(",");
			cprs = new long[ids.length];
			for (int i = 0; i < ids.length; i++) {
				cprs[i] = Long.parseLong(ids[i]);
			}
		}
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue[] values = service.queryCustomersByCustIds(cprs, CmConstants.CustomerType.INDIVIDUAL, start, end);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values;
		}
		return new ICustomerValue[0];
	}

	public int queryDuplicateCustCount(String cprIds) throws Exception {
		return queryDuplicateCust(cprIds, -1, -1).length;
	}

	public void saveAKSInfo(long custId, int status) throws Exception {
		IVOCustValue voCustValue = new VOCustBean();
		if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
			// 针对个人客户
			BOCmxIndivCustomerBean indivBean = new BOCmxIndivCustomerBean();
			IBOCmxIndivCustomerValue temp = CmServiceFactory.getCustomerSV().queryCmxIndivCustomerValue(custId);
			indivBean.copy(temp);
			indivBean.setAksStatus(String.valueOf(status));
			if(StringUtils.isBlank(indivBean.getRegionId())){
				indivBean.setRegionId(CmCommonUtil.getDefaultRegionId());
			}
			if (status==Integer.valueOf(CmConstants.AksStatus.SUBSCRIPTION_SUCCESS) || status==Integer.valueOf(CmConstants.AksStatus.UNSUBSCRIPTION_SUCCESS)) {
				indivBean.setAksRegistrationDate(ServiceManager.getOpDateTime());
				//设置注册标识 
				if(status==Integer.valueOf(CmConstants.AksStatus.UNSUBSCRIPTION_SUCCESS)) {
					indivBean.setUpdateFlag(2);
				}else if(status==Integer.valueOf(CmConstants.AksStatus.SUBSCRIPTION_SUCCESS)) {
					indivBean.setUpdateFlag(1);
				}
			}
			voCustValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, indivBean);
			CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);
		} else {
			// 针对集团客户
			BOLnCmxGroupCustBean groupBean = new BOLnCmxGroupCustBean();
			IBOLnCmxGroupCustValue temp = CmxServiceFactory.getLnGroupSV().queryGroupCustExtById(custId);
			groupBean.copy(temp);
			groupBean.setAksStatus(String.valueOf(status));
			if(StringUtils.isBlank(groupBean.getRegionId())){
				groupBean.setRegionId(CmCommonUtil.getDefaultRegionId());
			}
			if (status==Integer.valueOf(CmConstants.AksStatus.SUBSCRIPTION_SUCCESS) || status==Integer.valueOf(CmConstants.AksStatus.UNSUBSCRIPTION_SUCCESS)) {
				groupBean.setAksRegistrationDate(ServiceManager.getOpDateTime());
				//设置注册标识 
				if(status==Integer.valueOf(CmConstants.AksStatus.UNSUBSCRIPTION_SUCCESS)) {
					groupBean.setUpdateFlag(2);
				}else if(status==Integer.valueOf(CmConstants.AksStatus.SUBSCRIPTION_SUCCESS)) {
					groupBean.setUpdateFlag(1);
				}
			}
			voCustValue.setUserObject("cmxGrpCust", groupBean);
			CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);
		}
	}

	public boolean ifCustIsProtected(long custId) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue value = service.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.legalAddress));
		if (CmCommonUtil.isNotEmptyObject(value)) {
			if (null != value.getProtectEffDate()) {
				return true;
			}
		}
		return false;
	}

	public Map validateCPR(Map params) throws Exception {
		return CPRServiceClient.queryInfo(params);
	}

	public boolean whetherCprCanEdit(long custId) throws Exception {
		// 调用权限接口判断CPR是否可修改
		long opId = ServiceManager.getUser().getID();
		boolean secFlag = SecframeClient.checkEntityPermission(opId, CmConstants.controlCprNumber.ent_id, controlCprNumber.priv_id);
		// 查询CPR请求工单返回结果是否为空
		ICmCustRequestTaskSV taskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		IBOCmCustRequestTaskValue[] values = (IBOCmCustRequestTaskValue[]) taskSV.queryByCustId(custId);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			//modify by yangjh 增加准备送cpr状态下也可以补充CPR
			if ((StringUtils.isNotBlank(values[0].getResults()) && secFlag)||(StringUtils.equalsIgnoreCase("C",values[0].getRequestStatus())&&secFlag)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public DataContainer dealModifyCPR(String custId, String custCertCode, String flag, String inputFirstName, String inputLastName, String inputBirthday, String saveScene) throws Exception {
		// 首先判断custCertCode是否发生改变，只有改变了再去送CPR，未改变则更新客户信息
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = service.queryCustomerByCustId(Long.parseLong(custId));
		DataContainer dc = new DataContainer();
		if (CmCommonUtil.isNotEmptyObject(custValue)) {
			if (StringUtils.isNotBlank(custCertCode)) {
				IBOCmIndivCustomerValue[] values = service.queryCustomerByCPR(custCertCode);
				if (CmCommonUtil.isNotEmptyObject(values) && Long.parseLong(custId) != values[0].getCustId()) {
					// CPR在CRM进行验证客户是否存在，存在且不是当前客户则提示报错
					ExceptionUtil.throwBusinessException("CMS9988771");
				}
				Map params = new HashMap();
				params.put("PNR", custCertCode);
				Map cprData = validateCPR(params);
				String FEJLNR = (String) cprData.get("FEJLNR");
				if (!"00".equals(FEJLNR)) {
					// CPR在CPR系统中不存在。
					ExceptionUtil.throwBusinessException("CMS9988772");
				}
				Map data1 = (Map) cprData.get("DATA");
				Map data2 = (Map) data1.get("INFO");
				Map currentData = (Map) data2.get("Current_data");
				// 是否受保护
				String isProtected = (String) currentData.get("NVNADRBESKHAENSTART");
				String personStatus= (String) currentData.get("STATUS");
				String var = "[0]*";
				// 名称生日匹配不上不保存客户地址不送CPR订购
				boolean matchFlag = false;
				if (!isProtected.matches(var) || "70".equals(personStatus) || "80".equals(personStatus)) {
					// 受保护
					dc.set("protected", "Y");
					dc.set("birth", currentData.get("FOEDDTO"));
				} else {
					// 从CPR返回的客户名称
					String firstName = (String) currentData.get("FORNVN");
					String lastName = (String) currentData.get("EFTERNVN");
					// 从CPR返回的生日
					String birthDay = (String) currentData.get("FOEDDTO");
					// 潜在客户名称都是美元符号或者生日可以为空场景不校验
					if (StringUtils.equals(custValue.getFirstName(), "$$$$") || StringUtils.equals(custValue.getLastName(), "$$$$")
							|| custValue.getBirthday() == null) {
						matchFlag = true;
					} else {
						matchFlag = CmCommonUtil.checkNameAndBirthdayMatch(firstName, lastName, birthDay,
								custValue, inputFirstName, inputLastName, inputBirthday, saveScene);
					}
					// 不受保护
					dc.set("protected", "N");
					dc.set("firstName", CmCommonUtil.capitalizeFirstLetter(firstName));
					dc.set("lastName", CmCommonUtil.capitalizeFirstLetter(lastName));
					dc.set("birth", birthDay);
					if (matchFlag) {
						dc.set("matchFlag", CmConstants.YES);
					} else {
						dc.set("matchFlag", CmConstants.NO);
					}
					// 匹配上或者不送CPR订购才更新客户地址
					if (matchFlag || CmConstants.NO.equals(flag)) {
						// 从CPR返回的地址
						dealCustOrPartyAddressByCpr(Long.parseLong(custId), 0, currentData, dc);
					}
				}
				// 送工单表 非匿名客户、潜在和离网客户也不发CPR SEND，纯User的修改需要发CPR订购
				if(CmConstants.YES.equals(flag) && matchFlag
						&& Long.parseLong(custId) != CmConstants.ANONYMOUS_CUST_ID) {
					if ((String.valueOf(CmConstants.EntityType.CUSTOMER).equals(custValue.getIndivCustType())
							&& custValue.getCustStatus() != CmConstants.CustomerStatus.INDIV_INACTIVE
							&& custValue.getCustStatus() != CmConstants.CustomerStatus.INDIV_POTENTIAL)
							|| String.valueOf(CmConstants.EntityType.USER).equals(custValue.getIndivCustType())) {
						saveCustRequestTaskInfo(custValue, 4, "C");
					}
				}
			}
		}
		return dc;
	}

	private void dealCustOrPartyAddressByCpr(long custId, long partyId, Map currentData, DataContainer dc) throws Exception {
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
		address address = new address();
		address.setAddressType(CmConstants.Address.ADDRESSTYPE);
		address.setDistrictId(CmConstants.Address.DISTRICTID);
		if(StringUtils.isNotBlank(houseNum)){
			if(Character.isLetter(houseNum.charAt(houseNum.length()-1))){
				address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.substring(0,houseNum.length()-1).trim())));
				address.setHouseLetter(String.valueOf(houseNum.charAt(houseNum.length()-1)));
			}else{
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
		//根据特殊规则判断sidedoer的走向
		if(StringUtils.isNotBlank(sideOrApartNum)){
			if(CmCommonUtil.validateSidedoer(sideOrApartNum)){
				address.setApartment(sideOrApartNum.trim());
				address.setDoorNumber("");
			}else{
				address.setDoorNumber(sideOrApartNum.trim());
				address.setApartment("");
			}
		}else{
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
		address.setAddrDesc("");
		address.setMainDoor("");

		//地址层级中增加CO_NAME
		if(StringUtils.isNotBlank(coName)){
			address.setCoName(coName);
		}else{
			address.setCoName("");
		}
		// 查询出地址ID
		IAddressSV addressService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		long addressId = addressService.saveAddress(address);
		// 更新地址
		if (custId > 0) {
			saveCustAddress(custId, addressId);
		} else if (partyId > 0) {
			returnPartyAddress(partyId, addressId, dc);
		}
	}

	/**
	 * 返回party地址给前端
	 *
	 * @param partyId
	 * @param addressId
	 * @param dc
	 */
	private void returnPartyAddress(long partyId, long addressId, DataContainer dc) throws Exception {
		ICmPartySV partySv = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IBOCmPartyContactValue[] partyContactValue = partySv.queryPartyContact(partyId);
		if (CmCommonUtil.isNotEmptyObject(partyContactValue)) {
			// 不相等才更新
			if (!StringUtils.equals(String.valueOf(addressId), partyContactValue[0].getContAddress())) {
				IAddressSV addressService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
				address address = addressService.getAddress(addressId, CmConstants.AddressDistrictId.DISTRICT_ID);
				dc.set("addressId", addressId);
				dc.set("addressDetail", address.getAddrDesc());
			}
		}
	}

	/**
	 * 保存客户请求任务信息
	 * @Function saveCustRequestTaskInfo
	 * @Description 
	 *
	 * @param customerVal
	 * @param action (1:退订CPR,4:订购CPR)
	 * @param reqStatus(T:待处理前的临时状态、C:待处理)
	 * @throws Exception
	 * @throws AIException
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-4-30 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-4-30     yangjh           v1.0.0               修改原因<br>
	 */
	private void saveCustRequestTaskInfo(ICustomerValue customerVal, int action, String reqStatus) throws Exception, AIException {
		ICmCustRequestTaskSV sv = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		IBOCmCustRequestTaskValue taskValue = null;
		long custId = customerVal.getCustId();
		IBOCmCustRequestTaskValue[] vals = sv.queryByCustId(custId);
		if (vals != null && vals.length > 0) {
			taskValue = vals[0];
			taskValue.setOpId(ServiceManager.getUser().getID());
			taskValue.setOrgId(ServiceManager.getUser().getOrgId());
			taskValue.setDoneDate(ServiceManager.getOpDateTime());
		} else {
			taskValue = new BOCmCustRequestTaskBean();
			taskValue.setPriority(5);
			taskValue.setCustId(custId);
			taskValue.setTaskId(BOCmCustRequestTaskEngine.getNewId().longValue());
			taskValue.setCreateDate(ServiceManager.getOpDateTime());
			taskValue.setCreateOpId(ServiceManager.getUser().getID());
			taskValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			taskValue.setRegionId(customerVal.getRegionId());
			taskValue.setState(CmConstants.RecordState.USE);
		}

		taskValue.setStatusDate(ServiceManager.getOpDateTime());
		taskValue.setRequestStatus(reqStatus);
		taskValue.setRequestType(action);
		taskValue.setResults("");
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) taskValue);
	}

	/**
	 * 跟新地址信息
	 * @Function saveCustAddress
	 * @Description 
	 *
	 * @param custId
	 * @param addressId
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-4-30 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-18     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveCustAddress(long custId, long addressId) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue addressValue = service.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.legalAddress));
		IAddressSV addressService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		ICmCustomerSV customerSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		BOCmCustContactMediumBean addressBean = new BOCmCustContactMediumBean();
		address address = addressService.getAddress(addressId, "012002002");
		if(CmCommonUtil.isNotEmptyObject(addressValue)){
			if(addressId!=addressValue.getAddressId()){
				//更新法律地址
				addressBean.copy(addressValue);
				addressBean.setAddressId(addressId);
				addressBean.setAddressDetail(address.getAddrDesc());
			}
		}else{
			//新建法律地址
			addressBean.setAddressId(addressId);
			addressBean.setAddressDetail(address.getAddrDesc());
			addressBean.setRegionId(CmCommonUtil.getDefaultRegionId());
			addressBean.setCustId(custId);
			addressBean.setContMedTypeId(CmConstants.AddressId.legalAddress);	
		}
		customerSV.saveCustContMedium(new IBOCmCustContactMediumValue[]{addressBean});
	}

	public DataContainer[] queryPartyInfo(long partyId) throws Exception {
		// 查询party的相关信息
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT A.FIRST_NAME,A.MIDDLE_NAME,A.LAST_NAME,B.CONT_ADDRESS,C.BIRTHDAY FROM {CM_PARTY} A,{CM_PARTY_CONTACT} B,{CM_INDIV_PARTY} C WHERE A.`PARTY_ID`=B.`PARTY_ID` AND B.`PARTY_ID`=C.`PARTY_ID` AND A.`PARTY_ID`=:partyId ");
		HashMap parameter = new HashMap();
		parameter.put("partyId", partyId);
		String condition = SplitTableFactory.createQuerySQL(sql.toString(), parameter);
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
	}

	public DataContainer[] queryCustomerSendToCPR(long custId) throws Exception {
		// 查询送CPR的客户相关信息
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT B.FIRST_NAME,B.MIDDLE_NAME,B.LAST_NAME,B.BIRTHDAY,C.ADDRESS_ID FROM {CM_INDIV_CUSTOMER} B,{CM_CUST_CONTACT_MEDIUM} C WHERE B.`CUST_ID`=C.`CUST_ID` AND B.`CUST_ID`=:custId AND C.`CONT_MED_TYPE_ID`=:type ");
		HashMap parameter = new HashMap();
		parameter.put("custId", custId);
		parameter.put("type", CmConstants.AddressId.legalAddress);
		String condition = SplitTableFactory.createQuerySQL(sql.toString(), parameter);
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
	}

	public IBOCmCustRequestTaskValue[] queryCmCustRequestInfo(String requestStatus) throws Exception {
		// 查询工单的信息
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_RequestStatus).append(" =:status ");
		parameter.put("status", requestStatus);
		condition.append(" order by CREATE_DATE");
		return (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class, condition.toString(), parameter, -1, -1);
	}

	public long queryCustIdByPNR(long cprId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmxIndivCustomerValue.S_Pnr).append(" =:cprId ");
		parameter.put("cprId", cprId);
		IBOCmxIndivCustomerValue[] custValues = (IBOCmxIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmxIndivCustomerBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(custValues)) {
			return custValues[0].getCustId();
		}
		return 0;
	}
	
	public IBOCmIndivCustomerValue[] queryCmIndivCustByPartyId(String partyId) throws Exception{
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter=new HashMap();
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_State).append(" =:state ");
		parameter.put("state", "U");
		ICmIndivCustomerDAO cmIndivCustDao = (ICmIndivCustomerDAO)ServiceFactory.getService(ICmIndivCustomerDAO.class);
		return cmIndivCustDao.queryIndivCustomers(condition.toString(), parameter);
	}

	/**
	 * 获取CPR_NUMBER、CPR_PROFILE是否可编辑
	 *
	 * @param partyId
	 * @param custId
	 * @param guiType
	 * @param registerType
	 * @return
	 * @throws Exception
	 */
	@Override
	public Map<String, String> getCprEditMapFromMatrix(long custId, long partyId, String guiType, String registerType) throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put(CmConstants.EDIT_CPR_NUMBER, CmConstants.NO);
		map.put(CmConstants.EDIT_CPR_PROFILE, CmConstants.NO);
		String subscriptionStatus = "";
		ICmCustRequestTaskSV taskSv = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		IBOCmCustRequestTaskValue[] requestTaskValues = null;
		if (custId > 0) {
			requestTaskValues = taskSv.queryByCustId(custId);
		}
		if (partyId > 0) {
			requestTaskValues = taskSv.queryByCustId(partyId);
		}
		// Always not allowed to modify either CPR or profile when CPR subscription in progress
		if (CmCommonUtil.isNotEmptyObject(requestTaskValues)) {
			IBOCmCustRequestTaskValue requestTaskValue = taskSv.queryRequestStatusForShow(requestTaskValues);
			if (requestTaskValue != null) {
				subscriptionStatus = requestTaskValue.getRequestStatus();
			}
			if (CmConstants.RequestStatus.temporaryState.equals(requestTaskValues[0].getRequestStatus())) {
				subscriptionStatus = CmConstants.requestOrderStatus.Initial;
			}
			// Party不是P状态
			if (partyId > 0 && !StringUtils.equals(subscriptionStatus, CmConstants.requestOrderStatus.sendCPROrder)
					&& !StringUtils.equals(subscriptionStatus, CmConstants.requestOrderStatus.SendCPRUnsub)) {
				subscriptionStatus = CmConstants.requestOrderStatus.ExceptInProgress;
			}
		} else {
			if (partyId > 0) {
				subscriptionStatus = CmConstants.requestOrderStatus.ExceptInProgress;
			} else {
				subscriptionStatus = CmConstants.requestOrderStatus.MissingRecord;
			}
		}
		ICustomerValue customerValue = null;
		if (custId > 0) {
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			customerValue = service.queryCustomerByCustId(custId);
		}
		// Always not allowed to modify either CPR or profile when customer is terminated or party is inactive
		String custStatus = "";
		if (CmConstants.cprGuiType.CUSTOMER_VIEW.equalsIgnoreCase(guiType)) {
			if (customerValue == null || customerValue.getCustStatus() == CmConstants.CustomerStatus.INDIV_TERMINATED) {
				return map;
			} else {
				partyId = customerValue.getPartyId();
				custStatus = String.valueOf(customerValue.getCustStatus());
			}
		}

		ICmPartySV partySv = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IPartyValue partyValue = partySv.queryPartyById(partyId);
		if (partyValue == null) {
			map.put(CmConstants.OTHER_ERROR, CmConstants.YES);
			return map;
		} else if (CmConstants.RecordState.ERASE.equals(partyValue.getState())) {
			subscriptionStatus = CmConstants.requestOrderStatus.AllStatus;
		}

		IBOBsParaDetailValue[] bsParaDetailValues = SoConstUtil.getParaDetailValues("X", CmConstants.CPR_CONFIG_MATRIX, guiType);
		if (CmCommonUtil.isNotEmptyObject(bsParaDetailValues)) {
			for (IBOBsParaDetailValue paraDetailValue : bsParaDetailValues) {
				if (CmConstants.cprGuiType.CUSTOMER_VIEW.equalsIgnoreCase(paraDetailValue.getParaCode())) {
					if (registerType.equals(paraDetailValue.getPara1())
							&& custStatus.equals(paraDetailValue.getPara2())
							&& subscriptionStatus.equals(paraDetailValue.getPara3())) {
						map.put(CmConstants.EDIT_CPR_NUMBER, paraDetailValue.getPara4());
						map.put(CmConstants.EDIT_CPR_PROFILE, paraDetailValue.getPara5());
						break;
					}
				} else {
					if (guiType.equalsIgnoreCase(paraDetailValue.getParaCode())
							&& registerType.equals(paraDetailValue.getPara1())
							&& partyValue.getState().equals(paraDetailValue.getPara2())
							&& subscriptionStatus.equals(paraDetailValue.getPara3())) {
						map.put(CmConstants.EDIT_CPR_NUMBER, paraDetailValue.getPara4());
						map.put(CmConstants.EDIT_CPR_PROFILE, paraDetailValue.getPara5());
						break;
					}
				}
			}
		}

		// Only when the matrix defines as Yes and agent has privilege, it’s allowed to edit it.
		long opId = ServiceManager.getUser().getID();
		boolean cprNumberFlag = SecframeClient.checkEntityPermission(opId, CmConstants.controlCprNumber.ent_id, CmConstants.controlCprNumber.priv_id);
		if (!cprNumberFlag) {
			map.put(CmConstants.EDIT_CPR_PROFILE, CmConstants.NO);
		}

		// 当配置有新权限，且矩阵的cpr number为可编辑，不管profile结果都可以编辑profile和cpr number
		if (CmCommonUtil.judgeCprProfileSec() && CmConstants.YES.equals(map.get(CmConstants.EDIT_CPR_NUMBER))) {
			map.put(CmConstants.EDIT_CPR_NUMBER, CmConstants.YES);
			map.put(CmConstants.EDIT_CPR_PROFILE, CmConstants.YES);
		}
		return map;
	}

	@Override
	public DataContainer dealModifyPayerCPR(long partyId, String custCertCode, String inputFirstName, String inputLastName, String inputBirthday) throws Exception {
		// 首先判断custCertCode是否发生改变，只有改变了再去送CPR，未改变则更新客户信息
		ICmPartySV partySv = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IQBOCmPayerInfoValue partyValue = partySv.queryPartyInfoByPartyId(partyId);
		DataContainer dc = new DataContainer();
		if (CmCommonUtil.isNotEmptyObject(partyValue)) {
			if (StringUtils.isNotBlank(custCertCode)) {
				IBOCmPartyValue[] partyArr = partySv.queryPartyByCertTypeAndCertCode(8, custCertCode, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(partyArr) && partyId != partyArr[0].getPartyId()) {
					// CPR在CRM进行验证Party是否存在，存在且不是当前Party则提示报错
					ExceptionUtil.throwBusinessException("CMS9988771");
				}
				Map params = new HashMap();
				params.put("PNR", custCertCode);
				Map cprData = validateCPR(params);
				String FEJLNR = (String) cprData.get("FEJLNR");
				if (!"00".equals(FEJLNR)) {
					// CPR在CPR系统中不存在。
					ExceptionUtil.throwBusinessException("CMS9988772");
				}
				Map data1 = (Map) cprData.get("DATA");
				Map data2 = (Map) data1.get("INFO");
				Map currentData = (Map) data2.get("Current_data");
				// 是否受保护
				String isProtected = (String) currentData.get("NVNADRBESKHAENSTART");
				String personStatus= (String) currentData.get("STATUS");
				String var = "[0]*";
				if (!isProtected.matches(var) || "70".equals(personStatus) || "80".equals(personStatus)) {
					// 受保护
					dc.set("protected", "Y");
					dc.set("birth", currentData.get("FOEDDTO"));
				} else {
					// 从CPR返回的客户名称
					String firstName = (String) currentData.get("FORNVN");
					String lastName = (String) currentData.get("EFTERNVN");
					// 从CPR返回的生日
					String birthDay = (String) currentData.get("FOEDDTO");
					// 潜在客户名称都是美元符号或者生日可以为空场景不校验
					boolean matchFlag;
					if (StringUtils.equals(partyValue.getFirstName(), "$$$$") || StringUtils.equals(partyValue.getLastName(), "$$$$")
							|| partyValue.getBirthday() == null) {
						matchFlag = true;
					} else {
						matchFlag = CmCommonUtil.checkCprProfileMatchForPayer(firstName, lastName, birthDay,
								partyValue, inputFirstName, inputLastName, inputBirthday);
					}
					// 不受保护
					dc.set("protected", "N");
					dc.set("firstName", CmCommonUtil.capitalizeFirstLetter(firstName));
					dc.set("lastName", CmCommonUtil.capitalizeFirstLetter(lastName));
					dc.set("birth", birthDay);
					if (matchFlag) {
						dc.set("matchFlag", CmConstants.YES);
					} else {
						dc.set("matchFlag", CmConstants.NO);
					}
					dealCustOrPartyAddressByCpr(0, partyId, currentData, dc);
				}
			}
		}
		return dc;
	}

	@Override
	public String getCprModifyPermission(long custId) throws Exception {
		String permission = CmConstants.NO;
		long opId = ServiceManager.getUser().getID();
		boolean cprNumberFlag = SecframeClient.checkEntityPermission(opId, CmConstants.controlCprNumber.ent_id, CmConstants.controlCprNumber.priv_id);
		boolean hasPermission = false;

		// 有任一权限
		if (CmCommonUtil.judgeCprProfileSec() || cprNumberFlag) {
			hasPermission = true;
		}

		if (hasPermission) {
			ICmCustRequestTaskSV taskSv = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
			IBOCmCustRequestTaskValue[] requestTaskValues = taskSv.queryByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(requestTaskValues)) {
				if (!CmConstants.RequestStatus.processing.equals(requestTaskValues[0].getRequestStatus())) {
					permission = CmConstants.YES;
				}
			} else {
				permission = CmConstants.YES;
			}
		}
		return permission;
	}
}
