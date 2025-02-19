package com.asiainfo.crm.cm.support.bce.service.impl;

import java.lang.reflect.Method;

import org.apache.commons.lang.StringUtils;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.bce.ivalues.IBceData;
import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.bce.util.BceUtil;
import com.ai.bce.valuebean.BceDealReturnDataBean;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustAttrBean;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnCommonServiceSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.bo.CustManagerBean;
import com.asiainfo.crm.cm.model.bo.CustOrganizeBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.support.bce.service.interfaces.ICmGroupCustomerBceDealSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;

/** 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName 
 * @Description 该类的功能描述
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-21 下午8:10:55
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
 */
public class CmGroupCustomerBceDealSVImpl implements ICmGroupCustomerBceDealSV {

	public IBceDealReturnData createCustomProperty(IBceData bceData, IBceDealReturnData bceDealReturnData) throws Exception {
		String[][] msg = new String[6][2];
		String aPreMsg = "";
		String busiName = "";
		aPreMsg += "[" + busiName + "].\n";
		String aIsSucc = bceDealReturnData.getIsSuccess();
		msg[0][0] = "IS_SUCCESS";
		msg[0][1] = "Y";

		if (BceUtil.STR_YES.equalsIgnoreCase(aIsSucc)) {
			msg[1][0] = "FLAG";
			msg[1][1] = "SUCCESS";
			msg[2][0] = "custId";
			msg[2][1] = bceData.getUserData(CmConstants.CommonPageParamName.CUST_ID);
			msg[4][0] = "MESSAGE";
			msg[4][1] = bceDealReturnData.getSuccessMsg();
			msg[5][0] = "isUseGo";
			msg[5][1] = BceUtil.STR_YES;
		} else {
			msg[1][0] = "FLAG";
			msg[1][1] = "ERROR";
			msg[4][0] = "MESSAGE";
			msg[4][1] = aPreMsg + bceDealReturnData.getErrorMsg();
		}
		bceDealReturnData.setCustomProperty(msg);
		return bceDealReturnData;
	}

	public IBceDealReturnData deal(IBceData bceData, long bceFrameId) throws Exception {
		// 获取业务编码
		String businessId = DataType.getAsString(bceData.getUserData(BceUtil.BUSIOPER_ID_KEY));
		if (StringUtils.isBlank(businessId)) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		// 从静态数据配置中获取业务编码与业务实现方法的映射关系的配置
		IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(CmBceSupportConstants.CmStaticDataCodeType.CM_BCE_BUSINESSID_METHOD_MAPPING_KEY, businessId);
		if (staticDataValue == null) {
			// 系统没有配置业务编码与业务实现方法的映射关系
			ExceptionUtil.throwBusinessException("CMS0010047");
		}
		String methodName = staticDataValue.getCodeName();// 获得数据库中的方法名称
		// 通过反射的机制动态执行对应的方法
		Method method = getClass().getMethod(methodName, new Class[] { IVOCustValue.class, Long.class, String.class });
		if (method == null) {
			// 没有找到对应的方法
			ExceptionUtil.throwBusinessException("CMS0010048");
		}
		// 将前台传入的数据集转换成客户大对象
		IVOCustValue custValue = getCustValueFromBceData(bceData, bceFrameId, businessId);
		// 调用具体的方法处理业务
		IBceDealReturnData returnData = (IBceDealReturnData) method.invoke(this, new Object[] { custValue, bceFrameId, businessId });
		bceData.addUserData(CmConstants.CommonPageParamName.CUST_ID, String.valueOf(custValue.getCustId()));
		bceData.addUserData(CmConstants.CommonPageParamName.CUST_SERVICE_ID, String.valueOf(custValue.getCustomer().getCustServiceId()));
		return returnData;
	}

	public IBceDealReturnData dealCreateGroupCustomer(IVOCustValue custValue, Long bceFrameId, String businessId) throws Exception {
		IBceDealReturnData returnData = new BceDealReturnDataBean();
		String success = BceUtil.STR_YES;
		String successMsg = "";
		// 将集团客户的cityId覆盖regionId，以集团地市为准，而不是取操作员的地市
		ICustomerValue customerValue = custValue.getCustomer();
		customerValue.setRegionId(customerValue.getCityId());
		
        //新增判断是否存在同一集团名称
	    String custName = customerValue.getCustName();
		DataContainer dc = new DataContainer();
		dc.set(ICustomerValue.S_CustName, custName);
		dc.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.EXACT_MATCH);
		dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		ICustomerValue[] custs = CmServiceFactory.getCustomerSV().queryCustomers(dc,-1,-1);
		if(custs.length>0){
			ExceptionUtil.throwBusinessException("CMS0013119");
		}
			
