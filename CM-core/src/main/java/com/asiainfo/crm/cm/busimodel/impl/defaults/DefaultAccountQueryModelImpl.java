package com.asiainfo.crm.cm.busimodel.impl.defaults;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAccountQueryModelImpl;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;

/**   
* @Copyright Copyright (c) 2011 Asiainfo-Linkage
* @ClassName DefaultAcctQueryDealModelImpl
* @Description 查询账户处理的默认继承类，提供创建类对象使用
*
*
* @version: v1.0.0
* @author: zhangyin
* @date: 2011-12-28 上午10:13:08 
*
* Modification History:
* Date               Author            Version            Description
* -------------------------------------------------------------------
* 2011-12-28        zhangyin            v1.0.0                 修改原因
*/
public class DefaultAccountQueryModelImpl extends AbstractAccountQueryModelImpl {

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		return ParamUtil.buildParameter(conditionDCs, BOCmAccountBean.class);
	}

	@Override
	public void afterQueryAccountById(IAccountValue accountValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
