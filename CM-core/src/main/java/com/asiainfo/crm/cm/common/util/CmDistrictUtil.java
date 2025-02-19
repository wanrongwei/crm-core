package com.asiainfo.crm.cm.common.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.SessionManager;
import com.ai.common.bo.BOBsDistrictBean;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsDistrictValue;
import com.ai.common.util.DistrictUtil;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 *
 * @ClassName: CmDistrictUtil.java
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 20, 2011 2:38:33 PM
 * <p/>
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* May 20, 2011 huzq2
 * v1.0.0 修改原因
 */

public class CmDistrictUtil {

	/**
	 * @param regionId
	 * @return IBOBsDistrictValue[]
	 * @throws Exception
	 * @throws java.rmi.RemoteException
	 * @Function: ICmDistrictSV.java
	 * @Description: 根据地市编号查询其下的区县信息.
	 * 该方法主要是对平台提供的com.ai.common.util.DistrictUtil.getCountyByRegionDistrictId(String
	 * districtId)的二次封装.
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Feb 15, 2011 7:47:36 PM
	 * <p/>
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Feb 15, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static IBOBsDistrictValue[] getCountyByRegionId(String regionId) throws Exception {
		IBOBsDistrictValue district = DistrictUtil.getDistrictByRegionId(regionId);
		if (district == null) {
			return new IBOBsDistrictValue[0];
		}
		IBOBsDistrictValue[] result = DistrictUtil.getCountyByRegionDistrictId(district.getDistrictId());
		return result;
	}

	/**
	 * @param regionId 地市编号
	 * @param isBlank  是否需要添加空白选项
	 * @return 区域信息列表
	 * @throws Exception
	 * @throws java.rmi.RemoteException
	 * @Function: getCountyByRegionId
	 * @Description: 获取县市信息列表【增加是否添加空白选项的功能】
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 2:39:52 PM
	 * <p/>
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* May 20, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static IBOBsDistrictValue[] getCountyByRegionId(String regionId, boolean isBlank) throws Exception {
		IBOBsDistrictValue district = DistrictUtil.getDistrictByRegionId(regionId);
		if (district == null) {
			IBOBsDistrictValue[] newResults = new BOBsDistrictBean[1];
			IBOBsDistrictValue districtBean = new BOBsDistrictBean();
			districtBean.setRegionId("-1");
			districtBean.setDistrictName(" ");
			newResults[0] = districtBean;
			return newResults;
		}
		IBOBsDistrictValue[] results = DistrictUtil.getCountyByRegionDistrictId(district.getDistrictId());
		if (isBlank) {
			if (results == null) {
				IBOBsDistrictValue[] newResults = new BOBsDistrictBean[1];
				IBOBsDistrictValue districtBean = new BOBsDistrictBean();
				districtBean.setRegionId("-1");
				districtBean.setDistrictName(" ");
				newResults[0] = districtBean;
				return newResults;
			}
			IBOBsDistrictValue[] newResults = new BOBsDistrictBean[results.length + 1];
			IBOBsDistrictValue districtBean = new BOBsDistrictBean();
			districtBean.setRegionId("-1");
			districtBean.setDistrictName(" ");
			newResults[0] = districtBean;
			for (int i = 1; i < results.length + 1; i++) {
				newResults[i] = results[i - 1];
			}
			return newResults;
		}
		return results;
	}

	/**
	 * @param regionId
	 * @param isBlank
	 * @return
	 * @throws Exception
	 * @Function: getCountyByRegionIdNew
	 * @Description: 获取县市信息列表【增加是否添加所有选项的功能】
	 * @version: v1.0.0
	 * @author: shitian
	 * @date: Sep 27, 2011 6:54:47 PM
	 * <p/>
	 * Modification History:
	 * Date               Author            Version            Description
	 * -------------------------------------------------------------------
	 * Sep 27, 2011        shitian            v1.0.0                 修改原因
	 */
	public static IBOBsDistrictValue[] getCountyByRegionIdNew(String regionId, boolean isBlank, boolean isAll) throws Exception {
		IBOBsDistrictValue[] results = getCountyByRegionId(regionId, isBlank);
		// 删除results中可能含有的空
		if (!isBlank) {
			List tempList = new ArrayList();
			for (int i = 0, len = results.length; i < len; i++) {
				if (!"-1".equals(results[i].getRegionId())) {
					tempList.add(results[i]);
				}
			}
			results = (IBOBsDistrictValue[]) tempList.toArray(new IBOBsDistrictValue[0]);
		}

		if (isAll) {
			if (results == null) {
				IBOBsDistrictValue[] newResults = new BOBsDistrictBean[1];
				IBOBsDistrictValue districtBean = new BOBsDistrictBean();
				districtBean.setRegionId("-2");
				districtBean.setDistrictName(CrmLocaleFactory.getResource("CMS0009013"));
				newResults[0] = districtBean;
				return newResults;
			}
			IBOBsDistrictValue[] newResults = new BOBsDistrictBean[results.length + 1];
			IBOBsDistrictValue districtBean = new BOBsDistrictBean();
			districtBean.setRegionId("-2");
			districtBean.setDistrictName(CrmLocaleFactory.getResource("CMS0009013"));
			newResults[0] = districtBean;
			for (int i = 1; i < results.length + 1; i++) {
				newResults[i] = results[i - 1];
			}
			return newResults;
		}
		return results;
	}

