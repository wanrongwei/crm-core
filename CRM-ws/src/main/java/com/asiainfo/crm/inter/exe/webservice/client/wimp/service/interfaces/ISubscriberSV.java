package com.asiainfo.crm.inter.exe.webservice.client.wimp.service.interfaces;

import java.io.BufferedReader;

public interface ISubscriberSV {
    
	/**
	 * 解析文件中的数据
	 * @throws Exception
	 */
	public void parseData(BufferedReader reader,String fileDate) throws Exception;
	
	/**
	 * 入库后，更新WIMP状态
	 * @param batchId
	 * @throws Exception
	 */
	public void updateWimpActiveState(String batchId) throws Exception;

}
