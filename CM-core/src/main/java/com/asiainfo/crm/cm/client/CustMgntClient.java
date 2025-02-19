package com.asiainfo.crm.cm.client;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.bce.ivalues.IBceRuleReturnData;
import com.asiainfo.crm.cm.busimodel.rule.ivalues.ICmRuleReturnData;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountAttrValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICustMgntFSV;
import com.asiainfo.crm.so.exe.remote.third.ConfirmResultDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustInfoMoveRspDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustScoreAndGradeInfoDataBean;
@Deprecated
public class CustMgntClient {

	/**
	 * 跨区入网
	 * @param parameter (billId 计费号码)
	 * @return Map (level,vipCardCode ?,levelDate ?)
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-17
	 */
	public static Map accNetWork(Map parameter) throws Exception {
		return getCmFSV().accNetWork(parameter);
	}

	/**
	 * 检查是否能享受俱乐部服务（机场服务，火车站服务等等）
	 * @param parameter [BillId 手机号码，ServiceCode 服务编码,ServiceId 服务标识，Attendants 服务人数]
	 * @return [Result 结果，ReasonMsg 不能享受原因,TotalScore 总积分,AvailableTimes 可用免费次数]
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-21
	 */
	public static Map checkEnjoyService(Map parameter) throws Exception {
		return getCmFSV().checkEnjoyService(parameter);
	}

	/**
	 * 跨区入网确认，修改vip等级
	 * @param billId 计费号码
	 * @param inBean Cboss定义bean
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-26
	 */
	public static ConfirmResultDataBean confirmAccNetWork(CustInfoMoveRspDataBean inBean) throws Exception {
		return getCmFSV().confirmAccNetWork(inBean);
	}

	/**   
	 * 与业务受理侧开户等地方需要创建或者修改账户信息的功能点相关，为了使得功能比较易于扩展，暂定为使用Map传递参数，Map中存放页面上各个表单（表格）
	 *  中的数据（DataContainer），Map的key为表单（表格）的ID，后台根据约定进行解析，然后再封装到VO对象中，传递给后台Service处理。
	 * @Function convertMap2AccountValue
	 * @Description 
	 *
	 * @param map
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 上午11:24:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	public static IVOAccountValue convertMap2AccountValue(Map map) throws Exception {
		return getCmFSV().convertMap2AccountValue(map);
	}

	/**   
	 * 使用Map作为参数，方便功能的扩展，Map的key使用页面上的表单（表格）的ID，值为该表格（表单）的数据，使用DataContainer作为数据传递工具。
	 * @Function convertMap2CustValue
	 * @Description 
	 *
	 * @param map
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-30 上午11:26:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huzq2           v1.0.0               修改原因<br>
	 */
	public static IVOCustValue convertMap2CustValue(Map map) throws Exception {
		return getCmFSV().convertMap2CustValue(map);
	}

	/**
	 * 将手机俱乐部用户记录置失效。
	 * @param parameter (userId用户标识 ,clubCode俱乐部编码）
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-19
	 */
	public static long disableClubMember(Map parameter) throws Exception {
		return getCmFSV().disableClubMember(parameter);
	}

	/**
	 * 记录服务
	 * @param userId 用户编码
	 * @param serviceId 服务编码
	 * @param roamFlag 漫游标记
	 * @param provinceCode 服务享受所在省份
	 * @param remarks 备注
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-25
	 */
	public static boolean enjoyService(long userId, long serviceId, int times, int roamFlag, String provinceCode, String busiCode, String remarks) throws Exception {
		return getCmFSV().enjoyService(userId, serviceId, times, roamFlag, provinceCode, busiCode, remarks);
	}

	/**   
	 * @Function getCmFSV
	 * @Description 
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-1 下午3:16:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-1     huzq2           v1.0.0               修改原因<br>
	 */
	private static ICustMgntFSV getCmFSV() {
		return (ICustMgntFSV) ServiceFactory.getService(ICustMgntFSV.class);
	}

	/**   
	 * 根据帐户编号和属性编码查询账户扩展属性
	 * @Function queryAccountAttrValue
	 * @Description 
	 *
	 * @param acctId
	 * @param attrCode 属性编码
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-23 下午4:00:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmAccountAttrValue queryAccountAttrValue(long acctId, String attrCode) throws Exception {
		return getCmFSV().queryAccountAttrValue(acctId, attrCode);
	}

	/**   
	 * 根据账户编号查询账户信息
	 * @Function: queryAccountById 
	 * @Description: 根据账户编号查询账户信息
	 *
	 * @param acctId 账户编号
	 * @return 符合条件的账户信息。返回对象为简单的{@link IAccountValue 账户实体}
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhangyin
	 * @date: 2011-12-23 下午02:19:37 
	 *
	 * Modification History:
	 * Date               Author            Version            Description
	 * -------------------------------------------------------------------
	 * 2011-12-23        zhangyin            v1.0.0                 修改原因
	 */
	public static IAccountValue queryAccountById(long acctId) throws Exception {
		return getCmFSV().queryAccountById(acctId);
	}

