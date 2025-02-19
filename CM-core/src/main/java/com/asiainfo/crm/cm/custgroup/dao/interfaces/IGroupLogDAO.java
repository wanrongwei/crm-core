package com.asiainfo.crm.cm.custgroup.dao.interfaces;

import java.sql.Timestamp;
import java.util.Map;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupLogValue;

public interface IGroupLogDAO {
	public IBOCmGroupLogValue[] queryGroupLogByCondition(long logId,long groupId,String logCreator,int start, int end) throws Exception;
	
	public IBOCmGroupLogValue[] queryGroupLogBySql(String sql,Map parameter) throws Exception;
	
	/**
	 * 根据custId,eventCreateDate 查询eventCreateDate 到 now()之间的数据
	* <p>Title: </p>
	* 	* isAll :如果传1：代表安装eventCreateDate 时间查询，如果传 2 代表查当月全表
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-12-20
	* IGroupLogDAO
	 */
	public IBOCmGroupLogValue[] queryGroupLogByCustIDAndEventTime(Long custId,Timestamp eventCreateDate,int isAll) throws Exception;
	
	public void addGroupLog(IBOCmGroupLogValue groupLogValue) throws Exception;
}
