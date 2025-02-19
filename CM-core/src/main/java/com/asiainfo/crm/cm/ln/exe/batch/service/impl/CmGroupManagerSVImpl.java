package com.asiainfo.crm.cm.ln.exe.batch.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.exe.batch.service.interfaces.ICmGroupManagerSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustManagerBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmGroupManagerSVImpl implements ICmGroupManagerSV {

	private transient static Log log = LogFactory.getLog(CmGroupManagerSVImpl.class);

	public void importGroupManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IBOCmGroupManagerValue iboCmGroupManager = checkMethod(colNames, colValues);// 方法 检测
		// 调用保存方法 删除集团客户与客户经理关系表
		saveCmGroupManageValue(new IBOCmGroupManagerValue[] { iboCmGroupManager }, "ADD");
	}

	/**
	 * 集团客户经理批量删除
	 */
	public void deleteGroupManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		checkMethodDelete(colNames, colValues);// 方法 检测

	}

	// 保存方法
	private void saveCmGroupManageValue(IBOCmGroupManagerValue[] iboCmGroupManager, String meth) throws Exception {
		IVOCustValue iCustValue = new VOCustBean();
		ICustManagerValue icustManager = null;
		int len = iboCmGroupManager.length;
		for (int i = 0; i < len; i++) {
			icustManager = new CustManagerBean();
			if ("ADD".equals(meth)) {
				icustManager.copy(iboCmGroupManager[i]);
				icustManager.setRelId(CmCommonUtil.getNewSequence(BOCmGroupManagerBean.class));
				icustManager.setRegionId(iboCmGroupManager[i].getRegionId());
//				groupManagerBeans.setRelType(CmLnConstants.CmRelType.RELTYPE2);
//				groupManagerBeans.setOperType(CmLnConstants.CmOpType.OPYPE0);
				icustManager.setState(CmConstants.RecordState.USE);
//				icustManager.setStsToNew();
			} else {
				icustManager.initProperty(IBOCmGroupManagerValue.S_RelId, iboCmGroupManager[i].getRelId());
				icustManager.initProperty(IBOCmGroupManagerValue.S_RegionId, iboCmGroupManager[i].getRegionId());
				icustManager.delete();
			}
//			groupManagerBeans.setCustId(iboCmGroupManager[i].getCustId());
//			groupManagerBeans.setOperType(iboCmGroupManager[i].getOperType());
//			groupManagerBeans.setManagerId(iboCmGroupManager[i].getManagerId());
			// CmInnerServiceFactory.getCommonInnerSV().saveBeans(groupManagerBeans);
			iCustValue.addCustManager(icustManager);
		}
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getCrossCenterService(ICmCustomerSV.class);
		customerSV.saveCustomer(iCustValue);
	}

	// 校验方法
	public IBOCmGroupManagerValue checkMethod(String[] colNames, String[] colValues) throws Exception {
		IBOCmGroupManagerValue iboCmGrpManager = new BOCmGroupManagerBean();
		long managerId = -1;
		String custServiceId = "";
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if (iboCmGrpManager.S_CustId.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS8000000")); // 集团编码不能为空!
					ExceptionUtil.throwBusinessException("CMS8000000");
				} else if (iboCmGrpManager.S_ManagerId.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS8000002")); // 客户经理编号不能为空！
					ExceptionUtil.throwBusinessException("CMS8000002");
				} else if (iboCmGrpManager.S_Remarks.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS1100106"));
					ExceptionUtil.throwBusinessException("CMS1100106");
				}
			} else {
				if (iboCmGrpManager.S_CustId.equals(colNames[i])) {
					// iboCmGrpManager.setCustId(Long.valueOf(colValues[i]));
					custServiceId = String.valueOf(colValues[i]);
				} else if (iboCmGrpManager.S_ManagerId.equals(colNames[i])) {
					managerId = Long.valueOf(colValues[i]);
					iboCmGrpManager.setManagerId(Long.valueOf(colValues[i]));
				} else if (iboCmGrpManager.S_Remarks.equals(colNames[i])) {
					iboCmGrpManager.setRemarks(colValues[i]);
				}
			}
		}

		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		// 根据集团编码查找集团客户信息
		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
		if (CmCommonUtil.isEmptyObject(groupValues)) {
			throw new Exception("According to the group number [" + custServiceId + "] did not inquire into the corresponding information group!");
		}
		// 判断是否为集团的客户经理
		DataContainer queryCmGroupManagerDC = new DataContainer();
		queryCmGroupManagerDC.set(IBOCmGroupManagerValue.S_ManagerId, managerId);// 客户经理编号
		queryCmGroupManagerDC.set(IBOCmGroupManagerValue.S_CustId, groupValues[0].getCustId());// 集团编码
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		// 查询集团客户经理关系
		IBOCmGroupManagerValue[] cmGrpManagerValue = cmCustomerSV.queryManagerValue(queryCmGroupManagerDC, CmLnConstants.CustType.CUST_TYPE_GROUP, -1, -1);
		if (CmCommonUtil.isEmptyObject(cmGrpManagerValue)) {
			throw new Exception("customer manager[" + managerId + "]is the Group [" + custServiceId + "]Customer manager!");
		}

		iboCmGrpManager.setCustId(groupValues[0].getCustId());
		iboCmGrpManager.setOperType(CmLnConstants.CmOpType.OPYPE0);
		iboCmGrpManager.setRelType(CmLnConstants.CmRelType.RELTYPE2);
		iboCmGrpManager.setState(CmLnConstants.GroupManagerState.State_U);
		iboCmGrpManager.setCreateDate(CmLnCommonUtil.getSysDateTime());
		iboCmGrpManager.setRegionId(groupValues[0].getRegionId());
		return iboCmGrpManager;
	}

	// 校验方法
	public void checkMethodDelete(String[] colNames, String[] colValues) throws Exception {
		String custServiceId = "";// 集团编码
		long managerId = 0L;// 客户经理编码
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("CUST_SERVICE_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS8000000")); // 集团编码不能为空!
					ExceptionUtil.throwBusinessException("CMS8000000");
				} else if (IBOCmGroupManagerValue.S_ManagerId.equals(colNames[i])) {// 客户经理编码
					log.error("Customer manager code can not be empty!");
					throw new Exception("Customer manager code can not be empty!");
				}
			} else {
				if ("CUST_SERVICE_ID".equals(colNames[i])) {
					custServiceId = String.valueOf(colValues[i]);
				} else if (IBOCmGroupManagerValue.S_ManagerId.equals(colNames[i])) {
					managerId = Long.parseLong(colValues[i]);
				}
			}
		}
		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		// 根据集团编码查找集团客户信息
		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
		if (groupValues == null || groupValues.length <= 0)
			throw new Exception("According to the group number:" + custServiceId + "did not find the corresponding customer information!");
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer queryCmGroupManagerDC = new DataContainer();
		queryCmGroupManagerDC.set(IBOCmGroupManagerValue.S_ManagerId, managerId);// 客户经理编号
		queryCmGroupManagerDC.set(IBOCmGroupManagerValue.S_CustId, groupValues[0].getCustId());// 集团编码
		// 查询集团客户经理关系
		IBOCmGroupManagerValue[] cmGrpManagerValue = cmCustomerSV.queryManagerValue(queryCmGroupManagerDC, CmLnConstants.CustType.CUST_TYPE_GROUP, -1, -1);

		if (cmGrpManagerValue == null || cmGrpManagerValue.length < 1) {
			log.error(CrmLocaleFactory.getResource("CMS8000004")); // 集团客户与客户经理信息关系不正确！
			// ExceptionUtil.throwBusinessException("CMS1100207", String.valueOf(iboCmGrpManager.getCustId()));
			throw new Exception("Customer Manager[" + managerId + "]is not group[" + custServiceId + "]Customer manager!");
		} else {
			if (cmGrpManagerValue[0].getRelType() == CmLnConstants.CmRelType.RELTYPE1) {// 是主要客户经理
				throw new Exception("Customer Manager[" + managerId + "]is group[" + custServiceId + "]the main customer manager, cannot be deleted!");
			}
			// if (cmGrpManagerValue[0].getRelId() != CmLnConstants.CmRelType.RELTYPE1) {// 不是主要客户经理
			// iboCmGrpManager.initProperty("REL_ID", cmGrpManagerValue[0].getRelId());
			// iboCmGrpManager.setRegionId(cmGrpManagerValue[0].getRegionId());
			// iboCmGrpManager.setState(CmLnConstants.GroupManagerState.State_E);
			// }
			List list = new ArrayList();
			list.add(cmGrpManagerValue[0]);
			saveCmGroupManageValue((IBOCmGroupManagerValue[]) list.toArray(new IBOCmGroupManagerValue[0]), "DEL");

		}
		// //根据集团编号查询客户经理关系对象
		// ICmGrpManagerSV cmGrpManager = (ICmGrpManagerSV) ServiceFactory.getService(ICmGrpManagerSV.class);
		// IBOCmGroupManagerValue[] cmGrpManagerValue=cmGrpManager.queryCmGrpManagerValues(iboCmGrpManager.getCustId());
		// List list=new ArrayList();
		// if (cmGrpManagerValue==null || cmGrpManagerValue.length<1) {
		// log.error(CrmLocaleFactory.getResource("CMS8000004")); //集团客户与客户经理信息关系不正确！
		// ExceptionUtil.throwBusinessException("CMS1100207",String.valueOf(iboCmGrpManager.getCustId()));
		// }else {
		// for (int i = 0; i < cmGrpManagerValue.length; i++) {
		// if (cmGrpManagerValue[i].getRelId()!=CmLnConstants.CmRelType.RELTYPE1) {//不是主要客户经理
		// iboCmGrpManager.initProperty("REL_ID", cmGrpManagerValue[i].getRelId());
		// iboCmGrpManager.setRegionId(cmGrpManagerValue[0].getRegionId());
		// iboCmGrpManager.setState(CmLnConstants.GroupManagerState.State_E);
		// list.add(iboCmGrpManager);
		// }
		// }
		// }
		// if (list.size()>0) {
		// //调用删除方法 保存集团客户与客户经理关系表
		// saveCmGroupManageValue((IBOCmGroupManagerValue[])list.toArray(new IBOCmGroupManagerValue[0]),"DEL");
		// }
	}

	// 批量新增 add by guansj
	public void importGroupManagerForBP(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		// 调用保存方法 删除集团客户与客户经理关系表
		IBOCmGroupManagerValue iboCmGroupManager = checkMethodforBP(colNames, colValues);// 方法 检测;
		saveCmGroupManageValue(new IBOCmGroupManagerValue[] { iboCmGroupManager }, "ADD");

	}

	// 批量新增校验 add by guansj
	private IBOCmGroupManagerValue checkMethodforBP(String[] colNames, String[] colValues) throws Exception {

		String custServiceId = "";// 集团编码
		long managerId = 0L;// 客户经理编码
		String relType = "";// 客户经理类型 1为主要 2为辅助
		String matchType = "";// 是否强制替换为主要客户经理标识 0为不替换 2为替换
		String remarks = "";
		// 输入信息规则校验
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("CUST_SERVICE_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS8000000")); // 集团编码不能为空!
					ExceptionUtil.throwBusinessException("CMS8000000");
				} else if (IBOCmGroupManagerValue.S_ManagerId.equals(colNames[i])) {// 客户经理编码
					log.error("Customer manager code can not be empty!");
					throw new Exception("Customer manager code can not be empty!");
				} else if ("REL_TYPE".equals(colNames[i])) {// 客户经理编码
					log.error("Customer manager type cannot be null!");
					throw new Exception("Customer manager type cannot be null!");
				} else if ("MATCH_TYPE".equals(colNames[i])) {// 客户经理编码
					log.error("Whether compulsorily replaced as the main customer manager identifies cannot be empty!");
					throw new Exception("Whether compulsorily replaced as the main customer manager identifies cannot be empty!");
				}
			} else {
				if ("CUST_SERVICE_ID".equals(colNames[i])) {
					custServiceId = String.valueOf(colValues[i]);
				}
				if (IBOCmGroupManagerValue.S_ManagerId.equals(colNames[i])) {
					managerId = Long.parseLong(colValues[i]);
				}
				if ("REL_TYPE".equals(colNames[i])) {
					relType = String.valueOf(colValues[i]);
					if ("1".equals(relType) || "2".equals(relType)) {

					} else {
						log.error("Unable to identify the type of customer manager!");
						throw new Exception("Unable to identify the type of customer manager!");
					}
				}
				if ("MATCH_TYPE".equals(colNames[i])) {
					matchType = String.valueOf(colValues[i]);
					if ("0".equals(matchType) || "2".equals(matchType)) {

					} else {
						log.error("Whether the compulsory substitution does not recognize the identification!");
						throw new Exception("Whether the compulsory substitution does not recognize the identification!");
					}
				} else {
					remarks = colValues[i];
				}
			}

		}

		// 查询集团信息
		DataContainer queryDC = new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);

		ICustomerValue[] groupValues = CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
		long custId = groupValues[0].getCustId();
		// 是否存在该集团
		if (groupValues == null || groupValues.length <= 0) {
			throw new Exception("According to the group number:" + custServiceId + "did not find the information!");
		}
		// 集团存在 ，根据集团编码和客户经理编码查询集团是否存在该客户经理
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer queryGroupManagerDC = new DataContainer();
		// queryGroupManagerDC.set(IBOCmGroupManagerValue.S_ManagerId, managerId);//客户经理编号
		queryGroupManagerDC.set(IBOCmGroupManagerValue.S_CustId, groupValues[0].getCustId());// 集团编码
		IBOCmGroupManagerValue[] cmGrpManagerValue = cmCustomerSV.queryManagerValue(queryGroupManagerDC, CmLnConstants.CustType.CUST_TYPE_GROUP, -1, -1);
		IBOCmGroupManagerValue temp = null;
		if (CmCommonUtil.isNotEmptyObject(cmGrpManagerValue)) {
			if ("1".equals(relType) && "0".equals(matchType)) {
				for (int i = 0, len = cmGrpManagerValue.length; i < len; i++) {
					if (cmGrpManagerValue[i].getRelType() == 1) {
						throw new Exception("The group of customers:" + custServiceId + "The main customer manager already exists, only forced into the main customer manager!");
					}
				}
			} else if ("1".equals(relType) && "2".equals(matchType)) {
				for (int i = 0, len = cmGrpManagerValue.length; i < len; i++) {
					if (cmGrpManagerValue[i].getRelType() == 1) {
						temp = cmGrpManagerValue[i];
						temp.setManagerId(managerId);
					}
				}
			} else {
				for (int i = 0, len = cmGrpManagerValue.length; i < len; i++) {
					if (cmGrpManagerValue[i].getManagerId() == managerId) {
						throw new Exception("Customer Manager:" + managerId + "already exists, do not need to re allocation!");
					}
				}
			}

		}

		IBOCmGroupManagerValue iboCmGrpManager = new BOCmGroupManagerBean();
		if (temp == null) {
			iboCmGrpManager.setCustId(custId);
			iboCmGrpManager.setManagerId(managerId);
			iboCmGrpManager.setRelType(Integer.parseInt(relType));
			iboCmGrpManager.setState(CmLnConstants.GroupManagerState.State_U);
			iboCmGrpManager.setCreateDate(CmLnCommonUtil.getSysDateTime());
			iboCmGrpManager.setRegionId(groupValues[0].getRegionId());
			iboCmGrpManager.setRemarks(remarks);
		} else {
			iboCmGrpManager.copy(temp);
		}

		// }
		return iboCmGrpManager;
	}
}
