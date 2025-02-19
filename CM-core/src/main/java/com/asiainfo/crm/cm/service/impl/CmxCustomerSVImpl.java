package com.asiainfo.crm.cm.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.web.CustomProperty;
import com.ai.appframe2.web.HttpUtil;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.ai.secframe.common.Constants;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.asiainfo.crm.cm.batch.bo.BOCmBatchDataBean;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataValue;
import com.asiainfo.crm.cm.batch.service.interfaces.ICmBatchCommomSV;
import com.asiainfo.crm.cm.batch.service.interfaces.ICmBatchDataSV;
import com.asiainfo.crm.cm.batch.util.CmBatchUtil;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractCustContactDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelForSHImpl;
import com.asiainfo.crm.cm.busimodel.rule.CmxPrivBusiRule;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmConstants.TenantId;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmCustPutOnRecordValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmGroupCustContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContractBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustAttrBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxBusiIntelBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxCustLanguageBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupAddInfoBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxGroupOutMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustExtBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContractValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerHValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxBusiIntelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustLanguageValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustRealNameInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustSecondCardInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupAddInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupCreditPointRecValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupInformInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxGroupOutMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustHisValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupMemberExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxGroupOrgStructValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmManagerValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxIndivPartyHobbyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxPartyContTypeInfoValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnClubServiceSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CmBusiLogBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.bo.CustManagerBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmClubMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmManagerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmxCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmxGroupCustInnerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.common.mask.BOMaskHelper;
import com.asiainfo.crm.constant.RBossConst;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName CmxCustomerSVImpl
 * @Description 客户类的使用
 *
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-3-14 上午10:08:10
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-14     zhangyin           v1.0.0               修改原因<br>
 */
public class CmxCustomerSVImpl implements ICmxCustomerSV {

	private static transient Log log = LogFactory.getLog(CmxCustomerSVImpl.class);

	public void saveCustomerExt(IVOCustValue custValue) throws Exception {
		AbstractCustomerDealBusiModelImpl customerDealBusiModelImpl = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		customerDealBusiModelImpl.deal(custValue);
	}

	public IBOCmxIndivCustExtValue queryCustomerExt(long custId) throws Exception {
		IBOCmxIndivCustExtValue indivCustExtValue = CmxServiceFactory.getCmxIndivCustInnerSV().queryIndivCustExt(custId);
		return indivCustExtValue;
	}

