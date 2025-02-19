package com.asiainfo.crm.cm.inner.account.service.interfaces;

import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountHisValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName ICmAccountHisSV
 * @Description 该类定义了跟账户历史等相关的服务。这里面的服务是提供给外部使用的。<br>
 *
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-3-14 上午10:06:04
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-14     zhangyin           v1.0.0               修改原因<br>
 */
public interface ICmAccountHisSV {
	
	/**   
	 * @Function queryAccountHis
	 * @Description 查询集团客户历史信息
	 *
	 * @param acctId
	 * @param acctName
	 * @param startDate
	 * @param endDate
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 24, 2012 10:41:22 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmAccountHisValue[] queryAccountHis(long acctId,String acctName, String startDate, String endDate, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function queryAccountHisCount
	 * @Description 查询集团客户历史信息
	 *
	 * @param acctId
	 * @param acctName
	 * @param startDate
	 * @param endDate
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 24, 2012 10:41:22 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAccountHisCount(long acctId,String acctName, String startDate, String endDate) throws Exception;

}
