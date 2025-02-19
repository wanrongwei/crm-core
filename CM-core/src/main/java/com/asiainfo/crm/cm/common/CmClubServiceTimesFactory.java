package com.asiainfo.crm.cm.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.busimodel.IClubServiceTimesStrategy;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: FreeServiceTimesFactory.java
 * @Description:  免费服务策略计算工厂
 *
 * @version: v1.0.0
 * @author: zhaiwg
 * @date: Apr 23, 2011 2:23:41 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Apr 23, 2011		zhaiwg          v1.0.0               修改原因
 */
public class CmClubServiceTimesFactory {

	private static final Map ALL_STRATEGY = new HashMap();

	private transient static Log log = LogFactory.getLog(CmClubServiceTimesFactory.class);

	private CmClubServiceTimesFactory() {

	}

	static {
		try {
			IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData("CM_CLUB_SVR_CAL_STRATEGY");
			if (values != null && values.length > 0) {
				Class clazz = null;
				for (int i = 0, len = values.length; i < len; i++) {
					clazz = Class.forName(values[i].getCodeName());
					if (ClassUtils.isAssignable(clazz, IClubServiceTimesStrategy.class)) {
						ALL_STRATEGY.put(values[i].getCodeValue(), clazz.newInstance());
					} else {
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("AMS3310358", clazz.getName()));   // 策略类"+clazz.getName()+"没有实现指定接口被拒绝加载！
						}
					}
				}
			}
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("AMS3310359"));   // "获取免费服务计算策略类配置信息出错！"
			}
		}
	}

	public static IClubServiceTimesStrategy geTimesStrategy(String strategy) {
		return (IClubServiceTimesStrategy) ALL_STRATEGY.get(strategy);
	}

}
