package com.asiainfo.crm.common.bo;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.ai.common.bo.BOBsStaticDataBean;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BOBsStaticDataEngine {
	public BOBsStaticDataEngine() {
	}

	public static com.ai.common.bo.BOBsStaticDataBean[] getBeans(DataContainerInterface dc) throws Exception {
		Map ps = dc.getProperties();
		StringBuffer buffer = new StringBuffer();
		Map pList = new HashMap();
		Iterator cc = ps.entrySet().iterator();

		while(cc.hasNext()) {
			Map.Entry e = (Map.Entry)cc.next();
			if (buffer.length() > 0) {
				buffer.append(" and ");
			}

			buffer.append(e.getKey().toString() + " = :p_" + e.getKey().toString());
			pList.put("p_" + e.getKey().toString(), e.getValue());
		}

		Connection conn = ServiceManager.getSession().getConnection();

		com.ai.common.bo.BOBsStaticDataBean[] var9;
		try {
			var9 = getBeans(buffer.toString(), pList);
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

		return var9;
	}

	public static com.ai.common.bo.BOBsStaticDataBean getBean(String _CodeValue, String _CodeType) throws Exception {
		String condition = "CODE_VALUE = :S_CODE_VALUE and CODE_TYPE = :S_CODE_TYPE";
		Map map = new HashMap();
		map.put("S_CODE_VALUE", _CodeValue);
		map.put("S_CODE_TYPE", _CodeType);
		com.ai.common.bo.BOBsStaticDataBean[] beans = getBeans(condition, map);
		if (beans != null && beans.length == 1) {
			return beans[0];
		} else if (beans != null && beans.length > 1) {
			throw new Exception("[ERROR]More datas than one queryed by PK");
		} else {
			com.ai.common.bo.BOBsStaticDataBean bean = new com.ai.common.bo.BOBsStaticDataBean();
			bean.setCodeValue(_CodeValue);
			bean.setCodeType(_CodeType);
			return bean;
		}
	}

	public static com.ai.common.bo.BOBsStaticDataBean[] getBeans(Criteria sql) throws Exception {
		return getBeans(sql, -1, -1, false);
	}

	public static com.ai.common.bo.BOBsStaticDataBean[] getBeans(Criteria sql, int startNum, int endNum, boolean isShowFK) throws Exception {
		String[] cols = null;
		String condition = "";
		Map param = null;
		if (sql != null) {
			cols = (String[])((String[])sql.getSelectColumns().toArray(new String[0]));
			condition = sql.toString();
			param = sql.getParameters();
		}

		return (com.ai.common.bo.BOBsStaticDataBean[])getBeans(cols, condition, param, startNum, endNum, isShowFK);
	}

	public static com.ai.common.bo.BOBsStaticDataBean[] getBeans(String condition, Map parameter) throws Exception {
		return getBeans((String[])null, condition, parameter, -1, -1, false);
	}

	public static com.ai.common.bo.BOBsStaticDataBean[] getBeans(String[] cols, String condition, Map parameter, int startNum, int endNum, boolean isShowFK) throws Exception {
		Connection conn = null;

		com.ai.common.bo.BOBsStaticDataBean[] var7;
		try {
			conn = ServiceManager.getSession().getConnection();
			var7 = (com.ai.common.bo.BOBsStaticDataBean[])((com.ai.common.bo.BOBsStaticDataBean[])ServiceManager.getDataStore().retrieve(conn, com.ai.common.bo.BOBsStaticDataBean.class, com.ai.common.bo.BOBsStaticDataBean.getObjectTypeStatic(), cols, condition, parameter, startNum, endNum, isShowFK, false, (String[])null));
		} catch (Exception var11) {
			throw var11;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

		return var7;
	}

	public static com.ai.common.bo.BOBsStaticDataBean[] getBeans(String[] cols, String condition, Map parameter, int startNum, int endNum, boolean isShowFK, String[] extendBOAttrs) throws Exception {
		Connection conn = null;

		com.ai.common.bo.BOBsStaticDataBean[] var8;
		try {
			conn = ServiceManager.getSession().getConnection();
			var8 = (com.ai.common.bo.BOBsStaticDataBean[])((com.ai.common.bo.BOBsStaticDataBean[])ServiceManager.getDataStore().retrieve(conn, com.ai.common.bo.BOBsStaticDataBean.class, com.ai.common.bo.BOBsStaticDataBean.getObjectTypeStatic(), cols, condition, parameter, startNum, endNum, isShowFK, false, extendBOAttrs));
		} catch (Exception var12) {
			throw var12;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

		return var8;
	}

	public static int getBeansCount(String condition, Map parameter) throws Exception {
		Connection conn = null;

		int var3;
		try {
			conn = ServiceManager.getSession().getConnection();
			var3 = ServiceManager.getDataStore().retrieveCount(conn, com.ai.common.bo.BOBsStaticDataBean.getObjectTypeStatic(), condition, parameter, (String[])null);
		} catch (Exception var7) {
			throw var7;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

		return var3;
	}

	public static int getBeansCount(String condition, Map parameter, String[] extendBOAttrs) throws Exception {
		Connection conn = null;

		int var4;
		try {
			conn = ServiceManager.getSession().getConnection();
			var4 = ServiceManager.getDataStore().retrieveCount(conn, com.ai.common.bo.BOBsStaticDataBean.getObjectTypeStatic(), condition, parameter, extendBOAttrs);
		} catch (Exception var8) {
			throw var8;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

		return var4;
	}

	public static void save(com.ai.common.bo.BOBsStaticDataBean aBean) throws Exception {
		Connection conn = null;

		try {
			conn = ServiceManager.getSession().getConnection();
			ServiceManager.getDataStore().save(conn, aBean);
		} catch (Exception var6) {
			throw var6;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

	}

	public static void save(com.ai.common.bo.BOBsStaticDataBean[] aBeans) throws Exception {
		Connection conn = null;

		try {
			conn = ServiceManager.getSession().getConnection();
			ServiceManager.getDataStore().save(conn, aBeans);
		} catch (Exception var6) {
			throw var6;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

	}

	public static void saveBatch(com.ai.common.bo.BOBsStaticDataBean[] aBeans) throws Exception {
		Connection conn = null;

		try {
			conn = ServiceManager.getSession().getConnection();
			ServiceManager.getDataStore().saveBatch(conn, aBeans);
		} catch (Exception var6) {
			throw var6;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

	}

	public static com.ai.common.bo.BOBsStaticDataBean[] getBeansFromQueryBO(String soureBO, Map parameter) throws Exception {
		Connection conn = null;
		ResultSet resultset = null;

		com.ai.common.bo.BOBsStaticDataBean[] var5;
		try {
			conn = ServiceManager.getSession().getConnection();
			String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
			resultset = ServiceManager.getDataStore().retrieve(conn, sql, parameter);
			var5 = (com.ai.common.bo.BOBsStaticDataBean[])((com.ai.common.bo.BOBsStaticDataBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(com.ai.common.bo.BOBsStaticDataBean.class, com.ai.common.bo.BOBsStaticDataBean.getObjectTypeStatic(), resultset, (String[])null, true));
		} catch (Exception var9) {
			throw var9;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

		return var5;
	}

	public static com.ai.common.bo.BOBsStaticDataBean[] getBeansFromSql(String sql, Map parameter) throws Exception {
		Connection conn = null;
		ResultSet resultset = null;

		com.ai.common.bo.BOBsStaticDataBean[] var4;
		try {
			conn = ServiceManager.getSession().getConnection();
			resultset = ServiceManager.getDataStore().retrieve(conn, sql, parameter);
			var4 = (com.ai.common.bo.BOBsStaticDataBean[])((com.ai.common.bo.BOBsStaticDataBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(com.ai.common.bo.BOBsStaticDataBean.class, com.ai.common.bo.BOBsStaticDataBean.getObjectTypeStatic(), resultset, (String[])null, true));
		} catch (Exception var8) {
			throw var8;
		} finally {
			if (conn != null) {
				conn.close();
			}

		}

		return var4;
	}

	public static BigDecimal getNewId() throws Exception {
		return ServiceManager.getIdGenerator().getNewId(com.ai.common.bo.BOBsStaticDataBean.getObjectTypeStatic());
	}

	public static Timestamp getSysDate() throws Exception {
		return ServiceManager.getIdGenerator().getSysDate(com.ai.common.bo.BOBsStaticDataBean.getObjectTypeStatic());
	}

	public static com.ai.common.bo.BOBsStaticDataBean wrap(DataContainerInterface source, Map colMatch, boolean canModify) {
		try {
			return (com.ai.common.bo.BOBsStaticDataBean)DataContainerFactory.wrap(source, com.ai.common.bo.BOBsStaticDataBean.class, colMatch, canModify);
		} catch (Exception var4) {
			if (var4.getCause() != null) {
				throw new RuntimeException(var4.getCause());
			} else {
				throw new RuntimeException(var4);
			}
		}
	}

	public static com.ai.common.bo.BOBsStaticDataBean copy(DataContainerInterface source, Map colMatch, boolean canModify) {
		try {
			com.ai.common.bo.BOBsStaticDataBean result = new com.ai.common.bo.BOBsStaticDataBean();
			DataContainerFactory.copy(source, result, colMatch);
			return result;
		} catch (AIException var4) {
			if (var4.getCause() != null) {
				throw new RuntimeException(var4.getCause());
			} else {
				throw new RuntimeException(var4);
			}
		}
	}

	public static com.ai.common.bo.BOBsStaticDataBean transfer(IBOBsStaticDataValue value) {
		if (value == null) {
			return null;
		} else {
			try {
				if (value instanceof com.ai.common.bo.BOBsStaticDataBean) {
					return (com.ai.common.bo.BOBsStaticDataBean)value;
				} else {
					com.ai.common.bo.BOBsStaticDataBean newBean = new com.ai.common.bo.BOBsStaticDataBean();
					DataContainerFactory.transfer(value, newBean);
					return newBean;
				}
			} catch (Exception var2) {
				if (var2.getCause() != null) {
					throw new RuntimeException(var2.getCause());
				} else {
					throw new RuntimeException(var2);
				}
			}
		}
	}

	public static com.ai.common.bo.BOBsStaticDataBean[] transfer(IBOBsStaticDataValue[] value) {
		if (value != null && value.length != 0) {
			try {
				if (value instanceof com.ai.common.bo.BOBsStaticDataBean[]) {
					return (com.ai.common.bo.BOBsStaticDataBean[])((com.ai.common.bo.BOBsStaticDataBean[])value);
				} else {
					com.ai.common.bo.BOBsStaticDataBean[] newBeans = new com.ai.common.bo.BOBsStaticDataBean[value.length];

					for(int i = 0; i < newBeans.length; ++i) {
						newBeans[i] = new BOBsStaticDataBean();
						DataContainerFactory.transfer(value[i], newBeans[i]);
					}

					return newBeans;
				}
			} catch (Exception var3) {
				if (var3.getCause() != null) {
					throw new RuntimeException(var3.getCause());
				} else {
					throw new RuntimeException(var3);
				}
			}
		} else {
			return null;
		}
	}

	public static void save(IBOBsStaticDataValue aValue) throws Exception {
		save(transfer(aValue));
	}

	public static void save(IBOBsStaticDataValue[] aValues) throws Exception {
		save(transfer(aValues));
	}

	public static void saveBatch(IBOBsStaticDataValue[] aValues) throws Exception {
		saveBatch(transfer(aValues));
	}
}
