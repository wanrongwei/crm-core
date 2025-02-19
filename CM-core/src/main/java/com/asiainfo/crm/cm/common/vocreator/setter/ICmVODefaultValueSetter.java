package com.asiainfo.crm.cm.common.vocreator.setter;

import com.ai.appframe2.common.DataStructInterface;

/**   
 * 设置ivalue的默认属性接口定义。
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-6-23 下午3:45:16
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-6-23     huzq           v1.0.0               修改原因<br>
 */
public interface ICmVODefaultValueSetter {

	/**   
	 * 设置默认属性
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param distValue 需要设置默认属性的ivalue实例
	 * @param dc 其他信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-23 下午3:45:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-23     huzq           v1.0.0               修改原因<br>
	 */
	public void setDefaultValue(DataStructInterface distValue, DataStructInterface dc) throws Exception;
}
