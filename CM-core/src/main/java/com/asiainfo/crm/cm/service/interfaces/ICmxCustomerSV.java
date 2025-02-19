package com.asiainfo.crm.cm.service.interfaces;

import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerHValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxBusiIntelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustLanguageValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustRealNameInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustSecondCardInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupAddInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupCreditPointRecValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupInformInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupOutMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustHisValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemberExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupOrgStructValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxIndivPartyHobbyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxPartyContTypeInfoValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName ICmxCustomerSV
 * @Description 该类定义了跟客户的创建、修改、查询等相关的服务。这里面的服务是提供给外部使用的。<br>
 *
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-3-14 上午10:06:04
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-14     zhangyin           v1.0.0               修改原因<br>
 */
public interface ICmxCustomerSV {

	/**   
	 * @Function saveCustomerExt
	 * @Description 保存上海客户扩展信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-14 上午10:07:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     zhangyin           v1.0.0               修改原因<br>
	 */
	public void saveCustomerExt(IVOCustValue custValue) throws Exception;

	/**
	 * 根据前台构造的查询条件XML报文查询客户信息。包括所有类型客户的查询。
	 * @Function queryCustomers
	 * @Description 
	 *
	 * @param xmlComdition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-17 下午12:55:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-17    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryCustomers(String xmlComdition, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryCustomerCount
	 * @Description 根据前台构造的查询条件XML报文查询客户数量。包括所有类型客户的查询。
	 *
	 * @param xmlComdition 符合条件的客户数量
	 * @return
	 * @throws Exception 
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-17 上午10:54:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-17    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryCustomerCount(String xmlComdition) throws Exception;

	/**
	 * 
	 * @Function queryCustomerExt
	 * @Description 查询上海个人客户扩展信息
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-15 上午10:41:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustExtValue queryCustomerExt(long custId) throws Exception;

	/**
	 * 
	 * @Function queryManager
	 * @Description 查询客户经理
	 *
	 * @param custId 经理编号
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-3-15 上午10:59:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     mofangrui          v1.0.0               修改原因<br>
	 */
	public DataContainer queryManager(long custId) throws Exception;

	/**
	 * 
	 * @Function queryGroupOrgStruct
	 * @Description 根据客户查询到组织结构信息
	 *
	 * @param deptName
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-27 下午03:18:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-27    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupOrgStructValue[] queryGroupOrgStruct(long custId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupOrgStructCount
	 * @Description  组织结构信息数量
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-30 下午02:59:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30    zhangwei21         v1.0.0               修改原因<br>
	 */

	public int queryGroupOrgStructCount(long custId) throws Exception;

	/**
	 * 
	 * @Function queryGroupOrgStructByDeptId
	 * @Description 查询父节点下的部门信息
	 *
	 * @param deptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-27 下午05:39:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-27    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupOrgStructValue queryGroupOrgStructByDeptId(long deptId) throws Exception;

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
	 * @date 2012-4-26 下午07:38:48
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
	 * @date 2012-4-26 下午09:49:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26    zhangwei21         v1.0.0               修改原因<br>
	 */
	public boolean checkDeptName(long custId, String deptName) throws Exception;

