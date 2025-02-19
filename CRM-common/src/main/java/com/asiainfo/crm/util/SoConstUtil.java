/**
 * 
 */
package com.asiainfo.crm.util;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.bce.util.BceUtil;
import com.ai.bce.util.LocaleResourceFactory;
import com.ai.common.cache.BsParaDetailCacheImpl;
import com.ai.common.cache.StaticDataCacheImpl;
import com.ai.common.ivalues.IBOBsDistrictValue;
import com.ai.common.ivalues.IBOBsParaDetailValue;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.provider.ProviderLoader;
import com.ai.common.util.DistrictUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.secframe.client.OrgmodelClient;
import com.ailk.common.bo.BsCurrencyMeasure;
import com.ailk.common.bo.BsTenant;
import com.ailk.common.cache.BsCurrencyMeasureCacheImpl;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.asiainfo.crm.constant.CmxInterConstants;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: SoConstUtil.java
 * @Description: 静态数据访问
 *
 * @version: v1.0.0
 * @author: ChenRF
 * @date: 2011-1-18 下午05:52:00 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2011-1-18     ChenRF           v1.0.0               修改原因
 */
public class SoConstUtil {
	public static transient final Log log = LogFactory
			.getLog(SoConstUtil.class);
	/**
	 * 
	* @Function: SoConstUtil.java
	* @Description: 根据关键字查询静态变量值
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: Flavian
	* @date: 2011-1-18 下午05:31:55 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2011-1-18     Flavian           v1.0.0               修改原因
	 */
	public static String getSoConstInfo(String constKey) throws Exception {
		
		String retValue = "";
		
		if (StringUtils.isNotBlank(constKey)) {
			try {
				
				IBOBsStaticDataValue iBOBsStaticDataValue = null;
				
				iBOBsStaticDataValue = (IBOBsStaticDataValue) CacheFactory.get(StaticDataCacheImpl.class, "SO_BBOSS_CONST" + "^"  + constKey);
				
				if( iBOBsStaticDataValue != null)
					retValue = iBOBsStaticDataValue.getCodeName();
				else
					throw new Exception(LocaleResourceFactory.getResource("SOS3050768",new String[]{constKey}));
			} catch (Exception e) {
				log.error("ERROR",e);
				throw new Exception(e.getMessage());
			}
		} else {
			throw new Exception(LocaleResourceFactory.getResource("SOS3050769"));
		}
		
		return retValue;
		
	}
	/**
	 * 判断有没录有此记
	 * @param constKey
	 * @param value
	 * @return
	 * @throws Exception
	 */
	/**
	* 
	* @Function: confirmWorkSheet
	* @Description: 判断有没此记录
	*
	* @param: java.util.String:constKey,java.util.String:value
	* @return boolean
	* @throws：抛出Exception
	*
	* @version: v1.0.0
	* @author: xuzhizheng
	* @date: Mar 26, 2011 15:39:36 PM
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 26, 2011     xuzhizheng           v1.0.0               修改原因
	*/
	public static boolean isContainKey(String constKey,String value)throws Exception
	{
		if((null==value)||("".equals(value))) return false; 
		String retValues=getSoConstInfo(constKey);
		String[] retArrays=retValues.split("@");
		String temp;
		for(int i=0;i<retArrays.length;i++)
		{
			temp=retArrays[i];
			if(null==temp)temp="";
			if(value.equals(temp.trim()))return true;
		}
		return false;
		
	}
	
	/**
	 * 
	 * @Description: 根据CodeType从BsStaticData表获取静态数据字典
	 *
	 * @param: CodeType 编码类型
	 * @return： IBOBsStaticDataValue[]
	 * @throws： Exception
	 *
	 * @version: v1.0.0
	 * @author: yangcy3@asiainfo-linkage.com
	 * @date: Mar 28, 2011 1:10:22 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 28, 2011     yangchunyi       v1.0.0               修改原因
	 */
	public static IBOBsStaticDataValue[] getBsStaticDataByCodeType(String CodeType)throws Exception{
		if(null==CodeType || "".equals(CodeType)){
			return null;
		}
		return StaticDataUtil.getStaticData(CodeType);
	}
	