	public DataContainer[] queryCustomers(String xmlComdition, int startNum, int endNum) throws Exception {
		DataContainer[] custValues = (DataContainer[]) ((AbstractCustomerQueryBusiModelForSHImpl) CmxServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelForSHImpl.class))
				.queryData(xmlComdition, startNum, endNum);
		return custValues;
	}

	public int queryCustomerCount(String xmlComdition) throws Exception {
		return ((AbstractCustomerQueryBusiModelForSHImpl) CmxServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelForSHImpl.class)).queryCount(xmlComdition);
	}

	public DataContainer queryManager(long custId) throws Exception {
		if (custId > 0) {
			ICustManagerValue custManager = CmServiceFactory.getCustomerSV().queryMainCustManagersByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(custManager)) {
				return (DataContainer) custManager;
			}
		}
		return null;
	}

	public IQBOCmxGroupOrgStructValue[] queryGroupOrgStruct(long custId, int startNum, int endNum) throws Exception {
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupOrgStruct(custId, startNum, endNum);
	}

	public int queryGroupOrgStructCount(long custId) throws Exception {
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupOrgStructCount(custId);
	}

	public boolean checkGroupOrgParent(long custId, long deptId) throws Exception {
		return CmxServiceFactory.getCmxGroupCustInnerSV().checkGroupOrgParent(custId, deptId);
	}

	public boolean checkDeptName(long custId, String deptName) throws Exception {
		return CmxServiceFactory.getCmxGroupCustInnerSV().checkDeptName(custId, deptName);
	}

	public IQBOCmxGroupOrgStructValue queryGroupOrgStructByDeptId(long deptId) throws Exception {
		IQBOCmxGroupOrgStructValue[] cmxGroupOrgStructvalue = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupOrgStructByDeptId(deptId, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmxGroupOrgStructvalue)) {
			return cmxGroupOrgStructvalue[0];
		}
		return null;
	}

	public DataContainer[] queryCustExtAndContact(long custId) throws Exception {
		DataContainer containerDC = new DataContainer();
		DataContainer targetBo = null;
		String[] paramNames = null;
		ICustomerValue customerValue = null;
		try {
			// 设置免模糊化标识，避免多次模糊化，对系统性能产生影响
			BOMaskHelper.setOperateNotMaskFlag();
			customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		} finally {
			// 查询完成之后一定记得清楚免模糊化标识，避免因为前面查询出现异常对后面的业务造成影响。
			BOMaskHelper.clearOperateMaskFlag();
		}
		if (CmCommonUtil.isNotEmptyObject(customerValue)) {
			containerDC.copy(customerValue);
			IBOCmxIndivCustExtValue custExtValue = this.queryCustomerExt(custId);
			if (CmCommonUtil.isNotEmptyObject(custExtValue)) {
				targetBo = (DataContainer) BOCmxIndivCustExtBean.class.newInstance();
				paramNames = targetBo.getPropertyNames();
				for (int i = 0; i < paramNames.length; i++) {
					if (custExtValue.get(paramNames[i]) != null) {
						containerDC.initProperty(paramNames[i], custExtValue.get(paramNames[i]));
					}
				}
			}
			if (!containerDC.hasProperty(IBOCmxIndivCustExtValue.S_ActivateChannelType)) {
				containerDC.initProperty(IBOCmxIndivCustExtValue.S_ActivateChannelType, CmxConstants.ActivateChannelType.NORMAL_SELL);
			}
			IBOCmxCustSecondCardInfoValue custSecondCardInfoValue = this.queryCustSecondCardInfo(custId);
			if (custSecondCardInfoValue != null) {
				containerDC.initProperty(IBOCmxCustSecondCardInfoValue.S_SecondCertType, custSecondCardInfoValue.getSecondCertType());
				if (custSecondCardInfoValue.getSecondCertType() == 4) {
					containerDC.initProperty("SECOND_CERT_CODE2", custSecondCardInfoValue.getSecondCertCode());
				} else {
					containerDC.initProperty(IBOCmxCustSecondCardInfoValue.S_SecondCertCode, custSecondCardInfoValue.getSecondCertCode());
				}
			}
			// 调用
			BOMaskHelper.mask(containerDC, CustomerBean.class);
		}
		return new DataContainer[] { containerDC };
	}

	public IQBOCmxGroupMemberExtValue queryGroupMemberExt(long relId) throws Exception {
		IQBOCmxGroupMemberExtValue cmxGroupMemberExtValue = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupMemberExt(relId);
		if (CmCommonUtil.isNotEmptyObject(cmxGroupMemberExtValue)) {
			return cmxGroupMemberExtValue;
		}
		return null;
	}

	public DataContainer[] queryGroupImportMemInfo(long custId, long custContId, long partyId) throws Exception {
		DataContainer containerDC = new DataContainer();
		DataContainer targetBo = null;
		String[] paramNames = null;
		DataContainer containerDC1 = new DataContainer();
		IContactValue contactValue = CmServiceFactory.getContactSV().queryCustContactById(custContId, custId);
		if (CmCommonUtil.isNotEmptyObject(contactValue)) {
			containerDC.copy(contactValue);
			containerDC1.initProperty(IPartyValue.S_PartyId, partyId);
			containerDC1.initProperty(IPartyValue.S_PartyType, 1);
			IPartyValue[] partyValue = CmServiceFactory.getPartySV().queryPartys(containerDC1, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				targetBo = (DataContainer) PartyBean.class.newInstance();
				paramNames = targetBo.getPropertyNames();
				for (int i = 0; i < paramNames.length; i++) {
					containerDC.initProperty(paramNames[i], partyValue[0].get(paramNames[i]));
				}
			}
		}
		return new DataContainer[] { containerDC };
	}

	public IBOCmxIndivPartyHobbyValue[] queryPartyHobbyBypartyId(long partyId, int hobbyType, int startNum, int endNum) throws Exception {
		IBOCmxIndivPartyHobbyValue[] cmxIndivPartyHobbyValues = CmxServiceFactory.getCmxPartyInnerSV().queryIndivPartyHobby(partyId, hobbyType, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(cmxIndivPartyHobbyValues)) {
			return cmxIndivPartyHobbyValues;
		}
		return new IBOCmxIndivPartyHobbyValue[0];
	}

	public int queryPartyHobbyCountBypartyId(long partyId, int hobbyType) throws Exception {
		return CmxServiceFactory.getCmxPartyInnerSV().queryindivPartyHobbyCount(partyId, hobbyType);
	}

	public IBOCmxPartyContTypeInfoValue[] queryGroupContTypeBypartyId(long partyId, int startNum, int endNum) throws Exception {
		IBOCmxPartyContTypeInfoValue[] cmxPartyContTypeInfoValues = CmxServiceFactory.getCmxPartyInnerSV().queryPartyContTypeInfo(partyId, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(cmxPartyContTypeInfoValues)) {
			return cmxPartyContTypeInfoValues;
		}
		return new IBOCmxPartyContTypeInfoValue[0];
	}

	public int queryGroupContTypeCountBypartyId(long partyId) throws Exception {
		return CmxServiceFactory.getCmxPartyInnerSV().queryPartyContTypeInfoCount(partyId);
	}

	public void saveGroupMemPartyInfoExt(IVOCustValue custValue) throws Exception {
		AbstractCustContactDealBusiModelImpl custContactDealBusiModelImpl = (AbstractCustContactDealBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractCustContactDealBusiModelImpl.class);
		custContactDealBusiModelImpl.deal(custValue);
	}

	public IBOCmxIndivCustHisValue[] queryIndivCustHis(String opName, long custId, String startDate, String endDate, int startNum, int endNum) throws Exception {
		// IBOSecOperatorValue secOperatorValue = CmxServiceFactory.getCmxSec2CmSV().getOperatorByCode(opName);
		// if (secOperatorValue != null) {
		// IBOCmxIndivCustHisValue[] indivCustHisValues =
		// CmxServiceFactory.getCmxIndivCustInnerSV().queryIndivCustHis(secOperatorValue.getOperatorId(), custId, "",
		// startDate,
		// endDate, startNum, endNum);
		// if (CmCommonUtil.isNotEmptyObject(indivCustHisValues)) {
		// return indivCustHisValues;
		// }
		// }
		// return new IBOCmxIndivCustHisValue[0];
		return null;
	}

	public int queryIndivCustHisCount(String opName, long custId, String startDate, String endDate) throws Exception {
		// IBOSecOperatorValue secOperatorValue = CmxServiceFactory.getCmxSec2CmSV().getOperatorByCode(opName);
		// return CmxServiceFactory.getCmxIndivCustInnerSV().queryIndivCustHisCount(secOperatorValue.getOperatorId(),
		// custId, "", startDate, endDate);
		return 0;
	}

	public IBOCmGroupCustomerHValue[] queryGroupCustHis(String opId, long custId, String custName, String startDate, String endDate, int startNum, int endNum) throws Exception {
		// IBOSecOperatorValue secOperatorValue = CmxServiceFactory.getCmxSec2CmSV().getOperatorByCode(opName);
		// if (secOperatorValue != null) {
		IBOCmGroupCustomerHValue[] groupCustomerHValues = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupCustHis(Long.valueOf(opId), custId, custName, "", startDate,
				endDate, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(groupCustomerHValues)) {
			return groupCustomerHValues;
		}
		// }
		return new IBOCmGroupCustomerHValue[0];
	}

	public IBOCmGroupCustomerHValue[] queryGroupCustHisById(String opId, long custId, String custServiceId, String startDate, String endDate, int startNum, int endNum)
			throws Exception {
		// IBOSecOperatorValue secOperatorValue = CmxServiceFactory.getCmxSec2CmSV().getOperatorByCode(opName);
		// if (secOperatorValue != null) {
		IBOCmGroupCustomerHValue[] groupCustomerHValues = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupCustHisById(Long.valueOf(opId), custId, custServiceId, "",
				startDate, endDate, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(groupCustomerHValues)) {
			return groupCustomerHValues;
		}
		// }
		return new IBOCmGroupCustomerHValue[0];
	}

	public int queryGroupHisCount(String opId, long custId, String custName, String startDate, String endDate) throws Exception {
		// IBOSecOperatorValue secOperatorValue = CmxServiceFactory.getCmxSec2CmSV().getOperatorByCode(opName);
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupCustHisCount(Long.valueOf(opId), custId, custName, "", startDate, endDate);
	}

	public int queryGroupHisCountById(String opId, long custId, String custService, String startDate, String endDate) throws Exception {
		// IBOSecOperatorValue secOperatorValue = CmxServiceFactory.getCmxSec2CmSV().getOperatorByCode(opName);
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupCustHisCountById(Long.valueOf(opId), custId, custService, "", startDate, endDate);
	}

	public IBOCmxIndivCustHisValue queryIndivCustAfterHis(long opId, long custId, String doneDate, String startDate, String endDate) throws Exception {
		// SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// endDate = formatter.format(CmCommonUtil.getSysDate());
		// IBOCmxIndivCustHisValue[] indivCustHisValues =
		// CmxServiceFactory.getCmxIndivCustInnerSV().queryIndivCustHis(opId, custId, "", startDate, endDate, -1, -1);
		// if (CmCommonUtil.isNotEmptyObject(indivCustHisValues)) {
		// Timestamp doneDates = TimeUtil.getTimstampByString(doneDate, "yyyy-MM-dd HH:mm:ss");
		// ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		// for (int i = 0; i < indivCustHisValues.length; i++) {
		// if (doneDates.compareTo(indivCustHisValues[i].getDoneDate()) == 0) {
		// if (i == indivCustHisValues.length - 1) {
		// ICustomerValue customerValue = customerSV.queryCustomerByCustId(custId);
		// if (customerValue != null) {
		// IBOCmxIndivCustHisValue cmxIndivCustHisValue = new BOCmxIndivCustHisBean();
		// cmxIndivCustHisValue.copy(customerValue);
		// return cmxIndivCustHisValue;
		// }
		// } else {
		// return indivCustHisValues[i + 1];
		// }
		// }
		// }
		// }
		return null;
	}

	public IBOCmxIndivCustHisValue queryIndivCustBeforeHis(long opId, long custId, String doneDate, String startDate, String endDate) throws Exception {
		// IBOCmxIndivCustHisValue[] indivCustHisValues =
		// CmxServiceFactory.getCmxIndivCustInnerSV().queryIndivCustHis(opId, custId, doneDate, startDate, endDate, -1,
		// -1);
		// if (CmCommonUtil.isNotEmptyObject(indivCustHisValues)) {
		// return indivCustHisValues[0];
		// }
		return null;
	}

	public IBOCmxGroupAddInfoValue queryGroupCustChance(long custId) throws Exception {
		IBOCmxGroupAddInfoValue[] groupAddInfoValue = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupCustChance(custId, -1, -1);
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		if (CmCommonUtil.isNotEmptyObject(groupAddInfoValue) && CmCommonUtil.isNotEmptyObject(customerValue)) {
			groupAddInfoValue[0].initProperty(ICustomerValue.S_StaffAmount, customerValue.getStaffAmount());
			return groupAddInfoValue[0];
		}
		return null;
	}

	public IBOCmxGroupInformInfoValue queryGroupInformInfoBy(int informTypeId, long custId) throws Exception {
		IBOCmxGroupInformInfoValue groupInformInfoValue = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupInformInfoBy(informTypeId, custId);
		if (CmCommonUtil.isNotEmptyObject(groupInformInfoValue)) {
			return groupInformInfoValue;
		}
		return null;
	}

	public String queryIsUsedByGroupCustId(long custId) throws Exception {
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryIsUsedByGroupCustId(custId);
	}

	public void saveGroupInformInfo(IBOCmxGroupInformInfoValue[] groupInformInfoValues) throws Exception {
		CmxServiceFactory.getCmxGroupCustInnerSV().saveGroupInformInfo(groupInformInfoValues);
	}

	public DataContainer[] queryCustInfoBycustId(String billId) throws Exception {
		DataContainer containerDC = new DataContainer();
		DataContainer targetBo;
		String[] paramNames = null;
		DataContainer containerDC1 = new DataContainer();
		DataContainer containerDC2 = new DataContainer();
		ISoUserValue soUserValue = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		long custId = soUserValue.getCustId();
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		if (CmCommonUtil.isNotEmptyObject(customerValue)) {
			long partyId = customerValue.getPartyId();
			containerDC1.set(IPartyValue.S_PartyId, partyId);
			containerDC1.set(IPartyValue.S_PartyType, 1);
			IPartyValue[] partyValue = CmServiceFactory.getPartySV().queryPartys(containerDC1, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				containerDC.copy(partyValue[0]);
				containerDC2.set(IContactValue.S_PartyId, partyId);
				containerDC2.set(IContactValue.S_CustId, custId);
				containerDC2.set(IContactValue.S_ContMobile, billId);
				IContactValue[] contactValue = CmServiceFactory.getContactSV().queryCustContacts(containerDC2, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(contactValue)) {
					targetBo = (DataContainer) ContactBean.class.newInstance();
					paramNames = targetBo.getPropertyNames();
					for (int i = 0; i < paramNames.length; i++) {
						containerDC.set(paramNames[i], contactValue[0].get(paramNames[i]));
					}
				}
			}
		}
		return new DataContainer[] { containerDC };

	}

	public IPartyValue[] queryPartyById(long partyId) throws Exception {
		DataContainer containerDC = new DataContainer();
		containerDC.initProperty(IPartyValue.S_PartyId, partyId);
		containerDC.initProperty(IPartyValue.S_PartyType, 1);
		IPartyValue[] partyValue = CmServiceFactory.getPartySV().queryPartys(containerDC, -1, -1);
		return partyValue;
	}

	/*
	 * public IBOSoAvoivhSubRelValue[] queryAvoivhSubRelByOpId(String opName, String startDate, String endDate, int
	 * startNum, int endNum) throws Exception { IBOSecOperatorValue secOperatorValue =
	 * CmxServiceFactory.getCmxSec2CmSV().getOperatorByCode(opName); if (secOperatorValue != null) {
	 * IBOSoAvoivhSubRelValue[] cmSoAvoivhSubRelValues =
	 * CmxServiceFactory.getCmxSo2CmSV().queryAvoivhSubRelByOpId(secOperatorValue.getOperatorId(), startDate, endDate,
	 * startNum, endNum); List<IBOSoAvoivhSubRelValue> soAvoivhSubRelList = new ArrayList<IBOSoAvoivhSubRelValue>(); if
	 * (CmCommonUtil.isNotEmptyObject(cmSoAvoivhSubRelValues)) { for (int i = 0; i < cmSoAvoivhSubRelValues.length; i++)
	 * { if (cmSoAvoivhSubRelValues[i].getStatus() == CmConstants.Status.NORMAL) {
	 * soAvoivhSubRelList.add(cmSoAvoivhSubRelValues[i]); } } if (soAvoivhSubRelList.size() > 0) { return
	 * soAvoivhSubRelList.toArray(new IBOSoAvoivhSubRelValue[0]); } } } return new IBOSoAvoivhSubRelValue[0]; } public
	 * int queryAvoivhSubRelCount(String opName, String startDate, String endDate) throws Exception {
	 * IBOSecOperatorValue secOperatorValue = CmxServiceFactory.getCmxSec2CmSV().getOperatorByCode(opName); int
	 * cmSoAvoivhSubRelCount = 0; if (secOperatorValue != null) { cmSoAvoivhSubRelCount =
	 * CmxServiceFactory.getCmxSo2CmSV().queryAvoivhSubRelCount(secOperatorValue.getOperatorId(), startDate, endDate);
	 * IBOSoAvoivhSubRelValue[] cmSoAvoivhSubRelValues =
	 * CmxServiceFactory.getCmxSo2CmSV().queryAvoivhSubRelByOpId(secOperatorValue.getOperatorId(), startDate, endDate,
	 * -1, -1); if (CmCommonUtil.isNotEmptyObject(cmSoAvoivhSubRelValues)) { for (int i = 0; i <
	 * cmSoAvoivhSubRelValues.length; i++) { if (cmSoAvoivhSubRelValues[i].getStatus() != CmConstants.Status.NORMAL) {
	 * cmSoAvoivhSubRelCount--; } } } } return cmSoAvoivhSubRelCount; }
	 */

	public IBOCmxGroupCreditPointRecValue[] queryCreditPointRec(long custId, long pointsType, int startNum, int endNum) throws Exception {
		IBOCmxGroupCreditPointRecValue[] groupCreditPointRecValues = CmxServiceFactory.getCmxGroupCustInnerSV().queryCreditPointRec(custId, pointsType, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(groupCreditPointRecValues)) {
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(customerValue)) {
				ICmTeamInvokeSV teamInvokeSV = CmServiceFactory.getTeamInvokeSV();
				for (int i = 0; i < groupCreditPointRecValues.length; i++) {
					groupCreditPointRecValues[i].initProperty(IBOCmxGroupCreditPointRecValue.S_CustName, customerValue.getCustName());
					groupCreditPointRecValues[i].initProperty("CUST_SERVICE_ID", customerValue.getCustServiceId());
					long operId = groupCreditPointRecValues[i].getOpId();
					IQBOSecOrgStaffOperValue operValue = teamInvokeSV.getOperQBOByOperId(operId);
					if (CmCommonUtil.isNotEmptyObject(operValue)) {
						groupCreditPointRecValues[i].initProperty(IBOCmxGroupCreditPointRecValue.S_OpName, operValue.getStaffName());
					}
				}
			}
			return groupCreditPointRecValues;
		}
		return new IBOCmxGroupCreditPointRecValue[0];
	}

	public int queryCreditPointRecCount(long custId, long pointsType) throws Exception {
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryCreditPointRecCount(custId, pointsType);
	}

	public IQBOCmxGroupMemValue[] queryGroupInnerMems(long custId, String billId, String vipLevel, int startNum, int endNum) throws Exception {
		IQBOCmxGroupMemValue[] cmxGroupMemValues = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupInnerMems(custId, billId, vipLevel, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(cmxGroupMemValues)) {
			return cmxGroupMemValues;
		}
		return new IQBOCmxGroupMemValue[0];
	}

	public int queryGroupInnerMemCount(long custId, String billId, String vipLevel) throws Exception {
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupInnerMemCount(custId, billId, vipLevel);
	}

	public IBOCmxGroupOutMemberValue[] queryGroupOuterMems(long custId, int spType, String billId, String name, int startNum, int endNum) throws Exception {
		IBOCmxGroupOutMemberValue[] cmxGroupOutMemberValues = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupOuterMems(custId, spType, billId, name, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(cmxGroupOutMemberValues)) {
			return cmxGroupOutMemberValues;
		}
		return new IBOCmxGroupOutMemberValue[0];
	}

	public int queryGroupOuterMemCount(long custId, int spType, String billId, String name) throws Exception {
		return CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupOuterMemCount(custId, spType, billId, name);
	}

	public IBOCmxGroupOutMemberValue[] queryGroupOuterMem(long custId, long outMemberId) throws Exception {
		IBOCmxGroupOutMemberValue[] cmxGroupOutMemberValues = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupOuterMem(custId, outMemberId);
		if (CmCommonUtil.isNotEmptyObject(cmxGroupOutMemberValues)) {
			return cmxGroupOutMemberValues;
		}
		return new IBOCmxGroupOutMemberValue[0];
	}

	public void saveGroupMemExt(IVOCustValue custValue) throws Exception {
		AbstractCustomerDealBusiModelImpl customerDealBusiModelImpl = (AbstractCustomerDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerDealBusiModelImpl.class);
		customerDealBusiModelImpl.deal(custValue);
	}

	public DataContainer queryGroupModifySpecialAttr(long custId) throws Exception {
		IBOCmxGroupAddInfoValue[] groupAddInfoValue = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupModifySpecialAttr(custId, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(groupAddInfoValue)) {
			DataContainer containerDC = new DataContainer();
			containerDC.copy(groupAddInfoValue[0]);
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(customerValue)) {
				// initProperty customerValue中所有属性
				DataContainer targetBo = (DataContainer) CustomerBean.class.newInstance();
				String[] paramNames = targetBo.getPropertyNames();
				for (int i = 0; i < paramNames.length; i++) {
					containerDC.initProperty(paramNames[i], customerValue.get(paramNames[i]));
				}
			}
			BOCmGroupCustAttrBean groupCustAttrBean = new BOCmGroupCustAttrBean();
			groupCustAttrBean.setCustId(groupAddInfoValue[0].getCustId());
			DataContainerInterface[] attrValues = CmServiceFactory.getEntityAttrSV().getEntityAttrValues(groupCustAttrBean, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(attrValues)) {
				for (int i = 0; i < attrValues.length; i++) {
					String attrCode = attrValues[i].getAsString(IBOCmGroupCustAttrValue.S_AttrCode);
					if (!containerDC.hasProperty(attrCode)) {
						containerDC.initProperty(attrCode, attrValues[i].getAsString(IBOCmGroupCustAttrValue.S_AttrValue));
					}
				}
			}
			return containerDC;
		}
		return null;
	}

	public void saveGroupOutMember(IBOCmxGroupOutMemberValue groupOutMemberValue) throws Exception {
		if (null == groupOutMemberValue) {
			// 没有获取到要保存的对象！
			ExceptionUtil.throwBusinessException("CMS0000074");
		}
		if (groupOutMemberValue.isNew() && groupOutMemberValue.getOutMemberId() <= 0) {
			groupOutMemberValue.setOutMemberId(CmCommonUtil.getNewSequence(BOCmxGroupOutMemberBean.class));
			if (ServiceManager.getUser() != null) {
				groupOutMemberValue.setCreateOpId(ServiceManager.getUser().getID());
				groupOutMemberValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
				// 设置地市
				if (StringUtils.isBlank(groupOutMemberValue.getRegionId())) {
					groupOutMemberValue.setRegionId(CmCommonUtil.getDefaultRegionId());
				}
			}
			if (StringUtils.isBlank(groupOutMemberValue.getState())) {
				groupOutMemberValue.setState(CmConstants.RecordState.USE);
			}
		} else if (groupOutMemberValue.isDeleted()) {// 删除
			groupOutMemberValue.setStsToOld();
			groupOutMemberValue.delete();
		}
		CmxServiceFactory.getCmxGroupCustInnerSV().saveGroupOutMember(groupOutMemberValue);
	}

	public IQBOCmxGroupMemValue[] queryGroupInnerMemBybillId(String billId) throws Exception {
		IQBOCmxGroupMemValue[] groupMemValues = CmxServiceFactory.getCmxGroupCustInnerSV().queryGroupInnerMemBybillId(billId);
		if (CmCommonUtil.isNotEmptyObject(groupMemValues)) {
			return groupMemValues;
		}
		return new IQBOCmxGroupMemValue[0];
	}

	public DataContainer queryGroupCustomerByCustId(long custId) throws Exception {
		return queryGroupCustomerByCustId(custId, CmConstants.RecordState.USE);
	}

	public DataContainer queryGroupCustomerByCustId(long custId, String state) throws Exception {
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId, state);
		if (CmCommonUtil.isNotEmptyObject(customerValue)) {
			DataContainer result = new DataContainer();
			result.copy(customerValue);
			// 查询集团扩展信息
			BOCmxGroupAddInfoBean bean = new BOCmxGroupAddInfoBean();
			bean.setCustId(custId);
			if (StringUtils.isNotBlank(state) && StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.RECORD_STATE, state) != null) {
				bean.setState(state);
			}
			DataContainerInterface addInfoValue = CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
			if (CmCommonUtil.isNotEmptyObject(addInfoValue)) {
				DataContainerFactory.copyNoClearData(addInfoValue, result);
			}
			BOCmGroupCustAttrBean sample = new BOCmGroupCustAttrBean();
			sample.setCustId(custId);
			if (StringUtils.isNotBlank(state) && StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.RECORD_STATE, state) != null) {
				sample.setState(state);
			}
			// 查询集团属性信息
			IBOCmGroupCustAttrValue[] attrValues = (IBOCmGroupCustAttrValue[]) CmServiceFactory.getEntityAttrSV().getEntityAttrValues(sample, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(attrValues)) {
				for (int i = 0; i < attrValues.length; i++) {
					result.initProperty(attrValues[i].getAttrCode(), attrValues[i].getAttrValue());
				}
			}
			BOMaskHelper.mask(result, CustomerBean.class);
			return result;
		}
		return null;
	}

	public DataContainer queryGroupCustomerByCustServiceId(String custServiceId) throws Exception {
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(custServiceId, CmConstants.CustomerType.GROUP);
		if (CmCommonUtil.isNotEmptyObject(customerValue)) {
			DataContainer result = new DataContainer();
			result.copy(customerValue);
			// 查询集团扩展信息
			BOCmxGroupAddInfoBean bean = new BOCmxGroupAddInfoBean();
			bean.setCustId(customerValue.getCustId());
			DataContainerInterface addInfoValue = CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
			if (CmCommonUtil.isNotEmptyObject(addInfoValue)) {
				DataContainerFactory.copyNoClearData(addInfoValue, result);
			}
			BOCmGroupCustAttrBean sample = new BOCmGroupCustAttrBean();
			sample.setCustId(customerValue.getCustId());
			// 查询集团属性信息
			IBOCmGroupCustAttrValue[] attrValues = (IBOCmGroupCustAttrValue[]) CmServiceFactory.getEntityAttrSV().getEntityAttrValues(sample, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(attrValues)) {
				for (int i = 0; i < attrValues.length; i++) {
					result.initProperty(attrValues[i].getAttrCode(), attrValues[i].getAttrValue());
				}
			}
			return result;
		}
		return null;
	}

	public IBOCmxPartyContTypeInfoValue[] queryContTypeInfoBycustId(long custId) throws Exception {
		IBOCmxPartyContTypeInfoValue[] partyContTypeInfoValues = CmxServiceFactory.getCmxPartyInnerSV().queryContTypeInfoBycustId(custId);
		if (CmCommonUtil.isNotEmptyObject(partyContTypeInfoValues)) {
			return partyContTypeInfoValues;
		}
		return new IBOCmxPartyContTypeInfoValue[0];
	}

	public long saveGroupCustMembersBatch(List parseList, long custId) throws Exception {
		long batchId = 0L;
		IVOCustValue custValue = new VOCustBean();
		if (!CmCommonUtil.isNotEmptyObject(parseList)) {
			if (log.isErrorEnabled()) {
				// 传入的数据是空的！
				log.error(CrmLocaleFactory.getResource("CMS0070186"));
			}
			ExceptionUtil.throwBusinessException("CMS0070186");
		}
		if (parseList.size() > CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS) {
			if (log.isErrorEnabled()) {
				// 行数大于 CmConstants.BatchOper.BATCH_NUMS 条
				log.error(CrmLocaleFactory.getResource("CMS0070187", String.valueOf(CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS)));
			}
			ExceptionUtil.throwBusinessException("CMS0070187", String.valueOf(CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS));
		}

		ICmBatchDataSV sv = (ICmBatchDataSV) ServiceFactory.getService(ICmBatchDataSV.class);
		IBOCmBatchDataValue value = new BOCmBatchDataBean();
		value.setTotalCount(parseList.size());
		value.setRegionId(String.valueOf(ServiceManager.getUser().get(Constants.REGION_ID)));
		batchId = sv.saveBatchData(value);
		sv.saveBatchDataDetail(CmBatchUtil.parseListToValue(parseList, batchId, ""));
		ICmBatchCommomSV commonSv = (ICmBatchCommomSV) ServiceFactory.getService(ICmBatchCommomSV.class);
		List detailList = commonSv.getBatchDataDetailToList(batchId);

		List errList = new ArrayList(); // 处理失败
		List sucList = new ArrayList(); // 处理成功
		String batchDetail = null; // 每行信息
		String[] details = null;
		/*
		 * 已处理过的手机号码存放在这个Map中，每次取新的数据时先查询该Map中是否存在，存在的就不允许再添加了。
		 */
		Map processedMap = new HashMap();
		ICmxGroupCustInnerSV groupCustInnerSV = CmxServiceFactory.getCmxGroupCustInnerSV();
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICmTeamInvokeSV cmTeamInvokeSV = CmServiceFactory.getTeamInvokeSV();
		ICmClubMemberSV cmClubMemberSV = CmServiceFactory.getClubMemberSV();
		int k = 0;
		for (int i = 0; i < detailList.size(); i++) {
			batchDetail = detailList.get(i).toString();
			details = batchDetail.split(",");
			String billId = details[0].trim();
			int isFromunion = Integer.parseInt(details[1].trim());
			// 先判断该号码是否是已经处理过的号码，如果是需要提示前台该号码出现了重复。
			if (processedMap.containsKey(billId)) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0070188", billId));
				}
				// 存在重复的行
				errList.add((new StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0070188", billId)).toString());
				continue;
			}
			/*
			 * 将处理掉的放在Map中
			 */
			processedMap.put(billId, batchDetail);

			try {
				IBOCmGroupMemberValue cmGroupMemberValue = new BOCmGroupMemberBean();
				IBOCmxGroupMemberValue cmxGroupMemberValue = new BOCmxGroupMemberBean();
				cmGroupMemberValue.setCustId(custId);
				cmxGroupMemberValue.setBillId(billId);
				cmxGroupMemberValue.setIsFromunion(isFromunion);
				ICustRelationshipValue custRelValue = new CustRelationshipBean();
				IQBOCmxGroupMemValue[] groupMemValue = groupCustInnerSV.queryGroupInnerMemBybillId(billId);
				if (!CmCommonUtil.isNotEmptyObject(groupMemValue)) {
					try {
						ISoUserValue soUserValue = cmTeamInvokeSV.getSoUserByBillId(billId);
						if (CmCommonUtil.isNotEmptyObject(soUserValue)) {
							long indivCustId = soUserValue.getCustId();
							long userId = soUserValue.getUserId();
							cmxGroupMemberValue.setUserId(userId);
							ICustomerValue customerValue = customerSV.queryCustomerByCustId(indivCustId);
							if (CmCommonUtil.isNotEmptyObject(customerValue)) {
								cmGroupMemberValue.setMemberName(customerValue.getCustName());
								cmGroupMemberValue.setMemberCustId(indivCustId);
								cmxGroupMemberValue.setGender(customerValue.getGender());
								custRelValue.copy(cmGroupMemberValue);
								custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
								custValue.addCustRel(custRelValue);
								IClubMemberValue clubMemberValue = cmClubMemberSV.queryVIPClubMemberByBillId(billId);
								if (CmCommonUtil.isNotEmptyObject(clubMemberValue)) {
									long memberId = clubMemberValue.getMemberId();
									IClubMemberCardValue clubMemberCardValue = cmClubMemberSV.queryClubMemberCardByMemberId(memberId);
									cmxGroupMemberValue.setVipLevel(clubMemberCardValue.getCardLevel());
									cmxGroupMemberValue.setVipCardNo(clubMemberCardValue.getCardCode());
								}
								if (CmCommonUtil.isNotEmptyObject(cmxGroupMemberValue)) {
									custValue.setUserObject("IBOCmxGroupMemberValue" + k, cmxGroupMemberValue);
									k++;
								}
								sucList.add(billId);
							} else {
								errList.add((new StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0070191")));// 查不到该号码对应的客户信息
								continue;
							}
						}
					} catch (Exception e) {
						log.info(e.getMessage(), e);
						if (log.isErrorEnabled()) {
							log.error(e.getMessage());
						}
						errList.add((new StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0070189")));// 不存在该号码！
					}
				} else {
					if (groupMemValue[0].getCustId() == cmGroupMemberValue.getCustId()) {
						errList.add((new StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0070168")));// 该号码已经加入本集团
					} else {
						errList.add((new StringBuffer()).append(billId).append("|").append(CrmLocaleFactory.getResource("CMS0070169")));// 该号码已经加入其他集团
					}
					continue;
				}
			} catch (Exception e) {
				log.info(e.getMessage(), e);
				if (log.isErrorEnabled()) {
					log.error(e.getMessage());
				}
				// 捕获异常 记录到失败记录
				errList.add((new StringBuffer()).append(billId).append("|").append(e.getMessage()));
				continue;
			}
		}
		if (!sucList.isEmpty()) {
			this.saveGroupMemExt(custValue);
		}
		commonSv.saveBatchDataResults(sucList, errList, batchId);

		return batchId;
	}

	public DataContainer[] queryCreditRecord(String billId) throws Exception {
		ICmTeamInvokeSV cmTeamInvokeSV = CmServiceFactory.getTeamInvokeSV();
		ISoUserValue soUserValue = cmTeamInvokeSV.getSoUserByBillId(billId);
		if (CmCommonUtil.isNotEmptyObject(soUserValue)) {
			long custId = soUserValue.getCustId();
			ISoUserValue[] soUserValues = cmTeamInvokeSV.getSoUsersByCustId(custId, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(soUserValues)) {
				DataContainer[] dContainers = new DataContainer[soUserValues.length];
				for (int i = 0; i < soUserValues.length; i++) {
					dContainers[i] = new DataContainer();
					dContainers[i].initProperty(ISoUserValue.S_BillId, soUserValues[i].getBillId());
				}
				return dContainers;
			}
		}
		return new DataContainer[0];
	}

	public DataContainer queryBaseCreditRecord(String billId) throws Exception {
		ISoUserValue soUserValue = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (CmCommonUtil.isNotEmptyObject(soUserValue)) {
			DataContainer dContainer = new DataContainer();
			dContainer.initProperty("ACTIVE_DATE", soUserValue.getActiveDate());
			long userId = soUserValue.getUserId();
			DataContainer userIdContainer = new DataContainer();
			IClubValue[] club = CmServiceFactory.getClubSV().queryClubs("", CmConstants.Club.CLUB_TYPE_ENTITY, CmConstants.ClubCode.VIP_CLUB, -1, -1);
			if (!CmCommonUtil.isNotEmptyObject(club)) {
				return null;
			}
			userIdContainer.initProperty(IClubMemberValue.S_ClubId, club[0].getClubId());
			userIdContainer.initProperty(IClubMemberValue.S_State, CmConstants.RecordState.USE);
			userIdContainer.initProperty(IClubMemberValue.S_UserId, userId);
			IClubMemberValue[] clubMemberValues = CmServiceFactory.getClubMemberSV().queryClubMembers(userIdContainer, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(clubMemberValues)) {
				StringBuilder vipBuilder = new StringBuilder();
				ICmClubMemberSV clubMemberSV = CmServiceFactory.getClubMemberSV();
				for (int i = 0; i < clubMemberValues.length; i++) {
					long memberId = clubMemberValues[i].getMemberId();
					DataContainer memberIdContainer = new DataContainer();
					memberIdContainer.initProperty(IClubMemberCardValue.S_MemberId, memberId);
					IClubMemberCardValue memberCardValue = clubMemberSV.queryClubMemberCardByMemberId(memberId);
					if (CmCommonUtil.isNotEmptyObject(memberCardValue)) {
						// 此处CardLevel指的是带有年份的卡级别
						Timestamp nowDate = ServiceManager.getOpDateTime();
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
						String nowString = sdf.format(nowDate);
						int nowYear = Integer.parseInt(nowString);
						int cardYear = memberCardValue.getCardYear();
						if (cardYear >= nowYear - 2) {
							StringBuilder tempBuilder = new StringBuilder();
							String level = String.valueOf(memberCardValue.getCardLevel());
							if (level.equals(CmConstants.CmIndivVipLevel.NO_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0076235")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.DIAMOND_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0089034")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.GOLDEN_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0089033")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.SILVER_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0089036")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.HONOURED_GUEST_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0089040")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.IMPORTANT_CUST_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0076237")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.FORMVIP_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0076238")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.WHITE_YULAN_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0076239")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.OTHER_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0076241")).append(";");
							}
							if (level.equals(CmConstants.CmIndivVipLevel.GOLDEN_SERVICE_LEVEL)) {
								tempBuilder.append(memberCardValue.getCardYear()).append(CrmLocaleFactory.getResource("CMS0076224")).append(",")
										.append(CrmLocaleFactory.getResource("CMS0076242")).append(";");
							}
							vipBuilder.append(tempBuilder);
						}
					}
				}
				dContainer.initProperty(IClubMemberCardValue.S_CardLevel, vipBuilder.toString());
			}
			return dContainer;
		}
		return null;
	}

	public void saveGroupMemberLevel(IBOCmxGroupMemberValue groupMemberValue) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(groupMemberValue)) {
			if (ServiceManager.getUser() != null) {
				groupMemberValue.setCreateOpId(ServiceManager.getUser().getID());
				groupMemberValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			}
			// 设置地市
			if (StringUtils.isBlank(groupMemberValue.getRegionId())) {
				groupMemberValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			}
			CmxServiceFactory.getCmxGroupCustInnerSV().saveGroupMemberLevel(groupMemberValue);
		}
	}

	public long saveGroupMemberLevelBatch(List parseList, int memberLevel) throws Exception {
		long batchId = 0L;
		if (!CmCommonUtil.isNotEmptyObject(parseList)) {
			if (log.isErrorEnabled()) {
				// 传入的数据是空的！
				log.error(CrmLocaleFactory.getResource("CMS0070186"));
			}
			ExceptionUtil.throwBusinessException("CMS0070186");
		}
		if (parseList.size() > CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS) {
			if (log.isErrorEnabled()) {
				// 行数大于 CmConstants.BatchOper.BATCH_NUMS 条
				log.error(CrmLocaleFactory.getResource("CMS0070187", String.valueOf(CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS)));
			}
			ExceptionUtil.throwBusinessException("CMS0070187", String.valueOf(CmConstants.BatchOper.GROUP_MEMBER_BATCH_NUMS));
		}

		ICmBatchDataSV sv = (ICmBatchDataSV) ServiceFactory.getService(ICmBatchDataSV.class);
		IBOCmBatchDataValue value = new BOCmBatchDataBean();
		value.setTotalCount(parseList.size());
		value.setRegionId(String.valueOf(ServiceManager.getUser().get(Constants.REGION_ID)));
		batchId = sv.saveBatchData(value);
		sv.saveBatchDataDetail(CmBatchUtil.parseListToValue(parseList, batchId, ""));
		ICmBatchCommomSV commonSv = (ICmBatchCommomSV) ServiceFactory.getService(ICmBatchCommomSV.class);
		List detailList = commonSv.getBatchDataDetailToList(batchId);

		List errList = new ArrayList(); // 处理失败
		List sucList = new ArrayList(); // 处理成功
		String batchDetail = null; // 每行信息
		String[] details = null;

		/*
		 * 已处理过的手机号码存放在这个Map中，每次取新的数据时先查询该Map中是否存在，存在的就不允许再添加了。
		 */
		// Map proMap = new HashMap();
		Map processedMap = new HashMap();
		List groupMemberList = new ArrayList();
		ICmxCustomerSV customerSV = CmxServiceFactory.getCmxCustomerSV();
		ICmTeamInvokeSV cmTeamInvokeSV = CmServiceFactory.getTeamInvokeSV();
		for (int i = 0; i < detailList.size(); i++) {
			batchDetail = detailList.get(i).toString();
			details = batchDetail.split(",");
			String billId = details[0].trim();
			// 先判断该号码是否是已经处理过的号码，如果是需要提示前台该号码出现了重复。
			if (processedMap.containsKey(billId)) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0070188", billId));
				}
				// 存在重复的行
				errList.add((new StringBuffer()).append(batchDetail).append("|").append(CrmLocaleFactory.getResource("CMS0070188", processedMap.get(billId).toString())).toString());
				continue;
			}

			try {
				IQBOCmxGroupMemValue[] iqboCmxGroupMemValues = customerSV.queryGroupInnerMemBybillId(billId);
				if (CmCommonUtil.isNotEmptyObject(iqboCmxGroupMemValues)) {
					IBOCmxGroupMemberValue groupMemberValue = new BOCmxGroupMemberBean();
					groupMemberValue.copy(iqboCmxGroupMemValues[0]);
					if (CmCommonUtil.isNotEmptyObject(groupMemberValue)) {
						groupMemberValue.setMemberLevel(memberLevel);
					}
					groupMemberList.add(groupMemberValue);
					sucList.add(billId);
				} else {
					try {
						ISoUserValue soUserValue = cmTeamInvokeSV.getSoUserByBillId(billId);
						if (soUserValue != null) {
							errList.add((new StringBuffer()).append(batchDetail).append("|").append(CrmLocaleFactory.getResource("CMS0070194")));// 该号码不是集团网内成员
						}
					} catch (Exception e) {
						log.info(e.getMessage(), e);
						if (log.isErrorEnabled()) {
							log.error(e.getMessage());
						}
						errList.add((new StringBuffer()).append(batchDetail).append("|").append(CrmLocaleFactory.getResource("CMS0070189")));// 不存在该号码
					}
				}
			} catch (Exception e) {
				log.info(e.getMessage(), e);
				if (log.isErrorEnabled()) {
					log.error(e.getMessage());
				}
				// 捕获异常 记录到失败记录
				errList.add((new StringBuffer()).append(billId).append("|").append(e.getMessage()));
				continue;
			}
			/*
			 * 将处理掉的放在Map中
			 */
			processedMap.put(billId, batchDetail);
		}
		if (!sucList.isEmpty()) {
			this.saveGroupMemberLevelByfile((IBOCmxGroupMemberValue[]) groupMemberList.toArray(new IBOCmxGroupMemberValue[0]));
		}
		commonSv.saveBatchDataResults(sucList, errList, batchId);

		return batchId;
	}

	public void saveGroupMemberLevelByfile(IBOCmxGroupMemberValue[] groupMemberValues) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(groupMemberValues)) {
			for (int i = 0; i < groupMemberValues.length; i++) {
				if (ServiceManager.getUser() != null) {
					groupMemberValues[i].setCreateOpId(ServiceManager.getUser().getID());
					groupMemberValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					// 设置地市
					if (StringUtils.isBlank(groupMemberValues[i].getRegionId())) {
						groupMemberValues[i].setRegionId(CmCommonUtil.getDefaultRegionId());
					}
				}
			}
			CmxServiceFactory.getCmxGroupCustInnerSV().saveGroupMemberLevelByfile(groupMemberValues);
		}
	}

	public IBOCmxBusiIntelValue queryFeeBusiIntel(String billId) throws Exception {
		IBOCmxBusiIntelValue cmxBusiIntelValue = new BOCmxBusiIntelBean();
		return cmxBusiIntelValue;
	}

	public IBOCmxGroupMemberValue[] queryGroupMemberLevelBybillIds(String criteria, int startNum, int endNum) throws Exception {
		if (criteria != null) {
			String billIds = criteria.replace("@~", ",");
			String[] array = billIds.split(",");
			String[] strs = toStrings(array);
			List groupMemberList = new ArrayList();
			if (CmCommonUtil.isNotEmptyObject(strs)) {
				ICmxGroupCustInnerSV groupCustInnerSV = CmxServiceFactory.getCmxGroupCustInnerSV();
				ICmTeamInvokeSV cmTeamInvokeSV = CmServiceFactory.getTeamInvokeSV();
				for (int i = 0; i < strs.length; i++) {
					if (!"".equals(strs[i].trim()) && !"null".equals(strs[i].trim())) {
						IBOCmxGroupMemberValue groupMemberValue = new BOCmxGroupMemberBean();
						IBOCmxGroupMemberValue[] cmxGroupMemberValues = groupCustInnerSV.queryGroupMemberLevelBybillId(strs[i].trim());
						if (CmCommonUtil.isNotEmptyObject(cmxGroupMemberValues)) {
							groupMemberValue.copy(cmxGroupMemberValues[0]);
						} else {
							try {
								ISoUserValue soUserValue = cmTeamInvokeSV.getSoUserByBillId(strs[i].trim());
								if (soUserValue != null) {
									groupMemberValue.setBillId(strs[i].trim());
									groupMemberValue.setRemarks(CrmLocaleFactory.getResource("CMS0070194"));// 该号码不是集团网内成员
								} else {
									groupMemberValue.setBillId(strs[i].trim());
									groupMemberValue.setRemarks(CrmLocaleFactory.getResource("CMS0070189"));// 不存在该号码！
								}
							} catch (Exception e) {
								log.info(e.getMessage(), e);
								if (log.isErrorEnabled()) {
									log.error(e.getMessage());
								}
								groupMemberValue.setBillId(strs[i].trim());
								groupMemberValue.setRemarks(CrmLocaleFactory.getResource("CMS0070189"));// 不存在该号码！
							}
						}
						groupMemberList.add(groupMemberValue);
					}
				}
			}
			if (CmCommonUtil.isNotEmptyObject((IBOCmxGroupMemberValue[]) groupMemberList.toArray(new IBOCmxGroupMemberValue[0]))) {
				return (IBOCmxGroupMemberValue[]) groupMemberList.toArray(new IBOCmxGroupMemberValue[0]);
			}
		}
		return new IBOCmxGroupMemberValue[0];
	}

	public int queryGroupMemberLevelBybillIdsCount(String criteria) throws Exception {
		int count = 0;
		if (criteria != null) {
			String billIds = criteria.replace("@~", ",");
			String[] array = billIds.split(",");
			String[] strs = toStrings(array);
			for (int i = 0; i < strs.length; i++) {
				if (!"".equals(strs[i].trim()) && !"null".equals(strs[i].trim())) {
					count++;
				}
			}
			return count;
		} else {
			return 0;
		}
	}

	public String[] toStrings(String[] param) {
		if (CmCommonUtil.isNotEmptyObject(param)) {
			Set<String> set = new HashSet<String>(Arrays.asList(param));
			String[] str = new String[set.size()];
			set.toArray(str);
			return str;
		}
		return param;
	}

	public IBOCmxCustLanguageValue[] queryCustLanguage(long relObjectId, int relObjectType) throws Exception {
		IBOCmxCustLanguageValue[] custLanguageValues = CmxServiceFactory.getCmxIndivCustInnerSV().queryCustLanguage(relObjectId, relObjectType);
		if (CmCommonUtil.isNotEmptyObject(custLanguageValues)) {
			return custLanguageValues;
		}
		return new IBOCmxCustLanguageValue[0];
	}

	public void saveCustLanguage(IBOCmxCustLanguageValue custLanguageValue) throws Exception {
		if (null == custLanguageValue) {
			// 没有获取到要保存的对象！
			ExceptionUtil.throwBusinessException("CMS0000074");
		}
		int nType = 0;
		IBOCmxCustLanguageValue[] cmxCustLanguageValue = CmxServiceFactory.getCmxCustomerSV().queryCustLanguage(custLanguageValue.getRelObjectId(),
				custLanguageValue.getRelObjectType());
		try {
			nType = Integer.parseInt(custLanguageValue.getExtAttr("nType").toString());
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			if (log.isErrorEnabled()) {
				log.error(e.getMessage());
			}
			nType = 2;
		}
		if (nType == 1) {
			if (!CmCommonUtil.isNotEmptyObject(cmxCustLanguageValue)) {
				cmxCustLanguageValue = new IBOCmxCustLanguageValue[1];
				cmxCustLanguageValue[0] = new BOCmxCustLanguageBean();
				cmxCustLanguageValue[0].setRelObjectType(custLanguageValue.getRelObjectType());
				cmxCustLanguageValue[0].setRelObjectId(custLanguageValue.getRelObjectId());
				cmxCustLanguageValue[0].setLastLang1(custLanguageValue.getDefaultLang());
			} else {
				cmxCustLanguageValue[0].setLastLang1(cmxCustLanguageValue[0].getLastLang2());
				cmxCustLanguageValue[0].setLastLang2(cmxCustLanguageValue[0].getLastLang3());
				cmxCustLanguageValue[0].setLastLang3(custLanguageValue.getDefaultLang());
				if (cmxCustLanguageValue[0].getLastLang2() == cmxCustLanguageValue[0].getLastLang3()
						&& cmxCustLanguageValue[0].getLastLang3() == custLanguageValue.getDefaultLang()) {
					cmxCustLanguageValue[0].setDefaultLang(custLanguageValue.getDefaultLang());
				}
			}
		} else {
			if (!CmCommonUtil.isNotEmptyObject(cmxCustLanguageValue)) {
				cmxCustLanguageValue = new IBOCmxCustLanguageValue[1];
				cmxCustLanguageValue[0] = new BOCmxCustLanguageBean();
				cmxCustLanguageValue[0].copy(custLanguageValue);
				cmxCustLanguageValue[0].setLastLang1(custLanguageValue.getDefaultLang());
				cmxCustLanguageValue[0].setDefaultLang(custLanguageValue.getDefaultLang());
			} else {
				cmxCustLanguageValue[0].initProperty("REL_OBJECT_ID", custLanguageValue.getRelObjectId());
				cmxCustLanguageValue[0].initProperty("REL_OBJECT_TYPE", custLanguageValue.getRelObjectType());
				cmxCustLanguageValue[0].setLastLang1(custLanguageValue.getDefaultLang());
				cmxCustLanguageValue[0].setDefaultLang(custLanguageValue.getDefaultLang());
			}

		}
		if (ServiceManager.getUser() != null) {
			cmxCustLanguageValue[0].setCreateOpId(ServiceManager.getUser().getID());
			cmxCustLanguageValue[0].setCreateOrgId(ServiceManager.getUser().getOrgId());
		}
		if (StringUtils.isBlank(cmxCustLanguageValue[0].getState())) {
			cmxCustLanguageValue[0].setState(CmConstants.RecordState.USE);
		}
		CmxServiceFactory.getCmxIndivCustInnerSV().saveCustLanguage(cmxCustLanguageValue[0]);
	}

	public IBOCmxCustRealNameInfoValue[] queryCustRealNameInfo(long custId) throws Exception {
		IBOCmxCustRealNameInfoValue[] custRealNameInfoValues = CmxServiceFactory.getCmxIndivCustInnerSV().queryCustRealNameInfo(custId);
		if (CmCommonUtil.isNotEmptyObject(custRealNameInfoValues)) {
			return custRealNameInfoValues;
		}
		return new IBOCmxCustRealNameInfoValue[0];
	}

	public void batchModifyGroupCustCreditDegree(String[] custIds, int creditDegree) throws Exception {
		if (!CmCommonUtil.isNotEmptyObject(custIds) && creditDegree < 0) {
			return;
		}
		ICmCommonInnerSV commonInnerSV = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		StringBuilder cond = new StringBuilder(" 1=1 ");
		StringBuilder custIdStr = new StringBuilder();
		for (int i = 0; i < custIds.length; i++) {
			custIdStr.append(custIds[i]).append(",");
		}
		custIdStr.deleteCharAt(custIdStr.length() - 1);
		cond.append(" AND ").append(BOCmxGroupAddInfoBean.S_CustId).append(" IN (").append(custIdStr).append(") ");
		DataContainerInterface[] results = commonInnerSV.getBeans(BOCmxGroupAddInfoBean.class, cond.toString(), null, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(results)) {
			List retList = new ArrayList();
			for (int i = 0; i < results.length; i++) {
				BOCmxGroupAddInfoBean addInfoBean = new BOCmxGroupAddInfoBean();
				addInfoBean.copy(results[i]);
				addInfoBean.setCreditDegree(creditDegree);
				retList.add(addInfoBean);
			}
			commonInnerSV.saveBeans((BOCmxGroupAddInfoBean[]) retList.toArray(new BOCmxGroupAddInfoBean[0]));
		}
	}

	public void chgCustRelatedManager(DataContainerInterface[] dcs, long newManagerId, String changeReason) throws Exception {
		IBOBsStaticDataValue operValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.SYSTEM_SWITCH, CmConstants.CmStaticDataCodeType.CHANGE_CUSTMANAGER_SPEC);
		boolean bHavePriv = true;
		String regionType = "";
		String subRegionType = "";
		IBOCmManagerValue cmManagerValue = CmServiceFactory.getManagerSV().queryManagerById(newManagerId);
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		if (cmManagerValue != null) {
			regionType = cmManagerValue.getRegionType();
			subRegionType = cmManagerValue.getSubRegionType();
		}
		if (operValue == null) {
			bHavePriv = CmxPrivBusiRule.checkChgCustManagerPriv(ServiceManager.getUser().getID());
		}
		if (!bHavePriv) {
			StringBuilder groupIds = new StringBuilder();
			ICmManagerSV managerSV = CmServiceFactory.getManagerSV();
			for (int i = 0; i < dcs.length; i++) {
				String oldManagerIdStr = dcs[i].getAsString("MANAGER_ID");
				if (StringUtils.isNotBlank(oldManagerIdStr)) {
					long oldManagerId = dcs[i].getAsLong("MANAGER_ID");
					long groupId = dcs[i].getAsLong(ICustomerValue.S_CustServiceId);
					IBOCmManagerValue tempManagerValue = managerSV.queryManagerById(oldManagerId);
					if (tempManagerValue != null) {
						String oldSubRegionType = tempManagerValue.getSubRegionType();
						if (!StringUtils.equals(subRegionType, oldSubRegionType)) {
							groupIds.append(groupId).append("|");
						}
					}
				}
			}
			groupIds.deleteCharAt(groupIds.length() - 1);
			if (StringUtils.isNotEmpty(groupIds.toString())) {
				// 以下集团不能进行跨区调配,集团编号为=groupIds;
				ExceptionUtil.throwBusinessException("CMS0030237", groupIds.toString());
			}
		}
		for (int i = 0; i < dcs.length; i++) {
			IVOCustValue custValue = new VOCustBean();
			ICustomerValue customerValue = new CustomerBean();
			customerValue.copy(dcs[i]);
			customerValue.setRegionType(regionType);
			customerValue.setSubRegionType(subRegionType);
			custValue.setCustomer(customerValue);
			long custId = dcs[i].getAsLong(ICustomerValue.S_CustId);
			ICustManagerValue[] custManagerValues = customerSV.queryCustManagersByCustId(custId, -1, -1);
			if (custManagerValues != null && custManagerValues.length > 1) {
				// 数据出错，客户经理和集团客户关系不唯一
				ExceptionUtil.throwBusinessException("CMS0030228");
			}
			if (custManagerValues != null && custManagerValues.length == 1) {
				custManagerValues[0].setState(CmConstants.RecordState.ERASE);
				custManagerValues[0].setExpireDate(ServiceManager.getOpDateTime());
				custValue.addCustManager(custManagerValues[0]);
				ICustManagerValue custManagerValue = new CustManagerBean();
				custManagerValue.setCustId(custId);
				custManagerValue.setManagerId(newManagerId);
				custManagerValue.setRemarks(changeReason);
				custManagerValue.setRegionId(dcs[i].getAsString(ICustomerValue.S_RegionId));
				custManagerValue.setStsToNew();
				custValue.addCustManager(custManagerValue);
			} else {
				ICustManagerValue custManagerValue = new CustManagerBean();
				custManagerValue.setCustId(custId);
				custManagerValue.setManagerId(newManagerId);
				custManagerValue.setRemarks(changeReason);
				custManagerValue.setRegionId(dcs[i].getAsString(ICustomerValue.S_RegionId));
				custValue.addCustManager(custManagerValue);
			}
			customerSV.saveCustomer(custValue);
		}

	}

	public DataContainer[] changeTimeCreditRecord(String billId) throws Exception {
		ISoUserValue soUserValue = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (CmCommonUtil.isNotEmptyObject(soUserValue)) {
		}
		return new DataContainer[0];
	}

	public ICustomerValue[] queryCustForSO(String billId, String xmlComdition) throws Exception {
		if (StringUtils.isNotBlank(billId)) {
			ISoUserValue soUserValue = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
			if (CmCommonUtil.isNotEmptyObject(soUserValue)) {
				ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(soUserValue.getCustId());
				if (customerValue != null) {
					return new ICustomerValue[] { customerValue };
				}
			}
		}
		if (StringUtils.isNotBlank(xmlComdition)) {
			ICustomerValue[] customerValues = CmServiceFactory.getCustomerSV().queryCustomers(xmlComdition, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(customerValues)) {
				return customerValues;
			}
		}
		return new ICustomerValue[0];
	}

	public boolean checkCertCodeIsCurrentCust(String billId, int custCertType, String custCertCode) throws Exception {
		ISoUserValue userValue = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (userValue != null) {
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userValue.getCustId());
			// 判断查询出来的客户的证件类型和证件号码是否跟输入参数中的一致。
			return (customerValue.getCustCertType() == custCertType && StringUtils.equals(customerValue.getCustCertCode(), custCertCode));
		}
		return false;
	}

	public String checkUserState(String billId) throws Exception {
		String flag = "N";
		ICmTeamInvokeSV cmTeamInvokeSV = CmServiceFactory.getTeamInvokeSV();
		ISoUserValue userValue = cmTeamInvokeSV.getSoUserByBillId(billId);
		if (userValue != null) {
			if (StringUtils.isNotBlank(userValue.getState())) {
				if (String.valueOf(CmConstants.Status.NORMAL).equals(userValue.getState())) {
					flag = "Y";
				}
				if (RBossConst.USER_STATE_PRE_OPEN.equals(userValue.getState())) {
					ISoAccrelValue[] accountValues = null;
					try {
						accountValues = cmTeamInvokeSV.getSoAccrelsByBillId(billId, 1, -1, -1);
						if (CmCommonUtil.isNotEmptyObject(accountValues)) {
							ICmAccountSV accountSV = CmServiceFactory.getAccountSV();
							for (int i = 0; i < accountValues.length; i++) {
								IAccountValue acctValue = accountSV.queryAccountById(accountValues[i].getAcctId());
								if (acctValue != null && StringUtils.isNotBlank(String.valueOf(acctValue.getAcctType()))) {
									if (CmConstants.AccountType.PREPAY == acctValue.getAcctType()) {
										flag = "N1";
									}
								}
							}
						}
					} catch (Exception e) {
						log.info(e.getMessage(), e);
						if (log.isErrorEnabled()) {
							log.error(e.getMessage());
						}
						accountValues = null;
						flag = "N2";
					}
				}
			}
			if (userValue != null) {
				String statusValue = cmTeamInvokeSV.getUserStatusTypeByUserId(userValue.getUserId(), -1);
				if (StringUtils.isNotBlank(statusValue)) {
					flag = "N3|" + statusValue;
				}
			}
		}
		return flag;
	}

	public boolean checkCustSameNameByCert(int certType, String certCode, String custName) throws Exception {
		DataContainer containerDC = new DataContainer();
		containerDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
		containerDC.set(ICustomerValue.S_CustCertType, certType);
		containerDC.set(ICustomerValue.S_CustCertCode, certCode);
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		int totalCount = customerSV.queryCustomerCount(containerDC);
		containerDC.set(ICustomerValue.S_CustName, custName);
		int sameNameCount = customerSV.queryCustomerCount(containerDC);
		return totalCount - sameNameCount == 0;
	}

	public IBOCmxIndivPartyHobbyValue[] queryPartyHobbyBypartyId(long partyId, int hobbyType, int bobbyId[]) throws Exception {
		return CmxServiceFactory.getCmxPartyInnerSV().queryPartyHobbyBypartyId(partyId, hobbyType, bobbyId);
	}

	public IBOCmxCustSecondCardInfoValue queryCustSecondCardInfo(long custId) throws Exception {
		return CmxServiceFactory.getCmxIndivCustInnerSV().queryCustSecondCardInfo(custId);
	}

	public ICustomerValue queryCustomerRealName(String billId) throws Exception {
		ISoUserValue userValue = CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
		if (CmCommonUtil.isNotEmptyObject(userValue)) {
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(userValue.getCustId());
			if (CmCommonUtil.isNotEmptyObject(customerValue)) {
				int flag = customerValue.getRealNameFlag();
				if (flag == 0 || flag == 1) { // 不是实名制
					return null;
				} else {
					return customerValue;
				}
			}
		}
		return null;
	}

	public boolean checkCustDifferentNameByCert(int certType, String certCode, String custName) throws Exception {
		DataContainer containerDC = new DataContainer();
		containerDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.INDIVIDUAL);
		containerDC.set(ICustomerValue.S_CustCertType, certType);
		containerDC.set(ICustomerValue.S_CustCertCode, certCode);
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		int totalCount = customerSV.queryCustomerCount(containerDC);
		containerDC.set(ICustomerValue.S_CustName, custName);
		int sameNameCount = customerSV.queryCustomerCount(containerDC);
		return totalCount != sameNameCount;
	}

	public ICustomerValue queryGroupCustomerByBillId(String billId) throws Exception {
		IQBOCmxGroupMemValue[] groupMemValues = queryGroupInnerMems(-1, billId, null, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(groupMemValues)) {
			long custId = groupMemValues[0].getCustId();
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
			return customerValue;
		}
		return null;
	}

	public String checkFivePlusTwo(int certType, String certCode) throws Exception {
		return null;
	}

	public String checkOwnBillSumByUserId(long userId) throws Exception {
		return null;
	}

	public String checkSZXAXKADB(String billId, int certType, String certCode) throws Exception {
		return null;
	}

	public DataContainer[] doingActivityCreditRecord(String billId) throws Exception {
		return null;
	}

	public void modifyGroupCustState(DataContainer dContainer) throws Exception {
		String tenantId = TenantIDFactory.getTenantId();
		long custId = dContainer.getAsLong("CUST_ID");
		Timestamp nowDate = ServiceManager.getOpDateTime();
		Timestamp expireDate = TimeUtil.getMaxExpire();
		long businessId = dContainer.getAsLong(CmConstants.CommonPageParamName.BUSIOPER_ID);
		if (businessId == CmBusinessOperation.CM_GROUP_CUST_DELETE) {
			IVOCustValue voCustValue = new VOCustBean();
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryDKCustomer(custId);
			if (customerValue != null) {
				customerValue.setExpireDate(nowDate);
				customerValue.setCustStatus(CmConstants.CustomerStatus.GROUP_TERMINATED);
				if (tenantId.equals(TenantId.TENANT_21)) {
					customerValue.setState(CmConstants.RecordState.ERASE);
				}
				voCustValue.setCustomer(customerValue);
			}
			// 集团客户附加信息 cmxGrpCust
			IBOLnCmxGroupCustValue grpCustomerExt = CmxServiceFactory.getLnGroupSV().queryGroupCustExtById(custId);
			if (grpCustomerExt != null) {
				if (tenantId.equals(TenantId.TENANT_21)) {
					grpCustomerExt.setState(CmConstants.RecordState.ERASE);
				}
				grpCustomerExt.setExpireDate(nowDate);

				if (dContainer.get("COMPANY_STATUS") != null) {
					grpCustomerExt.setCompanyStatus(dContainer.getAsLong("COMPANY_STATUS"));
				}
				voCustValue.setUserObject("cmxGrpCust", grpCustomerExt);
			}

			if (tenantId.equals(TenantId.TENANT_21)) {
				// 删除集团客户经理
				ICustManagerValue[] cmManagerValues = CmServiceFactory.getCustomerSV().queryCustManagersByCustId(custId, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(cmManagerValues)) {
					for (int i = 0; i < cmManagerValues.length; i++) {
						cmManagerValues[i].setExpireDate(nowDate);
						cmManagerValues[i].setState(CmConstants.RecordState.ERASE);
						voCustValue.addCustManager(cmManagerValues[i]);
					}
				}
				// 删除集团联系人
				DataContainer dc = new DataContainer();
				dc.set(IContactValue.S_CustId, Long.valueOf(custId));
				IContactValue[] contactValues = CmServiceFactory.getContactSV().queryCustContacts(dc, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(contactValues)) {
					for (int i = 0; i < contactValues.length; i++) {
						contactValues[i].setExpireDate(nowDate);
						contactValues[i].setState(CmConstants.RecordState.ERASE);
						voCustValue.addContact(contactValues[i]);
					}
				}
				ICmCustomerSV cmSv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				//删除客户联系媒介
				/*TELENOR_DEFECT_20190114_0001
				 * 由于需要在高级查询中能查询到已销户的客户，所以，这个联系媒介，不做处理
				 * IBOCmCustContactMediumValue[] cmcustContentMediums = cmSv.queryContactMediumByCondition(custId,0);
				if(null!=cmcustContentMediums&&cmcustContentMediums.length>0){
					for (int i = 0; i < cmcustContentMediums.length; i++) {
					   cmcustContentMediums[i].delete();
					   cmcustContentMediums[i].setState("E");
					   cmcustContentMediums[i].setExpireDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
					}
					voCustValue.addCustContMedium(cmcustContentMediums);
				}*/
				
				// 删除参与人角色
				ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
				IBOCmPartyRoleValue[] partyRoles = partyRoleSV.queryPartyRole(customerValue.getPartyId(), CmConstants.PartyRoleType.CUSTOMER, -1, -1);
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
			}

			voCustValue.setUserObject(CmConstants.CommonPageParamName.BUSIOPER_ID, businessId);
			voCustValue.setBusinessId(CmConstants.BusiLogId.GROUP_DELETE);
			CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);
		} else if (businessId == CmBusinessOperation.CM_GROUP_CUST_RENEW) {
			// 反销户
			IVOCustValue voCustValue = new VOCustBean();
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId, CmConstants.RecordState.ERASE);
			if (CmCommonUtil.isNotEmptyObject(customerValue)) {
				customerValue.setExpireDate(expireDate);
				customerValue.setState(CmConstants.RecordState.USE);
				voCustValue.setCustomer(customerValue);
			}

			DataContainer tempParam = new DataContainer();
			tempParam.set("CUST_ID", custId);
			tempParam.set("STATE", CmConstants.RecordState.ERASE);

			// 集团客户附加信息
			IBOLnCmxGroupCustValue grpCustomerExt = CmxServiceFactory.getLnGroupSV().queryGroupCustExtById(custId);
			if (grpCustomerExt != null) {
				grpCustomerExt.setState(CmConstants.RecordState.USE);
				voCustValue.setUserObject("cmxGrpCust", grpCustomerExt);
			}

			// 集团客户经理
			DataContainerInterface[] tempCmManagerValues = CmInnerServiceFactory.getCommonInnerSV().queryData(BOCmGroupManagerBean.class, tempParam, null);
			Arrays.sort(tempCmManagerValues, new Comparator() {

				public int compare(Object obj1, Object obj2) {
					Timestamp sortId1 = ((BOCmGroupManagerBean) obj1).getExpireDate();
					Timestamp sortId2 = ((BOCmGroupManagerBean) obj2).getExpireDate();
					return sortId2.compareTo(sortId1);
				}
			});
			// 将失效日期最近的一个客户经理复原
			ICustManagerValue cmManagerValue = new CustManagerBean();
			if (CmCommonUtil.isNotEmptyObject(tempCmManagerValues)) {
				cmManagerValue.copy(tempCmManagerValues[0]);
				cmManagerValue.setExpireDate(expireDate);
				cmManagerValue.setState(CmConstants.RecordState.USE);
				voCustValue.addCustManager(cmManagerValue);
			}
			// 集团客户联系人
			DataContainerInterface[] tempContactValues = CmInnerServiceFactory.getCommonInnerSV().queryData(QBOCmGroupCustContactBean.class, tempParam, null);
			if (CmCommonUtil.isNotEmptyObject(tempContactValues)) {
				ICmLnClubServiceSV keySV = (ICmLnClubServiceSV) ServiceFactory.getService(ICmLnClubServiceSV.class);
				for (int i = 0; i < tempContactValues.length; i++) {
					IContactValue contactValue = new ContactBean();
					contactValue.copy(tempContactValues[i]);
					contactValue.setExpireDate(expireDate);
					contactValue.setState(CmConstants.RecordState.USE);
					voCustValue.addContact(contactValue);
					// 如果是关键人,需要触发vip因子重算
					if (tempContactValues[i].getAsInt("CONT_TYPE") == CmConstants.CONT_TYPE.CONT_TYPE_2 && tempContactValues[i].getAsString("BILL_ID") != null
							&& !"".equals(tempContactValues[i].getAsString("BILL_ID")))
						keySV.saveVipLevel(tempContactValues[i].getAsString("BILL_ID"), tempContactValues[i].getAsInt("CONT_LEVEL"),
								CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN);
				}
			}

			voCustValue.setUserObject(CmConstants.CommonPageParamName.BUSIOPER_ID, businessId);
			voCustValue.setBusinessId(businessId);
			CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);
		}

	}

	public void delGroupCust(long custId, String regionId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICmCommonInnerSV commonSV = CmInnerServiceFactory.getCommonInnerSV();

		// 删除集团
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId, CmConstants.RecordState.ERASE);
		if (CmCommonUtil.isNotEmptyObject(customerValue)) {
			BOCmGroupCustomerBean groupCust = new BOCmGroupCustomerBean();
			groupCust.copy(customerValue);
			CmLnCommonUtil.initDcProperties(groupCust);
			groupCust.delete();
			commonSV.saveBean(groupCust);
		}

		// 删除集团扩展
		ICmLnGroupSV groupSv = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
		IBOLnCmxGroupCustValue cmxGroupCustValue = groupSv.queryGroupCustExtById(custId);
		if (CmCommonUtil.isNotEmptyObject(cmxGroupCustValue)) {
			BOLnCmxGroupCustBean grpCustomerExt = new BOLnCmxGroupCustBean();
			grpCustomerExt.copy(cmxGroupCustValue);
			CmLnCommonUtil.initDcProperties(grpCustomerExt);
			grpCustomerExt.delete();
			commonSV.saveBean(grpCustomerExt);
		}

		// 删除集团成员
		DataContainer condition = new DataContainer();
		condition.set(BOCmGroupCustomerBean.S_CustId, Long.valueOf(custId));
		IGroupMemberValue[] groupMemberValues = customerSV.queryGroupMembers(condition, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(groupMemberValues)) {
			List<BOCmGroupMemberBean> groupMemberValueList = new ArrayList<BOCmGroupMemberBean>();
			for (int i = 0, len = groupMemberValues.length; i < len; i++) {
				BOCmGroupMemberBean memberBean = new BOCmGroupMemberBean();
				memberBean.copy(groupMemberValues[i]);
				CmLnCommonUtil.initDcProperties(memberBean);
				memberBean.delete();
				groupMemberValueList.add(memberBean);
			}
			if (!groupMemberValueList.isEmpty()) {
				BOCmGroupMemberBean[] memberBeans = groupMemberValueList.toArray(new BOCmGroupMemberBean[0]);
				commonSV.saveBeans(memberBeans);
			}
		}

		// 删除集团联系人
		ICmContactSV iCmContactSV = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		DataContainer da = new DataContainer();
		da.set(IContactValue.S_CustId, Long.valueOf(custId));
		IContactValue[] contactValues = iCmContactSV.queryCustContacts(da, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			List<BOCmGroupContactBean> groupContactList = new ArrayList<BOCmGroupContactBean>();
			for (int i = 0, len = contactValues.length; i < len; i++) {
				BOCmGroupContactBean contactBean = new BOCmGroupContactBean();
				contactBean.copy(contactValues[i]);
				CmLnCommonUtil.initDcProperties(contactBean);
				contactBean.delete();
				groupContactList.add(contactBean);
			}
			if (!groupContactList.isEmpty()) {
				BOCmGroupContactBean[] contactBeans = groupContactList.toArray(new BOCmGroupContactBean[0]);
				commonSV.saveBeans(contactBeans);
			}
		}

		// 删除集团客户经理
		ICustManagerValue[] cmManagerValues = customerSV.queryCustManagersByCustId(custId, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmManagerValues)) {
			List<BOCmGroupManagerBean> groupManagerList = new ArrayList<BOCmGroupManagerBean>();
			for (int i = 0; i < cmManagerValues.length; i++) {
				BOCmGroupManagerBean managerBean = new BOCmGroupManagerBean();
				managerBean.copy(cmManagerValues[i]);
				CmLnCommonUtil.initDcProperties(managerBean);
				managerBean.delete();
				groupManagerList.add(managerBean);
			}
			if (!groupManagerList.isEmpty()) {
				BOCmGroupManagerBean[] managerBeans = groupManagerList.toArray(new BOCmGroupManagerBean[0]);
				commonSV.saveBeans(managerBeans);
			}
		}

		// 删除集团账户客户关系
		ICmAccountSV accountSV = CmServiceFactory.getAccountSV();
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) accountSV.queryCustAcctRels(-1, custId, BOCmCustAcctRelBean.class, -1, -1);
		List<BOCmCustAcctRelBean> custAccts = new ArrayList<BOCmCustAcctRelBean>();
		if (CmCommonUtil.isNotEmptyObject(acctRelValues)) {
			for (int i = 0, len = acctRelValues.length; i < len; i++) {
				BOCmCustAcctRelBean acctRelBean = new BOCmCustAcctRelBean();
				acctRelBean.copy(acctRelValues[i]);
				CmLnCommonUtil.initDcProperties(acctRelBean);
				acctRelBean.delete();
				custAccts.add(acctRelBean);
			}
			if (!custAccts.isEmpty()) {
				BOCmCustAcctRelBean[] acctRelBeans = custAccts.toArray(new BOCmCustAcctRelBean[0]);
				commonSV.saveBeans(acctRelBeans);
			}
		}

		// 删除集团合同信息
		IBOCmGroupContractValue value = new BOCmGroupContractBean();
		value.set(IBOCmGroupContractValue.S_CustId, custId);
		IBOCmGroupContractValue[] contractValues = CmServiceFactory.getGroupContractSV().queryGroupContracts(value, -1, -1);
		List<BOCmGroupContractBean> contract = new ArrayList<BOCmGroupContractBean>();
		if (CmCommonUtil.isNotEmptyObject(contractValues)) {
			for (int k = 0; k < contractValues.length; k++) {
				BOCmGroupContractBean contractBean = new BOCmGroupContractBean();
				contractBean.copy(contractValues[k]);
				CmLnCommonUtil.initDcProperties(contractBean);
				contractBean.delete();
				contract.add(contractBean);
			}
			if (!contract.isEmpty()) {
				BOCmGroupContractBean[] contractBeans = contract.toArray(new BOCmGroupContractBean[0]);
				commonSV.saveBeans(contractBeans);
			}
		}
	}

	public DataContainer[] qryActivityCreditRecord(String billId) throws Exception {
		return null;
	}

	public DataContainer[] qryLetPhoneCreditRecord(String billId) throws Exception {
		return null;
	}

	public IBOCmxBusiIntelValue queryBaseBusiIntel(String billId) throws Exception {
		return null;
	}

	public DataContainer[] queryBbossPromInfo(String billId) throws Exception {
		return null;
	}

	public DataContainer[] queryCreditPoint(String xmlComdition, int startNum, int endNum) throws Exception {
		return null;
	}

	public int queryCreditPointCount(String xmlComdition) throws Exception {
		return 0;
	}

	public int queryCustSecondCertCount(int secondCertType, String secondCertCode) throws Exception {
		return 0;
	}

	public DataContainer[] businessChannelCreditRecord(String billId) throws Exception {
		return null;
	}

	public void dealGroupMemberRel(IVOCustValue custValue) throws Exception {
		String operState = (String) custValue.getUserObject(CmLnConstants.DealCustInfo.OP_STATE);
		if (StringUtils.isBlank(operState)) {
			// 没有获取到操作类型！
			ExceptionUtil.throwBusinessException("CMS5000098");
		}
		List groupMemberList = new ArrayList();
		if (operState.equalsIgnoreCase(CmLnConstants.DealCustInfo.OP_DEL)) {
			ICustRelationshipValue[] custRelValue = custValue.getCustRels();
			BOCmGroupMemberBean groupMemberValue = null;
			for (int i = 0, len = custRelValue.length; i < len; i++) {
				groupMemberValue = new BOCmGroupMemberBean();
				groupMemberValue.copy(custRelValue[i]);
				groupMemberValue.delete();
				groupMemberList.add(groupMemberValue);
			}
			// 删除集团成员主表
			if (!groupMemberList.isEmpty()) {
				CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmGroupMemberBean[]) groupMemberList.toArray(new BOCmGroupMemberBean[0]));
			}

		} else if (operState.equalsIgnoreCase(CmLnConstants.DealCustInfo.OP_NEW)) {

		} else {

		}

		// 添加日志
		CmServiceFactory.getBusiLogSV().saveBusiLog(new CmBusiLogBean());
	}

	public Map queryGroupCustByCdn(int qryType, String qryValue) throws Exception {
		if (qryType <= 0 || StringUtils.isBlank(qryValue)) {
			// 输入参数不合法，查询类型[{0}],查询值[{1}]！
			ExceptionUtil.throwBusinessException("CMS5000135", String.valueOf(qryType), qryValue);
		}
		DataContainer dc = null;
		Map result = null;
		// 拼接条件
		switch (qryType) {
		// 成员手机号
			case 1:
				ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
				ISoUserValue userValue = teamInvokeSV.getSoUserByBillId(qryValue);
				if (CmCommonUtil.isEmptyObj(userValue)) {
					// 用户不存在
					ExceptionUtil.throwBusinessException("CMS1100080"); // 用户对象不存在!
				}
				// 查询集团成员信息表，获取归属集团编号
				DataContainer dt = new DataContainer();
				dt.set(IBOCmGroupMemberValue.S_MemberCustId, userValue.getCustId());
				dt.set(IBOCmGroupMemberValue.S_BillId, qryValue);
				dt.set(IBOCmGroupMemberValue.S_UserId, userValue.getUserId());
				dt.set(IBOCmGroupMemberValue.S_MemberType, CmLnConstants.GroupContType.GROUP_MEMBER_INNER);
				dt.set(IBOCmGroupMemberValue.S_State, CmConstants.RecordState.USE);
				IGroupMemberValue[] groupMemberValues = CmServiceFactory.getCustomerSV().queryGroupMembers(dt, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(groupMemberValues)) {
					if (groupMemberValues.length > 1) {
						// 数据有误，该客户[{0}]加入了多个集团！
						ExceptionUtil.throwBusinessException("CMS5000136");
					}

					// 拼写查询集团客户信息参数
					dc = new DataContainer();
					dc.set(ICustomerValue.S_CustId, groupMemberValues[0].getCustId());
				}
				break;
			// 集团名称（只支持右端模糊）
			case 2:
				dc = new DataContainer();
				// 是否模糊
				dc.set(CmConstants.MatchType.ATTR_CODE_MATCH_TYPE, CmConstants.MatchType.RIGHT_MATCH);
				dc.set(ICustomerValue.S_CustName, qryValue);
				// 设置客户类型
				dc.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
				break;
			// 集团编号
			case 3:
				dc = new DataContainer();
				// 是否模糊
				dc.set(ICustomerValue.S_CustId, qryValue);
				break;
			default:
				break;
		}
		if (dc != null) {
			// 查询客户信息
			ICustomerValue[] customerValues = CmServiceFactory.getCustomerSV().queryCustomers(dc, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(customerValues)) {
				result = new HashMap();
				result.put("GroupCustId", customerValues[0].getCustId());
				result.put("CustName", customerValues[0].getCustName());
				result.put("CustAddr", customerValues[0].getCustAddress());
				// 查询客户经理信息
				ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
				IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(customerValues[0].getCustId());
				if (CmCommonUtil.isNotEmptyObject(gMgrRel)) {
					ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
					// 调用权限查询客户经理详细信息
					IQBOSecCustManagerValue staffValues = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
					if (CmCommonUtil.isNotEmptyObject(staffValues)) {
						result.put("CustManagerName", staffValues.getManagername());
						result.put("CustManagerPhone", staffValues.getBillid());
					}
				}
			}
		}

		return result;
	}

	public IBOLnCmxGroupCustValue queryCmxGroupCustomer(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOLnCmxGroupCustValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOLnCmxGroupCustValue[] values = (IBOLnCmxGroupCustValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmxGroupCustBean.class, condition.toString(), parameter,
				-1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public ICustomerValue queryCmxCustomer(long custId) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue customerValue = new CustomerBean();
		if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
			IBOCmxIndivCustomerValue value = service.queryCmxIndivCustomerValue(custId);
			customerValue.copy(value);
		} else {
			IBOLnCmxGroupCustValue value = queryCmxGroupCustomer(custId);
			customerValue.copy(value);
		}
		return customerValue;
	}

	@Override
	public void adjustGroupPoints(DataContainer cmxGroupPointRecBean) throws Exception {
		// TODO Auto-generated method stub

	}

}