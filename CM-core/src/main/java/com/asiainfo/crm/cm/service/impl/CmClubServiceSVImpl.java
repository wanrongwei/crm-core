package com.asiainfo.crm.cm.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceCycleQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceDealBusiModelImpl.AdjustServiceCalResult;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceRecQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceVdoingDetailQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceVdoingQueryModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmDistrictUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberCardBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberTempBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmVipElementBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberTempValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElementValue;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.club.bo.BOLnCmxClubMemberBean;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmxClubMemberValue;
import com.asiainfo.crm.cm.ln.club.service.interfaces.ICmLnClubMemberSV;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOClubMemberBean;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceAdjustValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceCylceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingDetailValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingValue;
import com.asiainfo.crm.cm.model.ivalues.ICmReturnData;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceValue;
import com.asiainfo.crm.cm.service.interfaces.ICmClubMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubServiceSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

public class CmClubServiceSVImpl implements ICmClubServiceSV {

	private static final Log log = LogFactory.getLog(CmClubServiceSVImpl.class);

	public int queryAvailableServiceTimes(long clubMemberId, long serviceId) throws Exception {
		return ((AbstractClubServiceDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceDealBusiModelImpl.class))
				.queryAvailableServiceTimes(clubMemberId, serviceId);
	}

	public int queryTotalServiceTimes(long clubMemberId, long serviceId) throws Exception {
		// 当前周期内总可用次数
		int totalTimes = 0;
		/*
		 * 临时额度定义的优先级最高，需要先看是否还有临时额度可用，如果有则直接以临时额度为准；否则按照正常流程计算可用服务次数。
		 */
		AbstractClubServiceDealBusiModelImpl busiModel = (AbstractClubServiceDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceDealBusiModelImpl.class);
		AdjustServiceCalResult result = busiModel.calculateAdjustServiceTimes(clubMemberId, serviceId);
		// 将计算结果赋给totalTimes
		totalTimes = result.getTimes();
		if (!result.isHasAdjustService()) {
			totalTimes = busiModel.calculateNormalServiceTimes(clubMemberId, serviceId);
		}
		return totalTimes;
	}

	public ICmReturnData enjoyService(long userId, long clubMemberId, long serviceId, int times, int roamFlag, String provinceCode, String busiCode, String remarks,
			int serviceType, int memberLevel) throws Exception {
		return ((AbstractClubServiceDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceDealBusiModelImpl.class)).enjoyService(userId, clubMemberId, serviceId,
				times, roamFlag, provinceCode, busiCode, remarks, serviceType, memberLevel);
	}

	public ICmReturnData enjoyService4LnVip(long userId, long clubMemberId, long serviceId, int times, int roamFlag, String provinceCode, String busiCode, String remarks,
			int serviceType, int memberLevel, int enjoyType) throws Exception {
		return ((AbstractClubServiceDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceDealBusiModelImpl.class)).enjoyService4LnVip(userId, clubMemberId,
				serviceId, times, roamFlag, provinceCode, busiCode, remarks, serviceType, memberLevel, enjoyType);
	}

	public IClubServiceValue queryClubServiceById(long serviceId) throws Exception {
		AbstractClubServiceQueryModelImpl queryModel = (AbstractClubServiceQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceQueryModelImpl.class);
		return (IClubServiceValue) queryModel.queryServiceById(serviceId);
	}

	public void saveClubService(IClubServiceValue[] clubServiceValues) throws Exception {
		((AbstractClubServiceDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceDealBusiModelImpl.class)).saveClubService(clubServiceValues);
	}

	public void saveClubService(IVOClubServiceValue voClubServiceValue) throws Exception {
		((AbstractClubServiceDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceDealBusiModelImpl.class)).deal(voClubServiceValue);
	}

	public IClubServiceValue[] queryClubServicesByClubId(long clubId, int startNum, int endNum) throws Exception {
		return (IClubServiceValue[]) ((AbstractClubServiceQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceQueryModelImpl.class)).queryServicesByClubId(clubId,
				startNum, endNum);
	}

	public IClubServiceRecValue[] queryClubServiceRecs(DataContainer condition, int startNum, int endNum) throws Exception {
		return (IClubServiceRecValue[]) ((AbstractClubServiceRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceRecQueryModelImpl.class)).queryData(
				new DataContainer[] { condition }, startNum, endNum);
	}

	public int queryClubServiceRecsCount(DataContainer condition) throws Exception {
		return ((AbstractClubServiceRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceRecQueryModelImpl.class)).queryCount(new DataContainer[] { condition });
	}

