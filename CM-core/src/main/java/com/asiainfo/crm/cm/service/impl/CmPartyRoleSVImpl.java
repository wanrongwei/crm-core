/**
 * 
 */
package com.asiainfo.crm.cm.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.bo.QBOCmPartyRoleOkBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyRoleOkValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmGroupCustContactBean;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmIndivCustContactBean;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmGroupCustContactValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmIndivCustContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivContactValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;

/**   
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author mael
 * @date 2014-9-10 上午10:15:09
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-9-10     mael           v1.0.0               修改原因<br>
 */
public class CmPartyRoleSVImpl implements ICmPartyRoleSV {
	private static transient Log log = LogFactory.getLog(CmPartyRoleSVImpl.class);

	public IBOCmPartyRoleValue[] queryPartyRole(long partyId, int roleType, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap<String, Object> paraMap = new HashMap<String, Object>();
		condition.append(" 1 = 1 ").append(" and ").append(IBOCmPartyRoleValue.S_State).append("='U'");
		condition.append(" and ").append("(").append(IBOCmPartyRoleValue.S_RoleStatus).append(" =:roleStatus ||").append(IBOCmPartyRoleValue.S_RoleStatus).append(" is null ")
				.append(")");
		paraMap.put("roleStatus", CmConstants.roleStatus.ACTIVE);
		if (partyId > 0) {
			condition.append(" AND ").append(IBOCmPartyRoleValue.S_PartyId).append(" = :partyId");
			paraMap.put("partyId", partyId);
			if (roleType > 0) {
				condition.append(" AND ").append(IBOCmPartyRoleValue.S_RoleType).append(" = :roleType");
				paraMap.put("roleType", roleType);
			}
			String sql = CmCommonUtil.getDynamicSqlByConds(BOCmPartyRoleBean.class, condition.toString(), paraMap, start, end);
			IBOCmPartyRoleValue[] results = (IBOCmPartyRoleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmPartyRoleBean.class, sql, paraMap);
			if (null != results && results.length > 0) {
				return results;
			}
		}
		return new IBOCmPartyRoleValue[0];
	}

	public IBOCmPartyRoleValue[] queryAllPartyRoles(long partyId, int roleType, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1 = 1 ");
		if (partyId > 0) {
			condition.append("AND ").append(IBOCmPartyRoleValue.S_PartyId).append(" = :partyId");
			paraMap.put("partyId", partyId);
			if (roleType > 0) {
				condition.append(" AND ").append(IBOCmPartyRoleValue.S_RoleType).append(" = :roleType");
				paraMap.put("roleType", roleType);
			}
		}
		IBOCmPartyRoleValue[] results = (IBOCmPartyRoleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyRoleBean.class, condition.toString(), paraMap, start,
				end);
		if (null != results && results.length > 0) {
			return results;
		}
		return new IBOCmPartyRoleValue[0];
	}

