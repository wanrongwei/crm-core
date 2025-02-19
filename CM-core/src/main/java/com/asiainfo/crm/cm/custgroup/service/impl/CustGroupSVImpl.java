package com.asiainfo.crm.cm.custgroup.service.impl;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmTimeUtil;
import com.asiainfo.crm.cm.custgroup.bo.BOCmCustomerGroupBean;
import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationInfoBean;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.ICustGroupDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerGroupValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupSV;
import com.asiainfo.crm.cm.custgroup.utils.CmFmcCustGroupUtils;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;
import com.asiainfo.crm.cm.custgroup.utils.InnerServiceFactory;


/**
 * 群组的 行为库
 *
 */
public class CustGroupSVImpl implements ICustGroupSV{
	/**
	 * 保存客户群信息
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue saveCustomerGroup(IBOCmCustomerGroupValue value)throws Exception{
		//验证数据
		if(value == null){
			//Parameter invalid.
			ExceptionUtil.throwBusinessException("CMS8900000");
		}
		//设置默认属性值
		setDefaultCustomerGroupValue(value);
		
		ICustGroupDAO custGroupDao = (ICustGroupDAO)ServiceFactory.getService(ICustGroupDAO.class);
		custGroupDao.saveCmCustomerGroupValue(value);
		
		return value;
	}
	
	/**
	 * 根据条件查询客户群基本信息
	 * @param groupId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue[] queryCmCustomerGroupByCondition(long groupId,int start, int end) throws Exception{
		ICustGroupDAO custGroupDao = (ICustGroupDAO)ServiceFactory.getService(ICustGroupDAO.class);
		return custGroupDao.queryCmCustomerGroupByCondition(groupId, start, end);
	}
	
	/**
	 * 根据条件查询客户群基本信息
	 * @param value	群组对象的查询条件
	 * @param groupEffExpStatus 群组的生失效状态
	 * @param startNum	
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue[] queryCmCustomerGroupByCondition(IBOCmCustomerGroupValue value, int groupEffExpStatus,int startNum, int endNum) throws Exception{
		ICustGroupDAO custGroupDao = (ICustGroupDAO)ServiceFactory.getService(ICustGroupDAO.class);
		return custGroupDao.queryCmCustomerGroupByCondition(value, groupEffExpStatus, startNum, endNum);
	}

	private void setDefaultCustomerGroupValue(IBOCmCustomerGroupValue value) throws Exception {
		if (value != null) {
			if (value.isNew()) {//如果是新建
				value.setGroupId(CmCommonUtil.getNewSequence(value));
				if(value.getGroupName() == null || "".equals(value.getGroupName().trim())){
					//不指定客户群名，则系统自动生成，生成规则为：'G'+GROUP_ID  
					value.setGroupName("G"+value.getGroupId());
				}
				value.setGroupType(CmGroupConstants.GroupType.B2C);
				value.setGroupStatus(CmGroupConstants.GroupStatus.Active);
				value.setGroupLevel(CmGroupConstants.GroupLevel.ADMIN);
				value.setValidType(CmGroupConstants.ValidType.INVITATION);
				value.setEffectiveDate(CmTimeUtil.getDefaultSysDate());
				value.setExpireDate(CmTimeUtil.get2099LastTime());
				
			} else if (value.isDeleted()) {

			} else if (value.isModified()) {
				value.setGroupName(value.getGroupName());
			}
			//设置CREATE_OP_ID等属性
			CmFmcCustGroupUtils.setCommonFields(value);
		}
	}

	/**
	 * 获取剩余的可邀请的数量
	 * 
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public int getGroupAvailableMemberCount(long groupId) throws Exception {
		// 成员数量
		int memberCount = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoCountByCondition(0, groupId, 0, CmGroupConstants.MemberStatus.Valid);
		
		// 获取 有效的邀请码 数量
		BOCmInvitationInfoBean invitation = new BOCmInvitationInfoBean();
		invitation.setGroupId(groupId);
		int invitationCount = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationCount(invitation);
		
		// 获取群组的 已有 成员数量
		int maxMemberAmount = CmGroupConstants.maxMemberAmount;
		IBOCmGeneralConfigValue[] maxMemberAmountValue = InnerServiceFactory.getCmGeneralConfigSV()
				.getGeneralConfigs(CmGroupConstants.srcType.groupParam, CmGroupConstants.srcType.groupParam, CmGroupConstants.configCode.maxMemberAmount, CmGroupConstants.configStatus.effective);
		if(maxMemberAmountValue != null && maxMemberAmountValue.length > 0){
			maxMemberAmount = Integer.parseInt(maxMemberAmountValue[0].getValue1());
		}
		
		return maxMemberAmount - memberCount - invitationCount;
	}

}
