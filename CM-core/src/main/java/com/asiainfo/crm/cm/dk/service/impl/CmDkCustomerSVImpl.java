package com.asiainfo.crm.cm.dk.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import com.asiainfo.crm.util.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.bce.util.BceSVUtil;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.instance.ivalues.IInsCmRelValue;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.service.interfaces.IInstanceQrySV;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.omframe.util.InsServiceFactory;
import com.ai.omframe.util.SoServiceFactory;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.common.OrgModelConstants;
import com.ai.secframe.orgmodel.bo.BOSecOperatorBean;
import com.ai.secframe.orgmodel.bo.BOSecStaffBean;
import com.ai.secframe.orgmodel.ivalues.IBOSecGroupValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecStaffValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustMemberQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustOrganizeQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmInsCmrelBean;
import com.asiainfo.crm.cm.common.bo.BOIdentificationBean;
import com.asiainfo.crm.cm.common.bo.QBOCmGroupPartyBean;
import com.asiainfo.crm.cm.common.bo.QBOCmPayerInfoBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmGroupPartyValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustPreferenceInfoSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustRequestTaskBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmCustContMediumAndTypeBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfomationValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmInsAccrelValue;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOCustAddressBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.service.impl.CmPartySVImpl;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.instance.rboss.ivalues.IBOInsDesUserValue;
import com.asiainfo.crm.so.instance.rboss.service.interfaces.IInsCmRelSV;
import com.asiainfo.crm.so.instance.rboss.service.interfaces.IInsDestroyUserInfoSV;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IStopOpenOsStatusSV;

public class CmDkCustomerSVImpl implements ICmDkCustomerSV {

