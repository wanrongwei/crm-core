package com.asiainfo.crm.cm.custview.plugin;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ClassLoaderUtil;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.custview.plugin.treemodel.ICmViewDynamicTreeModel;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-29 下午1:34:35
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-29     huzq2           v1.0.0               修改原因<br>
 */
public class CmViewPluginFactory {
    
	/**
	 * 
	 * @param implClassName  默认实现ICmViewDynamicTreeModel的实现类
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: 2012-3-29 下午08:48:32
	 */
	public static ICmViewDynamicTreeModel getDynamicTreeModel(String implClassName) throws Exception {
		if (StringUtils.isBlank(implClassName)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		Object object = ClassLoaderUtil.loadClass(implClassName.trim()).newInstance();
		if (!(object instanceof ICmViewDynamicTreeModel)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		return (ICmViewDynamicTreeModel) object;
	}
}
