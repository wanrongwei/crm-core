/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.rule;

import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.rule.bo.CmRuleReturnDataBean;
import com.asiainfo.crm.cm.busimodel.rule.ivalues.ICmRuleReturnData;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmVpmnCustomerValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmVpmnCustomerBusiRule.java
 * @Description: Vpmn客户管理相关业务规则
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 25, 2011 1:26:57 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Mar 25, 2011		huzq2           v1.0.0               修改原因
 */

public class CmVpmnCustomerBusiRule
{
	/**   
	 * 校验数据的有效性、完整性
	 * @Function: validateIntegrity
	 * @Description: 校验数据的有效性、完整性
	 *
	 * @param vpmnCustomerValue
	 * @return ICmRuleReturnData
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 30, 2011 3:53:41 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 30, 2011     huzq2           v1.0.0               修改原因
	 */
	public static ICmRuleReturnData validateIntegrity(IBOCmVpmnCustomerValue vpmnCustomerValue)
	{
		ICmRuleReturnData returnData = new CmRuleReturnDataBean();
		if (vpmnCustomerValue == null)
		{
			// 数据对象为空
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000077"));
			returnData.setResultCode(CmConstants.BusiRuleResultCode.CODE_NO);
		}
		else
		{
			if (vpmnCustomerValue.isNew())
			{
				// 1、校验必填字段
				returnData = CmCommonBusiRule.validateRequriedFields(vpmnCustomerValue, new String[] {
						IBOCmVpmnCustomerValue.S_VpmnCustId, IBOCmVpmnCustomerValue.S_CustName,
						IBOCmVpmnCustomerValue.S_CustStatus });
			}
			else if (vpmnCustomerValue.isModified())
			{
				// 客户名称和客户编号不能为空
				returnData = CmCommonBusiRule.validateRequriedFields(vpmnCustomerValue, new String[] {
						IBOCmVpmnCustomerValue.S_VpmnCustId, IBOCmVpmnCustomerValue.S_CustName,
						IBOCmVpmnCustomerValue.S_CustStatus });
			}
			else if (vpmnCustomerValue.isDeleted())
			{
				// 客户编号不能为空
				returnData = CmCommonBusiRule.validateRequriedFields(vpmnCustomerValue,
						new String[] { IBOCmVpmnCustomerValue.S_VpmnCustId });
			}
		}
		return returnData;
	}
}
