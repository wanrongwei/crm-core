package com.asiainfo.crm.cm.common.service.impl;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.asiainfo.crm.util.CollectionUtils;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.bce.ivalues.IQBceBusinessAttrValue;
import com.ai.bce.service.interfaces.IBceFrameSV;
import com.ai.bce.util.BceServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.omframe.instance.ivalues.IInsCmRelValue;
import com.ai.oneframe.msg.ivalues.IBORemindValue;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.client.SecframeClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.asiainfo.appframe.ext.exeframe.remote.client.ClientProxy;
import com.asiainfo.appframe.ext.exeframe.task.query.bo.BOCfgTaskBean;
import com.asiainfo.appframe.ext.exeframe.task.query.bo.BOCfgTaskParamValueBean;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskParamValueValue;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskValue;
import com.asiainfo.appframe.ext.exeframe.task.query.service.interfaces.ITaskSV;
import com.asiainfo.appframe.ext.exeframe.ws.client.cache.WsClientCacheImpl;
import com.asiainfo.appframe.ext.exeframe.ws.query.impl.po.CfgWsClient;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmCfgObjectWrapperBean;
import com.asiainfo.crm.cm.common.bo.BOCmCustBadRecordBean;
import com.asiainfo.crm.cm.common.bo.BOCmCustOutMappingBean;
import com.asiainfo.crm.cm.common.bo.BOCmMultThreadDealBean;
import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsHierarchyDealBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsPublicDealBean;
import com.asiainfo.crm.cm.common.bo.BOCmPsTaskDealBean;
import com.asiainfo.crm.cm.common.config.CmConfigLoader;
import com.asiainfo.crm.cm.common.config.bean.CmIdGenerator;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCommonDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgBusiModelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgObjectWrapperValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgSpecListTypeValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTableAttrValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCprRecStatisticValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustBadRecordValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustOutMappingValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmKernelClassCfgValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmMultThreadDealValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsHierarchyDealValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsTaskDealValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmVipScoreRuleValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.common.util.CmVipRuleMappingUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmIndustryConfigValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperFieldRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmOperFieldValue;
import com.asiainfo.crm.cm.dk.bo.BOCmCustPutOnRecordBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmCustPutOnRecordValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsOptinSyncC3Value;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElementValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContMedTypeBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustRequestTaskBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContMedTypeValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnEnter;
import com.asiainfo.crm.cm.ln.common.util.CmLnSmsSend;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.model.bean.VOBusiLogBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmClubServiceSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.common.ivalues.IBOBsOperationValue;
import com.asiainfo.crm.inter.exe.activemq.client.optin.service.interfaces.IOptinSyncC34CrmSV;
import com.asiainfo.crm.so.instance.rboss.service.interfaces.IInsCmRelSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.instance.service.interfaces.ICrmInsFSV;
import com.asiainfo.cs.base.tm.inter.common.remote.CreateAttachment;
import com.asiainfo.cs.base.tm.inter.common.remote.CreateInfo;
import com.asiainfo.cs.base.tm.inter.common.remote.ElemItem;
import com.asiainfo.cs.base.tm.inter.common.remote.ITicketMgrRemote;
import com.asiainfo.cs.base.tm.inter.common.remote.QueryCond;
import com.asiainfo.cs.base.tm.inter.common.remote.QueryResult;
import com.asiainfo.cs.base.tm.inter.common.remote.QueryResultRow;
import com.asiainfo.cs.base.tm.inter.common.remote.SortClause;
import com.asiainfo.push.inter.client.PushClient;

public class CmCommonSVImpl implements ICmCommonSV {

	private static transient Log log = LogFactory.getLog(CmCommonSVImpl.class);

