/**
 * 
 */
package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.club.ivalues.IQBOCmClubMemberActionRecValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IQBOCmClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubActionValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubActivityValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName ICmClubActivitySV
 * @Description 俱乐部活动相关的服务
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-13 下午5:58:14
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmClubActivitySV {

	/**   
	 * @Function queryClubActionById
	 * @Description 查询俱乐部活动信息
	 *
	 * @param actionId 活动编号
	 * @return 符合条件的活动信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:21:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubActionValue queryClubActionById(long actionId) throws Exception;

	/**   
	 * @Function queryClubActionCount
	 * @Description 根据查询条件查询俱乐部活动
	 *
	 * @param condition 查询条件
	 * @return 符合条件的俱乐部活动数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:35:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubActionCount(DataContainer condition) throws Exception;

	/**   
	 * @Function queryClubActionCount
	 * @Description 根据格式化的字符查询条件查询俱乐部会员活动信息数量
	 *
	 * @param criteria 一定格式的查询条件字符串。默认支持XML格式。
	 * @return 符合条件的会员活动信息数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:28:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubActionCount(String criteria) throws Exception;

	/**   
	 * @Function queryClubActionRecById
	 * @Description 根据记录编号查询俱乐部会员活动记录
	 *
	 * @param recordId 记录编号
	 * @return 俱乐部会员活动记录
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:40:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubActionRecValue queryClubActionRecById(long recordId) throws Exception;

	/**   
	 * @Function queryClubActionRecCount
	 * @Description 
	 *
	 * @param condition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:48:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubActionRecCount(DataContainer condition) throws Exception;

	/**   
	 * @Function queryClubActionRecCount
	 * @Description 根据格式化查询条件查询俱乐部会员活动记录数量
	 *
	 * @param criteria 一定格式化的查询条件字符串。默认支持XML格式。
	 * @return 符合条件的俱乐部会员活动记录数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:44:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubActionRecCount(String criteria) throws Exception;

	/**   
	 * @Function queryClubActionRecs
	 * @Description 根据查询条件查询俱乐部会员活动
	 *
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:45:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubActionRecValue[] queryClubActionRecs(DataContainer condition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubActionRecs
	 * @Description 根据格式化查询条件查询俱乐部会员活动记录
	 *
	 * @param criteria 一定格式化的查询条件字符串。默认支持XML格式。
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的俱乐部会员活动记录
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:42:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubActionRecValue[] queryClubActionRecs(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubActions
	 * @Description 根据查询条件查询俱乐部活动信息
	 *
	 * @param condition 查询条件
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的俱乐部活动信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:34:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubActionValue[] queryClubActions(DataContainer condition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubActions
	 * @Description 根据格式化的字符查询条件查询俱乐部会员活动信息
	 *
	 * @param criteria 一定格式的查询条件字符串。默认支持XML格式。
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的会员活动信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:23:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubActionValue[] queryClubActions(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * @Function saveClubAction
	 * @Description 保存俱乐部活动信息
	 *
	 * @param actionValue 俱乐部活动信息
	 * @return 保存结果
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:39:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveClubAction(IClubActionValue[] actionValue) throws Exception;

	/**   
	 * @Function saveClubAction
	 * @Description 保存俱乐部活动信息
	 *
	 * @param activityValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:51:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public ICmDealReturnData saveClubAction(IVOClubActivityValue activityValue) throws Exception;

	/**   
	 * @Function saveClubActionRec
	 * @Description 保存俱乐部会员活动记录
	 *
	 * @param actionRecValues
	 * @return 保存结果
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:49:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveClubActionRec(IClubActionRecValue[] actionRecValues) throws Exception;

	/**   
	 * @Function saveClubActionRec
	 * @Description 保存俱乐部会员活动记录 
	 *
	 * @param activityValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午10:52:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public ICmDealReturnData saveClubActionRec(IVOClubActivityValue activityValue) throws Exception;

	/**
	 * 
	 * @Function queryClubMemVipCardCount
	 * @Description 根据客户编号查询俱乐部客户信息总行数
	 *
	 * @param clubId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012 7:48:58 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public int queryClubMemVipCardCount(long custId) throws Exception;

	/**
	 * 
	 * @Function queryClubMemVipCardCount
	 * @Description 根据客户编号查询俱乐部客户信息
	 *
	 * @param clubId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012 7:48:58 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IQBOCmClubMemberCardValue[] queryClubMemVipCard(long custId, int $STARTROWINDEX, int $ENDROWINDEX) throws Exception;

	/**
	 * 
	 * @Function queryClubActionByClubIdAndActionName
	 * @Description 根据活动编号和活动名称查询俱乐部活动信息
	 *
	 * @param clubId
	 * @param actionName
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 11, 2012 7:48:58 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	// public IBOCmClubActionValue[] queryClubActionByClubIdAndActionName(long clubId, String actionName, int startNum,
	// int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubActionByClubIdAndActionNameCount
	 * @Description 根据活动编号和活动名称查询俱乐部活动信息条数
	 *
	 * @param clubId
	 * @param actionName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 11, 2012 7:49:25 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	// public int queryClubActionByClubIdAndActionNameCount(long clubId, String actionName) throws Exception;

	/**
	 * 
	 * @Function queryClubActionRecByRecordId
	 * @Description 查询俱乐部活动记录信息
	 *
	 * @param recordId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 11, 2012 6:20:42 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	// public IBOCmClubActionRecValue queryClubActionRecByRecordId(long recordId) throws Exception;

	/**
	 * 
	 * @Function saveClubAction
	 * @Description 保存俱乐部活动信息
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 11, 2012 8:45:21 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	// public void saveClubAction(IVOClubMemberValue clubMemberValue) throws Exception;

	// public ICmDealReturnData saveClubActionAdjust(IVOClubMemberValue ClubServiceAdjustValue) throws Exception;

	/**
	 * 
	 * @Function saveClubAction
	 * @Description 保存俱乐部活动记录信息
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 11, 2012 8:51:18 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	// public void saveClubActionRec(IVOClubMemberValue clubMemberValue) throws Exception;

	/**
	 * 
	 * @Function queryQClubMemberActionRecByCondition
	 * @Description  查询俱乐部活动信息记录
	 *
	 * @param memberCode
	 * @param memberName
	 * @param actionCode
	 * @param actionName
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 12, 2012 5:33:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IQBOCmClubMemberActionRecValue[] queryQClubMemberActionRecByCondition(String memberCode, String memberName, String actionCode, String actionName, int startNum,
			int endNum) throws Exception;

	/**
	 * 
	 * @Function queryQClubMemberActionRecByConditionCount
	 * @Description  查询俱乐部活动信息记录条数
	 *
	 * @param memberCode
	 * @param memberName
	 * @param actionCode
	 * @param actionName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 12, 2012 5:34:02 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryQClubMemberActionRecByConditionCount(String memberCode, String memberName, String actionCode, String actionName) throws Exception;

}
