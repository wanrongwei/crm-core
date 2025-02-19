package com.asiainfo.crm.cm.teaminvoke.in.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.res.simcard.ivalues.IBOResSimCardUsedValue;

import java.rmi.RemoteException;

public interface IRes2CmSV {
	
	public IBOResSimCardUsedValue getUsedSimCardInfoByImsi(String imsi,String regionId) throws Exception;

    /**
     * 根据客户编号(custId)查询客户的资源列表
     *
     * @param custId     客户编号
     * @param startIndex 数据库起始记录
     * @param endIndex   数据库结束记录
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainerInterface[] qryResListByCustId(long custId)
            throws Exception, RemoteException;

    /**
     * 根据客户编号查询客户的资源数量
     *
     * @param custId 客户编号
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public int qryResListCountByCustId(long custId) throws Exception, RemoteException;


    /**
     * 根据IMEI查询资源详细
     * @param userId
     * @param offerInstId
     * @param imei
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainerInterface[] qryResDetailByCustIdAndDeviceId(long userId,long offerInstId ,String imei) throws Exception, RemoteException;

    /**
     * 根据userId查询用户信息
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainerInterface[] qryServiceInfoByUserId(long userId,long offerInstId) throws Exception, RemoteException;
}
