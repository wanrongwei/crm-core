package com.asiainfo.crm.cm.ln.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupAuditInfoValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

public interface ICmLnClubServiceSV {

	/**
	 * 计算VIP等级
	 * @Function saveVipLevel
	 * @Description 
	 *  @param billId  手机号码
	 *  @param level   VIP等级
	 *  @param elementType 因子类型   1 积分评定
									2 地市调整
									3 特殊套餐
									4 跨区入网
									5 中高端评定
									6 前台新增大客户
									7 跨省改号 
									8 关键人
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 29, 2012 5:42:34 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 29, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveVipLevel(String billId, int level, int elementType) throws Exception;

	/**
	 * 计算VIP等级 (加一个参数clubId)
	 * @param billId
	 * @param clubId
	 * @param level
	 * @param elementType
	 * @throws Exception
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version      Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-11-21   huangxl         v1.0.0               修改原因<br>
	 */
	public void saveVipLevel(String billId, long clubId, int level, int elementType) throws Exception;

	/**   
	 * @Function delGrpContact
	 * @Description 删除集团关键人 因子更改
	 *
	 * @param billId  手机号码
	 * @param elementType  因子类型
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void delGrpContact(String billId, int elementType) throws Exception;

	/**   
	 * @Function countVipLevel
	 * @Description 计算vip级别
	 *
	 * @param insDesRelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void countVipLevel(String billId, int elementType, IQUserBaseInfoValue userBaseInfo) throws Exception;

	/**
	 * 
	 * @param billId
	 * @param clubId
	 * @param elementType
	 * @param userBaseInfo
	 * @throws Exception
	 * huangxl 
	 * 2013-11-21
	 *
	 */
	public void countVipLevel(String billId, long clubId, int elementType, IQUserBaseInfoValue userBaseInfo) throws Exception;

	/**   
	 * @Function getContLevel
	 * @Description 获得关键人的最高级别
	 *
	 * @param insDesRelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public int getContLevel(String billId) throws Exception;

	/**   
	 * @Function saveAuditInfo1Level
	 * @Description 保存关键人申请功能
	 *
	 * @param CustId	客户编号
	 * @param contLevel 关键人级别
	 * @param contId 关键人编号
	 * @param regionId 地市
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveAuditInfo1Level(String CustId, String contLevel, String contId, String regionId, int newContLevel) throws Exception;

	/**   
	 * @Function updateContactLevel
	 * @Description 审核通过以后更改关键人级别
	 *
	 * @param contId   关键人编号
	 * @param contLevel   关键人级别
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void updateContactLevel(String contId, String contLevel) throws Exception;

	/**   
	 * @Function qryGrpAuditInfo
	 * @Description 查询审核信息表（CM_AUDIT_INFO）数据
	 *
	 * @param dt   查询对象
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupAuditInfoValue[] qryGrpAuditInfo(DataContainer dt) throws Exception;

	/**   
	 * @Function updateGrpCustomerContactLevel
	 * @Description 修改集团关键人级别
	 *
	 * @param dt   查询对象
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void updateGrpCustomerContactLevel(long grpCustId, int custServiceLevel) throws Exception;

	/**   
	 * @Function saveClubmembers
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Dec 23, 2013 10:28:50 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Dec 23, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public void saveClubmembers(IClubMemberValue clubMemberValue) throws Exception;
}
