package com.asiainfo.crm.cm.custgroup.utils;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.pce.service.interfaces.IProductFSV;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupCheckSV;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupInvitationSV;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupLogSV;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupMemberSV;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupSV;
import com.asiainfo.crm.cm.custgroup.service.interfaces.IGeneralConfigSV;
import com.asiainfo.crm.cm.custgroup.service.interfaces.IInvitationCodeSV;
import com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces.ICust2CustGroupSV;
import com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces.IRes2CustGroupSV;
import com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces.ISo2CustGroupSV;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IFmcBusiSV;

/**
 *	外部服务的管理工厂（所有外部服务调用，通过工厂类生成服务，来调用外部接口，更好的与外部解耦） 
 */
public class InnerServiceFactory {
	/**
	 * 获取 引入客管的服务类
	 * @return
	 * @throws Exception
	 */
	public static ICust2CustGroupSV getCustomerSV() throws Exception{
		return (ICust2CustGroupSV) ServiceFactory.getService(ICust2CustGroupSV.class);
	}
	/**
	 * 获取 引入资源的 服务类
	 * @return
	 * @throws Exception
	 */
	public static IRes2CustGroupSV getResourceSV() throws Exception{
		return (IRes2CustGroupSV) ServiceFactory.getService(IRes2CustGroupSV.class);
	}
	/**
	 * 获取 引入 crm的 服务类
	 * @return
	 * @throws Exception
	 */
	public static ISo2CustGroupSV getSo2CustGroupSV() throws Exception{
		return (ISo2CustGroupSV) ServiceFactory.getService(ISo2CustGroupSV.class); 
	}
	
	/**
	 * 引入 产品的 服务
	 * @return
	 * @throws Exception
	 */
	public static IProductFSV getProductSV() throws Exception{
		return (IProductFSV) ServiceFactory.getService(IProductFSV.class); 
	}
	
	public static ICustGroupSV getCustGroupSV() throws Exception{
		return (ICustGroupSV) ServiceFactory.getService(ICustGroupSV.class);
	}
	
	public static ICustGroupMemberSV getCustGroupMemberSV() throws Exception{
		return (ICustGroupMemberSV) ServiceFactory.getService(ICustGroupMemberSV.class);
	}
	
	public static IGeneralConfigSV getCmGeneralConfigSV() throws Exception{
		return (IGeneralConfigSV) ServiceFactory.getService(IGeneralConfigSV.class);
	}
	
	public static IFmcBusiSV getFmcBusiSV() throws Exception{
		return (IFmcBusiSV) ServiceFactory.getService(IFmcBusiSV.class);
	}
	
	public static ICustGroupInvitationSV getCustGroupInvitationSV() throws Exception{
		return (ICustGroupInvitationSV) ServiceFactory.getService(ICustGroupInvitationSV.class);
	}
	
	public static ICustGroupLogSV getCustGroupLogSV() throws Exception{
		return (ICustGroupLogSV) ServiceFactory.getService(ICustGroupLogSV.class);
	}
	
	public static ICustGroupCheckSV getCustGroupCheckSV() throws Exception{
		return (ICustGroupCheckSV) ServiceFactory.getService(ICustGroupCheckSV.class);
	}
	
	public static IInvitationCodeSV getInvitationCodeSV() throws Exception{
		return (IInvitationCodeSV) ServiceFactory.getService(IInvitationCodeSV.class);
	}
}
