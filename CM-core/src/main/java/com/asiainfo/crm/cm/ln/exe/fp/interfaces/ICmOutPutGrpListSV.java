package com.asiainfo.crm.cm.ln.exe.fp.interfaces;

import java.util.List;
import java.util.Map;

import com.ai.common.util.FtpUtil;

public interface ICmOutPutGrpListSV {
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
	
	/**   
	 * 批量导出下发短信内容
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
	public void outPutSendSmsFile(FtpUtil ftp,String localPath,String getRemotePath,String fileName)throws Exception;
	/**
	 * 
	 * @Function: setSendSmsValue
	 * @Description: 封装下发短信对象
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-10-10 上午11:01:24
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* 2011-5-1
	 * kangzk v1.0.0 修改原因
	 */
	public void setSendSmsValue(List list,String fileName) throws Exception;
}
