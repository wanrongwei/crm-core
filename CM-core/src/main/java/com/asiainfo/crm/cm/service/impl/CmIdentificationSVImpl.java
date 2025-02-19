package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOIdentificationBean;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.ivalues.IPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.service.interfaces.ICmIdentificationSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;

public class CmIdentificationSVImpl implements ICmIdentificationSV {

	public IBOIdentificationValue[] queryIdentification(long custId,
			int idenType, int idenSubType, String idenNum) throws Exception {
		if (custId > 0) {
			DataContainer container = new DataContainer();
			container.set("CUST_ID", custId);
			ICmPartySV service = (ICmPartySV) ServiceFactory
					.getService(ICmPartySV.class);
			IPartyValue[] values = (IPartyValue[]) service.queryPartys(
					container, -1, -1);
			long partyId = 0;
			if (values != null && values.length > 0) {
				partyId = values[0].getPartyId();
			}
			StringBuffer condition = new StringBuffer(" 1=1 ");
			HashMap parameter = new HashMap();
			condition.append(" AND ").append(IBOIdentificationValue.S_PartyId)
					.append(" =:partyId ");
			parameter.put("partyId", partyId);
			if (idenType > 0) {
				condition.append(" AND ").append(
						IBOIdentificationValue.S_IdenType).append(
						" =:idenType ");
				parameter.put("idenType", idenType);
			}
			if (idenSubType > 0) {
				condition.append(" AND ").append(
						IBOIdentificationValue.S_IdenSubType).append(
						" =:idenSubType ");
				parameter.put("idenSubType", idenSubType);
			}
			if (idenNum != null && idenNum.length() > 0) {
				condition.append(" AND ").append(
						IBOIdentificationValue.S_IdenNr).append(" =:idenNum ");
				parameter.put("idenNum", idenNum);
			}
			return (IBOIdentificationValue[]) CmInnerServiceFactory
					.getCommonInnerSV().getBeans(BOIdentificationBean.class,
							condition.toString(), parameter, -1, -1);
		} else {
			if (idenType > 0 && idenNum != null
					&& idenNum.length() > 0) {
				StringBuffer condition = new StringBuffer(" 1=1 ");
				HashMap parameter = new HashMap();
				condition.append(" AND ").append(
						IBOIdentificationValue.S_IdenType).append(
						" =:idenType ");
				parameter.put("idenType", idenType);
				condition.append(" AND ").append(
						IBOIdentificationValue.S_IdenNr).append(" =:idenNum ");
				parameter.put("idenNum", idenNum);
				if (idenSubType > 0) {
					condition.append(" AND ").append(
							IBOIdentificationValue.S_IdenSubType).append(
							" =:idenSubType ");
					parameter.put("idenSubType", idenSubType);
				}
				return (IBOIdentificationValue[]) CmInnerServiceFactory
						.getCommonInnerSV().getBeans(
								BOIdentificationBean.class,
								condition.toString(), parameter, -1, -1);
			} else {
				return new IBOIdentificationValue[0];
			}
		}
	}

	@Override
	public void save(IBOIdentificationValue[] values) throws Exception {
		BOIdentificationBean[] beans = new BOIdentificationBean[values.length];
		for (int i = 0; i < values.length; i++) {
			BOIdentificationBean bean = new BOIdentificationBean();
			bean.copy(values[i]);
			beans[i] = bean;
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(beans);
	}

}


