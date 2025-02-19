package com.asiainfo.crm.cm.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.busimodel.IClubServiceTimeCycle;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: FreeServiceTimeCycleFactory.java
 * @Description:  获取周期时间
 *
 * @version: v1.0.0
 * @author: zhaiwg
 * @date: Apr 25, 2011 3:23:06 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Apr 25, 2011		zhaiwg          v1.0.0               修改原因
 */
public class CmClubServiceTimeCycleFactory {

	private static final Map ALL_CYCLE_TIME = new HashMap();
	private transient static Log log = LogFactory.getLog(CmClubServiceTimeCycleFactory.class);

	private CmClubServiceTimeCycleFactory() {

	}

	static {
		try {
			IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData("CM_CLUB_SVR_CAL_CYCLE");
			if (values != null && values.length > 0) {
				Class clazz = null;
				for (int i = 0, len = values.length; i < len; i++) {
					clazz = Class.forName(values[i].getCodeName());
					if (ClassUtils.isAssignable(clazz, IClubServiceTimeCycle.class)) {
						ALL_CYCLE_TIME.put(values[i].getCodeValue(), clazz.newInstance());
					} else {
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("AMS3310356", clazz.getName()));   // 策略类"+clazz.getName()+"没有实现指定接口被拒绝加载！
						}
					}
				}
			}
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("AMS3310357"));   // 获取免费服务周期类配置信息出错！！
			}
		}
	}

	public static IClubServiceTimeCycle geTimesCycle(String cycle) {
		return (IClubServiceTimeCycle) ALL_CYCLE_TIME.get(cycle);
	}

}
