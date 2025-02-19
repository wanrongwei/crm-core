package com.asiainfo.crm.cm.busimodel;

import com.ai.appframe2.common.DataContainerInterface;

/**   
 * 模糊化处理
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-6-28 上午11:14:01
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-6-28     huzq           v1.0.0               修改原因<br>
 */
public interface IMaskBusiModel {

	/**   
	 * 对查询出来的客户敏感信息进行模糊化处理.<br>
	 * 
	 * 将具体的实现下移到具体的项目中，核心版本提供默认的模糊化处理实现，如果不满足则重写该方法即可。
	 * 
	 * @Function mask
	 * @Description 
	 *
	 * @param dc
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-28 上午11:09:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-28     huzq           v1.0.0               修改原因<br>
	 */
	public void mask(DataContainerInterface dc) throws Exception;
	
	/**   
	 * 对数组进行模糊化处理<br>
	 * 将具体的实现下移到具体的项目中，核心版本提供默认的模糊化处理实现，如果不满足则重写该方法即可。
	 * @Function mask
	 * @Description 
	 *
	 * @param dcs
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-28 下午2:32:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-28     huzq           v1.0.0               修改原因<br>
	 */
	public void mask(DataContainerInterface[] dcs) throws Exception;
	
	/**
	 * 进行模糊化处理<br>
	 * 将具体的实现下移到具体的项目中，核心版本提供默认的模糊化处理实现，如果不满足则重写该方法即可。
	 * Class 是Bean的类型
	 * @Function mask
	 * @Description 
	 *
	 * @param dc
	 * @param object
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jun 28, 2012 2:49:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 28, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public void mask(DataContainerInterface dc, Class clazz) throws Exception;
	
	/**
	 * 对数组进行模糊化处理<br>
	 * 将具体的实现下移到具体的项目中，核心版本提供默认的模糊化处理实现，如果不满足则重写该方法即可。
	 * Class 是Bean的类型
	 * @Function mask
	 * @Description 
	 *
	 * @param dcs
	 * @param object
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jun 28, 2012 2:49:08 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 28, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public void mask(DataContainerInterface[] dcs, Class clazz) throws Exception;
}
