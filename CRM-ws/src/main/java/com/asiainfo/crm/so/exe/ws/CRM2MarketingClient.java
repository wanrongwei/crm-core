package com.asiainfo.crm.so.exe.ws;

import java.util.Map;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.so.common.bboss.service.interfaces.IBbossBusiNoCenterSV;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.ai.omframe.order.ivalues.IOrdOfferValue;
import com.ai.omframe.util.SoServiceFactory;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsClient;
import com.asiainfo.crm.so.exe.ws.third.BBossInterStartInfoBean;

/**
 * CRM调用营销平台的CRM侧客户端服务
 * @author Adam
 * @date Apr 14, 2011
 */
public class CRM2MarketingClient extends WsClient {
	
	private transient Log log = LogFactory.getLog(CRM2MarketingClient.class);
	
	private static CRM2MarketingClient client;
	
	private String USER_NAME;
	
	private String PWD;
	
	private CRM2MarketingClient(String cfgWsClientCode) throws Exception {
		super(cfgWsClientCode);
//		IBOBsStaticDataValue[] staticDataUser = StaticDataUtil.getStaticData(BBossConst.MARKETING_CERT.USER);
//		IBOBsStaticDataValue[] staticDataPWD = StaticDataUtil.getStaticData(BBossConst.MARKETING_CERT.PWD);
//		if (null == staticDataUser || 0 == staticDataUser.length || null == staticDataPWD || 0 == staticDataPWD.length) {
//			//根据code_type:{0}和{1}在bs_static_data表没有查到营销平台认证信息！请检查配置
//			ExceptionUtil.throwBusinessException("SOS2001389", BBossConst.MARKETING_CERT.USER, BBossConst.MARKETING_CERT.PWD);
//		}
//		USER_NAME = staticDataUser[0].getCodeValue();
//		PWD = staticDataPWD[0].getCodeValue();
	}
	
	public static CRM2MarketingClient getCRM2MarketingClient() throws Exception{
		if (null == client) {
			client = new CRM2MarketingClient("ServiceForCRM");
		}
		return client;
	}
	
