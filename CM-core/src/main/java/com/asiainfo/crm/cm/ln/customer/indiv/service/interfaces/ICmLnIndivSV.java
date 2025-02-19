package com.asiainfo.crm.cm.ln.customer.indiv.service.interfaces;

import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOCmUserSpeuserMainHValue;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOLnCmxIndivCustomerValue;


public interface ICmLnIndivSV {

	/**   
	 * @Function saveIndivExt
	 * @Description 保存辽宁个人客户扩展信息
	 *
	 * @param cmxIndivCustomerValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 30, 2012 9:52:30 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 30, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveIndivExt(IBOLnCmxIndivCustomerValue[] cmxIndivCustomerValues)throws Exception;
	
	/**   
	 * @Function queryLnIndivCustExt
	 * @Description 根据客户编号查询个人扩展信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 30, 2012 10:36:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 30, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmxIndivCustomerValue queryLnIndivCustExt(long custId)throws Exception;
	
	/**   
	 * @Function queryCmUserSpeuserMainByMobile
	 * @Description 根据账户编号或者手机号码查询信誉度特殊用户维护记录
	 *
	 * @param acctId
	 * @param mobile
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 30, 2012 10:36:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 30, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmUserSpeuserMainValue[] queryCmUserSpeuserMainByMobile(long acctId,long mobile)throws Exception;

}
