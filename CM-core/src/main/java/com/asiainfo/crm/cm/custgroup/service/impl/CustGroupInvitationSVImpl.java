package com.asiainfo.crm.cm.custgroup.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationInfoBean;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.ICustGroupInvitationDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationCodeValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationInfoValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupInvitationSV;
import com.asiainfo.crm.cm.custgroup.utils.CmFmcCustGroupUtils;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;
import com.asiainfo.crm.cm.custgroup.utils.InnerServiceFactory;
import com.asiainfo.crm.cm.custgroup.utils.StringRandom;

/**
 * 邀请码的 行为库
 *
 */
public class CustGroupInvitationSVImpl implements ICustGroupInvitationSV {

	/**
	 * 判断是否在黑名单
	 * @param invitationCode
	 * @return
	 * @throws Exception
	 */
	private boolean judgeInvitationCodeInBlacklist(String invitationCode)throws Exception{
		IBOCmGeneralConfigValue[] generalConfigs = InnerServiceFactory.getCmGeneralConfigSV().getGeneralConfigs(CmGroupConstants.srcType.groupParam, CmGroupConstants.srcType.groupParam, CmGroupConstants.configCode.inviteCodeExpression, "U");
		String[] blacklist = new String[0];
		if ( StringUtils.isNotBlank(generalConfigs[0].getValue2()) ){
			blacklist = generalConfigs[0].getValue2().split(",");
		}
		
		// 校验黑名单
		for (int i=0; i<blacklist.length; i++){
			if ( invitationCode.contains( blacklist[i] ) ){
				// 在黑名单中
				return true;
			}
		}
		// 不在黑名单
		return false;
	}
	
	/**
	 * 判断code是否已经存在表里
	 * @param invitationCode
	 * @return
	 * @throws Exception
	 */
	private boolean judgeExistsInvitationCode(String invitationCode)throws Exception{
		ICustGroupInvitationDAO invitationDao = (ICustGroupInvitationDAO) ServiceFactory.getService(ICustGroupInvitationDAO.class);

		IBOCmInvitationInfoValue value = new BOCmInvitationInfoBean();
		value.setInviteMode(CmGroupConstants.invitationMode.InvitationCode);
		value.setInviteeIdentity(invitationCode);
		value.setStatus(CmGroupConstants.invitationStatus.Pending);

		int count = invitationDao.getCmInvitationInfoCountByConditions(value, CmGroupConstants.invitationExpireStatus.Valid);
		
		if ( count>0 ){
			// 邀请码已经存在
			return true;
		}else {
			// 邀请码 不存在
			return false;
		}
	}
	
	public String generateInvitationCode() throws Exception {
//		String invitationCode = "";
//		do{
//			String expression = "";
//			IBOCmGeneralConfigValue[] generalConfigs = InnerServiceFactory.getCmGeneralConfigSV().getGeneralConfigs(CmGroupConstants.srcType.groupParam, CmGroupConstants.srcType.groupParam, CmGroupConstants.configCode.inviteCodeExpression, "U");
//			if ( generalConfigs.length>0 ){
//				expression = generalConfigs[0].getValue1();
//			}
//			invitationCode = StringRandom.getStringRandomWithExpression(expression);
//			
//		}while ( judgeInvitationCodeInBlacklist(invitationCode) || judgeExistsInvitationCode(invitationCode) ); // 如果在黑名单 或者  code已经存在  都需要重新生成 code
		
		// 检查是否有可用的 邀请码
		InnerServiceFactory.getCustGroupCheckSV().checkHasAvailableInvitationCode();
		
		IBOCmInvitationCodeValue[] invitationCodes = InnerServiceFactory.getInvitationCodeSV().getRandomInvitationCodeValuesByConditions(0, "", CmGroupConstants.invitationCodeManageStatus.INIT, 0, 1);
		if ( invitationCodes!=null && invitationCodes.length>0 ){
			return invitationCodes[0].getInvitationCode();
		}
		return null;
	}

