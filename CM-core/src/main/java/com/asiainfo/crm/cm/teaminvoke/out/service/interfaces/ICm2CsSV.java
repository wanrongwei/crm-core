package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import java.rmi.RemoteException;

import com.asiainfo.crm.cm.common.ivalues.IContactValue;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfomationValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

public interface ICm2CsSV {

	/**
	 * 客户偏好查询
	 * @Function getCmCustPerferInfomation
	 * @Description 
	 *
	 * @param custId
	 * @param perferType 1:偏好媒介,2:偏好营业厅
	 * @return IBOCmCustPerferInfomationValue{PERFER_TYPE：1:偏好媒介,2:偏好营业厅
	 *                                        如果是偏好媒介
	 *                                        CONT_MED_TYPE_ID：联系媒介类型，
	 *                                        EMAIL:联系邮箱信息，CONT_NUMBER：联系电话信息
	 *                                        如果是偏好营业厅
	 *                                        CUST_CONT_RELA_ID：组织ID，PREFER_CHANNEL_NAME：组织名称
	 *                                       }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-9-19 上午10:21:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-19     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOCmCustPerferInfomationValue[] getCmCustPerferInfomation(long custId, int perferType) throws Exception;

	/**
	 * 查询偏好媒介对应的偏好时间段
	 * @Function getBOCmPreferPeriods
	 * @Description 
	 *
	 * @param preferId
	 * @return IBOCmCustPerferInfoValue{TIME_TYPE：1：工作日、2：休息日、3：时段
	 *                                  TIME_BEGIN_UNIT：开始时间点
	 *                                  TIME_END_UNIT：结束时间点}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-9-19 上午10:31:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-19     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOCmCustPerferInfoValue[] getBOCmPreferPeriods(long preferId) throws Exception;

	/**
	 * 根据客户ID查询客户扩展信息
	 * @Function getCmxIndivCustomerByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return IBOCmxIndivCustomerValue{MANUAL_COMMERCIAL_PROTECTION：营销免打扰标识（人工），1：免打扰，0：不免打扰,-1:N/A	  此字段值不等于-1以MANUAL_COMMERCIAL_PROTECTION为准，如果等于-1则以DIRECT_MARKETING_PROTECTION为准。	
										MANUAL_PROTECT_EFFECTIVE：免打扰生效时间（人工）	
										MANUAL_PROTECT_EXPIRE_DATE：免打扰失效时间（人工）
										DIRECT_MARKETING_PROTECTION：营销免打扰标记(CPR)	0：免打扰，1：不免打扰
										PROTECT_EFF_DATE：免打扰生效时间(CPR)	
										PROTECT_EXPIRE_DATE：免打扰失效时间(CPR)
										CONTACT_PROTECTION：联系免打扰	：1：免打扰，0：不免打扰}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-9-19 上午10:37:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-19     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustomerValue getCmxIndivCustomerByCustId(long custId) throws Exception;

	/**   
	 * @Function queryCustByEmail
	 * @Description 根据email查询客户信息
	 *
	 * @param email
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-13 上午10:27:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-13     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustByEmail(String email) throws Exception;

	/**   
	 * @Function saveGroupContaces
	 * @Description 
	 *
	 * @param contactValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-24 上午11:45:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-24     shitian             v1.0.0               修改原因<br>
	 */
	public void saveGroupContaces(IContactValue[] contactValues) throws Exception;

	/**   
	 * @Function queryCustContactMediums
	 * @Description 查询联系人信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-10 下午5:36:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-10     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustContactMediums(long custId) throws Exception;
	
	/**   
	 * @Function getAddress
	 * @Description 
	 *
	 * @param addressId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-30 下午3:46:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-30     shitian             v1.0.0               修改原因<br>
	 */
	public address getAddress(long addressId) throws Exception; 
	
	/**   
	 * @Function getAcctInfo
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-30 下午3:47:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-30     shitian             v1.0.0               修改原因<br>
	 */
	public DoQueryResponse getAcctInfo(long acctId) throws RemoteException, Exception;
	
	/**   
	 * @Function queryCmxIndivCustomerValue
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-30 下午3:53:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-30     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivCustomerValue queryCmxIndivCustomerValue(long custId) throws Exception;
	
	/**   
	 * @Function queryCustContactMediumByCustIdAndType
	 * @Description 
	 *
	 * @param custId
	 * @param contMedTypeId	{CmConstants.AddressId}
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-30 下午3:58:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-30     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue queryCustContactMediumByCustIdAndType(long custId, String contMedTypeId) throws Exception;
	/**   
	 * @Function queryCustByCustIds
	 * @Description 
	 *
	 * @param custId
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-14 下午3:58:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-14     shitian             v1.0.0               修改原因<br>
	 */
	public IVOCustValue[] queryCustByCustIds(long[] custIds)throws Exception;
}
