/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustBadRecordValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmBillingAcctValue;
import com.asiainfo.crm.cm.hu.party.IBOCmPartyPermissionValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmInsAccrelValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmGroupInfoValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**   
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-13 上午11:37:22
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
 */
public interface ICm2InterFSV {

	/**   
	 * 3.2.8	客户经理查询<br>
	 * 查询为该客户分配的客户经理，获取到客户经理id，提供外围时可通过权限中根据操作员id获取到员工信息。
	 * @Function queryCustManager
	 * @Description 查询客户经理
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午1:48:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map queryCustManager(Map parameter) throws Exception;
    
	/**
	 * 
	 * @Function ChangeIndivCustomerRole
	 * @Description 当客户角色为使用者时，将个人客户表中的客户角色改为客户,并且在客户细分表与参与人角色表中增加记录
	 * 
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author qiaotao3
	 * @date 2016-8-23 下午04:26:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-8-23     kocan           v1.0.0               修改原因<br>
	 */
	public void ChangeIndivCustomerRole(long custId,long partyId)throws Exception;
	
	/**   
	 * 3.3.1	创建账户信息<br>
	 * 创建账户信息，该接口只提供给营业
	 * @Function createAccount
	 * @Description 创建账户信息
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午1:54:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map modifyAccountValue(Map parameter) throws Exception;

	/**   
	 * 3.3.3	查询账户信息<br>
	 * 查询账户信息，如果账户编号存在则按照账户编号查询，如果不存在则按照客户编号查询。
	 * @Function queryAccount
	 * @Description 查询账户信息，如果账户编号存在则按照账户编号查询，如果不存在则按照客户编号查询。
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午1:56:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map queryAccount(Map parameter) throws Exception;

	/**   
	 * 3.3.4	账户支付方式维护<br>
	 * 账户支付方式维护，主要的支付方式有托收、代扣、现金、信用卡等，该接口只提供给营业
	 * @Function saveAcctPayment
	 * @Description 账户支付方式维护，主要的支付方式有托收、代扣、现金、信用卡等，该接口只提供给营业
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午1:56:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map saveAcctPayment(Map parameter) throws Exception;

	/**   
	 * 
	 * 3.3.5	账户支付方式查询
	 * 
	 * @Function queryAcctPayment
	 * @Description 
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午1:57:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map queryAcctPayment(Map parameter) throws Exception;

	/**   
	 * 3.3.7	个性化账单定制查询
	 * @Function queryAcctBillCustomize
	 * @Description 查询个性化账单定制信息
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午1:59:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map actionAcctBillCustomize(Map parameter) throws Exception;

	/**   
	 * 3.4.2	特殊名单查询
	 * @Function querySpecialList
	 * @Description 查询特殊名单
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午2:01:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map querySpecialList(Map parameter) throws Exception;

	/**   
	 * 3.5.1	俱乐部信息查询
	 * @Function queryClub
	 * @Description 查询俱乐部信息
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午2:02:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map queryClub(Map parameter) throws Exception;

	/**   
	 * 3.5.3	俱乐部会员信息查询<br>
	 * 查询俱乐部会员具体信息，俱乐部会员是用户级别。
	 * @Function queryClubMember
	 * @Description 查询俱乐部会员具体信息，俱乐部会员是用户级别。
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午2:02:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map queryClubMember(Map parameter) throws Exception;

	/**   
	 * 3.5.13	俱乐部会员发卡记录查询
	 * @Function queryClubMemberCard
	 * @Description 查询俱乐部会员卡发放记录
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午2:07:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public Map queryClubMemberCard(Map parameter) throws Exception;

	/**   
	 * 查询账户账期信息
	 * @Function queryAcctBillCycle
	 * @Description 
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午1:23:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public Map queryAcctBillCycle(Map parameter) throws Exception;

	/**
	 * 享受（兑换）俱乐部服务
	 * @param parameter
	 * @return
	 * @throws Exception
	 * @author: liaosc
	 * @date: 2012-5-11 下午3:26:35
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-5-11       liaosc         v1.0.0               修改原因
	 */
	public Map enjoyService(Map parameter) throws Exception;

	/**
	 * VIP免费服务查询
	 * @param parameter {
	 * String ServiceNum计费号码
	 * long ClubId 俱乐部编码
	 * long ServiceId服务编码
	 * }
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jul 19, 2012 9:31:57 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 19, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public Map queryClubServiceFreeTimes(Map parameter) throws Exception;

	public Map queryCustomerValue(Map map) throws Exception;

	public Map modifyCustomerValue(Map parameter) throws Exception;

	public Map actionCmInsCmRel(Map parameter) throws Exception;

	public Map queryCustAcctRels(Map parameter) throws Exception;

	/**
	 * 集团合同操作
	 * @param parameter {
	 * String CustId计费号码
	 * }
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jul 19, 2012 9:31:57 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 19, 2012     xiezl        v1.0.0               修改原因<br>
	 */
	public Map actionGroupContract(Map parameter) throws Exception;

	public Map queryGroupCustValue(Map parameter) throws Exception;

	/**
	 * 查询信用度登记信息及记录
	 * @param serviceNum
	 * @param userId
	 * @param queryType
	 * @return
	 * @throws Exception
	 */
	public Map queryCreditByServiceNum(Map map) throws Exception;

	/**
	 * 根据账户编号查询每次邮政代扣额度
	 * @param acctId
	 * @param queryType
	 * @return
	 * @throws Exception
	 */
	public Map queryBankAcctPaymentInfo(Map map) throws Exception;

	/**
	 * 查询是否降零账户
	 * @param parameter {
	 * String acctId账户编号
	 * }
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jul 19, 2012 9:31:57 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 19, 2012     xiezl        v1.0.0               修改原因<br>
	 */
	public Map queryCreditLevelByAcctId(Map map) throws Exception;

	/*
	 * 提供给个人业务撤单用
	 */
	public Map userReceipt(Map parameter) throws Exception;

	/**   
	 * 开通信用度登记
	 * @Function createParty
	 * @Description 创建参与人信息<br>
	 * 
	 * @param serviceNum 手机号码   如果没有此值 请传递 -1
	 * @param userId 用户编号	      如果没有此值 请传递 -1
	 * @param actType 			  操作类型 0—开通，1—取消
	 * @return 处理结果
	 * @throws Exception 
	 *  retCode   0     成功
	 *            1001  服务号码{0}不存在 
	 *            1002  已经开通，无需办理
	 *            1003  未开通，无需取消
	 *            1004  其它错误
	 *  retMsg  错误信息
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public Map dredgeCreditEnter(Map parameter) throws Exception;

	/*
	 * 黑名单增删改
	 */
	public Map modifySpecialCustomer(Map map) throws Exception;

