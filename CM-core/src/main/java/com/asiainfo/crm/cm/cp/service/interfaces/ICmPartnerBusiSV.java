package com.asiainfo.crm.cm.cp.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IQBOCmPartnerInfoValue;

/**
 * 
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: ICmPartnerBusiSV.java
 * @Description: 查询销售型SI信息接口
 * 
 * @version: v1.0.0
 * @author: qiangkz
 * @date: Oct 9, 2012 2:05:25 PM
 * 
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* Oct 9, 2012
 * qiangkz v1.0.0 修改原因
 */
public interface ICmPartnerBusiSV {

	/**
	 * 
	 * @Function: ICmPartnerBusiSV.java
	 * @Description: 多表联合查询SI信息
	 * 
	 * @param:参数描述 服务商类型、状态类型、type_desc、PARTNER_TYPE_DTL
	 * @return：销售型SI信息
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 9, 2012 2:03:37 PM
	 * 
	 * Modification History: Oct 9, 2012 qiangkz Version Description
	 */
	public IQBOCmPartnerInfoValue[] queryMPartnerInfo(String partnerTypeDtl,
			String partnerType, String statusType, String typeDesc, int start,
			int end) throws Exception;

	/**
	 * 
	 * @Function: ICmPartnerBusiSV.java
	 * @Description: 多表联合查询SI信息总数
	 * 
	 * @param:参数描述 服务商类型、状态类型、type_desc、PARTNER_TYPE_DTL
	 * @return：销售型SI信息
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 9, 2012 2:03:46 PM
	 * 
	 * Modification History: Oct 9, 2012 qiangkz Version Description
	 */
	public int queryMPartnerCount(String partnerTypeDtl, String partnerType,
			String statusType, String typeDesc) throws Exception;

	/**
	 * 
	 * @Function: ICmPartnerBusiSV.java
	 * @Description: 单表查询SI信息
	 * 
	 * @param:参数描述 服务商类型、PARTNER_TYPE_DTL、si_intro_num
	 * @return：SI信息
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 9, 2012 2:14:15 PM
	 * 
	 * Modification History: Oct 9, 2012 qiangkz Version Description
	 */
	public IBOCmPartnerInfoValue[] querySPartnerInfo(String partnerTypeDtl,
			String partnerType, String statusType, String siIntroNum,
			int start, int end) throws Exception;

	/**
	 * 
	 * @Function: ICmPartnerBusiSV.java
	 * @Description: 单表查询SI信息
	 * 
	 * @param:参数描述 服务商类型、PARTNER_TYPE_DTL 、si_intro_num 、statusType
	 * @return：SI信息
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 9, 2012 2:18:19 PM
	 * 
	 * Modification History: Oct 9, 2012 qiangkz Version Description
	 */
	public int querySPartnerCount(String partnerTypeDtl, String partnerType,
			String statusType, String siIntroNum) throws Exception;

	/**
	 * 
	 * @Function: ICmPartnerBusiSV.java
	 * @Description: 单表查询SI信息
	 * 
	 * @param:参数描述 服务商类型、PARTNER_TYPE_DTL、si_intro_num、statusType
	 * @return：SI信息
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 9, 2012 2:14:15 PM
	 * 
	 * Modification History: Oct 9, 2012 qiangkz Version Description
	 */
	public IBOCmPartnerInfoValue[] querySPartnerInfo(String partnerTypeDtl,
			String partnerType, String siIntroNum, int start, int end)
			throws Exception;

	/**
	 * 
	 * @Function: ICmPartnerBusiSV.java
	 * @Description: 单表查询SI信息
	 * 
	 * @param:参数描述 服务商类型、PARTNER_TYPE_DTL 、si_intro_num
	 * @return：SI信息
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 9, 2012 2:18:19 PM
	 * 
	 * Modification History: Oct 9, 2012 qiangkz Version Description
	 */
	public int querySPartnerCount(String partnerTypeDtl, String partnerType,
			String siIntroNum) throws Exception;

	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 查询合作伙伴信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 11, 2012 11:18:04 AM 
	*
	* Modification History:
	* Oct 11, 2012         qiangkz          Version            Description
	 */
	public DataContainer[] queryPartnerArchives(String criteria, int startNum,
			int endNum) throws Exception;
	
	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 11, 2012 11:19:21 AM 
	*
	* Modification History:
	* Oct 11, 2012         qiangkz          Version            Description
	 */
	public int queryPartnerArchivesCount(String criteria) throws Exception;

	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 11, 2012 2:21:51 PM 
	*
	* Modification History:
	* Oct 11, 2012         qiangkz          Version            Description
	 */
	public void savePartnerArchives(DataContainer[] values)throws Exception;

	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 11, 2012 8:38:12 PM 
	*
	* Modification History:
	* Oct 11, 2012         qiangkz          Version            Description
	 */
	public DataContainer[] queryPartnerServiceArchives(String criteria, int startNum,
			int endNum) throws Exception;
	
	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 11, 2012 11:19:21 AM 
	*
	* Modification History:
	* Oct 11, 2012         qiangkz          Version            Description
	 */
	public int queryPartnerServiceArchivesCount(String criteria) throws Exception;
	
	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 11, 2012 8:39:30 PM 
	*
	* Modification History:
	* Oct 11, 2012         qiangkz          Version            Description
	 */
	public void savePartnerServiceArchives(DataContainer[] values)throws Exception;

	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 15, 2012 10:08:39 AM 
	*
	* Modification History:
	* Oct 15, 2012         qiangkz          Version            Description
	 */
	public void savePartnerServiceAgentArchives(DataContainer[] values) throws Exception;
	
	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 19, 2012 10:09:21 AM 
	*
	* Modification History:
	* Oct 19, 2012         qiangkz          Version            Description
	 */
	public DataContainer[] getOrgByParams(String orgId, String orgName, String orgRoleTypeId, String subOrgRoleTypeId, String districtId, String countyId, String owerArea, int startNum,
			int endNum) throws Exception;
	
	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 19, 2012 10:10:09 AM 
	*
	* Modification History:
	* Oct 19, 2012         qiangkz          Version            Description
	 */
	public int getOrgCountByParams(String orgId, String orgName, String orgRoleTypeId, String subOrgRoleTypeId, String districtId, String countyId, String owerArea) throws Exception;

	/**
	 * 
	* @Function: ICmPartnerBusiSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	 * @throws Exception 
	* @date: Oct 24, 2012 9:08:55 AM 
	*
	* Modification History:
	* Oct 24, 2012         qiangkz          Version            Description
	 */
	public IBOCmAgentPartnerInfoValue[] findPartnerAndAgent(String partner,
			String channel, String city) throws Exception;
	
}
