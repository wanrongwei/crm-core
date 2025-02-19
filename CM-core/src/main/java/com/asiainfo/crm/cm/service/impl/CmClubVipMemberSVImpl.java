package com.asiainfo.crm.cm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.ai.secframe.orgmodel.service.interfaces.IOrgModelFSV;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmClubManagerImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberCardBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberEngine;
import com.asiainfo.crm.cm.inner.club.bo.BOCmSpecialListHisBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmVipElementBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmVipElemetHisBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberCardValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmSpecialListHisValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElementValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElemetHisValue;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerBean;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerEngine;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmUserManagerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmUserManagerValue;
import com.asiainfo.crm.cm.ln.club.service.interfaces.ICmLnClubMemberSV;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.service.interfaces.ICmClubVipMemberSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

public class CmClubVipMemberSVImpl implements ICmClubVipMemberSV {

	private static final int min = 0;
	private static final int max = 100;

	public DataContainer[] queryPartnerArchives(String criteria, int startNum, int endNum) throws Exception {
		return ((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).queryData(criteria, startNum, endNum);
	}

	public int queryPartnerArchivesCount(String criteria) throws Exception {
		return ((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).queryCount(criteria);
	}

	public void saveClubMemberArchives(DataContainer[] values) throws Exception {
		saveVipElement((BOCmClubMemberBean[]) values);
		((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).saveClubMemberArchives(values);
	}

	public IBOCmVipElementValue queryFromBillId(String billId) throws Exception {
		return ((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).queryFromBillId(billId);

	}

	public IQBOSecCustManagerValue[] queryCmUserManager(String userId, int startNum, int endNum) throws Exception {
		ISec2CmSV isCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		// 大客户类型
		if (null != userId && !"".equals(userId)) {
			condition.append(" and ").append(IBOCmUserManagerValue.S_UserId).append(" =:userId");
			paraMap.put("userId", userId);
		} else {
			ExceptionUtil.throwBusinessException("CMS8000029");
		}
		IBOCmUserManagerValue[] cmUserManagerValue = BOCmUserManagerEngine.getBeans(null, condition.toString(), paraMap, startNum, endNum, true);
		List secStaffList = new ArrayList();
		for (int i = 0, len = cmUserManagerValue.length; i < len; i++) {
			IQBOSecCustManagerValue secStaff = isCm.getEffectAmInfo(cmUserManagerValue[i].getManagerId(), CmLnConstants.CM_MANAGER_TYPE.STS_5);
			if (secStaff != null) {
				secStaffList.add(secStaff);
			}
		}
		if (secStaffList.isEmpty()) {
			return new IQBOSecCustManagerValue[0];
		}
		return (IQBOSecCustManagerValue[]) secStaffList.toArray(new IQBOSecCustManagerValue[0]);
	}

	public int queryCmUserManagerCount(String custId) throws Exception {

		long memberId = 0;
		if (!"".equals(custId) && null != custId) {
			memberId = Long.parseLong(custId);
		}
		int count = 0;
		if (memberId == -1) {
			// 传入数据不合法，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000029");
		}
		IOrgModelFSV isCm = (IOrgModelFSV) ServiceFactory.getService(IOrgModelFSV.class);
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		// 大客户类型
		condition.append(" and ").append(IBOCmUserManagerValue.S_UserId).append(" =:memberId");
		paraMap.put("memberId", memberId);
		IBOCmUserManagerValue[] cmUserManagerValue = BOCmUserManagerEngine.getBeans(null, condition.toString(), paraMap, -1, -1, true);
		for (int i = 0; cmUserManagerValue != null && cmUserManagerValue.length > 0 && i < cmUserManagerValue.length; i++) {
			int boSec = isCm.getPmsCountByCond(cmUserManagerValue[i].getManagerId(), "", "");
			count = boSec;
		}
		return count;
	}

	/**
	 * 
	* @Function: CmClubVipMemberAction.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 25, 2012 3:57:19 PM 
	*
	* Modification History:
	* Oct 25, 2012         qiangkz          Version            Description
	 */
	private void saveVipElement(BOCmClubMemberBean[] values) throws Exception {

		BOCmVipElementBean[] bOCmVipElementBean = new BOCmVipElementBean[values.length];
		for (int i = 0; i < values.length; i++) {
			bOCmVipElementBean[i] = new BOCmVipElementBean();
			if (values[i].isNew()) {
				bOCmVipElementBean[i].setRelId(CmCommonUtil.getNewSequence(BOCmClubMemberBean.class));
				bOCmVipElementBean[i].setBillId(Long.parseLong(values[i].getBillId()));
				bOCmVipElementBean[i].setRegionId(values[i].getRegionId());
				bOCmVipElementBean[i].setUserId(values[i].getUserId());
				bOCmVipElementBean[i].setMemberLevel(Integer.parseInt(CmConstants.Club.VIP_CLUB_MEMBER_MEMBER_LEVEL));
				bOCmVipElementBean[i].setElementType(CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN_6);
				bOCmVipElementBean[i].setStsToNew();
			} else if (values[i].isDeleted()) {
				IBOCmVipElementValue vipElement = queryFromBillId(values[i].getBillId(), CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN_6);
				if (vipElement != null) {
					bOCmVipElementBean[i].copy(vipElement);
					bOCmVipElementBean[i].setRegionId(values[i].getRegionId());
					bOCmVipElementBean[i].setStsToOld();
					bOCmVipElementBean[i].delete();
				} else {
					return; // 此处有雷
				}
			} else if (values[i].isModified()) {
				IBOCmVipElementValue temp = queryFromBillId(values[i].getBillId());
				bOCmVipElementBean[i].copy(temp);
				bOCmVipElementBean[i].setRegionId(values[i].getRegionId());
				bOCmVipElementBean[i].setMemberLevel(values[i].getMemberLevel());
			}
		}
		// 进行保存，修改，删除操作
		((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).saveClubMemberArchives(bOCmVipElementBean);
	}

	private IBOCmVipElementValue queryFromBillId(String billId, int vipType) throws Exception {
		return ((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).queryFromBillId(billId, vipType);
	}

	public DataContainer[] queryVipElementArchives(String criteria, int startNum, int endNum) throws Exception {
		return ((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).queryData(criteria, startNum, endNum);
	}

	public int queryVipElementArchivesCount(String criteria) throws Exception {
		return ((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).queryCount(criteria);
	}

	/**
	 * 查询历史记录
	 */
	public DataContainer[] queryVipElementHisArchives(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_VIP_ELEMENT_H", IBOCmVipElemetHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_VIP_ELEMENT_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBOCmVipElemetHisValue.S_DoneDate).append(" >=DATE_FORMAT(:StartDate ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOCmVipElemetHisValue.S_DoneDate).append(" <=date_add(DATE_FORMAT(:EndDate ,'%Y-%m-%d'),interval 1 day)");
		if (condition.getAsString("BILL_ID") != null && !"".equals(condition.getAsString("BILL_ID"))) {
			sql.append(" and ").append(IBOCmVipElemetHisValue.S_BillId).append("= :billId ");
			parameter.put("billId", condition.getAsString("BILL_ID"));
		}
		parameter.put("StartDate", condition.getAsString("DONE_START_DATE").substring(0, 10));
		parameter.put("EndDate", condition.getAsString("DONE_END_DATE").substring(0, 10));
		sql.append(" order by done_date desc )");  // modify by caiyu 20121216 按照done_date倒排序
		if (startNum >= 0 && endNum >= 0) {
			sql.append(" LIMIT :startNum,:endNum ");
		}
		parameter.put("startNum", startNum);
		parameter.put("endNum", endNum);
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmVipElemetHisBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);

		return (DataContainer[]) returnValues;
	}

	public int queryVipElementHisArchivesCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_VIP_ELEMENT_H", IBOCmVipElemetHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT count(*) as CNT FROM  (").append("SELECT t.* FROM {CM_VIP_ELEMENT_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBOCmVipElemetHisValue.S_DoneDate).append(" >=DATE_FORMAT(:StartDate ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOCmVipElemetHisValue.S_DoneDate).append(" <=date_add(DATE_FORMAT(:EndDate ,'%Y-%m-%d'),interval 1 day)");
		if (condition.getAsString("BILL_ID") != null && !"".equals(condition.getAsString("BILL_ID"))) {
			sql.append(" and ").append(IBOCmVipElemetHisValue.S_BillId).append("= :billId ");
			parameter.put("billId", condition.getAsString("BILL_ID"));
		}
		parameter.put("StartDate", condition.getAsString("DONE_START_DATE").substring(0, 10));
		parameter.put("EndDate", condition.getAsString("DONE_END_DATE").substring(0, 10));
		sql.append(")");
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmVipElemetHisBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);

		return returnValues[0].getAsInt("CNT");
	}

	public DataContainer[] querySpecialListHisArchives(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_SPECIAL_LIST_H", IBOCmSpecialListHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_SPECIAL_LIST_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBOCmSpecialListHisValue.S_DoneDate).append(" >=DATE_FORMAT(:StartDate ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOCmSpecialListHisValue.S_DoneDate).append(" <=date_add(DATE_FORMAT(:EndDate ,'%Y-%m-%d'),interval 1 day)");
		if (!CmCommonUtil.isEmptyObj(condition.getAsString("PARTY_NAME"))) {
			sql.append(" and ").append(IBOCmSpecialListHisValue.S_PartyName).append("= :partyName ");
			parameter.put("partyName", condition.getAsString("PARTY_NAME"));
		}
		if (!CmCommonUtil.isEmptyObj(condition.getAsString("CUST_ID"))) {
			sql.append(" and ").append(IBOCmSpecialListHisValue.S_CustId).append("= :custId ");
			parameter.put("custId", condition.getAsString("CUST_ID"));
		}
		if (!CmCommonUtil.isEmptyObj(condition.getAsString("CERT_TYPE")) && !CmCommonUtil.isEmptyObj(condition.getAsString("CERT_CODE"))) {
			sql.append(" and ").append(IBOCmSpecialListHisValue.S_CertType).append("= :certType ");
			sql.append(" and ").append(IBOCmSpecialListHisValue.S_CertCode).append("= :certCode ");
			parameter.put("certType", condition.getAsString("CERT_TYPE"));
			parameter.put("certCode", condition.getAsString("CERT_CODE"));
		}
		parameter.put("StartDate", condition.getAsString("DONE_START_DATE").substring(0, 10));
		parameter.put("EndDate", condition.getAsString("DONE_END_DATE").substring(0, 10));
		sql.append(")");
		if (startNum >= 0 && endNum >= 0) {
			sql.append(" LIMIT :startNum,:endNum ");
		}
		parameter.put("startNum", startNum);
		parameter.put("endNum", endNum);
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmSpecialListHisBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);

		return (DataContainer[]) returnValues;
	}

	public int querySpecialListHisArchivesCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_SPECIAL_LIST_H", IBOCmSpecialListHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT count(*) as CNT FROM  (").append("SELECT t.* FROM {CM_SPECIAL_LIST_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBOCmSpecialListHisValue.S_DoneDate).append(" >=DATE_FORMAT(:StartDate ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOCmSpecialListHisValue.S_DoneDate).append(" <=date_add(DATE_FORMAT(:EndDate ,'%Y-%m-%d'),interval 1 day)");
		if (!CmCommonUtil.isEmptyObj(condition.getAsString("PARTY_NAME"))) {
			sql.append(" and ").append(IBOCmSpecialListHisValue.S_PartyName).append("= :partyName ");
			parameter.put("partyName", condition.getAsString("PARTY_NAME"));
		}
		if (!CmCommonUtil.isEmptyObj(condition.getAsString("CUST_ID"))) {
			sql.append(" and ").append(IBOCmSpecialListHisValue.S_CustId).append("= :custId ");
			parameter.put("custId", condition.getAsString("CUST_ID"));
		}
		if (!CmCommonUtil.isEmptyObj(condition.getAsString("CERT_TYPE")) && !CmCommonUtil.isEmptyObj(condition.getAsString("CERT_CODE"))) {
			sql.append(" and ").append(IBOCmSpecialListHisValue.S_CertType).append("= :certType ");
			sql.append(" and ").append(IBOCmSpecialListHisValue.S_CertCode).append("= :certCode ");
			parameter.put("certType", condition.getAsString("CERT_TYPE"));
			parameter.put("certCode", condition.getAsString("CERT_CODE"));
		}
		parameter.put("StartDate", condition.getAsString("DONE_START_DATE").substring(0, 10));
		parameter.put("EndDate", condition.getAsString("DONE_END_DATE").substring(0, 10));
		sql.append(")");
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmSpecialListHisBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);

		return returnValues[0].getAsInt("CNT");
	}

	public void saveClubMemberToManagerArchives(BOCmUserManagerBean[] values) throws Exception {
		((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).saveClubMemberArchives(values);

	}

	public IBOCmUserManagerValue getCmUserManager(String userId, String custId, String managerId) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		// 大客户类型
		if (null != userId && !"".equals(userId)) {
			condition.append(" and ").append(IBOCmUserManagerValue.S_UserId).append(" =:userId");
			paraMap.put("userId", userId);
		}
		if (null != custId && !"".equals(custId)) {
			condition.append(" and ").append(IBOCmUserManagerValue.S_MemberId).append(" =:custId");
			paraMap.put("custId", custId);
		}
		if (null != managerId && !"".equals(managerId)) {
			condition.append(" and ").append(IBOCmUserManagerValue.S_ManagerId).append(" =:managerId");
			paraMap.put("managerId", managerId);
		}
		IBOCmUserManagerValue[] cmUserManagerValue = BOCmUserManagerEngine.getBeans(null, condition.toString(), paraMap, -1, -1, true);
		if (null != cmUserManagerValue && cmUserManagerValue.length >= 1) {
			return cmUserManagerValue[0];
		} else {
			return null;
		}
	}

	public void saveClubMember(DataContainer[] values) throws Exception {
		((AbstractCmClubManagerImpl) CmServiceFactory.getBusiMode(AbstractCmClubManagerImpl.class)).saveClubMember(values);

	}

	/**
	 * 查询大客户信息
	 */
	public IBOCmClubMemberValue getCmClubMember(String userId, String billId, String memberLevel) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		// 大客户类型
		if (!"".equals(userId) && null != userId) {
			condition.append(" and ").append(IBOCmClubMemberValue.S_UserId).append(" =:userId");
			paraMap.put("userId", userId);
		}
		if (!"".equals(billId) && null != billId) {
			condition.append(" and ").append(IBOCmClubMemberValue.S_BillId).append(" =:billId");
			paraMap.put("billId", billId);
		}
		if (!"".equals(memberLevel) && null != memberLevel) {
			condition.append(" and ").append(IBOCmClubMemberValue.S_MemberLevel).append(" =:memberLevel");
			paraMap.put("memberLevel", memberLevel);
		}
		IBOCmClubMemberValue[] cmUserManagerValue = BOCmClubMemberEngine.getBeans(null, condition.toString(), paraMap, -1, -1, true);
		if (null != cmUserManagerValue && cmUserManagerValue.length >= 1) {
			return cmUserManagerValue[0];
		} else {
			return null;
		}
	}

	public IBOCmClubMemberValue getCmClubMemberByUserId(String userId, String clubId) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		// 大客户类型
		if (!"".equals(userId) && null != userId) {
			condition.append(" and ").append(IBOCmClubMemberValue.S_UserId).append(" =:userId");
			paraMap.put("userId", userId);
		}
		if (!"".equals(clubId) && null != clubId) {
			condition.append(" and ").append(IBOCmClubMemberValue.S_ClubId).append(" =:clubId");
			paraMap.put("clubId", clubId);
		}
		IBOCmClubMemberValue[] cmUserManagerValue = BOCmClubMemberEngine.getBeans(null, condition.toString(), paraMap, -1, -1, true);
		if (null != cmUserManagerValue && cmUserManagerValue.length >= 1) {
			return cmUserManagerValue[0];
		} else {
			return null;
		}
	}

