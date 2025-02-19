package com.asiainfo.crm.cm.dk.common;

public class CmDkConstants {

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 客户联系媒介
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 8, 2014 3:46:14 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Apr 8, 2014     Administrator           v1.0.0               修改原因<br>
	 */
	public interface CustContMedium {

		/**
		 * 地址
		 */
		public static final int ADDRESS = 1;

		/**
		 * 电子地址
		 */
		public static final int ELECTRONIC_ADDRESS = 2;

		/**
		 * 电话
		 */
		public static final int PHONE = 3;

		/**
		 * 联系地址
		 */
		public static final int HOME_ADDRESS = 16;

		/**
		 * 邮寄地址
		 */
		public static final int POST_ADDRESS = 12;

		/**
		 * 送货地址
		 */
		public static final int DELIVERY_ADDRESS = 14;

		/**
		 * 农场地址
		 */
		public static final int FARM_ADDRESS = 15;

		/**
		 * 法律地址
		 */
		public static final int LEGAL_ADDRESS = 11;

		/**
		 * EMAIL
		 */
		public static final int EMAIL = 21;
		
		/**
		 * EMAIL
		 */
		public static final int PREFER_AGENT_EMAIL = 22;

		/**
		 * 联系电话
		 */
		public static final int CONTACT_NUMBER = 31;

		/**
		 * FAX
		 */
		public static final int FAX = 32;

		/**
		 * 短信
		 */
		public static final int SMS = 33;

		/**
		 * 紧急联系电话
		 */
		public static final int EMERGENCY_PHONE = 35;

		// 平信
		public static final int LETTER = 36;

		// MMS
		public static final int MMS = 37;
	}

	public interface BillingBusiCode {

		// 查询账户信息
		public static final String QUERY_ACCT = "6023";

		// 查询税率
		public static final String QUERY_ACCT_FEE = "6034";

		// 查询税率
		public static final String QUERY_BILL_FORMAT_FEE = "6035";

		// 查询缴费或者调账信息
		public static final String QUERY_PAY_AND_ADJUST = "6011";

		// 查询未结清账单信息
		public static final String QUERY_UNPAY_ACCT = "6041";

		// 更新账户信息
		public static final String UPDATE_ACCT_INFO = "1012";

		// 查询账单枚举值
		public static final String ACCT_FORMAT_ENUM = "6049";
		
		//重置信用度接口
		public static final String RESET_CREDIT_LIMIT = "3202";
	}

	public interface UserPayType {

		// 后付费billing
		public static final String POSTPAY = "1";

		// 预付费billing
		public static final String PREPAY = "0";

		// 混合付费billing
		public static final String MIXED = "2";

		// 后付费order
		public static final int POSTPAID = 2;

		// 预付费order
		public static final int PREPAID = 1;

		// 混合付费orders
		public static final int HYBIRD = 0;
	}

	public interface BillingStaticData {

		// 支付方式
		public static final int PAYMENT_TYPE = 1;
		// 账单格式
		public static final int BILL_FORMAT = 2;
		// 寄送方式
		public static final int DELIVERY_METHOD = 3;
	}
}
