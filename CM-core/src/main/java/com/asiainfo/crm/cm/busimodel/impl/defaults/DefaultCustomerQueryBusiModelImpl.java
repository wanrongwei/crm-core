/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.cache.BsOperatorsCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOBsOperatorsValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmFamilyCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmGroupCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmVirtualCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.service.impl.CmPartySVImpl;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumUsedValue;
import com.asiainfo.crm.res.teaminvoke.out.service.interfaces.IRes2InterFSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmExtFSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName DefaultCustQueryDealModelImpl
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午3:07:57
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 * 2012-05-29     huzq2           v1.0.0               修改所有查询方式为使用客户管理通用服务查询，以便支持通过自定义的查询BO等来查询客户信息
 */
public class DefaultCustomerQueryBusiModelImpl extends AbstractCustomerQueryBusiModelImpl {

	private static transient Log log = LogFactory.getLog(DefaultCustomerQueryBusiModelImpl.class);

	protected void afterQueryCustomerByCustId(ICustomerValue result) throws Exception {
		// add by zhuyy at 2014-4-24,添加集团客户子类型字段的展示
		IBOCmCustSegmentRelaValue segmentRela = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).querySegmentRelaByCustId(result.getCustId());
		if (segmentRela != null) {
			IBoCmCustSegmentValue segment = ((ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class)).querySegmentByIdfromCache(segmentRela.getSegmentId());
			result.set(ICustomerValue.S_GroupSegmentId, String.valueOf(segment.getSegmentName()));
			result.set(ICustomerValue.S_CustSegment, segment.getSegmentId());
		}

