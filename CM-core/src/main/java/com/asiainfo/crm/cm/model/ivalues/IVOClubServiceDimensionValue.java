package com.asiainfo.crm.cm.model.ivalues;


public interface IVOClubServiceDimensionValue extends IValueObject {

	long getClubServiceId();

	long getDimensionId();

	IClubServiceVdoingValue getClubServiceVdoing() throws Exception;

	long setClubServiceVdoing(IClubServiceVdoingValue vdoingValue) throws Exception;

	IClubServiceVdoingDetailValue[] getClubServiceVdoingDetails() throws Exception;

	long setClubServiceVdoingDetail(IClubServiceVdoingDetailValue vdoingDetailValue) throws Exception;

	IClubServiceVdoingDetailValue removeClubServiceVdoingDetail(IClubServiceVdoingDetailValue vdoingDetailValue) throws Exception;

	boolean hasVdoingDetail() throws Exception;
}
