package com.asiainfo.crm.cm.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmSchoolInfoImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmGsBaseStationEngine;
import com.asiainfo.crm.cm.common.bo.BOCmGsChanInfoEngine;
import com.asiainfo.crm.cm.common.bo.BOCmGsChanTeamEngine;
import com.asiainfo.crm.cm.common.bo.BOCmGsKeymanEngine;
import com.asiainfo.crm.cm.common.bo.BOCmGsStudInfoBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsStudInfoEngine;
import com.asiainfo.crm.cm.common.bo.BOCmGsTchrInfoEngine;
import com.asiainfo.crm.cm.common.bo.BOCmGslCardInfoEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsBaseStationValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsChanInfoValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsChanTeamValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsKeymanValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsStudInfoValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsTchrInfoValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGslCardInfoValue;
import com.asiainfo.crm.cm.service.interfaces.ICmSchoolInfoManagerSV;

/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: CmSchoolInfoManagerImpl.java
* @Description: 校园相关信息的统一处理类
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 24, 2012 2:40:58 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 24, 2012      suntao6          v1.0.0             修改原因
 */
public class CmSchoolInfoManagerSVImpl implements ICmSchoolInfoManagerSV {

	public DataContainer[] querySchoolInfo(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGsBaseStationBean", map), startNum, endNum);
	}

