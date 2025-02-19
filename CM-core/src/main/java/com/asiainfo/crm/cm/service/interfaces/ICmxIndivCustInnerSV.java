package com.asiainfo.crm.cm.service.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerHValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustLanguageValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustRealNameInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustSecondCardInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustHisValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxCustomerRelValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName ICmIndivCustExtSV
 * @Description 上海个人客户扩展信息服务接口
 *
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-3-13 下午03:32:25
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-13     zhangyin           v1.0.0               修改原因<br>
 */
public interface ICmxIndivCustInnerSV {

	/**   
	 * @Function saveIndivCustExt
	 * @Description 保存上海个人客户扩展信息
	 *
	 * @param extValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-13 下午03:34:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     zhangyin           v1.0.0               修改原因<br>
	 */
	public void saveIndivCustExt(IBOCmxIndivCustExtValue extValue) throws Exception;

	/**
	 * 
	 * @Function queryIndivCustomerByCondition
	 * @Description 根据指定条件进行相关客户查询
	 *
	 * @param indivCustId
	 * @param indivCustName
	 * @param certType
	 * @param certCode
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-15 上午10:51:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxCustomerRelValue[] queryIndivCustomerByCondition(long custId, long acctId, int certType, String certCode, int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryIndivCustomerExt
	 * @Description 查询上海个人客户扩展信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-15 下午12:22:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustExtValue queryIndivCustExt(long custId) throws Exception;

	/**
	 * 
	 * @Function queryIndivCustomer
	 * @Description 查询相关客户信息
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-17 下午02:15:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-17    zhangwei21         v1.0.0               修改原因<br>
	 */
	public IQBOCmxCustomerRelValue[] queryIndivCustomer(String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryIndivCustomerCount
	 * @Description   客户数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-17 下午02:17:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-17    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryIndivCustomerCount(String condition, Map parameter) throws Exception;

	/**
	 * 
	 * @Function queryCmIndivCust
	 * @Description 查询个人客户
	 *
	 * @param custIds
	 * @param castStatus 客户状态
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-3-26 下午06:50:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-26     mofangrui          v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue[] queryCmIndivCust(long[] custIds, int castStatus) throws Exception;

	/**   保存个人客户历史记录
	 * @Function saveIndivCustHis
	 * @Description 
	 *
	 * @param indivCustHisValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-10 下午12:59:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10     zhangyin          v1.0.0               修改原因<br>
	 */
	public void saveIndivCustHis(IBOCmxIndivCustHisValue indivCustHisValue) throws Exception;

	/**    根据操作员编号查询个人客户历史信息
	 * @Function queryIndivCustHis
	 * @Description 
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
	 * @author zhangyin
	 * @date 2012-4-10 下午7:28:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerHValue[] queryIndivCustHis(long opId, long custId, String custName, String doneDate, String startDate, String endDate, int startNum, int endNum)
			throws Exception;

	/**   根据操作员编号查询个人客户历史信息数量
	 * @Function queryIndivCustHisCount
	 * @Description 
	 *
	 * @param opId
	 * @param custId
	 * @param custName
	 * @param doneDate
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
	public int queryIndivCustHisCount(long opId, long custId, String custName, String doneDate, String startDate, String endDate) throws Exception;

	/**   
	 * @Function queryIndivCustHis
	 * @Description 查询个人客户历史
	 *
	 * @param opId
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
	 * @date Sep 6, 2012 2:37:09 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerHValue[] queryIndivCustHis(long opId, long custId, String custName, String startDate, String endDate, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryIndivCustHisCount
	 * @Description 查询个人客户历史数量
	 *
	 * @param opId
	 * @param custId
	 * @param custName
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 6, 2012 2:37:22 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryIndivCustHisCount(long opId, long custId, String custName, String startDate, String endDate) throws Exception;

	/**   通过各种查询条件获取个人客户历史信息（通用）
	 * @Function getQueryIndivCustHis
	 * @Description 
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
	 * @author zhangyin
	 * @date 2012-4-12 下午7:10:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-12     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerHValue[] getQueryIndivCustHis(String condition, Map paraMap, String[] billingCycles, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function saveCustRealNameInfo
	 * @Description 保存普通实名制信息
	 *
	 * @param extValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-1 上午10:58:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-1      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveCustRealNameInfo(IBOCmxCustRealNameInfoValue cmxCustRealNameInfoValue) throws Exception;

	/**
	 * 
	 * @Function queryCustLanguage
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-16 下午8:43:38
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
	 * @date 2012-5-17 下午4:57:13
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
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-22 下午8:23:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxCustRealNameInfoValue[] queryCustRealNameInfo(long custId) throws Exception;

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
	 * @date 2012-6-13 上午10:38:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-13      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxCustSecondCardInfoValue queryCustSecondCardInfo(long custId) throws Exception;

	/**
	 * 
	 * @Function saveCustSecondCardInfo
	 * @Description 保存第二证件信息
	 *
	 * @param custSecondCardInfoValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-13 上午11:31:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-13      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveCustSecondCardInfo(IBOCmxCustSecondCardInfoValue extValue) throws Exception;
}
