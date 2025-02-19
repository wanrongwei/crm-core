package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.bo.ClubServiceVdoingDetailBean;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingDetailValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceVdoingValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceDimensionValue;

public class VOClubServiceDimensionBean extends ValueObjectBean implements IVOClubServiceDimensionValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = -35387337930761790L;
	private IClubServiceVdoingValue vdoingValue = null;
	private List<IClubServiceVdoingDetailValue> vdoingDetailValues = new ArrayList<IClubServiceVdoingDetailValue>();
	public long getClubServiceId() {
		if (this.vdoingValue != null) {
			return this.vdoingValue.getServiceId();
		}
		return -1;
	}

	public long getDimensionId() {
		if (this.vdoingValue != null) {
			return this.vdoingValue.getDimensionId();
		}
		return -1;
	}

	public IClubServiceVdoingValue getClubServiceVdoing() throws Exception {
		return this.vdoingValue;
	}

	public long setClubServiceVdoing(IClubServiceVdoingValue vdoingValue) throws Exception {
		this.vdoingValue = vdoingValue;
		if (this.vdoingValue == null) {
			return -1;
		}
		return this.vdoingValue.getDimensionId();
	}

	public IClubServiceVdoingDetailValue[] getClubServiceVdoingDetails() throws Exception {
		return this.vdoingDetailValues.toArray(new ClubServiceVdoingDetailBean[0]);
	}

	public long setClubServiceVdoingDetail(IClubServiceVdoingDetailValue vdoingDetailValue) throws Exception {
		if (vdoingDetailValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.vdoingDetailValues.add(vdoingDetailValue);
		return vdoingDetailValue.getDetailId();
	}

	public IClubServiceVdoingDetailValue removeClubServiceVdoingDetail(IClubServiceVdoingDetailValue vdoingDetailValue) throws Exception {
		if (vdoingDetailValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.vdoingDetailValues.remove(vdoingDetailValue);
		return vdoingDetailValue;
	}

	public boolean hasVdoingDetail() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.vdoingDetailValues);
	}

	public long getId() {
		return getDimensionId();
	}
}
