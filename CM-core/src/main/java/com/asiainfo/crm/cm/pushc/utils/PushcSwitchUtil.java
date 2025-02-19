package com.asiainfo.crm.cm.pushc.utils;

import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.push.inter.client.PushClient;

public class PushcSwitchUtil {
	private final static String CR286_CONTROL = "CR286_CONTROL";

	private static boolean cr286Switch() throws Exception {
		IBOBsStaticDataValue conrol = StaticDataUtil.getStaticData("CR286_CONTROL", "ON");
		if (conrol!=null) {
			return true;
		}else {
			return false;
		}
	}
	
	private static boolean pushcStructParamEventSwitch(String eventCode) throws Exception{
		String pushcSwitch = PushClient.getEventSwitch(eventCode);
		if ("Y".equals(pushcSwitch)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 	通过老的发送邮件
	 * @param eventCode
	 * @return
	 * @throws Exception
	 */
	public static boolean isSendEvent(String eventCode) throws Exception {
		boolean rtn = false;
		
		if (!cr286Switch()) { // 关闭cr286开关，通过老的发送邮件
			rtn = true;
		} else if( !pushcStructParamEventSwitch(eventCode) ) { // 打开cr286开关， 但pushc对应的事件开关未打开，只能还是发老的
			rtn = true;
		}
		return rtn;
	}

	/**
	 *	通过新的发送邮件
	 * @param eventCode
	 * @return
	 * @throws Exception
	 */
	public static boolean isSendStructParamEvent(String eventCode) throws Exception {
		boolean rtn = false;
		
		if (cr286Switch() && pushcStructParamEventSwitch(eventCode)) { // 打开cr286开关，且pushc对应的事件开关已打开，发送新的邮件
			rtn = true;
		}
		
		return rtn;
	}
	
	/**
	 * 	保存新的参数信息
	 * @return
	 * @throws Exception
	 */
	public static boolean isSaveJsonParamInStructParamEvent() throws Exception {
		boolean rtn = false;
		
		if ( cr286Switch() ) {
			rtn = true;
		}
		
		return rtn;
	}


}
