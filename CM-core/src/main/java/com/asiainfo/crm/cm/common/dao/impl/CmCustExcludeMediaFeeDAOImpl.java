package com.asiainfo.crm.cm.common.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;

import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.asiainfo.crm.cm.common.bo.BOCmCustExcludeMediaFeeEngine;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCustExcludeMediaFeeDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustExcludeMediaFeeValue;

public class CmCustExcludeMediaFeeDAOImpl implements ICmCustExcludeMediaFeeDAO{

	public static transient final Log log = LogFactory
			.getLog(CmCustExcludeMediaFeeDAOImpl.class);
	
	@Override
	public void saveBatch(IBOCmCustExcludeMediaFeeValue[] values) throws Exception {
		if(values != null && values.length>0) {
			for(IBOCmCustExcludeMediaFeeValue value: values) {
				if(value.getId()<=0) {
					value.setId(BOCmCustExcludeMediaFeeEngine.getNewId().longValue());
					value.setStsToNew();
				}
				value.setCreateDate(ServiceManager.getOpDateTime());
				value.setLastUpdateDate(ServiceManager.getOpDateTime());
			}
			BOCmCustExcludeMediaFeeEngine.saveBatch(values);
		}
	}

	@Override
	public void deleteAll() throws Exception {

		String sql = "DELETE FROM CM_CUST_EXCLUDE_MEDIA_FEE WHERE 1=1";
		
		Connection conn = ServiceManager.getSession().getConnection();

		PreparedStatement ptmt = null;
		
		try {
			ptmt = conn.prepareStatement(sql);
			if (log.isInfoEnabled()) {
				log.debug("deleteSql：" + sql);
			}
			ptmt.execute();
		}catch(Exception e){
			throw new AIException("0",e.getMessage());
		}finally {
			if (ptmt != null)
				ptmt.close();
			if (conn != null) {
				conn.close();
			}
		}
	}

	@Override
	public IBOCmCustExcludeMediaFeeValue[] getCmCustExcludeMediaFeeFromWhereSql(String sql, HashMap map)
			throws Exception {
		return BOCmCustExcludeMediaFeeEngine.getBeans(sql,map);
	}
	
	
	
	
}
