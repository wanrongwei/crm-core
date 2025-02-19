package com.asiainfo.crm.cm.hu.busimodel.impl.customer;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOIdentificationBean;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.hu.customer.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV;

public class CmHuCustDealBusiModelImpl extends AbstractCustomerDealBusiModelImpl {

	protected void dealOtherThings(IVOCustValue custValue) throws Exception {
		// 处理扩展信息
		dealCmCustomerKz(custValue);
		// 处理细分信息
		dealCmCustSegment(custValue);
	}

	public String getCustServiceId(ICustomerValue customerValue) throws Exception {
		return null;
	}

	protected void processAfterDeal(IVOCustValue custValue) throws Exception {

	}

	protected void processBeforeDeal(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if(null!=customerValue){
			IVOPartyValue voParty = custValue.getParty();
			if (voParty == null) {
				voParty = new VOPartyBean();
			}
			IPartyValue partyValue = voParty.getParty();
			if (partyValue == null) {
				partyValue = new PartyBean();
				partyValue.copy(customerValue);
			}
			// 将客户上的个别字段拷贝到indivParty中
			IBOCmxIndivCustomerValue cmxIndivValue = (IBOCmxIndivCustomerValue) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
			if (null != cmxIndivValue) {
				if(StringUtils.isNotBlank(cmxIndivValue.getExt14())){
					partyValue.setTitle(Integer.parseInt(cmxIndivValue.getExt14()));
				}
				if(StringUtils.isNotBlank(cmxIndivValue.getExt13())){
					partyValue.setSuffix(Integer.parseInt(cmxIndivValue.getExt13()));
				}
				if(StringUtils.isNotBlank(cmxIndivValue.getExt15())){
					partyValue.setPlaceOfBirth(cmxIndivValue.getExt15());
				}
				if(StringUtils.isNotBlank(cmxIndivValue.getMotherName())){
					partyValue.setMotherName(cmxIndivValue.getMotherName());
				}
				if(StringUtils.isNotBlank(cmxIndivValue.getFormerName())){
					partyValue.setBirthFirstName(cmxIndivValue.getFormerName());
				}
				if(StringUtils.isNotBlank(cmxIndivValue.getExt11())){
					partyValue.setBirthLastName(cmxIndivValue.getExt11());
				}
			}
			if (partyValue.isNew() && partyValue.getPartyId() <= 0) {
				long partyId = CmCommonUtil.getNewSequence(BOCmPartyBean.class);
				partyValue.setPartyId(partyId);
				customerValue.setPartyId(partyId);
			}
			//针对潜在客户对名称和地址或者phone或者email进行验重
			if(customerValue.getAnonymousFlag()==1){
				String firstName=customerValue.getFirstName();
				String lastName=customerValue.getLastName();
				long custId=customerValue.getCustId();
				ICmCustomerSV custSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				IBOCmCustContactMediumValue[] values=custSV.queryCustContactMediumByCustId(custId);
				if(CmCommonUtil.isNotEmptyObject(values)){
					for(IBOCmCustContactMediumValue value : values){
						long contMedTypeId=value.getContMedTypeId();
						if(contMedTypeId==CmConstants.AddressId.legalAddress || contMedTypeId==CmConstants.AddressId.EMAIL || contMedTypeId==CmConstants.AddressId.CONTACT_NUMBER){
							//针对法律地址,phone,email
							validateAnonymousCust(custId,firstName, lastName, value);
						}
					}
				}
			}
		}
	}
	
	private void validateAnonymousCust(long custId,String firstName,String lastName,IBOCmCustContactMediumValue value) throws Exception{
		StringBuilder condition=new StringBuilder();
		Map parameter=new HashMap();
		condition.append(" SELECT A.FIRST_NAME,A.LAST_NAME,A.CUST_ID FROM {CM_INDIV_CUSTOMER} A,{CM_CUST_CONTACT_MEDIUM} B WHERE A.CUST_ID=B.CUST_ID AND A.CUST_ID !=:custId AND A.FIRST_NAME=:firstName AND A.LAST_NAME=:lastName ");
		parameter.put("custId", custId);
		parameter.put("firstName", firstName);
		parameter.put("lastName", lastName);
		if(value.getContMedTypeId()==CmConstants.AddressId.legalAddress){
			//针对法律地址
			condition.append(" AND B.ADDRESS_ID=:addressId ");
			parameter.put("addressId", value.getAddressId());
		}else if(value.getContMedTypeId()==CmConstants.AddressId.CONTACT_NUMBER){
			//针对电话
			condition.append(" AND B.CONT_NUMBER=:phone ");
			parameter.put("phone", value.getContNumber());
		}else if(value.getContMedTypeId()==CmConstants.AddressId.EMAIL){
			//针对email
			condition.append(" AND B.EMAIL_ADDRESS=:email ");
			parameter.put("email", value.getEmailAddress());
		}
		DataContainerInterface[] dcs=CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
		if(CmCommonUtil.isNotEmptyObject(dcs)){
			ExceptionUtil.throwBusinessException("CMS9988775");
		}
	}
	protected void setOtherDefaultValue(IVOCustValue custValue) throws Exception {

	}

