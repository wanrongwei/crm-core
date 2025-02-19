package com.asiainfo.crm.cm.custgroup.utils;

import java.util.List;
import java.util.Map;

import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IRecordLogSV;
import com.asiainfo.push.inter.client.PushClient;
import com.asiainfo.push.inter.service.ivalues.Receiver;
import com.asiainfo.push.inter.service.ivalues.StructParamEvent;

import com.ai.appframe2.service.ServiceFactory;
public class PushCStructParamEventThread implements Runnable{
	private String eventCode;
	private StructParamEvent event;
	private long custId;
	private String billId;
	private long entityId;
	
	public PushCStructParamEventThread(String eventCode,StructParamEvent event,long custId,String billId,long entityId) {
		this.eventCode = eventCode;
		this.event = event;
		this.custId = custId;
		this.billId = billId;
		this.entityId = entityId;
	}
	
	public void run(){
		long result = -1;
		String loginfo = "";
		try{
			loginfo = transEvent2String(event);//pushc调用报文日志信息
			result = PushClient.triggerStructParamEvent(event);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
				IRecordLogSV  recordSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
				if (-1 == result) {
					recordSV.saveLog(custId, entityId,  0L, billId, 0L, RBossConst.PUSHC_INTERFACE,
			        		eventCode+":{ Invoke Result: Invoke PushClient.triggerStructParamEvent Fail, result == -1; },{ Log Info: "+ loginfo+" }", RBossConst.CRM_CALL_OUT, "PUSHC");
				}else if(result>=0) {
					recordSV.saveLog(custId, entityId,  0L, billId, 0L, RBossConst.PUSHC_INTERFACE,
			        		eventCode+":{ Invoke Result: Invoke PushClient.triggerStructParamEvent Sucess },{ Log Info: "+ loginfo+" }", RBossConst.CRM_CALL_OUT, "PUSHC");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}
	
	private String transEvent2String(StructParamEvent event) throws  Exception{
		StringBuffer Receivers=new StringBuffer();
		String eventCode = event.getEventCode();
		String busiType = event.getEventInitBusiType();
		String channel = event.getEventInitChannel();
		String entityId = event.getEventInitEntityId();
		String jsonParam = event.getJsonParam();
		String serialNo = event.getBizSerialNo();
		List<Receiver> receiverList = event.getReceiverList();
		
		if (receiverList!=null && !receiverList.isEmpty()) {
			for (Receiver r:receiverList) {
				Receivers.append("<Receiver>");
				Receivers.append("<").append(r.getRoleCode()).append(">");
				Receivers.append("<ReceiverName>").append(r.getReceiverName()).append("</ReceiverName>");
				Receivers.append("<ReceiverType>").append(r.getReceiverType()).append("</ReceiverType>");
				Receivers.append("<ReceiverId>").append(r.getReceiverId()).append("</ReceiverId>");
				Receivers.append("<IsEnabled>").append(r.isEnabled()).append("</IsEnabled>");
				Receivers.append("<MediaType>").append(r.getMediaType()).append("</MediaType>");
				Receivers.append("<ContactAddress>").append(r.getContactAddress()).append("</ContactAddress>");
				Receivers.append("<ExtAttributes>").append(r.getExtAttributes().toString()).append("</ExtAttributes>");
				Receivers.append("</").append(r.getRoleCode()).append(">");
				Receivers.append("</Receiver>");
			}
		}
		StringBuffer sb=new StringBuffer("<logInfo>");
		sb.append("<EventCod>").append(eventCode).append("</EventCod>");
		sb.append("<EventInitBusiType>").append(busiType).append("</EventInitBusiType>");
		sb.append("<EventInitChannel>").append(channel).append("</EventInitChannel>");
		sb.append("<EventInitEntityId>").append(entityId).append("</EventInitEntityId>");
		sb.append("<JsonParam>").append(jsonParam).append("</JsonParam>");
		sb.append("<ReceiverList>").append(Receivers).append("</ReceiverList>");
		sb.append("<BizSerialNo>").append(serialNo).append("</BizSerialNo>");
		sb.append("</logInfo>");
		return sb.toString();
	}
	
}