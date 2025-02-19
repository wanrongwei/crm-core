package com.asiainfo.crm.cm.puremobile.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.omframe.util.SoDBUtils;
import com.asiainfo.crm.cm.puremobile.bo.BOCmInsOfferinstRelEngine;
import com.asiainfo.crm.cm.puremobile.dao.interfaces.ICmInsOfferinstRelDAO;
import com.asiainfo.crm.cm.puremobile.ivalues.IBOCmInsOfferinstRelValue;
import com.asiainfo.crm.cm.puremobile.utils.PureMobileConstant;

public class CmInsOfferinstRelDAOImpl implements ICmInsOfferinstRelDAO {
	
	public void saveCmInsOfferinstRel(IBOCmInsOfferinstRelValue value) throws Exception {
		if ( value.isNew() && value.getCmrelId()<=0 ){
			value.setCmrelId( BOCmInsOfferinstRelEngine.getNewId().longValue() );
		}
		BOCmInsOfferinstRelEngine.save(value);
	}
	
	public void saveBatchCmInsOfferinstRel(IBOCmInsOfferinstRelValue[] values) throws Exception {
		for (int i=0; values!=null && i<values.length; i++ ){
			if ( values[i].isNew() && values[i].getCmrelId()<=0 ){
				values[i].setCmrelId( BOCmInsOfferinstRelEngine.getNewId().longValue() );
			}
		}
		BOCmInsOfferinstRelEngine.saveBatch(values);
	}

	public IBOCmInsOfferinstRelValue queryCmInsOfferinstRelById(long cmRelId)throws Exception{
		return BOCmInsOfferinstRelEngine.getBean(cmRelId);
	}

