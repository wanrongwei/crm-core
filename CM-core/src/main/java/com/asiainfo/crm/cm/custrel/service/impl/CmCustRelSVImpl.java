package com.asiainfo.crm.cm.custrel.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.custrel.bo.BOCmCustRelBean;
import com.asiainfo.crm.cm.custrel.bo.BOCmCustRelEngine;
import com.asiainfo.crm.cm.custrel.ivalues.IBOCmCustRelValue;
import com.asiainfo.crm.cm.custrel.service.interfaces.ICmCustRelSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

/**
 * User: caiwm Date: 13-8-7 Time: 下午12:02
 */
public class CmCustRelSVImpl implements ICmCustRelSV {
	//把state为e的不查
	@Override
	public IBOCmCustRelValue[] queryCustById(long custId, int startNum,
			int endNum) throws Exception {
		// 根据传入的cust_id查找表cm_cust_rel
		StringBuffer condition = new StringBuffer(" 1=1 ");
		condition.append(" AND ").append(IBOCmCustRelValue.S_CustId)
				.append(" =:custId ").append(" AND ").append(IBOCmCustRelValue.S_State+"='U'");
		Map parameter = new HashMap();
		parameter.put("custId", custId);
		//记录业务日志
		ICmCommonSV commonSV=(ICmCommonSV)ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonQryBusiLogWithCustId(CmConstants.BusiLogId.GRP_REL, condition.toString(), parameter, CmConstants.BusiLogType.CUSTOMER_LOG,custId);
		IBOCmCustRelValue[] result = (IBOCmCustRelValue[]) CmInnerServiceFactory
				.getCommonInnerSV().getBeans(BOCmCustRelBean.class,
						condition.toString(), parameter, startNum, endNum);
		//将关联客户id替换为关联客户名称
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory
				.getService(ICmCustomerSV.class);
		ICustomerValue custVal = null;
		for (int i = 0; i < result.length; i++) {
			custVal = service.queryCustomerByCustId(result[i].getRelCustId());
			result[i].setDiaplayAttr("REL_CUST_ID", "REAL_CUST_NAME",
					custVal.getCustName());
		}
		return result;
	}

	@Override
	public int queryCountById(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		condition.append(" AND ").append(IBOCmCustRelValue.S_CustId)
				.append(" =:custId ");
		Map parameter = new HashMap();
		parameter.put("custId", custId);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(
				BOCmCustRelBean.class, condition.toString(), parameter);
	}

	@Override
	public IBOCmCustRelValue[] queryByPrimraryKey(long primaryKey)
			throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		condition.append(" AND ").append(IBOCmCustRelValue.S_RelId)
				.append(" =:relId ");
		Map parameter = new HashMap();
		parameter.put("relId", primaryKey);

