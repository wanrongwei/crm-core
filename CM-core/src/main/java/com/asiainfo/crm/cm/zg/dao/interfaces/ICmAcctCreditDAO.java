package com.asiainfo.crm.cm.zg.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.zg.ivalues.IIAccBusiCreditValue;
import com.asiainfo.crm.cm.zg.ivalues.IIRaccOperValue;

public interface ICmAcctCreditDAO {

	/**   
	 * @Function saveIRaccOper
	 * @Description 账户信用度调整上发计费通知表
	 *
	 * @param raccOperValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 8, 2012 2:34:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveIRaccOper(IIRaccOperValue raccOperValue) throws Exception;

	/**   
	 * @Function queryAcctCredit
	 * @Description 查询账户信用度调整上发计费
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 8, 2012 2:35:29 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IIAccBusiCreditValue[] queryAcctCredit(String condition, Map parameter) throws Exception;

	/**   
	 * @Function saveAccBusiCredit
	 * @Description 账户信用度调整上发计费
	 *
	 * @param accBusiCreditValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 8, 2012 2:35:05 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveAccBusiCredit(IIAccBusiCreditValue accBusiCreditValue) throws Exception;
}
