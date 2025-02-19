package com.asiainfo.crm.cm.ln.common.util;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.StringUtils;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmInterfaceLogBean;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.ln.common.config.CmLnConfigLoader;

public class CmBusiEntry {

	private transient static Log log = LogFactory.getLog(CmBusiEntry.class);

	private static Map cmServiceMap = new HashMap();

	public static Object invokeInterface(Map<?, ?> map) throws Exception {
		if (map == null)
			throw new Exception("Incoming map can not be null");

		String busiId = (String) map.get("busiId");
		if (StringUtils.emptyString(busiId)) {
			if (log.isErrorEnabled())
				log.error("Interface calls busiId not be empty");

			throw new Exception("Please check whether busiId is missing .....");// 输入参数不合法
		}

		Map<String, String> methodClass = CmLnConfigLoader.getInstance().getInterfaceMethod(busiId);

		if (methodClass == null) {
			if (log.isErrorEnabled())
				log.error("Interface calls entered busiId [" + busiId + "] no corresponding methodName");

			throw new Exception("None corresponding methodName, check to see if CmConfig.xml file updates .....");// 输入参数不合法
		}

		if (log.isDebugEnabled())
			log.debug("Interface calls entered busiId [" + busiId + "] , Corresponding method [" + methodClass.get("method") + "@" + methodClass.get("class") + "] Begin");

		long beginTime = System.currentTimeMillis();

		Class<?> interfaceClass = Class.forName(methodClass.get("class"));
		Method method = interfaceClass.getMethod(methodClass.get("method"), new Class[] { Map.class });

		// 结果返回是map,包含returnMsg,returnCode returnObj
		Object serviceObject = null;
		if (cmServiceMap.containsKey(interfaceClass)) {
			serviceObject = cmServiceMap.get(interfaceClass);
		} else {
			serviceObject = ServiceFactory.getService(interfaceClass);
			cmServiceMap.put(interfaceClass, serviceObject);
		}
		Object returnValue = method.invoke(serviceObject, new Object[] { map });

		long endTime = System.currentTimeMillis();
		if (log.isDebugEnabled())
			log.debug("Interface calls entered busiId [" + busiId + "] , Corresponding method [" + methodClass.get("method") + "@" + methodClass.get("class") + "] Execution end , the execution time :" + (endTime - beginTime) / 1000d + "s");

		Map<?, ?> returnMap = (Map<?, ?>) returnValue;
		Object returnObj = returnMap.get("returnObj");

		UserInfoInterface userInfo = ServiceManager.getUser();
		boolean isLog = false;
//		if (userInfo != null) {
//			Object object = userInfo.get(com.asiainfo.crm.so.common.RBossConst.PUBINFO_CHANNEL_TYPE);
//			if (!CmCommonUtil.isEmptyObj(object) && (Integer.parseInt(object.toString()) == 1 || Integer.parseInt(object.toString()) == 3)) {
//				isLog = true;
//			}
//		}
		if (CmCommonUtil.isNotEmptyObject(StaticDataUtil.getStaticData("CM_INTERFACE_LOG", busiId)) && isLog) {
			// 接口调用日志记录
			BOCmInterfaceLogBean logBean = new BOCmInterfaceLogBean();
			logBean.setLogId(CmCommonUtil.getNewSequence(BOCmInterfaceLogBean.class));
			logBean.setBusiId(busiId);
			logBean.setMethodName(methodClass.get("method") + "@" + interfaceClass.getSimpleName());
			logBean.setStartTime(new Timestamp(beginTime));
			// logBean.setExeResult((String) returnMap.get("returnMsg"));
			logBean.setExeTime((endTime - beginTime) / 1000d);

			UserInfoInterface user = ServiceManager.getUser();
			if (user != null) {
				logBean.setOpId(user.getID());
				logBean.setOrgId(user.getOrgId());
			}

			// 以下是转换执行参数
			Iterator<?> it = map.entrySet().iterator();
			StringBuilder sb = new StringBuilder();
			while (it.hasNext()) {
				Map.Entry<?, ?> entry = (Entry<?, ?>) it.next();
				if ("busiId".equals(entry.getKey()))
					continue;
				sb.append(entry.getKey() + ":" + entry.getValue() + ",");
			}
			if (sb.length() > 0) {
				sb.delete(sb.length() - 1, sb.length());
				logBean.setExeParam(sb.toString());
			}

			if (returnObj instanceof List<?>)
				logBean.setExeCnt(((List<?>) returnObj).size());
			else if (isArray(returnObj))
				logBean.setExeCnt(Array.getLength(returnObj));

			// 保存日志
			CmServiceFactory.getInterfaceLogSV().saveDatas(new DataContainer[] { logBean });
		}

		return returnObj;
	}

