/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.log;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.ICmBusiLogCreator;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.bean.VOBusiLogBean;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;
import com.asiainfo.crm.common.ivalues.IBOBsOperationValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-16 下午4:54:30
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-16     huzq           v1.0.0               修改原因<br>
 */
public abstract class AbstractBusiLogCreatorImpl implements ICmBusiLogCreator {

	private static transient Log log = LogFactory.getLog(AbstractBusiLogCreatorImpl.class);

	public final IVOBusiLogValue createBusiLogValue(IValueObject valueObject) throws Exception {
		// 记录日志必须要记录业务编号
		if (!valueObject.hasBusinessId()) {
			if (log.isDebugEnabled()) {
				log.debug(CrmLocaleFactory.getResource("CMS0022001", "businessId"));
			}
			// ExceptionUtil.throwBusinessException("CMS0022001", "businessId");
		}
		IVOBusiLogValue logValue = new VOBusiLogBean();
		// 创建主业务日志
		ICmBusiLogValue mainBusiLogValue = createMainBusiLog(valueObject);
		logValue.setMainBusiLog(mainBusiLogValue);
		// 创建业务日志明细
		logValue.addBusiLogDetails(createBusiLogDetails(valueObject, mainBusiLogValue));
		// 将其他的信息也一并传递给后续处理的服务
		logValue.addUserMap(valueObject.getUserMap());
		return logValue;
	}