	/**
	 * 根据ServiceNum、UserId、CustId、AcctId查询账户
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public Map queryAcctPaymentInfos(Map map) throws Exception;

	/**   
	 * 3.4.2.16 查询集团帐单寄送信息
	 * @Function queryGrpCustAccountBillPostal
	 * @Description 创建参与人信息<br>
	 * 
	 * @param parameter map对象
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public Map queryGrpCustAcctBill(Map parameter) throws Exception;

	/**   
	 * 3.4.2.18 查询集团信用信息
	 * @Function queryGrpCustCredirMessage
	 * @Description 创建参与人信息<br>
	 * 
	 * @param parameter map对象
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public Map queryGrpCustCredirMessage(Map parameter) throws Exception;

	/**   
	 * 3.4.2.21 查询集团成员基本资料
	 * @Function queryCmGrpMember
	 * @Description 
	 * 
	 * @param parameter map对象
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public Map queryCmGrpMember(Map parameter) throws Exception;

	/**   
	 *3.4.2.7 查询集团成员信息
	 * @Function queryCmGrpMember
	 * @Description 
	 * 
	 * @param parameter map对象
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public Map queryCmGrpMemberList(Map parameter) throws Exception;

	/**
	 * 集团下发账户新增接口
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public Map saveAccount4BBoss(Map map) throws Exception;

	/**
	 * 提供外围接口查询联系人
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public Map queryContact4CBoss(Map map) throws Exception;

	/**   
	 * 查询账户当前账期和未生效账期信息，按生效日期倒序排列
	 * @Function queryCurrAcctBillCyclesByAcctId
	 * @Description 
	 *
	 * @param parameter 
	 * @param   acctId   账户ID
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author caiyu
	 * @date 2012-10-4
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-4     caiyu           v1.0.0               修改原因<br>
	 */
	public Map queryNextAcctBillCycle(Map parameter) throws Exception;

	/**
	* 
	* @Function checkAirportAndTrainService
	* @Description 机场,火车站VIP服务鉴权
	*
	* @param vipServiceBusiDataBean
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author 
	* @date Mar 15, 2012 11:33:24 AM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     xiezl           v1.0.0               修改原因<br>
	*/
	public Map checkAirportAndTrainService(Map parameter) throws Exception;

	/**
	* 
	* @Function recordAirportAndTrainService
	* @Description 机场,火车站服务记帐接口
	*
	* @param vipServiceBusiDataBean
	* @return
	* @throws Exception
	*
	* @version v1.0.1
	* @author kangzk
	* @date Mar 15, 2012 2:02:11 PM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	*/
	public Map recordAirportAndTrainService(Map parameter) throws Exception;

	public Map qryVipCardInfo(Map parameter) throws Exception;

	/**   
	 * 2021跨区入网客户积分和等级转入和冲正接口
	 * @Function transferCustScoreAndGrade
	 * @Description 
	 * 
	 * @param parameter map对象
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public Map transferCustScoreAndGrade(Map parameter) throws Exception;

	/**   
	 * 查询集团客户的下级集团
	 * @Function qrySubordinateGrpCust
	 * @Description 
	 * 
	 * @param parameter map对象
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public Map qrySubordinateGrpCust(Map parameter) throws Exception;

	/**   
	 * @Function queryGroupCustByBillId
	 * @Description 根据手机号码查询归属集团信息
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 8, 2012 7:40:10 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map queryGroupCustByBillId(Map parameter) throws Exception;

	/**   
	 * @Function queryCmInsCmRelByCds
	 * @Description 根据条件查询客户用户关系表
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 8:38:28 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map queryCmInsCmRelByCds(Map parameter) throws Exception;

	/**   
	 * @Function saveCmInsCmRelValues
	 * @Description 保存客户用户关系信息
	 *
	 * @param lnCmInsCmRelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 25, 2012 12:13:52 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map saveCmInsCmRelValues(Map parameter) throws Exception;

	/**   
	 * @Function queryAcctBankRel
	 * @Description 根据手机号码和账户编号查询签约关系
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 4:34:04 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map queryAcctBankRel(Map parameter) throws Exception;

	/*
	 * 删除客户经理关系
	 */
	public Map delManagerRel(Map parameter) throws Exception;

	/**   
	 * 根据CustId查询集团客户的根结点
	 * @Function queryRootGrpCustomers
	 * @Description 
	 * 
	 * @param parameter Map
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 */
	public Map queryRootGrpCustomers(Map parameter) throws Exception;

	/**   
	 * 销户调用接口更改用户状态、账户信誉度、集团关键人
	 * @Function cancelLationOfUser
	 * @Description 
	 * 
	 * @param parameter Map
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 */
	public Map cancelLationOfUser(Map parameter) throws Exception;

	/**   
	 * 根据集团编码查询集团付费计划信息
	 * @Function getGroupPayPlan4BBoss
	 * @Description 
	 * 
	 * @param parameter Map
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 */
	public Map getGroupPayPlan4BBoss(Map parameter) throws Exception;

	/**   
	 * 根据客户经理编码查询新建集团客户数、删除集团客户数、新建集团成员数、删除集团成员数
	 * @Function getGrpCountInfoByMgrId
	 * @Description 
	 * 
	 * @param parameter Map
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 */
	public Map getGrpCountInfoByMgrId(Map parameter) throws Exception;

	/*
	 * 浦东发展银行签约解约接口
	 */
	public Map signOrfireBank(Map parameter) throws Exception;

	/**
	 * 提供CBOSS查询客户信息
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public Map queryDiffAreaCustInfo(Map parameter) throws Exception;

	/**
	 * 根据手机号码查询VIP客户信息
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public Map qryVipInfo(Map parameter) throws Exception;

	/**   
	 * 集团下发新增
	 * @Function addGrpCustomer4BBoss
	 * @Description 
	 * 
	 * @param parameter Map
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 */
	public Map addGrpCustomer4BBoss(Map parameter) throws Exception;

