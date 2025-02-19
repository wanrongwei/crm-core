package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.bo.BOCmMapRegionTreeEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOCmMapRegionTreeValue;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmRegionGroupInfoEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOSignCoverCountEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOTownTypeCountEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupNewCountrySideDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmRegionGroupInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOSignCoverCountValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOTownTypeCountValue;

public class CmGroupNewCountrySideDAOImpl implements ICmGroupNewCountrySideDAO
{
	public IBOCmMapRegionTreeValue queryMapRegionTreeByLocationId(long locationId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmMapRegionTreeValue.S_LocationId).append("=:locationId");
		parameterMap.put("locationId", Long.valueOf(locationId));
		IBOCmMapRegionTreeValue[] mapRegionTrees =BOCmMapRegionTreeEngine.getBeans(condition.toString(),parameterMap);
		return (mapRegionTrees.length==0)?null:mapRegionTrees[0];
	}
	
	public IBOCmMapRegionTreeValue[] queryMapRegionTreesByParentLocationId(long parentLocationId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmMapRegionTreeValue.S_ParentLocationId).append("=:parentLocationId");
		parameterMap.put("parentLocationId", Long.valueOf(parentLocationId));
		condition.append(" AND ");
		condition.append(IBOCmMapRegionTreeValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" ORDER BY ");
		condition.append(IBOCmMapRegionTreeValue.S_LocationId);
		return BOCmMapRegionTreeEngine.getBeans(condition.toString(),parameterMap);
	}
	
	public void saveMapRegionTree(IBOCmMapRegionTreeValue mapRegionTree) throws Exception
	{
		BOCmMapRegionTreeEngine.save(mapRegionTree);
	}
	
	public long queryMapRegionTreeCountByParentLocationId(long parentLocationId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmMapRegionTreeValue.S_ParentLocationId).append("=:parentLocationId");
		parameterMap.put("parentLocationId", Long.valueOf(parentLocationId));
		condition.append(" AND ");
		condition.append(IBOCmMapRegionTreeValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmMapRegionTreeEngine.getBeansCount(condition.toString(),parameterMap);
	}
	
	public long createMapRegionTree(IBOCmMapRegionTreeValue mapRegionTree) throws Exception{
		mapRegionTree.setState(CmxConstants.RECORD_STATE_USE);
		 BOCmMapRegionTreeEngine.save(mapRegionTree);
		 return mapRegionTree.getLocationId();
	}
	
	public void updateMapRegionTree(IBOCmMapRegionTreeValue mapRegionTree) throws Exception{
		 BOCmMapRegionTreeEngine.save(mapRegionTree);
	}
	
	public void deleteMapRegionTree(IBOCmMapRegionTreeValue mapRegionTree)  throws Exception{
		mapRegionTree.setStsToOld();
		mapRegionTree.setState(CmxConstants.RECORD_STATE_DEL);
		BOCmMapRegionTreeEngine.save(mapRegionTree);
	}
	
	public IQBOSignCoverCountValue[] querySignCoverCounts(long locationId,long locationType) throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		parameterMap.put("locationId", Long.valueOf(locationId));
		parameterMap.put("locationType", Long.valueOf(locationType));
		return QBOSignCoverCountEngine.getBeans(condition.toString(),parameterMap);
	}
	
	public IQBOTownTypeCountValue[] queryTownTypeCounts(long locationId) throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		parameterMap.put("location_id", Long.valueOf(locationId));
		return QBOTownTypeCountEngine.getBeans(condition.toString(),parameterMap);
	}
	
	public IQBOCmRegionGroupInfoValue[] queryRegionGroupCustInfo(String condition,Map parameterMap,int start,int end) throws Exception{
		return QBOCmRegionGroupInfoEngine.getBeans(null,condition,parameterMap,start,end,false);
	}
	
	public int queryRegionGroupCustInfoCount(String condition,Map parameterMap) throws Exception{
		return QBOCmRegionGroupInfoEngine.getBeansCount(condition,parameterMap);
	}
}
