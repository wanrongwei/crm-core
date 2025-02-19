package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.sql.Timestamp;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmRepOnceIncomeBusiValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmRepOnceIncomeIDCValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupOnceIncomeBillValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupOnceIncomeDetailValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupOnceIncomeValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupIncomeDetailValue;

public interface ICmGroupOnceIncomeDAO
{

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据一次性收费ID检索一次性收费信息
	*
	* @param onceIncomeId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 8, 2011 3:18:36 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 8, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeValue queryGroupOnceIncomeByOnceIncomeId(long onceIncomeId) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据集团检索集团一次性收入信息
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 7, 2011 10:47:59 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 7, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeValue[] queryGroupOnceIncomeByGroupCustId(long groupCustId) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 取得到期合同在标志位recStatus中的一次性收入记录
	*
	* @param endMonth
	* @param recStatus
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 21, 2011 11:38:15 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 21, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeValue[] queryGroupOnceIncomeByCondition(String endMonth,int[] recStatus,int start,int end) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description:  取得到期合同在标志位recStatus中的一次性收入记录数量
	*
	* @param endMonth
	* @param recStatus
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 21, 2011 11:38:12 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 21, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupOnceIncomeCountByCondition(String endMonth,int[] recStatus) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 分页查询符合条件的要写入清单报表的数据
	*
	* @param startMonth
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 3:30:14 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeValue[] queryGroupOnceIncomeByHistoryForRep(String startMonth,int start,int end) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 查询符合条件的要写入清单报表的数据个数
	*
	* @param startMonth
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 3:30:17 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupOnceIncomeCountByHistoryForRep(String startMonth) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据条件检索集团一次性付费信息
	*
	* @param feeType
	* @param planType
	* @param startDate
	* @param endDate
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 8, 2011 3:18:46 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 8, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeValue[] queryGroupOnceIncomesByCondition(int feeType, int planType, String startDate, String endDate, int start, int end) throws Exception;
	
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据条件检索集团一次性付费信息以及上月计费和本月计费数据
	*
	* @param feeType
	* @param planType
	* @param startDate
	* @param endDate
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 11, 2011 10:33:26 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 11, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupIncomeDetailValue[] queryGroupOnceIncomeAtrrByCondition(int feeType,int planType,String startDate,String endDate,long groupCustId,int start,int end) throws Exception;

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据类型查询集团一次性收入数据
	*
	* @param feeType
	* @param planType
	* @param startDate
	* @param endDate
	* @param groupCustId
	* @param incomeStatus
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 11:42:42 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupIncomeDetailValue[] queryAllGroupOnceIncomeIDC(int planType,int start,int end) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 该函数的功能描述
	*
	* @param planType
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 20, 2011 5:33:25 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 20, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryAllGroupOnceIncomeIDCCount(int planType) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据条件检索集团一次性付费信息以及上月计费和本月计费数据数量
	*
	* @param feeType
	* @param planType
	* @param startDate
	* @param endDate
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 11, 2011 1:31:14 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 11, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupOnceIncomeAtrrCountByCondition(int feeType,int planType,String startDate,String endDate,long groupCustId) throws Exception;
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 保存集团客户信息
	*
	* @param groupOnceIncome
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 8, 2011 3:21:53 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 8, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupOnceIncome(IBOCmxGroupOnceIncomeValue groupOnceIncome) throws Exception;

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 批量保存集团客户信息
	*
	* @param groupOnceIncome
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 8, 2011 3:21:55 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 8, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupOnceIncomes(IBOCmxGroupOnceIncomeValue[] groupOnceIncome) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 取得集团一次性收入主键
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 8, 2011 11:24:19 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 8, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getGroupOnceIncomeNewId() throws Exception;
	
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 取得系统时间
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 8, 2011 11:54:42 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 8, 2011     fengjian           v1.0.0               修改原因
	*/
	public Timestamp getDate() throws Exception;


	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据集团一次性付费ID检索集团一次性收费计费号
	*
	* @param onceIncomeId
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 12, 2011 7:53:12 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 12, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeBillValue[] queryGroupOnceIncomeBillByOnceIncomeId(long onceIncomeId,int start,int end) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据集团一次性付费ID检索集团一次性收费计费号数量
	*
	* @param onceIncomeId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 12, 2011 7:56:12 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 12, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupOnceIncomeBillCountByOnceIncomeId(long onceIncomeId) throws Exception;

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据条件检索符合条件记录
	*
	* @param onceIncomeId
	* @param billId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 9, 2011 12:55:50 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeBillValue queryGroupOnceIncomeBillByCondition(long onceIncomeId, String billId) throws Exception;

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 保存集团一次性计费信息
	*
	* @param groupOnceIncomeBill
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 9, 2011 12:56:32 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupOnceIncomeBill(IBOCmxGroupOnceIncomeBillValue groupOnceIncomeBill) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 批量保存集团一次性计费
	*
	* @param groupOnceIncomeBills
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 10, 2011 12:24:52 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 10, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupOnceIncomeBills(IBOCmxGroupOnceIncomeBillValue[] groupOnceIncomeBills) throws Exception;

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据集团一次性收入ID检索集团一次性收入明细
	*
	* @param onceIncomeId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 9, 2011 1:29:16 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeDetailValue[] queryGroupOnceIncomeDetailsByOnceIncomeId(long onceIncomeId) throws Exception;

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据详细ID检索集团一次性收入明细
	*
	* @param detailId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 13, 2011 2:55:11 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 13, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeDetailValue queryGroupOnceIncomeDetailByDetailId(long detailId) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 查询所有当月集团一次性收入详细
	*
	* @param onceIncomeId
	* @param curDate
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 10, 2011 10:41:45 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 10, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getSumIncomeByCurMonth(long onceIncomeId,String curMonth) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 保存集团一次性明细
	*
	* @param groupOnceIncomeDetail
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 9, 2011 1:29:20 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupOnceIncomeDetail(IBOCmxGroupOnceIncomeDetailValue groupOnceIncomeDetail) throws Exception;

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 批量保存集团一次性明细
	*
	* @param groupOnceIncomeDetails
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 9, 2011 11:51:51 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupOnceIncomeDetails(IBOCmxGroupOnceIncomeDetailValue[] groupOnceIncomeDetails) throws Exception;

	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据一次性计费和日期检索集团一次性计费信息
	*
	* @param onceIncomeId
	* @param curDate
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 10, 2011 1:38:57 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 10, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getSumIncomeByMonth(long onceIncomeId,String curMonth) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 分页查询集团一次性收入详细信息数量
	*
	* @param onceIncomeId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 13, 2011 11:44:04 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 13, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupOnceIncomeDetailCountByOnceIncomeId(long onceIncomeId) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 分页查询集团一次性收入详细信息
	*
	* @param onceIncomeId
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 13, 2011 11:44:47 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 13, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmxGroupOnceIncomeDetailValue[] queryGroupOnceIncomeDetailsByOnceIncomeId(long onceIncomeId,int start,int end) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 取得一次性计费的主键
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 10, 2011 11:22:14 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 10, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getGroupOnceIncomeDetailNewId()  throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 检索是否有重复的计费数据
	*
	* @param onceIncomeId
	* @param billId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 10, 2011 11:20:30 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 10, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupOnceIncomeBillCountByCondition(long onceIncomeId,String billId) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 查询一次性记录数量
	*
	* @param constractId
	* @param onceIncomeId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Apr 13, 2011 11:09:37 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 13, 2011     admin           v1.0.0               修改原因
	*/
	public int queryGroupOnceIncomeCountByConstractId (String constractId,long onceIncomeId) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 截止上月累计分摊收入：查询清单报表
	*
	* @param onceIncomeId
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 11:22:19 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmRepOnceIncomeBusiValue[] queryApportionIncome(long[] onceIncomeIds) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据条件查询清单报表信息数量
	*
	* @param groupId
	* @param onceIncomeId
	* @param rec_status
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 3:52:29 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryApportionIncomeCountByCondition(long groupId,long onceIncomeId, int[] rec_status) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 保存清单报表
	*
	* @param repOnceIncome
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 11:22:22 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveRepOnceIncomeBusi(IBOCmRepOnceIncomeBusiValue repOnceIncome) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 查询集团ID下IDC数量
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 20, 2011 12:01:50 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 20, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryRepOnceIncomeIDCByGroupId(long groupId) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 根据条件检索IDC欠费报表信息
	*
	* @param groupCustId
	* @param onceIncomeId
	* @param startDate
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 20, 2011 10:19:38 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 20, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmRepOnceIncomeIDCValue[] queryRepOnceIncomeIDCByCondition(long groupCustId,long onceIncomeId,String startDate) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 查询清单报表信息
	*
	* @param onceIncomeId
	* @param month
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 5:46:42 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmRepOnceIncomeBusiValue[] queryApportionIncomeByMonth(long onceIncomeId,String month,long groupId) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 保存清单报表
	*
	* @param repOnceIncomes
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 11:22:25 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveRepOnceIncomeBusis(IBOCmRepOnceIncomeBusiValue[] repOnceIncomes) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 保存项目化一次性收入用户欠缴报表
	*
	* @param repOnceIncome
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 11:28:30 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveRepOnceIncomeIDC(IBOCmRepOnceIncomeIDCValue repOnceIncome) throws Exception;
	
	/**   
	* @Function: ICmGroupOnceIncomeDAO.java
	* @Description: 保存项目化一次性收入用户欠缴报表
	*
	* @param repOnceIncomes
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 19, 2011 11:28:33 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveRepOnceIncomeIDCs(IBOCmRepOnceIncomeIDCValue[] repOnceIncomes) throws Exception;
}
