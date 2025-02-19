package com.asiainfo.crm.cm.ln.service.impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupAuditInfoBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupAuditInfoValue;
import com.asiainfo.crm.cm.inner.club.bo.BOCmVipElementBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElementValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnClubServiceSV;
import com.asiainfo.crm.cm.model.bean.VOClubMemberBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberCardBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmClubMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubServiceSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

public class CmLnClubServiceSVImpl implements ICmLnClubServiceSV {

	private transient static Log log = LogFactory.getLog(CmLnClubServiceSVImpl.class);

	/**
	 * 删除一种因子
	 */
	public void delGrpContact(String billId, int elementType) throws Exception {
		// IBOCmVipElementValue[] vipElementValues = CmServiceFactory.getClubServiceSV().queryCmVipElements(billId, -1,
		// elementType);
		// if (CmCommonUtil.isNotEmptyObject(vipElementValues))
		// {
		// vipElementValues[0].delete();
		// CmServiceFactory.getClubServiceSV().saveVipElement( new IBOCmVipElementValue[] { vipElementValues[0] });
		// ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		// IQUserBaseInfoValue userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(billId);
		// if (CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN == elementType)
		// {
		// // 根据手机号码和关键人类型查询关键人对象
		// int vipMemberLeve = getContLevel(billId);
		// if (vipMemberLeve > 0)
		// {
		// // 根据手机号码查询用户信息
		//				
		// IBOCmVipElementValue vipElementValue = new BOCmVipElementBean();
		// vipElementValue.setStsToNew();
		// vipElementValue.setRelId(CmCommonUtil.getNewSequence(BOCmVipElementBean.class));
		// vipElementValue.setUserId(userBaseInfo.getUserId());
		// vipElementValue.setBillId(Long.valueOf(billId));
		// vipElementValue.setElementType(elementType);
		// vipElementValue.setMemberLevel(vipMemberLeve);
		// vipElementValue.setState(CmConstants.RecordState.USE);
		// vipElementValue.setRegionId(userBaseInfo.getRegionId());
		// CmServiceFactory.getClubServiceSV().saveVipElement(new IBOCmVipElementValue[] { vipElementValue });
		// }
		// }
		countVipLevel(billId, elementType, null);
		// }
	}