	/**   
	 * 根据客户编号查询账户信息数量
	 * @Function: queryAccountCountByCustId 
	 * @Description: 根据客户编号查询账户信息数量<br>
	 * 
	 * @param custId 客户编号
	 * @return 符合条件的账户数量。
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhangyin
	 * @date: 2011-12-23 下午02:20:32 
	 *
	 * Modification History:
	 * Date               Author            Version            Description
	 * -------------------------------------------------------------------
	 * 2011-12-23        zhangyin            v1.0.0                 修改原因
	 */
	public static int queryAccountCountByCustId(long custId) throws Exception {
		return getCmFSV().queryAccountCountByCustId(custId);
	}

	/**   
	 * @Function queryAccountProfileByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-24 下午2:44:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-24     huzq2           v1.0.0               修改原因<br>
	 */
	public static IAccountProfileValue queryAccountProfileByAcctId(long acctId) throws Exception {
		return getCmFSV().queryAccountProfileByAcctId(acctId);
	}

	/**   
	 * 根据地市编码和支付方式查询账户信息
	 * @Function queryAccountProfileCountByRegionId
	 * @Description 
	 *
	 * @param regionId
	 * @param payMethod
	 * @param queryType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-15 下午12:59:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-15     huzq           v1.0.0               修改原因<br>
	 */
	public static int queryAccountProfileCountByRegionId(String regionId, int payMethod, int queryType) throws Exception {
		return getCmFSV().queryAccountProfileCountByRegionId(regionId, payMethod, queryType);
	}

	/**   
	 * 根据关联的客户编号查询关联的账户数量
	 * @Function queryAccountProfileCountByRelCustId
	 * @Description 
	 *
	 * @param relCustId 关联的客户编号【必须】
	 * @param payMethod 支付方式【非必须】，见定义{@link CmConstants.AccountPayMethod}
	 * @return 符合条件的账户综合信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 下午9:43:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
	 */
	public static int queryAccountProfileCountByRelCustId(long relCustId, int payMethod) throws Exception {
		return getCmFSV().queryAccountProfileCountByRelCustId(relCustId, payMethod);
	}

	/**   
	 * 根据地市编码和支付方式查询账户信息
	 * @Function queryAccountProfilesByRegionId
	 * @Description 
	 *
	 * @param regionId
	 * @param payMethod
	 * @param queryType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-15 下午12:52:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-15     huzq           v1.0.0               修改原因<br>
	 */
	public static IAccountProfileValue[] queryAccountProfilesByRegionId(String regionId, int payMethod, int queryType, int startNum, int endNum) throws Exception {
		return getCmFSV().queryAccountProfilesByRegionId(regionId, payMethod, queryType, startNum, endNum);
	}

	/**   
	 * 根据关联的客户编号查询关联的账户信息【包含账户基本信息、账户当前生效的支付方案、账户当前生效的账单定制信息】
	 * @Function queryAccountProfilesByRelCustId
	 * @Description 
	 *
	 * @param relCustId 关联的客户编号【必须】
	 * @param payMethod 支付方式【非必须】，见定义{@link CmConstants.AccountPayMethod}
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的账户综合信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 下午9:35:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
	 */
	public static IAccountProfileValue[] queryAccountProfilesByRelCustId(long relCustId, int payMethod, int startNum, int endNum) throws Exception {
		return getCmFSV().queryAccountProfilesByRelCustId(relCustId, payMethod, startNum, endNum);
	}

	/**   
	 * 根据客户编号查询账户信息
	 * @Function queryAccountsByCustId
	 * @Description 根据客户编号查询账户信息
	 *
	 * @param custId 客户编号。（必须）
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的账户列表。返回对象为{@link IAccountValue 账户实体}。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-27 上午9:46:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-27     huzq2           v1.0.0               修改原因
	 */
	public static IAccountValue[] queryAccountsByCustId(long custId, int startNum, int endNum) throws Exception {
		return getCmFSV().queryAccountsByCustId(custId, startNum, endNum);
	}

	/**
	 * 根据账户编号查询出该账户的账单定制化信息条数
	 * @param acctId  账户编号
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 12, 2012 7:37:58 PM
	 */
	public static int queryAcctBillCustomizeCountByAcctId(long acctId) throws Exception {
		return getCmFSV().queryAcctBillCustomizeCountByAcctId(acctId);
	}

	/**
	 * 根据账户编号查询出该账户的账单定制化信息
	 * @param acctId 账户编号
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 12, 2012 7:37:50 PM
	 */
	public static IAcctBillCustomizeValue[] queryAcctBillCustomizesByAcctId(long acctId, int startNum, int endNum) throws Exception {
		return getCmFSV().queryAcctBillCustomizesByAcctId(acctId, startNum, endNum);
	}

