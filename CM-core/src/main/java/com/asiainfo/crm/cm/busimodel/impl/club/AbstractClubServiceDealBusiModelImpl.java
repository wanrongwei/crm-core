package com.asiainfo.crm.cm.busimodel.impl.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmClubServiceTimeCycleFactory;
import com.asiainfo.crm.cm.common.CmClubServiceTimesFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCommonDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmVipScoreRuleValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceAdjustBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceCylceBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceRecBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceVdoingBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceVdoingDetailBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceAdjustValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceCylceValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceRecValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceVdoingDetailValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceVdoingValue;
import com.asiainfo.crm.cm.inner.club.ivalues.IQBOCmClubServiceVdoingDetailValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.bean.CmReturnDataBean;
import com.asiainfo.crm.cm.model.bo.ClubServiceVdoingBean;
import com.asiainfo.crm.cm.model.bo.ClubServiceVdoingDetailBean;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceCylceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingDetailValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.ICmReturnData;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceDimensionValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-13 下午11:13:45
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
 */
public abstract class AbstractClubServiceDealBusiModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOClubServiceValue serviceValue = (IVOClubServiceValue) valueObject;
		// 数据检查
		validate(serviceValue);
		// 如果容器中有俱乐部服务信息，则保存俱乐部服务信息
		if (serviceValue.getClubService() != null) {
			saveClubService(new IClubServiceValue[] { serviceValue.getClubService() });
		}
		// 如果有服务周期信息，则保存服务周期信息
		if (serviceValue.hasClubServiceCycle()) {
			saveClubServiceCycle(serviceValue.getClubServiceCylces());
		}
		// 如果有服务记录信息，则保存服务记录信息
		if (serviceValue.hasClubServiceRec()) {
			saveClubServiceRecord(serviceValue.getClubServiceRecs());
		}
		// 如果有服务纬度定义信息，则保存纬度信息
		if (serviceValue.hasClubServiceDimension()) {
			saveClubServiceDimension(serviceValue.getClubServiceDimensions());
		}
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		return returnData;
	}

	/**   
	 * @Function validate
	 * @Description 检查传入的对象是否符合业务要求。该接口需要根据实际业务需求本地化实现。
	 *
	 * @param serviceValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-13 下午11:47:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract void validate(IVOClubServiceValue serviceValue) throws Exception;

	/**   
	 * @Function saveClubServiceDimension
	 * @Description 保存服务维度定义信息
	 *
	 * @param clubServiceDimensions
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-3-13 下午11:26:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	protected void saveClubServiceDimension(IVOClubServiceDimensionValue[] clubServiceDimensions) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(clubServiceDimensions)) {
			List vdoingList = new ArrayList();
			List vdoingDetailList = new ArrayList();
			for (int i = 0; i < clubServiceDimensions.length; i++) {
				IClubServiceVdoingValue value = clubServiceDimensions[i].getClubServiceVdoing();
				if (value != null) {
					if (value.isNew()) {
						value.setDimensionId(CmCommonUtil.getNewSequence(BOCmClubServiceVdoingBean.class));
						value.setState(CmConstants.RecordState.USE);
					}
					vdoingList.add(value);
				}
				if (clubServiceDimensions[i].hasVdoingDetail()) {
					IClubServiceVdoingDetailValue[] detailValues = clubServiceDimensions[i].getClubServiceVdoingDetails();
					for (int j = 0; j < detailValues.length; j++) {
						if (detailValues[j].isNew()) {
							detailValues[j].setDetailId(CmCommonUtil.getNewSequence(BOCmClubServiceVdoingDetailBean.class));
							detailValues[j].setState(CmConstants.RecordState.USE);
						}
						vdoingDetailList.add(detailValues[j]);
					}
				}
			}
			// 保存服务维度定义
			saveClubServiceVdoings((ClubServiceVdoingBean[]) vdoingList.toArray(new ClubServiceVdoingBean[0]));
			// 保存服务纬度定义明细
			saveClubServiceVdoingDetails((ClubServiceVdoingDetailBean[]) vdoingDetailList.toArray(new ClubServiceVdoingDetailBean[0]));
		}

	}

	/**   
	 * @Function saveClubServiceVdoingDetails
	 * @Description 保存服务维度明细定义信息。可以被重写。
	 *
	 * @param detailBeans
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-3-13 下午11:41:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	protected void saveClubServiceVdoingDetails(ClubServiceVdoingDetailBean[] detailBeans) throws Exception {
		BOCmClubServiceVdoingDetailBean[] values = new BOCmClubServiceVdoingDetailBean[detailBeans.length];
		for (int i = 0; i < values.length; i++) {
			if (detailBeans[i].isNew()) {
				// 设置主键
				detailBeans[i].setDetailId(CmCommonUtil.getNewSequence(BOCmClubServiceVdoingDetailBean.class));
			}
			values[i] = new BOCmClubServiceVdoingDetailBean();
			values[i].copy(detailBeans[i]);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(values);

	}

	/**   
	 * @Function saveClubServiceVdoings
	 * @Description 保存俱乐部服务维度定义信息。可以被重写。
	 *
	 * @param vdoingBeans
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-3-13 下午11:42:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	protected void saveClubServiceVdoings(ClubServiceVdoingBean[] vdoingBeans) throws Exception {
		BOCmClubServiceVdoingBean[] values = new BOCmClubServiceVdoingBean[vdoingBeans.length];
		for (int i = 0; i < values.length; i++) {
			if (vdoingBeans[i].isNew()) {
				// 设置主键
				vdoingBeans[i].setDimensionId(CmCommonUtil.getNewSequence(BOCmClubServiceVdoingBean.class));
			}
			values[i] = new BOCmClubServiceVdoingBean();
			values[i].copy(vdoingBeans[i]);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(values);
	}

	/**   
	 * @Function saveClubServiceRecord
	 * @Description 保存俱乐部会员服务记录.可以被重写。
	 *
	 * @param clubServiceRecs
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-3-13 下午11:43:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	protected void saveClubServiceRecord(IClubServiceRecValue[] clubServiceRecs) throws Exception {
		BOCmClubServiceRecBean[] values = new BOCmClubServiceRecBean[clubServiceRecs.length];
		for (int i = 0; i < values.length; i++) {
			if (clubServiceRecs[i].isNew()) {
				// 设置主键
				clubServiceRecs[i].setRecordId(CmCommonUtil.getNewSequence(BOCmClubServiceRecBean.class));
			}
			values[i] = new BOCmClubServiceRecBean();
			values[i].copy(clubServiceRecs[i]);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(values);
	}

	/**   
	 * @Function saveClubServiceCycle
	 * @Description 保存俱乐部服务周期信息.可以被重写。
	 *
	 * @param clubServiceCylces
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-3-13 下午11:43:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-13     huzq2           v1.0.0               修改原因<br>
	 */
	protected void saveClubServiceCycle(IClubServiceCylceValue[] clubServiceCylces) throws Exception {
		BOCmClubServiceCylceBean[] values = new BOCmClubServiceCylceBean[clubServiceCylces.length];
		for (int i = 0; i < values.length; i++) {
			if (clubServiceCylces[i].isNew()) {
				// 设置主键
				clubServiceCylces[i].setCycleId(CmCommonUtil.getNewSequence(BOCmClubServiceCylceBean.class));
				if (StringUtils.isBlank(clubServiceCylces[i].getState())) {
					clubServiceCylces[i].setState(CmConstants.RecordState.USE);
				}
				if (ServiceManager.getUser() != null) {
					clubServiceCylces[i].setCreateOpId(ServiceManager.getUser().getID());
					clubServiceCylces[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
				}
			}
			values[i] = new BOCmClubServiceCylceBean();
			values[i].copy(clubServiceCylces[i]);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(values);

	}

	/**   
	 * @Function queryAvailableServiceTimes
	 * @Description 查询俱乐部会员年度所有的可用服务次数。会员可用服务次数
	 *
	 * @param clubMemberId 俱乐部会员编号
	 * @param serviceId 俱乐部服务编号
	 * @return 当前周期内该会员可以使用的此类服务次数
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 上午11:26:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public final int queryAvailableServiceTimes(long clubMemberId, long serviceId) throws Exception {
		// 剩余（可用）次数
		int remainTimes = 0;
		// 当前周期内总次数
		int totalTimes = 0;
		// 当前周期内已使用次数
		int usedTimes = 0;
		/*
		 * 临时额度定义的优先级最高，需要先看是否还有临时额度可用，如果有则直接以临时额度为准；否则按照正常流程计算可用服务次数。
		 */
		AdjustServiceCalResult result = calculateAdjustServiceTimes(clubMemberId, serviceId);
		// 将计算结果赋给totalTimes
		totalTimes = result.getTimes();
		// 如果有临时调整额度配置，则以临时调整额度配置为准
		if (result.isHasAdjustService()) {
			// 临时调整服务已使用次数
			usedTimes = calculateUsedServiceTimes(clubMemberId, serviceId, CmConstants.ClubServiceSource.ADJSUT_SERVICE);
		} else {
			totalTimes = calculateNormalServiceTimes(clubMemberId, serviceId);
			usedTimes = calculateUsedServiceTimes(clubMemberId, serviceId, CmConstants.ClubServiceSource.DEFAULT_FREE_SERVICE);
		}
		// 可用次数=总次数-已用次数
		remainTimes = totalTimes - usedTimes;
		// 可用次数不能为负数！
		if (remainTimes < 0) {
			remainTimes = 0;
		}
		return remainTimes;
	}

	/**
	 * 享受服务
	 * @param userId
	 * @param clubMemberId 俱乐部会员编号
	 * @param serviceId服务编号
	 * @param times 服务次数 扣减
	 * @param roamFlag是否异地服务
	 * @param provinceCode 所在服务地省份代码
	 * @param busiCode业务编码 流水号
	 * @param remarks备注
	 * @param serviceType 服务类型 1 火车站 2 机场
	 * @param memberLevel 会员级别
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jul 3, 2012 5:18:14 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 3, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public final ICmReturnData enjoyService(long userId, long clubMemberId, long serviceId, int times, int roamFlag, String provinceCode, String busiCode, String remarks,
			int serviceType, int memberLevel) throws Exception {
		ICmReturnData returnData = new CmReturnDataBean();
		returnData.setResultMsgByKey("");

		busiCode = StringUtils.isBlank(busiCode) ? "0" : busiCode;

		List recoredList = new ArrayList();
		for (int i = 0; i < times; i++) {
			// 扣减的积分
			long needScore = 0;// 扣减的积分额度
			int isVip = 0;// 不是VIP
			if (memberLevel == 1 || memberLevel == 2 || memberLevel == 3) {
				isVip = 1;
			}
			returnData.setResultCode(ICmReturnData.RESULT_CODE_SUCCESS);
			// 查询会员服务定义信息
			BOCmClubServiceBean bean = new BOCmClubServiceBean();
			bean.setServiceId(serviceId);
			IBOCmClubServiceValue serviceValue = (IBOCmClubServiceValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
			// 免费服务记录
			BOCmClubServiceRecBean serviceRecValue = new BOCmClubServiceRecBean();
			// 已用服务次数
			int adjustUsedTimes = calculateUsedServiceTimes(clubMemberId, serviceId, CmConstants.ClubServiceSource.ADJSUT_SERVICE);// 已使用临时调整免费次数
			// 已用服务次数
			int nomalUsedTimes = calculateUsedServiceTimes(clubMemberId, serviceId, CmConstants.ClubServiceSource.DEFAULT_FREE_SERVICE);// 已使用默认次数
			// 总免费服务次数
			int totalNormalTimes = calculateNormalServiceTimes(clubMemberId, serviceId);// 总免费次数
			AdjustServiceCalResult result = calculateAdjustServiceTimes(clubMemberId, serviceId);// 临时调整额度

			/*
			 * 临时额度定义的优先级最高，需要先看是否还有临时额度可用，如果有则直接以临时额度为准；否则按照正常流程计算可用服务次数。
			 */
			if (result.isHasAdjustService() && result.getTimes() - adjustUsedTimes > 0) {
				// 如果还有临时调整服务，则使用临时调整服务次数。
				serviceRecValue.setServiceSource(CmConstants.ClubServiceSource.ADJSUT_SERVICE);
			} else if (totalNormalTimes - nomalUsedTimes > 0) {
				// 如果还有剩余可用免费次数，则使用免费服务；
				serviceRecValue.setServiceSource(CmConstants.ClubServiceSource.DEFAULT_FREE_SERVICE);
			} else {
				// 没有免费服务次数，则使用收费服务
				serviceRecValue.setServiceSource(CmConstants.ClubServiceSource.CHARGED_SERVICE);
				// 可用积分，看是否还有可用积分，如果有且积分足够使用则扣减积分。
				long score = CmServiceFactory.getTeamInvokeSV().getIndivScoreByUserId(userId);

				// 根据用户编号查询用户在网年限
				ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByUserId(userId);
				long CreatDate = CmCommonUtil.getCreateDate(userBean.getEffectiveDate());// 在网年份

				if (serviceType == CmConstants.Club.SERVICE_TYPE_TRAIN) {// 火车站
					/**
					 * 在网25—60个月，可通过扣减积分方式体验火车站贵宾服务，扣减标准为1500积分/人次；
					   在网61个月及以上，可通过扣减积分方式体火车站贵宾服务，扣减标准为1000积分/人次。
					 */
					int onLineTime = 0;// 1 25—60个月2 61个月及以上
					if (CreatDate >= 25 && CreatDate <= 36) {// 扣减1500积分
						onLineTime = 1;
					} else if (CreatDate > 36) {// 扣减1000积分
						onLineTime = 2;
					} else {
						ExceptionUtil.throwBusinessException("CMS1100144");// 在网小于25月不能体验火车站服务！
					}
					needScore = CmLnCommonUtil.getVipScoreRul(serviceType, 1, isVip, onLineTime);
				} else if (serviceType == CmConstants.Club.SERVICE_TYPE_PLANE) {// 机场服务
					/**
					 * 全球通普通用户在网时间25-36个月，以3000积分/次的扣减标准扣减积分体验机场贵宾服务；在网37-60个月，
					 * 以2000积分/次的扣减标准扣减积分体验机场贵宾服务；在网61-96个月，每年免费体验3次，超出免费次数以2000积分/次的
					 * 扣减标准扣减积分体验机场贵宾服务；在网97-120个月，每年免费体验5次，超出免费次数以2000积分/次的扣减标准扣减积分
					 * 体验机场贵宾服务；全球通VIP用户无限次使用（即如果是全球通VIP用户，直接提示操作员即可，不用在此菜单中办理业务）
					 * 其他品牌不能办理
					 */
					int onLineTime = 0;// 1 1 25-36个月 2 37-60个月 3 61-96个月 4 97-120个月个月 2 61个月及以上
					if (memberLevel <= 0 || memberLevel > 3) {// 普通vip
						if (CreatDate >= 25 && CreatDate <= 36) {// 扣减3000积分
							onLineTime = 1;
						} else if (CreatDate >= 37 && CreatDate <= 60) {// 扣减2000积分
							onLineTime = 2;
						} else if (CreatDate >= 61 && CreatDate <= 96) {// 扣减2000积分
							onLineTime = 3;
						} else if (CreatDate >= 97 && CreatDate <= 120) {// 扣减2000积分
							onLineTime = 4;
						} else if (CreatDate > 120) {
							onLineTime = 4;
						}
						needScore = CmLnCommonUtil.getVipScoreRul(serviceType, 0, isVip, onLineTime);
					} else if (memberLevel == 1 || memberLevel == 2 || memberLevel ==3) {// 金、钻、银 会员级别
						// 不需要扣减积分
						needScore = 0;
					}
				}
				// 扣减积分
				if (score - needScore >= 0) {
					if (needScore > 0) {
						CmServiceFactory.getTeamInvokeSV().reduceScore(userId, needScore, remarks, serviceType);// 扣减积分
					}
				} else {
					// "积分不足"
					ExceptionUtil.throwBusinessException("CMS0034003");
				}
			}

			long recordId = CmCommonUtil.getNewSequence(BOCmClubServiceBean.class);
			recoredList.add(recordId);
			serviceRecValue.setRecordId(recordId);// 设置主键，在扣减积分时用作业务流水
			// 服务记录
			serviceRecValue.setServiceId(serviceId);
			serviceRecValue.setMemberId(clubMemberId);
			serviceRecValue.setServiceContent(serviceValue.getServiceName());
			serviceRecValue.setServicePlace(serviceValue.getRemarks());
			serviceRecValue.setServiceDate(CmCommonUtil.getSysDate());
			serviceRecValue.setServiceContent(serviceValue.getServiceName());
			serviceRecValue.setRegionId(CenterUtil.getRegionIdByUserId(userId));
			serviceRecValue.setRemarks(remarks);
			serviceRecValue.setProvinceCode(provinceCode);
			serviceRecValue.setRoamFlag(roamFlag);
			serviceRecValue.setState(CmConstants.RecordState.USE);
			//serviceRecValue.setSuiteAmount(times - 1);// 随缘人数
			serviceRecValue.setSuiteAmount(0);// 随缘人数
			serviceRecValue.setOptSeq(Long.parseLong(busiCode));
			serviceRecValue.setValueType(serviceValue.getValueType());
			serviceRecValue.setValueAmount(needScore);// 实际消费积分
			// 保存服务记录
			CmInnerServiceFactory.getCommonInnerSV().saveBean(serviceRecValue);
		}
		returnData.setUserObject("recordList", recoredList);
		return returnData;
	}
	
	
	/**
	 * 享受服务
	 * @param userId
	 * @param clubMemberId 俱乐部会员编号
	 * @param serviceId服务编号
	 * @param times 服务次数 扣减
	 * @param roamFlag是否异地服务
	 * @param provinceCode 所在服务地省份代码
	 * @param busiCode业务编码 流水号
	 * @param remarks备注
	 * @param serviceType 服务类型 1 火车站 2 机场
	 * @param memberLevel 会员级别
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jul 3, 2012 5:18:14 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 3, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public final ICmReturnData enjoyService4LnVip(long userId, long clubMemberId, long serviceId, int times, int roamFlag, String provinceCode, String busiCode, String remarks,
			int serviceType, int memberLevel, int enjoyType) throws Exception {
		ICmReturnData returnData = new CmReturnDataBean();
		returnData.setResultMsgByKey("");

		busiCode = StringUtils.isBlank(busiCode) ? "0" : busiCode;

		List recoredList = new ArrayList();
		for (int i = 0; i < times; i++) {
			// 扣减的积分
			long needScore = 0;// 扣减的积分额度
			int isVip = 0;// 不是VIP
			if (memberLevel == 1 || memberLevel == 2 || memberLevel == 3) {
				isVip = 1;
			}
			returnData.setResultCode(ICmReturnData.RESULT_CODE_SUCCESS);
			// 查询会员服务定义信息
			BOCmClubServiceBean bean = new BOCmClubServiceBean();
			bean.setServiceId(serviceId);
			IBOCmClubServiceValue serviceValue = (IBOCmClubServiceValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
			// 免费服务记录
			BOCmClubServiceRecBean serviceRecValue = new BOCmClubServiceRecBean();
			// 已用服务次数
			int adjustUsedTimes = calculateUsedServiceTimes(clubMemberId, serviceId, CmConstants.ClubServiceSource.ADJSUT_SERVICE);// 已使用临时调整免费次数
			// 已用服务次数
			int nomalUsedTimes = calculateUsedServiceTimes(clubMemberId, serviceId, CmConstants.ClubServiceSource.DEFAULT_FREE_SERVICE);// 已使用默认次数
			// 总免费服务次数
			int totalNormalTimes = calculateNormalServiceTimes(clubMemberId, serviceId);// 总免费次数
			AdjustServiceCalResult result = calculateAdjustServiceTimes(clubMemberId, serviceId);// 临时调整额度

			/*
			 * 临时额度定义的优先级最高，需要先看是否还有临时额度可用，如果有则直接以临时额度为准；否则按照正常流程计算可用服务次数。
			 */
			if (result.isHasAdjustService() && result.getTimes() - adjustUsedTimes > 0) {
				// 如果还有临时调整服务，则使用临时调整服务次数。
				serviceRecValue.setServiceSource(CmConstants.ClubServiceSource.ADJSUT_SERVICE);
			} else if (totalNormalTimes - nomalUsedTimes > 0) {
				// 如果还有剩余可用免费次数，则使用免费服务；
				serviceRecValue.setServiceSource(CmConstants.ClubServiceSource.DEFAULT_FREE_SERVICE);
			} else {
				// 没有免费服务次数，则使用收费服务
				serviceRecValue.setServiceSource(CmConstants.ClubServiceSource.CHARGED_SERVICE);
				// 可用积分，看是否还有可用积分，如果有且积分足够使用则扣减积分。
				long score = CmServiceFactory.getTeamInvokeSV().getIndivScoreByUserId(userId);

				// 根据用户编号查询用户在网年限
				ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByUserId(userId);
				long CreatDate = CmCommonUtil.getCreateDate(userBean.getEffectiveDate());// 在网年份

				if (serviceType == CmConstants.Club.SERVICE_TYPE_TRAIN) {// 火车站
					/**
					 * 在网25—60个月，可通过扣减积分方式体验火车站贵宾服务，扣减标准为1500积分/人次；
					   在网61个月及以上，可通过扣减积分方式体火车站贵宾服务，扣减标准为1000积分/人次。
					 */
					int onLineTime = 0;// 1 25—60个月2 61个月及以上
					int serviceLevel = 1;
					if (enjoyType == 1) {// 扣减1000积分
						serviceLevel = 1;
					} else if (enjoyType == 2) {// 扣减1500积分
						serviceLevel = 2;
					} else {
						ExceptionUtil.throwBusinessException("CMS1100144");// 在网小于25月不能体验火车站服务！
					}
					needScore = CmLnCommonUtil.getVipScoreRul(serviceType, serviceLevel, isVip, onLineTime);
				} else if (serviceType == CmConstants.Club.SERVICE_TYPE_PLANE) {// 机场服务
					/**
					 * 全球通普通用户在网时间25-36个月，以3000积分/次的扣减标准扣减积分体验机场贵宾服务；在网37-60个月，
					 * 以2000积分/次的扣减标准扣减积分体验机场贵宾服务；在网61-96个月，每年免费体验3次，超出免费次数以2000积分/次的
					 * 扣减标准扣减积分体验机场贵宾服务；在网97-120个月，每年免费体验5次，超出免费次数以2000积分/次的扣减标准扣减积分
					 * 体验机场贵宾服务；全球通VIP用户无限次使用（即如果是全球通VIP用户，直接提示操作员即可，不用在此菜单中办理业务）
					 * 其他品牌不能办理
					 */
					int onLineTime = 0;// 1 1 25-36个月 2 37-60个月 3 61-96个月 4 97-120个月个月 2 61个月及以上
					if (memberLevel <= 0) {// 普通vip
						if (CreatDate >= 25 && CreatDate <= 36) {// 扣减3000积分
							onLineTime = 1;
						} else if (CreatDate >= 37 && CreatDate <= 60) {// 扣减2000积分
							onLineTime = 2;
						} else if (CreatDate >= 61 && CreatDate <= 96) {// 扣减2000积分
							onLineTime = 3;
						} else if (CreatDate >= 97 && CreatDate <= 120) {// 扣减2000积分
							onLineTime = 4;
						} else if (CreatDate > 120) {
							onLineTime = 4;
						}
						needScore = CmLnCommonUtil.getVipScoreRul(serviceType, 1, isVip, onLineTime);
					} else if (memberLevel == 1 || memberLevel == 2 || memberLevel == 3) {// 金、钻、银 会员级别
						// 不需要扣减积分
						needScore = 0;
					}
				}
				// 扣减积分
				if (score - needScore >= 0) {
					if (needScore > 0) {
						CmServiceFactory.getTeamInvokeSV().reduceScore(userId, needScore, remarks, serviceType);// 扣减积分
					}
				} else {
					// "积分不足"
					ExceptionUtil.throwBusinessException("CMS0034003");
				}
			}

			long recordId = CmCommonUtil.getNewSequence(BOCmClubServiceBean.class);
			recoredList.add(recordId);
			serviceRecValue.setRecordId(recordId);// 设置主键，在扣减积分时用作业务流水
			// 服务记录
			serviceRecValue.setServiceId(serviceId);
			serviceRecValue.setMemberId(clubMemberId);
			serviceRecValue.setServiceContent(serviceValue.getServiceName());
			serviceRecValue.setServicePlace(serviceValue.getRemarks());
			serviceRecValue.setServiceDate(CmCommonUtil.getSysDate());
			serviceRecValue.setServiceContent(serviceValue.getServiceName());
			serviceRecValue.setRegionId(CenterUtil.getRegionIdByUserId(userId));
			serviceRecValue.setRemarks(remarks);
			serviceRecValue.setProvinceCode(provinceCode);
			serviceRecValue.setRoamFlag(roamFlag);
			serviceRecValue.setState(CmConstants.RecordState.USE);
			//serviceRecValue.setSuiteAmount(times - 1);// 随缘人数
			serviceRecValue.setSuiteAmount(0);// 随缘人数
			serviceRecValue.setOptSeq(Long.parseLong(busiCode));
			serviceRecValue.setValueType(serviceValue.getValueType());
			serviceRecValue.setValueAmount(needScore);// 实际消费积分
			// 保存服务记录
			CmInnerServiceFactory.getCommonInnerSV().saveBean(serviceRecValue);
		}
		returnData.setUserObject("recordList", recoredList);
		return returnData;
	}

	/**   
	 * @Function saveClubService
	 * @Description 保存俱乐部服务信息
	 *
	 * @param clubServiceValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-22 下午3:47:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-22     huzq2           v1.0.0               修改原因<br>
	 */
	public final void saveClubService(IClubServiceValue[] clubServiceValues) throws Exception {
		BOCmClubServiceBean[] values = new BOCmClubServiceBean[clubServiceValues.length];
		for (int i = 0; i < values.length; i++) {
			if (clubServiceValues[i].isNew()) {
				// 设置主键
				clubServiceValues[i].setServiceId(CmCommonUtil.getNewSequence(BOCmClubServiceBean.class));
				if (ServiceManager.getUser() != null) {
					clubServiceValues[i].setCreateOpId(ServiceManager.getUser().getID());
					clubServiceValues[i].setCreateOrgId(ServiceManager.getUser().getOrgId());
				}
				if (StringUtils.isBlank(clubServiceValues[i].getState())) {
					clubServiceValues[i].setState(CmConstants.RecordState.USE);
				}
			}
			values[i] = new BOCmClubServiceBean();
			values[i].copy(clubServiceValues[i]);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(values);
	}

	/**   
	 * @Function calculateAdjustServiceTimes
	 * @Description 计算临时调整可用额度。[默认实现取当前有效记录中的最大值.]
	 *
	 * @param clubMemberId 会员编号
	 * @param serviceId 服务编号
	 * @return 符合条件的可用次数
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 上午11:33:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public AdjustServiceCalResult calculateAdjustServiceTimes(long clubMemberId, long serviceId) throws Exception {
		AdjustServiceCalResult result = new AdjustServiceCalResult();
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmClubServiceAdjustValue.S_State).append(" = :state ");
		condition.append(" AND ").append(IBOCmClubServiceAdjustValue.S_ServiceId).append(" = :serviceId ");
		condition.append(" AND ").append(IBOCmClubServiceAdjustValue.S_MemberId).append(" = :memberId ");
		// 当前有效的
		condition.append(" AND ").append(IBOCmClubServiceAdjustValue.S_EffectiveDate).append(" <= :currentDate ");
		condition.append(" AND ").append(IBOCmClubServiceAdjustValue.S_ExpireDate).append(" >= :currentDate ");
		parameter.put("state", CmConstants.RecordState.USE);
		parameter.put("serviceId", Long.valueOf(serviceId));
		parameter.put("memberId", Long.valueOf(clubMemberId));
		parameter.put("currentDate", CmCommonUtil.getSysDate());
		IBOCmClubServiceAdjustValue[] adjustValues = (IBOCmClubServiceAdjustValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubServiceAdjustBean.class,
				condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(adjustValues)) {
			// 设置含有临时调整额度标志
			result.setHasAdjustService(true);
			// 默认实现取当前有效记录中的最大值
			for (int i = 0; i < adjustValues.length; i++) {
				if (adjustValues[i].getTempValue() > result.getTimes()) {
					result.setTimes(adjustValues[i].getTempValue());
				}
			}
		}
		return result;
	}

	/**   
	 * @Function calculateNormalServiceTimes
	 * @Description 计算正常情况下的总的可用服务次数
	 *
	 * @param clubMemberId
	 * @param serviceId
	 * @param cycleType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午3:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public int calculateNormalServiceTimes(long clubMemberId, long serviceId) throws Exception 
	{
		/*
		 * 如果当前服务配置为周期限制的话，则只返回当前周期可用次数，否则返回年度可用次数
		 */
		BOCmClubServiceBean bean = new BOCmClubServiceBean();
		bean.setServiceId(serviceId);
		BOCmClubServiceBean serviceBean = (BOCmClubServiceBean) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (serviceBean.getIsCycleLimited() == 1) {
			return getClubServiceCycle(serviceId).getCycleTimes();
		}
		// 先查询出纬度定义
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IQBOCmClubServiceVdoingDetailValue.S_ServiceId).append(" = :serviceId ");
		parameter.put("serviceId", Long.valueOf(serviceId));
		IBOCmClubServiceVdoingValue[] serviceVdoingValues = (IBOCmClubServiceVdoingValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubServiceVdoingBean.class,
				condition.toString(), parameter, -1, -1);
		// 在查询纬度明细
		condition.delete(0, condition.length());
		parameter.clear(); // modifyed by liaosc 4.25
		condition.append(" 1=1 AND ");
		condition.append("EXISTS( SELECT 1 FROM CM_CLUB_SERVICE_VDOING B WHERE B.STATE = 'U' and B.DIMENSION_ID=M.DIMENSION_ID ");
		condition.append("AND ").append(" B.SERVICE_ID = :serviceId ");// add by liaosc 4.25
		parameter.put("serviceId", Long.valueOf(serviceId));
		ServiceDimension[] dimensions = getServiceDimension(clubMemberId, serviceBean.getServiceType());
		if (CmCommonUtil.isNotEmptyObject(dimensions)) 
		{
			condition.append("AND (");
			for (int i = 0; i < dimensions.length; i++) 
			{
				if (i > 0) 
					condition.append(" OR ");
				
				condition.append("(").append("B.DIMENSION_TYPE").append(" = :dimensionType_").append(i);
				condition.append(" AND ").append("M.DETAIL_TYPE").append(" = :detailType_").append(i).append(" ) ");
				parameter.put("dimensionType_" + i, dimensions[i].getDimensionType());
				parameter.put("detailType_" + i, dimensions[i].getDimensionDetail());
			}
			condition.append(") ");
		}
		condition.append(") ");
		condition.append("AND M.STATE = 'U' ");
		IBOCmClubServiceVdoingDetailValue[] serviceVdoingDetailValues = (IBOCmClubServiceVdoingDetailValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(
				BOCmClubServiceVdoingDetailBean.class, condition.toString(), parameter, -1, -1);
		// 处理数据
		Map timesMap = new HashMap();
		Map weightMap = new HashMap();
		
		for (int i = 0; i < serviceVdoingValues.length; i++) 
		{
			for (int j = 0; j < serviceVdoingDetailValues.length; j++) 
			{
				if (serviceVdoingDetailValues[j].getDimensionId() == serviceVdoingValues[i].getDimensionId()) 
				{
					timesMap.put(serviceVdoingValues[i].getDimensionType(), serviceVdoingDetailValues[j].getTotalTimes());
					break;
				}
			}
		}
		// 查询会员服务定义信息
		if (CmCommonUtil.isNotEmptyObject(serviceBean)) {
			// 计算可用次数
			return CmClubServiceTimesFactory.geTimesStrategy(String.valueOf(serviceBean.getTimesStrategy()<=0?1:serviceBean.getTimesStrategy())).calculateAvailableTimes(timesMap, weightMap);
		}
		return 0;
	}

	/**   
	 * @Function calculateUsedServiceTimes
	 * @Description 计算某类服务已使用次数
	 *
	 * @param clubMemberId 会员编号【必须】
	 * @param serviceType 服务类型【必须】
	 * @param serviceSource 服务来源【必须；1：默认免费服务；2：临时免费服务（当使用的是临时调整的服务次数时记录）；3：收费服务。】
	 * @return 符合条件的使用次数
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午1:09:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public final int calculateUsedServiceTimes(long clubMemberId, long serviceId, int serviceSource) throws Exception {
		int cycleType = CmConstants.ClubServiceCycleType.YEAR;
		/*
		 * 如果当前服务配置为周期限制的话，则按当前周期计算
		 */
		BOCmClubServiceBean bean = new BOCmClubServiceBean();
		bean.setServiceId(serviceId);
		BOCmClubServiceBean serviceBean = (BOCmClubServiceBean) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (serviceBean.getIsCycleLimited() == 1 && serviceSource == CmConstants.ClubServiceSource.DEFAULT_FREE_SERVICE) {
			cycleType = getClubServiceCycle(serviceId).getCycleType();
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmClubServiceRecValue.S_State).append(" = :state ");
		condition.append(" AND ").append(IBOCmClubServiceRecValue.S_MemberId).append(" = :memberId ");
		// condition.append(" AND ").append(IBOCmClubServiceRecValue.S_ServiceType).append(" = :serviceType ");
		condition.append(" AND ").append(IBOCmClubServiceRecValue.S_ServiceSource).append(" = :serviceSource ");
		condition.append(" AND ").append(IBOCmClubServiceRecValue.S_ServiceDate).append(" >= :cycleDate ");
		parameter.put("state", CmConstants.RecordState.USE);
		parameter.put("memberId", Long.valueOf(clubMemberId));
		parameter.put("serviceType", Integer.valueOf(serviceBean.getServiceType()));
		parameter.put("serviceSource", Integer.valueOf(serviceSource));
		parameter.put("cycleDate", CmClubServiceTimeCycleFactory.geTimesCycle(String.valueOf(cycleType)).getCycleTimestamp(CmCommonUtil.getSysDate()));

		IBOCmClubServiceRecValue[] serviceRecValue = (IBOCmClubServiceRecValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubServiceRecBean.class,
				condition.toString(), parameter, -1, -1);

		int usedTimes = 0;
		for (int i = 0; i < serviceRecValue.length; i++) {
			usedTimes += serviceRecValue[i].getSuiteAmount() + 1;
		}
		return usedTimes;
	}

	/**   
	 * @Function getClubServiceCycle
	 * @Description 获取指定服务的周期配置信息
	 *
	 * @param serviceId 服务编号
	 * @return 符合条件的服务周期配置信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午1:48:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	protected IBOCmClubServiceCylceValue getClubServiceCycle(long serviceId) throws Exception {
		BOCmClubServiceCylceBean bean = new BOCmClubServiceCylceBean();
		bean.setServiceId(serviceId);
		bean.setState(CmConstants.RecordState.USE);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { bean }, BOCmClubServiceCylceBean.class);
		IBOCmClubServiceCylceValue[] cylceValues = (IBOCmClubServiceCylceValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
				parameter.getCondition(), parameter.getParameter(), -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cylceValues)) {
			// 获取优先级最高的一个周期配置作为当前这个服务的周期
			IBOCmClubServiceCylceValue serviceCylceValue = cylceValues[0];
			for (int i = 1; i < cylceValues.length; i++) {
				if (serviceCylceValue.getCycleSort() > cylceValues[i].getCycleSort()) {
					serviceCylceValue = cylceValues[i];
				}
			}
			return serviceCylceValue;
		}
		return null;
	}

	/**   
	 * @Function getServiceDimension
	 * @Description 获取符合当前会员的服务纬度定义条件
	 *
	 * @param memberId 会员编号
	 * @return 符合当前会员的服务纬度定义条件
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午3:38:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	protected abstract ServiceDimension[] getServiceDimension(long memberId, int serviceType) throws Exception;

	/**   
	 * @Function canEnjoyService
	 * @Description 验证是否可以享受免费服务
	 *
	 * @param clubMemberId 会员编号
	 * @param serviceId 服务编号
	 * @param returnData 拒绝享受会员服务的原因
	 * @return 是否可以享受免费服务
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午5:46:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public abstract boolean canEnjoyService(long userId, long clubMemberId, long serviceId, int times, ICmReturnData returnData) throws Exception;

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName AbstractClubServiceBusiModelImpl
	 * @Description  服务纬度的定义
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午3:37:01
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public static class ServiceDimension {

		private int dimensionType;

		private String dimensionDetail;

		public ServiceDimension() {
			super();
		}

		public ServiceDimension(int dimensionType, String dimensionDetail) {
			super();
			this.dimensionType = dimensionType;
			this.dimensionDetail = dimensionDetail;
		}

		public final int getDimensionType() {
			return dimensionType;
		}

		public final void setDimensionType(int dimensionType) {
			this.dimensionType = dimensionType;
		}

		public final String getDimensionDetail() {
			return dimensionDetail;
		}

		public final void setDimensionDetail(String dimensionDetail) {
			this.dimensionDetail = dimensionDetail;
		}
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName AbstractClubServiceBusiModelImpl
	 * @Description 临时服务调整次数计算结果对象
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-17 下午2:18:20
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-2-17     huzq2           v1.0.0               修改原因<br>
	 */
	public static class AdjustServiceCalResult {

		private int times;
		public boolean hasAdjustService;

		public AdjustServiceCalResult() {
			super();
			this.times = 0;
			this.hasAdjustService = false;
		}

		public AdjustServiceCalResult(int times, boolean hasAdjustService) {
			super();
			this.times = times;
			this.hasAdjustService = hasAdjustService;
		}

		public int getTimes() {
			return times;
		}

		public void setTimes(int times) {
			this.times = times;
		}

		public boolean isHasAdjustService() {
			return hasAdjustService;
		}

		public void setHasAdjustService(boolean hasAdjustService) {
			this.hasAdjustService = hasAdjustService;
		}
	}
}
