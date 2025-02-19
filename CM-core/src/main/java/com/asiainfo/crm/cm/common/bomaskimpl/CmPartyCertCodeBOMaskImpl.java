package com.asiainfo.crm.cm.common.bomaskimpl;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.IBOMask;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmPartyCertCodeBOMaskImpl implements IBOMask {
	
	private static transient Log log = LogFactory.getLog(CmAcctCertCodeBOMaskImpl.class);

	public Object maskBOAttr(UserInfoInterface userInfo,
			DataContainerInterface dc, Object initValue) {
		if ((userInfo == null) || (StringUtils.isBlank(userInfo.getCode()))) {
			return null;
		}
		try{
			Object certType=dc.get("CERT_TYPE");
			if((null!=certType) && (initValue != null) && ((initValue instanceof String))){
				int custCertType=DataType.getAsInt(certType);
				String custCertCode=DataType.getAsString(initValue);
				if(custCertType==CmConstants.CertificateType.CPR){
					int valueLength = custCertCode.length();
					if(valueLength>6){
						StringBuilder sb = new StringBuilder(valueLength);
						sb.append(custCertCode.substring(0, 6));
						for(int i=0; i<valueLength-6;i++){
							sb.append("*");
						}
						return sb.toString();
					}else{
						return custCertCode;
					}
				}else{
					if(custCertCode.startsWith("K")){
						return "";
					}else{
						return DataType.getAsLong(custCertCode);
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
