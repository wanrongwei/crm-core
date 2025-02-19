/**
 * 
 */
package com.asiainfo.crm.cm.model.ivalues;

import com.asiainfo.crm.cm.busimodel.common.Parameter;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName IVOQueryParamValue
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-16 下午7:26:22
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-16     huzq           v1.0.0               修改原因<br>
 */
public interface IVOQueryParamValue extends IValueObject {

	public static final String S_BUSI_TYPE = "BUSI_TYPE";

	/**   
	 * 获取Parameter
	 * 
	 * @Function getParameter
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午3:39:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	public Parameter getParameter();

	/**   
	 * 设置Parameter
	 * 
	 * @Function setParameter
	 * @Description 
	 *
	 * @param parameter
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午3:40:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	public void setParameter(Parameter parameter);

	/**   
	 * 获取业务类型
	 * 
	 * @Function getBusiType
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午3:40:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	public int getBusiType();

	/**   
	 * 设置业务类型
	 * 
	 * @Function setBusiType
	 * @Description 
	 *
	 * @param busiType
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-17 下午3:40:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	public void setBusiType(int busiType) throws Exception;
}
