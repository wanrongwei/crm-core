package com.asiainfo.crm.cm.common.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.ivalues.IBOBsDistrictValue;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.common.util.ws.address4QryContion;
/**
 * 地址维护
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author yangjh
 * @date 2014-5-8 下午12:56:16
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-5-8     yangjh           v1.0.0               修改原因<br>
 */
public interface IAddressSV {

	/**
	 * 保存地址信息传入地址信息(按层级)，如果地址原来不存在，新增地址并返回地址ID，如果地址原来存在，返回原有地址ID	
	 * @Function saveAddress
	 * @Description 
	 *
	 * @param address
	 * ADDRESS_TYPE	地址类型	String	CPR_ADDRESS 或者KOB_ADDRESS，必填
	   DISTRICT_ID	区域ID	Long	必填
	   DIRECTION		String	可选
	   ZIPCODE	邮编	String	可选
	   CITY		String	丹麦层级地址
	   STREET_NAME		String	丹麦层级地址
	   APARTMENT		String	丹麦层级地址
	   FLOOR		Integer	丹麦层级地址
	   HOUSE_NUMBER		String	丹麦层级地址
	   HOUSE_LETTER		String	丹麦层级地址
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-5-8 下午12:57:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-5-8     yangjh           v1.0.0               修改原因<br>
	 */
	public long saveAddress(address address) throws Exception;

	/**
	 * 
	 * @Function getAddress
	 * @Description 
	 * 根据地址ID查询地址信息
	 * @param addressId
	 * @param districtId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-5-8 下午12:59:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-5-8     yangjh           v1.0.0               修改原因<br>
	 */
	public address getAddress(long addressId, String districtId) throws Exception;
	/**
	 * 
	 * @Function getAddressInfo
	 * @Description 
	 * 根据地址ID查询地址信息
	 * @param addressId
	 * @param districtId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date2015-5-19 下午12:59:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-5-19     huangqun           v1.0.0               修改原因<br>
	 */
	public address getAddressInfo(long addressId,String districtId)throws Exception;
	
	/**
	 * 保存地址信息传入地址信息(按层级)，如果地址原来不存在，新增地址并返回地址ID，如果地址原来存在，返回原有地址ID	
	 * @Function saveAddress
	 * @Description 
	 *
	 * @param address
	 * @param sRequestFormat
	 * @param sTenantId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-10-10 下午3:03:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-10     yangjh           v1.0.0               修改原因<br>
	 */
	public long saveAddress(address address,String sRequestFormat, String sTenantId) throws Exception;
	
	/**
	 * 查询地址数量
	 * @Function queryAddressListCount
	 * @Description 
	 *
	 * @param address
	 * @param sRequestFormat
	 * @param sTenantId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-10-10 下午4:54:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-10     yangjh           v1.0.0               修改原因<br>
	 */
	public  int queryAddressListCount(address4QryContion address,String sRequestFormat, String sTenantId)throws Exception;
	public  int queryAddressListCount(String address)throws Exception;
	public  int queryAddressListCount4hu(String address)throws Exception;
	/**
	 * 查询地址列表
	 * @Function queryAddressList
	 * @Description 
	 *
	 * @param address
	 * @param sRequestFormat
	 * @param sTenantId
	 * @param strIdx
	 * @param endIdx
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-10-10 下午4:57:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-10     yangjh           v1.0.0               修改原因<br>
	 */
	public  address[] queryAddressList(address4QryContion address,String sRequestFormat, String sTenantId,int strIdx,int endIdx)throws Exception;
	public  DataContainer[] queryAddressList(String address,int strIdx,int endIdx)throws Exception;
	public  DataContainer[] queryAddressList4hu(String XML,int strIdx,int endIdx)throws Exception;
	
	/**
	 * 按distrctType（对应BS_DISTRICT表 的DISTRICT_TYPE）获取district信息
	 * @Function getAllDistrictByDistrictType
	 * @Description 
	 *
	 * @param diatrictType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-10-15 下午4:07:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-15     yangjh           v1.0.0               修改原因<br>
	 */
	public  IBOBsDistrictValue[] getAllDistrictByDistrictType(int districtType)throws Exception;

}
