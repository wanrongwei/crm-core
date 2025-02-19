package com.asiainfo.crm.cm.customer.group.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.ai.oneframe.msg.bo.BORemindBean;
import com.ai.oneframe.msg.ivalues.IBORemindValue;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmCalGroupSegmentDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmSegMgrGroupRelValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCalGroupSegmentSV;
import com.asiainfo.crm.cm.dk.common.CmGroupCalSegmentUtil;
import com.asiainfo.crm.cm.inner.common.dao.interfaces.ICmCommonInnerDAO;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;

public class CmCalGroupSegmentSVImpl implements ICmCalGroupSegmentSV {

	private static final Log log = LogFactory.getLog(CmCalGroupSegmentSVImpl.class);

	public DataContainer[] queryGroupDifferData(String tenantId, String regionId) throws Exception {
		ICmCalGroupSegmentDAO dao = (ICmCalGroupSegmentDAO) ServiceFactory.getService(ICmCalGroupSegmentDAO.class);
		return dao.queryGroupDifferData(tenantId, regionId);
	}

	public DataContainer[] queryNewGroupCustomerData(String tenantId, String regionId) throws Exception {
		ICmCalGroupSegmentDAO dao = (ICmCalGroupSegmentDAO) ServiceFactory.getService(ICmCalGroupSegmentDAO.class);
		return dao.queryNewGroupCustomerData(tenantId, regionId);
	}

	public void saveDifferData(BOCmGroupOrgDifferBean differBean) throws Exception {
		ICmCalGroupSegmentDAO dao = (ICmCalGroupSegmentDAO) ServiceFactory.getService(ICmCalGroupSegmentDAO.class);
		dao.saveDifferData(differBean);
	}

	public void saveGroupSegmentRela(long parentCustId, long segmentId, String tenantId) throws Exception {
		ICmCalGroupSegmentDAO dao = (ICmCalGroupSegmentDAO) ServiceFactory.getService(ICmCalGroupSegmentDAO.class);
		dao.saveGroupSegmentRela(parentCustId, segmentId, tenantId);
	}

	public DataContainer[] queryNewGroup(String tenantId) throws Exception {
		ICmCalGroupSegmentDAO dao = (ICmCalGroupSegmentDAO) ServiceFactory.getService(ICmCalGroupSegmentDAO.class);
		return dao.queryNewGroup(tenantId);
	}

	public DataContainer[] queryGroupAddStructData(String tenantId) throws Exception {
		ICmCalGroupSegmentDAO dao = (ICmCalGroupSegmentDAO) ServiceFactory.getService(ICmCalGroupSegmentDAO.class);
		return dao.queryGroupAddStructData(tenantId);
	}

	public DataContainer[] querySegmentByCustId(String tenantId, String custId) throws Exception {
		ICmCalGroupSegmentDAO dao = (ICmCalGroupSegmentDAO) ServiceFactory.getService(ICmCalGroupSegmentDAO.class);
		return dao.querySegmentByCustId(tenantId, custId);
	}

	@Override
	public long queryGroupDifferDataByCustId(long custId) throws Exception {
		ICmCalGroupSegmentDAO dao = (ICmCalGroupSegmentDAO) ServiceFactory.getService(ICmCalGroupSegmentDAO.class);
		return dao.queryGroupDifferDataByCustId(custId);
	}

	@Override
	public DataContainer[] queryNewGroupForFY(String tenantId, int mod, int value, int startNum, int endNum) throws Exception {
		String sql = "";
		String condition = " SELECT T.CUST_ID FROM {CM_GROUP_CUSTOMER} T WHERE T.GROUP_TYPE = 2 AND T.CUST_CERT_TYPE = '17' AND LENGTH(T.CUST_CERT_CODE) = 10 AND T.STATE = 'U' AND T.CUST_ID % :mod = :value  AND NOT EXISTS (SELECT 1 FROM {CM_CUST_SEGMENT_RELA} M WHERE M.CUST_ID=T.CUST_ID) ";
		if (null != tenantId && !"".equals(tenantId)) {
			sql = CmLnCommonUtil.getQueryResult(condition, null, startNum, endNum, new HashMap());
		} else {
			ExceptionUtil.throwBusinessException("Dtenant.id not found!!");
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("mod", mod);
		map.put("value", value);

		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, map);
	}

