package com.asiainfo.crm.cm.customer.group.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMemUserBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMemberBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupKeyMemBillBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupKeyMemberBean;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupMemberDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemBillValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemHobbyValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupKeyMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustMemberUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupKeyMemberUserValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupMemberSV;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CmBusiLogBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.query.ivalues.IQBOCmGroupMemberQryCdnValue;

public class CmGroupMemberSVImpl implements ICmGroupMemberSV {

	private static transient Log log = LogFactory.getLog(CmGroupMemberSVImpl.class);

	public void insertGroupMember() throws Exception {
		DataContainerInterface dc = new DataContainer();
		dc.set("CUST_ID", "23710000001623");
		dc.set("MEMBER_CUST_ID", "3453246");
		dc.set("MEMBER_NAME", "test");
		dc.set("STATE", "U");
		IVOCustValue custValue = new VOCustBean();
		IBOCmGroupMemberValue cmGroupMemberValue = new BOCmGroupMemberBean();
		ICustRelationshipValue custRelValue = new CustRelationshipBean();
		cmGroupMemberValue.copy(dc);
		custRelValue.copy(cmGroupMemberValue);
		custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
		custValue.addCustRel(custRelValue);
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
	}

	public IBOCmGroupCustMemberValue queryGroupCustMemberById(long custRelId) throws Exception, RemoteException {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupCustMemberValue.S_State).append(" = :state ");
		condition.append(" AND ").append(IBOCmGroupCustMemberValue.S_CustRelId).append(" = :custRelId ");
		parameter.put("state", CmConstants.RecordState.USE);
		parameter.put("custRelId", Long.valueOf(custRelId));
		IBOCmGroupCustMemberValue[] memberValues = getGroupCustMemberDAO().queryGroupCustMembers(condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(memberValues)) {
			return memberValues[0];
		}
		return null;
	}

	public IBOCmGroupKeyMemHobbyValue[] queryGroupKeyMemHobbyByKernelId(long kernelId, int startNum, int endNum) throws Exception, RemoteException {
		if (0 >= kernelId) {
			if (log.isErrorEnabled()) {
				// 参数不符合要求
				log.error(CrmLocaleFactory.getResource("CMS0706041", "kernelId"));
			}
			ExceptionUtil.throwBusinessException("CMS0706041", "kernelId");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupKeyMemHobbyValue.S_KernelId).append(" = :kernelId ");
		parameter.put("kernelId", Long.valueOf(kernelId));
		return getGroupCustMemberDAO().queryGroupKeyMemHobby(condition.toString(), parameter, startNum, endNum);
	}

	public IQBOCmGroupCustMemberUserValue[] queryQGroupCustMemberUsersByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue, int startNum, int endNum) throws Exception,
			RemoteException {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		// 构造查询条件
		buildQryQCustMemberUserCdnAndParam(memberQryCdnValue, condition, parameter);
		// 记录日志
		CmServiceFactory.getBusiLogSV().saveBusiLog(new CmBusiLogBean());
		IQBOCmGroupCustMemberUserValue[] custMemberUserValues = getGroupCustMemberDAO().queryQGroupCustMemberUsers(condition.toString(), parameter, startNum, endNum);
		return custMemberUserValues;
	}

	// 保存集团客户成员信息
	public void saveGroupCustMembers(IBOCmGroupCustMemberValue[] groupCustMemberValues) throws Exception, RemoteException {
		if (CmCommonUtil.isNotEmptyObject(groupCustMemberValues)) {
			ICmGroupMemberDAO memberDAO = getGroupCustMemberDAO();
			List syncKeyMemberList = new ArrayList();
			String[] KeyMemberPropertyNames = new BOCmGroupKeyMemberBean().getPropertyNames();
			StringBuilder condition = null;
			Map parameter = null;
			for (int i = 0, length = groupCustMemberValues.length; i < length; i++) {
				// 如果是新增，需要设置
				if (groupCustMemberValues[i].isNew()) {
					// 如果没有被设置主键的值时才需要重新设置主键值。
					if (groupCustMemberValues[i].getCustRelId() <= 0) {
						groupCustMemberValues[i].setCustRelId(memberDAO.getNewGroupCustMemberId());
					}
					groupCustMemberValues[i].setState(CmConstants.RecordState.USE);
					// 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5
					if (ServiceManager.getUser() != null) {
						groupCustMemberValues[i].setCreateOpId(ServiceManager.getUser().getID());
						groupCustMemberValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
				} else if (groupCustMemberValues[i].isDeleted()) {
					groupCustMemberValues[i].setStsToOld();
					groupCustMemberValues[i].setState(CmConstants.RecordState.ERASE);
				} else if (groupCustMemberValues[i].isModified() && groupCustMemberValues[i].getIndivCustId() > 0) {
					condition = new StringBuilder();
					parameter = new HashMap();
					condition.append(IBOCmGroupKeyMemberValue.S_State).append(" = :state ");
					condition.append(" AND ").append(IBOCmGroupKeyMemberValue.S_GroupCustId).append(" = :groupCustId ");
					condition.append(" AND ").append(IBOCmGroupKeyMemberValue.S_IndivCustId).append(" = :indivCustId ");
					parameter.put("state", CmConstants.RecordState.USE);
					parameter.put("groupCustId", Long.valueOf(groupCustMemberValues[i].getGroupCustId()));
					parameter.put("indivCustId", Long.valueOf(groupCustMemberValues[i].getIndivCustId()));
					IBOCmGroupKeyMemberValue[] keyMemberValues = memberDAO.queryGroupKeyMembers(condition.toString(), parameter, -1, -1);
					if (CmCommonUtil.isNotEmptyObject(keyMemberValues)) {
						for (int j = 0, len = keyMemberValues.length; j < len; j++) {
							for (int k = 0, l = KeyMemberPropertyNames.length; k < l; k++) {
								// 只修改有变化的值(非主键属性)
								if (groupCustMemberValues[i].isPropertyModified(KeyMemberPropertyNames[k])
										&& !KeyMemberPropertyNames[k].equalsIgnoreCase(IBOCmGroupKeyMemberValue.S_KernelId)) {
									keyMemberValues[j].set(KeyMemberPropertyNames[k], DataType.transfer(groupCustMemberValues[i].get(KeyMemberPropertyNames[k]), keyMemberValues[j]
											.getPropertyType(KeyMemberPropertyNames[k])));
								}
							}
							syncKeyMemberList.add(keyMemberValues[i]);
						}
					}
				}
			}
			memberDAO.saveGroupCustMembers(groupCustMemberValues);
			if (CmCommonUtil.isNotEmptyObject(syncKeyMemberList)) {
				memberDAO.saveGroupKeyMembers((IBOCmGroupKeyMemberValue[]) syncKeyMemberList.toArray(new IBOCmGroupKeyMemberValue[0]));
			}
			// 添加日志
			CmServiceFactory.getBusiLogSV().saveBusiLog(new CmBusiLogBean());
		}
	}

	public void saveGroupCustMemUsers(IBOCmGroupCustMemUserValue[] custMemUserValues) throws Exception, RemoteException {
		this.saveGroupCustMemUsers(custMemUserValues, true);
	}

	public void saveGroupCustMemUsers(IBOCmGroupCustMemUserValue[] custMemUserValues, boolean isSyncKeyMember) throws Exception, RemoteException {
		/*
		 * if (CmCommonUtil.isNotEmptyObject(custMemUserValues)) { ICmGroupMemberDAO memberDAO =
		 * getGroupCustMemberDAO(); for (int i = 0; i < custMemUserValues.length; i++) { if
		 * (custMemUserValues[i].isNew()) { // 没有设置主键值时生成主键 if (custMemUserValues[i].getMemUserId() <= 0) {
		 * custMemUserValues[i].setMemUserId(memberDAO.getNewGroupCustMemberUserId()); }
		 * custMemUserValues[i].setState(CmConstants.RecordState.USE);
		 * custMemUserValues[i].setBillId(custMemUserValues[i].getBillId().trim()); // 增加记录创建记录的操作员信息 added by huzq2 at
		 * 2011-8-5 if (ServiceManager.getUser() != null) {
		 * custMemUserValues[i].setCreateOpId(ServiceManager.getUser().getID());
		 * custMemUserValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId()); } } else if
		 * (custMemUserValues[i].isDeleted()) { custMemUserValues[i].setStsToOld();
		 * custMemUserValues[i].setState(CmConstants.RecordState.ERASE); }
		 * 当成员分类为网内成员或者网外成员时，如果成员类别不是普通成员并且不是核心成员，则需要同步新增关键人物关联成员。 if (isSyncKeyMember &&
		 * (custMemUserValues[i].getMemberType() == CmConstants.GroupMember.TYPE_INNER_MEMBER || custMemUserValues[i]
		 * .getMemberType() == CmConstants.GroupMember.TYPE_OUT_MEMBER )) { StringBuilder condition = new
		 * StringBuilder(); Map parameter = new HashMap(); condition.append(IBOCmGroupCustMemUserValue.S_State).append(" =
		 * :state "); condition.append(" AND ").append(IBOCmGroupKeyMemBillValue.S_BillId).append(" = :billId ");
		 * condition.append(" AND ").append(IBOCmGroupKeyMemBillValue.S_GroupCustId).append(" = :groupCustId ");
		 * parameter.put("state", CmConstants.RecordState.USE); parameter.put("billId",
		 * custMemUserValues[i].getBillId()); parameter.put("groupCustId",
		 * Long.valueOf(custMemUserValues[i].getGroupCustId())); IBOCmGroupKeyMemBillValue[] keyMemUsers =
		 * memberDAO.queryGroupKeyMemBills(condition.toString(), parameter, -1, -1); // 当存在该手机号码关联的关键人物关联用户信息。 if
		 * (CmCommonUtil.isNotEmptyObject(keyMemUsers)) { // 如果当前成员类别为非关键人物的级别，则删除关键人物信息。 if
		 * (custMemUserValues[i].getMemberLevel() == CmConstants.GroupMemberLevel.NORMAL_MEMBER ||
		 * custMemUserValues[i].getMemberLevel() == CmConstants.GroupMemberLevel.CORE_MEMBER ||
		 * CmConstants.RecordState.ERASE.equalsIgnoreCase(custMemUserValues[i].getState())) { for (int j = 0, len =
		 * keyMemUsers.length; j < len; j++) { keyMemUsers[j].setState(CmConstants.RecordState.ERASE); } } // 修改级别 else {
		 * for (int j = 0, len = keyMemUsers.length; j < len; j++) {
		 * keyMemUsers[j].setMemberLevel(custMemUserValues[i].getMemberLevel()); } } } else { //
		 * 如果当前成员类别为关键人物的级别，则需要增加关键人物信息。 if (custMemUserValues[i].getMemberLevel() !=
		 * CmConstants.GroupMemberLevel.NORMAL_MEMBER && custMemUserValues[i].getMemberLevel() !=
		 * CmConstants.GroupMemberLevel.CORE_MEMBER) { // 先查询出该关联用户的成员信息，再取个人客户编号来同步新增关键人物信息或关键人物关联用户信息。
		 * IBOCmGroupCustMemberValue custMemberValue =
		 * this.queryGroupCustMemberById(custMemUserValues[i].getCustRelId()); // 只有当成员对应的个人客户编号不为空是才可以添加关键人物。 if
		 * (custMemberValue.getIndivCustId() > 0) { condition.delete(0, condition.length()); parameter.clear();
		 * condition.append(IBOCmGroupCustMemberValue.S_State).append(" = :state "); condition.append(" AND
		 * ").append(IBOCmGroupCustMemberValue.S_IndivCustId).append(" = :indivCustId "); condition.append(" AND
		 * ").append(IBOCmGroupCustMemberValue.S_GroupCustId).append(" = :groupCustId "); parameter.put("state",
		 * CmConstants.RecordState.USE); parameter.put("indivCustId", Long.valueOf(custMemberValue.getIndivCustId()));
		 * parameter.put("groupCustId", Long.valueOf(custMemUserValues[i].getGroupCustId())); IBOCmGroupKeyMemberValue[]
		 * keyMemberValues = memberDAO.queryGroupKeyMembers(condition.toString(), parameter, -1, -1); //
		 * 如果不为空则取第一条，否则新增一条 if (!CmCommonUtil.isNotEmptyObject(keyMemberValues)) { keyMemberValues = new
		 * IBOCmGroupKeyMemberValue[1]; keyMemberValues[0] = new BOCmGroupKeyMemberBean();
		 * keyMemberValues[0].copy(custMemberValue); keyMemberValues[0].setStsToNew();
		 * keyMemberValues[0].setKernelId(memberDAO.getNewGroupKeyMemberId());
		 * keyMemberValues[0].setState(CmConstants.RecordState.USE); // 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5 if
		 * (ServiceManager.getUser() != null) { keyMemberValues[0].setCreateOpId(ServiceManager.getUser().getID());
		 * keyMemberValues[0].setCreateOrgId(ServiceManager.getUser().getOrgId()); }
		 * memberDAO.saveGroupKeyMembers(keyMemberValues); } keyMemUsers = new IBOCmGroupKeyMemBillValue[1];
		 * keyMemUsers[0] = new BOCmGroupKeyMemBillBean(); keyMemUsers[0].copy(custMemUserValues[i]);
		 * keyMemUsers[0].setStsToNew(); keyMemUsers[0].setKernelId(keyMemberValues[0].getKernelId());
		 * keyMemUsers[0].setMemUserId(memberDAO.getNewGroupKeyMemberUserId());
		 * keyMemUsers[0].setState(CmConstants.RecordState.USE); // 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5 if
		 * (ServiceManager.getUser() != null) { keyMemUsers[0].setCreateOpId(ServiceManager.getUser().getID());
		 * keyMemUsers[0].setCreateOrgId(ServiceManager.getUser().getOrgId()); } } } }
		 * memberDAO.saveGroupKeyMemBills(keyMemUsers); } } memberDAO.saveGroupCustMemUsers(custMemUserValues); // 记录日志
		 * //CmServiceFactory.getBusiLogSV().logs(custMemUserValues, null, null, CmGroupMemberBusiLogHelperImpl.class); }
		 */
	}

	public void saveGroupKeyMembers(IBOCmGroupKeyMemberValue[] memberValues) throws Exception, RemoteException {
		if (CmCommonUtil.isNotEmptyObject(memberValues)) {
			ICmGroupMemberDAO memberDAO = getGroupCustMemberDAO();
			String[] custMemberPropertyNames = new BOCmGroupCustMemberBean().getPropertyNames();
			List syncCustMemberList = new ArrayList();
			StringBuilder condition = null;
			Map parameter = null;
			for (int i = 0, length = memberValues.length; i < length; i++) {
				// 如果是新增，需要生成主键，并做关联设置
				if (memberValues[i].isNew()) {
					// 设置关键人物的主键
					if (memberValues[i].getKernelId() < 1) {
						memberValues[i].setKernelId(memberDAO.getNewGroupKeyMemberId());
					}
					// 设置STATE
					memberValues[i].setState(CmConstants.RecordState.USE);
					// 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5
					if (ServiceManager.getUser() != null) {
						memberValues[i].setCreateOpId(ServiceManager.getUser().getID());
						memberValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
				} else if (memberValues[i].isDeleted()) {
					memberValues[i].setStsToOld();
					memberValues[i].setState(CmConstants.RecordState.ERASE);
				} else if (memberValues[i].isModified() && memberValues[i].getIndivCustId() > 0) {
					condition = new StringBuilder();
					parameter = new HashMap();
					condition.append(IBOCmGroupCustMemberValue.S_State).append(" = :state ");
					condition.append(" AND ").append(IBOCmGroupCustMemberValue.S_GroupCustId).append(" = :groupCustId ");
					condition.append(" AND ").append(IBOCmGroupCustMemberValue.S_IndivCustId).append(" = :indivCustId ");
					parameter.put("state", CmConstants.RecordState.USE);
					parameter.put("groupCustId", Long.valueOf(memberValues[i].getGroupCustId()));
					parameter.put("indivCustId", Long.valueOf(memberValues[i].getIndivCustId()));
					IBOCmGroupCustMemberValue[] custMemberValues = memberDAO.queryGroupCustMembers(condition.toString(), parameter, -1, -1);
					if (CmCommonUtil.isNotEmptyObject(custMemberValues)) {
						for (int j = 0, len = custMemberValues.length; j < len; j++) {
							for (int k = 0, l = custMemberPropertyNames.length; k < l; k++) {
								// 只修改有变化的值(非主键属性)
								if (memberValues[i].isPropertyModified(custMemberPropertyNames[k])
										&& !custMemberPropertyNames[k].equalsIgnoreCase(IBOCmGroupCustMemberValue.S_CustRelId)) {
									custMemberValues[j].set(custMemberPropertyNames[k], DataType.transfer(memberValues[i].get(custMemberPropertyNames[k]), custMemberValues[j]
											.getPropertyType(custMemberPropertyNames[k])));
								}
							}
							syncCustMemberList.add(custMemberValues[i]);
						}
					}
				}
			}
			memberDAO.saveGroupKeyMembers(memberValues);
			if (CmCommonUtil.isNotEmptyObject(syncCustMemberList)) {
				memberDAO.saveGroupCustMembers((IBOCmGroupCustMemberValue[]) syncCustMemberList.toArray(new IBOCmGroupCustMemberValue[0]));
			}
			// 添加日志
			/*
			 * CmServiceFactory.getBusiLogSV().logs( memberValues, new
			 * CmBusiCodeDataBean(CmBusinessOperation.GROUP_KEY_MEMBER_ADD, CmBusinessOperation.GROUP_KEY_MEMBER_DELETE,
			 * CmBusinessOperation.GROUP_KEY_MEMBER_MODIFY, CmBusinessOperation.GROUP_KEY_MEMBER_MODIFY), null,
			 * CmGroupMemberBusiLogHelperImpl.class);
			 */
		}
	}

	public void saveGroupKeyMemHobby(IBOCmGroupKeyMemHobbyValue[] keyMemHobbyValues) throws Exception, RemoteException {
		if (CmCommonUtil.isNotEmptyObject(keyMemHobbyValues)) {
			for (int i = 0, length = keyMemHobbyValues.length; i < length; i++) {
				if (keyMemHobbyValues[i].isNew()) {
					keyMemHobbyValues[i].setState(CmConstants.RecordState.USE);
					// 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5
					if (ServiceManager.getUser() != null) {
						keyMemHobbyValues[i].setCreateOpId(ServiceManager.getUser().getID());
						keyMemHobbyValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					}
				} else if (keyMemHobbyValues[i].isDeleted()) {
					keyMemHobbyValues[i].setStsToOld();
					keyMemHobbyValues[i].setState(CmConstants.RecordState.ERASE);
				}
			}
			getGroupCustMemberDAO().saveGroupKeyMemHobbys(keyMemHobbyValues);
		}
	}

	public void saveQGroupCustMemberUsersNotAsync(IQBOCmGroupCustMemberUserValue[] groupCustMemberUserValues) throws Exception, RemoteException {
		asyncSaveQGroupCustMemberUsers(groupCustMemberUserValues);
	}

	/**
	 * 保存集团成员信息（不同步集团关键人物信息）
	 * 
	 * @Function: asyncSaveQGroupCustMemberUsers
	 * 
	 * @param groupCustMemberUserValues
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 11, 2011 7:04:43 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jun 11, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	private void asyncSaveQGroupCustMemberUsers(IQBOCmGroupCustMemberUserValue[] groupCustMemberUserValues) throws Exception, RemoteException {
		/*
		 * if (CmCommonUtil.isNotEmptyObject(groupCustMemberUserValues)) { // 需要保存的成员信息列表 List memberList = new
		 * ArrayList(); // 需要保存的成员关联用户信息列表 List memUserList = new ArrayList(); // 临时变量 IBOCmGroupCustMemberValue
		 * tempMemberValue = null; IBOCmGroupCustMemUserValue tempMemUserValue = null; // 成员管理DAO ICmGroupMemberDAO
		 * memberDAO = getGroupCustMemberDAO(); // 保存集团成员信息 String[] MemberPropertyNames = new
		 * BOCmGroupCustMemberBean().getPropertyNames(); String[] MemUserPropertyNames = new
		 * BOCmGroupCustMemUserBean().getPropertyNames(); 循环遍历参数中的每一条记录，将其拆分为单个的表BO对象，再加入到List中。 for (int i = 0, length =
		 * groupCustMemberUserValues.length; i < length; i++) { tempMemberValue = new BOCmGroupCustMemberBean();
		 * tempMemUserValue = new BOCmGroupCustMemUserBean(); // 如果是新增，则需要生成主键的序列号，并添加关联关系。 // 处理新增相关的业务 if
		 * (groupCustMemberUserValues[i].isNew()) { // 去除手机号码的空格
		 * groupCustMemberUserValues[i].setBillId(groupCustMemberUserValues[i].getBillId().trim()); // 增加记录创建记录的操作员信息
		 * added by huzq2 at 2011-8-5 if (ServiceManager.getUser() != null) {
		 * groupCustMemberUserValues[i].setCreateOpId(ServiceManager.getUser().getID());
		 * groupCustMemberUserValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId()); }
		 * 需要先判断该个人客户是否已经是该集团的成员,如果是则只要关联用户即可，否则增加成员。 IQBOCmGroupCustMemberUserValue[] custMemberUserValues = null; Map
		 * parameter = new HashMap(); // 只有网内成员或其他成员才有INDIV_CUST_ID，才能验证是否存在！ if
		 * (groupCustMemberUserValues[i].getIndivCustId() > 0 && (groupCustMemberUserValues[i].getMemberType() ==
		 * CmConstants.GroupMember.TYPE_INNER_MEMBER || groupCustMemberUserValues[i].getMemberType() ==
		 * CmConstants.GroupMember.TYPE_EXT_MEMBER)) { parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
		 * Long.valueOf(groupCustMemberUserValues[i].getGroupCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_IndivCustId,
		 * Long.valueOf(groupCustMemberUserValues[i].getIndivCustId())); custMemberUserValues =
		 * this.queryQGroupCustMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1); }
		 * 如果不存在该个人客户对应的成员信息，则新增成员 if (!CmCommonUtil.isNotEmptyObject(custMemberUserValues)) { for (int k = 0; k <
		 * MemberPropertyNames.length; k++) { // 只拷贝有值的字段 if (groupCustMemberUserValues[i].get(MemberPropertyNames[k]) !=
		 * null) { tempMemberValue.set(MemberPropertyNames[k],
		 * DataType.transfer(groupCustMemberUserValues[i].get(MemberPropertyNames[k]), tempMemberValue
		 * .getPropertyType(MemberPropertyNames[k]))); } } // 设置STATE
		 * tempMemberValue.setState(CmConstants.RecordState.USE); // 设置集团客户成员的主键
		 * tempMemberValue.setCustRelId(memberDAO.getNewGroupCustMemberId()); // 回设
		 * groupCustMemberUserValues[i].setCustRelId(tempMemberValue.getCustRelId()); memberList.add(tempMemberValue); }
		 * else { tempMemberValue.copy(custMemberUserValues[0]); } for (int k = 0; k < MemUserPropertyNames.length; k++) { //
		 * 只拷贝有值的字段 if (groupCustMemberUserValues[i].get(MemUserPropertyNames[k]) != null) {
		 * tempMemUserValue.set(MemUserPropertyNames[k],
		 * DataType.transfer(groupCustMemberUserValues[i].get(MemUserPropertyNames[k]), tempMemUserValue
		 * .getPropertyType(MemUserPropertyNames[k]))); } } // 设置STATE
		 * tempMemUserValue.setState(CmConstants.RecordState.USE); // 设置集团客户成员关联用户信息主键
		 * tempMemUserValue.setMemUserId(memberDAO.getNewGroupCustMemberUserId()); // 设置集团客户成员关联用户信息与集团成员之间的关系（外键关联）。
		 * tempMemUserValue.setCustRelId(tempMemberValue.getCustRelId()); // 回写给入参
		 * groupCustMemberUserValues[i].setCustRelId(tempMemberValue.getCustRelId());
		 * groupCustMemberUserValues[i].setMemUserId(tempMemUserValue.getMemUserId());
		 * memUserList.add(tempMemUserValue); } // 处理成员信息变更的相关业务 else if (groupCustMemberUserValues[i].isModified()) {
		 * tempMemberValue.copy(groupCustMemberUserValues[i]); tempMemUserValue.copy(groupCustMemberUserValues[i]);
		 * memberList.add(tempMemberValue); 需要判断主键是否为空，如果不为空才修改关联用户信息 if (tempMemUserValue.getMemUserId() > 0) {
		 * memUserList.add(tempMemUserValue); } } // 处理删除集团成员相关的业务 else if (groupCustMemberUserValues[i].isDeleted()) { //
		 * 判断该成员下面是否还有其他的关联用户，如果没有则删除成员信息，否则不能删除 if
		 * (this.queryGroupCustMemUserCountByCustRelId(groupCustMemberUserValues[i].getCustRelId()) == 1) {
		 * tempMemberValue.copy(groupCustMemberUserValues[i]); tempMemberValue.setStsToOld();
		 * tempMemberValue.setState(CmConstants.RecordState.ERASE); memberList.add(tempMemberValue); }
		 * tempMemUserValue.copy(groupCustMemberUserValues[i]); tempMemUserValue.setStsToOld();
		 * tempMemUserValue.setState(CmConstants.RecordState.ERASE); memUserList.add(tempMemUserValue); } } //
		 * 保存对集团成员的信息修改 if (CmCommonUtil.isNotEmptyObject(memberList)) {
		 * memberDAO.saveGroupCustMembers((IBOCmGroupCustMemberValue[]) memberList.toArray(new
		 * IBOCmGroupCustMemberValue[0])); } // 保存对集团成员关联用户的修改
		 * memberDAO.saveGroupCustMemUsers((IBOCmGroupCustMemUserValue[]) memUserList.toArray(new
		 * IBOCmGroupCustMemUserValue[0])); }
		 */
	}

	public void saveQGroupCustMemberUsers(IQBOCmGroupCustMemberUserValue[] groupCustMemberUserValues) throws Exception, RemoteException {
		this._saveQGroupCustMemberUsers(groupCustMemberUserValues);
		// 添加日志
		// CmServiceFactory.getBusiLogSV().logs(groupCustMemberUserValues, null, null,
		// CmGroupMemberBusiLogHelperImpl.class);
	}

	private void _saveQGroupCustMemberUsers(IQBOCmGroupCustMemberUserValue[] groupCustMemberUserValues) throws Exception, RemoteException {
		this.asyncSaveQGroupCustMemberUsers(groupCustMemberUserValues);
		this.syncGroupKeyMemberUsers(groupCustMemberUserValues);
	}

	public void saveQGroupCustMemberUser(IQBOCmGroupCustMemberUserValue groupCustMemberUserValue) throws Exception, RemoteException {
		/*
		 * ICmGroupMemberDAO memberDAO = getGroupCustMemberDAO(); IBOCmGroupCustMemberValue tempMemberValue = null;
		 * IBOCmGroupCustMemUserValue tempMemUserValue = null; IBOCmGroupKeyMemberValue tempKeyMemberValue = null;
		 * IBOCmGroupKeyMemBillValue tempKeyMemBillValue = null; 如果是新增，则需要根据成员分类以及成员类别判断是否需要增加关键人物信息。 if
		 * (groupCustMemberUserValue.isNew()) { // 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5 if
		 * (ServiceManager.getUser() != null) {
		 * groupCustMemberUserValue.setCreateOpId(ServiceManager.getUser().getID());
		 * groupCustMemberUserValue.setCreateOrgId(ServiceManager.getUser().getOrgId()); }
		 * 先根据集团客户编号和个人客户编号查询该集团下是否已经有了同一个客户的成员，如果存在则直接关联，否则新增. if (groupCustMemberUserValue.getIndivCustId() > 0 &&
		 * String.valueOf(groupCustMemberUserValue.getIndivCustId()).length() >= 9 &&
		 * String.valueOf(groupCustMemberUserValue.getIndivCustId()).length() <= 12) { StringBuilder condition = new
		 * StringBuilder(); Map parameter = new HashMap(); condition.append(IBOCmGroupCustMemberValue.S_State).append(" =
		 * :state "); condition.append(" AND ").append(IBOCmGroupCustMemberValue.S_GroupCustId).append(" = :groupCustId
		 * "); condition.append(" AND ").append(IBOCmGroupCustMemberValue.S_IndivCustId).append(" = :indivCustId ");
		 * parameter.put("state", CmConstants.RecordState.USE); parameter.put("groupCustId",
		 * Long.valueOf(groupCustMemberUserValue.getGroupCustId())); parameter.put("indivCustId",
		 * Long.valueOf(groupCustMemberUserValue.getIndivCustId())); IBOCmGroupCustMemberValue[] custMemberValues =
		 * memberDAO.queryGroupCustMembers(condition.toString(), parameter, -1, -1); if
		 * (CmCommonUtil.isNotEmptyObject(custMemberValues)) { tempMemberValue = custMemberValues[0]; //
		 * 根据前台传入的值来判断是否需要修改信息 String[] MemberPropertyNames = new BOCmGroupCustMemberBean().getPropertyNames(); Map
		 * keyPropertie = tempMemberValue.getKeyProperties(); for (int i = 0; i < MemberPropertyNames.length; i++) { //
		 * 如果新增的对象中有对应的属性并且这些非主键属性的值不等于集团成员中对应属性的值，则修改。 if (groupCustMemberUserValue.hasProperty(MemberPropertyNames[i]) &&
		 * !CmCommonUtil.equals(DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]),
		 * tempMemberValue.getPropertyType(MemberPropertyNames[i])), tempMemberValue.get(MemberPropertyNames[i])) &&
		 * !keyPropertie.containsKey(MemberPropertyNames[i])) { tempMemberValue.set(MemberPropertyNames[i], DataType
		 * .transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]),
		 * tempMemberValue.getPropertyType(MemberPropertyNames[i]))); } } } } if (tempMemberValue == null) {
		 * tempMemberValue = new BOCmGroupCustMemberBean(); tempMemberValue.copy(groupCustMemberUserValue);
		 * tempMemberValue.setCustRelId(memberDAO.getNewGroupCustMemberId()); } tempMemUserValue = new
		 * BOCmGroupCustMemUserBean(); tempMemUserValue.copy(groupCustMemberUserValue);
		 * tempMemUserValue.setMemUserId(memberDAO.getNewGroupCustMemberUserId());
		 * tempMemUserValue.setCustRelId(tempMemberValue.getCustRelId());
		 * groupCustMemberUserValue.setCustRelId(tempMemberValue.getCustRelId()); 新增集团成员时如果成员的类别为非普通成员和核心人物，则需要同时增加关键人物
		 * if (groupCustMemberUserValue.getMemberType() == CmConstants.GroupMember.TYPE_INNER_MEMBER &&
		 * groupCustMemberUserValue.getMemberLevel() != CmConstants.GroupMemberLevel.NORMAL_MEMBER &&
		 * groupCustMemberUserValue.getMemberLevel() != CmConstants.GroupMemberLevel.CORE_MEMBER) { Map parameter = new
		 * HashMap(); parameter.put(IQBOCmGroupMemberQryCdnValue.S_IndivCustId,
		 * Long.valueOf(groupCustMemberUserValue.getIndivCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
		 * Long.valueOf(groupCustMemberUserValue.getGroupCustId())); IQBOCmGroupKeyMemberUserValue[] keyMemberUserValues =
		 * this.queryQGroupKeyMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1); if
		 * (CmCommonUtil.isNotEmptyObject(keyMemberUserValues)) { // 拷贝第一个即可 tempKeyMemberValue = new
		 * BOCmGroupKeyMemberBean(); tempKeyMemberValue.copy(keyMemberUserValues[0]); for (int j = 0; j <
		 * keyMemberUserValues.length; j++) { // 只有当两个号码一致时 if
		 * (keyMemberUserValues[j].getBillId().equals(groupCustMemberUserValue.getBillId())) { tempKeyMemBillValue = new
		 * BOCmGroupKeyMemBillBean(); tempKeyMemBillValue.copy(keyMemberUserValues[j]); break; } } } else {
		 * tempKeyMemberValue = new BOCmGroupKeyMemberBean(); tempKeyMemBillValue = new BOCmGroupKeyMemBillBean();
		 * tempKeyMemberValue.copy(groupCustMemberUserValue); tempKeyMemBillValue.copy(groupCustMemberUserValue);
		 * tempKeyMemberValue.setKernelId(memberDAO.getNewGroupKeyMemberId());
		 * tempKeyMemBillValue.setMemUserId(memberDAO.getNewGroupKeyMemberUserId());
		 * tempKeyMemBillValue.setKernelId(tempKeyMemberValue.getKernelId()); } } } else if
		 * (groupCustMemberUserValue.isModified()) { tempMemberValue = new BOCmGroupCustMemberBean(); tempMemUserValue =
		 * new BOCmGroupCustMemUserBean(); tempMemberValue.copy(groupCustMemberUserValue);
		 * tempMemUserValue.copy(groupCustMemberUserValue); if (groupCustMemberUserValue.getMemberType() ==
		 * CmConstants.GroupMember.TYPE_INNER_MEMBER) { Map parameter = new HashMap();
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_IndivCustId,
		 * Long.valueOf(groupCustMemberUserValue.getIndivCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
		 * Long.valueOf(groupCustMemberUserValue.getGroupCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_BillId, groupCustMemberUserValue.getBillId());
		 * IQBOCmGroupKeyMemberUserValue[] keyMemberUserValues =
		 * this.queryQGroupKeyMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1);
		 * 如果成员分类为网内成员并且成员类别为非普通成员和核心成员则直接根据集团编号和个人客户编号、BillId查询 if (groupCustMemberUserValue.getMemberLevel() !=
		 * CmConstants.GroupMemberLevel.NORMAL_MEMBER && groupCustMemberUserValue.getMemberLevel() !=
		 * CmConstants.GroupMemberLevel.CORE_MEMBER) { if (CmCommonUtil.isNotEmptyObject(keyMemberUserValues)) {
		 * tempKeyMemberValue = new BOCmGroupKeyMemberBean(); tempKeyMemBillValue = new BOCmGroupKeyMemBillBean();
		 * tempKeyMemberValue.copy(keyMemberUserValues[0]); tempKeyMemBillValue.copy(keyMemberUserValues[0]); String[]
		 * MemberPropertyNames = new BOCmGroupKeyMemberBean().getPropertyNames(); Map keyPropertie =
		 * tempKeyMemberValue.getKeyProperties(); for (int i = 0; i < MemberPropertyNames.length; i++) { //
		 * 如果对象中有对应的属性并且这些非主键属性的值不等于集团成员中对应属性的值，则修改。 if (groupCustMemberUserValue.hasProperty(MemberPropertyNames[i]) &&
		 * !CmCommonUtil.equals(DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]),
		 * tempKeyMemberValue.getPropertyType(MemberPropertyNames[i])), tempKeyMemberValue.get(MemberPropertyNames[i])) &&
		 * !keyPropertie.containsKey(MemberPropertyNames[i])) { tempKeyMemberValue.set(MemberPropertyNames[i],
		 * DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]), tempKeyMemberValue
		 * .getPropertyType(MemberPropertyNames[i]))); } } MemberPropertyNames = new
		 * BOCmGroupKeyMemBillBean().getPropertyNames(); keyPropertie = tempKeyMemBillValue.getKeyProperties(); for (int
		 * i = 0; i < MemberPropertyNames.length; i++) { // 如果对象中有对应的属性并且这些非主键属性的值不等于集团成员中对应属性的值，则修改。 if
		 * (groupCustMemberUserValue.hasProperty(MemberPropertyNames[i]) &&
		 * !CmCommonUtil.equals(DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]),
		 * tempKeyMemBillValue.getPropertyType(MemberPropertyNames[i])),
		 * tempKeyMemBillValue.get(MemberPropertyNames[i])) && !keyPropertie.containsKey(MemberPropertyNames[i])) {
		 * tempKeyMemBillValue.set(MemberPropertyNames[i],
		 * DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]), tempKeyMemBillValue
		 * .getPropertyType(MemberPropertyNames[i]))); } } } 如果没有则需要增加一个关键人物 else { StringBuilder condition = new
		 * StringBuilder(); parameter = new HashMap(); condition.append(IBOCmGroupKeyMemberValue.S_State).append(" =
		 * :state "); condition.append(" AND ").append(IBOCmGroupKeyMemberValue.S_GroupCustId).append(" = :groupCustId
		 * "); condition.append(" AND ").append(IBOCmGroupKeyMemberValue.S_IndivCustId).append(" = :indivCustId ");
		 * parameter.put("state", CmConstants.RecordState.USE); parameter.put("groupCustId",
		 * Long.valueOf(groupCustMemberUserValue.getGroupCustId())); parameter.put("indivCustId",
		 * Long.valueOf(groupCustMemberUserValue.getIndivCustId())); IBOCmGroupKeyMemberValue[] keyMemberValues =
		 * memberDAO.queryGroupKeyMembers(condition.toString(), parameter, -1, -1); if
		 * (!CmCommonUtil.isNotEmptyObject(keyMemberValues)) { tempKeyMemberValue = new BOCmGroupKeyMemberBean();
		 * tempKeyMemberValue.copy(groupCustMemberUserValue); tempKeyMemberValue.setStsToNew();
		 * tempKeyMemberValue.setKernelId(memberDAO.getNewGroupKeyMemberId()); } else { tempKeyMemberValue = new
		 * BOCmGroupKeyMemberBean(); tempKeyMemberValue.copy(keyMemberValues[0]); String[] MemberPropertyNames = new
		 * BOCmGroupKeyMemberBean().getPropertyNames(); Map keyPropertie = tempKeyMemberValue.getKeyProperties(); for
		 * (int i = 0; i < MemberPropertyNames.length; i++) { // 如果新增的对象中有对应的属性并且这些非主键属性的值不等于集团成员中对应属性的值，则修改。 if
		 * (groupCustMemberUserValue.hasProperty(MemberPropertyNames[i]) &&
		 * !CmCommonUtil.equals(DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]),
		 * tempKeyMemberValue.getPropertyType(MemberPropertyNames[i])), tempKeyMemberValue.get(MemberPropertyNames[i])) &&
		 * !keyPropertie.containsKey(MemberPropertyNames[i])) { tempKeyMemberValue.set(MemberPropertyNames[i],
		 * DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]), tempKeyMemberValue
		 * .getPropertyType(MemberPropertyNames[i]))); } } } tempKeyMemBillValue = new BOCmGroupKeyMemBillBean();
		 * tempKeyMemBillValue.copy(groupCustMemberUserValue); tempKeyMemBillValue.setStsToNew();
		 * tempKeyMemBillValue.setMemUserId(memberDAO.getNewGroupKeyMemberUserId());
		 * tempKeyMemBillValue.setKernelId(tempKeyMemberValue.getKernelId()); } }
		 * 否则如果成员分类是网内成员，但是成员类别不是关键人物的类别，则需要删除关键人物信息 else { if (CmCommonUtil.isNotEmptyObject(keyMemberUserValues)) { if
		 * (this.queryGroupKeyMemBillCountByKernelId(keyMemberUserValues[0].getKernelId()) == 1) { tempKeyMemberValue =
		 * new BOCmGroupKeyMemberBean(); tempKeyMemberValue.copy(keyMemberUserValues[0]);
		 * tempKeyMemberValue.setState(CmConstants.RecordState.ERASE); } tempKeyMemBillValue = new
		 * BOCmGroupKeyMemBillBean(); tempKeyMemBillValue.copy(keyMemberUserValues[0]);
		 * tempKeyMemBillValue.setState(CmConstants.RecordState.ERASE); } } } 否则只需要更新关键人物成员的信息 else { StringBuilder
		 * condition = new StringBuilder(); Map parameter = new HashMap();
		 * condition.append(IBOCmGroupKeyMemberValue.S_State).append(" = :state "); condition.append(" AND
		 * ").append(IBOCmGroupKeyMemberValue.S_GroupCustId).append(" = :groupCustId "); condition.append(" AND
		 * ").append(IBOCmGroupKeyMemberValue.S_IndivCustId).append(" = :indivCustId "); parameter.put("state",
		 * CmConstants.RecordState.USE); parameter.put("groupCustId",
		 * Long.valueOf(groupCustMemberUserValue.getGroupCustId())); parameter.put("indivCustId",
		 * Long.valueOf(groupCustMemberUserValue.getIndivCustId())); IBOCmGroupKeyMemberValue[] keyMemberValues =
		 * memberDAO.queryGroupKeyMembers(condition.toString(), parameter, -1, -1); if
		 * (CmCommonUtil.isNotEmptyObject(keyMemberValues)) { // 默认取第一个 tempKeyMemberValue = keyMemberValues[0];
		 * String[] MemberPropertyNames = new BOCmGroupKeyMemberBean().getPropertyNames(); Map keyPropertie =
		 * tempKeyMemberValue.getKeyProperties(); for (int i = 0; i < MemberPropertyNames.length; i++) { //
		 * 如果新增的对象中有对应的属性并且这些非主键属性的值不等于集团成员中对应属性的值，则修改。 if (groupCustMemberUserValue.hasProperty(MemberPropertyNames[i]) &&
		 * !CmCommonUtil.equals(DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]),
		 * tempKeyMemberValue.getPropertyType(MemberPropertyNames[i])), tempKeyMemberValue.get(MemberPropertyNames[i])) &&
		 * !keyPropertie.containsKey(MemberPropertyNames[i])) { tempKeyMemberValue.set(MemberPropertyNames[i],
		 * DataType.transfer(groupCustMemberUserValue.get(MemberPropertyNames[i]), tempKeyMemberValue
		 * .getPropertyType(MemberPropertyNames[i]))); } } } } } else if (groupCustMemberUserValue.isDeleted()) { //
		 * 判断该成员下面是否还有其他的关联用户，如果没有则删除成员信息，否则不能删除 if
		 * (this.queryGroupCustMemUserCountByCustRelId(groupCustMemberUserValue.getCustRelId()) == 1) { tempMemberValue =
		 * new BOCmGroupCustMemberBean(); tempMemberValue.copy(groupCustMemberUserValue); tempMemberValue.setStsToOld();
		 * tempMemberValue.setState(CmConstants.RecordState.ERASE); } tempMemUserValue = new BOCmGroupCustMemUserBean();
		 * tempMemUserValue.copy(groupCustMemberUserValue); tempMemUserValue.setStsToOld();
		 * tempMemUserValue.setState(CmConstants.RecordState.ERASE); // 同步关键人物 if
		 * (groupCustMemberUserValue.getMemberType() == CmConstants.GroupMember.TYPE_INNER_MEMBER &&
		 * groupCustMemberUserValue.getMemberLevel() != CmConstants.GroupMemberLevel.NORMAL_MEMBER &&
		 * groupCustMemberUserValue.getMemberLevel() != CmConstants.GroupMemberLevel.CORE_MEMBER) { Map parameter = new
		 * HashMap(); parameter.put(IQBOCmGroupMemberQryCdnValue.S_IndivCustId,
		 * Long.valueOf(groupCustMemberUserValue.getIndivCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
		 * Long.valueOf(groupCustMemberUserValue.getGroupCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_BillId, groupCustMemberUserValue.getBillId());
		 * IQBOCmGroupKeyMemberUserValue[] keyMemberUserValues =
		 * this.queryQGroupKeyMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1); if
		 * (CmCommonUtil.isNotEmptyObject(keyMemberUserValues)) { if
		 * (this.queryGroupKeyMemBillCountByKernelId(keyMemberUserValues[0].getKernelId()) == 1) { tempKeyMemberValue =
		 * new BOCmGroupKeyMemberBean(); tempKeyMemberValue.copy(keyMemberUserValues[0]);
		 * tempKeyMemberValue.setState(CmConstants.RecordState.ERASE); } tempKeyMemBillValue = new
		 * BOCmGroupKeyMemBillBean(); tempKeyMemBillValue.copy(keyMemberUserValues[0]);
		 * tempKeyMemBillValue.setState(CmConstants.RecordState.ERASE); } } } // 保存 if (tempMemberValue != null &&
		 * (tempMemberValue.isNew() || tempMemberValue.isDeleted() || tempMemberValue.isModified())) {
		 * memberDAO.saveGroupCustMember(tempMemberValue); } if (tempMemUserValue != null && (tempMemUserValue.isNew() ||
		 * tempMemUserValue.isDeleted() || tempMemUserValue.isModified())) {
		 * memberDAO.saveGroupCustMemUser(tempMemUserValue); } if (tempKeyMemberValue != null &&
		 * (tempKeyMemberValue.isNew() || tempKeyMemberValue.isDeleted() || tempKeyMemberValue.isModified())) {
		 * memberDAO.saveGroupKeyMember(tempKeyMemberValue); }
		 */
	}

	public void saveQGroupKeyMemberUserAndHobby(IQBOCmGroupKeyMemberUserValue groupKeyMemberUserValue, IBOCmGroupKeyMemHobbyValue[] groupKeyMemHobbyValues, int addMember)
			throws Exception, RemoteException {
		/*
		 * if (groupKeyMemberUserValue == null) { return; } 如果addMember == 1则需要 同时增加集团成员 if (addMember == 1) { Map
		 * parameter = new HashMap(); IQBOCmGroupCustMemberUserValue[] custMemberValues = null;
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_BillId, groupKeyMemberUserValue.getBillId());
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_MemberType,
		 * Integer.valueOf(groupKeyMemberUserValue.getMemberType())); IQBOCmGroupMemberQryCdnValue memberQryCdnValue =
		 * CmGroupMemberUtil.createGroupMemberQryCdn(parameter); 先验证该号码是否已经集团成员，如果已经是了则不允许再添加。 custMemberValues =
		 * this.queryQGroupCustMemberUsersByCdn(memberQryCdnValue, -1, -1); if
		 * (CmCommonUtil.isNotEmptyObject(custMemberValues)) { // 查询客户经理 IQBOCmGroupCustManagerValue[]
		 * groupCustManagerValues = ((ICmGroupCustomerSV)
		 * ServiceFactory.getService(ICmGroupCustomerSV.class)).queryGroupCustManagersByGroupId(custMemberValues[0]
		 * .getGroupCustId()); String mgrName = ""; String mgrBillId = ""; if
		 * (CmCommonUtil.isNotEmptyObject(groupCustManagerValues)) { // 暂时取第一个，后面再看看 mgrName =
		 * groupCustManagerValues[0].getStaffName(); mgrBillId = groupCustManagerValues[0].getBillId(); } if
		 * (log.isErrorEnabled()) { log.error(CrmLocaleFactory.getResource("CMS0707053", new String[] {
		 * groupKeyMemberUserValue.getBillId(), CrmLocaleFactory.getResource("CMS0400262"),
		 * String.valueOf(custMemberValues[0].getGroupId()), mgrName, mgrBillId })); }
		 * ExceptionUtil.throwBusinessException("CMS0707053", new String[] { groupKeyMemberUserValue.getBillId(),
		 * CrmLocaleFactory.getResource("CMS0400262"), String.valueOf(custMemberValues[0].getGroupId()), mgrName,
		 * mgrBillId }); } // 如果不存在才新增。 IQBOCmGroupCustMemberUserValue groupCustMemberUserValue = new
		 * QBOCmGroupCustMemberUserBean(); groupCustMemberUserValue = new QBOCmGroupCustMemberUserBean();
		 * groupCustMemberUserValue.copy(groupKeyMemberUserValue); this.asyncSaveQGroupCustMemberUsers(new
		 * IQBOCmGroupCustMemberUserValue[] { groupCustMemberUserValue }); } 保存关键人物信息
		 * this.asyncSaveQGroupKeyMemberUsers(new IQBOCmGroupKeyMemberUserValue[] { groupKeyMemberUserValue });
		 * 保存关键人物爱好信息。 if (CmCommonUtil.isNotEmptyObject(groupKeyMemHobbyValues)) { for (int i = 0; i <
		 * groupKeyMemHobbyValues.length; i++) { if (groupKeyMemHobbyValues[i].isNew()) {
		 * groupKeyMemHobbyValues[i].setKernelId(groupKeyMemberUserValue.getKernelId()); } }
		 * this.saveGroupKeyMemHobby(groupKeyMemHobbyValues); } // 记录日志
		 * CmServiceFactory.getBusiLogSV().log(groupKeyMemberUserValue, null, null,
		 * CmGroupMemberBusiLogHelperImpl.class);
		 */
	}

	private void asyncSaveQGroupKeyMemberUsers(IQBOCmGroupKeyMemberUserValue[] groupKeyMemberUserValues) throws Exception, RemoteException {
		/*
		 * if (CmCommonUtil.isNotEmptyObject(groupKeyMemberUserValues)) { IBOCmGroupKeyMemberValue tempMemberValue =
		 * null; IBOCmGroupKeyMemBillValue tempMemUserValue = null; ICmGroupMemberDAO memberDAO =
		 * getGroupCustMemberDAO(); ICmxGroupAccountSV ucm2Crm = (ICmxGroupAccountSV)
		 * ServiceFactory.getService(ICmxGroupAccountSV.class); String[] KeyMemberPropertyNames = new
		 * BOCmGroupKeyMemberBean().getPropertyNames(); String[] KeyMemUserPropertyNames = new
		 * BOCmGroupKeyMemBillBean().getPropertyNames(); for (int i = 0, length = groupKeyMemberUserValues.length; i <
		 * length; i++) { List memberList = new ArrayList(); List memUserList = new ArrayList(); tempMemUserValue = new
		 * BOCmGroupKeyMemBillBean(); tempMemberValue = new BOCmGroupKeyMemberBean(); int state = 0; //
		 * 如果是新增，需要生成主键，并做关联设置 if (groupKeyMemberUserValues[i].isNew()) { // 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5
		 * if (ServiceManager.getUser() != null) {
		 * groupKeyMemberUserValues[i].setCreateOpId(ServiceManager.getUser().getID());
		 * groupKeyMemberUserValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId()); } // 去除手机号码前后的空格
		 * groupKeyMemberUserValues[i].setBillId(groupKeyMemberUserValues[i].getBillId().trim());
		 * 需要先判断该个人客户是否已经是该集团的关键人物,如果是则只要关联用户即可，否则增加关键人物。 IQBOCmGroupKeyMemberUserValue[] tempMemberUserValues = null;
		 * if (groupKeyMemberUserValues[i].getMemberType() == CmConstants.GroupMember.TYPE_INNER_MEMBER) { Map parameter =
		 * new HashMap(); parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
		 * Long.valueOf(groupKeyMemberUserValues[i].getGroupCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_IndivCustId,
		 * Long.valueOf(groupKeyMemberUserValues[i].getIndivCustId())); tempMemberUserValues =
		 * this.queryQGroupKeyMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1); }
		 * 如果不存在该个人客户对应的关键人物信息，则新增关键人物 if (!CmCommonUtil.isNotEmptyObject(tempMemberUserValues)) { for (int k = 0; k <
		 * KeyMemberPropertyNames.length; k++) { if (groupKeyMemberUserValues[i].get(KeyMemberPropertyNames[k]) != null) {
		 * tempMemberValue.set(KeyMemberPropertyNames[k],
		 * DataType.transfer(groupKeyMemberUserValues[i].get(KeyMemberPropertyNames[k]), tempMemberValue
		 * .getPropertyType(KeyMemberPropertyNames[k]))); } } // 设置STATE
		 * tempMemberValue.setState(CmConstants.RecordState.USE); // 设置关键人物的主键
		 * tempMemberValue.setKernelId(memberDAO.getNewGroupKeyMemberId()); // 回设
		 * groupKeyMemberUserValues[i].setKernelId(tempMemberValue.getKernelId()); memberList.add(tempMemberValue); }
		 * else { tempMemberValue.copy(tempMemberUserValues[0]); } for (int k = 0; k < KeyMemUserPropertyNames.length;
		 * k++) { if (groupKeyMemberUserValues[i].get(KeyMemUserPropertyNames[k]) != null) {
		 * tempMemUserValue.set(KeyMemUserPropertyNames[k],
		 * DataType.transfer(groupKeyMemberUserValues[i].get(KeyMemUserPropertyNames[k]), tempMemUserValue
		 * .getPropertyType(KeyMemUserPropertyNames[k]))); } } // 设置kernelType if (tempMemberValue.getMemberLevel() ==
		 * CmConstants.GroupMemberLevel.CONTACT_MEMBER) { tempMemberValue.setKernelType(GroupMemberKernelType.CONTACT); }
		 * else { tempMemberValue.setKernelType(GroupMemberKernelType.KERNEL_MEMBER); }
		 * tempMemUserValue.setState(CmConstants.RecordState.USE); // 设置关键人物关联用户信息的主键
		 * tempMemUserValue.setMemUserId(memberDAO.getNewGroupKeyMemberUserId()); // 设置关键人物关联用户信息与关键人物信息关联关系
		 * tempMemUserValue.setKernelId(tempMemberValue.getKernelId()); memUserList.add(tempMemUserValue); state = 1; }
		 * else if (groupKeyMemberUserValues[i].isModified()) { tempMemberValue = new BOCmGroupKeyMemberBean();
		 * tempMemberValue.copy(groupKeyMemberUserValues[i]); tempMemUserValue.copy(groupKeyMemberUserValues[i]);
		 * memberList.add(tempMemberValue); memUserList.add(tempMemUserValue); state = 2; } else if
		 * (groupKeyMemberUserValues[i].isDeleted()) { // 需要判断该集团关键人物下面是否还有其他的关联用户信息,如果有则不能删除 if
		 * (this.queryGroupKeyMemBillCountByKernelId(groupKeyMemberUserValues[i].getKernelId()) == 1) { tempMemberValue =
		 * new BOCmGroupKeyMemberBean(); tempMemberValue.copy(groupKeyMemberUserValues[i]);
		 * tempMemberValue.setStsToOld(); tempMemberValue.setState(CmConstants.RecordState.ERASE);
		 * memberList.add(tempMemberValue); } tempMemUserValue.copy(groupKeyMemberUserValues[i]);
		 * tempMemUserValue.setStsToOld(); tempMemUserValue.setState(CmConstants.RecordState.ERASE);
		 * memUserList.add(tempMemUserValue); state = 3; } if (CmCommonUtil.isNotEmptyObject(memberList)) {
		 * memberDAO.saveGroupKeyMembers((IBOCmGroupKeyMemberValue[]) memberList.toArray(new
		 * IBOCmGroupKeyMemberValue[0])); } memberDAO.saveGroupKeyMemBills((IBOCmGroupKeyMemBillValue[])
		 * memUserList.toArray(new IBOCmGroupKeyMemBillValue[0]));
		 * if(groupKeyMemberUserValues[i].getMemberLevel()!=CmConstants.GroupMemberLevel.CONTACT_MEMBER &&
		 * !groupKeyMemberUserValues[i].isPropertyModified(IQBOCmGroupKeyMemberUserValue.S_BillId) &&
		 * !groupKeyMemberUserValues[i].isPropertyModified(IQBOCmGroupKeyMemberUserValue.S_MemberName)){ continue; }
		 * if(state==1){
		 * ucm2Crm.unifyAmByGroupCustId(groupKeyMemberUserValues[i].getGroupCustId(),CmConstants.IUcm2Crm.STATE_ADD);
		 * }else if(state == 2){
		 * ucm2Crm.unifyAmByGroupCustId(groupKeyMemberUserValues[i].getGroupCustId(),CmConstants.IUcm2Crm.STATE_MODIFY);
		 * }else if(state==3){
		 * ucm2Crm.unifyAmByGroupCustId(groupKeyMemberUserValues[i].getGroupCustId(),CmConstants.IUcm2Crm.STATE_DEL); } } }
		 */
	}

	public void saveQGroupKeyMemberUsers(IQBOCmGroupKeyMemberUserValue[] groupKeyMemberUserValues) throws Exception, RemoteException {
		this.asyncSaveQGroupKeyMemberUsers(groupKeyMemberUserValues);
		this.syncGroupCustMemberUsers(groupKeyMemberUserValues);
		// 添加日志
		// CmServiceFactory.getBusiLogSV().logs(groupKeyMemberUserValues, null, null,
		// CmGroupMemberBusiLogHelperImpl.class);
	}

	public void updateGroupMemberVipLevel(String billId, int currentVipLevel) throws Exception, RemoteException {
		ICmGroupMemberDAO groupMemberDAO = getGroupCustMemberDAO();
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		// 更新集团成员的VIP级别
		{
			condition.append(IQBOCmGroupCustMemberUserValue.S_MemberState).append(" = :memberState ");
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_UserState).append(" = :userState ");
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_GroupState).append(" = :groupState ");
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_BillId).append(" = :billId ");
			parameter.put("memberState", CmConstants.RecordState.USE);
			parameter.put("userState", CmConstants.RecordState.USE);
			parameter.put("groupState", CmConstants.RecordState.USE);
			parameter.put("billId", billId);
			IQBOCmGroupCustMemberUserValue[] memberUserValues = groupMemberDAO.queryQGroupCustMemberUsers(condition.toString(), parameter, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(memberUserValues)) {
				int length = memberUserValues.length;
				IBOCmGroupCustMemUserValue[] tempMemberValues = new IBOCmGroupCustMemUserValue[length];
				for (int i = 0; i < length; i++) {
					tempMemberValues[i] = new BOCmGroupCustMemUserBean();
					tempMemberValues[i].copy(memberUserValues[i]);
					tempMemberValues[i].setVipLevel(currentVipLevel);
					memberUserValues[i].setVipLevel(currentVipLevel);
				}
				groupMemberDAO.saveGroupCustMemUsers(tempMemberValues);
				/*
				 * CmServiceFactory.getBusiLogSV().logs(memberUserValues, new
				 * CmBusiCodeDataBean(CmBusinessOperation.GROUP_CUST_MEMBER_MODIFY),
				 * CrmLocaleFactory.getResource("CMS0000513", CrmLocaleFactory.getResource("CMS0400262"),
				 * String.valueOf(currentVipLevel)), CmGroupMemberBusiLogHelperImpl.class);
				 */
			}
		}
		// 更新集团关键人物的VIP级别
		{
			condition.delete(0, condition.length());
			condition.append(IQBOCmGroupKeyMemberUserValue.S_MemberState).append(" = :memberState ");
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_UserState).append(" = :userState ");
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_GroupState).append(" = :groupState ");
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_BillId).append(" = :billId ");
			parameter.put("memberState", CmConstants.RecordState.USE);
			parameter.put("userState", CmConstants.RecordState.USE);
			parameter.put("groupState", CmConstants.RecordState.USE);
			parameter.put("billId", billId);
			IQBOCmGroupKeyMemberUserValue[] keyMemberUserValues = groupMemberDAO.queryQGroupKeyMemberUsers(condition.toString(), parameter, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(keyMemberUserValues)) {
				int length = keyMemberUserValues.length;
				IBOCmGroupKeyMemBillValue[] tempMemberValues = new IBOCmGroupKeyMemBillValue[length];
				for (int i = 0; i < length; i++) {
					tempMemberValues[i] = new BOCmGroupKeyMemBillBean();
					tempMemberValues[i].copy(keyMemberUserValues[i]);
					tempMemberValues[i].setVipLevel(currentVipLevel);
					keyMemberUserValues[i].setVipLevel(currentVipLevel);
				}
				groupMemberDAO.saveGroupKeyMemBills(tempMemberValues);
				/*
				 * CmServiceFactory.getBusiLogSV().logs(keyMemberUserValues, new
				 * CmBusiCodeDataBean(CmBusinessOperation.GROUP_KEY_MEMBER_MODIFY),
				 * CrmLocaleFactory.getResource("CMS0000513", CrmLocaleFactory.getResource("CMS0000418"),
				 * String.valueOf(currentVipLevel)), CmGroupMemberBusiLogHelperImpl.class);
				 */
			}
		}
	}

	private void buildQryQCustMemberUserCdnAndParam(IQBOCmGroupMemberQryCdnValue memberQryCdnValue, StringBuilder condition, Map parameter) throws Exception, RemoteException {
		// 查询条件IValue不能为空
		if (memberQryCdnValue == null || condition == null || parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0403001"));
			}
			ExceptionUtil.throwBusinessException("CMS0403001");
		}
		// gaozm add 按集团名称或区域查询时， MatchType=1时为左匹配模糊查询，现改为两端模糊查询
		if (StringUtils.isNotBlank(memberQryCdnValue.getQueryType())) {
			if ("GROUP_NAME".equals(memberQryCdnValue.getQueryType()) || "AREA_QRY_ID".equals(memberQryCdnValue.getQueryType())) {
				if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.RIGHT_MATCH) {
					memberQryCdnValue.setMatchType(2);
				}
			}
		}
		// gaozm end
		// 查询有效的记录
		condition.append(" 1 = 1 ");
		condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_MemberState).append(" = :memberState ");
		parameter.put("memberState", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_GroupState).append(" = :groupState ");
		parameter.put("groupState", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_UserState).append(" = :userState ");
		parameter.put("userState", CmConstants.RecordState.USE);

		// 集团编号
		if (memberQryCdnValue.getGroupId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_GroupId).append(" = :groupId ");
			parameter.put("groupId", Long.valueOf(memberQryCdnValue.getGroupId()));
		}
		// 集团客户编号
		if (memberQryCdnValue.getGroupCustId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_GroupCustId).append(" = :groupCustId ");
			parameter.put("groupCustId", Long.valueOf(memberQryCdnValue.getGroupCustId()));
		}
		// （成员）个人客户编号
		if (memberQryCdnValue.getIndivCustId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_IndivCustId).append(" = :indivCustId ");
			parameter.put("indivCustId", Long.valueOf(memberQryCdnValue.getIndivCustId()));
		}
		// 集团客户名称
		if (StringUtils.isNotBlank(memberQryCdnValue.getGroupName())) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_CustName);
			// 模糊查询(两端匹配)
			if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.BOTH_MATCH) {
				condition.append(" LIKE :groupName  ");
				parameter.put("groupName", "%" + memberQryCdnValue.getGroupName().trim() + "%");
			}
			// 模糊匹配（左端匹配）
			else if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.RIGHT_MATCH) {
				condition.append(" LIKE :groupName  ");
				parameter.put("groupName", memberQryCdnValue.getGroupName().trim() + "%");
			}
			// 默认为精确匹配
			else {
				condition.append(" = :groupName  ");
				parameter.put("groupName", memberQryCdnValue.getGroupName().trim());
			}
		}
		// 集团归属地市
		if (StringUtils.isNotBlank(memberQryCdnValue.getCityId())) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_ChnlCityId).append(" = :cityId ");
			parameter.put("cityId", memberQryCdnValue.getCityId());
		}
		// 县市
		if (StringUtils.isNotBlank(memberQryCdnValue.getCountyId())) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_ChnlRegionType).append(" = :countyId ");
			parameter.put("countyId", memberQryCdnValue.getCountyId());
		}
		// 片区
		if (StringUtils.isNotBlank(memberQryCdnValue.getAreaId())) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_ChnlRegionDetail).append(" = :areaId ");
			parameter.put("areaId", memberQryCdnValue.getAreaId());
		}
		// 客户经理
		if (memberQryCdnValue.getManagerId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_GroupCustId).append(
					" IN (SELECT F.GROUP_CUST_ID FROM CM_GROUP_CUST_MGR_REL F WHERE F.STATE = 'U' AND F.MGR_ID = :managerId )");
			parameter.put("managerId", Long.valueOf(memberQryCdnValue.getManagerId()));
		}
		// 集团状态
		if (memberQryCdnValue.getGroupStatus() >= 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_GroupStatus).append(" = :groupStatus  ");
			parameter.put("groupStatus", Integer.valueOf(memberQryCdnValue.getGroupStatus()));
		}
		// 集团等级
		if (memberQryCdnValue.getGroupLevel() >= 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_CustLevel).append(" = :groupLevel  ");
			parameter.put("groupLevel", Integer.valueOf(memberQryCdnValue.getGroupLevel()));
		}
		// 成员类别
		if (memberQryCdnValue.getMemberLevel() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" = :memberLevel  ");
			parameter.put("memberLevel", Integer.valueOf(memberQryCdnValue.getMemberLevel()));
		}
		// 成员分类
		if (memberQryCdnValue.getMemberType() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_MemberType).append(" = :memberType  ");
			parameter.put("memberType", Integer.valueOf(memberQryCdnValue.getMemberType()));
		}
		// 是否关键人物
		/*
		 * if (memberQryCdnValue.getIsKeyMember() == 0) { condition.append(" AND (
		 * ").append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" = :normalMemberLevel OR
		 * ").append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append( " IS NULL "); condition.append(")");
		 * parameter.put("normalMemberLevel", Integer.valueOf(CmConstants.GroupMemberLevel.NORMAL_MEMBER)); } else if
		 * (memberQryCdnValue.getIsKeyMember() == 1) { condition.append(" AND
		 * ").append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" NOT IN ( :normalMemberLevel ,
		 * :codeMemberLevel )"); parameter.put("normalMemberLevel",
		 * Integer.valueOf(CmConstants.GroupMemberLevel.NORMAL_MEMBER)); parameter.put("codeMemberLevel",
		 * Integer.valueOf(CmConstants.GroupMemberLevel.CORE_MEMBER)); } // 是否联系人 if (memberQryCdnValue.getIsContact() ==
		 * 1) { condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" = :contactLevel
		 * "); parameter.put("contactLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CONTACT_MEMBER)); } if
		 * (memberQryCdnValue.getIsContact() == 0) { condition.append(" AND ( ");
		 * condition.append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" <> :contactLevel OR
		 * ").append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" IS NULL "); condition.append(" ) ");
		 * parameter.put("contactLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CONTACT_MEMBER)); }
		 */
		// 是否VIP
		if (memberQryCdnValue.getIsVip() == 1) {
			condition.append(" AND ( ");
			condition.append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" =:vipLevel1 ");
			condition.append(" OR ").append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" =:vipLevel2 ");
			condition.append(" OR ").append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" =:vipLevel3 ");
			condition.append(" ) ");
			parameter.put("vipLevel1", Integer.valueOf(CmConstants.CmIndivVipLevel.DIAMOND_LEVEL));
			parameter.put("vipLevel2", Integer.valueOf(CmConstants.CmIndivVipLevel.GOLDEN_LEVEL));
			parameter.put("vipLevel3", Integer.valueOf(CmConstants.CmIndivVipLevel.SILVER_LEVEL));
		} else if (memberQryCdnValue.getIsVip() == 0) {
			condition.append(" AND ( ");
			condition.append(" ( ");
			condition.append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" <>:vipLevel1 ");
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" <>:vipLevel2 ");
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" <>:vipLevel3 ");
			condition.append(" ) ");
			condition.append(" OR ( ");
			condition.append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" IS NULL ");
			condition.append(" ) ");
			condition.append(" ) ");
			parameter.put("vipLevel1", Integer.valueOf(CmConstants.CmIndivVipLevel.DIAMOND_LEVEL));
			parameter.put("vipLevel2", Integer.valueOf(CmConstants.CmIndivVipLevel.GOLDEN_LEVEL));
			parameter.put("vipLevel3", Integer.valueOf(CmConstants.CmIndivVipLevel.SILVER_LEVEL));
		}
		// 是否核心成员:member_level = 3 影响力人物/中层领导
		/*
		 * if (memberQryCdnValue.getIsKernelMember() == 1) { condition.append(" AND
		 * ").append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" = :coreMemberLevel ");
		 * parameter.put("coreMemberLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CORE_MEMBER)); } if
		 * (memberQryCdnValue.getIsKernelMember() == 0) { condition.append(" AND ( ");
		 * condition.append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" <> :coreMemberLevel OR
		 * ").append(IQBOCmGroupCustMemberUserValue.S_MemberLevel).append(" IS NULL "); condition.append(" ) ");
		 * parameter.put("coreMemberLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CORE_MEMBER)); }
		 */
		// 是否中高端价值客户:vip_level = 0
		if (memberQryCdnValue.getIsHighValue() == 1) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" = :highValueLevel  ");
			parameter.put("highValueLevel", Integer.valueOf(CmConstants.CmIndivVipLevel.NO_LEVEL));
		}
		if (memberQryCdnValue.getIsHighValue() == 0) {
			condition.append(" AND ( ");
			condition.append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" <> :highValueLevel  OR ").append(IQBOCmGroupCustMemberUserValue.S_VipLevel).append(" IS NULL ");
			condition.append(" ) ");
			parameter.put("highValueLevel", Integer.valueOf(CmConstants.CmIndivVipLevel.NO_LEVEL));
		}
		// 工作部门
		if (StringUtils.isNotBlank(memberQryCdnValue.getWorkDept())) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_WorkDept).append(" = :workDept ");
			parameter.put("workDept", memberQryCdnValue.getWorkDept().trim());
		}
		// 创建起止日期
		if (memberQryCdnValue.getStartDate() != null && memberQryCdnValue.getEndDate() != null) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_CreateDate).append(" BETWEEN  :startDate AND :endDate ");
			parameter.put("startDate", memberQryCdnValue.getStartDate());
			parameter.put("endDate", memberQryCdnValue.getEndDate());
		}
		// 成员加入起止日期
		/*
		 * if (memberQryCdnValue.getStartDate1() != null && memberQryCdnValue.getEndDate1() != null) {
		 * condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_CreateDate).append(" BETWEEN :startDate1
		 * AND :endDate1 "); parameter.put("startDate1", memberQryCdnValue.getStartDate1()); parameter.put("endDate1",
		 * memberQryCdnValue.getEndDate1()); }
		 */
		// 手机号码
		if (StringUtils.isNotBlank(memberQryCdnValue.getBillId())) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_BillId).append(" = :billId ");
			parameter.put("billId", memberQryCdnValue.getBillId().trim());
		}
		// 成员名称
		if (StringUtils.isNotBlank(memberQryCdnValue.getMemberName())) {
			// 两端模糊匹配
			if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.BOTH_MATCH) {
				condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_MemberName).append(" LIKE :memberName ");
				parameter.put("memberName", "%" + memberQryCdnValue.getMemberName().trim() + "%");
			}
			// 左端模糊匹配
			else if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.RIGHT_MATCH) {
				condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_MemberName).append(" LIKE :memberName ");
				parameter.put("memberName", memberQryCdnValue.getMemberName().trim() + "%");
			}
			// 精确匹配
			else {
				condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_MemberName).append(" = :memberName ");
				parameter.put("memberName", memberQryCdnValue.getMemberName().trim());
			}
		}
		// 如果是集团其他成员时需要判断集团（其他）成员类型是否非负，是的话需要把这个限制条件拼接在查询条件上
		/*
		 * if (memberQryCdnValue.getMemberType() == CmConstants.GroupMember.TYPE_EXT_MEMBER &&
		 * memberQryCdnValue.getMemberAppType() >= 0) { condition.append(" AND
		 * ").append(IQBOCmGroupCustMemberUserValue.S_MemberAppType).append(" = :memberAppType ");
		 * parameter.put("memberAppType", Integer.valueOf(memberQryCdnValue.getMemberAppType())); }
		 */
		// 集团成员编号
		if (memberQryCdnValue.getCustRelId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_CustRelId).append(" = :custRelId ");
			parameter.put("custRelId", Long.valueOf(memberQryCdnValue.getCustRelId()));
		}
		// 集团成员编号
		if (memberQryCdnValue.getMemberId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_CustRelId).append(" = :custRelId ");
			parameter.put("custRelId", Long.valueOf(memberQryCdnValue.getMemberId()));
		}
		// 订购标识号
		if (memberQryCdnValue.getSubId() > 0) {
			// 该查询条件暂不需要实现
		}
		// 用户状态
		if (memberQryCdnValue.getUserStatus() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_UserStatus).append(" = :userStatus ");
			parameter.put("userStatus", Integer.valueOf(memberQryCdnValue.getUserStatus()));
		}
		// 集团成员编号
		if (memberQryCdnValue.getMemUserId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_MemUserId).append(" = :memUserId ");
			parameter.put("memUserId", Long.valueOf(memberQryCdnValue.getMemUserId()));
		}
		// 用户编号 add by huzq2 at 2011-8-12
		if (memberQryCdnValue.getUserId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_UserId).append(" = :userId ");
			parameter.put("userId", Long.valueOf(memberQryCdnValue.getUserId()));
		}
	}

	/**
	 * @Function: buildQryKeyMemberCdnAndParam
	 * @Description: 构造集团关键人物的查询条件
	 * 
	 * @param memberQryCdnValue
	 *            查询条件对象【入参】
	 * @param condition
	 *            查询条件【出参】
	 * @param parameter
	 *            查询参数【出参】
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 28, 2011 2:16:36 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* May 28, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	private void buildQryQKeyMemberUserCdnAndParam(IQBOCmGroupMemberQryCdnValue memberQryCdnValue, StringBuilder condition, Map parameter) throws Exception, RemoteException {
		// 查询条件IValue不能为空
		if (memberQryCdnValue == null || condition == null || parameter == null) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0403001"));
			}
			ExceptionUtil.throwBusinessException("CMS0403001");
		}
		// 查询有效的记录
		condition.append(" 1 = 1 ");
		condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_MemberState).append(" = :memberState ");
		parameter.put("memberState", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_GroupState).append(" = :groupState ");
		parameter.put("groupState", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_UserState).append(" = :userState ");
		parameter.put("userState", CmConstants.RecordState.USE);

		// 集团编号
		if (memberQryCdnValue.getGroupId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_GroupId).append(" = :groupId ");
			parameter.put("groupId", Long.valueOf(memberQryCdnValue.getGroupId()));
		}
		// 集团客户编号
		if (memberQryCdnValue.getGroupCustId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_GroupCustId).append(" = :groupCustId ");
			parameter.put("groupCustId", Long.valueOf(memberQryCdnValue.getGroupCustId()));
		}
		// （成员）个人客户编号
		if (memberQryCdnValue.getIndivCustId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_IndivCustId).append(" = :indivCustId ");
			parameter.put("indivCustId", Long.valueOf(memberQryCdnValue.getIndivCustId()));
		}
		// 集团客户名称
		if (StringUtils.isNotBlank(memberQryCdnValue.getGroupName())) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_CustName);
			// 模糊查询
			if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.BOTH_MATCH) {
				condition.append(" LIKE :groupName  ");
				parameter.put("groupName", "%" + memberQryCdnValue.getGroupName().trim() + "%");
			} else if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.RIGHT_MATCH) {
				condition.append(" LIKE :groupName  ");
				parameter.put("groupName", memberQryCdnValue.getGroupName().trim() + "%");
			} else {
				condition.append(" = :groupName  ");
				parameter.put("groupName", memberQryCdnValue.getGroupName().trim());
			}
		}
		// 集团归属地市
		if (StringUtils.isNotBlank(memberQryCdnValue.getCityId())) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_ChnlCityId).append(" = :cityId ");
			parameter.put("cityId", memberQryCdnValue.getCityId());
		}
		// 县市
		if (StringUtils.isNotBlank(memberQryCdnValue.getCountyId())) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_ChnlRegionType).append(" = :countyId ");
			parameter.put("countyId", memberQryCdnValue.getCountyId());
		}
		// 片区
		if (StringUtils.isNotBlank(memberQryCdnValue.getAreaId())) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_ChnlRegionDetail).append(" = :areaId ");
			parameter.put("areaId", memberQryCdnValue.getAreaId());
		}
		// 客户经理
		if (memberQryCdnValue.getManagerId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustMemberUserValue.S_GroupCustId).append(
					" IN (SELECT F.GROUP_CUST_ID FROM CM_GROUP_CUST_MGR_REL F WHERE F.STATE = 'U' AND F.MGR_ID = :managerId )");
			parameter.put("managerId", Long.valueOf(memberQryCdnValue.getManagerId()));
		}
		// 集团状态
		if (memberQryCdnValue.getGroupStatus() >= 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_GroupStatus).append(" = :groupStatus  ");
			parameter.put("groupStatus", Integer.valueOf(memberQryCdnValue.getGroupStatus()));
		}
		// 集团等级
		if (memberQryCdnValue.getGroupLevel() >= 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_CustLevel).append(" = :groupLevel  ");
			parameter.put("groupLevel", Integer.valueOf(memberQryCdnValue.getGroupLevel()));
		}
		// 成员类别
		if (memberQryCdnValue.getMemberLevel() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_MemberLevel).append(" = :memberLevel  ");
			parameter.put("memberLevel", Integer.valueOf(memberQryCdnValue.getMemberLevel()));
		}
		// 成员分类
		if (memberQryCdnValue.getMemberType() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_MemberType).append(" = :memberType  ");
			parameter.put("memberType", Integer.valueOf(memberQryCdnValue.getMemberType()));
		}
		// 是否关键人物
		/*
		 * if (memberQryCdnValue.getIsKeyMember() == 0) { condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_MemberLevel).append(" = :normalMemberLevel ");
		 * parameter.put("normalMemberLevel", Integer.valueOf(CmConstants.GroupMemberLevel.NORMAL_MEMBER)); } else if
		 * (memberQryCdnValue.getIsKeyMember() == 1) { condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_MemberLevel).append(" <> :normalMemberLevel ");
		 * parameter.put("normalMemberLevel", Integer.valueOf(CmConstants.GroupMemberLevel.NORMAL_MEMBER)); }
		 */
		// 是否联系人
		/*
		 * if (memberQryCdnValue.getIsContact() == 1) { condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_MemberLevel).append(" = :contactLevel ");
		 * parameter.put("contactLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CONTACT_MEMBER)); } if
		 * (memberQryCdnValue.getIsContact() == 0) { condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_MemberLevel).append(" <> :contactLevel ");
		 * parameter.put("contactLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CONTACT_MEMBER)); }
		 */
		// 关键人物类型
		if (memberQryCdnValue.getKernelType() >= 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_KernelType).append(" = :kernelType  ");
			parameter.put("kernelType", Integer.valueOf(memberQryCdnValue.getKernelType()));
		}
		// 是否VIP
		if (memberQryCdnValue.getIsVip() == 1) {
			condition.append(" AND ( ");
			condition.append(IQBOCmGroupKeyMemberUserValue.S_VipLevel).append(" =:vipLevel1 ");
			condition.append(" OR ").append(IQBOCmGroupKeyMemberUserValue.S_VipLevel).append(" =:vipLevel2 ");
			condition.append(" OR ").append(IQBOCmGroupKeyMemberUserValue.S_VipLevel).append(" =:vipLevel3 ");
			condition.append(" ) ");
			parameter.put("vipLevel1", Integer.valueOf(CmConstants.CmIndivVipLevel.DIAMOND_LEVEL));
			parameter.put("vipLevel2", Integer.valueOf(CmConstants.CmIndivVipLevel.GOLDEN_LEVEL));
			parameter.put("vipLevel3", Integer.valueOf(CmConstants.CmIndivVipLevel.SILVER_LEVEL));
		} else if (memberQryCdnValue.getIsVip() == 0) {
			condition.append(" AND ( ");
			condition.append(IQBOCmGroupKeyMemberUserValue.S_VipLevel).append(" <>:vipLevel1 ");
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_VipLevel).append(" <>:vipLevel2 ");
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_VipLevel).append(" <>:vipLevel3 ");
			condition.append(" ) ");
			parameter.put("vipLevel1", Integer.valueOf(CmConstants.CmIndivVipLevel.DIAMOND_LEVEL));
			parameter.put("vipLevel2", Integer.valueOf(CmConstants.CmIndivVipLevel.GOLDEN_LEVEL));
			parameter.put("vipLevel3", Integer.valueOf(CmConstants.CmIndivVipLevel.SILVER_LEVEL));
		}
		// 是否核心成员:member_level = 3 影响力人物/中层领导
		/*
		 * if (memberQryCdnValue.getIsKernelMember() == 1) { condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_MemberLevel).append(" = :coreMemberLevel ");
		 * parameter.put("coreMemberLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CORE_MEMBER)); } if
		 * (memberQryCdnValue.getIsKernelMember() == 0) { condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_MemberLevel).append(" <> :coreMemberLevel ");
		 * parameter.put("coreMemberLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CORE_MEMBER)); }
		 */
		// 是否中高端价值客户:vip_level = 0
		if (memberQryCdnValue.getIsHighValue() == 1) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_VipLevel).append(" = :highValueLevel  ");
			parameter.put("highValueLevel", Integer.valueOf(CmConstants.CmIndivVipLevel.NO_LEVEL));
		}
		if (memberQryCdnValue.getIsHighValue() == 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_VipLevel).append(" <> :highValueLevel  ");
			parameter.put("highValueLevel", Integer.valueOf(CmConstants.CmIndivVipLevel.NO_LEVEL));
		}
		// 工作部门
		if (StringUtils.isNotBlank(memberQryCdnValue.getWorkDept())) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_WorkDept).append(" = :workDept ");
			parameter.put("workDept", memberQryCdnValue.getWorkDept().trim());
		}
		// 创建起止日期
		if (memberQryCdnValue.getStartDate() != null && memberQryCdnValue.getEndDate() != null) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_CreateDate).append(" BETWEEN  :startDate AND :endDate ");
			parameter.put("startDate", memberQryCdnValue.getStartDate());
			parameter.put("endDate", memberQryCdnValue.getEndDate());
		}
		// 手机号码
		if (StringUtils.isNotBlank(memberQryCdnValue.getBillId())) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_BillId).append(" = :billId ");
			parameter.put("billId", memberQryCdnValue.getBillId().trim());
		}
		// 成员名称
		if (StringUtils.isNotBlank(memberQryCdnValue.getMemberName())) {
			if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.BOTH_MATCH) {
				condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_MemberName).append(" LIKE :memberName ");
				parameter.put("memberName", "%" + memberQryCdnValue.getMemberName().trim() + "%");
			} else if (memberQryCdnValue.getMatchType() == CmConstants.MatchType.RIGHT_MATCH) {
				condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_MemberName).append(" LIKE :memberName ");
				parameter.put("memberName", memberQryCdnValue.getMemberName().trim() + "%");
			} else {
				condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_MemberName).append(" = :memberName ");
				parameter.put("memberName", memberQryCdnValue.getMemberName().trim());
			}
		}
		// 订购标识号
		if (memberQryCdnValue.getSubId() > 0) {
			// 该查询条件暂不需要实现
		}
		// 用户状态
		if (memberQryCdnValue.getUserStatus() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_UserStatus).append(" = :userStatus ");
			parameter.put("userStatus", Integer.valueOf(memberQryCdnValue.getUserStatus()));
		}
		// 成员编号
		if (memberQryCdnValue.getMemberId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_KernelId).append(" = :kernelId ");
			parameter.put("kernelId", Long.valueOf(memberQryCdnValue.getMemberId()));
		}
		// 成员用户编号
		if (memberQryCdnValue.getMemUserId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_MemUserId).append(" = :memUserId ");
			parameter.put("memUserId", Long.valueOf(memberQryCdnValue.getMemUserId()));
		}
		// 用户编号 add by huzq2 at 2011-8-12
		if (memberQryCdnValue.getUserId() > 0) {
			condition.append(" AND ").append(IQBOCmGroupKeyMemberUserValue.S_UserId).append(" = :userId ");
			parameter.put("userId", Long.valueOf(memberQryCdnValue.getUserId()));
		}
	}

	private ICmGroupMemberDAO getGroupCustMemberDAO() {
		return (ICmGroupMemberDAO) ServiceFactory.getService(ICmGroupMemberDAO.class);
	}

	/**
	 * 当集团关键人物信息发生变更时同步修改集团客户成员信息
	 * 
	 * @Function: syncGroupCustMemberUsers
	 * 
	 * @param groupKeyMemberUserValues
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 31, 2011 11:36:50 AM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* May 31, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	private void syncGroupCustMemberUsers(IQBOCmGroupKeyMemberUserValue[] groupKeyMemberUserValues) throws Exception, RemoteException {
		/*
		 * if (CmCommonUtil.isNotEmptyObject(groupKeyMemberUserValues)) { ICmGroupMemberDAO memberDAO =
		 * getGroupCustMemberDAO(); List memberList = new ArrayList(); List memUserList = new ArrayList();
		 * IBOCmGroupCustMemberValue tempMemberValue = null; IBOCmGroupCustMemUserValue tempMemUserValue = null; for
		 * (int i = 0, length = groupKeyMemberUserValues.length; i < length; i++) { if
		 * (groupKeyMemberUserValues[i].getIndivCustId() > 0) { Map parameter = new HashMap(); 根据集团客户编号和成员客户编号查询关键人物列表
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
		 * Long.valueOf(groupKeyMemberUserValues[i].getGroupCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_IndivCustId,
		 * Long.valueOf(groupKeyMemberUserValues[i].getIndivCustId())); IQBOCmGroupCustMemberUserValue[]
		 * custMemberUserValues =
		 * this.queryQGroupCustMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1);
		 * 如果是删除关键人物信息，则需要同步修改集团网内成员的成员级别 if (groupKeyMemberUserValues[i].isDeleted()) { if
		 * (CmCommonUtil.isNotEmptyObject(custMemberUserValues)) { for (int j = 0; j < custMemberUserValues.length; j++) {
		 * 只需要修改号码不为空并且与参数中的号码相等的网内成员用户。 if (StringUtils.isNotBlank(custMemberUserValues[j].getBillId()) &&
		 * custMemberUserValues[j].getBillId().equals(groupKeyMemberUserValues[i].getBillId()) &&
		 * custMemberUserValues[j].getMemberType() == CmConstants.GroupMember.TYPE_INNER_MEMBER) { tempMemUserValue =
		 * new BOCmGroupCustMemUserBean(); tempMemUserValue.copy(custMemberUserValues[j]);
		 * tempMemUserValue.setMemberLevel(CmConstants.GroupMemberLevel.NORMAL_MEMBER);
		 * memUserList.add(tempMemUserValue); } } } } 否则修改成员信息. else { if
		 * (CmCommonUtil.isNotEmptyObject(custMemberUserValues)) { String[] MemberPropertyNames = new
		 * BOCmGroupCustMemberBean().getPropertyNames(); String[] MemUserPropertyNames = new
		 * BOCmGroupCustMemUserBean().getPropertyNames(); for (int j = 0; j < custMemberUserValues.length; j++) { //
		 * tempMemberValue = new BOCmGroupCustMemberBean(); tempMemberValue.copy(custMemberUserValues[j]); for (int k =
		 * 0; k < MemberPropertyNames.length; k++) { 只修改被标识为修改的字段 if
		 * (groupKeyMemberUserValues[i].isPropertyModified(MemberPropertyNames[k])) {
		 * tempMemberValue.set(MemberPropertyNames[k],
		 * DataType.transfer(groupKeyMemberUserValues[i].get(MemberPropertyNames[k]), tempMemberValue
		 * .getPropertyType(MemberPropertyNames[k]))); } }
		 * tempMemberValue.initProperty(IBOCmGroupCustMemberValue.S_CustRelId,
		 * Long.valueOf(tempMemberValue.getCustRelId())); memberList.add(tempMemberValue);
		 * 对于成员关联的用户，只修改当前参数中传入的手机号码对应的网内成员 if (StringUtils.isNotBlank(groupKeyMemberUserValues[i].getBillId()) &&
		 * groupKeyMemberUserValues[i].getBillId().equals(custMemberUserValues[j].getBillId()) &&
		 * custMemberUserValues[j].getMemberType() == CmConstants.GroupMember.TYPE_INNER_MEMBER) { tempMemUserValue =
		 * new BOCmGroupCustMemUserBean(); tempMemUserValue.copy(custMemberUserValues[j]); for (int k = 0; k <
		 * MemUserPropertyNames.length; k++) { 只修改被标识为修改的字段 if
		 * (groupKeyMemberUserValues[i].isPropertyModified(MemUserPropertyNames[k])) {
		 * tempMemUserValue.set(MemUserPropertyNames[k],
		 * DataType.transfer(groupKeyMemberUserValues[i].get(MemUserPropertyNames[k]), tempMemUserValue
		 * .getPropertyType(MemUserPropertyNames[k]))); } }
		 * tempMemUserValue.initProperty(IBOCmGroupCustMemUserValue.S_MemUserId,
		 * Long.valueOf(tempMemUserValue.getMemUserId())); memUserList.add(tempMemUserValue); } } } } } } //
		 * 保存对集团成员的信息修改 if (CmCommonUtil.isNotEmptyObject(memberList)) {
		 * memberDAO.saveGroupCustMembers((IBOCmGroupCustMemberValue[]) memberList.toArray(new
		 * IBOCmGroupCustMemberValue[0])); } // 保存对集团成员关联用户的修改 if (CmCommonUtil.isNotEmptyObject(memUserList)) {
		 * memberDAO.saveGroupCustMemUsers((IBOCmGroupCustMemUserValue[]) memUserList.toArray(new
		 * IBOCmGroupCustMemUserValue[0])); } }
		 */
	}

	/**
	 * 同步关键人物信息
	 * 
	 * @Function: synGroupKeyMemberUsers
	 * 
	 * @param groupCustMemberUserValues
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 31, 2011 10:22:33 AM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* May 31, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	private void syncGroupKeyMemberUsers(IQBOCmGroupCustMemberUserValue[] groupCustMemberUserValues) throws Exception, RemoteException {
		/*
		 * if (CmCommonUtil.isNotEmptyObject(groupCustMemberUserValues)) { IBOCmGroupKeyMemberValue tempMemberValue =
		 * null; IBOCmGroupKeyMemBillValue tempMemUserValue = null; ICmGroupMemberDAO memberDAO =
		 * getGroupCustMemberDAO(); ICmxGroupAccountSV ucm2Crm = (ICmxGroupAccountSV)
		 * ServiceFactory.getService(ICmxGroupAccountSV.class); 循环遍历所有的记录 for (int i = 0, length =
		 * groupCustMemberUserValues.length; i < length; i++) { List memberList = new ArrayList(); List memUserList =
		 * new ArrayList(); int state = 0; 只有添加网内成员时才需要同步关键人物信息. if (groupCustMemberUserValues[i].getMemberType() ==
		 * CmConstants.GroupMember.TYPE_INNER_MEMBER) {
		 * 使用查询条件集团客户编号和关联成员客户编号查询该集团下是否已经有了该客户对应的关键人物信息，如果存在，再遍历该成员客户是否已经关联
		 * 与传入的号码相同的用户，如果有则变更相关的信息，如果没有关联该用户则关联；否则新增关键人物。 Map parameter = new HashMap();
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
		 * Long.valueOf(groupCustMemberUserValues[i].getGroupCustId()));
		 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_IndivCustId,
		 * Long.valueOf(groupCustMemberUserValues[i].getIndivCustId())); IQBOCmGroupKeyMemberUserValue[]
		 * keyMemberUserValues =
		 * this.queryQGroupKeyMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1);
		 * 如果成员被删除或者成员类别由其他类别改变为普通成员或核心成员时，需要删除其对应的关键人物信息 if (groupCustMemberUserValues[i].isDeleted() ||
		 * groupCustMemberUserValues[i].getMemberLevel() == CmConstants.GroupMemberLevel.NORMAL_MEMBER ||
		 * groupCustMemberUserValues[i].getMemberLevel() == CmConstants.GroupMemberLevel.CORE_MEMBER ||
		 * groupCustMemberUserValues[i].getMemberLevel() <= 0) { if (CmCommonUtil.isNotEmptyObject(keyMemberUserValues)) {
		 * for (int j = 0; j < keyMemberUserValues.length; j++) { // 只有当两个号码一致时才删除 if
		 * (keyMemberUserValues[j].getBillId().equals(groupCustMemberUserValues[i].getBillId())) { tempMemUserValue =
		 * new BOCmGroupKeyMemBillBean(); tempMemUserValue.copy(keyMemberUserValues[j]); tempMemUserValue.setStsToOld();
		 * tempMemUserValue.setState(CmConstants.RecordState.ERASE); memUserList.add(tempMemUserValue);
		 * 如果该关键人物下面只关联了一个号码，则同时删除关键人物信息。 if (keyMemberUserValues.length == 1) { // 删除关键人物 tempMemberValue = new
		 * BOCmGroupKeyMemberBean(); tempMemberValue.copy(keyMemberUserValues[j]); tempMemberValue.setStsToOld();
		 * tempMemberValue.setState(CmConstants.RecordState.ERASE); memberList.add(tempMemberValue); } state=3; } } } } //
		 * 否则如果当前成员类别不为普通成员或者核心成员时视为新增或变更关键人物资料 else { String[] KeyMemberPropertyNames = new
		 * BOCmGroupKeyMemberBean().getPropertyNames(); String[] KeyMemUserPropertyNames = new
		 * BOCmGroupKeyMemBillBean().getPropertyNames(); 新增 if (!CmCommonUtil.isNotEmptyObject(keyMemberUserValues)) {
		 * tempMemberValue = new BOCmGroupKeyMemberBean(); tempMemUserValue = new BOCmGroupKeyMemBillBean();
		 * 将不为空的值复制到目标对象中 for (int k = 0; k < KeyMemberPropertyNames.length; k++) { if
		 * (groupCustMemberUserValues[i].get(KeyMemberPropertyNames[k]) != null) {
		 * tempMemberValue.set(KeyMemberPropertyNames[k],
		 * DataType.transfer(groupCustMemberUserValues[i].get(KeyMemberPropertyNames[k]), tempMemberValue
		 * .getPropertyType(KeyMemberPropertyNames[k]))); } } 将不为空的值复制到目标对象中 for (int k = 0; k <
		 * KeyMemUserPropertyNames.length; k++) { if (groupCustMemberUserValues[i].get(KeyMemUserPropertyNames[k]) !=
		 * null) { tempMemUserValue.set(KeyMemUserPropertyNames[k],
		 * DataType.transfer(groupCustMemberUserValues[i].get(KeyMemUserPropertyNames[k]), tempMemUserValue
		 * .getPropertyType(KeyMemUserPropertyNames[k]))); } } // 设置kernelType if (tempMemUserValue.getMemberLevel() ==
		 * CmConstants.GroupMemberLevel.CONTACT_MEMBER) { tempMemUserValue.setKernelType(GroupMemberKernelType.CONTACT); }
		 * else { tempMemUserValue.setKernelType(GroupMemberKernelType.KERNEL_MEMBER); } // 设置STATE
		 * tempMemberValue.setState(CmConstants.RecordState.USE);
		 * tempMemUserValue.setState(CmConstants.RecordState.USE); // 设置主外键的值
		 * tempMemberValue.setKernelId(memberDAO.getNewGroupKeyMemberId());
		 * tempMemUserValue.setMemUserId(memberDAO.getNewGroupKeyMemberUserId());
		 * tempMemUserValue.setKernelId(tempMemberValue.getKernelId()); // 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5 if
		 * (ServiceManager.getUser() != null) { tempMemberValue.setCreateOpId(ServiceManager.getUser().getID());
		 * tempMemberValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
		 * tempMemUserValue.setCreateOpId(ServiceManager.getUser().getID());
		 * tempMemUserValue.setCreateOrgId(ServiceManager.getUser().getOrgId()); } // 设置状态为新增
		 * tempMemberValue.setStsToNew(); tempMemUserValue.setStsToNew(); // 添加到需要保存的列表中
		 * memberList.add(tempMemberValue); memUserList.add(tempMemUserValue); state=1; } // 否则修改 else { // 是否有关联的用户
		 * boolean hasRelUser = false; for (int j = 0; j < keyMemberUserValues.length; j++) { //
		 * 如果找到了与参入的参数一致的手机号码时则修改用户信息，否则新关联用户信息. if ((StringUtils.isNotBlank(keyMemberUserValues[j].getBillId())) &&
		 * keyMemberUserValues[j].getBillId().equals(groupCustMemberUserValues[i].getBillId())) { tempMemUserValue = new
		 * BOCmGroupKeyMemBillBean(); tempMemUserValue.copy(keyMemberUserValues[j]); for (int k = 0; k <
		 * KeyMemUserPropertyNames.length; k++) { // 只修改有变化的值(非主键属性) if
		 * (groupCustMemberUserValues[i].isPropertyModified(KeyMemUserPropertyNames[k]) &&
		 * !KeyMemUserPropertyNames[k].equalsIgnoreCase(IBOCmGroupKeyMemBillValue.S_MemUserId)) {
		 * tempMemUserValue.set(KeyMemUserPropertyNames[k],
		 * DataType.transfer(groupCustMemberUserValues[i].get(KeyMemUserPropertyNames[k]), tempMemUserValue
		 * .getPropertyType(KeyMemUserPropertyNames[k]))); } }
		 * tempMemUserValue.initProperty(IBOCmGroupKeyMemBillValue.S_MemUserId,
		 * Long.valueOf(tempMemUserValue.getMemUserId())); memUserList.add(tempMemUserValue); hasRelUser = true; } //
		 * 将所有的设置为一样的，不管他是否是同一个kernel_id的关键人物。 tempMemberValue = new BOCmGroupKeyMemberBean();
		 * tempMemberValue.copy(keyMemberUserValues[0]);
		 * tempMemberValue.setMemberLevel(groupCustMemberUserValues[i].getMemberLevel()); // 逐个字段拷贝 for (int k = 0; k <
		 * KeyMemberPropertyNames.length; k++) { // 只修改有变化的值(非主键属性) if
		 * (groupCustMemberUserValues[i].isPropertyModified(KeyMemberPropertyNames[k]) &&
		 * !KeyMemberPropertyNames[k].equalsIgnoreCase(IBOCmGroupKeyMemberValue.S_KernelId)) {
		 * tempMemberValue.set(KeyMemberPropertyNames[k],
		 * DataType.transfer(groupCustMemberUserValues[i].get(KeyMemberPropertyNames[k]), tempMemberValue
		 * .getPropertyType(KeyMemberPropertyNames[k]))); } }
		 * tempMemberValue.initProperty(IBOCmGroupKeyMemberValue.S_KernelId,
		 * Long.valueOf(tempMemberValue.getKernelId())); memberList.add(tempMemberValue); } // 如果没有关联的用户信息，则重新关联 if
		 * (!hasRelUser) { tempMemUserValue = new BOCmGroupKeyMemBillBean(); 将不为空的值复制到目标对象中 for (int k = 0; k <
		 * KeyMemUserPropertyNames.length; k++) { if (groupCustMemberUserValues[i].get(KeyMemUserPropertyNames[k]) !=
		 * null) { tempMemUserValue.set(KeyMemUserPropertyNames[k],
		 * DataType.transfer(groupCustMemberUserValues[i].get(KeyMemUserPropertyNames[k]), tempMemUserValue
		 * .getPropertyType(KeyMemUserPropertyNames[k]))); } } // 设置kernelType if (tempMemUserValue.getMemberLevel() ==
		 * CmConstants.GroupMemberLevel.CONTACT_MEMBER) { tempMemUserValue.setKernelType(GroupMemberKernelType.CONTACT); }
		 * else { tempMemUserValue.setKernelType(GroupMemberKernelType.KERNEL_MEMBER); } // 设置STATE
		 * tempMemUserValue.setState(CmConstants.RecordState.USE); // 设置主外键的值
		 * tempMemUserValue.setMemUserId(memberDAO.getNewGroupKeyMemberUserId());
		 * 此处不管是否是同一个kernel_id，只管是同一个indiv_cust_id的关键人物随便关联在一个上即可。
		 * tempMemUserValue.setKernelId(keyMemberUserValues[0].getKernelId()); // 设置状态为新增
		 * tempMemUserValue.setStsToNew(); // 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5 if (ServiceManager.getUser() !=
		 * null) { tempMemUserValue.setCreateOpId(ServiceManager.getUser().getID());
		 * tempMemUserValue.setCreateOrgId(ServiceManager.getUser().getOrgId()); } // 添加到需要保存的列表中
		 * memUserList.add(tempMemUserValue); } state=3; } } // 保存关键人物的变更 if (CmCommonUtil.isNotEmptyObject(memberList)) {
		 * memberDAO.saveGroupKeyMembers((IBOCmGroupKeyMemberValue[]) memberList.toArray(new
		 * IBOCmGroupKeyMemberValue[0])); } if (CmCommonUtil.isNotEmptyObject(memUserList)) {
		 * memberDAO.saveGroupKeyMemBills((IBOCmGroupKeyMemBillValue[]) memUserList.toArray(new
		 * IBOCmGroupKeyMemBillValue[0])); }
		 * if(groupCustMemberUserValues[i].getMemberLevel()!=CmConstants.GroupMemberLevel.CONTACT_MEMBER &&
		 * !groupCustMemberUserValues[i].isPropertyModified(IQBOCmGroupKeyMemberUserValue.S_BillId) &&
		 * !groupCustMemberUserValues[i].isPropertyModified(IQBOCmGroupKeyMemberUserValue.S_MemberName)){ continue; }
		 * if(state == 1){
		 * ucm2Crm.unifyAmByGroupCustId(groupCustMemberUserValues[i].getGroupCustId(),CmConstants.IUcm2Crm.STATE_ADD);
		 * }else if(state == 2){
		 * ucm2Crm.unifyAmByGroupCustId(groupCustMemberUserValues[i].getGroupCustId(),CmConstants.IUcm2Crm.STATE_MODIFY);
		 * }else if(state == 3){
		 * ucm2Crm.unifyAmByGroupCustId(groupCustMemberUserValues[i].getGroupCustId(),CmConstants.IUcm2Crm.STATE_DEL); } } } }
		 */
	}

	/**
	 * 批量同步处理 memberType 成员类型 operate 操作类型 新增/修改
	 */
	/*
	 * public long saveGroupCustMembersBatch(List parseList, long groupCustId, int memberType, String regionId, int
	 * operate) throws Exception, RemoteException { long batchId = 0l; if (!CmCommonUtil.isNotEmptyObject(parseList)) {
	 * if (log.isErrorEnabled()) { // 传入的数据是空的！ log.error(CrmLocaleFactory.getResource("CMS0006005")); }
	 * ExceptionUtil.throwBusinessException("CMS0006005"); } if (parseList.size() >
	 * CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS) { if (log.isErrorEnabled()) { // 行数大于
	 * CmConstants.BatchOper.BATCH_NUMS 条 log.error(CrmLocaleFactory.getResource("CMS0400332",
	 * String.valueOf(CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS))); }
	 * ExceptionUtil.throwBusinessException("CMS0400332",
	 * String.valueOf(CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS)); } ICmBatchDataSV sv = (ICmBatchDataSV)
	 * ServiceFactory.getService(ICmBatchDataSV.class); IBOCmBatchDataValue value = new BOCmBatchDataBean();
	 * value.setTotalCount(parseList.size()); value.setRegionId(regionId); batchId = sv.saveBatchData(value);
	 * sv.saveBatchDataDetail(CmCommonUtil.parseListToValue(parseList, batchId, "")); // 批量导入集团成员信息
	 * CmServiceFactory.getBusiLogSV().log(null, CmBusinessOperation.GROUP_CUST_MEMBER_BATCH_IMPORT,
	 * CrmLocaleFactory.getResource("CMS0000517")); ICmBatchCommomSV commonSv = (ICmBatchCommomSV)
	 * ServiceFactory.getService(ICmBatchCommomSV.class); List detailList = commonSv.getBatchDataDetailToList(batchId);
	 * List errList = new ArrayList(); // 处理失败 List sucList = new ArrayList(); // 处理成功 List qMemberValuesList = new
	 * ArrayList(); String batchDetail = null; // 每行信息 String[] details = null;
	 * 已处理过的手机号码存放在这个Map中，每次取新的数据时先查询该Map中是否存在，存在的就不允许再添加了。 Map processedMap = new HashMap(); ICmGroupMemberQuerySV
	 * querySV = (ICmGroupMemberQuerySV) ServiceFactory.getService(ICmGroupMemberQuerySV.class); for (int i = 0; i <
	 * detailList.size(); i++) { batchDetail = detailList.get(i).toString(); details = batchDetail.split(","); String
	 * billId = details[0].trim(); // 先判断该号码是否是已经处理过的号码，如果是需要提示前台该号码出现了重复。 if (processedMap.containsKey(billId)) { if
	 * (log.isErrorEnabled()) { log.error(CrmLocaleFactory.getResource("CMS1006451", billId)); } // 存在重复的行
	 * errList.add((new
	 * StringBuffer()).append(batchDetail).append("|").append(CrmLocaleFactory.getResource("CMS1006451",
	 * processedMap.get(billId).toString())).toString()); continue; } 将处理掉的放在Map中 processedMap.put(billId, batchDetail); //
	 * 新增集团成员---------------------------------------------- if (1 == operate) { // 手机号码的验证 // if
	 * (!PhoneNumberValidator.isPhoneNumber(billId)) if (!PhoneNumberValidator.isPhoneNumber(billId) &&
	 * CmCommonUtil.getNumberType(billId) == 0) { // 手机号码错误 errList.add((new
	 * StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0406049")).toString());
	 * continue; } // 网内成员的验证 if (memberType == CmConstants.GroupMember.TYPE_INNER_MEMBER) { // 应为两列 if (details.length !=
	 * 2) { // 网内成员 行字段数为 2 errList.add((new
	 * StringBuffer()).append(batchDetail).append("|").append(CrmLocaleFactory.getResource("CMS0000433",
	 * CrmLocaleFactory.getResource("CMS0400286"))).toString()); continue; } // 成员类别 if (!details[1].matches("[123569]") &&
	 * !details[1].matches("^10$")) { // 成员类型错误 errList.add((new
	 * StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0400324")).toString());
	 * continue; } } // 网外成员的验证 else if (memberType == CmConstants.GroupMember.TYPE_OUT_MEMBER) { if (details.length !=
	 * 3) { // 网外成员 行字段数为3 errList.add((new
	 * StringBuffer()).append(batchDetail).append("|").append(CrmLocaleFactory.getResource("CMS0000433",
	 * CrmLocaleFactory.getResource("CMS0400289"))).toString()); continue; } // 性别 if (!details[2].matches("[123]")) { //
	 * 网外-- 性别 不为1 2 3提示错误 errList.add((new
	 * StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0400330")).toString());
	 * continue; } } // 其他成员的验证 else if (memberType == CmConstants.GroupMember.TYPE_EXT_MEMBER) { //
	 * 上传的文件格式是：手机号码、姓名、成员类别、性别， // 成员类别：0表示关联成员，1表示固话成员，2表示行业应用卡，3表示待梳理成员。 // 这是老系统的规则，但是现在的系统不是这样的。 // 扩展成员 行字段数为 4 if
	 * (details.length != 4) { errList.add((new
	 * StringBuffer()).append(batchDetail).append("|").append(CrmLocaleFactory.getResource("CMS0000433",
	 * CrmLocaleFactory.getResource("CMS0000432"))).toString()); continue; } // 其他成员类别 if
	 * (!details[2].matches("[0123]")) { // 网外-- 性别 不为1 2 3提示错误 errList.add((new
	 * StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0400324")).toString());
	 * continue; } // 性别 if (!details[3].matches("[123]")) { // 网外-- 性别 不为1 2 3提示错误 errList.add((new
	 * StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0400330")).toString());
	 * continue; } } try { IQBOCmGroupCustMemberValue qCustMember = querySV.checkGroupMemberForAdd(billId, groupCustId,
	 * memberType, 0); IQBOCmGroupCustMemberUserValue groupCustMemberUserValue = new QBOCmGroupCustMemberUserBean();
	 * groupCustMemberUserValue.copy(qCustMember); if (memberType == CmConstants.GroupMember.TYPE_OUT_MEMBER) { // 网外成员
	 * 设值 姓名 性别 groupCustMemberUserValue.setBillId(billId); groupCustMemberUserValue.setMemberName(details[1]);
	 * groupCustMemberUserValue.setGender(Integer.parseInt(details[2])); // 网外成员是没有塞集团客户编号的，需要手工塞值
	 * groupCustMemberUserValue.setGroupCustId(groupCustId); } else if (memberType ==
	 * CmConstants.GroupMember.TYPE_INNER_MEMBER) { // 网内成员 设值 成员类型 int memLevel = Integer.parseInt(details[1]);
	 * groupCustMemberUserValue.setMemberLevel(memLevel); } // 否则处理其他成员 else { // 扩展成员 设值 成员类型 int memLevel =
	 * Integer.parseInt(details[2]); groupCustMemberUserValue.setMemberName(details[1]);
	 * groupCustMemberUserValue.setMemberLevel(memLevel); groupCustMemberUserValue.setMemberAppType(memLevel);
	 * groupCustMemberUserValue.setGender(Integer.parseInt(details[3])); }
	 * groupCustMemberUserValue.setMemberType(memberType); groupCustMemberUserValue.setRegionId(regionId);
	 * groupCustMemberUserValue.setStsToNew(); // 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5 if (ServiceManager.getUser() !=
	 * null) { groupCustMemberUserValue.setCreateOpId(ServiceManager.getUser().getID());
	 * groupCustMemberUserValue.setCreateOrgId(ServiceManager.getUser().getOrgId()); } sucList.add(billId);
	 * qMemberValuesList.add(groupCustMemberUserValue); } catch (Exception e) { // 捕获异常 记录到失败记录 errList.add((new
	 * StringBuffer()).append(billId).append("|").append(e.getMessage())); continue; } } //
	 * 删除集团成员------------------------------------------------------------- else if (3 == operate) { if (details.length !=
	 * 1) { // 删除成员 行字段数为1 errList.add((new
	 * StringBuffer()).append(batchDetail).append("|").append(CrmLocaleFactory.getResource("CMS0000433",
	 * CrmLocaleFactory.getResource("CMS0400290"))).toString()); continue; } if
	 * (!PhoneNumberValidator.isPhoneNumber(billId) && CmCommonUtil.getNumberType(billId) == 0) { // 手机号码错误
	 * errList.add((new
	 * StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0406049")).toString());
	 * continue; } try { Map parameter = new HashMap(); parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
	 * Long.valueOf(groupCustId)); parameter.put(IQBOCmGroupMemberQryCdnValue.S_MemberType,
	 * Integer.valueOf(memberType)); parameter.put(IQBOCmGroupMemberQryCdnValue.S_BillId, billId);
	 * IQBOCmGroupCustMemberUserValue[] memberUserValues =
	 * this.queryQGroupCustMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1); if
	 * (!CmCommonUtil.isNotEmptyObject(memberUserValues)) { errList.add((new
	 * StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0400331")).toString());
	 * continue; } memberUserValues[0].delete(); sucList.add(billId); qMemberValuesList.add(memberUserValues[0]); }
	 * catch (BusinessException e) { // 捕获异常 记录到失败记录 errList.add((new
	 * StringBuffer()).append(billId).append("|").append(e.getMessage())); continue; } } } // Modified by huzq2
	 * 应该是在处理完成之后才统一一次性保存，不要每次处理一条保存一条。 if (sucList.size() > 0 && qMemberValuesList.size() > 0) {
	 * IQBOCmGroupCustMemberUserValue[] qGroupCustMemberValues = (IQBOCmGroupCustMemberUserValue[])
	 * qMemberValuesList.toArray(new IQBOCmGroupCustMemberUserValue[0]);
	 * this._saveQGroupCustMemberUsers(qGroupCustMemberValues); } commonSv.saveBatchDataResults(sucList, errList,
	 * batchId); // begin of 记录业务操作日志------------------------------- DataContainerInterface dc = new DataContainer();
	 * dc.set(IQBOCmGroupCustMemberUserValue.S_GroupCustId, Long.valueOf(groupCustId));
	 * dc.set(IQBOCmGroupCustMemberUserValue.S_GroupId,
	 * Long.valueOf(CmServiceFactory.getCommonSV().convertCustomerIdToGroupId(groupCustId))); //
	 * 批次号[{0}]的任务已经完成,成功{1}条,失败{2}条,每条文本行处理的具体情况,请通过批次号进行查询! CmServiceFactory.getBusiLogSV().log(dc, new
	 * CmBusiCodeDataBean(CmBusinessOperation.GROUP_CUST_MEMBER_BATCH_IMPORT), new
	 * StringBuilder().append(CrmLocaleFactory.getResource("CMS0009063", String.valueOf(batchId),
	 * String.valueOf(sucList.size()), String.valueOf(errList.size()))).toString(),
	 * CmGroupMemberBusiLogHelperImpl.class); // end of 记录业务操作日志 return batchId; }
	 */

	public void deleteGroupMembersByUserId(long userId) throws Exception, RemoteException {
		/*
		 * IInsUserValue userValue = ((ISo2CmSV) ServiceFactory.getService(ISo2CmSV.class)).getUserByUserId(userId); if
		 * (userValue != null) { Map parameter = new HashMap(); parameter.put(IQBOCmGroupMemberQryCdnValue.S_BillId,
		 * userValue.getBillId()); IQBOCmGroupMemberQryCdnValue cdnValue =
		 * CmGroupMemberUtil.createGroupMemberQryCdn(parameter); // 1、删除集团成员信息 IQBOCmGroupCustMemberUserValue[]
		 * memberUserValues = this.queryQGroupCustMemberUsersByCdn(cdnValue, -1, -1); for (int i = 0, length =
		 * (memberUserValues == null) ? 0 : memberUserValues.length; i < length; i++) { memberUserValues[i].delete(); }
		 * this.asyncSaveQGroupCustMemberUsers(memberUserValues); // 记录日志
		 * CmServiceFactory.getBusiLogSV().logs(memberUserValues, new
		 * CmBusiCodeDataBean(CmBusinessOperation.GROUP_CUST_MEMBER_DELETE), null,
		 * CmGroupMemberBusiLogHelperImpl.class); // 2、删除集团关键人物 IQBOCmGroupKeyMemberUserValue[] keyMemberUserValues =
		 * this.queryQGroupKeyMemberUsersByCdn(cdnValue, -1, -1); for (int i = 0, length = (keyMemberUserValues == null) ?
		 * 0 : keyMemberUserValues.length; i < length; i++) { keyMemberUserValues[i].delete(); }
		 * this.asyncSaveQGroupKeyMemberUsers(keyMemberUserValues); // 记录日志
		 * CmServiceFactory.getBusiLogSV().logs(keyMemberUserValues, new
		 * CmBusiCodeDataBean(CmBusinessOperation.GROUP_KEY_MEMBER_DELETE), null, CmGroupMemberBusiLogHelperImpl.class); }
		 */
	}

	/*
	 * public long transferGroupMembersBatch(List parseList, int memberType) throws Exception, RemoteException { if
	 * (!CmCommonUtil.isNotEmptyObject(parseList)) { if (log.isErrorEnabled()) { // 传入的数据是空的！
	 * log.error(CrmLocaleFactory.getResource("CMS0006005")); } ExceptionUtil.throwBusinessException("CMS0006005"); } //
	 * 批量业务的记录行限制 if (parseList.size() > CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS) { if (log.isErrorEnabled()) { //
	 * 行数大于 CmConstants.BatchOper.BATCH_NUMS 条 log.error(CrmLocaleFactory.getResource("CMS0400332",
	 * String.valueOf(CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS))); }
	 * ExceptionUtil.throwBusinessException("CMS0400332",
	 * String.valueOf(CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS)); } long batchId = 0l; ICmBatchDataSV sv =
	 * (ICmBatchDataSV) ServiceFactory.getService(ICmBatchDataSV.class); IBOCmBatchDataValue value = new
	 * BOCmBatchDataBean(); value.setTotalCount(parseList.size()); batchId = sv.saveBatchData(value);
	 * sv.saveBatchDataDetail(CmCommonUtil.parseListToValue(parseList, batchId, "")); // 集团成员转移
	 * CmServiceFactory.getBusiLogSV().log(null, CmBusinessOperation.GROUP_CUST_MEMBER_BATCH_TRANSFER,
	 * CrmLocaleFactory.getResource("CMS0400309")); ICmBatchCommomSV batchCommomSV = (ICmBatchCommomSV)
	 * ServiceFactory.getService(ICmBatchCommomSV.class); List detailList =
	 * batchCommomSV.getBatchDataDetailToList(batchId); List errList = new ArrayList(); // 处理失败 List sucList = new
	 * ArrayList(); // 处理成功 List destValuesList = new ArrayList(); String batchDetail = null; // 每行信息 String[] details =
	 * null; String billId = null; String destGroupId = null; // 目标集团编号 long destGroupCustId = 0L; // 目标集团客户编号 Map
	 * parameter = null; StringBuilder tempMsg = new StringBuilder();
	 * 已处理过的手机号码存放在这个Map中，每次取新的数据时先查询该Map中是否存在，存在的就不允许再添加了。 Map processedMap = new HashMap(); ICmCommonSV commonSV =
	 * CmServiceFactory.getCommonSV(); for (int i = 0; i < detailList.size(); i++) { // 清空tempMsg tempMsg.delete(0,
	 * tempMsg.length()); batchDetail = detailList.get(i).toString(); details = batchDetail.split(","); // if
	 * (details.length != 2) { errList.add(tempMsg.append(batchDetail.replace(",", ",
	 * ")).append("|").append(CrmLocaleFactory.getResource("CMS0000433",
	 * CrmLocaleFactory.getResource("CMS0000511"))).toString()); continue; } billId = details[0]; destGroupId =
	 * details[1]; // 先判断该号码是否是已经处理过的号码，如果是需要提示前台该号码出现了重复。 if (processedMap.containsKey(billId)) { if
	 * (log.isErrorEnabled()) { log.error(CrmLocaleFactory.getResource("CMS1006451", billId)); } // 存在重复的行
	 * errList.add(tempMsg.append(batchDetail.replace(",", ",
	 * ")).append("|").append(CrmLocaleFactory.getResource("CMS1006451",
	 * processedMap.get(billId).toString())).toString()); continue; } 将处理掉的放在Map中 processedMap.put(billId, batchDetail); //
	 * 手机号码的验证 if (!PhoneNumberValidator.isPhoneNumber(billId) && CmCommonUtil.getNumberType(billId) == 0) { // 手机号码错误
	 * errList.add(tempMsg.append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0406049")).toString());
	 * continue; } // 校验集团编号 if (StringUtils.isBlank(destGroupId)) { if (log.isErrorEnabled()) { // 集团编号不能为空
	 * log.error(CrmLocaleFactory.getResource("CMS0406047")); } errList.add(tempMsg.append(batchDetail.replace(",", ",
	 * ")).append("|").append(CrmLocaleFactory.getResource("CMS0406047")).toString()); continue; } else if
	 * (!CmCommonUtil.validateId(destGroupId)) { if (log.isErrorEnabled()) { // 集团编号不是纯数字
	 * log.error(CrmLocaleFactory.getResource("CMS0406046")); } errList.add(tempMsg.append(batchDetail.replace(",", ",
	 * ")).append("|").append(CrmLocaleFactory.getResource("CMS0406046")).toString()); continue; } // 判断目标集团是否存在 try {
	 * destGroupCustId = commonSV.convertGroupIdToCustomerId(Long.parseLong(destGroupId)); } catch (Exception e) {
	 * tempMsg.append(batchDetail.replace(",", ", ")).append("|").append(e.getMessage()); if (log.isErrorEnabled()) {
	 * log.error(tempMsg.toString(), e); } errList.add(tempMsg.toString()); continue; } // 查询集团成员信息 parameter = new
	 * HashMap(); parameter.put(IQBOCmGroupMemberQryCdnValue.S_BillId, billId);
	 * parameter.put(IQBOCmGroupMemberQryCdnValue.S_MemberType, Integer.valueOf(memberType));
	 * IQBOCmGroupCustMemberUserValue[] memberUserValues =
	 * queryQGroupCustMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1); if
	 * (!CmCommonUtil.isNotEmptyObject(memberUserValues)) { // 根据手机号码[{0}]查询不到对应的集团成员信息！
	 * errList.add(tempMsg.append(batchDetail.replace(",", ",
	 * ")).append("|").append(CrmLocaleFactory.getResource("CMS0707152", billId)).toString()); if (log.isErrorEnabled()) {
	 * log.error(tempMsg.toString()); } continue; } // 做成员的转移 for (int j = 0; j < memberUserValues.length; j++) {
	 * tempMsg.delete(0, tempMsg.length()); if (memberUserValues[j].getGroupCustId() != destGroupCustId) { //
	 * 如果是网内成员的转移，则需要判断目标集团中是否已经有对应的手机号码的集团关键人物， // 如果有则需要判断转入成员的级别是否与目标集团的关键人物的级别一致，如果不一致，则不允许转移。 if
	 * (memberUserValues[j].getMemberType() == CmConstants.GroupMember.TYPE_INNER_MEMBER) { parameter.clear();
	 * parameter.put(IQBOCmGroupKeyMemberUserValue.S_BillId, billId);
	 * parameter.put(IQBOCmGroupKeyMemberUserValue.S_GroupCustId, Long.valueOf(destGroupCustId));
	 * IQBOCmGroupKeyMemberUserValue[] tempKeyMemberUserValues =
	 * queryQGroupKeyMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1); if
	 * (CmCommonUtil.isNotEmptyObject(tempKeyMemberUserValues)) { // 目标集团存在手机号为{0}的关键人物,并且与当前成员的成员级别不一致！ if
	 * (tempKeyMemberUserValues[0].getMemberLevel() != memberUserValues[j].getMemberLevel()) {
	 * errList.add(tempMsg.append(batchDetail.replace(",", ",
	 * ")).append("|").append(CrmLocaleFactory.getResource("CMS0400305", billId)).toString()); continue; } } } //
	 * 删除原来的成员信息 memberUserValues[j].delete(); destValuesList.add(memberUserValues[j]); // 新增目标集团成员信息
	 * IQBOCmGroupCustMemberUserValue aMemberUserValue = new QBOCmGroupCustMemberUserBean();
	 * aMemberUserValue.copy(memberUserValues[j]); aMemberUserValue.setStsToNew();
	 * aMemberUserValue.setGroupCustId(destGroupCustId); aMemberUserValue.setGroupId(Long.parseLong(destGroupId)); //
	 * 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5 if (ServiceManager.getUser() != null) {
	 * aMemberUserValue.setCreateOpId(ServiceManager.getUser().getID());
	 * aMemberUserValue.setCreateOrgId(ServiceManager.getUser().getOrgId()); } destValuesList.add(aMemberUserValue);
	 * sucList.add(batchDetail.replace(",", ", ")); } else { // 原集团[{0}]与目标集团相同，不需要转移。 if (log.isErrorEnabled()) {
	 * log.error(CrmLocaleFactory.getResource("CMS0000512", destGroupId)); }
	 * errList.add(tempMsg.append(batchDetail.replace(",", ",
	 * ")).append("|").append(CrmLocaleFactory.getResource("CMS0000512", destGroupId)).toString()); continue; } } } if
	 * (sucList.size() > 0 && destValuesList.size() > 0) { IQBOCmGroupCustMemberUserValue[] qGroupCustMemberValues =
	 * (IQBOCmGroupCustMemberUserValue[]) destValuesList.toArray(new IQBOCmGroupCustMemberUserValue[0]);
	 * this._saveQGroupCustMemberUsers(qGroupCustMemberValues); } batchCommomSV.saveBatchDataResults(sucList, errList,
	 * batchId); // 批次号[{0}]的任务已经完成,成功{1}条,失败{2}条,每条文本行处理的具体情况,请通过批次号进行查询! CmServiceFactory.getBusiLogSV().log(null, new
	 * CmBusiCodeDataBean(CmBusinessOperation.GROUP_CUST_MEMBER_BATCH_TRANSFER), new
	 * StringBuilder().append(CrmLocaleFactory.getResource("CMS0009063", String.valueOf(batchId),
	 * String.valueOf(sucList.size()), String.valueOf(errList.size()))).toString(),
	 * CmGroupMemberBusiLogHelperImpl.class); return batchId; }
	 */

	public void transferGroupMembersByGroupCustId(long srcGroupCustId, long destGroupCustId) throws Exception, RemoteException {
		/*
		 * if (srcGroupCustId <= 0 || destGroupCustId <= 0) { if (log.isErrorEnabled()) { // 参数不符合要求
		 * log.error(CrmLocaleFactory.getResource("CMS0000360", "srcGroupCustId,destGroupCustId")); }
		 * ExceptionUtil.throwBusinessException("CMS0000360", "srcGroupCustId,destGroupCustId"); } List destList = new
		 * ArrayList(); Map parameter = new HashMap(); parameter.put(IQBOCmGroupMemberQryCdnValue.S_GroupCustId,
		 * Long.valueOf(srcGroupCustId)); IQBOCmGroupCustMemberUserValue[] memberUserValues =
		 * queryQGroupCustMemberUsersByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter), -1, -1); if
		 * (CmCommonUtil.isNotEmptyObject(memberUserValues)) { for (int i = 0; i < memberUserValues.length; i++) { //
		 * 在目标集团下新增 IQBOCmGroupCustMemberUserValue aValue = new QBOCmGroupCustMemberUserBean();
		 * aValue.copy(memberUserValues[i]); aValue.setGroupCustId(destGroupCustId); aValue.setStsToNew(); //
		 * 增加记录创建记录的操作员信息 added by huzq2 at 2011-8-5 if (ServiceManager.getUser() != null) {
		 * aValue.setCreateOpId(ServiceManager.getUser().getID());
		 * aValue.setCreateOrgId(ServiceManager.getUser().getOrgId()); } destList.add(aValue); // 删除原集团下的成员
		 * memberUserValues[i].delete(); destList.add(memberUserValues[i]); } if
		 * (CmCommonUtil.isNotEmptyObject(destList)) { IQBOCmGroupCustMemberUserValue[] qGroupCustMemberValues =
		 * (IQBOCmGroupCustMemberUserValue[]) destList.toArray(new IQBOCmGroupCustMemberUserValue[0]);
		 * this._saveQGroupCustMemberUsers(qGroupCustMemberValues); } } // 记录日志 ICmCommonSV commonSV =
		 * CmServiceFactory.getCommonSV(); long srcGroupId = commonSV.convertCustomerIdToGroupId(srcGroupCustId); long
		 * destGroupId = commonSV.convertCustomerIdToGroupId(destGroupCustId); CmServiceFactory.getBusiLogSV().log(null,
		 * new CmBusiCodeDataBean(CmBusinessOperation.GROUP_CUST_MEMBER_BATCH_TRANSFER), new
		 * StringBuilder().append(CrmLocaleFactory.getResource("CMS0000514", String.valueOf(srcGroupId),
		 * String.valueOf(destGroupId))).toString(), CmGroupMemberBusiLogHelperImpl.class);
		 */
	}

	public int queryGroupCustMemUserCount(String condition, Map parameter) throws Exception, RemoteException {
		return getGroupCustMemberDAO().queryGroupCustMemUserCount(condition, parameter);
	}

	public IBOCmGroupCustMemUserValue[] queryGroupCustMemUsers(String condition, Map parameter, int startNum, int endNum) throws Exception, RemoteException {
		return getGroupCustMemberDAO().queryGroupCustMemUsers(condition, parameter, startNum, endNum);
	}

	public int queryGroupKeyMemBillCount(String condition, Map parameter) throws Exception, RemoteException {
		return getGroupCustMemberDAO().queryGroupKeyMemBillCount(condition, parameter);
	}

	public IBOCmGroupKeyMemBillValue[] queryGroupKeyMemBills(String condition, Map parameter, int startNum, int endNum) throws Exception, RemoteException {
		return getGroupCustMemberDAO().queryGroupKeyMemBills(condition, parameter, startNum, endNum);
	}

	public IQBOCmGroupKeyMemberUserValue[] queryQGroupKeyMemberUsersByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue, int startNum, int endNum, boolean isLog)
			throws Exception, RemoteException {
		/*
		 * StringBuilder condition = new StringBuilder(); Map parameter = new HashMap(); // 构造查询条件
		 * buildQryQKeyMemberUserCdnAndParam(memberQryCdnValue, condition, parameter); if (isLog) { // 记录日志
		 * CmServiceFactory.getBusiLogSV().log(memberQryCdnValue, new
		 * CmBusiCodeDataBean(CmBusinessOperation.GROUP_KEY_MEMBER_QUERY), new
		 * StringBuilder().append("condition=").append(condition).append("parameter=").append(parameter.toString()).toString(),
		 * CmGroupMemberBusiLogHelperImpl.class); } // 查询 return
		 * getGroupCustMemberDAO().queryQGroupKeyMemberUsers(condition.toString(), parameter, startNum, endNum);
		 */
		return null;
	}

	public long saveGroupCustMembersBatch(List parseList, long groupCustId, int memberType, String regionId, int operate) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public long transferGroupMembersBatch(List parseList, int memberType) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryGroupCustMemUserCountByCustRelId(long memberId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public IBOCmGroupCustMemUserValue[] queryGroupCustMemUsersByCustRelId(long memberId, int startNum, int endNum) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public IBOCmGroupCustMemberValue[] queryGroupCustMembersByIndivCustId(long indivCustId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public int queryGroupKeyMemBillCountByKernelId(long kernelId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public IBOCmGroupKeyMemBillValue[] queryGroupKeyMemBillsByKernelId(long kernelId, int startNum, int endNum) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public int queryGroupKeyMemHobbyCountByKernelId(long kernelId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public IBOCmGroupKeyMemberValue queryGroupKeyMemberById(long kernelId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public int queryQGroupCustMemberUserCountByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryQGroupKeyMemberUserCount(String condition, Map parameter) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryQGroupKeyMemberUserCountByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public IQBOCmGroupKeyMemberUserValue[] queryQGroupKeyMemberUsers(String condition, Map parameter, int startNum, int endNum) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public IQBOCmGroupKeyMemberUserValue[] queryQGroupKeyMemberUsersByCdn(IQBOCmGroupMemberQryCdnValue memberQryCdnValue, int startNum, int endNum) throws Exception,
			RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveGroupKeyMemBills(IBOCmGroupKeyMemBillValue[] keyMemBillValues) throws Exception, RemoteException {
		// TODO Auto-generated method stub

	}

	// 集团成员信息查询
	public IBOCmGroupMemberValue[] queryGroupMemberValues(long custId, long grpCustId, int startNum, int endNum) throws Exception {
		DataContainer dc = new DataContainer();
		if (custId != -1) {
			dc.set(IBOCmGroupMemberValue.S_MemberCustId, custId);
		}
		if (grpCustId != -1) {
			dc.set(IBOCmGroupMemberValue.S_CustId, grpCustId);
		}
		return queryGroupMemberValues(dc, startNum, endNum);
	}

	public IBOCmGroupMemberValue[] queryGroupMemberValues(DataContainer dc, int startNum, int endNum) throws Exception {
		Parameter parameter = null;
		if (dc.get("MATCH_TYPE") != null) {
			String memeberName = DataType.getAsString(dc.get(IBOCmGroupMemberValue.S_MemberName));
			String firstName = DataType.getAsString(dc.get(IBOCmGroupMemberValue.S_FirstName));
			String middleName = DataType.getAsString(dc.get(IBOCmGroupMemberValue.S_MiddleName));
			String lastName = DataType.getAsString(dc.get(IBOCmGroupMemberValue.S_LastName));
			List likeSearch = new ArrayList();
			if (StringUtils.isNotBlank(memeberName)) {
				likeSearch.add(IBOCmGroupMemberValue.S_MemberName);
			}
			if (StringUtils.isNotBlank(firstName)) {
				likeSearch.add(IBOCmGroupMemberValue.S_FirstName);
			}
			if (StringUtils.isNotBlank(middleName)) {
				likeSearch.add(IBOCmGroupMemberValue.S_MiddleName);
			}
			if (StringUtils.isNotBlank(lastName)) {
				likeSearch.add(IBOCmGroupMemberValue.S_LastName);
			}
			if (likeSearch.isEmpty()) {
				parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupMemberBean.class);
			} else {
				parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupMemberBean.class, (String[]) likeSearch.toArray(new String[0]));
			}
		} else {
			parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupMemberBean.class);
		}

		DataContainerInterface[] dataConta = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupMemberBean.class, null, parameter.getCondition(), parameter.getParameter(),
				startNum, endNum, true);
		if (CmCommonUtil.isEmptyObject(dataConta)) {
			return new IBOCmGroupMemberValue[0];
		}
		IBOCmGroupMemberValue[] ibocMemberValues = new IBOCmGroupMemberValue[dataConta.length];
		for (int i = 0; i < ibocMemberValues.length; i++) {
			ibocMemberValues[i] = new BOCmGroupMemberBean();
			ibocMemberValues[i].copy(dataConta[i]);
		}
		return ibocMemberValues;
	}

	public static void main(String[] args) throws Exception {
		ICmGroupMemberSV f = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
		DataContainer da = new DataContainer();
		da.set("MATCH_TYPE", CmConstants.MatchType.RIGHT_MATCH);
		da.set(IBOCmGroupMemberValue.S_MemberName, "1");
		da.set(IBOCmGroupMemberValue.S_CustId, "23500000000421");
		f.queryGroupMemberValues(da, -1, -1);
	}

	public int getGroupMemberValuesCount(DataContainer dc) throws Exception {
		Parameter parameter = null;
		if (dc.get("MATCH_TYPE") != null) {
			String memeberName = DataType.getAsString(dc.get(IBOCmGroupMemberValue.S_MemberName));
			String firstName = DataType.getAsString(dc.get(IBOCmGroupMemberValue.S_FirstName));
			String middleName = DataType.getAsString(dc.get(IBOCmGroupMemberValue.S_MiddleName));
			String lastName = DataType.getAsString(dc.get(IBOCmGroupMemberValue.S_LastName));
			List likeSearch = new ArrayList();
			if (StringUtils.isNotBlank(memeberName)) {
				likeSearch.add(IBOCmGroupMemberValue.S_MemberName);
			}
			if (StringUtils.isNotBlank(firstName)) {
				likeSearch.add(IBOCmGroupMemberValue.S_FirstName);
			}
			if (StringUtils.isNotBlank(middleName)) {
				likeSearch.add(IBOCmGroupMemberValue.S_MiddleName);
			}
			if (StringUtils.isNotBlank(lastName)) {
				likeSearch.add(IBOCmGroupMemberValue.S_LastName);
			}
			if (likeSearch.isEmpty()) {
				parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupMemberBean.class);
			} else {
				parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupMemberBean.class, (String[]) likeSearch.toArray(new String[0]));
			}
		} else {
			parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupMemberBean.class);
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}
}
