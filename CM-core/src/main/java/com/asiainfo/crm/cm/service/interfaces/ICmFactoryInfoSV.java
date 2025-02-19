package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;

public interface ICmFactoryInfoSV {


	public DataContainer[] queryFactorys(String criteria, int startNum, int endNum) throws Exception;

	public int queryFactoryCount(String criteria) throws Exception;

	public void saveFactorys(DataContainer[] values) throws Exception;
	
	//查询厂商编号是否存在 add by 关胜杰
	public boolean queryFactoryInfo(String factoryId) throws Exception;
	
}
