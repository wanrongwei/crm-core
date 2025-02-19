package com.asiainfo.crm.cm.common.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.bo.BOCmAttachBean;
import com.asiainfo.crm.cm.common.bo.BOCmAttachEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmAttachSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnFTPPath;

/** 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName ICmAttachSV
 * @Description 该类的功能描述
 * @version v1.0.0
 * @author huzq2
 * @date 2012-5-2 下午9:43:47
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-5-2     huzq2           v1.0.0               修改原因<br>
 */
public class CmAttachSVImpl implements ICmAttachSV {

	public long saveAttachValue(IBOCmAttachValue attachValue) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(attachValue)) {
			if (attachValue.isNew()) {
				attachValue.setAttachId(CmCommonUtil.getNewSequence(BOCmAttachBean.class));
				if (ServiceManager.getUser() != null) {
					attachValue.setCreateOpId(ServiceManager.getUser().getID());
					attachValue.setCreateOpId(ServiceManager.getUser().getOrgId());
				}
				attachValue.setState(CmConstants.RecordState.USE);
			} else if (attachValue.isDeleted()) {
				attachValue.setStsToOld();
				attachValue.setState(CmConstants.RecordState.ERASE);
				attachValue.setExpireDate(ServiceManager.getOpDateTime());
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) attachValue);
			return attachValue.getAttachId();
		}
		return 0;
	}

	public IBOCmAttachValue queryAttachValueById(long attachId, String state) throws Exception {
		IBOCmAttachValue sample = new BOCmAttachBean();
		sample.setAttachId(attachId);

		if (StringUtils.isNotBlank(state) && (CmConstants.RecordState.USE.equalsIgnoreCase(state) || CmConstants.RecordState.ERASE.equalsIgnoreCase(state))) {
			sample.setState(state);
		}
		return (IBOCmAttachValue) CmInnerServiceFactory.getCommonInnerSV().getBean((DataContainerInterface) sample);
	}

	public IBOCmAttachValue[] queryAttachValues(String criteria, int startNum, int endNum) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(ParamUtil.parseXmlCriteria(criteria));
		return (IBOCmAttachValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAttachBean.class, parameter.getCondition(), parameter.getParameter(), startNum, endNum);
	}

	public int queryAttachValueCount(String criteria) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(ParamUtil.parseXmlCriteria(criteria));
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmAttachBean.class, parameter.getCondition(), parameter.getParameter());
	}

	public int queryAttachValueCount(IBOCmAttachValue sample) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { (DataContainer) sample });
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmAttachBean.class, parameter.getCondition(), parameter.getParameter());
	}

	public void saveAttachValues(IBOCmAttachValue[] attachValues) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(attachValues)) {
			for (int i = 0; i < attachValues.length; i++) {
				if (attachValues[i].isNew()) {
					attachValues[i].setAttachId(CmCommonUtil.getNewSequence(BOCmAttachBean.class));
					if (ServiceManager.getUser() != null) {
						attachValues[i].setCreateOpId(ServiceManager.getUser().getID());
						attachValues[i].setCreateOpId(ServiceManager.getUser().getOrgId());
					}
					attachValues[i].setState(CmConstants.RecordState.USE);
				} else if (attachValues[i].isDeleted()) {
					attachValues[i].setStsToOld();
					attachValues[i].setState(CmConstants.RecordState.ERASE);
					attachValues[i].setExpireDate(ServiceManager.getOpDateTime());
				}
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans((DataContainerInterface[]) attachValues);
		}
	}

	public int queryAttachValueCount(String startDate, String endDate)throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append("1=1");
		if(StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)){
			condition.append(" AND ").append(IBOCmAttachValue.S_CreateDate).append(" >= to_date('")
			.append(startDate).append(" 00:00:00").append("','yyyy-MM-dd hh24:mi:ss')");
			condition.append(" AND ").append(IBOCmAttachValue.S_CreateDate).append(" <= to_date('")
			.append(endDate).append(" 23:59:59").append("','yyyy-MM-dd hh24:mi:ss')");
		}
		condition.append(" AND ");
		condition.append(IBOCmAttachValue.S_State).append("=:state");
		parameters.put("state",CmxConstants.RECORD_STATE_USE);
		if (ServiceManager.getUser()!=null) {
			long opId=ServiceManager.getUser().getID();
			condition.append(" AND ");
			condition.append(IBOCmAttachValue.S_OpId).append("=:opId");
			parameters.put("opId",opId);
		}
		condition.append(" AND ");
		condition.append(IBOCmAttachValue.S_BusiTypeCode).append("=:busiTypeCode");
		parameters.put("busiTypeCode",CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE);
		return BOCmAttachEngine.getBeansCount(condition.toString(), parameters);
	}

	public IBOCmAttachValue[] queryAttachValues(String startDate,
			String endDate, int startNum, int endNum) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameters = new HashMap();
		condition.append("1=1");
		if(StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)){
			condition.append(" AND ").append(IBOCmAttachValue.S_CreateDate).append(" >= to_date('")
			.append(startDate).append(" 00:00:00").append("','yyyy-MM-dd hh24:mi:ss')");
			condition.append(" AND ").append(IBOCmAttachValue.S_CreateDate).append(" <= to_date('")
			.append(endDate).append(" 23:59:59").append("','yyyy-MM-dd hh24:mi:ss')");
		}
		condition.append(" AND ");
		condition.append(IBOCmAttachValue.S_State).append("=:state");
		parameters.put("state",CmxConstants.RECORD_STATE_USE);
		if (ServiceManager.getUser()!=null) {
			long opId=ServiceManager.getUser().getID();
			condition.append(" AND ");
			condition.append(IBOCmAttachValue.S_OpId).append("=:opId");
			parameters.put("opId",opId);
		}
		condition.append(" AND ");
		condition.append(IBOCmAttachValue.S_BusiTypeCode).append("=:busiTypeCode");
		parameters.put("busiTypeCode",CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE);
		return BOCmAttachEngine.getBeans(null,condition.toString(), parameters,startNum,endNum,true);
	}

	public IBOCmAttachValue[] queryAttachValues(DataContainer da)
			throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 and ");
		condition.append(IBOCmAttachValue.S_BusiSheetId).append(" = :busiSheetId ");
		parameter.put("busiSheetId", (da.get(IBOCmAttachValue.S_BusiSheetId)).toString());
		condition.append(" and ");
		condition.append(IBOCmAttachValue.S_State).append(" = :status ");
		parameter.put("status", da.get(IBOCmAttachValue.S_State));
		return (IBOCmAttachValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAttachBean.class, condition.toString(), parameter, -1, -1);
	}
}
