package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupOrgStructEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmGroupStructTreeEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupOrgStructDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupOrgStructValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupStructTreeValue;

public class CmGroupOrgStructDAOImpl implements ICmGroupOrgStructDAO {

	public IBOCmGroupOrgStructValue[] queryGroupOrgStruct(long groupCustId, long parentDeptId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_ParentDeptId).append("=:parentDeptId");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		parameterMap.put("parentDeptId", Long.valueOf(parentDeptId));
		condition.append(" ORDER  BY ");
		condition.append(IBOCmGroupOrgStructValue.S_DeptType);
		return BOCmGroupOrgStructEngine.getBeans(condition.toString(), parameterMap);
	}

	public long createGroupOrgStruct(IBOCmGroupOrgStructValue groupOrgStructValue) throws Exception {
		long newPkId = BOCmGroupOrgStructEngine.getNewId().longValue();
		groupOrgStructValue.setDeptId(newPkId);
		groupOrgStructValue.setState(CmxConstants.RECORD_STATE_USE);
		groupOrgStructValue.setStsToNew();
		BOCmGroupOrgStructEngine.save(groupOrgStructValue);
		return newPkId;
	}

	public void updateGroupOrgStruct(IBOCmGroupOrgStructValue groupOrgStructValue) throws Exception {
		groupOrgStructValue.setStsToOld();
		BOCmGroupOrgStructEngine.save(groupOrgStructValue);
	}

	public IBOCmGroupOrgStructValue queryOrgStructInfo(long deptId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_DeptId).append("=:deptId");
		parameterMap.put("deptId", Long.valueOf(deptId));
		IBOCmGroupOrgStructValue[] structs = BOCmGroupOrgStructEngine.getBeans(condition.toString(), parameterMap);
		if (structs.length == 0) {
			return null;
		}
		return structs[0];
	}

	public void deleteGroupOrgStruct(IBOCmGroupOrgStructValue groupOrgStructValue) throws Exception {
		groupOrgStructValue.delete();
		BOCmGroupOrgStructEngine.save(groupOrgStructValue);
	}

	public IBOCmGroupOrgStructValue[] queryGroupOrgStructsByGroupId(long groupId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_ParentDeptId);
		condition.append("=(SELECT t.DEPT_ID FROM CM_GROUP_ORG_STRUCT t WHERE t.REL_OBJECT_ID=:relObjectId AND t.DEPT_TYPE=1 AND ");
		condition.append("t.").append(IBOCmGroupOrgStructValue.S_State).append("=:state)");
		parameterMap.put("relObjectId", Long.valueOf(groupId));
		return BOCmGroupOrgStructEngine.getBeans(condition.toString(), parameterMap);
	}

	public int queryGroupOrgStructCountByParentId(long parentId) throws Exception {
		int count = 0;
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_ParentDeptId).append("=:parentDeptId");
		parameterMap.put("parentDeptId", Long.valueOf(parentId));
		count = BOCmGroupOrgStructEngine.getBeansCount(condition.toString(), parameterMap);
		return count;
	}

	public IBOCmGroupOrgStructValue queryGroupOrgStructByGroupId(long relObjectId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_RelObjectId).append("=:relObjectId");
		parameterMap.put("relObjectId", Long.valueOf(relObjectId));
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_DeptType).append("=:deptType");
		parameterMap.put("deptType", Long.valueOf(1));
		IBOCmGroupOrgStructValue[] structValue = BOCmGroupOrgStructEngine.getBeans(condition.toString(), parameterMap);
		if (null == structValue || structValue.length == 0)
			return null;
		else
			return structValue[0];
	}

	public IQBOCmGroupStructTreeValue[] queryGroupOrgStructTreeByGroupId(long relObjectId, int deptType) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		// 结构类型必须为集团
		condition.append(IBOCmGroupOrgStructValue.S_DeptType).append("=:deptType");
		parameterMap.put("deptType", Integer.valueOf(deptType));
		parameterMap.put("relObjectId", Long.valueOf(relObjectId));
		return QBOCmGroupStructTreeEngine.getBeans(condition.toString(), parameterMap);
	}

	public int querySubGroupCountByGroupId(long relObjectId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_DeptType).append("=:deptType");
		condition.append(" AND ").append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		parameterMap.put("deptType", Long.valueOf(1));
		parameterMap.put("relObjectId", Long.valueOf(relObjectId));
		return QBOCmGroupStructTreeEngine.getBeansCount(condition.toString(), parameterMap);
	}

	public int queryRelObjectIdCount(long relObjectId, long deptType, long selfDeptId) throws Exception {
		int count = 0;
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_RelObjectId).append("=:relObjectId");
		parameterMap.put("relObjectId", Long.valueOf(relObjectId));
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_DeptType).append("=:deptType");
		parameterMap.put("deptType", Long.valueOf(deptType));
		if (selfDeptId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmGroupOrgStructValue.S_DeptId).append("<>:deptId");
			parameterMap.put("deptId", Long.valueOf(selfDeptId));
		}
		count = BOCmGroupOrgStructEngine.getBeansCount(condition.toString(), parameterMap);
		return count;
	}

	public void saveGroupOrgStructs(IBOCmGroupOrgStructValue[] beans) throws Exception {
		BOCmGroupOrgStructEngine.saveBatch(beans);
	}

	public int queryKeyManCount(long relObjectId, long selfDeptId) throws Exception {
		int count = 0;
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		// 指定deptType为3，就是关键人物检索
		condition.append(IBOCmGroupOrgStructValue.S_DeptType).append("=:deptType");
		parameterMap.put("deptType", Long.valueOf(3));
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_RelObjectId).append("=:relObjectId");
		parameterMap.put("relObjectId", Long.valueOf(relObjectId));
		// 当更新的时候，传入的本身selfDeptId，作为排除条件
		if (selfDeptId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmGroupOrgStructValue.S_DeptId).append("<>:deptId");
			parameterMap.put("deptId", Long.valueOf(selfDeptId));
		}
		count = BOCmGroupOrgStructEngine.getBeansCount(condition.toString(), parameterMap);
		return count;
	}

	public void deleteGroupOrgStruct(IBOCmGroupOrgStructValue[] groupOrgStructValues) throws Exception {
		for (int i = 0; i < groupOrgStructValues.length; i++) {
			groupOrgStructValues[i].setStsToOld();
			// 逻辑删除将state设置为E
			groupOrgStructValues[i].setState(CmxConstants.RECORD_STATE_DEL);
		}
		BOCmGroupOrgStructEngine.saveBatch(groupOrgStructValues);
	}

	public int queryParentsOrgStructCount(long groupId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_DeptId);
		condition.append("=(SELECT t.PARENT_DEPT_ID FROM CM_GROUP_ORG_STRUCT t WHERE t.REL_OBJECT_ID=:relObjectId AND ");
		condition.append("t.").append(IBOCmGroupOrgStructValue.S_State).append("=:state)");
		parameterMap.put("relObjectId", Long.valueOf(groupId));
		return BOCmGroupOrgStructEngine.getBeansCount(condition.toString(), parameterMap);
	}

	public IBOCmGroupOrgStructValue queryKeyManStruct(long kernelId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_RelObjectId).append("=:relObjectId");
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_DeptType).append("=:deptType");
		parameterMap.put("deptType", Long.valueOf(3));
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		parameterMap.put("relObjectId", Long.valueOf(kernelId));
		IBOCmGroupOrgStructValue[] groupOrgStructValues = BOCmGroupOrgStructEngine.getBeans(condition.toString(), parameterMap);
		if (groupOrgStructValues.length == 0) {
			return null;
		}
		return groupOrgStructValues[0];
	}

	public IBOCmGroupOrgStructValue[] queryGroupOrgStructs(long groupCustId, long parentDeptId, int start, int end) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		if (parentDeptId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmGroupOrgStructValue.S_ParentDeptId).append("=:parentDeptId");
			parameterMap.put("parentDeptId", Long.valueOf(parentDeptId));
		}
		if(groupCustId > 0){
			condition.append(" AND ");
			condition.append(IBOCmGroupOrgStructValue.S_GroupCustId).append("=:groupCustId");
			parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		}
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" ORDER  BY ");
		condition.append(IBOCmGroupOrgStructValue.S_DeptType);
		return BOCmGroupOrgStructEngine.getBeans(null, condition.toString(), parameterMap, start, end, false);
	}

	public int queryGroupOrgStructsCount(long groupCustId, long parentDeptId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		if (parentDeptId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmGroupOrgStructValue.S_ParentDeptId).append("=:parentDeptId");
			parameterMap.put("parentDeptId", Long.valueOf(parentDeptId));
		}
		if(groupCustId > 0){
			condition.append(" AND ");
			condition.append(IBOCmGroupOrgStructValue.S_GroupCustId).append("=:groupCustId");
			parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		}
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" ORDER  BY ");
		condition.append(IBOCmGroupOrgStructValue.S_DeptType);
		return BOCmGroupOrgStructEngine.getBeansCount(condition.toString(), parameterMap);
	}

	public IBOCmGroupOrgStructValue queryGroupTopOrganize(long groupCustId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameterMap = new HashMap();
		condition.append(IBOCmGroupOrgStructValue.S_State).append("=:state");
		parameterMap.put("state", CmxConstants.RECORD_STATE_USE);
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_GroupCustId).append("=:groupCustId");
		parameterMap.put("groupCustId", Long.valueOf(groupCustId));
		condition.append(" AND ");
		condition.append(IBOCmGroupOrgStructValue.S_ParentDeptId).append(" IS NULL");
		condition.append(" OR ");
		condition.append(IBOCmGroupOrgStructValue.S_ParentDeptId).append("=0");
		IBOCmGroupOrgStructValue[] results = BOCmGroupOrgStructEngine.getBeans(condition.toString(), parameterMap);
		if (results != null && results.length > 0) {
			return results[0];
		}
		return null;
	}
	
	
}
