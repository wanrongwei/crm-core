package com.asiainfo.crm.cm.exe.batch.service.interfaces;

import java.util.Map;

public interface ICmGroupContactBatchSV {

	/**
	 * 
	 * @Function importCommonContact
	 * @Description 批量导入集团联系人
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 24, 2012 3:48:32 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 24, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public void importCommonContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception;

	/**
	 * 
	 * @Function importKeyContact
	 * @Description 批量导入集团关键联系人
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 24, 2012 3:48:48 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 24, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public void importKeyContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
	
	/**
	 * 
	 * @Function importGroupMember
	 * @Description 批量导入集团成员信息
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 24, 2012 3:49:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 24, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public void importGroupMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
}
