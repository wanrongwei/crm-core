package com.asiainfo.crm.cm.exe.tf.service.interfaces;

import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.bo.BOBsFtpPathBean;
import com.asiainfo.crm.cm.common.bo.BOCmAttachExportBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExportValue;

public interface ICmAttachExportSV {
	
	/**   
	 * @Function qryAttach
	 * @Description 查询批量导出数据对象
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmAttachExportValue[] qryAttach(String criteria, int start, int end)throws Exception;
	/**   
	 * @Function qryAttachCount
	 * @Description 查询批量导出数据总行数
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public int qryAttachCount(String criteria) throws Exception ;
	
	/**   
	 * @Function saveAttachValue
	 * @Description 保存文件对象
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveAttachValue(IBOCmAttachExportValue[] boCmAttachExportValue)throws Exception;
	
	
	/**   
	 * @Function objFileColsValue
	 * @Description 封装需要导出的文件字段
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public String objFileColsValue(DataContainer dt,List ibocm)throws Exception;
	/**   
	 * @Function getMapValue
	 * @Description 拆分查询条件
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public Map getMapValue(String exportPara)throws Exception;
	/**   
	 * @Function objValues
	 * @Description写入文件对象
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public void writerObjValues(Object obj,List ibocm,String fileName)throws Exception;
	/**   
	 * @Function getAttactValeuMap
	 * @Description Map对象转换
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public void getAttactValeuMap(BOCmAttachExportBean iboAttachExportValue,Map map)throws Exception;
	/**   
	 * @Function upFile
	 * @Description上传服务器文件
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public void upFile(IBOCmAttachExporClassValue colClass,BOBsFtpPathBean bsFtpPathValue,String newFileName)throws Exception;
	
	/**   
	 * @Function saveAttactExportValue
	 * @Description保存处理对象数据
	 *
	 * @param dt
	 * @param ibocm
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2013-1-17 下午3:05:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveAttactExportValue(List list)throws Exception;
}