	public IBOCmInsOfferinstRelValue[] queryCmInsOfferinstRelByCondition(long custId, long userId, String userRegionId, 
			long offerId, String subType, long offerInstId, long priceOfferId, long validType,
			int startNum, int endNum)throws Exception{
		StringBuffer condition = new StringBuffer(" 1=1 ");
		Map<String,Object> parameter = new HashMap<String, Object>();
		
		// cust id
		if ( custId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_CustId).append(" =:").append(IBOCmInsOfferinstRelValue.S_CustId);
			parameter.put(IBOCmInsOfferinstRelValue.S_CustId, custId);
		}
		// user id
		if ( userId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_UserId).append(" =:").append(IBOCmInsOfferinstRelValue.S_UserId);
			parameter.put(IBOCmInsOfferinstRelValue.S_UserId, userId);
		}
		// user region id
		if ( StringUtils.isNotBlank(userRegionId) ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_UserRegionCode).append(" =:").append(IBOCmInsOfferinstRelValue.S_UserRegionCode);
			parameter.put(IBOCmInsOfferinstRelValue.S_UserRegionCode, custId);
		}
		// offer id
		if ( offerId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_OfferId).append(" =:").append(IBOCmInsOfferinstRelValue.S_OfferId);
			parameter.put(IBOCmInsOfferinstRelValue.S_OfferId, offerId);
		}
		// sub type
		if ( StringUtils.isNotBlank(subType) ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_SubType).append(" =:").append(IBOCmInsOfferinstRelValue.S_SubType);
			parameter.put(IBOCmInsOfferinstRelValue.S_SubType, subType);
		}
		// offer inst id
		if ( offerInstId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_OfferInstId).append(" =:").append(IBOCmInsOfferinstRelValue.S_OfferInstId);
			parameter.put(IBOCmInsOfferinstRelValue.S_OfferInstId, offerInstId);
		}
		// price offer id
		if ( priceOfferId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_PricingOfferId).append(" =:").append(IBOCmInsOfferinstRelValue.S_PricingOfferId);
			parameter.put(IBOCmInsOfferinstRelValue.S_PricingOfferId, priceOfferId);
		}
		// 生失效时间
		if(validType==OrderConst.VALID_TYPE_NOW){
			condition.append(" AND ").append(SoDBUtils.getSqlSysDateStr()).append(" between ").append(IBOCmInsOfferinstRelValue.S_EffectiveDate).append(" and ").append(IBOCmInsOfferinstRelValue.S_ExpireDate);
		}
		else if(validType==OrderConst.VALID_TYPE_NEXT){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_EffectiveDate).append(" >").append(SoDBUtils.getSqlSysDateStr())
				.append(" AND ").append(IBOCmInsOfferinstRelValue.S_ExpireDate).append(">").append(IBOCmInsOfferinstRelValue.S_EffectiveDate);
		}
		else if(validType==OrderConst.VALID_TYPE_EXPIRED){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_ExpireDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
		}else if(validType==OrderConst.VALID_TYPE_ALL){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_ExpireDate).append(" > ").append(SoDBUtils.getSqlSysDateStr())
				.append(" AND ").append(IBOCmInsOfferinstRelValue.S_ExpireDate).append(" >").append(IBOCmInsOfferinstRelValue.S_EffectiveDate);
		}
		// state
		condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_State).append(" =:").append(IBOCmInsOfferinstRelValue.S_State);
		parameter.put(IBOCmInsOfferinstRelValue.S_State, PureMobileConstant.CmInsOfferinstRelState.VALID);
		
		return BOCmInsOfferinstRelEngine.getBeans(null, condition.toString(), parameter, startNum, endNum, false);
	}

	public long queryCmInsOfferinstRelCountByCondition(long custId, long userId, String userRegionId, 
			long offerId, String subType, long offerInstId, long priceOfferId, long validType)throws Exception{
		StringBuffer condition = new StringBuffer(" 1=1 ");
		Map<String,Object> parameter = new HashMap<String, Object>();
		
		// cust id
		if ( custId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_CustId).append(" =:").append(IBOCmInsOfferinstRelValue.S_CustId);
			parameter.put(IBOCmInsOfferinstRelValue.S_CustId, custId);
		}
		// user id
		if ( userId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_UserId).append(" =:").append(IBOCmInsOfferinstRelValue.S_UserId);
			parameter.put(IBOCmInsOfferinstRelValue.S_UserId, userId);
		}
		// user region id
		if ( StringUtils.isNotBlank(userRegionId) ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_UserRegionCode).append(" =:").append(IBOCmInsOfferinstRelValue.S_UserRegionCode);
			parameter.put(IBOCmInsOfferinstRelValue.S_UserRegionCode, custId);
		}
		// offer id
		if ( offerId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_OfferId).append(" =:").append(IBOCmInsOfferinstRelValue.S_OfferId);
			parameter.put(IBOCmInsOfferinstRelValue.S_OfferId, offerId);
		}
		// sub type
		if ( StringUtils.isNotBlank(subType) ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_SubType).append(" =:").append(IBOCmInsOfferinstRelValue.S_SubType);
			parameter.put(IBOCmInsOfferinstRelValue.S_SubType, subType);
		}
		// offer inst id
		if ( offerInstId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_OfferInstId).append(" =:").append(IBOCmInsOfferinstRelValue.S_OfferInstId);
			parameter.put(IBOCmInsOfferinstRelValue.S_OfferInstId, offerInstId);
		}
		// price offer id
		if ( priceOfferId>0 ){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_PricingOfferId).append(" =:").append(IBOCmInsOfferinstRelValue.S_PricingOfferId);
			parameter.put(IBOCmInsOfferinstRelValue.S_PricingOfferId, priceOfferId);
		}
		// 生失效时间
		if(validType==OrderConst.VALID_TYPE_NOW){
			condition.append(" AND ").append(SoDBUtils.getSqlSysDateStr()).append(" between ").append(IBOCmInsOfferinstRelValue.S_EffectiveDate).append(" and ").append(IBOCmInsOfferinstRelValue.S_ExpireDate);
		}
		else if(validType==OrderConst.VALID_TYPE_NEXT){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_EffectiveDate).append(" >").append(SoDBUtils.getSqlSysDateStr())
				.append(" AND ").append(IBOCmInsOfferinstRelValue.S_ExpireDate).append(">").append(IBOCmInsOfferinstRelValue.S_EffectiveDate);
		}
		else if(validType==OrderConst.VALID_TYPE_EXPIRED){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_ExpireDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
		}else if(validType==OrderConst.VALID_TYPE_ALL){
			condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_ExpireDate).append(" > ").append(SoDBUtils.getSqlSysDateStr())
				.append(" AND ").append(IBOCmInsOfferinstRelValue.S_ExpireDate).append(" >").append(IBOCmInsOfferinstRelValue.S_EffectiveDate);
		}
		// state
		condition.append(" AND ").append(IBOCmInsOfferinstRelValue.S_State).append(" =:").append(IBOCmInsOfferinstRelValue.S_State);
		parameter.put(IBOCmInsOfferinstRelValue.S_State, PureMobileConstant.CmInsOfferinstRelState.VALID);
		
		return BOCmInsOfferinstRelEngine.getBeansCount(condition.toString(), parameter);
	}

}