	/**   
	 * 根据账户编号查询账户的账期信息.<br>
	 * <strong>注意:</strong>
	 * <em>该服务是查询当前账户所有的账期信息，包含过期的账期信息，如果需要查询当前生效的账期信息请调用服务{@link #queryCurrAcctBillCycleByAcctId(long)}</em>
	 * @Function queryAcctBillCyclesByAcctId
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @return 账户账期信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-16 上午9:52:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static IAcctBillCycleValue[] queryAcctBillCyclesByAcctId(long acctId) throws Exception {
		return getCmFSV().queryAcctBillCyclesByAcctId(acctId);
	}

	/**   
	 * 根据账户编号查询账户联系人数量
	 * @Function queryAcctContactCountByAcctId
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @return 符合条件的账户联系人数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-16 上午9:48:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static int queryAcctContactCountByAcctId(long acctId) throws Exception {
		return getCmFSV().queryAcctContactCountByAcctId(acctId);
	}

	/**   
	 * 根据账户编号查询账户联系人信息
	 * @Function queryAcctContactsByAcctId
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的账户联系人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-16 上午9:48:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static IContactValue[] queryAcctContactsByAcctId(long acctId, int startNum, int endNum) throws Exception {
		return getCmFSV().queryAcctContactsByAcctId(acctId, startNum, endNum);
	}

	/**   
	 * 根据账户编号查询账户的支付方案数量
	 * @Function queryAcctPaymentCountByAcctId
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @return 符合条件的账户支付方案数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-16 上午9:51:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static int queryAcctPaymentCountByAcctId(long acctId) throws Exception {
		return getCmFSV().queryAcctPaymentCountByAcctId(acctId);
	}

	/**   
	 * 根据账户编号查询账户的支付方案信息
	 * @Function queryAcctPaymentsByAcctId
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的账户支付方案信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-16 上午9:51:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static IAcctPaymentValue[] queryAcctPaymentsByAcctId(long acctId, int startNum, int endNum) throws Exception {
		return getCmFSV().queryAcctPaymentsByAcctId(acctId, startNum, endNum);
	}

	/**
	 * 查询俱乐部会员
	 * @param parameter
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-24
	 */
	public static Map queryclubMember(Map parameter) throws Exception {
		return getCmFSV().queryclubMember(parameter);
	}

	/**   
	 * 根据帐户编号查询账户当前生效的账期信息
	 * @Function queryCurrAcctBillCycleByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-23 下午9:27:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
	 */
	public static IAcctBillCycleValue queryCurrAcctBillCycleByAcctId(long acctId) throws Exception {
		return getCmFSV().queryCurrAcctBillCycleByAcctId(acctId);
	}

	/**   
	 * @Function queryCustContactById
	 * @Description 
	 *
	 * @param custContId
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-16 下午3:26:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static IContactValue queryCustContactById(long custContId, long custId) throws Exception {
		return getCmFSV().queryCustContactById(custContId, custId);
	}

	/**   
	 * 根据客户编号查询客户的联系人数量
	 * @Function queryCustContactCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return 符合条件的客户联系人数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-16 上午9:45:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static int queryCustContactCountByCustId(long custId) throws Exception {
		return getCmFSV().queryCustContactCountByCustId(custId);
	}

	/**   
	 * 根据客户编号查询客户联系人
	 * 
	 * @Function queryCustContactsByCustId
	 * @Description 
	 *
	 * @param custId 客户编号
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的客户联系人
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-16 上午9:44:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static IContactValue[] queryCustContactsByCustId(long custId, int startNum, int endNum) throws Exception {
		return getCmFSV().queryCustContactsByCustId(custId, startNum, endNum);
	}

	/**   
	 * 根据条件查询客户经理数量<br>
	 * 
	 * @Function queryCustManagerCount
	 * @Description 
	 *
	 * @param custId 客户编号（可选。custId、custServiceId必选其一，custId优先）
	 * @param custServiceId  客户服务编号（可选。custId、custServiceId必选其一）
	 * @return 符合条件的客户经理信息 数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午1:01:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 * 2012-4-26     huzq2           v1.0.0               已将客户经理详细信息查询封装到其中<br>
	 */
	public static int queryCustManagerCount(long custId, String custServiceId) throws Exception {
		return getCmFSV().queryCustManagerCount(custId, custServiceId);
	}

