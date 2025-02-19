package com.asiainfo.crm.cm.ln.common.config;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;

import com.asiainfo.crm.cm.common.config.CmConfigLoader;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmLnConfigLoader {

	private transient static Log log = LogFactory.getLog(CmConfigLoader.class);
	private Map<String, Map<String, String>> busiInterfaceMethods = new HashMap<String, Map<String, String>>();

	private static CmLnConfigLoader instance = new CmLnConfigLoader();

	/**   
	 * @Function getInstance
	 * @Description 获取配置加载器实例
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 21, 2012 9:34:56 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 21, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static CmLnConfigLoader getInstance() {
		return instance;
	}

	/**
	 * 构造函数
	 */
	private CmLnConfigLoader() {
		try {
			init();
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e);
			}
		}
	}

	/**   
	 * @Function init
	 * @Description 初始化方法
	 *
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 21, 2012 9:37:58 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 21, 2012     shitian           v1.0.0               修改原因<br>
	 */
	private void init() throws Exception {
		Document document = CmConfigLoader.getXmlDocument(Thread.currentThread().getContextClassLoader().getResourceAsStream(CmConfigLoader.CONFIG_FILE));
		// 将配置文件内容打印出来，便于调试
		if (log.isDebugEnabled()) {
			log.debug(document.asXML());
		}
		// config
		Element root = document.getRootElement();
		// config/busiInterfaces/interface code by xiezl
		List<Node> busiInterfaces = document.selectNodes("/config/busiInterfaces/interface");
		if (CmCommonUtil.isNotEmptyObject(busiInterfaces)) {
			Iterator<Node> it = busiInterfaces.iterator();
			while (it.hasNext()) {
				Node node = (Node) it.next();
				Map<String, String> methodClass = new HashMap<String, String>();
				String busiId = node.valueOf("@busiId");
				String method = node.valueOf("@method");
				String clazz = node.valueOf("@class");
				methodClass.put("method", method);
				methodClass.put("class", clazz);

				if (log.isDebugEnabled())
					log.debug("Interface busiId:" + busiId + ",method:" + method + ",class:" + clazz);

				busiInterfaceMethods.put(busiId, methodClass);
			}
		}
	}

	public Map<String, String> getInterfaceMethod(String busiCode) {
		if (busiInterfaceMethods.containsKey(busiCode))
			return busiInterfaceMethods.get(busiCode);
		return null;
	}
}
