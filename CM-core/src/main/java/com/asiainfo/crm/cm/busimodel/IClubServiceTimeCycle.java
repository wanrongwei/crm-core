package com.asiainfo.crm.cm.busimodel;

import java.sql.Timestamp;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName IClubServiceTimeCycle
 * @Description 俱乐部会员服务周期计算策略
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-14 下午4:26:12
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-14     Xiaohu           v1.0.0               修改原因<br>
 */
public interface IClubServiceTimeCycle {

	/**   
	 * @Function getCycleTimestamp
	 * @Description 计算当前服务定义的周期内有效期
	 *
	 * @param nowTime 当前时间
	 * @return 根据具体的周期定义返回有效期
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-14 下午4:28:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-14     Xiaohu           v1.0.0               修改原因<br>
	 */
	public Timestamp getCycleTimestamp(Timestamp nowTime);
}
