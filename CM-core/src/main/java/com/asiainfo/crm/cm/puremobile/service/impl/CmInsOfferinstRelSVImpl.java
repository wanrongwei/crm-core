package com.asiainfo.crm.cm.puremobile.service.impl;

import java.util.HashSet;
import java.util.Set;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.order.valuebean.OrderConst;
import com.asiainfo.crm.cm.puremobile.dao.interfaces.ICmInsOfferinstRelDAO;
import com.asiainfo.crm.cm.puremobile.ivalues.IBOCmInsOfferinstRelValue;
import com.asiainfo.crm.cm.puremobile.service.interfaces.ICmInsOfferinstRelSV;
import com.asiainfo.crm.cm.puremobile.utils.PureMobileConstant;

public class CmInsOfferinstRelSVImpl implements ICmInsOfferinstRelSV {

	public void saveCmInsOfferinstRel(IBOCmInsOfferinstRelValue value) throws Exception {
		ICmInsOfferinstRelDAO dao = (ICmInsOfferinstRelDAO)ServiceFactory.getService(ICmInsOfferinstRelDAO.class);
		dao.saveCmInsOfferinstRel(value);
	}

	public void saveBatchCmInsOfferinstRel(IBOCmInsOfferinstRelValue[] values) throws Exception {
		ICmInsOfferinstRelDAO dao = (ICmInsOfferinstRelDAO)ServiceFactory.getService(ICmInsOfferinstRelDAO.class);
		dao.saveBatchCmInsOfferinstRel(values);
	}

	public IBOCmInsOfferinstRelValue queryCmInsOfferinstRelById(long cmRelId)throws Exception{
		ICmInsOfferinstRelDAO dao = (ICmInsOfferinstRelDAO)ServiceFactory.getService(ICmInsOfferinstRelDAO.class);
		return dao.queryCmInsOfferinstRelById(cmRelId);
	}

	public IBOCmInsOfferinstRelValue[] queryCmInsOfferinstRelByCondition(
			long custId, long userId, String userRegionId, long offerId,
			String subType, long offerInstId, long priceOfferId,
			long validType, int startNum, int endNum) throws Exception {
		ICmInsOfferinstRelDAO dao = (ICmInsOfferinstRelDAO)ServiceFactory.getService(ICmInsOfferinstRelDAO.class);
		return dao.queryCmInsOfferinstRelByCondition(custId, userId, userRegionId, offerId, subType, offerInstId, priceOfferId, validType, startNum, endNum);
	}

	public long queryCmInsOfferinstRelCountByCondition(long custId,
			long userId, String userRegionId, long offerId, String subType,
			long offerInstId, long priceOfferId, long validType) throws Exception {
		ICmInsOfferinstRelDAO dao = (ICmInsOfferinstRelDAO)ServiceFactory.getService(ICmInsOfferinstRelDAO.class);
		return dao.queryCmInsOfferinstRelCountByCondition(custId, userId, userRegionId, offerId, subType, offerInstId, priceOfferId, validType);
	}

	public int getNewOfferAmount(long custId, long pricingOfferId) throws Exception {
		ICmInsOfferinstRelDAO dao = (ICmInsOfferinstRelDAO)ServiceFactory.getService(ICmInsOfferinstRelDAO.class);
		IBOCmInsOfferinstRelValue[] values = dao.queryCmInsOfferinstRelByCondition(custId, -1, null, 
				-1, PureMobileConstant.CmInsOfferinstRelSubType.NEW_OFFER, -1, pricingOfferId, 
				OrderConst.VALID_TYPE_ALL, -1, -1);
		
		Set<Long> offerInstSet = new HashSet<Long>();
		for ( int i=0; values!=null && i<values.length; i++ ){
			offerInstSet.add( values[i].getOfferInstId() );
		}
		return offerInstSet.size();
	}

	public int getSeatNumber(long custId, long pricingOfferId) throws Exception {
		ICmInsOfferinstRelDAO dao = (ICmInsOfferinstRelDAO)ServiceFactory.getService(ICmInsOfferinstRelDAO.class);
		IBOCmInsOfferinstRelValue[] values = dao.queryCmInsOfferinstRelByCondition(custId, -1, null, 
				-1, PureMobileConstant.CmInsOfferinstRelSubType.SEAT_OFFER, -1, pricingOfferId, 
				OrderConst.VALID_TYPE_ALL, -1, -1);
		
		Set<Long> userIdSet = new HashSet<Long>();
		for ( int i=0; values!=null && i<values.length; i++ ){
			userIdSet.add( values[i].getUserId() );
		}
		return userIdSet.size();
	}
	
	public int getMainNumberAndWallBoardOfferAmount(long custId) throws Exception {
		ICmInsOfferinstRelDAO dao = (ICmInsOfferinstRelDAO)ServiceFactory.getService(ICmInsOfferinstRelDAO.class);
		IBOCmInsOfferinstRelValue[] values = dao.queryCmInsOfferinstRelByCondition(custId, -1, null, 
				-1, PureMobileConstant.CmInsOfferinstRelSubType.MainnumberOrWallboard_OFFER, -1, -1, 
				OrderConst.VALID_TYPE_ALL, -1, -1);
		if(values != null) {
			return values.length;
		}
		return 0;
	}

}
