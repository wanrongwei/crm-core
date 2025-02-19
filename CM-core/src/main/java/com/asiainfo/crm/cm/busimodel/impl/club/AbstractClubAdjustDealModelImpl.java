package com.asiainfo.crm.cm.busimodel.impl.club;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceAdjustBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceAdjustValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

public abstract class AbstractClubAdjustDealModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {


	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOClubMemberValue ClubServiceAdjustValue = (IVOClubMemberValue) valueObject;
		saveServiceAdjustClub(ClubServiceAdjustValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0020169"));
		return returnData;
	}

	private void saveServiceAdjustClub(IVOClubMemberValue ClubServiceAdjustValue) throws Exception {
		IBOCmClubServiceAdjustValue cmClubServiceAdjustValue = (IBOCmClubServiceAdjustValue) ClubServiceAdjustValue.getUserObject("CmClubServiceAdjust");
		if (cmClubServiceAdjustValue.isNew()) {
			if (cmClubServiceAdjustValue.getRecordId() <= 0) {
				cmClubServiceAdjustValue.setRecordId(CmCommonUtil.getNewSequence(BOCmClubServiceAdjustBean.class));
			}
			if (StringUtils.isBlank(cmClubServiceAdjustValue.getState())) {
				cmClubServiceAdjustValue.setState(CmConstants.RecordState.USE);
			}
		}
		if (cmClubServiceAdjustValue.isNew()) {
			if (ServiceManager.getUser() != null) {
				cmClubServiceAdjustValue.setCreateOpId(ServiceManager.getUser().getID());
				cmClubServiceAdjustValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			}
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) cmClubServiceAdjustValue);
	}

	protected void preposeExtThings(IVOClubMemberValue ClubServiceAdjustValue) {
	}

	protected void doOtherThings(IVOClubMemberValue ClubServiceAdjustValue) throws Exception {
	}

	protected void extBeforeSave(IVOClubMemberValue ClubServiceAdjustValue) throws Exception {
	}
}
