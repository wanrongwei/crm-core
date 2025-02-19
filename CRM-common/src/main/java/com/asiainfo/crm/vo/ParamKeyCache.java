package com.asiainfo.crm.vo;

import org.apache.commons.collections.map.LRUMap;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 屏蔽对ParamKey对象的new生成方式，需要获取ParamKey对象，统一从该类中获取
 * 
 * @author xialing
 * 
 */
public class ParamKeyCache {
	//初始化标记
	private static Boolean IS_INIT = Boolean.FALSE;
	//桶的数量
	private static final int BUCK_SIZE = 64;
	//最大cache数量,必须是64的倍数
	private static final int MAX_CACHE_NUMBER = 10048;
	//桶
	private static Map BUCK = new HashMap(BUCK_SIZE);

	/**
	 * 初始化
	 */
	private static void init(){
		if(IS_INIT.equals(Boolean.FALSE)){
			synchronized (IS_INIT) {
				if(IS_INIT.equals(Boolean.FALSE)){
					int num = MAX_CACHE_NUMBER/BUCK_SIZE+1;
					for (int i = 0; i < BUCK_SIZE; i++) {
						BUCK.put(new Integer(i), new LRUMap(num));
					}
					
					IS_INIT = Boolean.TRUE;
				}
			}
		}
	}
	
	/**
	 * get
	 * @param key
	 * @return
	 */
	public static ParamKey get(String key) {
		init();

		ParamKey result = null;
		if (StringUtils.isNotBlank(key)) {
			//根据key获得hashCode,再获得所在桶的map对象
			int buckNum = Math.abs(key.hashCode()%BUCK_SIZE);
			Map map = (Map)BUCK.get(new Integer(buckNum));
			synchronized (map) {
				result = (ParamKey) map.get(key);
				if (result == null) {
					if (!map.containsKey(key)) {
						result = (ParamKey) map.get(key);
						if (result == null) {
							result = new ParamKey(key);
							map.put(key, result);
						}
					} else {
						result = (ParamKey) map.get(key);
					}
				}
			}

		}
		return result;
	}
}