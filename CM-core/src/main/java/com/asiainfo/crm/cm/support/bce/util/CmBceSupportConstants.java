/**
 * 
 */
package com.asiainfo.crm.cm.support.bce.util;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-21 下午10:39:37
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
 */
public class CmBceSupportConstants {

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmBceSupportConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午10:42:46
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public interface CmStaticDataCodeType {

		/**
		 * 客户管理BCE支持中的businessId与方法的映射关系
		 */
		String CM_BCE_BUSINESSID_METHOD_MAPPING_KEY = "CM_BCE_BUSINESSID_METHOD";

		/**
		 * 客户管理BCE支持中的具体业务处理服务key模板。使用时需要将其中的{BUSINESS_ID}替换成具体的业务编码。
		 */
		String CM_BCE_DEAL_SERVICE_KEY_TMPL_STR = "CM_BCE_DEAL_SERVICE_{BUSINESS_ID}";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmDefaultCodeValue
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-11 下午10:52:16
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-5-11     huzq2           v1.0.0               修改原因<br>
	 */
	public interface CmDefaultCodeValue {

		/**
		 * 前台传入后台的key
		 */
		String codeValueCustomer = "frmCustomer";
		/**
		 * 客户经理
		 */
		String codeValueCustManager = "tblCustManager";
		/**
		 * 客户组织结构
		 */
		String codeValueCustOrganize = "tblCustOrganize";
		/**
		 * 联系人
		 */
		String codeValueContact = "tblContact";
		/**
		 * 集团客户扩展
		 */
		String codeValueCmxGrpCustomer="frmKZCustomer";
		
		/**
		 * 账户
		 */
		String codeValueAccount = "frmAccount";
		
		/**
		 * 账户支付方案
		 */
		String codeValueAcctPayment = "frmAcctPayment";
		
		/**
		 * 账期
		 */
		String codeValueAcctBillCycle = "frmBillCycle";
		
		/**
		 * 账单定制
		 */
		String codeValueBillCustomzie = "frmBillCustomizeInfo";
		
		/**
		 * 个人扩展信息
		 */
		String codeValueCmxIndivCustomer = "frmAddtionalInfo";
	}
	
	/**   
	 * 跟订单管理相关的Keys
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmBceSupportConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午11:02:54
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public interface SoOrderKeys {

		/**
		 *
		 */
		String ORDER_CUSTOMER_KEY = "ORD_CUST";
	}

	public interface VOCustStruct {
		String CUSTOMER = "cust.customer";
		String CONTACT = "cust.contact";
		String MANAGER = "cust.custManager";
		String ORGANIZE = "cust.custOrganize";
		String CMXGRPCUSTOMER="cust.custCmxGrp";
	}
	
	public interface VOAccountStruct{
		String ACCOUNT = "acct.account";
		String PAYMENT = "acct.payment";
		String BILL_CUSTOMIZE = "acct.billCustomize";
		String BILL_CYCLE = "acct.billCycle";
	}
}
