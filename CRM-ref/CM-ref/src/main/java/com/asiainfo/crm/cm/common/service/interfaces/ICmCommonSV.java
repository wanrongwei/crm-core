package com.asiainfo.crm.cm.common.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.oneframe.msg.ivalues.IBORemindValue;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.cm.common.bo.BOCmMultThreadDealBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsTaskDealBean;
import com.asiainfo.crm.cm.common.ivalues.*;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmIndustryConfigValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmCustPutOnRecordValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsOptinSyncC3Value;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContMedTypeValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmClubServiceSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * @Package: com.asiainfo.crm.customer.common.service.interfaces
 * @Classname: ICmCommonSV.java
 * Description: 客户管理公共服务类
 * Copyright: Copyright (c) 2010
 * Company: AsiaInfo-linkage
 * @author: xialing
 * @version: v1.0.0
 * Create at: Dec 15, 2010 9:24:38 AM
 * <p/>
 * Modification History:
 * Date               Author            Version            Description
 * -------------------------------------------------------------------
 * Dec 15, 2010     xialing             v1.0.0               修改原因
 */
public interface ICmCommonSV {

	public IBOCmCfgBusiModelValue[] getAllBusiModels() throws Exception;

	/**   
	 * @Function getNewSequence
	 * @Description 通过传入的 bobean 类型对象 获取对应的sequence[不能传入查询BO]
	 *
	 * @param claz
	 * @return 指定Sequence的值
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-13 下午2:15:44<br>
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-13     huzq2           v1.0.0               修改原因
	 */
	public long getNewSequence(Class claz) throws Exception;

	/**   
	 * 获取所有的特殊名单类型配置信息
	 * @Function getAllCfgSpecListTypes
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午9:59:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgSpecListTypeValue[] getAllCfgSpecListTypes() throws Exception;

	/**   
	 * 根据特殊名单类型查询其互斥的特殊名单类型
	 * @Function getIncompatibleSpecListTypes
	 * @Description 
	 *
	 * @param typeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午10:12:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgSpecListTypeValue[] getIncompatibleSpecListTypes(int typeId) throws Exception;

	/**   
	 * 获取系统时间
	 * @Function getSysDate
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-17 下午11:21:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-17     huzq2           v1.0.0               修改原因<br>
	 */
	public Timestamp getSysDate() throws Exception;

	/**   
	 * 获取所有的扩展属性表属性定义信息
	 * @Function getAllCfgTableAttrs
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 上午11:21:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgTableAttrValue[] getAllCfgTableAttrs() throws Exception;

	/**   
	 * @Function getAllCfgObjectWrappers
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-11 下午8:43:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-11     huzq           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgObjectWrapperValue[] getAllCfgObjectWrappers() throws Exception;

	/**   
	 * 获取流水号<br>
	 * 该服务主要用于Web端需要使用到流水号的情况下调用。如获取随机地市，则需要获取一个流水号，然后用流水号取模取地市。
	 * 
	 * @Function getDoneCode
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-21 上午11:43:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-21     huzq2           v1.0.0               修改原因<br>
	 */
	public long getDoneCode() throws Exception;

