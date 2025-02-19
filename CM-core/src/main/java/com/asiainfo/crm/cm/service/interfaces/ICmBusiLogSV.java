package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCprRecStatisticValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecordBean;
import com.asiainfo.crm.cm.inner.log.ivalues.IBOCmBusiLogValue;
import com.asiainfo.crm.cm.inner.log.ivalues.IBOCmHisRecordValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;

/**
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 客户管理日志业务记录接口
 * @Description ICmBusiLogSV
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Feb 21, 2012 3:28:24 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Feb 21, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public interface ICmBusiLogSV {

	/**
	 * 
	 * @Function queryBusiLog
	 * @Description 查询业务日志
	 *
	 * @param businessId
	 * @param operType
	 * @param custId
	 * @param acctId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 21, 2012 3:30:30 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 21, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IBOCmBusiLogValue[] queryBusiLog(long businessId, long custId, long acctId, String startDate, String endDate, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryBusiLogCount
	 * @Description 查询业务日志数量
	 *
	 * @param businessId
	 * @param operType
	 * @param custId
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 21, 2012 3:30:39 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 21, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryBusiLogCount(long businessId, long custId, long acctId, String startDate, String endDate) throws Exception;

	/**   
	 * 根据业务编码、批次号和手机号码判断是否已经存在同一批次的业务记录
	 * 
	 * @Function hasSameBatchData
	 * @Description 
	 *
	 * @param businessId 业务编码【必须】
	 * @param batchDataId 批量业务批次号【必须】
	 * @param billId 手机号码【必须】
	 * @return 如果存在则返回true，否则返回false。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 上午12:00:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	public boolean hasSameBatchData(long businessId, long batchDataId, String billId) throws Exception;

	/**   
	 * 保存业务日志
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param busiLogValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-12 下午7:56:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12     huzq           v1.0.0               修改原因<br>
	 */
	public void saveBusiLog(ICmBusiLogValue busiLogValue) throws Exception;

	/**   
	 * 保存业务日志
	 * @Function saveBusiLogs
	 * @Description 
	 *
	 * @param busiLogValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-24 下午10:09:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-24     huzq           v1.0.0               修改原因<br>
	 */
	public void saveBusiLogs(ICmBusiLogValue[] busiLogValues) throws Exception;

	/**   
	 * 保存业务日志
	 * 
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param logValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午9:03:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	public void saveBusiLog(IVOBusiLogValue logValue) throws Exception;

	/**   
	 * @Function saveHisRecord
	 * @Description 
	 *
	 * @param hisRecordValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-26 上午10:11:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-26     shitian           v1.0.0               修改原因<br>
	 */
	public void saveHisRecord(IBOCmHisRecordValue hisRecordValue) throws Exception;

	/**   
	 * @Function queryHisRecordByCdn
	 * @Description 
	 *
	 * @param id
	 * @param name
	 * @param type	1：个人客户  2：集团客户  3：账户
	 * @param startDate
	 * @param endDate
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-26 上午11:30:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-26     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmHisRecordValue[] queryHisRecordByCdn(long id, String name, int type, String startDate, String endDate, int start, int end) throws Exception;

	/**   
	 * @Function queryHisRecordCountByCdn
	 * @Description 
	 *
	 * @param id
	 * @param name
	 * @param type
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-26 上午11:32:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-26     shitian           v1.0.0               修改原因<br>
	 */
	public int queryHisRecordCountByCdn(long id, String name, int type, String startDate, String endDate) throws Exception;

	/**   
	 * @Function convertHisRecord
	 * @Description 
	 *
	 * @param targetValues
	 * @param type	1：个人客户  2：集团客户  3：账户
	 * @param objName
	 * @param objId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-26 下午3:11:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-26     shitian           v1.0.0               修改原因<br>
	 */
	public BOCmHisRecordBean convertHisRecord(DataStructInterface[] targetValues, int type, String objName, long objId) throws Exception;
	
	/**   
	 * @Function queryHisRecordByCdn
	 * @Description 
	 *
	 * @param create_date
	 * @param file_name
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author sunyan
	 * @date 2015-01-07 上午11:30:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-07     sunyan           v1.0.0               修改原因<br>
	 */
	public IBOCmCprRecStatisticValue[] queryCPR(String create_date,String file_name) throws Exception;
	/**
	 * 保存客户经理变更日志
	 * @Function saveCustMgrChangeHistory
	 * @Description 
	 *
	 * @param bean
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-12-24 下午5:09:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-24     yangjh           v1.0.0               修改原因<br>
	 */
	public void saveCustMgrChangeHistory(BOCmGroupManagerBean bean)throws Exception;
	
	
}
