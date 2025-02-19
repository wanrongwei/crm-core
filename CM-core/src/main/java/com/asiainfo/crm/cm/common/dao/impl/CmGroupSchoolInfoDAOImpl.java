package com.asiainfo.crm.cm.common.dao.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.SessionManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.common.bo.BOCmGroupSchoolInfoEngine;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmGroupSchoolInfoDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupSchoolInfoValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;


public class CmGroupSchoolInfoDAOImpl implements ICmGroupSchoolInfoDAO {

	public int queryCampusCount(String schoolname, String property, String schooltype, String auditSts, String dept, String schoolid, String regioncode, String countycode)
			throws Exception {

		// return 0;
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		// condition.append("and "+IBOCmGroupSchoolInfoValue.S_Sts +" in (0,1,2) ");
		if (schoolname != null && !"".equals(schoolname) && !"null".equals(schoolname)) {
			condition.append(" and " + IBOCmGroupSchoolInfoValue.S_SchoolName + "  like :name ");
			paraMap.put("name", "%" + schoolname + "%");
		}
		if (null != property && !"".equals(property)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_SchoolProperty + "  = :property ");
			paraMap.put("property", Integer.parseInt(property));
		}
		if (null != schooltype && !"".equals(schooltype)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_SchoolType + "  = :type ");
			paraMap.put("type", Integer.parseInt(schooltype));
		}
		if (null != auditSts && !"".equals(auditSts)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_AuditSts + "  = :auditSts ");
			paraMap.put("auditSts", Integer.parseInt(auditSts));
		}
		if (null != dept && !"".equals(dept)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_MasterDept + "  = :masterDept ");
			paraMap.put("masterDept", Integer.parseInt(dept));
		}
		if (null != schoolid && !"".equals(schoolid)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", Long.parseLong(schoolid));
		}
		if (null != regioncode && !"".equals(regioncode)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_RegionCode + "  = :regionCode ");
			paraMap.put("regionCode", Integer.parseInt(regioncode));
		}
		if (null != countycode && !"".equals(countycode)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_CountyCode + "  = :countyCode ");
			paraMap.put("countyCode", Integer.parseInt(countycode));
		}
		return BOCmGroupSchoolInfoEngine.getBeansCount(condition.toString(), paraMap);
	}

	public IBOCmGroupSchoolInfoValue[] queryCampusInfo(String schoolname, String property, String schooltype, String auditSts, String dept, String schoolid, String regioncode,
			String countycode, int startNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		// condition.append("and "+IBOCmGroupSchoolInfoValue.S_Sts +" in (0,1,2) ");
		if (schoolname != null && !"".equals(schoolname) && !"null".equals(schoolname)) {
			condition.append(" and " + IBOCmGroupSchoolInfoValue.S_SchoolName + "  like :name ");
			paraMap.put("name", "%" + schoolname + "%");
		}
		if (null != property && !"".equals(property)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_SchoolProperty + "  = :property ");
			paraMap.put("property", Integer.parseInt(property));
		}
		if (null != schooltype && !"".equals(schooltype)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_SchoolType + "  = :type ");
			paraMap.put("type", Integer.parseInt(schooltype));
		}
		if (null != auditSts && !"".equals(auditSts)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_AuditSts + "  = :auditSts ");
			paraMap.put("auditSts", Integer.parseInt(auditSts));
		}
		if (null != dept && !"".equals(dept)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_MasterDept + "  = :masterDept ");
			paraMap.put("masterDept", Integer.parseInt(dept));
		}
		if (null != schoolid && !"".equals(schoolid)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_SchoolId + "  = :schoolId ");
			paraMap.put("schoolId", Long.parseLong(schoolid));
		}
		if (null != regioncode && !"".equals(regioncode)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_RegionCode + "  = :regionCode ");
			paraMap.put("regionCode", Integer.parseInt(regioncode));
		}
		if (null != countycode && !"".equals(countycode)) {
			condition.append("and " + IBOCmGroupSchoolInfoValue.S_CountyCode + "  = :countyCode ");
			paraMap.put("countyCode", Integer.parseInt(countycode));
		}
		return BOCmGroupSchoolInfoEngine.getBeans(condition.toString(), paraMap);
	}

	public IBOCmGroupSchoolInfoValue queryCampusinfoBySchoolId(long schoolId) throws Exception {
		return BOCmGroupSchoolInfoEngine.getBean(schoolId);
	}

	/**
	 * 新增方法
	 */
	public void saveCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception {
		String name = campus.getSchoolName();
		int count = getCampusSchoolByName(name);
		if (count == 0) {
			campus.set("SCHOOL_ID", BOCmGroupSchoolInfoEngine.getNewId());
			campus.set("AUDIT_STS", "0");
			campus.set("STS", "1");
			campus.setOperType(1);// 操作类型 新增
			BOCmGroupSchoolInfoEngine.save(campus);
			BOCmGroupSchoolInfoEngine.getBean(BOCmGroupSchoolInfoEngine.getNewId().longValue());
		} else {
			throw new AIException("School name can not repeat !");
		}
	}

	public IBOCmGroupSchoolInfoValue[] getCampusSchoolName(String sts) throws Exception {

		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(sts) && !"null".equals(sts) && sts != null) {
			condition.append(" and " + IBOCmGroupSchoolInfoValue.S_Sts + "  like :sts  ");
			paraMap.put("sts", Integer.parseInt(sts));
		}
		condition.append(" and " + IBOCmGroupSchoolInfoValue.S_AuditSts + "  like :auditSts  ");
		paraMap.put("auditSts", 1);
		return BOCmGroupSchoolInfoEngine.getBeans(condition.toString(), paraMap);
	}

	/**
	 * 
	* @Function: CmGroupSchoolInfoDAOImpl.java
	* @Description: 根据学校名称查找学校
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Aug 15, 2012 2:09:08 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 15, 2012     suntao6           v1.0.0              修改原因
	 */
	public int getCampusSchoolByName(String schoolName) throws Exception {

		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (!"".equals(schoolName) && !"null".equals(schoolName) && schoolName != null) {
			condition.append(" and " + IBOCmGroupSchoolInfoValue.S_SchoolName + "  = :schoolName ");
			paraMap.put("schoolName", schoolName);
		}
		IBOCmGroupSchoolInfoValue[] values = BOCmGroupSchoolInfoEngine.getBeans(condition.toString(), paraMap);
		int count = values.length;
		return count;
	}

	public void modifySsmCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception {
		if (!(campus instanceof DataContainer))
			throw new AIException(CrmLocaleFactory.getResource("SSS0201008"));
		DataContainer dataContainer = (DataContainer) campus;
		if (dataContainer.isModified() == false)
			throw new AIException(CrmLocaleFactory.getResource("SSS0201009"));
		fillLogInfoData((DataContainer) campus);
		BOCmGroupSchoolInfoEngine.save(campus);
	}

	public void deleteSsmCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception {
		campus.setAuditSts(0);// 状态未审核
		campus.setOperType(3);// 操作类型
		BOCmGroupSchoolInfoEngine.save(campus);
	}

	public void batchModifyCampusInfos(IBOCmGroupSchoolInfoValue[] aObj) throws Exception {
		BOCmGroupSchoolInfoEngine.saveBatch(aObj);
	}

	public void batchDeleteSsmCampusInfos(IBOCmGroupSchoolInfoValue[] aObj) throws Exception {
		if (null != aObj) {
			for (int i = 0; i < aObj.length; i++) {
				aObj[i].setSts(3);
				aObj[i].setOperType(3);
				// aObj[i].setState("0");
			}
			batchModifyCampusInfos(aObj);
		}
	}

	public void exeSql(String sql, HashMap map) throws Exception {
		Connection conn = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			ServiceManager.getDataStore().execute(conn, sql, map);
		} finally {
			if (null != conn) {
				conn.close();
			}
		}
	}

	public java.sql.Timestamp getSysDate() throws Exception {
		return BOCmGroupSchoolInfoEngine.getSysDate();
	}

	public void fillLogInfoData(DataContainer data) throws Exception {
		if (null != data) {
			String[] names = data.getPropertyNames();
			for (int i = 0; i < names.length; i++) {

				if ("DONE_DATE".equals(names[i])) {
					data.set("DONE_DATE", ServiceManager.getOpDateTime());
				}
				if ("CREATE_DATE".equals(names[i]) && data.get("CREATE_DATE") == null) {
					data.set("CREATE_DATE", ServiceManager.getOpDateTime());
				}
				if ("OP_ID".equals(names[i]) && null != SessionManager.getUser()) {
					data.set("OP_ID", new BigDecimal(ServiceManager.getUser().getID()));
				}
				if ("CREATE_OPERATOR_ID".equals(names[i]) && null != SessionManager.getUser()) {
					data.set("CREATE_OPERATOR_ID", new BigDecimal(ServiceManager.getUser().getID()));
				}
				if ("STATE".equals(names[i]) && data.get("STATE") == null) {
					data.set("STATE", "1");
				}
				if ("STATE_DATE".equals(names[i]) && data.get("STATE_DATE") == null) {
					data.set("STATE_DATE", ServiceManager.getOpDateTime());
				}
				if ("ORG_ID".equals(names[i]) && null != SessionManager.getUser()) {
					data.set("ORG_ID", new BigDecimal(ServiceManager.getUser().getOrgId()));
				}
				if ("DONE_CODE".equals(names[i]) && data.get("DONE_CODE") == null) {
					data.set("DONE_CODE", "");
				}
			}
		}
	}

	public void modifyCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception {
		String name = campus.getSchoolName();
		int count = getCampusSchoolByName(name);
		if (count <= 1 && campus.isModified()) {
			if (!(campus instanceof DataContainer))
				throw new AIException(CrmLocaleFactory.getResource("SSS0201008"));
			DataContainer dataContainer = (DataContainer) campus;
			if (dataContainer.isModified() == false)
				throw new AIException(CrmLocaleFactory.getResource("SSS0201009"));
			fillLogInfoData((DataContainer) campus);
			// 修改后重置审核状态
			campus.setAuditSts(0);// 修改后审核状态改为未审核
			campus.setAuditId(0L);
			campus.setAuditNote("");
			String regionId = CmCommonUtil.getDefaultRegionId();
			campus.initProperty("REGION_ID", regionId);// 增加区域 add by suntao 2012-12-18 14:13:33
			BOCmGroupSchoolInfoEngine.save(campus);
		} else {
			throw new AIException("School name can not repeat !");
		}
	}

	public void auditCampusinfo(IBOCmGroupSchoolInfoValue campus) throws Exception {

		if (!(campus instanceof DataContainer))
			throw new AIException(CrmLocaleFactory.getResource("SSS0201008"));
		DataContainer dataContainer = (DataContainer) campus;
		String regionId = CmCommonUtil.getDefaultRegionId();
		dataContainer.initProperty("REGION_ID", regionId);// 增加区域 add by suntao 2012-12-18 14:13:33
		// if (dataContainer.isModified() == false)
		// throw new AIException(CrmLocaleFactory.getResource("SSS0201009"));
		// ActionUtil.fillLogInfoData((DataContainer)campus);
		// campus.setOperType(1);//修改
		// campus.setAuditSts(1);//修改后审核状态改为未审核
		BOCmGroupSchoolInfoEngine.save(campus);
	}

}
