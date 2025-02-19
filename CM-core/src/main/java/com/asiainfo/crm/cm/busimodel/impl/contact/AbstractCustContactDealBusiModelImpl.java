package com.asiainfo.crm.cm.busimodel.impl.contact;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFamilyContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivContactBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.common.ResUserInfo;

/**   
 * 客户联系人信息业务处理类。该类实现客户联系人的新增、修改、删除等操作。
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-19 下午1:51:28
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
 */
public abstract class AbstractCustContactDealBusiModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	private transient static Log log = LogFactory.getLog(AbstractCustContactDealBusiModelImpl.class);

	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOCustValue custValue = (IVOCustValue) valueObject;
		CmCommonUtil.convertName(custValue.getContacts());
		/*
		 * 验证客户对象信息
		 */
		validate(custValue);
		/*
		 * 设置默认属性值
		 */
		setDefaultValue(custValue);
		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(custValue);

		/*
		 * 如果有联系人信息，则处理联系人 信息
		 */
		if (custValue.hasContacts()) {
			dealContacts(custValue);
		}
		/*
		 * 处理扩展属性
		 */
		dealAttrValues(custValue);
		/*
		 * 处理其他业务
		 */
		dealOtherThings(custValue);

		notify(custValue);
		/*
		 * 记录业务日志
		 */
		saveBusiLog(custValue);
		/*
		 * 业务处理之后的操作
		 */
		processAfterDeal(custValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010005"));
		return returnData;
	}

	private void setDefaultValue(IVOCustValue custValue) throws Exception {
		setDefaultContactValue(custValue);
		/*
		 * 设置客户属性
		 */
		setDefaultAttrValue(custValue);

		/*
		 * 设置其他的属性
		 */
		setOtherDefaultValue(custValue);
	}

	/**   
	 * 设置客户属性
	 * @Function setDefaultAttrValue
	 * @Description 
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-20 下午4:47:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void setDefaultAttrValue(IVOCustValue custValue) throws Exception;

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
	protected abstract void setOtherDefaultValue(IVOCustValue custValue) throws Exception;

	/**   
	 * 处理联系人信息，负责联系人的增删改信息
	 * @Function dealContacts
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:31:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealContacts(IVOCustValue custValue) throws Exception {
		/*
		 * 处理联系人的参与人信息
		 */
		dealParties(custValue);
		/*
		 * 处理客户与联系人关系
		 */
		dealCustContacts(custValue);
	}

	/**   
	 * 处理客户属性信息
	 * @Function dealAttrValues
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-20 下午4:50:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealAttrValues(IVOCustValue custValue) throws Exception {
		if (custValue.hasAttrValues()) {
			// 已经被保存了就不要在保存了。
			if (custValue.hasUserObject("CUST_ATTR_SAVER")) {
				return;
			}
			CmServiceFactory.getEntityAttrSV().saveEntityAttrValues(custValue.getAttrValues(), custValue.getUserMap());
			custValue.setUserObject("CUST_ATTR_SAVER", this.getClass().getName());
		}
	}

	/**   
	 * 处理客户与联系人关系
	 * @Function dealCustContacts
	 * @Description 
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午2:40:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected void dealCustContacts(IVOCustValue custValue) throws Exception {
		if (custValue.hasContacts()) {
			IContactValue[] contactValues = custValue.getContacts();
			List<BOCmIndivContactBean> indivContactList = new ArrayList<BOCmIndivContactBean>();
			List<BOCmFamilyContactBean> familyContactList = new ArrayList<BOCmFamilyContactBean>();
			List<BOCmGroupContactBean> groupContactList = new ArrayList<BOCmGroupContactBean>();

			for (int i = 0; i < contactValues.length; i++) {
				if (contactValues[i].getCustId() <= 0) {
					continue;
				}
				switch (CmCommonUtil.getCustType(contactValues[i].getCustId())) {
					case CmConstants.CustomerType.INDIVIDUAL:
						BOCmIndivContactBean indivContactValue = new BOCmIndivContactBean();
						indivContactValue.copy(contactValues[i]);
						// add by shitian 解决联系人关系表新增，但是联系人信息不需要
						if (indivContactValue.getCustContId() <= 0) {
							indivContactValue.setCustContId(CmCommonUtil.getNewSequence(BOCmIndivContactBean.class));
							indivContactValue.setStsToNew();
						}
						indivContactList.add(indivContactValue);
						break;
					case CmConstants.CustomerType.FAMILY:
						BOCmFamilyContactBean familyContactValue = new BOCmFamilyContactBean();
						familyContactValue.copy(contactValues[i]);
						if (familyContactValue.getCustContId() <= 0) {
							familyContactValue.setCustContId(CmCommonUtil.getNewSequence(BOCmFamilyContactBean.class));
							familyContactValue.setStsToNew();
						}
						familyContactList.add(familyContactValue);
						break;
					case CmConstants.CustomerType.GROUP:
						BOCmGroupContactBean groupContactValue = new BOCmGroupContactBean();
						groupContactValue.copy(contactValues[i]);
						if (groupContactValue.getCustContId() <= 0) {
							groupContactValue.setCustContId(CmCommonUtil.getNewSequence(BOCmGroupContactBean.class));
							groupContactValue.setStsToNew();
						}
						groupContactList.add(groupContactValue);
						break;
					default:
						break;
				}
			}
			if (CmCommonUtil.isNotEmptyObject(indivContactList)) {
				BOCmIndivContactBean[] contactBeans = indivContactList.toArray(new BOCmIndivContactBean[0]);
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactBeans);
				// 回设主键、日志信息等
				for (int i = 0; i < contactBeans.length; i++) {
					contactValues[i].setCreateDate(contactBeans[i].getCreateDate());
					contactValues[i].setDoneCode(contactBeans[i].getDoneCode());
					contactValues[i].setDoneDate(contactBeans[i].getDoneDate());
					contactValues[i].setOpId(contactBeans[i].getOpId());
					contactValues[i].setOrgId(contactBeans[i].getOrgId());
					contactValues[i].setEffectiveDate(contactBeans[i].getEffectiveDate());
					contactValues[i].setExpireDate(contactBeans[i].getExpireDate());
				}
			}
			if (CmCommonUtil.isNotEmptyObject(familyContactList)) {
				BOCmFamilyContactBean[] contactBeans = familyContactList.toArray(new BOCmFamilyContactBean[0]);
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactBeans);
				for (int i = 0; i < familyContactList.size(); i++) {
					// 回设主键、日志信息等
					contactValues[i].setCreateDate(contactBeans[i].getCreateDate());
					contactValues[i].setDoneCode(contactBeans[i].getDoneCode());
					contactValues[i].setDoneDate(contactBeans[i].getDoneDate());
					contactValues[i].setOpId(contactBeans[i].getOpId());
					contactValues[i].setOrgId(contactBeans[i].getOrgId());
					contactValues[i].setEffectiveDate(contactBeans[i].getEffectiveDate());
					contactValues[i].setExpireDate(contactBeans[i].getExpireDate());
				}
			}
			if (CmCommonUtil.isNotEmptyObject(groupContactList)) {
				BOCmGroupContactBean[] contactBeans = groupContactList.toArray(new BOCmGroupContactBean[0]);
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactBeans);
				for (int i = 0; i < groupContactList.size(); i++) {
					// 回设主键、日志信息等
					contactValues[i].setCreateDate(contactBeans[i].getCreateDate());
					contactValues[i].setDoneCode(contactBeans[i].getDoneCode());
					contactValues[i].setDoneDate(contactBeans[i].getDoneDate());
					contactValues[i].setOpId(contactBeans[i].getOpId());
					contactValues[i].setOrgId(contactBeans[i].getOrgId());
					contactValues[i].setEffectiveDate(contactBeans[i].getEffectiveDate());
					contactValues[i].setExpireDate(contactBeans[i].getExpireDate());
					// delete AO联系人需要记录交互记录
					if (CmConstants.GroupContType.AO_CONTACT == contactBeans[i].getContType()) {
						long busiId = 0L;
						if (contactBeans[i].isDeleted()) {
							busiId = CmBusinessOperation.CM_AO_CONTACT_DEL;
						}
						String[] objName = new String[] { "Administrator email:", "Administrator name:" + contactBeans[i].getCustContId() };
						CmRecordLog.saveRecord(busiId, contactBeans[i].getCustId(), objName);
					}
				}
			}
		}
	}

	/**   
	 * 处理联系人的参与人信息
	 * @Function dealParties
	 * @Description 
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-3-19 下午2:40:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealParties(IVOCustValue custValue) throws Exception {
		if (custValue.hasContacts()) {
			IContactValue[] contactValues = custValue.getContacts();
			ICmPartySV partySV = CmServiceFactory.getPartySV();
			for (int i = 0; i < contactValues.length; i++) {
				// 跳过删除的情况
				if (contactValues[i].isDeleted() || CmConstants.RecordState.ERASE.equalsIgnoreCase(contactValues[i].getState())) {
					continue;
				}
				IVOPartyValue ivoPartyValue = new VOPartyBean();
				IPartyValue partyValue = new PartyBean();
				partyValue.copy(contactValues[i]);
				if (contactValues[i].isNew()) {
					partyValue.setPartyType(CmConstants.PartyType.INDIVIDUAL);
				} else {
					partyValue.initProperty(IPartyValue.S_PartyType, CmConstants.PartyType.INDIVIDUAL);
				}
				IPartyContactValue partyContactValue = new PartyContactBean();
				partyContactValue.copy(contactValues[i]);

				ivoPartyValue.setParty(partyValue);
				ivoPartyValue.setPartyContact(partyContactValue);
				// 调用参与人处理model处理参与人信息
				partySV.saveParty(ivoPartyValue);
				contactValues[i].setPartyId(ivoPartyValue.getParty().getPartyId());
				contactValues[i].setContId(ivoPartyValue.getPartyContacts()[0].getContId());
			}
		}
	}

	/** 
	 * 后台进程，处理相关的业务。包括同步到客户资料，参与人等。默认实现通过TF框架来实现。  
	 * @Function notify
	 * @Description 
	 *
	 * @param custValue
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
	protected void notify(IVOCustValue custValue) throws Exception {
		// 处理同步客户资料给Billing
		if (custValue.getContacts().length > 0) {
			if (custValue.getContacts()[0].getDoneCode() == 0) {
				custValue.getContacts()[0].setDoneCode(ServiceManager.getDoneCode());
			}
			if (custValue.getContacts()[0].getDoneDate() == null) {
				custValue.getContacts()[0].setDoneDate(ServiceManager.getOpDateTime());
			}
			if (custValue.getContacts()[0].getEffectiveDate() == null) {
				custValue.getContacts()[0].setEffectiveDate(custValue.getContacts()[0].getCreateDate());
			}
		}

		// billing侧需要客户信息
		if (custValue.getCustomer() == null) {
			if (custValue.getContacts().length > 0) {
				for (int i = 0; i < custValue.getContacts().length; i++) {
					custValue.getContacts()[i].setEffectiveDate(custValue.getContacts()[i].getCreateDate());
					custValue.getContacts()[i].setEffectiveDate(TimeUtil.getMaxExpire());
				}
				long custId = custValue.getContacts()[0].getCustId();
				try {
					ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					ICustomerValue value = service.queryCustomerByCustId(custId);
					value.setStsToOld();
					custValue.setCustomer(value);
					CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(custValue, null);
				} catch (Exception e) {
//					log.error(e.getMessage());
				}
			}

		} else {
			CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(custValue, null);
		}
		// saveLog(custValue);
	}

	private void saveLog(IVOCustValue custValue) throws Exception {
		if (custValue.hasContacts()) {
			IContactValue[] contValues = custValue.getContacts();
			long busiId = 0L;
			if (contValues[0].isNew()) {
				busiId = CmBusinessOperation.CM_CUST_CONT_NEW;
			} else if (contValues[0].isModified()) {
				busiId = CmBusinessOperation.CM_CUST_CONT_MOD;
			} else if (contValues[0].isDeleted()) {
				busiId = CmBusinessOperation.CM_CUST_CONT_DEL;
			}
			List contIds = new ArrayList();
			List contNames = new ArrayList();
			for (int i = 0; i < contValues.length; i++) {
				contIds.add(contValues[i].getContId());
				contNames.add(contValues[i].getContName());
			}
			CmRecordLog.saveRecord(busiId, contValues[0].getCustId(), (String[]) contNames.toArray(new String[0]));
		}
	}

	/**   
	 * 业务处理完成后的处理
	 * @Function processAfterDeal
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午4:00:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processAfterDeal(IVOCustValue custValue) throws Exception;

	/**   
	 * 在处理业务之前的业务
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:55:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processBeforeDeal(IVOCustValue custValue) throws Exception;

	/**   
	 * 设置一些默认属性，如：创建操作员编号、创建操作员等。
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午2:22:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected void setDefaultContactValue(IVOCustValue custValue) throws Exception {
		if (custValue.hasContacts()) {
			IContactValue[] contactValues = custValue.getContacts();
			for (int i = 0; i < contactValues.length; i++) {
				if (contactValues[i].isNew()) {
					if (contactValues[i].getCustId() <= 0) {
						continue;
					}
					int custType = CmCommonUtil.getCustType(contactValues[i].getCustId());
					// 设置联系人关系编号
					if (contactValues[i].getCustContId() <= 0) {
						switch (custType) {
							case CmConstants.CustomerType.INDIVIDUAL:
								contactValues[i].setCustContId(CmCommonUtil.getNewSequence(BOCmIndivContactBean.class));
								break;
							case CmConstants.CustomerType.FAMILY:
								contactValues[i].setCustContId(CmCommonUtil.getNewSequence(BOCmFamilyContactBean.class));
								break;
							case CmConstants.CustomerType.GROUP:
								contactValues[i].setCustContId(CmCommonUtil.getNewSequence(BOCmGroupContactBean.class));
								break;
							default:
								// 参数错误，当前系统不存在类型为{0}的客户类型定义！
								ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(custType));
						}
					}
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						contactValues[i].setCreateOpId(ServiceManager.getUser().getID());
						contactValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(contactValues[i].getRegionId())) {
						contactValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					contactValues[i].setState(CmConstants.RecordState.USE);
				} else if (contactValues[i].isDeleted()) {
					// 先设置为Old状态，然后再删除，确保所有的属性都会被记录为历史。
					contactValues[i].initProperty(IContactValue.S_ExpireDate, ServiceManager.getOpDateTime());
					contactValues[i].initProperty(IContactValue.S_State, CmConstants.RecordState.ERASE);
					contactValues[i].setStsToOld();
					contactValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 验证客户对象 
	 * @Function validate
	 * @Description 
	 *
	 * @param custValue 客户对象信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:24:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validate(IVOCustValue custValue) throws Exception {
		// 如果是新建联系人,则需要验证该客户联系人是否已经存在,如果存在则不允许添加;
		/*
		 * 验证客户属性
		 */
		validateAttrValue(custValue);
	}

	/**   
	 * 验证属性信息
	 * @Function validateAttrValue
	 * @Description 
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-4-20 下午4:42:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validateAttrValue(IVOCustValue custValue) throws Exception;

	/**   
	 * 保存业务记录
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午4:00:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	protected void saveBusiLog(IVOCustValue custValue) throws Exception {
		CmBusiLogFactory.log(custValue);
	}

	/**
	 * 处理其他数据<br>
	 * 该方法提供给本地化实现的扩展。<br>
	 * 本地化有增加了客户扩展表，需要对扩展表进行操作等，则实现该方法，在该方法中实现对扩展表的操作。
	 * @Function dealOtherThings
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-31 下午3:41:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     zhangyin           v1.0.0               修改原因<br>
	 */
	protected abstract void dealOtherThings(IVOCustValue custValue) throws Exception;

}