	/**
	 * 
	 * @Description: 根据CodeType和CodeValue 从BsStaticData表获取静态数据值名称
	 *
	 * @param: String CodeType 编码类型 
	 * @param: String CodeValue 编码值
	 * @return： IBOBsStaticDataValue
	 * @throws： Exception
	 *
	 * @version: v1.0.0
	 * @author: yangcy3@asiainfo-linkage.com
	 * @date: Mar 28, 2011 1:10:22 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 28, 2011     yangchunyi       v1.0.0               修改原因
	 */
	public static IBOBsStaticDataValue getBsStaticValueByCodeTypeCodeValue(String CodeType,String CodeValue)throws Exception{
		IBOBsStaticDataValue staticDataValue = null;
		if(null==CodeType || "".equals(CodeType)){
			return staticDataValue;
		}
		if(null==CodeValue || "".equals(CodeValue)){
			return staticDataValue;
		}
		IBOBsStaticDataValue[] staticDatas = getBsStaticDataByCodeType(CodeType);
		if(null!=staticDatas && staticDatas.length>0){
			for(int i=0;i<staticDatas.length;i++){
				if(staticDatas[i].getCodeValue().equals(CodeValue)){
					staticDataValue = staticDatas[i];
					break;
				}
			}
		}
		return staticDataValue;
	}
	
	public static String getBsStaticValue(String CodeType,String CodeValue)throws Exception{
		if(null==CodeType || "".equals(CodeType)){
			return "";
		}
		if(null==CodeValue || "".equals(CodeValue)){
			return "";
		}
		IBOBsStaticDataValue[] staticDatas = getBsStaticDataByCodeType(CodeType);
		if(null!=staticDatas && staticDatas.length>0){
			for(int i=0;i<staticDatas.length;i++){
				if(staticDatas[i].getCodeValue().equals(CodeValue)){
					return staticDatas[i].getCodeName();
				}
			}
		}
		return "";
	}

    /**
     * 从缓存中获取BS_PARA_DETAIL表的数据
     * @param regionId
     * @param paraType
     * @param paraCode
     * @return
     * @throws Exception
     */
    public static IBOBsParaDetailValue[] getParaDetailValues(String regionId, String paraType, String paraCode) throws Exception {
        List tmpList = new ArrayList();
        IBOBsParaDetailValue[] retValues = null;
        if (StringUtils.isNotBlank(regionId) && StringUtils.isNotBlank(paraType) && StringUtils.isNotBlank(paraCode)) {
            String cacheKey = "Sp_" + regionId + "_" + paraCode + "_" + paraType;
            tmpList = (ArrayList) CacheFactory.get(BsParaDetailCacheImpl.class, cacheKey);
        }
        if (tmpList != null && !tmpList.isEmpty()) {
            retValues = (IBOBsParaDetailValue[]) tmpList.toArray(new IBOBsParaDetailValue[]{});
        }
        return retValues;
    }
    
    
    /**
     * 检查地市是否已经割接
     * @param regionId 地市Id
     * @return
     * 返回值描述：true  表示已割接 
     * 			  false 表示未割接
     * @throws Exception 
     */
    public static boolean  checkRegion(String regionId) throws Exception{
//    	if (log.isDebugEnabled()) {
//			log.debug("当前检查地市编码为："+regionId);
//		}
    	IBOBsDistrictValue IBOBsDistrictValue = DistrictUtil.getDistrictByRegionId(regionId);
		int flag = IBOBsDistrictValue!=null?IBOBsDistrictValue.getCourseFlag():0;
		if(flag!=1){
//			if (log.isErrorEnabled()) {
//				log.error("地市："+regionId+",未进行数据割接，请检查...");
//			}
			return false;
		}
//	 	if (log.isDebugEnabled()) {
//			log.debug("当前检查地市编码为："+regionId +"为已割接地市");
//		}
		return true;
    } 
    
    /**
     * 获取所有割接地市刘表
     * @return String[] 返回是一个割接地市的数组,值是地市ID 
     * @throws Exception
     */
    public static String[] getCourseRegion() throws Exception{
    	IBOBsDistrictValue[] regions  = DistrictUtil.getRegion();
    	List regionList  = new LinkedList();
//    	if (log.isDebugEnabled()) {
//			log.debug("获取所有地市，地市个数为："+regions.length);
//		}
    	for (int i = 0; i < regions.length; i++) {
    		IBOBsDistrictValue IBOBsDistrictValue= regions[i];
    		int flag = IBOBsDistrictValue!=null?IBOBsDistrictValue.getCourseFlag():0;
    		if(flag == 1){
    			regionList.add(IBOBsDistrictValue.getRegionId());
    		}
		}
    	String[] courseRegion = (String[]) regionList.toArray(new String[]{});
//    	if (log.isDebugEnabled()) {
//			log.debug("获取所有割接地市，地市为："+StringUtils.join(courseRegion,","));
//		}
    	return courseRegion;
    }
    
