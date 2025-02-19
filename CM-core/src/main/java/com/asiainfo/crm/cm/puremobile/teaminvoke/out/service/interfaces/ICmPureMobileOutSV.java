package com.asiainfo.crm.cm.puremobile.teaminvoke.out.service.interfaces;

import com.asiainfo.crm.cm.puremobile.ivalues.IBOCmInsOfferinstRelValue;

public interface ICmPureMobileOutSV {

	/**
	 * 添加 cm_ins_offerinst_rel 记录
	 * @return
	 * @throws Exception
	 */
	public void saveCmInsOfferinstRelValue(IBOCmInsOfferinstRelValue aBean) throws Exception ;

	/**
	 * 添加 cm_ins_offerinst_rel 记录
	 * @return
	 * @throws Exception
	 */
	public void saveCmInsOfferinstRelValue(IBOCmInsOfferinstRelValue[] aBeans) throws Exception ;

	/**
	 * 根据条件查询对象
	 * 
	 * @param custId
	 * @param userId
	 * @param userRegionId
	 * @param offerId
	 * @param subType
	 * @param offerInstId
	 * @param priceOfferId
	 * @param validType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsOfferinstRelValue[] queryCmInsOfferinstRelByCondition(long custId, long userId, String userRegionId, 
			long offerId, String subType, long offerInstId, long priceOfferId, long validType)throws Exception;
	
	/**
	 * 根据条件 查询 记录数量
	 * @param custId
	 * @param userId
	 * @param userRegionId
	 * @param offerId
	 * @param subType
	 * @param offerInstId
	 * @param priceOfferId
	 * @param validType
	 * @return
	 * @throws Exception
	 */
	public long queryCmInsOfferinstRelCountByCondition(long custId, long userId, String userRegionId, 
			long offerId, String subType, long offerInstId, long priceOfferId, long validType)throws Exception;
	
	/**
	 * 查询客户某Pricing Offer的New offer数
	 * 
	 * @param custId
	 * @param pricingOfferId
	 * @return
	 * @throws Exception
	 */
	public int getNewOfferAmount(long custId,long pricingOfferId)throws Exception;
	
	/**
	 * 查询客户某Pricing Offer的席位数
	 * 
	 * @param custId
	 * @param pricingOfferId
	 * @return
	 * @throws Exception
	 */
	public int getSeatNumber(long custId,long pricingOfferId)throws Exception;
	
	/**
	 * 	 获取客户下Mainnumber offer 和 Wallboard offer的用户个数
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public int getMainNumberAndWallBoardOfferAmount(long custId) throws Exception;
	
}