	public boolean checkEnjoyService(long userId, long clubMemberId, long serviceId, int times, ICmReturnData returnData) throws Exception {
		return ((AbstractClubServiceDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceDealBusiModelImpl.class)).canEnjoyService(userId, clubMemberId, serviceId,
				times, returnData);
	}

	public IClubServiceValue[] queryClubServices(DataContainer condition, int startNum, int endNum) throws Exception {
		return (IClubServiceValue[]) ((AbstractClubServiceQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceQueryModelImpl.class)).queryData(
				new DataContainer[] { condition }, startNum, endNum);
	}

	public int queryClubServiceCountByClubId(long clubId) throws Exception {
		AbstractClubServiceQueryModelImpl busi = (AbstractClubServiceQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceQueryModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceValue.S_ClubId, clubId);
		return busi.queryCount(new DataContainer[] { dContainer });
	}

	public IClubServiceRecValue[] queryClubServiceRecInDcs(long memberId, long[] serviceId, int startNum, int endNum) throws Exception {
		return (IClubServiceRecValue[]) ((AbstractClubServiceRecQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceRecQueryModelImpl.class))
				.queryClubServiceRecsInDcs(memberId, serviceId, startNum, endNum);
	}

	public IClubServiceValue[] queryClubService(String criteria, int startNum, int endNum) throws Exception {
		AbstractClubServiceQueryModelImpl busi = (AbstractClubServiceQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceQueryModelImpl.class);
		return (IClubServiceValue[]) busi.queryData(criteria, startNum, endNum);
	}

	public int queryClubServiceCount(String criteria) throws Exception {
		AbstractClubServiceQueryModelImpl busi = (AbstractClubServiceQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceQueryModelImpl.class);
		return busi.queryCount(criteria);
	}

	public IClubServiceCylceValue[] queryClubServiceCylces(String criteria, int startNum, int endNum) throws Exception {
		AbstractClubServiceCycleQueryModelImpl busi = (AbstractClubServiceCycleQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceCycleQueryModelImpl.class);
		return (IClubServiceCylceValue[]) busi.queryData(criteria, startNum, endNum);
	}

	public int queryClubServiceCylcesCount(String criteria) throws Exception {
		AbstractClubServiceCycleQueryModelImpl busi = (AbstractClubServiceCycleQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceCycleQueryModelImpl.class);
		return busi.queryCount(criteria);
	}