	/**
	* 
	* @Function vipUseFreeService
	* @Description VIP免费服务次数
	*
	* @param 
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author 
	* @date Mar 15, 2012 11:33:24 AM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	*/
	public Map vipUseFreeService(Map parameter) throws Exception;

	/**
	* 
	* @Function upGrpCustomerDetailTemp
	* @Description 3.6.3.2	修改集团客户资料接口
	*
	* @param 
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author 
	* @date Mar 15, 2012 11:33:24 AM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	*/
	public Map upGrpCustomerDetailTemp(Map parameter) throws Exception;

	/**
	* 
	* @Function upGrpChangePwd
	* @Description 3.6.4.1	修改集团密码接口
	*
	* @param 
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author 
	* @date Mar 15, 2012 11:33:24 AM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	*/
	public Map upGrpChangePwd(Map parameter) throws Exception;

	/**
	* 
	* @Function acceptProdMemTemp
	* @Description 3.6.2.2	产品管理员增加,删除
	*
	* @param 
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author 
	* @date Mar 15, 2012 11:33:24 AM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	*/
	public Map acceptProdMemTemp(Map parameter) throws Exception;

	/**
	* 
	* @Function acceptProdMemTemp
	* @Description3.6.2.1	产品管理员查询
	*   网内成员的一种角色,按产品管理员查询出来.(主要传入roleId=9)查出所有的产品
	* @param 
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author 
	* @date Mar 15, 2012 11:33:24 AM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	*/
	public Map qryProdMgntMem(Map parameter) throws Exception;

	/**
	* 
	* @Function acceptProdMemTemp
	* @Description3.6.1.2	 集团成员的批量预增加,删除,接口.
	* @param 
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	*  return sequenceNos 序列号结构列表
	* @author 
	* @date Mar 15, 2012 11:33:24 AM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	*/
	public Map acceptGrpMemTemp(Map parameter) throws Exception;

	/**
	 * 根据集团客户编码与用户编码查询集团家属信息
	 * @param parameter 输入参数 客户编码 CustId  用户编码UserId
	 * @return
	 * @throws Exception
	 */
	public IContactValue[] qryGroupContact(Map parameter) throws Exception;

	/**
	 * 根据集团客户编码与用户编码查询集团网内成员信息
	 * @param parameter 输入参数 客户编码 CustId  用户编码UserId
	 * @return
	 * @throws Exception
	 */
	public IGroupMemberValue[] qryGrpMem(Map parameter) throws Exception;

	/**
	 * 根据用户编号查询集团网内成员信息
	 * @param userId 用户编号
	 * @return
	 * @throws Exception
	 */
	public IGroupMemberValue[] qryGrpMemByUserId(long userId) throws Exception;

	/**
	 * 查询集团客户信息包含扩展信息
	 * @param parameter   输入参数 客户编码 CustId
	 * @return
	 * @throws Exception
	 */
	public IBOLnCmGroupInfoValue[] qryGroupInfo(Map parameter) throws Exception;

	/**
	 * 根据成员手机号码查询集团客户信息
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public Map qryGroupInfos(Map map) throws Exception;

	/**
	 * 根据用户的 VIP信息 集团成员 客户经理信息查询
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public Map qryUserInfo(Map map) throws Exception;

	/**
	* 
	* @Function modifyClubMember
	* @Description 俱乐部成员新增、修改、删除.
	* @param 
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	*  return sequenceNos 序列号结构列表
	* @author 
	* @date Mar 15, 2012 11:33:24 AM
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	*/
	public Map modifyClubMember(Map parameter) throws Exception;

	/**   
	 * @Function qryVipMangerInfo
	 * @Description 根据用户的服务号码或者用户编码查询电话经理及电话经理组信息
	 *
	 * @param paraMap  
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Nov 2, 2012 4:05:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 */
	public Map qryVipMangerInfo(Map parameter) throws Exception;

	/**   
	 * @Function isMobilePayUser
	 * @Description 根据billId 查询是否手机支付用户
	 *
	 * @param paraMap  
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Nov 2, 2012 4:05:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 */
	public Map isMobilePayUser(Map parameter) throws Exception;

	/**   
	 * @Function queryAuditValues
	 * @Description 根据客户经理编码查询需要审核的数据
	 *
	 * @param managerId 客户经理编码  type 查询类型 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Nov 2, 2012 4:05:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 */
	public Map queryAuditValues(Map paraMap) throws Exception;

	/**   
	 * @Function updateCustStatus
	 * @Description 
	 *
	 * @param custId
	 * @param newStatus 0潜在；1在网；2离网
	 * @param oldStatus 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Mar 7, 2014 11:22:32 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 7, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public void updateCustStatus(long custId, int newStatus, int oldStatus) throws Exception;

	/**
	 * 
	 * @param paraMap
	 * @return
	 * @throws Exception
	 */
	public Map queryAuditValuesNew(Map paraMap) throws Exception;

	/**
	 * 
	 * @param paraMap
	 * @return
	 * @throws Exception
	 */
	public Map queryAgentPartnerInfo(Map paraMap) throws Exception;

	/**
	 * 
	 * @param custId
	 * @param billId
	 * @return
	 * @throws Exception
	 */
	public Map queryGMBorContact(long custId, String billId) throws Exception;

	/**
	 * 根据custId 或者groupId查询客户经理
	 * @param custId
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public String getGroupManagerByCustIdOrGroupId(long custId, String groupId) throws Exception;

	/**
	 * 根据custId 查询客户成员数
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public Map queryGroupMemberByCustId(Map parameter) throws Exception;

	/**
	 * 根据custId  userId acctId 查询用户的扩展信息
	 * @param custId
	 * @param userId
	 * @param acctId
	 * @returnMap {
	 * 		resultMap.put("CUST_NAME", "");			//客户名称
	     *		resultMap.put("BIRTHDAY", "");			//客户生日
	     *		resultMap.put("PAY_METHOD","");			//支付类型
	     *		resultMap.put("CREDIT_LEVEL", "");		//信誉等级
	     *		resultMap.put("CREDIT_VALUE", "");		//信誉额度
	     *		resultMap.put("OUTLINE_ALARM", ""); 		//离网预警
	     *		resultMap.put("AVG_ARPU", "");			//平均ARPU
	     *		resultMap.put("CURRENT_TERMINAL", "");		//当前终端
	     *		resultMap.put("FLUX_USE", "");			//流量使用
	     *		resultMap.put("AVG_CALL_TIMES_DAY", "");	//日平均通话时长
	     *		resultMap.put("FIELD_1", "");	//预留字段1
	     *		resultMap.put("FIELD_2", "");	//预留字段2
	     *		resultMap.put("FIELD_3", "");	//预留字段3
	     *		resultMap.put("FIELD_4", "");	//预留字段4
	     *		resultMap.put("FIELD_5", "");	//预留字段5
	     *		resultMap.put("FIELD_6", "");	//预留字段6
	     *		resultMap.put("FIELD_7", "");	//预留字段7
	     *		resultMap.put("FIELD_8", "");	//预留字段8
	     *		resultMap.put("FIELD_9", "");	//预留字段9
	     *		resultMap.put("FIELD_10", "");	//预留字段10		
	 * 		 
	 * }
	 * @throws Exception
	 */
	public Map queryCustUnionInfo(Map parameter) throws Exception;

