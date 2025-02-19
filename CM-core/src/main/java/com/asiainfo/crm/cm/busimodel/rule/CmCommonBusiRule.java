/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.rule;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.rule.bo.CmRuleReturnDataBean;
import com.asiainfo.crm.cm.busimodel.rule.ivalues.ICmRuleReturnData;
import com.asiainfo.crm.cm.busimodel.rule.util.IDCardValidator;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmCommonBusiRule.java
 * @Description: 客户管理域公用的业务规则类
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 18, 2011 3:53:13 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Mar 18, 2011		huzq2           v1.0.0               修改原因
 */

public class CmCommonBusiRule {

	/**   
	 * 校验身份证号码是否正确
	 * @Function: CmCommonBusiRule.java
	 * @Description: 校验身份证号码是否正确
	 * 
	 *
	 * @param idCardNumber 身份证号码。被检验的身份证号码。
	 * @param isMandatory 是否强制行校验。强制性校验除了校验身份证的基本校验[长度、数字和字母]，还要校验身份证的地市编码、生日日期格式和校验码是否正确。
	 * @return ICmRuleReturnData
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 18, 2011 4:32:56 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 18, 2011     huzq2           v1.0.0               修改原因
	 */
	public static ICmRuleReturnData validateIDCardNumber(String idCardNumber, boolean isMandatory) {
		ICmRuleReturnData returnData = new CmRuleReturnDataBean();
		// 证件号码不为空并且长度是15位或者18位。
		if (StringUtils.isNotBlank(idCardNumber) && (idCardNumber.length() == 15 || idCardNumber.length() == 18)) {
			boolean flag = true;
			// 强制性校验
			if (isMandatory) {
				flag = IDCardValidator.isValidatedIdcard(idCardNumber);
			}else {
				// 身份证号码的基本数字和位数验校
				flag = IDCardValidator.is15Idcard(idCardNumber) || IDCardValidator.is18Idcard(idCardNumber);
			}
			if(flag){
				// 身份证地区校验
				flag = IDCardValidator.isCardArea(idCardNumber);
			}
			if (flag) {
				// 校验成功！
				returnData.setMsg(CrmLocaleFactory.getResource("CMS0000252"));
				returnData.setResultCode(ICmRuleReturnData.CODE_YES);
			} else {
				// 不是有效的身份证号码！
				returnData.setMsg(CrmLocaleFactory.getResource("CMS0000253"));
				returnData.setResultCode(ICmRuleReturnData.CODE_NO);
			}
		} else {
			// 身份证号码长度必须为15位或者18位！
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000254"));
			returnData.setResultCode(ICmRuleReturnData.CODE_NO);
		}
		return returnData;
	}

	/**   
	 * 校验字符串数字是否是数字
	 * @Function: CmCommonBusiRule.java
	 * @Description: 校验字符串数字是否是数字
	 *
	 * @param s
	 * @return
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 18, 2011 5:02:12 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 18, 2011     huzq2           v1.0.0               修改原因
	 */
	public static ICmRuleReturnData validateNumberStrings(String[] s) {
		ICmRuleReturnData returnData = new CmRuleReturnDataBean();
		// 如果参数为空则只提示警告即可。
		if (null == s || s.length < 1) {
			// 参数{0}不能为空！
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0403001", ""));
			returnData.setResultCode(ICmRuleReturnData.CODE_WARNNING);
			return returnData;
		}
		Pattern pattern = Pattern.compile("^[0-9]*$");
		for (int i = 0; i < s.length; i++) {
			if (!(pattern.matcher(s[i]).matches())) {
				// 如果存在非字符数据则记录下来
				DataContainerInterface dc = new DataContainer();
				dc.set("VALUE", s[i]);
				returnData.addFailDc(dc);
			}
		}
		if (returnData.getFailDcList() != null && returnData.getFailDcList().length > 0) {
			// 存在非数字字符串！
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000251"));
			returnData.setResultCode(ICmRuleReturnData.CODE_NO);
		} else {
			// 校验成功！
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000252"));
			returnData.setResultCode(ICmRuleReturnData.CODE_YES);
		}
		return returnData;
	}

