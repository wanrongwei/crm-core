package com.asiainfo.crm.cm.service.interfaces;

import java.rmi.RemoteException;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmIndivCustomerSV.java
 * @Description: 个人客户管理服务接口
 *
 * @version: v1.0.0
 * @author: niwei
 * @date: Feb 22, 2011 4:58:29 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Feb 22, 2011		niwei           v1.0.0               修改原因
 */
public interface ICmIndivCustomerSV
{
    
    
	/**   
	 * @Function: ICmIndivCustomerSV.java
	 * @Description: 根据个人客户id查询个人客户
	 *
	 * @param indivCustId 个人客户id
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Feb 22, 2011 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Feb 22, 2011     niwei           v1.0.0               修改原因
	 */
	public IBOCmIndivCustomerValue queryIndivCustomerById(long indivCustId) throws Exception, RemoteException;
	/**   
	 * @Function: queryIndivCustomerByCustNameAndBirthday
	 * @Description: 根据个人客户名称和生日查询客户
	 *
	 * @param indivCustId 个人客户id
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date 6 23, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 6 23, 2014     huangqun         v1.0.0               修改原因
	 */
	public IBOCmIndivCustomerValue[] queryIndivCustomerByCustNameAndBirthday(String custName,String birthday)throws Exception;
	/**   
	 * @Function: queryCustAddressByCustId
	 * @Description: 根据个人客户名称和生日查询客户
	 *
	 * @param indivCustId 个人客户id
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date 6 23, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 6 23, 2014     huangqun         v1.0.0               修改原因
	 */
	public IBOCmCustContactMediumValue queryCustAddressByCustId(String type,long custId)throws Exception;
	/**   
	 * @Function: queryDuplicateCust
	 * @Description: 查询客户合并信息
	 *
	 * @param cprIds
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 8 28, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 8 28, 2014     huangqun         v1.0.0               修改原因
	 */
	public ICustomerValue[] queryDuplicateCust(String cprIds,int start,int end)throws Exception;
	/**   
	 * @Function: queryDuplicateCustCount
	 * @Description: 查询客户合并信息
	 *
	 * @param cprIds
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 8 28, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 8 28, 2014     huangqun         v1.0.0               修改原因
	 */
	public int queryDuplicateCustCount(String cprIds)throws Exception;
	/**   
	 * @Function: saveAKSInfo(long custId,int status)
	 * @Description: 保存客户AKS订购信息
	 *
	 * @param cprIds
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 9 10, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 9 10, 2014     huangqun         v1.0.0               修改原因
	 */
	public void saveAKSInfo(long custId,int status)throws Exception;
	/**   
	 * @Function: ifCustIsProtected(long custId)
	 * @Description: 判断客户是否是受保护的
	 *
	 * @param cprIds
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 9 11, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 9 11, 2014     huangqun         v1.0.0               修改原因
	 */
	public boolean ifCustIsProtected(long custId)throws Exception;
	/**   
	 * @Function: validateCPR
	 * @Description: 调用实时接口校验CPR
	 *
	 * @param cprIds
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 9 15, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 9 15, 2014     huangqun         v1.0.0               修改原因
	 */
	public Map validateCPR(Map params)throws Exception;
	/**   
	 * @Function: whetherCprCanEdit
	 * @Description: 判断CPR是否可编辑
	 *
	 * @param cprIds
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 11 18, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 11 18, 2014     huangqun         v1.0.0               修改原因
	 */
	public boolean whetherCprCanEdit(long custId)throws Exception;
	/**   
	 * @Function: dealModifyCPR
	 * @Description: 修改CPR号码逻辑,flag为Y需要送CPR否则不需要
	 * @param inputFirstName
	 * @param inputLastName
	 * @param inputBirthday
	 * @param saveScene
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 11 18, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 11 18, 2014     huangqun         v1.0.0               修改原因
	 */
	public DataContainer dealModifyCPR(String custId, String custCertCode, String flag, String inputFirstName, String inputLastName,
									   String inputBirthday, String saveScene) throws Exception;
	/**   
	 * @Function: queryPartyInfo
	 * @Description: 查询party的相关信息
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 12 01, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 12 01, 2014     huangqun         v1.0.0               修改原因
	 */
	public DataContainer[] queryPartyInfo(long partyId)throws Exception;
	/**   
	 * @Function: queryCustomerSendToCPR
	 * @Description: 查询送CPR的客户
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 12 01, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 12 01, 2014     huangqun         v1.0.0               修改原因
	 */
	public DataContainer[] queryCustomerSendToCPR(long custId)throws Exception;
	/**   
	 * @Function: queryCmCustRequestInfo
	 * @Description: 查询工单信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 12 01, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 12 01, 2014     huangqun         v1.0.0               修改原因
	 */
	public IBOCmCustRequestTaskValue[] queryCmCustRequestInfo(String requestStatus)throws Exception;
	/**   
	 * @Function: queryCmCustRequestInfo
	 * @Description: 根据PNR查询custId
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date 12 05, 2014 4:59:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 12 05, 2014     huangqun         v1.0.0               修改原因
	 */
	public long queryCustIdByPNR(long cprId)throws Exception;
	/**
	 * 跟新地址信息
	 * @Function saveCustAddress
	 * @Description 
	 *
	 * @param custId
	 * @param addressId
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-4-30 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-18     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveCustAddress(long custId, long addressId) throws Exception ;
	
	/**
	 * 根据party id查询cm_indiv_customer的有效记录
	 * @return
	 * @throws Exception
	 */
	public IBOCmIndivCustomerValue[] queryCmIndivCustByPartyId(String partyId) throws Exception;

	/**
	 * 获取CPR_NUMBER、CPR_PROFILE是否可编辑
	 *
	 *
	 * @param custId
	 * @param partyId
	 * @param guiType
	 * @param registerType
	 * @return
	 * @throws Exception
	 */
	Map<String, String> getCprEditMapFromMatrix(long custId, long partyId, String guiType, String registerType) throws Exception;

	/**
	 * Party修改CPR
	 *
	 * @param partyId
	 * @param custCertCode
	 * @param inputFirstName
	 * @param inputLastName
	 * @param inputBirthday
	 * @return
	 * @throws Exception
	 */
	DataContainer dealModifyPayerCPR(long partyId, String custCertCode, String inputFirstName, String inputLastName, String inputBirthday) throws Exception;

	/**
	 * Order页面能编辑CPR NUMBER的条件：CPR为空+满足矩阵+有任一权限
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	String getCprModifyPermission(long custId) throws Exception;
}
