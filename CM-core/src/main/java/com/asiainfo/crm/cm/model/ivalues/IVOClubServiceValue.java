/**
 * 
 */
package com.asiainfo.crm.cm.model.ivalues;


/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-15 下午4:47:49
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
 */
public interface IVOClubServiceValue extends IValueObject {

	long getClubId();

	long getClubServiceId();

	/**   
	 * @Function getClub
	 * @Description 获取俱乐部基本信息
	 *
	 * @return 俱乐部基本信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-9 下午8:58:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-9     huzq2           v1.0.0               修改原因<br>
	 */
	IClubValue getClub() throws Exception;

	/**   
	 * @Function setClub
	 * @Description 设置俱乐部基本信息
	 *
	 * @param clubValue
	 * @return 当前俱乐部编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-9 下午9:04:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-9     huzq2           v1.0.0               修改原因<br>
	 */
	long setClub(IClubValue clubValue) throws Exception;

	IClubServiceValue getClubService() throws Exception;

	long setClubService(IClubServiceValue serviceValue) throws Exception;

	IClubServiceCylceValue[] getClubServiceCylces() throws Exception;

	IClubServiceCylceValue removeClubServiceCylce(IClubServiceCylceValue cylceValue) throws Exception;

	long setClubServiceCycle(IClubServiceCylceValue cylceValue) throws Exception;

	IClubServiceRecValue[] getClubServiceRecs() throws Exception;

	IClubServiceRecValue removeClubServiceRec(IClubServiceRecValue serviceRecValue) throws Exception;

	long setClubServiceRec(IClubServiceRecValue serviceRecValue) throws Exception;

	IVOClubServiceDimensionValue[] getClubServiceDimensions() throws Exception;

	long setClubServiceDimension(IVOClubServiceDimensionValue dimensionValue) throws Exception;

	IVOClubServiceDimensionValue removeClubServiceDimension(IVOClubServiceDimensionValue dimensionValue) throws Exception;

	boolean hasClubServiceCycle() throws Exception;

	boolean hasClubServiceRec() throws Exception;

	boolean hasClubServiceDimension() throws Exception;
}
