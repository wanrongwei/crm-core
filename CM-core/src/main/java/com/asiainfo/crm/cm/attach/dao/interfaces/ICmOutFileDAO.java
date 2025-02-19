package com.asiainfo.crm.cm.attach.dao.interfaces;

import com.ai.appframe2.common.DataContainerInterface;

public interface ICmOutFileDAO {

	/**   
	 * 查询上级集团客户信息
	 * @Function qryGrpCustomerListUp
	 * @Description 
	 * 
	 * @param DataContainerInterface da对象
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] qryGrpCustomerListUp(String custId)throws Exception;
	/**   
	 * 查询下级集团客户信息
	 * @Function qryGrpCustomerListDown
	 * @Description 
	 * 
	 * @param DataContainerInterface da对象
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] qryGrpCustomerListDown(String custId)throws Exception;
}
