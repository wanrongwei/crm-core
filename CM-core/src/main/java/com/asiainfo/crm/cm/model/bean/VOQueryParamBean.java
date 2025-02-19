package com.asiainfo.crm.cm.model.bean;

import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOQueryParamValue;

/**   
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-17 下午3:41:26
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-17     huzq           v1.0.0               修改原因<br>
 */
public class VOQueryParamBean extends ValueObjectBean implements IVOQueryParamValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3150201473435218388L;
	private Parameter parameter;

	public long getId() {
		long objectId = 0;
		switch (getBusiType()) {
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
		return objectId;
	}

	public Parameter getParameter() {
		return parameter;
	}

	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}

	public int getBusiType() {
		return DataType.getAsInt(getUserObject(S_BUSI_TYPE));
	}

	public void setBusiType(int busiType) throws Exception {
		setUserObject(S_BUSI_TYPE, busiType);
	}

}
