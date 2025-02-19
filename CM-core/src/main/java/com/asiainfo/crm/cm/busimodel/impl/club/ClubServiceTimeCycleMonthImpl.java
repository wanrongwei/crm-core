package com.asiainfo.crm.cm.busimodel.impl.club;

import java.sql.Timestamp;
import java.util.Calendar;

import com.asiainfo.crm.cm.busimodel.IClubServiceTimeCycle;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 按月计算周期
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-14 下午4:35:08
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-14     Xiaohu           v1.0.0               修改原因<br>
 */
public class ClubServiceTimeCycleMonthImpl implements IClubServiceTimeCycle {

	public Timestamp getCycleTimestamp(Timestamp nowTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(nowTime);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return new Timestamp(calendar.getTimeInMillis());
	}

}