	/**   
	 * @Function getAllCreditMapping
	 * @Description 获取所有的信用等级映射信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 4, 2012 11:20:09 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 4, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmCreditMappingValue[] getAllCreditMapping() throws Exception;

	/**   
	 * @Function sendSms
	 * @Description 发送短信
	 *
	 * @param billId
	 * @param smsContent
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 6, 2012 10:42:08 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void sendSms(String billId, String smsContent) throws Exception;

	/**   
	 * @Function getAllKernelClass
	 * @Description 查询所有VIP等级规则记录
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 17, 2012 4:47:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmKernelClassCfgValue[] getAllKernelClass() throws Exception;

	/**   
	 * @Function getAllIndustry
	 * @Description 查询所有集团行业类型
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-09-03 14:47:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-09-03     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBOCmIndustryConfigValue[] getAllIndustry() throws Exception;

	/**   
	 * @Function getIndustryByparentId
	 * @Description 根据父类型查询集团行业类型
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-09-03 14:47:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-09-03     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBOCmIndustryConfigValue[] getIndustryByparentId(long parentId) throws Exception;

	/**   
	 * @Function getVipLevle
	 * @Description 根据手机号码生成VIP等级
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 18, 2012 7:04:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 18, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int getVipLevle4Calc(String billId, IQUserBaseInfoValue userBaseInfo, ICmClubServiceSV clubSv) throws Exception;

	/**   
	 * @Function getVipLevle
	 * @Description 根据手机号码生成VIP等级
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 18, 2012 7:04:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 18, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int getVipLevle(String billId, IQUserBaseInfoValue userBaseInfo) throws Exception;

	/**   
	 * @Function getAllKernelClass
	 * @Description VIP积分扣减规则表  CM_VIP_SCORE_RULE
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 17, 2012 4:47:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmVipScoreRuleValue[] getCmVipScoreRuleClass() throws Exception;

	/**   
	 * @Function hasSecForQry
	 * @Description 校验当前的操作员是否有地市权限
	 * true/是	false/没有
	 *
	 * @param userId
	 * @param billId
	 * @param custId
	 * @param regionId	客户或者用户归属地市
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
	 * @Function queryFieldDefine
	 * @Description 查询某个区域下定义的字段（调用bce接口）
	 *
	 * @param busiId
	 * @param userParam
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2013 10:33:11 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryFieldDefine(long busiId, String userParam) throws Exception;

	/**   
	 * @Function queryOperField
	 * @Description 查询操作员自定义TAB页（字段配置时）
	 *
	 * @param operId
	 * @param tabId
	 * @param busiId busiId	bce中businessId
	 * @param userParam	bce中自定义参数
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2013 10:37:19 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryOperField(long operId, long tabId, long busiId, String userParam) throws Exception;

	public long getAcctId(BOCmAccountBean accountBean) throws Exception;

	public long getCustId(int custType) throws Exception;

	/**
	 * 创建立即执行的任务
	 * @Function createImmediateTask
	 * @Description 
	 *
	 * @param taskName
	 * @param cfgTaskTypeCode
	 * @param businessClass
	 * @param param
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date Jul 1, 2014 12:24:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 1, 2014     yangjh           v1.0.0               修改原因<br>
	 */
	public long createImmediateTask(String taskName, String cfgTaskTypeCode, String businessClass, Map param) throws Exception;

	/**
	 * 查询客户不良记录
	 * @Function queryCustBadInformation
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 8.26, 2014 12:24:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 8.26, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmCustBadRecordValue[] queryCustBadInformation(long custId, int startIndex, int endIndex) throws Exception;

	/**
	 * 查询客户不良记录数量用于分页
	 * @Function queryCustBadInformationCount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 9.26, 2014 12:24:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 9.26, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public int queryCustBadInformationCount(long custId) throws Exception;

	/**
	 * 查询删除的客户不良记录信息
	 * @Function queryDeleteCustBadInformation
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 9.26, 2014 12:24:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 9.26, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmCustBadRecordValue[] queryDeleteCustBadInformation(long custId) throws Exception;

	/**
	 * 查询删除的客户不良记录信息
	 * @Function queryDeleteCustBadInformation
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 9.26, 2014 12:24:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 9.26, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmCustBadRecordValue[] queryCustBadInfo(long custId, int startIndex, int endIndex) throws Exception;

	/**
	 * 保存C3工单信息
	 * @Function savePsOptinC3Info
	 * @Description 
	 *
	 * @param IBOCmPsOptinSyncC3Value value
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 11.20, 2014 12:24:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 *11.20, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void savePsOptinC3Info(IBOCmPsOptinSyncC3Value[] values) throws Exception;

	/**
	 * 根据cont_med_type_id查询其国际化
	 * @Function queryContMedTypeInfo
	 * @Description 
	 *
	 * @param cont_med_type_id
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 12.03, 2014 12:24:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 *12.03, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContMedTypeValue[] queryContMedTypeInfo(long contMedTypeId) throws Exception;

	/**
	 * 
	 * @Function getCommonNewSequence
	 * @Description 
	 *
	 * @param claz
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-5 下午5:04:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-5     yangjh           v1.0.0               修改原因<br>
	 */
	public long getCommonNewSequence(Class claz) throws Exception;

