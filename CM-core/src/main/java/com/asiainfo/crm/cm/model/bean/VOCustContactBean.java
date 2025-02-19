package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustContactValue;

public class VOCustContactBean extends ValueObjectBean implements IVOCustContactValue {

	private IContactValue contactValue;
	private List<IBOCmContactContMediumPojoValue> contMediums = new ArrayList<IBOCmContactContMediumPojoValue>();
	private List<IBOCmContactContMediumValue> custContMediums = new ArrayList<IBOCmContactContMediumValue>();

	public long getId() {
		if (contactValue != null) {
			return contactValue.getContId();
		}
		return 0;
	}

	public IContactValue getContactValue() throws Exception {
		return this.contactValue;
	}

	public void setContactValue(IContactValue contactValue) throws Exception {
		this.contactValue = contactValue;

	}

	public IBOCmContactContMediumPojoValue[] getContactMediums() throws Exception {
		return this.contMediums.toArray(new IBOCmContactContMediumPojoValue[0]);
	}

	public void setContactMedium(IBOCmContactContMediumPojoValue[] contactContMediumPojoValues) throws Exception {
		this.contMediums.addAll(Arrays.asList(contactContMediumPojoValues));

	}

	public IBOCmContactContMediumValue[] getCustContMediums() throws Exception {
		return this.custContMediums.toArray(new IBOCmContactContMediumValue[0]);
	}

	public void setCustContMediums(IBOCmContactContMediumValue[] custContactContMediumValues) throws Exception {
		this.custContMediums.addAll(Arrays.asList(custContactContMediumValues));
	}

}
