package com.asiainfo.crm.res.common.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;

/**
 * Copyright: Asiainfo-Linkage
 * 
 * @desc: DONE_CODE与ORACLE系统时间类
 * @version: v1.0
 * @author: lvyh
 * @date: 2010.12.20
 */
public interface IDoneCodeSV
{
	public long getDoneCode() throws Exception, RemoteException;
	
	public Timestamp getDoneDate() throws Exception, RemoteException;
}
