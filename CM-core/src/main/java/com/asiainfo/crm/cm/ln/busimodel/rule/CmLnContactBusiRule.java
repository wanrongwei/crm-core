package com.asiainfo.crm.cm.ln.busimodel.rule;

import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 辽宁联系人业务规则类
 *
 * @version v1.0.0
 * @author shitian
 * @date Aug 30, 2012 1:46:05 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Aug 30, 2012     shitian           v1.0.0               修改原因<br>
 */
public class CmLnContactBusiRule {

	/**
	 * 同步的客户字段
	 */
	public static String[] SYS_CUST_INFO = { "CUST_NAME", "CUST_NAME", "SHORT_NAME", "ENGLISH_NAME", "CUST_CERT_TYPE", "CUST_CERT_CODE", "CUST_CERT_ADDRESS", "CUST_CERT_EFFDATE",
			"CUST_CERT_EXPIRE", "GENDER" };

	/**
	 * 同步的联系人字段
	 */
	public static String[] SYS_CONT_INFO = { "PARTY_NAME", "CONT_NAME", "SHORT_NAME", "ENGLISH_NAME", "CERT_TYPE", "CERT_CODE", "CERT_ADDRESS", "CUST_CERT_EFFDATE",
			"CERT_EXPIRE_DATE", "GENDER" };

	/**   
	 * @Function sysCustInfo2Cont
	 * @Description 查询联系人的时候，将客户资料覆盖联系人，保证资料以客户为准
	 *
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 30, 2012 1:46:28 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 30, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static void sysCustInfo2Cont(DataStructInterface custValue, DataStructInterface contValue) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(custValue) && CmCommonUtil.isNotEmptyObject(contValue)) {
			for (int i = 0, len = SYS_CONT_INFO.length; i < len; i++) {
				contValue.set(SYS_CONT_INFO[i], custValue.get(SYS_CUST_INFO[i]));
			}
		}
	}
}
