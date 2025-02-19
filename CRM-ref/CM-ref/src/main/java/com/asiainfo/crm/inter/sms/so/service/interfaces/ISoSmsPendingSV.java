package com.asiainfo.crm.inter.sms.so.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;


/**   
 * @Description	此类为保存营业侧待发短信的服务接口
 * @version: v1.0.0
 * @author: Liujz
 * @date: 2012-2-13
 *
 * Modification History:
 * Date               Author            Version            Description
 * -------------------------------------------------------------------
 * 
 */
public interface ISoSmsPendingSV {
	
	/**
	 * @Description 营业侧用于发送单条短信
	 * 
	 * @param smsType	发送短信的类型
	 * 		  1	: SMS_BATCH_PENDING(批量短信待发表)供帐管系统、积分管理等发送批量短信用
	 * 		  2 : SMS_BOM_PENDING(月初批量短信待发表)供分摊预存到帐、分摊月租到期发送短信用
	 * 		  3 : SMS_FAST_PENDING(立即短信待发表)供营业、帐管、营销等系统发送用户立即短信用
	 * 		  4 : SMS_SKY_PENDING(空中充值立即短信待发表)供空中充值缴费立即发送短信用
	 * 		  6 : SMS_WEB_PUSH(Web Push立即短信待发表)	
	 * @param smsMap	短信格式
	 * 		  DESTNUM  		String	 	[手机号码] (不可为空)
	 *  	  OPTCODE  		String   	[操作代码] (可为空)开发组根据数字型业务编解码BusinessID转换
	 *  	  PORT			String   	[端口号] 可不填写,默认为10086
	 *  	  REGION_ID		String   	[地区] 营业侧不可为空;客服侧可不填写,默认为000
	 *  	  TEMPLATE_ID	String 		[短信模板] (不可为空)
	 *        SENDDATE		Timestamp	[发送时间] 可不填写,默认为sysdate
	 *        RTNDATA   	HashMap 	[短信内容] (可为空)smsType:1、2、3、4、5时此参数为HashMap;smstype:6时此参数为String
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: Liujz
	 * @date: 2012-2-13
	 * 
	 */
	public void saveSmsPending(int smsType, HashMap smsMap) throws Exception, RemoteException;
	
	/**
	 * @Description 营业侧用于发送批量短信
	 * 
	 * @param smsType	发送短信的类型
	 * 		  1	: SMS_BATCH_PENDING(批量短信待发表)供帐管系统、积分管理等发送批量短信用
	 * 		  2 : SMS_BOM_PENDING(月初批量短信待发表)供分摊预存到帐、分摊月租到期发送短信用
	 * 		  3 : SMS_FAST_PENDING(立即短信待发表)供营业、帐管、营销等系统发送用户立即短信用
	 * 		  4 : SMS_SKY_PENDING(空中充值立即短信待发表)供空中充值缴费立即发送短信用
	 * 		  6 : SMS_WEB_PUSH(Web Push立即短信待发表)	
	 * @param smsMap	短信格式
	 * 		  DESTNUM  		String	 	[手机号码] (不可为空)
	 *  	  OPTCODE  		String   	[操作代码] (可为空)开发组根据数字型业务编解码BusinessID转换
	 *  	  PORT			String   	[端口号] 可不填写,默认为10086
	 *  	  REGION_ID		String   	[地区] 营业侧不可为空;客服侧可不填写,默认为000
	 *  	  TEMPLATE_ID	String 		[短信模板] (不可为空)
	 *        SENDDATE		Timestamp	[发送时间] 可不填写,默认为sysdate
	 *        RTNDATA   	HashMap 	[短信内容] (可为空)smsType:1、2、3、4、5时此参数为HashMap;smstype:6时此参数为String
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: Liujz
	 * @date: 2012-2-13
	 * 
	 */
	public void saveSmsPendings(int smsType, HashMap[] smsMaps) throws Exception, RemoteException;
	
	/**
	 * @Description 营业侧用于发送单条WAP PUSH短信
	 * 
	 * @param smsMap	短信格式
	 * 		  DESTNUM  		String	 	[手机号码]
	 *  	  OP_ID  		String   	[营业员工号]
	 *  	  PORT			String   	[端口号] 可不填写,默认为10086
	 *  	  REGION_ID		String   	[地区] 
	 *  	  SENDDATE		Timestamp 	[发送时间]
	 *  	  PUSH_DETAILS  String 		[PUSH语]
	 *  	  LINK_ADDRESS  String 		[链接]  
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: Liujz
	 * @date: 2012-2-13
	 * 
	 */		
//	public void saveWapPush(HashMap smsMap) throws Exception, RemoteException;
	
	/**
	 * @Description 营业侧用于发送多条WAP PUSH短信
	 * 
	 * @param smsMap	短信格式
	 * 		  DESTNUM  		String	 	[手机号码]
	 *  	  OP_ID  		String   	[营业员工号]
	 *  	  PORT			String   	[端口号] 可不填写,默认为10086
	 *  	  REGION_ID		String   	[地区] 
	 *  	  SENDDATE		Timestamp 	[发送时间]
	 *  	  PUSH_DETAILS  String 		[PUSH语]
	 *  	  LINK_ADDRESS  String 		[链接]  
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: Liujz
	 * @date: 2012-2-13
	 * 
	 */
//	public void saveWapPushs(HashMap[] smsMaps) throws Exception, RemoteException;
	
	/**
	 * @Description 营业侧根据手机号码、起止时间、分页信息查询短信发送记录信息(不支持跨月查询)
	 * 
	 * @param destnum		接入人手机号码
	 * @param qryStartDate	查询开始日期	
	 * @param qryEndDate	查询结束日期
	 * @param start	 		分页开始记录数
	 * @param end			分页结束记录数
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: Liujz
	 * @date: 2012-2-13
	 * 
	 */
//	public IBOSmsFastPendingValue[] querySmsUniversalPending(String destnum, String qryStartDate, String qryEndDate, int start, int end) throws Exception, RemoteException;
	
	/**
	 * @Description	营业侧短信发送历史数量查询(不支持跨月查询)
	 * 
	 * @param destnum		接入人手机号码
	 * @param qryStartDate	查询开始日期
	 * @param qryEndDate	查询结束日期
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: Liujz
	 * @date: 2012-2-13
	 *
	 */
//	public int querySmsUniversalPendingCount(String destnum, String qryStartDate, String qryEndDate)  throws Exception, RemoteException;
	

}
