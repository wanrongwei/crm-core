package com.asiainfo.crm.cm.common.vocreator;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.config.CmConfigLoader;
import com.asiainfo.crm.cm.common.vocreator.setter.ICmVODefaultValueSetter;

public class CmValueObjectCreator {

	/**   
	 * 创建默认的IValue实例，创建时会根据当前系统的配置进行默认值的填充。<br>
	 * 要实现设置一些默认值则需要实现接口{@link ICmVODefaultValueSetter}。
	 * @Function create
	 * @Description 
	 *
	 * @param targetValueObjectClass 目标对象类型
	 * @param dc 其他信息
	 * @return 返回给定的类型的实例
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-23 下午3:38:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-23     huzq           v1.0.0               修改原因<br>
	 */
	public static DataStructInterface create(Class targetValueObjectClass, DataStructInterface dc) throws Exception {
		DataStructInterface value = DataContainerFactory.createDataContainerInstance(targetValueObjectClass, null);
		setDefaultValue(value, dc);
		return value;
	}

	/**   
	 * 调用ICmVODefaultValueSetter的实现类设置默认值
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param value
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-23 下午3:44:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-23     huzq           v1.0.0               修改原因<br>
	 */
	private static void setDefaultValue(DataStructInterface value, DataStructInterface dc) throws Exception {
		String creatorName = CmConfigLoader.getInstance().getValueObjectSetter(value.getClass());
		if (StringUtils.isNotBlank(creatorName)) {
			ICmVODefaultValueSetter setter = (ICmVODefaultValueSetter) ServiceFactory.getSeviceOfLocal(creatorName);
			setter.setDefaultValue(value, dc);
		}
	}
}
