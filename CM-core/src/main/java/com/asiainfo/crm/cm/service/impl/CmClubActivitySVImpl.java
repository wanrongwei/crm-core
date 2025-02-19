package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubActionDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubActionQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubActionRecQueryModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.inner.club.bo.QBOCmClubMemberActionRecBean;
import com.asiainfo.crm.cm.inner.club.bo.QBOCmClubMemberCardEngine;
import com.asiainfo.crm.cm.inner.club.ivalues.IQBOCmClubMemberActionRecValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IQBOCmClubMemberCardValue;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubActionValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubActivityValue;
import com.asiainfo.crm.cm.service.interfaces.ICmClubActivitySV;

public class CmClubActivitySVImpl implements ICmClubActivitySV {

	public IClubActionValue queryClubActionById(long actionId) throws Exception {
		return (IClubActionValue) ((AbstractClubActionQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionQueryModelImpl.class)).queryClubActionByActionId(actionId);
	}

	public int queryClubActionCount(DataContainer condition) throws Exception {
		AbstractClubActionQueryModelImpl busi = (AbstractClubActionQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionQueryModelImpl.class);
		return busi.queryCount(new DataContainer[] { condition });
	}

	public int queryClubActionCount(String criteria) throws Exception {
		AbstractClubActionQueryModelImpl busi = (AbstractClubActionQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionQueryModelImpl.class);
		return busi.queryCount(criteria);
	}

