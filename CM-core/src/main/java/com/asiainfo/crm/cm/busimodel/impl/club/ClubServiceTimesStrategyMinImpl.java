package com.asiainfo.crm.cm.busimodel.impl.club;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.asiainfo.crm.cm.busimodel.IClubServiceTimesStrategy;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 最小值计算策略
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-14 下午4:33:22
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-14     Xiaohu           v1.0.0               修改原因<br>
 */
public class ClubServiceTimesStrategyMinImpl implements IClubServiceTimesStrategy {

	public int calculateAvailableTimes(Map countMap, Map weightMap) throws Exception {
		int min = 0;
		for (Iterator iterator = countMap.entrySet().iterator(); iterator.hasNext();) {
			Entry entry = (Entry) iterator.next();
			if (min == 0L || ((Integer) entry.getValue()).intValue() < min) {
				min = ((Integer) entry.getValue()).intValue();
			}
		}
		return min;
	}

}
