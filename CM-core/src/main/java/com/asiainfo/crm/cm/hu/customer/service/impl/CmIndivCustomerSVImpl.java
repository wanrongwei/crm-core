package com.asiainfo.crm.cm.hu.customer.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.bo.BOIdentificationBean;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.hu.customer.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.service.impl.CmCustSegmentRelaSVImpl;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class CmIndivCustomerSVImpl implements ICmIndivCustomerSV{

	public long queryDuplicateCust(String firstName, String lastName,
			String birthPlace, String birthDate, String motherName)
			throws Exception {
		StringBuilder sql=new StringBuilder();
		sql.append(" SELECT a.`CUST_ID` FROM {CM_INDIV_CUSTOMER} a,{CMX_INDIV_CUSTOMER} b " +
				"WHERE a.`CUST_ID`=b.`CUST_ID` AND a.`FIRST_NAME`=:firstName AND a.`LAST_NAME`=:lastName AND a.`BIRTHDAY`=:birthday AND b.`EXT15`=:birthPlace AND b.`MOTHER_NAME`=:motherName ");
		Map parameter=new HashMap();
		parameter.put("firstName", firstName);
		parameter.put("lastName", lastName);
		parameter.put("birthday", birthDate);
		parameter.put("birthPlace", birthPlace);
		parameter.put("motherName", motherName);
		DataContainer[] dcs=(DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
		if(CmCommonUtil.isNotEmptyObject(dcs)){
			return dcs[0].getAsLong("CUST_ID");
		}
		return 0;
	}

	public long queryDuplicateCustByCertCode(String custCertType,
			String custCertCode) throws Exception {
		StringBuilder condition=new StringBuilder(" 1=1 ");
		Map parameter=new HashMap();
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertType).append(" =:custCertType ");
		parameter.put("custCertType",custCertType);
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertCode).append(" =:custCertCode ");
		parameter.put("custCertCode",custCertCode);
		IBOCmIndivCustomerValue[] values=(IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(), parameter, -1, -1);
		if(CmCommonUtil.isNotEmptyObject(values)){
			return values[0].getCustId();
		}
		return 0;
	}

	public void saveCustSegmentRela(IBOCmCustSegmentRelaValue value)
			throws Exception {
		if(CmCommonUtil.isNotEmptyObject(value)){
			long custId=value.getCustId();
			long segmentId=value.getSegmentId();
			//查询是否有细分
			ICmCustSegmentRelaSV relaSV=(ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
			IBOCmCustSegmentRelaValue relaValue=relaSV.querySegmentRelaByCustId(custId);
			if(CmCommonUtil.isNotEmptyObject(relaValue) && relaValue.getSegmentId()!=segmentId){
				//修改
				relaValue.setSegmentId(segmentId);
				//保存细分
				relaSV.saveSegmentRela(relaValue);
			}else{
				//新增
				value.setRelaId(CmCommonUtil.getNewSequence(BOCmCustSegmentRelaBean.class));
				value.setState(CmConstants.RecordState.USE);
				value.setRegionId(CmCommonUtil.getDefaultRegionId());
				//保存细分
				relaSV.saveSegmentRela(value);
			}
		}
	}

	public IBOIdentificationValue[] queryIdentification(long partyId,int startIndex,int endIndex)
			throws Exception {
		StringBuilder condition=new StringBuilder(" 1=1 ");
		Map parameter=new HashMap();
		condition.append(" AND ").append(IBOIdentificationValue.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		condition.append(" AND ").append(IBOIdentificationValue.S_IdenType).append(" not in (5,6) ");
		IBOIdentificationValue[] values=(IBOIdentificationValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOIdentificationBean.class, condition.toString(), parameter, startIndex, endIndex);
		if(CmCommonUtil.isNotEmptyObject(values)){
			String editor="";
			String delete="";
			for(int i=0;i<values.length;i++){
				editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyIdentification(" + String.valueOf(values[i].getIdenId()) + "," + i
						+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteIdentification(\"" + String.valueOf(values[i].getIdenId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				values[i].setAction(editor + delete);
			}
			return values;
		}
		return new IBOIdentificationValue[0];
	}

	public int queryIdentificationCount(long partyId) throws Exception {
		StringBuilder condition=new StringBuilder(" 1=1 ");
		Map parameter=new HashMap();
		condition.append(" AND ").append(IBOIdentificationValue.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		condition.append(" AND ").append(IBOIdentificationValue.S_IdenType).append(" not in (5,6) ");
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOIdentificationBean.class, condition.toString(), parameter);
	}

	public void saveIdentification(IBOIdentificationValue[] values)
			throws Exception {
		CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) values);
	}

}
;