	/**   
	 *  数字验证
	 * @Function: CmCommonBusiRule.java
	 * @Description: 数字验证
	 *
	 * @param str
	 * @return ICmRuleReturnData
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 18, 2011 11:20:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 18, 2011     huzq2           v1.0.0               修改原因
	 */
	public static ICmRuleReturnData validateDigital(String str) {
		ICmRuleReturnData returnData = new CmRuleReturnDataBean();
		if (StringUtils.isBlank(str) ? true : !str.matches("^[0-9]*$")) {
			// 存在非数字字符串！
			returnData.setResultCode(ICmRuleReturnData.CODE_NO);
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000251"));
		} else {
			// 校验成功！
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000252"));
			returnData.setResultCode(ICmRuleReturnData.CODE_YES);
		}
		return returnData;
	}

	/**   
	 * 该函数的功能描述
	 * @Function: CmCommonBusiRule.java
	 * @Description: 该函数的功能描述
	 *
	 * @param dc 被检验的对象
	 * @param keyPropertyNames 需要检验的属性名称
	 * @return ICmRuleReturnData 如果存在被修改的属性，则返回状态为WARNNING，否则为YES。
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 19, 2011 11:37:03 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 19, 2011     huzq2           v1.0.0               修改原因
	 */
	public static ICmRuleReturnData validateKeyPropertyModified(DataStructInterface dc, String[] keyPropertyNames) throws Exception {
		ICmRuleReturnData returnData = new CmRuleReturnDataBean();
		if (dc != null && keyPropertyNames != null) {
			for (int i = 0, length = keyPropertyNames.length; i < length; i++) {
				if (dc.isPropertyModified(keyPropertyNames[i])) {
					DataContainerInterface aDataContainer = new DataContainer();
					aDataContainer.set("PROPERTY_NAME", keyPropertyNames[i]);
					aDataContainer.set("NEW_VALUE", dc.get(keyPropertyNames[i]));
					aDataContainer.set("OLD_VALUE", dc.getOldObj(keyPropertyNames[i]));
					returnData.addWarnningDc(aDataContainer);
				}
			}
		}
		if (returnData.getWarnningDcList() != null && returnData.getWarnningDcList().length > 0) {
			returnData.setResultCode(ICmRuleReturnData.CODE_WARNNING);
			// 关键信息已被修改！
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000255"));
		} else {
			// 校验成功！
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000252"));
			returnData.setResultCode(ICmRuleReturnData.CODE_YES);
		}
		return returnData;
	}

	/**   
	 * 关键字段验证
	 * @Function: validateRequriedFields
	 * @Description: 关键字段验证
	 *
	 * @param dc
	 * @param requriedFields
	 * @return
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 25, 2011 11:39:17 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     huzq2           v1.0.0               修改原因
	 */
	public static ICmRuleReturnData validateRequriedFields(DataStructInterface dc, String[] requriedFields) {
		ICmRuleReturnData returnData = new CmRuleReturnDataBean();
		if (dc == null) {
			// 数据对象为空
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000077"));
			returnData.setResultCode(ICmRuleReturnData.CODE_NO);
		} else if (!CmCommonUtil.isNotEmptyObject(requriedFields)) {
			// 参数{0}不能为空！
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0403001", "requriedFields"));
			returnData.setResultCode(ICmRuleReturnData.CODE_NO);
		} else {
			for (int i = 0, length = requriedFields.length; i < length; i++) {
				if (dc.get(requriedFields[i]) == null || StringUtils.isBlank(dc.get(requriedFields[i]).toString()) || "-1".equals(dc.get(requriedFields[i]).toString()))// 值为空或-1都表示未填
				{
					DataContainerInterface aDataContainer = new DataContainer();
					aDataContainer.set("NAME", requriedFields[i]);
					aDataContainer.set("VALUE", dc.get(requriedFields[i]));
					returnData.addFailDc(aDataContainer);

				}
			}
			if (returnData.getResultCode() == ICmRuleReturnData.CODE_NO || (returnData.getFailDcList() != null && returnData.getFailDcList().length > 0)) {
				// 关键信息不能为空！
				returnData.setMsg(CrmLocaleFactory.getResource("CMS0000290"));
				returnData.setResultCode(ICmRuleReturnData.CODE_NO);
			} else {
				// 校验成功！
				returnData.setMsg(CrmLocaleFactory.getResource("CMS0000252"));
				returnData.setResultCode(ICmRuleReturnData.CODE_YES);
			}
		}
		return returnData;
	}
}
