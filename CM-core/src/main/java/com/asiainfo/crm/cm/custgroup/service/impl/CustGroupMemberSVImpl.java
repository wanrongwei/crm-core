package com.asiainfo.crm.cm.custgroup.service.impl;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmTimeUtil;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.ICustGroupMemberDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupMemberInfoValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupMemberSV;
import com.asiainfo.crm.cm.custgroup.utils.CmFmcCustGroupUtils;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;


/**
 *	群组成员的  行为库
 */
public class CustGroupMemberSVImpl implements ICustGroupMemberSV {

	/**
	 * 保存客户群成员信息
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupMemberInfoValue saveGroupMemberInfo(IBOCmGroupMemberInfoValue value)throws Exception{
		//验证数据
		if(value == null){
			//Parameter invalid.
			ExceptionUtil.throwBusinessException("CMS8900000");
		}
		//设置默认属性值
		setDefaultGroupMemberInfoValue(value);
		
		ICustGroupMemberDAO groupMemberDao = (ICustGroupMemberDAO)ServiceFactory.getService(ICustGroupMemberDAO.class);
		groupMemberDao.saveCmGroupMemberInfoValue(value);
		
		return value;
	}
	
	/**
	 * 批量保存客户群成员信息
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupMemberInfoValue[] saveBatchGroupMemberInfo(IBOCmGroupMemberInfoValue[] values)throws Exception{
		//验证数据
		if(values == null && values.length<0 ){
			//Parameter invalid.
			ExceptionUtil.throwBusinessException("CMS8900000");
		}

		//设置默认属性值
		for ( IBOCmGroupMemberInfoValue value:values){
			setDefaultGroupMemberInfoValue(value);
		}
		
		ICustGroupMemberDAO groupMemberDao = (ICustGroupMemberDAO)ServiceFactory.getService(ICustGroupMemberDAO.class);
		groupMemberDao.saveBatchCmGroupMemberInfoValue(values);
		
		return values;
	}
	
	protected void setDefaultGroupMemberInfoValue(IBOCmGroupMemberInfoValue value) throws Exception {
		if (value != null) {
			if (value.isNew()) {//如果是新建
				value.setMemberId(CmCommonUtil.getNewSequence(value));
				if(value.getMemberName() == null || "".equals(value.getMemberName().trim())){
					//不指定成员别名，则系统自动生成，生成规则为：'M'+MEMBER_ID
					value.setMemberName("M"+value.getMemberId());
				}
				value.setMemberStatus(CmGroupConstants.MemberStatus.Valid);
				value.setEffectiveDate(CmTimeUtil.getDefaultSysDate());
				value.setExpireDate(CmTimeUtil.get2099LastTime());
			} else if (value.isDeleted()) {

			} else if (value.isModified()) {
				
			}
			//设置CREATE_OP_ID等属性
			CmFmcCustGroupUtils.setCommonFields(value);
		}
	}
	
	/**
	 * 根据查询条件客户群成员
	 * @param memberRefId
	 * @param groupId
	 * @param groupRole
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupMemberInfoValue[] queryCmGroupMemberInfoByCondition(long memberRefId, long groupId, long groupRole, int memberStatus, int start, int end) throws Exception{
		ICustGroupMemberDAO groupMemberDao = (ICustGroupMemberDAO)ServiceFactory.getService(ICustGroupMemberDAO.class);
		return groupMemberDao.queryCmGroupMemberInfoByCondition(memberRefId, groupId, groupRole, memberStatus, start, end);
	}
	
	/**
	 * 根据条件 查询客户成员 数量
	 * @param memberRefId
	 * @param groupId
	 * @param groupRole
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public int queryCmGroupMemberInfoCountByCondition(long memberRefId, long groupId, long groupRole, int memberStatus) throws Exception {
		ICustGroupMemberDAO groupMemberDao = (ICustGroupMemberDAO)ServiceFactory.getService(ICustGroupMemberDAO.class);
		return groupMemberDao.queryCmGroupMemberInfoCountByCondition(memberRefId, groupId, groupRole, memberStatus);
	}
	
	

}
