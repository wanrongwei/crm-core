package com.asiainfo.crm.cm.busimodel.impl.defaults;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;

public class DefaultCustomerDealBusiModelImpl extends AbstractCustomerDealBusiModelImpl {

	private static transient Log log = LogFactory.getLog(DefaultCustomerDealBusiModelImpl.class);

	protected void processAfterDeal(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void processBeforeDeal(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub
	}

	public String getCustServiceId(ICustomerValue customerValue) throws Exception {
		String sequenceName = null;
		// 根据客户类型取对应的序列名称
		switch (customerValue.getCustType()) {
			case CmConstants.CustomerType.INDIVIDUAL:
				sequenceName = CmConstants.CustServiceIdSequence.CM_INDIV_CUST_SERVICE_ID;
				break;
			case CmConstants.CustomerType.FAMILY:
				sequenceName = CmConstants.CustServiceIdSequence.CM_FAMILY_CUST_SERVICE_ID;
				break;
			case CmConstants.CustomerType.GROUP:
				sequenceName = CmConstants.CustServiceIdSequence.CM_GROUP_CUST_SERVICE_ID;
				break;
			case CmConstants.CustomerType.VIRTUAL:
				sequenceName = CmConstants.CustServiceIdSequence.CM_VIRTUAL_CUST_SERVICE_ID;
				break;
			default:
				break;
		}
		long custServiceId = 0;
		long provinceId = DataType.getAsLong(customerValue.getProvinceId());
		IBOBsCommonDistrictValue districtValue = BsCommonDistrictUtil.getCommonDistrictById(provinceId);
		if (districtValue != null) {
			custServiceId = DataType.getAsLong(districtValue.getDistrictCode()) * 10000000L;
		}
		if (StringUtils.isNotBlank(sequenceName)) {
			// 因为客户服务编号是客户的可选属性，不能因为取不到序列而影响正常的业务受理，因此屏蔽因为序列号取不到而影响正常业务的受理。
			try {
				custServiceId += ServiceManager.getIdGenerator().getNewId(sequenceName).longValue();
			} catch (Exception e) {
				log.info(e.getMessage(), e);
				if (log.isErrorEnabled()) {
					log.error(e.getMessage());
				}
			}
		}
		return String.valueOf(custServiceId);
	}

	protected void dealOtherThings(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void setOtherDefaultValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void validateOtherThings(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void validateAttrValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}
}
