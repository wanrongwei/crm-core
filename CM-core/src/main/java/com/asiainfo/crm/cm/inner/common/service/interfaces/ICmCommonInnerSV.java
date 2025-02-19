/**
 * 
 */
package com.asiainfo.crm.cm.inner.common.service.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-19 下午4:16:19
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmCommonInnerSV {

	/**   
	 * 根据主键查询信息
	 * @Function getBean
	 * @Description 
	 *
	 * @param bean
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-2 下午10:03:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface getBean(DataContainerInterface bean) throws Exception;

	/**   
	 * 根据查询条件查询数量
	 * @Function getBeanCount
	 * @Description 
	 *
	 * @param beanClass
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午9:29:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public int getBeanCount(Class beanClass, String condition, Map parameter) throws Exception;

	/**   
	 * 根据查询条件查询数量
	 * 
	 * @Function getBeanCount
	 * @Description 
	 *
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-30 下午4:53:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-30     huzq2           v1.0.0               修改原因<br>
	 */
	public int getBeanCount(Parameter parameter) throws Exception;

	/**   
	 * 根据条件查询实体属性扩展表
	 * @Function getEntityAttrValues
	 * @Description 
	 *
	 * @param beanClass
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午5:43:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getBeans(Class beanClass, String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**   
	 * 根据条件查询实体属性扩展表
	 * @Function getBeans
	 * @Description 
	 *
	 * @param beanClass
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @param fkFlag
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-9 下午6:25:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-9     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getBeans(Class beanClass, String[] cols, String condition, Map parameter, int startNum, int endNum, boolean fkFlag) throws Exception;

	/**   
	 * 查询数据
	 * 
	 * @Function getBeans
	 * @Description 
	 *
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-30 下午4:52:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-30     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getBeans(Parameter parameter, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function getBeansFromQueryBO
	 * @Description 
	 *
	 * @param beanClass
	 * @param soureBO
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午9:40:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getBeansFromQueryBO(Class beanClass, String soureBO, Map parameter) throws Exception;

	/**   
	 * 根据查询SQL语句查询数据
	 * @Function getBeansFromSql
	 * @Description 
	 *
	 * @param beanClass
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-9 下午9:11:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-9     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getBeansFromSql(Class beanClass, String sql, Map parameter) throws Exception;
	/**   
	 * 根据查询SQL语句查询数据总行数
	 * @Function getBeansFromSql
	 * @Description 
	 *
	 * @param beanClass
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-10-9 下午9:11:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-9     kangzk           v1.0.0               修改原因<br>
	 */
	public int getBeansFromSqlCount(Class beanClass, String sql, Map parameter) throws Exception;
	
	/**
	 * 
	 * @Function queryData
	 * @Description  根据查询参数获取查询结果
	 *
	 * @param beanClass
	 * @param param
	 * @param extCondition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yandong2
	 * @date Jun 5, 2012 9:56:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 5, 2012     yandong2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryData(Class beanClass, DataContainer param, String extCondition) throws Exception;
	
	/**   
	 * 单个保存数据
	 * @Function saveBean
	 * @Description 
	 *
	 * @param bean
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午9:21:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveBean(DataContainerInterface bean) throws Exception;

	/**   
	 * 批量保存数据
	 * @Function saveEntityAttrValues
	 * @Description 
	 *
	 * @param beans
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午4:21:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveBeans(DataContainerInterface[] beans) throws Exception;
	
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId, long userId, int start, int end) throws Exception;
}
