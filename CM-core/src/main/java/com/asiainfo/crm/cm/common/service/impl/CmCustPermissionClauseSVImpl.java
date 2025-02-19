package com.asiainfo.crm.cm.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.bo.BOCmCustPermissionClauseBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustPermissionClauseValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCustPermissionClauseSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupContactBindingBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupContactBindingValue;
import com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecordBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;



public class CmCustPermissionClauseSVImpl implements ICmCustPermissionClauseSV{

	public  IBOCmCustPermissionClauseValue[] qryCmCustPermissionClause(String parentClauseId,int startIndex,int endIndex) throws Exception{
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if(StringUtils.isNotEmpty(parentClauseId)){
			condition.append(" AND ").append(IBOCmCustPermissionClauseValue.S_ParentClauseId).append(" =:id ");
			parameter.put("id", parentClauseId);
			IBOCmCustPermissionClauseValue[] values=(IBOCmCustPermissionClauseValue[])CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustPermissionClauseBean.class, condition.toString(), parameter, startIndex, endIndex);
			if(CmCommonUtil.isNotEmptyObject(values)){
				for(int i=0;i<values.length;i++){
					String editor="";
					String delete="";
					editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyPermission(" +i + ","
					+ String.valueOf(values[i].getClauseId()) + ")' style='color:blue;margin-left:5px;text-decoration:underline'>"
					+ CrmLocaleFactory.getResource("CMS0013081") +"</a>";
					delete = "<a href='javascript:void(0)' class='cellpath' onclick='deletePermission(\"" + String.valueOf(values[i].getClauseId())
					+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
					values[i].setAction(editor+delete);
				}
				return values;
			}
	}
	return new IBOCmCustPermissionClauseValue[0];
	}

	public int qryCmCustPermissionClauseCount(String parentClauseId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if(StringUtils.isNotEmpty(parentClauseId)){
			condition.append(" AND ").append(IBOCmCustPermissionClauseValue.S_ParentClauseId).append(" =:id ");
			parameter.put("id", parentClauseId);
			return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustPermissionClauseBean.class, condition.toString(), parameter);
		}
		return 0;
	}

	public void saveCustPermission(IBOCmCustPermissionClauseValue[] values)
			throws Exception {
		if(CmCommonUtil.isNotEmptyObject(values)){
			List<BOCmCustPermissionClauseBean> list=new ArrayList<BOCmCustPermissionClauseBean>();
			for(IBOCmCustPermissionClauseValue value: values){
				BOCmCustPermissionClauseBean bean=new BOCmCustPermissionClauseBean();
				bean.copy(value);
				list.add(bean);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(list.toArray(new BOCmCustPermissionClauseBean[0]));
		}
		//保存历史 
		for(int i=0;i<values.length;i++){
			ICmCommonSV commonSV=(ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			long businessId=0L;
			if(values[i].isModified()){
				ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
				BOCmHisRecordBean recordBean = null;
				long parentClauseId=values[i].getParentClauseId();
				IBOCmCustPermissionClauseValue clauseValue=qryCmCustPermissionInfo(String.valueOf(parentClauseId));
				String name="";
				if(CmCommonUtil.isNotEmptyObject(clauseValue)){
					name=clauseValue.getClauseContent();
				}
				recordBean = sv.convertHisRecord(new DataStructInterface[] { values[i] }, CmConstants.HisRecordType.PERMISSION, name,
						values[i].getClauseId());
				sv.saveHisRecord(recordBean);
				businessId=CmConstants.BusiLogId.PERMISSION_CLUASE_EDIT;
			}else if(values[i].isNew()){
				businessId=CmConstants.BusiLogId.PERMISSION_CLUASE_ADD;
			}else if(values[i].isDeleted()){
				businessId=CmConstants.BusiLogId.PERMISSION_CLUASE_DELETE;
			}
			commonSV.saveCommonBusiLog(businessId,new DataStructInterface[]{values[i]},CmConstants.BusiLogType.CUSTOMER_LOG, -1);
		}
	}
	public  IBOCmCustPermissionClauseValue qryCmCustPermissionInfo(String clauseId) throws Exception{
		StringBuffer condition=new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();	
		condition.append(" AND ").append(IBOCmCustPermissionClauseValue.S_ClauseId).append(" =:id ");
		parameter.put("id", clauseId);
		IBOCmCustPermissionClauseValue[] values=(IBOCmCustPermissionClauseValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustPermissionClauseBean.class, condition.toString(), parameter, -1, -1);
		if (values != null && values.length > 0) {
			return values[0];
		}
		return null; 
	}
}