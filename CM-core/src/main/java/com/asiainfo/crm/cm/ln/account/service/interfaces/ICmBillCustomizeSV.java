package com.asiainfo.crm.cm.ln.account.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;

public interface ICmBillCustomizeSV {
	
	public void saveData(DataContainer[] values) throws Exception;
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception;
	
	public int queryDataCount(String criteria) throws Exception;
	
	public ISoUserValue getUserValue(String billId) throws Exception;
/**
 * 
* @Function: ICmBillCustomizeSV.java
* @Description: 根据userId删除个性化账单
*
* @param:usrId 客户编号
* @return：返回结果描述
* @throws：删除失败
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 17, 2012 10:52:41 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 17, 2012     suntao6           v1.0.0              修改原因
 */
	public void delCmBillCustomizeByUserId(long usrId) throws Exception;
/**
 * 
* @Function: ICmBillCustomizeSV.java
* @Description: 根据usrId查找个性化定制菜单数据
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 17, 2012 2:20:54 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 17, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] findCmBillCustomizById(long usrId) throws Exception;
	
	/**
	 * 
	* @Function: ICmBillCustomizeSV.java
	* @Description: 根据usrId查找个性化定制菜单数据
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Sep 17, 2012 2:20:54 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sep 17, 2012     suntao6           v1.0.0              修改原因
	 */
	public DataContainer[] findCmBillCustomizById(long usrId,String regionId) throws Exception;
		
	
}
