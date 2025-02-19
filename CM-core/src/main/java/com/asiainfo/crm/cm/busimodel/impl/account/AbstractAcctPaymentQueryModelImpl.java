package com.asiainfo.crm.cm.busimodel.impl.account;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctPaymentBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;

/**   
* @Copyright Copyright (c) 2012 Asiainfo-Linkage
* @ClassName AbstractAcctPayMentQueryModelImpl
* @Description 该类对查询账户支付方式操作的业务逻辑进行了抽象的实现
*
*
* @version: v1.0.0
* @author: zhangyin
* @date: 2011-12-28 上午10:12:15 
*
* Modification History:
* Date               Author            Version            Description
* -------------------------------------------------------------------
* 2011-12-28        zhangyin            v1.0.0                 修改原因
*/
public abstract class AbstractAcctPaymentQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel {

	protected final Class getReturnObjectClass() {
		return AcctPaymentBean.class;
	}

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
	}

	/**   
	 * 根据账户支付方式编号查询账户支付方式的信息列表
	 * @Function queryAcctPaymentById
	 * @Description 
	 *
	 * @param acctPaymentId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-6-4 下午8:56:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4     zhangyin          v1.0.0               修改原因<br>
	 */
	public IAcctPaymentValue queryAcctPaymentById(long acctPaymentId, int startNum, int endNum) throws Exception {
		AcctPaymentBean paymentBean = new AcctPaymentBean();
		paymentBean.setPaymentId(acctPaymentId);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { paymentBean }, BOCmAcctPaymentBean.class);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum,
				endNum);
		AcctPaymentBean acctPaymentBeanBean = null;
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			acctPaymentBeanBean = new AcctPaymentBean();
			acctPaymentBeanBean.copy(dcs[0]);
		}
		// 查询完成之后的封装
		afterQueryAcctPaymentById(acctPaymentBeanBean);
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		return acctPaymentBeanBean;
	}

	/**   
	 * 该方法提供给根据账户支付编号查询账户支付方式信息后的处理。如查询本地化的信息等。
	 * @Function afterQueryAcctPaymentById
	 * @Description 
	 *
	 * @param acctPaymentValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-6-4 下午3:38:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4     zhangyin          v1.0.0               修改原因<br>
	 */
	protected abstract void afterQueryAcctPaymentById(IAcctPaymentValue acctPaymentValue) throws Exception;

}
