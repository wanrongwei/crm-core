package com.asiainfo.crm.cm.custgroup.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.omframe.util.TimeUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.custgroup.bo.BOCmGroupLogBean;
import com.asiainfo.crm.cm.custgroup.bo.BOCmGroupLogEngine;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.IGroupLogDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupLogValue;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;

public class GroupLogDAOImpl implements IGroupLogDAO {

	public IBOCmGroupLogValue[] queryGroupLogByCondition(long logId,long groupId, String logCreator,int start, int end) throws Exception{
		StringBuilder condition = new StringBuilder(" 1 = 1 ");
		HashMap paraMap = new HashMap();
		if(logId > 0){
			condition.append(" AND ").append(IBOCmGroupLogValue.S_LogId).append(" = :").append(IBOCmGroupLogValue.S_LogId);
			paraMap.put(IBOCmGroupLogValue.S_LogId, logId);
		}
		if(groupId>0){
			condition.append(" AND ").append(IBOCmGroupLogValue.S_GroupId).append(" = :").append(IBOCmGroupLogValue.S_GroupId);
			paraMap.put(IBOCmGroupLogValue.S_GroupId, groupId);
		}
		if(StringUtils.isNotBlank(logCreator)){
			condition.append(" AND ").append(IBOCmGroupLogValue.S_LogCreator).append(" = :").append(IBOCmGroupLogValue.S_LogCreator);
			paraMap.put(IBOCmGroupLogValue.S_LogCreator, logCreator);
		}
		return BOCmGroupLogEngine.getBeans(null, condition.toString(), paraMap, start, end, false);
	}

	public IBOCmGroupLogValue[] queryGroupLogBySql(String sql, Map parameter) throws Exception{
		List<IBOCmGroupLogValue> result = new ArrayList<IBOCmGroupLogValue>();
    	Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			ps = conn.prepareStatement(sql.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				IBOCmGroupLogValue groupLogValue = new BOCmGroupLogBean();
				groupLogValue.setLogId(rs.getLong("LOG_ID"));
				groupLogValue.setGroupId(rs.getLong("GROUP_ID"));
				groupLogValue.setLogCreator(rs.getLong("LOG_CREATOR"));
				groupLogValue.setCreateOpId(rs.getLong("CREATE_OP_ID"));
				groupLogValue.setCreateOrgId(rs.getLong("CREATE_ORG_ID"));
				groupLogValue.setOperatorObjectId(rs.getLong("OPERATOR_OBJECT_ID"));
				groupLogValue.setCreateDate(rs.getTimestamp("CREATE_DATE"));
				groupLogValue.setEventCreateDate(rs.getTimestamp("EVENT_CREATE_DATE"));
				groupLogValue.setLogType(rs.getLong("LOG_TYPE"));
				groupLogValue.setLogEventType(rs.getString("LOG_EVENT_TYPE"));
				groupLogValue.setLogLevel(rs.getLong("LOG_LEVEL"));
				groupLogValue.setLogInfo1(rs.getString("LOG_INFO1"));
				groupLogValue.setLogInfo2(rs.getString("LOG_INFO2"));
				result.add(groupLogValue);
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}finally {
			CmCommonUtil.closeJDBC(conn, ps, null);
		}
		return result.toArray(new IBOCmGroupLogValue[0]);
	}
	/**
	 * 根据custId,eventCreateDate 查询eventCreateDate 到 now()之间的数据
	* <p>Title: </p>
	* <p>Description: </p>
	* isAll :如果传1：代表安装eventCreateDate 时间查询，如果传 2 代表查当月全表
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-12-20
	* IGroupLogDAO
	 */
	public IBOCmGroupLogValue[] queryGroupLogByCustIDAndEventTime(Long custId,Timestamp eventCreateDate,int isAll) throws Exception{
		
		List rtn = new ArrayList();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			
			Timestamp createDate = TimeUtil.getDefaultSysDate();
			DataContainer dc = new DataContainer();
			dc.set( "TENANT_ID",ServiceManager.getUser().getTenantId()); 
			dc.set("CREATE_DATE", eventCreateDate);
			String tableName = SplitTableFactory.createTableName(BOCmGroupLogBean.getObjectTypeStatic().getMapingEnty(), dc);
			StringBuilder condition = new StringBuilder();
			condition.append(" SELECT * FROM ").append(tableName);
			condition.append("   where  ");
			condition.append(IBOCmGroupLogValue.S_LogCreator).append(" = ?");
			condition.append(" AND ").append(IBOCmGroupLogValue.S_LogEventType).append(" = ? ");
			if(isAll==1){
				condition.append(" AND ").append(IBOCmGroupLogValue.S_EventCreateDate).append(" >= ? ");
			}
			condition.append(" order by ").append(IBOCmGroupLogValue.S_EventCreateDate).append(" , ").append(IBOCmGroupLogValue.S_LogInfoIndex).append(" ASC ");
			ps = conn.prepareStatement(condition.toString());
			ps.setObject(1,  custId );
			ps.setObject(2,  CmGroupConstants.GroupLogSrcEventType.showPreference );
			if(isAll==1){
				ps.setObject(3,  eventCreateDate );
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				IBOCmGroupLogValue cmGroupLogBean = new BOCmGroupLogBean();
				cmGroupLogBean.setLogId(rs.getLong("LOG_ID"));
				cmGroupLogBean.setGroupId(rs.getLong("GROUP_ID"));
				cmGroupLogBean.setLogCreator(rs.getLong("LOG_CREATOR"));
				cmGroupLogBean.setCreateOpId(rs.getLong("CREATE_OP_ID"));
				cmGroupLogBean.setCreateOrgId(rs.getLong("CREATE_ORG_ID"));
				cmGroupLogBean.setOperatorObjectId(rs.getLong("OPERATOR_OBJECT_ID"));
				cmGroupLogBean.setCreateDate(rs.getTimestamp("CREATE_DATE"));
				cmGroupLogBean.setEventCreateDate(rs.getTimestamp("EVENT_CREATE_DATE"));
				cmGroupLogBean.setLogType(rs.getLong("LOG_TYPE"));
				cmGroupLogBean.setLogEventType(rs.getString("LOG_EVENT_TYPE"));
				cmGroupLogBean.setLogLevel(rs.getLong("LOG_LEVEL"));
				cmGroupLogBean.setLogInfo1(rs.getString("LOG_INFO1"));
				cmGroupLogBean.setLogInfo2(rs.getString("LOG_INFO2"));
				cmGroupLogBean.setLogInfo3(rs.getString("LOG_INFO3"));
				cmGroupLogBean.setLogInfo4(rs.getString("LOG_INFO4"));
				cmGroupLogBean.setLogInfo5(rs.getString("LOG_INFO5"));
				cmGroupLogBean.setLogInfo6(rs.getString("LOG_INFO6"));
				cmGroupLogBean.setBatchDealId(rs.getString("BATCH_DEAL_ID"));
				cmGroupLogBean.setLogInfoIndex(rs.getLong("LOG_INFO_INDEX"));
				
				rtn.add(cmGroupLogBean);
			}
		} finally {
			CmCommonUtil.closeJDBC(conn, ps, rs);
		}
		
		return (IBOCmGroupLogValue[])rtn.toArray(new IBOCmGroupLogValue[0]);
	}

	public void addGroupLog(IBOCmGroupLogValue groupLogValue) throws Exception{
		BOCmGroupLogEngine.save(groupLogValue);
	}
}
