package com.asiainfo.crm.cm.service.impl;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.ExceptionUtil;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.inner.contact.bo.BOCmxGroupCustAdminBean;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmxGroupCustAdminValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmxGroupContactHValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmxGroupContactValue;
import com.asiainfo.crm.cm.service.interfaces.ICmxContactSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

public class CmxContactSVImpl implements ICmxContactSV {

	
	public IBOCmPartyContactValue[] queryContactById(long[] partyIds ) throws Exception {
		if(partyIds != null) {
			IBOCmPartyContactValue[] cmPartyContactValues = CmxServiceFactory.getCmxContactInnerSV().queryContactById(partyIds);
			return cmPartyContactValues ;
		}
		return new IBOCmPartyContactValue[0];
	}

	public IContactValue queryCustContactsByCustId(long custId)throws Exception {
		IContactValue[] contactValue =  CmServiceFactory.getContactSV().queryCustContactsByCustId(custId, -1 , -1 );
		if(CmCommonUtil.isNotEmptyObject(contactValue)){
			return contactValue[0];
		}
		return null;
	}

	public IContactValue queryAcctContactsByAcctId(long acctId)	throws Exception {
		IContactValue[] contactValue =  CmServiceFactory.getContactSV().queryAcctContactsByAcctId(acctId, -1, -1);
		if(CmCommonUtil.isNotEmptyObject(contactValue)){
			return contactValue[0];
		}
		return null;
	}

	public IQBOCmxGroupContactValue[] queryGroupContact(String billId,long contClass,int starNum, int endNum) throws Exception {
		IQBOCmxGroupContactValue[] cmxGroupContactValues = CmxServiceFactory.getCmxContactInnerSV().queryGroupContacts(billId, contClass, starNum, endNum);
		if(CmCommonUtil.isNotEmptyObject(cmxGroupContactValues)){
			return cmxGroupContactValues;
		}
		return new IQBOCmxGroupContactValue[0];
	}

	public int queryGroupContactCount(String billId,long contClass) throws Exception {
		return  CmxServiceFactory.getCmxContactInnerSV().queryGroupContactCount(billId, contClass);
		
	}

	public IQBOCmxGroupContactHValue[] queryGroupContactsH(long custId, long prioryLevel,int starNum, int endNum) throws Exception {
		IQBOCmxGroupContactHValue[] groupContactHValues = CmxServiceFactory.getCmxContactInnerSV().queryGroupContactH(custId, prioryLevel, -1, starNum, endNum);
		if(CmCommonUtil.isNotEmptyObject(groupContactHValues)){
			ISec2CmSV sec2Cmsv = CmxServiceFactory.getCmxSec2CmSV();
			for (int i = 0; i < groupContactHValues.length; i++) {
				long opId = groupContactHValues[i].getOpId();
				IBOSecOperatorValue secOperatorValue = sec2Cmsv.getOperatorInfoByOpId(opId);
				groupContactHValues[i].initProperty("CODE",secOperatorValue.getCode());
			}	
			return groupContactHValues;
		}
		return new IQBOCmxGroupContactHValue[0];
	}

	public int queryGroupContactHCount(long custId, long prioryLevel) throws Exception {
		return CmxServiceFactory.getCmxContactInnerSV().queryGroupContactHCount(custId, prioryLevel, -1);
	}

	public IBOCmxGroupCustAdminValue[] queryGroupAdmins( long custId, int startNum,int endNum) throws Exception {
		IBOCmxGroupCustAdminValue[] cmGroupCustAdminValues =  CmxServiceFactory.getCmxContactInnerSV().queryGroupCustAdmins(custId, startNum, endNum);
		if(CmCommonUtil.isNotEmptyObject(cmGroupCustAdminValues)){
			return cmGroupCustAdminValues;
		}
			
		return new IBOCmxGroupCustAdminValue[0];
	}

	public int queryGroupAdminsCount(long custId) throws Exception {
		return CmxServiceFactory.getCmxContactInnerSV().queryGroupCustAdminsCount(custId);
	}

	public IBOCmxGroupCustAdminValue[] queryGroupCustAdmin(long custId ,long custContId)throws Exception {
		IBOCmxGroupCustAdminValue[] cmxGroupCustAdminValue = CmxServiceFactory.getCmxContactInnerSV().queryGroupCustAdmin(custId, custContId);
		if(CmCommonUtil.isNotEmptyObject(cmxGroupCustAdminValue)){
			return cmxGroupCustAdminValue;
		}
		return null;
	}

	public void saveGroupCustAdmin(IBOCmxGroupCustAdminValue groupCustAdminValue) throws Exception {
		if (null == groupCustAdminValue) {
			// 没有获取到要保存的对象！
			ExceptionUtil.throwBusinessException("CMS0000074");
		   }
		if(groupCustAdminValue.isNew()&&groupCustAdminValue.getCustContId() <= 0){
			groupCustAdminValue.setCustContId(CmCommonUtil.getNewSequence(BOCmxGroupCustAdminBean.class));
		}
		if (ServiceManager.getUser() != null) {
			groupCustAdminValue.setCreateOpId(ServiceManager.getUser().getID());
			groupCustAdminValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			// 设置地市
			if (StringUtils.isBlank(groupCustAdminValue.getRegionId())) {
				groupCustAdminValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			}
		}
		if (StringUtils.isBlank(groupCustAdminValue.getState())) {
			groupCustAdminValue.setState(CmConstants.RecordState.USE);
		}
		else if (groupCustAdminValue.isDeleted()) {// 删除
			groupCustAdminValue.setStsToOld();
			groupCustAdminValue.delete();
		}
		CmxServiceFactory.getCmxContactInnerSV().saveGroupCustAdmin(groupCustAdminValue);
	}

	public IQBOCmxGroupContactValue[] queryGroupAddressBook(long custServiceId, long contClass, int startNum, int endNum) throws Exception {
		IQBOCmxGroupContactValue[] cmxGroupContactValues = CmxServiceFactory.getCmxContactInnerSV().queryGroupAddressBook(custServiceId, contClass, startNum, endNum);
		if(CmCommonUtil.isNotEmptyObject(cmxGroupContactValues)){
			return cmxGroupContactValues;
		}
		return new IQBOCmxGroupContactValue[0];
	}

	public int quertGroupAddressBookCount(long custServiceId, long contClass) throws Exception {
		return CmxServiceFactory.getCmxContactInnerSV().queryGroupAddressBookCount(custServiceId, contClass);
	}

	public String queryG1G2Info(String billId) throws Exception {
		String flag = "";
		DataContainer conditionDC = new DataContainer();
		conditionDC.set("CONT_MOBILE", billId);
		conditionDC.set("CUST_TYPE", CmConstants.CustomerType.GROUP);
		conditionDC.set("STATE", CmConstants.RecordState.USE);
		conditionDC.set("CONT_CLASS", 1);
		IContactValue[] contactValues = CmServiceFactory.getContactSV().queryCustContacts(conditionDC, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			if (contactValues[0].getContLevel() == 1 || contactValues[0].getContLevel() == 2) {
				flag = "G1";
			} else {
				flag = "G2";
			}
			return flag;
		}
		return null;
	}


}