    //业务编码从缓存中获取BS_PARA_DETAIL表的数据
    public static long getParaDetailValue4BusiId(String paraCode) {
    	long busiId = 0L;
    	String regionId = CmxInterConstants.SO_BUSIID_CFG_REGID;
    	String paraType = CmxInterConstants.SO_BUSIID_CFG;
    	try {
    		IBOBsParaDetailValue pdv = BceUtil.getParaDetailValue(regionId, paraType, paraCode);
        	if (null != pdv && null != pdv.getPara1()) {
//        		if (null != pdv.getPara1()) {
        			busiId = Long.parseLong(pdv.getPara1());
//        		}
        	}
			
		} catch (Exception e) {
			//throw new Exception(e.getMessage());
			log.error(e.getMessage(), e);
		}
    	
		return busiId;
    }
    
    //策划编号从缓存中获取BS_PARA_DETAIL表的数据
    public static long getParaDetailValue4OfferId(String paraCode) {
    	long offerId = 0L;
    	String regionId = CmxInterConstants.SO_OFFERID_CFG_REGID;
    	String paraType = CmxInterConstants.SO_OFFERID_CFG;
    	try {
    		IBOBsParaDetailValue pdv = BceUtil.getParaDetailValue(regionId, paraType, paraCode);
        	if (null != pdv && null != pdv.getPara1()) {
//        		if (null != pdv.getPara1()) {
        			offerId = Long.parseLong(pdv.getPara1());
//        		}
        	}
			
		} catch (Exception e) {
			//throw new Exception(e.getMessage());
			log.error(e.getMessage(), e);
		}
    	
		return offerId;
    }
  //策划编号从缓存中获取BS_PARA_DETAIL表的数据
    public static long getParaDetailValue4ProdId(String paraCode) {
    	long offerId = 0L;
    	String regionId = CmxInterConstants.SO_OFFERID_CFG_REGID;
    	String paraType = CmxInterConstants.SO_PRODID_CFG;
    	try {
    		IBOBsParaDetailValue pdv = BceUtil.getParaDetailValue(regionId, paraType, paraCode);
        	if (null != pdv && null != pdv.getPara1()) {
//        		if (null != pdv.getPara1()) {
        			offerId = Long.parseLong(pdv.getPara1());
//        		}
        	}
			
		} catch (Exception e) {
			//throw new Exception(e.getMessage());
			log.error(e.getMessage(), e);
		}
    	
		return offerId;
    }
    public static String getParaDetailValueByCondition(String paraCode) {
    	String para1 = "";
    	String regionId = CmxInterConstants.SO_BUSIID_CFG_REGID;
    	String paraType = CmxInterConstants.SO_BUSIID_CFG;
    	try {
    		IBOBsParaDetailValue pdv = BceUtil.getParaDetailValue(regionId, paraType, paraCode);
        	if (null != pdv) {
    			para1 = pdv.getPara1();
        	}
		} catch (Exception e) {
			//throw new Exception(e.getMessage());
			log.error(e.getMessage(), e);
		}
    	
		return para1;
    }
    
	public static String getChannelType(){
    	String channelType = "";
    	if (SessionManager.getUser()!=null) {
    		channelType = SessionManager.getUser().get(CmxInterConstants.PUBINFO_CHANNEL_TYPE).toString();
		}
	    return channelType;
	
	}
	
	public static String getChannelTypeById(long opId){
    	String channelType = "";
		try {
			channelType = OrgmodelClient.getChannelTypeByOperId(opId);
		} catch (Exception e) {
			log.debug("=====Incorrect ChannelType===========");
		}
	    	return channelType;
	}
	
	public static boolean isBackInter(){
		boolean flag = false;
		UserInfoInterface userinfo = SessionManager.getUser();
		if (userinfo!=null && userinfo.get(CmxInterConstants.TASK_INTER_FLAG)!=null && "Y".equals(userinfo.get(CmxInterConstants.TASK_INTER_FLAG))) {
//			if (userinfo.get(CmxInterConstants.TASK_INTER_FLAG)!=null && "Y".equals(userinfo.get(CmxInterConstants.TASK_INTER_FLAG))) {
				flag = true;
//			}
		}
		return flag;
	}
	public static String getCurrentChannel(){
    	String channelType = "";
    	UserInfoInterface userinfo = SessionManager.getUser();
		if (userinfo!=null && userinfo.get(CmxInterConstants.PUBINFO_CHANNEL_TYPE)!=null) {
			if (userinfo.get(CmxInterConstants.PUBINFO_CHANNEL_TYPE)!=null) {
				channelType = String.valueOf(userinfo.get(CmxInterConstants.PUBINFO_CHANNEL_TYPE));
			}
		}
		return channelType;
	}
	
