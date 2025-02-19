package com.asiainfo.crm.cm.cp.dao.interfaces;

import com.asiainfo.crm.cm.cp.ivalues.IQBOCmPartnerInfoValue;

/**
 * 
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: ICmPartnerBusiInfoDAO.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: Administrator
 * @date: Oct 9, 2012 1:58:32 PM
 * 
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* Oct 9, 2012
 * Administrator v1.0.0 修改原因
 */
public interface ICmPartnerBusiInfoDAO {

	/**
	 * 
	 * @Function: ICmPartnerBusiInfoDAO.java
	 * @Description: 该函数的功能描述
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: Administrator
	 * @date: Oct 9, 2012 2:01:02 PM
	 * 
	 * Modification History: Oct 9, 2012 Author Version Description
	 */
	public IQBOCmPartnerInfoValue[] queryPartnerInfo(String partnerTypeDtl,
			String partnerType, String statusType, String typeDesc, int start,
			int end) throws Exception;

	/**
	 * 
	 * @Function: ICmPartnerBusiInfoDAO.java
	 * @Description: 该函数的功能描述
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: Administrator
	 * @date: Oct 9, 2012 2:01:15 PM
	 * 
	 * Modification History: Oct 9, 2012 Author Version Description
	 */
	public int queryPartnerCount(String partnerTypeDtl, String partnerType,
			String statusType, String typeDesc) throws Exception;

}
