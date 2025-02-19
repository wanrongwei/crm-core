package com.asiainfo.crm.cm.support.bce.service.impl;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

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
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.support.bce.service.interfaces.ICmIndivCustomerBceDealSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;

public class CmIndivCustomerBceDealSVImpl implements ICmIndivCustomerBceDealSV {

	public IBceDealReturnData dealModifyIndivCustomer(IVOCustValue custValue, Long bceFrameId, String businessId) throws Exception {
		IBceDealReturnData returnData = new BceDealReturnDataBean();
		String success = BceUtil.STR_YES;
		String successMsg = "";
		ICustomerValue customerValue = custValue.getCustomer();
		long custId = customerValue.getCustId();
		String name = customerValue.getFirstName() + " " + customerValue.getLastName();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Timestamp birth = customerValue.getBirthday();
		String birthDay = "";
		if(birth != null){
			birthDay = df.format(birth);
		}
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue[] values = service.queryContactMediumByCondition(custId, CmConstants.AddressId.legalAddress);
		//潜在客户可以没有法律地址
		if (values != null && values.length > 0 && StringUtils.isNotBlank(birthDay)) {
			long addressId = values[0].getAddressId();
			String addressDetail = values[0].getAddressDetail();
			CmCommonUtil.judgeDuplicateCustomer(custId, birthDay, addressId, addressDetail, name);
		}
		// 保存客户信息
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		//保存记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " "+ Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.INDIV_CUST_MODIFY, CmConstants.BusiLogType.CUSTOMER_LOG, custId, CmConstants.BusiLogOperType.MODIFY, "", new HashMap(), methodDetail);
		
		returnData.setIsSuccess(success);
		if (success.equals(BceUtil.STR_YES)) {
			if (custValue.getCustomer() != null) {
				// 个人客户修改成功，编号为[{0}]！
				successMsg = CrmLocaleFactory.getResource("CMS0013002", String.valueOf(custValue.getCustomer().getCustId()));
			}
			returnData.setSuccessMsg(successMsg);
		} else {
			returnData.setErrorMsg(successMsg);
		}
		return returnData;
	}

	public IBceDealReturnData createCustomProperty(IBceData bceData, IBceDealReturnData bceDealReturnData) throws Exception, RemoteException {
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

	public IBceDealReturnData deal(IBceData bceData, long bceFrameId) throws Exception, RemoteException {
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
		String methodName = staticDataValue.getCodeName();
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
		return returnData;
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
		String codeValueAddtional = CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer;
		IBOBsStaticDataValue[] staticDataValues = StaticDataUtil.getStaticData(codeType);
		if (CmCommonUtil.isNotEmptyObject(staticDataValues)) {
			for (int i = 0; i < staticDataValues.length; i++) {
				if (CmBceSupportConstants.VOCustStruct.CUSTOMER.equals(staticDataValues[i].getCodeValue())) {
					codeValueCustomer = staticDataValues[i].getCodeName();
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
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			ICustomerValue customerValue = new CustomerBean();
			// 将客户的基本信息拷贝到客户对象中
			customerValue.copy(dcs[0]);
			if (customerValue.isNew()) {
				customerValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
			} else {
				customerValue.initProperty(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
			}
			custValue.setCustomer(customerValue);
		}

		/*
		 * 如果前台传入了客户信息，则创建客户对象
		 */
		dcs = bceData.getNormalRowsetInfo(codeValueAddtional);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			IBOCmxIndivCustomerValue indivCustomerValue = new BOCmxIndivCustomerBean();
			// 将客户的基本信息拷贝到客户对象中
			indivCustomerValue.copy(dcs[0]);
			// 将客户的扩展信息拷贝到客户对象中
			custValue.setUserObject(codeValueAddtional, indivCustomerValue);

			if (indivCustomerValue.isNew()) {
				custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_NEW);
			} else if (indivCustomerValue.isModified()) {
				custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);
			} else if (indivCustomerValue.isDeleted()) {
				custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_DEL);
			}
		}
		return custValue;
	}
}