	@Override
	public int queryNewGroupForFYCount(String tenantId, int mod, int value) throws Exception {
		String sql = "";
		String condition = " SELECT COUNT(1) AS CNT FROM {CM_GROUP_CUSTOMER} T WHERE T.GROUP_TYPE = 2 AND T.CUST_CERT_TYPE = '17' AND LENGTH(T.CUST_CERT_CODE) = 10 AND T.STATE = 'U' AND T.CUST_ID % :mod = :value AND NOT EXISTS (SELECT 1 FROM {CM_CUST_SEGMENT_RELA} M WHERE M.CUST_ID=T.CUST_ID) ";
		if (null != tenantId && !"".equals(tenantId)) {
			sql = SplitTableFactory.createQuerySQL(condition, new HashMap());
		} else {
			ExceptionUtil.throwBusinessException("Dtenant.id not found!!");
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("mod", mod);
		map.put("value", value);
		DataContainer[] dcData = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, map);
		;
		if (dcData != null && dcData.length > 0) {
			return dcData[0].getAsInt("CNT");
		}
		return 0;
	}

	@Override
	public DataContainer[] queryGroupAddStructDataForFY(String tenantId, int mode, int value, int startNum, int endNum) throws Exception {
		String sql = "";
		StringBuffer condition = new StringBuffer();
		condition
				.append(" SELECT  B.DIFFER_ID, A.CUST_ID, B.PARENT_CUST_ID, B.IMPORT_PARENT_CUST_ID FROM {CM_GROUP_CUSTOMER} A, {CM_GROUP_ORG_DIFFER} B ,{CM_CUST_SEGMENT_RELA} C ");
		condition.append(" WHERE A.CUST_ID=B.CUST_ID AND A.CUST_ID = C.CUST_ID  ");
		condition.append(" AND A.CUST_CERT_TYPE='17' AND LENGTH(A.CUST_CERT_CODE)=10 AND A.CUST_ID % :mod = :value ");
		condition.append(" AND B.PROCESS_STATUS<>'3' AND B.PARENT_CUST_ID>0 AND A.STATE='U' AND C.STATE = 'U' ");
		if (null != tenantId && !"".equals(tenantId)) {
			sql = CmLnCommonUtil.getQueryResult(condition.toString(), null, startNum, endNum, new HashMap());
		} else {
			ExceptionUtil.throwBusinessException("Dtenant.id not found!!");
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("mod", mode);
		map.put("value", value);
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, map);
	}

	@Override
	public int queryGroupAddStructDataForFYCount(String tenantId, int mode, int value) throws Exception {
		String sql = "";
		StringBuffer condition = new StringBuffer();
		condition.append(" SELECT  COUNT(1) AS CNT FROM {CM_GROUP_CUSTOMER} A, {CM_GROUP_ORG_DIFFER} B ,{CM_CUST_SEGMENT_RELA} C ");
		condition.append(" WHERE A.CUST_ID=B.CUST_ID AND A.CUST_ID = C.CUST_ID  ");
		condition.append(" AND A.CUST_CERT_TYPE='17' AND LENGTH(A.CUST_CERT_CODE)=10 AND A.CUST_ID % :mod = :value ");
		condition.append(" AND B.PROCESS_STATUS<>'3' AND B.PARENT_CUST_ID>0 AND A.STATE='U' AND C.STATE = 'U' ");
		if (null != tenantId && !"".equals(tenantId)) {
			sql = SplitTableFactory.createQuerySQL(condition.toString(), new HashMap());
		} else {
			ExceptionUtil.throwBusinessException("Dtenant.id not found!!");
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("mod", mode);
		map.put("value", value);
		DataContainer[] dcData = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, map);
		if (dcData != null && dcData.length > 0) {
			return dcData[0].getAsInt("CNT");
		}
		return 0;
	}

