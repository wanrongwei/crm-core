/**
 * 
 */
package com.asiainfo.crm.cm.common;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV;
import com.asiainfo.crm.cm.ln.club.service.interfaces.ICmLnClubMemberSV;
import com.asiainfo.crm.cm.ln.customer.contact.service.interfaces.ICmLnContactSV;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.ln.customer.indiv.service.interfaces.ICmLnIndivSV;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnCommonServiceSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupContractSV;
import com.asiainfo.crm.cm.service.interfaces.ICmxContactInnerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmxContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmxCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmxGroupCustInnerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmxIndivCustInnerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmxPartyInnerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmxServiceFactory
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: 2011-7-1 下午1:59:59 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2011-7-1		huzq2           v1.0.0               修改原因
 */

public class CmxServiceFactory {


	public static final Object getBusiMode(Class busiModeInterface) throws Exception {
		return CmServiceFactory.getBusiMode(busiModeInterface, null);
	}

	public static final ICmxGroupCustInnerSV getCmxGroupCustInnerSV() {
		return (ICmxGroupCustInnerSV) ServiceFactory.getService(ICmxGroupCustInnerSV.class);
	}

	public static final ICmxIndivCustInnerSV getCmxIndivCustInnerSV() {
		return (ICmxIndivCustInnerSV) ServiceFactory.getService(ICmxIndivCustInnerSV.class);
	}

	public static final ICmxPartyInnerSV getCmxPartyInnerSV() {
		return (ICmxPartyInnerSV) ServiceFactory.getService(ICmxPartyInnerSV.class);
	}

	public static final ICmxContactInnerSV getCmxContactInnerSV() {
		return (ICmxContactInnerSV) ServiceFactory.getService(ICmxContactInnerSV.class);
	}

	public static final ICmxContactSV getCmxContactSV() {
		return (ICmxContactSV) ServiceFactory.getService(ICmxContactSV.class);
	}

	public static final ISec2CmSV getCmxSec2CmSV() {
		return (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
	}

	public static final ICmxCustomerSV getCmxCustomerSV() {
		return (ICmxCustomerSV) ServiceFactory.getService(ICmxCustomerSV.class);
	}

	public static final ICmGroupContractSV getGroupContractSV() {
		return (ICmGroupContractSV) ServiceFactory.getService(ICmGroupContractSV.class);
	}

	public static final ICmLnCommonServiceSV getLnCommonServiceSV() {
		return (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
	}

	public static final ICmLnContactSV getLnContactSV() {
		return (ICmLnContactSV) ServiceFactory.getService(ICmLnContactSV.class);
	}

	public static final ICmLnIndivSV getLnIndivCustSV() {
		return (ICmLnIndivSV) ServiceFactory.getService(ICmLnIndivSV.class);
	}

	public static final ICmLnAccountSV getLnAccountSV() {
		return (ICmLnAccountSV) ServiceFactory.getService(ICmLnAccountSV.class);
	}

	public static final ICmLnGroupSV getLnGroupSV() {
		return (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
	}
	
	public static final ICmLnClubMemberSV getLnClubMemberSV() {
		return (ICmLnClubMemberSV) ServiceFactory.getService(ICmLnClubMemberSV.class);
	}

}
