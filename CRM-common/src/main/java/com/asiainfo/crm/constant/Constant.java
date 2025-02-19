package com.asiainfo.crm.constant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


public class Constant {
	private static transient Log log = LogFactory.getLog(Constant.class);
	private static Properties properties = null;
	
	static {
		//初始化不允许覆盖的属性
		Set notAllowUserProps = new HashSet();
		notAllowUserProps.add(ConfigKey.COMMON_INDEX);
		notAllowUserProps.add(ConfigKey.XML_DEFAULT_ROOT);
		
//		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("InterfacePlatform.properties");
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("inter/InterfacePlatform.properties");
		InputStream userConfig = null;
		properties = new Properties();
		try {
			properties.load(in);
			//2012-02-29,add by xialing,增强支持自定义配置文件（必须放在classpath下）
			userConfig = Thread.currentThread().getContextClassLoader().getResourceAsStream("InterfacePlatform.properties");
			if(userConfig != null) {
				Properties userProperties = new Properties();
				userProperties.load(userConfig);
				String key = null;
				Entry entry = null;
				for(Iterator iterator = userProperties.entrySet().iterator(); iterator.hasNext(); ) {
					entry = (Entry)iterator.next();
					key = entry.getKey().toString();
					if(!notAllowUserProps.contains(key)) {
						properties.setProperty(key, entry.getValue().toString());
					}
				}
				
			}
			// add by zhaiwg 2012-06-23  从虚拟机读取日志配置参数
			if(null != System.getProperty("logFilePrefix")){
				properties.setProperty("log-file-prefix", System.getProperty("logFilePrefix"));
			}
		} catch (Exception e) {
			log.error("Load ServiceParam.properties Error", e);
		}finally{
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					if(log.isErrorEnabled()){
						log.error("InpustStream Close Error" ,e);
					}
				}
			}
			if(userConfig != null){
				try {
					userConfig.close();
				} catch (IOException e) {
					if(log.isErrorEnabled()){
						log.error("InpustStream Close Error" ,e);
					}
				}
			}
		}
	}
	
	public interface Common {
		public static final String INTER_STATIC = "INS_INTERFACETYPE_MAPPING";
		public static final String SOCKET_CONFIG = "INS_SOCKET_CONFIG";
		// 割接状态  0-割接前  1-割接中  2-割接后
		public static final String CUTOVER_STATE = "INS_CUTOVER_STATE";
		// 割接开关  0-关   1-开
		public static final String ROUTE_SWITCH = "INS_ROUTE_SWITCH";
		public static final String EMPTY = "";
		public static final String POINT = ".";
		public static final String GREAT = ">";
		public static final String GREAT_CODE = "&gt;";
		public static final String LOW = "<";
		public static final String LOW_CODE = "&lt;";
		public static final String LINE = "/";
		public static final String COMMA = ","; 
		//定义list的最大可越界值
		public static final int MAX_LISTID = 50;
		public static final String ENTER = System.getProperty("line.separator");
		public static final String FILE_SEPARATOR = System.getProperty("file.separator");
		public static final String TAB = "\t";
		public static final String DEFAULT_ROOT = Constant.properties.getProperty(ConfigKey.XML_DEFAULT_ROOT);
		public static final String LEFT_POINT_BRACES = "<";
		public static final String RIGHT_POINT_BRACES = ">";
		public static final String XML_HEAD = "<?xml version=\"1.0\" encoding=\"" + Constant.properties.getProperty(ConfigKey.XML_ENCODING) + "\"?>";
		public static final String SLASH = "/";
		public static final String INTERFACE_ID_EXPR = Constant.properties.getProperty(ConfigKey.INTERFACE_ID_EXPR);

		public static final int EXPRESSION_THRESHOLD = Integer.parseInt(Constant.properties.getProperty(ConfigKey.EXPRESSION_THRESHOLD));
	}
	
	public interface PublicInfo {
		public static final String AICRMSERVICE = transferConstant("ContractRoot");  							//AICRMService 
		public static final String PUBINFO = transferConstant("RequestHead");  												//PubInfo
		public static final String TRANSACTIONID = transferConstant("TransactionID");							//TransactionId
		public static final String TRANSACTIONTIME = transferConstant("ReqTime");								// TransactionTime
		public static final String INTERFACEID = transferConstant("AcceptChannelCode");					// InterfaceId
		public static final String INTERFACETYPE = transferConstant("AcceptChannelType");					// InterfaceType
		public static final String OPID = transferConstant("AcceptStaffId");												// OpId
		public static final String ORGID = transferConstant("AcceptOrgId");														// --
		public static final String REGIONCODE = transferConstant("AcceptRegionCode");						// RegionCode
		public static final String COUNTYCODE = transferConstant("CountyCode");								// ---
		public static final String CLIENTIP = transferConstant("ClientIP");													//
		public static final String TENANTID = transferConstant("TenantId");
		public static final String REQUEST = transferConstant("ResponseBody");										//Request
		public static final String BUSICODE = transferConstant("BusiCode");												//BusiCode
		public static final String BUSIPARAMS = transferConstant("RequestBody");									// BusiParams
		public static final String CLERKID = transferConstant("ClerkId");
		public static final String APPKEY = transferConstant("AppKey");
		
		public static final String RESPONSE = transferConstant("Response");										//
		public static final String ERRORINFO = transferConstant("ResponseHead");								//ErrorInfo
		public static final String CODE = transferConstant("RspCode");															//Code
		public static final String MESSAGE = transferConstant("RspDesc");												//Message
		public static final String HINT = transferConstant("RspType");														//Hint
		public static final String RETINFO = transferConstant("ResponseBody");										//RetInfo
		public static final String RSPTRANSACTIONID = transferConstant("RspTransactionID");
		public static final String RSPTIME = transferConstant("RspTime");
		
		public static final String ACCESS_CMD = transferConstant("AccessCmd");
		public static final String ACCESS_CODE = transferConstant("AccessCode");
		public static final String BUSI_ACCESS_ID = transferConstant("BusiAccessId");
	}
	
	public interface ConfigKey {
		public static final String PRE_INFO = "com.asiainfo.crm.data.config.";
		public static final String CASE = PRE_INFO + "case";
		public static final String EXPRESSION_MAX_CAPACITY = PRE_INFO + "expressionMaxCapacity";
		public static final String PARAMKEY_MAX_CAPACITY = PRE_INFO + "paramkeyMaxCapacity";
		public static final String ALLOW_INDEX_SKIP = PRE_INFO + "allowIndexSkip";
		public static final String MAX_INDEX_SKIP = PRE_INFO + "maxIndexSkip";
		public static final String COMMON_INDEX = PRE_INFO + "commonIndex";
		public static final String XML_ENCODING = PRE_INFO + "xmlEncoding";
		public static final String XML_DEFAULT_ROOT = PRE_INFO + "xmlDefaultRoot";
		public static final String INTERFACE_ID_EXPR = PRE_INFO + "interfaceIdExpr";
		public static final String INTERFACE_TYPE_EXPR = PRE_INFO + "interfaceTypeExpr";
		public static final String LOG_POWER = PRE_INFO + "logPower";
		public static final String LOG_SYNC = PRE_INFO + "logSync";
		public static final String LOG_MODE = PRE_INFO + "logMode";
		public static final String LOG_FORMAT = PRE_INFO + "logFormat";
		public static final String EXPRESSION_THRESHOLD = "ExpressionThreshold";
		
		//以下是日志文件格式的相关配置
		public static final String LOG_FILE_PREFIX = ".FilePrefix";
		public static final String LOG_FILE_SUFFIX = ".FileSuffix";
		public static final String LOG_FILE_PATTERN = ".FilePattern";
		public static final String LOG_FILE_PATH = ".FilePath";
		
		public static final String TO_DB_IMPL = PRE_INFO + "toDbImpl";
		public static final String LOG_SUM_IMPL = PRE_INFO + "logSumImpl";
		public static final String SCAN_NUMBER = PRE_INFO + "scanNumber";
		
		// 日志虚拟机配置参数
		public static final String LOG_PREFIX_SYS = "log-file-prefix";

	}
	
	public interface LogConfig {
		public static final String DEFAULT_FILE_PREFIX = "CRMService-";
		public static final String START_TIME_FLAG = " Start Time: ";
		public static final String ORIGINAL_MSG_FLAG = "Original Message ";
		public static final String STANDARD_INPUT_MSG_FLAG = "Standard Input Message ";
		public static final String STANDARD_OUTPUT_MSG_FLAG = "Standard Output Message ";
		public static final String RETURN_MSG_FLAG = "Return Message ";
		public static final String END_TIME_FLAG = " End Time: ";
		public static final String START_FLAG = "Start";
		public static final String END_FLAG = "End";

		}
	
	// The third party system address configuration
	public interface Wsdl{
		public static final String SAP_WSDL =  "SAP_WSDL";
		
	}

	
	public static String transferConstant(String originalConstant) {
		if(originalConstant == null) {
			return Common.EMPTY;
		}else {
			return originalConstant;
//			return originalConstant.toUpperCase();
		}
	}
	
//	public static void main(String[] args) throws Exception {
//		System.out.println(PublicInfo.AICRMSERVICE);
//		System.out.println(PublicInfo.AICRMSERVICE);
//	}
	
	public static String getProperty(String propertyKey) {
		return properties.getProperty(propertyKey);
	}
}
