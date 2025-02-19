/**
 * 
 */
package com.asiainfo.crm.cm.exe.tf.business;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-24 下午1:48:23
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmTransformDealService {

	/**   
	 * @Function deal
	 * @Description 工单处理方法
	 *
	 * @param objectType 被处理对象类型
	 * @param objectId 被处理对象编号
	 * @param businessId 业务编码
	 * @param relObjectDetail
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-24 下午2:11:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
	 */
	void deal(String objectType, long objectId, long businessId, String relObjectDetail) throws Exception;
}
