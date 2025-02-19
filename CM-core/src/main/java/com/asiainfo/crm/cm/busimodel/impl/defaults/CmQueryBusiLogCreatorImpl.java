package com.asiainfo.crm.cm.busimodel.impl.defaults;

import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.busimodel.ICmBusiLogCreator;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.log.AbstractBusiLogCreatorImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOQueryParamValue;

public class CmQueryBusiLogCreatorImpl extends AbstractBusiLogCreatorImpl implements ICmBusiLogCreator {

	protected ICmBusiLogValue[] createBusiLogDetails(IValueObject valueObject, ICmBusiLogValue mainBusiLogValue) throws Exception {
		return new ICmBusiLogValue[0];
	}

	protected int getBusiLogType() {
		return 0;
	}

	protected ICmBusiLogValue createMainBusiLog(IValueObject valueObject) throws Exception {
		IVOQueryParamValue paramValue = (IVOQueryParamValue) valueObject;
		long objectId = 0;
		int busiType = paramValue.getBusiType();
		Parameter parameter = paramValue.getParameter();
		switch (busiType) {
			case CmConstants.BusiLogType.CUSTOMER_LOG:
				objectId = DataType.getAsLong(parameter.getParameter().get(ICustomerValue.S_CustId));
				break;
			case CmConstants.BusiLogType.ACCOUNT_LOG:
				objectId = DataType.getAsLong(parameter.getParameter().get(IAccountValue.S_AcctId));
				break;
			case CmConstants.BusiLogType.CLUB_LOG:
				objectId = DataType.getAsLong(parameter.getParameter().get(IClubMemberValue.S_MemberId));
				break;
			case CmConstants.BusiLogType.PARTY_LOG:
				objectId = DataType.getAsLong(parameter.getParameter().get(IPartyValue.S_PartyId));
				break;
			case CmConstants.BusiLogType.CUSTOMER_EVALUATION_LOG:
				objectId = DataType.getAsLong(parameter.getParameter().get(ICustomerValue.S_CustId));
				break;
			default:
				break;
		}
		String billId = null;
		if (parameter.getParameter().containsKey(ISoUserValue.S_BillId)) {
			billId = DataType.getAsString(parameter.getParameter().get(ISoUserValue.S_BillId));
		}
		ICmBusiLogValue busiLogValue = createDefaultBusiLog(parameter.getBusinessId(), objectId, billId, busiType, CmConstants.BusiLogOperType.QUERY, 0, parameter.getBusiDetail());
		return busiLogValue;
	}
}
