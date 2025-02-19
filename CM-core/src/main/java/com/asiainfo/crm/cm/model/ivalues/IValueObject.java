/**
 * 
 */
package com.asiainfo.crm.cm.model.ivalues;

import java.io.Serializable;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;


/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-16 下午1:18:28
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-16     huzq           v1.0.0               修改原因<br>
 */
public interface IValueObject extends Serializable {
	
	/**
	 * 业务编码的key
	 */
	public static final String S_BUSINESS_ID = "BUSINESS_ID";

	/**   
	 * 单个添加扩展属性对象。<br>
	 * <strong>该方法用于当前业务操作需要存储使用纵表存储的数据时，纵表数据对象可以统一存储在ValueObject中传递到BusiModel层统一进行处理。</strong>
	 * @Function addAttrValue
	 * @Description 
	 *
	 * @param attrValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-20 下午4:32:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	public void addAttrValue(DataContainerInterface attrValue) throws Exception;

	/**   
	 * 批量添加扩展属性<br>
	 * <strong>该方法用于当前业务操作需要存储使用纵表存储的数据时，纵表数据对象可以统一存储在ValueObject中传递到BusiModel层统一进行处理。</strong>
	 * @Function addAttrValues
	 * @Description 
	 *
	 * @param attrValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 下午1:26:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
	 */
	public void addAttrValues(DataContainerInterface[] attrValues) throws Exception;
	
	/**   
	 * 将一组用户对象添加到VO对象中
	 * 
	 * @Function addUserMap
	 * @Description 
	 *
	 * @param userMap
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午8:04:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public void addUserMap(Map<Object, Object> userMap) throws Exception;

	/**   
	 * 获取扩展属性
	 * @Function getAttrValues
	 * @Description 
	 *
	 * @return 返回所有的扩展属性对象，如果没有扩展属性则返回null。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-20 下午4:33:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getAttrValues() throws Exception;

	/**   
	 * 获取业务编码
	 * 
	 * @Function getBusinessId
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-14 下午5:37:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-14     huzq           v1.0.0               修改原因<br>
	 */
	public long getBusinessId() throws Exception;

	/**   
	 * @Function getUserMap
	 * @Description 获取用户定义的对象Map
	 *
	 * @return Map
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:33:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public Map<Object, Object> getUserMap();

	/**   
	 * 获取指定的用户自定对象
	 * 
	 * @Function getUserObject
	 * @Description 获取指定的用户自定对象
	 *
	 * @param key
	 * @return 指定的用户自定对象
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:43:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public Object getUserObject(Object key);
	
	/**   
	 * 返回所有的用户自定义对象
	 * @Function getUserObjects
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午1:21:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public Object[] getUserObjects();

	/**   
	 * 是否含有属性信息
	 * @Function hasAttrValues
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-20 下午4:34:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	public boolean hasAttrValues();

	/**   
	 * 检查VO对象中是否有业务编码
	 * 
	 * @Function hasBusinessId
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午5:44:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public boolean hasBusinessId();

	/**   
	 * 是否有指定key对应的自定义的对象
	 * 
	 * @Function hasUserObject
	 * @Description 
	 *
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午11:12:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	boolean hasUserObject(Object key);
	/**   
	 * 是否有自定义的对象
	 * 
	 * @Function hasUserObjects
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午1:43:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public boolean hasUserObjects();
	
	/**   
	 * 从容器中移除一个属性对象
	 * @Function removeAttrValue
	 * @Description 
	 *
	 * @param attrValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-20 下午4:33:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-20     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface removeAttrValue(DataContainerInterface attrValue) throws Exception;

	/**   
	 * 删除自定义对象 
	 * @Function removeUserObject
	 * @Description 
	 *
	 * @param key
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午2:47:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public Object removeUserObject(Object key) throws Exception;

	/**   
	 * 设置当前业务的业务编码，方便在同一笔业务操作中业务编码的共享，同时该属性将作为记录日志时获取业务编码的指定存储的变量。
	 * 
	 * @Function setBusinessId
	 * @Description 
	 *
	 * @param businessId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-14 下午5:38:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-14     huzq           v1.0.0               修改原因<br>
	 */
	public void setBusinessId(long businessId) throws Exception;

	/**   
	 * 通过键值对等方式往对象中存放用户自定的对象，该对象可以是任意类型的对象。
	 * 
	 * @Function setUserObject
	 * @Description 设置自定义对象
	 *
	 * @param key 键
	 * @param value 值
	 * @exception Exception
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:44:13s
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public void setUserObject(Object key, Object value) throws Exception;

	/**   
	 * 获取主对象的ID
	 * 
	 * @Function getId
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-16 下午7:53:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public long getId();

}