	/**   
	 * @Function queryCustExtAndContact
	 * @Description 查询客户基本信息，扩展信息，联系人信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-26 下午07:16:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-26     zhangyin           v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryCustExtAndContact(long custId) throws Exception;

	/**
	 * 
	 * @Function queryGroupMember
	 * @Description 查询集团信息、成员信息及成员扩展信息
	 *
	 * @param relid
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-3-24 下午02:08:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-24     mofangrui          v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupMemberExtValue queryGroupMemberExt(long relid) throws Exception;

	/**
	 * 
	 * @Function queryGroupImportMemInfo
	 * @Description 集团重要成员信息查询
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-28 上午11:51:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-28     huaiduo        v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryGroupImportMemInfo(long custId, long custContId, long partyId) throws Exception;

	/**
	 * 
	 * @Function queryGroupImportMemHobbyBypartyId
	 * @Description 查询集团联系人兴趣爱好信息
	 *
	 * @param partyId
	 * @param hobbyType :爱好类型
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 上午11:31:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivPartyHobbyValue[] queryPartyHobbyBypartyId(long partyId, int hobbyType, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupImportMemHobbyCountBypartyId
	 * @Description 查询集团联系人数量
	 *
	 * @param partyId
	 * @param hobbyType :爱好类型
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 上午11:31:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryPartyHobbyCountBypartyId(long partyId, int hobbyType) throws Exception;

	/**
	 * 
	 * @Function queryIndivPartyContTypeBypartyId
	 * @Description 查询联系人类型2信息
	 *
	 * @param partyId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午03:36:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxPartyContTypeInfoValue[] queryGroupContTypeBypartyId(long partyId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupContTypeCountBypartyId
	 * @Description 查询联系人类型2数量
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午03:38:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryGroupContTypeCountBypartyId(long partyId) throws Exception;

	/**
	 * 
	 * @Function saveGroupMemPartyInfoExt
	 * @Description 保存集团联系人拓展信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午07:28:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public void saveGroupMemPartyInfoExt(IVOCustValue custValue) throws Exception;

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
	 * @date 2012-4-8 下午01:37:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-8    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupAddInfoValue queryGroupCustChance(long custId) throws Exception;

	/**
	 * 
	 * @Function queryGroupInformInfoBy
	 * @Description 根据custId,informTypeId 查出集团信息化信息对象
	 *
	 * @param custId
	 * @param informTypeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-10 下午08:37:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupInformInfoValue queryGroupInformInfoBy(int informTypeId, long custId) throws Exception;

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
	 * @date 2012-4-10 下午08:37:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10    zhangwei21         v1.0.0               修改原因<br>
	 */
	public void saveGroupInformInfo(IBOCmxGroupInformInfoValue[] groupInformInfoValues) throws Exception;

	/**
	 * 根据groupId 查出集团信息化信息每种类型标示的使用状态以,的形式串联（U 使用,E 未使用）
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
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-10 下午08:37:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10    zhangwei21         v1.0.0               修改原因<br>
	 */
	public String queryIsUsedByGroupCustId(long custId) throws Exception;

	/**
	 * 
	 * @Function queryCustInfoBycustId
	 * @Description 根据custId查询客户信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-10 下午10:17:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10     huaiduo        v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryCustInfoBycustId(String billId) throws Exception;

	/**    根据操作员编号查询个人客户历史信息
	 * @Function queryIndivCustHis
	 * @Description 
	 *
	 * @param opName
	 * @param custId
	 * @param startDate
	 * @param endDate
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-10 下午7:28:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustHisValue[] queryIndivCustHis(String opName, long custId, String startDate, String endDate, int startNum, int endNum) throws Exception;

	/**   根据操作员编号查询个人客户历史信息数量
	 * @Function queryIndivCustHisCount
	 * @Description 
	 *
	 * @param opName
	 * @param custId
	 * @param startDate
	 * @param endDate
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-10 下午7:18:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10     zhangyin          v1.0.0               修改原因<br>
	 */
	public int queryIndivCustHisCount(String opName, long custId, String startDate, String endDate) throws Exception;

