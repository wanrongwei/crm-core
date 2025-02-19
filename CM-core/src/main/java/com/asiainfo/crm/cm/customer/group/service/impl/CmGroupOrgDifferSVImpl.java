package com.asiainfo.crm.cm.customer.group.service.impl;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupOrgDifferDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupOrgDifferSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupOrgDifferValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;


public class CmGroupOrgDifferSVImpl implements ICmGroupOrgDifferSV {
	
	public IQBOCmGroupOrgDifferValue[] queryGroupOrgDiffers(long custId, int startNum, int endNum) throws Exception {
		//IQBOCmGroupOrgDifferValue[] differs = ((ICmGroupOrgDifferDAO) ServiceFactory.getService(ICmGroupOrgDifferDAO.class)).queryGroupOrgDiffers(custId, startNum, endNum);	
		IQBOCmGroupOrgDifferValue[] differs = ((ICmGroupOrgDifferDAO) ServiceFactory.getService(ICmGroupOrgDifferDAO.class)).queryGroupOrgDiffersByCustId(custId, startNum, endNum);	
		ICmGroupCustomerSV cICmGroupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		if(differs != null && differs.length > 0){
			for(int i=0; i<differs.length; i++){
				IQBOCmGroupOrgDifferValue differ = differs[i];
				StringBuffer parentDeptNameOld = new StringBuffer();
				if(differ.getParentCustId() > 0){	
					parentDeptNameOld.append("<a href='javascript:void(0)' class='cellpath' onclick='popUpCust(");
					parentDeptNameOld.append(differ.getParentCustId());
					parentDeptNameOld.append(")' style='color:blue;margin-left:5px;text-decoration:underline'>");
					if(StringUtils.isNotBlank(differ.getParentDeptNameOld())){
						parentDeptNameOld.append(DataType.getAsString(differ.getParentDeptNameOld()));
					} else {
						IBOCmGroupCustomerValue value = cICmGroupCustomerSV.queryGroupCustomerById(differ.getParentCustId());
						if(value != null){						
							parentDeptNameOld.append(DataType.getAsString(value.getCustName()));
						}		
					}
					parentDeptNameOld.append("</a>");		
				}
				StringBuffer parentDeptNameNew = new StringBuffer();
				if(differ.getImportParentCustId() > 0){
					parentDeptNameNew.append("<a href='javascript:void(0)' class='cellpath' onclick='popUpCust(");
					parentDeptNameNew.append(differ.getImportParentCustId());
					parentDeptNameNew.append(")' style='color:blue;margin-left:5px;text-decoration:underline'>");
					if(StringUtils.isNotBlank(differ.getParentDeptNameNew())){
						parentDeptNameNew.append(DataType.getAsString(differ.getParentDeptNameNew()));
					} else {
						IBOCmGroupCustomerValue value = cICmGroupCustomerSV.queryGroupCustomerById(differ.getImportParentCustId());
						if (value != null) {							
							parentDeptNameNew.append(DataType.getAsString(value.getCustName()));
						}
					}					
					parentDeptNameNew.append("</a>");		
				}				
				differ.setParentDeptNameOld(parentDeptNameOld.toString());
				differ.setParentDeptNameNew(parentDeptNameNew.toString());
			}
		}
		return 	differs;
	}
	
	public int queryGroupOrgDifferCount(long custId)throws Exception {
		return ((ICmGroupOrgDifferSV) ServiceFactory.getService(ICmGroupOrgDifferSV.class)).queryGroupOrgDiffers(custId, -1, -1).length;
	}
	
	public void importGroupOrgDiffer(BOCmGroupOrgStructBean[] orgStruct, BOCmGroupOrgDifferBean[] orgDiffer)throws Exception {
		if (null == orgStruct) {
			ExceptionUtil.throwBusinessException("CMS0403001", "IBOCmGroupOrgStructValue");
		}
		if (null == orgDiffer) {
			ExceptionUtil.throwBusinessException("CMS0403001", "IBOCmGroupOrgDifferValue");
		}
		ICmGroupOrgDifferDAO dao = (ICmGroupOrgDifferDAO) ServiceFactory.getService(ICmGroupOrgDifferDAO.class);
		dao.saveOrgDiffer(orgStruct, orgDiffer);
	}
}