	/**
	  *	发送营销平台，进行局数据制作
	  * @Function: CRM2MarketingClient.java
	  * @Description: 
	  *
	  * @param orderOfferId			策划订单ID
	  * @param taskId				人工节点taskId
	  * @param orderType			订单类型，见{@link com.asiainfo.crm.so.common.BBossConst.CRM_2_MARKETING_ORDER_TYPE ORDER_TYPE}
	  * @param remoteWorkflowName	远程工作流名称
	  * @param taskStaffId			操作员ID
	  * @param businessId			操作ID
	  * @param regionId				地区编码
	  * @throws Exception
	  *
	  * @version: 1.0.0
	  * @author: dingyd
	  * @date: Apr 22, 2011 10:39:13 AM
	  *
	  * Modification History:
	  * Date           Author          Version            Description
	  *--------------------------------------------------------------*
	  * Apr 22, 2011   dingyd			 v1.0.0                                     
	  */
	public void makeOfficeData(String orderOfferId, String taskId, String orderType, 
				String remoteWorkflowName, String taskStaffId, String businessId, String regionId) throws Exception{
		
		IOrdOfferValue ordOfferValue = SoServiceFactory.getOrderQrySrv().getOrderOfferByOrderOfferId(Long.parseLong(orderOfferId));
		if(null == ordOfferValue){
			//根据策划订单编号[{0}]查询策划订单失败
			ExceptionUtil.throwBusinessException("OMS1000073", orderOfferId);
		}
		
		long customerOrderId = ordOfferValue.getCustomerOrderId();
		IOrdCustValue ordCustValue = SoServiceFactory.getOrderQrySrv().getOrdCustByCustOrderId(customerOrderId);
		if(null == ordCustValue){
			//根据客户订单编号[{0}]查询客户订单失败
			ExceptionUtil.throwBusinessException("OMS1000071", String.valueOf(customerOrderId));
		}
		IBbossBusiNoCenterSV iBbossBusiNoCenterSV=(IBbossBusiNoCenterSV) ServiceFactory.getService(IBbossBusiNoCenterSV.class);
		Map custManager = iBbossBusiNoCenterSV.getManagerInfoByManagerId(taskStaffId);
		//此表已删除，暂时注释
//		IQBOCmGroupCustAndExtraInfoValue groupInfo = BBossServiceFactory.getCust2CrmSV().queryGroupCustomerByGroupIdOrEcCode(
//														ordCustValue.getCustId(), "");
//		if(null == groupInfo){
//			//根据集团客户编号[{0}],没有查询到集团客户
//			ExceptionUtil.throwBusinessException("SOS2000167", String.valueOf(ordCustValue.getCustId()));
//		}
		
		//国际化时，直接调用的参数最多只支持3个，如果多于3个参数，需要使用对象数组
		String[] param = new String[5]; 
		param[0] = "";//groupInfo.getCustName();//客户名称
		param[1] = String.valueOf(ordCustValue.getCustId());//客户ID
		param[2] = ordOfferValue.getOrderName();//订单名称
		param[3] = String.valueOf(customerOrderId);//客户订单ID
		param[4] = remoteWorkflowName;//需要营销平台启动的流程名称
		//关于{0}({1})的{2}的局数据({3})制作{4}
		String orderName = CrmLocaleFactory.getResource("SOS2001370", param);
		
		BBossInterStartInfoBean infoBean = new BBossInterStartInfoBean();

		StringBuilder logStr = new StringBuilder("\r\n-----------------------------"+CrmLocaleFactory.getResource("SOS99766")+"-------------------------\r\n");
		infoBean.setWF_WORKFLOWNAME(remoteWorkflowName);
		logStr.append("WF_WORKFLOWNAME: ").append(remoteWorkflowName).append("\r\n");
		infoBean.setORDERID(orderOfferId);
		logStr.append("ORDERID: ").append(orderOfferId).append("\r\n");
		infoBean.setORDERTYPE(orderType);
		logStr.append("ORDERTYPE: ").append(orderType).append("\r\n");
		infoBean.setWF_TASKID(taskId);
		logStr.append("WF_TASKID: ").append(taskId).append("\r\n");
		infoBean.setWF_OPERATOR(taskStaffId);
		logStr.append("WF_OPERATOR: ").append(taskStaffId).append("\r\n");
		infoBean.setOPERATOR_NAME((String)custManager.get("STAFF_NAME"));
		logStr.append("OPERATOR_NAME: ").append(custManager.get("STAFF_NAME")).append("\r\n");
//		infoBean.setMANAGER_PROV(String.valueOf(groupInfo.getGroupProvinceId()));
//		logStr.append("MANAGER_PROV: ").append(groupInfo.getGroupProvinceId()).append("\r\n");
//		infoBean.setMANAGER_COUNTY(String.valueOf(groupInfo.getGroupCountyId()));
//		logStr.append("MANAGER_COUNTY: ").append(groupInfo.getGroupCountyId()).append("\r\n");
//		infoBean.setMANAGER_CITY(String.valueOf(groupInfo.getGroupCityId()));
//		logStr.append("MANAGER_CITY: ").append(groupInfo.getGroupCityId()).append("\r\n");
		infoBean.setORDER_DESC(businessId);
		logStr.append("ORDER_DESC: ").append(businessId).append("\r\n");
		infoBean.setORDER_NAME(orderName);
		logStr.append("ORDER_NAME: ").append(orderName).append("\r\n");
		infoBean.setORDER_CODE(String.valueOf(customerOrderId));
		logStr.append("ORDER_CODE: ").append(customerOrderId).append("\r\n");
		logStr.append("----------------------------------------------------------------------");
		
		try {
			if (log.isDebugEnabled()) {
				log.debug(logStr);
			}
			Integer result = (Integer)invoke("StartDefaltInstance", new Object[]{infoBean, USER_NAME, PWD});
			switch (result.intValue()) {
			case 1://表示接口调用成功
				if (log.isDebugEnabled()) {
//					log.debug("局数据制作发送营销平台成功！");
				}
				break;
			case 2://接口权限验证失败
				//调用市场营销平台接口时权限验证失败！op_id={0}, password={1}
				ExceptionUtil.throwBusinessException("SOS2001385", USER_NAME, PWD);
				break;
			case 3://数据保存失败
				//局数据制作营销平台保存数据失败
				ExceptionUtil.throwBusinessException("SOS2001401");
				break;
			case 4://流程启动失败
				//局数据制作营销平台流程启动失败
				ExceptionUtil.throwBusinessException("SOS2001402");
				break;
			default:
				//调用营销平台局数据制作接口异常！
				ExceptionUtil.throwBusinessException("SOS2001390");
				break;
			}
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				//调用营销平台局数据制作接口异常！
				log.error(CrmLocaleFactory.getResource("SOS2001390"), e);
			}
			throw e;
		}
	}
	
}
