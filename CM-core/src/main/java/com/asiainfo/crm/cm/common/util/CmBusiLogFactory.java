package com.asiainfo.crm.cm.common.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.busimodel.ICmBusiLogCreator;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.config.CmConfigLoader;
import com.asiainfo.crm.cm.inner.log.bo.BOCmBusiLogBean;
import com.asiainfo.crm.cm.model.bean.VOQueryParamBean;
import com.asiainfo.crm.cm.model.bo.CmBusiLogBean;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IVOQueryParamValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.common.cache.BsOperationCacheImpl;
import com.asiainfo.crm.common.ivalues.IBOBsOperationValue;

/**   
 * 日志记录工具
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-6-24 下午5:22:22
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-6-24     huzq           v1.0.0               修改原因<br>
 */
public class CmBusiLogFactory {

	private static transient Log log = LogFactory.getLog(CmBusiLogFactory.class);

	/**
	 * 存放业务日志生成器实例
	 */
	private static Map<String, ICmBusiLogCreator> s_busilogCreatorMap = null;

	private static Object lock = new Object();

	private static boolean isInitial = false;

	/**   
	 * 创建一个默认的日志记录，日志记录中初始化了一些必要属性的默认值。
	 * @Function createDefaultBusiLog
	 * @Description 
	 *
	 * @param businessId 业务编码【必须】。
	 * @param busiType 业务类型【必须】。见定义{@link CmConstants.BusiLogType}.
	 * @param objectId 被操作的对象编号【可选】。
	 * @param billId 手机号码【可选】。
	 * @param operType 操作类型【必选】。见定义{@link CmConstants.BusiLogOperType}.
	 * @param parentLogId 父级业务日志编号【可选】。
	 * @param busiDetail 业务操作明细。
	 * @return 设置好默认属性值的业务日志记录对象。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-24 下午5:32:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-24     huzq           v1.0.0               修改原因<br>
	 */
	public static ICmBusiLogValue createDefaultBusiLog(long businessId, int busiType, long objectId, String billId, int operType, long parentLogId, String busiDetail)
			throws Exception {
		ICmBusiLogValue busiLogValue = new CmBusiLogBean();
		busiLogValue.setBusiLogId(CmCommonUtil.getNewSequence(BOCmBusiLogBean.class));
		busiLogValue.setBusinessId(businessId);
		busiLogValue.setBusiType(busiType);
		busiLogValue.setOperType(operType);
		busiLogValue.setParentLogId(parentLogId);
		busiLogValue.setBusiDetail(busiDetail);
		busiLogValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		busiLogValue.setState(CmConstants.RecordState.USE);
		IBOBsOperationValue operationValue = getOperationValue(businessId);
		if (CmCommonUtil.isNotEmptyObject(operationValue)) {
			busiLogValue.setRemarks(operationValue.getName());
		}
		if (StringUtils.isNotBlank(billId)) {
			busiLogValue.setBillId(billId);
		}
		switch (busiType) {
			case CmConstants.BusiLogType.CUSTOMER_LOG:
				busiLogValue.setCustId(objectId);
				break;
			case CmConstants.BusiLogType.ACCOUNT_LOG:
				busiLogValue.setAcctId(objectId);
				break;
			case CmConstants.BusiLogType.CLUB_LOG:
				busiLogValue.setUserId(objectId);
				break;
			case CmConstants.BusiLogType.CONTACT_LOG:
				busiLogValue.setPartyId(objectId);
				break;
			case CmConstants.BusiLogType.PARTY_LOG:
				busiLogValue.setPartyId(objectId);
				break;
			case CmConstants.BusiLogType.CUSTOMER_EVALUATION_LOG:
				busiLogValue.setCustId(objectId);
				break;
			default:
				break;
		}
		// 设置创建操作员编号、创建操作员组织编号。
		if (ServiceManager.getUser() != null) {
			busiLogValue.setCreateOpId(ServiceManager.getUser().getID());
			busiLogValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			busiLogValue.setOpId(ServiceManager.getUser().getID());
			busiLogValue.setOrgId(ServiceManager.getUser().getOrgId());
			busiLogValue.setChannelType(DataType.getAsInt(ServiceManager.getUser().get("CHANNEL_TYPE")));
		}
		busiLogValue.setDoneCode(ServiceManager.getDoneCode());
		busiLogValue.setDoneDate(ServiceManager.getOpDateTime());
		busiLogValue.setEffectiveDate(ServiceManager.getOpDateTime());
		busiLogValue.setExpireDate(TimeUtil.getMaxExpire());
		return busiLogValue;
	}