	public int qryClubMemberCountByCdn(String criteria) throws Exception {
		DataContainer[] dts = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer dt = dts[0];

		StringBuilder sql = new StringBuilder("");
		StringBuilder conditionSql = new StringBuilder("");
		Map queryParameter = new HashMap();
		sql.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmClubMemberBean.class).getMapingEnty());

		// 客户编号
		if (dt.get(IBOCmClubMemberValue.S_CustId) != null && dt.getAsLong(IBOCmClubMemberValue.S_CustId) > 0) {
			conditionSql.append(" and cust_id = :custId ");
			queryParameter.put("custId", dt.get(IBOCmClubMemberValue.S_CustId));
		}
		// 所属地市
		if (dt.get(IBOCmClubMemberValue.S_CityId) != null && !"-1".equals(dt.get(IBOCmClubMemberValue.S_CityId))) {
			conditionSql.append(" and city_id = :cityId ");
			queryParameter.put("cityId", dt.get(IBOCmClubMemberValue.S_CityId));
		}
		// 所属区县
		if (dt.get(IBOCmClubMemberValue.S_CountyId) != null && !"-1".equals(dt.get(IBOCmClubMemberValue.S_CountyId))) {
			conditionSql.append(" and county_id = :countyId ");
			queryParameter.put("countyId", dt.get(IBOCmClubMemberValue.S_CountyId));
		}
		// 手机号码
		if (dt.get(IBOCmClubMemberValue.S_BillId) != null && !"".equals(dt.get(IBOCmClubMemberValue.S_BillId))) {
			conditionSql.append(" and bill_id = :billId ");
			queryParameter.put("billId", dt.get(IBOCmClubMemberValue.S_BillId));
		}
		// 会员名称
		if (dt.get(IBOCmClubMemberValue.S_MemberName) != null && !"".equals(dt.get(IBOCmClubMemberValue.S_MemberName))) {
			conditionSql.append(" and member_name like :memberName ");
			queryParameter.put("memberName", dt.get(IBOCmClubMemberValue.S_MemberName) + "%");
		}
		// VIP卡号
		if (dt.get("CARD_CODE") != null && !"".equals(dt.get("CARD_CODE"))) {
			conditionSql.append(" and exists ( select * from {CM_CLUB_MEMBER_CARD} c where c.member_id = t.member_id and c.card_code = :cardCode  ) ");
			queryParameter.put("cardCode", dt.get("CARD_CODE"));
		}
		// 证件类型
		if (dt.get(IBOCmClubMemberValue.S_CertType) != null && dt.getAsInt(IBOCmClubMemberValue.S_CertType) > -1) {
			conditionSql.append(" and cert_type = :certType ");
			queryParameter.put("certType", dt.get(IBOCmClubMemberValue.S_CertType));
		}
		// 证件号码
		if (dt.get(IBOCmClubMemberValue.S_CertCode) != null && !"".equals(dt.get(IBOCmClubMemberValue.S_CertCode))) {
			conditionSql.append(" and cert_code = :certCode ");
			queryParameter.put("certCode", dt.get(IBOCmClubMemberValue.S_CertCode));
		}
		// 会员级别
		if (dt.get(IBOCmClubMemberValue.S_MemberLevel) != null && dt.getAsInt(IBOCmClubMemberValue.S_MemberLevel) > -1) {
			conditionSql.append(" and member_level = :memberLevel ");
			queryParameter.put("memberLevel", dt.get(IBOCmClubMemberValue.S_MemberLevel));
		}
		// 是否已分配客户经理
		if (dt.get("CUST_MANAGER_FLAG") != null && dt.getAsInt("CUST_MANAGER_FLAG") > 0) {
			int flag = dt.getAsInt("CUST_MANAGER_FLAG");
			if (flag == 1) {
				// 已分配客户经理
				conditionSql.append(" and exists ( select * from {CM_USER_MANAGER} cm where cm.user_id = t.user_id ) ");
			} else if (flag == 2) {
				// 未分配客户经理
				conditionSql.append(" and not exists ( select * from {CM_USER_MANAGER} cm where cm.user_id = t.user_id ) ");
			} else {
				// 错误参数
			}
		}
		// 电话经理
		if (dt.get("MANAGER_ID") != null && dt.getAsLong("MANAGER_ID") > 0) {
			conditionSql.append(" and exists ( select * from {CM_USER_MANAGER} m where m.user_id = t.user_id and m.manager_id = :managerId  ) ");
			queryParameter.put("managerId", dt.get("MANAGER_ID"));
		}
		// 电话经理组
		if (dt.get("TEAM_ID") != null && dt.getAsLong("TEAM_ID") > 0) {
			conditionSql.append(" and exists ( select * from {CM_USER_MANAGER} u where u.user_id = t.user_id "
					+ "and exists ( select * from {CM_CUST_MANAGER_TEAM_REL} r where r.manager_id = u.manager_id and r.team_id = :teamId ) ) ");
			queryParameter.put("teamId", dt.get("TEAM_ID"));
		}

		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(sql.toString(), conditionSql.toString(), queryParameter), queryParameter);
		return counts[0].getAsInt("CNT");
	}

	/**
	 * 根据条件查询VIP大客户
	 * 
	 * @param dt
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] qryClubMemberByCdn(String criteria, int start, int end) throws Exception {
		DataContainer[] dts = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer dt = dts[0];
		StringBuilder sql = new StringBuilder("");
		StringBuilder conditionSql = new StringBuilder(" and member_level > 0 ");// 增加条件，查询级别大于0 的数据，排除普通全球通会员
		Map queryParameter = new HashMap();
		sql.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmClubMemberBean.class).getMapingEnty());

		// 客户编号
		if (dt.get(IBOCmClubMemberValue.S_CustId) != null && dt.getAsLong(IBOCmClubMemberValue.S_CustId) > 0) {
			conditionSql.append(" and cust_id = :custId ");
			queryParameter.put("custId", dt.get(IBOCmClubMemberValue.S_CustId));
		}
		// 所属地市
		if (dt.get(IBOCmClubMemberValue.S_CityId) != null && !"-1".equals(dt.get(IBOCmClubMemberValue.S_CityId))) {
			conditionSql.append(" and city_id = :cityId ");
			queryParameter.put("cityId", dt.get(IBOCmClubMemberValue.S_CityId));
		}
		// 所属区县
		if (dt.get(IBOCmClubMemberValue.S_CountyId) != null && !"-1".equals(dt.get(IBOCmClubMemberValue.S_CountyId))) {
			conditionSql.append(" and county_id = :countyId ");
			queryParameter.put("countyId", dt.get(IBOCmClubMemberValue.S_CountyId));
		}
		// 手机号码
		if (dt.get(IBOCmClubMemberValue.S_BillId) != null && !"".equals(dt.get(IBOCmClubMemberValue.S_BillId))) {
			conditionSql.append(" and bill_id = :billId ");
			queryParameter.put("billId", dt.get(IBOCmClubMemberValue.S_BillId));
		}
		// 会员名称
		if (dt.get(IBOCmClubMemberValue.S_MemberName) != null && !"".equals(dt.get(IBOCmClubMemberValue.S_MemberName))) {
			conditionSql.append(" and member_name like :memberName ");
			queryParameter.put("memberName", dt.get(IBOCmClubMemberValue.S_MemberName) + "%");
		}
		// VIP卡号
		if (dt.get("CARD_CODE") != null && !"".equals(dt.get("CARD_CODE"))) {
			conditionSql.append(" and exists ( select * from {CM_CLUB_MEMBER_CARD} c where c.member_id = t.member_id and c.card_code = :cardCode  ) ");
			queryParameter.put("cardCode", dt.get("CARD_CODE"));
		}
		// 证件类型
		if (dt.get(IBOCmClubMemberValue.S_CertType) != null && dt.getAsInt(IBOCmClubMemberValue.S_CertType) > -1) {
			conditionSql.append(" and cert_type = :certType ");
			queryParameter.put("certType", dt.get(IBOCmClubMemberValue.S_CertType));
		}
		// 证件号码
		if (dt.get(IBOCmClubMemberValue.S_CertCode) != null && !"".equals(dt.get(IBOCmClubMemberValue.S_CertCode))) {
			conditionSql.append(" and cert_code = :certCode ");
			queryParameter.put("certCode", dt.get(IBOCmClubMemberValue.S_CertCode));
		}
		// 会员级别
		if (dt.get(IBOCmClubMemberValue.S_MemberLevel) != null && dt.getAsInt(IBOCmClubMemberValue.S_MemberLevel) > -1) {
			conditionSql.append(" and member_level = :memberLevel ");
			queryParameter.put("memberLevel", dt.get(IBOCmClubMemberValue.S_MemberLevel));
		}
		// 是否已分配客户经理
		if (dt.get("CUST_MANAGER_FLAG") != null && dt.getAsInt("CUST_MANAGER_FLAG") > 0) {
			int flag = dt.getAsInt("CUST_MANAGER_FLAG");
			if (flag == 1) {
				// 已分配客户经理
				conditionSql.append(" and exists ( select * from {CM_USER_MANAGER} cm where cm.user_id = t.user_id ) ");
			} else if (flag == 2) {
				// 未分配客户经理
				conditionSql.append(" and not exists ( select * from {CM_USER_MANAGER} cm where cm.user_id = t.user_id ) ");
			} else {
				// 错误参数
			}
		}

		// 电话经理
		if (dt.get("MANAGER_ID") != null && dt.getAsLong("MANAGER_ID") > 0) {
			conditionSql.append(" and exists ( select * from {CM_USER_MANAGER} m where m.user_id = t.user_id and m.manager_id = :managerId  ) ");
			queryParameter.put("managerId", dt.get("MANAGER_ID"));
		}
		// 电话经理组
		if (dt.get("TEAM_ID") != null && dt.getAsLong("TEAM_ID") > 0) {
			conditionSql.append(" and exists ( select * from {CM_USER_MANAGER} u where u.user_id = t.user_id "
					+ "and exists ( select * from {CM_CUST_MANAGER_TEAM_REL} r where r.manager_id = u.manager_id and r.team_id = :teamId ) ) ");
			queryParameter.put("teamId", dt.get("TEAM_ID"));
		}

		DataContainerInterface[] values = null;
		if (end > 0) {
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmClubMemberBean.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), start, end, queryParameter), queryParameter);
		} else {
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmClubMemberBean.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), min, max, queryParameter), queryParameter);
		}

		// modify by caiyu 20121130 增加电话经理信息和VIP卡号信息的返回
		if (values != null && values.length > 0) {
			// 查询到大客户信息
			Map queryCardPara = null;
			IBOLnCmUserManagerValue[] lnCmUserManager = null;
			IBOCmClubMemberCardValue[] memberCardValues = null;
			IQBOSecCustManagerValue secStaff = null;
			String condition = "";
			ICmLnClubMemberSV lnCMSV = CmxServiceFactory.getLnClubMemberSV();
			ICmCommonInnerSV cciSV = CmInnerServiceFactory.getCommonInnerSV();
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			for (int i = 0; i < values.length; i++) {
				lnCmUserManager = lnCMSV.getLnCmUserManager(values[i].getAsLong("USER_ID"));
				if (lnCmUserManager != null && lnCmUserManager.length > 0) {
					values[i].initProperty("MANAGER_ID", lnCmUserManager[0].getManagerId());

					// 增加返回客户经理姓名和联系电话
					secStaff = iseCm.getEffectAmInfo(lnCmUserManager[0].getManagerId(), CmLnConstants.CM_MANAGER_TYPE.STS_5);
					if (CmCommonUtil.isNotEmptyObject(secStaff)) {
						values[i].initProperty("MANAGER_NAME", secStaff.getManagername());
						values[i].initProperty("MANAGER_PHONE", secStaff.getBillid());
					}
				}
				condition = " state='U' and expire_date>now() and member_id= :memberId ";
				queryCardPara = new HashMap();
				queryCardPara.put("memberId", values[i].getAsLong("MEMBER_ID"));
				memberCardValues = (IBOCmClubMemberCardValue[]) cciSV.getBeans(BOCmClubMemberCardBean.class, condition, queryCardPara, -1, -1);
				if (memberCardValues != null && memberCardValues.length > 0) {
					values[i].initProperty("CARD_CODE", memberCardValues[0].getCardCode());
				}
			}

		}

		return values;
	}

}