	/**   
	 * @Function hasSecForQry
	 * @Description 校验当前的操作员是否有地市权限
	 * true/是	false/没有
	 *
	 * @param userId
	 * @param billId
	 * @param custId
	 * @param regionId 客户用户归属地市
	 * @param opRegionId 操作员地市
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jan 9, 2013 2:12:41 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 9, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public boolean hasSecForQry(long userId, String billId, long custId, String regionId, String curRegionId, long operId) throws Exception;

	/**
	 * 
	* @Function: ICm2InterFSV.java
	* @Description: 根据手机号码，查询所属集团的客户经理
	*
	* @param:billId 手机号码
	* @return：返回结果电话经理信息 IQBOSecCustManagerValue
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Jan 17, 2013 2:46:53 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jan 17, 2013     suntao6           v1.0.0              修改原因
	 */
	public IQBOSecCustManagerValue[] qryGroupMangerInfoByBillId(String billId) throws Exception;

	/**
	 * 
	* @Function: ICm2InterFSV.java
	* @Description: 同步客户信息（party.CM_CLUB_MEMBER、party.CM_GROUP_CONTACT、party.CM_GROUP_MEMBER）
	*
	* @param:phoneNum 手机号 oldCustId 过户前custId  newCustId 过户后custId
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: guansj
	* @date: 2013-1-23 下午02:21:35 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2013-1-23      guansj           v1.0.0              修改原因
	 */
	public void synCustInfo(long phoneNum, long oldCustId, long newCustId) throws Exception;

	/**   
	 * @Function queryGroupContacts
	 * @Description 
	 *
	 * @param custId
	 * @param contType 1:联系人        2:	决策人     3:	AO联系人         5：法人
	 * @param prioryLevel  
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-28 上午10:16:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-28     shitian           v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryGroupContacts(long custId, int contType, int prioryLevel) throws Exception;

	/**   
	 * @Function queryCmInsCmRelByIds
	 * @Description 
	 *
	 * @param custIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2013-8-28 上午10:16:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-28     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByIds(long[] custIds) throws Exception;

	/**   
	 * @Function queryCmInsCmRelByCdns
	 * @Description 
	 *
	 * @param custId
	 * @param userId
	 * @param relType
	 * @param userType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2013-8-28 上午10:16:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-28     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCdns(long custId, long userId, int relType, int userType) throws Exception;

	/**
	 * 
	 * @Function getCustomerInfoGLConfig
	 * @Description 
	 *
	 * @return String[]{CUST_NAME:客户名称
	               CUST_CERT_TYPE：证件类型
	               CUST_CERT_CODE：证件号码
	               BIRTHDAY：客户生日
	               CUST_STATUS：客户状态}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-6-5 上午11:20:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-5     yangjh           v1.0.0               修改原因<br>
	 */
	public String[] getCustomerInfoGLConfig() throws Exception;

	/**   
	 * @Function dealAccount
	 * @Description 处理账户信息
	 *
	 * @param voAccountValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-25 下午5:24:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-25     Administrator           v1.0.0               修改原因<br>
	 */
	public long dealAccount(IVOAccountValue voAccountValue) throws Exception;

	/**   
	 * @Function dealCustomer
	 * @Description 处理客户信息
	 *
	 * @param voCustValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-25 下午5:24:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-25     Administrator           v1.0.0               修改原因<br>
	 */
	public long dealCustomer(IVOCustValue voCustValue) throws Exception;
	
	/**
	 * 处理纯User
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-11-21
	* ICm2InterFSV
	 */
	public long dealPureUser(IVOCustValue voCustValue) throws Exception;

	/**
	 * 根据账户ID查询帐务关系
	 * 
	 * @param acctId
	 * @param payType(-1:全部,1：默认,2：代付)
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int startIdx, int endIdx) throws Exception;

	/**
	 * 根据账户ID查询帐务关系数量
	 * 
	 * @param acctId
	 * @param payType(-1:全部,1：默认,2：代付)
	 * @return
	 * @throws Exception
	 */
	public int getInsAccrelsCountByAcct(long acctIdx, long payType) throws Exception;

	/**   
	 * @Function dealCustomer
	 * @Description 处理客户信息
	 *
	 * @param voCustValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-25 下午5:24:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-25     Administrator           v1.0.0               修改原因<br>
	 */
	public IBOCmCustBadRecordValue[] queryCmCustBadRecord(long custId) throws Exception;

	/**   
	 * @Function getCustomerDebitStatus
	 * @Description 提供给UIP的接口
	 *
	 * @param voCustValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-29 下午5:24:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-29     huangqun          v1.0.0               修改原因<br>
	 */
	public Map getCustomerDebitStatus(Map map) throws Exception;

	/**   
	 * @Function queryCustomerContacts
	 * @Description 个人客户就查询客户本身的联系信息(返回是1长度到数组)；集团客户返回集团的联系人信息（主要联系人）
	 * 
	 * 个人客户的联系方式有以下几种：
	 * contactValue.getBillId	联系电话
	 * contactValue.getContEmail	email
	 * contactValue.getContFax	fax
	 * contactValue.getSmsNumber	短信
	 * contactValue.getEmergencyNumber	紧急电话
	 * contactValue.getContAddress	平信
	 * contactValue.getMmsNumber	彩信
	 * 
	 * 
	 * 目前联系人的联系方式只有以下5种：
	 * contactValue.getMainEmail	主要email
	 * contactValue.getSecondEmail	次要emial
	 * contactValue.getMainContNumber	主要电话
	 * contactValue.getSecondContNumber	次要电话
	 * contactValue.getSmsNumber	短信
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午4:50:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryCustomerContacts(long custId) throws Exception;

	/**   
	 * @Function queryCustAccts
	 * @Description 
	 *
	 * @param custId
	 * @param acctType
	 * CmConstants.AccountConstants.SELF_ACCT 自有
	 * CmConstants.AccountConstants.REAL_ACCT 代付
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-6 下午3:32:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-6     shitian             v1.0.0               修改原因<br>
	 */
	public IAccountValue[] queryCustAccts(long custId, int acctType) throws Exception;

