/**
 * 
 */
package com.asiainfo.crm.cm.customer.group.service.interfaces;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemBillValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemHobbyValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustMemberUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupKeyMemberUserValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.query.ivalues.IQBOCmGroupMemberQryCdnValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmGroupMemberSV.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 26, 2011 9:08:59 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jan 25, 2011		huzq2           v1.0.0               修改原因
 */
public interface ICmGroupMemberSV
{

	/**   
	 * 根据成员编号（主键）查询集团成员信息
	 * @Function: queryGroupCustMemberById
	 *
	 * @param custRelId 成员编号
	 * @return 符合条件的集团客户成员
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 7, 2011 9:10:46 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 7, 2011     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupCustMemberValue queryGroupCustMemberById(long custRelId) throws Exception, RemoteException;

	/**  
	 *  根据个人客户编号查询集团普通成员信息
	 * @Function: queryGroupCustMembersByIndivCustId
	 *
	 * @param indivCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-9 下午2:40:58 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-9     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupCustMemberValue[] queryGroupCustMembersByIndivCustId(long indivCustId) throws Exception, RemoteException;

	/**   
	 * 根据成员编号查询成员关联的用户数量
	 * @Function: queryGroupCustMemUserCountByCustRelId
	 *
	 * @param memberId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 5, 2011 11:47:36 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 5, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryGroupCustMemUserCountByCustRelId(long memberId) throws Exception, RemoteException;

	/**   
	 * 根据成员编号查询成员关联的用户信息
	 * @Function: queryGroupCustMemUsers
	 *
	 * @param memberId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 6:10:16 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupCustMemUserValue[] queryGroupCustMemUsersByCustRelId(long memberId, int startNum, int endNum)
			throws Exception, RemoteException;
	/**   
	 * 根据客户编号查询集团成员信息
	 * @Function queryGroupMemberValues
	 * @Description 
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-28 上午11:08:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-28     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupMemberValue[] queryGroupMemberValues(long custId,long grpCustId,int startNum, int endNum) throws Exception;
	/**   
	 * 查询集团成员信息
	 * @Function queryGroupMemberValues
	 * @Description 
	 *
	 * @param dc
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-28 上午11:08:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-28     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupMemberValue[] queryGroupMemberValues(DataContainer dc,int startNum, int endNum) throws Exception;
	/**   
	 * 查询集团成员信息总行数
	 * @Function getGroupMemberValuesCount
	 * @Description 
	 *
	 * @param dc
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-28 上午11:08:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-28     kangzk           v1.0.0               修改原因<br>
	 */
	public int getGroupMemberValuesCount(DataContainer dc)throws Exception;
	/**   
	 * 根据关键人物编号查询关键人物基本信息
	 * @Function: queryGroupKeyMemberById
	 *
	 * @param kernelId 关键人物编号
	 * @return 符合条件的关键人物信息
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 3, 2011 4:43:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 3, 2011     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupKeyMemberValue queryGroupKeyMemberById(long kernelId) throws Exception, RemoteException;

	/**   
	 * @Function: queryGroupKeyMemBillCountByKernelId
	 * @Description: 该函数的功能描述
	 *
	 * @param kernelId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 5:53:08 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryGroupKeyMemBillCountByKernelId(long kernelId) throws Exception, RemoteException;

	/**   
	 * @Function: queryGroupKeyMemBillsByKernelId
	 * @Description: 该函数的功能描述
	 *
	 * @param kernelId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 5:53:06 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupKeyMemBillValue[] queryGroupKeyMemBillsByKernelId(long kernelId, int startNum, int endNum)
			throws Exception, RemoteException;

	/**   
	 * 根据关键人物编号查询关键人物爱好信息
	 * @Function: qryGroupKeyMemHobbyByKernelId
	 *
	 * @param kernelId 关键人物编号
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的关键人物爱好信息
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 1:27:40 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupKeyMemHobbyValue[] queryGroupKeyMemHobbyByKernelId(long kernelId, int startNum, int endNum)
			throws Exception, RemoteException;

	/**   
	 * 根据关键人物编号查询关键人物爱好数量
	 * @Function: qryGroupKeyMemHobbyCountByKernelId
	 *
	 * @param kernelId 关键人物编号
	 * @return 符合条件的关键人物爱好数量
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 1:28:07 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupKeyMemHobbyCountByKernelId(long kernelId) throws Exception, RemoteException;

	/**   
	 * 根据查询条件Value查询集团成员
	 * @Function: queryQGroupCustMemberUserCountByCdn
	 *
	 * @param memberQryCdnValue 查询条件容器<br>
	 * 构造查询条件请使用方法{@link #createGroupMemberQryCdn(Map) createGroupMemberQryCdn}(Map parameter)
	 * @return 符合条件的集团成员数量
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 11:42:51 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryQGroupCustMemberUserCountByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue) throws Exception,
			RemoteException;

	/**   
	 * 根据查询条件Value查询集团成员
	 * @Function: queryQGroupCustMemberUsersByCdn
	 *
	 * @param memberQryCdnValue 查询条件容器<br>
	 * 构造查询条件请使用方法{@link #createGroupMemberQryCdn(Map) createGroupMemberQryCdn}(Map parameter)
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团成员信息
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 11:40:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	IQBOCmGroupCustMemberUserValue[] queryQGroupCustMemberUsersByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue,
			int startNum, int endNum) throws Exception, RemoteException;

	/**   
	 * 根据查询条件对象查询集团关键人物数量
	 * @Function: queryQGroupKeyMemberUserCountByCdn
	 *
	 * @param memberQryCdnValue 查询条件对象<br>
	 * 构造查询条件请使用方法{@link #createGroupMemberQryCdn(Map) createGroupMemberQryCdn}(Map parameter)
	 * @return 符合条件的集团关键人物数量
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 28, 2011 2:09:40 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 28, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryQGroupKeyMemberUserCountByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue) throws Exception,
			RemoteException;

	/**   
	 * 根据条件查询集团成员及关联用户数量
	 * @Function: queryQGroupKeyMemberUserCount
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return 符合条件的集团成员及关联用户数量
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 13, 2011 9:49:15 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 13, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryQGroupKeyMemberUserCount(String condition, Map parameter) throws Exception, RemoteException;

	/**   
	 * 根据条件查询集团成员及关联用户信息
	 * @Function: queryQGroupKeyMemberUsers
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团成员及关联用户信息
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 13, 2011 9:49:18 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 13, 2011     huzq2           v1.0.0               修改原因
	 */
	IQBOCmGroupKeyMemberUserValue[] queryQGroupKeyMemberUsers(String condition, Map parameter, int startNum, int endNum)
			throws Exception, RemoteException;

