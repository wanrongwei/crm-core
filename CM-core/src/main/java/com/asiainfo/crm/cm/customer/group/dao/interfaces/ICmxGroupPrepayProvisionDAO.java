/**
 * 
 */
package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.util.Date;
import java.util.Map;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupPrepayContactValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupPrepayBlackInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupPrepayProvisionValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxPayCardRecValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupGroupPrepayContactValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmxGroupPrepayProvisionDAO.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 10, 2011 11:53:14 AM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Mar 10, 2011		huzq2           v1.0.0               修改原因
 */

public interface ICmxGroupPrepayProvisionDAO
{
	/**   
	 * @Function: ICmxGroupPrepayProvisionDAO.java
	 * @Description: 查询集团预付费申请信息
	 *
	 * @param groupCustId
	 * @param busiCode
	 * @param groupRegionId
	 * @param groupCountyId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 10, 2011 11:53:46 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmxGroupPrepayProvisionValue[] queryGroupPrepayProvisions(long groupCustId, String busiCode,
			String groupRegionId, String groupCountyId) throws Exception;

	/**   
	 * @Function: ICmxGroupPrepayProvisionDAO.java
	 * @Description: 查询授信卡商
	 *
	 * @param groupCustId
	 * @param busiCode
	 * @param groupRegionId
	 * @param groupCountyId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 10, 2011 12:47:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmxGroupPrepayProvisionValue[] querAccreditedPrepayProvisions(long groupCustId, String busiCode,
			String groupRegionId, String groupCountyId) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据预付费ID查询预付费信息
	*
	* @param provisionId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 24, 2011 3:43:10 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 24, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupPrepayProvisionValue queryGroupPrepayProvisionByProvisionid(long provisionId) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 保存集团预付费信息
	*
	* @param groupPrepayProvision
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 24, 2011 3:43:14 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 24, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupPrepayProvisionByProvisionid(IBOCmxGroupPrepayProvisionValue groupPrepayProvision) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 批量保存集团预付费信息
	*
	* @param groupPrepayProvisions
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 24, 2011 3:43:17 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 24, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupPrepayProvisionByProvisionids(IBOCmxGroupPrepayProvisionValue[] groupPrepayProvisions) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据集团客户ID查询集团预付费信息
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 24, 2011 3:43:20 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 24, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupPrepayProvisionValue[] queryGroupPrepayProvisionByGroupCustId(long groupCustId,int start,int end) throws Exception;
	
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 该集团是否开通 busiCode服务
	*
	* @param groupCustId 集团ID
	* @param busiCode 传入服务code
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 1, 2011 12:31:20 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 1, 2011     fengjian           v1.0.0               修改原因
	*/
	public boolean existSameSelfRepayGroupPrepayProvision(long groupCustId,String busiCode) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据条件检索集团预付费信息
	*
	* @param groupCustId
	* @param busiCode
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Apr 6, 2011 2:35:23 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 6, 2011     admin           v1.0.0               修改原因
	*/
	public IBOCmxGroupPrepayProvisionValue queryGroupPrepayProvisionByCondition(long groupCustId,String busiCode)throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据集团客户ID查询集团预付费信息数量
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 24, 2011 4:17:41 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 24, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupPrepayProvisionCountByGroupCustId(long groupCustId) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 取得新ID
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 25, 2011 10:12:59 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getNewId() throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 是否存在相同时间，相同业务编号的数据
	*
	* @param groupPrepayProvisionValue
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 25, 2011 4:39:24 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public boolean existSameTypeGroupPrepayProvision(IBOCmxGroupPrepayProvisionValue groupPrepayProvisionValue) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据黑名单ID获取集团黑名单信息
	*
	* @param blackId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 25, 2011 5:52:40 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupPrepayBlackInfoValue queryGroupPrepayBlackInfoValueByBlackId(long blackId) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据集团客户ID获取集团黑名单信息
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 25, 2011 6:01:02 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupPrepayBlackInfoValue[] queryGroupPrepayBlackInfoValueByGroupCustId(long groupCustId,int start,int end) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 保存集团客户黑名单信息
	*
	* @param prepayBlackInfoValue
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 25, 2011 6:01:45 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupPrepayBlackInfo(IBOCmxGroupPrepayBlackInfoValue prepayBlackInfoValue) throws Exception;

	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 批量保存集团客户黑名单信息
	*
	* @param prepayBlackInfoValue
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 25, 2011 6:02:50 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupPrepayBlackInfos(IBOCmxGroupPrepayBlackInfoValue[] prepayBlackInfoValue) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据集团客户ID获取集团黑名单信息数量
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Mar 25, 2011 8:42:16 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 25, 2011     admin           v1.0.0               修改原因
	*/
	public int queryGroupPrepayBlackInfoCountByGroupCustId(long groupCustId) throws Exception;
	
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据条件查询集团黑名单的数量
	*
	* @param groupCustId
	* @param busiCode
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Apr 6, 2011 1:02:11 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 6, 2011     admin           v1.0.0               修改原因
	*/
	public int queryGroupPrepayBlackInfoCountByCondition(long groupCustId,String busiCode) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 取得集团黑名单的ID
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 25, 2011 8:46:36 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getBlackInfoNewId() throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 取得相同数量的黑名单信息数量
	*
	* @param prepayBlackInfoValue
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 28, 2011 11:42:41 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 28, 2011     fengjian           v1.0.0               修改原因
	*/
	public int querySameTypeBlackInfoCount(String busiCode, long groupCustId) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据条件检索付费卡信息
	*
	* @param condition
	* @param parameter
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 28, 2011 4:29:18 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 28, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxPayCardRecValue[] queryPayCardRecordByCondition(String condition,Map parameter,int start, int end) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据条件检索付费卡信息数量
	*
	* @param condition
	* @param parameter
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 28, 2011 4:30:56 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 28, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryPayCardRecordCountByCondition(String condition,Map parameter) throws Exception;
	
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 取得检索付费卡信息主键
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 6, 2011 7:11:07 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 6, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getPayCardRecordId() throws Exception;
	
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 保存集团卡销售记录
	*
	* @param payCardRec
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 7, 2011 11:35:59 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 7, 2011     fengjian           v1.0.0               修改原因
	*/
	public  void  savePayCardRecord(IBOCmxPayCardRecValue payCardRec) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 转充密码校验
	*
	* @param billId
	* @param password
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 25, 2011 3:47:28 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupPrepayContactCountByBillIdAndPassword( String billId , String password ) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 查询预付费联系人
	*
	* @param billId
	* @param password
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 25, 2011 4:13:59 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupPrepayContactValue queryGroupPrepayContactByBillIdAndPassword( String billId , String password ) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 保存预付费联系人
	*
	* @param groupPrepayContact
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 25, 2011 3:47:31 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupPrepayContact(IBOCmGroupPrepayContactValue groupPrepayContact) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 查询可充值集团
	*
	* @param billId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 25, 2011 3:47:35 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupGroupPrepayContactValue[] queryGroupPrepayContactByBillId(String billId) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 校验号码跟集团是否充值联系人关系
	*
	* @param billId
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 25, 2011 3:47:39 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 25, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupPrepayContactByBillIdAndGroupCustId(String billId,long groupCustId) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据集团ID查询集团预付费
	*
	* @param groupCustId
	* @param startNum
	* @param endNum
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 30, 2011 8:33:15 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 30, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupPrepayContactValue[]  queryGroupPrepayContactByGroupCustId(long groupCustId,int startNum,int endNum) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据集团ID查询集团预付费联系人个数
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 30, 2011 8:33:18 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 30, 2011     fengjian           v1.0.0               修改原因
	*/
	public int  queryGroupPrepayContactCountByGroupCustId(long groupCustId) throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description:  集团预付费联系人 主键
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 30, 2011 8:50:50 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 30, 2011     fengjian           v1.0.0               修改原因
	*/
	public long queryGroupPrepayContactNewId() throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 取得当前系统时间
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 24, 2011 3:09:25 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 24, 2011     fengjian           v1.0.0               修改原因
	*/
	public Date getSysDate() throws Exception;
	
	/**   
	* @Function: ICmxGroupPrepayProvisionDAO.java
	* @Description: 根据主键contId 查询集团专有联系人信息
	*
	* @param contId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 31, 2011 1:03:05 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 31, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupPrepayContactValue  queryGroupPrepayContactByContId(long contId) throws Exception;
}
