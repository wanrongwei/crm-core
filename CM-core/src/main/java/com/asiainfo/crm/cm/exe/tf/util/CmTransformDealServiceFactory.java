/**
 * 
 */
package com.asiainfo.crm.cm.exe.tf.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.exe.tf.business.ICmTransformDealService;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-24 下午1:49:32
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
 */
public class CmTransformDealServiceFactory {

	private static final Map ALL_CM_TF_BUSI_IMPL_CFG = new HashMap();

	private transient static Log log = LogFactory.getLog(CmTransformDealServiceFactory.class);

	private CmTransformDealServiceFactory() {

	}

//	static {
//		try {
//			IBOCmPsBusiImplCfgValue[] values = CmServiceFactory.getPsBusiSV().queryPsBusiImplCfgs("", new HashMap(), -1, -1);
//			if (values != null && values.length > 0) {
//				Class clazz = null;
//				for (int i = 0, len = values.length; i < len; i++) {
//					clazz = Class.forName(values[i].getBusiImplClass());
//					if (ClassUtils.isAssignable(clazz, ICmTransformDealService.class)) {
//						ALL_CM_TF_BUSI_IMPL_CFG.put(values[i].getBusinessId(), clazz.newInstance());
//					} else {
//						if (log.isErrorEnabled()) {
//							// 类[{0}]没有实现指定的接口！加载失败！
//							log.error(CrmLocaleFactory.getResource("CMS0030037", clazz.getName()));
//						}
//					}
//				}
//			}
//		} catch (Exception e) {
//			log.info(e.getMessage(), e);
//			if (log.isErrorEnabled()) {
//				// 加载TF处理服务失败！
//				log.error(CrmLocaleFactory.getResource("CMS0030038"));
//			}
//		}
//	}

	/**   
	 * @Function geDealService
	 * @Description 获取处理服务
	 *
	 * @param strategy
	 * @return 处理服务
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-24 下午2:14:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICmTransformDealService getDealService(long businessId) {
		return (ICmTransformDealService) ALL_CM_TF_BUSI_IMPL_CFG.get(businessId);
	}

}
