package com.asiainfo.crm.cm.custgroup.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationCodeBean;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.IInvitationCodeDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationCodeValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.IInvitationCodeSV;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;
import com.asiainfo.crm.cm.custgroup.utils.InnerServiceFactory;

public class InvitationCodeSVImpl implements IInvitationCodeSV {

	public void save(IBOCmInvitationCodeValue value) throws Exception {
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);
		dao.save(value);
	}

	public void saveBatch(IBOCmInvitationCodeValue[] values) throws Exception {
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);
		dao.saveBatch(values);
	}

	public IBOCmInvitationCodeValue getInvitationCodeValueById(long invitationCodeId)throws Exception{
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);

		IBOCmInvitationCodeValue condition = new BOCmInvitationCodeBean();
		condition.setInvitationCodeId(invitationCodeId);
		IBOCmInvitationCodeValue[] values = dao.getInvitationCodeValuesByConditions(condition, -1, -1);
		
		if ( values==null || values.length<=0 ){
			return null;
		}else{
			return values[0];
		}
	}

	public IBOCmInvitationCodeValue getInvitationCodeValueByCode(String invitationCode)throws Exception{
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);

		IBOCmInvitationCodeValue condition = new BOCmInvitationCodeBean();
		condition.setInvitationCode(invitationCode);
		IBOCmInvitationCodeValue[] values = dao.getInvitationCodeValuesByConditions(condition, -1, -1);
		
		if ( values==null || values.length<=0 ){
			return null;
		}else{
			return values[0];
		}
	}
	
	public IBOCmInvitationCodeValue[] getInvitationCodeValuesByConditions(long invitationCodeId, String invitationCode, String manageStatus, int startNum, int endNum)throws Exception {
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);
		
		IBOCmInvitationCodeValue condition = new BOCmInvitationCodeBean();
		
		condition.setInvitationCodeId(invitationCodeId);
		condition.setInvitationCode(invitationCode);
		condition.setManageStatus(manageStatus);
		condition.setState("U");
		
		return dao.getInvitationCodeValuesByConditions(condition, startNum, endNum);
	}
	
	public IBOCmInvitationCodeValue[] getRandomInvitationCodeValuesByConditions(long invitationCodeId, String invitationCode, String manageStatus, int startNum, int endNum)throws Exception{
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);
		
		IBOCmInvitationCodeValue condition = new BOCmInvitationCodeBean();
		
		condition.setInvitationCodeId(invitationCodeId);
		condition.setInvitationCode(invitationCode);
		condition.setManageStatus(manageStatus);
		condition.setState("U");
		// 获取可用的邀请码 总数
		long count = dao.getInvitationCodeValuesCountByConditions(condition);
		// 随机取出需要数据条数
		int randomStartNum = new Random().nextInt((int)count + startNum - endNum - 1 ) + 1;
		int randomEndNum = endNum - startNum + randomStartNum;
		return dao.getInvitationCodeValuesByConditions(condition, randomStartNum, randomEndNum);
	}

	public long getInvitationCodeValuesCountByConditions(long invitationCodeId, String invitationCode, String manageStatus)throws Exception {
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);
		
		IBOCmInvitationCodeValue condition = new BOCmInvitationCodeBean();
		
		condition.setInvitationCodeId(invitationCodeId);
		condition.setInvitationCode(invitationCode);
		condition.setManageStatus(manageStatus);
		condition.setState("U");
		
		return dao.getInvitationCodeValuesCountByConditions(condition);		
	}

	public void useInvitationCode(String invitationCode) throws Exception {
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);

		IBOCmInvitationCodeValue[] invitationCodeValues = this.getInvitationCodeValuesByConditions(0, invitationCode, "", -1, -1);
		if ( invitationCodeValues!=null && invitationCodeValues.length>0 ){
			for ( IBOCmInvitationCodeValue invitationCodeValue:invitationCodeValues ){
				invitationCodeValue.setManageStatus(CmGroupConstants.invitationCodeManageStatus.USE);
			}
			dao.saveBatch(invitationCodeValues);
		}
	}

	public void recoveryInvitationCode(String invitationCode) throws Exception {
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);

		IBOCmInvitationCodeValue[] invitationCodeValues = this.getInvitationCodeValuesByConditions(0, invitationCode, "", -1, -1);
		if ( invitationCodeValues!=null && invitationCodeValues.length>0 ){
			for ( IBOCmInvitationCodeValue invitationCodeValue:invitationCodeValues ){
				invitationCodeValue.setManageStatus(CmGroupConstants.invitationCodeManageStatus.INIT);
			}
			dao.saveBatch(invitationCodeValues);
		}
	}

	public void useInvitationCode(String[] invitationCodes) throws Exception {
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);

		List<IBOCmInvitationCodeValue> conditionList = new ArrayList<IBOCmInvitationCodeValue>();
		
		for (int i=0; invitationCodes!=null && i<invitationCodes.length; i++){
			IBOCmInvitationCodeValue[] invitationCodeValues = this.getInvitationCodeValuesByConditions(0, invitationCodes[i], "", -1, -1);
			
			if ( invitationCodeValues!=null && invitationCodeValues.length>0 ){
				for ( IBOCmInvitationCodeValue invitationCodeValue:invitationCodeValues ){
					invitationCodeValue.setManageStatus(CmGroupConstants.invitationCodeManageStatus.USE);
					conditionList.add(invitationCodeValue);
				}
			}
		}
		if ( conditionList.size()>0 ){
			dao.saveBatch(conditionList.toArray(new IBOCmInvitationCodeValue[0]));;
		}
	}

	public void recoveryInvitationCode(String[] invitationCodes) throws Exception {
		IInvitationCodeDAO dao = (IInvitationCodeDAO) ServiceFactory.getService(IInvitationCodeDAO.class);

		List<IBOCmInvitationCodeValue> conditionList = new ArrayList<IBOCmInvitationCodeValue>();
		for (int i=0; invitationCodes!=null && i<invitationCodes.length; i++){
			IBOCmInvitationCodeValue[] invitationCodeValues = this.getInvitationCodeValuesByConditions(0, invitationCodes[i], "", -1, -1);
			
			if ( invitationCodeValues!=null && invitationCodeValues.length>0 ){
				for ( IBOCmInvitationCodeValue invitationCodeValue:invitationCodeValues ){
					invitationCodeValue.setManageStatus(CmGroupConstants.invitationCodeManageStatus.INIT);
					conditionList.add(invitationCodeValue);
				}
			}
		}
		if ( conditionList.size()>0 ){
			dao.saveBatch(conditionList.toArray(new IBOCmInvitationCodeValue[0]));;
		}
	}
}