	/**
	 * 为OSE接口 提供
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-9-9
	* Cm2InterFSVImpl
	 */
	public IAccountValue[] queryCustAcctsForOSE(long custId, int acctType) throws Exception ;
	
	
	/**   
	 * @Function queryCmPartyRole
	 * @Description 提供给UIP的接口,查询客户的角色
	 *
	 * @param voCustValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-10 下午5:24:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-10     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmPartyRoleValue[] queryCmPartyRole(long custId) throws Exception;

	/**   
	 * @Function queryCustomerByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-14 上午10:12:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-14     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerByAcctId(long acctId) throws Exception;

	/**   
	 * @Function queryCustomersByCdns
	 * @Description 
	 *
	 * @param custName
	 * @param cprNo
	 * @param addressId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-14 下午2:48:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-14     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryIndivCustomersByCdns(String custName, String cprNo, long addressId) throws Exception;

	/**   
	 * @Function queryGroupCustomersByCdns
	 * @Description 
	 *
	 * @param CompanyName
	 * @param cvrNo
	 * @param kobNo
	 * @param addressId
	 * @param registrationNo
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-14 下午2:51:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-14     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryGroupCustomersByCdns(String CompanyName, String cvrNo, String kobNo, long addressId, String registrationNo) throws Exception;

	/**   
	 * @Function queryGroupCustomersByCdnsNew
	 * @Description 只返回签合同的集团
	 *
	 * @param CompanyName
	 * @param cvrNo
	 * @param kobNo
	 * @param addressId
	 * @param registrationNo
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-3-14 下午9:34:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-14     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryGroupCustomersByCdnsNew(String CompanyName, String cvrNo, String kobNo, long addressId, String registrationNo) throws Exception;

	/**   
	 * @Function dealCustAddress
	 * @Description 
	 *
	 * @param voAddressValue
	 * voAddressValue.getContMedium().setContMedTypeId()如果是新增需要设置地址类型
	 * 如果该对象中传入了关系主键，则视为修改，否则新增
	 * CmConstants.AddressId.legalAddress			法律地址
	 * CmConstants.AddressId.mailingAddress			邮寄地址
	 * CmConstants.AddressId.deliveryAddress		送货地址
	 * CmConstants.AddressId.farmAddress			农场地址
	 * CmConstants.AddressId.contatctAddress		联系地址
	 * 
	 * @return	addressId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-16 下午4:36:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-16     shitian             v1.0.0               修改原因<br>
	 */
	public long dealCustAddress(IVOCustAddressValue voAddressValue) throws Exception;

	/**   
	 * @Function queryCmInsCmrelInfo
	 * @Description 
	 *
	 * @param custId
	 * @param relaType
	 * @param userId
	 * @param userType
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-19 下午2:51:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-19     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrelInfo(long custId, long userId, int relaType, int userType) throws Exception;

	/**   
	 * @Function queryCmCustomerInfo
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-19 下午2:51:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-19     huangqun             v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCmCustomerInfo(long custId) throws Exception;

	/**   
	 * @Function queryCmCustContactMediumInfo
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-19 下午2:51:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-19     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue[] queryCmCustContactMediumInfo(long custId) throws Exception;

	/**   
	 * @Function queryCmxIndivCustomer
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-19 下午2:51:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-19     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustomerValue queryCmxIndivCustomer(long custId) throws Exception;

	/**   
	 * @Function queryTerminateCustomerInfo
	 * @Description 
	 *
	 * @param custType,custId,custName,certType,certCode(custType必传)
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-20 下午2:51:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-20     huangqun             v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryTerminateCustomerInfo(int custType, long custId, String custName, int certType, String certCode) throws Exception;

	/**   
	 * @Function queryCustAddress
	 * @Description 
	 *
	 * @param custId
	 * @param addressType	地址类型；查询所有地址传-1
	 * CmDkConstants.CustContMedium.HOME_ADDRESS
	 * CmDkConstants.CustContMedium.POST_ADDRESS
	 * CmDkConstants.CustContMedium.LEGAL_ADDRESS
	 * CmDkConstants.CustContMedium.DELIVERY_ADDRESS
	 * CmDkConstants.CustContMedium.FARM_ADDRESS
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-24 上午10:00:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-24     shitian             v1.0.0               修改原因<br>
	 */
	public IVOCustAddressValue[] queryCustAddress(long custId, long addressType) throws Exception;

	public long saveGroupMember(IBOCmGroupMemberValue grpMemberVal) throws Exception;

	public IBOCmGroupMemberValue getGroupMember(long memberCustId, long custId) throws Exception;

