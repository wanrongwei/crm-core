/**
 * 
 */
package com.asiainfo.crm.cm.common.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName ICmAttachSV
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-5-2 下午9:43:47
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-5-2     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmAttachSV {

	/**   
	 * 保存附件信息
	 * @Function saveAttachValue
	 * @Description 
	 *
	 * @param attachValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-2 下午9:46:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2     huzq2           v1.0.0               修改原因<br>
	 */
	public long saveAttachValue(IBOCmAttachValue attachValue) throws Exception;

	/**   
	 * 根据主键查询附件信息
	 * @Function queryAttachValueById
	 * @Description 
	 *
	 * @param attachId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-2 下午9:46:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmAttachValue queryAttachValueById(long attachId, String state) throws Exception;

	/**   
	 * 根据查询条件查询附件信息
	 * @Function queryAttachValues
	 * @Description 
	 *
	 * @param criteria 查询条件
	 * @param startNum 
	 * @param endNum
	 * @return 符合条件的附件信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-2 下午9:48:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmAttachValue[] queryAttachValues(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 根据查询条件查询附件信息数量
	 * @Function queryAttachValueCount
	 * @Description 
	 *
	 * @param criteria 查询条件
	 * @return 符合条件的附件信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-2 下午9:48:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryAttachValueCount(String criteria) throws Exception;
	/**   
	 * 根据查询条件查询附件信息数量
	 * @Function queryAttachValueCount
	 * @Description 
	 *
	 * @param criteria 查询条件
	 * @return 符合条件的附件信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-5-2 下午9:48:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2     kangzk           v1.0.0               修改原因<br>
	 */
	public int queryAttachValueCount(String startDate, String endDate) throws Exception;
	/**   
	 * 根据查询条件查询附件信息
	 * @Function queryAttachValues
	 * @Description 
	 *
	 * @param criteria 查询条件
	 * @param startNum 
	 * @param endNum
	 * @return 符合条件的附件信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-5-2 下午9:48:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmAttachValue[] queryAttachValues(String startDate, String endDate, int startNum, int endNum) throws Exception;
	
	/**   
	 * 根据查询条件查询附件信息
	 * @Function queryAttachValues
	 * @Description 
	 *
	 * @param da 查询条件
	 * @return 符合条件的附件信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-10-2 下午9:48:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-2     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmAttachValue[] queryAttachValues(DataContainer da) throws Exception;
	/**   
	 * 根据样例查询附件信息
	 * @Function queryAttachValueCount
	 * @Description 
	 *
	 * @param sample
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-19 下午3:20:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-19     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryAttachValueCount(IBOCmAttachValue sample) throws Exception;

	/**   
	 * @Function saveAttachValues
	 * @Description 
	 *
	 * @param dcs
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-3 上午12:01:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-3     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveAttachValues(IBOCmAttachValue[] attachValues) throws Exception;
}
