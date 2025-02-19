package com.asiainfo.crm.cm.dk.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.bo.BOCmGroupApprovalBean;
import com.asiainfo.crm.cm.dk.bo.BOCmPsSegmentCalBean;
import com.asiainfo.crm.cm.dk.bo.BOCmPsSegmentCalHBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmGroupApprovalValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsSegmentCalHValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPsSegmentCalValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmTaskSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class CmTaskSVImpl implements ICmTaskSV {

	public IBOCmPsSegmentCalValue[] queryAllSegmentCal() throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("1=1");
		IBOCmPsSegmentCalValue[] segmentCalValues = (IBOCmPsSegmentCalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmPsSegmentCalBean.class, sb.toString(), null,
				-1, -1);
		if (segmentCalValues != null && segmentCalValues.length > 0) {
			return segmentCalValues;
		}
		return new IBOCmPsSegmentCalValue[0];
	}

	public void savePsSegmentCal(IBOCmPsSegmentCalValue[] segmentCalValues) throws Exception {
		List beanList = new ArrayList();
		BOCmPsSegmentCalBean segmentCalBean = null;
		for (int i = 0; i < segmentCalValues.length; i++) {
			segmentCalBean = new BOCmPsSegmentCalBean();
			segmentCalBean.copy(segmentCalValues[i]);
			if (segmentCalBean.isNew()) {
				segmentCalBean.setRecordId(CmCommonUtil.getNewSequence(BOCmPsSegmentCalBean.class));
				segmentCalBean.setState(CmConstants.RecordState.USE);
			}
			beanList.add(segmentCalBean);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmPsSegmentCalBean[]) beanList.toArray(new BOCmPsSegmentCalBean[0]));
	}

	public void saveGroupApproval(IBOCmGroupApprovalValue[] groupApprovalValues) throws Exception {
		List beanList = new ArrayList();
		BOCmGroupApprovalBean groupApprovalBean = null;
		for (int i = 0; i < groupApprovalValues.length; i++) {
			groupApprovalBean = new BOCmGroupApprovalBean();
			groupApprovalBean.copy(groupApprovalValues[i]);
			if (groupApprovalBean.isNew()) {
				groupApprovalBean.setApproverId(CmCommonUtil.getNewSequence(BOCmGroupApprovalBean.class));
				groupApprovalBean.setState(CmConstants.RecordState.USE);
			}
			beanList.add(groupApprovalBean);
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans((BOCmPsSegmentCalBean[]) beanList.toArray(new BOCmPsSegmentCalBean[0]));

	}

	public IBOCmGroupApprovalValue[] queryAllGroupApproval() throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("1=1");
		IBOCmGroupApprovalValue[] groupApprovalValues = (IBOCmGroupApprovalValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupApprovalBean.class, sb.toString(),
				null, -1, -1);
		if (groupApprovalValues != null && groupApprovalValues.length > 0) {
			return groupApprovalValues;
		}
		return new IBOCmGroupApprovalValue[0];
	}

	public void savePsSegmentCalH(IBOCmPsSegmentCalHValue psSegmentCalHValue) throws Exception {
		if (psSegmentCalHValue != null) {
			BOCmPsSegmentCalHBean bean = new BOCmPsSegmentCalHBean();
			bean.copy(psSegmentCalHValue);
			if (bean.isNew()) {
				if (psSegmentCalHValue.getHId() <= 0) {
					bean.setHId(CmCommonUtil.getNewSequence(BOCmPsSegmentCalHBean.class));
				}
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}

	}

}
