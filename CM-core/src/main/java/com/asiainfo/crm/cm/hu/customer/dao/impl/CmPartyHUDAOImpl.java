package com.asiainfo.crm.cm.hu.customer.dao.impl;

import com.asiainfo.crm.cm.hu.customer.dao.interfaces.ICmPartyHUDAO;
import com.asiainfo.crm.cm.hu.party.BOCmPartyPermissionEngine;
import com.asiainfo.crm.cm.hu.party.IBOCmPartyPermissionValue;

public class CmPartyHUDAOImpl implements ICmPartyHUDAO {

	public void savePartyPermission(IBOCmPartyPermissionValue[] partyPermissionValues) throws Exception {
		BOCmPartyPermissionEngine.saveBatch(partyPermissionValues);
	}

}
