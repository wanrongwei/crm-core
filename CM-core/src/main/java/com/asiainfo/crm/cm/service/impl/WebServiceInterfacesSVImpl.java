package com.asiainfo.crm.cm.service.impl;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.common.service.interfaces.CenterConst;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.service.interfaces.IInstanceQrySV;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.asiainfo.crm.cm.service.interfaces.IWebServiceInterfacesSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

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
public class WebServiceInterfacesSVImpl implements IWebServiceInterfacesSV {

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
	public IBOSecOperatorValue[] getAllCustManager(String custManagerName) throws Exception, RemoteException {
		return null;
	}

	/**
	* 发送二维码接口
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

	public Map SendVipCard(Map map) throws Exception, RemoteException {
		return null;
	}

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
	public long getUserIdByPhone(String phone) throws Exception, RemoteException {
		// 获得手机号码获得客户编号的服务接口
		IInstanceQrySV interfaceSv = (IInstanceQrySV) ServiceFactory.getService(IInstanceQrySV.class);
		// 根据手机号码获得客户id
		IInsUserValue[] userValue = interfaceSv.getInstUserByBillId(phone, 1);
		if (userValue == null) {
			ExceptionUtil.throwBusinessException("CMS0080313", phone); // 通过手机号码[{0}]，无法查询到此用户信息！
		}
		return userValue[0].getUserId();
	}

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
	public String getPhoneByUserId(long userId) throws Exception, RemoteException {
		// 获得手机号码获得客户编号的服务接口
		IInstanceQrySV interfaceSv = (IInstanceQrySV) ServiceFactory.getService(IInstanceQrySV.class);
		// 根据手机号码获得客户id
		IInsUserValue[] userValue = interfaceSv.getInstUserByUserId(userId, 1);
		if (userValue == null) {
			ExceptionUtil.throwBusinessException("AMS0700192", String.valueOf(userId)); // 根据用户编号[{0}]没有查询到用户信息！
		}
		return userValue[0].getBillId();

	}

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
	public long getCustIdByPhone(String phone) throws Exception, RemoteException {
		// 获得手机号码获得客户编号的服务接口
		IInstanceQrySV interfaceSv = (IInstanceQrySV) ServiceFactory.getService(IInstanceQrySV.class);
		// 根据手机号码获得客户id
		IInsUserValue[] userValue = interfaceSv.getInstUserByBillId(phone, 1);
		if (userValue == null) {
			ExceptionUtil.throwBusinessException("CMS0080313", phone); // 通过手机号码[{0}]，无法查询到此用户信息！
		}
		return userValue[0].getCustId();
	}

	public String getUserId(long custId, String custType) throws Exception, RemoteException {
		ICrmFSV interfaceSv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
		CenterFactory.setCenterInfoByTypeAndValue(CenterConst.REGION_ID, CenterUtil.getAllRegionIds()[0]);
		IInsUserValue[] userValue = interfaceSv.getInsUserValue(custId, custType);
		String userId = "";
		if (userValue != null) {
			for (int i = 0; i < userValue.length; i++) {
				if (StringUtils.isBlank(userId)) {
					userId = String.valueOf(userValue[i].getUserId());
				} else {
					userId = userId + "," + String.valueOf(userValue[i].getUserId());
				}
			}
		}
		return userId;
	}

}
