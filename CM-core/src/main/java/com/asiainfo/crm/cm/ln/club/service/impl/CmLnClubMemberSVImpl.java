package com.asiainfo.crm.cm.ln.club.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.club.bo.BOLnCmUserManagerBean;
import com.asiainfo.crm.cm.ln.club.bo.BOLnCmxClubMemberBean;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmUserManagerValue;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmxClubMemberValue;
import com.asiainfo.crm.cm.ln.club.service.interfaces.ICmLnClubMemberSV;

public class CmLnClubMemberSVImpl implements ICmLnClubMemberSV {

	public IBOLnCmxClubMemberValue queryCmxClubMemberValue(long userId) throws Exception {
		IBOLnCmxClubMemberValue cmxClubMemberValue = new BOLnCmxClubMemberBean();
		cmxClubMemberValue.setUserId(userId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmxClubMemberValue);
		return (IBOLnCmxClubMemberValue) dc;
	}

	public void saveLnClubMemberExt(IBOLnCmxClubMemberValue[] cmxClubMemberValues) throws Exception {
		int len = cmxClubMemberValues.length;
		BOLnCmxClubMemberBean[] clubMemberBeans = new BOLnCmxClubMemberBean[len];
		for (int i = 0; i < len; i++) {
			clubMemberBeans[i] = new BOLnCmxClubMemberBean();
			clubMemberBeans[i].copy(cmxClubMemberValues[i]);
			if (StringUtils.isBlank(clubMemberBeans[i].getState())) {
				clubMemberBeans[i].setState(CmConstants.RecordState.USE);
			}
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(clubMemberBeans);

	}
	

	public IBOLnCmUserManagerValue[] getLnCmUserManager(long userId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOLnCmUserManagerValue.S_UserId).append("  =:userId ");
		parameter.put("userId", userId);
		condition.append(" AND ").append(IBOLnCmUserManagerValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		IBOLnCmUserManagerValue[] lnCmUserManagerValue = (IBOLnCmUserManagerValue[]) CmInnerServiceFactory.getCommonInnerSV().
		getBeans(BOLnCmUserManagerBean.class,condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(lnCmUserManagerValue)) 
		{
			return lnCmUserManagerValue;
		} 
		else 
		{ 
			return new IBOLnCmUserManagerValue[0];
		}
	}

	public void saveData(DataContainer[] values) throws Exception {
		// TODO Auto-generated method stub
		for(DataContainer value:values)
		{	
			long seq = Long.valueOf(CmCommonUtil.getNewSequence(BOLnCmUserManagerBean.class));
			if(value.isNew()){
				((BOLnCmUserManagerBean)value).setRelId(seq);
				long a = ((BOLnCmUserManagerBean)value).getRelId();
				long b = a;
			}
		}
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);
	
	}

}
