package com.asiainfo.crm.cm.custgroup.service.interfaces;

import java.sql.Timestamp;
import java.util.Map;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupLogValue;

/**
 * 
 * 群组日志的  行为库
 *
 */
public interface ICustGroupLogSV {
	
	/**
	 * 
	 * @author huanglun
	 * @date 2018年10月30日 上午11:08:56
	 * @param customerGroupId 群id
	 * @param logCreator 客户id
	 * @param logType 日志类型：1=客户群操作,2=邀请类,3=定单类操作,4=系统自动事件,5=其它
	 * @param logEventType 日志事件类型:party.`cm_general_config`
	 * @param sortType 排序类型:-1=不排序,0=升序,1=降序
	 * @param startDate 非必填
	 * @param endDate 非必填
	 * @param startNum 从0开始
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupLogValue[] getGroupLogs(long customerGroupId,long logCreator,int logType,String logEventType,
			int sortType,String startDate,String endDate,int startNum,int endNum) throws Exception;
	
	/**
	 * 客户优惠变更日志
	 * @param custId
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupLogValue[] getGroupLogsByCustomerId(long custId,String startDate,String endDate) throws Exception;
	/**
	 * 新增群日志
	 * @author huanglun
	 * @date 2018年9月19日 下午3:06:37
	 * @param paraMap
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupLogValue addGroupLog(Map<String,Object> paraMap) ;

	public String transferCustId2CustName(Long custId);
	
	/**
	 * 查询指定时间开始到当前时间的最老折扣
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-12-20
	* ICustGroupLogSV
	 */
	public String getOldDiscountByCustIDAndTime(Long custId,Timestamp eventTime)  throws Exception ;
}
