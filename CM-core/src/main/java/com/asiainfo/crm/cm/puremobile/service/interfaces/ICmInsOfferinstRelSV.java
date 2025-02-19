package com.asiainfo.crm.cm.puremobile.service.interfaces;

import com.asiainfo.crm.cm.puremobile.ivalues.IBOCmInsOfferinstRelValue;

public interface ICmInsOfferinstRelSV {

	/**
	 * 单个保存
	 * @param value
	 * @throws Exception
	 */
	public void saveCmInsOfferinstRel(IBOCmInsOfferinstRelValue value)throws Exception;

	/**
	 * 批量保存
	 * @param values
	 * @throws Exception
	 */
	public void saveBatchCmInsOfferinstRel(IBOCmInsOfferinstRelValue[] values) throws Exception;

	/**
	 * 根据主键 获取记录
	 * @param cmRelId
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsOfferinstRelValue queryCmInsOfferinstRelById(long cmRelId)throws Exception;

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
			long offerId, String subType, long offerInstId, long priceOfferId, long validType,
			int startNum, int endNum)throws Exception;
	
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
	 * 获取 new offer个数
	 * @param custId
	 * @param pricingOfferId
	 * @return
	 * @throws Exception
	 */
	public int getNewOfferAmount(long custId, long pricingOfferId)throws Exception;
	
	/**
	 * 获取席位数 offer  的用户 个数
	 * 
	 * @param custId
	 * @param pricingOfferId
	 * @return
	 * @throws Exception
	 */
	public int getSeatNumber(long custId, long pricingOfferId) throws Exception ;
	
	/**
	 * 	获取客户下Mainnumber offer 和 Wallboard offer的用户个数
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public int getMainNumberAndWallBoardOfferAmount(long custId) throws Exception;

}
