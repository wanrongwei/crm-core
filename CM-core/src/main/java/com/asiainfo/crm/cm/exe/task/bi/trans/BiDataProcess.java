package com.asiainfo.crm.cm.exe.task.bi.trans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskParamValueValue;
import com.asiainfo.appframe.ext.exeframe.task.query.service.interfaces.ITaskSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;


/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: BiDataProcess.java
 * @Description: 从经分系统同步全球通88套餐VIP等级评定数据的处理类
 *
 * @version: v1.0.0
 * @author: xialing
 * @date: Jun 21, 2011 8:33:50 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jun 21, 2011		xialing           v1.0.0               修改原因
 */
public class BiDataProcess
{
	private static final transient Log log = LogFactory.getLog(BiDataProcess.class); 
	private static final BiDataProcess dp = new BiDataProcess();
	
	private BiDataProcess() {
		
	}
	
	public static BiDataProcess getInstance() {
		return dp;
	}
	
	public String mainProcess(long taskId) throws Exception {
		//解析task中参数
		ITaskSV taskSV = (ITaskSV)ServiceFactory.getService(ITaskSV.class);
		IBOCfgTaskParamValueValue[] params = taskSV.getCfgTaskParamValueByTaskId(taskId);
		String[] allParams = params[0].getParamValue().split("\\^");	//参数根据^分隔，没有值的也要提供占位符，格式：srcDbCode^destDbCode^fetchSize^
		int fetchSize = 100;	//默认为100
		if(!StringUtils.isBlank(allParams[2])) {
			fetchSize = Integer.parseInt(allParams[2]);
		}
		
		//生成数据抽取需要的bean
		BiGtoneVipLevelDataBean transBean = new BiGtoneVipLevelDataBean(allParams[0], allParams[1], fetchSize);	//new BiGtoneVipLevelDataBean("zj_bi","party",100);
		
		//2011-7-19,add by xialing,增加对目标表中是否存在未处理数据的校验，如果存在未处理数据，本次执行退出
		String verifySql = new StringBuilder().append("select count(*) from ").append(transBean.realTableName())
			.append(" t where t.ismodify_flag = 0 ").toString();
		Connection destConnection =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			destConnection = transBean.getDestConnection();
			ps = destConnection.prepareStatement(verifySql);
			rs = ps.executeQuery();
			rs.next();
			long count = rs.getLong(1);	//获取查询结果
			if(count > 0) {
				return new StringBuilder().append("this execute return directly,because the destination table [")
					.append(transBean.realTableName()).append("] has datas which ismodify_flag is 0.").toString();
			}
		}finally{
			CmCommonUtil.closeJDBC(destConnection, ps, rs);
		}
		//add end
		
		//开始抽取数据
		return getDataProcess(transBean);
	}
	
	private String getDataProcess(BiGtoneVipLevelDataBean transBean) throws Exception {
		
		Connection srcConnection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			srcConnection = transBean.getSrcConnection();
			ps = srcConnection.prepareStatement(transBean.getSelectSql());
			ps.setFetchSize(transBean.getFetchSize());
			rs = ps.executeQuery();
			//处理游标抽取的数据插入BBOSS侧临时表
			return insertDataProcess(transBean, rs);
		}finally{
			CmCommonUtil.closeJDBC(srcConnection, ps, rs);
		}
	}
	
	private String insertDataProcess(BiGtoneVipLevelDataBean transBean, ResultSet rs) throws Exception {
//		Connection destConnection = transBean.getDestConnection();
//		//首先清空CRM侧表数据
//		PreparedStatement tuncatePs = null;
//		try {
//			tuncatePs = destConnection.prepareStatement(transBean.getTruncateSql());
//			tuncatePs.executeUpdate();
//		}catch (Exception e) {
//			log.error("truncate table error:", e);
//			CmCommonUtil.closeJDBC(destConnection, null, null);	//只有发生异常时才关闭连接
//		}finally {
//			CmCommonUtil.closeJDBC(null, tuncatePs, null);
//		}
//		
//		//批量数据插入临时表
//		int fetchSize = transBean.getFetchSize();
//		int colNum = rs.getMetaData().getColumnCount();	//获取总列数
//		int count = 0;
//		long totalNum = 0;
//		long success = 0;
//		PreparedStatement insertPs = null;
//		try {
//			insertPs = destConnection.prepareStatement(transBean.getInsertSql());
//			while(rs.next()) {
//				totalNum++;	//统计记录总数
//				for(int i=1; i<=colNum; i++) {	//为列设置值
//					insertPs.setObject(i, rs.getObject(i));
//				}
//				insertPs.addBatch();
//				count++;
//				if(count >= fetchSize) {	//大于fetchSize时执行保存操作
//					insertPs.executeBatch();
//					count = 0;	//重置计数为0
//				}
//			}
//			insertPs.executeBatch();	//最后不足fetchSize的条数
//			destConnection.commit();
//			success = totalNum;
//		}catch (Exception e) {
//			log.info(e.getMessage(), e);
//			destConnection.rollback();
//		}finally {
//			CmCommonUtil.closeJDBC(destConnection, insertPs, rs);
//		}
//		//执行临时表和BBOSS表的比对工作
//		return CrmLocaleFactory.getResource("CMS0009075",new String[]{BiGtoneVipLevelDataBean.realTableName()
//				,BiGtoneVipLevelDataBean.realTableName(),String.valueOf(totalNum),String.valueOf(success)
//				,String.valueOf(totalNum - success)});
//	}
		return null;
	}
}
