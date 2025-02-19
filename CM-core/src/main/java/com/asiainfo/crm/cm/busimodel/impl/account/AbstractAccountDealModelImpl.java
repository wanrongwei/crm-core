package com.asiainfo.crm.cm.busimodel.impl.account;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.bill.teaminvoke.out.interfaces.IInterfaceBillCrmSV;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmConstants.TenantId;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCMPartyAcctRelBean;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctBillCycleBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctPaymentBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmBillCustomizeBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountAttrValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.AcctAgreemnetRelBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCustomizeBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctAgreemnetRelValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.service.interfaces.ICmxCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISo2CmSV;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName AbstractAccountDealModelImpl
 * @Description 该类对账户操作的业务逻辑进行了抽象的实现。
 *
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-3-29 上午11:53:22
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
 */
public abstract class AbstractAccountDealModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	private transient static Log log = LogFactory.getLog(AbstractAccountDealModelImpl.class);

	/**
	 * 处理流程:<br>
	 * <ol>
	 *  <li>{@link #validate(IVOAccountValue) 验证数据}</li>
	 *  <li>{@link #setDefaultValue(IVOAccountValue) 设置默认属性值}</li>
	 *  <li>{@link #processBeforeDeal(IVOAccountValue) 在调用业务处理之前的处理}</li>
	 *  <li>{@link #dealAccount(IVOAccountValue) 处理账户信息}</li>
	 *  <li>{@link #dealContacts(IVOAccountValue) 处理联系人 信息}</li>
	 *  <li>{@link #dealAccountPayment(IVOAccountValue) 处理账户支付方式信息}</li>
	 *  <li>{@link #dealBillCustomize(IVOAccountValue) 处理账户客户化帐单定制信息}</li>
	 *  <li>{@link #dealBillCycle(IVOAccountValue) 处理账户账期信息}</li>
	 * 	<li>{@link #dealAttrValues(IVOAccountValue) 处理属性信息}</li>
	 *  <li>{@link #dealOtherThings(IVOAccountValue) 处理其他业务信息}</li>
	 *  <li>{@link #saveBusiLog(IVOAccountValue) 记录业务日志}</li>
	 *  <li>{@link #processAfterDeal(IVOAccountValue) 业务处理之后的操作}</li>
	 * </ol>
	 */

	@Override
	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOAccountValue acctValue = (IVOAccountValue) valueObject;
		/*
		 * 验证数据
		 */
		validate(acctValue);
		/*
		 * 设置默认属性值
		 */
		setDefaultValue(acctValue);
		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(acctValue);
		/*
		 * 处理账户信息
		 */
		dealAccount(acctValue);
		/*
		 * 增加代付账户的出来
		 */
		dealPayer(acctValue);
		/*
		 * 处理联系人 信息
		 */
		dealContacts(acctValue);
		/*
		 * 处理账户支付方式信息
		 */
		dealAccountPayment(acctValue);
		/*
		 * 处理账户客户化帐单定制信息
		 */
		// dealBillCustomize(acctValue);
		/*
		 * 处理账户账期信息
		 */
		dealBillCycle(acctValue);
		/*
		 * 处理属性信息
		 */
		dealAttrValues(acctValue);
		/*
		 * 处理其他业务
		 */
		dealOtherThings(acctValue);
		/*
		 * 通知其他业务模块
		 */
		notify(acctValue);
		/*
		 * 记录业务日志
		 */
		saveBusiLog(acctValue);
		/*
		 * 业务处理之后的操作
		 */
		processAfterDeal(acctValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		// 账户保存成功！
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0020101"));
		return returnData;
	}

	/**  
	 *  验证账户信息是否符合业务规则
	 * @Function validate
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 上午11:59:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	private void validate(IVOAccountValue acctValue) throws Exception {
		if (acctValue == null) {
			// 传入{0}的对象为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010002", IVOAccountValue.class.getName()));
			}
			ExceptionUtil.throwBusinessException("CMS0010002", IVOAccountValue.class.getName());
		}
		// 验证账户基本信息
		validateAccount(acctValue);
		// 验证账户支付方案信息
		validateAcctPayments(acctValue);
		// 验证账单定制信息
		validateAcctBillCustomizes(acctValue);
		// 验证账期信息
		validateAcctBillCycle(acctValue);
		// 验证其他信息
		validateOther(acctValue);
	}

	/**   
	 * 验证其他信息，开放给子类实现
	 * 
	 * @Function validateOther
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午7:46:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validateOther(IVOAccountValue acctValue) throws Exception;

	/**
	 * 验证账户账期信息
	 *    
	 * @Function validateAcctBillCycle
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午7:45:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateAcctBillCycle(IVOAccountValue acctValue) throws Exception {
		/*
		 * 检验账户账期是否合法
		 */
		if (acctValue.hasBillCycle()) {
			IAcctBillCycleValue[] billCycleValues = acctValue.getBillCycles();
			for (int i = 0; i < billCycleValues.length; i++) {
				// 没有值变化的跳过
				if (!billCycleValues[i].isNew() && !billCycleValues[i].isModified() && !billCycleValues[i].isDeleted()) {
					continue;
				}
				if ((!billCycleValues[i].isNew() && billCycleValues[i].getAcctId() <= 0)) {
					// || (billCustomizeValues[i].isNew() && accountValue == null)) {
					// modify by yandong2 2012-04-12 pm 1:34 去除上面注释掉的校验
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0011085")));
					}
					ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0011085"));// 参数错误，参数{0}不能为空！
				}
				// 出账日类型必须为当前系统定义的出账日类型
				if (StaticDataUtil.getStaticData(CmConstants.BillCycle.BILL_DAY, String.valueOf(billCycleValues[i].getBillDay())) == null) {
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022002", CmConstants.BillCycle.BILL_DAY));
					}
					ExceptionUtil.throwBusinessException("CMS0022002", CmConstants.BillCycle.BILL_DAY);// 参数错误，当前系统不存在类型为{0}的定义！
				}
				// 增加对REGION_ID的验证 added by huzq2 at 2012-3-31
				if (!billCycleValues[i].isNew() && StringUtils.isBlank(billCycleValues[i].getRegionId())) {
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022002", CrmLocaleFactory.getResource("CMS0000033")));
					}
					ExceptionUtil.throwBusinessException("CMS0022002", CrmLocaleFactory.getResource("CMS0000033"));// 参数错误，参数地市不能为空！
				}
			}
		}
	}

	/**   
	 * 验证账单定制信息
	 * 
	 * @Function validateAcctBillCustomizes
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午7:44:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateAcctBillCustomizes(IVOAccountValue acctValue) throws Exception {
		/*
		 * 检验账户客户化帐单定制是否合法
		 */
		if (acctValue.hasBillCustomizes()) {
			IAcctBillCustomizeValue[] billCustomizeValues = acctValue.getBillCustomizes();
			for (int i = 0; i < billCustomizeValues.length; i++) {
				// 没有值变化的跳过
				if (!billCustomizeValues[i].isNew() && !billCustomizeValues[i].isModified()) {
					continue;
				}
				if ((!billCustomizeValues[i].isNew() && billCustomizeValues[i].getAcctId() <= 0)) {
					// || (billCustomizeValues[i].isNew() && accountValue == null)) {
					// modify by yandong2 2012-04-12 pm 1:34 去除上面注释掉的校验
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0011085")));
					}
					ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0011085"));// 参数错误，参数{0}不能为空！
				}
				// 帐单格式类型必须为当前系统定义的账户类型
				// if (StaticDataUtil.getStaticData(CmConstants.BillCutomize.BILL_FORMAT,
				// String.valueOf(billCustomizeValues[i].getBillPattern())) == null) {
				// if (log.isErrorEnabled()) {
				// log.error(CrmLocaleFactory.getResource("CMS0022002", CmConstants.BillCutomize.BILL_FORMAT));
				// }
				// ExceptionUtil.throwBusinessException("CMS0022002", CmConstants.BillCutomize.BILL_FORMAT);//
				// 参数错误，当前系统不存在类型为{0}的定义！
				// }
				// 帐单投递方式类型必须为当前系统定义的账户类型
				/*
				 * if (StaticDataUtil.getStaticData(CmConstants.BillCutomize.Bill_MAIL_TYPE,
				 * String.valueOf(billCustomizeValues[i].getMailType())) == null) { if (log.isErrorEnabled()) {
				 * log.error(CrmLocaleFactory.getResource("CMS0022002", CmConstants.BillCutomize.Bill_MAIL_TYPE)); }
				 * ExceptionUtil.throwBusinessException("CMS0022002", CmConstants.BillCutomize.Bill_MAIL_TYPE);//
				 * 参数错误，当前系统不存在类型为{0}的定义！ }
				 */
				// 增加对REGION_ID的验证 added by huzq2 at 2012-3-31
				if (!billCustomizeValues[i].isNew() && StringUtils.isBlank(billCustomizeValues[i].getRegionId())) {
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022002", CrmLocaleFactory.getResource("CMS0000033")));
					}
					ExceptionUtil.throwBusinessException("CMS0022002", CrmLocaleFactory.getResource("CMS0000033"));// 参数错误，参数地市不能为空！
				}
			}
		}
	}

	/**   
	 * 验证账户支付方案
	 * 
	 * @Function validateAcctPayments
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午7:41:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateAcctPayments(IVOAccountValue acctValue) throws Exception {
		/*
		 * 检验账户支付方式是否合法
		 */
		if (acctValue.hasPayments()) {
			IAcctPaymentValue[] acctPaymentValues = acctValue.getPayments();
			for (int i = 0; i < acctPaymentValues.length; i++) {
				// 没有值变化的跳过
				if (!acctPaymentValues[i].isNew() && !acctPaymentValues[i].isModified() && !acctPaymentValues[i].isDeleted()) {
					continue;
				}
				if ((!acctPaymentValues[i].isNew() && acctPaymentValues[i].getAcctId() <= 0)) {
					// || (acctPaymentValues[i].isNew() && accountValue == null)
					// modify by yandong2 2012-04-11 pm 4:14 去除上面注释掉的校验
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0011085")));
					}
					ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0011085"));// 参数错误，参数{0}不能为空！
				}
				// 账户付费方式类型必须为当前系统定义的账户类型
				if (!CmStaticDataUtil.isLegalStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(acctPaymentValues[i].getPayMethod()))) {
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022002", CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD));
					}
					ExceptionUtil.throwBusinessException("CMS0022002", CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD);// 参数错误，当前系统不存在类型为{0}的定义！
				}
				// 增加对REGION_ID的验证 added by huzq2 at 2012-3-31
				if (!acctPaymentValues[i].isNew() && StringUtils.isBlank(acctPaymentValues[i].getRegionId())) {
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022002", CrmLocaleFactory.getResource("CMS0000033")));
					}
					ExceptionUtil.throwBusinessException("CMS0022002", CrmLocaleFactory.getResource("CMS0000033"));// 参数错误，参数地市不能为空！
				}
				// 验证支付方式是否正确
				validatePayMethod(acctPaymentValues[i], acctValue);
			}
		}
	}

	/**   
	 * 验证支付方式是否合法
	 * 
	 * @Function validateAcctPaymethod
	 * @Description 
	 *
	 * @param iAcctPaymentValue 支付方案
	 * @param acctValue 账户大对象，如果在验证中需要获取其他信息则可以从中获取。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午8:02:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validatePayMethod(IAcctPaymentValue iAcctPaymentValue, IVOAccountValue acctValue) throws Exception;

	/**   
	 * 验证账户基本信息
	 * 
	 * @Function validateAccount
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午7:39:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateAccount(IVOAccountValue acctValue) throws Exception {
		/*
		 * 检验账户信息是否合法
		 */
		IAccountValue accountValue = acctValue.getAccount();
		if (accountValue != null) {
			// 没有值变化的跳过
			if (!accountValue.isNew() && !accountValue.isModified() && !accountValue.isDeleted()) {
				return;
			}
			if (!accountValue.isNew() && accountValue.getAcctId() <= 0) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0011085")));
				}
				ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0011085"));// 参数错误，参数{0}不能为空！
			}
			// 增加对REGION_ID的验证 added by huzq2 at 2012-3-31
			if (!accountValue.isNew() && StringUtils.isBlank(accountValue.getRegionId())) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0022002", CrmLocaleFactory.getResource("CMS0000033")));
				}
				ExceptionUtil.throwBusinessException("CMS0022002", CrmLocaleFactory.getResource("CMS0000033"));// 参数错误，参数地市不能为空！
			}

			// 设置账户stopPaymentFee
			if (StringUtils.isBlank(accountValue.getAcctBehalfPhone())) {
				ICmxCustomerSV cmxCustSV = (ICmxCustomerSV) ServiceFactory.getService(ICmxCustomerSV.class);
				ICustomerValue cmxCustValue = cmxCustSV.queryCmxCustomer(accountValue.getCustId());
				// 从客户获取
				if (cmxCustValue != null && StringUtils.isNotBlank(cmxCustValue.getExt22())) {
					accountValue.setAcctBehalfPhone(cmxCustValue.getExt22());
				} else {
					accountValue.setAcctBehalfPhone("0");
				}
			}
		}
	}

	/**   
	 * 设置一些默认属性，如：创建操作员编号、创建操作员等。
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:21:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	private void setDefaultValue(IVOAccountValue acctValue) throws Exception {
		// 对于新建账户的时候需要设置一些默认属性，如：创建操作员编号、创建操作员等。
		/*
		 * 设置账户的默认属性
		 */
		setDefaultAccountValue(acctValue);
		/*
		 * 设置联系人默认值
		 */
		setDefaultContactValue(acctValue);
		/*
		 * 设置账户支付方式信息的默认属性
		 */
		setDefaultAccountPayment(acctValue);
		/*
		 * 设置账户客户化帐单定制信息的默认属性
		 */
		// setDefaultBillCustomize(acctValue);
		/*
		 * 设置账户账期信息的默认属性
		 */
		setDefaultBillCycle(acctValue);
		/*
		 * 设置账户扩展信息的默认属性
		 */
		setDefaultAttrValue(acctValue);
	}

	/** 
	 * 设置账户的默认属性。<br>
	 * 默认实现了以下功能：<br>
	 * 1、当新建账户时，设置账户编号、创建操作员编号、创建操作员组织编号、地市编码、记录状态、账户状态；<br>
	 * 2、当删除账户时，将账户实体的状态置为Old状态然后在delete，确保所有的属性都会被记录到历史表中。	
	 * @Function setDefaultAccountValue
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:30:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 * 2012-7-23     huzq	            v1.0.0               修改设置默认值问题
	 */
	protected void setDefaultAccountValue(IVOAccountValue acctValue) throws Exception {
		IAccountValue accountValue = acctValue.getAccount();
		if (accountValue != null) {
			// 设置CREATE_OP_ID等11个属性
			setCommonValue(accountValue);
			/*
			 * 如果是新建账户，则需要设置账户编号、创建操作员编号、组织等信息
			 */
			if (accountValue.isNew()) {
				accountValue.setExpireDate(CmLnCommonUtil.getMaxDate());
				accountValue.setState(CmConstants.RecordState.TEMP);
				if (TenantIDFactory.getTenantId().equalsIgnoreCase(TenantId.TENANT_91)) {
					accountValue.setState(CmConstants.RecordState.USE);
				}
				// 如果没有设置账户编号，则设置账户编号
				if (accountValue.getAcctId() <= 0) {
					// 为了更加通用，这里需要将具体的数据容器实例化，并将前台输入的客户资料拷贝到该数据容器中，调用通用的序列获取服务获取序列。
					BOCmAccountBean accountBean = new BOCmAccountBean();

					// 生成账户ID时,调用平台方法获取随机的RegionId
					String regionId = CmCommonUtil.getDefaultRegionId();
					accountValue.setRegionId(regionId);

					accountBean.copy(accountValue);
					accountValue.setAcctId(CmCommonUtil.getNewSequence(accountBean));
				}
				// 设置账户状态.
				if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_STATUS, String.valueOf(accountValue.getAcctStatus())) == null) {
					accountValue.setAcctStatus(CmConstants.AccountStatus.NORMAL);
				}
			} else if (accountValue.isDeleted()) {
				// 先设置为Old状态，然后再删除，确保所有的属性都会被记录为历史。
				accountValue.setStsToOld();
				// 逻辑删除
				accountValue.setState(CmConstants.RecordState.ERASE);
				accountValue.setExpireDate(ServiceManager.getOpDateTime());
			} else if (accountValue.isModified()) {
				if (CmConstants.RecordState.ERASE.equals(accountValue.getState())) {
					// 设置失效日期
					accountValue.setExpireDate(CmCommonUtil.getNextBillDate());
				}
			}
			// 设置默认值
			setCommonValue(accountValue);
			// 设置账户信用额度
			// 如果做新增或是修改不重新设置账户信用额度
			if (accountValue.isModified() || accountValue.isNew()) {
				long acctCreditValue = accountValue.getCreditValue();
				accountValue.setCreditValue(acctCreditValue * 100);
			}

		}
	}

	/**   
	 * 设置联系人信息的默认属性
	 * @Function setDefaultContactValue
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:36:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void setDefaultContactValue(IVOAccountValue acctValue) throws Exception {

	}

	/**   
	 * 设置账户支付方式信息的默认属性
	 * @Function setDefaultAccountPayment
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:44:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void setDefaultAccountPayment(IVOAccountValue acctValue) throws Exception {
		if (acctValue.hasPayments()) {
			IAcctPaymentValue[] acctPaymentValues = acctValue.getPayments();

			ICmAccountSV accountSV = CmServiceFactory.getAccountSV();

			// 获取系统当前对支付方案生效的处理方式开关【默认：立即生效】
			IBOBsStaticDataValue validTypeDataValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.SYSTEM_SWITCH,
					CmConstants.CmStaticDataCodeType.ACCT_PAYMENT_VALID_TYPE_CONTROL);
			String validType = CmConstants.CmStaticDataCodeType.ACCT_PAYMENT_VALID_TYPE_0; // 立即生效

			if (CmCommonUtil.isNotEmptyObject(validTypeDataValue)) {
				validType = validTypeDataValue.getCodeName();
			}

			Timestamp nextBillDate = CmCommonUtil.getNextBillDate();// 下周期生效

			for (IAcctPaymentValue acctPaymentValue : acctPaymentValues) {
				// 没有任何值变化的跳过
				if (!acctPaymentValue.isNew() && !acctPaymentValue.isModified() && !acctPaymentValue.isDeleted()) {
					continue;
				}
				// 新增
				if (acctPaymentValue.isNew()) {
					if (acctPaymentValue.getAcctId() <= 0) {
						acctPaymentValue.setAcctId(acctValue.getAcctId());
					}
					// 取序列号
					acctPaymentValue.setPaymentId((CmCommonUtil.getNewSequence(BOCmAcctPaymentBean.class)));
				} else if (acctPaymentValue.isModified()) { // 修改
					// 查询老的支付方案出来
					IAcctPaymentValue[] oldPaymentValues = accountSV.queryAcctPaymentByCondition(acctPaymentValue.getAcctId(), -1, -1);
					// 更改人：kangzk 时间：2012、11、5 更改原因：如果支付方案为空对象oldPaymentValues[0]取值会包空指针 如果老的支付方案不存在，则报错
					if (oldPaymentValues == null || oldPaymentValues.length <= 0) {
						log.error("AbstractAccountDeal:" + oldPaymentValues);
						ExceptionUtil.throwBusinessException("CMS0030186");// 数据有误，请检查!
					}
					IAcctPaymentValue oldPaymentValue = oldPaymentValues[0];
					// 根据不同的支付方案生效方式处理
					if (CmConstants.CmStaticDataCodeType.ACCT_PAYMENT_VALID_TYPE_1.equals(validType)) {// 如果系统当前的处理方式为下周期生效，则将老的记录的失效时间修改为下周期失效。
						// 下周期时，对原来的支付方式做修改失效日期处理，然后新增一条下周期生效的支付方案
						oldPaymentValue.setExpireDate(nextBillDate);
						oldPaymentValue.setState(CmConstants.RecordState.USE);
						// 设置默认值
						setCommonValue(oldPaymentValue);
						// 将老数据添加到大对象中
						acctValue.addPayment(oldPaymentValue);
						// 新增一条
						acctPaymentValue.setAcctId(oldPaymentValue.getAcctId());
						acctPaymentValue.setPaymentId(CmCommonUtil.getNewSequence(BOCmAcctPaymentBean.class));
						acctPaymentValue.setEffectiveDate(nextBillDate);
						acctPaymentValue.setStsToNew();
					} else {// 立即生效时，则直接修改记录
						DataContainerFactory.copyNoClearData(acctPaymentValue, oldPaymentValue);
						acctPaymentValue.copy(oldPaymentValue);
					}
				}
				// 根据不同支付方式设置对应的支付方式信息
				setPayMethod(acctPaymentValue, acctValue);
				// 设置默认值
				setCommonValue(acctPaymentValue);
			}
		}
	}

	/**   
	 * 根据不同支付方式设置对应的支付方式信息
	 * 
	 * @Function setPayMethod
	 * @Description 
	 *
	 * @param acctPaymentValue
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-8-1 下午3:20:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-8-1     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void setPayMethod(IAcctPaymentValue acctPaymentValue, IVOAccountValue acctValue) throws Exception;

	/**   
	 * 设置账户客户化帐单定制信息的默认属性
	 * @Function setDefaultBillCustomize
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:45:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void setDefaultBillCustomize(IVOAccountValue acctValue) throws Exception {
		if (acctValue.hasBillCustomizes()) {
			IAcctBillCustomizeValue[] billCustomizeValues = acctValue.getBillCustomizes();
			ICmAccountSV accountSV = CmServiceFactory.getAccountSV();
			for (int i = 0; i < billCustomizeValues.length; i++) {
				if (billCustomizeValues[i].isNew()) {
					billCustomizeValues[i].setAcctId(acctValue.getAcctId());
					billCustomizeValues[i].setCustomizeId((CmCommonUtil.getNewSequence(BOCmBillCustomizeBean.class)));
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						billCustomizeValues[i].setCreateOpId(ServiceManager.getUser().getID());
						billCustomizeValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(billCustomizeValues[i].getRegionId())) {
						billCustomizeValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					if (StringUtils.isBlank(billCustomizeValues[i].getState())) {
						billCustomizeValues[i].setState(CmConstants.RecordState.USE);
					}
				} else if (billCustomizeValues[i].isDeleted()) {
					billCustomizeValues[i].setState(CmConstants.RecordState.ERASE);
					billCustomizeValues[i].setStsToOld();
					billCustomizeValues[i].delete();
				} else if (billCustomizeValues[i].isModified()) {// add by yandong 2012/5/1 16:55
					// 投递方式变更
					if (billCustomizeValues[i].isPropertyModified(IAcctBillCustomizeValue.S_MailType)) {
						IBOBsStaticDataValue bsStaticDataValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.SYSTEM_SWITCH,
								CmConstants.CmStaticDataCodeType.ACCT_BILL_MAIL_VALID_TYPE_CONTROL);
						long customizeId = billCustomizeValues[i].getCustomizeId();
						IAcctBillCustomizeValue oldBillCustomizeValue = new AcctBillCustomizeBean();
						IAcctBillCustomizeValue billCustomizeValue = accountSV.queryBillCustomizeById(customizeId);
						if (billCustomizeValue == null) {
							// 数据有误，请检查!
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0030186"));
							}
							ExceptionUtil.throwBusinessException("CMS0030186");
						}
						oldBillCustomizeValue.copy(billCustomizeValue);
						if (bsStaticDataValue != null && bsStaticDataValue.getCodeName().equals(CmConstants.CmStaticDataCodeType.ACCT_BILL_MAIL_VALID_TYPE_1)) {
							// 下周期生效
							Timestamp nextBillDate = CmCommonUtil.getNextBillDate();
							oldBillCustomizeValue.setExpireDate(nextBillDate);
							acctValue.addBillCustomize(oldBillCustomizeValue);
							// 账单投递方式 下周期生效的处理 暂未实现
							// 需要时再添加
						} else {// 立即生效
							oldBillCustomizeValue.setState(CmConstants.RecordState.ERASE);
							oldBillCustomizeValue.setExpireDate(ServiceManager.getOpDateTime());
							oldBillCustomizeValue.setDoneCode(ServiceManager.getDoneCode());
							oldBillCustomizeValue.setStsToOld();
							oldBillCustomizeValue.delete();
							acctValue.addBillCustomize(oldBillCustomizeValue);
							billCustomizeValues[i].setEffectiveDate(oldBillCustomizeValue.getExpireDate());
							billCustomizeValues[i].setContFax(oldBillCustomizeValue.getContFax());
							billCustomizeValues[i].setCustomizeId((CmCommonUtil.getNewSequence(BOCmBillCustomizeBean.class)));
							// 设置创建操作员编号、创建操作员组织编号。
							if (ServiceManager.getUser() != null) {
								billCustomizeValues[i].setCreateOpId(ServiceManager.getUser().getID());
								billCustomizeValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
							}
							// 设置地市
							if (StringUtils.isBlank(billCustomizeValues[i].getRegionId())) {
								billCustomizeValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
							}
							// 设置记录状态
							if (StringUtils.isBlank(billCustomizeValues[i].getState())) {
								billCustomizeValues[i].setState(CmConstants.RecordState.USE);
							}
							billCustomizeValues[i].setDoneCode(ServiceManager.getDoneCode());
							billCustomizeValues[i].setStsToNew();
						}

					}
				}
			}
		}
	}

	/**   
	 * 设置账户账期信息的默认属性
	 * @Function setDefaultBillCycle
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-27 下午7:16:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-27     zhangyin          v1.0.0               修改原因<br>
	 */
	protected void setDefaultBillCycle(IVOAccountValue acctValue) throws Exception {
		if (acctValue.hasBillCycle()) {
			IAcctBillCycleValue[] billCycleValues = acctValue.getBillCycles();
			for (int i = 0; i < billCycleValues.length; i++) {
				if (billCycleValues[i].isNew()) {
					if (billCycleValues[i].getAcctId() <= 0) {
						billCycleValues[i].setAcctId(acctValue.getAcctId());
					}
					billCycleValues[i].setCycleId(CmCommonUtil.getNewSequence(BOCmAcctBillCycleBean.class));
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						billCycleValues[i].setCreateOpId(ServiceManager.getUser().getID());
						billCycleValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(billCycleValues[i].getRegionId())) {
						billCycleValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					if (StringUtils.isBlank(billCycleValues[i].getState())) {
						billCycleValues[i].setState(CmConstants.RecordState.USE);
					}
					if (billCycleValues[i].getBillDay() <= 0) {
						billCycleValues[i].setBillDay(CmConstants.AcctBillCycleDay.DEFAULT_DAY);
					}
					if (billCycleValues[i].getCycleUnit() <= 0) {
						billCycleValues[i].setCycleUnit(1);
					}
				} else if (billCycleValues[i].isDeleted()) {
					billCycleValues[i].setState(CmConstants.RecordState.ERASE);
					billCycleValues[i].setStsToOld();
					billCycleValues[i].delete();
				}
			}
		} else {
			// 如果是新增账户时没有设置具体的账期信息则需要设置一个默认的账期
			if (CmCommonUtil.isNotEmptyObject(acctValue.getAccount()) && acctValue.getAccount().isNew()) {
				IAcctBillCycleValue defaultBillCycleValue = new AcctBillCycleBean();
				defaultBillCycleValue.setCycleId(CmCommonUtil.getNewSequence(BOCmAcctBillCycleBean.class));
				defaultBillCycleValue.setAcctId(acctValue.getAccount().getAcctId());
				defaultBillCycleValue.setCycleType(CmConstants.AcctBillCycleType.MONTH);
				defaultBillCycleValue.setBillDay(CmConstants.AcctBillCycleDay.DEFAULT_DAY);
				defaultBillCycleValue.setCycleUnit(1);
				defaultBillCycleValue.setState(CmConstants.RecordState.USE);
				if (ServiceManager.getUser() != null) {
					defaultBillCycleValue.setCreateOpId(ServiceManager.getUser().getID());
					defaultBillCycleValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
				}
				defaultBillCycleValue.setRegionId(acctValue.getAccount().getRegionId());
				defaultBillCycleValue.setEffectiveDate(CmCommonUtil.getSysDate());
				defaultBillCycleValue.setExpireDate(TimeUtil.getMaxExpire());
			}
		}
	}

	protected void setDefaultAttrValue(IVOAccountValue acctValue) throws Exception {
		if (acctValue.hasAttrValues()) {
			DataContainerInterface[] attrValues = acctValue.getAttrValues();
			for (int i = 0; i < attrValues.length; i++) {
				if (attrValues[i].isNew()) {
					if (attrValues[i].getAsLong(IBOCmAccountAttrValue.S_AcctId) <= 0) {
						attrValues[i].set(IBOCmAccountAttrValue.S_AcctId, acctValue.getAcctId());
					}
				}
			}
		}
	}

	/**   
	 * 在处理业务之前的业务
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:48:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected abstract void processBeforeDeal(IVOAccountValue acctValue) throws Exception;

	/**   
	 * 处理账户信息
	 * @Function dealAccount
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:50:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void dealAccount(IVOAccountValue acctValue) throws Exception {
		// 给账户对象赋值
		if (acctValue.getAccount() != null) {
			IAccountValue accountValue = acctValue.getAccount();
			// 跳过没有任何值变化的情况
			if (!accountValue.isNew() && !accountValue.isModified() && !accountValue.isDeleted()) {
				return;
			}
			BOCmAccountBean cmAcctValue = new BOCmAccountBean();
			cmAcctValue.copy(acctValue.getAccount());
			// 保存账户
			if (cmAcctValue.isDeleted() || cmAcctValue.isModified() || cmAcctValue.isNew()) {
				CmInnerServiceFactory.getCommonInnerSV().saveBean(cmAcctValue);
				// 回设到参数中
				accountValue.setCreateDate(cmAcctValue.getCreateDate());
				accountValue.setDoneCode(cmAcctValue.getDoneCode());
				accountValue.setDoneDate(cmAcctValue.getDoneDate());
				accountValue.setOpId(cmAcctValue.getOpId());
				accountValue.setOrgId(cmAcctValue.getOrgId());
				accountValue.setEffectiveDate(cmAcctValue.getEffectiveDate());
				accountValue.setExpireDate(cmAcctValue.getExpireDate());
			}
		}
	}

	/**   
	 * 处理联系人信息，负责联系人的增删改信息
	 * @Function dealContacts
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:54:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void dealContacts(IVOAccountValue acctValue) throws Exception {
		// // 直接调用客户联系人管理的服务处理
		// if (acctValue.hasContacts()) {
		// CmServiceFactory.getContactSV().saveAcctContact(acctValue);
		// }

		/**
		 * 1.获取paymethod。自有查客户地址，代付查party_contact
		 * 
		//		 */
		IContactValue newContactValue = null;
		if (acctValue.hasContacts()) {
			newContactValue = acctValue.getContacts()[0];
		} else {
			newContactValue = new ContactBean();
		}
		// 只有在换payer和代付换自有才同步账单地址
		long partyId = acctValue.getPayerId();
		long oldPartyId = acctValue.getOldPayerId();
		if (oldPartyId > 0 && oldPartyId != partyId) {
			int payMethod = acctValue.getPayMethod();
			if (payMethod == 1) {
				ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				IQBOCmCustContMediumAndTypeValue[] value = custSV.queryCustContactMediums(acctValue.getCustId(), CmDkConstants.CustContMedium.LEGAL_ADDRESS, -1, -1, -1);
				if (value != null && value.length > 0) {
					// 新的地址信息
					newContactValue.setContAddress(String.valueOf(value[0].getAddressId()));
					newContactValue.setRemarks(value[0].getAddressDetail());

				}
			} else {
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				IBOCmPartyContactValue[] PartyContactValue = partySV.queryPartyContact(acctValue.getPayerId());
				if (PartyContactValue != null && PartyContactValue.length > 0) {
					// 新的地址信息
					newContactValue.setContAddress(PartyContactValue[0].getContAddress());
					newContactValue.setRemarks(PartyContactValue[0].getRemarks());
				}

			}
		}

		acctValue.addContact(newContactValue);
	}

	/**   
	 * 处理账户支付方式信息，主要负责账户支付方式信息的增加删改操作。
	 * @Function dealAccountPayment
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:57:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void dealAccountPayment(IVOAccountValue acctValue) throws Exception {
		if (acctValue.hasPayments()) {
			IAcctPaymentValue[] acctPaymentValues = acctValue.getPayments();
			Map tempMap = new HashMap();
			List list = new ArrayList();
			for (int i = 0; i < acctPaymentValues.length; i++) {
				// 跳过没有变化的数据
				if (acctValue.getCustId() > 0) {
					CmLnCommonUtil.dealBankContract(CmCommonUtil.getCustType(acctValue.getCustId()), acctPaymentValues[i]);
				}
				if (!acctPaymentValues[i].isNew() && !acctPaymentValues[i].isModified() && !acctPaymentValues[i].isDeleted()) {
					continue;
				}
				BOCmAcctPaymentBean cmAcctPaymentValue = new BOCmAcctPaymentBean();
				cmAcctPaymentValue.copy(acctPaymentValues[i]);
				tempMap.put(acctPaymentValues[i].getPaymentId(), acctPaymentValues[i]);
				list.add(cmAcctPaymentValue);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) list.toArray(new BOCmAcctPaymentBean[0]));
			// 回设
			Iterator it = list.iterator();
			while (it.hasNext()) {
				BOCmAcctPaymentBean bean = (BOCmAcctPaymentBean) it.next();
				IAcctPaymentValue paymentValue = (IAcctPaymentValue) tempMap.get(bean.getPaymentId());
				paymentValue.setCreateDate(bean.getCreateDate());
				paymentValue.setDoneCode(bean.getDoneCode());
				paymentValue.setDoneDate(bean.getDoneDate());
				paymentValue.setOpId(bean.getOpId());
				paymentValue.setOrgId(bean.getOrgId());
				paymentValue.setEffectiveDate(bean.getEffectiveDate());
				paymentValue.setExpireDate(bean.getExpireDate());
			}
		}
	}

	/**   
	 * 处理账户客户化帐单定制信息，主要负责账户客户化帐单定制信息的增加删改操作。
	 * @Function dealBillCustomize
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:58:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void dealBillCustomize(IVOAccountValue acctValue) throws Exception {
		if (acctValue.hasBillCustomizes()) {
			IAcctBillCustomizeValue[] billCustomizeValues = acctValue.getBillCustomizes();
			Map tempMap = new HashMap();
			List list = new ArrayList();
			for (int i = 0; i < billCustomizeValues.length; i++) {
				// 跳过没有变化的数据
				if (!billCustomizeValues[i].isNew() && !billCustomizeValues[i].isModified() && !billCustomizeValues[i].isDeleted()) {
					continue;
				}
				BOCmBillCustomizeBean customizeBean = new BOCmBillCustomizeBean();
				customizeBean.copy(billCustomizeValues[i]);
				tempMap.put(billCustomizeValues[i].getCustomizeId(), billCustomizeValues[i]);
				list.add(customizeBean);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) list.toArray(new BOCmBillCustomizeBean[0]));
			// 回设
			Iterator it = list.iterator();
			while (it.hasNext()) {
				BOCmBillCustomizeBean bean = (BOCmBillCustomizeBean) it.next();
				IAcctBillCustomizeValue customizeValue = (IAcctBillCustomizeValue) tempMap.get(bean.getCustomizeId());
				customizeValue.setCreateDate(bean.getCreateDate());
				customizeValue.setDoneCode(bean.getDoneCode());
				customizeValue.setDoneDate(bean.getDoneDate());
				customizeValue.setOpId(bean.getOpId());
				customizeValue.setOrgId(bean.getOrgId());
				customizeValue.setEffectiveDate(bean.getEffectiveDate());
				customizeValue.setExpireDate(bean.getExpireDate());
			}

			IVOCustValue custValue = new VOCustBean();
			custValue.addAccount(acctValue);
			// 处理同步客户资料给Billing
			// CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(custValue, null);
		}
	}

	/**   
	 * 处理账户账期信息，主要负责账户账期信息的增加删改操作。
	 * @Function dealBillCycle
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-27 下午7:20:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-27     zhangyin          v1.0.0               修改原因<br>
	 */
	protected void dealBillCycle(IVOAccountValue acctValue) throws Exception {
		if (acctValue.hasBillCycle()) {
			// log.error("***********************************Get arrival of data***************************************");
			IAcctBillCycleValue[] billCycleValues = acctValue.getBillCycles();
			Map tempMap = new HashMap();
			List list = new ArrayList();
			ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
			for (int i = 0; i < billCycleValues.length; i++) {
				// log.error("***********************************Traversing the account data****************************************");
				// 跳过没有变化的数据
				if (!billCycleValues[i].isNew() && !billCycleValues[i].isModified() && !billCycleValues[i].isDeleted()) {
					continue;
				}
				// log.error("***************************************Ready to assemble the account data******************************************");
				// 如果需要修改全部的出帐日
				if (billCycleValues[0].getModflag() > 0 && billCycleValues[0].getModflag() == 1) {
					// 查出当前客户的所有账户信息
					IBOCmCustAcctRelValue[] acctRelValue = accountSV.queryCustAcctRel(acctValue.getCustId(), -1, null, -1, -1, -1, null, -1, -1);
					List acctRelList = new ArrayList();
					List billCycleList = new ArrayList();
					// 同步客户账户信息
					for (int n = 0; n < acctRelValue.length; n++) {
						acctRelValue[n].setBillDueDate(billCycleValues[0].getBillDueDate());
						acctRelList.add(acctRelValue[n]);
					}
					// 修改所有的账期信息
					for (int n = 0; n < acctRelValue.length; n++) {
						IAcctBillCycleValue[] billCycleValue = accountSV.queryAcctBillCyclesByAcctId(acctRelValue[n].getAcctId());
						if (billCycleValue != null && billCycleValue.length > 0) {
							billCycleValue[0].setBillDueDate(billCycleValues[0].getBillDueDate());
							if (billCycleValues[0].getAcctId() == billCycleValue[0].getAcctId()) {
								billCycleValue[0].setRemarks(billCycleValues[0].getRemarks());
							}
							BOCmAcctBillCycleBean bean = new BOCmAcctBillCycleBean();
							bean.copy(billCycleValue[0]);
							billCycleList.add(bean);
							// 所有账期送billing
							acctValue.setBillCycle(billCycleValue[0]);
						}
					}

					CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) acctRelList.toArray(new BOCmCustAcctRelBean[0]));
					DataContainerInterface[] dc = (DataContainerInterface[]) billCycleList.toArray(new BOCmAcctBillCycleBean[0]);
					CmInnerServiceFactory.getCommonInnerSV().saveBeans(dc);
				} else {
					// 只需要修改当前账户
					BOCmAcctBillCycleBean billCycleBean = new BOCmAcctBillCycleBean();
					billCycleBean.copy(billCycleValues[i]);
					tempMap.put(billCycleValues[i].getCycleId(), billCycleValues[i]);
					list.add(billCycleBean);
					if (billCycleBean.isModified()) {
						ISo2CmSV so2CmSV = (ISo2CmSV) ServiceFactory.getService(ISo2CmSV.class);
						so2CmSV.updateAcctInfo4CPA(billCycleBean.getAcctId(), String.valueOf(billCycleBean.getCycleType()), String.valueOf(billCycleBean.getBillDay()));
					}
					CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) list.toArray(new BOCmAcctBillCycleBean[0]));
				}

			}

			// 回设
			Iterator it = list.iterator();
			while (it.hasNext()) {
				BOCmAcctBillCycleBean bean = (BOCmAcctBillCycleBean) it.next();
				IAcctBillCycleValue cycleValue = (IAcctBillCycleValue) tempMap.get(bean.getCycleId());
				cycleValue.setCreateDate(bean.getCreateDate());
				cycleValue.setDoneCode(bean.getDoneCode());
				cycleValue.setDoneDate(bean.getDoneDate());
				cycleValue.setOpId(bean.getOpId());
				cycleValue.setOrgId(bean.getOrgId());
				cycleValue.setEffectiveDate(bean.getEffectiveDate());
				cycleValue.setExpireDate(bean.getExpireDate());
			}
		}
	}

	/**   
	 * 处理账户扩展信息
	 * @Function dealAttrValues
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-26 下午1:59:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     zhangyin          v1.0.0               修改原因<br>
	 */
	protected void dealAttrValues(IVOAccountValue acctValue) throws Exception {
		if (acctValue.hasAttrValues()) {
			// 已经被保存了就不要在保存了。
			if (acctValue.hasUserObject("ACCOUNT_ATTR_SAVER")) {
				return;
			}
			CmServiceFactory.getEntityAttrSV().saveEntityAttrValues(acctValue.getAttrValues(), acctValue.getUserMap());
			acctValue.setUserObject("ACCOUNT_ATTR_SAVER", this.getClass().getName());
		}
	}

	/**   
	 * 保存业务记录
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午12:58:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void saveBusiLog(IVOAccountValue acctValue) throws Exception {
		CmBusiLogFactory.log(acctValue);
	}

	/**  
	 * 业务处理完成后的处理
	 * @Function processAfterDeal
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午01:00:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	protected abstract void processAfterDeal(IVOAccountValue acctValue) throws Exception;

	/**
	 * 处理其他数据<br>
	 * 该方法提供给本地化实现的扩展。<br>
	 * @Function dealOtherThings
	 * @Description 
	 *
	 * @param acctValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-11 下午1:13:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-11     zhangyin          v1.0.0               修改原因<br>
	 */
	protected abstract void dealOtherThings(IVOAccountValue acctValue) throws Exception;

	public boolean hasNotifyedBilling(long partyId, IVOAccountValue acctValue) throws Exception {
		// 判断payer是否送过billing
		ICmAccountSV service = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCMPartyAcctRelValue[] partyAcctRelValue = service.queryPartyAccRel(-1, partyId);
		if (partyAcctRelValue != null && partyAcctRelValue.length > 0) {
			for (IBOCMPartyAcctRelValue value : partyAcctRelValue) {
				if (value.getAcctId() != acctValue.getAcctId()) {
					return true;

				}

			}
		}
		return false;

	}

	/** 
	 * 后台进程，处理相关的业务。包括同步到客户资料，参与人等。默认实现通过TF框架来实现。  
	 * @Function notify
	 * @Description 
	 *
	 * @param accountValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午8:33:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	@SuppressWarnings("unchecked")
	protected void notify(IVOAccountValue accountValue) throws Exception {
		// 反向同步的账户不送billing
		if ("IS_BILLING_REVERSE_SYNC".equals(accountValue.getUserObject("REMARKS"))) {
			return;
		}
		ICmAccountSV service = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		// 上发数据值I表
		if (accountValue.getBillCycles().length == 0) {
			long acctId = accountValue.getAccount().getAcctId();
			IAcctBillCycleValue[] values = service.queryAcctBillCyclesByAcctId(acctId);
			if (values.length > 0) {
				accountValue.setBillCycle(values[0]);
			}
		}
		// 同步合同和账户的关系
		if (accountValue.getAccount() != null) {
			String argId = accountValue.getAccount().getAcctPassword();
			long argeemnetId = 0;
			if (StringUtils.isNotBlank(argId) && StringUtils.isNumeric(argId)) {
				argeemnetId = DataType.getAsLong(argId);
			}
			if (accountValue.getAccount().isNew()) {
				if (argeemnetId > 0) {
					IAcctAgreemnetRelValue acctAgrRel = new AcctAgreemnetRelBean();
					acctAgrRel.setAgreementId(DataType.getAsLong(argId));
					acctAgrRel.setAcctId(accountValue.getAcctId());
					acctAgrRel.setTenantId(ServiceManager.getUser().getTenantId());
					// 页面只有新增操作
					acctAgrRel.setOperType(AcctAgreemnetRelBean.ADD);
					acctAgrRel.setExtAttr("EXPIRE_DATE", TimeUtil.getMaxExpire());
					acctAgrRel.setValidDate(accountValue.getAccount().getDoneDate());
					acctAgrRel.setCommitDate(accountValue.getAccount().getDoneDate());
					accountValue.addAcctAgrRelValue(acctAgrRel);
				}
			}
		}
		long partyId = accountValue.getPayerId();
		long oldPartyId = accountValue.getOldPayerId();
		Map result1 = new HashMap();
		if (partyId > 0) {
			result1 = prepareNotifyIPayer(accountValue, partyId);
		}

		// 账户关系信息
		List payerAcctRelList = new ArrayList();
		Map payerAcctRelMap = new HashMap();
		payerAcctRelMap.put("PAYER_ID", partyId);
		payerAcctRelMap.put("ACCT_ID", accountValue.getAccount().getAcctId());
		payerAcctRelMap.put("RELATIONSHIP_TYPE", 0);
		IBOCMPartyAcctRelValue[] value = service.queryPartyAccRel(accountValue.getAccount().getAcctId(), -1);
		if (value != null && value.length > 0) {
			payerAcctRelMap.put("VALID_DATE", value[0].getEffectiveDate());
		} else {
			payerAcctRelMap.put("VALID_DATE", ServiceManager.getOpDateTime());
		}

		payerAcctRelMap.put("COMMIT_DATE", ServiceManager.getOpDateTime());
		payerAcctRelMap.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
		payerAcctRelMap.put("TENANT_ID", TenantIDFactory.getTenantId());
		payerAcctRelMap.put("DONE_CODE", ServiceManager.getDoneCode());
		payerAcctRelMap.put("OP_ID", accountValue.getAccount().getCreateOpId());
		payerAcctRelMap.put("ORG_ID", accountValue.getAccount().getCreateOrgId());

		if (accountValue.getAccount().isNew() && accountValue.getPayMethod() == 2
				&& accountValue.getAccount().getInstallmentFlag() != CmConstants.InstallmentFlag.New_Installment_Account) {
			if (result1.size() > 0) {
				accountValue.setUserObject("I_PAYER", result1.get("I_PAYER"));
			}

			// 新增关系
			payerAcctRelMap.put("OPER_TYPE", 1);
			payerAcctRelList.add(payerAcctRelMap);
			accountValue.setUserObject("I_PAYER_ACCT_REL", payerAcctRelList);

		}

		// updateAcctCredit(accountValue);
		// 只有客管内部修改账户才上发
		updateAccountSend(accountValue);

		// 自有账户或者新分期账户不送billing
		if (accountValue.getPayMethod() != 2
				|| (accountValue.getAccount() != null && accountValue.getAccount().getInstallmentFlag() == CmConstants.InstallmentFlag.New_Installment_Account)) {
			return;
		}

		if (accountValue.getPayMethod() == 2 && accountValue.getAccount().isNew()) {
			result1.put("I_PAYER_ACCT_REL", payerAcctRelList);
			IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
			interfaceBillCrmSV.sendMapOrderInfoToBilling(result1);
			return;

		}
		if (oldPartyId > 0 && oldPartyId != partyId && partyId > 0) {
			// 修改关系代付,payer操作
			payerAcctRelMap.put("OPER_TYPE", 1);

			Map payerAcctRelMapDelete = new HashMap();
			payerAcctRelMapDelete.put("PAYER_ID", oldPartyId);
			payerAcctRelMapDelete.put("ACCT_ID", accountValue.getAccount().getAcctId());
			payerAcctRelMapDelete.put("RELATIONSHIP_TYPE", 0);
			payerAcctRelMapDelete.put("VALID_DATE", accountValue.getUserObject("PAYER_REL_VALID_DATE"));
			payerAcctRelMapDelete.put("COMMIT_DATE", ServiceManager.getOpDateTime());
			payerAcctRelMapDelete.put("EXPIRE_DATE", ServiceManager.getOpDateTime());
			payerAcctRelMapDelete.put("TENANT_ID", TenantIDFactory.getTenantId());
			payerAcctRelMapDelete.put("OPER_TYPE", 3);
			payerAcctRelMapDelete.put("DONE_CODE", ServiceManager.getDoneCode());
			payerAcctRelMapDelete.put("OP_ID", accountValue.getAccount().getCreateOpId());
			payerAcctRelMapDelete.put("ORG_ID", accountValue.getAccount().getCreateOrgId());
			payerAcctRelList.add(payerAcctRelMapDelete);
			payerAcctRelList.add(payerAcctRelMap);

			result1.put("I_PAYER_ACCT_REL", payerAcctRelList);
			IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
			interfaceBillCrmSV.sendMapOrderInfoToBilling(result1);
			return;

		}
		if (accountValue.getPayments() != null && accountValue.getPayments().length > 0 && accountValue.getPayments()[0].isModified()
				&& "2".equals(accountValue.getPayments()[0].getOldObj("PAY_METHOD").toString()) && accountValue.getPayments()[0].getPayMethod() == 1) {
			// 删除关系代,付换自由
			// payerAcctRelMap.put("OPER_TYPE", 1);
			Map payerAcctRelMapDelete = new HashMap();
			payerAcctRelMapDelete.put("OPER_TYPE", 3);
			payerAcctRelMapDelete.put("PAYER_ID", oldPartyId);
			payerAcctRelMapDelete.put("ACCT_ID", accountValue.getAccount().getAcctId());
			payerAcctRelMapDelete.put("RELATIONSHIP_TYPE", 0);
			payerAcctRelMapDelete.put("VALID_DATE", accountValue.getUserObject("PAYER_REL_VALID_DATE"));
			payerAcctRelMapDelete.put("COMMIT_DATE", ServiceManager.getOpDateTime());
			payerAcctRelMapDelete.put("EXPIRE_DATE", ServiceManager.getOpDateTime());
			payerAcctRelMapDelete.put("TENANT_ID", TenantIDFactory.getTenantId());
			payerAcctRelMapDelete.put("DONE_CODE", ServiceManager.getDoneCode());
			payerAcctRelMapDelete.put("OP_ID", accountValue.getAccount().getCreateOpId());
			payerAcctRelMapDelete.put("ORG_ID", accountValue.getAccount().getCreateOrgId());
			payerAcctRelList.add(payerAcctRelMapDelete);
			result1.put("I_PAYER_ACCT_REL", payerAcctRelList);
			IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
			interfaceBillCrmSV.sendMapOrderInfoToBilling(result1);
			return;

		}

		saveLog(accountValue);
	}

	private Map prepareNotifyIPayer(IVOAccountValue accountValue, long partyId) throws Exception {
		Map result1 = new HashMap();
		// 判断是否已经送过Billing
		if (!hasNotifyedBilling(partyId, accountValue)) {
			// payer信息
			ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue partyValue = partySV.queryPayerByPartyId(partyId);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				List addressList = new ArrayList();
				Map temp0 = new HashMap();
				temp0.put("PAYER_ID", partyId);
				temp0.put("PAYER_TYPE", partyValue.getPartyType());
				if (partyValue.getPartyType() == 1) {
					temp0.put("FAMILY_NAMES", partyValue.getLastName());
					temp0.put("MIDDLE_NAMES", partyValue.getFirstName());
				} else {
					temp0.put("FAMILY_NAMES", partyValue.getPartyName());
					temp0.put("MIDDLE_NAMES", "");
				}

				temp0.put("BIRTHDAY", partyValue.getBirthday());
				temp0.put("ADDRESS_ID", StringUtils.trim(partyValue.getContAddress()));
				temp0.put("ADDRESS", partyValue.getRemarks());
				temp0.put("VALID_DATE", partyValue.getCreateDate());
				temp0.put("COMMIT_DATE", ServiceManager.getOpDateTime());
				temp0.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
				temp0.put("TENANT_ID", TenantIDFactory.getTenantId());
				temp0.put("ACCT_ID", accountValue.getAccount().getAcctId());
				temp0.put("DONE_CODE", ServiceManager.getDoneCode());
				temp0.put("OP_ID", accountValue.getAccount().getCreateOpId());
				temp0.put("ORG_ID", accountValue.getAccount().getCreateOrgId());
				if (partyValue.getPartyType() == 1) {
					// 个人为cpr
					temp0.put("TAX_NO", partyValue.getCertCode());
				} else {
					//集团为税号
					//根据partyId查询payer对应账户拥有者的客户的税号
					String taxId="";
					String sql="SELECT * FROM {CM_PARTY_ACCT_REL} T,{CM_GROUP_CUSTOMER} K,{CMX_GROUP_CUSTOMER} M WHERE T.PARTY_ID=K.PARTY_ID AND K.CUST_ID=M.CUST_ID and T.PARTY_ID=:partyId";
					Map parameter=new HashMap();
					parameter.put("partyId", partyId);
					DataContainer dc[]=(DataContainer[])CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
					if(dc!=null&&dc.length>0){
						taxId=dc[0].getAsString("TAX_ID");
					}
					temp0.put("TAX_NO", taxId);
					// 集团为税号
					if(null!=accountValue.getUserObject("TAX_ID")&&String.valueOf(accountValue.getUserObject("TAX_ID")).length()>0){
						temp0.put("TAX_NO", accountValue.getUserObject("TAX_ID"));
					}
				}
				
/*				IBOCmPartyContactValue[] emailContactValue = partySV.queryPartyContact(partyId);
				if(null!=emailContactValue&&emailContactValue.length>0){
					//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
					IQBOCmContactContMediumInfoValue [] emailContMediums = (IQBOCmContactContMediumInfoValue []) cmCustomerSV.queryContactContMediumInfoByContId(emailContactValue[0].getContId(),201, -1, -1);
					if(null!=emailContMediums&&emailContMediums.length>0){
						temp0.put("PAYER_EMAIL", emailContMediums[0].getEmailAddress());
					}
					
					//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
					IQBOCmContactContMediumInfoValue[] phonenumContMediums = (IQBOCmContactContMediumInfoValue[]) cmCustomerSV.queryContactContMediumInfoByContId(emailContactValue[0].getContId(),301, -1, -1);
					if(null!=phonenumContMediums&&phonenumContMediums.length>0){
						temp0.put("PHONE_NUMBER", phonenumContMediums[0].getContNumber());
					}
				}*/
				
				// 建帐户时的payer只有新增操作payer信息的修改在abstractpartyDealbusimodeimpl
				temp0.put("OPER_TYPE", 1);
				addressList.add(temp0);
				result1.put("I_PAYER", addressList);
			}
		}
		return result1;
	}

	private void saveLog(IVOAccountValue accountValue) throws Exception {
		// 客户接触
		IAccountValue acctValue = accountValue.getAccount();
		if (acctValue != null) {
			long busiId = 0L;
			String[] info;
			if (acctValue.isNew()) {
				busiId = CmBusinessOperation.CM_ACCOUNT_NEW;
				info = new String[] { "Billing account number:" + acctValue.getAcctId(), "Billing account name:" + acctValue.getAcctName() };
				CmRecordLog.saveRecord(busiId, acctValue.getCustId(), info);
			} else if (acctValue.isModified()) {
				busiId = CmBusinessOperation.CM_ACCOUNT_MOD;
				String oldAcctName = "";
				String newAcctName = "";
				if (acctValue.getOldObj(IAccountValue.S_AcctName) != null) {
					oldAcctName = acctValue.getOldObj(IAccountValue.S_AcctName).toString();
				}
				if (StringUtils.isNotBlank(acctValue.getAcctName())) {
					newAcctName = acctValue.getAcctName();
				}
				// 修改账户名才记录交互记录
				if (!oldAcctName.equals(newAcctName)) {
					info = new String[] { "Account Number:" + acctValue.getAcctId(), "Old Account Name:" + oldAcctName, "New Account Name:" + newAcctName };
					CmRecordLog.saveRecord(busiId, acctValue.getCustId(), info);
				}

			} else if (acctValue.isDeleted()) {
				busiId = CmBusinessOperation.CM_ACCOUNT_DEL;
			}

		}
	}

	/**
	 * 上发数据值I表
	 * @throws Exception
	 */
	private void updateAcctCredit(IVOAccountValue accountValue) throws Exception {
		IAccountValue acctVa = accountValue.getAccount();
		if (CmCommonUtil.isNotEmptyObject(acctVa)) {
			ICmLnAccountSV accountSV = (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
			accountSV.saveAcctCredit(acctVa);
		}
	}

	/**
	 * 只有客管内部修改账户才上发
	 * @throws Exception
	 */
	private void updateAccountSend(IVOAccountValue accountValue) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		IAccountValue acctVa = accountValue.getAccount();
		// 删除的时候做了逻辑删除，提交计费的时候需要该为删除状态
		if (null != acctVa) {
			if (StringUtils.isNotBlank(acctVa.getState()) && acctVa.getState().equalsIgnoreCase(CmConstants.RecordState.ERASE)) {
				acctVa.delete();
			}
		}

		IAcctBillCycleValue[] vals = accountValue.getBillCycles();
		if (vals != null && vals.length > 0) {
			if (StringUtils.isNotBlank(vals[0].getState()) && vals[0].getState().equalsIgnoreCase(CmConstants.RecordState.ERASE)) {
				vals[0].delete();
			}
		}
		IAcctPaymentValue[] values = accountValue.getPayments();
		if (values != null && values.length > 0) {
			if (StringUtils.isNotBlank(values[0].getState()) && values[0].getState().equalsIgnoreCase(CmConstants.RecordState.ERASE)) {
				values[0].delete();
			}
		}
		custValue.addAccount(accountValue);
		// 只有客管内部修改账户才上发
		// if (accountValue.getUserObject(CmConstants.MODIFY_ACCT_MODEL.MODIFY_ACCT_KEY) != null
		// &&
		// CmConstants.MODIFY_ACCT_MODEL.INNER_MODIFY.equals(accountValue.getUserObject(CmConstants.MODIFY_ACCT_MODEL.MODIFY_ACCT_KEY).toString()))
		// {
		// 处理同步客户资料给Billing
		CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(custValue, null);
		// }
	}

	// 处理payer信息
	private void dealPayer(IVOAccountValue accountValue) throws Exception {
		// CVS-833 新的分期账户不设置Payer
		if (accountValue.getAccount() != null && accountValue.getAccount().getInstallmentFlag() == CmConstants.InstallmentFlag.New_Installment_Account) {
			return;
		}
		// PAY_METHOD有代付变为自有,删除关系退订
		if (accountValue.getPayments() != null && accountValue.getPayments().length > 0 && accountValue.getPayments()[0].isModified()
				&& "2".equals(accountValue.getPayments()[0].getOldObj("PAY_METHOD").toString()) && accountValue.getPayments()[0].getPayMethod() == 1) {
			deletePayer(accountValue);
			addOwnPayer(accountValue);
		}
		// 更换payer
		long newPartyId = accountValue.getPayerId();
		long oldPartyId = accountValue.getOldPayerId();
		if (oldPartyId > 0 && oldPartyId != newPartyId && newPartyId > 0) {
			// 删除旧的partyaccountrel
			accountValue.setPayerId(oldPartyId);
			deletePayer(accountValue);
			accountValue.setPayerId(newPartyId);
			// 建立新的partyaccountrel
			addPayer(accountValue);
		}
		// 新增账户
		if (accountValue.getPayMethod() == 2 && accountValue.getAccount().isNew()) {
			// 如果类型为代付插入cm_party_account_rel表
			addPayer(accountValue);

		} else if (accountValue.getPayMethod() == 1 && accountValue.getAccount().isNew()) {
			addOwnPayer(accountValue);
		}
	}

	private void addOwnPayer(IVOAccountValue accountValue) throws Exception {
		long custId = accountValue.getCustId();
		long partyId = -1;
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue customerValue = custSV.queryCustomerByCustId(custId);
		if (customerValue != null) {
			partyId = customerValue.getPartyId();
		}
		ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue partyRoleValue = new BOCmPartyRoleBean();
		partyRoleValue.setPartyId(partyId);
		partyRoleValue.setRoleType(CmConstants.PartyRoleType.PAYER);
		partyRoleValue.setState(CmConstants.RecordState.USE);
		partyRoleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
		partyRoleValue.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
		partyRoleValue.setEntityId(accountValue.getCustId());
		partyRoleValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		partyRoleSV.savePartyRoleInfo(partyRoleValue);

	}

	private void addPayer(IVOAccountValue accountValue) throws Exception {
		long acctId = accountValue.getAccount().getAcctId();
		long partyId = accountValue.getPayerId();
		ICmAccountSV service2 = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		service2.addPartyAcctRel(acctId, partyId, accountValue.getAccount().getEffectiveDate());
		// 建立账户关系时设置payer角色状态为激活
		ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] roleValue = partyRoleSV.queryAllPartyRoles(partyId, CmConstants.PartyRoleType.PAYER, -1, -1);
		//有partyID，同时被选择为支付者，但是没有支付角色，就新增一条party_role 为5的记录
		if(null!=roleValue&&roleValue.length>0){
			roleValue[0].setRoleStatus(CmConstants.roleStatus.ACTIVE);
			// AI-6046 yujing 20201117
			roleValue[0].setState(CmConstants.RecordState.USE);
			BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
			bean.copy(roleValue[0]);
			bean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}else{
			BOCmPartyRoleBean partyRole_temp = addPartyRole(partyId, accountValue);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(partyRole_temp);
		}
		// 如果角色只有paryer或者联系人，送cpr订购工单
		boolean flag = true;
		IBOCmPartyRoleValue[] partyRolevalue = partyRoleSV.queryPartyRoleByPartyId(partyId);
		for (int i = 0; i < partyRolevalue.length; i++) {
			long type = partyRolevalue[i].getRoleType();
			if (type != CmConstants.PartyRoleType.PAYER && type != CmConstants.PartyRoleType.CONTACT && partyRolevalue[i].getRoleStatus() == CmConstants.roleStatus.ACTIVE) {
				// 通过partyId查询party
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				IPartyValue partyValue = partySV.queryPartyById(partyId);
				int partyValueType = partyValue.getPartyType();// 得到此时的partyType

				// 如果存在客户角色并且客户为匿名 ，flag为true，送CPR订购
				if (type == CmConstants.PartyRoleType.CUSTOMER && partyValueType == CmConstants.PartyType.INDIVIDUAL) {
					// 根据partyId查询个人客户信息
					DataContainer queryDC = new DataContainer();
					queryDC.set(ICustomerValue.S_PartyId, partyId);
					queryDC.set(ICustomerValue.S_CustType, partyValueType);
					ICustomerValue[] indivValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
					long custId = indivValues[0].getCustId();
					ICmCustomerSV cmService = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					ICustomerValue CustomerValue = cmService.queryCustomerByCustId(custId);
					// 如果是匿名，在成为payer的时候需要送cpr
					if (1 == CustomerValue.getAnonymousFlag()) {
						break;
					}
				}
				// 存在active的非payer和联系人角色
				flag = false;
				break;
			}
		}
		if (flag) {
			// OSE创建潜在客户同步创建的payer，由于缺少生日、法律地址,不能触发送CPR注册。
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
			IQBOCmPartyValue payerInfo = partySV.queryPayerByPartyId(partyId);
			if (StringUtils.isNotBlank(payerInfo.getCertCode())) {
				// 送cpr订购
				requestTaskSV.saveCustRequestTaskInfo(partyId, 4, "C");
			} else {
				if (StringUtils.isNotBlank(payerInfo.getContAddress()) && StringUtils.isNotBlank(payerInfo.getPartyName()) && payerInfo.getBirthday() != null) {
					// 送cpr订购
					requestTaskSV.saveCustRequestTaskInfo(partyId, 4, "C");
				}
			}
		}
	}
	
	public BOCmPartyRoleBean addPartyRole(Long partyId,IVOAccountValue accountValue) throws Exception {
		// 保存参与人角色信息
		BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
		bean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
		bean.setRoleType(CmConstants.PartyRoleType.PAYER);
		bean.setEntityId(partyId);
		bean.setPartyId(partyId);
		bean.setRegionId(CmCommonUtil.getDefaultRegionId());
		bean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
		bean.setState(CmConstants.RecordState.USE);
		bean.setCreateOpId(ServiceManager.getUser().getID());
		bean.setOpId(ServiceManager.getUser().getID());
		bean.setCreateOrgId(ServiceManager.getUser().getOrgId());
		bean.setOrgId(ServiceManager.getUser().getOrgId());
		bean.setDoneCode(accountValue.getAccount().getDoneCode());
		bean.setEffectiveDate(accountValue.getAccount().getEffectiveDate());
		bean.setExpireDate(accountValue.getAccount().getExpireDate());
		return bean;
	}

	private void deletePayer(IVOAccountValue accountValue) throws Exception, AIException {
		/*
		 * 1.删除Party_Acct_Rel
		 * 2.满足条件退订cpr
		 */
		long acctId = accountValue.getAcctId();
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		// 一个acctId只有一条代付记录
		// 删除partyAcctRel
		IBOCMPartyAcctRelValue[] partyAcctValue = accountSV.queryPartyAccRel(acctId, -1);
		// 如果不存在直接返回(选择payer之后再选择一次payer场景)
		if (partyAcctValue == null || partyAcctValue.length <= 0) {
			return;
		}
		long partyId = partyAcctValue[0].getPartyId();
		// 账户关系的生效时间送payer使用
		accountValue.setUserObject("PAYER_REL_VALID_DATE", partyAcctValue[0].getDoneDate());
		partyAcctValue[0].getCreateDate();
		BOCMPartyAcctRelBean bean = new BOCMPartyAcctRelBean();
		bean.copy(partyAcctValue[0]);
		bean.setState(CmConstants.RecordState.ERASE);
		bean.initPropertyOld("REGION_ID", CmCommonUtil.getDefaultRegionId());
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonBusiLog(CmConstants.BusiLogId.PAYER, new DataContainer[] { bean }, CmConstants.BusiLogType.PARTY_LOG, bean.getPartyId());
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] PartyRoleVaule = partyRoleSV.queryPartyRole(partyId, CmConstants.PartyRoleType.PAYER, -1, -1);
		if (PartyRoleVaule == null || PartyRoleVaule.length <= 0) {
			throw new Exception("Abnormal Data! The Payer Does Not Has A Role Of Payer!");
		}

		IBOCMPartyAcctRelValue[] temp = accountSV.queryPartyAccRel(-1, partyId);
		// 没有与其他账户关联
		if (temp == null || temp.length == 0) {

			// 送billing删除IPayer
			// payer信息
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue partyValue = partySV.queryPayerByPartyId(partyId);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				List addressList = new ArrayList();
				Map temp0 = new HashMap();
				temp0.put("PAYER_ID", partyId);
				temp0.put("PAYER_TYPE", partyValue.getPartyType());
				if (partyValue.getPartyType() == 1) {
					temp0.put("FAMILY_NAMES", partyValue.getLastName());
					temp0.put("MIDDLE_NAMES", partyValue.getFirstName());
				} else {
					temp0.put("FAMILY_NAMES", partyValue.getPartyName());
					temp0.put("MIDDLE_NAMES", "");
				}
				temp0.put("MIDDLE_NAMES", partyValue.getFirstName());
				temp0.put("BIRTHDAY", partyValue.getBirthday());
				temp0.put("ADDRESS_ID", StringUtils.trim(partyValue.getContAddress()));
				temp0.put("VALID_DATE", partyValue.getCreateDate());
				temp0.put("COMMIT_DATE", ServiceManager.getOpDateTime());
				temp0.put("EXPIRE_DATE", ServiceManager.getOpDateTime());
				temp0.put("TENANT_ID", TenantIDFactory.getTenantId());
				temp0.put("ACCT_ID", accountValue.getAccount().getAcctId());
				temp0.put("DONE_CODE", ServiceManager.getDoneCode());
				temp0.put("OP_ID", accountValue.getAccount().getCreateOpId());
				temp0.put("ORG_ID", accountValue.getAccount().getCreateOrgId());
				if (partyValue.getPartyType() == 1) {
					// 个人为cpr
					temp0.put("TAX_NO", partyValue.getCertCode());
				} else {
					// 集团为税号
					temp0.put("TAX_NO", accountValue.getUserObject("TAX_ID"));
				}
				// 删除IPayer
				temp0.put("OPER_TYPE", 3);
				addressList.add(temp0);
				Map result1 = new HashMap();
				result1.put("I_PAYER", addressList);
				IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
				interfaceBillCrmSV.sendMapOrderInfoToBilling(result1);
				// 设置角色状态为非激活
				BOCmPartyRoleBean partyRoleBean = new BOCmPartyRoleBean();
				partyRoleBean.copy(PartyRoleVaule[0]);
				partyRoleBean.setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
				partyRoleBean.setState(CmConstants.RecordState.ERASE);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(partyRoleBean);
				
				if (partyRoleSV.IsPartyRoleUnique(partyId, CmConstants.PartyRoleType.PAYER)) {
					//处理cm_party
					IPartyValue cmPartyValue = partySV.queryPartyById(partyId);
					cmPartyValue.setState(CmConstants.RecordState.ERASE);
					cmPartyValue.setCertCode(null);
					cmPartyValue.setExpireDate(CmCommonUtil.getSysDate());
					partySV.saveParty(cmPartyValue);
				}
			}

			/*
			 * 满足两个条件退订cpr
			 * 1只有一个角色且角色为payer，同时角色状态为inactive
			 * 2没有与其他账户关联
			 */
			if (!partyRoleSV.IsPartyRoleUnique(partyId, CmConstants.PartyRoleType.PAYER)) {
				return;
			}
			// 送cpr退购
			ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
			requestTaskSV.saveCustRequestTaskInfo(partyId, 1, "C");

		}
	}
}