	/**   
	 * 根据客户编号或者客户服务编号查询客户的客户经理信息<br>
	 * <em><strong>注：</strong>该服务已经通过调用权限管理的接口封装了客户经理详细信息的查询，在使用时不需要再单独查询。</em>
	 * @Function queryCustManagers
	 * @Description 根据客户编号或者客户服务编号查询客户的客户经理信息
	 *
	 * @param custId 客户编号（可选。custId、custServiceId必选其一，custId优先）
	 * @param custServiceId 客户服务编号（可选。custId、custServiceId必选其一）
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的客户经理信息 。返回对象为{@link ICustManagerValue 客户经理实体}。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 上午10:57:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICustManagerValue[] queryCustManagers(long custId, String custServiceId, int startNum, int endNum) throws Exception {
		return getCmFSV().queryCustManagers(custId, custServiceId, startNum, endNum);
	}

	/**   
	 * 根据全网客户编号查询客户信息<br>
	 * <strong>注:</strong>
	 * <em>目前仅支持集团客户</em>
	 * @Function queryCustomerByEcCode
	 * @Description 
	 *
	 * @param ecCode 全网客户编号
	 * @param custType 客户类型。由于客户服务编号本身没有包含客户类型信息，调用时需要指定需要查询的客户类型。具体的客户类型定义见{@link CmConstants.CustomerType}.
	 * @return 符合条件的客户信息，如果没有查询到返回null
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-19 下午1:54:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-19     huzq           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue queryCustomerByEcCode(String ecCode, int custType) throws Exception {
		return getCmFSV().queryCustomerByEcCode(ecCode, custType);
	}

	/**   
	 * 根据客户编号查询客户基本信息。
	 * @Function queryCustomerById
	 * @Description 根据客户编号查询客户基本信息。
	 *
	 * @param custId 客户编号
	 * @return 符合条件的客户基本信息。返回对象为{@link ICustomerValue 客户实体}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-31 上午10:24:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-31     Xiaohu           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue queryCustomerById(long custId) throws Exception {
		return getCmFSV().queryCustomerById(custId);
	}

	/**   
	 * 根据客户服务编号查询客户信息
	 * @Function queryCustomerByServiceId
	 * @Description 
	 *
	 * @param custServiceId 客户服务编号。[客户服务编号是指提供给客户便于记忆和快速服务的一个按特定规则生成的序列号，与客户编号一样客户服务编号是唯一的，一个编号只能对应一个客户。对于集团客户而言，客户服务编号就是集团编号]
	 * @param custType 客户类型，由于客户服务编号本身没有包含客户类型信息，调用时需要指定需要查询的客户类型。具体的客户类型定义见{@link CmConstants.CustomerType}.
	 * @return 符合条件的客户信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-28 上午9:23:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-28     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue queryCustomerByServiceId(String custServiceId, int custType) throws Exception {
		return getCmFSV().queryCustomerByServiceId(custServiceId, custType);
	}

	/**   
	 * 根据证件信息查询客户数量(区分客户类型)
	 * @Function queryCustomerCountByCert
	 * @Description 
	 *
	 * @param custType
	 * @param custCertType
	 * @param custCertCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-17 下午5:01:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-17     huzq2           v1.0.0               修改原因<br>
	 */
	public static int queryCustomerCountByCert(int custType, int custCertType, String custCertCode) throws Exception {
		return getCmFSV().queryCustomerCountByCert(custType, custCertType, custCertCode);
	}

	/**   
	 * 根据证件信息查询客户数量
	 * @Function queryCustomerCountByCert
	 * @Description 根据证件信息查询客户数量
	 *
	 * @param custCertType
	 * @param custCertCode
	 * @return 符合条件的客户数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午2:31:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public static int queryCustomerCountByCert(int custCertType, String custCertCode) throws Exception {
		return getCmFSV().queryCustomerCountByCert(custCertType, custCertCode);
	}

	/**   
	 * 根据客户编号查询客户历史信息.该接口主要用于查询客户的历史信息，查询需要提供起止日期，避免扫描所有的表，带来系统性能问题。
	 * @Function queryCustomerHisByCustId
	 * @Description 根据客户编号查询客户历史信息
	 *
	 * @param custId 客户编号
	 * @param startDate 开始日期
	 * @param endDate 截止日期
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的客户历史信息。返回对象为{@link ICustomerValue 客户实体}。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午3:04:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue[] queryCustomerHisByCustId(long custId, Timestamp startDate, Timestamp endDate, int startNum, int endNum) throws Exception {
		return getCmFSV().queryCustomerHisByCustId(custId, startDate, endDate, startNum, endNum);
	}

	/**   
	 * 根据客户编号查询客户历史信息数量。该接口主要用于查询客户的历史信息，查询需要提供起止日期，避免扫描所有的表，带来系统性能问题。
	 * @Function queryCustomerHisCountByCustId
	 * @Description 根据客户编号查询客户历史信息数量
	 *
	 * @param custId 客户编号
	 * @return 符合条件的客户历史信息数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午3:17:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public static int queryCustomerHisCountByCustId(long custId, Timestamp startDate, Timestamp endDate) throws Exception {
		return getCmFSV().queryCustomerHisCountByCustId(custId, startDate, endDate);
	}

	/**   
	 * 根据证件信息查询客户（区分客户类型）
	 * @Function queryCustomersByCert
	 * @Description 根据证件信息查询客户
	 *
	 * @param custCertType 证件类型 
	 * @param custCertCode 证件号码
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的客户信息列表。返回对象为{@link ICustomerValue 客户实体}。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-27 上午10:57:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-27     huzq2           v1.0.0               修改原因
	 */
	public static ICustomerValue[] queryCustomersByCert(int custType, int custCertType, String custCertCode, int startNum, int endNum) throws Exception {
		return getCmFSV().queryCustomersByCert(custType, custCertType, custCertCode, startNum, endNum);
	}

