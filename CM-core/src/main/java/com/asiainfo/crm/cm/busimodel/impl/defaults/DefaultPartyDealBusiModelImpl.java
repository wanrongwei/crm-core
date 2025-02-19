package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.bill.teaminvoke.out.interfaces.IInterfaceBillCrmSV;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IPartyValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmContactContMediumInfoValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmIndivPartyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;

public class DefaultPartyDealBusiModelImpl extends AbstractPartyDealBusiModelImpl {

	private static final Log log = LogFactory.getLog(DefaultPartyDealBusiModelImpl.class);

	protected void dealOther(IVOPartyValue partyValue) throws Exception {

	}

	protected void notify(IVOPartyValue partyValue) throws Exception {
		long partyId=partyValue.getPartyId();
		if(partyId<0){
			if(partyValue.hasPartyContacts()){
				partyId=partyValue.getPartyContacts()[0].getPartyId();
			}
		}
		//如果传了联系信息需要查询出party信息
		ICmPartySV partySV=(ICmPartySV)ServiceFactory.getService(ICmPartySV.class);
		if(CmCommonUtil.isEmptyObject(partyValue.getParty())){
			partyValue.setParty(partySV.queryPartyById(partyId));
		}
		//根据partyId查询角色是否是payer发生变化
		ICmPartyRoleSV partyRoleSV=(ICmPartyRoleSV)ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] partyRoleValue=partyRoleSV.queryPartyRole(partyId, 5, -1, -1);
		//根据partyId查询账户id
		ICmAccountSV accountSV=(ICmAccountSV)ServiceFactory.getService(ICmAccountSV.class);
		IBOCMPartyAcctRelValue[] partyAcctRelValue=accountSV.queryPartyAccRel(-1, partyId);
		long acctId=-1;
		if(partyAcctRelValue!=null&&partyAcctRelValue.length>0){
		
			acctId=partyAcctRelValue[0].getAcctId();
		}
		
