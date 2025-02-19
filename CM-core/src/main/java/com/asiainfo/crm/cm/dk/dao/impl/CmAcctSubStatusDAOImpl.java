package com.asiainfo.crm.cm.dk.dao.impl;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.util.criteria.Criteria;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctSubStatusBean;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctSubStatusEngine;
import com.asiainfo.crm.cm.dk.dao.interfaces.ICmAcctSubStatusDAO;

public class CmAcctSubStatusDAOImpl implements ICmAcctSubStatusDAO {
	
	public DataContainerInterface[] queryAcctSubStatusValuesInAll(long custId, long acctId, long substate, int start, int end) throws Exception {
		Criteria sql = new Criteria();
		if ( custId > 0 ){
			sql.addEqual(BOCmAcctSubStatusBean.S_CustId, String.valueOf(custId) );
		}
		if ( substate >= 0 ){
			sql.addEqual( BOCmAcctSubStatusBean.S_SubAcctStatus , String.valueOf(substate));
		}
		if ( acctId > 0 ){
			sql.addEqual( BOCmAcctSubStatusBean.S_AcctId , String.valueOf(acctId));
		}
		return BOCmAcctSubStatusEngine.getBeans(null, sql.toString(), sql.getParameters(), start, end, false);
	}
	
	public int queryAcctSubStatusValuesCountInAll(long custId, long acctId, long substate) throws Exception {
		Criteria sql = new Criteria();
		if ( custId > 0 ){
			sql.addEqual(BOCmAcctSubStatusBean.S_CustId, String.valueOf(custId) );
		}
		if ( substate >= 0 ){
			sql.addEqual( BOCmAcctSubStatusBean.S_SubAcctStatus , String.valueOf(substate));
		}
		if ( acctId > 0 ){
			sql.addEqual( BOCmAcctSubStatusBean.S_AcctId , String.valueOf(acctId));
		}
		return BOCmAcctSubStatusEngine.getBeansCount(sql.toString(), sql.getParameters());
	}
	
}
