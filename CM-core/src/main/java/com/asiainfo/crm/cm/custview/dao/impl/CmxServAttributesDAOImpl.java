/**   
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: CmxServAttributesDAOImpl.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: huangxl
* @date: 2012-4-9 下午08:20:28 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2012-4-9     huangxl           v1.0.0               修改原因
*/
package com.asiainfo.crm.cm.custview.dao.impl;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.crm.cm.custview.bo.BOCmxServAttributesEngine;
import com.asiainfo.crm.cm.custview.dao.interfaces.ICmxServAttributesDAO;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmxServAttributesValue;

/**
 * @author huangxl
 *
 *
 * @version: v1.0.0
 * @author: huangxl
 * @date: 2012-4-9 下午08:20:28 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2012-4-9     huangxl           v1.0.0               修改原因
 */
public class CmxServAttributesDAOImpl implements ICmxServAttributesDAO {
	
	public IBOCmxServAttributesValue[] queryServAttributeByCustId(long custId) throws Exception{
		StringBuilder condition = new StringBuilder(" 1 = 1");
		HashMap paraMap = new HashMap();
		if(custId > 0){
			condition.append(" and ").append(IBOCmxServAttributesValue.S_ServAttribute).append(" = :custId");
			paraMap.put("custId", custId);
		}
		condition.append(" and ").append(IBOCmxServAttributesValue.S_State).append(" = 'U'");
		return BOCmxServAttributesEngine.getBeans(condition.toString(), paraMap);
		
	}

	/* (non-Javadoc)
	 * @see com.asiainfo.bj.cm.club.dao.interfaces.ICmxServAttributesDAO#getNewId()
	 */
	public BigDecimal getNewId() throws Exception {
		return BOCmxServAttributesEngine.getNewId();
	}

	/* (non-Javadoc)
	 * @see com.asiainfo.bj.cm.club.dao.interfaces.ICmxServAttributesDAO#queryCmxServAttributes(java.lang.String, java.lang.String, int, int)
	 */
	public IBOCmxServAttributesValue[] queryCmxServAttributes(String billId,
			String servAttributes, int startNum, int endNum) throws Exception {
		Map condMap = this.createCond(billId, servAttributes);
		return BOCmxServAttributesEngine.getBeans(null, condMap.get("condition").toString(), (HashMap)condMap.get("paraMap"), startNum, endNum, false);
	}

	/* (non-Javadoc)
	 * @see com.asiainfo.bj.cm.club.dao.interfaces.ICmxServAttributesDAO#queryCmxServAttributesCount(java.lang.String, java.lang.String)
	 */
	public int queryCmxServAttributesCount(String billId, String servAttributes)
			throws Exception {
		Map condMap = this.createCond(billId, servAttributes);
		return BOCmxServAttributesEngine.getBeansCount(condMap.get("condition").toString(), (HashMap)condMap.get("paraMap"));
	}

	/* (non-Javadoc)
	 * @see com.asiainfo.bj.cm.club.dao.interfaces.ICmxServAttributesDAO#saveCmxServAttributes(com.asiainfo.bj.cm.club.ivalues.IBOCmxServAttributesValue[])
	 */
	public void saveCmxServAttributes(IBOCmxServAttributesValue[] infoValues)
			throws Exception {
		if(infoValues != null){
			if(infoValues.length == 1){
				BOCmxServAttributesEngine.save(infoValues[0]);
			}else{
				BOCmxServAttributesEngine.saveBatch(infoValues);
			}
		}	
	}

	private Map createCond(String billId,String servAttributes) throws Exception{
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" and ").append(IBOCmxServAttributesValue.S_State).append(" = 'U' ");
		HashMap paraMap = new HashMap();
		if(StringUtils.isNotBlank(billId)){
			condition.append(" and ").append(IBOCmxServAttributesValue.S_BillId).append(" = :billId ");
			paraMap.put("billId", billId);
		}
		if(StringUtils.isNotBlank(servAttributes)){
			condition.append(" and ").append(IBOCmxServAttributesValue.S_ServAttributeDesc).append(" like :servAttributes ");
			paraMap.put("servAttributes", "%"+servAttributes+"%");
		}
		Map map = new HashMap();
		map.put("condition", condition);
		map.put("paraMap", paraMap);
		return map;
	}
	
	public IBOCmxServAttributesValue[] queryCmxServAttributesByAttribute(
			String servAttribute) throws RemoteException,Exception{
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" and ").append(IBOCmxServAttributesValue.S_State).append(" = 'U' ");
		HashMap paraMap = new HashMap();
		if(StringUtils.isNotBlank(servAttribute)){
			condition.append(" and ").append(IBOCmxServAttributesValue.S_ServAttributeDesc).append(" like :servAttribute ");
			paraMap.put("servAttribute", "%"+servAttribute);
		}
		return BOCmxServAttributesEngine.getBeans(condition.toString(), paraMap);
	}
}
