package com.asiainfo.crm.cm.inner.common.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.common.dao.interfaces.ICmCommonInnerDAO;

public class CmCommonInnerDAOImpl implements ICmCommonInnerDAO {

	private transient static Log log = LogFactory.getLog(CmCommonInnerDAOImpl.class);

	public void saveBeans(DataContainerInterface[] beans) throws Exception {
		validate(beans);
		Connection conn = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			ServiceManager.getDataStore().save(conn, beans);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Error On Invoking saveBeans(DataContainerInterface[]).");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (conn != null)
				conn.close();
		}
	}

	public DataContainerInterface[] getBeans(Class beanClass, String condition, Map parameter, int startNum, int endNum) throws Exception {
		if (!DataContainer.class.isAssignableFrom(beanClass) || !beanClass.getName().endsWith("Bean")) {
			// 传入的数据对象错误。
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030015"));
				log.error(beanClass.getName());
			}
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		Connection conn = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			return ServiceManager.getDataStore().retrieve(conn, beanClass, ServiceManager.getObjectTypeFactory().getInstance(getBoNameFromBeanClass(beanClass)), null, condition,
					parameter, startNum, endNum, false, false, null);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Error On Invoking getBeans(Class, String, Map, int, int).");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (conn != null)
				conn.close();
		}
	}

	public void saveBean(DataContainerInterface bean) throws Exception {
		validate(new DataContainerInterface[] { bean });
		Connection conn = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			ServiceManager.getDataStore().save(conn, bean);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Error On Invoking getBeans(Class, String, Map, int, int).");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (conn != null)
				conn.close();
		}
	}

	public int getBeanCount(Class beanClass, String condition, Map parameter) throws Exception {
		if (!DataContainer.class.isAssignableFrom(beanClass) || !beanClass.getName().endsWith("Bean")) {
			// 传入的数据对象错误。
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030015"));
				log.error(beanClass.getName());
			}
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		Connection conn = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			return ServiceManager.getDataStore().retrieveCount(conn, ServiceManager.getObjectTypeFactory().getInstance(getBoNameFromBeanClass(beanClass)), condition, parameter,
					null);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Error On Invoking getBeans(Class, String, Map, int, int).");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (conn != null)
				conn.close();
		}
	}

	public DataContainerInterface getBean(DataContainerInterface bean) throws Exception {
		if (!DataContainer.class.isAssignableFrom(bean.getClass()) || !bean.getClass().getName().endsWith("Bean")) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030015"));
			}
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		// 获取主键属性
		Map keyProperties = bean.getKeyProperties();
		// 判断主键是否有值
		if (!CmCommonUtil.isNotEmptyObject(keyProperties)) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030015"));
			}
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		// 构造查询条件
		Iterator it = keyProperties.entrySet().iterator();
		StringBuilder condition = new StringBuilder(" 1 = 1 ");
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			condition.append(" AND ").append(entry.getKey()).append(" = :").append(entry.getKey());
		}
		// 查询数据
		Connection conn = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			DataContainerInterface[] dcs = ServiceManager.getDataStore().retrieve(conn, bean.getClass(),
					ServiceManager.getObjectTypeFactory().getInstance(getBoNameFromBeanClass(bean.getClass())), null, condition.toString(), keyProperties, -1, -1, false, false,
					null);
			if (CmCommonUtil.isNotEmptyObject(dcs)) {
				return dcs[0];
			}
			return null;
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Error On Invoking getBeans(Class, String, Map, int, int).");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (conn != null)
				conn.close();
		}
	}

	public DataContainerInterface[] getBeansFromQueryBO(Class beanClass, String soureBO, Map parameter) throws Exception {
		Connection conn = null;
		ResultSet resultset = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
			resultset = ServiceManager.getDataStore().retrieve(conn, sql, parameter);
			return ServiceManager.getDataStore().crateDtaContainerFromResultSet(beanClass, ServiceManager.getObjectTypeFactory().getInstance(getBoNameFromBeanClass(beanClass)),
					resultset, null, true);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Error On Invoking getBeans(Class, String, Map, int, int).");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (resultset != null)
				resultset.close();
			if (conn != null)
				conn.close();
		}
	}

	private String getBoNameFromBeanClass(Class beanClass) throws Exception {
		String result = beanClass.getName().substring(0, beanClass.getName().lastIndexOf("Bean"));
		return result;
	}

	private ObjectType getObjectTypeFromClass(Class beanClass) throws Exception {
		if (DataContainer.class.equals(beanClass)) {
			return new ObjectTypeNull();
		}
		return ServiceManager.getObjectTypeFactory().getInstance(getBoNameFromBeanClass(beanClass));
	}

	private void validate(DataContainerInterface[] beans) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(beans)) {
			for (int i = 0; i < beans.length; i++) {
				if (!"table".equalsIgnoreCase(beans[i].getObjectType().getMapingEntyType())) {
					// 输入参数不合法！
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0000073"));
					}
					ExceptionUtil.throwBusinessException("CMS0000073");
				}
			}
		}
	}

	public DataContainerInterface[] getBeans(Class beanClass, String[] cols, String condition, Map parameter, int startNum, int endNum, boolean fkFlag) throws Exception {
		if (!DataContainer.class.isAssignableFrom(beanClass) || !beanClass.getName().endsWith("Bean")) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030015"));
			}
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		Connection conn = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			return ServiceManager.getDataStore().retrieve(conn, beanClass, ServiceManager.getObjectTypeFactory().getInstance(getBoNameFromBeanClass(beanClass)), cols, condition,
					parameter, startNum, endNum, fkFlag, false, null);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Error On Invoking getBeans(Class, String, Map, int, int).");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (conn != null)
				conn.close();
		}
	}

	public DataContainerInterface[] getBeansFromSql(Class beanClass, String sql, Map parameter) throws Exception {
		Connection conn = null;
		ResultSet resultset = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			resultset = ServiceManager.getDataStore().retrieve(conn, sql, parameter);
			return (DataContainerInterface[]) ServiceManager.getDataStore().crateDtaContainerFromResultSet(beanClass, getObjectTypeFromClass(beanClass), resultset, null, true);
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Error On Invoking getBeans(Class, String, Map, int, int).");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (resultset != null)
				resultset.close();
			if (conn != null)
				conn.close();
		}
	}

	public int executeSql(String sql, Map parameter) throws Exception {
		Connection conn = null;
		int result = -1;
		try {
			conn = ServiceManager.getSession().getConnection();
			result = ServiceManager.getDataStore().execute(conn, sql, parameter);
			return result;
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("Invoking executeSql(String, Map) Error.");
				log.error(e.getMessage());
			}
			throw e;
		} finally {
			if (conn != null)
				conn.close();
		}
	}

}
