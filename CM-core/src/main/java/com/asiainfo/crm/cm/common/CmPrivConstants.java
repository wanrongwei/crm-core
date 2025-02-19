package com.asiainfo.crm.cm.common;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmPrivConstants.java
 * @Description: 客户管理中使用到的权限相关枚举值定义
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 13, 2011 5:06:57 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * May 13, 2011		huzq2           v1.0.0               修改原因
 */
public interface CmPrivConstants {

	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmPrivConstants.java
	 * @Description: 权限实体类型定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 13, 2011 5:06:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 13, 2011		huzq2           v1.0.0               修改原因
	 */
	interface SecEntClass {

		/**
		 * 区域级别控制类（客户管理）
		 */
		int REGION_LEVEL = 3448;

		/**
		 * 数据对象控制类（客户管理）
		 */
		int DATA_OBJECT = 3449;

		/**
		 * 数据业务控制类
		 */
		int DATA_CONTROL_CLASS = 25;
	}

	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmPrivConstants.java
	 * @Description: 数据对象访问权限定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 13, 2011 5:07:35 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 13, 2011		huzq2           v1.0.0               修改原因
	 */
	interface SecPriv {

		/**
		 * 管理:最大的权限实体，包含增删改查操作。
		 */
		long OBJ_ADMIN = 46999489L;

		/**
		 * 查询:只具有查询操作的权限。
		 */
		long OBJ_QUERY = 46999490L;

		/**
		 * 新增:只具有新增操作的权限。
		 */
		long OBJ_ADD = 46999491L;

		/**
		 * 修改:只具有修改操作的权限。
		 */
		long OBJ_MODIFY = 46999492L;

		/**
		 * 删除:只具有删除操作的权限。
		 */
		long OBJ_DELETE = 46999493L;

		/**
		 * 导入:只具有导入操作的权限。
		 */
		long OBJ_IMPORT = 46999494L;

		/**
		 * 导出:只具有导出操作的权限。
		 */
		long OBJ_EXPORT = 46999495L;

		/**
		 * 管理:最大的权限实体，包含增删改查操作。
		 */
		long REGION_ADMIN = 46999496L;

		/**
		 * 客户身份认证校验控制
		 */
		long CERT_INFO_CONTROL = 36L;

		// 操作员是否可以操作集团appleId字段
		long CONTROL_APPLE_ID = 30000001L;
	}

	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmPrivConstants.java
	 * @Description: 客户管理使用到的权限实体定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 13, 2011 5:13:28 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 13, 2011		huzq2           v1.0.0               修改原因
	 */
	interface SecEntity {

		/**
		 * 客户身份认证校验控制类
		 */
		long CUST_CERT_CODE = 20018428L;

		// 操作员是否可以操作集团appleId字段
		long CONTROL_APPLE_ID = 30000032L;
	}

	/**
	 * Session中存放当前操作员的权限相关数据的Key。
	 */
	String KEY_SESSION_USER_PERMISSION = "CM_SEC_PERMISSION";

	/**
	 * Session中存在该操作员是否具有集团管理的角色 （关键资料模糊化处理时使用）
	 */
	String KEY_SESSION_USER_HAS_GROUP_ROLE = "CM_SEC_HAS_GROUP_ROLE";
}
