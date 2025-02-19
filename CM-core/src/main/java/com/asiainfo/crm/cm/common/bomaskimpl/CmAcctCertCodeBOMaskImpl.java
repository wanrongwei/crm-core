package com.asiainfo.crm.cm.common.bomaskimpl;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.IBOMask;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;

public class CmAcctCertCodeBOMaskImpl implements IBOMask {

	private static transient Log log = LogFactory.getLog(CmAcctCertCodeBOMaskImpl.class);

	public Object maskBOAttr(UserInfoInterface userInfo, DataContainerInterface dc, Object initValue) {
		if ((userInfo == null) || (StringUtils.isBlank(userInfo.getCode()))) {
			return null;
		}
		try {
			Object custNum = dc.get("CUST_ID");
			int payMethod = dc.getAsInt("PAY_METHOD");
			if ((null != custNum) && (initValue != null) && ((initValue instanceof String))) {
				long custId = DataType.getAsLong(custNum);
				if (payMethod == 1) {// 自有账户
					if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
						String custCertCode = DataType.getAsString(initValue);
						int valueLength = custCertCode.length();
						if (valueLength > 6) {
							StringBuilder sb = new StringBuilder(valueLength);
							sb.append(custCertCode.substring(0, 6));
							for (int i = 0; i < valueLength - 6; i++) {
								sb.append("*");
							}
							return sb.toString();
						} else {
							return custCertCode;
						}
					}
				} else {//代付账户
					ICmPartySV sv = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
					IPartyValue val = sv.queryPartyById(dc.getAsLong("PARTY_ID"));
					if (val != null && val.getPartyType() == 1) {//个人
						String custCertCode = DataType.getAsString(initValue);
						int valueLength = custCertCode.length();
						if (valueLength > 6) {
							StringBuilder sb = new StringBuilder(valueLength);
							sb.append(custCertCode.substring(0, 6));
							for (int i = 0; i < valueLength - 6; i++) {
								sb.append("*");
							}
							return sb.toString();
						} else {
							return custCertCode;
						}
					}
				}
			}
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e.getMessage(), e);
			}
		}
		return null;
	}
}