	public IClubServiceCylceValue[] queryClubServiceCylcesByServiceId(long serviceId, int startNum, int endNum) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceCylceValue.S_ServiceId, serviceId);
		AbstractClubServiceCycleQueryModelImpl busi = (AbstractClubServiceCycleQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceCycleQueryModelImpl.class);
		return (IClubServiceCylceValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
	}

	public int queryClubServiceCylcesCountByServiceId(long serviceId) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceCylceValue.S_ServiceId, serviceId);
		AbstractClubServiceCycleQueryModelImpl busi = (AbstractClubServiceCycleQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceCycleQueryModelImpl.class);
		return busi.queryCount(new DataContainer[] { dContainer });
	}

	public IClubServiceCylceValue queryClubServiceCycleById(long cycleId) throws Exception {
		AbstractClubServiceCycleQueryModelImpl busi = (AbstractClubServiceCycleQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceCycleQueryModelImpl.class);
		DataContainer dContainer = busi.queryServiceCycleById(cycleId);
		return (IClubServiceCylceValue) dContainer;
	}

	public IClubServiceVdoingValue querClubServiceVdoingById(long dimensionId) throws Exception {
		AbstractClubServiceVdoingQueryModelImpl busi = (AbstractClubServiceVdoingQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceVdoingQueryModelImpl.class);
		DataContainer dContainer = busi.queryServiceCycleById(dimensionId);
		return (IClubServiceVdoingValue) dContainer;
	}

	public IClubServiceVdoingValue[] queryClubServiceVdoingsByServiceId(long serviceId, int startNum, int endNum) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceVdoingValue.S_ServiceId, serviceId);
		AbstractClubServiceVdoingQueryModelImpl busi = (AbstractClubServiceVdoingQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceVdoingQueryModelImpl.class);
		return (IClubServiceVdoingValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
	}

	public int queryClubServiceVdoingsCountByServiceId(long serviceId) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceVdoingValue.S_ServiceId, serviceId);
		AbstractClubServiceVdoingQueryModelImpl busi = (AbstractClubServiceVdoingQueryModelImpl) CmServiceFactory.getBusiMode(AbstractClubServiceVdoingQueryModelImpl.class);
		return busi.queryCount(new DataContainer[] { dContainer });
	}

	public IClubServiceVdoingDetailValue queryClubServiceVdoingDetailValueById(long detailId) throws Exception {
		AbstractClubServiceVdoingDetailQueryModelImpl busi = (AbstractClubServiceVdoingDetailQueryModelImpl) CmServiceFactory
				.getBusiMode(AbstractClubServiceVdoingDetailQueryModelImpl.class);
		return (IClubServiceVdoingDetailValue) busi.queryServiceCycleById(detailId);
	}

	public IClubServiceVdoingDetailValue[] queryClubServiceVdoingDetailValuesByDimensionId(long dimensionId, int startNum, int endNum) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceVdoingDetailValue.S_DimensionId, dimensionId);
		AbstractClubServiceVdoingDetailQueryModelImpl busi = (AbstractClubServiceVdoingDetailQueryModelImpl) CmServiceFactory
				.getBusiMode(AbstractClubServiceVdoingDetailQueryModelImpl.class);
		return (IClubServiceVdoingDetailValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
	}

	public int queryClubServiceVdoingDetailValuesCountByDimensionId(long dimensionId) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(IClubServiceVdoingDetailValue.S_DimensionId, dimensionId);
		AbstractClubServiceVdoingDetailQueryModelImpl busi = (AbstractClubServiceVdoingDetailQueryModelImpl) CmServiceFactory
				.getBusiMode(AbstractClubServiceVdoingDetailQueryModelImpl.class);
		return busi.queryCount(new DataContainer[] { dContainer });
	}

	public IBOCmVipElementValue[] queryCmVipElements(String billId, long userId, int elementType) throws Exception {
		if (StringUtils.isBlank(billId) && userId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1= 1 ");
		if (StringUtils.isNotBlank(billId)) {
			condition.append(" AND ").append(IBOCmVipElementValue.S_BillId).append("  =:billId ");
			parameter.put("billId", billId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmVipElementValue.S_UserId).append("  =:userId ");
			parameter.put("userId", userId);
		}
		if (elementType > 0) {
			condition.append(" AND ").append(IBOCmVipElementValue.S_ElementType).append("  =:elementType ");
			parameter.put("elementType", elementType);
		}
		IBOCmVipElementValue[] vipElementValues = (IBOCmVipElementValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmVipElementBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isEmptyObject(vipElementValues)) {
			return new IBOCmVipElementValue[0];
		}
		return vipElementValues;
	}

	public IBOCmVipElementValue[] queryOtherVipElements(String billId, long userId) throws Exception {
		if (StringUtils.isBlank(billId) && userId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmVipElementValue.S_ElementType).append("  <>:elementType ");
		parameter.put("elementType", CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN);
		if (StringUtils.isNotBlank(billId)) {
			condition.append(" AND ").append(IBOCmVipElementValue.S_BillId).append("  =:billId ");
			parameter.put("billId", billId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmVipElementValue.S_UserId).append("  =:userId ");
			parameter.put("userId", userId);
		}
		IBOCmVipElementValue[] vipElementValues = (IBOCmVipElementValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmVipElementBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isEmptyObject(vipElementValues)) {
			return new IBOCmVipElementValue[0];
		}
		return vipElementValues;
	}

	public void saveVipElement(IBOCmVipElementValue[] cmVipElement) throws Exception {
		ICmCommonInnerSV icmCommonInnerSv = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		BOCmVipElementBean[] vipElementBean = new BOCmVipElementBean[cmVipElement.length];
		for (int i = 0; i < cmVipElement.length; i++) {
			vipElementBean[i] = new BOCmVipElementBean();
			vipElementBean[i].copy(cmVipElement[i]);
		}
		icmCommonInnerSv.saveBeans(vipElementBean);
	}

	public void delVipInfo(long userId) throws Exception {
		// 1.删除VIP真实信息
		IBOLnCmxClubMemberValue cmxClubMemberValue = new BOLnCmxClubMemberBean();
		cmxClubMemberValue.initProperty(IBOLnCmxClubMemberValue.S_UserId, Long.valueOf(userId));
		cmxClubMemberValue.delete();
		CmxServiceFactory.getLnClubMemberSV().saveLnClubMemberExt(new IBOLnCmxClubMemberValue[] { cmxClubMemberValue });

		IClubMemberValue clubMemberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByUserId(userId);
		if (clubMemberValue != null) {
			long memberId = clubMemberValue.getMemberId();
			IVOClubMemberValue voClubMemberValue = new VOClubMemberBean();
			// 2.删除VIP成员
			clubMemberValue.delete();
			voClubMemberValue.setClubMember(clubMemberValue);

			// 3.删除VIP发卡信息
			DataContainer condition = new DataContainer();
			condition.set(IClubMemberCardValue.S_MemberId, Long.valueOf(memberId));
			IClubMemberCardValue[] memberCardValues = CmServiceFactory.getClubMemberSV().queryClubMemberCards(condition, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(memberCardValues)) {
				for (IClubMemberCardValue cardValue : memberCardValues) {
					cardValue.delete();
					voClubMemberValue.setClubMemberCard(cardValue);
				}

			}

			// 4.删除VIP活动信息
			IClubActionRecValue[] clubActionRecValues = CmServiceFactory.getClubActivitySV().queryClubActionRecs(condition, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(clubActionRecValues)) {
				for (IClubActionRecValue actionRecValue : clubActionRecValues) {
					actionRecValue.delete();
					voClubMemberValue.setClubActionRec(actionRecValue);
				}
			}

			// 5.删除VIP服务记录
			IClubServiceRecValue[] clubServiceRecValues = CmServiceFactory.getClubServiceSV().queryClubServiceRecs(condition, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(clubServiceRecValues)) {
				for (IClubServiceRecValue serviceRecValue : clubServiceRecValues) {
					serviceRecValue.delete();
					voClubMemberValue.setClubServiceRec(serviceRecValue);
				}
			}

			// 6.删除VIP服务调整信息
			IClubServiceAdjustValue[] clubServiceAdjustValues = CmServiceFactory.getClubMemberSV().queryClubServiceAdjustValuesByMemberId(memberId, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(clubServiceRecValues)) {
				for (IClubServiceAdjustValue adjustValue : clubServiceAdjustValues) {
					adjustValue.delete();
					voClubMemberValue.setClubServiceAdjust(adjustValue);
				}
			}
			CmServiceFactory.getClubMemberSV().saveClubMember(voClubMemberValue);

			// 7.删除VIP与客户经理关系
			Map queryPara = new HashMap();
			queryPara.put("userId", userId);
			BOCmUserManagerBean[] userManagerValues1 = null;
			String conditonSql = "and user_id = :userId ";
			StringBuilder userSB = new StringBuilder("");
			userSB.append("select * from ").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmUserManagerBean.class).getMapingEnty());

			userManagerValues1 = (BOCmUserManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmUserManagerBean.class,
					CmLnCommonUtil.getQueryResult(userSB.toString(), conditonSql, -1, -1, queryPara), queryPara);

			if (userManagerValues1 != null && userManagerValues1.length > 0) {
				for (BOCmUserManagerBean value1 : userManagerValues1)
					value1.delete();
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(userManagerValues1);
			}
		}
	}

	public Map vipUserFreeService(Map paraMap) throws Exception {
		if (paraMap == null) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		String billId = CmCommonUtil.isEmptyObj(paraMap.get("ServiceNum")) ? "" : paraMap.get("ServiceNum").toString();
		int servType = CmCommonUtil.isEmptyObj(paraMap.get("ServiceId")) ? -1 : Integer.parseInt(paraMap.get("ServiceId").toString());
		if (StringUtils.isBlank(billId) || servType < 0) {
			// 手机号码及服务类型不能为空
			ExceptionUtil.throwBusinessException("CMS95000068");
		}
		// 免费服务转换
		servType = servType == 1 ? CmConstants.Club.SERVICE_TYPE_PLANE : CmConstants.Club.SERVICE_TYPE_TRAIN;
		ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (userBean == null) {
			// 根据手机号码[{0}]没有查询到用户信息！
			ExceptionUtil.throwBusinessException("CMS5000154", billId);
		}
		// 查询会员是否存在
		IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryVIPClubMemberByBillId(billId);
		if (memberValue == null) {
			// 该用户[{0}]没有免费服务可以享用！
			ExceptionUtil.throwBusinessException("CMS5000162", billId);
		}

		// 得到服务的serviceId
		IClubServiceValue serviceValue = null;
		// 通过俱乐部编码查询俱乐部服务信息
		IClubServiceValue[] serviceValues = CmServiceFactory.getClubServiceSV().queryClubServicesByClubId(memberValue.getClubId(), -1, -1);
		for (IClubServiceValue value : serviceValues) {
			if (value.getServiceType() == servType) {
				serviceValue = value;
				break;
			}
		}
		if (serviceValue == null) {
			// 没有对应的服务定义！
			ExceptionUtil.throwBusinessException("CMS5000163");
		}
		int FreeTimes=0;
		if(null!=serviceValue){
			FreeTimes = CmServiceFactory.getClubServiceSV().queryAvailableServiceTimes(memberValue.getMemberId(), serviceValue.getServiceId());
		}
		if (FreeTimes > 0) {
			// 扣减一次
			CmServiceFactory.getClubServiceSV().enjoyService(userBean.getUserId(), memberValue.getMemberId(), serviceValue.getServiceId(), 1, -1, CmDistrictUtil.getProvinceCode(),
					null, null, servType, memberValue.getMemberLevel());
		} else {
			// 该用户[{0}]没有免费服务可以享用！
			ExceptionUtil.throwBusinessException("CMS5000162", billId);
		}
		Map result = new HashMap();
		result.put("FreeTimes", Integer.valueOf(FreeTimes - 1));
		return result;
	}

	public Boolean dealVipLevelTask(String billId, IBOCmClubMemberTempValue tempValues, ICmCommonSV sv, ICmTeamInvokeSV cmTeamSv, ICmClubMemberSV clubMemberSV,
			ICmCustomerSV customerSV, ICmCommonInnerSV innerSv, ICmClubServiceSV clubSv, ICmLnClubMemberSV lnClubMemberSv, List<BOCmClubMemberBean> memberList,
			List<BOCmClubMemberCardBean> memberCardList, List<BOCmClubMemberTempBean> tempList) throws Exception {
		if (CmCommonUtil.isEmptyObject(tempValues))
			return true;

		boolean dealState = true;
		BOCmClubMemberTempBean tempBean = null;
		IQUserBaseInfoValue userInfo = null;
		Map parameter = new HashMap();
		BOCmIndivCustomerBean[] customerinfo = null;
		int newLevel = -1;
		long brandId = -1;
		int isGlobal = -1;

		tempBean = (BOCmClubMemberTempBean) tempValues;
		BOCmClubMemberBean clubMemberBean = new BOCmClubMemberBean();
		BOCmClubMemberCardBean clubCardBean = new BOCmClubMemberCardBean();
		try {
			// 循环获取billId
			// 重算VIP级别
			userInfo = cmTeamSv.getUserBaseInfoByUserId(tempBean.getUserId());
			if (userInfo == null)
				throw new Exception("User information does not exist!");
			// 获取客户信息
			String queryCustomerSql = "select * from cm_indiv_customer t where t.cust_id = :custId ";
			parameter.clear();
			parameter.put("custId", userInfo.getCustId());
			customerinfo = (BOCmIndivCustomerBean[]) innerSv.getBeansFromSql(BOCmIndivCustomerBean.class, queryCustomerSql, parameter);
			if (customerinfo == null || customerinfo.length <= 0)
				throw new Exception("Customer information is not exist!");

			String queryClubSql = "SELECT m.member_id,m.club_id,m.user_id,m.bill_id,m.member_code,m.member_name,m.cert_type,"
					+ "m.cert_code,m.member_pswd,m.member_level,m.member_source,m.state,m.city_id,m.region_id,m.county_id,d.record_id,"
					+ "d.card_code,d.deliver_region,d.card_source,d.card_type,d.card_year,d.card_level,d.state as card_state,d.card_flag"
					+ " FROM cm_club_member_card d, cm_club_member m" + " where m.state = 'U'  and (d.state = 'U' or d.state is null )and m.member_id = d.member_id(+)"
					+ " and m.club_id = :clubId and m.bill_id = :billId ";

			parameter.clear();
			parameter.put("clubId", CmConstants.Club.VIP_CLUB_ID);
			parameter.put("billId", billId);
			DataContainerInterface[] dcs = innerSv.getBeansFromSql(DataContainer.class, queryClubSql, parameter);
			if (CmCommonUtil.isNotEmptyObject(dcs)) {
				clubMemberBean.copy(dcs[0]);
				clubCardBean.copy(dcs[0]);
				if (clubCardBean.getRecordId() <= 0) {
					clubCardBean.clear();
				}
			}
			newLevel = sv.getVipLevle(billId, userInfo);
			// 判断是否是全球通品牌
			brandId = userInfo.getBrandId();
			isGlobal = brandId == CmConstants.USER_BRAND.USER_BRAND_GLOBAL ? 1 : 0;
			if (newLevel == 0) {
				// 如果级别为0，又不存在VIP表，则判断是否全球通号码，是则新增
				if (clubMemberBean.getMemberId() <= 0) {
					// 新增VIP客户
					if (isGlobal == 1) {
						clubMemberBean.setStsToNew();
						clubMemberBean.set(IClubMemberValue.S_MemberId, CmCommonUtil.getNewSequence(BOCmClubMemberBean.class));
						clubMemberBean.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
						clubMemberBean.set(IClubMemberValue.S_PartyId, customerinfo[0].getPartyId());
						clubMemberBean.set(IClubMemberValue.S_CustId, customerinfo[0].getCustId());
						clubMemberBean.set(IClubMemberValue.S_UserId, userInfo.getUserId());
						clubMemberBean.set(IClubMemberValue.S_BillId, billId);
						clubMemberBean.set(IClubMemberValue.S_MemberName, customerinfo[0].getCustName());
						clubMemberBean.set(IClubMemberValue.S_CertType, customerinfo[0].getCustCertType());
						clubMemberBean.set(IClubMemberValue.S_CertCode, customerinfo[0].getCustCertCode());
						clubMemberBean.set(IClubMemberValue.S_MemberLevel, newLevel);// 会员级别
						clubMemberBean.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);// 状态
						clubMemberBean.set(IClubMemberValue.S_RegionId, customerinfo[0].getRegionId());
						clubMemberBean.set(IClubMemberValue.S_CityId, userInfo.getAreaCode());
						clubMemberBean.set(IClubMemberValue.S_CountyId, userInfo.getCountryCode());
						clubMemberBean.set(IClubMemberValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
						clubMemberBean.set(IClubMemberValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
						clubMemberBean.set(IClubMemberValue.S_Remarks, "Recalculation VIP added");
						memberList.add(clubMemberBean);
					}
				}
				// 如果级别为0，存在VIP表，则判断是否全球通号码，不是则删除该VIP号码
				else {
					// 不是全球通,级别为0
					if (isGlobal == 0) {
						// TODO 删除VIP信息
						clubMemberBean.set(IClubMemberValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
						clubMemberBean.set(IClubMemberValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
						clubMemberBean.delete();
						memberList.add(clubMemberBean);
						// TODO 删除发卡记录
						if (clubCardBean.getRecordId() > 0) {
							clubCardBean.set(IClubMemberCardValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
							clubCardBean.set(IClubMemberCardValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
							clubCardBean.delete();
							memberCardList.add(clubCardBean);
						}

						// 7.删除VIP与客户经理关系
						Map queryPara = new HashMap();
						queryPara.put("userId", userInfo.getUserId());
						BOCmUserManagerBean[] userManagerValues1 = null;
						String conditonSql = "and user_id = :userId ";
						StringBuilder userSB = new StringBuilder("");
						userSB.append("select * from ").append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmUserManagerBean.class).getMapingEnty());

						userManagerValues1 = (BOCmUserManagerBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmUserManagerBean.class,
								CmLnCommonUtil.getQueryResult(userSB.toString(), conditonSql, -1, -1, queryPara), queryPara);

						if (userManagerValues1 != null && userManagerValues1.length > 0) {
							for (BOCmUserManagerBean value1 : userManagerValues1)
								value1.delete();
							CmInnerServiceFactory.getCommonInnerSV().saveBeans(userManagerValues1);
						}
					} else if (isGlobal == 1) {
						clubMemberBean.setStsToOld();
						clubMemberBean.set(IClubMemberValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
						clubMemberBean.set(IClubMemberValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
						clubMemberBean.set(IClubMemberValue.S_MemberLevel, newLevel);
						clubMemberBean.set(IClubMemberValue.S_Remarks, "Recalculation VIP modification");
						memberList.add(clubMemberBean);

						if (clubCardBean.getRecordId() > 0) {
							clubCardBean.set(IClubMemberCardValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
							clubCardBean.set(IClubMemberCardValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
							clubCardBean.delete();
							memberCardList.add(clubCardBean);
						}
					}
				}
				tempBean.delete();
				tempList.add(tempBean);
			} else if (newLevel > 0) {
				// 重算级别>0 ,判断是否已经存在vip记录，是则更新否则新增
				// VIP表存在的情况
				if (clubMemberBean.getMemberId() > 0) {
					clubMemberBean.setStsToOld();
					clubMemberBean.set(IClubMemberValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
					clubMemberBean.set(IClubMemberValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
					clubMemberBean.set(IBOCmClubMemberValue.S_MemberLevel, newLevel);
					clubMemberBean.set(IClubMemberValue.S_Remarks, "Recalculation VIP modification");
					memberList.add(clubMemberBean);

					// 先判断是否有记录、钻金银记录发卡记录
					if (clubCardBean.getRecordId() > 0) {
						if (newLevel == CmLnConstants.MemberLevel.MemberLevel_1 || newLevel == CmLnConstants.MemberLevel.MemberLevel_2
								|| newLevel == CmLnConstants.MemberLevel.MemberLevel_3) {
							clubCardBean.setStsToOld();
							clubCardBean.set(IClubMemberCardValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
							clubCardBean.set(IClubMemberCardValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
							clubCardBean.set(IClubMemberCardValue.S_CardCode, getVipCardCodeNew(userInfo.getRegionId(), newLevel, clubMemberSV));
							clubCardBean.set(IClubMemberCardValue.S_CardYear, new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()));
							clubCardBean.set(IClubMemberCardValue.S_CardLevel, newLevel);
							memberCardList.add(clubCardBean);
						} else {
							clubCardBean.set(IClubMemberCardValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
							clubCardBean.set(IClubMemberCardValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
							clubCardBean.delete();
							memberCardList.add(clubCardBean);
						}
					} else {
						// 如果调整级别为钻、金、银则记录发卡记录
						if (newLevel == CmLnConstants.MemberLevel.MemberLevel_1 || newLevel == CmLnConstants.MemberLevel.MemberLevel_2
								|| newLevel == CmLnConstants.MemberLevel.MemberLevel_3) {
							// 新增VIP发卡信息
							clubCardBean.set(IClubMemberCardValue.S_RecordId, CmCommonUtil.getNewSequence(BOCmClubMemberCardBean.class));
							clubCardBean.set(IClubMemberCardValue.S_MemberId, clubMemberBean.getMemberId());
							clubCardBean.set(IClubMemberCardValue.S_CardCode, getVipCardCodeNew(customerinfo[0].getRegionId(), newLevel, clubMemberSV));
							clubCardBean.set(IClubMemberCardValue.S_CardType, CmLnConstants.vipCardType.CARD1);
							clubCardBean.set(IClubMemberCardValue.S_CardYear, new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()));
							clubCardBean.set(IClubMemberCardValue.S_CardLevel, newLevel);
							clubCardBean.set(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
							clubCardBean.set(IClubMemberCardValue.S_RegionId, customerinfo[0].getRegionId());
							clubCardBean.set(IClubMemberCardValue.S_CardFlag, CmLnConstants.ClubCardFlag.ClubCardFlag_0);
							clubCardBean.set(IClubMemberCardValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
							clubCardBean.set(IClubMemberCardValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
							memberCardList.add(clubCardBean);
						}
					}
				} else {
					clubMemberBean.setStsToNew();
					clubMemberBean.set(IClubMemberValue.S_MemberId, CmCommonUtil.getNewSequence(BOCmClubMemberBean.class));
					clubMemberBean.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
					clubMemberBean.set(IClubMemberValue.S_PartyId, customerinfo[0].getPartyId());
					clubMemberBean.set(IClubMemberValue.S_CustId, customerinfo[0].getCustId());
					clubMemberBean.set(IClubMemberValue.S_UserId, userInfo.getUserId());
					clubMemberBean.set(IClubMemberValue.S_BillId, billId);
					clubMemberBean.set(IClubMemberValue.S_MemberName, customerinfo[0].getCustName());
					clubMemberBean.set(IClubMemberValue.S_CertType, customerinfo[0].getCustCertType());
					clubMemberBean.set(IClubMemberValue.S_CertCode, customerinfo[0].getCustCertCode());
					clubMemberBean.set(IClubMemberValue.S_MemberPswd, "");// 会员密码
					clubMemberBean.set(IClubMemberValue.S_MemberLevel, newLevel);// 会员级别
					clubMemberBean.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);// 状态
					clubMemberBean.set(IClubMemberValue.S_RegionId, customerinfo[0].getRegionId());
					clubMemberBean.set(IClubMemberValue.S_CityId, userInfo.getAreaCode());
					clubMemberBean.set(IClubMemberValue.S_CountyId, userInfo.getCountryCode());
					clubMemberBean.set(IClubMemberValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
					clubMemberBean.set(IClubMemberValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
					clubMemberBean.set(IClubMemberValue.S_Remarks, "Recalculation VIP added");
					memberList.add(clubMemberBean);

					// 钻金银记录发卡记录
					// 新增VIP发卡信息
					if (newLevel == CmLnConstants.MemberLevel.MemberLevel_1 || newLevel == CmLnConstants.MemberLevel.MemberLevel_2
							|| newLevel == CmLnConstants.MemberLevel.MemberLevel_3) {
						clubCardBean.setStsToNew();
						clubCardBean.set(IClubMemberCardValue.S_RecordId, CmCommonUtil.getNewSequence(BOCmClubMemberCardBean.class));
						clubCardBean.set(IClubMemberCardValue.S_MemberId, clubMemberBean.getMemberId());
						clubCardBean.set(IClubMemberCardValue.S_CardCode, getVipCardCodeNew(customerinfo[0].getRegionId(), newLevel, clubMemberSV));
						clubCardBean.set(IClubMemberCardValue.S_CardType, CmLnConstants.vipCardType.CARD1);
						clubCardBean.set(IClubMemberCardValue.S_CardYear, new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()));
						clubCardBean.set(IClubMemberCardValue.S_CardLevel, newLevel);
						clubCardBean.set(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
						clubCardBean.set(IClubMemberCardValue.S_RegionId, customerinfo[0].getRegionId());
						clubCardBean.set(IClubMemberCardValue.S_CardFlag, CmLnConstants.ClubCardFlag.ClubCardFlag_0);
						clubCardBean.set(IClubMemberCardValue.S_OpId, CmLnConstants.TaskOpAndOgr.OPID);
						clubCardBean.set(IClubMemberCardValue.S_OrgId, CmLnConstants.TaskOpAndOgr.ORGID);
						memberCardList.add(clubCardBean);
					}
				}
				tempBean.delete();
				tempList.add(tempBean);
			}
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			if (log.isErrorEnabled()) {
				log.error(e.getMessage());
			}
			// 更新状态
			tempBean.setStsToOld();
			tempBean.set(IBOCmClubMemberTempValue.S_State, CmLnConstants.ClubTempState.ClubTempState_1);
			tempBean.set(IBOCmClubMemberTempValue.S_FailRemarks, e.getMessage());
			tempList.add(tempBean);
		}
		return dealState;
	}

	// 获取VIP卡号地市
	public String getRegionCode(String regionId) throws Exception {
		String note = null;
		Connection conn = null;
		ResultSet r = null;
		PreparedStatement prep = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			StringBuilder sqlRigionCode = new StringBuilder();
			sqlRigionCode.append("select ");
			sqlRigionCode.append(" decode(?,240,'01',411,'02',412,'03',413,'04',414,'05',415,'06',416,'07',417,'08',418,'09'," + "419,'10',410,'11',421,'12',427,'13',429,'14') ");
			sqlRigionCode.append(" from dual ");
			prep = conn.prepareStatement(sqlRigionCode.toString());

			prep.setString(1, regionId);
			r = prep.executeQuery();
			if (r.next()) {
				note = r.getString(1);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		} finally {
			if (r != null) {
				r.close();
			}
			if (prep != null) {
				prep.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return note;
	}

	// 获取对应地市序列
	public String getVipLevelSeq(String regionId, int clubLevel) throws Exception {
		String note = null;
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet r = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			if (clubLevel == CmLnConstants.MemberLevel.MemberLevel_1 || clubLevel == CmLnConstants.MemberLevel.MemberLevel_2
					|| clubLevel == CmLnConstants.MemberLevel.MemberLevel_3) {
				StringBuilder sqlRigionCode = new StringBuilder();
				sqlRigionCode.append("SELECT SEQ_NEXTVAL('SEQ_VIP_CARD_CODE$SEQ') FROM DUAL");
				prep = conn.prepareStatement(sqlRigionCode.toString());
				r = prep.executeQuery();
				if (r.next()) {
					note = r.getString(1);
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		} finally {
			if (r != null) {
				r.close();
			}
			if (prep != null) {
				prep.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return note;

	}

	public String getVipCardCode(String regionId, int clubLevel) throws Exception {
		StringBuffer cardCode = new StringBuffer();
		String regionCode = regionId;
		String vipLevelSeq = getVipLevelSeq(regionId, clubLevel);
		String cardYear = new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()).substring(2, 4);
		String cardMonth = new SimpleDateFormat("MM").format(CmCommonUtil.getSysDate());
		// 生成16位卡号
		cardCode.append(cardYear).append(cardMonth).append(String.valueOf(clubLevel)).append(regionCode).append(vipLevelSeq);
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberCardValue.S_CardCode, cardCode.toString());
		condition.set(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
		int count = CmServiceFactory.getClubMemberSV().queryClubMemberCardCount(condition);
		// 如果存在重复的卡号，则取下一条卡号
		if (count > 0) {
			return getVipCardCode(regionId, clubLevel);
		}
		return cardCode.toString();
	}

	public String getVipCardCodeNew(String regionId, int clubLevel, ICmClubMemberSV clubMemberSV) throws Exception {
		StringBuffer cardCode = new StringBuffer();
		String regionCode = getRegionCode(regionId);
		String vipLevelSeq = getVipLevelSeq(regionId, clubLevel);
		String cardYear = new SimpleDateFormat("yyyy").format(CmCommonUtil.getSysDate()).substring(2, 4);
		String cardMonth = new SimpleDateFormat("MM").format(CmCommonUtil.getSysDate());
		// 生成16位卡号
		cardCode.append("06").append(cardYear).append(cardMonth).append(String.valueOf(clubLevel)).append(regionCode).append(vipLevelSeq).append("88");
		DataContainer condition = new DataContainer();
		condition.set(IClubMemberCardValue.S_CardCode, cardCode.toString());
		condition.set(IClubMemberCardValue.S_State, CmConstants.RecordState.USE);
		int count = clubMemberSV.queryClubMemberCardCount(condition);
		// 如果存在重复的卡号，则取下一条卡号
		if (count > 0) {
			return getVipCardCodeNew(regionId, clubLevel, clubMemberSV);
		}
		if ("".equals(cardCode.toString()) || cardCode.toString().length() != 16) {
			ExceptionUtil.throwBusinessException("CMS95000200"); // 取卡错误
		}
		return cardCode.toString();
	}
}
