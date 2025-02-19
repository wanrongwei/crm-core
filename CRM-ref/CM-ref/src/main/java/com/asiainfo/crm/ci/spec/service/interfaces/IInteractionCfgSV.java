package com.asiainfo.crm.ci.spec.service.interfaces;

import com.asiainfo.crm.ci.spec.ivalues.IBOCiInteractionAttrValue;
import com.asiainfo.crm.ci.spec.ivalues.IBOCiInteractionCategoryValue;
import com.asiainfo.crm.ci.spec.ivalues.IBOCiInteractionTypeValue;


/**
 * 
 * @author wangql2
 *
 */
public interface IInteractionCfgSV{
	public IBOCiInteractionTypeValue[] getAllCiInteractionTyles() throws Exception;
	
	public IBOCiInteractionAttrValue[] getAllCiInteractionAttrs() throws Exception;

	public IBOCiInteractionCategoryValue[] getAllCiInteractionCategorys() throws Exception;
	
	public IBOCiInteractionTypeValue getCiInteractionTyleById(long interactionTypeId) throws Exception;
	
}