	public IBOCmInvitationInfoValue getInvitationById(long invitationId) throws Exception{
		ICustGroupInvitationDAO invitationDao = (ICustGroupInvitationDAO) ServiceFactory.getService(ICustGroupInvitationDAO.class);
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setInvitationId(invitationId);
		IBOCmInvitationInfoValue[] invitationArr = invitationDao.getCmInvitationInfoByConditions(invitation, -1, -1, -1);
		if(invitationArr != null && invitationArr.length > 0){
			return invitationArr[0];
		}else{
			return null;
		}
	}
	
	public IBOCmInvitationInfoValue[] getPendingValidInvitationByConditions(IBOCmInvitationInfoValue value,int start,int end) throws Exception{
		ICustGroupInvitationDAO invitationDao = (ICustGroupInvitationDAO) ServiceFactory.getService(ICustGroupInvitationDAO.class);
		value.setStatus(CmGroupConstants.invitationStatus.Pending);
		return invitationDao.getCmInvitationInfoByConditions(value, CmGroupConstants.invitationExpireStatus.Valid, -1, -1);
	}

	public int getPendingValidInvitationCount(IBOCmInvitationInfoValue value) throws Exception {
		ICustGroupInvitationDAO invitationDao = (ICustGroupInvitationDAO) ServiceFactory.getService(ICustGroupInvitationDAO.class);
		value.setStatus(CmGroupConstants.invitationStatus.Pending);
		return invitationDao.getCmInvitationInfoCountByConditions(value, CmGroupConstants.invitationExpireStatus.Valid);
	}
	
	public IBOCmInvitationInfoValue[] getInvitationByCondition(IBOCmInvitationInfoValue value, int expireStatus,int start,int end) throws Exception{
		ICustGroupInvitationDAO invitationDao = (ICustGroupInvitationDAO) ServiceFactory.getService(ICustGroupInvitationDAO.class);
		return invitationDao.getCmInvitationInfoByConditions(value, expireStatus, start, end);
	}
	
	public IBOCmInvitationInfoValue[] getInvitationByGroupId(long groupId,int start,int end) throws Exception{
		ICustGroupInvitationDAO invitationDao = (ICustGroupInvitationDAO) ServiceFactory.getService(ICustGroupInvitationDAO.class);
		BOCmInvitationInfoBean value = new BOCmInvitationInfoBean();
		value.setGroupId(groupId);
		return invitationDao.getCmInvitationInfoByConditions(value, CmGroupConstants.invitationExpireStatus.All,-1,-1);
	}
	
