package com.asiainfo.crm.inter.sms.so.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;

import com.asiainfo.crm.inter.sms.so.ivalues.IBOSmsBatchPendingTempValue;

/**   
 * @Description	保存待发短信的服务接口
 * 
 * @version: v1.0.0
 * @author: linzhaoming
 * @date: 2011-3-19
 *
 * Modification History:
 * Date               Author            Version            Description
 * -------------------------------------------------------------------
 * 2012-2-13		  Liujianzhao		v1.0.1			   1、注释部分重整理; 2、添加客服侧短信发送支持; 3、删除查询接口; 
 * 														   4、修改Web Push短信HashMap参数与普通短信一致
 * 
 */
public interface ISmsPendingSV {
	
	/**
	 * @Description 用于发送单条短信
	 * 
	 * @param smsType	发送短信的类型
	 * 		  1	: SMS_BATCH_PENDING(批量短信待发表) 供帐管系统、积分管理等发送批量短信用
	 * 		  2 : SMS_BOM_PENDING(月初批量短信待发表) 供分摊预存到帐、分摊月租到期发送短信用
	 * 		  3 : SMS_FAST_PENDING(立即短信待发表) 供营业、帐管、营销等系统发送用户立即短信用
	 * 		  4 : SMS_SKY_PENDING(空中充值立即短信待发表) 供空中充值缴费立即发送短信用
	 * 		  5 : SMS_CS_PENDING(客服侧短信待发表) 供客服立即发送短信用
	 *        6 : SMS_WEB_PUSH(供Web Push短信使用) 供Web Push短信使用
	 * @param smsMap	短信格式
	 * 		  DESTNUM  		String	 	[手机号码] (不可为空)
	 *  	  OPTCODE  		String   	[操作代码] (可为空)开发组根据数字型业务编解码BusinessID转换
	 *  	  PORT			String   	[端口号] 可不填写,默认为10086
	 *  	  REGION_ID		String   	[地区] 营业侧不可为空;客服侧可不填写,默认为000
	 *  	  TEMPLATE_ID	String 		[短信模板] (不可为空)
	 *        SENDDATE		Timestamp	[发送时间] 可不填写,默认为sysdate
	 *        RTNDATA   	HashMap 	[短信内容] (可为空)
	 *        					smsType:1、2、3、4、5	此参数为HashMap
	 *        					smstype:6			此参数为String		格式为:描述内容#Push地址
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: linzhaoming
	 * @date: 2011-3-19
	 * 
	 * Modification History:
	 * Date               Author            Version            Description
	 * -------------------------------------------------------------------
	 * 2012-2-13		  Liujianzhao		v1.0.1			   1、注释部分重整理; 2、添加客服侧短信发送支持
	 * 
	 */
	public void saveSmsPending(int smsType, HashMap smsMap) throws Exception, RemoteException;
	
	/**
	 * @Description 用于发送批量短信
	 * 
	 * @param smsType	发送短信的类型
	 * 		  1	: SMS_BATCH_PENDING(批量短信待发表)供帐管系统、积分管理等发送批量短信用
	 * 		  2 : SMS_BOM_PENDING(月初批量短信待发表)供分摊预存到帐、分摊月租到期发送短信用
	 * 		  3 : SMS_FAST_PENDING(立即短信待发表)供营业、帐管、营销等系统发送用户立即短信用
	 * 		  4 : SMS_SKY_PENDING(空中充值立即短信待发表)供空中充值缴费立即发送短信用
	 * 		  5 : SMS_CS_PENDING(客服侧短信待发表)供客服立即发送短信用
	 *        6 : SMS_WEB_PUSH(供Web Push短信使用) 供Web Push短信使用
	 * @param smsMap	短信格式
	 * 		  DESTNUM  		String	 	[手机号码] (不可为空)
	 *  	  OPTCODE  		String   	[操作代码] (可为空)开发组根据数字型业务编解码BusinessID转换
	 *  	  PORT			String   	[端口号] 可不填写,默认为10086
	 *  	  REGION_ID		String   	[地区] 营业侧不可为空;客服侧可不填写,默认为000
	 *  	  TEMPLATE_ID	String 		[短信模板] (不可为空)
	 *        SENDDATE		Timestamp	[发送时间] 可不填写,默认为sysdate
	 *        RTNDATA   	HashMap 	[短信内容] (可为空)
	 *        					smsType:1、2、3、4、5	此参数为HashMap
	 *        					smstype:6			此参数为String		格式为:描述内容#Push地址
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: linzhaoming
	 * @date: 2011-3-19
	 * 
	 * Modification History:
	 * Date               Author            Version            Description
	 * -------------------------------------------------------------------
	 * 2012-2-13		  Liujianzhao		v1.0.1			   1、注释部分重整理; 2、添加客服侧短信发送支持
	 * 
	 */
	public void saveSmsPendings(int smsType, HashMap[] smsMaps) throws Exception, RemoteException;
	