	// check object is array or not
	public static boolean isArray(Object obj) {
		if (obj == null)
			return false;
		Class<?> c = obj.getClass();
		return c.isArray();
	}

	public static Object invokeInterfaceNew(Map<?, ?> map) throws Exception {
		if (map == null)
			throw new Exception("Incoming map can not be null");

		String busiId = (String) map.get("busiId");
		if (StringUtils.emptyString(busiId)) {
			if (log.isErrorEnabled())
				log.error("Interface calls busiId not be empty");

			throw new Exception("Check whether the busiId is missing.....");// 输入参数不合法
		}

		Map<String, String> methodClass = CmLnConfigLoader.getInstance().getInterfaceMethod(busiId);

		if (methodClass == null) {
			if (log.isErrorEnabled())
				log.error("Interface calls entered busiId [" + busiId + "] No corresponding methodName");

			throw new Exception("None corresponding methodName, check to see if CmConfig.xml file updates .....");// 输入参数不合法
		}

		if (log.isDebugEnabled())
			log.debug("Interface calls entered busiId [" + busiId + "] , Corresponding method [" + methodClass.get("method") + "@" + methodClass.get("class") + "] Begin");

		long beginTime = System.currentTimeMillis();

		Class<?> interfaceClass = Class.forName(methodClass.get("class"));
		Class[] paraClasses = (Class[]) map.get("paraClasses");
		Method method = interfaceClass.getMethod(methodClass.get("method"), paraClasses);
		Object[] paraObjects = (Object[]) map.get("paraObjects");
		Object serviceObject = null;
		if (cmServiceMap.containsKey(interfaceClass)) {
			serviceObject = cmServiceMap.get(interfaceClass);
		} else {
			serviceObject = ServiceFactory.getService(interfaceClass);
			cmServiceMap.put(interfaceClass, serviceObject);
		}

		Object returnValue = method.invoke(serviceObject, paraObjects);
		long endTime = System.currentTimeMillis();

		if (log.isDebugEnabled())
			log.debug("Interface calls entered busiId [" + busiId + "] , Corresponding method [" + methodClass.get("method") + "@" + methodClass.get("class") + "] Execution end , the execution time :" + (endTime - beginTime) / 1000d + "s");

		UserInfoInterface userInfo = ServiceManager.getUser();
		boolean isLog = false;
//		
		if (CmCommonUtil.isNotEmptyObject(StaticDataUtil.getStaticData("CM_INTERFACE_LOG", busiId)) && isLog) {
			// 接口调用日志记录
			BOCmInterfaceLogBean logBean = new BOCmInterfaceLogBean();
			logBean.setBusiId(busiId);
			logBean.setMethodName(methodClass.get("method") + "@" + interfaceClass.getSimpleName());
			logBean.setStartTime(new Timestamp(beginTime));
			logBean.setExeTime((endTime - beginTime) / 1000d);

			UserInfoInterface user = ServiceManager.getUser();
			if (user != null) {
				logBean.setOpId(user.getID());
				logBean.setOrgId(user.getOrgId());
			}

			// 以下是转换执行参数
			StringBuilder sb = new StringBuilder();
			for (int i = 0, len = paraObjects.length; i < len; i++) {
				Object temp = paraObjects[i];
				if (temp != null) {
					sb.append(temp.toString()).append(",");
				}
			}

			if (sb.length() > 0) {
				sb.delete(sb.length() - 1, sb.length());
				logBean.setExeParam(sb.toString());
			}

			if (returnValue instanceof List<?>)
				logBean.setExeCnt(((List<?>) returnValue).size());
			else if (isArray(returnValue))
				logBean.setExeCnt(Array.getLength(returnValue));

			// 保存日志
			CmServiceFactory.getInterfaceLogSV().saveDatas(new DataContainer[] { logBean });
		}

		return returnValue;
	}

}