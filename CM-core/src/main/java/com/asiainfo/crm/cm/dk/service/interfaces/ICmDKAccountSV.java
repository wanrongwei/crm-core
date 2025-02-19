package com.asiainfo.crm.cm.dk.service.interfaces;

import com.asiainfo.crm.cm.dk.ivalues.IBOCmBillingAcctValue;

public interface ICmDKAccountSV {
	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName 
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-10 上午10:11:25
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-12-10     huangqun           v1.0.0               修改原因<br>
	 */
	public boolean queryIfDunningAcct(long custId)throws Exception;
	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName 
	 * @Description 查询账户的缴费/充值记录，调账记录
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-10 上午10:11:25
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-12-10     huangqun           v1.0.0               修改原因<br>
	 */
	public boolean queryIfPayAcct(long custId)throws Exception;
	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName queryIfUnPayFeeAcct
	 * @Description 查询是否有未缴账单
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-12 上午10:11:25
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-12-12     huangqun           v1.0.0               修改原因<br>
	 */
	public boolean queryIfUnPayFeeAcct(long custId)throws Exception;
	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName queryIfCanChangeState
	 * @Description 查询是否有未缴账单
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-14 上午10:11:25
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-12-14     huangqun           v1.0.0               修改原因<br>
	 */
	public boolean queryIfCanChangeState(long custId)throws Exception;
	
	/**   
	 * @Function saveBillingAcct
	 * @Description 
	 *
	 * @param billingAcctValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-21 下午4:16:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-21     shitian             v1.0.0               修改原因<br>
	 */
	public void saveBillingAcct(IBOCmBillingAcctValue[] billingAcctValues)throws Exception;
	
	/**   
	 * @Function queryBillingAcct
	 * @Description 
	 *
	 * @param pbs
	 * @param ean
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-21 下午4:21:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-21     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmBillingAcctValue[] queryBillingAcct(long acctId,String pbs,String ean)throws Exception;
	
	/**   
	 * @Function queryBillingAcct
	 * @Description 
	 *
	 * @param addressId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-21 上午11:07:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-21     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmBillingAcctValue[] queryBillingAcct(String addressId) throws Exception;
}
