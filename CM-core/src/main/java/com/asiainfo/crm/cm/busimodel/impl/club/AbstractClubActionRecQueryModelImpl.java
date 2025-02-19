/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: AbstractClubActionRecQueryModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-10 下午7:30:02
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-10 LSC v1.0.0 修改原因
 */

package com.asiainfo.crm.cm.busimodel.impl.club;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubActionBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubActionRecBean;
import com.asiainfo.crm.cm.model.bo.ClubActionRecBean;

public abstract class AbstractClubActionRecQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubActionRecBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubActionBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}
	
	protected Class getReturnObjectClass() {
		return ClubActionRecBean.class;
	}
}