	/**   
	 * 根据客户证件信息查询客户信息（不区分客户类型）
	 * @Function queryCustomersByCert
	 * @Description 
	 *
	 * @param custCertType
	 * @param custCertCode
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-17 下午5:00:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-17     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue[] queryCustomersByCert(int custCertType, String custCertCode, int startNum, int endNum) throws Exception {
		return getCmFSV().queryCustomersByCert(custCertType, custCertCode, startNum, endNum);
	}

	/**   
	 * 根据证件信息查询客户（区分客户类型）
	 *  
	 * @Function queryCustomersByCert
	 * @Description 
	 *
	 * @param cols 查询结果集过滤条件。如果需要查询大数据量的结果集，必须要指定查询哪些字段，避免因查询结果集太多导致系统内存溢出！
	 * 		  <strong>注:</strong><em>如果只需要查询客户编号则可以为空！</em>
	 * @param parameterMap 参数结构如下：
	 * <pre>
	 * {
	 *    int    CUST_TYPE,       // 客户类型。定义见{@link CmConstants.CustomerType}
	 *    int    CUST_CERT_TYPE,  // 证件类型。定义见{@link CmConstants.CertificateType}
	 *    String CUST_CERT_CODE,  // 证件号码
	 *    long   BUSINESS_ID      // 证件号码
	 * }
	 * </pre>
	 * @param startNum 分页参数。
	 * @param endNum 分页参数
	 * @return 符合条件的客户信息列表
	 * @throws Exception 
	 * 		1、当查询结果集大于系统设置的上限(5000)时抛出异常；
	 * 		2、当发生其他异常时抛出异常。
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 下午2:17:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue[] queryCustomersByCert(String[] cols, Map parameterMap, int startNum, int endNum) throws Exception {
		return getCmFSV().queryCustomersByCert(cols, parameterMap, startNum, endNum);
	}

	/**   
	 * 根据客户ID批量查询客户信息的接口
	 * @Function queryCustomersByCustIds
	 * @Description 
	 *
	 * @param custIds 客户编号【必须】
	 * @param custType 客户类型【必须：系统目前只支持同一个批次里面只能查询一种类型的客户】，详见{@link CmConstants.CustomerType}
	 * @return 符合条件的客户信息列表
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-24 下午3:44:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue[] queryCustomersByCustIds(long[] custIds, int custType) throws Exception {
		return getCmFSV().queryCustomersByCustIds(custIds, custType);
	}

	/**   
	 * 根据客户名称查询客户信息
	 * @Function queryCustomersByName
	 * @Description 
	 *
	 * @param custType 客户类型【必须】
	 * @param custName 客户名称【必须】
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午3:51:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue[] queryCustomersByName(int custType, String custName, int startNum, int endNum) throws Exception {
		return getCmFSV().queryCustomersByName(custType, custName, startNum, endNum);
	}

	/**   
	 * 根据客户名称查询客户信息<br>
	 * 
	 * @Function queryCustomersByName
	 * @Description 
	 *
	 * @param cols 查询结果集过滤条件。如果需要查询大数据量的结果集，必须要指定查询哪些字段，避免因查询结果集太多导致系统内存溢出！
	 * 		  <strong>注:</strong><em>如果只需要查询客户编号则可以为空！</em>
	 * @param custType 客户类型
	 * @param custName 客户名称
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的客户列表
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 下午2:59:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue[] queryCustomersByName(String[] cols, int custType, String custName, int startNum, int endNum) throws Exception {
		return getCmFSV().queryCustomersByName(cols, custType, custName, startNum, endNum);
	}

	/**   
	 * 根据账户编号判断是否为集团账户，并返回集团账户信息，取得集团客户编号getAsLong("CUST_ID");
	 * @Function queryGroupAccount
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-12 下午8:31:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-12     huzq2           v1.0.0               修改原因<br>
	 */
	public static DataContainer queryGroupAccount(long acctId) throws Exception {
		return getCmFSV().queryGroupAccount(acctId);
	}

	/**
	 * 
	 * @Function queryWebLinkMan
	 * @Description 集团网营联系人信息查询
	 *
	 * @param custId
	 * @param contType
	 * @param starNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-4 下午7:11:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4      huaiduo           v1.0.0               修改原因<br>
	 */
	public static IContactValue[] queryGroupContact(long custId, int contType, int starNum, int endNum) throws Exception {
		return getCmFSV().queryGroupContact(custId, contType, starNum, endNum);
	}

	/**
	 * 
	 * @Function queryWebLinkManCount
	 * @Description 集团网营联系人数量查询
	 *
	 * @param custId
	 * @param contType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-4 下午7:12:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4      huaiduo           v1.0.0               修改原因<br>
	 */
	public static int queryGroupContactCount(long custId, int contType) throws Exception {
		return getCmFSV().queryGroupContactCount(custId, contType);
	}

