package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsStudInfoValue;
/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmSchoolInfoManagerSV.java
* @Description: 校园信息相关操作
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 24, 2012 2:17:53 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 24, 2012      suntao6          v1.0.0             修改原因
 */
public interface ICmSchoolInfoManagerSV {
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查询校园基站信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 24, 2012 2:18:20 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 24, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] querySchoolInfo(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查询校园基站记录数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 24, 2012 2:18:34 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 24, 2012     suntao6           v1.0.0              修改原因
 */
	public int querySchoolInfoCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description:保存校园基站信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 24, 2012 2:26:26 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 24, 2012     suntao6           v1.0.0              修改原因
 */

	public void saveSchoolInfo(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园渠道信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 25, 2012 11:03:55 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 25, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGsChanInfo(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园渠道信息数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 25, 2012 11:04:32 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 25, 2012     suntao6           v1.0.0              修改原因
 */	
	public int queryGsChanInfoCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 保存校园渠道信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 25, 2012 11:05:11 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 25, 2012     suntao6           v1.0.0              修改原因
 */	
	public void saveGsChanInfo(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description:保存学生放号营销类
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 5, 2012 4:52:11 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 5, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGsScheduleInfo(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园直销队信息
*
* @param:查询条件
* @return：校园直销队信息
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 27, 2012 10:54:45 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 27, 2012     suntao6           v1.0.0              修改原因
 */	
	public DataContainer[] queryGsChanTeam(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园直销队数量
*
* @param:查询条件
* @return：直销队数
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 27, 2012 10:56:00 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 27, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryGsChanTeamCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园直销员
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 28, 2012 3:11:34 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 28, 2012     suntao6           v1.0.0              修改原因
 */	
	public DataContainer[] queryGsChanMember(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园直销员数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 28, 2012 3:12:14 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 28, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryGsChanMemberCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 校园直销队信息管理
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 27, 2012 2:34:09 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 27, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveChanTeam(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 保存校园直销员信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 28, 2012 3:39:30 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 28, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveChanMember(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 保存校园教职工信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 31, 2012 2:19:56 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 31, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGsTchrInfo(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园联系人
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 29, 2012 3:44:08 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 29, 2012     suntao6           v1.0.0              修改原因
 */	
	public DataContainer[] queryCmGsKeyman(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园联系人信息数量
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 29, 2012 3:47:25 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 29, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryCmGsKeymanCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 保存校园联系人
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 29, 2012 4:16:12 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 29, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGsKeyMan(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找通知书夹寄卡信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 30, 2012 11:03:55 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 30, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryCmGslCardInfo(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找通知书夹寄卡信息count
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 30, 2012 11:04:55 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 30, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryCmGslCardInfoCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description:保存通知书夹寄卡信息 
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 30, 2012 2:05:53 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 30, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGslCardInfo(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 保存校园学生信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 3, 2012 3:58:16 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 3, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGsStudInfo(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查询校园教职工信息
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 31, 2012 2:05:15 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 31, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGsTchrInfo(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查询校园教职工信息数量
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 31, 2012 2:07:15 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 31, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryGsTchrInfoCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园学生信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 3, 2012 3:43:57 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 3, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGsStudInfo(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 查找校园学生信息数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 3, 2012 3:44:09 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 3, 2012     suntao6           v1.0.0              修改原因
 */	
	public int queryGsStudInfoCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 放号营销类查询
* 
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 5, 2012 3:59:28 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 5, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGsScheduleInfo(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description:放号营销类查询
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 5, 2012 4:03:59 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 5, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryGsScheduleInfoCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 该函数的功能描述
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: qiangkz
* @date: Oct 22, 2012 2:51:12 PM 
*
* Modification History:
* Oct 22, 2012         qiangkz          Version            Description
 */
	public IBOCmGsStudInfoValue[] getYears()throws Exception;
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description:根据条件查找校园基站信息是否存在
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 13, 2012 7:20:59 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 13, 2012     suntao6           v1.0.0              修改原因
 */
	public int getBaseStationByName(DataContainer dc) throws Exception; 
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 根据条件查找教职工信息(姓名/手机号码/校园ID)
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 14, 2012 3:15:50 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 14, 2012     suntao6           v1.0.0              修改原因
 */
	public int getCmGsTchrInfoBeanByName(DataContainer dc) throws Exception; 
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description:  根据条件查找学生信息(姓名/手机号码/校园ID) 
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 14, 2012 4:05:18 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 14, 2012     suntao6           v1.0.0              修改原因
 */
	public int getCmGsStudInfoByName(DataContainer dc) throws Exception; 
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 根据条件查找渠道信息(营业厅名称/校园ID) 
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 14, 2012 4:35:11 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 14, 2012     suntao6           v1.0.0              修改原因
 */
	public int getCmGsChanInfoByName(DataContainer dc) throws Exception; 
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 根据条件查找直销队信息(直销队名称/校园ID) 
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 14, 2012 5:27:44 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 14, 2012     suntao6           v1.0.0              修改原因
 */
	public int getCmGsChanTeamByName(DataContainer dc) throws Exception; 
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 根据条件查找联系人信息(姓名/电话/校园ID) 
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 15, 2012 10:15:18 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 15, 2012     suntao6           v1.0.0              修改原因
 */
	public int getCmGsKeymanByName(DataContainer dc) throws Exception; 
/**
 * 
* @Function: ICmSchoolInfoManagerSV.java
* @Description: 根据条件查找夹寄卡信息(年份/运营商类型/校园ID) 
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 15, 2012 11:19:02 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 15, 2012     suntao6           v1.0.0              修改原因
 */
	public int getCmGslCardInfoByYear(DataContainer dc) throws Exception; 


}
