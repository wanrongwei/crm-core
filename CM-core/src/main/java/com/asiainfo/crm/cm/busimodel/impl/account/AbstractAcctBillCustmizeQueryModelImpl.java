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
import com.asiainfo.crm.cm.inner.account.bo.BOCmBillCustomizeBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.AcctBillCustomizeBean;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;

/**   
* @Copyright Copyright (c) 2012 Asiainfo-Linkage
* @ClassName AbstractAcctBillCustmizeQueryModelImpl
* @Description 该类对查询账户客户化帐单定制操作的业务逻辑进行了抽象的实现
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
public abstract class AbstractAcctBillCustmizeQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel {

	/**   
	 * 根据客户化帐单定制编号查询账户客户化帐单定制的信息列表
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
	 * @date 2012-6-4 下午4:13:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4     zhangyin          v1.0.0               修改原因<br>
	 */
	public IAcctBillCustomizeValue queryAcctBillCustomizeById(long acctBillCustmizeId, int startNum, int endNum) throws Exception {
		AcctBillCustomizeBean billCustomizeBean = new AcctBillCustomizeBean();
		billCustomizeBean.setCustomizeId(acctBillCustmizeId);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { billCustomizeBean }, BOCmBillCustomizeBean.class);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum,
				endNum);
		AcctBillCustomizeBean acctBillCustomizeBean = null;
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			acctBillCustomizeBean = new AcctBillCustomizeBean();
			acctBillCustomizeBean.copy(dcs[0]);
		}
		// 查询完成之后的封装
		afterQueryAcctBillCustomizeById(acctBillCustomizeBean);
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		return acctBillCustomizeBean;
	}

	protected Class getReturnObjectClass() {
		return AcctBillCustomizeBean.class;
	}

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
	}

	/**   
	 * 该方法提供给根据根据客户化帐单定制编号查询账户客户化帐单定制的信息后的处理。如查询本地化的信息等。
	 * @Function afterQueryAcctBillCustomizeById
	 * @Description 
	 *
	 * @param acctBillCustomizeValue
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
	protected abstract void afterQueryAcctBillCustomizeById(IAcctBillCustomizeValue acctBillCustomizeValue) throws Exception;

}
