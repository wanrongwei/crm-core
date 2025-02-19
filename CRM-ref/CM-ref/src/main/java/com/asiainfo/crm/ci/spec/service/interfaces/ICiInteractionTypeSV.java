package com.asiainfo.crm.ci.spec.service.interfaces;

import com.asiainfo.crm.ci.spec.ivalues.IBOCiInteractionAttrValue;
import com.asiainfo.crm.ci.spec.ivalues.IBOCiInteractionCategoryValue;
import com.asiainfo.crm.ci.spec.ivalues.IBOCiInteractionTypeValue;

public interface ICiInteractionTypeSV {

	public IBOCiInteractionTypeValue saveInteractionType(IBOCiInteractionTypeValue iboCiInteractionTypeValue) throws Exception;
	public IBOCiInteractionTypeValue[] getCiInteractionTypes() throws Exception;
	public void delInterTypeById(long interTypeId) throws Exception;
	public IBOCiInteractionAttrValue[] getCiInteractionAttr() throws Exception;
	public IBOCiInteractionAttrValue saveInteractionAttr(IBOCiInteractionAttrValue value) throws Exception;
	public void delInterAttrById(long interAttrId) throws Exception;
	public IBOCiInteractionTypeValue getCiInteractionTypeById(String interTypeId) throws Exception;
	public IBOCiInteractionAttrValue getCiInteractionAttrById(String interAttrId) throws Exception;
	public IBOCiInteractionCategoryValue getCiInteractionCategoryById(String interCategoryId) throws Exception;
	public IBOCiInteractionCategoryValue[] acquireChildNodes(long interactionCategoryId)throws Exception;
	public long getInteractionCategoryOfOperation()throws Exception;
	public void delInterCategory(Long interCategoryId) throws Exception;
	public IBOCiInteractionCategoryValue saveInteractionCategory(IBOCiInteractionCategoryValue interactionCategoryValue) throws Exception;
	public IBOCiInteractionAttrValue[] getCiInteractionAttrByTypeId(String interTypeId,int startIndex, int endIndex) throws Exception; 
	public IBOCiInteractionTypeValue[] getInterTypesByCateId(String categoryId,int startIndex, int endIndex) throws Exception;
	public int getInterTypeCounts(String categoryId) throws Exception;
	public int getInterAttrCounts(String interTypeId) throws Exception;

	
	public IBOCiInteractionTypeValue getCiInteractionTyleBySrcSysType(String srcSysId,String srcTypeId) throws Exception;
	public IBOCiInteractionTypeValue[] getCiInteractionTyleBySrcSys(String srcSysId) throws Exception;
}