	@Override
	public void calSegmentAndAssignMgr(long custId) throws Exception {
		String calSegmentId = CmGroupCalSegmentUtil.calGroupSegment(custId);
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmSegMgrGroupRelValue mgrGroupRelValue = groupCustomerSV.queryOrgIdBySegmentZipCode(Long.parseLong(calSegmentId), -1);
		String calTSM = "";
		// 计算后细分对应的TSM
		if (mgrGroupRelValue != null) {
			calTSM = CmCommonUtil.getTSM(DataType.getAsLong(mgrGroupRelValue.getGroupCode()));
			if (calSegmentId.equals(CmConstants.segment.SA)) {
				calTSM = mgrGroupRelValue.getGroupCode();
			}
		} else {
			// 根据细分及邮编没有找到对应的客户经理。
			ExceptionUtil.throwBusinessException("CMS0000169");
		}
		ICmCustSegmentRelaSV segmentRelaSv = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue oldSegmentRelaValue = segmentRelaSv.querySegmentRelaByCustId(custId);
		if (oldSegmentRelaValue != null) {
			oldSegmentRelaValue.setSegmentId(Long.parseLong(calSegmentId));
			oldSegmentRelaValue.setIsRevisable(CmConstants.YesOrNo.YES);
			oldSegmentRelaValue.setIsInheritable(CmConstants.YesOrNo.YES);
			segmentRelaSv.saveSegmentRela(oldSegmentRelaValue);
		} else {
			IBOCmCustSegmentRelaValue segmentRelaValue = new BOCmCustSegmentRelaBean();
			segmentRelaValue.setCustId(custId);
			segmentRelaValue.setSegmentId(Long.parseLong(calSegmentId));
			segmentRelaValue.setIsRevisable(CmConstants.YesOrNo.YES);
			segmentRelaValue.setIsInheritable(CmConstants.YesOrNo.YES);
			segmentRelaSv.saveSegmentRela(segmentRelaValue);
		}
		// 保存对应的客户经理
		groupCustomerSV.saveManager(custId, Long.parseLong(calTSM));
		// 送billing
		groupCustomerSV.sendSegmentToBilling(custId, Long.parseLong(calSegmentId));

	}

	@Override
	public void saveCustOrg(long custId, long upCustId, long downCustId, String upCustServiceId, String downCustName, boolean isBankruptcyRecovery) throws Exception {
		// 上级组织
		ICustOrganizeValue upCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(upCustId);
		// 下级组织
		ICustOrganizeValue downCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(downCustId);
		if (upCustOrganizeValue != null && downCustOrganizeValue != null) {
			// 下级组织的原根节点custId
			long oldParentCustId = downCustOrganizeValue.getCustId();
			if (downCustOrganizeValue.getParentDeptId() != upCustOrganizeValue.getDeptId()) {
				// 判断该集团的组织结构是否可覆盖, 1为可覆盖; 0为不可覆盖
				if (0 != downCustOrganizeValue.getIsRevisable()) {
					BOCmGroupOrgStructBean orgStructValue = new BOCmGroupOrgStructBean();
					List<BOCmGroupOrgStructBean> orgStructLists = new LinkedList<>();
					// 新增子节点时，需要修改父组织的HAS_LEAF属性为"是"
					upCustOrganizeValue.setHasLeaf(1);

					// 针对层级拆分的特殊处理
					if (downCustId > 0 && upCustId == downCustId) {
						downCustOrganizeValue.setParentDeptId(upCustOrganizeValue.getRelCustId());
						downCustOrganizeValue.setCustId(upCustOrganizeValue.getRelCustId());
					} else {
						downCustOrganizeValue.setParentDeptId(upCustOrganizeValue.getDeptId());
						downCustOrganizeValue.setCustId(upCustOrganizeValue.getCustId());
					}
					// 子公司
					downCustOrganizeValue.setDeptType(CmConstants.CustomerOrg.SUB_COMPANY);
					downCustOrganizeValue.setDeptName(downCustName);
					downCustOrganizeValue.setIsContactPoint(0);
					// 1为可覆盖
					downCustOrganizeValue.setIsRevisable(1);
					orgStructValue.copy(downCustOrganizeValue);
					orgStructLists.add(orgStructValue);
					BOCmGroupOrgStructBean upOrgStructValue = new BOCmGroupOrgStructBean();
					upOrgStructValue.copy(upCustOrganizeValue);
					orgStructLists.add(upOrgStructValue);
					BOCmGroupOrgStructBean[] orgStructValues = orgStructLists.toArray(new BOCmGroupOrgStructBean[0]);
					// 层级同步billing
					this.syncHierarchyInfoToBilling(orgStructValue, true);
					CmInnerServiceFactory.getCommonInnerSV().saveBeans(orgStructValues);

					// 判断新增子公司是否存在子级,将子公司的所有子节点cust_id全部修改为根节点的cust_id
					this.batchUpdateSubCustId(orgStructValue);
					// 记录层级CI变更记录
					// 原ROOT不是自己,变更后ROOT也不为自己,属于同一层级变更,暂不记录CI
					// 原ROOT不是自己,变更后ROOT为自己,属于层级拆分发pushc提醒客户经理手动在页面split,暂不记录CI
					String changeType = "";
					String changeReason = CmConstants.kobCiAttrValue.REASON_NEW;
					if (downCustId == oldParentCustId && downCustId != upCustId) {
						// 原ROOT是自己,变更后ROOT不为自己，属于层级变更
						changeType = CmConstants.kobCiAttrValue.TYPE_ADD;
					}
					if (isBankruptcyRecovery) {
						changeReason = CmConstants.kobCiAttrValue.REASON_REVIVED;
					} else {
						// 录入组织结构差异表
						this.saveDifferData(upCustOrganizeValue.getDeptId(), upCustId, downCustId, upCustServiceId, oldParentCustId);
					}
					CmCommonUtil.recordHierarchyChangeCi(custId, upCustId, oldParentCustId, changeType, changeReason);
				} else {
					ExceptionUtil.throwBusinessException("CMS0013029", "DownCustId:" + downCustId + " Can't Revisable!");
				}
			}
		}
	}

