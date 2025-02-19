package com.asiainfo.crm.cm.ln.customer.group.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustRelQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.customer.group.bo.BoCmGroupAccountingBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmGroupAccountingValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmGroupInfoBean;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupMemberBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmGroupInfoValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupMemberValue;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;

public class CmLnGroupSVImpl implements ICmLnGroupSV {

	public IBOLnCmxGroupMemberValue queryLnGroupMemberExt(long relCustId) throws Exception {
		// IBOLnCmxGroupMemberValue cmxGroupMemberValue = new BOLnCmxGroupMemberBean();
		// cmxGroupMemberValue.setCustRelId(relCustId);
		// DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface)
		// cmxGroupMemberValue);
		// return (IBOLnCmxGroupMemberValue) dc;
		return null;
	}

	public void saveGroupMemberExt(IBOLnCmxGroupMemberValue[] cmxGroupMemberValues) throws Exception {
		int len = cmxGroupMemberValues.length;
		BOLnCmxGroupMemberBean[] groupMemberBeans = new BOLnCmxGroupMemberBean[len];
		for (int i = 0; i < len; i++) {
			groupMemberBeans[i] = new BOLnCmxGroupMemberBean();
			groupMemberBeans[i].copy(cmxGroupMemberValues[i]);
			if (StringUtils.isBlank(groupMemberBeans[i].getState())) {
				groupMemberBeans[i].setState(CmConstants.RecordState.USE);
			}
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(groupMemberBeans);

	}

	public IGroupMemberValue[] queryGroupMembersById(long custId, int startNum, int endNum) throws Exception {
		return (IGroupMemberValue[]) ((AbstractCustRelQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustRelQueryBusiModelImpl.class)).querygroupCustMemberValueByCustId(
				custId, startNum, endNum);
	}

	public int queryGroupMemberCount(long custId) throws Exception {
		return queryGroupMembersById(custId, -1, 1).length;
	}

	public IBOLnCmxGroupCustValue queryGroupCustExtById(long custId) throws Exception {
		IBOLnCmxGroupCustValue cmxGroupCustValue = new BOLnCmxGroupCustBean();
		cmxGroupCustValue.setCustId(custId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmxGroupCustValue);
		return (IBOLnCmxGroupCustValue) dc;
	}
	
	public IBoCmGroupAccountingValue queryGroupAccountingById(long custId) throws Exception {
		IBoCmGroupAccountingValue cmGroupAccountValue = new BoCmGroupAccountingBean();
		cmGroupAccountValue.setCustId(custId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmGroupAccountValue);
		IBoCmGroupAccountingValue val = null;
		val = (IBoCmGroupAccountingValue)dc;
		return val;
	}

	public void saveGroupCustExt(IBOLnCmxGroupCustValue[] cmxGroupCustValues) throws Exception {
		int len = cmxGroupCustValues.length;
		BOLnCmxGroupCustBean[] groupCustBeans = new BOLnCmxGroupCustBean[len];
		for (int i = 0; i < len; i++) {
			groupCustBeans[i] = new BOLnCmxGroupCustBean();
			groupCustBeans[i].copy(cmxGroupCustValues[i]);
			if (StringUtils.isBlank(groupCustBeans[i].getState())) {
				groupCustBeans[i].setState(CmConstants.RecordState.USE);
			}
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(groupCustBeans);
	}

	@Override
	public void saveCmxGroupCustomer(IBOLnCmxGroupCustValue cmxGroupCustValue) throws Exception {
		if (cmxGroupCustValue != null) {
			BOLnCmxGroupCustBean groupCustomerBean = new BOLnCmxGroupCustBean();
			groupCustomerBean.copy(cmxGroupCustValue);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(groupCustomerBean);
		}
	}

	public DataContainerInterface[] queryLowerGroupInfosByCustId(long custId, int startNum, int endNum) throws Exception {

		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerValue.S_ParentCustId).append(" =:custId ");
			parameter.put("custId", Long.valueOf(custId));
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupCustomerBean.class, condition.toString(), parameter, startNum, endNum);
	}

	public int queryLowerGroupInfosCountByCustId(long custId) throws Exception {
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmGroupCustomerValue.S_ParentCustId).append(" =:custId ");
			parameter.put("custId", Long.valueOf(custId));
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupCustomerBean.class, condition.toString(), parameter);
	}

	public ICustomerValue queryParentGroupInfoByCustid(long custId) throws Exception {
		ICustomerValue value = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);

		if (value != null && value.getParentCustId() > 0)
			value = CmServiceFactory.getCustomerSV().queryCustomerByCustId(value.getParentCustId());
		else
			return new CustomerBean();

		return value;
	}

	public IBOLnCmGroupInfoValue[] queryGroupInfos(DataContainer condition, int startNum, int endNum) throws Exception {

		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { condition }, BOLnCmGroupInfoBean.class);
		IBOLnCmGroupInfoValue[] boGroupInfoValue = (IBOLnCmGroupInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(boGroupInfoValue)) {
			return new IBOLnCmGroupInfoValue[0];
		}
		return boGroupInfoValue;
	}

	
	public IBOLnCmxGroupCustValue queryGroupCustExtByIdAndLog(long custId) throws Exception {
		IBOLnCmxGroupCustValue cmxGroupCustValue = new BOLnCmxGroupCustBean();
		cmxGroupCustValue.setCustId(custId);
		//保存查询记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map queryParam = new HashMap();
		queryParam.put("custId", custId);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " "+ Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.CUST_QRY, CmConstants.BusiLogType.CUSTOMER_LOG, custId, CmConstants.BusiLogOperType.QUERY, "", queryParam, methodDetail);
		
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmxGroupCustValue);
		IBOLnCmxGroupCustValue val = null;
		val = (IBOLnCmxGroupCustValue) dc;
//		if(val != null && StringUtils.isNotBlank(val.getCorporateIdentificationNumbe())){
//			BOMaskHelper.setOperateNotMaskFlag();
			//modify at2015-6-26 模糊化法人识别号	
//			String cprNum = val.getCorporateIdentificationNumbe();
//			if(cprNum.length() == 10){
//				StringBuilder sb = new StringBuilder(cprNum.length());
//				sb.append(cprNum.substring(0, 6));
//				for(int i=0; i<cprNum.length()-6;i++){
//					sb.append("*");
//				}
//				val.setDiaplayAttr("CORPORATE_IDENTIFICATION_NUMBE", "CORPORATE_IDENTIFICATION_NUMBE_NAME", sb.toString());
//			}
//		}
		return val;
	}
}
