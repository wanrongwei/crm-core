package com.asiainfo.crm.cm.inner.util;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.inner.account.service.interfaces.ICmAccountInnerSV;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 客户管理内部服务工厂类
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-14 下午9:06:19
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
 */
public final class CmInnerServiceFactory {

	public static ICmAccountInnerSV getAccountInnerSV() {
		return (ICmAccountInnerSV) ServiceFactory.getService(ICmAccountInnerSV.class);
	}

	public static ICmCommonInnerSV getCommonInnerSV() {
		return (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
	}
}
