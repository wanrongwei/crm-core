package com.asiainfo.crm.cm.ln.busimodel.contact;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractCustContactDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnClubServiceSV;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

public class CmLnCustContactDealBusiModelImpl extends AbstractCustContactDealBusiModelImpl {

	protected void dealOtherThings(IVOCustValue custValue) throws Exception {
		//删除关键人 重新计算vip因子CmCustomerManager.jsp
		if (custValue.hasContacts()) {
			IContactValue[] contactValues = custValue.getContacts();
			for (int i = 0; i < contactValues.length; i++) {
					if(contactValues[i].isDeleted()){
						switch (CmCommonUtil.getCustType(contactValues[i].getCustId())) {
						case CmConstants.CustomerType.GROUP:
							ICmLnClubServiceSV icmLnClub=(ICmLnClubServiceSV)ServiceFactory.getService(ICmLnClubServiceSV.class);
							icmLnClub.delGrpContact(contactValues[i].getBillId(), CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN);
							break;
						default:
							break;
					}
				}
			}
		}
		
		
		// 校验联系人扩展表是否有数据
		// if (custValue.hasContacts()) {
		// IContactValue[] contactValues = custValue.getContacts();
		// // 获取联系人扩展信息
		// IBOLnCmxPartyContactValue partyContactValue = (IBOLnCmxPartyContactValue)
		// custValue.getUserObject(CmLnConstants.DealCustInfo.DEAL_CONTACT);
		// if (partyContactValue == null) {
		// partyContactValue = new BOLnCmxPartyContactBean();
		// partyContactValue.copy(contactValues[0]);
		// }
		// String opState = custValue.getUserObject(CmLnConstants.DealCustInfo.OP_STATE).toString();
		//
		// // 联系人只支持单个新增修改
		// if (CmLnConstants.DealCustInfo.OP_MODIFY.equalsIgnoreCase(opState)) {
		// IBOLnCmxPartyContactValue partyContactValueQry =
		// CmxServiceFactory.getLnContactSV().queryPartyContactByContId(contactValues[0].getContId());
		// // 联系人主表修改，但是扩展表为空，则扩展表需要做新增操作
		// if (partyContactValueQry == null) {
		// partyContactValue.setStsToNew();
		// } else {
		// CmLnCommonUtil.initDcProperties(partyContactValue);
		// }
		// } else if (CmLnConstants.DealCustInfo.OP_NEW.equalsIgnoreCase(opState)) {
		// partyContactValue.setContId(contactValues[0].getContId());
		// partyContactValue.setPartyId(contactValues[0].getPartyId());
		// // 设置regionId和操作员组织信息
		// partyContactValue.setRegionId(contactValues[0].getRegionId());
		// partyContactValue.setCreateOpId(contactValues[0].getCreateOpId());
		// partyContactValue.setCreateOrgId(contactValues[0].getCreateOrgId());
		// partyContactValue.setStsToNew();
		// } else {
		// partyContactValue.delete();
		// }
		//
		// // 保存联系人扩展信息
		// CmxServiceFactory.getLnContactSV().saveCmxPartyContacts(new IBOLnCmxPartyContactValue[] { partyContactValue
		// });
		//		}
	}

	protected void processAfterDeal(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void processBeforeDeal(IVOCustValue custValue) throws Exception {
		IContactValue[] contactValues = custValue.getContacts();
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			for (int i = 0; i < contactValues.length; i++) {
				
			}
		}
	}

	protected void setDefaultAttrValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void setOtherDefaultValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

	protected void validateAttrValue(IVOCustValue custValue) throws Exception {
		// TODO Auto-generated method stub

	}

}
