/**
 * 
 */
package com.asiainfo.crm.cm.model.ivalues;

import java.io.Serializable;
import java.util.Map;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-15 下午3:19:46
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmReturnData extends Serializable {

	/**
	 * 处理成功
	 */
	String RESULT_CODE_SUCCESS = "SUCCESS";
	/**
	 * 出现错误
	 */
	String RESULT_CODE_ERROR = "ERROR";
	/**
	 * 出现警告
	 */
	String RESULT_CODE_WARNING = "WARNING";
	/**
	 * 处理失败
	 */
	String RESULT_CODE_FAIL = "FAIL";

	/**   
	 * @Function setResultCode
	 * @Description 设置服务处理结果。具体枚举值见当前类的定义。
	 *
	 * @param code 编码
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:21:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	void setResultCode(String code);

	/**   
	 * @Function getResultCode
	 * @Description 获取处理结果
	 *
	 * @return 处理结果
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:24:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	String getResultCode();

	/**   
	 * @Function setResultMsg
	 * @Description 直接设置处理结果信息。不推荐使用，建议使用通过国际化资源的方式获取。
	 *
	 * @param msg 消息
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:28:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	void setResultMsg(String msg);

	/**   
	 * @Function setResultMsgByKey
	 * @Description 通过国际化资源的方式返回处理结果消息
	 *
	 * @param key 国际化资源编码
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:28:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	void setResultMsgByKey(String key);
	/**   
	 * @Function setResultMsgByKey
	 * @Description  通过国际化资源的方式返回处理结果消息
	 *
	 * @param key 国际化资源编码
	 * @param params 参数
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:29:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	void setResultMsgByKey(String key, Object[] params);
	
	/**   
	 * @Function getResultMsg
	 * @Description 获取处理结果信息
	 *
	 * @return 处理结果信息
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:30:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	String getResultMsg();
	
	/**   
	 * @Function getResultMsgKey
	 * @Description 获取处理结果国际化资源编码
	 *
	 * @return 处理结果国际化资源编码
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:31:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	String getResultMsgKey();
	
	/**   
	 * @Function getResultParams
	 * @Description 获取处理结果国际化资源参数
	 *
	 * @return 处理结果国际化资源参数
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:31:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	Object []getResultParams();
	
	/**   
	 * @Function setUserObject
	 * @Description 设置自定义对象
	 *
	 * @param key 键
	 * @param value 值
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:44:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public void setUserObject(Object key, Object value);
	
	/**   
	 * @Function getUserMap
	 * @Description 获取用户定义的对象Map
	 *
	 * @return Map
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:33:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public Map<Object, Object> getUserMap();

	/**   
	 * @Function getUserObject
	 * @Description 获取指定的用户自定对象
	 *
	 * @param key
	 * @return 指定的用户自定对象
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:43:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public Object getUserObject(Object key);
}
