package com.asiainfo.crm.cm.dk.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.msg.jetty.http.PathMap.Entry;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPsPublicDealBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustRequestTaskBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustRequestTaskEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.group.bo.BOLnCmxGroupCustBean;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.impl.CmPartySVImpl;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.res.teaminvoke.out.service.interfaces.IRes2InterFSV;
import com.asiainfo.crm.constant.RBossConst;

public class CmCustRequestTaskSVImpl implements ICmCustRequestTaskSV {

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV#dealCmCustRequestTask4IndivCustomer(com.asiainfo
	 * .crm.cm.model.ivalues.ICustomerValue)
	 */
	@Override
	public void dealCmCustRequestTask4IndivCustomer(ICustomerValue customerVal) throws Exception {
		if (customerVal.isNew()) {// new customer should send to CPR
			saveCustRequestTaskInfo(customerVal, 4, "T");
		} else if (customerVal.isModified()) {// modify
			DataStructInterface dc = (DataStructInterface) customerVal;
			String[] fields = dc.getPropertyNames();
			String nowValue = null;
			String oldValue = null;
			for (int j = 0, fieldLen = fields.length; j < fieldLen; j++) {
				if (("CUST_STATUS").equalsIgnoreCase(fields[j])) {
					nowValue = StringUtils.isBlank(dc.get(fields[j]) == null ? null : String.valueOf(dc.get(fields[j]))) ? "  " : String.valueOf(dc.get(fields[j]));
					oldValue = StringUtils.isBlank(dc.getOldObj(fields[j]) == null ? null : String.valueOf(dc.getOldObj(fields[j]))) ? "  " : String.valueOf(dc
							.getOldObj(fields[j]));
					if (!nowValue.equalsIgnoreCase(oldValue)) {
						if (nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_ACTIVE))) {
							if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_POTENTIAL))) {// 潜在转在网需要触发送CPR
								saveCustRequestTaskInfo(customerVal, 4, "C");
								// 送AKS发起订购(2:AKS订购)
								saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.SUBSCRIBE);
								// 将CPR_ID插入cm_party表中
								ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
								commonSV.saveCprIdInParty(customerVal.getCustId());
							}else if(oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE))){//离网转在网送CPR AKS
								long cprId = queryCprIdByCustIdOrPartyId(customerVal.getCustId()); 
								IBOCmCustRequestTaskValue[] taskValues = queryByCustIdAndReqStatus(cprId, CmConstants.RequestStatus.pending);
								if(taskValues != null && taskValues.length > 0 && taskValues[0].getRequestType() == CmConstants.RequestType.DELETE) {
									//在party.cm_cust_request_task_21表里有状态为C、类型为退订的数据，将此数据挪历史
									taskValues[0].delete();
									CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) taskValues[0]);
									
									/**
									 * AKS数据处理:
									 * 1.根据客户ID查询CM_PS_PUBLIC_DEAL_21表，看是否有ExecAction=3(退订)的记录
									 * if(存在){
									 * 		将此记录挪历史；
									 * 		修改cmx_indiv_customer_21数据，将AKS_STATUS改成1(订购成功)
									 * }else{
									 * 		发AKS订购；
									 * }
									 */
									IBOCmPsPublicDealValue[] publicDealValues = queryPublicByEntityIdAndAction(customerVal.getCustId(), CmConstants.AksAction.UNSUBSCRIBE);
									if(publicDealValues != null && publicDealValues.length > 0) {
										publicDealValues[0].delete();
										CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) publicDealValues[0]);
										
										customerVal.setAksStatus(CmConstants.AksStatus.SUBSCRIPTION_SUCCESS);
										CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) customerVal);
									}else {
										saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.SUBSCRIBE);
									}
									
								}else {
									saveCustRequestTaskInfo(customerVal, CmConstants.RequestType.ADD, CmConstants.RequestStatus.pending);
									saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.SUBSCRIBE);
								}
							}
						}else if (nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_TERMINATED))) {// 注销需要送CPR
							//如果老值为离网,就判断是不是还有 1.，f记录，如果有就不送cpr退订，反之送
							if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE))) {
								//检查是否还有1,F 记录 ,使用pnr 进行查询
								dealTerminateSendCpr(customerVal, 1, "F");
							}
							// 老值为潜在的不送退订
							/* if (!oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_POTENTIAL))) {
								saveCustRequestTaskInfo(customerVal, 1, "C");
								// 送AKS发起退订(3:AKS退订)
								saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.UNSUBSCRIBE);
							}*/
						}/* else if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE))
								&& nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_POTENTIAL))) {// 离网转潜在送CPR
							saveCustRequestTaskInfo(customerVal, 1, "C");
							// 送AKS发起退订(3:AKS退订)
							saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.UNSUBSCRIBE);
						} */
						else if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_ACTIVE))
								&& nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE))){// 激活转离网需要送CPR，aks
							    //判断离网的客户是否还作为其他客户的使用者，或者为其他合同的支付者
							    if(!checkCustHasUserOrHasPayer(customerVal)) {
							    	saveCustRequestTaskInfo(customerVal, 1, "C");
							    }
								// 送AKS发起退订(3:AKS退订)
								saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.UNSUBSCRIBE);
						} else if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_PAUSE))
								&& nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE))) {//暂停转离网送CPR AKS
							saveCustRequestTaskInfo(customerVal, 1, "C");
							// 送AKS发起退订(3:AKS退订)
							saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.UNSUBSCRIBE);
						} else {
							break;
						}
					}
					break;
				}
			}
		}
	}

	/**
	 * 保存客户请求任务信息
	 * @Function saveCustRequestTaskInfo
	 * @Description 
	 *
	 * @param customerVal
	 * @param action (1:退订CPR,4:订购CPR)
	 * @param reqStatus(T:待处理前的临时状态、C:待处理)
	 * @throws Exception
	 * @throws AIException
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-4-30 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-4-30     yangjh           v1.0.0               修改原因<br>
	 */
	private void saveCustRequestTaskInfo(ICustomerValue customerVal, int action, String reqStatus) throws Exception, AIException {
		ICmCustRequestTaskSV sv = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		IBOCmCustRequestTaskValue taskValue = null;
		// 根据custId查出pnr
		long custId = customerVal.getCustId();
		if (custId == CmConstants.ANONYMOUS_CUST_ID) {
			// AI-14079 Global dummy customer send for CPR subscription 匿名客户增加过滤
			return;
		}
		IBOCmCustRequestTaskValue[] vals = sv.queryByCustId(custId);
		
		//再增加次判断，避免纯payer送cpr后，新增客户角色时候插入重复工单
		if(vals == null || vals.length == 0){
			vals = sv.queryByCustId(customerVal.getPartyId());
			//payer送过cpr，直接跳出方法，payer有自己的cpr订购逻辑
			if(vals != null && vals.length > 0){
				return;
			}
		}
		
		//以客户维度订购cpr
		if (vals != null && vals.length > 0) {
			if(vals[0].getRequestStatus().equalsIgnoreCase(CmConstants.RequestStatus.dealDone) && vals[0].getRequestType() == action){
				//这个cpr已经被别的角色订购cpr成功了，则不再处理
				return;
			}
			taskValue = vals[0];
			taskValue.setOpId(ServiceManager.getUser().getID());
			taskValue.setOrgId(ServiceManager.getUser().getOrgId());
			taskValue.setDoneDate(ServiceManager.getOpDateTime());
		} else {
			taskValue = new BOCmCustRequestTaskBean();
			taskValue.setPriority(5);
			taskValue.setCustId(custId);
			taskValue.setTaskId(BOCmCustRequestTaskEngine.getNewId().longValue());
			taskValue.setCreateDate(ServiceManager.getOpDateTime());
			taskValue.setCreateOpId(ServiceManager.getUser().getID());
			taskValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			taskValue.setRegionId(customerVal.getRegionId());
			taskValue.setState("U");
		}

		taskValue.setStatusDate(ServiceManager.getOpDateTime());
		taskValue.setRequestStatus(reqStatus);
		taskValue.setRequestType(action);
		taskValue.setResults("");
		saveRequestTask(taskValue);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.dk.service.interfaces.ICmCustRequestTaskSV#queryByCustId(long)
	 */
	@Override
	public IBOCmCustRequestTaskValue[] queryByCustId(long custId) throws Exception {
		custId = queryCprIdByCustIdOrPartyId(custId);
		String cond = "CUST_ID = :custId AND STATE = 'U' ORDER BY DONE_DATE DESC";
		Map parameter = new HashMap();
		parameter.put("custId", custId);
		return (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class, cond, parameter, -1, -1);
	}

	@Override
	public IBOCmCustRequestTaskValue queryByCustIdForShow(long custId) throws Exception {
		IBOCmCustRequestTaskValue[] requestTaskArray = queryByCustId(custId);
		return this.queryRequestStatusForShow(requestTaskArray);
	}

	@Override
	public IBOCmCustRequestTaskValue queryRequestStatusForShow(IBOCmCustRequestTaskValue[] requestTaskArray) throws Exception {
		if (null != requestTaskArray && requestTaskArray.length > 0) {
			IBOCmCustRequestTaskValue value = requestTaskArray[0];
			String requestState = value.getRequestStatus();
			String requestResult = value.getResults();
			if (null != requestState) {
				if (value.getRequestType() == CmConstants.RequestType.ADD) {
					if (CmConstants.RequestStatus.pending.equals(requestState) && StringUtils.isBlank(requestResult)) {
						// 1.送CPR订购：请求类型是新增，请求状态是C，请求结果无。
						value.setRequestStatus(CmConstants.requestOrderStatus.preparedToCPR);
					} else if (CmConstants.RequestStatus.processing.equals(requestState) && StringUtils.isBlank(requestResult)) {
						// 1.送CPR订购：请求类型是新增，请求状态是P，请求结果无。
						value.setRequestStatus(CmConstants.requestOrderStatus.sendCPROrder);
					} else if (CmConstants.RequestStatus.dealDone.equals(requestState) && StringUtils.isNotBlank(requestResult) && "000".equals(requestResult)) {
						// 2.订购/退订成功：请求类型是新增，请求状态是F，请求结果000。
						value.setRequestStatus(CmConstants.requestOrderStatus.CPROrderSuccess);
					} else if (CmConstants.RequestStatus.dealDone.equals(requestState) && (StringUtils.isBlank(requestResult) || !"000".equals(requestResult))) {
						// 3.订购失败：请求类型是新增，请求状态是F，请求结果无或者不是000。
						if ("4608".equals(requestResult) || "4910".equals(requestResult) || "4919".equals(requestResult) || "4631".equals(requestResult)) {
							value.setRequestStatus(CmConstants.requestOrderStatus.CPROrderSuccess);
						} else {
							value.setRequestStatus(CmConstants.requestOrderStatus.CPROrderFail);
						}
					}
				} else if (value.getRequestType() == CmConstants.RequestType.DELETE) {
					if (CmConstants.RequestStatus.pending.equals(requestState) && StringUtils.isBlank(requestResult)) {
						// 1.送CPR退订：请求类型是新增，请求状态是C，请求结果无。
						value.setRequestStatus(CmConstants.requestOrderStatus.preparedToCPRForUnsub);
					} else if (CmConstants.RequestStatus.processing.equals(requestState) && StringUtils.isBlank(requestResult)) {
						// 1.送CPR退订：请求类型是新增，请求状态是P，请求结果无。
						value.setRequestStatus(CmConstants.requestOrderStatus.SendCPRUnsub);
					} else if (CmConstants.RequestStatus.dealDone.equals(requestState) && StringUtils.isNotBlank(requestResult) && "000".equals(requestResult)) {
						// 2.订购/退订成功：请求类型是新增，请求状态是F，请求结果000。
						value.setRequestStatus(CmConstants.requestOrderStatus.CPROutOrder);
					} else if (CmConstants.RequestStatus.dealDone.equals(requestState) && (StringUtils.isBlank(requestResult) || !"000".equals(requestResult))) {
						// 3.退订失败：请求类型是新增，请求状态是F，请求结果无或者不是000。
						if ("4608".equals(requestResult) || "4910".equals(requestResult) || "4919".equals(requestResult) || "4631".equals(requestResult)) {
							value.setRequestStatus(CmConstants.requestOrderStatus.CPROrderSuccess);
						} else {
							value.setRequestStatus(CmConstants.requestOrderStatus.CPRUnsubFail);
						}
					}
				}
			}
			return requestTaskArray[0];
		}
		return null;
	}

	/**
	 * 保存客户公共请求信息
	 * @Function saveCustAKSInfo
	 * @Description 
	 *
	 * @param value
	 * @param action (2:订购AKS,3:退订AKS)
	 * @throws Exception
	 * @throws AIException
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-8-25 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-25     huangqun          v1.0.0               修改原因<br>
	 */
	@Override
	public void saveCustAKSInfo(ICustomerValue value, int action) throws Exception {
		IBOCmPsPublicDealValue psPublicValue = new BOCmPsPublicDealBean();
		// 插入基本信息（必填参数）
		psPublicValue.setRecordId(CmCommonUtil.getNewSequence(BOCmPsPublicDealBean.class));
		psPublicValue.setEntityType(CmConstants.EntityType.CUSTOMER);
		psPublicValue.setEntityId(value.getCustId());
		psPublicValue.setPartyId(value.getPartyId());
		psPublicValue.setExecAction(action);
		// 插入公共参数
		psPublicValue.setState(CmConstants.RecordState.USE);
		psPublicValue.setCreateOpId(ServiceManager.getUser().getID());
		psPublicValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
		psPublicValue.setOpId(ServiceManager.getUser().getID());
		psPublicValue.setOrgId(ServiceManager.getUser().getOrgId());
		psPublicValue.setDoneCode(ServiceManager.getDoneCode());
		psPublicValue.setCreateDate(ServiceManager.getOpDateTime());
		psPublicValue.setDoneDate(ServiceManager.getOpDateTime());
		psPublicValue.setEffectiveDate(ServiceManager.getOpDateTime());
		psPublicValue.setExpireDate(TimeUtil.getMaxExpire());
		psPublicValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		BOCmPsPublicDealBean bean = new BOCmPsPublicDealBean();
		bean.copy(psPublicValue);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	@Override
	public void dealCmGroupCustAKSInfo(ICustomerValue customerVal) throws Exception {
		// modify
		if (customerVal.isModified()) {
			String custCertCode = customerVal.getCustCertCode();
			DataStructInterface dc = (DataStructInterface) customerVal;
			String[] fields = dc.getPropertyNames();
			String nowValue = null;
			String oldValue = null;
			for (int j = 0, fieldLen = fields.length; j < fieldLen; j++) {
				// telenor需求，调用资源接口
				IRes2InterFSV service = (IRes2InterFSV) ServiceFactory.getService(IRes2InterFSV.class);
				if (("CUST_STATUS").equalsIgnoreCase(fields[j])) {
					nowValue = StringUtils.isBlank(dc.get(fields[j]) == null ? null : String.valueOf(dc.get(fields[j]))) ? "  " : String.valueOf(dc.get(fields[j]));
					oldValue = StringUtils.isBlank(dc.getOldObj(fields[j]) == null ? null : String.valueOf(dc.getOldObj(fields[j]))) ? "  " : String.valueOf(dc
							.getOldObj(fields[j]));
					if (!nowValue.equalsIgnoreCase(oldValue)) {
						if (nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_ACTIVE))) {
							if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_POTENTIAL))) {
								// 送AKS发起订购(2:AKS订购)
								if (!custCertCode.startsWith("K")) {
									// 外国客户不送AKS
									saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.SUBSCRIBE);
								}
								// 调用资源接口
								service.changePhoneNumPreDate(String.valueOf(customerVal.getCustId()), nowValue, null);
								service.changeSimStatus(String.valueOf(customerVal.getCustId()), nowValue, null);
							}
						}else if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_ACTIVE))
								&&nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE))) {
								// 送AKS发起退订(3:AKS退订)
								if (!custCertCode.startsWith("K")) {
									// 外国客户不送AKS
									saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.UNSUBSCRIBE);
								}
						}else if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_PAUSE))
								&& nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE))) {
							// 送AKS发起退订(3:AKS退订)
							if (!custCertCode.startsWith("K")) {
								// 外国客户不送AKS
								saveAksInformation(customerVal.getCustId(), CmConstants.UpdateFlag.UNSUBSCRIBE);
							}
						}else if (oldValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_ACTIVE))
								&& nowValue.equals(String.valueOf(CmConstants.CustomerStatus.INDIV_INACTIVE))) {// 在网变成离网，需要调用资源接口
							// 调用资源接口
							service.changePhoneNumPreDate(String.valueOf(customerVal.getCustId()), nowValue, null);
							service.changeSimStatus(String.valueOf(customerVal.getCustId()), nowValue, null);
						} else {
							break;
						}
					}
					break;
				}

			}
		}
	}

	@Override
	public void savePublicWordOrder(IBOCmPsPublicDealValue psPublicDealValue) throws Exception {
		BOCmPsPublicDealBean psPublicDealBean = new BOCmPsPublicDealBean();
		psPublicDealBean.copy(psPublicDealValue);
		if (psPublicDealBean.getRecordId() <= 0) {
			psPublicDealBean.setRecordId(CmCommonUtil.getNewSequence(BOCmPsPublicDealBean.class));
		}
		if (StringUtils.isBlank(psPublicDealBean.getRegionId())) {
			psPublicDealBean.setRegionId(CmCommonUtil.getDefaultRegionId());
		}
		if (StringUtils.isBlank(psPublicDealBean.getState())) {
			psPublicDealBean.setState(CmConstants.RecordState.USE);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean(psPublicDealBean);
	}

	@Override
	public IBOCmPsPublicDealValue[] queryPublicWorkOrder(long recordId, int action) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append(" 1=1 ");
		Map paraMap = new HashMap();
		if (recordId > 0) {
			sb.append(" AND ").append(IBOCmPsPublicDealValue.S_RecordId).append(" = :recordId");
			paraMap.put("recordId", recordId);
		}
		if (action > 0) {
			sb.append(" AND ").append(IBOCmPsPublicDealValue.S_ExecAction).append(" = :action");
			paraMap.put("action", action);
		}
		IBOCmPsPublicDealValue[] publicDealValues = (IBOCmPsPublicDealValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPsPublicDealBean.class, sb.toString(),
				paraMap, -1, -1);
		if (publicDealValues == null || publicDealValues.length < 1) {
			return new IBOCmPsPublicDealValue[0];
		}
		return publicDealValues;
	}
	
	public IBOCmPsPublicDealValue[] queryPublicByEntityIdAndAction(long entityId, int action) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append(" 1=1 ");
		Map paraMap = new HashMap();
		if (entityId > 0) {
			sb.append(" AND ").append(IBOCmPsPublicDealValue.S_EntityId).append(" = :entityId");
			paraMap.put("custId", entityId);
		}
		if (action > 0) {
			sb.append(" AND ").append(IBOCmPsPublicDealValue.S_ExecAction).append(" = :action");
			paraMap.put("action", action);
		}
		IBOCmPsPublicDealValue[] publicDealValues = (IBOCmPsPublicDealValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPsPublicDealBean.class, sb.toString(),
				paraMap, -1, -1);
		if (publicDealValues == null || publicDealValues.length < 1) {
			return new IBOCmPsPublicDealValue[0];
		}
		return publicDealValues;
	}

	/**
	 * 保存客户扩展信息
	 * @Function saveSubscribeAKSInfo
	 * @Description 
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-19 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-19     huangqun          v1.0.0               修改原因<br>
	 */
	@Override
	public void saveSubscribeAKSInfo(long custId, int flag) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = service.queryCustomerByCustId(custId);
		IVOCustValue voCustValue = new VOCustBean();
		if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
			// 个人扩展信息
			IBOCmxIndivCustomerValue value = new BOCmxIndivCustomerBean();
			value.initProperty("CUST_ID", custId);
			value.setUpdateFlag(Integer.valueOf(flag));
			value.setAksRegistrationDate(null);
			if (flag == CmConstants.UpdateFlag.SUBSCRIBE) {
				value.setAksStatus(CmConstants.AksStatus.SUBSCRIPTION_PEND);
			} else if (flag == CmConstants.UpdateFlag.UNSUBSCRIBE) {
				value.setAksStatus(CmConstants.AksStatus.UNSUBSCRIPTION_PEND);
			}
			value.initProperty("REGION_ID",CmCommonUtil.getDefaultRegionId());
			voCustValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, value);
			custValue.setStsToOld();
			voCustValue.setCustomer(custValue);
			voCustValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);
		} else {
			// 集团扩展信息对象
			IBOLnCmxGroupCustValue value = new BOLnCmxGroupCustBean();
			value.initProperty("CUST_ID", custId);
			value.setUpdateFlag(Integer.valueOf(flag));
			value.setAksRegistrationDate(null);
			if (flag == CmConstants.UpdateFlag.SUBSCRIBE) {
				value.setAksStatus(CmConstants.AksStatus.SUBSCRIPTION_PEND);
			} else if (flag == CmConstants.UpdateFlag.UNSUBSCRIBE) {
				value.setAksStatus(CmConstants.AksStatus.UNSUBSCRIPTION_PEND);
			}
			voCustValue.setUserObject("cmxGrpCust", value);
			custValue.setStsToOld();
			voCustValue.setCustomer(custValue);
			voCustValue.setUserObject(CmLnConstants.DealCustInfo.OP_STATE, CmLnConstants.DealCustInfo.OP_MODIFY);
		}
		CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);
	}

	@Override
	public void saveCustRequestTaskInfo(long custId, int action, String reqStatus) throws Exception {
		if (custId == CmConstants.ANONYMOUS_CUST_ID) {
			// AI-14079 Global dummy customer send for CPR subscription 匿名客户增加过滤
			return;
		}
		ICmCustRequestTaskSV sv = (ICmCustRequestTaskSV) ServiceFactory.getService(ICmCustRequestTaskSV.class);
		IBOCmCustRequestTaskValue taskValue = null;
		IBOCmCustRequestTaskValue[] vals = sv.queryByCustId(custId);
		if (vals != null && vals.length > 0) {
			taskValue = vals[0];
			//TELENOR_DEFECT_20180719_0002  判断CPR ID 是否为空,如果为空，则退回，不做相应的修改处理
			if(0==taskValue.getCustId()){
				return;
			}
			taskValue.setOpId(ServiceManager.getUser().getID());
			taskValue.setOrgId(ServiceManager.getUser().getOrgId());
			taskValue.setDoneDate(ServiceManager.getOpDateTime());
		} else {
			taskValue = new BOCmCustRequestTaskBean();
			taskValue.setPriority(5);
			taskValue.setCustId(custId);
			taskValue.setTaskId(BOCmCustRequestTaskEngine.getNewId().longValue());
			taskValue.setCreateDate(ServiceManager.getOpDateTime());
			taskValue.setCreateOpId(ServiceManager.getUser().getID());
			taskValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			taskValue.setRegionId(CmCommonUtil.getDefaultRegionId());
			taskValue.setState("U");
		}

		taskValue.setStatusDate(ServiceManager.getOpDateTime());
		taskValue.setRequestStatus(reqStatus);
		taskValue.setRequestType(action);
		taskValue.setResults("");
		saveRequestTask(taskValue);
	}

	@Override
	public IBOCmCustRequestTaskValue[] queryByCustIdAndReqStatus(long custId, String reqStatus) throws Exception {
		custId = queryCprIdByCustIdOrPartyId(custId);
		String cond = "CUST_ID = :custId AND STATE = 'U' and REQUEST_STATUS =:reqStatus ORDER BY DONE_DATE DESC";
		Map parameter = new HashMap();
		parameter.put("custId", custId);
		parameter.put("reqStatus", reqStatus);
		return (IBOCmCustRequestTaskValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustRequestTaskBean.class, cond, parameter, -1, -1);
	}

	/**
	 * 统一处理保存CM_CUST_REQUEST_TASK工单信息
	 * @Function saveRequestTask
	 * @Description 做custId与pnr的转换
	 *
	 * @param value
	 * @throws Exception
	 * @throws AIException
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-12-05 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-05     huangqun          v1.0.0               修改原因<br>
	 */
	private void saveRequestTask(IBOCmCustRequestTaskValue value) throws Exception {
		long custId = value.getCustId();
		value.setCustId(queryCprIdByCustIdOrPartyId(custId));
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) value);
	}

	/**
	 * 保存aks信息,不走统一保存客户信息流程
	 * @Function saveAksInformation
	 * @Description 
	 *
	 * @param custId
	 * @throws Exception
	 * @throws AIException
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-12-16 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * -------------------------------------------------------<br>
	 * 2014-12-16     huangqun          v1.0.0               修改原因<br>
	 */
	private void saveAksInformation(long custId, int updateFlag) throws Exception {
		if (custId == CmConstants.ANONYMOUS_CUST_ID) {
			// AI-14079 Global dummy customer send for CPR subscription 匿名客户增加过滤
			return;
		}
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
		DataContainerInterface cmxCustValue = null;
		// 修改客户扩展信息
		if (CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
			// 针对个人客户
			cmxCustValue = new BOCmxIndivCustomerBean();
		} else {
			// 针对集团客户
			cmxCustValue = new BOLnCmxGroupCustBean();
		}
		cmxCustValue.initProperty("CUST_ID", custId);
		cmxCustValue.initProperty(ICustomerValue.S_RegionId, custValue.getRegionId());
		cmxCustValue.set("UPDATE_FLAG", updateFlag);
		if (updateFlag == CmConstants.UpdateFlag.SUBSCRIBE) {
			cmxCustValue.set("AKS_STATUS", CmConstants.AksStatus.SUBSCRIPTION_PEND);
		} else if (updateFlag == CmConstants.UpdateFlag.UNSUBSCRIBE) {
			cmxCustValue.set("AKS_STATUS", CmConstants.AksStatus.UNSUBSCRIPTION_PEND);
		}
		cmxCustValue.set("AKS_REGISTRATION_DATE", null);
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) cmxCustValue);
		// 插入工单表
		if (updateFlag == CmConstants.UpdateFlag.SUBSCRIBE) {
			saveCustAKSInfo(custValue, CmConstants.AksAction.SUBSCRIBE);
		} else {
			saveCustAKSInfo(custValue, CmConstants.AksAction.UNSUBSCRIBE);
		}
	}

	// 根据partyId或者custId查询出对应的CPRId
	private long queryCprIdByCustIdOrPartyId(long custId) throws Exception {
		if (String.valueOf(custId).length() == 14) {
			// 说明送的不是partyId,是custId
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			IBOCmxIndivCustomerValue cmxValue = custSV.queryCmxIndivCustomerValue(custId);
			if (CmCommonUtil.isNotEmptyObject(cmxValue)) {
				custId = cmxValue.getPnr();
			}
		} else if (String.valueOf(custId).length() == 12) {
			// 针对送的是partyId
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IPartyValue partyValue = partySV.queryPartyById(custId);
			if (CmCommonUtil.isNotEmptyObject(partyValue)) {
				if (StringUtils.isNotBlank(partyValue.getCprId())) {
					custId = DataType.getAsLong(partyValue.getCprId());
				}
			}
		}
		return custId;
	}
	
	/**
	 * 保存CM_CUST_REQUEST_TASK_VALUE
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-8-13
	* ICmCustRequestTaskSV
	 */
	@Override
	public void saveCmCustRequestTask(IBOCmCustRequestTaskValue cmCustRequestTaskValue) throws Exception{
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) cmCustRequestTaskValue);
	}
	
	/**
	 * 销户送CPR逻辑处理
	 * @param customerVal
	 * @param action
	 * @param reqStatus
	 * @throws Exception
	 */
	public void dealTerminateSendCpr(ICustomerValue customerVal, int action, String reqStatus) throws Exception {
		if (customerVal.getCustId() == CmConstants.ANONYMOUS_CUST_ID) {
			// AI-14079 Global dummy customer send for CPR subscription 匿名客户增加过滤
			return;
		}
		//根据custId，查询出pnr,使用pnr查询 1，F记录
		long pnrLong = queryCprIdByCustIdOrPartyId(customerVal.getCustId()); 
		IBOCmCustRequestTaskValue[] taskValues = queryByCustIdAndReqStatus(pnrLong, "F");
		if(taskValues.length>0){
			if(action==taskValues[0].getRequestType()) {
				taskValues[0].setRequestStatus("C");
				saveCmCustRequestTask(taskValues[0]);
			}
		}
	}
	
	/**
	 *   检查客户是否还是其他客户的使用者或者是否还是其他账户的支付者
	 * @param customerVal
	 * @return
	 * return false 代表没有 代付关系并且没有使用者关系  true，代表你有代付关系或者有使用者关系
	 * @throws Exception 
	 */
	public boolean checkCustHasUserOrHasPayer(ICustomerValue customerVal) throws Exception {
		boolean checkResult = false;
		checkResult = checkIsHasUser(customerVal.getCustId());
		if(!checkResult) {
			checkResult = checkIsHasPayer(customerVal.getCustId(),customerVal.getPartyId());
		}
		return checkResult;
	}
	
	/**
	 * 
	 * @param custId
	 * @return
	 * @throws Exception 
	 */
	public boolean checkIsHasUser(long custId) throws Exception {
		boolean checkUserResult = false;
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmInsCmrelValue[] cmInsCmrelList = custSV.queryCmInsCmrel(custId,-1, -1,-1, -1, -1, -1,-1);
		Map<Long,List<Long>> userIdMap = new  HashMap<Long,List<Long>>();
		if (null!=cmInsCmrelList&&cmInsCmrelList.length>0) {
			for (IBOCmInsCmrelValue iboCmInsCmrelValue : cmInsCmrelList) {
				if(userIdMap.containsKey(iboCmInsCmrelValue.getUserId())) {
					userIdMap.get(iboCmInsCmrelValue.getUserId()).add(iboCmInsCmrelValue.getRelaType());
				}else {
					List<Long> relaTypeList = new ArrayList<Long>();
					relaTypeList.add(iboCmInsCmrelValue.getRelaType());
					userIdMap.put(iboCmInsCmrelValue.getUserId(), relaTypeList);
				}
			}
		}
		if(userIdMap.size()>0) {
			for (Map.Entry<Long, List<Long>> userIdEntry : userIdMap.entrySet()) {
				if(userIdEntry.getValue().size()==1&&userIdEntry.getValue().get(0)==1) {
					checkUserResult = true;
				}
			}
		}
		return checkUserResult;
	}
	
	/**
	 * 判断是否做其他非自身账户的payer
	 * @param partyId
	 * @return
	 * @throws Exception
	 */
	public boolean checkIsHasPayer(long custId,long partyId) throws Exception{
		ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
		DataContainer[]  payerResult = partySV.queryAcctInfoByPartyId(custId, partyId,-1);
		if(null!=payerResult&&payerResult.length>0) {
			return true;
		}
		return false;
	}
}