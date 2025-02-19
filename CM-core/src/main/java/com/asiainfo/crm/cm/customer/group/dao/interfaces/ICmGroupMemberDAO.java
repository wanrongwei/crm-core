/**
 * 
 */
package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemBillValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemHobbyValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustMemberUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupKeyMemberUserValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmGroupMemberDAO.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 26, 2011 8:59:39 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 *  Jan 11, 2011	huzq2           v1.0.0               修改原因
 */
public interface ICmGroupMemberDAO
{
	/**   
	 * @Function: getNewMemberId
	 * @Description: 新增成员时获取ID
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 3, 2011 8:19:08 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 3, 2011     dailong           v1.0.0               修改原因
	 */
	public long getNewGroupCustMemberId() throws Exception;

	/**   
	 * @Function: getNewMemberUserId
	 * @Description: 新增成员用户时获取ID
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 3, 2011 8:39:51 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 3, 2011     dailong           v1.0.0               修改原因
	 */
	public long getNewGroupCustMemberUserId() throws Exception;

	/**   
	 * @Function: getNewMemberId
	 * @Description: 新增成员时获取ID
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 3, 2011 8:19:08 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 3, 2011     dailong           v1.0.0               修改原因
	 */
	public long getNewGroupKeyMemberId() throws Exception;

	/**   
	 * @Function: getNewMemberUserId
	 * @Description: 新增成员用户时获取ID
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 3, 2011 8:39:51 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 3, 2011     dailong           v1.0.0               修改原因
	 */
	public long getNewGroupKeyMemberUserId() throws Exception;

	/**   
	 * 保存集团成员信息
	 * @Function: ICmGroupCustMemberDAO.java
	 *
	 * @param groupCustMemberValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 4, 2011 10:01:55 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 4, 2011     dailong           v1.0.0               修改原因
	 */
	public void saveGroupCustMember(IBOCmGroupCustMemberValue groupCustMemberValue) throws Exception;

	/**   
	 * 批量保存集团成员信息
	 * @Function: ICmGroupCustMemberDAO.java
	 *
	 * @param groupCustMemberValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 10, 2011 3:34:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 10, 2011     dailong           v1.0.0               修改原因
	 */
	public void saveGroupCustMembers(IBOCmGroupCustMemberValue[] groupCustMemberValues) throws Exception;

	/**   
	 * 保存集团成员用户信息
	 * @Function: saveGroupCustMemUser
	 *
	 * @param groupCustMemUserValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 27, 2011 5:34:21 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 27, 2011     dailong           v1.0.0               修改原因
	 */
	public void saveGroupCustMemUser(IBOCmGroupCustMemUserValue groupCustMemUserValue) throws Exception;

	/**   
	 * 保存集团成员用户信息
	 * @Function: saveGroupCustMemUsers
	 *
	 * @param groupCustMemUserValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 4, 2011 10:03:55 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 4, 2011     dailong           v1.0.0               修改原因
	 */
	public void saveGroupCustMemUsers(IBOCmGroupCustMemUserValue[] groupCustMemUserValues) throws Exception;

