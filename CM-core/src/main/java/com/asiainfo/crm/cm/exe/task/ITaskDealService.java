package com.asiainfo.crm.cm.exe.task;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ITaskDealService
 * @Description 该类用于处理客户管理后台任务的定义。
 * 该接口提供一个方法deal，由CmCommonTask调用。
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-13 下午5:22:49
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-13     huzq2           v1.0.0               修改原因
 */
public interface ITaskDealService {

	/**   
	 * @Function deal
	 * @Description 具体的处理方法
	 *
	 * @param objId 被处理的对象编号
	 * @return 处理结果
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-13 下午5:25:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-13     huzq2           v1.0.0               修改原因
	 */
	String deal(long objId) throws Exception;
}
