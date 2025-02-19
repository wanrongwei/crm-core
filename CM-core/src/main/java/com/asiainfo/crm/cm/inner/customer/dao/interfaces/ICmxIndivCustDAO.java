package com.asiainfo.crm.cm.inner.customer.dao.interfaces;

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
 * @ClassName ICmxIndivCustExtDAO
 * @Description 上海个人客户扩展信息数据接口
 *
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-3-14 上午09:55:45
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-14     zhangyin           v1.0.0               修改原因<br>
 */
public interface ICmxIndivCustDAO {

	/**   
	 * @Function saveIndivCustExt
	 * @Description 保存上海个人客户扩展信息
	 *
	 * @param cmxIndivCustExtValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-14 上午10:00:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     zhangyin           v1.0.0               修改原因<br>
	 */
	public void saveIndivCustExt(IBOCmxIndivCustExtValue cmxIndivCustExtValue) throws Exception;

	/**
	 * 
	 * @Function queryIndivCustExt
	 * @Description 查询上海个人客户扩展信息
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
	 * @date 2012-3-15 下午12:38:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustExtValue[] queryIndivCustExt(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryIndivCustomer
	 * @Description 相关客户查询
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
	 * @date 2012-3-15 上午11:16:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15    zhangwei21         v1.0.0               修改原因<br>
	 */

	public IQBOCmxCustomerRelValue[] queryIndivCustomer(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**
	 * 客户数量
	 * @Function queryIndivCustomerCount
	 * @Description 
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-17 下午02:33:55
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
	 * @Description 
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-3-26 下午06:56:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-26     mofangrui          v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerValue[] queryCmIndivCust(String condition, Map parameter) throws Exception;

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

	/**   根据自定义语句查询个人客户历史信息
	 * @Function queryIndivCustHis
	 * @Description 
	 *
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0 
	 * @author zhangyin
	 * @date 2012-4-10 下午7:24:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-10     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOCmIndivCustomerHValue[] queryIndivCustHis(String sql, Map parameter) throws Exception;

	/**
	 * 
	 * @Function saveCustRealNameInfo
	 * @Description  保存客户高级实名制信息 
	 *
	 * @param cmxCustRealNameInfoValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-1 上午10:58:12
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
	 * @Description 查询客户默认语言
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-16 下午8:51:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-16      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxCustLanguageValue[] queryCustLanguage(String condition, Map parameter) throws Exception;

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
	 * @date 2012-5-17 下午5:04:16
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
	 * @Description  查询实名制情况信息
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-22 下午8:28:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxCustRealNameInfoValue[] queryCustRealNameInfo(String condition, Map parameter) throws Exception;

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
	 * @date 2012-6-13 上午10:40:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-13      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxCustSecondCardInfoValue[] queryCustSecondCardInfo(String condition, Map parameter) throws Exception;

	/**
	 * 
	 * @Function saveCustSecondCardInfo
	 * @Description 保存客户第二证件信息
	 *
	 * @param custSecondCardInfoValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-13 上午11:34:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-13      huaiduo           v1.0.0               修改原因<br>
	 */
	public void saveCustSecondCardInfo(IBOCmxCustSecondCardInfoValue custSecondCardInfoValue) throws Exception;
}
