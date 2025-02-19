package com.asiainfo.crm.cm.service.interfaces;

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

public interface ICmxGroupCustInnerSV {

	/**
	 * 
	 * @Function queryGroupMemberExt
	 * @Description 查询集团会员及扩展属性
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-3-26 上午11:36:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-26     mofangrui          v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupMemberExtValue queryGroupMemberExt(long custId) throws Exception;

	/**
	 * 
	 * @Function queryGroupOrgStruct
	 * @Description集团组织结构下根据集团客户ID查询客户信息 
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-30 下午02:36:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupOrgStructValue[] queryGroupOrgStruct(long custId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupOrgStructCount
	 * @Description 客户组织下的信息数量
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-30 下午02:36:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryGroupOrgStructCount(long custId) throws Exception;

	/**
	 * 
	 * @Function saveGroupOrgStruct
	 * @Description 保存组织结构信息
	 *
	 * @param groupOrgStructValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-27 下午02:28:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-27    zhangwei21         v1.0.0               修改原因<br>
	 */
	public void saveGroupOrgStruct(IBOCmxGroupOrgStructExtValue extValue) throws Exception;

	/**
	 * 
	 * @Function queryGroupOrgStructByParentDeptId
	 * @Description 根据父节点查询子节点信息
	 *
	 * @param parentDeptId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-30 下午02:36:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupOrgStructValue[] queryGroupOrgStructByDeptId(long deptId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function checkGroupOrgParent
	 * @Description 判断当前部门是否有含有下属部门
	 *
	 * @param custId
	 * @param deptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-26 下午07:41:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26    zhangwei21         v1.0.0               修改原因<br>
	 */
	public boolean checkGroupOrgParent(long custId, long deptId) throws Exception;

	/**
	 * 
	 * @Function checkDeptName
	 * @Description 判断是否有同名部门，如果有返回false
	 *
	 * @param custId
	 * @param deptName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-26 下午09:53:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26    zhangwei21         v1.0.0               修改原因<br>
	 */
	public boolean checkDeptName(long custId, String deptName) throws Exception;

	/**
	 * 
	 * @Function queryGroupCustChance
	 * @Description 查询市场信息
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-8 下午01:27:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-8    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupAddInfoValue[] queryGroupCustChance(long custId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupInformInfoBy
	 * @Description 根据custId,informTypeId 查出集团信息化信息对象
	 *
	 * @param custId
	 * @param informTypeId
	 * @return
	 * @throws Exception
	 * @throws 
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-10 下午08:37:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10    zhangwei21         v1.0.0               修改原因<br>qq
	 */
	public IBOCmxGroupInformInfoValue queryGroupInformInfoBy(int informTypeId, long groupCustId) throws Exception;

	/**
	 * 
	 * @Function saveGroupInformInfo
	 * @Description 保存集团信息化信息
	 *
	 * @param groupInformInfoValues
	 * @throws Exception
	 * @throws 
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-10 下午08:37:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10    zhangwei21         v1.0.0               修改原因<br>qq
	 */
	public void saveGroupInformInfo(IBOCmxGroupInformInfoValue[] groupInformInfoValues) throws Exception;

	/**
	 * 根据custId 查出集团信息化信息每种类型标示的使用状态以,的形式串联（U 使用,E 未使用）
	 * @Function queryIsUsedByGroupCustId
	 * @Description 
	 *
	 *	 * <ol>
	 * 	<li>PBX情况</li>
	 * 	<li>Centrex</li>
	 * 	<li>直线电话</li>
	 * 	<li>专网/分支机构互联</li>
	 * 	<li>网站</li>
	 * 	<li>企业局域网情况</li>
	 * 	<li>邮件系统</li>
	 * 	<li>互联网接入</li>
	 * 	<li>OA系统</li>
	 * 	<li>ERP 的ERM 属性</li>
	 * 	<li>ERP 的CRM 属性</li>
	 * 	<li>ERP 的SCM 属性</li>
	 * </ol>
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws 
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-10 下午08:37:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10    zhangwei21         v1.0.0               修改原因<br>qq
	 */
	public String queryIsUsedByGroupCustId(long custId) throws Exception;

	/**
	 * 
	 * @Function queryCreditPointRec
	 * @Description 
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-18 下午04:00:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-18    zhangwei21         v1.0.0               修改原因<br>
	 */

