package com.asiainfo.crm.cm.hu.busimodel.impl.contact;

import java.util.ArrayList;
import java.util.List;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractCustContactDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.bo.BOIdentificationBean;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

public class CmHuCustContactDealBusiModelImpl extends AbstractCustContactDealBusiModelImpl {

	protected void setDefaultAttrValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void setOtherDefaultValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void validateAttrValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void dealOtherThings(IVOCustValue custValue) throws Exception {
		if (custValue.hasCustIdentification()) {
			IBOIdentificationValue[] identificationValues = custValue.getCustIdentification();
			List result = new ArrayList();
			ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			for (int i = 0; i < identificationValues.length; i++) {
				if (identificationValues[i].isNew()) {
					identificationValues[i].setIdenId(CmCommonUtil.getNewSequence(BOIdentificationBean.class));
					if (null != custValue.getContacts()) {
						identificationValues[i].setPartyId(custValue.getContacts()[0].getPartyId());
						identificationValues[i].setRegionId(custValue.getContacts()[0].getRegionId());
					}
					identificationValues[i].setState(CmConstants.RecordState.USE);
					result.add(identificationValues[i]);
				} else if (identificationValues[i].isModified()) {
					IBOIdentificationValue[] values = dkCustomerSV
							.queryCustIdentifications(identificationValues[i].getPartyId(), (int) identificationValues[i].getIdenType(), null);
					if (values != null && values.length > 0) {
						values[0].setStsToOld();
						values[0].setIdenSubType(identificationValues[i].getIdenSubType());
						values[0].setIdenNr(identificationValues[i].getIdenNr());
						result.add(values[0]);
					}else{
						identificationValues[i].setIdenId(CmCommonUtil.getNewSequence(BOIdentificationBean.class));
						if (null != custValue.getContacts()) {
							identificationValues[i].setPartyId(custValue.getContacts()[0].getPartyId());
							identificationValues[i].setRegionId(custValue.getContacts()[0].getRegionId());
						}
						identificationValues[i].setState(CmConstants.RecordState.USE);
						identificationValues[i].setStsToNew();
						result.add(identificationValues[i]);
					}
					
				}
			}
			if (!result.isEmpty()) {
				dkCustomerSV.saveCustIdentification((IBOIdentificationValue[]) result.toArray(new IBOIdentificationValue[0]));
			}
		}

	}

	protected void processAfterDeal(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void processBeforeDeal(IVOCustValue custValue) throws Exception {

	}

}
