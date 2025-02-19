/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.party;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmObjectExistsException;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.inner.party.bo.BOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmOrgPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyRoleValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.common.mask.BOMaskHelper;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-19 下午4:59:37
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
 */
public abstract class AbstractPartyDealBusiModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	private transient static Log log = LogFactory.getLog(AbstractPartyDealBusiModelImpl.class);

	/**
	 * 处理流程:<br>
	 * <ol>
	 *  <li>{@link #validate(IVOPartyValue) 验证数据}</li>
	 *  <li>{@link #setDefaultValue(IVOPartyValue) 设置默认属性值}</li>
	 *  <li>{@link #processBeforeDeal(IVOPartyValue) 在调用业务处理之前的处理}</li>
	 *  <li>{@link #dealParty(IVOPartyValue) 处理参与人信息}</li>
	 *  <li>{@link #dealPartyContact(IVOPartyValue) 处理参与人联系信息}</li>
	 *  <li>{@link #dealPartyRole(IVOPartyValue) 处理参与人角色信息}</li>
	 *  <li>{@link #dealOther(IVOPartyValue) 处理其他}</li>
	 *  <li>{@link #notify(IVOPartyValue) 通知后台进程}</li>
	 *  <li>{@link #processAfterDeal(IVOPartyValue) 业务处理之后的操作}</li>
	 * </ol>
	 */
	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOPartyValue partyValue = (IVOPartyValue) valueObject;
		/*
		 * 验证数据
		 */
		validate(partyValue);
		/*
		 * 设置默认属性值
		 */
		setDefaultValue(partyValue);
		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(partyValue);
		/*
		 * 
		 */
		dealParty(partyValue);
		/*
		 * 处理参与人联系信息
		 */
		dealPartyContact(partyValue);
		/*
		 * 处理参与人角色信息
		 */
		dealPartyRole(partyValue);
		/*
		 * 处理其他
		 */
		dealOther(partyValue);
		/*
		 * 通知后台进程
		 */
		notify(partyValue);
		/*
		 * 记录业务日志
		 */
		saveBusiLog(partyValue);
		/*
		 * 业务处理之后的操作
		 */
		processAfterDeal(partyValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010005"));
		return returnData;
	}

	public void dealDefaultParty(IVOPartyValue partyValue) throws Exception {
		setDefaultValue(partyValue);
		dealParty(partyValue);
		dealPartyContact(partyValue);
		dealPartyRole(partyValue);
	}

	protected void saveBusiLog(IVOPartyValue partyValue) throws Exception {
		CmBusiLogFactory.log(partyValue);
	}

	/**   
	 * 处理其他信息
	 * @Function dealOther
	 * @Description 
	 *
	 * @param partyValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午6:24:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void dealOther(IVOPartyValue partyValue) throws Exception;

	/**   
	 * 处理参与人基本信息
	 * @Function dealParty
	 * @Description 
	 *
	 * @param partyValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午5:08:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected void dealParty(IVOPartyValue voPartyValue) throws Exception {
		IPartyValue partyValue = voPartyValue.getParty();
		if (partyValue != null) {

			// 校验参与人不能重复，如果有重复直接使用以前的
			IBOCmPartyValue[] partyValues = null;
			if (partyValue.isNew() && partyValue.getCertType() > 0 && StringUtils.isNotBlank(partyValue.getCertCode())) {
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				partyValues = partySV.queryPartyByCertTypeAndCertCode(partyValue.getCertType(), partyValue.getCertCode(), -1, -1);
			}

			BOCmPartyBean cmPartyBean = new BOCmPartyBean();
			if (partyValues == null || partyValues.length < 1) {
				cmPartyBean.copy(partyValue);
				long partyId = 0;
				if (cmPartyBean.getPartyId() == 0) {
					partyId = CmCommonUtil.getNewSequence(BOCmPartyBean.class);
					cmPartyBean.initPartyId(partyId);
					partyValue.initProperty(IPartyValue.S_PartyId, partyId);
				}else if(cmPartyBean.getPartyId() > 0){
					IPartyValue temp = CmServiceFactory.getPartySV().queryPartyById(cmPartyBean.getPartyId());
					if (temp != null) {
						cmPartyBean.initPartyId(cmPartyBean.getPartyId());
						partyValue.initProperty(IPartyValue.S_PartyId, cmPartyBean.getPartyId());
					}
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBean(cmPartyBean);
				switch (partyValue.getPartyType()) {
					case CmConstants.PartyType.INDIVIDUAL: // 处理个人类参与人
						BOCmIndivPartyBean indivPartyValue = new BOCmIndivPartyBean();
						indivPartyValue.copy(partyValue);
						CmInnerServiceFactory.getCommonInnerSV().saveBean(indivPartyValue);
						break;
					case CmConstants.PartyType.ORGANIZE: // 处理个人类参与人
						BOCmOrgPartyBean orgPartyValue = new BOCmOrgPartyBean();
						orgPartyValue.copy(partyValue);
						CmInnerServiceFactory.getCommonInnerSV().saveBean(orgPartyValue);
						break;
					default:
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0030040", String.valueOf(partyValue.getPartyType())));
						}
						ExceptionUtil.throwBusinessException("CMS0030040", String.valueOf(partyValue.getPartyType()));// 参数错误，当前系统不存在类型为{0}的参与人类型定义！
						break;
				}
			} else {
				// 如果该参与人已经存在，则赋值
				cmPartyBean.copy(partyValues[0]);
				partyValue.setPartyId(partyValues[0].getPartyId());
			}
			// 回设日志字段
			partyValue.setCreateDate(cmPartyBean.getCreateDate());
			partyValue.setDoneCode(cmPartyBean.getDoneCode());
			partyValue.setDoneDate(cmPartyBean.getDoneDate());
			partyValue.setOpId(cmPartyBean.getOpId());
			partyValue.setOrgId(cmPartyBean.getOrgId());
			partyValue.setEffectiveDate(cmPartyBean.getEffectiveDate());
			partyValue.setExpireDate(cmPartyBean.getExpireDate());
		}
	}

	/**   
	 * 处理参与人联系信息
	 * @Function dealPartyContact
	 * @Description 
	 *
	 * @param partyValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午6:21:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected void dealPartyContact(IVOPartyValue partyValue) throws Exception {
		if (partyValue.hasPartyContacts()) {
			List<BOCmPartyContactBean> list = new ArrayList<BOCmPartyContactBean>();
			IPartyContactValue[] contactValues = partyValue.getPartyContacts();
			for (int i = 0; i < contactValues.length; i++) {
				BOCmPartyContactBean contactValue = new BOCmPartyContactBean();
				contactValue.copy(contactValues[i]);
				if (contactValue.getContId() == 0) {
					long contId = CmCommonUtil.getNewSequence(BOCmPartyContactBean.class);
					contactValue.initContId(contId);
					contactValue.initRegionId(CmCommonUtil.getDefaultRegionId());
					if (contactValue.getPartyId() == 0) {
						contactValue.initPartyId(partyValue.getPartyId());
					}
				}
				list.add(contactValue);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(list.toArray(new BOCmPartyContactBean[0]));
			for (int i = 0; i < list.size(); i++) {
				BOCmPartyContactBean bean = list.get(i);
				contactValues[i].setCreateDate(bean.getCreateDate());
				contactValues[i].setDoneCode(bean.getDoneCode());
				contactValues[i].setDoneDate(bean.getDoneDate());
				contactValues[i].setOpId(bean.getOpId());
				contactValues[i].setOrgId(bean.getOrgId());
				contactValues[i].setEffectiveDate(bean.getEffectiveDate());
				contactValues[i].setExpireDate(bean.getExpireDate());
			}
		}
	}

	/**   
	 * 处理参与人角色信息
	 * @Function dealPartyRole
	 * @Description 
	 *
	 * @param partyValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午6:24:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	protected void dealPartyRole(IVOPartyValue partyValue) throws Exception {
		if (partyValue.hasPartyRoles()) {
			// 防止插入多条相同的角色信息,只有在partyValue是新增的时候才插入角色表;
			List<BOCmPartyRoleBean> list = new ArrayList<BOCmPartyRoleBean>();
			IPartyRoleValue[] partyRoleValues = partyValue.getPartyRoles();
			for (int i = 0; i < partyRoleValues.length; i++) {
				partyRoleValues[i].isNew();
				BOCmPartyRoleBean cmPartyRoleValue = new BOCmPartyRoleBean();
				cmPartyRoleValue.copy(partyRoleValues[i]);
				if (cmPartyRoleValue.getPartyRoleId() <= 0) {
					long roleId = CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class);
					cmPartyRoleValue.setPartyRoleId(roleId);
					cmPartyRoleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
					partyRoleValues[i].setPartyRoleId(roleId);
					partyRoleValues[i].setRoleStatus(CmConstants.roleStatus.ACTIVE);
				}
				cmPartyRoleValue.setStsToNew();
				cmPartyRoleValue.isNew();
				list.add(cmPartyRoleValue);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(list.toArray(new BOCmPartyRoleBean[0]));
			// 回设日志属性
			int i = 0;
			for (Iterator iterator = list.iterator(); iterator.hasNext(); i++) {
				BOCmPartyRoleBean bean = (BOCmPartyRoleBean) iterator.next();
				partyRoleValues[i].setCreateDate(bean.getCreateDate());
				partyRoleValues[i].setDoneCode(bean.getDoneCode());
				partyRoleValues[i].setDoneDate(bean.getDoneDate());
				partyRoleValues[i].setOpId(bean.getOpId());
				partyRoleValues[i].setOrgId(bean.getOrgId());
				partyRoleValues[i].setEffectiveDate(bean.getEffectiveDate());
				partyRoleValues[i].setExpireDate(bean.getExpireDate());
			}
		}

	}

	/** 
	 * 后台进程，处理相关的业务。包括同步到客户资料，参与人等。默认实现通过TF框架来实现。  
	 * @Function notify
	 * @Description 
	 *
	 * @param partyValue
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
	protected abstract void notify(IVOPartyValue partyValue) throws Exception;

	/**   
	 * 业务处理完成后的处理
	 * @Function processAfterDeal
	 * @Description 
	 *
	 * @param partyValue
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
	protected abstract void processAfterDeal(IVOPartyValue partyValue) throws Exception;

	/**   
	 * 在处理业务之前的业务
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param partyValue
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
	protected abstract void processBeforeDeal(IVOPartyValue partyValue) throws Exception;

	/**   
	 * 设置参与人的默认值
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param partyValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-3-19 下午5:02:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultValue(IVOPartyValue voPartyValue) throws Exception {
		setDefaultPartyValue(voPartyValue);
		setDefaultPartyContactsValue(voPartyValue);
		setDefaultPartyRolesValue(voPartyValue);
	}

	/**   
	 * 设置参与人基本信息
	 * @Function setDefaultPartyValue
	 * @Description 
	 *
	 * @param voPartyValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-16 上午11:13:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-16     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultPartyValue(IVOPartyValue voPartyValue) throws Exception {
		IPartyValue partyValue = voPartyValue.getParty();
		if (partyValue != null) {
			/*
			 * 如果是新建参与人，则需要设置参与人编号等
			 */
			if (partyValue.isNew()) {
				if (partyValue.getPartyId() <= 0) {
					partyValue.setPartyId(CmCommonUtil.getNewSequence(BOCmPartyBean.class));
				}
				// 设置创建操作员编号、创建操作员组织编号。
				if (ServiceManager.getUser() != null) {
					partyValue.setCreateOpId(ServiceManager.getUser().getID());
					partyValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
					// 设置地市
					if (StringUtils.isBlank(partyValue.getRegionId())) {
						partyValue.setRegionId(CmCommonUtil.getDefaultRegionId());
					}
				}
				// 设置记录状态
				partyValue.setState(CmConstants.RecordState.USE);
			} else if (partyValue.isDeleted()) {
				partyValue.setState(CmConstants.RecordState.ERASE);
				// 设置默认的地市 add by liaosc
				if (StringUtils.isBlank(partyValue.getRegionId())) {
					partyValue.initProperty(IPartyValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				}
				// 先设置为Old状态，然后再删除，确保所有的属性都会被记录为历史。
				partyValue.setStsToOld();
				partyValue.delete();
			} else if (partyValue.isModified()) {
				// 设置默认的地市 add by liaosc
				if (StringUtils.isBlank(partyValue.getRegionId())) {
					partyValue.initProperty(IPartyValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				}
			}
		}
	}

	/**   
	 * 设置参与人联系信息
	 * @Function setDefaultPartyContactsValue
	 * @Description 
	 *
	 * @param voPartyValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-16 上午11:14:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-16     huzq2           v1.0.0               修改原因<br>
	 */
	protected void setDefaultPartyContactsValue(IVOPartyValue voPartyValue) throws Exception {
		IPartyValue partyValue = voPartyValue.getParty();
		/*
		 * 设置联系人信息默认属性
		 */
		if (voPartyValue.hasPartyContacts()) {
			IPartyContactValue[] contactValues = voPartyValue.getPartyContacts();
			for (int i = 0; i < contactValues.length; i++) {
				if (contactValues[i].isNew()) {
					if (contactValues[i].getPartyId() <= 0) {
						contactValues[i].setPartyId(partyValue.getPartyId());
					}
					if (contactValues[i].getContId() <= 0) {
						contactValues[i].setContId(CmCommonUtil.getNewSequence(BOCmPartyContactBean.class));
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
					contactValues[i].setStsToOld();
					contactValues[i].setState(CmConstants.RecordState.ERASE);
					contactValues[i].setExpireDate(CmCommonUtil.getSysDate());
				} else if (contactValues[i].isModified()) {

				}
			}
		}
	}

	protected void setDefaultPartyRolesValue(IVOPartyValue voPartyValue) throws Exception {
		IPartyValue partyValue = voPartyValue.getParty();
		/*
		 * 设置参与人角色默认属性
		 */
		if (voPartyValue.hasPartyRoles()) {
			IPartyRoleValue[] partyRoleValues = voPartyValue.getPartyRoles();
			for (int i = 0; i < partyRoleValues.length; i++) {
				if (partyRoleValues[i].isNew()) {
					if (partyRoleValues[i].getPartyId() <= 0) {
						partyRoleValues[i].setPartyId(partyValue.getPartyId());
					}
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						partyRoleValues[i].setCreateOpId(ServiceManager.getUser().getID());
						partyRoleValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(partyRoleValues[i].getRegionId())) {
						partyRoleValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					partyRoleValues[i].setState(CmConstants.RecordState.USE);
				} else if (partyRoleValues[i].isDeleted()) {
					partyRoleValues[i].setState(CmConstants.RecordState.ERASE);
					partyRoleValues[i].setStsToOld();
					partyRoleValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 验证参与人信息是否符合业务规则
	 * @Function validate
	 * @Description 
	 *
	 * @param partyValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午5:01:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	private void validate(IVOPartyValue partyValue) throws Exception {
		if (partyValue == null) {
			// 传入{0}的对象为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010002", IVOPartyValue.class.getName()));
			}
			ExceptionUtil.throwBusinessException("CMS0010002", IVOPartyValue.class.getName());
		}
		validateParty(partyValue);
		validatePartyContacts(partyValue);
		validatePartyRoles(partyValue);
	}

	protected void validatePartyRoles(IVOPartyValue partyValue) {

	}

	protected void validatePartyContacts(IVOPartyValue partyValue) throws Exception {
		/*
		 * 设置联系人信息默认属性
		 */
		if (partyValue.hasPartyContacts()) {
			IPartyContactValue[] contactValues = partyValue.getPartyContacts();
			ICmPartySV partySV = CmServiceFactory.getPartySV();
			for (int i = 0; i < contactValues.length; i++) {
				if (contactValues[i].isNew() || contactValues[i].isModified()) {
					// 先查询
					// 根据参与人编号先查询当前参与人下是否已经有联系信息，如果有则做修改操作，否则新增。
					long partyId = contactValues[i].getPartyId();
					// 取参与人编号
					partyId = (partyId > 0) ? partyId : partyValue.getPartyId();
					// 如果参与人编号大于0，则验证该参与人下是否已经存在了参与联系信息，如果存在则做修改操作，否则新增。
					if (partyId > 0) {
						// 判断是否存在联系信息，如果不存在则修改为新增状态并设置初始值
						PartyContactBean conditionDC = new PartyContactBean();
						conditionDC.setPartyId(partyId);
						IPartyContactValue[] partyContactValues = null;
						try {
							// 避免查询出来的数据被模糊化，因此先设置当前这个查询不需要模糊化！
							BOMaskHelper.setOperateNotMaskFlag();
							partyContactValues = partySV.queryPartyContacts(conditionDC, -1, -1);
						} finally {
							// 查询完成之后清除禁止模糊化标识，避免对正常业务产生影响！
							BOMaskHelper.clearOperateMaskFlag();
						}
						if (CmCommonUtil.isNotEmptyObject(partyContactValues)) {
							// 先将前台输入的数据拷贝到查询出来的结果中
							DataContainerFactory.copyNoClearData(contactValues[i], partyContactValues[0]);
							// 然后再以修改后的值作为最终数据保存到数据库中
							if (!contactValues[i].hasProperty(IPartyContactValue.S_State)) {
								partyContactValues[0].setState(CmConstants.RecordState.USE);
							}
							contactValues[i].copy(partyContactValues[0]);
						} else { // 否则新增一条记录
							contactValues[i].setStsToNew();
							if (contactValues[i].getContId() <= 0) {
								contactValues[i].setContId(CmCommonUtil.getNewSequence(BOCmPartyContactBean.class));
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
						}
					}
					// 避免主键冲突，需要增加验证该cont_id对应的记录数据库中是否已经存在，如果存在则将其状态修改为修改状态
					if (contactValues[i].getContId() > 0) {
						if (CmCommonUtil.isNotEmptyObject(partySV.queryPartyContactById(contactValues[i].getContId()))) {
							contactValues[i].initProperty(IPartyContactValue.S_ContId, contactValues[i].getContId());
						} else {
							contactValues[i].setStsToNew();
						}
					}
				}
			}
		}
	}

	private void validateParty(IVOPartyValue partyValue) throws Exception {
		IPartyValue value = partyValue.getParty();
		if (value != null) {
			if (value.isNew()) {
				validateCreateParty(value);
			} else if (value.isModified()) {
				validateModifyParty(value);
			}
		}
	}

	/**   
	 * 验证修改参与人信息
	 * @Function validateModifyParty
	 * @Description 
	 *
	 * @param value
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-22 下午11:21:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-22     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateModifyParty(IPartyValue value) throws Exception {
		if (value.isPropertyModified(IPartyValue.S_PartyType)) {
			if (log.isErrorEnabled()) {
				// 参数错误：参与人类型不能被修改！
				log.error(CrmLocaleFactory.getResource("CMS0010046"));
			}
			// ExceptionUtil.throwBusinessException("CMS0030040", CrmLocaleFactory.getResource("CMS0000006"));
		}
		// 如果修改了参与人名称，验证参与人名称不能为空！
		if (value.isPropertyModified(IPartyValue.S_PartyName) && StringUtils.isBlank(value.getPartyName())) {
			// 参数错误，参数{0}不能为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0000006")));
			}
			ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0000006"));
		}
		// 如果是证件信息（标识一个参与人的属性）发生了变化，则需要验证新的证件下是否有参与人存在，如果存在则不再新增，而是合并参与人信息。
		if (value.isPropertyModified(IPartyValue.S_CertType) || value.isPropertyModified(IPartyValue.S_CertCode)) {
			// 参数错误，当前系统不存在类型为{0}的证件类型定义！
			// if (value.isPropertyModified(IPartyValue.S_CertType)
			// && StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_CERT_TYPE + "_" +
			// value.getPartyType(), String.valueOf(value.getCertType())) == null) {
			// if (log.isErrorEnabled()) {
			// log.error(CrmLocaleFactory.getResource("CMS0030041", String.valueOf(value.getCertType())));
			// }
			// ExceptionUtil.throwBusinessException("CMS0030041", String.valueOf(value.getCertType()));
			// }
			// 参数错误，参数{0}不能为空！
			// if (value.isPropertyModified(IPartyValue.S_CertCode) && StringUtils.isBlank(value.getCertCode())) {
			// if (log.isErrorEnabled()) {
			// log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0000012")));
			// }
			// ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0000012"));
			// }
			try {
				// 验证参与人的唯一性
				validateUniqueParty(value);
			} catch (CmObjectExistsException e) {
				log.info(e.getMessage(), e);
				// 如果参与人存在则需要做参与人合并操作
				if (log.isErrorEnabled()) {
					log.error(e.getMessage());
				}
				// TODO 增加处理业务逻辑
				// IBOCmPartyValue origionValue = (IBOCmPartyValue) e.getObject();
			}
		}
	}

	/**   
	 * 验证创建参与人
	 * @Function validateCreateParty
	 * @Description 
	 *
	 * @param value
	 * @throws CmObjectExistsException
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-22 下午10:55:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-22     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateCreateParty(IPartyValue value) throws Exception {
		if (value != null) {
			// 参数错误，参数{0}不能为空！
			if (StringUtils.isBlank(value.getPartyName())) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0000006")));
				}
				ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0000006"));
			}
			// 参数错误，当前系统不存在类型为{0}的参与人类型定义！
			if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.PARTY_TYPE, String.valueOf(value.getPartyType())) == null) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030040", String.valueOf(value.getPartyType())));
				}
				ExceptionUtil.throwBusinessException("CMS0030040", String.valueOf(value.getPartyType()));
			}
			try {
				validateUniqueParty(value);
			} catch (CmObjectExistsException e) {
				log.info(e.getMessage(), e);
				if (log.isErrorEnabled()) {
					log.error(e.getMessage());
				}
				DataContainerInterface origionValue = (DataContainerInterface) e.getObject();
				IPartyValue newPartyValue = new PartyBean();
				newPartyValue.copy(origionValue);
				DataContainerFactory.copyNoClearData(value, newPartyValue);
				value.copy(newPartyValue);
			}
		}
	}

	/**   
	 * 验证参与人的唯一性
	 * @Function validateUniqueParty
	 * @Description 
	 *
	 * @param value
	 * @throws CmObjectExistsException
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-22 下午11:32:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-22     huzq2           v1.0.0               修改原因<br>
	 */
	protected final void validateUniqueParty(IPartyValue value) throws CmObjectExistsException, Exception {
		if (value != null) {
			// 如果参与人编号不为空，则先查询该参与人是否存在，如果存在则抛出对象已存在的异常(CmObjectExistsException)
			if (value.getPartyId() > 0) {
				IPartyValue partyValue = null;
				try {
					// 设置当前查询不需要模糊化
					BOMaskHelper.setOperateNotMaskFlag();
					partyValue = CmServiceFactory.getPartySV().queryPartyById(value.getPartyId());
				} finally {
					// 清除当前查询设置的禁止模糊化标识，避免对正常业务产生影响。
					BOMaskHelper.clearOperateMaskFlag();
				}
				if (partyValue != null) {
					// 系统中已经存在编号为{0}的参与人信息，不需要再新增。
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0031138", new Object[] { String.valueOf(value.getPartyId()) }));
					}
					throw new CmObjectExistsException("CMS0031138", new Object[] { String.valueOf(value.getPartyId()) }, partyValue);
				}
			}
			/*
			 * 根据系统参数配置获取是否打开了参与人唯一性检验规则
			 */
			if (CmStaticDataUtil.getSystemSwitch(CmConstants.CmStaticDataCodeValue.VALIDATE_UNIQUE_PARTY)) {
				// 验证是否已经存在这样 的参与人了
				int partyType = value.getPartyType();
				DataContainer condition = new DataContainer();
				condition.set(IBOCmPartyValue.S_PartyType, partyType);
				condition.set(IBOCmPartyValue.S_CertType, value.getCertType());
				condition.set(IBOCmPartyValue.S_CertCode, value.getCertCode());
				condition.set(IBOCmPartyValue.S_State, CmConstants.RecordState.USE);
				if (value.getPartyId() > 0) {
					condition.set(IBOCmPartyValue.S_PartyId, value.getPartyId());
				}
				IPartyValue[] partyValues = CmServiceFactory.getPartySV().queryPartys(condition, -1, -1);
				/*
				 * 先验证参与人是否已经存在了，如果存在则不能添加。
				 */
				if (CmCommonUtil.isNotEmptyObject(partyValues)) {
					// 根据参与人类型[{0}]、证件类型[{1}]、证件号码[{2}]在系统找到了参与人记录:{3}。
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0031139", new Object[] { partyType, value.getCertType(), value.getCertCode(), partyValues[0] }));
					}
					throw new CmObjectExistsException("CMS0031139", new Object[] { partyType, value.getCertType(), value.getCertCode(), partyValues[0] }, partyValues[0]);
				}
			}
		}
	}
}
