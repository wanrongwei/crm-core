package com.asiainfo.crm.cm.ln.exe.batch.service.impl;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.common.service.interfaces.CenterConst;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmClubManagerImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberValue;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerBean;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmUserManagerValue;
import com.asiainfo.crm.cm.ln.exe.batch.service.interfaces.ICmClubMemberToUserManagerSV;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnClubServiceSV;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmClubVipMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

public class CmClubMemberToUserManagerSVImpl implements ICmClubMemberToUserManagerSV {

	/**
	 * 日志文件
	 */
	private transient static Log log = LogFactory.getLog(CmClubMemberToUserManagerSVImpl.class);

	/**
	 * /** 批量删除
	 */
	public void DeleteUserManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		BOCmUserManagerBean[] cmUserManagerBean = new BOCmUserManagerBean[1];
		IBOCmUserManagerValue temp = null;
		cmUserManagerBean[0] = new BOCmUserManagerBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("BILL_ID".equals(colNames[i])) {
					log.error("The user number can not be empty!");
					ExceptionUtil.throwBusinessException("The user number can not be empty!");
				}
			} else {
				if ("BILL_ID".equals(colNames[i])) {
					// 判断手机号码是不是在大客户表中
					temp = getUserManagerInfo(colValues[i], false);
					if (null == temp) {
						ExceptionUtil.throwBusinessException("A wrong number, or call the manager does not exist!");
					}
				}
			}
		}
		// 打包准备做批量处理
		if (null != temp) {
			cmUserManagerBean[0].copy(temp);
			((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).saveClubMemberArchives(cmUserManagerBean);
		}
	}

	/**
	 * 批量导入
	 */
	public void importUserManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		BOCmUserManagerBean[] cmUserManagerBean = new BOCmUserManagerBean[1];
		IBOCmUserManagerValue cmUserManagerValue = new BOCmUserManagerBean();
		StringBuffer billId = null;
		cmUserManagerBean[0] = new BOCmUserManagerBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("BILL_ID".equals(colNames[i])) {
					log.error("The user number can not be empty!");
					ExceptionUtil.throwBusinessException("The user number can not be empty!");
				} else if ("MANAGER_ID".equals(colNames[i])) {
					log.error("Phone manager cannot be empty!");
					ExceptionUtil.throwBusinessException("Phone manager cannot be empty!");
				}
			} else {
				if ("BILL_ID".equals(colNames[i])) {
					billId = new StringBuffer(colValues[i]);
					// 判断手机号码是不是在大客户表中
					cmUserManagerValue = getUserManagerInfo(billId.toString(), true);
					if (CmCommonUtil.isEmptyObj(cmUserManagerValue)) {
						ExceptionUtil.throwBusinessException(billId + "Not big customer!");
					}
				} else if ("MANAGER_ID".equals(colNames[i])) {
					if (colValues[i] != null && !"".equals(colValues[i])) {
						cmUserManagerValue.setManagerId(Long.parseLong(colValues[i]));
					} else {
						ExceptionUtil.throwBusinessException("The phone:" + billId + "The user phone manager is empty!");
					}
				}
			}
		}
		// 打包准备做批量处理
		if (CmCommonUtil.isNotEmptyObject(cmUserManagerValue)) {
			cmUserManagerBean[0].copy(cmUserManagerValue);
			((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).saveClubMemberArchives(cmUserManagerBean);
		}
	}

	/**
	 * 
	 * @Function: CmClubMemberToUserManagerSVImpl.java
	 * @Description: 根据手机号码校验客户信息是不是存在
	 * 
	 * @param: flag
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @throws Exception
	 * @date: Oct 30, 2012 1:35:19 PM
	 * 
	 * Modification History: Oct 30, 2012 qiangkz Version Description
	 */
	private IBOCmUserManagerValue getUserManagerInfo(String billId, boolean flag) throws Exception {
		IBOCmUserManagerValue cmUserManagerBean = null;
		IBOCmUserManagerValue temp = null;
		ICmClubVipMemberSV cmClubVipMemberSV = ((ICmClubVipMemberSV) ServiceFactory.getService(ICmClubVipMemberSV.class));
		ICmTeamInvokeSV iCmTeamInvokeSV = ((ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class));
		IQUserBaseInfoValue uerBaseInfoValue = iCmTeamInvokeSV.getUserBaseInfoByBillId(billId);
		if (CmCommonUtil.isEmptyObj(uerBaseInfoValue)) {
			ExceptionUtil.throwBusinessException(billId + ":there is no user information!");
		}
		IBOCmClubMemberValue temp1 = cmClubVipMemberSV.getCmClubMember(null, billId, null);
		if (CmCommonUtil.isNotEmptyObject(temp1)) {
			// 如果存在大客户，校验是不是已经分配了大客户，如果分配了，就做update操作
			temp = cmClubVipMemberSV.getCmUserManager(temp1.getUserId() + "", null, null);
			if (null == temp && flag) {
				// 需要新增电话经理 并且是新增操作
				cmUserManagerBean = new BOCmUserManagerBean();
				cmUserManagerBean.setMemberId(temp1.getMemberId());
				cmUserManagerBean.setUserId(temp1.getUserId());
				cmUserManagerBean.setRelId(CmCommonUtil.getNewSequence(BOCmUserManagerBean.class));
				cmUserManagerBean.setOperType(CmConstants.CmUserManager.USER_MANAGER_OPER_TYPE_Q_AND_M);
				cmUserManagerBean.setState(CmConstants.RecordState.USE);
				cmUserManagerBean.setRegionId(uerBaseInfoValue.getRegionId());
				cmUserManagerBean.setStsToNew();
			} else {
				cmUserManagerBean = new BOCmUserManagerBean();
				cmUserManagerBean.copy(temp);
				if (flag) {
					cmUserManagerBean.setStsToOld();
				} else {
					cmUserManagerBean.delete();
				}
				cmUserManagerBean.setOperType(CmConstants.CmUserManager.USER_MANAGER_OPER_TYPE_Q_AND_M);
			}
		}
		return cmUserManagerBean;
	}

	public void importClubZoneMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		String operregionId = CmCommonUtil.getDefaultRegionId();
		if ("".equals(operregionId) || null == operregionId || "undefined".equals(operregionId)) {
			log.error(CrmLocaleFactory.getResource("CMS90700001")); // 手机号码不能为空！
			ExceptionUtil.throwBusinessException("CMS90700001");
		}
		String billId = "";// 手机号码
		int memberLevel = 0;// 客户级别
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("BILL_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS90700002")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS90700002");
				} else if ("MEMBER_LEVEL".equals(colNames[i])) {
					log.error("The club level cannot be empty!");
					ExceptionUtil.throwBusinessException("CMS90700003");
				}
			} else {
				if ("BILL_ID".equals(colNames[i])) {
					String phoneId = colValues[i];// 获取手机号码
					CenterFactory.setCenterInfoByTypeAndValue(CenterConst.BILL_ID, phoneId);
					ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
					IQUserBaseInfoValue userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(phoneId);// 根据手机号码查找用户信息
					if (userBaseInfo == null) {
						log.error("Mobile phone number does not exist!");
						ExceptionUtil.throwBusinessException("CMS90700004");
					} else if (userBaseInfo != null) {
						long brandId = userBaseInfo.getBrandId();// 用户的品牌
						int isGlobal = brandId == CmConstants.USER_BRAND.USER_BRAND_GLOBAL ? 1 : 0;	// 1为全球通，0为非全球通
						String regionId = userBaseInfo.getRegionId();// 获取该用户的的地市编码
						if ((1 == isGlobal) && (regionId.equals(operregionId))) {// 必须是全球通用户并且该账户与操作员的地市编码是一致的
							billId = phoneId;
							if (!CmCommonUtil.isEmptyObj(billId)) {// 手机号码不为空，设置中心 add by suntao 2013年1月18日
								CenterFactory.setCenterInfoByTypeAndValue(CenterConst.BILL_ID, billId);
							}
						} else {
							if (!regionId.equals(operregionId)) {// 如果用户的地市信息跟操作员信息不等 则不能操作
								log.error("Can not modify the VIP level across the city!");
								ExceptionUtil.throwBusinessException("CMS90700005");
							} else {
								log.error("The number of non GSM users!");
								ExceptionUtil.throwBusinessException("CMS90700006");
							}
						}
					}
				} else if ("MEMBER_LEVEL".equals(colNames[i])) {
					if (colValues[i] != null && !"".equals(colValues[i])) {
						memberLevel = Integer.parseInt(colValues[i]);
					}
				}
			}
		}
		((ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class)).saveVipLevel(billId, memberLevel, CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN_2);
	}

	/**
	 * 批量导入大客户经理
	 */
	public void importClubMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		BOCmClubMemberBean[] clubMemberBean = new BOCmClubMemberBean[1];
		IBOCmClubMemberValue temp = null;
		clubMemberBean[0] = new BOCmClubMemberBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("BILL_ID".equals(colNames[i])) {
					log.error("The user number can not be empty!");
					ExceptionUtil.throwBusinessException("The user number can not be empty!");
				}
			} else {
				if ("BILL_ID".equals(colNames[i])) {
					// 判断手机号码是不是在大客户表中
					temp = getClubInfo(colValues[i]);
					if (null == temp) {
						ExceptionUtil.throwBusinessException("The user number is GSM users, or have large customers,that can not be added!");
					}
				}
			}
		}
		// 打包准备做批量处理
		if (null != temp) {
			String billId = temp.getBillId();// 获取手机号码
			// 调用统一方法。此方法中包含级别重算，客户因子添加的方法 --add by suntao6
			((ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class)).saveVipLevel(billId, CmConstants.ClubMemberLevel.MEMBER_LEVEL_4,
					CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN_6);

		}
	}

	/**
	 * 大客户的批量导入
	 * @throws Exception 
	 */
	private BOCmClubMemberBean getClubInfo(String phoneId) throws Exception {
		// 设置中心
		CenterFactory.setCenterInfoByTypeAndValue(CenterConst.BILL_ID, phoneId);
		// 实例化对象--查询非全球通用户
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		// 实例化对象--根据用户的custId查询用户信息
		ICmCustomerSV cmInvokeSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 实例化对象--查询非全球通用户
		IQUserBaseInfoValue userBaseInfo = teamInvokeSV.getUserBaseInfoByBillId(phoneId);
		BOCmClubMemberBean cmClubMemberBean = null;
		IBOCmClubMemberValue temp1 = null;

		if (userBaseInfo != null) {
			// 用户的品牌
			long brandId = userBaseInfo.getBrandId();
			// 1为全球通，0为非全球通
			int isGlobal = brandId == CmConstants.USER_BRAND.USER_BRAND_GLOBAL ? 1 : 0;
			if (0 == isGlobal) {
				// 如果是0，那就是非全球通用户，符合大客户要求
				// 校验一下是不是已经是大客户了
				temp1 = ((ICmClubVipMemberSV) ServiceFactory.getService(ICmClubVipMemberSV.class)).getCmClubMember(userBaseInfo.getUserId() + "", userBaseInfo.getBillId() + "",
						CmConstants.Club.VIP_CLUB_MEMBER_MEMBER_LEVEL);
				if (null == temp1) {
					cmClubMemberBean = new BOCmClubMemberBean();
					// 设置主键和俱乐部编号
					cmClubMemberBean.setMemberId(CmCommonUtil.getNewSequence(BOCmClubMemberBean.class));
					cmClubMemberBean.setClubId(CmConstants.Club.VIP_CLUB_ID);
					// 用电话好吗查询用户信息的到
					long custId = userBaseInfo.getCustId();
					cmClubMemberBean.setBillId(userBaseInfo.getBillId());
					cmClubMemberBean.setCustId(userBaseInfo.getCustId());
					cmClubMemberBean.setUserId(userBaseInfo.getUserId());
					// 来自客户关系表中数据
					// 查询客户信息，。，custId CERT_TYPE CERT_CODE PARTY_ID MEMBER_NAME
					ICustomerValue customerValue = cmInvokeSV.queryCustomerByCustId(custId);
					cmClubMemberBean.setPartyId(customerValue.getPartyId());
					cmClubMemberBean.setCertType(customerValue.getCustCertType());
					cmClubMemberBean.setCertCode(customerValue.getCustCertCode());
					cmClubMemberBean.setMemberName(customerValue.getCustName());
					// 更改原因：每天数据都需要添加状态要不后续很多查询会出错 参照：kangzk
					cmClubMemberBean.setState(CmConstants.RecordState.USE);
					// 设置大客户级别为4
					cmClubMemberBean.setMemberLevel(Integer.parseInt(CmConstants.Club.VIP_CLUB_MEMBER_MEMBER_LEVEL));
					cmClubMemberBean.setRegionId(userBaseInfo.getRegionId()); // 获取用户的regionId
					cmClubMemberBean.setStsToNew();
				}
			}
		}
		return cmClubMemberBean;
	}
}