	public void savePartyRole(BOCmPartyRoleBean bean) throws Exception {
		if (null != bean) {
			//判断是否是 role_type=4 的角色进行失效，就进行判断role_type=4是否是此partyId的最后一个角色，如果是则失效party
			long partyId = bean.getPartyId();
			long roleType = bean.getRoleType();
			long roleStatus = bean.getRoleStatus();
			boolean beanDelete = bean.isDeleted();
			
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);

			// 处理role_type=4的角色进行失效
			if (4 == roleType && (beanDelete || roleStatus == CmConstants.roleStatus.IN_ACTIVE)) {
				IBOCmPartyRoleValue[] cmPartyRoleValues = queryPartyRoleByPartyId(partyId);
				if (null == cmPartyRoleValues || cmPartyRoleValues.length <= 0) {
					ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
					partySV.expirePartyInfo(partyId);
				}
			}
		}
	}

	public IBOCmPartyRoleValue[] queryPartyRoleByPartyId(long partyId) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1").append(" and ").append(IBOCmPartyRoleValue.S_PartyId).append("= :partyId");
		condition.append(" and ").append("(").append(IBOCmPartyRoleValue.S_RoleStatus).append(" =:roleStatus ||").append(IBOCmPartyRoleValue.S_RoleStatus).append(" is null ")
				.append(")");
		condition.append(" and ").append(IBOCmPartyRoleValue.S_State).append(" =:state ");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		parameter.put("roleStatus", CmConstants.roleStatus.ACTIVE);
		parameter.put("state", CmConstants.RecordState.USE);
		IBOCmPartyRoleValue[] value = (IBOCmPartyRoleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyRoleBean.class, condition.toString(), parameter, -1, -1);
		return value;
	}

	public boolean IsPartyRoleUnique(long partyId, int partyRole) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1").append(" and ").append(IBOCmPartyRoleValue.S_PartyId).append("=:partyId").append(" and ").append(IBOCmPartyRoleValue.S_RoleType)
				.append("!=:partyRole").append(" and ").append(IBOCmPartyRoleValue.S_State + "='U'").append(" and ").append("(").append(IBOCmPartyRoleValue.S_RoleStatus)
				.append(" =:roleStatus ||").append(IBOCmPartyRoleValue.S_RoleStatus).append(" is null ").append(")");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		parameter.put("partyRole", partyRole);
		parameter.put("roleStatus", CmConstants.roleStatus.ACTIVE);
		IBOCmPartyRoleValue[] value = (IBOCmPartyRoleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyRoleBean.class, condition.toString(), parameter, -1, -1);
		return !CmCommonUtil.isNotEmptyObject(value);

	}

	public void savePartyRoleInfo(IBOCmPartyRoleValue value) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(value)) {
			long partyId = value.getPartyId();
			long roleType = value.getRoleType();
			// 查询出角色信息
			IBOCmPartyRoleValue[] roleValues = queryPartyRoles(partyId, DataType.getAsInt(roleType), -1);
			if (CmCommonUtil.isNotEmptyObject(roleValues)) {
				// 存在角色信息如果状态是inactive则需要改为active
				if (roleValues[0].getRoleStatus() == CmConstants.roleStatus.IN_ACTIVE
						|| StringUtils.equalsIgnoreCase(roleValues[0].getState(), CmConstants.RecordState.ERASE)) {
					roleValues[0].setRoleStatus(CmConstants.roleStatus.ACTIVE);
					roleValues[0].setState(CmConstants.RecordState.USE);
					BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
					bean.copy(roleValues[0]);
					// 保存角色信息
					savePartyRole(bean);
				}
			} else {
				// 如果不存在角色信息则需要插入一条角色信息
				BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
				bean.copy(value);
				bean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
				bean.setState(CmConstants.RecordState.USE);
				bean.setRegionId(CmCommonUtil.getDefaultRegionId());
				// 保存角色信息
				savePartyRole(bean);
			}
		}
	}

	public int queryPartyRoleCount(long partyId, int roleType) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap<String, Object> paraMap = new HashMap<String, Object>();
		condition.append(" 1 = 1 ");
		if (partyId > 0) {
			condition.append(" AND ").append(IBOCmPartyRoleValue.S_PartyId).append(" = :partyId");
			paraMap.put("partyId", partyId);
		}
		if (roleType > 0) {
			condition.append(" AND ").append(IBOCmPartyRoleValue.S_RoleType).append(" = :roleType");
			paraMap.put("roleType", roleType);
		}
		condition.append(" AND ").append("(").append(IBOCmPartyRoleValue.S_RoleStatus).append(" =:roleStatus ||").append(IBOCmPartyRoleValue.S_RoleStatus).append(" is null ")
				.append(")");
		paraMap.put("roleStatus", CmConstants.roleStatus.ACTIVE);
		condition.append(" AND ").append(IBOCmPartyRoleValue.S_State).append(" =:state ");
		paraMap.put("state", CmConstants.RecordState.USE);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmPartyRoleBean.class, condition.toString(), paraMap);
	}

	public IBOCmPartyRoleValue[] queryPartyRoles(long partyId, int partyType, int start, int end) throws Exception {
		IBOCmPartyRoleValue[] results = queryAllPartyRoles(partyId, -1, start, end);
		if (results != null && results.length > 0) {
			return results;
		}
		return new IBOCmPartyRoleValue[0];
	}

	public int queryPartyRolesCount(long partyId, int partyType) throws Exception {
		return queryPartyRoleCount(partyId, -1);
	}

	public IBOCmPartyRoleValue[] queryPartyRoles(long partyId, int roleType, int roleStatus) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap<String, Object> paraMap = new HashMap<String, Object>();
		condition.append(" 1 = 1 ");
		if (partyId > 0) {
			condition.append(" AND ").append(IBOCmPartyRoleValue.S_PartyId).append(" = :partyId");
			paraMap.put("partyId", partyId);
		}
		if (roleType > 0) {
			condition.append(" AND ").append(IBOCmPartyRoleValue.S_RoleType).append(" = :roleType");
			paraMap.put("roleType", roleType);
		}
		if (roleStatus > 0) {
			condition.append(" AND ").append(IBOCmPartyRoleValue.S_RoleStatus).append(" = :roleStatus");
			paraMap.put("roleStatus", roleStatus);
		}
		return (IBOCmPartyRoleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyRoleBean.class, condition.toString(), paraMap, -1, -1);
	}

	public IQBOCmPartyRoleOkValue[] qryRoleHistory(int roleType, long partyId, String startDate, String endDate, int startrowindex, int endrowindex) throws Exception {
		StringBuffer finalSql = new StringBuffer();
		// StringBuilder condition = new StringBuilder();
		StringBuffer condition = new StringBuffer(
				"SELECT A.PARTY_NAME,B.PARTY_ID,B.DONE_DATE,B.ROLE_STATUS,B.ROLE_TYPE FROM {CM_PARTY}  A ,{CM_PARTY_ROLE_H} B WHERE A.PARTY_ID=B.PARTY_ID");
		StringBuffer conditionH = new StringBuffer(
				"SELECT A.PARTY_NAME,B.PARTY_ID,B.DONE_DATE,B.ROLE_STATUS,B.ROLE_TYPE FROM {CM_PARTY} A ,{CM_PARTY_ROLE} B WHERE A.PARTY_ID=B.PARTY_ID AND B.STATE='E' AND B.ROLE_STATUS='2' ");
		HashMap<String, Object> paraMap = new HashMap<String, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date sDate = sdf.parse(startDate);
		Date dDate = sdf.parse(endDate);
		condition.append(" AND 1=1 ");
		conditionH.append(" AND 1=1 ");
		if (partyId > 0) {
			// condition.append(" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM {CM_PARTY} m where m.party_id= :partyId ");
			condition.append(" AND A.").append(IQBOCmPartyRoleOkValue.S_PartyId).append(" = :partyId");
			conditionH.append(" AND A.").append(IQBOCmPartyRoleOkValue.S_PartyId).append(" = :partyId");
			paraMap.put("partyId", partyId);
		}
		if (roleType > 0) {
			condition.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_RoleType).append("= :roleType");
			conditionH.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_RoleType).append("= :roleType");
			paraMap.put("roleType", roleType);
		}
		if (StringUtils.isNotBlank(startDate)) {
			condition.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_DoneDate).append(" >= :DONE_DATE");
			conditionH.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_DoneDate).append(" >= :DONE_DATE");
			paraMap.put("DONE_DATE", sDate);
		}
		if (StringUtils.isNotBlank(endDate)) {
			condition.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_DoneDate).append(" < :END_DATE");
			conditionH.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_DoneDate).append(" < :END_DATE");
			paraMap.put("END_DATE", TimeUtil.addOrMinusDays(dDate.getTime(), 1));
		}
		finalSql.append(condition).append(" UNION ALl ").append(conditionH);
		if (startrowindex < 0 && endrowindex >= 0)
			finalSql.append(" limit ").append("0").append(",").append(endrowindex);
		else if (endrowindex < 0 && startrowindex >= 0) {
			if (startrowindex > 0)
				finalSql.append(" limit ").append(startrowindex - 1).append(",").append("18446744073709551615");
			else
				finalSql.append(" limit ").append(startrowindex).append(",").append("18446744073709551615");
		} else if (endrowindex < startrowindex) {
			finalSql.append(" limit ").append("0").append(",").append("0");
		} else {
			int offset = (endrowindex - startrowindex) + 1;
			int tmpStart = 0;
			if (startrowindex > 0)
				tmpStart = startrowindex - 1;
			else
				tmpStart = 0;
			finalSql.append(" limit ").append(tmpStart).append(",").append(offset);
		}

		String sql = SplitTableFactory.createQuerySQL(finalSql.toString(), paraMap);
		// IQBOCmPartyRoleOkValue[]
		// results=(IQBOCmPartyRoleOkValue[])CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmPartyRoleOkBean.class,
		// condition.toString(), paraMap, startrowindex, endrowindex);
		// String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPartyRoleOkBean.class, condition.toString(), paraMap,
		// startrowindex, endrowindex);
		IQBOCmPartyRoleOkValue[] results = (IQBOCmPartyRoleOkValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPartyRoleOkBean.class, sql, paraMap);
		return results;

	}

	public int qryRoleHistoryCount(int roleType, long partyId, String startDate, String endDate) throws Exception {
		StringBuffer finalSql = new StringBuffer();
		// StringBuilder condition = new StringBuilder();
		StringBuffer condition = new StringBuffer(
				"SELECT A.PARTY_NAME,B.PARTY_ID,B.DONE_DATE,B.ROLE_STATUS,B.ROLE_TYPE FROM {CM_PARTY}  A ,{CM_PARTY_ROLE_H} B WHERE A.PARTY_ID=B.PARTY_ID");
		StringBuffer conditionH = new StringBuffer(
				"SELECT A.PARTY_NAME,B.PARTY_ID,B.DONE_DATE,B.ROLE_STATUS,B.ROLE_TYPE FROM {CM_PARTY} A ,{CM_PARTY_ROLE} B WHERE A.PARTY_ID=B.PARTY_ID AND B.STATE='E' AND B.ROLE_STATUS='2' ");
		HashMap<String, Object> paraMap = new HashMap<String, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date sDate = sdf.parse(startDate);
		Date dDate = sdf.parse(endDate);
		condition.append(" AND 1=1 ");
		conditionH.append(" AND 1=1 ");
		if (partyId > 0) {
			// condition.append(" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM {CM_PARTY} m where m.party_id= :partyId ");
			condition.append(" AND A.").append(IQBOCmPartyRoleOkValue.S_PartyId).append(" = :partyId");
			conditionH.append(" AND A.").append(IQBOCmPartyRoleOkValue.S_PartyId).append(" = :partyId");
			paraMap.put("partyId", partyId);
		}
		if (roleType > 0) {
			condition.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_RoleType).append("= :roleType");
			conditionH.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_RoleType).append("= :roleType");
			paraMap.put("roleType", roleType);
		}
		if (StringUtils.isNotBlank(startDate)) {
			condition.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_DoneDate).append(" >= :DONE_DATE");
			conditionH.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_DoneDate).append(" >= :DONE_DATE");
			paraMap.put("DONE_DATE", sDate);
		}
		if (StringUtils.isNotBlank(endDate)) {
			condition.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_DoneDate).append(" < :END_DATE");
			conditionH.append(" AND B.").append(IQBOCmPartyRoleOkValue.S_DoneDate).append(" < :END_DATE");
			paraMap.put("END_DATE", TimeUtil.addOrMinusDays(dDate.getTime(), 1));
		}
		finalSql.append(condition).append(" UNION ALl ").append(conditionH);
		String sql = SplitTableFactory.createQuerySQL(finalSql.toString(), paraMap);
		DataContainer[] dc = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		if (dc != null && dc.length > 0) {
			return dc[0].getAsInt("CNT");
		}
		return 0;
	}
	
	/**
	 * 针对联系人，处理partyRole 角色
	 * @param partyId
	 * @param operationType  1:新增   2：删除(逻辑删除)  3:修改
	 * @throws Exception 
	 */
	public void dealPartyRoleForContact(long partyId,int operationType,IBOCmPartyRoleValue cmPartyRoleValue) throws Exception {
		IBOCmPartyRoleValue[]  cmPartyRoleValues = queryPartyRoles(partyId,4,1);
		if(2==operationType){//如果存在记录，且操作是需要删除时，就查询相应的校验条件，是否能删除
			if(null!=cmPartyRoleValues&&cmPartyRoleValues.length>0) {
				if(checkCmGroupContact(partyId)) {
					//如果存在有效联系人联系记录，则不能进行删除（逻辑删除）cmPartyRole
					log.info("this partyId have a valid CmGroupContact record . partyId="+partyId);
					return;
				}
				if(checkCmIndivContact(partyId)) {
					//如果存在有效联系人联系记录，则不能进行删除（逻辑删除）cmPartyRole
					log.info("this partyId has a valid CmIndivContact record . partyId="+partyId);
					return;
				}
				cmPartyRoleValues[0].setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
				cmPartyRoleValues[0].setState(CmConstants.RecordState.ERASE);
				BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
				bean.copy(cmPartyRoleValues[0]);
				bean.delete();
				savePartyRole(bean);
			}
		}else if(1==operationType){//如果不存在记录，且操作是新增或者修改时，需要新增联系人角色
			if(null==cmPartyRoleValues||cmPartyRoleValues.length<=0) {
				IBOCmIndivContactValue[] iContactValue = CmServiceFactory.getContactSV().queryCmIndivContactByPartyId(partyId);
				if(null!=iContactValue&&iContactValue.length>0) {
					BOCmPartyRoleBean roleBean = new BOCmPartyRoleBean();
					roleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
					roleBean.setRoleType(CmConstants.PartyRoleType.CONTACT);
					roleBean.setEntityId(iContactValue[0].getContId());
					roleBean.setPartyId(partyId);
					roleBean.setRegionId(iContactValue[0].getRegionId());
					roleBean.setState(CmConstants.RecordState.USE);
					roleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
					roleBean.setRoleRegionId(iContactValue[0].getRegionId());
					savePartyRole(roleBean);
				}
			}
		}else if(3==operationType) {
			if(null!=cmPartyRoleValues&&cmPartyRoleValues.length>0&&null==cmPartyRoleValue) {
				cmPartyRoleValues[0].setEffectiveDate(cmPartyRoleValue.getEffectiveDate());
				cmPartyRoleValues[0].setExpireDate(cmPartyRoleValue.getExpireDate());
				BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
				bean.copy(cmPartyRoleValues[0]);
				savePartyRole(bean);
			}
		}
	}
	
	public boolean checkCmGroupContact(long partyId) throws Exception {
		boolean resultBo = false;
		IBOCmGroupContactValue[] iContactValue = CmServiceFactory.getContactSV().queryCmGroupContactByPartyId(partyId);
		if(null!=iContactValue&&iContactValue.length>0) {
			resultBo = true;
		}
		return resultBo;
	}
	
	public boolean checkCmIndivContact(long partyId) throws Exception {
		boolean resultBo = false;
		IBOCmIndivContactValue[] iContactValue = CmServiceFactory.getContactSV().queryCmIndivContactByPartyId(partyId);
		if(null!=iContactValue&&iContactValue.length>0) {
			resultBo = true;
		}
		return resultBo;
	}
}
