package com.asiainfo.crm.so.common.party.service.interfaces;

import com.asiainfo.crm.so.common.party.ivalues.IBOBsWholesaleRouterCfgValue;

import java.rmi.RemoteException;

/**
 * Created by lijun on 2014/11/30.
 */
public interface IWholesaleRouterSV
{
	/**
	 * 获取所有虚拟运营商路由配置信息： 该接口资源也在用 2015-11-17 16:48
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOBsWholesaleRouterCfgValue[] getAllWsRouterCfg() throws Exception, RemoteException;

	/**
	 * 根据虚拟运营商客户ID获取RegionId
	 * 
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String getRegionByCustId(long custId) throws Exception, RemoteException;

	/**
	 * 根据登陆操作员指定的OrgId获取虚拟运营商客户ID
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public long getWsCustIdByUserInfo() throws Exception, RemoteException;

	/**
	 * 根据虚拟运营商客户ID获取指定账户ID
	 * 
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public long getWsAccountIdByCustId(long custId) throws Exception, RemoteException;

	/**
	 * 根据虚拟运营商客户ID获取Wholesale路由配置信息
	 * 
	 * @param wsCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOBsWholesaleRouterCfgValue getWsRouterCfgByWsCustId(long wsCustId) throws Exception, RemoteException;

	/**
	 * 根据虚拟运营商标识获取Wholesale路由配置信息
	 * 
	 * @param wsId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOBsWholesaleRouterCfgValue getWsRouterCfgByOperatorCode(String operatorCode) throws Exception, RemoteException;

	/**
	 * 根据虚拟运营商客户ID获取serviceOperatorcode
	 * 
	 * @param wsCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String getServiceOperCodeByCustId(long wsCustId) throws Exception, RemoteException;

	/**
	 * 根据虚拟运营商组织ID获取Wholesale路由配置信息
	 * 
	 * @param wsCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOBsWholesaleRouterCfgValue getWsRouterCfgByOrgId(String orgId) throws Exception, RemoteException;
	
	/**
	 * 资源查询页面使用: 查询wholesale 信息
	 * @param operatorCode
	 * @param wsName
	 * @param wsCustId
	 * @param secOrgId
	 * @param regionId
	 * @param cpsCode
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2015-11-17 17:01
	 */
	public IBOBsWholesaleRouterCfgValue[] getWsRouterInfos(String operatorCode, String wsName, String wsCustId, String secOrgId, String regionId, String cpsCode, int start, int end) throws Exception, RemoteException;


	/**
	 * 资源查询页面使用: 查询wholesale 数量
	 * @param operatorCode
	 * @param wsName
	 * @param wsCustId
	 * @param secOrgId
	 * @param regionId
	 * @param cpsCode
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2015-11-17 17:01
	 */
	public int getWsRouterCount(String operatorCode, String wsName, String wsCustId, String secOrgId, String regionId, String cpsCode) throws Exception, RemoteException;

    
    /**
     * 根据service_operator_code获取wholesale路由器配置信息
     * @param serviceOperatorCode
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOBsWholesaleRouterCfgValue getWsRouterCfgByServiceOperatorCode(String serviceOperatorCode) throws Exception, RemoteException;
}
