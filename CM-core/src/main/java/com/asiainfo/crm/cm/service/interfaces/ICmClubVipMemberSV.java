package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElementValue;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerBean;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmUserManagerValue;

public interface ICmClubVipMemberSV {

	/**
	 * 
	 * @Function: ICmPartnerBusiSV.java
	 * @Description: 查询大客户，以及大客户对应的VIP因子表，还有大客户对应的电话经理相关信息
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 11, 2012 11:18:04 AM
	 * 
	 * Modification History: Oct 11, 2012 qiangkz Version Description
	 */
	public DataContainer[] queryPartnerArchives(String criteria, int startNum,
			int endNum) throws Exception;

	/**
	 * 
	 * @Function: ICmPartnerBusiSV.java
	 * @Description: 查询大客户，以及大客户对应的VIP因子表，还有大客户对应的电话经理相关信息
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 11, 2012 11:19:21 AM
	 * 
	 * Modification History: Oct 11, 2012 qiangkz Version Description
	 */
	public int queryPartnerArchivesCount(String criteria) throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 大客户信息的增删改
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 25, 2012 10:32:26 AM
	 * 
	 * Modification History: Oct 25, 2012 qiangkz Version Description
	 */
	public void saveClubMemberArchives(DataContainer[] values) throws Exception;
	/**
	 * 
	* @Function: ICmClubVipMemberSV.java
	* @Description: 保存俱乐部信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Oct 29, 2012 10:19:53 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 29, 2012     suntao6           v1.0.0              修改原因
	 */
	public void saveClubMember(DataContainer[] values) throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询大客户对应的VIP因子表相关信息
	 * 
	 * @param: 用户手机号码
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 25, 2012 5:22:51 PM
	 * 
	 * Modification History: Oct 25, 2012 qiangkz Version Description
	 */
	public IBOCmVipElementValue queryFromBillId(String billId) throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询大客户对应的VIP因子表相关信息
	 * 
	 * @param: 
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 26, 2012 10:16:02 AM
	 * 
	 * Modification History: Oct 26, 2012 qiangkz Version Description
	 */
	public DataContainer[] queryVipElementArchives(String criteria,
			int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询大客户对应的VIP因子表相关信息
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 26, 2012 10:16:07 AM
	 * 
	 * Modification History: Oct 26, 2012 qiangkz Version Description
	 */
	public int queryVipElementArchivesCount(String criteria) throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询大客户对应的VIP因子表相关信息历史记录
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 26, 2012 2:10:42 PM
	 * 
	 * Modification History: Oct 26, 2012 qiangkz Version Description
	 */
	public DataContainer[] queryVipElementHisArchives(String criteria,
			int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询大客户对应的VIP因子表相关信息历史记录
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 26, 2012 2:10:47 PM
	 * 
	 * Modification History: Oct 26, 2012 qiangkz Version Description
	 */
	public int queryVipElementHisArchivesCount(String criteria)
			throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询黑名单表的相关信息历史记录
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 26, 2012 4:17:16 PM
	 * 
	 * Modification History: Oct 26, 2012 qiangkz Version Description
	 */
	public DataContainer[] querySpecialListHisArchives(String criteria,
			int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询黑名单表的相关信息历史记录
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 26, 2012 4:17:21 PM
	 * 
	 * Modification History: Oct 26, 2012 qiangkz Version Description
	 */
	public int querySpecialListHisArchivesCount(String criteria)
			throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询电话经理信息表
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 27, 2012 3:27:14 PM
	 * 
	 * Modification History: Oct 27, 2012 qiangkz Version Description
	 */
	public IQBOSecCustManagerValue[] queryCmUserManager(String userId, int startNum,
			int endNum) throws Exception;

	/**
	 * 
	 * @Function: ICmClubVipMemberSV.java
	 * @Description: 查询电话经理信息表
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Oct 27, 2012 3:27:24 PM
	 * 
	 * Modification History: Oct 27, 2012 qiangkz Version Description
	 */
	public int queryCmUserManagerCount(String criteria) throws Exception;

	/**
	 * 
	* @Function: ICmClubVipMemberSV.java
	* @Description: 保存，修改，删除大客户对应的电话经理信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 29, 2012 10:02:56 AM 
	*
	* Modification History:
	* Oct 29, 2012         qiangkz          Version            Description
	 */
	public void saveClubMemberToManagerArchives(BOCmUserManagerBean[] values)throws Exception;

	/**
	 * 
	* @Function: ICmClubVipMemberSV.java
	* @Description: 查询电话经理信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @param managerId 
	* @param managerId 
	* @param custId 
	* @date: Oct 29, 2012 2:20:58 PM 
	*
	* Modification History:
	* Oct 29, 2012         qiangkz          Version            Description
	 */
	public IBOCmUserManagerValue getCmUserManager(String userId, String custId, String managerId)throws Exception;

	/**
	 * 
	* @Function: ICmClubVipMemberSV.java
	* @Description: 查询大客户信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 29, 2012 9:20:11 PM 
	*
	* Modification History:
	* Oct 29, 2012         qiangkz          Version            Description
	 */
	public IBOCmClubMemberValue getCmClubMember(String userId, String billId, String memberLevel)throws Exception;
	/**
	 * 
	* @Function: ICmClubVipMemberSV.java
	* @Description: 根据USR_ID,CLUB_ID查找大客户信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Oct 31, 2012 3:40:36 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 31, 2012     suntao6           v1.0.0              修改原因
	 */
	public IBOCmClubMemberValue getCmClubMemberByUserId(String userId, String clubId)throws Exception;
	
	public DataContainerInterface[] qryClubMemberByCdn(String dt, int start, int end) throws Exception ;
	public int qryClubMemberCountByCdn(String dt) throws Exception;
}
