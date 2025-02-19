package com.asiainfo.crm.so.teaminvoke.out.instance.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.omframe.instance.bo.InsOffInsUserBean;
import com.ai.omframe.instance.ivalues.IInsCmRelValue;
import com.ai.omframe.instance.ivalues.IQOfferUserValue;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.ai.omframe.util.SoServiceFactory;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.so.common.bo.BOInsUserCustInfoBean;

/**
 * @Author xuecy
 * @Date: 2014/8/15
 * @Since Build {insert version here} (MM YYYY)
 * @RealUser:Chunyang Xue
 * @Time: 15:01
 * @Package:com.asiainfo.crm.so.teaminvoke.out.instance.service.interfaces
 * @E_mail:xuecy@asiainfo-linkage.com
 */
public interface ICrmInsFSV {
    /**
     * @Function: query360UserList
     * @Description: 360查询客户下用户列表
     * @param: custId,客户id
     *         custType,客户类型
     *         userId,用户编号
     *
     */
    public DataContainer[] query360UserList(long custId, String custType, long userId) throws Exception, RemoteException;

    /**
     * @Function: getUserBaseInfoByCustId
     * @Description: 根据客户ID获取用户信息
     * 如果只提供custId则通过CM_INS_CMREL查询出该custid下所有用户信息，如果输入了billId或userId则只查询输入信息的用户
     * 优先级：UserId>BillId>CustId
     * @param: custId,客户id,不传传0
     *         billId,计费号码
     *         userId,用户编号
     *         param,扩展
     * @throws RemoteException
     * @return：BOInsUserCustInfoBean[]
     * custId;客户id
     * billId;计费号码
     * prodSpecId;产品规格id
     * prodSpecName;产品规格名称
     * simCard;卡号信息
     * userStatus;用户状态
     * offerType;策划类型
     * offerName;基本策划名称
     * offerId;基本策划id
     * offerCharge;基本策划的费用
     * offerDesc;基本策划描述
     * @throws：Exception, RemoteException
     */
    public BOInsUserCustInfoBean[] getUserBaseInfoByCustId(long custId,String billId,long userId,Map param,int start,int end) throws Exception, RemoteException;

    public BOInsUserCustInfoBean generataeBoInsUserAccInfo(long userId) throws Exception,RemoteException;
   
    /**
     * 保存客户用户关系
     * @param aInsCmRelValue
     * @param operation(1:新增,2：修改;)
     * @throws Exception
     */
    public void saveInsCmRel(IInsCmRelValue aInsCmRelValue, long operation)throws Exception;
    
    /**
     * 删除客户用户关系， 根据userId转移ins_cmrel表里面的数据到ins_des_cmrel表
     * @param userId
     * @throws Exception
     */
    public void delInsCmRel(long userId)throws Exception;
    
    /**
     * 查询客户用户关系
     * @param userId
     * @return
     * @throws Exception
     */
    public IInsCmRelValue queryInsCmRelByUserId(long userId) throws Exception;
    
    /**
     * 查询客户用户关系,使用者，拥有者都查询出
     * @param userId
     * @return
     * @throws Exception
     */
    public IInsCmRelValue[] getInsCmRelValuesByUserId(long userId) throws Exception,RemoteException;

    public int getNumOpenAccounts(long custId) throws RemoteException,Exception ;
    
    public IQOfferUserValue[] queryInsOffInsUserList(String regionId,String billId,long offerInstId, long roleId, int validType, String isMainRole, int startRowIndex, int endRowIndex)throws Exception;

    /**
     * 使用多个UserId，查询insUser and  InsUserOsState数据
    * <p>Title: </p>
    * <p>Description: </p>
    * <p>Company: AsiaInfo</p> 
    * @author YuJing
    * @date 2019-9-10
    * ICrmInsFSV
     */
    public Map getUserBasicInfoByUserIdsForOSE(long[] userIds) throws Exception;
    
    /**
     * 使用多个regionid多个UserId，查询insUser and  InsUserOsState数据
    * <p>Title: </p>
    * <p>Description: </p>
    * <p>Company: AsiaInfo</p> 
    * @author YuJing
    * @date 2020-2-28
    * ICrmInsFSV
     */
    public Map getUserBasicInfoByUserIdsForOSE(Map<String,List<Long>> regionIdUserIdMap) throws Exception;
}
