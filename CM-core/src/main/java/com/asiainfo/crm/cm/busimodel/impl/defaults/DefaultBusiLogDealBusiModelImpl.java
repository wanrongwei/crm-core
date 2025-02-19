package com.asiainfo.crm.cm.busimodel.impl.defaults;

import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.busimodel.impl.log.AbstractBusiLogDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;
import com.asiainfo.crm.common.ivalues.IBOBsOperationValue;

/**
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName DefaultBusiLogDealModelImpl
 * @Description 业务日志默认实现类
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Feb 20, 2012 4:32:31 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Feb 20, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public class DefaultBusiLogDealBusiModelImpl extends AbstractBusiLogDealBusiModelImpl {

	

	protected void notify(IVOBusiLogValue logValue) throws Exception {
		if (isNeedSaveSoLog(logValue)) {
			ICmBusiLogValue mainBusiLogValue = logValue.getMainBusiLog();
			if (CmCommonUtil.isNotEmptyObject(mainBusiLogValue)) {
				CmServiceFactory.getTeamInvokeSV().saveSoBusiLog(mainBusiLogValue);
			}
		}
	}

	private boolean isNeedSaveSoLog(IVOBusiLogValue logValue) throws Exception {
		IBOBsOperationValue operationValue = CmBusiLogFactory.getOperationValue(logValue.getBusinessId());
		return (operationValue == null) ? false : DataType.getAsBoolean(operationValue.getReportFlag());
	}

	@Override
	protected void dealOtherThings(IVOBusiLogValue logValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void processBeforeDeal(IVOBusiLogValue logValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
