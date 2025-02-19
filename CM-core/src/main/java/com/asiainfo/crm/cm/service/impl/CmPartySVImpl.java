package com.asiainfo.crm.cm.service.impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyContactQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCMPartyAcctRelBean;
import com.asiainfo.crm.cm.common.bo.QBOCmPartyBean;
import com.asiainfo.crm.cm.common.bo.QBOCmPayerInfoBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmIndivPartyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bean.VOPartyBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.model.bo.PartyContactBean;
import com.asiainfo.crm.cm.model.bo.PartyRoleBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyRoleValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.common.mask.BOMaskHelper;
import com.asiainfo.crm.constant.RBossConst;

public class CmPartySVImpl implements ICmPartySV {

	public IPartyValue queryPartyById(long partyId) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		DataContainer cond = new DataContainer();
		cond.set(IPartyValue.S_PartyId, Long.valueOf(partyId));
		IPartyValue[] partyValues = (IPartyValue[]) busiModelImpl.queryData(new DataContainer[] { cond }, -1, -1);
		IPartyValue partyValue = null;
		if (CmCommonUtil.isNotEmptyObject(partyValues)) {
			partyValue = partyValues[0];
		}
		return partyValue;
	}

	public IPartyValue[] queryPartys(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		IPartyValue[] partyValues = (IPartyValue[]) busiModelImpl.queryData(new DataContainer[] { conditionDC }, -1, -1);
		return partyValues;
	}

	public int queryPartyCount(DataContainer conditionDC) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		return busiModelImpl.queryCount(new DataContainer[] { conditionDC });
	}

	public void saveParty(IVOPartyValue partyValue) throws Exception {
		AbstractPartyDealBusiModelImpl busiModel = (AbstractPartyDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyDealBusiModelImpl.class);
		busiModel.deal(partyValue);
	}

	@Override
	public IVOPartyValue savePartyNew(IVOPartyValue partyValue) throws Exception {
		AbstractPartyDealBusiModelImpl busiModel = (AbstractPartyDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyDealBusiModelImpl.class);
		busiModel.deal(partyValue);
		return partyValue;
	}

	public void saveParty(IPartyValue partyValue) throws Exception {
		AbstractPartyDealBusiModelImpl busiModel = (AbstractPartyDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyDealBusiModelImpl.class);
		IVOPartyValue voPartyValue = new VOPartyBean();
		voPartyValue.setParty(partyValue);
		busiModel.deal(voPartyValue);
	}

	public IPartyContactValue[] queryPartyContacts(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		AbstractPartyContactQueryBusiModelImpl busiModelImpl = (AbstractPartyContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyContactQueryBusiModelImpl.class);
		return (IPartyContactValue[]) busiModelImpl.queryData(new DataContainer[] { conditionDC }, startNum, endNum);
	}

	public int queryPartyContactCount(DataContainer conditionDC) throws Exception {
		AbstractPartyContactQueryBusiModelImpl busiModelImpl = (AbstractPartyContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyContactQueryBusiModelImpl.class);
		return busiModelImpl.queryCount(new DataContainer[] { conditionDC });
	}

	public IPartyContactValue queryPartyContactById(long contId) throws Exception {
		AbstractPartyContactQueryBusiModelImpl busiModelImpl = (AbstractPartyContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyContactQueryBusiModelImpl.class);
		IPartyContactValue value = (IPartyContactValue) busiModelImpl.queryDataById(contId);
		if (value != null) {
			value.setDiaplayAttr("CONT_ADDRESS", "CONT_ADDRESS_NAME", value.getContDesc());
		}

		return value;
	}

	public IQBOCmPartyValue queryPartyInfo(long partyId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND A.").append(IQBOCmPartyValue.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPartyBean.class, condition.toString(), parameter, -1, -1);
		IQBOCmPartyValue[] values = (IQBOCmPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPartyBean.class, sql, parameter);
		return values[0];
	}

	public IBOCmPartyValue[] queryPartyByName(String partyName, int startNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IPartyValue.S_PartyName).append(" like:partyName ");
		parameter.put("partyName", "%" + partyName + "%");
		condition.append(" AND ").append(IPartyValue.S_PartyType).append(" =:partyType ");
		parameter.put("partyType", CmConstants.PartyType.INDIVIDUAL);
		return (IBOCmPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyBean.class, condition.toString(), parameter, startNum, endNum);
	}

	public long queryPartyContactByPartyId(long partyId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmPartyContactValue.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		IBOCmPartyContactValue[] values = (IBOCmPartyContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyContactBean.class, condition.toString(), parameter,
				-1, -1);
		if (null != values && values.length > 0) {
			return values[0].getContId();
		}
		return 0;
	}

	public IBOCmGroupContactValue[] queryGroupContactByCustIdAndPartyId(long custId, long partyId, long contType) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmGroupContactValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmGroupContactValue.S_ContType).append(" =:contType ");
		parameter.put("contType", contType);
		condition.append(" AND ").append(IBOCmGroupContactValue.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		IBOCmGroupContactValue[] values = (IBOCmGroupContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupContactBean.class, condition.toString(), parameter,
				-1, -1);
		if (null != values && values.length > 0) {
			return values;
		}
		return null;
	}

	public int queryPartyByNameCount(String partyName) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IPartyValue.S_PartyName).append(" like:partyName ");
		parameter.put("partyName", "%" + partyName + "%");
		condition.append(" AND ").append(IPartyValue.S_PartyType).append(" =:partyType ");
		parameter.put("partyType", CmConstants.PartyType.INDIVIDUAL);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmPartyBean.class, condition.toString(), parameter);
	}

	public IBOCmIndivContactValue[] queryIndivContactByCustIdAndPartyId(long custId, long partyId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmIndivContactValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmIndivContactValue.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		return (IBOCmIndivContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivContactBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOCmPartyRoleValue[] queryPartyRole(long partyId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(BOCmPartyRoleBean.S_PartyId).append(" =:partyId ");
		parameter.put("partyId", partyId);
		IBOCmPartyRoleValue[] partyRoles = (IBOCmPartyRoleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyRoleBean.class, condition.toString(), parameter, -1,
				-1);
		if (partyRoles != null && partyRoles.length > 0) {
			return partyRoles;
		}
		return new IBOCmPartyRoleValue[0];
	}

	public IBOCmPartyValue[] queryPartyByCertTypeAndCertCode(int certType, String certCode, int STARTROWINDEX, int ENDROWINDEX) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IPartyValue.S_CertType).append("=:certType ");
		condition.append(" AND ").append(IPartyValue.S_CertCode).append("=:certCode ");
		condition.append(" AND ").append(IPartyValue.S_State).append("=:state ");
		parameter.put("certType", certType);
		parameter.put("certCode", certCode);
		parameter.put("state", CmConstants.RecordState.USE);
		return (IBOCmPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyBean.class, condition.toString(), parameter, STARTROWINDEX, ENDROWINDEX);
	}
	
	public IQBOCmPartyValue[] queryQPartyByCertTypeAndCertCode(int certType, String certCode, int STARTROWINDEX, int ENDROWINDEX) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IPartyValue.S_CertType).append("=:certType ");
		condition.append(" AND ").append(IPartyValue.S_CertCode).append("=:certCode ");
		condition.append(" AND ").append(IPartyValue.S_State).append("=:state ");
		parameter.put("certType", certType);
		parameter.put("certCode", certCode);
		parameter.put("state", CmConstants.RecordState.USE);
		return (IQBOCmPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmPartyBean.class, condition.toString(), parameter, STARTROWINDEX, ENDROWINDEX);
	}

	public int queryCountByCertTypeAndCertCode(int certType, String certCode) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IPartyValue.S_CertType).append("=:certType ");
		condition.append(" AND ").append(IPartyValue.S_CertCode).append("=:certCode ");
		condition.append(" AND ").append(IPartyValue.S_State).append("=:state ");
		parameter.put("certType", certType);
		parameter.put("certCode", certCode);
		parameter.put("state", CmConstants.RecordState.USE);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmPartyBean.class, condition.toString(), parameter);
	}
	
	/**
	 * 查询QBO party数量
	 * @param certType
	 * @param certCode
	 * @return
	 * @throws Exception
	 */
	public int queryQBOCountByCertTypeAndCertCode(int certType,String certCode)throws Exception{
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IPartyValue.S_CertType).append("=:certType ");
		condition.append(" AND ").append(IPartyValue.S_CertCode).append("=:certCode ");
		condition.append(" AND ").append(IPartyValue.S_State).append("=:state ");
		parameter.put("certType", certType);
		parameter.put("certCode", certCode);
		parameter.put("state", CmConstants.RecordState.USE);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(QBOCmPartyBean.class, condition.toString(), parameter);
	}

	public IQBOCmPartyValue queryAsPartyByCertCode(String xmlCondition, int $startrowindex, int $endrowindex) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		String action = dcs[0].getAsString("ACTION");
		long custId = dcs[0].getAsLong("CUST_ID");

		if ("ADD".equals(action) && custId > 0) {
			// 建payer自动查询使用
			return queryPayerbyCustId(custId);
		}
		if ("QUERY".equals(action)) {
			// 提供给party视图使用
			long partyId = dcs[0].getAsLong("PARTY_ID");
			return queryPayerByPartyId(partyId);
		}
		int certType = dcs[0].getAsInt(IBOCmPartyValue.S_CertType);
		String certCode = dcs[0].getAsString(IBOCmPartyValue.S_CertCode);
		if (!StringUtils.isNotBlank(certCode) && certType == 8) {

			// 是个人客户同时没有证件号码使用名称生日地址创建payer
			String firstName = dcs[0].getAsString(IQBOCmPayerInfoValue.S_FirstName);
			String lastName = dcs[0].getAsString(IQBOCmPayerInfoValue.S_LastName);
			String birth = dcs[0].getAsString(IQBOCmPayerInfoValue.S_Birthday);
			long addressId = dcs[0].getAsLong(IQBOCmPayerInfoValue.S_ContAddress);
			String addressDetail = dcs[0].getAsString("REMARKS");
			IQBOCmPartyValue pValue = queryPayerByNBA(firstName + " " + lastName, birth, addressId);
			if (pValue != null) {
				return pValue;
			} else {
				pValue = new QBOCmPartyBean();
				pValue.setFirstName(firstName);
				pValue.setLastName(lastName);
				pValue.setPartyName(firstName + " " + lastName);
				pValue.setContAddress(String.valueOf(addressId));
				pValue.setRemarks(addressDetail);
				pValue.setCertType(8);
				pValue.setBirthday(Timestamp.valueOf(birth + " 00:00:00"));
			}
			return pValue;
		}
		if (StringUtils.isNotBlank(certCode) && !certCode.startsWith("K") && certType == 17) {
			int length = certCode.length();
			if ((10 - length) > 0) {
				for (int i = 0; i < 10 - length; i++) {
					certCode = "0" + certCode;
				}
			}

		}
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map parameter = new HashMap();
		parameter.put("certType", certType);
		parameter.put("certCode", certCode);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.PAYER, "", parameter, CmConstants.BusiLogType.PARTY_LOG);
		// 返回值
		IQBOCmPartyValue qpartyVal = new QBOCmPartyBean();
		// 查询是否已经存在party表中
		IBOCmPartyValue[] partyVal = queryPartyByCertTypeAndCertCode(certType, certCode, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(partyVal)) {
			long partyId = partyVal[0].getPartyId();
			qpartyVal.copy(partyVal[0]);
			if (certType == 8) {
				// 查询个人类payer
				queryIndivPayer4AddPayer(partyId, certCode, qpartyVal);
			} else {
				// 查询集团类payer
				queryGroupPayer(partyId, certCode, qpartyVal);
			}
		} else {
			// 不存在调接口查询
			if (certType == 8) {
				// cpr接口
				ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
				Map params = new HashMap();
				params.put("PNR", certCode);
				// 送CPR进行校验
				Map cprData = indivService.validateCPR(params);
				String FEJLNR = (String) cprData.get("FEJLNR");
				if (!FEJLNR.equals("00")) {
					// CPR在CPR系统中不存在。
					throw new Exception("Can Not Find Any Information By CPR Number");
				}
				Map data1 = (Map) cprData.get("DATA");
				Map data2 = (Map) data1.get("INFO");
				Map currentData = (Map) data2.get("Current_data");
				// 是否受保护
				String isProtected = (String) currentData.get("NVNADRBESKHAENSTART");
				String var = "[0]*";
				if (!isProtected.matches(var)) {
					// 受保护
					qpartyVal.setCertCode(certCode);
					qpartyVal.setCertType(8);
					qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
					qpartyVal.setExt2(String.valueOf(CmConstants.YesOrNo.YES));
					String source = String.valueOf(currentData.get("FOEDDTO"));
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					qpartyVal.setBirthday(TimeUtil.getTruncDate(sdf.parse(source)));
					return qpartyVal;
				}
				String personStatus = (String) currentData.get("STATUS");
				if ("80".equals(personStatus)) {
					// 客户移民
					qpartyVal.setCertCode(certCode);
					qpartyVal.setCertType(8);
					qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
					qpartyVal.setExt2(String.valueOf(2));
					String source = String.valueOf(currentData.get("FOEDDTO"));
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					qpartyVal.setBirthday(TimeUtil.getTruncDate(sdf.parse(source)));
					return qpartyVal;
				}
				if ("70".equals(personStatus)) {
					// 客户消失
					qpartyVal.setCertCode(certCode);
					qpartyVal.setCertType(8);
					qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
					qpartyVal.setExt2(String.valueOf(3));
					String source = String.valueOf(currentData.get("FOEDDTO"));
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					qpartyVal.setBirthday(TimeUtil.getTruncDate(sdf.parse(source)));
					return qpartyVal;
				} else {
					qpartyVal.setExt2(String.valueOf(CmConstants.YesOrNo.NO));
					qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
					// 将CPR返回的信息包装成party返回
					String firstName = CmCommonUtil.capitalizeFirstLetter((String) currentData.get("FORNVN"));
					String lastName = CmCommonUtil.capitalizeFirstLetter((String) currentData.get("EFTERNVN"));
					String birthDay = (String) currentData.get("FOEDDTO");
					// 从CPR返回的地址
					String houseNum = ((String) currentData.get("HUSNR")).trim();
					String floor = (String) currentData.get("ETAGE");
					String sideOrApartNum = (String) currentData.get("SIDEDOER");
					String buildNum = (String) currentData.get("BNR");
					String streetName = (String) currentData.get("VEJADRNVN");
					String city = (String) currentData.get("POSTDISTTXT");
					String smallCity = (String) currentData.get("BYNVN");
					String postCode = (String) currentData.get("POSTNR");
					String munici = (String) currentData.get("KOMKOD");
					String coName = (String) currentData.get("CONVN");
					address address = new address();
					address.setAddressType(CmConstants.Address.ADDRESSTYPE);
					address.setDistrictId(CmConstants.Address.DISTRICTID);
					if (StringUtils.isNotBlank(houseNum)) {
						if (Character.isLetter(houseNum.charAt(houseNum.length() - 1))) {
							address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.substring(0, houseNum.length() - 1).trim())));
							address.setHouseLetter(String.valueOf(houseNum.charAt(houseNum.length() - 1)));
						} else {
							address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.trim())));
							address.setHouseLetter("");
						}
					}
					if (StringUtils.isNotBlank(floor)) {
						address.setFloor(floor.trim());
					} else {
						address.setFloor("");
					}

					if (StringUtils.isNotBlank(streetName)) {
						address.setStreetName(streetName.trim());
					} else {
						address.setStreetName("");
					}
					if (StringUtils.isNotBlank(city)) {
						address.setCity(city.trim());
					} else {
						address.setCity("");
					}
					if (StringUtils.isNotBlank(smallCity)) {
						address.setCounty(smallCity.trim());
					} else {
						address.setCounty("");
					}
					// 根据特殊规则判断sidedoer的走向
					if (StringUtils.isNotBlank(sideOrApartNum)) {
						if (CmCommonUtil.validateSidedoer(sideOrApartNum)) {
							address.setApartment(sideOrApartNum.trim());
							address.setDoorNumber("");
						} else {
							address.setDoorNumber(sideOrApartNum.trim());
							address.setApartment("");
						}
					} else {
						address.setApartment("");
						address.setDoorNumber("");
					}
					if (StringUtils.isNotBlank(postCode)) {
						address.setZipcode(postCode);
					} else {
						address.setZipcode("");
					}
					if (StringUtils.isNotBlank(munici)) {
						address.setMunicipality(munici);
					} else {
						address.setMunicipality("");
					}
					address.setAddrDesc("");
					address.setMainDoor("");

					// 地址层级中增加CO_NAME
					if (StringUtils.isNotBlank(coName)) {
						address.setCoName(coName);
					} else {
						address.setCoName("");
					}

					IAddressSV addService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
					long addressId = addService.saveAddress(address);
					qpartyVal.setContAddress((addressId + "").trim());
					qpartyVal.setFirstName(firstName);
					DateFormat format = new SimpleDateFormat("yyyyMMdd");
					format.setLenient(false);
					Timestamp ts = new Timestamp(format.parse(birthDay).getTime());
					qpartyVal.setBirthday(ts);
					address realAddress = addService.getAddress(addressId, "");
					if (null != realAddress) {
						qpartyVal.setRemarks(realAddress.getAddrDesc());
					}
					qpartyVal.setLastName(lastName);
					qpartyVal.setCertCode(certCode);
					qpartyVal.setCertType(8);
					qpartyVal.setPartyName(firstName.trim() + " " + lastName.trim());
					// 通过名称生日地址校验客户是否已经存在
					ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					IBOCmIndivCustomerValue[] custValue = customerSV.queryCmCustByCustInfoAndAddress(qpartyVal.getPartyName(), birthDay, addressId);
					if (custValue != null && custValue.length > 0) {
						// 设置partyId客户不会被新建
						qpartyVal.setPartyId(custValue[0].getPartyId());
						// 查询联系电话,email
						IQBOCmCustContMediumAndTypeValue[] contValues = customerSV.queryCustElectronicMedium(custValue[0].getCustId(), -1, -1);
						if (CmCommonUtil.isNotEmptyObject(contValues)) {
							for (IQBOCmCustContMediumAndTypeValue value : contValues) {
								if (value.getContMedTypeId() == CmConstants.AddressId.CONTACT_NUMBER) {
									qpartyVal.setContMobile(value.getContNumber());
								} else if (value.getContMedTypeId() == CmConstants.AddressId.EMAIL) {
									qpartyVal.setContEmail(value.getEmailAddress());
								}

							}
						}
						// 查询扩展个人信息
						IBOCmxIndivCustomerValue indivcustValueEx = customerSV.queryCmxIndivCustomerValue(custValue[0].getCustId());
						if (indivcustValueEx != null) {
							qpartyVal.setManualCommercialProtection(indivcustValueEx.getManualCommercialProtection());
							qpartyVal.setManualProtectEffectiveDate(indivcustValueEx.getManualProtectEffectiveDate());
							qpartyVal.setManualProtectExpireDate(indivcustValueEx.getManualProtectExpireDate());
							qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectExpireDate());
							qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectEffDate());
							qpartyVal.setDirectMarketingProtection(indivcustValueEx.getDirectMarketingProtection());
						}
					}
					return qpartyVal;
				}
			} else {// kob接口不可能走这里,抛出异常
				throw new Exception("Can Not Find Any Information By KOB Number,Please Make Sure The ID Number Is Correct!");
			}
		}
		return qpartyVal;
	}

	/**
	 * 根据名称生日地址查询payer
	 * @return
	 * @throws Exception
	 */
	public IQBOCmPartyValue queryPayerByNBA(String name, String birth, long addressId) throws Exception {
		// 使用名称生日地址查询cmParty,cm_party_contact,cm_indiv_party
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		condition.append(" and ").append(QBOCmPartyBean.S_PartyName).append("=:name");
		condition.append(" and ").append(QBOCmPartyBean.S_Birthday).append("=:birth");
		condition.append(" and ").append(QBOCmPartyBean.S_ContAddress).append("=:addressId");
		Map parameter = new HashMap();
		parameter.put("name", name);
		parameter.put("birth", birth);
		parameter.put("addressId", addressId);
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), parameter, -1, -1);
		QBOCmPayerInfoBean[] dc = (QBOCmPayerInfoBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPayerInfoBean.class, sql, parameter);
		if (dc != null && dc.length > 0) {
			IQBOCmPartyValue value = new QBOCmPartyBean();
			value.copy(dc[0]);
			String a = dc[0].getAddressId();// 地址描述保存到remarks字段。之前copy的到是party的remarks
			value.setRemarks(a);
			return value;
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmIndivCustomerValue[] custValue = customerSV.queryCmCustByCustInfoAndAddress(name, birth, addressId, -1);
		if (custValue != null && custValue.length > 0) {
			return queryPayerbyCustId(custValue[0].getCustId());
		} else {
			IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			address address = addressSV.getAddress(addressId, null);
			if (address != null) {
				String addressDetail = address.getAddrDesc().trim();
				IBOCmIndivCustomerValue[] newCustValue = customerSV.queryCmCustByCustInfoByAddressDetail(name, birth, addressDetail);
				if (newCustValue != null && newCustValue.length > 0) {
					return queryPayerbyCustId(newCustValue[0].getCustId());
				}
			}
		}
		return null;

	}
	
	/**
	 * 
	 * @param firstName
	 * @param birth
	 * @param addressId
	 * @param certType
	 * @param certCode
	 * @param partyName
	 * @param partyId
	 * @param partyType
	 * @param queryFlag 1:查询数量  2：查询所有数据 3：分页查询
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public Object queryPartysByCondition(String firstName,String lastName, String birth, long addressId,int certType, String certCode,String partyName,long partyId,String partyType,int queryFlag, int startNum,int endNum) throws Exception {
		// 使用名称生日地址查询cmParty,cm_party_contact,cm_indiv_party
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map parameter = new HashMap(); 
		
		if(StringUtils.isNotBlank(firstName)) {
			condition.append(" and ");
			 if(queryFlag==3) {
		    	  condition.append(" A.");
		      }
			condition.append(QBOCmPartyBean.S_FirstName).append("=:firstName");
			parameter.put("firstName", firstName);
		}
		
		if(StringUtils.isNotBlank(lastName)) {
			 condition.append(" and ");
			 if(queryFlag==3) {
		    	  condition.append(" A.");
		      }
			 condition.append(QBOCmPartyBean.S_LastName).append("=:lastName");
			parameter.put("lastName", lastName);
		}
		
		if(StringUtils.isNotBlank(birth)) {
			condition.append(" and ").append(QBOCmPartyBean.S_Birthday).append("=:birth");
			parameter.put("birth", birth);
		}
		
		if(addressId>0) {
			condition.append(" and ").append(QBOCmPartyBean.S_ContAddress).append("=:addressId");
			parameter.put("addressId", addressId);
		}
	
		if(certType>0) {
			condition.append(" and ").append(QBOCmPartyBean.S_CertType).append("=:certType");
			parameter.put("certType", certType);
		}
		
		if(StringUtils.isNotBlank(certCode)) {
			condition.append(" and ").append(QBOCmPartyBean.S_CertCode).append("=:certCode");
			parameter.put("certCode", certCode);
		}
		
		if(StringUtils.isNotBlank(partyName)) {
			condition.append(" and ").append(QBOCmPartyBean.S_PartyName).append("=:partyName");
			parameter.put("partyName", partyName);
		}
		
		if(partyId>0) {
			
	      condition.append(" and ");
	      if(queryFlag==3) {
	    	  condition.append(" A.");
	      }
	      condition.append(QBOCmPartyBean.S_PartyId).append("=:partyId");
		 
		  parameter.put("partyId", partyId);
		}
		if(StringUtils.isNotEmpty(partyType)) {
			condition.append(" and  ");
			if(queryFlag==3) {
		    	  condition.append(" A.");
		      }
			condition.append(QBOCmPartyBean.S_PartyType).append("=:partyType");
			parameter.put("partyType", partyType);
		}
		condition.append(" and  ");
		if(queryFlag==3) {
			condition.append(" A.");
		}
		condition.append(QBOCmPartyBean.S_State).append("='U' ");
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), parameter, -1, -1);
		QBOCmPayerInfoBean[] dc =  null;
		int iAllCount = 0;
		if(queryFlag==3) { 
			sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), parameter, startNum, endNum);
		}
		if(queryFlag==1) {
			iAllCount = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSqlCount(QBOCmPayerInfoBean.class, condition.toString(), parameter);
			return iAllCount;
		}else if(queryFlag==3){
			dc = (QBOCmPayerInfoBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPayerInfoBean.class, sql, parameter);
			List partyList= new ArrayList();
			if(null!=dc&&dc.length>0) {
				for (int i = 0; i < dc.length; i++) {
					IQBOCmPartyValue value = new QBOCmPartyBean();
					value.copy(dc[i]);
					String a = dc[i].getAddressId();// 地址描述保存到remarks字段。之前copy的到是party的remarks
					value.setRemarks(a); 
					String certCodeResult = dc[i].getCertCode();
					if(StringUtils.isNotBlank(certCodeResult)) {
						//判断是否是B2B,并且是KOB number，如果是需要去掉前面的0
						if(dc[i].getPartyType()>0&&dc[i].getPartyType()==3) {
							value.setCertCode(certCodeResult.replaceAll("^(0+)", ""));
						}else {
							if(certCodeResult.length()>4) {
								value.setCertCode(certCodeResult.replace(certCodeResult.substring(certCodeResult.length()-4, certCodeResult.length()), "****"));	
							}							
						}
					}
					long longCertType = dc[i].getCertType();
					if(longCertType<=0) {
						if(dc[i].getPartyType()>0&&dc[i].getPartyType()==1) {
							value.setCertType(8);
						}else {
							value.setCertType(17);
						}
					}
					
					partyList.add(value);
				}
				
				if(null!=partyList&&partyList.size()>0) {
					return partyList.toArray(new QBOCmPartyBean[0]);
				}
			}
		}
		
		return null;
	}

	@Override
	public IQBOCmPartyValue queryPayerByPartyId(long partyId) throws Exception {
		// 根据partyId和角色类型查找partyRole
		ICmPartyRoleSV partyRoleService = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue[] partyRoleValue = partyRoleService.queryPartyRole(partyId, 5, -1, -1);
		if (partyRoleValue != null && partyRoleValue.length > 0) {
			// 存在payer角色
			StringBuilder condition = new StringBuilder();
			condition.append("1=1").append(" and A.").append(IQBOCmPayerInfoValue.S_PartyId).append("=:partyId");
			Map parameter = new HashMap();
			parameter.put("partyId", partyId);
			// SQL优化
			String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), parameter, -1, -1);
			IQBOCmPayerInfoValue[] payerInfoValue = (IQBOCmPayerInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPayerInfoBean.class, sql, parameter);
			IQBOCmPartyValue value = new QBOCmPartyBean();
			if (payerInfoValue != null && payerInfoValue.length > 0) {
				value.copy(payerInfoValue[0]);
				String a = payerInfoValue[0].getAddressId();
				// 地址描述保存到remarks字段。之前copy的到是party的remarks
				value.setRemarks(a);
			}
			return value;
		} else {
			return new QBOCmPartyBean();
		}
	}

	public Object queryPartyByCustId(long custId,String partyType,int queryFlag,int startNum,int endNum) throws AIException, Exception {
		/**
		 * 1查询客户信息获取partyId
		 * 2根据partyId查询party返回
		 */
		IQBOCmPartyValue qpartyVal = new QBOCmPartyBean();
		// 查询客户信息
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = customerSV.queryCustomerByCustId(custId);
		if (custValue == null) {
			throw new Exception("CustId:" + custId + " does not exist!");
		}
		
		long partyId = custValue.getPartyId();		
		return queryPartysByCondition(null,null, null, -1,-1,null,null,partyId,partyType,queryFlag, startNum, endNum);
	}
	public IQBOCmPartyValue queryPayerbyCustId(long custId) throws Exception {
		/**
		 * 1查询客户信息获取partyId
		 * 2根据partyId查询payer信息是payer返回
		 * 3不是payer查询客户信息查询contid
		 */
		IQBOCmPartyValue qpartyVal = new QBOCmPartyBean();
		// 查询客户信息
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue CustValue = customerSV.queryCustomerByCustId(custId);
		if (CustValue == null) {
			throw new Exception("CustId:" + custId + " does not exist!");
		}
		// 查询是否是payer如果是payer查询payer信息
		IBOCMPartyAcctRelValue[] rel = queryPartyAcctRel(CustValue.getPartyId());
		if (rel != null && rel.length > 0) {
			qpartyVal = queryPayerByPartyId(CustValue.getPartyId());
			if (qpartyVal.getCertType() <= 0) {
				qpartyVal.setCertType(qpartyVal.getPartyType() == 3 ? 17 : 8);
			}
		}
		if (qpartyVal.getPartyId() <= 0) {
			qpartyVal.setBirthday(CustValue.getBirthday());
			qpartyVal.setPartyName(CustValue.getCustName());
			qpartyVal.setFirstName(CustValue.getFirstName());
			qpartyVal.setLastName(CustValue.getLastName());
			qpartyVal.setCertCode(CustValue.getCustCertCode());
			qpartyVal.setCertType((CustValue.getCustType() == 3 ? 17 : 8));
			qpartyVal.setPartyId(CustValue.getPartyId());
			// 查询地址
			IQBOCmCustContMediumAndTypeValue[] mediaValue = customerSV.queryCustContactMediums(custId, 11, 1, -1, -1);
			if (mediaValue != null && mediaValue.length > 0) {
				qpartyVal.setContAddress(mediaValue[0].getAddressId() + "");
				qpartyVal.setRemarks(mediaValue[0].getAddressDetail());
			}

			if (CustValue.getCustType() == 1) {
				// 查询扩展个人信息
				IBOCmxIndivCustomerValue indivcustValueEx = customerSV.queryCmxIndivCustomerValue(custId);
				if (indivcustValueEx != null) {
					qpartyVal.setManualCommercialProtection(indivcustValueEx.getManualCommercialProtection());
					qpartyVal.setManualProtectEffectiveDate(indivcustValueEx.getManualProtectEffectiveDate());
					qpartyVal.setManualProtectExpireDate(indivcustValueEx.getManualProtectExpireDate());
					qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectExpireDate());
					qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectEffDate());
					qpartyVal.setDirectMarketingProtection(indivcustValueEx.getDirectMarketingProtection());
				}
			} else {
				// 查询扩展集团信息
				ICmLnGroupSV lnGroupSV = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
				IBOLnCmxGroupCustValue cmxGrpVal = lnGroupSV.queryGroupCustExtById(custId);
				if (cmxGrpVal != null) {
					qpartyVal.setProtectExpireDate(cmxGrpVal.getProtectExpireDate());
					qpartyVal.setProtectEffDate(cmxGrpVal.getProtectEffDate());
					qpartyVal.setDirectMarketingProtection(cmxGrpVal.getDirectMarketingProtection());
				}
				// 根据partyId查询contId

				IBOCmPartyContactValue[] contactValue = queryPartyContact(CustValue.getPartyId());
				if (contactValue != null && contactValue.length > 0) {
					qpartyVal.setContId(contactValue[0].getContId());
				}
			}
		}
		// 拼接地址详情
		String addressId = qpartyVal.getContAddress();
		if (StringUtils.isNotBlank(addressId)) {
			IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			address address = addressSV.getAddress(Long.parseLong(addressId), null);
			if (address != null) {
				qpartyVal.setRemarks(address.getAddrDesc().trim());
			}
		}
		return qpartyVal;

	}

	public IQBOCmPayerInfoValue[] queryPayerInfoByCertCode(long partyId, String certCode) throws Exception {
		// 根据partyId和角色类型查找partyRole
		ICmPartyRoleSV partyRoleService = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue[] partyRoleValue = partyRoleService.queryPartyRole(partyId, 5, -1, -1);
		if (partyRoleValue != null && partyRoleValue.length > 0 && partyRoleValue[0].getEntityId() == partyRoleValue[0].getPartyId()) {
			// 存在payer角色
			IQBOCmPayerInfoValue payerInfoValue[] = null;
			StringBuilder condition = new StringBuilder();
			condition.append("1=1").append(" and ").append(IQBOCmPayerInfoValue.S_CertCode).append("=:certCode");
			Map parameter = new HashMap();
			parameter.put("certCode", certCode);
			// SQL优化
			String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), parameter, -1, -1);
			payerInfoValue = (IQBOCmPayerInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPayerInfoBean.class, sql, parameter);
			return payerInfoValue;
		} else {
			// 不存在payer角色
			return null;
		}

	}

	public IQBOCmPartyValue queryGroupPayer(long partyId, String certCode, IQBOCmPartyValue qpartyVal) throws Exception {
		// 1查出集团客户相关信息
		// 2查询contId

		// 查询集团客户
		ICustomerValue customerData = null;
		if (StringUtils.isNotBlank(certCode)) {
			ICmGroupCustomerSV groupCustomerSV = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			customerData = groupCustomerSV.queryCustomerByKobNumber(certCode);
		}
		if (customerData == null || customerData.getState().equalsIgnoreCase(CmConstants.RecordState.ERASE)) {
			throw new Exception("Can Not Find Group Customer By KOB Number");
		}

		// 查询扩展信息
		ICmLnGroupSV lnGroupSV = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
		IBOLnCmxGroupCustValue cmxGrpVal = lnGroupSV.queryGroupCustExtById(customerData.getCustId());
		if (cmxGrpVal != null) {
			qpartyVal.setProtectExpireDate(cmxGrpVal.getProtectExpireDate());
			qpartyVal.setProtectEffDate(cmxGrpVal.getProtectEffDate());
			qpartyVal.setDirectMarketingProtection(cmxGrpVal.getDirectMarketingProtection());
		}
		// 查询地址
		ICmCustomerSV customerService = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IQBOCmCustContMediumAndTypeValue[] mediaValue = customerService.queryCustContactMediums(customerData.getCustId(), 11, 1, -1, -1);
		if (mediaValue != null && mediaValue.length > 0) {
			qpartyVal.setContAddress(mediaValue[0].getAddressId() + "");
			qpartyVal.setRemarks(mediaValue[0].getAddressDetail());

		}
		// 根据partyId查询contId
		IBOCmPartyContactValue[] contactValue = queryPartyContact(partyId);
		if (contactValue != null && contactValue.length > 0) {
			qpartyVal.setContId(contactValue[0].getContId());
		}
		return qpartyVal;
	}

	public IQBOCmPartyValue queryIndivPayer(long partyId, String certCode, IQBOCmPartyValue qpartyVal) throws Exception {
		/** 
		 *  0根据partyId查询contId
		 *  1查询是否是payer
		 *	2是Payer直接返回
		 *  3不是Payer查询个人客户相关信息和contId
		 */
		// 根据partyId查询contId
		long contId = -1;
		IBOCmPartyContactValue[] contactValue = queryPartyContact(partyId);
		if (contactValue != null && contactValue.length > 0) {
			contId = contactValue[0].getContId();
		}
		// 查询payer信息
		ICmPartySV partyService = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IQBOCmPayerInfoValue[] temp = partyService.queryPayerInfoByCertCode(partyId, certCode);
		if (temp != null && temp.length > 0 && StringUtils.isNotBlank(temp[0].getAddressId())) {

			qpartyVal.copy(temp[0]);
			String a = temp[0].getAddressId();// 地址描述保存到remarks字段。之前copy的到是party的remarks
			qpartyVal.setRemarks(a);
			return qpartyVal;
		} else {
			ICmCustomerSV customerService = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmIndivCustomerValue[] indivCustValue = customerService.queryCustomerByCPR(certCode, -1);
			if (indivCustValue != null && indivCustValue.length > 0) {
				long custId = indivCustValue[0].getCustId();
				qpartyVal.setBirthday(indivCustValue[0].getBirthday());
				// 查询地址
				IQBOCmCustContMediumAndTypeValue[] mediaValue = customerService.queryCustContactMediums(custId, 11, 1, -1, -1);
				if (mediaValue != null && mediaValue.length > 0) {
					qpartyVal.setContAddress(mediaValue[0].getAddressId() + "");
					qpartyVal.setRemarks(mediaValue[0].getAddressDetail());
					if (mediaValue[0].getProtectEffDate() != null && mediaValue[0].getProtectExpDate() != null) {
						qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.YES));
						qpartyVal.setExt9(mediaValue[0].getProtectEffDate());
						qpartyVal.setExt10(mediaValue[0].getProtectExpDate());
					} else {
						qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
					}
				}
				// 查询联系电话,email
				ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
				IQBOCmCustContMediumAndTypeValue[] contValues = customerSV.queryCustElectronicMedium(custId, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(contValues)) {
					for (IQBOCmCustContMediumAndTypeValue value : contValues) {
						if (value.getContMedTypeId() == CmConstants.AddressId.CONTACT_NUMBER) {
							qpartyVal.setContMobile(value.getContNumber());
						} else if (value.getContMedTypeId() == CmConstants.AddressId.EMAIL) {
							qpartyVal.setContEmail(value.getEmailAddress());
						}

					}
				}
				// 查询扩展信息
				IBOCmxIndivCustomerValue indivcustValueEx = customerService.queryCmxIndivCustomerValue(custId);
				if (indivcustValueEx != null) {
					qpartyVal.setManualCommercialProtection(indivcustValueEx.getManualCommercialProtection());
					qpartyVal.setManualProtectEffectiveDate(indivcustValueEx.getManualProtectEffectiveDate());
					qpartyVal.setManualProtectExpireDate(indivcustValueEx.getManualProtectExpireDate());
					qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectExpireDate());
					qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectEffDate());
					qpartyVal.setDirectMarketingProtection(indivcustValueEx.getDirectMarketingProtection());
				}
				qpartyVal.setContId(contId);
				return qpartyVal;
			} else {
				// 联系人
				qpartyVal.setContId(contId);
				return qpartyVal;
			}
		}
	}

	private IQBOCmPartyValue queryIndivPayer4AddPayer(long partyId, String certCode, IQBOCmPartyValue qpartyVal) throws Exception {
		/** 
		 *  0根据partyId查询contId
		 *  1查询是否是payer
		 *	2是Payer直接返回
		 *  3不是Payer查询个人客户相关信息和contId
		 */
		// 根据partyId查询contId
		long contId = -1;
		IBOCmPartyContactValue[] contactValue = queryPartyContact(partyId);
		if (contactValue != null && contactValue.length > 0) {
			contId = contactValue[0].getContId();
		}
		// 查询payer信息
		ICmPartySV partyService = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IQBOCmPayerInfoValue[] temp = partyService.querySpecialPayerInfoByCertCode(partyId, certCode);
		if (temp != null && temp.length > 0 && StringUtils.isNotBlank(temp[0].getAddressId())) {

			qpartyVal.copy(temp[0]);
			String a = temp[0].getAddressId();// 地址描述保存到remarks字段。之前copy的到是party的remarks
			qpartyVal.setRemarks(a);
			return qpartyVal;
		} else {
			ICmCustomerSV customerService = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmIndivCustomerValue[] indivCustValue = customerService.queryCustomerByCPR(certCode, -1);
			if (indivCustValue != null && indivCustValue.length > 0) {
				long custId = indivCustValue[0].getCustId();
				qpartyVal.setBirthday(indivCustValue[0].getBirthday());
				// 查询地址
				IQBOCmCustContMediumAndTypeValue[] mediaValue = customerService.queryCustContactMediums(custId, 11, 1, -1, -1);
				if (mediaValue != null && mediaValue.length > 0) {
					qpartyVal.setContAddress(mediaValue[0].getAddressId() + "");
					qpartyVal.setRemarks(mediaValue[0].getAddressDetail());
					if (mediaValue[0].getProtectEffDate() != null && mediaValue[0].getProtectExpDate() != null) {
						qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.YES));
						qpartyVal.setExt9(mediaValue[0].getProtectEffDate());
						qpartyVal.setExt10(mediaValue[0].getProtectExpDate());
					} else {
						qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
					}
				}
				// 查询联系电话,email
				ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
				IQBOCmCustContMediumAndTypeValue[] contValues = customerSV.queryCustElectronicMedium(custId, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(contValues)) {
					for (IQBOCmCustContMediumAndTypeValue value : contValues) {
						if (value.getContMedTypeId() == CmConstants.AddressId.CONTACT_NUMBER) {
							qpartyVal.setContMobile(value.getContNumber());
						} else if (value.getContMedTypeId() == CmConstants.AddressId.EMAIL) {
							qpartyVal.setContEmail(value.getEmailAddress());
						}

					}
				}
				// 查询扩展信息
				IBOCmxIndivCustomerValue indivcustValueEx = customerService.queryCmxIndivCustomerValue(custId);
				if (indivcustValueEx != null) {
					qpartyVal.setManualCommercialProtection(indivcustValueEx.getManualCommercialProtection());
					qpartyVal.setManualProtectEffectiveDate(indivcustValueEx.getManualProtectEffectiveDate());
					qpartyVal.setManualProtectExpireDate(indivcustValueEx.getManualProtectExpireDate());
					qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectExpireDate());
					qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectEffDate());
					qpartyVal.setDirectMarketingProtection(indivcustValueEx.getDirectMarketingProtection());
				}
				qpartyVal.setContId(contId);
				return qpartyVal;
			} else {
				// 联系人
				qpartyVal.setContId(contId);
				return qpartyVal;
			}
		}
	}

	public IBOCMPartyAcctRelValue[] queryPartyAcctRel(long partyId) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1").append(" and ").append(IBOCMPartyAcctRelValue.S_PartyId).append("=:partyId");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		IBOCMPartyAcctRelValue[] value = (IBOCMPartyAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCMPartyAcctRelBean.class, condition.toString(), parameter,
				-1, -1);
		return value;
	}

	public IPartyValue[] queryPartyByCdns(String conditions, int startNum, int endNum) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		IPartyValue[] partyValues = (IPartyValue[]) busiModelImpl.queryData(conditions, startNum, endNum);
		List<PartyBean> list = new ArrayList<PartyBean>();
		if (CmCommonUtil.isNotEmptyObject(partyValues)) {
			for (int i = 0; i < partyValues.length; i++) {
				String edit = "";
				if (StringUtils.isNotBlank(partyValues[i].getCprId())) {
					edit = "<a href='javascript:void(0)' class='cellpath' onclick='queryCprStatus(" + partyValues[i].getCprId()
							+ ")' style='color:blue;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0013086") + "</a>";
				}
				partyValues[i].setAction(edit);
				PartyBean partyBean = new PartyBean();
				partyBean.copy(partyValues[i]);
				// 设置模糊属性
				BOMaskHelper.setOperateMaskFlag();
				BOMaskHelper.mask(partyBean);
				// 清除模糊属性
				BOMaskHelper.setOperateNotMaskFlag();
				BOMaskHelper.clearOperateMaskFlag();
				list.add(partyBean);
			}
			return list.toArray(new PartyBean[] {});
		}
		return new IPartyValue[0];
	}

	public int queryPartyByCdnsCount(String conditions) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		return busiModelImpl.queryCount(conditions);
	}
	
	public IBOCmPartyContactValue[] queryPartyContact(long partyId) throws Exception {
		if (partyId > 0) {
			StringBuilder sql = new StringBuilder();
			sql.append("1=1").append(" and ").append(IBOCmPartyContactValue.S_PartyId).append("=:partyId");
			Map parameter = new HashMap();
			parameter.put("partyId", partyId);
			IBOCmPartyContactValue[] result = (IBOCmPartyContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyContactBean.class, sql.toString(), parameter,
					-1, -1);
			return result;
		} else {
			return null;
		}

	}
	
	/**
	 * 根据cont_id 查询cm_party_contact记录
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-24
	* CmPartySVImpl
	 */
	public IBOCmPartyContactValue[] queryPartyContactByContId(long contId) throws Exception {
		if (contId > 0) {
			StringBuilder sql = new StringBuilder();
			sql.append("1=1").append(" and ").append(IBOCmPartyContactValue.S_ContId).append("=:contId");
			Map parameter = new HashMap();
			parameter.put("contId", contId);
			IBOCmPartyContactValue[] result = (IBOCmPartyContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyContactBean.class, sql.toString(), parameter,
					-1, -1);
			return result;
		} else {
			return null;
		}

	}

	public IPartyValue queryMaskPartyById(long partyId) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		DataContainer cond = new DataContainer();
		cond.set(IPartyValue.S_PartyId, Long.valueOf(partyId));
		IPartyValue[] partyValues = (IPartyValue[]) busiModelImpl.queryData(new DataContainer[] { cond }, -1, -1);
		IPartyValue partyValue = null;
		if (CmCommonUtil.isNotEmptyObject(partyValues)) {
			partyValue = partyValues[0];
		}
		PartyBean partyBean = new PartyBean();
		partyBean.copy(partyValue);
		// 设置模糊属性
		BOMaskHelper.setOperateMaskFlag();
		BOMaskHelper.mask(partyBean);
		// 清除模糊属性
		BOMaskHelper.setOperateNotMaskFlag();
		BOMaskHelper.clearOperateMaskFlag();
		return partyBean;
	}

	public DataContainer[] queryPartyInfoForUser(String partyName, String certType, String certCode, String cvr, String firstName, String lastName, String custId, String partyId,
			int startIndex, int endIndex) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		if (StringUtils.isNotBlank(partyId)) {
			condition.append(" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM {CM_PARTY} m where m.party_id= :partyId ");
			parameter.put("partyId", partyId);
		} else if (StringUtils.isNotBlank(partyName) || StringUtils.isNotBlank(certType) || StringUtils.isNotBlank(certCode) || StringUtils.isNotBlank(cvr)
				|| StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName) || StringUtils.isNotBlank(custId)) {
			StringBuilder indivCondition = new StringBuilder(
					" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM  {CM_PARTY} m,{CM_INDIV_CUSTOMER} n WHERE m.party_id = n.party_id AND m.STATE = 'U' AND n.STATE = 'U' ");
			StringBuilder groupCondition = new StringBuilder(
					" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM  {CM_PARTY} m,{CM_GROUP_CUSTOMER} n,{CMX_GROUP_CUSTOMER} a WHERE m.party_id = n.party_id AND n.cust_id=a.cust_id AND m.STATE = 'U' AND n.STATE = 'U' ");
			StringBuilder acctCondition = new StringBuilder(
					" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM  {CM_PARTY} m,{CM_PARTY_ACCT_REL} n WHERE m.party_id = n.party_id AND m.STATE = 'U' AND n.STATE = 'U' AND EXISTS  (SELECT 1 FROM {CM_PARTY_ROLE} x WHERE m.PARTY_ID = x.PARTY_ID AND x.STATE = 'U' AND x.ROLE_STATUS!=2) ");
			if (StringUtils.isNotBlank(partyName)) {
				// 针对partyName的处理
				indivCondition.append(" AND m.PARTY_NAME LIKE :partyName ");
				groupCondition.append(" AND m.PARTY_NAME LIKE :partyName ");
				acctCondition.append(" AND m.PARTY_NAME LIKE :partyName ");
				parameter.put("partyName", partyName + "%");
			}
			if (StringUtils.isNotBlank(firstName)) {
				// 针对firstName的处理
				indivCondition.append(" AND m.FIRST_NAME LIKE :firstName ");
				groupCondition.append(" AND m.FIRST_NAME LIKE :firstName ");
				acctCondition.append(" AND m.FIRST_NAME LIKE :firstName ");
				parameter.put("firstName", firstName + "%");
			}
			if (StringUtils.isNotBlank(lastName)) {
				// 针对lastName的处理
				indivCondition.append(" AND m.LAST_NAME LIKE :lastName ");
				groupCondition.append(" AND m.LAST_NAME LIKE :lastName ");
				acctCondition.append(" AND m.LAST_NAME LIKE :lastName ");
				parameter.put("lastName", lastName + "%");
			}
			if (StringUtils.isNotBlank(custId)) {
				// 针对custId的处理
				indivCondition.append(" AND n.CUST_ID = :custId ");
				groupCondition.append(" AND n.CUST_ID = :custId ");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(certType) && !("-1".equals(certType))) {
				// 针对证件类型和证件号码
				indivCondition.append(" AND m.CERT_TYPE =:certType AND m.CERT_CODE =:certCode ");
				groupCondition.append(" AND m.CERT_TYPE =:certType AND m.CERT_CODE =:certCode ");
				acctCondition.append(" AND m.CERT_TYPE =:certType AND m.CERT_CODE =:certCode ");
				if (String.valueOf(CmConstants.CertificateType.KOB_NUMBER).equals(certType)) {
					if (certCode.indexOf("K") < 0) {
						certCode = StringUtils.leftPad(certCode, 10, "0");
					}
				}
				parameter.put("certType", certType);
				parameter.put("certCode", certCode);
			}
			if (StringUtils.isNotBlank(cvr)) {
				// 针对集团的税号
				groupCondition.append("AND a.TAX_ID =:taxId ");
				parameter.put("taxId", cvr);
			}
			if (StringUtils.isNotBlank(cvr)) {
				condition.append(groupCondition);
			} else if (StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName)) {
				if (StringUtils.isNotBlank(custId)) {
					condition.append(indivCondition);
				} else {
					condition.append(indivCondition).append(" UNION ").append(acctCondition);
				}
			} else if (StringUtils.isNotBlank(custId)) {
				condition.append(indivCondition).append(" UNION ALL ").append(groupCondition);
			} else {
				condition.append(indivCondition).append(" UNION ALL ").append(groupCondition).append(" UNION ").append(acctCondition);
			}
		}
		if (startIndex == -1 && endIndex == -1) {
			String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.USER_SEARCH, sql.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
			DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
			List<PartyBean> list = new ArrayList<PartyBean>();
			if (CmCommonUtil.isNotEmptyObject(dcs)) {
				// 证件模糊化
				for (DataContainer dc : dcs) {
					PartyBean partyValue = new PartyBean();
					partyValue.copy(dc);
					BOMaskHelper.setOperateMaskFlag();
					BOMaskHelper.mask(partyValue);
					BOMaskHelper.setOperateNotMaskFlag();
					BOMaskHelper.clearOperateMaskFlag();
					list.add(partyValue);
				}
			}
			return list.toArray(new PartyBean[0]);
		}
		if (startIndex < 0 && endIndex >= 0) {
			condition.append(" limit ").append("0").append(",").append(endIndex);
		} else if (endIndex < 0 && startIndex >= 0) {
			if (startIndex > 0) {
				condition.append(" limit ").append(startIndex - 1).append(",").append("18446744073709551615");
			} else {
				condition.append(" limit ").append(startIndex).append(",").append("18446744073709551615");
			}
		} else if (endIndex < startIndex) {
			condition.append(" limit ").append("0").append(",").append("0");
		} else {
			int offset = (endIndex - startIndex) + 1;
			int tmpStart = 0;
			if (startIndex > 0) {
				tmpStart = startIndex - 1;
			} else {
				tmpStart = 0;
			}
			condition.append(" limit ").append(tmpStart).append(",").append(offset);
		}

		String sqll = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		ICmCommonSV commonSVV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSVV.saveCommonQryBusiLog(CmConstants.BusiLogId.USER_SEARCH, sqll.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, condition.toString(), parameter);
		List<PartyBean> list = new ArrayList<PartyBean>();
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			// 证件模糊化
			for (DataContainer dc : dcs) {
				PartyBean partyValue = new PartyBean();
				partyValue.copy(dc);
				BOMaskHelper.setOperateMaskFlag();
				BOMaskHelper.mask(partyValue);
				BOMaskHelper.setOperateNotMaskFlag();
				BOMaskHelper.clearOperateMaskFlag();
				list.add(partyValue);
			}
		}
		return list.toArray(new PartyBean[0]);
	}

	public int queryPartyInfoForUserCount(String partyName, String certType, String certCode, String cvr, String firstName, String lastName, String custId, String partyId)
			throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap parameter = new HashMap();
		if (StringUtils.isNotBlank(partyId)) {
			condition.append(" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM {CM_PARTY} m where m.party_id= :partyId ");
			parameter.put("partyId", partyId);
		} else if (StringUtils.isNotBlank(partyName) || StringUtils.isNotBlank(certType) || StringUtils.isNotBlank(certCode) || StringUtils.isNotBlank(cvr)
				|| StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName) || StringUtils.isNotBlank(custId)) {
			StringBuilder indivCondition = new StringBuilder(
					" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM  {CM_PARTY} m,{CM_INDIV_CUSTOMER} n WHERE m.party_id = n.party_id AND m.STATE = 'U' AND n.STATE = 'U' ");
			StringBuilder groupCondition = new StringBuilder(
					" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM  {CM_PARTY} m,{CM_GROUP_CUSTOMER} n,{CMX_GROUP_CUSTOMER} a WHERE m.party_id = n.party_id AND n.cust_id=a.cust_id AND m.STATE = 'U' AND n.STATE = 'U' ");
			StringBuilder acctCondition = new StringBuilder(
					" SELECT m.party_id,m.party_name,m.cert_type,m.cert_code FROM  {CM_PARTY} m,{CM_PARTY_ACCT_REL} n WHERE m.party_id = n.party_id AND m.STATE = 'U' AND n.STATE = 'U' AND EXISTS  (SELECT 1 FROM {CM_PARTY_ROLE} x WHERE m.PARTY_ID = x.PARTY_ID AND x.STATE = 'U' AND x.ROLE_STATUS!=2) ");
			if (StringUtils.isNotBlank(partyName)) {
				// 针对partyName的处理
				indivCondition.append(" AND m.PARTY_NAME LIKE :partyName ");
				groupCondition.append(" AND m.PARTY_NAME LIKE :partyName ");
				acctCondition.append(" AND m.PARTY_NAME LIKE :partyName ");
				parameter.put("partyName", partyName + "%");
			}
			if (StringUtils.isNotBlank(firstName)) {
				// 针对firstName的处理
				indivCondition.append(" AND m.FIRST_NAME LIKE :firstName ");
				groupCondition.append(" AND m.FIRST_NAME LIKE :firstName ");
				acctCondition.append(" AND m.FIRST_NAME LIKE :firstName ");
				parameter.put("firstName", firstName + "%");
			}
			if (StringUtils.isNotBlank(lastName)) {
				// 针对lastName的处理
				indivCondition.append(" AND m.LAST_NAME LIKE :lastName ");
				groupCondition.append(" AND m.LAST_NAME LIKE :lastName ");
				acctCondition.append(" AND m.LAST_NAME LIKE :lastName ");
				parameter.put("lastName", lastName + "%");
			}
			if (StringUtils.isNotBlank(custId)) {
				// 针对custId的处理
				indivCondition.append(" AND n.CUST_ID = :custId ");
				groupCondition.append(" AND n.CUST_ID = :custId ");
				parameter.put("custId", custId);
			}

			if (StringUtils.isNotBlank(certType) && !("-1".equals(certType))) {
				// 针对证件类型和证件号码
				indivCondition.append(" AND m.CERT_TYPE =:certType AND m.CERT_CODE =:certCode ");
				groupCondition.append(" AND m.CERT_TYPE =:certType AND m.CERT_CODE =:certCode ");
				acctCondition.append(" AND m.CERT_TYPE =:certType AND m.CERT_CODE =:certCode ");
				if (String.valueOf(CmConstants.CertificateType.KOB_NUMBER).equals(certType)) {
					if (certCode.indexOf("K") < 0) {
						certCode = StringUtils.leftPad(certCode, 10, "0");
					}
				}
				parameter.put("certType", certType);
				parameter.put("certCode", certCode);
			}
			if (StringUtils.isNotBlank(cvr)) {
				// 针对集团的税号
				groupCondition.append("AND a.TAX_ID =:taxId ");
				parameter.put("taxId", cvr);
			}
			if (StringUtils.isNotBlank(cvr)) {
				condition.append(groupCondition);
			} else if (StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName)) {
				if (StringUtils.isNotBlank(custId)) {
					condition.append(indivCondition);
				} else {
					condition.append(indivCondition).append(" UNION ").append(acctCondition);
				}
			} else if (StringUtils.isNotBlank(custId)) {
				condition.append(indivCondition).append(" UNION ALL ").append(groupCondition);
			} else {
				condition.append(indivCondition).append(" UNION ALL ").append(groupCondition).append(" UNION ").append(acctCondition);
			}
		}
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.USER_SEARCH, sql.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(condition.toString(), "", parameter), parameter);
		return counts[0].getAsInt("CNT");
	}

	public IPartyValue[] queryMaskPartyByName(String partyName, int startIndex, int endIndex) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		DataContainer cond = new DataContainer();
		cond.set(IPartyValue.S_PartyName, partyName);
		cond.set(IPartyValue.S_PartyType, CmConstants.PartyType.INDIVIDUAL);
		cond.set(IPartyValue.S_State, CmConstants.RecordState.USE);
		cond.set("MATCH_TYPE", CmConstants.MatchType.BOTH_MATCH);
		IPartyValue[] partyValues = (IPartyValue[]) busiModelImpl.queryData(new DataContainer[] { cond }, startIndex, endIndex);
		List<IPartyValue> list = new ArrayList<IPartyValue>();
		if (CmCommonUtil.isNotEmptyObject(partyValues)) {
			for (IPartyValue partyValue : partyValues) {
				if (StringUtils.isNotBlank(partyValue.getCertCode())) {
					// 证件号码模糊化
					PartyBean partyBean = new PartyBean();
					partyBean.copy(partyValue);
					BOMaskHelper.setOperateMaskFlag();
					BOMaskHelper.mask(partyBean);
					BOMaskHelper.setOperateNotMaskFlag();
					BOMaskHelper.clearOperateMaskFlag();
					list.add(partyBean);
				} else {
					list.add(partyValue);
				}
			}
			return list.toArray(new IPartyValue[0]);
		}
		return new IPartyValue[0];
	}

	public int queryMaskPartyByNameCount(String partyName) throws Exception {
		AbstractPartyQueryBusiModelImpl busiModelImpl = (AbstractPartyQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractPartyQueryBusiModelImpl.class);
		DataContainer cond = new DataContainer();
		cond.set(IPartyValue.S_PartyName, partyName);
		cond.set(IPartyValue.S_PartyType, CmConstants.PartyType.INDIVIDUAL);
		cond.set(IPartyValue.S_State, CmConstants.RecordState.USE);
		cond.set("MATCH_TYPE", CmConstants.MatchType.BOTH_MATCH);
		return busiModelImpl.queryCount(new DataContainer[] { cond });
	}

	public long queryCustIdForUser(long partyId) throws Exception {
		if (partyId > 0) {
			ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRole(partyId, -1, -1, -1);
			// 如果该参与人有客户，使用者，成员角色则直接取custId,否则创建一个user
			for (int i = 0; i < roleValues.length; i++) {
				long roleType = roleValues[i].getRoleType();
				if (roleType == CmConstants.PartyRoleType.CUSTOMER || roleType == CmConstants.PartyRoleType.EMPLOYEE || roleType == CmConstants.PartyRoleType.USER) {
					return roleValues[i].getEntityId();
				}
			}
			// 用partyId去客户表查
			DataContainer dc = new DataContainer();
			dc.set("PARTY_ID", partyId);
			IBOCmIndivCustomerValue[] indivValue = this.queryCustByPartyId(partyId);
			if (CmCommonUtil.isNotEmptyObject(indivValue)) {
				// 保存使用者
				saveUserRole(indivValue[0].getCustId(), partyId);
				return indivValue[0].getCustId();
			}
			// 创建一个使用者
			// 查询party信息
			IQBOCmPartyValue partyValue = queryPayerByPartyId(partyId);
			long custId = commonSV.getCustId(CmConstants.CustomerType.INDIVIDUAL);
			String CPRNumber = partyValue.getCertCode();
			IVOCustValue voCustValue = new VOCustBean();
			ICustomerValue customerValue = new CustomerBean();
			customerValue.setFirstName(partyValue.getFirstName());
			customerValue.setPartyId(partyId);
			customerValue.setLastName(partyValue.getLastName());
			customerValue.setCustId(custId);
			customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			customerValue.setState(CmConstants.RecordState.USE);
			customerValue.setAnonymousFlag(0);
			customerValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
			customerValue.setCustStatus(CmConstants.CustomerStatus.INDIV_POTENTIAL);
			customerValue.setRealNameFlag(0);
			customerValue.setCustLanguage("1");
			if (StringUtils.isNotBlank(CPRNumber)) {
				customerValue.setCustCertType(CmConstants.CertificateType.CPR);
				customerValue.setCustCertCode(CPRNumber);
				// cprnumber奇数为male,偶数为female
				if (Long.parseLong(CPRNumber) % 2 == 1) {
					customerValue.setGender(1);
				} else {
					customerValue.setGender(2);
				}
			} else {
				// 默认塞"male"
				customerValue.setGender(1);
			}
			customerValue.setBirthday(partyValue.getBirthday());
			// 设置客户子类型为使用者
			customerValue.setIndivCustType(String.valueOf(CmConstants.EntityType.USER));
			voCustValue.setCustomer(customerValue);
			// 设置客户扩展信息
			DataContainerInterface cmxIndiv = new DataContainer();
			cmxIndiv.set("CUST_ID", custId);
			cmxIndiv.set("REGION_ID", CmCommonUtil.getDefaultRegionId());
			cmxIndiv.set("STATE", CmConstants.RecordState.USE);
			cmxIndiv.set("PNR", custId);
			voCustValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, cmxIndiv);
			// 保存地址信息
			IBOCmCustContactMediumValue contactValue = new BOCmCustContactMediumBean();
			contactValue.setCustId(custId);
			contactValue.setAddressDetail(partyValue.getRemarks());
			contactValue.setAddressId(Long.parseLong(partyValue.getContAddress()));
			contactValue.setContMedTypeId(CmConstants.AddressId.legalAddress);
			contactValue.setState(CmConstants.RecordState.USE);
			contactValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			custSV.saveCustContMedium(new IBOCmCustContactMediumValue[] { contactValue });
			// 保存客户信息
			CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);
			// 保存使用者
			saveUserRole(custId, partyId);
			return custId;
		}
		return 0;
	}

	@Override
	public IBOCmIndivCustomerValue[] queryCustByPartyId(long partyId) throws Exception {
		if (partyId > 0) {
			StringBuffer condition = new StringBuffer(" 1=1 ");
			HashMap map = new HashMap();
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_PartyId).append(" =:partyId ");
			map.put("partyId", partyId);
			condition.append(" AND ").append(IBOCmIndivCustomerValue.S_State).append(" =:state ");
			map.put("state", CmConstants.RecordState.USE);
			return (IBOCmIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivCustomerBean.class, condition.toString(), map, -1, -1);
		}
		return new IBOCmIndivCustomerValue[0];
	}

	private void saveUserRole(long custId, long partyId) throws Exception {
		// 创建使用者角色
		ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRoles(partyId, CmConstants.roleType.user, -1);
		// AI-14295 不存在user角色才新增
		if (roleValues == null || roleValues.length <= 0) {
			com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue roleValue = new com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean();
			roleValue.setEntityId(custId);
			roleValue.setRoleType(CmConstants.PartyRoleType.USER);
			roleValue.setPartyId(partyId);
			roleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
			roleValue.setState(CmConstants.RecordState.USE);
			roleSV.savePartyRoleInfo(roleValue);
		}
	}

	@Override
	public void createPayerByCds(IQBOCmPartyValue value) throws AIException, Exception {
		if (value == null) {
			throw new Exception("Can't Find Payer Infromation");
		}
		long partyId = value.getPartyId();
		long certType = value.getCertType();
		if (partyId <= 0) {
			throw new Exception("Abnoraml Data:[partyId=" + partyId + "]");
		}

		// 查询party，如果cprId为空则插入partyId
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		IPartyValue partyValue = partySV.queryPartyById(partyId);
		if (certType == 8 && partyValue != null && StringUtils.isBlank(partyValue.getCprId())) {
			partyValue.setCprId(Long.toString(CmCommonUtil.getNewSequence(BOCmClubBean.class)));
		}
		IVOPartyValue voPartyValue = new VOPartyBean();
		voPartyValue.setParty(partyValue);
		IPartyRoleValue partyRoleValue = getPartyRoleValue(partyId);
		// 若不存在payer角色则插入cm_party_role表创建角色payer
		if (partyRoleValue != null) {
			voPartyValue.setPartyRole(partyRoleValue);
		}
		// 保存参与人联系信息
		IBOCmPartyContactValue partyContactBean = new BOCmPartyContactBean();
		partyContactBean.setPartyId(partyId);
		partyContactBean.setContId(CmCommonUtil.getNewSequence(BOCmPartyContactBean.class));
		partyContactBean.copy(value);
		IPartyContactValue partyContactValue = getPartyContactValue(partyContactBean);
		voPartyValue.setPartyContact(partyContactValue);
		ICmPartySV service = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		voPartyValue.setBusinessId(CmConstants.BusiLogId.PAYER);
		service.saveParty(voPartyValue);
	}

	/**
	 * 创建参与人角色。存在则不创建
	 * @param partyId
	 * @throws Exception
	 */
	private IPartyRoleValue getPartyRoleValue(long partyId) throws Exception {
		ICmPartyRoleSV service = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue[] roleVal = service.queryPartyRole(partyId, ICmPartySV.ROLE_PAYER, -1, -1);
		// 未查到数据，参与人角色不是payer
		if (roleVal.length == 0) {
			// 创建角色为payer的参与人
			BOCmPartyRoleBean roleBean = new BOCmPartyRoleBean();
			roleBean.setPartyId(partyId);
			roleBean.setRoleType(CmConstants.PartyRoleType.PAYER);
			roleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
			roleBean.setState(CmConstants.RecordState.USE);
			roleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
			roleBean.setCreateOpId(ServiceManager.getUser().getID());
			roleBean.setCreateOrgId(ServiceManager.getUser().getOrgId());
			roleBean.setEntityId(partyId);
			roleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
			IPartyRoleValue value = new PartyRoleBean();
			value.copy(roleBean);
			return value;
		} else {
			// 创建代付账户将entityId改成partyId
			BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
			bean.copy(roleVal[0]);
			bean.setEntityId(partyId);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
			return null;
		}
	}

	/**
	 * 保存参与人联系信息，不存在则创建
	 * @param partyContactVal
	 * @throws Exception
	 * @throws AIException
	 */
	private IPartyContactValue getPartyContactValue(IBOCmPartyContactValue partyContactVal) throws Exception, AIException {
		Long partyId = partyContactVal.getPartyId();
		if (partyId != null && !partyId.equals("")) {
			StringBuilder sql = new StringBuilder();
			sql.append("1=1").append(" and ").append(IBOCmPartyContactValue.S_PartyId).append("=:partyId");
			Map parameter = new HashMap();
			parameter.put("partyId", partyId);
			IBOCmPartyContactValue[] result = (IBOCmPartyContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyContactBean.class, sql.toString(), parameter,
					-1, -1);
			if (null == result || result.length == 0) {
				partyContactVal.setContId(CmCommonUtil.getNewSequence(BOCmPartyContactBean.class));
				IPartyContactValue bean = new PartyContactBean();
				bean.copy(partyContactVal);
				bean.setStsToNew();
				return bean;
			} else {
				IPartyContactValue bean = new PartyContactBean();
				bean.copy(partyContactVal);
				bean.setStsToNew();
				bean.setContId(result[0].getContId());
				bean.initProperty("CONT_ID", result[0].getContId());
				return bean;
			}
		} else {
			throw new Exception("PartyId does not exsists");
		}
	}

	/**
	 * custId是账户归属地客户的id,当时自有账户就是payer的custId
	 */
	@Override
	public DataContainer[] queryPayerByDts(int custType, long custId, String firstName, String lastName, String cpr, String birthDay, long addressId, String companyName,
			String kob, String cvr, String insflags[], int aStartNum, int aEndNum) throws AIException, Exception {

		StringBuilder sql = new StringBuilder();
		Map parameter = new HashMap();

		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			sql.append("SELECT  * FROM ( ");
			sql.append("(SELECT  e.`ACCT_NAME`,  e.`ACCT_ID`,  e.`CYCLE_TYPE`,  e.`BILL_DAY`,e.INSTALLMENT_FLAG, A.FIRST_NAME,A.LAST_NAME,A.CERT_CODE,b.BIRTHDAY,c.CONT_ADDRESS,c.REMARKS,e.EXT1 AS ACCT_STATUS FROM {CM_PARTY} A,  {CM_INDIV_PARTY} b,  {CM_PARTY_CONTACT} c,  {CM_PARTY_ACCT_REL} d,  {CM_CUST_ACCT_REL} e WHERE a.party_id = b.`PARTY_ID`  AND a.PARTY_ID=d.PARTY_ID   AND a.`PARTY_ID` = c.`PARTY_ID` AND d.`ACCT_ID` = e.`ACCT_ID` and e.PAY_METHOD = 2 ");

			if (StringUtils.isNotBlank(firstName)) {
				sql.append(" AND a.FIRST_NAME like ").append(":firstName");
				parameter.put("firstName", "%" + firstName + "%");
			}
			if (StringUtils.isNotBlank(lastName)) {
				sql.append(" AND a.LAST_NAME like ").append(":lastName");
				parameter.put("lastName", "%" + lastName + "%");
			}
			if (StringUtils.isNotBlank(cpr)) {
				sql.append(" AND a.CERT_CODE").append("=:cpr");
				parameter.put("cpr", cpr);
			}
			if (StringUtils.isNotBlank(birthDay)) {
				sql.append(" AND b.BIRTHDAY").append("=:birthDay");
				parameter.put("birthDay", birthDay);
			}
			if (addressId > 0) {
				sql.append(" AND c.CONT_ADDRESS").append("=:addressId");
				parameter.put("addressId", addressId);
			}
			if (custId > 0) {
				sql.append(" AND e.REL_CUST_ID").append("=:custId");
				parameter.put("custId", custId);
			}
			if (insflags != null && insflags.length > 0) {
				sql.append(" AND e.INSTALLMENT_FLAG in (");
				for (int i = 0; i < insflags.length; i++) {
					sql.append(insflags[i]);
					if (i != insflags.length - 1) {
						sql.append(",");
					}
				}
				sql.append(")");
			}

			sql.append(" ) UNION ALL (");
			// 瀹㈡埛鑱旂郴濯掍粙鍙煡11娉曞緥鍦板潃
			sql.append(" SELECT  t.`ACCT_NAME`,  t.`ACCT_ID`,   t.`CYCLE_TYPE`,   t.`BILL_DAY`,t.INSTALLMENT_FLAG ,m.FIRST_NAME,m.LAST_NAME,m.CUST_CERT_CODE AS CERT_CODE,m.BIRTHDAY,k.ADDRESS_ID AS CONT_ADDRESS,k.ADDRESS_DETAIL AS REMARKS,t.EXT1 AS ACCT_STATUS FROM {CM_CUST_ACCT_REL} t,  {CM_INDIV_CUSTOMER} m,   {CM_CUST_CONTACT_MEDIUM} k    WHERE t.rel_cust_id = m.cust_id     AND t.rel_cust_id=k.cust_id    AND t.pay_method=1 and k.CONT_MED_TYPE_ID=11");
			if (StringUtils.isNotBlank(firstName)) {
				sql.append(" AND m.FIRST_NAME like ").append(":firstName");
				parameter.put("firstName", "%" + firstName + "%");
			}
			if (StringUtils.isNotBlank(lastName)) {
				sql.append(" AND m.LAST_NAME like ").append(":lastName");
				parameter.put("lastName", "%" + lastName + "%");
			}
			if (StringUtils.isNotBlank(cpr)) {
				sql.append(" AND m.CUST_CERT_CODE").append("=:cpr");
				parameter.put("cpr", cpr);
			}
			if (StringUtils.isNotBlank(birthDay)) {
				sql.append(" AND m.BIRTHDAY").append("=:birthDay");
				parameter.put("birthDay", birthDay);
			}
			if (addressId > 0) {
				sql.append(" AND k.ADDRESS_ID").append("=:addressId");
				parameter.put("addressId", addressId);
			}
			if (custId > 0) {
				sql.append(" AND t.REL_CUST_ID").append("=:custId");
				parameter.put("custId", custId);
			}
			if (insflags != null && insflags.length > 0) {
				sql.append(" AND t.INSTALLMENT_FLAG in (");
				for (int i = 0; i < insflags.length; i++) {
					sql.append(insflags[i]);
					if (i != insflags.length - 1) {
						sql.append(",");
					}
				}
				sql.append(")");
			}
			sql.append(" )) result");
			if ((aStartNum >= 0) || (aEndNum >= 0)) {
				if ((aStartNum < 0) && (aEndNum >= 0)) {
					sql.append(" limit ").append("0").append(",").append(aEndNum);
				} else if ((aEndNum < 0) && (aStartNum >= 0)) {
					if (aStartNum > 0) {
						sql.append(" limit ").append(aStartNum - 1).append(",").append("18446744073709551615");
					} else {
						sql.append(" limit ").append(aStartNum).append(",").append("18446744073709551615");
					}

				} else if (aEndNum < aStartNum) {
					sql.append(" limit ").append("0").append(",").append("0");
				} else {
					int offset = aEndNum - aStartNum + 1;
					int tmpStart = 0;
					if (aStartNum > 0) {
						tmpStart = aStartNum - 1;
					} else {
						tmpStart = 0;
					}
					sql.append(" limit ").append(tmpStart).append(",").append(offset);
				}
			}
			DataContainer t[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			// 涓汉妯＄硦鍖�
			String custCertCode = "";
			if (t != null && t.length > 0) {
				for (int j = 0; j < t.length; j++) {
					custCertCode = t[j].getAsString("CERT_CODE");
					if (StringUtils.isNotBlank(custCertCode)) {
						int valueLength = custCertCode.length();
						if (valueLength > 6) {
							StringBuilder sb = new StringBuilder(valueLength);
							sb.append(custCertCode.substring(0, 6));
							for (int i = 0; i < valueLength - 6; i++) {
								sb.append("*");
							}
							t[j].set("CERT_CODE", sb.toString());
						} else {
							t[j].set("CERT_CODE", custCertCode);
						}
					}

				}
			}

			return t;
		} else if (custType == CmConstants.CustomerType.GROUP) {
			sql.append("SELECT * FROM ((SELECT   f.`ACCT_NAME`,  f.`ACCT_ID`,  f.`CYCLE_TYPE`,  f.`BILL_DAY`,f.INSTALLMENT_FLAG,A.PARTY_NAME,A.CERT_CODE,b.CONT_ADDRESS,b.REMARKS,d.TAX_ID,f.EXT3,f.EXT1 AS ACCT_STATUS FROM  {CM_PARTY} A,  {CM_PARTY_CONTACT} b,  {CM_GROUP_CUSTOMER} c,  {CMX_GROUP_CUSTOMER} d,  {CM_PARTY_ACCT_REL} e,  {CM_CUST_ACCT_REL} f WHERE a.party_id = b.`PARTY_ID`   AND a.`PARTY_ID` = c.`PARTY_ID`   AND c.`CUST_ID` = d.`CUST_ID`   AND a.`PARTY_ID` = e.`PARTY_ID`  AND e.`ACCT_ID` = f.`ACCT_ID` and f.PAY_METHOD =2 ");

			if (addressId > 0) {
				sql.append(" AND b.CONT_ADDRESS").append("=:addressId");
				parameter.put("addressId", addressId);
			}
			if (StringUtils.isNotBlank(companyName)) {
				sql.append(" AND a.PARTY_NAME like ").append(":companyName");
				parameter.put("companyName", "%" + companyName + "%");
			}
			if (custId > 0) {
				sql.append(" AND f.REL_CUST_ID").append("=:custId");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(kob)) {
				sql.append(" AND c.CUST_CERT_CODE").append("=:kob");
				if (StringUtils.isNumeric(kob) && kob.length() < 10) {
					kob = String.format("%010d", Long.parseLong(kob));
				}
				parameter.put("kob", kob);
			}
			if (StringUtils.isNotBlank(cvr)) {
				sql.append(" AND d.TAX_ID").append("=:cvr");
				parameter.put("cvr", cvr);
			}
			if (insflags != null && insflags.length > 0) {
				sql.append(" AND f.INSTALLMENT_FLAG in (");
				for (int i = 0; i < insflags.length; i++) {
					sql.append(insflags[i]);
					if (i != insflags.length - 1) {
						sql.append(",");
					}
				}
				sql.append(")");
			}
			sql.append(" ) UNION ALL (");
			sql.append("SELECT  t.`ACCT_NAME`,  t.`ACCT_ID`,  t.`CYCLE_TYPE`,  t.`BILL_DAY`,t.INSTALLMENT_FLAG, m.CUST_NAME AS PARTY_NAME ,m.CUST_CERT_CODE AS CERT_CODE,k.ADDRESS_ID AS CONT_ADDRESS,k.ADDRESS_DETAIL AS REMARKS ,q.TAX_ID,t.EXT3,t.EXT1 AS ACCT_STATUS FROM {CM_CUST_ACCT_REL} t,  {CM_GROUP_CUSTOMER} m,  {CM_CUST_CONTACT_MEDIUM} k, {CMX_GROUP_CUSTOMER} q WHERE t.rel_cust_id = m.cust_id    AND t.rel_cust_id = k.cust_id    AND t.pay_method = 1 and t.rel_cust_id=q.cust_id and k.CONT_MED_TYPE_ID=11 ");
			if (addressId > 0) {
				sql.append(" AND k.ADDRESS_ID").append("=:addressId");
				parameter.put("addressId", addressId);
			}
			if (StringUtils.isNotBlank(companyName)) {
				sql.append(" AND m.CUST_NAME like ").append(":companyName");
				parameter.put("companyName", "%" + companyName + "%");
			}
			if (custId > 0) {
				sql.append(" AND t.REL_CUST_ID").append("=:custId");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(kob)) {
				sql.append(" AND m.CUST_CERT_CODE").append("=:kob");
				if (StringUtils.isNumeric(kob) && kob.length() < 10) {
					kob = String.format("%010d", Long.parseLong(kob));
				}
				parameter.put("kob", kob);
			}
			if (StringUtils.isNotBlank(cvr)) {
				sql.append(" AND q.TAX_ID").append("=:cvr");
				parameter.put("cvr", cvr);
			}
			if (insflags != null && insflags.length > 0) {
				sql.append(" AND t.INSTALLMENT_FLAG in (");
				for (int i = 0; i < insflags.length; i++) {
					sql.append(insflags[i]);
					if (i != insflags.length - 1) {
						sql.append(",");
					}
				}
				sql.append(")");
			}
			sql.append(" )) result");
			if ((aStartNum >= 0) || (aEndNum >= 0)) {
				if ((aStartNum < 0) && (aEndNum >= 0)) {
					sql.append(" limit ").append("0").append(",").append(aEndNum);
				} else if ((aEndNum < 0) && (aStartNum >= 0)) {
					if (aStartNum > 0) {
						sql.append(" limit ").append(aStartNum - 1).append(",").append("18446744073709551615");
					} else {
						sql.append(" limit ").append(aStartNum).append(",").append("18446744073709551615");
					}

				} else if (aEndNum < aStartNum) {
					sql.append(" limit ").append("0").append(",").append("0");
				} else {
					int offset = aEndNum - aStartNum + 1;
					int tmpStart = 0;
					if (aStartNum > 0) {
						tmpStart = aStartNum - 1;
					} else {
						tmpStart = 0;
					}
					sql.append(" limit ").append(tmpStart).append(",").append(offset);
				}
			}
			DataContainer t[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			// 妯＄硦鍖�
			String custCertCode = "";
			if (t != null && t.length > 0) {
				for (int j = 0; j < t.length; j++) {
					custCertCode = t[j].getAsString("CERT_CODE");
					// 闆嗗洟妯＄硦鍖�
					if (custCertCode.startsWith("K")) {
						t[j].set("CERT_CODE", "");
					} else {
						if (StringUtils.isNumeric(custCertCode)) {
							t[j].set("CERT_CODE", DataType.getAsLong(custCertCode));
						} else {
							t[j].set("CERT_CODE", custCertCode);
						}
					}
				}

			}
			return t;
		} else {
			throw new Exception("[CustType= " + custType + "]Is Not Correct!");
		}
	}

	public static void main(String[] args) throws Exception {
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
		
		CmPartySVImpl a = new CmPartySVImpl();
		DataContainer[] b = a.queryCustomerAndAccountRelationship(21210112707530L, 32102115425755L);
		// int c = a.queryPayerByDtsCount(3, 23210510014651l, null, null, null, null, -1, null, null, null);
		System.out.println(b);
	}

	@Override
	public int queryPayerByDtsCount(int custType, long custId, String firstName, String lastName, String cpr, String birthDay, long addressId, String companyName, String kob,
			String cvr, String insflags[]) throws AIException, Exception {
		StringBuilder sql = new StringBuilder();
		Map parameter = new HashMap();

		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			sql.append("SELECT COUNT(*) AS COUNT FROM ( ");
			sql.append("(SELECT  e.`ACCT_NAME`,  e.`ACCT_ID`,  e.`CYCLE_TYPE`,  e.`BILL_DAY` FROM {CM_PARTY} A,  {CM_INDIV_PARTY} b,  {CM_PARTY_CONTACT} c,  {CM_PARTY_ACCT_REL} d,  {CM_CUST_ACCT_REL} e WHERE a.party_id = b.`PARTY_ID`   AND a.PARTY_ID=d.PARTY_ID  AND a.`PARTY_ID` = c.`PARTY_ID` AND d.`ACCT_ID` = e.`ACCT_ID` and e.PAY_METHOD = 2 ");

			if (StringUtils.isNotBlank(firstName)) {
				sql.append(" AND a.FIRST_NAME like ").append(":firstName");
				parameter.put("firstName", "%" + firstName + "%");
			}
			if (StringUtils.isNotBlank(lastName)) {
				sql.append(" AND a.LAST_NAME like ").append(":lastName");
				parameter.put("lastName", "%" + lastName + "%");
			}
			if (StringUtils.isNotBlank(cpr)) {
				sql.append(" AND a.CERT_CODE").append("=:cpr");
				parameter.put("cpr", cpr);
			}
			if (StringUtils.isNotBlank(birthDay)) {
				sql.append(" AND b.BIRTHDAY").append("=:birthDay");
				parameter.put("birthDay", birthDay);
			}
			if (addressId > 0) {
				sql.append(" AND c.CONT_ADDRESS").append("=:addressId");
				parameter.put("addressId", addressId);
			}
			if (custId > 0) {
				sql.append(" AND e.REL_CUST_ID").append("=:custId");
				parameter.put("custId", custId);
			}
			if (insflags != null && insflags.length > 0) {
				sql.append(" AND e.INSTALLMENT_FLAG in (");
				for (int i = 0; i < insflags.length; i++) {
					sql.append(insflags[i]);
					if (i != insflags.length - 1) {
						sql.append(",");
					}
				}
				sql.append(")");
			}
			sql.append(" ) UNION ALL (");
			sql.append(" SELECT  t.`ACCT_NAME`,  t.`ACCT_ID`,   t.`CYCLE_TYPE`,   t.`BILL_DAY`  FROM {CM_CUST_ACCT_REL} t,  {CM_INDIV_CUSTOMER} m,   {CM_CUST_CONTACT_MEDIUM} k    WHERE t.rel_cust_id = m.cust_id     AND t.rel_cust_id=k.cust_id    AND t.pay_method=1 and k.CONT_MED_TYPE_ID=11");
			if (StringUtils.isNotBlank(firstName)) {
				sql.append(" AND m.FIRST_NAME like ").append(":firstName");
				parameter.put("firstName", "%" + firstName + "%");
			}
			if (StringUtils.isNotBlank(lastName)) {
				sql.append(" AND m.LAST_NAME like ").append(":lastName");
				parameter.put("lastName", "%" + lastName + "%");
			}
			if (StringUtils.isNotBlank(cpr)) {
				sql.append(" AND m.CUST_CERT_CODE").append("=:cpr");
				parameter.put("cpr", cpr);
			}
			if (StringUtils.isNotBlank(birthDay)) {
				sql.append(" AND m.BIRTHDAY").append("=:birthDay");
				parameter.put("birthDay", birthDay);
			}
			if (addressId > 0) {
				sql.append(" AND k.ADDRESS_ID").append("=:addressId");
				parameter.put("addressId", addressId);
			}
			if (custId > 0) {
				sql.append(" AND t.REL_CUST_ID").append("=:custId");
				parameter.put("custId", custId);
			}
			if (insflags != null && insflags.length > 0) {
				sql.append(" AND t.INSTALLMENT_FLAG in (");
				for (int i = 0; i < insflags.length; i++) {
					sql.append(insflags[i]);
					if (i != insflags.length - 1) {
						sql.append(",");
					}
				}
				sql.append(")");
			}
			sql.append(" )) result");
			DataContainerInterface[] dc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			if (dc != null) {
				return dc[0].getAsInt("COUNT");
			} else {
				return 0;
			}
		} else if (custType == CmConstants.CustomerType.GROUP) {
			sql.append("SELECT COUNT(*) AS COUNT FROM ((SELECT   f.`ACCT_NAME`,  f.`ACCT_ID`,  f.`CYCLE_TYPE`,  f.`BILL_DAY` FROM  {CM_PARTY} A,  {CM_PARTY_CONTACT} b,  {CM_GROUP_CUSTOMER} c,  {CMX_GROUP_CUSTOMER} d,  {CM_PARTY_ACCT_REL} e,  {CM_CUST_ACCT_REL} f WHERE a.party_id = b.`PARTY_ID`   AND a.`PARTY_ID` = c.`PARTY_ID`   AND c.`CUST_ID` = d.`CUST_ID`   AND a.`PARTY_ID` = e.`PARTY_ID`  AND e.`ACCT_ID` = f.`ACCT_ID` and f.PAY_METHOD = 2  ");

			if (addressId > 0) {
				sql.append(" AND b.CONT_ADDRESS").append("=:addressId");
				parameter.put("addressId", addressId);
			}
			if (StringUtils.isNotBlank(companyName)) {
				sql.append(" AND a.PARTY_NAME like ").append(":companyName");
				parameter.put("companyName", "%" + companyName + "%");
			}
			if (custId > 0) {
				sql.append(" AND f.REL_CUST_ID").append("=:custId");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(kob)) {
				sql.append(" AND c.CUST_CERT_CODE").append("=:kob");
				if (StringUtils.isNumeric(kob) && kob.length() < 10) {
					kob = String.format("%010d", Long.parseLong(kob));
				}
				parameter.put("kob", kob);
			}
			if (StringUtils.isNotBlank(cvr)) {
				sql.append(" AND d.TAX_ID").append("=:cvr");
				parameter.put("cvr", cvr);
			}
			if (insflags != null && insflags.length > 0) {
				sql.append(" AND f.INSTALLMENT_FLAG in (");
				for (int i = 0; i < insflags.length; i++) {
					sql.append(insflags[i]);
					if (i != insflags.length - 1) {
						sql.append(",");
					}
				}
				sql.append(")");
			}
			sql.append(" ) UNION ALL (");
			sql.append("SELECT  t.`ACCT_NAME`,  t.`ACCT_ID`,  t.`CYCLE_TYPE`,  t.`BILL_DAY` FROM {CM_CUST_ACCT_REL} t,  {CM_GROUP_CUSTOMER} m,  {CM_CUST_CONTACT_MEDIUM} k, {CMX_GROUP_CUSTOMER} q WHERE t.rel_cust_id = m.cust_id    AND t.rel_cust_id = k.cust_id    AND t.pay_method = 1 and t.rel_cust_id=q.cust_id and k.CONT_MED_TYPE_ID=11 ");
			if (addressId > 0) {
				sql.append(" AND k.ADDRESS_ID").append("=:addressId");
				parameter.put("addressId", addressId);
			}
			if (StringUtils.isNotBlank(companyName)) {
				sql.append(" AND m.CUST_NAME like ").append(":companyName");
				parameter.put("companyName", "%" + companyName + "%");
			}
			if (custId > 0) {
				sql.append(" AND t.REL_CUST_ID").append("=:custId");
				parameter.put("custId", custId);
			}
			if (StringUtils.isNotBlank(kob)) {
				sql.append(" AND m.CUST_CERT_CODE").append("=:kob");
				if (StringUtils.isNumeric(kob) && kob.length() < 10) {
					kob = String.format("%010d", Long.parseLong(kob));
				}
				parameter.put("kob", kob);
			}
			if (StringUtils.isNotBlank(cvr)) {
				sql.append(" AND q.TAX_ID").append("=:cvr");
				parameter.put("cvr", cvr);
			}
			if (insflags != null && insflags.length > 0) {
				sql.append(" AND t.INSTALLMENT_FLAG in (");
				for (int i = 0; i < insflags.length; i++) {
					sql.append(insflags[i]);
					if (i != insflags.length - 1) {
						sql.append(",");
					}
				}
				sql.append(")");
			}
			sql.append(" )) result");
			DataContainerInterface[] dc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql.toString(), parameter);
			if (dc != null) {
				return dc[0].getAsInt("COUNT");
			} else {
				return 0;
			}
		} else {
			throw new Exception("[CustType= " + custType + "]Is Not Correct!");
		}
	}

	@Override
	public DataContainer[] queryPayerByDts(int custType, long custId, String firstName, String LastName, String cpr, String birthDay, long addressId, String companyName,
			String kob, String cvr, int start, int end) throws AIException, Exception {
		return queryPayerByDts(custType, custId, firstName, LastName, cpr, birthDay, addressId, companyName, kob, cvr, null, start, end);
	}

	@Override
	public int queryPayerByDtsCount(int custType, long custId, String firstName, String LastName, String cpr, String birthDay, long addressId, String companyName, String kob,
			String cvr) throws AIException, Exception {
		return queryPayerByDtsCount(custType, custId, firstName, LastName, cpr, birthDay, addressId, companyName, kob, cvr, null);
	}

	@Override
	public IQBOCmPayerInfoValue[] querySpecialPayerInfoByCertCode(long partyId, String certCode) throws Exception {
		// 根据partyId和角色类型查找partyRole
		ICmPartyRoleSV partyRoleService = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue[] partyRoleValue = partyRoleService.queryAllPartyRoles(partyId, 5, -1, -1);
		if (partyRoleValue != null && partyRoleValue.length > 0 && partyRoleValue[0].getEntityId() == partyRoleValue[0].getPartyId()) {
			// 存在payer角色
			IQBOCmPayerInfoValue payerInfoValue[] = null;
			StringBuilder condition = new StringBuilder();
			condition.append("1=1").append(" and ").append(IQBOCmPayerInfoValue.S_CertCode).append("=:certCode");
			Map parameter = new HashMap();
			parameter.put("certCode", certCode);
			// SQL优化
			String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), parameter, -1, -1);
			payerInfoValue = (IQBOCmPayerInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPayerInfoBean.class, sql, parameter);
			return payerInfoValue;
		} else {
			// 不存在payer角色
			return null;
		}
	}

	public long createPayer(String cprNo) throws Exception {
		Map parameters = new HashMap();
		parameters.put(IBOCmPartyValue.S_CertType, String.valueOf(CmConstants.CertificateType.CPR));
		parameters.put(IBOCmPartyValue.S_CertCode, cprNo);
		String xmlCondition = ParamUtil.buildQueryXml("com.ai.appframe2.bo.DataContainer", parameters);
		// 根据cpr查询payer信息，数据库有则直接返回，没有则调用cpr实时接口获取信息
		IQBOCmPartyValue payerInfo = queryAsPartyByCertCode(xmlCondition, -1, -1);

		// 创建payer
		long partyId = payerInfo.getPartyId();
		int certType = CmConstants.CertificateType.CPR;
		// 参与人联系信息
		IBOCmPartyContactValue contactVal = new BOCmPartyContactBean();
		contactVal.copy(payerInfo);
		// 个人类参与人信息表
		IBOCmIndivPartyValue indivPartyVal = new BOCmIndivPartyBean();
		indivPartyVal.copy(payerInfo);
		// 参与人信息表
		IBOCmPartyValue partyVal = new BOCmPartyBean();
		partyVal.copy(payerInfo);
		// 不存在与crm系统中,只可能是个人客户
		if (partyId <= 0) {
			IVOPartyValue vovalue = new VOPartyBean();
			// 保存参与人信息
			IPartyValue partyValue = new PartyBean();
			partyValue.copy(partyVal);
			if (StringUtils.isBlank(partyValue.getPartyName())) {
				partyValue.setPartyName(partyValue.getFirstName() + " " + partyValue.getLastName());
			}
			partyValue.setFirstNameQry(StringUtils.upperCase(partyVal.getFirstName()));
			partyValue.setLastNameQry(StringUtils.upperCase(partyVal.getLastName()));
			partyValue.setMiddleNameQry(StringUtils.upperCase(partyVal.getMiddleName()));
			partyValue.setPartyNameQry(StringUtils.upperCase(partyVal.getPartyName()));
			partyValue.setCertType(CmConstants.CertificateType.CPR);
			partyValue.setPartyType(CmConstants.PartyType.INDIVIDUAL);
			partyValue.setPartyId(CmCommonUtil.getNewSequence(BOCmPartyBean.class));
			partyValue.setCprId(Long.toString(CmCommonUtil.getNewSequence(BOCmClubBean.class)));
			partyValue.setStsToNew();
			partyValue.setBirthday(indivPartyVal.getBirthday());
			vovalue.setParty(partyValue);
			// 保存参与人角色信息
			IPartyRoleValue partyRoleValue = new PartyRoleBean();
			partyRoleValue.setState(CmConstants.RecordState.USE);
			partyRoleValue.setRoleType(CmConstants.PartyRoleType.PAYER);
			partyRoleValue.setEntityId(partyValue.getPartyId());
			partyRoleValue.setPartyId(partyValue.getPartyId());
			partyRoleValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			partyRoleValue.setRoleStatus(CmConstants.roleStatus.ACTIVE);
			vovalue.setPartyRole(partyRoleValue);
			// 保存参与人联系信息
			IPartyContactValue contactValue = new PartyContactBean();
			contactValue.copy(contactVal);
			contactValue.setPartyId(partyValue.getPartyId());
			contactValue.setFirstNameQry(partyVal.getFirstNameQry());
			contactValue.setLastNameQry(partyVal.getLastNameQry());
			contactValue.setMiddleNameQry(partyVal.getMiddleNameQry());
			contactValue.setContName(partyVal.getPartyName());
			contactValue.setContNameQry(partyVal.getPartyNameQry());
			vovalue.setPartyContact(contactValue);
			vovalue.setBusinessId(CmConstants.BusiLogId.PAYER);
			ICmPartySV service = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			service.saveParty(vovalue);
			partyId = vovalue.getPartyId();
		} else {// 存在与crm系统中
			// 查询party，如果cprId为空则插入partyId
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IPartyValue partyValue = partySV.queryPartyById(partyId);
			// 修改firsrtName和lastName
			partyValue.setFirstName(payerInfo.getFirstName());
			partyValue.setLastName(payerInfo.getLastName());
			// 修改生日
			partyValue.setBirthday(indivPartyVal.getBirthday());
			if (StringUtils.isBlank(partyValue.getCprId())) {
				partyValue.setCprId(Long.toString(CmCommonUtil.getNewSequence(BOCmClubBean.class)));
			}
			IVOPartyValue voPartyValue = new VOPartyBean();
			voPartyValue.setParty(partyValue);
			IPartyRoleValue partyRoleValue = getPartyRoleValue(partyId);
			// 若不存在payer角色则插入cm_party_role表创建角色payer
			if (partyRoleValue != null) {
				voPartyValue.setPartyRole(partyRoleValue);
			}
			// 保存参与人联系信息
			contactVal.setPartyId(partyId);
			IPartyContactValue partyContactValue = getPartyContactValue(contactVal);
			voPartyValue.setPartyContact(partyContactValue);
			ICmPartySV service = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			voPartyValue.setBusinessId(CmConstants.BusiLogId.PAYER);
			service.saveParty(voPartyValue);
		}
		return partyId;
	}

	/**
        *   查询partyList
	* @param xmlCondition
	* @return
	* @throws Exception
	*/
	public IQBOCmPartyValue[] queryPartyByCondition(String xmlCondition, int startNum,int endNum) throws Exception{
		return (IQBOCmPartyValue[])queryPartyByConditionForBase(xmlCondition,3,startNum,endNum);
	}
	
	/**
     *   查询partyList
	* @param xmlCondition
	* @return
	* @throws Exception
	*/
	public int queryPartyByConditionCount(String xmlCondition) throws Exception{
		return (int) queryPartyByConditionForBase(xmlCondition,1,-1,-1);
	}
	
	/**
	     * 查询partyList的公用查询方法
	* @param xmlCondition
	* @return
	* @throws Exception
	*/
	public Object queryPartyByConditionForBase(String xmlCondition,int queryFlag,int startNum,int endNum) throws Exception {
		IQBOCmPartyValue[] qBoValue = new IQBOCmPartyValue[0];
		saveQueryLog(xmlCondition);
		Object objResult = null;
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		long partyId = dcs[0].getAsLong("PARTY_ID");
		long partyTypeCon = dcs[0].getAsLong("PARTY_TYPE");
		String partyType = "1";
		if(17==partyTypeCon) {
			partyType = "3";
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		//分B2B和B2C查询
		if(17==partyTypeCon) {
			//使用certType和certCode查询party 
			int certType = dcs[0].getAsInt(IBOCmPartyValue.S_CertType);
			String certCode = dcs[0].getAsString(IBOCmPartyValue.S_CertCode);
			long custId = dcs[0].getAsLong("CUST_ID");
			String action = dcs[0].getAsString("ACTION");
			if(null!=action&&action.equals("ADD")) {
				if(StringUtils.isNotBlank(certCode)) {
					//certCode如果不足10位，需要前面补0
					if(certCode.length()<10) {
						certCode = addZeroForNum(certCode,10);
					}
					if(1==queryFlag) {
						return queryPartysByCondition(null,null,null,-1,certType,certCode,null,-1,partyType,queryFlag,-1,-1);
					}else if(3==queryFlag){
						objResult = queryPartysByCondition(null,null,null,-1,certType,certCode,null,-1,partyType,queryFlag,startNum, endNum);
					}
				}else {
					//根据CustId查询partyId，用partyId查询相应信息
					ICustomerValue CustValue = customerSV.queryCustomerByCustId(custId);
					if (CustValue == null) {
						throw new Exception("CustId:" + custId + " does not exist!");
					}
					if(1==queryFlag) {
						return queryPartysByCondition(null,null,null,-1,-1,null,null,CustValue.getPartyId(),partyType,queryFlag,-1,-1);
					}else if(3==queryFlag){
						objResult = queryPartysByCondition(null,null,null,-1,-1,null,null,CustValue.getPartyId(),partyType,queryFlag,startNum, endNum);
					}
				}
			}else {
				if(partyId>0) {
					if(1==queryFlag) {
						return queryPartysByCondition(null,null,null,-1,-1,null,null,partyId,partyType,queryFlag,-1,-1);
					}else if(3==queryFlag){
						objResult = queryPartysByCondition(null,null,null,-1,-1,null,null,partyId,partyType,queryFlag,startNum, endNum);
					}
				}else {
					//certCode如果不足10位，需要前面补0
					if(certCode.length()<10) {
						certCode = addZeroForNum(certCode,10);
					}
					if(1==queryFlag) {
						return queryPartysByCondition(null,null,null,-1,certType,certCode,null,-1,partyType,queryFlag,-1,-1);
					}else if(3==queryFlag){
						objResult = queryPartysByCondition(null,null,null,-1,certType,certCode,null,-1,partyType,queryFlag,startNum, endNum);
					}
				}
			}
		}else {
			long searchType = dcs[0].getAsLong("SEARCH_TYPE");
			
			if(1 == searchType){
				//使用certType和certCode查询party 
				int certType = dcs[0].getAsInt(IBOCmPartyValue.S_CertType);
				String certCode = dcs[0].getAsString(IBOCmPartyValue.S_CertCode);
				if(1==queryFlag) {
					return queryPartysByCondition(null,null,null,-1,certType,certCode,null,-1,null,queryFlag,-1,-1);
				}else if(3==queryFlag){
					objResult = queryPartysByCondition(null,null,null,-1,certType,certCode,null,-1,null,queryFlag,startNum, endNum);
				}
				
			}else if( 2  == searchType){
				//使用名称生日地址查询party 
				String firstName = dcs[0].getAsString(IQBOCmPayerInfoValue.S_FirstName);
				String lastName = dcs[0].getAsString(IQBOCmPayerInfoValue.S_LastName);
				String birth = dcs[0].getAsString(IQBOCmPayerInfoValue.S_Birthday);
				long addressId = dcs[0].getAsLong(IQBOCmPayerInfoValue.S_ContAddress);
				String addressDetail = dcs[0].getAsString("REMARKS");
				if(1==queryFlag) {
					return queryPartysByCondition(firstName,lastName, birth, addressId,-1,null,null,-1,partyType, queryFlag, -1, -1);
				}else if(3==queryFlag){
					IQBOCmPartyValue[] pValues = (IQBOCmPartyValue[]) queryPartysByCondition(firstName,lastName, birth, addressId,-1,null,null,-1,partyType,queryFlag,startNum,endNum);
					objResult = pValues;
				}
			}else if(3 == searchType){
				//使用custid||partyId||partyName 查询party
				String partyIDOfSearch = dcs[0].getAsString("Party_ID");
				String partyNameOfSearch = dcs[0].getAsString("Party_Name_OfSearch");
				String customerIDOfSearch = dcs[0].getAsString("Customer_ID_OfSearch");
				if(1==queryFlag) {
					if(StringUtils.isNotBlank(partyIDOfSearch)) {
						return queryPartysByCondition(null,null, null, -1,-1,null,null,Long.valueOf(partyIDOfSearch),partyType, queryFlag, -1, -1);
					}else if(StringUtils.isNotBlank(partyNameOfSearch)) {
						return queryPartysByCondition(null,null, null, -1,-1,null,partyNameOfSearch,-1, partyType,queryFlag, -1, -1);
					}else if(StringUtils.isNotBlank(customerIDOfSearch)) {
						return queryPartyByCustId(Long.valueOf(customerIDOfSearch), partyType,queryFlag, -1, -1);
					}
				}else if(3==queryFlag){
					if(StringUtils.isNotBlank(partyIDOfSearch)) {
						objResult = queryPartysByCondition(null,null, null, -1,-1,null,null,Long.valueOf(partyIDOfSearch),partyType, queryFlag, startNum, endNum);
					}else if(StringUtils.isNotBlank(partyNameOfSearch)) {
						objResult = queryPartysByCondition(null,null, null, -1,-1,null,partyNameOfSearch,-1,partyType, queryFlag, startNum, endNum);
					}else if(StringUtils.isNotBlank(customerIDOfSearch)) {
						objResult = queryPartyByCustId(Long.valueOf(customerIDOfSearch),partyType, queryFlag, startNum, endNum);
					}
				}
			}
		}
		if(null== objResult) {
			return qBoValue;
		}
		return objResult;
	}
	
	public void saveQueryLog(String xmlCondition) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		// 保存查询记录
		ICmCommonSV cmCommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map queryParam = new HashMap();
		queryParam.put("xmlCondition", dcs[0]);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		cmCommonSV.saveBusiLog(CmConstants.BusiLogId.PAYER, CmConstants.BusiLogType.PARTY_LOG, -1, CmConstants.BusiLogOperType.QUERY, "", queryParam, methodDetail);

	}
	
	public IQBOCmPartyValue queryAsPartyByCertCodeAndLog(String xmlCondition, int $startrowindex, int $endrowindex) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		String action = dcs[0].getAsString("ACTION");
		long custId = dcs[0].getAsLong("CUST_ID");
		// 保存查询记录
		ICmCommonSV cmCommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV cmGroupCustomerSV = (com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV) ServiceFactory.getService(com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV.class);
		ICmIndivCustomerSV cmIndivCustomerSV = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		Map queryParam = new HashMap();
		queryParam.put("xmlCondition", dcs[0]);
		String methodDetail = Thread.currentThread().getStackTrace()[1].getClassName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName();
		cmCommonSV.saveBusiLog(CmConstants.BusiLogId.PAYER, CmConstants.BusiLogType.PARTY_LOG, -1, CmConstants.BusiLogOperType.QUERY, "", queryParam, methodDetail);

		if ("ADD".equals(action) && custId > 0) {
			// 建payer自动查询使用
			return queryPayerbyCustId(custId);
		}
		if ("QUERY".equals(action)) {
			// 提供给party视图使用
			long partyId = dcs[0].getAsLong("PARTY_ID");
			return queryPayerByPartyId(partyId);
		}
				
		int certType = dcs[0].getAsInt(IBOCmPartyValue.S_CertType);
		String certCode = dcs[0].getAsString(IBOCmPartyValue.S_CertCode);
		Long partyId = dcs[0].getAsLong(IBOCmPartyValue.S_PartyId);
		Long partyType = dcs[0].getAsLong(IBOCmPartyValue.S_PartyType);
		
		if("TableSelectedQuery".equals(action)) {
			IQBOCmPartyValue[] partyVal = null;
			if(partyId>0) {
				partyVal = (IQBOCmPartyValue[])queryPartysByCondition(null,null,null,-1,-1,null,null,partyId,null,3,-1, -1);
			}else {
				partyVal = (IQBOCmPartyValue[])queryPartysByCondition(null,null,null,-1,-1,certCode,null,-1,null,3,-1, -1);
			}
		
			if(null!=partyVal&&partyVal.length>0) {
				String strRemarks = partyVal[0].getRemarks();
				String strContAddress = partyVal[0].getContAddress();
				
				if(StringUtils.isBlank(strRemarks)||StringUtils.isBlank(strContAddress)) {
					//根据partyId，查询custId
					long loCustId = 0; 
					IBOCmIndivCustomerValue[] indivCustomers = cmIndivCustomerSV.queryCmIndivCustByPartyId(String.valueOf(partyId));
					if(null!=indivCustomers&&indivCustomers.length>0) {
						loCustId =  indivCustomers[0].getCustId();
					}else {
						IBOCmGroupCustomerValue[] groupCustomers = cmGroupCustomerSV.queryCmGroupCustByPartyId(String.valueOf(partyId));
						if(null!=groupCustomers&&groupCustomers.length>0) {
							loCustId =  groupCustomers[0].getCustId();
						}
					}
					if(loCustId>0) {
						// 查询地址
						IQBOCmCustContMediumAndTypeValue[] mediaValue = cmCustomerSV.queryCustContactMediums(loCustId, 11, 1, -1, -1);
						if (mediaValue != null && mediaValue.length > 0) {
							partyVal[0].setContAddress(mediaValue[0].getAddressId() + "");
							partyVal[0].setRemarks(mediaValue[0].getAddressDetail());
						}
					}
				}
				return partyVal[0];
			}
		}
		if (!StringUtils.isNotBlank(certCode) && certType == 8) {

			// 是个人客户同时没有证件号码使用名称生日地址创建payer
			String firstName = dcs[0].getAsString(IQBOCmPayerInfoValue.S_FirstName);
			String lastName = dcs[0].getAsString(IQBOCmPayerInfoValue.S_LastName);
			String birth = dcs[0].getAsString(IQBOCmPayerInfoValue.S_Birthday);
			
			long addressId = dcs[0].getAsLong(IQBOCmPayerInfoValue.S_ContAddress);
			String addressDetail = dcs[0].getAsString("REMARKS");
			IQBOCmPartyValue pValue = queryPayerByNBA(firstName + " " + lastName, birth, addressId);
			if (pValue != null) {
				return pValue;
			} else {
				pValue = new QBOCmPartyBean();
				pValue.setFirstName(firstName);
				pValue.setLastName(lastName);
				pValue.setPartyId(partyId);
				pValue.setPartyName(firstName + " " + lastName);
				pValue.setContAddress(String.valueOf(addressId));
				pValue.setRemarks(addressDetail);
				pValue.setCertType(8);
				pValue.setBirthday(Timestamp.valueOf(birth + " 00:00:00"));
			}
			return pValue;
		}
		if (StringUtils.isNotBlank(certCode) && !certCode.startsWith("K") && certType == 17) {
			int length = certCode.length();
			if ((10 - length) > 0) {
				for (int i = 0; i < 10 - length; i++) {
					certCode = "0" + certCode;
				}
			}

		}
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map parameter = new HashMap();
		parameter.put("certType", certType);
		parameter.put("certCode", certCode);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.PAYER, "", parameter, CmConstants.BusiLogType.PARTY_LOG);
		// 返回值
		IQBOCmPartyValue qpartyVal = new QBOCmPartyBean();
		// 查询是否已经存在party表中
		IQBOCmPartyValue[] partyVal = (IQBOCmPartyValue[]) queryPartysByCondition(null,null,null,-1,certType,certCode,null,-1,null,3,-1, -1);
		if (CmCommonUtil.isNotEmptyObject(partyVal)) {
			long partyIdExsit = partyVal[0].getPartyId();
			qpartyVal.copy(partyVal[0]);
			if (certType == 8) {
				// 查询个人类payer
				queryIndivPayer4AddPayer(partyIdExsit, certCode, qpartyVal);
			} else {
				// 查询集团类payer
				queryGroupPayer(partyIdExsit, certCode, qpartyVal);
			}
		} else {
			// 不存在调接口查询
			if (certType == 8) {
				qpartyVal = checkIsHasParty(certCode);
			} else {// kob接口不可能走这里,抛出异常
				throw new Exception("Can Not Find Any Information By KOB Number,Please Make Sure The ID Number Is Correct!");
			}
		}
		return qpartyVal;
	}
	
	/**
	 * 根据CprNumber 查询是否客户存在
	 * @param certCode
	 * @return
	 * @throws Exception 
	 */
	public IQBOCmPartyValue checkIsHasParty(String certCode) throws Exception  {
		// 返回值
	    IQBOCmPartyValue qpartyVal = new QBOCmPartyBean();
		// cpr接口
		ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		Map params = new HashMap();
		params.put("PNR", certCode);
		// 送CPR进行校验
		Map cprData = indivService.validateCPR(params);
		String FEJLNR = (String) cprData.get("FEJLNR");
		if (!FEJLNR.equals("00")) {
			// CPR在CPR系统中不存在。
			throw new Exception("Can Not Find Any Information By CPR Number");
		}
		Map data1 = (Map) cprData.get("DATA");
		Map data2 = (Map) data1.get("INFO");
		Map currentData = (Map) data2.get("Current_data");
		// 是否受保护
		String isProtected = (String) currentData.get("NVNADRBESKHAENSTART");
		String var = "[0]*";
		if (!isProtected.matches(var)) {
			// 受保护
			qpartyVal.setCertCode(certCode);
			qpartyVal.setCertType(8);
			qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
			qpartyVal.setExt2(String.valueOf(CmConstants.YesOrNo.YES));
			String source = String.valueOf(currentData.get("FOEDDTO"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			qpartyVal.setBirthday(TimeUtil.getTruncDate(sdf.parse(source)));
			return qpartyVal;
		}
		String personStatus = (String) currentData.get("STATUS");
		if ("80".equals(personStatus)) {
			// 客户移民
			qpartyVal.setCertCode(certCode);
			qpartyVal.setCertType(8);
			qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
			qpartyVal.setExt2(String.valueOf(2));
			String source = String.valueOf(currentData.get("FOEDDTO"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			qpartyVal.setBirthday(TimeUtil.getTruncDate(sdf.parse(source)));
			return qpartyVal;
		}
		if ("70".equals(personStatus)) {
			// 客户消失
			qpartyVal.setCertCode(certCode);
			qpartyVal.setCertType(8);
			qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
			qpartyVal.setExt2(String.valueOf(3));
			String source = String.valueOf(currentData.get("FOEDDTO"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			qpartyVal.setBirthday(TimeUtil.getTruncDate(sdf.parse(source)));
			return qpartyVal;
		} else {
			qpartyVal.setExt2(String.valueOf(CmConstants.YesOrNo.NO));
			qpartyVal.setExt1(String.valueOf(CmConstants.YesOrNo.NO));
			// 将CPR返回的信息包装成party返回
			String firstName = CmCommonUtil.capitalizeFirstLetter((String) currentData.get("FORNVN"));
			String lastName = CmCommonUtil.capitalizeFirstLetter((String) currentData.get("EFTERNVN"));
			String birthDay = (String) currentData.get("FOEDDTO");
			// 从CPR返回的地址
			String houseNum = ((String) currentData.get("HUSNR")).trim();
			String floor = (String) currentData.get("ETAGE");
			String sideOrApartNum = (String) currentData.get("SIDEDOER");
			String buildNum = (String) currentData.get("BNR");
			String streetName = (String) currentData.get("VEJADRNVN");
			String city = (String) currentData.get("POSTDISTTXT");
			String smallCity = (String) currentData.get("BYNVN");
			String postCode = (String) currentData.get("POSTNR");
			String munici = (String) currentData.get("KOMKOD");
			String coName = (String) currentData.get("CONVN");
			address address = new address();
			address.setAddressType(CmConstants.Address.ADDRESSTYPE);
			address.setDistrictId(CmConstants.Address.DISTRICTID);
			if (StringUtils.isNotBlank(houseNum)) {
				if (Character.isLetter(houseNum.charAt(houseNum.length() - 1))) {
					address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.substring(0, houseNum.length() - 1).trim())));
					address.setHouseLetter(String.valueOf(houseNum.charAt(houseNum.length() - 1)));
				} else {
					address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.trim())));
					address.setHouseLetter("");
				}
			}
			if (StringUtils.isNotBlank(floor)) {
				address.setFloor(floor.trim());
			} else {
				address.setFloor("");
			}

			if (StringUtils.isNotBlank(streetName)) {
				address.setStreetName(streetName.trim());
			} else {
				address.setStreetName("");
			}
			if (StringUtils.isNotBlank(city)) {
				address.setCity(city.trim());
			} else {
				address.setCity("");
			}
			if (StringUtils.isNotBlank(smallCity)) {
				address.setCounty(smallCity.trim());
			} else {
				address.setCounty("");
			}
			// 根据特殊规则判断sidedoer的走向
			if (StringUtils.isNotBlank(sideOrApartNum)) {
				if (CmCommonUtil.validateSidedoer(sideOrApartNum)) {
					address.setApartment(sideOrApartNum.trim());
					address.setDoorNumber("");
				} else {
					address.setDoorNumber(sideOrApartNum.trim());
					address.setApartment("");
				}
			} else {
				address.setApartment("");
				address.setDoorNumber("");
			}
			if (StringUtils.isNotBlank(postCode)) {
				address.setZipcode(postCode);
			} else {
				address.setZipcode("");
			}
			if (StringUtils.isNotBlank(munici)) {
				address.setMunicipality(munici);
			} else {
				address.setMunicipality("");
			}
			address.setAddrDesc("");
			address.setMainDoor("");

			// 地址层级中增加CO_NAME
			if (StringUtils.isNotBlank(coName)) {
				address.setCoName(coName);
			} else {
				address.setCoName("");
			}

			IAddressSV addService = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			long addressId = addService.saveAddress(address);
			//long addressId = 1000010000;
			qpartyVal.setContAddress((addressId + "").trim());
			qpartyVal.setFirstName(firstName);
			DateFormat format = new SimpleDateFormat("yyyyMMdd");
			format.setLenient(false);
			Timestamp ts = new Timestamp(format.parse(birthDay).getTime());
			qpartyVal.setBirthday(ts);
			
			address realAddress = addService.getAddress(addressId, ""); 
			if (null !=	realAddress) { qpartyVal.setRemarks(realAddress.getAddrDesc()); }
			
			qpartyVal.setLastName(lastName);
			qpartyVal.setCertCode(certCode);
			qpartyVal.setCertType(8);
			qpartyVal.setPartyName(firstName.trim() + " " + lastName.trim());
			// 通过名称生日地址校验客户是否已经存在
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmIndivCustomerValue[] custValue = customerSV.queryCmCustByCustInfoAndAddress(qpartyVal.getPartyName(), birthDay, addressId);
			if (custValue != null && custValue.length > 0) {
				// 设置partyId客户不会被新建
				qpartyVal.setPartyId(custValue[0].getPartyId());
				// 查询联系电话,email
				IQBOCmCustContMediumAndTypeValue[] contValues = customerSV.queryCustElectronicMedium(custValue[0].getCustId(), -1, -1);
				if (CmCommonUtil.isNotEmptyObject(contValues)) {
					for (IQBOCmCustContMediumAndTypeValue value : contValues) {
						if (value.getContMedTypeId() == CmConstants.AddressId.CONTACT_NUMBER) {
							qpartyVal.setContMobile(value.getContNumber());
						} else if (value.getContMedTypeId() == CmConstants.AddressId.EMAIL) {
							qpartyVal.setContEmail(value.getEmailAddress());
						}

					}
				}
				// 查询扩展个人信息
				IBOCmxIndivCustomerValue indivcustValueEx = customerSV.queryCmxIndivCustomerValue(custValue[0].getCustId());
				if (indivcustValueEx != null) {
					qpartyVal.setManualCommercialProtection(indivcustValueEx.getManualCommercialProtection());
					qpartyVal.setManualProtectEffectiveDate(indivcustValueEx.getManualProtectEffectiveDate());
					qpartyVal.setManualProtectExpireDate(indivcustValueEx.getManualProtectExpireDate());
					qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectExpireDate());
					qpartyVal.setProtectExpireDate(indivcustValueEx.getProtectEffDate());
					qpartyVal.setDirectMarketingProtection(indivcustValueEx.getDirectMarketingProtection());
				}
			}
			return qpartyVal;
		}
	
	}
	

	public IBOCMPartyAcctRelValue[] queryPartyAcctRel(long partyId, long[] acctIds) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1").append(" AND ").append(IBOCMPartyAcctRelValue.S_PartyId).append("=:partyId");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		if (acctIds != null && acctIds.length > 0) {
			condition.append(" AND ").append(IBOCMPartyAcctRelValue.S_AcctId).append(" IN (");
			for (int i = 0, len = acctIds.length; i < len; i++) {
				condition.append(":acctId" + i);
				parameter.put("acctId" + i, acctIds[i]);
				if (i != len - 1) {
					condition.append(",");
				}
			}
			condition.append(")");
		}
		IBOCMPartyAcctRelValue[] value = (IBOCMPartyAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCMPartyAcctRelBean.class, condition.toString(), parameter,
				-1, -1);
		return value;
	}

	public DataContainer[] queryAcctInfoByPartyId(long custId, long partyId,long acctId) throws Exception {
 	 	 List<DataContainerInterface> acctInfoList = new ArrayList<DataContainerInterface>();
		 DataContainer dc = new DataContainer();
		 dc.set( "TENANT_ID", TenantIDFactory.getTenantId()); 
		 String tablenameCmPartyAcctRel = SplitTableFactory.createTableName(BOCMPartyAcctRelBean.getObjectTypeStatic().getMapingEnty(), dc);
		 String tablenameCmCustAcctRel = SplitTableFactory.createTableName(BOCmCustAcctRelBean.getObjectTypeStatic().getMapingEnty(), dc);
		 Map parameter = new HashMap();
		 StringBuffer sqlString = new StringBuffer();
		 sqlString.append(" select  t.`ACCT_ID`,t.`REL_CUST_ID`,t.`ACCT_NAME`,t1.`PARTY_ID`  from ");    
		 sqlString.append(tablenameCmCustAcctRel).append("  t , ").append(tablenameCmPartyAcctRel).append(" t1 ");
		 sqlString.append(" where   t.`STATE`='U' and t1.`STATE`='U' ");
		 sqlString.append(" AND t.`ACCT_ID`=t1.`ACCT_ID`  ");
		 if(custId>0) {
			 sqlString.append(" AND t.`REL_CUST_ID`").append("!=:relcustid");
			 parameter.put("relcustid", custId);
		 }
		 if(partyId>0) {
			 sqlString.append(" AND t1.`PARTY_ID` ").append("=:partyId");
			 parameter.put("partyId", partyId);
		 }
		 
		 if(acctId>0) {
			 sqlString.append(" AND t.`ACCT_ID` ").append("=:acctId");
			 parameter.put("acctId", acctId);
		 }
		 		 
		 DataContainer acctInforDataContainer[] = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sqlString.toString(), parameter);
	 
  		return acctInforDataContainer;
	}
	
	/**
        * 查询客户与账户的关系(只管有效的)
	* @param customerId
	* @param accountId
	*  @author yujing
	* @return
	*/
	public DataContainer[] queryCustomerAndAccountRelationship(long customerId,long accountId) throws Exception {
		DataContainer resultDC = new DataContainer();
		
		//找客户id自己的partyId
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue customerValue = customerSV.queryCustomerByCustId(customerId);
		if (customerValue == null) {
			throw new Exception("customerId:" + customerId + " does not exist!");
		}
		long partyId = customerValue.getPartyId();
		//找客户账户的owner记录和客户payer记录
		DataContainer[] resultDCTemp = queryAcctInfoByPartyId(-1,-1,accountId);
		List<DataContainer> dataConList = new ArrayList<DataContainer>();
		if(null!=resultDCTemp&&resultDCTemp.length>0) {
			long partyIdDataC = resultDCTemp[0].getAsLong("PARTY_ID");
			long acctIdDataC = resultDCTemp[0].getAsLong("ACCT_ID");
			long custIdDataC = resultDCTemp[0].getAsLong("REL_CUST_ID");
			if(partyId==partyIdDataC) {
				//判断是否是payer关系
				DataContainer dataConTemp = new DataContainer();
				dataConTemp.set("CustomerId", customerId);
				dataConTemp.set("AccountId", acctIdDataC);
				dataConTemp.set("RelationType", "3");
				dataConTemp.set("PartyId", partyIdDataC);
				dataConList.add(dataConTemp);
			}
			if(customerId==custIdDataC) {
				DataContainer dataConTemp = new DataContainer();
				dataConTemp.set("CustomerId", customerId);
				dataConTemp.set("AccountId", acctIdDataC);
				dataConTemp.set("RelationType", "2");
				dataConTemp.set("PartyId", partyIdDataC);
				dataConList.add(dataConTemp);
			}
		}
		if(null!=dataConList&&dataConList.size()>0) {
			return dataConList.toArray(new DataContainer[0]);
		}
		return null;
	}
	 
	//kob补0方法
	public static String addZeroForNum(String str,int strLength) {  
		  int strLen =str.length();  
		  if (strLen <strLength) {  
		   while (strLen< strLength) {  
		    StringBuffer sb = new StringBuffer();  
		    sb.append("0").append(str);//左补0    
		    str= sb.toString();  
		    strLen= str.length();  
		   }  
		  }
		  return str;  
    }  
	
	
	public void saveCmIndivParty(BOCmIndivPartyBean bean) throws Exception {
		if (null != bean) {
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}
	}
	
	public IBOCmIndivPartyValue[] queryCmIndivPartyByPartyId(long partyId) throws Exception {
		StringBuilder sqlCondition = new StringBuilder();
		sqlCondition.append("1=1").append(" and ").append(IBOCmIndivPartyValue.S_PartyId).append("=:partyId");
		sqlCondition.append(" and ").append(IBOCmIndivPartyValue.S_State).append("=:state");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		parameter.put("state", CmConstants.RecordState.USE);
		
		String sql = CmCommonUtil.getDynamicSqlByConds(BOCmIndivPartyBean.class, sqlCondition.toString(), parameter, -1, -1);
		IBOCmIndivPartyValue[] values = (IBOCmIndivPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				BOCmIndivPartyBean.class, sql, parameter);
		return values;
	}

	
	/**
	 * @param operationType  1:新增  2：删除(逻辑删除) 3:修改
	 */
	public void dealCmIndivPartyForContact(long partyId,int operationType,String regionId,IBOCmIndivPartyValue cmIndivPartyValue) throws Exception {
		IBOCmIndivPartyValue[] cmIndivPartyValues = (IBOCmIndivPartyValue[]) queryCmIndivPartyByPartyId(partyId);
		if(1==operationType) {//新增操作，如果查询无记录时，就执行新增操作
			if(null==cmIndivPartyValues||cmIndivPartyValues.length<=0) {
				BOCmIndivPartyBean cmIndivPartyBean = new BOCmIndivPartyBean();
				cmIndivPartyBean.setPartyId(partyId);
				cmIndivPartyBean.setState(CmConstants.RecordState.USE);
				cmIndivPartyBean.setCreateDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				cmIndivPartyBean.setDoneDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				cmIndivPartyBean.setEffectiveDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				cmIndivPartyBean.setRegionId(regionId);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(cmIndivPartyBean);
			}
		}else if(3==operationType) {
			if(null!=cmIndivPartyValues&&cmIndivPartyValues.length>0&&null!=cmIndivPartyValue) {
				BOCmIndivPartyBean cmIndivPartyBean = new BOCmIndivPartyBean();
				cmIndivPartyBean.copy(cmIndivPartyValues[0]);
				cmIndivPartyBean.setExpireDate(cmIndivPartyValue.getExpireDate());
				cmIndivPartyBean.setEffectiveDate(cmIndivPartyValue.getEffectiveDate());
				cmIndivPartyBean.setDoneDate(com.ai.omframe.util.TimeUtil.getDefaultSysDate());
				CmInnerServiceFactory.getCommonInnerSV().saveBean(cmIndivPartyBean);
			}
		}
	}

	/**
	 * 最后一个role_type=4的角色失效后。需要失效party相关资料 cm_party，cm_party_contact, cm_party_role，cm_indiv_party
	 * @param partyId
	 * @throws Exception 
	 */
	public void expirePartyInfo(long partyId) throws Exception {
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		
		//cm_party 失效
		IPartyValue oldPartyValue = partySV.queryPartyById(partyId);
		BOCmPartyBean cmPartyBean = new BOCmPartyBean();
		cmPartyBean.copy(oldPartyValue);
		cmPartyBean.delete();
		CmInnerServiceFactory.getCommonInnerSV().saveBean(cmPartyBean);
		
		//cm_party_contact 失效 
		PartyContactBean conditionDC = new PartyContactBean();
		conditionDC.setPartyId(partyId);
		IPartyContactValue[] partyContactValues = partySV.queryPartyContacts(conditionDC, -1, -1);
		if(null!=partyContactValues&&partyContactValues.length>0) {
			BOCmPartyContactBean boCmPartyContactBean = new  BOCmPartyContactBean();
			boCmPartyContactBean.copy(partyContactValues[0]);
			boCmPartyContactBean.delete();
			CmInnerServiceFactory.getCommonInnerSV().saveBean(boCmPartyContactBean);
		}
		
		//cm_party_role 失效  无需执行，前面已查是否含有其他角色
		
		//cm_indiv_party失效
		StringBuilder sql = new StringBuilder();
		sql.append("1=1").append(" and ").append(IBOCmIndivPartyValue.S_PartyId).append("=:partyId");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		IBOCmIndivPartyValue[] result = (IBOCmIndivPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmIndivPartyBean.class, sql.toString(), parameter, -1, -1);
		if (null != result && result.length> 0) {
			result[0].delete();
			CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmIndivPartyBean) result[0]);
		}
		
		//cm_party_acct_rel失效
		IBOCMPartyAcctRelValue[] cmPartyAcctRelValue = (IBOCMPartyAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCMPartyAcctRelBean.class, sql.toString(), parameter, -1, -1);
		if (null != cmPartyAcctRelValue && cmPartyAcctRelValue.length> 0) {
			cmPartyAcctRelValue[0].delete();
			CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCMPartyAcctRelBean) cmPartyAcctRelValue[0]);
		}
	}
	
	@Override
	public long modifyPartyInformation(Long partyId, String firstName, String lastName, String birthday, Long addressId, String addressDetail, int gender, String certCode) throws Exception {
		Map parameters = new HashMap();
		parameters.put(IBOCmPartyValue.S_PartyId, String.valueOf(partyId));
		parameters.put("ACTION", "QUERY");
		String xmlCondition = ParamUtil.buildQueryXml("com.ai.appframe2.bo.DataContainer", parameters);
		// 根据cpr查询payer信息，数据库有则直接返回，没有则调用cpr实时接口获取信息
		IQBOCmPartyValue payerInfo = queryAsPartyByCertCode(xmlCondition, -1, -1);
		if(CmCommonUtil.isNotEmptyObject(payerInfo)) {
			// 参与人联系信息
			IBOCmPartyContactValue contactVal = new BOCmPartyContactBean();
			contactVal.copy(payerInfo);
			// 个人类参与人信息表
			IBOCmIndivPartyValue indivPartyVal = new BOCmIndivPartyBean();
			indivPartyVal.copy(payerInfo);
			// 参与人信息表
			IBOCmPartyValue partyVal = new BOCmPartyBean();
			partyVal.copy(payerInfo); 

			// 查询party，如果cprId为空则插入partyId
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IPartyValue partyValue = partySV.queryPartyById(partyId);

			// 修改firsrtName和lastName
			partyValue.setFirstName(firstName);
			partyValue.setLastName(lastName);
			partyValue.setPartyName(firstName + " " + lastName);
			partyValue.setFirstNameQry(StringUtils.upperCase(firstName));
			partyValue.setLastNameQry(StringUtils.upperCase(lastName));
			partyValue.setPartyNameQry(StringUtils.upperCase(firstName + " " + lastName));			
			// 修改生日
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			format.setLenient(false);
			Timestamp birth = new Timestamp(format.parse(birthday).getTime());
			partyValue.setBirthday(birth);
			partyValue.setGender(gender);
			partyValue.setRemarks(addressDetail);
			partyValue.setCertCode(certCode);
			
			IVOPartyValue voPartyValue = new VOPartyBean();
			voPartyValue.setParty(partyValue);
			// 保存参与人联系信息
			contactVal.setPartyId(partyId);
			IPartyContactValue partyContactValue = getPartyContactValue(contactVal);
			partyContactValue.setFirstNameQry(partyValue.getFirstNameQry());
			partyContactValue.setLastNameQry(partyValue.getLastNameQry());
			partyContactValue.setContName(partyValue.getPartyName());
			partyContactValue.setContNameQry(partyValue.getPartyNameQry());
			partyContactValue.setContAddress(String.valueOf(addressId));
			partyContactValue.setRemarks(addressDetail);
			
			voPartyValue.setPartyContact(partyContactValue);
			ICmPartySV service = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			voPartyValue.setBusinessId(CmConstants.BusiLogId.PAYER);
			service.saveParty(voPartyValue); 
			
			//送cpr订购
			ICmCustRequestTaskSV requestTaskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
			requestTaskSV.saveCustRequestTaskInfo(partyId, 4, "C");
		}
		return partyId;
	}

	@Override
	public IQBOCmPayerInfoValue queryPartyInfoByPartyId(long partyId) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1").append(" and A.").append(IQBOCmPayerInfoValue.S_PartyId).append(" = :partyId ");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		// SQL优化
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmPayerInfoBean.class, condition.toString(), parameter, -1, -1);
		IQBOCmPayerInfoValue[] payerInfoValues = (IQBOCmPayerInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmPayerInfoBean.class, sql, parameter);
		if (payerInfoValues != null && payerInfoValues.length > 0) {
			return payerInfoValues[0];
		}
		return null;
	}

	@Override
	public IBOCmPartyContactValue queryPartyContactInfoByPartyId(long partyId) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("1=1").append(" and ").append(IBOCmPartyContactValue.S_PartyId).append("=:partyId");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		IBOCmPartyContactValue[] result = (IBOCmPartyContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPartyContactBean.class, sql.toString(), parameter, -1, -1);
		if (result != null && result.length > 0) {
			return result[0];
		}
		return null;
	}
}
