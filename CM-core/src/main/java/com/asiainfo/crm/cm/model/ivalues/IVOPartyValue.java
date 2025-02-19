package com.asiainfo.crm.cm.model.ivalues;

import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;


public interface IVOPartyValue extends IValueObject {

	long getPartyId() throws Exception;

	IPartyValue getParty() throws Exception;

	long setParty(IPartyValue partyValue) throws Exception;

	IPartyRoleValue[] getPartyRoles() throws Exception;

	long setPartyRole(IPartyRoleValue partyRoleValue) throws Exception;

	IPartyRoleValue removePartyRole(IPartyRoleValue partyRoleValue) throws Exception;

	IPartyContactValue[] getPartyContacts() throws Exception;

	long setPartyContact(IPartyContactValue contactValue) throws Exception;

	IPartyContactValue removePartyContact(IPartyContactValue partyContactValue) throws Exception;
	
	IBOCmContactContMediumValue[] getCmContactContMedium() throws Exception;
	
	long setCmContactContMedium(IBOCmContactContMediumValue contMediumValue) throws Exception;
	
	boolean hasPartyContacts() throws Exception;
	
	boolean hasPartyRoles() throws Exception;
	
	void setAddress(address addressValue)throws Exception; 
	
	address getAddress() throws Exception; 
}
