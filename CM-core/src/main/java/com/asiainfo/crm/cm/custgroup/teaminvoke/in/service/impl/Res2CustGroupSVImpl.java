package com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.impl;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.bce.util.BceSVUtil;
import com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces.IRes2CustGroupSV;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumUsedValue;
import com.asiainfo.crm.res.phone.service.interfaces.IResPhoneNumFSV;

public class Res2CustGroupSVImpl implements IRes2CustGroupSV {
	/**
	 *	查询已有号码
	 * @param billId
	 * @return
	 * @throws Exception
	 */
	public IBOResPhoneNumUsedValue queryUsedNums(String billId) throws Exception {
		IBOResPhoneNumUsedValue resPhoneNumUsedValue = null;
		IResPhoneNumFSV resPhoneNumFSV = (IResPhoneNumFSV)BceSVUtil.getSVService(IResPhoneNumFSV.class);
		String regionId = CenterFactory.getCenterInfo().getRegion();
		IBOResPhoneNumUsedValue[] resPhoneNumUsedValues= resPhoneNumFSV.queryUsedNums (regionId, billId,-1,-1,null,-1,-1,-1,-1,-1,null);
		if(resPhoneNumUsedValues != null && resPhoneNumUsedValues.length > 0) {
			resPhoneNumUsedValue = resPhoneNumUsedValues[0];
		}
		return resPhoneNumUsedValue;
	}

}
