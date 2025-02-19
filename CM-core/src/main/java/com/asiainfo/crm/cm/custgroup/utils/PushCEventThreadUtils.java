package com.asiainfo.crm.cm.custgroup.utils;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;
import com.asiainfo.push.inter.service.ivalues.Event;
import com.asiainfo.push.inter.service.ivalues.StructParamEvent;

public class PushCEventThreadUtils {
	private static int corePoolSize; 		// 池中所保存的线程数,包括空闲线程
	private static int maximumPoolSize ;	// 池中允许的最大线程数
	private static long keepAliveTime ;		// 当线程数大于核心时,此为终止前多余的空闲线程等待新任务的最长时间
	private static int queueSize;			// 池中等待队列的长度
	private static ThreadPoolExecutor threadPools;
	
	static{
		corePoolSize = 5;
		maximumPoolSize = 50;
		keepAliveTime = 10;
		queueSize = 10;
		try {
			IBOCmGeneralConfigValue[] generalConfigValues = InnerServiceFactory.getCmGeneralConfigSV().getGeneralConfigs("GLOBAL_PARAM", "GLOBAL_PARAM", "PUSH_EVENT_THREAD", "U");
			if ( generalConfigValues!=null && generalConfigValues.length>0 ){
				corePoolSize = Integer.parseInt( generalConfigValues[0].getValue1() );
				maximumPoolSize = Integer.parseInt( generalConfigValues[0].getValue2() );
				keepAliveTime = Long.parseLong( generalConfigValues[0].getValue3() );
				queueSize = Integer.parseInt( generalConfigValues[0].getValue4() );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadPools = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(queueSize));
	}
	
	public static void triggerEventAsynchronize(String eventCode,Event event,long custId,String billId,long entityId){
		PushCEventThread thread = new PushCEventThread(eventCode, event, custId, billId, entityId);
		threadPools.execute( thread );
	}
	
	public static void triggerStructParamEventAsynchronize(String eventCode,StructParamEvent event,long custId,String billId,long entityId){
		PushCStructParamEventThread thread = new PushCStructParamEventThread(eventCode, event, custId, billId, entityId);
		threadPools.execute( thread );
	}
}
