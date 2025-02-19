package com.asiainfo.crm.cm.common;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 *
 * @ClassName: CmBusinessCode.java
 * @Description: 客户管理业务操作编码枚举值定义。
 * 业务操作编码是存放在BASE.BS_OPERATION里面的数据，在这里面定义了哪个操作编码代表的具体业务是什么。
 * @version: v1.0.0
 * @author: huzq2
 * @date: Apr 26, 2011 9:30:24 PM
 * <p/>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * Apr 26, 2011		huzq2           v1.0.0               修改原因
 */

public interface CmBusinessOperation {

	/**客户视图业务编码*/
	long CUST_INFO_BUSI_ID = 2000000001L;

	/**客户开户弹出窗口 业务编码*/
	long CM_SO_CUST_OPEN_DIALOG = 2210004000L;

	/**个人客户资料修改*/
	long CM_INDIV_CUST_MODIFY = 2210003001L;

	/**账户资料修改 */
	long CM_ACCT_MODIFY = 2310003001L;

	/**实名制登记 */
	long CM_CUST_REAL_MODIFY = 2210003000L;

	/**托收合同编号申请 支付方式变更*/
	long ACCT_PAYMENT_CHANGE_BANK = 2330001001L;

	/**集团账户 添加已经存在的账户信息*/
	long CM_GROUP_ACCT_EXIST_ADD = 2310002001L;

	/**集团账户 添加新的账户信息*/
	long CM_GROUP_ACCT_NEW_ADD = 2310002002L;

	/**集团账户 修改账户信息*/
	long CM_GROUP_ACCT_MODIFY = 2310003002L;

	/**集团账户 注销账户信息*/
	long CM_GROUP_ACCT_ZHUX = 2310003003L;

	/**高尔夫倶乐部批量活动申请信息*/
	long CM_CLUB_GOLF_BATCH_REQUEST = 2530001002L;

	/**集团客户 注销客户信息*/
	long CM_GROUP_CUST_DELETE = 2230002021L;

	/**集团客户 反注销客户信息*/
	long CM_GROUP_CUST_RENEW = 2230002022L;

	/**
	 * 新增个人客户
	 */
	long CM_INDIV_CUST_NEW = 2400000001L;

	/**
	 * 修改个人客户
	 */
	long CM_INDIV_CUST_MOD = 2400000002L;

	/**
	 * 删除个人客户
	 */
	long CM_INDIV_CUST_DEL = 2400000003L;

	/**
	 * 新增集团客户
	 */
	long CM_GROUP_CUST_NEW = 2400000004L;

	/**
	 * 修改集团客户
	 */
	long CM_GROUP_CUST_MOD = 2400000005L;

	/**
	 * 删除集团客户
	 */
	long CM_GROUP_CUST_DEL = 2400000006L;

	/**
	 * 新增账户
	 */
	long CM_ACCOUNT_NEW = 2400000013L;

	/**
	 * 修改账户
	 */
	long CM_ACCOUNT_MOD = 2400000014L;

	/**
	 * 删除账户
	 */
	long CM_ACCOUNT_DEL = 2400000015L;

	/**
	 * 新增客户联系人
	 */
	long CM_CUST_CONT_NEW = 2400000007L;

	/**
	 * 修改客户联系人
	 */
	long CM_CUST_CONT_MOD = 2400000008L;

	/**
	 * 删除客户联系人
	 */
	long CM_CUST_CONT_DEL = 2400000009L;

	/**
	 * 新增账户联系人
	 */
	long CM_ACCT_CONT_NEW = 2400000010L;

	/**
	 * 修改账户联系人
	 */
	long CM_ACCT_CONT_MOD = 2400000011L;

	/**
	 * 删除账户联系人
	 */
	long CM_ACCT_CONT_DEL = 2400000012L;

	/**
	 * 新增地址
	 */
	long CM_CUST_ADRESS_NEW = 2500000013L;
	/**
	 * 修改地址
	 */
	long CM_CUST_ADRESS_MOD = 2500000014L;
	/**
	 * 删除地址
	 */
	long CM_CUST_ADRESS_DEL = 2500000015L;
	/**
	 * 新增联系媒介
	 */
	long CM_CUST_MEDIUM_NEW = 2400000016L;
	/**
	 * 修改联系媒介
	 */
	long CM_CUST_MEDIUM_MOD = 2400000017L;
	/**
	 * 删除联系媒介
	 */
	long CM_CUST_MEDIUM_DEL = 2400000018L;
	/**
	 * 新增行业
	 */
	long CM_CUST_INDUSTRY_NEW = 2400000019L;
	/**
	 * 修改行业
	 */
	long CM_CUST_INDUSTRY_MOD = 2400000020L;
	/**
	 * 删除行业
	 */
	long CM_CUST_INDUSTRY_DEL = 2400000021L;
	/**
	 * 修改Payer信息
	 */
	long CM_PAYER_MOD = 2400000022L;
	/**
	 * 修改使用者信息
	 */
	long CM_USER_MOD = 2400000023L;

	/**
	 * 新增集团AO联系人
	 */
	long CM_AO_CONTACT_NEW = 2400000024L;

	/**
	 * 删除集团AO联系人
	 */
	long CM_AO_CONTACT_DEL = 2400000026L;
	/**
	 * 部门分配号码
	 */
	long ASSIGN_BILL_DEPT = 2600000001L;
	/**
	 * 部门变更号码
	 */
	long TRANSFER_BILL_DEPT = 2600000002L;
	/**
	 * 部门删除号码
	 */
	long DELETE_BILL_DEPT = 2600000003L;

}
