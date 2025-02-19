/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.customer;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IMaskBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

/**   
 * 该业务模型实现客户信息的综合查询功能。在这一层统一屏蔽了具体类型客户的概念，对外而言，所有类型的客户都是客户，不需要对不同类型的客户区别对待，使用统一的
 * 业务实体对象，实现model与数据模型的分离，尽可能降低因底层数据模型发生变化而引起外部接口调用的影响。
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName AbstractCustomerQueryBusiModelImpl
 * @Description 
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午3:07:37
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public abstract class AbstractCustomerQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel, IMaskBusiModel {

	private static transient Log log = LogFactory.getLog(AbstractCustomerQueryBusiModelImpl.class);

	/**   
	 * @Function afterQueryCustomerByCustId
	 * @Description 该方法提供给根据客户编号查询客户信息后的处理。如查询本地化的信息等。
	 *
	 * @param result
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-26 上午11:20:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-26     huzq2           v1.0.0               修改原因
	 */
	protected abstract void afterQueryCustomerByCustId(ICustomerValue result) throws Exception;

	/**   
	 * 构造批量查询客户的查询条件
	 * @Function buildCustomerBatchQueryParam
	 * @Description 
	 *
	 * @param custIds
	 * @param colName
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-29 下午3:55:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-29     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract Parameter buildCustomerBatchQueryParam(long[] custIds, String colName, int custType) throws Exception;
	
	/**   
	 * 构造批量查询客户的查询条件
	 * @Function buildCustomerBatchQueryParam
	 * @Description 
	 *
	 * @param custIds
	 * @param colName
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-29 下午3:55:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-29     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract Parameter buildCustomerBatchQueryParam(String[] custIds, String colName, int custType) throws Exception;

	/**   
	 * 构造查询客户经理管理的客户的查询条件
	 * @Function buildManagedCustomerParameter
	 * @Description 
	 *
	 * @param managerId
	 * @param custType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @param otherConditionDC 
	 * @date 2012-4-25 下午10:41:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract Parameter buildManagedCustomerParameter(long managerId, int custType, DataContainer otherConditionDC) throws Exception;

	/**   
	 * @Function buildParameter
	 * @Description 
	 *
	 * @param custId
	 * @param custType
	 * @param state
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-6-1 上午12:54:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-1     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract Parameter buildParameter(long custId, int custType, String state) throws Exception;

	/**   
	 * @Function getCustIdFromBillId
	 * @Description 根据计费号码查询客户编号。该方法需要根据具体地方的实现。
	 *
	 * @param billId 计费号码
	 * @return 客户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-29 下午3:07:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-29     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract long getCustIdFromBillId(String billId) throws Exception;

	/**   
	 * 准备查询条件。<br>
	 * 在该方法中对查询条件进行一些必要的处理和验证，然后在调用具体的客户查询实现方法查询客户信息。<br>
	 * 比如：根据客户编号来判断客户类型，根据手机号码获取客户编号等。<br>
	 * 该方法需要被具体的实现类来实现，在该类中不提供默认实现。
	 * @Function prepareCondition
	 * @Description 准备查询条件。
	 *
	 * @param conditionDCs 查询条件构成的DC数组。 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午2:24:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void prepareCondition(DataContainer[] conditionDCs) throws Exception;

	/**   
	 * @Function queryCount
	 * @Description 查询客户数量
	 *
	 * @param conditionDCs
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-21 下午5:27:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-21     huzq2           v1.0.0               修改原因
	 */
	public final int queryCount(DataContainer[] conditionDCs) throws Exception {
		// 准备查询条件
		prepareCondition(conditionDCs);
		// 查询客户数量
		return queryCustomerCount(conditionDCs);
	}

	/**   
	 * @Function queryCustomerByCustId
	 * @Description 根据客户编号查询客户
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-26 上午11:15:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-26     huzq2           v1.0.0               修改原因
	 */
	public final ICustomerValue queryCustomerByCustId(long custId, String state) throws Exception {
		// 先根据客户编号和客户类型查询客户信息
		ICustomerValue result = queryCustomerByIdAndType(custId, CmCommonUtil.getCustType(custId), state);
		// 查询完成之后的封装
		afterQueryCustomerByCustId(result);
		return result;
	}

	public ICustomerValue queryCustomerByIdAndTypeList(long custId, int custType, String state) throws Exception {
		return queryCustomerByIdAndType(custId, custType, state);
	}

	/**   
	 * 根据客户编号和客户类型查询客户信息
	 * @Function queryCustomerByIdAndType
	 * @Description 
	 *
	 * @param custId
	 * @param custType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午2:54:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected ICustomerValue queryCustomerByIdAndType(long custId, int custType, String state) throws Exception {
		Parameter parameter = buildParameter(custId, custType, state);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		if (parameter.getBeanClass() == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		// 记录业务日志
		parameter.setBusinessId(CmConstants.BusiLogId.CUST_QRY);
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);

		// mysql下的查询bo改造
		Class<?> beanClass = parameter.getBeanClass();
		Map<?, ?> paramMap = parameter.getParameter();
		String sql = CmCommonUtil.getDynamicSqlByConds(beanClass, parameter.getCondition(), paramMap, -1, -1);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(beanClass, sql, paramMap);
		// DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
		// parameter.getCondition(), parameter.getParameter(), -1, -1);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			CustomerBean result = new CustomerBean();
			result.copy(dcs[0]);
			// 初始化客户类型
			result.initProperty(ICustomerValue.S_CustType, custType);
			//将证件号码存到hobby里面
			if(StringUtils.isNotBlank(result.getCustCertCode())){
				result.initProperty("HOBBY", result.getCustCertCode());
			}
			// 将其他的属性一并塞到客户对象
			Map sourceProperties = dcs[0].getProperties();
			Iterator iterator = sourceProperties.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				if (!result.hasPropertyName(DataType.getAsString(entry.getKey()))) {
					result.initProperty(DataType.getAsString(entry.getKey()), entry.getValue());
				}
			}
			// 调用模糊化处理方法对敏感信息进行模糊化处理
			mask(result);
			return result;
		} else {
			ExceptionUtil.throwBusinessException("CMS90000097",String.valueOf(custId));
		}
		return null;
	}

	/**   
	 *  批量查询客户信息数量
	 * @Function queryCustomerCountByCustIds
	 * @Description 
	 *
	 * @param custIds
	 * @param custType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午11:14:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public final int queryCustomerCountByCustIds(long[] custIds, int custType) throws Exception {
		Parameter parameter = buildCustomerBatchQueryParam(custIds, ICustomerValue.S_CustId, custType);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		if (parameter.getBeanClass() == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		int count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
		return count;
	}

	/**   
	 * 批量查询客户信息
	 * @Function queryCustomersByCustIds
	 * @Description 
	 *
	 * @param custIds
	 * @param custType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午11:14:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public final ICustomerValue[] queryCustomersByCustIds(long[] custIds, int custType, int startNum, int endNum) throws Exception {
		if (custIds == null || custIds.length <= 0) {
			return new CustomerBean[0];
		}
		Parameter parameter = buildCustomerBatchQueryParam(custIds, ICustomerValue.S_CustId, custType);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		if (parameter.getBeanClass() == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
		String sql = CmCommonUtil.getDynamicSqlByCondsForGrpMgr(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), null, startNum, endNum);
		// DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
		// parameter.getCondition(), parameter.getParameter(), startNum,
		// endNum);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(parameter.getBeanClass(), sql, parameter.getParameter());
		if (!CmCommonUtil.isNotEmptyObject(dcs)) {
			return new CustomerBean[0];
		}
		CustomerBean[] customerValues = new CustomerBean[dcs.length];
		ICmCustSegmentRelaSV custSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		ICmCustSegmentSV segmentSV = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		IBOCmCustSegmentRelaValue segmentRelaValue = null;
		IBoCmCustSegmentValue segment = null;
		for (int i = 0; i < customerValues.length; i++) {
			customerValues[i] = new CustomerBean();
			customerValues[i].copy(dcs[i]);
			customerValues[i].initProperty(ICustomerValue.S_CustType, custType);
			
			segmentRelaValue = custSegmentRelaSV.querySegmentRelaByCustId(dcs[i].getAsLong(ICustomerValue.S_CustId));
			if(segmentRelaValue != null){
				segment = segmentSV.querySegmentByIdfromCache(segmentRelaValue.getSegmentId());
				customerValues[i].setSegmentId(String.valueOf(segmentRelaValue.getSegmentId()));
				customerValues[i].setSegmentName(segment.getSegmentName());
			}
			// 调用模糊化处理方法对敏感信息进行模糊化处理
			mask(customerValues[i]);
		}
		return customerValues;
	}
	
	/**   
	 * @Function queryCustomersByCols
	 * @Description 根据列字段数组查询客户
	 *
	 * @param numbers
	 * @param colName
	 * @param custType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-16 上午11:05:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-16     shitian             v1.0.0               修改原因<br>
	 */
	public final ICustomerValue[] queryCustomersByCols(String[] colValues,String colName, int custType, int startNum, int endNum) throws Exception {
		if (colValues == null || colValues.length <= 0) {
			return new CustomerBean[0];
		}
		Parameter parameter = buildCustomerBatchQueryParam(colValues, colName, custType);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		if (parameter.getBeanClass() == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
		String sql = CmCommonUtil.getDynamicSqlByCondsForGrpMgr(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), null, startNum, endNum);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(parameter.getBeanClass(), sql, parameter.getParameter());
		if (!CmCommonUtil.isNotEmptyObject(dcs)) {
			return new CustomerBean[0];
		}
		CustomerBean[] customerValues = new CustomerBean[dcs.length];
		ICmCustSegmentRelaSV custSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		ICmCustSegmentSV segmentSV = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		IBOCmCustSegmentRelaValue segmentRelaValue = null;
		IBoCmCustSegmentValue segment = null;
		for (int i = 0; i < customerValues.length; i++) {
			segmentRelaValue = custSegmentRelaSV.querySegmentRelaByCustId(dcs[i].getAsLong(ICustomerValue.S_CustId));
			segment = segmentSV.querySegmentByIdfromCache(segmentRelaValue.getSegmentId());
			customerValues[i] = new CustomerBean();
			customerValues[i].copy(dcs[i]);
			customerValues[i].initProperty(ICustomerValue.S_CustType, custType);
			customerValues[i].setSegmentId(String.valueOf(segmentRelaValue.getSegmentId()));
			customerValues[i].setSegmentName(segment.getSegmentName());
			// 调用模糊化处理方法对敏感信息进行模糊化处理
			mask(customerValues[i]);
		}
		return customerValues;
	}

	/**   
	 * @Function query
	 * @Description 根据查询条件DCs查询客户信息
	 *
	 * @param conditionDCs
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-21 下午3:45:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-21     huzq2           v1.0.0               修改原因
	 */
	public final DataContainer[] queryData(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception {
		boolean dbListBoxWrapFlag = false;
		Map map = ParamUtil.transferDataContainersToMap(conditionDCs);
		if (map.containsKey(CmConstants.CommonPageParamName.DB_LIST_BOX_WRAP_FLAG) && DataType.getAsBoolean(map.get(CmConstants.CommonPageParamName.DB_LIST_BOX_WRAP_FLAG))) {
			dbListBoxWrapFlag = true;
		}
		// 准备查询条件
		prepareCondition(conditionDCs);
		// 查询客户信息
		// limit(1,100) 查不出来第一条数据，所以暂时将1改为0
		if (startNum == 1) {
			startNum = 0;
		}
		ICustomerValue[] results = queryCustomers(conditionDCs, startNum, endNum);
		// 封装客户中下拉列表字段
		if (dbListBoxWrapFlag) {
			for (int i = 0; i < results.length; i++) {
				wrapDynamicListBoxField(results[i]);
				afterQueryCustomerByCustId(results[i]);
			}
		}
		//封装客户细分等
		for (int i = 0; i < results.length; i++) {
			afterQueryCustomerByCustId(results[i]);
		}
		return (DataContainer[]) results;
	}

	/**   
	 * 查询客户经理管理的客户数量
	 * @Function queryManagedCustomerCount
	 * @Description 
	 *
	 * @param managerId
	 * @param custType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午10:49:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public final int queryManagedCustomerCount(long managerId, int custType, DataContainer otherConditionDC) throws Exception {
		int count = 0;
		Parameter parameter = buildManagedCustomerParameter(managerId, custType, otherConditionDC);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		if (parameter.getBeanClass() == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		
		String sql = null;
		if (managerId > 0) {
			String custStatus = "";
			if(!CmCommonUtil.isEmptyObj(parameter.getParameter().get("CUST_STATUS"))){
				if(!CmCommonUtil.isEmptyObj(DataType.getAsString(parameter.getParameter().get("CUST_STATUS")))){
					custStatus = DataType.getAsString(parameter.getParameter().get("CUST_STATUS"));
				}				
			}
			sql = CmCommonUtil.getDynamicCountSqlByCondsForGrpMgr(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), custStatus);
		} else {
			sql = CmCommonUtil.getDynamicCountSqlByConds(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
		}
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter.getParameter());
		if (dcs != null && dcs.length > 0) {
			count = dcs[0].getAsInt("CNT");
		}
		return count;
	}

	/**   
	 * 查询客户经理管理的客户信息
	 * @Function queryManagedCustomers
	 * @Description 
	 *
	 * @param managerId
	 * @param custType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午10:24:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public final ICustomerValue[] queryManagedCustomers(long managerId, int custType, DataContainer otherConditionDC, int startNum, int endNum) throws Exception {
		Parameter parameter = buildManagedCustomerParameter(managerId, custType, otherConditionDC);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		if (parameter.getBeanClass() == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
		// DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
		// parameter.getCondition(), parameter.getParameter(), startNum,
		// endNum);
		String sql = null;
		if (managerId > 0) {
			String custStatus = "";
			if(!CmCommonUtil.isEmptyObj(parameter.getParameter().get("CUST_STATUS"))){
				if(!CmCommonUtil.isEmptyObj(DataType.getAsString(parameter.getParameter().get("CUST_STATUS")))){
					custStatus = DataType.getAsString(parameter.getParameter().get("CUST_STATUS"));
				}				
			}
			sql = CmCommonUtil.getDynamicSqlByCondsForGrpMgr(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), custStatus, startNum, endNum);
		} else {
			sql = CmCommonUtil.getDynamicSqlByConds(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum, endNum);
		}
		// 记录业务日志
		ICmCommonSV commonSV=(ICmCommonSV)ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.CUST_QRY, sql, parameter.getParameter(), CmConstants.BusiLogType.CUSTOMER_LOG);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(parameter.getBeanClass(), sql, parameter.getParameter());

		if (!CmCommonUtil.isNotEmptyObject(dcs)) {
			return new CustomerBean[0];
		}
		CustomerBean[] customerValues = new CustomerBean[dcs.length];
		for (int i = 0; i < customerValues.length; i++) {
			customerValues[i] = new CustomerBean();
			customerValues[i].copy(dcs[i]);
			// 调用模糊化处理方法对敏感信息进行模糊化处理
			mask(customerValues[i]);
		}
		return customerValues;
	}

	/**   
	 * 封装动态下拉列表字段
	 * @Function wrapDynamicListBoxField
	 * @Description 
	 *
	 * @param customerValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-30 下午3:55:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void wrapDynamicListBoxField(ICustomerValue customerValue) throws Exception;

	/**   
	 * 根据预先准备好的查询条件查询客户信息<br>
	 * 该方法需要被根据具体的业务需求来实现。该类中不提供实现。<br>
	 * 
	 * @Function queryCustomerCount
	 * @Description 
	 *
	 * @param conditionDCs 准备好的查询条件。
	 * @return 符合条件的客户数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午2:29:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private int queryCustomerCount(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = buildParameter(conditionDCs);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		if (parameter.getBeanClass() == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);

		// 在mysql数据库下查询BO改造
		Class<?> beanClass = parameter.getBeanClass();
		Map<?, ?> paramMap = parameter.getParameter();
		String sql = CmCommonUtil.getDynamicCountSqlByConds(beanClass, parameter.getCondition(), paramMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paramMap);
		return inter[0].getAsInt("CNT");
		// return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(),
		// parameter.getCondition(), parameter.getParameter());
	}

	/**   
	 * 根据预先准备好的查询条件查询客户信息<br>
	 * 该方法需要被根据具体的业务需求来实现。该类中不提供实现。<br>
	 * 
	 * @Function queryCustomers
	 * @Description 
	 *
	 * @param conditionDCs 准备好的查询条件。
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的客户列表信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午2:27:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private ICustomerValue[] queryCustomers(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception {
		Parameter parameter = buildParameter(conditionDCs);
		if (parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		if (parameter.getBeanClass() == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073"); // 输入参数不合法！
		}
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		ParamUtil.validateParameter(parameter);
		// 记录业务日志
		parameter.setBusinessId(CmConstants.BusiLogId.CUST_QRY);
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);

		// 在mysql数据库下查询BO改造
		Class<?> beanClass = parameter.getBeanClass();
		Map<?, ?> paramMap = parameter.getParameter();
		String sql = CmCommonUtil.getDynamicSqlByConds(beanClass, parameter.getCondition(), paramMap, startNum, endNum);
		DataContainerInterface[] groupCustomers = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(beanClass, sql, paramMap);
		/*
		 * DataContainerInterface[] groupCustomers =
		 * CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
		 * parameter.getParameter(), startNum, endNum);
		 */
		if (!CmCommonUtil.isNotEmptyObject(groupCustomers)) {
			return new CustomerBean[0];
		}
		CustomerBean[] customerValues = new CustomerBean[groupCustomers.length];
		// 直接从查询条件中获取客户类型
		int custType = getCustTypeFromCdn(conditionDCs);
		for (int i = 0; i < groupCustomers.length; i++) {
			customerValues[i] = new CustomerBean();
			customerValues[i].copy(groupCustomers[i]);
			customerValues[i].initProperty(ICustomerValue.S_CustType, custType);
			// add by zhuyy at 2014-5-19 增加CONT_EMAIL属性
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmCustContactMediumValue[] values = service.queryContactMediumByCondition(customerValues[i].getCustId(), CmConstants.MediumType.CUST_CONT_MED_TYPE_EMAIL);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				customerValues[i].setContEmail(values[0].getEmailAddress());
			}
			// 调用模糊化处理方法对敏感信息进行模糊化处理
			mask(customerValues[i]);
		}
		return (ICustomerValue[]) customerValues;
	}

	/**   
	 * 从查询条件中获取客户类型
	 * @Function getCustTypeFromCdn
	 * @Description 
	 *
	 * @param dcs
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-7 下午9:11:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-7     huzq           v1.0.0               修改原因<br>
	 */
	private int getCustTypeFromCdn(DataContainer[] dcs) throws Exception {
		Map map = ParamUtil.transferDataContainersToMap(dcs);
		return DataType.getAsInt(map.get(ICustomerValue.S_CustType));
	}

	protected Class getReturnObjectClass() {
		return CustomerBean.class;
	}

	/**   
	 * 判断客户是否实名制客户
	 * 
	 * @Function isRealNameCustomer
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-31 下午4:28:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-31     huzq2           v1.0.0               修改原因<br>
	 */
	public abstract boolean isRealNameCustomer(long custId) throws Exception;
}