	public IClubActionRecValue queryClubActionRecById(long recordId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int queryClubActionRecCount(DataContainer condition) throws Exception {
		AbstractClubActionRecQueryModelImpl busi = (AbstractClubActionRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionRecQueryModelImpl.class);
		return busi.queryCount(new DataContainer[] { condition });
	}

	public int queryClubActionRecCount(String criteria) throws Exception {
		AbstractClubActionRecQueryModelImpl busi = (AbstractClubActionRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionRecQueryModelImpl.class);
		return busi.queryCount(criteria);
	}

	public IClubActionRecValue[] queryClubActionRecs(DataContainer condition, int startNum, int endNum) throws Exception {
		return (IClubActionRecValue[]) ((AbstractClubActionRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionRecQueryModelImpl.class)).queryData(
				new DataContainer[] { condition }, startNum, endNum);
	}

	public IClubActionRecValue[] queryClubActionRecs(String criteria, int startNum, int endNum) throws Exception {
		AbstractClubActionRecQueryModelImpl busi = (AbstractClubActionRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionRecQueryModelImpl.class);
		return (IClubActionRecValue[]) busi.queryData(criteria, startNum, endNum);
	}

	public IClubActionValue[] queryClubActions(DataContainer condition, int startNum, int endNum) throws Exception {
		return (IClubActionValue[]) ((AbstractClubActionQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionQueryModelImpl.class)).queryClubActions(
				new DataContainer[] { condition }, startNum, endNum);
	}

	public IClubActionValue[] queryClubActions(String criteria, int startNum, int endNum) throws Exception {
		AbstractClubActionQueryModelImpl busi = (AbstractClubActionQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionQueryModelImpl.class);
		return (IClubActionValue[]) busi.queryData(criteria, startNum, endNum);
	}

	public void saveClubAction(IClubActionValue[] actionValue) throws Exception {
		((AbstractClubActionDealModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionDealModelImpl.class)).saveClubActionValue(actionValue);
	}

	public ICmDealReturnData saveClubAction(IVOClubActivityValue activityValue) throws Exception {
		return ((AbstractClubActionDealModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionDealModelImpl.class)).deal(activityValue);
	}

	public void saveClubActionRec(IClubActionRecValue[] actionRecValues) throws Exception {
		((AbstractClubActionDealModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionDealModelImpl.class)).saveClubActionRecValue(actionRecValues);
	}

	public ICmDealReturnData saveClubActionRec(IVOClubActivityValue activityValue) throws Exception {
		return ((AbstractClubActionDealModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionDealModelImpl.class)).deal(activityValue);
	}

	public int queryClubMemVipCardCount(long custId) throws Exception {
		if (-1 == custId) {
			// 传入的参数不合法，请重新查询
			ExceptionUtil.throwBusinessException("CMC0076003");
		}
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		HashMap paraMap = new HashMap();
		condition.append(" and ").append(IQBOCmClubMemberCardValue.S_CustId).append(" =:custId");
		paraMap.put("custId", custId);
		return QBOCmClubMemberCardEngine.getBeansCount(condition.toString(), paraMap);
	}

	public IQBOCmClubMemberCardValue[] queryClubMemVipCard(long custId, int start, int end) throws Exception {
		if (-1 == custId) {
			// 传入的参数不合法，请重新查询
			ExceptionUtil.throwBusinessException("CMC0076003");
		}
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		HashMap paraMap = new HashMap();
		condition.append(" and ").append(IQBOCmClubMemberCardValue.S_CustId).append(" =:custId");
		paraMap.put("custId", custId);
		IQBOCmClubMemberCardValue[] cmclubMeneberCard = QBOCmClubMemberCardEngine.getBeans(null, condition.toString(), paraMap, start, end, true);
		return cmclubMeneberCard;
	}

	public IQBOCmClubMemberActionRecValue[] queryQClubMemberActionRecByCondition(String memberCode, String memberName, String actionCode, String actionName, int startNum,
			int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		HashMap paraMap = new HashMap();
		if (StringUtils.isNotBlank(memberCode)) {
			condition.append(" and ").append(IQBOCmClubMemberActionRecValue.S_MemberId).append(" =:memberCode");
			paraMap.put("memberCode", memberCode);
		}
		if (StringUtils.isNotBlank(memberName)) {
			condition.append(" and ").append(IQBOCmClubMemberActionRecValue.S_MemberName).append(" like:memberName");
			paraMap.put("memberName", memberName+"%");
		}
		if (StringUtils.isNotBlank(actionCode)) {
			condition.append(" and ").append(IQBOCmClubMemberActionRecValue.S_ActionCode).append(" =:actionCode");
			paraMap.put("actionCode", actionCode);
		}
		if (StringUtils.isNotBlank(actionName)) {
			condition.append(" and ").append(IQBOCmClubMemberActionRecValue.S_ActionName).append(" like:actionName");
			paraMap.put("actionName", actionName+"%");
		}
		ICmCommonInnerSV commonInnerSV = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		IQBOCmClubMemberActionRecValue[] actionRecValues = (IQBOCmClubMemberActionRecValue[]) commonInnerSV.getBeans(QBOCmClubMemberActionRecBean.class, condition.toString(),
				paraMap, startNum, endNum);
		if (actionRecValues == null) {
			actionRecValues = new IQBOCmClubMemberActionRecValue[0];
		}
		return actionRecValues;
	}

	public int queryQClubMemberActionRecByConditionCount(String memberCode, String memberName, String actionCode, String actionName) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		HashMap paraMap = new HashMap();
		if (StringUtils.isNotBlank(memberCode)) {
			condition.append(" and ").append(IQBOCmClubMemberActionRecValue.S_MemberId).append(" =:memberCode");
			paraMap.put("memberCode", memberCode);
		}
		if (StringUtils.isNotBlank(memberName)) {
			condition.append(" and ").append(IQBOCmClubMemberActionRecValue.S_MemberName).append(" like:memberName");
			paraMap.put("memberName", memberName+"%");
		}
		if (StringUtils.isNotBlank(actionCode)) {
			condition.append(" and ").append(IQBOCmClubMemberActionRecValue.S_ActionCode).append(" =:actionCode");
			paraMap.put("actionCode", actionCode);
		}
		if (StringUtils.isNotBlank(actionName)) {
			condition.append(" and ").append(IQBOCmClubMemberActionRecValue.S_ActionName).append(" like:actionName");
			paraMap.put("actionName", actionName+"%");
		}
		ICmCommonInnerSV commonInnerSV = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		return commonInnerSV.getBeanCount(QBOCmClubMemberActionRecBean.class, condition.toString(), paraMap);
	}
}
