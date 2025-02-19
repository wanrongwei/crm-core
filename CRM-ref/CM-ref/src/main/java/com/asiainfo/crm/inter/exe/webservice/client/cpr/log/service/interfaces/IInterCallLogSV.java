package com.asiainfo.crm.inter.exe.webservice.client.cpr.log.service.interfaces;

import com.asiainfo.crm.inter.exe.webservice.client.cpr.log.ivalues.IBOInterCallLogValue;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Date;

public interface IInterCallLogSV {
	
	/**
	 * 查询cpr交互信息
	 * @param pnr
	 * @param dateBefore
	 * @param dateAfter
	 * @param startNum
	 * @param count
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOInterCallLogValue[]  getAllInterCallLogValuesByPNR(String pnr, Date dateBefore, Date dateAfter, int startNum, int endNum) throws Exception, RemoteException;
	
	/**
	 * 查询cpr交互信息总记录数
	 * @param pnr
	 * @param dateBefore
	 * @param dateAfter
	 * @param startNum
	 * @param count
	 * @return
	 * @throws Exception
	 */
	public int getAllInterCallLogCountsByPNR(String pnr,Date dateBefore,Date dateAfter) throws Exception;
	
	public void saveInterCallLog(String pnr, Timestamp callTime, String callState, String callDescrip) throws Exception;
}
