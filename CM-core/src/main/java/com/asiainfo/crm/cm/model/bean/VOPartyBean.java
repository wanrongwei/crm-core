package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.bo.PartyRoleBean;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyRoleValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;

public class VOPartyBean extends ValueObjectBean implements IVOPartyValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3003695545954051644L;

	private IPartyValue partyValue = null;
	private List<IPartyRoleValue> partyRoleValues = new ArrayList<IPartyRoleValue>();
	private List<IPartyContactValue> contactValues = new ArrayList<IPartyContactValue>();
	private List<IBOCmContactContMediumValue> contMediumValues = new ArrayList<IBOCmContactContMediumValue>();
	private address addressObj = null;

	public long getPartyId() throws Exception {
		return getId();
	}

	public IPartyValue getParty() throws Exception {
		return this.partyValue;
	}

	public long setParty(IPartyValue partyValue) throws Exception {
		this.partyValue = partyValue;
		if (this.partyValue != null) {
			return this.partyValue.getPartyId();
		}
		return -1;
	}

	public IPartyRoleValue[] getPartyRoles() throws Exception {
		return this.partyRoleValues.toArray(new PartyRoleBean[0]);
	}

	public long setPartyRole(IPartyRoleValue partyRoleValue) throws Exception {
		if (partyRoleValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.partyRoleValues.add(partyRoleValue);
		return partyRoleValue.getPartyRoleId();
	}

	public IPartyRoleValue removePartyRole(IPartyRoleValue partyRoleValue) throws Exception {
		if (partyRoleValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.partyRoleValues.remove(partyRoleValue);
		return partyRoleValue;
	}

	public IPartyContactValue[] getPartyContacts() throws Exception {
		return this.contactValues.toArray(new PartyContactBean[0]);
	}
	
	public IBOCmContactContMediumValue[] getCmContactContMedium() throws Exception{
		return this.contMediumValues.toArray(new BOCmContactContMediumBean[0]);
	}

	public long setCmContactContMedium(IBOCmContactContMediumValue contMediumValue) throws Exception{
		if (contMediumValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.contMediumValues.add(contMediumValue);
		return contMediumValue.getContId();
	}
	
	public void setAddress(address addressValue)throws Exception{
		if (addressValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.addressObj = addressValue;
	}
	
	public address getAddress() throws Exception{
		return this.addressObj;
	}
	
	public long setPartyContact(IPartyContactValue contactValue) throws Exception {
		if (contactValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.contactValues.add(contactValue);
		return contactValue.getContId();
	}

	public IPartyContactValue removePartyContact(IPartyContactValue contactValue) throws Exception {
		if (contactValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.contactValues.remove(contactValue);
		return contactValue;
	}

	public boolean hasPartyContacts() throws Exception {
		return CmCommonUtil.isNotEmptyObject(contactValues);
	}

	public boolean hasPartyRoles() throws Exception {
		return CmCommonUtil.isNotEmptyObject(partyRoleValues);
	}

	public long getId() {
		if (this.partyValue != null) {
			return this.partyValue.getPartyId();
		}
		return -1;
	}
}