	/**   
	 * 根据（集团）客户编号和属性名称获取集团客户的属性信息
	 * @Function queryGroupCustAttrValue
	 * @Description 
	 *
	 * @param custId
	 * @param attrCode 具体的定义见:
	 * <pre>
	 * SELECT A.ATTR_CODE,
	 *       A.TITLE,
	 *       A.ATTR_DESC,
	 *       A.EDIT_TYPE,
	 *       A.DATA_TYPE,
	 *       A.LENGTH,
	 *       A.DECIMAL_NUM,
	 *       A.DEFAULT_VALUE,
	 *       A.COL_SPAN,
	 *       A.REMARKS,
	 *       A.IS_MUST,
	 *       A.URL,
	 *       A.IDX,
	 *       A.STATE,
	 *       B.TABLE_NAME
	 *  FROM CM_CFG_ATTR_DEFINE A, CM_CFG_TABLE_ATTR B
	 * WHERE A.ATTR_CODE = B.ATTR_CODE
	 *   and b.table_name='CM_GROUP_CUST_ATTR'
	 * </pre>
	 * @return 符合条件的集团客户属性信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-24 下午4:51:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmGroupCustAttrValue queryGroupCustAttrValue(long custId, String attrCode) throws Exception {
		return getCmFSV().queryGroupCustAttrValue(custId, attrCode);
	}

	/**   
	 * 根据登录员工信息查询该员工担任客户经理下的集团信息数量
	 * @Function queryManagedCustomerCount
	 * @Description 
	 *
	 * @param managerId 客户经理编号（对应于员工编号）【必须】
	 * @param custType 客户类型：详见{@link CmConstants.CustomerType}【必须】
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-24 下午5:28:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huzq2           v1.0.0               修改原因<br>
	 */
	public static int queryManagedCustomerCount(long managerId, int custType) throws Exception {
		return getCmFSV().queryManagedCustomerCount(managerId, custType);
	}

	/**   
	 * 根据登录员工信息查询该员工担任客户经理下的集团信息
	 * @Function queryManagedCustomers
	 * @Description 
	 *
	 * @param managerId 客户经理编号（对应于员工编号）【必须】
	 * @param custType 客户类型：详见{@link CmConstants.CustomerType}【必须】
	 * @param startNum
	 * @param endNum
	 * @return 当前客户经理管辖的集团客户信息（分页）
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-24 下午3:32:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-24     huzq2           v1.0.0               修改原因<br>
	 */
	public static ICustomerValue[] queryManagedCustomers(long managerId, int custType, int startNum, int endNum) throws Exception {
		return getCmFSV().queryManagedCustomers(managerId, custType, startNum, endNum);
	}

	/**   
	 * 根据操作员编号查询客户经理信息
	 * @Function queryManagerByOperId
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-31 下午4:49:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     huzq2           v1.0.0               修改原因<br>
	 */
	public static DataContainer queryManagerByOperId(long operId) throws Exception {
		return getCmFSV().queryManagerByOperId(operId);
	}

	/**
	 * 根据计费号或者用户编号获取对应客户的VIP等级
	 * @param UserId
	 * @param BillId
	 * @return
	 * @throws Exception
	 * @Function: queryMemberLevelByUserIdOrBillId
	 * @author: Liaosc
	 * @date: 2012-4-13 下午2:52:55 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-13       Liaosc        v1.0.0               修改原因
	 */
	public static Map queryMemberLevelByUserIdOrBillId(long userId, String billId) throws Exception {
		return getCmFSV().queryMemberLevelByUserIdOrBillId(userId, billId);
	}

