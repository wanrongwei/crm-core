package com.asiainfo.crm.cm.exe.batch.service.impl;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.bp.BpFrameWork;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.exe.batch.service.interfaces.ICmGroupManagerBatchSV;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustManagerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmGroupManagerBatchSVImpl implements ICmGroupManagerBatchSV {

	public void addGroupManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICmCommonSV commonSV = CmServiceFactory.getCommonSV();
		IVOCustValue custValue = new VOCustBean();
		ICustManagerValue custManagerValue = new CustManagerBean();
		for (int i = 0; i < colValues.length; i++) {
			// TODO 异常信息
			if (StringUtils.isBlank(colValues[i])) {
				if (ICustManagerValue.S_CustId.equals(colNames[i])) {

				} else if (ICustManagerValue.S_ManagerId.equals(colNames[i])) {

				} else if (ICustManagerValue.S_Remarks.equals(colNames[i])) {

				}
			} else {
				if (ICustManagerValue.S_CustId.equals(colNames[i])) {
					long custId = Long.valueOf(colValues[i]);
					ICustManagerValue[] custManagerValues = customerSV.queryCustManagersByCustId(custId, -1, -1);
					if (custManagerValues != null && custManagerValues.length > 0) {
						if (custManagerValues.length > 1) {
							// 数据出错，客户经理和集团客户关系不唯一
							ExceptionUtil.throwBusinessException("CMS0030228");
						} else {
							custManagerValues[0].setState(CmConstants.RecordState.ERASE);
							custManagerValues[0].setExpireDate(commonSV.getSysDate());
							custValue.addCustManager(custManagerValues[0]);
						}
					}
					custManagerValue.setCustId(custId);
				} else if (ICustManagerValue.S_ManagerId.equals(colNames[i])) {
					custManagerValue.setManagerId(Long.valueOf(colValues[i]));
				} else if (ICustManagerValue.S_Remarks.equals(colNames[i])) {
					custManagerValue.setRemarks(colValues[i]);
				}
			}
		}
		custValue.addCustManager(custManagerValue);
		customerSV.saveCustomer(custValue);
	}

	public void delGroupManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		ICmCommonSV commonSV = CmServiceFactory.getCommonSV();
		IVOCustValue custValue = new VOCustBean();
		ICustManagerValue[] custManagerValues = null;
		for (int i = 0; i < colValues.length; i++) {
			// TODO 异常信息
			if (StringUtils.isBlank(colValues[i])) {
				if (ICustManagerValue.S_CustId.equals(colNames[i])) {

				} else if (ICustManagerValue.S_Remarks.equals(colNames[i])) {

				}
			} else {
				if (ICustManagerValue.S_CustId.equals(colNames[i])) {
					long custId = Long.valueOf(colValues[i]);
					custManagerValues = customerSV.queryCustManagersByCustId(custId, -1, -1);
					if (custManagerValues != null && custManagerValues.length > 0) {
						if (custManagerValues.length > 1) {
							// 数据出错，客户经理和集团客户关系不唯一
							ExceptionUtil.throwBusinessException("CMS0030228");
						} else {
							custManagerValues[0].setState(CmConstants.RecordState.ERASE);
							custManagerValues[0].setExpireDate(commonSV.getSysDate());
							custValue.addCustManager(custManagerValues[0]);
						}
					}
				} else if (ICustManagerValue.S_Remarks.equals(colNames[i])) {
					if(null!=custManagerValues){
						custManagerValues[0].setRemarks(colValues[i]);
					}
				}
			}
		}
		customerSV.saveCustomer(custValue);
	}

	public static void main(String[] args) throws Exception {
		// 上传
//		BpFrameWork.main(new String[] { "-ftp", "CM_GROUP_MANGER_DEL" });
		// 解析
		 BpFrameWork.main(new String[]{"-dispatcher","CM_GROUP_MANGER_DEL:210:1:0"});
	}
}
