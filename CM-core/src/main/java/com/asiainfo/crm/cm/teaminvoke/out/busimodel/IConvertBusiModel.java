/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.out.busimodel;

import java.util.Map;


/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName IConvertBusiModel
 * @Description 参数转换业务逻辑处理模块
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-1-5 下午9:57:44
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-1-5     Xiaohu           v1.0.0               修改原因<br>
 */
public interface IConvertBusiModel {

	/**   
	 * @Function convert
	 * @Description 参数转换方法
	 *
	 * @param parameter 参数
	 * @return 转换后的对象
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-1-5 下午10:02:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-5     Xiaohu           v1.0.0               修改原因<br>
	 */
	Object convert(Map parameter) throws Exception;
}
