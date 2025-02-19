package com.asiainfo.crm.cm.common.service.interfaces;

import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExColValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;

public interface ICmCommonExportSV 
{
	/**   
	 * @Function getCmAttachExColClass
	 * @Description 批量导出文件字段  CM_ATTACH_EX_COL
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 17, 2012 4:47:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmAttachExColValue[] getCmAttachExColClass() throws Exception;
	
	/**   
	 * @Function getCmAttachExportValue
	 * @Description 批量导文件类数据  CM_ATTACH_EXPOR_CLASS
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 17, 2012 4:47:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmAttachExporClassValue[] getCmAttachExportValue() throws Exception;
}
