package com.asiainfo.crm.cm.service.interfaces;

import java.rmi.RemoteException;
import java.util.Map;

import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;

/**
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 调用web服务接口
 *
 * @version v1.0.0
 * @author xingyh
 * @date Feb 16, 2012 9:44:17 AM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Feb 16, 2012     xingyh           v1.0.0               修改原因<br>
 */
public interface IWebServiceInterfacesSV {

	
	/**
	 * 查询客户经理的信息
	 * @Function getAllCustManager
	 * @Description 
	 *
	 * @param custManagerName
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 16, 2012 10:27:46 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 16, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public IBOSecOperatorValue[] getAllCustManager(String custManagerName)  throws Exception,RemoteException ;
	
	/**
	 * 发送二电子VIp卡
	 * @Function TransSendImage
	 * @Description 
	 *
	 * @param request
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 16, 2012 3:05:28 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 16, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	
	public Map SendVipCard(Map map)throws Exception , RemoteException;
	/**
	 * 通过手机号码查询用户编号
	 * @Function getUserIdByPhone
	 * @Description 
	 *
	 * @param phone
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 17, 2012 11:02:32 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public long getUserIdByPhone(String phone)throws Exception , RemoteException;
	
	/**
	 * 通过用户编号获得手机号码
	 * @Function getPhoneByUserId
	 * @Description 
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author wangxch
	 * @date Feb 18, 2012 2:25:08 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 18, 2012     wangxch           v1.0.0               修改原因<br>
	 */
	public String getPhoneByUserId(long  userId) throws Exception, RemoteException ;
	/**
	 * 通过手机号码查询客户编号
	 * @Function getUserIdByPhone
	 * @Description 
	 *
	 * @param phone
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 17, 2012 11:02:32 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public long getCustIdByPhone(String phone) throws Exception, RemoteException ;
	/**
	 * 通过客户编号查询用户信息
	 * @Function getUserId
	 * @Description 
	 *
	 * @param custId
	 * @param custType
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Apr 23, 2012 5:28:08 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 23, 2012     xingyh          v1.0.0               修改原因<br>
	 */
	public String  getUserId(long custId,String custType)throws Exception, RemoteException ;
	
}
	