	/**   
	 * 根据查询条件对象查询集团关键人物信息
	 * @Function queryQGroupKeyMemberUsersByCdn
	 *
	 * @param memberQryCdnValue 查询条件对象<br>
	 * 构造查询条件请使用方法{@link #createGroupMemberQryCdn(Map) createGroupMemberQryCdn}(Map parameter)
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团关键人物信息列表
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 28, 2011 2:07:38 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 28, 2011     huzq2           v1.0.0               修改原因
	 */
	IQBOCmGroupKeyMemberUserValue[] queryQGroupKeyMemberUsersByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue,
			int startNum, int endNum) throws Exception, RemoteException;

	/**   
	 * 保存集团客户成员信息
	 * @Function: saveGroupCustMembers
	 *
	 * @param groupCustMemberValues
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 7, 2011 4:30:17 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 7, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveGroupCustMembers(IBOCmGroupCustMemberValue[] groupCustMemberValues) throws Exception, RemoteException;

	/**   
	 * 保存集团成员关联的用户信息(同步关键人物)
	 * @Function: saveGroupCustMemUsers
	 *
	 * @param custMemUserValues
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 5, 2011 11:50:10 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 5, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveGroupCustMemUsers(IBOCmGroupCustMemUserValue[] custMemUserValues) throws Exception, RemoteException;

	/**  
	 *  保存集团成员关联的用户信息(是否同步关键人物)
	 * @Function: saveGroupCustMemUsers
	 *
	 * @param custMemUserValues
	 * @param isSyncKeyMember 是否同步关键人物
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-25 下午8:29:39 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-25     huzq2           v1.0.0               修改原因
	 */
	void saveGroupCustMemUsers(IBOCmGroupCustMemUserValue[] custMemUserValues, boolean isSyncKeyMember)
			throws Exception, RemoteException;

	/**   
	 * 保存关键人物的爱好信息
	 * @Function: saveGroupKeyMemberHobby
	 *
	 * @param keyMemHobbyValues
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 3:48:49 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveGroupKeyMemHobby(IBOCmGroupKeyMemHobbyValue[] keyMemHobbyValues) throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupMemberSV.java
	* @Description: 保存集团成员（不同步关键人物）
	*
	* @param groupCustMemberUserValues
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Nov 23, 2011 10:19:32 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 23, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveQGroupCustMemberUsersNotAsync(IQBOCmGroupCustMemberUserValue[] groupCustMemberUserValues) throws Exception, RemoteException;

	/**   
	 * 保存集团关键人物信息
	 * @Function: saveGroupKeyMembers
	 *
	 * @param memberValues
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 2:42:24 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveGroupKeyMembers(IBOCmGroupKeyMemberValue[] memberValues) throws Exception, RemoteException;

	/**   
	 * 保存关键人物关联的用户信息
	 * @Function: saveGroupKeyMemBills
	 *
	 * @param keyMemBillValues
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 5, 2011 11:48:21 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 5, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveGroupKeyMemBills(IBOCmGroupKeyMemBillValue[] keyMemBillValues) throws Exception, RemoteException;

	/**   
	 * 保存集团成员信息
	 * @Function: saveQGroupCustMembers
	 *
	 * @param groupCustMemberValues
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 30, 2011 11:25:06 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 30, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveQGroupCustMemberUsers(IQBOCmGroupCustMemberUserValue[] groupCustMemberUserValues) throws Exception,
			RemoteException;

	/**  
	 *  单个保存集团客户成员信息（QBO）
	 * @Function: saveQGroupCustMemberUser
	 *
	 * @param groupCustMemberUserValue
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-6 上午12:08:46 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-6     huzq2           v1.0.0               修改原因
	 */
	void saveQGroupCustMemberUser(IQBOCmGroupCustMemberUserValue groupCustMemberUserValue) throws Exception,
			RemoteException;

	/**   
	 * 保存关键人物信息和爱好信息
	 * @Function: saveQGroupKeyMemberUsersAndHobby
	 *
	 * @param groupKeyMemberUserValues
	 * @param groupKeyMemHobbyValues
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @param addMember 
	 * @date: Jun 7, 2011 2:22:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 7, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveQGroupKeyMemberUserAndHobby(IQBOCmGroupKeyMemberUserValue groupKeyMemberUserValue,
			IBOCmGroupKeyMemHobbyValue[] groupKeyMemHobbyValues, int addMember) throws Exception, RemoteException;

	/**   
	 * 保存集团关键人物
	 * @Function: saveQGroupKeyMemberUsers
	 *
	 * @param groupKeyMemberUserValues
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 31, 2011 12:30:01 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 31, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveQGroupKeyMemberUsers(IQBOCmGroupKeyMemberUserValue[] groupKeyMemberUserValues) throws Exception,
			RemoteException;

	/**
	 * 更新集团成员及关键人物的VIP级别。<br>
	 * 当用户的VIP级别发生变更时需要同步修改集团成员及关键人物的VIP级别，以保证系统中同一个用户的VIP级别不一致。
	 * @Function: updateGroupMemberVipLevel
	 *
	 * @param billId 手机号码
	 * @param currentVipLevel 当前的VIP级别
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 3, 2011 9:52:46 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 3, 2011     huzq2           v1.0.0               修改原因
	 */
	void updateGroupMemberVipLevel(String billId, int currentVipLevel) throws Exception, RemoteException;

	/**
	 * 
	 * @Function: ICmGroupMemberSV.java
	 * @Description:  批量保存集团成员信息
	 *
	 * @param list
	 * @param memberType
	 * @param groupCustId
	 * @param operate
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Jun 13, 2011 3:07:59 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 13, 2011     zhaiwg           v1.0.0               修改原因
	 */
	// public long saveGroupMemBatch(List list, long groupCustId, int memberType, int operate) throws Exception,
	// RemoteException;

	/**   
	 * 批量保存集团成员信息。
	 * 提供给前台页面通过文件导入的方式新增或删除集团成员信息的服务.
	 * @Function: saveGroupCustMembersBatch
	 *
	 * @param parseList
	 * @param groupCustId
	 * @param memberType
	 * @param operate
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 21, 2011 4:29:59 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 21, 2011     huzq2           v1.0.0               修改原因
	 */
	public long saveGroupCustMembersBatch(List parseList, long groupCustId, int memberType, String regionId, int operate)
			throws Exception, RemoteException;

	/**   
	 * 删除集团成员信息（包括集团客户和集团关键人物）.
	 * 提供给用户销户是调用。
	 * @Function: deleteGroupMembersByUserId
	 *
	 * @param userId 用户编号
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 22, 2011 6:23:09 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 22, 2011     huzq2           v1.0.0               修改原因
	 */
	public void deleteGroupMembersByUserId(long userId) throws Exception, RemoteException;

	/**  
	 *  批量转移集团成员
	 * @Function: groupCustMembersTransferBatch
	 *
	 * @param parseList 需要转移的手机号码、集团编号列表{[billId1,groupId1],[...],[billIdn,groupIdn]}
	 * @param memberType 成员分类.枚举值定义{@link CmConstants.GroupMember#TYPE_INNER_MEMBER CmConstants.GroupMember.TYPE_INNER_MEMBER},
	 * {@link CmConstants.GroupMember#TYPE_EXT_MEMBER CmConstants.GroupMember.TYPE_EXT_MEMBER},
	 * {@link CmConstants.GroupMember#TYPE_OUT_MEMBER CmConstants.GroupMember.TYPE_OUT_MEMBER}
	 * @return batchDataId 批次号（用于在前台展示这一批次处理的结果）
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-4 下午2:38:51 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-4     huzq2           v1.0.0               修改原因
	 */
	public long transferGroupMembersBatch(List parseList, int memberType) throws Exception, RemoteException;

	/**  
	 *  根据原集团客户编号和目标集团客户编号转移成员
	 * @Function: transferGroupMembersByGroupCustId
	 *
	 * @param srcGroupCustId 原集团客户编号
	 * @param destGroupCustId 目标集团客户编号
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-4 下午2:48:21 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-4     huzq2           v1.0.0               修改原因
	 */
	public void transferGroupMembersByGroupCustId(long srcGroupCustId, long destGroupCustId) throws Exception,
			RemoteException;

	/**  
	 *  根据指定条件查询集团成员关联用户信息
	 * @Function: queryGroupCustMemUsers
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团成员关联用户信息
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-8-2 下午7:47:35 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-8-2     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustMemUserValue[] queryGroupCustMemUsers(String condition, Map parameter, int startNum, int endNum)
			throws Exception, RemoteException;

	/**  
	 *  根据查询条件查询集团成员关联用户数量
	 * @Function: queryGroupCustMemUserCount
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return 符合条件的集团成员关联用户数量
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-8-2 下午7:48:27 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-8-2     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupCustMemUserCount(String condition, Map parameter) throws Exception, RemoteException;

	/**  
	 *  根据查询条件查询集团关键人物关联用户信息
	 * @Function: queryGroupKeyMemBills
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团关键人物关联用户信息
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-8-2 下午7:49:12 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-8-2     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupKeyMemBillValue[] queryGroupKeyMemBills(String condition, Map parameter, int startNum, int endNum)
			throws Exception, RemoteException;

	/**  
	 *  根据查询条件查询集团关键人物关联用户数量
	 * @Function: queryGroupKeyMemBillCount
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return  符合条件的集团关键人物关联用户数量
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-8-2 下午7:50:11 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-8-2     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupKeyMemBillCount(String condition, Map parameter) throws Exception, RemoteException;
	/**   
	 * 根据查询条件对象查询集团关键人物信息
	 * @Function queryQGroupKeyMemberUsersByCdn
	 *
	 * @param memberQryCdnValue 查询条件对象<br>
	 * 构造查询条件请使用方法{@link #createGroupMemberQryCdn(Map) createGroupMemberQryCdn}(Map parameter)
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @param isLog 是否记日志
	 * @return 符合条件的集团关键人物信息列表
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 28, 2011 2:07:38 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 28, 2011     huzq2           v1.0.0               修改原因
	 */
	IQBOCmGroupKeyMemberUserValue[] queryQGroupKeyMemberUsersByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue,
			int startNum, int endNum,boolean isLog) throws Exception, RemoteException;
}
