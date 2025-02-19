package com.asiainfo.crm.cm.busimodel.impl.common;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTableAttrValue;
import com.asiainfo.crm.cm.common.util.CmCfgTableAttrUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.service.impl.CmCustomerSVImpl;

/** 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName 
 * @Description 该类的功能描述
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-19 下午12:58:32
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
 */
public abstract class AbstractEntityAttrDealBusiModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	private static transient Log log = LogFactory.getLog(CmCustomerSVImpl.class);

	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		DataContainerInterface[] attrValues = valueObject.getAttrValues();
		Map userObject = valueObject.getUserMap();
		/*
		 * 验证属性
		 */
		validate(attrValues, userObject);
		/*
		 * 设置默认值
		 */
		setDefaultValues(attrValues, userObject);
		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(attrValues, userObject);
		/*
		 * 处理扩展属性
		 */
		dealEntityAttrValues(attrValues, userObject);
		/*
		 * 处理其他业务
		 */
		dealOtherThings(attrValues, userObject);

		notify(attrValues, userObject);
		/*
		 * 记录业务日志
		 */
		saveBusiLog(attrValues, userObject);
		/*
		 * 业务处理之后的操作
		 */
		processAfterDeal(attrValues, userObject);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010005"));
		return returnData;
	}

	/**   
	 * 业务处理之后的操作
	 * @Function processAfterDeal
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:31:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processAfterDeal(DataContainerInterface[] attrValues, Map userObject) throws Exception;

	/**   
	 * 保存业务日志
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:31:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void saveBusiLog(DataContainerInterface[] attrValues, Map userObject) throws Exception;

	/**   
	 * 处理值变更通知
	 * @Function notify
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:30:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void notify(DataContainerInterface[] attrValues, Map userObject) throws Exception;

	/**   
	 * 处理其他信息
	 * @Function dealOtherThings
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:30:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void dealOtherThings(DataContainerInterface[] attrValues, Map userObject) throws Exception;

	/**   
	 * 处理实体扩展属性
	 * @Function dealEntityAttrValues
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:28:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealEntityAttrValues(DataContainerInterface[] attrValues, Map userObject) throws Exception {
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(attrValues);
	}

	/**   
	 * 在处理业务之前的事项
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:27:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processBeforeDeal(DataContainerInterface[] attrValues, Map userObject) throws Exception;

	/**   
	 * 设置默认属性值
	 * @Function setDefaultValues
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:28:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultValues(DataContainerInterface[] attrValues, Map userObject) throws Exception {
		setEntityAttrDefaultValues(attrValues, userObject);
		setOtherDefaultValues(attrValues, userObject);
	}

	/**   
	 * 设置默认值。提供给本地化实现使用
	 * @Function setOtherDefaultValues
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:23:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void setOtherDefaultValues(DataContainerInterface[] attrValues, Map userObject) throws Exception;

	/**   
	 * 设置实体属性默认值
	 * @Function setEntityAttrDefaultValues
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:29:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void setEntityAttrDefaultValues(DataContainerInterface[] attrValues, Map userObject) {
		if (CmCommonUtil.isNotEmptyObject(attrValues)) {
			for (int i = 0; i < attrValues.length; i++) {
				if (attrValues[i].isNew()) {
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						if (attrValues[i].hasPropertyName("CREATE_OP_ID")) {
							attrValues[i].set("CREATE_OP_ID", ServiceManager.getUser().getID());
						}
						if (attrValues[i].hasPropertyName("CREATE_ORG_ID")) {
							attrValues[i].set("CREATE_ORG_ID", ServiceManager.getUser().getOrgId());
						}
					}
					// 设置记录状态
					if (attrValues[i].hasPropertyName("STATE")) {
						attrValues[i].set("STATE", CmConstants.RecordState.USE);
					}
				} else if (attrValues[i].isDeleted()) {
					if (attrValues[i].hasPropertyName("STATE")) {
						attrValues[i].set("STATE", CmConstants.RecordState.ERASE);
						attrValues[i].setStsToOld();
						attrValues[i].delete();
					}
				}
			}
		}
	}

	/**   
	 * 验证属性信息
	 * @Function validate
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:29:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void validate(DataContainerInterface[] attrValues, Map userObject) throws Exception {
		validateEntityAttrValues(attrValues, userObject);
		validateOtherThings(attrValues, userObject);
	}

	/**   
	 * 提供给本地化扩展实现
	 * @Function validateOtherThings
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:23:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validateOtherThings(DataContainerInterface[] attrValues, Map userObject) throws Exception;

	/**   
	 * 验证实体扩展属性值
	 * @Function validateEntityAttrValues
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @throws AIException 
	 * @date 2012-4-19 下午1:29:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateEntityAttrValues(DataContainerInterface[] attrValues, Map userObject) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(attrValues)) {
			for (int i = 0; i < attrValues.length; i++) {
				// 先检查系统中是否已经配置了对应的属性信息，如果没有配置，则认为是没有意义的数据，不予以操作
				if (!CmCommonUtil.isNotEmptyObject(CmCfgTableAttrUtil.getCfgTableAttrValue(attrValues[i].getObjectType().getMapingEnty(),
						StringUtils.trim(attrValues[i].getAsString(IBOCmCfgTableAttrValue.S_AttrCode))))) {
					// 系统中没有配置属性表[{0}]的字段[{1}]信息，请检查输入是否有误！
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0030140", attrValues[i].getObjectType().getMapingEnty(),
								StringUtils.trim(attrValues[i].getAsString(IBOCmCfgTableAttrValue.S_AttrCode))));
					}
					ExceptionUtil.throwBusinessException("CMS0030140", attrValues[i].getObjectType().getMapingEnty(),
							StringUtils.trim(attrValues[i].getAsString(IBOCmCfgTableAttrValue.S_AttrCode)));
				}
				// 验证新增、修改
				if (attrValues[i].isNew() || attrValues[i].isModified()) {
					validateEntityAttrValue(attrValues[i]);
				}
			}
		}
	}

	/**   
	 * 新增属性时的验证
	 * @Function validateNewEntityAttrValue
	 * @Description 
	 *
	 * @param attrValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-24 下午11:16:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateEntityAttrValue(DataContainerInterface attrValue) throws Exception {
		// 验证一下数据库中是否已经存在这样的属性了，如果存在则需要
		Map keyProps = attrValue.getKeyProperties();
		// 如果没有主键则不验证
		if (keyProps.isEmpty()) {
			return;
		}
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Iterator it = keyProps.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			condition.append(" AND ").append(key).append(" = :").append(key);
		}
		DataContainerInterface[] origionAttrValues = CmInnerServiceFactory.getCommonInnerSV().getBeans(attrValue.getClass(), condition.toString(), keyProps, -1, -1);
		// 数据库中已经存在，则做修改处理
		if (CmCommonUtil.isNotEmptyObject(origionAttrValues)) {
			// 先将前台输入的数据拷贝到查询出来的属性对象中
			DataContainerFactory.copyNoClearData(attrValue, origionAttrValues[0]);
			// 然后再将修改后的数据拷贝到输入的参数attrValue中进行后续操作。
			attrValue.copy(origionAttrValues[0]);
		} else { // 如果不存在则做新增操作。
			attrValue.setStsToNew();
		}
	}
}