	/**   
	 * 查询特殊名单信息数量
	 * @Function querySpecialListCount
	 * @Description 
	 *
	 * @param custId 客户编号
	 * @param userId 用户编号
	 * @param certType 证件类型
	 * @param certCode 证件号码
	 * @param monType 监控类型。如：黑名单、白名单等。
	 * @param subMonType 监控子类型
	 * @return 符合条件的特殊名单信息记录数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午1:05:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public static int querySpecialListCount(long custId, long userId, int certType, String certCode, int monType, int subMonType) throws Exception {
		return getCmFSV().querySpecialListCount(custId, userId, certType, certCode, monType, subMonType);
	}

	/**   
	 * 查询特殊名单信息<br>
	 * 查询条件一：客户编号+监控类型+监控子类型<br>
	 * 查询条件二：用户编号+监控类型+监控子类型<br>
	 * 查询条件三：证件类型+证件号码+监控类型+监控子类型<br>
	 * 三组查询条件，必须要至少要选择一组
	 * @Function querySpecialLists
	 * @Description 
	 * @param custId 客户编号
	 * @param userId 用户编号
	 * @param certType 证件类型
	 * @param certCode 证件号码
	 * @param monType 监控类型。如：黑名单、白名单等。
	 * @param subMonType 监控子类型
	 * 具体监控类型和子类型：party.CM_CFG_SPEC_LIST_TYPE
	 * 监控类型	监控子类型	监控名称
	 * 	  1		 11	 	     证件黑名单				
	 *    2		 21	 	满意度调查灰名单	
	 *    3		 31			 黑名单						
	 *	  3		 32			 白名单		
	 *    4	 	 41			 灰名单						
	 *    5	 	 51	 		 黑名单						
	 *    6		 61		 高频次投诉客户					
	 * 	  7	 	 71	 	     黄名单用户				
	 *	  7		 72		     蓝名单用户				
	 * @return 符合条件的特殊名单信息。返回对象为{@link ISpecialListValue 特殊名单实体信息}。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午3:54:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public static ISpecialListValue[] querySpecialLists(long custId, long userId, int certType, String certCode, int monType, int subMonType, int startNum, int endNum)
			throws Exception {
		return getCmFSV().querySpecialLists(custId, userId, certType, certCode, monType, subMonType, startNum, endNum);
	}

	/**   
	 * 保存账户资料，包括账户信息（账户基本信息、账户支付方案）和账户联系人信息。<br>
	 *  参数为客户管理中定义的{@link IVOAccountValue 账户大对象}，这样便于以后的业务的扩展，比如：账户的支付方案由一个账户一种支付方案变化为一个账户多种支付方案的变化等。<br>
	* @Function:  saveAccount
	*
	* @param accountValue 账户对象。详细的数据结构请参见{@link IVOAccountValue 账户大对象}的定义
	* @return 保存后的账户的账户编号
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-23 上午10:14:31 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-23        zhangyin            v1.0.0                 修改原因
	* 2011-12-30        huzq2               v1.0.0      修改名称为saveAccount，不管是创建账户或者是修改账户，其实本质都是根据对象的状态和主键来标识它的状态。
	* 2011-12-31        huzq2               v1.0.0      参数改为客户管理中定义的账户大对象，这样便于以后的业务的扩展，比如：账户的支付方案由一个账户一种支付方案变化为一个账户多种支付方案的变化等。
	*/
	public static long saveAccount(IVOAccountValue accountValue) throws Exception {
		return getCmFSV().saveAccount(accountValue);
	}

	/**   
	 * 保存账户信息。与业务受理侧开户等地方需要创建或者修改账户信息的功能点相关，为了使得功能比较易于扩展，暂定为使用Map传递参数，Map中存放页面上各个表单（表格）
	 *  中的数据（DataContainer），Map的key为表单（表格）的ID，后台根据约定进行解析，然后再封装到VO对象中，传递给后台Service处理。
	 * @Function saveAccount
	 * @Description 保存账户信息。与业务受理侧开户等地方需要创建或者修改账户信息的功能点相关，为了使得功能比较易于扩展，暂定为使用Map传递参数，Map中存放页面上各个表单（表格）
	 *  中的数据（DataContainer），Map的key为表单（表格）的ID，后台根据约定进行解析，然后再封装到VO对象中，传递给后台Service处理。
	 *
	 * @param acctInfoMap 账户信息Map
	 * @return 保存的账户编号
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-1-5 下午9:49:12
	 * @deprecated 该服务废弃，因业务受理侧需要使用当前业务对象上发Billing，需要通过服务{@link #convertMap2AccountValue(Map)} 转换Map为{@link IVOAccountValue}
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-5     Xiaohu           v1.0.0               修改原因<br>
	 */
	public static long saveAccount(Map acctInfoMap) throws Exception {
		return getCmFSV().saveAccount(acctInfoMap);
	}

	/**   
	 * 保存俱乐部会员信息
	 * @Function saveClubMember
	 * @Description 保存俱乐部会员信息
	 *
	 * @param memberValue 会员实体信息
	 * @return 保存后的俱乐部会员编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午4:05:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public static long saveClubMember(IClubMemberValue memberValue) throws Exception {
		return getCmFSV().saveClubMember(memberValue);
	}

	/**   
	 * 记录客户管理业务日志
	 * @Function saveCmBusiLog
	 * @Description 
	 *
	 * @param busiLogValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-12 下午8:13:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12     huzq           v1.0.0               修改原因<br>
	 */
	public static void saveCmBusiLog(ICmBusiLogValue busiLogValue) throws Exception {
		getCmFSV().saveCmBusiLog(busiLogValue);
	}

	/**   
	 * 直接保存客户信息
	 * @Function saveCustomer
	 * @Description 保存客户信息
	 *
	 * @param customerValue 客户实体信息
	 * @return 保存后的客户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午3:59:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	public static long saveCustomer(ICustomerValue customerValue) throws Exception {
		return getCmFSV().saveCustomer(customerValue);
	}

	/**   
	 * 保存客户资料。包括客户基本信息、客户联系人信息等。<br>
	 * 
	 * @Function saveCustomer
	 *
	 * @param custValue 具体的数据结构定义参见{@link IVOCustValue 客户对象}
	 * @return 返回新建的客户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-27 上午10:59:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-27     huzq2           v1.0.0               修改原因
	 * 2011-12-31     huzq2           v1.0.0               将参数改为客户管理的客户大对象，有利于支持灵活多变的业务环境。
	 */
	public static long saveCustomer(IVOCustValue custValue) throws Exception {
		return getCmFSV().saveCustomer(custValue);
	}

