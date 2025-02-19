package com.asiainfo.crm.cm.busimodel;

import java.util.Map;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName IClubServiceTimesStrategy
 * @Description 该接口用于定义俱乐部会员服务可用次数的计算规则。根据不同的计算规则，需要实现具体的业务逻辑。
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-14 下午4:24:10
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-14     Xiaohu           v1.0.0               修改原因<br>
 */
public interface IClubServiceTimesStrategy {

	/**   
	 * @Function calculateAvailableTimes
	 * @Description 计算俱乐部会员服务的可用次数
	 *
	 * @param countMap 服务的不同纬度定义的次数
	 * @param weightMap 权重信息【仅在根据权重计算可用次数时需要传入该值】
	 * @return 根据计算规则算出来的可用次数
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-14 下午4:18:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-14     Xiaohu           v1.0.0               修改原因<br>
	 */
	int calculateAvailableTimes(Map countMap, Map weightMap) throws Exception;
}
