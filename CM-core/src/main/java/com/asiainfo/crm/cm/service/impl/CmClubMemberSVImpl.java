/**
 * 
 */
package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubActionRecQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubMemberCardQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubMemberDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubMemberQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceAdjustQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceRecQueryModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberTempBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberTempValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceAdjustValue;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerBean;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmCustManagerTeamValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmUserManagerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOClubMemberBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberCardBean;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceAdjustValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.service.interfaces.ICmClubMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustManagerTeamSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName CmClubMemberSVImpl
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:35:15
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public class CmClubMemberSVImpl implements ICmClubMemberSV {

	public ICmDealReturnData saveClubMember(IVOClubMemberValue clubMemberValue) throws Exception {
		AbstractClubMemberDealModelImpl clubMemberDealModelImpl = (AbstractClubMemberDealModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberDealModelImpl.class);
		return clubMemberDealModelImpl.deal(clubMemberValue);
	}

	public void saveClubMemberCard(IVOClubMemberValue clubMemberValue) throws Exception {
		AbstractClubMemberDealModelImpl clubMemberDealModelImpl = (AbstractClubMemberDealModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberDealModelImpl.class);
		clubMemberDealModelImpl.deal(clubMemberValue);
	}

	public IClubMemberValue queryClubMemberById(long memberId) throws Exception {
		AbstractClubMemberQueryModelImpl queryModelImpl = (AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class);
		return (IClubMemberValue) queryModelImpl.queryDataById(memberId);
	}

	public IClubMemberCardValue queryClubMemberCardById(long recordId) throws Exception {
		AbstractClubMemberCardQueryModelImpl queryModelImpl = (AbstractClubMemberCardQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberCardQueryModelImpl.class);
		return (IClubMemberCardValue) queryModelImpl.queryDataById(recordId);
	}

	public int queryClubMemberCardCount(DataContainer condition) throws Exception {
		AbstractClubMemberCardQueryModelImpl queryModelImpl = (AbstractClubMemberCardQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberCardQueryModelImpl.class);
		return queryModelImpl.queryCount(new DataContainer[] { condition });
	}

	public int queryClubMemberCardCount(String criteria) throws Exception {
		AbstractClubMemberCardQueryModelImpl queryModelImpl = (AbstractClubMemberCardQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberCardQueryModelImpl.class);
		return queryModelImpl.queryCount(criteria);
	}

	public IClubMemberCardValue[] queryClubMemberCardsByMemberId(long memberId) throws Exception {
		AbstractClubMemberCardQueryModelImpl queryModelImpl = (AbstractClubMemberCardQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberCardQueryModelImpl.class);
		ClubMemberCardBean condition = new ClubMemberCardBean();
		condition.setMemberId(memberId);
		IClubMemberCardValue[] values = (IClubMemberCardValue[]) queryModelImpl.queryData(new DataContainer[] { condition }, -1, -1);
		return values;
	}

	public IClubMemberCardValue[] queryClubMemberCards(String criteria, int startNum, int endNum) throws Exception {
		AbstractClubMemberCardQueryModelImpl queryModelImpl = (AbstractClubMemberCardQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberCardQueryModelImpl.class);
		return (IClubMemberCardValue[]) queryModelImpl.queryData(criteria, startNum, endNum);
	}

	public int queryClubMemberCount(DataContainer condition) throws Exception {
		return ((AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class)).queryCount(new DataContainer[] { condition });
	}

	public int queryClubMemberCount(String criteria) throws Exception {
		AbstractClubMemberQueryModelImpl queryModelImpl = (AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class);
		return queryModelImpl.queryCount(criteria);
	}

	public IClubMemberValue[] queryClubMembers(DataContainer condition, int startNum, int endNum) throws Exception {
		AbstractClubMemberQueryModelImpl queryModelImpl = (AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class);
		DataContainerInterface[] results = queryModelImpl.queryData(new DataContainer[] { condition }, startNum, endNum);
		return (IClubMemberValue[]) results;
	}

	public IClubMemberValue[] queryClubMembers(String criteria, int startNum, int endNum) throws Exception {
		AbstractClubMemberQueryModelImpl queryModelImpl = (AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class);
		DataContainerInterface[] results = queryModelImpl.queryData(criteria, startNum, endNum);
		return (IClubMemberValue[]) results;
	}

	public int queryClubMembersCount(String criteria) throws Exception {
		AbstractClubMemberQueryModelImpl queryModelImpl = (AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class);
		return queryModelImpl.queryCount(criteria);
	}

	public ICmDealReturnData saveClubMember(IClubMemberValue clubMemberValue) throws Exception {
		IVOClubMemberValue voClubMemberValue = new VOClubMemberBean();
		voClubMemberValue.setClubMember(clubMemberValue);
		AbstractClubMemberDealModelImpl clubMemberDealModelImpl = (AbstractClubMemberDealModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberDealModelImpl.class);
		return clubMemberDealModelImpl.deal(voClubMemberValue);
	}

	public IClubMemberCardValue[] queryClubMemberCards(DataContainer condition, int startNum, int endNum) throws Exception {
		AbstractClubMemberCardQueryModelImpl queryModelImpl = (AbstractClubMemberCardQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberCardQueryModelImpl.class);
		DataContainerInterface[] results = queryModelImpl.queryData(new DataContainer[] { condition }, startNum, endNum);
		return (IClubMemberCardValue[]) results;
	}

	public IClubMemberCardValue[] queryClubMemberCardsByMemberIds(long[] memberId, long clubId, int startNum, int endNum) throws Exception {
		AbstractClubMemberCardQueryModelImpl queryModelImpl = (AbstractClubMemberCardQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberCardQueryModelImpl.class);
		DataContainerInterface[] results = queryModelImpl.queryClubMemberCardsByMemberIds(memberId, clubId, true, startNum, endNum);
		return (IClubMemberCardValue[]) results;
	}

	public IClubMemberValue[] queryClubMembersByCustIds(long[] custId, long clubId, int startNum, int endNum) throws Exception {
		AbstractClubMemberQueryModelImpl queryModelImpl = (AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class);
		DataContainerInterface[] results = queryModelImpl.queryClubMembersByCustIds(custId, clubId, startNum, endNum);
		return (IClubMemberValue[]) results;
	}

	public ICmDealReturnData saveClubMemberCard(IClubMemberCardValue clubMemberCardValue) throws Exception {
		IVOClubMemberValue voclubmMemberValue = new VOClubMemberBean();
		voclubmMemberValue.setClubMemberCard(clubMemberCardValue);
		AbstractClubMemberDealModelImpl clubMemberDealModelImpl = (AbstractClubMemberDealModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberDealModelImpl.class);
		return clubMemberDealModelImpl.deal(voclubmMemberValue);
	}

	public int queryClubMembersByCustIdsCount(long[] custId, long clubId) throws Exception {
		AbstractClubMemberQueryModelImpl queryModelImpl = (AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class);
		return queryModelImpl.queryClubMemberCountByCustIds(custId, clubId);
	}

	public IClubMemberCardValue queryClubMemberCardByMemberId(long memberId) throws Exception {
		AbstractClubMemberCardQueryModelImpl queryModelImpl = (AbstractClubMemberCardQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberCardQueryModelImpl.class);
		ClubMemberCardBean condition = new ClubMemberCardBean();
		condition.setMemberId(memberId);
		condition.initProperty("IS_ONLY_VALIDATED", true);
		DataContainerInterface[] cardValues = queryModelImpl.queryData(new DataContainer[] { condition }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cardValues)) {
			return (IClubMemberCardValue) cardValues[0];
		}
		return null;
	}

	public IClubMemberValue queryClubMemberByMemberId(String memberId) throws Exception {
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberValue.S_MemberId, memberId);
		condition.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);
		IClubMemberValue[] clubMemberValues = this.queryClubMembers(condition, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(clubMemberValues)) {
			return clubMemberValues[0];
		}
		return null;
	}

	public IClubMemberValue queryVIPClubMemberByBillId(String billId) throws Exception {
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberValue.S_BillId, billId);
		condition.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
		condition.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);
		IClubMemberValue[] clubMemberValues = this.queryClubMembers(condition, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(clubMemberValues)) {
			return clubMemberValues[0];
		}
		return null;
	}

	public IClubMemberValue queryVIPClubMemberByUserId(long userId) throws Exception {
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberValue.S_UserId, userId);
		condition.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
		condition.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);
		IClubMemberValue[] clubMemberValues = this.queryClubMembers(condition, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(clubMemberValues)) {
			return clubMemberValues[0];
		}
		return null;
	}

	public int queryVIPClubMemberCountByUserId(long userId) throws Exception {
		int vipCount = 0;
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberValue.S_UserId, userId);
		condition.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
		condition.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);
		vipCount = this.queryClubMemberCount(condition);

		return vipCount;
	}

	public IClubActionRecValue[] queryActionRecValuesByMemberId(long memberId, int startNum, int endNum) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubActionRecValue.S_MemberId, memberId);
		AbstractClubActionRecQueryModelImpl busi = (AbstractClubActionRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionRecQueryModelImpl.class);
		IClubActionRecValue[] values = (IClubActionRecValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
		return values;
	}

	public int queryActionRecValuesCountByMemberId(long memberId) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubActionRecValue.S_MemberId, memberId);
		AbstractClubActionRecQueryModelImpl busi = (AbstractClubActionRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubActionRecQueryModelImpl.class);
		int count = busi.queryCount(new DataContainer[] { dContainer });
		return count;
	}

	public IClubServiceAdjustValue[] queryClubServiceAdjustValuesByMemberId(long memberId, int startNum, int endNum) throws Exception {
		DataContainer dContainer = new DataContainer();
		AbstractClubServiceAdjustQueryModelImpl busi = (AbstractClubServiceAdjustQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceAdjustQueryModelImpl.class);
		dContainer.set(IClubServiceAdjustValue.S_MemberId, memberId);
		IClubServiceAdjustValue[] values = (IClubServiceAdjustValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
		return values;
	}

	public int queryClubServiceAdjustValuesCountByMemberId(long memberId) throws Exception {
		DataContainer dContainer = new DataContainer();
		AbstractClubServiceAdjustQueryModelImpl busi = (AbstractClubServiceAdjustQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceAdjustQueryModelImpl.class);
		dContainer.set(IClubServiceAdjustValue.S_MemberId, memberId);
		int count = busi.queryCount(new DataContainer[] { dContainer });
		return count;
	}

	public IClubServiceRecValue[] queryClubServiceRecValuesByMemberId(long memberId, int startNum, int endNum) throws Exception {
		AbstractClubServiceRecQueryModelImpl busi = (AbstractClubServiceRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceRecQueryModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceRecValue.S_MemberId, memberId);
		IClubServiceRecValue[] values = (IClubServiceRecValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
		return values;
	}

	public int queryClubServiceRecValuesCountByMemberId(long memberId) throws Exception {
		AbstractClubServiceRecQueryModelImpl busi = (AbstractClubServiceRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceRecQueryModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceRecValue.S_MemberId, memberId);
		int count = busi.queryCount(new DataContainer[] { dContainer });
		return count;
	}

	// 俱乐部会员对象
	public IClubMemberValue[] queryClubMember(long custId, int start, int end) throws Exception {
		DataContainer da = new DataContainer();
		da.set(IClubMemberValue.S_CustId, custId);
		da.set("IS_VIP", CmConstants.CommonPageParamName.IS_VIP_TRUE);
		return queryClubMembers(da, start, end);
	}

	// 俱乐部会员总行数
	public int queryClubMemberCount(long custId) throws Exception {
		DataContainer da = new DataContainer();
		da.set(IClubMemberValue.S_CustId, custId);
		da.set("IS_VIP", CmConstants.CommonPageParamName.IS_VIP_TRUE);
		return queryClubMemberCount(da);
	}

	public DataContainer[] queryClubMemberList(String criteria, int startNum, int endNum) throws Exception {
		AbstractClubMemberQueryModelImpl queryModelImpl = (AbstractClubMemberQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubMemberQueryModelImpl.class);
		DataContainerInterface[] results = queryModelImpl.queryData(criteria, startNum, endNum);
		IClubMemberValue[] iclubMember = (IClubMemberValue[]) results;
		if (iclubMember == null || iclubMember.length < 0) {
			return new DataContainer[0];
		}
		DataContainer[] dt = new DataContainer[iclubMember.length];
		for (int i = 0; i < dt.length; i++) {
			DataContainer da = new DataContainer();
			da.copy(iclubMember[i]);
			// 根据memberId查询managerId
			IBOCmUserManagerValue[] IuserManager = queryUserManager(iclubMember[i].getMemberId(), -1, -1);
			if (IuserManager != null && IuserManager.length > 0) {
				for (int j = 0; j < IuserManager.length; j++) {
					if (IuserManager[j].getRelType() == CmLnConstants.CmRelType.RELTYPE4) {// 经理组
						ICmCustManagerTeamSV icmCustManage = (ICmCustManagerTeamSV) ServiceFactory.getService(ICmCustManagerTeamSV.class);
						IBOCmCustManagerTeamValue iboCustManagerTeam = icmCustManage.queryCmCustManagerTeam(IuserManager[j].getManagerId(), -1, -1);
						if (iboCustManagerTeam != null) {
							da.set("TELE_NAME_TEAM", iboCustManagerTeam.getTeamName());
						} else {
							da.set("TELE_NAME_TEAM", "");
						}
						da.set("TELE_NAME", "");
					}
					if (IuserManager[j].getRelType() == CmLnConstants.CmRelType.RELTYPE5) {// 经理
						// 根据managerId查询电话经理对象
						ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
						IQBOSecCustManagerValue boSec = iseCm.getEffectAmInfo(IuserManager[j].getManagerId(), CmLnConstants.CM_MANAGER_TYPE.STS_5);
						if (CmCommonUtil.isNotEmptyObject(boSec)) {
							// TODO 对象缺少managerName对象
							da.set("TELE_NAME", boSec.getManagername());
							// da.set("TELE_NAME","");
						} else {
							da.set("TELE_NAME", "");
						}
						da.set("TELE_NAME_TEAM", "");
					}
				}
			} else {
				da.set("TELE_NAME_TEAM", "");
				da.set("TELE_NAME", "");
			}
			dt[i] = da;
		}
		return dt;
	}

	// 查询vip经理关系
	public IBOCmUserManagerValue[] queryUserManager(long memberId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmClubServiceAdjustValue.S_State).append(" = :state ");
		condition.append(" AND ").append(IBOCmUserManagerValue.S_MemberId).append(" = :memberId ");
		parameter.put("state", CmConstants.RecordState.USE);
		parameter.put("memberId", memberId);
		IBOCmUserManagerValue[] adjustValues = (IBOCmUserManagerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmUserManagerBean.class, condition.toString(),
				parameter, -1, -1);
		return adjustValues;
	}

	public IBOCmClubMemberTempValue[] queryClubMemberTemp(DataContainer dc) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmClubMemberTempValue.S_State).append(" = :state ");
		parameter.put("state", CmLnConstants.ClubTempState.ClubTempState_0);
		IBOCmClubMemberTempValue[] tempValues = (IBOCmClubMemberTempValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubMemberTempBean.class, condition.toString(),
				parameter, -1, -1);
		return tempValues;
	}
}
