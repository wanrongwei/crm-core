package com.asiainfo.crm.cm.common.service.impl;


import java.util.HashMap;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmGroupSchoolInfoDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupSchoolInfoValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCampusInfoSV;

public class CmCampusInfoSVImpl implements ICmCampusInfoSV{


	public int queryCmGroupSchoolCount(String schoolname, String property,
			String schooltype, String sts, String dept,String schoolid,String regioncode,String countycode) throws Exception {
		ICmGroupSchoolInfoDAO dao = (ICmGroupSchoolInfoDAO) ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
//		Integer proper = new Integer(property);
//		Integer type = new Integer(schooltype);
//		Integer state = new Integer(sts);
//		Integer dp = new Integer(dept);
//		return dao.queryCampusCount(schoolname,proper.intValue(),type.intValue(),state.intValue(),dp.intValue());
		return dao.queryCampusCount(schoolname,property,schooltype,sts,dept,schoolid,regioncode,countycode);
	}
	public IBOCmGroupSchoolInfoValue[] queryCampusinfos(String schoolname,
			String property, String schooltype, String sts, String dept,String schoolid,String regioncode,String countycode,
			int start, int end) throws Exception {
		ICmGroupSchoolInfoDAO dao = (ICmGroupSchoolInfoDAO) ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
//		Integer proper = new Integer(property);
//		Integer type = new Integer(schooltype);
//		Integer state = new Integer(sts);
//		Integer dp = new Integer(dept);
		return dao.queryCampusInfo(schoolname,property, schooltype,sts,dept,schoolid,regioncode,countycode,
				start,end);
	}

	public IBOCmGroupSchoolInfoValue queryCampusinfoBySchoolId(
			String schoolId) throws Exception {
		// TODO Auto-generated method stub
		ICmGroupSchoolInfoDAO dao = (ICmGroupSchoolInfoDAO)ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
		Long shool = new Long(schoolId);
		return dao.queryCampusinfoBySchoolId(shool.longValue());
	}
	public void saveCampusInfo(IBOCmGroupSchoolInfoValue campus)
			throws Exception {
		ICmGroupSchoolInfoDAO dao = (ICmGroupSchoolInfoDAO)ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
		dao.saveCampusInfo(campus);
		
	}
	public IBOCmGroupSchoolInfoValue[] getCampusSchoolName(String sts)
			throws Exception {
		ICmGroupSchoolInfoDAO dao = (ICmGroupSchoolInfoDAO) ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
		return dao.getCampusSchoolName(sts);
	}

	public boolean deleteCampusInfo(IBOCmGroupSchoolInfoValue campus) throws Exception
	{
		ICmGroupSchoolInfoDAO idao =(ICmGroupSchoolInfoDAO) ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
        idao.deleteSsmCampusInfo(campus);
        return true;
	}
	public boolean deleteSsmCampusInfos(IBOCmGroupSchoolInfoValue[] campus)
			throws Exception {
		ICmGroupSchoolInfoDAO idao =(ICmGroupSchoolInfoDAO) ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
        StringBuffer sb = new StringBuffer();
        StringBuffer sbstr = new StringBuffer();
			//log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+campus.toString());
        for (int i = 0; i < campus.length; i++) {
            if(i>0)
            {
                sbstr.append(",");
            }
           sbstr.append(campus[i].getSchoolId());
        }
        sb.append("DELETE FROM CM_GROUP_SCHOOL_INFO").append(" WHERE SCHOOL_ID IN").append(" (").append(sbstr).append(" )");
        idao.exeSql(sb.toString(),null);
		
//		idao.batchDeleteSsmCampusInfos(campus);
        return true;
	}
	
	//校园信息审核
	public boolean auditCampusinfo(IBOCmGroupSchoolInfoValue campus) throws Exception {
		ICmGroupSchoolInfoDAO idao =(ICmGroupSchoolInfoDAO) ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
		idao.auditCampusinfo(campus);
		return true;
	}
	
	
	public boolean modifyCampusInfo(IBOCmGroupSchoolInfoValue campus)
			throws Exception {
		ICmGroupSchoolInfoDAO idao =(ICmGroupSchoolInfoDAO) ServiceFactory.getService(ICmGroupSchoolInfoDAO.class);
		idao.modifyCampusInfo(campus);
		return true;
	}
}
