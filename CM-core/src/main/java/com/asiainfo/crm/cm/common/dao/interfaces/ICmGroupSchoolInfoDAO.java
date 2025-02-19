package com.asiainfo.crm.cm.common.dao.interfaces;

import java.util.HashMap;

import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupSchoolInfoValue;;

public interface ICmGroupSchoolInfoDAO {
	
	public IBOCmGroupSchoolInfoValue[] queryCampusInfo(String schoolname,String property, 
			String schooltype, String sts, String dept,	String schoolid,String regioncode,
			String countycode,int start, int end) throws Exception;

	public int queryCampusCount(String schoolname,String property,String schooltype,String sts,
			String dept,String schoolid,String regioncode,String countycode) throws Exception;

	public IBOCmGroupSchoolInfoValue queryCampusinfoBySchoolId(long schoolId) throws Exception;
	
	public void saveCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception;
	
	public IBOCmGroupSchoolInfoValue[] getCampusSchoolName(String sts) throws Exception;
	
	public void deleteSsmCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception;
	
	public void batchDeleteSsmCampusInfos(IBOCmGroupSchoolInfoValue[] campus) throws Exception;
	
	public void exeSql(String sql, HashMap map) throws Exception;
	
	public void modifyCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception;
	
	public void auditCampusinfo(IBOCmGroupSchoolInfoValue campus) throws Exception;
}