	/**
	 * 获取所有地市【增加是否添加空白选项和未割接地市过滤的功能】
	 *
	 * @param courseFlag 未割接地市标识 true:过滤，false不过滤
	 * @param isBlank    是否需要添加空白选项
	 * @return 过滤后的地市信息
	 * @throws Exception
	 * @throws java.rmi.RemoteException
	 * @Function: getRegionId
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 27, 2011 5:17:41 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Jun 27, 2011     huzq2           v1.0.0               修改原因
	 */
	public static IBOBsDistrictValue[] getRegionId(boolean courseFlag, boolean isBlank) throws Exception {
		IBOBsDistrictValue[] results = DistrictUtil.getRegion();
		List resultList = new ArrayList();
		if (isBlank) {
			IBOBsDistrictValue districtBean = new BOBsDistrictBean();
			districtBean.setRegionId("-1");
			districtBean.setDistrictName("");
			resultList.add(districtBean);
		}
		// 如果过滤未割接地市标识则需要过滤
		for (int i = 0; i < results.length; i++) {
			if ((courseFlag && results[i].getCourseFlag() == 1) || !courseFlag) {
				resultList.add(results[i]);
			}
		}
		return (IBOBsDistrictValue[]) resultList.toArray(new IBOBsDistrictValue[0]);
	}

	/**
	 * @param courseFlag
	 * @param isBlank
	 * @return
	 * @throws Exception
	 * @Function: getRegionId
	 * @Description: 获取所有地市【增加是否添加所有选项】
	 * @version: v1.0.0
	 * @author: shitian
	 * @date: Sep 27, 2011 6:37:41 PM
	 * <p/>
	 * Modification History:
	 * Date               Author            Version            Description
	 * -------------------------------------------------------------------
	 * Sep 27, 2011        shitian            v1.0.0                 修改原因
	 */
	public static IBOBsDistrictValue[] getRegionId(boolean courseFlag, boolean isBlank, boolean isAll) throws Exception {
		IBOBsDistrictValue[] results = DistrictUtil.getRegion();
		List resultList = new ArrayList();
		if (isBlank) {
			IBOBsDistrictValue districtBean = new BOBsDistrictBean();
			districtBean.setRegionId("-1");
			districtBean.setDistrictName("");
			resultList.add(districtBean);
		}
		if (isAll) {
			IBOBsDistrictValue districtBean = new BOBsDistrictBean();
			districtBean.setRegionId("-2");
			districtBean.setDistrictName(CrmLocaleFactory.getResource("CMS0009013")); // 所有
			resultList.add(districtBean);
		}
		// 如果过滤未割接地市标识则需要过滤
		for (int i = 0; i < results.length; i++) {
			if ((courseFlag && results[i].getCourseFlag() == 1) || !courseFlag) {
				resultList.add(results[i]);
			}
		}
		return (IBOBsDistrictValue[]) resultList.toArray(new IBOBsDistrictValue[0]);
	}

	/**
	 * 检查具体的地市是否是已割接地市
	 *
	 * @param regionId 地市编码
	 * @return true:已割接地市,false:未割接地市。
	 * @throws Exception
	 * @Function: checkRegion
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 27, 2011 11:18:55 PM
	 * <p/>
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jun 27, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static boolean checkRegion(String regionId) throws Exception {
		IBOBsDistrictValue value = DistrictUtil.getDistrictByRegionId(regionId);
		return (value == null) ? false : value.getCourseFlag() == 1;
	}

	/**
	 * 获取省份代码
	 * @return
	 * @throws Exception
	 */
	public static String getProvinceCode() throws Exception {
		String districtId = (String) SessionManager.getUser().get("DISTRICT_ID");
		long provinceCode = BsCommonDistrictUtil.getCommonDistrictById(Long.parseLong(districtId)).getParentDistrictId();
		return BsCommonDistrictUtil.getCommonDistrictById(provinceCode).getDistrictCode();
	}

	/**
	 * 根据城市名称获取district信息
	 * @Function getDistrictByCityname
	 * @Description 
	 *
	 * @param cityName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-9-18 上午10:23:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-18     yangjh           v1.0.0               修改原因<br>
	 */
	public static IBOBsDistrictValue getDistrictByCityname(String cityName) throws Exception {
		if (StringUtils.isBlank(cityName)) {
			ExceptionUtil.throwBusinessException("CMC0030096");
		}
		String districtName = "";
		// 获取当前租户的地区信息
		IBOBsDistrictValue[] vals = DistrictUtil.getAllDistrictByCurrentTenantId();
		if (vals != null && vals.length > 0) {
			for (int i = 0; i < vals.length; i++) {
				districtName = vals[i].getDistrictName();
				if (districtName.equals(cityName)) {
					return vals[i];
				}

			}
		}
		return null;
	}
}
