package com.asiainfo.crm.cm.teaminvoke.in.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.omframe.instance.ivalues.IInsAccrelValue;
import com.asiainfo.crm.so.query.ivalues.IQAcctRelInfoValue;

public interface ISo2CmSV {

	public IInsAccrelValue[] getInsAccrelByAcctId(long acctId, long payType, int validType) throws Exception;

	public int getAccrelInfoCountByAcctId(long acctId, int payType, int aValidType) throws Exception;
	
	/**
	 * 根据账户ID查询该账户下的付费用户
	 * 
	 * @param acctId
	 * @param payType
	 * @param aValidType
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 */
	public IQAcctRelInfoValue[] getAccrelInfoByAcctId(long acctId, int payType, int aValidType,int startIndex,int endIndex) throws Exception;
	
	/**
	 * 根据账户ID查询该账户下的付费用户
	 * 只返回EFFECTIVE_DATE，EXPIRE_DATE，USER_ID，BILL_ID
	 * 
	 * @param acctId
	 * @param payType
	 * @param aValidType
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] getAccrelInfoByAcctIdOfSet(long acctId, int payType, int aValidType,int startIndex,int endIndex) throws Exception;
	
	/**   
	 * @Function updateCustInfo4CPA
	 * @Description 
	 *
	 * @param custId
	 * @param custSegment
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-1-28 下午2:54:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-1-28     shitian             v1.0.0               修改原因<br>
	 */
	public boolean updateCustInfo4CPA(long custId, String custSegment, String custName) throws Exception;

	/**   
	 * @Function updateAcctInfo4CPA
	 * @Description 
	 *
	 * @param acctId
	 * @param cycleType
	 * @param billDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-1-28 下午2:54:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-1-28     shitian             v1.0.0               修改原因<br>
	 */
	public boolean updateAcctInfo4CPA(long acctId, String cycleType, String billDate) throws Exception;

}