	public int querySchoolInfoCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGsBaseStationBean", map));
	}

	public void saveSchoolInfo(DataContainer[] values) throws Exception {

		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveSchoolInfo(values);

	}

	public DataContainer[] queryGsChanInfo(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGsChanInfoBean", map), startNum, endNum);
	}

	public int queryGsChanInfoCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGsChanInfoBean", map));
	}

	public void saveGsChanInfo(DataContainer[] values) throws Exception {

		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveGsChanInfo(values);
	}

	public DataContainer[] queryGsChanTeam(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGsChanTeamBean", map), startNum, endNum);
	}

	public int queryGsChanTeamCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGsChanTeamBean", map));
	}

	public void saveChanTeam(DataContainer[] values) throws Exception {
		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveChanTeam(values);
	}

	public DataContainer[] queryGsChanMember(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGsChanMemberBean", map), startNum, endNum);
	}

	public int queryGsChanMemberCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGsChanMemberBean", map));
	}

	public void saveChanMember(DataContainer[] values) throws Exception {
		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveChanMember(values);
	}

	public void saveGsStudInfo(DataContainer[] values) throws Exception {
		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveGsStudInfo(values);
	}

	public DataContainer[] queryCmGsKeyman(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGsKeymanBean", map), startNum, endNum);
	}

	public int queryCmGsKeymanCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGsKeymanBean", map));
	}

	public void saveGsKeyMan(DataContainer[] values) throws Exception {
		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveKeyMan(values);

	}

	public DataContainer[] queryCmGslCardInfo(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGslCardInfoBean", map), startNum, endNum);
	}

	public int queryCmGslCardInfoCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGslCardInfoBean", map));
	}

	public void saveGslCardInfo(DataContainer[] values) throws Exception {
		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveGslCardInfo(values);
	}

	public DataContainer[] queryGsTchrInfo(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGsTchrInfoBean", map), startNum, endNum);
	}

	public int queryGsTchrInfoCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGsTchrInfoBean", map));
	}

	public void saveGsTchrInfo(DataContainer[] values) throws Exception {
		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveGsTchrInfo(values);

	}

	public DataContainer[] queryGsStudInfo(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGsStudInfoBean", map), startNum, endNum);
	}

	public int queryGsStudInfoCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGsStudInfoBean", map));
	}

	public DataContainer[] queryGsScheduleInfo(String criteria, int startNum, int endNum) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryData(
				ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGsScheduleInfoBean", map), startNum, endNum);
	}

	public int queryGsScheduleInfoCount(String criteria) throws Exception {
		Map map = new HashMap<String, String>();
		map.put("SCHOOL_ID", criteria);
		return ((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).queryCount(ParamUtil.buildQueryXml(
				"com.asiainfo.crm.cm.common.bo.BOCmGsScheduleInfoBean", map));
	}

	public void saveGsScheduleInfo(DataContainer[] values) throws Exception {
		((AbstractCmSchoolInfoImpl) CmServiceFactory.getBusiMode(AbstractCmSchoolInfoImpl.class)).saveGsScheduleInfo(values);
	}

	public IBOCmGsStudInfoValue[] getYears() throws Exception {
		String todayY = getTodayY();
		int temp = Integer.parseInt(todayY);
		IBOCmGsStudInfoValue[] year = new BOCmGsStudInfoBean[30];
		for (int i = 0; i < year.length; i++) {
			year[i] = new BOCmGsStudInfoBean();
			year[i].setYear((temp - i) + "");
		}
		return year;
	}

	/**
	 * 得到今天日期，格式yyyy-MM。
	 *
	 * @return String 格式化的日期字符串
	 */
	private String getTodayY() {
		Date cDate = new Date();
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat("yyyy");
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 
	* @Function: AbstractCmSchoolInfoImpl.java
	* @Description: 根据教师姓名和手机号码查找教师
	* @name 教师姓名
	* @phone 手机号码
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 13, 2012 10:58:49 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 13, 2012     suntao6           v1.0.0              修改原因
	 */
	public int getCmGsTchrInfoBeanByName(DataContainer dc) throws Exception {
		String name = dc.getAsString("NAME");// 姓名
		String phone = dc.getAsString("PHONE_ID");// 手机号
		String schoolId = dc.getAsString("SCHOOL_ID");// 学校ID
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(name) && !"null".equals(name) && name != null) {
			condition.append(" and " + IBOCmGsTchrInfoValue.S_Name + "  = :name ");
			paraMap.put("name", name);
		}
		if (!"".equals(phone) && !"null".equals(phone) && phone != null) {
			condition.append(" and " + IBOCmGsTchrInfoValue.S_PhoneId + "  = :phone ");
			paraMap.put("phone", phone);
		}
		if (!"".equals(schoolId) && !"null".equals(schoolId) && schoolId != null) {
			condition.append(" and " + IBOCmGsTchrInfoValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", schoolId);
		}
		IBOCmGsTchrInfoValue[] values = BOCmGsTchrInfoEngine.getBeans(condition.toString(), paraMap);
		int count = values.length;
		return count;
	}

	/**
	 * 
	* @Function: CmSchoolInfoManagerSVImpl.java
	* @Description: 根据基站的中文名称查找对应的基站信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 12, 2012 9:07:30 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 12, 2012     suntao6           v1.0.0              修改原因
	 */
	public int getBaseStationByName(DataContainer dc) throws Exception {
		String baseStationName = dc.getAsString("BASE_CNAME");
		String schoolId = dc.getAsString("SCHOOL_ID");
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(baseStationName) && !"null".equals(baseStationName) && baseStationName != null) {
			condition.append(" and " + IBOCmGsBaseStationValue.S_BaseCname + "  = :baseStationName ");
			paraMap.put("baseStationName", baseStationName);
		}
		if (!"".equals(schoolId) && !"null".equals(schoolId) && schoolId != null) {
			condition.append(" and " + IBOCmGsBaseStationValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", schoolId);
		}
		IBOCmGsBaseStationValue[] values = BOCmGsBaseStationEngine.getBeans(condition.toString(), paraMap);
		int count = values.length;
		return count;
	}

	public int getCmGsStudInfoByName(DataContainer dc) throws Exception {
		String name = dc.getAsString("NAME");// 姓名
		String phone = dc.getAsString("PHONE_ID");// 手机号
		String schoolId = dc.getAsString("SCHOOL_ID");// 学校ID
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(name) && !"null".equals(name) && name != null) {
			condition.append(" and " + IBOCmGsStudInfoValue.S_Name + "  = :name ");
			paraMap.put("name", name);
		}
		if (!"".equals(phone) && !"null".equals(phone) && phone != null) {
			condition.append(" and " + IBOCmGsStudInfoValue.S_PhoneId + "  = :phone ");
			paraMap.put("phone", phone);
		}
		if (!"".equals(schoolId) && !"null".equals(schoolId) && schoolId != null) {
			condition.append(" and " + IBOCmGsStudInfoValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", schoolId);
		}
		IBOCmGsStudInfoValue[] values = BOCmGsStudInfoEngine.getBeans(condition.toString(), paraMap);
		int count = values.length;
		return count;
	}

	public int getCmGsChanInfoByName(DataContainer dc) throws Exception {
		String saleName = dc.getAsString("SALE_NAME");
		String schoolId = dc.getAsString("SCHOOL_ID");
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(saleName) && !"null".equals(saleName) && saleName != null) {
			condition.append(" and " + IBOCmGsChanInfoValue.S_SaleName + "  = :saleName ");
			paraMap.put("saleName", saleName);
		}
		if (!"".equals(schoolId) && !"null".equals(schoolId) && schoolId != null) {
			condition.append(" and " + IBOCmGsChanInfoValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", schoolId);
		}
		IBOCmGsChanInfoValue[] values = BOCmGsChanInfoEngine.getBeans(condition.toString(), paraMap);
		int count = values.length;
		return count;
	}

	public int getCmGsChanTeamByName(DataContainer dc) throws Exception {
		String teamName = dc.getAsString("TEAM_NAME");
		String schoolId = dc.getAsString("SCHOOL_ID");
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(teamName) && !"null".equals(teamName) && teamName != null) {
			condition.append(" and " + IBOCmGsChanTeamValue.S_TeamName + "  = :teamName ");
			paraMap.put("teamName", teamName);
		}
		if (!"".equals(schoolId) && !"null".equals(schoolId) && schoolId != null) {
			condition.append(" and " + IBOCmGsChanTeamValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", schoolId);
		}
		IBOCmGsChanTeamValue[] values = BOCmGsChanTeamEngine.getBeans(condition.toString(), paraMap);
		int count = values.length;
		return count;
	}

	public int getCmGsKeymanByName(DataContainer dc) throws Exception {
		String name = dc.getAsString("NAME");// 姓名
		String phone = dc.getAsString("PHONE_ID");// 手机号
		String schoolId = dc.getAsString("SCHOOL_ID");// 学校ID
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(name) && !"null".equals(name) && name != null) {
			condition.append(" and " + IBOCmGsKeymanValue.S_Name + "  = :name ");
			paraMap.put("name", name);
		}
		if (!"".equals(phone) && !"null".equals(phone) && phone != null) {
			condition.append(" and " + IBOCmGsKeymanValue.S_PhoneId + "  = :phone ");
			paraMap.put("phone", phone);
		}
		if (!"".equals(schoolId) && !"null".equals(schoolId) && schoolId != null) {
			condition.append(" and " + IBOCmGsKeymanValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", schoolId);
		}
		IBOCmGsKeymanValue[] values = BOCmGsKeymanEngine.getBeans(condition.toString(), paraMap);
		int count = values.length;
		return count;
	}

	public int getCmGslCardInfoByYear(DataContainer dc) throws Exception {
		String year = dc.getAsString("YEAR");// 合作年份
		String exertion = dc.getAsString("EXERTION");// 合作标示
		String schoolId = dc.getAsString("SCHOOL_ID");// 学校ID
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(year) && !"null".equals(year) && year != null) {
			condition.append(" and " + IBOCmGslCardInfoValue.S_Year + "  = :year ");
			paraMap.put("year", year);
		}
		if (!"".equals(exertion) && !"null".equals(exertion) && exertion != null) {
			condition.append(" and " + IBOCmGslCardInfoValue.S_Exertion + "  = :exertion ");
			paraMap.put("exertion", exertion);
		}
		if (!"".equals(schoolId) && !"null".equals(schoolId) && schoolId != null) {
			condition.append(" and " + IBOCmGslCardInfoValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", schoolId);
		}
		IBOCmGslCardInfoValue[] values = BOCmGslCardInfoEngine.getBeans(condition.toString(), paraMap);
		return values.length;
	}

}