	public IVOCustValue queryIndivCustomerDtl(long custId, String cprNo, String firstName, String lastName, Date birthday, address address) throws Exception {
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		ICmCustPreferenceInfoSV preferenceInfoSV = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		IVOCustValue voCustValue = new VOCustBean();
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" SELECT T1.*,T2.*,T3.PERFER_LANGUAGE,T4.*,T5.`SEGMENT_ID`,T6.`REQUEST_STATUS`,T6.`STATUS_DATE` FROM ");
		condition.append(" {CM_INDIV_CUSTOMER} T1 ");
		condition.append(" LEFT JOIN {CMX_INDIV_CUSTOMER} T2 ");
		condition.append(" ON T1.CUST_ID=T2.CUST_ID ");
		condition.append(" LEFT JOIN {CM_PARTY} T3 ");
		condition.append(" ON T1.PARTY_ID=T3.PARTY_ID ");
		condition.append(" LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T4 ");
		condition.append(" ON T1.CUST_ID = T4.CUST_ID ");
		condition.append(" AND T4.CONT_MED_TYPE_ID = 11 ");
		condition.append(" LEFT JOIN {CM_CUST_SEGMENT_RELA} T5 ");
		condition.append(" ON T1.CUST_ID=T5.CUST_ID ");
		condition.append(" LEFT JOIN {CM_CUST_REQUEST_TASK} T6");
		condition.append(" ON T3.CPR_id=T6.CUST_ID WHERE 1=1");
		ICustomerValue custValue = null;
		// 根据客户编号和cpr查询客户信息
		if (custId > 0 || StringUtils.isNotBlank(cprNo)) {
			// 针对客户编号不为空
			if (custId > 0) {
				condition.append(" AND T1.CUST_ID=:custId ");
				parameter.put("custId", custId);
			}
			// 针对cpr不为空
			if (StringUtils.isNotBlank(cprNo)) {
				condition.append(" AND T1.CUST_CERT_CODE=:cpr ");
				parameter.put("cpr", cprNo);
			}
		} else {
			// 针对客户名称地址生日查询
			if (StringUtils.isBlank(firstName) || StringUtils.isBlank(lastName) || birthday == null || address == null) {
				// 请输入完整的名称，生日和地址！
				ExceptionUtil.throwBusinessException("CMS0000164");
			}
			long addressId = addressSV.saveAddress(address);
			String custName = firstName + " " + lastName;
			condition.append(" AND T1.BIRTHDAY=DATE_FORMAT('");
			condition.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(birthday)).append("','%Y-%m-%d %H:%i:%s') AND T1.CUST_NAME_QRY=:custName AND T4.ADDRESS_ID=").append(addressId);
			parameter.put("custName", custName.toUpperCase());
		}
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			custValue = new CustomerBean();
			custValue.copy(dcs[0]);

			// 判断该客户是否纯user和纯payer
			long partyId = custValue.getPartyId();
			ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			IBOCmPartyRoleValue[] roleValues = partyRoleSV.queryAllPartyRoles(partyId, -1, -1, -1);
			if (roleValues != null) {
				// 纯user
				if (roleValues.length == 1 && roleValues[0].getRoleType() == CmConstants.roleType.user) {
					custValue.setIndivCustTypeDesc(String.valueOf(CmConstants.roleType.user));
				} else if (roleValues.length == 2) {
					// ose创建纯payer时候会默认创建一个潜在客户，同时拥有了客户角色
					boolean hasPayer = false;
					boolean prospectCustomer = false;
					for (int i = 0; i < roleValues.length; i++) {
						if (roleValues[i].getRoleType() == CmConstants.roleType.payer) {
							hasPayer = true;
						} else if (roleValues[i].getRoleType() == CmConstants.roleType.customer && custValue.getCustStatus() == CmConstants.CustomerStatus.INDIV_POTENTIAL) {
							prospectCustomer = true;
						}
					}
					if (hasPayer && prospectCustomer) {
						custValue.setIndivCustTypeDesc(String.valueOf(CmConstants.roleType.payer));
					}
				}
			}

			if (custId <= 0) {
				custId = custValue.getCustId();
			}
			// 设置CPR信息
			custValue.setCprStatus(DataType.getAsString(dcs[0].get("REQUEST_STATUS")));
			custValue.setCprStatusDate(DataType.getAsDateTime(dcs[0].get("STATUS_DATE")));
			// 查询出custType塞进去
			custValue.initProperty("CUST_TYPE", commonSV.getCustType(custId));
			// 将客户信息塞入vocustValue
			voCustValue.setCustomer(custValue);

			// 设置客户的营销受保护,以人工设置到为准 ,
			if (custValue.getManualProtectEffectiveDate() == null && custValue.getManualProtectExpireDate() == null) {
				custValue.setManualCommercialProtection(custValue.getDirectMarketingProtection());
				custValue.setManualProtectEffectiveDate(custValue.getProtectEffDate());
				custValue.setManualProtectExpireDate(custValue.getProtectExpireDate());
			}
			// 设置客户监护人信息
			ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(IContactValue.S_CustId, custId);
			IContactValue[] contactValues = contactSV.queryCustContacts(conditionDC, -1, -1);
			if (contactValues != null && contactValues.length > 0) {
				custValue.setGuardianName(contactValues[0].getContName());
				custValue.setGuardianDate(contactValues[0].getContDoneDate());
				custValue.setGuardianContAddress(contactValues[0].getContAddress());			
				custValue.setGuardianContEmail(contactValues[0].getContEmail());
				custValue.setGuardianContMobile(contactValues[0].getContMobile());
			}
			
			// 客户偏好营业厅
			IBOCmCustPerferInfomationValue[] custPreferences = preferenceInfoSV.queryCustPreferInforDeal(custId, -1, -1);
			if (custPreferences != null && custPreferences.length > 0) {
				for (int i = 0; i < custPreferences.length; i++) {
					if (custPreferences[i].getPerferType() == CmConstants.PreferType.preferredOffice) {
						custValue.setPreferStore(custPreferences[i].getPreferChannelName());
						break;
					}
				}
			}
			
			
			// 客户多认证
			IBOIdentificationValue[] identificationValues = queryCustIdentifications(voCustValue.getCustomer().getPartyId(), -1, null);
			voCustValue.addCustIdentification(identificationValues);
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
			IQBOCmCustContMediumAndTypeValue[] custAddress = customerSV.queryCustContactMediums(custId, CmConstants.AddressId.legalAddress, CmConstants.ContMedium.ENTITY_ADDR, -1,
					-1);
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
					addr = addressSV.getAddress(addrId, CmConstants.AddressDistrictId.DISTRICT_ID);
					voCustAddressValue.addAddress(addr);
					contMedium = new BOCmCustContactMediumBean();
					contMedium.copy(custAddress[i]);
					voCustAddressValue.addContMedium(contMedium);
					custAddrList.add(voCustAddressValue);
					// 如果法律地址受保护，则设置客户为受保护
					if (custValue != null && custAddress[i].getContMedTypeId() == CmConstants.AddressId.legalAddress) {
						custValue.setIsProtected(custAddress[i].getIsProtected());
					}
				}
			}
			if (custAddrList != null && !custAddrList.isEmpty()) {
				voCustValue.addCustAddress((IVOCustAddressValue[]) custAddrList.toArray(new IVOCustAddressValue[0]));
			}
			return voCustValue;
		}
		return null;
	}
	
	/**
	 *  针对OSE，提供Birthday 为可选条件查询个人客户信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-16
	* CmDkCustomerSVImpl
	 */
	public IVOCustValue queryIndivCustomerDtlForOSE(long custId, String cprNo, String firstName, String lastName, Date birthday, address address) throws Exception {
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		ICmCustPreferenceInfoSV preferenceInfoSV = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		IVOCustValue voCustValue = new VOCustBean();
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" SELECT T1.*,T2.*,T3.PERFER_LANGUAGE,T4.*,T5.`SEGMENT_ID`,T6.`REQUEST_STATUS`,T6.`STATUS_DATE` FROM ");
		condition.append(" {CM_INDIV_CUSTOMER} T1 ");
		condition.append(" LEFT JOIN {CMX_INDIV_CUSTOMER} T2 ");
		condition.append(" ON T1.CUST_ID=T2.CUST_ID ");
		condition.append(" LEFT JOIN {CM_PARTY} T3 ");
		condition.append(" ON T1.PARTY_ID=T3.PARTY_ID ");
		condition.append(" LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T4 ");
		condition.append(" ON T1.CUST_ID = T4.CUST_ID ");
		condition.append(" AND T4.CONT_MED_TYPE_ID = 11 ");
		condition.append(" LEFT JOIN {CM_CUST_SEGMENT_RELA} T5 ");
		condition.append(" ON T1.CUST_ID=T5.CUST_ID ");
		condition.append(" LEFT JOIN {CM_CUST_REQUEST_TASK} T6");
		condition.append(" ON T3.CPR_id=T6.CUST_ID WHERE 1=1");
		ICustomerValue custValue = null;
		// 根据客户编号和cpr查询客户信息
		if (custId > 0 || StringUtils.isNotBlank(cprNo)) {
			// 针对客户编号不为空
			if (custId > 0) {
				condition.append(" AND T1.CUST_ID=:custId ");
				parameter.put("custId", custId);
			}
			// 针对cpr不为空
			if (StringUtils.isNotBlank(cprNo)) {
				condition.append(" AND T1.CUST_CERT_CODE=:cpr ");
				parameter.put("cpr", cprNo);
			}
		} else {
			// 针对客户名称地址生日查询
			if (StringUtils.isBlank(firstName) || StringUtils.isBlank(lastName) || address == null) {
				// 请输入完整的名称，生日和地址！
				ExceptionUtil.throwBusinessException("CMS0000164");
			}
			long addressId = addressSV.saveAddress(address);
			String custName = firstName + " " + lastName;
			
			if(null!=birthday){
				condition.append(" AND T1.BIRTHDAY=DATE_FORMAT('");
				condition.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(birthday)).append("','%Y-%m-%d %H:%i:%s') ");
			}
			condition.append(" AND T1.CUST_NAME_QRY = :custName ");
			parameter.put("custName", custName.toUpperCase());
			condition.append(" AND T4.ADDRESS_ID=").append(addressId);
		}
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);

		// AI-15843 新加逻辑
		if (CmCommonUtil.isEmptyObject(dcs) && custId <= 0 && StringUtils.isBlank(cprNo)) {
			// 根据名称生日地址查客户场景如果没查到，再根据名称生日地址详情查一次
			StringBuilder newCondition = new StringBuilder();
			newCondition.append(" SELECT T1.*,T2.*,T3.PERFER_LANGUAGE,T4.*,T5.`SEGMENT_ID`,T6.`REQUEST_STATUS`,T6.`STATUS_DATE` FROM ");
			newCondition.append(" {CM_INDIV_CUSTOMER} T1 ");
			newCondition.append(" LEFT JOIN {CMX_INDIV_CUSTOMER} T2 ");
			newCondition.append(" ON T1.CUST_ID=T2.CUST_ID ");
			newCondition.append(" LEFT JOIN {CM_PARTY} T3 ");
			newCondition.append(" ON T1.PARTY_ID=T3.PARTY_ID ");
			newCondition.append(" LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T4 ");
			newCondition.append(" ON T1.CUST_ID = T4.CUST_ID ");
			newCondition.append(" AND T4.CONT_MED_TYPE_ID = 11 ");
			newCondition.append(" LEFT JOIN {CM_CUST_SEGMENT_RELA} T5 ");
			newCondition.append(" ON T1.CUST_ID=T5.CUST_ID ");
			newCondition.append(" LEFT JOIN {CM_CUST_REQUEST_TASK} T6");
			newCondition.append(" ON T3.CPR_id=T6.CUST_ID WHERE 1=1");

			Map map = new HashMap();
			String custName = firstName + " " + lastName;
			String addressDetail = CmCommonUtil.getStandAddressDesc(address);

			if (null != birthday) {
				newCondition.append(" AND T1.BIRTHDAY=DATE_FORMAT('");
				newCondition.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(birthday)).append("','%Y-%m-%d %H:%i:%s') ");
			}
			newCondition.append(" AND T1.CUST_NAME_QRY = :custName ");
			map.put("custName", custName.toUpperCase());
			newCondition.append(" AND T4.ADDRESS_DETAIL = :addressDetail ");
			map.put("addressDetail", addressDetail);
			String newSql = SplitTableFactory.createQuerySQL(newCondition.toString(), map);
			dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, newSql, map);
		}

		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			custValue = new CustomerBean();
			custValue.copy(dcs[0]);
			
			// 判断该客户是否纯user和纯payer
			long partyId = custValue.getPartyId();
			ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			IBOCmPartyRoleValue[] roleValues = partyRoleSV.queryAllPartyRoles(partyId, -1, -1, -1);
			if (roleValues != null) {
				// 纯user
				if (roleValues.length == 1 && roleValues[0].getRoleType() == CmConstants.roleType.user) {
					custValue.setIndivCustTypeDesc(String.valueOf(CmConstants.roleType.user));
				} else if (roleValues.length == 2) {
					// ose创建纯payer时候会默认创建一个潜在客户，同时拥有了客户角色
					boolean hasPayer = false;
					boolean prospectCustomer = false;
					for (int i = 0; i < roleValues.length; i++) {
						if (roleValues[i].getRoleType() == CmConstants.roleType.payer) {
							hasPayer = true;
						} else if (roleValues[i].getRoleType() == CmConstants.roleType.customer && custValue.getCustStatus() == CmConstants.CustomerStatus.INDIV_POTENTIAL) {
							prospectCustomer = true;
						}
					}
					if (hasPayer && prospectCustomer) {
						custValue.setIndivCustTypeDesc(String.valueOf(CmConstants.roleType.payer));
					}
				}
			}
			
			if (custId <= 0) {
				custId = custValue.getCustId();
			}
			// 设置CPR信息
			custValue.setCprStatus(DataType.getAsString(dcs[0].get("REQUEST_STATUS")));
			custValue.setCprStatusDate(DataType.getAsDateTime(dcs[0].get("STATUS_DATE")));
			// 查询出custType塞进去
			custValue.initProperty("CUST_TYPE", commonSV.getCustType(custId));
			// 将客户信息塞入vocustValue
			voCustValue.setCustomer(custValue);

			// 设置客户的营销受保护,以人工设置到为准 ,
			if (custValue.getManualProtectEffectiveDate() == null && custValue.getManualProtectExpireDate() == null) {
				custValue.setManualCommercialProtection(custValue.getDirectMarketingProtection());
				custValue.setManualProtectEffectiveDate(custValue.getProtectEffDate());
				custValue.setManualProtectExpireDate(custValue.getProtectExpireDate());
			}
			// 设置客户监护人信息
			ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(IContactValue.S_CustId, custId);
			IContactValue[] contactValues = contactSV.queryCustContacts(conditionDC, -1, -1);
			if (contactValues != null && contactValues.length > 0) {
				custValue.setGuardianName(contactValues[0].getContName());
				custValue.setGuardianDate(contactValues[0].getContDoneDate());
				custValue.setGuardianContAddress(contactValues[0].getContAddress());			
				custValue.setGuardianContEmail(contactValues[0].getContEmail());
				custValue.setGuardianContMobile(contactValues[0].getContMobile());
			}
			
			// 客户偏好营业厅
			IBOCmCustPerferInfomationValue[] custPreferences = preferenceInfoSV.queryCustPreferInforDeal(custId, -1, -1);
			if (custPreferences != null && custPreferences.length > 0) {
				for (int i = 0; i < custPreferences.length; i++) {
					if (custPreferences[i].getPerferType() == CmConstants.PreferType.preferredOffice) {
						custValue.setPreferStore(custPreferences[i].getPreferChannelName());
						break;
					}
				}
			}
			
			// 客户多认证
			IBOIdentificationValue[] identificationValues = queryCustIdentifications(voCustValue.getCustomer().getPartyId(), -1, null);
			voCustValue.addCustIdentification(identificationValues);
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
			IQBOCmCustContMediumAndTypeValue[] custAddress = customerSV.queryCustContactMediums(custId, CmConstants.AddressId.legalAddress, CmConstants.ContMedium.ENTITY_ADDR, -1,
					-1);
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
					addr = addressSV.getAddress(addrId, CmConstants.AddressDistrictId.DISTRICT_ID);
					voCustAddressValue.addAddress(addr);
					contMedium = new BOCmCustContactMediumBean();
					contMedium.copy(custAddress[i]);
					voCustAddressValue.addContMedium(contMedium);
					custAddrList.add(voCustAddressValue);
					// 如果法律地址受保护，则设置客户为受保护
					if (custValue != null && custAddress[i].getContMedTypeId() == CmConstants.AddressId.legalAddress) {
						custValue.setIsProtected(custAddress[i].getIsProtected());
					}
				}
			}
			if (custAddrList != null && !custAddrList.isEmpty()) {
				voCustValue.addCustAddress((IVOCustAddressValue[]) custAddrList.toArray(new IVOCustAddressValue[0]));
			}
			return voCustValue;
		}
		return null;
	}
	
	/**
	 * 根据partyId 查询party 对应的相关信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-12
	* ICmDkCustomerSV
	 */
	public IVOPartyValue queryPartyInfo(String partyId) throws Exception{
		
		Map parameter = new HashMap();
		StringBuilder condition = new StringBuilder();
		condition.append(" select  a.* ,b.CONT_ID,b.CONT_ADDRESS");
		condition.append(" FROM {CM_PARTY} a ");
		condition.append(" LEFT JOIN {CM_PARTY_CONTACT} b ");
		condition.append(" ON a.PARTY_ID=b.PARTY_ID ");
		// 根据partyId查询信息
		if (null!=partyId&&partyId.length()>0) {
			condition.append(" where a.PARTY_ID=:partyId ");
			parameter.put("partyId", partyId);
		}
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		
		List<IVOPartyValue> partyList = buildVOPartyInfo(dcs);
		if(!partyList.isEmpty()) {
			return partyList.get(0);
		}
		return null;
	}
	public List<IVOPartyValue> queryPartyByPartyName(String partName,int startIndex,int pageSize) throws Exception{
		
		Map parameter = new HashMap();
		StringBuilder condition = new StringBuilder();
		
		condition.append(" select  a.* ,b.CONT_ID,b.CONT_ADDRESS");
		condition.append(" FROM {CM_PARTY} a ");
		condition.append(" LEFT JOIN {CM_PARTY_CONTACT} b ");
		condition.append(" ON a.PARTY_ID=b.PARTY_ID ");
		// 根据partyId查询信息
		if (StringUtils.isNotBlank(partName)) {
			condition.append(" where CONCAT(a.first_name,' ',a.last_name) =:partName ");
			parameter.put("partName", partName);
		}
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		//add addressInfo and contactInfo to VOParty
		List<IVOPartyValue> partyList = buildVOPartyInfo(dcs);
		return partyList;
	}

	private List<IVOPartyValue> buildVOPartyInfo(DataContainer[] dcs) throws AIException, Exception {
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IPartyContactValue partyContactValue = null;
		List<IVOPartyValue> partyList = new ArrayList<IVOPartyValue>();
		for (int j =0;dcs!=null && CmCommonUtil.isNotEmptyObject(dcs)&& j<dcs.length;j++) {
			IVOPartyValue voPartyValue =  new VOPartyBean();
			IPartyValue partyValue = new PartyBean();
			partyContactValue = new PartyContactBean();
			partyValue.copy(dcs[j]);
			partyContactValue.copy(dcs[j]);
			// 将基本信息如party
			voPartyValue.setParty(partyValue);
			voPartyValue.setPartyContact(partyContactValue);
			
			
			//塞联系媒介信息
			IBOCmContactContMediumValue[] cmContactContMediumValues =  customerSV.queryContactContMediumValueByContId(Long.valueOf((String.valueOf(dcs[j].get("CONT_ID")))));
			if(null!=cmContactContMediumValues&&cmContactContMediumValues.length>0){
				for (int i = 0; i < cmContactContMediumValues.length; i++) {
					voPartyValue.setCmContactContMedium(cmContactContMediumValues[i]);
				}
			}
			
			// 塞address
			String cont_address  = partyValue.getContAddress();
			address addr = null;
			if(null!=cont_address&&cont_address.length()>0&&!"null".equalsIgnoreCase(cont_address)){
				addr = addressSV.getAddress(Long.valueOf(cont_address), CmConstants.AddressDistrictId.DISTRICT_ID);
				voPartyValue.setAddress(addr);
			}
			partyList.add(voPartyValue);
		}
		return partyList;
	}
	

	public IBOIdentificationValue[] queryCustIdentifications(long partyId, int idenType, String idenCode) throws Exception {
		HashMap parameter = new HashMap();
		StringBuffer condition = new StringBuffer(" 1=1 ");
		if (partyId > 0) {
			condition.append(" AND ").append(IBOIdentificationValue.S_PartyId).append(" =:partyId ");
			parameter.put("partyId", partyId);
		}
		if (idenType > 0) {
			condition.append(" AND ").append(IBOIdentificationValue.S_IdenType).append(" =:idenType ");
			parameter.put("idenType", idenType);
		}
		if (StringUtils.isNotBlank(idenCode)) {
			condition.append(" AND ").append(IBOIdentificationValue.S_IdenNr).append(" =:idenCode ");
			parameter.put("idenCode", idenCode);
		}
		IBOIdentificationValue[] values = (IBOIdentificationValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOIdentificationBean.class, condition.toString(), parameter,
				-1, -1);
		if (values != null && values.length > 0) {
			return values;
		}
		return new IBOIdentificationValue[0];
	}

	public void saveCustIdentification(IBOIdentificationValue[] custIdentificationValues) throws Exception {
		if (custIdentificationValues != null && custIdentificationValues.length > 0) {
			BOIdentificationBean bean = null;
			List identificationList = new ArrayList();
			for (int i = 0; i < custIdentificationValues.length; i++) {
				// 验重判断
				bean = new BOIdentificationBean();
				//mmodify 2018-4-25,TELENOR_DEFECT_20180425_0007
				IBOIdentificationValue[] idenValue = queryCustIdentifications(custIdentificationValues[i].getPartyId(),
						DataType.getAsInt(custIdentificationValues[i].getIdenType()), custIdentificationValues[i].getIdenNr());
				if (CmCommonUtil.isNotEmptyObject(idenValue) && !custIdentificationValues[i].isDeleted()) {
					// 修改
					bean.copy(idenValue[0]);
					bean.setIdenNr(custIdentificationValues[i].getIdenNr());
					bean.setIdenSubType(custIdentificationValues[i].getIdenSubType());
					bean.setIdenType(custIdentificationValues[i].getIdenType());
					bean.setExpireDate(custIdentificationValues[i].getExpireDate());
				} else {
					// 新增
					bean.copy(custIdentificationValues[i]);
				}
				identificationList.add(bean);
			}
			if (!identificationList.isEmpty()) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOIdentificationBean[]) identificationList.toArray(new BOIdentificationBean[0]));
			}
		}

	}
	
	public ICustOrganizeValue[] listDepartment(long custId,String name) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		if(StringUtils.isNotEmpty(name)) {//option
			dContainer.set(ICustOrganizeValue.S_DeptName, name);
			//精确匹配，不穿默认左端匹配。
			dContainer.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.EXACT_MATCH);
		}
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);

		List<ICustOrganizeValue> departmentList = new ArrayList<ICustOrganizeValue>();
		if(values != null && values.length > 0) {
			//AI-18831 check parent dept id
			for (ICustOrganizeValue custOrganizeValue : values) {
				if(custOrganizeValue != null && custOrganizeValue.getParentDeptId() > 0){
					long parentDeptId = custOrganizeValue.getParentDeptId();
					DataContainer dContainer1 = new DataContainer();
					dContainer1.set(ICustOrganizeValue.S_CustId, custId);
					dContainer1.set(ICustOrganizeValue.S_DeptId, parentDeptId);
					dContainer1.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);
					ICustOrganizeValue[] parentDeptValue = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer1 }, -1, -1);
					if(parentDeptValue != null && parentDeptValue.length > 0){
						departmentList.add(custOrganizeValue);
					}
				}else{
					departmentList.add(custOrganizeValue);
				}
			}
		}

		return departmentList.toArray(new ICustOrganizeValue[0]);
	}
	
	public ICustOrganizeValue queryDepartmentById(long deptId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_DeptId, deptId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		if(values != null && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public ICustOrganizeValue queryCustRootOrganize(long custId) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		if (values != null && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				if (values[i].getParentDeptId() <= 0) {
					return values[i];
				}
			}
		}
		return null;
	}

	public ICustOrganizeValue[] queryCustOrganizesByParentId(long parentDeptId, int deptType, int startNum, int endNum) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_ParentDeptId, parentDeptId);
		dContainer.set(ICustOrganizeValue.S_DeptType, deptType);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
		return values;
	}
	
	public IGroupMemberValue[] queryGroupDeptBills(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		AbstractCustMemberQueryBusiModelImpl busi = (AbstractCustMemberQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustMemberQueryBusiModelImpl.class);
		IGroupMemberValue[] values = (IGroupMemberValue[]) busi.queryData(criteria, startNum, endNum);
		long userId = 0;
		if (values != null && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				userId = values[i].getUserId();
				CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
				IInsUserValue insUservalue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
				if (insUservalue != null) {
					values[i].setBillId(insUservalue.getBillId());
				}
			}
			return values;
		}
		return new IGroupMemberValue[0];
	}

	public int queryGroupDeptBillsCount(String criteria) throws Exception {
		AbstractCustMemberQueryBusiModelImpl busi = (AbstractCustMemberQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustMemberQueryBusiModelImpl.class);
		int count = busi.queryCount(criteria);
		return count;
	}

	public IVOCustValue queryCustomerByIdenInfo(int idenType, String idenCode) throws Exception {
		IBOIdentificationValue[] identificationValues = queryCustIdentifications(-1, idenType, idenCode);
		long partyId = -1;
		if (identificationValues != null && identificationValues.length > 0) {
			partyId = identificationValues[0].getPartyId();
		}
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_PartyId, partyId);
		// conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
		ICustomerValue[] customerValues = CmServiceFactory.getCustomerSV().queryCustomers(conditionDC, -1, -1);
		if (customerValues != null && customerValues.length > 0) {
			IVOCustValue custValue = queryIndivCustomerDtl(customerValues[0].getCustId(), null, null, null, null, null);
			// 设置客户偏好网站语言
			CmPartySVImpl cps = new CmPartySVImpl();
			IPartyValue value = cps.queryPartyById(partyId);
			custValue.getCustomer().setPerferLanguage(value.getPerferLanguage());
			return custValue;
		}
		return null;
	}

	public IBOCmInsCmrelValue[] queryGroupDeptUser(long custId, String billId, int startNum, int endNum) throws Exception {
		// 查询集团客户名下所有有效的号码
		ICmDkCustomerSV sv = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		IBOCmInsCmrelValue[] insCmrelValues = sv.queryGroupDeptUserForFY(custId, startNum, endNum);
		if (insCmrelValues != null && insCmrelValues.length > 0) {
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			long userId = -1;
			DataContainer dc = new DataContainer();
			dc.set(IBOCmInsCmrelValue.S_CustId, custId);
			for (int i = 0; i < insCmrelValues.length; i++) {
				// 查询该号码是否已经分配给某个部门
				userId = insCmrelValues[i].getUserId();
				dc.set(IBOCmInsCmrelValue.S_UserId, userId);
				IGroupMemberValue[] groupMemberValues = customerSV.queryGroupMembers(dc, -1, -1);
				if (groupMemberValues != null && groupMemberValues.length > 0) {
					insCmrelValues[i].setIsAssigned(CmConstants.IsAssigned.ASSIGNED);
				} else {
					insCmrelValues[i].setIsAssigned(CmConstants.IsAssigned.NOT_ASSIGNED);
				}

				// 调用接口查询用户信息
				CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
				IInsUserValue value = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
				if (CmCommonUtil.isNotEmptyObject(value)) {
					insCmrelValues[i].setBillId(value.getBillId());
				} else {
					insCmrelValues[i].setBillId("");
				}
				if (StringUtils.isNotBlank(billId)) {
					if (billId.equalsIgnoreCase(insCmrelValues[i].getBillId())) {
						IBOCmInsCmrelValue[] valueByBillId = new BOCmInsCmrelBean[1];
						valueByBillId[0] = insCmrelValues[i];
						return valueByBillId;
					}
				}

			}
			if (StringUtils.isNotBlank(billId)) {
				return new IBOCmInsCmrelValue[0];
			}
			return insCmrelValues;
		}
		return new IBOCmInsCmrelValue[0];
	}

	public int queryGroupDeptUserCount(long custId, String billId) throws Exception {
		if (StringUtils.isNotBlank(billId)) {
			// 查询集团客户名下所有有效的号码
			ICmDkCustomerSV sv = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			IBOCmInsCmrelValue[] insCmrelValues = sv.queryGroupDeptUserForFY(custId, -1, -1);
			if (insCmrelValues != null && insCmrelValues.length > 0) {
				ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
				long userId = -1;
				DataContainer dc = new DataContainer();
				dc.set(IBOCmInsCmrelValue.S_CustId, custId);
				for (int i = 0; i < insCmrelValues.length; i++) {
					userId = insCmrelValues[i].getUserId();
					// 调用接口查询用户信息
					CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
					IInsUserValue value = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
					if (CmCommonUtil.isNotEmptyObject(value) && billId.equalsIgnoreCase(value.getBillId())) {
						return 1;
					}
				}
			}
			return 0;
		}
		ICmDkCustomerSV sv = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return sv.queryGroupDeptUserForFYCount(custId);
	}

	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, long userId, int relType, int start, int end) throws Exception {
		// 查询出custId对应的号码归属者
		StringBuffer condition = new StringBuffer(" 1=1 ");
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
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relaType ");
			parameter.put("relaType", relType);
		}
		IBOCmInsCmrelValue[] values = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, start, end);
		if (values != null && values.length > 0) {
			return values;
		}
		return null;
	}

	public int queryCmInsCmrelCount(long custId, long userId, int relType) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
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
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relaType ");
			parameter.put("relaType", relType);
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmInsCmrelBean.class, condition.toString(), parameter);
	}

	public IVOCustValue queryIndivCustByNumber(String serviceNumber, int relaType) throws Exception {
		ICmTeamInvokeSV service = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		ISoUserValue value = service.getSoUserByBillId(serviceNumber);
		if (value != null) {
			IBOCmInsCmrelValue[] insCmrelValues = queryCmInsCmrel(-1, value.getUserId(), relaType, -1, -1);
			if (insCmrelValues != null && insCmrelValues.length > 0) {
				return queryIndivCustomerDtl(insCmrelValues[0].getCustId(), null, null, null, null, null);
			}
		}
		return null;
	}

	public IBOCmCustRequestTaskValue[] queryCustRequestTasks(long custId, int requestType) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		Map parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		if (requestType > 0) {
			condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_RequestType).append(" =:requestType ");
			parameter.put("requestType", requestType);
		}
		IBOCmCustRequestTaskValue[] values = (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class, condition.toString(),
				parameter, -1, -1);
		if (values != null && values.length > 0) {
			return values;
		}
		return new IBOCmCustRequestTaskValue[0];
	}

	public long sendAOContactToSec(DataContainerInterface partyDC, long custContId) throws Exception {
		IBOSecStaffValue staffValue = new BOSecStaffBean();
		IBOSecOperatorValue operatorValue = new BOSecOperatorBean();
		staffValue.setStaffName(partyDC.getAsString(BOCmPartyBean.S_FirstName) + " " + partyDC.getAsString(BOCmPartyBean.S_LastName));

		if (custContId > 0) {
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			IBOCmContactContMediumValue[] contactContMediumValues = customerSV.queryContactContMediumForPage(custContId, -1, -1);
			if (contactContMediumValues != null && contactContMediumValues.length > 0) {
				String mainPhone = "";
				String secondPhone = "";
				for (int i = 0; i < contactContMediumValues.length; i++) {
					if (contactContMediumValues[i].getContMedTypeId() == CmConstants.AddressId.MAIN_PHONE) {
						mainPhone = contactContMediumValues[i].getContNumber();
					} else if (contactContMediumValues[i].getContMedTypeId() == CmConstants.AddressId.SECOND_PHONE) {
						secondPhone = contactContMediumValues[i].getContNumber();
					}
				}
				staffValue.setBillId(StringUtils.isNotBlank(mainPhone) ? mainPhone : secondPhone);
			}
		}
		staffValue.setCardTypeId(1);
		staffValue.setCarNo(partyDC.getAsString(BOCmPartyBean.S_CertCode));
		// 与权限约定，随便传到一些默认值
		operatorValue.setCode(TenantIDFactory.getTenant() + custContId + "A");
		operatorValue.setPassword("123456");
		operatorValue.setExpireDate(TimeUtil.getMaxExpire());
		// 联系人归属客户的deptId
		staffValue.setOrganizeId(partyDC.getAsLong("REMARKS"));
		staffValue.setExpireDate(TimeUtil.getMaxExpire());
		operatorValue.setAcctExpireDate(TimeUtil.getMaxExpire());
		long operId = OrgmodelClient.saveOperatorAndStaff(operatorValue, staffValue, custContId + "A", custContId + "A");
		return operId;

	}

	public IContactValue[] queryCustomerContacts(long custId, int contType) throws Exception {
		int custType = CmCommonUtil.getCustType(custId);
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人客户获取个人客户联系媒介到电话号码
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IQBOCmCustContMediumAndTypeValue[] custContMediums = customerSV.queryCustElectronicMediumForPage(custId, -1, -1);
			if (custContMediums != null && custContMediums.length > 0) {
				IContactValue contactValue = new ContactBean();
				for (int i = 0; i < custContMediums.length; i++) {
					if (custContMediums[i].getContMedTypeId() == CmConstants.AddressId.CONTACT_NUMBER) {
						// 联系电话
						contactValue.setBillId(custContMediums[i].getContNumber());
					} else if (custContMediums[i].getContMedTypeId() == CmConstants.AddressId.EMAIL) {
						// EMAIL
						contactValue.setContEmail(custContMediums[i].getEmailAddress());
					} else if (custContMediums[i].getContMedTypeId() == CmConstants.AddressId.FAX) {
						// FAX
						contactValue.setContFax(custContMediums[i].getFaxNumber());
					} else if (custContMediums[i].getContMedTypeId() == CmConstants.AddressId.SMS) {
						// SMS
						contactValue.setSmsNumber(custContMediums[i].getContNumber());
					} else if (custContMediums[i].getContMedTypeId() == CmConstants.AddressId.EMERGENCY_NUMBER) {
						// EMERGENCY_NUMBER
						contactValue.setEmergencyNumber(custContMediums[i].getContNumber());
					} else if (custContMediums[i].getContMedTypeId() == CmConstants.AddressId.LETTER) {
						// LETTER
						contactValue.setContAddress(custContMediums[i].getAddressDetail());
					} else if (custContMediums[i].getContMedTypeId() == CmConstants.AddressId.MMS) {
						// MMS
						contactValue.setMmsNumber(custContMediums[i].getContNumber());
					}
				}
				return new IContactValue[] { contactValue };
			}
		} else {
			// 集团客户查询集团客户联系人列表
			return queryGroupCustomerContacts(custId, contType);

		}
		return new IContactValue[0];
	}

	public IContactValue[] queryGroupCustomerContacts(long custId, int contType) throws Exception {
		Map parameter = new HashMap();
		StringBuffer condition = new StringBuffer(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IContactValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		if (contType > 0) {
			condition.append(" AND ").append(IContactValue.S_ContType).append(" =:contType ");
			parameter.put("contType", contType);
		}
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmGroupPartyBean.class, condition.toString(), parameter, -1, -1);
		IQBOCmGroupPartyValue[] groupContacts = (IQBOCmGroupPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmGroupPartyBean.class, sql, parameter);
		if (groupContacts != null && groupContacts.length > 0) {
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			IContactValue contactValue = null;
			List contactList = new ArrayList();
			for (int i = 0; i < groupContacts.length; i++) {
				// 根据集团联系人关系表主键，查询该联系人针对该集团所绑定的联系媒介
				IBOCmContactContMediumValue[] contMediums = customerSV.queryContactContMedium(groupContacts[i].getCustContId(), -1, -1);
				if (contMediums != null && contMediums.length > 0) {
					contactValue = new ContactBean();
					contactValue.copy(groupContacts[i]);
					// 封装联系媒介信息到contactValue对象中
					for (int j = 0; j < contMediums.length; j++) {
						if (contMediums[j].getContMedTypeId() == CmConstants.ContMedium.MAIN_EMAIL) {
							contactValue.setMainEmail(contMediums[j].getEmailAddress());
						} else if (contMediums[j].getContMedTypeId() == CmConstants.ContMedium.SECOND_EMAIL) {
							contactValue.setSecondEmail(contMediums[j].getEmailAddress());
						} else if (contMediums[j].getContMedTypeId() == CmConstants.ContMedium.MAIN_CONT_NUMBER) {
							contactValue.setMainContNumber(contMediums[j].getContNumber());
						} else if (contMediums[j].getContMedTypeId() == CmConstants.ContMedium.SECOND_CONT_NUMBER) {
							contactValue.setSecondContNumber(contMediums[j].getContNumber());
						} else if (contMediums[j].getContMedTypeId() == CmConstants.ContMedium.SMS) {
							contactValue.setSmsNumber(contMediums[j].getContNumber());
						}
					}
					contactList.add(contactValue);
				}
			}
			if (!contactList.isEmpty()) {
				return (IContactValue[]) contactList.toArray(new IContactValue[0]);
			}
		}
		return null;
	}

	public DataContainerInterface[] queryIndivCustomers(long custIds[], String state, int custStatus, long legalAddressId, String firstName, String laseName,
			String contactPhoneNumber, long segment, long categroy, String custServiceId, int start, int end) throws Exception {
		StringBuffer sql = new StringBuffer();
		StringBuffer condition = new StringBuffer();
		HashMap queryParam = new HashMap();
		// 默认sql按照地址ID来查询
		// comsumert 436&436
		sql.append("SELECT T1.REGION_ID, T1.CUST_ID, T1.FIRST_NAME, T1.LAST_NAME, T1.CUST_CERT_TYPE, T1.CUST_CERT_CODE, T2.PERSON_STATUS, T2.STATUS_EFF_DATE, T1.CREATE_DATE, T1.CUST_STATUS, T1.GENDER, T1.BIRTHDAY, T1.PHYSIOLOGICAL_STATE, T4.SEGMENT_ID, T6.CONT_NAME, T6.EFFECTIVE_DATE, T6.DONE_DATE, T2.CUR_RESIDENCE_STR_DATE, T2.DIRECT_MARKETING_PROTECTION, T2.PROTECT_EFF_DATE, T2.PROTECT_EXPIRE_DATE, T2.MANUAL_COMMERCIAL_PROTECTION, T2.MANUAL_PROTECT_EFFECTIVE_DATE, T2.MANUAL_PROTECT_EXPIRE_DATE,T2.PNR, T3.ADDRESS_DETAIL, CASE WHEN T3.PROTECT_EFF_DATE <= NOW() THEN 1 ELSE 0 END AS PROTECT_STAUS FROM {CM_INDIV_CUSTOMER} T1 LEFT JOIN {CM_INDIV_CONTACT} T5 ON T1.CUST_ID = T5.CUST_ID LEFT JOIN {CM_PARTY_CONTACT} T6 ON T5.CONT_ID = T6.CONT_ID  AND T6.EXPIRE_DATE > NOW() LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T3 ON T1.CUST_ID = T3.CUST_ID AND T3.CONT_MED_TYPE_ID = 11, {CMX_INDIV_CUSTOMER} T2, {CM_CUST_SEGMENT_RELA} T4 WHERE T1.CUST_ID = T2.CUST_ID AND T1.CUST_ID = T4.CUST_ID AND T1.INDIV_CUST_TYPE = 1 ");
		if (StringUtils.isNotBlank(contactPhoneNumber)) {
			IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = CmServiceFactory.getCustomerSV().queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.PHONE,
					CmDkConstants.CustContMedium.CONTACT_NUMBER, contactPhoneNumber);
			// 如果传入客户ID和联系电话，则以客户ID为主，不根据联系电话查询
			if (custIds == null || custIds.length < 1) {
				if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
					custIds = new long[mediumAndTypeValues.length];
					for (int i = 0; i < mediumAndTypeValues.length; i++) {
						custIds[i] = mediumAndTypeValues[i].getCustId();
					}
				}
			}
		}
		if (StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(laseName)) {
			String tempName = "";
			if (StringUtils.isNotBlank(firstName) && StringUtils.isNotBlank(laseName)) {
				tempName = firstName + " " + laseName;
			} else {
				tempName = StringUtils.isNotBlank(firstName) ? firstName : laseName;
			}
			condition.append(" AND T1.CUST_NAME like ").append(":tempName");
			queryParam.put("tempName", tempName + "%");
		}
		if (segment > 0) {
			condition.append(" AND T4.SEGMENT_ID = ").append(":segment");
			queryParam.put("segment", segment);
		}
		if (categroy > 0) {
			condition.append(" AND T1.CUST_SERVICE_LEVEL = ").append(":categroy");
			queryParam.put("categroy", categroy);
		}
		if (custIds != null && custIds.length > 0) {
			condition.append(" AND T1.CUST_ID IN(");
			for (int i = 0; i < custIds.length; i++) {
				if (i > 0) {
					condition.append(",");
				}
				condition.append(custIds[i]);

			}
			condition.append(")");
		}
		if (StringUtils.isNotBlank(state)) {
			condition.append(" AND T1.STATE = ").append(":state");
			queryParam.put("state", state);
		}
		if (StringUtils.isNotBlank(custServiceId)) {
			condition.append(" AND T1.CUST_SERVICE_ID = ").append(":custServiceId");
			queryParam.put("custServiceId", custServiceId);
		}
		if (custStatus >= 0) {
			condition.append(" AND T1.CUST_STATUS = ").append(":custStatus");
			queryParam.put("custStatus", custStatus);
		}
		if (legalAddressId > 0) {
			condition.append(" AND T3.ADDRESS_ID = ").append(":legalAddressId");
			queryParam.put("legalAddressId", legalAddressId);
		}
		
		sql.append(condition.toString());
		if (start > 0 && end > 0) {
			sql.append(" LIMIT ").append(start - 1).append(",").append(end - start + 1);
		}

		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.CUST_QRY, sql.toString(), queryParam, CmConstants.BusiLogType.CUSTOMER_LOG);
		long segmentId = 0;
		for (int i = 0; i < values.length; i++) {
			segmentId = values[i].getAsLong("SEGMENT_ID");
			ICmCustSegmentSV segmentSV = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
			IBoCmCustSegmentValue custSegmentValue = segmentSV.querySegmentByIdfromCache(segmentId);
			if (custSegmentValue != null) {
				values[i].set("SEGMENT_NAME", custSegmentValue.getSegmentName());
			}

			// 客户是active才展示cprId
			int temp = values[i].getAsInt("CUST_STATUS");
			if (temp != CmConstants.CustomerStatus.INDIV_ACTIVE) {
				values[i].set("PNR", "");
			}
			// 客户的first_name如果是$$$$,则去除客户名称
			if (null != values[i].getAsString("FIRST_NAME") && "$$$$".equals(values[i].getAsString("FIRST_NAME").trim())) {
				values[i].set("FIRST_NAME", "");
				values[i].set("LAST_NAME", "");
			}
		}
		if (values == null) {
			return new DataContainerInterface[0];
		}
		return values;
	}

	public int queryIndivCustomersCount(long custIds[], String state, int custStatus, long legalAddressId, String firstName, String laseName, String contactPhoneNumber,
			long segment, long categroy, String custServiceId) throws Exception {
		StringBuffer sql = new StringBuffer();
		StringBuffer condition = new StringBuffer();
		HashMap queryParam = new HashMap();
		// 默认sql按照地址ID来查询
		sql.append("SELECT COUNT(*) AS DATA_COUNT FROM {CM_INDIV_CUSTOMER} T1 LEFT JOIN {CM_INDIV_CONTACT} T5 ON T1.CUST_ID = T5.CUST_ID LEFT JOIN {CM_PARTY_CONTACT} T6 ON T5.CONT_ID = T6.CONT_ID LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T3 ON T1.CUST_ID = T3.CUST_ID AND T3.CONT_MED_TYPE_ID = 11, {CMX_INDIV_CUSTOMER} T2, {CM_CUST_SEGMENT_RELA} T4 WHERE T1.CUST_ID = T2.CUST_ID AND T1.CUST_ID = T4.CUST_ID AND T1.INDIV_CUST_TYPE = 1 ");
		if (StringUtils.isNotBlank(contactPhoneNumber)) {
			IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = CmServiceFactory.getCustomerSV().queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.PHONE,
					CmDkConstants.CustContMedium.CONTACT_NUMBER, contactPhoneNumber);
			// 如果传入客户ID和联系电话，则以客户ID为主，不根据联系电话查询
			if (custIds == null || custIds.length < 1) {
				if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
					custIds = new long[mediumAndTypeValues.length];
					for (int i = 0; i < mediumAndTypeValues.length; i++) {
						custIds[i] = mediumAndTypeValues[i].getCustId();
					}
				}
			}
		}
		if (StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(laseName)) {
			String tempName = "";
			if (StringUtils.isNotBlank(firstName) && StringUtils.isNotBlank(laseName)) {
				tempName = firstName + " " + laseName;
			} else {
				tempName = StringUtils.isNotBlank(firstName) ? firstName : laseName;
			}
			condition.append(" AND T1.CUST_NAME like ").append(":tempName");
			queryParam.put("tempName", tempName + "%");
		}
		if (segment > 0) {
			condition.append(" AND T4.SEGMENT_ID = ").append(":segment");
			queryParam.put("segment", segment);
		}
		if (categroy > 0) {
			condition.append(" AND T1.CUST_SERVICE_LEVEL = ").append(":categroy");
			queryParam.put("categroy", categroy);
		}
		if (custIds != null && custIds.length > 0) {
			condition.append(" AND T1.CUST_ID IN(");
			for (int i = 0; i < custIds.length; i++) {
				if (i > 0) {
					condition.append(",");
				}
				condition.append(custIds[i]);

			}
			condition.append(")");
		}
		if (StringUtils.isNotBlank(state)) {
			condition.append(" AND T1.STATE = ").append(":state");
			queryParam.put("state", state);
		}
		if (StringUtils.isNotBlank(custServiceId)) {
			condition.append(" AND T1.CUST_SERVICE_ID = ").append(":custServiceId");
			queryParam.put("custServiceId", custServiceId);
		}
		if (custStatus >= 0) {
			condition.append(" AND T1.CUST_STATUS = ").append(":custStatus");
			queryParam.put("custStatus", custStatus);
		}
		if (legalAddressId > 0) {
			condition.append(" AND T3.ADDRESS_ID = ").append(":legalAddressId");
			queryParam.put("legalAddressId", legalAddressId);
			sql.append(" AND T3.CONT_MED_TYPE_ID = 11 ");
		}
		sql.append(condition.toString());
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.CUST_QRY, sql.toString(), queryParam, CmConstants.BusiLogType.CUSTOMER_LOG);
		if (dcs != null && dcs.length > 0) {
			return dcs[0].getAsInt("DATA_COUNT");
		}
		return 0;
	}

	public DataContainerInterface[] queryGroupCustomers(long custIds[], String state, int custStatus, String cvrNo, String shortName, String companyName, long legalAddressId,
			String contPhone, long managerId, long managerGroupId, long segment, long category, String custServiceId, int start, int end) throws Exception {
		StringBuffer sql = new StringBuffer();
		StringBuffer condition = new StringBuffer();
		HashMap queryParam = new HashMap();
		// 默认按照地址查询
		if (managerId > 0 || managerGroupId > 0) {
			sql.append("SELECT T1.REGION_ID, T1.CUST_ID,T1.CUST_NAME,T1.SHORT_NAME,T2.TAX_ID,T1.CUST_CERT_TYPE,T1.CUST_CERT_CODE,T3.SEGMENT_ID,T1.CUST_SERVICE_LEVEL,T1.GROUP_SUB_TYPE,T1.LEGAL_CUST_ID,T1.GROUP_WEB,T1.CUST_STATUS,T7.MANAGER_ID,T4.IS_CONTACT_POINT,T1.CUST_PASSWORD,T6.ADDRESS_DETAIL,T2.BI_COMPANY_NAME,T2.LEGAL_FORM,T5.RATING_CODE,T1.GROUP_TYPE,T2.REGISTRATION_DATE,T2.DIRECT_MARKETING_PROTECTION,T2.AKS_STATUS,T2.AKS_REGISTRATION_DATE,T1.CREDIT_LEVEL,T1.CREDIT_VALUE,T1.STAFF_AMOUNT_TYPE,T1.STAFF_AMOUNT,T5.LAST_YEAR_EMPLOYEES,T1.REMARKS FROM {CM_GROUP_CUSTOMER} T1 LEFT JOIN {CM_GROUP_ACCOUNTING} T5 ON T1.CUST_ID = T5.CUST_ID,{CMX_GROUP_CUSTOMER} T2,{CM_CUST_SEGMENT_RELA} T3,{CM_GROUP_ORG_STRUCT} T4,{CM_CUST_CONTACT_MEDIUM} T6,{CM_GROUP_MANAGER} T7 WHERE T1.CUST_ID = T2.CUST_ID AND T1.CUST_ID = T3.CUST_ID AND T1.CUST_ID = T4.REL_CUST_ID AND T1.CUST_ID = T6.CUST_ID AND T1.CUST_ID = T7.CUST_ID AND T6.CONT_MED_TYPE_ID = 11");
		} else {
			sql.append("SELECT T1.REGION_ID, T1.CUST_ID,T1.CUST_NAME,T1.SHORT_NAME,T2.TAX_ID,T1.CUST_CERT_TYPE,T1.CUST_CERT_CODE,T3.SEGMENT_ID,T1.CUST_SERVICE_LEVEL,T1.GROUP_SUB_TYPE,T1.LEGAL_CUST_ID,T1.GROUP_WEB,T1.CUST_STATUS,T7.MANAGER_ID,T4.IS_CONTACT_POINT,T1.CUST_PASSWORD,T6.ADDRESS_DETAIL,T2.BI_COMPANY_NAME,T2.LEGAL_FORM,T5.RATING_CODE,T1.GROUP_TYPE,T2.REGISTRATION_DATE,T2.DIRECT_MARKETING_PROTECTION,T2.AKS_STATUS,T2.AKS_REGISTRATION_DATE,T1.CREDIT_LEVEL,T1.CREDIT_VALUE,T1.STAFF_AMOUNT_TYPE,T1.STAFF_AMOUNT,T5.LAST_YEAR_EMPLOYEES,T1.REMARKS FROM {CM_GROUP_CUSTOMER} T1 LEFT JOIN {CM_GROUP_ACCOUNTING} T5 ON T1.CUST_ID = T5.CUST_ID,{CMX_GROUP_CUSTOMER} T2,{CM_CUST_SEGMENT_RELA} T3,{CM_GROUP_ORG_STRUCT} T4,{CM_CUST_CONTACT_MEDIUM} T6,{CM_GROUP_MANAGER} T7 WHERE T1.CUST_ID = T2.CUST_ID AND T1.CUST_ID = T3.CUST_ID AND T1.CUST_ID = T4.REL_CUST_ID AND T1.CUST_ID = T6.CUST_ID AND T1.CUST_ID = T7.CUST_ID AND T6.CONT_MED_TYPE_ID = 11 AND T7.REL_TYPE = 1");
		}
		if (StringUtils.isNotBlank(contPhone)) {
			IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = CmServiceFactory.getCustomerSV().queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.PHONE,
					CmDkConstants.CustContMedium.CONTACT_NUMBER, contPhone);
			// 如果传入客户ID和联系电话，则以客户ID为主，不根据联系电话查询
			if (custIds == null || custIds.length < 1) {
				if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
					custIds = new long[mediumAndTypeValues.length];
					for (int i = 0; i < mediumAndTypeValues.length; i++) {
						custIds[i] = mediumAndTypeValues[i].getCustId();
					}
				} else {
					// 输入号码查询，如果没有查询到信息，则返回空
					return new DataContainerInterface[0];
				}
			}
		}
		if (StringUtils.isNotBlank(cvrNo)) {
			condition.append(" AND T2.TAX_ID = ").append(":cvrNo");
			queryParam.put("cvrNo", cvrNo);
		}
		if (StringUtils.isNotBlank(shortName)) {
			condition.append(" AND T1.SHORT_NAME like ").append(":shortName");
			queryParam.put("shortName", shortName + "%");
		}
		if (StringUtils.isNotBlank(companyName)) {
			condition.append(" AND T1.CUST_NAME like  ").append(":companyName");
			queryParam.put("companyName", "%" + companyName + "%");
		}
		if (segment > 0) {
			condition.append(" AND T3.SEGMENT_ID = ").append(":segment");
			queryParam.put("segment", segment);
		}
		if (category > 0) {
			condition.append(" AND T1.CUST_SERVICE_LEVEL = ").append(":category");
			queryParam.put("category", category);
		}
		if (custIds != null && custIds.length > 0) {
			condition.append(" AND T1.CUST_ID IN(");
			for (int i = 0; i < custIds.length; i++) {
				if (i > 0) {
					condition.append(",");
				}
				condition.append(custIds[i]);

			}
			condition.append(")");
		}
		if (StringUtils.isNotBlank(state)) {
			condition.append(" AND T1.STATE = ").append(":state");
			queryParam.put("state", state);
			// CM_GROUP_MANAGER_21表增加状态过滤
			// condition.append(" AND T7.STATE = ").append(":state");
			// queryParam.put("state", state);
		}
		if (StringUtils.isNotBlank(custServiceId)) {
			condition.append(" AND T1.CUST_SERVICE_ID = ").append(":custServiceId");
			queryParam.put("custServiceId", custServiceId);
		}
		if (custStatus >= 0) {
			condition.append(" AND T1.CUST_STATUS = ").append(":custStatus");
			queryParam.put("custStatus", custStatus);
		}
		if (legalAddressId > 0) {
			condition.append(" AND T6.ADDRESS_ID = ").append(":legalAddressId");
			queryParam.put("legalAddressId", legalAddressId);
		}
		sql.append(condition.toString());
		StringBuffer unionSql = new StringBuffer();
		unionSql.append(sql.toString());
		if (managerGroupId > 0 && managerId > 0) {
			unionSql.append(" AND T7.MANAGER_ID = ").append(":managerId");
			unionSql.append(" UNION ").append(sql.toString()).append(" AND T7.MANAGER_ID = ").append(":managerGroupId");
			queryParam.put("managerId", managerId);
			queryParam.put("managerGroupId", managerGroupId);
		}
		if (start > 0 && end > 0) {
			unionSql.append(" LIMIT ").append(start - 1).append(",").append(end - start + 1);
		}
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, unionSql.toString(), queryParam);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.CUST_QRY, sql.toString(), queryParam, CmConstants.BusiLogType.CUSTOMER_LOG);
		long segmentId = 0;
		for (int i = 0; i < values.length; i++) {
			// 转细分
			segmentId = values[i].getAsLong("SEGMENT_ID");
			ICmCustSegmentSV segmentSV = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
			IBoCmCustSegmentValue custSegmentValue = segmentSV.querySegmentByIdfromCache(segmentId);
			if (custSegmentValue != null) {
				values[i].set("SEGMENT_NAME", custSegmentValue.getSegmentName());
			}

			// 转客户经理
			long tempManagerId = values[i].getAsLong("MANAGER_ID");
			if (tempManagerId > 0) {
				ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
				IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(tempManagerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
				if (secStaff != null) {
					values[i].set("MANAGER_NAME", secStaff.getManagername());
				} else {
					// 查询客户经理组
					IBOSecGroupValue ibOrganizeValue = OrgmodelClient.getGroupValueByGroupId(tempManagerId);
					if (CmCommonUtil.isNotEmptyObject(ibOrganizeValue)) {
						values[i].set("MANAGER_NAME", ibOrganizeValue.getGroupName());
					}
				}
			}
		}
		if (values == null) {
			return new DataContainerInterface[0];
		}
		return values;
	}
	
	/**
	 * 新增接口 获取ext15有值的former集团客户
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] queryHasExt15FormerGroupCustomers(int start, int end) throws Exception {
		StringBuffer sql = new StringBuffer();
		HashMap queryParam = new HashMap();
		sql.append("SELECT T1.CUST_ID FROM {CM_GROUP_CUSTOMER} T1,{CMX_GROUP_CUSTOMER} T2 WHERE T1.CUST_ID = T2.CUST_ID AND T2.EXT15 IS NOT NULL AND T1.CUST_STATUS = 2 ");
		if (start > 0 && end > 0) {
			sql.append(" LIMIT ").append(start - 1).append(",").append(end - start + 1);
		}
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.CUST_QRY, sql.toString(), queryParam, CmConstants.BusiLogType.CUSTOMER_LOG);
		if (values == null) {
			return new DataContainerInterface[0];
		}
		return values;
	}
	

	public int queryGroupCustomersCount(long custIds[], String state, int custStatus, String cvrNo, String shortName, String companyName, long legalAddressId, String contPhone,
			long managerId, long managerGroupId, long segment, long category, String custServiceId) throws Exception {
		StringBuffer sql = new StringBuffer();
		StringBuffer condition = new StringBuffer();
		HashMap queryParam = new HashMap();
		StringBuffer resultSql = new StringBuffer();
		resultSql.append("SELECT SUM(DATA_COUNT) AS RESULT FROM (");
		// 默认按照地址查询
		if (managerId > 0 || managerGroupId > 0) {
			sql.append("SELECT COUNT(*) AS DATA_COUNT FROM {CM_GROUP_CUSTOMER} T1 LEFT JOIN {CM_GROUP_ACCOUNTING} T5 ON T1.CUST_ID = T5.CUST_ID,{CMX_GROUP_CUSTOMER} T2,{CM_CUST_SEGMENT_RELA} T3,{CM_GROUP_ORG_STRUCT} T4,{CM_CUST_CONTACT_MEDIUM} T6,{CM_GROUP_MANAGER} T7 WHERE T1.CUST_ID = T2.CUST_ID AND T1.CUST_ID = T3.CUST_ID AND T1.CUST_ID = T4.REL_CUST_ID AND T1.CUST_ID = T6.CUST_ID AND T1.CUST_ID = T7.CUST_ID  AND T6.CONT_MED_TYPE_ID = 11");
		} else {
			sql.append("SELECT COUNT(*) AS DATA_COUNT FROM {CM_GROUP_CUSTOMER} T1 LEFT JOIN {CM_GROUP_ACCOUNTING} T5 ON T1.CUST_ID = T5.CUST_ID,{CMX_GROUP_CUSTOMER} T2,{CM_CUST_SEGMENT_RELA} T3,{CM_GROUP_ORG_STRUCT} T4,{CM_CUST_CONTACT_MEDIUM} T6,{CM_GROUP_MANAGER} T7 WHERE T1.CUST_ID = T2.CUST_ID AND T1.CUST_ID = T3.CUST_ID AND T1.CUST_ID = T4.REL_CUST_ID AND T1.CUST_ID = T6.CUST_ID AND T1.CUST_ID = T7.CUST_ID  AND T6.CONT_MED_TYPE_ID = 11 AND T7.REL_TYPE = 1");
		}
		if (StringUtils.isNotBlank(contPhone)) {
			IQBOCmCustContMediumAndTypeValue[] mediumAndTypeValues = CmServiceFactory.getCustomerSV().queryCustomerByMediuTypeAndValue(CmDkConstants.CustContMedium.PHONE,
					CmDkConstants.CustContMedium.CONTACT_NUMBER, contPhone);
			// 如果传入客户ID和联系电话，则以客户ID为主，不根据联系电话查询
			if (custIds == null || custIds.length < 1) {
				if (mediumAndTypeValues != null && mediumAndTypeValues.length > 0) {
					custIds = new long[mediumAndTypeValues.length];
					for (int i = 0; i < mediumAndTypeValues.length; i++) {
						custIds[i] = mediumAndTypeValues[i].getCustId();
					}
				} else {
					return 0;
				}
			}
		}
		if (StringUtils.isNotBlank(cvrNo)) {
			condition.append(" AND T2.TAX_ID = ").append(":cvrNo");
			queryParam.put("cvrNo", cvrNo);
		}
		if (StringUtils.isNotBlank(shortName)) {
			condition.append(" AND T1.SHORT_NAME like ").append(":shortName");
			queryParam.put("shortName", shortName + "%");
		}
		if (StringUtils.isNotBlank(companyName)) {
			condition.append(" AND T1.CUST_NAME like ").append(":companyName");
			queryParam.put("companyName", "%" + companyName + "%");
		}
		if (segment > 0) {
			condition.append(" AND T3.SEGMENT_ID = ").append(":segment");
			queryParam.put("segment", segment);
		}
		if (category > 0) {
			condition.append(" AND T1.CUST_SERVICE_LEVEL = ").append(":category");
			queryParam.put("category", category);
		}
		if (custIds != null && custIds.length > 0) {
			condition.append(" AND T1.CUST_ID IN(");
			for (int i = 0; i < custIds.length; i++) {
				if (i > 0) {
					condition.append(",");
				}
				condition.append(custIds[i]);

			}
			condition.append(")");
		}
		if (StringUtils.isNotBlank(state)) {
			condition.append(" AND T1.STATE = ").append(":state");
			queryParam.put("state", state);
			// CM_GROUP_MANAGER_21表增加状态过滤
			// condition.append(" AND T7.STATE = ").append(":state");
			// queryParam.put("state", state);
		}
		if (custStatus >= 0) {
			condition.append(" AND T1.CUST_STATUS = ").append(":custStatus");
			queryParam.put("custStatus", custStatus);
		}
		if (StringUtils.isNotBlank(custServiceId)) {
			condition.append(" AND T1.CUST_SERVICE_ID = ").append(":custServiceId");
			queryParam.put("custServiceId", custServiceId);
		}
		if (legalAddressId > 0) {
			condition.append(" AND T6.ADDRESS_ID = ").append(":legalAddressId");
			queryParam.put("legalAddressId", legalAddressId);
		}
		sql.append(condition.toString());
		StringBuffer unionSql = new StringBuffer();
		unionSql.append(sql.toString());
		if (managerGroupId > 0 && managerId > 0) {
			unionSql.append(" AND T7.MANAGER_ID = ").append(":managerId");
			unionSql.append(" UNION ").append(sql.toString()).append(" AND T7.MANAGER_ID = ").append(":managerGroupId");
			queryParam.put("managerId", managerId);
			queryParam.put("managerGroupId", managerGroupId);
		}
		unionSql.append(" )T10");
		resultSql.append(unionSql);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, resultSql.toString(), queryParam);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.CUST_QRY, resultSql.toString(), queryParam, CmConstants.BusiLogType.CUSTOMER_LOG);
		if (values != null) {
			return values[0].getAsInt("RESULT");
		}
		return 0;
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustByAddressId(long[] addressIds, int addressType) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append("1=1");
		if (addressType > 0) {
			condition.append(" AND ").append(IQBOCmCustContMediumAndTypeValue.S_ContMedTypeId).append(" = :addressType ");
			paraMap.put("addressType", addressType);
		}
		if (addressIds != null && addressIds.length > 0) {
			condition.append(" AND ").append(IQBOCmCustContMediumAndTypeValue.S_AddressId).append(" IN(");
			for (int i = 0; i < addressIds.length; i++) {
				if (i > 0) {
					condition.append(",");
				}
				condition.append(addressIds[i]);

			}
			condition.append(")");
		}
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmCustContMediumAndTypeBean.class, condition.toString(), paraMap, -1, -1);
		IQBOCmCustContMediumAndTypeValue[] results = (IQBOCmCustContMediumAndTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmCustContMediumAndTypeBean.class, sql, paraMap);
		if (results != null && results.length > 0) {
			return results;
		}
		return null;
	}

	public DataContainerInterface[] queryCustomerByAddress(long[] addressIds, int addressType) throws Exception {
		IQBOCmCustContMediumAndTypeValue[] custMediums = queryCustByAddressId(addressIds, addressType);
		if (custMediums != null && custMediums.length > 0) {
			List custIds = new ArrayList();
			for (int i = 0; i < custMediums.length; i++) {
				custIds.add(custMediums[i].getCustId());
			}
			Long[] ids = (Long[]) custIds.toArray(new Long[0]);
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			ICustomerValue[] customerValues = customerSV.queryCustByCustIds(ArrayUtils.toPrimitive(ids));
			if (customerValues != null && customerValues.length > 0) {
				List result = new ArrayList();
				DataContainerInterface dc = null;
				for (int i = 0; i < customerValues.length; i++) {
					for (int j = 0; j < custMediums.length; j++) {
						if (customerValues[i].getCustId() == custMediums[j].getCustId()) {
							dc = new DataContainer();
							dc.copy(customerValues[i]);
							dc.set(IQBOCmCustContMediumAndTypeValue.S_AddressId, custMediums[j].getAddressId());
							dc.set(IQBOCmCustContMediumAndTypeValue.S_AddressDetail, custMediums[j].getAddressDetail());
							dc.set(IQBOCmCustContMediumAndTypeValue.S_ContMedTypeId, addressType);
							dc.set(ICustomerValue.S_CustType, CmCommonUtil.getCustType(customerValues[i].getCustId()));
							result.add(dc);
						}
					}
				}
				if (!result.isEmpty()) {
					return (DataContainerInterface[]) result.toArray(new DataContainerInterface[0]);
				}
			}
		}
		return null;
	}

	public Map queryBillingAddress(long custId, long acctId) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IQBOCmPartyValue partyValue = accountSV.querPayerByAcctId(acctId);
		Map result = new HashMap();
		if (CmCommonUtil.isEmptyObject(partyValue)) {
			// 表示账户是自有，不是代付账户，查询账户归属客户的法律地址
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			IQBOCmCustContMediumAndTypeValue[] contMediumAndTypeValues = customerSV.queryCustContactMediums(custId, CmDkConstants.CustContMedium.LEGAL_ADDRESS,
					CmDkConstants.CustContMedium.ADDRESS, -1, -1);
			if (contMediumAndTypeValues != null && contMediumAndTypeValues.length > 0) {
				result.put(IQBOCmCustContMediumAndTypeValue.S_AddressDetail, contMediumAndTypeValues[0].getAddressDetail());
				result.put(IQBOCmCustContMediumAndTypeValue.S_AddressId, contMediumAndTypeValues[0].getAddressId());
			}
			// 查询联系电话,email
			IQBOCmCustContMediumAndTypeValue[] contValues = customerSV.queryCustElectronicMedium(custId, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(contValues)) {
				for (IQBOCmCustContMediumAndTypeValue value : contValues) {
					if (value.getContMedTypeId() == CmConstants.AddressId.CONTACT_NUMBER && null == result.get(IQBOCmCustContMediumAndTypeValue.S_ContNumber)) {
						result.put(IQBOCmCustContMediumAndTypeValue.S_ContNumber, value.getContNumber());
					} else if (value.getContMedTypeId() == CmConstants.AddressId.EMAIL && null == result.get(IQBOCmCustContMediumAndTypeValue.S_EmailAddress)) {
						result.put(IQBOCmCustContMediumAndTypeValue.S_EmailAddress, value.getEmailAddress());
					}

				}
			}
		} else {
			result.put(IQBOCmCustContMediumAndTypeValue.S_AddressDetail, partyValue.getRemarks());
			result.put(IQBOCmCustContMediumAndTypeValue.S_AddressId, partyValue.getContAddress());
/*			result.put(IQBOCmCustContMediumAndTypeValue.S_ContNumber, partyValue.getContMobile());
			result.put(IQBOCmCustContMediumAndTypeValue.S_EmailAddress, partyValue.getContEmail());

			try {
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				IBOCmPartyContactValue[] contactValues = partySV.queryPartyContact(partyValue.getPartyId());
				if (null != contactValues && contactValues.length > 0) {
					//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL
					ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					if (StringUtils.isBlank(partyValue.getContEmail())) {
						IQBOCmContactContMediumInfoValue[] emailContMediums = customerSV.queryContactContMediumInfoByContId(contactValues[0].getContId(), 201, -1, -1);
						if (null != emailContMediums && emailContMediums.length > 0) {
							result.put(IQBOCmCustContMediumAndTypeValue.S_EmailAddress, emailContMediums[0].getEmailAddress());
						}
					}

					//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL
					if (StringUtils.isBlank(partyValue.getContMobile())) {
						IQBOCmContactContMediumInfoValue[] phonenumContMediums = customerSV.queryContactContMediumInfoByContId(contactValues[0].getContId(), 301, -1, -1);
						if (null != phonenumContMediums && phonenumContMediums.length > 0) {
							result.put(IQBOCmCustContMediumAndTypeValue.S_ContNumber, phonenumContMediums[0].getContNumber());
						}
					}
				}
			} catch (Exception ignored) {

			}*/
		}
		return result;
	}

	public IBOCmInsCmrelValue[] queryCmInsCmrel(long userId, int startIndex, int endIndex) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
		IInsCmRelSV crmInsFSV = (IInsCmRelSV) ServiceFactory.getService(IInsCmRelSV.class);
		IInsCmRelValue cmRelValue = crmInsFSV.queryInsCmRel(userId, -1, CmConstants.RelaType.OWNER, CmConstants.CmInsRela.NORMAL);
		if (CmCommonUtil.isNotEmptyObject(cmRelValue)) {
			IBOCmInsCmrelValue insValue = new BOCmInsCmrelBean();
			long custId = cmRelValue.getCustId();
			insValue.copy(cmRelValue);
			if (CmCommonUtil.isNotEmptyObject(insValue)) {
				ArrayList<IBOCmInsCmrelValue> list = new ArrayList<IBOCmInsCmrelValue>();
				// 调用接口查询用户信息
				IInsUserValue value = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
				if (CmCommonUtil.isNotEmptyObject(value)) {
					String state = value.getState();
					int userType = value.getUserType();
					// 只有状态为1,4,8的时候这个号码才可用,另外个人的虚用户为6，集团虚用户为8
					if (("1".equals(state) || "4".equals(state) || "8".equals(state)) && userType != 6) {
						insValue.setBillId(value.getBillId());
						list.add(insValue);
					}
					IInsCmRelValue insCmRelValue = crmInsFSV.queryInsCmRel(userId, -1, CmConstants.RelaType.USER, CmConstants.CmInsRela.NORMAL);
					if (CmCommonUtil.isNotEmptyObject(insCmRelValue)) {
						ICustomerValue user = custSV.queryCustomerByCustId(insCmRelValue.getCustId());
						// 已分配
						insValue.setIsAssigned(CmConstants.IsAssigned.ASSIGNED);
						insValue.setUser(String.valueOf(user.getCustId()));
						// 对于使用者显示其名称
						insValue.setDiaplayAttr("USER", "REAL_USER_NAME", user.getCustName());
						// 对于使用者可编辑它的属性
						// CVS-405客户也要求展示编辑按钮，只是不允许编辑提示去View All页面修改，那放开这个按钮有啥意义？
						if (insCmRelValue.getCmrelId() > 0) {
							String editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyCustInfo(" + insCmRelValue.getCustId()
									+ ")' style='color:blue;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
							insValue.setAction(editor);
						}
					} else {
						// 未分配
						insValue.setIsAssigned(CmConstants.IsAssigned.NOT_ASSIGNED);
					}
					// 对于归属者显示其名称
					ICustomerValue owner = custSV.queryCustomerByCustId(custId);
					insValue.setDiaplayAttr("CUST_ID", "REAL_CUST_NAME", owner.getCustName());
					return list.toArray(new IBOCmInsCmrelValue[0]);
				}
			}
		}
		return new IBOCmInsCmrelValue[0];
	}

	public int queryCmInsCmrelCount(long userId) throws Exception {
		return queryCmInsCmrel(userId, -1, -1).length;
	}

	public DataContainer[] queryGroupDeptBill(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		String deptId = DataType.getAsString(dcs[0].get("DEPT_ID"));
		String custId = DataType.getAsString(dcs[0].get("CUST_ID"));
		StringBuilder condition = new StringBuilder(
				" SELECT t1.* FROM {CM_GROUP_MEMBER} t1,{CM_INS_CMREL} t2 WHERE t1.CUST_ID=t2.CUST_ID AND t1.USER_ID=t2.USER_ID AND t1.CUST_ID=:CUST_ID AND t2.STATE=:state AND t1.DEPT_ID=:deptId AND t2.RELA_TYPE=:relaType ");
		Map parameter = new HashMap();
		parameter.put("CUST_ID", custId);
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		parameter.put("deptId", deptId);
		parameter.put("relaType", CmConstants.RelaType.OWNER);
		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(condition.toString(), "", startNum, endNum, parameter), parameter);
		// 针对号码展示重新调用订单接口查询
		if (counts != null && counts.length > 0) {
			long userId = 0;
			for (int i = 0; i < counts.length; i++) {
				userId = counts[i].getAsLong("USER_ID");
				if (userId > 0) {
					// 调用接口查询用户信息
					CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
					IInsUserValue value = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
					if (value != null) {
						counts[i].set("BILL_ID", value.getBillId());
					} else {
						counts[i].set("BILL_ID", "");
					}
				} else {
					counts[i].set("BILL_ID", "");
				}
			}
		}
		return (DataContainer[]) counts;
	}
	/**
	 * 提供给OSE查询部门的userList接口
	 * @param custId
	 * @param deptId
	 * @param limit
	 * @param offset
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] queryGroupDeptBill4Ose(Long custId, Long deptId , int limit, int offset) throws Exception {
		StringBuilder condition = new StringBuilder(
				"SELECT t1.* FROM {CM_GROUP_MEMBER} t1,{CM_INS_CMREL} t2 WHERE t1.CUST_ID=t2.CUST_ID AND t1.USER_ID=t2.USER_ID AND t1.CUST_ID=:CUST_ID AND t2.STATE=:state AND t1.DEPT_ID=:deptId AND t2.RELA_TYPE=:relaType "
				+ "limit " +limit+ " offset " + offset);
		Map parameter = new HashMap();
		parameter.put("CUST_ID", custId);
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		parameter.put("deptId", deptId);
		parameter.put("relaType", CmConstants.RelaType.OWNER);
		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(condition.toString(), "", -1, -1, parameter), parameter);
		// 针对号码展示重新调用订单接口查询
		if (counts != null && counts.length > 0) {
			long userId = 0;
			for (int i = 0; i < counts.length; i++) {
				userId = counts[i].getAsLong("USER_ID");
				if (userId > 0) {
					// 调用接口查询用户信息
					CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
					IInsUserValue value = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
					if (value != null) {
						counts[i].set("BILL_ID", value.getBillId());
					} else {
						counts[i].set("BILL_ID", "");
					}
					
					IInsOfferValue insOfferValue[] = SoServiceFactory.getInstanceQrySV().getInsOfferByUserId(userId, RBossConst.OFFER_TYPE_BASE, OrderConst.VALID_TYPE_NOW); 
					if (insOfferValue != null && insOfferValue.length > 0) {
						counts[i].set("NAME", insOfferValue[0].getOrderName());
					} else {
						counts[i].set("NAME", "");
					}
				} else {
					counts[i].set("BILL_ID", "");
					counts[i].set("NAME", "");
				}
			}
		}
		return (DataContainer[]) counts;
	}

	public int queryGroupDeptBillCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		String deptId = DataType.getAsString(dcs[0].get("DEPT_ID"));
		String custId = DataType.getAsString(dcs[0].get("CUST_ID"));
		StringBuilder condition = new StringBuilder(
				" SELECT t1.* FROM {CM_GROUP_MEMBER} t1,{CM_INS_CMREL} t2 WHERE t1.CUST_ID=t2.CUST_ID AND t1.USER_ID=t2.USER_ID AND t1.CUST_ID=:CUST_ID AND t2.STATE=:state AND t1.DEPT_ID=:deptId AND t2.RELA_TYPE=:relaType ");
		Map parameter = new HashMap();
		parameter.put("CUST_ID", custId);
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		parameter.put("deptId", deptId);
		parameter.put("relaType", CmConstants.RelaType.OWNER);
		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(condition.toString(), "", parameter), parameter);
		return counts[0].getAsInt("CNT");
	}

	public DataContainer[] queryCustomersByCustNameAndAddress(String custName, long[] addressIds) throws Exception {
		if (StringUtils.isNotBlank(custName) && null != addressIds && addressIds.length > 0) {
			StringBuilder condition = new StringBuilder();
			condition.append(" SELECT t1.* FROM {CM_INDIV_CUSTOMER} t1,{CM_CUST_CONTACT_MEDIUM} t2 WHERE t1.CUST_ID=t2.CUST_ID AND t1.CUST_NAME_QRY=:custName ");
			condition.append(" AND t1.CUST_ID=t2.CUST_ID AND t2.CONT_MED_TYPE_ID=:type ");
			condition.append(" AND t1.STATE!='E' AND t1.CUST_STATUS!='4' ");
			condition.append(" AND t2.ADDRESS_ID IN ( ");
			for (int i = 0; i < addressIds.length; i++) {
				condition.append(addressIds[i]);
				if (i < addressIds.length - 1) {
					condition.append(" , ");
				}
			}
			condition.append(" ) ");
			Map parameter = new HashMap();
			parameter.put("custName", custName.toUpperCase());
			parameter.put("type", CmConstants.AddressId.legalAddress);
			String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
			return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		} else {
			ExceptionUtil.throwBusinessException(" The param is not correct ");
		}
		return new DataContainer[0];
	}

	public DataContainerInterface[] queryPartyList(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		int partyType = DataType.getAsInt(dcs[0].get("PARTY_TYPE"));
		String partyName = dcs[0].get("PARTY_NAME") == null ? "" : DataType.getAsString(dcs[0].get("PARTY_NAME"));
		String firstName = dcs[0].get("FIRST_NAME") == null ? "" : DataType.getAsString(dcs[0].get("FIRST_NAME"));
		String lastName = dcs[0].get("LAST_NAME") == null ? "" : DataType.getAsString(dcs[0].get("LAST_NAME"));
		int certType = dcs[0].get("CERT_TYPE") == null ? -1 : DataType.getAsInt(dcs[0].get("CERT_TYPE"));
		String certCode = dcs[0].get("CERT_CODE") == null ? "" : DataType.getAsString(dcs[0].get("CERT_CODE"));
		String addressId = dcs[0].get("ADDRESS_ID") == null ? "" : DataType.getAsString(dcs[0].get("ADDRESS_ID"));
		long partyId = dcs[0].get("PARTY_ID") == null ? -1 : DataType.getAsLong(dcs[0].get("PARTY_ID"));
		String tempName = "";	// 修改查询逻辑，将first+last的查询都走partyName
		if (StringUtils.isBlank(partyName)) {
			if (StringUtils.isNotBlank(firstName) && StringUtils.isNotBlank(lastName)) {
				tempName = firstName + " " + lastName;
			} else {
				tempName = StringUtils.isNotBlank(firstName) ? firstName : lastName;
			}
			partyName = tempName;
			firstName = "";
			lastName = "";
		}

		StringBuilder condition = new StringBuilder();
		HashMap queryParam = new HashMap();
		// 目前这样会丢失联系人的角色，不过需求文档没要求联系人角色视图，因此不考虑，后续如果需要，就在union all一下联系人的
		condition
				.append("SELECT T.PARTY_ID,T.PARTY_NAME,T.CERT_TYPE,T.CERT_CODE,T.STATE,T.EFFECTIVE_DATE,T.EXPIRE_DATE,T1.REMARKS AS ADDRESS_DETAIL FROM {CM_PARTY} T, {CM_PARTY_CONTACT} T1, {CM_PARTY_ROLE} T3 ");
		condition.append("WHERE T.PARTY_ID = T3.PARTY_ID AND T.PARTY_ID = T1.PARTY_ID AND T.PARTY_TYPE = ").append(partyType)
				.append(" AND NOT EXISTS (SELECT 1 FROM {CM_PARTY_ROLE} T2 WHERE T1.PARTY_ID = T2.PARTY_ID AND T2.ROLE_TYPE IN (1, 2, 3))");
		if (StringUtils.isNotBlank(partyName)) {
			condition.append(" AND T.PARTY_NAME LIKE ").append(":partyName");
			queryParam.put("partyName", partyName + "%");
		}
		if (StringUtils.isNotBlank(firstName)) {
			condition.append(" AND T.FIRST_NAME LIKE ").append(":firstName");
			queryParam.put("firstName", firstName + "%");
		}
		if (StringUtils.isNotBlank(lastName)) {
			condition.append(" AND T.LAST_NAME LIKE ").append(":lastName");
			queryParam.put("lastName", lastName + "%");
		}
		if (certType > 0 && certType != 1) {
			condition.append(" AND T.CERT_TYPE = ").append(":certType");
			queryParam.put("certType", certType);
		}
		if (StringUtils.isNotBlank(certCode)) {
			condition.append(" AND T.CERT_CODE = ").append(":certCode");
			queryParam.put("certCode", certCode);
		}
		if (StringUtils.isNotBlank(addressId)) {
			condition.append(" AND T1.CONT_ADDRESS = ").append(":addressId");
			queryParam.put("addressId", addressId);
		}
		if (partyId > 0) {
			condition.append(" AND T.PARTY_ID = ").append(":partyId");
			queryParam.put("partyId", partyId);
		}
		condition.append(" UNION ALL ");
		if (partyType == CmConstants.CustomerType.INDIVIDUAL) {
			condition
					.append("SELECT DISTINCT T.PARTY_ID,T.PARTY_NAME,T.CERT_TYPE,T.CERT_CODE,T.STATE,T1.EFFECTIVE_DATE,T1.EXPIRE_DATE,T2.ADDRESS_DETAIL FROM {CM_PARTY} T,{CM_INDIV_CUSTOMER} T1 LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T2 ON T1.CUST_ID = T2.CUST_ID");
			if (StringUtils.isBlank(addressId)) {
				condition.append(" AND T2.CONT_MED_TYPE_ID = 11");
			}
			condition.append(" WHERE T.PARTY_ID = T1.PARTY_ID");
			if (StringUtils.isNotBlank(partyName)) {
				condition.append(" AND T.PARTY_NAME LIKE ").append(":partyName");
				queryParam.put("partyName", partyName + "%");
			}
			if (StringUtils.isNotBlank(firstName)) {
				condition.append(" AND T.FIRST_NAME LIKE ").append(":firstName");
				queryParam.put("firstName", firstName + "%");
			}
			if (StringUtils.isNotBlank(lastName)) {
				condition.append(" AND T.LAST_NAME LIKE ").append(":lastName");
				queryParam.put("lastName", lastName + "%");
			}
			if (certType > 0 && certType != 1) {
				condition.append(" AND T1.CUST_CERT_TYPE = ").append(":certType");
				queryParam.put("certType", certType);
			}
			if (StringUtils.isNotBlank(certCode)) {
				condition.append(" AND T1.CUST_CERT_CODE = ").append(":certCode");
				queryParam.put("certCode", certCode);
			}
			if (StringUtils.isNotBlank(addressId)) {
				condition.append(" AND T2.ADDRESS_ID = ").append(":addressId");
				queryParam.put("addressId", addressId);
			}
			if (partyId > 0) {
				condition.append(" AND T.PARTY_ID = ").append(":partyId");
				queryParam.put("partyId", partyId);
			}
		} else {
			condition
					.append("SELECT DISTINCT T.PARTY_ID,T.PARTY_NAME,T.CERT_TYPE,T.CERT_CODE,T.STATE,T1.EFFECTIVE_DATE,T1.EXPIRE_DATE,T2.ADDRESS_DETAIL FROM {CM_PARTY} T,{CM_GROUP_CUSTOMER} T1 LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T2 ON T1.CUST_ID = T2.CUST_ID");
			if (StringUtils.isBlank(addressId)) {
				condition.append(" AND T2.CONT_MED_TYPE_ID = 11");
			}
			condition.append(",{CMX_GROUP_CUSTOMER} T3 WHERE T.PARTY_ID = T1.PARTY_ID AND T1.CUST_ID = T3.CUST_ID");
			if (StringUtils.isNotBlank(partyName)) {
				condition.append(" AND T1.CUST_NAME LIKE ").append(":partyName");
				queryParam.put("partyName", partyName + "%");
			}
			if (certType > 0 && certType != 1) {
				condition.append(" AND T1.CUST_CERT_TYPE = ").append(":certType");
				queryParam.put("certType", certType);
				condition.append(" AND T1.CUST_CERT_CODE = ").append(":certCode");
				queryParam.put("certCode", certCode);
			} else if (certType == 1) {
				condition.append(" AND T3.TAX_ID = ").append(":certCode");
				queryParam.put("certCode", certCode);
			}
			if (StringUtils.isNotBlank(addressId)) {
				condition.append(" AND T2.ADDRESS_ID = ").append(":addressId");
				queryParam.put("addressId", addressId);
			}
			if (partyId > 0) {
				condition.append(" AND T.PARTY_ID = ").append(":partyId");
				queryParam.put("partyId", partyId);
			}
		}
		if (startNum > 0 && endNum > 0) {
			condition.append(" LIMIT ").append(startNum - 1).append(",").append(endNum - startNum + 1);
		}
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), queryParam);
		if (values != null && values.length > 0) {
			// 模糊处理
			for (int i = 0; i < values.length; i++) {
				String custCertCode = values[i].getAsString("CERT_CODE");
				if (StringUtils.isNotBlank(custCertCode)) {
					String maskCode = maskCustCertCode(partyType, custCertCode);
					values[i].set("CERT_CODE", maskCode);
				}
				values[i].set("PARTY_TYPE", partyType);
			}
			return values;
		}
		return new DataContainerInterface[0];
	}

	public int queryPartyListCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		int partyType = DataType.getAsInt(dcs[0].get("PARTY_TYPE"));
		String partyName = dcs[0].get("PARTY_NAME") == null ? "" : DataType.getAsString(dcs[0].get("PARTY_NAME"));
		String firstName = dcs[0].get("FIRST_NAME") == null ? "" : DataType.getAsString(dcs[0].get("FIRST_NAME"));
		String lastName = dcs[0].get("LAST_NAME") == null ? "" : DataType.getAsString(dcs[0].get("LAST_NAME"));
		int certType = dcs[0].get("CERT_TYPE") == null ? -1 : DataType.getAsInt(dcs[0].get("CERT_TYPE"));
		String certCode = dcs[0].get("CERT_CODE") == null ? "" : DataType.getAsString(dcs[0].get("CERT_CODE"));
		String addressId = dcs[0].get("ADDRESS_ID") == null ? "" : DataType.getAsString(dcs[0].get("ADDRESS_ID"));
		long partyId = dcs[0].get("PARTY_ID") == null ? -1 : DataType.getAsLong(dcs[0].get("PARTY_ID"));
		String tempName = "";	// 修改查询逻辑，将first+last的查询都走partyName
		if (StringUtils.isBlank(partyName)) {
			if (StringUtils.isNotBlank(firstName) && StringUtils.isNotBlank(lastName)) {
				tempName = firstName + " " + lastName;
			} else {
				tempName = StringUtils.isNotBlank(firstName) ? firstName : lastName;
			}
			partyName = tempName;
			firstName = "";
			lastName = "";
		}

		StringBuilder condition = new StringBuilder();
		HashMap queryParam = new HashMap();
		// 目前这样会丢失联系人的角色，不过需求文档没要求联系人角色视图，因此不考虑，后续如果需要，就在union all一下联系人的
		condition.append("SELECT SUM(TEMP_COUNT) AS RESULT FROM (");
		condition.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_PARTY} T, {CM_PARTY_CONTACT} T1, {CM_PARTY_ROLE} T3 ");
		condition.append("WHERE T.PARTY_ID = T3.PARTY_ID AND T.PARTY_ID = T1.PARTY_ID AND T.PARTY_TYPE = ").append(partyType)
				.append(" AND NOT EXISTS (SELECT 1 FROM {CM_PARTY_ROLE} T2 WHERE T1.PARTY_ID = T2.PARTY_ID AND T2.ROLE_TYPE IN (1, 2, 3))");
		if (StringUtils.isNotBlank(partyName)) {
			condition.append(" AND T.PARTY_NAME LIKE ").append(":partyName");
			queryParam.put("partyName", partyName + "%");
		}
		if (StringUtils.isNotBlank(firstName)) {
			condition.append(" AND T.FIRST_NAME LIKE ").append(":firstName");
			queryParam.put("firstName", firstName + "%");
		}
		if (StringUtils.isNotBlank(lastName)) {
			condition.append(" AND T.LAST_NAME LIKE ").append(":lastName");
			queryParam.put("lastName", lastName + "%");
		}
		if (certType > 0 && certType != 1) {
			condition.append(" AND T.CERT_TYPE = ").append(":certType");
			queryParam.put("certType", certType);
		}
		if (StringUtils.isNotBlank(certCode)) {
			condition.append(" AND T.CERT_CODE = ").append(":certCode");
			queryParam.put("certCode", certCode);
		}
		if (StringUtils.isNotBlank(addressId)) {
			condition.append(" AND T1.CONT_ADDRESS = ").append(":addressId");
			queryParam.put("addressId", addressId);
		}
		if (partyId > 0) {
			condition.append(" AND T.PARTY_ID = ").append(":partyId");
			queryParam.put("partyId", partyId);
		}
		condition.append(" UNION ALL ");
		if (partyType == CmConstants.CustomerType.INDIVIDUAL) {
			condition.append("SELECT COUNT(*) AS TEMP_COUNT FROM (SELECT DISTINCT T.PARTY_ID,T.PARTY_NAME,T.CERT_TYPE,T.CERT_CODE,T.STATE,T1.EFFECTIVE_DATE,T1.EXPIRE_DATE,T2.ADDRESS_DETAIL " +
					"FROM {CM_PARTY} T,{CM_INDIV_CUSTOMER} T1 LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T2 ON T1.CUST_ID = T2.CUST_ID");
			if (StringUtils.isBlank(addressId)) {
				condition.append(" AND T2.CONT_MED_TYPE_ID = 11");
			}
			condition.append(" WHERE T.PARTY_ID = T1.PARTY_ID");
			if (StringUtils.isNotBlank(partyName)) {
				condition.append(" AND T.PARTY_NAME LIKE ").append(":partyName");
				queryParam.put("partyName", partyName + "%");
			}
			if (StringUtils.isNotBlank(firstName)) {
				condition.append(" AND T.FIRST_NAME LIKE ").append(":firstName");
				queryParam.put("firstName", firstName + "%");
			}
			if (StringUtils.isNotBlank(lastName)) {
				condition.append(" AND T.LAST_NAME LIKE ").append(":lastName");
				queryParam.put("lastName", lastName + "%");
			}
			if (certType > 0 && certType != 1) {
				condition.append(" AND T1.CUST_CERT_TYPE = ").append(":certType");
				queryParam.put("certType", certType);
			}
			if (StringUtils.isNotBlank(certCode)) {
				condition.append(" AND T1.CUST_CERT_CODE = ").append(":certCode");
				queryParam.put("certCode", certCode);
			}
			if (StringUtils.isNotBlank(addressId)) {
				condition.append(" AND T2.ADDRESS_ID = ").append(":addressId");
				queryParam.put("addressId", addressId);
			}
			if (partyId > 0) {
				condition.append(" AND T.PARTY_ID = ").append(":partyId");
				queryParam.put("partyId", partyId);
			}
			condition.append(" ) K");
		} else {
			condition
					.append("SELECT COUNT(DISTINCT T2.ADDRESS_ID,T1.CUST_ID) AS TEMP_COUNT FROM {CM_PARTY} T,{CM_GROUP_CUSTOMER} T1 LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T2 ON T1.CUST_ID = T2.CUST_ID");
			if (StringUtils.isBlank(addressId)) {
				condition.append(" AND T2.CONT_MED_TYPE_ID = 11");
			}
			condition.append(",{CMX_GROUP_CUSTOMER} T3 WHERE T.PARTY_ID = T1.PARTY_ID AND T1.CUST_ID = T3.CUST_ID");
			if (StringUtils.isNotBlank(partyName)) {
				condition.append(" AND T1.CUST_NAME LIKE ").append(":partyName");
				queryParam.put("partyName", partyName + "%");
			}
			if (certType > 0 && certType != 1) {
				condition.append(" AND T1.CUST_CERT_TYPE = ").append(":certType");
				queryParam.put("certType", certType);
				condition.append(" AND T1.CUST_CERT_CODE = ").append(":certCode");
				queryParam.put("certCode", certCode);
			} else if (certType == 1) {
				condition.append(" AND T3.TAX_ID = ").append(":certCode");
				queryParam.put("certCode", certCode);
			}
			if (StringUtils.isNotBlank(addressId)) {
				condition.append(" AND T2.ADDRESS_ID = ").append(":addressId");
				queryParam.put("addressId", addressId);
			}
			if (partyId > 0) {
				condition.append(" AND T.PARTY_ID = ").append(":partyId");
				queryParam.put("partyId", partyId);
			}
		}
		condition.append(" )T4");
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), queryParam);
		if (values != null && values.length > 0) {
			return values[0].getAsInt("RESULT");
		}
		return 0;
	}
	
	/**
	 * 查询一个客户是否是纯user，就是 在 cm_indiv_customer_21 中 查询indiv_cust_type=2( 使用者)的有效记录，
	 * 同时 在角色表cm_party_role_21 中只有role_type =2 （使用者）的一条有效记录的，即为纯user
	 * @param partyId
	 * @return
	 * @throws Exception
	 */
	public boolean searchIsPureUser(long partyId) throws Exception{
		//cm_indiv_customer_21
		boolean customerFlag = false;
		ICmIndivCustomerSV cmIndivCustSv = (ICmIndivCustomerSV)ServiceFactory.getService(ICmIndivCustomerSV.class);
		IBOCmIndivCustomerValue[] cmIndivCustomerValues = cmIndivCustSv.queryCmIndivCustByPartyId(String.valueOf(partyId));
		if(cmIndivCustomerValues != null && cmIndivCustomerValues.length > 0){
			for (int i = 0; i < cmIndivCustomerValues.length; i++) {
				String indivCustType = cmIndivCustomerValues[i].getIndivCustType();
				if(indivCustType != null && CmConstants.CustSubType.INDIV_USER == Integer.parseInt(indivCustType)){
					customerFlag = true;
					break;
				}
			}
		}
		//cm_party_role_21
		boolean roleFlag = false;
		ICmPartyRoleSV cmPartyRoleSv = (ICmPartyRoleSV)ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] cmPartyRoleValues = cmPartyRoleSv.queryPartyRoleByPartyId(partyId);
		if(cmPartyRoleValues != null && cmPartyRoleValues.length == 1){
			long roleType = cmPartyRoleValues[0].getRoleType();
			if(roleType == CmConstants.roleType.user){
				roleFlag = true;
			}
		}
		if(customerFlag && roleFlag){
			return true;
		}
		return false;
	}

	public DataContainerInterface queryPartyView(long partyId, int partyType,String operType) throws Exception {
		ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] partyRoleValues = roleSV.queryPartyRoles(partyId, -1, -1, -1);
		DataContainerInterface result = new DataContainer();
		if (partyRoleValues != null && partyRoleValues.length > 0) {
			boolean qryPay = false;
			boolean qryCustomer = false;
			boolean isCustomer = false;
			for (int i = 0; i < partyRoleValues.length; i++) {
				if (partyRoleValues[i].getRoleType() == CmConstants.roleType.payer||partyRoleValues[i].getRoleType() == CmConstants.roleType.contacter) {
					qryPay = true;
				} else if (partyRoleValues[i].getRoleType() == CmConstants.roleType.customer) {
					qryCustomer = true;
					// 判断是客户，返回需要拼接custId的超链接
					isCustomer = true;
					break;
				} else if (partyRoleValues[i].getRoleType() == CmConstants.roleType.employee || partyRoleValues[i].getRoleType() == CmConstants.roleType.user) {
					qryCustomer = true;
				}
			}

			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			DataContainer conditionDC = new DataContainer();
			if (qryCustomer) {
				// 设置参与人基本信息
				IPartyValue partyValue = partySV.queryPartyById(partyId);
				result.copy(partyValue);
				result.set(IPartyValue.S_PartyType, partyType);

				// 设置客户法律地址
				ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
				conditionDC.set(ICustomerValue.S_PartyId, partyId);
				conditionDC.set(ICustomerValue.S_CustType, partyType);
				ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
				if (customerValues != null && customerValues.length > 0) {
					long custId = customerValues[0].getCustId();
					result.set("ACTION", custId);
					//TELENOR_DEFECT_20180903_0005,纯user时，需要将customer id以普通文本方式（不是超链接）展示出来。
					if(searchIsPureUser(partyId) || "onlyView".equals(operType)){
						String edit = "<span class='cellpath'>" + custId + "</span>";
						result.set(ICustomerValue.S_CustId, edit);
					}
					if (isCustomer && !searchIsPureUser(partyId) && !"onlyView".equals(operType)) {
						String edit = "<a href='javascript:void(0)' class='cellpath' onclick='show360View(\"" + custId + "\",\"" + partyType + "\",\""
								+ customerValues[0].getCustName() + "\")' style='color:blue;text-decoration:underline'>" + custId + "</a>";
						result.set(ICustomerValue.S_CustId, edit);
					}
					IBOCmCustContactMediumValue contactMediumValue = customerSV.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.legalAddress));
					if (contactMediumValue != null) {
						result.set(IBOCmCustContactMediumValue.S_AddressDetail, contactMediumValue.getAddressDetail());
					}
				}
			} else if (qryPay) {
				// 设置参与人信息和payer法律地址
				conditionDC.set(IPartyValue.S_PartyId, partyId);
				conditionDC.set(IPartyValue.S_PartyType, partyType);
				IPartyValue[] partyValues = partySV.queryPartys(conditionDC, -1, -1);
				if (partyValues != null && partyValues.length > 0) {
					result.copy(partyValues[0]);
					result.set(IPartyValue.S_PartyType, partyType);
					result.set(IBOCmCustContactMediumValue.S_AddressDetail, partyValues[0].getRemarks());
				}
			}
			if (result != null && StringUtils.isNotBlank(result.getAsString("CERT_CODE"))) {
				result.set("CERT_CODE", maskCustCertCode(partyType, result.getAsString("CERT_CODE")));
			}
		}
		return result;
	}

	public String maskCustCertCode(int custType, String certCode) throws Exception {
		String result = "";
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			if (certCode.length() > 6) {
				StringBuilder sb = new StringBuilder();
				sb.append(certCode.substring(0, 6));
				for (int j = 0; j < certCode.length() - 6; j++) {
					sb.append("*");
				}
				result = sb.toString();
			}
		} else {
			if (!certCode.contains("K")) {
				result = String.valueOf(Long.parseLong(certCode));
			}
		}
		return result;
	}

	public DataContainerInterface queryPersonView(long partyId, long custId, boolean onlyPayer) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap queryParam = new HashMap();
		if (onlyPayer) {
			condition
					.append("SELECT T.CPR_ID AS PNR,T3.GENDER,T3.BIRTHDAY,T.CREATE_DATE,T.PERFER_LANGUAGE,T4.CONT_ADDRESS,T4.REMARKS,T4.EXT1,T4.EXT9,T4.EXT10,T4.CONT_ID FROM {CM_PARTY} T LEFT JOIN {CM_INDIV_PARTY} T3 ON T.PARTY_ID = T3.PARTY_ID,{CM_PARTY_CONTACT} T4 WHERE T.PARTY_ID = T4.PARTY_ID AND NOT EXISTS (SELECT 1 FROM {CM_PARTY_ROLE} T2 WHERE T.PARTY_ID = T2.PARTY_ID AND T2.ROLE_TYPE IN(1,2,3)) AND T.PARTY_ID = :partyId");
		} else {
			condition
					.append("SELECT T.CPR_ID AS PNR,T1.CUST_STATUS,T1.ANONYMOUS_FLAG,T1.GENDER,T1.BIRTHDAY,T1.PHYSIOLOGICAL_STATE,T1.CREATE_DATE,T1.CREDIT_LEVEL,T1.CREDIT_VALUE,T.PERFER_LANGUAGE,T2.EXT28 FROM {CM_PARTY} T,{CM_INDIV_CUSTOMER} T1,{CMX_INDIV_CUSTOMER} T2 WHERE T.PARTY_ID = T1.PARTY_ID AND T1.CUST_ID = T2.CUST_ID AND T.PARTY_ID = :partyId");
		}
		queryParam.put("partyId", partyId);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), queryParam);
		if (values != null && values.length > 0) {
			if (!onlyPayer) {
				// 查询个人法人信息
				DataContainer dc = new DataContainer();
				dc.set("CUST_ID", custId);
				ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
				IContactValue[] contactValues = contactSV.queryCustContacts(dc, -1, -1);
				if (contactValues != null && contactValues.length > 0) {
					values[0].set("LEGAL_GUARDIAN", contactValues[0].getPartyName());
					values[0].set("GUARDIAN_UPDATE_DATE", contactValues[0].getDoneDate());
				}

				// 查询偏好营业厅
				ICmCustPreferenceInfoSV preferenceInfoSV = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
				IBOCmCustPerferInfoValue[] perferInfomationValues = preferenceInfoSV.queryCustPrefer(custId, CmConstants.PreferType.preferredOffice);
				if (perferInfomationValues != null && perferInfomationValues.length > 0) {
					values[0].set("PERFER_SHOP", perferInfomationValues[0].getPreferChannelName());
				}
			}
			return values[0];
		}
		return null;
	}

	public DataContainerInterface queryOrgView(long custId) throws Exception {
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		sql.append("SELECT T1.COMPANY_STATUS,T.CUST_STATUS,T.CUST_CERT_CODE,T.SHORT_NAME,T.DEVELOP_TYPE,T1.LEGAL_FORM,T1.CORPORATE_IDENTIFICATION_NUMBE,T.CREATE_DATE,T.CREDIT_LEVEL,T.CREDIT_VALUE,T2.PERFER_LANGUAGE FROM {CM_GROUP_CUSTOMER} T,{CMX_GROUP_CUSTOMER} T1,{CM_PARTY} T2 WHERE T.CUST_ID = T1.CUST_ID AND T.PARTY_ID = T2.PARTY_ID AND T.CUST_ID = :custId");
		queryParam.put("custId", custId);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values != null && values.length > 0) {
			// 查询偏好营业厅
			ICmCustPreferenceInfoSV preferenceInfoSV = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
			IBOCmCustPerferInfoValue[] perferInfomationValues = preferenceInfoSV.queryCustPrefer(custId, CmConstants.PreferType.preferredOffice);
			if (perferInfomationValues != null && perferInfomationValues.length > 0) {
				values[0].set("PERFER_SHOP", perferInfomationValues[0].getPreferChannelName());
			}
			String certCode = values[0].getAsString(ICustomerValue.S_CustCertCode);
			if (StringUtils.isNotBlank(certCode) && certCode.startsWith("K")) {
				values[0].set("MANUAL_CREATED_FLAG", CmConstants.YesOrNo.YES);
			} else {
				values[0].set("MANUAL_CREATED_FLAG", CmConstants.YesOrNo.NO);
				values[0].set("DEVELOP_TYPE", -1);
			}
			return values[0];
		}
		return null;
	}

	public DataContainerInterface queryPayerView(long partyId, long custId) throws Exception {
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		sql.append("SELECT T.PARTY_TYPE AS CUST_TYPE,T.PARTY_ID,T1.DIRECT_MARKETING_PROTECTION,T1.PROTECT_EFF_DATE,T1.PROTECT_EXPIRE_DATE,T1.MANUAL_COMMERCIAL_PROTECTION,T1.MANUAL_PROTECT_EFFECTIVE_DATE,T1.MANUAL_PROTECT_EXPIRE_DATE,T1.CONT_ID FROM {CM_PARTY} T,{CM_PARTY_CONTACT} T1 WHERE T.PARTY_ID = T1.PARTY_ID AND T.PARTY_ID = :partyId");
		queryParam.put("partyId", partyId);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values != null && values.length > 0) {
			if (custId > 0) {
				ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId, "");
				if (customerValue != null) {
					values[0].set(ICustomerValue.S_CustStatus, customerValue.getCustStatus());
				}
			}
			return values[0];
		}
		return null;
	}

	public DataContainerInterface[] queryUserNumbers(long custId, int start, int end) throws Exception {
		IBOCmInsCmrelValue[] insCmrelValues = queryCmInsCmrel(custId, -1, CmConstants.RelaType.USER, start, end);
		if (insCmrelValues != null && insCmrelValues.length > 0) {
			DataContainerInterface[] result = new DataContainerInterface[insCmrelValues.length];
			ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			for (int i = 0; i < insCmrelValues.length; i++) {
				result[i] = new DataContainer();
				if (insCmrelValues[i].getState() == 0) {// 使用关系失效
					insCmrelValues[i].setExpireDate(insCmrelValues[i].getDoneDate());
				}
				result[i].copy(insCmrelValues[i]);
				CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.USER_ID, String.valueOf(insCmrelValues[i].getUserId()));
				IInsUserValue[] userValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(insCmrelValues[i].getUserId(), OrderConst.VALID_TYPE_NOW);
				if (userValue != null && userValue.length > 0) {
					String state = userValue[0].getState();
					if(StringUtils.isNotBlank(state)) {
						//如果是停机用户，需要更新状态 AI-7714
						IStopOpenOsStatusSV osStatusSV = (IStopOpenOsStatusSV) BceSVUtil.getSVService(IStopOpenOsStatusSV.class);
						String osFlag = osStatusSV.getOsStatusType(insCmrelValues[i].getUserId(), OrderConst.VALID_TYPE_NOW);
						if (RBossConst.OS_STOP.equals(osFlag) && RBossConst.USER_STATE_NORMAL.equals(state)) {
							state = RBossConst.USER_STATE_KEEP_NUM_TIME;
						}
					}
					
					result[i].set("USER_STATE", state);
					result[i].set("BILL_ID", userValue[0].getBillId());
				}else {
					IInsDestroyUserInfoSV insDestroyUserInfoSV=(IInsDestroyUserInfoSV)ServiceFactory.getService(IInsDestroyUserInfoSV.class);
					IBOInsDesUserValue insDesUserValue = insDestroyUserInfoSV.getInsDesUserByUserId(insCmrelValues[i].getUserId());
					if(insDesUserValue!=null) {
						result[i].set("USER_STATE", insDesUserValue.getState());
						result[i].set("BILL_ID", insDesUserValue.getBillId());
					}
				}
			}
			return result;
		}
		return new DataContainerInterface[0];
	}

	public int queryUserNumbersCount(long custId) throws Exception {
		return queryCmInsCmrelCount(custId, -1, CmConstants.RelaType.USER);
	}

	public DataContainerInterface queryEmployeeView(long custId) throws Exception {
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		sql.append("SELECT T.CUST_REL_ID, T.MEMBER_DESC,T.MEMBER_TYPE,T.MEMBER_POSITION FROM {CM_GROUP_MEMBER} T WHERE T.MEMBER_CUST_ID = :custId");
		queryParam.put("custId", custId);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values != null && values.length > 0) {
			DataContainerInterface result = new DataContainer();
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
			if (customerValue != null) {
				result.copy(customerValue);
			}
			result.set("MEMBER_DESC", values[0].get("MEMBER_DESC"));
			result.set("MEMBER_TYPE", values[0].get("MEMBER_TYPE"));
			result.set("MEMBER_POSITION", values[0].get("MEMBER_POSITION"));
			result.set("DEPT_NAME", customerValue.getCustName());
			result.set("CUST_REL_ID", values[0].get("CUST_REL_ID"));
			return result;
		}
		return null;
	}
	
	/**
	 * 
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2020-5-8
	* CmDkCustomerSVImpl
	 */
	public DataContainerInterface queryContacterView(long custId) throws Exception {
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		if(custId>0){
			DataContainerInterface result = new DataContainer();
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
			if (customerValue != null) {
				result.copy(customerValue);
			}
			return result;
		}
		return null;
	}

	public int getInsAccrelsCountByAcct(long acctId, String payerName) throws Exception {
		ICmLnAccountSV accountSV = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		return accountSV.getInsAccrelsCountByAcct(acctId, -1);
	}

	public DataContainerInterface[] getInsAccrelsByAcct(long acctId, String payerName, int startIdx, int endIdx) throws Exception {
		ICmLnAccountSV accountSV = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
		IBOCmInsAccrelValue[] insAccrelValues = accountSV.getInsAccrelsByAcct(acctId, -1, -1, -1);
		if (insAccrelValues != null && insAccrelValues.length > 0) {
			List resultList = new ArrayList();
			DataContainerInterface dci = null;
			IInsCmRelSV crmInsFSV = (IInsCmRelSV) ServiceFactory.getService(IInsCmRelSV.class);
			IInstanceQrySV insSV = InsServiceFactory.getInstanceQueryService();
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			long userId = -1;
			for (int i = 0, len = insAccrelValues.length; i < len; i++) {
				userId = insAccrelValues[i].getUserId();

				// 封装返回对象
				dci = new DataContainer();
				dci.set("PARTY_NAME", payerName);
				dci.set("TYPE", "2");
				// 查询用户客户使用关系
				CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
				IInsCmRelValue[] insCmRelValues = crmInsFSV.queryInsCmRels(userId, -1, -1, CmConstants.CmInsRela.NORMAL);
				if (insCmRelValues != null && insCmRelValues.length > 0) {
					IInsUserValue insValue = insSV.getInstUserByUserId(userId);
					for (int j = 0; j < insCmRelValues.length; j++) {
						ICustomerValue customerValue = customerSV.queryCustomerByCustId(insCmRelValues[j].getCustId(), "");
						dci.set("STATUS", insCmRelValues[j].getExt1());
						if (CmCommonUtil.isNotEmptyObject(insValue)) {
							dci.set("IDENTIFIER", insValue.getBillId());
						}
						// 设置使用者名称和归属者名称
						if (insCmRelValues[j].getRelaType() == CmConstants.RelaType.USER) {
							dci.set("USER_NAME", customerValue.getCustName());
						} else if (insCmRelValues[j].getRelaType() == CmConstants.RelaType.OWNER) {
							dci.set("CUST_NAME", customerValue.getCustName());
						}
					}
				}
				resultList.add(dci);
			}
			if (!resultList.isEmpty()) {
				return (DataContainerInterface[]) resultList.toArray(new DataContainerInterface[0]);
			}
		}
		return null;
	}

	public DataContainerInterface[] queryAcctUserRel(long partyId, int start, int end) throws Exception {
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		sql.append("SELECT T4.IDENTIFIER,T4.PARTY_NAME,T4.CUST_NAME,T4.STATUS FROM(");
		// 查询当前party代付的账户
		sql.append("SELECT T.ACCT_ID AS IDENTIFIER,T2.PARTY_NAME,T3.CUST_NAME,T1.EXT1 AS STATUS FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_PARTY} T2,{CM_INDIV_CUSTOMER} T3 WHERE T.ACCT_ID = T1.ACCT_ID AND T1.REL_CUST_ID = T3.CUST_ID AND T1.STATE = :state AND T1.CUST_TYPE = 1 AND T1.PAY_METHOD = 2 AND T.PARTY_ID = T2.PARTY_ID AND T.PARTY_ID = T3.PARTY_ID AND T.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		sql.append("SELECT T.ACCT_ID AS IDENTIFIER,T2.PARTY_NAME,T3.CUST_NAME,T1.EXT1 AS STATUS FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_PARTY} T2,{CM_GROUP_CUSTOMER} T3 WHERE T.ACCT_ID = T1.ACCT_ID AND T1.REL_CUST_ID = T3.CUST_ID AND T1.STATE = :state AND T1.CUST_TYPE = 3 AND T1.PAY_METHOD = 2 AND T.PARTY_ID = T2.PARTY_ID AND T.PARTY_ID = T3.PARTY_ID AND T.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		// 查询当前party的自有账户
		sql.append("SELECT T.ACCT_ID AS IDENTIFIER,T1.CUST_NAME AS PARTY_NAME,T1.CUST_NAME,T.EXT1 AS STATUS FROM {CM_CUST_ACCT_REL} T,{CM_INDIV_CUSTOMER} T1 WHERE T.REL_CUST_ID = T1.CUST_ID AND T.STATE = :state AND T.CUST_TYPE = 1 AND T.PAY_METHOD = 1 AND T1.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		sql.append("SELECT T.ACCT_ID AS IDENTIFIER,T1.CUST_NAME AS PARTY_NAME,T1.CUST_NAME,T.EXT1 AS STATUS FROM {CM_CUST_ACCT_REL} T,{CM_GROUP_CUSTOMER} T1 WHERE T.REL_CUST_ID = T1.CUST_ID AND T.STATE = :state AND T.CUST_TYPE = 3 AND T.PAY_METHOD = 1 AND T1.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		// 查询给当前party的账户代付的人
		sql.append("SELECT T.ACCT_ID AS IDENTIFIER,T2.PARTY_NAME,T3.CUST_NAME,T1.EXT1 AS STATUS FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_PARTY} T2,{CM_INDIV_CUSTOMER} T3 WHERE T.ACCT_ID = T1.ACCT_ID AND T1.REL_CUST_ID = T3.CUST_ID AND T1.STATE = :state AND T1.CUST_TYPE = 1 AND T1.PAY_METHOD = 2 AND T.PARTY_ID = T2.PARTY_ID AND T.PARTY_ID != T3.PARTY_ID AND T3.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		sql.append("SELECT T.ACCT_ID AS IDENTIFIER,T2.PARTY_NAME,T3.CUST_NAME,T1.EXT1 AS STATUS FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_PARTY} T2,{CM_GROUP_CUSTOMER} T3 WHERE T.ACCT_ID = T1.ACCT_ID AND T1.REL_CUST_ID = T3.CUST_ID AND T1.STATE = :state AND T1.CUST_TYPE = 3 AND T1.PAY_METHOD = 2 AND T.PARTY_ID = T2.PARTY_ID AND T.PARTY_ID != T3.PARTY_ID AND T3.PARTY_ID = :partyId ");
		sql.append(" )T4");
		if (start > 0 && end > 0) {
			sql.append(" LIMIT ").append(start - 1).append(",").append(end - start + 1);
		}
		queryParam.put("partyId", partyId);
		queryParam.put("state", CmConstants.RecordState.USE);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values != null && values.length > 0) {
			String tempUrl = "";
			for (int i = 0; i < values.length; i++) {
				values[i].set("REMARKS", values[i].getAsLong("IDENTIFIER"));
				// 给identifier全部塞超链接
				tempUrl = "<a href='javascript:void(0)' class='cellpath' onclick='showAcctInfo(\"" + values[i].getAsLong("IDENTIFIER")
						+ "\")' style='color:blue;text-decoration:underline'>" + values[i].getAsLong("IDENTIFIER") + "</a>";
				values[i].set("IDENTIFIER", tempUrl);
				values[i].set("TYPE", "1");
			}
			return values;
		}
		return new DataContainerInterface[0];
	}

	public int queryAcctUserRelCount(long partyId) throws Exception {
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		sql.append("SELECT SUM(TEMP_COUNT) AS RESULT FROM (");
		sql.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_PARTY} T2,{CM_INDIV_CUSTOMER} T3 WHERE T.ACCT_ID = T1.ACCT_ID AND T1.REL_CUST_ID = T3.CUST_ID AND T1.STATE = :state AND T1.CUST_TYPE = 1 AND T1.PAY_METHOD = 2 AND T.PARTY_ID = T2.PARTY_ID AND T.PARTY_ID = T3.PARTY_ID AND T.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		sql.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_PARTY} T2,{CM_GROUP_CUSTOMER} T3 WHERE T.ACCT_ID = T1.ACCT_ID AND T1.REL_CUST_ID = T3.CUST_ID AND T1.STATE = :state AND T1.CUST_TYPE = 3 AND T1.PAY_METHOD = 2 AND T.PARTY_ID = T2.PARTY_ID AND T.PARTY_ID = T3.PARTY_ID AND T.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		// 查询当前party的自有账户
		sql.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_CUST_ACCT_REL} T,{CM_INDIV_CUSTOMER} T1 WHERE T.REL_CUST_ID = T1.CUST_ID AND T.STATE = :state AND T.CUST_TYPE = 1 AND T.PAY_METHOD = 1 AND T1.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		sql.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_CUST_ACCT_REL} T,{CM_GROUP_CUSTOMER} T1 WHERE T.REL_CUST_ID = T1.CUST_ID AND T.STATE = :state AND T.CUST_TYPE = 3 AND T.PAY_METHOD = 1 AND T1.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		// 查询给当前party的账户代付的人
		sql.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_PARTY} T2,{CM_INDIV_CUSTOMER} T3 WHERE T.ACCT_ID = T1.ACCT_ID AND T1.REL_CUST_ID = T3.CUST_ID AND T1.STATE = :state AND T1.CUST_TYPE = 1 AND T1.PAY_METHOD = 2 AND T.PARTY_ID = T2.PARTY_ID AND T.PARTY_ID != T3.PARTY_ID AND T3.PARTY_ID = :partyId ");
		sql.append("UNION ALL ");
		sql.append("SELECT COUNT(*) AS TEMP_COUNT FROM {CM_PARTY_ACCT_REL} T,{CM_CUST_ACCT_REL} T1,{CM_PARTY} T2,{CM_GROUP_CUSTOMER} T3 WHERE T.ACCT_ID = T1.ACCT_ID AND T1.REL_CUST_ID = T3.CUST_ID AND T1.STATE = :state AND T1.CUST_TYPE = 3 AND T1.PAY_METHOD = 2 AND T.PARTY_ID = T2.PARTY_ID AND T.PARTY_ID != T3.PARTY_ID AND T3.PARTY_ID = :partyId )T4");
		queryParam.put("partyId", partyId);
		queryParam.put("state", CmConstants.RecordState.USE);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values != null && values.length > 0) {
			return values[0].getAsInt("RESULT");
		}
		return 0;
	}

	public boolean validateCustomerName(long custId, String custName) throws Exception {
		if (custId > 0 && StringUtils.isNotBlank(custName)) {
			StringBuilder sql = new StringBuilder();
			HashMap queryParam = new HashMap();
			int custType = CmCommonUtil.getCustType(custId);
			if (custType == CmConstants.CustomerType.INDIVIDUAL) {
				sql.append("SELECT T.CUST_ID FROM {CM_INDIV_CUSTOMER} T WHERE T.CUST_ID = :custId AND T.CUST_NAME LIKE :custName ");
			} else {
				sql.append("SELECT T.CUST_ID FROM {CM_GROUP_CUSTOMER} T WHERE T.CUST_ID = :custId AND T.CUST_NAME LIKE :custName ");
			}
			queryParam.put("custId", custId);
			queryParam.put("custName", "%" + custName + "%");
			DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
			if (values != null && values.length > 0) {
				return true;
			}
		}
		return false;
	}

	public IQBOCmPayerInfoValue queryPayerInfo(String cpr) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1").append(" and ").append(IQBOCmPayerInfoValue.S_CertCode).append("=:certCode");
		Map parameter = new HashMap();
		parameter.put("certCode", cpr);
		// SQL优化
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), parameter, -1, -1);
		IQBOCmPayerInfoValue[] payerInfoValues = (IQBOCmPayerInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPayerInfoBean.class, sql, parameter);
		if (payerInfoValues != null && payerInfoValues.length > 0) {
			ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRoleByPartyId(payerInfoValues[0].getPartyId());
			if (roleValues != null && roleValues.length == 1 && roleValues[0].getRoleType() == CmConstants.roleType.payer) {
				return payerInfoValues[0];
			}
		}
		return null;
	}

	public IQBOCmPayerInfoValue[] queryPayerByAddress(long[] addressIds, String custName) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append("1=1");
		if (StringUtils.isNotBlank(custName)) {
			condition.append(" AND ").append(IQBOCmPayerInfoValue.S_PartyName).append(" = :custName ");
			paraMap.put("custName", custName);
		}
		if (addressIds != null && addressIds.length > 0) {
			condition.append(" AND ").append(IQBOCmPayerInfoValue.S_ContAddress).append(" IN(");
			for (int i = 0; i < addressIds.length; i++) {
				if (i > 0) {
					condition.append(",");
				}
				condition.append(addressIds[i]);
			}
			condition.append(")");
		}
		condition.append(" AND A.STATE ").append(" =:state ");
		paraMap.put("state", CmConstants.RecordState.USE);
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), paraMap, -1, -1);
		IQBOCmPayerInfoValue[] results = (IQBOCmPayerInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPayerInfoBean.class, sql, paraMap);
		if (results != null && results.length > 0) {
			ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			List<IQBOCmPayerInfoValue> list = new ArrayList<>();
			for (IQBOCmPayerInfoValue result : results) {
				IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRoleByPartyId(result.getPartyId());
				if (roleValues != null && roleValues.length > 0) {
					for (IBOCmPartyRoleValue roleValue : roleValues) {
						if (roleValue.getRoleType() == CmConstants.roleType.payer) {
							list.add(result);
							break;
						}
					}
				}
			}
			if (CollectionUtils.isNotEmpty(list)) {
				return list.toArray(new IQBOCmPayerInfoValue[0]);
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV#queryGroupDeptUserForFY(long, int, int)
	 */
	public IBOCmInsCmrelValue[] queryGroupDeptUserForFY(long custId, int startNum, int endNum) throws Exception {
		// 查询出custId对应的号码归属者
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relaType ");
		parameter.put("relaType", CmConstants.RelaType.OWNER);
		// 用户状态1,4,8表示正常
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_Ext1).append(" IN ('1','4','8') ");
		// 6表示虚用户
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserType).append(" !=6 ");

		IBOCmInsCmrelValue[] values = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, startNum,
				endNum);
		if (values != null && values.length > 0) {
			return values;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV#queryGroupDeptUserForFYCount(long)
	 */
	public int queryGroupDeptUserForFYCount(long custId) throws Exception {
		int count = 0;
		// 查询出custId对应的号码归属者
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relaType ");
		parameter.put("relaType", CmConstants.RelaType.OWNER);
		// 用户状态1,4,8表示正常
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_Ext1).append(" IN ('1','4','8') ");
		// 6表示虚用户
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserType).append(" !=6 ");

		count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmInsCmrelBean.class, condition.toString(), parameter);

		return count;
	}

	public DataContainerInterface queryOrgViewAndLog(long custId) throws Exception {
		StringBuilder sql = new StringBuilder();
		HashMap queryParam = new HashMap();
		sql.append("SELECT T1.COMPANY_STATUS,T.CUST_STATUS,T.CUST_CERT_CODE,T.SHORT_NAME,T.DEVELOP_TYPE,T1.LEGAL_FORM,T1.CORPORATE_IDENTIFICATION_NUMBE,T.CREATE_DATE,T.CREDIT_LEVEL,T.CREDIT_VALUE,T2.PERFER_LANGUAGE FROM {CM_GROUP_CUSTOMER} T,{CMX_GROUP_CUSTOMER} T1,{CM_PARTY} T2 WHERE T.CUST_ID = T1.CUST_ID AND T.PARTY_ID = T2.PARTY_ID AND T.CUST_ID = :custId");
		queryParam.put("custId", custId);
		// 保存查询记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.CUST_QRY, CmConstants.BusiLogType.PARTY_LOG, custId, CmConstants.BusiLogOperType.QUERY, sql.toString(), queryParam, methodDetail);

		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), queryParam);
		if (values != null && values.length > 0) {
			// 查询偏好营业厅
			ICmCustPreferenceInfoSV preferenceInfoSV = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
			IBOCmCustPerferInfoValue[] perferInfomationValues = preferenceInfoSV.queryCustPrefer(custId, CmConstants.PreferType.preferredOffice);
			if (perferInfomationValues != null && perferInfomationValues.length > 0) {
				values[0].set("PERFER_SHOP", perferInfomationValues[0].getPreferChannelName());
			}
			String certCode = values[0].getAsString(ICustomerValue.S_CustCertCode);
			if (StringUtils.isNotBlank(certCode) && certCode.startsWith("K")) {
				values[0].set("MANUAL_CREATED_FLAG", CmConstants.YesOrNo.YES);
			} else {
				values[0].set("MANUAL_CREATED_FLAG", CmConstants.YesOrNo.NO);
				values[0].set("DEVELOP_TYPE", -1);
			}
			return values[0];
		}
		return null;
	}

	public DataContainerInterface queryPersonViewAndLog(long partyId, long custId, boolean onlyPayer) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap queryParam = new HashMap();
		if (onlyPayer) {
			condition
					.append("SELECT T.CPR_ID AS PNR,T3.GENDER,T3.BIRTHDAY,T.CREATE_DATE,T.PERFER_LANGUAGE,T4.CONT_ADDRESS,T4.REMARKS,T4.EXT1,T4.EXT9,T4.EXT10,T4.CONT_ID FROM {CM_PARTY} T LEFT JOIN {CM_INDIV_PARTY} T3 ON T.PARTY_ID = T3.PARTY_ID,{CM_PARTY_CONTACT} T4 WHERE T.PARTY_ID = T4.PARTY_ID AND NOT EXISTS (SELECT 1 FROM {CM_PARTY_ROLE} T2 WHERE T.PARTY_ID = T2.PARTY_ID AND T2.ROLE_TYPE IN(1,2,3)) AND T.PARTY_ID = :partyId");
		} else {
			condition
					.append("SELECT T.CPR_ID AS PNR,T1.CUST_STATUS,T1.ANONYMOUS_FLAG,T1.GENDER,T1.BIRTHDAY,T1.PHYSIOLOGICAL_STATE,T1.CREATE_DATE,T1.CREDIT_LEVEL,T1.CREDIT_VALUE,T.PERFER_LANGUAGE,T2.EXT28 FROM {CM_PARTY} T,{CM_INDIV_CUSTOMER} T1,{CMX_INDIV_CUSTOMER} T2 WHERE T.PARTY_ID = T1.PARTY_ID AND T1.CUST_ID = T2.CUST_ID AND T.PARTY_ID = :partyId");
		}
		queryParam.put("partyId", partyId);
		// 保存查询记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.CUST_QRY, CmConstants.BusiLogType.PARTY_LOG, -1, CmConstants.BusiLogOperType.QUERY, condition.toString(), queryParam,
				methodDetail);

		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), queryParam);
		if (values != null && values.length > 0) {
			if (!onlyPayer) {
				// 查询个人法人信息
				DataContainer dc = new DataContainer();
				dc.set("CUST_ID", custId);
				ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
				IContactValue[] contactValues = contactSV.queryCustContacts(dc, -1, -1);
				//345&346
				if (contactValues != null && contactValues.length > 0 && contactValues[0].getContExpireDate().after(new Date())) {
					values[0].set("LEGAL_GUARDIAN", contactValues[0].getContName());
					values[0].set("GUARDIAN_UPDATE_DATE", contactValues[0].getContDoneDate());
				}
				// 查询偏好营业厅
				ICmCustPreferenceInfoSV preferenceInfoSV = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
				IBOCmCustPerferInfoValue[] perferInfomationValues = preferenceInfoSV.queryCustPrefer(custId, CmConstants.PreferType.preferredOffice);
				if (perferInfomationValues != null && perferInfomationValues.length > 0) {
					values[0].set("PERFER_SHOP", perferInfomationValues[0].getPreferChannelName());
				}
			}
			return values[0];
		}
		return null;
	}
	
	public IVOCustValue queryIndivCustomerDtlById(long custId, String cprId) throws Exception {
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		ICmCustPreferenceInfoSV preferenceInfoSV = (ICmCustPreferenceInfoSV) ServiceFactory.getService(ICmCustPreferenceInfoSV.class);
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		IVOCustValue voCustValue = new VOCustBean();
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" SELECT T1.*,T2.*,T3.*,T4.*,T5.`REQUEST_STATUS`,T5.`STATUS_DATE` FROM ");
		condition.append(" {CM_INDIV_CUSTOMER} T1 ");
		condition.append(" LEFT JOIN {CMX_INDIV_CUSTOMER} T2 ");
		condition.append(" ON T1.CUST_ID=T2.CUST_ID ");
		condition.append(" LEFT JOIN {CM_PARTY} T3 ");
		condition.append(" ON T1.PARTY_ID=T3.PARTY_ID ");
		condition.append(" LEFT JOIN {CM_CUST_CONTACT_MEDIUM} T4 ");
		condition.append(" ON T1.CUST_ID = T4.CUST_ID ");
		condition.append(" AND T4.CONT_MED_TYPE_ID = 11");
		condition.append(" LEFT JOIN {CM_CUST_REQUEST_TASK} T5");
		condition.append(" ON T1.CUST_ID=T5.CUST_ID WHERE 1=1");
		ICustomerValue custValue = null;
		// 根据客户编号和cpr查询客户信息
		if (custId > 0 || StringUtils.isNotBlank(cprId)) {
			// 针对客户编号不为空
			if (custId > 0) {
				condition.append(" AND T1.CUST_ID=:custId ");
				parameter.put("custId", custId);
			}
			// 针对cpr不为空
			if (StringUtils.isNotBlank(cprId)) {
				condition.append(" AND T3.CPR_ID=:cprId ");
				parameter.put("cprId", cprId);
			}
		}
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			custValue = new CustomerBean();
			custValue.copy(dcs[0]);
			if (custId <= 0) {
				custId = custValue.getCustId();
			}
			// 查询出custType塞进去
			custValue.initProperty("CUST_TYPE", commonSV.getCustType(custId));
			// 将客户信息塞入vocustValue
			voCustValue.setCustomer(custValue);
			// 设置客户的营销受保护,以人工设置到为准
			if (custValue.getManualProtectEffectiveDate() == null && custValue.getManualProtectExpireDate() == null) {
				custValue.setManualCommercialProtection(custValue.getDirectMarketingProtection());
				custValue.setManualProtectEffectiveDate(custValue.getProtectEffDate());
				custValue.setManualProtectExpireDate(custValue.getProtectExpireDate());
			}
			// 设置客户监护人信息
			ICmContactSV contactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
			DataContainer conditionDC = new DataContainer();
			conditionDC.set(IContactValue.S_CustId, custId);
			IContactValue[] contactValues = contactSV.queryCustContacts(conditionDC, -1, -1);
			if (contactValues != null && contactValues.length > 0) {
				custValue.setGuardianName(contactValues[0].getContName());
				custValue.setGuardianDate(contactValues[0].getContDoneDate());
			}
			// 设置CPR信息
			custValue.setCprStatus(DataType.getAsString(dcs[0].get("REQUEST_STATUS")));
			custValue.setCprStatusDate(DataType.getAsDateTime(dcs[0].get("STATUS_DATE")));
			// 客户偏好营业厅
			IBOCmCustPerferInfomationValue[] custPreferences = preferenceInfoSV.queryCustPreferInforDeal(custId, -1, -1);
			if (custPreferences != null && custPreferences.length > 0) {
				for (int i = 0; i < custPreferences.length; i++) {
					if (custPreferences[i].getPerferType() == CmConstants.PreferType.preferredOffice) {
						custValue.setPreferStore(custPreferences[i].getPreferChannelName());
						break;
					}
				}
			}
			// 客户多认证
			IBOIdentificationValue[] identificationValues = queryCustIdentifications(voCustValue.getCustomer().getPartyId(), -1, null);
			voCustValue.addCustIdentification(identificationValues);
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
			IQBOCmCustContMediumAndTypeValue[] custAddress = customerSV.queryCustContactMediums(custId, CmConstants.AddressId.legalAddress, CmConstants.ContMedium.ENTITY_ADDR, -1,
					-1);
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
					addr = addressSV.getAddress(addrId, CmConstants.AddressDistrictId.DISTRICT_ID);
					voCustAddressValue.addAddress(addr);
					contMedium = new BOCmCustContactMediumBean();
					contMedium.copy(custAddress[i]);
					voCustAddressValue.addContMedium(contMedium);
					custAddrList.add(voCustAddressValue);
					// 如果法律地址受保护，则设置客户为受保护
					if (custValue != null && custAddress[i].getContMedTypeId() == CmConstants.AddressId.legalAddress) {
						custValue.setIsProtected(custAddress[i].getIsProtected());
					}
				}
			}
			if (custAddrList != null && !custAddrList.isEmpty()) {
				voCustValue.addCustAddress((IVOCustAddressValue[]) custAddrList.toArray(new IVOCustAddressValue[0]));
			}
			return voCustValue;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		System.setProperty("tenant.id", "21");
		UserInfoInterface user;
		try {
			user = ServiceManager.getNewBlankUserInfo();
			user.setCode("21wangwy");
			user.setName("21wangwy");	
			user.setID(410001030L);
			user.setTenantId("21");
			user.set(RBossConst.PUBINFO_CHANNEL_TYPE, "10006");
			user.set(OrgModelConstants.REGION_ID, "2106");
			user.set(OrgModelConstants.DISTRICT_ID, "1005050");
			user.setOrgId(21000000L);
			ServiceManager.setServiceUserInfo(user);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 ICmDkCustomerSV custGroupOutSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			try {
				custGroupOutSV.queryPartyInfo("110003335093");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public int queryPartyByPartyNameCount(String partName) throws Exception{
		
		Map parameter = new HashMap();
		StringBuilder condition = new StringBuilder();
		
		condition.append(" select count(*)as result");
		condition.append(" FROM {CM_PARTY} a ");
		condition.append(" LEFT JOIN {CM_PARTY_CONTACT} b ");
		condition.append(" ON a.PARTY_ID=b.PARTY_ID ");
		// 根据partyId查询信息
		if (StringUtils.isNotBlank(partName)) {
			condition.append(" where CONCAT(a.first_name,' ',a.last_name) =:partName ");
			parameter.put("partName", partName);
		}
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		//add addressInfo and contactInfo to VOParty
		if (dcs != null && dcs.length > 0) {
			return dcs[0].getAsInt("RESULT");
		}
		return 0;
	}

}
