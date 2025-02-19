/**
 * 
 */
package com.asiainfo.crm.cm.busimodel;

import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;


/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-16 下午1:16:09
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-16     huzq           v1.0.0               修改原因<br>
 */
public interface ICmBusiLogCreator {

	/**   
	 * @Function createBusiLogValue
	 * @Description 
	 *
	 * @param valueObject
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午1:31:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public IVOBusiLogValue createBusiLogValue(IValueObject valueObject) throws Exception;
}
