package com.asiainfo.crm.cm.busimodel.impl.club;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubActionBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubActionRecBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubActionValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubActivityValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

/**
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName AbstractClubActionDealModelImpl
 * @Description 俱乐部会员活动业务逻辑实现
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Jan 11, 2012 10:48:04 AM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public abstract class AbstractClubActionDealModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOClubActivityValue activityValue = (IVOClubActivityValue) valueObject;
		preposeExtThings(activityValue);
		// 俱乐部活动信息
		if (activityValue.getClubAction() != null) {
			IClubActionValue clubActionValue = activityValue.getClubAction();
			CmCommonUtil.convertName(new DataStructInterface[] { clubActionValue });
			saveClubActionValue(new IClubActionValue[] { clubActionValue });
		}
		// 俱乐部活动记录信息
		if (activityValue.getClubActionRecs() != null) {
			saveClubActionRecValue(activityValue.getClubActionRecs());
		}
		doOtherThings(activityValue);

		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		// 俱乐部会员活动保存成功！
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010031"));
		return returnData;
	}

	public void saveClubActionRecValue(IClubActionRecValue[] clubActionRecs) throws Exception {
		BOCmClubActionRecBean[] boclubActionRecs = new BOCmClubActionRecBean[clubActionRecs.length];
		for (int i = 0; i < clubActionRecs.length; i++) {
			if (clubActionRecs[i].isNew()) {
				if (clubActionRecs[i].getRecordId() <= 0) {
					clubActionRecs[i].setRecordId(CmCommonUtil.getNewSequence(BOCmClubActionRecBean.class));
				}
				if (StringUtils.isBlank(clubActionRecs[i].getState())) {
					clubActionRecs[i].setState(CmConstants.RecordState.USE);
				}
				if (clubActionRecs[i].isNew()) {
					if (ServiceManager.getUser() != null) {
						clubActionRecs[i].setCreateOpId(ServiceManager.getUser().getID());
						clubActionRecs[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
				}
			} else if (clubActionRecs[i].isDeleted()) {
				// 逻辑删除，修改失效日期即可！
				clubActionRecs[i].setStsToOld();
				clubActionRecs[i].setExpireDate(CmCommonUtil.getSysDate());
				// clubActionRecs[i].delete();
			}
			boclubActionRecs[i] = new BOCmClubActionRecBean();
			boclubActionRecs[i].copy(clubActionRecs[i]);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(boclubActionRecs);
		// 回设
		for (int i = 0; i < boclubActionRecs.length; i++) {
			clubActionRecs[i].setRecordId(boclubActionRecs[i].getRecordId());
			clubActionRecs[i].setDoneCode(boclubActionRecs[i].getDoneCode());
			clubActionRecs[i].setDoneDate(boclubActionRecs[i].getDoneDate());
			clubActionRecs[i].setEffectiveDate(boclubActionRecs[i].getEffectiveDate());
			clubActionRecs[i].setExpireDate(boclubActionRecs[i].getExpireDate());
		}

	}

	/**
	 * 保存俱乐部会员活动
	 * @param activityValue
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-10
	 */
	public void saveClubActionValue(IClubActionValue[] activityValue) throws Exception {
		// int[] args = { CmConstants.ValidateClubMemberData.USER_OBJECTS };
		// ValidateData.validateClubMemberData(clubMemberValue, args);
		BOCmClubActionBean[] clubActions = new BOCmClubActionBean[activityValue.length];
		for (int i = 0; i < activityValue.length; i++) {
			// CmClubBusiRule.validateClubActionFilled(clubActionValues[i]);
			if (activityValue[i].isNew()) {
				if (activityValue[i].getActionId() <= 0) {
					activityValue[i].setActionId(CmCommonUtil.getNewSequence(BOCmClubActionBean.class));
				}
				if (StringUtils.isBlank(activityValue[i].getState())) {
					activityValue[i].setState(CmConstants.RecordState.USE);
				}
				if (ServiceManager.getUser() != null) {
					activityValue[i].setCreateOpId(ServiceManager.getUser().getID());
					activityValue[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
				}
				if (StringUtils.isBlank(activityValue[i].getRegionId())) {
					activityValue[i].setRegionId(CmCommonUtil.getDefaultRegionId());
				}
			} else if (activityValue[i].isDeleted()) {
				activityValue[i].delete();
				activityValue[i].setExpireDate(CmCommonUtil.getSysDate());
			}
			clubActions[i] = new BOCmClubActionBean();
			clubActions[i].copy(activityValue[i]);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(clubActions);
		// 回设
		for (int i = 0; i < clubActions.length; i++) {
			activityValue[i].setActionId(clubActions[i].getActionId());
			activityValue[i].setDoneCode(clubActions[i].getDoneCode());
			activityValue[i].setDoneDate(clubActions[i].getDoneDate());
			activityValue[i].setEffectiveDate(clubActions[i].getEffectiveDate());
			activityValue[i].setExpireDate(clubActions[i].getExpireDate());
		}
	}

	/**
	 * 
	 * @Function preposeExtThings
	 * @Description 前置的扩展方法，支持在处理基础版本的业务逻辑之前扩展本地业务逻辑
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 11, 2012 10:50:10 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	protected void preposeExtThings(IVOClubActivityValue activityValue) {
	}

	/**
	 * 
	 * @Function doOtherThings
	 * @Description 提供外围扩展的处理方法
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 11, 2012 10:50:14 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	protected abstract void doOtherThings(IVOClubActivityValue activityValue) throws Exception;

	/**
	 * 
	 * @Function extBeforeSave
	 * @Description 在核心版本保存对象前，提供扩展地市个性化校验或者赋值等操作，主键已经生成，可以直接获取
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jan 11, 2012 10:50:37 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	protected void extBeforeSave(IClubActionValue[] activityValue) throws Exception {
	}
}
