/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgSpecListTypeValue;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCfgSpecListTypeUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.evaluation.bo.BOCmSpecialListBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOSpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-13 下午11:32:27
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
 */
public abstract class AbstractSpecialListDealBusiModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	private static transient Log log = LogFactory.getLog(AbstractSpecialListDealBusiModelImpl.class);

	public ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOSpecialListValue specialListValue = (IVOSpecialListValue) valueObject;
		/*
		 * 验证数据
		 */
		validate(specialListValue);
		/*
		 * 设置默认属性值
		 */
		setDefaultValue(specialListValue);
		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(specialListValue);
		/*
		 * 处理业务
		 */
		dealSpecialList(specialListValue);
		/*
		 * 处理其他业务
		 */
		dealOtherThings(specialListValue);
		//
		notify(specialListValue);
		/*
		 * 记录业务日志
		 */
		saveBusiLog(specialListValue);
		/*
		 * 业务处理之后的操作
		 */
		processAfterDeal(specialListValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010005"));
		return returnData;
	}

	private void validate(IVOSpecialListValue specialListValue) throws Exception {
		// 核心功能的验证
//		validateSpecialListValues(specialListValue);
		// 验证其他信息
		validateOtherThings(specialListValue);
	}

	/**   
	 * 验证其他信息。<br>
	 * 如本地化有扩展实现，并且其中还有数据需要验证，则需要实现该接口。
	 * @Function validateOtherThings
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-14 下午5:22:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validateOtherThings(IVOSpecialListValue specialListValue) throws Exception;

	/**   
	 * @Function validateSpecialListValues
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午3:14:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateSpecialListValues(IVOSpecialListValue specialListValue) throws Exception {
		ISpecialListValue[] specialListValues = specialListValue.getSpecialLists();
		if (CmCommonUtil.isNotEmptyObject(specialListValues)) {
			for (int i = 0; i < specialListValues.length; i++) {
				if (specialListValues[i].isNew()) {
					validateNewSpecialListValue(specialListValues[i]);
				} else if (specialListValues[i].isModified()) {
					validateModifySpecialListValue(specialListValues[i]);
				}
			}
		}
	}

	/**   
	 * 修改特殊名单时的验证
	 * 
	 * @Function validateModifySpecialListValue
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-29 下午9:15:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-29     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateModifySpecialListValue(ISpecialListValue specialListValue) throws Exception {
		validateSpecialListValue(specialListValue);
	}

	/**   
	 * 验证名单是否存在或存在互斥的名单
	 * @Function validateSpecialListValue
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-29 下午9:11:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-29     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateSpecialListValue(ISpecialListValue specialListValue) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" and ").append(ISpecialListValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		// 客户编号、用户编号、手机号码、证件类型+证件号码至少需要传入一组参数
		if (!specialListValue.hasProperty(ISpecialListValue.S_CustId) && !specialListValue.hasProperty(ISpecialListValue.S_UserId)
				&& !specialListValue.hasProperty(ISpecialListValue.S_BillId)
				&& (!specialListValue.hasProperty(ISpecialListValue.S_CertType) || !specialListValue.hasProperty(ISpecialListValue.S_CertCode))) {
			// 客户名称与证件类型、证件号码至少选择填一项：{0}，请检查！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010004"));
			}
			ExceptionUtil.throwBusinessException("CMS0010004");
		}
		if (specialListValue.hasProperty(ISpecialListValue.S_CustId)) {
			condition.append(" and ").append(ISpecialListValue.S_CustId).append(" = :custId ");
			parameter.put("custId", specialListValue.getCustId());
		}
		if (specialListValue.hasProperty(ISpecialListValue.S_UserId)) {
			condition.append(" and ").append(ISpecialListValue.S_UserId).append(" = :userId ");
			parameter.put("userId", specialListValue.getUserId());
		}
		if (specialListValue.hasProperty(ISpecialListValue.S_BillId)) {
			condition.append(" and ").append(ISpecialListValue.S_BillId).append(" = :billId ");
			parameter.put("billId", specialListValue.getBillId());
		}
		if (specialListValue.hasProperty(ISpecialListValue.S_CertType) && specialListValue.hasProperty(ISpecialListValue.S_CertCode)) {
			condition.append(" and ").append(ISpecialListValue.S_CertType).append(" = :certType ");
			condition.append(" and ").append(ISpecialListValue.S_CertCode).append(" = :certCode ");
			parameter.put("certType", specialListValue.getCertType());
			parameter.put("certCode", specialListValue.getCertCode());
		}
		condition.append(" and ((");
//		IBOCmCfgSpecListTypeValue listTypeValue = CmCfgSpecListTypeUtil.getCfgSpecListType(specialListValue.getMonType());
//		if (!CmCommonUtil.isNotEmptyObject(listTypeValue)) {
//			// 参数错误，当前系统不存在类型为{0}的定义！
//			if (log.isErrorEnabled()) {
//				log.error(CrmLocaleFactory.getResource("CMS0022002"));
//			}
//			ExceptionUtil.throwBusinessException("CMS0022002");
//		}
		condition.append(ISpecialListValue.S_MonType).append(" = :monType ");
		parameter.put("monType", specialListValue.getMonType());
		// 类型定义中存在子类型，则特殊名单中的子类型不能为空
//		if (CmCommonUtil.isNotEmptyObject(CmCfgSpecListTypeUtil.getSubCfgSpecListTypes(specialListValue.getMonType()))) {
//			if (!CmCommonUtil.isNotEmptyObject(CmCfgSpecListTypeUtil.getCfgSpecListType(specialListValue.getSubMonType()))) {
//				// 参数错误，当前系统不存在类型为{0}的定义！
//				if (log.isErrorEnabled()) {
//					log.error(CrmLocaleFactory.getResource("CMS0022002"));
//				}
//				ExceptionUtil.throwBusinessException("CMS0022002");
//			}
//			condition.append(" and ").append(ISpecialListValue.S_SubMonType).append(" = :subMonType ");
//			parameter.put("subMonType", specialListValue.getSubMonType());
//		}
		condition.append(")");
		// 验证互斥的特殊名单
		// 一级类型互斥关系
		IBOCmCfgSpecListTypeValue[] incompTypeValues = CmServiceFactory.getCommonSV().getIncompatibleSpecListTypes(specialListValue.getMonType());
		if (CmCommonUtil.isNotEmptyObject(incompTypeValues)) {
			condition.append(" OR ").append(ISpecialListValue.S_MonType).append(" IN (");
			for (int j = 0; j < incompTypeValues.length; j++) {
				condition.append(incompTypeValues[j].getTypeId()).append(",");
			}

			condition.delete(condition.length() - 1, condition.length()).append(")");
		}
		// 子类型互斥关系
		if (CmCommonUtil.isNotEmptyObject(CmCfgSpecListTypeUtil.getCfgSpecListType(specialListValue.getSubMonType()))) {
			incompTypeValues = CmServiceFactory.getCommonSV().getIncompatibleSpecListTypes(specialListValue.getSubMonType());
			if (CmCommonUtil.isNotEmptyObject(incompTypeValues)) {
				condition.append(" OR ").append(ISpecialListValue.S_SubMonType).append(" IN (");
				for (int j = 0; j < incompTypeValues.length; j++) {
					condition.append(incompTypeValues[j].getTypeId()).append(",");
				}
				condition.delete(condition.length() - 1, condition.length()).append(")");
			}
		}
		condition.append(")");
		if (specialListValue.getSpecListId() > 0) {
			condition.append(" AND ").append(ISpecialListValue.S_SpecListId).append(" <> :currSpecialId ");
			parameter.put("currSpecialId", specialListValue.getSpecListId());
		}
		if (CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmSpecialListBean.class, condition.toString(), parameter) > 0) {
			// TODO 系统中已经存在相同的特殊名单记录或者互斥的特殊名单记录，不能添加。
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0094064"));
			}
			ExceptionUtil.throwBusinessException("CMS0094064");
		}
	}

	/**   
	 * 对新增特殊名单的验证
	 * @Function validateNewSpecialListValue
	 * @Description 
	 *
	 * @param specialListValue
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午3:12:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void validateNewSpecialListValue(ISpecialListValue specialListValue) throws Exception {
		validateSpecialListValue(specialListValue);
	}

	protected void dealSpecialList(IVOSpecialListValue specialListValue) throws Exception {
		ISpecialListValue[] specialListValues = specialListValue.getSpecialLists();
		if (CmCommonUtil.isNotEmptyObject(specialListValues)) {
			List list = new ArrayList();
			for (int i = 0; i < specialListValues.length; i++) {
				BOCmSpecialListBean value = new BOCmSpecialListBean();
				value.copy(specialListValues[i]);
				list.add(value);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmSpecialListBean[]) list.toArray(new BOCmSpecialListBean[0]));
			// 回设日志属性
			/*int i = 0;
			for (Iterator iterator = list.iterator(); iterator.hasNext(); i++) {
				BOCmSpecialListBean bean = (BOCmSpecialListBean) iterator.next();
				specialListValues[i].setCreateDate(bean.getCreateDate());
				specialListValues[i].setDoneCode(bean.getDoneCode());
				specialListValues[i].setDoneDate(bean.getDoneDate());
				specialListValues[i].setOpId(bean.getOpId());
				specialListValues[i].setOrgId(bean.getOrgId());
				specialListValues[i].setEffectiveDate(bean.getEffectiveDate());
				specialListValues[i].setExpireDate(bean.getExpireDate());
			}*/
		}

	}

	/**   
	 * 处理其他业务【本地化实现】
	 * @Function dealOtherThings
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-31 下午1:02:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void dealOtherThings(IVOSpecialListValue specialListValue) throws Exception;

	/**   
	 * 通知
	 * @Function notify
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-31 下午1:02:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void notify(IVOSpecialListValue specialListValue) throws Exception;

	/**   
	 * 保存业务日志
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-25 下午2:22:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-25     huzq           v1.0.0               修改原因<br>
	 */
	protected void saveBusiLog(IVOSpecialListValue specialListValue) throws Exception {
		CmBusiLogFactory.log(specialListValue);
	}

	/**   
	 * 处理业务之前的任务【本地化实现】
	 * @Function processAfterDeal
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-31 下午1:02:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processAfterDeal(IVOSpecialListValue specialListValue) throws Exception;

	/**   
	 * 处理业务之后的任务【本地化实现】
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-31 下午1:03:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processBeforeDeal(IVOSpecialListValue specialListValue) throws Exception;

	/**   
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param specialListValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 上午11:26:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	private void setDefaultValue(IVOSpecialListValue specialListValue) throws Exception {
		// 设置默认的特殊名单信息
		setDefaultSpecialListValue(specialListValue);

		setOtherDefaultValue(specialListValue);
	}

	protected void setDefaultSpecialListValue(IVOSpecialListValue specialListValue) throws Exception {
		if (specialListValue.hasSpecialLists()) {
			ISpecialListValue[] specialListValues = specialListValue.getSpecialLists();
			for (int i = 0; i < specialListValues.length; i++) {
				if (specialListValues[i].isNew()) {
					specialListValues[i].setSpecListId(CmCommonUtil.getNewSequence(BOCmSpecialListBean.class));
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						specialListValues[i].setCreateOpId(ServiceManager.getUser().getID());
						specialListValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(specialListValues[i].getRegionId())) {
						specialListValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					specialListValues[i].setState(CmConstants.RecordState.USE);
				}
			}
		}

	}

	/**   
	 * 设置其他属性<br>
	 * e.g.<br>
	 * 人如果有本地化扩展的客户表，则需要实现该方法用于设置该表的默认值。主要是设置create_op_id等属性
	 * @Function setOtherDefaultValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午4:15:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void setOtherDefaultValue(IVOSpecialListValue specialListValue) throws Exception;

}
