package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.ArrayList;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICmReturnData;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceValue;

public class DefaultClubServiceDealBusiModelImpl extends AbstractClubServiceDealBusiModelImpl {

	protected ServiceDimension[] getServiceDimension(long memberId, int serviceType) throws Exception {
		List list = new ArrayList();
		IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryClubMemberById(memberId);
		if (memberValue.getMemberLevel() == 1 || memberValue.getMemberLevel() == 2 || memberValue.getMemberLevel() == 3) {
			// 会员级别的纬度
			list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_LEVEL, String.valueOf(1)));
		} else if (memberValue.getMemberLevel() == 6) {
			//集团贵宾卡维度
			list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_GB_CARD, String.valueOf(1)));
		} else {
			// 普通全球通
			list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_GLOBAL, String.valueOf(getGlobalDtlType(memberValue.getUserId(), serviceType))));
		}
		// 会员归属地市
		/*
		 * list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_REGION,
		 * memberValue.getRegionId())); // 会员品牌 ISoUserValue userValue =
		 * CmServiceFactory.getTeamInvokeSV().getSoUserByUserId(memberValue.getUserId()); if (userValue != null) {
		 * list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_BRAND,
		 * String.valueOf(userValue.getBrandId()))); list.add(new
		 * ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_CREDIT,
		 * String.valueOf(userValue.getCreditLevel()))); }
		 */
		return (ServiceDimension[]) list.toArray(new ServiceDimension[0]);
	}

	/**   
	 * @Function getGlobalDtlType
	 * @Description 
	 *计算普通全球通根据在网时长对应的维度明细类型
	 * @param userId
	 * @return
	 *  普通全球通：
		火车站服务：
		1.25—60个月
		2.61个月及以上
		
		机场服务：
		1.25-36个月
		2.37-60个月
		3.61-96个月
		4.97-120个月
	 * @version v1.0.0
	 * @author shitian
	 * @throws Exception 
	 * @date Oct 26, 2012 1:38:49 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 26, 2012     shitian           v1.0.0               修改原因<br>
	 */
	private int getGlobalDtlType(long userId, int serviceType) throws Exception {
		int detalType = -1;
		ISoUserValue userBean = CmServiceFactory.getTeamInvokeSV().getSoUserByUserId(userId);
		long CreatDate = CmCommonUtil.getCreateDate(userBean.getEffectiveDate());// 在网年份
		if (serviceType == CmConstants.Club.SERVICE_TYPE_TRAIN) {// 火车站
			if (CreatDate >= 25 && CreatDate <= 36) {
				detalType = 1;
			} else if (CreatDate > 36) {
				detalType = 2;
			}
		} else if (serviceType == CmConstants.Club.SERVICE_TYPE_PLANE) {// 机场服务
			if (CreatDate >= 25 && CreatDate <= 36) {
				detalType = 1;
			} else if (CreatDate >= 37 && CreatDate <= 60) {
				detalType = 2;
			} else if (CreatDate >= 61 && CreatDate <= 96) {
				detalType = 3;
			} else if (CreatDate >= 97 && CreatDate <= 120) {
				detalType = 4;
			} else if (CreatDate > 120) {
				detalType = 4;
			}
		}

		return detalType;
	}

	public boolean canEnjoyService(long userId, long clubMemberId, long serviceId, int times, ICmReturnData returnData) throws Exception {
		/*
		 * 1,如果有临时额度，优先使用 2,如果没有临时额度，计算剩余使用次数 3,如果剩余次数不够，计算积分
		 */
		boolean resultFlag = false;
		BOCmClubServiceBean bean = new BOCmClubServiceBean();
		bean.setServiceId(serviceId);
		// 查询会员服务定义信息
		IBOCmClubServiceValue serviceValue = (IBOCmClubServiceValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);

		/*
		 * 临时额度定义的优先级最高，需要先看是否还有临时额度可用，如果有则直接以临时额度为准；否则按照正常流程计算可用服务次数。
		 */
		AdjustServiceCalResult result = calculateAdjustServiceTimes(clubMemberId, serviceId);
		int totalTimes = 0;// 总共剩余免费次数
		int needTimes = 0;// 还需要服务次数
		if (result.isHasAdjustService()) {
			totalTimes = result.getTimes() - calculateUsedServiceTimes(clubMemberId, serviceId, CmConstants.ClubServiceSource.ADJSUT_SERVICE);
			if (totalTimes >= times) {
				// 如果还有临时调整服务，则使用临时调整服务次数。
				resultFlag = true;
			} else {
				needTimes = times - totalTimes;
			}
		} else {
			totalTimes = calculateNormalServiceTimes(clubMemberId, serviceId)
					- calculateUsedServiceTimes(clubMemberId, serviceId, CmConstants.ClubServiceSource.DEFAULT_FREE_SERVICE);
			if (totalTimes < 0)
				totalTimes = 0;
			if (totalTimes >= times) {
				// 如果还有剩余可用免费次数，则使用免费服务；
				resultFlag = true;
			} else {
				needTimes = times - totalTimes;
			}
		}
		long totalScore = 0;
		totalScore = CmServiceFactory.getTeamInvokeSV().getIndivScoreByUserId(userId);
		if (resultFlag == false) {
			// 如果免费次数不够，则使用积分
			// 看是否可用积分够用。
			if (totalScore - needTimes * serviceValue.getValueAmount() >= 0) {
				resultFlag = true;
			} else {
				returnData.setResultMsg(CmConstants.ClubServiceStaticData.REJECT_REASON_01);
			}
		}
		returnData.setUserObject("TotalTimes", totalTimes);
		returnData.setUserObject("TotalScore", totalScore);
		return resultFlag;
	}

	protected void validate(IVOClubServiceValue serviceValue) throws Exception {
		// 是否为空对象
		if (serviceValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
	}

}
