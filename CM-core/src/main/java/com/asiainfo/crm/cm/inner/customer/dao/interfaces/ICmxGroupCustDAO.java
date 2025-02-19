package com.asiainfo.crm.cm.inner.customer.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerHValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupAddInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupCreditPointRecValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupInformInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupOrgStructExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupOutMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupCreditPointValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemberExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupOrgStructValue;

public interface ICmxGroupCustDAO {
	/**
	 * 
	 * @Function queryGroupMemberExt
	 * @Description 
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-3-26 上午11:53:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-26     mofangrui          v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupMemberExtValue[] queryGroupMemberExt(String condition, Map parameter) throws Exception ;
	
	/**
	 * 
	 * @Function queryGroupOrgStruct
	 * @Description 组织结构下根据集团编号查询集团信息
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-30 下午02:01:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupOrgStructValue[] queryGroupOrgStruct(String[] cols, String condition, Map parameter, int startNum, int endNum)throws Exception;
	/**
	 * 
	 * @Function queryGroupOrgStructCount
	 * @Description 组织结构信息显示数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-30 下午02:01:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryGroupOrgStructCount(String condition, Map parameter) throws Exception;
	
	/**
	 * 
	 * @Function saveGroupOrgStruct
	 * @Description 保存单个集团组织结构信息
	 *
	 * @param groupOrgStructValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-30 下午02:01:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public void saveGroupOrgStruct(IBOCmxGroupOrgStructExtValue groupOrgStructValue) throws Exception;
	/**
	 * 
	 * @Function queryGroupCustChance
	 * @Description 市场信息查询
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-8 下午01:15:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-8    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupAddInfoValue[] queryGroupCustChance(String[] cols, String condition, Map parameter, int startNum, int endNum)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupInformInfo
	 * @Description 根据custId,informTypeId 查出集团信息化信息对象
	 *
	 * @param informTypeId
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-12 下午12:26:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-12    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupInformInfoValue queryGroupInformInfo( int informTypeId ,long groupCustId) throws Exception;
	/**
	 * 
	 * @Function saveGroupInformInfo
	 * @Description 保存集团信息化信息
	 *
	 * @param groupInformInfoValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-12 下午12:25:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-12    zhangwei21         v1.0.0               修改原因<br>
	 */
	public void saveGroupInformInfo (IBOCmxGroupInformInfoValue[] groupInformInfoValues) throws Exception;

	/**
	 * 
	 * @Function queryIsUsedByGroupCustId
	 * @Description 根据custId 查出集团信息化信息每种类型标示的使用状态以,的形式串联（U 使用,E 未使用）
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-12 下午12:24:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-12    zhangwei21         v1.0.0               修改原因<br>
	 */
	public String queryIsUsedByGroupCustId(long groupCustId)throws Exception;
	/**
	 * 
	 * @Function queryCreditPointRec
	 * @Description 查询客户信用积分扩展
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-18 下午03:45:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-18    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupCreditPointRecValue[] queryCreditPointRec(String[] cols, String condition, Map parameter, int startNum, int endNum)throws Exception;
	/**
	 * 
	 * @Function queryCreditPointRecCount
	 * @Description 查询客户信用积分扩展数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-18 下午03:45:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-18    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryCreditPointRecCount(String condition, Map parameter) throws Exception;
	
	/**
	 * 
	 * @Function queryGroupInnerMems
	 * @Description 查询集团网内成员信息
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-24 上午11:05:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huaiduo        v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupMemValue[] queryGroupInnerMems(String[] cols, String condition, Map parameter, int startNum, int endNum)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupInnerMemCount
	 * @Description 查询集团网内成员数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-24 上午11:06:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryGroupInnerMemCount(String condition, Map parameter)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupOuterMems
	 * @Description 查询集团外网成员信息
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-25 下午06:52:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupOutMemberValue[] queryGroupOuterMems(String[] cols, String condition, Map parameter, int startNum, int endNum)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupOuterMemCount
	 * @Description 查询集团外网成员数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-25 下午06:52:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryGroupOuterMemCount(String condition, Map parameter)throws Exception;
	
	/**
	 * 
	 * @Function saveGroupOutMem
	 * @Description 保存集团成员扩展信息
	 *
	 * @param cmxGroupMemValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-4-28 上午11:43:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     Administrator           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemExt(IBOCmxGroupMemberValue cmxGroupMemberValue)throws Exception;

	/**
	 * 
	 * @Function saveGroupAddInfoValue
	 * @Description 保存集团市场信息
	 *
	 * @param extValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-30 上午11:07:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public void saveGroupAddInfoValue(IBOCmxGroupAddInfoValue extValue)throws Exception;
	
	/**
	 * 
	 * @Function saveGroupOutMember
	 * @Description 保存集团外网成员信息
	 *
	 * @param groupOutMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-2 下午5:04:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupOutMember(IBOCmxGroupOutMemberValue groupOutMemberValue)throws Exception;

	/**
	 * 
	 * @Function saveGroupMemberLevel
	 * @Description 保存集团成员级别
	 *
	 * @param groupMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-11 下午3:23:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemberLevel(IBOCmxGroupMemberValue groupMemberValue)throws Exception;
	
	/**
	 * 
	 * @Function saveGroupMemberLevelByfile
	 * @Description 批量保存集团网内成员级别
	 *
	 * @param groupMemberValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-11 下午6:55:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemberLevelByfile(IBOCmxGroupMemberValue[] groupMemberValues)throws Exception;
	
	/**
	 * }
	 * @Function queryGroupMemberLevelBybillId
	 * @Description 根据电话号码查询集团成员级别
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-14 下午8:58:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-14      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupMemberValue[] queryGroupMemberLevelBybillIds(String[] cols, String condition, Map parameter, int startNum, int endNum)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupMemberLevelBybillIdsCount
	 * @Description 根据电话号码查询集团成员级别数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-14 下午9:13:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-14      huaiduo           v1.0.0               修改原因<br>
	 */
	public int queryGroupMemberLevelBybillIdsCount(String condition, Map parameter)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupCreditPoint
	 * @Description xml查询客户信用积分
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-30 上午09:59:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupCreditPointValue[] queryGroupCreditPoint(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;
	
	/**
	 * 
	 * @Function queryGroupCreditPointCount
	 * @Description 信用积分数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-30 上午10:01:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryGroupCreditPointCount(String condition, Map parameter) throws Exception;

	/**   
	 * @Function queryGroupCustHis
	 * @Description 根据sql查询集团客户历史信息
	 *
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 24, 2012 10:09:48 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerHValue[] queryGroupCustHis(String sql, Map parameter) throws Exception;
}
