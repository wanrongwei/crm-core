/**   
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmxServAttributesDAO.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: huangxl
* @date: 2012-4-9 下午08:18:17 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2012-4-9     huangxl           v1.0.0               修改原因
*/
package com.asiainfo.crm.cm.custview.dao.interfaces;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import com.asiainfo.crm.cm.custview.ivalues.IBOCmxServAttributesValue;

/**
 * @author huangxl
 *
 *
 * @version: v1.0.0
 * @author: huangxl
 * @date: 2012-4-9 下午08:18:17 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2012-4-9     huangxl           v1.0.0               修改原因
 */
public interface ICmxServAttributesDAO {
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huangxl
	 * @date: 2012-4-9 下午08:21:13 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-4-9     huangxl           v1.0.0               修改原因
	 */
	public BigDecimal getNewId() throws Exception;
	/**
	 * 查询用户服务属性信息
	 * @param billId
	 * @param servAttributes
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huangxl
	 * @date: 2012-4-9 下午08:21:16 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-4-9     huangxl           v1.0.0               修改原因
	 */
	public IBOCmxServAttributesValue[] queryCmxServAttributes(
			String billId,String servAttributes,int startNum,int endNum) throws Exception;
	/**
	 * 查询用户服务属性总数
	 * @param billId
	 * @param servAttributes
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huangxl
	 * @date: 2012-4-9 下午08:21:20 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-4-9     huangxl           v1.0.0               修改原因
	 */
	public int queryCmxServAttributesCount(
			String billId,String servAttributes) throws Exception;
	
	/**
	 * 保存用户服务属性信息
	 * @param infoValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huangxl
	 * @date: 2012-4-9 下午08:21:23 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-4-9     huangxl           v1.0.0               修改原因
	 */
	public void saveCmxServAttributes(
			IBOCmxServAttributesValue[] infoValues) throws Exception;
	
	/**
	 * 查询重要服务保障客户
	 * @param servAttribute
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huangxl
	 * @date: 2012-4-26 上午10:24:18 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-4-26     huangxl           v1.0.0               修改原因
	 */
	public IBOCmxServAttributesValue[] queryCmxServAttributesByAttribute(
			String servAttribute) throws RemoteException,Exception;
	
	/**
	 * 根据客户编号查询客户服务属性
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huangxl
	 * @date: 2012-6-8 下午03:41:08 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-6-8     huangxl           v1.0.0               修改原因
	 */
	public IBOCmxServAttributesValue[] queryServAttributeByCustId(long custId) throws Exception;
}
