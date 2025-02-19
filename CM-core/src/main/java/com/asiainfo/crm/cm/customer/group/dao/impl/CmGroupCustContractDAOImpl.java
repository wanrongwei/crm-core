package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustContractEngine;
import com.asiainfo.crm.cm.customer.group.bo.QBOCmQueryContractEngine;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupCustContractDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustContractValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmQueryContractValue;

/** 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * @ClassName: ICmGroupCustContractDAO.java
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 9, 2011 8:14:50 PM 
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * Mar 9, 2011		huzq2           v1.0.0               修改原因
 */
public class CmGroupCustContractDAOImpl implements ICmGroupCustContractDAO
{

	public IBOCmGroupCustContractValue[] queryGroupCustContractsByGroupId(long groupCustId, int startNum, int endNum) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupCustContractValue.S_GroupCustId).append(" = :groupCustId ").append(" and ").append(
				IBOCmGroupCustContractValue.S_State).append(" = :state ");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupCustContractEngine.getBeans(null, condition.toString(), parameter, startNum, endNum, true);
	}
	
	public IBOCmGroupCustContractValue queryGroupCustContractByContractSequenceNo(String contractSequenceNo) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupCustContractValue.S_ContractSequenceNo).append(" = :contractSequenceNo ");
		condition.append(" AND ");
		condition.append(IBOCmGroupCustContractValue.S_State).append(" = :state ");
		parameter.put("contractSequenceNo", String.valueOf(contractSequenceNo));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmGroupCustContractValue[] groupCustContract=BOCmGroupCustContractEngine.getBeans(condition.toString(), parameter);
		if(groupCustContract.length==0){
			return null;
		}
		return groupCustContract[0];
	}
	
	public IQBOCmQueryContractValue[] queryGroupCustContract(String condition,Map parameter,int start,int end)  throws Exception{
		return QBOCmQueryContractEngine.getBeans(null,condition,parameter,start,end,false);
	}
	
	public int queryGroupCustContractCount(String condition,Map parameter)  throws Exception{
		return QBOCmQueryContractEngine.getBeansCount(condition,parameter);
	}
	
	public IBOCmGroupCustContractValue queryGroupCustContractByContractId(long contractId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupCustContractValue.S_ContractId).append(" = :contractId ").append(" AND ").append(
				IBOCmGroupCustContractValue.S_State).append(" = :state ");
		parameter.put("contractId", Long.valueOf(contractId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		IBOCmGroupCustContractValue[]  results =BOCmGroupCustContractEngine.getBeans(condition.toString(), parameter);
		if(results.length>0)
			return results[0];
		else
			return null;
	}
	
	public int queryGroupCustContractsCountByGroupId(long groupCustId) throws Exception
	{
		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		condition.append(IBOCmGroupCustContractValue.S_GroupCustId).append(" = :groupCustId ").append(" AND ").append(
				IBOCmGroupCustContractValue.S_State).append(" = :state ");
		parameter.put("groupCustId", Long.valueOf(groupCustId));
		parameter.put("state", CmxConstants.RECORD_STATE_USE);
		return BOCmGroupCustContractEngine.getBeansCount(condition.toString(), parameter);
	}

	public void saveGroupCustContracts(IBOCmGroupCustContractValue[] groupCustContractValues) throws Exception
	{
		BOCmGroupCustContractEngine.saveBatch(groupCustContractValues);
	}
	
	public void saveGroupCustContract(IBOCmGroupCustContractValue groupCustContractValue) throws Exception
	{
		BOCmGroupCustContractEngine.save(groupCustContractValue);
	}

	public long getNewId() throws Exception
	{
		return BOCmGroupCustContractEngine.getNewId().longValue();
	}
	
/*	//取得SEQ的方法
	public String getMaxSEQ(String dateStr) throws Exception{
		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		StringBuffer sb= new StringBuffer();
		condition.append("substr(contract_sequence_no, length(contract_sequence_no) - 12,8) =:dateStr");
		condition.append(" AND ");
		condition.append("substr(contract_sequence_no,length(contract_sequence_no) - 3,4)=(select MAX(substr(t.contract_sequence_no, length(t.contract_sequence_no) - 3,4)) from CM_GROUP_CUST_CONTRACT t");
		condition.append(" WHERE substr(t.contract_sequence_no, length(t.contract_sequence_no) - 12, 8) =:dateStr AND t.state = 'U'  )");
		parameter.put("dateStr", dateStr);
		condition.append(" AND ");
		condition.append(IBOCmGroupCustContractValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RECORD_STATE_USE);
		IBOCmGroupCustContractValue[] groupCustContracts=BOCmGroupCustContractEngine.getBeans(condition.toString(),parameter);
		//当没有当天累加SEQ,则为0001
		if(groupCustContracts.length==0){
			sb.append("0001");
		}
		//否则累加SEQ+1
		else{
			int x=Integer.valueOf(groupCustContracts[0].getContractSequenceNo().substring(groupCustContracts[0].getContractSequenceNo().length()-4, groupCustContracts[0].getContractSequenceNo().length())).intValue();
			    x++;
			    //超过9999，返回0服务层取得为0，抛出异常
			    if(x==10000){
			    	return "0";
			    }
			DecimalFormat df = new DecimalFormat("0000");
			sb.append(df.format(x));
		}
		return sb.toString();
	}*/
	
	//取得SEQ的方法
	public String getMaxSEQ(String dateStr,int custLevel) throws Exception{
		StringBuffer condition = new StringBuffer();
		StringBuffer sb= new StringBuffer();
		String result = "";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = ServiceManager.getSession().getConnection();
			condition.append("SELECT MAX(SUBSTR(T.CONTRACT_SEQUENCE_NO, LENGTH(T.CONTRACT_SEQUENCE_NO) - 3,4)) ");
			if(custLevel>=0 && custLevel<=6){
				condition.append(" FROM CM_GROUP_CUST_CONTRACT T WHERE T.CONTRACT_SEQUENCE_NO LIKE 'JT________").append(dateStr).append("_____' ");
			}else{
				condition.append(" FROM CM_GROUP_CUST_CONTRACT T WHERE T.CONTRACT_SEQUENCE_NO LIKE 'JT_______").append(dateStr).append("_____' ");
			}
			ps = conn.prepareStatement(condition.toString());
			rs = ps.executeQuery();
			while (rs.next())
			{
				result = rs.getString(1);
			}
		}finally{
			CmCommonUtil.closeJDBC(conn, ps, rs);
		}
		//当没有当天累加SEQ,则为0001
		if(result==null || result.length()==0){
			sb.append("0001");
		}
		//否则累加SEQ+1
		else{
			int x=Integer.valueOf(result).intValue();
			    x++;
			    //超过9999，返回0服务层取得为0，抛出异常
			    if(x==10000){
			    	return "0";
			    }
			DecimalFormat df = new DecimalFormat("0000");
			sb.append(df.format(x));
		}
		return sb.toString();
	}
}
