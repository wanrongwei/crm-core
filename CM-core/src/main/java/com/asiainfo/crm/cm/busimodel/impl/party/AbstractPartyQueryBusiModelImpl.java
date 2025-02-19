package com.asiainfo.crm.cm.busimodel.impl.party;

import com.asiainfo.crm.cm.busimodel.IMaskBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.model.bo.PartyBean;

public abstract class AbstractPartyQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryDataBusiModel, IQueryCountBusiModel, IMaskBusiModel {

	public Class getReturnObjectClass() {
		return PartyBean.class;
	}
}
