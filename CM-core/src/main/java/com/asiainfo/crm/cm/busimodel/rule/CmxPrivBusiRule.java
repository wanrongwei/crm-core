package com.asiainfo.crm.cm.busimodel.rule;

import com.asiainfo.crm.cm.busimodel.rule.CmPrivBusiRule;
import com.asiainfo.crm.cm.common.CmxPrivConstants;


public class CmxPrivBusiRule extends CmPrivBusiRule implements CmxPrivConstants{

	/**   
	 * 操作员具有特殊开户渠道(客户来源-零售末梢开户权限)的权限
	 * @Function checkCustResForRetailSellPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-24 上午10:11:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-24     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkCustResForRetailSellPriv(long operId) throws Exception {
		return checkBasePermission(operId, SecEntity.OPEN_CUST, SecPriv.RETAIL_SELL);
	}
	
	/**   
	 * 操作员具有特殊开户渠道(客户来源-热销直线开户权限)的权限
	 * @Function checkCustResForHotSellPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-24 上午10:11:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-24     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkCustResForHotSellPriv(long operId) throws Exception {
		return checkBasePermission(operId, SecEntity.OPEN_CUST, SecPriv.HOT_SELL);
	}
	
	/**   
	 * 操作员具有特殊开户渠道(客户来源-电子商务中心开户权限)的权限
	 * @Function checkCustResForElectronSellPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-24 上午10:13:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-24     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkCustResForElectronSellPriv(long operId) throws Exception {
		return checkBasePermission(operId, SecEntity.OPEN_CUST, SecPriv.ELECTRON_SELL);
	}
	
	/**   
	 * 操作员具有特殊开户渠道(客户来源-其他渠道开户权限)的权限
	 * @Function checkCustResForOtherSellPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-24 上午10:13:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-24     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkCustResForOtherSellPriv(long operId) throws Exception {
		return checkBasePermission(operId, SecEntity.OPEN_CUST, SecPriv.OTHER_SELL);
	}
	
	/**   
	 * 测试卡用户操作权限
	 * @Function checkTestCardOperPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-24 下午9:26:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-24     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkTestCardOperPriv(long operId) throws Exception {
		return checkBasePermission(operId, SecEntity.TEST_CARD, SecPriv.TEST_CARD_OPER);
	}
	/**
	 * 
	 * @Function checkUserDeleteCard
	 * @Description 检测用户是否有删除证件黑名单的权限
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author qianmx
	 * @date May 24, 2012 9:53:45 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * May 24, 2012     qianmx           v1.0.0               修改原因<br>
	 */
	public static boolean checkUserDeleteCard(long operId)throws Exception {
		return checkBasePermission(operId, SecEntity.SPECIALLIST_CARD, SecPriv.DELETE_SPECIALLIST_CARD);
	}
	/**   
	 * 已登记用户修改资料权限
	 * @Function checkCustModifyOperPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-25 下午2:26:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-25     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkCustModifyOperPriv(long operId) throws Exception {
		return checkBasePermission(operId, SecEntity.CUST_MODIFY, SecPriv.PAGE_OPERATING);
	}
	
	/**   
	 * 检验操作员是否具有取消代扣的权限
	 * @Function checkCancelDeductPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-28 下午7:58:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-28     huzq2           v1.0.0               修改原因<br>
	 */
	public static boolean checkCancelDeductPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.CANCEL_DEDUCT, SecPriv.PAGE_OPERATING);
	}
	
	/**
	 * 检验操作员是否具有跨区调配客户经理的权限
	 * @param operId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 28, 2012 8:19:14 PM
	 */
	public static boolean checkChgCustManagerPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.CUST_INFO, SecPriv.CHG_CUST_MANAGER);
	}
	
	/**   
	 * 同户名全球通入网权限
	 * @Function checkSameNameEnterPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-30 上午9:32:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkSameNameEnterPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.SAME_NAME_ENTER, SecPriv.PAGE_OPERATING);
	}
	
	/**   
	 * 同照预付费入网无限制
	 * @Function checkSameCertEnterPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-30 上午9:46:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkSameCertEnterPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.SAME_CERT_ENTER, SecPriv.ENTER_VERIFY);
	}
	
	/**   
	 * 一代大陆居民身份证录入权限
	 * @Function checkFirstIdentityCardPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-30 上午11:40:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkFirstIdentityCardPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.FIRST_IDENTITY_CARD, SecPriv.PAGE_OPERATING);
	}
	
	/**   
	 * 单位证明证件类型录入权限（客户资料修改）
	 * @Function checkCompanyCertifyPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-30 下午2:49:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkCompanyCertifyPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.COMPANY_CERTIFY, SecPriv.PAGE_OPERATING);
	}
	
	/**   
	 * 能否选择自然月账期
	 * @Function checkChooseNatureMonthPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-30 下午5:13:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkChooseNatureMonthPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.OPEN_CUST, SecPriv.CHOOSE_NATURE_MONTH);
	}
	
	/**
	 * 检验操作员是否具有账户资料修改-修改邮寄地址的权限
	 * @param operId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 28, 2012 8:19:14 PM
	 */
	public static boolean checkModifyAddressPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.CM_MODIFY_ADDRESS, SecPriv.MODIFY_ADDRESS);
	}
	
	/**
	 * 检验操作员是否具有操作员敏感信息的权限
	 * @param operId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 28, 2012 8:19:14 PM
	 */
	public static boolean checkPrivateMsgHiddenPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.CM_MODIFY_PAGE, SecPriv.PRIVATE_MSG_HIDDEN);
	}
	
	
	/**
	 * 检验操作员是否具有护照类证件录入的权限（账户资料修改）
	 * @param operId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 28, 2012 8:19:14 PM
	 */
	public static boolean checkPassportRecordPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.CM_MODIFY_PAGE, SecPriv.PASSPORT_CERT_RECORD);
	}
	
	
	/**
	 * 检验操作员是否具有军人证录入的权限（账户资料修改）
	 * @param operId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 28, 2012 8:19:14 PM
	 */
	public static boolean checkMilitaryIdRecordPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.CM_MODIFY_PAGE, SecPriv.MILITARY_ID_RECORD);
	}
	
	/**   
	 * 军人证录入的权限（客户资料修改）
	 * @Function checkMilitaryIdPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午10:10:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkMilitaryIdPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.MILITARY_ID, SecPriv.CERT_INPUT);
	}
	
	/**   
	 * 护照类证件录入权限（客户资料修改）
	 * @Function checkPassportPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午10:11:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkPassportPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.PASSPORT, SecPriv.CERT_INPUT);
	}
	
	/**   
	 * 其他证件录入权限（客户资料修改）
	 * @Function checkOtherCertificatePriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午10:12:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkOtherCertificatePriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.OTHER_CERTIFICATE, SecPriv.CERT_INPUT);
	}
	
	/**   
	 * 单位户名证件录入权限（客户资料修改）
	 * @Function checkCompanyNamePriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午10:13:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkCompanyNamePriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.COMPANY_NAME, SecPriv.CERT_INPUT);
	}
	 
	/**   
	 * 手工录入身份证信息权限
	 * @Function checkHandmadeIdentityCardPiv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2011-6-1 上午9:59:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-6-1     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkHandmadeIdentityCardPiv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.HANDMADE_IDENTITY_CARD, SecPriv.CERT_INPUT);
	}
	
	
	/**
	 * 
	 * @Function checkWapUserRealName
	 * @Description WAP用户进行实名制修改权限
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-2 下午5:24:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-2      huaiduo           v1.0.0               修改原因<br>
	 */
	public static boolean checkWapUserRealNamePiv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.WAP_USER_REAL_NAME, SecPriv.MODIFY_ADDRESS);
	}
	
	/**   
	 * 公务测试客户类别受理
	 * @Function checkOfficialTestIndivTypePiv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-6-4 下午1:53:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4     zhangyin          v1.0.0               修改原因<br>
	 */
	public static boolean checkOfficialTestIndivTypePiv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.OFFICIAL_TEST_INDIV_TYPE, SecPriv.PAGE_OPERATING);
	}
	
	/**   
	 * 检验是否具有不上传证件影印件的权限
	 * @Function checkNotUploadCertificateAttach
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-6-7 下午01:19:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-7    zhangwei21         v1.0.0               修改原因<br>
	 */
	public static boolean checkNotUploadCertificateAttach(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.CUST_INFO, SecPriv.NOT_UPLOAD_CERTIFICATE_ATTACH);
	}
	
	/**
	 * 校验是否有权限选择“虚拟客户”
	 * @Function checkVirtualCustomerPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-6-12 上午11:25:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12    zhangwei21         v1.0.0               修改原因<br>
	 */
	public static boolean checkVirtualCustomerPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.BUSINESS_SALE, SecPriv.VIRTUAL_CUSTOMER_PRIV);
	}
	/**
	 * 证件类别-特殊客户选择权限
	 * @Function checkSpecialCustomerPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-6-12 下午02:07:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12    zhangwei21         v1.0.0               修改原因<br>
	 */
	public static boolean checkSpecialCustomerPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.BUSINESS_SALE, SecPriv.SPECIAL_CUSTOMER_PRIV);
	}
	/**
	 * A+客户属性修改权限
	 * @Function checkACustAttrModify
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-6-12 下午02:07:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12    zhangwei21         v1.0.0               修改原因<br>
	 */
	public static boolean checkACustAttrModify(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.BUSINESS_SALE, SecPriv.A_CUST_ATTR_MODIFY);
	}
	/**
	 * 特殊重要程度修改特殊权限
	 * @Function checkModifyCustomerSpecImptLevel
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-6-12 下午02:07:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12    zhangwei21         v1.0.0               修改原因<br>
	 */
	public static boolean checkModifyCustomerSpecImptLevel(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.BUSINESS_SALE, SecPriv.MODIFY_CUSTOMER_SPECIMPT_LEVEL);
	}
	/**
	 *  是否有权限权限将机构类型调整到'虚拟客户'，因为虚拟客户会导致客户等级调整到'V' 
	 * @Function checkCustLevSpecialPriv
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-6-12 下午02:07:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12    zhangwei21         v1.0.0               修改原因<br>
	 */
	public static boolean checkCustLevSpecialPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.BUSINESS_SALE, SecPriv.CUST_LEV_SPECIAL_PRIV);
	}
	/**
	 * 
	 * @Function impleClubMember
	 * @Description VIP跨区导入权限
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author qianmx
	 * @date Jun 12, 2012 7:29:23 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 12, 2012     qianmx           v1.0.0               修改原因<br>
	 */
	public static boolean impleClubMember(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.IMPORT_CLUB_MEMBER, SecPriv.IMPORT_CLUB_MEMBER);
	}
	/**
	 * 
	 * @Function impleClubMemberSpecial
	 * @Description VIP导入特殊权限
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author qianmx
	 * @date Jun 13, 2012 3:40:34 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 13, 2012     qianmx           v1.0.0               修改原因<br>
	 */
	public static boolean impleClubMemberSpecial(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.IMPORT_CLUB_MEMBER_SPECIAL, SecPriv.IMPORT_CLUB_MEMBER_SPECIAL);
	}
	/**
	 * 
	 * @Function checkCustInfoDifferentPriv
	 * @Description 资料不一致特殊权限
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-7-6 下午7:02:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-6     huaiduo          v1.0.0               修改原因<br>
	 */
	public static boolean checkCustInfoDifferentPriv(long operId) throws Exception{
		return checkBasePermission(operId, SecEntity.CUST_INFO_DIFFERENT, SecPriv.CUST_INFO_DIFFERENT);
	}
}
