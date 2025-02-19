package com.asiainfo.crm.cm.common.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.config.bean.CmBusiModel;
import com.asiainfo.crm.cm.common.config.bean.CmIdGenerator;
import com.asiainfo.crm.cm.common.config.bean.CmTeamInvokeService;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmConfigLoader {

	private transient static Log log = LogFactory.getLog(CmConfigLoader.class);

	public static final String BUSI_MODEL_PREFIX_KEY = "_";

	public static String CONFIG_FILE ;
	static{
		try {
			IBOBsStaticDataValue[] values=StaticDataUtil.getStaticData("CM_CONFIG_FILE");
			if(CmCommonUtil.isNotEmptyObject(values)){
				for(IBOBsStaticDataValue value : values){
					if(value.getCodeValue().indexOf(TenantIDFactory.getTenantId())!=-1){
						CONFIG_FILE=value.getCodeName();
						break;
					}
				}
			}
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error(e);
			}
		}
	}

	private Map<String, CmIdGenerator> idGeneratorMap = new HashMap<String, CmIdGenerator>();
	private Map<String, CmBusiModel> busiModelMap = new HashMap<String, CmBusiModel>();
	private Map<String, CmTeamInvokeService> teamInvokeServiceMap = new HashMap<String, CmTeamInvokeService>();
	private String defaultRegionGetter = null;
	private Map<String, String> valueObjectSetterMap = new HashMap<String, String>();

	private Map<String, String> busilogCreatorMap = new HashMap<String, String>();

	public String getDefaultRegionGetter() {
		return defaultRegionGetter;
	}

	private static CmConfigLoader instance = new CmConfigLoader();
	
	/**   
	 * 获取配置加载器实例
	 * @Function getInstance
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 下午1:22:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-22     huzq           v1.0.0               修改原因<br>
	 */
	public static CmConfigLoader getInstance() {
		return instance;
	}
	
	/**   
	 * 获取序列生成器
	 * @Function getIdGenerator
	 * @Description 
	 *
	 * @param boBeanClass
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 下午3:35:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-22     huzq           v1.0.0               修改原因<br>
	 */
	public CmIdGenerator getIdGenerator(Class boBeanClass) throws Exception {
		return this.idGeneratorMap.get(boBeanClass.getName());
	}

	/**   
	 * 获取业务模型配置
	 * @Function getBusiModel
	 * @Description 
	 *
	 * @param busiModelClass
	 * @param regionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 下午3:45:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-22     huzq           v1.0.0               修改原因<br>
	 */
	public CmBusiModel getBusiModel(Class busiModelClass, String regionId) throws Exception {
		if (StringUtils.isBlank(regionId)) {
			regionId = "X";
		}
		return this.busiModelMap.get(busiModelClass.getName() + BUSI_MODEL_PREFIX_KEY + regionId);
	}

	/**   
	 * 获取客户管理外部接口服务配置项
	 * @Function getTeamInvokeService
	 * @Description 
	 *
	 * @param interfaceClass
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 下午3:47:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-22     huzq           v1.0.0               修改原因<br>
	 */
	public CmTeamInvokeService getTeamInvokeService(Class interfaceClass) throws Exception {
		return this.teamInvokeServiceMap.get(interfaceClass.getName());
	}

	private CmConfigLoader() {
		try {
			init();
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e);
			}
		}
	}

	/**   
	 * 初始化
	 * @Function init
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-6-22 下午3:49:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-22     huzq           v1.0.0               修改原因<br>
	 */
	private void init() throws Exception {
		Document document = getXmlDocument(Thread.currentThread().getContextClassLoader().getResourceAsStream(CONFIG_FILE));
		// 将配置文件内容打印出来，便于调试
		if (log.isDebugEnabled()) {
			log.debug(document.asXML());
		}
		// config
		Element root = document.getRootElement();
		// config/id-generators
		Element idGeneratorsElement = root.element("id-generators");
		if (idGeneratorsElement != null) {
			// config/id-generators/id-generator
			List<Element> idGeneratorsList = idGeneratorsElement.elements("id-generator");
			if (CmCommonUtil.isNotEmptyObject(idGeneratorsList)) {
				Iterator<Element> it = idGeneratorsList.iterator();
				while (it.hasNext()) {
					Element element = it.next();
					String id = element.valueOf("@id");
					String remarks = element.valueOf("@remarks");
					CmIdGenerator generator = new CmIdGenerator(id, remarks);
					generator.setString(element.asXML());
					// config/id-generators/id-generator/service
					Element serviceElement = element.element("service");
					if (serviceElement != null) {
						String serviceName = serviceElement.getTextTrim();
						String modifier = serviceElement.valueOf("@modifier");
						String serviceRemarks = serviceElement.valueOf("@remarks");
						generator.setService(serviceName, modifier, serviceRemarks);
						generator.getService().setString(serviceElement.asXML());
					} else {
						// 配置文件错误，请检查。配置项{0}不能为空！
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource(""));
						}
						ExceptionUtil.throwBusinessException("");
					}
					// config/id-generators/id-generator/method
					Element methodElement = element.element("method");
					if (methodElement != null) {
						String methodName = methodElement.valueOf("@name");
						boolean isStatic = DataType.getAsBoolean(methodElement.valueOf("@isStatic"));
						String methodRemarks = methodElement.valueOf("@remarks");
						generator.setMethod(methodName, isStatic, methodRemarks);
						generator.getMethod().setString(methodElement.asXML());
						// config/id-generators/id-generator/method/parameter
						List<Element> parameterList = methodElement.elements("parameter");
						if (CmCommonUtil.isNotEmptyObject(parameterList)) {
							Iterator<Element> iterator = parameterList.iterator();
							while (iterator.hasNext()) {
								Element paramElement = (Element) iterator.next();
								String name = paramElement.valueOf("@name");
								String dataType = paramElement.valueOf("@dataType");
								String source = paramElement.valueOf("@source");
								String paramRemarks = paramElement.valueOf("@remarks");
								generator.addMethodParameter(name, dataType, source, paramRemarks);
							}
						}
					} else {
						// 配置文件错误，请检查。配置项{0}不能为空！
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource(""));
						}
						ExceptionUtil.throwBusinessException("");
					}
					idGeneratorMap.put(generator.getId(), generator);
				}
			}
		}
		// config/busi-models/busi-model
		List busiModelList = document.selectNodes("/config/busi-models/busi-model");
		if (CmCommonUtil.isNotEmptyObject(busiModelList)) {
			Iterator<Node> it = busiModelList.iterator();
			while (it.hasNext()) {
				Node node = (Node) it.next();
				int id = DataType.getAsInt(node.valueOf("@id"));
				String interfaceName = node.valueOf("@interface");
				String implClass = node.valueOf("@impl-class");
				String regionId = node.valueOf("@region-id");
				String remarks = node.valueOf("@remarks");
				CmBusiModel busiModel = new CmBusiModel(id, interfaceName, implClass, regionId, remarks);
				busiModel.setString(node.asXML());
				busiModelMap.put(interfaceName + BUSI_MODEL_PREFIX_KEY + regionId, busiModel);
			}
		}
		// config/team-invoke-services/team-invoke-service
		List teamServiceList = document.selectNodes("/config/team-invoke-services/team-invoke-service");
		if (CmCommonUtil.isNotEmptyObject(teamServiceList)) {
			Iterator<Node> it = teamServiceList.iterator();
			while (it.hasNext()) {
				Node node = (Node) it.next();
				String id = node.valueOf("@id");
				String implService = node.valueOf("@impl-service");
				String type = node.valueOf("@type");
				String remarks = node.valueOf("@remarks");
				CmTeamInvokeService service = new CmTeamInvokeService(id, implService, type, remarks);
				service.setString(node.asXML());
				teamInvokeServiceMap.put(id, service);
			}
		}
		// config/default-region-getter
		Node regionGetterNode = document.selectSingleNode("/config/default-region-getter");
		if (regionGetterNode != null) {
			defaultRegionGetter = regionGetterNode.valueOf("@impl-class");
		}
		// config/value-object-setters/value-object-setter
		List voSetters = document.selectNodes("/config/value-object-setters/value-object-setter");
		if (CmCommonUtil.isNotEmptyObject(voSetters)) {
			Iterator<Node> it = voSetters.iterator();
			while (it.hasNext()) {
				Node node = (Node) it.next();
				String beanClass = node.valueOf("@bean-class");
				String implClass = node.valueOf("@setter-impl-class");
				valueObjectSetterMap.put(beanClass, implClass);
			}
		}
		// config/busilog-creators/busilog-creator
		List busilogCreators = document.selectNodes("/config/busilog-creators/busilog-creator");
		if (CmCommonUtil.isNotEmptyObject(busilogCreators)) {
			Iterator<Node> it = busilogCreators.iterator();
			while (it.hasNext()) {
				Node node = (Node) it.next();
				String beanClass = node.valueOf("@value-object-type");
				String implClass = node.valueOf("@creator-impl-class");
				busilogCreatorMap.put(beanClass, implClass);
			}
		}
	}

	/**
	 * 根据xml数据流生成对应的Document文档
	 * @param is
	 * @return
	 */
	public static Document getXmlDocument(InputStream is) {
		Document document = null;
		SAXReader saxReader = new SAXReader();
		try {
			document = saxReader.read(is);
		} catch (DocumentException e) {
			if (log.isInfoEnabled()) {
				log.info("Error generating document object !\n", e);
			}
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					if (log.isErrorEnabled()) {
						log.error("Close xml data out of the wrong ,that does not affect the normal operation!", e);
					}
				}
			}
		}
		return document;
	}

	/**   
	 * 
	 * @Function getValueObjectSetter
	 * @Description 
	 *
	 * @param boBeanClass
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-23 下午3:54:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-23     huzq           v1.0.0               修改原因<br>
	 */
	public String getValueObjectSetter(Class boBeanClass) {
		return valueObjectSetterMap.get(boBeanClass.getName());
	}

	/**   
	 * 获取业务日志生成器配置信息
	 * 
	 * @Function getBusilogCreators
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午9:34:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public Map getBusilogCreators() {
		return busilogCreatorMap;
	}
}
