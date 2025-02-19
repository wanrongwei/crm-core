package com.asiainfo.crm.cm.ln.exe.batch.service.interfaces;

import java.util.Map;

public interface ICmUserSpeuserMainSV {

	/**   
	 * @Function importUserSperUserMain
	 * @Description 信誉度特殊用户批量导入
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 10:22:08 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void importUserSperUserMain(String[] colNames, String[] colValues, Map commonInfo) throws Exception; 

}
