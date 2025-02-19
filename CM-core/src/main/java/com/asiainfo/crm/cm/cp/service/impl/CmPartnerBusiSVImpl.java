package com.asiainfo.crm.cm.cp.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.secframe.client.OrgmodelClient;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmPartnerArchivesImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.cp.dao.interfaces.ICmPartnerBusiInfoDAO;
import com.asiainfo.crm.cm.cp.dao.interfaces.ICmPartnerInfoDAO;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IQBOCmPartnerInfoValue;
import com.asiainfo.crm.cm.cp.service.interfaces.ICmPartnerBusiSV;

public class CmPartnerBusiSVImpl implements ICmPartnerBusiSV{

	public int queryMPartnerCount(String partnerTypeDtl, String partnerType,
			String statusType, String typeDesc) throws Exception {
		ICmPartnerBusiInfoDAO dao = (ICmPartnerBusiInfoDAO) ServiceFactory.getService(ICmPartnerBusiInfoDAO.class);
		return dao.queryPartnerCount(partnerTypeDtl, partnerType, statusType, typeDesc);
	}

	public IQBOCmPartnerInfoValue[] queryMPartnerInfo(String partnerTypeDtl,
			String partnerType, String statusType, String typeDesc, int start,
			int end) throws Exception {
		ICmPartnerBusiInfoDAO dao = (ICmPartnerBusiInfoDAO) ServiceFactory.getService(ICmPartnerBusiInfoDAO.class);
		return dao.queryPartnerInfo(partnerTypeDtl, partnerType, statusType, typeDesc, start, end);
	}

	public int querySPartnerCount(String partnerTypeDtl, String partnerType,
			String statusType, String siIntroNum) throws Exception {
		ICmPartnerInfoDAO dao = (ICmPartnerInfoDAO) ServiceFactory.getService(ICmPartnerInfoDAO.class);
		return dao.queryPartnerCount(partnerTypeDtl, partnerType, statusType, siIntroNum);
	}

	public int querySPartnerCount(String partnerTypeDtl, String partnerType,
			String siIntroNum) throws Exception {
		ICmPartnerInfoDAO dao = (ICmPartnerInfoDAO) ServiceFactory.getService(ICmPartnerInfoDAO.class);
		return dao.queryPartnerCount(partnerTypeDtl, partnerType, null, siIntroNum);
	}

	public IBOCmPartnerInfoValue[] querySPartnerInfo(String partnerTypeDtl,
			String partnerType, String statusType, String siIntroNum,
			int start, int end) throws Exception {
		ICmPartnerInfoDAO dao = (ICmPartnerInfoDAO) ServiceFactory.getService(ICmPartnerInfoDAO.class);
		return dao.queryPartnerInfo(partnerTypeDtl, partnerType, statusType, siIntroNum, start, end);
	}

	public IBOCmPartnerInfoValue[] querySPartnerInfo(String partnerTypeDtl,
			String partnerType, String siIntroNum, int start, int end)
			throws Exception {
		ICmPartnerInfoDAO dao = (ICmPartnerInfoDAO) ServiceFactory.getService(ICmPartnerInfoDAO.class);
		return dao.queryPartnerInfo(partnerTypeDtl, partnerType, null, siIntroNum, start, end);
	}

	public DataContainer[] queryPartnerArchives(String criteria, int startNum,
			int endNum) throws Exception {
		return ((AbstractCmPartnerArchivesImpl)CmServiceFactory.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryData(criteria, startNum, endNum);
	}

	public int queryPartnerArchivesCount(String criteria) throws Exception {
		return ((AbstractCmPartnerArchivesImpl) CmServiceFactory.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryCount(criteria);
	}

	public void savePartnerArchives(DataContainer[] values) throws Exception {
		 ((AbstractCmPartnerArchivesImpl) CmServiceFactory.getBusiMode(AbstractCmPartnerArchivesImpl.class)).savePartnerArchives(values);
		
	}

	public DataContainer[] queryPartnerServiceArchives(String criteria,
			int startNum, int endNum) throws Exception {
		return ((AbstractCmPartnerArchivesImpl)CmServiceFactory.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryData(criteria, startNum, endNum);
	}

	public int queryPartnerServiceArchivesCount(String criteria)
			throws Exception {
		return ((AbstractCmPartnerArchivesImpl) CmServiceFactory.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryCount(criteria);
	}

	public void savePartnerServiceArchives(DataContainer[] values)
			throws Exception {
		 ((AbstractCmPartnerArchivesImpl) CmServiceFactory.getBusiMode(AbstractCmPartnerArchivesImpl.class)).savePartnerServiceArchives(values);
		
	}

	public void savePartnerServiceAgentArchives(DataContainer[] values) throws Exception {
		((AbstractCmPartnerArchivesImpl) CmServiceFactory.getBusiMode(AbstractCmPartnerArchivesImpl.class)).savePartnerServiceAgentArchives(values);
		
	}

	public DataContainer[] getOrgByParams(String orgId, String orgName,
			String orgRoleTypeId, String subOrgRoleTypeId, String districtId,
			String countyId, String owerArea, int startNum, int endNum)
			throws Exception {
		return (DataContainer[]) OrgmodelClient.getOrgByParams(orgId, orgName, orgRoleTypeId, subOrgRoleTypeId, districtId, countyId, owerArea, startNum, endNum);
	}

	public int getOrgCountByParams(String orgId, String orgName,
			String orgRoleTypeId, String subOrgRoleTypeId, String districtId,
			String countyId, String owerArea) throws Exception {
		return OrgmodelClient.getOrgCountByParams(orgId, orgName, orgRoleTypeId, subOrgRoleTypeId, districtId, countyId, owerArea, 0, 0);
	}

	public IBOCmAgentPartnerInfoValue[] findPartnerAndAgent(String partner,
			String channel, String city) throws Exception {
		ICmPartnerInfoDAO dao = (ICmPartnerInfoDAO) ServiceFactory.getService(ICmPartnerInfoDAO.class);
		return dao.findPartnerAndAgent(partner, channel, city);
	}

}