    public static String getChannelIdByChannelName(String paraCode) {
    	String channelId = "" ;
    	String paraType = CmxInterConstants.SO_CHANNEL_CFG;
    	try {
    		IBOBsParaDetailValue paraDetail = BceUtil.getParaDetailValue("X", paraType, paraCode);
        	if (null != paraDetail && null != paraDetail.getPara1()) {
//        		if (null != paraDetail.getPara1()) {
        			channelId = paraDetail.getPara1();
//        		}
        	}
			
		} catch (Exception e) {
			//throw new Exception(e.getMessage());
			log.error(e.getMessage(), e);
		}
		return channelId;
	}
    
    public static String getParaDetailValueByCondition4PushC(String paraCode) {
    	String para1 = "";
    	String regionId = CmxInterConstants.SO_PUSHC_CFG_REGID;
    	String paraType = CmxInterConstants.SO_PUSHC_CFG;
    	try {
    		IBOBsParaDetailValue pdv = BceUtil.getParaDetailValue(regionId, paraType, paraCode);
        	if (null != pdv) {
    			para1 = pdv.getPara1();
        	}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return para1;
    }
    
    public static String getParaDetailValueByCondition4AppleDep(String paraCode) {
    	String para1 = "";
    	String regionId = CmxInterConstants.SO_PUSHC_CFG_REGID;
    	String paraType = CmxInterConstants.AppleDep.FREAURE_VALUE_APPLE_DEP;
    	try {
    		IBOBsParaDetailValue pdv = BceUtil.getParaDetailValue(regionId, paraType, paraCode);
        	if (null != pdv) {
    			para1 = pdv.getPara1();
        	}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return para1;
    }
    
    public static String getParaDetailValueByCondition(String paraType,String paraCode) {
    	String para1 = "";
    	String regionId = CmxInterConstants.SO_BUSIID_CFG_REGID;
    	try {
    		IBOBsParaDetailValue pdv = BceUtil.getParaDetailValue(regionId, paraType, paraCode);
        	if (null != pdv) {
    			para1 = pdv.getPara1();
        	}
		} catch (Exception e) {
			//throw new Exception(e.getMessage());
			log.error(e.getMessage(), e);
		}
    	
		return para1;
    }
	public static String  getRandomString(int i_count){
		Random random = new Random();
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < i_count; i++) {
			sBuffer.append(String.valueOf(random.nextInt(10)));
		}
		return sBuffer.toString();
	}

	/**
	 * 获取货币存储与界面显示之间的换算比例
	 *
	 *@Function:getCurrencyScalingRatio
	 *@Description:
	 *
	 *@return
	 *@throws Exception
	 *
	 *@version: v1.0.0
	 *@author: duysheng
	 *@date: 2015-4-26 下午7:49:46
	 *
	 */
	public static float getCurrencyScalingRatio() throws Exception {
		DecimalFormat integerFormatter = new DecimalFormat("#");
		integerFormatter.setGroupingUsed(false);
		integerFormatter.setParseIntegerOnly(true);

		float scalingRatio = 100;
		IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData("CURRENCY_TYPE_TO_COUNT_" + integerFormatter.format(getCurrentTenantCurrencyTypeId()));
		if (!ArrayUtils.isEmpty(values)) {
			try {
				scalingRatio = Float.parseFloat(values[0].getCodeValue());
			} catch (Exception e) {
				log.error("Integer.parseInt(" + values[0].getCodeValue() + ")" + " error:" + e.getMessage());
			}
		}
		return scalingRatio;
	}

	/**
	 * 获取当前租户的货币类型Id
	 *
	 *@Function:getCurrentTenantCurrencyTypeId
	 *@Description:
	 *
	 *@return
	 *@throws Exception
	 *
	 *@version: v1.0.0
	 *@author: duysheng
	 *@date: 2015-4-26 下午7:31:52
	 *
	 */
	public static long getCurrentTenantCurrencyTypeId() throws Exception {
		BsTenant bsTenant = ProviderLoader.getTenantUtilInstance().getBsTenantByTenantId(TenantIDFactory.getTenantId());
		if (null == bsTenant)
			throw new Exception("tenant(id:" + TenantIDFactory.getTenantId() + ") is not found.");

		BsCurrencyMeasure bsCrCurrencyMeasure = (BsCurrencyMeasure)CacheFactory.get(BsCurrencyMeasureCacheImpl.class, String.valueOf(bsTenant.getCurrencyId()));
		if (null == bsCrCurrencyMeasure || null == bsCrCurrencyMeasure.getCurrencyType()) {
			log.warn("get currency measure return null(tenantId:" + bsTenant.getTenantId() + ", currencyId:" + bsTenant.getCurrencyId() + ").");
			return 11402;
		}

		return bsCrCurrencyMeasure.getCurrencyType().getCurrencyTypeId();
	}
}