	/**   
	 * @Function queryIndivCustomers
	 * @Description 
	 *
	 * @param legalAddressId
	 * @param firstName
	 * @param laseName
	 * @param contactPhoneNumber
	 * @param Segment
	 * @param categroy
	 * @return
	 *  CUST_ID                                           CUSTID                      
		FIRST_NAME                                        FIRSTNAME                   
		LAST_NAME                                         LASTNAME                              
		CUST_CERT_CODE                                    CPRNUMBER                   
		PERSON_STATUS                                     CPRSTATUS                   
		STATUS_EFF_DATE                                   CPRSTATUSDATE               
		CREATE_DATE                                       CREATEDDATE                 
		CUST_STATUS                                       CUSTOMERSTATUS              
		GENDER                                            GENDER                      
		BIRTHDAY                                          BIRTHDAY                    
		PHYSIOLOGICAL_STATE                               PHYSIOLOGYSTATUS            
		SEGMENT_ID                                        SEGMENT                     
		CONT_NAME                                         LEGALGUARDIAN               
		EFFECTIVE_DATE                                    LEGALGUARDIANUPDATEDATE     
		CUR_RESIDENCE_STR_DATE                            MOVEDATE                    
		DIRECT_MARKETING_PROTECTION                       COMMERCIALPROTECTION        
		PROTECT_EFF_DATE                                  PROTECTEFFECTIVEDATE        
		PROTECT_EXPIRE_DATE                               PROTECTEXPIREDATE           
		MANUAL_COMMERCIAL_PROTECTION                      PERMISSIONPROPOSAL          
		MANUAL_PROTECT_EFFECTIVE_DATE                     EFFECTIVEDATE               
		MANUAL_PROTECT_EXPIRE_DATE                        EXPIRATIONDATE              
		PROTECT_STAUS   (0否，1是)                         PROTECTSTATUS               
		ADDRESS_DETAIL                                 	  CUSTOMERLEGALADDRESS  
		REGION_ID										  REGION_ID
														  SEGMENT_NAME
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-28 下午5:01:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-28     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryIndivCustomers(long custIds[], String state, int custStatus, long legalAddressId, String firstName, String laseName,
			String contactPhoneNumber, long segment, long categroy, String custServiceId, int start, int end) throws Exception;

	/**   
	 * @Function queryIndivCustomersCount
	 * @Description 查询数量
	 *
	 * @param legalAddressId
	 * @param firstName
	 * @param laseName
	 * @param contactPhoneNumber
	 * @param segment
	 * @param categroy
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-29 上午10:08:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-29     shitian             v1.0.0               修改原因<br>
	 */
	public int queryIndivCustomersCount(long custIds[], String state, int custStatus, long legalAddressId, String firstName, String laseName, String contactPhoneNumber,
			long segment, long categroy, String custServiceId) throws Exception;

	/**   
	 * @Function queryGroupCustomers
	 * @Description 
	 *
	 * @param cvrNo
	 * @param shortName
	 * @param companyName
	 * @param legalAddressId
	 * @param contPhone
	 * @param managerId			客户经理ID
	 * @param managerGroupId	客户经理组ID
	 * @param segment
	 * @param category
	 * @return
	 *  CUSTID											CUST_ID,                    
		COMPANYNAME                                     CUST_NAME,                  
		SHORTNAME                                       SHORT_NAME,                 
		CVRNUMBER                                	    TAX_ID,       		       
		KOBNUMBER                                       CUST_CERT_CODE,             
		SEGMENT                                         SEGMENT_ID,                 
		CATEGORY                                        CUST_SERVICE_LEVEL,         
		SUBSEGMENT                                      GROUP_SUB_TYPE,             
		LEGALPERSONID                                   LEGAL_CUST_ID,              
		WEBSITE                                         GROUP_WEB,                  
		STATUS                                          CUST_STATUS,                
		ACCOUNTMANAGER                                  MANAGER_ID,                 
		CONTACTPOINT                                    IS_CONTACT_POINT,           
		PASSWORD                                        CUST_PASSWORD,              
		CUSTOMERLEGALADDRESS                            ADDRESS_DETAIL,             
		BICOMPANYNAME                                   BI_COMPANY_NAME,            
		LEGALFORM                                       LEGAL_FORM,                 
		RATING                                          RATING_CODE,                
		COMPANYTYPE                                     GROUP_TYPE,                 
		REGISTRATIONDATE                                REGISTRATION_DATE,          
		MKTPERMISSION                                   DIRECT_MARKETING_PROTECTION,
		AKSSTATUS                                       AKS_STATUS,                 
		AKSREGISTRATIONDATE                             AKS_REGISTRATION_DATE,      
		CREDITCLASS                                     CREDIT_LEVEL,               
		CREDITMAX                                       CREDIT_VALUE,               
		EMPLOYEENUMBERRANGE                             STAFF_AMOUNT_TYPE,          
		EMPLOYEENUMBER                                  STAFF_AMOUNT,               
		EMPLOYEEHISTORICAL                              LAST_YEAR_EMPLOYEES,        
		REMARKS                                         REMARKS  
		  												SEGMENT_NAME
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-29 下午3:17:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-29     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryGroupCustomers(long custIds[], String state, int custStatus, String cvrNo, String shortName, String companyName, long legalAddressId,
			String contPhone, long managerId, long managerGroupId, long segment, long category, String custServiceId, int start, int end) throws Exception;

	/**
	 * 新增接口 获取ext15有值的former集团客户
	 * @param custStatus
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] queryHasExt15FormerGroupCustomers(int start, int end) throws Exception;
	/**   
	 * @Function queryGroupCustomersCount
	 * @Description 
	 *
	 * @param cvrNo
	 * @param shortName
	 * @param companyName
	 * @param legalAddressId
	 * @param contPhone
	 * @param managerId
	 * @param managerGroupId
	 * @param segment
	 * @param category
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-29 下午5:07:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-29     shitian             v1.0.0               修改原因<br>
	 */
	public int queryGroupCustomersCount(long custIds[], String state, int custStatus, String cvrNo, String shortName, String companyName, long legalAddressId, String contPhone,
			long managerId, long managerGroupId, long segment, long category, String custServiceId) throws Exception;

	/**   
	 * @Function queryPayerAccts
	 * @Description 查询客户代付的所有账户
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-10 下午3:19:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-10     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCMPartyAcctRelValue[] queryPayerAccts(long custId) throws Exception;

	/**   
	 * @Function queryGroupMembers
	 * @Description 查询集团成员
	 *
	 * @param qryType
	 * @param qryValue
	 * @param billId
	 * @param firstName
	 * @param lastName
	 * @param memberDesc
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 上午10:13:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public IGroupMemberValue[] queryGroupMembers(long memberCustId, long relaId, int qryType, String qryValue, String billId, String firstName, String lastName, String memberDesc,
			int start, int end) throws Exception;

	/**   
	 * @Function queryGroupMembersCount
	 * @Description 查询数量
	 *
	 * @param qryType
	 * @param qryValue
	 * @param billId
	 * @param firstName
	 * @param lastName
	 * @param memberDesc
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 上午10:26:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public int queryGroupMembersCount(long memberCustId, long relaId, int qryType, String qryValue, String billId, String firstName, String lastName, String memberDesc)
			throws Exception;

	/**   
	 * @Function queryGroupContacts
	 * @Description 查询集团联系人
	 *
	 * @param custId
	 * @param contType
	 * @param partyName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 上午11:34:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public IVOCustContactValue[] queryGroupContacts(long custId, int contType, String partyName, long custContId) throws Exception;

	/**   
	 * @Function dealGroupContact
	 * @Description 维护集团联系人信息
	 *
	 * @param voContactValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 下午3:11:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public void dealGroupContact(IVOCustContactValue voContactValue) throws Exception;

	/**   
	 * @Function saveDefaultCustomer
	 * @Description 保存默认客户
	 * 必塞条件custValue.getCustomer().setContEmail();
	 * @param custValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 下午5:48:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public long saveDefaultCustomer(IVOCustValue custValue) throws Exception;

	/**   
	 * @Function queryGroupAcctInfo
	 * @Description 根据参数查集团客户下所有账户信息
	 * 必塞条件cmmpanyCustId;
	 * @param cmmpanyCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 下午5:48:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-3    sunqi             v1.0.0               修改原因<br>
	 */
	public List<Map<Object, Object>> queryGroupAcctInfo(long cmmpanyCustId, int status, String acctPayer, String acctOwner, String acctName, long accountId, int startIndex,
			int pageSize) throws Exception;

