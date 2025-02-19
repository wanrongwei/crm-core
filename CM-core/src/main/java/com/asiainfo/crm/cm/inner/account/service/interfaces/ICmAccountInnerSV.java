package com.asiainfo.crm.cm.inner.account.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;

/**   
 * @Function: ICmAccountInnerSV.java 
 * @Description: 提供账户的服务接口

 * @version: v1.0.0
 * @author: zhangyin
 * @date: 2011-12-12 下午05:23:09 
 *
 * Modification History:
 * Date               Author            Version            Description
 * -------------------------------------------------------------------
 * 2011-12-12        zhangyin            v1.0.0                 修改原因
 */
public interface ICmAccountInnerSV {

	/**
	 * 根据查询参数获取账户的支付方案信息
	 * @param condition 正常格式的条件拼接
	 * @param otherCond  自定义条件
	 * @param beanClass  查询的相关BOBean
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 10, 2012 4:53:14 PM
	 */
	public DataContainerInterface[] qryCmAcctPaymentInfos(DataContainer condition,String otherCond,Class beanClass,int startIndex,int endIndex)throws Exception;
	
	/**
	 * 根据查询参数获取账户的支付方案信息条数
	 * @param condition 正常格式的条件拼接
	 * @param otherCond  自定义条件
	 * @param beanClass  查询的相关BOBean
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 10, 2012 4:53:18 PM
	 */
	public  int qryCmAcctPaymentInfoCount(DataContainer condition,String otherCond,Class beanClass)throws Exception;
	
	
	/**
	 * 根据账户编号和客户编号查询客户账户之间的关系
	 * @param acctId  账户编号
	 * @param custId   客户编号
	 * @param beanClass BO*bean类
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 16, 2012 1:42:45 PM
	 */
	public DataContainerInterface[] queryCustAcctRelsByAcctIdOrCustId(long acctId,long custId,Class beanClass,int startIndex, int endIndex)throws Exception;
	
	/**
	 * 
	 * 根据账户编号和客户编号查询客户账户之间的关系条数
	 * @param acctId  账户编号
	 * @param custId   客户编号
	 * @param beanClass BO*bean类
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 16, 2012 2:10:36 PM
	 */
	public int queryCustAcctRelsByAcctIdOrCustIdCount(long acctId,long custId,Class beanClass)throws Exception;
	
	public DataContainerInterface[] queryCustAcctRelsAllByAcctIdOrCustId(long acctId,long custId,Class beanClass,int startIndex, int endIndex)throws Exception;
	
	public int queryCustAcctRelsAllByAcctIdOrCustIdCount(long acctId,long custId,Class beanClass)throws Exception;

	public DataContainerInterface[] queryCustAcctRelsByAcctIdOrCustIdOrInstallmentFlag(long acctId, long custId, long installmentFlag, Class beanClass, int startIndex, int endIndex) throws Exception;
}