/**
 * 
 */
package com.asiainfo.crm.cm.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.config.CmConfigLoader;
import com.asiainfo.crm.cm.common.config.bean.CmBusiModel;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonExportSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmInterfaceLogSV;
import com.asiainfo.crm.cm.customer.speusermain.service.interfaces.ICmUserSperuserMainSV;
import com.asiainfo.crm.cm.exe.tf.service.interfaces.ICmPsBusiSV;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV;
import com.asiainfo.crm.cm.ln.customer.contact.service.interfaces.ICmLnContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubActivitySV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubServiceSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmEntityAttrSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupContractSV;
import com.asiainfo.crm.cm.service.interfaces.ICmManagerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.service.interfaces.ICmSpecialListSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmServiceFactory.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: 2011-7-1 下午1:59:59 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2011-7-1		huzq2           v1.0.0               修改原因
 */

public class CmServiceFactory {

	private static final Map BUSI_MODEL_IMPL_CACHE = new HashMap();

	/**   
	 * @Function getAccountSV
	 * @Description 获取账户管理服务
	 *
	 * @return 账户管理服务
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-31 下午1:26:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-31     Xiaohu           v1.0.0               修改原因<br>
	 */
	public static final ICmAccountSV getAccountSV() {
		return (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
	}

	public static final ICmLnAccountSV getLnAccountSV() {
		return (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
	}

	public static final Object getBusiMode(Class busiModeInterface) throws Exception {
		return getBusiMode(busiModeInterface, null);
	}

	public static final ICmInterfaceLogSV getInterfaceLogSV() {
		return (ICmInterfaceLogSV) ServiceFactory.getService(ICmInterfaceLogSV.class);
	}

	public static final Object getBusiMode(Class busiModeInterface, String regionId) throws Exception {
		Object retobj = null;
		if (busiModeInterface != null) {
			String name = busiModeInterface.getName();
			synchronized (BUSI_MODEL_IMPL_CACHE) {
				if (!BUSI_MODEL_IMPL_CACHE.containsKey(name)) {
					// Timestamp sysdate = TimeUtil.getPrimaryDataSourceSysDate();
					if (StringUtils.isBlank(regionId)) {
						regionId = "X";
					}
					CmBusiModel busiModel = CmConfigLoader.getInstance().getBusiModel(busiModeInterface, regionId);
					if (busiModel != null) {
						busiModel.validate();
						retobj = ServiceFactory.getSeviceOfLocal(StringUtils.trim(busiModel.getImplClass()));
					} else {
						String prePackage = "com.asiainfo.crm.cm.busimodel.impl.defaults";
						String className = busiModeInterface.getSimpleName();
						className = className.substring(8, className.length());
						StringBuilder allClassName = new StringBuilder();
						allClassName.append(prePackage).append(".").append("Default").append(className);
						retobj = ServiceFactory.getSeviceOfLocal(allClassName.toString());
					}
					BUSI_MODEL_IMPL_CACHE.put(name, retobj);
				} else {
					retobj = BUSI_MODEL_IMPL_CACHE.get(name);
				}
			}
		}
		return retobj;
	}

	/**
	 *  获取客户管理公共服务
	 * @Function: getCommonSV
	 *
	 * @return 客户管理公共服务
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-1 下午2:03:29 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-1     huzq2           v1.0.0               修改原因
	 */
	public final static ICmCommonSV getCommonSV() {
		return (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
	}

	/**
	 *  获取客户管理公共服务
	 * @Function: getCommonSV
	 *
	 * @return 客户管理公共服务
	 *
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-12-12 下午2:03:29 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-1     kangzk           v1.0.0               修改原因
	 */
	public final static ICmCommonExportSV getCmCommonExportSV() {
		return (ICmCommonExportSV) ServiceFactory.getService(ICmCommonExportSV.class);
	}

	/**   
	 * @Function getContactSV
	 * @Description 获取联系人管理服务
	 *
	 * @return 联系人管理服务
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-28 下午3:58:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-28     huzq2           v1.0.0               修改原因
	 */
	public final static ICmContactSV getContactSV() {
		return (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
	}

	/**   
	 * @Function getContactSV
	 * @Description 获取联系人管理服务
	 *
	 * @return 联系人管理服务
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-28 下午3:58:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-28     huzq2           v1.0.0               修改原因
	 */
	public final static ICmLnContactSV getLnContactSV() {
		return (ICmLnContactSV) ServiceFactory.getService(ICmLnContactSV.class);
	}

	/**   
	 * @Function getCustomerSV
	 * @Description 获取客户管理服务
	 *
	 * @return 客户管理服务
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-31 下午1:36:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-31     Xiaohu           v1.0.0               修改原因<br>
	 */
	public static ICmCustomerSV getCustomerSV() {
		return (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
	}

	/**   
	 * @Function getClubServiceSV
	 * @Description 俱乐部服务管理服务
	 *
	 * @return 俱乐部服务管理服务
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午2:49:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public final static ICmClubServiceSV getClubServiceSV() {
		return (ICmClubServiceSV) ServiceFactory.getService(ICmClubServiceSV.class);
	}

	/**   
	 * @Function getClubMemberSV
	 * @Description 俱乐部会员管理服务
	 *
	 * @return 俱乐部会员管理服务
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午2:50:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public final static ICmClubMemberSV getClubMemberSV() {
		return (ICmClubMemberSV) ServiceFactory.getService(ICmClubMemberSV.class);
	}

	/**   
	 * @Function getPsBusiSV
	 * @Description 后台TF相关的服务
	 *
	 * @return 后台TF相关的服务
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-24 下午2:26:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
	 */
	public final static ICmPsBusiSV getPsBusiSV() {
		return (ICmPsBusiSV) ServiceFactory.getService(ICmPsBusiSV.class);
	}

	/**   
	 * @Function getClubSV
	 * @Description 获取俱乐部服务
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午11:04:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public final static ICmClubSV getClubSV() {
		return (ICmClubSV) ServiceFactory.getService(ICmClubSV.class);
	}

	/**   
	 * @Function getClubActivitySV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午11:07:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public final static ICmClubActivitySV getClubActivitySV() {
		return (ICmClubActivitySV) ServiceFactory.getService(ICmClubActivitySV.class);
	}

	/**   
	 * 获取特殊名单服务
	 * @Function getSpecialListSV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午12:59:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public final static ICmSpecialListSV getSpecialListSV() {
		return (ICmSpecialListSV) ServiceFactory.getService(ICmSpecialListSV.class);
	}

	/**   
	 * 获取降零用户服务
	 * @Function getSpecialListSV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午12:59:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public final static ICmUserSperuserMainSV getUserSpenUserMainSV() {
		return (ICmUserSperuserMainSV) ServiceFactory.getService(ICmUserSperuserMainSV.class);
	}

	/**   
	 * 获取参与人管理服务
	 * @Function getPartySV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午2:53:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public final static ICmPartySV getPartySV() {
		return (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
	}

	/**   
	 * 客户管理调用外部接口封装服务
	 * @Function getTeamInvokeSV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-11 下午2:43:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-11     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICmTeamInvokeSV getTeamInvokeSV() {
		return (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
	}

	/**   
	 * 实体扩展属性表服务
	 * @Function getEntityAttrSV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午4:33:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICmEntityAttrSV getEntityAttrSV() {
		return (ICmEntityAttrSV) ServiceFactory.getService(ICmEntityAttrSV.class);
	}

	/**   
	 * 
	 * @Function getManagerSV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-26 上午10:07:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-26     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICmManagerSV getManagerSV() {
		return (ICmManagerSV) ServiceFactory.getService(ICmManagerSV.class);
	}

	/**   
	 * @Function getBusiLogSV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-12 下午7:55:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12     huzq           v1.0.0               修改原因<br>
	 */
	public static ICmBusiLogSV getBusiLogSV() {
		return (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
	}

	/**   
	 * @Function getGroupContractSV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-8 下午3:37:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-8     huzq           v1.0.0               修改原因<br>
	 */
	public static ICmGroupContractSV getGroupContractSV() {
		return (ICmGroupContractSV) ServiceFactory.getService(ICmGroupContractSV.class);
	}

	/**  
	 * 获取权限管理提供的服务
	 * @Function: getSec2CmSV
	 *
	 * @return 权限管理的服务
	 *
	 * @version: v1.0.0
	 * @author: nicheng
	 * @date: 2012-8-6  下午2:38:52 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-8-6     nicheng           v1.0.0               修改原因
	 */
	public static ISec2CmSV getSec2CmSV() {
		return (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
	}
}
