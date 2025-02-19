/**
 * 
 */
package com.asiainfo.crm.cm.customer.speusermain.service.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainBean;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserCreditLevelValue;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountHisValue;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOCmUserSpeuserMainHValue;


/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmGroupMemberSV.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 26, 2011 9:08:59 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jan 25, 2011		huzq2           v1.0.0               修改原因
 */
public interface ICmUserSperuserMainSV
{
	/**
	 * 查询是否降零账户
	 * @param conditionDC
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmUserCreditLevelValue[] queryCreditLevelByAcctId(DataContainer conditionDC, int startNum, int endNum) throws Exception;
	/**
	 * 查询信誉度特殊用户
	 * @param phoneId
	 * @param startDate
	 * @param endDate
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmUserSpeuserMainHValue[] queryUserSpeuserHis(String phoneId, String startDate, String endDate, int startNum, int endNum) throws Exception;
	
	public IBOCmUserSpeuserMainHValue[] queryUserSpeuserHis(String phoneId, String doneDate, String startDate, String endDate, int startNum, int endNum) throws Exception;
	
	public IBOCmUserSpeuserMainHValue[] queryUserSpeuserHis(String condition, Map paraMap, String[] billingCycles, int startNum, int endNum) throws Exception;
	/**
	 * 查询信誉度特殊用户
	 * @param phoneId
	 * @param startDate
	 * @param endDate
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public int queryUserSpeuserHisCount(String phoneId,String startDate, String endDate) throws Exception;
	
	public int queryUserSpeuserHisCount(String phoneId, String doneDate,String startDate, String endDate) throws Exception;
	
	/**
	 * 根据手机号码和默认账户编码查询信用度特殊用户信息
	 * @param phoneId
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public IBOCmUserSpeuserMainValue queryUserSpeuser(String phoneId, Long acctId) throws Exception;
	
}