	/**
	 * 新增/修改邀请
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue saveCmInvitationInfo(IBOCmInvitationInfoValue value)throws Exception{
		//验证数据
		if(value == null){
			//Parameter invalid.
			ExceptionUtil.throwBusinessException("CMS8900000");
		}
		//设置默认属性值
		setDefaultInvitationInfoValue(value);
		
		// 邀请 新增,修改 ,删除  需要同步处理 邀请码的资源状态 
		if ( value.getInviteMode()==CmGroupConstants.invitationMode.InvitationCode
				&& value.getNewProperties().containsKey(IBOCmInvitationInfoValue.S_Status) ){
			// 如果邀请状态为 pengding  邀请码改为为 使用状态
			if (value.getStatus()==CmGroupConstants.invitationStatus.Pending ){
				InnerServiceFactory.getInvitationCodeSV().useInvitationCode(value.getInviteeIdentity());
			}
			// 如果邀请状态为accept refruse recall expire 邀请码回收  改为 初始化状态
			if (value.getStatus()==CmGroupConstants.invitationStatus.Accepted || value.getStatus()==CmGroupConstants.invitationStatus.Rejected || 
					value.getStatus()==CmGroupConstants.invitationStatus.Recall || value.getStatus()==CmGroupConstants.invitationStatus.Expired ){
				InnerServiceFactory.getInvitationCodeSV().recoveryInvitationCode(value.getInviteeIdentity());
			}
		}
		
		ICustGroupInvitationDAO invitationDao = (ICustGroupInvitationDAO) ServiceFactory.getService(ICustGroupInvitationDAO.class);
		invitationDao.saveCmInvitationInfo(value);
		
		return value;
	}

	/**
	 * 新增/修改邀请
	 * @param values
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue[] saveBatchCmInvitationInfo(IBOCmInvitationInfoValue[] values)throws Exception{
		//验证数据
		if(values == null){
			//Parameter invalid.
			ExceptionUtil.throwBusinessException("CMS8900000");
		}
		for (IBOCmInvitationInfoValue value:values){
			//设置默认属性值
			setDefaultInvitationInfoValue(value);
		}
		
		// 邀请 新增,修改 ,删除  需要同步处理 邀请码的资源状态 
		// 使用的邀请码
		List<String> useInvitationCodeList = new ArrayList<String>();
		// 回收的邀请码
		List<String> recoveryInvitationCodeList = new ArrayList<String>();
		for (IBOCmInvitationInfoValue value:values){
			if ( value.getInviteMode()==CmGroupConstants.invitationMode.InvitationCode
					&& value.getNewProperties().containsKey(IBOCmInvitationInfoValue.S_Status) ){
				// 如果邀请状态为 pengding  邀请码改为为 使用状态
				if (value.getStatus()==CmGroupConstants.invitationStatus.Pending ){
					useInvitationCodeList.add(value.getInviteeIdentity());
				}
				// 如果邀请状态为accept refruse recall expire 邀请码回收  改为 初始化状态
				if (value.getStatus()==CmGroupConstants.invitationStatus.Accepted || value.getStatus()==CmGroupConstants.invitationStatus.Rejected || 
						value.getStatus()==CmGroupConstants.invitationStatus.Recall || value.getStatus()==CmGroupConstants.invitationStatus.Expired ){
					recoveryInvitationCodeList.add(value.getInviteeIdentity());
				}
			}
		}
		if ( useInvitationCodeList.size()>0 ){
			InnerServiceFactory.getInvitationCodeSV().useInvitationCode(useInvitationCodeList.toArray(new String[0]));
		}
		if ( recoveryInvitationCodeList.size()>0 ){
			InnerServiceFactory.getInvitationCodeSV().recoveryInvitationCode(recoveryInvitationCodeList.toArray(new String[0]));
		}
		
		ICustGroupInvitationDAO invitationDao = (ICustGroupInvitationDAO) ServiceFactory.getService(ICustGroupInvitationDAO.class);
		invitationDao.saveBatchCmInvitationInfo(values);
		
		return values;
	}

	
	private void setDefaultInvitationInfoValue(IBOCmInvitationInfoValue value) throws Exception {
		if (value != null) {
			if (value.isNew()) {//如果是新建
				value.setInvitationId(CmCommonUtil.getNewSequence(value));
				
				int inviteEffectDay = CmGroupConstants.inviteEffectDay;
				IBOCmGeneralConfigValue[] inviteEffectDayValue = InnerServiceFactory.getCmGeneralConfigSV()
						.getGeneralConfigs(CmGroupConstants.srcType.groupParam, CmGroupConstants.srcType.groupParam, CmGroupConstants.configCode.inviteEffectDay, CmGroupConstants.configStatus.effective);
				if(inviteEffectDayValue != null && inviteEffectDayValue.length > 0){
					inviteEffectDay = Integer.parseInt(inviteEffectDayValue[0].getValue1());
				}
				
				Calendar ca = Calendar.getInstance();
				ca.setTime(ServiceManager.getOpDateTime());
				ca.add(Calendar.DAY_OF_MONTH, inviteEffectDay);
				value.setExpireDate(new Timestamp(ca.getTime().getTime()));
				value.setStatus(CmGroupConstants.invitationStatus.Pending);
				value.setIsSeen(CmGroupConstants.invitationIsSeen.UN_SEEN);
			} else if (value.isDeleted()) {

			} else if (value.isModified()) {
				
			}
			//设置CREATE_OP_ID等属性
			CmFmcCustGroupUtils.setCommonFields(value);
		}
	}

}