		//新增判断是否已经存在同一个service_id的逻辑
		String custServiceId = customerValue.getCustServiceId();
		if(!"".equals(custServiceId))
		{
			ICustomerValue customer = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(custServiceId, CmConstants.CustomerType.GROUP);
			if(CmCommonUtil.isNotEmptyObject(customer))
				throw new Exception (CrmLocaleFactory.getResource("CMS0000001", customerValue.getCustName()));	//集团客户名称[{0}]已经存在，请重新输入！
		}
		
		// 保存客户信息
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		returnData.setIsSuccess(success);
		if (success.equals(BceUtil.STR_YES)) {
			if (custValue.getCustomer() != null) {
				// 新增集团客户成功，集团客户编号[{0}]。
				successMsg = CrmLocaleFactory.getResource("CMS0000081", Long.toString(custValue.getCustomer().getCustId()));	//新增集团客户成功，集团客户编号[{0}]。
			}
			returnData.setSuccessMsg(successMsg);
		} else {
			returnData.setErrorMsg(successMsg);
		}
		return returnData;
	}

	public IBceDealReturnData dealModifyGroupCustomer(IVOCustValue custValue, Long bceFrameId, String businessId) throws Exception {
		IBceDealReturnData returnData = new BceDealReturnDataBean();
		String success = BceUtil.STR_YES;
		String successMsg = "";
		// 保存客户信息
		updateGrpCustLevel(custValue);
		
        //修改判断是否存在同一集团名称
	    String custName = custValue.getCustomer().getCustName();
		DataContainer dc = new DataContainer();
		dc.set(ICustomerValue.S_CustName, custName);
		dc.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.EXACT_MATCH);
		dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		ICustomerValue[] custs = CmServiceFactory.getCustomerSV().queryCustomers(dc,-1,-1);
		if(custs.length>0){
			for (int i = 0; i < custs.length; i++) {
				if (custs[i].getCustId()!=custValue.getCustId()) {
					ExceptionUtil.throwBusinessException("CMS0013119");
				}
			}
			
		}
		
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		returnData.setIsSuccess(success);
		if (success.equals(BceUtil.STR_YES)) {
			if (custValue.getCustomer() != null) {

				// 修改集团客户成功，集团客户编号[{0}]。
				successMsg = CrmLocaleFactory.getResource("CMS0000082", Long.toString(custValue.getCustomer().getCustId()));
			}
			returnData.setSuccessMsg(successMsg);
		} else {
			returnData.setErrorMsg(successMsg);
		}
		return returnData;
	}

	/**
	 * 层级更改以后调用此方法
	 * @param custValue
	 * @throws Exception
	 */
	private void updateGrpCustLevel(IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		ICmLnCommonServiceSV icmLn = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
		icmLn.delCustomerLevel(customerValue.getCustId(), customerValue.getCustLevel());
	}

	/**   
	 * 从前台传入的数据集中获取客户对象
	 * @Function getCustValueFromBceData
	 * @Description 
	 *
	 * @param bceData
	 * @param bceFrameId
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-11 下午10:54:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11     huzq2           v1.0.0               修改原因<br>
	 */
	private IVOCustValue getCustValueFromBceData(IBceData bceData, Long bceFrameId, String businessId) throws Exception {
		String codeType = CmBceSupportConstants.CmStaticDataCodeType.CM_BCE_DEAL_SERVICE_KEY_TMPL_STR.replace("{BUSINESS_ID}", businessId);
		String codeValueCustomer = CmBceSupportConstants.CmDefaultCodeValue.codeValueCustomer;
		String codeValueCustManager = CmBceSupportConstants.CmDefaultCodeValue.codeValueCustManager;
		String codeValueCustOrganize = CmBceSupportConstants.CmDefaultCodeValue.codeValueCustOrganize;
		String codeValueContact = CmBceSupportConstants.CmDefaultCodeValue.codeValueContact;
		String codeValueCmxGrpCustomer = CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxGrpCustomer;

		IBOBsStaticDataValue[] staticDataValues = StaticDataUtil.getStaticData(codeType);
		if (CmCommonUtil.isNotEmptyObject(staticDataValues)) {
			for (int i = 0; i < staticDataValues.length; i++) {
				if (CmBceSupportConstants.VOCustStruct.CUSTOMER.equals(staticDataValues[i].getCodeValue())) {
					codeValueCustomer = staticDataValues[i].getCodeName();
				} else if (CmBceSupportConstants.VOCustStruct.CONTACT.equals(staticDataValues[i].getCodeValue())) {
					codeValueContact = staticDataValues[i].getCodeName();
				} else if (CmBceSupportConstants.VOCustStruct.MANAGER.equals(staticDataValues[i].getCodeValue())) {
					codeValueCustManager = staticDataValues[i].getCodeName();
				} else if (CmBceSupportConstants.VOCustStruct.ORGANIZE.equals(staticDataValues[i].getCodeValue())) {
					codeValueCustOrganize = staticDataValues[i].getCodeName();
				} else if (CmBceSupportConstants.VOCustStruct.CMXGRPCUSTOMER.equals(staticDataValues[i].getCodeValue())) {
					codeValueCmxGrpCustomer = staticDataValues[i].getCodeName();
				}
			}
		}
		IVOCustValue custValue = new VOCustBean();
		// 将businessId传入后台处理
		custValue.setBusinessId(Long.parseLong(businessId));
		/*
		 * 如果前台传入了客户信息，则创建客户对象
		 */
		DataContainerInterface[] dcs = bceData.getNormalRowsetInfo(codeValueCustomer);
		String regionId = dcs[0].getAsString(ICustomerValue.S_RegionId);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			ICustomerValue customerValue = new CustomerBean();
			// 将客户的基本信息拷贝到客户对象中
			customerValue.copy(dcs[0]);
			custValue.setCustomer(customerValue);
			DataContainerInterface[] attrValues = CmCommonUtil.getAttrValuesFromDC(dcs[0], new Class[] { BOCmGroupCustAttrBean.class });
			custValue.addAttrValues(attrValues);
			// 将客户的扩展信息拷贝到客户对象中
			custValue.setUserObject(codeValueCustomer, dcs[0]);
		}

		/*
		 * 如果前台传入了客户联系人，则创建客户联系人对象
		 */
		dcs = bceData.getNormalRowsetInfo(codeValueContact);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			for (DataContainerInterface dc : dcs) {
				IContactValue contactValue = new ContactBean();
				contactValue.copy(dc);
				custValue.addContact(contactValue);
			}
			// 将客户的扩展信息拷贝到客户对象中
			custValue.setUserObject(codeValueContact, dcs);
		}

		/*
		 * 如果前台传入了客户经理，则创建客户经理对象
		 */
		dcs = bceData.getNormalRowsetInfo(codeValueCustManager);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			for (DataContainerInterface dc : dcs) {
				ICustManagerValue custManagerValue = new CustManagerBean();
				custManagerValue.copy(dc);
				custValue.addCustManager(custManagerValue);
			}
			// 将客户的扩展信息拷贝到客户对象中
			custValue.setUserObject(codeValueCustManager, dcs);
		}

		/*
		 * 如果前台传入了集团组织结构，则创建集团组织结构对象
		 */
		dcs = bceData.getNormalRowsetInfo(codeValueCustOrganize);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			for (DataContainerInterface dc : dcs) {
				ICustOrganizeValue custOrganizeValue = new CustOrganizeBean();
				custOrganizeValue.copy(dc);
				custValue.addCustOrganize(custOrganizeValue);
			}
			// 将客户的扩展信息拷贝到客户对象中
			custValue.setUserObject(codeValueCustOrganize, dcs);
		}

		/*
		 * 如果前台传入了集团客户扩展表数据
		 */
		dcs = bceData.getNormalRowsetInfo(codeValueCmxGrpCustomer);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			dcs[0].set(ICustomerValue.S_RegionId, regionId);
			for (DataContainerInterface dc : dcs) {
				if (dc.isNew()) {
					custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_NEW);
				} else if (dc.isModified()) {
					custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);
				} else if (dc.isDeleted()) {
					custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_DEL);
				}
				if (dc.isNew() || dc.isModified() || dc.isDeleted()) {
					IBOLnCmxGroupCustValue cmxGroupCustValue = new BOLnCmxGroupCustBean();
					cmxGroupCustValue.copy(dc);
					custValue.setUserObject("cmxGrpCust", cmxGroupCustValue);
				}
			}
			// 将客户的扩展信息拷贝到客户对象中
			custValue.setUserObject(codeValueCmxGrpCustomer, dcs);
		}

		return custValue;
	}
}
