package com.asiainfo.crm.cm.puremobile.teaminvoke.out.service.impl;

import com.ai.appframe2.common.AIException;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.puremobile.bo.BOCmInsOfferinstRelBean;
import com.asiainfo.crm.cm.puremobile.ivalues.IBOCmInsOfferinstRelValue;
import com.asiainfo.crm.cm.puremobile.service.interfaces.ICmInsOfferinstRelSV;
import com.asiainfo.crm.cm.puremobile.teaminvoke.out.service.interfaces.ICmPureMobileOutSV;

public class CmPureMobileOutSVImpl implements ICmPureMobileOutSV {

	public int getNewOfferAmount(long custId, long pricingOfferId) throws Exception {
		ICmInsOfferinstRelSV iCmInsOfferinstRelSV = (ICmInsOfferinstRelSV) ServiceFactory.getService(ICmInsOfferinstRelSV.class);
		return iCmInsOfferinstRelSV.getNewOfferAmount(custId, pricingOfferId);
	}

	public int getSeatNumber(long custId, long pricingOfferId) throws Exception {
		ICmInsOfferinstRelSV iCmInsOfferinstRelSV = (ICmInsOfferinstRelSV) ServiceFactory.getService(ICmInsOfferinstRelSV.class);
		return iCmInsOfferinstRelSV.getSeatNumber(custId, pricingOfferId);
	}

	public void saveCmInsOfferinstRelValue(IBOCmInsOfferinstRelValue aBean) throws Exception {
		ICmInsOfferinstRelSV iCmInsOfferinstRelSV = (ICmInsOfferinstRelSV) ServiceFactory.getService(ICmInsOfferinstRelSV.class);
		iCmInsOfferinstRelSV.saveCmInsOfferinstRel(aBean);
	}
	
	public void saveCmInsOfferinstRelValue(IBOCmInsOfferinstRelValue[] aBeans) throws Exception {
		ICmInsOfferinstRelSV iCmInsOfferinstRelSV = (ICmInsOfferinstRelSV) ServiceFactory.getService(ICmInsOfferinstRelSV.class);
		iCmInsOfferinstRelSV.saveBatchCmInsOfferinstRel(aBeans);
	}

	public IBOCmInsOfferinstRelValue[] queryCmInsOfferinstRelByCondition(long custId, long userId, String userRegionId, 
			long offerId, String subType, long offerInstId, long priceOfferId, long validType)throws Exception{
		ICmInsOfferinstRelSV iCmInsOfferinstRelSV = (ICmInsOfferinstRelSV) ServiceFactory.getService(ICmInsOfferinstRelSV.class);
		return iCmInsOfferinstRelSV.queryCmInsOfferinstRelByCondition(custId, userId, userRegionId, offerId, subType, offerInstId, priceOfferId, validType, -1, -1);
	}
	
	public long queryCmInsOfferinstRelCountByCondition(long custId, long userId, String userRegionId, 
			long offerId, String subType, long offerInstId, long priceOfferId, long validType)throws Exception{
		ICmInsOfferinstRelSV iCmInsOfferinstRelSV = (ICmInsOfferinstRelSV) ServiceFactory.getService(ICmInsOfferinstRelSV.class);
		return iCmInsOfferinstRelSV.queryCmInsOfferinstRelCountByCondition(custId, userId, userRegionId, offerId, subType, offerInstId, priceOfferId, validType);
	}
	
	public int getMainNumberAndWallBoardOfferAmount(long custId) throws Exception{
		ICmInsOfferinstRelSV iCmInsOfferinstRelSV = (ICmInsOfferinstRelSV) ServiceFactory.getService(ICmInsOfferinstRelSV.class);
		return iCmInsOfferinstRelSV.getMainNumberAndWallBoardOfferAmount(custId);
	}

	public static void main(String[] args) throws Exception {

		ICmPureMobileOutSV iCmPureMobileOutSV = (ICmPureMobileOutSV) ServiceFactory.getService(ICmPureMobileOutSV.class);
		
		IBOCmInsOfferinstRelValue abean = new BOCmInsOfferinstRelBean();
		abean.setCustId(21210114161622L);
		abean.setUserId(42106130558121L);
		abean.setUserRegionCode("2106");
		abean.setOfferId(30041L);
		abean.setSubType("NEW_OFFER");
		abean.setOfferInstId(33000004184871L);
		abean.setPricingOfferId(999L);
		abean.setState(1);
		
		iCmPureMobileOutSV.saveCmInsOfferinstRelValue(abean);

	}
}
