/**   
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: DisplayNameUtil.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: huangxl
* @date: 2012-3-28 下午02:42:56 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2012-3-28     huangxl           v1.0.0               修改原因
*/
package com.asiainfo.crm.cm.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;

/**
 * @author huangxl
 *
 *
 * @version: v1.0.0
 * @author: huangxl
 * @date: 2012-3-28 下午02:42:56 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2012-3-28     huangxl           v1.0.0               修改原因
 */
public class DisplayNameUtil {
	private static final Log log  =  LogFactory.getLog(DisplayNameUtil.class);
	/**
	 * 调用权限接口,根据组织编号获取组织名称显示
	 * @param orgId 组织id
	 * @return String
	 */
	public static String getOrgNameByOrgId(long orgId)
	{
		String result="";	
		try{
			//组织信息
			IBOSecOrganizeValue orgValue = OrgmodelClient.getSecOrganizeById(orgId, true);
			if (orgValue==null)
			{
				result = String.valueOf(orgId); //未查询到以组织id表示
			}else
			{
				result = orgValue.getOrganizeName();  //组织名称
			}			
		}catch(Exception e){
			log.info(e.getMessage(), e);
			result = String.valueOf(orgId);
		}
		return result;
	}
	
	/**
	 * 根据操作员编号获取操作员名称
	 * @param operId 
	 * @return String  操作员名称
	 */
	public static String getOperNameByOperId(long operId)
	{
		String result="";
		try{
			//权限接口调用
			//操作员,员工,组织信息
			IBOSecOperatorValue opValue = OrgmodelClient.getOperatorById(operId);
			//IBOSecStaffValue opValue = OrgmodelClient.getStaffByOperatorId(operId);
			if (opValue == null){
				result = String.valueOf(operId); //未查询到以操作员id表示
			}else{
				result = opValue.getCode();  //员工姓名
			}			
		}catch(Exception e){
			log.info(e.getMessage(), e);
			result=String.valueOf(operId);
		}		
		return result;
	}
	
	public static String getBusiName(int busiType){
		String result = "";
		switch(busiType){
		case 1:	
			result = CrmLocaleFactory.getResource("CMS2000001");	
			break;
		case 2:
			result = CrmLocaleFactory.getResource("CMS2000002");
			break;
		case 3:
			result = CrmLocaleFactory.getResource("CMS2000003");
			break;
		case 4:
			result = CrmLocaleFactory.getResource("CMS2000003");
			break;
		default:
			result = "";
			break;		
		}
		return result;
	}
}
