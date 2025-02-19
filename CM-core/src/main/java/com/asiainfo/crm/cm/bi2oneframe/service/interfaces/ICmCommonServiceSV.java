package com.asiainfo.crm.cm.bi2oneframe.service.interfaces;

public interface ICmCommonServiceSV {

	/**   
	 * @Function trunkTable
	 * @Description 删除该表中的数据
	 *
	 * @param tableName
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 13, 2012 9:02:32 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 13, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void trunkTable(String tableName) throws Exception;
	/**   
	 * @Function trunkTable
	 * @Description 按照地市删除表中数据
	 *
	 * @param tableName
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 13, 2012 9:02:32 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 13, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void trunkTable(String tableName,String regionId) throws Exception;
}