		IBOCmCustRelValue[] result = (IBOCmCustRelValue[]) CmInnerServiceFactory
				.getCommonInnerSV().getBeans(BOCmCustRelBean.class,
						condition.toString(), parameter, -1, -1);
		return result;
	}

	@Override
	public void saveCustRel(IBOCmCustRelValue val) throws Exception {
		if (val.isNew()) {
			ICmCustRelSV sv = (ICmCustRelSV) ServiceFactory
					.getService(ICmCustRelSV.class);
			boolean isRelated = sv.isRelated(val.getCustId(), val.getRelType(),
					val.getRelCustId());
			//如果已經存在關係
			if (isRelated) {
				ExceptionUtil.throwBusinessException(
						"CMS9988802",
						new String[] { String.valueOf(val.getCustId()),
								String.valueOf(val.getRelType()),
								String.valueOf(val.getRelCustId()) });
			}else {
				val.setRelId(CmCommonUtil.getNewSequence(BOCmCustRelBean.class));
				val.setState("U");
				val.setCreateOpId(ServiceManager.getUser().getID());
				val.setCreateOrgId(ServiceManager.getUser().getOrgId());
				val.setCreateDate(ServiceManager.getOpDateTime());
				val.setRegionId(CmCommonUtil.getDefaultRegionId());
			}
		} else if (val.isModified()) {
			val.setOpId(ServiceManager.getUser().getID());
			val.setOrgId(ServiceManager.getUser().getOrgId());
			val.setDoneDate(ServiceManager.getOpDateTime());
		} else if (val.isDeleted()) {
			val.setState("E");// 刪除
			val.setOpId(ServiceManager.getUser().getID());
			val.setOrgId(ServiceManager.getUser().getOrgId());
			val.setDoneDate(ServiceManager.getOpDateTime());
			val.setRegionId(CmCommonUtil.getDefaultRegionId());
		}
		//记录业务日志
		ICmCommonSV commonSV=(ICmCommonSV)ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCommonBusiLog(CmConstants.BusiLogId.GRP_REL, new IBOCmCustRelValue[]{val}, CmConstants.BusiLogType.CUSTOMER_LOG, val.getCustId());
		BOCmCustRelEngine.save(val);
		
	}

	@Override
	public void saveBatchCustRel(IBOCmCustRelValue[] val) throws Exception {
		if (val != null && val.length > 0) {
			ICmCustRelSV sv = (ICmCustRelSV) ServiceFactory
					.getService(ICmCustRelSV.class);
			for (int i = 0; i < val.length; i++) {
				if (val[i].isNew()) {

					boolean isRelated = sv.isRelated(val[i].getCustId(),
							val[i].getRelType(), val[i].getRelCustId());
					if (isRelated) {
						ExceptionUtil
								.throwBusinessException("CMS9988802", new String[] {
										String.valueOf(val[i].getCustId()),
										String.valueOf(val[i].getRelType()),
										String.valueOf(val[i].getRelCustId()) });
					}
					val[i].setRelId(CmCommonUtil
							.getNewSequence(BOCmCustRelBean.class));
					val[i].setState("U");
					val[i].setCreateOpId(ServiceManager.getUser().getID());
					val[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
					val[i].setCreateDate(ServiceManager.getOpDateTime());
				} else if (val[i].isModified()) {
					val[i].setOpId(ServiceManager.getUser().getID());
					val[i].setOrgId(ServiceManager.getUser().getOrgId());
					val[i].setDoneDate(ServiceManager.getOpDateTime());
				} else if (val[i].isDeleted()) {
					val[i].setState("E");// 刪除
					val[i].setOpId(ServiceManager.getUser().getID());
					val[i].setOrgId(ServiceManager.getUser().getOrgId());
					val[i].setDoneDate(ServiceManager.getOpDateTime());
				}
			}
			
			//记录业务日志
			ICmCommonSV commonSV=(ICmCommonSV)ServiceFactory.getService(ICmCommonSV.class);
			commonSV.saveCommonBusiLog(CmConstants.BusiLogId.GRP_REL, val, CmConstants.BusiLogType.CUSTOMER_LOG, -1);
			BOCmCustRelEngine.saveBatch(val);
		}

	}

	@Override
	public boolean isRelated(long custId, long realType, long relCustId)
			throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		condition.append(" AND ").append(IBOCmCustRelValue.S_CustId)
				.append(" =:custId ");
		condition.append(" AND ").append(IBOCmCustRelValue.S_RelType)
				.append(" =:relType ");
		condition.append(" AND ").append(IBOCmCustRelValue.S_RelCustId)
				.append(" =:relCustId ");
		Map parameter = new HashMap();
		parameter.put("custId", custId);
		parameter.put("relType", realType);
		parameter.put("relCustId", relCustId);
		int count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(
				BOCmCustRelBean.class, condition.toString(), parameter);
		if (count > 0) {
			return true;
		}
		return false;
	}


	public int queryCustByIdCount(long custId) throws Exception {		
		return queryCustById(custId, -1, -1).length;
	}
}
