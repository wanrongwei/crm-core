package com.asiainfo.crm.cm.common.service.interfaces;

import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupSchoolInfoValue;


public interface ICmCampusInfoSV {
	
	public IBOCmGroupSchoolInfoValue[] queryCampusinfos(String schoolname,String property,
			String schooltype,String sts,String dept,String schoolid,String regioncode,
			String countycode,int $STARTROWINDEX, int $ENDROWINDEX)throws Exception;

	public int queryCmGroupSchoolCount(String schoolname,String property,String schooltype,
			String sts,String dept,String schoolid,String regioncode,String countycode) 
			throws Exception;
	
	public IBOCmGroupSchoolInfoValue queryCampusinfoBySchoolId(String schoolId) throws Exception;
	
	public void saveCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception;
	
	public boolean deleteCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception;
	
	public boolean deleteSsmCampusInfos(IBOCmGroupSchoolInfoValue[] campus) throws Exception;
	
	public IBOCmGroupSchoolInfoValue[] getCampusSchoolName(String sts) throws Exception;
	
	public boolean auditCampusinfo(IBOCmGroupSchoolInfoValue campus) throws Exception;
	
	public boolean modifyCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception;
	
}