	public int queryGroupAcctInfoCount(long cmmpanyCustId, int status, String acctPayer, String acctOwner, String acctName, long accountId) throws Exception;

	/**   
	 * @Function querPayerByAcctId
	 * @Description 根据acctId查询payer信息
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 12, 2012 8:50:47 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 12, 2014     sunqi          v1.0.0               修改原因<br>
	 */
	public IQBOCmPartyValue querPayerByAcctId(long acctId) throws Exception;

	/**   
	 * @Function queryCustomerByAddress
	 * @Description 
	 *
	 * @param addressIds
	 * @param addressType
	 * 12：邮寄地址
	 * 14：送货地址
	 * 11：法律地址
	 * 15：农场地址
	 * 16：联系地址
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-5 上午10:52:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-5     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryCustomerByAddress(long[] addressIds, int addressType) throws Exception;

	/**   
	 * @Function queryCustomerByCPR
	 * @Description   查询客户信息
	 * @param cpr
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-05 下午5:48:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-05    huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue[] queryCustomerByCPR(String cpr) throws Exception;

	/**
	  * 根据条件查询用户信息数量
	  * @Function queryManagerIdsByCustId
	  * @Description 
	  *
	  * @param queryType 1custid 2 cvenumber
	  * @param queryValue
	  
	  * @return
	  *
	  * @version v1.0.0
	  * @author sunqi
	  * @date 2014-12-10 下午3:55:38
	  * 
	  * <strong>Modification History:</strong><br>
	  * Date         Author          Version            Description<br>
	  * ---------------------------------------------------------<br>
	  * 2014-12-10     sunqi           v1.0.0               修改原因<br>
	  */
	public long[] queryManagerIdsByCustId(int queryType, String queryValue) throws Exception;

	/**
	 * 根据税号查询集团客户
	 * @Function queryGroupCustomerByCVR(String cvr)
	 * @Description 
	 *
	 * @param cvr
	 * @return
	 *
	 * @version v1.0.0
	 * @author sunqi
	 * @date 2014-12-16 下午3:55:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-16     huangqun           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryGroupCustomerByCVR(String cvr) throws Exception;

	/**   
	 * @Function queryCustomerByDeptId
	 * @Description 根据部门id查询集团客户信息
	 *
	 * @param deptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-17 上午10:10:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-17     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerByDeptId(long deptId) throws Exception;

	/**   
	 * @Function queryGroupOrganizesById
	 * @Description 
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-5 下午3:54:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-5     shitian             v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryGroupOrganizesById(long groupCustId) throws Exception;

	/**   
	 * @Function deleteAccount
	 * @Description 
	 *
	 * @param acctId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-6 下午3:13:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-6     shitian             v1.0.0               修改原因<br>
	 */
	public void deleteAccount(long acctId) throws Exception;

	/**   
	 * @Function modifyAcctActive
	 * @Description 
	 *
	 * @param acctId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-9 上午10:31:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-9     shitian             v1.0.0               修改原因<br>
	 */
	public void modifyAcctActive(long acctId) throws Exception;

	/**   
	 * @Function queryCustomersByCols
	 * @Description 根据集团客户证件号码和税号查询集团
	 *
	 * @param colValues
	 * @param colName
	 * 如果是根据KOB查询，colName：CUST_CERT_CODE；如果根据cvr查询，colName：TAX_ID
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-16 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-16     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomersByCols(String[] colValues, String colName) throws Exception;

	/**   
	 * @Function queryCustomersByMemberCustId
	 * @Description 根据集团成员id查询集团客户
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-16 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-16     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomersByMemberCustId(long memCustId) throws Exception;

	/**   
	 * @Function saveCustomer
	 * @Description 保存客户信息
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-4-16 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-4-16     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveCustomer(ICustomerValue value) throws Exception;

	/**   
	 * @Function mergeCustomerData
	 * @Description 合并客户资料
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-4-16 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-4-16     huangqun             v1.0.0               修改原因<br>
	 */
	public long mergeCustomerData(long newCustId, long oldCustId) throws Exception;

	/**   
	 * @Function queryCustIdByAcctServiceId
	 * @Description 根据旧的accountId查询custId
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-4-16 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-4-16     huangqun             v1.0.0               修改原因<br>
	 */
	public long queryCustIdByAcctServiceId(String acctServiceId) throws Exception;

	/**   
	 * @Function queryPayerByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * key:
	 * CERT_TYPE(8:CPR,17:KOB)
	 * CERT_CODE(CPR或者KOB号码)
	 * PAYER_NAME
	 * CVR_NO(集团税号)
	 * ACCT_ID
	 * ACCT_TYPE{1:own,2:paid}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-18 上午11:21:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-18     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainer queryPayerByAcctId4Billing(long acctId) throws Exception;

	/**   
	 * @Function queryCustIfDunning
	 * @Description  查询该客户下的账户是否存在dunning的
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-7-22 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-7-22     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean queryCustIfDunning(long custId) throws Exception;

	/**   
	 * @Function queryGroupContact
	 * @Description  查询一个集团客户的联系人信息
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-7-22 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-7-29     huangqun             v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryGroupContact(long custId) throws Exception;

	/**   
	 * @Function modifyGroupContact
	 * @Description  修改集团联系人信息
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-7-22 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-7-29     huangqun             v1.0.0               修改原因<br>
	 */
	public void modifyGroupContact(long custId, IBOCmContactContMediumValue[] values) throws Exception;

