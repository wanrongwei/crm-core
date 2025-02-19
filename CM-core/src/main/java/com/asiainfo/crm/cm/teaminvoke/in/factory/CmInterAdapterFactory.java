/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.in.factory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.teaminvoke.in.factory.impl.CmDefaultInterAdapterFactoryImpl;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeInService;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-9 下午1:13:51
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-9     huzq2           v1.0.0               修改原因<br>
 */
public abstract class CmInterAdapterFactory {

	private static transient Log log = LogFactory.getLog(CmInterAdapterFactory.class);

	public static final String CODE_TYPE_INTER_ADAPTER = "CM_TEAM_IN_INTER_ADAPTER";
	public static final String CODE_VALUE_INTER_ADAPTER = "FACTORY_IMPLCLASS";

	private static CmInterAdapterFactory factory = null;

	public static CmInterAdapterFactory getInstance() {
		if (factory == null) {
			buildFactory();
		}
		return factory;
	}

	private static void buildFactory() {
		try {
			IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(CODE_TYPE_INTER_ADAPTER, CODE_VALUE_INTER_ADAPTER);
			if (staticDataValue == null) {
				// TODO 增加国际化资源配置
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030043", CODE_TYPE_INTER_ADAPTER));
				}
				ExceptionUtil.throwBusinessException("CMS0030043", CODE_TYPE_INTER_ADAPTER);
			}
			factory = (CmInterAdapterFactory) Class.forName(staticDataValue.getCodeName()).newInstance();
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e.getMessage());
			}
			factory = new CmDefaultInterAdapterFactoryImpl();
		}
	}

	public abstract ICmTeamInvokeInService getService() throws Exception;
}
