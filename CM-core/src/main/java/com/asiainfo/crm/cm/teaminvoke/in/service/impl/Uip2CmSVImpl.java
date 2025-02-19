package com.asiainfo.crm.cm.teaminvoke.in.service.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupMemberSV;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.IUip2CmSV;
import com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetRequest;
import com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetRequestBody;
import com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetResponse;
import com.asiainfo.crm.inter.exe.webservice.client.poa.PoaServiceFactory;
import com.asiainfo.crm.inter.exe.webservice.client.rcp.RcpServiceFactory;
import com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTRequest;
import com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTRequestBody;
import com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTResponse;

public class Uip2CmSVImpl implements IUip2CmSV{
	private static transient Log log = LogFactory.getLog(Uip2CmSVImpl.class);
	
	/**
	 * 	CR372 add
	 * 	在删除CPR资料的同时，调用UAPI接口 撤回CPR 同意书
	 * @param customerValue
	 * @throws Exception
	 */
	public void retractCprPermission(ICustomerValue customerValue) throws Exception {
		String results = "";
		long custId = customerValue.getCustId();
		boolean flag = false;
		try{
			//判断是否是网外成员
			ICmGroupMemberSV cmGroupMemberSv = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
			IBOCmGroupMemberValue[] cmGrpMemberValue = cmGroupMemberSv.queryGroupMemberValues(customerValue.getCustId(), -1, -1, -1);
			boolean offNet = false;
			if(cmGrpMemberValue != null && cmGrpMemberValue.length > 0 && cmGrpMemberValue[0].getMemberType() == CmLnConstants.MemberStatus.MEMBER_STATUS_NETWORK_OUT) {
				offNet = true;
			}
			
			String newValue = customerValue.getCustCertCode();
			String oldValue = (String) customerValue.getOldObj(ICustomerValue.S_CustCertCode);
			if(StringUtils.isNotEmpty(oldValue) && StringUtils.isEmpty(newValue) && !offNet) {//cpr资料删除，网外成员不调用新接口
				flag = true;
				RetractCprPermissionUsingPUTRequest request = new RetractCprPermissionUsingPUTRequest();
				RetractCprPermissionUsingPUTRequestBody requestBody = new RetractCprPermissionUsingPUTRequestBody();
				requestBody.setCustomerId(String.valueOf(custId));
				requestBody.setCustomerIdType("3");			//customer ID
				requestBody.setUserConsentSource("VERIS_CPR_CLEANUP"); //传固定值 		VERIS_CPR_CLEANUP
				requestBody.setUserConsentSourceType("6");		//传固定值 		6
				request.setRequestBody(requestBody );
				//crm cm不需要处理返回
				RetractCprPermissionUsingPUTResponse response = RcpServiceFactory.getService().getretractCprPermissionUsingPUTPort().retractCprPermissionUsingPUT(request);
				if(response != null && response.getResponseBody() != null) {
					results = response.getResponseBody().getResults();
				}
			}
		}catch(Exception e) {
			flag = true;
			String excMsg = e.getMessage();
			log.error(excMsg);
			if(StringUtils.isNotEmpty(excMsg) && excMsg.contains(":")) {//对 “：”做特殊处理，不然saveRecord方法里截取会有问题，用“,”代替
				String[] strs = excMsg.split(":");
				for (int i = 0; i < strs.length; i++) {
					results += strs[i]+", ";
				}
			}
		}finally {
			//记录 CI 日志
			if (flag) {
				String[] detailInfo = new String[]{"interfaceName:retractCprPermission", "custId:" + custId, "results:" + results};
				CmRecordLog.saveRecord(CmBusinessOperation.CM_INDIV_CUST_MOD, custId, detailInfo);
			}
		}
	}
	
	/**
	 * 根据type=“POA” 和CustId 查询POA 信息
	 * @param custId
	 * @param poaType
	 * @return
	 * @throws Exception
	 */
	public String queryPoaByPoaTypeAndCustId(String custId,String poaType) throws Exception{
		String results = "";
		AgreementGetRequest req = new AgreementGetRequest();
		AgreementGetRequestBody requestBody = new AgreementGetRequestBody();
		requestBody.setAgreementType(poaType);
		requestBody.setPartyId(custId);
		req.setRequestBody(requestBody);
		AgreementGetResponse rsp = PoaServiceFactory.getService().getAgreementGetPort().agreementGet(req);
		results = rsp.getResponseBody().getResults();
		return results;
	}
}
