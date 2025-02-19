package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmGroupMultipleImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmGroupMtparchRelaEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupMtparchRelaValue;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupMultipleSV;

public class CmGroupMultipleSVImpl implements ICmGroupMultipleSV {

	public int queryGroupMultipleCount(String criteria) throws Exception 
	{
		return ((AbstractCmGroupMultipleImpl) CmServiceFactory.getBusiMode(AbstractCmGroupMultipleImpl.class)).queryCount(criteria);
	}

	public DataContainer[] queryGroupMultiple(String criteria, int startNum,int endNum) throws Exception 
	{
		return ((AbstractCmGroupMultipleImpl)CmServiceFactory.getBusiMode(AbstractCmGroupMultipleImpl.class)).queryData(criteria, startNum, endNum);
	}
	
	public void saveGroupMultiple(DataContainer[] values) throws Exception {

		((AbstractCmGroupMultipleImpl) CmServiceFactory.getBusiMode(AbstractCmGroupMultipleImpl.class)).saveGroupMultiple(values);

	}

	public int queryGroupMulArchivesCount(String criteria) throws Exception {
		Map map=new HashMap<String, String>();
		map.put("GROUP_MTP_ID", criteria);
		return ((AbstractCmGroupMultipleImpl) CmServiceFactory.getBusiMode(AbstractCmGroupMultipleImpl.class)).
		queryCount(ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.QBOGroupMulArchivesBean", map));
	}

	public DataContainer[] queryGroupMulArchives(String criteria, int startNum,
			int endNum) throws Exception {
		Map map=new HashMap<String, String>();
		map.put("GROUP_MTP_ID", criteria);
	//	System.out.println("criteria================"+criteria);
	//	System.out.println("\n\n\n"+ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.QBOGroupMulArchivesBean", map)+"\n\n");
		return ((AbstractCmGroupMultipleImpl)CmServiceFactory.getBusiMode(AbstractCmGroupMultipleImpl.class)).
		queryData(ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.QBOGroupMulArchivesBean", map), startNum, endNum);
	}

	public void saveGroupMtparchRela(DataContainer[] values) throws Exception {
   ((AbstractCmGroupMultipleImpl) CmServiceFactory.getBusiMode(AbstractCmGroupMultipleImpl.class)).saveGroupMtparchRela(values);		
	}

	public DataContainer[] queryGroupMultipleDtl(String criteria) throws Exception {
		Map map=new HashMap<String, String>();
		map.put("GROUP_MTP_ID", criteria);
//		map.put("REGION_CODE", criteria);
		return ((AbstractCmGroupMultipleImpl)CmServiceFactory.getBusiMode(AbstractCmGroupMultipleImpl.class)).
		queryData(ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCmGroupMultipleDtlBean", map), -1, -1);
	}

	public int checkGroupMtparchRela(String groupMtpId, String groupSeq) throws Exception {
	 StringBuilder condition = new StringBuilder();
	 HashMap paraMap = new HashMap();
	 condition.append(" 1=1 ");
	 if(!"".equals(groupMtpId)&&!"null".equals(groupMtpId)&&groupMtpId!=null){
	  condition.append(" and "+IBOCmGroupMtparchRelaValue.S_GroupMtpId + "  = :groupMtpId ");
	  paraMap.put("groupMtpId", groupMtpId);
	 }
	 if(!"".equals(groupSeq)&&!"null".equals(groupSeq)&&groupSeq!=null){
		  condition.append(" and "+IBOCmGroupMtparchRelaValue.S_GroupSeq + "  = :groupSeq ");
		  paraMap.put("groupSeq", groupSeq);
		 }
	 IBOCmGroupMtparchRelaValue[] values = BOCmGroupMtparchRelaEngine.getBeans(condition.toString(),paraMap);
	 int count = values.length;
	 return count;
    }

}