	/**   
	 * 生成具体的业务操作明细信息
	 * 
	 * @Function createBusiLogDetails
	 * @Description 
	 *
	 * @param valueObject
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @param mainBusiLogValue 
	 * @date 2012-7-16 下午8:00:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract ICmBusiLogValue[] createBusiLogDetails(IValueObject valueObject, ICmBusiLogValue mainBusiLogValue) throws Exception;

	/**   
	 * 获取当前的业务操作类型<be>
	 * 该方法需要被子类实现，返回具体的操作类型。
	 * 
	 * @Function getBusiLogType
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午8:00:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract int getBusiLogType();

	/**   
	 * 创建主业务日志
	 * 
	 * @Function createMainBusiLog
	 * @Description 
	 *
	 * @param valueObject
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-16 下午7:48:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected ICmBusiLogValue createMainBusiLog(IValueObject valueObject) throws Exception {
		long businessId = valueObject.getBusinessId();
		IBOBsOperationValue operationValue = getOperationValue(businessId);
		// 本次业务的主业务日志记录，后续的所有的操作都将与之关联，便于日志的分析、关联展示等
		ICmBusiLogValue mainBusiLogValue = createDefaultBusiLog(businessId, valueObject.getId(), null, -1, 0,
				(CmCommonUtil.isNotEmptyObject(operationValue) ? operationValue.getName() : ""));
		// 增加对批次号的解析
		if (valueObject.hasUserObject(ICmBusiLogValue.S_BatchDataId)) {
			mainBusiLogValue.setBatchDataId(DataType.getAsLong(valueObject.getUserObject(ICmBusiLogValue.S_BatchDataId)));
		}
		return mainBusiLogValue;
	}

	/**   
	 * 创建一个默认的日志记录，日志记录中初始化了一些必要属性的默认值。
	 * @Function createDefaultBusiLog
	 * @Description 
	 *
	 * @param businessId 业务编码【必须】。
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
	protected ICmBusiLogValue createDefaultBusiLog(long businessId, long objectId, String billId, int operType, long parentLogId, String busiDetail) throws Exception {
		int busiType = getBusiLogType();
		return CmBusiLogFactory.createDefaultBusiLog(businessId, busiType, objectId, billId, operType, parentLogId, busiDetail);
	}

	/**   
	 * 创建一个默认的日志记录，日志记录中初始化了一些必要属性的默认值。
	 * 
	 * @Function createDefaultBusiLog
	 * @Description 
	 *
	 * @param businessId 业务编码【必须】。
	 * @param objectId 被操作的对象编号【可选】。
	 * @param billId 手机号码【可选】。
	 * @param busiType 业务类型
	 * @param operType 操作类型【必选】。见定义{@link CmConstants.BusiLogOperType}.
	 * @param parentLogId 父级业务日志编号【可选】。
	 * @param busiDetail 业务操作明细。
	 * @return 设置好默认属性值的业务日志记录对象。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午2:07:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected ICmBusiLogValue createDefaultBusiLog(long businessId, long objectId, String billId, int busiType, int operType, long parentLogId, String busiDetail) throws Exception {
		return CmBusiLogFactory.createDefaultBusiLog(businessId, busiType, objectId, billId, operType, parentLogId, busiDetail);
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
	protected IBOBsOperationValue getOperationValue(long businessId) throws Exception {
		return CmBusiLogFactory.getOperationValue(businessId);
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
	protected String getBusiDetail(DataStructInterface dsi, String prefix) throws Exception {
		return CmBusiLogFactory.getBusiDetail(dsi, prefix);
	}

	/**   
	 * 从DataContainer中生成业务日志
	 * 
	 * @Function createBusiLogFromDC
	 * @Description 
	 *
	 * @param dsi
	 * @param mainBusiLogValue
	 * @param objectId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午10:23:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected ICmBusiLogValue createBusiLogFromDC(DataStructInterface dsi, ICmBusiLogValue mainBusiLogValue, long objectId) throws Exception {
		return createBusiLogFromDC(dsi, mainBusiLogValue, objectId, getBusiLogType());
	}

	/**   
	 * 从DataContainer中生成业务日志
	 * 
	 * @Function createBusiLogFromDC
	 * @Description 
	 *
	 * @param dsi
	 * @param mainBusiLogValue
	 * @param objectId 对象编号
	 * @param busiType 业务类型
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午10:23:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected ICmBusiLogValue createBusiLogFromDC(DataStructInterface dsi, ICmBusiLogValue mainBusiLogValue, long objectId, int busiType) throws Exception {
		int busiOperType = -1;
		if (dsi.isNew()) {
			busiOperType = CmConstants.BusiLogOperType.ADD;
		} else if (dsi.isModified()) {
			if (StringUtils.equals((String) dsi.get("STATE"), CmConstants.RecordState.ERASE)) {
				busiOperType = CmConstants.BusiLogOperType.DELETE;
			} else {
				busiOperType = CmConstants.BusiLogOperType.MODIFY;
			}
		} else if (dsi.isDeleted()) {
			busiOperType = CmConstants.BusiLogOperType.DELETE;
		}
		// 集团客户层级的新增和删除做特殊处理(前面的业务影响了datacontainer的状态）
		if(null!=mainBusiLogValue && mainBusiLogValue.getBusinessId()>0){
			if(CmConstants.BusiLogId.GROUP_HIERARCHY_CREATE==mainBusiLogValue.getBusinessId()){
				busiOperType = CmConstants.BusiLogOperType.ADD;
			}else if(CmConstants.BusiLogId.GROUP_HIERARCHY_SPLIT==mainBusiLogValue.getBusinessId()){
				busiOperType = CmConstants.BusiLogOperType.DELETE;
			}
		}
		// 如果对象状态没有改变则不需要记录日志
		if (busiOperType != -1) {
			String billId = null;
			if (dsi.hasProperty(ICmBusiLogValue.S_BillId)) {
				billId = DataType.getAsString(dsi.get(ICmBusiLogValue.S_BillId));
			}
			ICmBusiLogValue busiLogValue = createDefaultBusiLog(mainBusiLogValue.getBusinessId(), objectId, billId, busiOperType, mainBusiLogValue.getBusiLogId(), "");
			// 生成业务明细
			busiLogValue.setBusiDetail(getBusiDetail(dsi, mainBusiLogValue.getBusiDetail()));
			// 如果主业务日志的操作类型为-1，则需要将当前的操作类型设置给主业务日志
			if (mainBusiLogValue.getOperType() == -1) {
				mainBusiLogValue.setOperType(busiLogValue.getOperType());
			}
			// 增加对批次号的解析
			if (mainBusiLogValue.getBatchDataId() > 0) {
				busiLogValue.setBatchDataId(mainBusiLogValue.getBatchDataId());
			}
			return busiLogValue;
		}
		return null;
	}
}
