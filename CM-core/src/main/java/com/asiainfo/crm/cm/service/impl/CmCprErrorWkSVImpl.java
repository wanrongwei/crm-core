package com.asiainfo.crm.cm.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.comframe.vm.common.Constant;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.util.SoServiceFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPsTaskDealBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.ws.ImsWrapServiceClient;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCprErrorWkSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IBusiAcceptSV;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IOrderDataSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class CmCprErrorWkSVImpl implements ICmCprErrorWkSV{

	public void saveTroubleTicket(long custId, String errorCode, String errorMsg)
			throws Exception {
		ICmCustomerSV custSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue=custSV.queryDKCustomer(custId);
		if(CmCommonUtil.isNotEmptyObject(custValue)){
			// 调用TT接口保存错误日志
			Map map = new HashMap();
			if(String.valueOf(CmConstants.EntityType.CUSTOMER).equals(custValue.getIndivCustType())){
				// 客户ID(只有客户塞custId,其他的塞partyId)
				map.put("CUST_ID", String.valueOf(custId));
			}else{
				map.put("CUST_ID", custValue.getPartyId());
			}
			// error_code
			map.put("ERROR_CODE", errorCode);
			IBOBsStaticDataValue staticValue = StaticDataUtil.getStaticData("CM_CUST_REQUEST_RESULTS", errorCode);
			if (CmCommonUtil.isNotEmptyObject(staticValue)) {
				// 错误code
				map.put("ERROR_MESSAGE", staticValue.getCodeName());
			}
			// 个人传CPR
			map.put("SOURCE_SYSTEM", "CPR");
			// 错误message
			map.put("ERROR_EXT_INFO", errorMsg);
			CmCommonUtil.CreateTicketForCM(map);
		}else{
			ExceptionUtil.throwBusinessException("The customer is not exists");
		}
	}

	public boolean ifCustomerHasInstallAccount(long custId) throws Exception {
		if(custId>0){
			ICmAccountSV accountSV=(ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
			IBOCmCustAcctRelValue[] acctValues=accountSV.queryCustAcctRel(custId, -1, "", CmConstants.InstallmentFlag.Installment_Account, -1, -1, "", -1, -1, CmConstants.RecordState.USE);
			if(CmCommonUtil.isNotEmptyObject(acctValues)){
				//说明存在分期账户
				return true;
			}
		}else{
			ExceptionUtil.throwBusinessException("The custId is not correct");
		}
		return false;
	}

	public boolean ifCustStatusActiveOrSuspend(long custId) throws Exception {
		if(custId>0){
			ICmCustomerSV custSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue value=custSV.queryDKCustomer(custId);
			//查询客户
			if(CmCommonUtil.isNotEmptyObject(value)){
				if(value.getCustStatus()==CmConstants.CustomerStatus.INDIV_ACTIVE || value.getCustStatus()==CmConstants.CustomerStatus.INDIV_PAUSE){
					//离网或者暂停
					return true;
				}
			}else{
				ExceptionUtil.throwBusinessException("The customer is not exist");
			}
		}else{
			ExceptionUtil.throwBusinessException("The custId is not correct");
		}
		return false;
	}

	public boolean ifCustStatusInactive(long custId) throws Exception {
		if(custId>0){
			//查看客户是否离网
			ICmCustomerSV custSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue=custSV.queryDKCustomer(custId);
			if(CmCommonUtil.isNotEmptyObject(custValue)){
				if(custValue.getCustStatus()==CmConstants.CustomerStatus.INDIV_INACTIVE){
					return true;
				}
			}else{
				ExceptionUtil.throwBusinessException("The customer is not exist");
			}
		}else{
			ExceptionUtil.throwBusinessException("The custId is not correct");
		}
		return false;
	}

	public boolean ifCustHasMobile(long custId) throws Exception {
		if(custId>0){
			ICmCustomerSV custSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			//查询出该客户下面所有的手机用户
			IBOCmInsCmrelValue[] insValues=custSV.queryCmInsCmrel(custId, -1, CmConstants.RelaType.OWNER, -1,RBossConst.PROD_CATALOG_GSM, -1, -1, -1);
			if(CmCommonUtil.isNotEmptyObject(insValues)){
				return true;
			}
		}else{
			ExceptionUtil.throwBusinessException("The custId is not correct");
		}
		return false;
	}

	public void dealIfUpdateAddress(long custId,String taskId,long taskType) throws Exception {
		ICmCommonSV commonSV=(ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		BOCmPsTaskDealBean bean=new BOCmPsTaskDealBean();
		bean.setTaskType(taskType);
		bean.setEntityId(custId);
		bean.setTaskParam(taskId);
		commonSV.saveCmPsTaskDeal(new BOCmPsTaskDealBean[]{bean});
	}

	public void sendMsg(long custId) throws Exception {
		//查询出客户的联系号码
		String date="";
		String billId="";
		String msg="";
		ICmCustomerSV custSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue value=custSV.queryCustContactMediumByCustIdAndType(custId, String.valueOf(CmConstants.AddressId.CONTACT_NUMBER));
		if(CmCommonUtil.isNotEmptyObject(value)){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMdd");
			date=sdf.format(new Date(new Date().getTime() + CmConstants.TaskType.MONITORING_CYCLE * 24 * 60 * 60 * 1000));
			billId=value.getContNumber();
			//发送短信通知客户
			msg+="Service SMS fra TelenorVi"+"\n"+"kan se, at du står med ukendt adresse i det danske folkeregister. Det er derfor nødvendigt at du opdaterer din adresse i Folkeregistret hos din kommune eller på www.borger.dk. Hvis ikke det sker inden den ";
			msg+=date;
			msg+=" er vi nødt til at lukke dit abonnement. Du kan evt. kontakte Telenors Kreditafdeling på ";
			msg+=billId;
			msg+=". Med venlig hilsen Telenor";
			CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.BILL_ID, billId);
			CmServiceFactory.getTeamInvokeSV().sendSms(billId, msg);
		}
	}
	
	public String suspendUser(long custId) throws Exception {
		String datas="";
		if(custId>0){
			ICmCustomerSV custSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmInsCmrelValue[] values=custSV.queryCmInsCmrel(custId, -1, CmConstants.RelaType.OWNER, -1,-1, -1, -1, -1);
			if(CmCommonUtil.isNotEmptyObject(values)){
				for(int i=0;i<values.length;i++){
					long userId=values[i].getUserId();
					CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
					IInsUserValue insValue = SoServiceFactory.getInstanceQrySV().getInstUserByUserId(userId);
					if(CmCommonUtil.isNotEmptyObject(insValue)){
						String billId=insValue.getBillId();
						//将该用户停机
						IBusiAcceptSV acceptSV=(IBusiAcceptSV) ServiceFactory.getService(IBusiAcceptSV.class);
						DataContainerInterface dc=new DataContainer();
						dc.set("OS_LEVEL", "os");
						dc.set("APPOINT_STOP", 0);
						dc.set("OS_STATUS_TYPE_STOP", 120);
						CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID,billId);
						acceptSV.dealUserStopOpenNew(billId,new DataContainerInterface[]{dc});
						if(i==values.length-1){
							datas+=billId;
						}else{
							datas+=billId+",";
						}
					}else{
						ExceptionUtil.throwBusinessException("According to userId can not found billId");
					}
				}
			}
		}else{
			ExceptionUtil.throwBusinessException("The custId is not correct");
		}
		return datas;
	}
	
	public String preTerminationUser(long custId) throws Exception {
		String data="";
		if(custId>0){
			ICmCustomerSV custSV=(ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmInsCmrelValue[] values=custSV.queryCmInsCmrel(custId, -1, CmConstants.RelaType.OWNER, -1,-1, -1, -1, -1);
			if(CmCommonUtil.isNotEmptyObject(values)){
				for(int i=0;i<values.length;i++){
					long userId=values[i].getUserId();
					CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
					IInsUserValue insValue = SoServiceFactory.getInstanceQrySV().getInstUserByUserId(userId);
					if(CmCommonUtil.isNotEmptyObject(insValue)){
						//指定未来某天进行预销户
						SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String billId=insValue.getBillId();
						String effectTime=sdf.format(new Date(new Date().getTime()));//立马预销户
						String perTerminationReason="2";//预销户原因
						Map dataMap=new HashMap();
						dataMap.put("serviceNumber", billId);
						dataMap.put("effectiveTime", effectTime);
						dataMap.put("perTerminationReason",perTerminationReason);
						CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID,billId);
						IOrderDataSV orderSV=(IOrderDataSV) ServiceFactory.getService(IOrderDataSV.class);
						IBceDealReturnData returnData=orderSV.preTermination(dataMap);
						if(i==values.length-1){
							data+=DataType.getAsString(returnData.getWorkflowParamMap().get("customerOrderId"));
						}else{
							data+=DataType.getAsString(returnData.getWorkflowParamMap().get("customerOrderId"))+",";
						}
					}else{
						ExceptionUtil.throwBusinessException("According to userId can not found billId");
					}
				}
			}
		}else{
			ExceptionUtil.throwBusinessException("The custId is not correct");
		}
		return data;
	}
//	public static void main(String[] args) throws Exception{
//		ServiceManager.setServiceUserInfo(CmCommonUtil.getDefaultUser());
//		System.setProperty(Constant.S_COMFRAME_DEV_NAME, "1234");
//		CmCprErrorWkSVImpl impl=new CmCprErrorWkSVImpl();
//		impl.preTerminationUser(21210411633752L);
//	}
	public void startUser(String data) throws Exception {
		if(StringUtils.isNotEmpty(data)){
			IBusiAcceptSV acceptSV=(IBusiAcceptSV) ServiceFactory.getService(IBusiAcceptSV.class);
			String[] datas=data.split(",");
			if(null!=datas && datas.length>0){
				for(int i=0;i<datas.length;i++){
					DataContainerInterface dc=new DataContainer();
					dc.set("OS_LEVEL", "os");
					dc.set("APPOINT_OPEN", 0);
					dc.set("OS_STATUS_TYPE_OPEN", "012");
					CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID,datas[i]);
					//调用订单的开机接口
					acceptSV.dealUserStopOpenNew(datas[i], new DataContainerInterface[]{dc});
				}
			}
		}
	}

	public void cancelPreTerminate(String data) throws Exception {
		if(StringUtils.isNotEmpty(data)){
			String[] datas=data.split(",");
			ICrmFSV fsv=(ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
			if(null!=datas && datas.length>0){
				for(int i=0;i<datas.length;i++){
					long customerOrderId=DataType.getAsLong(datas[i]);
					fsv.cancelOrderCustWaiting(customerOrderId);
				}
			}
		}
	}
	
	public void resetAcctCreditLimit(long custId)throws Exception{
		if(custId>0){
			ICmAccountSV accountSV=(ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
			IBOCmCustAcctRelValue[] acctValues=accountSV.queryCustAcctRel(custId, -1, "",-1, -1, -1, "", -1, -1, CmConstants.RecordState.USE);
			if(CmCommonUtil.isNotEmptyObject(acctValues)){
				ImsWrapServiceClient client=ImsWrapServiceClient.getInstance();
				//重置所有的账户的信用度
				for(IBOCmCustAcctRelValue value : acctValues){
					client.resetCreditLimit(value.getAcctId());
				}
			}
		}else{
			ExceptionUtil.throwBusinessException("The custId is not correct");
		}
	}
}
