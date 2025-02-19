package com.asiainfo.crm.util;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.util.locale.AppframeLocaleFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ailk.common.bo.BsResource;
import com.ailk.common.cache.MultilingualJavaI18nResourceCacheImpl;
import com.ailk.common.cache.MultilingualJsI18nResourceCacheImpl;
import com.ailk.common.cache.MultilingualStaticI18nResourceCacheImpl;

import java.util.Locale;
import java.util.Map;

/**
 * 
 * @author: huanglun
 * @date:   2021年11月30日 下午4:22:46
 * @Description: 
 */
public class CrmI18nFactory {
	public static String getStaticI18nResource(String key) {
		String rtn = null;
		try {
			if (AppframeLocaleFactory.getPrefLanguage()) {
				BsResource objBsResource = (BsResource) CacheFactory.get(MultilingualStaticI18nResourceCacheImpl.class,key);
				rtn = getResource(objBsResource);
			}
		} catch (Exception ex) {
			throw new RuntimeException((new StringBuilder()).append("key:").append(key).append(",resource found exception").toString(),ex);
		}
		return rtn;
	}

	public static String getJavaI18nResource(String key) {
		String rtn = null;
		try {
			if (AppframeLocaleFactory.getPrefLanguage()) {
				BsResource objBsResource = (BsResource) CacheFactory.get(MultilingualJavaI18nResourceCacheImpl.class,key);
				rtn = getResource(objBsResource);
			}
		} catch (Exception ex) {
			throw new RuntimeException((new StringBuilder()).append("key:").append(key).append(",resource found exception").toString(),ex);
		}
		return rtn;
	}

	public static String getJsI18nResource(String key) {
		String rtn = null;
		try {
			if (AppframeLocaleFactory.getPrefLanguage()) {
				BsResource objBsResource = (BsResource) CacheFactory.get(MultilingualJsI18nResourceCacheImpl.class,key);
				rtn = getResource(objBsResource);
			}
		} catch (Exception ex) {
			throw new RuntimeException((new StringBuilder()).append("key:").append(key).append(",resource found exception").toString(),ex);
		}
		return rtn;
	}

	private static String getResource(BsResource objBsResource) {
		String rtn = null;
		if (objBsResource != null) {
			Locale current = AppframeLocaleFactory.getCurrentLocale();
			String strLocale = current.toString();
			Map langColumnMap = CrmLocaleFactory.getLangColumnMap();
			rtn = objBsResource.getEnusRes();
			strLocale = strLocale != null ? strLocale.trim().toLowerCase() : "";
			if (langColumnMap.containsKey(strLocale)) {
				String column = (String) langColumnMap.get(strLocale);
				rtn = (String) objBsResource.getLangResMap().get(column);
			}
		}
		return rtn;
	}
}
