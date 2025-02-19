package com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.impl;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.CenterUtil;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsSrvAttrValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.service.interfaces.IInstanceQrySV;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.omframe.util.SoServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces.ISo2CustGroupSV;
import com.asiainfo.crm.cm.custgroup.utils.InnerServiceFactory;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumUsedValue;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdCustValidAmountValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrm4CustGroupSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class So2CustGroupSVImpl implements ISo2CustGroupSV {
	
	public IInsSrvAttrValue[] getInstSrvAttrByConditions(long userId,long attrId,String attrValue,long offerInsId,String regionId)throws Exception{
		return SoServiceFactory.getInstanceQrySV().getInstSrvAttrByConditions(userId,attrId,attrValue, offerInsId,OrderConst.VALID_TYPE_ALL,regionId);
	}
	
	/**
	 * 根据号码（主号/副号）查询有效用户
	 */
	public IInsUserValue getActiveUserByBillId(String billId) throws Exception {
		ICrmFSV crmSV = (ICrmFSV) ServiceFactory.getCrossCenterService(ICrmFSV.class);
		String regionId = CenterUtil.getRegionIdByBillId(billId);
		if ( StringUtils.isNotBlank(regionId) ){
			// 主号
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, regionId);

			IInsUserValue insUser = crmSV.getUserInfoByBillId(billId);
			if(insUser != null){
				return insUser;
			}
		}else{
			// 副号
			// 查询号码已用表  找到号码被用的客户
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, "2100");
			IBOResPhoneNumUsedValue usedPhone = InnerServiceFactory.getResourceSV().queryUsedNums(billId);
			if ( usedPhone!=null && StringUtils.isNotBlank(usedPhone.getReceiver()) ){
				// 根据客户  找寻 客户下 的用户实例 
				long custId = Long.valueOf(usedPhone.getReceiver());
				IBOCmInsCmrelValue[] cmInsCmRels = InnerServiceFactory.getCustomerSV().getCmInsCmrel(custId);
				// 遍历客户下的用户实例， 找寻副号 号码
				for (int i=0; cmInsCmRels!=null && i<cmInsCmRels.length; i++ ){
					String tempRegionId = cmInsCmRels[i].getUserRegionCode();
					long tempUserId = cmInsCmRels[i].getUserId();
					
					CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, tempRegionId);
					IInsSrvAttrValue[] srvAttrs = getInstSrvAttrByConditions(tempUserId, RBossConst.PROD_ATTR_ID_MULTI_NUM_ATTR1, billId, -1, tempRegionId);
					if ( srvAttrs==null || srvAttrs.length<=0 ){
						srvAttrs = getInstSrvAttrByConditions(tempUserId, RBossConst.PROD_ATTR_ID_MULTI_NUM_ATTR2, billId, -1, tempRegionId);
					}
					if ( srvAttrs==null || srvAttrs.length<=0 ){
						srvAttrs = getInstSrvAttrByConditions(tempUserId, RBossConst.PROD_ATTR_ID_MULTI_NUM_ATTR3, billId, -1, tempRegionId);
					}
					if ( srvAttrs==null || srvAttrs.length<=0 ){
						srvAttrs = getInstSrvAttrByConditions(tempUserId, RBossConst.PROD_ATTR_ID_MULTI_NUM_ATTR4, billId, -1, tempRegionId);
					}
					// 找到副号  返回 副号 对应的 用户数据
					if ( srvAttrs!=null && srvAttrs.length>0 ){
						IInsUserValue insUser = crmSV.getUserByUserId(tempUserId);
						if(insUser != null){
							return insUser;
						}
					}
				}
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		ISo2CustGroupSV sv = (ISo2CustGroupSV) ServiceFactory.getCrossCenterService(ISo2CustGroupSV.class);
		IInsUserValue a = sv.getActiveUserByBillId("71147575");
		System.out.println("1111");
	}
	
	/**
	 * 查询用户的main offer type
	 */
	public String getUserMainOfferType(long userId) throws Exception {
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.USER_ID,String.valueOf(userId));
        IInstanceQrySV insQrySV = (IInstanceQrySV)ServiceFactory.getCrossCenterService(IInstanceQrySV.class);
		// 主号
		IInsOfferValue[] aInsOfferValues = insQrySV.getInsOfferByUserId(userId,"", OrderConst.VALID_TYPE_ALL);

		if(aInsOfferValues != null){
			for(IInsOfferValue aInsOfferValue:aInsOfferValues){
				String offerType = aInsOfferValue.getOfferType();
				if(offerType.startsWith("OFFER_PLAN_")){
					return offerType;
				}
			}
		}
		return "";
	}

	/**
	 * 查询订购数
	 * @param custId
	 * @param custGroupType
	 * @param offerGroupType
	 * @param offerGroupId
	 * @return
	 * @throws Exception
	 */
	public IBOOrdCustValidAmountValue[] queryOrdCustValidAmounts(long custId, long custGroupType, String offerGroupType, String offerGroupId) throws Exception {
		ICrm4CustGroupSV crm4CustGroupSV = (ICrm4CustGroupSV) ServiceFactory.getService(ICrm4CustGroupSV.class);
		return crm4CustGroupSV.queryOrdCustValidAmounts(custId, custGroupType, offerGroupType, offerGroupId);
	}
}
