package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustAttrEngine;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupRelIndustryEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupCustAttrDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;

public class CmGroupCustAttrDAOImpl implements ICmGroupCustAttrDAO
{

	public IBOCmGroupCustAttrValue[] queryGroupCustAttrsByGroupId(long groupCustId)  throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmGroupCustAttrValue.S_CustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmGroupCustAttrValue.S_State).append(" =:state ");
		parameterMap.put("state",CmxConstants.RECORD_STATE_USE);
		return BOCmGroupCustAttrEngine.getBeans(condition.toString(),parameterMap);
	}
	
	public void saveGroupCustAttr(IBOCmGroupCustAttrValue[] cmGroupCustAttrs) throws Exception{
		BOCmGroupCustAttrEngine.saveBatch(cmGroupCustAttrs);
	}
	
	public void saveGroupCustAttr(IBOCmGroupCustAttrValue cmGroupCustAttr) throws Exception{
		BOCmGroupCustAttrEngine.save(cmGroupCustAttr);
	}

	public IBOCmGroupCustAttrValue queryGroupCustAttr(long groupCustId, String attrCode) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition = condition.append(IBOCmGroupCustAttrValue.S_CustId).append(" = :groupCustId ");
		parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmGroupCustAttrValue.S_State).append(" =:state ");
		parameterMap.put("state",CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustAttrValue.S_AttrCode).append(" =:attrCode ");
		parameterMap.put("attrCode",attrCode);
		IBOCmGroupCustAttrValue[] values = BOCmGroupCustAttrEngine.getBeans(condition.toString(),parameterMap);
		if(values != null && values.length > 0){
			return values[0];
		}
		return null;
	}
	
	/**   
	* @Function: saveGroupRelIndustry
	* @Description: 保存集团客户的行业
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: zhuyy
	* @date:Sept 1, 2014 17:10:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sept 1, 2014    zhuyy           v1.0.0               修改原因
	*/
	public void saveGroupRelIndustry(IBOCmGroupRelIndustryValue[] cmGroupRelIndustry) throws Exception {
		BOCmGroupRelIndustryEngine.save(cmGroupRelIndustry);
	}
}
