package com.asiainfo.crm.cm.custgroup.teaminvoke.out.service.interfaces;

import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;

public interface IDepartmentSV {

	public ICustOrganizeValue createDepartment(String name,Long customerId,Long parentId)throws Exception;
	
	public void updateDepartment(Long id,String name,Long parentId)throws Exception;
	
	public void deleteDepartment(Long id) throws Exception;
}