	/**   
	 * 从一个IValue中获取业务日志明细
	 * @Function getBusiDetail
	 * @Description 
	 *
	 * @param dsi
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-24 下午7:37:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-24     huzq           v1.0.0               修改原因<br>
	 */
	public static String getBusiDetail(DataStructInterface dsi, String prefix) throws Exception {
		if (CmCommonUtil.isEmptyObject(dsi)) {
			return null;
		}
		StringBuilder detail = new StringBuilder();
		if (StringUtils.isNotBlank(prefix)) {
			detail.append(prefix).append(":");
		} else {
			detail.append(dsi.getClass().getSimpleName()).append(":");
		}
		// 将主键属性通过名值对的方式拼接成字符串如：CUST_ID=123213
		Map keyProperties = dsi.getKeyProperties();
		Iterator keyIt = keyProperties.entrySet().iterator();
		while (keyIt.hasNext()) {
			Map.Entry entry = (Map.Entry) keyIt.next();
			detail.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
		}
		// 将被修改的属性通过名值对的方式拼接成字符串，如：CUST_NAME=XXX
		Map m_properties = dsi.getNewProperties();
		Iterator iterator = m_properties.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			detail.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
		}
		// 去掉最后一个逗号
		if (detail.length() > 0 && detail.toString().endsWith(",")) {
			detail.deleteCharAt(detail.length() - 1);
		}
		return detail.toString();
	}

	/**   
	 * 获取VO对应的生成业务日志的实现类实例
	 * 
	 * @Function getBusiLogCreator
	 * @Description 
	 *
	 * @param valueObjectType
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午9:48:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public static ICmBusiLogCreator getBusiLogCreator(String valueObjectType) {
		synchronized (lock) {
			if (!isInitial) {
				s_busilogCreatorMap = new HashMap<String, ICmBusiLogCreator>();
				Map configMap = CmConfigLoader.getInstance().getBusilogCreators();
				Iterator iterator = configMap.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					if (StringUtils.isNotBlank((String) entry.getValue())) {
						try {
							ICmBusiLogCreator creator = (ICmBusiLogCreator) ServiceFactory.getSeviceOfLocal((String) entry.getValue());
							s_busilogCreatorMap.put((String) entry.getKey(), creator);
						} catch (RuntimeException re) {
							log.info(re.getMessage(), re);
							log.error("Inintialize ICmBusiLogCreator on ERROR: " + re.getMessage());
						}
					}
				}
			}
		}
		return s_busilogCreatorMap.get(valueObjectType);
	}

	/**   
	 * 从缓存中获取业务操作编码的定义
	 * @Function getOperationValue
	 * @Description 
	 *
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-25 下午2:55:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-25     huzq           v1.0.0               修改原因<br>
	 */
	public static IBOBsOperationValue getOperationValue(long businessId) throws Exception {
		IBOBsOperationValue operationValue = (IBOBsOperationValue) CacheFactory.get(BsOperationCacheImpl.class, Long.valueOf(businessId));
		return operationValue;
	}

	/**   
	 * @Function log
	 * @Description 
	 *
	 * @param busiLogValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-24 下午5:26:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-24     huzq           v1.0.0               修改原因<br>
	 */
	public static void log(ICmBusiLogValue busiLogValue) throws Exception {
		// 如果不需要记录业务记录则跳过
		if (isNeedSaveBusiLog(busiLogValue.getBusinessId())) {
			CmServiceFactory.getBusiLogSV().saveBusiLog(busiLogValue);
		}
	}

	/**   
	 * 记录对VO对象的操作的业务日志.<br>
	 * 该方法根据当前的系统配置获取该VO对象对应的业务日志生成器，调用业务日志生成器的方法createBusiLogValue生成需要保存的业务日志信息，然后再调用服务保存。
	 * 
	 * @Function log
	 * @Description 
	 *
	 * @param valueObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-24 下午5:25:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-24     huzq           v1.0.0               修改原因<br>
	 */
	public static ICmBusiLogValue log(IValueObject valueObject) throws Exception {
		// 如果不需要记录业务记录则跳过
		if (!isNeedSaveBusiLog(valueObject.getBusinessId())) {
			return null;
		}
		ICmBusiLogCreator busiLogCreator = getBusiLogCreator(valueObject.getClass().getName());
		if (busiLogCreator == null) {
			return null;
		}
		// 调用实现类生成业务日志
		IVOBusiLogValue logValue = busiLogCreator.createBusiLogValue(valueObject);
		// 调用服务保存业务 日志
		CmServiceFactory.getBusiLogSV().saveBusiLog(logValue);
		return logValue.getMainBusiLog();
	}

	/**   
	 * 保存查询日志
	 * @Function log
	 * @Description 
	 *
	 * @param parameter 查询参数对象
	 * @param busiType 业务类型【必须】，定义见{@link CmConstants.BusiLogType}。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-25 下午1:15:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-25     huzq           v1.0.0               修改原因<br>
	 */
	public static ICmBusiLogValue log(Parameter parameter, int busiType) throws Exception {
		// 如果不需要记录业务记录则跳过
		if (!isNeedSaveBusiLog(parameter.getBusinessId())) {
			return null;
		}
		IVOQueryParamValue valueObject = new VOQueryParamBean();
		ICmBusiLogCreator busiLogCreator = getBusiLogCreator(valueObject.getClass().getName());
		if (busiLogCreator == null) {
			return null;
		}
		valueObject.setParameter(parameter);
		valueObject.setBusiType(busiType);
		// 调用实现类生成业务日志
		IVOBusiLogValue logValue = busiLogCreator.createBusiLogValue(valueObject);
		// 调用服务保存业务 日志
		CmServiceFactory.getBusiLogSV().saveBusiLog(logValue);
		return logValue.getMainBusiLog();
	}

	/**   
	 * 判断是否给定的业务编码是否需要记录业务日志。
	 * 
	 * @Function isNeedSaveBusiLog
	 * @Description 
	 *
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午10:06:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	public static boolean isNeedSaveBusiLog(long businessId) throws Exception {
		IBOBsOperationValue operationValue = CmBusiLogFactory.getOperationValue(businessId);
		boolean result = false;
		if (operationValue != null) {
			result = operationValue.getLogFlag() == null ? false : DataType.getAsBoolean(DataType.getAsInt(operationValue.getLogFlag()));
		}
		return result;
	}
}
