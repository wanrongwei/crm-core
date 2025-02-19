/**
 * 
 */
package com.asiainfo.crm.cm.exe.tf.service.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.exe.tf.ivalues.IBOCmPsBusiRecValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-24 下午2:17:55
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmPsBusiSV {

	/**   
	 * @Function savePsBusiRecs
	 * @Description 保存工单信息
	 *
	 * @param psBusiRecValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-24 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
	 */
	public void savePsBusiRecs(IBOCmPsBusiRecValue[] psBusiRecValues) throws Exception;
}