	public IBOCmCfgBusiModelValue[] getAllBusiModels() throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getAllBusiModels();
	}

	public long getNewSequence(Class claz) throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getNewSequence(claz);
	}

	public IBOCmCfgSpecListTypeValue[] getAllCfgSpecListTypes() throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getCfgSpecListTypes(null, null, -1, -1);
	}

	public IBOCmCfgSpecListTypeValue[] getIncompatibleSpecListTypes(int typeId) throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getIncompatibleSpecListTypes(typeId);
	}

	public Timestamp getSysDate() throws Exception {
		return ServiceManager.getIdGenerator().getSysDate();
	}

	public IBOCmCfgTableAttrValue[] getAllCfgTableAttrs() throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getAllCfgTableAttrs();
	}

	public IBOCmCfgObjectWrapperValue[] getAllCfgObjectWrappers() throws Exception {
		BOCmCfgObjectWrapperBean bean = new BOCmCfgObjectWrapperBean();
		bean.setState(CmConstants.RecordState.USE);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { bean }, BOCmCfgObjectWrapperBean.class);
		return (IBOCmCfgObjectWrapperValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), -1,
				-1);
	}

	public long getDoneCode() throws Exception {
		return ServiceManager.getDoneCode();
	}

	public IBOCmCreditMappingValue[] getAllCreditMapping() throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getAllCreditMapping(null, null, -1, -1);
	}

	public void sendSms(String billId, String smsContent) throws Exception {
		CmLnSmsSend.sendSms(billId, smsContent);
	}

	public IBOCmKernelClassCfgValue[] getAllKernelClass() throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getAllKernelClass(null, null, -1, -1);
	}

	public IBOCmIndustryConfigValue[] getAllIndustry() throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getAllIndustry(null, null, -1, -1);
	}

	public IBOCmIndustryConfigValue[] getIndustryByparentId(long parentId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmIndustryConfigValue.S_ParentIndustryId).append(" = :parentIndustryId ");
		parameter.put("parentIndustryId", parentId);
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getIndustryByparentId(condition.toString(), parameter, -1, -1);
	}

	public int getVipLevle(String billId, IQUserBaseInfoValue userBaseInfo) throws Exception {
		if (userBaseInfo == null) {
			// 根据手机号码[{0}]没有查询到用户信息！
			ExceptionUtil.throwBusinessException("CMS5000154", billId);
		}
		long brandId = userBaseInfo.getBrandId();
		int isGlobal = brandId == CmConstants.USER_BRAND.USER_BRAND_GLOBAL ? 1 : 0;
		int curClass = 0; // 除关键人因子外，其他因子计算出来的当前最高级别
		IBOCmVipElementValue[] vipElementValues = CmServiceFactory.getClubServiceSV().queryOtherVipElements(billId, -1);
		if (CmCommonUtil.isNotEmptyObject(vipElementValues)) {
			Arrays.sort(vipElementValues, new Comparator() {

				// 按照级别从小到大排列
				public int compare(Object o1, Object o2) {
					int level1 = ((IBOCmVipElementValue) o1).getMemberLevel();
					int level2 = ((IBOCmVipElementValue) o2).getMemberLevel();
					return level1 - level2;
				}
			});

			if (vipElementValues.length > 1) {
				// 获取当前最高级别的等级(0为没有级别)
				curClass = vipElementValues[0].getMemberLevel() == 0 ? vipElementValues[1].getMemberLevel() : vipElementValues[0].getMemberLevel();
			} else {
				curClass = vipElementValues[0].getMemberLevel();
			}
		}
		// 判断有没有关键人因素
		IBOCmVipElementValue[] keyManElement = CmServiceFactory.getClubServiceSV().queryCmVipElements(billId, -1, CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN);
		if (CmCommonUtil.isEmptyObject(keyManElement)) {
			// 没有关键人因素，直接取因子表中其他7种因子的最高级别
			return curClass;
		}
		int kernelClass = keyManElement[0].getMemberLevel();
		// 否则需要通过规则表来计算VIP等级
		IBOCmKernelClassCfgValue kernelClassCfgValue = CmVipRuleMappingUtil.getOneKernelClassCfg(curClass, kernelClass, isGlobal);
		if (kernelClassCfgValue == null) {
			// 没有对应的规则来计算VIP等级! 如果没有对应规则直接返回最高级别
			return curClass;

		} else if (kernelClassCfgValue.getFinalClass() == 6) {// 如果算出来的VIP级别等于6，则下发短信 add by suntao 2013-1-15
			// String name = SessionManager.getUser().getName();
			// String date = DateTimeUtil.getCurrDate();
			Map msgMap = new HashMap();
			/**
			 * 短信内容：
			 * 尊敬的政企客户代表：您已成为辽宁移动“集团贵宾卡”客户，
			 * 享有免押金开通国际漫游、每年免费5次省内机场“易登机”、信誉度升级等多项专属服务。
			 * 详情请咨询您的客户经理。
			 */
			CmLnSmsSend.sendSmsPendIng(billId, "18000015", msgMap);
		}
		return kernelClassCfgValue.getFinalClass();
	}

	public int getVipLevle4Calc(String billId, IQUserBaseInfoValue userBaseInfo, ICmClubServiceSV clubSv) throws Exception {

		long brandId = userBaseInfo.getBrandId();
		int isGlobal = brandId == CmConstants.USER_BRAND.USER_BRAND_GLOBAL ? 1 : 0;
		int curClass = 0; // 除关键人因子外，其他因子计算出来的当前最高级别
		IBOCmVipElementValue[] vipElementValues = clubSv.queryOtherVipElements(billId, -1);
		if (CmCommonUtil.isNotEmptyObject(vipElementValues)) {
			Arrays.sort(vipElementValues, new Comparator() {

				// 按照级别从小到大排列
				public int compare(Object o1, Object o2) {
					int level1 = ((IBOCmVipElementValue) o1).getMemberLevel();
					int level2 = ((IBOCmVipElementValue) o2).getMemberLevel();
					return level1 - level2;
				}
			});
			if (vipElementValues.length > 1) {
				// 获取当前最高级别的等级(0为没有级别)
				curClass = vipElementValues[0].getMemberLevel() == 0 ? vipElementValues[1].getMemberLevel() : vipElementValues[0].getMemberLevel();
			} else {
				curClass = vipElementValues[0].getMemberLevel();
			}
		}
		// 判断有没有关键人因素
		IBOCmVipElementValue[] keyManElement = clubSv.queryCmVipElements(billId, -1, CmConstants.VIP_ELEMENT_TYPE.VIP_ELEMENT_KEYMAN);
		if (CmCommonUtil.isEmptyObject(keyManElement)) {
			// 没有关键人因素，直接取因子表中其他7种因子的最高级别
			return curClass;
		}
		int kernelClass = keyManElement[0].getMemberLevel();
		// 否则需要通过规则表来计算VIP等级
		IBOCmKernelClassCfgValue kernelClassCfgValue = CmVipRuleMappingUtil.getOneKernelClassCfg(curClass, kernelClass, isGlobal);
		if (kernelClassCfgValue == null) {
			// 没有对应的规则来计算VIP等级! 如果没有对应规则直接返回最高级别
			return curClass;
		}
		return kernelClassCfgValue.getFinalClass();
	}

	public IBOCmVipScoreRuleValue[] getCmVipScoreRuleClass() throws Exception {
		ICmCommonDAO commonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		return commonDAO.getCmVipScoreRuleClass();
	}

	public boolean hasSecForQry(long userId, String billId, long custId, String regionId, String curRegionId, long operId) throws Exception {
		// if (userId <= 0 && StringUtils.isBlank(billId) && custId <= 0) {
		// // 输入参数全部为空，请检查！
		// ExceptionUtil.throwBusinessException("CMS5000085");
		// }
		// // 获取全省地市
		// long provinceDistrictId = DistrictUtil.getRegion()[0].getParentDistrictId();
		// String provinceCode = DistrictUtil.getDistrictByDistrictId(provinceDistrictId).getRegionId(); // 鍏ㄧ渷鍦板競
		//
		// //传入的操作员地市为省地市就直接返回true
		// if(provinceCode.equals(opRegionId)){
		// return true;
		// }
		//
		// long opId = ServiceManager.getUser().getID();
		// String curRegionId = ServiceManager.getUser().get("REGION_ID").toString();// 鑾峰彇褰撳墠鎿嶄綔鍛樼殑鍦板競
		//
		// IBOSecOrganizeValue[] getSecOrgValues = OrgmodelClient.getStationsByOperId(opId);
		// if(CmCommonUtil.isNotEmptyObject(getSecOrgValues)){
		// String tempRegion = "";
		// for(int i=0,len=getSecOrgValues.length;i<len;i++){
		// tempRegion =
		// DistrictUtil.getDistrictByDistrictId(Long.valueOf(getSecOrgValues[i].getDistrictId())).getRegionId();
		// //其中只要有一个归属组织为400地市就直接返回
		// if(provinceCode.equals(tempRegion)){
		// return true;
		// }
		// }
		// }

		// 校验权限
		ISec2CmSV iSec2CmSV = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		boolean hasProvin = iSec2CmSV.queryExistsEntId(operId, CmLnEnter.enterUserSpeuser.CUST_MANAGER_PROVINCE_ENTID);

		boolean result = false;
		// 如果有省权限，直接返回true
		if (hasProvin) {
			result = true;
		} else {
			// 否则就校验当前操作员和查询的客户是否归属同一地市
			String custRegionId = regionId;

			// 如果接口有传客户或者用户归属地市，则不需要再查询
			if (StringUtils.isBlank(custRegionId)) {
				if (userId > 0) {
					custRegionId = CenterUtil.getRegionIdByUserId(userId);
				} else if (StringUtils.isNotBlank(billId)) {
					custRegionId = CenterUtil.getRegionIdByBillId(billId);
				} else {
					ICustomerValue customer = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
					if (customer == null) {
						// 根据客户编号[{0}],没有查询到客户
						ExceptionUtil.throwBusinessException("SOS2000185", String.valueOf(custId));
					}
					custRegionId = customer.getRegionId();
				}
			}

			if (StringUtils.isNotBlank(custRegionId) && custRegionId.equals(curRegionId)) {
				result = true;
			}
		}
		return result;
	}

	public DataContainer[] queryFieldDefine(long busiId, String userParam) throws Exception {
		// 首先解析自定义参数
		Map userParams = CmCommonUtil.getUserParams(userParam);
		// 调用bce接口查询数据
		// IBceFrameSV frameSV = (IBceFrameSV)ServiceFactory.getService(IBceFrameSV.class);
		IBceFrameSV frameSV = BceServiceFactory.getBceFrameSV();
		IQBceBusinessAttrValue[] atrrs = frameSV.getQBceBusinessAttrsByBusinessId(busiId, userParams, null);

		// 数据对象转换
		DataContainer[] result = null;
		if (atrrs == null || atrrs.length == 0) {
			result = new DataContainer[0];
		} else {
			List tmpList = new ArrayList();
			DataContainer oneRecord = null;
			for (int i = 0, len = atrrs.length; i < len; i++) {
				if (atrrs[i].getFormId().startsWith("frm")) {
					oneRecord = new DataContainer();
					oneRecord.set(IQBOCmOperFieldValue.S_BceFrameId, Long.valueOf(atrrs[i].getBceFrameId()));
					oneRecord.set(IQBOCmOperFieldValue.S_BceFormId, atrrs[i].getFormId());
					oneRecord.set(IQBOCmOperFieldValue.S_FieldName, atrrs[i].getAttrCode());
					oneRecord.set("FIELD_TEXT", atrrs[i].getAttrName());
					tmpList.add(oneRecord);
				}
			}
			result = (DataContainer[]) tmpList.toArray(new DataContainer[0]);
		}

		return result;
	}

	public DataContainer[] queryOperField(long operId, long tabId, long busiId, String userParam) throws Exception {
		DataContainer[] result = null;

		ICmCommonDAO cmCommonDAO = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		IBOCmOperFieldRelValue[] fieldRelValues = cmCommonDAO.queryOperField(operId, tabId);

		if (fieldRelValues == null || fieldRelValues.length == 0) {
			result = queryFieldDefine(busiId, userParam);
		} else {
			result = CmCommonUtil.getDataContainers(fieldRelValues, null);
		}

		return result;
	}

	public long getAcctId(BOCmAccountBean accountBean) throws Exception {
		DataContainerInterface dc = DataContainerFactory.createDataContainerInstance(BOCmAccountBean.class, null);
		dc.set("REGION_ID", CmCommonUtil.generateRegionId());
		return CmCommonUtil.getNewSequence(dc);
	}

	public long getCustId(int custType) throws Exception {
		IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CUST_TYPE, String.valueOf(custType));
		DataContainerInterface dc = DataContainerFactory.createDataContainerInstance(Class.forName(staticDataValue.getExternCodeType().trim()), null);
		dc.set("REGION_ID", CmCommonUtil.generateRegionId());
		return CmCommonUtil.getNewSequence(dc);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV#createImmediateTask(java.lang.String,
	 * java.lang.String, java.lang.String, java.util.Map)
	 */
	public long createImmediateTask(String taskName, String cfgTaskTypeCode, String businessClass, Map param) throws Exception {
		ITaskSV taskSV = (ITaskSV) ServiceFactory.getService(ITaskSV.class);
		long cfgTaskId = 0;
		// IBOCfgTaskValue[] taskValues = taskSV.getCfgTaskByTaskType(cfgTaskTypeCode, 1, 0);
		// if (taskValues != null && taskValues.length > 0) {
		// for (int i = 0; i < taskValues.length; i++) {
		// if (businessClass.equals(taskValues[i].getBusinessClass())) {
		// cfgTaskId = taskValues[i].getCfgTaskId();
		// break;
		// }
		// }
		// if (cfgTaskId > 0) {
		// return cfgTaskId;
		// }
		// }
		IBOCfgTaskValue taskValue = new BOCfgTaskBean();
		taskValue.setCfgTaskId(cfgTaskId);
		taskValue.setTaskName(taskName);
		taskValue.setCfgTaskTypeCode(cfgTaskTypeCode);
		taskValue.setBusinessClass(businessClass);
		taskValue.setTaskMethod("I");
		taskValue.setStaffId(ServiceManager.getUser().getID());
		taskValue.setCreateDate(ServiceManager.getOpDateTime());
		taskValue.setState("U");
		taskValue.setStateDate(ServiceManager.getOpDateTime());
		List paramList = new ArrayList();
		if (!param.isEmpty()) {
			Iterator iter = param.keySet().iterator();
			while (iter.hasNext()) {
				long key = Long.parseLong(iter.next().toString());
				IBOCfgTaskParamValueValue paramValue = new BOCfgTaskParamValueBean();
				paramValue.setParamId(key);
				paramValue.setParamValue(param.get(key).toString());
				paramList.add(paramValue);
			}
		}
		cfgTaskId = taskSV.insertTask(taskValue, (IBOCfgTaskParamValueValue[]) paramList.toArray(new IBOCfgTaskParamValueValue[] {}));
		// taskValues = taskSV.getCfgTaskByTaskType(cfgTaskTypeCode, 1, 0);
		// if(taskValues != null && taskValues.length > 0){
		// for(int i=0; i<taskValues.length; i++){
		// if(businessClass.equals(taskValues[i].getBusinessClass())){
		// cfgTaskId = taskValues[i].getCfgTaskId();
		// break;
		// }
		// }
		// return cfgTaskId;
		// }
		return cfgTaskId;
	}

	public IBOCmCustBadRecordValue[] queryCustBadInformation(long custId, int startIndex, int endIndex) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustBadRecordValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmCustBadRecordValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.RecordState.USE);
		//TELENOR_DEFECT_20171010_0012 返回时间大于当前的时间的记录，代码已在61上传，没有进行回退，62发
		condition.append(" AND ").append(IBOCmCustBadRecordValue.S_DeletionDate).append(" > NOW() ");
 
		return (IBOCmCustBadRecordValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustBadRecordBean.class, condition.toString(), parameter, startIndex, endIndex);
	}

	public int queryCustBadInformationCount(long custId) throws Exception {
		return queryCustBadInfo(custId, -1, -1).length;
	}

	public IBOCmCustBadRecordValue[] queryDeleteCustBadInformation(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustBadRecordValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" AND ").append(IBOCmCustBadRecordValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.RecordState.ERASE);
		return (IBOCmCustBadRecordValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustBadRecordBean.class, condition.toString(), parameter, -1, -1);
	}

	public IBOCmCustBadRecordValue[] queryCustBadInfo(long custId, int startIndex, int endIndex) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustBadRecordValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		return (IBOCmCustBadRecordValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustBadRecordBean.class, condition.toString(), parameter, startIndex, endIndex);
	}
	
	public IBOCmCustPutOnRecordValue[] queryCustPutOnInfo(long custId, int startIndex, int endIndex) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustPutOnRecordValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		return (IBOCmCustPutOnRecordValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustPutOnRecordBean.class, condition.toString(), parameter, startIndex, endIndex);
	}

	public void savePsOptinC3Info(IBOCmPsOptinSyncC3Value[] values) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(values)) {
			for (int i = 0; i < values.length; i++) {
				String country = "";
				// 设置国家编码信息
				IBOBsStaticDataValue staticValue = StaticDataUtil.getStaticData("CM_COUNTRY_C3", TenantIDFactory.getTenant());
				if (CmCommonUtil.isNotEmptyObject(staticValue)) {
					country = staticValue.getCodeName();
				}
				IOptinSyncC34CrmSV service = (IOptinSyncC34CrmSV) ServiceFactory.getService(IOptinSyncC34CrmSV.class);
				service.optinSyncRealtime(values[i].getBillId(), 1L, country, values[i].getAction());
			}
		}
	}

	public IBOCmCustContMedTypeValue[] queryContMedTypeInfo(long contMedTypeId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContMedTypeValue.S_ContMedTypeId).append(" =:contMedTypeId ");
		parameter.put("contMedTypeId", contMedTypeId);
		return (IBOCmCustContMedTypeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContMedTypeBean.class, condition.toString(), parameter, -1, -1);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV#getCommonNewSequence(java.lang.Class)
	 */
	public long getCommonNewSequence(Class claz) throws Exception {
		// 先执行特殊对象序列生成规则，如果没有配置特殊序列生成规则，则默认情况使用cfg_id_generator的配置生成主键。
		// 特殊对象如客户、账户等。
		// 对象序列号生成器目前是配置在静态数据表中的，静态数据编码为CM_OBJECT_ID_GENERATOR。
		CmIdGenerator idGenerator = CmConfigLoader.getInstance().getIdGenerator(claz);
		if (log.isDebugEnabled()) {
			log.debug(idGenerator);
		}
		if (idGenerator != null && idGenerator.getService() != null) {
			// 先验证参数是否配置正确
			idGenerator.validate();
			String serviceName = StringUtils.trim(idGenerator.getService().getName());
			String methodName = StringUtils.trim(idGenerator.getMethod().getName());
			Class[] paramClasses = null;
			Object[] paramObjects = null;
			Object svObject = null;
			// 如果是标准服务，则直接通过ServiceFactory获取
			if (serviceName.endsWith("SV")) {
				svObject = ServiceFactory.getService(serviceName);
			} else {
				// 否则通过获取本地服务，如果获取不到则认为该类是通过静态方法的方式调用，不需要获取服务实例。
				if (StringUtils.equals(idGenerator.getService().getModifier(), CmIdGenerator.Service.MODIFIER_PUBLIC)) {
					svObject = ServiceFactory.getSeviceOfLocal(serviceName);
				} else {
					svObject = null;
				}
			}
			// 获取服务定义的方法
			Method generatorMethod = null;
			if (svObject != null) {
				generatorMethod = svObject.getClass().getDeclaredMethod(StringUtils.trim(methodName), paramClasses);
			} else {
				generatorMethod = Class.forName(serviceName).getDeclaredMethod(StringUtils.trim(methodName), paramClasses);
			}
			// 动态调用获取序列的方法
			Object id = generatorMethod.invoke(svObject, paramObjects);
			if (id != null) {
				return DataType.getAsLong(id);
			} else {
				// 生成序列号错误：调用类[{0}]的方法[{1}]返回了空对象！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000366"));
				}
				ExceptionUtil.throwBusinessException("CMS0000366");
			}
		}
		/*
		 * 默认情况使用cfg_id_generator的配置生成主键
		 */
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		return commonSV.getNewSequence(claz);
	}

	public long getCommonNewSequence(String tableName) throws Exception {
		return DataType.getAsLong(ServiceManager.getIdGenerator().getNewId(tableName));
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV#CreateTicketForCM(java.util.Map)
	 */
	public String CreateTicketForCM(Map map) throws Exception {
		if (!map.isEmpty()) {
			String custId = null;
			String errorCode = null;
			String errorMsg = null;
			String srcSystem = null;
			String errorExtInfo = null;
			// Check Parameters
			if (map.containsKey("CUST_ID")) {
				custId = (String) map.get("CUST_ID");
				if (StringUtils.isBlank(custId)) {
					ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "CUST_ID" });
				}
			} else {
				ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "CUST_ID" });
			}

			if (map.containsKey("ERROR_CODE")) {
				errorCode = (String) map.get("ERROR_CODE");
				if (StringUtils.isBlank(errorCode)) {
					ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "ERROR_CODE" });
				}
			} else {
				ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "ERROR_CODE" });
			}

			if (map.containsKey("ERROR_MESSAGE")) {
				errorMsg = (String) map.get("ERROR_MESSAGE");
				if (StringUtils.isBlank(errorMsg)) {
					ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "ERROR_MESSAGE" });
				}
			} else {
				ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "ERROR_MESSAGE" });
			}

			if (map.containsKey("SOURCE_SYSTEM")) {
				srcSystem = (String) map.get("SOURCE_SYSTEM");
				if (StringUtils.isBlank(srcSystem)) {
					ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "SOURCE_SYSTEM" });
				}
			} else {
				ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "SOURCE_SYSTEM" });
			}

			if (map.containsKey("ERROR_EXT_INFO")) {
				errorExtInfo = (String) map.get("ERROR_EXT_INFO");
			}
			// 创建工单结构体
			CreateInfo createInfo = new CreateInfo();

			// 创建人，租户Id(必填）
			if (null != ServiceManager.getUser()) {
				createInfo.setOpCode(ServiceManager.getUser().getCode());
			} else {
				createInfo.setOpCode("21PA1TSM");
			}
			createInfo.setTenantId(TenantIDFactory.getTenant());

			// 工单类型 CM填写010开头的编码
			if (map.containsKey("TICKET_TYPE")) {
				createInfo.setTickeType(String.valueOf(map.get("TICKET_TYPE")));
			} else {
				createInfo.setTickeType("012");
			}

			// 外系统编码 CM填写CM101
			createInfo.setSysCode("CM101");

			// 塞上custId
			createInfo.setCustId(custId);
			// 如果是纯payer，TT要求在failnum塞入partyId
			createInfo.setFailureNum(custId);
			// 构建CM特殊投诉单特殊属性
			List<ElemItem> elemItemList = new ArrayList<ElemItem>();
			ElemItem elemItem = new ElemItem();
			// elemItem.setName("CUST_ID");
			// elemItem.setValue(custId);
			// elemItemList.add(elemItem);
			// elemItem = new ElemItem();
			elemItem.setName("ERROR_CODE");
			elemItem.setValue(errorCode);
			elemItemList.add(elemItem);
			elemItem = new ElemItem();
			elemItem.setName("ERROR_MESSAGE");
			elemItem.setValue(errorMsg);
			elemItemList.add(elemItem);
			elemItem = new ElemItem();
			elemItem.setName("SOURCE_SYSTEM");
			elemItem.setValue(srcSystem);
			elemItemList.add(elemItem);
			if (StringUtils.isNotBlank(errorExtInfo)) {
				elemItem = new ElemItem();
				elemItem.setName("ERROR_EXT_INFO");
				elemItem.setValue(errorExtInfo);
				elemItemList.add(elemItem);
			}
			createInfo.setElemItemList(elemItemList);

			createInfo.setCreateAttachmentList(new ArrayList<CreateAttachment>());
			// 创建投诉单
			String SerialNo = getTicketMgrRemote().createTicket(createInfo);
			log.info("testCreateTicketForNp complete,SerialNo is :" + SerialNo + ".");

			return SerialNo;
		} else {
			ExceptionUtil.throwBusinessException("CMS0000360", new String[] { "map" });
		}
		return null;
	}

	/**
	 * 获取remote接口
	 * 
	 * @return
	 * @author yangjh
	 * @date 2014-12-15 下午03:50:41
	 */
	private ITicketMgrRemote getTicketMgrRemote() {
		try {
			return (ITicketMgrRemote) ClientProxy.getObject(ITicketMgrRemote.class);
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV#queryTicketListForCm(long, java.lang.String,
	 * java.lang.String, java.lang.String, int, int)
	 */
	public DataContainer[] queryTicketListForCm(long custId, String SrcType, String errorCode, String strDate, String endDate, int strIdx, int endIdx) throws Exception {
		// 初始化查询条件类
		QueryCond queryCond = new QueryCond();

		// 租户和查询人员条件（必填）
		queryCond.setTenantId(TenantIDFactory.getTenant());
		// queryCond.setOpCode(ServiceManager.getUser().getCode());

		// 工单分类条件，查询具体大类数据的基本条件（必填）
		queryCond.setTicketCategory("TM_CM_TICKET");

		// 分页条件（可选）
		if (strIdx > -1 && endIdx > -1) {
			queryCond.setPagetStartIndex(strIdx);
			queryCond.setPageSize(endIdx + 1 - strIdx);
		} else {
			queryCond.setPagetStartIndex(-1);
			queryCond.setPageSize(1000);
		}

		// 工单基本条件（工单流水号、工单类型、时间范围等）（可选）
		queryCond.setTicketType("012"); // 前匹配模式
		if (StringUtils.isNotBlank(strDate)) {
			queryCond.setCreateDateStart(strDate);
		}
		if (StringUtils.isNotBlank(endDate)) {
			queryCond.setCreateDateEnd(endDate);
		}

		// 排序条件（可选）
		List<SortClause> sortClauseList = new ArrayList<SortClause>();
		SortClause sortClause = SortClause.asc("CREATE_DATE");
		sortClauseList.add(sortClause);

		sortClause = SortClause.desc("LAST_MODIFIED_DATE");
		sortClauseList.add(sortClause);
		// 追加查询条件
		queryCond.setSortClauseList(sortClauseList);
		List<ElemItem> elemItemList = new ArrayList<ElemItem>();
		if (custId > 0) {
			ElemItem elemItem = new ElemItem();
			elemItem.setName("CUST_ID");
			elemItem.setValue(String.valueOf(custId));
			elemItemList.add(elemItem);
		}

		if (StringUtils.isNotBlank(SrcType)) {
			ElemItem elemItem = new ElemItem();
			elemItem.setName("SOURCE_SYSTEM");
			elemItem.setValue(SrcType);
			elemItemList.add(elemItem);

		}

		if (StringUtils.isNotBlank(errorCode)) {
			ElemItem elemItem = new ElemItem();
			elemItem.setName("ERROR_CODE");
			elemItem.setValue(errorCode);
			elemItemList.add(elemItem);

		}

		// 追加查询元素
		if (!elemItemList.isEmpty()) {
			queryCond.setElemItemList(elemItemList);
		}

		// 发起查询
		QueryResult queryResult = getTicketMgrRemote().queryTicketList(queryCond);
		List<QueryResultRow> reultList = queryResult.getQueryResultList();
		DataContainer[] dc = null;
		if (!reultList.isEmpty()) {
			dc = new DataContainer[reultList.size()];
			List<ElemItem> elementList = null;
			String eleName = null;
			String eleValue = null;
			int i = 0;
			for (QueryResultRow queryResultRow : reultList) {
				dc[i] = new DataContainer();
				dc[i].set("SHOW_SERIAL_NO", queryResultRow.getShowSerialNo());
				dc[i].set("CREATE_DATE", queryResultRow.getCreateDate());
				elementList = queryResultRow.getElemItemList();
				for (ElemItem elementItem : elementList) {
					eleName = elementItem.getName();
					eleValue = elementItem.getValue();
					dc[i].set(eleName, eleValue);
				}
				if (dc[i].hasProperty("ERROR_EXT_INFO")) {
					if (dc[i].get("ERROR_EXT_INFO").equals("null")) {
						dc[i].set("ERROR_EXT_INFO", "");
					}
				}
				String detail = "<a href=\"javascript:void(0)\" class=\"cellpath\" onclick=\"openCmTTDetail(" + i
						+ ")\" style=\"color:blue;margin-left:5px;text-decoration:underline\" >" + CrmLocaleFactory.getResource("CCS0000167") + "</a>";
				dc[i].set("ACTION", detail);
				i++;
			}
			return dc;
		}

		return new DataContainer[0];

	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV#queryTicketListCountForCm(long, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public int queryTicketListCountForCm(long custId, String SrcType, String errorCode, String strDate, String endDate) throws Exception {
		// 初始化查询条件类
		QueryCond queryCond = new QueryCond();

		// 租户和查询人员条件（必填）
		queryCond.setTenantId(TenantIDFactory.getTenant());
		// queryCond.setOpCode(ServiceManager.getUser().getCode());

		// 工单分类条件，查询具体大类数据的基本条件（必填）
		queryCond.setTicketCategory("TM_CM_TICKET");

		// 工单基本条件（工单流水号、工单类型、时间范围等）（可选）
		queryCond.setTicketType("012"); // 前匹配模式
		if (StringUtils.isNotBlank(strDate)) {
			queryCond.setCreateDateStart(strDate);
		}
		if (StringUtils.isNotBlank(endDate)) {
			queryCond.setCreateDateEnd(endDate);
		}

		// 分页条件（可选）
		queryCond.setPagetStartIndex(-1);
		queryCond.setPageSize(1000);

		// 排序条件（可选）
		List<SortClause> sortClauseList = new ArrayList<SortClause>();
		SortClause sortClause = SortClause.asc("CREATE_DATE");
		sortClauseList.add(sortClause);

		sortClause = SortClause.desc("LAST_MODIFIED_DATE");
		sortClauseList.add(sortClause);
		// 追加查询条件
		queryCond.setSortClauseList(sortClauseList);
		List<ElemItem> elemItemList = new ArrayList<ElemItem>();
		if (custId > 0) {
			ElemItem elemItem = new ElemItem();
			elemItem.setName("CUST_ID");
			elemItem.setValue(String.valueOf(custId));
			elemItemList.add(elemItem);
		}

		if (StringUtils.isNotBlank(SrcType)) {
			ElemItem elemItem = new ElemItem();
			elemItem.setName("SOURCE_SYSTEM");
			elemItem.setValue(SrcType);
			elemItemList.add(elemItem);

		}

		if (StringUtils.isNotBlank(errorCode)) {
			ElemItem elemItem = new ElemItem();
			elemItem.setName("ERROR_CODE");
			elemItem.setValue(errorCode);
			elemItemList.add(elemItem);

		}

		// 追加查询元素
		if (!elemItemList.isEmpty()) {
			queryCond.setElemItemList(elemItemList);
		}

		// 发起查询
		QueryResult queryResult = getTicketMgrRemote().queryTicketList(queryCond);
		if (queryResult != null) {
			return queryResult.getTotalCount();
		}

		return 0;
	}

	public CfgWsClient getCfgWsClientByCode(String code) throws Exception {
		CfgWsClient objCfgWsClient = (CfgWsClient) CacheFactory.get(WsClientCacheImpl.class, (new StringBuilder()).append("C^").append(code).toString());
		return objCfgWsClient;
	}

	public void saveCmCprRecStatistic(IBOCmCprRecStatisticValue value) throws Exception {
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) value);
	}

	public void unsubscribePhoneBook(long custId) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmCustRequestTaskSV requestService = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
		// 退订phonebook
		requestService.saveCustAKSInfo(custValue, CmConstants.PsPublicAction.PHONE_NUM_HIDE);
	}

	public void savePsPublicInfo(ICustomerValue custValue, int action, long userId) throws Exception {
		IBOCmPsPublicDealValue psPublicValue = new BOCmPsPublicDealBean();
		// 插入基本信息（必填参数）
		psPublicValue.setRecordId(CmCommonUtil.getNewSequence(BOCmPsPublicDealBean.class));
		psPublicValue.setEntityType(CmConstants.EntityType.CUSTOMER);
		psPublicValue.setEntityId(custValue.getCustId());
		psPublicValue.setPartyId(custValue.getPartyId());
		psPublicValue.setExecAction(action);
		if (userId > 0) {
			psPublicValue.setPsParam(String.valueOf(userId));
		}
		psPublicValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		psPublicValue.setState(CmConstants.RecordState.USE);
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) psPublicValue);
	}

	public void savePsPublic(long entityId, int action, String psParam) throws Exception {
		if (entityId > 0 && action > 0 && StringUtils.isNotBlank(psParam)) {
			IBOCmPsPublicDealValue psPublicValue = new BOCmPsPublicDealBean();
			psPublicValue.setRecordId(CmCommonUtil.getNewSequence(BOCmPsPublicDealBean.class));
			psPublicValue.setEntityType(CmConstants.EntityType.CUSTOMER);
			psPublicValue.setEntityId(entityId);
			psPublicValue.setPartyId(entityId);
			psPublicValue.setExecAction(action);
			psPublicValue.setPsParam(psParam);
			psPublicValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			psPublicValue.setState(CmConstants.RecordState.USE);
			CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) psPublicValue);
		} else {
			ExceptionUtil.throwBusinessException("The param is not correct");
		}
	}

	@Override
	public void saveCmLifeCycle(long userId, long custId, long oldCustId, int action) throws Exception {
		// 针对91租户，不处理客户生命周期
		if (TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_91)) {
			return;
		}
		if(log.isInfoEnabled()) {
			log.info("==============================saveCmLifeCycle  action="+action);
		}
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		if (action == 1) {
			// 个人客户开户/预销户重入网
			IBOCmInsCmrelValue[] insValues = service.queryCmInsByUserIdAndCustId(custId, userId, CmConstants.RelaType.OWNER);
			if (CmCommonUtil.isNotEmptyObject(insValues)) {
				service.dealDeleteCustUserRel(insValues[0].getCustId(), insValues[0].getUserId());
				service.dealCreateIndivCustomer(custId, userId, "Y");
			} else {
				// 如果为空则需要建立客户用户关系
				service.dealCreateIndivCustomer(custId, userId, "Y");
				CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
				IInsCmRelSV crmInsFSV = (IInsCmRelSV) ServiceFactory.getService(IInsCmRelSV.class);
				IInsCmRelValue insCmRelValue = crmInsFSV.queryInsCmRel(userId, -1, CmConstants.RelaType.USER, CmConstants.CmInsRela.NORMAL);
				// 创建一个默认的使用者
				if (!CmCommonUtil.isNotEmptyObject(insCmRelValue)) {
					// 如果已经存在使用者则不需要在创建
					service.dealCreateDefaultUser(custId, userId, "Y");
				}
			}
			ICustomerValue custValue = service.queryCustomerByCustId(custId);
			if (custValue.getCustStatus() != CmConstants.CustomerStatus.INDIV_ACTIVE) {
				custValue.setCustStatus(CmConstants.CustomerStatus.INDIV_ACTIVE);
				service.saveCustomer(custValue);
			}
			// 纯user在客户用户关系表有使用时才送CPR订购
			dealSendPureUser(custId, userId, service);
			// 送C3
			service.dealSendToC3(custId, userId, CmConstants.sendToC3Action.ADD);
			// 订购聋哑offer
			ifOrderOffer(custId, userId);
			// 对于营销免打扰的逻辑
			sendCommercialProToUip(custId, userId);
		} else if (action == 2) {
			// 集团签合同
			ICustomerValue value = service.queryCustomerByCustId(custId);
			value.setCustStatus(CmConstants.CustomerStatus.GROUP_ACTIVE);
			BOLnCmxGroupCustBean groupCustBean = new BOLnCmxGroupCustBean();
			groupCustBean.copy(value);
			groupCustBean.setExt25(CmConstants.YesOrNo.YES);
			IVOCustValue custValue = new VOCustBean();
			custValue.setUserObject("cmxGrpCust", groupCustBean);
			custValue.setCustomer(value);
			service.saveCustomer(custValue);
		} else if (action == 3) {
			// 1 个人用户过户到个人客户
			// if (CmCommonUtil.getCustType(custId)==1 && CmCommonUtil.getCustType(oldCustId) == 1) {
			// service.dealIndivUserToIndivCust(custId, oldCustId,userId);
			// }
			// 2 个人用户过户到集团客户
			// if (CmCommonUtil.getCustType(custId)==3 && CmCommonUtil.getCustType(oldCustId) == 1) {
			// service.dealIndivUserToGroupCust(custId, userId,oldCustId);
			// }
			// 3 集团用户过户到个人客户
			// if (CmCommonUtil.getCustType(custId)==1 && CmCommonUtil.getCustType(oldCustId) == 3) {
			// service.dealGroupUserToIndivCust(custId,userId,oldCustId);
			// }
			// 4 集团用户过户到集团客户
			// if (CmCommonUtil.getCustType(custId)==3 && CmCommonUtil.getCustType(oldCustId) == 3) {
			// service.dealGroupUserToGroupCust(custId, userId, oldCustId);
			// }
			// 订购聋哑offer
			// ifOrderOfferForTransferCust(custId,oldCustId,userId);
			// 退订phoneBook
			// unSubscribePhoneBook(custId,oldCustId,userId);
			// 关于默认使用者的分配
			// dealAssignUsers(custId,oldCustId,userId);
		} else if (action == 4) {
			if (!(TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_91))) {
				// 欠费停机
				service.dealShutDownCust(custId, userId, CmCommonUtil.getCustType(custId), oldCustId);
			}
		} else if (action == 5) {
			if (!(TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_91))) {
				// 其他停机
				if(log.isInfoEnabled()) {
					log.info("==============================saveCmLifeCycle other suspend custId=" + custId);
				}
				service.dealShutDownCust(custId, userId, CmCommonUtil.getCustType(custId), oldCustId);
			}
		} else if (action == 6) {
			// 开机
			service.dealStartMachine(custId, CmCommonUtil.getCustType(custId));
		} else if (action == 7) {
			// 预销户(91租户不变更状态)
			if (!(TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_91))) {
				if(log.isInfoEnabled()) {
					log.info("==============================saveCmLifeCycle  oldCustId="+oldCustId);
					log.info("==============================saveCmLifeCycle  custId="+custId);
					log.info("==============================saveCmLifeCycle  userId="+userId);
				}
				service.dealValidateUser(custId, userId, oldCustId);
			}
		} else if (action == 8) {
			// 集团合同到期
			if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.GROUP) {
				ICustomerValue value = service.queryCustomerByCustId(custId);
				value.setCustStatus(CmConstants.CustomerStatus.GROUP_INACTIVE);
				value.setQqNo(DataType.getAsString(oldCustId));
				service.saveCustomer(value);
			}
		} else if (action == 9) {
			// 销户(91租户只删除客户用户关系，不变更状态)
			if (!(TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_91))) {
				service.dealValidateUser(custId, userId, oldCustId);
			}
			// 只要跟该号码有关的归属者或者使用者都要置为失效
			service.dealDeleteUserAndOwner(custId, userId);
			if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
				// 送C3退订
				service.dealSendToC3(custId, userId, CmConstants.sendToC3Action.DELETE);
			}
		}
	}

	/**
	 * AI-13869 Pure user,there is no number list under the pure user,shouldn't send CPR subscription.
	 *
	 * @param custId
	 * @param userId
	 * @param service
	 */
	private void dealSendPureUser(long custId, long userId, ICmCustomerSV service) {
		try {
			log.info("saveCmLifeCycle dealSendPureUser begin custId:" + custId + ",userId:" + userId);
			IInsCmRelSV crmInsFSV = (IInsCmRelSV) ServiceFactory.getService(IInsCmRelSV.class);
			IInsCmRelValue insCmRelValue = crmInsFSV.queryInsCmRel(userId, -1, CmConstants.RelaType.USER, CmConstants.CmInsRela.NORMAL);
			// 使用者与拥有者不是同一用户
			if (insCmRelValue != null && custId != insCmRelValue.getCustId()) {
				long pureUserCustId = insCmRelValue.getCustId();
				ICustomerValue value = service.queryCustomerByCustId(pureUserCustId);
				// 纯user
				if (value != null && StringUtils.equals(value.getIndivCustType(), String.valueOf(CmConstants.EntityType.USER))) {
					ICmCustRequestTaskSV taskSV = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
					IBOCmCustRequestTaskValue[] taskValues = taskSV.queryByCustId(pureUserCustId);
					// 如果先有其他角色已经插了工单，创建使用者就不能再插入工单了
					if (taskValues == null || taskValues.length < 1) {
						taskSV.saveCustRequestTaskInfo(custId, CmConstants.RequestType.ADD, CmConstants.RequestStatus.pending);
					}
				}
			}
		} catch (Exception e) {
			log.error("saveCmLifeCycle dealSendPureUser occur exception.", e);
		}
	}

	/*
	 * 判断是否订购聋哑人offer
	 */
	private void ifOrderOffer(long custId, long userId) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
		if (custValue.getPhysiologicalState() > CmConstants.PhysiologicalState.NormalPerson) {
			// 要订购聋哑人offer
			custSV.orderForUnormalPerson(userId);
		}
	}

	/*
	 * 过户时判断是否订购聋哑offer
	 */
	private void ifOrderOfferForTransferCust(long custId, long oldCustId, long userId) throws Exception {
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		int custType = CmCommonUtil.getCustType(custId);
		int oldCustType = CmCommonUtil.getCustType(oldCustId);
		int state = custSV.queryCustomerByCustId(custId).getPhysiologicalState();
		int oldState = custSV.queryCustomerByCustId(oldCustId).getPhysiologicalState();
		if (custType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人过给个人
			if (oldState == CmConstants.PhysiologicalState.NormalPerson && state > CmConstants.PhysiologicalState.NormalPerson) {
				// 需要订购聋哑人offer
				custSV.orderForUnormalPerson(userId);
			}
		} else if (custType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.GROUP) {
			// 集团过给个人
			if (state > CmConstants.PhysiologicalState.NormalPerson) {
				// 需要订购聋哑人offer
				custSV.orderForUnormalPerson(userId);
			}
		}
	}

	/*
	 * 过户时判断是否退订phonebook
	 */
	private void unSubscribePhoneBook(long custId, long oldCustId, long userId) throws Exception {
		ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
		int custType = CmCommonUtil.getCustType(custId);
		int oldCustType = CmCommonUtil.getCustType(oldCustId);
		// 个人过给个人
		if (custType == CmConstants.CustomerType.INDIVIDUAL && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 查询老客户是否受保护
			boolean oldFlag = indivService.ifCustIsProtected(oldCustId);
			// 查询新客户是否受保护
			boolean newFlag = indivService.ifCustIsProtected(custId);
			if (oldFlag == true && newFlag == false) {
				// 退订phonebook
				commonSV.savePsPublicInfo(custValue, CmConstants.PsPublicAction.PHONE_NUM_HIDE, userId);
			}
		}
		// 个人过给集团
		if (custType == CmConstants.CustomerType.GROUP && oldCustType == CmConstants.CustomerType.INDIVIDUAL) {
			// 查询老客户是否是受保护
			boolean oldFlag = indivService.ifCustIsProtected(oldCustId);
			if (oldFlag == true) {
				// 退订phonebook
				commonSV.savePsPublicInfo(custValue, CmConstants.PsPublicAction.PHONE_NUM_HIDE, userId);
			}
		}
	}

	/*
	 * 过户时对于使用者的逻辑
	 */
	private void dealAssignUsers(long custId, long oldCustId, long userId) throws Exception {
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID, String.valueOf(userId));
		ICrmInsFSV crmInsFSV = (ICrmInsFSV) ServiceFactory.getService(ICrmInsFSV.class);
		// 根据userId查询使用者
		IInsCmRelValue insCmRelValue = crmInsFSV.queryInsCmRelByUserId(userId);
		// insCmRelValue返回的是一个不为空的bean,所以下面用主键判断
		if ((insCmRelValue.getCmrelId() > 0 && insCmRelValue.getCustId() == oldCustId) || insCmRelValue.getCmrelId() == 0) {
			// 如果该号码有使用者且是老客户或者该号码没有使用者则为该号码分配一个默认的使用者
			ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			// 删除老的客户的使用者
			IBOCmInsCmrelValue[] insValues = service.queryCmInsCmrel(oldCustId, userId, CmConstants.RelaType.USER, -1, -1, -1, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(insValues)) {
				insValues[0].delete();
				service.saveCmInsCmrel(insValues[0]);
			}
			// 创建一个默认的使用者
			service.dealCreateDefaultUser(custId, userId, "N");
		}
	}

	public void ifCanTerminateCust(long custId, long partyId) throws Exception {
		// 根据partyID查询出所有的角色
		ICmPartyRoleSV roleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
		IBOCmPartyRoleValue[] roleValues = roleSV.queryPartyRole(partyId, -1, -1, -1);
		// 如果存在成员，使用者，或者非自有账户不允许注销客户，如果存在自有账户可注销账户但必须删除角色信息
		for (int i = 0; i < roleValues.length; i++) {
			if (roleValues[i].getRoleType() == CmConstants.PartyRoleType.EMPLOYEE) {
				ExceptionUtil.throwBusinessException("CMS9988930");
			} else if (roleValues[i].getRoleType() == CmConstants.PartyRoleType.USER) {
				ExceptionUtil.throwBusinessException("CMS9988930");
			} else if (roleValues[i].getRoleType() == CmConstants.PartyRoleType.CONTACT) {//GVS-248
				ExceptionUtil.throwBusinessException("CMS9988930");
			} else if (roleValues[i].getRoleType() == CmConstants.PartyRoleType.PAYER) {
				if (ifCanTerminatedCustomer(custId, partyId)) {
					ExceptionUtil.throwBusinessException("CMS9988930");
				} else {
					// 如果是自付账户则删除
					roleValues[i].setRoleStatus(CmConstants.roleStatus.IN_ACTIVE);
					roleValues[i].setState(CmConstants.RecordState.ERASE);
					roleValues[i].initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
					BOCmPartyRoleBean bean = new BOCmPartyRoleBean();
					bean.copy(roleValues[i]);
					roleSV.savePartyRole(bean);
				}
			}
		}
	}

	public void saveCprIdInParty(long custId) throws Exception {
		if (custId > 0) {
			ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue customerValue = customerSV.queryCustomerByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(customerValue)) {
				BOCmPartyBean partyBean = new BOCmPartyBean();
				partyBean.initPartyId(customerValue.getPartyId());
				partyBean.initRegionId(CmCommonUtil.getDefaultRegionId());
				// AI-12086 About the problem that the cm_party_21 field is stuffed with 0 for no reason cpr_id
				if (customerValue.getPnr() > 0) {
					partyBean.setCprId(DataType.getAsString(customerValue.getPnr()));
				}
				CmInnerServiceFactory.getCommonInnerSV().saveBean(partyBean);
			}
		}
	}

	public void saveCommonBusiLog(long businessId, DataStructInterface[] dsi, int busiType, long objectId) throws Exception {
		// IVOBusiLogValue logValue = new VOBusiLogBean();
		// int busiOperType = -1;
		// ICmBusiLogValue busiLogValue = null;
		// List<ICmBusiLogValue> logList = new ArrayList<ICmBusiLogValue>();
		// IBOBsOperationValue operationValue = CmBusiLogFactory.getOperationValue(businessId);
		// if (operationValue != null) {
		// for (int i = 0; i < dsi.length; i++) {
		// if (dsi[i].isNew()) {
		// busiOperType = CmConstants.BusiLogOperType.ADD;
		// } else if (dsi[i].isModified()) {
		// if (StringUtils.equals(DataType.getAsString(dsi[i].get("STATE")), CmConstants.RecordState.ERASE)) {
		// busiOperType = CmConstants.BusiLogOperType.DELETE;
		// } else {
		// busiOperType = CmConstants.BusiLogOperType.MODIFY;
		// }
		// } else if (dsi[i].isDeleted()) {
		// busiOperType = CmConstants.BusiLogOperType.DELETE;
		// }
		// busiLogValue = CmBusiLogFactory.createDefaultBusiLog(businessId, busiType, objectId, null, busiOperType, -1,
		// "");
		// //审批不能获取操作员Id手动塞入
		// if(busiLogValue.getOpId()<=0 && CmCommonUtil.isNotEmptyObject(dsi)){
		// if(null != dsi[0].get(IBOCmGroupApprovalValue.S_OpId)){
		// busiLogValue.setOpId(DataType.getAsLong(dsi[0].get(IBOCmGroupApprovalValue.S_OpId)));
		// }
		// }
		// busiLogValue.setBusiDetail(CmBusiLogFactory.getBusiDetail(dsi[i], operationValue.getName()));
		// logList.add(busiLogValue);
		// }
		// }
		// logValue.addBusiLogDetails(logList.toArray(new ICmBusiLogValue[0]));
		// CmServiceFactory.getBusiLogSV().saveBusiLog(logValue);
	}

	public void saveCommonQryBusiLog(long businessId, String sql, Map paraMap, int busiType) throws Exception {
		// IVOBusiLogValue logValue = new VOBusiLogBean();
		// ICmBusiLogValue busiLogValue = CmBusiLogFactory.createDefaultBusiLog(businessId, busiType, -1, null,
		// CmConstants.BusiLogOperType.QUERY, -1, "");
		// StringBuilder busiDetail = new StringBuilder();
		// // 拼接日志详细
		// busiDetail.append(CrmLocaleFactory.getResource("CMS0030004")).append(":");
		// Iterator iterator = paraMap.entrySet().iterator();
		// while (iterator.hasNext()) {
		// Map.Entry entry = (Map.Entry) iterator.next();
		// busiDetail.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
		// }
		// if (busiDetail.toString().endsWith(",")) {
		// busiDetail.deleteCharAt(busiDetail.toString().length() - 1);
		// }
		// busiDetail.append(";\n");
		// busiDetail.append("Table/SQL:").append(sql);
		// busiLogValue.setBusiDetail(busiDetail.toString());
		// logValue.addBusiLogDetail(busiLogValue);
		// CmServiceFactory.getBusiLogSV().saveBusiLog(logValue);
	}

	/*
	 * 客户营销免打扰送外系统
	 */
	private void sendCommercialProToUip(long custId, long userId) throws Exception {
		if (custId > 0 && userId > 0) {
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(custValue)) {
				savePsPublicInfo(custValue, CmConstants.PsPublicAction.COMMERCIAL_PROTECTION, userId);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV#validateCommercialPro(long)
	 * 返回（0:是,1:否,-1:空值）-2标识入参有错
	 */
	public int validateCommercialPro(long custId) throws Exception {
		if (custId > 0) {
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(custValue)) {
				if (CmConstants.CustomerType.GROUP == CmCommonUtil.getCustType(custId)) {
					// 针对集团客户,0:是;1:否
					return custValue.getDirectMarketingProtection();
				} else if (CmConstants.CustomerType.INDIVIDUAL == CmCommonUtil.getCustType(custId)) {
					// 针对个人客户:1 CPR营销标识(0:否；1：是)2 人工营销标识(0:是;1:否)
					int cprCommercialPro = custValue.getDirectMarketingProtection();
					int manualCommercialPro = custValue.getManualCommercialProtection();
					if (-1 != manualCommercialPro) {
						// 只要人工的不为空就以人工的为准
						return manualCommercialPro;
					} else {
						// 针对人工的标识是空的，如果CPR的也是空则返回-1，否则返回CPR的标识
						if (-1 == cprCommercialPro) {
							return -1;
						} else {
							// 由于两个标识定义的枚举值不一样所以要判断
							if (1 == cprCommercialPro) {
								return 0;
							} else {
								return 1;
							}
						}
					}
				}
			}
		}
		return -2;
	}

	public void saveCommonQryBusiLogWithCustId(long businessId, String sql, Map paraMap, int busiType, long custId) throws Exception {
		IBOBsOperationValue operationValue = CmBusiLogFactory.getOperationValue(businessId);
		if (operationValue != null) {
			IVOBusiLogValue logValue = new VOBusiLogBean();
			ICmBusiLogValue busiLogValue = CmBusiLogFactory.createDefaultBusiLog(businessId, busiType, custId, null, CmConstants.BusiLogOperType.QUERY, -1, "");
			StringBuilder busiDetail = new StringBuilder();
			// 拼接日志详细
			busiDetail.append(CrmLocaleFactory.getResource("CMS0030004")).append(":");
			Iterator iterator = paraMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				busiDetail.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
			}
			if (busiDetail.toString().endsWith(",")) {
				busiDetail.deleteCharAt(busiDetail.toString().length() - 1);
			}
			busiDetail.append(";\n");
			busiDetail.append("Table/SQL:").append(sql);
			busiLogValue.setBusiDetail(busiDetail.toString());
			logValue.addBusiLogDetail(busiLogValue);
			CmServiceFactory.getBusiLogSV().saveBusiLog(logValue);
		}
	}

	public int getCustType(long custId) throws Exception {
		if (custId < 0) {
			// 客户ID不能为空
			ExceptionUtil.throwBusinessException("CMS5000001");
		} else {
			return CmCommonUtil.getCustType(custId);
		}
		return -1;
	}

	public IBOCmCustContactMediumValue[] queryMediumByContact(String email, String phoneNum) throws Exception {
		if (StringUtils.isNotBlank(email) || StringUtils.isNotBlank(phoneNum)) {
			StringBuffer condition = new StringBuffer(" 1=1 ");
			Map parameter = new HashMap();
			if (StringUtils.isNotBlank(email)) {
				condition.append(" AND ").append(IBOCmCustContactMediumValue.S_EmailAddress).append(" =:email ");
				parameter.put("email", email.toString());
			}
			if (StringUtils.isNotBlank(phoneNum)) {
				condition.append(" AND ").append(IBOCmCustContactMediumValue.S_ContNumber).append(" =:phoneNum ");
				parameter.put("phoneNum", phoneNum.trim());
			}
			return (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class, condition.toString(), parameter, -1, -1);
		}
		return new IBOCmCustContactMediumValue[0];
	}

	public void savePsPublicForBill(IBOCmPsPublicDealValue[] values) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(values)) {
			for (IBOCmPsPublicDealValue value : values) {
				value.setRecordId(CmCommonUtil.getNewSequence(BOCmPsPublicDealBean.class));
				value.setEntityType(6);
				value.setExecAction(CmConstants.PsPublicAction.UPDATE_ACCT_STATUS);
				value.setRegionId(CmCommonUtil.getDefaultRegionId());
				value.setState(CmConstants.RecordState.USE);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) values);
		} else {
			ExceptionUtil.throwBusinessException("The object can not be empty");
		}
	}

	public void cmPushMessage(IBORemindValue[] values) throws Exception {
		for (IBORemindValue value : values) {
			value.setRemindTime(new Timestamp(new Date(System.currentTimeMillis()).getTime()));
			value.setDoneDate(new Timestamp(new Date(System.currentTimeMillis()).getTime()));
			value.setRemindGrade(1);
			value.setState(1);
		}
		PushClient.batchCreateSrRemind(values);
	}

	public boolean ifCanTerminatedCustomer(long custId, long partyId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition
				.append("SELECT COUNT(*) AS COUNT FROM {CM_CUST_ACCT_REL} M, {CM_PARTY_ACCT_REL} N WHERE M.`ACCT_ID` = N.`ACCT_ID` AND M.`REL_CUST_ID` <> :custId AND M.`PAY_METHOD` = 2  AND N.`PARTY_ID` = :partyId");
		condition.append(" AND M.EXT1<>'4' AND M.STATE='U' AND N.STATE='U' ");
		parameter.put("custId", custId);
		parameter.put("partyId", partyId);
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainerInterface[] dc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		if (CmCommonUtil.isNotEmptyObject(dc)) {
			if (dc[0].getAsLong("COUNT") > 0) {
				return true;
			}
		}
		return false;
	}

	public boolean queryHierarchyStatus(long custId, int custStatus) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition
				.append(" SELECT COUNT(*) AS COUNT FROM {CM_GROUP_CUSTOMER} M,{CM_GROUP_ORG_STRUCT} N WHERE M.`CUST_ID`=N.`REL_CUST_ID` AND N.`CUST_ID`= :custId AND N.`DEPT_TYPE`=0 AND N.`REL_CUST_ID`!= :custId AND M.`CUST_STATUS`= :status ");
		parameter.put("custId", custId);
		parameter.put("status", custStatus);
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainerInterface[] dc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		if (CmCommonUtil.isNotEmptyObject(dc)) {
			if (dc[0].getAsLong("COUNT") > 0) {
				return true;
			}
		}
		return false;
	}

	public void saveCmPsTaskDeal(BOCmPsTaskDealBean[] values) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(values)) {
			for (IBOCmPsTaskDealValue value : values) {
				if (StringUtils.isEmpty(value.getState())) {
					value.setState(CmConstants.RecordState.USE);
				}
				value.setRegionId(CmCommonUtil.getDefaultRegionId());
				value.setTaskId(CmCommonUtil.getNewSequence(BOCmPsTaskDealBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmPsTaskDealBean[]) values);
		}
	}

	public boolean queryIfOnlyCanViewCustomer(long custId) throws Exception {
		long opId = ServiceManager.getUser().getID();
		boolean secFlag = SecframeClient.checkEntityPermission(opId, CmConstants.controlOperateB2B.ent_id, CmConstants.controlOperateB2B.priv_id);
		if (TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_21)) {
			// 针对21租户
			boolean secFlagB = SecframeClient.checkEntityPermission(opId, CmConstants.controlOnlyCanViewOperator.ent_id, CmConstants.controlOnlyCanViewOperator.priv_id);
			boolean secFlagC = SecframeClient.checkEntityPermission(opId, CmConstants.controlViewAndModifyOperator.ent_id, CmConstants.controlViewAndModifyOperator.priv_id);
			ICmGroupCustomerSV service = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			boolean flag = service.queryIfCustomerManager(custId);
			if (secFlagB && !secFlag && !secFlagC && !flag) {
				return true;
			}
		} else if (TenantIDFactory.getTenantId().equals(CmConstants.TenantId.TENANT_91)) {
			// 针对91租户
			if (!secFlag) {
				return true;
			}
		}
		return false;
	}

	public UserInfoInterface getDefaultUser() throws Exception {
		String tenantId = TenantIDFactory.getTenant();
		// 设置操作员信息
		UserInfoInterface user = ServiceManager.getNewBlankUserInfo();
		user.setTenantId(tenantId);
		String opCode = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_PROCESS_OP_CODE", tenantId);
		IBOSecOperatorValue val = OrgmodelClient.getOperatorByCode(opCode);
		user = OrgmodelClient.setUserInfo(val.getOperatorId());
		return user;
	}

	public long getHisTableSequence(String type) throws Exception {
		return ServiceManager.getIdGenerator().getNewId(type).longValue();
	}

	public void saveMultThreadDeal(BOCmMultThreadDealBean[] beans) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(beans)) {
			// 塞上必要的信息
			for (BOCmMultThreadDealBean bean : beans) {
				if (StringUtils.isEmpty(bean.getTaskId())) {
					bean.setTaskId(String.valueOf(CmCommonUtil.getNewSequence(BOCmMultThreadDealBean.class)));
				}
				if (StringUtils.isEmpty(bean.getRegionId())) {
					bean.setRegionId(CmCommonUtil.getDefaultRegionId());
				}
				if (null == bean.getDoneDate()) {
					bean.setDoneDate(new Timestamp(new Date().getTime()));
				}
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(beans);
		}
	}

	public IBOCmMultThreadDealValue[] queryMultThreadDeal(String taskId, String batchId, long taskSeq, int taskStatus) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		if (StringUtils.isNotBlank(taskId)) {
			condition.append(" AND ").append(IBOCmMultThreadDealValue.S_TaskId).append(" =:taskId ");
			parameter.put("taskId", taskId);
		}
		if (StringUtils.isNotBlank(batchId)) {
			condition.append(" AND ").append(IBOCmMultThreadDealValue.S_BatchId).append(" =:batchId ");
			parameter.put("batchId", batchId);
		}
		if (taskSeq > 0) {
			condition.append(" AND ").append(IBOCmMultThreadDealValue.S_TaskSeq).append(" =:taskSeq ");
			parameter.put("taskSeq", taskSeq);
		}
		if (taskStatus > 0) {
			condition.append(" AND ").append(IBOCmMultThreadDealValue.S_TaskStatus).append(" =:taskStatus ");
			parameter.put("taskStatus", taskStatus);
		}
		parameter.put("DONE_DATE", new Timestamp(new Date().getTime()));
		return (IBOCmMultThreadDealValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmMultThreadDealBean.class, condition.toString(), parameter, -1, -1);
	}

	public int queryCmCustRequestTaskCount(String requestStatus) throws Exception {
		if (StringUtils.isNotBlank(requestStatus)) {
			StringBuilder condition = new StringBuilder(" 1=1 ");
			Map parameter = new HashMap();
			condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_RequestStatus).append(" =:status ");
			parameter.put("status", requestStatus);
			condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_State).append(" =:state ");
			parameter.put("state", CmConstants.RecordState.USE);
			return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustRequestTaskBean.class, condition.toString(), parameter);
		}
		return 0;
	}

	public IBOCmCustRequestTaskValue[] queryCmCustRequestTask(String requestStatus, int start, int end) throws Exception {
		if (StringUtils.isNotBlank(requestStatus)) {
			StringBuilder condition = new StringBuilder(" 1=1 ");
			Map parameter = new HashMap();
			condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_RequestStatus).append(" =:status ");
			parameter.put("status", requestStatus);
			condition.append(" AND ").append(IBOCmCustRequestTaskValue.S_State).append(" =:state ");
			parameter.put("state", CmConstants.RecordState.USE);
			return (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class, condition.toString(), parameter, start, end);
		}
		return null;
	}

	public void saveCmPsHierarchyDeal(IBOCmPsHierarchyDealValue[] beans) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(beans)) {
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) beans);
		}
	}

	public IBOCmPsHierarchyDealValue[] queryCmPsHierarchyDeal(int mod, int value, int strIdx, int endIdx) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" SELECT * FROM {CM_PS_HIERARCHY_DEAL} A WHERE A.TASK_ID % :value = :mod ");
		String sql = CmLnCommonUtil.getQueryResult(condition.toString(), null, strIdx, endIdx, null);
		Map parameter = new HashMap();
		parameter.put("value", value);
		parameter.put("mod", mod);
		return (IBOCmPsHierarchyDealValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmPsHierarchyDealBean.class, sql, parameter);
	}

	public int queryCmPsHierarchyDealCount(int mod, int value) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 AND TASK_ID % :value = :mod ");
		Map parameter = new HashMap();
		parameter.put("value", value);
		parameter.put("mod", mod);
		condition.append(" AND ").append(IBOCmPsHierarchyDealValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.RecordState.USE);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmPsHierarchyDealBean.class, condition.toString(), parameter);
	}

	public IBOCmCustOutMappingValue[] queryCmCustOutMapping(long relId, long custId, String outRelaId) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		Map parameter = new HashMap();
		if (relId > 0) {
			condition.append(" AND ").append(IBOCmCustOutMappingValue.S_RelId).append(" =:relId ");
			parameter.put("relId", relId);
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmCustOutMappingValue.S_CustId).append(" =:custId ");
			parameter.put("custId", custId);
		}
		if (StringUtils.isNotBlank(outRelaId)) {
			condition.append(" AND ").append(IBOCmCustOutMappingValue.S_OutRelaId).append(" =:outRelaId ");
			parameter.put("outRelaId", outRelaId);
		}
		condition.append(" AND ").append(IBOCmCustOutMappingValue.S_State).append(" =:state ");
		parameter.put("state", CmConstants.RecordState.USE);
		return (IBOCmCustOutMappingValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustOutMappingBean.class, condition.toString(), parameter, -1, -1);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV#saveTaskAndMultThreadDeal(java.util.Map,
	 * java.lang.String)
	 */
	public void saveTaskAndMultThreadDeal(Map taskParamMap, String calBatchId, String taskName, String taskTypeCode, String taskBusinessClass) throws Exception {
		ICmCommonSV cmCommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		long calTaskId = cmCommonSV.createImmediateTask(taskName, taskTypeCode, taskBusinessClass, taskParamMap);
		// 插入到多线程工单表中以便后面做判断
		BOCmMultThreadDealBean bean = new BOCmMultThreadDealBean();
		bean.setBatchId(calBatchId);
		bean.setTaskSeq(calTaskId);
		bean.setTaskStatus(CmConstants.MultThreadTaskStatus.DEALING);
		cmCommonSV.saveMultThreadDeal(new BOCmMultThreadDealBean[] { bean });

	}

	public DataContainerInterface[] queryCommonInfo(Class pojo, Map parameter) throws Exception {
		StringBuilder condition = new StringBuilder(" 1=1 ");
		if (null != parameter && parameter.size() > 0) {
			Iterator<Map.Entry<String, String>> iterator = parameter.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, String> entry = iterator.next();
				condition.append(" AND ").append(entry.getKey()).append(" =:").append(entry.getKey());
			}
			return CmInnerServiceFactory.getCommonInnerSV().getBeans(pojo, condition.toString(), parameter, -1, -1);
		}
		return null;
	}

	public long queryCustomerByCond(String addressId, String email, String phone, String custName) throws Exception {
		String sql = "SELECT A.CUST_ID FROM {CM_INDIV_CUSTOMER} A,{CM_CUST_CONTACT_MEDIUM} B WHERE A.CUST_NAME=:custName AND A.STATE=U AND A.INDIV_CUST_TYPE=1 AND A.CUST_STATUS=0 ";
		Map parameter = new HashMap();
		parameter.put("custName", custName);
		if (StringUtils.isNotBlank(email)) {
			sql += " AND B.EMAIL_ADDRESS=:email ";
			parameter.put("email", email);
		}
		if (StringUtils.isNotBlank(phone)) {
			sql += " AND B.CONT_NUMBER=:contNumber ";
			parameter.put("contNumber", phone);
		}
		if (StringUtils.isNotBlank(addressId)) {
			sql += " AND B.ADDRESS_ID=:addressId ";
			parameter.put("addressId", addressId);
		}
		DataContainer[] dcs = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			if (dcs[0].getAsLong("CUST_ID") > 0) {
				return dcs[0].getAsLong("CUST_ID");
			}
		}
		return 0;
	}

	public void saveBusiLog(long businessId, int busiType, long objectId, int operType, String sql, Map paraMap, String methodDetail) throws Exception {
		IBOBsOperationValue operationValue = CmBusiLogFactory.getOperationValue(businessId);
		if (operationValue != null) {
			IVOBusiLogValue logValue = new VOBusiLogBean();
			ICmBusiLogValue busiLogValue = CmBusiLogFactory.createDefaultBusiLog(businessId, busiType, objectId, null, operType, -1, methodDetail);
			if (operType == CmConstants.BusiLogOperType.QUERY) {
				StringBuilder busiDetail = new StringBuilder(busiLogValue.getBusiDetail());
				// 拼接日志详细
				busiDetail.append(";").append(CrmLocaleFactory.getResource("CMS0030004")).append(":");
				Iterator iterator = paraMap.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					busiDetail.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
				}
				if (busiDetail.toString().endsWith(",")) {
					busiDetail.deleteCharAt(busiDetail.toString().length() - 1);
				}
				busiDetail.append(";");
				busiDetail.append("Table/SQL:").append(sql);
				String tempDetail = busiDetail.toString();
				if (tempDetail.length() > 4000) {
					// 字段只有4000长度
					tempDetail = tempDetail.substring(0, 3999);
				}
				busiLogValue.setBusiDetail(tempDetail);
			}
			logValue.addBusiLogDetail(busiLogValue);
			CmServiceFactory.getBusiLogSV().saveBusiLog(logValue);
		}
	}

	public DataContainerInterface[] fuzzyQueryCustomerAndContactMedium(List<Long> custIds,int startNum,int endNum) throws Exception {
		String custIdStr = null;
		if(CollectionUtils.isNotEmpty(custIds)) {
			for (Long custId : custIds) {
				if(StringUtils.isNotBlank(custIdStr)) {
					custIdStr = custIdStr + "," + String.valueOf(custId);
				}else {
					custIdStr = String.valueOf(custId);
				}
			}
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		DataContainerInterface[] dc = null;
		if(StringUtils.isNotBlank(custIdStr)) {
			condition.append("SELECT * FROM (");
			condition.append("(SELECT indiv.cust_id,indiv.birthday,indiv.cust_name,indiv.cust_cert_code,indiv.cust_cert_type,indiv.create_date,indiv.cust_status,indiv.region_id " + 
					" FROM {CM_INDIV_CUSTOMER} indiv WHERE indiv.cust_id in ("+custIdStr+") ) ");
			condition.append(" UNION ALL ");
			condition.append("(SELECT org.cust_id,NULL,org.cust_name,org.cust_cert_code,org.cust_cert_type,org.create_date,org.cust_status,org.region_id " + 
					" FROM {CM_GROUP_CUSTOMER} org WHERE org.cust_id in ("+custIdStr+") )");
			condition.append(" ) as a LIMIT "+startNum+","+endNum);
			String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
			dc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		}
		return dc;
	}
	
	public int fuzzyQueryCustomerAndContactMediumCount(List<Long> custIds) throws Exception {
		String custIdStr = null;
		if(CollectionUtils.isNotEmpty(custIds)) {
			for (Long custId : custIds) {
				if(StringUtils.isNotBlank(custIdStr)) {
					custIdStr = custIdStr + "," + String.valueOf(custId);
				}else {
					custIdStr = String.valueOf(custId);
				}
			}
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		if(StringUtils.isNotBlank(custIdStr)) {
			condition.append("SELECT COUNT(*) as count FROM (");
			condition.append("(SELECT indiv.cust_id,indiv.birthday,indiv.cust_name,indiv.cust_cert_code,indiv.cust_cert_type,indiv.create_date,indiv.cust_status,indiv.region_id " + 
					" FROM {CM_INDIV_CUSTOMER} indiv WHERE indiv.cust_id in ("+custIdStr+") ) ");
			condition.append(" UNION ALL ");
			condition.append("(SELECT org.cust_id,NULL,org.cust_name,org.cust_cert_code,org.cust_cert_type,org.create_date,org.cust_status,org.region_id " + 
					" FROM {CM_GROUP_CUSTOMER} org WHERE org.cust_id in ("+custIdStr+") )");
			condition.append(" ) as a ");
		}
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainerInterface[] dc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		int count = 0;
		if(dc!=null && dc.length>0) {
			count = dc[0].getAsInt("count");
		}
		return count;
	}
	
	public DataContainerInterface[] fuzzyQueryCustomerByCustIdAndName(String queryParam) throws Exception {
		if(StringUtils.isBlank(queryParam)) {
			return null;
		}
		int length = queryParam.length();
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append("SELECT indiv.cust_id FROM {CM_INDIV_CUSTOMER} indiv WHERE 1=1 AND (indiv.CUST_NAME LIKE '"+queryParam+"%' ");
		if(length>=8) {
			condition.append("  OR indiv.CUST_ID LIKE '"+queryParam+"%' ");
		}
		condition.append(" ) ");
		condition.append(" UNION ALL ");
		condition.append("(SELECT org.cust_id FROM {CM_GROUP_CUSTOMER} org WHERE 1=1 AND (org.CUST_NAME LIKE '"+queryParam+"%' ");
		if(length>=8) {
			condition.append(" OR org.CUST_ID LIKE '"+queryParam+"%' ");
		}
		condition.append(" )) ");
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), parameter);
		DataContainerInterface[] dc = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		return dc;
	}
}
