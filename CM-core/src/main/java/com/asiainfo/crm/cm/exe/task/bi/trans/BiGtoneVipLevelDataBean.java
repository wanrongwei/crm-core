package com.asiainfo.crm.cm.exe.task.bi.trans;

import java.io.Serializable;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.TimeUtil;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: BiGtoneVipLevelDataBean.java
 * @Description: 用于从经分系统同步全球通88套餐VIP等级评定数据的所有配置数据的Bean对象类
 *
 * @version: v1.0.0
 * @author: xialing
 * @date: Jun 21, 2011 7:50:20 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jun 21, 2011		xialing           v1.0.0               修改原因
 */
public class BiGtoneVipLevelDataBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public BiGtoneVipLevelDataBean(String srcDbCode, String destDbCode, int fetchSize) {
		this.srcDbCode = srcDbCode;
		this.destDbCode = destDbCode;
		this.fetchSize = fetchSize;
	}
	
	public int getFetchSize() {
		return fetchSize;
	}
	
	public Connection getSrcConnection() throws Exception {
		Connection srcConnection = ServiceManager.getSession().getNewConnection(srcDbCode);
		return srcConnection;
	}
	
	public Connection getDestConnection() throws Exception {
		Connection destConnection = ServiceManager.getSession().getNewConnection(destDbCode);
		return destConnection;
	}
	
	public String getSelectSql() throws Exception {
		return exeSqlMap.get(GET_DATA_SQL).toString();
	}
	
	public String getInsertSql() throws Exception {
		return exeSqlMap.get(INSERT_DATA_SQL).toString();
	}
	
	public String getTruncateSql() throws Exception {
		return new StringBuilder().append("TRUNCATE TABLE ").append(realTableName()).toString();
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
	private static final String INSERT_DATA_SQL = "INSERT_DATA_SQL";	//插入数据的SQL
	private static final String BI_TABLE_NAME = "JK_VIP_PD_CRM";	//经分侧全球通88套餐VIP等级评定数据表
	
	static {
		exeSqlMap = new HashMap();
		//数据抽取SQL
		exeSqlMap.put(GET_DATA_SQL, new StringBuilder().append("SELECT T.BILL_ID,T.USER_ID,T.CUST_ID,T.PLAN_NAME,")
			.append("T.VIP_NAME,T.REGION_CODE,T.COUNTY_CODE,T.VIP_LEVEL_PD,T.VIP_LEVEL_PLAN,T.OPERATION,T.VIP_LEVEL_NEW ")
			.append("FROM ").append(realTableName()).append(" T ").toString());
		//数据插入SQL
		exeSqlMap.put(INSERT_DATA_SQL, new StringBuilder().append("INSERT INTO ").append(realTableName())
			.append(" (BILL_ID,USER_ID,CUST_ID,PLAN_NAME,VIP_NAME,REGION_CODE,COUNTY_CODE,VIP_LEVEL_PD,VIP_LEVEL_PLAN,")
			.append("OPERATION,VIP_LEVEL_NEW,VIP_CARD_NO,ISMODIFY_FLAG,REMARKS) VALUES (?,?,?,?,?,?,?,?,?,?,?,null,0,null)").toString());
	}
	
	private String srcDbCode;
	private String destDbCode;
	private int fetchSize;
}