	protected void validateAttrValue(IVOCustValue custValue) throws Exception {

	}

	protected void validateOtherThings(IVOCustValue custValue) throws Exception {

	}

	protected void notify(IVOCustValue custValue) throws Exception {
	}

	public void dealCustIdentification(IVOCustValue custValue) throws Exception {
		// 针对匈牙利的处理
		if (custValue.hasCustIdentification()) {
			IBOIdentificationValue[] identificationValues = custValue.getCustIdentification();
			for (int i = 0; i < identificationValues.length; i++) {
				if (identificationValues[i].isNew()) {
					identificationValues[i].setIdenId(CmCommonUtil.getNewSequence(BOIdentificationBean.class));
					identificationValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					identificationValues[i].setState(CmConstants.RecordState.USE);
				}
			}
			ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			dkCustomerSV.saveCustIdentification(identificationValues);
		}
	}

	// 处理扩展信息
	private void dealCmCustomerKz(IVOCustValue custValue) throws Exception {
		if (null != custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer)) {
			// 处理个人的扩展信息
			IBOCmxIndivCustomerValue cmxIndivValue = (IBOCmxIndivCustomerValue) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
			if (cmxIndivValue.isNew()) {
				// 针对新增
				cmxIndivValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				cmxIndivValue.setState(CmConstants.RecordState.USE);
			} else if (cmxIndivValue.isModified()) {
				IBOCmxIndivCustomerValue temp = CmServiceFactory.getCustomerSV().queryCmxIndivCustomerValue(cmxIndivValue.getCustId());
				if (temp != null) {
					DataContainerFactory.copyNoClearData(cmxIndivValue,temp);
					cmxIndivValue = temp;
				}
			}
			CmServiceFactory.getCustomerSV().saveCmxIndivCustomer(cmxIndivValue);
		}
	}

	public void dealCustomer(IVOCustValue custValue) throws Exception {
		if (custValue.getCustomer() != null) {
			// 取当前系统中具体类型客户BOBean配置信息
			IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(custValue.getCustType()));
			if (staticDataValue == null) {
				/*
				 * 不存在类型为{0}的客户。
				 */
				ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(custValue.getCustType()));
			}
			// 检查具体类型客户的BOBean是否正确配置
			if (StringUtils.isBlank(staticDataValue.getExternCodeType()) || !staticDataValue.getExternCodeType().endsWith("Bean")) {
				// 系统参数错误：没有获取到编码为[{0}]的静态数据配置！
				ExceptionUtil.throwBusinessException("CMS0030043", CmConstants.CmStaticDataCodeType.CUST_TYPE);
			}

			/*
			 * 处理客户信息
			 */
			ICustomerValue customerValue = custValue.getCustomer();
			DataContainerInterface customerDC = DataContainerFactory.createDataContainerInstance(Class.forName(staticDataValue.getExternCodeType().trim()), null);
			customerDC.copy(customerValue);

			// 保存客户信息
			if (customerDC.isDeleted() || customerDC.isModified() || customerDC.isNew()) {
				// modify at 2015-7-6 新增时去除cust_service_id
				if (customerDC.isNew()) {
					customerDC.set(ICustomerValue.S_CustServiceId, "");
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBean(customerDC);
				// 回设到参数中
				customerValue.setCreateDate(customerDC.getAsDateTime(ICustomerValue.S_CreateDate));
				customerValue.setDoneCode(customerDC.getAsLong(ICustomerValue.S_DoneCode));
				customerValue.setDoneDate(customerDC.getAsDateTime(ICustomerValue.S_DoneDate));
				customerValue.setOpId(customerDC.getAsLong(ICustomerValue.S_OpId));
				customerValue.setOrgId(customerDC.getAsLong(ICustomerValue.S_OrgId));
				customerValue.setEffectiveDate(customerDC.getAsDateTime(ICustomerValue.S_EffectiveDate));
				customerValue.setExpireDate(customerDC.getAsDateTime(ICustomerValue.S_ExpireDate));

			}
		}
	}
	
	//处理细分信息
	public void dealCmCustSegment(IVOCustValue custValue)throws Exception{
		if(null!=custValue){
			if(null!=custValue.getUserObject("cmSegmentRela")){
				IBOCmCustSegmentRelaValue value=(IBOCmCustSegmentRelaValue) custValue.getUserObject("cmSegmentRela");
				ICmIndivCustomerSV indivSV=(ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
				indivSV.saveCustSegmentRela(value);
			}
		}
	}

}
