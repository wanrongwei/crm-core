package com.asiainfo.crm.cm.common.util;

import java.util.ArrayList;
import java.util.List;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.cache.CmCustContMedTypeCacheImpl;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContMedTypeBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContMedTypeValue;

public class CmCustContMedTypeUtil {

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo
	 * 
	 * @ClassName 
	 * @Description 根据父节点和useType来查询联系媒介
	 * useType：
	 * 0：客户	CmConstants.ContMedium.CUSTOMER_MED_TYPE
	 * 1：联系人	CmConstants.ContMedium.CONTACT_MED_TYPE
	 * 2：偏好媒介	CmConstants.ContMedium.PREFERENCE_MED_TYPE
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-7-14 上午11:34:25
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-7-14     huangqun           v1.0.0               修改原因<br>
	 */
	public static IBOCmCustContMedTypeValue[] getCmCustContMedType(int upContMedTypeId, int useType) throws Exception {
		List<IBOCmCustContMedTypeValue> realAddressList = (List<IBOCmCustContMedTypeValue>) CacheFactory.get(CmCustContMedTypeCacheImpl.class, String.valueOf(upContMedTypeId)
				+ "_" + String.valueOf(useType));
		List<IBOCmCustContMedTypeValue> addressList = null;
		IBOCmCustContMedTypeValue[] reqDatas = null;
		String contMedTypeName = null;
		if (upContMedTypeId == CmConstants.ContMedium.CONT_NUMBER || upContMedTypeId == CmConstants.ContMedium.ELECTRON_ADDR) {// 电子地址
			addressList = new ArrayList<IBOCmCustContMedTypeValue>();
			if (upContMedTypeId == CmConstants.ContMedium.CONT_NUMBER) {
				List<IBOCmCustContMedTypeValue> elecAddressList = (List<IBOCmCustContMedTypeValue>) CacheFactory.get(CmCustContMedTypeCacheImpl.class,
						String.valueOf(CmConstants.ContMedium.ELECTRON_ADDR) + "_" + String.valueOf(useType));
				addressList.addAll(elecAddressList);
			}
			addressList.addAll(realAddressList);
			IBOCmCustContMedTypeValue[] values = (IBOCmCustContMedTypeValue[]) addressList.toArray(new BOCmCustContMedTypeBean[0]);
			if (values != null && values.length > 0) {
				reqDatas = new IBOCmCustContMedTypeValue[values.length];
				for (int i = 0; i < values.length; i++) {
					reqDatas[i] = new BOCmCustContMedTypeBean();
					DataContainerFactory.copy(values[i], reqDatas[i]);
					contMedTypeName = values[i].getContMedTypeName();
					if (contMedTypeName.startsWith("C")) {
						reqDatas[i].setContMedTypeName(CrmLocaleFactory.getResource(contMedTypeName));
					}
				}
			}
			return reqDatas;
		} else if (upContMedTypeId == CmConstants.ContMedium.ENTITY_ADDR) {// 实体地址
			addressList = new ArrayList();
			addressList.addAll(realAddressList);
			IBOCmCustContMedTypeValue[] values = (IBOCmCustContMedTypeValue[]) addressList.toArray(new BOCmCustContMedTypeBean[0]);
			if (values != null && values.length > 0) {
				reqDatas = new IBOCmCustContMedTypeValue[values.length];
				for (int i = 0; i < values.length; i++) {
					reqDatas[i] = new BOCmCustContMedTypeBean();
					DataContainerFactory.copy(values[i], reqDatas[i]);
					contMedTypeName = values[i].getContMedTypeName();
					if (contMedTypeName.startsWith("C")) {
						reqDatas[i].setContMedTypeName(CrmLocaleFactory.getResource(contMedTypeName));
					}
				}
			}
			return reqDatas;
		}
		return new BOCmCustContMedTypeBean[0];
	}

}
