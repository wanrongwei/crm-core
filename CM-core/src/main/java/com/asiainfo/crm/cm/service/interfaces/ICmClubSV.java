/**
 * 
 */
package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.model.ivalues.IClubValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 俱乐部基本信息相关的服务
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-13 下午5:28:21
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmClubSV {

	/**   
	 * @Function queryClubById
	 * @Description 根据俱乐部编号查询俱乐部信息
	 *
	 * @param clubId 俱乐部编号
	 * @return 符合条件的俱乐部信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:29:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubValue queryClubById(long clubId) throws Exception;

	/**   
	 * @Function queryClubs
	 * @Description 根据查询条件查询俱乐部信息
	 *
	 * @param clubName 俱乐部名称
	 * @param clubType 俱乐部类型
	 * @param clubCode 俱乐部编码
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的俱乐部信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:35:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubValue[] queryClubs(String clubName, int clubType, String clubCode, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubCount
	 * @Description 根据查询条件查询俱乐部数量
	 *
	  * @param clubName 俱乐部名称
	 * @param clubType 俱乐部类型
	 * @param clubCode 俱乐部编码
	 * @return 符合条件的俱乐部数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:34:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubCount(String clubName, int clubType, String clubCode) throws Exception;

	/**   
	 * @Function queryAllClubs
	 * @Description 查询所有俱乐部信息
	 *
	 * @return 所有俱乐部信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-17 下午5:20:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-17     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubValue[] queryClubs(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryClubCount
	 * @Description 根据条件查询俱乐部数量
	 *
	 * @param criteria
	 * @return 符合条件的俱乐部数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-20 下午3:32:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-20     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryClubCount(String criteria) throws Exception;

	/**   
	 * @Function saveClub
	 * @Description 保存俱乐部基本信息
	 *
	 * @param clubValue 俱乐部基本信息
	 * @return 保存后的俱乐部编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:32:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public long saveClub(IClubValue clubValue) throws Exception;
	
	/**
	 * 支持根据名称模糊查询
	 * @param clubId
	 * @param clubName
	 * @param clubType
	 * @param clubCode
	 * @return
	 * @throws Exception
	 * @Function: illegeQuery
	 * @author: LSC
	 * @date: 2012-4-6 下午4:12:28 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-6       LSC         v1.0.0               修改原因
	 */
	public IClubValue[] illegeQuery(long clubId,String clubName, int clubType, String clubCode, int startNum, int endNum)throws Exception;
}