		// 只有地址变化才送billing
		if (partyValue.hasPartyContacts()) {
			Object odlContactId = partyValue.getPartyContacts()[0].getOldObj(IPartyContactValue.S_ContAddress);
			String newContactId = partyValue.getPartyContacts()[0].getContAddress();
			Object oldPartyName = null;
			String partyName = null;
			if (partyValue.getParty() != null) {
				oldPartyName = partyValue.getParty().getOldObj(IPartyValue.S_PartyName);
				partyName = partyValue.getParty().getPartyName();
			}
			if ((odlContactId != null && !odlContactId.equals(newContactId)) || (newContactId != null && !newContactId.equals(odlContactId))) {
				//payer地址变化单独送billing走I_payer
				if(partyRoleValue!=null&&partyRoleValue.length>0){
					if(acctId==-1){
						//自有账户不送i_payer
						return;
					}
					List addressList =new ArrayList();
					Map temp0=new HashMap();
					temp0.put("PAYER_ID", partyId);
					temp0.put("PAYER_TYPE", partyValue.getParty().getPartyType());
					//地址变化不管名称生日是否变化都要送i_payer
					if(partyValue.getParty().getPartyType()==1){
						temp0.put("FAMILY_NAMES", partyValue.getParty().getLastName());
						temp0.put("MIDDLE_NAMES", partyValue.getParty().getFirstName());
					}else{
						temp0.put("FAMILY_NAMES", partyValue.getParty().getPartyName());
						temp0.put("MIDDLE_NAMES", "");
					}
					temp0.put("BIRTHDAY", partyValue.getParty().getBirthday());
					temp0.put("ADDRESS_ID",  partyValue.getPartyContacts()[0].getContAddress());
					temp0.put("VALID_DATE", ServiceManager.getOpDateTime());
					temp0.put("COMMIT_DATE", ServiceManager.getOpDateTime());
					temp0.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
					temp0.put("TENANT_ID", TenantIDFactory.getTenantId());
					temp0.put("ACCT_ID",acctId);
					temp0.put("OP_ID",ServiceManager.getUser().getID());
					temp0.put("ORG_ID",ServiceManager.getUser().getOrgId());

					try {
						if (partyValue.getParty().getBirthday() == null) {
							temp0.put("BIRTHDAY", getIndivPartyBirthday(partyValue.getParty()));
						}

						temp0.put("ADDRESS",  partyValue.getPartyContacts()[0].getRemarks());
/*						IBOCmPartyContactValue[] emailContactValue = partySV.queryPartyContact(partyId);
						if (null != emailContactValue && emailContactValue.length > 0) {
							//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL
							ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
							IQBOCmContactContMediumInfoValue[] emailContMediums = cmCustomerSV.queryContactContMediumInfoByContId(emailContactValue[0].getContId(), 201, -1, -1);
							if (null != emailContMediums && emailContMediums.length > 0) {
								temp0.put("PAYER_EMAIL", emailContMediums[0].getEmailAddress());
							}

							//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL
							IQBOCmContactContMediumInfoValue[] phonenumContMediums = cmCustomerSV.queryContactContMediumInfoByContId(emailContactValue[0].getContId(), 301, -1, -1);
							if (null != phonenumContMediums && phonenumContMediums.length > 0) {
								temp0.put("PHONE_NUMBER", phonenumContMediums[0].getContNumber());
							}
						}*/
					} catch (Exception e) {
						log.error("deal party contact error.", e);
					}

					if(partyValue.getParty().getPartyType()==1){
						//个人为cpr
						temp0.put("TAX_NO", partyValue.getParty().getCertCode());
					}else{
						//根据partyId查询payer对应账户拥有者的客户的税号
						String taxId="";
						String sql="SELECT * FROM {CM_PARTY_ACCT_REL} T,{CM_GROUP_CUSTOMER} K,{CMX_GROUP_CUSTOMER} M WHERE T.PARTY_ID=K.PARTY_ID AND K.CUST_ID=M.CUST_ID and T.PARTY_ID=:partyId";
						Map parameter=new HashMap();
						parameter.put("partyId", partyId);
						DataContainer dc[]=(DataContainer[])CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
						if(dc!=null&&dc.length>0){
							taxId=dc[0].getAsString("TAX_ID");
						}
						//集团为税号
						temp0.put("TAX_NO", taxId);
						if("1".equals(partyValue.getUserObject("TAX_FLAG"))){
							temp0.put("TAX_NO",partyValue.getUserObject("TAX_ID"));
						}
					}
					//
					temp0.put("OPER_TYPE", 2);
					addressList.add(temp0);
					Map result1=new HashMap();
					result1.put("I_PAYER", addressList);
					IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);	
					interfaceBillCrmSV.sendMapOrderInfoToBilling(result1);
				}
			}else{
				//地址没有发生变化
				if(partyRoleValue!=null&&partyRoleValue.length>0){
					//判断payer名称生日地址是否发生变化
					if(acctId==-1){
						//自有账户不送i_payer
						return;
					}
					com.asiainfo.crm.cm.model.ivalues.IPartyValue pvalue=partyValue.getParty();
					Object oldCertCode=pvalue.getOldObj(com.asiainfo.crm.cm.model.ivalues.IPartyValue.S_CertCode);
					Object newCertCode=pvalue.getCertCode();
					
					Object oldFirstName = partyValue.getParty().getOldObj(IPartyValue.S_FirstName);
					String firstName = partyValue.getParty().getFirstName();
					
					Object oldLastName = partyValue.getParty().getOldObj(IPartyValue.S_LastName);
					String lastName = partyValue.getParty().getLastName();
					
					//只有地址、姓名修改才送i_payer
					if((oldPartyName != null && !oldPartyName.equals(partyName)) || (partyName != null && !partyName.equals(oldPartyName))
						 || (oldFirstName != null && !oldFirstName.equals(firstName)) || (firstName != null && !firstName.equals(oldFirstName))
						 || (oldLastName != null && !oldLastName.equals(lastName)) || (lastName != null && !lastName.equals(oldLastName))
						 || (oldCertCode != null && !oldCertCode.equals(newCertCode)) || (newCertCode != null && !newCertCode.equals(oldCertCode))){
						List addressList =new ArrayList();
						Map temp0=new HashMap();
						temp0.put("PAYER_ID", partyValue.getPartyId());
						temp0.put("PAYER_TYPE", partyValue.getParty().getPartyType());
						//地址变化不管名称生日是否变化都要送i_payer
						if(partyValue.getParty().getPartyType()==1){
							temp0.put("FAMILY_NAMES", partyValue.getParty().getLastName());
							temp0.put("MIDDLE_NAMES", partyValue.getParty().getFirstName());
						}else{
							temp0.put("FAMILY_NAMES", partyValue.getParty().getPartyName());
							temp0.put("MIDDLE_NAMES", "");
						}
						
						temp0.put("BIRTHDAY", partyValue.getParty().getBirthday());
						temp0.put("VALID_DATE", ServiceManager.getOpDateTime());
						temp0.put("COMMIT_DATE", ServiceManager.getOpDateTime());
						temp0.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
						temp0.put("TENANT_ID", TenantIDFactory.getTenantId());
						temp0.put("ACCT_ID",acctId);

						try {
							if (partyValue.getParty().getBirthday() == null) {
								temp0.put("BIRTHDAY", getIndivPartyBirthday(partyValue.getParty()));
							}

							temp0.put("ADDRESS_ID", partyValue.getPartyContacts()[0].getContAddress());
							temp0.put("ADDRESS", partyValue.getPartyContacts()[0].getRemarks());
/*							IBOCmPartyContactValue[] emailContactValue = partySV.queryPartyContact(partyId);
							if (null != emailContactValue && emailContactValue.length > 0) {
								//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL
								ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
								IQBOCmContactContMediumInfoValue[] emailContMediums = cmCustomerSV.queryContactContMediumInfoByContId(emailContactValue[0].getContId(), 201, -1, -1);
								if (null != emailContMediums && emailContMediums.length > 0) {
									temp0.put("PAYER_EMAIL", emailContMediums[0].getEmailAddress());
								}

								//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL
								IQBOCmContactContMediumInfoValue[] phonenumContMediums = cmCustomerSV.queryContactContMediumInfoByContId(emailContactValue[0].getContId(), 301, -1, -1);
								if (null != phonenumContMediums && phonenumContMediums.length > 0) {
									temp0.put("PHONE_NUMBER", phonenumContMediums[0].getContNumber());
								}
							}*/
						} catch (Exception e) {
							log.error("deal party contact error.", e);
						}

						if(partyValue.getParty().getPartyType()==1){
							//个人为cpr
							temp0.put("TAX_NO", partyValue.getParty().getCertCode());
							
						}else{
							//集团为税号
							//根据partyId查询payer对应账户拥有者的客户的税号
							String taxId="";
							String sql="SELECT * FROM {CM_PARTY_ACCT_REL} T,{CM_GROUP_CUSTOMER} K,{CMX_GROUP_CUSTOMER} M WHERE T.PARTY_ID=K.PARTY_ID AND K.CUST_ID=M.CUST_ID and T.PARTY_ID=:partyId";
							Map parameter=new HashMap();
							parameter.put("partyId", partyId);
							DataContainer dc[]=(DataContainer[])CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
							if(dc!=null&&dc.length>0){
								taxId=dc[0].getAsString("TAX_ID");
							}
							temp0.put("TAX_NO", taxId);
							if("1".equals(partyValue.getUserObject("TAX_FLAG"))){
								temp0.put("TAX_NO",partyValue.getUserObject("TAX_ID"));
							}
						}
						temp0.put("OPER_TYPE", 2);
						temp0.put("OP_ID",ServiceManager.getUser().getID());
						temp0.put("ORG_ID",ServiceManager.getUser().getOrgId());
						addressList.add(temp0);
						Map result1=new HashMap();
						result1.put("I_PAYER", addressList);
						IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);	
						interfaceBillCrmSV.sendMapOrderInfoToBilling(result1);
						
					}
				}
			}
				//保留原先逻辑不
			if ((odlContactId != null && !odlContactId.equals(newContactId)) || (newContactId != null && !newContactId.equals(odlContactId)) || (partyName != null && oldPartyName != null && !partyName.equals(oldPartyName))) {
				// 早期地址送billing走map接口不变
				List addressList = new ArrayList();
				Map temp0 = new HashMap();
				temp0.put("CONTACT_TYPE", 5);
				temp0.put("DONE_CODE", ServiceManager.getDoneCode());
				temp0.put("OPER_TYPE", 2);
				if (partyValue.getPartyContacts()[0].isNew()) {
					temp0.put("VALID_DATE", ServiceManager.getOpDateTime());
					temp0.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
				} else {
					if (partyValue.getPartyContacts()[0].getEffectiveDate() != null && partyValue.getPartyContacts()[0].getExpireDate() != null) {
						temp0.put("VALID_DATE", partyValue.getPartyContacts()[0].getEffectiveDate());
						temp0.put("EXPIRE_DATE", partyValue.getPartyContacts()[0].getExpireDate());
					} else {
						ICmPartySV sv = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
						IBOCmPartyContactValue[] vals = sv.queryPartyContact(partyValue.getPartyContacts()[0].getPartyId());
						if (vals != null && vals.length > 0) {
							if (vals[0].getEffectiveDate() == null) {
								temp0.put("VALID_DATE", ServiceManager.getOpDateTime());
							} else {
								temp0.put("VALID_DATE", vals[0].getEffectiveDate());
							}

							if (vals[0].getExpireDate() == null) {
								temp0.put("VALID_DATE", TimeUtil.getMaxExpire());
							} else {
								temp0.put("VALID_DATE", vals[0].getEffectiveDate());
							}
						}
					}
				}
				temp0.put("ADDRESS_ID", partyValue.getPartyContacts()[0].getContAddress());
				temp0.put("ADDRESS", partyValue.getPartyContacts()[0].getRemarks());
				temp0.put("PARTY_ID", partyValue.getPartyContacts()[0].getPartyId());
				temp0.put("CONTACT_NAME", partyName);
				addressList.add(temp0);
				Map result = new HashMap();
				result.put("I_CONTACT", addressList);
				IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
				interfaceBillCrmSV.sendMapOrderInfoToBilling(result);
				}
				
			}
		}

	private Timestamp getIndivPartyBirthday(com.asiainfo.crm.cm.model.ivalues.IPartyValue party) {
		Timestamp birthday = null;
		try {
			StringBuffer condition = new StringBuffer(" 1=1 ");
			HashMap parameter = new HashMap();
			if (1 == party.getPartyType()) {
				condition.append(" AND ").append(IBOCmIndivPartyValue.S_PartyId).append(" =:partyId ");
				parameter.put("partyId", party.getPartyId());
				IBOCmIndivPartyValue[] values = (IBOCmIndivPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivPartyBean.class, condition.toString(), parameter, -1, -1);
				if (values != null && values.length > 0) {
					birthday = values[0].getBirthday();
				}
			}
		} catch (Exception ignored) {

		}
		return birthday;
	}

	protected void processAfterDeal(IVOPartyValue partyValue) throws Exception {
		ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRole(partyValue.getPartyId(), CmConstants.PartyRoleType.CUSTOMER, -1, -1);
		if (partyRoles != null && partyRoles.length > 1) {
			BOCmPartyRoleBean partyRoleBean = null;
			for (int i = 1; i < partyRoles.length; i++) {
				partyRoleBean = new BOCmPartyRoleBean();
				partyRoleBean.copy(partyRoles[i]);
				partyRoleBean.delete();
				partyRoleSV.savePartyRole(partyRoleBean);
			}
		}
	}

	protected void processBeforeDeal(IVOPartyValue partyValue) throws Exception {
		// TODO Auto-generated method stub

	}

}
