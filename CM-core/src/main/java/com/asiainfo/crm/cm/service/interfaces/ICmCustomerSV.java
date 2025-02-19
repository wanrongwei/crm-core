/**
 * 
 */
package com.asiainfo.crm.cm.service.interfaces;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCprToTTValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustBadRecordValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsCustLifecycleHValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealHValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmCustRequestValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmCustGroupMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmCustGroupValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;
import com.asiainfo.crm.cm.customer.indiv.ivalues.IQBOCmCustomerContactValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmCustPutOnRecordValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsSegmentCalValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmContactContMedAndMedTypeValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumPojoBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactMediumRelBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactMediumRelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContMedTypeValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPreferChannelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmPreferPeriodValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmContactContMediumInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOCmIndivManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.inter.exe.webservice.client.cpr.log.ivalues.IBOInterCallLogValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ICmCustomerSV
 * @Description 该类定义了跟客户的创建、修改、查询等相关的服务。这里面的服务是提供给外部使用的。<br>
 * 
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:27:49
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public interface ICmCustomerSV {

	/**   
	 * @Function queryCustomerByCustId
	 * @Description 
	 *
	 * @param custId 客户编号
	 * @return ICustomerValue 客户对象
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-26 上午10:46:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-26     huzq2           v1.0.0               修改原因
	 */
	public ICustomerValue queryCustomerByCustId(long custId) throws Exception;

	/**   
	 * @Function changeState
	 * @Description 
	 *
	 * @param custIds 客户编号
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-3-5 上午10:46:49
	 * 
	 */
	public void changeState(long[] custIds) throws Exception;

	/**   
	 * @Function changePriority
	 * @Description 
	 *
	 * @param prioritys ,ids
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-3-5 上午10:46:49
	 * 
	 */
	public void changePriority(long[] ids, int[] prioritys) throws Exception;

	/**   
	 * @Function changeStatus
	 * @Description 
	 *
	 * @param prioritys ,ids,status
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-3-5 上午10:46:49
	 * 
	 */
	public void changeStatus(long[] ids, String[] status) throws Exception;

	/**   
	 * 根据客户编号、客户记录状态等查询客户信息
	 * @Function queryCustomerByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param state
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-6-1 上午1:14:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-1     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerByCustId(long custId, String state) throws Exception;

	/**   
	 * 根据客户编号、客户记录状态等查询客户信息（需要传入业务编码，用于记录业务日志）
	 * 
	 * @Function queryCustomerByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param state
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-18 下午2:21:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-18     huzq           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerByCustId(long custId, String state, long businessId) throws Exception;

	/**
	 * 
	 * @Function queryCustomerByServiceId
	 * @Description 根据客户编号查询客户信息
	 *
	 * @param serviceId 客户编号
	 * @param custType 客户种类，1为个人客户，3为集团客户
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 20, 2012 7:09:32 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 20, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerByServiceId(String serviceId, int custType) throws Exception;

	/**   
	 * @Function queryCustomerCount
	 * @Description 根据指定条件查询客户数量
	 *
	 * @param conditionDC 查询条件DC
	 * @return 符合条件的客户数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-31 下午2:31:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-31     Xiaohu           v1.0.0               修改原因<br>
	 */
	public int queryCustomerCount(DataContainer conditionDC) throws Exception;

	/**   
	 * @Function queryCustomerCount
	 * @Description 根据前台构造的查询条件XML报文查询客户数量。包括所有类型客户的查询。
	 *
	 * @param xmlComdition
	 * @return 符合条件的客户数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-21 下午1:47:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-21     huzq2           v1.0.0               修改原因
	 */
	public int queryCustomerCount(String xmlComdition) throws Exception;

	/**   
	 * @Function queryCustomers
	 * @Description 根据指定条件查询客户信息
	 *
	 * @param conditionDC 查询条件DC
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-31 下午2:30:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-31     Xiaohu           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomers(DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryCustomerHis
	 * @Description 根据指定条件查询客户历史信息
	 *
	 * @param conditionDC
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午3:06:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomerHis(DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryCustomers
	 * @Description 根据前台构造的查询条件XML报文查询客户信息。包括所有类型客户的查询。
	 * 
	 * @param xmlComdition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-21 下午1:32:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-21     huzq2           v1.0.0               修改原因
	 */
	public ICustomerValue[] queryCustomers(String xmlComdition, int startNum, int endNum) throws Exception;

	/**   
	 * 保存客户信息。该方法定义需要支持保存所有类型的客户信息以及客户联系人等信息。
	 * @Function saveCustomer
	 * @Description 保存客户信息。该方法定义需要支持保存所有类型的客户信息以及客户联系人等信息。
	 *
	 * @param custValue
	 * @return 当前客户的编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-9 下午4:30:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-9     huzq2           v1.0.0               修改原因<br>
	 */
	public long saveCustomer(IVOCustValue custValue) throws Exception;
	
	/**
	 * 保存纯User信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-11-21
	* ICmCustomerSV
	 */
	public long savePureUser(IVOCustValue custValue) throws Exception;

	/**   
	 * @Function saveCustomer
	 * @Description 保存客户基本信息
	 *
	 * @param customerValue
	 * @return 当前客户的编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-9 下午4:53:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-9     huzq2           v1.0.0               修改原因<br>
	 */
	public long saveCustomer(ICustomerValue customerValue) throws Exception;

	/**   
	 * @Function queryCustomerHisCount
	 * @Description 根据条件查询客户历史信息数量
	 *
	 * @param conditionDC 查询条件
	 * @return 符合条件的客户历史信息数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午3:18:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustomerHisCount(DataContainer conditionDC) throws Exception;

	/**   
	 * 根据客户经理关系主键查询客户经理明细信息
	 * @Function queryCustManagerById
	 * @Description 
	 *
	 * @param relId 客户-客户经理关系编号【必须】
	 * @param custType 客户类型【必须，用于区分该从哪张表查询】
	 * @return 客户经理明细信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-27 上午10:31:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-27     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue queryCustManagerById(long relId, int custType) throws Exception;

	/**   
	 * @Function queryCustManagersByCustId
	 * @Description 根据客户编号查询客户的客户经理信息
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 上午10:03:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue[] queryCustManagersByCustId(long custId, int startNum, int endNum) throws Exception;

	/**   
	 * 根据客户编号查询客户的客户经理信息
	 * @Function queryCustManagersByCustId
	 * @Description 
	 *
	 * @param custId 客户编号
	 * @param state 状态
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 上午1:11:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-9     huzq           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue[] queryCustManagersByCustId(long custId, String state, int startNum, int endNum) throws Exception;

	/**   
	 * 查询客户的主要客户经理经理
	 * @Function queryMainCustManagersByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 上午1:07:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-9     huzq           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue queryMainCustManagersByCustId(long custId) throws Exception;

	/**
	 * 通过条件查询客户经理
	 * @param conditionDCs
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-19
	 */
	public ICustManagerValue[] queryCustManagers(DataContainer[] conditionDCs, int custType, int startNum, int endNum) throws Exception;

	/**
	 * 通过一组客户编码查询客户经理，客户编码不能混乱（或者全是个人客户，或者全是集团客户）
	 * @param custId
	 * @param custType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-17
	 */
	public ICustManagerValue[] queryCustManagersByCustIds(long custId[], int custType, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryCustManagersByCustIds
	 * @Description 
	 *
	 * @param custId
	 * @param custType
	 * @param state
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-11 下午8:04:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-11     huzq           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue[] queryCustManagersByCustIds(long custId[], int custType, String state, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryCustManagerCountByCustId
	 * @Description 根据客户编号查询客户的客户经理信息数量
	 *
	 * @param custId 客户编号
	 * @return 符合条件的客户经理数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 上午10:09:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustManagerCountByCustId(long custId) throws Exception;

	/**   
	 * 根据客户编号查询客户的客户经理信息数量
	 * @Function queryCustManagerCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param state
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 上午1:16:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-9     huzq           v1.0.0               修改原因<br>
	 */
	public int queryCustManagerCountByCustId(long custId, String state) throws Exception;

	/**   
	 * @Function queryCustManagersByServiceId
	 * @Description 根据客户服务编号查询客户的客户经理信息
	 *
	 * @param custServiceId 客户服务编号
	 * @param custType 客户类型
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的客户经理信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 上午10:04:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue[] queryCustManagersByServiceId(String custServiceId, int custType, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryCustManagerCountByServiceId
	 * @Description 根据客户服务编号查询客户的客户经理信息数量
	 *
	 * @param custServiceId 客户服务编号
	 * @param custType 客户类型
	 * @return 符合条件的客户经理信息数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 上午10:09:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustManagerCountByServiceId(String custServiceId, int custType) throws Exception;

	/**   
	 * 根据格式化的查询条件客户组织结构信息
	 * @Function queryCustOrganizes
	 * @Description 
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:54:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizes(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 根据格式化的查询条件客户组织结构信息
	 * @Function queryCustOrganizeCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:56:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustOrganizeCount(String criteria) throws Exception;

	/**   
	 * 根据查询条件查询客户的组织结构信息
	 * @Function queryCustOrganizes
	 * @Description 
	 *
	 * @param conditionDC
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:55:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizes(DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * 根据查询条件查询客户的组织结构信息数量
	 * @Function queryCustOrganizeCount
	 * @Description 
	 *
	 * @param conditionDC
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:57:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustOrganizeCount(DataContainer conditionDC) throws Exception;

	/**   
	 * @Function queryCustOrganizeById
	 * @Description 
	 *
	 * @param deptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:58:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryCustOrganizeById(long deptId) throws Exception;

	/**   
	 * 根据客户编号查询客户组织结构
	 * @Function queryCustOrganizesByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:27:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizesByCustId(long custId, int startNum, int endNum) throws Exception;

	/**   
	 * 根据客户编号查询客户组织结构
	 * @Function queryCustOrganizes
	 * @Description 
	 *
	 * @param custId
	 * @param deptType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:27:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizes(long custId, int deptType, int startNum, int endNum) throws Exception;

	/**   
	 * 根据客户编号查询客户组织结构
	 * @Function queryCustOrgsByRelCustId
	 * @Description 
	 *
	 * @param relCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-6-21 下午4:27:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-21     zhuyy           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryCustOrgsByRelCustId(long relCustId) throws Exception;

	/**   
	 * 根据客户编号查询客户组织结构数量
	 * @Function queryCustOrganizeCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:30:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustOrganizeCountByCustId(long custId) throws Exception;

	/**   
	 * 根据客户编号查询客户组织结构数量
	 * @Function queryCustOrganizeCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param deptType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:30:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCustOrganizeCount(long custId, int deptType) throws Exception;

	/**
	 * 
	 * @Function queryCustOrganizeByCustIdDeptName
	 * @Description  通过集团客户编号查询组织名称为name的组织信息
	 *
	 * @param custId
	 * @param deptName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 18, 2012 2:13:08 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 18, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public DataContainer queryCustOrganizeByCustIdDeptName(long custId, String deptName) throws Exception;

	/**   
	 * 根据父级组织编号查询该组织结构下的组织结构
	 * @Function queryCustOrganizesByParentId
	 * @Description 
	 *
	 * @param parentDeptId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:30:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizesByParentId(long parentDeptId, int startNum, int endNum) throws Exception;

	/**   
	 * 根据父级组织编号查询该组织结构下的组织结构数量
	 * @Function queryCustOrganizeCountByParentId
	 * @Description 
	 *
	 * @param parentDeptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:31:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustOrganizeCountByParentId(long parentDeptId) throws Exception;

	/**   
	 * 查询指定节点下所有的子节点信息
	 * @Function querySubCustOrganizes
	 * @Description 
	 *
	 * @param parentDeptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:33:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] querySubCustOrganizes(long custId, long parentDeptId) throws Exception;

	/**
	 * 通过集团id查询集团成员
	 * @param groupId
	 * @return
	 * @throws Exception
	 * @Function: queryGroupMembersByGroupId
	 * @author: LSC
	 * @date: 2012-4-6 下午2:54:30 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-6       LSC         v1.0.0               修改原因
	 */
	public IGroupMemberValue[] queryGroupMembersByGroupId(long groupId, int startNum, int endNum) throws Exception;

	/**
	 * 通过条件查询集团成员信息
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IGroupMemberValue[] queryGroupMembers(DataContainer condition, int startNum, int endNum) throws Exception;

	/**
	 * 通过条件查询集团成员信息总行数
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 10 25, 2012 3:22:19 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 10 25, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public int queryGroupMembersCount(DataContainer condition) throws Exception;

	/** 
	 *
	 * @Function queryGroupMembersByCondition
	 * @Description 查询集团客户成员
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 19, 2012 3:22:19 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 19, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IGroupMemberValue[] queryGroupMembersByCondition(String criteria, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryGroupMembersCountByCondition
	 * @Description 查询集团客户成员数量 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 19, 2012 3:22:32 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 19, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryGroupMembersCountByCondition(String criteria) throws Exception;

	/**
	 * 
	 * @Function queryGroupMemberByCustRelId
	 * @Description 通过主键查询信息
	 *
	 * @param custRelId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 19, 2012 3:25:35 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 19, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IGroupMemberValue queryGroupMemberByCustRelId(long custRelId) throws Exception;

	/**
	 * 保存集团客户成员关系
	 * @param custRelValue 客户关系RelationType字段必须传入值，参考常量CmConstants.CustRelationShip
	 * @return
	 * @throws Exception
	 * @Function: saveGroupMember
	 * @author: LSC
	 * @date: 2012-4-6 下午2:55:12 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-6       LSC         v1.0.0               修改原因
	 */
	public long saveGroupMember(ICustRelationshipValue custRelValue) throws Exception;

	/**
	 * 保存集团客户成员
	 * @param groupMemberValue
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-4
	 */
	public long saveGroupMember(IGroupMemberValue groupMemberValue) throws Exception;

	/**
	 * 保存集团父子关系
	 * @param custValue
	 * @return
	 * @throws Exception
	 * @Function: saveGroupSubMember
	 * @author: LSC
	 * @date: 2012-4-13 上午11:29:28 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-13       LSC         v1.0.0               修改原因
	 */
	public long saveGroupSubMember(IVOCustValue custValue) throws Exception;

	/**
	 * 保存集团父子关系,custValue的parentCustId字段不能
	 * @param custValue
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-4
	 */
	public long saveGroupSubMember(ICustomerValue custValue) throws Exception;

	/**
	 * 通过集团编码查询子集团客户
	 * @param groupId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @Function: queryGroupCustSonByGroupId
	 * @author: LSC
	 * @date: 2012-4-11 下午5:55:00 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-11       LSC         v1.0.0               修改原因
	 */
	public ICustomerValue[] queryGroupCustSonByGroupId(long groupId, int startNum, int endNum) throws Exception;

	/**   
	 * 根据登录员工信息查询该员工担任客户经理下的集团信息
	 * @Function queryManagedCustomers
	 * @Description 
	 *
	 * @param managerId 客户经理编号（对应于员工编号）【必须】
	 * @param custType 客户类型：详见{@link CmConstants.CustomerType}【必须】
	 * @param startNum
	 * @param endNum
	 * @return 当前客户经理管辖的集团客户信息（分页）
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-24 下午3:32:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryManagedCustomers(long managerId, int custType, int startNum, int endNum) throws Exception;

	/**   
	 * 根据登录员工信息查询该员工担任客户经理下的集团信息
	 * @Function queryManagedCustomers
	 * @Description 
	 *
	 * @param managerId 客户经理编号（对应于员工编号）【必须】
	 * @param custType 客户类型：详见{@link CmConstants.CustomerType}【必须】
	 * @param otherConditionDC 其他查询条件，如客户名称等
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-8 上午10:28:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-8     huzq           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryManagedCustomers(long managerId, int custType, DataContainer otherConditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * 根据登录员工信息查询该员工担任客户经理下的集团信息数量
	 * @Function queryManagedCustomerCount
	 * @Description 
	 *
	 * @param managerId 客户经理编号（对应于员工编号）【必须】
	 * @param custType 客户类型：详见{@link CmConstants.CustomerType}【必须】
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-24 下午5:28:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryManagedCustomerCount(long managerId, int custType) throws Exception;

	/**   
	 * 根据登录员工信息查询该员工担任客户经理下的集团信息数量
	 * @Function queryManagedCustomerCount
	 * @Description 
	 *
	 * @param managerId 客户经理编号（对应于员工编号）【必须】
	 * @param custType 客户类型：详见{@link CmConstants.CustomerType}【必须】
	 * @param otherConditionDC 其他查询条件，如客户名称等
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-8 上午10:28:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-8     huzq           v1.0.0               修改原因<br>
	 */
	public int queryManagedCustomerCount(long managerId, int custType, DataContainer otherConditionDC) throws Exception;

	/**   
	 * 根据客户ID批量查询客户信息的接口
	 * @Function queryCustomersByCustIds
	 * @Description 
	 *
	 * @param custIds 客户编号【必须】
	 * @param custType 客户类型【必须：系统目前只支持同一个批次里面只能查询一种类型的客户】，详见{@link CmConstants.CustomerType}
	 * @return 符合条件的客户信息列表
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-24 下午3:44:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomersByCustIds(long[] custIds, int custType, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryCustByCustIds
	 * @Description 根据客户ID批量查询客户信息的接口,支持个人和集团混合查询[数组长度不能超过1000]
	 *
	 * @param custIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jan 2, 2014 11:21:46 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 2, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustByCustIds(long[] custIds) throws Exception;

	/**   
	 * 根据客户ID批量查询客户信息的数量
	 * @Function queryCustomerCountByCustIds
	 * @Description 
	 *
	 * @param custIds
	 * @param custType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午11:10:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustomerCountByCustIds(long[] custIds, int custType) throws Exception;

	/**   
	 * 获取客户服务编号。需要根据具体的业务需求来设置。
	 * @Function getCustServiceId
	 * @Description 
	 *
	 * @param customerValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午9:29:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public abstract String getCustServiceId(ICustomerValue customerValue) throws Exception;

	/**   
	 * 根据全网客户编号查询客户信息<br>
	 * <strong>注:</strong>
	 * <em>目前仅支持集团客户</em>
	 * @Function queryCustomerByEcCode
	 * @Description 
	 *
	 * @param ecCode 全网客户编号
	 * @param custType 客户类型。由于客户服务编号本身没有包含客户类型信息，调用时需要指定需要查询的客户类型。具体的客户类型定义见{@link CmConstants.CustomerType}.
	 * @return 符合条件的客户信息，如果没有查询到返回null
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-19 下午1:54:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-19     huzq           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerByEcCode(String ecCode, int custType) throws Exception;

	/**   
	 * 根据条件查询客户信息列表
	 * 
	 * @Function queryCustomers
	 * @Description 
	 *
	 * @param cols 询结果集过滤条件。如果需要查询大数据量的结果集，必须要指定查询哪些字段，避免因查询结果集太多导致系统内存溢出！
	 * @param conditionDC 查询条件DataContainer
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的客户列表
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-19 下午2:26:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomers(String[] cols, DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * 判断客户是否实名制客户
	 * 
	 * @Function isRealNameCustomer
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-31 下午4:26:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-31     huzq2           v1.0.0               修改原因<br>
	 */
	public boolean isRealNameCustomer(long custId) throws Exception;

	/**   
	 * @Function queryCustForManager
	 * @Description 客户经理分配查询方法
	 *
	 * @param xmlString
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Mar 31, 2012 2:26:04 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustForManager(String xmlString, int start, int end) throws Exception;

	/**   
	 * @Function queryCustForManagerCount
	 * @Description 客户经理分配查询方法
	 *
	 * @param xmlString
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Mar 31, 2012 2:26:21 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public int queryCustForManagerCount(String xmlString) throws Exception;

	/**   
	 * @Function queryCustForManager
	 * @Description 客户经理分配查询方法
	 *
	 * @param xmlString
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Mar 31, 2012 2:26:04 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustForManagerSql(String xmlString, String segmentId, int start, int end) throws Exception;

	/**   
	 * @Function queryCustForManagerCount
	 * @Description 客户经理分配查询方法
	 *
	 * @param xmlString
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Mar 31, 2012 2:26:21 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public int queryCustForManagerSqlCount(String xmlString, String segmentId) throws Exception;

	/**   
	 * @Function saveMgrRel
	 * @Description 保存客户经理与客户关系
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveMgrRel(IVOCustValue custValue) throws Exception;

	/**   
	 * @Function saveCustManagerIndiv
	 * @Description 保存个人客户与客户经理关系
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveCustManagerIndiv(IBOCmIndivManagerValue[] cmIndivManager) throws Exception;

	/**   
	 * @Function saveCustManagerIndiv
	 * @Description 保存集团客户与客户经理关系
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveCustManagerGroup(IBOCmGroupManagerValue[] cmIndivManager) throws Exception;

	/**   
	 * @Function getCustManagerInfoByCond
	 * @Description 查询集团客户信息总行数
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public int getCustManagerInfoByCond(long custId, long custType) throws Exception;

	/**   
	 * @Function getCustManagerInfo
	 * @Description 查询集团客户信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public IQBOSecCustManagerValue[] getCustManagerInfo(long custId, long custType, int start, int end) throws Exception;

	/**   
	 * @Function getCustManagerInfo
	 * @Description 查询客户经理信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public DataContainer[] getCustManagerDataInfo(long custId, long custType, int start, int end) throws Exception;

	/**   
	 * @Function getBoCmGrpMemberByCustIdOrMemCustId
	 * @Description 查询集团客户成员信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupMemberValue[] getBoCmGrpMemberByCustIdOrMemCustId(long custId, long memberCustId) throws Exception;

	/**   
	 * @Function queryManagerValue
	 * @Description 查询集团和个人客户经理关系
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupManagerValue[] queryManagerValue(DataContainer da, long custType, int start, int end) throws Exception;

	/**   
	 * @Function queryIndivCustValue
	 * @Description根据partyId或者客户编号 查询客户信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue queryIndivCustValue(long custId, long partyId) throws Exception;

	/**   
	 * @Function queryRootGroupInfosByCustId
	 * @Description 查询集团上级客户
	 *
	 * @param long custId,int startNum, int endNum
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zouty
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-8     zouty           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryRootGroupInfosByCustId(long custId, int startNum, int endNum) throws Exception;

	/**   
	 * @Function updateCustInfo
	 * @Description 修改客户资料（OI_UpdateCustomerInfo）
	 *
	 * @param paraMap
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 25, 2012 10:04:20 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 25, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void updateCustInfo(Map paraMap) throws Exception;

	/**   
	 * @Function queryCustomers4GroupCount
	 * @Description 集团统一受理页面查询
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 29, 2012 7:15:06 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 29, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCustomers4GroupCount(String xmlComdition) throws Exception;

	/**   
	 * @Function queryCustomers4GroupCount
	 * @Description 集团统一受理页面查询
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 29, 2012 7:15:06 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 29, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomers4Group(String xmlComdition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryCustomers4GroupByMulti
	 * @Description 集团统一受理页面查询  支持多选框
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date Oct 29, 2012 7:15:06 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 29, 2012     zhuyy           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomers4GroupByMulti(String xmlComdition, String custStatus, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryCustomers4GroupByMultiCount
	 * @Description 集团统一受理页面查询  支持多选框
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date Oct 29, 2012 7:15:06 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 29, 2012     zhuyy           v1.0.0               修改原因<br>
	 */
	public int queryCustomers4GroupByMultiCount(String xmlComdition, String custStatus) throws Exception;

	/**   
	 * @Function queryCustomerMaskByCustId
	 * @Description 查询客户信息，模糊化
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 1, 2012 2:34:20 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerMaskByCustId(long custId) throws Exception;

	/**
	 * 修改客户状态
	 * 
	 * @param custId
	 * @param newStatus
	 * @param oldStatus
	 * @throws Exception
	 */
	public void updateCustStatus(long custId, int newStatus, int oldStatus) throws Exception;

	public int queryCustomers4GroupNewCount(String xmlComdition) throws Exception;

	public DataContainerInterface[] queryCustomers4GroupNew(String xmlComdition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function getGroupContractId
	 * @Description 获取集团合同编号
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Dec 1, 2012 4:39:04 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Dec 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public long getGroupContractId() throws Exception;

	/**
	 * @Description 获取集团客户分配轨迹查询记录
	 * @author lijh
	 */
	public DataContainer[] queryCustManagerH(String custServiceId, String startDate, String endDate, int startNum, int endNum) throws Exception;

	/**
	 * @Description 获取集团客户分配轨迹查询记录条数
	 * @author lijh
	 */
	public int queryCustManagerHCount(String custServiceId, String startDate, String endDate) throws Exception;

	/**   
	 * @Function getGrpCustManagerInfo
	 * @Description 查询客户经理信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public DataContainer[] getGrpCustManagerInfo(String custServiceId, String custName, int start, int end) throws Exception;

	/**   
	 * @Function getGrpCustManagerInfo
	 * @Description 查询客户经理信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public int getGrpCustManagerInfoCount(String custServiceId, String custName) throws Exception;

	/**   
	 * @Function queryCustomerMaskByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 24, 2013 2:16:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 24, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryCustomerForAutoForm(long custId) throws Exception;

	/**   
	 * @Function queryCustOrganizesByrelCustId
	 * @Description 
	 *
	 * @param relCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 14, 2014 10:19:29 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 14, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryCustOrganizesByrelCustId(long relCustId) throws Exception;

	/**   
	 * @Function queryCustContactMediums
	 * @Description 根据客户编号和媒介类型查询客户媒介
	 *
	 * @param custId	客户编号
	 * @param mediumType 媒介类型 {CmDkConstants.CustContMedium.XXXX}
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 3, 2014 3:14:30 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 3, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustContactMediums(long custId, long mediumType, long upMediumType, int start, int end) throws Exception;

	/**   
	 * @Function queryCustContactMediumsForPage
	 * @Description 根据客户编号和媒介类型查询客户媒介(for page show)
	 *
	 * @param custId
	 * @param mediumType
	 * @param upMediumType
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 9, 2014 3:42:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustContactMediumsForPage(long custId, long mediumType, long upMediumType, int start, int end) throws Exception;

	/**   
	 * @Function queryCustElectronicMedium
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 9, 2014 3:54:16 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustElectronicMedium(long custId, int start, int end) throws Exception;

	/**   
	 * @Function queryCustElectronicMediumForPage
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 9, 2014 3:54:19 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustElectronicMediumForPage(long custId, int start, int end) throws Exception;

	/**   
	 * @Function queryGroupIndustryForPage
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-09-04 3:54:19 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-09-04     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupRelIndustryValue[] queryGroupIndustryForPage(long custId, int start, int end) throws Exception;

	/**   
	 * @Function queryGroupIndustryCount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-09-04 3:54:19 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-09-04   zhuyy           v1.0.0               修改原因<br>
	 */
	public int queryGroupIndustryCount(long custId) throws Exception;

	/**   
	 * @Function queryCustElectronicMediumCount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 9, 2014 3:54:22 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCustElectronicMediumCount(long custId) throws Exception;

	/**   
	 * @Function queryCustContactMediumsCount
	 * @Description 根据客户编号和媒介类型查询客户媒介
	 *
	 * @param custId
	 * @param mediumType {CmDkConstants.CustContMedium.XXXX}
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 3, 2014 3:40:16 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 3, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCustContactMediumsCount(long custId, long mediumType, long upMediumType) throws Exception;

	/**   
	 * @Function queryCmxIndivCustomerValue
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 3, 2014 5:57:12 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 3, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustomerValue queryCmxIndivCustomerValue(long custId) throws Exception;

	/**   
	 * @Function saveCmxIndivCustomer
	 * @Description 
	 *
	 * @param cmxIndivCustomerValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 3, 2014 5:57:15 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 3, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public void saveCmxIndivCustomer(IBOCmxIndivCustomerValue cmxIndivCustomerValue) throws Exception;

	/**   
	 * @Function queryContMediumType
	 * @Description 查询地址类型
	 *
	 * @param contMediumId
	 * @param upMediumType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 9, 2014 10:25:38 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContMedTypeValue[] queryContMediumType(long contMediumId, long upMediumType) throws Exception;

	/**   
	 * @Function queryCustRequestTask
	 * @Description 
	 *
	 * @param xmlCondition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author	huangqun
	 * @date Feb 14, 2014 10:19:29 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 14, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IQBOCmCustRequestValue[] queryCustRequestTask(String xmlCondition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryContElecMediumType
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 9, 2014 4:39:39 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContMedTypeValue[] queryContElecMediumType() throws Exception;

	/**   
	 * @Function saveCustContMedium
	 * @Description 保存客户地址
	 *
	 * @param custContactMediumValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 9, 2014 11:42:31 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public void saveCustContMedium(IBOCmCustContactMediumValue[] custContactMediumValues) throws Exception;
	
	/**
	 * 保存party 联系媒介
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-13
	* ICmCustomerSV
	 */
	public void saveContactContMediumForOSE(BOCmContactContMediumPojoBean[] cmContactContMediumBeans) throws Exception;

	/**   
	 * @Function queryCustContMediumById
	 * @Description 
	 *
	 * @param contRelaId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue queryCustContMediumById(long contRelaId) throws Exception;

	/**   
	 * @Function modifyCustAddress
	 * @Description 
	 *
	 * @param contRelaId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void modifyCustAddress(long contRelaId, String address, int isProtected, Timestamp effDate, Timestamp expDate, String addressType, String addressId, String contactPerson) throws Exception;

	/**   
	 * @Function queryCmInsCmrel
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function queryCmInsCmrelByUserId
	 * @Description 
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrelByUserId(long userId) throws Exception;

	/**   
	 * @Function saveCmInsCmrel
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void saveCmInsCmrel(IBOCmInsCmrelValue value) throws Exception;

	
	public void saveCmInsCmrel4Reaccess(IBOCmInsCmrelValue value) throws Exception;

	/**   
	 * @Function queryCustContactMedium
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue queryCustContactMedium(long contRelaId) throws Exception;
	
	/** 
	 * 根据contId  查询 party 联系媒介(经过沟通，只需要CmContactContMedium表信息)
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-13
	* ICmCustomerSV
	 */
	public IBOCmContactContMediumValue[] queryContactContMediumValueByContId(long contId) throws Exception;
	
	/** 
	 * 根据contRelaId  查询 party 联系媒介
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-13
	* ICmCustomerSV
	 */
	public IBOCmContactContMediumPojoValue[] queryContactContMediumValueByContRelaId(long contRelaId) throws Exception;
	
	/**   
	 * @Function queryCustContactMediumByCustId
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue queryCustContactMediumByCustId(long custId) throws Exception;

	/**   
	 * @Function sendToBilling
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void sendToBilling(IBOCmInsCmrelValue[] CmInsCmRelValues) throws Exception;

	/**   
	 * @Function queryContactMediumByCondition
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue[] queryContactMediumByCondition(long custId, int addressType) throws Exception;

	/**   
	 * @Function queryCmCustGroup
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmCustGroupValue[] queryCmCustGroup(String state) throws Exception;

	/**   
	 * @Function saveCustGroup
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void saveCustGroup(String code, String name, String desc) throws Exception;

	/**   
	 * @Function deleteCustGroup
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void deleteCustGroup(long id) throws Exception;

	/**   
	 * @Function saveModifyCustGroup
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void saveModifyCustGroup(long id, String code, String name, String desc) throws Exception;

	/**   
	 * @Function saveModifyCustGroup
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void saveCustGroupMember(long custGroupId, long custId) throws Exception;

	/**   
	 * @Function queryCustGroupMember
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmCustGroupMemberValue[] queryCustGroupMember(long custGroupId, String state) throws Exception;

	/**   
	 * @Function deleteCustGroupMember
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void deleteCustGroupMember(long id) throws Exception;

	/**   
	 * @Function queryCustGroupMemberByCondition
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmCustGroupMemberValue[] queryCustGroupMemberByCondition(long custGroupId, long custId) throws Exception;

	/**
	 * 根据管理客户编号查询组织信息
	 * @Function queryCustOrganizeByRelCustId
	 * @Description 
	 *
	 * @param relCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-5-14 下午5:37:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-5-14     yangjh           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryCustOrganizeByRelCustId(long relCustId) throws Exception;

	/**
	 * 根据上级部门编码查询组织信息
	 * @Function queryCustOrganizeByParentDeptId
	 * @Description 
	 *
	 * @param parentDeptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-6-20 下午5:37:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-20     zhuyy           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryCustOrganizeByParentDeptId(long parentDeptId) throws Exception;

	/**
	 * 根据deptId查询组织信息
	 *
	 * @param deptId
	 * @return
	 * @throws Exception
	 */
	ICustOrganizeValue queryCustOrganizeByDeptId(long deptId) throws Exception;

	/**
	 * 根据管理客户编号查询组织信息
	 * @Function queryCustContactByCustId
	 * @Description 
	 *
	 * @param relCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-5-14 下午5:37:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-5-14     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue queryCustContactByCustId(long custId) throws Exception;

	/**
	 * 根据管理客户编号查询组织信息
	 * @Function queryCustContactByCustIdAndName
	 * @Description 
	 *
	 * @param relCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-5-14 下午5:37:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-5-14     yangjh           v1.0.0               修改原因<br>
	 */
	public IQBOCmCustomerContactValue[] queryCustContactByCustIdAndName(long addressId, String name) throws Exception;

	/**   
	 * @Function queryCustContactMediumByDate
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue[] queryCustContactMediumByDate(String date) throws Exception;

	/**   
	 * @Function deleteMember
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void deleteMember(long custGroupId) throws Exception;

	/**   
	 * @Function queryCprRecord
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public String[] queryCprRecord(long cpr, String str_date, String end_date) throws Exception;

	/**   
	 * @Function changeRequestStatus
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void changeRequestStatus(long taskId) throws Exception;

	/**   
	 * @Function dealCreateIndivCustomer
	 * @Description 
	 *
	 * @param Flag=Y 针对开户,Flag=N 针对过户
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealCreateIndivCustomer(long custId, long userId, String flag) throws Exception;

	/**   
	 * @Function dealShutDownCust
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealShutDownCust(long custId, long userId, long custType, long orderId) throws Exception;

	/**   
	 * @Function dealStartMachine
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealStartMachine(long custId, long custType) throws Exception;

	/**   
	 * @Function dealIndivUserToIndivCust
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealIndivUserToIndivCust(long custId, long oldCustId, long userId, long orderId) throws Exception;

	/**   
	 * @Function dealDeleteCustUserRel
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealDeleteCustUserRel(long custId, long userId) throws Exception;

	/**   
	 * @Function dealValidateUser
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealValidateUser(long custId, long userId, long orderId) throws Exception;

	/**   
	 * @Function dealIndivUserToGroupCust
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealIndivUserToGroupCust(long custId, long userId, long oldCustId, long orderId) throws Exception;

	/**   
	 * @Function dealGroupUserToIndivCust
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealGroupUserToIndivCust(long custId, long userId, long oldCustId) throws Exception;

	/**   
	 * @Function dealGroupUserToGroupCust
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void dealGroupUserToGroupCust(long custId, long userId, long oldCustId) throws Exception;

	/**   
	 * @Function deleteCmInsCmrel
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void deleteCmInsCmrel(long cmrelId, long custId) throws Exception;

	/**   
	 * @Function deleteCmInsCmrelByMemberCustId
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date Apr 9, 2014 4:45:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 9, 2014     huangqun          v1.0.0               修改原因<br>
	 */
	public void deleteCmInsCmrelByMemberCustId(long memberCustId) throws Exception;

	/**
	 * 
	 * @Function changeRequestStatusAndResults
	 * @Description 根据客户编号和请求类型修改请求状态和请求结果
	 *
	 * @param custId
	 * @param requestType
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-12 下午3:32:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-12     mael           v1.0.0               修改原因<br>
	 */
	public void changeRequestStatusAndResults(long custId, long requestType, String requestResult) throws Exception;

	/**
	 * 
	 * @Function changeAddressId
	 * @Description 根据客户编号和关系类型编码修改标准地址编号
	 *
	 * @param custId
	 * @param contMedTypeId
	 * @param addressId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-12 下午4:45:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-12     mael           v1.0.0               修改原因<br>
	 */
	public void changeAddressId(long custId, long contMedTypeId, long addressId, Timestamp effDates) throws Exception;

	/**
	 * 
	 * @Function updateCPRInfoToCustomer
	 * @Description 根据客户编码修改用户姓名
	 *
	 * @param custId
	 * @param firstName
	 * @param lastName
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-12 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-12     mael           v1.0.0               修改原因<br>
	 */
	public void updateCPRInfoToCustomer(long custId, String firstName, String lastName) throws Exception;

	/**
	 * 
	 * @Function queryCustSegment
	 * @Description 根据客户编码修改用户姓名
	 *
	 * @param custId
	 * @param firstName
	 * @param lastName
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-12 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-12     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmCustSegmentValue[] queryCustSegment(long upSegId) throws Exception;

	/**
	 * 
	 * @Function queryCustomerByCPR
	 * @Description 根据CPR查询客户信息
	 *
	 * @param CPR
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-6-24 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-24     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue[] queryCustomerByCPR(String CPR) throws Exception;

	/**
	 * 
	 * @Function queryCustomerByCPR
	 * @Description 根据CPR查询客户信息
	 *
	 * @param CPR
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-6-24 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-24     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue[] queryCustomerByCPR(String cpr, int custType) throws Exception;

	/**
	 * 
	 * @Function queryCmxIndivCustomer()
	 * @Description 查询个人客户扩展信息
	 *
	 * @param
	 * @param intervalDate
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-6-24 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-24     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustomerValue[] queryCmxIndivCustomer(int intervalDate) throws Exception;

	/**
	 * 
	 * @Function queryCmxGroupCustomer()
	 * @Description 查询集团客户扩展信息
	 *
	 * @param
	 * @param intervalDate
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-6-24 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-24     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOLnCmxGroupCustValue[] queryCmxGroupCustomer(int intervalDate) throws Exception;

	/**
	 * 
	 * @Function queryIndivCustomerInfo()
	 * @Description 查询个人客户信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-6-24 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-7-7     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue queryIndivCustomerInfo(long custId) throws Exception;

	/**
	 * 
	 * @Function queryGroupCustomerInfo()
	 * @Description 查询集团客户信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-6-24 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-7-7     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerValue queryGroupCustomerInfo(long custId) throws Exception;

	/**
	 * 
	 * @Function queryCustContactMediumByCustIdAndType
	 * @Description 查询集团客户信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-6-24 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-7-7     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue queryCustContactMediumByCustIdAndType(long custId, String contMedTypeId) throws Exception;

	/**
	 * 
	 * @Function queryCmCustContMedType(String state)
	 * @Description 查询联系媒介类型
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-7-14 下午5:09:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-7-14     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContMedTypeValue[] queryCmCustContMedType(String state) throws Exception;

	/**
	 * 
	 * @Function saveCmFileSyncErrLog
	 * @Description 
	 *
	 * @param cmFileSyncErrLogValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-7-14 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-7-14     mael           v1.0.0               修改原因<br>
	 */
	public void saveCmFileSyncErrLog(IBOCmFileSyncErrLogValue cmFileSyncErrLogValue) throws Exception;

	/**
	 * 
	 * @Function queryCmCustByCustInfoAndAddress
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-7-15 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-7-15     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue[] queryCmCustByCustInfoAndAddress(String name, String birth, long addressId) throws Exception;

	/**
	 * 根据地址ID没匹配到客户再根据地址详情匹配，兼容重复地址问题，优化重复客户判断逻辑
	 * @param name
	 * @param birth
	 * @param addressDetail
	 * @return
	 * @throws Exception
	 */
	IBOCmIndivCustomerValue[] queryCmCustByCustInfoByAddressDetail(String name, String birth, String addressDetail) throws Exception;

	/**
	 * 根据起始时间和结束时间查询阶段内的cpr日志信息
	 * @param xmlComdition
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public IBOInterCallLogValue[] queryCprLogInfo(String xmlComdition, int startIndex, int endIndex) throws Exception;

	public int queryCprLogInfoCount(String xmlComdition) throws Exception;

	/**
	 * 
	 * @Function saveCustPreferChannel
	 * @Description 
	 *
	 * @param custPreferChannelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-3 下午3:42:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-3     mael           v1.0.0               修改原因<br>
	 */
	public void saveCustPreferChannel(IBOCmCustPreferChannelValue[] custPreferChannelValues) throws Exception;

	/**
	 * 
	 * @Function saveCustPreferTime
	 * @Description 
	 *
	 * @param custPreferInfoValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-4 下午2:52:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-4     mael           v1.0.0               修改原因<br>
	 */
	public void saveCustPreferTime(IBOCmPreferPeriodValue[] custPreferInfoValue) throws Exception;

	/**
	 * 
	 * @Function queryCustElectronicMediumForPageSele
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-5 下午4:22:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-5     mael           v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustElectronicMediumForPageSele(long custId, int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryCustElectronicMediumCountSele
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-5 下午4:22:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-5     mael           v1.0.0               修改原因<br>
	 */
	public int queryCustElectronicMediumCountSele(long custId) throws Exception;

	/**
	 * 
	 * @Function queryCmInsCmrelCount
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-9	 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-9     huangqun           v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmrelCount(long custId) throws Exception;

	/**
	 * 
	 * @Function queryIndivCust
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-9	 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-9     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue[] queryIndivCust(String custName, String certCode, String custId, int startIndex, int endIndex) throws Exception;

	/**
	 * 
	 * @Function queryIndivCustCount
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-9	 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-9     huangqun           v1.0.0               修改原因<br>
	 */
	public int queryIndivCustCount(String custName, String certCode, String custId) throws Exception;

	/**
	 * 
	 * @Function queryContactContMediumForPage
	 * @Description 
	 *
	 * @param custContId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-17 上午11:00:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmContactContMediumValue[] queryContactContMediumForPage(long custContId, int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryContactContMediumInfoForPage
	 * @Description 
	 *
	 * @param custContId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-19 上午10:51:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-19     mael           v1.0.0               修改原因<br>
	 */
	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoForPage(long contId, int start, int end) throws Exception;
	
	/**
	 * 通过contId，和UseType查询联系人联系媒介
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2020-6-23
	* ICmCustomerSV
	 */
	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoByContIdAndUseTypeForPage(long contId, long useType ,int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryContactContMediumCount
	 * @Description 
	 *
	 * @param custContId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-17 上午11:02:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     mael           v1.0.0               修改原因<br>
	 */
	public int queryContactContMediumCount(long custContId) throws Exception;

	/**
	 * 
	 */
	public int queryContactContMediumInfoCountByContIdAndUseType(long contId,long useType) throws Exception;
	
	/**
	 * 
	 * @Function queryContactContMediumInfoCount
	 * @Description 
	 *
	 * @param custContId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-19 上午10:51:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-19     mael           v1.0.0               修改原因<br>
	 */
	public int queryContactContMediumInfoCount(long contId) throws Exception;

	/**
	 * 
	 * @Function saveContactContMedium
	 * @Description 
	 *
	 * @param contactContMedium
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-18 上午9:17:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-18     mael           v1.0.0               修改原因<br>
	 */
	public void saveContactContMedium(BOCmContactContMediumPojoBean[] contactContMedium) throws Exception;

	/**
	 * 
	 * @Function saveContactMediumRel
	 * @Description 
	 *
	 * @param contactMediumRel
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-18 上午9:17:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-18     mael           v1.0.0               修改原因<br>
	 */
	public void saveContactMediumRel(BOCmContactMediumRelBean[] contactMediumRel) throws Exception;

	/**
	 * 
	 * @Function queryContactMediumRel
	 * @Description 
	 *
	 * @param custContId
	 * @param contRelaId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-19 下午5:02:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-19     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmContactMediumRelValue[] queryContactMediumRel(long custContId, long contRelaId) throws Exception;

	/**
	 * 
	 * @Function queryCustContId
	 * @Description 
	 *
	 * @param partyId
	 * @param contId
	 * @param custId
	 * @param contType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-19 下午5:43:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-19     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContactValue[] queryCustContId(long partyId, long contId, long custId, int contType) throws Exception;

	public IBOCmGroupContactValue[] queryCustContIdForPage(long partyId, long contId, long custId, int contType,int startNum, int endNum) throws Exception;
	
	/**
	 * 
	 * @Function queryPriority
	 * @Description 
	 *
	 * @param medType
	 * @param priority
	 * @param contId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-19 下午6:32:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-19     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmContactContMediumPojoValue[] queryPriority(long medType, int priority, long contId) throws Exception;

	/**   
	 * @Function queryCustMedium
	 * @Description 查询客户媒介
	 *
	 * @param contRelId
	 * @param contMedTypeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午3:19:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmContactContMedAndMedTypeValue queryCustMedium(long contRelId, long contMedTypeId) throws Exception;

	/**   
	 * @Function queryContactContMedium
	 * @Description 查询联系人媒介
	 *
	 * @param custContId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午3:19:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmContactContMediumValue[] queryContactContMedium(long custContId, int start, int end) throws Exception;

	/**   
	 * @Function queryDKCustomer
	 * @Description 单表查询个人客户集团客户
	 *
	 * @param custContId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-29 下午3:19:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-29     huangqun            v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryDKCustomer(long custId) throws Exception;

	/**   
	 * @Function deleteIndivCust
	 * @Description 个人客户销户
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-7 下午3:59:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-7     shitian             v1.0.0               修改原因<br>
	 */
	public void deleteIndivCust(long custId) throws Exception;

	/**   
	 * @Function dealCustBadRecordInfo
	 * @Description 处理不良记录信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-06 下午3:19:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-06     huangqun            v1.0.0               修改原因<br>
	 */
	public void dealCustBadRecordInfo(IBOCmCustBadRecordValue value, String type) throws Exception;

	/**
	 * 处理备案记录，与不良记录是同一个task，只是type不一样
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2017-10-23
	* ICmCustomerSV
	 */
	public void dealCmCustPutOn(IBOCmCustPutOnRecordValue value) throws Exception ;
	/**   
	 * @Function queryCustBadInfoByBeskedIdAndCustId
	 * @Description 查询客户不良信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-06 下午3:19:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-06     huangqun            v1.0.0               修改原因<br>
	 */
	public IBOCmCustBadRecordValue queryCustBadInfoByBeskedIdAndCustId(String beskedId, String custId) throws Exception;

	/**   
	 * @Function savePsCustLifeCycleHis
	 * @Description 保存客户生命周期历史
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-09 下午3:19:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-09     huangqun            v1.0.0               修改原因<br>
	 */
	public void savePsCustLifeCycleHis(IBOCmPsCustLifecycleHValue value) throws Exception;

	/**   
	 * @Function savePsPublicDealHis
	 * @Description 保存客户AKS历史
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-09 下午3:19:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-09     huangqun            v1.0.0               修改原因<br>
	 */
	public void savePsPublicDealHis(IBOCmPsPublicDealHValue value) throws Exception;

	/**   
	 * @Function querySegCalValueByCustId
	 * @Description 查询计算层级工单信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-10-09 下午3:19:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-09     zhuyy            v1.0.0               修改原因<br>
	 */
	public IBOCmPsSegmentCalValue querySegCalValueByCustId(long custId) throws Exception;

	/**   
	 * @Function queryCustomerByMediuTypeAndValue
	 * @Description 根据客户媒介类型和值查询媒介信息
	 *
	 * @param upContMediumType
	 * 分为三大类
	 * CmDkConstants.CustContMedium.ADDRESS
	 * CmDkConstants.CustContMedium.ELECTRONIC_ADDRESS
	 * CmDkConstants.CustContMedium.PHONE
	 * 
	 * @param contMediumType
	 * CmDkConstants.CustContMedium.HOME_ADDRESS
	 * CmDkConstants.CustContMedium.POST_ADDRESS
	 * CmDkConstants.CustContMedium.LEGAL_ADDRESS
	 * 
	 * CmDkConstants.CustContMedium.EMAIL
	 * 
	 * CmDkConstants.CustContMedium.FIX_PHONE
	 * CmDkConstants.CustContMedium.MOBILE_PHONE
	 * CmDkConstants.CustContMedium.SMS
	 * CmDkConstants.CustContMedium.MMS
	 * CmDkConstants.CustContMedium.EMERGENCY_PHONE
	 * 
	 * @param contMediumValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-13 下午3:23:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-13     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustomerByMediuTypeAndValue(int upContMediumType, int contMediumType, String contMediumValue) throws Exception;

	/**
	 * 
	 * @Function queryAllCmInsCmrel
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-16 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-16     mael           v1.0.0               修改原因<br>
	 */
	public List<IBOCmInsCmrelValue> queryAllCmInsCmrel(long custId) throws Exception;

	/**
	 * 
	 * @Function queryCmInsByUserIdAndCustId
	 * @Description 
	 *
	 * @param custId,userId,relaType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-16 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-16     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsByUserIdAndCustId(long custId, long userId, int relaType) throws Exception;

	/**
	 * 
	 * @Function saveCmInsCmrelInfo
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-16 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-16     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveCmInsCmrelInfo(IBOCmInsCmrelValue value) throws Exception;

	/**
	 * 
	 * @Function queryCmInsCmrel
	 * @Description 
	 *
	 * @param custId
	 * @param userId
	 * @param relType
	 * @param userType
	 * @param prodCatalogId
	 * @param offerId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-21 上午10:25:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-21     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId, int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryCmInsCmrelCount
	 * @Description 
	 *
	 * @param custId
	 * @param userId
	 * @param relType
	 * @param userType
	 * @param prodCatalogId
	 * @param offerId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-21 上午10:26:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-21     mael           v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmrelCount(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId) throws Exception;
	
	public int queryCmInsCmrelCountWithoutSelf(long custId, long userId,int relType)throws Exception;

	/**
	 * 
	 * @Function saveCmInsCmrelInfo
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-16 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-16     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue queryCmInsByCmrelId(long cmrelId, long custId) throws Exception;

	/**   
	 * @Function queryGroupIndustrys
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-3 下午8:13:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-3     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmGroupRelIndustryValue[] queryGroupIndustrys(long custId, int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryCustRequestTaskCount
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-10 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-10     huangqun           v1.0.0               修改原因<br>
	 */
	public int queryCustRequestTaskCount(String xmlComdition) throws Exception;

	public long saveDefaultCustomer(IVOCustValue custValue) throws Exception;

	/**
	 * 
	 * @Function dealSendToC3
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-20 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-20     huangqun           v1.0.0               修改原因<br>
	 */
	public void dealSendToC3(long custId, long userId, int action) throws Exception;

	/**
	 * 
	 * @Function dealQueryCmInsCmrel
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-20 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-20     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] dealQueryCmInsCmrel(long custId) throws Exception;

	/**
	 * 
	 * @Function dealStopUserFromCPR
	 * @Description 如果该使用者下面没有号码了，则需要送CPR退订
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-25 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-25     huangqun           v1.0.0               修改原因<br>
	 */
	public void dealStopUserFromCPR(long custId, long userId) throws Exception;

	/**
	 * 
	 * @Function dealDeleteUserAndOwner
	 * @Description 只要跟该号码有关的归属者或者使用者都要置为失效
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-25 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-25     huangqun           v1.0.0               修改原因<br>
	 */
	public void dealDeleteUserAndOwner(long custId, long userId) throws Exception;

	/**
	 * 
	 * @Function isSameOrgByCustId
	 * @Description 提供给资源的判断客户是否在同一层级接口
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-11-28 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-28     zhuyy           v1.0.0               修改原因<br>
	 */
	public boolean isSameOrgByCustId(long rootCustId, long subCustId) throws Exception;

	/**
	 * 
	 * @Function dealAssignNum
	 * @Description 处理分配使用者
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author sunyan
	 * @date 2014-12-02 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-02     sunyan         v1.0.0               修改原因<br>
	 */
	public void dealAssignNum(String custId, String[] insValues, String ownerCustId) throws Exception;

	/**
	 * 
	 * @Function dealDeleteUserAndOwner
	 * @Description 只要跟该号码有关的归属者或者使用者都要置为失效
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-25 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-25     huangqun           v1.0.0               修改原因<br>
	 */
	public void orderForUnormalPerson(long userId) throws Exception;

	/**
	 * 
	 * @Function getInteractionId
	 * @Description 获取操作流水号
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-12-15 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-15     zhuyy           v1.0.0               修改原因<br>
	 */
	public String getInteractionId() throws Exception;

	/**
	 * 
	 * @Function dealCreateDefaultUser
	 * @Description 开户创建一个默认的使用者;flag="Y"是开户,flag="N"是过户
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-01-09 下午2:55:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-01-09     huangqun           v1.0.0               修改原因<br>
	 */
	public void dealCreateDefaultUser(long custId, long userId, String flag) throws Exception;

	/**   
	 * @Function saveIndivCustomer
	 * @Description 保存个人潜在客户
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-29 下午8:39:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-29     shitian             v1.0.0               修改原因<br>
	 */
	public void saveIndivCustomer(IVOCustValue custValue) throws Exception;

	/**   
	 * @Function queryCustomersByCols
	 * @Description 根据列字段数组查询客户
	 *
	 * @param numbers
	 * @param colName
	 * @param custType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-16 上午11:05:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-16     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomersByCols(String[] colValues, String colName, int custType, int startNum, int endNum) throws Exception;

	/**
	 * 查询联系人的联系信息
	 * @param contId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfo(long contId, int start, int end) throws Exception;
	
	/**
	 * 根据contId ，useType 查询联系媒介
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2020-6-23
	* ICmCustomerSV
	 */
	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoByContIdAndUseType(long contId, long useType ,int start, int end) throws Exception;
	
	/**
	 * 按Contid查询并按prority 排序
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-10-3
	* CmCustomerSVImpl
	 */
	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoByContId(long contId,long mediumTypeId, int start, int end) throws Exception ;

	/**   
	 * @Function queryCmCustByCustInfoAndAddress
	 * @Description 查询是否有同名同生日，同地址的客户或者使用者，员工
	 *
	 * @param name
	 * @param birth
	 * @param addressId
	 * @param indivCustType 1:客户；2：使用者；3：员工
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-4 上午10:55:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-4     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue[] queryCmCustByCustInfoAndAddress(String name, String birth, long addressId, int indivCustType) throws Exception;

	/**   
	 * @Function queryPartyByCprId
	 * @Description 根据cprId查询party信息
	 *
	 * @param cprId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-17 下午8:39:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-17     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmPartyValue[] queryPartyByCprId(long cprId) throws Exception;

	/**   
	 * @Function queryCustContactMediums
	 * @Description 
	 *
	 * @param custId
	 * @param contMedTypeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-25 上午10:19:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-25     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue[] queryCustContactMediums(long custId, String contMedTypeId) throws Exception;

	/**   
	 * @Function saveDefaultCustomer
	 * @Description 
	 *
	 * @param partyId
	 * @param firstName
	 * @param lastName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-11-5 下午3:47:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-11-5     shitian             v1.0.0               修改原因<br>
	 */
	public long saveDefaultCustomer(long partyId, String firstName, String lastName) throws Exception;

	/**   
	 * @Function queryAcctCategory
	 * @Description 根据客户类型获取账户类型
	 *
	 * @param custType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-25 上午10:19:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-25     shitian             v1.0.0               修改原因<br>
	 */
	public IBOBsStaticDataValue[] queryAcctCategory(long custId) throws Exception;
	/**
	 * 判断客户下面是否有正常的用户
	 * @Function ifHaveActiveUser
	 * @Description 
	 *
	 * @param custId
	 * @param action(1:查询客户下面所有的正常用户（不包含停机）2：1:查询客户下面所有的正常用户（包含停机）)
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-24 上午10:29:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-24     yangjh           v1.0.0               修改原因<br>
	 */
	public boolean ifHaveActiveUser(long custId, int action) throws Exception;
	
	/**   
	 * @Function queryCustOrganizeById
	 * @Description 
	 *
	 * @param deptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:58:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryCustOrganizeByIdDK(long deptId) throws Exception;
	
	/**   
	 * 根据父级组织编号查询该组织结构下的所有组织结构
	 * @Function queryCustOrganizesByParentId
	 * @Description 
	 *
	 * @param parentDeptId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午4:30:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryAllSubCustOrganizesByParentId(long parentDeptId, int startNum, int endNum) throws Exception;
	
	public ICustomerValue queryInheritInfoById(String rootCustId) throws Exception;
	
	/**   
	 * @Function queryAllCustMgrsByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 */
	public ICustManagerValue[] queryAllCustMgrsByCustId(long custId, int startNum, int endNum) throws Exception;
	
	
	/**   
	 * @Function queryCustForManagerAndLog
	 * @Description 客户经理分配页面查询并记录日志
	 *
	 * @param xmlString
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public ICustomerValue[] queryCustForManagerAndLog(String xmlString, String segmentId, int start, int end) throws Exception;
	
	public ICustomerValue queryCustomerMaskByCustIdAndLog(long custId) throws Exception;
	
	public IBOCmxIndivCustomerValue queryCmxIndivCustValueAndLog(long custId) throws Exception;
	
	public ICustomerValue[] queryCustomersAndLog(String xmlComdition, int startNum, int endNum) throws Exception;
	
	public ICustomerValue[] queryCusts4GroupAndLog(String xmlComdition, String custStatus, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function queryCustOrgByDept
	 * @Description 根据部门名称查询客户下的部门
	 *
	 * @param xmlString
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public ICustOrganizeValue[] queryCustOrgByDept(long custId, String deptName, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function queryCustOrgCountByDept
	 * @Description 根据部门名称查询客户下的部门数量
	 *
	 * @param xmlString
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public int queryCustOrgCountByDept(long custId, String deptName) throws Exception;
	
	/**   
	 * @Function saveCprToTtTask
	 * @Description 处理cpr文件时保存需要合并的TT
	 *
	 * @param cprId
	 * @param errorCode
	 * @param errorMsg
	 * @return
	 * @throws Exception
	 */
	public void saveCprToTtTask(long cprId, String errorCode, String errorMsg) throws Exception;
	
	/**   
	 * @Function qryCprToTtTask
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 */
	public IBOCmCprToTTValue[] qryCprToTtTask(long cprId) throws Exception;
 
	/**
	* <p>Title: 查询AKS 客户备案数据记录 </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2017-10-31
	* ICmCustomerSV
	 */
	public IBOCmCustPutOnRecordValue qryCustPutOnRecordByCustId(long custId) throws Exception;
	
	public IBOCmCustContactMediumValue[] queryContactMediumByAddressId(long custId,long addressId, int addressType) throws Exception;
	
	public IBOCmInsCmrelValue[] queryAllValidCmInsCmrelByCustId(long custId) throws Exception;
	
	/**
	 * 查询出指定地址类型的并且排完序的联系媒介地址
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-10-2
	* ICmCustomerSV
	 */
	public IBOCmCustContactMediumValue[] queryContactMediumByAddressType(long custId,long addressId, int addressType) throws Exception;
	
	/**
	 * payer 联系媒介发billing
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-10-3
	* CmCustomerSVImpl
	 */
	public void sendPayerAddressToBilling(long partyId, boolean deleteFlag) throws Exception;
	
	/**
	 * 查询账户是否有active 和dunning的账户
	 * @Title: checkHasActiveOrDunningAccount   
	 * @Description: TODO(描述这个方法的作用)   
	 * @param: @param custId
	 * @param: @return
	 * @param: @throws Exception   
	 * @author: YuJing    
	 * @date:   2020-10-22 11:30:53   
	 * @return: boolean      
	 * @throws
	 */
	public boolean checkHasActiveOrDunningAccount(long custId) throws Exception;
	
	
	/**
	 * 根据custId和批量的UserId获取关系数据
	 * @param custId
	 * @param userIdList
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrelForBatchUserId(long custId, List userIdList) throws Exception;
	
	/**
	 * 查询客户用户关系记录
	 * @param customerId
	 * @param userIdList
	 * @return
	 */
	public DataContainer[] queryCustomerAndSubscriptionRelationship(long customerId,List<String> userIdList) throws Exception;
	
	
	/**
	 * 查询过期的cust_bad_record记录
	 * @param limitNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustBadRecordValue[] queryCustBadInfosByAmountAndDeletionDate(int limitNum) throws Exception;
	
	
	public void deleteBadRecord(IBOCmCustBadRecordValue badRecord) throws Exception;
	
	/**
	 * 根据type=“POA” 和CustId 查询POA 信息
	 * @param custId
	 * @param poaType
	 * @return
	 * @throws Exception
	 */
	public String queryPOAInfoByTypeAndCustId(String custId, String poaType) throws Exception;
	
	/**
	 * 获取PoA的列表
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] queryPOAList(String custId, int startNum, int endNum) throws Exception;
	
	/**
	 * 获取PoA的列表列表
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public int queryPOAListCount(String custId) throws Exception;
	
	public void dealGroupUserToGroupCust(long custId, long userId, long oldCustId, long orderId) throws Exception;
	
	public void dealGroupUserToIndivCust(long custId, long userId, long oldCustId, long orderId) throws Exception;
}