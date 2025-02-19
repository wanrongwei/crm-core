package com.asiainfo.crm.cm.common.util;

import java.io.InputStream;
import java.io.Reader;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.ExceptionUtil;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: CommonTool 
 * @Description: 
 *
 * @version: v1.0.0
 * @author: chenxq
 * @date:  2014-4-22 上午10:48:35
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-4-22     chenxq          v1.0.0             修改原因
 */
public class CommonTool {

	private final static transient Log log = LogFactory.getLog(CommonTool.class);

	/**
	 * 
	 * @Function: queryBeansFromSql
	 * @Description: 根据SQL语句查询结果
	 * 
	 * @param sql
	 * @param map
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: chenxq
	 * @date: 2014-4-22 上午10:48:47
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-4-22     chenxq         v1.0.0                                   修改原因
	 */
	public static DataContainer[] queryBeansFromSql(String sql, Map map, int startIndex, int endIndex) throws Exception, RemoteException {
		StringBuffer sb = new StringBuffer();
		if (map == null || startIndex == -1 || endIndex == -1) {
			sb.append(sql);
		} else {
			sb.append(" SELECT * FROM ( SELECT ROW_.*, ROWNUM ROWNUM_ FROM ( ").append(sql);
			sb.append(" ) ROW_ WHERE ROWNUM <= :endIndex ) WHERE ROWNUM_ >= :startIndex ");
			map.put("startIndex", (long) startIndex);
			map.put("endIndex", (long) endIndex);
		}
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		List fieldName = new ArrayList();
		List fieldType = new ArrayList();
		List ret = new ArrayList();
		DataContainer data = null;
		char[] strClob = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			String sqlTmp = sb.toString() + " "; // 在最后添加空格，避免参数替换时错误
			String[] aUpdateParameters = com.ai.appframe2.util.StringUtils.getParamFromString(sqlTmp, ":", " ");
			sqlTmp = com.ai.appframe2.util.StringUtils.replaceParamString(sqlTmp, aUpdateParameters, "? ", ":", " ");
			stmt = conn.prepareStatement(sqlTmp);
			for (int i = 0; i < aUpdateParameters.length; i++) {
				if (map.get(aUpdateParameters[i]) == null) {
					ExceptionUtil.throwBusinessException("UDB SQL Parameters[:" + aUpdateParameters[i] + "]Please check the corresponding value is NULL....");
				}
				stmt.setObject(i + 1, map.get(aUpdateParameters[i]));
			}
			rs = stmt.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			for (int i = 1; i <= metaData.getColumnCount(); i++) {
				fieldName.add(metaData.getColumnName(i));
				fieldType.add(metaData.getColumnTypeName(i));
			}
			if (!fieldName.isEmpty()) {
				while (rs.next()) {
					data = new DataContainer();
					for (int i = 0; i < fieldName.size(); i++) {
						if (((String) fieldType.get(i)).equalsIgnoreCase("CLOB")) {
							java.sql.Clob clob = rs.getClob((String) fieldName.get(i));
							Reader input = null;
							try {
								if (clob != null) {
									input = clob.getCharacterStream();
									strClob = new char[(int) clob.length()];
									input.read(strClob);
								} else {
									strClob = new char[0];
								}
							} catch (Exception e) {
								log.error(e.getMessage(),e);
							} finally {
								if (input != null) {
									input.close();
								}
							}
							data.set((String) fieldName.get(i), new String(strClob));
						} else if (((String) fieldType.get(i)).equalsIgnoreCase("BLOB")) {
							java.sql.Blob blob = rs.getBlob((String) fieldName.get(i));
							byte[] strBlob = new byte[0];
							InputStream is = null;
							try {
								if (blob != null) {
									is = blob.getBinaryStream();
									strBlob = new byte[(int) blob.length()];
									is.read(strBlob);
								}
							} catch (Exception e) {
								log.error(e.getMessage(),e);
							} finally {
								if (is != null) {
									is.close();
								}
							}
							data.set((String) fieldName.get(i), new String(strBlob));
						} else if (((String) fieldType.get(i)).equalsIgnoreCase("DATE")) {
							String dateStr = rs.getString((String) fieldName.get(i));
							if (dateStr != null && dateStr.length() > 19) {
								dateStr = dateStr.substring(0, 19);// 处理掉2010-04-22 11:21:03.0后面的.0
							}
							data.set((String) fieldName.get(i), dateStr);
						} else {
							data.set((String) fieldName.get(i), rs.getString((String) fieldName.get(i)));
						}
					}
					ret.add(data);
				}
				return (DataContainer[]) ret.toArray(new DataContainer[0]);
			}
			return new DataContainer[0];
		} catch (Exception e) {
			throw e;
		} finally {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

}