	@Override
	public void batchUpdateSubCustId(BOCmGroupOrgStructBean orgStructValue) throws Exception {
		ICustOrganizeValue[] subCustOrganizeValues = CmServiceFactory.getCustomerSV().queryAllSubCustOrganizesByParentId(orgStructValue.getDeptId(), -1, -1);
		if (CmCommonUtil.isNotEmptyObject(subCustOrganizeValues)) {
			boolean upDateFlag = false;
			for (ICustOrganizeValue subCustOrganizeValue : subCustOrganizeValues) {
				if (subCustOrganizeValue.getParentDeptId() != subCustOrganizeValue.getCustId()) {
					if (1 == subCustOrganizeValue.getIsContactPoint()) {
						// 默认去除原有联系点
						subCustOrganizeValue.setIsContactPoint(0);
					}
					subCustOrganizeValue.setCustId(orgStructValue.getCustId());
					upDateFlag = true;
				}
			}
			if (upDateFlag) {
				BOCmGroupOrgStructBean[] subOrgStructValues = new BOCmGroupOrgStructBean[subCustOrganizeValues.length];
				for (int j = 0; j < subCustOrganizeValues.length; j++) {
					subOrgStructValues[j] = new BOCmGroupOrgStructBean();
					subOrgStructValues[j].copy(subCustOrganizeValues[j]);
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(subOrgStructValues);
			}
		}
		subCustOrganizeValues = CmServiceFactory.getCustomerSV().queryCustOrganizesByParentId(orgStructValue.getDeptId(), -1, -1);
		if (CmCommonUtil.isNotEmptyObject(subCustOrganizeValues)) {
			boolean upDateFlag = false;
			for (ICustOrganizeValue subCustOrganizeValue : subCustOrganizeValues) {
				if (subCustOrganizeValue.getParentDeptId() != subCustOrganizeValue.getCustId()) {
					if (1 == subCustOrganizeValue.getIsContactPoint()) {
						// 默认去除原有联系点
						subCustOrganizeValue.setIsContactPoint(0);
					}
					subCustOrganizeValue.setCustId(orgStructValue.getCustId());
					upDateFlag = true;
				}
			}
			if (upDateFlag) {
				BOCmGroupOrgStructBean[] subOrgStructValues = new BOCmGroupOrgStructBean[subCustOrganizeValues.length];
				for (int j = 0; j < subCustOrganizeValues.length; j++) {
					subOrgStructValues[j] = new BOCmGroupOrgStructBean();
					subOrgStructValues[j].copy(subCustOrganizeValues[j]);
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(subOrgStructValues);
			}
		}
	}

	@Override
	public void syncHierarchyInfoToBilling(BOCmGroupOrgStructBean orgStructValue, boolean needAddFlag) throws Exception {
		try {
			if (CmCommonUtil.isNotEmptyObject(orgStructValue)) {
				Map custMap = new HashMap();
				Map newCustMap = new HashMap();
				Map oldCustMap = new HashMap();
				newCustMap.put("CUST_ID", orgStructValue.getRelCustId());
				newCustMap.put("TOP_CUST_ID", orgStructValue.getCustId());
				ICustOrganizeValue importParentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeById(orgStructValue.getParentDeptId());
				if (importParentOrg != null) {
					newCustMap.put("PARENT_CUST_ID", importParentOrg.getRelCustId());
				}
				newCustMap.put("OPER_TYPE", "1");
				newCustMap.put("VALID_DATE", orgStructValue.getDoneDate());
				newCustMap.put("EXPIRE_DATE", orgStructValue.getExpireDate());
				newCustMap.put("DONE_CODE", ServiceManager.getDoneCode());
				newCustMap.put("DONE_DATE", orgStructValue.getDoneDate());
				oldCustMap.put("CUST_ID", DataType.getAsLong(orgStructValue.getOldObj("REL_CUST_ID")));
				oldCustMap.put("TOP_CUST_ID", DataType.getAsLong(orgStructValue.getOldObj("CUST_ID")));
				ICustOrganizeValue oldParentOrg = CmServiceFactory.getCustomerSV().queryCustOrganizeById(DataType.getAsLong(orgStructValue.getOldObj("PARENT_DEPT_ID")));
				if (oldParentOrg != null) {
					oldCustMap.put("PARENT_CUST_ID", oldParentOrg.getRelCustId());
					oldCustMap.put("VALID_DATE", oldParentOrg.getEffectiveDate());
				} else {
					oldCustMap.put("PARENT_CUST_ID", DataType.getAsLong(orgStructValue.getOldObj("PARENT_DEPT_ID")));
					oldCustMap.put("VALID_DATE", TimeUtil.getMaxExpire());
				}
				oldCustMap.put("OPER_TYPE", "3");
				oldCustMap.put("EXPIRE_DATE", orgStructValue.getDoneDate());
				oldCustMap.put("DONE_CODE", ServiceManager.getDoneCode());
				oldCustMap.put("DONE_DATE", orgStructValue.getDoneDate());
				List mspList = new ArrayList();
				if (needAddFlag) {
					mspList.add(newCustMap);
				}
				mspList.add(oldCustMap);
				custMap.put("I_CUST_REL", mspList);
				if (!custMap.isEmpty()) {
					CmServiceFactory.getTeamInvokeSV().sendMapOrderInfoToBilling(custMap);
				}
			}
		} catch (Exception e) {
			String errorMsg = "syncHierarchyInfoToBilling error.";
			log.error(errorMsg, e);
			CmCommonUtil.saveCmFileSyncErrLog(errorMsg + e.getMessage(), "", String.valueOf(orgStructValue.getCustId()));
		}
	}

	/**   
	 * @Function dealSegmentForChangeHierarchy
	 * @Description 
	 * 层级变化触发细分变更
	 * @param upCustId
	 * @param downCustId
	 * @param oldParentCustId
	 * @throws Exception
	 * @throws AIException
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-6 下午12:47:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-6     yangjh           v1.0.0               修改原因<br>
	 */
	private void dealSegmentForChangeHierarchy(long upCustId, long downCustId, long oldParentCustId) throws Exception, AIException {
		// 原ROOT
		long oldRootId = oldParentCustId;
		// 新ROOT
		long newRootId = upCustId;
		long oldCustId = downCustId;
		// 初始化插入细分计算工单工厂
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		// 原ROOT为自己
		if (oldCustId == oldRootId && oldCustId != newRootId) {// 原ROOT是自己,变更后ROOT不为自己，属于层级变更
			// modify at 2015-06-15,插一条为3的工单，为3的工单只针对层级变更进行处理
			busiModel.saveSegmentCal(oldCustId, newRootId, -1, CmConstants.TaskStaticParam.ROOT_LEAF_APPROVE, "KOB");
		} else if (oldCustId != oldRootId && oldCustId == newRootId) {// 层级拆分
			// 层级拆分只需要发送消息通知
			ICmCustSegmentRelaSV segmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
			IBOCmCustSegmentRelaValue cmCustSegmentRelaVal = segmentRelaSV.querySegmentRelaByCustId(oldCustId);
			if (cmCustSegmentRelaVal == null) {
				throw new Exception(" can not get the segment by Customer[" + oldCustId + "]");
			}
			long opId = 0;
			ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			if (StringUtils.equals(String.valueOf(cmCustSegmentRelaVal.getSegmentId()), CmConstants.segment.SA)) {
				// 细分为SA,则通知该组对应的TSM
				long groupId = groupCustomerSV.queryManagerId(oldCustId);
				opId = DataType.getAsLong((CmCommonUtil.getTSM(groupId)));
			} else {
				// 细分不是SA,则通知客户当前的AM
				opId = groupCustomerSV.queryManagerId(oldCustId);
			}
			IBORemindValue remindValue = new BORemindBean();
			remindValue.setRemindTitle("Split Hierarchy Successful");
			remindValue.setRemindStaffCode(DataType.getAsString(opId));
			remindValue.setRevisorId(opId);
			remindValue.setRemindContent("Split Hierarchy,Leaf CustId is" + oldCustId);
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.cmPushMessage(new IBORemindValue[] { remindValue });
		} else if (oldCustId != oldRootId && oldCustId != newRootId) {// 原ROOT不是自己,变更后ROOT也不为自己，属于层级变更
			// 取得新节点的根节点
			ICustOrganizeValue custOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(newRootId);
			// 找出根节点
			long newRootCustId = custOrganizeValue.getCustId();
			// modify at 2015-06-15,插一条为3的工单，为3的工单只针对层级变更进行处理
			busiModel.saveSegmentCal(oldCustId, newRootCustId, -1, CmConstants.TaskStaticParam.ROOT_LEAF_APPROVE, "KOB");
		}
	}

	/**
	 * 保存集团组织结构差异
	 * @param deptId
	 * @param parentCustId
	 * @param custId
	 * @throws Exception
	 */
	@Override
	public void saveDifferData(long deptId, long parentCustId, long custId, String custServiceId, long oldParentCustId) throws Exception {
		BOCmGroupOrgDifferBean groupOrgDiffer = new BOCmGroupOrgDifferBean();
		groupOrgDiffer.setDifferId(CmCommonUtil.getNewSequence(groupOrgDiffer));
		groupOrgDiffer.setDeptId(deptId);
		// 修改后的上级部门编号
		groupOrgDiffer.setImportParentDeptId(deptId);
		groupOrgDiffer.setParentDeptId(custId);
		groupOrgDiffer.setCustId(custId);
		groupOrgDiffer.setCustServiceId(custServiceId);
		// 修改后的上级集团客户编号
		groupOrgDiffer.setImportParentCustId(parentCustId);
		// 修改前的上级集团客户编号
		groupOrgDiffer.setParentCustId(oldParentCustId);
		groupOrgDiffer.setImportSource("KOB");
		groupOrgDiffer.setImportDate(new Timestamp(System.currentTimeMillis()));
		groupOrgDiffer.setIsAlert(1);
		// 1:未变更层级，2:已变更层级,3:已重算细分,4:处理失败
		groupOrgDiffer.setProcessStatus(2);
		groupOrgDiffer.setState(CmConstants.RecordState.USE);
		UserInfoInterface user = ServiceManager.getUser();
		groupOrgDiffer.setCreateOpId(user.getID());
		groupOrgDiffer.setCreateOrgId(user.getOrgId());
		groupOrgDiffer.setOpId(user.getID());
		groupOrgDiffer.setOrgId(user.getOrgId());
		groupOrgDiffer.setDoneCode(user.getID());
		groupOrgDiffer.setCreateDate(new Timestamp(System.currentTimeMillis()));
		groupOrgDiffer.setDoneDate(new Timestamp(System.currentTimeMillis()));
		CmInnerServiceFactory.getCommonInnerSV().saveBean(groupOrgDiffer);
	}

	@Override
	public void inheritCustSegmentAndMgr(String segmentID, long custId, String strMgrCustId) throws Exception {
		ICmCustSegmentRelaSV cmCustSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue subGroupSegmentRelaBean = new BOCmCustSegmentRelaBean();
		IBOCmCustSegmentRelaValue segmentRela = cmCustSegmentRelaSV.querySegmentRelaByCustId(custId);
		if (segmentRela != null) {
			if (segmentRela.getIsRevisable() == 1) {// 允许修改
				segmentRela.setSegmentId(DataType.getAsLong(segmentID));
				subGroupSegmentRelaBean.copy(segmentRela);
			}
		} else {
			subGroupSegmentRelaBean.setCustId(custId);// 取得集团客户ID
			subGroupSegmentRelaBean.setSegmentId(DataType.getAsLong(segmentID));
			subGroupSegmentRelaBean.setIsInheritable(1);
			subGroupSegmentRelaBean.setIsRevisable(1);
			subGroupSegmentRelaBean.setIsCreditCalculated(1);
			subGroupSegmentRelaBean.setIsApprovable(0);
		}
		// 继承客户经理
		ICmGroupCustomerSV service = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		long managerId = service.queryManagerId(Long.parseLong(strMgrCustId));
		service.saveManager(custId, managerId);
		cmCustSegmentRelaSV.saveSegmentRela(subGroupSegmentRelaBean);
		// 细分同步billing
		ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		groupCustomerSV.sendSegmentToBilling(custId, Long.parseLong(segmentID));

	}

	@Override
	public void transData(String currentTableName, String errorTableName) throws Exception {
		ICmCommonInnerDAO dao = (ICmCommonInnerDAO) ServiceFactory.getService(ICmCommonInnerDAO.class);
		String countSql = "SELECT COUNT(1) AS CNT FROM {" + errorTableName + "} ";
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, countSql, null);
		if (CmCommonUtil.isNotEmptyObject(dcs) && Objects.nonNull(dcs[0].get("CNT"))) {
			int count = dcs[0].getAsInt("CNT");
			if (count > 0) {
				int limitCount = CmCommonUtil.getKobLimitCount();
				// 超过限制分批插入
				if (count > limitCount) {
					int pageCount = count / limitCount + 1;
					for (int i = 0; i < pageCount; i++) {
						String sql = " INSERT INTO {" + currentTableName + "}" + " (RECORD_ID,KOB_NMMBER,FILE_NAME,DETAL_INFO,REGION_ID,CREATE_DATE,DONE_DATE,EFFECTIVE_DATE,EXPIRE_DATE,STATE)" +
								" SELECT RECORD_ID,KOB_NMMBER,FILE_NAME,DETAL_INFO,'2100',CREATE_DATE,CREATE_DATE,CREATE_DATE,'2099-12-31 23:59:59','U'" +
								" FROM {" + errorTableName + "} ORDER BY RECORD_ID ASC LIMIT :pageSize ";
						HashMap parameter = new HashMap();
						parameter.put("pageSize", limitCount);
						dao.executeSql(SplitTableFactory.createQuerySQL(sql, parameter), parameter);

						String deleteSql = " DELETE FROM {" + errorTableName + "} ORDER BY RECORD_ID ASC LIMIT :pageSize ";
						dao.executeSql(SplitTableFactory.createQuerySQL(deleteSql, parameter), parameter);
					}
				} else {
					StringBuffer sql = new StringBuffer();
					sql.append(" INSERT INTO {").append(currentTableName).append("}").append("(")
							.append("RECORD_ID,KOB_NMMBER,FILE_NAME,DETAL_INFO,REGION_ID,CREATE_DATE,DONE_DATE,EFFECTIVE_DATE,EXPIRE_DATE,STATE").append(")");
					sql.append(" SELECT RECORD_ID,KOB_NMMBER,FILE_NAME,DETAL_INFO,'2100',CREATE_DATE,CREATE_DATE,CREATE_DATE,'2099-12-31 23:59:59','U'");
					sql.append(" FROM {").append(errorTableName).append("}");
					dao.executeSql(SplitTableFactory.createQuerySQL(sql.toString(), new HashMap()), null);
					sql = new StringBuffer(" DELETE FROM {").append(errorTableName).append("} ");
					dao.executeSql(SplitTableFactory.createQuerySQL(sql.toString(), new HashMap()), null);
				}
			}
		}
	}
}