	/**   
	 * 根据指定条件查询集团成员信息类别
	 * @Function: queryGroupCustMembers
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团客户成员基本信息
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 7:36:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupCustMemberValue[] queryGroupCustMembers(String condition, Map parameter, int startNum, int endNum)
			throws Exception;

	/**   
	 * 根据指定条件查询集团成员数量
	 * @Function: queryGroupCustMemberCount
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return 符合条件的集团成员数量
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 7:37:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryGroupCustMemberCount(String condition, Map parameter) throws Exception;

	/**   
	 * 根据指定条件查询集团成员关联用户信息列表
	 * @Function: queryGroupCustMemUsers
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @param startNum 分页参数
	 * @param endNum 分页参数 
	 * @return 符合条件的集团成员关联用户信息列表
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 7:39:22 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupCustMemUserValue[] queryGroupCustMemUsers(String condition, Map parameter, int startNum, int endNum)
			throws Exception;

	/**   
	 * 根据指定条件查询集团成员关联用户数量
	 * @Function: queryGroupCustMemUserCount
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return 符合条件的集团成员关联用户数量
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 7:40:54 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryGroupCustMemUserCount(String condition, Map parameter) throws Exception;

	/**   
	 * 根据条件查询集团成员及关联用户信息
	 * @Function: queryQGroupCustMemberUsers
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团成员及关联用户信息
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 8:37:19 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	IQBOCmGroupCustMemberUserValue[] queryQGroupCustMemberUsers(String condition, Map parameter, int startNum,
			int endNum) throws Exception;

	/**   
	 * 根据条件查询集团成员及关联用户数量
	 * @Function: queryQGroupCustMemberUserCount
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return 符合条件的集团成员及关联用户数量
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 8:39:09 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryQGroupCustMemberUserCount(String condition, Map parameter) throws Exception;

	/**   
	 * 根据指定条件查询集团成员数量
	 * @Function: queryGroupCustMemberCount
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return 符合条件的集团成员数量
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 7:37:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryGroupKeyMemberCount(String condition, Map parameter) throws Exception;

	/**   
	 * 根据指定条件查询集团成员信息类别
	 * @Function: queryGroupKeyMembers
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团客户成员基本信息
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 7:36:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupKeyMemberValue[] queryGroupKeyMembers(String condition, Map parameter, int startNum, int endNum)
			throws Exception;

	/**   
	 * 根据查询条件查询集团关键人物的用户数量
	 * @Function: queryGroupKeyMemBillCount
	 *
	 * @param condition 参选条件
	 * @param parameter 查询参数
	 * @return 符合条件的集团关键人物的用户数量
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 28, 2011 2:33:05 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 28, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryGroupKeyMemBillCount(String condition, Map parameter) throws Exception;

	/**   
	 * 根据查询条件查询集团关键人物的用户信息
	 * @Function: queryGroupKeyMemBills
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团关键人物的用户信息
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 28, 2011 2:32:12 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 28, 2011     huzq2           v1.0.0               修改原因
	 */
	IBOCmGroupKeyMemBillValue[] queryGroupKeyMemBills(String condition, Map parameter, int startNum, int endNum)
			throws Exception;

	/**   
	 * 根据条件查询集团成员及关联用户数量
	 * @Function: queryQGroupKeyMemberUserCount
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return 符合条件的集团成员及关联用户数量
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 8:39:09 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryQGroupKeyMemberUserCount(String condition, Map parameter) throws Exception;

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
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 26, 2011 8:37:19 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 26, 2011     huzq2           v1.0.0               修改原因
	 */
	IQBOCmGroupKeyMemberUserValue[] queryQGroupKeyMemberUsers(String condition, Map parameter, int startNum, int endNum)
			throws Exception;

	/**   
	 * 保存集团关键人物信息
	 *
	 * @param groupKeyMemberValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 4, 2011 10:01:55 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 4, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupKeyMember(IBOCmGroupKeyMemberValue groupKeyMemberValue) throws Exception;

	/**   
	 * 批量保存集团关键人物信息
	 *
	 * @param groupKeyMemberValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 10, 2011 3:34:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupKeyMembers(IBOCmGroupKeyMemberValue[] groupKeyMemberValues) throws Exception;

	/**   
	 * 保存集团关键人物用户信息
	 * @Function: saveGroupKeyMemBill
	 *
	 * @param groupKeyMemBillValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 27, 2011 5:34:21 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 27, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupKeyMemBill(IBOCmGroupKeyMemBillValue groupKeyMemBillValue) throws Exception;

	/**   
	 * 保存集团成员用户信息
	 * @Function: saveGroupKeyMemBills
	 *
	 * @param groupKeyMemBillValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: dailong
	 * @date: Mar 4, 2011 10:03:55 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 4, 2011     dailong           v1.0.0               修改原因
	 */
	public void saveGroupKeyMemBills(IBOCmGroupKeyMemBillValue[] groupKeyMemBillValues) throws Exception;

	/**   
	 * 根据指定条件查询集团关键人物爱好信息
	 * @Function: qryGroupKeyMemHobby
	 *
	 * @param string
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的关键人物爱好信息
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 1:33:29 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupKeyMemHobbyValue[] queryGroupKeyMemHobby(String condition, Map parameter, int startNum, int endNum)
			throws Exception;

	/**   
	 * 根据查询条件查询集团关键人物爱好信息数量
	 * @Function: queryGroupKeyMemHobbyCount
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 1:36:33 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	int queryGroupKeyMemHobbyCount(String condition, Map parameter) throws Exception;

	/**   
	 * 保存集团关键人物爱好信息
	 * @Function: saveGroupKeyMemHobbys
	 *
	 * @param keyMemHobbyValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 4, 2011 3:55:09 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 4, 2011     huzq2           v1.0.0               修改原因
	 */
	void saveGroupKeyMemHobbys(IBOCmGroupKeyMemHobbyValue[] keyMemHobbyValues) throws Exception;
}