	/**
	 * 
	 * @Function getCommonNewSequence
	 * @Description 
	 *
	 * @param claz
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-10 下午5:04:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-10     yangjh           v1.0.0               修改原因<br>
	 */
	public long getCommonNewSequence(String tableName) throws Exception;

	/**
	 * 客户管理创建TT工单
	 * @Function CreateTicketForCM
	 * @Description 
	 *
	 * @param map
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-21 上午10:32:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-21     yangjh           v1.0.0               修改原因<br>
	 */
	public String CreateTicketForCM(Map map) throws Exception;

	/**
	 * 查询故障单信息
	 * @Function queryTicketListForCm
	 * @Description 
	 *
	 * @param custId
	 * @param SrcType (CPR:个人,KOB:集团)
	 * @param strDate
	 * @param endDate
	 * @param strIdx
	 * @param endIdx
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-21 下午4:55:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-21     yangjh           v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryTicketListForCm(long custId, String SrcType, String errorCode, String strDate, String endDate, int strIdx, int endIdx) throws Exception;

	/**
	 * 查询故障单信息数量
	 * @Function queryTicketListCountForCm
	 * @Description 
	 *
	 * @param custId
	 * @param SrcType
	 * @param strDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-21 下午4:56:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-21     yangjh           v1.0.0               修改原因<br>
	 */
	public int queryTicketListCountForCm(long custId, String SrcType, String errorCode, String strDate, String endDate) throws Exception;

	/**   
	 * @Function getCfgWsClientByCode
	 * @Description 获取ws_client
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-23 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-23     shitian             v1.0.0               修改原因<br>
	 */
	public CfgWsClient getCfgWsClientByCode(String code) throws Exception;

	/**   
	 * @Function saveCmCprRecStatistic
	 * @Description 保存CPR统计信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-05 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-05     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveCmCprRecStatistic(IBOCmCprRecStatisticValue value) throws Exception;

	/**   
	 * @Function unsubscribePhoneBook
	 * @Description 保存CPR统计信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-07 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-07     huangqun             v1.0.0               修改原因<br>
	 */
	public void unsubscribePhoneBook(long custId) throws Exception;

	/**   
	 * @Function savePsPublicInfo
	 * @Description 保存public工单信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-07 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-07     huangqun             v1.0.0               修改原因<br>
	 */
	public void savePsPublicInfo(ICustomerValue custValue, int action, long userId) throws Exception;
	/**   
	 * @Function savePsPublic
	 * @Description 保存public工单信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-07 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-07     huangqun             v1.0.0               修改原因<br>
	 */
	public void savePsPublic(long entityId, int action, String psParam) throws Exception;

	/**   
	 * @Function saveCmLifeCycle
	 * @Description 保存生命周期信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-07 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-14     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveCmLifeCycle(long userId, long custId, long oldCustId, int action) throws Exception;

	/**   
	 * @Function ifCanTerminateCust
	 * @Description 判断是否可以注销客户
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-07 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-14     huangqun             v1.0.0               修改原因<br>
	 */
	public void ifCanTerminateCust(long custId,long partyId) throws Exception;

	/**   
	 * @Function saveCprIdInParty
	 * @Description 保存cprId
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-07 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-02-02     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveCprIdInParty(long custId) throws Exception;

	/**   
	 * @Function saveCommonBusiLog
	 * @Description 
	 *
	 * @param businessId[必填]业务操作ID，需要配置在base.bs_operation
	 * @param dsis[必填]操作的业务对象
	 * @param busiType[必填]业务操作类型。见定义{@link CmConstants.BusiLogType}.
	 * @param objectId[必填]客户相关就传客户id，联系人就传联系人id
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-2-5 下午3:27:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-2-5     shitian             v1.0.0               修改原因<br>
	 */
	public void saveCommonBusiLog(long businessId, DataStructInterface[] dsis, int busiType, long objectId) throws Exception;

