package com.asiainfo.crm.common.util;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.crm.cm.common.cache.CmIndustryCacheImpl;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmIndustryConfigValue;
import com.asiainfo.crm.common.cache.BsCommonDistrictCacheImpl;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName BsCommonDistrictUtil
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-5-7 下午5:06:21
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-5-7     huzq2           v1.0.0               修改原因<br>
 */
public class BsCommonDistrictUtil {

	private transient static Log log = LogFactory.getLog(BsCommonDistrictUtil.class);

	/**   
	 * 根据行政区域编号获取对应的行政区域信息
	 * @Function getCommonDistrictValue
	 * @Description 
	 *
	 * @param districtId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-7 下午5:35:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOBsCommonDistrictValue getCommonDistrictById(long districtId) throws Exception {
		return (IBOBsCommonDistrictValue) CacheFactory.get(BsCommonDistrictCacheImpl.class, BsCommonDistrictCacheImpl.IDX_BY_ID_KEY + BsCommonDistrictCacheImpl.SPLIT_CODE
				+ districtId);
	}

	/**   
	 * 根据行政区域编码+行政区域类型获取对应的行政区域信息
	 * @Function getCommonDistrictByCode
	 * @Description 
	 *
	 * @param districtCode
	 * @param districtType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-7 下午5:38:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOBsCommonDistrictValue getCommonDistrictByCode(String districtCode, int districtType) throws Exception {
		return (IBOBsCommonDistrictValue) CacheFactory.get(BsCommonDistrictCacheImpl.class, BsCommonDistrictCacheImpl.IDX_BY_CODE_KEY + BsCommonDistrictCacheImpl.SPLIT_CODE
				+ districtCode + BsCommonDistrictCacheImpl.SPLIT_CODE + districtType);
	}

	/**   
	 * 根据父级行政区域编号获取其子行政区域信息
	 * @Function getCommonDistrictsByParentId
	 * @Description 
	 *
	 * @param parentDistrictId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-7 下午6:50:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOBsCommonDistrictValue[] getCommonDistrictsByParentId(long parentDistrictId) throws Exception {
		List list = (List) CacheFactory.get(BsCommonDistrictCacheImpl.class, BsCommonDistrictCacheImpl.IDX_BY_PARENT_ID_KEY + BsCommonDistrictCacheImpl.SPLIT_CODE
				+ parentDistrictId);
		if (list != null) {
			return (IBOBsCommonDistrictValue[]) list.toArray(new IBOBsCommonDistrictValue[0]);
		}
		return new IBOBsCommonDistrictValue[0];
	}

	/**   
	 * 根据父级行政区域编码和父级行政区域类型获取其子行政区域信息
	 * @Function getCommonDistrictsByParentCode
	 * @Description 
	 *
	 * @param parentCode
	 * @param parentType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-7 下午6:53:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOBsCommonDistrictValue[] getCommonDistrictsByParentCode(String parentCode, int parentType) throws Exception {
		List list = (List) CacheFactory.get(BsCommonDistrictCacheImpl.class, BsCommonDistrictCacheImpl.IDX_BY_PARENT_CODE_KEY + BsCommonDistrictCacheImpl.SPLIT_CODE + parentCode
				+ BsCommonDistrictCacheImpl.SPLIT_CODE + parentType);
		if (list != null) {
			String districtId = "";
//			if(CmCommonUtil.isEmptyObj(SessionManager.getUser().get("DISTRICT_ID"))){
//				log.error("DISTRICT_ID====" + SessionManager.getUser().get("DISTRICT_ID"));
//			} else {
//				districtId = (String)SessionManager.getUser().get("DISTRICT_ID");
//			}			
			String operRegion = "";
			if(CmCommonUtil.isEmptyObj(districtId)){				
				operRegion = "9999";
			} else {
				operRegion = getCommonDistrictById(Long.parseLong(districtId)).getDistrictCode();
			}			
			if(StringUtils.isNotBlank(operRegion)) {
				List tmpList = null;
				for(int i=0,size=list.size(); i<size; i++) {
					IBOBsCommonDistrictValue tmpValue = (IBOBsCommonDistrictValue)list.get(i);
					if(operRegion.equals(tmpValue.getDistrictCode())) {
						return new IBOBsCommonDistrictValue[]{tmpValue};
					}
				}
			}
			return (IBOBsCommonDistrictValue[]) list.toArray(new IBOBsCommonDistrictValue[0]);
		}
		return new IBOBsCommonDistrictValue[0];
	}

	/**   
	 * 获取所有城市信息
	 * @Function getAllCityDistricts
	 * @Description 
	 *
	 * @param parentCode
	 * @param parentType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author liyy9
	 * @date 2012-5-7 下午6:53:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7     liyy9           v1.0.0               修改原因<br>
	 */
	public static IBOBsCommonDistrictValue[] getAllCityDistricts() throws Exception {
		List list = (List) CacheFactory.get(BsCommonDistrictCacheImpl.class, BsCommonDistrictCacheImpl.IDX_BY_CITY_KEY + BsCommonDistrictCacheImpl.SPLIT_CODE + 3);
		if (list != null) {
			return (IBOBsCommonDistrictValue[]) list.toArray(new IBOBsCommonDistrictValue[0]);
		}
		return new IBOBsCommonDistrictValue[0];
	}

