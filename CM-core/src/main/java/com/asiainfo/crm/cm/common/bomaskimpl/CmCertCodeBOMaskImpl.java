package com.asiainfo.crm.cm.common.bomaskimpl;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.IBOMask;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.common.mask.BOMaskHelper;

/**
 * Created by IntelliJ IDEA.
 * Class Name : CmCertCodeBOMaskImpl;
 *
 * @author: huzhengquan
 * @date: 11-9-21
 * @time: 上午12:17
 * <p/>
 * Modification History:
 * Date 					Author			Version				Description
 * -----------------------------------------------------------------------*
 * 11-9-21    	huzhengquan           v1.0.0               创建
 */
public class CmCertCodeBOMaskImpl implements IBOMask {

	private static transient Log log = LogFactory.getLog(CmCertCodeBOMaskImpl.class);

	public Object maskBOAttr(UserInfoInterface userInfo, DataContainerInterface dc, Object initValue) {
		if ((userInfo == null) || (StringUtils.isBlank(userInfo.getCode()))) {
			return null;
		}
		try {
			/*
			 * 如果当前操作员没有查看客户证件信息的权限时需要对客户的证件号码进行模糊化处理
			 */
			// if (!CmServiceFactory.getTeamInvokeSV().checkSecEntityPermission(userInfo.getID(),
			// CmPrivConstants.SecEntity.CUST_CERT_CODE, CmPrivConstants.SecPriv.CERT_INFO_CONTROL)) {
			Object certType = dc.get("CUST_CERT_TYPE");
			//法人识别号
//			Object corporateCprNum = dc.get("CORPORATE_IDENTIFICATION_NUMBE");
			/*
			 * 对所有证号码的模糊化处理
			 */
			if ((certType != null) && (initValue != null) && ((initValue instanceof String))) {
				long certTypeValue = (Long)certType;
				if(8L == certTypeValue){
					//单独对CPRNumber进行模糊化
					String certValue = (String)initValue;
					int valueLength = certValue.length();
					if(valueLength>6){
						StringBuilder sb = new StringBuilder(valueLength);
						sb.append(certValue.substring(0, 6));
						for(int i=0; i<valueLength-6;i++){
							sb.append("*");
						}
						return sb.toString();
					}else{
						return certValue;
					}
				}
			}
//			if(corporateCprNum != null && StringUtils.isNotBlank(DataType.getAsString(corporateCprNum))){//对法人识别号进行模糊化处理
//				String cprNum = (String)corporateCprNum;
//				if(cprNum.length() == 10){
//					StringBuilder sb = new StringBuilder(cprNum.length());
//					sb.append(cprNum.substring(0, 6));
//					for(int i=0; i<cprNum.length()-6;i++){
//						sb.append("*");
//					}
//					dc.set("CORPORATE_IDENTIFICATION_NUMBE", sb.toString());
//					return initValue;
//				} else {
//					return initValue;
//				}
//			}
			// }
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e.getMessage(), e);
			}
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		AbstractCustomerQueryBusiModelImpl qryBusiModel = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setName("shitian");
		ServiceManager.setServiceUserInfo(userInfo);
		BOMaskHelper.setOperateNotMaskFlag();
		ICustomerValue customer = qryBusiModel.queryCustomerByCustId(21500000000243L, "U");
	}
}
