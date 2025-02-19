package com.asiainfo.crm.cm.inner.account.service.impl;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.account.service.interfaces.ICmAccountInnerSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

/**   
 * @Function: CmAccountInnerSVImpl.java 
 * @Description: 提供账户的服务实现

 * @version: v1.0.0
 * @author: zhangyin
 * @date: 2011-12-14 下午05:27:08 s
 *
 * Modification History:
 * Date               Author            Version            Description
 * -------------------------------------------------------------------
 * 2011-12-14        zhangyin            v1.0.0                 修改原因
 */
public class CmAccountInnerSVImpl implements ICmAccountInnerSV {

	public int qryCmAcctPaymentInfoCount(DataContainer condition, String otherCond, Class beanClass) throws Exception {
		Parameter param = makeParams(condition, otherCond);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(beanClass, param.getCondition(), param.getParameter());
	}

	public DataContainerInterface[] qryCmAcctPaymentInfos(DataContainer condition, String otherCond, Class beanClass, int startIndex, int endIndex) throws Exception {
		Parameter param = makeParams(condition, otherCond);
		return CmInnerServiceFactory.getCommonInnerSV().getBeans(beanClass, param.getCondition(), param.getParameter(), startIndex, endIndex);
	}

	/**
	 * 拼接条件公用方法
	 * @param dcParam
	 * @param otherCondition
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: 2011-12-11 下午09:49:34
	 */
	private Parameter makeParams(DataContainer dcParam, String otherCondition) {
		Parameter paramInfo = new Parameter();
		StringBuffer condition = new StringBuffer();
		condition.append(" 1=1 ");
		if (dcParam != null) {
			String[] paramNames = dcParam.getPropertyNames();
			for (int i = 0; i < paramNames.length; i++) {
				if (dcParam.get(paramNames[i]) != null && StringUtils.isNotBlank(dcParam.getAsString(paramNames[i]))) {
					condition.append(" AND ").append(" ").append(paramNames[i]).append(" ").append(" = :").append(paramNames[i]).append(" ");
				}
			}
			paramInfo.setParameter(dcParam.getProperties());
		}
		if (otherCondition != null && StringUtils.isNotBlank(otherCondition)) {
			condition.append(" AND ").append(otherCondition);
		}
		paramInfo.setCondition(condition.toString());

		return paramInfo;
	}

	public DataContainerInterface[] queryCustAcctRelsByAcctIdOrCustId(long acctId, long custId, Class beanClass, int startIndex, int endIndex) throws Exception {
		if (acctId <= 0 && custId <= 0) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(IBOCmCustAcctRelValue.S_State).append(" = 'U'");
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_AcctId).append(" =:acctId ");
			parameter.put("acctId", Long.valueOf(acctId));
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_RelCustId).append(" =:custId ");
			parameter.put("custId", Long.valueOf(custId));
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeans(beanClass, condition.toString(), parameter, startIndex, endIndex);
	}

	public int queryCustAcctRelsByAcctIdOrCustIdCount(long acctId, long custId, Class beanClass) throws Exception {
		if (acctId <= 0 && custId <= 0) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(IBOCmCustAcctRelValue.S_State).append(" = 'U'");
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_AcctId).append(" =:acctId ");
			parameter.put("acctId", Long.valueOf(acctId));
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_RelCustId).append(" =:custId ");
			parameter.put("custId", Long.valueOf(custId));
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(beanClass, condition.toString(), parameter);
	}
	
	public DataContainerInterface[] queryCustAcctRelsAllByAcctIdOrCustId(long acctId, long custId, Class beanClass, int startIndex, int endIndex) throws Exception {
		if (acctId <= 0 && custId <= 0) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_AcctId).append(" =:acctId ");
			parameter.put("acctId", Long.valueOf(acctId));
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_RelCustId).append(" =:custId ");
			parameter.put("custId", Long.valueOf(custId));
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeans(beanClass, condition.toString(), parameter, startIndex, endIndex);
	}

	public int queryCustAcctRelsAllByAcctIdOrCustIdCount(long acctId, long custId, Class beanClass) throws Exception {
		if (acctId <= 0 && custId <= 0) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_AcctId).append(" =:acctId ");
			parameter.put("acctId", Long.valueOf(acctId));
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_RelCustId).append(" =:custId ");
			parameter.put("custId", Long.valueOf(custId));
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(beanClass, condition.toString(), parameter);
	}
	
	
	public DataContainerInterface[] queryCustAcctRelsByAcctIdOrCustIdOrInstallmentFlag(long acctId, long custId, long installmentFlag, Class beanClass, int startIndex, int endIndex) throws Exception {
		if (acctId <= 0 && custId <= 0) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(IBOCmCustAcctRelValue.S_State).append(" = 'U'");
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_AcctId).append(" =:acctId ");
			parameter.put("acctId", Long.valueOf(acctId));
		}
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_RelCustId).append(" =:custId ");
			parameter.put("custId", Long.valueOf(custId));
		}
		if (installmentFlag >= 0) {
			condition.append(" AND ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append(" =:installmentFlag ");
			parameter.put("installmentFlag", Long.valueOf(installmentFlag));
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeans(beanClass, condition.toString(), parameter, startIndex, endIndex);
	}

}
