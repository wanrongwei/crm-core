/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.rule;

import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.secframe.sysmgr.ivalues.IBOSecEntityValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecPrivValue;
import com.asiainfo.crm.cm.busimodel.rule.bo.CmRuleReturnDataBean;
import com.asiainfo.crm.cm.busimodel.rule.ivalues.ICmRuleReturnData;
import com.asiainfo.crm.cm.common.CmServiceFactory;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage<br>
 * <strong>注意：</strong> 该类只能在Web端运行，不能再App层的SV、DAO等地方调用该类！
 * 
 * @ClassName: CmPrivBusiRule.java
 * @Description: 客户管理权限控制业务规则类
 * 
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 13, 2011 5:00:41 PM
 * 
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* May 13, 2011 huzq2
 * v1.0.0 修改原因
 */

public class CmPrivBusiRule {

	/**
	 * @Function: checkBasePermission
	 * @Description: 根据指定操作员编号、实体编号和操作行为编号验证操作员是否有对该实体操作的权限。
	 * 
	 * @param operId
	 *            操作员编号
	 * @param entId
	 *            实体编号
	 * @param privId
	 *            操作行为编号
	 * @return 验证结果 true 通过， false 不通过
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @throws Exception
	 * @date: May 16, 2011 9:23:37 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* May 16, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static boolean checkBasePermission(long operId, long entId, long privId) throws Exception {
		// 如果在Session管理器中找不到登录用户信息时则认为是从服务层调用的，直接调用权限管理的接口进行校验.
		if (ServiceManager.getUser() == null || ServiceManager.getUser().getID() != operId) {
			return CmServiceFactory.getTeamInvokeSV().checkSecEntityPermission(operId, entId, privId);
		}
		// 权限验证
		return checkEntityPermission(entId, privId);
	}

	/**
	 * 根据操作员编号、实体编号和操作行为编号验证操作员是否具有其他操作员再授权的操作权限。
	 * 
	 * @Function: checkRegrantPermission
	 * @Description: 根据操作员编号、实体编号和操作行为编号验证操作员是否具有其他操作员再授权的操作权限。
	 * 
	 * @param operId
	 *            操作员编号
	 * @param entId
	 *            实体编号
	 * @param privId
	 *            操作行为编号
	 * @return 验证结果 true 通过， false 不通过
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 17, 2011 4:45:41 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* May 17, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static boolean checkRegrantPermission(long operId, long entId, long privId) throws Exception {
		boolean hasPermission = false;
		// 权限验证 上海不存在这样的需求
		return hasPermission;
	}

	/**
	 * 验证当前操作员是否具有操作指定实体的权限。<br>
	 * 验证是先从Session中查看是否已经有了缓存，如果有了则从Session中取，否则重新缓存到Session，尽可能的减少数据库访问，提高性能。
	 * 
	 * @Function: checkEntityPermission
	 * 
	 * @param operId
	 *            操作员编号
	 * @param entId
	 *            实体编号
	 * @param privId
	 *            操作权限编号
	 * @return 是否有权限。true 有，false 无。
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 7:07:02 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jun 8, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	private static boolean checkEntityPermission(long entId, long privId) throws Exception {
		return CmServiceFactory.getTeamInvokeSV().checkSecEntityPermission(ServiceManager.getUser().getID(), entId, privId);
	}

	/**
	 * 根据实体编号查询权限实体信息.
	 * 
	 * @Function: getSecEntityByPrivId
	 * 
	 * @param operId
	 * @param entId
	 * @return
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 7:28:43 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jun 8, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	private static String getSecEntityNameByEntId(long operId, long entId) throws Exception {
		IBOSecEntityValue entityValue = CmServiceFactory.getTeamInvokeSV().getSecEntityByEntId(entId);
		if (entityValue != null) {
			return entityValue.getEntName();
		}
		return null;
	}

	/**
	 * 根据操作权限编号查询操作权限信息。<br>
	 * 
	 * @Function: getSecPrivByPrivId
	 * 
	 * @param operId
	 * @param privId
	 * @return
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 7:19:06 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jun 8, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	private static String getSecPrivNameByPrivId(long operId, long privId) throws Exception {
		IBOSecPrivValue privValue = CmServiceFactory.getTeamInvokeSV().getSecPrivByPrivId(privId);
		if (privValue != null) {
			return privValue.getPrivName();
		}
		return null;
	}

	/**
	 * @Function: getRuleReturnData
	 * @Description: 生成规则校验返回信息
	 * 
	 * @param entId
	 *            实体编号
	 * @param privId
	 *            操作权限编号
	 * @param hasPermission
	 *            是否有权限
	 * @return 规则校验返回对象
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 8:14:48 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* May 20, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static ICmRuleReturnData getRuleReturnData(long operId, long entId, long privId, boolean hasPermission) throws Exception {
		ICmRuleReturnData returnData = new CmRuleReturnDataBean();
		if (hasPermission) {
			// 权限验证通过！
			returnData.setResultCode(ICmRuleReturnData.CODE_YES);
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000370"));
		} else {
			// 权限验证失败！您没有{0}{1}的权限，如果需要此操作，请与管理员联系。
			returnData.setResultCode(ICmRuleReturnData.CODE_NO);
			returnData.setMsg(CrmLocaleFactory.getResource("CMS0000371", getSecPrivNameByPrivId(operId, privId), getSecEntityNameByEntId(operId, entId)));
		}
		return returnData;
	}
}