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
public interface IVOClubActivityValue extends IValueObject {

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
	 * @Function getClubId
	 * @Description 获取归属的俱乐部编号
	 *
	 * @return 俱乐部编号
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:44:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	long getClubId();

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

	/**   
	 * @Function getClubAction
	 * @Description 获取俱乐部活动信息
	 *
	 * @return 活动信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:45:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	IClubActionValue getClubAction() throws Exception;

	/**   
	 * @Function setClubAction
	 * @Description 设置俱乐部活动信息
	 *
	 * @param actionValue
	 * @return 当前活动的编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:45:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	long setClubAction(IClubActionValue actionValue) throws Exception;

	/**   
	 * @Function getClubActionRecs
	 * @Description 获取活动记录
	 *
	 * @return 活动记录
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:47:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	IClubActionRecValue[] getClubActionRecs() throws Exception;

	/**   
	 * @Function setClubActionRec
	 * @Description 添加一条活动记录
	 *
	 * @param actionRecValue
	 * @return 被添加的记录编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:48:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	long setClubActionRec(IClubActionRecValue actionRecValue) throws Exception;

	/**   
	 * @Function removeClubActionRec
	 * @Description 移除一条记录
	 *
	 * @param actionRecValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午5:54:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	IClubActionRecValue removeClubActionRec(IClubActionRecValue actionRecValue) throws Exception;

	/**  
	 *  
	 * @Function getClubActivityId
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * 
	 * @author huzq
	 * @date 2012-7-16 下午8:59:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	public long getClubActivityId();
}