	/**<p>发送单条WAP PUSH短信的服务
	 *  <p>smsMap：每条WAP PUSH短信的HashMap格式参数值必须传入的KEY如下: <b>建议使用WapPushConstants中的常量定义</b>
	 *  <li>DESTNUM  		String	 	[手机号码]
	 *  <li>OP_ID  			String   	[营业员工号]
	 *  <li>PORT			String   	[端口号] 可不填写，默认为10086
	 *  <li>REGION_ID		String   	[地区] 
	 *  <li>SENDDATE		Timestamp 	[发送时间]
	 *  <li>PUSH_DETAILS   	String 		[PUSH语]
	 *  <li>LINK_ADDRESS   	String 		[链接]  
	 *  
	 *  <p>优先级的处理：若不设置，取短信模板的默认配置，可以传入PRI改变特定短信的发送优先级,KEY为WapPushConstants.WAPPUSH_PRI
	 *  <li>变量值的取值范围：WapPushConstants.[PRI_SMS_LOW,PRI_SMS_NORMAL,PRI_SMS_HIGH]   
	 */
	/*
	 * 
	 */
//	public void saveWapPush(HashMap smsMap) throws Exception, RemoteException;
	
	/**<p>发送多条WAP PUSH短信的服务
	 *  <p>smsMap：每条WAP PUSH短信的HashMap格式参数值必须传入的KEY如下: <b>建议使用WapPushConstants中的常量定义</b>
	 *  <li>DESTNUM  		String	 	[手机号码]
	 *  <li>OP_ID  			String   	[营业员工号]
	 *  <li>PORT			String   	[端口号] 可不填写，默认为10086
	 *  <li>REGION_ID		String   	[地区] 
	 *  <li>SENDDATE		Timestamp 	[发送时间]
	 *  <li>PUSH_DETAILS   	String 		[PUSH语]
	 *  <li>LINK_ADDRESS   	String 		[链接]  
	 *  
	 *  <p>优先级的处理：若不设置，取短信模板的默认配置，可以传入PRI改变特定短信的发送优先级,KEY为WapPushConstants.WAPPUSH_PRI
	 *  <li>变量值的取值范围：WapPushConstants.[PRI_SMS_LOW,PRI_SMS_NORMAL,PRI_SMS_HIGH]   
	 */
//	public void saveWapPushs(HashMap[] smsMap) throws Exception, RemoteException;
	
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
	 * @author: linzhaoming
	 * @date: 2011-3-19
	 * 
	 * Modification History:
	 * Date               Author            Version            Description
	 * -------------------------------------------------------------------
	 * 2012-2-13		  Liujianzhao		v1.0.1			   删除查询接口
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
	 * @author: linzhaoming
	 * @date: 2011-3-19
	 * 
	 * Modification History:
	 * Date               Author            Version            Description
	 * -------------------------------------------------------------------
	 * 2012-2-13		  Liujianzhao		v1.0.1			   删除查询数量接口
	 *
	 */
//	public int querySmsUniversalPendingCount(String destnum, String qryStartDate, String qryEndDate)  throws Exception, RemoteException;

    /**
     *
     * @param destnum            手机号码
     * @param qryStartDate       查询开始时间
     * @param qryEndDate         查询结束时间
     * @param start              分页开始记录数
     * @param end                分页结束记录数
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @author: zhangyb
     * @date: 2012-10-10
     */
    public IBOSmsBatchPendingTempValue[] querySmsFastPending(String destnum, String qryStartDate, String qryEndDate,  int start, int end)throws Exception, RemoteException;

    /**
     *
     * @param destnum
     * @param qryStartDate
     * @param qryEndDate
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @author: zhangyb
     * @date: 2012-10-10
     */
    public int querySmsFastPendingCount(String destnum, String qryStartDate, String qryEndDate) throws Exception,RemoteException;
}


