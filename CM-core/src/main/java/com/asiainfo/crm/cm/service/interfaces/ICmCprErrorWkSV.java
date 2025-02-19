package com.asiainfo.crm.cm.service.interfaces;

import java.util.ArrayList;
import java.util.Map;

public interface ICmCprErrorWkSV {
	/**   
	 * @Function saveTroubleTicket
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveTroubleTicket(long custId,String errorCode,String errorMsg)throws Exception;
	/**   
	 * @Function ifCustomerHasInstallAccount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean ifCustomerHasInstallAccount(long custId)throws Exception;
	/**   
	 * @Function ifCustStatusActiveOrSuspend
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean ifCustStatusActiveOrSuspend(long custId)throws Exception;
	/**   
	 * @Function ifCustStatusInactive
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean ifCustStatusInactive(long custId)throws Exception;
	/**   
	 * @Function ifCustHasMobile
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean ifCustHasMobile(long custId)throws Exception;
	/**   
	 * @Function dealIfUpdateAddress
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     huangqun             v1.0.0               修改原因<br>
	 */
	public void dealIfUpdateAddress(long custId,String taskId,long taskType)throws Exception;
	/**   
	 * @Function sendMsg
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     huangqun             v1.0.0               修改原因<br>
	 */
	public void sendMsg(long custId)throws Exception;
	/**   
	 * @Function 把客户下面所有的用户都进行停机
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     huangqun             v1.0.0               修改原因<br>
	 */
	public String suspendUser(long custId)throws Exception;
	/**   
	 * @Function 调用订单接口指定未来某天进行预销户
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-18     huangqun             v1.0.0               修改原因<br>
	 */
	public String preTerminationUser(long custId)throws Exception;
	/**   
	 * @Function 上述由于地址未修改而导致停机的重新开机
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-18     huangqun             v1.0.0               修改原因<br>
	 */
	public void startUser(String data)throws Exception;
	/**   
	 * @Function 取消预销户订单
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-18     huangqun             v1.0.0               修改原因<br>
	 */
	public void cancelPreTerminate(String data)throws Exception;
	/**   
	 * @Function 重置信用度接口
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-20 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-20     huangqun             v1.0.0               修改原因<br>
	 */
	public void resetAcctCreditLimit(long custId)throws Exception;
}