	/**   
	 * 获取所有国家信息
	 * @Function getAllCountryDistricts
	 * @Description 
	 *
	 * @param parentCode
	 * @param parentType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author liyy9
	 * @date 2012-5-7 下午6:53:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7     liyy9           v1.0.0               修改原因<br>
	 */
	public static IBOBsCommonDistrictValue[] getAllCountryDistricts() throws Exception {
		List list = (List) CacheFactory.get(BsCommonDistrictCacheImpl.class, BsCommonDistrictCacheImpl.IDX_BY_COUNTRY_KEY + BsCommonDistrictCacheImpl.SPLIT_CODE + 1);
		if (list != null) {
			return (IBOBsCommonDistrictValue[]) list.toArray(new IBOBsCommonDistrictValue[0]);
		}
		return new IBOBsCommonDistrictValue[0];
	}

	/**   
	 * 获取所有省份信息
	 * @Function getAllProveDistricts
	 * @Description 
	 *
	 * @param parentCode
	 * @param parentType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author liyy9
	 * @date 2012-5-7 下午6:53:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7     liyy9           v1.0.0               修改原因<br>
	 */
	public static IBOBsCommonDistrictValue[] getAllProveDistricts() throws Exception {
		List list = (List) CacheFactory.get(BsCommonDistrictCacheImpl.class, BsCommonDistrictCacheImpl.IDX_BY_PROV_KEY + BsCommonDistrictCacheImpl.SPLIT_CODE + 2);
		if (list != null) {
			return (IBOBsCommonDistrictValue[]) list.toArray(new IBOBsCommonDistrictValue[0]);
		}
		return new IBOBsCommonDistrictValue[0];
	}
	
	/**   
	 * 根据行业父类型存放对应的行业类别
	 * @Function getIndustryByParentId
	 * @Description 
	 *
	 * @param parentCode
	 * @param level
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-9-3 下午6:53:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-3     zhuyy           v1.0.0               修改原因<br>
	 */
	@SuppressWarnings("unchecked")
	public static IBOCmIndustryConfigValue[] getIndustryByParentId(String parentId, int level) throws Exception {
		List list = (List) CacheFactory.get(CmIndustryCacheImpl.class, CmIndustryCacheImpl.IDX_BY_LEVEL_PARENT + CmIndustryCacheImpl.SPLIT_CODE + level + CmIndustryCacheImpl.SPLIT_CODE + parentId);
		if (list != null) {
			return (IBOCmIndustryConfigValue[]) list.toArray(new IBOCmIndustryConfigValue[0]);
		}
		return new IBOCmIndustryConfigValue[0];
	}
}
