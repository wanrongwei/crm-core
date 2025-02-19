package com.asiainfo.crm.cm.bi2oneframe.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.oneframe.inter.ivalues.Cust3HMessageBean;
import com.ai.oneframe.inter.ivalues.CustGroupBean;
import com.ai.pce.ivalues.IItemValue;
import com.ai.pce.service.interfaces.IProductFSV;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmCallMarketingBean;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmCustLevelBean;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmSceneMarketingBean;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserBean;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserChnnHobbyBean;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserHobbyBean;
import com.asiainfo.crm.cm.bi2oneframe.bo.BOCmUserSatisfactionBean;
import com.asiainfo.crm.cm.bi2oneframe.dao.interfaces.ICmBi2OneframeDAO;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmCallMarketingValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmCustLevelValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmSceneMarketingValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserChnnHobbyValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserHobbyValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserSatisfactionValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserValue;
import com.asiainfo.crm.cm.bi2oneframe.service.interfaces.ICmBi2OneframeSV;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmObjectWrapperFactory;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmManagerSV;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class CmBi2OneframeSVImpl implements ICmBi2OneframeSV {

	private ICmBi2OneframeDAO getCmBi2CsDAO() throws Exception {
		return (ICmBi2OneframeDAO) ServiceFactory.getService(ICmBi2OneframeDAO.class);
	}

	/*
	 * public BiUserChnnHobby queryChnnHobby(String billId) throws Exception {
	 * IBOCmUserChnnHobbyValue[] userChnnHobbyValues = getCmBi2CsDAO().queryChnnHobby(billId);
	 * if (userChnnHobbyValues == null || userChnnHobbyValues.length < 1) {
	 * return null;
	 * }
	 * BiUserChnnHobby result = new BiUserChnnHobby();
	 * result.setBillId(userChnnHobbyValues[0].getBillId());
	 * result.setWebOnlineTimes(userChnnHobbyValues[0].getWebOnlineTimes());
	 * result.setSmChannelTimes(userChnnHobbyValues[0].getSmChannelTimes());
	 * result.setIvrChannelTimes(userChnnHobbyValues[0].getIvrChannelTimes());
	 * result.setCallTimes(userChnnHobbyValues[0].getCallTimes());
	 * result.setChangelCallTimes(userChnnHobbyValues[0].getChangelCallTimes());
	 * return result;
	 * }
	 * public BiCustLevel queryCmCustLevel(String billId) throws Exception {
	 * IBOCmCustLevelValue[] custLevelValues = getCmBi2CsDAO().queryCmCustLevel(billId);
	 * if (custLevelValues == null || custLevelValues.length < 1) {
	 * return null;
	 * }
	 * BiCustLevel result = new BiCustLevel();
	 * result.setBillId(custLevelValues[0].getBillId());
	 * // result.setCustValueLevel(custLevelValues[0].getCustValueLevel());
	 * // result.setCustIntegrityLevel(custLevelValues[0].getCustIntegrityLevel());
	 * // result.setCustSensitiveLevel(custLevelValues[0].getCustSensitiveLevel());
	 * // result.setCustLostLevel(custLevelValues[0].getCustLostLevel());
	 * result.setCustValueLevel(String.valueOf(custLevelValues[0].getCustValueLevel()));
	 * result.setCustIntegrityLevel(String.valueOf(custLevelValues[0].getCustIntegrityLevel()));
	 * result.setCustSensitiveLevel(String.valueOf(custLevelValues[0].getCustSensitiveLevel()));
	 * result.setCustLostLevel(String.valueOf(custLevelValues[0].getCustLostLevel()));
	 * return result;
	 * }
	 * public BiUser queryCmUser(String billId) throws Exception {
	 * IBOCmUserValue[] cmUserValues = getCmBi2CsDAO().queryCmUser(billId);
	 * if (cmUserValues == null || cmUserValues.length < 1) {
	 * return null;
	 * }
	 * BiUser result = new BiUser();
	 * result.setBillId(cmUserValues[0].getBillId());
	 * result.setBrand(cmUserValues[0].getBrand());
	 * result.setVersion(cmUserValues[0].getVersion());
	 * result.setSystem(cmUserValues[0].getSystem());
	 * result.setScreenSize(cmUserValues[0].getScreenSize());
	 * result.setMarketTime(cmUserValues[0].getMarketTime());
	 * result.setIsMobilePay(cmUserValues[0].getIsMobilePay());
	 * result.setIsMobileTvWap(cmUserValues[0].getIsMobileTvWap());
	 * result.setIsMobileTvClient(cmUserValues[0].getIsMobileTvClient());
	 * result.setDownloadMethod(cmUserValues[0].getDownloadMethod());
	 * result.setDownloadWap(cmUserValues[0].getDownloadWap());
	 * result.setMobileSecurity(cmUserValues[0].getMobileSecurity());
	 * result.setMobileEmail(cmUserValues[0].getMobileEmail());
	 * result.setMms(cmUserValues[0].getMms());
	 * result.setGprs(cmUserValues[0].getGprs());
	 * result.setWap(cmUserValues[0].getWap());
	 * result.setKJava(cmUserValues[0].getKjava());
	 * result.setFetion(cmUserValues[0].getFetion());
	 * return result;
	 * }
	 * public BiUserHobby queryCmUserHobby(String billId) throws Exception {
	 * IBOCmUserHobbyValue[] userHobbyValues = getCmBi2CsDAO().queryCmUserHobby(billId);
	 * if (userHobbyValues == null || userHobbyValues.length < 1) {
	 * return null;
	 * }
	 * BiUserHobby result = new BiUserHobby();
	 * result.setBillId(userHobbyValues[0].getBillId());
	 * result.setMms(userHobbyValues[0].getMms());
	 * result.setQuanQu(userHobbyValues[0].getQuanQu());
	 * result.setShopping(userHobbyValues[0].getShopping());
	 * result.setCrbt(userHobbyValues[0].getCrbt());
	 * result.setSport(userHobbyValues[0].getSport());
	 * result.setHotPoint(userHobbyValues[0].getHotPoint());
	 * result.setFetion(userHobbyValues[0].getFetion());
	 * result.setShopCard(userHobbyValues[0].getShopCard());
	 * result.setGift(userHobbyValues[0].getGift());
	 * result.setMobileGoodNews(userHobbyValues[0].getMobileGoodNews());
	 * result.setWap(userHobbyValues[0].getWap());
	 * result.setDailyMarketing(userHobbyValues[0].getDailyMarketing());
	 * result.setLotterySales(userHobbyValues[0].getLotterySales());
	 * result.setCater(userHobbyValues[0].getCater());
	 * result.setGeneralSales(userHobbyValues[0].getGeneralSales());
	 * result.setMobileEmail(userHobbyValues[0].getMobileEmail());
	 * result.setJoinSalesNum(userHobbyValues[0].getJoinSalesNum());
	 * result.setConsulting(userHobbyValues[0].getConsulting());
	 * result.setRankSales(userHobbyValues[0].getRankSales());
	 * result.setMovie(userHobbyValues[0].getMovie());
	 * result.setFirstGet(userHobbyValues[0].getFirstGet());
	 * return result;
	 * }
	 * public BiCallMarketing queryCallMarketing(String billId) throws Exception {
	 * IBOCmCallMarketingValue[] callMarketingValues = getCmBi2CsDAO().queryCallMarketing(billId);
	 * if (callMarketingValues == null || callMarketingValues.length < 1) {
	 * return null;
	 * }
	 * BiCallMarketing result = new BiCallMarketing();
	 * result.setBillId(callMarketingValues[0].getBillId());
	 * result.setAccessDate(callMarketingValues[0].getAccessDate());
	 * result.setUserHobby(callMarketingValues[0].getUserHobby());
	 * result.setLastMonFee(callMarketingValues[0].getLastMonFee());
	 * result.setGprsFlux(callMarketingValues[0].getGprsFlux());
	 * result.setSendSmNum(callMarketingValues[0].getSendSmNum());
	 * result.setSendMmsNum(callMarketingValues[0].getSendMmsNum());
	 * result.setIsMobilePayAcct(callMarketingValues[0].getIsMobilePayAcct());
	 * result.setNewBusiFee(callMarketingValues[0].getNewBusiFee());
	 * result.setCurrentMonFee(callMarketingValues[0].getCurrentMonFee());
	 * return result;
	 * }
	 * public BiSceneMarketing querySceneMarketing(String billId) throws Exception {
	 * IBOCmSceneMarketingValue[] sceneMarketingValues = getCmBi2CsDAO().querySceneMarketing(billId);
	 * if (sceneMarketingValues == null || sceneMarketingValues.length < 1) {
	 * return null;
	 * }
	 * BiSceneMarketing result = new BiSceneMarketing();
	 * result.setBillId(sceneMarketingValues[0].getBillId());
	 * result.setLastMonArpu(sceneMarketingValues[0].getLastMonArpu());
	 * result.setLastMonMou(sceneMarketingValues[0].getLastMonMou());
	 * result.setLastMonCallFee(sceneMarketingValues[0].getLastMonCallFee());
	 * result.setLastMonRoamingFee(sceneMarketingValues[0].getLastMonRoamingFee());
	 * result.setLastMonSmFee(sceneMarketingValues[0].getLastMonSmFee());
	 * result.setThreeMonVoiceFee(sceneMarketingValues[0].getThreeMonVoiceFee());
	 * result.setThreeMonSmFee(sceneMarketingValues[0].getThreeMonSmFee());
	 * result.setLastMonSmFeeNum(sceneMarketingValues[0].getLastMonSmFeeNum());
	 * result.setLastMonGprsFlux(sceneMarketingValues[0].getLastMonGprsFlux());
	 * result.setLastMonFeeFlux(sceneMarketingValues[0].getLastMonFeeFlux());
	 * result.setLastMonWlanFlux(sceneMarketingValues[0].getLastMonWlanFlux());
	 * result.setLastMonSmNum(sceneMarketingValues[0].getLastMonSmNum());
	 * result.setThreeMonSmNum(sceneMarketingValues[0].getThreeMonSmNum());
	 * result.setLastMonCallTime(sceneMarketingValues[0].getLastMonCallTime());
	 * result.setThreeMonCallTime(sceneMarketingValues[0].getThreeMonCallTime());
	 * result.setThreeMonGprsFlux(sceneMarketingValues[0].getThreeMonGprsFlux());
	 * result.setLastMonGprsFee(sceneMarketingValues[0].getLastMonGprsFee());
	 * result.setLastMonWlanFee(sceneMarketingValues[0].getLastMonWlanFee());
	 * return result;
	 * }
	 * public BiUserSatisfaction queryUserSatisfaction(String billId) throws Exception {
	 * IBOCmUserSatisfactionValue[] userSatisfactionValues = getCmBi2CsDAO().queryUserSatisfaction(billId);
	 * if (userSatisfactionValues == null || userSatisfactionValues.length < 1) {
	 * return null;
	 * }
	 * BiUserSatisfaction result = new BiUserSatisfaction();
	 * result.setBillId(userSatisfactionValues[0].getBillId());
	 * result.setSurveyNoSatiNum(userSatisfactionValues[0].getSurveyNoSatiNum());
	 * result.setSmNoSatiNum(userSatisfactionValues[0].getSmNoSatiNum());
	 * result.setCallNoSatiNum(userSatisfactionValues[0].getCallNoSatiNum());
	 * return result;
	 * }
	 */

	private IBOCmUserSatisfactionValue[] queryUserSatisfactionInner(String billId) throws Exception {
		IBOCmUserSatisfactionValue[] userSatisfactionValues = getCmBi2CsDAO().queryUserSatisfaction(billId);
		if (userSatisfactionValues == null || userSatisfactionValues.length < 1) {
			return new IBOCmUserSatisfactionValue[0];
		}
		return userSatisfactionValues;
	}

	private IBOCmUserHobbyValue[] queryCmUserHobbyInner(String billId) throws Exception {
		IBOCmUserHobbyValue[] userHobbyValues = getCmBi2CsDAO().queryCmUserHobby(billId);
		if (userHobbyValues == null || userHobbyValues.length < 1) {
			return new IBOCmUserHobbyValue[0];
		}
		return userHobbyValues;
	}

	public IBOCmUserChnnHobbyValue[] queryChnnHobbyInner(String billId) throws Exception {
		IBOCmUserChnnHobbyValue[] userChnnHobbyValues = getCmBi2CsDAO().queryChnnHobby(billId);
		if (userChnnHobbyValues == null || userChnnHobbyValues.length < 1) {
			return new IBOCmUserChnnHobbyValue[0];
		}
		return userChnnHobbyValues;
	}

	/*
	 * public BiUserInfo queryUserInfo(String billId) throws Exception {
	 * BiUserInfo userInfo = null;
	 * // 用户不满意总次数就是取“用户满意度参考数据”中三种不满意总次数的和；
	 * IBOCmUserSatisfactionValue[] userSatisfactionValues = this.queryUserSatisfactionInner(billId);
	 * if (userSatisfactionValues != null && userSatisfactionValues.length > 0) {
	 * if (userInfo == null) {
	 * userInfo = new BiUserInfo();
	 * }
	 * String[] satisfactions = Cm2OneframeConstants.BI_OF_TABLE_COLUMN.USER_SATISFACTION.split(",");
	 * long noSatisfactionNum = 0L;
	 * for (int i = 0, len = satisfactions.length; i < len; i++) {
	 * noSatisfactionNum += DataType.getAsLong(userSatisfactionValues[0].get(satisfactions[i]));
	 * }
	 * userInfo.setNoSatisfactionNum(noSatisfactionNum);
	 * }
	 * // 用户喜好数量就是取“用户偏好参考数据”中有效的用户喜好的个数；
	 * IBOCmUserHobbyValue[] userHobbyValues = this.queryCmUserHobbyInner(billId);
	 * if (userHobbyValues != null && userHobbyValues.length > 0) {
	 * if (userInfo == null) {
	 * userInfo = new BiUserInfo();
	 * }
	 * String[] userHobbys = Cm2OneframeConstants.BI_OF_TABLE_COLUMN.USER_HOBBY.split(",");
	 * long hobbyNum = 0L;
	 * for (int i = 0, len = userHobbys.length; i < len; i++) {
	 * if (DataType.getAsLong(userHobbyValues[0].get(userHobbys[i])) > 0) {
	 * hobbyNum++;
	 * }
	 * }
	 * userInfo.setNoSatisfactionNum(hobbyNum);
	 * }
	 * // 一个月内电渠接触总次数就是取“用户渠道偏好数据”中5种渠道的接触次数的和。
	 * IBOCmUserChnnHobbyValue[] userChnnHobbyValues = this.queryChnnHobbyInner(billId);
	 * if (userChnnHobbyValues != null && userChnnHobbyValues.length > 0) {
	 * if (userInfo == null) {
	 * userInfo = new BiUserInfo();
	 * }
	 * String[] chnnHobbys = Cm2OneframeConstants.BI_OF_TABLE_COLUMN.USER_CHANN_HOBBY.split(",");
	 * long chnnNum = 0L;
	 * for (int i = 0, len = chnnHobbys.length; i < len; i++) {
	 * chnnNum += DataType.getAsLong(userChnnHobbyValues[0].get(chnnHobbys[i]));
	 * }
	 * userInfo.setNoSatisfactionNum(chnnNum);
	 * }
	 * return userInfo;
	 * }
	 */

	public void saveCallMarketing(IBOCmCallMarketingValue[] callMarketingValues) throws Exception {
		for (int i = 0, len = callMarketingValues.length; i < len; i++) {
			if (callMarketingValues[i].isNew()) {
				if (callMarketingValues[i].getDataId() <= 0) {
					long dataId = CmCommonUtil.getNewSequence(BOCmCallMarketingBean.class);
					callMarketingValues[i].setDataId(dataId);
				}
				if (StringUtils.isBlank(callMarketingValues[i].getState())) {
					callMarketingValues[i].setState(CmConstants.RecordState.USE);
				}
			}
		}
		getCmBi2CsDAO().saveCallMarketing(callMarketingValues);

	}

	public void saveCustValueLevel(IBOCmCustLevelValue[] custLevelValues) throws Exception {
		for (int i = 0, len = custLevelValues.length; i < len; i++) {
			if (custLevelValues[i].isNew()) {
				if (custLevelValues[i].getDataId() <= 0) {
					long dataId = CmCommonUtil.getNewSequence(BOCmCustLevelBean.class);
					custLevelValues[i].setDataId(dataId);
				}
				if (StringUtils.isBlank(custLevelValues[i].getState())) {
					custLevelValues[i].setState(CmConstants.RecordState.USE);
				}
			}
		}
		getCmBi2CsDAO().saveCustValueLevel(custLevelValues);
	}

	public void saveSceneMarketing(IBOCmSceneMarketingValue[] sceneMarketingValues) throws Exception {
		for (int i = 0, len = sceneMarketingValues.length; i < len; i++) {
			if (sceneMarketingValues[i].isNew()) {
				if (sceneMarketingValues[i].getDataId() <= 0) {
					long dataId = CmCommonUtil.getNewSequence(BOCmSceneMarketingBean.class);
					sceneMarketingValues[i].setDataId(dataId);
				}
				if (StringUtils.isBlank(sceneMarketingValues[i].getState())) {
					sceneMarketingValues[i].setState(CmConstants.RecordState.USE);
				}
			}
		}
		getCmBi2CsDAO().saveSceneMarketing(sceneMarketingValues);
	}

	public void saveUser(IBOCmUserValue[] userValues) throws Exception {
		for (int i = 0, len = userValues.length; i < len; i++) {
			if (userValues[i].isNew()) {
				if (userValues[i].getDataId() <= 0) {
					long dataId = CmCommonUtil.getNewSequence(BOCmUserBean.class);
					userValues[i].setDataId(dataId);
				}
				if (StringUtils.isBlank(userValues[i].getState())) {
					userValues[i].setState(CmConstants.RecordState.USE);
				}
			}
		}
		getCmBi2CsDAO().saveUser(userValues);
	}

	public void saveUserChnnalHobby(IBOCmUserChnnHobbyValue[] chnnHobbyValues) throws Exception {
		for (int i = 0, len = chnnHobbyValues.length; i < len; i++) {
			if (chnnHobbyValues[i].isNew()) {
				if (chnnHobbyValues[i].getDataId() <= 0) {
					long dataId = CmCommonUtil.getNewSequence(BOCmUserChnnHobbyBean.class);
					chnnHobbyValues[i].setDataId(dataId);
				}
				if (StringUtils.isBlank(chnnHobbyValues[i].getState())) {
					chnnHobbyValues[i].setState(CmConstants.RecordState.USE);
				}
			}
		}
		getCmBi2CsDAO().saveUserChnnalHobby(chnnHobbyValues);
	}

	public void saveUserHobby(IBOCmUserHobbyValue[] userHobbyValues) throws Exception {
		for (int i = 0, len = userHobbyValues.length; i < len; i++) {
			if (userHobbyValues[i].isNew()) {
				if (userHobbyValues[i].getDataId() <= 0) {
					long dataId = CmCommonUtil.getNewSequence(BOCmUserHobbyBean.class);
					userHobbyValues[i].setDataId(dataId);
				}
				if (StringUtils.isBlank(userHobbyValues[i].getState())) {
					userHobbyValues[i].setState(CmConstants.RecordState.USE);
				}
			}
		}
		getCmBi2CsDAO().saveUserHobby(userHobbyValues);
	}

	public void saveUserSatisfaction(IBOCmUserSatisfactionValue[] userSatisfactionValues) throws Exception {
		for (int i = 0, len = userSatisfactionValues.length; i < len; i++) {
			if (userSatisfactionValues[i].isNew()) {
				if (userSatisfactionValues[i].getDataId() <= 0) {
					long dataId = CmCommonUtil.getNewSequence(BOCmUserSatisfactionBean.class);
					userSatisfactionValues[i].setDataId(dataId);
				}
				if (StringUtils.isBlank(userSatisfactionValues[i].getState())) {
					userSatisfactionValues[i].setState(CmConstants.RecordState.USE);
				}
			}
		}
		getCmBi2CsDAO().saveUserSatisfaction(userSatisfactionValues);
	}

	public CustGroupBean queryGroupCust(long custId) throws Exception {
		CustGroupBean custBean = new CustGroupBean();
		if (custId > 0) {
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
			IContactValue[] contactValue = CmServiceFactory.getContactSV().queryCustContactsByCustId(custId, -1, -1);
			if (customerValue != null) {
				// 客户信息
				CmObjectWrapperFactory.wrap(customerValue);
				custBean.setCustId(customerValue.getCustId());
				custBean.setCustLanguage(customerValue.getCustLanguage());
				custBean.setCustLanguageName(customerValue.getCustLanguage());  // add by zhaiwg 此版本没有枚举值描述
				custBean.setCustName(customerValue.getCustName());
				custBean.setCustShortName(customerValue.getShortName());
				custBean.setCustServiceId(customerValue.getCustServiceId());
				custBean.setCustServiceLevel(customerValue.getCustServiceLevel());
				custBean.setCustServiceLevelName(customerValue.getCustServiceLevelDesc());
				custBean.setCustLevel(String.valueOf(customerValue.getCustLevel()));   // add by zhaiwg
				custBean.setCustLevelName(String.valueOf(customerValue.getCustLevel()));  // add by zhaiwg 此版本没有枚举值描述
				custBean.setDevChannel(String.valueOf(customerValue.getDevelopType()));

				IBOBsStaticDataValue servChanel = StaticDataUtil.getStaticData("CM_SERV_CHANNEL", String.valueOf(customerValue.getDevelopType()));
				if (null != servChanel) {
					custBean.setDevChannelName(servChanel.getCodeName());
				}

				ICmManagerSV msv = (ICmManagerSV) ServiceFactory.getService(ICmManagerSV.class);
				ICustManagerValue managerValue = msv.queryGroupMainManager(custId);
				if (CmCommonUtil.isNotEmptyObject(managerValue)) {// 客户经理信息
					IBOSecOperatorValue value = OrgmodelClient.getOperatorById(managerValue.getManagerId());
					if (null != value) {
						custBean.setManagerCode(String.valueOf(value.getCode()));  // add by zhaiwg
					}
					custBean.setManagerName(managerValue.getStaffName());
					custBean.setManagerOrgId(managerValue.getOrganizeId());
					custBean.setManagerOrgName(managerValue.getOrganizeName());
					custBean.setManagerTel(managerValue.getBillId());
				}
				if (contactValue != null && contactValue.length > 0) {
					// 联系人信息
					custBean.setContId(contactValue[0].getContId());
					custBean.setContTel(contactValue[0].getContMobile());
					custBean.setContName(contactValue[0].getContName());
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
		return custBean;
	}

	public Cust3HMessageBean query3HMessage(String billId) throws Exception {
		// 获得手机号码获得客户编号的服务接口
		long userScore = 0;
		Cust3HMessageBean messageBean = new Cust3HMessageBean();
		if (StringUtils.isNotBlank(billId)) {
			// 根据手机号码获得用户信息
			IBOUserInfoValue userValue = CmServiceFactory.getTeamInvokeSV().queryUserInfoByBillId(billId);
			if (userValue != null) {
				messageBean.setUserState(userValue.getUserState());
				messageBean.setUserStateName(userValue.getUserStateName());
				messageBean.setNetDate(userValue.getAccessDate());
				messageBean.setShutDownState(userValue.getStopOpen());
				messageBean.setShutDownName(userValue.getStopOpenName());
				messageBean.setNetChannel(userValue.getChannelType());
				messageBean.setChannelName(userValue.getChannelName());
				messageBean.setUserBrand(userValue.getBrandId());
				messageBean.setUserBrandName(userValue.getBrandName());
				messageBean.setSimCard(userValue.getIccId());
				messageBean.setDynamicFlag(userValue.getMzoneAbFlag());
				messageBean.setCity(userValue.getRegionId());
				messageBean.setCityName(userValue.getRegionName());

				// messageBean.setUserType(userValue.getUserType());
				// messageBean.setUserTypeName(userValue.getUserTypeName());
				// 获得当前积分
				// try {
				// IScore2CallMgrSV scoreSv = (IScore2CallMgrSV)ServiceFactory.getService(IScore2CallMgrSV.class);
				// userScore = scoreSv.getTotalScore(billId);
				// // userScore = 0;
				// } catch (Exception e) {
				// log.error(e.getMessage());
				// }
				messageBean.setNowScore(userScore);
				messageBean.setUserId(userValue.getUserId());
				DataContainer vipConditionDC = new DataContainer();
				vipConditionDC.set(IClubMemberValue.S_BillId, billId);
				vipConditionDC.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
				IClubMemberValue[] clubValues = CmServiceFactory.getClubMemberSV().queryClubMembers(vipConditionDC, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(clubValues)) {// 查询vip信息
					messageBean.setIsVip("Y");
					messageBean.setCustLevel(clubValues[0].getMemberLevel());

					messageBean.setVipLevel(clubValues[0].getMemberLevel());    // add by zhaiwg

					IBOBsStaticDataValue memberLevel = StaticDataUtil.getStaticData(CmConstants.Club.MEMBER_LEVEL, String.valueOf(clubValues[0].getMemberLevel()));
					if (memberLevel != null) {
						messageBean.setCustLevelName(memberLevel.getCodeName());

						messageBean.setVipLevelName(memberLevel.getCodeName());  // add by zhaiwg
					}

				} else {
					messageBean.setIsVip("N");
				}
				// 查询客户信息(证件号码模糊化)
				ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerMaskByCustId(userValue.getCustId());
				if (customerValue != null) {
					CmObjectWrapperFactory.wrap(customerValue);
					DataContainer condition = new DataContainer();
					condition.set(IGroupMemberValue.S_MemberCustId, userValue.getCustId());
					IGroupMemberValue[] groupMemberValues = CmServiceFactory.getCustomerSV().queryGroupMembers(condition, -1, -1);
					if (groupMemberValues != null && groupMemberValues.length > 0 && groupMemberValues[0].getCustId() > 0) {
						messageBean.setBelongCustId(groupMemberValues[0].getCustId());
					}
					messageBean.setCustId(customerValue.getCustId());
					messageBean.setCustName(customerValue.getCustName());
					messageBean.setSex(customerValue.getGender());
					messageBean.setSexName(customerValue.getGenderDesc());
					messageBean.setIsRealName(customerValue.getRealNameFlag());
					messageBean.setCustType(DataType.getAsLong(customerValue.getIndivCustType()));
					messageBean.setCustTypeName(customerValue.getIndivCustTypeDesc());
					messageBean.setCustAddress(customerValue.getCustAddress());
					messageBean.setCertType(customerValue.getCustCertType());
					messageBean.setCertTypeName(customerValue.getCustCertTypeDesc());
					messageBean.setCertCode(customerValue.getCustCertCode());

					messageBean.setCertValidTime(TimeUtil.getYYYYMM(customerValue.getCustCertExpire()));   // add by
																											// zhaiwg
					messageBean.setCertAddress(customerValue.getCustCertAddress());    // add by zhaiwg
					messageBean.setCustServiceLevel(String.valueOf(customerValue.getCustServiceLevel()));  // add by
																											// zhaiwg
					messageBean.setCustServiceLevelName(customerValue.getCustServiceLevelDesc());   // add by zhaiwg

					messageBean.setCustLanguage(customerValue.getCustLanguage());
					messageBean.setCustLanguageName(customerValue.getCustLanguage());
					messageBean.setCustServiceId(customerValue.getCustServiceId());
					messageBean.setCustStatus(customerValue.getCustStatus());
					messageBean.setCustStatusName(customerValue.getCustStatusDesc());

					Timestamp now = ServiceManager.getIdGenerator().getSysDate();
					Calendar calnow = Calendar.getInstance();
					Calendar calbirth = Calendar.getInstance();
					calnow.setTime(now);
					calbirth.setTime(customerValue.getBirthday());
					String isBirthday = "N";
					if (calnow.get(Calendar.DAY_OF_MONTH) == calbirth.get(Calendar.DAY_OF_MONTH) && calnow.get(Calendar.MONTH) == calbirth.get(Calendar.MONTH)) {
						isBirthday = "Y";
					}

					messageBean.setIsBirthday(isBirthday);
					messageBean.setWorkCompany(customerValue.getJobCompany());
					ICustManagerValue managerValue = CmServiceFactory.getCustomerSV().queryMainCustManagersByCustId(userValue.getCustId());
					if (CmCommonUtil.isNotEmptyObject(managerValue)) {
						messageBean.setManagerId(managerValue.getManagerId());
					}
					messageBean.setContAddress(customerValue.getContAddress());

					// contSex ,contSexName , contCertAddress , isImpCont

					messageBean.setDistrictCode(customerValue.getCityId());     // add by zhaiwg
					messageBean.setRegionCode(customerValue.getCountyId());  // add by zhaiwg

					messageBean.setContCertAddress(customerValue.getCustCertAddress());
					messageBean.setContName(customerValue.getContName());
					messageBean.setContTel(customerValue.getContMobile());
					messageBean.setContZipCode(customerValue.getPostCode());

					if (customerValue.getCustType() == CmConstants.CustomerType.GROUP) {
						messageBean.setIsGroupCust("Y");
					} else {
						messageBean.setIsGroupCust("N");
					}

				}
			}
			ISoAccrelValue[] innsAcceValue = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByBillId(billId, 1, -1, -1);
			// 查询默认账户
			if (innsAcceValue != null && innsAcceValue.length == 1) {
				long acctId = innsAcceValue[0].getAcctId();
				IAccountProfileValue acctValue = CmServiceFactory.getAccountSV().queryAccountProfileByAcctId(acctId);
				// 查询账户信息
				if (acctValue != null) {
					CmObjectWrapperFactory.wrap(acctValue);
					messageBean.setAcctId(acctValue.getAcctId());
					messageBean.setAcctName(acctValue.getAcctName());
					messageBean.setAcctType(acctValue.getAcctType());
					messageBean.setAcctTypeName(acctValue.getAcctTypeDesc());
					messageBean.setPayMethod(acctValue.getPayMethod());
					messageBean.setPayMethodName(acctValue.getPayMethodDesc());
				}
			}

			ICrmFSV crmsv = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
			IInsUserValue value = crmsv.getUserInfoByBillId(billId);
			if (null != value) {
				messageBean.setProdSpecId(value.getProdCatalogId());  // add by zhaiwg
				IProductFSV psv = (IProductFSV) ServiceFactory.getService(IProductFSV.class);
				IItemValue item = psv.getProductItemById(value.getProdCatalogId());
				if (null != item) {
					messageBean.setProdSpecName(item.getName());
				}
			}
		}
		return messageBean;
	}

	public CustGroupBean queryGroupCust(long custId, String state) throws Exception {
		CustGroupBean custBean = new CustGroupBean();
		if (custId > 0) {
			ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
			ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			ICustomerValue customerValue = customerSV.queryCustomerByCustId(custId, state);
			IBOCmCustContactMediumValue[] contactMediumValues = customerSV.queryContactMediumByCondition(custId, CmConstants.AddressId.legalAddress);
			IContactValue[] contactValue = dkCustomerSV.queryCustomerContacts(custId, CmConstants.CmGroupContactType.LEGAL_OWNER);
			if (customerValue != null) {
				// 客户信息
				CmObjectWrapperFactory.wrap(customerValue);
				custBean.setCustId(customerValue.getCustId());
				custBean.setCustLanguage(customerValue.getCustLanguage());
				custBean.setCustLanguageName(customerValue.getCustLanguage());  // add by zhaiwg 此版本没有枚举值描述
				custBean.setCustName(customerValue.getCustName());
				custBean.setCustShortName(customerValue.getShortName());
				custBean.setCustServiceId(customerValue.getCustServiceId());
				custBean.setCustServiceLevel(customerValue.getCustServiceLevel());
				custBean.setCustServiceLevelName(customerValue.getCustServiceLevelDesc());
				custBean.setCustLevel(String.valueOf(customerValue.getCustLevel()));   // add by zhaiwg
				custBean.setCustLevelName(String.valueOf(customerValue.getCustLevel()));  // add by zhaiwg 此版本没有枚举值描述
				custBean.setDevChannel(String.valueOf(customerValue.getDevelopType()));
				custBean.setCustAgents(customerValue.getRemarks());
				custBean.setCvrNumber(customerValue.getTaxId());
				custBean.setCustPassword(customerValue.getCustPassword());
				if (contactMediumValues != null && contactMediumValues.length > 0) {
					custBean.setCustomerLegalAddress(contactMediumValues[0].getAddressDetail());
				}

				IBOBsStaticDataValue servChanel = StaticDataUtil.getStaticData("CM_SERV_CHANNEL", String.valueOf(customerValue.getDevelopType()));
				if (null != servChanel) {
					custBean.setDevChannelName(servChanel.getCodeName());
				}

				ICmManagerSV msv = (ICmManagerSV) ServiceFactory.getService(ICmManagerSV.class);
				ICustManagerValue managerValue = msv.queryGroupMainManager(custId);
				if (CmCommonUtil.isNotEmptyObject(managerValue)) {// 客户经理信息
					IBOSecOperatorValue value = OrgmodelClient.getOperatorById(managerValue.getManagerId());
					if (null != value) {
						custBean.setManagerCode(String.valueOf(value.getCode()));  // add by zhaiwg
					}
					custBean.setManagerName(managerValue.getStaffName());
					custBean.setManagerOrgId(managerValue.getOrganizeId());
					custBean.setManagerOrgName(managerValue.getOrganizeName());
					custBean.setManagerTel(managerValue.getBillId());
				}
				if (contactValue != null && contactValue.length > 0) {
					// 联系人信息
					custBean.setContId(contactValue[0].getContId());
					String phone = StringUtils.isBlank(contactValue[0].getMainContNumber()) ? contactValue[0].getSecondContNumber() : contactValue[0].getMainContNumber();
					custBean.setContTel(phone);
					custBean.setContName(contactValue[0].getContName());
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
		return custBean;

	}

}
