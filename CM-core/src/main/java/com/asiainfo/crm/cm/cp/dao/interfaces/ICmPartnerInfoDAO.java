package com.asiainfo.crm.cm.cp.dao.interfaces;

import com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmPartnerInfoValue;

/**
 * 
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: ICmPartnerInfoDAO.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: Administrator
 * @date: Oct 9, 2012 1:58:01 PM
 * 
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* Oct 9, 2012
 * Administrator v1.0.0 修改原因
 */
public interface ICmPartnerInfoDAO {

	/**
	 * 
	 * @Function: ICmPartnerInfoDAO.java
	 * @Description: 该函数的功能描述
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: Administrator
	 * @date: Oct 9, 2012 2:00:20 PM
	 * 
	 * Modification History: Oct 9, 2012 Author Version Description
	 */
	public IBOCmPartnerInfoValue[] queryPartnerInfo(String partnerTypeDtl,
			String partnerType, String statusType, String siIntroNum,
			int start, int end) throws Exception;

	/**
	 * 
	 * @Function: ICmPartnerInfoDAO.java
	 * @Description: 该函数的功能描述
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: Administrator
	 * @date: Oct 9, 2012 2:00:31 PM
	 * 
	 * Modification History: Oct 9, 2012 Author Version Description
	 */
	public int queryPartnerCount(String partnerTypeDtl, String partnerType,
			String statusType, String siIntroNum) throws Exception;

	/**
	 * 
	* @Function: ICmPartnerInfoDAO.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	 * @throws Exception 
	* @date: Oct 24, 2012 9:23:03 AM 
	*
	* Modification History:
	* Oct 24, 2012         qiangkz          Version            Description
	 */
	public IBOCmAgentPartnerInfoValue[] findPartnerAndAgent(String partner,
			String channel, String city) throws Exception;

}
