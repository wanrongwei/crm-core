package com.asiainfo.crm.cm.exe.task.bi.business;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.TimeUtil;

public class GtoneVipPdProcessBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public GtoneVipPdProcessBean(String dbCode, int fetchSize) {
		if(StringUtils.isBlank(dbCode)) {
			this.dbCode = "party";	//默认在party库
		}else {
			this.dbCode = dbCode;
		}
		this.fetchSize = fetchSize;
	}
	
	public int getFetchSize() {
		return fetchSize;
	}
	
	public Connection getConnection() throws Exception {
		Connection connection = ServiceManager.getSession().getNewConnection(dbCode);
		return connection;
	}
	
	public String getSelectSql() throws Exception {
		return exeSqlMap.get(GET_DATA_SQL).toString();
	}
	
	public String getUpdateSql() throws Exception {
		return exeSqlMap.get(UPDATE_DATA_SQL).toString();
	}
	
	public void transResultSetToBean(GtoneVipPdTableBean tableBean, ResultSet rs) throws Exception {
		tableBean.setBillId(rs.getString(1));
		tableBean.setUserId(rs.getLong(2));
		tableBean.setCustId(rs.getLong(3));
		tableBean.setPlanName(rs.getString(4));
		tableBean.setVipName(rs.getString(5));
		tableBean.setRegionCode(rs.getString(6));
		tableBean.setCountyCode(rs.getString(7));
		tableBean.setVipLevelPd(rs.getLong(8));
		tableBean.setVipLevelPlan(rs.getLong(9));
		tableBean.setOperation(rs.getInt(10));
		tableBean.setVipLevelNew(rs.getLong(11));
		tableBean.setVipCardNo(rs.getString(12));
		tableBean.setIsModifyFlag(rs.getInt(13));
		tableBean.setRemarks(rs.getString(14));
		tableBean.setRowid(rs.getString(15));
	}
	
	public static String realTableName() {
		String realTableName = null;
		try {
			realTableName = new StringBuilder().append(BI_TABLE_NAME).append("_").
				append(TimeUtil.getYYYYMM(TimeUtil.addOrMinusMonth(System.currentTimeMillis(), -1))).toString();
		}catch (Exception e) {
			
		}
		return realTableName;
	}
	
	private static Map exeSqlMap;
	
	private static final String GET_DATA_SQL = "GET_DATA_SQL";	//抽取数据的SQL
	private static final String UPDATE_DATA_SQL = "UPDATE_DATA_SQL";	//插入数据的SQL
	private static final String BI_TABLE_NAME = "JK_VIP_PD_CRM";	//全球通88套餐VIP等级评定数据表
	
	static {
		exeSqlMap = new HashMap();
		//数据抽取SQL
		exeSqlMap.put(GET_DATA_SQL, new StringBuilder().append("SELECT T.BILL_ID,T.USER_ID,T.CUST_ID,T.PLAN_NAME,")
			.append("T.VIP_NAME,T.REGION_CODE,T.COUNTY_CODE,T.VIP_LEVEL_PD,T.VIP_LEVEL_PLAN,T.OPERATION,T.VIP_LEVEL_NEW,")
			.append("T.VIP_CARD_NO,T.ISMODIFY_FLAG,T.REMARKS,ROWID FROM ").append(realTableName()).append(" T WHERE T.ISMODIFY_FLAG = 0 ").toString());
		//数据更新SQL
		exeSqlMap.put(UPDATE_DATA_SQL, new StringBuilder().append("UPDATE ").append(realTableName())
			.append(" T SET T.VIP_CARD_NO = ?,T.ISMODIFY_FLAG = ?,T.REMARKS = ? WHERE ROWID = ?").toString());
	}
	
	private String dbCode;
	private int fetchSize;
}
