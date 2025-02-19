package com.asiainfo.crm.so.instance.rboss.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.omframe.instance.bo.InsOffInsUserBean;
import com.ai.omframe.instance.ivalues.*;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountValue;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public interface IInsQrySV{
/**
 * 根据billId得到用户实例
 * @param billId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsUserValue getInsUserByBillId(String billId) throws RemoteException,Exception ;
/**
 * 根据userid,isMain得到用户实例下的策划实例
 * @param userId
 * @param isMain -1：全部策划，0：非主策划，1：主策划
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsOffInsUserValue[] getOfferUsersByUserId(long userId,int isMain,int validType) throws RemoteException, Exception ;

/**
 * 根据userId得到主策划
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsOfferValue getMainOfferByUserId(long userId) throws RemoteException,Exception ;
/**
 * 根据userId得到主策划实例
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsOfferValue getMainInsOfferByUserId(long userId) throws RemoteException,Exception ;
/**
 * 根据userId得到用户订购的所有策划
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsOfferValue[] getOffersByUserId(long userId,int isMain,int validType) throws RemoteException,Exception ;
/**
 * 根据用户实例下的策划实例得到产品实例
 * @param userId
 * @param prodId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsProdValue getProds(long userId, long prodId)throws RemoteException,Exception ;
/**
 * 根据产品实例得到实例产品下的实例服务
 * @param instProdId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsProdInsSrvValue[] getProdSrvs(long instProdId,long userId,String destRegionId) throws RemoteException,Exception ;
/**
 * 根据userId得到指定策划实例
 * @param userId,offerId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsOfferValue getSpecOfferByUserId(String userId,String offerId) throws RemoteException,Exception;
/**
 * 根据用户Id得到用户的所有群组策划
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsOfferValue[] getGroupOffersByUserId(long userId,String regionId)throws RemoteException,Exception;
/**
 * 根据UserId得群组下的所有用户
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsUserValue[] getGroupUsersByUserId(long userId,long offerId,int isMain)throws RemoteException,Exception;

/**
 * 判断是否为群组成员
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public boolean isGroupOffer(long offInstId) throws RemoteException,Exception;

/**
 * 获取群组策划用户实例关系
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public List getAllGroupOffUsersByUserId(long userId)throws RemoteException,Exception;

/**
 * 获取用户参与的群组套餐及用户角色
 * @param userId
 * @param regionId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public DataContainerInterface[] getRolesByUserId(long userId,String regionId)throws RemoteException,Exception;
/**
 * 根据billId，offerId,attrId获取对应群组的所有长短号
 * @param billId
 * @param offerId
 * @param attrId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsSrvAttrValue[] getAttrsByUserId(String billId,long offerId,long attrId) throws RemoteException,Exception;
/**
 * 获取系统时间
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public Timestamp getCurrentTime() throws RemoteException,Exception;
/**
 * 
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public DataContainerInterface getRolesByUserId(long userId)throws RemoteException,Exception;
/**
 * 
 * @param userId
 * @param offerId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsUserValue getVirtualUserByUserId(long userId,long offerId) throws RemoteException, Exception;

/**   
* @Function: getInsOfferByInsOfferId
* @Description: 根据策划实例编号查询策划实例
*
* @param insOfferId
* @return
* @throws RemoteException
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-3-29 下午01:42:19 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-3-29     huangkl           v1.0.0            
*/
public IInsOfferValue getInsOfferByInsOfferId(long insOfferId) throws RemoteException,Exception;

/**   
* @Function: getRecentInsOfferByOfferIdAndUserId
* @Description: 根据策划实例和用户编号查询最近生效的策划实例，用于回退策划
*
* @param offerId
* @param userId
* @return
* @throws RemoteException
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-3-30 上午08:15:08 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-3-30     huangkl           v1.0.0          
*/
public IInsOfferValue getRecentInsOfferByOfferIdAndUserId(long offerId,long userId)throws RemoteException,Exception;

/**
 * 是否加入了某个群组
 * @param billId
 * @param offerId
 * @return
 * @throws Exception
 */
public boolean isIncluded(String billId,long offerId) throws Exception;
/**
 * 用户是否在本月内退出过本群组
 * @param billId
 * @param offInstId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public boolean isCanceledInThisMonth(String billId,long offInstId) throws RemoteException, Exception;


public IInsOffInsUserValue[] getInsOffInsUserByInsOfferId(long insOfferId) throws Exception,RemoteException;
/**
 * 根据userID,OFFID得到订购关系数量
 * @param userId
 * @param offerId
 * @return
 * @throws Exception
 * @throws RemoteException
 */
public int getInsOffInsUserCountByUserId(String billId,long offerId)throws Exception,RemoteException;
/**
 * 
 * @param billId
 * @param offerId
 * @return
 * @throws Exception
 */
public IInsOffInsUserValue getOffUserByOfferIdAndUserId(String billId,long offerId) throws Exception;

/**
 * 根据用户实例下的策划实例得到产品实例
 * @param userId
 * @param offerInstId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsProdValue[] getProdsByOffInstIdUserId(long userId, long offerInstId)throws RemoteException,Exception ;

/**
 * 根据用户实例下的策划实例得到产品实例
 * @param userId
 * @param offerInstId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsUserValue getInsUserByImsi(String imsi)throws RemoteException,Exception ;
/**
 * 根据主角色billid找到家庭套餐
 * @param billId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IInsOfferValue getFamilyOfferByBillId(String billId) throws RemoteException,Exception;

public IInsOffInsUserValue[] getInsOffUsersNotExpired(long offInstId,int validType) throws Exception;
/**
 * 根据虚用户得到家长编号
 * @param virtualBillId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public long getInsUserIdByVirtualUserId(long virtualUserId) throws RemoteException,Exception;

/**   
* @Function: getZoneProdsByUserId
* @Description: 查询用户下小区产品
*
* @param userId
* @return
* @throws RemoteException
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-5-18 下午05:54:11 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-5-18     huangkl           v1.0.0            
*/
public IInsProdValue[]  getZoneProdsByUserId(long userId)throws RemoteException,Exception ;

/**   
* @Function: getZoneProdSrvsByUserId
* @Description: 查询用户下小区服务
*
* @param userId
* @return
* @throws RemoteException
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-5-18 下午05:58:39 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-5-18     huangkl           v1.0.0            
*/
public IInsProdInsSrvValue[] getZoneProdSrvsByUserId(long userId)throws RemoteException,Exception ;

/**   
* @Function: isZoneSrv
* @Description: 判断是否小区服务
*
* @param serviceId
* @return
* @throws RemoteException
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-5-18 下午05:58:58 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-5-18     huangkl           v1.0.0            
*/
public boolean isZoneSrv(long serviceId) throws RemoteException,Exception ;

/**   
* @Function: getHisInsOfferByOfferInsIdAndDoneCode
* @Description: 查询历史策划实例
*
* @param offerInsId
* @param insDoneCode
* @param yearMonth
* @return
* @throws RemoteException
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-5-28 下午02:39:48 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-5-28     huangkl           v1.0.0            
*/
public IInsOfferValue[] getHisInsOfferByOfferInsIdAndDoneCode(long offerInsId,String insDoneCode,String yearMonth) throws RemoteException,Exception ;


/**   
* @Function: getHisInsOfferByOfferInsIdAndDoneCode
* @Description: 查询历史策划实例 根据userId来路由
*
* @param offerInsId
* @param insDoneCode
* @param yearMonth
* @param userId
* @return
* @throws RemoteException
* @throws Exception
*
* @version: v1.0.0
* @author: liuke
* @date: 2011-9-14 下午07:39:48 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-9-14     liuke           v1.0.0            
*/
public IInsOfferValue[] getHisInsOfferByOffInsIdAndDoneCodeAndUserId(long offerInsId,String insDoneCode,
		String yearMonth,long userId) throws RemoteException,Exception ;

/**   
* @Function: getHisInstSrvpkgByInstIdAndDoneCode
* @Description: 查询历史产品实例
*
* @param insOfferId
* @param userId
* @param srvpkgId
* @param validType
* @param insDoneCode
* @param yearMonth
* @return
* @throws RemoteException
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-5-30 上午07:57:17 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-5-30     huangkl           v1.0.0            
*/
public IInsProdValue[] getHisInstSrvpkgByInstIdAndDoneCode(long insOfferId,long userId,long srvpkgId,int validType,String insDoneCode,String yearMonth) throws RemoteException,Exception ;

/**   
* @Function: getHisInstServpkgInstSrvByInstSrvpkgIdAndDoneCode
* @Description:查询产品服务关系历史
*
* @param aInstSrvpkgId
* @param userId
* @param validType
* @return
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-5-30 上午08:44:43 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-5-30     huangkl           v1.0.0            
*/
public IInsProdInsSrvValue[] getHisInstServpkgInstSrvByInstSrvpkgIdAndDoneCode(
		long aInstSrvpkgId,long userId,int validType,String insDoneCode,String yearMonth) throws RemoteException,Exception ;

/**   
* @Function: getHisInstSrvAttrByRelateInstIdAndDoneCode
* @Description: 查询服务属性历史
*
* @param insSrvpkgSrvRelatId
* @param userId
* @param validType
* @param insDoneCode
* @param yearMonth
* @return
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-5-30 上午11:38:07 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-5-30     huangkl           v1.0.0            
*/
public IInsSrvAttrValue[] getHisInstSrvAttrByRelateInstIdAndDoneCode(
		long insSrvpkgSrvRelatId,long userId,int validType,String insDoneCode,String yearMonth) throws RemoteException,Exception ;

/**   
* @Function: getHisInstOfferInstUserByOffUserAndDoneCode
* @Description: 查询策划用户关系历史
*
* @param aInstOfferId
* @param userId
* @param destRegionId
* @param insDoneCode
* @param yearMonth
* @return
* @throws Exception
*
* @version: v1.0.0
* @author: huangkl
* @date: 2011-5-30 下午01:18:33 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-5-30     huangkl           v1.0.0            
*/
public IInsOffInsUserValue getHisInstOfferInstUserByOffUserAndDoneCode(long aInstOfferId, long userId ,String destRegionId,String insDoneCode,String yearMonth) throws RemoteException,Exception ;
/**
 * 
 * @Function: IInsQrySV::getYjshOfferByBillId
 * @Description: 根据主角色billid找到一机双号的套餐
 * @param billId
 * @return
 * @throws RemoteException
 * @throws Exception
 * @version: v1.1.0
 * @author: haojh
 * @date: Jul 1, 2011 4:39:17 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *-------------------------------------------------------------
 * Jul 1, 2011     haojh          v1.1.0               修改原因
 */
public IInsOfferValue getYjshOfferByBillId(String billId) throws RemoteException,Exception;

	
/**
 * @Function: getHisInsOfferByOfferInsIdAndRegionId
 * @Description: 查询历史策划实例 根据region_id路由
 * @param offerInsId 策划实例id
 * @param insDoneCode  
 * @param regionId 实例归属地市
 * @param yearMonth 月份
 * 
 * @return
 * @throws RemoteException
 * @throws Exception
 * @version: v1.1.0
 * @author: liuke
 * @date: Jul 10, 2011 4:39:17 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *-------------------------------------------------------------
 * Jul 10, 2011     liuke          v1.1.0               修改原因
 */
 public IInsOfferValue[] getHisInsOfferByOfferInsIdAndRegionId(long offerInsId,String insDoneCode,
					String regionId,String yearMonth) throws RemoteException,Exception;
/**
 * 
 * @Function: IInsQrySV::getAllGroupMembersByBillId
 * @Description: 查询该策划实例下所有成员关系 考虑跨中心
 * @param mainOfferInstanceId
 * @param regionId
 * @return
 * @throws Exception
 * @throws RemoteException
 * @version: v1.1.0
 * @author: haojh
 * @date: Jul 13, 2011 11:43:14 AM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *-------------------------------------------------------------
 * Jul 13, 2011     haojh          v1.1.0               修改原因
 */
public IQOfferUserValue[] getAllGroupMembersByBillId(long mainOfferInstanceId,String regionId)throws Exception ,RemoteException;

/**
 * 根据属性实例编号查询属性实例的详细信息
 * @param srvAttrInsId
 * @param userId
 * @param validType
 * @return IInsSrvAttrValue[]
 * @throws Exception
 */
public IInsSrvAttrValue[] getInstSrvAttrByAttrInsId(long srvAttrInsId,long userId,int validType) throws Exception;

/***
 * 
 * @Function: getAcct4FamilyUserCount
 * @Description: 根据账户关系查询其订购的有家庭套餐类型的用户数量。用于判断账户是否为家庭套餐用户付费。
 * @param acctId
 * @return
 * @throws Exception
 *
 * @version: v1.0.0
 * @author: chaoyx
 * @date:  Aug 30, 201110:19:37 PM
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Aug 30, 201110:19:37 PM      chaoyx           v1.0.0
 */
public int getAcct4FamilyUserCount(long acctId) throws Exception,RemoteException;

/*
 * 根据账户Id获取账户名称与用户名称一致的用户信息
 */
public IInsUserValue[] getAccrelAndCustByAcctId(long acctId)throws Exception;
/**
 * 根据userId得到主账户
 * @param userId
 * @return
 * @throws RemoteException
 * @throws Exception
 */
public IBOCmAccountValue queryAccountByUserId(long userId) throws RemoteException, Exception;

/**
 * 
 *
 * @Function: getInstSrvAttrBatchByUserId
 * @Description: 根据用户编码和属性编码查询实例详细信息
 *
 * @param:	userId	用户编码 
 * @param:	attrId	属性编码
 * @return：IInsSrvAttrValue
 * @throws：Exception , RemoteException
 *
 * @version: V1.0.0
 * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
 * @date: 2012-9-6 上午10:44:28 
 *
 * Modification History:
 * Date                     Author          Version            Description
 *---------------------------------------------------------------------*
 * 2012-9-6  上午10:44:28        Joes.Xin          V1.0.0             Add
 *
 */
public IInsSrvAttrValue[] getInstSrvAttrBatchByUserId(long userId,long attrId) throws Exception , RemoteException ;

public IInsUserValue getInsUserByImsi(String imsi, int validType) throws RemoteException, Exception;

public IInsOfferValue[] getInsOfferByCustIdAndOfferType(long custId,String offerType, String regionId) throws Exception;

/**
 *通过客户ID查询用户信息
 * @param custId
 * @return
 * @throws Exception
 * @throws RemoteException
 */
public IQUserBaseInfoValue[] qetDealedUserBaseInfo(long custId ,String qryType,String regionId,String specId) throws Exception, RemoteException;

/**
 * 根据策划编号查询策划实例
 * @param offerId
 * @param regionId
 * @return
 * @throws Exception
 */
public IInsOfferValue[] getInstOfferByOfferId(long offerId,String regionId) throws Exception;

/**
 * 查询协议期接口
 *
 * @return
 * @throws Exception
 */
public IInsCommitmentValue[] getInsCommitment(long commitmentInsId, long userId, long offerId,long offerInstId, int validType,int commType,long srcOfferId) throws Exception, RemoteException;
   

	/**
	 * 1196 move agr
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2016-10-14
	* IAgrOfferInstSV
	 */
	public long  getInsOffInsUesrId(String regionid) throws Exception;
	
	public IInsOfferValue[] getInsOfferByCustIdAndOfferIds(long custId,Long[] offerIds,String regionId,int validType)throws Exception;
	
	/**
 	 * 查询 ins_off_ins_user 记录(分页)
	 * 解决大量子成员用户的群组用户 性能问题
	 * @param offerInstId
	 * @param roleId
	 * @param isMainRole
	 * @param validType
	 * @param startRowIndex
	 * @param endRowIndex
	 * @return
	 * @throws Exception
	 */
    public InsOffInsUserBean[] queryInsOffInsUserList(long offerInstId, long userId, long roleId, String isMainRole, int validType, int startRowIndex, int endRowIndex)throws Exception;
    public int queryInsOffInsUserListCount(long offerInstId, long userId, long roleId, String isMainRole, int validType)throws Exception;
    
    /**
     * 根据客户ID和groupId获取有效订购offerInstList
    * <p>Title: </p>
    * <p>Description: </p>
    * <p>Company: AsiaInfo</p> 
    * @author YuJing
    * @date 2018-3-19
    * InsQrySVImpl
     */
    public  DataContainerInterface[]  queryInsOfferByCustIdAndGroupId(long custId,long groupId,String regionId) throws Exception;
    
    /**
     * 根据客户ID和fmcType获取所有有效订购offerInstList
     * <p>Title: </p>
     * <p>Description: </p>
     * <p>Company: AsiaInfo</p> 
     * @author YuJing
     * @throws Exception 
     * @date 2018-3-19
     * InsQrySVImpl
     */
    public  DataContainerInterface[]  queryInsOfferByCustIdAndFMCType(long custId,String fmcType,String regionId) throws Exception;
    
    /**
	 * 获取FMC offerList 
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-3-20
	* IInsQryDAO
	 */
	public DataContainerInterface[] queryInsOfferByCustIdAndGroupIds(long custId,List<String> groupIds,String regionId)throws Exception;
	
	/**
	 * 根据custid，userid，groupids 查询ins_offer 记录
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-4-9
	* InsQrySVImpl
	 */
	public DataContainerInterface[] getOfferlistByCustIdAndUserIdAndGroupIds(long custId,long userId,List<String> groupIds)throws Exception;
   
	public List qryInsUserByConditions(String sql, Map param) throws Exception;
	
	public IInsUserValue[] qryInsUserBySql(String sql, Map param)throws Exception;

	/**
	 *
	 * @param custType
	 * @param offerIds
	 * @param regionId
	 * @return
	 * @throws Exception
	 */
	public IInsOfferValue [] qryInsOfferByCustTypeAndOfferIds(String custType,Long [] offerIds,String regionId) throws Exception;
}
