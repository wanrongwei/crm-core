package com.asiainfo.crm.cm.hu.customer.dao.interfaces;

import com.asiainfo.crm.cm.hu.party.IBOCmPartyPermissionValue;


public interface ICmPartyHUDAO {

	public void savePartyPermission(IBOCmPartyPermissionValue[] partyPermissionValues) throws Exception;
}
