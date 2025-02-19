package com.asiainfo.crm.cm.busimodel.impl.account;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;

/**   
* @Copyright Copyright (c) 2012 Asiainfo-Linkage
* @ClassName AbstractAcctQueryDealModelImpl
* @Description 该类对查询账户操作的业务逻辑进行了抽象的实现
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
public abstract class AbstractAccountQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel {

	protected Class getReturnObjectClass() {
		return AccountBean.class;
	}

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
	}

	/**  
	 * 根据账户编号查询账户信息 
	 * @Function queryAccountById
	 * @Description 
	 *
	 * @param acctId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-6-4 下午4:13:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4     zhangyin          v1.0.0               修改原因<br>
	 */
	public IAccountValue queryAccountById(long acctId, int startNum, int endNum) throws Exception {
		AccountBean acctBean = new AccountBean();
		acctBean.setAcctId(acctId);
		Parameter parameter = ParamUtil.buildParameter(acctBean, BOCmAccountBean.class);
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum,
				endNum);
		AccountBean accountBean = null;
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			accountBean = new AccountBean();
			accountBean.copy(dcs[0]);
		}
		// 查询完成之后的封装
		afterQueryAccountById(accountBean);
		return accountBean;
	}

	/**   
	 * @Function afterQueryAccountById
	 * @Description 该方法提供给根据账户编号查询账户信息后的处理。如查询本地化的信息等。
	 *
	 * @param accountValue
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
	public abstract void afterQueryAccountById(IAccountValue accountValue) throws Exception;
}
