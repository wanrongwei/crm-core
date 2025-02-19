package com.asiainfo.crm.cm.exe.tf.dao.impl;

import java.util.Map;

import com.asiainfo.crm.cm.exe.tf.bo.BOCmPsBusiRecEngine;
import com.asiainfo.crm.cm.exe.tf.dao.interfaces.ICmPsBusiDAO;
import com.asiainfo.crm.cm.exe.tf.ivalues.IBOCmPsBusiRecValue;

public class CmPsBusiDAOImpl implements ICmPsBusiDAO {
	public void savePsBusiRecs(IBOCmPsBusiRecValue[] psBusiRecValues) throws Exception {
		BOCmPsBusiRecEngine.save(psBusiRecValues);
	}
}
