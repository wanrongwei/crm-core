package com.asiainfo.crm.so.instance.rboss.service.interfaces;

import java.rmi.RemoteException;

import com.ai.omframe.instance.bo.InsCmRelBean;
import com.ai.omframe.instance.ivalues.IInsCmRelValue;

/**
 * 对于客户和用户关系表 :
 * a) 订单模块在实例库中创建客户与用户关系表，只保存用户与使用者的关系。按用户ID分表。
 * b) 订单模块提供针对该表的增删改查服务。
 * c) 客管模块在维护用户与使用者关系时，调用订单接口同步数据。
 * Created by zhiyu on 2014/8/19.
 */
public interface IInsCmRelSV {
    /**
     * 保存客户用户关系
     * @param aInsCmRelValue
     * @param regionId
     * @throws Exception
     * @throws RemoteException
     */
    public void saveInsCmRel(IInsCmRelValue aInsCmRelValue,String regionId) throws Exception,RemoteException;

    /**
     * 保存用户关系
     * @param aInsCmRelValue
     * @throws Exception
     * @throws RemoteException
     */
    public void insertInsCmRel(IInsCmRelValue aInsCmRelValue)throws Exception,RemoteException;

    /**
     * 查询客户用户关系（仅记录使用者关系）
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsCmRelValue getInsCmRelValue(long userId) throws Exception,RemoteException;

    /**
     * 根据userId转移ins_cmrel表里面的数据到ins_des_cmrel表
     * @param userId
     * @throws Exception
     */
    public void transInsCmRelToDes(long userId) throws Exception,RemoteException;
    public void transInsCmRelToDes(long userId,long realType) throws Exception,RemoteException;
    /**
     * 
     * @Function getInsCmRelValueByUserIdAndType
     * @Description 根据userId获取IInsCmRelValue
     *
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     *
     * @version v1.0.0
     * @author zhangyy3
     * @date 2014年11月3日 下午5:33:24
     * 
     * <strong>Modification History:</strong><br>
     * Date         Author          Version            Description<br>
     * ---------------------------------------------------------<br>
     * 2014年11月3日     zhangyy3           v1.0.0               修改原因<br>
     */
    public IInsCmRelValue[] getInsCmRelValuesByUserId(long userId) throws Exception,RemoteException;
    
    
    public InsCmRelBean queryInsCmRel(long userId, long realType) throws Exception,RemoteException;
    
    /**
     * 
     * @param userId（必须）
     * @param custId（可为0）
     * @param realType(1,使用者，2拥有者，-1所有)
     * @param state（在用：OrderConst.INST_STATE_INUSE	；删除：OrderConst.INST_STATE_DEL）
     * @return
     * @throws Exception
     */
    public InsCmRelBean queryInsCmRel(long userId,long custId, long realType,int state) throws Exception;
    
    /**
     * 
     * @param userId（必须）
     * @param custId（可为0）
     * @param realType(1,使用者，2拥有者，-1所有)
     * @param state（在用：OrderConst.INST_STATE_INUSE	；删除：OrderConst.INST_STATE_DEL）
     * @return
     * @throws Exception
     */
    public IInsCmRelValue[] queryInsCmRels(long userId,long custId, long realType,int state) throws Exception;
}
