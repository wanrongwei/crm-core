package com.asiainfo.crm.cm.customer.group.service.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.StringUtils;
import com.ai.appframe2.web.json.JsonUtil;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsDistrictValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.SNUtil;
import com.ai.omframe.util.TimeUtil;
import com.ai.secframe.common.UserInfo;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmDistrictUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupContactBindingBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupSegmentAttrRelaBean;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupCustomerDAO;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupExtraInfoDAO;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupInformInfoDAO;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmQGroupCustAndExtraInfoDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupContactBindingValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMgrRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupExtraInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupInformInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustAndExtraInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustManagerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupKeyMemberUserValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmSubGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.customer.group.util.GroupCustomerUtil;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmIndivCustomerDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class CmGroupCustomerSVImpl implements ICmGroupCustomerSV {

	public static final Log log = LogFactory.getLog(CmGroupCustomerSVImpl.class);

	private static final String[] NOT_CONDITION_FIELD = { "CUST_NAME", "CUST_ADDRESS", "CONT_NAME", "PROV_GROUP_TYPE", "GROUP_CUST_ID", "QUERY_TYPE", "CONT_PHONE", "MATCH_TYPE",
			"MANAGER_TYPE", "CHNL_CITY_ID_FORM", "CHNL_REGION_TYPE_FORM", "CHNL_REGION_DETAIL_FORM", "MANAGER_ID_FORM", "VPMN_CUST_ID", "IS_CONTRACT", "GROUPIDS",
			"SAGROUPRELAFLAG", "CONTACT_CONTENT_INPUT", "CONTACTCONTENTINPUT", "GROUPLEVELS", "KERNEL_NAME", "ACCT_ID", "GROUP_ID", "IS_NOT_MANAGER", "PRODUCT_TYPE",
			"GROUP_PBX_MEMBER", "GROUP_NORMAL_MEMBER", "CHNL_CITY_ID", "CHNL_REGION_TYPE", "PRODUCT_TYPE", "PRODUCT_ID", "COMBO_ID" };

	public IBOCmGroupCustomerValue queryGroupCustomer(String custName, int custCertType, String custCertCode) throws Exception, RemoteException {
		/*
		 * 先用证件信息查询是否存在。
		 */
		DataContainerInterface dataContainer = new DataContainer();
		dataContainer.set(IQBOCmGroupCustAndExtraInfoValue.S_CustCertType, Integer.valueOf(custCertType));
		dataContainer.set(IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode, custCertCode);
		IBOCmGroupCustomerValue[] groupCustomers = queryGroupCustomers(dataContainer, -1, -1);
		if (groupCustomers != null && groupCustomers.length > 0) {
			return groupCustomers[0];
		}
		/*
		 * 如果传入的客户名称不为空，再用客户名称查询是否存在同名的集团。
		 */
		if (!StringUtils.isEmptyString(custName)) {
			dataContainer.clear();
			dataContainer.set(IQBOCmGroupCustAndExtraInfoValue.S_CustName, custName);
			groupCustomers = queryGroupCustomers(dataContainer, -1, -1);
			if (groupCustomers != null && groupCustomers.length > 0) {
				return groupCustomers[0];
			}
		}
		return new BOCmGroupCustomerBean();
	}

	public IBOCmGroupCustomerValue queryGroupCustomerById(long groupCustId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustomerById(groupCustId);
	}

	public int queryGroupCustomerCount(DataContainerInterface dataContainer) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustomerCount(dataContainer);
	}

	public IBOCmGroupCustomerValue[] queryGroupCustomers(DataContainerInterface dataContainer, int startIndex, int endIndex) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustomers(dataContainer, startIndex, endIndex);
	}

	public IBOCmGroupInformInfoValue queryGroupInformInfo(long groupCustId, int informTypeId) throws Exception, RemoteException {
		ICmGroupInformInfoDAO groupInformInfoDAO = (ICmGroupInformInfoDAO) ServiceFactory.getService(ICmGroupInformInfoDAO.class);
		return groupInformInfoDAO.queryGroupInformInfo(groupCustId, informTypeId);
	}

	public IBOCmGroupInformInfoValue[] queryGroupInformInfo(long groupCustId, int startIndex, int endIndex) throws Exception, RemoteException {
		ICmGroupInformInfoDAO groupInformInfoDAO = (ICmGroupInformInfoDAO) ServiceFactory.getService(ICmGroupInformInfoDAO.class);
		return groupInformInfoDAO.queryGroupInformInfo(groupCustId, startIndex, endIndex);
	}

	public int queryGroupInformInfoCount(long groupCustId) throws Exception, RemoteException {
		ICmGroupInformInfoDAO groupInformInfoDAO = (ICmGroupInformInfoDAO) ServiceFactory.getService(ICmGroupInformInfoDAO.class);
		return groupInformInfoDAO.queryGroupInformInfoCount(groupCustId);
	}

	public long saveGroupCustAndExtraInfo(IBOCmGroupCustomerValue groupCustomerValue, IBOCmGroupExtraInfoValue groupExtraInfoValue, long baseId) throws Exception, RemoteException {
		long groupId = 0;
		if (null == groupCustomerValue) {
			log.error("groupCustomerValue is null！");
			ExceptionUtil.throwBusinessException("CMS0403001", "groupCustomerValue");
		}
		if (null == groupExtraInfoValue) {
			log.error("groupExtraInfoValue is null！");
			ExceptionUtil.throwBusinessException("CMS0403001", "groupExtraInfoValue");
		}
		// groupCustomerValue.setBaseCustId(baseId);
		groupId = saveGroupCustomer(groupCustomerValue);
		groupExtraInfoValue.setGroupCustId(groupId);
		saveGroupExtraInfo(groupExtraInfoValue);
		return groupId;
	}

	public void modifyGroupCustAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue) throws Exception, RemoteException {
		groupCustomerAndExtraInfoValidate(groupCustAndExtraInfoValue);
		saveGroupCustAndExtraInfo(groupCustAndExtraInfoValue);
	}

	public long getGroupId(String cityId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.getGroupId(cityId);
	}

	public long saveGroupCustomer(IBOCmGroupCustomerValue groupCustomerValue) throws Exception, RemoteException {
		if (null == groupCustomerValue) {
			if (log.isDebugEnabled()) {
				log.error("groupCustomerValue is null!");
			}
			ExceptionUtil.throwBusinessException("CMS0403001", "groupCustomerValue");
		}
		// 获取DAO
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		long groupCustId = groupCustomerValue.getCustId();
		/*
		 * 新增
		 */
		if (groupCustomerValue.isNew() || groupCustomerValue.getCustId() <= 0) {
			if (groupCustId == 0) {
				groupCustId = SNUtil.generatorGroupCustId(groupCustomerValue.getRegionId());
			}
			groupCustomerValue.setCustId(groupCustId);
		}
		/*
		 * 删除数据（逻辑删除）
		 */
		else if (groupCustomerValue.isDeleted()) {
			groupCustomerValue.setStsToOld();
			groupCustomerValue.setState(CmConstants.RecordState.USE);
		}
		grouCustomerDAO.saveGroupCustomer(groupCustomerValue);
		return groupCustId;
	}

	public void saveGroupCustomers(IBOCmGroupCustomerValue[] groupCustomerValues) throws Exception, RemoteException {
		if (null == groupCustomerValues) {
			log.error("groupCustomerValues is null!");
			ExceptionUtil.throwBusinessException("CMS0403001", "groupCustomerValue");
		}
		// 获取DAO
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		for (int i = 0; i < groupCustomerValues.length; i++) {
			groupCustomerValues[i].setCustServiceId(groupCustomerValues[i].getCustServiceId());
		}
		grouCustomerDAO.saveGroupCustomer(groupCustomerValues);
	}

	public long saveGroupExtraInfo(IBOCmGroupExtraInfoValue groupExtraInfoValue) throws Exception, RemoteException {
		if (null == groupExtraInfoValue) {
			log.error("groupExtraInfoValue is null!");
			ExceptionUtil.throwBusinessException("CMS0403001", "groupExtraInfoValue");
		}
		ICmGroupExtraInfoDAO grouExtraInfoDAO = (ICmGroupExtraInfoDAO) ServiceFactory.getService(ICmGroupExtraInfoDAO.class);
		if (groupExtraInfoValue.isDeleted()) {
			groupExtraInfoValue.setStsToOld();
			groupExtraInfoValue.setState(CmConstants.RecordState.ERASE);
		}
		grouExtraInfoDAO.saveGroupExtraInfo(groupExtraInfoValue);
		return groupExtraInfoValue.getGroupCustId();
	}

	public void saveGroupExtraInfos(IBOCmGroupExtraInfoValue[] groupExtraInfoValues) throws Exception, RemoteException {
		if (null == groupExtraInfoValues) {
			log.error("groupExtraInfoValues is null!");
			ExceptionUtil.throwBusinessException("CMS0403001", "groupExtraInfoValue");
		}
		ICmGroupExtraInfoDAO grouExtraInfoDAO = (ICmGroupExtraInfoDAO) ServiceFactory.getService(ICmGroupExtraInfoDAO.class);
		for (int i = 0; i < groupExtraInfoValues.length; i++) {
			if (groupExtraInfoValues[i].isDeleted()) {
				groupExtraInfoValues[i].setStsToOld();
				groupExtraInfoValues[i].setState(CmConstants.RecordState.ERASE);
			}
		}
		grouExtraInfoDAO.saveGroupExtraInfo(groupExtraInfoValues);
	}

	public int queryGroupCustAndExtraInfoCount(String jsonObject) throws Exception, RemoteException {
		Map map = JsonUtil.getMapFromJsObject(jsonObject);
		String queryType = (String) map.get("QUERY_TYPE");
		// 匹配方式 1:精确匹配；2：模糊匹配。
		int matchType = 2;
		if ((String) map.get("MATCH_TYPE") != null) {
			matchType = Integer.valueOf((String) map.get("MATCH_TYPE")).intValue();
		}

		// 处理参数并构造查询条件
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(" 1 = 1 ");
		// 根据客户名称等条件查询
		if (IQBOCmGroupCustAndExtraInfoValue.S_CustName.equals(queryType)) {
			Object custName = map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustName);
			if (custName != null && ((String) custName).length() > 0) {
				// 模糊匹配
				if (matchType == 2) {
					condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" LIKE :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(
							"  ");
					parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustName, "%" + ((String) map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustName)).trim() + "%");
				}
				// 默认使用精确匹配
				else {
					condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName);
					parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustName, ((String) map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustName)).trim());
				}
			}
		}
		// 根据VIP卡号查询
		else if ("VIP_CARD_ID".equals(queryType)) {
			Object vipCard = map.get("VIP_CARD_ID");
			if (vipCard != null) {
				// 优先查询当前地市，在当前地市查不到的情况下，查询其他地市
				String regionId = CenterFactory.getCenterInfo().getRegion();
				if (queryGroupCustAndExtraInfoByCardCode(vipCard.toString(), regionId) != null) {
					return 1;
				}
				// 查询其他地市有没有VIP卡信息
				IBOBsDistrictValue[] districtValues = CmDistrictUtil.getRegionId(true, false);
				// 循环地市查找
				for (int i = 0; i < districtValues.length; i++) {
					if (regionId.equals(districtValues[i].getRegionId())) {
						continue;
					}
					if (queryGroupCustAndExtraInfoByCardCode(vipCard.toString(), districtValues[i].getRegionId()) != null) {
						return 1;
					}
				}
			}
			return 0;
		}
		// 根据产品计费号查询
		else if ("BILL_ID".equals(queryType)) {
			/*
			 * Object billId = map.get("BILL_ID"); ICrm2CustFSV custFSV = (ICrm2CustFSV)
			 * ServiceFactory.getService(ICrm2CustFSV.class); if (billId != null) { long groupCustId =
			 * custFSV.queryGroupCustIdsByBillId(billId.toString(), null); if (groupCustId > 0) {
			 * IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfo = queryGroupCustAndExtraInfoById(groupCustId);
			 * return groupCustAndExtraInfo == null ? 0 : 1; } } return 0;
			 */
		}
		// 根据订购标识号查询
		else if ("USER_ID".equals(queryType)) {
			/*
			 * Object userId = map.get("USER_ID"); ICrm2CustFSV custFSV = (ICrm2CustFSV)
			 * ServiceFactory.getService(ICrm2CustFSV.class); if (userId != null &&
			 * CmCommonUtil.isNum(userId.toString())) { long groupCustId = 0; try { groupCustId =
			 * custFSV.queryGroupCustIdsByOrderId(userId.toString(), null); } catch (Exception e) { return 0; } if
			 * (groupCustId > 0) { IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfo =
			 * queryGroupCustAndExtraInfoById(groupCustId); return groupCustAndExtraInfo == null ? 0 : 1; } } return 0;
			 */
		}
		// 根据账户查询
		else if ("ACCT_ID".equals(queryType)) {
			Object acctId = map.get("ACCT_ID");
			if (acctId != null) {
				condition.append(" AND EXISTS ").append(" (SELECT D.GROUP_CUST_ID FROM CMX_GROUP_ACCOUNT D WHERE D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U'  AND  D.ACCT_ID ")
						.append(" = :acctId )");
				parameters.put("acctId", Long.valueOf(String.valueOf(acctId)));
			}
		}
		// 根据集团地址查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_CustAddress.equals(queryType)) {
			Object custAddress = map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress);
			if (custAddress != null && ((String) custAddress).length() > 0) {
				// 模糊匹配
				if (matchType == 2) {
					condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress).append(" LIKE :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress)
							.append("  ");
					parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustAddress, "%" + map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress) + "%");
				}
				// 默认使用精确匹配
				else {
					condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress);
					parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustAddress, map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress));
				}
			}
		}
		// 根据关键人物查询
		else if ("KERNEL_NAME".equals(queryType)) {
			Object kernelName = map.get("KERNEL_NAME");
			if (kernelName != null && ((String) kernelName).length() > 0) {
				// 模糊匹配
				if (matchType == 2) {
					condition.append(" AND EXISTS ").append(
							" (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEY_MEMBER D WHERE D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U'  AND  D.MEMBER_NAME ").append(
							" LIKE :kernelName    )");
					parameters.put("kernelName", kernelName + "%");
				}
				// 默认使用精确匹配
				else {
					condition.append(" AND EXISTS ").append(
							" (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEY_MEMBER D WHERE D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U'  AND  D.MEMBER_NAME ")
							.append(" = :kernelName )");
					parameters.put("kernelName", kernelName);
				}
			}
		}
		// 根据联系人查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_ContName.equals(queryType)) {
			Object contName = map.get(IQBOCmGroupCustAndExtraInfoValue.S_ContName);
			if (contName != null && ((String) contName).length() > 0) {
				// 模糊匹配
				if (matchType == 2) {
					condition
							.append(" AND EXISTS ")
							.append(
									" (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEY_MEMBER D,CM_GROUP_KEYMEM_BILL E WHERE D.KERNEL_ID =E.KERNEL_ID  AND D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U' AND E.STATE='U'  AND E.KERNEL_TYPE =1  AND D.MEMBER_NAME ")
							.append(" LIKE :contName    )");
					parameters.put("contName", contName + "%");
				}
				// 默认使用精确匹配
				else {
					condition
							.append(" AND EXISTS ")
							.append(
									" (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEY_MEMBER D,CM_GROUP_KEYMEM_BILL E WHERE D.KERNEL_ID =E.KERNEL_ID AND D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U' AND E.STATE='U'  AND D.KERNEL_TYPE =1  AND D.MEMBER_NAME ")
							.append(" = :contName    )");
					parameters.put("contName", contName);
				}
			}
		}
		// 联系方式查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_ContPhone1.equals(queryType)) {
			Object contPhone = map.get("CONT_PHONE");
			if (contPhone != null && ((String) contPhone).length() > 0) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(
						" IN (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEYMEM_BILL D WHERE D.STATE = 'U'  AND D.BILL_ID ").append("= :billId   UNION  ");
				condition.append(" SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_MEM_USER D WHERE D.STATE = 'U'  AND D.BILL_ID ").append("= :billId  )");
				parameters.put("billId", contPhone);
			}
		}
		// 根据省级集团查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType.equals(queryType)) {
			if (map.get(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType).toString().trim().length() != 0
					&& !"-1".equals(map.get(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType))) {
				// 默认使用精确匹配
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType);
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType, Long.valueOf(map.get(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType).toString()));
			}
		}
		// 根据集团编号查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_GroupId.equals(queryType)) {
			if (map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupId) != null && map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupId).toString().length() > 0) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupId).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupId);
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_GroupId, Long.valueOf(map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupId).toString()));
			}
		}
		// 根据客户编号查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId.equals(queryType)) {
			if (map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId) != null && map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).toString().length() > 0) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId);
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId, Long.valueOf(map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).toString()));
			}
		}
		// 根据产品查询
		else if ("PRODUCT".equals(queryType)) {
			/*
			 * ICrm2CustFSV custFSV = (ICrm2CustFSV) ServiceFactory.getService(ICrm2CustFSV.class); String productType =
			 * (String) map.get("PRODUCT_TYPE"); String productId = (String) map.get("PRODUCT_ID"); String packageId =
			 * (String) map.get("COMBO_ID"); String chnlCityForm = (String) map.get("CHNL_CITY_ID"); String
			 * chnlRegionTypeForm = (String) map.get("CHNL_REGION_TYPE"); long[] groupCustIds = null; try { groupCustIds =
			 * custFSV.queryGroupCustIdsByCdn(productType, productId, packageId, Integer.valueOf(
			 * chnlCityForm).intValue(), chnlRegionTypeForm, -1, -1); } catch (Exception e) { return 0; } return
			 * groupCustIds.length;
			 */
		}
		// 根据普通成员号码查询
		else if ("GROUP_NORMAL_MEMBER".equals(queryType)) {
			/*
			 * String normalMemberBillId = (String) map.get("GROUP_NORMAL_MEMBER"); ICrm2CustFSV custFSV =
			 * (ICrm2CustFSV) ServiceFactory.getService(ICrm2CustFSV.class); long[] groupCustIds; try { groupCustIds =
			 * custFSV.queryGroupInfoByGroupMemberBillId(normalMemberBillId, -1, -1); } catch (Exception e) { return 0; }
			 * return groupCustIds.length;
			 */
		}
		// 根据PBX专线成员号码查询
		else if ("GROUP_PBX_MEMBER".equals(queryType)) {
			/*
			 * String pbxMemberBillId = (String) map.get("GROUP_PBX_MEMBER"); ICrm2CustFSV custFSV = (ICrm2CustFSV)
			 * ServiceFactory.getService(ICrm2CustFSV.class); long[] groupCustIds; try { groupCustIds =
			 * custFSV.queryGroupInfoByPBXBillId(pbxMemberBillId, -1, -1); } catch (Exception e) { return 0; } return
			 * groupCustIds.length;
			 */
		}
		for (java.util.Iterator cc = map.entrySet().iterator(); cc.hasNext();) {
			Map.Entry e = (Map.Entry) cc.next();
			// 如果是空或者-1,0，或上面已经处理的就不管。
			if (org.apache.commons.lang.StringUtils.isBlank(e.getValue().toString()) || e.getValue().toString().trim().equals("-1")) {
				continue;
			}
			for (int i = 0; i < NOT_CONDITION_FIELD.length; i++) {
				if (NOT_CONDITION_FIELD[i].equalsIgnoreCase(e.getKey().toString())) {
					break;
				}
			}
			// 创建日期从···到···
			if (e.getKey().toString().equals("FROM_DATE")) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CreateDate).append(" >= :p_").append(e.getKey().toString());
				parameters.put("p_" + e.getKey().toString(), TimeUtil.convertStringToDate(e.getValue().toString(), "yyyy-MM-dd"));
				continue;
			}
			if (e.getKey().toString().equals("TO_DATE")) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CreateDate).append(" <= :p_").append(e.getKey().toString());
				parameters.put("p_" + e.getKey().toString(), TimeUtil.convertStringToDate(e.getValue().toString(), "yyyy-MM-dd"));
				continue;
			}
			condition.append(" AND ").append(e.getKey().toString() + " = :p_" + e.getKey().toString());
			parameters.put("p_" + e.getKey().toString(), e.getValue());
		}
		// 地市
		String chnlCityForm = (String) map.get("CHNL_CITY_ID_FORM");
		if (!StringUtils.isEmptyString(chnlCityForm) && !"-1".equals(chnlCityForm.trim())) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_ChnlCityId).append(" = :chnlCityForm");
			parameters.put("chnlCityForm", chnlCityForm.trim());
		}
		// 县市
		String chnlRegionTypeForm = (String) map.get("CHNL_REGION_TYPE_FORM");
		if (!StringUtils.isEmptyString(chnlRegionTypeForm) && !"-1".equals(chnlRegionTypeForm.trim())) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_ChnlRegionType).append(" = :chnlRegionTypeForm");
			parameters.put("chnlRegionTypeForm", chnlRegionTypeForm.trim());
		}
		// 片区
		String chnlRegionDetailForm = (String) map.get("CHNL_REGION_DETAIL_FORM");
		if (!StringUtils.isEmptyString(chnlRegionDetailForm) && !"-1".equals(chnlRegionDetailForm.trim())) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_ChnlRegionDetail).append(" = :chnlRegionDetailForm");
			parameters.put("chnlRegionDetailForm", chnlRegionDetailForm.trim());
		}
		// 客户经理ID
		String managerId = (String) map.get("MANAGER_ID_FORM");
		if (managerId != null && !"-1".equals(managerId.trim())) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(
					" IN (SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_MGR_REL D WHERE D.STATE = 'U' AND D.MGR_ID ").append(" = :mgrId    )");
			parameters.put("mgrId", Long.valueOf(managerId));
		}
		// 客户经理类型
		String managerType = (String) map.get("MANAGER_TYPE");
		if (managerType != null && !"-1".equals(managerType)) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(
					" IN (SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_MGR_REL D,CMX_MANAGER E WHERE E.STAFF_ID = D.MGR_ID AND E.STATE = 1 AND  D.STATE = 'U' AND E.MANAGER_TYPE ")
					.append(" = :managerType    )");
			parameters.put("managerType", Long.valueOf(managerType));
		}
		// 没有存在客户经理的条件 IS_NOT_MANAGER = 1 不存在客户经理
		String isNotManager = (String) map.get("IS_NOT_MANAGER");
		if (isNotManager != null && "1".equals(isNotManager.trim())) {
			condition.append(" AND ").append(" NOT EXISTS (SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_MGR_REL D WHERE D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID )");
		}
		// VPMN编号
		String vpmn = (String) map.get("VPMN_CUST_ID");
		if (vpmn != null && vpmn.trim().length() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_VpmnCustId).append(" = :vpmn");
			parameters.put("vpmn", vpmn);
		}
		String contactInput = (String) map.get("CONTACT_CONTENT_INPUT");
		String isContract = (String) map.get("IS_CONTRACT");
		if ((contactInput != null && !"-1".equals(contactInput)) || (isContract != null && !"-1".equals(isContract))) {
			// 有合同附件
			if (isContract != null && "1".equals(isContract)) {
				condition.append(" AND EXISTS ").append(
						" ( SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_CONTRACT D WHERE D.AFFIXPATH IS NOT NULL AND D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID ) ");
			}
			// 无合同附件
			else if (isContract != null && "0".equals(isContract)) {
				condition.append(" AND NOT EXISTS ").append(
						" ( SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_CONTRACT D WHERE D.AFFIXPATH IS NULL  AND  D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID ) ");
			}
			// 有合同录入
			if (contactInput != null && ("1".equals(contactInput))) {
				condition.append(" AND EXISTS ").append(" ( SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_CONTRACT D WHERE D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID ) ");
			}
			// 无合同录入
			else if (contactInput != null && ("0".equals(contactInput))) {
				condition.append(" AND NOT EXISTS ").append(" ( SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_CONTRACT D WHERE D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID) ");
			}
		}
		// ==========================================提供给外部接口使用开始=====================================================
		List groupIdsList = (List) map.get("GROUPIDS");
		String saGroupRelaFlag = (String) map.get("SAGROUPRELAFLAG");
		// 当IN中
		if (Integer.valueOf(saGroupRelaFlag.toString()).intValue() == 1 && !(groupIdsList.isEmpty())) {
			String[] groupIds = (String[]) groupIdsList.toArray(new String[] {});
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" IN (");
			for (int i = 0; i < groupIds.length; i++) {
				if (i == 0) {
					condition.append(String.valueOf(groupIds[i]));
					continue;
				}
				condition.append(",").append(String.valueOf(groupIds[i]));
			}
			condition.append(")");
		}
		// NOT IN 集团ID列表
		else if (Integer.valueOf(saGroupRelaFlag.toString()).intValue() == 2 && !(groupIdsList.isEmpty())) {
			String[] groupIds = (String[]) groupIdsList.toArray(new String[] {});
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" NOT IN (");
			for (int i = 0; i < groupIds.length; i++) {
				if (i == 0) {
					condition.append(String.valueOf(groupIds[i]));
					continue;
				}
				condition.append(",").append(String.valueOf(groupIds[i]));
			}
			condition.append(")");
		}
		// 集团合同是否录入
		String contactContentInput = (String) map.get("CONTACTCONTENTINPUT");
		if (contactContentInput != null && ("1".equals(contactContentInput))) {
			condition.append(" AND ").append(" ( SELECT COUNT(*) FROM CM_GROUP_CUST_CONTRACT D WHERE D.GROUP_CUST_ID = CUST_ID  AND  D.STATE = 'U'  ) > 0");
		} else if (contactContentInput != null && ("2".equals(contactContentInput))) {
			condition.append(" AND ").append(" ( SELECT COUNT(*) FROM CM_GROUP_CUST_CONTRACT D WHERE D.GROUP_CUST_ID = CUST_ID  AND  D.STATE = 'U'  ) = 0");
		}
		// 批量查询集团级别
		List groupLevels = (List) map.get("GROUPLEVELS");
		if (!groupLevels.isEmpty()) {
			String[] groupLevel = (String[]) groupLevels.toArray(new String[] {});
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustLevel).append(" IN (");
			for (int i = 0; i < groupLevel.length; i++) {
				if (i == 0) {
					condition.append(String.valueOf(groupLevel[i]));
					continue;
				}
				condition.append(",").append(String.valueOf(groupLevel[i]));
			}
			condition.append(")");
		}
		// ==========================================提供给外部接口使用结束=====================================================
		condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_State).append(" = :state ");
		parameters.put("state", CmConstants.RecordState.USE);
		return queryGroupCustomerAndExtraInfoCount(condition.toString(), parameters);
	}

	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfos(String jsonObject, int startIndex, int endIndex) throws Exception, RemoteException {
		Map map = JsonUtil.getMapFromJsObject(jsonObject);
		String queryType = (String) map.get("QUERY_TYPE");
		// 匹配方式 1:精确匹配；2：模糊匹配。
		int matchType = 2;
		if ((String) map.get("MATCH_TYPE") != null) {
			matchType = Integer.valueOf((String) map.get("MATCH_TYPE")).intValue();
		}
		// 处理参数并构造查询条件

		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append(" 1 = 1 ");
		// 根据客户名称等条件查询
		if (IQBOCmGroupCustAndExtraInfoValue.S_CustName.equals(queryType)) {
			Object custName = map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustName);
			if (custName != null && ((String) custName).length() > 0) {
				// 模糊匹配
				if (matchType == 2) {
					condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" LIKE :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(
							"  ");
					parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustName, "%" + ((String) map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustName)).trim() + "%");
				}
				// 默认使用精确匹配
				else {
					condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName);
					parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustName, ((String) map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustName)).trim());
				}
			}
		}
		// 根据VIP卡号查询
		else if ("VIP_CARD_ID".equals(queryType)) {
			Object vipCard = map.get("VIP_CARD_ID");
			if (vipCard != null) {
				// 优先查询当前地市，在当前地市查不到的情况下，查询其他地市
				String regionId = CenterFactory.getCenterInfo().getRegion();
				IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfo = queryGroupCustAndExtraInfoByCardCode(vipCard.toString(), regionId);
				if (groupCustAndExtraInfo != null) {
					return new IQBOCmGroupCustAndExtraInfoValue[] { groupCustAndExtraInfo };
				}
				// 查询其他地市有没有VIP卡信息
				IBOBsDistrictValue[] districtValues = CmDistrictUtil.getRegionId(true, false);
				// 循环地市查找
				for (int i = 0; i < districtValues.length; i++) {
					if (regionId.equals(districtValues[i].getRegionId())) {
						continue;
					}
					groupCustAndExtraInfo = queryGroupCustAndExtraInfoByCardCode(vipCard.toString(), districtValues[i].getRegionId());
					if (groupCustAndExtraInfo != null) {
						return new IQBOCmGroupCustAndExtraInfoValue[] { groupCustAndExtraInfo };
					}
				}
			}
			return new IQBOCmGroupCustAndExtraInfoValue[0];
		}
		// 根据产品计费号查询
		else if ("BILL_ID".equals(queryType)) {
			/*
			 * Object billId = map.get("BILL_ID"); ICrm2CustFSV custFSV = (ICrm2CustFSV)
			 * ServiceFactory.getService(ICrm2CustFSV.class); if (billId != null) { long groupCustId =
			 * custFSV.queryGroupCustIdsByBillId(billId.toString(), null); if (groupCustId > 0) {
			 * IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfo = queryGroupCustAndExtraInfoById(groupCustId);
			 * return groupCustAndExtraInfo != null ? new IQBOCmGroupCustAndExtraInfoValue[] { groupCustAndExtraInfo } :
			 * new IQBOCmGroupCustAndExtraInfoValue[0]; } } return new IQBOCmGroupCustAndExtraInfoValue[0];
			 */
		}
		// 根据订购标识号查询
		else if ("USER_ID".equals(queryType)) {
			/*
			 * Object userId = map.get("USER_ID"); ICrm2CustFSV custFSV = (ICrm2CustFSV)
			 * ServiceFactory.getService(ICrm2CustFSV.class); if (userId != null &&
			 * CmCommonUtil.isNum(userId.toString())) { long groupCustId = 0; try { groupCustId =
			 * custFSV.queryGroupCustIdsByOrderId(userId.toString(), null); } catch (Exception e) { return new
			 * IQBOCmGroupCustAndExtraInfoValue[0]; } if (groupCustId > 0) { IQBOCmGroupCustAndExtraInfoValue
			 * groupCustAndExtraInfo = queryGroupCustAndExtraInfoById(groupCustId); return groupCustAndExtraInfo != null ?
			 * new IQBOCmGroupCustAndExtraInfoValue[] { groupCustAndExtraInfo } : new
			 * IQBOCmGroupCustAndExtraInfoValue[0]; } } return new IQBOCmGroupCustAndExtraInfoValue[0];
			 */
		}
		// 根据账户ID查询
		else if ("ACCT_ID".equals(queryType)) {
			Object acctId = map.get("ACCT_ID");
			if (acctId != null) {
				condition.append(" AND EXISTS ").append(" (SELECT D.GROUP_CUST_ID FROM CMX_GROUP_ACCOUNT D WHERE D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U'  AND  D.ACCT_ID ")
						.append(" = :acctId )");
				parameters.put("acctId", Long.valueOf(String.valueOf(acctId)));
			}
		}
		// 根据集团地址查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_CustAddress.equals(queryType)) {
			Object custAddress = map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress);
			if (custAddress != null && ((String) custAddress).length() > 0) {
				// 模糊匹配
				if (matchType == 2) {
					condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress).append(" LIKE :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress)
							.append("  ");
					parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustAddress, "%" + map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress) + "%");
				}
				// 默认使用精确匹配
				else {
					condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress);
					parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustAddress, map.get(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress));
				}
			}
		}
		// 根据关键人物名称查询
		else if ("KERNEL_NAME".equals(queryType)) {
			Object kernelName = map.get("KERNEL_NAME");
			if (kernelName != null && ((String) kernelName).length() > 0) {
				// 模糊匹配
				if (matchType == 2) {
					condition.append(" AND EXISTS ").append(
							" (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEY_MEMBER D WHERE D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U'  AND  D.MEMBER_NAME ").append(
							" LIKE :kernelName    )");
					parameters.put("kernelName", kernelName + "%");
				}
				// 默认使用精确匹配
				else {
					condition.append(" AND EXISTS ").append(
							" (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEY_MEMBER D WHERE D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U'  AND  D.MEMBER_NAME ")
							.append(" = :kernelName )");
					parameters.put("kernelName", kernelName);
				}
			}
		}
		// 根据联系人名称查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_ContName.equals(queryType)) {
			Object contName = map.get(IQBOCmGroupCustAndExtraInfoValue.S_ContName);
			if (contName != null && ((String) contName).length() > 0) {
				// 模糊匹配
				if (matchType == 2) {
					condition
							.append(" AND EXISTS ")
							.append(
									" (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEY_MEMBER D,CM_GROUP_KEYMEM_BILL E WHERE D.KERNEL_ID =E.KERNEL_ID  AND D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U' AND E.STATE='U'  AND E.KERNEL_TYPE =1  AND D.MEMBER_NAME ")
							.append(" LIKE :contName    )");
					parameters.put("contName", contName + "%");
				}
				// 默认使用精确匹配
				else {
					condition
							.append(" AND EXISTS ")
							.append(
									" (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEY_MEMBER D,CM_GROUP_KEYMEM_BILL E WHERE D.KERNEL_ID =E.KERNEL_ID AND D.GROUP_CUST_ID = CUST_ID AND D.STATE = 'U' AND E.STATE='U'  AND D.KERNEL_TYPE =1  AND D.MEMBER_NAME ")
							.append(" = :contName    )");
					parameters.put("contName", contName);
				}
			}
		}
		// 联系电话查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_ContPhone1.equals(queryType)) {
			Object contPhone = map.get("CONT_PHONE");
			if (contPhone != null && ((String) contPhone).length() > 0) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(
						" IN (SELECT D.GROUP_CUST_ID FROM CM_GROUP_KEYMEM_BILL D WHERE D.STATE = 'U'  AND D.BILL_ID ").append("= :billId   UNION  ");
				condition.append(" SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_MEM_USER D WHERE D.STATE = 'U'  AND D.BILL_ID ").append("= :billId  )");
				parameters.put("billId", contPhone);
			}
		} else if (IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType.equals(queryType)) {
			if (map.get(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType).toString().trim().length() != 0
					&& !"-1".equals(map.get(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType).toString())) {
				// 默认使用精确匹配
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType);
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType, Long.valueOf(map.get(IQBOCmGroupCustAndExtraInfoValue.S_ProvGroupType).toString()));
			}
		}
		// 根据客户编号查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId.equals(queryType)) {
			if (map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId) != null && map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).toString().length() > 0) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId);
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId, Long.valueOf(map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).toString()));
			}
		}
		// 根据集团编号查询
		else if (IQBOCmGroupCustAndExtraInfoValue.S_GroupId.equals(queryType)) {
			if (map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupId) != null && map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupId).toString().length() > 0) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupId).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupId);
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_GroupId, Long.valueOf(map.get(IQBOCmGroupCustAndExtraInfoValue.S_GroupId).toString()));
			}
		}
		// 根据产品查询
		else if ("PRODUCT".equals(queryType)) {
			/*
			 * ICrm2CustFSV custFSV = (ICrm2CustFSV) ServiceFactory.getService(ICrm2CustFSV.class); String productType =
			 * (String) map.get("PRODUCT_TYPE"); String productId = (String) map.get("PRODUCT_ID"); String packageId =
			 * (String) map.get("COMBO_ID"); String chnlCityForm = (String) map.get("CHNL_CITY_ID"); String
			 * chnlRegionTypeForm = (String) map.get("CHNL_REGION_TYPE"); long[] groupCustIds = null; try { groupCustIds =
			 * custFSV.queryGroupCustIdsByCdn(productType, productId, packageId, Integer.valueOf(
			 * chnlCityForm).intValue(), chnlRegionTypeForm, startIndex, endIndex); } catch (Exception e) { return new
			 * IQBOCmGroupCustAndExtraInfoValue[0]; } if (groupCustIds != null && groupCustIds.length > 0) {
			 * condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" IN ("); for
			 * (int i = 0; i < groupCustIds.length; i++) { if (i == 0 || groupCustIds[i] == 0) {
			 * condition.append(String.valueOf(groupCustIds[i])); continue; }
			 * condition.append(",").append(String.valueOf(groupCustIds[i])); } condition.append(")"); return
			 * queryGroupCustomerAndExtraInfo(condition.toString(), parameters, -1, -1); } else { return new
			 * IQBOCmGroupCustAndExtraInfoValue[0]; }
			 */
		}
		// 根据普通成员号码查询
		else if ("GROUP_NORMAL_MEMBER".equals(queryType)) {
			/*
			 * String normalMemberBillId = (String) map.get("GROUP_NORMAL_MEMBER"); ICrm2CustFSV custFSV =
			 * (ICrm2CustFSV) ServiceFactory.getService(ICrm2CustFSV.class); long[] groupCustIds; try { groupCustIds =
			 * custFSV.queryGroupInfoByGroupMemberBillId(normalMemberBillId, -1, -1); } catch (Exception e) { return new
			 * IQBOCmGroupCustAndExtraInfoValue[0]; } if (groupCustIds != null && groupCustIds.length > 0) {
			 * condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" IN ("); for
			 * (int i = 0; i < groupCustIds.length; i++) { if (i == 0) {
			 * condition.append(String.valueOf(groupCustIds[i])); continue; }
			 * condition.append(",").append(String.valueOf(groupCustIds[i])); } condition.append(")"); } else { return
			 * new IQBOCmGroupCustAndExtraInfoValue[0]; }
			 */
		}
		// 根据PBX专线成员号码查询
		else if ("GROUP_PBX_MEMBER".equals(queryType)) {
			/*
			 * String pbxMemberBillId = (String) map.get("GROUP_PBX_MEMBER"); ICrm2CustFSV custFSV = (ICrm2CustFSV)
			 * ServiceFactory.getService(ICrm2CustFSV.class); long[] groupCustIds; try { groupCustIds =
			 * custFSV.queryGroupInfoByPBXBillId(pbxMemberBillId, -1, -1); } catch (Exception e) { return new
			 * IQBOCmGroupCustAndExtraInfoValue[0]; } if (groupCustIds != null && groupCustIds.length > 0) {
			 * condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" IN ("); for
			 * (int i = 0; i < groupCustIds.length; i++) { if (i == 0) {
			 * condition.append(String.valueOf(groupCustIds[i])); continue; }
			 * condition.append(",").append(String.valueOf(groupCustIds[i])); } condition.append(")"); } else { return
			 * new IQBOCmGroupCustAndExtraInfoValue[0]; }
			 */
		}
		 for (java.util.Iterator cc = map.entrySet().iterator(); cc.hasNext();) {
			Map.Entry e = (Map.Entry) cc.next();
			// 如果是空或者-1,0，或上面已经处理的就不管。
			if (org.apache.commons.lang.StringUtils.isBlank(e.getValue().toString()) || e.getValue().toString().trim().equals("-1")) {
				continue;
			}
			for (int i = 0; i < NOT_CONDITION_FIELD.length; i++) {
				if (NOT_CONDITION_FIELD[i].equalsIgnoreCase(e.getKey().toString())) {
					break;
				}
			}
			// 创建日期从···到···
			if (e.getKey().toString().equals("FROM_DATE")) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CreateDate).append(" >= :p_").append(e.getKey().toString());
				parameters.put("p_" + e.getKey().toString(), TimeUtil.convertStringToDate(e.getValue().toString(), "yyyy-MM-dd"));
				continue;
			}
			if (e.getKey().toString().equals("TO_DATE")) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CreateDate).append(" <= :p_").append(e.getKey().toString());
				parameters.put("p_" + e.getKey().toString(), TimeUtil.convertStringToDate(e.getValue().toString(), "yyyy-MM-dd"));
				continue;
			}
			condition.append(" AND ").append(e.getKey().toString() + " = :p_" + e.getKey().toString());
			parameters.put("p_" + e.getKey().toString(), e.getValue());
		}
		// 地市
		String chnlCityForm = (String) map.get("CHNL_CITY_ID_FORM");
		if (!StringUtils.isEmptyString(chnlCityForm) && !"-1".equals(chnlCityForm.trim())) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_ChnlCityId).append(" = :chnlCityForm");
			parameters.put("chnlCityForm", chnlCityForm.trim());
		}
		// 县市
		String chnlRegionTypeForm = (String) map.get("CHNL_REGION_TYPE_FORM");
		if (!StringUtils.isEmptyString(chnlRegionTypeForm) && !"-1".equals(chnlRegionTypeForm.trim())) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_ChnlRegionType).append(" = :chnlRegionTypeForm");
			parameters.put("chnlRegionTypeForm", chnlRegionTypeForm.trim());
		}
		// 片区
		String chnlRegionDetailForm = (String) map.get("CHNL_REGION_DETAIL_FORM");
		if (!StringUtils.isEmptyString(chnlRegionDetailForm) && !"-1".equals(chnlRegionDetailForm.trim())) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_ChnlRegionDetail).append(" = :chnlRegionDetailForm");
			parameters.put("chnlRegionDetailForm", chnlRegionDetailForm.trim());
		}
		// 客户经理ID
		String managerId = (String) map.get("MANAGER_ID_FORM");
		if (managerId != null && !"-1".equals(managerId.trim())) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(
					" IN (SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_MGR_REL D WHERE D.STATE = 'U' AND D.MGR_ID ").append(" = :mgrId    )");
			parameters.put("mgrId", Long.valueOf(managerId));
		}
		// 客户经理类型
		String managerType = (String) map.get("MANAGER_TYPE");
		if (managerType != null && !"-1".equals(managerType)) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(
					" IN (SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_MGR_REL D,CMX_MANAGER E WHERE E.STAFF_ID = D.MGR_ID AND E.STATE = 1 AND D.STATE = 'U' AND E.MANAGER_TYPE ")
					.append(" = :managerType    )");
			parameters.put("managerType", Long.valueOf(managerType));
		}
		// 没有存在客户经理的条件 IS_NOT_MANAGER = 1 不存在客户经理
		String isNotManager = (String) map.get("IS_NOT_MANAGER");
		if (isNotManager != null && "1".equals(isNotManager.trim())) {
			condition.append(" AND ").append(" NOT EXISTS (SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_MGR_REL D WHERE D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID )");
		}
		// VPMN编号
		String vpmn = (String) map.get("VPMN_CUST_ID");
		if (vpmn != null && vpmn.trim().length() > 0) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_VpmnCustId).append(" = :vpmn");
			parameters.put("vpmn", vpmn);
		}
		String contactInput = (String) map.get("CONTACT_CONTENT_INPUT");
		String isContract = (String) map.get("IS_CONTRACT");
		if ((contactInput != null && !"-1".equals(contactInput)) || (isContract != null && !"-1".equals(isContract))) {
			// 有合同附件
			if (isContract != null && "1".equals(isContract)) {
				condition.append(" AND EXISTS ").append(
						" ( SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_CONTRACT D WHERE D.AFFIXPATH IS NOT NULL AND D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID ) ");
			}
			// 无合同附件
			else if (isContract != null && "0".equals(isContract)) {
				condition.append(" AND NOT EXISTS ").append(
						" ( SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_CONTRACT D WHERE D.AFFIXPATH IS NULL  AND  D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID ) ");
			}
			// 有合同录入
			if (contactInput != null && ("1".equals(contactInput))) {
				condition.append(" AND EXISTS ").append(" ( SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_CONTRACT D WHERE D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID ) ");
			}
			// 无合同录入
			else if (contactInput != null && ("0".equals(contactInput))) {
				condition.append(" AND NOT EXISTS ").append(" ( SELECT D.GROUP_CUST_ID FROM CM_GROUP_CUST_CONTRACT D WHERE D.STATE = 'U' AND D.GROUP_CUST_ID = CUST_ID) ");
			}
		}
		// ==========================================提供给外部接口使用开始=====================================================
		// 批量GROUP_ID查询集团
		List groupIdsList = (List) map.get("GROUPIDS");
		String saGroupRelaFlag = (String) map.get("SAGROUPRELAFLAG");
		// 当IN中
		if (Integer.valueOf(saGroupRelaFlag.toString()).intValue() == 1 && !(groupIdsList.isEmpty())) {
			String[] groupIds = (String[]) groupIdsList.toArray(new String[] {});
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupId).append(" IN (");
			for (int i = 0; i < groupIds.length; i++) {
				if (i == 0) {
					condition.append(String.valueOf(groupIds[i]));
					continue;
				}
				condition.append(",").append(String.valueOf(groupIds[i]));
			}
			condition.append(")");
		}
		// NOT IN 集团ID列表
		else if (Integer.valueOf(saGroupRelaFlag.toString()).intValue() == 2 && !(groupIdsList.isEmpty())) {
			String[] groupIds = (String[]) groupIdsList.toArray(new String[] {});
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupId).append(" NOT IN (");
			for (int i = 0; i < groupIds.length; i++) {
				if (i == 0) {
					condition.append(String.valueOf(groupIds[i]));
					continue;
				}
				condition.append(",").append(String.valueOf(groupIds[i]));
			}
			condition.append(")");
		}
		// 集团合同是否录入
		String contactContentInput = (String) map.get("CONTACTCONTENTINPUT");
		if (contactContentInput != null && ("1".equals(contactContentInput))) {
			condition.append(" AND ").append(" ( SELECT COUNT(*) FROM CM_GROUP_CUST_CONTRACT D WHERE D.GROUP_CUST_ID = CUST_ID  AND  D.STATE = 'U'  ) > 0");
		} else if (contactContentInput != null && ("2".equals(contactContentInput))) {
			condition.append(" AND ").append(" ( SELECT COUNT(*) FROM CM_GROUP_CUST_CONTRACT D WHERE D.GROUP_CUST_ID = CUST_ID  AND  D.STATE = 'U'  ) = 0");
		}
		// 批量查询集团级别
		List groupLevels = (List) map.get("GROUPLEVELS");
		if (!groupLevels.isEmpty()) {
			String[] groupLevel = (String[]) groupLevels.toArray(new String[] {});
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustLevel).append(" IN (");
			for (int i = 0; i < groupLevel.length; i++) {
				if (i == 0) {
					condition.append(String.valueOf(groupLevel[i]));
					continue;
				}
				condition.append(",").append(String.valueOf(groupLevel[i]));
			}
			condition.append(")");
		}
		condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_State).append(" = :state ");
		parameters.put("state", CmConstants.RecordState.USE);
		// ==========================================提供给外部接口使用结束=====================================================
		IQBOCmGroupCustAndExtraInfoValue[] results = queryGroupCustomerAndExtraInfo(condition.toString(), parameters, startIndex, endIndex);
		// 写日志（查询集团客户资料）
		/*
		 * ICmBusiLogSV logSV = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class); logSV.log(null,
		 * CmBusinessOperation.GROUP_CUSTOMER_QUERY, condition.toString());
		 */
		return results;
	}

	public DataContainer[] queryGroupCustAndExtraInfosAndManagerInfo(String jsonObject, int startIndex, int endIndex) throws Exception, RemoteException {
		return null;
		/*
		 * Map map = JsonUtil.getMapFromJsObject(jsonObject); String memberBillId = ""; if
		 * ("GROUP_NORMAL_MEMBER".equals((String) map.get("QUERY_TYPE"))) { memberBillId = (String)
		 * map.get("GROUP_NORMAL_MEMBER"); } if ("GROUP_PBX_MEMBER".equals((String) map.get("QUERY_TYPE"))) {
		 * memberBillId = (String) map.get("GROUP_PBX_MEMBER"); } IQBOCmGroupCustAndExtraInfoValue[] results =
		 * queryGroupCustAndExtraInfos(jsonObject, startIndex, endIndex); ICmGroupCustManagerSV groupCustManagerSV =
		 * (ICmGroupCustManagerSV) ServiceFactory .getService(ICmGroupCustManagerSV.class); long[] groupIds = new
		 * long[results.length]; for (int i = 0; i < groupIds.length; i++) { groupIds[i] = results[i].getGroupCustId(); }
		 * DataContainer[] datas = new DataContainer[results.length]; DataContainer data; HashMap managerMap;
		 * IQBOCmGroupCustMgrRelValue[] managers =
		 * groupCustManagerSV.queryGroupCustMgrRelAndMgrInfoByGroupIds(groupIds); IQBOCmGroupKeyMemberUserValue[]
		 * keyMembers = queryGroupCustKeyMemberByGroupCustIds(groupIds); for (int i = 0; i < results.length; i++) {
		 * managerMap = new HashMap(); for (int j = 0; j < managers.length; j++) { // 检索所有的电话经理 if
		 * (managers[j].getRelType() == CmConstants.GroupManagerType.CALL_SVR_MGR && managers[j].getGroupCustId() ==
		 * results[i].getGroupCustId()) { managerMap.put("PHONE_MANAGER", managers[j].getStaffName()); continue; } //
		 * 检索所有的集团客户经理 else if (managers[j].getRelType() == CmConstants.GroupManagerType.CUST_SVR_MGR &&
		 * managers[j].getGroupCustId() == results[i].getGroupCustId()) { managerMap.put("GROUP_MANAGER",
		 * managers[j].getStaffName()); managerMap.put("GROUP_MANAGER_ID", Long.valueOf(managers[j].getStaffId()));
		 * continue; } } // 检索所有的联系人信息 for (int j = 0; j < keyMembers.length; j++) { if (keyMembers[j].getGroupCustId() ==
		 * results[i].getGroupCustId()) { managerMap.put("KERNEL_CONT_NAME", keyMembers[j].getMemberName());
		 * managerMap.put("KERNE_CONT_PHONE", keyMembers[j].getBillId()); } } // 加入查看集团套餐LINK
		 * managerMap.put("QUERY_ORDER_LINK", new StringBuffer().append( "<span class='font_note'><a
		 * href='javascript:void(0)' onclick='queryOrderInfo(").append(i).append(
		 * ")'>").append(CrmLocaleFactory.getResource("CMS1006244")).append("</a></span>"));
		 * managerMap.put("MEMBER_BILL_ID", memberBillId); data = CmCommonUtil.getDataContainers(results[i],
		 * managerMap)[0]; datas[i] = data; } return datas;
		 */
	}

	// 检索所有的联系人信息，一次性拼出所有group_cust_id 数组查出所有的联系人信息
	public IQBOCmGroupKeyMemberUserValue[] queryGroupCustKeyMemberByGroupCustIds(long[] groupCustIds) throws Exception, RemoteException {
		return null;

		/*
		 * ICmGroupMemberSV custMemberSV = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
		 * StringBuffer condition = new StringBuffer(); Map parameters = new HashMap();
		 * condition.append(IQBOCmGroupKeyMemberUserValue.S_MemberState).append("=:memberState");
		 * parameters.put("memberState", CmConstants.RECORD_STATE_USE); condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_UserState).append("=:userState"); parameters.put("userState",
		 * CmConstants.RECORD_STATE_USE); condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_GroupState).append("=:groupState"); parameters.put("groupState",
		 * CmConstants.RECORD_STATE_USE); condition.append(" AND
		 * ").append(IQBOCmGroupKeyMemberUserValue.S_MemberLevel).append("=:contactLevel");
		 * parameters.put("contactLevel", Integer.valueOf(CmConstants.GroupMemberLevel.CONTACT_MEMBER));
		 * condition.append(" AND "); if (groupCustIds != null && groupCustIds.length > 0) { int count = 0; if
		 * (groupCustIds.length >= 1000) { count = groupCustIds.length / 1000 + 1; } for (int m = 0; m < count - 1; m++) {
		 * condition.append(IQBOCmGroupKeyMemberUserValue.S_GroupCustId).append(" IN ("); for (int i = 0; i < 1000; i++) {
		 * if (i == 0) { condition.append(String.valueOf(groupCustIds[i])); continue; }
		 * condition.append(",").append(String.valueOf(groupCustIds[i])); } condition.append(") OR "); }
		 * condition.append(IQBOCmGroupKeyMemberUserValue.S_GroupCustId).append(" IN ("); for (int i = 0; i <
		 * groupCustIds.length % 1000; i++) { if (i == 0) { condition.append(String.valueOf(groupCustIds[i])); continue; }
		 * condition.append(",").append(String.valueOf(groupCustIds[i])); } condition.append(") "); return
		 * custMemberSV.queryQGroupKeyMemberUsers(condition.toString(), parameters, -1, -1); } return new
		 * IQBOCmGroupKeyMemberUserValue[0];
		 */
	}

	public long queryGroupCustomerCount(String custName, long custId) throws Exception, RemoteException {
		ICmGroupCustomerDAO cmGroupCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return cmGroupCustomerDAO.queryGroupCustomerCount(custName, custId);
	}

	public void deleteGroupCustomer(IBOCmGroupCustomerValue groupCustomerValue) throws Exception, RemoteException {
		if (groupCustomerValue != null) {
			ICmGroupCustomerDAO cmGroupCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
			cmGroupCustomerDAO.deleteGroupCustomer(groupCustomerValue);
		}

	}

	public void logonGroupCustomer(long groupCustId) throws Exception, RemoteException {
		/*
		 * IBaseCustomerSV baseCustomerSV = (IBaseCustomerSV) ServiceFactory.getService(IBaseCustomerSV.class);
		 * ICmGroupExtraInfoSV groupExtraInfoSV = (ICmGroupExtraInfoSV)
		 * ServiceFactory.getService(ICmGroupExtraInfoSV.class); ICmGroupInformInfoSV groupInformInfoSV =
		 * (ICmGroupInformInfoSV) ServiceFactory.getService(ICmGroupInformInfoSV.class); ICmGroupCustAttrSV
		 * groupCustAtrrSV = (ICmGroupCustAttrSV) ServiceFactory.getService(ICmGroupCustAttrSV.class);
		 * ICmGroupCustManagerSV groupCustMgrRelSV = (ICmGroupCustManagerSV)
		 * ServiceFactory.getService(ICmGroupCustManagerSV.class); ICmGroupOrgStructSV groupOrgStructSV =
		 * (ICmGroupOrgStructSV) ServiceFactory.getService(ICmGroupOrgStructSV.class); ICmxGroupPrepayProvisionSV
		 * prepayProvisionSV = (ICmxGroupPrepayProvisionSV) ServiceFactory.getService(ICmxGroupPrepayProvisionSV.class);
		 * IAccountSV iAccountSV = (IAccountSV) ServiceFactory.getService(IAccountSV.class); ICmGroupOnceIncomeSV
		 * onceIncomeSV = (ICmGroupOnceIncomeSV) ServiceFactory.getService(ICmGroupOnceIncomeSV.class);
		 * ICmBuildingMemberSV buildingMemberSV = (ICmBuildingMemberSV)
		 * ServiceFactory.getService(ICmBuildingMemberSV.class); ICmGroupMemberSV custMemberSV = (ICmGroupMemberSV)
		 * ServiceFactory.getService(ICmGroupMemberSV.class); IBOCmGroupCustomerValue groupCustomerValue =
		 * queryGroupCustomerById(groupCustId); ICmxGroupAccountSV groupAccountSV = (ICmxGroupAccountSV)
		 * ServiceFactory.getService(ICmxGroupAccountSV.class); // 删除条件：没有集团业务 ICrmFSV crmFsv = (ICrmFSV)
		 * ServiceFactory.getService(ICrmFSV.class); if (crmFsv.getGroupProds(groupCustId)) {
		 * ExceptionUtil.throwBusinessException("CMS1006530"); } // 集团是否下面有账户，有的话无法删除 if (0<groupAccountSV.queryGroupAccountsCount(groupCustId)) {
		 * ExceptionUtil.throwBusinessException("CMS1006531"); } // 判断是否有合同状态为1,2,4的一次性收入 IBOCmxGroupOnceIncomeValue[]
		 * onceIncomes = onceIncomeSV.queryGroupOnceIncomeByGruopCustId(groupCustId); for (int i = 0; i <
		 * onceIncomes.length; i++) { if (onceIncomes[i].getIncomeStatus() == 1 || onceIncomes[i].getIncomeStatus() == 2 ||
		 * onceIncomes[i].getIncomeStatus() == 4) { ExceptionUtil.throwBusinessException("CMS1006532"); } } //
		 * 判断是否有网外，网内集团成员 Map param = new HashMap(); param.put("GROUP_CUST_ID", String.valueOf(groupCustId)); //
		 * 取得网外成员个数 param.put("MEMBER_TYPE", String.valueOf(CmConstants.GroupMember.TYPE_OUT_MEMBER)); int
		 * outMemberCount = custMemberSV.queryQGroupCustMemberUserCountByCdn(CmGroupMemberUtil
		 * .createGroupMemberQryCdn(param)); if (outMemberCount > 0) {
		 * ExceptionUtil.throwBusinessException("CMS1006534"); } // 取得网内成员个数 param.put("MEMBER_TYPE",
		 * String.valueOf(CmConstants.GroupMember.TYPE_INNER_MEMBER)); int inMemberCount =
		 * custMemberSV.queryQGroupCustMemberUserCountByCdn(CmGroupMemberUtil .createGroupMemberQryCdn(param)); if
		 * (inMemberCount > 0) { ExceptionUtil.throwBusinessException("CMS1006533"); } if
		 * (groupOrgStructSV.exsitChildOrgStruct(groupCustId)) { // 集团有子集团无法删除
		 * ExceptionUtil.throwBusinessException("CMS1006058"); } if
		 * (groupOrgStructSV.exsitParentsOrgStruct(groupCustId)) { // 集团有父集团无法删除
		 * ExceptionUtil.throwBusinessException("CMS1006059"); } // 根据关联集团ID,查询是否有关联重点项目集团
		 * IQBOCmGroupCustAndExtraInfoValue[] relGroupCustCustomers =
		 * queryGroupCustAndExtraInfoByRelGroupCustId(groupCustId); if (0 < relGroupCustCustomers.length) {
		 * ExceptionUtil.throwBusinessException("CMS1006550", relGroupCustCustomers[0].getCustName()); } //
		 * ==============add by fengjian 2011-7-16 如果集团拥有CM_ACCOUNT数据的话，不允许删除== if
		 * (iAccountSV.queryAccountsByCustInfo(groupCustId, CmConstants.CustomerType.GROUP).length > 0) {
		 * ExceptionUtil.throwBusinessException("CMS1006531"); } //
		 * ================================================================ //=====add by shitian 2011-8-12
		 * //先同步BOSS，然后在删除集团 // 删除集团同步BOSS ICmGroupCustomerSV groupCustomerSV =
		 * (ICmGroupCustomerSV)ServiceFactory.getService(ICmGroupCustomerSV.class); IQBOCmGroupCustAndExtraInfoValue
		 * groupCustAndExtraInfoValue = groupCustomerSV.queryGroupCustAndExtraInfoById(groupCustId);
		 * setDataValue(groupCustAndExtraInfoValue, CmConstants.IUcm2Crm.STATE_DEL); //=====add end // //删除条件：子集团 //
		 * 删除集团结构信息 IBOCmGroupOrgStructValue groupOrgStruct =
		 * groupOrgStructSV.queryGroupOrgStructByGroupId(groupCustId);
		 * groupOrgStructSV.deleteGroupOrgStruct(groupOrgStruct); // 删除集团客户基础信息 deleteGroupCustomer(groupCustomerValue); //
		 * 删除基础客户实体对象 IBOCmBaseCustomerValue baseCustomerValue = baseCustomerSV.queryBaseCustomerById(groupCustomerValue
		 * .getBaseCustId()); baseCustomerValue.delete(); baseCustomerSV.saveBaseCustomer(baseCustomerValue); //
		 * 删除集团与归属地关系表 IBOCmCustBaseRelValue[] custBaseRelValues =
		 * baseCustomerSV.queryCustBaseRel(baseCustomerValue.getBaseCustId(), CmConstants.CustomerType.GROUP,
		 * groupCustomerValue.getGroupCustId(), groupCustomerValue.getRegionId(), -1, -1); if (custBaseRelValues != null &&
		 * custBaseRelValues.length > 0) { custBaseRelValues[0].delete();
		 * baseCustomerSV.saveCustBaseRel(custBaseRelValues[0]); } // 删除集团客户成员信息 param.clear();
		 * param.put("GROUP_CUST_ID", String.valueOf(groupCustId)); IQBOCmGroupCustMemberUserValue[] custMembers =
		 * custMemberSV.queryQGroupCustMemberUsersByCdn(CmGroupMemberUtil .createGroupMemberQryCdn(param), -1, -1); for
		 * (int i = 0; i < custMembers.length; i++) { custMembers[i].delete(); }
		 * custMemberSV.saveQGroupCustMemberUsers(custMembers); // 删除集团客户附加信息 IBOCmGroupExtraInfoValue groupExtraInfo =
		 * groupExtraInfoSV.getGroupExtraInfoById(groupCustId); groupExtraInfoSV.deleteGroupExtraInfo(groupExtraInfo); //
		 * 删除政企信息化信息表 IBOCmGroupInformInfoValue[] groupInformInfos =
		 * groupInformInfoSV.queryGroupInformInfosById(groupCustId); if (groupInformInfos != null) {
		 * groupInformInfoSV.deleteGroupInformInfo(groupInformInfos); } // 删除政企扩展信息表 IBOCmGroupCustAttrValue[]
		 * groupCustAttrs = groupCustAtrrSV.queryGroupCustAttrsByGroupId(groupCustId); if (groupCustAttrs != null) {
		 * groupCustAtrrSV.deleteGroupCustAttr(groupCustAttrs); } // 删除客户与客户经理关系对象 IBOCmGroupCustMgrRelValue[]
		 * groupCustMgrRels = groupCustMgrRelSV .queryGroupCustMgrRelsByGroupCustId(groupCustId); if (groupCustMgrRels !=
		 * null) { groupCustMgrRelSV.deleteGroupCustMgrRels(groupCustMgrRels); } // 删除集团黑名单信息
		 * IBOCmxGroupPrepayBlackInfoValue[] prepayBlackInfos = prepayProvisionSV
		 * .queryGroupPrepayBlackInfoValueByGroupCustId(groupCustId, -1, -1); for (int i = 0; i <
		 * prepayBlackInfos.length; i++) { prepayBlackInfos[i].setStsToOld();
		 * prepayBlackInfos[i].setState(CmConstants.RECORD_STATE_DEL); }
		 * prepayProvisionSV.saveGroupPrepayBlackInfos(prepayBlackInfos); // 删除集团预付费信息 IBOCmxGroupPrepayProvisionValue[]
		 * prepayProvisions = prepayProvisionSV.queryGroupPrepayProvisionByGroupCustId( groupCustId, -1, -1); for (int i =
		 * 0; i < prepayProvisions.length; i++) { prepayProvisions[i].setStsToOld();
		 * prepayProvisions[i].setState(CmConstants.RECORD_STATE_DEL); }
		 * prepayProvisionSV.saveGroupPrepayProvisions(prepayProvisions); // 删除一次性收入 for (int i = 0; i <
		 * onceIncomes.length; i++) { onceIncomes[i].setState(CmConstants.RECORD_STATE_DEL);
		 * onceIncomes[i].setStsToOld(); // 删除一次性明细 IBOCmxGroupOnceIncomeDetailValue[] onceIncomeDetails = onceIncomeSV
		 * .queryGroupOnceIncomeDetailsByOnceIncomeId(onceIncomes[i].getOnceIncomeId()); for (int j = 0; j <
		 * onceIncomeDetails.length; j++) { onceIncomeDetails[j].setStsToOld();
		 * onceIncomeDetails[j].setState(CmConstants.RECORD_STATE_DEL); }
		 * onceIncomeSV.saveGroupOnceIncomeDetails(onceIncomeDetails); // 删除集团计费号 IBOCmxGroupOnceIncomeBillValue[]
		 * onceIncomeBills = onceIncomeSV.queryGroupOnceIncomeBillByOnceIncomeId( onceIncomes[i].getOnceIncomeId(), -1,
		 * -1); for (int j = 0; j < onceIncomeBills.length; j++) { onceIncomeBills[j].setStsToOld();
		 * onceIncomeBills[j].setState(CmConstants.RECORD_STATE_DEL); }
		 * onceIncomeSV.saveGroupOnceIncomeBills(onceIncomeBills); } onceIncomeSV.saveGroupOnceIncomes(onceIncomes); //
		 * 删除关键人物 param.clear(); param.put("GROUP_CUST_ID", String.valueOf(groupCustId));
		 * IQBOCmGroupKeyMemberUserValue[] custKeyMembers =
		 * custMemberSV.queryQGroupKeyMemberUsersByCdn(CmGroupMemberUtil .createGroupMemberQryCdn(param), -1, -1); for
		 * (int i = 0; i < custKeyMembers.length; i++) { custKeyMembers[i].delete(); } if (custKeyMembers.length > 0) {
		 * custMemberSV.saveQGroupKeyMemberUsers(custKeyMembers); } // 删除集团楼宇信息 IBOCmBuildMemberValue[] buildingMembers =
		 * buildingMemberSV.queryBuildMembersById(-1, groupCustId); buildingMemberSV.saveBuildMembers(buildingMembers);
		 */

	}

	public IQBOCmSubGroupCustomerValue[] querySubGroupCustomersByGroupId(long groupId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.querySubGroupCustomersByGroupId(groupId);
	}

	public long createGroupCustomerAndExtraInfoAndMgr(IQBOCmGroupCustAndExtraInfoValue groupCustomer, IBOCmGroupCustMgrRelValue groupCustMgrRel) throws Exception, RemoteException {
		/*
		 * String recommendPersonId = ""; if(groupCustomer.getDevelopType()==2){ //片区经理编号为20位字符串，无法保存 recommendPersonId =
		 * String.valueOf(groupCustomer.getPartnerId()); groupCustomer.setPartnerId(-1); } long groupId =
		 * createGroupCustomerAndExtraInfo(groupCustomer); // 当客户经理没有选择的场合 if (groupCustMgrRel.getMgrId() != -1) {
		 * ICmGroupCustManagerSV groupCustMgrRelSV = (ICmGroupCustManagerSV) ServiceFactory
		 * .getService(ICmGroupCustManagerSV.class); groupCustMgrRel.setGroupCustId(groupCustomer.getGroupCustId()); //
		 * 默认值 groupCustMgrRel.setOperType(1); groupCustMgrRel.setRelType(1);
		 * groupCustMgrRel.setRegionId(groupCustomer.getRegionId());
		 * groupCustMgrRel.setState(CmConstants.RECORD_STATE_USE);
		 * groupCustMgrRelSV.saveGroupCustMgrRel(groupCustMgrRel); } if(groupCustomer.getDevelopType()==2){
		 * IBOOrdxRecommendInfoValue ordxReCmdInfo = new BOOrdxRecommendInfoBean(); IOrdxRecmdInfoSV ordRec =
		 * (IOrdxRecmdInfoSV) ServiceFactory.getService(IOrdxRecmdInfoSV.class); IZJBbossSoVMInvokeSV bbossSV =
		 * (IZJBbossSoVMInvokeSV) ServiceFactory.getService(IZJBbossSoVMInvokeSV.class);
		 * ordxReCmdInfo.setRegionId(groupCustomer.getRegionId());
		 * ordxReCmdInfo.setUserRegionId(groupCustomer.getRegionId());
		 * ordxReCmdInfo.setGroupCustId(groupCustomer.getGroupCustId()); ordxReCmdInfo.setUserId(-1);
		 * ordxReCmdInfo.setOfferInsId(-1); ordxReCmdInfo.setOfferId(-1);
		 * ordxReCmdInfo.setCustomerOrderId(groupCustomer.getGroupCustId());
		 * ordxReCmdInfo.setRecommendPersonId(recommendPersonId); IBOCmGroupCustomerValue
		 * groupCustomerQ=queryGroupCustomerById(groupCustomer.getGroupCustId()); if(groupCustomerQ!=null){
		 * ordxReCmdInfo.setDoneCode(groupCustomerQ.getDoneCode());
		 * ordxReCmdInfo.setDoneDate(groupCustomerQ.getDoneDate());
		 * ordxReCmdInfo.setCreateDate(groupCustomerQ.getDoneDate()); ordxReCmdInfo.setOpId(groupCustomerQ.getOpId());
		 * ordxReCmdInfo.setOrgId(groupCustomerQ.getOrgId());
		 * ordRec.saveOrdxReCmdInfo4Process(ordxReCmdInfo,groupCustomer.getRegionId());
		 * bbossSV.sendMess4Recommend(ordxReCmdInfo,groupCustomer.getGroupCustId(),"集团客户新建"); } } // 返回新增集团客户ID return
		 * groupId;
		 */
		return 0L;
	}

	public long createGroupCustomerAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue) throws Exception, RemoteException {
		/*
		 * if (groupCustAndExtraInfoValue == null) { if (log.isInfoEnabled()) { log.info("condition cmGroupCustAttrs
		 * error!"); ExceptionUtil.throwBusinessException("CMS0000129"); } } // 校验
		 * groupCustomerAndExtraInfoValidate(groupCustAndExtraInfoValue); // 首先判断是否存在基础客户 IBaseCustomerSV baseCustomerSV =
		 * (IBaseCustomerSV) ServiceFactory.getService(IBaseCustomerSV.class); // 查询group_id long groupId =
		 * (groupCustAndExtraInfoValue.getGroupId() > 0) ? groupCustAndExtraInfoValue.getGroupId() :
		 * getGroupId(groupCustAndExtraInfoValue.getChnlCityId()); groupCustAndExtraInfoValue.setGroupId(groupId); //
		 * 设置创建操作员和组织 if (ServiceManager.getUser() != null) {
		 * groupCustAndExtraInfoValue.setCreateOpId(ServiceManager.getUser().getID());
		 * groupCustAndExtraInfoValue.setCreateOrgId(ServiceManager.getUser().getOrgId()); } // 基础客户ID long baseCustId =
		 * 0; BOCmCustBaseRelBean custBaseRel = new BOCmCustBaseRelBean(); BOCmBaseCustomerBean baseCustomer = new
		 * BOCmBaseCustomerBean(); BOPartyBean party = new BOPartyBean(); BOPartyOrganizeBean partyOrganize = new
		 * BOPartyOrganizeBean(); // 初始化组织参与人 partyOrganize.setStsToNew();
		 * partyOrganize.copy(groupCustAndExtraInfoValue);
		 * partyOrganize.setContBillId(groupCustAndExtraInfoValue.getContPhone1());
		 * partyOrganize.setContName(groupCustAndExtraInfoValue.getContName());
		 * partyOrganize.setContEmail(groupCustAndExtraInfoValue.getContEmail());
		 * partyOrganize.setManagerName(groupCustAndExtraInfoValue.getLegalCustName()); partyOrganize.setMemberNum((int)
		 * groupCustAndExtraInfoValue.getStaffAmount());
		 * partyOrganize.setContPhone(groupCustAndExtraInfoValue.getContPhone2());
		 * partyOrganize.setState(CmConstants.RECORD_STATE_USE);
		 * partyOrganize.setRegionId(groupCustAndExtraInfoValue.getChnlCityId());
		 * CmCommonUtil.initDcProperties((DataContainer) partyOrganize); // 初始化基础客户
		 * baseCustomer.copy(groupCustAndExtraInfoValue); baseCustomer.setCustType(CmConstants.CustomerType.GROUP);
		 * baseCustomer.setState(CmConstants.RECORD_STATE_USE); baseCustomer.setCustStatus((int)
		 * groupCustAndExtraInfoValue.getCustStatus());
		 * baseCustomer.setRegionId(groupCustAndExtraInfoValue.getChnlCityId());
		 * CmCommonUtil.initDcProperties((DataContainer) baseCustomer); baseCustomer.setStsToNew(); // 初始化参与人
		 * party.setStsToNew(); party.copy(groupCustAndExtraInfoValue);
		 * party.setCityId(String.valueOf(groupCustAndExtraInfoValue.getGroupCityId()));
		 * party.setPartyName(groupCustAndExtraInfoValue.getCustName());
		 * party.setPartyType(CmConstants.PartyType.ORGANIZE);
		 * party.setProvinceId(groupCustAndExtraInfoValue.getGroupProvinceId());
		 * party.setState(CmConstants.RECORD_STATE_USE); // 增加地市信息
		 * party.setRegionId(groupCustAndExtraInfoValue.getChnlCityId()); baseCustId =
		 * baseCustomerSV.createBaseCustAndParty(baseCustomer, party, partyOrganize, null); long groupCustId =
		 * groupCustAndExtraInfoValue.getGroupCustId(); groupCustAndExtraInfoValue.setBaseCustId(baseCustId); // 新增集团用户
		 * groupCustId = saveGroupCustAndExtraInfo(groupCustAndExtraInfoValue);
		 * groupCustAndExtraInfoValue.setGroupCustId(groupCustId); // 初始化基础客户与归属地客户关系 custBaseRel.setStsToNew();
		 * custBaseRel.copy(groupCustAndExtraInfoValue); custBaseRel.setBaseCustId(baseCustId);
		 * custBaseRel.setRelCustId(groupCustId); custBaseRel.setState(CmConstants.RECORD_STATE_USE);
		 * custBaseRel.setCustType(CmConstants.CustomerType.GROUP);
		 * custBaseRel.setRelCustRegionId(String.valueOf(groupCustAndExtraInfoValue.getChnlCityId())); // 增加地市信息
		 * custBaseRel.setRegionId(String.valueOf(groupCustAndExtraInfoValue.getChnlCityId())); ((IBaseCustomerSV)
		 * ServiceFactory.getService(IBaseCustomerSV.class)).saveCustBaseRel(custBaseRel); return groupId;
		 */
		return 0L;
	}

	public void groupCustomerAndExtraInfoValidate(IQBOCmGroupCustAndExtraInfoValue groupCustomer) throws Exception, RemoteException {
		// 新增集团客户的效验方法
		// 集团客户名是否重复
		if (0 < queryGroupCustomerCount(groupCustomer.getCustName(), groupCustomer.getGroupCustId())) {
			ExceptionUtil.throwBusinessException("CMS1006179");
		}
		// 关联集团不能关联本集团
		if (groupCustomer.getRelGroupCustId() > 0 && groupCustomer.getGroupCustId() == groupCustomer.getRelGroupCustId()) {
			ExceptionUtil.throwBusinessException("CMS1006689");
		}
		// 当集团为潜在重点集团，必须关联集团为在网集团
		if (groupCustomer.getGroupStatus() == 15) {
			IBOCmGroupCustomerValue relGroupCustomer = queryGroupCustomerById(groupCustomer.getRelGroupCustId());
			if (relGroupCustomer == null) {
				ExceptionUtil.throwBusinessException("CMS1006545");
			}
			// 非在网客户抛出异常
			if (relGroupCustomer.getCustStatus() != 0) {
				ExceptionUtil.throwBusinessException("CMS1006544", new StringBuffer().append("[").append(relGroupCustomer.getCustName()).append("]").toString());
			}
		}
		Map isFilledMap = GroupCustomerUtil.isGroupCustFilled(groupCustomer);
		boolean isIndivAllFilled = ((Boolean) isFilledMap.get("isAllFilled")).booleanValue();
		if (!isIndivAllFilled) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS1006239", isFilledMap.get("notFilledCols").toString()));
			}
			ExceptionUtil.throwBusinessException("CMS1006239", isFilledMap.get("notFilledCols").toString());
		}
	}

	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoByEcCode(String ecCode) throws Exception, RemoteException {
		ICmQGroupCustAndExtraInfoDAO grouCustomerDAO = (ICmQGroupCustAndExtraInfoDAO) ServiceFactory.getService(ICmQGroupCustAndExtraInfoDAO.class);
		Map map = new HashMap();
		StringBuffer condition = new StringBuffer();
		condition.append(IQBOCmGroupCustAndExtraInfoValue.S_EcCode).append("=:ecCode");
		map.put("ecCode", ecCode);
		condition.append(" AND ");
		condition.append(IQBOCmGroupCustAndExtraInfoValue.S_State).append("=:state");
		map.put("state", CmConstants.RecordState.USE);
		IQBOCmGroupCustAndExtraInfoValue[] groupCustAndExtraInfos = grouCustomerDAO.queryGroupCustAndExtraInfos(condition.toString(), map, -1, -1);
		if (groupCustAndExtraInfos != null && groupCustAndExtraInfos.length > 0)
			return groupCustAndExtraInfos[0];
		else
			return null;
	}

	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustomerAndExtraInfo(String condition, Map map, int startIndex, int endIndex) throws Exception, RemoteException {
		ICmQGroupCustAndExtraInfoDAO grouCustomerDAO = (ICmQGroupCustAndExtraInfoDAO) ServiceFactory.getService(ICmQGroupCustAndExtraInfoDAO.class);
		return grouCustomerDAO.queryGroupCustAndExtraInfos(condition.toString(), map, startIndex, endIndex);
	}

	public int queryGroupCustomerAndExtraInfoCount(String condition, Map map) throws Exception, RemoteException {
		ICmQGroupCustAndExtraInfoDAO grouCustomerDAO = (ICmQGroupCustAndExtraInfoDAO) ServiceFactory.getService(ICmQGroupCustAndExtraInfoDAO.class);
		return grouCustomerDAO.queryGroupCustAndExtraInfoCount(condition, map);
	}

	public IBOCmGroupCustMgrRelValue saveGroupCustMgrRel(IBOCmGroupCustMgrRelValue groupCustMgrRelValue) throws Exception, RemoteException {
		return null;
	}

	public IQBOCmGroupCustManagerValue[] queryGroupCustManagersByGroupId(long groupCustId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustManagersByGroupId(groupCustId);
	}

	public IBOCmGroupCustomerValue[] queryGroupCustomerAndMgrList(String custName) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		IBOCmGroupCustomerValue[] groupCustomers = grouCustomerDAO.queryGroupCustomerByCustName(custName, -1, -1);
		return groupCustomers;
	}

	public IBOCmGroupCustomerValue queryGroupCustomerByGroupId(long groupId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryGroupCustomerByGroupId(groupId);
	}

	public IBOCmGroupCustomerValue queryAllStateGroupCustomerByGroupCustId(long groupCustId) throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.queryAllStateGroupCustomerByGroupCustId(groupCustId);
	}

	public IBOCmGroupExtraInfoValue queryAllStateGroupExtraInfoByGroupCustId(long groupCustId) throws Exception, RemoteException {
		ICmGroupExtraInfoDAO grouCustomerDAO = (ICmGroupExtraInfoDAO) ServiceFactory.getService(ICmGroupExtraInfoDAO.class);
		return grouCustomerDAO.queryAllStateGroupExtraInfoByGroupCustId(groupCustId);
	}

	public DataContainer[] queryGroupCustomersByCondition(long custId, String custName, int custType, int custLevel, int custStatus, int custCertType, String custCertCode,
			int isLike, int startNum, int endNum) throws Exception, RemoteException {
		/*
		 * StringBuffer condition = new StringBuffer(" 1 = 1 "); Map parameters = new HashMap(); if (custId >= 0) {
		 * condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" = :P_").append(
		 * IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId); parameters.put("P_" +
		 * IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId, Long.valueOf(custId)); } if (custName != null &&
		 * custName.length() > 0) { if (isLike == 1) { condition.append(" AND
		 * ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" LIKE :P_")
		 * .append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" "); parameters.put("P_" +
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustName, "%" + custName + "%"); } // 默认使用精确匹配 else { condition.append("
		 * AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" = :P_").append(
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustName); parameters.put("P_" +
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustName, custName); } } if (custLevel >= 0) { condition.append(" AND
		 * ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustLevel).append(" = :P_").append(
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustLevel); parameters.put("P_" +
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustLevel, Long.valueOf(custLevel)); } if (custStatus >= 0) {
		 * condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustStatus).append(" = :P_").append(
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustStatus); parameters.put("P_" +
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustStatus, Long.valueOf(custStatus)); } if (custCertType >= 0) {
		 * condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertType).append(" = :P_").append(
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustCertType); parameters.put("P_" +
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustCertType, Long.valueOf(custCertType)); } if (custCertCode != null &&
		 * custCertCode.length() > 0) { if (isLike == 1) { condition.append(" AND
		 * ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode).append(" LIKE :P_")
		 * .append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode).append(" "); parameters.put("P_" +
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode, "%" + custCertCode + "%"); } // 默认使用精确匹配 else {
		 * condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode).append(" = :P_")
		 * .append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode); parameters.put("P_" +
		 * IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode, custCertCode); } } IQBOCmGroupCustAndExtraInfoValue[] result =
		 * queryGroupCustomerAndExtraInfo(condition.toString(), parameters, startNum, endNum); DataContainer[] datas =
		 * new DataContainer[result.length]; DataContainer data = null; for (int i = 0; i < result.length; i++) { data =
		 * new DataContainer(); data.set(IQBOCmCustRelBaseCustValue.S_BaseCustId,
		 * Long.valueOf(result[i].getBaseCustId())); data.set(IQBOCmCustRelBaseCustValue.S_BaseState,
		 * result[i].getState()); data.set(IQBOCmCustRelBaseCustValue.S_CreateDate, result[i].getCreateDate());
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustCertAddress, result[i].getCustAddress());
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustStatus, String.valueOf(result[i].getCustStatus()));
		 * data.set(IQBOCmCustRelBaseCustValue.S_RelCustId, Long.valueOf(result[i].getGroupCustId()));
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustName, result[i].getCustName());
		 * data.set(IQBOCmCustRelBaseCustValue.S_RelCustRegionId, String.valueOf(result[i].getChnlCityId()));
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustCertType, Long.valueOf(result[i].getCustCertType()));
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustCertCode, result[i].getCustCertCode());
		 * data.set(IQBOCmCustRelBaseCustValue.S_RelState, result[i].getState());
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustCertExpire, result[i].getCustCertExpire());
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustCertExpire, result[i].getCustCertExpire());
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustLevel, Long.valueOf(result[i].getCustLevel()));
		 * data.set(IQBOCmCustRelBaseCustValue.S_CustType, Long.valueOf(3));
		 * data.set(IQBOCmCustRelBaseCustValue.S_BaseCountyId, result[i].getChnlRegionType());
		 * data.set(IQBOCmGroupCustAndExtraInfoValue.S_CustAddress, result[i].getCustAddress());
		 * data.set(IQBOCmGroupCustAndExtraInfoValue.S_CustZipcode, String.valueOf(result[i].getCustZipcode()));
		 * datas[i] = data; } return datas;
		 */
		return null;
	}

	public int queryGroupCustomersCountByCondition(long custId, String custName, int custType, int custLevel, int custStatus, int custCertType, String custCertCode, int isLike)
			throws Exception, RemoteException {
		StringBuffer condition = new StringBuffer(" 1 = 1 ");
		Map parameters = new HashMap();
		if (custId >= 0) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId);
			parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_GroupCustId, Long.valueOf(custId));
		}
		if (custName != null && custName.length() > 0) {
			if (isLike == 1) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" LIKE :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append("  ");
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustName, "%" + custName + "%");
			}
			// 默认使用精确匹配
			else {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName);
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustName, custName);
			}
		}
		if (custLevel >= 0) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustLevel).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustLevel);
			parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustLevel, Long.valueOf(custLevel));
		}
		if (custStatus >= 0) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustStatus).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustStatus);
			parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustStatus, Long.valueOf(custStatus));
		}
		if (custCertType >= 0) {
			condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertType).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertType);
			parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustCertType, Long.valueOf(custCertType));
		}
		if (custCertCode != null && custCertCode.length() > 0) {
			if (isLike == 1) {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode).append(" LIKE :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode)
						.append("  ");
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode, "%" + custCertCode + "%");
			}
			// 默认使用精确匹配
			else {
				condition.append(" AND ").append(IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode).append(" = :P_").append(IQBOCmGroupCustAndExtraInfoValue.S_CustName);
				parameters.put("P_" + IQBOCmGroupCustAndExtraInfoValue.S_CustCertCode, custCertCode);
			}
		}
		return queryGroupCustomerAndExtraInfoCount(condition.toString(), parameters);
	}

	public void deleteRegionGroupRel(long groupCustId) throws Exception, RemoteException {
		IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue = queryGroupCustAndExtraInfoById(groupCustId);
		if (groupCustAndExtraInfoValue == null) {
			ExceptionUtil.throwBusinessException("CMS1006697");
		}
		if(null!=groupCustAndExtraInfoValue){
			groupCustAndExtraInfoValue.setGroupCityId(-1);
			groupCustAndExtraInfoValue.setGroupCountyId(-1);
			groupCustAndExtraInfoValue.setGroupTownId(-1);
			groupCustAndExtraInfoValue.setGroupVillegeId(-1);
			saveGroupCustAndExtraInfo(groupCustAndExtraInfoValue);
		}
	}

	public String changeRegionSpecia(int fetchSize) throws Exception, RemoteException {
		/*
		 * // 区间数字电路出租套餐 long offerIdA = 800010000016L; // 省际数字电路出租套餐 long offerIdB = 800010000002L; ICrm2CustFSV
		 * crm2CustFSV = (ICrm2CustFSV) ServiceFactory.getService(ICrm2CustFSV.class); // Timestamp sysDate =
		 * groupCustomerDAO.getSysDate(); int successNum = 0; int failNum = 0; int num = 0; int countNum = 0;
		 * IBOBsDistrictValue[] districts = CmDistrictUtil.getRegionId(true, false); for (int regionIndex = 0;
		 * regionIndex < districts.length; regionIndex++) { try {
		 * CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, districts[regionIndex].getRegionId()); //
		 * 自动将集团区域类型升级为跨市总部开始 int countNum1 = (int) crm2CustFSV.countGroupOrderInfoByOfferId(offerIdA, null, null); if
		 * (countNum1 % fetchSize == 0) { num = countNum1 / fetchSize; } else { num = countNum1 / fetchSize + 1; } }
		 * catch (Exception e1) { failNum++; continue; } for (int j = 0; j < num; j++) { countNum++;
		 * IBOGroupOrderInfoValue[] groupOrders = crm2CustFSV.getGroupOrderInfoByOfferId(offerIdB, null, null, j
		 * fetchSize, (j + 1) * fetchSize - 1); for (int i = 0; i < groupOrders.length; i++) { try {
		 * IQBOCmGroupCustAndExtraInfoValue custAndExtraInfoValue = queryGroupCustAndExtraInfoByGroupId(groupOrders[i]
		 * .getGroupId()); if (custAndExtraInfoValue == null) { failNum++; continue; }
		 * custAndExtraInfoValue.setGroupRegionType(3); custAndExtraInfoValue.setGroupSubRegionType("3.1");
		 * saveGroupCustAndExtraInfo(custAndExtraInfoValue); successNum++; } catch (Exception e) { log.error(e);
		 * failNum++; } } } // 自动将集团区域类型升级为跨省总部开始 int countNum2 = (int)
		 * crm2CustFSV.countGroupOrderInfoByOfferId(offerIdB, null, null); if (countNum2 % fetchSize == 0) { num =
		 * countNum2 / fetchSize; } else { num = countNum2 / fetchSize + 1; } for (int j = 0; j < num; j++) {
		 * IBOGroupOrderInfoValue[] groupOrders = crm2CustFSV.getGroupOrderInfoByOfferId(offerIdB, null, null, j
		 * fetchSize, (j + 1) * fetchSize - 1); for (int i = 0; i < groupOrders.length; i++) { countNum++; try {
		 * IQBOCmGroupCustAndExtraInfoValue custAndExtraInfoValue = queryGroupCustAndExtraInfoByGroupId(groupOrders[i]
		 * .getGroupId()); if (custAndExtraInfoValue == null) { failNum++; continue; }
		 * custAndExtraInfoValue.setGroupRegionType(2); custAndExtraInfoValue.setGroupSubRegionType("2.1");
		 * saveGroupCustAndExtraInfo(custAndExtraInfoValue); successNum++; } catch (Exception e) { log.error(e);
		 * failNum++; } } } } return CrmLocaleFactory.getResource("CMS1006737", String.valueOf(successNum+failNum),
		 * String.valueOf(successNum), String.valueOf(failNum));
		 */
		return null;
	}

	public DataContainer[] queryGroupOrderByCdn(long custId, long billId) throws Exception, RemoteException {
		/*
		 * ICrm2CustFSV custFSV = (ICrm2CustFSV) ServiceFactory.getService(ICrm2CustFSV.class); GroupInfoForCustomer[]
		 * groupInfoCustomers = custFSV.queryGroupOrderInfoByCustId(custId, String.valueOf(billId)); DataContainer[]
		 * datas = new DataContainer[groupInfoCustomers.length]; DataContainer data = null; for (int i = 0; i <
		 * groupInfoCustomers.length; i++) { data = new DataContainer(); data.set("GROUP_CUST_ID",
		 * Long.valueOf(groupInfoCustomers[i].getCustId())); data.set("OFFER_NAME",
		 * groupInfoCustomers[i].getOfferName()); data.set("BILL_ID", Long.valueOf(groupInfoCustomers[i].getBillId()));
		 * data.set("OFFER_ID", Long.valueOf(groupInfoCustomers[i].getOfferId())); // 是否是归属 data.set("OWNER",
		 * "1".equals(groupInfoCustomers[i].getOwner()) ? CrmLocaleFactory.getResource("CMS0009068") :
		 * CrmLocaleFactory.getResource("CMS0009069")); datas[i] = data; } return datas;
		 */
		return null;
	}

	private void setDataValue(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue, String state) throws Exception, RemoteException {
		// 新增集团同步BOSS
		/*
		 * IUcm2CrmSV ucm2CrmSV = (IUcm2CrmSV) ServiceFactory.getService(IUcm2CrmSV.class); Map paraMap = new HashMap();
		 * if (CmConstants.IUcm2Crm.STATE_ADD.equalsIgnoreCase(state)) { paraMap.put("CUST_STATE",
		 * CmConstants.IUcm2Crm.STATE_ADD); paraMap.put("BUSINESS_ID", CmConstants.IUcm2Crm.GROUP_BUSINESS_ID_ADD); }
		 * else if (CmConstants.IUcm2Crm.STATE_MODIFY.equalsIgnoreCase(state)) { paraMap.put("CUST_STATE",
		 * CmConstants.IUcm2Crm.STATE_MODIFY); paraMap.put("BUSINESS_ID",
		 * CmConstants.IUcm2Crm.GROUP_BUSINESS_ID_MODIFY); } else if
		 * (CmConstants.IUcm2Crm.STATE_DEL.equalsIgnoreCase(state)) { paraMap.put("CUST_STATE",
		 * CmConstants.IUcm2Crm.STATE_DEL); paraMap.put("BUSINESS_ID", CmConstants.IUcm2Crm.GROUP_BUSINESS_ID_DEL); }
		 * Map map=new HashMap(); map.put("CREDIT_PAY_LEVEL", groupCustAndExtraInfoValue.getCreditPayLevel());
		 * paraMap.put("REGION_ID", groupCustAndExtraInfoValue.getChnlCityId()); paraMap.put("CUST_ID",
		 * Long.valueOf(groupCustAndExtraInfoValue.getGroupCustId())); paraMap.put("CUST_TYPE",
		 * Integer.valueOf(CmConstants.CustomerType.GROUP)); paraMap.put("CREATE_DATE",
		 * groupCustAndExtraInfoValue.getCreateDate()); paraMap.put("BOSS_CUSTOMER",map); paraMap.put("COUNTY_ID",
		 * groupCustAndExtraInfoValue.getChnlRegionType() == null ? groupCustAndExtraInfoValue .getChnlCityId() :
		 * groupCustAndExtraInfoValue.getChnlRegionType()); ucm2CrmSV.unifyCustomer(paraMap, "group",
		 * groupCustAndExtraInfoValue.getChnlCityId());
		 */
	}

	public IBOCmGroupCustomerValue[] queryGroupCustomerByCustIds(long[] groupCustIds) throws Exception, RemoteException {
		/*
		 * List groupCusts = new ArrayList();// 用来保存需返回的集团信息 if(groupCustIds != null && groupCustIds.length > 0){
		 * ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO)
		 * ServiceFactory.getService(ICmGroupCustomerDAO.class); StringBuilder condition = new
		 * StringBuilder(IBOCmGroupCustomerValue.S_State); condition.append(" =
		 * '").append(CmConstants.RECORD_STATE_USE).append("' AND ");
		 * condition.append(IBOCmGroupCustomerValue.S_GroupCustId).append(" IN ("); int length = groupCustIds.length /
		 * 1000;// 用in查询集团信息,但oracle10g的in最大为1000个，所以每1000个请求一次数据库 IBOCmGroupCustomerValue[] groupCustList = null;
		 * StringBuilder sqlParamer = null; if (groupCustIds.length >= 1000) {// 当groupCustIds大于1000个时,需拆分成1000查一次 for
		 * (int i = 0; i < length; i++) { sqlParamer = new StringBuilder();// 参数 for (int j = 0; j < 1000; j++) { if (j ==
		 * 0) { sqlParamer.append(groupCustIds[j]); continue; } sqlParamer.append(",").append(groupCustIds[(i * 1000) +
		 * j]); } groupCustList = grouCustomerDAO.queryGroupCustomers((new
		 * StringBuilder(condition.toString())).append(sqlParamer.toString()).append(")").toString(), new HashMap()); if
		 * (CmCommonUtil.isNotEmptyObject(groupCustList)) { for (int j = 0, legth = groupCustList.length; j < legth;
		 * j++) { groupCusts.add(groupCustList[j]); } } } } sqlParamer = new StringBuilder(); //
		 * 对1000取模后剩下的再查一次,例如2800就是查2次in 1000的，再查一次 in 800的 if (groupCustIds.length % 1000 != 0) { for (int i = 0; i <
		 * groupCustIds.length % 1000; i++) { if (groupCustIds.length < 1000) { if (i == 0) {
		 * sqlParamer.append(groupCustIds[i]); continue; } sqlParamer.append(",").append(groupCustIds[i]); } else { if
		 * (i == 0) { sqlParamer.append(groupCustIds[length * 1000]); continue; }
		 * sqlParamer.append(",").append(groupCustIds[length * 1000 + i]); } } groupCustList =
		 * grouCustomerDAO.queryGroupCustomers((new
		 * StringBuilder(condition.toString())).append(sqlParamer.toString()).append(")").toString(), new HashMap()); if
		 * (CmCommonUtil.isNotEmptyObject(groupCustList)) { for (int j = 0, legth = groupCustList.length; j < legth;
		 * j++) { groupCusts.add(groupCustList[j]); } } } } return (IBOCmGroupCustomerValue[]) groupCusts.toArray(new
		 * IBOCmGroupCustomerValue[groupCusts.size()]);
		 */
		return null;
	}

	public String getGroupConnectionName() throws Exception, RemoteException {
		ICmGroupCustomerDAO grouCustomerDAO = (ICmGroupCustomerDAO) ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return grouCustomerDAO.getGroupConnectionName();
	}

	public int getGroupDelNotExistVipCount(String regionId) throws Exception, RemoteException {
		return 0;// grouCustomerDAO.getGroupDelNotExistVipCount(regionId);
	}

	public int getVipNotExistGroupCount(String regionId) throws Exception, RemoteException {
		return 0;// grouCustomerDAO.getVipNotExistGroupCount(regionId);
	}

	public long createGroupCustAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfo(DataContainerInterface dataContainer, int startIndex, int endIndex) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public DataContainer queryGroupCustAndExtraInfoAndRelGroupInfoById(long groupCustId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoByCardCode(String vipCard, String regionId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoByGroupId(long groupId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoById(long groupCustId) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public long saveGroupCustAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue) throws Exception, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void saveGroupCustAndExtraInfos(IQBOCmGroupCustAndExtraInfoValue[] groupCustAndExtraInfos) throws Exception, RemoteException {
		// TODO Auto-generated method stub

	}

	public IBOCmGroupCustomerValue[] queryOutGrpCustomers(String criteria, int startNum, int endNum) throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			Map condMap = ParamUtil.transferDataContainersToMap(dcs);
			Parameter parameter = ParamUtil.buildParameter(condMap, BOCmGroupCustomerBean.class, new String[] { "CUST_NAME" });
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM (");
			sql.append("SELECT M.*,").append(" FROM ").append(BOCmGroupCustomerBean.getObjectTypeStatic().getMapingEnty()).append(" M ").append(" WHERE ").append("M.").append(
					IBOCmGroupCustomerValue.S_State).append(" = 'E' ");
			sql.append(") A ");
			sql.append(" WHERE ").append(parameter.getCondition());
			// 分页支持
			if (startNum == -1 && endNum == -1) {
			} else {
				sql.insert(0, "select * from (select B.* from ( ");
				sql.append(" ) B)");
				if (startNum >= 0 && endNum >= 0) {
					sql.append(" LIMIT ").append(startNum).append(",").append(endNum);
				}
			}
			// 记录业务日志
			// CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
			DataContainerInterface[] results = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter.getParameter());
			if (CmCommonUtil.isNotEmptyObject(results)) {
				IBOCmGroupCustomerValue[] contractValues = new IBOCmGroupCustomerValue[results.length];
				for (int i = 0; i < contractValues.length; i++) {
					contractValues[i] = new BOCmGroupCustomerBean();
					contractValues[i].copy(results[i]);
					// initProperty
					if (results[i].hasProperty("PARENT_CONTRACT_NAME")) {
						contractValues[i].initProperty("PARENT_CONTRACT_NAME", results[i].get("PARENT_CONTRACT_NAME"));
					}
				}
				return contractValues;
			}
		}
		return new IBOCmGroupCustomerValue[0];
	}

	public int queryOutGrpCustomersCount(String criteria) throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			Parameter parameter = ParamUtil.buildParameter(dcs, BOCmGroupCustomerBean.class);
			return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupCustomerBean.class, parameter.getCondition(), parameter.getParameter());
		}
		return 0;
	}
	
	public IBOCmGroupContactBindingValue[] queryGroupContactBindingInfo(long custId,long contId) throws Exception{
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if(!CmCommonUtil.isEmptyObj(custId)){
			condition.append(" AND ").append(IBOCmGroupContactBindingValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		if(!CmCommonUtil.isEmptyObj(contId)){
			condition.append(" AND ").append(IBOCmGroupContactBindingValue.S_ContId).append(" =:contId ");
			parameter.put("contId", contId);
		}
		return (IBOCmGroupContactBindingValue[])CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupContactBindingBean.class, condition.toString(), parameter, -1, -1);		
	}
	
	public void saveGroupContactBindingInfo(IBOCmGroupContactBindingValue groupContactBindingValue) throws Exception{
		IBOCmGroupContactBindingValue[] qryResult = queryGroupContactBindingInfo(groupContactBindingValue.getCustId(),groupContactBindingValue.getContId());
		if(!CmCommonUtil.isNotEmptyObject(qryResult)){
		//新增	
			BOCmGroupContactBindingBean result = new BOCmGroupContactBindingBean();
			result.copy(groupContactBindingValue);
			result.set(IBOCmGroupContactBindingValue.S_RelId,CmCommonUtil.getNewSequence(BOCmGroupContactBindingBean.class));
			CmInnerServiceFactory.getCommonInnerSV().saveBean(result);//保存			
		}else{
		//修改	
			BOCmGroupContactBindingBean result = new BOCmGroupContactBindingBean();
			result.copy(groupContactBindingValue);
			result.initProperty("rel_id", qryResult[0].getRelId());		
			CmInnerServiceFactory.getCommonInnerSV().saveBean(result);
		}
	}
	
	public IBOCmGroupCustomerValue[] queryCmGroupCustByPartyId(String partyId) throws Exception{
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter=new HashMap();
		condition.append(" AND ").append(IBOCmGroupCustomerValue.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		condition.append(" AND ").append(IBOCmGroupCustomerValue.S_State).append(" =:state ");
		parameter.put("state", "U");
		ICmGroupCustomerDAO cmGroupCustDao = (ICmGroupCustomerDAO)ServiceFactory.getService(ICmGroupCustomerDAO.class);
		return cmGroupCustDao.queryGroupCustomers(condition.toString(), parameter);
	}
}
