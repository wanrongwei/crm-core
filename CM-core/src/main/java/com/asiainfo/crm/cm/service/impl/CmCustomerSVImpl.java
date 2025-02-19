package com.asiainfo.crm.cm.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.web.URLDecoder;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.instance.bo.InsCmRelBean;
import com.ai.omframe.instance.ivalues.IInsCmRelValue;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsUserOsStateValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.service.interfaces.IInstanceQrySV;
import com.ai.omframe.order.data.ivalues.ISoAttrData;
import com.ai.omframe.order.data.valuebean.SoAttrData;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.omframe.util.InsServiceFactory;
import com.ai.omframe.util.SoServiceFactory;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecGroupValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.agreement.teaminvoke.out.service.interfaces.IAgreementFSV;
import com.asiainfo.crm.bill.teaminvoke.out.interfaces.IInterfaceBillCrmSV;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustManagerDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustManagerQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustMemberQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustOrganizeQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustRelQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmCprToTTBean;
import com.asiainfo.crm.cm.common.bo.BOCmCustBadRecordBean;
import com.asiainfo.crm.cm.common.bo.BOCmInsCmrelBean;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsCustLifecycleHBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsPublicDealHBean;
import com.asiainfo.crm.cm.common.bo.BOIdentificationBean;
import com.asiainfo.crm.cm.common.bo.QBOCmCustRequestBean;
import com.asiainfo.crm.cm.common.cache.CmIndustryCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCprToTTValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustBadRecordValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsCustLifecycleHValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealHValue;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmCustRequestValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoValue;
import com.asiainfo.crm.cm.customer.group.bo.BOCmCustGroupBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmCustGroupMemberBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupRelIndustryBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmCustGroupMemberValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmCustGroupValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmSegMgrGroupRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupMemberSV;
import com.asiainfo.crm.cm.customer.indiv.bo.QBOCmCustomerContactBean;
import com.asiainfo.crm.cm.customer.indiv.ivalues.IQBOCmCustomerContactValue;
import com.asiainfo.crm.cm.dk.bo.BOCmCustPutOnRecordBean;
import com.asiainfo.crm.cm.dk.bo.BOCmPsOptinSyncC3Bean;
import com.asiainfo.crm.cm.dk.bo.BOCmPsSegmentCalBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmCustPutOnRecordValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsOptinSyncC3Value;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsSegmentCalValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmContactContMedAndMedTypeBean;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmContactContMedAndMedTypeValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumPojoBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactMediumRelBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContMedTypeBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustPreferChannelBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustRequestTaskBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFileSyncErrLogBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmPreferPeriodBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmContactContMediumInfoBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmCustContMediumAndTypeBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactMediumRelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContMedTypeValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPreferChannelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmPreferPeriodValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmContactContMediumInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecordBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.bo.BOLnCmInsCmRelBean;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.indiv.bo.BOCmIndivManagerEngine;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOCmIndivManagerValue;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnCommonServiceSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.IUip2CmSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.mask.BOMaskHelper;
import com.asiainfo.crm.common.notes.tl.util.StringUtil;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;
import com.asiainfo.crm.inter.exe.webservice.client.cpr.log.ivalues.IBOInterCallLogValue;
import com.asiainfo.crm.inter.exe.webservice.client.cpr.log.service.interfaces.IInterCallLogSV;
import com.asiainfo.crm.inter.exe.webservice.client.rki.AKSopenClient;
import com.asiainfo.crm.open.teaminvoke.out.interfaces.IUcm2CrmFSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.instance.bboss.service.interfaces.IBbossInstanceQrySV;
import com.asiainfo.crm.so.instance.rboss.service.interfaces.IInsCmRelSV;
import com.asiainfo.crm.so.order.rboss.bo.SoOfferExe;
import com.asiainfo.crm.so.order.rboss.ivalues.ISoOfferExe;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IOrdOTTSV;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IPhoneBookSV;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IRecordLogSV;
import com.asiainfo.crm.so.teaminvoke.in.service.interfaces.ICust2CrmSV;
import com.asiainfo.crm.so.teaminvoke.out.instance.service.interfaces.ICrmInsFSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrm2InternalSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;
 
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName CmCustomerSVImpl
 * @Description 客户类的使用
 * 
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:30:06
 *
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* 2011-12-16 huzq2
 * v1.0.0 修改原因
 */

public class CmCustomerSVImpl implements ICmCustomerSV {

	private static final Log log = LogFactory.getLog(CmCustomerSVImpl.class);

	public ICustomerValue[] queryCustomers(String xmlComdition, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlComdition);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			if (dcs[0].getAsInt(ICustomerValue.S_CustType) == CmConstants.CustomerType.INDIVIDUAL) {
				dcs[0].set("MATCH_TYPE", Integer.valueOf(CmConstants.MatchType.BOTH_MATCH));
			} else {
				dcs[0].set("MATCH_TYPE", Integer.valueOf(CmConstants.MatchType.BOTH_MATCH));
			}
		}
		ICustomerValue[] results = (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class)).queryData(dcs,
				startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(results)) {
			return new ICustomerValue[0];
		}
		long[] custIds = new long[results.length];
		HashMap retMap = new HashMap();
		int custType = results[0].getCustType();
		for (int i = 0; i < results.length; i++) {
			custIds[i] = results[i].getCustId();
			retMap.put(custIds[i], results[i]);
			// 修改界面的展示字段：行业VOCATION、客户地址CUST_ADDRESS、客户层级 CUST_SEGMENT
			IBOCmGroupRelIndustryValue[] industrys = queryGroupIndustryForPage(custIds[i], -1, -1);
			if (CmCommonUtil.isNotEmptyObject(industrys)) {
				results[i].setVocationDesc(industrys[0].getIndustryId());
			}
			// 法律地址
			IQBOCmCustContMediumAndTypeValue[] mediums = queryCustContactMediumsForPage(custIds[i], CmConstants.AddressId.legalAddress, 1, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(mediums)) {
				results[i].setCustAddress(mediums[0].getAddressDetail());
			}
			// 客户层级
			IBOCmCustSegmentRelaValue segmentRela = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).querySegmentRelaByCustId(custIds[i]);
			if (CmCommonUtil.isNotEmptyObject(segmentRela)) {
				IBoCmCustSegmentValue segment = ((ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class)).querySegmentByIdfromCache(segmentRela.getSegmentId());
				results[i].setSegmentName(segment.getSegmentName());
			}
			// 对于客户如果first_name为"$$$$",则影藏客户名称
			if ("$$$$".equals(results[i].getFirstName())) {
				results[i].setDiaplayAttr("CUST_NAME", "DIS_CUST_NAME", " ");
			}
		}
		Map condMap = ParamUtil.transferDataContainersToMap(dcs);
		ICustManagerValue[] custManagerValues = null;
		if (condMap.containsKey(ICustomerValue.S_State) && CmConstants.RecordState.ERASE.equalsIgnoreCase(DataType.getAsString(condMap.get(ICustomerValue.S_State)))) {
			custManagerValues = queryCustManagersByCustIds(custIds, custType, CmConstants.RecordState.ERASE, startNum, endNum);
		} else {
			custManagerValues = queryCustManagersByCustIds(custIds, custType, -1, -1);
		}
		if (CmCommonUtil.isNotEmptyObject(custManagerValues)) {
			for (int i = 0; i < custManagerValues.length; i++) {
				ICustomerValue customerValue = (ICustomerValue) retMap.get(custManagerValues[i].getCustId());
				customerValue.initProperty("MANAGER_NAME", custManagerValues[i].getStaffName());
				customerValue.initProperty("MANAGER_ID", custManagerValues[i].getManagerId());
			}
		}
		for (int i = 0; i < results.length; i++) {
			if (results[i].getCustType() == 3) {
				String kobNumber = results[i].getCustCertCode();
				if (StringUtils.isNotBlank(kobNumber)) {
					// 判断是否为外国集团
					if (kobNumber.indexOf("K") < 0) {
						long kobNumberLocal = DataType.getAsLong(kobNumber);
						results[i].setDiaplayAttr("CUST_CERT_CODE", "CUST_CERT_CODE_NAME", kobNumberLocal);
					} else {
						results[i].setDiaplayAttr("CUST_CERT_CODE", "CUST_CERT_CODE_NAME", " ");
					}
				}
			}

		}

		return results;
	}

	public ICustomerValue[] queryCustomers(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		return (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class)).queryData(
				new DataContainer[] { conditionDC }, startNum, endNum);
	}

	public int queryCustomerCount(String xmlComdition) throws Exception {
		int count = 0;
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlComdition);
		/*
		 * if (CmCommonUtil.isNotEmptyObject(dcs) && dcs[0].getAsInt(ICustomerValue.S_CustType) ==
		 * CmConstants.CustomerType.INDIVIDUAL) {
		 * dcs[0].set("MATCH_TYPE", Integer.valueOf(CmConstants.MatchType.BOTH_MATCH));
		 * }
		 * ICustomerValue[] values = queryCustomers(xmlComdition, -1, -1);
		 * return values.length;
		 */
		// 修改数据大造成的内存溢出
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			dcs[0].set("MATCH_TYPE", Integer.valueOf(CmConstants.MatchType.BOTH_MATCH));
			count = queryCustomerCount(dcs[0]);
		}
		return count;
	}

	public int queryCustomerCount(DataContainer conditionDC) throws Exception {
		return ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class)).queryCount(new DataContainer[] { conditionDC });
	}

	public ICustomerValue queryCustomerByCustId(long custId) throws Exception {
		return queryCustomerByCustId(custId, "");
	}

	public ICustomerValue queryCustomerMaskByCustId(long custId) throws Exception {
		BOMaskHelper.setOperateMaskFlag();
		ICustomerValue customerValue = queryCustomerByCustId(custId, "");
		// modify by xialing,2013-08-07,修改OP_ID和ORG_ID对应的中文信息,附加在备注信息中
		if (customerValue != null) {
			long opId = customerValue.getOpId();
			long orgId = customerValue.getOrgId();
			if (opId > 0) {
				IBOSecOperatorValue oper = OrgmodelClient.getOperatorById(opId);
				if (oper == null || StringUtils.isBlank(oper.getCode())) {
					customerValue.setOpIdDesc(Long.toString(opId));
				} else {
					customerValue.setOpIdDesc(oper.getCode());
				}
			} else {
				customerValue.setOpIdDesc(StringUtils.EMPTY);
			}
			if (orgId > 0) {
				IBOSecOrganizeValue org = OrgmodelClient.getOrganizeByOrgId(orgId);
				if (org == null || StringUtils.isBlank(org.getOrganizeName())) {
					customerValue.setOrgIdDesc(Long.toString(orgId));
				} else {
					customerValue.setOrgIdDesc(org.getOrganizeName());
				}
			} else {
				customerValue.setOrgIdDesc(StringUtils.EMPTY);
			}
			// modify end
			// 外国集团的KOB-Number不展示，本国集团KOB-Number去除前面的0
			if (CmCommonUtil.getCustType(customerValue.getCustId()) == CmConstants.CustomerType.GROUP) {
				String kobNumber = customerValue.getCustCertCode();
				if (StringUtils.isNotBlank(kobNumber)) {
					// 判断是否为外国集团
					if (kobNumber.indexOf("K") < 0) {
						long kobNumberLocal = DataType.getAsLong(kobNumber);
						customerValue.setDiaplayAttr("CUST_CERT_CODE", "CUST_CERT_CODE_NAME", kobNumberLocal);
					} else {
						customerValue.setDiaplayAttr("CUST_CERT_CODE", "CUST_CERT_CODE_NAME", "");
					}
				}
			}
		}

		// 查询结束后清空模糊化标识，否则会影响别的查询
		BOMaskHelper.setOperateNotMaskFlag();
		BOMaskHelper.clearOperateMaskFlag();
		// 如果客户的first_name是"$$$$"则需要影藏
		if ("$$$$".equals(customerValue.getFirstName())) {
			customerValue.setDiaplayAttr("FIRST_NAME", "DIS_FIRST_NAME", " ");
			customerValue.setDiaplayAttr("LAST_NAME", "DIS_LAST_NAME", " ");
		}
		// 对reg_amount展示值做处理
		// long regAmount = customerValue.getRegAmount();
		// if (regAmount > 0) {
		// StringBuffer disRegAmount = new StringBuffer(String.valueOf(regAmount));
		// disRegAmount = disRegAmount.insert(String.valueOf(regAmount).length() - 2, ",");
		// customerValue.setDiaplayAttr("REG_AMOUNT", "DIS_REG_AMOUNT", disRegAmount.toString());
		// }
		if(customerValue!=null) {
			ICm2SoSV cmsv = (ICm2SoSV)ServiceFactory.getCrossCenterService(ICm2SoSV.class);
			IBOCmCustAdditionalInfoValue [] addionalInfo = cmsv.queryCustAdditionalInfo(custId);
			String noteString = "";
			if(CmCommonUtil.custRemarksCtrl()) {
				for(int i = 0;i<addionalInfo.length;i++) {
				  if("1".equals(addionalInfo[i].getExt1()) || StringUtils.isBlank(addionalInfo[i].getExt1())) {
					  noteString = addionalInfo[i].getNote();
				  }
				}
			}else {
				noteString = cmsv.getNoteString(addionalInfo);
			}

			if(StringUtils.isNotBlank(noteString)) {
				String result = URLDecoder.decode(noteString);
				if(result.length()>=2000){
					customerValue.setRemarks(result.substring(0,2000));
				}else{
					customerValue.setRemarks(result);
				}
			}
		}
		return customerValue;
	}


	public ICustomerValue queryCustomerByCustId(long custId, String state) throws Exception {
		return (ICustomerValue) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class)).queryCustomerByCustId(custId, state);
	}

	public ICustomerValue queryCustomerByServiceId(String serviceId, int custType) throws Exception {
		// 验证传入的证件类型是否在系统定义中，如果不在则报错！
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(custType)) == null) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (StringUtils.isBlank(serviceId)) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustType, custType);
		conditionDC.set(ICustomerValue.S_CustServiceId, serviceId);
		// 直接使用客户综合查询即可！
		ICustomerValue[] customerValues = (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class))
				.queryData(new DataContainer[] { conditionDC }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(customerValues)) {
			return customerValues[0];
		}
		return null;
	}

	public long saveCustomer(IVOCustValue custValue) throws Exception {
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		ICustomerValue customerValue = custValue.getCustomer();
		if (customerValue != null) {
			CustomerBean customerBean = (CustomerBean) customerValue;
			customerBean.clearProperty("REMARKS");
			custValue.setCustomer(customerBean);
		}
		busiModel.deal(custValue);
		return custValue.getCustId();
	}
	
	/**
	 * 保存纯User信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-11-21
	* ICmCustomerSV
	 */
	public long savePureUser(IVOCustValue custValue) throws Exception{
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		busiModel.deal(custValue);
		return custValue.getCustId();
	}

	public long saveCustomer(ICustomerValue customerValue) throws Exception {
		IVOCustValue custValue = new VOCustBean(customerValue);
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		if (customerValue != null) {
			CustomerBean customerBean = (CustomerBean) customerValue;
			customerBean.clearProperty("REMARKS");
			custValue.setCustomer(customerBean);
		}
		busiModel.deal(custValue);
		return custValue.getCustId();
	}

	public long saveDefaultCustomer(long partyId, String firstName, String lastName) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		if (partyId > 0) {
			// 提供给ose为纯payer创建默认客户
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IQBOCmPartyValue partyValue = partySV.queryPayerByPartyId(partyId);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				// 封装客户信息
				ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				long custId = commonSV.getCustId(CmConstants.CustomerType.INDIVIDUAL);
				ICustomerValue customerValue = new CustomerBean();
				customerValue.copy(partyValue);
				customerValue.setRemarks(null);
				customerValue.setCustCertCode(partyValue.getCertCode());
				customerValue.setCustCertType(partyValue.getCertType());
				customerValue.setCustId(custId);
				custValue.setCustomer(customerValue);
				customerValue.setStsToNew();
				// 封装客户扩展信息
				DataContainerInterface indivCustExt = new DataContainer();
				indivCustExt.copy(partyValue);
				indivCustExt.set("CUST_ID", custId);
				indivCustExt.set("CONTACT_PROTECTION", "0");
				indivCustExt.set("EXT1", null);
				indivCustExt.set("EXT4", "0");
				indivCustExt.set("EXT6", "0");
				indivCustExt.set("EXT7", "0");
				indivCustExt.set("EXT8", "0");
				indivCustExt.set("EXT9", "0");
				indivCustExt.set("EXT10", null);
				indivCustExt.set("REMARKS", null);
				custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, indivCustExt);
				// 保存客户地址
				IBOCmCustContactMediumValue contMedium = new BOCmCustContactMediumBean();
				long contRelaId = CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class);
				contMedium.setCustContRelaId(contRelaId);
				contMedium.setCustId(custId);
				contMedium.setRegionId(StringUtils.isBlank(partyValue.getRegionId()) ? CmCommonUtil.getDefaultRegionId() : partyValue.getRegionId());
				contMedium.setAddressId(Long.parseLong(partyValue.getContAddress()));
				contMedium.setAddressDetail(partyValue.getRemarks());
				contMedium.setContMedTypeId(CmConstants.AddressId.legalAddress);
				contMedium.setProtectEffDate(partyValue.getExt9());
				contMedium.setProtectExpDate(partyValue.getExt10());
				ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				customerSV.saveCustContMedium(new IBOCmCustContactMediumValue[] { contMedium });
				// 增加参与人角色
				BOCmPartyRoleBean cmPartyRoleValue = new BOCmPartyRoleBean();
				cmPartyRoleValue.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
				cmPartyRoleValue.setPartyId(partyValue.getPartyId());
				cmPartyRoleValue.setRoleType(CmConstants.PartyRoleType.CUSTOMER);
				cmPartyRoleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
				cmPartyRoleValue.setEntityId(custId);
				cmPartyRoleValue.setState(CmConstants.RecordState.USE);
				cmPartyRoleValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				cmPartyRoleValue.setStsToNew();
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(new BOCmPartyRoleBean[] { cmPartyRoleValue });
				custValue.setUserObject("SET_DEFAULT_PARTY", CmConstants.YesOrNo.NO);
				return saveDefaultCustomer(custValue);
			}
		} else if (StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName)) {
			// 提供给订单创建默认客户
			ICustomerValue customerValue = new CustomerBean();
			if (StringUtils.isNotBlank(firstName)) {
				customerValue.setFirstName(firstName);
			}
			if (StringUtils.isNotBlank(lastName)) {
				customerValue.setLastName(lastName);
			}
			custValue.setCustomer(customerValue);
			return saveDefaultCustomer(custValue);
		}
		return -1;
	}

	public long saveDefaultCustomer(IVOCustValue custValue) throws Exception {
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_NEW);
		ICustomerValue customerValue = custValue.getCustomer();
		long partyId = customerValue.getPartyId();
		if (partyId > 0) {
			// 提供给ose为纯payer创建默认客户
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyRoleValue[] partyRoleValues = partySV.queryPartyRole(partyId);
			if (partyRoleValues == null || partyRoleValues.length > 1 || (partyRoleValues.length == 1 && partyRoleValues[0].getRoleType() != CmConstants.roleType.payer)) {
				// 只有纯支付者才能创建默认客户。
				ExceptionUtil.throwBusinessException("CMS90000095");
			}
			IQBOCmPartyValue partyValue = partySV.queryPayerByPartyId(partyId);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				// 封装客户信息
				ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				long custId = commonSV.getCustId(CmConstants.CustomerType.INDIVIDUAL);
				customerValue.copy(partyValue);
				customerValue.setRemarks(null);
				customerValue.setCustId(custId);
				custValue.setCustomer(customerValue);
				customerValue.setStsToNew();
				// 封装客户扩展信息
				DataContainerInterface indivCustExt = new DataContainer();
				indivCustExt.copy(partyValue);
				indivCustExt.set("CUST_ID", custId);
				indivCustExt.set("CONTACT_PROTECTION", "0");
				indivCustExt.set("EXT1", null);
				indivCustExt.set("EXT4", "0");
				indivCustExt.set("EXT6", "0");
				indivCustExt.set("EXT7", "0");
				indivCustExt.set("EXT8", "0");
				indivCustExt.set("EXT9", "0");
				indivCustExt.set("EXT10", null);
				indivCustExt.set("REMARKS", null);
				custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, indivCustExt);
				// 保存客户地址
				IBOCmCustContactMediumValue contMedium = new BOCmCustContactMediumBean();
				long contRelaId = CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class);
				String regionId = StringUtils.isBlank(partyValue.getRegionId()) ? CmCommonUtil.getDefaultRegionId() : partyValue.getRegionId();
				contMedium.setCustContRelaId(contRelaId);
				contMedium.setCustId(custId);
				contMedium.setRegionId(regionId);
				contMedium.setAddressId(Long.parseLong(partyValue.getContAddress()));
				contMedium.setAddressDetail(partyValue.getRemarks());
				contMedium.setContMedTypeId(CmConstants.AddressId.legalAddress);
				contMedium.setProtectEffDate(partyValue.getExt9());
				contMedium.setProtectExpDate(partyValue.getExt10());

				// 保存客户email联系方式
				IBOCmCustContactMediumValue emailContMedium = new BOCmCustContactMediumBean();
				emailContMedium.setCustContRelaId(CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class));
				emailContMedium.setCustId(custId);
				emailContMedium.setRegionId(regionId);
				emailContMedium.setEmailAddress(customerValue.getContEmail());
				emailContMedium.setContMedTypeId(CmConstants.AddressId.EMAIL);
				emailContMedium.setProtectEffDate(ServiceManager.getOpDateTime());
				emailContMedium.setProtectExpDate(TimeUtil.getMaxExpire());

				ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				customerSV.saveCustContMedium(new IBOCmCustContactMediumValue[] { contMedium, emailContMedium });
				// 增加参与人角色
				BOCmPartyRoleBean cmPartyRoleValue = new BOCmPartyRoleBean();
				cmPartyRoleValue.copy(partyValue);
				cmPartyRoleValue.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
				cmPartyRoleValue.setPartyId(partyValue.getPartyId());
				cmPartyRoleValue.setRoleType(CmConstants.PartyRoleType.CUSTOMER);
				cmPartyRoleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
				cmPartyRoleValue.setEntityId(custId);
				cmPartyRoleValue.setState(CmConstants.RecordState.USE);
				cmPartyRoleValue.setStsToNew();
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(new BOCmPartyRoleBean[] { cmPartyRoleValue });
				custValue.setUserObject("SET_DEFAULT_PARTY", CmConstants.YesOrNo.NO);
			}
		}
		customerValue.setCustStatus(CmConstants.CustomerStatus.INDIV_POTENTIAL);
		customerValue.setRealNameFlag(0);
		customerValue.setAnonymousFlag(1);// 匿名
		customerValue.setIsVip(1);// 特殊处理，表示为潜在客户
		customerValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
		customerValue.setIndivCustType(String.valueOf(CmConstants.PartyRoleType.CUSTOMER));
		// 设值默认地市信息
		IBOBsStaticDataValue[] staticDataValues = StaticDataUtil.getStaticData("CM_COUNTRY");
		if (staticDataValues != null && staticDataValues.length > 0) {
			customerValue.setNationality(staticDataValues[0].getCodeValue());
			IBOBsCommonDistrictValue[] districtValues = BsCommonDistrictUtil.getCommonDistrictsByParentCode(customerValue.getNationality(), 1);
			if (districtValues != null && districtValues.length > 0) {
				customerValue.setProvinceId(districtValues[0].getDistrictCode());
				IBOBsCommonDistrictValue[] cityValues = BsCommonDistrictUtil.getCommonDistrictsByParentCode(customerValue.getProvinceId(), 2);
				if (cityValues != null && cityValues.length > 0) {
					customerValue.setCityId(cityValues[0].getDistrictCode());
					IBOBsCommonDistrictValue[] countyValues = BsCommonDistrictUtil.getCommonDistrictsByParentCode(customerValue.getCityId(), 3);
					if (countyValues != null && countyValues.length > 0) {
						customerValue.setCountyId(countyValues[0].getDistrictCode());
					}
				}
			}
		}
		long custId = customerValue.getCustId();
		if (custId <= 0) {
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			custId = commonSV.getCustId(CmConstants.CustomerType.INDIVIDUAL);
		}
		customerValue.setCustId(custId);
		if (StringUtils.isBlank(customerValue.getLastName())) {
			customerValue.setLastName(String.valueOf(custId));
		}
		if (StringUtils.isNotBlank(customerValue.getContEmail())) {
			IBOIdentificationValue identificationValue = new BOIdentificationBean();
			identificationValue.setIdenType(4);// email
			identificationValue.setIdenNr(customerValue.getContEmail());
			custValue.addCustIdentification(new IBOIdentificationValue[] { identificationValue });
			if (StringUtils.isBlank(customerValue.getCustName())) {
				customerValue.setCustName(customerValue.getContEmail());
			}
		}
		// 塞上默认的个人扩展信息
		DataContainerInterface dc = (DataContainerInterface) custValue.getUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer);
		if (dc == null) {
			dc = new DataContainer();
			dc.set("CUST_ID", custId);
			dc.set("CONTACT_PROTECTION", "0");
			dc.set("EXT4", "0");
			dc.set("EXT6", "0");
			dc.set("EXT7", "0");
			dc.set("EXT8", "0");
			dc.set("EXT9", "0");
			custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, dc);
		}
		
		// 创建默认细分
		ICmCustSegmentRelaSV segmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue segmentRela = new BOCmCustSegmentRelaBean();
		segmentRela.setCustId(custId);
		segmentRela.setSegmentId(Long.parseLong(CmConstants.segment.NEW));
		segmentRela.setRegionId(CmCommonUtil.getDefaultRegionId());
		segmentRela.setState(CmConstants.RecordState.USE);
		segmentRelaSV.saveSegmentRela(segmentRela);
		busiModel.dealDefaultcustomer(custValue);
	
		return custId;
	}

	public ICustomerValue[] queryCustomerHis(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		return new ICustomerValue[0];
	}

	public int queryCustomerHisCount(DataContainer conditionDC) throws Exception {
		return 0;
	}

	public ICustManagerValue queryCustManagerById(long relId, int custType) throws Exception {
		AbstractCustManagerQueryBusiModelImpl busiModelImpl = (AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class);
		DataContainer critia = new DataContainer();
		critia.set(ICustManagerValue.S_RelId, relId);
		critia.set(ICustomerValue.S_CustType, custType);
		ICustManagerValue[] managerValues = (ICustManagerValue[]) busiModelImpl.queryData(new DataContainer[] { critia }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(managerValues)) {
			return managerValues[0];
		}
		return null;
	}

	public ICustManagerValue[] queryCustManagersByCustId(long custId, String state, int startNum, int endNum) throws Exception {
		AbstractCustManagerQueryBusiModelImpl busiModelImpl = (AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class);
		return (ICustManagerValue[]) busiModelImpl.queryCustManagerByCustId(custId, state, startNum, endNum);
	}

	public ICustManagerValue[] queryCustManagersByCustId(long custId, int startNum, int endNum) throws Exception {
		AbstractCustManagerQueryBusiModelImpl busiModelImpl = (AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class);
		return (ICustManagerValue[]) busiModelImpl.queryCustManagerByCustId(custId, CmConstants.RecordState.USE, startNum, endNum);
	}

	public ICustManagerValue[] queryCustManagersByServiceId(String custServiceId, int custType, int startNum, int endNum) throws Exception {
		ICustomerValue customerValue = this.queryCustomerByServiceId(custServiceId, custType);
		if (customerValue == null) {
			// 根据编号{0}没有查询到唯一的客户信息记录，请检查查询条件是否正确或数据是否正确！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000112"));
			}
			ExceptionUtil.throwBusinessException("CMS0000112");
		}
		return this.queryCustManagersByCustId(customerValue.getCustId(), startNum, endNum);
	}

	public int queryCustManagerCountByCustId(long custId, String state) throws Exception {
		return ((AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class)).queryCustManagerCountByCustId(custId, state);
	}

	public int queryCustManagerCountByCustId(long custId) throws Exception {
		return ((AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class)).queryCustManagerCountByCustId(custId,
				CmConstants.RecordState.USE);
	}

	public int queryCustManagerCountByServiceId(String custServiceId, int custType) throws Exception {
		ICustomerValue customerValue = this.queryCustomerByServiceId(custServiceId, custType);
		if (customerValue == null) {
			// 根据编号{0}没有查询到唯一的客户信息记录，请检查查询条件是否正确或数据是否正确！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000112"));
			}
			ExceptionUtil.throwBusinessException("CMS0000112");
			return 0;
		}
		return this.queryCustManagerCountByCustId(customerValue.getCustId());
	}

	public ICustOrganizeValue[] queryCustOrganizes(String criteria, int startNum, int endNum) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		return (ICustOrganizeValue[]) busi.queryData(criteria, startNum, endNum);
	}

	public int queryCustOrganizeCount(String criteria) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		return busi.queryCount(criteria);
	}

	public ICustOrganizeValue[] queryCustOrganizes(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		return (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { conditionDC }, startNum, endNum);
	}

	public int queryCustOrganizeCount(DataContainer conditionDC) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		return busi.queryCount(new DataContainer[] { conditionDC });
	}

	public ICustOrganizeValue queryCustOrganizeById(long deptId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		ICustOrganizeValue value = (ICustOrganizeValue) busi.queryDataById(deptId);
		if (value != null) {
			long parentDeptId = value.getParentDeptId();
			if (parentDeptId > 0) {
				ICustOrganizeValue pValue = (ICustOrganizeValue) busi.queryDataById(parentDeptId);
				if (pValue != null) {
					value.initProperty("PARENT_DEPT_NAME", pValue.getDeptName());
				} else {
					ICustomerValue cValue = CmServiceFactory.getCustomerSV().queryDKCustomer(parentDeptId);
					if (cValue != null) {
						value.initProperty("PARENT_DEPT_NAME", cValue.getCustName());
					}
				}
			}
			long relCustId = value.getRelCustId();
			if (relCustId > 0) {
				ICustomerValue custValue = CmServiceFactory.getCustomerSV().queryDKCustomer(relCustId);
				if (custValue != null) {
					value.initProperty("REL_CUST_NAME", custValue.getCustName());
				}
			}
		} else {
			value = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(deptId);
		}
		return value;
	}

	public ICustOrganizeValue[] queryCustOrganizesByCustId(long custId, int startNum, int endNum) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.SUB_COMPANY);// 查询子公司
		return (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
	}

	public int queryCustOrganizeCountByCustId(long custId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.SUB_COMPANY);// 查询子公司
		return busi.queryCount(new DataContainer[] { dContainer });
	}

	public ICustOrganizeValue[] queryCustOrganizesByParentId(long parentDeptId, int startNum, int endNum) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_ParentDeptId, parentDeptId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.SUB_COMPANY);// 查询子公司
		return (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
	}

	public int queryCustOrganizeCountByParentId(long parentDeptId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_ParentDeptId, parentDeptId);
		return busi.queryCount(new DataContainer[] { dContainer });
	}

	public ICustOrganizeValue[] querySubCustOrganizes(long custId, long parentDeptId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_ParentDeptId, parentDeptId);
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		return (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
	}

	public IGroupMemberValue[] queryGroupMembersByGroupId(long groupId, int startNum, int endNum) throws Exception {
		return (IGroupMemberValue[]) ((AbstractCustRelQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustRelQueryBusiModelImpl.class)).querygroupCustMemberValueByCustId(
				groupId, startNum, endNum);
	}

	public long saveGroupMember(ICustRelationshipValue custRelValue) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		custValue.addCustRel(custRelValue);
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		busiModel.deal(custValue);
		return custValue.getCustId();
	}

	public ICustomerValue[] queryGroupCustSonByGroupId(long groupId, int startNum, int endNum) throws Exception {
		return (ICustomerValue[]) ((AbstractCustRelQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustRelQueryBusiModelImpl.class)).queryGroupCustSonsByGroupId(groupId,
				startNum, endNum);
	}

	public long saveGroupSubMember(IVOCustValue custValue) throws Exception {
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		busiModel.deal(custValue);
		return custValue.getCustId();
	}

	public IGroupMemberValue[] queryGroupMembers(DataContainer condition, int startNum, int endNum) throws Exception {
		return (IGroupMemberValue[]) ((AbstractCustRelQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustRelQueryBusiModelImpl.class)).queryData(condition, startNum,
				endNum);
	}

	public int queryGroupMembersCount(DataContainer condition) throws Exception {
		return ((AbstractCustRelQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustRelQueryBusiModelImpl.class)).queryGroupMembersCount(condition);
	}

	public ICustManagerValue[] queryCustManagersByCustIds(long[] custId, int custType, int startNum, int endNum) throws Exception {
		return (ICustManagerValue[]) ((AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class)).queryCustManagerByCustIds(
				custId, custType, CmConstants.RecordState.USE, startNum, endNum);
	}

	public ICustManagerValue[] queryCustManagersByCustIds(long[] custId, int custType, String state, int startNum, int endNum) throws Exception {
		return (ICustManagerValue[]) ((AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class)).queryCustManagerByCustIds(
				custId, custType, state, startNum, endNum);
	}

	public ICustManagerValue[] queryCustManagers(DataContainer[] conditionDCs, int custType, int startNum, int endNum) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(conditionDCs)) {
			conditionDCs[0].set(ICustomerValue.S_CustType, custType);
		}
		return (ICustManagerValue[]) ((AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class)).queryData(conditionDCs,
				startNum, endNum);
	}

	public ICustomerValue[] queryManagedCustomers(long managerId, int custType, int startNum, int endNum) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModelImpl = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		return busiModelImpl.queryManagedCustomers(managerId, custType, null, startNum, endNum);
	}

	public int queryManagedCustomerCount(long managerId, int custType) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModelImpl = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		return busiModelImpl.queryManagedCustomerCount(managerId, custType, null);
	}

	public ICustomerValue[] queryManagedCustomers(long managerId, int custType, DataContainer otherConditionDC, int startNum, int endNum) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModelImpl = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		return busiModelImpl.queryManagedCustomers(managerId, custType, otherConditionDC, startNum, endNum);
	}

	public int queryManagedCustomerCount(long managerId, int custType, DataContainer otherConditionDC) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModelImpl = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		return busiModelImpl.queryManagedCustomerCount(managerId, custType, otherConditionDC);
	}

	public ICustomerValue[] queryCustomersByCustIds(long[] custIds, int custType, int startNum, int endNum) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModelImpl = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		return busiModelImpl.queryCustomersByCustIds(custIds, custType, startNum, endNum);
	}

	public ICustomerValue[] queryCustomersByCols(String[] colValues, String colName, int custType, int startNum, int endNum) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModelImpl = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		return busiModelImpl.queryCustomersByCols(colValues, colName, custType, startNum, endNum);
	}

	public ICustomerValue[] queryCustByCustIds(long[] custIds) throws Exception {
		if (custIds != null && custIds.length > 0) {
			if (custIds.length > 1000) {
				// 数组长度不能超过1000
				ExceptionUtil.throwBusinessException("CMS2000064");
			}
			List indivList = new ArrayList();
			List groupList = new ArrayList();
			int custType = 0;
			for (int i = 0; i < custIds.length; i++) {
				try {
					custType = CmCommonUtil.getCustType(custIds[i]);
				} catch (Exception e) {
					log.info(e.getMessage(), e);
					if (log.isErrorEnabled()) {
						log.error(e.getMessage());
					}
					continue;
				}
				if (custType == CmConstants.CustomerType.INDIVIDUAL) {
					indivList.add(custIds[i]);
				} else if (custType == CmConstants.CustomerType.GROUP) {
					groupList.add(custIds[i]);
				}
			}
			ICustomerValue[] indivCusts = null;
			ICustomerValue[] groupCusts = null;
			if (!indivList.isEmpty()) {
				Long[] indivIds = (Long[]) indivList.toArray(new Long[0]);
				indivCusts = queryCustomersByCustIds(ArrayUtils.toPrimitive(indivIds), CmConstants.CustomerType.INDIVIDUAL, -1, -1);
			}
			if (!groupList.isEmpty()) {
				Long[] groupIds = (Long[]) groupList.toArray(new Long[0]);
				groupCusts = queryCustomersByCustIds(ArrayUtils.toPrimitive(groupIds), CmConstants.CustomerType.GROUP, -1, -1);
			}
			return (ICustomerValue[]) ArrayUtils.addAll(indivCusts, groupCusts);
		}
		return new ICustomerValue[0];
	}

	public int queryCustomerCountByCustIds(long[] custIds, int custType) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModelImpl = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		return busiModelImpl.queryCustomerCountByCustIds(custIds, custType);
	}

	public long saveGroupMember(IGroupMemberValue groupMemberValue) throws Exception {
		ICustRelationshipValue custRelValue = new CustRelationshipBean();
		custRelValue.copy(groupMemberValue);
		custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
		IVOCustValue custValue = new VOCustBean();
		custValue.addCustRel(custRelValue);
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		busiModel.deal(custValue);
		return custValue.getCustId();
	}

	public long saveGroupSubMember(ICustomerValue custValue) throws Exception {
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		IVOCustValue vocustValue = new VOCustBean();
		vocustValue.setCustomer(custValue);
		busiModel.deal(vocustValue);
		return custValue.getDoneCode();
	}

	public String getCustServiceId(ICustomerValue customerValue) throws Exception {
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		return busiModel.getCustServiceId(customerValue);
	}

	public ICustManagerValue queryMainCustManagersByCustId(long custId) throws Exception {
		ICustManagerValue result = null;
		ICustManagerValue[] custManagerValues = queryCustManagersByCustId(custId, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(custManagerValues)) {
			result = custManagerValues[0];
			// add by xialing,2013-8-23,增加客户经理信息查询和填充
			long managerId = result.getManagerId();
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			IQBOSecCustManagerValue secStaff = null;
			// 取得细分
			ICmCustSegmentRelaSV cmCustSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
			IBOCmCustSegmentRelaValue BOCmCustSegmentRela = cmCustSegmentRelaSV.querySegmentRelaByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(BOCmCustSegmentRela)) {
				if (CmConstants.segment.SA.equals(String.valueOf(BOCmCustSegmentRela.getSegmentId()))) {
					// 客户经理组
					IBOSecGroupValue ibOrganizeValue = OrgmodelClient.getGroupValueByGroupId(managerId);
					if (ibOrganizeValue != null) {
						result.setManagerId(ibOrganizeValue.getGroupId());
						result.setStaffName(ibOrganizeValue.getGroupName());
						result.setBillId("");
					}
				} else {
					// 客户经理
					if (managerId > 0) {
						secStaff = iseCm.getEffectAmInfo(managerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
					}
					if (CmCommonUtil.isNotEmptyObject(secStaff)) {
						result.setManagerId(secStaff.getManagerid());
						result.setStaffName(secStaff.getManagername());
						result.setBillId(secStaff.getBillid());
					}
				}
			}
		}
		return result;
	}

	public ICustomerValue queryCustomerByEcCode(String ecCode, int custType) throws Exception {
		// 系统目前仅支持根据条件{0}查询集团客户！
		if (CmConstants.CustomerType.GROUP != custType) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0031153"));
			}
			ExceptionUtil.throwBusinessException("CMS0031153");
		}
		if (StringUtils.isBlank(ecCode)) {
			// 输入参数不合法
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustType, custType);
		conditionDC.set(ICustomerValue.S_EcCode, ecCode);
		conditionDC.set(ICustomerValue.S_State, CmConstants.RecordState.USE);
		// 直接使用客户综合查询即可！
		ICustomerValue[] customerValues = (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class))
				.queryData(new DataContainer[] { conditionDC }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(customerValues)) {
			return customerValues[0];
		}
		return null;
	}

	public ICustomerValue queryCustomerByCustId(long custId, String state, long businessId) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModel = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		Map parameter = new HashMap();
		parameter.put(ICustomerValue.S_CustId, custId);
		parameter.put(ICustomerValue.S_State, state);
		return (ICustomerValue) busiModel.queryDataById(parameter, businessId);
	}

	public DataContainer queryCustOrganizeByCustIdDeptName(long custId, String deptName) throws Exception {
		String sql = "SELECT * FROM {CM_GROUP_ORG_STRUCT} A WHERE A.CUST_ID=:custId AND A.DEPT_NAME=:deptName";
		Map parameter = new HashMap();
		parameter.put("custId", custId);
		parameter.put("deptName", deptName);
		sql = SplitTableFactory.createQuerySQL(sql, new HashMap());
		DataContainer[] values = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		if (CmCommonUtil.isEmptyObject(values)) {
			return null;
		}
		return values[0];
	}

	public ICustomerValue[] queryCustomers(String[] cols, DataContainer conditionDC, int startNum, int endNum) throws Exception {
		return (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class)).queryData(cols,
				new DataContainer[] { conditionDC }, startNum, endNum);
	}

	public IGroupMemberValue[] queryGroupMembersByCondition(String criteria, int startNum, int endNum) throws Exception {
		AbstractCustMemberQueryBusiModelImpl busi = (AbstractCustMemberQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustMemberQueryBusiModelImpl.class);
		IGroupMemberValue[] values = (IGroupMemberValue[]) busi.queryData(criteria, startNum, endNum);
		// 记录业务日志
		Map paraMap = new HashMap();
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.GROUP_MEMBER, criteria, paraMap, CmConstants.BusiLogType.CUSTOMER_LOG);
		// modify by caiyu 客户要求在集团网内成员列表展示集团服务编号，同时展示集团名称
		if (CmCommonUtil.isNotEmptyObject(values) && values.length > 0) {
			ICustomerValue cv = null;
			long custId = 0L;
			String custName = "";
			String custServiceId = "";
			for (int i = 0; i < values.length; i++) {
				if (i == 0) {
					// 第一条记录，查询集团客户信息，得到集团名称和集团服务编号
					custId = values[i].getCustId();
					cv = queryCustomerByCustId(values[i].getCustId());
					if (CmCommonUtil.isNotEmptyObject(cv)) {
						custName = cv.getCustName();
						custServiceId = cv.getCustServiceId();
					}
				} else {
					if (custId != values[i].getCustId()) {
						custId = values[i].getCustId();
						cv = queryCustomerByCustId(values[i].getCustId());
						if (CmCommonUtil.isNotEmptyObject(cv)) {
							custName = cv.getCustName();
							custServiceId = cv.getCustServiceId();
						}
					}
				}
				values[i].initProperty("CUST_NAME", custName);
				values[i].initProperty("CUST_SERVICE_ID", custServiceId);
			}
		} else {
			return new IGroupMemberValue[0];
		}

		return values;
	}

	public int queryGroupMembersCountByCondition(String criteria) throws Exception {
		AbstractCustMemberQueryBusiModelImpl busi = (AbstractCustMemberQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustMemberQueryBusiModelImpl.class);
		return busi.queryCount(criteria);
	}

	public IGroupMemberValue queryGroupMemberByCustRelId(long custRelId) throws Exception {
		AbstractCustMemberQueryBusiModelImpl busi = (AbstractCustMemberQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustMemberQueryBusiModelImpl.class);
		IGroupMemberValue value = (IGroupMemberValue) busi.queryDataById(custRelId);
		ICustOrganizeValue organizeValue = queryCustOrganizeById(value.getDeptId());
		if (organizeValue != null) {
			value.setDeptName(organizeValue.getDeptName());
		}
		return value;
	}

	public boolean isRealNameCustomer(long custId) throws Exception {
		AbstractCustomerQueryBusiModelImpl busiModelImpl = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		return busiModelImpl.isRealNameCustomer(custId);
	}

	/**
	 * 查询集团未分配的客户经理对象
	 * 
	 * @throws Exception
	 *             DataStructInterface
	 */
	public DataContainerInterface[] queryUserCreditLevelTemp(DataContainer dt, int isFlag, int start, int end, List managerIdList, String segmentId) throws Exception {
		StringBuilder contanct = new StringBuilder();
		HashMap queryParam = new HashMap();
		if (dt.get(ICustomerValue.S_CustId) != null && !"-1".equals(dt.get(ICustomerValue.S_CustId))) {
			contanct.append(" AND X.CUST_ID = :CUST_ID ");
			queryParam.put("CUST_ID", dt.get(ICustomerValue.S_CustId));
		}
		if (dt.get(ICustomerValue.S_CustName) != null) {
			contanct.append(" AND X.CUST_NAME LIKE :custName ");
			queryParam.put("custName", dt.get(ICustomerValue.S_CustName) + "%");
		}
		if (dt.get("BILL_ID") != null) {
			contanct.append(" AND X.HQ_NUMBER = :BILL_ID ");
			queryParam.put("BILL_ID", dt.get("BILL_ID"));
		}
		if (dt.get(ICustomerValue.S_CustStatus) != null && !("-1").equals(dt.get(ICustomerValue.S_CustStatus))) {
			contanct.append(" AND X.CUST_STATUS = :custStatus ");
			queryParam.put("custStatus", dt.get(ICustomerValue.S_CustStatus));
		}
		if (dt.get(ICustomerValue.S_CityId) != null && !("-1").equals(dt.get(ICustomerValue.S_CityId))) {
			contanct.append(" AND X.CITY_ID = :cityId ");
			queryParam.put("cityId", dt.get(ICustomerValue.S_CityId));
		}
		if (dt.get(ICustomerValue.S_CountyId) != null && !("-1").equals(dt.get(ICustomerValue.S_CountyId))) {
			contanct.append(" AND X.COUNTY_ID = :countyId ");
			queryParam.put("countyId", dt.get(ICustomerValue.S_CountyId));
		}
		if (dt.get(ICustomerValue.S_CustServiceLevel) != null && !("-1").equals(dt.get(ICustomerValue.S_CustServiceLevel))) {
			contanct.append(" AND X.CUST_SERVICE_LEVEL = :custServiceLevel ");
			queryParam.put("custServiceLevel", dt.get(ICustomerValue.S_CustServiceLevel));
		}
		if (dt.get(ICustomerValue.S_CustServiceId) != null) {
			contanct.append(" AND X.CUST_SERVICE_ID = :custServiceId ");
			queryParam.put("custServiceId", dt.get(ICustomerValue.S_CustServiceId));
		}

		// 增加KOB NUMBER查询条件
		String custCertCode = null;
		if (dt.get(ICustomerValue.S_CustCertCode) != null) {
			custCertCode = String.valueOf(dt.get(ICustomerValue.S_CustCertCode));
			if (StringUtil.isNotBlank(custCertCode)) {
				if ((custCertCode.length() == 10) || custCertCode.startsWith("K")) {
					contanct.append(" AND X.CUST_CERT_CODE = :CUST_CERT_CODE ");
					queryParam.put("CUST_CERT_CODE", custCertCode);
				} else if (custCertCode.length() < 10) {
					int j = 10 - custCertCode.length();
					for (int i = 0; i < j; i++) {
						custCertCode = "0" + custCertCode;
					}
					contanct.append(" AND X.CUST_CERT_CODE = :CUST_CERT_CODE ");
					queryParam.put("CUST_CERT_CODE", custCertCode);
				} else {
					contanct.append(" AND X.CUST_CERT_CODE = :CUST_CERT_CODE ");
					queryParam.put("CUST_CERT_CODE", custCertCode);
				}
			}

		}

		if (StringUtil.isNotBlank(segmentId)) {
			contanct.append(" AND K.SEGMENT_ID = :segmentId ");
			queryParam.put("segmentId", Long.parseLong(segmentId));
		}

		StringBuilder sql = null;
		if (isFlag == 1) {// 已分配
			contanct.append(" AND EXISTS (SELECT DISTINCT(R.CUST_ID) FROM {CM_GROUP_MANAGER} R WHERE X.CUST_ID = R.CUST_ID )");
		} else if (isFlag == 2) {
			contanct.append(" AND NOT EXISTS (SELECT DISTINCT(R.CUST_ID) FROM {CM_GROUP_MANAGER} R WHERE X.CUST_ID = R.CUST_ID )");
		}
		int len = managerIdList.size();
		if (start != -1 && end != -1) {
			if (len > 0) {
				contanct.append(" AND X.CUST_ID IN");
				contanct.append("(");
				contanct.append("SELECT DISTINCT(Z.CUST_ID) FROM {CM_GROUP_MANAGER} Z WHERE Z.MANAGER_ID = :custMgrId ");
				contanct.append(")");
				queryParam.put("custMgrId", managerIdList.get(0));
				sql = new StringBuilder("SELECT * FROM (SELECT B.* ");
				sql.append(" FROM (SELECT X.PARTY_ID,X.CUST_ID,X.CUST_NAME,X.CUST_SERVICE_ID,X.CUST_STATUS,X.CUST_CERT_TYPE,X.CUST_ADDRESS,");
				sql.append(" X.CUST_CERT_CODE,X.CREATE_DATE,X.REGION_ID,K.SEGMENT_ID AS GROUP_SEGMENT_ID FROM {CM_GROUP_CUSTOMER} X ,{CMX_GROUP_CUSTOMER} Y,{CM_CUST_SEGMENT_RELA} K ");
				sql.append(" WHERE X.CUST_ID=Y.CUST_ID AND X.CUST_ID = K.CUST_ID ");
				sql.append(contanct.toString()).append(" AND X.STATE='U' ) B) C  ");
				sql.append(" LIMIT ").append(start - 1).append(",").append(end - start + 1);

			} else if (len == 0) {
				sql = new StringBuilder("SELECT * FROM (SELECT B.* FROM (SELECT X.PARTY_ID,X.CUST_ID,X.CUST_NAME,X.CUST_SERVICE_ID,X.CUST_STATUS,X.CUST_CERT_TYPE,");
				sql.append("X.CUST_CERT_CODE,X.CREATE_DATE,X.REGION_ID,X.CUST_ADDRESS,K.SEGMENT_ID AS GROUP_SEGMENT_ID");
				sql.append(" FROM {CM_GROUP_CUSTOMER} x ,{CMX_GROUP_CUSTOMER} y ,{CM_CUST_SEGMENT_RELA} k ");
				sql.append(" WHERE X.CUST_ID=Y.CUST_ID AND X.CUST_ID = K.CUST_ID ").append(contanct.toString());
				sql.append(" AND X.STATE='U' ) B) C  LIMIT ").append(start - 1).append(",").append(end - start + 1);
			} else {
				return new DataContainerInterface[0];
			}
		} else {
			if (len > 0) {
				contanct.append(" AND X.CUST_ID IN");
				contanct.append("(");
				contanct.append("SELECT DISTINCT(Z.CUST_ID) FROM {CM_GROUP_MANAGER} Z WHERE Z.MANAGER_ID = :custMgrId  ");
				contanct.append(")");
				queryParam.put("custMgrId", managerIdList.get(0));
				sql = new StringBuilder("SELECT * FROM (SELECT B.* ");
				sql.append(" FROM (SELECT X.PARTY_ID,X.CUST_ID,X.CUST_NAME,X.CUST_SERVICE_ID,X.CUST_STATUS,X.CUST_CERT_TYPE,X.CUST_ADDRESS,");
				sql.append(" X.CUST_CERT_CODE,X.CREATE_DATE,X.REGION_ID,K.SEGMENT_ID AS GROUP_SEGMENT_ID FROM {CM_GROUP_CUSTOMER} X ,{CMX_GROUP_CUSTOMER} Y,{CM_CUST_SEGMENT_RELA} K ");
				sql.append(" WHERE X.CUST_ID=Y.CUST_ID AND X.CUST_ID = K.CUST_ID ");
				sql.append(contanct.toString()).append(" AND X.STATE='U' ) B) C  ");
			} else if (len == 0) {
				sql = new StringBuilder("SELECT * FROM (SELECT B.* FROM (SELECT X.PARTY_ID,X.CUST_ID,X.CUST_NAME,X.CUST_SERVICE_ID,X.CUST_STATUS,X.CUST_CERT_TYPE,");
				sql.append("X.CUST_CERT_CODE,X.CREATE_DATE,X.REGION_ID,X.CUST_ADDRESS,K.SEGMENT_ID AS GROUP_SEGMENT_ID");
				sql.append(" FROM {CM_GROUP_CUSTOMER} x ,{CMX_GROUP_CUSTOMER} y ,{CM_CUST_SEGMENT_RELA} k ");
				sql.append(" WHERE X.CUST_ID=Y.CUST_ID AND X.CUST_ID = K.CUST_ID ").append(contanct.toString());
				sql.append(" AND X.STATE='U' ) B) C ");
			} else {
				return new DataContainerInterface[0];
			}
		}
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.CUST_MGR_QRY, sql.toString(), queryParam, CmConstants.BusiLogType.CUSTOMER_LOG);
		return CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, CmLnCommonUtil.getQueryResult(sql.toString(), null, -1, -1, queryParam), queryParam);
	}

	public int queryCustForManagerSqlCount(String xmlString, String segmentId) throws Exception {
		if (StringUtils.isBlank(xmlString)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		DataContainer[] dc = ParamUtil.parseXmlCriteria(xmlString);
		if (dc == null || dc.length < 1) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		// 取出查询条件中的客户经理字段 判断是否需要查询客户经理字段

		int isFlag = dc[0].get("CUST_MANAGER_FLAG") == null ? -1 : Integer.valueOf(dc[0].get("CUST_MANAGER_FLAG").toString());
		/*
		 * DataContainerInterface[] count = queryUserCreditLevelTemp(dc[0],
		 * custManagerFlag, -1, -1, qryCustIdByTeamManager(dc[0]), segmentId);
		 * if (CmCommonUtil.isEmptyObj(count)) { return 0; } return
		 * count.length;
		 */
		// 优化客户经理分配中的客户查询
		int count = 0;
		DataContainer dt = dc[0];
		StringBuilder contanct = new StringBuilder();
		HashMap<String, Object> queryParam = new HashMap<String, Object>();
		if (dt.get(ICustomerValue.S_CustId) != null && !"-1".equals(dt.get(ICustomerValue.S_CustId))) {
			contanct.append(" AND X.CUST_ID = :CUST_ID ");
			queryParam.put("CUST_ID", dt.get(ICustomerValue.S_CustId));
		}
		if (dt.get(ICustomerValue.S_CustName) != null) {
			contanct.append(" AND X.CUST_NAME LIKE :custName ");
			queryParam.put("custName", dt.get(ICustomerValue.S_CustName) + "%");
		}
		if (dt.get("BILL_ID") != null) {
			contanct.append(" AND X.HQ_NUMBER = :BILL_ID ");
			queryParam.put("BILL_ID", dt.get("BILL_ID"));
		}
		if (dt.get(ICustomerValue.S_CustStatus) != null && !("-1").equals(dt.get(ICustomerValue.S_CustStatus))) {
			contanct.append(" AND X.CUST_STATUS = :custStatus ");
			queryParam.put("custStatus", dt.get(ICustomerValue.S_CustStatus));
		}
		if (dt.get(ICustomerValue.S_CityId) != null && !("-1").equals(dt.get(ICustomerValue.S_CityId))) {
			contanct.append(" AND X.CITY_ID = :cityId ");
			queryParam.put("cityId", dt.get(ICustomerValue.S_CityId));
		}
		if (dt.get(ICustomerValue.S_CountyId) != null && !("-1").equals(dt.get(ICustomerValue.S_CountyId))) {
			contanct.append(" AND X.COUNTY_ID = :countyId ");
			queryParam.put("countyId", dt.get(ICustomerValue.S_CountyId));
		}
		if (dt.get(ICustomerValue.S_CustServiceLevel) != null && !("-1").equals(dt.get(ICustomerValue.S_CustServiceLevel))) {
			contanct.append(" AND X.CUST_SERVICE_LEVEL = :custServiceLevel ");
			queryParam.put("custServiceLevel", dt.get(ICustomerValue.S_CustServiceLevel));
		}
		if (dt.get(ICustomerValue.S_CustServiceId) != null) {
			contanct.append(" AND X.CUST_SERVICE_ID = :custServiceId ");
			queryParam.put("custServiceId", dt.get(ICustomerValue.S_CustServiceId));
		}

		// 增加KOB NUMBER查询条件
		String custCertCode = null;
		if (dt.get(ICustomerValue.S_CustCertCode) != null) {
			custCertCode = String.valueOf(dt.get(ICustomerValue.S_CustCertCode));
			if (StringUtil.isNotBlank(custCertCode)) {
				if ((custCertCode.length() == 10) || custCertCode.startsWith("K")) {
					contanct.append(" AND X.CUST_CERT_CODE = :CUST_CERT_CODE ");
					queryParam.put("CUST_CERT_CODE", custCertCode);
				} else if (custCertCode.length() < 10) {
					int j = 10 - custCertCode.length();
					for (int i = 0; i < j; i++) {
						custCertCode = "0" + custCertCode;
					}
					contanct.append(" AND X.CUST_CERT_CODE = :CUST_CERT_CODE ");
					queryParam.put("CUST_CERT_CODE", custCertCode);
				} else {
					contanct.append(" AND X.CUST_CERT_CODE = :CUST_CERT_CODE ");
					queryParam.put("CUST_CERT_CODE", custCertCode);
				}
			}

		}

		if (StringUtil.isNotBlank(segmentId)) {
			contanct.append(" AND K.SEGMENT_ID = :segmentId ");
			queryParam.put("segmentId", Long.parseLong(segmentId));
		}

		StringBuilder sql = null;
		if (isFlag == 1) {// 已分配
			contanct.append(" AND EXISTS (SELECT DISTINCT(R.CUST_ID) FROM {CM_GROUP_MANAGER} R WHERE X.CUST_ID = R.CUST_ID )");
		} else if (isFlag == 2) {
			contanct.append(" AND NOT EXISTS (SELECT DISTINCT(R.CUST_ID) FROM {CM_GROUP_MANAGER} R WHERE X.CUST_ID = R.CUST_ID )");
		}
		List<Long> managerIdList = qryCustIdByTeamManager(dt);
		int len = managerIdList.size();
		if (len > 0) {
			contanct.append(" AND X.CUST_ID IN");
			contanct.append("(");
			contanct.append("SELECT DISTINCT(Z.CUST_ID) FROM {CM_GROUP_MANAGER} Z WHERE Z.MANAGER_ID = :custMgrId  ");
			contanct.append(")");
			queryParam.put("custMgrId", managerIdList.get(0));
			sql = new StringBuilder("SELECT COUNT(*) AS CNT FROM (SELECT B.* ");
			sql.append(" FROM (SELECT X.PARTY_ID,X.CUST_ID,X.CUST_NAME,X.CUST_SERVICE_ID,X.CUST_STATUS,X.CUST_CERT_TYPE,X.CUST_ADDRESS,");
			sql.append(" X.CUST_CERT_CODE,X.CREATE_DATE,X.REGION_ID FROM {CM_GROUP_CUSTOMER} X ,{CMX_GROUP_CUSTOMER} Y,{CM_CUST_SEGMENT_RELA} K ");
			sql.append(" WHERE X.CUST_ID=Y.CUST_ID AND X.CUST_ID = K.CUST_ID ");
			sql.append(contanct.toString()).append(" AND X.STATE='U' ) B) C  ");
		} else if (len == 0) {
			sql = new StringBuilder("SELECT COUNT(*) AS CNT FROM (SELECT B.* FROM (SELECT X.PARTY_ID,X.CUST_ID,X.CUST_NAME,X.CUST_SERVICE_ID,X.CUST_STATUS,X.CUST_CERT_TYPE,");
			sql.append("X.CUST_CERT_CODE,X.CREATE_DATE,X.REGION_ID,X.CUST_ADDRESS");
			sql.append(" FROM {CM_GROUP_CUSTOMER} x ,{CMX_GROUP_CUSTOMER} y ,{CM_CUST_SEGMENT_RELA} k ");
			sql.append(" WHERE X.CUST_ID=Y.CUST_ID AND X.CUST_ID = K.CUST_ID ").append(contanct.toString());
			sql.append(" AND X.STATE='U' ) B) C ");
		} else {

		}
		DataContainerInterface[] returnDc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(sql.toString(), null, -1, -1, queryParam), queryParam);
		if (returnDc != null && returnDc.length > 0) {
			count = returnDc[0].getAsInt("CNT");
		}
		return count;
	}

	/**
	 * 查询managerId信息
	 * 
	 * @param dt
	 * @return
	 * @throws Exception
	 */
	private List qryCustIdByTeamManager(DataContainer dt) throws Exception {
		List list = new ArrayList();
		if (CmCommonUtil.isNotEmptyObject(dt)) {
			long managerTeamId = -1;
			long[] managerId = null;
			String districtId = "";
			String districtCode = "";
			String countyCode = "";
			String countyId = "";
			String code = "";
			if (dt.get("MANAGER_TEAM_ID") != null) {
				managerTeamId = Long.valueOf(String.valueOf(dt.get("MANAGER_TEAM_ID")));
			}
			if (dt.get("MANAGER_ID") != null) {
				managerId = new long[1];
				managerId[0] = Long.valueOf(String.valueOf(dt.get("MANAGER_ID"))).longValue();
				list.add(managerId[0]);
			}
			if (dt.get(ICustomerValue.S_CityId) != null && !("-1").equals(dt.get(ICustomerValue.S_CityId))) {
				districtCode = String.valueOf(dt.get("CITY_ID"));
				IBOBsCommonDistrictValue value = BsCommonDistrictUtil.getCommonDistrictByCode(districtCode, 3);
				if (null != value) {
					districtId = String.valueOf(value.getDistrictId());
				}

			}
			if (dt.get(ICustomerValue.S_CountyId) != null && !("-1").equals(dt.get(ICustomerValue.S_CountyId))) {
				countyCode = String.valueOf(dt.get("COUNTY_ID"));
				IBOBsCommonDistrictValue value = BsCommonDistrictUtil.getCommonDistrictByCode(countyCode, 4);
				if (null != value) {
					countyId = String.valueOf(value.getDistrictId());
				}
			}
			if (dt.get("CODE") != null && !("").equals(dt.get("CODE"))) {
				code = String.valueOf(dt.get("CODE"));
			}

		}
		return list;
	}

	public ICustomerValue[] queryCustForManagerSql(String xmlString, String segmentId, int start, int end) throws Exception {
		if (StringUtils.isBlank(xmlString)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		DataContainer[] dc = ParamUtil.parseXmlCriteria(xmlString);
		if (dc == null || dc.length < 1) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		// 取出查询条件中的客户经理字段 判断是否需要查询客户经理字段
		int custManagerFlag = dc[0].get("CUST_MANAGER_FLAG") == null ? -1 : Integer.valueOf(dc[0].get("CUST_MANAGER_FLAG").toString());
		// 查询managerId对象
		DataContainerInterface[] dataConta = queryUserCreditLevelTemp(dc[0], custManagerFlag, start, end, qryCustIdByTeamManager(dc[0]), segmentId);
		List list = new ArrayList();
		if (CmCommonUtil.isNotEmptyObject(dataConta)) {
			int len = dataConta.length;
			for (int i = 0; i < len; i++) {
				ICustomerValue icust = new CustomerBean();
				icust.copy(dataConta[i]);
				list.add(icust);
			}
		}
		ICustomerValue[] vals = (ICustomerValue[]) list.toArray(new ICustomerValue[0]);
		String custCertCode = null;
		for (int i = 0; i < vals.length; i++) {
			custCertCode = vals[i].getCustCertCode();
			if (StringUtils.isNotBlank(custCertCode)) {
				if (custCertCode.startsWith("K")) {
					vals[i].setRemarks("");
				} else {
					vals[i].setRemarks(String.valueOf(Long.parseLong(custCertCode)));
				}
			}
		}
		return vals;
	}

	public int queryCustForManagerCount(String xmlString) throws Exception {
		if (StringUtils.isBlank(xmlString)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		DataContainer[] dc = ParamUtil.parseXmlCriteria(xmlString);
		if (dc == null || dc.length < 1) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		// 取出查询条件中的客户经理字段 判断是否需要查询客户经理字段
		long custManagerFlag = Long.valueOf(dc[0].get("CUST_MANAGER_FLAG").toString());
		if (custManagerFlag == -1) {
			return queryCustomerCount(dc[0]);
		} else {
			ICustomerValue[] customerValues = queryCustomers(dc[0], -1, -1);
			if (customerValues == null || customerValues.length <= 0) {
				return 0;
			}
			return queryCustByCustAndType(customerValues, custManagerFlag).length;
		}
	}

	public ICustomerValue[] queryCustForManager(String xmlString, int start, int end) throws Exception {
		ICustomerValue[] customerValues = null;
		if (StringUtils.isBlank(xmlString)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		DataContainer[] dc = ParamUtil.parseXmlCriteria(xmlString);
		if (dc == null || dc.length < 1) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		// 取出查询条件中的客户经理字段 判断是否需要查询客户经理字段
		long custManagerFlag = Long.valueOf(dc[0].get("CUST_MANAGER_FLAG").toString());
		customerValues = queryCustomers(dc[0], start, end);
		if (customerValues == null || customerValues.length < 1) {
			return new ICustomerValue[0];
		}
		if (custManagerFlag == -1) {
			return customerValues;
		} else {
			return queryCustByCustAndType(customerValues, custManagerFlag);
		}
	}

	/**
	 * 根据客户信息查询客户经理信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public ICustomerValue[] queryCustByCustAndType(ICustomerValue[] cm, long custManagerFlag) throws Exception {
		List custListFlag = new ArrayList();
		List custListNoFlag = new ArrayList();
		for (int i = 0; i < cm.length; i++) {
			IQBOSecCustManagerValue[] iBoSecStaffValue = getCustManagerInfo(Long.valueOf(cm[i].getCustId()), Long.valueOf(cm[i].getCustType()), -1, -1);
			if (iBoSecStaffValue == null || iBoSecStaffValue.length <= 0) {
				custListNoFlag.add(cm[i]);
			} else {
				custListFlag.add(cm[i]);
			}
		}
		if (custManagerFlag == CmLnConstants.GroupCustManagerFlag.CUST_MANAGER_FLAG_YES) {
			return (ICustomerValue[]) custListFlag.toArray(new ICustomerValue[0]);

		} else {
			return (ICustomerValue[]) custListNoFlag.toArray(new ICustomerValue[0]);
		}
	}

	public void saveMgrRel(IVOCustValue custValue) throws Exception {
		AbstractCustManagerDealModelImpl custManagerDealModelImpl = (AbstractCustManagerDealModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerDealModelImpl.class);
		custManagerDealModelImpl.deal(custValue);
	}

	public void saveCustManagerGroup(IBOCmGroupManagerValue[] cmIndivManager) throws Exception {
		BOCmGroupManagerEngine.saveBatch(cmIndivManager);

	}

	public void saveCustManagerIndiv(IBOCmIndivManagerValue[] cmgrpManager) throws Exception {
		BOCmIndivManagerEngine.saveBatch(cmgrpManager);
	}

	public int getCustManagerInfoByCond(long custId, long custType) throws Exception {
		int count = 0;
		if (custId == -1 || custType == -1) {
			return 0;
		}
		ISec2CmSV isCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map paraMap = new HashMap();
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			condition.append(" and ").append(IBOCmIndivManagerValue.S_CustId).append(" =:custId");
			paraMap.put("custId", custId);
			IBOCmIndivManagerValue[] cmIndivManager = BOCmIndivManagerEngine.getBeans(null, condition.toString(), paraMap, -1, -1, false);
			for (int i = 0; cmIndivManager != null && cmIndivManager.length > 0 && i < cmIndivManager.length; i++) {
				int boSec = isCm.getAmsCountByCond(cmIndivManager[i].getManagerId(), "", "");
				if (i == 0) {
					count = boSec;
				} else {
					count += boSec;
				}
			}
			return count;
		} else if (custType == CmConstants.CustomerType.GROUP) {
			condition.append(" and ").append(IBOCmIndivManagerValue.S_CustId).append(" =:custId");
			paraMap.put("custId", custId);
			IBOCmGroupManagerValue[] cmGrpManager = BOCmGroupManagerEngine.getBeans(null, condition.toString(), paraMap, -1, -1, true);
			for (int i = 0; cmGrpManager != null && cmGrpManager.length > 0 && i < cmGrpManager.length; i++) {
				int boSec = isCm.getAmsCountByCond(cmGrpManager[i].getManagerId(), "", "");
				if (i == 0) {
					count = boSec;
				} else {
					count += boSec;
				}
			}
			return count;
		} else {
			// 传入客户类型不存在
			ExceptionUtil.throwBusinessException("CMS8000030");
		}
		return 0;
	}

	public DataContainer[] getCustManagerDataInfo(long custId, long custType, int start, int end) throws Exception {
		if (custId == -1 || custType == -1) {
			// 传入数据不合法，无法操作！
			return new DataContainer[0];
		}
		List secCustList = new ArrayList();
		ISec2CmSV isCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map paraMap = new HashMap();
		condition.append(" and ").append(IBOCmGroupManagerValue.S_CustId).append(" =:custId");
		paraMap.put("custId", custId);
		condition.append(" and ").append(IBOCmGroupManagerValue.S_State).append(" =:state");
		paraMap.put("state", CmConstants.RecordState.USE);
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLogWithCustId(CmConstants.BusiLogId.CUST_MGR_QRY, condition.toString(), paraMap, CmConstants.BusiLogType.CUSTOMER_LOG, custId);
		IBOCmGroupManagerValue[] cmGrpManager = BOCmGroupManagerEngine.getBeans(null, condition.toString(), paraMap, start, end, true);
		int len = cmGrpManager.length;
		for (int i = 0; i < len; i++) {
			IQBOSecCustManagerValue bosec = isCm.getEffectAmInfo(cmGrpManager[i].getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
			DataContainer da = new DataContainer();
			if (CmCommonUtil.isNotEmptyObject(bosec)) {
				da.copy(bosec);
				da.set(IBOCmGroupManagerValue.S_RelType, cmGrpManager[i].getRelType());
				secCustList.add(da);
			}
		}
		if (secCustList == null || secCustList.size() < 0) {
			return new DataContainer[0];
		}
		return (DataContainer[]) secCustList.toArray(new DataContainer[0]);
	}

	public IQBOSecCustManagerValue[] getCustManagerInfo(long custId, long custType, int start, int end) throws Exception {
		if (custId == -1 || custType == -1) {
			// 传入数据不合法，无法操作！
			return new IQBOSecCustManagerValue[0];
		}
		List secCustList = new ArrayList();
		ISec2CmSV isCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map paraMap = new HashMap();
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			condition.append(" and ").append(IBOCmIndivManagerValue.S_CustId).append(" =:custId");
			paraMap.put("custId", custId);
			IBOCmIndivManagerValue[] cmIndivManager = BOCmIndivManagerEngine.getBeans(null, condition.toString(), paraMap, start, end, true);
			int len = cmIndivManager.length;
			for (int i = 0; i < len; i++) {
				IQBOSecCustManagerValue bosec = isCm.getEffectAmInfo(cmIndivManager[i].getManagerId(), CmLnConstants.CM_MANAGER_TYPE.STS_5);
				if (CmCommonUtil.isNotEmptyObject(bosec)) {
					secCustList.add(bosec);
				}
			}
		} else if (custType == CmConstants.CustomerType.GROUP) {
			condition.append(" and ").append(IBOCmGroupManagerValue.S_CustId).append(" =:custId");
			paraMap.put("custId", custId);
			IBOCmGroupManagerValue[] cmGrpManager = BOCmGroupManagerEngine.getBeans(null, condition.toString(), paraMap, start, end, true);
			int len = cmGrpManager.length;
			for (int i = 0; i < len; i++) {
				IQBOSecCustManagerValue bosec = isCm.getEffectAmInfo(cmGrpManager[i].getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
				if (CmCommonUtil.isNotEmptyObject(bosec)) {
					secCustList.add(bosec);
				}
			}
			if (secCustList == null || secCustList.size() < 0) {
				return new IQBOSecCustManagerValue[0];
			}

		} else {
			// 传入客户类型不存在
			ExceptionUtil.throwBusinessException("CMS8000030");
		}
		return (IQBOSecCustManagerValue[]) secCustList.toArray(new IQBOSecCustManagerValue[0]);
	}

	public IBOCmGroupMemberValue[] getBoCmGrpMemberByCustIdOrMemCustId(long custId, long memberCustId) throws Exception {
		if (custId == -1 && memberCustId == -1) {
			// 传入数据不合法，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000029");
		}
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map paraMap = new HashMap();
		if (custId != -1) {
			condition.append(" and ").append(IBOCmGroupMemberValue.S_CustId).append(" =:custId");
			paraMap.put("custId", custId);
		}
		if (memberCustId != -1) {
			condition.append(" and ").append(IBOCmGroupMemberValue.S_MemberCustId).append(" =:memberCustId");
			paraMap.put("memberCustId", memberCustId);
		}
		return BOCmGroupMemberEngine.getBeans(null, condition.toString(), paraMap, -1, -1, true);
	}

	public IBOCmGroupManagerValue[] queryManagerValue(DataContainer da, long custType, int start, int end) throws Exception {
		IBOCmGroupManagerValue[] cmGrpManager = null;
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map paraMap = new HashMap();
		long custId = -1;
		long managerId = -1;
		int relType = -1;
		if (da.get(IBOCmGroupManagerValue.S_RelType) != null) {
			relType = Integer.valueOf(da.get(IBOCmGroupManagerValue.S_RelType).toString());
		}
		if (da.get(IBOCmGroupManagerValue.S_CustId) != null) {
			custId = Long.valueOf(da.get(IBOCmGroupManagerValue.S_CustId).toString());
		}
		if (da.get(IBOCmGroupManagerValue.S_ManagerId) != null) {
			managerId = (Long) da.get(IBOCmGroupManagerValue.S_ManagerId);
		}

		if (custId != -1) {
			paraMap.put("custId", custId);
		}
		if (managerId != -1) {
			paraMap.put("managerId", managerId);
		}
		if (relType != -1) {
			paraMap.put("relType", relType);
		}
		if (custType == CmLnConstants.CustType.CUST_TYPE_INDIVE) {
			if (custId != -1) {
				condition.append(" and ").append(IBOCmIndivManagerValue.S_CustId).append(" =:custId");
			}
			if (managerId != -1) {
				condition.append(" and ").append(IBOCmIndivManagerValue.S_ManagerId).append(" =:managerId");
			}
			if (relType != -1) {
				condition.append(" and ").append(IBOCmIndivManagerValue.S_RelType).append(" =:relType");
			}
			IBOCmIndivManagerValue[] cmIndivManager = BOCmIndivManagerEngine.getBeans(null, condition.toString(), paraMap, start, end, false);
			cmGrpManager = new IBOCmGroupManagerValue[cmIndivManager.length];
			cmGrpManager[0] = new BOCmGroupManagerBean();
			cmGrpManager[0].copy(cmIndivManager[0]);
		} else {
			if (custId != -1) {
				condition.append(" and ").append(IBOCmIndivManagerValue.S_CustId).append(" =:custId");
			}
			if (managerId != -1) {
				condition.append(" and ").append(IBOCmIndivManagerValue.S_ManagerId).append(" =:managerId");
			}
			if (relType != -1) {
				condition.append(" and ").append(IBOCmIndivManagerValue.S_RelType).append(" =:relType");
			}
			cmGrpManager = BOCmGroupManagerEngine.getBeans(null, condition.toString(), paraMap, start, end, false);
		}
		return cmGrpManager;
	}

	public IBOCmIndivCustomerValue queryIndivCustValue(long custId, long partyId) throws Exception {
		// 查询个人客户信息
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustId).append(" = :custId ");
			parameter.put("custId", custId);
		}
		if (partyId > 0) {
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_PartyId).append(" = :partyId ");
			parameter.put("partyId", partyId);
		}
		// 当前有效的
		condition.append(" AND ");
		condition.append(IBOCmIndivCustomerValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);

		IBOCmIndivCustomerValue[] cmIndivCustomerValue = (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class,
				condition.toString(), parameter, -1, -1);

		if (CmCommonUtil.isEmptyObject(cmIndivCustomerValue)) {
			return (IBOCmIndivCustomerValue) new BOCmIndivCustomerBean();
		}
		return cmIndivCustomerValue[0];
	}

	public DataContainerInterface[] queryRootGroupInfosByCustId(long custId, int startNum, int endNum) throws Exception {
		{
			String sql = "select t.*,level  from party.cm_group_customer t start with t.cust_id = :custId "
					+ " connect by t.cust_id = prior t.parent_cust_id and t.state='U' order by level desc ";
			HashMap parameter = new HashMap();
			parameter.put("custId", custId);

			return CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupCustomerBean.class, CmLnCommonUtil.getQueryResult(sql, "", startNum, endNum, parameter),
					parameter);
		}
	}

	public void updateCustInfo(Map paraMap) throws Exception {
		String objNullValue = "null";
		String groupId = CmCommonUtil.isEmptyObj(paraMap.get("GroupId")) ? "" : paraMap.get("GroupId").toString();
		String billId = CmCommonUtil.isEmptyObj(paraMap.get("ServiceNum")) ? "" : paraMap.get("ServiceNum").toString();
		if (StringUtils.isBlank(groupId) && StringUtils.isBlank(billId)) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		if (!CmCommonUtil.isEmptyObj(paraMap.get("CustInfo"))) {
			ICustomerValue customerValue = null;
			// 默认优先根据groupId查询
			if (StringUtils.isNotBlank(groupId)) {
				customerValue = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(groupId, CmConstants.CustomerType.GROUP);
			} else {
				// 否则根据手机号码查询
				ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
				IInsUserValue userValue = teamInvokeSV.getInsUser(-1, billId);
				if (userValue == null) {
					// 根据手机号码[{0}]没有查询到用户信息！
					ExceptionUtil.throwBusinessException("CMS5000154", billId);
				}
				long custId = userValue.getCustId();
				customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
			}

			if (customerValue == null) {
				// 根据条件没有查询到客户信息！
				ExceptionUtil.throwBusinessException("CMS0020525");
			}

			Map custInfo = (Map) paraMap.get("CustInfo");
			// 获取参数
			if (!CmCommonUtil.isEmptyObj(custInfo.get("CustLanguage"))) {
				customerValue.setCustLanguage(custInfo.get("CustLanguage").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("CustLanguage")))) {
				customerValue.setCustLanguage(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("CustAddress"))) {
				customerValue.setCustAddress(custInfo.get("CustAddress").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("CustAddress")))) {
				customerValue.setCustAddress(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("CustZipcode"))) {
				customerValue.setCustZipcode(custInfo.get("CustZipcode").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("CustZipcode")))) {
				customerValue.setCustZipcode(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("DoneDate"))) {
				customerValue.setDoneDate(TimeUtil.getTimstampByString(custInfo.get("DoneDate").toString(), "yyyyMMddHHmmss"));
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("DoneDate")))) {
				customerValue.setDoneDate(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("OpId"))) {
				customerValue.setOpId(Long.parseLong(custInfo.get("OpId").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("OrgId"))) {
				customerValue.setOrgId(Long.parseLong(custInfo.get("OrgId").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Remarks"))) {
				customerValue.setRemarks(custInfo.get("Remarks").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("Remarks")))) {
				customerValue.setRemarks(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Birthday"))) {
				customerValue.setBirthday(TimeUtil.getTimstampByString(custInfo.get("Birthday").toString(), "yyyyMMdd"));
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("Birthday")))) {
				customerValue.setBirthday(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("CharacterDesc"))) {
				customerValue.setCharacterDesc(custInfo.get("CharacterDesc").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("CharacterDesc")))) {
				customerValue.setCharacterDesc(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("EducationLevel"))) {
				customerValue.setEducationLevel(Integer.parseInt(custInfo.get("EducationLevel").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("FamilyInfo"))) {
				customerValue.setFamilyInfo(custInfo.get("FamilyInfo").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("FamilyInfo")))) {
				customerValue.setFamilyInfo(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Gender"))) {
				customerValue.setGender(Integer.parseInt(custInfo.get("Gender").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Hobby"))) {
				customerValue.setHobby(custInfo.get("Hobby").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("Hobby")))) {
				customerValue.setHobby(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("IncomeLevel"))) {
				customerValue.setIncomeLevel(Integer.parseInt(custInfo.get("IncomeLevel").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("JobCompany"))) {
				customerValue.setJobCompany(custInfo.get("JobCompany").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("JobCompany")))) {
				customerValue.setJobCompany(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("JobPosition"))) {
				customerValue.setJobPosition(custInfo.get("JobPosition").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("JobPosition")))) {
				customerValue.setJobPosition(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Lunar"))) {
				customerValue.setLunar(Integer.parseInt(custInfo.get("Lunar").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("MarryStatus"))) {
				customerValue.setMarryStatus(Integer.parseInt(custInfo.get("MarryStatus").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("NationalType"))) {
				customerValue.setNationalType(Integer.parseInt(custInfo.get("NationalType").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Occupation"))) {
				customerValue.setOccupation(Integer.parseInt(custInfo.get("Occupation").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("PoliticsFace"))) {
				customerValue.setPoliticsFace(Integer.parseInt(custInfo.get("PoliticsFace").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Religion"))) {
				customerValue.setReligion(custInfo.get("Religion").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("Religion")))) {
				customerValue.setReligion(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("GroupFax"))) {
				customerValue.setGroupFax(custInfo.get("GroupFax").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("GroupFax")))) {
				customerValue.setGroupFax(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("GroupType"))) {
				customerValue.setGroupType(Integer.parseInt(custInfo.get("GroupType").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("GroupWeb"))) {
				customerValue.setGroupWeb(custInfo.get("GroupWeb").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("GroupWeb")))) {
				customerValue.setGroupWeb(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("HqNumber"))) {
				customerValue.setHqNumber(custInfo.get("HqNumber").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("HqNumber")))) {
				customerValue.setHqNumber(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("LegalCustId"))) {
				customerValue.setLegalCustId(Long.parseLong(custInfo.get("LegalCustId").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("LegalCustName"))) {
				customerValue.setLegalCustName(custInfo.get("LegalCustName").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("LegalCustName")))) {
				customerValue.setLegalCustName(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("ShortName"))) {
				customerValue.setShortName(custInfo.get("ShortName").toString());
			} else if (objNullValue.equalsIgnoreCase(DataType.getAsString(custInfo.get("ShortName")))) {
				customerValue.setShortName(null);
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("StaffAmount"))) {
				customerValue.setStaffAmount(Long.parseLong(custInfo.get("StaffAmount").toString()));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Mail"))) {
				customerValue.setContEmail((String) custInfo.get("Mail"));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Contactor"))) {
				customerValue.setContName((String) custInfo.get("Contactor"));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("ContactPhone"))) {
				customerValue.setContMobile((String) custInfo.get("ContactPhone"));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("CampanyAddr"))) {
				customerValue.setContAddress((String) custInfo.get("CampanyAddr"));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("CampanyPhone"))) {
				customerValue.setOfficeTel((String) custInfo.get("CampanyPhone"));
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Fax"))) {
				customerValue.setContFax((String) custInfo.get("Fax"));
			}

			IVOCustValue custValue = new VOCustBean();

			// 获取联系人信息
			IContactValue iContactValue = new ContactBean();
			// 查询联系人信息
			DataContainer dc = new DataContainer();
			dc.set(IContactValue.S_CustId, customerValue.getCustId());
			dc.set(IContactValue.S_PrioryLevel, Integer.valueOf(CmConstants.CONT_LEVEL.CONT_LEVEL_1));
			IContactValue[] queryContactValues = CmServiceFactory.getContactSV().queryCustContacts(dc, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(queryContactValues)) {
				// 修改操作
				iContactValue.copy(queryContactValues[0]);
				iContactValue.setStsToOld();
			} else {
				iContactValue.setCustId(customerValue.getCustId());
				iContactValue.setPrioryLevel(CmConstants.CONT_LEVEL.CONT_LEVEL_1);
			}
			// 设置参数
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Mail"))) {
				iContactValue.setContEmail(custInfo.get("Mail").toString());
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Contactor"))) {
				iContactValue.setContName(custInfo.get("Contactor").toString());
				iContactValue.setPartyName(custInfo.get("Contactor").toString());
			} else {
				iContactValue.setContName(customerValue.getCustName());
				iContactValue.setPartyName(customerValue.getCustName());
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("ContactPhone"))) {
				iContactValue.setContMobile(custInfo.get("ContactPhone").toString());
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("CampanyAddr"))) {
				iContactValue.setContAddress(custInfo.get("CampanyAddr").toString());
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("CampanyPhone"))) {
				iContactValue.setOfficeTel(custInfo.get("CampanyPhone").toString());
			}
			if (!CmCommonUtil.isEmptyObj(custInfo.get("Fax"))) {
				iContactValue.setContFax(custInfo.get("Fax").toString());
			}
			iContactValue.setCertType(CmConstants.CertificateType.OTHER_CERTIFICATE);
			iContactValue.setCertCode(String.valueOf(System.currentTimeMillis()));
			custValue.addContact(iContactValue);

			// 保存联系人
			CmServiceFactory.getContactSV().saveCustContact(custValue);
			// 保存客户
			CmServiceFactory.getCustomerSV().saveCustomer(customerValue);
		}

	}

	public int queryCustomersCount4Group(String xmlComdition) throws Exception {
		return queryCustomers4GroupByMultiCount(xmlComdition, null);
	}

	public int queryCustomers4GroupCount(String xmlComdition) throws Exception {
		return queryCustomers4GroupByMultiCount(xmlComdition, null);
	}

	public int queryCustomers4GroupByMultiCount(String xmlComdition, String custStatus) throws Exception {
		/*
		 * ICustomerValue[] result = queryCustomers4GroupByMulti(xmlComdition, custStatus, -1, -1);
		 * return CmCommonUtil.isEmptyObject(result) ? 0 : result.length;
		 */
		// 查询优化
		int count = 0;
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlComdition);
		if (CmCommonUtil.isEmptyObject(dcs)) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (!CmCommonUtil.isEmptyObj(custStatus)) {
			dcs[0].set("CUST_STATUS", custStatus);
		}

		if (dcs[0] != null) {
			count = queryGroupCustCountByCdns(dcs[0]);
		}
		return count;
	}

	public ICustomerValue[] queryCustomers4Group(String xmlComdition, int startNum, int endNum) throws Exception {
		ICustomerValue[] results = null;
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlComdition);
		if (CmCommonUtil.isEmptyObject(dcs)) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		// 1.集团名称;2.集团产品;3.成员类型;4.集团账号
		int qryType = dcs[0].getAsInt("QRY_TYPE");
		long pageManagerId = -1; // 页面传递过来的客户经理编号
		switch (qryType) {
			case 1:
				pageManagerId = DataType.getAsLong(dcs[0].get("MANAGER_ID"));
				results = this.queryGroupCustByCdns(dcs[0], startNum, endNum);
				break;
			case 2:
				pageManagerId = DataType.getAsLong(dcs[0].get("MANAGER_CODE"));
				results = this.queryGroupCustByOfferId(dcs[0], startNum, endNum);
				break;
			case 3:
				int memberType = dcs[0].getAsInt("MEMBER_TYPE");
				String memberBillId = dcs[0].getAsString("MEMBER_BILL_ID");
				results = this.queryGroupCustByMember(memberType, memberBillId, startNum, endNum);
				break;
			case 4:
				long acctId = dcs[0].getAsLong("ACCOUNT_ID");
				results = this.queryGroupCustByAcctId(acctId, startNum, endNum);
				break;
			case 5:
				String billId = dcs[0].getAsString("BILL_ID");
				results = this.queryGroupCustByBillId(billId, startNum, endNum);
				break;
			default:
				break;
		}
		if (CmCommonUtil.isEmptyObject(results)) {
			return new ICustomerValue[0];
		}
		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		IQBOSecCustManagerValue secStaff = null;
		IBOCmGroupManagerValue gMgrRel = null;
		String groupLevel = "";
		String countyId = "";
		String custStats = "";
		ICmCustSegmentRelaSV cmCustSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue boCmCustSegmentRela = null;
		ICmCustSegmentSV cmCustSegmentSV = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		IBoCmCustSegmentValue boCmCustSegment = null;
		if (null != results) {
			for (int i = 0; i < results.length; i++) {
				results[i].setCustType(CmConstants.CustomerType.GROUP);

				// 设置枚举值的显示值
				groupLevel = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_CUST_SERVICE_LEVEL_3", String.valueOf(results[i].getCustServiceLevel()));
				results[i].setCustServiceLevelDesc(groupLevel);
				IBOBsCommonDistrictValue districtValue = BsCommonDistrictUtil.getCommonDistrictByCode(results[i].getCountyId(), 4);
				if (districtValue != null) {
					countyId = districtValue.getDistrictName();
				}
				results[i].setSubRegionTypeDesc(countyId);
				custStats = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_CUST_STATUS_3", String.valueOf(results[i].getCustStatus()));
				results[i].setCustStatusDesc(custStats);
				if (pageManagerId > 0) {
					secStaff = iseCm.getEffectAmInfo(pageManagerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
				} else {
					gMgrRel = cnGroupSv.queryGroupCustMgrRel(results[i].getCustId());
					if (gMgrRel == null) {
						continue;
					}
					secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
				}
				if (CmCommonUtil.isNotEmptyObject(secStaff)) {
					results[i].setManagerId(secStaff.getManagerid());
					results[i].setManagerName(secStaff.getManagername());
					results[i].setManagerPhone(secStaff.getBillid());
				} else {// 客户经理组
					if (null != gMgrRel) {
						IBOSecOrganizeValue[] ibOrganizeValues = OrgmodelClient.queryOrganizeInfo(gMgrRel.getManagerId(), null, null, null, null, -1, -1);
						if (CmCommonUtil.isNotEmptyObject(ibOrganizeValues)) {
							results[i].setManagerId(ibOrganizeValues[0].getOrganizeId());
							results[i].setManagerName(ibOrganizeValues[0].getOrganizeName());
							results[i].setManagerPhone(ibOrganizeValues[0].getPhoneId());
						}
					}
				}
				// 增加客户细分展现
				boCmCustSegmentRela = cmCustSegmentRelaSV.querySegmentRelaByCustId(results[i].getCustId());
				if (CmCommonUtil.isNotEmptyObject(boCmCustSegmentRela)) {
					results[i].setGroupSegmentId(String.valueOf(boCmCustSegmentRela.getSegmentId()));
					boCmCustSegment = cmCustSegmentSV.querySegmentByIdfromCache(boCmCustSegmentRela.getSegmentId());
					results[i].setGroupCustSegment(boCmCustSegment.getSegmentName());
				}
			}
		}
		return results;
	}

	public ICustomerValue[] queryCustomers4GroupByMulti(String xmlComdition, String custStatus, int startNum, int endNum) throws Exception {
		ICustomerValue[] results = null;
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlComdition);
		if (CmCommonUtil.isEmptyObject(dcs)) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (!CmCommonUtil.isEmptyObj(custStatus)) {
			dcs[0].set("CUST_STATUS", custStatus);
		}
		// 1.集团名称;2.集团产品;3.成员类型;4.集团账号
		int qryType = dcs[0].getAsInt("QRY_TYPE");
		long pageManagerId = -1; // 页面传递过来的客户经理编号
		switch (qryType) {
			case 1:
				pageManagerId = DataType.getAsLong(dcs[0].get("MANAGER_ID"));
				results = this.queryGroupCustByCdns(dcs[0], startNum, endNum);
				break;
			case 2:
				pageManagerId = DataType.getAsLong(dcs[0].get("MANAGER_CODE"));
				results = this.queryGroupCustByOfferId(dcs[0], startNum, endNum);
				break;
			case 3:
				int memberType = dcs[0].getAsInt("MEMBER_TYPE");
				String memberBillId = dcs[0].getAsString("MEMBER_BILL_ID");
				results = this.queryGroupCustByMember(memberType, memberBillId, startNum, endNum);
				break;
			case 4:
				long acctId = dcs[0].getAsLong("ACCOUNT_ID");
				results = this.queryGroupCustByAcctId(acctId, startNum, endNum);
				break;
			case 5:
				String billId = dcs[0].getAsString("BILL_ID");
				results = this.queryGroupCustByBillId(billId, startNum, endNum);
				break;
			default:
				break;
		}
		if (CmCommonUtil.isEmptyObject(results)) {
			return new ICustomerValue[0];
		}
		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		IQBOSecCustManagerValue secStaff = null;
		IBOCmGroupManagerValue gMgrRel = null;
		String groupLevel = "";
		String countyId = "";
		String custStats = "";
		ICmCustSegmentRelaSV cmCustSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue boCmCustSegmentRela = null;
		ICmCustSegmentSV cmCustSegmentSV = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		IBoCmCustSegmentValue boCmCustSegment = null;
		if (null != results) {
			for (int i = 0; i < results.length; i++) {
				results[i].setCustType(CmConstants.CustomerType.GROUP);

				// 设置枚举值的显示值
				groupLevel = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_CUST_SERVICE_LEVEL_3", String.valueOf(results[i].getCustServiceLevel()));
				results[i].setCustServiceLevelDesc(groupLevel);
				IBOBsCommonDistrictValue districtValue = BsCommonDistrictUtil.getCommonDistrictByCode(results[i].getCountyId(), 4);
				if (districtValue != null) {
					countyId = districtValue.getDistrictName();
				}
				results[i].setSubRegionTypeDesc(countyId);
				custStats = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_CUST_STATUS_3", String.valueOf(results[i].getCustStatus()));
				results[i].setCustStatusDesc(custStats);
				// 增加客户细分展现
				boCmCustSegmentRela = cmCustSegmentRelaSV.querySegmentRelaByCustId(results[i].getCustId());
				if (CmCommonUtil.isNotEmptyObject(boCmCustSegmentRela)) {
					results[i].setGroupSegmentId(String.valueOf(boCmCustSegmentRela.getSegmentId()));
					gMgrRel = cnGroupSv.queryGroupCustMgrRel(results[i].getCustId());
					if (gMgrRel != null) {
						if (CmConstants.segment.SA.equals(String.valueOf(boCmCustSegmentRela.getSegmentId()))) {
							// 客户经理组
							IBOSecGroupValue ibOrganizeValue = OrgmodelClient.getGroupValueByGroupId(gMgrRel.getManagerId());
							if (CmCommonUtil.isNotEmptyObject(ibOrganizeValue)) {
								results[i].setManagerId(ibOrganizeValue.getGroupId());
								results[i].setManagerName(ibOrganizeValue.getGroupName());
								results[i].setManagerPhone("");
							}
						} else {
							// 客户经理
							if (pageManagerId > 0) {
								secStaff = iseCm.getEffectAmInfo(pageManagerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
							} else {
								secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
							}
							if (CmCommonUtil.isNotEmptyObject(secStaff)) {
								results[i].setManagerId(secStaff.getManagerid());
								results[i].setManagerName(secStaff.getManagername());
								results[i].setManagerPhone(secStaff.getBillid());
							}
						}
					}
					boCmCustSegment = cmCustSegmentSV.querySegmentByIdfromCache(boCmCustSegmentRela.getSegmentId());
					results[i].setGroupCustSegment(boCmCustSegment.getSegmentName());
				}
			}
		}
		return results;
	}

	public ICustomerValue[] queryGroupCustByCdns(DataContainer dc, int startNum, int endNum) throws Exception {
		// 封装正确的查询dc
		DataContainer temp = new DataContainer();
		String billId = dc.getAsString("BILL_ID");
		long managerId = dc.getAsLong("MANAGER_ID");
		if (managerId > 0) {
			// 如果这个客户经理对应的组是MA,SA，则要使用该组的ORG_ID替代这个MANAGER_ID
			IBOSecOrganizeValue organizeValue = OrgmodelClient.getSecOrgByOperatorId(managerId);
			String orgCode = organizeValue.getCode();
			long orgId = organizeValue.getOrganizeId();
			ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			IBOCmSegMgrGroupRelValue relValue = groupCustomerSV.querySegMgrGroupRelByGroupCode(orgCode);
			if (null != relValue) {
				long segmentId = relValue.getSegmentId();
				if (segmentId == Long.parseLong(CmConstants.segment.MA) || segmentId == Long.parseLong(CmConstants.segment.SA)) {
					managerId = orgId;
				}
			}
		}

		if (dc.hasProperty(ICustomerValue.S_CustId)) {
			temp.set(ICustomerValue.S_CustId, dc.get(ICustomerValue.S_CustId));
		}
		if (dc.hasProperty(ICustomerValue.S_CustCertCode)) {
			String certCode = dc.get(ICustomerValue.S_CustCertCode).toString();
			if (certCode.indexOf("K") < 0) {
				certCode = StringUtils.leftPad(certCode, 10, "0");
			}
			temp.set(ICustomerValue.S_CustCertCode, certCode);
		}
		if (dc.hasProperty(ICustomerValue.S_CustServiceId)) {
			temp.set(ICustomerValue.S_CustServiceId, dc.get(ICustomerValue.S_CustServiceId));
		}
		if (dc.hasProperty(ICustomerValue.S_CustType)) {
			temp.set(ICustomerValue.S_CustType, dc.get(ICustomerValue.S_CustType));
		}
		if (dc.hasProperty(ICustomerValue.S_ContMobile)) {
			temp.set(ICustomerValue.S_ContMobile, dc.get(ICustomerValue.S_ContMobile));
		}
		if (dc.hasProperty(ICustomerValue.S_CustName)) {
			temp.set(ICustomerValue.S_CustName, dc.get(ICustomerValue.S_CustName));
		}
		if (dc.hasProperty(ICustomerValue.S_CustAddress)) {
			temp.set(ICustomerValue.S_CustAddress, dc.get(ICustomerValue.S_CustAddress));
		}
		if (dc.hasProperty(ICustomerValue.S_CustCertAddress)) {
			temp.set(ICustomerValue.S_CustCertAddress, dc.get(ICustomerValue.S_CustCertAddress));
		}
		if (dc.hasProperty("MATCH_TYPE")) {
			temp.set("MATCH_TYPE", dc.get("MATCH_TYPE"));
		}
		if (dc.hasProperty("START_CREATE_DATE")) {
			temp.set("START_CREATE_DATE", dc.get("START_CREATE_DATE"));
		}
		if (dc.hasProperty("END_CREATE_DATE")) {
			temp.set("END_CREATE_DATE", dc.get("END_CREATE_DATE"));
		}
		if (dc.hasProperty(ICustomerValue.S_CityId)) {
			temp.set(ICustomerValue.S_CityId, dc.get(ICustomerValue.S_CityId));
		}
		if (dc.hasProperty(ICustomerValue.S_CountyId)) {
			temp.set(ICustomerValue.S_CountyId, dc.get(ICustomerValue.S_CountyId));
		}
		if (dc.hasProperty(ICustomerValue.S_CustServiceLevel)) {
			temp.set(ICustomerValue.S_CustServiceLevel, dc.get(ICustomerValue.S_CustServiceLevel));
		}
		if (dc.hasProperty(ICustomerValue.S_CustStatus)) {
			temp.set(ICustomerValue.S_CustStatus, dc.get(ICustomerValue.S_CustStatus));
		}
		if (dc.hasProperty("CVR_NUMBER")) {
			temp.set("TAX_ID", dc.get("CVR_NUMBER"));
		}
		if (dc.hasProperty("VPMN_ID")) {
			String vpmnId = dc.getAsString("VPMN_ID");
			ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			if ("1".equalsIgnoreCase(dc.getAsString("IS_VPMN"))) { // VPMN

				long custId = 0L;
				if (StringUtils.isNotBlank(vpmnId)) {
					custId = teamInvokeSV.getCustIdByVpmnId(vpmnId);
				}

				temp.clear();
				if (custId > 0) {
					temp.set(ICustomerValue.S_CustId, Long.valueOf(custId));
					managerId = -1;
				} else {
					temp.set(ICustomerValue.S_CustId, "99999999999999");
				}

			} else {
				if (StringUtils.isNotBlank(vpmnId)) {
					long custId = teamInvokeSV.getCustIdByVpmnId(vpmnId);
					temp.set(ICustomerValue.S_CustId, custId == 0 ? "99999999999999" : Long.valueOf(custId));
				}
			}

		}

		if (StringUtils.isNotBlank(billId)) {
			ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			IBOUserInfoValue userInfoValue = teamInvokeSV.queryUserInfoByBillId(billId);
			if (userInfoValue != null) {
				temp.set(ICustomerValue.S_CustId, Long.valueOf(userInfoValue.getCustId()));
			}
		}

		AbstractCustomerQueryBusiModelImpl queryBusiModel = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		ICustomerValue[] result = queryBusiModel.queryManagedCustomers(managerId, dc.getAsInt(ICustomerValue.S_CustType), temp, startNum, endNum);
		if (CmCommonUtil.isEmptyObj(result)) {
			return new ICustomerValue[0];
		}
		return result;
	}

	/**
	 * 查询集团客户数量
	 * 
	 * @param dc
	 * @return
	 * @throws Exception
	 */
	public int queryGroupCustCountByCdns(DataContainer dc) throws Exception {
		int count = 0;
		// 封装正确的查询dc
		DataContainer temp = new DataContainer();
		String billId = dc.getAsString("BILL_ID");
		long managerId = dc.getAsLong("MANAGER_ID");
		if (managerId > 0) {
			// 如果这个客户经理对应的组是MA,SA，则要使用该组的ORG_ID替代这个MANAGER_ID
			IBOSecOrganizeValue organizeValue = OrgmodelClient.getSecOrgByOperatorId(managerId);
			String orgCode = organizeValue.getCode();
			long orgId = organizeValue.getOrganizeId();
			ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			IBOCmSegMgrGroupRelValue relValue = groupCustomerSV.querySegMgrGroupRelByGroupCode(orgCode);
			if (null != relValue) {
				long segmentId = relValue.getSegmentId();
				if (segmentId == Long.parseLong(CmConstants.segment.MA) || segmentId == Long.parseLong(CmConstants.segment.SA)) {
					managerId = orgId;
				}
			}
		}

		if (dc.hasProperty(ICustomerValue.S_CustId)) {
			temp.set(ICustomerValue.S_CustId, dc.get(ICustomerValue.S_CustId));
		}
		if (dc.hasProperty(ICustomerValue.S_CustCertCode)) {
			String certCode = dc.get(ICustomerValue.S_CustCertCode).toString();
			if (certCode.indexOf("K") < 0) {
				certCode = StringUtils.leftPad(certCode, 10, "0");
			}
			temp.set(ICustomerValue.S_CustCertCode, certCode);
		}
		if (dc.hasProperty(ICustomerValue.S_CustServiceId)) {
			temp.set(ICustomerValue.S_CustServiceId, dc.get(ICustomerValue.S_CustServiceId));
		}
		if (dc.hasProperty(ICustomerValue.S_CustType)) {
			temp.set(ICustomerValue.S_CustType, dc.get(ICustomerValue.S_CustType));
		}
		if (dc.hasProperty(ICustomerValue.S_ContMobile)) {
			temp.set(ICustomerValue.S_ContMobile, dc.get(ICustomerValue.S_ContMobile));
		}
		if (dc.hasProperty(ICustomerValue.S_CustName)) {
			temp.set(ICustomerValue.S_CustName, dc.get(ICustomerValue.S_CustName));
		}
		if (dc.hasProperty(ICustomerValue.S_CustAddress)) {
			temp.set(ICustomerValue.S_CustAddress, dc.get(ICustomerValue.S_CustAddress));
		}
		if (dc.hasProperty(ICustomerValue.S_CustCertAddress)) {
			temp.set(ICustomerValue.S_CustCertAddress, dc.get(ICustomerValue.S_CustCertAddress));
		}
		if (dc.hasProperty("MATCH_TYPE")) {
			temp.set("MATCH_TYPE", dc.get("MATCH_TYPE"));
		}
		if (dc.hasProperty("START_CREATE_DATE")) {
			temp.set("START_CREATE_DATE", dc.get("START_CREATE_DATE"));
		}
		if (dc.hasProperty("END_CREATE_DATE")) {
			temp.set("END_CREATE_DATE", dc.get("END_CREATE_DATE"));
		}
		if (dc.hasProperty(ICustomerValue.S_CityId)) {
			temp.set(ICustomerValue.S_CityId, dc.get(ICustomerValue.S_CityId));
		}
		if (dc.hasProperty(ICustomerValue.S_CountyId)) {
			temp.set(ICustomerValue.S_CountyId, dc.get(ICustomerValue.S_CountyId));
		}
		if (dc.hasProperty(ICustomerValue.S_CustServiceLevel)) {
			temp.set(ICustomerValue.S_CustServiceLevel, dc.get(ICustomerValue.S_CustServiceLevel));
		}
		if (dc.hasProperty(ICustomerValue.S_CustStatus)) {
			temp.set(ICustomerValue.S_CustStatus, dc.get(ICustomerValue.S_CustStatus));
		}
		if (dc.hasProperty("CVR_NUMBER")) {
			temp.set("TAX_ID", dc.get("CVR_NUMBER"));
		}
		if (dc.hasProperty("VPMN_ID")) {
			String vpmnId = dc.getAsString("VPMN_ID");
			ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			if ("1".equalsIgnoreCase(dc.getAsString("IS_VPMN"))) { // VPMN

				long custId = 0L;
				if (StringUtils.isNotBlank(vpmnId)) {
					custId = teamInvokeSV.getCustIdByVpmnId(vpmnId);
				}

				temp.clear();
				if (custId > 0) {
					temp.set(ICustomerValue.S_CustId, Long.valueOf(custId));
					managerId = -1;
				} else {
					temp.set(ICustomerValue.S_CustId, "99999999999999");
				}

			} else {
				if (StringUtils.isNotBlank(vpmnId)) {
					long custId = teamInvokeSV.getCustIdByVpmnId(vpmnId);
					temp.set(ICustomerValue.S_CustId, custId == 0 ? "99999999999999" : Long.valueOf(custId));
				}
			}

		}

		if (StringUtils.isNotBlank(billId)) {
			ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			IBOUserInfoValue userInfoValue = teamInvokeSV.queryUserInfoByBillId(billId);
			if (userInfoValue != null) {
				temp.set(ICustomerValue.S_CustId, Long.valueOf(userInfoValue.getCustId()));
			}
		}

		AbstractCustomerQueryBusiModelImpl queryBusiModel = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		count = queryBusiModel.queryManagedCustomerCount(managerId, dc.getAsInt(ICustomerValue.S_CustType), temp);
		return count;
	}

	public ICustomerValue[] queryGroupCustByMember(int memberType, String billId, int startNum, int endNum) throws Exception {
		if (memberType <= 0 || StringUtils.isEmpty(billId)) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer dc = null;
		ICustomerValue[] results = null;
		// 1：联系人 4: 网内成员 2: 关键人物 3：集团家属
		if (memberType == 4) {
			ICmGroupMemberSV groupMemberSV = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
			dc = new DataContainer();
			dc.set(IBOCmGroupMemberValue.S_MemberType, CmLnConstants.GroupContType.GROUP_MEMBER_INNER);
			dc.set(IBOCmGroupMemberValue.S_BillId, billId);
			IBOCmGroupMemberValue[] groupMemberValues = groupMemberSV.queryGroupMemberValues(dc, startNum, endNum);

			long[] custIds = new long[groupMemberValues.length];
			for (int i = 0, len = groupMemberValues.length; i < len; i++) {
				custIds[i] = groupMemberValues[i].getCustId();
			}
			results = this.queryCustomersByCustIds(custIds, CmConstants.CustomerType.GROUP, startNum, endNum);
		} else {
			dc = new DataContainer();
			dc.set(IContactValue.S_ContType, Integer.valueOf(memberType));
			dc.set(IContactValue.S_BillId, billId);
			dc.set(ICustomerValue.S_CustType, Integer.valueOf(CmConstants.CustomerType.GROUP));
			IContactValue[] contactValues = CmServiceFactory.getContactSV().queryCustContacts(dc, startNum, endNum);

			long[] custIds = new long[contactValues.length];
			for (int i = 0, len = contactValues.length; i < len; i++) {
				custIds[i] = contactValues[i].getCustId();
			}
			results = this.queryCustomersByCustIds(custIds, CmConstants.CustomerType.GROUP, startNum, endNum);
		}

		if (CmCommonUtil.isEmptyObj(results)) {
			return new ICustomerValue[0];
		}
		return results;
	}

	public ICustomerValue[] queryGroupCustByBillId(String billId, int startNum, int endNum) throws Exception {
		ICmTeamInvokeSV iCmTeamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		List custList = iCmTeamInvokeSV.queryGroupCustIdByBillId(billId);
		List customerList = new ArrayList();
		if (null != custList && !custList.isEmpty()) {
			Long[] ids = (Long[]) custList.toArray(new Long[0]);
			long[] custIds = ArrayUtils.toPrimitive(ids);
			ICustomerValue[] icValues = CmServiceFactory.getCustomerSV().queryCustomersByCustIds(custIds, CmConstants.CustomerType.GROUP, startNum, endNum);
			CollectionUtils.addAll(customerList, icValues);
		}
		return (ICustomerValue[]) customerList.toArray(new CustomerBean[0]);
	}

	public ICustomerValue[] queryGroupCustByAcctId(long acctId, int startNum, int endNum) throws Exception {
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) CmServiceFactory.getAccountSV()
				.queryCustAcctRels(acctId, -1, BOCmCustAcctRelBean.class, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(acctRelValues)) {
			long custId = acctRelValues[0].getRelCustId();
			DataContainer dc = new DataContainer();
			dc.set(ICustomerValue.S_CustId, Long.valueOf(custId));
			ICustomerValue[] results = (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class)).queryData(
					new DataContainer[] { dc }, startNum, endNum);
			if (CmCommonUtil.isNotEmptyObject(results)) {
				return results;
			}
		}
		return new ICustomerValue[0];
	}

	public ICustomerValue[] queryGroupCustByOfferId(DataContainer dc, int startNum, int endNum) throws Exception {
		List list = new ArrayList();
		Map map = new HashMap();
		long offerId = dc.getAsLong("PROD_NAME");
		Timestamp effDate = com.ai.omframe.util.TimeUtil.convertStringToDate(dc.getAsString("EFFTIVE_DATE"), TimeUtil.YYYY_MM_DD);
		Timestamp expDate = com.ai.omframe.util.TimeUtil.convertStringToDate(dc.getAsString("EXPERIE_DATE"), TimeUtil.YYYY_MM_DD);
		String regionId = dc.getAsString("REGION_ID");
		String countyId = dc.getAsString("COUNTY_CODE");
		String managerId = dc.getAsString("MANAGER_CODE");
		ICust2CrmSV cust2CrmSV = (ICust2CrmSV) ServiceFactory.getService(ICust2CrmSV.class);
		IBbossInstanceQrySV bbossInstQrySv = (IBbossInstanceQrySV) ServiceFactory.getService(IBbossInstanceQrySV.class);
		IInsOfferValue[] insOfferValues = bbossInstQrySv.getInstOfferByOfferId(offerId, effDate, expDate, startNum, endNum);
		if (insOfferValues != null && insOfferValues.length > 0) {
			// add by xialing,2013-8-26,增加客户和客户经理信息临时缓存，减少数据库交互次数
			Map custInfoMap = new HashMap();
			Map managerInfoMap = new HashMap();
			for (int i = 0; i < insOfferValues.length; i++) {
				if (regionId.equals(insOfferValues[i].getRegionId()) && insOfferValues[i].getState() != OrderConst.INST_STATE_DEL
						&& ("-1".equals(countyId) || null == countyId || countyId.equals(insOfferValues[i].getCountyCode()))) {
					if (map.containsKey(insOfferValues[i].getCustId())) {
						continue;
					}
					// modify by xialing,2013-8-26,修改客户经理条件过滤
					Long custId = Long.valueOf(insOfferValues[i].getCustId());
					ICustomerValue customerValue = (ICustomerValue) custInfoMap.get(custId);
					if (customerValue == null) {
						customerValue = cust2CrmSV.getCustById(custId);
						custInfoMap.put(custId, customerValue);
					}
					if (customerValue != null) {
						if (StringUtils.isBlank(managerId)) {
							list.add(customerValue);
							map.put(insOfferValues[i].getCustId(), insOfferValues[i].getCustId());
						} else {
							Long tmpManagerId = (Long) managerInfoMap.get(custId);
							if (tmpManagerId == null || tmpManagerId <= 0) {
								ICustManagerValue[] custManagerValues = queryCustManagersByCustId(custId, -1, -1);
								if (CmCommonUtil.isNotEmptyObject(custManagerValues)) {
									managerInfoMap.put(custId, Long.valueOf(custManagerValues[0].getManagerId()));
									tmpManagerId = Long.valueOf(custManagerValues[0].getManagerId());
									// 找到是否存在客户经理等于查询条件中的客户经理
									for (int j = 0, len = custManagerValues.length; j < len; j++) {
										if (managerId.equals(Long.toString(custManagerValues[j].getManagerId()))) {
											managerInfoMap.put(custId, Long.valueOf(custManagerValues[j].getManagerId()));
											tmpManagerId = Long.valueOf(custManagerValues[j].getManagerId());
											break;
										}
									}
								}
							}
							if (tmpManagerId != null && tmpManagerId > 0) {
								customerValue.setManagerId(tmpManagerId);
							}
							if (managerId.equals(Long.toString(customerValue.getManagerId()))) {
								list.add(customerValue);
								map.put(insOfferValues[i].getCustId(), insOfferValues[i].getCustId());
							}
						}
					}
				}
			}
		}
		return (ICustomerValue[]) list.toArray(new CustomerBean[0]);
	}

	public void updateCustStatus(long custId, int newStatus, int oldStatus) throws Exception {
		ICustomerValue modifyValue = new CustomerBean();
		DataContainer dc = new DataContainer();
		IVOCustValue bean = new VOCustBean();
		dc.set(ICustomerValue.S_CustId, custId);
		dc.set(ICustomerValue.S_CustType, CmCommonUtil.getCustType(custId));
		// 更改人：kangzk 更改时间：2012/11/19日 更改原因：根据客户编号查询客户信息只能查询到一条
		ICustomerValue[] queryValue = this.queryCustomers(dc, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(queryValue)) {
			modifyValue.copy(queryValue[0]);
			modifyValue.setCustStatus(newStatus);
			bean.setCustomer(modifyValue);
			this.saveCustomer(bean);

		}
	}

	public int queryCustomers4GroupNewCount(String xmlComdition) throws Exception {
		return CmCommonUtil.isEmptyObject(queryCustomers4Group(xmlComdition, -1, -1)) ? 0 : queryCustomers4Group(xmlComdition, -1, -1).length;
	}

	public DataContainerInterface[] queryCustomers4GroupNew(String xmlComdition, int startNum, int endNum) throws Exception {
		ICustomerValue[] results = this.queryCustomers4Group(xmlComdition, startNum, endNum);
		DataContainerInterface[] values = null;
		if (CmCommonUtil.isEmptyObj(results) || results.length < 1) {
			return values;
		}
		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		values = new DataContainerInterface[results.length];
		for (int i = 0; i < results.length; i++) {
			values[i] = new DataContainer();
			results[i].setCustType(CmConstants.CustomerType.GROUP);

			// modify by caiyu 20121122根据custid查询集团主要客户经理
			values[i].copy(results[i]);
			// 查询客户经理信息
			IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(results[i].getCustId());
			if (gMgrRel == null)
				continue;
			IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
			if (CmCommonUtil.isNotEmptyObject(secStaff)) {
				values[i].set("MANAGER_ID", gMgrRel.getManagerId());
				values[i].set("MANAGER_NAME", secStaff.getManagername());
				values[i].set("MANAGER_PHONE", secStaff.getBillid());
			}
		}

		return values;
	}

	public long getGroupContractId() throws Exception {
		return ServiceManager.getIdGenerator().getNewId("CM_GROUP_CONTRACT").longValue();
	}

	/**
	 * @Description 获取集团客户分配轨迹查询记录
	 * @author lijh
	 */
	public DataContainer[] queryCustManagerH(String custServiceId, String startDate, String endDate, int startNum, int endNum) throws Exception {
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryCustManagerH(custServiceId, startDate, endDate, startNum,
				endNum);
	}

	/**
	 * @Description 获取集团客户分配轨迹查询记录条数
	 * @author lijh
	 */
	public int queryCustManagerHCount(String custServiceId, String startDate, String endDate) throws Exception {
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryCustManagerHCount(custServiceId, startDate, endDate);
	}

	public DataContainer[] getGrpCustManagerInfo(String custServiceId, String custName, int start, int end) throws Exception {
		ISec2CmSV isCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		StringBuilder sql = new StringBuilder("");
		Map param = new HashMap();
		sql.append(" SELECT T.CUST_SERVICE_ID,T.CUST_NAME,M.MANAGER_ID FROM {CM_GROUP_CUSTOMER} T,{CMX_GROUP_CUSTOMER}C,{CM_GROUP_MANAGER} M WHERE T.CUST_ID = C.CUST_ID(+) ");
		sql.append(" AND T.CUST_ID = M.CUST_ID ");
		sql.append(" AND T.STATE = :state AND M.REL_TYPE = :relType ");
		sql.append(" AND M.STATE = :state ");
		if (!"".equals(custServiceId)) {
			sql.append(" AND T.CUST_SERVICE_ID = :custServiceId ");
			param.put("custServiceId", custServiceId);
		}
		if (!"".equals(custName)) {
			sql.append(" AND T.CUST_NAME like :custName ");
			param.put("custName", "%" + custName + "%");
		}
		param.put("state", CmConstants.RecordState.USE);
		param.put("relType", CmLnConstants.CmRelType.RELTYPE1);

		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(sql.toString(), "", start, end, param), param);

		int len = counts.length;
		for (int i = 0; i < len; i++) {
			IQBOSecCustManagerValue bosec = isCm.getEffectAmInfo(counts[i].getAsLong("MANAGER_ID"), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
			if (CmCommonUtil.isNotEmptyObject(bosec)) {
				counts[i].set("MANAGERNAME", bosec.getManagername());
				counts[i].set("BILLID", bosec.getBillid());
			}
			counts[i].set("MANAGERID", counts[i].getAsLong("MANAGER_ID"));
		}

		return (DataContainer[]) counts;
	}

	public int getGrpCustManagerInfoCount(String custServiceId, String custName) throws Exception {
		StringBuilder sql = new StringBuilder("");
		Map param = new HashMap();
		sql.append(" SELECT T.CUST_SERVICE_ID,T.CUST_NAME,M.MANAGER_ID FROM {CM_GROUP_CUSTOMER} T,{CMX_GROUP_CUSTOMER} C,{CM_GROUP_MANAGER} M WHERE T.CUST_ID = C.CUST_ID(+) ");
		sql.append(" AND T.CUST_ID = M.CUST_ID ");
		sql.append(" AND T.STATE = :state AND M.REL_TYPE = :relType ");
		sql.append(" AND M.STATE = :state ");
		if (!"".equals(custServiceId)) {
			sql.append(" AND T.CUST_SERVICE_ID = :custServiceId ");
			param.put("custServiceId", custServiceId);
		}
		if (!"".equals(custName)) {
			sql.append(" AND T.CUST_NAME like :custName ");
			param.put("custName", "%" + custName + "%");
		}
		param.put("state", CmConstants.RecordState.USE);
		param.put("relType", CmLnConstants.CmRelType.RELTYPE1);

		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, CmLnCommonUtil.getQueryCount(sql.toString(), "", param),
				param);
		return counts[0].getAsInt("CNT");
	}

	public DataContainer[] queryCustomerForAutoForm(long custId) throws Exception {
		ICustomerValue customerValue = queryCustomerMaskByCustId(custId);
		if (customerValue == null) {
			return new DataContainer[0];
		}
		DataContainer[] dcs = new DataContainer[] { (DataContainer) customerValue };
		return dcs;
	}

	public ICustOrganizeValue queryCustOrganizesByrelCustId(long relCustId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_RelCustId, relCustId);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		if (values == null || values.length == 0) {
			return null;
		}
		return values[0];
	}

	public void changeState(long[] custIds) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue[] values = service.queryCustByCustIds(custIds);
		for (int i = 0; i < values.length; i++) {
			values[i].setCustStatus(0);
		}
		if (values[0].getCustType() == 1) {
			BOCmIndivCustomerBean[] beans = new BOCmIndivCustomerBean[values.length];
			for (int i = 0; i < beans.length; i++) {
				beans[i] = new BOCmIndivCustomerBean();
				beans[i].copy(values[i]);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(beans);
		}
		if (values[0].getCustType() == 3) {
			BOCmGroupCustomerBean[] beans = new BOCmGroupCustomerBean[values.length];
			for (int i = 0; i < beans.length; i++) {
				beans[i] = new BOCmGroupCustomerBean();
				beans[i].copy(values[i]);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(beans);
		}
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustContactMediumsForPage(long custId, long mediumType, long upMediumType, int start, int end) throws Exception {
		IQBOCmCustContMediumAndTypeValue[] contMediums = queryCustContactMediums(custId, mediumType, upMediumType, start, end);
		if (contMediums != null && contMediums.length > 0) {
			// 封装自定义字段
			String editor = "";
			String delete = "";
			int custType = CmCommonUtil.getCustType(custId);
			boolean canEditFlag = true;
			if (CmConstants.CustomerType.INDIVIDUAL == custType) {
				// 个人客户
				// 如果已经生成订购关系则不可编辑法律和农场地址

				StringBuilder condition = new StringBuilder(" 1=1 ");
				Map parameter = new HashMap();
				condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_CustId).append(" =:custId ");
				parameter.put("custId", custId);
				condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_RequestType).append(" =:requestType ");
				parameter.put("requestType", CmConstants.RequestType.ADD);
				IBOCmCustRequestTaskValue[] values = (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class,
						condition.toString(), parameter, -1, -1);
				// REQUEST_STATUS=P:处理中 ，这种情况也不能修改
				String requestStatus = CmConstants.RequestStatus.temporaryState;
				if (null != values && values.length > 0) {
					String result = values[0].getResults();
					requestStatus = values[0].getRequestStatus();
					if (null != result) {
						if ("000".equals(values[0].getResults())) {
							canEditFlag = false;
						}
					}
				}
				for (int i = 0; i < contMediums.length; i++) {
					if (CmConstants.RequestStatus.processing.equals(requestStatus)) {
						if (contMediums[i].getContMedTypeId() == CmConstants.AddressId.legalAddress || contMediums[i].getContMedTypeId() == CmConstants.AddressId.farmAddress) {
							// 页面操作框为空
							editor = "";
							delete = "";
						} else {
							editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAddress(" + String.valueOf(contMediums[i].getAddressId()) + ","
									+ String.valueOf(contMediums[i].getCustContRelaId()) + "," + i + ")' style='color:blue;margin-left:5px;text-decoration:underline'>"
									+ CrmLocaleFactory.getResource("CMS0013081") + "</a>";
							delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAddress(\"" + String.valueOf(contMediums[i].getCustContRelaId())
									+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
						}
					} else if (CmConstants.RequestStatus.dealDone.equals(requestStatus)) {
						if (canEditFlag) {
							editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAddress(" + String.valueOf(contMediums[i].getAddressId()) + ","
									+ String.valueOf(contMediums[i].getCustContRelaId()) + "," + i + ")' style='color:blue;margin-left:5px;text-decoration:underline'>"
									+ CrmLocaleFactory.getResource("CMS0013081") + "</a>";
							delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAddress(\"" + String.valueOf(contMediums[i].getCustContRelaId())
									+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
						} else {
							if (contMediums[i].getContMedTypeId() == CmConstants.AddressId.legalAddress || contMediums[i].getContMedTypeId() == CmConstants.AddressId.farmAddress) {
								// 页面操作框为空
								editor = "";
								delete = "";
							} else {
								editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAddress(" + String.valueOf(contMediums[i].getAddressId()) + ","
										+ String.valueOf(contMediums[i].getCustContRelaId()) + "," + i + ")' style='color:blue;margin-left:5px;text-decoration:underline'>"
										+ CrmLocaleFactory.getResource("CMS0013081") + "</a>";
								delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAddress(\"" + String.valueOf(contMediums[i].getCustContRelaId())
										+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
							}
						}
					} else {
						if (contMediums[i].getContMedTypeId() == CmConstants.AddressId.deliveryAddress) {
							// 页面操作框为空
							editor = "";
							delete = "";
						} else {
							editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAddress(" + String.valueOf(contMediums[i].getAddressId()) + ","
									+ String.valueOf(contMediums[i].getCustContRelaId()) + "," + i + ")' style='color:blue;margin-left:5px;text-decoration:underline'>"
									+ CrmLocaleFactory.getResource("CMS0013081") + "</a>";
							delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAddress(\"" + String.valueOf(contMediums[i].getCustContRelaId())
									+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
						}
					}
					// 根据custId查询客户如果已经生成客户资料则法律地址不允许修改
					ICustomerValue custValue = queryDKCustomer(custId);
					if (CmCommonUtil.isNotEmptyObject(custValue) && contMediums[i].getContMedTypeId() == CmConstants.AddressId.legalAddress) {
						delete = "";
						// 根据静态枚举值看是否需要隐藏修改按钮
						IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("CM_IF_EDIT_ADDRESS");
						if (CmCommonUtil.isNotEmptyObject(staticValues) && !(staticValues[0].getCodeValue().equals("Y"))) {
							if (StringUtils.isNotBlank(custValue.getCustCertCode())) {
								// 如果CPR号码不为空则不能修改
								editor = "";
							}
						}
					}
					contMediums[i].setAction(editor + delete);
					contMediums[i].setContMedTypeName(String.valueOf(contMediums[i].getContMedTypeId()));
				}

			} else if (CmConstants.CustomerType.GROUP == custType) {
				// 集团客户
				StringBuilder condition = new StringBuilder(" 1=1 ");
				Map parameter = new HashMap();
				condition.append(" AND ").append(IBOCmGroupCustomerValue.S_CustId).append(" =:custId ");
				parameter.put("custId", custId);
				condition.append(" AND ").append(IBOCmGroupCustomerValue.S_CustCertType).append(" =:custCertType ");
				parameter.put("custCertType", CmConstants.CertificateType.KOB_NUMBER);
				IBOCmGroupCustomerValue[] values = (IBOCmGroupCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupCustomerBean.class, condition.toString(),
						parameter, -1, -1);
				if (null != values && values.length > 0) {
					// 证件类型是QOB，外国客户不限制，KOB同步的则不可编辑
					IBOBsStaticDataValue[] staticValue = StaticDataUtil.getStaticData("CM_USER_UNSUBSCRIBE_FROM_CPR");// 增加固网、移网开关
					if (CmCommonUtil.isNotEmptyObject(staticValue)) {
						if ("Y".equals(staticValue[0].getCodeValue())) {
							String certValue = values[0].getCustCertCode();
							if (certValue != null) {
								if (!"K".equals(certValue.substring(0, 1))) {
									canEditFlag = false;
								}
							}
						}
					}
				}

				for (int i = 0; i < contMediums.length; i++) {

					if (canEditFlag) {
						editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAddress(" + String.valueOf(contMediums[i].getAddressId()) + ","
								+ String.valueOf(contMediums[i].getCustContRelaId()) + "," + i + ")' style='color:blue;margin-left:5px;text-decoration:underline'>"
								+ CrmLocaleFactory.getResource("CMS0013081") + "</a>";
						delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAddress(\"" + String.valueOf(contMediums[i].getCustContRelaId())
								+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
					} else {
						if (contMediums[i].getContMedTypeId() == CmConstants.AddressId.legalAddress) {
							// 页面操作框为空
							editor = "";
							delete = "";
						} else {
							editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAddress(" + String.valueOf(contMediums[i].getAddressId()) + ","
									+ String.valueOf(contMediums[i].getCustContRelaId()) + "," + i + ")' style='color:blue;margin-left:5px;text-decoration:underline'>"
									+ CrmLocaleFactory.getResource("CMS0013081") + "</a>";
							delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAddress(\"" + String.valueOf(contMediums[i].getCustContRelaId())
									+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
						}
					}
					if (contMediums[i].getContMedTypeId() == CmConstants.AddressId.deliveryAddress) {
						// 页面操作框为空
						editor = "";
						delete = "";
					}
					// 根据custId查询客户如果已经生成客户资料则法律地址不允许修改
					ICustomerValue custValue = queryDKCustomer(custId);
					if (CmCommonUtil.isNotEmptyObject(custValue) && contMediums[i].getContMedTypeId() == CmConstants.AddressId.legalAddress) {
						delete = "";
					}
					contMediums[i].setAction(editor + delete);
					contMediums[i].setContMedTypeName(String.valueOf(contMediums[i].getContMedTypeId()));
				}
			}

			return contMediums;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustContactMediums(long custId, long mediumType, long upMediumType, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmCustContMediumAndTypeValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}
		if (mediumType > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmCustContMediumAndTypeValue.S_ContMedTypeId).append(" = :mediumType ");
			paraMap.put("mediumType", Long.valueOf(mediumType));
		}
		if (upMediumType > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmCustContMediumAndTypeValue.S_UpContMedTypeId).append(" = :upMediumType ");
			paraMap.put("upMediumType", Long.valueOf(upMediumType));
		}

		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmCustContMediumAndTypeBean.class, condition.toString(), paraMap, start, end);
		IQBOCmCustContMediumAndTypeValue[] contMediums = (IQBOCmCustContMediumAndTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmCustContMediumAndTypeBean.class, sql, paraMap);

		if (contMediums != null && contMediums.length > 0) {
			// 受保护的地址只对实体地址有效
			if (upMediumType == CmDkConstants.CustContMedium.ADDRESS) {

				for (int i = 0; i < contMediums.length; i++) {
					if (contMediums[i].getProtectEffDate() != null && contMediums[i].getProtectExpDate() != null) {
						contMediums[i].setIsProtected(CmConstants.YesOrNo.YES);
					} else {
						contMediums[i].setIsProtected(CmConstants.YesOrNo.NO);
					}
				}
			}
			return contMediums;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public int queryCustContactMediumsCount(long custId, long mediumType, long upMediumType) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (custId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmCustContMediumAndTypeValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}
		if (mediumType > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmCustContMediumAndTypeValue.S_ContMedTypeId).append(" = :mediumType ");
			paraMap.put("mediumType", Long.valueOf(mediumType));
		}
		if (upMediumType > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmCustContMediumAndTypeValue.S_UpContMedTypeId).append(" = :upMediumType ");
			paraMap.put("upMediumType", Long.valueOf(upMediumType));
		}
		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicCountSqlByConds(QBOCmCustContMediumAndTypeBean.class, condition.toString(), paraMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		return inter[0].getAsInt("CNT");

	}

	public IBOCmxIndivCustomerValue queryCmxIndivCustomerValue(long custId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IBOCmxIndivCustomerValue.S_CustId).append(" = :custId ");
		paraMap.put("custId", Long.valueOf(custId));
		DataContainerInterface[] results = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmxIndivCustomerBean.class, condition.toString(), paraMap, -1, -1);
		if (results != null && results.length > 0) {
			IBOCmxIndivCustomerValue customerValue = new BOCmxIndivCustomerBean();
			customerValue.copy(results[0]);
			return customerValue;
		}
		return null;
	}

	public void saveCmxIndivCustomer(IBOCmxIndivCustomerValue cmxIndivCustomerValue) throws Exception {
		if (cmxIndivCustomerValue != null) {
			BOCmxIndivCustomerBean indivCustomerBean = new BOCmxIndivCustomerBean();
			indivCustomerBean.copy(cmxIndivCustomerValue);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(indivCustomerBean);
		}
	}

	public IBOCmCustContMedTypeValue[] queryContMediumType(long contMediumId, long upMediumType) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (contMediumId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmCustContMedTypeValue.S_ContMedTypeId).append(" = :contMediumId ");
			paraMap.put("contMediumId", Long.valueOf(contMediumId));
		}
		if (upMediumType > 0) {
			condition.append(" AND ");
			condition.append(IBOCmCustContMedTypeValue.S_UpContMedTypeId).append(" = :upMediumType ");
			paraMap.put("upMediumType", Long.valueOf(upMediumType));
		}
		IBOCmCustContMedTypeValue[] results = (IBOCmCustContMedTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContMedTypeBean.class, condition.toString(),
				paraMap, -1, -1);
		if (results != null && results.length > 0) {
			return results;
		}
		return new IBOCmCustContMedTypeValue[0];
	}

	private void sendAddressToBilling(IBOCmCustContactMediumValue custContactMediumValue) throws Exception {
		List mediums = new ArrayList();
		Map temp = new HashMap();
		temp.put("CONTACT_ID", custContactMediumValue.getCustContRelaId());
		temp.put("CONTACT_TYPE", 1);
		long custId = custContactMediumValue.getCustId();
		temp.put("CUST_ID", custId);
		temp.put("DONE_CODE", ServiceManager.getDoneCode());
		ICustomerValue customerValue = null;
		try {
			customerValue = queryDKCustomer(custId);
			if (customerValue == null) {
				return;
			}
		} catch (Exception e) {
			return;
		}

		if (customerValue != null) {
			temp.put("COUNTRY_ID", customerValue.getCityId());
			temp.put("PROV_CODE", customerValue.getProvinceId());
		}
		temp.put("ADDRESS", custContactMediumValue.getAddressDetail());
		if (custContactMediumValue.isNew()) {
			temp.put("OPER_TYPE", 1);
		} else if (custContactMediumValue.isModified()) {
			temp.put("OPER_TYPE", 2);
		} else if (custContactMediumValue.isDeleted()) {
			temp.put("OPER_TYPE", 3);
		} else {
			temp.put("OPER_TYPE", 4);
		}

		temp.put("ADDRESS_ID", custContactMediumValue.getAddressId());
		if (custContactMediumValue.isNew()) {
			temp.put("VALID_DATE", ServiceManager.getOpDateTime());
			temp.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
			temp.put("COMMIT_DATE", ServiceManager.getOpDateTime());
		} else {
			temp.put("VALID_DATE", custContactMediumValue.getEffectiveDate());
			temp.put("EXPIRE_DATE", custContactMediumValue.getExpireDate());
			temp.put("COMMIT_DATE", custContactMediumValue.getCreateDate());
		}
		
		//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
		IBOCmCustContactMediumValue[]  emailCmCustContactMediumValues = CmServiceFactory.getCustomerSV().queryContactMediumByAddressType(custId, -1, 21);
		if(null!=emailCmCustContactMediumValues&&emailCmCustContactMediumValues.length>0){
			temp.put("CUST_EMAIL", emailCmCustContactMediumValues[0].getEmailAddress());
		}
		
		//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
		IBOCmCustContactMediumValue[]  phoneNumCmCustContactMediumValues = CmServiceFactory.getCustomerSV().queryContactMediumByAddressType(custId, -1, 31);
		if(null!=phoneNumCmCustContactMediumValues&&phoneNumCmCustContactMediumValues.length>0){
			temp.put("PHONE_NUMBER", phoneNumCmCustContactMediumValues[0].getContNumber());
		}
		
		mediums.add(temp);
		Map result = new HashMap();
		result.put("I_CONTACT", mediums);
		IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
		interfaceBillCrmSV.sendMapOrderInfoToBilling(result);
	}
	
	private void sendAddressToBilling(IBOCmCustContactMediumValue custContactMediumValue,long oper_type) throws Exception {
		List mediums = new ArrayList();
		Map temp = new HashMap();
		temp.put("CONTACT_ID", custContactMediumValue.getCustContRelaId());
		temp.put("CONTACT_TYPE", 1);
		long custId = custContactMediumValue.getCustId();
		temp.put("CUST_ID", custId);
		temp.put("DONE_CODE", ServiceManager.getDoneCode());
		ICustomerValue customerValue = null;
		try {
			customerValue = queryDKCustomer(custId);
			if (customerValue == null) {
				return;
			}
		} catch (Exception e) {
			return;
		}
		
		if (customerValue != null) {
			temp.put("COUNTRY_ID", customerValue.getCityId());
			temp.put("PROV_CODE", customerValue.getProvinceId());
		}
		temp.put("ADDRESS", custContactMediumValue.getAddressDetail());
		temp.put("OPER_TYPE", oper_type);
		
		temp.put("ADDRESS_ID", custContactMediumValue.getAddressId());
		if (custContactMediumValue.isNew()) {
			temp.put("VALID_DATE", ServiceManager.getOpDateTime());
			temp.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
			temp.put("COMMIT_DATE", ServiceManager.getOpDateTime());
		} else {
			temp.put("VALID_DATE", custContactMediumValue.getEffectiveDate());
			temp.put("EXPIRE_DATE", custContactMediumValue.getExpireDate());
			temp.put("COMMIT_DATE", ServiceManager.getOpDateTime());
			log.error("sendAddressToBilling origin haimaxCommitDate:" + temp.get("COMMIT_DATE") + ",markCustId:" + custId + ",doneCode" + temp.get("DONE_CODE"));
		}
		
		//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
		IBOCmCustContactMediumValue[]  emailCmCustContactMediumValues = CmServiceFactory.getCustomerSV().queryContactMediumByAddressType(custId, -1, 21);
		if(null!=emailCmCustContactMediumValues&&emailCmCustContactMediumValues.length>0){
			temp.put("CUST_EMAIL", emailCmCustContactMediumValues[0].getEmailAddress());
		}
		
		//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
		IBOCmCustContactMediumValue[]  phoneNumCmCustContactMediumValues = CmServiceFactory.getCustomerSV().queryContactMediumByAddressType(custId, -1, 31);
		if(null!=phoneNumCmCustContactMediumValues&&phoneNumCmCustContactMediumValues.length>0){
			temp.put("PHONE_NUMBER", phoneNumCmCustContactMediumValues[0].getContNumber());
		}
		
		mediums.add(temp);
		Map result = new HashMap();
		result.put("I_CONTACT", mediums);
		IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
		interfaceBillCrmSV.sendMapOrderInfoToBilling(result);
	}
	
	/**
	 * TELENOR_DEFECT_20190917_0004  添加 客户的联系邮箱和联系号码
	* <p>Title: </p>
	* <p>Description: phoneNumber  custEmail </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-9-25
	* CmCustomerSVImpl
	 */
	private void sendAddressToBilling(IBOCmCustContactMediumValue custContactMediumValue,String phoneNumber,String custEmail) throws Exception {
		List mediums = new ArrayList();
		Map temp = new HashMap();
		temp.put("CONTACT_ID", custContactMediumValue.getCustContRelaId());
		temp.put("CONTACT_TYPE", 1);
		long custId = custContactMediumValue.getCustId();
		temp.put("CUST_ID", custId);
		temp.put("DONE_CODE", ServiceManager.getDoneCode());
		ICustomerValue customerValue = null;
		try {
			customerValue = queryDKCustomer(custId);
			if (customerValue == null) {
				return;
			}
		} catch (Exception e) {
			return;
		}
		
		if (customerValue != null) {
			temp.put("COUNTRY_ID", customerValue.getCityId());
			temp.put("PROV_CODE", customerValue.getProvinceId());
		}
		temp.put("ADDRESS", custContactMediumValue.getAddressDetail());
		if (custContactMediumValue.isNew()) {
			temp.put("OPER_TYPE", 1);
		} else if (custContactMediumValue.isModified()) {
			temp.put("OPER_TYPE", 2);
		} else if (custContactMediumValue.isDeleted()) {
			temp.put("OPER_TYPE", 3);
		} else {
			temp.put("OPER_TYPE", 4);
		}
		
		temp.put("ADDRESS_ID", custContactMediumValue.getAddressId());
		if (custContactMediumValue.isNew()) {
			temp.put("VALID_DATE", ServiceManager.getOpDateTime());
			temp.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
			temp.put("COMMIT_DATE", ServiceManager.getOpDateTime());
		} else {
			temp.put("VALID_DATE", custContactMediumValue.getEffectiveDate());
			temp.put("EXPIRE_DATE", custContactMediumValue.getExpireDate());
			temp.put("COMMIT_DATE", custContactMediumValue.getCreateDate());
		}
		mediums.add(temp);
		Map result = new HashMap();
		result.put("I_CONTACT", mediums);
		IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
		interfaceBillCrmSV.sendMapOrderInfoToBilling(result);
	}

	private IBOCmCustContactMediumValue[] validateCustAddress(IBOCmCustContactMediumValue[] custContactMediumValues) throws Exception {
		if (custContactMediumValues != null && custContactMediumValues.length > 0) {
			List result = new ArrayList();
			for (int i = 0; i < custContactMediumValues.length; i++) {
				if (custContactMediumValues[i].isNew() && custContactMediumValues[i].getContMedTypeId() == CmDkConstants.CustContMedium.LEGAL_ADDRESS) {
					IBOCmCustContactMediumValue legalAddress = queryCustContactMediumByCustIdAndType(custContactMediumValues[i].getCustId(),
							String.valueOf(CmDkConstants.CustContMedium.LEGAL_ADDRESS));
					if (legalAddress != null) {
						if (legalAddress.getAddressId() != custContactMediumValues[i].getAddressId()) {
							// 不相等，就做修改操作
							legalAddress.setAddressId(custContactMediumValues[i].getAddressId());
							legalAddress.setAddressDetail(custContactMediumValues[i].getAddressDetail());
							result.add(legalAddress);
						}
					} else {
						// 没有法律地址就新增
						result.add(custContactMediumValues[i]);
					}
				} else {
					result.add(custContactMediumValues[i]);
				}
			}
			if (!result.isEmpty()) {
				return (IBOCmCustContactMediumValue[]) result.toArray(new IBOCmCustContactMediumValue[0]);
			}
		}
		return new IBOCmCustContactMediumValue[0];
	}

	@Override
	public void saveCustContMedium(IBOCmCustContactMediumValue[] custContactMediumValues) throws Exception {
		custContactMediumValues = validateCustAddress(custContactMediumValues);
		if (custContactMediumValues.length > 0) {
			List contMediumList = new ArrayList();
			String custName = "";
			long partyId = 0L;
			boolean isMailType = false;
			long custId = 0L;
			// 如果开户时，对地址信息进行编辑会报custId查不到客户，所以这做个处理
			ICustomerValue custValue = null;
			long legalAddressFlag = 2;
			for (int i = 0; i < custContactMediumValues.length; i++) {
				// add by liwei 2016/06/21 如果是修改的是email的联系媒介，需要调用订单接口通知
				if (CmConstants.AddressId.EMAIL == custContactMediumValues[i].getContMedTypeId()) {
					isMailType = true;
				}
				BOCmCustContactMediumBean mediumBean = new BOCmCustContactMediumBean();
				mediumBean.copy(custContactMediumValues[i]);
				if (mediumBean.isNew()) {
					if (StringUtils.isBlank(mediumBean.getState())) {
						mediumBean.setState(CmConstants.RecordState.USE);
					}
					if (mediumBean.getCustContRelaId() <= 0) {
						mediumBean.setCustContRelaId(CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class));
					}
				}

				custId = custContactMediumValues[i].getCustId();
				try {
					custValue = queryDKCustomer(custId);
					custName = custValue.getCustName();
					partyId = custValue.getPartyId();
				} catch (Exception e) {
					contMediumList.add(mediumBean);
					continue;
				} finally {
					if (StringUtils.isNotBlank(custName)) {
						// 记录接触信息
						long busiId;
						if (CmConstants.AddressId.legalAddress == mediumBean.getContMedTypeId()) {
							// 只是针对法律地址
							if (mediumBean.isNew()) {
								legalAddressFlag = 1;
								// 地址新增
								busiId = CmBusinessOperation.CM_CUST_ADRESS_NEW;
								CmRecordLog.saveRecord(busiId, mediumBean.getCustId(), new String[]{"New address:" + mediumBean.getAddressDetail()});

								// AI-13754 When modify customer's legal address,should update party's information.
								dealNewAddressParty(partyId, mediumBean);
							} else if (mediumBean.isModified()) {
								legalAddressFlag = 2;
								// 地址修改
								if (mediumBean.isPropertyModified("ADDRESS_DETAIL")) {
									String oldAddress = String.valueOf(mediumBean.getOldObj("ADDRESS_DETAIL"));
									String newAddress = mediumBean.getAddressDetail();
									// 地址变化才发CI日志
									if (!StringUtils.equals(oldAddress, newAddress)) {
										List<String> list = new ArrayList<>();
										busiId = CmBusinessOperation.CM_CUST_ADRESS_MOD;
										list.add("Old address : " + oldAddress);
										list.add("New address : " + newAddress);
										CmRecordLog.saveRecord(busiId, mediumBean.getCustId(), list.toArray(new String[0]));
									}
								}
								// AI-13754 When modify customer's legal address,should update party's information.
								dealModifyAddressParty(partyId, mediumBean);
							} else {
								// 地址删除
								busiId = CmBusinessOperation.CM_CUST_ADRESS_DEL;
								CmRecordLog.saveRecord(busiId, mediumBean.getCustId(), new String[]{"Delete address:" + mediumBean.getAddressDetail()});
							}
						} else if (CmConstants.AddressId.EMAIL == mediumBean.getContMedTypeId()
								|| CmConstants.AddressId.CONTACT_NUMBER == mediumBean.getContMedTypeId()) {
							List<String> list = new ArrayList<>();
							if (mediumBean.isNew()) {
								// 针对联系媒介是新增的
								busiId = CmBusinessOperation.CM_CUST_MEDIUM_NEW;
								if (CmConstants.AddressId.EMAIL == mediumBean.getContMedTypeId()) {
									list.add("New email:" + mediumBean.getEmailAddress());
								} else {
									list.add("New number:" + mediumBean.getContNumber());
								}
								// 联系媒介是修改在后面做
								CmRecordLog.saveRecord(busiId, mediumBean.getCustId(), list.toArray(new String[0]));
							} else if (mediumBean.isDeleted()) {
								// 针对联系媒介是修改的
								busiId = CmBusinessOperation.CM_CUST_MEDIUM_DEL;
								if (CmConstants.AddressId.EMAIL == mediumBean.getContMedTypeId()) {
									list.add("Delete email:" + mediumBean.getEmailAddress());
								} else {
									list.add("Delete number:" + mediumBean.getContNumber());
								}
								// 联系媒介是修改在后面做
								CmRecordLog.saveRecord(busiId, mediumBean.getCustId(), list.toArray(new String[0]));
							}
						}
					}
				}
				// 针对地址的新增，修改增加客户，使用者，员工等验重以及送phonebook
				checkUniqueCustByLegalAddress(custContactMediumValues[i]);
				contMediumList.add(mediumBean);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) contMediumList.toArray(new DataContainerInterface[0]));
			
			// 只要是联系媒介变更，都需要把法律地址和排序最小最前的联系媒介送billing
			IBOCmCustContactMediumValue[] legalCmCustContactMediumValues = CmServiceFactory.getCustomerSV().queryContactMediumByAddressType(custId, -1, 11);
			if (null != legalCmCustContactMediumValues && legalCmCustContactMediumValues.length > 0) {
				if (legalAddressFlag == 1) {
					sendAddressToBilling(legalCmCustContactMediumValues[0], 1);
				} else {
					sendAddressToBilling(legalCmCustContactMediumValues[0], 2);
				}
			}
			
			if (isMailType) {
				// 如果是修改email需要调用订单接口
				promoteViaplayToCust(custValue);
			}
			// 保存业务记录
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.saveCommonBusiLog(CmConstants.BusiLogId.CUST_MEDIUM, (DataStructInterface[]) contMediumList.toArray(new DataStructInterface[0]),
					CmConstants.BusiLogType.CUSTOMER_LOG, custContactMediumValues[0].getCustId());

			for (IBOCmCustContactMediumValue custContactMediumValue : custContactMediumValues) {
				if (custContactMediumValue.isModified()) {
					ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
					// 地址类型与联系媒介类型区分保存
					String type = String.valueOf(custContactMediumValue.getContMedTypeId());
					BOCmHisRecordBean recordBean;
					if (type.startsWith("1")) {
						recordBean = sv.convertHisRecord(new DataStructInterface[]{custContactMediumValue}, CmConstants.HisRecordType.ADDRESS, custName,
								custContactMediumValue.getCustId());
					} else {
						recordBean = sv.convertHisRecord(new DataStructInterface[]{custContactMediumValue}, CmConstants.HisRecordType.CONTACT_MEDIUM, custName,
								custContactMediumValue.getCustId());
					}
					sv.saveHisRecord(recordBean);
				}
			}
		}
	}

	private void dealModifyAddressParty(long partyId, BOCmCustContactMediumBean mediumBean) throws Exception {
		long addressId = mediumBean.getAddressId();
		String addressDesc = mediumBean.getAddressDetail();
		DataContainer dc = new DataContainer();
		dc.set("PARTY_ID", partyId);
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IPartyContactValue[] contactValues = partySV.queryPartyContacts(dc, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(contactValues) && addressId > 0) {
			// 客户地址ID
			contactValues[0].setContAddress(String.valueOf(addressId));
			contactValues[0].setRemarks(addressDesc);
			// 同步payer是否受保护
			if (mediumBean.getProtectEffDate() != null && mediumBean.getProtectExpDate() != null) {
				contactValues[0].setExt1("1");
				contactValues[0].setExt9(mediumBean.getProtectEffDate());
				contactValues[0].setExt10(mediumBean.getProtectExpDate());
			} else {
				contactValues[0].setExt1("0");
				contactValues[0].setExt9(null);
				contactValues[0].setExt10(null);
			}
			// 保存party地址信息
			IVOPartyValue vopartyValue = new VOPartyBean();
			vopartyValue.setPartyContact(contactValues[0]);
			CmServiceFactory.getPartySV().saveParty(vopartyValue);
		}
	}

	private void dealNewAddressParty(long partyId, BOCmCustContactMediumBean mediumBean) throws Exception {
		long addressId = mediumBean.getAddressId();
		String addressDesc = mediumBean.getAddressDetail();
		DataContainer dc = new DataContainer();
		dc.set("PARTY_ID", partyId);
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IPartyContactValue[] contactValues = partySV.queryPartyContacts(dc, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(contactValues) && addressId > 0) {
			String contAddress = contactValues[0].getContAddress();
			if (StringUtils.isBlank(contAddress)) {
				// 客户地址ID
				contactValues[0].setContAddress(String.valueOf(addressId));
				contactValues[0].setRemarks(addressDesc);
				// 同步payer是否受保护
				if (mediumBean.getProtectEffDate() != null && mediumBean.getProtectExpDate() != null) {
					contactValues[0].setExt1("1");
					contactValues[0].setExt9(mediumBean.getProtectEffDate());
					contactValues[0].setExt10(mediumBean.getProtectExpDate());
				} else {
					contactValues[0].setExt1("0");
					contactValues[0].setExt9(null);
					contactValues[0].setExt10(null);
				}
				// 保存party地址信息
				IVOPartyValue vopartyValue = new VOPartyBean();
				vopartyValue.setPartyContact(contactValues[0]);
				CmServiceFactory.getPartySV().saveParty(vopartyValue);
			}
		}
	}

	/**
	 * 保存party 联系媒介
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-13
	* ICmCustomerSV
	 */
	public void saveContactContMediumForOSE(BOCmContactContMediumPojoBean[] cmContactContMediumBeans) throws Exception{
		if (null != cmContactContMediumBeans && cmContactContMediumBeans.length > 0) {
			// 做优先级重复处理
			Map map = new HashMap();
			for (BOCmContactContMediumPojoBean value : cmContactContMediumBeans) {
				map.put(value.getContRelaId(), value);
			}
			long cont_Id = cmContactContMediumBeans[0].getContId();
			// 查询出已有的联系媒介加入到map中
			IBOCmContactContMediumPojoValue[] values = queryContactContMedium(cont_Id);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				for (IBOCmContactContMediumPojoValue value : values) {
					if (!(map.containsKey(value.getContRelaId()))) {
						map.put(value.getContRelaId(), value);
					}
				}
			}
			// 看是否有相同的优先级
			Set set = new HashSet();
			Set<Long> keys = map.keySet();
			for (long value : keys) {
				set.add(((IBOCmContactContMediumPojoValue) map.get(value)).getPriority());
			}
			if (map.size() != set.size()) {
				ExceptionUtil.throwBusinessException("CMS0013245");
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(cmContactContMediumBeans);
			//根据cont_id 找partyId 
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IBOCmPartyContactValue[] cmPartyContactValues = partySV.queryPartyContactByContId(cont_Id);
			if(null!=cmPartyContactValues&&cmPartyContactValues.length>0){
				long  partyId = cmPartyContactValues[0].getPartyId();
				if(partyId>0){
					//如果没有为5的角色，就不需要发送billing
					ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
					IBOCmPartyRoleValue[] roleValue = partyRoleSV.queryAllPartyRoles(partyId, CmConstants.PartyRoleType.PAYER, -1, -1);
					if(null!=roleValue&&roleValue.length>0){
						sendPayerAddressToBilling(partyId, false);
					}
				}
			}
		}
	}

	/**   
	 * @Function promoteViaplayToCust
	 * @Description 只有个人客户的email变更才需要调用订单接口
	 *
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2016-8-18 上午10:19:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-8-18      shitian           v1.0.0               修改原因<br>
	 */
	private void promoteViaplayToCust(ICustomerValue custValue) throws Exception {
		if (custValue != null) {
			long custId = custValue.getCustId();
			if (CmConstants.CustomerType.INDIVIDUAL == CmCommonUtil.getCustType(custId) && Integer.parseInt(custValue.getIndivCustType()) == CmConstants.CustomerType.INDIVIDUAL) {
				IOrdOTTSV ordOTTSV = (IOrdOTTSV) ServiceFactory.getService(IOrdOTTSV.class);
				ordOTTSV.promoteViaplayToCust(custId);
			}
		}
	}

	private void checkUniqueCustByLegalAddress(IBOCmCustContactMediumValue contMediumValue) throws Exception {
		long custId = contMediumValue.getCustId();
		ICustomerValue custValue = queryDKCustomer(custId);
		// 先新增法律地址，后保存客户资料，这样会导致新增地址校验的时候获取不到客户资料
		if (custValue != null && contMediumValue.getContMedTypeId() == CmConstants.AddressId.legalAddress) {
			// 获取客户基本资料
			String custName = custValue.getCustName();
			Timestamp birth = custValue.getBirthday();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String birthDay = "";
			if (birth != null) {
				birthDay = df.format(birth);
			}
			long addressId = contMediumValue.getAddressId();
			int custType = CmCommonUtil.getCustType(custId);

			if (contMediumValue.isModified()) {
				// 同步payer客户受保护
				sysPayerCustProtect(contMediumValue);
				// 如果法律地址修改了需要同步订单（phonebook）
				ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				int count = roleSV.queryPartyRoleCount(custValue.getPartyId(), CmConstants.roleType.user);
				if (count > 0) {
					// 修改法律地址需要调用phonebook接口，同步送phonebook
					IPhoneBookSV phoneBookSV = (IPhoneBookSV) ServiceFactory.getService(IPhoneBookSV.class);
					phoneBookSV.changePhonebookWhenModifyAddress(custId, addressId);
				}
			}
			if (!contMediumValue.isDeleted() && custType == CmConstants.CustomerType.INDIVIDUAL) {
				// 修改客户法律地址要校验唯一；但是潜在客户可以没有法律地址，所以法律地址是新增，这种情况也需要校验
				CmCommonUtil.judgeDuplicateCustomer(custId, birthDay, addressId, contMediumValue.getAddressDetail(), custName);
			}
		}
	}

	private void sysPayerCustProtect(IBOCmCustContactMediumValue custContactMediumValue) throws Exception {
		long custId = custContactMediumValue.getCustId();
		if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
			ICustomerValue customerValue = queryDKCustomer(custId);
			if (customerValue != null) {
				long partyId = customerValue.getPartyId();
				ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
				IBOCmPartyContactValue[] partyContactValues = partySV.queryPartyContact(partyId);
				if (partyContactValues != null && partyContactValues.length > 0) {
					// 判断是否有payer角色
					com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyRoleValue[] partyRoleValues = partySV.queryPartyRole(partyId);
					boolean hasPayerRole = false;
					if (partyRoleValues != null && partyRoleValues.length > 0) {
						for (int i = 0; i < partyRoleValues.length; i++) {
							if (partyRoleValues[i].getRoleType() == CmConstants.PartyRoleType.PAYER) {
								hasPayerRole = true;
							}
						}
					}
					if (hasPayerRole) {
						BOCmPartyContactBean contactValue = new BOCmPartyContactBean();
						contactValue.copy(partyContactValues[0]);
						if (custContactMediumValue.getProtectEffDate() != null) {
							contactValue.setExt1(String.valueOf(CmConstants.YesOrNo.YES));
							long nowTime = System.currentTimeMillis();
							long effectTime = custContactMediumValue.getProtectEffDate().getTime();
							if (effectTime > nowTime) {
								contactValue.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
							}
							contactValue.setExt9(custContactMediumValue.getProtectEffDate());
							contactValue.setExt10(custContactMediumValue.getProtectExpDate());
						}
						CmInnerServiceFactory.getCommonInnerSV().saveBeans(new BOCmPartyContactBean[] { contactValue });
					}
				}
			}
		}
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustomerByMediuTypeAndValue(int upContMediumType, int contMediumType, String contMediumValue) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmCustContMediumAndTypeValue.S_ContMedTypeId).append(" = :contMediumType ");
		paraMap.put("contMediumType", contMediumType);
		if (upContMediumType == CmDkConstants.CustContMedium.ADDRESS) {
			condition.append(" AND ").append(IQBOCmCustContMediumAndTypeValue.S_AddressId).append(" = :contMediumValue ");
			paraMap.put("contMediumValue", Long.parseLong(contMediumValue));
		} else if (upContMediumType == CmDkConstants.CustContMedium.ELECTRONIC_ADDRESS) {
			condition.append(" AND ").append(IQBOCmCustContMediumAndTypeValue.S_EmailAddress).append(" = :contMediumValue ");
			paraMap.put("contMediumValue", contMediumValue);
		} else if (upContMediumType == CmDkConstants.CustContMedium.PHONE) {
			condition.append(" AND ").append(IQBOCmCustContMediumAndTypeValue.S_ContNumber).append(" = :contMediumValue ");
			paraMap.put("contMediumValue", contMediumValue);
		}
		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmCustContMediumAndTypeBean.class, condition.toString(), paraMap, -1, -1);
		IQBOCmCustContMediumAndTypeValue[] results = (IQBOCmCustContMediumAndTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmCustContMediumAndTypeBean.class, sql, paraMap);
		if (results != null && results.length > 0) {
			return results;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustElectronicMedium(long custId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmCustContMediumAndTypeValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		if (custId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmCustContMediumAndTypeValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		} else {
			return new IQBOCmCustContMediumAndTypeValue[0];
		}
		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmCustContMediumAndTypeBean.class, condition.toString(), paraMap, start, end);
		int index = sql.indexOf("LIMIT");
		if (index != -1) {
			sql = sql.substring(0, index) + " ORDER BY " + IQBOCmCustContMediumAndTypeValue.S_ContMedTypeId + " , " + IQBOCmCustContMediumAndTypeValue.S_Priority + " "
					+ sql.substring(index, sql.length());
		} else {
			sql = sql + " ORDER BY " + IQBOCmCustContMediumAndTypeValue.S_ContMedTypeId + " , " + IQBOCmCustContMediumAndTypeValue.S_Priority;
		}
		IQBOCmCustContMediumAndTypeValue[] results = (IQBOCmCustContMediumAndTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmCustContMediumAndTypeBean.class, sql, paraMap);

		if (results != null && results.length > 0) {
			return results;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public int queryCustElectronicMediumCount(long custId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmCustContMediumAndTypeValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		if (custId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmCustContMediumAndTypeValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}

		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicCountSqlByConds(QBOCmCustContMediumAndTypeBean.class, condition.toString(), paraMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		return inter[0].getAsInt("CNT");
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustElectronicMediumForPage(long custId, int start, int end) throws Exception {
		IQBOCmCustContMediumAndTypeValue[] contMediums = queryCustElectronicMedium(custId, start, end);
		if (contMediums != null && contMediums.length > 0) {
			// 封装自定义字段
			String editor = "";
			String delete = "";
			for (int i = 0; i < contMediums.length; i++) {
				editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyElecAddress(" + String.valueOf(contMediums[i].getCustContRelaId()) + "," + i
						+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteElecAddress(\"" + String.valueOf(contMediums[i].getCustContRelaId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				contMediums[i].setAction(editor + delete);
				contMediums[i].setContMedTypeName(String.valueOf(contMediums[i].getContMedTypeId()));
				long contMedTypeId = contMediums[i].getContMedTypeId();
				if (String.valueOf(contMedTypeId).startsWith("2") || contMedTypeId == 36) {
					// 邮箱
					contMediums[i].setEmailAddress(contMediums[i].getEmailAddress());
				} else if (contMedTypeId == 32) {
					// 传真
					contMediums[i].setEmailAddress(contMediums[i].getFaxNumber());
				} else {
					contMediums[i].setEmailAddress(contMediums[i].getContNumber());
				}
			}
			return contMediums;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public IBOCmCustContMedTypeValue[] queryContElecMediumType() throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IBOCmCustContMedTypeValue.S_UpContMedTypeId).append(" != :upMediumType ");
		paraMap.put("upMediumType", CmDkConstants.CustContMedium.ADDRESS);
		condition.append(" AND ");
		condition.append(IBOCmCustContMedTypeValue.S_UpContMedTypeId).append(" >0 ");
		IBOCmCustContMedTypeValue[] results = (IBOCmCustContMedTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContMedTypeBean.class, condition.toString(),
				paraMap, -1, -1);
		if (results != null && results.length > 0) {
			return results;
		}
		return new IBOCmCustContMedTypeValue[0];
	}

	public IBOCmCustContactMediumValue queryCustContMediumById(long contRelaId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IBOCmCustContactMediumValue.S_CustContRelaId).append(" = :contRelaId ");
		paraMap.put("contRelaId", Long.valueOf(contRelaId));
		IBOCmCustContactMediumValue[] results = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), paraMap, -1, -1);
		if (results != null && results.length > 0) {
			return results[0];
		}
		return null;
	}

	public void changePriority(long[] ids, int[] prioritys) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(IBOCmCustRequestTaskValue.S_TaskId).append(" IN ( ");
		for (int i = 0, len = ids.length; i < len; i++) {
			condition.append(":taskId").append(i).append(" ");
			parameter.put("taskId" + i, Long.valueOf(ids[i]));
			if (i != len - 1) {
				condition.append(",");
			}
		}
		condition.append(")");
		IBOCmCustRequestTaskValue[] values = (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class, condition.toString(),
				parameter, -1, -1);
		BOCmCustRequestTaskBean[] beans = new BOCmCustRequestTaskBean[values.length];
		for (int i = 0; i < values.length; i++) {
			values[i].setPriority(prioritys[i]);
			beans[i] = new BOCmCustRequestTaskBean();
			beans[i].copy(values[i]);
		}
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonBusiLog(CmConstants.BusiLogId.CPR_REQ_TASK, beans, CmConstants.BusiLogType.CUSTOMER_LOG, -1);
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(beans);

	}

	public void changeStatus(long[] ids, String[] status) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		condition.append(IBOCmCustRequestTaskValue.S_TaskId).append(" IN ( ");
		for (int i = 0, len = ids.length; i < len; i++) {
			condition.append(":taskId").append(i).append(" ");
			parameter.put("taskId" + i, Long.valueOf(ids[i]));
			if (i != len - 1) {
				condition.append(",");
			}
		}
		condition.append(")");
		IBOCmCustRequestTaskValue[] values = (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class, condition.toString(),
				parameter, -1, -1);
		BOCmCustRequestTaskBean[] beans = new BOCmCustRequestTaskBean[values.length];
		for (int i = 0; i < values.length; i++) {
			values[i].setRequestStatus(status[i]);
			values[i].setResults("");
			beans[i] = new BOCmCustRequestTaskBean();
			beans[i].copy(values[i]);
		}
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonBusiLog(CmConstants.BusiLogId.CPR_REQ_TASK, beans, CmConstants.BusiLogType.CUSTOMER_LOG, -1);
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(beans);
	}

	/**
	 * 修改为根据请求结果查询
	 */
	public IQBOCmCustRequestValue[] queryCustRequestTask(String xmlCondition, int startNum, int endNum) throws Exception {

		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		DataContainer container = dcs[0];

		StringBuilder unionCond = new StringBuilder("SELECT t.PARTY_NAME AS CUST_NAME,k.* FROM {CM_PARTY} t,{CM_CUST_REQUEST_TASK} k WHERE t.CPR_ID=k.CUST_ID");
		HashMap parameter = new HashMap();
		String custName = container.getAsString(IQBOCmCustRequestValue.S_CustName);
		long id = container.getAsLong(IQBOCmCustRequestValue.S_CustId);
		String result = container.getAsString(IQBOCmCustRequestValue.S_Results);
		if (custName != null && custName.length() > 0) {
			unionCond.append(" AND ").append(IBOCmPartyValue.S_PartyName).append(" like ").append(":custName ");
			parameter.put("custName", custName + "%");
		}
		if (id > 0) {
			// 增加支持客户ID查询CPR请求工单
			if (String.valueOf(id).length() == 14) {
				ICmIndivCustomerSV cmIndivCustomerSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
				IBOCmIndivCustomerValue val = cmIndivCustomerSV.queryIndivCustomerById(id);
				if (val != null) {
					id = val.getPartyId();
				} else {
					return new IQBOCmCustRequestValue[0];
				}
			}
			unionCond.append(" AND ").append(IBOCmPartyValue.S_PartyId).append(" =:custId ");
			parameter.put("custId", id);
		}
		if (result != null && result.length() > 0) {
			unionCond.append(" AND ").append(IQBOCmCustRequestValue.S_Results).append(" =:results ");
			parameter.put("results", result);
		}
		String sql = CmLnCommonUtil.getQueryResult(unionCond.toString(), null, startNum, endNum, parameter);
		// 记录日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLogWithCustId(CmConstants.BusiLogId.CPR_REQ_TASK, sql, parameter, CmConstants.BusiLogType.CUSTOMER_LOG, -1);
		IQBOCmCustRequestValue[] returnValue = (IQBOCmCustRequestValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmCustRequestBean.class, sql, parameter);
		if (returnValue != null && returnValue.length > 0) {
			ICmIndivCustomerSV cmIndivCustomerSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
			long customerId = 0;
			for (int i = 0; i < returnValue.length; i++) {
				if (!("000").equals(returnValue[i].getResults())) {
					customerId = cmIndivCustomerSV.queryCustIdByPNR(returnValue[i].getCustId());
					IBOCmIndivCustomerValue val = cmIndivCustomerSV.queryIndivCustomerById(id);
					if (val != null) {
						if (String.valueOf(CmConstants.EntityType.CUSTOMER).equals(val.getIndivCustType())) {
							customerId = val.getCustId();
						} else {
							customerId = val.getPartyId();
						}
					} else {
						ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
						IBOCmPartyValue[] partyValues = service.queryPartyByCprId(returnValue[i].getCustId());
						if (partyValues != null && partyValues.length > 0) {
							customerId = partyValues[0].getPartyId();
						}
					}
					returnValue[i].setAction("<a href=\"javascript:void(0)\" onclick=\"openTicketInfo(" + customerId + "," + returnValue[i].getResults()
							+ ")\" style='color:blue;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS9700001") + "</a>");
				}

			}
		}
		return returnValue;
	}

	@Override
	public void modifyCustAddress(long contRelaId, String address, int isProtected, Timestamp effDate, Timestamp expDate, String addressType, String addressId, String contactPerson) throws Exception {
		BOCmCustContactMediumBean bean = new BOCmCustContactMediumBean();
		bean.set(IBOCmCustContactMediumValue.S_CustContRelaId, contRelaId);
		IBOCmCustContactMediumValue value = (IBOCmCustContactMediumValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		value.setAddressDetail(address);
		if (isProtected == 1) {
			value.setProtectEffDate(effDate);
			value.setProtectExpDate(expDate);
		} else {
			value.setProtectEffDate(null);
			value.setProtectExpDate(null);
		}
		value.setContactPerson(contactPerson);
		value.setAddressId(Long.parseLong(addressId));
		value.setContMedTypeId(Long.parseLong(addressType));
		bean.copy(value);
		List<BOCmCustContactMediumBean> list = new ArrayList<>();
		list.add(bean);
		saveCustContMedium(list.toArray(new BOCmCustContactMediumBean[0]));
	}

	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, int startIndex, int endIndex) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
		parameter.put("CUST_ID", custId);
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relaType ");
		parameter.put("relaType", CmConstants.RelaType.OWNER);
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		IBOCmInsCmrelValue[] insValues = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter,
				startIndex, endIndex);
		ArrayList<IBOCmInsCmrelValue> list = new ArrayList<IBOCmInsCmrelValue>();
		if (CmCommonUtil.isNotEmptyObject(insValues)) {
			for (int i = 0; i < insValues.length; i++) {
				long userId = insValues[i].getUserId();
				// 调用接口查询用户信息
				CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
				IInsUserValue value = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
				if (CmCommonUtil.isNotEmptyObject(value)) {
					String state = value.getState();
					int userType = value.getUserType();
					// 只有状态为1,4,8的时候这个号码才可用,另外个人的虚用户为6，集团虚用户为8
					if (null != value && (("1").equals(state) || ("4").equals(state) || ("8").equals(state)) && userType != 6) {
						insValues[i].setBillId(value.getBillId());
						list.add(insValues[i]);
					} else {
						continue;
					}
					IInsCmRelSV crmInsFSV = (IInsCmRelSV) ServiceFactory.getService(IInsCmRelSV.class);
					IInsCmRelValue insCmRelValue = crmInsFSV.queryInsCmRel(userId, -1, CmConstants.RelaType.USER, CmConstants.CmInsRela.NORMAL);
					if (CmCommonUtil.isNotEmptyObject(insCmRelValue)) {
						ICustomerValue user = queryCustomerByCustId(insCmRelValue.getCustId());
						// 已分配
						insValues[i].setIsAssigned(CmConstants.IsAssigned.ASSIGNED);
						insValues[i].setUser(String.valueOf(user.getCustId()));
						// 对于使用者显示其名称
						insValues[i].setDiaplayAttr("USER", "REAL_USER_NAME", user.getCustName());
						// 对于使用者可编辑它的属性
						if (insCmRelValue.getCmrelId() > 0 && (String.valueOf(CmConstants.roleType.user).equals(user.getIndivCustType()))) {
							String editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyCustInfo(" + insCmRelValue.getCustId()
									+ ")' style='color:blue;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
							insValues[i].setAction(editor);
						}
					} else {
						// 未分配
						insValues[i].setIsAssigned(CmConstants.IsAssigned.NOT_ASSIGNED);
					}
					// 对于归属者显示其名称
					ICustomerValue owner = queryCustomerByCustId(custId);
					insValues[i].setDiaplayAttr("CUST_ID", "REAL_CUST_NAME", owner.getCustName());
				}
			}
			return list.toArray(new IBOCmInsCmrelValue[0]);
		}
		return new IBOCmInsCmrelValue[0];
	}

	public IBOCmInsCmrelValue[] queryCmInsCmrelByUserId(long userId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
		parameter.put("userId", userId);
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		return (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, -1, -1);
	}

	public void saveCmInsCmrel(IBOCmInsCmrelValue value) throws Exception {
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = customerSV.queryCustomerByCustId(value.getCustId());
		long userId = value.getUserId();
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
		ICrmInsFSV service = (ICrmInsFSV) ServiceFactory.getService(ICrmInsFSV.class);
		// 需要同步客户用户关系（使用者）到订单
		if (value.isNew()) {
			// 新增的归属关系生效时间要与用户的生成时间保持一致
			if (value.getRelaType() == CmConstants.RelaType.OWNER) {
//				IInsUserValue insValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
//				if (CmCommonUtil.isNotEmptyObject(insValue)) {
//					value.setEffectiveDate(insValue.getEffectiveDate());
//				}
			}
			// 新增使用者关系
			IInsCmRelValue insValue = new InsCmRelBean();
			insValue.copy(value);
			service.saveInsCmRel(insValue, 1);
			if (value.getRelaType() == CmConstants.RelaType.USER) {
				// 送phonebook
				IPhoneBookSV sv = (IPhoneBookSV) ServiceFactory.getService(IPhoneBookSV.class);
				sv.modifyCustomerCVRState(value.getCustId(), userId);
				// 如果是选择的客户需要往cm_party_role插入一条数据
				if (custValue.getCustType() == CmConstants.CustomerType.GROUP || !String.valueOf(CmConstants.EntityType.USER).equals(custValue.getIndivCustType())) {
					ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
					IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRoles(custValue.getPartyId(), CmConstants.roleType.user, -1);
					// AI-14295 不存在user角色才新增
					if (roleValues == null || roleValues.length <= 0) {
						IBOCmPartyRoleValue roleValue = new BOCmPartyRoleBean();
						roleValue.setEntityId(custValue.getCustId());
						roleValue.setPartyId(custValue.getPartyId());
						roleValue.setRoleType(CmConstants.PartyRoleType.USER);
						roleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
						roleValue.setState(CmConstants.RecordState.USE);
						roleValue.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
						roleValue.setRoleRegionId(CmCommonUtil.getDefaultRegionId());
						roleValue.setRegionId(roleValue.getRoleRegionId());
						// 保存角色信息
						roleSV.savePartyRoleInfo(roleValue);
					}
				}
				// 如果选的是一个成员角色则需要送CPR
				if (String.valueOf(CmConstants.EntityType.EMPLOYEE).equals(custValue.getIndivCustType())) {
					ICmCustRequestTaskSV taskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
					taskSV.saveCustRequestTaskInfo(value.getCustId(), CmConstants.RequestType.ADD, CmConstants.RequestStatus.pending);
					// 将cpr_id插入cm_party表中
					commonSV.saveCprIdInParty(value.getCustId());
				}
				// 保存业务记录
				commonSV.saveCommonBusiLog(CmConstants.BusiLogId.USER_ADD, new DataStructInterface[] { value }, CmConstants.BusiLogType.CUSTOMER_LOG, value.getCustId());
			}
		} else if (value.isModified()) {
			// 修改使用者关系
			IInsCmRelValue insValue = new InsCmRelBean();
			insValue.copy(value);
			service.saveInsCmRel(insValue, 2);
		} else {
			// 删除使用者关系
			IInsCmRelValue insValue = new InsCmRelBean();
			insValue.copy(value);
			service.saveInsCmRel(insValue, 3);
		}
		if (value.getRelaType() == CmConstants.RelaType.USER) {
			if (value.isDeleted() || value.getState() == CmConstants.CmInsRela.TERMINATED) {
				// 如果该使用者下面没有其他的号码则需要送工单退订
				// 只针对个人客户
				if (CmCommonUtil.getCustType(value.getCustId()) == CmConstants.CustomerType.INDIVIDUAL) {
					dealStopUserFromCPR(value.getCustId(), userId);
				}
				// 如果是集团客户，判断该集团客户下面有没有 其他 使用者了，如果没有，就将使用者角色删除
				else if (CmCommonUtil.getCustType(value.getCustId()) == CmConstants.CustomerType.GROUP) {
					ICm2SoSV sv = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
					// 查询该使用者下面是否还有其他的使用关系
					int count = sv.queryCmInsCmrelCountWithoutSelf(value.getCustId(), userId, 1);
					if (count == 0) {
						long partyId = custValue.getPartyId();
						// 查询角色信息
						ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
						IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRole(partyId, CmConstants.EntityType.USER, -1, -1);
						if (CmCommonUtil.isNotEmptyObject(roleValues)) {
							// 设置状态失效
							roleValues[0].setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
							roleValues[0].setState(CmConstants.RecordState.ERASE);
							BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
							bean.copy(roleValues[0]);
							roleSV.savePartyRole(bean);
						}
					}
				}
				// 如果该客户是受保护的，则需要退订phonebook
				// long custId = value.getCustId();
				// ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV)
				// ServiceFactory.getService(ICmIndivCustomerSV.class);
				// if (indivSV.ifCustIsProtected(custId)) {
				// // 插入工单退订
				// commonSV.savePsPublicInfo(custValue, CmConstants.PsPublicAction.PHONE_NUM_HIDE, userId);
				// }
				// 保存业务记录
				commonSV.saveCommonBusiLog(CmConstants.BusiLogId.USER_DELETE, new DataStructInterface[] { value }, CmConstants.BusiLogType.CUSTOMER_LOG, value.getCustId());
			}
		}
		// 送billing
		ICmLnCommonServiceSV cmLnCommonServiceSV = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
		IBOLnCmInsCmRelValue lnValue = new BOLnCmInsCmRelBean();
		lnValue.copy(value);
		if (lnValue.getState() == CmConstants.CmInsRela.TERMINATED) {
			lnValue.delete();
		}
		if (lnValue.isNew() || lnValue.isDeleted()) {
			cmLnCommonServiceSV.sendToBilling(new IBOLnCmInsCmRelValue[] { lnValue });
		}
		// 保存客户用户关系
		BOCmInsCmrelBean bean = new BOCmInsCmrelBean();
		bean.copy(value);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		
		//判断选择的使用客户信息是否有效
		if(value.isNew()&&value.getRelaType() == CmConstants.RelaType.USER&&CmCommonUtil.getCustType(value.getCustId()) == CmConstants.CustomerType.INDIVIDUAL){
			//选择另外一个客户作为使用者时，判断使用者客户的cm_party ，cm_party_role，cm_Indiv_customer 如果失效是否有效，如果失效，设置成生效
			DataContainer container = new DataContainer();
			container.set(ICustomerValue.S_CustId, value.getCustId());
			container.set(ICustomerValue.S_CustType, 1);
			ICustomerValue[] values = (ICustomerValue[]) customerSV.queryCustomers(container, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				if(values[0].getState().equals(CmConstants.RecordState.ERASE)) {
					ICustomerValue[] values_H = customerSV.queryCustomerHis(container, -1, -1);
					for (int i = 0; i < values_H.length; i++) {
						if(values_H[i].getCustCertType()>0&&com.ai.bce.util.StringUtils.hasText(values_H[i].getCustCertCode().trim())) {
							values[0].setCustCertType(values_H[i].getCustCertType());
							values[0].setCustCertCode(values_H[i].getCustCertCode().trim());
						}
					}
					values[0].setState(CmConstants.RecordState.USE);
					values[0].setExpireDate(TimeUtil.MAX_EXPIRE_DATE);
					CmServiceFactory.getCustomerSV().saveCustomer(values[0]);
				}
			}
			ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			long partyId = custValue.getPartyId();
			// 查询使用者角色信息
			IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRoles(partyId, -1, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(roleValues)) {
				for (int i = 0; i < roleValues.length; i++) {
					if (roleValues[i].getRoleType() == CmConstants.roleType.user
							&& (roleValues[i].getRoleStatus() == CmConstants.roleStatus.IN_ACTIVE
							|| StringUtils.equalsIgnoreCase(roleValues[i].getState(), CmConstants.RecordState.ERASE))) {
						// 设置状态生效
						roleValues[i].setRoleStatus(CmConstants.roleStatus.ACTIVE);
						roleValues[i].setState(CmConstants.RecordState.USE);
						BOCmPartyRoleBean partyRoleBean = new BOCmPartyRoleBean();
						partyRoleBean.copy(roleValues[i]);
						roleSV.savePartyRole(partyRoleBean);
					}
				}
			}
			//同时需要再送CPR订购，因为之前删除的时候，已经发生了退订
			ICmCustRequestTaskSV requestSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
			//重新订购cpr
			requestSV.saveCustRequestTaskInfo(value.getCustId(), CmConstants.RequestType.ADD, CmConstants.RequestStatus.pending);
		}
	}
	
	
	public void saveCmInsCmrel4Reaccess(IBOCmInsCmrelValue value) throws Exception {
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = customerSV.queryCustomerByCustId(value.getCustId());
		long userId = value.getUserId();
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
		ICrmInsFSV service = (ICrmInsFSV) ServiceFactory.getService(ICrmInsFSV.class);
		log.error("=========================  saveCmInsCmrel4Reaccess   userId:"+userId);
		// 需要同步客户用户关系（使用者）到订单
		if (value.isNew()) {
			log.error("=========================  saveCmInsCmrel4Reaccess value.isNew()  userId:"+userId);
			// 新增的归属关系生效时间要与用户的生成时间保持一致
//			if (value.getRelaType() == CmConstants.RelaType.OWNER) {
//				IInsUserValue insValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
//				if (CmCommonUtil.isNotEmptyObject(insValue)) {
//					value.setEffectiveDate(insValue.getEffectiveDate());
//				}
//			}
			// 新增使用者关系
			IInsCmRelValue insValue = new InsCmRelBean();
			insValue.copy(value);
			service.saveInsCmRel(insValue, 1);
			if (value.getRelaType() == CmConstants.RelaType.USER) {
				// 送phonebook
				IPhoneBookSV sv = (IPhoneBookSV) ServiceFactory.getService(IPhoneBookSV.class);
				sv.modifyCustomerCVRState(value.getCustId(), userId);
				// 如果是选择的客户需要往cm_party_role插入一条数据
				if (custValue.getCustType() == CmConstants.CustomerType.GROUP || !String.valueOf(CmConstants.EntityType.USER).equals(custValue.getIndivCustType())) {
					ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
					IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRoles(custValue.getPartyId(), CmConstants.roleType.user, -1);
					// AI-14295 不存在user角色才新增
					if (roleValues == null || roleValues.length <= 0) {
						IBOCmPartyRoleValue roleValue = new BOCmPartyRoleBean();
						roleValue.setEntityId(custValue.getCustId());
						roleValue.setPartyId(custValue.getPartyId());
						roleValue.setRoleType(CmConstants.PartyRoleType.USER);
						roleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
						roleValue.setState(CmConstants.RecordState.USE);
						roleValue.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
						roleValue.setRoleRegionId(CmCommonUtil.getDefaultRegionId());
						roleValue.setRegionId(roleValue.getRoleRegionId());
						// 保存角色信息
						roleSV.savePartyRoleInfo(roleValue);
					}
				}
				// 如果选的是一个成员角色则需要送CPR
				if (String.valueOf(CmConstants.EntityType.EMPLOYEE).equals(custValue.getIndivCustType())) {
					ICmCustRequestTaskSV taskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
					taskSV.saveCustRequestTaskInfo(value.getCustId(), CmConstants.RequestType.ADD, CmConstants.RequestStatus.pending);
					// 将cpr_id插入cm_party表中
					commonSV.saveCprIdInParty(value.getCustId());
				}
				// 保存业务记录
				commonSV.saveCommonBusiLog(CmConstants.BusiLogId.USER_ADD, new DataStructInterface[] { value }, CmConstants.BusiLogType.CUSTOMER_LOG, value.getCustId());
			}
		} else if (value.isModified()) {
			log.error("=========================  saveCmInsCmrel4Reaccess value.isModified()  userId:"+userId);
			// 修改使用者关系
			IInsCmRelValue insValue = new InsCmRelBean();
			insValue.copy(value);
			service.saveInsCmRel(insValue, 2);
		} else {
			// 删除使用者关系
			log.error("=========================  saveCmInsCmrel4Reaccess value.else()  userId:"+userId);
			IInsCmRelValue insValue = new InsCmRelBean();
			insValue.copy(value);
			service.saveInsCmRel(insValue, 3);
		}
		if (value.getRelaType() == CmConstants.RelaType.USER) {
			if (value.isDeleted() || value.getState() == CmConstants.CmInsRela.TERMINATED) {
				log.error("=========================  saveCmInsCmrel4Reaccess value.isDeleted()||TERMINATED  userId:"+userId);
				
				IInsUserValue insValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
				if (CmCommonUtil.isNotEmptyObject(insValue)) {
					log.error("=========================  saveCmInsCmrel4Reaccess value.isDeleted()||TERMINATED  value.getCmrelId():"+value.getCmrelId());

					log.error("=========================  saveCmInsCmrel4Reaccess value.isDeleted()||TERMINATED  insValue.getEffectiveDate():"+insValue.getEffectiveDate());
					value.setEffectiveDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				}

				// 如果该使用者下面没有其他的号码则需要送工单退订
				// 只针对个人客户
				if (CmCommonUtil.getCustType(value.getCustId()) == CmConstants.CustomerType.INDIVIDUAL) {
					dealStopUserFromCPR(value.getCustId(), userId);
				}
				// 如果是集团客户，判断该集团客户下面有没有 其他 使用者了，如果没有，就将使用者角色删除
				else if (CmCommonUtil.getCustType(value.getCustId()) == CmConstants.CustomerType.GROUP) {
					ICm2SoSV sv = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
					// 查询该使用者下面是否还有其他的使用关系
					int count = sv.queryCmInsCmrelCountWithoutSelf(value.getCustId(), userId, 1);
					if (count == 0) {
						long partyId = custValue.getPartyId();
						// 查询角色信息
						ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
						IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRole(partyId, CmConstants.EntityType.USER, -1, -1);
						if (CmCommonUtil.isNotEmptyObject(roleValues)) {
							// 设置状态失效
							roleValues[0].setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
							roleValues[0].setState(CmConstants.RecordState.ERASE);
							BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
							bean.copy(roleValues[0]);
							roleSV.savePartyRole(bean);
						}
					}
				}
				// 如果该客户是受保护的，则需要退订phonebook
				// long custId = value.getCustId();
				// ICmIndivCustomerSV indivSV = (ICmIndivCustomerSV)
				// ServiceFactory.getService(ICmIndivCustomerSV.class);
				// if (indivSV.ifCustIsProtected(custId)) {
				// // 插入工单退订
				// commonSV.savePsPublicInfo(custValue, CmConstants.PsPublicAction.PHONE_NUM_HIDE, userId);
				// }
				// 保存业务记录
				commonSV.saveCommonBusiLog(CmConstants.BusiLogId.USER_DELETE, new DataStructInterface[] { value }, CmConstants.BusiLogType.CUSTOMER_LOG, value.getCustId());
			}
		}
		// 送billing
		ICmLnCommonServiceSV cmLnCommonServiceSV = (ICmLnCommonServiceSV) ServiceFactory.getService(ICmLnCommonServiceSV.class);
		IBOLnCmInsCmRelValue lnValue = new BOLnCmInsCmRelBean();
		lnValue.copy(value);
		if (lnValue.getState() == CmConstants.CmInsRela.TERMINATED) {
			lnValue.delete();
		}
		if (lnValue.isNew() || lnValue.isDeleted()) {
			cmLnCommonServiceSV.sendToBilling(new IBOLnCmInsCmRelValue[] { lnValue });
		}
		// 保存客户用户关系
		BOCmInsCmrelBean bean = new BOCmInsCmrelBean();
		bean.copy(value);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public IQBOCmCustContMediumAndTypeValue queryCustContactMedium(long contRelaId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IQBOCmCustContMediumAndTypeValue.S_CustContRelaId).append(" =:contRelaId ");
		parameter.put("contRelaId", contRelaId);

		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmCustContMediumAndTypeBean.class, condition.toString(), parameter, -1, -1);
		IQBOCmCustContMediumAndTypeValue[] values = (IQBOCmCustContMediumAndTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmCustContMediumAndTypeBean.class, sql, parameter);
		if (values != null && values.length > 0) {
			if (values[0].getProtectEffDate() != null || values[0].getProtectExpDate() != null) {
				values[0].setIsProtected(CmConstants.YesOrNo.YES);
			} else {
				values[0].setIsProtected(CmConstants.YesOrNo.NO);
			}
			return values[0];
		}
		return null;
	}
	
	/** 
	 * 根据contId  查询 party 联系媒介(经过沟通，只需要CmContactContMedium表信息)
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-13
	* ICmCustomerSV
	 */
	public IBOCmContactContMediumValue[] queryContactContMediumValueByContId(long contId) throws Exception{
		 Connection conn = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 List<IBOCmContactContMediumValue> custGroupIdList = new ArrayList<IBOCmContactContMediumValue>();
		 try {
			 conn = ServiceManager.getSession().getConnection();
			 DataContainer dc = new DataContainer();
			 dc.set( "TENANT_ID", TenantIDFactory.getTenantId()); 
			 String tablename_insoffer = SplitTableFactory.createTableName(BOCmContactContMediumPojoBean.getObjectTypeStatic().getMapingEnty(), dc);
			 
			 StringBuffer sqlString = new StringBuffer();
			 sqlString.append(" select * ");
			 sqlString.append(" from ");
			 sqlString.append(tablename_insoffer);
			 sqlString.append(" where  CONT_ID = ?  order by ").append(BOCmContactContMediumPojoBean.S_Priority).append(" ASC");
			 ps = conn.prepareStatement(sqlString.toString());
			 ps.setObject(1,  contId ); 
			 rs = ps.executeQuery();
			 
			 while (rs.next()) {
				 IBOCmContactContMediumValue contactContMediumValue_temp = new BOCmContactContMediumBean();
				 contactContMediumValue_temp.setContRelaId(rs.getLong(IBOCmContactContMediumValue.S_ContRelaId));
				 contactContMediumValue_temp.setContId(rs.getLong(IBOCmContactContMediumValue.S_ContId));
				 contactContMediumValue_temp.setContMedTypeId(rs.getLong(IBOCmContactContMediumValue.S_ContMedTypeId));
				 contactContMediumValue_temp.setPostalCode(rs.getString(IBOCmContactContMediumValue.S_PostalCode));
				 contactContMediumValue_temp.setAddressId(rs.getLong(IBOCmContactContMediumValue.S_AddressId));
				 contactContMediumValue_temp.setAddressCode(rs.getString(IBOCmContactContMediumValue.S_AddressCode));
				 contactContMediumValue_temp.setAddressDetail(rs.getString(IBOCmContactContMediumValue.S_AddressDetail));
				 contactContMediumValue_temp.setEmailAddress(rs.getString(IBOCmContactContMediumValue.S_EmailAddress));
				 contactContMediumValue_temp.setFaxNumber(rs.getString(IBOCmContactContMediumValue.S_FaxNumber));
				 contactContMediumValue_temp.setContNumber(rs.getString(IBOCmContactContMediumValue.S_ContNumber));
				 contactContMediumValue_temp.setIsNoDisturbing(rs.getInt(IBOCmContactContMediumValue.S_IsNoDisturbing));
				 contactContMediumValue_temp.setPriority(rs.getInt(IBOCmContactContMediumValue.S_Priority));
				 contactContMediumValue_temp.setProtectEffDate(rs.getTimestamp(IBOCmContactContMediumValue.S_ProtectEffDate));
				 contactContMediumValue_temp.setProtectExpDate(rs.getTimestamp(IBOCmContactContMediumValue.S_ProtectExpDate));
				 contactContMediumValue_temp.setState(rs.getString(IBOCmContactContMediumValue.S_State));
				 contactContMediumValue_temp.setCreateDate(rs.getTimestamp(IBOCmContactContMediumValue.S_CreateDate));
				 contactContMediumValue_temp.setRegionId(rs.getString(IBOCmContactContMediumValue.S_RegionId));
				 contactContMediumValue_temp.setRemarks(rs.getString(IBOCmContactContMediumValue.S_Remarks));
				 custGroupIdList.add(contactContMediumValue_temp);
			 }
		 }catch(Exception e){
			 e.printStackTrace();
			 throw e;
		 }
		 finally {
			 CmCommonUtil.closeJDBC(conn, ps, null);
		 }
		if(custGroupIdList.size()>0){
			return custGroupIdList.toArray(new IBOCmContactContMediumValue[0]);
		}else{
			return null;
		}
	}
	
	/** 
	 * 根据contRelaId  查询 party 联系媒介
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-13
	* ICmCustomerSV
	 */
	public IBOCmContactContMediumPojoValue[] queryContactContMediumValueByContRelaId(long contRelaId) throws Exception{
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmContactContMediumPojoValue.S_ContRelaId).append(" =:contRelaId ");
		parameter.put("contRelaId",contRelaId);

		IBOCmContactContMediumPojoValue[] values = (IBOCmContactContMediumPojoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmContactContMediumPojoBean.class, condition.toString(), parameter, -1, -1);
		if (values != null && values.length > 0) {
			 return values;
		}
		return null;
	}

	public void sendToBilling(IBOCmInsCmrelValue[] cmInsCmRelValues) throws Exception {
		String regionId = CmCommonUtil.getDefaultRegionId();
		List<HashMap> list = new ArrayList<HashMap>();
		for (int i = 0; i < cmInsCmRelValues.length; i++) {
			HashMap map1 = new HashMap();
			map1.put(IBOCmInsCmrelValue.S_UserId, cmInsCmRelValues[i].getUserId());
			map1.put(IBOCmInsCmrelValue.S_CustId, cmInsCmRelValues[i].getCustId());
			map1.put("RELATIONSHIP_TYPE", cmInsCmRelValues[i].getRelaType());
			map1.put(IBOCmInsCmrelValue.S_EffectiveDate, ServiceManager.getOpDateTime());
			map1.put(IBOCmInsCmrelValue.S_ExpireDate, TimeUtil.getMaxExpire());
			map1.put(IBOCmInsCmrelValue.S_DoneCode, ServiceManager.getDoneCode());
			map1.put(IBOCmInsCmrelValue.S_DoneDate, ServiceManager.getOpDateTime());
			map1.put("REGION_ID", regionId);
			if (cmInsCmRelValues[i].isDeleted()) {
				map1.put("OPER_TYPE", 3);
				list.add(map1);
			}
			if (cmInsCmRelValues[i].isNew()) {
				map1.put("OPER_TYPE", 1);
				list.add(map1);
			}
			if (cmInsCmRelValues[i].isModified()) {
				HashMap map2 = new HashMap();
				long cmrelId = cmInsCmRelValues[i].getCmrelId();
				DataContainer container = new DataContainer();
				container.set(IBOCmInsCmrelValue.S_CmrelId, cmrelId);
				IBOCmInsCmrelValue value = (IBOCmInsCmrelValue) CmInnerServiceFactory.getCommonInnerSV().getBean(container);
				map2.put(IBOCmInsCmrelValue.S_UserId, value.getUserId());
				map2.put(IBOCmInsCmrelValue.S_CustId, value.getCustId());
				map2.put("RELATIONSHIP_TYPE", value.getRelaType());
				map2.put(IBOCmInsCmrelValue.S_EffectiveDate, ServiceManager.getOpDateTime());
				map2.put(IBOCmInsCmrelValue.S_ExpireDate, TimeUtil.getMaxExpire());
				map2.put(IBOCmInsCmrelValue.S_DoneCode, ServiceManager.getDoneCode());
				map2.put(IBOCmInsCmrelValue.S_DoneDate, ServiceManager.getOpDateTime());
				map2.put("REGION_ID", regionId);
				map2.put("OPER_TYPE", 3);
				list.add(map2);
				map1.put("OPER_TYPE", 1);
				list.add(map1);
			}
		}
		HashMap maps = new HashMap();
		maps.put("I_CUST_USER", list);
		IInterfaceBillCrmSV service = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);
		service.sendMapOrderInfoToBilling(maps);
	}

	public IQBOCmCustContMediumAndTypeValue queryCustContactMediumByCustId(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IQBOCmCustContMediumAndTypeValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" ORDER BY ").append(IQBOCmCustContMediumAndTypeValue.S_Priority);
		IQBOCmCustContMediumAndTypeValue[] results = (IQBOCmCustContMediumAndTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmCustContMediumAndTypeBean.class,
				condition.toString(), parameter, -1, -1);
		if (results != null && results.length > 0) {
			return results[0];
		}
		return null;
	}

	public IBOCmCustContactMediumValue[] queryContactMediumByCondition(long custId, int addressType) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		if(addressType>0){
			condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ContMedTypeId).append(" =:addressType ");
			parameter.put("addressType", addressType);
		}
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (values != null && values.length > 0) {
			return values;
		}
		return new IBOCmCustContactMediumValue[0];
	}
	
	public IBOCmCustContactMediumValue[] queryContactMediumByAddressId(long custId,long addressId, int addressType) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_AddressId).append(" =:addressId ");
		parameter.put("addressId", addressId);
		if(addressType>0){
			condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ContMedTypeId).append(" =:addressType ");
			parameter.put("addressType", addressType);
		}
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (values != null && values.length > 0) {
			return values;
		}
		return new IBOCmCustContactMediumValue[0];
	}
	
	public IBOCmCustContactMediumValue[] queryContactMediumByAddressType(long custId,long addressId, int addressType) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		if(addressId>0){
			condition.append(" AND ").append(IBOCmCustContactMediumValue.S_AddressId).append(" =:addressId ");
			parameter.put("addressId", addressId);
		}
		if(addressType>0){
			condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ContMedTypeId).append(" =:addressType ");
			parameter.put("addressType", addressType);
		}
		condition.append(" order by ").append(IBOCmCustContactMediumValue.S_Priority);
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (values != null && values.length > 0) {
			return values;
		}
		return new IBOCmCustContactMediumValue[0];
	}

	public IBOCmCustGroupValue[] queryCmCustGroup(String state) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustGroupValue.S_State).append(" =:state ");
		parameter.put("state", state);
		IBOCmCustGroupValue[] values = (IBOCmCustGroupValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustGroupBean.class, condition.toString(), parameter, -1, -1);
		return values;
	}

	public void saveCustGroup(String code, String name, String desc) throws Exception {
		long id = CmCommonUtil.getNewSequence(BOCmCustGroupBean.class);
		String regionId = CmCommonUtil.getDefaultRegionId();
		BOCmCustGroupBean bean = new BOCmCustGroupBean();
		bean.set(IBOCmCustGroupValue.S_CustGroupId, id);
		if (code != null) {
			bean.set(IBOCmCustGroupValue.S_CustGroupCode, code);
		}
		if (name != null) {
			bean.set(IBOCmCustGroupValue.S_CustGroupName, name);
		}
		if (desc != null) {
			bean.set(IBOCmCustGroupValue.S_CustGroupDesc, desc);
		}
		bean.set(IBOCmCustGroupValue.S_State, "U");
		bean.set(IBOCmCustGroupValue.S_RegionId, regionId);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public void deleteCustGroup(long id) throws Exception {
		BOCmCustGroupBean bean = new BOCmCustGroupBean();
		bean.setCustGroupId(id);
		IBOCmCustGroupValue value = (IBOCmCustGroupValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		BOCmCustGroupBean bean1 = new BOCmCustGroupBean();
		bean1.copy(value);
		bean1.delete();
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean1);
	}

	public void saveModifyCustGroup(long id, String code, String name, String desc) throws Exception {
		BOCmCustGroupBean bean = new BOCmCustGroupBean();
		bean.setCustGroupId(id);
		IBOCmCustGroupValue value = (IBOCmCustGroupValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		value.setCustGroupCode(code);
		value.setCustGroupName(name);
		value.setCustGroupDesc(desc);
		BOCmCustGroupBean bean1 = new BOCmCustGroupBean();
		bean1.copy(value);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean1);
	}

	public void saveCustGroupMember(long custGroupId, long custId) throws Exception {
		BOCmCustGroupMemberBean bean = new BOCmCustGroupMemberBean();
		String regionId = CmCommonUtil.getDefaultRegionId();
		bean.setCustGroupMemberId(CmCommonUtil.getNewSequence(BOCmCustGroupMemberBean.class));
		bean.setCustGroupId(custGroupId);
		bean.setCustId(custId);
		bean.setState("U");
		bean.setRegionId(regionId);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public IBOCmCustGroupMemberValue[] queryCustGroupMember(long groupId, String state) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (groupId > 0) {
			condition.append(" AND ").append(IBOCmCustGroupMemberValue.S_CustGroupId).append(" =:groupId ");
			parameter.put("groupId", groupId);
		}
		if (!CmCommonUtil.isEmptyObj(state)) {
			condition.append(" AND ").append(IBOCmCustGroupMemberValue.S_State).append(" =:state ");
			parameter.put("state", state);
		}
		IBOCmCustGroupMemberValue[] values = (IBOCmCustGroupMemberValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustGroupMemberBean.class, condition.toString(),
				parameter, -1, -1);
		if (null != values && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				long custId = values[i].getCustId();
				long custGroupId = values[i].getCustGroupId();
				ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				String name = service.queryCustomerByCustId(custId).getCustName();
				BOCmCustGroupBean bean = new BOCmCustGroupBean();
				bean.setCustGroupId(custGroupId);
				IBOCmCustGroupValue value = (IBOCmCustGroupValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
				String custGroupName = value.getCustGroupName();
				values[i].setDiaplayAttr("CUST_ID", "CUST_ID_NAME", name);
				values[i].setDiaplayAttr("CUST_GROUP_ID", "CUST_GROUP_ID_NAME", custGroupName);

			}
		}
		return values;
	}

	public void deleteCustGroupMember(long id) throws Exception {
		BOCmCustGroupMemberBean bean = new BOCmCustGroupMemberBean();
		bean.setCustGroupMemberId(id);
		IBOCmCustGroupMemberValue value = (IBOCmCustGroupMemberValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		BOCmCustGroupMemberBean bean1 = new BOCmCustGroupMemberBean();
		bean1.copy(value);
		bean1.delete();
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean1);
	}

	public IBOCmCustGroupMemberValue[] queryCustGroupMemberByCondition(long custGroupId, long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustGroupMemberValue.S_CustGroupId).append(" =:custGroupId ");
		parameter.put("custGroupId", custGroupId);
		condition.append(" AND ").append(IBOCmCustGroupMemberValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmCustGroupMemberValue[] values = (IBOCmCustGroupMemberValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustGroupMemberBean.class, condition.toString(),
				parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values;
		}
		return new IBOCmCustGroupMemberValue[0];
	}

	public ICustOrganizeValue queryCustOrganizeByRelCustId(long relCustId) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_RelCustId, relCustId);
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		if (values != null && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public ICustOrganizeValue queryCustOrgsByRelCustId(long relCustId) throws Exception {
		ICustOrganizeValue custOrg = null;
		DataContainer dContainer = new DataContainer();
		// 根据rel_cust_id查询父节点
		dContainer.set(ICustOrganizeValue.S_RelCustId, relCustId);
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		if (values != null && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				if (values[i].getParentDeptId() != values[i].getCustId()) {
					custOrg = values[i];
					break;
				}
			}
			if (custOrg == null) {
				custOrg = values[0];
				return custOrg;
			}
		}
		boolean flag = true;
		// 根据父节点查询根节点
		if (custOrg != null) {
			while (flag) {
				dContainer = new DataContainer();
				dContainer.set(ICustOrganizeValue.S_DeptId, custOrg.getParentDeptId());
				busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
				values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
				if (values != null && values.length > 0) {
					custOrg = values[0];
				} else {
					flag = false;
				}
			}
		}

		return custOrg;
	}

	public ICustOrganizeValue queryCustOrganizeByParentDeptId(long parentDeptId) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_ParentDeptId, parentDeptId);
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, -1, -1);
		if (values != null && values.length > 0) {
			return values[0];
		}
		return null;
	}

	@Override
	public ICustOrganizeValue queryCustOrganizeByDeptId(long deptId) throws Exception {
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_DeptId, deptId);
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[]{dContainer}, -1, -1);
		if (values != null && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public IBOCmCustContactMediumValue queryCustContactByCustId(long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public IQBOCmCustomerContactValue[] queryCustContactByCustIdAndName(long addressId, String name) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IQBOCmCustomerContactValue.S_AddressId).append(" =:addressId ");
		parameter.put("addressId", addressId);
		condition.append(" AND ").append(IQBOCmCustomerContactValue.S_CustName).append(" =:name ");
		parameter.put("name", name);
		IQBOCmCustomerContactValue[] values = (IQBOCmCustomerContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmCustomerContactBean.class,
				condition.toString(), parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values;
		}
		return new IQBOCmCustomerContactValue[0];
	}

	public IBOCmCustContactMediumValue[] queryCustContactMediumByDate(String date) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ProtectEffDate).append(" <= date_format( :date ,'%Y-%m-%d %H:%i:%s') ");
		parameter.put("date", date + " 00:00:00");
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ProtectExpDate).append(" >= date_format( :date ,'%Y-%m-%d %H:%i:%s') ");
		parameter.put("date", date + " 00:00:00");
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values;
		}
		return new IBOCmCustContactMediumValue[0];
	}

	public void deleteMember(long custGroupId) throws Exception {
		IBOCmCustGroupMemberValue[] values = queryCustGroupMember(custGroupId, "U");
		for (int i = 0; i < values.length; i++) {
			deleteCustGroupMember(values[i].getCustGroupMemberId());
		}
	}

	public String[] queryCprRecord(long cpr, String strdate, String enddate) throws Exception {
		String[] str = new String[4];
		str[0] = String.valueOf(cpr);
		str[1] = "jhon";
		str[2] = "2014-06-05";
		str[3] = "jiaohuneirong";
		return str;
	}

	public void changeRequestStatus(long taskId) throws Exception {
		BOCmCustRequestTaskBean bean = new BOCmCustRequestTaskBean();
		bean.setTaskId(taskId);
		IBOCmCustRequestTaskValue value = (IBOCmCustRequestTaskValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		value.setRequestStatus("P");
		bean.copy(value);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public void dealCreateIndivCustomer(long custId, long userId, String flag) throws Exception {
		IBOCmInsCmrelValue value = new BOCmInsCmrelBean();
		value.setCmrelId(CmCommonUtil.getNewSequence(BOLnCmInsCmRelBean.class));
		value.setCustId(custId);
		value.setUserId(userId);
		value.setRelaType(CmConstants.RelaType.OWNER);
		value.setState(CmConstants.CmInsRela.NORMAL);
		value.setEffectiveDateType(0);
		value.setExpireDateType(0);
		value.setExt3(CmCommonUtil.getSysDate().toString());
		// 设置中心
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
		IInsUserValue iInsUserValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
		if (CmCommonUtil.isNotEmptyObject(iInsUserValue)) {
			value.setUserType(iInsUserValue.getUserType());
			value.setUserRegionCode(iInsUserValue.getRegionId());
		}

		// 查询主策划
		IInstanceQrySV instanceQrySV = (IInstanceQrySV) ServiceFactory.getService(IInstanceQrySV.class);
		IInsOfferValue[] values = instanceQrySV.getInsOfferByUserId(userId, SoServiceFactory.getOmConstSV().getOfferTypeOfferPlan(), 1);
		if (null != values && values.length > 0) {
			value.setOfferId(values[0].getOfferId());
		}
		IInsUserValue insUserValue = instanceQrySV.getInstUserByUserId(userId);
		// 查询产品规格
		value.setProdCatalogId(insUserValue.getProdCatalogId());
		if (("N").equalsIgnoreCase(flag)) {
			if (CmCommonUtil.isNotEmptyObject(insUserValue)) {
				// 查询用户状态
				value.setExt1(insUserValue.getState());
			}
			// 查询停机位
			IInsUserOsStateValue[] insUserOsStateValue = InsServiceFactory.getInstanceUserOsStatusService().getUserOsStateByUserId(value.getUserId(), OrderConst.VALID_TYPE_NOW);
			if (CmCommonUtil.isNotEmptyObject(insUserOsStateValue)) {
				value.setExt2(insUserOsStateValue[0].getOsStatus());
			}
		} else if (("Y").equalsIgnoreCase(flag)) {
			value.setExt2(OrderConst.OS_STATUS);
			value.setExt1(String.valueOf(OrderConst.INST_USER_STATE_INUSE));
		}
		// 如果客户是受保护的要送 phonebook
		// ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		// boolean protectedFlag = indivService.ifCustIsProtected(custId);
		// if (protectedFlag) {
		// subscribePhoneBook(userId);
		// }
		saveCmInsCmrel(value);
	}

	public void dealShutDownCust(long custId, long userId, long custType, long orderId) throws Exception {
		// 如果客户下的用户都不是正常状态,用户归属客户变更为暂停
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 判断客户下面是否有正常的且非停机状态的用户，没有则暂停客户
		boolean isHaveActiveUser = sv.ifHaveActiveUser(custId, 1);
		log.info("-------- suspend dealShutDownCust-inbefore-");
		if (!isHaveActiveUser&&!checkHasActiveOrDunningAccount(custId)) {
			ICustomerValue value = queryCustomerByCustId(custId);
			log.info("-------- suspend dealShutDownCust- in-");
			value.setCustStatus(CmConstants.CustomerStatus.INDIV_PAUSE);
			// 此处将orderId存储在qq这个字段上
			value.setQqNo(DataType.getAsString(orderId));
			saveCustomer(value);
		}
	}

	public void dealStartMachine(long custId, long custType) throws Exception {
		// 直接转在网
		ICustomerValue value = queryCustomerByCustId(custId);
		value.setCustStatus(CmConstants.CustomerStatus.GROUP_ACTIVE);
		saveCustomer(value);
	}

	public void dealIndivUserToIndivCust(long custId, long oldCustId, long userId, long orderId) throws Exception {
		// 新个人客户激活变更为在网客户
		ICustomerValue value = queryCustomerByCustId(custId);
		//如果该客户已经是激活状态，不再做激活
		if(value != null && value.getCustStatus() != CmConstants.CustomerStatus.INDIV_ACTIVE){
			value.setCustStatus(CmConstants.CustomerStatus.INDIV_ACTIVE);
			saveCustomer(value);
		}
		// 生成用户与新个人客户的归属关系
		dealCreateIndivCustomer(custId, userId, "N");
		// 删除用户与老客户的归属关系
		dealDeleteCustUserRel(oldCustId, userId);
		// 判断原客户下是否还有有效用户，没有则变更原客户为离网客户
		dealValidateUser(oldCustId, userId, orderId);
		// 与C3的交互
		dealCustToCustOfC3(oldCustId, custId, userId);
	}

	public void dealDeleteCustUserRel(long custId, long userId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
		parameter.put("CUST_ID", custId);
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserId).append(" =:userId ");
		parameter.put("userId", userId);
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_RelaType).append(" =:relaType ");
		parameter.put("relaType", CmConstants.RelaType.OWNER);
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		IBOLnCmInsCmRelValue[] values = (IBOLnCmInsCmRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmInsCmRelBean.class, condition.toString(), parameter, -1,
				-1);
		if (null != values && values.length > 0) {
			IBOCmInsCmrelValue bean = new BOCmInsCmrelBean();
			bean.copy(values[0]);
			// 预销户
			bean.setState(CmConstants.CmInsRela.TERMINATED);
			// 保存客户用户关系
			ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			sv.saveCmInsCmrel(bean);
		}
	}

	public void dealValidateUser(long custId, long userId, long orderId) throws Exception {
		String flag = "N";
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 查询客户下面是否有正常状态的用户(包含停机)
		boolean isHaveActiveUser = sv.ifHaveActiveUser(custId, 2);
		ICustomerValue value = queryCustomerByCustId(custId);
		log.error("================================ dealValidateUser isHaveActiveUser="+isHaveActiveUser);

		if (isHaveActiveUser) {
			// 查询客户下面是否有正常状态的用户(不包含停机)
			boolean isHaveRealActiveUser = sv.ifHaveActiveUser(custId, 1);
			if (!isHaveRealActiveUser&&!checkHasActiveOrDunningAccount(custId)) {
				log.error("================================ dealValidateUser isHaveRealActiveUser="+isHaveRealActiveUser);
				value.setCustStatus(CmConstants.CustomerStatus.INDIV_PAUSE);
				// 将orderId存储在QQ这个字段上面
				value.setQqNo(DataType.getAsString(orderId));
				log.error("================================ dealValidateUser setCustStatus="+CmConstants.CustomerStatus.INDIV_PAUSE);

				saveCustomer(value);
			}
		} else {
			if(!checkHasActiveOrDunningAccount(custId)) {
				value.setCustStatus(CmConstants.CustomerStatus.INDIV_INACTIVE);
				log.error("================================ dealValidateUser setCustStatus="+CmConstants.CustomerStatus.INDIV_INACTIVE);
				// 将orderId存储在QQ这个字段上面
				value.setQqNo(DataType.getAsString(orderId));
				// 如果是集团客户,则要判断有没有合同，有合同需要插TT
				if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.GROUP) {
					ifHaveContract(custId);
				}
				saveCustomer(value);
			}
			//如果客户从active 变成former或者从suspend变成former 时，系统即触发退订CPR/AKS 
		}
	}
	
	/**
	 * @throws Exception 
	 * 判断是否有相应状态的分期账户 (包含 ，1 和2 （dunning）)
	 * @Title: checkHasInstalmentAccount   
	 * @Description: TODO(描述这个方法的作用)   
	 * @param: @param custId
	 * @param: @param action 
	 * @param: @return   
	 * @author: YuJing    
	 * @date:   2020-10-10 17:49:15   
	 * @return: boolean      
	 * @throws
	 */
	public boolean checkHasActiveOrDunningAccount(long custId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append("SELECT COUNT(*) AS COUNT FROM {CM_CUST_ACCT_REL} M  WHERE 1=1 ");
		condition.append(" AND (M.EXT1='1' or M.EXT1='2') AND M.INSTALLMENT_FLAG=1 AND M.REL_CUST_ID = :custId AND  M.STATE = 'U'  ");
		parameter.put("custId", custId);
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainerInterface[] dc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		if (CmCommonUtil.isNotEmptyObject(dc)) {
			if (dc[0].getAsLong("COUNT") > 0) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 查询账户的详细信息
	 * @Title: queryAccountIdByCustRel   
	 * @Description: TODO(描述这个方法的作用)   
	 * @param: @param start
	 * @param: @param end
	 * @param: @param custId
	 * @param: @param acctIdList
	 * @param: @throws Exception   
	 * @author: YuJing    
	 * @date:   2020-10-14 14:38:18   
	 * @return: void      
	 * @throws
	 */
	private void queryAccountIdByCustRel(int start ,int end,long custId,List<Long> acctIdList) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCmCustAcctRelValue[] custAcctRelValue = 	accountSV.queryCustAcctRel(custId, -1, null, -1, -1, -1, null, start, end, "U", null);
		if(null!=custAcctRelValue&&custAcctRelValue.length>0) { 
			for (int i = 0; i < custAcctRelValue.length; i++) {
				if(custAcctRelValue[i].getExt1().equals("1")||custAcctRelValue[i].getExt1().equals("2")) {
					acctIdList.add(custAcctRelValue[i].getAcctId());
				}
			}
		}
	}

	public void dealIndivUserToGroupCust(long custId, long userId, long oldCustId, long orderId) throws Exception {
		// 生成用户新集团客户的归属关系
		dealCreateIndivCustomer(custId, userId, "N");
		// 删除用户与原个人客户的归属关系
		dealDeleteCustUserRel(oldCustId, userId);
		// 判断原客户下是否还有有效用户，没有则变更原客户为离网客户
		dealValidateUser(oldCustId, userId, orderId);
		// 与C3的交互
		dealCustToCustOfC3(oldCustId, custId, userId);
	}

	public void dealGroupUserToIndivCust(long custId, long userId, long oldCustId) throws Exception {
		// 生成用户与个人客户的归属关系
		dealCreateIndivCustomer(custId, userId, "N");
		// 删除用户与原集团客户的归属关系
		dealDeleteCustUserRel(oldCustId, userId);
		// 个人客户变更为在网客户
		ICustomerValue value = queryCustomerByCustId(custId);
		value.setCustStatus(CmConstants.CustomerStatus.INDIV_ACTIVE);
		saveCustomer(value);
		// 与C3的交互
		dealCustToCustOfC3(oldCustId, custId, userId);
	}

	public void dealGroupUserToGroupCust(long custId, long userId, long oldCustId) throws Exception {
		// 生成用户与新集团客户的归属关系
		dealCreateIndivCustomer(custId, userId, "N");
		// 删除用户与原集团客户的归属关系
		dealDeleteCustUserRel(oldCustId, userId);
		// 与C3的交互
		dealCustToCustOfC3(oldCustId, custId, userId);
	}

	public void deleteCmInsCmrel(long cmrelId, long custId) throws Exception {
		IBOCmInsCmrelValue value = queryCmInsByCmrelId(cmrelId, custId);
		if (CmCommonUtil.isNotEmptyObject(value)) {
			value.delete();
			saveCmInsCmrel(value);
		}
	}

	public void deleteCmInsCmrelByMemberCustId(long memberCustId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
		parameter.put("CUST_ID", memberCustId);
		IBOCmInsCmrelValue[] values = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, -1, -1);
		List<BOCmInsCmrelBean> list = new ArrayList<BOCmInsCmrelBean>();
		if (null != values && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				BOCmInsCmrelBean bean = new BOCmInsCmrelBean();
				bean.copy(values[0]);
				bean.delete();
				list.add(bean);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(list.toArray(new BOCmInsCmrelBean[0]));
		}
	}

	public void changeRequestStatusAndResults(long custId, long requestType, String requestResult) throws Exception {
		BOCmCustRequestTaskBean bean = new BOCmCustRequestTaskBean();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_RequestType).append(" =:requestType ");
		parameter.put("requestType", requestType);
		IBOCmCustRequestTaskValue[] values = (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class, condition.toString(),
				parameter, -1, -1);
		if (null != values && values.length > 0) {
			// 默认只有一条数据
			IBOCmCustRequestTaskValue value = values[0];
			value.setRequestStatus("F");
			value.setResults(requestResult);
			Date date = new Date();
			Timestamp effDate = com.ai.omframe.util.TimeUtil.getTruncDate(date);
			value.setStatusDate(effDate);
			String regionId = CmCommonUtil.getDefaultRegionId();
			value.setRegionId(regionId);
			bean.copy(value);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}
	}

	public void changeAddressId(long custId, long contMedTypeId, long addressId, Timestamp effDates) throws Exception {
		BOCmCustContactMediumBean bean = new BOCmCustContactMediumBean();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ContMedTypeId).append(" =:contMedTypeId ");
		parameter.put("contMedTypeId", contMedTypeId);
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (null != values && values.length > 0) {
			IBOCmCustContactMediumValue value = values[0];
			if (addressId != -1) {
				// 地址不一致时，以CPR为准覆盖本地地址
				if (value.getAddressId() != addressId) {
					value.setAddressId(addressId);
					IAddressSV sv = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
					address address = sv.getAddress(addressId, "012002002");
					if (address != null) {
						value.setAddressDetail(address.getAddrDesc());
					}
				}
			}
			value.setProtectEffDate(effDates);
			Timestamp endDate = com.ai.omframe.util.TimeUtil.convertStringToDate("299912310000", "yyyyMMddHHmm");
			value.setProtectExpDate(endDate);
			bean.copy(value);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}
	}

	public void updateCPRInfoToCustomer(long custId, String firstName, String lastName) throws Exception {
		BOCmIndivCustomerBean bean = new BOCmIndivCustomerBean();
		bean.setCustId(custId);
		IBOCmIndivCustomerValue value = (IBOCmIndivCustomerValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (null != value) {
			if (null != firstName && !"".equals(firstName)) {
				value.setFirstName(firstName.trim());
			}
			value.setMiddleName("");
			if (null != lastName && !"".equals(lastName)) {
				value.setLastName(lastName.trim());
			}
			bean.copy(value);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}
	}

	public IBOCmCustSegmentValue[] queryCustSegment(long upSegId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustSegmentValue.S_UpSegmentId).append(" =:upSegId ");
		parameter.put("upSegId", 1);
		return (IBOCmCustSegmentValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustSegmentBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOCmIndivCustomerValue[] queryCustomerByCPR(String cpr) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertType).append(" =:certType ");
		parameter.put("certType", CmConstants.CertificateType.CPR);
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertCode).append(" =:certCode ");
		parameter.put("certCode", cpr);
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_IndivCustType).append(" =:indivCustType ");
		parameter.put("indivCustType", CmConstants.roleType.customer);
		return (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOCmIndivCustomerValue[] queryCustomerByCPR(String cpr, int custType) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertType).append(" =:certType ");
		parameter.put("certType", CmConstants.CertificateType.CPR);
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertCode).append(" =:certCode ");
		parameter.put("certCode", cpr);
		if (custType > 0) {
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_IndivCustType).append(" =:indivCustType ");
			parameter.put("indivCustType", custType);
		}

		return (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOLnCmxGroupCustValue[] queryCmxGroupCustomer(int intervalDate) throws Exception {
		String sql = "SELECT A.CUST_ID,B.EXT28 FROM {CM_GROUP_CUSTOMER} A , {CMX_GROUP_CUSTOMER} B WHERE A.CUST_ID=B.CUST_ID AND A.CUST_STATUS=2 " +
				"AND A.STATE='U' AND B.EXT28 IS NOT NULL AND DATE_SUB(NOW(), INTERVAL :intervalDate DAY) > B.EXT28";
		Map parameter = new HashMap();
		parameter.put("intervalDate", intervalDate);
		sql = SplitTableFactory.createQuerySQL(sql, new HashMap());
		return (IBOLnCmxGroupCustValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOLnCmxGroupCustBean.class, sql, parameter);
	}

	public IBOCmxIndivCustomerValue[] queryCmxIndivCustomer(int intervalDate) throws Exception {
		String sql = "SELECT A.CUST_ID,B.EXT28 FROM {CM_INDIV_CUSTOMER} A , {CMX_INDIV_CUSTOMER} B WHERE A.CUST_ID=B.CUST_ID AND A.CUST_STATUS=2 " +
				"AND A.STATE='U' AND B.EXT28 IS NOT NULL AND DATE_SUB(NOW(), INTERVAL :intervalDate DAY) > B.EXT28";
		Map parameter = new HashMap();
		parameter.put("intervalDate", intervalDate);
		sql = SplitTableFactory.createQuerySQL(sql, new HashMap());
		return (IBOCmxIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmxIndivCustomerBean.class, sql, parameter);
	}

	public IBOCmGroupCustomerValue queryGroupCustomerInfo(long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupCustomerValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmGroupCustomerValue[] values = (IBOCmGroupCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupCustomerBean.class, condition.toString(),
				parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public IBOCmIndivCustomerValue queryIndivCustomerInfo(long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmIndivCustomerValue[] values = (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(),
				parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public IBOCmCustContactMediumValue queryCustContactMediumByCustIdAndType(long custId, String contMedTypeId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ContMedTypeId).append(" =:typeId ");
		parameter.put("typeId", contMedTypeId);
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public IBOCmCustContactMediumValue[] queryCustContactMediums(long custId, String contMedTypeId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ContMedTypeId).append(" =:typeId ");
		parameter.put("typeId", contMedTypeId);
		IBOCmCustContactMediumValue[] values = (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class,
				condition.toString(), parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values;
		}
		return new IBOCmCustContactMediumValue[0];
	}

	public IBOCmCustContMedTypeValue[] queryCmCustContMedType(String state) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContMedTypeValue.S_State).append(" =:state ");
		parameter.put("state", state);
		return (IBOCmCustContMedTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContMedTypeBean.class, condition.toString(), parameter, -1, -1);
	}

	public void saveCmFileSyncErrLog(IBOCmFileSyncErrLogValue cmFileSyncErrLogValue) throws Exception {
		if (null != cmFileSyncErrLogValue) {
			BOCmFileSyncErrLogBean bean = new BOCmFileSyncErrLogBean();
			bean.copy(cmFileSyncErrLogValue);
			long logId = CmCommonUtil.getNewSequence(BOCmFileSyncErrLogBean.class);
			bean.setLogId(logId);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}
	}

	@Override
	public IBOCmIndivCustomerValue[] queryCmCustByCustInfoAndAddress(String name, String birth, long addressId) throws Exception {
		StringBuilder condition = new StringBuilder("");
		HashMap parameter = new HashMap();
		condition.append("SELECT A.CUST_ID,A.PARTY_ID FROM {CM_INDIV_CUSTOMER} A,{CM_CUST_CONTACT_MEDIUM} B WHERE A.CUST_ID=B.CUST_ID AND A.INDIV_CUST_TYPE = 1 AND A.BIRTHDAY=DATE_FORMAT('");
		condition.append(birth).append("','%Y-%m-%d %H:%i:%s') AND BINARY(A.CUST_NAME_QRY) = BINARY(:name ) AND B.ADDRESS_ID=:addressId AND A.STATE=:state AND A.CUST_STATUS != 4 ");
		parameter.put("name", name.trim().toUpperCase());
		parameter.put("addressId", addressId);
		parameter.put("state", CmConstants.RecordState.USE);
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		return (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmIndivCustomerBean.class, sql, parameter);
	}

	@Override
	public IBOCmIndivCustomerValue[] queryCmCustByCustInfoAndAddress(String name, String birth, long addressId, int indivCustType) throws Exception {
		StringBuilder condition = new StringBuilder("");
		HashMap parameter = new HashMap();
		condition.append("SELECT A.CUST_ID,A.PARTY_ID,A.INDIV_CUST_TYPE FROM {CM_INDIV_CUSTOMER} A,{CM_CUST_CONTACT_MEDIUM} B WHERE A.CUST_ID=B.CUST_ID AND A.BIRTHDAY=DATE_FORMAT('");
		condition.append(birth).append("','%Y-%m-%d %H:%i:%s') AND BINARY(A.CUST_NAME_QRY) = BINARY(:name )  AND B.ADDRESS_ID=:addressId AND A.STATE=:state AND B.CONT_MED_TYPE_ID=:contType");
		if (indivCustType > 0) {
			condition.append(" AND A.INDIV_CUST_TYPE = ").append(":indivCustType ");
			parameter.put("indivCustType", indivCustType);
		}
		parameter.put("name", name.trim().toUpperCase());
		parameter.put("addressId", addressId);
		parameter.put("state", CmConstants.RecordState.USE);
		parameter.put("contType", CmConstants.AddressId.legalAddress);
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		return (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmIndivCustomerBean.class, sql, parameter);
	}

	@Override
	public IBOCmIndivCustomerValue[] queryCmCustByCustInfoByAddressDetail(String name, String birth, String addressDetail) throws Exception {
		StringBuilder condition = new StringBuilder("");
		HashMap parameter = new HashMap();
		condition.append("SELECT A.CUST_ID,A.PARTY_ID FROM {CM_INDIV_CUSTOMER} A,{CM_CUST_CONTACT_MEDIUM} B WHERE A.CUST_ID=B.CUST_ID AND A.INDIV_CUST_TYPE = 1 AND A.BIRTHDAY=DATE_FORMAT('");
		condition.append(birth).append("','%Y-%m-%d %H:%i:%s') AND BINARY(A.CUST_NAME_QRY) = BINARY(:name ) AND B.ADDRESS_DETAIL = :addressDetail AND A.STATE=:state AND A.CUST_STATUS != 4 ");
		parameter.put("name", name.trim().toUpperCase());
		parameter.put("addressDetail", addressDetail);
		parameter.put("state", CmConstants.RecordState.USE);
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		return (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmIndivCustomerBean.class, sql, parameter);
	}

	public IBOInterCallLogValue[] queryCprLogInfo(String xmlCondition, int startIndex, int endIndex) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		DataContainer container = dcs[0];
		String pnr = container.getAsString("PNR");
		String startTime = container.getAsString("START_TIME");
		String endTime = container.getAsString("END_TIME");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date end = f.parse(endTime);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(end);
		cal.add(5, 1);
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("PNR", pnr);
		paraMap.put("START_TIME", startTime);
		paraMap.put("END_TIME", endTime);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.CPR_LOG_QRY, "", paraMap, CmConstants.BusiLogType.CUSTOMER_LOG);
		IInterCallLogSV ics = (IInterCallLogSV) ServiceFactory.getService(IInterCallLogSV.class);
		IBOInterCallLogValue[] value = ics.getAllInterCallLogValuesByPNR(pnr, f.parse(startTime), cal.getTime(), startIndex, endIndex);
		if (value != null && value.length > 0) {
			return value;
		}
		return new IBOInterCallLogValue[0];
	}

	public void saveCustPreferTime(IBOCmPreferPeriodValue[] custPreferInfoValue) throws Exception {
		if (null != custPreferInfoValue && custPreferInfoValue.length > 0) {
			BOCmPreferPeriodBean bean = null;
			List<BOCmPreferPeriodBean> list = new ArrayList<BOCmPreferPeriodBean>();
			for (int i = 0; i < custPreferInfoValue.length; i++) {
				bean = new BOCmPreferPeriodBean();
				bean.copy(custPreferInfoValue[i]);
				list.add(bean);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) list.toArray(new BOCmPreferPeriodBean[0]));
		}
	}

	public void saveCustPreferChannel(IBOCmCustPreferChannelValue[] custPreferChannelValues) throws Exception {
		if (null != custPreferChannelValues && custPreferChannelValues.length > 0) {
			BOCmCustPreferChannelBean bean = null;
			List<BOCmCustPreferChannelBean> list = new ArrayList<BOCmCustPreferChannelBean>();
			for (int i = 0; i < custPreferChannelValues.length; i++) {
				bean = new BOCmCustPreferChannelBean();
				bean.copy(custPreferChannelValues[i]);
				list.add(bean);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) list.toArray(new BOCmCustPreferChannelBean[0]));
			// 保存业务记录
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.saveCommonBusiLog(CmConstants.BusiLogId.CUST_PREFER, (DataContainerInterface[]) list.toArray(new BOCmCustPreferChannelBean[0]),
					CmConstants.BusiLogType.CUSTOMER_LOG, custPreferChannelValues[0].getCustId());
		}
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustElectronicMediumForPageSele(long custId, int start, int end) throws Exception {
		IQBOCmCustContMediumAndTypeValue[] contMediums = queryCustElectronicMediumSele(custId, start, end);
		if (contMediums != null && contMediums.length > 0) {
			// 封装自定义字段
			String editor = "";
			String delete = "";
			for (int i = 0; i < contMediums.length; i++) {
				editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyElecAddress(" + String.valueOf(contMediums[i].getCustContRelaId()) + "," + i
						+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteElecAddress(\"" + String.valueOf(contMediums[i].getCustContRelaId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				contMediums[i].setAction(editor + delete);
				contMediums[i].setContMedTypeName(String.valueOf(contMediums[i].getContMedTypeId()));
				if (contMediums[i].getEmailAddress() == null) {
					contMediums[i].setEmailAddress(contMediums[i].getContNumber());
				}
			}
			return contMediums;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public int queryCustElectronicMediumCountSele(long custId) throws Exception {
		// 在mysql数据库下查询BO改造
		String sqlTemp = "";
		if (custId > 0) {
			sqlTemp = "SELECT T.CUST_CONT_RELA_ID, T.CUST_ID, T.CONT_MED_TYPE_ID, T.POSTAL_CODE, T.ADDRESS_ID, T.ADDRESS_CODE, T.ADDRESS_DETAIL, T.EMAIL_ADDRESS, T.FAX_NUMBER, T.CONT_NUMBER, T.IS_NO_DISTURBING, T.PRIORITY, T.PROTECT_EFF_DATE, T.PROTECT_EXP_DATE, T.STATE, T.CREATE_OP_ID, T.CREATE_ORG_ID, T.OP_ID, T.ORG_ID, T.DONE_CODE, T.CREATE_DATE, T.DONE_DATE, T.EFFECTIVE_DATE, T.EXPIRE_DATE, T.REGION_ID, T.REMARKS, T1.UP_CONT_MED_TYPE_ID, T1.CONT_MED_TYPE_NAME,T1.USE_TYPE FROM {CM_CUST_CONTACT_MEDIUM} T LEFT JOIN {CM_CUST_CONT_MED_TYPE} T1 ON T.CONT_MED_TYPE_ID = T1.CONT_MED_TYPE_ID WHERE 1=1  AND  T1.UP_CONT_MED_TYPE_ID != "
					+ CmDkConstants.CustContMedium.ADDRESS + "  AND  T.CUST_ID = " + custId + "   AND  T1.REMARKS =  '" + CmConstants.UseType.preferenceMedia + "' ";
		} else {
			sqlTemp = "SELECT T.CUST_CONT_RELA_ID, T.CUST_ID, T.CONT_MED_TYPE_ID, T.POSTAL_CODE, T.ADDRESS_ID, T.ADDRESS_CODE, T.ADDRESS_DETAIL, T.EMAIL_ADDRESS, T.FAX_NUMBER, T.CONT_NUMBER, T.IS_NO_DISTURBING, T.PRIORITY, T.PROTECT_EFF_DATE, T.PROTECT_EXP_DATE, T.STATE, T.CREATE_OP_ID, T.CREATE_ORG_ID, T.OP_ID, T.ORG_ID, T.DONE_CODE, T.CREATE_DATE, T.DONE_DATE, T.EFFECTIVE_DATE, T.EXPIRE_DATE, T.REGION_ID, T.REMARKS, T1.UP_CONT_MED_TYPE_ID, T1.CONT_MED_TYPE_NAME,T1.USE_TYPE FROM {CM_CUST_CONTACT_MEDIUM} T LEFT JOIN {CM_CUST_CONT_MED_TYPE} T1 ON T.CONT_MED_TYPE_ID = T1.CONT_MED_TYPE_ID WHERE 1=1  AND  T1.UP_CONT_MED_TYPE_ID != "
					+ CmDkConstants.CustContMedium.ADDRESS + "  AND  T1.REMARKS =  '" + CmConstants.UseType.preferenceMedia + "' ";
		}
		String sql = CmLnCommonUtil.getQueryCount(sqlTemp, null, null);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, null);
		return inter[0].getAsInt("CNT");
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustElectronicMediumSele(long custId, int start, int end) throws Exception {
		Map paraMap = new HashMap();
		String sqlTemp = "";
		if (custId > 0) {
			sqlTemp = "SELECT T.CUST_CONT_RELA_ID, T.CUST_ID, T.CONT_MED_TYPE_ID, T.POSTAL_CODE, T.ADDRESS_ID, T.ADDRESS_CODE, T.ADDRESS_DETAIL, T.EMAIL_ADDRESS, T.FAX_NUMBER, T.CONT_NUMBER, T.IS_NO_DISTURBING, T.PRIORITY, T.PROTECT_EFF_DATE, T.PROTECT_EXP_DATE, T.STATE, T.CREATE_OP_ID, T.CREATE_ORG_ID, T.OP_ID, T.ORG_ID, T.DONE_CODE, T.CREATE_DATE, T.DONE_DATE, T.EFFECTIVE_DATE, T.EXPIRE_DATE, T.REGION_ID, T.REMARKS, T1.UP_CONT_MED_TYPE_ID, T1.CONT_MED_TYPE_NAME,T1.USE_TYPE FROM {CM_CUST_CONTACT_MEDIUM} T LEFT JOIN {CM_CUST_CONT_MED_TYPE} T1 ON T.CONT_MED_TYPE_ID = T1.CONT_MED_TYPE_ID WHERE 1=1  AND  T1.UP_CONT_MED_TYPE_ID != "
					+ CmDkConstants.CustContMedium.ADDRESS + "  AND  T.CUST_ID = " + custId + "   AND  T1.REMARKS =  '" + CmConstants.UseType.preferenceMedia + "' ";
		} else {
			sqlTemp = "SELECT T.CUST_CONT_RELA_ID, T.CUST_ID, T.CONT_MED_TYPE_ID, T.POSTAL_CODE, T.ADDRESS_ID, T.ADDRESS_CODE, T.ADDRESS_DETAIL, T.EMAIL_ADDRESS, T.FAX_NUMBER, T.CONT_NUMBER, T.IS_NO_DISTURBING, T.PRIORITY, T.PROTECT_EFF_DATE, T.PROTECT_EXP_DATE, T.STATE, T.CREATE_OP_ID, T.CREATE_ORG_ID, T.OP_ID, T.ORG_ID, T.DONE_CODE, T.CREATE_DATE, T.DONE_DATE, T.EFFECTIVE_DATE, T.EXPIRE_DATE, T.REGION_ID, T.REMARKS, T1.UP_CONT_MED_TYPE_ID, T1.CONT_MED_TYPE_NAME,T1.USE_TYPE FROM {CM_CUST_CONTACT_MEDIUM} T LEFT JOIN {CM_CUST_CONT_MED_TYPE} T1 ON T.CONT_MED_TYPE_ID = T1.CONT_MED_TYPE_ID WHERE 1=1  AND  T1.UP_CONT_MED_TYPE_ID != "
					+ CmDkConstants.CustContMedium.ADDRESS + "  AND  T1.REMARKS =  '" + CmConstants.UseType.preferenceMedia + "' ";
		}
		// 在mysql数据库下查询BO改造
		String sql = CmLnCommonUtil.getQueryResult(sqlTemp, null, start, end, null);
		IQBOCmCustContMediumAndTypeValue[] results = (IQBOCmCustContMediumAndTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmCustContMediumAndTypeBean.class, sql, paraMap);

		if (results != null && results.length > 0) {
			return results;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public int queryCprLogInfoCount(String xmlCondition) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		DataContainer container = dcs[0];
		String pnr = container.getAsString("PNR");
		String startTime = container.getAsString("START_TIME");
		String endTime = container.getAsString("END_TIME");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		IInterCallLogSV ics = (IInterCallLogSV) ServiceFactory.getService(IInterCallLogSV.class);
		int count = ics.getAllInterCallLogCountsByPNR(pnr, f.parse(startTime), f.parse(endTime));
		return count;
	}

	public int queryCmInsCmrelCount(long custId) throws Exception {
		return queryCmInsCmrel(custId, -1, -1).length;
	}

	public IBOCmIndivCustomerValue[] queryIndivCust(String custName, String certCode, String custId, int startIndex, int endIndex) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		if (StringUtils.isNotBlank(custName) && !("-1").equals(custName)) {
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustName).append(" like :custName ");
			parameter.put("custName", "%" + custName + "%");
		}
		if (StringUtils.isNotBlank(certCode) && !("-1").equals(certCode)) {
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustCertCode).append(" =:certCode ");
			parameter.put("certCode", certCode);
		}
		if (StringUtils.isNotBlank(custId) && !("-1").equals(custId)) {
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}

		return (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(), parameter, startIndex, endIndex);
	}

	public int queryIndivCustCount(String custName, String certCode, String custId) throws Exception {
		return queryIndivCust(custName, certCode, custId, -1, -1).length;
	}

	/**
	 * 查询集团行业
	 */
	public IBOCmGroupRelIndustryValue[] queryGroupIndustryForPage(long custId, int start, int end) throws Exception {
		if (custId > 0) {
			StringBuilder condition = new StringBuilder();
			Map paraMap = new HashMap();
			condition.append(IBOCmGroupRelIndustryValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", custId);
			DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupRelIndustryBean.class, condition.toString(), paraMap, start, end);
			List<IBOCmGroupRelIndustryValue> lstValues = null;
			if (CmCommonUtil.isNotEmptyObject(dcs)) {
				lstValues = new ArrayList<IBOCmGroupRelIndustryValue>();
				// 封装自定义字段
				String editor = "";
				String delete = "";
				for (int i = 0; i < dcs.length; i++) {
					BOCmGroupRelIndustryBean bean = new BOCmGroupRelIndustryBean();
					bean.copy(dcs[i]);
					editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyGroupIndustry(" + String.valueOf(bean.getRelId()) + "," + i
							+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
					delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteGroupIndustry(\"" + String.valueOf(bean.getRelId())
							+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
					bean.setAction(editor + delete);
					String industryId = bean.getIndustryId();
					String industryId4 = (String) CacheFactory.get(CmIndustryCacheImpl.class, industryId + CmIndustryCacheImpl.SPLIT_CODE + CmConstants.IndustryLevel.LEVEL_5);
					String industryId3 = (String) CacheFactory.get(CmIndustryCacheImpl.class, industryId4 + CmIndustryCacheImpl.SPLIT_CODE + CmConstants.IndustryLevel.LEVEL_4);
					String industryId2 = (String) CacheFactory.get(CmIndustryCacheImpl.class, industryId3 + CmIndustryCacheImpl.SPLIT_CODE + CmConstants.IndustryLevel.LEVEL_3);
					String industryId1 = (String) CacheFactory.get(CmIndustryCacheImpl.class, industryId2 + CmIndustryCacheImpl.SPLIT_CODE + CmConstants.IndustryLevel.LEVEL_2);
					// 行业类型ID转换成名称返回界面
					bean.setIndustryId4((String) CacheFactory.get(CmIndustryCacheImpl.class, industryId4));
					bean.setIndustryId3((String) CacheFactory.get(CmIndustryCacheImpl.class, industryId3));
					bean.setIndustryId2((String) CacheFactory.get(CmIndustryCacheImpl.class, industryId2));
					bean.setIndustryId1(industryId1);
					bean.setIndustryId((String) CacheFactory.get(CmIndustryCacheImpl.class, industryId));
					lstValues.add(bean);
				}
				return lstValues.toArray(new IBOCmGroupRelIndustryValue[0]);
			}
		} else {
			ExceptionUtil.throwBusinessException("CMS0089019");// 客户编码不能为空
		}

		return new IBOCmGroupRelIndustryValue[0];
	}

	public int queryGroupIndustryCount(long custId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		if (custId > 0) {
			condition.append(IBOCmGroupRelIndustryValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", Long.valueOf(custId));
		}

		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicCountSqlByConds(BOCmGroupRelIndustryBean.class, condition.toString(), paraMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		return inter[0].getAsInt("CNT");
	}

	public IBOCmContactContMediumValue[] queryContactContMedium(long custContId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap<String, Object> paraMap = new HashMap<String, Object>();
		condition.append(IBOCmContactContMediumValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		condition.append(IBOCmContactContMediumValue.S_UseType).append(" = :useType ");
		paraMap.put("useType", CmConstants.UseType.contactMediumUse);
		String sqlNew = "";
		if (custContId > 0) {
			sqlNew = "select * from (select t.* from ( SELECT T4.RELA_ID, T4.CUST_CONT_ID, T4.CONT_RELA_ID, T4.CONT_ID, T4.CONT_MED_TYPE_ID, T4.POSTAL_CODE, T4.ADDRESS_ID, T4.ADDRESS_CODE, T4.ADDRESS_DETAIL, T4.EMAIL_ADDRESS, T4.FAX_NUMBER, T4.CONT_NUMBER, T4.IS_NO_DISTURBING, T4.PRIORITY, T4.PROTECT_EFF_DATE, T4.PROTECT_EXP_DATE, T4.STATE, T4.CREATE_OP_ID, T4.CREATE_ORG_ID, T4.OP_ID, T4.ORG_ID, T4.DONE_CODE, T4.CREATE_DATE, T4.DONE_DATE, T4.EFFECTIVE_DATE, T4.EXPIRE_DATE, T4.REGION_ID, T4.REMARKS, T3.UP_CONT_MED_TYPE_ID, T3.CONT_MED_TYPE_NAME, T3.USE_TYPE FROM (SELECT T1.RELA_ID, T1.CUST_CONT_ID, T1.CONT_RELA_ID, T2.CONT_ID, T2.CONT_MED_TYPE_ID, T2.POSTAL_CODE, T2.ADDRESS_ID, T2.ADDRESS_CODE, T2.ADDRESS_DETAIL, T2.EMAIL_ADDRESS, T2.FAX_NUMBER, T2.CONT_NUMBER, T2.IS_NO_DISTURBING, T2.PRIORITY, T2.PROTECT_EFF_DATE, T2.PROTECT_EXP_DATE, T2.STATE, T2.CREATE_OP_ID, T2.CREATE_ORG_ID, T2.OP_ID, T2.ORG_ID, T2.DONE_CODE, T2.CREATE_DATE, T2.DONE_DATE, T2.EFFECTIVE_DATE, T2.EXPIRE_DATE, T2.REGION_ID, T2.REMARKS FROM {CM_CONTACT_MEDIUM_REL} T1, {CM_CONTACT_CONT_MEDIUM} T2 WHERE T1.CONT_RELA_ID = T2.CONT_RELA_ID) T4 LEFT JOIN {CM_CUST_CONT_MED_TYPE} T3 ON T4.CONT_MED_TYPE_ID = T3.CONT_MED_TYPE_ID ) t where 1=1 AND t.UP_CONT_MED_TYPE_ID != "
					+ CmDkConstants.CustContMedium.ADDRESS + "  AND  t.CUST_CONT_ID = " + custContId + ") k where 1=1";
		} else {
			sqlNew = "select * from (select t.* from ( SELECT T4.RELA_ID, T4.CUST_CONT_ID, T4.CONT_RELA_ID, T4.CONT_ID, T4.CONT_MED_TYPE_ID, T4.POSTAL_CODE, T4.ADDRESS_ID, T4.ADDRESS_CODE, T4.ADDRESS_DETAIL, T4.EMAIL_ADDRESS, T4.FAX_NUMBER, T4.CONT_NUMBER, T4.IS_NO_DISTURBING, T4.PRIORITY, T4.PROTECT_EFF_DATE, T4.PROTECT_EXP_DATE, T4.STATE, T4.CREATE_OP_ID, T4.CREATE_ORG_ID, T4.OP_ID, T4.ORG_ID, T4.DONE_CODE, T4.CREATE_DATE, T4.DONE_DATE, T4.EFFECTIVE_DATE, T4.EXPIRE_DATE, T4.REGION_ID, T4.REMARKS, T3.UP_CONT_MED_TYPE_ID, T3.CONT_MED_TYPE_NAME, T3.USE_TYPE FROM (SELECT T1.RELA_ID, T1.CUST_CONT_ID, T1.CONT_RELA_ID, T2.CONT_ID, T2.CONT_MED_TYPE_ID, T2.POSTAL_CODE, T2.ADDRESS_ID, T2.ADDRESS_CODE, T2.ADDRESS_DETAIL, T2.EMAIL_ADDRESS, T2.FAX_NUMBER, T2.CONT_NUMBER, T2.IS_NO_DISTURBING, T2.PRIORITY, T2.PROTECT_EFF_DATE, T2.PROTECT_EXP_DATE, T2.STATE, T2.CREATE_OP_ID, T2.CREATE_ORG_ID, T2.OP_ID, T2.ORG_ID, T2.DONE_CODE, T2.CREATE_DATE, T2.DONE_DATE, T2.EFFECTIVE_DATE, T2.EXPIRE_DATE, T2.REGION_ID, T2.REMARKS FROM {CM_CONTACT_MEDIUM_REL} T1, {CM_CONTACT_CONT_MEDIUM} T2 WHERE T1.CONT_RELA_ID = T2.CONT_RELA_ID) T4 LEFT JOIN {CM_CUST_CONT_MED_TYPE} T3 ON T4.CONT_MED_TYPE_ID = T3.CONT_MED_TYPE_ID ) t where 1=1 AND t.UP_CONT_MED_TYPE_ID != "
					+ CmDkConstants.CustContMedium.ADDRESS + ") k where 1=1";
		}

		sqlNew = CmLnCommonUtil.getQueryResult(sqlNew, null, start, end, null);
		IBOCmContactContMediumValue[] results = (IBOCmContactContMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmContactContMediumBean.class, sqlNew,
				paraMap);

		if (results != null && results.length > 0) {
			return results;
		}
		return new IBOCmContactContMediumValue[0];
	}

	public IBOCmContactContMediumValue[] queryContactContMediumForPage(long custContId, int start, int end) throws Exception {
		IBOCmContactContMediumValue[] mediums = queryContactContMedium(custContId, start, end);
		if (null != mediums && mediums.length > 0) {
			String delete = "";
			for (int i = 0; i < mediums.length; i++) {
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteContactContMediumRela(\"" + String.valueOf(mediums[i].getRelaId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				mediums[i].setAction(delete);
				mediums[i].setContMedTypeName(String.valueOf(mediums[i].getContMedTypeId()));
				if (mediums[i].getEmailAddress() == null) {
					mediums[i].setEmailAddress(mediums[i].getContNumber());
				}
			}
			return mediums;
		}

		return new IBOCmContactContMediumValue[0];
	}

	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfo(long contId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmContactContMediumInfoValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		if (contId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmContactContMediumInfoValue.S_ContId).append(" = :contId ");
			paraMap.put("contId", Long.valueOf(contId));
		}

		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmContactContMediumInfoBean.class, condition.toString(), paraMap, start, end);
		IQBOCmContactContMediumInfoValue[] contMediums = (IQBOCmContactContMediumInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmContactContMediumInfoBean.class, sql, paraMap);
		if (null != contMediums && contMediums.length > 0) {
			return contMediums;
		}
		return new IQBOCmContactContMediumInfoValue[0];
	}
	
    /**
     * 根据contId ，useType 查询联系媒介
     */
	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoByContIdAndUseType(long contId, long useType ,int start, int end) throws Exception{
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmContactContMediumInfoValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		if (contId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmContactContMediumInfoValue.S_ContId).append(" = :contId ");
			paraMap.put("contId", Long.valueOf(contId));
		}
		
		if(useType>0){
			condition.append(" AND ");
			condition.append(IQBOCmContactContMedAndMedTypeValue.S_UseType).append(" = :useType ");
			paraMap.put("useType", Long.valueOf(useType));
		}
		
		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmContactContMediumInfoBean.class, condition.toString(), paraMap, start, end);
		IQBOCmContactContMediumInfoValue[] contMediums = (IQBOCmContactContMediumInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmContactContMediumInfoBean.class, sql, paraMap);
		if (null != contMediums && contMediums.length > 0) {
			return contMediums;
		}
		return new IQBOCmContactContMediumInfoValue[0];
	}
	
	/**
	 * 按Contid查询并按prority 排序
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-10-3
	* CmCustomerSVImpl
	 */
	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoByContId(long contId,long mediumTypeId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmContactContMediumInfoValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		if (contId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmContactContMediumInfoValue.S_ContId).append(" = :contId ");
			paraMap.put("contId", Long.valueOf(contId));
		}
		
		if(mediumTypeId>0){
			condition.append(" AND  t.");
			condition.append(IQBOCmContactContMediumInfoValue.S_ContMedTypeId).append(" = '").append(mediumTypeId).append("' ");
		}
		
		condition.append(" order by ").append(IQBOCmContactContMediumInfoValue.S_Priority);
		
		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmContactContMediumInfoBean.class, condition.toString(), paraMap, start, end);
		IQBOCmContactContMediumInfoValue[] contMediums = (IQBOCmContactContMediumInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmContactContMediumInfoBean.class, sql, paraMap);
		if (null != contMediums && contMediums.length > 0) {
			return contMediums;
		}
		return new IQBOCmContactContMediumInfoValue[0];
	}

	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoForPage(long contId, int start, int end) throws Exception {
		IQBOCmContactContMediumInfoValue[] mediums = queryContactContMediumInfo(contId, start, end);
		if (null != mediums && mediums.length > 0) {
			String editor = "";
			String delete = "";
			for (int i = 0; i < mediums.length; i++) {
				editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyContactContMedium(" + String.valueOf(mediums[i].getContRelaId()) + "," + i
						+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteContactContMedium(\"" + String.valueOf(mediums[i].getContRelaId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				mediums[i].setAction(editor + delete);
				mediums[i].setContMedTypeName(String.valueOf(mediums[i].getContMedTypeId()));
				if (mediums[i].getEmailAddress() == null) {
					mediums[i].setEmailAddress(mediums[i].getContNumber());
				}
			}
			return mediums;
		}

		return new IQBOCmContactContMediumInfoValue[0];
	}
	 	
	public IQBOCmContactContMediumInfoValue[] queryContactContMediumInfoByContIdAndUseTypeForPage(long contId, long useType ,int start, int end) throws Exception {
		IQBOCmContactContMediumInfoValue[] mediums = queryContactContMediumInfoByContIdAndUseType(contId,useType, start, end);
		if (null != mediums && mediums.length > 0) {
			String editor = "";
			String delete = "";
			for (int i = 0; i < mediums.length; i++) {
				editor = "<a href='javascript:void(0)' class='cellpath' onclick='modifyContactContMedium(" + String.valueOf(mediums[i].getContRelaId()) + "," + i
						+ ")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013081") + "</a>";
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteContactContMedium(\"" + String.valueOf(mediums[i].getContRelaId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				mediums[i].setAction(editor + delete);
				mediums[i].setContMedTypeName(String.valueOf(mediums[i].getContMedTypeId()));
				if (mediums[i].getEmailAddress() == null) {
					mediums[i].setEmailAddress(mediums[i].getContNumber());
				}
			}
			return mediums;
		}
		
		return new IQBOCmContactContMediumInfoValue[0];
	}

	public int queryContactContMediumCount(long custContId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IBOCmContactContMediumValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		String sqlNew = "";
		if (custContId > 0) {
			sqlNew = "select count(*) as CNT from (select t.* from ( SELECT T4.RELA_ID, T4.CUST_CONT_ID, T4.CONT_RELA_ID, T4.CONT_ID, T4.CONT_MED_TYPE_ID, T4.POSTAL_CODE, T4.ADDRESS_ID, T4.ADDRESS_CODE, T4.ADDRESS_DETAIL, T4.EMAIL_ADDRESS, T4.FAX_NUMBER, T4.CONT_NUMBER, T4.IS_NO_DISTURBING, T4.PRIORITY, T4.PROTECT_EFF_DATE, T4.PROTECT_EXP_DATE, T4.STATE, T4.CREATE_OP_ID, T4.CREATE_ORG_ID, T4.OP_ID, T4.ORG_ID, T4.DONE_CODE, T4.CREATE_DATE, T4.DONE_DATE, T4.EFFECTIVE_DATE, T4.EXPIRE_DATE, T4.REGION_ID, T4.REMARKS, T3.UP_CONT_MED_TYPE_ID, T3.CONT_MED_TYPE_NAME, T3.USE_TYPE FROM (SELECT T1.RELA_ID, T1.CUST_CONT_ID, T1.CONT_RELA_ID, T2.CONT_ID, T2.CONT_MED_TYPE_ID, T2.POSTAL_CODE, T2.ADDRESS_ID, T2.ADDRESS_CODE, T2.ADDRESS_DETAIL, T2.EMAIL_ADDRESS, T2.FAX_NUMBER, T2.CONT_NUMBER, T2.IS_NO_DISTURBING, T2.PRIORITY, T2.PROTECT_EFF_DATE, T2.PROTECT_EXP_DATE, T2.STATE, T2.CREATE_OP_ID, T2.CREATE_ORG_ID, T2.OP_ID, T2.ORG_ID, T2.DONE_CODE, T2.CREATE_DATE, T2.DONE_DATE, T2.EFFECTIVE_DATE, T2.EXPIRE_DATE, T2.REGION_ID, T2.REMARKS FROM {CM_CONTACT_MEDIUM_REL} T1, {CM_CONTACT_CONT_MEDIUM} T2 WHERE T1.CONT_RELA_ID = T2.CONT_RELA_ID) T4 LEFT JOIN {CM_CUST_CONT_MED_TYPE} T3 ON T4.CONT_MED_TYPE_ID = T3.CONT_MED_TYPE_ID ) t where 1=1  AND  t.UP_CONT_MED_TYPE_ID != "
					+ CmDkConstants.CustContMedium.ADDRESS + "  AND  t.CUST_CONT_ID = " + custContId + " ) K";
		} else {
			sqlNew = "select count(*) as CNT from (select t.* from ( SELECT T4.RELA_ID, T4.CUST_CONT_ID, T4.CONT_RELA_ID, T4.CONT_ID, T4.CONT_MED_TYPE_ID, T4.POSTAL_CODE, T4.ADDRESS_ID, T4.ADDRESS_CODE, T4.ADDRESS_DETAIL, T4.EMAIL_ADDRESS, T4.FAX_NUMBER, T4.CONT_NUMBER, T4.IS_NO_DISTURBING, T4.PRIORITY, T4.PROTECT_EFF_DATE, T4.PROTECT_EXP_DATE, T4.STATE, T4.CREATE_OP_ID, T4.CREATE_ORG_ID, T4.OP_ID, T4.ORG_ID, T4.DONE_CODE, T4.CREATE_DATE, T4.DONE_DATE, T4.EFFECTIVE_DATE, T4.EXPIRE_DATE, T4.REGION_ID, T4.REMARKS, T3.UP_CONT_MED_TYPE_ID, T3.CONT_MED_TYPE_NAME, T3.USE_TYPE FROM (SELECT T1.RELA_ID, T1.CUST_CONT_ID, T1.CONT_RELA_ID, T2.CONT_ID, T2.CONT_MED_TYPE_ID, T2.POSTAL_CODE, T2.ADDRESS_ID, T2.ADDRESS_CODE, T2.ADDRESS_DETAIL, T2.EMAIL_ADDRESS, T2.FAX_NUMBER, T2.CONT_NUMBER, T2.IS_NO_DISTURBING, T2.PRIORITY, T2.PROTECT_EFF_DATE, T2.PROTECT_EXP_DATE, T2.STATE, T2.CREATE_OP_ID, T2.CREATE_ORG_ID, T2.OP_ID, T2.ORG_ID, T2.DONE_CODE, T2.CREATE_DATE, T2.DONE_DATE, T2.EFFECTIVE_DATE, T2.EXPIRE_DATE, T2.REGION_ID, T2.REMARKS FROM {CM_CONTACT_MEDIUM_REL} T1, {CM_CONTACT_CONT_MEDIUM} T2 WHERE T1.CONT_RELA_ID = T2.CONT_RELA_ID) T4 LEFT JOIN {CM_CUST_CONT_MED_TYPE} T3 ON T4.CONT_MED_TYPE_ID = T3.CONT_MED_TYPE_ID ) t where 1=1  AND  t.UP_CONT_MED_TYPE_ID != "
					+ CmDkConstants.CustContMedium.ADDRESS + " ) K";
		}
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sqlNew, null);
		return inter[0].getAsInt("CNT");
	}

	public int queryContactContMediumInfoCount(long contId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmContactContMediumInfoValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		if (contId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmContactContMediumInfoValue.S_ContId).append(" = :contId ");
			paraMap.put("contId", Long.valueOf(contId));
		}

		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicCountSqlByConds(QBOCmContactContMediumInfoBean.class, condition.toString(), paraMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		return inter[0].getAsInt("CNT");
	}
	
	public int queryContactContMediumInfoCountByContIdAndUseType(long contId,long useType) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmContactContMediumInfoValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		if (contId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmContactContMediumInfoValue.S_ContId).append(" = :contId ");
			paraMap.put("contId", Long.valueOf(contId));
		}
		
		if(useType>0){
			condition.append(" AND ");
			condition.append(IQBOCmContactContMedAndMedTypeValue.S_UseType).append(" = :useType ");
			paraMap.put("useType", Long.valueOf(useType));
		}
		
		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicCountSqlByConds(QBOCmContactContMediumInfoBean.class, condition.toString(), paraMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		return inter[0].getAsInt("CNT");
	}

	public void saveContactContMedium(BOCmContactContMediumPojoBean[] contactContMedium) throws Exception {
 		if (null != contactContMedium && contactContMedium.length > 0) {
			// 做优先级重复处理
			Map map = new HashMap();
			for (BOCmContactContMediumPojoBean value : contactContMedium) {
				map.put(value.getContRelaId(), value);
			}
			// 查询出已有的联系媒介加入到map中
			IBOCmContactContMediumPojoValue[] values = queryContactContMedium(contactContMedium[0].getContId());
			if (CmCommonUtil.isNotEmptyObject(values)) {
				for (IBOCmContactContMediumPojoValue value : values) {
					if (!(map.containsKey(value.getContRelaId()))) {
						map.put(value.getContRelaId(), value);
					}
				}
			}
			// 看是否有相同的优先级
			Set set = new HashSet();
			Set<Long> keys = map.keySet();
			for (long value : keys) {
				set.add(((IBOCmContactContMediumPojoValue) map.get(value)).getPriority());
			}
			if (map.size() != set.size()) {
				ExceptionUtil.throwBusinessException("CMS0013245");
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactContMedium);
		}

	}

	private IBOCmContactContMediumPojoValue[] queryContactContMedium(long contId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmContactContMediumPojoValue.S_ContId).append(" =:contId ");
		parameter.put("contId", contId);
		return (IBOCmContactContMediumPojoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmContactContMediumPojoBean.class, condition.toString(), parameter, -1, -1);
	}

	public void saveContactMediumRel(BOCmContactMediumRelBean[] contactMediumRel) throws Exception {
		if (null != contactMediumRel && contactMediumRel.length > 0) {
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(contactMediumRel);
		}

	}

	public IBOCmContactMediumRelValue[] queryContactMediumRel(long custContId, long contRelaId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (custContId > 0) {
			condition.append(" AND ").append(IBOCmContactMediumRelValue.S_CustContId).append(" = :custContId ");
			parameter.put("custContId", custContId);
		}

		if (contRelaId > 0) {
			condition.append(" AND ").append(IBOCmContactMediumRelValue.S_ContRelaId).append(" = :contRelaId ");
			parameter.put("contRelaId", contRelaId);
		}
		IBOCmContactMediumRelValue[] contactMediumRel = (IBOCmContactMediumRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmContactMediumRelBean.class,
				condition.toString(), parameter, -1, -1);

		if (!CmCommonUtil.isEmptyObject(contactMediumRel)) {
			return contactMediumRel;
		}
		return new IBOCmContactMediumRelValue[0];
	}

	public IBOCmGroupContactValue[] queryCustContId(long partyId, long contId, long custId, int contType) throws Exception {
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

		if (contType > 0) {
			condition.append(" AND ").append(IBOCmGroupContactValue.S_ContType).append(" = :contType ");
			parameter.put("contType", contType);
		}

		IBOCmGroupContactValue[] groupContacts = (IBOCmGroupContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupContactBean.class, condition.toString(),
				parameter, -1, -1);

		if (!CmCommonUtil.isEmptyObject(groupContacts)) {
			return groupContacts;
		}
		return new IBOCmGroupContactValue[0];
	}
	
	public IBOCmGroupContactValue[] queryCustContIdForPage(long partyId, long contId, long custId, int contType,int startNum, int endNum) throws Exception {
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
		
		if (contType > 0) {
			condition.append(" AND ").append(IBOCmGroupContactValue.S_ContType).append(" = :contType ");
			parameter.put("contType", contType);
		}
		
		IBOCmGroupContactValue[] groupContacts = (IBOCmGroupContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupContactBean.class, condition.toString(),
				parameter, startNum, endNum);
		
		if (!CmCommonUtil.isEmptyObject(groupContacts)) {
			return groupContacts;
		}
		return new IBOCmGroupContactValue[0];
	}

	public IBOCmContactContMediumPojoValue[] queryPriority(long medType, int priority, long contId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (medType > 0) {
			condition.append(" AND ").append(IBOCmContactContMediumPojoValue.S_ContMedTypeId).append(" = :medType ");
			parameter.put("medType", medType);
		}
		if (priority > 0) {
			condition.append(" AND ").append(IBOCmContactContMediumPojoValue.S_Priority).append(" = :priority ");
			parameter.put("priority", priority);
		}
		if (contId > 0) {
			condition.append(" AND ").append(IBOCmContactContMediumPojoValue.S_ContId).append(" = :contId ");
			parameter.put("contId", contId);
		}
		IBOCmContactContMediumPojoValue[] prioritys = (IBOCmContactContMediumPojoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmContactContMediumPojoBean.class,
				condition.toString(), parameter, -1, -1);

		if (!CmCommonUtil.isEmptyObject(prioritys)) {
			return prioritys;
		}
		return new IBOCmContactContMediumPojoValue[0];
	}

	public IQBOCmContactContMedAndMedTypeValue queryCustMedium(long contRelId, long contMedTypeId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IQBOCmContactContMedAndMedTypeValue.S_UpContMedTypeId).append(" != :upContMedTypeId ");
		paraMap.put("upContMedTypeId", CmDkConstants.CustContMedium.ADDRESS);
		if (contRelId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmContactContMedAndMedTypeValue.S_ContRelaId).append(" = :contRelId ");
			paraMap.put("contRelId", Long.valueOf(contRelId));
		}
		if (contMedTypeId > 0) {
			condition.append(" AND ");
			condition.append(IQBOCmContactContMedAndMedTypeValue.S_ContMedTypeId).append(" = :contMedTypeId ");
			paraMap.put("contMedTypeId", Long.valueOf(contMedTypeId));
		}
		// 在mysql数据库下查询BO改造
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmContactContMedAndMedTypeBean.class, condition.toString(), paraMap, -1, -1);
		IQBOCmContactContMedAndMedTypeValue[] results = (IQBOCmContactContMedAndMedTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				QBOCmContactContMedAndMedTypeBean.class, sql, paraMap);

		if (results != null && results.length > 0) {
			return results[0];
		}
		return null;
	}

	public ICustomerValue queryDKCustomer(long custId) throws Exception {
		if (custId > 0) {
			StringBuilder condition = new StringBuilder(" 1=1 ");
			HashMap parameter = new HashMap();
			ICustomerValue custValue = new CustomerBean();
			if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
				condition.append(" AND ").append(IBOCmIndivCustomerValue.S_CustId).append(" =:custId ");
				parameter.put("custId", custId);
				IBOCmIndivCustomerValue[] value = (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(),
						parameter, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(value)) {
					custValue.copy(value[0]);
					custValue.initProperty("CUST_TYPE", CmCommonUtil.getCustType(custId));
					return custValue;
				} else {
					return null;
				}
			} else {
				condition.append(" AND ").append(BOCmGroupCustomerBean.S_CustId).append(" =:custId ");
				parameter.put("custId", custId);
				IBOCmGroupCustomerValue[] value = (IBOCmGroupCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupCustomerBean.class, condition.toString(),
						parameter, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(value)) {
					custValue.copy(value[0]);
					custValue.initProperty("CUST_TYPE", CmCommonUtil.getCustType(custId));
					return custValue;
				} else {
					return null;
				}
			}
		}
		return null;
	}

	public void dealCustBadRecordInfo(IBOCmCustBadRecordValue value, String type) throws Exception {
		BOCmCustBadRecordBean recordValue = new BOCmCustBadRecordBean();
		String beskedId = value.getBeskedId();
		String custId = value.getCustId() + "";
		if (("7").equals(type)) {
			// 新增
			recordValue.copy(value);
			recordValue.setState(CmConstants.RecordState.USE);
			recordValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			try {
				CmInnerServiceFactory.getCommonInnerSV().saveBean(recordValue);
			} catch (Exception e) {
				// AI-12482 AKS issue：Duplicate entry '7798265-21210803703948' for key 'PRIMARY'
				// using the AKS WebServiceCall “RKI.Effekturet” trigger a receipt to Experian confirming that we have received this record – so Experian no longer should send is to us
				if (Objects.nonNull(e) && StringUtils.isNotEmpty(e.getMessage()) && e.getMessage().contains("Duplicate entry")) {
					AKSopenClient aks = new AKSopenClient();
					Map inputMap = new HashMap();
					inputMap.put("Referencenummer", custId);
					inputMap.put("BeskedId", beskedId);
					log.info("Duplicate entry abnormal scene transfer RKI.Effekturet, inputMap:" + inputMap);
					Map map = aks.effektueret(inputMap);
					log.info("Duplicate entry abnormal scene transfer RKI.Effekturet, outputMap:" + map);
					if (map != null && !map.isEmpty()) {
						String effektueretOk = DataType.getAsString(map.get("EffektueretOk"));
						if (StringUtils.isNotEmpty(effektueretOk) && "0".equals(effektueretOk)) {
							ExceptionUtil.throwBusinessException("CMS9988853");
						}
					} else {
						throw new Exception("aks information from uip is null.");
					}
				} else {
					throw e;
				}
			}
		} else if (("8").equals(type)) {
			// 删除
			IBOCmCustBadRecordValue badValue = queryCustBadInfoByBeskedIdAndCustId(beskedId, custId);
			if (CmCommonUtil.isNotEmptyObject(badValue)) {
				badValue.setState(CmConstants.RecordState.ERASE);
				badValue.setDeletionCaus(value.getDeletionCaus());
				badValue.setExt1(value.getExt1());
				recordValue.copy(badValue);
				recordValue.setCreateBy("");
				recordValue.setAmount("");
				recordValue.setRegistRemark("");
				CmInnerServiceFactory.getCommonInnerSV().saveBean(recordValue);
			} else {
				throw new Exception("the customer bad record of debitorNr:" + beskedId + " is not not exist in veris.");
			}
		} else {
			// 修改
			IBOCmCustBadRecordValue badValue = queryCustBadInfoByBeskedIdAndCustId(beskedId, custId);
			if (CmCommonUtil.isNotEmptyObject(badValue)) {
				if (null != value.getDeletionDate()) {
					badValue.setDeletionDate(value.getDeletionDate());
				}
				if (StringUtils.isNotBlank(value.getDeletionCaus())) {
					badValue.setDeletionCaus(value.getDeletionCaus());
				}
				if (StringUtils.isNotBlank(value.getCreateBy())) {
					badValue.setCreateBy(value.getCreateBy());
				}
				if (null != value.getRegistDate()) {
					badValue.setRegistDate(value.getRegistDate());
				}
				if (StringUtils.isNotBlank(value.getRegistRemark())) {
					badValue.setRegistRemark(value.getRegistRemark());
				}
				if (StringUtils.isNotBlank(value.getAmount())) {
					badValue.setAmount(value.getAmount());
				}
				badValue.setExt1(value.getExt1());
				recordValue.copy(badValue);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(recordValue);
			} else {
				throw new Exception("the customer bad record of debitorNr:" + beskedId + " is not not exist in veris.");
			}
		}
	}


	public void dealCmCustPutOn(IBOCmCustPutOnRecordValue value) throws Exception {
		BOCmCustPutOnRecordBean recordValue = new BOCmCustPutOnRecordBean();
		String beskedId = value.getBeskedId();
		String custId = value.getCustId() + "";
		String type = value.getKreditadvarsel();
		
		if (("J").equals(type)) {
			// 新增
			//根据custid 找出是否已有记录
			IBOCmCustPutOnRecordValue checkputonRecord = queryCustPutOnByBeskedIdAndCustIdAndStamkortNr(beskedId, custId);
			recordValue.copy(value);
			recordValue.setState(CmConstants.RecordState.USE); //使用呆坏账的静态状态数据
			recordValue.setRegionid(CmCommonUtil.getDefaultRegionId());
			recordValue.setCreateDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
			recordValue.setExpireDate(com.ai.omframe.util.TimeUtil.getExpire2099());
			recordValue.setDoneDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
			recordValue.setEffectiveDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
			recordValue.setOpId(ServiceManager.getUser().getID());
			recordValue.setOrgId(ServiceManager.getUser().getOrgId());
			recordValue.setDoneCode(ServiceManager.getDoneCode());
			
			if(null!=checkputonRecord){
				checkputonRecord.setBeskedId(recordValue.getBeskedId());
				checkputonRecord.setBeskedtype(recordValue.getBeskedtype());
				checkputonRecord.setStamkortnr(recordValue.getStamkortnr()); //stamkortNr
				checkputonRecord.setKreditadvarsel(recordValue.getKreditadvarsel()); //Kreditadvarsel
				checkputonRecord.setKreditadvarselAendretdato(recordValue.getKreditadvarselAendretdato()); //AendretDato
				checkputonRecord.setFornavne(recordValue.getFornavne()); //navnedata_Fornavne
				checkputonRecord.setEfternavn(recordValue.getEfternavn()); //navnedata_Efternavn
				checkputonRecord.setAdresseUdenlandsk(recordValue.getAdresseUdenlandsk()); //adresse_udenlandsk
				checkputonRecord.setAdresseBeskyttet(recordValue.getAdresseBeskyttet()); //adresse_beskyttet
				checkputonRecord.setAdresseVejnr(recordValue.getAdresseVejnr()); //adresse_VejNr
				checkputonRecord.setNavn(recordValue.getNavn()); //postDistrikt_Navn
				checkputonRecord.setPostnr(recordValue.getPostnr()); //postDistrikt_PostNr
				checkputonRecord.setKode(recordValue.getKode()); //kommune_Kode
				checkputonRecord.setHusnrFranr(recordValue.getHusnrFranr()); //husNr_fraNr
				checkputonRecord.setBynavn(recordValue.getBynavn()); //adresse_Bynavn
				checkputonRecord.setVej(recordValue.getVej()); //adresse_Vej
				checkputonRecord.setDato(recordValue.getDato()); //adresse_Dato
				checkputonRecord.setFoedselsdato(recordValue.getFoedselsdato()); //foedselsdato
				checkputonRecord.setCprstatus(recordValue.getCprstatus()); //cprStatus
				checkputonRecord.setExt1(recordValue.getExt1());
				checkputonRecord.setState(CmConstants.RecordState.USE); //使用呆坏账的静态状态数据
				checkputonRecord.setRegionid(CmCommonUtil.getDefaultRegionId());
				checkputonRecord.setExpireDate(com.ai.omframe.util.TimeUtil.getExpire2099());
				checkputonRecord.setDoneDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				checkputonRecord.setEffectiveDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				checkputonRecord.setOpId(ServiceManager.getUser().getID());
				checkputonRecord.setOrgId(ServiceManager.getUser().getOrgId());
				checkputonRecord.setDoneCode(ServiceManager.getDoneCode());
				checkputonRecord.isModified();
				CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmCustPutOnRecordBean)checkputonRecord);
			}else{ 
				CmInnerServiceFactory.getCommonInnerSV().saveBean(recordValue);
			}
		
		}else {
			recordValue.copy(value);
			// 删除
			IBOCmCustPutOnRecordValue putonRecord = queryCustPutOnByBeskedIdAndCustIdAndStamkortNr(beskedId, custId);
			if (CmCommonUtil.isNotEmptyObject(putonRecord)) {
				putonRecord.setState(CmConstants.RecordState.ERASE);
				putonRecord.setExt1(recordValue.getExt1());
				putonRecord.setKreditadvarsel(recordValue.getKreditadvarsel()); 
				putonRecord.setExpireDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				putonRecord.setDoneDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				putonRecord.setOpId(ServiceManager.getUser().getID());
				putonRecord.setOrgId(ServiceManager.getUser().getOrgId());
				putonRecord.setDoneCode(ServiceManager.getDoneCode());
				CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmCustPutOnRecordBean)putonRecord);
			} else {
				throw new Exception("the customer put on record of custId:" + custId + " is not not exist in veris.");
			}
		}
	}
	
	public IBOCmCustPutOnRecordValue queryCustPutOnByBeskedIdAndCustIdAndStamkortNr(String beskedId, String custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		/*condition.append(" AND ").append(IBOCmCustPutOnRecordValue.S_BeskedId).append(" =:beskedId ");
		parameter.put("beskedId", beskedId);*/
		condition.append(" AND ").append(IBOCmCustPutOnRecordValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmCustPutOnRecordValue[] values = (IBOCmCustPutOnRecordValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustPutOnRecordBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0];
		}
		return null;
	}
	
	public IBOCmCustBadRecordValue queryCustBadInfoByBeskedIdAndCustId(String beskedId, String custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustBadRecordValue.S_BeskedId).append(" =:beskedId ");
		parameter.put("beskedId", beskedId);
		condition.append(" AND ").append(IBOCmCustBadRecordValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmCustBadRecordValue[] values = (IBOCmCustBadRecordValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustBadRecordBean.class, condition.toString(),
				parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0];
		}
		return null;
	}
	 
	public IBOCmCustBadRecordValue[] queryCustBadInfosByAmountAndDeletionDate(int limitNum) throws Exception{
		 Connection conn = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 List<IBOCmCustBadRecordValue> cmCustBadRecordList = new ArrayList<IBOCmCustBadRecordValue>();
		 try {
			 conn = ServiceManager.getSession().getConnection();
			 DataContainer dc = new DataContainer();
			 dc.set( "TENANT_ID", TenantIDFactory.getTenantId()); 
			 String tablename_insoffer = SplitTableFactory.createTableName(BOCmCustBadRecordBean.getObjectTypeStatic().getMapingEnty(), dc);
			 
			 StringBuffer sqlString = new StringBuffer();
			 sqlString.append(" select DELETION_DATE,DELETION_CAUS,CREATE_BY,REGIST_DATE,REGIST_REMARK,AMOUNT,BESKED_ID,CUST_ID,STATE,DONE_CODE,CREATE_DATE,DONE_DATE,EFFECTIVE_DATE,EXPIRE_DATE,REGION_ID,REMARKS ");
			 sqlString.append(" from ");
			 sqlString.append(tablename_insoffer);
			 sqlString.append(" where  AMOUNT = ? or AMOUNT is null or DELETION_DATE < NOW() order by ").append(BOCmCustBadRecordBean.S_DeletionDate).append(" ASC");
			 sqlString.append(" limit 0, ? ");
			 ps = conn.prepareStatement(sqlString.toString());
			 ps.setObject(1,  "0" ); 
			 ps.setObject(2,  limitNum ); 
			 rs = ps.executeQuery(); 
			 while (rs.next()) {
				 IBOCmCustBadRecordValue cmCustBadRecord_temp = new BOCmCustBadRecordBean();
				 cmCustBadRecord_temp.setDeletionDate(rs.getTimestamp(BOCmCustBadRecordBean.S_DeletionDate));
				 cmCustBadRecord_temp.setDeletionCaus(rs.getString(BOCmCustBadRecordBean.S_DeletionCaus));
				 cmCustBadRecord_temp.setCreateBy(rs.getString(BOCmCustBadRecordBean.S_CreateBy));
				 cmCustBadRecord_temp.setRegistDate(rs.getTimestamp(BOCmCustBadRecordBean.S_RegistDate));
				 cmCustBadRecord_temp.setRegistRemark(rs.getString(BOCmCustBadRecordBean.S_RegistRemark));
				 cmCustBadRecord_temp.setAmount(rs.getString(BOCmCustBadRecordBean.S_Amount));
				 cmCustBadRecord_temp.setBeskedId(rs.getString(BOCmCustBadRecordBean.S_BeskedId));
				 cmCustBadRecord_temp.setCustId(rs.getLong(BOCmCustBadRecordBean.S_CustId));
				 cmCustBadRecord_temp.setState(rs.getString(BOCmCustBadRecordBean.S_State));
				 cmCustBadRecord_temp.setDoneCode(rs.getLong(BOCmCustBadRecordBean.S_DoneCode));
				 cmCustBadRecord_temp.setCreateDate(rs.getTimestamp(BOCmCustBadRecordBean.S_CreateDate));
				 cmCustBadRecord_temp.setDoneDate(rs.getTimestamp(BOCmCustBadRecordBean.S_DoneDate));
				 cmCustBadRecord_temp.setEffectiveDate(rs.getTimestamp(BOCmCustBadRecordBean.S_EffectiveDate));
				 cmCustBadRecord_temp.setExpireDate(rs.getTimestamp(BOCmCustBadRecordBean.S_ExpireDate));
				 cmCustBadRecord_temp.setRegionId(rs.getString(BOCmCustBadRecordBean.S_RegionId));
				 cmCustBadRecord_temp.setRemarks(rs.getString(BOCmCustBadRecordBean.S_Remarks));
				 cmCustBadRecordList.add(cmCustBadRecord_temp);
			 }
		 }catch(Exception e){
			 log.error("Exception detail info + ", e);
			 throw e;
		 }
		 finally {
			 CmCommonUtil.closeJDBC(conn, ps, rs);
		 }
		if(cmCustBadRecordList.size()>0){
			return cmCustBadRecordList.toArray(new IBOCmCustBadRecordValue[0]);
		}else{
			return null;
		}
	}
	
	public void deleteBadRecord(IBOCmCustBadRecordValue badRecord) throws Exception {
		BOCmCustBadRecordBean recordValue = new BOCmCustBadRecordBean();
		recordValue.copy(badRecord);
		recordValue.setStsToOld();
		recordValue.delete();
		CmInnerServiceFactory.getCommonInnerSV().saveBean(recordValue);
	}
	

	public void deleteIndivCust(long custId) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		ICustomerValue value = service.queryCustomerByCustId(custId);
		// 判断有没有其他角色
		commonSV.ifCanTerminateCust(custId, value.getPartyId());
		value.setCustStatus(CmConstants.CustomerStatus.INDIV_TERMINATED);
		value.setState(CmConstants.RecordState.ERASE);
		value.setExpireDate(CmCommonUtil.getSysDate());
		// 删除CPR号码
		value.setCustCertCode(null);
		IVOCustValue custValue = new VOCustBean(value);
		
		//删除客户联系媒介
		IBOCmCustContactMediumValue[] cmcustContentMediums = service.queryContactMediumByCondition(custId,0);
		if(null!=cmcustContentMediums&&cmcustContentMediums.length>0){
			for (int i = 0; i < cmcustContentMediums.length; i++) {
			   cmcustContentMediums[i].delete();
			   cmcustContentMediums[i].setState("E");
			   cmcustContentMediums[i].setExpireDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
			}
			custValue.addCustContMedium(cmcustContentMediums);
		}
		
		custValue.setBusinessId(CmConstants.BusiLogId.INDIV_CUST_DELETE);
		service.saveCustomer(custValue);

		// 删除参与人角色
		ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRole(value.getPartyId(), CmConstants.PartyRoleType.CUSTOMER, -1, -1);
		if (partyRoles != null && partyRoles.length > 0) {
			BOCmPartyRoleBean partyRoleBean = null;
			for (int i = 0; i < partyRoles.length; i++) {
				partyRoleBean = new BOCmPartyRoleBean();
				partyRoleBean.copy(partyRoles[i]);
				partyRoleBean.setState(CmConstants.RecordState.ERASE);
				partyRoleBean.setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
				partyRoleSV.savePartyRole(partyRoleBean);
			}
		}
		// 记录客户交互记录
		CmRecordLog.saveRecord(CmBusinessOperation.CM_INDIV_CUST_DEL, custId, null);
	}

	public void savePsCustLifeCycleHis(IBOCmPsCustLifecycleHValue value) throws Exception {
		BOCmPsCustLifecycleHBean bean = new BOCmPsCustLifecycleHBean();
		bean.copy(value);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public void savePsPublicDealHis(IBOCmPsPublicDealHValue value) throws Exception {
		BOCmPsPublicDealHBean bean = new BOCmPsPublicDealHBean();
		bean.copy(value);
		// 重新设置h_id的值
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		long newHID = commonSV.getHisTableSequence("CM_PS_PUBLIC_DEAL_H_" + bean.getExecAction());
		if (newHID > 0) {
			bean.setHId(newHID);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	/**
	 * 判断是否存在未处理完的计算工单
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOCmPsSegmentCalValue querySegCalValueByCustId(long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmPsSegmentCalValue.S_CustId).append("=:custId");
		parameter.put("custId", custId);
		IBOCmPsSegmentCalValue[] segmentCalValues = (IBOCmPsSegmentCalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPsSegmentCalBean.class, condition.toString(),
				parameter, -1, -1);
		if (segmentCalValues != null && segmentCalValues.length > 0) {
			return segmentCalValues[0];
		}
		return null;
	}

	public List<IBOCmInsCmrelValue> queryAllCmInsCmrel(long custId) throws Exception {
		String condition = "SELECT A.CUST_ID,A.RELA_TYPE,A.USER_ID,A.CMREL_ID FROM {CM_INS_CMREL} A WHERE A.STATE = 1 AND A.CUST_ID = :CUST_ID ";
		HashMap map = new HashMap();
		map.put("CUST_ID", custId);
		String sql = SplitTableFactory.createQuerySQL(condition, map);
		IBOCmInsCmrelValue[] insValues = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmInsCmrelBean.class, sql, map);
		List<IBOCmInsCmrelValue> valueList = new ArrayList<IBOCmInsCmrelValue>();
		if (CmCommonUtil.isNotEmptyObject(insValues)) {
			for (int i = 0; i < insValues.length; i++) {
				long userId = insValues[i].getUserId();
				if (insValues[i].getRelaType() == CmConstants.RelaType.OWNER) {
					CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
					ICrmInsFSV crmInsFSV = (ICrmInsFSV) ServiceFactory.getService(ICrmInsFSV.class);
					IInsCmRelValue insCmRelValue = crmInsFSV.queryInsCmRelByUserId(userId);
					if (insCmRelValue == null || insCmRelValue.getCmrelId() > 0) {
						// 已经销户或已分配
						continue;
					} else {
						// 未分配
						valueList.add(insValues[i]);
					}
				} else if (insValues[i].getRelaType() == CmConstants.RelaType.USER) {
					valueList.add(insValues[i]);
				}
			}
		}
		return valueList;
	}

	public IBOCmInsCmrelValue[] queryCmInsByUserIdAndCustId(long custId, long userId, int relaType) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
		parameter.put("CUST_ID", custId);
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
		parameter.put("userId", userId);
		if (relaType == CmConstants.RelaType.OWNER || relaType == CmConstants.RelaType.USER) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relaType ");
			parameter.put("relaType", relaType);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		return (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, -1, -1);
	}

	public void saveCmInsCmrelInfo(IBOCmInsCmrelValue value) throws Exception {
		BOCmInsCmrelBean bean = new BOCmInsCmrelBean();
		bean.copy(value);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		if (relType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		if (userType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserType).append(" =:userType ");
			parameter.put("userType", userType);
		}
		if (prodCatalogId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" =:prodCatalogId ");
			parameter.put("prodCatalogId", prodCatalogId);
		}
		if (prodCatalogId == 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" NOT IN( ").append(RBossConst.PROD_CATALOG_GSM).append(",")
					.append(RBossConst.PROD_CATALOG_FIXEDPHONE).append(",").append(RBossConst.PROD_CATALOG_BROADBAND).append(",").append(RBossConst.PROD_CATALOG_MULTIPLAN)
					.append(",").append(RBossConst.PROD_CATALOG_NODICCONNECT).append(")");
		}
		if (offerId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_OfferId).append(" =:offerId ");
			parameter.put("offerId", offerId);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		condition.append(" ORDER BY CREATE_DATE ASC ");

		IBOCmInsCmrelValue[] contMediums = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, start,
				end);
		if (null != contMediums && contMediums.length > 0) {
			return contMediums;
		}
		return new IBOCmInsCmrelValue[0];
	}

	public int queryCmInsCmrelCount(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		if (relType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		if (userType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserType).append(" =:userType ");
			parameter.put("userType", userType);
		}
		if (prodCatalogId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" =:prodCatalogId ");
			parameter.put("prodCatalogId", prodCatalogId);
		}
		if (prodCatalogId == 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_ProdCatalogId).append(" NOT IN( ").append(RBossConst.PROD_CATALOG_GSM).append(",")
					.append(RBossConst.PROD_CATALOG_FIXEDPHONE).append(",").append(RBossConst.PROD_CATALOG_BROADBAND).append(",").append(RBossConst.PROD_CATALOG_MULTIPLAN)
					.append(",").append(RBossConst.PROD_CATALOG_NODICCONNECT).append(")");
		}
		if (offerId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_OfferId).append(" =:offerId ");
			parameter.put("offerId", offerId);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmInsCmrelBean.class, condition.toString(), parameter);
	}

	public int queryCmInsCmrelCountWithoutSelf(long custId, long userId, int relType) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" !=:userId ");
			parameter.put("userId", userId);
		}
		if (relType > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_RelaType).append(" =:relType ");
			parameter.put("relType", relType);
		}
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmInsCmrelBean.class, condition.toString(), parameter);
	}

	public IBOCmInsCmrelValue queryCmInsByCmrelId(long cmrelId, long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmInsCmrelValue.S_CmrelId).append(" =:cmrelId ");
		parameter.put("cmrelId", cmrelId);
		parameter.put("CUST_ID", custId);
		IBOCmInsCmrelValue[] values = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0];
		}
		return null;
	}

	public ICustOrganizeValue[] queryCustOrganizes(long custId, int deptType, int startNum, int endNum) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
		return values;
	}

	public int queryCustOrganizeCount(long custId, int deptType) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);
		int count = busi.queryCount(new DataContainer[] { dContainer });
		return count;
	}

	public IBOCmGroupRelIndustryValue[] queryGroupIndustrys(long custId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IBOCmGroupRelIndustryValue.S_CustId).append(" = :custId ");
		paraMap.put("custId", custId);
		IBOCmGroupRelIndustryValue[] dcs = (IBOCmGroupRelIndustryValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupRelIndustryBean.class, condition.toString(),
				paraMap, start, end);
		if (dcs != null && dcs.length > 0) {
			return dcs;
		}
		return new IBOCmGroupRelIndustryValue[0];
	}

	public int queryCustRequestTaskCount(String xmlComdition) throws Exception {
		int count = 0;
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlComdition);
		DataContainer container = dcs[0];

		StringBuilder unionCond = new StringBuilder("SELECT t.PARTY_NAME AS CUST_NAME,k.* FROM {CM_PARTY} t,{CM_CUST_REQUEST_TASK} k WHERE t.CPR_ID=k.CUST_ID");
		HashMap parameter = new HashMap();
		String custName = container.getAsString(IQBOCmCustRequestValue.S_CustName);
		long id = container.getAsLong(IQBOCmCustRequestValue.S_CustId);
		String result = container.getAsString(IQBOCmCustRequestValue.S_Results);
		if (custName != null && custName.length() > 0) {
			unionCond.append(" AND ").append(IBOCmPartyValue.S_PartyName).append(" like ").append(":custName ");
			parameter.put("custName", custName + "%");
		}
		if (id > 0) {
			// 增加支持客户ID查询CPR请求工单
			if (String.valueOf(id).length() == 14) {
				ICmIndivCustomerSV cmIndivCustomerSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
				IBOCmIndivCustomerValue val = cmIndivCustomerSV.queryIndivCustomerById(id);
				if (val != null) {
					id = val.getPartyId();
				} else {
					return count;
				}
			}
			unionCond.append(" AND ").append(IBOCmPartyValue.S_PartyId).append(" =:custId ");
			parameter.put("custId", id);
		}
		if (result != null && result.length() > 0) {
			unionCond.append(" AND ").append(IQBOCmCustRequestValue.S_Results).append(" =:results ");
			parameter.put("results", result);
		}
		String sql = CmLnCommonUtil.getQueryCount(unionCond.toString(), null, parameter);
		DataContainer[] returnValue = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		if (returnValue != null && returnValue.length > 0) {
			count = returnValue[0].getAsInt("CNT");
		}
		return count;
	}

	public void dealSendToC3(long custId, long userId, int action) throws Exception {
		if (custId > 0 && userId > 0) {
			ICustomerValue custValue = queryCustomerByCustId(custId);
			IBOCmxIndivCustomerValue cmxCustValue = queryCmxIndivCustomerValue(custId);
			String isDPI = cmxCustValue.getExt8();
			// 开户时如果没有选择订购C3，则不订购；销户时如果本来就没有订购C3也不需要送工单
			if (!("1").equals(isDPI)) {
				return;
			}
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
			IInsUserValue insValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
			int userType = insValue.getUserType();
			// 个人userType是6的为虚用户
			if (CmCommonUtil.isNotEmptyObject(custValue) && CmCommonUtil.isNotEmptyObject(insValue) && 6 != userType) {
				IBOCmPsOptinSyncC3Value value = new BOCmPsOptinSyncC3Bean();
				value.setAction(action);
				value.setOptinFlag("Y");
				value.setRecordId(CmCommonUtil.getNewSequence(BOCmPsOptinSyncC3Bean.class));
				value.setBillId(insValue.getBillId());
				value.setState(CmConstants.RecordState.USE);
				ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				commonSV.savePsOptinC3Info(new IBOCmPsOptinSyncC3Value[] { value });
			}
		}

	}

	public IBOCmInsCmrelValue[] dealQueryCmInsCmrel(long custId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
		parameter.put("CUST_ID", custId);
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_RelaType).append(" =:relaType ");
		parameter.put("relaType", CmConstants.RelaType.OWNER);
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.CmInsRela.NORMAL);
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserType).append(" <>:paraA ");
		parameter.put("paraA", 6);
		IBOCmInsCmrelValue[] values = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, -1, -1);
		return values;
	}

	/**
	 * 判断客户下面是否有正常的用户
	 * @Function ifHaveActiveUser
	 * @Description 
	 *
	 * @param custId
	 * @param action
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-24 上午10:29:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-24     yangjh           v1.0.0               修改原因<br>
	 */
	public boolean ifHaveActiveUser(long custId, int action) throws Exception {
		StringBuilder sql = null;
		Map<String, Long> map = new HashMap<String, Long>();
		if (action == 1) {
			// 判断客户下面是否有状态正常的用户，非停机
			sql = new StringBuilder(
					"SELECT COUNT(1) AS CNT FROM {CM_INS_CMREL} T WHERE T.CUST_ID = :custId AND T.EXT1 IN ('1','4','8') AND T.RELA_TYPE = 2 AND T.STATE=1 AND T.USER_TYPE <> 6 AND (CAST(T.EXT2 AS UNSIGNED INT) = 0 OR T.EXT2 IS NULL) ");
			map.put("custId", custId);
			map.put("CUST_ID", custId);
		} else if (action == 2) {
			// 判断客户下面是否有状态正常的用户(包括停机的)
			sql = new StringBuilder(
					"SELECT COUNT(1) AS CNT FROM {CM_INS_CMREL} T WHERE T.CUST_ID = :custId AND T.EXT1 IN ('1','4','8') AND T.RELA_TYPE = 2 AND T.STATE=1 AND T.USER_TYPE <> 6 ");
			map.put("custId", custId);
			map.put("CUST_ID", custId);
		} else {
			return false;
		}
		DataContainer[] datas = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), map);
		long count = 0;
		if (datas != null && datas.length > 0) {
			for (int i = 0; i < datas.length; i++) {
				count = datas[i].getAsInt("CNT");
				if (count > 0)
					return true;
			}
		}
		return false;
	}

	public void dealStopUserFromCPR(long custId, long userId) throws Exception {
		String flag = "Y";
		ICustomerValue custValue = queryCustomerByCustId(custId);
		// 查询出该user下面使用的号码
		IBOCmInsCmrelValue[] values = queryCmInsCmrel(custId, -1, CmConstants.RelaType.USER, -1, -1, -1, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			for (int i = 0; i < values.length; i++) {
				if (values[i].getUserId() == userId) {
					continue;
				}
				flag = "N";
				break;
			}
		}
		if (("Y").equals(flag)) {
			// 说明该使用者下面已经没有可用的号码,则需要送CPR退订,只有当前只有一种user角色才送退订
			ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			if (roleSV.IsPartyRoleUnique(custValue.getPartyId(), CmConstants.EntityType.USER)) {
				// 固网不与CPR交互，加一个开关控制
				IBOBsStaticDataValue[] staticValue = StaticDataUtil.getStaticData("CM_USER_UNSUBSCRIBE_FROM_CPR");
				if (CmCommonUtil.isNotEmptyObject(staticValue)) {
					if ("Y".equals(staticValue[0].getCodeValue())) {
						ICmCustRequestTaskSV requestSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
						IBOCmCustRequestTaskValue[] taskValues = requestSV.queryByCustId(custId);
						if (CmCommonUtil.isNotEmptyObject(taskValues)) {
							IBOBsStaticDataValue[] temp = StaticDataUtil.getStaticData("CM_USER_DO_REQUEST_TASK");
							// 开关为开的时候才走抛异常流程
							if (CmCommonUtil.isNotEmptyObject(temp) && "Y".equals(temp[0].getCodeValue())) {
								if (taskValues[0].getRequestStatus().equals(CmConstants.RequestStatus.dealDone)) {
									// 当前工单处理完成后才可以删除
									requestSV.saveCustRequestTaskInfo(custId, CmConstants.RequestType.DELETE, CmConstants.RequestStatus.pending);
								} else {
									ExceptionUtil.throwBusinessException("CMS9988904");
								}
							} else {
								// 否则直接插退订cpr工单
								requestSV.saveCustRequestTaskInfo(custId, CmConstants.RequestType.DELETE, CmConstants.RequestStatus.pending);
							}
						}
					}
				}
				// 改变user的state失效
				custValue.setState(CmConstants.RecordState.ERASE);
				custValue.setCustCertType(0);
				custValue.setCustCertCode(null);
				CmServiceFactory.getCustomerSV().saveCustomer(custValue);
			}
			// 修改user生命周期状态(待字段role_status加过后处理)
			if (CmCommonUtil.isNotEmptyObject(custValue)) {
				long partyId = custValue.getPartyId();
				// 查询角色信息
				IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRole(partyId, CmConstants.EntityType.USER, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(roleValues)) {
					// 设置状态失效
					roleValues[0].setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
					roleValues[0].setState(CmConstants.RecordState.ERASE);
					BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
					bean.copy(roleValues[0]);
					roleSV.savePartyRole(bean);
				}
			}
		}
	}

	public void dealDeleteUserAndOwner(long custId, long userId) throws Exception {
		if (userId > 0 && custId > 0) {
			// 查询出跟这号码有关的归属者
			IBOCmInsCmrelValue[] values = queryCmInsCmrel(custId, userId, CmConstants.RelaType.OWNER, -1, -1, -1, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				// 设置该关系为不可用
				values[0].setState(CmConstants.CmInsRela.TERMINATED);
				// 保存客户用户关系
				saveCmInsCmrel(values[0]);
			}
			// 查询出跟这个号码有关的使用者
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
			IInsCmRelSV crmInsFSV = (IInsCmRelSV) ServiceFactory.getService(IInsCmRelSV.class);
			IInsCmRelValue insCmRelValue = crmInsFSV.queryInsCmRel(userId, -1, CmConstants.RelaType.USER, CmConstants.CmInsRela.NORMAL);
			if (CmCommonUtil.isNotEmptyObject(insCmRelValue)) {
				long userCustId = insCmRelValue.getCustId();
				// 查询出user的信息
				IBOCmInsCmrelValue[] userValues = queryCmInsCmrel(userCustId, userId, CmConstants.RelaType.USER, -1, -1, -1, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(userValues)) {
					// 设置该关系不可用
					userValues[0].setState(CmConstants.CmInsRela.TERMINATED);
					// 保存客户用户关系
					saveCmInsCmrel(userValues[0]);
				}
			}
		}
	}

	/**
	 * 提供给资源的判断客户是否在同一层级接口
	 * @param rootCustId
	 * @param subCustId
	 * @return
	 * @throws Exception
	 */
	public boolean isSameOrgByCustId(long rootCustId, long subCustId) throws Exception {
		boolean returnFlag = false;
		ICustOrganizeValue rootCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(rootCustId);
		ICustOrganizeValue subCustOrganizeValue = CmServiceFactory.getCustomerSV().queryCustOrganizeByRelCustId(subCustId);
		if (CmCommonUtil.isNotEmptyObject(rootCustOrganizeValue) && CmCommonUtil.isNotEmptyObject(subCustOrganizeValue)) {
			if (rootCustOrganizeValue.getCustId() == subCustOrganizeValue.getCustId()) {
				returnFlag = true;
			}
		}
		return returnFlag;
	}

	/**
	 * 过户时与C3的交互
	 * @param custId
	 * @param oldCustId
	 * @return
	 * @throws Exception
	 */
	private void dealCustToCustOfC3(long oldCustId, long custId, long userId) throws Exception {
		// 根据userId查询用户信息
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
		IInsUserValue insValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
		// 老客户的客户数据
		ICustomerValue oldCmCust = queryCustomerByCustId(oldCustId);
		IBOCmxIndivCustomerValue oldCmxCust = null;
		// 新客户的客户数据
		ICustomerValue newCmCust = queryCustomerByCustId(custId);
		IBOCmxIndivCustomerValue newCmxCust = null;
		int newCustType = newCmCust.getCustType();
		int oldCustType = oldCmCust.getCustType();
		if (newCustType == CmConstants.CustomerType.INDIVIDUAL) {
			newCmxCust = queryCmxIndivCustomerValue(custId);
		}
		if (oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			oldCmxCust = queryCmxIndivCustomerValue(oldCustId);
		}
		if (newCustType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人过给个人
			String newDPI = newCmxCust.getExt8();
			String oldDPI = oldCmxCust.getExt8();
			if (!StringUtils.equals(newDPI, oldDPI)) {
				// 送C3
				IBOCmPsOptinSyncC3Value value = new BOCmPsOptinSyncC3Bean();
				if (("1").equals(newDPI)) {
					value.setAction(CmConstants.sendToC3Action.ADD);
				} else {
					value.setAction(CmConstants.sendToC3Action.DELETE);
				}
				value.setOptinFlag("Y");
				value.setRecordId(CmCommonUtil.getNewSequence(BOCmPsOptinSyncC3Bean.class));
				value.setBillId(insValue.getBillId());
				value.setState(CmConstants.RecordState.USE);
				ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				commonSV.savePsOptinC3Info(new IBOCmPsOptinSyncC3Value[] { value });
			}
		} else if (newCustType == CmConstants.CustomerType.GROUP && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人过给集团
			String oldDPI = oldCmxCust.getExt8();
			if (("1").equals(oldDPI)) {
				// 送C3退订
				IBOCmPsOptinSyncC3Value value = new BOCmPsOptinSyncC3Bean();
				value.setAction(CmConstants.sendToC3Action.DELETE);
				value.setOptinFlag("Y");
				value.setRecordId(CmCommonUtil.getNewSequence(BOCmPsOptinSyncC3Bean.class));
				value.setBillId(insValue.getBillId());
				value.setState(CmConstants.RecordState.USE);
				ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				commonSV.savePsOptinC3Info(new IBOCmPsOptinSyncC3Value[] { value });
			}
		} else if (newCustType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.GROUP) {
			// 集团过户给个人
			String newDPI = newCmxCust.getExt8();
			if (("1").equals(newDPI)) {
				// 送C3订购
				IBOCmPsOptinSyncC3Value value = new BOCmPsOptinSyncC3Bean();
				value.setAction(CmConstants.sendToC3Action.ADD);
				value.setOptinFlag("Y");
				value.setRecordId(CmCommonUtil.getNewSequence(BOCmPsOptinSyncC3Bean.class));
				value.setBillId(insValue.getBillId());
				value.setState(CmConstants.RecordState.USE);
				ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
				commonSV.savePsOptinC3Info(new IBOCmPsOptinSyncC3Value[] { value });
			}
		}
	}

	public void dealAssignNum(String custId, String[] insValues, String ownerCustId) throws Exception {
		if (StringUtils.isNotBlank(custId) && null != insValues && insValues.length > 0) {
			for (int i = 0; i < insValues.length; i++) {
				String[] parameters = insValues[i].split(",");
				String user = "";
				String userId = parameters[0];
				String userState = parameters[4];
				String osStatus = parameters[5];
				
				//OTTX change user需求，在change user业务时，需要将新老使用者信息通过UCM送给UAPI
				//判断用户是否有生效的ottx offer
				boolean isExsitOttxOffer = false;
				IInsOfferValue[] insOfferValues = SoServiceFactory.getInstanceQrySV().getInsOfferByUserId(Long.parseLong(userId), "", OrderConst.VALID_TYPE_NOW);
				if(insOfferValues != null && insOfferValues.length > 0){
					for (int j = 0; j < insOfferValues.length; j++) {
						String offerType = insOfferValues[j].getOfferType();
						if(RBossConst.OFFER_PLAN_OTTX.equals(offerType) || RBossConst.OFFER_VAS_OTTX.equals(offerType)){
							isExsitOttxOffer = true;
							break;
						}
					}
				}
				if(isExsitOttxOffer){
					IUcm2CrmFSV ucm2CrmFsv= (IUcm2CrmFSV)ServiceFactory.getService(IUcm2CrmFSV.class);
					IInsCmRelSV insCmRelSv = (IInsCmRelSV)ServiceFactory.getService(IInsCmRelSV.class);
					InsCmRelBean insCmRelValue = insCmRelSv.queryInsCmRel(Long.parseLong(userId), 1l);
					HashMap userMap = new HashMap();
					userMap.put("new_department_id", custId);
					userMap.put("old_department_id", insCmRelValue.getCustId());
					IInsUserValue insUserValue = SoServiceFactory.getInstanceQrySV().getInstUserByUserId(Long.parseLong(userId));
					IInsUserValue[] userValueArr = new IInsUserValue[1];
					userValueArr[0] = insUserValue;
					//990000000004,业务id传这个特定的，标识做change user业务，UCM会根据这个来解析开通事件
					ucm2CrmFsv.unifyopen(userValueArr, 990000000004l, userMap);
				}
				
				if (parameters.length == 7) {
					user = parameters[6];
					// 删除该user
					IBOCmInsCmrelValue[] values = queryCmInsCmrel(Long.parseLong(user), Long.parseLong(userId), CmConstants.RelaType.USER, -1, -1, -1, -1, -1);
					if (CmCommonUtil.isNotEmptyObject(values)) {
						values[0].delete();
						saveCmInsCmrel(values[0]);
					}
				}
				
				// 分配新的使用者并设置主键
				IBOCmInsCmrelValue value = new BOCmInsCmrelBean();
				value.setUserId(Long.parseLong(parameters[0]));
				value.setOfferId(DataType.getAsLong(parameters[1]));
				value.setUserRegionCode(parameters[2]);
				value.setProdCatalogId(DataType.getAsLong(parameters[3]));
				value.setCmrelId(CmCommonUtil.getNewSequence(BOCmInsCmrelBean.class));
				value.setExt1(userState);
				value.setExt2(osStatus);
				if (StringUtils.isNotBlank(custId)) {
					value.setCustId(Long.parseLong(custId));
				}
				// 设置关系类型为使用者
				value.setRelaType(CmConstants.RelaType.USER);
				// 设置默认值
				value.setState(1);
				value.setUserType(1);
				value.setEffectiveDateType(1);
				value.setExpireDateType(1);
				// 记录接触记录
				if (StringUtils.isNotBlank(user)) {
					String[] detailInfo = new String[2];
					// 查询旧使用者的信息
					ICustomerValue oldUserInfo = queryCustomer(Long.parseLong(user));
					// 查询新使用者的信息
					ICustomerValue newUserInfo = queryCustomer(Long.parseLong(custId));
					detailInfo[0] = "Old user name : " + oldUserInfo.getCustName();
					detailInfo[1] = "New user name : " + newUserInfo.getCustName();
					// 记录使用者变更信息
					CmRecordLog.saveRecord(CmBusinessOperation.CM_USER_MOD, Long.parseLong(ownerCustId), detailInfo);
				}
				// 保存使用者关系
				ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				service.saveCmInsCmrel(value);
			}
		}
	}

	public void orderForUnormalPerson(long userId) throws Exception {
		// 查询billId
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
		IInsUserValue value = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
		if (null != value) {
			String billId = value.getBillId();
			String offerId = "";
			ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
			// 获取offerId
			IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData(CmConstants.orderType.UNORMALPERSON_OFFER);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				offerId = values[0].getCodeValue();
			}
			if (StringUtils.isNotBlank(offerId)) {
				// 订购offer
				List offerVASList = new ArrayList();
				String operType = SoServiceFactory.getOmConstSV().getOperTypeCreate();
				ISoOfferExe offerExe = new SoOfferExe(Long.parseLong(offerId), operType);
				// offerExe.setSoAttrMap(soAttrMap);
				offerExe.setEffType("1");
				offerExe.setExpType("7");
				offerVASList.add(offerExe);
				crmFSV.offerVASListStore(userId, billId, offerVASList, null, new Timestamp(new Date().getTime()), TimeUtil.getMaxExpire(), null);
			}
		}
	}

	public String getInteractionId() throws Exception {
		return DataType.getAsString(ServiceManager.getDoneCode());
	}

	private ICustomerValue queryCustomer(long custId) throws Exception {
		ICustomerValue custValue = new CustomerBean();
		if (CmConstants.CustomerType.INDIVIDUAL == CmCommonUtil.getCustType(custId)) {
			IBOCmIndivCustomerValue customerValue = queryIndivCustomerInfo(custId);
			custValue.copy(customerValue);
		} else {
			IBOCmGroupCustomerValue customerValue = queryGroupCustomerInfo(custId);
			custValue.copy(customerValue);
		}
		return custValue;
	}

	public void dealCreateDefaultUser(long custId, long userId, String flag) throws Exception {
		IBOCmInsCmrelValue value = new BOCmInsCmrelBean();
		value.setCmrelId(CmCommonUtil.getNewSequence(BOLnCmInsCmRelBean.class));
		value.setCustId(custId);
		value.setUserId(userId);
		value.setRelaType(CmConstants.RelaType.USER);
		value.setState(CmConstants.CmInsRela.NORMAL);
		value.setEffectiveDateType(0);
		value.setExpireDateType(0);
		// 设置中心
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
		IInsUserValue iInsUserValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(userId);
		if (CmCommonUtil.isNotEmptyObject(iInsUserValue)) {
			value.setUserType(iInsUserValue.getUserType());
			value.setUserRegionCode(iInsUserValue.getRegionId());
		}

		// 查询主策划
		IInstanceQrySV instanceQrySV = (IInstanceQrySV) ServiceFactory.getService(IInstanceQrySV.class);
		IInsOfferValue[] values = instanceQrySV.getInsOfferByUserId(userId, SoServiceFactory.getOmConstSV().getOfferTypeOfferPlan(), 1);
		if (null != values && values.length > 0) {
			value.setOfferId(values[0].getOfferId());
		}
		IInsUserValue insUserValue = instanceQrySV.getInstUserByUserId(userId);
		// 查询产品规格
		value.setProdCatalogId(insUserValue.getProdCatalogId());
		if (("N").equalsIgnoreCase(flag)) {
			if (CmCommonUtil.isNotEmptyObject(insUserValue)) {
				// 查询用户状态
				value.setExt1(insUserValue.getState());
			}
			// 查询停机位
			IInsUserOsStateValue[] insUserOsStateValue = InsServiceFactory.getInstanceUserOsStatusService().getUserOsStateByUserId(value.getUserId(), OrderConst.VALID_TYPE_NOW);
			if (CmCommonUtil.isNotEmptyObject(insUserOsStateValue)) {
				value.setExt2(insUserOsStateValue[0].getOsStatus());
			}
		} else if (("Y").equalsIgnoreCase(flag)) {
			value.setExt2(OrderConst.OS_STATUS);
			value.setExt1(String.valueOf(OrderConst.INST_USER_STATE_INUSE));
		}
		saveCmInsCmrel(value);
	}

	private void subscribePhoneBook(long userId) throws Exception {
		ICrm2InternalSV crm2InternalSV = (ICrm2InternalSV) ServiceFactory.getService(ICrm2InternalSV.class);
		Map soAttrMap = null;
		soAttrMap = new HashMap();
		ISoAttrData attrData = new SoAttrData();
		attrData.setAttrId(262100000208L);
		// 订购
		attrData.setNewValue("2");
		attrData.setNewText("Hidden number");
		attrData.setState(OrderConst.DATA_NEW_STATE);
		List<ISoAttrData> list = new ArrayList<ISoAttrData>();
		list.add(attrData);
		soAttrMap.put("262100000208", list.toArray(new ISoAttrData[0]));
		// 查询offerId
		IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData(CmConstants.orderType.PHONEBOOK_OFFER);
		if (CmCommonUtil.isNotEmptyObject(staticValues)) {
			String offerId = staticValues[0].getCodeValue();
			if (StringUtils.isNotBlank(offerId)) {
				// 订购/退订offer
				crm2InternalSV.buyOfferVAS4CM(userId, null, Long.parseLong(offerId), null, soAttrMap, null, null, null);
			}
		}
	}

	public void saveIndivCustomer(IVOCustValue custValue) throws Exception {
		AbstractCustomerDealBusiModelImpl busiModel = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		custValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_NEW);
		ICustomerValue customerValue = custValue.getCustomer();
		customerValue.setCustStatus(CmConstants.CustomerStatus.INDIV_POTENTIAL);
		customerValue.setRealNameFlag(0);
		customerValue.setAnonymousFlag(1);
		customerValue.setNationality(BsCommonDistrictUtil.getAllCountryDistricts()[0].getDistrictCode());
		customerValue.setProvinceId(BsCommonDistrictUtil.getAllProveDistricts()[0].getDistrictCode());
		customerValue.setProvinceId(BsCommonDistrictUtil.getAllProveDistricts()[0].getDistrictCode());
		customerValue.setCityId(BsCommonDistrictUtil.getAllCityDistricts()[0].getDistrictCode());
		customerValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
		busiModel.dealDefaultcustomer(custValue);
		long custId = custValue.getCustId();

		// 创建默认细分
		ICmCustSegmentRelaSV segmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue segmentRela = new BOCmCustSegmentRelaBean();
		segmentRela.setCustId(custId);
		segmentRela.setSegmentId(Long.parseLong(CmConstants.segment.NEW));
		segmentRela.setRegionId(CmCommonUtil.getDefaultRegionId());
		segmentRela.setState(CmConstants.RecordState.USE);
		segmentRelaSV.saveSegmentRela(segmentRela);
	}

	private void ifHaveContract(long custId) throws Exception {
		IAgreementFSV fservice = (IAgreementFSV) ServiceFactory.getService(IAgreementFSV.class);
		//只查有效合同
		DataContainer[] dc = fservice.getB2BAgreementListForOSByCond(custId, "", "", 9050L, null, null);
		if (null != dc && dc.length > 0) {
			// 说明客户下面有合同需要插入TT工单
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = custSV.queryDKCustomer(custId);
			Map map = new HashMap();
			map.put("CUST_ID", String.valueOf(custId));
			map.put("ERROR_CODE", "CM");
			map.put("ERROR_MESSAGE", "The customer has been terminated,but it has contract");
			map.put("SOURCE_SYSTEM", "KOB");
			map.put("ERROR_EXT_INFO", custValue.getCustCertCode());
			// 调用TT工单
			CmCommonUtil.CreateTicketForCM(map);
		}
	}

	public IBOCmPartyValue[] queryPartyByCprId(long cprId) throws Exception {
		if (cprId > 0) {
			StringBuilder condition = new StringBuilder(" 1=1 ");
			HashMap parameter = new HashMap();
			condition.append(" AND ").append(IBOCmPartyValue.S_CprId).append(" =:cprId ");
			parameter.put("cprId", String.valueOf(cprId));
			return (IBOCmPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyBean.class, condition.toString(), parameter, -1, -1);
		}
		return null;
	}

	@Override
	public IBOBsStaticDataValue[] queryAcctCategory(long custId) throws Exception {
		int custType = CmCommonUtil.getCustType(custId);
		if (custType == CmConstants.CustomerType.GROUP) {
			return StaticDataUtil.getStaticData("CM_GRP_INSTALLMENT_FLAG");
		} else {
			return StaticDataUtil.getStaticData("CM_INSTALLMENT_FLAG");
		}

	}

	@Override
	public ICustOrganizeValue queryCustOrganizeByIdDK(long deptId) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		ICustOrganizeValue value = (ICustOrganizeValue) busi.queryDataById(deptId);
		return value;
	}

	@Override
	public ICustOrganizeValue[] queryAllSubCustOrganizesByParentId(long parentDeptId, int startNum, int endNum) throws Exception {
		List<ICustOrganizeValue> list = new ArrayList<>();
		Map allRecursionCustOrganizesMap = new HashMap();
		queryRecursionCustOrganizesByParentId(parentDeptId, list, allRecursionCustOrganizesMap);
		if (list.size() > 0) {
			return list.toArray(new ICustOrganizeValue[0]);
		}
		return null;
	}

	private void queryRecursionCustOrganizesByParentId(long parentDeptId, List list, Map allRecursionCustOrganizesMap) throws Exception {
		ICustOrganizeValue[] vals = CmServiceFactory.getCustomerSV().queryCustOrganizesByParentId(parentDeptId, -1, -1);
		if (vals != null && vals.length > 0) {
			for (int i = 0; i < vals.length; i++) {
				// 防止递归里面的死循环
				if (!allRecursionCustOrganizesMap.containsKey(vals[i].getDeptId())) {
					allRecursionCustOrganizesMap.put(vals[i].getDeptId(), vals[i].getDeptId());
					list.add(vals[i]);
					// 有子节点才进行递归调用
					if (vals[i].getDeptId() > 0) {
						int count = queryCustOrganizeCountByParentId(vals[i].getDeptId());
						if (count > 0) {
							queryRecursionCustOrganizesByParentId(vals[i].getDeptId(), list, allRecursionCustOrganizesMap);
						}
					}
				}
			}
		}
	}

	public ICustomerValue queryInheritInfoById(String rootCustId) throws Exception {
		ICustomerValue results = null;
		ICustManagerValue custMgrInfo = null;
		long custId = Long.parseLong(rootCustId);
		results = queryCustomerByCustId(custId);
		custMgrInfo = queryMainCustManagersByCustId(custId);
		ICmDkCustomerSV custSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		String str = custSV.maskCustCertCode(results.getCustType(), results.getCustCertCode());
		results.setCustCertCode(str);
		if (custMgrInfo != null) {
			results.setManagerName(custMgrInfo.getStaffName());
		}
		return results;
	}

	public ICustManagerValue[] queryAllCustMgrsByCustId(long custId, int startNum, int endNum) throws Exception {
		int custType = CmCommonUtil.getCustType(custId);
		AbstractCustManagerQueryBusiModelImpl busiModelImpl = (AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class);
		DataContainer critia = new DataContainer();
		critia.set(ICustomerValue.S_CustId, custId);
		critia.set(ICustomerValue.S_CustType, custType);
		critia.set(ICustomerValue.S_State, CmConstants.RecordState.USE);
		ICustManagerValue[] custManagerValues = (ICustManagerValue[]) busiModelImpl.queryData(new DataContainer[] { critia }, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(custManagerValues)) {
			ICmCustSegmentRelaSV cmCustSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			for (int i = 0; i < custManagerValues.length; i++) {
				long managerId = custManagerValues[i].getManagerId();
				IQBOSecCustManagerValue secStaff = null;
				// 取得细分
				IBOCmCustSegmentRelaValue BOCmCustSegmentRela = cmCustSegmentRelaSV.querySegmentRelaByCustId(custId);
				if (CmCommonUtil.isNotEmptyObject(BOCmCustSegmentRela)) {
					if (CmConstants.segment.SA.equals(String.valueOf(BOCmCustSegmentRela.getSegmentId()))) {
						// 客户经理组
						IBOSecGroupValue ibOrganizeValue = OrgmodelClient.getGroupValueByGroupId(managerId);
						if (ibOrganizeValue != null) {
							custManagerValues[i].setManagerId(ibOrganizeValue.getGroupId());
							custManagerValues[i].setStaffName(ibOrganizeValue.getGroupName());
							custManagerValues[i].setBillId("");
							custManagerValues[i].setContEmail("");
						}
					} else {
						// 客户经理
						if (managerId > 0) {
							secStaff = iseCm.getEffectAmInfo(managerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
						}
						if (CmCommonUtil.isNotEmptyObject(secStaff)) {
							custManagerValues[i].setManagerId(secStaff.getManagerid());
							custManagerValues[i].setStaffName(secStaff.getManagername());
							custManagerValues[i].setBillId(secStaff.getBillid());
							custManagerValues[i].setContEmail(secStaff.getEmail());
						}
					}
				}
			}
		}
		return custManagerValues;
	}

	public ICustomerValue[] queryCustForManagerAndLog(String xmlString, String segmentId, int start, int end) throws Exception {
		if (StringUtils.isBlank(xmlString)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		DataContainer[] dc = ParamUtil.parseXmlCriteria(xmlString);
		if (dc == null || dc.length < 1) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}

		// 保存查询记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("xmlString", dc[0]);
		paraMap.put("segmentId", segmentId);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.CUST_QRY, CmConstants.BusiLogType.CUSTOMER_LOG, -1, CmConstants.BusiLogOperType.QUERY, "", paraMap, methodDetail);

		// 取出查询条件中的客户经理字段 判断是否需要查询客户经理字段
		int custManagerFlag = dc[0].get("CUST_MANAGER_FLAG") == null ? -1 : Integer.valueOf(dc[0].get("CUST_MANAGER_FLAG").toString());
		// 查询managerId对象
		DataContainerInterface[] dataConta = queryUserCreditLevelTemp(dc[0], custManagerFlag, start, end, qryCustIdByTeamManager(dc[0]), segmentId);
		List list = new ArrayList();
		if (CmCommonUtil.isNotEmptyObject(dataConta)) {
			int len = dataConta.length;
			for (int i = 0; i < len; i++) {
				ICustomerValue icust = new CustomerBean();
				icust.copy(dataConta[i]);
				list.add(icust);
			}
		}
		ICustomerValue[] vals = (ICustomerValue[]) list.toArray(new ICustomerValue[0]);
		String custCertCode = null;
		for (int i = 0; i < vals.length; i++) {
			custCertCode = vals[i].getCustCertCode();
			if (StringUtils.isNotBlank(custCertCode)) {
				if (custCertCode.startsWith("K")) {
					vals[i].setRemarks("");
				} else {
					vals[i].setRemarks(String.valueOf(Long.parseLong(custCertCode)));
				}
			}
		}
		return vals;
	}

	public ICustomerValue queryCustomerMaskByCustIdAndLog(long custId) throws Exception {
		BOMaskHelper.setOperateMaskFlag();
		// 保存查询记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("custId", custId);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.CUST_QRY, CmConstants.BusiLogType.CUSTOMER_LOG, custId, CmConstants.BusiLogOperType.QUERY, "", paraMap, methodDetail);

		ICustomerValue customerValue = queryCustomerByCustId(custId, "");
		// modify by xialing,2013-08-07,修改OP_ID和ORG_ID对应的中文信息,附加在备注信息中
		if (customerValue != null) {
			long opId = customerValue.getOpId();
			long orgId = customerValue.getOrgId();
			if (opId > 0) {
				IBOSecOperatorValue oper = OrgmodelClient.getOperatorById(opId);
				if (oper == null || StringUtils.isBlank(oper.getCode())) {
					customerValue.setOpIdDesc(Long.toString(opId));
				} else {
					customerValue.setOpIdDesc(oper.getCode());
				}
			} else {
				customerValue.setOpIdDesc(StringUtils.EMPTY);
			}
			if (orgId > 0) {
				IBOSecOrganizeValue org = OrgmodelClient.getOrganizeByOrgId(orgId);
				if (org == null || StringUtils.isBlank(org.getOrganizeName())) {
					customerValue.setOrgIdDesc(Long.toString(orgId));
				} else {
					customerValue.setOrgIdDesc(org.getOrganizeName());
				}
			} else {
				customerValue.setOrgIdDesc(StringUtils.EMPTY);
			}
			// modify end
			// 外国集团的KOB-Number不展示，本国集团KOB-Number去除前面的0
			if (CmCommonUtil.getCustType(customerValue.getCustId()) == CmConstants.CustomerType.GROUP) {
				String kobNumber = customerValue.getCustCertCode();
				if (StringUtils.isNotBlank(kobNumber)) {
					// 判断是否为外国集团
					if (kobNumber.indexOf("K") < 0) {
						long kobNumberLocal = DataType.getAsLong(kobNumber);
						customerValue.setDiaplayAttr("CUST_CERT_CODE", "CUST_CERT_CODE_NAME", kobNumberLocal);
					} else {
						customerValue.setDiaplayAttr("CUST_CERT_CODE", "CUST_CERT_CODE_NAME", "");
					}
				}
			}
		}

		// 查询结束后清空模糊化标识，否则会影响别的查询
		BOMaskHelper.setOperateNotMaskFlag();
		BOMaskHelper.clearOperateMaskFlag();
		// 如果客户的first_name是"$$$$"则需要影藏
		if ("$$$$".equals(customerValue.getFirstName())) {
			customerValue.setDiaplayAttr("FIRST_NAME", "DIS_FIRST_NAME", " ");
			customerValue.setDiaplayAttr("LAST_NAME", "DIS_LAST_NAME", " ");
		}
		// 对reg_amount展示值做处理
		// long regAmount = customerValue.getRegAmount();
		// if (regAmount > 0) {
		// StringBuffer disRegAmount = new StringBuffer(String.valueOf(regAmount));
		// disRegAmount = disRegAmount.insert(String.valueOf(regAmount).length() - 2, ",");
		// customerValue.setDiaplayAttr("REG_AMOUNT", "DIS_REG_AMOUNT", disRegAmount.toString());
		// }
		if(customerValue!=null) {
			ICm2SoSV cmsv = (ICm2SoSV)ServiceFactory.getCrossCenterService(ICm2SoSV.class);
			IBOCmCustAdditionalInfoValue [] addionalInfo = cmsv.queryCustAdditionalInfo(custId);
			String noteString ="";
			if(addionalInfo!=null && addionalInfo.length>0) {
				if(CmCommonUtil.custRemarksCtrl()) {
					for(int i = 0;i<addionalInfo.length;i++) {
					  if("1".equals(addionalInfo[i].getExt1()) || StringUtils.isBlank(addionalInfo[i].getExt1())) {
						  noteString = addionalInfo[i].getNote();
					  }
					}
				}else {
					noteString = cmsv.getNoteString(addionalInfo);
				}
				if(StringUtils.isNotBlank(noteString)) {
					String result = URLDecoder.decode(noteString);
					if(result.length()>=2000){
						customerValue.setRemarks(result.substring(0,2000));
					}else{
						customerValue.setRemarks(result);
					}
				}
			}
		}
		return customerValue;
	}

	public IBOCmxIndivCustomerValue queryCmxIndivCustValueAndLog(long custId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map paraMap = new HashMap();
		condition.append(IBOCmxIndivCustomerValue.S_CustId).append(" = :custId ");
		paraMap.put("custId", Long.valueOf(custId));

		// 保存查询记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.CUST_QRY, CmConstants.BusiLogType.CUSTOMER_LOG, custId, CmConstants.BusiLogOperType.QUERY, "", paraMap, methodDetail);

		DataContainerInterface[] results = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmxIndivCustomerBean.class, condition.toString(), paraMap, -1, -1);
		if (results != null && results.length > 0) {
			IBOCmxIndivCustomerValue customerValue = new BOCmxIndivCustomerBean();
			customerValue.copy(results[0]);
			return customerValue;
		}
		return null;
	}

	public ICustomerValue[] queryCustomersAndLog(String xmlComdition, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlComdition);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			if (dcs[0].getAsInt(ICustomerValue.S_CustType) == CmConstants.CustomerType.INDIVIDUAL) {
				dcs[0].set("MATCH_TYPE", Integer.valueOf(CmConstants.MatchType.BOTH_MATCH));
			} else {
				dcs[0].set("MATCH_TYPE", Integer.valueOf(CmConstants.MatchType.BOTH_MATCH));
			}
		}
		// 保存查询记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("xmlString", dcs[0]);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.CUST_QRY, CmConstants.BusiLogType.CUSTOMER_LOG, -1, CmConstants.BusiLogOperType.QUERY, "", paraMap, methodDetail);

		ICustomerValue[] results = (ICustomerValue[]) ((AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class)).queryData(dcs,
				startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(results)) {
			return new ICustomerValue[0];
		}
		long[] custIds = new long[results.length];
		HashMap retMap = new HashMap();
		int custType = results[0].getCustType();
		for (int i = 0; i < results.length; i++) {
			custIds[i] = results[i].getCustId();
			retMap.put(custIds[i], results[i]);
			// 修改界面的展示字段：行业VOCATION、客户地址CUST_ADDRESS、客户层级 CUST_SEGMENT
			IBOCmGroupRelIndustryValue[] industrys = queryGroupIndustryForPage(custIds[i], -1, -1);
			if (CmCommonUtil.isNotEmptyObject(industrys)) {
				results[i].setVocationDesc(industrys[0].getIndustryId());
			}
			// 法律地址
			IQBOCmCustContMediumAndTypeValue[] mediums = queryCustContactMediumsForPage(custIds[i], CmConstants.AddressId.legalAddress, 1, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(mediums)) {
				results[i].setCustAddress(mediums[0].getAddressDetail());
			}
			// 客户层级
			IBOCmCustSegmentRelaValue segmentRela = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).querySegmentRelaByCustId(custIds[i]);
			if (CmCommonUtil.isNotEmptyObject(segmentRela)) {
				IBoCmCustSegmentValue segment = ((ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class)).querySegmentByIdfromCache(segmentRela.getSegmentId());
				results[i].setSegmentName(segment.getSegmentName());
			}
			// 对于客户如果first_name为"$$$$",则影藏客户名称
			if ("$$$$".equals(results[i].getFirstName())) {
				results[i].setDiaplayAttr("CUST_NAME", "DIS_CUST_NAME", " ");
			}
		}
		Map condMap = ParamUtil.transferDataContainersToMap(dcs);
		ICustManagerValue[] custManagerValues = null;
		if (condMap.containsKey(ICustomerValue.S_State) && CmConstants.RecordState.ERASE.equalsIgnoreCase(DataType.getAsString(condMap.get(ICustomerValue.S_State)))) {
			custManagerValues = queryCustManagersByCustIds(custIds, custType, CmConstants.RecordState.ERASE, startNum, endNum);
		} else {
			custManagerValues = queryCustManagersByCustIds(custIds, custType, -1, -1);
		}
		if (CmCommonUtil.isNotEmptyObject(custManagerValues)) {
			for (int i = 0; i < custManagerValues.length; i++) {
				ICustomerValue customerValue = (ICustomerValue) retMap.get(custManagerValues[i].getCustId());
				customerValue.initProperty("MANAGER_NAME", custManagerValues[i].getStaffName());
				customerValue.initProperty("MANAGER_ID", custManagerValues[i].getManagerId());
			}
		}
		for (int i = 0; i < results.length; i++) {
			if (results[i].getCustType() == 3) {
				String kobNumber = results[i].getCustCertCode();
				if (StringUtils.isNotBlank(kobNumber)) {
					// 判断是否为外国集团
					if (kobNumber.indexOf("K") < 0) {
						long kobNumberLocal = DataType.getAsLong(kobNumber);
						results[i].setDiaplayAttr("CUST_CERT_CODE", "CUST_CERT_CODE_NAME", kobNumberLocal);
					} else {
						results[i].setDiaplayAttr("CUST_CERT_CODE", "CUST_CERT_CODE_NAME", " ");
					}
				}
			}

		}

		return results;
	}

	public ICustomerValue[] queryCusts4GroupAndLog(String xmlComdition, String custStatus, int startNum, int endNum) throws Exception {
		ICustomerValue[] results = null;
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlComdition);
		Map paraMap = new HashMap();
		if (CmCommonUtil.isEmptyObject(dcs)) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (!CmCommonUtil.isEmptyObj(custStatus)) {
			dcs[0].set("CUST_STATUS", custStatus);
			paraMap.put("custStatus", custStatus);
		}
		// 保存查询记录
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		paraMap.put("xmlComdition", dcs[0]);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		commonSV.saveBusiLog(CmConstants.BusiLogId.CUST_QRY, CmConstants.BusiLogType.CUSTOMER_LOG, -1, CmConstants.BusiLogOperType.QUERY, "", paraMap, methodDetail);

		// 1.集团名称;2.集团产品;3.成员类型;4.集团账号
		int qryType = dcs[0].getAsInt("QRY_TYPE");
		long pageManagerId = -1; // 页面传递过来的客户经理编号
		switch (qryType) {
			case 1:
				pageManagerId = DataType.getAsLong(dcs[0].get("MANAGER_ID"));
				results = this.queryGroupCustByCdns(dcs[0], startNum, endNum);
				break;
			case 2:
				pageManagerId = DataType.getAsLong(dcs[0].get("MANAGER_CODE"));
				results = this.queryGroupCustByOfferId(dcs[0], startNum, endNum);
				break;
			case 3:
				int memberType = dcs[0].getAsInt("MEMBER_TYPE");
				String memberBillId = dcs[0].getAsString("MEMBER_BILL_ID");
				results = this.queryGroupCustByMember(memberType, memberBillId, startNum, endNum);
				break;
			case 4:
				long acctId = dcs[0].getAsLong("ACCOUNT_ID");
				results = this.queryGroupCustByAcctId(acctId, startNum, endNum);
				break;
			case 5:
				String billId = dcs[0].getAsString("BILL_ID");
				results = this.queryGroupCustByBillId(billId, startNum, endNum);
				break;
			default:
				break;
		}
		if (CmCommonUtil.isEmptyObject(results)) {
			return new ICustomerValue[0];
		}
		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		IQBOSecCustManagerValue secStaff = null;
		IBOCmGroupManagerValue gMgrRel = null;
		String groupLevel = "";
		String countyId = "";
		String custStats = "";
		ICmCustSegmentRelaSV cmCustSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		IBOCmCustSegmentRelaValue boCmCustSegmentRela = null;
		ICmCustSegmentSV cmCustSegmentSV = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		IBoCmCustSegmentValue boCmCustSegment = null;
		if (null != results) {
			for (int i = 0; i < results.length; i++) {
				results[i].setCustType(CmConstants.CustomerType.GROUP);

				// 设置枚举值的显示值
				groupLevel = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_CUST_SERVICE_LEVEL_3", String.valueOf(results[i].getCustServiceLevel()));
				results[i].setCustServiceLevelDesc(groupLevel);
				IBOBsCommonDistrictValue districtValue = BsCommonDistrictUtil.getCommonDistrictByCode(results[i].getCountyId(), 4);
				if (districtValue != null) {
					countyId = districtValue.getDistrictName();
				}
				results[i].setSubRegionTypeDesc(countyId);
				custStats = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_CUST_STATUS_3", String.valueOf(results[i].getCustStatus()));
				results[i].setCustStatusDesc(custStats);
				// 增加客户细分展现
				boCmCustSegmentRela = cmCustSegmentRelaSV.querySegmentRelaByCustId(results[i].getCustId());
				if (CmCommonUtil.isNotEmptyObject(boCmCustSegmentRela)) {
					results[i].setGroupSegmentId(String.valueOf(boCmCustSegmentRela.getSegmentId()));
					gMgrRel = cnGroupSv.queryGroupCustMgrRel(results[i].getCustId());
					if (gMgrRel != null) {
						if (CmConstants.segment.SA.equals(String.valueOf(boCmCustSegmentRela.getSegmentId()))) {
							// 客户经理组
							IBOSecGroupValue ibOrganizeValue = OrgmodelClient.getGroupValueByGroupId(gMgrRel.getManagerId());
							if (CmCommonUtil.isNotEmptyObject(ibOrganizeValue)) {
								results[i].setManagerId(ibOrganizeValue.getGroupId());
								results[i].setManagerName(ibOrganizeValue.getGroupName());
								results[i].setManagerPhone("");
							}
						} else {
							// 客户经理
							if (pageManagerId > 0) {
								secStaff = iseCm.getEffectAmInfo(pageManagerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
							} else {
								secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
							}
							if (CmCommonUtil.isNotEmptyObject(secStaff)) {
								results[i].setManagerId(secStaff.getManagerid());
								results[i].setManagerName(secStaff.getManagername());
								results[i].setManagerPhone(secStaff.getBillid());
							}
						}
					}
					boCmCustSegment = cmCustSegmentSV.querySegmentByIdfromCache(boCmCustSegmentRela.getSegmentId());
					results[i].setGroupCustSegment(boCmCustSegment.getSegmentName());
				}
			}
		}
		return results;
	}

	public ICustOrganizeValue[] queryCustOrgByDept(long custId, String deptName, int startNum, int endNum) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		if (StringUtils.isNotBlank(deptName)) {
			dContainer.set(ICustOrganizeValue.S_DeptName, deptName);
		}
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);// 查询子部门
		ICustOrganizeValue[] values = (ICustOrganizeValue[]) busi.queryData(new DataContainer[] { dContainer }, startNum, endNum);
		return values;
	}

	public int queryCustOrgCountByDept(long custId, String deptName) throws Exception {
		AbstractCustOrganizeQueryBusiModelImpl busi = (AbstractCustOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustOrganizeQueryBusiModelImpl.class);
		DataContainer dContainer = new DataContainer();
		dContainer.set(ICustOrganizeValue.S_CustId, custId);
		if (StringUtils.isNotBlank(deptName)) {
			dContainer.set(ICustOrganizeValue.S_DeptName, deptName);
		}
		dContainer.set(ICustOrganizeValue.S_DeptType, CmConstants.CustomerOrg.DEPARTMENT);// 查询子部门
		return busi.queryCount(new DataContainer[] { dContainer });
	}

	public void saveCprToTtTask(long cprId, String errorCode, String errorMsg) throws Exception {
		BOCmCprToTTBean bean = new BOCmCprToTTBean();
		String regionId = CmCommonUtil.getDefaultRegionId();
		Timestamp currDatetime = ServiceManager.getOpDateTime();
		bean.setTaskId(CmCommonUtil.getNewSequence(BOCmCprToTTBean.class));
		bean.setCprId(cprId);
		bean.setErrorCode(errorCode);
		bean.setErrorMsg(errorMsg);
		bean.setState("U");
		bean.setRegionId(regionId);
		bean.setCreateOpId(ServiceManager.getUser().getID());
		bean.setCreateOrgId(ServiceManager.getUser().getOrgId());
		bean.setOpId(ServiceManager.getUser().getID());
		bean.setOrgId(ServiceManager.getUser().getOrgId());
		bean.setDoneCode(ServiceManager.getDoneCode());
		bean.setCreateDate(currDatetime);
		bean.setDoneDate(currDatetime);
		bean.setEffectiveDate(currDatetime);
		bean.setExpireDate(TimeUtil.getMaxExpire());
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public IBOCmCprToTTValue[] qryCprToTtTask(long cprId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (cprId > 0) {
			condition.append(" AND ").append(IBOCmCprToTTValue.S_CprId).append(" = :cprId ");
			parameter.put("cprId", cprId);
		}
		// 当前有效的
		condition.append(" AND ");
		condition.append(IBOCmIndivCustomerValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		IBOCmCprToTTValue[] cmCprtoTTValue = (IBOCmCprToTTValue[]) CmInnerServiceFactory.getCommonInnerSV()
				.getBeans(BOCmCprToTTBean.class, condition.toString(), parameter, -1, -1);
		return cmCprtoTTValue;
	}
	
	/**
	* <p>Title: 查询AKS 客户备案数据记录 </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2017-10-31
	* ICmCustomerSV
	 */
	@Override
	public IBOCmCustPutOnRecordValue qryCustPutOnRecordByCustId(long custId)
			throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmCustPutOnRecordValue[] values = (IBOCmCustPutOnRecordValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustPutOnRecordBean.class, condition.toString(), parameter,
				-1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}
	
	public IBOCmInsCmrelValue[] queryAllValidCmInsCmrelByCustId(long custId) throws Exception{
		String condition = "SELECT A.USER_REGION_CODE,A.RELA_TYPE FROM {CM_INS_CMREL} A WHERE A.STATE = 1 AND A.CUST_ID = :CUST_ID ";
		HashMap map = new HashMap();
		map.put("CUST_ID", custId);
		String sql = SplitTableFactory.createQuerySQL(condition, map);
		IBOCmInsCmrelValue[] insValues = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmInsCmrelBean.class, sql, map);
		return insValues;
	}
	
	/**
	 * payer 联系媒介发billing
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-10-3
	* CmCustomerSVImpl
	 */
	public void sendPayerAddressToBilling(long partyId, boolean deleteFlag) throws Exception {
		Map result1 = new HashMap();
		// payer信息
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IQBOCmPartyValue partyValue = partySV.queryPayerByPartyId(partyId);
		if (CmCommonUtil.isNotEmptyObject(partyValue) &&  partyValue.getPartyId()>0) {
			List addressList = new ArrayList();
			Map temp0 = new HashMap();
			temp0.put("PAYER_ID", partyId);
			temp0.put("PAYER_TYPE", partyValue.getPartyType());
			if (partyValue.getPartyType() == 1) {
				temp0.put("FAMILY_NAMES", partyValue.getLastName());
				temp0.put("MIDDLE_NAMES", partyValue.getFirstName());
			} else {
				temp0.put("FAMILY_NAMES", partyValue.getPartyName());
				temp0.put("MIDDLE_NAMES", "");
			}

			temp0.put("BIRTHDAY", partyValue.getBirthday());
			temp0.put("ADDRESS_ID", StringUtils.trim(partyValue.getContAddress()));
			temp0.put("ADDRESS", partyValue.getRemarks());
			temp0.put("VALID_DATE", partyValue.getCreateDate());
			temp0.put("COMMIT_DATE", ServiceManager.getOpDateTime());
			temp0.put("EXPIRE_DATE", TimeUtil.getMaxExpire());
			temp0.put("TENANT_ID", TenantIDFactory.getTenantId());
			temp0.put("DONE_CODE", ServiceManager.getDoneCode());
			if (partyValue.getPartyType() == 1) {
				// 个人为cpr
				temp0.put("TAX_NO", partyValue.getCertCode());
			} else {
				//集团为税号
				//根据partyId查询payer对应账户拥有者的客户的税号
				String taxId="";
				String sql="SELECT * FROM {CM_PARTY_ACCT_REL} T,{CM_GROUP_CUSTOMER} K,{CMX_GROUP_CUSTOMER} M WHERE T.PARTY_ID=K.PARTY_ID AND K.CUST_ID=M.CUST_ID and T.PARTY_ID=:partyId";
				Map parameter=new HashMap();
				parameter.put("partyId", partyId);
				DataContainer dc[]=(DataContainer[])CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
				if(dc!=null&&dc.length>0){
					taxId=dc[0].getAsString("TAX_ID");
				}
				temp0.put("TAX_NO", taxId);
			}
			
/*			IBOCmPartyContactValue[] emailContactValue = partySV.queryPartyContact(partyId);
			if(null!=emailContactValue&&emailContactValue.length>0){
				//查询email排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
				IQBOCmContactContMediumInfoValue[] emailContMediums = (IQBOCmContactContMediumInfoValue[]) cmCustomerSV.queryContactContMediumInfoByContId(emailContactValue[0].getContId(),201, -1, -1);
				if(null!=emailContMediums&&emailContMediums.length>0){
					temp0.put("PAYER_EMAIL", emailContMediums[0].getEmailAddress());
				}
				
				//查询phonenum 排序为最小的记录 //CUST:PHONE_NUMBER CUST_EMAIL PAYER:PHONE_NUMBER PAYER_EMAIL 
				IQBOCmContactContMediumInfoValue[] phonenumContMediums = (IQBOCmContactContMediumInfoValue[]) cmCustomerSV.queryContactContMediumInfoByContId(emailContactValue[0].getContId(),301, -1, -1);
				if(null!=phonenumContMediums&&phonenumContMediums.length>0){
					temp0.put("PHONE_NUMBER", phonenumContMediums[0].getContNumber());
				}
			}*/
			
			// 建帐户时的payer只有新增操作payer信息的修改在abstractpartyDealbusimodeimpl
			if (deleteFlag) {
				temp0.put("OPER_TYPE", 3);
			} else {
				temp0.put("OPER_TYPE", 2);
			}
			temp0.put("OP_ID", partyValue.getOpId());
			temp0.put("ORG_ID", partyValue.getOrgId());
			addressList.add(temp0);
			result1.put("I_PAYER", addressList);
			IInterfaceBillCrmSV interfaceBillCrmSV = (IInterfaceBillCrmSV) ServiceFactory.getService(IInterfaceBillCrmSV.class);	
			interfaceBillCrmSV.sendMapOrderInfoToBilling(result1);
		}
	}
	
	/**
	 * 根据custId和批量的UserId获取关系数据
	 * @param custId
	 * @param userIdList
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrelForBatchUserId(long custId, List userIdList) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		HashMap parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", custId);
		}
		if (null != userIdList&&userIdList.size() > 0) {
			condition.append(" AND ").append(IBOCmInsCmrelValue.S_UserId).append(" IN (");
			for (int i = 0; i < userIdList.size(); i++) {
				condition.append(String.valueOf(userIdList.get(i)));
				if(i!=userIdList.size()-1) {
					condition.append(" , ");
				}
			}
			condition.append(" ) ");
		}
		condition.append(" ORDER BY USER_ID ASC ");

		IBOCmInsCmrelValue[] contMediums = (IBOCmInsCmrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsCmrelBean.class, condition.toString(), parameter, -1,
				-1);
		if (null != contMediums && contMediums.length > 0) {
			return contMediums;
		}
		return new IBOCmInsCmrelValue[0];
	}
	
	/**
	 * 查询客户用户关系记录
	 * @param customerId
	 * @param userIdList
	 * @return
	 */
	public DataContainer[] queryCustomerAndSubscriptionRelationship(long customerId,List<String> userIdList) throws Exception{
		
		int stepNum = 100;
		//判断userIDList的数量是多少，每次查询最多100个UserId
		int userSqlNum = userIdList.size()/stepNum;
		if(userSqlNum*100<userIdList.size()) {
			userSqlNum++;
		}
		List<DataContainer> cmInsCmrelResult = new ArrayList<DataContainer>();
		int startNumber = 0;
		int endNumber = 0;
		for (int i = 0; i < userSqlNum; i++) {
			List<String> userIdListTemp = null;
			if(startNumber==0&&endNumber==0) {
				startNumber = 0;
				if(i==userSqlNum-1) {
					endNumber = userIdList.size();
				}else {
					endNumber = (i+1)*stepNum;
				}
			}else if(endNumber > 0) {
				startNumber =  endNumber; 
				if(endNumber+stepNum>=userIdList.size()) {
					endNumber = userIdList.size();
				}else {
					endNumber = endNumber+stepNum;
				}
			}
			userIdListTemp = userIdList.subList(startNumber, endNumber);
			IBOCmInsCmrelValue[]  cmInsCmrelQueryResult = queryCmInsCmrelForBatchUserId(customerId,userIdListTemp);
			dealCmInsCmrelValidDate(cmInsCmrelQueryResult,cmInsCmrelResult);
		}
		if(null!=cmInsCmrelResult&&cmInsCmrelResult.size()>0) {
			return cmInsCmrelResult.toArray(new DataContainer[0]);
		}
		return null;
	}
	
	/**
	 * 处理需要返回的客户用户关系和时间数据
	 * @param cmInsCmrelQueryResult
	 * @param cmInsCmrelResult
	 */
	public void dealCmInsCmrelValidDate(IBOCmInsCmrelValue[]  cmInsCmrelQueryResult,List<DataContainer> cmInsCmrelResult) {
		Map<Long,List<Long>>  stateMap = new HashMap(); 
		Map<Long,List<DataContainer>>  cmInsCmrelDataContainer = new HashMap(); 
		for(IBOCmInsCmrelValue cmInsCmrelValue : cmInsCmrelQueryResult) {
			DataContainer cmInsCmrelDC = new DataContainer();
			long userId = cmInsCmrelValue.getUserId();
			long state = cmInsCmrelValue.getState();
			long custId = cmInsCmrelValue.getCustId();
			long relaType = cmInsCmrelValue.getRelaType(); 
			Timestamp createDate = cmInsCmrelValue.getCreateDate();
			Timestamp doneDate = cmInsCmrelValue.getDoneDate();
			Timestamp effectiveDate = cmInsCmrelValue.getEffectiveDate();
			Timestamp expireDate = cmInsCmrelValue.getExpireDate();
			cmInsCmrelDC.set("CustomerId", custId);
			cmInsCmrelDC.set("UserId", userId);
			cmInsCmrelDC.set("RelationType", relaType);
			cmInsCmrelDC.set("EffectiveDate", createDate);
			cmInsCmrelDC.set("ExpireDate", doneDate);
			if(CmConstants.CmInsRela.NORMAL==state) {
				cmInsCmrelDC.set("EffectiveDate", effectiveDate);
				cmInsCmrelDC.set("ExpireDate", expireDate);
			}
			if(stateMap.containsKey(userId)) {
				stateMap.get(userId).add(state);
				cmInsCmrelDataContainer.get(userId).add(cmInsCmrelDC);
			}else {
				List<Long> stateList = new ArrayList<Long>();
				stateList.add(state);
				stateMap.put(userId,stateList);
				List<DataContainer> cmInsCmrelDCTemp = new ArrayList();
				cmInsCmrelDCTemp.add(cmInsCmrelDC);
				cmInsCmrelDataContainer.put(userId,cmInsCmrelDCTemp);
			}
		}
		
		for(Map.Entry<Long,List<Long>> entryStemp :stateMap.entrySet()) {
			if(!entryStemp.getValue().contains(Long.valueOf(CmConstants.CmInsRela.NORMAL))) {
				cmInsCmrelDataContainer.remove(entryStemp.getKey());
			}
		}
		
		for(Map.Entry<Long,List<DataContainer>> entryStemp :cmInsCmrelDataContainer.entrySet()) {
			cmInsCmrelResult.addAll(entryStemp.getValue());
		}
	}
	
	/**
	 * 根据type=“POA” 和CustId 查询POA 信息
	 */
	public String queryPOAInfoByTypeAndCustId(String custId, String poaType) throws Exception{
		String resultPoa = queryPoaResult(custId); 
		return resultPoa;
	}
		
	/**
	 * 获取PoA的列表
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] queryPOAList(String custId, int startNum, int endNum) throws Exception {
		String resultPoa = queryPoaResult(custId);
		List<DataContainerInterface> allPOAList = new ArrayList<DataContainerInterface>();
		if(StringUtils.isNotEmpty(resultPoa)&&!resultPoa.equalsIgnoreCase("[]")) {
			JSONArray jsonArrayResult = new JSONArray();
			jsonArrayResult = JSONArray.fromString(resultPoa);
			for (int i = 0; i < jsonArrayResult.length(); i++) {
				try {
					DataContainerInterface item = new DataContainer();
					JSONObject jsonObjectTemp = (JSONObject) jsonArrayResult.opt(i);
					String  strAgrType = String.valueOf(jsonObjectTemp.opt("agreementType"));
					if(StringUtils.isNotEmpty(strAgrType)&&strAgrType.equalsIgnoreCase("POA")) {
						JSONArray jsonArrayEngageParty = (JSONArray) jsonObjectTemp.opt("engagedParty");
						for (int j = 0; j < jsonArrayEngageParty.length(); j++) {
							JSONObject jsonObjectTempEngageParty = (JSONObject) jsonArrayEngageParty.opt(j);
							String roleString = String.valueOf(jsonObjectTempEngageParty.opt("role"));
							String fullNameString = String.valueOf(jsonObjectTempEngageParty.opt("fullName"));
							String birthday = String.valueOf(jsonObjectTempEngageParty.opt("birthDate"));
							if("RECEIVER".equals(roleString)){
								item.set("RECEIVER_FULL_NAME", fullNameString);
								JSONObject agreementPeriodObject = (JSONObject) jsonObjectTemp.opt("agreementPeriod"); 
								if(judgeTime(String.valueOf(agreementPeriodObject.opt("endDateTime")).substring(0,10))) {
									item.set("STATUS", "Active");
								}else {
									item.set("STATUS", "Expired");
								}
								item.set("EXPIRY_DATE", String.valueOf(agreementPeriodObject.opt("endDateTime")).substring(0,10));
								item.set("EXPDATE", String.valueOf(agreementPeriodObject.opt("endDateTime")));
								item.set("EFFDATE", String.valueOf(agreementPeriodObject.opt("startDateTime"))); 
								item.set("BIRTHDAY", birthday);
							}
						}
						allPOAList.add(item);
					}
				}catch (Exception e) {
					log.error(e.getMessage());
				}
			}
		} 
		
		if(null!=allPOAList&&allPOAList.size()>0) {
			return allPOAList.toArray(new DataContainerInterface[0]);
		}
		return new DataContainerInterface[0];
	}
	
	public int queryPOAListCount(String custId) throws Exception{
		int iCount = 0;
		String resultPoa = queryPoaResult(custId);
		List<DataContainerInterface> allPOAList = new ArrayList<DataContainerInterface>();
		if(StringUtils.isNotEmpty(resultPoa)&&!resultPoa.equalsIgnoreCase("[]")) {
			JSONArray jsonArrayResult = new JSONArray();
			jsonArrayResult = JSONArray.fromString(resultPoa);
			for (int i = 0; i < jsonArrayResult.length(); i++) {
				try {
					DataContainerInterface item = new DataContainer();
					JSONObject jsonObjectTemp = (JSONObject) jsonArrayResult.opt(i);
					String  strAgrType = String.valueOf(jsonObjectTemp.opt("agreementType"));
					if(StringUtils.isNotEmpty(strAgrType)&&strAgrType.equalsIgnoreCase("POA")) {
						iCount++;
					}
				}catch (Exception e) {
					log.error(e.getMessage());
				}
			}
		}
		return iCount;
	}
	
	/**
	 * 查询poa
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public String queryPoaResult(String custId)  throws Exception {
		String resultPoa = null;
		String resultException = null;
		try {
			IUip2CmSV uip2CmSv = (IUip2CmSV)ServiceFactory.getService(IUip2CmSV.class);
			resultPoa = uip2CmSv.queryPoaByPoaTypeAndCustId(custId,"POA");
		}catch (Exception e) {
			resultException = e.getMessage();
			throw e; 
		}finally {
			try {
				//inoutlog日志
				if(StringUtils.isNotEmpty(resultException)) {
					resultPoa +=resultException;
				}
				IRecordLogSV recordSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
				recordSV.saveLog(Long.valueOf(custId), 0L, 0L, "", 0L, "POA_INTERFACE", resultPoa, RBossConst.CRM_CALL_OUT, "Call ESB POA Interface");
			}catch (Exception e1) {
				 log.error("custId="+custId + " call poainterface "+e1.getMessage());
			}
		}
		
		return resultPoa;
	}
	
	public boolean judgeTime(String endDate) {
		boolean boResult = false;
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date nowDate = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
			Date oldDate = simpleDateFormat.parse(endDate);
			boResult = oldDate.after(nowDate);
		} catch (ParseException e) {
			log.error(e.getMessage());
		}
			
		return boResult;
	}
	

	public static void main(String[] args) throws Exception {
		/**
		System.setProperty("tenant.id", "21"); 
		
		UserInfoInterface user = ServiceManager.getNewBlankUserInfo();
		user.setID(100000030L);//操作员ID operator_id
		user.setOrgId(21000000L);
		user.setCode("21andy");
		user.set("REGION_ID", "2100");
		user.set("TENANT_ID", "21");
		user.set("DISTRICT_ID", "1001000");
		user.set(RBossConst.TASK_INTER_FLAG, "Y");
		user.set(RBossConst.PUBINFO_CHANNEL_TYPE, "10010");
		user.set("IS_ADMIN", "true");
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, "2100");
		ServiceManager.setServiceUserInfo(user);
		**/
		CmCustomerSVImpl a = new CmCustomerSVImpl();
		String endTime = "2022-04-02";
		a.judgeTime(endTime);
		//DataContainer[] b = a.queryCustomerAndSubscriptionRelationship(21210916879823l,userIdList);
		// int c = a.queryPayerByDtsCount(3, 23210510014651l, null, null, null, null, -1, null, null, null);
		//System.out.println(b);
	}

	@Override
	public void dealGroupUserToGroupCust(long custId, long userId, long oldCustId, long orderId) throws Exception {
		// 生成用户与新集团客户的归属关系
		dealCreateIndivCustomer(custId, userId, "N");
		// 删除用户与原集团客户的归属关系
		dealDeleteCustUserRel(oldCustId, userId);
				
		// AI-12523判断原客户下是否还有有效用户，没有则变更原客户为离网客户
		dealValidateUser(oldCustId, userId, orderId);
				
		// 与C3的交互
		dealCustToCustOfC3(oldCustId, custId, userId);
		
	}
	
	public void dealGroupUserToIndivCust(long custId, long userId, long oldCustId, long orderId) throws Exception {
		// 生成用户与个人客户的归属关系
		dealCreateIndivCustomer(custId, userId, "N");
		// 删除用户与原集团客户的归属关系
		dealDeleteCustUserRel(oldCustId, userId);
		
		// AI-12523判断原客户下是否还有有效用户，没有则变更原客户为离网客户
		dealValidateUser(oldCustId, userId, orderId);
		
		// 个人客户变更为在网客户
		ICustomerValue value = queryCustomerByCustId(custId);
		value.setCustStatus(CmConstants.CustomerStatus.INDIV_ACTIVE);
		saveCustomer(value);
		// 与C3的交互
		dealCustToCustOfC3(oldCustId, custId, userId);
	}

	
}
