/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.rule;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.StringUtils;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.busimodel.rule.util.IDCardValidator;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmIndivCustomerBusiRule.java
 * @Description: 个人客户相关业务规则
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 25, 2011 1:22:24 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Mar 25, 2011		huzq2           v1.0.0               修改原因
 */

public class CmIndivCustomerBusiRule
{

	// 个人客户的其它必填字段
//	private static final String[] INDIV_CUST_NEED_COLS = { IBOCmIndivCustomerValue.S_CustName,
//			IBOCmIndivCustomerValue.S_CustStatus, IBOCmIndivCustomerValue.S_Gender,
//			IBOCmIndivCustomerValue.S_CustCertType, IBOCmIndivCustomerValue.S_CustCertCode,
//			IBOCmIndivCustomerValue.S_RealNameFlag };

	// 个人客户的关键信息字段
//	private static final String[] INDIV_CUST_KEY_INFO = { IBOCmIndivCustomerValue.S_CustCertType,
//			IBOCmIndivCustomerValue.S_CustCertCode };


//	private static final String SET_NAME_INDIV_CUSTOMER = "com.asiainfo.crm.customer.customer.individual.web.SETCmIndivCustomer";

	

	public static boolean isRealNameCust(String billId, String custId, String custName, String certType, String certCode)
			throws Exception
	{
		boolean result = true;
		// 手机号码不为空时，首先校验用户是否为套卡/预开户，且未做过套卡客户资料补录，为非实名
//		if (!StringUtils.isEmptyString(billId))
//		{
//			ISo2CmSV so2CmSV = (ISo2CmSV) ServiceFactory.getService(ISo2CmSV.class);
//			IQUserBaseInfoValue userInfo = so2CmSV.queryUserBaseInfoByBillId(billId);
//			// TODO:确认枚举值
//			if (userInfo.getUserType() == OrderConst.INST_USER_STATE_PRE_CREATE)
//			{
//				result = false;
//			}
//		}
		// 身份证号码有效性校验
		if (Integer.toString(CmConstants.CertificateType.IDENTITY_CARD).equals(certType)
				&& !StringUtils.isEmptyString(certCode))
		{
			result = IDCardValidator.isIdcard(certCode);
		}
		else
		{ // 非身份证目前均非实名
			result = true;//为其他证件，则不判断，均认为正确。
		}

		// 客户名称的特殊字符校验
		if (!StringUtils.isEmptyString(custId))
		{
			ICmIndivCustomerSV customerSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			IBOCmIndivCustomerValue value = customerSV.queryIndivCustomerById(Long.valueOf(custId).longValue());
			custName = value.getCustName();
		}
		if (StringUtils.isEmptyString(custName))
		{
			result = false;
		}
		else
		{
			char[] nameChars = custName.toCharArray();
			int chineseChars = 0;
			for (int i = 0, len = nameChars.length; i < len; i++)
			{
				Character.UnicodeBlock ub = Character.UnicodeBlock.of(nameChars[i]);
				if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
						|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
						|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
						|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
						|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
						|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS)
				{
					chineseChars++;
				}
			}

			if (chineseChars < 2)
			{ // 中文字符小于2个
				result = false;
			}
			else
			{
				IBOBsStaticDataValue[] specialNames = StaticDataUtil.getStaticData("CUST_SPECIAL_NAMES");
				if (specialNames != null && specialNames.length > 0)
				{
					for (int i = 0, len = specialNames.length; i < len; i++)
					{
						if (custName.indexOf(specialNames[i].getCodeName()) != -1)
						{
							result = false;
							break;
						}
					}
				}
			}
		}
		return result;
	}
	
}
