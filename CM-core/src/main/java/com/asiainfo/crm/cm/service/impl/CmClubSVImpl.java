package com.asiainfo.crm.cm.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.bean.VOClubMemberBean;
import com.asiainfo.crm.cm.model.bo.ClubBean;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.service.interfaces.ICmClubSV;

public class CmClubSVImpl implements ICmClubSV {

	public IClubValue queryClubById(long clubId) throws Exception {
		DataContainer criteria = new DataContainer();
		criteria.set(IClubValue.S_ClubId, clubId);
		IClubValue[] clubValues = (IClubValue[]) ((AbstractClubQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubQueryModelImpl.class)).queryData(
				new DataContainer[] { criteria }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(clubValues)) {
			return clubValues[0];
		}
		return null;
	}

	public IClubValue[] queryClubs(String clubName, int clubType, String clubCode, int startNum, int endNum) throws Exception {
		DataContainer criteria = new DataContainer();
		criteria.set(IClubValue.S_ClubName, clubName);
		criteria.set(IClubValue.S_ClubType, clubType);
		criteria.set(IClubValue.S_ClubCode, clubCode);
		DataContainerInterface[] results = ((AbstractQueryBusiModelImpl)( CmServiceFactory.getBusiMode(AbstractClubQueryModelImpl.class))).queryData(new DataContainer[] { criteria }, startNum,
				endNum);
		IClubValue[] clubValues = new ClubBean[results.length];
		for(int i = 0;i<clubValues.length;i++){
			clubValues[i] = new ClubBean();
			clubValues[i].copy(results[i]);
		}
		return clubValues; 
	}

	public long saveClub(IClubValue clubValue) throws Exception {
		IVOClubMemberValue voClub = new VOClubMemberBean();
		if(clubValue.isNew()){
			String clubName = clubValue.getClubName();
			int count = queryClubCount(clubName,-1,"");//根据俱乐部员工名称查找员工数 add by suntao6
			if(count != 0){
			//throwException("Duplicate club name !", "CMS95000100");// CMS95000100
			throw new AIException("Duplicate club name !");
			}else if (count == 0) {
			voClub.setClub(clubValue);
			AbstractClubDealModelImpl busi = (AbstractClubDealModelImpl)CmServiceFactory.getBusiMode(AbstractClubDealModelImpl.class);
			busi.deal(voClub);
			}	
		}else {
			voClub.setClub(clubValue);
			AbstractClubDealModelImpl busi = (AbstractClubDealModelImpl)CmServiceFactory.getBusiMode(AbstractClubDealModelImpl.class);
			busi.deal(voClub);
		}
		return clubValue.getClubId();
	}

	public int queryClubCount(String clubName, int clubType, String clubCode) throws Exception {
		DataContainer criteria = new DataContainer();
		criteria.set(IClubValue.S_ClubName, clubName);
		criteria.set(IClubValue.S_ClubType, clubType);
		criteria.set(IClubValue.S_ClubCode, clubCode);
		return ((AbstractClubQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubQueryModelImpl.class)).queryCount(new DataContainer[] { criteria });
	}

	public IClubValue[] queryClubs(String criteria, int startNum, int endNum) throws Exception {
		return (IClubValue[]) ((AbstractClubQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubQueryModelImpl.class)).queryData(criteria, startNum, endNum);
	}

	public int queryClubCount(String criteria) throws Exception {
		return ((AbstractClubQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubQueryModelImpl.class)).queryCount(criteria);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asiainfo.crm.cm.service.interfaces.ICmClubSV#illegeQuery(java.lang.String, java.lang.String, int,
	 *      java.lang.String)
	 */
	public IClubValue[] illegeQuery(long clubId, String clubName, int clubType, String clubCode, int startNum, int endNum) throws Exception {
		DataContainer containerDC = new DataContainer();
		DataContainer illegeParame = new DataContainer();
		if (clubId != 0) {
			containerDC.set(IClubValue.S_ClubId, clubId);
		}
		if (clubName != null) {
			illegeParame.set(IClubValue.S_ClubName, clubName);
		}
		if (clubType != 0) {
			containerDC.set(IClubValue.S_ClubType, clubType);
		}
		if (clubCode != null) {
			containerDC.set(IClubValue.S_ClubCode, clubCode);
		}
		return (IClubValue[]) ((AbstractClubQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubQueryModelImpl.class)).illegeQuery(new DataContainer[] { containerDC },
				illegeParame, startNum, endNum);
	}
}
