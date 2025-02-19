package com.asiainfo.crm.cm.dk.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.teaminvoke.service.interfaces.ICrmSecSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctSubStatusBean;
import com.asiainfo.crm.cm.dk.dao.interfaces.ICmAcctSubStatusDAO;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmAcctSubStatusSV;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;

public class CmAcctSubStatusSVImpl implements ICmAcctSubStatusSV {

	@Override
	public void saveCmAcctSubStatusValue(BOCmAcctSubStatusBean value) throws Exception {
		ICmCommonInnerSV cmCommonInerSV = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		
		if ( value.isNew() ){
			// 查询表里是否有记录
			BOCmAcctSubStatusBean oldvalue = getAcctSubStatusValue( value.getAcctId() );
			if ( oldvalue!=null ){
				// 表里有记录，修改老数据 账户状态
				long substate = value.getSubAcctStatus();
				value.copy(oldvalue);
				value.setSubAcctStatus( substate );
			}else {
				// 表里无记录,则新增
				// 判断保存记录的客户id 是否为空，如果为空，则取账户的客户id赋值
				if ( value.getCustId()<=0 ){
					ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
					IAccountValue account = accountSV.queryAccountById(value.getAcctId());
					value.setCustId( account.getCustId() );
				}
			}
		}
		
		CmCommonUtil.setCommonValue(value);
		cmCommonInerSV.saveBean(value);
	}

	@Override
	public void saveCmAcctSubStatusValue(long acctId, long substate) throws Exception {
		BOCmAcctSubStatusBean value = new BOCmAcctSubStatusBean();
		value.setAcctId(acctId);
		value.setSubAcctStatus(substate);
		
		saveCmAcctSubStatusValue(value);
	}
	
	@Override
	public DataContainerInterface[] queryAcctSubStatusValuesInAll(long custId, long acctId, long substate, int start, int end) throws Exception {
		ICmAcctSubStatusDAO dao = (ICmAcctSubStatusDAO) ServiceFactory.getService(ICmAcctSubStatusDAO.class);
		
		ICrmSecSV secSV = (ICrmSecSV) ServiceFactory.getService(ICrmSecSV.class);
		DataContainerInterface[] dcs = dao.queryAcctSubStatusValuesInAll( custId,  acctId,  substate,  start,  end);
		
		List<DataContainerInterface> rtnList = new ArrayList<DataContainerInterface>();
		for (int i=0; dcs!=null && i<dcs.length; i++){
			DataContainerInterface dc = new DataContainer();
			dc.copy(dcs[i]);
			rtnList.add(dc);
			
			UserInfoInterface createOperater = secSV.getUserInfoByOperId( dc.getAsString("CREATE_OP_ID") );
			if ( createOperater!=null ){
				dc.set("CREATE_OP_NAME", createOperater.getCode());
			}
			UserInfoInterface operater = secSV.getUserInfoByOperId( dc.getAsString("OP_ID") );
			if ( operater!=null ){
				dc.set("OP_NAME", operater.getCode());
			}
		}
		return rtnList.toArray(new DataContainerInterface[rtnList.size()]);
	}

	@Override
	public int queryAcctSubStatusValuesCountInAll(long custId, long acctId, long substate) throws Exception {
		ICmAcctSubStatusDAO dao = (ICmAcctSubStatusDAO) ServiceFactory.getService(ICmAcctSubStatusDAO.class);
		
		return dao.queryAcctSubStatusValuesCountInAll(custId, acctId, substate);
	}
	
	@Override
	public BOCmAcctSubStatusBean getAcctSubStatusValue(long acctId) throws Exception {
		ICmCommonInnerSV cmCommonInerSV = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		
		BOCmAcctSubStatusBean queryBean = new BOCmAcctSubStatusBean();
		queryBean.setAcctId(acctId);
		
		DataContainerInterface rtnBean = cmCommonInerSV.getBean(queryBean);
		if ( rtnBean!= null){
			return (BOCmAcctSubStatusBean) rtnBean;
		}
		return null;
	}
	
}
