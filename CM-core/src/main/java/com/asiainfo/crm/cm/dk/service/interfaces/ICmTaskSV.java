package com.asiainfo.crm.cm.dk.service.interfaces;

import com.asiainfo.crm.cm.dk.ivalues.IBOCmGroupApprovalValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsSegmentCalHValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsSegmentCalValue;


/**   
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 客管丹麦所有后台进程使用的相关服务
 *
 * @version v1.0.0
 * @author Administrator
 * @date 2014-9-12 下午2:55:22
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-9-12     shitian           v1.0.0               修改原因<br>
 */
public interface ICmTaskSV {
	
	/**   
	 * @Function queryAllSegmentCal
	 * @Description 查询所有集团细分计算工单
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-12 下午2:57:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-12     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPsSegmentCalValue[] queryAllSegmentCal()throws Exception;
	
	/**   
	 * @Function savePsSegmentCal
	 * @Description 增、删、改集团细分计算工单
	 *
	 * @param segmentCalValues
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-12 下午2:57:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-12     shitian             v1.0.0               修改原因<br>
	 */
	public void savePsSegmentCal(IBOCmPsSegmentCalValue[] segmentCalValues)throws Exception;
	
	/**   
	 * @Function saveGroupApproval
	 * @Description 
	 *
	 * @param groupApprovalValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-15 上午9:49:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-15     shitian             v1.0.0               修改原因<br>
	 */
	public void saveGroupApproval(IBOCmGroupApprovalValue[] groupApprovalValues)throws Exception;
	
	/**   
	 * @Function queryAllGroupApproval
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-15 上午9:50:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-15     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmGroupApprovalValue[] queryAllGroupApproval()throws Exception;
	
	/**   
	 * @Function savePsSegmentCalH
	 * @Description 
	 *
	 * @param psSegmentCalHValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-31 上午10:54:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-31     shitian             v1.0.0               修改原因<br>
	 */
	public void savePsSegmentCalH(IBOCmPsSegmentCalHValue psSegmentCalHValue)throws Exception;
	
}
