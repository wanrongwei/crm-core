  /**   
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: DefaultCustRelQueryBusiModelImpl.java
	* @Description: 该类的功能描述
	*
	* @version: v1.0.0
	* @author: LSC
	* @date: 2012-4-11 下午5:34:39 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-4-11     LSC           v1.0.0                                修改原因
	*/


package com.asiainfo.crm.cm.busimodel.impl.defaults;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustRelQueryBusiModelImpl;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;

public class DefaultCustRelQueryBusiModelImpl extends AbstractCustRelQueryBusiModelImpl {

	
	
	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		return null;
	}

	@Override
	protected void afterQueryGroupMember(ICustRelationshipValue custRelValue, IBOCmGroupMemberValue groupMemValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
