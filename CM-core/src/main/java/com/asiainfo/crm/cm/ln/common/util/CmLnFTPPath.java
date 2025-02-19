package com.asiainfo.crm.cm.ln.common.util;

import com.ai.common.i18n.CrmLocaleFactory;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 辽宁服务器地址编码配置
 *
 * @version v1.0.0
 * @author kangzk
 * @date Aug 25, 2012 2:57:12 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Aug 25, 2012     kangzk           v1.0.0               修改原因<br>
 */
public class CmLnFTPPath {

	public interface CMLNFTPCODE {
		
		//AFFIX 附件管理地址 
		public static final String AFFIX_GROUP_FILE_CODE = CrmLocaleFactory.getResource("CMS1100229");
		
		//AFFIX 附件管理地址 
		public static final String AFFIX_GROUP_CONTACT_FILE_CODE = CrmLocaleFactory.getResource("CMS1100230");
		
		//AFFIX 附件管理地址 
		public static final String AFFIX_GROUP_CONTRACT_FILE_CODE = CrmLocaleFactory.getResource("CMS1100231");
		
		//TASK 个人信誉度同步更改服务器地址
		public static final String TASK_INDIV_CUSTOMER_LEVEL_CODE = CrmLocaleFactory.getResource("CMS1100232");
		
		//TASK 集团信誉度同步更改服务器地址
		public static final String TASK_GROUP_CUSTOMER_LEVEL_CODE =CrmLocaleFactory.getResource("CMS1100233");
		
		//FP 集团联系人关键人生日提醒
		public static final String FP_GROUP_CONTACT_CODE = CrmLocaleFactory.getResource("CMS1100234");
		
		//FP 电话经理组与电话经理关系信息
		public static final String FP_MOBILE_TEMP_CODE = CrmLocaleFactory.getResource("CMS1100235");
		
		//BP 文件批量导入服务器
		public static final String BP_FILE_TO_LEAD_CODE = CrmLocaleFactory.getResource("CMS1100236");
		
		//ESOP 服务器地址   CM_ESOP_FILE_UPLOAD_FTP
		public static final String ESOP_FILE_UPLOAD_CODE = CrmLocaleFactory.getResource("CMS1100237");
		
		//短信下发服务器
		public static final String CM_SEND_FILE_FTP="CM_SEND_FILE_FTP";
		
		//用户扩展信息服务器
		public static final String CM_USER_KZ_FTP="CM_USER_KZ_FTP";
		
		//前台页面导出
		public static final String CM_EXPORT_EXCEL_FTP="CM_EXPORT_EXCEL_FTP";
		
		
		//公共服务器
		public static final String CM_FILE_FTP="CM_FILE_FTP";
		
	}
}















