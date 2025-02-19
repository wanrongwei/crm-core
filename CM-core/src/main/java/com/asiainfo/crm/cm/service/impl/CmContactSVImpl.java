package com.asiainfo.crm.cm.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTimeUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.ai.omframe.util.TimeUtil;
import com.ai.secframe.common.util.DatetimeUtil;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.asiainfo.appframe.ext.exeframe.msg.common.DateTimeUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractAcctContactDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractAcctContactQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractAddAcctContQryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractAddCustContQryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractCustContactDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.contact.AbstractCustContactQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustomerQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.party.AbstractPartyContactQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.bo.QBOCmGroupPartyBean;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmGroupPartyValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmGroupCustContactBean;
import com.asiainfo.crm.cm.inner.contact.bo.QBOCmIndivCustContactBean;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmGroupCustContactValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmIndivCustContactValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivContactBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyContactBean;
import com.asiainfo.crm.cm.inner.party.bo.QBOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmIndivPartyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IQBOCmIndivPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmxClubMemberValue;
import com.asiainfo.crm.cm.ln.club.service.interfaces.ICmLnClubMemberSV;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName CmContactSVImpl
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:33:20
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public class CmContactSVImpl implements ICmContactSV {

	public int queryAcctContactCountByAcctId(long acctId) throws Exception {
		AbstractAcctContactQueryBusiModelImpl busiModel = (AbstractAcctContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactQueryBusiModelImpl.class);
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(IContactValue.S_State, CmConstants.RecordState.USE);
		conditionDC.set(IContactValue.S_AcctId, acctId);
		return busiModel.queryCount(new DataContainer[] { conditionDC });
	}

	public int queryAcctContactCount(DataContainer conditionDC) throws Exception {
		AbstractAcctContactQueryBusiModelImpl busiModel = (AbstractAcctContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactQueryBusiModelImpl.class);
		return busiModel.queryCount(new DataContainer[] { conditionDC });
	}

	public int queryAcctContactCount(String criteria) throws Exception {
		AbstractAcctContactQueryBusiModelImpl busiModel = (AbstractAcctContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactQueryBusiModelImpl.class);
		return busiModel.queryCount(criteria);
	}

	public IContactValue[] queryAcctContacts(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		AbstractAcctContactQueryBusiModelImpl busiModel = (AbstractAcctContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactQueryBusiModelImpl.class);
		return (IContactValue[]) busiModel.queryData(new DataContainer[] { conditionDC }, startNum, endNum);
	}

	public IContactValue[] queryAcctContacts(String criteria, int startNum, int endNum) throws Exception {
		AbstractAcctContactQueryBusiModelImpl busiModel = (AbstractAcctContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactQueryBusiModelImpl.class);
		return (IContactValue[]) busiModel.queryData(criteria, startNum, endNum);
	}

	public IContactValue[] queryAcctContactsByAcctId(long acctId, int startNum, int endNum) throws Exception {
		AbstractAcctContactQueryBusiModelImpl busiModel = (AbstractAcctContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactQueryBusiModelImpl.class);
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(IContactValue.S_State, CmConstants.RecordState.USE);
		conditionDC.set(IContactValue.S_AcctId, acctId);
		IContactValue[] contactValues = (IContactValue[]) busiModel.queryData(new DataContainer[] { conditionDC }, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			Arrays.sort(contactValues, new Comparator<IContactValue>() {

				public int compare(IContactValue obj1, IContactValue obj2) {
					return obj2.getPrioryLevel() - obj1.getPrioryLevel();
				}
			});
		}
		return contactValues;
	}

	public int queryCustContactCount(DataContainer conditionDC) throws Exception {
		AbstractCustContactQueryBusiModelImpl queryBusiModel = (AbstractCustContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactQueryBusiModelImpl.class);
		return queryBusiModel.queryCount(new DataContainer[] { conditionDC });
	}

	public int queryCustContactCount(String criteria) throws Exception {
		AbstractCustContactQueryBusiModelImpl queryBusiModel = (AbstractCustContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactQueryBusiModelImpl.class);
		return queryBusiModel.queryCount(criteria);
	}

	public int queryCustContactCountByCustId(long custId) throws Exception {
		return queryCustContactCountByCustId(custId, CmConstants.RecordState.USE);
	}

	public int queryCustContactCountByCustId(long custId, String state) throws Exception {
		AbstractCustContactQueryBusiModelImpl queryBusiModel = (AbstractCustContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactQueryBusiModelImpl.class);
		DataContainer container = new DataContainer();
		container.set(IContactValue.S_CustId, custId);
		if (StringUtils.isNotBlank(state) && StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.RECORD_STATE, state) != null) {
			container.set(IContactValue.S_State, state);
		}
		return queryBusiModel.queryCount(new DataContainer[] { container });
	}

	public IContactValue[] queryCustContacts(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		AbstractCustContactQueryBusiModelImpl queryBusiModel = (AbstractCustContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactQueryBusiModelImpl.class);
		return (IContactValue[]) queryBusiModel.queryData(new DataContainer[] { conditionDC }, startNum, endNum);
	}

	public IContactValue[] queryCustContacts(String criteria, int startNum, int endNum) throws Exception {
		AbstractCustContactQueryBusiModelImpl queryBusiModel = (AbstractCustContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactQueryBusiModelImpl.class);
		IContactValue[] values = (IContactValue[]) queryBusiModel.queryData(criteria, startNum, endNum);
		List<IContactValue> valueList = new ArrayList<IContactValue>();
		//comsumert 436&436
		if (null != values && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				values[i].setDiaplayAttr("CONT_ADDRESS", "CONT_ADDRESS_NAME", values[i].getContDesc());
				if(null!=values[i].getContExpireDate()&&values[i].getContExpireDate().after(new Date())) {
					valueList.add(values[i]);
				}
			}
		}
		
		if(null!=valueList&&valueList.size()>0) {
			return valueList.toArray(new IContactValue[0]);
		}
		return new IContactValue[0];
	}

	public IContactValue[] queryCustContactsByCustId(long custId, int startNum, int endNum) throws Exception {
		return queryCustContactsByCustId(custId, CmConstants.RecordState.USE, startNum, endNum);
	}

	public IContactValue[] queryCustContactsByCustId(long custId, String state, int startNum, int endNum) throws Exception {
		AbstractCustContactQueryBusiModelImpl queryBusiModel = (AbstractCustContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactQueryBusiModelImpl.class);
		DataContainer container = new DataContainer();
		int custType = CmCommonUtil.getCustType(custId);
		if (custType == CmConstants.CustomerType.GROUP) {
			container.set(IContactValue.S_ContType, CmConstants.CONT_TYPE.CONT_TYPE_1);
		}
		container.set(IContactValue.S_CustId, custId);
		if (StringUtils.isNotBlank(state) && StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.RECORD_STATE, state) != null) {
			container.set(IContactValue.S_State, state);
		}
		IContactValue[] contactValues = (IContactValue[]) queryBusiModel.queryData(new DataContainer[] { container }, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			Arrays.sort(contactValues, new Comparator<IContactValue>() {

				public int compare(IContactValue obj1, IContactValue obj2) {
					return obj2.getPrioryLevel() - obj1.getPrioryLevel();
				}
			});
		}
		return contactValues;
	}

	public void saveAcctContact(IContactValue contactValue) throws Exception {
		AbstractAcctContactDealBusiModelImpl busiModel = (AbstractAcctContactDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactDealBusiModelImpl.class);
		IVOAccountValue accountValue = new VOAccountBean();
		accountValue.addContact(contactValue);
		busiModel.deal(accountValue);
	}

	public void saveAcctContact(IVOAccountValue accountValue) throws Exception {
		AbstractAcctContactDealBusiModelImpl busiModel = (AbstractAcctContactDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactDealBusiModelImpl.class);
		busiModel.deal(accountValue);
	}

	public void saveCustContact(IContactValue contactValue) throws Exception {
		AbstractCustContactDealBusiModelImpl busiModel = (AbstractCustContactDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactDealBusiModelImpl.class);
		IVOCustValue custValue = new VOCustBean();
		custValue.addContact(contactValue);
		busiModel.deal(custValue);
	}

	public void saveCustContact(IVOCustValue custValue) throws Exception {
		AbstractCustContactDealBusiModelImpl busiModel = (AbstractCustContactDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactDealBusiModelImpl.class);
		busiModel.deal(custValue);
	}

	public IContactValue queryCustContactById(long custContId, long custId) throws Exception {
		AbstractCustContactQueryBusiModelImpl queryBusiModel = (AbstractCustContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactQueryBusiModelImpl.class);
		DataContainer container = new DataContainer();
		container.set(IContactValue.S_CustId, custId);
		container.set(IContactValue.S_CustContId, custContId);
		AbstractCustomerQueryBusiModelImpl custQueryBusiModel = (AbstractCustomerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustomerQueryBusiModelImpl.class);
		ICustomerValue[] customerValues = null;
		if (custContId <= 0) {
			// 支持将一个客户关联为联系人
			customerValues = (ICustomerValue[]) custQueryBusiModel.queryData(new DataContainer[] { container }, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(customerValues)) {
				long partyId = customerValues[0].getPartyId();
				// container.clear();
				// 根据该客户对应的参与人编号查询对应的联系信息
				container.set(IContactValue.S_PartyId, partyId);
				AbstractAddCustContQryBusiModelImpl addCustContQryBusiModel = (AbstractAddCustContQryBusiModelImpl) CmServiceFactory
						.getBusiMode(AbstractAddCustContQryBusiModelImpl.class);
				IContactValue[] contactValues = (IContactValue[]) addCustContQryBusiModel.queryData(new DataContainer[] { container }, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(contactValues)) {
					return contactValues[0];
				}
			}
		} else {
			IContactValue[] contactValues = (IContactValue[]) queryBusiModel.queryData(new DataContainer[] { container }, -1, -1);
			contactValues[0].setDiaplayAttr("CONT_ADDRESS", "CONT_ADDRESS_NAME", contactValues[0].getContDesc());
			return contactValues[0];
			// if (custId > 0) {
			// customerValues = (ICustomerValue[]) custQueryBusiModel.queryData(new DataContainer[] { container }, -1,
			// -1);
			// if (CmCommonUtil.isNotEmptyObject(customerValues) && CmCommonUtil.isNotEmptyObject(contactValues)) {
			// // 将客户资料中的基本信息覆盖联系人的，保证以客户资料为准
			// CmLnContactBusiRule.sysCustInfo2Cont(customerValues[0], contactValues[0]);
			// return contactValues[0];
			// }
			// }
		}
		return null;
	}

	public IContactValue queryAcctContactById(long acctContId, long acctId) throws Exception {
		AbstractAcctContactQueryBusiModelImpl queryBusiModel = (AbstractAcctContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactQueryBusiModelImpl.class);
		DataContainer container = new DataContainer();
		container.set(IContactValue.S_AcctId, acctId);
		container.set(IContactValue.S_AcctContId, acctContId);
		IContactValue[] contactValues = (IContactValue[]) queryBusiModel.queryData(new DataContainer[] { container }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			return contactValues[0];
		}
		return null;
	}

	public IContactValue queryAcctContactById(long partyId, long acctContId, long acctId) throws Exception {
		AbstractAcctContactQueryBusiModelImpl queryBusiModel = (AbstractAcctContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractAcctContactQueryBusiModelImpl.class);
		if (partyId > 0) {
			DataContainer custDC = new DataContainer();
			custDC.set(IContactValue.S_PartyId, partyId);
			AbstractAddAcctContQryBusiModelImpl addAcctContQryBusiModel = (AbstractAddAcctContQryBusiModelImpl) CmServiceFactory
					.getBusiMode(AbstractAddAcctContQryBusiModelImpl.class);
			IContactValue[] contactValues = (IContactValue[]) addAcctContQryBusiModel.queryData(new DataContainer[] { custDC }, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(contactValues)) {
				return contactValues[0];
			}
		} else {
			DataContainer container = new DataContainer();
			container.set(IContactValue.S_AcctId, acctId);
			container.set(IContactValue.S_AcctContId, acctContId);
			IContactValue[] contactValues = (IContactValue[]) queryBusiModel.queryData(new DataContainer[] { container }, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(contactValues)) {
				return contactValues[0];
			}
		}
		return null;
	}

	public IContactValue queryIndivContactByCustId(long custId) throws Exception {
		IContactValue[] values = queryCustContactsByCustId(custId, -1, -1);
		if (values != null && values.length > 0)
			return values[0];
		return null;
	}

	// 联系人信息查询
	public IBOCmGroupContactValue queryCustConBycustContId(long custContId) throws Exception {
		IBOCmGroupContactValue cmContactValue = new BOCmGroupContactBean();
		cmContactValue.setCustContId(custContId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmContactValue);
		return (IBOCmGroupContactValue) dc;
		/*
		 * if(-1!=custContId){ StringBuilder condition = new StringBuilder(); condition.append(" 1=1 "); HashMap paraMap
		 * = new HashMap(); //SETCmGroupContact condition.append(" and
		 * ").append(IBOCmGroupContactValue.S_CustContId).append(" =:custContId"); paraMap.put("custContId",
		 * custContId); return BOCmGroupContactEngine.getBeans(null, condition.toString(), paraMap, -1, -1, true)[0]; }
		 * return null;
		 */
	}
	
	/**
	 * 根据PartyId，查询所有关联的b2b客户
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2020-5-8
	* ICmContactSV
	*/
	public int queryCustConCountByPartyId(long partyId)throws Exception{
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmGroupContactValue[] grouopContValues =  customerSV.queryCustContId(partyId, 0, 0, 0);
		return  grouopContValues.length;
	}
	
	public IBOCmGroupContactValue[] queryCustConByPartyIdForPage(long partyId, int start, int end) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmGroupContactValue[]  grouopContValues = customerSV.queryCustContIdForPage(partyId, 0, 0, 0, start, end);
		if (grouopContValues != null && grouopContValues.length > 0) {
			return grouopContValues;
		}
		return new IBOCmGroupContactValue[0];
	}


	public IContactValue queryContactByContId(long contId) throws Exception {
		IContactValue contactValue = null;
		AbstractPartyContactQueryBusiModelImpl partyContactQueryBusiModelImpl = (AbstractPartyContactQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractPartyContactQueryBusiModelImpl.class);
		DataContainer dc = new DataContainer();
		dc.set(IContactValue.S_ContId, String.valueOf(contId));
		DataContainerInterface[] dcs = partyContactQueryBusiModelImpl.queryData(new DataContainer[] { dc }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			contactValue = new ContactBean();
			contactValue.copy(dcs[0]);
		}
		return contactValue;
	}

	public int queryCustContactCountByCustId(long custId, String state, String type) throws Exception {
		AbstractCustContactQueryBusiModelImpl queryBusiModel = (AbstractCustContactQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustContactQueryBusiModelImpl.class);
		DataContainer container = new DataContainer();
		container.set(IContactValue.S_CustId, custId);
		container.set(IContactValue.S_ContType, type);
		if (StringUtils.isNotBlank(state) && StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.RECORD_STATE, state) != null) {
			container.set(IContactValue.S_State, state);
		}
		return queryBusiModel.queryCount(new DataContainer[] { container });
	}

	public IQBOCmGroupCustContactValue[] queryCustContactReport(String criteria, int startNum, int endNum) throws Exception {
		// TODO Auto-generated method stub
		String staffName = "";
		// TODO Auto-generated method stub
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sqlB = new StringBuilder("");
		sqlB.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupContactBean.class).getMapingEnty());
		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		addMemSql.append(" and t.STATE = '" + CmConstants.RecordState.USE + "' ");
		if (!"".equals(condition.getAsString("EFFECTIVE_DATE")) && null != condition.getAsString("EFFECTIVE_DATE")) {
			addMemSql.append(" and t.CREATE_DATE >=to_date( :StartDate ,'YYYY-MM-DD') ");
			parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE").substring(0, 10));
		}
		if (!"".equals(condition.getAsString("EXPIRE_DATE")) && null != condition.getAsString("EXPIRE_DATE")) {
			addMemSql.append(" and t.CREATE_DATE <to_date( :EndDate ,'YYYY-MM-DD')+1 ");
			parameter.put("EndDate", condition.getAsString("EXPIRE_DATE").substring(0, 10));
		}
		// if(!"".equals(condition.getAsString("CUST_ID")) && null != condition.getAsString("CUST_ID"))
		// {
		// addMemSql.append(" and "+IQBOCmGroupCustContactValue.S_CustId + " = :CustId ");
		// parameter.put("CustId", condition.getAsString("CUST_ID"));
		// }
		if (!"".equals(condition.getAsString("CONT_TYPE")) && null != condition.getAsString("CONT_TYPE")) {
			addMemSql.append(" and t.CONT_TYPE = :ContType ");
			parameter.put("ContType", condition.getAsString("CONT_TYPE"));
		}

		// modify by caiyu 20121203 修改sql语句
		if ((!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID"))
				|| (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID"))
				|| (!"".equals(condition.getAsString("CUST_SERVICE_ID")) && null != condition.getAsString("CUST_SERVICE_ID"))
				|| (!"".equals(condition.getAsString("CUST_NAME")) && null != condition.getAsString("CUST_NAME"))) {
			addMemSql.append(" and exists ( select 1 from cm_group_customer c where c.cust_id = t.cust_id and c.state='U' ");
			if (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID")) {
				addMemSql.append(" and c.CITY_ID = :CityId ");
				parameter.put("CityId", condition.getAsString("CITY_ID"));
			}
			if (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID")) {
				addMemSql.append(" and c.COUNTY_ID = :CountyId ");
				parameter.put("CountyId", condition.getAsString("COUNTY_ID"));
			}
			if (!"".equals(condition.getAsString("CUST_SERVICE_ID")) && null != condition.getAsString("CUST_SERVICE_ID")) {
				addMemSql.append(" and c.CUST_SERVICE_ID = :custServiceId ");
				parameter.put("custServiceId", condition.getAsString("CUST_SERVICE_ID"));
			}
			if (!"".equals(condition.getAsString("CUST_NAME")) && null != condition.getAsString("CUST_NAME")) {
				addMemSql.append(" and c.CUST_NAME like :custName ");
				parameter.put("custName", condition.getAsString("CUST_NAME") + "%");
			}
			addMemSql.append(" ) ");
		}

		// modify by caiyu 20121203 增加当页面传入OP_ID时，查询当前操作员所管理的集团的集团联系人、关键人、家属等信息
		if (!"".equals(condition.getAsString("OP_ID")) && null != condition.getAsString("OP_ID")) {
			addMemSql.append(" and exists (select 1 from cm_group_manager g where g.cust_id = t.cust_id and g.MANAGER_ID = :managerId ) ");
			parameter.put("managerId", condition.getAsLong("OP_ID"));
		}

		// 集团信息
		// ICustomerValue customerValue =
		// CmServiceFactory.getCustomerSV().queryCustomerByCustId(Long.valueOf(condition.getAsString("CUST_ID")));
		// (BOCmGroupManagerBean[])CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupManagerBean.class,
		// CmLnCommonUtil.getQueryResult(groupSB.toString(), conditonSql, -1, -1), queryPara);
		IQBOCmGroupCustContactValue[] returnValues = (IQBOCmGroupCustContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmGroupCustContactBean.class,
				CmLnCommonUtil.getQueryResult(sqlB.toString(), addMemSql.toString(), startNum, endNum, parameter), parameter);

		// modify by caiyu 20121203 修改返回对象
		if (CmCommonUtil.isNotEmptyObject(returnValues) && returnValues.length > 0) {
			ICmCustomerSV ccSV = CmServiceFactory.getCustomerSV();
			ICmCommonInnerSV cciSV = CmInnerServiceFactory.getCommonInnerSV();
			ICmLnClubMemberSV lnClubSv = CmxServiceFactory.getLnClubMemberSV();
			ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			ICustomerValue customerValue = null;
			IBOLnCmxGroupCustValue cmxGroupCustValue = null;
			DataContainerInterface dc = null;
			IBOCmGroupManagerValue gMgrRel = null;
			IQBOSecCustManagerValue secStaff = null;
			IQBOSecOrgStaffOperValue soov = null;
			IBOBsCommonDistrictValue cdv = null;
			ICustomerValue customer = null;
			IBOLnCmxClubMemberValue cmxMember = null;
			ICmTeamInvokeSV sv = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			for (IQBOCmGroupCustContactValue value : returnValues) {
				// 集团信息
				customerValue = ccSV.queryCustomerByCustId(value.getCustId());
				if (CmCommonUtil.isNotEmptyObject(customerValue)) {
					value.initProperty("CUST_SERVICE_ID", customerValue.getCustServiceId());
					value.initProperty("CUST_NAME", customerValue.getCustName());
					value.initProperty("CUST_SERVICE_LEVEL", customerValue.getCustServiceLevel());
					value.initProperty("REGION_TYPE", customerValue.getRegionType());
				}
				// 扩展信息
				cmxGroupCustValue = new BOLnCmxGroupCustBean();
				cmxGroupCustValue.setCustId(value.getCustId());
				dc = cciSV.getBean((DataContainerInterface) cmxGroupCustValue);
				if (CmCommonUtil.isNotEmptyObject(dc)) {
					// value.initProperty("GRP_ORG_TYPE", ((IBOLnCmxGroupCustValue) dc).getGrpOrgType());
				}
				// 客户经理信息
				gMgrRel = cnGroupSv.queryGroupCustMgrRel(value.getCustId());
				if (CmCommonUtil.isNotEmptyObject(gMgrRel)) {
					secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
					if (CmCommonUtil.isNotEmptyObject(secStaff)) {
						staffName = secStaff.getManagername();
					}

				}
				value.initProperty("MANAGER_NAME", staffName);

				if (value.getUserId() > 0) {
					// 从用户信息获取地市和区县数据
					IQUserBaseInfoValue insUserValue = sv.getUserBaseInfoByBillId(value.getBillId());
					if (null != insUserValue) {
						value.setCityId(insUserValue.getAreaCode());
						value.setCountyId(insUserValue.getCountryCode());
						if (value.getCityId() != null && !"".equals(value.getCityId())) {
							cdv = BsCommonDistrictUtil.getCommonDistrictByCode(value.getCityId(), 3); // 4 是区县，3是地市
							value.initProperty("CITY_NAME", cdv.getDistrictName());
						}
						if (value.getCountyId() != null && !"".equals(value.getCountyId())) {
							cdv = BsCommonDistrictUtil.getCommonDistrictByCode(value.getCountyId(), 4); // 4 是区县，3是地市
							value.initProperty("COUNTY_NAME", cdv.getDistrictName());
						}

						customer = ccSV.queryCustomerByCustId(insUserValue.getCustId());
						value.set(ICustomerValue.S_Birthday, customer.getBirthday());
						value.set(IQBOCmGroupCustContactValue.S_PartyName, customer.getCustName());
						value.set(IQBOCmGroupCustContactValue.S_Gender, customer.getGender());
						// 如果存在真实资料，则取真实资料生日信息
						cmxMember = lnClubSv.queryCmxClubMemberValue(insUserValue.getUserId());
						if (CmCommonUtil.isNotEmptyObject(cmxMember)) {
							Date birtyday = cmxMember.getBirthday();
							if (birtyday != null) {
								value.set(ICustomerValue.S_Birthday, birtyday);
							}
						}
					}
				}

				if (value.getCreateOpId() > 0) {
					// 设置新建员工字段
					soov = iseCm.getOperQBOByOperId(value.getCreateOpId());
					if (CmCommonUtil.isNotEmptyObject(soov)) {
						value.initProperty("CREATE_OP_NAME", soov.getStaffName());
					}
				}

			}
		} else {
			returnValues = new IQBOCmGroupCustContactValue[0];
		}
		/*
		 * IBOLnCmxGroupCustValue cmxGroupCustValue = new BOLnCmxGroupCustBean(); cmxGroupCustValue.setCustId(custId);
		 * DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface)
		 * cmxGroupCustValue); return (IBOLnCmxGroupCustValue) dc;
		 */
		// //集团扩展信息
		// StringBuffer sqlCmx = new StringBuffer();
		// sqlCmx.append(" 1 = 1 ");
		// sqlCmx.append(" and " + IBOLnCmxGroupCustValue.S_CustId + " = :CustId ");
		// IBOLnCmxGroupCustValue[] cmxCustValues =
		// (IBOLnCmxGroupCustValue[])CmInnerServiceFactory.getCommonInnerSV().getBeans(BOLnCmxGroupCustBean.class,
		// sqlCmx.toString(), parameter,-1,-1);

		// //客户经理
		// StringBuffer sqlMan = new StringBuffer();
		// sqlMan.append(" 1 = 1 ");
		// sqlMan.append(" and " + IBOCmGroupManagerValue.S_CustId + " = :CustId ");
		// sqlMan.append(" and " + IBOCmGroupManagerValue.S_RelType + " = " + CmLnConstants.CmRelType.RELTYPE1);
		// IBOCmGroupManagerValue[] managerValue =
		// (IBOCmGroupManagerValue[])CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupManagerBean.class,
		// sqlMan.toString(), parameter,startNum, endNum);

		// if(CmCommonUtil.isNotEmptyObject(managerValue))
		// {
		// //查询客户经理名称
		// ISec2CmSV secSv = (ISec2CmSV)ServiceFactory.getService(ISec2CmSV.class);
		// IQBOSecCustManagerValue mValue =
		// secSv.getEffectAmInfo(managerValue[0].getManagerId(),CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
		// if(CmCommonUtil.isNotEmptyObject(mValue))
		// {
		// staffName = mValue.getManagername();
		// }
		// }

		return returnValues;
	}

	public int queryCustContactReportCount(String criteria) throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		DataContainer condition = dcs[0];
		StringBuilder addMemSql = new StringBuilder("");
		Map parameter = new HashMap();
		// addMemSql.append( " 1 = 1 ");
		// if(!"".equals(condition.getAsString("EFFECTIVE_DATE")) && null != condition.getAsString("EFFECTIVE_DATE")){
		// addMemSql.append(" and "+IBOCmGroupCustContractValue.S_CreateDate+" >=to_date( :StartDate ,'YYYY-MM-DD')");
		// addMemSql.append(" and "+IBOCmGroupCustContractValue.S_CreateDate+" <to_date( :EndDate ,'YYYY-MM-DD')+1");
		//
		// parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE").substring(0, 10));
		// parameter.put("EndDate", condition.getAsString("EXPIRE_DATE").substring(0, 10));
		// }
		// addMemSql.append(" and "+IBOCmGroupCustContractValue.S_State + " = '" + CmConstants.RecordState.USE + "'");
		// if(!"".equals(condition.getAsString("CUST_ID")) && null != condition.getAsString("CUST_ID"))
		// {
		// addMemSql.append(" and "+IBOCmGroupAuditInfoValue.S_CustId + " = :CustId ");
		// }
		// if(!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID"))
		// {
		// addMemSql.append(" and "+IBOCmGroupAuditInfoValue.S_CityId + " = :CityId ");
		// }
		// if(!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID"))
		// {
		// addMemSql.append(" and "+IBOCmGroupAuditInfoValue.S_CountyId + " = :CountyId ");
		// }
		// parameter.put("CustId", condition.getAsLong("CUST_ID"));
		// parameter.put("CityId", condition.getAsString("CITY_ID"));
		// parameter.put("CountyId", condition.getAsString("COUNTY_ID"));

		StringBuilder sqlB = new StringBuilder("");
		sqlB.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(BOCmGroupContactBean.class).getMapingEnty());
		addMemSql.append(" and t.STATE = '" + CmConstants.RecordState.USE + "' ");
		if (!"".equals(condition.getAsString("EFFECTIVE_DATE")) && null != condition.getAsString("EFFECTIVE_DATE")) {
			addMemSql.append(" and t.CREATE_DATE >=to_date( :StartDate ,'YYYY-MM-DD') ");
			parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE").substring(0, 10));
		}
		if (!"".equals(condition.getAsString("EXPIRE_DATE")) && null != condition.getAsString("EXPIRE_DATE")) {
			addMemSql.append(" and t.CREATE_DATE <to_date( :EndDate ,'YYYY-MM-DD')+1 ");
			parameter.put("EndDate", condition.getAsString("EXPIRE_DATE").substring(0, 10));
		}
		// if(!"".equals(condition.getAsString("CUST_ID")) && null != condition.getAsString("CUST_ID"))
		// {
		// addMemSql.append(" and "+IQBOCmGroupCustContactValue.S_CustId + " = :CustId ");
		// parameter.put("CustId", condition.getAsString("CUST_ID"));
		// }
		if (!"".equals(condition.getAsString("CONT_TYPE")) && null != condition.getAsString("CONT_TYPE")) {
			addMemSql.append(" and t.CONT_TYPE = :ContType ");
			parameter.put("ContType", condition.getAsString("CONT_TYPE"));
		}

		// modify by caiyu 20121203 修改sql语句
		if ((!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID"))
				|| (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID"))
				|| (!"".equals(condition.getAsString("CUST_SERVICE_ID")) && null != condition.getAsString("CUST_SERVICE_ID"))
				|| (!"".equals(condition.getAsString("CUST_NAME")) && null != condition.getAsString("CUST_NAME"))) {
			addMemSql.append(" and exists ( select 1 from cm_group_customer c where c.cust_id = t.cust_id and c.state='U' ");
			if (!"".equals(condition.getAsString("CITY_ID")) && null != condition.getAsString("CITY_ID")) {
				addMemSql.append(" and c.CITY_ID = :CityId ");
				parameter.put("CityId", condition.getAsString("CITY_ID"));
			}
			if (!"".equals(condition.getAsString("COUNTY_ID")) && null != condition.getAsString("COUNTY_ID")) {
				addMemSql.append(" and c.COUNTY_ID = :CountyId ");
				parameter.put("CountyId", condition.getAsString("COUNTY_ID"));
			}
			if (!"".equals(condition.getAsString("CUST_SERVICE_ID")) && null != condition.getAsString("CUST_SERVICE_ID")) {
				addMemSql.append(" and c.CUST_SERVICE_ID = :custServiceId ");
				parameter.put("custServiceId", condition.getAsString("CUST_SERVICE_ID"));
			}
			if (!"".equals(condition.getAsString("CUST_NAME")) && null != condition.getAsString("CUST_NAME")) {
				addMemSql.append(" and c.CUST_NAME like :custName ");
				parameter.put("custName", condition.getAsString("CUST_NAME") + "%");
			}
			addMemSql.append(" ) ");
		}

		// modify by caiyu 20121203 增加当页面传入OP_ID时，查询当前操作员所管理的集团的集团联系人、关键人、家属等信息
		if (!"".equals(condition.getAsString("OP_ID")) && null != condition.getAsString("OP_ID")) {
			addMemSql.append(" and exists (select 1 from cm_group_manager g where g.cust_id = t.cust_id and g.MANAGER_ID = :managerId ) ");
			parameter.put("managerId", condition.getAsLong("OP_ID"));
		}

		DataContainer[] vallues = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(sqlB.toString(), addMemSql.toString(), parameter), parameter);
		// CmInnerServiceFactory.getCommonInnerSV().getBeansFromSqlCount(QBOCmGroupCustContactBean.class,addMemSql.toString(),
		// parameter);

		return vallues[0].getAsInt("CNT");
	}

	public IQBOCmGroupPartyValue[] queryGroupPartyInfo(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		DataContainer container = dcs[0];
		long custId = container.getAsLong("CUST_ID");
		StringBuffer condition = new StringBuffer("");
		StringBuffer inheritableCond = new StringBuffer("");// 针对继承逻辑
		Map parameter = new HashMap();
		condition.append(" AND ").append("D.").append(IContactValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		if (null != container.getAsString("BILL_ID")) {
			condition.append(" AND ").append("D.").append(IContactValue.S_BillId).append(" =:billId ");
			inheritableCond.append(" AND ").append("D.").append(IContactValue.S_BillId).append(" =:billId ");
			parameter.put("billId", container.getAsString("BILL_ID"));
		}
		if (null != container.getAsString("PARTY_NAME")) {
			condition.append(" AND ").append("A.").append(IContactValue.S_PartyName).append(" LIKE :partyName ");
			inheritableCond.append(" AND ").append("A.").append(IContactValue.S_PartyName).append(" LIKE :partyName ");
			parameter.put("partyName", "%" + container.getAsString("PARTY_NAME") + "%");
		}
		// 增加继承根集团联系人逻辑
		ICmGroupCustomerSV sv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmGroupOrgStructValue val = sv.queryGroupOrgStructByRelCustId(String.valueOf(custId));
		StringBuilder sql = new StringBuilder();
		if (val.getCustId() == custId) {
			sql = getGroupContactQuerySql(false, condition.toString(), inheritableCond.toString());
		} else {
			sql = getGroupContactQuerySql(true, condition.toString(), inheritableCond.toString());
		}
		String finalSql = CmLnCommonUtil.getQueryResult(sql.toString(), null, startNum, endNum, null);
		IQBOCmGroupPartyValue[] values = (IQBOCmGroupPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmGroupPartyBean.class, finalSql, parameter);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.GROUP_CONTACT_PERSON_QRY, finalSql, parameter, CmConstants.BusiLogType.CONTACT_LOG);
		if (null != values && values.length > 0) {
			IBOBsStaticDataValue staticDataValue = null;
			for (int i = 0; i < values.length; i++) {
				// 设置联系人分类，区分kob同步还是人工创建
				staticDataValue = StaticDataUtil.getStaticData("CM_GROUP_CUST_CONT_TYPE", String.valueOf(values[i].getContType()));
				if (StringUtils.isBlank(staticDataValue.getExternCodeType())) {
					// 空为人工
					values[i].setRemarks(CrmLocaleFactory.getResource("CMS0001258"));
				} else {
					values[i].setRemarks(CrmLocaleFactory.getResource("CMS0001257"));
					//kob导入的只展示first_name
					values[i].setPartyName(values[i].getFirstName());
				}
				// 设置联系人自有还是继承根节点
				if (custId == values[i].getCustId()) {
					values[i].setMemberDesc("Own");
				} else {
					values[i].setMemberDesc("Inherit");
				}
				values[i].setDiaplayAttr("CONT_ADDRESS", "CONT_ADDRESS_NAME", values[i].getContDesc());
			}
			return values;
		}
		return new QBOCmGroupPartyBean[0];
	}

	/**
	 * 获取联系人查询SQL
	 * @Function getGroupContactQuerySql
	 * @Description 
	 *
	 * @param isInheritable（是否包含继承逻辑）
	 * @return
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-11-19 下午5:46:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-19     yangjh           v1.0.0               修改原因<br>
	 */
	private StringBuilder getGroupContactQuerySql(boolean isInheritable, String condtion, String inheritableCond) {
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append("A.PARTY_ID,A.PARENT_PARTY_ID,A.PARTY_TYPE,A.PARTY_NAME,A.SHORT_NAME,");
		sql.append("A.ENGLISH_NAME,A.CERT_TYPE,A.CERT_CODE,A.CERT_ADDRESS,A.CUST_CERT_EFFDATE,");
		sql.append("A.CERT_EXPIRE_DATE,A.NATIONALITY,A.PROVINCE_ID,A.CITY_ID,A.COUNTY_ID,A.REGION_TYPE,");
		sql.append("A.SUB_REGION_TYPE,D.STATE,D.CREATE_OP_ID,D.CREATE_ORG_ID,D.OP_ID,D.ORG_ID,D.DONE_CODE,");
		sql.append("D.CREATE_DATE,D.DONE_DATE,D.EFFECTIVE_DATE,D.EXPIRE_DATE,D.REGION_ID,D.REMARKS,C.CONT_ID,");
		sql.append("C.CONT_NAME,C.CONT_ADDRESS,C.HOME_TEL,C.OFFICE_TEL,C.CONT_MOBILE,C.CONT_DESC,C.CONT_EMAIL,");
		sql.append("C.POST_CODE,C.POST_ADDRESS,C.CONT_FAX,D.CUST_CONT_ID,D.CUST_ID,D.PRIORY_LEVEL,D.CONT_TYPE,");
		sql.append("D.CONT_LEVEL,D.USER_ID,D.PROTO_EXPIRE_DATE,D.PROTO_VALID_DATE,D.PROTO_FILE_NAME,D.ID_EXPIRE_DATE,");
		sql.append("D.ID_VALID_DATE,D.ID_FILE_NAME,D.MEMBER_JOB,D.MEMBER_TYPE,D.MEMBER_DESC,D.BILL_ID,D.PROVIDE_ID,");
		sql.append("D.BRAND,D.CONT_CLASS,A.FIRST_NAME,A.MIDDLE_NAME,A.LAST_NAME,A.FIRST_NAME_QRY,A.MIDDLE_NAME_QRY,");
		sql.append("A.LAST_NAME_QRY,A.PARTY_NAME_QRY,C.FIRST_NAME AS CONT_FIRST_NAME,C.MIDDLE_NAME AS CONT_MIDDLE_NAME,");
		sql.append("C.LAST_NAME AS CONT_LAST_NAME,C.FIRST_NAME_QRY AS CONT_FIRST_NAME_QRY,");
		sql.append("C.MIDDLE_NAME_QRY AS CONT_MIDDLE_NAME_QRY,C.LAST_NAME_QRY AS CONT_LAST_NAME_QRY,C.CONT_NAME_QRY");
		sql.append(" FROM  {CM_PARTY} A,{CM_PARTY_CONTACT} C,{CM_GROUP_CONTACT} D ");
		sql.append(" WHERE A.PARTY_ID = C.PARTY_ID AND D.PARTY_ID = A.PARTY_ID AND D.CONT_ID = C.CONT_ID ");
		sql.append(condtion);
		if (isInheritable) {
			sql.append(" UNION ");
			sql.append(" SELECT ");
			sql.append("A.PARTY_ID,A.PARENT_PARTY_ID,A.PARTY_TYPE,A.PARTY_NAME,A.SHORT_NAME,");
			sql.append("A.ENGLISH_NAME,A.CERT_TYPE,A.CERT_CODE,A.CERT_ADDRESS,A.CUST_CERT_EFFDATE,");
			sql.append("A.CERT_EXPIRE_DATE,A.NATIONALITY,A.PROVINCE_ID,A.CITY_ID,A.COUNTY_ID,A.REGION_TYPE,");
			sql.append("A.SUB_REGION_TYPE,D.STATE,D.CREATE_OP_ID,D.CREATE_ORG_ID,D.OP_ID,D.ORG_ID,D.DONE_CODE,");
			sql.append("D.CREATE_DATE,D.DONE_DATE,D.EFFECTIVE_DATE,D.EXPIRE_DATE,D.REGION_ID,D.REMARKS,C.CONT_ID,");
			sql.append("C.CONT_NAME,C.CONT_ADDRESS,C.HOME_TEL,C.OFFICE_TEL,C.CONT_MOBILE,C.CONT_DESC,C.CONT_EMAIL,");
			sql.append("C.POST_CODE,C.POST_ADDRESS,C.CONT_FAX,D.CUST_CONT_ID,D.CUST_ID,D.PRIORY_LEVEL,D.CONT_TYPE,");
			sql.append("D.CONT_LEVEL,D.USER_ID,D.PROTO_EXPIRE_DATE,D.PROTO_VALID_DATE,D.PROTO_FILE_NAME,D.ID_EXPIRE_DATE,");
			sql.append("D.ID_VALID_DATE,D.ID_FILE_NAME,D.MEMBER_JOB,D.MEMBER_TYPE,D.MEMBER_DESC,D.BILL_ID,D.PROVIDE_ID,");
			sql.append("D.BRAND,D.CONT_CLASS,A.FIRST_NAME,A.MIDDLE_NAME,A.LAST_NAME,A.FIRST_NAME_QRY,A.MIDDLE_NAME_QRY,");
			sql.append("A.LAST_NAME_QRY,A.PARTY_NAME_QRY,C.FIRST_NAME AS CONT_FIRST_NAME,C.MIDDLE_NAME AS CONT_MIDDLE_NAME,");
			sql.append("C.LAST_NAME AS CONT_LAST_NAME,C.FIRST_NAME_QRY AS CONT_FIRST_NAME_QRY,");
			sql.append("C.MIDDLE_NAME_QRY AS CONT_MIDDLE_NAME_QRY,C.LAST_NAME_QRY AS CONT_LAST_NAME_QRY,C.CONT_NAME_QRY");
			sql.append(" FROM  {CM_PARTY} A,{CM_PARTY_CONTACT} C,{CM_GROUP_CONTACT} D ");
			sql.append(" WHERE A.PARTY_ID = C.PARTY_ID AND D.PARTY_ID = A.PARTY_ID AND D.CONT_ID = C.CONT_ID AND D.IS_INHERITABLE=1 ");
			sql.append(" AND D.CUST_ID IN (SELECT E.CUST_ID FROM {CM_GROUP_ORG_STRUCT} E WHERE E.REL_CUST_ID = :custId ) ");
			sql.append(inheritableCond);
		}
		return sql;
	}

	public int queryGroupPartyInfoCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		DataContainer container = dcs[0];
		long custId = container.getAsLong("CUST_ID");
		StringBuffer condition = new StringBuffer("");
		StringBuffer inheritableCond = new StringBuffer("");// 针对继承逻辑
		Map parameter = new HashMap();
		condition.append(" AND ").append("D.").append(IContactValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		if (null != container.getAsString("BILL_ID")) {
			condition.append(" AND ").append("D.").append(IContactValue.S_BillId).append(" =:billId ");
			inheritableCond.append(" AND ").append("D.").append(IContactValue.S_BillId).append(" =:billId ");
			parameter.put("billId", container.getAsString("BILL_ID"));
		}
		if (null != container.getAsString("PARTY_NAME")) {
			condition.append(" AND ").append("A.").append(IContactValue.S_PartyName).append(" LIKE :partyName ");
			inheritableCond.append(" AND ").append("A.").append(IContactValue.S_PartyName).append(" LIKE :partyName ");
			parameter.put("partyName", "%" + container.getAsString("PARTY_NAME") + "%");
		}
		// 增加继承根集团联系人逻辑
		ICmGroupCustomerSV sv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmGroupOrgStructValue val = sv.queryGroupOrgStructByRelCustId(String.valueOf(custId));
		StringBuilder sql = new StringBuilder();
		if (val.getCustId() == custId) {
			sql = getGroupContactQuerySql(false, condition.toString(), inheritableCond.toString());
		} else {
			sql = getGroupContactQuerySql(true, condition.toString(), inheritableCond.toString());
		}
		String finalSql = CmLnCommonUtil.getQueryCount(sql.toString(), null, parameter);
		DataContainer[] dataContainer = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, finalSql, parameter);
		return dataContainer[0].getAsInt("CNT");
	}

	public IBOCmIndivContactValue queryIndivContactByCustContId(long custContId) throws Exception {
		IBOCmIndivContactValue cmContactValue = new BOCmIndivContactBean();
		cmContactValue.setCustContId(custContId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmContactValue);
		return (IBOCmIndivContactValue) dc;
	}

	public IQBOCmGroupPartyValue[] queryGroupContact(long custId, int contType, String billId, String partyName) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap map = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IQBOCmGroupPartyValue.S_CustId).append(" =:CUSTID ");
			map.put("CUSTID", custId);
		}
		if (contType > 0) {
			condition.append(" AND ").append(IQBOCmGroupPartyValue.S_ContType).append(" =:CONTTYPE");
			map.put("CONTTYPE", contType);
		}
		if (StringUtils.isNotEmpty(billId)) {
			condition.append(" AND ").append(IQBOCmGroupPartyValue.S_BillId).append(" =:BILLID ");
			map.put("BILLID", billId);
		}
		if (StringUtils.isNotEmpty(partyName)) {
			condition.append(" AND ").append(IQBOCmGroupPartyValue.S_PartyName).append(" like :PARTYNAME ");
			map.put("PARTYNAME", "%" + partyName + "%");
		}
		String sql = CmCommonUtil.getDynamicSqlByConds(QBOCmGroupPartyBean.class, condition.toString(), map, -1, -1);
		IQBOCmGroupPartyValue[] values = (IQBOCmGroupPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmGroupPartyBean.class, sql, map);
		// IQBOCmGroupPartyValue[] values=(IQBOCmGroupPartyValue[])
		// CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmGroupPartyBean.class, condition.toString(), map, -1,
		// -1);
		if (null != values && values.length > 0) {
			return values;
		}
		return null;
	}

	public IBOCmIndivContactValue[] queryIndivContactsByCustId(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap map = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmIndivContactValue.S_CustId).append(" =:CUSTID ");
			map.put("CUSTID", custId);
		}
		condition.append(" AND ").append(IBOCmIndivContactValue.S_ContType).append(" =:contType");
		map.put("contType", 1);
		String sql = CmCommonUtil.getDynamicSqlByConds(BOCmIndivContactBean.class, condition.toString(), map, -1, -1);
		IBOCmIndivContactValue[] values = (IBOCmIndivContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmIndivContactBean.class, sql, map);
		// IQBOCmGroupPartyValue[] values=(IQBOCmGroupPartyValue[])
		// CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmGroupPartyBean.class, condition.toString(), map, -1,
		// -1);
		if (null != values && values.length > 0) {
			return values;
		}
		return new IBOCmIndivContactValue[0];
	}

	public IBOCmPartyContactValue queryPartyContactByContId(long contId) throws Exception {
		IBOCmPartyContactValue cmContactValue = new BOCmPartyContactBean();
		cmContactValue.setContId(contId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmContactValue);
		return (IBOCmPartyContactValue) dc;
	}

	public IBOCmPartyValue queryCmPartyByPartyId(long partyId) throws Exception {
		IBOCmPartyValue cmContactValue = new BOCmPartyBean();
		cmContactValue.setPartyId(partyId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) cmContactValue);
		return (IBOCmPartyValue) dc;
	}

	public IQBOCmGroupPartyValue[] queryGroupContact(long custId, int contType, int startNum, int endNum) throws Exception {
		StringBuffer condition = new StringBuffer("");
		StringBuffer inheritableCond = new StringBuffer("");// 针对继承逻辑
		Map parameter = new HashMap();
		condition.append(" AND ").append("D.").append(IContactValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		if (contType > 0) {
			condition.append(" AND ").append("D.").append(IContactValue.S_ContType).append(" =:contType ");
			inheritableCond.append(" AND ").append("D.").append(IContactValue.S_ContType).append(" =:contType ");
			parameter.put("contType", contType);
		}
		// 增加继承根集团联系人逻辑
		ICmGroupCustomerSV sv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmGroupOrgStructValue val = sv.queryGroupOrgStructByRelCustId(String.valueOf(custId));
		StringBuilder sql = new StringBuilder();
		if (val.getCustId() == custId) {
			sql = getGroupContactQuerySql(false, condition.toString(), inheritableCond.toString());
		} else {
			sql = getGroupContactQuerySql(true, condition.toString(), inheritableCond.toString());
		}
		String finalSql = CmLnCommonUtil.getQueryResult(sql.toString(), null, startNum, endNum, null);
		IQBOCmGroupPartyValue[] values = (IQBOCmGroupPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmGroupPartyBean.class, finalSql, parameter);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.GROUP_CONTACT_PERSON_QRY, finalSql, parameter, CmConstants.BusiLogType.CONTACT_LOG);
		if (null != values && values.length > 0) {
			IBOBsStaticDataValue staticDataValue = null;
			for (int i = 0; i < values.length; i++) {
				// 设置联系人分类，区分kob同步还是人工创建
				staticDataValue = StaticDataUtil.getStaticData("CM_GROUP_CUST_CONT_TYPE", String.valueOf(values[i].getContType()));
				if (StringUtils.isBlank(staticDataValue.getExternCodeType())) {
					// 空为人工
					values[i].setRemarks(CrmLocaleFactory.getResource("CMS0001258"));
				} else {
					values[i].setRemarks(CrmLocaleFactory.getResource("CMS0001257"));
				}
				// 设置联系人自有还是继承根节点
				if (custId == values[i].getCustId()) {
					values[i].setMemberDesc("Own");
				} else {
					values[i].setMemberDesc("Inherit");
				}
				values[i].setDiaplayAttr("CONT_ADDRESS", "CONT_ADDRESS_NAME", values[i].getContDesc());
			}
			return values;
		}
		return new QBOCmGroupPartyBean[0];
	}

	public int queryGroupContactCount(long custId, int contType) throws Exception {
		StringBuffer condition = new StringBuffer("");
		StringBuffer inheritableCond = new StringBuffer("");// 针对继承逻辑
		Map parameter = new HashMap();
		condition.append(" AND ").append("D.").append(IContactValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		if (contType > 0) {
			condition.append(" AND ").append("D.").append(IContactValue.S_ContType).append(" =:contType ");
			inheritableCond.append(" AND ").append("D.").append(IContactValue.S_ContType).append(" =:contType ");
			parameter.put("contType", contType);
		}
		// 增加继承根集团联系人逻辑
		ICmGroupCustomerSV sv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		IBOCmGroupOrgStructValue val = sv.queryGroupOrgStructByRelCustId(String.valueOf(custId));
		StringBuilder sql = new StringBuilder();
		if (val.getCustId() == custId) {
			sql = getGroupContactQuerySql(false, condition.toString(), inheritableCond.toString());
		} else {
			sql = getGroupContactQuerySql(true, condition.toString(), inheritableCond.toString());
		}
		String finalSql = CmLnCommonUtil.getQueryCount(sql.toString(), null, parameter);
		DataContainer[] dataContainer = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, finalSql, parameter);
		return dataContainer[0].getAsInt("CNT");
	}

	public IBOCmIndivContactValue[] queryIndivContactByIdAndType(long contId, int contType) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap map = new HashMap();
		if (contId > 0) {
			condition.append(" AND ").append(IBOCmIndivContactValue.S_ContId).append(" =:contId ");
			map.put("contId", contId);
		}
		if (contType > 0) {
			condition.append(" AND ").append(IBOCmIndivContactValue.S_ContType).append(" =:contType ");
			map.put("contType", contType);
		}
		String sql = CmCommonUtil.getDynamicSqlByConds(BOCmIndivContactBean.class, condition.toString(), map, -1, -1);
		IBOCmIndivContactValue[] values = (IBOCmIndivContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmIndivContactBean.class, sql, map);
		// IQBOCmGroupPartyValue[] values=(IQBOCmGroupPartyValue[])
		// CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmGroupPartyBean.class, condition.toString(), map, -1,
		// -1);
		if (null != values && values.length > 0) {
			return values;
		}
		return new IBOCmIndivContactValue[0];
	}

	/**
	 * 处理客户与监护人和联系人之间的关系
	 * @param custId
	 * @throws Exception 
	 */
	public void expireCustomerAndContactRela(long custId) throws Exception {
		IBOCmIndivContactValue[] cmIndivContactValues = queryIndivContactsByCustId(custId);
		if(null!=cmIndivContactValues&&cmIndivContactValues.length>0) {
			long partyIdLegal = cmIndivContactValues[0].getPartyId();
			cmIndivContactValues[0].setState(CmConstants.RecordState.ERASE);
			cmIndivContactValues[0].setExpireDate(TimeUtil.getDefaultSysDate());
			BOCmIndivContactBean bean = new BOCmIndivContactBean();
			bean.copy(cmIndivContactValues[0]);
			bean.delete();
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
			
			//失效完客户与监护人关系后，去判断和处理cm_group_contact和cm_indiv_contact,判断是否需要处理cm_party_role角色
			ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
			partyRoleSV.dealPartyRoleForContact(partyIdLegal,2,null);
		}
	}
	
	public IBOCmGroupContactValue[] queryCmGroupContactByPartyId(long partyId) throws Exception {
		
		StringBuilder sqlCondition = new StringBuilder();
		sqlCondition.append("1=1").append(" and ").append(IBOCmGroupContactValue.S_PartyId).append("=:partyId");
		sqlCondition.append(" and ").append(IBOCmGroupContactValue.S_State).append("=:state");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		parameter.put("state", CmConstants.RecordState.USE);
		
		String sql = CmCommonUtil.getDynamicSqlByConds(BOCmGroupContactBean.class, sqlCondition.toString(), parameter, -1, -1);
		IBOCmGroupContactValue[] values = (IBOCmGroupContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				BOCmGroupContactBean.class, sql, parameter);
		return values;
 	}
	
	public IBOCmIndivContactValue[] queryCmIndivContactByPartyId(long partyId) throws Exception {
		StringBuilder sqlCondition = new StringBuilder();
		sqlCondition.append("1=1").append(" and ").append(IBOCmIndivContactValue.S_PartyId).append("=:partyId");
		sqlCondition.append(" and ").append(IBOCmIndivContactValue.S_State).append("=:state");
		Map parameter = new HashMap();
		parameter.put("partyId", partyId);
		parameter.put("state", CmConstants.RecordState.USE);
		
		String sql = CmCommonUtil.getDynamicSqlByConds(BOCmIndivContactBean.class, sqlCondition.toString(), parameter, -1, -1);
		IBOCmIndivContactValue[] values = (IBOCmIndivContactValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(
				BOCmIndivContactBean.class, sql, parameter);
		return values;
	}
	
}

