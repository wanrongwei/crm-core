package com.asiainfo.crm.cm.puremobile.dao.interfaces;

import com.asiainfo.crm.cm.puremobile.ivalues.IBOCmInsOfferinstRelValue;

public interface ICmInsOfferinstRelDAO {
	
	public void saveCmInsOfferinstRel(IBOCmInsOfferinstRelValue value)throws Exception;
	
	public void saveBatchCmInsOfferinstRel(IBOCmInsOfferinstRelValue[] values) throws Exception;
	
	public IBOCmInsOfferinstRelValue queryCmInsOfferinstRelById(long cmRelId)throws Exception;

	public IBOCmInsOfferinstRelValue[] queryCmInsOfferinstRelByCondition(long custId, long userId, String userRegionId, 
			long offerId, String subType, long offerInstId, long priceOfferId, long validType,
			int startNum, int endNum)throws Exception;
	
	public long queryCmInsOfferinstRelCountByCondition(long custId, long userId, String userRegionId, 
			long offerId, String subType, long offerInstId, long priceOfferId, long validType)throws Exception;
}
