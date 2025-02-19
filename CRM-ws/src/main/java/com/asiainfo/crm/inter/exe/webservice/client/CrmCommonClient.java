package com.asiainfo.crm.inter.exe.webservice.client;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;


public class CrmCommonClient {
	public static Log log=LogFactory.getLog(CrmCommonClient.class);
//	public String  MSM_WS_ADRESS="http://10.11.20.108:3300/services/MsmDistributeEvents?wsdl";
	public final static int WS_TIME_OUT=1000;
	public static boolean saveMsmLog( Map logInfoMap){
//		if(1==1){//由于统一接触日志重新设计，所以先不记录统一接触日志了
			return true;
//		}
//		try {
//			//String channelType,String busiCode,String startTime,String finishTime
//			String msmWSAdress="";//MSM_WS_ADRESS
//			IBOBsStaticDataValue[] dataValues= StaticDataUtil.getStaticData("MSM_DISTRIBUTE_EVENT_WS_URL");
//			if(dataValues==null||dataValues.length==0){
//				throw new RuntimeException("统一接触日志webservice地址没有配置[bs_static_data;code_type=MSM_DISTRIBUTE_EVENT_WS_URL]");
//			}
//			msmWSAdress=dataValues[0].getCodeValue();
//			String xml = getReqXml(logInfoMap);//这里，需要渠道侧自己转换报文信息（详细见事件分发接口—请求报文格式）
//			log.debug("统一日志接口报文:"+xml);
//		    String puncion = "distribute";
//		    Service service = new Service();
//		    Call call = null;
//		    call = (Call) service.createCall();
//		    call.setTimeout(WS_TIME_OUT);
//		    call.setTargetEndpointAddress(new java.net.URL(msmWSAdress));         
//		    call.setOperationName(new QName("", puncion));//WSDL里面描述的操作名称
//		    //String resultxml = (String) call.invoke(new Object[] {new String(xml)}); //给方法传递参数，并且调用方法，获取返回的XML串（详细见事件分发接口—应答报文格式）
//		    log.debug("统一日志返回报文:"+xml);
//		    return true;
//		} catch (Exception e) {
//			log.error("保存统一接触日志出错，错误原因:"+e.getMessage(),e);
//			return false;
		}
	/**
	 * 未填写字段:SYS_DOMAIN_ID、OP_COUNTRY_CODE、SERIAL_NO
	 * REPORT-COND中的:PLACE
	 * @param channelType 
	 * @param busiCode 
	 * @param finishTime 
	 * @param startTime 
	 * @return
	 */
	private static String getReqXml(Map logInfoMap) {
//		<?xml version='1.0' encoding='UTF-8'?>
//		<REQ_PARAM>
//			<PUB_INFO>
//				<SYS_OP_ID>0</SYS_OP_ID>
//				<SYS_PASSWORD>111</SYS_PASSWORD>
//				<SYS_ORG_ID>222</SYS_ORG_ID>
//				<OP_ID>222</OP_ID>
//				<OP_REGION_CODE>22</OP_REGION_CODE>
//				<ORG_ID>22</ORG_ID>
//				<OP_COUNTRY_CODE>22</OP_COUNTRY_CODE>
//				<CHANNEL_TYPE>22</CHANNEL_TYPE>
//				<BUSI_CODE>22</BUSI_CODE>
//				<SYS_DOMAIN_ID>2</SYS_DOMAIN_ID>
//				<CLIENT_IP>2</CLIENT_IP>
//				<SERIAL_NO>2</SERIAL_NO>
//			</PUB_INFO>
//			<BUSI_INFO>
//				<REPORT-COND>
//					<START_TIME>2013-05-07 10:10:10</START_TIME>
//					<FINISH_TIME>2013-05-07 10:11:10</FINISH_TIME>
//					<PLACE>zjtest</PLACE>
//					<CUSTOMER_NAME>张三</CUSTOMER_NAME>
//					<CUST_ID>10444412333311130</CUST_ID>
//					<BILL_ID>13902220000</BILL_ID>
//					<ACCOUNT_ID>100032111111</ACCOUNT_ID>
//					<REGION_CODE>240</REGION_CODE>
//					<OP_ID>2222</OP_ID>
//					<ORG_ID>101</ORG_ID>
//					<CHANNEL_ID>10001</CHANNEL_ID>
//					<SYS_SOURCE>CRM</SYS_SOURCE>
//					<EVENT_REASON>aaaa</EVENT_REASON>
//					<MEDIA_ID></MEDIA_ID>
//					<CONTACT_TYPE>100</CONTACT_TYPE>
//					<EVENT_RESULT>OK</EVENT_RESULT>
//					<REMARK>remark</REMARK>
//					<BUSINESS_ID>1001001</BUSINESS_ID>
//					<BUSINESS_SOURCE>CRM</BUSINESS_SOURCE>
//					<BUSINESS_SOURCE_DONE_CODE>4444444444</BUSINESS_SOURCE_DONE_CODE>
//					<CONTACT_CHANNEL_DONE_CODE>42322222</CONTACT_CHANNEL_DONE_CODE>
//					<CONTACT_SESSION_ID>aaaa1115</CONTACT_SESSION_ID>
//					<EVENT_CONTENT>  
//						<EVENT>  <!-- 该标签下的元素可以自定义 -->
//							<ACCOUNT_BALANCE>13838383838</ACCOUNT_BALANCE>
//							<CUST_TYPE>1</CUST_TYPE>
//							<CUST_LEVEL>VIP</CUST_LEVEL>
//						</EVENT>
//					</EVENT_CONTENT>
//				</REPORT-COND>
//			</BUSI_INFO>
//		</REQ_PARAM>
		String channelType=logInfoMap.get("channelType")==null?"":logInfoMap.get("channelType").toString();
		String busiCode=logInfoMap.get("busiCode")==null?"":logInfoMap.get("busiCode").toString();
		String startTime=logInfoMap.get("startTime")==null?"":logInfoMap.get("startTime").toString();
		String finishTime=logInfoMap.get("finishTime")==null?"":logInfoMap.get("finishTime").toString();
		String customerName=logInfoMap.get("customerName")==null?"":logInfoMap.get("customerName").toString();
		String custId=logInfoMap.get("custId")==null?"":logInfoMap.get("custId").toString();
		String billId=logInfoMap.get("billId")==null?"":logInfoMap.get("billId").toString();
		String accountId=logInfoMap.get("accountId")==null?"":logInfoMap.get("accountId").toString();
		//String regionCode=logInfoMap.get("regionCode")==null?"":logInfoMap.get("regionCode").toString();
		String eventResean=logInfoMap.get("eventResean")==null?"":logInfoMap.get("eventResean").toString();
		String remark=logInfoMap.get("remark")==null?"":logInfoMap.get("remark").toString();
		String businessId=logInfoMap.get("businessId")==null?"":logInfoMap.get("businessId").toString();
		Map eventInfo= (logInfoMap.get("eventInfo")==null?null:(Map)logInfoMap.get("eventInfo"));
		Document doc=DocumentHelper.createDocument();
		Element rootEle=doc.addElement("REQ_PARAM");
		Element pubInfoEle=rootEle.addElement("PUB_INFO");
		//操作员id
		UserInfoInterface ui= ServiceManager.getUser();
		pubInfoEle.addElement("SYS_OP_ID").setText(String.valueOf(ui.getID()));
		pubInfoEle.addElement("SYS_PASSWORD").setText("");
		pubInfoEle.addElement("SYS_ORG_ID").setText(String.valueOf(ui.getOrgId()));
		pubInfoEle.addElement("OP_ID").setText(String.valueOf(ui.getID()));
		pubInfoEle.addElement("OP_REGION_CODE").setText(String.valueOf(ui.get("REGION_ID")));
		pubInfoEle.addElement("ORG_ID").setText(String.valueOf(ui.getOrgId()));
//		pubInfoEle.addElement("OP_COUNTRY_CODE").setText(String.valueOf(ui.getOrgId()));//OP_COUNTRY_CODE
		pubInfoEle.addElement("CHANNEL_TYPE").setText(channelType);
		pubInfoEle.addElement("BUSI_CODE").setText(busiCode);
		pubInfoEle.addElement("OP_COUNTRY_CODE").setText("");
		pubInfoEle.addElement("SYS_DOMAIN_ID").setText("");
		pubInfoEle.addElement("SERIAL_NO").setText("");
		if(StringUtils.isNotBlank(ui.getIP())){
			pubInfoEle.addElement("CLIENT_IP").setText(ui.getIP());
		}
		
		Element busiInfoEle=rootEle.addElement("BUSI_INFO");
		Element rtpEle= busiInfoEle.addElement("REPORT-COND");
		//DateFormat df=new SimpleDateFormat(TimeUtil.YYYY_MM_DD_HH_MM_SS);
		rtpEle.addElement("PLACE").setText("");
		rtpEle.addElement("MEDIA_ID").setText("");
		rtpEle.addElement("CONTACT_TYPE").setText("");
		rtpEle.addElement("EVENT_RESULT").setText("OK");
		rtpEle.addElement("START_TIME").setText(startTime);
		rtpEle.addElement("FINISH_TIME").setText(finishTime);
		rtpEle.addElement("CUST_ID").setText(custId);
		rtpEle.addElement("CUSTOMER_NAME").setText(customerName);
		rtpEle.addElement("BILL_ID").setText(billId);
		rtpEle.addElement("ACCOUNT_ID").setText(accountId);
		rtpEle.addElement("REGION_CODE").setText(String.valueOf(ui.get("REGION_ID")));
		rtpEle.addElement("OP_ID").setText(String.valueOf(ui.getID()));
		rtpEle.addElement("ORG_ID").setText(String.valueOf(ui.getOrgId()));
		rtpEle.addElement("CHANNEL_ID").setText(channelType);
		rtpEle.addElement("SYS_SOURCE").setText("");
		rtpEle.addElement("REMARK").setText(remark);
		rtpEle.addElement("BUSINESS_ID").setText(businessId);
		rtpEle.addElement("EVENT_REASON").setText(eventResean);
		rtpEle.addElement("BUSINESS_SOURCE").setText("CRM");
		rtpEle.addElement("BUSINESS_SOURCE_DONE_CODE").setText(String.valueOf(ServiceManager.getDoneCode()));
		rtpEle.addElement("CONTACT_CHANNEL_DONE_CODE").setText(String.valueOf(ServiceManager.getDoneCode()));
		rtpEle.addElement("CONTACT_SESSION_ID").setText("");
		Element eventContentEle= rtpEle.addElement("EVENT_CONTENT");
		if(eventInfo!=null&&!eventInfo.isEmpty()){
			Element eventEle =eventContentEle.addElement("EVENT");
			for (Iterator itEventInfoKey = eventInfo.keySet().iterator(); itEventInfoKey.hasNext();) {
				String key = (String) itEventInfoKey.next();
				eventEle.addElement(key).setText(eventInfo.get(key)==null?"":eventInfo.get(key).toString());
				
			}
		}
		return doc.asXML();
	}
//	public static void main(String[] args) {
//		try {
//			String msmWSAdress="";//MSM_WS_ADRESS
//			IBOBsStaticDataValue[] dataValues= StaticDataUtil.getStaticData("MSM_DISTRIBUTE_EVENT_WS_URL");
//			if(dataValues==null||dataValues.length==0){
//				throw new RuntimeException("统一接触日志webservice地址没有配置[bs_static_data;code_type=MSM_DISTRIBUTE_EVENT_WS_URL]");
//			}
//			msmWSAdress=dataValues[0].getCodeValue();
//			String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><REQ_PARAM><PUB_INFO><SYS_OP_ID>100000039</SYS_OP_ID><SYS_PASSWORD></SYS_PASSWORD><SYS_ORG_ID>20000001</SYS_ORG_ID><OP_ID>100000039</OP_ID><OP_REGION_CODE>240</OP_REGION_CODE><ORG_ID>20000001</ORG_ID><CHANNEL_TYPE>1</CHANNEL_TYPE><BUSI_CODE>191000000001</BUSI_CODE><OP_COUNTRY_CODE></OP_COUNTRY_CODE><SYS_DOMAIN_ID></SYS_DOMAIN_ID><SERIAL_NO></SERIAL_NO><CLIENT_IP>0:0:0:0:0:0:0:1</CLIENT_IP></PUB_INFO><BUSI_INFO><REPORT-COND><PLACE></PLACE><MEDIA_ID></MEDIA_ID><CONTACT_TYPE></CONTACT_TYPE><EVENT_RESULT>OK</EVENT_RESULT><START_TIME>2013-09-18 14:37:53.154</START_TIME><FINISH_TIME>2013-09-18 14:37:53.154</FINISH_TIME><CUST_ID>21401000000357</CUST_ID><CUSTOMER_NAME>asdf</CUSTOMER_NAME><BILL_ID>13898880368</BILL_ID><ACCOUNT_ID></ACCOUNT_ID><REGION_CODE>240</REGION_CODE><OP_ID>100000039</OP_ID><ORG_ID>20000001</ORG_ID><CHANNEL_ID>1</CHANNEL_ID><SYS_SOURCE></SYS_SOURCE><REMARK></REMARK><BUSINESS_ID>191000000001</BUSINESS_ID><EVENT_REASON></EVENT_REASON><BUSINESS_SOURCE>CRM</BUSINESS_SOURCE><BUSINESS_SOURCE_DONE_CODE>300000070005</BUSINESS_SOURCE_DONE_CODE><CONTACT_CHANNEL_DONE_CODE>300000070005</CONTACT_CHANNEL_DONE_CODE><CONTACT_SESSION_ID></CONTACT_SESSION_ID><EVENT_CONTENT/></REPORT-COND></BUSI_INFO></REQ_PARAM>";
//		    String puncion = "distribute";
//		    Service service = new Service();
//		    Call call = null;
//		    call = (Call) service.createCall();
//		    call.setTimeout(WS_TIME_OUT);
//		    call.setTargetEndpointAddress(new java.net.URL(msmWSAdress));         
//		    call.setOperationName(new QName("", puncion));//WSDL里面描述的操作名称
//		    String resultxml = (String) call.invoke(new Object[] {new String(xml)}); //给方法传递参数，并且调用方法，获取返回的XML串（详细见事件分发接口—应答报文格式）
//		    System.out.println(resultxml);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//	}
}
