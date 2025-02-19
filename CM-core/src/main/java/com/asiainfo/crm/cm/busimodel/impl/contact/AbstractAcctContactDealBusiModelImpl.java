/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.contact;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctContactBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;

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
public abstract class AbstractAcctContactDealBusiModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOAccountValue accountValue = (IVOAccountValue) valueObject;
		CmCommonUtil.convertName(accountValue.getContacts());
		/*
		 * 验证客户对象信息
		 */
		validate(accountValue);
		/*
		 * 设置默认属性值
		 */
		setDefaultValue(accountValue);
		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(accountValue);

		/*
		 * 如果有联系人信息，则处理联系人 信息
		 */
		if (accountValue.hasContacts()) {
			dealContacts(accountValue);
		}

		notify(accountValue);
		/*
		 * 记录业务日志
		 */
		saveBusiLog(accountValue);
		/*
		 * 业务处理之后的操作
		 */
		processAfterDeal(accountValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010005"));
		return returnData;
	}

	/**   
	 * 处理联系人信息，负责联系人的增删改信息
	 * @Function dealContacts
	 * @Description 
	 *
	 * @param accountValue
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
	protected void dealContacts(IVOAccountValue accountValue) throws Exception {
		/*
		 * 处理联系人的参与人信息
		 */
		dealParties(accountValue);
		/*
		 * 处理客户与联系人关系
		 */
		dealAcctContacts(accountValue);
	}

	/**   
	 * 处理客户与联系人关系
	 * @Function dealAcctContacts
	 * @Description 
	 *
	 * @param accountValue
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
	protected void dealAcctContacts(IVOAccountValue accountValue) throws Exception {
		if (accountValue.hasContacts()) {
			IContactValue[] contactValues = accountValue.getContacts();
			List<BOCmAcctContactBean> acctContactValues = new ArrayList<BOCmAcctContactBean>();
			for (int i = 0; i < contactValues.length; i++) {
				BOCmAcctContactBean acctContactValue = new BOCmAcctContactBean();
				acctContactValue.copy(contactValues[i]);
				acctContactValues.add(acctContactValue);
			}
			if (CmCommonUtil.isNotEmptyObject(acctContactValues)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(acctContactValues.toArray(new BOCmAcctContactBean[0]));
				for (int i = 0; i < acctContactValues.size(); i++) {
					contactValues[i].setCreateDate(acctContactValues.get(i).getCreateDate());
					contactValues[i].setDoneCode(acctContactValues.get(i).getDoneCode());
					contactValues[i].setDoneDate(acctContactValues.get(i).getDoneDate());
					contactValues[i].setOpId(acctContactValues.get(i).getOpId());
					contactValues[i].setOrgId(acctContactValues.get(i).getOrgId());
					contactValues[i].setEffectiveDate(acctContactValues.get(i).getEffectiveDate());
					contactValues[i].setExpireDate(acctContactValues.get(i).getExpireDate());
				}
			}
		}
	}

	/**   
	 * 处理联系人的参与人信息
	 * @Function dealParties
	 * @Description 
	 *
	 * @param accountValue
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
	protected void dealParties(IVOAccountValue accountValue) throws Exception {
		if (accountValue.hasContacts()) {
			IContactValue[] contactValues = accountValue.getContacts();
			ICmPartySV partySV = CmServiceFactory.getPartySV();
			for (int i = 0; i < contactValues.length; i++) {
				// 跳过删除的情况
				if (contactValues[i].isDeleted()) {
					continue;
				}
				IVOPartyValue ivoPartyValue = new VOPartyBean();
				IPartyValue partyValue = new PartyBean();
				partyValue.copy(contactValues[i]);
				partyValue.setPartyType(CmConstants.PartyType.INDIVIDUAL);
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
	protected void notify(IVOAccountValue accountValue) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		custValue.addAccount(accountValue);
		// 处理同步客户资料给Billing
		// CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(custValue, null);
		saveLog(accountValue);
	}

	private void saveLog(IVOAccountValue accountValue) throws Exception {
		if (accountValue.hasContacts()) {
			IContactValue[] contValues = accountValue.getContacts();
			long busiId = 0L;
			if (contValues[0].isNew()) {
				busiId = CmBusinessOperation.CM_ACCT_CONT_NEW;
			} else if (contValues[0].isModified()) {
				busiId = CmBusinessOperation.CM_ACCT_CONT_MOD;
			} else if (contValues[0].isDeleted()) {
				busiId = CmBusinessOperation.CM_ACCT_CONT_DEL;
			}
			List contIds = new ArrayList();
			List contNames = new ArrayList();
			for(int i = 0;i<contValues.length;i++){
				contIds.add(contValues[i].getContId());
				contNames.add(contValues[i].getContName());
			}
			CmRecordLog.saveRecord(busiId, contValues[0].getAcctId(), (String[])contNames.toArray(new String[0]));
		}
	}

	/**   
	 * 业务处理完成后的处理
	 * @Function processAfterDeal
	 * @Description 
	 *
	 * @param accountValue
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
	protected abstract void processAfterDeal(IVOAccountValue accountValue) throws Exception;

	/**   
	 * 在处理业务之前的业务
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param accountValue
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
	protected abstract void processBeforeDeal(IVOAccountValue accountValue) throws Exception;

	/**   
	 * 设置一些默认属性，如：创建操作员编号、创建操作员等。
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param accountValue
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
	protected void setDefaultValue(IVOAccountValue accountValue) throws Exception {
		if (accountValue.hasContacts()) {
			IContactValue[] contactValues = accountValue.getContacts();
			for (int i = 0; i < contactValues.length; i++) {
				if (contactValues[i].isNew()) {
					// 设置联系人关系编号
					if (contactValues[i].getCustContId() <= 0) {
						contactValues[i].setAcctContId(CmCommonUtil.getNewSequence(BOCmAcctContactBean.class));
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
	 * @param accountValue 客户对象信息
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
	protected void validate(IVOAccountValue accountValue) throws Exception {
		// 如果是新建联系人,则需要验证该客户联系人是否已经存在,如果存在则不允许添加;
	}

	protected void saveBusiLog(IVOAccountValue accountValue) throws Exception {
		CmBusiLogFactory.log(accountValue);
	}
}
