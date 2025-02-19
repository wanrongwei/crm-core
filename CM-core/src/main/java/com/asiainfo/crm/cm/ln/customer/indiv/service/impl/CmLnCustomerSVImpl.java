package com.asiainfo.crm.cm.ln.customer.indiv.service.impl;

import java.util.HashMap;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.customer.contact.bo.BOLnCustPartyBean;
import com.asiainfo.crm.cm.ln.customer.contact.bo.QBOLnAcctContactBean;
import com.asiainfo.crm.cm.ln.customer.contact.ivalues.IQBOLnAcctContactValue;
import com.asiainfo.crm.cm.ln.customer.indiv.service.interfaces.ICmLnCustomerSV;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public class CmLnCustomerSVImpl implements ICmLnCustomerSV
{

	public DataContainerInterface[] queryPartyContactByNameOrCert(String contactName,
			int certType, String certCode, int startNum, int endNum)
			throws Exception
	{
		HashMap<Object,Object> parameter =new HashMap<Object,Object>();
		
		StringBuilder conditon =new StringBuilder("1=1 ");
		
		if(contactName!=null && !"".equals(contactName.trim()))
		{
			conditon.append("and ").append(ICustomerValue.S_ContName).append("= :ContName ");
			parameter.put("ContName", contactName.trim());
		}
		
		if(certType !=-1 )
		{
			conditon.append("and ").append("CERT_TYPE").append("= :CustCertType ");
			parameter.put("CustCertType", certType);
		}
		
		if(certCode!=null && !"".equals(certCode.trim()))
		{
			conditon.append("and ").append("CERT_CODE").append("= :CustCertCode ");
			parameter.put("CustCertCode", certCode);
		}
		
		return CmInnerServiceFactory.getCommonInnerSV()
			.getBeans(BOLnCustPartyBean.class, null, conditon.toString(), parameter, startNum, endNum, false);
	}

	public int queryPartyContactByNameOrCertCount(String contactName,
			int certType, String certCode) throws Exception
	{
		HashMap<Object,Object> parameter =new HashMap<Object,Object>();
		
		StringBuilder conditon =new StringBuilder("1=1 ");
		
		if(contactName!=null && !"".equals(contactName.trim()))
		{
			conditon.append("and ").append(ICustomerValue.S_ContName).append("= :ContName ");
			parameter.put("ContName", contactName.trim());
		}
		
		if(certType !=-1 )
		{
			conditon.append("and ").append("CERT_TYPE").append("= :CustCertType ");
			parameter.put("CustCertType", certType);
		}
		
		if(certCode!=null && !"".equals(certCode.trim()))
		{
			conditon.append("and ").append("CERT_CODE").append("= :CustCertCode ");
			parameter.put("CustCertCode", certCode);
		}
		
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOLnCustPartyBean.class, conditon.toString(), parameter);
	}

	public DataContainerInterface[] queryContByIdContId(long id, long contId,
			int type) throws Exception
	{
		HashMap<Object,Object> parameter =new HashMap<Object,Object>();
		
		StringBuilder conditon =new StringBuilder("1=1 ");
		
		if(id !=-1 )
		{
			conditon.append("and ").append(IQBOLnAcctContactValue.S_AcctContId).append("= :AcctContId ");
			parameter.put("AcctContId", id);
		}
		
		
		return CmInnerServiceFactory.getCommonInnerSV()
			.getBeans(QBOLnAcctContactBean.class, null, conditon.toString(), parameter, 1, 1, false);
	}


}