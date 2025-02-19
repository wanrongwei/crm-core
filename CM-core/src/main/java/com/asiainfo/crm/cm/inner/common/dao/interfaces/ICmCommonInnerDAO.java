package com.asiainfo.crm.cm.inner.common.dao.interfaces;

import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;

public interface ICmCommonInnerDAO {

	/**   
	 * 保存扩展属性表信息
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
	 * 保存数据
	 * @Function saveEntityAttrValue
	 * @Description 
	 *
	 * @param bean
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午9:23:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveBean(DataContainerInterface bean) throws Exception;

	/**   
	 * 获取数量
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
	 * @date 2012-4-25 下午9:31:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public int getBeanCount(Class beanClass, String condition, Map parameter) throws Exception;

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
	 * @Function getBean
	 * @Description 
	 *
	 * @param bean
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-2 下午10:04:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-2     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface getBean(DataContainerInterface bean) throws Exception;
	
	//code by xiezl 执行sql(delete update等)方法
	public int executeSql(String sql, Map parameter) throws Exception ;

}