	// vip用户信息处理
	public void countVipLevel(String billId, int elementType, IQUserBaseInfoValue userBaseInfo) throws Exception {
		long clubMemberNumber = 0L;
		int vipLevel = 0;
		String regionId = "";
		// 根据手机号码查询用户信息
		// ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory
		// .getService(ICmTeamInvokeSV.class);
		// IQUserBaseInfoValue userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(billId);
		if (CmCommonUtil.isNotEmptyObject(userBaseInfo)) {
			// 根据客户编号查询个人客户信息
			ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = icmCust.queryCustomerByCustId(userBaseInfo.getCustId());
			if (CmCommonUtil.isNotEmptyObject(custValue)) {
				// 集团VIP等级
				ICmCommonSV cmCommonSv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				vipLevel = cmCommonSv.getVipLevle(billId, userBaseInfo);
				regionId = userBaseInfo.getRegionId();
				// vip等级转入 根据客户编号查询vip客户信息 queryVIPClubMemberByBillId
				ICmClubMemberSV cmClub = (ICmClubMemberSV) ServiceFactory.getService(ICmClubMemberSV.class);
				IClubMemberValue clubMember = cmClub.queryVIPClubMemberByBillId(billId);
				IClubMemberValue clubMembe = new ClubMemberBean();
				if (CmCommonUtil.isEmptyObject(clubMember)) {// 新增一条VIP用户信息
					// modify by caiyu 2012-12-13 当vipLevel为0时，需要判断用户品牌，如果用户品牌为全球通，则可以增加，否则不能增加
					if (vipLevel == 0 && userBaseInfo.getBrandId() != CmConstants.USER_BRAND.USER_BRAND_GLOBAL) {
						// 非全球通品牌，级别为0的，直接返回。
						return;
					} else {
						clubMembe.setStsToNew();
						clubMembe.set(IClubMemberValue.S_CityId, userBaseInfo.getAreaCode());
						clubMembe.set(IClubMemberValue.S_CountyId, userBaseInfo.getCountryCode());
						log.error("CITY_ID" + userBaseInfo.getAreaCode() + "COUNTY_ID" + userBaseInfo.getCountryCode() + "\n\n\n\n\n\n\n");
						clubMembe.set(IClubMemberValue.S_ClubId, CmConstants.Club.VIP_CLUB_ID);
						clubMembe.set(IClubMemberValue.S_PartyId, custValue.getPartyId());
						clubMembe.set(IClubMemberValue.S_CustId, custValue.getCustId());
						clubMembe.set(IClubMemberValue.S_UserId, userBaseInfo.getUserId());
						clubMembe.set(IClubMemberValue.S_BillId, billId);
						clubMembe.set(IClubMemberValue.S_MemberId, "");// 会员编号
						clubMembe.set(IClubMemberValue.S_MemberName, custValue.getCustName());
						clubMembe.set(IClubMemberValue.S_CertType, custValue.getCustCertType());
						clubMembe.set(IClubMemberValue.S_CertCode, custValue.getCustCertCode());
						clubMembe.set(IClubMemberValue.S_MemberPswd, "");// 会员密码
						clubMembe.set(IClubMemberValue.S_MemberLevel, vipLevel);// 会员级别
						clubMembe.set(IClubMemberValue.S_MemberSource, elementType);// 会员来源
						clubMembe.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);// 状态
						clubMembe.set(IClubMemberValue.S_RegionId, userBaseInfo.getRegionId());
					}
				} else {// 更改vip等级 根据不同的vip因子更改
					if (vipLevel == 0 && userBaseInfo.getBrandId() != CmConstants.USER_BRAND.USER_BRAND_GLOBAL) {
						// 非全球通品牌，新级别为0的，直接删除。
						clubMembe.copy(clubMember);
						clubMembe.delete();
					} else {
						clubMembe.setStsToOld();
						clubMembe.copy(clubMember);
						clubMembe.set(IClubMemberValue.S_MemberLevel, vipLevel);// 会员级别
					}
				}
				IVOClubMemberValue voClub = new VOClubMemberBean();
				voClub.setClubMember(clubMembe);
				// 不管级别，都需要重算会员卡
				saveClubMemberCards(voClub, clubMemberNumber, vipLevel, regionId);
				CmServiceFactory.getClubMemberSV().saveClubMember(voClub);
			}
		}
	}

	// vip用户信息处理
	public void countVipLevel(String billId, long clubId, int elementType, IQUserBaseInfoValue userBaseInfo) throws Exception {
		long clubMemberNumber = 0L;
		int vipLevel = 0;
		String regionId = "";
		// 根据手机号码查询用户信息
		// ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory
		// .getService(ICmTeamInvokeSV.class);
		// IQUserBaseInfoValue userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(billId);
		if (CmCommonUtil.isNotEmptyObject(userBaseInfo)) {
			// 根据客户编号查询个人客户信息
			ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = icmCust.queryCustomerByCustId(userBaseInfo.getCustId());
			if (CmCommonUtil.isNotEmptyObject(custValue)) {
				// 集团VIP等级
				ICmCommonSV cmCommonSv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				vipLevel = cmCommonSv.getVipLevle(billId, userBaseInfo);
				regionId = userBaseInfo.getRegionId();
				// vip等级转入 根据客户编号查询vip客户信息 queryVIPClubMemberByBillId
				ICmClubMemberSV cmClub = (ICmClubMemberSV) ServiceFactory.getService(ICmClubMemberSV.class);
				IClubMemberValue clubMember = cmClub.queryVIPClubMemberByBillId(billId);
				IClubMemberValue clubMembe = new ClubMemberBean();
				if (CmCommonUtil.isEmptyObject(clubMember)) {// 新增一条VIP用户信息
					// modify by caiyu 2012-12-13 当vipLevel为0时，需要判断用户品牌，如果用户品牌为全球通，则可以增加，否则不能增加
					if (vipLevel == 0 && userBaseInfo.getBrandId() != CmConstants.USER_BRAND.USER_BRAND_GLOBAL) {
						// 非全球通品牌，级别为0的，直接返回。
						return;
					} else {
						clubMembe.setStsToNew();
						clubMembe.set(IClubMemberValue.S_CityId, userBaseInfo.getAreaCode());
						clubMembe.set(IClubMemberValue.S_CountyId, userBaseInfo.getCountryCode());
						log.error("CITY_ID" + userBaseInfo.getAreaCode() + "COUNTY_ID" + userBaseInfo.getCountryCode() + "\n\n\n\n\n\n\n");
						// clubMembe.set(IClubMemberValue.S_ClubId,CmConstants.Club.VIP_CLUB_ID);
						clubMembe.set(IClubMemberValue.S_ClubId, clubId);
						clubMembe.set(IClubMemberValue.S_PartyId, custValue.getPartyId());
						clubMembe.set(IClubMemberValue.S_CustId, custValue.getCustId());
						clubMembe.set(IClubMemberValue.S_UserId, userBaseInfo.getUserId());
						clubMembe.set(IClubMemberValue.S_BillId, billId);
						clubMembe.set(IClubMemberValue.S_MemberId, "");// 会员编号
						clubMembe.set(IClubMemberValue.S_MemberName, custValue.getCustName());
						clubMembe.set(IClubMemberValue.S_CertType, custValue.getCustCertType());
						clubMembe.set(IClubMemberValue.S_CertCode, custValue.getCustCertCode());
						clubMembe.set(IClubMemberValue.S_MemberPswd, "");// 会员密码
						clubMembe.set(IClubMemberValue.S_MemberLevel, vipLevel);// 会员级别
						clubMembe.set(IClubMemberValue.S_MemberSource, elementType);// 会员来源
						clubMembe.set(IClubMemberValue.S_State, CmConstants.RecordState.USE);// 状态
						clubMembe.set(IClubMemberValue.S_RegionId, userBaseInfo.getRegionId());
					}
				} else {// 更改vip等级 根据不同的vip因子更改
					if (vipLevel == 0 && userBaseInfo.getBrandId() != CmConstants.USER_BRAND.USER_BRAND_GLOBAL) {
						// 非全球通品牌，新级别为0的，直接删除。
						clubMembe.copy(clubMember);
						clubMembe.delete();
					} else {
						clubMembe.setStsToOld();
						clubMembe.copy(clubMember);
						clubMembe.set(IClubMemberValue.S_MemberLevel, vipLevel);// 会员级别
					}
				}
				IVOClubMemberValue voClub = new VOClubMemberBean();
				voClub.setClubMember(clubMembe);
				// 不管级别，都需要重算会员卡
				saveClubMemberCards(voClub, clubMemberNumber, vipLevel, regionId);
				CmServiceFactory.getClubMemberSV().saveClubMember(voClub);
			}
		}
	}

	public void saveClubmembers(IClubMemberValue clubMemberValue) throws Exception {
		IVOClubMemberValue voClub = new VOClubMemberBean();
		if (clubMemberValue != null) {
			ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = icmCust.queryCustomerByCustId(clubMemberValue.getCustId());
			if (custValue != null) {
				clubMemberValue.setPartyId(custValue.getPartyId());
				voClub.setClubMember(clubMemberValue);
				CmServiceFactory.getClubMemberSV().saveClubMember(voClub);
			}
		}
	}

	/**
	 * 电子VIP卡信息处理
	 */
	private void saveClubMemberCards(IVOClubMemberValue voClub, long memberId, int vipLevel, String regionId) throws Exception {
		// 查询俱乐部会员有效卡信息，(同一时段，只有一张卡有效)
		IClubMemberCardValue clubMemberCard = new ClubMemberCardBean();
		IClubMemberCardValue clubMemberCardValue = CmServiceFactory.getClubMemberSV().queryClubMemberCardByMemberId(voClub.getMemberId());
		if (CmCommonUtil.isNotEmptyObject(clubMemberCardValue)
				&& !(vipLevel == Integer.valueOf(CmConstants.CmIndivVipLevel.DIAMOND_LEVEL) || vipLevel == Integer.valueOf(CmConstants.CmIndivVipLevel.GOLDEN_LEVEL) || vipLevel == Integer
						.valueOf(CmConstants.CmIndivVipLevel.SILVER_LEVEL))) {
			clubMemberCard.copy(clubMemberCardValue);
			clubMemberCard.delete();
			voClub.setClubMemberCard(clubMemberCard);
		}
		if (vipLevel == Integer.valueOf(CmConstants.CmIndivVipLevel.DIAMOND_LEVEL) || vipLevel == Integer.valueOf(CmConstants.CmIndivVipLevel.GOLDEN_LEVEL)
				|| vipLevel == Integer.valueOf(CmConstants.CmIndivVipLevel.SILVER_LEVEL)) {
			if (CmCommonUtil.isEmptyObj(clubMemberCardValue)) {
				clubMemberCard.setStsToNew();
				// clubMemberCard.setMemberId(memberId);//设置俱乐部编号
				clubMemberCard.setCardLevel(vipLevel);// 设置卡号 级别
				// 根据用户的regionId和客户级别生成会员卡号
				String cardCode = ((ICmClubServiceSV) ServiceFactory.getService(ICmClubServiceSV.class)).getVipCardCode(regionId, vipLevel);
				clubMemberCard.setCardCode(cardCode);// 设置卡号
				clubMemberCard.setCardType(2);// 设置卡类型 1实体卡2电子卡
				DateFormat dateformat = new SimpleDateFormat("yyyy");
				String sDate = dateformat.format(new Date());
				clubMemberCard.setCardYear(Integer.parseInt(sDate));// 发卡年份
				clubMemberCard.setState(CmConstants.RecordState.USE);
				clubMemberCard.setEffectiveDate(CmLnCommonUtil.getSysDateTime());
			} else {
				clubMemberCard.setStsToOld();
				clubMemberCard.copy(clubMemberCardValue);
				clubMemberCard.setCardLevel(vipLevel);// 设置卡号 级别
				// 根据用户的regionId和客户级别生成会员卡号
				String cardCode = ((ICmClubServiceSV) ServiceFactory.getService(ICmClubServiceSV.class)).getVipCardCode(regionId, vipLevel);
				clubMemberCard.setCardCode(cardCode);// 设置卡号
				clubMemberCard.setEffectiveDate(CmLnCommonUtil.getSysDateTime());
				clubMemberCard.setCardFlag(CmLnConstants.CardFlag.CARD_FLAG0);
			}
			voClub.setClubMemberCard(clubMemberCard);
		}
	}

	public void saveVipLevel(String billId, int level, int elementType) throws Exception {
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		// CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID,String.valueOf(billId));
		IQUserBaseInfoValue userBaseInfo = null;
		// IQUserBaseInfoValue userBaseInfo
		try {
			userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(billId);
		} catch (Exception e) {
			log.error("Query user information failed:", e);
		} finally {
			if (userBaseInfo != null) {
				// 根据客户编号查询个人客户信息
				ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICustomerValue custValue = icmCust.queryCustomerByCustId(userBaseInfo.getCustId());
				IBOCmVipElementValue[] vipElementValues = CmServiceFactory.getClubServiceSV().queryCmVipElements(billId, -1, elementType);
				IBOCmVipElementValue vipElementValue = new BOCmVipElementBean();
				if (elementType == CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN_2 && level == Integer.valueOf(CmConstants.CmIndivVipLevel.NO_LEVEL)) {// 大客户地市调整
					if (CmCommonUtil.isNotEmptyObject(custValue) && CmCommonUtil.isNotEmptyObject(vipElementValues)) {
						vipElementValue.copy(vipElementValues[0]);
						vipElementValue.delete();
						vipElementValue.setElementType(elementType);
					}
				} else {
					if (CmCommonUtil.isNotEmptyObject(custValue)) {
						if (CmCommonUtil.isEmptyObject(vipElementValues)) {
							vipElementValue.setStsToNew();
							vipElementValue.setRelId(CmCommonUtil.getNewSequence(BOCmVipElementBean.class));
							vipElementValue.setUserId(userBaseInfo.getUserId());
							vipElementValue.setBillId(Long.valueOf(billId));
							vipElementValue.setElementType(elementType);
							vipElementValue.setMemberLevel(level);
							vipElementValue.setState(CmConstants.RecordState.USE);
							vipElementValue.setRegionId(userBaseInfo.getRegionId());
						} else {
							int vipMemberLeve = 0;
							if (elementType == CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN) {
								ICmLnClubServiceSV icmLn = (ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class);
								vipMemberLeve = icmLn.getContLevel(billId);
							}
							int levelInt = Integer.valueOf(level);
							if (levelInt < vipMemberLeve) {
								levelInt = vipMemberLeve;
							}
							vipElementValue.copy(vipElementValues[0]);
							vipElementValue.setStsToOld();
							vipElementValue.setElementType(elementType);
							vipElementValue.setRelId(vipElementValues[0].getRelId());
							vipElementValue.setBillId(vipElementValues[0].getBillId());
							vipElementValue.setMemberLevel(levelInt);
						}
					}
				}
				if (CmCommonUtil.isNotEmptyObject(vipElementValue)) {
					CmServiceFactory.getClubServiceSV().saveVipElement(new IBOCmVipElementValue[] { vipElementValue });
				}
				countVipLevel(billId, elementType, userBaseInfo);
			}
		}
	}

	public void saveVipLevel(String billId, long clubId, int level, int elementType) throws Exception {
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		// CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID,String.valueOf(billId));
		IQUserBaseInfoValue userBaseInfo = null;
		// IQUserBaseInfoValue userBaseInfo
		try {
			userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(billId);
		} catch (Exception e) {
			log.error("Query user information failed:", e);
		} finally {
			if (userBaseInfo != null) {
				// 根据客户编号查询个人客户信息
				ICmCustomerSV icmCust = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICustomerValue custValue = icmCust.queryCustomerByCustId(userBaseInfo.getCustId());
				IBOCmVipElementValue[] vipElementValues = CmServiceFactory.getClubServiceSV().queryCmVipElements(billId, -1, elementType);
				IBOCmVipElementValue vipElementValue = new BOCmVipElementBean();
				if (elementType == CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN_2 && level == Integer.valueOf(CmConstants.CmIndivVipLevel.NO_LEVEL)) {// 大客户地市调整
					if (CmCommonUtil.isNotEmptyObject(custValue) && CmCommonUtil.isNotEmptyObject(vipElementValues)) {
						vipElementValue.copy(vipElementValues[0]);
						vipElementValue.delete();
						vipElementValue.setElementType(elementType);
					}
				} else {
					if (CmCommonUtil.isNotEmptyObject(custValue)) {
						if (CmCommonUtil.isEmptyObject(vipElementValues)) {
							vipElementValue.setStsToNew();
							vipElementValue.setRelId(CmCommonUtil.getNewSequence(BOCmVipElementBean.class));
							vipElementValue.setUserId(userBaseInfo.getUserId());
							vipElementValue.setBillId(Long.valueOf(billId));
							vipElementValue.setElementType(elementType);
							vipElementValue.setMemberLevel(level);
							vipElementValue.setState(CmConstants.RecordState.USE);
							vipElementValue.setRegionId(userBaseInfo.getRegionId());
						} else {
							int vipMemberLeve = 0;
							if (elementType == CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN) {
								ICmLnClubServiceSV icmLn = (ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class);
								vipMemberLeve = icmLn.getContLevel(billId);
							}
							int levelInt = Integer.valueOf(level);
							if (levelInt < vipMemberLeve) {
								levelInt = vipMemberLeve;
							}
							vipElementValue.copy(vipElementValues[0]);
							vipElementValue.setStsToOld();
							vipElementValue.setElementType(elementType);
							vipElementValue.setRelId(vipElementValues[0].getRelId());
							vipElementValue.setBillId(vipElementValues[0].getBillId());
							vipElementValue.setMemberLevel(levelInt);
						}
					}
				}
				if (CmCommonUtil.isNotEmptyObject(vipElementValue)) {
					CmServiceFactory.getClubServiceSV().saveVipElement(new IBOCmVipElementValue[] { vipElementValue });
				}
				countVipLevel(billId, clubId, elementType, userBaseInfo);
			}
		}
	}

	public int getContLevel(String billId) throws Exception {
		ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		IContactValue[] contactValues = null;
		DataContainer da = new DataContainer();
		da.set(IBOCmGroupContactValue.S_BillId, billId);
		da.set(IBOCmGroupContactValue.S_State, CmConstants.RecordState.USE);
		da.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		da.set(IBOCmGroupContactValue.S_ContType, CmConstants.CONT_TYPE.CONT_TYPE_2);
		contactValues = iCmContactSV.queryCustContacts(da, -1, -1);
		int vipMemberLeve = 0;
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			vipMemberLeve = contactValues[0].getContLevel();
			for (int i = 0; i < contactValues.length; i++) {
				int contLevel = contactValues[i].getContLevel();
				if (contLevel < vipMemberLeve) {
					vipMemberLeve = contLevel;
				}
			}
		}
		return vipMemberLeve;
	}

	public void saveAuditInfo1Level(String CustId, String contLevel, String contId, String regionId, int saveAuditInfo1Level) throws Exception {
		// 根据关键人编码查询审核表
		DataContainer dt = new DataContainer();
		dt.set(IBOCmGroupAuditInfoValue.S_CustId, CustId);
		dt.set(IBOCmGroupAuditInfoValue.S_CustContId, contId);
		dt.set(IBOCmGroupAuditInfoValue.S_AuditSts, Long.valueOf(CmLnConstants.CreditReqSts.CreditReqSts_1));
		dt.set(IBOCmGroupAuditInfoValue.S_State, CmConstants.RecordState.USE);
		IBOCmGroupAuditInfoValue[] cmgrpAuditInfoValue = qryGrpAuditInfo(dt);
		if (CmCommonUtil.isNotEmptyObject(cmgrpAuditInfoValue)) {
			// throw "此关键人已经申请过级别变更，请等待正在处理...";
			ExceptionUtil.throwBusinessException("CMS1100149");
		}
		BOCmGroupAuditInfoBean auditInfoBean = new BOCmGroupAuditInfoBean();
		Timestamp doneDate = CmCommonUtil.getSysDate();
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditId, CmCommonUtil.getNewSequence(BOCmGroupAuditInfoBean.class));
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditType, CmLnConstants.AuditTypeGrp.AuditTypeContact);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyDate, doneDate);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OldValue, contLevel);// 原级别
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_NewValue, saveAuditInfo1Level);// 新级别
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyOpId, ServiceManager.getUser().getID());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_State, CmConstants.RecordState.USE);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateOpId, ServiceManager.getUser().getID());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateOrgId, ServiceManager.getUser().getOrgId());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OpId, ServiceManager.getUser().getID());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_OrgId, ServiceManager.getUser().getOrgId());
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CreateDate, doneDate);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_DoneDate, doneDate);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_RegionId, regionId);// 地市
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_ApplyDesc, "Key person level application");// 申请描述
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_AuditSts, CmLnConstants.AudisSts.STS_1);
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CustId, CustId);// 集团编号
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CustContId, contId);// 关键人编号
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CityId, regionId);// 地市
		auditInfoBean.set(IBOCmGroupAuditInfoValue.S_CountyId, "");// 区县
		CmInnerServiceFactory.getCommonInnerSV().saveBean(auditInfoBean);
	}

	public void updateContactLevel(String contId, String contLevel) throws Exception {
		// 根据关键人编号查询关键人对象
		ICmContactSV icmContact = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		IBOCmGroupContactValue iboCmContact = icmContact.queryCustConBycustContId(Long.valueOf(contId));
		if (CmCommonUtil.isNotEmptyObject(iboCmContact)) {
			iboCmContact.setStsToOld();
			iboCmContact.setContLevel(Integer.valueOf(contLevel));
			ICmCustomerSV icmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IContactValue iContactValue = new ContactBean();
			IVOCustValue custValue = new VOCustBean();
			custValue.addContact(iContactValue);
			iContactValue.copy(iboCmContact);
			icmCustomerSV.saveCustomer(custValue);
			saveVipLevel(iboCmContact.getBillId(), Integer.valueOf(contLevel), CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN);
		}
	}

	public IBOCmGroupAuditInfoValue[] qryGrpAuditInfo(DataContainer dt) throws Exception {
		Parameter parameter = null;
		parameter = ParamUtil.buildParameter(new DataContainer[] { dt }, BOCmGroupAuditInfoBean.class);
		DataContainerInterface[] dataConta = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupAuditInfoBean.class, null, parameter.getCondition(),
				parameter.getParameter(), -1, -1, true);
		if (CmCommonUtil.isEmptyObject(dataConta)) {
			return new IBOCmGroupAuditInfoValue[0];
		}
		IBOCmGroupAuditInfoValue[] ibocMemberValues = new IBOCmGroupAuditInfoValue[dataConta.length];
		for (int i = 0; i < ibocMemberValues.length; i++) {
			ibocMemberValues[i] = new BOCmGroupAuditInfoBean();
			ibocMemberValues[i].copy(dataConta[i]);
		}
		return ibocMemberValues;
	}

	public void updateGrpCustomerContactLevel(long grpCustId, int custServiceLevel) throws Exception {
		// 根据集团编号查询集团关键人成员对象 queryCustContacts
		DataContainer dt = new DataContainer();
		ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		dt.set(IBOCmGroupContactValue.S_CustId, grpCustId);
		dt.set(IBOCmGroupContactValue.S_ContType, CmConstants.CONT_TYPE.CONT_TYPE_2);
		IContactValue[] iContactValue = iCmContactSV.queryCustContacts(dt, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(iContactValue)) {
			int level = -1;
			switch (custServiceLevel) {
				case CmLnConstants.GroupLevel.LEVEL_INT_l1:
					level = CmLnConstants.GroupKeyPeop.LEVEL_3;
					break;
				case CmLnConstants.GroupLevel.LEVEL_INT_l2:
					level = CmLnConstants.GroupKeyPeop.LEVEL_3;
					break;
				case CmLnConstants.GroupLevel.LEVEL_INT_21:
					level = CmLnConstants.GroupKeyPeop.LEVEL_4;
					break;
				case CmLnConstants.GroupLevel.LEVEL_INT_22:
					level = CmLnConstants.GroupKeyPeop.LEVEL_4;
					break;
				case CmLnConstants.GroupLevel.LEVEL_INT_30:
					level = CmLnConstants.GroupKeyPeop.LEVEL_5;
					break;
				default:
					level = CmLnConstants.GroupKeyPeop.LEVEL_1;
					break;
			}
			List<BOCmGroupContactBean> contList = new ArrayList<BOCmGroupContactBean>();
			int len = iContactValue.length;
			// 重算关键人级别
			BOCmGroupContactBean contactBean = null;
			for (int i = 0; i < len; i++) {
				contactBean = new BOCmGroupContactBean();
				contactBean.copy(iContactValue[i]);
				contactBean.setStsToOld();
				contactBean.setContLevel(level);
				contList.add(contactBean);
			}
			// 保存关键人
			if (!contList.isEmpty()) {
				BOCmGroupContactBean[] contactBeans = contList.toArray(new BOCmGroupContactBean[0]);
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactBeans);
			}
			for (int i = 0; i < len; i++) {
				saveVipLevel(iContactValue[i].getBillId(), level, CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN);
			}
		}
	}
}
