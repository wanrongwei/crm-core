package com.asiainfo.crm.cm.zg.service.interfaces;

import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmIAcctCreditValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.zg.ivalues.IIAccBusiCreditValue;
import com.asiainfo.crm.cm.zg.ivalues.IIRaccOperValue;



public interface ICmAcctCreditSV {

	/**   
	 * @Function saveIRaccOper
	 * @Description 账户信用度上发计费通知表
	 *
	 * @param raccOperValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 8, 2012 2:36:56 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveIRaccOper(IIRaccOperValue raccOperValue) throws Exception;
	
	/**   
	 * @Function queryAcctCredit
	 * @Description 查询账户信用度上发计费表
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 8, 2012 2:36:20 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IIAccBusiCreditValue queryAcctCredit(long acctId)throws Exception;
	
	/**   
	 * @Function saveAccBusiCredit
	 * @Description 账户信用度上发计费表
	 *
	 * @param accBusiCreditValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 8, 2012 2:36:01 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveAccBusiCredit(IIAccBusiCreditValue accBusiCreditValue)throws Exception;
	
	/**   
	 * @Function sysAcctCredit
	 * @Description 账户信用度上发计费同步
	 *
	 * @param accountValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 8, 2012 2:35:47 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void sysAcctCredit(IAccountValue accountValue)throws Exception;
	
	/**   
	 * @Function sysAcctCredit
	 * @Description 账户信用度上发计费同步
	 *
	 * @param acctCreditValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 16, 2012 9:00:56 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void sysAcctCredit(IBOCmIAcctCreditValue acctCreditValue)throws Exception;
}