	/**   
	 * @Function dealGroupContact
	 * @Description 处理集团联系人信息
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-05 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-05     huangqun             v1.0.0               修改原因<br>
	 */
	public String dealGroupContact(long custId, IBOCmContactContMediumValue[] values) throws Exception;

	/**   
	 * @Function createGroupContactPeople
	 * @Description  新建集团联系人
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-12 上午11:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-12     huangqun             v1.0.0               修改原因<br>
	 */
	public long createGroupContactPeople(long custId, int contType, int priority, String firstName, String lastName) throws Exception;

	/**   
	 * @Function queryBillingAcct
	 * @Description 
	 *
	 * @param pbs
	 * @param ean
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-21 下午4:21:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-21     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmBillingAcctValue[] queryBillingAcct(long acctId, String pbs, String ean) throws Exception;

	/**   
	 * @Function 查询客户用户关系
	 * @Description 
	 *
	 * @param pbs
	 * @param ean
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-21 下午4:21:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-21     shitian             v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmrelCount(long custId, int relType, long userId, String userState) throws Exception;

	/**   
	 * @Function queryCustomerByMedium
	 * @Description 
	 *
	 * @param mediumValue
	 * @param mediumType
	 * @return	客户ID数组
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-23 下午2:20:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-23     shitian             v1.0.0               修改原因<br>
	 */
	public long[] queryCustomerByMedium(String mediumValue, int mediumType) throws Exception;

	/**   
	 * @Function queryBillingAcct
	 * @Description 
	 *
	 * @param addressId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-21 上午11:07:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-21     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmBillingAcctValue[] queryBillingAcct(String addressId) throws Exception;

	/**   
	 * @Function queryPayerInfo
	 * @Description 根据cpr查询纯payer，如果有其他角色，不返回null
	 *
	 * @param cpr
	 * @return	
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-30 下午3:40:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-30     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmPayerInfoValue queryPayerInfo(String cpr) throws Exception;

	/**   
	 * @Function queryPayerByAddress
	 * @Description 
	 *
	 * @param addressIds
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-30 下午3:47:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-30     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmPayerInfoValue[] queryPayerByAddress(long[] addressIds, String custName) throws Exception;

	/**   
	 * @Function saveDefaultCustomer
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-11-5 下午3:48:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-11-5     shitian             v1.0.0               修改原因<br>
	 */
	public long saveDefaultCustomer(long partyId) throws Exception;

	/**   
	 * @Function queryGroupCustomers
	 * @Description 
	 *
	 * @param custId
	 * @param CompanyName
	 * @param cvrNo
	 * @param kobNo
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-8 上午11:02:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-8     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryGroupCustomers(long custId, String CompanyName, String cvrNo, String kobNo, int start, int end) throws Exception;

	/**   
	 * @Function queryGroupCustomersCount
	 * @Description 
	 *
	 * @param custId
	 * @param CompanyName
	 * @param cvrNo
	 * @param kobNo
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-8 上午11:04:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-8     shitian             v1.0.0               修改原因<br>
	 */
	public int queryGroupCustomersCount(long custId, String CompanyName, String cvrNo, String kobNo) throws Exception;

	/**
	 * 从Billing同步运营商信息
	 * @Function SyncBsOperatorsFromBilling
	 * @Description 
	 *
	 * @param plmnId(运营商编号)
	 * @param OperatorsInfo{CUSTOMER_TYPE,NAME,PLMN_ID,REMARK}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-12-8 上午9:08:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-8     yangjh           v1.0.0               修改原因<br>
	 */
	public void SyncBsOperatorsFromBilling(String plmnId, Map OperatorsInfo) throws Exception;

	/**   
	 * @Function modifyLegalPersonId
	 * @Description 
	 *
	 * @param custId
	 * @param cprNo
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-18 上午11:04:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-18    huangqun             v1.0.0               修改原因<br>
	 */
	public void modifyLegalPersonId(long custId, String cprNo) throws Exception;

	/**   
	 * @Function queryPartyPermissions
	 * @Description 
	 *
	 * @param partyId
	 * @param roleType	1.个人(客户，使用者，员工)；2.集团；3.联系人
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-1-19 上午10:42:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-1-19     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPartyPermissionValue[] queryPartyPermissions(long partyId, int roleType) throws Exception;

	/**   
	 * @Function savePartyPermission
	 * @Description 
	 *
	 * @param partyPermissionValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-1-19 上午10:43:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-1-19     shitian             v1.0.0               修改原因<br>
	 */
	public void savePartyPermission(IBOCmPartyPermissionValue[] partyPermissionValues) throws Exception;

	/**   
	 * @Function modifyAcctActive
	 * @Description 
	 *
	 * @param acctId
	 * @param paraMap
	 * key:EFFECTIVE_DATE	传进来的这个生效日期必须是Timestamp类型，内部方法实现是直接拿Timestamp强转的
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-9 上午10:31:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-9     shitian             v1.0.0               修改原因<br>
	 */
	public void modifyAcctActive(long acctId, Map paraMap) throws Exception;

	/**   
	 * @Function queryCustByContactContMedium
	 * @Description 
	 *
	 * @param contMedTypeId
	 *	主要邮箱
		// public static final int MAIN_EMAIL = 201;
		次要邮箱
		// public static final int SECOND_EMAIL = 202;
		主要联系电话
		// public static final int MAIN_PHONE = 301;
		次要联系电话
		// public static final int SECOND_PHONE = 302;
		短信
		// public static final int CONT_SMS = 303;
		//
		联系人法律地址
		// public static final int CONT_LEGAL_ADDRESS = 101;
	 * @param contMedValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-3-8 下午10:39:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-8     shitian             v1.0.0               修改原因<br>
	 */
	public long[] queryCustByContactContMedium(int custType, long contMedTypeId, String contMedValue) throws Exception;
	
	/**
	 * 根据账户ID和状态查询帐务关系
	 * 
	 * @param acctId
	 * @param payType(-1:全部,1：默认,2：代付)
	 * @param state(1:use;0:erase)
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int state, int startIdx, int endIdx) throws Exception;
	
	/**   
	 * @Function queryPartyAcctRel
	 * @Description 
	 *
	 * @param partyId
	 * @param acctIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2017-2-14 下午5:34:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2017-2-14      shitian           v1.0.0               修改原因<br>
	 */
	public IBOCMPartyAcctRelValue[] queryPartyAcctRel(long partyId,long[] acctIds) throws Exception;
}
