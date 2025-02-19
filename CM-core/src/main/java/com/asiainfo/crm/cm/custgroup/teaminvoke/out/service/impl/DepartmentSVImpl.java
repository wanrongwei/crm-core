package com.asiainfo.crm.cm.custgroup.teaminvoke.out.service.impl;


import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.custgroup.teaminvoke.out.service.interfaces.IDepartmentSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustOrganizeBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import org.apache.commons.lang.StringUtils;

public class DepartmentSVImpl implements IDepartmentSV{
	@Override
	public ICustOrganizeValue createDepartment(String name, Long customerId, Long parentId) throws Exception {
		if(customerId == null || customerId == 0l) {
			ExceptionUtil.throwBusinessException("Invaild Parames [customerId]:"+customerId);
		}
		
		if(StringUtils.isEmpty(name)) {
			ExceptionUtil.throwBusinessException("Invaild Parames [name]:"+name);
		}
		
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		if(parentId != null && parentId > 0L) {
			ICustOrganizeValue custOrganizeValue = customerSV.queryDepartmentById(parentId);
			if(custOrganizeValue == null) {
				ExceptionUtil.throwBusinessException("Invaild Parames [parentId]:"+ parentId + " is not found.");
			}else if(custOrganizeValue != null && customerId != custOrganizeValue.getCustId()) {
				ExceptionUtil.throwBusinessException("The parent department can only be changed to one belonging to the same customer.parent department customer is:" + custOrganizeValue.getCustId());
			}
		}else {
			ICustOrganizeValue rootDepartment = customerSV.queryCustRootOrganize(customerId);
			if(rootDepartment != null) {
				ExceptionUtil.throwBusinessException("Root department have already exists. Department Name : "+rootDepartment.getDeptName());
			}else {
				parentId = null;				
			}
		}
		
		name = name.trim();
		
		ICustOrganizeValue[] values = customerSV.listDepartment(customerId,name);
		if (values != null && values.length > 0) {//same depart name
			ExceptionUtil.throwBusinessException("Department name already exists, please rename");
		}
		
		IVOCustValue custValue = new VOCustBean();
		custValue.setBusinessId(CmConstants.BusiLogId.GROUP_ORG_OPER);
		ICustOrganizeValue custOrganizeValue = new CustOrganizeBean();
		custOrganizeValue.setDeptName(name);
		custOrganizeValue.setDeptType(CmConstants.CustomerOrg.DEPARTMENT);
		custOrganizeValue.setCustId(customerId);
		if(parentId != null) {
			custOrganizeValue.setParentDeptId(parentId);			
		}
		custValue.addCustOrganize(custOrganizeValue);
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		
		ICmDkCustomerSV cmDkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		ICustOrganizeValue[] custOrganizeValues = cmDkCustomerSV.listDepartment(customerId,name);
		if(custOrganizeValues != null && custOrganizeValues.length > 0) {
			return custOrganizeValues[0];
		}else {
			ExceptionUtil.throwBusinessException("CreateDepartment with CustomerId:" + customerId + ",name:" + name + ", but it cannot found.");
		}
		
		return null;
	}

