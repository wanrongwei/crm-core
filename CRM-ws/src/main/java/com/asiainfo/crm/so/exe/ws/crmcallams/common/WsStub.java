package com.asiainfo.crm.so.exe.ws.crmcallams.common;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.util.CommonUtil;
import org.apache.axis.client.Stub;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class WsStub extends Stub {
    public WsStub(){
        super();
        super.setHeader(getRequestHeaders());
    }
    protected SOAPHeaderElement getRequestHeaders(){
        SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement("", "RequestHeader");
        String appKey = "1000000001";
        String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String date10 = CommonUtil.getTransactionNum(1999999999, 10);
        String transactionID = appKey + date8 + date10;
        String ReqTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String staffId = null;
        String tenantId = null;
        UserInfoInterface user = SessionManager.getUser();
        if (null != user) {
            tenantId = user.getTenantId();
            staffId = user.get("STAFF_ID") == null ? "" : user.get("STAFF_ID").toString();
        }
        try {
            soapHeaderElement.setPrefix("soa");
            soapHeaderElement.setNamespaceURI("http://soa.ailk.telenor.com/wsdl/soa");
            soapHeaderElement.addChild(new MessageElement(new QName("AppKey"), appKey));
            soapHeaderElement.addChild(new MessageElement(new QName("TransactionID"), transactionID));
            soapHeaderElement.addChild(new MessageElement(new QName("ReqTime"), ReqTime));
            soapHeaderElement.addChild(new MessageElement(new QName("Version"), "0.1"));
            soapHeaderElement.addChild(new MessageElement(new QName("AcceptChannelType"), "23"));
            soapHeaderElement.addChild(new MessageElement(new QName("TenantId"), tenantId));
            soapHeaderElement.addChild(new MessageElement(new QName("AcceptStaffId"), staffId));
            soapHeaderElement.addChild(new MessageElement(new QName("AcceptOpId"), 1));
        } catch (SOAPException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return soapHeaderElement;
    }
}