	/**   查询个人客户变更后历史信息
	 * @Function queryIndivCustAfterHis
	 * @Description 
	 *
	 * @param opId
	 * @param custId
	 * @param doneDate
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-13 上午9:48:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustHisValue queryIndivCustAfterHis(long opId, long custId, String doneDate, String startDate, String endDate) throws Exception;

	/**   查询个人客户变更前历史信息
	 * @Function queryIndivCustBeforeHis
	 * @Description 
	 *
	 * @param opId
	 * @param custId
	 * @param doneDate
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-13 下午1:40:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustHisValue queryIndivCustBeforeHis(long opId, long custId, String doneDate, String startDate, String endDate) throws Exception;

	/**
	 * 
	 * @Function queryPartyById
	 * @Description 查询集团联系人其他爱好
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-7 下午04:39:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-7     huaiduo        v1.0.0               修改原因<br>
	 */
	public IPartyValue[] queryPartyById(long partyId) throws Exception;

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
	 * @Function queryGroupInnerMem
	 * @Description 查询集团网内成员信息
	 *
	 * @param condition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-24 上午10:50:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huaiduo        v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupMemValue[] queryGroupInnerMems(long custId, String billId, String vipLevel, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function quequeryGroupInnerMemCount
	 * @Description  查询集团网内成员数量 
	 *
	 * @param condition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-24 上午10:55:23
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
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-25 下午06:42:04
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
	 * @date 2012-4-25 下午06:48:15
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
	 * @Description 查询外网成员信息  
	 *
	 * @param custId
	 * @param custRelId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-4-28 上午10:04:50
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
	 * @Description 保存集团成员扩展 信息
	 *
	 * @param cmxGroupMemValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-4-28 上午11:33:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemExt(IVOCustValue custValue) throws Exception;

	/**
	 * 
	 * @Function queryGroupModifySpecialAttr
	 * @Description 修改特殊属性
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-28 下午04:43:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer queryGroupModifySpecialAttr(long custId) throws Exception;

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
	 * @date 2012-5-2 下午4:07:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupOutMember(IBOCmxGroupOutMemberValue groupOutMemberValue) throws Exception;

	/**
	 * 
	 * @Function queryGroupInnerMemBybillId
	 * @Description 通过手机号码查询集团内网成员
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-5 下午2:03:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-5      huaiduo           v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupMemValue[] queryGroupInnerMemBybillId(String billId) throws Exception;

	/**   
	 * 根据客户编号查询集团客户所有信息，包含集团扩展属性等信息
	 * @Function queryGroupCustomerByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-5 下午3:22:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-5     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainer queryGroupCustomerByCustId(long custId) throws Exception;

	/**  
	 * 查询集团客户信息，可以指定查询有效的还是失效的 
	 * @Function queryGroupCustomerByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param state
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-6-1 下午2:44:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-1     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainer queryGroupCustomerByCustId(long custId, String state) throws Exception;

	/**   
	 * 根据客户服务编号（集团编号）查询集团客户信息
	 * @Function queryGroupCustomerByCustServiceId
	 * @Description 
	 *
	 * @param custServiceId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-30 上午11:10:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainer queryGroupCustomerByCustServiceId(String custServiceId) throws Exception;

	/**
	 * 
	 * @Function queryContTypeInfoBycustId
	 * @Description 通过集团custId查询集团联系人类型2信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-7 下午5:10:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxPartyContTypeInfoValue[] queryContTypeInfoBycustId(long custId) throws Exception;

	/**
	 * 
	 * @Function queryCreditRecord
	 * @Description 查询客户信用档案信息
	 *
	 * @param billId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-8 上午09:52:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-8    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryCreditRecord(String billId) throws Exception;

	/**
	 * 
	 * @Function queryBaseCreditRecord
	 * @Description 查询客户信用档案信息form
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-9 下午06:47:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-9    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer queryBaseCreditRecord(String billId) throws Exception;

	/**
	 * 
	 * @Function saveGroupCustMembersBatch
	 * @Description 批量保存集团网内成员
	 *
	 * @param parseList
	 * @param custId
	 * @param isFromunion
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-11 上午10:22:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11      huaiduo           v1.0.0               修改原因<br>
	 */
	public long saveGroupCustMembersBatch(List parseList, long custId) throws Exception;

	/**   
	 * 根据手机号码查询客户信息，积分信息，用户信息，终端信息等
	 * @Function queryBaseBusiIntel
	 * @Description 
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-11 下午06:18:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOCmxBusiIntelValue queryBaseBusiIntel(String billId) throws Exception;

	/**   
	 * @Function queryFeeBusiIntel
	 * @Description 
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-12 下午04:29:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-12     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOCmxBusiIntelValue queryFeeBusiIntel(String billId) throws Exception;

	/**
	 * 
	 * @Function qryActivityCreditRecord
	 * @Description 查询客户信用档案信息，终端活动情况(产品名称<营业>)
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-10 下午04:20:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-10    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] qryActivityCreditRecord(String billId) throws Exception;

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
	 * @date 2012-5-11 下午3:21:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemberLevel(IBOCmxGroupMemberValue groupMemberValue) throws Exception;

	/**
	 * 
	 * @Function saveGroupMemberLevelBatch
	 * @Description 批量保存集团内网成员级别
	 *
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-11 下午6:03:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11      huaiduo           v1.0.0               修改原因<br>
	 */
	public long saveGroupMemberLevelBatch(List parseList, int memberLevel) throws Exception;

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
	 * @date 2012-5-11 下午6:48:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemberLevelByfile(IBOCmxGroupMemberValue[] groupMemberValues) throws Exception;

	/**
	 * 
	 * @Function qryLetPhoneCreditRecord
	 * @Description 查询客户信用档案信息，租机情况
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-11 下午03:41:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] qryLetPhoneCreditRecord(String billId) throws Exception;

	/**
	 * 
	 * @Function changeTimeCreditRecord
	 * @Description 客户信用档案，过户时间
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-25 下午05:09:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-25    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] changeTimeCreditRecord(String billId) throws Exception;

	/**
	 * 
	 * @Function doingActivityCreditRecord
	 * @Description 查询客户信用档案信息，正在履行的终端活动(产品名称<营业>)
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-11 下午04:59:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] doingActivityCreditRecord(String billId) throws Exception;

	/**
	 * 
	 * @Function queryGroupMemberLevelBybillIds
	 * @Description 通过手机号码查询集团成员级别信息
	 *
	 * @param xmlComdition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-14 下午3:40:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-14      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupMemberValue[] queryGroupMemberLevelBybillIds(String criteria, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupMemberLevelBybillIdsCount
	 * @Description 根据手机号码查询集团成员级别数量
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-14 下午3:41:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-14      huaiduo           v1.0.0               修改原因<br>
	 */
	public int queryGroupMemberLevelBybillIdsCount(String criteria) throws Exception;

	/**
	 * 
	 * @Function queryCustLanguage
	 * @Description 查询客户默认语言
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-16 下午8:40:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-16      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxCustLanguageValue[] queryCustLanguage(long relObjectId, int relObjectType) throws Exception;

	/**
	 * 
	 * @Function saveCustLanguage
	 * @Description 设置默认语言
	 *
	 * @param custLanguageValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-17 下午4:54:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-17      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveCustLanguage(IBOCmxCustLanguageValue custLanguageValue) throws Exception;

	/**
	 * 
	 * @Function queryCustRealNameInfo
	 * @Description 查询实名制情况信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-22 下午8:17:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxCustRealNameInfoValue[] queryCustRealNameInfo(long custId) throws Exception;

	/**
	 * 批量修改集团客户信用等级
	 * @param custIds 集团客户编号数组
	 * @param creditDegree 信用等级
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 22, 2012 9:06:29 PM
	 */
	public void batchModifyGroupCustCreditDegree(String[] custIds, int creditDegree) throws Exception;

	/**
	 * 客户经理调配
	 * @param dcs
	 * @param newManagerId
	 * @param changeReason
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 23, 2012 10:43:15 AM
	 */
	public void chgCustRelatedManager(DataContainerInterface[] dcs, long newManagerId, String changeReason) throws Exception;

	/**
	 * 保存集团信用积分修改记录
	 * @param cmxGroupPointRecBean
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 26, 2012 2:51:40 PM
	 */
	public void adjustGroupPoints(DataContainer cmxGroupPointRecBean) throws Exception;

	/**
	 * 
	 * @Function businessChannelCreditRecord
	 * @Description 客户信用档案 根据手机号码查询国际长话，漫游，办理渠道等信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-26 下午04:18:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-26    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] businessChannelCreditRecord(String billId) throws Exception;

	/**   
	 * 客户相关信息查询（配合营业开户，过户，分户，并户等使用）
	 * @Function queryCustForSO
	 * @Description 
	 *
	 * @param billId
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-28 下午5:05:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-28     zhangyin          v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustForSO(String billId, String xmlComdition) throws Exception;

	/**
	 * 
	 * @Function queryCreditPoint
	 * @Description   xml集团信用积分查询
	 *
	 * @param xmlComdition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-30 下午12:53:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryCreditPoint(String xmlComdition, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryCreditPointCount
	 * @Description xml查询信用积分的数量
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-5-30 下午01:55:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryCreditPointCount(String xmlComdition) throws Exception;

	/**   
	 * 根据手机号码和证件号码判断是否是当前客户
	 * @Function checkCertCodeIsCurrentCust
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午8:43:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public boolean checkCertCodeIsCurrentCust(String billId, int custCertType, String custCertCode) throws Exception;

	/**   
	 * 判断用户状态，停机状态
	 * @Function checkUserState
	 * @Description 
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午8:48:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public String checkUserState(String billId) throws Exception;

	/**   
	 * 验证同证件类型同号码不同姓名的客户
	 * @Function checkCustSameNameByCert
	 * @Description 
	 *
	 * @param certType
	 * @param certCode
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午9:08:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public boolean checkCustSameNameByCert(int certType, String certCode, String custName) throws Exception;

	/**   
	 * 5+2验证（5个预付费和2个后付费）
	 * @Function checkFivePlusTwo
	 * @Description 
	 *
	 * @param certType
	 * @param certCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午9:37:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public String checkFivePlusTwo(int certType, String certCode) throws Exception;

	/**   
	 * 神州行爱心卡（AD版）相关证件验证
	 * @Function checkSZXAXKADB
	 * @Description 
	 *
	 * @param billId
	 * @param certType
	 * @param certCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-31 下午9:22:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     zhangyin          v1.0.0               修改原因<br>
	 */
	public String checkSZXAXKADB(String billId, int certType, String certCode) throws Exception;

	/**
	 * 
	 * @Function modifyGroupCustState
	 * @Description 集团返销户与销户
	 *
	 * @param custId
	 * @param state
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-6-5 上午11:02:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-5    zhangwei21         v1.0.0               修改原因<br>
	 */
	public void modifyGroupCustState(DataContainer dContainer) throws Exception;

	/**
	 * 
	 * @Function queryPartyHobbyBypartyId
	 * @Description 
	 *
	 * @param partyId
	 * @param hobbyType
	 * @param bobbyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-6-12 下午03:28:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12     mofangrui        v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivPartyHobbyValue[] queryPartyHobbyBypartyId(long partyId, int hobbyType, int bobbyId[]) throws Exception;

	/**
	 * 
	 * @Function queryCustSecondCardInfo
	 * @Description 查询客户第二证件信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-13 上午10:34:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-13      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxCustSecondCardInfoValue queryCustSecondCardInfo(long custId) throws Exception;

	/**
	 * 
	 * @Function queryCustomerRealName
	 * @Description 按手机号码查询实名制客户
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-6-15 上午11:22:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-15     mofangrui        v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerRealName(String billId) throws Exception;

	/**
	 * 
	 * @Function checkOwnBillSumByUserId
	 * @Description 查询用户预销帐欠费和欠费情况
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-18 下午7:49:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-18      huaiduo           v1.0.0               修改原因<br>
	 */
	public String checkOwnBillSumByUserId(long userId) throws Exception;

	/**
	 * 
	 * @Function queryBbossPromInfo
	 * @Description 优惠捆绑信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-7-4 下午7:44:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-4     huaiduo          v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryBbossPromInfo(String billId) throws Exception;

	/**
	 * 
	 * @Function checkCusttDifferentNameByCert
	 * @Description 校验同证件不同客户名称
	 *
	 * @param certType
	 * @param certCode
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-7-6 上午10:01:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-6     huaiduo          v1.0.0               修改原因<br>
	 */
	public boolean checkCustDifferentNameByCert(int certType, String certCode, String custName) throws Exception;

	/**
	 * 
	 * @Function queryGroupCustomerByBillId
	 * @Description 根据billId查询集团信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author qianmx
	 * @date Jul 12, 2012 4:00:38 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     qianmx           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryGroupCustomerByBillId(String billId) throws Exception;

	/**
	 * 
	 * @Function custSecondCertCount
	 * @Description 查询同证件类型同证件号码第二证件数量
	 *
	 * @param secondCertType
	 * @param secondCertCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-7-20 下午2:11:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-20     huaiduo          v1.0.0               修改原因<br>
	 */
	public int queryCustSecondCertCount(int secondCertType, String secondCertCode) throws Exception;

	/**   
	 * @Function queryGroupHisCount
	 * @Description 查询集团客户历史信息数量
	 *
	 * @param opName
	 * @param custId
	 * @param custName
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 24, 2012 10:40:06 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryGroupHisCount(String opName, long custId, String custName, String startDate, String endDate) throws Exception;
	
	public int queryGroupHisCountById(String opName, long custId, String custServiceId, String startDate, String endDate) throws Exception;

	/**   
	 * @Function queryGroupCustHis
	 * @Description 查询集团客户历史信息
	 *
	 * @param opName
	 * @param custId
	 * @param custName
	 * @param startDate
	 * @param endDate
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 24, 2012 10:41:22 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerHValue[] queryGroupCustHis(String opName, long custId, String custName, String startDate, String endDate, int startNum, int endNum) throws Exception;
	
	public IBOCmGroupCustomerHValue[] queryGroupCustHisById(String opName, long custId, String custServiceId, String startDate, String endDate, int startNum, int endNum) throws Exception;

	/**   
	 * @Function dealGroupMemberRel
	 * @Description 处理集团成员关系（只对集团成员关系表和辽宁扩展表处理）
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 3, 2012 2:09:15 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 3, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void dealGroupMemberRel(IVOCustValue custValue) throws Exception;

	/**   
	 * @Function queryGroupCustByCdn
	 * @Description 查询集团客户信息
	 *
	 * @param qryType
	 * 1       成员手机号
	 * 2       集团名称（只支持右端模糊）
	 * 3       集团编号
	 * @param qryValue
	 * @return map
	 * key:				value
	 * GroupCustId		集团编码
	 * CustName			集团名称
	 * CustAddr			集团地址
	 * CustManagerName	客户经理名称
	 * CustManagerPhone	客户经理电话
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 12, 2012 2:55:00 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 12, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map queryGroupCustByCdn(int qryType, String qryValue) throws Exception;
	
	/**   
	 * @Function delGroupCust
	 * @Description 彻底删除集团客户
	 *
	 * @param custId
	 * @param regionId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 19, 2012 11:32:42 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 19, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void delGroupCust(long custId,String regionId)throws Exception;
	
	/**   
	 * @Function queryCmxGroupCustomer
	 * @Description 查询集团的扩展信息
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 9 2, 2014 11:32:42 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 9 2, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOLnCmxGroupCustValue queryCmxGroupCustomer(long custId)throws Exception;
	/**   
	 * @Function queryCmxCustomer
	 * @Description 查询个人或者集团的扩展信息
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 9 2, 2014 11:32:42 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 9 2, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCmxCustomer(long custId)throws Exception;
}
