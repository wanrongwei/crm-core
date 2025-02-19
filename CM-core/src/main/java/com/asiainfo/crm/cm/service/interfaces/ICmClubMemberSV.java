/**
 * 
 */
package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberTempValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmUserManagerValue;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceAdjustValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ICmClubMemberSV
 * @Description 该类定义了维护俱乐部信息、维护俱乐部成员信息等业务的服务，用于提供给JSP页面、Action、外部接口等调用。
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:33:51
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public interface ICmClubMemberSV {

	/**
	 * 
	 * @Function queryClubMemberById
	 * @Description 查询俱乐部成员
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 13, 2012 3:51:13 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 13, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubMemberValue queryClubMemberById(long memberId) throws Exception;

	/**   
	 * @Function queryClubMemberCardById
	 * @Description 根据会员卡发放记录编号查询
	 *
	 * @param recordId 会员卡发放记录编号
	 * @return 符合会员卡发放记录
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:40:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubMemberCardValue queryClubMemberCardById(long recordId) throws Exception;

	/**   
	 * @Function queryClubMemberCardCount
	 * @Description 根据查询条件查询俱乐部会员卡信息数量
	 *
	 * @param condition 查询条件信息
	 * @return 符合条件的会员卡数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:48:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubMemberCardCount(DataContainer condition) throws Exception;

	/**   
	 * @Function queryClubMemberCardCount
	 * @Description 根据查询条件查询俱乐部会员卡信息
	 *
	 * @param criteria 按照一定格式拼接的查询字符串，默认实现只提供XML字符串的方式。
	 * @return 符合条件的会员卡记录数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:45:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubMemberCardCount(String criteria) throws Exception;

	/**   
	 * @Function queryClubMemberCards
	 * @Description 根据查询条件查询俱乐部会员卡信息
	 *
	 * @param condition 查询条件信息
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:44:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubMemberCardValue[] queryClubMemberCards(DataContainer condition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubMemberCards
	 * @Description 根据查询条件查询俱乐部会员卡信息
	 *
	 * @param criteria 按照一定格式拼接的查询字符串，默认实现只提供XML字符串的方式。
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:43:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubMemberCardValue[] queryClubMemberCards(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubMemberCount
	 * @Description 根据指定查询条件查询俱乐部成员信息数量
	 *
	 * @param condition 查询条件信息
	 * @return 符合条件俱乐部成员数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:23:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubMemberCount(DataContainer condition) throws Exception;

	/**   
	 * @Function queryClubMemberCount
	 * @Description 根据查询条件查询俱乐部成员信息数量
	 *
	 * @param criteria 按照一定格式拼接的查询字符串，默认实现只提供XML字符串的方式。
	 * @return 符合条件的俱乐部成员数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:26:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubMemberCount(String criteria) throws Exception;

	/**   
	 * @Function queryClubMembers
	 * @Description 根据指定查询条件查询俱乐部成员信息
	 *
	 * @param condition 查询条件信息
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的俱乐部成员信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:20:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubMemberValue[] queryClubMembers(DataContainer condition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubMembers
	 * @Description 根据查询条件查询俱乐部成员信息
	 *
	 * @param criteria 按照一定格式拼接的查询字符串，默认实现只提供XML字符串的方式。
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的俱乐部成员信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:20:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubMemberValue[] queryClubMembers(String criteria, int startNum, int endNum) throws Exception;
	/**   
	 * @Function queryClubMembers
	 * @Description 根据查询条件查询俱乐部成员信息
	 *
	 * @param criteria 按照一定格式拼接的查询字符串，默认实现只提供XML字符串的方式。
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的俱乐部成员信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:20:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryClubMemberList(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubMembersCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 17, 2012 3:41:35 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 17, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryClubMembersCount(String criteria) throws Exception;
	/**   
	 * @Function saveClubMember
	 * @Description 保存俱乐部成员
	 *
	 * @param clubMemberValue
	 * @return 处理结果
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午9:37:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public ICmDealReturnData saveClubMember(IClubMemberValue clubMemberValue) throws Exception;

	/**   
	 * @Function saveClubMember
	 * @Description 保存俱乐部成员
	 *
	 * @param clubMemberValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jan 12, 2012 4:06:35 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 12, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public ICmDealReturnData saveClubMember(IVOClubMemberValue clubMemberValue) throws Exception;

	/**
	 * 保存会员卡信息
	 * @param clubMemberCardValue
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-23
	 */
	public ICmDealReturnData saveClubMemberCard(IClubMemberCardValue clubMemberCardValue) throws Exception;

	/**
	 * @param memberId
	 * @return
	 * @Function: queryClubMemberCardsByMemberId
	 * @author: LSC
	 * @date: 2012-4-10 下午8:43:08 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-10       LSC         v1.0.0               修改原因
	 */
	public IClubMemberCardValue[] queryClubMemberCardsByMemberId(long memberId) throws Exception;

	/**
	 * 通过一组会员标识查询会员卡
	 * @param memberId
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:Liaosc
	 * @date:2012-4-17
	 */
	public IClubMemberCardValue[] queryClubMemberCardsByMemberIds(long memberId[], long clubId, int startNum, int endNum) throws Exception;

	/**
	 * 通过一组客户编码查询会员信息
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-17
	 */
	public IClubMemberValue[] queryClubMembersByCustIds(long custId[], long clubId, int startNum, int endNum) throws Exception;

	/**
	 * 俱乐部会员记录条数
	 * @param custId
	 * @param clubId
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-5
	 */
	public int queryClubMembersByCustIdsCount(long custId[], long clubId) throws Exception;

	/**
	 * 查询俱乐部会员有效卡信息，同一时段，只有一张卡有效
	 * @param memberId
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-5
	 */
	public IClubMemberCardValue queryClubMemberCardByMemberId(long memberId) throws Exception;
	
	/**   
	 * 根据手机号码查询俱乐部会员信息
	 * @Function queryClubMemberByMemberId
	 * @Description 
	 *
	 * @param memberId
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-26 下午3:15:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-26     huzq           v1.0.0               修改原因<br>
	 */
	public IClubMemberValue queryClubMemberByMemberId(String memberId) throws Exception;

	/**   
	 * 根据手机号码查询VIP俱乐部会员信息
	 * @Function queryVIPClubMemberByBillId
	 * @Description 
	 *
	 * @param billId
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-26 下午3:15:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-26     huzq           v1.0.0               修改原因<br>
	 */
	public IClubMemberValue queryVIPClubMemberByBillId(String billId) throws Exception;

	/**   
	 * 根据用户编号查询VIP俱乐部会员信息
	 * @Function queryVIPClubMemberByUserId
	 * @Description 
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-26 下午3:16:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-26     huzq           v1.0.0               修改原因<br>
	 */
	public IClubMemberValue queryVIPClubMemberByUserId(long userId) throws Exception;
	
	/**   
	 * 根据用户编号查询VIP俱乐部会员信息
	 * @Function queryVIPClubMemberByUserId
	 * @Description 
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-26 下午3:16:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-26     huzq           v1.0.0               修改原因<br>
	 */
	public int queryVIPClubMemberCountByUserId(long userId) throws Exception;

	/**
	 * 
	 * @Function queryActionRecValuesByMemberId
	 * @Description 查询活动记录
	 *
	 * @param memberId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 7:44:49 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubActionRecValue[] queryActionRecValuesByMemberId(long memberId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryActionRecValuesCountByMemberId
	 * @Description 查询活动记录数量
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 7:44:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryActionRecValuesCountByMemberId(long memberId) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceAdjustValuesByMemberId
	 * @Description 查询服务调整次数
	 *
	 * @param memberId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 7:45:21 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceAdjustValue[] queryClubServiceAdjustValuesByMemberId(long memberId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceAdjustValuesCountByMemberId
	 * @Description 查询服务调整数量 
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 7:45:30 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryClubServiceAdjustValuesCountByMemberId(long memberId) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceRecValuesByMemberId
	 * @Description 查询服务记录
	 *
	 * @param memberId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 7:45:44 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceRecValue[] queryClubServiceRecValuesByMemberId(long memberId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceRecValuesCountByMemberId
	 * @Description 查询服务次数数量 
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 7:46:01 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryClubServiceRecValuesCountByMemberId(long memberId) throws Exception;
	
	/**
	 * 
	 * @Function queryClubMember
	 * @Description 查询俱乐部会员信息总共行数
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jul 12, 2012 7:46:01 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public int queryClubMemberCount(long custId)throws Exception;
	
	/**
	 * 
	 * @Function queryClubMember
	 * @Description 查询俱乐部会员信息对象
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jul 12, 2012 7:46:01 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IClubMemberValue[] queryClubMember(long custId,int start,int end)throws Exception;
	/**
	 * @Function queryUserManager
	 * @Description 查询vip经理关系
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jul 12, 2012 7:46:01 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmUserManagerValue[] queryUserManager(long memberId,int start,int end)throws Exception;
	
	/**
	 * 
	 * @Function queryClubMemberTemp
	 * @Description 查询俱乐部会员临时表数据
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jul 12, 2012 7:46:01 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmClubMemberTempValue[] queryClubMemberTemp(DataContainer condition)throws Exception;
	

}
