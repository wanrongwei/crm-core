/**
 * 
 */
package com.asiainfo.crm.cm.service.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.evaluation.ivalues.IBOCmSpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ICmCustomerSV
 * @Description 该类定义了跟特殊名单的创建、修改、查询等相关的服务。这里面的服务是提供给外部使用的。<br>
 * 
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:27:49
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public interface ICmSpecialListSV {

	/**   
	 * @Function saveSpecalList
	 * @Description 保存特殊名单信息
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-14 下午02:23:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     zhangyin           v1.0.0               修改原因<br>
	 */
	public void saveSpecalList(IVOCustValue custValue) throws Exception;

	/**   
	 * 保存特殊名单信息
	 * @Function saveSpecialList
	 * @Description 
	 *
	 * @param specialListValue 特殊名单信息
	 * @param userObject 用户自定义的其他对象，如本地化实现时增加的扩展表等
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午11:20:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveSpecialList(ISpecialListValue specialListValue, Map userObject) throws Exception;

	/**   
	 * 批量保存特殊名单信息
	 * @Function saveSpecialLists
	 * @Description 
	 *
	 * @param specialListValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午11:31:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveSpecialLists(ISpecialListValue[] specialListValues, Map userObject) throws Exception;

	
	
	/**
	 * 
	 * @Function querySpecialLists
	 * @Description 根据格式化的查询条件字符串查询特殊名单信息(CM_SPECIAL_LIST)
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author qianmx
	 * @date Apr 18, 2012 5:37:44 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 18, 2012     qianmx           v1.0.0               修改原因<br>
	 */
	public ISpecialListValue querySpecialLists(String criteria) throws Exception;
	
	/**
	 * 
	 * @Function querySpecialList
	 * @Description 根据条件查询特殊名单信息
	 *
	 * @param conditionDC
	 * @return
	 *
	 * @version v1.0.0
	 * @author qianmx
	 * @date Apr 19, 2012 12:50:26 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 19, 2012     qianmx           v1.0.0               修改原因<br>
	 */
	public ISpecialListValue querySpecialList(DataContainer conditionDC) throws Exception;
	
	/**   
	 * 根据查询条件查询特殊名单信息
	 * @Function querySpecialLists
	 * @Description 
	 *
	 * @param conditionDC 查询条件
	 * @param startNum 
	 * @param endNum
	 * @return 符合条件的特殊名单信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午12:53:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public ISpecialListValue[] querySpecialLists(DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 *  根据查询条件查询特殊名单信息数量
	 * @Function querySpecialListCount
	 * @Description 
	 *
	 * @param conditionDC
	 * @return 符合条件的特殊名单信息数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午12:55:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public int querySpecialListCount(DataContainer conditionDC) throws Exception;

	/**   
	 * 根据格式化的查询条件字符串查询特殊名单信息。
	 * @Function querySpecialLists
	 * @Description 
	 *
	 * @param criteria 格式化的查询条件字符串。默认为XML字符串
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的特殊名单信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午12:54:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public ISpecialListValue[] querySpecialLists(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 根据格式化的查询条件字符串查询特殊名单信息数量。
	 * @Function querySpecialListCount
	 * @Description 
	 *
	 * @param criteria 格式化的查询条件字符串。默认为XML字符串
	 * @return 符合条件的特殊名单信息数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午12:56:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public int querySpecialListCount(String criteria) throws Exception;

	/**   
	 * 根据特殊名单编号查询特殊名单信息
	 * @Function querySpecialListById
	 * @Description 
	 *
	 * @param listId 特殊名单编号
	 * @return 符合条件的特殊名单信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午4:23:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public ISpecialListValue querySpecialListById(long listId) throws Exception;
	
	/**   
	 * 根据客户编号查询特殊名单信息
	 * @Function querySpecialListValuesByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-17 下午03:14:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-17     zhangyin          v1.0.0               修改原因<br>
	 */
	public ISpecialListValue[] querySpecialListValuesByCustId(long custId) throws Exception;

	
}
