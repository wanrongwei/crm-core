package com.asiainfo.crm.cm.hu.customer.service.interfaces;

import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;

public interface ICmIndivCustomerSV {
	/**
	 * 根据条件查询是否存在相同的客户
	 * @Function queryDuplicateCust
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-12-10 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-10     huangqun           v1.0.0               修改原因<br>
	 */
	public long queryDuplicateCust(String firstName,String lastName,String birthPlace,String birthDate,String motherName)throws Exception;
	/**
	 *	
	 * @Function queryDuplicateCustByCertCode
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-12-21 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-21     huangqun           v1.0.0               修改原因<br>
	 */
	public long queryDuplicateCustByCertCode(String custCertType,String custCertCode)throws Exception;
	/**
	 *	
	 * @Function saveCustSegmentRela
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-12-21 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-21     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveCustSegmentRela(IBOCmCustSegmentRelaValue value)throws Exception;
	/**
	 *	
	 * @Function queryIdentification
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-12-23 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-23     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOIdentificationValue[] queryIdentification(long partyId,int startIndex,int endIndex)throws Exception;
	/**
	 *	
	 * @Function queryIdentificationCount
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-12-23 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-23     huangqun           v1.0.0               修改原因<br>
	 */
	public int queryIdentificationCount(long partyId)throws Exception;
	/**
	 *	
	 * @Function saveIdentification
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-12-23 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-23     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveIdentification(IBOIdentificationValue[] values)throws Exception;
}
