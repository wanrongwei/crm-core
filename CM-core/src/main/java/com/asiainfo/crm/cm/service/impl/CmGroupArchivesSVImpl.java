package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmGroupArchivesImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOFactoryInfoEngine;
import com.asiainfo.crm.cm.common.bo.BOGroupArchivesEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOFactoryInfoValue;
import com.asiainfo.crm.cm.common.ivalues.IBOGroupArchivesValue;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupArchivesSV;

public class CmGroupArchivesSVImpl implements ICmGroupArchivesSV {

	public int queryGroupArchivesCount(String criteria) throws Exception 
	{
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		dcs[0].initProperty("MATCH_TYPE", "1");
		return ((AbstractCmGroupArchivesImpl) CmServiceFactory.getBusiMode(AbstractCmGroupArchivesImpl.class)).queryCount(dcs);
	}

	public DataContainer[] queryGroupArchives(String criteria, int startNum,int endNum) throws Exception 
	{
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		//MATCH_TYPE = "2" 会全部匹配
		dcs[0].initProperty("MATCH_TYPE", "1");
		return ((AbstractCmGroupArchivesImpl)CmServiceFactory.getBusiMode(AbstractCmGroupArchivesImpl.class)).queryData(dcs, startNum, endNum);
	}
	
	public void saveGroupArchives(DataContainer[] values) throws Exception {

		((AbstractCmGroupArchivesImpl) CmServiceFactory.getBusiMode(AbstractCmGroupArchivesImpl.class)).saveGroupArchives(values);

	}

	public IBOGroupArchivesValue[] getGroupArchivesByGroupSeq(String groupSeq)throws Exception {
		 StringBuilder condition = new StringBuilder();
		 HashMap paraMap = new HashMap();
		 condition.append(" 1=1 ");
		 if(!"".equals(groupSeq)&&!"null".equals(groupSeq)&&groupSeq!=null){
		  condition.append(" and "+IBOGroupArchivesValue.S_GroupSeq + "  = :groupSeq ");
		  paraMap.put("groupSeq", groupSeq);
		 }
		 IBOGroupArchivesValue[] values = BOGroupArchivesEngine.getBeans(condition.toString(),paraMap);
		 return values;
	    }

	public boolean queryGroupArchivesById(String groupSeq) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		boolean rst = false;
		if(!"".equals(groupSeq)&&!"null".equals(groupSeq)&&groupSeq!=null){
			condition.append(" and "+IBOGroupArchivesValue.S_GroupSeq + "  = :groupSeq ");
			paraMap.put("groupSeq", groupSeq);
		}
		IBOGroupArchivesValue[] values = BOGroupArchivesEngine.getBeans(condition.toString(),paraMap);
			 
		if(null != values && !"".equals(values) && 0 != values.length){
			rst = true;
		}
		return rst;
	}

}
