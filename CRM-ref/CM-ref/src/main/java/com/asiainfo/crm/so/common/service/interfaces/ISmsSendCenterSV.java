package com.asiainfo.crm.so.common.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;

public interface ISmsSendCenterSV {

	/**
	 * 
	 * @Description: 根据传入的参数值，查询它的短信模板，并解析出参数值，调用平台ISmsPendingSV.saveSmsPending方法发送短信
	 * @param:HashMap map. MAP里面必须要传的参数，其KEY值如下：
	 * <li>DESTNUM      String	  [手机号码]
	 * <li>OPTCODE  	String	  [操作ID]
	 * <li>REGION_ID    String	  [地市]
	 * <li>TAMPLATE_ID  String	  [模板ID]
	 * <li>SMS_SYSTEM_TEMPLATE_ID  String	  [外部系统模板ID,可不传，若传，以传入的为准]
	 * <li>SENDDATE		Timestamp [可不传，发送时间，不传默认为当前时间]
	 * <li>PORT			String	  [可不传，端口号，不传默认为10086]
	 * <li>param_map	HashMap   [可不传，用于对模板里的变量赋值，目的为了减少数据库交互。KEY名称为：模板里变量的名称]
	 * <li>*            Object    [自定义，可多个，不可与之前的KEY冲突，定义规则：与表BS_OPERATION_SMS_PARAM字段SMS_PARAM_VALUE_EXPR里的参数对象要一致]
	 * @return：void
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: yangcy3@asiainfo-linkage.com
	 * @date: 2012-2-8
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-2-8     zhangwx       v1.0.0               修改原因
	 */
	public void sendSmsForCBoss(HashMap map) throws Exception, RemoteException;
	/**
	 * 
	 * @Description: 根据传入的参数值，查询它的短信模板，并解析出参数值，调用平台ISmsPendingSV.saveSmsPending方法发送短信
	 * @param:HashMap map. MAP里面必须要传的参数，其KEY值如下：
	 * <li>DESTNUM      String	  [手机号码]
	 * <li>OPTCODE  	String	  [操作ID]
	 * <li>REGION_ID    String	  [地市]
	 * <li>SENDDATE		Timestamp [可不传，发送时间，不传默认为当前时间]
	 * <li>PORT			String	  [可不传，端口号，不传默认为10086]
	 * <li>OFFER_ID     String	  [可不传，策划编号]
	 * <li>OFFER_TYPE   String	  [可不传，策划类型]
	 * <li>PRODUCT_ID	String	  [可不传，产品编号]
	 * <li>X_REGION_ID	String	  [建议传，地市，用于根据地市定位数据。如果是全省，建议模板REGION配置为-1，否则如果现在是为空，以后如果要区分地市，会影响之前的代码判断]
	 * <li>EXT_1		String    [可不传，用于增加查询条件来定位数据]
	 * <li>EXT_2		String    [可不传，用于增加查询条件来定位数据]
	 * <li>param_map	HashMap   [可不传，用于对模板里的变量赋值，目的为了减少数据库交互。KEY名称为：模板里变量的名称]
	 * <li>*            Object    [自定义，可多个，不可与之前的KEY冲突，定义规则：与表BS_OPERATION_SMS_PARAM字段SMS_PARAM_VALUE_EXPR里的参数对象要一致]
	 * @return：void
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: yangcy3@asiainfo-linkage.com
	 * @date: Apr 7, 2011 7:33:25 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 7, 2011     yangchunyi       v1.0.0               修改原因
	 */
	public void sendSms(HashMap map) throws Exception, RemoteException;
}
