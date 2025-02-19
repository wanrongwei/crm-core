package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;

public class VOBusiLogBean extends ValueObjectBean implements IVOBusiLogValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 995462132778295531L;

	private ICmBusiLogValue mainBusiLogValue;

	private List busiLogList = new ArrayList();

	public ICmBusiLogValue getMainBusiLog() {
		return this.mainBusiLogValue;
	}

	public void setMainBusiLog(ICmBusiLogValue busiLogValue) {
		this.mainBusiLogValue = busiLogValue;
	}

	public ICmBusiLogValue[] getBusiLogDetails() {
		return (ICmBusiLogValue[]) busiLogList.toArray(new ICmBusiLogValue[0]);
	}

	public List getBusiLogDetailList() {
		return this.busiLogList;
	}

	public void addBusiLogDetail(ICmBusiLogValue busiLogValue) throws Exception {
		if (busiLogValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.busiLogList.add(busiLogValue);
	}

	public void addBusiLogDetails(ICmBusiLogValue[] busiLogValues) {
		if (busiLogValues != null && busiLogValues.length > 0) {
			this.busiLogList.addAll(Arrays.asList(busiLogValues));
		}
	}

	public boolean hasBusiLogDetails() {
		return CmCommonUtil.isNotEmptyObject(busiLogList);
	}

	public long getId() {
		if (CmCommonUtil.isNotEmptyObject(this.mainBusiLogValue)) {
			return this.mainBusiLogValue.getBusiLogId();
		}
		return -1;
	}

}
