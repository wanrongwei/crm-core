package com.asiainfo.crm.cm.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.complex.tab.store.AdvanceDataStoreImpl;

public class CmAdvanceDataStoreImpl extends AdvanceDataStoreImpl {

	private void setParam(Map param) throws Exception {
		if (param == null) {
			param = new HashMap();
		} else {
			if (param.containsKey("REGION_ID") && param.get("REGION_ID") != null) {
				return;
			}
		}
		param.put("REGION_ID", "240");
		param.put("USER_REGION_CODE", "240");
	}

	protected ResultSet retrieveByResultLevel(Connection arg0, String arg1, Map arg2, int arg3) throws Exception {
		setParam(arg2);
		return super.retrieveByResultLevel(arg0, arg1, arg2, arg3);
	}

	public int retrieveCount(Connection arg0, ObjectType arg1, String arg2, Map arg3, String[] arg4) throws Exception {
		setParam(arg3);
		return super.retrieveCount(arg0, arg1, arg2, arg3, arg4);
	}

	public int execute(Connection arg0, String arg1, Map arg2) throws Exception {
		setParam(arg2);
		return super.execute(arg0, arg1, arg2);
	}

	public DataContainerInterface[] retrieve(Connection arg0, Class arg1, ObjectType arg2, String[] arg3, String arg4, Map arg5, int arg6, int arg7, boolean arg8, boolean arg9,
			String[] arg10) throws Exception {
		setParam(arg5);
		return super.retrieve(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}

	public void retrieve(Connection arg0, DataContainerInterface arg1, String[] arg2, String arg3, Map arg4, boolean arg5, boolean arg6, String[] arg7) throws Exception {
		setParam(arg4);
		super.retrieve(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public ResultSet retrieve(Connection conn, ObjectType type, String[] attrList, String condition, Map parameterList, int startNum, int endNum, boolean fkFlag,
			boolean distinctFlag, String[] extenBOArray) throws Exception {
		setParam(parameterList);
		return super.retrieve(conn, type, attrList, condition, parameterList, startNum, endNum, fkFlag, distinctFlag, extenBOArray);
	}

	public ResultSet retrieve(Connection conn, String strSql, Map parameterList) throws Exception {
		setParam(parameterList);
		return super.retrieve(conn, strSql, parameterList);
	}

}
