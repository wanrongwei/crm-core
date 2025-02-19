package com.asiainfo.crm.cm.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.web.DataContainerList;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsPublicDealBean;
import com.asiainfo.crm.cm.common.bo.QBOCmPartyBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContractBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContractValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupContractSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;

/** 
 * 集团合同管理服务
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName ICmxGroupContractSV
 * @Description 该类的功能描述
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-28 上午11:07:14
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
 */
public class CmGroupContractSVImpl implements ICmGroupContractSV {

	/** 
	 * 查询集团合同信息
	 * @Function queryGroupContracts
	 * @Description 
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:08:56
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContractValue[] queryGroupContracts(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			Map condMap = ParamUtil.transferDataContainersToMap(dcs);
			Parameter parameter = ParamUtil.buildParameter(condMap, BOCmGroupContractBean.class, new String[] { IBOCmGroupContractValue.S_FirstName });
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM (");
			sql.append("SELECT M.*,").append("F.").append(IBOCmGroupContractValue.S_ContractName).append(" as PARENT_CONTRACT_NAME").append(" FROM ")
					.append(BOCmGroupContractBean.getObjectTypeStatic().getMapingEnty()).append(" M LEFT JOIN ")
					.append(BOCmGroupContractBean.getObjectTypeStatic().getMapingEnty()).append(" F ").append(" ON ").append(" M.")
					.append(IBOCmGroupContractValue.S_ParentContractId).append(" = F.").append(IBOCmGroupContractValue.S_ContractId).append(" AND M.")
					.append(IBOCmGroupContractValue.S_State).append(" = 'U' ");
			sql.append(") A ");
			sql.append(" WHERE ").append(parameter.getCondition());
			// 分页支持
			if (startNum == -1 && endNum == -1) {
			} else {
				sql.insert(0, "select * from (select B.* from ( ");
				sql.append(" ) B) ");
				if (startNum >= 0 && endNum >= 0) {
					sql.append("limit ").append(startNum).append(",").append(endNum);
				}
			}
			// 记录业务日志
			CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
			DataContainerInterface[] results = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter.getParameter());
			if (CmCommonUtil.isNotEmptyObject(results)) {
				IBOCmGroupContractValue[] contractValues = new IBOCmGroupContractValue[results.length];
				for (int i = 0; i < contractValues.length; i++) {
					contractValues[i] = new BOCmGroupContractBean();
					contractValues[i].copy(results[i]);
					// initProperty
					if (results[i].hasProperty("PARENT_CONTRACT_NAME")) {
						contractValues[i].initProperty("PARENT_CONTRACT_NAME", results[i].get("PARENT_CONTRACT_NAME"));
					}
				}
				return contractValues;
			}
		}
		return new IBOCmGroupContractValue[0];
	}

	/** 
	 * 查询集团合同数量
	 * @Function queryGroupContractCount
	 * @Description 
	 * @param criteria
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:09:56
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryGroupContractCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			Parameter parameter = ParamUtil.buildParameter(dcs, BOCmGroupContractBean.class, new String[] { IBOCmGroupContractValue.S_FirstName });
			return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupContractBean.class, parameter.getCondition(), parameter.getParameter());
		}
		return 0;
	}

	/** 
	 * 根据样例查询集团合同信息
	 * @Function queryGroupContracts
	 * @Description 
	 * @param sample
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:10:56
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContractValue[] queryGroupContracts(IBOCmGroupContractValue sample, int startNum, int endNum) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(sample)) {
			Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { (DataContainer) sample }, BOCmGroupContractBean.class);
			// 记录业务日志
			CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
			return (IBOCmGroupContractValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupContractBean.class, parameter.getCondition(), parameter.getParameter(),
					startNum, endNum);
		}
		return new IBOCmGroupContractValue[0];
	}

	/** 
	 * 根据样例查询集团合同信息数量
	 * @Function queryGroupContractCount
	 * @Description 
	 * @param sample
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:11:38
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryGroupContractCount(IBOCmGroupContractValue sample) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(sample)) {
			Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { (DataContainer) sample }, BOCmGroupContractBean.class);
			return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupContractBean.class, parameter.getCondition(), parameter.getParameter());
		}
		return 0;
	}

	/** 
	 * 根据主键查询集团合同信息
	 * @Function queryGroupContractById
	 * @Description 
	 * @param contractId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:12:13
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContractValue queryGroupContractById(long contractId) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(IBOCmGroupContractValue.S_ContractId, contractId);
		dc.set(IBOCmGroupContractValue.S_State, CmConstants.RecordState.USE);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupContractBean.class);
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
		IBOCmGroupContractValue[] values = (IBOCmGroupContractValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupContractBean.class, null,
				parameter.getCondition(), parameter.getParameter(), -1, -1, true);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			IQBOSecOrgStaffOperValue operatorValue = CmServiceFactory.getTeamInvokeSV().getOperQBOByOperId(values[0].getOpId());
			if (CmCommonUtil.isNotEmptyObject(operatorValue)) {
				values[0].initProperty(IBOCmGroupContractValue.S_OpId + "_DISPLAY", operatorValue.getStaffName());
				values[0].initProperty(IBOCmGroupContractValue.S_OrgId + "_DISPLAY", operatorValue.getOrganizeName());
			}
			// 设置上级合同
			if (values[0].getParentContractId() > 0) {
				dc.clear();
				dc.set(IBOCmGroupContractValue.S_ContractId, values[0].getParentContractId());
				dc.set(IBOCmGroupContractValue.S_State, CmConstants.RecordState.USE);
				parameter = ParamUtil.buildParameter(new DataContainer[] { dc }, BOCmGroupContractBean.class);
				IBOCmGroupContractValue[] parentValues = (IBOCmGroupContractValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupContractBean.class, null,
						parameter.getCondition(), parameter.getParameter(), -1, -1, true);
				if (CmCommonUtil.isNotEmptyObject(parentValues)) {
					values[0].initProperty("PARENT_CONTRACT_NAME", parentValues[0].getContractName());
				}
			}
			return values[0];
		}
		return null;
	}

	public void saveGroupContract(IBOCmGroupContractValue groupCustContractValue) throws Exception {
		long businessId = 0;
		if (groupCustContractValue.getExtAttr(ICmBusiLogValue.S_BusinessId) != null) {
			businessId = DataType.getAsLong(groupCustContractValue.getExtAttr(ICmBusiLogValue.S_BusinessId));
		} else {
			businessId = -1;
		}
		if (groupCustContractValue.isNew()) {
			if (groupCustContractValue.getContractId() <= 0) {
				groupCustContractValue.setContractId(CmCommonUtil.getNewSequence(BOCmGroupContractBean.class));
			}
			groupCustContractValue.setState(CmConstants.RecordState.USE);
			if (ServiceManager.getUser() != null) {
				groupCustContractValue.setCreateOpId(ServiceManager.getUser().getID());
				groupCustContractValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			}
		} else if (groupCustContractValue.isDeleted()) {
			groupCustContractValue.setStsToOld();
			groupCustContractValue.setState(CmConstants.RecordState.ERASE);
		}
		// 保存日志
		ICmBusiLogValue busiLogValue = CmBusiLogFactory.createDefaultBusiLog(businessId, CmConstants.BusiLogType.CUSTOMER_LOG, groupCustContractValue.getCustId(), null,
				CmConstants.BusiLogOperType.QUERY, 0, CmBusiLogFactory.getBusiDetail(groupCustContractValue, CrmLocaleFactory.getResource("CMS0030004")));
		CmBusiLogFactory.log(busiLogValue);
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) groupCustContractValue);
	}

	public void deleteGroupContract(long contractId) throws Exception {
		List list = new ArrayList();
		IBOCmGroupContractValue currContractValue = queryGroupContractById(contractId);
		if (currContractValue != null) {
			// modified by huzq2 at 2012-5-9 删除时应该是修改数据的state，不是直接物理删除
			// currContractValue.delete();
			currContractValue.setState(CmConstants.RecordState.ERASE);
			list.add(currContractValue);
			// 删除子合同信息
			list.addAll(Arrays.asList(deleteSubGroupContracts(contractId)));
			// 记录日志
			ICmBusiLogValue busiLogValue = CmBusiLogFactory.createDefaultBusiLog(-1, CmConstants.BusiLogType.CUSTOMER_LOG, currContractValue.getCustId(), null,
					CmConstants.BusiLogOperType.DELETE, 0, CmBusiLogFactory.getBusiDetail(currContractValue, CrmLocaleFactory.getResource("CMS0031045")));
			CmBusiLogFactory.log(busiLogValue);
			if (CmCommonUtil.isNotEmptyObject(list)) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmGroupContractBean[]) list.toArray(new BOCmGroupContractBean[0]));
			}
		}
	}

	/**   
	 * 删除子合同信息
	 * @Function deleteSubGroupContracts
	 * @Description 
	 *
	 * @param contractId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-9 下午4:23:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-9     huzq2           v1.0.0               修改原因<br>
	 */
	private IBOCmGroupContractValue[] deleteSubGroupContracts(long contractId) throws Exception {
		IBOCmGroupContractValue sample = new BOCmGroupContractBean();
		sample.setParentContractId(contractId);
		sample.setState(CmConstants.RecordState.USE);
		IBOCmGroupContractValue[] subContractValues = queryGroupContracts(sample, -1, -1);
		List list = new ArrayList();
		if (CmCommonUtil.isNotEmptyObject(subContractValues)) {
			for (int i = 0; i < subContractValues.length; i++) {
				// modified by huzq2 at 2012-5-9 删除时应该是修改数据的state，不是直接物理删除
				// subContractValues[i].delete();
				subContractValues[i].setState(CmConstants.RecordState.ERASE);
				list.add(subContractValues[i]);
				// 递归删除子合同信息
				list.addAll(Arrays.asList(deleteSubGroupContracts(subContractValues[i].getContractId())));
			}
		}
		return (IBOCmGroupContractValue[]) list.toArray(new IBOCmGroupContractValue[0]);
	}

