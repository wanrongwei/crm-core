package com.asiainfo.crm.common.service.interfaces;

import java.rmi.RemoteException;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.ivalues.IBOBsParaDetailValue;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.ivalues.IBOBsOperationValue;
import com.asiainfo.crm.common.ivalues.IBOBsSoOrdDepositeCfgValue;
/**
 * 静态数据表的查询服务
 * 
 * @author linzhaoming 2010-12-27
 * 
 */
public interface IBaseSV {
	
	/**
	 * 系统参数配置表(BS_PARA_DETAIL) 索引：REGION_ID,PARA_TYPE,PARA_CODE 查询条件：STATE='U'
	 */
	public IBOBsParaDetailValue[] getAllBsParaDetail() throws Exception,
			RemoteException;

	/**
	 * 、业务编码表(BS_OPERATION) 索引：BUSINESS_ID 查询条件：STATE='U'
	 */
	public IBOBsOperationValue[] getAllBsOperation() throws Exception,
			RemoteException;

	/**   
	 * @Function: getAllBsSoOrdDepositeCfgs
	 * @Description: 查询需要沉淀的订单配置表有效信息
	 *
	 * @param: 参数描述
	 * @return: 返回结果描述
	 * @throws: 异常描述
	 *
	 * @version: v1.0.0
	 * @author: lizy5
	 * @date: May 17, 2011 21:32:49 
	 *
	 * Modification History:
	 * Date            Author          Version            Description
	 *---------------------------------------------------------*
	 * May 17, 2011     lizy5           v1.0.0               修改原因
	 */
	public IBOBsSoOrdDepositeCfgValue[] getAllBsSoOrdDepositeCfgs() throws Exception ,RemoteException;

	/**   
	 * 获取所有行政区域信息
	 * @Function queryAllBsCommonDistricts
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-7 下午4:17:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOBsCommonDistrictValue[] queryAllCommonDistricts() throws Exception;
	
	/**   
	 * 获取code类型获得bs_static_data中的静态数据数组
	 * @Function getStaticData
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author liyy9
	 * @date 2012-6-4 下午4:17:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4     liyy9           v1.0.0               修改原因<br>
	 */
	public  IBOBsStaticDataValue[] getStaticData(String codeType)throws RemoteException,Exception;
	/**   
	 * 获取code类型和code值获得bs_static_data中的静态数据
	 * @Function getStaticData
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author liyy9
	 * @date 2012-6-4 下午4:17:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4     liyy9           v1.0.0               修改原因<br>
	 */
	public  IBOBsStaticDataValue getStaticData(String codeType, String codeValue)throws RemoteException,Exception;


}
