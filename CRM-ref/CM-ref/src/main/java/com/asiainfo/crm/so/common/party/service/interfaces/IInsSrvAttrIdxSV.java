package com.asiainfo.crm.so.common.party.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;

import com.asiainfo.crm.so.common.party.ivalues.IBOInsSrvAttrIdxValue;

public interface IInsSrvAttrIdxSV {
	
	public void saveInsSrvAttrIds(IBOInsSrvAttrIdxValue[] insSrvAttrIdxValues) throws Exception, RemoteException;
	
	public void saveInsSrvAttrId(IBOInsSrvAttrIdxValue aInsSrvAttrIdxValue) throws Exception, RemoteException;
	
	public IBOInsSrvAttrIdxValue getSrvAttrIdByKey(long attrIdxInstId) throws Exception, RemoteException;
	
	/**
	 * 通过where Condition 查询
	 * @param sqlCond  --condition中需要有地市条件
 	 * @param map  	   --condition中需要有地市条件
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOInsSrvAttrIdxValue[] getInsSrvAttrIdxBySqlCond(String sqlCond, HashMap map)throws Exception, RemoteException;
	
	/**
	 * 通过条件查询用户服务属性索引信息
	 * @param userId
	 * @param offerInstId
	 * @param prodInstId
	 * @param serviceInstId
	 * @param attrInstId
	 * @param attrId
	 * @param regionId -- 必须传入
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOInsSrvAttrIdxValue[] getSrvAttrIdValueByCond(long userId, long offerInstId, long prodInstId, long serviceInstId,
			long attrInstId, long attrId,String attrValue, String regionId) throws Exception, RemoteException;
	
	public void deleteSrvAttrIdValue(IBOInsSrvAttrIdxValue aInsSrvAttrIdxValue) throws Exception, RemoteException;
	
	public void deleteSrvAttrIdValues(IBOInsSrvAttrIdxValue[] insSrvAttrIdxValues) throws Exception, RemoteException;
	
	public IBOInsSrvAttrIdxValue[] getInsSrvAttrIdxByAttrIdAndAttrValue(String arrtId,String attrValue)throws Exception,RemoteException;
	
	public IBOInsSrvAttrIdxValue[] getInsSrvAttrIdxByAttrIdAndUserId(String arrtId,long userId)throws Exception,RemoteException;
	
	public IBOInsSrvAttrIdxValue[] getSrvAttrIdValueByAttrIdANDAttrValue(String arrtId,String attrValue)throws Exception,RemoteException;
}