	/**   
	 * 保存客户信息。使用Map作为参数，方便功能的扩展，Map的key使用页面上的表单（表格）的ID，值为该表格（表单）的数据，使用DataContainer作为数据传递工具。
	 * @Function saveCustomer
	 * @Description 保存客户信息。使用Map作为参数，方便功能的扩展，Map的key使用页面上的表单（表格）的ID，值为该表格（表单）的数据，使用DataContainer作为数据传递工具。
	 *
	 * @param custInfoMap 客户信息构成的Map。
	 * @return 保存后的客户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-1-5 下午9:53:50
	 * @deprecated 该服务废弃，因业务受理侧需要使用当前业务对象上发Billing，需要通过服务{@link #convertMap2CustValue(Map)} 转换Map为{@link IVOCustValue}
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-5     Xiaohu           v1.0.0               修改原因<br>
	 */
	public static long saveCustomer(Map custInfoMap) throws Exception {
		return getCmFSV().saveCustomer(custInfoMap);
	}

	/**   
	 * 保存集团客户扩展属性
	 * @Function saveGroupCustAttrValues
	 * @Description 
	 *
	 * @param groupCustAttrValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-4 下午2:42:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-4     huzq2           v1.0.0               修改原因<br>
	 */
	public static void saveGroupCustAttrValues(IBOCmGroupCustAttrValue[] groupCustAttrValues) throws Exception {
		getCmFSV().saveGroupCustAttrValues(groupCustAttrValues);
	}

	/**
	 * 跨区入网业务，客户积分和等级转入受理省。oprCode=0积分和等级转入；oprCode=1冲正。
	 * @param custData{newBillId 转入手机号码，oldBillId 归属地手机号码，allConScore 总消费积分，
	 * joinDate 入网时间，level 客户级别，levelDate 客户级别有效期，oprCode 操作类型，
	 * procId 交易流水号，effectDate 被冲正交易日期，reqMsgBean 枢纽主要信息，scores 年积分信息}
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-5
	 */
	public static Map transferCustScoreAndGrade(CustScoreAndGradeInfoDataBean custData) throws Exception {
		return getCmFSV().transferCustScoreAndGrade(custData);
	}

	/**
	 * 根据传入的帐号id，更新某个账户免催免停的标志位为免催免停
	 * 枚举值：
	 * 1	免催级别:免催缴
	 * 3	免催级别:免全部欠费处理
	 *	2	免催级别:免停机
	 *	0	账户要催欠
	 * @param acctId 账户编号
	 * @param isUrge 免催免停标识
	 * @param userMap 用户自定义的参数
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 23, 2012 5:38:44 PM
	 */
	public static boolean updateAccountUrgeStopFlag(long acctId, int isUrge, HashMap userMap) throws Exception {
		return getCmFSV().updateAccountUrgeStopFlag(acctId, isUrge, userMap);
	}

	/**   
	 * <strong>用户状态变更通知</strong><br>
	 * 个人用户的状态变更时需要通知客户管理，客户管理需要根据当前用户状态变更客户管理域中与该用户相关的信息，该接口供营业用户状态变更时调用。<br>
	 * 如：<br>
	 *    1、个人离网，集团客户成员和大客户相关的用户状态需要变更为离网状态；<br>
	 *    2、个人销户，集团客户成员和大客户的数据需要清理；<br>
	 * @Function: userStatusChangeNotice
	 * @Description: 用户状态变更通知
	 *
	 * @param userId 用户编号
	 * @param custId 用户归属客户编号
	 * @param userState 用户状态,定义见{@link CmConstants.UserState}
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Apr 16, 2011 1:19:04 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 16, 2011     huzq2           v1.0.0               修改原因
	 */
	public static void userStateChangeNotice(long userId, long custId, String userState) throws Exception {
		getCmFSV().userStateChangeNotice(userId, custId, userState);
	}

	/**   
	 * @Function: varifyCertification
	 * @Description: 验证证件合法性。<br>
	 *  
	 *
	 * @param certType 证件类型，必选。<br>
	 * 证件类型具体的定义见{@link CmConstants.CertificateType}
	 * @param certCode 证件号码，必选。
	 * @return 规则验证返回数据类。参考{@link IBceRuleReturnData}<br>
	 * 	如果验证合法，则ResultCode=1（{@link CmConstants.BusiRuleResultCode#CODE_YES}）<br>
	 *  否则ResultCode=3（{@link CmConstants.BusiRuleResultCode#CODE_NO}）
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-10 下午02:41:16
	 *
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 *---------------------------------------------------------*<br>
	 * 2012-5-10     zhangyin           v1.0.0               新增服务。目前只能支持验证身份证的合法性，其他证件暂未提供验证规则。<br>
	 */
	public static ICmRuleReturnData varifyCertificate(int certType, String certCode) throws Exception {
		return getCmFSV().varifyCertificate(certType, certCode);
	}
}
