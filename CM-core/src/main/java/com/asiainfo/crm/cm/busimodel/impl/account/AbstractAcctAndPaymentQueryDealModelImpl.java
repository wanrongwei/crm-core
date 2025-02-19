package com.asiainfo.crm.cm.busimodel.impl.account;

import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;

/**   
* @Copyright Copyright (c) 2011 Asiainfo-Linkage
* @ClassName AbstractAcctQueryDealModelImpl
* @Description 该类对查询账户和账户支付方式操作的业务逻辑进行了抽象的实现
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
public abstract class AbstractAcctAndPaymentQueryDealModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel {

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
	}

}
