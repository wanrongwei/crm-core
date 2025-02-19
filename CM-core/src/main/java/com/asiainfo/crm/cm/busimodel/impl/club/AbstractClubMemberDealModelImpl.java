package com.asiainfo.crm.cm.busimodel.impl.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.secframe.common.Constants;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubActionRecBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberCardBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceAdjustBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceRecBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubActionRecValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberAttrValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceRecValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.bo.ClubActionRecBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberCardBean;
import com.asiainfo.crm.cm.model.bo.ClubServiceRecBean;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceAdjustValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName AbstractClubMemberDealModelImpl
 * @Description 该类对俱乐部会员的操作业务逻辑进行了抽象的实现。
 *
 * @version v1.0.0
 * @author Xiaohu
 * @date 2011-11-29 下午5:39:24 
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-11-29     Xiaohu           v1.0.0               修改原因
 */
public abstract class AbstractClubMemberDealModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	/**
	 * 处理流程：<br>
	 * <ol>
	 * 	<li>{@link #validate(IVOClubMemberValue) 数据验证}</li>
	 * 	<li>{@link #setDefaultValue(IVOClubMemberValue) 设置默认属性}</li>
	 * </ol>
	 */
	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOClubMemberValue clubMemberValue = (IVOClubMemberValue) valueObject;
		/*
		 * 数据验证
		 */
		validate(clubMemberValue);

		/*
		 * 设置默认属性
		 */
		setDefaultValue(clubMemberValue);

		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(clubMemberValue);
		/*
		 * 处理俱乐部会员信息
		 */
		dealClubMember(clubMemberValue);
		/*
		 * 处理会员卡信息
		 */
		dealClubMemberCards(clubMemberValue);
		/*
		 * 处理会员服务记录信息
		 */
		dealClubServiceRecords(clubMemberValue);
		/*
		 * 处理会员服务调整记录
		 */
		dealClubServiceAdjusts(clubMemberValue);
		/*
		 * 处理俱乐部会员活动信息
		 */
		dealClubActivityRecords(clubMemberValue);
		/*
		 * 处理属性信息
		 */
		dealAttrValues(clubMemberValue);
		/*
		 * 处理其他信息
		 */
		dealOtherThings(clubMemberValue);
		/*
		 * 通知服务
		 */
		notify(clubMemberValue);
		/*
		 * 记录业务日志
		 */
		saveBusiLog(clubMemberValue);
		/*
		 * 业务处理之后的操作
		 */
		processAfterDeal(clubMemberValue);

		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010005"));
		return returnData;
	}

	/**   
	 * 处理客户属性信息
	 * @Function dealAttrValues
	 * @Description 
	 *
	 * @param clubMemberValue
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
	private void dealAttrValues(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasAttrValues()) {
			// 已经被保存了就不要在保存了。
			if (clubMemberValue.hasUserObject("CUST_ATTR_SAVER")) {
				return;
			}
			CmServiceFactory.getEntityAttrSV().saveEntityAttrValues(clubMemberValue.getAttrValues(), clubMemberValue.getUserMap());
			clubMemberValue.setUserObject("CUST_ATTR_SAVER", this.getClass().getName());
		}
	}

	/**   
	 * 
	 * @Function dealClubServiceAdjusts
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午3:19:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealClubServiceAdjusts(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasServiceAdjusts()) {
			IClubServiceAdjustValue[] adjustValues = clubMemberValue.getClubServiceAdjusts();
			List list = new ArrayList();
			for (int i = 0; i < adjustValues.length; i++) {
				if (adjustValues[i] != null && (adjustValues[i].isNew() || adjustValues[i].isDeleted() || adjustValues[i].isModified())) {
					BOCmClubServiceAdjustBean adjustValue = new BOCmClubServiceAdjustBean();
					adjustValue.copy(adjustValues[i]);
					list.add(adjustValue);
				}
			}
			if (CmCommonUtil.isNotEmptyObject(list)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmClubServiceAdjustBean[]) list.toArray(new BOCmClubServiceAdjustBean[0]));
			}
		}
	}

	/**   
	 * 处理其他信息
	 * @Function dealOtherThings
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:33:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void dealOtherThings(IVOClubMemberValue clubMemberValue) throws Exception;

	/**   
	 * 处理会员活动记录信息
	 * @Function dealClubActivityRecords
	 * @Description 
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:25:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealClubActivityRecords(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasActivityRecords()) {
			List list = new ArrayList();
			IClubActionRecValue[] activityRecords = clubMemberValue.getClubActionRecs();
			for (int i = 0; i < activityRecords.length; i++) {
				if (activityRecords[i] != null && (activityRecords[i].isNew() || activityRecords[i].isDeleted() || activityRecords[i].isModified())) {
					BOCmClubActionRecBean actionRecValue = new BOCmClubActionRecBean();
					actionRecValue.copy(activityRecords[i]);
					list.add(actionRecValue);
				}
			}
			if (CmCommonUtil.isNotEmptyObject(list)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmClubActionRecBean[]) list.toArray(new BOCmClubActionRecBean[0]));
				for (int i = 0; i < list.size(); i++) {
					DataContainerFactory.copyNoClearData((IBOCmClubActionRecValue) list.get(i), activityRecords[i]);
				}
			}
		}
	}

	/**   
	 * 处理俱乐部会员基本信息
	 * @Function dealClubMember
	 * @Description 
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:25:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealClubMember(IVOClubMemberValue clubMemberValue) throws Exception {
		IClubMemberValue memberValue = clubMemberValue.getClubMember();
		// 排除空对象情况
		if (memberValue != null && (memberValue.isNew() || memberValue.isDeleted() || memberValue.isModified())) {
			BOCmClubMemberBean Value = new BOCmClubMemberBean();
			Value.copy(memberValue);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(Value);
			// 回设
			DataContainerFactory.copyNoClearData(Value, memberValue);
		}
	}

	/**   
	 * 
	 * @Function dealClubMemberCards
	 * @Description 
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:25:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealClubMemberCards(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasMemberCards()) {
			IClubMemberCardValue[] cardValues = clubMemberValue.getClubMemberCards();
			List list = new ArrayList();
			for (int i = 0; i < cardValues.length; i++) {
				if (cardValues[i] != null && (cardValues[i].isDeleted() || cardValues[i].isModified() || cardValues[i].isNew())) {
					BOCmClubMemberCardBean cardValue = new BOCmClubMemberCardBean();
					cardValue.copy(cardValues[i]);
					list.add(cardValue);
				}
			}
			if (CmCommonUtil.isNotEmptyObject(list)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmClubMemberCardBean[]) list.toArray(new BOCmClubMemberCardBean[0]));
				for (int i = 0; i < list.size(); i++) {
					DataContainerFactory.copyNoClearData((BOCmClubMemberCardBean) list.get(i), cardValues[i]);
				}
			}
		}
	}

	/**   
	 * 处理会员服务记录信息
	 * @Function dealClubServiceRecords
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:31:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void dealClubServiceRecords(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasServiceRecords()) {
			IClubServiceRecValue[] serviceRecValues = clubMemberValue.getClubServiceRecs();
			List list = new ArrayList();
			for (int i = 0; i < serviceRecValues.length; i++) {
				if (serviceRecValues[i] != null && (serviceRecValues[i].isNew() || serviceRecValues[i].isDeleted() || serviceRecValues[i].isModified())) {
					BOCmClubServiceRecBean recValue = new BOCmClubServiceRecBean();
					recValue.copy(serviceRecValues[i]);
					list.add(recValue);
				}
			}
			if (CmCommonUtil.isNotEmptyObject(list)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmClubServiceRecBean[]) list.toArray(new BOCmClubServiceRecBean[0]));
				for (int i = 0; i < list.size(); i++) {
					DataContainerFactory.copyNoClearData((BOCmClubServiceRecBean) list.get(i), serviceRecValues[i]);
				}
			}
		}
	}

	/**   
	 * 通知服务
	 * @Function notify
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:24:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void notify(IVOClubMemberValue clubMemberValue) throws Exception;

	/**   
	 * 业务处理完成后的处理
	 * @Function processAfterDeal
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:11:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processAfterDeal(IVOClubMemberValue clubMemberValue) throws Exception;

	/**   
	 * 在处理业务之前的业务
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:12:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void processBeforeDeal(IVOClubMemberValue clubMemberValue) throws Exception;

	/**   
	 * 保存业务日志
	 * @Function saveBusiLog
	 * @Description 
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:29:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void saveBusiLog(IVOClubMemberValue clubMemberValue) throws Exception {
		CmBusiLogFactory.log(clubMemberValue);
	}

	/**   
	 * 设置会员后动记录信息
	 * @Function setDefaultClubActivityRecordValue
	 * @Description 
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:23:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultClubActivityRecordValue(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasActivityRecords()) {
			IClubActionRecValue[] actionRecValues = clubMemberValue.getClubActionRecs();
			for (int i = 0; i < actionRecValues.length; i++) {
				if (actionRecValues[i].isNew()) {
					actionRecValues[i].setRecordId(CmCommonUtil.getNewSequence(BOCmClubActionRecBean.class));
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						actionRecValues[i].setCreateOpId(ServiceManager.getUser().getID());
						actionRecValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(actionRecValues[i].getRegionId())) {
						actionRecValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					actionRecValues[i].setState(CmConstants.RecordState.USE);
				} else if (actionRecValues[i].isDeleted()) {
					actionRecValues[i].setState(CmConstants.RecordState.ERASE);
					actionRecValues[i].setStsToOld();
					actionRecValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 设置会员基本信息
	 * @Function setDefaultClubMemberValue
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:21:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultClubMemberValue(IVOClubMemberValue clubMemberValue) throws Exception {
		IClubMemberValue memberValue = clubMemberValue.getClubMember();
		if (memberValue != null) {
			if (memberValue.isNew()) {
				memberValue.setMemberId(CmCommonUtil.getNewSequence(BOCmClubMemberBean.class));
				// 设置创建操作员编号、创建操作员组织编号。
				if (ServiceManager.getUser() != null) {
					memberValue.setCreateOpId(ServiceManager.getUser().getID());
					memberValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
				}
				// 设置地市
				if (StringUtils.isBlank(memberValue.getRegionId())) {
					memberValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				}
				// 设置记录状态
				memberValue.setState(CmConstants.RecordState.USE);

				// 设置地市，区县
				if (StringUtils.isEmpty(memberValue.getCityId()) || StringUtils.isEmpty(memberValue.getCountyId())) {
					ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
					ISoUserValue userValue = teamInvokeSV.getSoUserByUserId(memberValue.getUserId());
					if (userValue != null) {
						memberValue.setCityId(userValue.getAreaCode());
						memberValue.setCountyId(userValue.getCountryCode());
					}
				}
			} else if (memberValue.isModified()) {
				// 设置地市，区县
				if (StringUtils.isEmpty(memberValue.getCityId()) || StringUtils.isEmpty(memberValue.getCountyId())) {
					ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
					ISoUserValue userValue = teamInvokeSV.getSoUserByUserId(memberValue.getUserId());
					if (userValue != null) {
						memberValue.setCityId(userValue.getAreaCode());
						memberValue.setCountyId(userValue.getCountryCode());
					}
				}
			} else if (memberValue.isDeleted()) {
				memberValue.setState(CmConstants.RecordState.ERASE);
				memberValue.setStsToOld();
				memberValue.delete();
				/*
				 * 需要同步删除与之相关联的会员卡信息、服务记录、活动记录等，因为这些数据如果不清理将会导致很多的垃圾数据存在。
				 */
				/*
				 * 删除会员卡资料
				 */
				BOCmClubMemberCardBean bean = new BOCmClubMemberCardBean();
				bean.setMemberId(memberValue.getMemberId());
				bean.setState(CmConstants.RecordState.USE);
				Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { bean }, BOCmClubMemberCardBean.class);
				BOCmClubMemberCardBean[] cardValues = (BOCmClubMemberCardBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
						parameter.getCondition(), parameter.getParameter(), -1, -1);
				if (CmCommonUtil.isNotEmptyObject(cardValues)) {
					for (int i = 0; i < cardValues.length; i++) {
						IClubMemberCardValue memberCardValue = new ClubMemberCardBean();
						memberCardValue.copy(cardValues[i]);
						memberCardValue.delete();
						clubMemberValue.setClubMemberCard(memberCardValue);
					}
				}
				/*
				 * 删除服务记录
				 */
				StringBuilder condition = new StringBuilder();
				Map parameterMap = new HashMap();
				condition.append(IBOCmClubServiceRecValue.S_MemberId).append(" = :memberId ");
				parameterMap.put("memberId", memberValue.getMemberId());
				IBOCmClubServiceRecValue[] serviceRecValues = (IBOCmClubServiceRecValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubServiceRecBean.class,
						condition.toString(), parameterMap, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(serviceRecValues)) {
					for (int j = 0; j < serviceRecValues.length; j++) {
						IClubServiceRecValue serviceRecValue = new ClubServiceRecBean();
						serviceRecValue.copy(serviceRecValues[j]);
						serviceRecValue.delete();
						clubMemberValue.setClubServiceRec(serviceRecValue);
					}
				}
				/*
				 * 删除活动信息
				 */
				IBOCmClubActionRecValue[] actionRecValues = (IBOCmClubActionRecValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubActionRecBean.class,
						condition.toString(), parameterMap, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(actionRecValues)) {
					for (int i = 0; i < actionRecValues.length; i++) {
						IClubActionRecValue actionRecValue = new ClubActionRecBean();
						actionRecValue.copy(actionRecValues[i]);
						actionRecValue.delete();
						clubMemberValue.setClubActionRec(actionRecValue);
					}
				}
			}
		}
	}

	/**   
	 * 设置会员服务记录信息
	 * @Function setDefaultClubServiceRecordValue
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:22:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultClubServiceRecordValue(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasServiceRecords()) {
			IClubServiceRecValue[] recValues = clubMemberValue.getClubServiceRecs();
			for (int i = 0; i < recValues.length; i++) {
				if (recValues[i].isNew()) {
					recValues[i].setRecordId(CmCommonUtil.getNewSequence(BOCmClubServiceRecBean.class));
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						recValues[i].setCreateOpId(ServiceManager.getUser().getID());
						recValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
					// 设置地市
					if (StringUtils.isBlank(recValues[i].getRegionId())) {
						recValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
					// 设置记录状态
					recValues[i].setState(CmConstants.RecordState.USE);
				} else if (recValues[i].isDeleted()) {
					recValues[i].setState(CmConstants.RecordState.ERASE);
					recValues[i].setStsToOld();
					recValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 设置默认属性
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:23:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultValue(IVOClubMemberValue clubMemberValue) throws Exception {
		/*
		 * 设置会员基本信息
		 */
		setDefaultClubMemberValue(clubMemberValue);
		/*
		 * 设置会员卡信息
		 */
		setDefaultClubMemberCardValue(clubMemberValue);
		/*
		 * 设置会员服务记录信息
		 */
		setDefaultClubServiceRecordValue(clubMemberValue);
		/*
		 * 设置服务调整记录信息
		 */
		setDefaultClubServiceAdjustValue(clubMemberValue);
		/*
		 * 设置会员活动记录信息
		 */
		setDefaultClubActivityRecordValue(clubMemberValue);
		/*
		 * 设置客户属性
		 */
		setDefaultAttrValue(clubMemberValue);
		/*
		 * 设置其他属性
		 */
		setOtherDefaultValue(clubMemberValue);
	}

	/**   
	 * 设置客户属性
	 * @Function setDefaultAttrValue
	 * @Description 
	 *
	 * @param clubMemberValue
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
	private void setDefaultAttrValue(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasAttrValues()) {
			DataContainerInterface[] attrValues = clubMemberValue.getAttrValues();
			for (int i = 0; i < attrValues.length; i++) {
				if (attrValues[i].isNew()) {
					attrValues[i].set(IBOCmClubMemberAttrValue.S_MemberId, clubMemberValue.getMemberId());
				}
			}
		}
	}

	/**   
	 * 设置其他默认属性
	 * @Function setOtherDefaultValue
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午3:37:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void setOtherDefaultValue(IVOClubMemberValue clubMemberValue) throws Exception;

	/**   
	 * @Function setDefaultClubServiceAdjustValue
	 * @Description 
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-31 下午3:35:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-31     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultClubServiceAdjustValue(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasServiceAdjusts()) {
			IClubServiceAdjustValue[] recValues = clubMemberValue.getClubServiceAdjusts();
			for (int i = 0; i < recValues.length; i++) {
				if (recValues[i].isNew()) {
					recValues[i].setRecordId(CmCommonUtil.getNewSequence(BOCmClubServiceRecBean.class));
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						recValues[i].setCreateOpId(ServiceManager.getUser().getID());
						recValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
						// 设置地市
						if (StringUtils.isBlank(recValues[i].getRegionId()) && StringUtils.isNotBlank(String.valueOf(ServiceManager.getUser().get(Constants.REGION_ID)))) {
							recValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
						}
					}
					// 设置记录状态
					recValues[i].setState(CmConstants.RecordState.USE);
				} else if (recValues[i].isDeleted()) {
					recValues[i].setState(CmConstants.RecordState.ERASE);
					recValues[i].setStsToOld();
					recValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 设置会员卡信息
	 * @Function setDefaultClubMemberCardValue
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:28:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void setDefaultClubMemberCardValue(IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasMemberCards()) {
			IClubMemberCardValue[] cardValues = clubMemberValue.getClubMemberCards();
			for (int i = 0; i < cardValues.length; i++) {
				if (cardValues[i].isNew()) {
					cardValues[i].setRecordId(CmCommonUtil.getNewSequence(BOCmClubMemberCardBean.class));
					// 设置创建操作员编号、创建操作员组织编号。
					if (ServiceManager.getUser() != null) {
						cardValues[i].setCreateOpId(ServiceManager.getUser().getID());
						cardValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
						// 设置地市
						if (StringUtils.isBlank(cardValues[i].getRegionId()) && StringUtils.isNotBlank(String.valueOf(ServiceManager.getUser().get(Constants.REGION_ID)))) {
							cardValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
						}
					}
					if (cardValues[i].getMemberId() <= 0) {
						cardValues[i].setMemberId(clubMemberValue.getMemberId());
					}
					// 设置记录状态
					cardValues[i].setState(CmConstants.RecordState.USE);
				} else if (cardValues[i].isDeleted()) {
					cardValues[i].setState(CmConstants.RecordState.ERASE);
					cardValues[i].setStsToOld();
					cardValues[i].delete();
				}
			}
		}
	}

	/**   
	 * 验证方法调用的参数是否符合业务要求
	 * @Function validate
	 * @Description 
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午8:54:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	private void validate(IVOClubMemberValue clubMemberValue) throws Exception {
		/*
		 * 验证俱乐部会员基本信息
		 */
		validateClubMember(clubMemberValue);
		/*
		 * 处理会员卡信息
		 */
		validateClubMemberCards(clubMemberValue);
		/*
		 * 验证会员服务记录信息
		 */
		validateClubServiceRecords(clubMemberValue);
		/*
		 * 验证会员活动记录信息
		 */
		validateClubActivityRecords(clubMemberValue);
		/*
		 * 验证客户属性
		 */
		validateAttrValue(clubMemberValue);
		/*
		 * 验证其他信息
		 */
		validateOtherThings(clubMemberValue);
	}

	/**   
	 * 处理会员卡信息
	 * @Function validateClubMemberCards
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:26:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateClubMemberCards(IVOClubMemberValue clubMemberValue) throws Exception {
		// TODO Auto-generated method stub

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
	protected abstract void validateAttrValue(IVOClubMemberValue clubMemberValue) throws Exception;

	/**   
	 * 验证会员活动记录信息
	 * @Function validateClubActivityRecords
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:17:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateClubActivityRecords(IVOClubMemberValue clubMemberValue) throws Exception {
		// TODO Auto-generated method stub

	}

	/**   
	 * 验证俱乐部会员基本信息
	 * @Function validateClubMember
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:14:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateClubMember(IVOClubMemberValue clubMemberValue) throws Exception {

	}

	/**   
	 * 验证会员服务记录信息
	 * @Function validateClubServiceRecords
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @exception Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:16:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected void validateClubServiceRecords(IVOClubMemberValue clubMemberValue) throws Exception {
		// TODO Auto-generated method stub

	}

	/**   
	 * 验证其他信息<br>
	 * 该接口需要根据实际需求进行扩展
	 * @Function validateOtherThings
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 下午9:19:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validateOtherThings(IVOClubMemberValue clubMemberValue) throws Exception;
}