	public IBOCmxGroupCreditPointRecValue[] queryCreditPointRec(long custId, long pointsType, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryCreditPointRecCount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-18 下午04:00:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-18    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryCreditPointRecCount(long custId, long pointsType) throws Exception;

	/**
	 * 
	 * @Function queryGroupInnerMems
	 * @Description 查询集团网内成员信息
	 *
	 * @param condition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-24 上午11:00:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huaiduo        v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupMemValue[] queryGroupInnerMems(long custId, String billId, String vipLevel, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupInnerMemCount
	 * @Description 查询集团网内成员数量
	 *
	 * @param condition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-24 上午11:01:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryGroupInnerMemCount(long custId, String billId, String vipLevel) throws Exception;

	/**
	 * 
	 * @Function queryGroupOuterMems
	 * @Description 查询集团外网成员信息
	 *
	 * @param memberType
	 * @param billIdString
	 * @param memberName
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-25 下午06:49:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupOutMemberValue[] queryGroupOuterMems(long custId, int spType, String billId, String name, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupOuterMemCount
	 * @Description 查询集团外网成员数量
	 *
	 * @param memberType
	 * @param billIdString
	 * @param memberName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-25 下午06:50:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryGroupOuterMemCount(long custId, int spType, String billId, String name) throws Exception;

	/**
	 * 
	 * @Function queryGroupOuterMem
	 * @Description  查询集团外网成员信息
	 *
	 * @param custId
	 * @param custRelId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-4-28 上午10:07:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     Administrator           v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupOutMemberValue[] queryGroupOuterMem(long custId, long outMemberId) throws Exception;

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
	 * @date 2012-4-28 上午11:40:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     Administrator           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemExt(IBOCmxGroupMemberValue extValue) throws Exception;

	/**
	 * 
	 * @Function queryGroupModifySpecialAttr
	 * @Description 修改特殊属性
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-28 下午04:42:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupAddInfoValue[] queryGroupModifySpecialAttr(long custId, int startNum, int endNum) throws Exception;

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
	 * @date 2012-4-30 上午11:01:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public void saveGroupAddInfoValue(IBOCmxGroupAddInfoValue extValue) throws Exception;

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
	 * @date 2012-5-2 下午5:01:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupOutMember(IBOCmxGroupOutMemberValue groupOutMemberValue) throws Exception;

	/**
	 * 
	 * @Function queryGroupInnerMemBybiiId
	 * @Description 通过手机号码查询集团内网成员信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-5 下午2:08:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-5      huaiduo           v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupMemValue[] queryGroupInnerMemBybillId(String billId) throws Exception;

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
	 * @date 2012-5-11 下午3:25:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemberLevel(IBOCmxGroupMemberValue groupMemberValue) throws Exception;

	/**
	 * 
	 * @Function saveGroupMemberLevelByfile
	 * @Description 批量保存集团网内成员级别
	 *
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-11 下午6:51:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemberLevelByfile(IBOCmxGroupMemberValue[] groupMemberValues) throws Exception;

	/**
	 * 
	 * @Function queryGroupMemberLevelBybillIds
	 * @Description 根据手机号码查询集团成员级别信息
	 *
	 * @param condition
	 * @param paraMap
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-14 下午3:46:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-14      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupMemberValue[] queryGroupMemberLevelBybillId(String billId) throws Exception;

	/**
	 * 
	 * @Function queryGroupCreditPoint
	 * @Description xml查询集团信用积分
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-30 下午08:28:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupCreditPointValue[] queryGroupCreditPoint(String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryCreditPointCount
	 * @Description xml查询集团信用积分的数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-30 下午02:44:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryCreditPointCount(String condition, Map parameter) throws Exception;

	/**   
	 * @Function queryGroupCustHisCount
	 * @Description 查询集团客户历史信息数量
	 *
	 * @param opId
	 * @param custId
	 * @param custName
	 * @param doneDate
	 * @param startDate
	 * @param endDate
	 * @return
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 24, 2012 10:15:14 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryGroupCustHisCount(long opId, long custId,String custName, String doneDate, String startDate, String endDate) throws Exception;
	
	public int queryGroupCustHisCountById(long opId, long custId,String custServiceId, String doneDate, String startDate, String endDate) throws Exception;

	/**   
	 * @Function queryGroupCustHis
	 * @Description 查询集团客户历史信息
	 *
	 * @param opId
	 * @param custId
	 * @param custName
	 * @param doneDate
	 * @param startDate
	 * @param endDate
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 24, 2012 10:28:48 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerHValue[] queryGroupCustHis(long opId, long custId,String custName, String doneDate, String startDate, String endDate, int startNum, int endNum) throws Exception;
	
	public IBOCmGroupCustomerHValue[] queryGroupCustHisById(long opId, long custId,String custServiceId, String doneDate, String startDate, String endDate, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryGroupCustHis
	 * @Description 查询集团客户历史信息
	 *
	 * @param condition
	 * @param paraMap
	 * @param billingCycles
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 24, 2012 10:16:39 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerHValue[] queryGroupCustHis(String condition, Map paraMap, String[] billingCycles, int startNum, int endNum) throws Exception;
}
