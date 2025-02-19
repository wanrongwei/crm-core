package com.asiainfo.crm.cm.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberCardBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberTempBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberTempValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElementValue;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.ln.club.service.interfaces.ICmLnClubMemberSV;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceCylceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingDetailValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingValue;
import com.asiainfo.crm.cm.model.ivalues.ICmReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceValue;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 俱乐部服务相关服务
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-13 下午4:52:19
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-13     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmClubServiceSV {

	/**   
	 * @Function queryAvailableServiceTimes
	 * @Description 查询俱乐部会员可用服务次数。会员可用服务次数
	 *
	 * @param clubMemberId 俱乐部会员编号
	 * @param serviceId 俱乐部服务编号
	 * @return 当前周期内该会员可以使用的此类服务次数
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午3:06:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryAvailableServiceTimes(long clubMemberId, long serviceId) throws Exception;
	
	/**
	 * 查询俱乐部会员总的服务次数。
	 * @param clubMemberId
	 * @param serviceId
	 * 	 
	 * @version v1.0.0
	 * @author liaosc
	 * @return
	 * @throws Exception
	 */
	public int queryTotalServiceTimes(long clubMemberId, long serviceId )throws Exception;

	/**
	 * 享受服务鉴权
	 * @param userId
	 * @param clubMemberId
	 * @param serviceId
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-24
	 */
	public boolean checkEnjoyService(long userId, long clubMemberId, long serviceId, int times, ICmReturnData returnData) throws Exception;

	/**   
	 * @Function enjoyService
	 * @Description 享受俱乐部会员服务。该方法只能享受该会员当前周期可用的服务，如果该会员当前周期内没有可用的服务，则不允许享受服务。
	 *
	 * @param clubMemberId 俱乐部会员编号
	 * @param serviceId 服务编号
	 * @param roamFlag 是否异地服务
	 * @param provinceCode 所在服务地省份代码
	 * @param remarks 备注信息
	 * @param serviceType 服务类型 1 火车站 2 机场
	 * @param memberLevel VIP级别
	 * @return 处理结果。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午4:06:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	public ICmReturnData enjoyService(long userId, long clubMemberId, long serviceId, int times, int roamFlag, String provinceCode, String busiCode, String remarks,int serviceType,int memberLevel)
			throws Exception;
	
	
	/**   
	 * @Function enjoyService
	 * @Description 享受俱乐部会员服务。该方法只能享受该会员当前周期可用的服务，如果该会员当前周期内没有可用的服务，则不允许享受服务。
	 *
	 * @param clubMemberId 俱乐部会员编号
	 * @param serviceId 服务编号
	 * @param roamFlag 是否异地服务
	 * @param provinceCode 所在服务地省份代码
	 * @param remarks 备注信息
	 * @param serviceType 服务类型 1 火车站 2 机场
	 * @param memberLevel VIP级别
	 * @return 处理结果。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-15 下午4:06:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-15     huzq2           v1.0.0               修改原因<br>
	 */
	public ICmReturnData enjoyService4LnVip(long userId, long clubMemberId, long serviceId, int times, int roamFlag, String provinceCode, String busiCode, String remarks,int serviceType,int memberLevel,int enjoyType)
			throws Exception;

	/**   
	 * @Function queryClubServiceById
	 * @Description 根据服务编号查询俱乐部服务信息
	 *
	 * @param serviceId 俱乐部服务编号
	 * @return 符合条件的俱乐部服务信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-21 下午4:50:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-21     huzq2           v1.0.0               修改原因<br>
	 */
	public IClubServiceValue queryClubServiceById(long serviceId) throws Exception;

	/**
	 * 通过俱乐部编码查询俱乐部服务信息
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @Function: queryClubServices
	 * @author: LSC
	 * @date: 2012-4-7 下午5:01:30 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-7       LSC         v1.0.0               修改原因
	 */
	public IClubServiceValue[] queryClubServicesByClubId(long clubId, int startNum, int endNum) throws Exception;

	/**   
	 * 根据俱乐部编号查询俱乐部服务信息
	 * @Function queryClubServiceCountByClubId
	 * @Description 
	 *
	 * @param clubId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-15 上午12:12:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-15     huzq           v1.0.0               修改原因<br>
	 */
	public int queryClubServiceCountByClubId(long clubId) throws Exception;

	/**   
	 * @Function saveClubService
	 * @Description 保存俱乐部服务信息
	 *
	 * @param clubServiceValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-22 下午3:40:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-22     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveClubService(IClubServiceValue[] clubServiceValues) throws Exception;

	/**
	 * 保存俱乐部服务信息
	 * @param voClubServiceValues
	 * @throws Exception
	 * @Function: saveClubService
	 * @author: LSC
	 * @date: 2012-4-9 下午5:21:37 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-9       LSC         v1.0.0               修改原因
	 */
	public void saveClubService(IVOClubServiceValue voClubServiceValue) throws Exception;

	/**
	 * 查询俱乐部服务记录信息
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @Function: queryClubServiceRecs
	 * @author: LSC
	 * @date: 2012-4-9 下午12:57:00 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-9       LSC         v1.0.0               修改原因
	 */
	public IClubServiceRecValue[] queryClubServiceRecs(DataContainer condition, int startNum, int endNum) throws Exception;

	/**
	 * 查询俱乐部服务记录信息条数
	 * @param condition
	 * @return
	 * @throws Exception
	 * @Function: queryClubServiceRecsCount
	 * @author: LSC
	 * @date: 2012-4-9 下午12:57:00 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-9       LSC         v1.0.0               修改原因
	 */
	public int queryClubServiceRecsCount(DataContainer condition) throws Exception;

	/**
	 * 查询有效俱乐部服务信息
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return IClubServiceValue[]
	 * @throws Exception
	 * @author: liaosc
	 * @date: 2012-5-11 下午2:12:21
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-5-11       liaosc         v1.0.0               修改原因
	 */
	public IClubServiceValue[] queryClubServices(DataContainer condition, int startNum, int endNum) throws Exception;

	/**
	 * 查询会员享受多个服务的服务记录
	 * @param memberId
	 * @param serviceId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 1, 2012 4:39:44 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 1, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public IClubServiceRecValue[] queryClubServiceRecInDcs(long memberId, long[] serviceId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceCount
	 * @Description 根据条件查询俱乐部服务数量
	 *
	 * @param criteria
	 * @return 符合条件的俱乐部服务数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 9, 2012 5:00:10 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 9, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryClubServiceCount(String criteria) throws Exception;

	/**
	 * 
	 * @Function queryClubService
	 * @Description 根据条件查询俱乐部服务
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的俱乐部服务
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 9, 2012 5:01:20 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 9, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceValue[] queryClubService(String criteria, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceCylces
	 * @Description 查询俱乐部服务周期
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 11, 2012 1:56:57 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceCylceValue[] queryClubServiceCylces(String criteria, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceCylcesCount
	 * @Description 查询俱乐部服务周期次数
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 11, 2012 1:57:10 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryClubServiceCylcesCount(String criteria) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceCylcesByServiceId
	 * @Description 通过服务编号查询周期
	 *
	 * @param serviceId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 11, 2012 2:07:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceCylceValue[] queryClubServiceCylcesByServiceId(long serviceId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceCylcesCountByServiceId
	 * @Description 通过服务编号查询周期数量
	 *
	 * @param serviceId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 11, 2012 2:08:07 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryClubServiceCylcesCountByServiceId(long serviceId) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceCyclesById
	 * @Description 通过主键查询服务周期
	 *
	 * @param cycleId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 11, 2012 2:37:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceCylceValue queryClubServiceCycleById(long cycleId) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceVdoingsByServiceId
	 * @Description 查询服务维度
	 *
	 * @param serviceId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 11, 2012 3:09:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceVdoingValue[] queryClubServiceVdoingsByServiceId(long serviceId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceVdoingsCountByServiceId
	 * @Description 查询服务维度数量
	 *
	 * @param serviceId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 11, 2012 3:09:35 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryClubServiceVdoingsCountByServiceId(long serviceId) throws Exception;

	/**
	 * 
	 * @Function querClubServiceVdoingById
	 * @Description 查询服务维度
	 *
	 * @param dimensionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 11, 2012 3:09:45 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 11, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceVdoingValue querClubServiceVdoingById(long dimensionId) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceVdoingDetailValuesByDimensionId
	 * @Description 查询服务记录维度明细
	 *
	 * @param dimensionId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 3:04:50 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceVdoingDetailValue[] queryClubServiceVdoingDetailValuesByDimensionId(long dimensionId, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceVdoingDetailValuesCountByDimensionId
	 * @Description 查询服务记录维度明细数量
	 *
	 * @param dimensionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 3:05:02 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryClubServiceVdoingDetailValuesCountByDimensionId(long dimensionId) throws Exception;

	/**
	 * 
	 * @Function queryClubServiceVdoingDetailValueById
	 * @Description 查询服务记录维度明细
	 *
	 * @param detailId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 12, 2012 3:05:10 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 12, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IClubServiceVdoingDetailValue queryClubServiceVdoingDetailValueById(long detailId) throws Exception;
	
	/**   
	 * @Function queryCmVipElements
	 * @Description 
	 *
	 * @param billId	手机号码，用户编号2者必填其一
	 * @param userId
	 * @param elementType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 18, 2012 5:28:50 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 18, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmVipElementValue[] queryCmVipElements(String billId,long userId,int elementType)throws Exception;
	
	/**   
	 * @Function queryOtherVipElements
	 * @Description 查询除关键人以外的所有的因子
	 *
	 * @param billId
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 18, 2012 7:47:18 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 18, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmVipElementValue[] queryOtherVipElements(String billId,long userId)throws Exception;
	/**   
	 * @Function saveVipElement
	 * @Description 保存VIP因子
	 *
	 * @param billId
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 18, 2012 7:47:18 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 18, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveVipElement(IBOCmVipElementValue[] cmVipElement)throws Exception;
	/**   
	 * @Function delVipInfo
	 * @Description 根据userId删除VIP信息
	 *
	 * @param userId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 20, 2012 4:02:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 20, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void delVipInfo(long userId)throws Exception;
	
	/**   
	 * @Function vipUserFreeService
	 * @Description 返回享受一次免费服务后剩余次数
	 *
	 * @param paraMap
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 26, 2012 10:56:49 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 26, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map vipUserFreeService(Map paraMap)throws Exception;
	
	/**   
	 * @Function dealVipLevelTask
	 * @Description 批量更新VIP级别
	 *
	 * @param paraMap
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zouty
	 * @date Oct 26, 2012 10:56:49 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 26, 2012     zouty           v1.0.0               修改原因<br>
	 */
	public Boolean dealVipLevelTask(String billId,IBOCmClubMemberTempValue tempValues,ICmCommonSV sv,ICmTeamInvokeSV cmTeamSv,ICmClubMemberSV clubMemberSV,ICmCustomerSV customerSV,ICmCommonInnerSV innerSv,ICmClubServiceSV clubSv,ICmLnClubMemberSV lnClubMemberSv,List<BOCmClubMemberBean> memberList,List<BOCmClubMemberCardBean> memberCardList,List<BOCmClubMemberTempBean> tempList)throws Exception;
	
	/**   
	 * @Function getVipCardCode
	 * @Description 获取VIP卡号
	 *
	 * @param String regionid,int vipLevel
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zouty
	 * @date Oct 26, 2012 10:56:49 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 26, 2012     zouty           v1.0.0               修改原因<br>
	 */
	public String getVipCardCode(String regionid,int vipLevel)throws Exception;
}
