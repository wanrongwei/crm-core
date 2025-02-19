/**
 * 
 */
package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.bo.ClubServiceCylceBean;
import com.asiainfo.crm.cm.model.bo.ClubServiceRecBean;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceCylceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceValue;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceDimensionValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubServiceValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-12 下午11:31:46
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-12     huzq2           v1.0.0               修改原因<br>
 */
public class VOClubServiceBean extends ValueObjectBean implements IVOClubServiceValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3401803040720481879L;
	private IClubServiceValue serviceValue = null;
	private IClubValue clubValue = null;
	private List<IClubServiceCylceValue> serviceCylceValues = new ArrayList<IClubServiceCylceValue>();
	private List<IClubServiceRecValue> serviceRecValues = new ArrayList<IClubServiceRecValue>();
	private List<IVOClubServiceDimensionValue> dimensionValues = new ArrayList<IVOClubServiceDimensionValue>();

	public long getClubId() {
		if (this.serviceValue != null) {
			return this.serviceValue.getClubId();
		}
		return 0;
	}

	public long getClubServiceId() {
		if (this.serviceValue != null) {
			return this.serviceValue.getServiceId();
		}
		return 0;
	}

	public IClubValue getClub() throws Exception {
		return this.clubValue;
	}

	public long setClub(IClubValue clubValue) throws Exception {
		if (clubValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.clubValue = clubValue;
		return clubValue.getClubId();
	}

	public IClubServiceValue getClubService() throws Exception {
		return this.serviceValue;
	}

	public long setClubService(IClubServiceValue serviceValue) throws Exception {
		this.serviceValue = serviceValue;
		if (this.serviceValue != null) {
			return this.serviceValue.getServiceId();
		}
		return -1;
	}

	public IClubServiceCylceValue[] getClubServiceCylces() throws Exception {
		return this.serviceCylceValues.toArray(new ClubServiceCylceBean[0]);
	}

	public IClubServiceCylceValue removeClubServiceCylce(IClubServiceCylceValue cylceValue) throws Exception {
		if (cylceValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.serviceCylceValues.remove(cylceValue);
		return cylceValue;
	}

	public long setClubServiceCycle(IClubServiceCylceValue cylceValue) throws Exception {
		if (cylceValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.serviceCylceValues.add(cylceValue);
		return cylceValue.getCycleId();
	}

	public IClubServiceRecValue[] getClubServiceRecs() throws Exception {
		return this.serviceRecValues.toArray(new ClubServiceRecBean[0]);
	}

	public IClubServiceRecValue removeClubServiceRec(IClubServiceRecValue serviceRecValue) throws Exception {
		if (serviceRecValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.serviceRecValues.remove(serviceRecValue);
		return serviceRecValue;
	}

	public long setClubServiceRec(IClubServiceRecValue serviceRecValue) throws Exception {
		if (serviceRecValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.serviceRecValues.add(serviceRecValue);
		return serviceRecValue.getRecordId();
	}

	public IVOClubServiceDimensionValue[] getClubServiceDimensions() throws Exception {
		return this.dimensionValues.toArray(new VOClubServiceDimensionBean[0]);
	}

	public long setClubServiceDimension(IVOClubServiceDimensionValue dimensionValue) throws Exception {
		if (dimensionValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.dimensionValues.add(dimensionValue);
		return dimensionValue.getDimensionId();
	}

	public IVOClubServiceDimensionValue removeClubServiceDimension(IVOClubServiceDimensionValue dimensionValue) throws Exception {
		if (dimensionValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.dimensionValues.remove(dimensionValue);
		return dimensionValue;
	}

	public boolean hasClubServiceCycle() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.serviceCylceValues);
	}

	public boolean hasClubServiceDimension() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.dimensionValues);
	}

	public boolean hasClubServiceRec() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.serviceRecValues);
	}

	public long getId() {
		return getClubServiceId();
	}
}