	@Override
	public void updateDepartment(Long id, String name, Long parentId) throws Exception {
		if(id == null || id == 0l) {
			ExceptionUtil.throwBusinessException("Invaild Parames [id]:"+id);
		}
		
		if (id.equals(parentId)) {//不能选择当部门织为自己的上级部门
			ExceptionUtil.throwBusinessException("CMS0000309");
		}
		
		if(StringUtils.isEmpty(name) && parentId == null) {
			ExceptionUtil.throwBusinessException("Name and ParentId fields are not allowed to be empty simultaneously.");
		}
		
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		ICustOrganizeValue department = customerSV.queryDepartmentById(id);
		if (department != null) {
			long custId = department.getCustId();
			ICustOrganizeValue rootDepartment = customerSV.queryCustRootOrganize(department.getCustId());
			
			if(StringUtils.isNotEmpty(name) && parentId == null ) {
				name = name.trim();
				if(department.getDeptName().trim().equals(name)) {
					ExceptionUtil.throwBusinessException("Nothing changed.");
				}else {
					if(!department.getDeptName().trim().equals(name)) {
						ICustOrganizeValue[] departments = customerSV.listDepartment(custId,name);
						if (departments != null && departments.length > 0) {//same depart name
							ExceptionUtil.throwBusinessException("Department name already exists, please rename");
						}				
					}
				}
				
			}else if(StringUtils.isEmpty(name) && parentId != null) {
				if(department.getParentDeptId() == parentId) {
					ExceptionUtil.throwBusinessException("Nothing changed.");
				}else {
					if(parentId != null && parentId == 0){
						if(rootDepartment != null) {
							if(rootDepartment.getDeptId() != id) {//不能将子部门跟改为根部门
								ExceptionUtil.throwBusinessException("Root department have already exists. Department Name : "+rootDepartment.getDeptName());
							}else {
								parentId = null;
							}
						}
					}else if(parentId != null && parentId > 0L) {
						//根部门不能移动
						if (rootDepartment != null && rootDepartment.getDeptId() == id){
							ExceptionUtil.throwBusinessException("The root department cannot move");
						}
						ICustOrganizeValue custOrganizeValue = customerSV.queryDepartmentById(parentId);
						if(custOrganizeValue == null) {
							ExceptionUtil.throwBusinessException("Invaild Parames [parentId]:"+ parentId + " is not found.");
						}else if(custOrganizeValue != null && custId != custOrganizeValue.getCustId()) {
							ExceptionUtil.throwBusinessException("The parent department can only be changed to one belonging to the same customer.parent department customer is:" + custOrganizeValue.getCustId()+", department customer is:" + custId);
						}
					} 
				}
			}else if(StringUtils.isNotEmpty(name) && parentId != null) {
				name = name.trim();
				if(department.getDeptName().trim().equals(name) && department.getParentDeptId() == parentId) {
					ExceptionUtil.throwBusinessException("Nothing changed.");
				}else {
					if(parentId != null && parentId == 0){
						if(rootDepartment != null) {
							if(rootDepartment.getDeptId() != id) {//不能将子部门跟改为根部门
								ExceptionUtil.throwBusinessException("Root department have already exists. Department Name : "+rootDepartment.getDeptName());
							}else {
								parentId = null;
							}
						}
					}else if(parentId != null && parentId > 0L) {
						//根部门不能移动
						if (rootDepartment != null && rootDepartment.getDeptId() == id){
							ExceptionUtil.throwBusinessException("The root department cannot move");
						}
						ICustOrganizeValue custOrganizeValue = customerSV.queryDepartmentById(parentId);
						if(custOrganizeValue == null) {
							ExceptionUtil.throwBusinessException("Invaild Parames [parentId]:"+ parentId + " is not found.");
						}else if(custOrganizeValue != null && department.getCustId() != custOrganizeValue.getCustId()) {
							ExceptionUtil.throwBusinessException("The parent department can only be changed to one belonging to the same customer.parent department customer is:" + custOrganizeValue.getCustId()+", department customer is:" + department.getCustId());
						}
					} 
					
					if(!department.getDeptName().trim().equals(name)) {
						ICustOrganizeValue[] departments = customerSV.listDepartment(custId,name);
						if (departments != null && departments.length > 0) {//same depart name
							ExceptionUtil.throwBusinessException("Department name already exists, please rename");
						}				
					}
				}
				
			}
			
			IVOCustValue custValue = new VOCustBean();
			custValue.setBusinessId(CmConstants.BusiLogId.GROUP_ORG_OPER);
			ICustOrganizeValue custOrganizeValue = department;
			if(name != null && StringUtils.isNotEmpty(name)) {
				custOrganizeValue.setDeptName(name);
			}
			if (parentId != null){
				custOrganizeValue.setParentDeptId(parentId);
			}
			custValue.addCustOrganize(custOrganizeValue);
			CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		}
	}
	
	@Override
	public void deleteDepartment(Long id) throws Exception {
		if(id == null || id == 0l) {
			ExceptionUtil.throwBusinessException("Invaild Parames [id]:"+id);
		}
		
		ICmDkCustomerSV customerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		ICustOrganizeValue[] subDepartments = customerSV.queryCustOrganizesByParentId(id, CmConstants.CustomerOrg.DEPARTMENT, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(subDepartments)) { // 包含子节点信息
			ExceptionUtil.throwBusinessException("The department contains lower department and cannot be deleted. Please firstly delete lower department.");
		}
		
		ICustOrganizeValue department = customerSV.queryDepartmentById(id);
		if (department != null) {
			if(department.getParentDeptId() <= 0L) {
				ExceptionUtil.throwBusinessException("The root department cannot be deleted.");
			}
			
			// 判断该部门有用户
			DataContainer condition = new DataContainer();
			condition.set(IGroupMemberValue.S_DeptId, id);
			IGroupMemberValue[] groupMemberValues = CmServiceFactory.getCustomerSV().queryGroupMembers(condition, -1, -1);
			if (groupMemberValues != null && groupMemberValues.length > 0) {
				//删除成员
				IVOCustValue custValue = new VOCustBean();
				custValue.setBusinessId(CmConstants.BusiLogId.GROUP_ORG_PHONE_ASSIGN);
				custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_DEL);
				ICustRelationshipValue custRelValue = null;
				for (int i = 0; i < groupMemberValues.length; i++) {
					custRelValue = new CustRelationshipBean();
					groupMemberValues[i].delete();
					custRelValue.copy(groupMemberValues[i]);
					custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
					custValue.addCustRel(custRelValue);
				}
				CmServiceFactory.getCustomerSV().saveCustomer(custValue);
			}
			
			department.delete();
			IVOCustValue custValue = new VOCustBean();
			custValue.setBusinessId(CmConstants.BusiLogId.GROUP_ORG_OPER);
			custValue.addCustOrganize(department);
			CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		}
	}

}
