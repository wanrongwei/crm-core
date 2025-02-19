package com.asiainfo.crm.cm.busimodel.impl.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public abstract class AbstractQueryBusiModelImpl extends AbstractMaskBusiModel implements IQueryDataBusiModel, IQueryCountBusiModel, IQueryDataByIdBusiModel {

	private static transient Log log = LogFactory.getLog(AbstractQueryBusiModelImpl.class);

	/**   
	 * 构造查询条件
	 * 
	 * @Function buildCondition
	 * @Description 
	 *
	 * @param conditionDCs
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-20 下午2:06:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-20     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract Parameter buildParameter(DataContainer[] conditionDCs) throws Exception;

	/**   
	 * 获取返回对象的类型<br>
	 * 如果返回对象需要转换成指定的类型，则需要实现该方法返回对应的类型，否则返回null。
	 * @Function getReturnObjectClass
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-9 下午3:46:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-9     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract Class getReturnObjectClass();

	/**   
	 * 返回单条记录查询的BOBean的类型，用于根据主键查询记录时调用。
	 * 
	 * @Function getSingleQueryObjectClass
	 * @Description 
	 *
	 * @param keyProperties 主键属性
	 * @param businessId
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-18 下午1:06:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-18     huzq           v1.0.0               修改原因<br>
	 */
	protected Class getSingleQueryObjectClass(Map keyProperties, long businessId) {
		return null;
	}

	/**   
	 * 解析查询条件<br>
	 * 默认实现支持XML格式的查询条件。如果需要支持其他格式（e.g. JSON etc.）的查询条件则需要重写这个方法，实现具体的解析逻辑。
	 * @Function parseCondition
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-20 下午1:35:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-20     huzq2           v1.0.0               修改原因<br>
	 */
	protected DataContainer[] parseCriteria(String criteria) throws Exception {
		return ParamUtil.parseXmlCriteria(criteria);
	}

	/**   
	 * @Function queryCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 下午3:12:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	public int queryCount(DataContainer[] criteria) throws Exception {
		Parameter parameter = buildParameter(criteria);
		if (parameter == null) {
			// 系统异常：实现类没有实现构造查询条件的方法。
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010045", ""));
			}
			ExceptionUtil.throwBusinessException("CMS0010045", "");
		}
		if (parameter.getBeanClass() == null) {
			// 没有指定查询的BO。
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		
		//在mysql数据库下查询BO改造
		Class<?> beanClass = parameter.getBeanClass();
		Map<?, ?> paramMap = parameter.getParameter();
		String sql = CmCommonUtil.getDynamicCountSqlByConds(beanClass, parameter.getCondition(),paramMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paramMap);
		return inter[0].getAsInt("CNT");
		//return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}

	/**   
	 * @Function queryCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 下午3:12:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	public int queryCount(String criteria) throws Exception {
		return queryCount(parseCriteria(criteria));
	}

	/**   
	 * @Function queryData
	 * @Description 
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 下午3:12:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryData(DataContainer[] criteria, int startNum, int endNum) throws Exception {
		return queryData(null, criteria, startNum, endNum);
	}

	/**   
	 * @Function queryData
	 * @Description 
	 *
	 * @param cols
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 下午3:12:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryData(String[] cols, DataContainer[] criteria, int startNum, int endNum) throws Exception {
		Parameter parameter = buildParameter(criteria);
		if (parameter == null) {
			// 系统异常：实现类没有实现构造查询条件的方法。
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010045", ""));
			}
			ExceptionUtil.throwBusinessException("CMS0010045", "");
		}
		if (parameter.getBeanClass() == null) {
			// 没有指定查询的BO。
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		// 调用保存业务日志的方法保存
		saveQueryBusiLog(parameter);
		
		//在mysql数据库下查询BO改造
		Class<?> beanClass = parameter.getBeanClass();
		Map<?, ?> paramMap = parameter.getParameter();
		String sql = CmCommonUtil.getDynamicSqlByConds(beanClass, parameter.getCondition(),paramMap,startNum, endNum);
		DataContainerInterface[] qryResults = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(beanClass, sql,paramMap);
		/*// 调用底层查询服务查询数据
		DataContainerInterface[] qryResults = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), cols, parameter.getCondition(), parameter.getParameter(),
				startNum, endNum, false);*/
		// 获取返回对象类型
		Class returnObjectClass = getReturnObjectClass();
		// 如果实现类返回的单个对象查询的BOBean的类型不是DataContainer的子类则报错。
		if (returnObjectClass != null && !ClassUtils.isAssignable(returnObjectClass, DataContainer.class)) {
			// 系统错误：查询BO的类型必须是DataContainerInterface的子类！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000105"));
			}
			ExceptionUtil.throwBusinessException("CMS0000105");
		}
		// 如果查询结果为空则返回空数组
		if (CmCommonUtil.isEmptyObject(qryResults)) {
			// 如果返回对象不需要经过转换，则直接返回查询BO的实例空数组
			if (returnObjectClass == null) {
				return DataContainerFactory.createDataContainerArray(parameter.getBeanClass(), 0);
			}
			return DataContainerFactory.createDataContainerArray(returnObjectClass, 0);
		}
		// 如果返回对象不需要经过转换，则直接mask之后返回
		if (returnObjectClass == null) {
			for (int i = 0; i < qryResults.length; i++) {
				// 模糊化处理
				mask(qryResults[i]);
			}
			return qryResults;
		}
		// 通过平台的DataContainerFactory构造返回结果数组
		DataContainerInterface[] results = DataContainerFactory.createDataContainerArray(returnObjectClass, qryResults.length);
		for (int i = 0; i < results.length; i++) {
			results[i] = DataContainerFactory.createDataContainerInstance(returnObjectClass, null);
			Map sourceProperties = qryResults[i].getProperties();
			Iterator iterator = sourceProperties.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				results[i].initProperty(String.valueOf(entry.getKey()), entry.getValue());
			}
			// 模糊化处理
			mask(results[i]);
		}
		return (DataContainer[]) results;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel#queryData(java.lang.String, int, int)
	 */
	public DataContainerInterface[] queryData(String criteria, int startNum, int endNum) throws Exception {
		return queryData(parseCriteria(criteria), startNum, endNum);
	}

	/**   
	 * 根据构造好的根据主键查询的查询条件查询数据。
	 * 
	 * @Function queryDataById
	 * @Description 
	 *
	 * @param condition 构造好的主键查询查询条件
	 * @return 符合条件的数据
	 * @throws Exception 当查询结果不唯一、数据库异常等情况时抛出业务异常！
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-18 下午1:49:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-18     huzq           v1.0.0               修改原因<br>
	 */
	private DataContainerInterface queryDataById(DataContainerInterface condition, long businessId) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(condition, condition.getClass());
		// 将业务编码塞到parameter中，用于记录业务记录
		parameter.setBusinessId(businessId);
		// 调用保存业务日志的方法保存
		saveQueryBusiLog(parameter);
		// 调用底层查询服务查询数据
		DataContainerInterface[] qryResults = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), -1,
				-1);
		// 如果查询结果为空则返回空数组
		if (CmCommonUtil.isEmptyObject(qryResults)) {
			return null;
		}
		// 如果查询出来的结果不唯一则报错！
		if (qryResults.length != 1) {
			// 根据主键属性{0}查询结果不唯一，请检查查询条件是否正确！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("", condition.getKeyProperties().toString()));
			}
			ExceptionUtil.throwBusinessException("", condition.getKeyProperties().toString());
		}
		// 获取返回对象类型
		Class returnObjectClass = getReturnObjectClass();
		// 如果实现类返回的单个对象查询的BOBean的类型不是DataContainer的子类则报错。
		if (returnObjectClass != null && !ClassUtils.isAssignable(returnObjectClass, DataContainer.class)) {
			// 系统错误：查询BO的类型必须是DataContainerInterface的子类！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000105"));
			}
			ExceptionUtil.throwBusinessException("CMS0000105");
		}
		// 如果返回对象不需要经过转换，则直接mask之后返回
		if (returnObjectClass == null) {
			// 模糊化处理
			mask(qryResults[0]);
			return qryResults[0];
		}
		// 通过平台的DataContainerFactory构造返回结果数组
		DataContainerInterface result = DataContainerFactory.createDataContainerInstance(returnObjectClass, null);
		Map sourceProperties = qryResults[0].getProperties();
		Iterator iterator = sourceProperties.entrySet().iterator();
		// 值拷贝
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			result.initProperty(String.valueOf(entry.getKey()), entry.getValue());
		}
		// 模糊化处理
		mask(result);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel#queryDataById(long, long)
	 */
	public DataContainerInterface queryDataById(long objectId, long businessId) throws Exception {
		Map keyMap = new HashMap();
		keyMap.put("objectId", objectId);
		// 调用实现类的获取单个对象查询的BO类型。
		Class queryObjectClass = getSingleQueryObjectClass(keyMap, businessId);
		// 如果实现类返回的查询BO类型为空则报错！
		if (queryObjectClass == null) {
			// 系统错误：没有找到用于查询的BO类型！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000106"));
			}
			ExceptionUtil.throwBusinessException("CMS0000106");
		}
		// 如果实现类返回的单个对象查询的BOBean的类型不是DataContainer的子类则报错。
		if (!ClassUtils.isAssignable(queryObjectClass, DataContainer.class)) {
			// 系统错误：查询BO的类型必须是DataContainerInterface的子类！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000105"));
			}
			ExceptionUtil.throwBusinessException("CMS0000105");
		}
		// 构造目标查询BO
		DataContainerInterface condition = DataContainerFactory.createDataContainerInstance(queryObjectClass, null);
		String[] keyPropertieNames = condition.getKeyPropertyNames();
		if (CmCommonUtil.isEmptyObject(keyPropertieNames) || keyPropertieNames.length != 1) {
			// 需要查询的目标对象主键属性为多个，但是输入条件中只有一个参数，不能查询！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000104"));
			}
			ExceptionUtil.throwBusinessException("CMS0000104");
		}
		// 对主键属性的Java类型进行校验
		String propType = condition.getPropertyType(keyPropertieNames[0]);
		if (!"long".equalsIgnoreCase(propType)) {
			// 参数类型不匹配！期望类型为：{0}，实际为：{1}。
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000103", "long", propType));
			}
			ExceptionUtil.throwBusinessException("CMS0000103", "long", propType);
		}
		// 将主键值塞到condition中。
		condition.set(keyPropertieNames[0], objectId);
		return queryDataById(condition, businessId);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel#queryDataById(java.util.Map, long)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public DataContainerInterface queryDataById(Map keyProperties, long businessId) throws Exception {
		// 如果没有查询条件则报错。
		if (CmCommonUtil.isEmptyObject(keyProperties)) {
			// 查询条件不能为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030039", ""));
			}
			ExceptionUtil.throwBusinessException("CMS0030039", "");
		}
		// 调用实现类的获取单个对象查询的BO类型。
		Class queryObjectClass = getSingleQueryObjectClass(keyProperties, businessId);
		// 如果实现类返回的查询BO类型为空则报错！
		if (queryObjectClass == null) {
			// 系统错误：没有找到用于查询的BO类型！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000106"));
			}
			ExceptionUtil.throwBusinessException("CMS0000106");
		}
		// 如果实现类返回的单个对象查询的BOBean的类型不是DataContainer的子类则报错。
		if (!ClassUtils.isAssignable(queryObjectClass, DataContainer.class)) {
			// 系统错误：查询BO的类型必须是DataContainerInterface的子类！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000105"));
			}
			ExceptionUtil.throwBusinessException("CMS0000105");
		}
		// 构造目标查询BO
		DataContainerInterface condition = DataContainerFactory.createDataContainerInstance(queryObjectClass, null);
		String[] keyPropertieNames = condition.getKeyPropertyNames();
		Map otherProperties = new HashMap(keyProperties);
		// 检查主键属性是否正确，并将主键属性塞到目标查询BO中。
		for (String colName : keyPropertieNames) {
			// 检查是否所有主键都已经输入！
			if (!keyProperties.containsKey(colName)) {
				// 查询条件不能为空！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030039", colName));
				}
				ExceptionUtil.throwBusinessException("CMS0030039", colName);
			}
			// 将主键属性塞到目标查询BO中。
			condition.set(colName, DataType.transfer(keyProperties.get(colName), condition.getPropertyType(colName)));
			// 将已经处理的属性从otherProperties中移除，保证处理完主键属性后otherProperties中剩下其他的限制条件。
			otherProperties.remove(colName);
		}
		// 是否还有其他限制条件，如果有则一并拼接到查询条件中进行查询
		if (CmCommonUtil.isNotEmptyObject(otherProperties)) {
			Iterator iterator = otherProperties.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				String key = (String) entry.getKey();
				// 如果当前的属性是目标BO中已定义的属性则直接set，否则需要使用initProperty方法初始化。
				if (condition.hasPropertyName(key)) {
					condition.set(key, DataType.transfer(entry.getValue(), condition.getPropertyType(key)));
				} else {
					condition.initProperty(key, entry.getValue());
				}
			}
		}
		return queryDataById(condition, businessId);
	}

	/**   
	 * 保存查询日志<br>
	 * 默认不保存，如果需要保存日志则需要重写该方法
	 * @Function saveQueryBusiLog
	 * @Description 
	 *
	 * @param parameter
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-9 下午4:11:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-9     huzq           v1.0.0               修改原因<br>
	 */
	protected void saveQueryBusiLog(Parameter parameter) throws Exception {

	}
}
