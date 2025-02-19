package com.asiainfo.crm.cm.teaminvoke.in.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.bo.BOBsDistrictBean;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.client.SecframeClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecGroupValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecPlayerValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperGrpValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.ai.secframe.orgmodel.service.interfaces.ISecOperatorSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import org.apache.commons.lang.StringUtils;

public class Sec2CmSVImpl implements ISec2CmSV {

	private ISecOperatorSV getSecOperatorSV() throws Exception {
		return (ISecOperatorSV) ServiceFactory.getService(ISecOperatorSV.class);
	}

	public IBOSecOperatorValue getOperatorByCode(String code) throws Exception {
		return OrgmodelClient.getOperatorByCode(code);
	}

	public IBOSecOperatorValue getOperatorInfoByOpId(long operatorId) throws Exception {
		return getSecOperatorSV().getOperatorById(operatorId);
	}

	public IBOSecOrganizeValue[] getSecOperatorsByName(String organizeName) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map map = new HashMap();
		condition.append(IBOSecOrganizeValue.S_OrganizeName).append(" = :organizeName ");
		map.put("organizeName", organizeName);
		condition.append(" and ").append(IBOSecOrganizeValue.S_State).append(" = :state ");
		map.put("state", 1);
		return OrgmodelClient.getSecOrganizeValues(condition.toString(), map);
	}

	public IBOSecOrganizeValue[] getChildOrgs(long organizeId, boolean isUseFlag) throws Exception {
		return OrgmodelClient.getChildOrgs(organizeId, isUseFlag);
	}

	public IQBOSecCustManagerValue[] getAmsByCond(String code, String staffName, String orgName, int start, int end) throws Exception {
		if (StringUtils.isBlank(code) && StringUtils.isBlank(staffName) && StringUtils.isBlank(orgName)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		return OrgmodelClient.getAmsByCond(code, staffName, orgName, start, end);
	}

	public int getAmsCountByCond(String code, String staffName, String orgName) throws Exception {
		if (StringUtils.isBlank(code) && StringUtils.isBlank(staffName) && StringUtils.isBlank(orgName)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		return OrgmodelClient.getAmsCountByCond(code, staffName, orgName);
	}

	public IQBOSecCustManagerValue[] getAmsByCond(long staffId, String staffName, String orgName, int start, int end) throws Exception {
		if (staffId == -1 && StringUtils.isBlank(staffName) && StringUtils.isBlank(orgName)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		return OrgmodelClient.getAmsByCond(staffId, staffName, orgName, start, end);
	}

	public int getAmsCountByCond(long staffId, String staffName, String orgName) throws Exception {
		if (staffId == -1 && StringUtils.isBlank(staffName) && StringUtils.isBlank(orgName)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		return OrgmodelClient.getAmsCountByCond(staffId, staffName, orgName);
	}

	// 电话经理信息
	public IQBOSecCustManagerValue[] getPmsByCond(String code, String staffName, String orgName, int start, int end) throws Exception {
		if (StringUtils.isBlank(staffName) && StringUtils.isBlank(orgName) && StringUtils.isBlank(code)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}

		return OrgmodelClient.getPmsByCond(code, staffName, orgName, start, end);
	}

	// 电话经理总行数
	public int getPmsCountByCond(String code, String staffName, String orgName) throws Exception {
		if (StringUtils.isBlank(staffName) && StringUtils.isBlank(orgName) && StringUtils.isBlank(code)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		return OrgmodelClient.getPmsCountByCond(code, staffName, orgName);
	}

	public IQBOSecCustManagerValue getEffectAmInfo(long managerId, int managerType) throws Exception {
		return OrgmodelClient.getEffectAmInfo(managerId, managerType);
	}

	public DataContainer[] querySecOrg(long orgId, String orgName, String districtId, String countyId, String ownerArea, int start, int end) throws Exception {
		List list = new ArrayList();

		// IBOSecOrganizeValue[]
		// ibOrganizeValues=OrgmodelClient.queryOrganizeInfo(orgId,orgName,districtId,countyId,ownerArea,start,end);
		IBOSecGroupValue[] groupValue = OrgmodelClient.getGroupValuesWithOperId(orgId, orgName, 18, -1, -1);
		if (CmCommonUtil.isEmptyObj(groupValue)) {
			return new DataContainer[0];
		}
		for (int i = 0; i < groupValue.length; i++) {
			DataContainer dt = new DataContainer();
			dt.set("ORGANIZE_ID", groupValue[i].getGroupId());
			dt.set("ORGANIZE_NAME", groupValue[i].getGroupName());
			list.add(dt);
		}
		// if (CmCommonUtil.isEmptyObj(ibOrganizeValues)) {
		// return new DataContainer[0];
		// }
		// for(int i=0;i<ibOrganizeValues.length;i++){
		// DataContainer dt=new DataContainer();
		// dt.set("ORGANIZE_ID", ibOrganizeValues[i].getOrganizeId());
		// dt.set("ORGANIZE_NAME", ibOrganizeValues[i].getOrganizeName());
		// list.add(dt);
		// }
		return (DataContainer[]) list.toArray(new DataContainer[0]);
	}

	public int querySecOrgCount(long orgId, String orgName, String districtId, String countyId, String ownerArea) throws Exception {
		// IBOSecOrganizeValue[]
		// ibOrganizeValues=OrgmodelClient.queryOrganizeInfo(orgId,orgName,districtId,countyId,ownerArea,-1,-1);
		DataContainer[] ibOrganizeValues = querySecOrg(orgId, orgName, districtId, countyId, ownerArea, -1, -1);
		if (CmCommonUtil.isEmptyObj(ibOrganizeValues)) {
			return 0;
		}
		return ibOrganizeValues.length;
	}

	public IBOSecPlayerValue[] getPlayersByCode(String opId) throws Exception {
		return OrgmodelClient.getPlayersByCode(opId);
	}

	public IQBOSecCustManagerValue[] queryCustManager(String code, String staffName, String orgName, String districtId, String countyId, String ownerArea, String billId,
			int start, int end) throws Exception {
		if (StringUtils.isBlank(orgName)) {
			orgName = "-1";
		}
		List result = null;
		if (DataType.getAsLong(orgName) < 0) {
			// 次要客户经理查询逻辑
			IQBOSecOrgStaffOperValue[] secStaffs = OrgmodelClient.getOperatorByCodeAndName(code, staffName, billId);
			result = getSecCustManager(secStaffs);
			if (result != null && !result.isEmpty()) {
				return (IQBOSecCustManagerValue[]) result.toArray(new IQBOSecCustManagerValue[0]);
			}
		} else {
			// 主要客户经理
			IQBOSecOrgStaffOperGrpValue[] iSecOrgStaffs = OrgmodelClient.getGrpMembersByOperInfo(code, staffName, DataType.getAsLong(orgName), billId, false, -1, -1);
			result = getSecCustManager(iSecOrgStaffs);
			//页面上取deptId作为客户经理组id
			if (result != null && !result.isEmpty()){
				IQBOSecCustManagerValue[] retVal = (IQBOSecCustManagerValue[]) result.toArray(new IQBOSecCustManagerValue[0]);
				for(int i=0;i<retVal.length;i++){
					retVal[i].setDeptid(iSecOrgStaffs[0].getGroupId());
				}
				return retVal;
			}
		}
		
		return new IQBOSecCustManagerValue[0];
	}

	private List getSecCustManager(DataStructInterface[] values) throws Exception {
		if (values != null && values.length > 0) {
			List result = new ArrayList();
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			for (DataStructInterface temp : values) {
				IQBOSecCustManagerValue mgrValue = iseCm.getEffectAmInfo(Long.parseLong(temp.get("OPERATOR_ID").toString()), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
				if (CmCommonUtil.isNotEmptyObject(mgrValue)) {
					if (mgrValue.getStaffType() == 1) {// TSM
						mgrValue.setNotes("TSM");
					} else if (mgrValue.getStaffType() == 2) {// SM
						mgrValue.setNotes("SM");
					} else if (mgrValue.getStaffType() == 3) {// AM
						mgrValue.setNotes("AM");
					} else {
						mgrValue.setNotes("");
					}
					result.add(mgrValue);
				}
			}
			return result;
		}
		return null;
	}

	public int queryCustManagerCond(String code, String staffName, String orgName, String districtId, String countyId, String ownerArea, String billId) throws Exception {
		if (StringUtils.isBlank(orgName)) {
			orgName = "-1";
		}
		int count = 0;
		if (DataType.getAsLong(orgName) < 0) {
			// 次要客户经理
			count = OrgmodelClient.getOperCountByCodeAndName(code, staffName, billId);
		} else {
			// 主要客户经理
			count = OrgmodelClient.getGrpMembersByOperInfoCount(code, staffName, DataType.getAsLong(orgName), billId, false);
		}
		return count;
	}

	public Map getDisTrictValues(long opId) throws Exception {
		Map map = OrgmodelClient.isProvinceOper(opId);
		return map;
	}

	public BOBsDistrictBean getDistrictByRegionId(String regionid) throws Exception {
		return OrgmodelClient.getDistrictByRegionId(regionid);
	}

	public IQBOSecCustManagerValue[] getCustManager(String billId, int managerType, String managerName, String districtId, String countyId, long[] managerId, long staffId,
			long orgId, String code, int start, int end) throws Exception {
		return OrgmodelClient.getCustManager(billId, managerType, managerName, districtId, countyId, managerId, staffId, orgId, code, start, end);
	}

	public int getCustManagerCount(String billId, int managerType, String managerName, String districtId, String countyId, long[] managerId, long staffId, long orgId, String code)
			throws Exception {
		return OrgmodelClient.getCustManagerCount(billId, managerType, managerName, districtId, countyId, managerId, staffId, orgId, code);
	}

	public boolean queryExistsEntId(long operId, long entId) throws Exception {
		return SecframeClient.checkEntityPermission(operId, entId, -1);
	}

	public IQBOSecOrgStaffOperValue getOperQBOByOperId(long operId) throws Exception {
		return OrgmodelClient.getOperQBOByOperId(operId);
	}

	/**
	 * 根据客户经理组ID查询客户经理
	 * @param orgId
	 * @return
	 * @throws Exception
	 */
	public IQBOSecCustManagerValue[] queryCustManagerByOrgId(long orgId, int start, int end) throws Exception {
		IQBOSecCustManagerValue[] values = OrgmodelClient.getCustManager("", CmLnConstants.CM_MANAGER_TYPE.TYPE_3, "", "", "", null, -1, orgId, "", start, end);
		if (values != null && values.length > 0) {
			IBOBsStaticDataValue[] staticDatas = StaticDataUtil.getStaticData("CM_ACCOUNT_MGR_TYPE");
			for (int i = 0; i < values.length; i++) {
				for (int j = 0; j < staticDatas.length; j++) {
					if (staticDatas[j].getCodeValue().equals(DataType.getAsString(values[i].getManagerType()))) {
						values[i].setNotes(CrmLocaleFactory.getResource(staticDatas[j].getCodeName()));
						break;
					}
				}
			}
		}
		return values;
	}

	public int queryCustManagerByOrgIdCount(long orgId) throws Exception {
		return OrgmodelClient.getCustManagerCount("", CmLnConstants.CM_MANAGER_TYPE.TYPE_3, "", "", "", null, -1, orgId, "");
	}
}
