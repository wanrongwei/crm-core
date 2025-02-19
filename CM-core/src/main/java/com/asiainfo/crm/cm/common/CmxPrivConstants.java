package com.asiainfo.crm.cm.common;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmPrivConstants.java
 * @Description: 客户管理中使用到的权限相关枚举值定义
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 13, 2011 5:06:57 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * May 13, 2011		huzq2           v1.0.0               修改原因
 */
public interface CmxPrivConstants
{
	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmPrivConstants.java
	 * @Description: 权限实体类型定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 13, 2011 5:06:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 13, 2011		huzq2           v1.0.0               修改原因
	 */
	interface SecEntClass
	{
		

	}

	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmPrivConstants.java
	 * @Description: 数据对象访问权限定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 13, 2011 5:07:35 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 13, 2011		huzq2           v1.0.0               修改原因
	 */
	interface SecPriv
	{
		
		/**
		 * 零售末梢开户权限
		 */
		long RETAIL_SELL = 20000030L;
		
		/**
		 * 电子商务中心开户权限
		 */
		long ELECTRON_SELL = 20000031L;
		
		/**
		 * 热销直线开户权限
		 */
		long HOT_SELL = 20000032L;
		
		/**
		 * 其他渠道开户权限
		 */
		long OTHER_SELL = 20000033L;
		
		/**
		 * 测试卡用户入网校验
		 */
		long TEST_CARD_OPER = 30000006L;
		
		/**
		 * 页面操作
		 */
		long PAGE_OPERATING = 30000002L;
		
		/**
		 * 跨区调配客户经理 
		 */
		long CHG_CUST_MANAGER = 10000294L;
		/**
		 * 客户管理按钮权限
		 */
		long MODIFY_ADDRESS = 30000012L;
		/**
		 * 操作员敏感信息权限
		 */
		long PRIVATE_MSG_HIDDEN = 30000009L;
		/**
		 * 护照类证件录入
		 */
		long PASSPORT_CERT_RECORD = 30000010L;
		/**
		 * 军人证录入
		 */
		long MILITARY_ID_RECORD = 30000011L;
		
		/**
		 * 入网证件校验
		 */
		long ENTER_VERIFY = 30000005L;	
		
		/**
		 * 证件录入
		 */
		long CERT_INPUT = 30000001L;
		
		/**
		 * 选择自然月账期
		 */
		long CHOOSE_NATURE_MONTH = 20000011L;
		
		/**
		 * 删除证件黑名单权限
		 */
		long DELETE_SPECIALLIST_CARD = 30000000L;
		
		/**
		 * 不上传证件影印件
		 */
		long NOT_UPLOAD_CERTIFICATE_ATTACH = 10000297L;
		/**
		 * 选择‘虚拟客户’
		 */
		long VIRTUAL_CUSTOMER_PRIV = 10000124L;
		/**
		 * 选择 证件类别 ‘特殊客户’
		 */
		long SPECIAL_CUSTOMER_PRIV = 10000125L;
		/**
		 * 选择‘A+客户属性修改’
		 */
		long A_CUST_ATTR_MODIFY = 10000130L;
		/**
		 * 选择‘特殊重要程度修改特殊权限’
		 */
		long MODIFY_CUSTOMER_SPECIMPT_LEVEL = 10000154L;
		/**
		 * 选择‘客户等级V调整权限’
		 */
		long CUST_LEV_SPECIAL_PRIV = 10000129L;
		/**
		 * VIP跨区导入权限
		 */
		long IMPORT_CLUB_MEMBER = 30000002L;
		/**
		 * VIP导入特殊权限
		 */
		long IMPORT_CLUB_MEMBER_SPECIAL = 30000002L;
		/**
		 * 资料不一致特殊权限
		 */
		long CUST_INFO_DIFFERENT = 20000070L;
		
	}

	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmPrivConstants.java
	 * @Description: 客户管理使用到的权限实体定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 13, 2011 5:13:28 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 13, 2011		huzq2           v1.0.0               修改原因
	 */
	interface SecEntity
	{
		/**
		 * 开户校验控制类
		 */
		long OPEN_CUST = 20000005L;
		
		/**
		 * 测试卡用户控制类
		 */
		long TEST_CARD = 30000012L;
		
		/**
		 * 取消代扣权限
		 */
		long CANCEL_DEDUCT = 30000014L;
		
		/**
		 * 客户统一视图
		 */
		long CUST_INFO = 10000012L;
		
		/**
		 * 账户资料修改-修改邮寄地址
		 */
		long CM_MODIFY_ADDRESS = 30000062L; 
		
		/**
		 * 账户资料修改-受理界面使用权限控制
		 */
		long CM_MODIFY_PAGE = 30000063L; 
		
		/**
		 * 同户名全球通入网权限
		 */
		long SAME_NAME_ENTER = 30000013L;
		
		/**
		 * 	同照预付费入网无限制
		 */
		long SAME_CERT_ENTER = 30000010L;
		
		/**
		 * 	一代大陆居民身份证录入权限
		 */
		long FIRST_IDENTITY_CARD = 30000020L;
		
		/**
		 * 	单位证明证件类型录入权限
		 */		
		long COMPANY_CERTIFY = 30000001L;
		
		/**
		 * 已登记用户修改资料
		 */
		long CUST_MODIFY = 30000018L;

		/**
		 * 军人证录入权限 
		 */
		long MILITARY_ID = 30000064L;

		/**
		 * 护照类证件录入权限
		 */
		long PASSPORT = 30000065L;

		/**
		 * 其他证件录入权限
		 */
		long OTHER_CERTIFICATE = 30000066L;

		/**
		 * 单位户名证件录入权限
		 */
		long COMPANY_NAME = 30000067L;
		
		/**
		 * 手工录入身份证信息权限
		 */
		long HANDMADE_IDENTITY_CARD = 30000006L;
		
		/**
		 * WAP用户进行实名制修改权限
		 */
		long WAP_USER_REAL_NAME = 30000023L;
		/**
		 * 删除证件黑名单权限
		 */
		long SPECIALLIST_CARD = 30000000L;
		
		/**
		 * 公务测试客户类别受理
		 */
		long OFFICIAL_TEST_INDIV_TYPE = 30000021L;
		/**
		 * VIP跨区导入权限
		 */
		long IMPORT_CLUB_MEMBER = 30000024L;  
		/**
		 *VIP导入特殊权限
		 */
		long IMPORT_CLUB_MEMBER_SPECIAL = 30000024L; 
		/**
		 *业务受理操作
		 */
		long BUSINESS_SALE = 10000006L; 
		/**
		 * 受理界面使用权限控制
		 */
		long CUST_INFO_DIFFERENT = 20000024L;
		
		
	}
}