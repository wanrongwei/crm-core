package com.asiainfo.crm.cm.exe.tf.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.exe.tf.ivalues.IBOCmPsBusiRecValue;

public interface ICmPsBusiDAO {

	/**   
	 * @Function savePsBusiRecs
	 * @Description 保存工单信息
	 *
	 * @param psBusiRecValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-24 下午3:06:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
	 */
	public void savePsBusiRecs(IBOCmPsBusiRecValue[] psBusiRecValues) throws Exception;
}