	public int queryGroupContractInfoCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			Map parameter = new HashMap();
			StringBuilder sql = new StringBuilder();
			StringBuffer condition = new StringBuffer("");
			sql.append("SELECT M.*").append(" FROM ").append(BOCmGroupContractBean.getObjectTypeStatic().getMapingEnty()).append(" M").append(" WHERE ").append("M.")
					.append(IBOCmGroupContractValue.S_State).append(" = 'U' ");

			if (dcs[0].hasProperty("CONTRACT_ID")) {
				condition.append(" AND CONTRACT_ID = :contractId ");
				parameter.put("contractId", dcs[0].get("CONTRACT_ID"));
			}
			if (dcs[0].hasProperty("FIRST_NAME")) {
				condition.append(" AND FIRST_NAME like :firstName ");
				parameter.put("firstName", dcs[0].get("FIRST_NAME") + "%");
			}
			if (dcs[0].hasProperty("CONTRACT_NAME")) {
				condition.append(" AND CONTRACT_NAME like :contractName ");
				parameter.put("contractName", dcs[0].get("CONTRACT_NAME") + "%");
			}
			if (dcs[0].hasProperty("CONTRACT_LEVEL") && !"-1".equals(dcs[0].get("CONTRACT_LEVEL").toString())) {
				condition.append(" AND CONTRACT_LEVEL = :contractLevel ");
				parameter.put("contractLevel", dcs[0].get("CONTRACT_LEVEL"));
			}
			if (dcs[0].hasProperty("EFFECTIVE_DATE")) {
				condition.append(" AND SUBSCRIBE_DATE <= :endDate AND SUBSCRIBE_DATE >= :startDate ");
				parameter.put("startDate", dcs[0].get("EFFECTIVE_DATE"));
				parameter.put("endDate", dcs[0].get("EXPIRE_DATE"));
			}
			condition.append(" AND EXISTS (SELECT 1 FROM CM_GROUP_CUSTOMER CU WHERE T.CUST_ID = CU.CUST_ID ");
			if (dcs[0].hasProperty("CITY_ID")) {
				condition.append(" AND CU.CITY_ID = :cityId ");
				parameter.put("cityId", dcs[0].get("CITY_ID"));
			}
			if (dcs[0].hasProperty("COUNTY_ID")) {
				condition.append(" AND CU.COUNTY_ID = :countyId ");
				parameter.put("countyId", dcs[0].get("COUNTY_ID"));
			}
			if (dcs[0].hasProperty("MANAGER_ID")) {
				condition.append(" ) and exists (select 1 from cm_group_manager g where t.cust_id = g.cust_id and g.manager_id = :managerId ");
				parameter.put("managerId", dcs[0].get("MANAGER_ID"));
			}
			condition.append(" ) ");
			DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
					CmLnCommonUtil.getQueryCount(sql.toString(), condition.toString(), parameter), parameter);
			int a = counts[0].getAsInt("CNT");
			return a;
		}
		return 0;
	}

	public IBOCmGroupContractValue[] queryGroupContractsInfo(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {

			Map parameter = new HashMap();
			StringBuilder sql = new StringBuilder();
			StringBuffer condition = new StringBuffer("");
			sql.append("SELECT M.*").append(" FROM ").append(BOCmGroupContractBean.getObjectTypeStatic().getMapingEnty()).append(" M").append(" WHERE ").append("M.")
					.append(IBOCmGroupContractValue.S_State).append(" = 'U' ");

			if (dcs[0].hasProperty("CONTRACT_ID")) {
				condition.append(" AND CONTRACT_ID = :contractId ");
				parameter.put("contractId", dcs[0].get("CONTRACT_ID"));
			}
			if (dcs[0].hasProperty("FIRST_NAME")) {
				condition.append(" AND FIRST_NAME like :firstName ");
				parameter.put("firstName", dcs[0].get("FIRST_NAME") + "%");
			}
			if (dcs[0].hasProperty("CONTRACT_NAME")) {
				condition.append(" AND CONTRACT_NAME like :contractName ");
				parameter.put("contractName", dcs[0].get("CONTRACT_NAME") + "%");
			}
			if (dcs[0].hasProperty("CONTRACT_LEVEL") && !"-1".equals(dcs[0].get("CONTRACT_LEVEL").toString())) {
				condition.append(" AND CONTRACT_LEVEL = :contractLevel ");
				parameter.put("contractLevel", dcs[0].get("CONTRACT_LEVEL"));
			}
			if (dcs[0].hasProperty("EFFECTIVE_DATE")) {
				condition.append(" AND SUBSCRIBE_DATE <= :endDate AND SUBSCRIBE_DATE >= :startDate ");
				parameter.put("startDate", dcs[0].get("EFFECTIVE_DATE"));
				parameter.put("endDate", dcs[0].get("EXPIRE_DATE"));
			}
			condition.append(" AND EXISTS (SELECT 1 FROM CM_GROUP_CUSTOMER CU WHERE T.CUST_ID = CU.CUST_ID ");
			if (dcs[0].hasProperty("CITY_ID")) {
				condition.append(" AND CU.CITY_ID = :cityId ");
				parameter.put("cityId", dcs[0].get("CITY_ID"));
			}
			if (dcs[0].hasProperty("COUNTY_ID")) {
				condition.append(" AND CU.COUNTY_ID = :countyId ");
				parameter.put("countyId", dcs[0].get("COUNTY_ID"));
			}
			if (dcs[0].hasProperty("MANAGER_ID")) {
				condition.append(" ) and exists (select 1 from cm_group_manager g where t.cust_id = g.cust_id and g.manager_id = :managerId ");
				parameter.put("managerId", dcs[0].get("MANAGER_ID"));
			}
			condition.append(" ) ");
			DataContainerInterface[] results = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupContractBean.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), condition.toString(), startNum, endNum, parameter), parameter);
			if (CmCommonUtil.isNotEmptyObject(results)) {
				IBOCmGroupContractValue[] contractValues = new IBOCmGroupContractValue[results.length];
				for (int i = 0; i < contractValues.length; i++) {
					contractValues[i] = new BOCmGroupContractBean();
					contractValues[i].copy(results[i]);
					// initProperty
					if (results[i].hasProperty("PARENT_CONTRACT_NAME")) {
						contractValues[i].initProperty("PARENT_CONTRACT_NAME", results[i].get("PARENT_CONTRACT_NAME"));
					}
				}
				return contractValues;
			}
		}
		return new IBOCmGroupContractValue[0];
	}

	@Override
	public IBOCmGroupContactValue[] queryCustContInfo(long partyId, long contId, long custId, int[] contType) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (partyId > 0) {
			condition.append(" AND ").append(IBOCmGroupContactValue.S_PartyId).append(" = :partyId ");
			parameter.put("partyId", partyId);
		}

		if (contId > 0) {
			condition.append(" AND ").append(IBOCmGroupContactValue.S_ContId).append(" = :contId ");
			parameter.put("contId", contId);
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupContactValue.S_CustId).append(" = :custId ");
			parameter.put("custId", custId);
		}

		if (contType != null && contType.length > 0) {
			StringBuilder contTypes = new StringBuilder("(");
			for (int i = 0; i < contType.length; i++) {
				contTypes.append(contType[i]).append(",");
			}
			contTypes = contTypes.deleteCharAt(contTypes.length() - 1);
			contTypes.append(")");
			condition.append(" AND ").append(IBOCmGroupContactValue.S_ContType).append(" in ").append(contTypes.toString());
			// parameter.put("contType", contTypes.toString());
		}

		IBOCmGroupContactValue[] groupContacts = (IBOCmGroupContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupContactBean.class, condition.toString(),
				parameter, -1, -1);

		if (!CmCommonUtil.isEmptyObject(groupContacts)) {
			return groupContacts;
		}
		return new IBOCmGroupContactValue[0];
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.service.interfaces.ICmGroupContractSV#saveGroupContact(long, long,
	 * com.ai.appframe2.web.DataContainerList[])
	 */
	public void saveGroupContact(long custContId, long contId, DataContainerList[] dcLists) throws Exception {
		DataContainerInterface[] groupMemberDC = new DataContainer[] {};
		DataContainerInterface[] partyContactDC = new DataContainer[] {};
		DataContainerInterface[] partyDC = new DataContainer[] {};
		if (dcLists.length > 2) {
			groupMemberDC = dcLists[0].getAllDataContainerInterface();
			partyContactDC = dcLists[1].getAllDataContainerInterface();
			partyDC = dcLists[2].getAllDataContainerInterface();
		} else {
			groupMemberDC = dcLists[0].getAllDataContainerInterface();
			partyDC = dcLists[1].getAllDataContainerInterface();
		}
		String regionId = (String) groupMemberDC[0].get("REGION_ID");

		if (groupMemberDC[0].isNew() && partyDC[0].isNew()) {

			// 对联系人是法人的去重校验
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			String custId = groupMemberDC[0].getAsString("CUST_ID");
			IBOCmGroupContactValue[] grouopContValues = customerSV.queryCustContId(0, 0, DataType.getAsLong(custId), -1);
			if (null != grouopContValues && grouopContValues.length > 0) {
				int contType = groupMemberDC[0].getAsInt("CONT_TYPE");
				int contPriory = groupMemberDC[0].getAsInt("PRIORY_LEVEL");
				for (int i = 0; i < grouopContValues.length; i++) {
					if (contType == CmConstants.GroupContType.LEGAL_CONTACT && grouopContValues[i].getContType() == CmConstants.GroupContType.LEGAL_CONTACT) {
						// 已经存在法人联系人,不允许再创建法人联系人
						ExceptionUtil.throwBusinessException("CMS0013248");
					}
					if (CmCommonUtil.isContain(CmConstants.GroupContType.NORMAL_CONTACT, contType) && contPriory == 1) {
						if (grouopContValues[i].getPrioryLevel() == 1 && grouopContValues[i].getContType() == contType) {
							// 主要联系人唯一
							ExceptionUtil.throwBusinessException("CMS0013250");
						}
					}
				}
			}

			String partyIdTemp = groupMemberDC[0].getAsString("PARTY_ID");
			if (null == partyIdTemp || "".equals(partyIdTemp) || "-1".equals(partyIdTemp)) {
				partyIdTemp = String.valueOf(CmCommonUtil.getNewSequence(BOCmPartyBean.class));
			}
			long partyId = DataType.getAsLong(partyIdTemp);
			// 1.集团客户联系人关系
			BOCmGroupContactBean groupContact = new BOCmGroupContactBean();
			groupContact.copy(groupMemberDC[0]);
			groupContact.setCustContId(custContId);
			groupContact.setPartyId(partyId);
			groupContact.setContId(DataType.getAsLong(contId));
			groupContact.setState(CmConstants.RecordState.USE);

			if (groupContact.getContType() == CmConstants.GroupContType.AO_CONTACT) {
				// 送权限创建AO联系人
				ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
				long operId = dkCustomerSV.sendAOContactToSec(partyDC[0], custContId);
				// 特殊处理，将操作员编号存储在集团联系人关系表中到运营商字段，以备以后使用
				groupContact.setProvideId(operId);
				// add AO联系人需要记录交互记录
				String[] objName = new String[] { "Administrator ID:" + contId, "Administrator email:" + partyDC[0].getAsString("CONT_EMAIL"),
						"Administrator name:" + partyDC[0].getAsString("PARTY_NAME") };
				CmRecordLog.saveRecord(CmBusinessOperation.CM_AO_CONTACT_NEW, DataType.getAsLong(custId), objName);
			}

			CmInnerServiceFactory.getCommonInnerSV().saveBean(groupContact);
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.saveCommonBusiLog(CmConstants.BusiLogId.GROUP_CONTACT_PERSON_CREATE, groupMemberDC, CmConstants.BusiLogType.CONTACT_LOG, DataType.getAsLong(custId));

			// 3.参与人基本信息
			QBOCmPartyBean partyValue = new QBOCmPartyBean();
			partyValue.copy(partyDC[0]);
			BOCmPartyBean partyInfo = new BOCmPartyBean();
			partyInfo.copy(partyValue);
			partyInfo.setPartyId(partyId);
			if (partyValue.getMiddleName() == null) {
				partyInfo.setPartyName(partyValue.getFirstName() + " " + partyValue.getLastName());
			} else {
				partyInfo.setPartyName(partyValue.getFirstName() + " " + partyValue.getMiddleName() + " " + partyValue.getLastName());
			}
			partyInfo.setRegionId(regionId);
			partyInfo.setState(CmConstants.RecordState.USE);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(partyInfo);
			// 新增个人参与人信息
			BOCmIndivPartyBean indivPartyValue = new BOCmIndivPartyBean();
			indivPartyValue.copy(partyInfo);
			indivPartyValue.setStsToNew();
			CmInnerServiceFactory.getCommonInnerSV().saveBean(indivPartyValue);

			// 4.参与人联系信息
			BOCmPartyContactBean partyContact = new BOCmPartyContactBean();
			if (dcLists.length > 2) {
				partyContact.copy(partyContactDC[0]);
			}
			partyContact.setContId(DataType.getAsLong(contId));
			partyContact.setContName(partyInfo.getPartyName());
			partyContact.setPartyId(partyId);
			partyContact.setRegionId(regionId);
			partyContact.setState(CmConstants.RecordState.USE);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(partyContact);

			IVOCustValue value = new VOCustBean();
			IContactValue value2 = new ContactBean();
			value2.copy(groupContact);
			value2.setOfficeTel(partyContact.getOfficeTel());
			value2.setContEmail(partyContact.getContEmail());
			value2.setContAddress(partyContact.getContAddress());
			value2.setContDesc(partyContact.getContDesc());
			value2.setPartyName(partyInfo.getPartyName());
			value2.setCertType(partyInfo.getCertType());
			value2.setCertCode(partyInfo.getCertCode());
			value2.setContName(partyInfo.getPartyName());
			value2.setDoneCode(ServiceManager.getDoneCode());
			value.addContact(value2);
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue value3 = service.queryCustomerByCustId(value2.getCustId());
			value3.setStsToOld();
			value.setCustomer(value3);
			value2.setStsToNew();
			CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(value, null);

			// 5.参与人角色
			ICmPartyRoleSV roleService = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class); 
			IBOCmPartyRoleValue[]  cmPartyRoles = roleService.queryPartyRoles(partyId, CmConstants.roleType.contacter, CmConstants.roleStatus.ACTIVE);
			if(null==cmPartyRoles||cmPartyRoles.length<=0) {
				BOCmPartyRoleBean roleBean = new BOCmPartyRoleBean();
				roleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
				roleBean.setRoleType(CmConstants.PartyRoleType.CONTACT);
				roleBean.setEntityId(DataType.getAsLong(contId));
				roleBean.setPartyId(partyId);
				roleBean.setRegionId(regionId);
				roleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
				roleBean.setState(CmConstants.RecordState.USE);
				roleBean.setRoleRegionId(regionId);
				roleService.savePartyRole(roleBean);
			}
		}
		if (groupMemberDC[0].isModified() && partyDC[0].isModified()) {

			// 对联系人是法人的去重校验
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			String contType = groupMemberDC[0].getAsString("CONT_TYPE");
			String custId = groupMemberDC[0].getAsString("CUST_ID");
			if (null != contType && CmConstants.GroupContType.LEGAL_CONTACT == Long.parseLong(contType)) {
				IBOCmGroupContactValue[] grouopContValues = customerSV.queryCustContId(0, 0, DataType.getAsLong(custId), CmConstants.GroupContType.LEGAL_CONTACT);
				if (grouopContValues.length == 1) {
					if (grouopContValues[0].getCustContId() != groupMemberDC[0].getAsLong("CUST_CONT_ID")) {
						// 已经存在法人联系人，不允许再创建
						ExceptionUtil.throwBusinessException("CMS0013248");
					}
				} else if (grouopContValues.length > 1) {
					// 已经存在法人联系人，不允许再创建
					ExceptionUtil.throwBusinessException("CMS0013248");
				}
			}

			// 校验是否联系人优先级变化
			String oldValue = StringUtils.isBlank(groupMemberDC[0].getOldObj("PRIORY_LEVEL") == null ? null : String.valueOf(groupMemberDC[0].getOldObj("PRIORY_LEVEL"))) ? "  "
					: String.valueOf(groupMemberDC[0].getOldObj("PRIORY_LEVEL"));
			String newValue = groupMemberDC[0].getAsString("PRIORY_LEVEL");
			if (StringUtils.isNotBlank(newValue) && (!oldValue.equals(newValue) && Integer.parseInt(newValue) == CmConstants.CONT_LEVEL.CONT_LEVEL_1)) {
				IBOCmGroupContactValue[] grouopContValues2 = customerSV.queryCustContId(0, 0, DataType.getAsLong(custId), -1);
				if (null != grouopContValues2 && grouopContValues2.length > 0) {
					for (int i = 0; i < grouopContValues2.length; i++) {
						if (grouopContValues2[i].getPrioryLevel() == 1) {
							if (grouopContValues2[i].getCustContId() != groupMemberDC[0].getAsLong("CUST_CONT_ID")) {
								// 主要联系人唯一
								ExceptionUtil.throwBusinessException("CMS0013250");
							}
						}
					}
				}
			}
			// 保存集团客户联系人
			BOCmGroupContactBean groupContact = new BOCmGroupContactBean();
			groupContact.copy(groupMemberDC[0]);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(groupContact);
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.saveCommonBusiLog(CmConstants.BusiLogId.GROUP_CONTACT_PERSON_MODIFY, groupMemberDC, CmConstants.BusiLogType.CONTACT_LOG, DataType.getAsLong(custId));


			// 如果是修改，需要插入工单表，同步客户信息
			ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
			IBOCmPsPublicDealValue psPublicDealValue = new BOCmPsPublicDealBean();
			psPublicDealValue.setEntityId(groupContact.getContId());
			psPublicDealValue.setPartyId(groupContact.getPartyId());
			psPublicDealValue.setEntityType(CmConstants.EntityType.CONTACT_PERSON);
			psPublicDealValue.setExecAction(CmConstants.PsPublicAction.PUBLIC_INFO_SYS);
			requestTaskSV.savePublicWordOrder(psPublicDealValue);

			// 保存参与人基本信息
			BOCmPartyBean partyValue = new BOCmPartyBean();
			partyValue.copy(partyDC[0]);
			partyValue.initRegionId(regionId);
			if (partyValue.getMiddleName() == null) {
				partyValue.setPartyName(partyValue.getFirstName() + " " + partyValue.getLastName());
			} else {
				partyValue.setPartyName(partyValue.getFirstName() + " " + partyValue.getMiddleName() + " " + partyValue.getLastName());
			}
			partyValue.isModified();
			CmInnerServiceFactory.getCommonInnerSV().saveBean(partyValue);

			// 保存参与人联系信息
			BOCmPartyContactBean partyContact = new BOCmPartyContactBean();
			if (dcLists.length > 2) {
				partyContact.copy(partyContactDC[0]);
				partyContact.initRegionId(regionId);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(partyContact);
			}

			IVOCustValue value3 = new VOCustBean();
			IContactValue value2 = new ContactBean();
			value2.copy(groupContact);
			if (dcLists.length > 3) {
				value2.setOfficeTel(partyContact.getOfficeTel());
				value2.setContEmail(partyContact.getContEmail());
				value2.setContAddress(partyContact.getContAddress());
				value2.setContDesc(partyContact.getContDesc());
			}
			value2.setPartyName(partyValue.getPartyName());
			value2.setCertType(partyValue.getCertType());
			value2.setCertCode(partyValue.getCertCode());
			value2.setContName(partyValue.getPartyName());
			value3.addContact(value2);
			ICmCustomerSV service3 = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue value4 = service3.queryCustomerByCustId(groupContact.getCustId());
			value4.setStsToOld();
			value3.setCustomer(value4);
			value2.setRegionId(regionId);
			value2.setDoneCode(ServiceManager.getDoneCode());
			CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(value3, null);
		}

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.service.interfaces.ICmGroupContractSV#saveDkCmGroupContact(com.ai.appframe2.web.DataContainerList
	 * [])
	 */
	public void saveDkCmGroupContact(DataContainerList[] dcLists, DataContainerInterface[] groupMemberDC, String regionId, long priorLevel, long custContId) throws Exception {
		// 对联系人是法人的去重校验
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		String contType = groupMemberDC[0].getAsString("CONT_TYPE");
		String custId = groupMemberDC[0].getAsString("CUST_ID");
		if (null != contType) {
			IBOCmGroupContactValue[] grouopContValues = null;
			if (CmConstants.GroupContType.LEGAL_CONTACT == (Integer.parseInt(contType))) {
				grouopContValues = customerSV.queryCustContId(0, 0, DataType.getAsLong(custId), CmConstants.GroupContType.LEGAL_CONTACT);
				if (grouopContValues.length > 0) {
					// 已经存在法人联系人，不允许再创建
					ExceptionUtil.throwBusinessException("CMS0013248");
				}
			} else if (CmCommonUtil.isContain(CmConstants.GroupContType.NORMAL_CONTACT, Integer.parseInt(contType)) && priorLevel == CmConstants.CONT_LEVEL.CONT_LEVEL_1) {
				ICmGroupContractSV cmGroupContractSV = (ICmGroupContractSV) ServiceFactory.getService(ICmGroupContractSV.class);
				grouopContValues = cmGroupContractSV.queryCustContInfo(0, 0, DataType.getAsLong(custId), new int[] { Integer.parseInt(contType) });
				for (int i = 0; i < grouopContValues.length; i++) {
					if (grouopContValues[i].getPrioryLevel() == 1) {
						// 主要联系人唯一
						ExceptionUtil.throwBusinessException("CMS0013250");
					}
				}
			} else {
				// do nothing
			}

		}
		BOCmGroupContactBean groupContact = new BOCmGroupContactBean();
		groupContact.copy(groupMemberDC[0]);
		groupContact.setCustContId(custContId);
		DataContainerInterface[] dc2 = dcLists[1].getAllDataContainerInterface();
		DataContainerInterface[] dc3 = dcLists[2].getAllDataContainerInterface();
		long partyId = dc3[0].getAsLong("PARTY_ID");
		long contId = dc2[0].getAsLong("CONT_ID");
		groupContact.setPartyId(partyId);
		groupContact.setContId(contId);
		groupContact.setState(CmConstants.RecordState.USE);
		if(groupContact.isNew()){
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.saveCommonBusiLog(CmConstants.BusiLogId.GROUP_CONTACT_PERSON_CREATE, groupMemberDC, CmConstants.BusiLogType.CONTACT_LOG, DataType.getAsLong(custId));
		} else if(groupContact.isModified()){
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.saveCommonBusiLog(CmConstants.BusiLogId.GROUP_CONTACT_PERSON_MODIFY, groupMemberDC, CmConstants.BusiLogType.CONTACT_LOG, DataType.getAsLong(custId));
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean(groupContact);

		// 保存联系人关系与联系媒介关联表

		BOCmPartyContactBean partyContact = new BOCmPartyContactBean();
		partyContact.copy(dc2[0]);
		partyContact.setPartyId(partyId);
		partyContact.setContName(dc3[0].getAsString("PARTY_NAME"));
		partyContact.initRegionId(groupContact.getRegionId());
		partyContact.setState(CmConstants.RecordState.USE);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(partyContact);

		IVOCustValue value = new VOCustBean();
		IContactValue value2 = new ContactBean();
		value2.copy(groupContact);
		value2.setOfficeTel(dc2[0].getAsString("OFFICE_TEL"));
		value2.setContEmail(dc2[0].getAsString("CONT_EMAIL"));
		value2.setContAddress(dc2[0].getAsString("CONT_ADDRESS"));
		value2.setContDesc(dc2[0].getAsString("CONT_DESC"));
		value2.setPartyName(dc3[0].getAsString("PARTY_NAME"));
		value2.setCertType(dc3[0].getAsLong("CERT_TYPE"));
		value2.setCertCode(dc3[0].getAsString("CERT_CODE"));
		value2.setContName(dc3[0].getAsString("PARTY_NAME"));
		value.addContact(value2);
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue value3 = service.queryCustomerByCustId(groupContact.getCustId());
		value3.setStsToOld();
		value.setCustomer(value3);
		value2.setStsToNew();

		if (groupContact.getContType() == CmConstants.GroupContType.AO_CONTACT) {
			// 送权限创建AO联系人
			ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
			long operId = dkCustomerSV.sendAOContactToSec(dc3[0], custContId);
			// 特殊处理，将操作员编号存储在集团联系人关系表中到运营商字段，以备以后使用
			groupContact.setProvideId(operId);
			// add AO联系人需要记录交互记录
			String[] objName = new String[] { "Administrator ID:" + contId, "Administrator email:" + dc2[0].getAsString("CONT_EMAIL"),
					"Administrator name:" + dc3[0].getAsString("PARTY_NAME") };
			CmRecordLog.saveRecord(CmBusinessOperation.CM_AO_CONTACT_NEW, DataType.getAsLong(custId), objName);
		}

		// 5.参与人角色
		ICmPartyRoleSV roleService = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[]  cmPartyRoles = roleService.queryPartyRoles(partyId, CmConstants.roleType.contacter, CmConstants.roleStatus.ACTIVE);
		if(null==cmPartyRoles||cmPartyRoles.length<=0) {
			BOCmPartyRoleBean roleBean = new BOCmPartyRoleBean();
			roleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
			roleBean.setRoleType(CmConstants.PartyRoleType.CONTACT);
			roleBean.setEntityId(DataType.getAsLong(contId));
			roleBean.setPartyId(partyId);
			roleBean.setRegionId(regionId);
			roleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
			roleBean.setState(CmConstants.RecordState.USE);
			roleBean.setRoleRegionId(regionId);
			roleService.savePartyRole(roleBean);
		}
		
		CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(value, null);

	}
}