		// 运营商标识名称
		if (!CmCommonUtil.isEmptyObj(result.getEcCode())) {
			IBOBsOperatorsValue val = (IBOBsOperatorsValue) CacheFactory.get(BsOperatorsCacheImpl.class,
					BsOperatorsCacheImpl.IDX_BY_KEY + BsOperatorsCacheImpl.SPLIT_CODE + result.getEcCode());
			result.setBadPayer(val.getOperatorsName());
		}
		if (result.getCustType() == CmConstants.CustomerType.GROUP) {
			ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			IBOCmGroupCustAttrValue[] groupCustAttrValues = groupCustomerSV.queryGroupCustAttrsByGroupId(result.getCustId());
			if (groupCustAttrValues != null && groupCustAttrValues.length > 0) {
				for (int i = 0; i < groupCustAttrValues.length; i++) {
					result.set(groupCustAttrValues[i].getAttrCode(), groupCustAttrValues[i].getAttrValue());
				}
			}
		}
		// 根据partyId查询客户语言
		long partyId = result.getPartyId();
		ICmPartySV partySV = (ICmPartySV)ServiceFactory.getService(ICmPartySV.class);
		IPartyValue value = partySV.queryPartyById(partyId);
		if(CmCommonUtil.isNotEmptyObject(value)){
			result.setPerferLanguage(value.getPerferLanguage());
		}else{
			//默认塞上丹麦语言
			result.setPerferLanguage("1");
		}
	}
	
	protected Parameter createQueryGroupCustParam(DataContainer[] dcs) throws Exception {
		Map prop = new HashMap();
		for (int i = 0; i < dcs.length; i++) {
			prop.putAll(dcs[i].getProperties());
		}
		int matchType = DataType.getAsInt(prop.get(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE));
		// 判断前台输入的匹配方式，如果是精确匹配则直接构造查询条件
		if (matchType == CmConstants.MatchType.EXACT_MATCH) {
			return ParamUtil.buildParameter(dcs, QBOCmGroupCustomerBean.class);
		}
		if (matchType == CmConstants.MatchType.BOTH_MATCH) {
			return ParamUtil.buildParameter(dcs, QBOCmGroupCustomerBean.class, new String[] { QBOCmGroupCustomerBean.S_CustName });
		}
		// 否则构造右端模糊的查询条件
		return ParamUtil.buildParameter(dcs, QBOCmGroupCustomerBean.class, new String[] { QBOCmGroupCustomerBean.S_CustName });
	}

	protected Parameter createQueryIndivCustParam(DataContainer[] dcs) throws Exception {
		// 个人客户查询增加过滤，只有客户子类型为客户的，才能查询出来
		Map prop = new HashMap();
		for (int i = 0; i < dcs.length; i++) {
			prop.putAll(dcs[i].getProperties());
		}
		int matchType = DataType.getAsInt(prop.get(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE));
		// 判断前台输入的匹配方式，如果是精确匹配则直接构造查询条件
		if (matchType == CmConstants.MatchType.EXACT_MATCH) {
			return ParamUtil.buildParameter(dcs, QBOCmIndivCustomerBean.class);
		}
		return ParamUtil.buildParameter(dcs, QBOCmIndivCustomerBean.class, new String[] { QBOCmIndivCustomerBean.S_CustName });
	}

	protected long getCustIdFromBillId(String billId) throws Exception {
		ISoUserValue userValue = null;
		IBOResPhoneNumUsedValue phoneNumUsedValue = null;
		String regionId = CenterUtil.getRegionIdByBillId(billId);
		ICrmExtFSV extFSV = (ICrmExtFSV) ServiceFactory.getService(ICrmExtFSV.class);
		IOrdCustValue ordCustValue = null;
		if (StringUtils.isNotBlank(regionId)) {
			userValue = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
			if (userValue == null) {
				// 查询在途单
				ordCustValue = extFSV.getOrderCustByBillId(billId);
			}
		} else {
			ordCustValue = extFSV.getOrderCustByBillId(billId);
			if (ordCustValue == null) {
				IRes2InterFSV res2InterFSV = (IRes2InterFSV) ServiceFactory.getService(IRes2InterFSV.class);
				phoneNumUsedValue = res2InterFSV.queryUsedNum(null, billId);
			}
		}
		// 优先取订单里面的
		if (ordCustValue != null) {
			return ordCustValue.getCustId();
		}
		// 如果查询不到用户信息应该抛出异常，不应该返回-1等值。
		if ((phoneNumUsedValue == null || CmCommonUtil.isEmptyObject(phoneNumUsedValue)) && (userValue == null || CmCommonUtil.isEmptyObject(userValue))) {
			// 根据计费号码{0}没有查询到对应的用户信息！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0031147", billId));
			}
			ExceptionUtil.throwBusinessException("CMS0031147", billId);
		}
		return phoneNumUsedValue == null ? userValue.getCustId() : Long.parseLong(phoneNumUsedValue.getReceiver());
	}

	protected void prepareCondition(DataContainer[] conditionDCs) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(conditionDCs) && conditionDCs[0].getPropertyNames().length > 0) {
			// 默认实现认为前台传入的条件
			DataContainer dc = conditionDCs[0];
			// 根据手机号码查询客户
			if (dc.hasProperty(ISoUserValue.S_BillId) && StringUtils.isNotBlank(dc.getAsString(ISoUserValue.S_BillId))) {
				// 实现根据手机号码查询客户的业务逻辑
				long custId = getCustIdFromBillId(dc.getAsString(ISoUserValue.S_BillId));
				if (dc.hasProperty(ICustomerValue.S_CustId) && StringUtils.isNotBlank(dc.getAsString(ICustomerValue.S_CustId)) && dc.getAsInt(ICustomerValue.S_CustId) != -1) {
					// 如果前台给定的客户编号与根据计费号码查询得到的客户编号不一致则直接返回空，因为一个计费号码已经确定了一个客户，如果这两个客户编号不一致肯定查询不到客户。
					if (custId != dc.getAsLong(ICustomerValue.S_CustId)) {
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0002038"));
						}
						ExceptionUtil.throwBusinessException("CMS0002038");// 手机号码与客户编号不匹配！
					}
				} else {
					dc.set(ICustomerValue.S_CustId, custId);
				}
			}
			if (dc.hasProperty("IMEI") && StringUtils.isNotBlank(dc.getAsString("IMEI"))) {
				long custId = 1;
				// 根据IMEI查询custId
				// CenterFactory.setCenterInfoByTypeAndValue("REGION_ID", CmCommonUtil.getDefaultRegionId());
				ICrmFSV crmfSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
				ICustomerValue value = crmfSV.querySeriRel(dc.getAsString("IMEI"));
				custId = value.getCustId();
				if (dc.hasProperty(ICustomerValue.S_CustId) && StringUtils.isNotBlank(dc.getAsString(ICustomerValue.S_CustId)) && dc.getAsInt(ICustomerValue.S_CustId) != -1) {
					// 如果前台给定的客户编号与根据IMEI号查询得到的客户编号不一致则直接返回空，因为一个IMEI号码已经确定了一个客户，如果这两个客户编号不一致肯定查询不到客户。
					if (custId != dc.getAsLong(ICustomerValue.S_CustId)) {
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS9978716"));
						}
						ExceptionUtil.throwBusinessException("CMS9978716");// IMEI号与客户编号不匹配！
					}
				} else {
					dc.set(ICustomerValue.S_CustId, custId);
				}
			}
			// 先获取一下客户类型，如果获到客户类型，则直接调用相应的服务查询，否则需要查询出符合条件的参与人，然后在根据参与人编号查询对应的客户信息。
			int custType = -1;
			// 如果前台没有传入客户类型，但传入了客户编号，则从客户编号中获取客户类型
			if (!dc.hasProperty(ICustomerValue.S_CustType) && dc.hasProperty(ICustomerValue.S_CustId) && StringUtils.isNotBlank(dc.getAsString(ICustomerValue.S_CustId))
					&& dc.getAsInt(ICustomerValue.S_CustId) != -1) {
				custType = CmCommonUtil.getCustType(dc.getAsLong(ICustomerValue.S_CustId));
				dc.set(ICustomerValue.S_CustType, custType);
			}

			// 如果传入证件号码，集团需要自动补零
			if (dc.hasProperty(ICustomerValue.S_CustCertCode) && dc.getAsInt(ICustomerValue.S_CustType) == CmConstants.CustomerType.GROUP) {
				String certCode = dc.getAsString(ICustomerValue.S_CustCertCode);
				if (StringUtils.isNotBlank(certCode) && !certCode.contains("K")) {
					certCode = StringUtils.leftPad(certCode, 10, "0");
				}
				dc.set(ICustomerValue.S_CustCertCode, certCode);
			}
		} else {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030039", ""));
			}
			ExceptionUtil.throwBusinessException("CMS0030039", "");// 查询条件{0}不能为空！
		}
	}

	protected Parameter buildParameter(long custId, int custType, String state) throws Exception {
		Class beanClass = null;
		switch (custType) {
			case CmConstants.CustomerType.INDIVIDUAL:// 个人客户
				beanClass = QBOCmIndivCustomerBean.class;
				break;
			case CmConstants.CustomerType.FAMILY: // 家庭客户
				beanClass = QBOCmFamilyCustomerBean.class;
				break;
			case CmConstants.CustomerType.GROUP: // 集团客户
				beanClass = QBOCmGroupCustomerBean.class;
				break;
			case CmConstants.CustomerType.VIRTUAL: // 虚拟客户
				beanClass = QBOCmVirtualCustomerBean.class;
				break;
			default:
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030012"));
				}
				ExceptionUtil.throwBusinessException("CMS0030012");
				break;
		}
		CustomerBean sample = new CustomerBean();
		sample.setCustId(custId);
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.RECORD_STATE, state) != null) {
			sample.setState(state);
		}
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { sample }, beanClass);
		return parameter;
	}

	protected Parameter buildParameter(DataContainer[] conditions) throws Exception {
		Map prop = new HashMap();
		for (int i = 0; i < conditions.length; i++) {
			prop.putAll(conditions[i].getProperties());
		}
		int custType = -1;
		if (prop.containsKey(ICustomerValue.S_CustType)) {
			custType = DataType.getAsInt(prop.get(ICustomerValue.S_CustType));
		} else if (prop.containsKey(ICustomerValue.S_CustId)) {
			custType = CmCommonUtil.getCustType(DataType.getAsLong(prop.get(ICustomerValue.S_CustId)));
		}
		switch (custType) {
			case CmConstants.CustomerType.INDIVIDUAL: // 个人客户
				return createQueryIndivCustParam(conditions);
			case CmConstants.CustomerType.FAMILY: // 家庭客户
				return createQueryFamilyCustParam(conditions);
			case CmConstants.CustomerType.GROUP: // 集团客户
				return createQueryGroupCustParam(conditions);
			case CmConstants.CustomerType.VIRTUAL: // 虚拟客户
				return createQueryVirtualCustParam(conditions);
			default:
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030012"));
				}
				ExceptionUtil.throwBusinessException("CMS0030012");
				break;
		}
		return null;
	}

	protected Parameter createQueryVirtualCustParam(DataContainer[] conditions) throws Exception {
		Map prop = new HashMap();
		for (int i = 0; i < conditions.length; i++) {
			prop.putAll(conditions[i].getProperties());
		}
		int matchType = DataType.getAsInt(prop.get(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE));
		// 判断前台输入的匹配方式，如果是精确匹配则直接构造查询条件
		if (matchType == CmConstants.MatchType.EXACT_MATCH) {
			return ParamUtil.buildParameter(conditions, QBOCmVirtualCustomerBean.class);
		}
		return ParamUtil.buildParameter(conditions, QBOCmVirtualCustomerBean.class, new String[] { QBOCmVirtualCustomerBean.S_CustName });
	}

	protected Parameter createQueryFamilyCustParam(DataContainer[] conditions) throws Exception {
		Map prop = new HashMap();
		for (int i = 0; i < conditions.length; i++) {
			prop.putAll(conditions[i].getProperties());
		}
		int matchType = DataType.getAsInt(prop.get(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE));
		// 判断前台输入的匹配方式，如果是精确匹配则直接构造查询条件
		if (matchType == CmConstants.MatchType.EXACT_MATCH) {
			return ParamUtil.buildParameter(conditions, QBOCmFamilyCustomerBean.class);
		}
		return ParamUtil.buildParameter(conditions, QBOCmFamilyCustomerBean.class, new String[] { QBOCmFamilyCustomerBean.S_CustName });
	}

	protected Parameter buildCustomerBatchQueryParam(long[] custIds, String colName, int custType) throws Exception {
		Parameter parameter = ParamUtil.buildInParameter(custIds, ICustomerValue.S_CustId);
		switch (custType) {
			case CmConstants.CustomerType.INDIVIDUAL:
				parameter.setBeanClass(QBOCmIndivCustomerBean.class);
				break;
			case CmConstants.CustomerType.FAMILY:
				parameter.setBeanClass(QBOCmFamilyCustomerBean.class);
				break;
			case CmConstants.CustomerType.GROUP:
				parameter.setBeanClass(QBOCmGroupCustomerBean.class);
				break;
			case CmConstants.CustomerType.VIRTUAL:
				parameter.setBeanClass(QBOCmVirtualCustomerBean.class);
				break;
			default:
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030012"));
				}
				ExceptionUtil.throwBusinessException("CMS0030012");
				break;
		}
		return parameter;
	}

	protected Parameter buildCustomerBatchQueryParam(String[] colValues, String colName, int custType) throws Exception {
		Parameter parameter = ParamUtil.buildInParameter(colValues, colName);
		switch (custType) {
			case CmConstants.CustomerType.INDIVIDUAL:
				parameter.setBeanClass(QBOCmIndivCustomerBean.class);
				break;
			case CmConstants.CustomerType.FAMILY:
				parameter.setBeanClass(QBOCmFamilyCustomerBean.class);
				break;
			case CmConstants.CustomerType.GROUP:
				parameter.setBeanClass(QBOCmGroupCustomerBean.class);
				break;
			case CmConstants.CustomerType.VIRTUAL:
				parameter.setBeanClass(QBOCmVirtualCustomerBean.class);
				break;
			default:
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030012"));
				}
				ExceptionUtil.throwBusinessException("CMS0030012");
				break;
		}
		return parameter;
	}

	protected Parameter buildManagedCustomerParameter(long managerId, int custType, DataContainer otherConditionDC) throws Exception {
		Parameter param = new Parameter();
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(ICustomerValue.S_State).append(" = :STATE ");
		parameter.put("STATE", "U");
		if (otherConditionDC.hasProperty("START_CREATE_DATE") && StringUtils.isNotBlank(otherConditionDC.getAsString("START_CREATE_DATE"))) {
			condition.append(" AND ").append(ICustomerValue.S_CreateDate).append(" >= DATE_FORMAT( :STARTCREATEDATE ,'%Y-%m-%d %H:%i:%s')");
			parameter.put("STARTCREATEDATE", otherConditionDC.getAsString("START_CREATE_DATE"));
		}
		if (otherConditionDC.hasProperty("END_CREATE_DATE") && StringUtils.isNotBlank(otherConditionDC.getAsString("END_CREATE_DATE"))) {
			condition.append(" AND ").append(ICustomerValue.S_CreateDate).append(" <= DATE_FORMAT( :ENDCREATEDATE ,'%Y-%m-%d %H:%i:%s') ");
			parameter.put("ENDCREATEDATE", otherConditionDC.getAsString("END_CREATE_DATE") + " 23:59:59");
		}
		// 支持多选框改造
		StringBuffer custStatus = new StringBuffer();
		if (otherConditionDC.hasProperty("CUST_STATUS") && StringUtils.isNotBlank(otherConditionDC.getAsString("CUST_STATUS"))) {
			if (otherConditionDC.getAsString("CUST_STATUS").indexOf(",") > -1) {
				if (CmConstants.CustomerType.INDIVIDUAL == custType) {
					custStatus.append(" AND ").append("A." + ICustomerValue.S_CustStatus).append(" IN (").append(otherConditionDC.getAsString("CUST_STATUS")).append(") ");
				} else if (CmConstants.CustomerType.GROUP == custType) {
					custStatus.append(" AND ").append("GC." + ICustomerValue.S_CustStatus).append(" IN (").append(otherConditionDC.getAsString("CUST_STATUS")).append(") ");
				}
				otherConditionDC.clearProperty("CUST_STATUS");
			} else {
				custStatus.append(" AND ").append("GC." + ICustomerValue.S_CustStatus).append(" = " + otherConditionDC.getAsString("CUST_STATUS"));
				otherConditionDC.clearProperty("CUST_STATUS");
			}
		}
		if (managerId > 0) {
			condition.append(" AND ").append(ICustomerValue.S_CustId).append(" IN ( ").append("SELECT ").append(ICustManagerValue.S_CustId).append(" FROM ");
		} else {// 支持多选框改造
			if (!CmCommonUtil.isEmptyObj(custStatus)) {
				condition.append(custStatus);
			}
		}

		switch (custType) {
			case CmConstants.CustomerType.INDIVIDUAL:
				if (managerId > 0) {
					condition.append(BOCmIndivManagerBean.getObjectTypeStatic().getMapingEnty());
				}
				param.setBeanClass(QBOCmIndivCustomerBean.class);
				break;
			case CmConstants.CustomerType.GROUP:
				if (managerId > 0) {
					condition.append(BOCmGroupManagerBean.getObjectTypeStatic().getMapingEnty());
				}
				param.setBeanClass(QBOCmGroupCustomerBean.class);
				break;
			default:
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030012"));
				}
				ExceptionUtil.throwBusinessException("CMS0030012");
				break;
		}
		if (managerId > 0) {
			condition.append(" WHERE ").append(ICustManagerValue.S_ManagerId).append(" = :managerId ");
			condition.append(")");
			parameter.put("managerId", managerId);
			// 支持多选框改造
			if (!CmCommonUtil.isEmptyObj(custStatus)) {
				parameter.put("CUST_STATUS", custStatus);
			}
		}
		// 拼接其他的查询条件
		Map otherProp = ParamUtil.transferDataContainersToMap(new DataContainer[] { otherConditionDC });
		if (CmCommonUtil.isNotEmptyObject(otherProp)) {
			Parameter otherParameter = ParamUtil.buildParameter(otherProp, param.getBeanClass(), new String[] { ICustomerValue.S_CustName, ICustomerValue.S_CustAddress,
					ICustomerValue.S_CustCertAddress });
			// add By liaosc
			condition.append(" AND ");
			// add end
			condition.append(param.getCondition()).append(otherParameter.getCondition());
			parameter.putAll(otherParameter.getParameter());
		}
		param.setCondition(condition.toString());
		param.setParameter(parameter);
		return param;
	}

	protected void wrapDynamicListBoxField(ICustomerValue customerValue) throws Exception {

		/*
		 * // 设置国家显示值 if (StringUtils.isNotBlank(customerValue.getNationality())) {
		 * customerValue.setDiaplayAttr(ICustomerValue.S_Nationality, ICustomerValue.S_Nationality, ((object =
		 * BsCommonDistrictUtil.getCommonDistrictById(DataType.getAsLong(customerValue.getNationality()))) == null) ?
		 * customerValue.getNationality() : ((IBOBsCommonDistrictValue) object).getDistrictName()); } // 设置省份显示值 if
		 * (StringUtils.isNotBlank(customerValue.getProvinceId())) { object =
		 * BsCommonDistrictUtil.getCommonDistrictById(DataType.getAsLong(customerValue.getProvinceId())) == null ?
		 * customerValue.getProvinceId() : ((IBOBsCommonDistrictValue) object).getDistrictName();
		 * customerValue.setDiaplayAttr(ICustomerValue.S_ProvinceId, ICustomerValue.S_ProvinceId,object); } // 设置地市显示值
		 * if (StringUtils.isNotBlank(customerValue.getCityId())) {
		 * customerValue.setDiaplayAttr(ICustomerValue.S_CityId, ICustomerValue.S_CityId, ((object =
		 * BsCommonDistrictUtil.getCommonDistrictById(DataType.getAsLong(customerValue.getCityId()))) == null) ?
		 * customerValue.getCityId() : ((IBOBsCommonDistrictValue) object).getDistrictName()); }
		 */
		// 设置区县显示值
		if (StringUtils.isNotBlank(customerValue.getRegionType())) {
			Object object = BsCommonDistrictUtil.getCommonDistrictById(DataType.getAsLong(customerValue.getRegionType())) == null ? customerValue.getRegionType()
					: ((IBOBsCommonDistrictValue) BsCommonDistrictUtil.getCommonDistrictById(DataType.getAsLong(customerValue.getRegionType()))).getDistrictName();
			customerValue.setDiaplayAttr(ICustomerValue.S_RegionType, ICustomerValue.S_RegionType, object);
			customerValue.initProperty(ICustomerValue.S_RegionType + "_SHOW", object);
		}
		// 设置区县显示值
		if (customerValue.getOpId() >= 0) {
			IQBOSecOrgStaffOperValue object = CmServiceFactory.getTeamInvokeSV().getOperQBOByOperId(customerValue.getOpId());
			if (object != null) {
				customerValue.initProperty("OP_NAME", object.getStaffName());
			} else {
				customerValue.initProperty("OP_NAME", customerValue.getOpId());
			}

		}
		/*
		 * // 设置片区显示值 if (StringUtils.isNotBlank(customerValue.getSubRegionType())) {
		 * customerValue.setDiaplayAttr(ICustomerValue.S_SubRegionType, ICustomerValue.S_SubRegionType, ((object =
		 * BsCommonDistrictUtil.getCommonDistrictById(DataType.getAsLong(customerValue.getSubRegionType()))) == null) ?
		 * customerValue.getSubRegionType() : ((IBOBsCommonDistrictValue) object).getDistrictName()); }
		 */
	}

	public boolean isRealNameCustomer(long custId) throws Exception {
		return false;
	}

}
