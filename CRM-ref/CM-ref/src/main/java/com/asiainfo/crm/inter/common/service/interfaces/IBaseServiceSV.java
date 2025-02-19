package com.asiainfo.crm.inter.common.service.interfaces;

import com.asiainfo.crm.inter.common.ivalues.*;

import java.rmi.RemoteException;
import java.util.List;

public interface IBaseServiceSV {
	
	/**
	 * 根据服务标示获取服务信息
	 * @param serviceId
	 * @return
	 * @throws Exception
	 */
	public IBOBsServiceValue getServiceInfobyId(long serviceId)throws Exception,RemoteException;
	
	/**
	 * 根据服务标示获取服务配置信息
	 * @param serviceId
	 * @return
	 * @throws Exception
	 */
	public IBOBsServiceCfgValue getServiceCfgInfoById(long serviceId)throws Exception,RemoteException;
	
	
	/**
	 * 根据服务配置标示获取服务参数信息
	 * @param cfgId
	 * @return
	 * @throws Exception
	 */
	public IBOBsServiceParamValue[] getServiceParam(long cfgId)throws Exception,RemoteException;
	
	/**
	 * 根据服务参数标示获取服务参数
	 * @param paramId
	 * @return
	 * @throws Exception
	 */
	public IBOBsServiceParamValue getServiceParamById(long paramId)throws Exception,RemoteException;
	
	/**
	 * 获取服务参数表的所有数据
	 * @param
	 * @return
	 * @throws Exception
	 */
	public IBOBsServiceParamValue[] getAllServiceParam()throws Exception,RemoteException;
	
	/**
	 * 加载全部异常转换数据
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOInfExceptionValue[] loadAllExceptions() throws Exception,RemoteException;
	
	/**
	 * 加载全部异常信息关键字转换数据
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOInfExceptionKeywordsValue[] loadAllExceptionKeywords() throws Exception,RemoteException;
	
	/**
	 * 参数校验配置
	 * @return
	 * @throws Exception
	 */
	public IBOInfAccessParamVerifyValue[] getAccessParamVerify() throws Exception;
	
	/**
	 * 参数校验配置
	 * @return
	 * @throws Exception
	 */
	public List getParamVerifyById(long accParamId) throws Exception;
}