	/**   
	 * @Function saveCommonQryBusiLog
	 * @Description 
	 *
	 * @param businessId[必填]业务操作ID，需要配置在base.bs_operation
	 * @param sql[必填]查询sql
	 * @param paraMap[必填]查询条件
	 * @param busiType[必填]业务操作类型。见定义{@link CmConstants.BusiLogType}.
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-2-5 下午4:36:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-2-5     shitian             v1.0.0               修改原因<br>
	 */
	public void saveCommonQryBusiLog(long businessId, String sql, Map paraMap, int busiType) throws Exception;
	/**   
	 * @Function validateCommercialPro
	 * @Description 根据custId判断当前的营销标识是多少
	 *
	 * @param custId
	 * @return 返回（0:是,1:否,-1:空值）
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-03-17 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-03-17     huangqun             v1.0.0               修改原因<br>
	 */
	public int validateCommercialPro(long custId)throws Exception;

	 /**   
	 * @Function saveCommonQryBusiLog
	 * @Description 
	 *
	 * @param businessId[必填]业务操作ID，需要配置在base.bs_operation
	 * @param sql[必填]查询sql
	 * @param paraMap[必填]查询条件
	 * @param busiType[必填]业务操作类型。见定义{@link CmConstants.BusiLogType}.
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-2-5 下午4:36:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-2-5     shitian             v1.0.0               修改原因<br>
	 */
	public void saveCommonQryBusiLogWithCustId(long businessId, String sql, Map paraMap, int busiType,long custId) throws Exception;
	/**   
	 * @Function getCustType
	 * @Description 根据custId判断当前的客户类型
	 *
	 * @param custId
	 * @return 返回1是个人客户,3是集团客户
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-03-17 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-03-17     huangqun             v1.0.0               修改原因<br>
	 */
	public int getCustType(long custId)throws Exception;
	/**   
	 * @Function queryMediumByContact
	 * @Description 根据email或者联系电话查询记录
	 *
	 * @param email,phone
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-03-23 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-03-23     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue[] queryMediumByContact(String email,String phoneNum)throws Exception;
	/**   
	 * @Function savePsPublicForBill
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-05-19 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-05-19     huangqun             v1.0.0               修改原因<br>
	 */
	public void savePsPublicForBill(IBOCmPsPublicDealValue[] values)throws Exception;
	/**   
	 * @Function 调pushC接口推送消息
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-07-14 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-07-14     huangqun             v1.0.0               修改原因<br>
	 */
	public void cmPushMessage(IBORemindValue[] values)throws Exception;
	/**   
	 * @Function 调pushC接口推送消息
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-07-14 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-07-14     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean ifCanTerminatedCustomer(long custId,long partyId)throws Exception;
	/**   
	 * @Function queryHierarchyStatus
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-07-22 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-07-22     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean queryHierarchyStatus(long custId,int custStatus)throws Exception;
	/**   
	 * @Function saveCmPsTaskDeal
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-09-09 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-09-09     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveCmPsTaskDeal(BOCmPsTaskDealBean[] values)throws Exception;
	/**   
	 * @Function queryIfOnlyCanViewCustomer
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-09-28 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-09-28     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean queryIfOnlyCanViewCustomer(long custId)throws Exception;
	/**   
	 * @Function getDefaultUser
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-09-28 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-09-28     huangqun             v1.0.0               修改原因<br>
	 */
	public UserInfoInterface getDefaultUser() throws Exception;
	/**   
	 * @Function 获取工单历史表的sequence
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-26 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-26     huangqun             v1.0.0               修改原因<br>
	 */
	public long getHisTableSequence(String type)throws Exception;
	/**   
	 * @Function saveMultThreadDeal
	 * @Description 保存工单信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-27 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-27     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveMultThreadDeal(BOCmMultThreadDealBean[] beans)throws Exception;
	/**   
	 * @Function queryMultThreadDeal
	 * @Description 查询工单信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-28 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-28     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmMultThreadDealValue[] queryMultThreadDeal(String taskId,String batchId,long taskSeq,int taskStatus)throws Exception;
	/**   
	 * @Function queryCmCustRequestTaskCount
	 * @Description 查询工单信息数量
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-11-20 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-11-20     huangqun             v1.0.0               修改原因<br>
	 */
	public int queryCmCustRequestTaskCount(String requestStatus)throws Exception;
	/**   
	 * @Function queryCmCustRequestTask
	 * @Description 查询工单信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-11-20 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-11-20     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmCustRequestTaskValue[] queryCmCustRequestTask(String requestStatus,int start,int end)throws Exception;
	/**   
	 * @Function saveCmPsHierarchyDeal
	 * @Description 保存工单信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-01-07 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-01-07     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveCmPsHierarchyDeal(IBOCmPsHierarchyDealValue[] beans)throws Exception;
	/**   
	 * @Function queryCmPsHierarchyDeal
	 * @Description 查询工单信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-01-07 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-01-07     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmPsHierarchyDealValue[] queryCmPsHierarchyDeal(int mod,int value,int strIdx,int endIdx)throws Exception;
	/**   
	 * @Function queryCmPsHierarchyDealCount
	 * @Description 查询数量
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-01-07 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-01-07     huangqun             v1.0.0               修改原因<br>
	 */
	public int queryCmPsHierarchyDealCount(int mod,int value)throws Exception;
	/**   
	 * @Function queryCmCustOutMapping
	 * @Description 查询aks映射表
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-01-20 午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-01-20     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmCustOutMappingValue[] queryCmCustOutMapping(long relId,long custId,String outRelaId)throws Exception;
	
	/**
	 * 报错task和多线程控制信息
	 * @Function saveTaskAndMultThreadDeal
	 * @Description 
	 *
	 * @param taskParamMap
	 * @param calBatchId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-4 上午8:58:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-4     yangjh           v1.0.0               修改原因<br>
	 */
	public void saveTaskAndMultThreadDeal(Map taskParamMap,String calBatchId,String taskName,String taskTypeCode,String taskBusinessClass)throws Exception;
	/**
	 * 公用查询
	 * @Function queryCommonInfo
	 * @Description 
	 *
	 * @param taskParamMap
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2016-3-21 上午8:58:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-21     huangqun           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryCommonInfo(Class pojo,Map parameter)throws Exception;
	/**
	 * 根据条件查询客户
	 * @Function queryCustomerByCond
	 * @Description 
	 *
	 * @param taskParamMap
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2016-3-22 上午8:58:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-22     huangqun           v1.0.0               修改原因<br>
	 */
	public long queryCustomerByCond(String addressId,String email,String phone,String custName)throws Exception;
	
	
	/**   
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param businessId	CmConstants.BusiLogId（业务编码）
	 * @param busiType		CmConstants.BusiLogType	（业务类型）
	 * @param objectId		操作对象主键，如果是客户就是custId，账户就是acctId
	 * @param operType		CmConstants.BusiLogOperType（操作类型）
	 * @param sql			操作类型为query的时候，对应的查询sql可以为空
	 * @param paraMap		查询时候，对应的查询入参
	 * @param methodDetail	包路径+方法名
	 * @throws Exception
	 */
	public void saveBusiLog(long businessId, int busiType, long objectId, int operType, String sql, Map paraMap, String methodDetail) throws Exception;
	 
	public DataContainerInterface[] fuzzyQueryCustomerAndContactMedium(List<Long> custIds,int startNum,int endNum) throws Exception;
	public int fuzzyQueryCustomerAndContactMediumCount(List<Long> custIds) throws Exception;
	public DataContainerInterface[] fuzzyQueryCustomerByCustIdAndName(String queryParam) throws Exception;

	/**
	 * 查询puton record 记录
	 * @param custId
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustPutOnRecordValue[] queryCustPutOnInfo(long custId, int startIndex, int endIndex) throws Exception;

}