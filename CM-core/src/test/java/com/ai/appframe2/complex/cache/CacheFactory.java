package com.ai.appframe2.complex.cache;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.util.locale.AppframeLocaleFactory;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheFactory {
	
	public static final String SCHEDULER_VAR = "SCHEDULER_VAR";
	
	public static final LoadingCache<Class<? extends ICache>, Object> INSTANCE = CacheBuilder.newBuilder()
			.maximumSize(1000L)
			.expireAfterAccess(5, TimeUnit.MINUTES)
			.build(new CacheLoader<Class<? extends ICache>, Object>() {

				@Override
				public Object load(Class<? extends ICache> key) throws Exception {
					return key.getConstructor().newInstance();
				}
				
			});
	
	public static Object get(Class<? extends ICache> clazz, Object key) throws Exception {
		ICache cacheInstance = (ICache) INSTANCE.get(clazz);
		if (cacheInstance == null) {
			throw new Exception(AppframeLocaleFactory.getResource("com.ai.appframe2.complex.cache.no_cache", new String[] { clazz.getName() }));
		}
		if (cacheInstance instanceof ISplitTableCache) {
			String newKey = TenantIDFactory.getTenant() + "_" + key;
			return cacheInstance.getObject(newKey);
		} 
		return cacheInstance.getObject(key);
	}
	
	public static boolean containsKey(Class<? extends ICache> clazz, Object key) throws Exception { 
		ICache cacheInstance = (ICache) INSTANCE.get(clazz);
		if (cacheInstance == null) {
			throw new Exception(AppframeLocaleFactory.getResource("com.ai.appframe2.complex.cache.no_cache", new String[] { clazz.getName() }));
		}
		if (cacheInstance instanceof ISplitTableCache) {
			String newKey = TenantIDFactory.getTenant() + "_" + key;
			return cacheInstance.containsKey(newKey);
		} 
		return cacheInstance.containsKey(key);
	}
	
	public static HashMap getAll(Class<? extends ICache> clazz) throws Exception { 
		ICache cacheInstance = (ICache)INSTANCE.get(clazz);
		if (cacheInstance == null) {
			throw new Exception(AppframeLocaleFactory.getResource("com.ai.appframe2.complex.cache.no_cache", new String[] { clazz.getName() }));
		}
		return cacheInstance.getAll();
	}
	
	public static HashMap _getCacheInstances() {
		return new HashMap<>(INSTANCE.asMap());
	}
}
