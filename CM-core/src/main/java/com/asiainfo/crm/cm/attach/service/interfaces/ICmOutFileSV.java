package com.asiainfo.crm.cm.attach.service.interfaces;

import java.util.Map;

public interface ICmOutFileSV {

	/**   
	 * 批量到处集团客户对象信息
	 * @Function outPutGrpCustList
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
	public Map outPutGrpCustList(Map da)throws Exception;
}
