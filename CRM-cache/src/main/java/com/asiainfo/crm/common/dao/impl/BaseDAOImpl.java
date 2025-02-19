package com.asiainfo.crm.common.dao.impl;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.bo.BOBsParaDetailEngine;
import com.ai.common.ivalues.IBOBsParaDetailValue;
import com.asiainfo.crm.common.bo.BOBsCommonDistrictEngine;
import com.asiainfo.crm.common.bo.BOBsOperationEngine;
import com.asiainfo.crm.common.bo.BOBsSoOrdDepositeCfgEngine;
import com.asiainfo.crm.common.dao.interfaces.IBaseDAO;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.ivalues.IBOBsOperationValue;
import com.asiainfo.crm.common.ivalues.IBOBsSoOrdDepositeCfgValue;


/**
 * 静态数据表的查询DAO
 * 
 * @author linzhaoming 2010-12-27
 * 
 */
public class BaseDAOImpl implements IBaseDAO {

	public IBOBsParaDetailValue[] getAllBsParaDetail() throws Exception,
			RemoteException {
		return BOBsParaDetailEngine.getBeans(" STATE = 'U' ", null);
	}



	public IBOBsOperationValue[] getAllBsOperation() throws Exception {
		return BOBsOperationEngine.getBeans(" state='U' ", null);
	}

	public IBOBsSoOrdDepositeCfgValue[] getAllBsSoOrdDepositeCfgs()
			throws Exception {
		return BOBsSoOrdDepositeCfgEngine.getBeans(" state = 'U' ", null);
	}

	public String[] getBsUserFunctionId() throws Exception, RemoteException {
		// TODO Auto-generated method stub
		List userFunction = new LinkedList();

		try(Connection conn = ServiceManager.getSession().getConnection();
			PreparedStatement statement = conn
				.prepareStatement("select * from SO_USER_FUNCTION  where state = '1'");
			ResultSet resultSet = statement.executeQuery();) {

			while (resultSet.next()) {
				String functionId = resultSet.getString(1);
				userFunction.add(functionId);
			}
		}

		return (String[]) userFunction.toArray(new String[0]);
	}


	public IBOBsCommonDistrictValue[] queryAllCommonDistricts()
			throws Exception {
		return BOBsCommonDistrictEngine.getBeans(null, null);
	}
}
