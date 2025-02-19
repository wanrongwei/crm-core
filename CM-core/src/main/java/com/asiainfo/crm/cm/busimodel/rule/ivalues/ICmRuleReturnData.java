/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.rule.ivalues;

import java.io.Serializable;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.bce.ivalues.IBceRuleReturnData;
import com.ai.bce.util.BceUtil;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmRuleReturnData.java
 * @Description: 规则校验返回数据对象
 *   重写了父类的所有方法并添加详细的注释，便于开发人员查看。
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 18, 2011 4:26:35 PM 
 *
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Mar 18, 2011		huzq2           v1.0.0               修改原因
 */
public interface ICmRuleReturnData extends Serializable, IBceRuleReturnData
{

	/**
	 * 不允许
	 * @see BceUtil#JAVA_RULE_RETURN_CODE_NO
	 */
	public static final int CODE_NO = BceUtil.JAVA_RULE_RETURN_CODE_NO;

	/**
	 * 允许但有警告
	 * @see BceUtil#JAVA_RULE_RETURN_CODE_WARNNING
	 */
	public static final int CODE_WARNNING = BceUtil.JAVA_RULE_RETURN_CODE_WARNNING;

	/**
	 * 允许操作
	 * @see BceUtil#JAVA_RULE_RETURN_CODE_YES
	 */
	public static final int CODE_YES = BceUtil.JAVA_RULE_RETURN_CODE_YES;

	/**   
	 * 添加失败数据
	 * @Function: ICmRuleReturnData.java
	 *
	 * @param failDc 失败信息，详细参见{@link DataContainerInterface}
	 * @see IBceRuleReturnData#addFailDc(DataContainerInterface)
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:55:11 PM 
	 */
	public void addFailDc(DataContainerInterface failDc);

	/**   
	 * 添加成功数据
	 * @Function: ICmRuleReturnData.java
	 *
	 * @param successDc 成功数据
	 * @see IBceRuleReturnData#addSuccessDc(DataContainerInterface)
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:55:15 PM 
	 */
	public void addSuccessDc(DataContainerInterface successDc);

	/**   
	 * 添加警告数据
	 * @Function: ICmRuleReturnData.java
	 *
	 * @param warnningDc 警告数据
	 * @see IBceRuleReturnData#addWarnningDc(DataContainerInterface)
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:55:18 PM 
	 */
	public void addWarnningDc(DataContainerInterface warnningDc);

	/**   
	 * 设置自定义编码
	 * @Function: getCustomResultCode
	 *
	 * @return 自定义编码
	 * @see IBceRuleReturnData#getCustomResultCode()
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 21, 2011 7:43:32 PM 
	 */
	public String getCustomResultCode();

	/**   
	 * 获取失败列表，对批量校验有用
	 * @Function: ICmRuleReturnData.java
	 *
	 * @return 失败数据列表
	 * @see IBceRuleReturnData#getFailDcList()
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:55:20 PM 
	 */
	public DataContainerInterface[] getFailDcList();

	/**   
	 * 获取国际化资源Key
	 * @Function: getKey
	 *
	 * @return 获取国际化资源Key
	 * @see IBceRuleReturnData#getKey()
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 21, 2011 7:42:11 PM 
	 */
	public String getKey();

	/**   
	 * 获取校验返回信息
	 * @Function: getMsg()
	 *
	 * @return 获取返回信息
	 * @see IBceRuleReturnData#getMsg()
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:43:42 PM 
	 */
	public String getMsg();

	/**   
	 * 获取校验结果.<br>
	 * 校验结果定义为：<br>
	 * 	允许操作：CmConstants.BusiRuleResultCode.JAVA_RULE_RETURN_CODE_YES;<br>
	 *  允许但有警告:CmConstants.BusiRuleResultCode.JAVA_RULE_RETURN_CODE_WARNNING;<br>
	 *  不允许:CmConstants.BusiRuleResultCode.JAVA_RULE_RETURN_CODE_NO
	 * @Function: ICmRuleReturnData.java
	 *
	 * @return 规则验证结果编码
	 * @see IBceRuleReturnData#getResultCode()
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:45:55 PM 
	 */
	public int getResultCode();

	/**   
	 * 获取成功列表，对批量校验有用
	 * @Function: getSuccessDcList
	 *
	 * @return 成功数据列表
	 * @see IBceRuleReturnData#getSuccessDcList()
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:55:23 PM 
	 */
	public DataContainerInterface[] getSuccessDcList();

	/**   
	 * 获取告警列表，对批量校验有用
	 * @Function: ICmRuleReturnData.java
	 *
	 * @return 告警数据列表
	 * @see IBceRuleReturnData#getWarnningDcList()
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:55:25 PM 
	 */
	public DataContainerInterface[] getWarnningDcList();

	/**   
	 * 设置自定义验证结果编码
	 * @Function: setCustomResultCode
	 *
	 * @param customResultCode 自定义验证结果编码
	 * @see IBceRuleReturnData#setCustomResultCode(String)
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 21, 2011 7:43:26 PM 
	 */
	public void setCustomResultCode(String customResultCode);

	/**   
	 * 设置校验返回信息
	 * @Function: setMsg(String msg)
	 *
	 * @param msg 返回信息
	 * @see IBceRuleReturnData#setMsg(String)
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:45:20 PM 
	 */
	public void setMsg(String msg);

	/**   
	 * 通过国际化设置相关提示数据
	 * @Function: setMsgByKey
	 *
	 * @param key 国际化资源key
	 * @see IBceRuleReturnData#setMsgByKey(String)
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 21, 2011 7:41:56 PM 
	 */
	public void setMsgByKey(String key);

	/**   
	 * 通过国际化设置相关提示数据
	 * @Function: setMsgByKey
	 *
	 * @param key 国际化资源key
	 * @param params 替换的文本
	 * @see IBceRuleReturnData#setMsgByKey(String, Object[])
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 21, 2011 7:40:45 PM 
	 */
	public void setMsgByKey(String key, Object[] params);

	/**   
	 * 设置校验结果
	 * @Function: ICmRuleReturnData.java
	 *
	 * @param resultCode
	 * 校验结果枚举值定义为：<br>
	 * 	允许操作：CmConstants.BusiRuleResultCode.JAVA_RULE_RETURN_CODE_YES;<br>
	 *  允许但有警告:CmConstants.BusiRuleResultCode.JAVA_RULE_RETURN_CODE_WARNNING;<br>
	 *  不允许:CmConstants.BusiRuleResultCode.JAVA_RULE_RETURN_CODE_NO
	 * @see IBceRuleReturnData#setResultCode(int)
	 * @version: v1.0.0
	 * @date: Mar 18, 2011 4:54:04 PM 
	 */
	public void setResultCode(int resultCode);
}
