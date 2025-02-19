package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.ArrayList;
import java.util.List;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubServiceBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubServiceBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubServiceValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICmReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceValue;

public class DefaultClubServiceBusiModelImpl extends AbstractClubServiceBusiModelImpl {

	protected ServiceDimension[] getServiceDimension(long memberId) throws Exception {
		List list = new ArrayList();
		IClubMemberValue memberValue = CmServiceFactory.getClubMemberSV().queryClubMemberById(memberId);
		// 会员级别的纬度
		list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_LEVEL, String.valueOf(memberValue.getMemberLevel())));
		/*// 会员归属地市
		list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_REGION, memberValue.getRegionId()));
		// 会员品牌
		ISoUserValue userValue = CmServiceFactory.getTeamInvokeSV().getSoUserByUserId(memberValue.getUserId());
		if (userValue != null) {
			list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_BRAND, String.valueOf(userValue.getBrandId())));
			list.add(new ServiceDimension(CmConstants.ClubServiceDimensionType.FREE_DIMENSION_CREDIT, String.valueOf(userValue.getCreditLevel())));
		}*/
		return (ServiceDimension[]) list.toArray(new ServiceDimension[0]);
	}

	public boolean canEnjoyService(long userId, long clubMemberId, long serviceId, int times, ICmReturnData returnData) throws Exception {
		/*
		 * 1,如果有临时额度，优先使用
		 * 2,如果没有临时额度，计算剩余使用次数
		 * 3,如果剩余次数不够，计算积分
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

	public int queryCount(DataContainer[] criteria) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
