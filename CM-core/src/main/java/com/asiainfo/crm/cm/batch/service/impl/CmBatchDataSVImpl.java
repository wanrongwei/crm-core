package com.asiainfo.crm.cm.batch.service.impl;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.asiainfo.crm.cm.batch.dao.interfaces.ICmCommonBatchDAO;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataDetailValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFieldConfigValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFuncValue;
import com.asiainfo.crm.cm.batch.service.interfaces.ICmBatchDataSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;

public class CmBatchDataSVImpl implements ICmBatchDataSV {

	public IBOCmBatchFuncValue[] queryBatchFunc() throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.queryBatchFunc();
	}

	public int queryBatchFieldConfigOfCount(String configId) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.queryBatchFieldConfigOfCount(configId);
	}

	public DataContainer[] queryBatchFieldConfigValueByConfigId(String configId, int $startrowindex, int $endrowindex) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		IBOCmBatchFieldConfigValue[] values = dao.queryBatchFieldConfigValueByConfigId(configId, $startrowindex, $endrowindex);
		HashMap map = new HashMap();
		//

		map.put("DESC_DETAIL", "0");
		DataContainer[] dcs = new DataContainer[values.length];
		StringBuffer sb = null;
		for (int i = 0; i < dcs.length; i++) {
			sb = new StringBuffer();
			sb.append(values[i].getDsDisplay()).append("|").append(values[i].getDsValue()).append("|").append(values[i].getDsService()).append("|").append(values[i].getDsMethod())
					.append("|").append(values[i].getDsParam());
			map.put("NOTES", sb.toString());

			dcs[i] = CmCommonUtil.getDataContainers(values[i], map)[0];
		}

		return dcs;
	}

	public DataContainer[] queryDescExplain(String notes) throws Exception {

		String[] dsdetails = null;
		if (notes != null && notes.indexOf("|") != -1) {
			dsdetails = notes.split("\\|");
		} else {
			return null;
		}

		String dsdisplay = dsdetails[0];
		String dsvalue = dsdetails[1];
		String dsservice = dsdetails[2];
		String dsmethod = dsdetails[3];
		String dsparam = dsdetails[4];
		String exparam = null;
		if (dsdetails.length == 6) {
			exparam = dsdetails[5];
		}

		DataContainer[] dcs = null;
		if (("static".equals(dsservice) || "com.asiainfo.crm.cm.common.util.CmStaticDataUtil".equals(dsservice)) && "genStaticDataDs".equals(dsmethod)) {
			IBOBsStaticDataValue[] values = CmStaticDataUtil.genStaticDataDs(Boolean.parseBoolean(dsparam.split(",")[0]), dsparam.split(",")[1]);
			dcs = CmCommonUtil.getDataContainers(values, null);
		} else if (("static".equals(dsservice) || "com.asiainfo.crm.cm.common.util.CmStaticDataUtil".equals(dsservice)) && "getStaticDataByParent".equals(dsmethod)) {
			IBOBsStaticDataValue[] values = CmStaticDataUtil.getStaticDataByParent(Boolean.parseBoolean(dsparam.split(",")[0]), dsparam.split(",")[1], exparam);
			dcs = CmCommonUtil.getDataContainers(values, null);
		} else if (("static".equals(dsservice) || "com.asiainfo.crm.cm.common.util.CmStaticDataUtil".equals(dsservice)) && "genStaticDataDsAndFilterCodeValues".equals(dsmethod)) {
			String[] params = dsparam.split(",");
			if (params.length == 3) {
				IBOBsStaticDataValue[] values = CmStaticDataUtil.genStaticDataDsAndFilterCodeValues(StringUtils.trim(dsparam.split(",")[0]), dsparam.split(",")[1],
						DataType.getAsBoolean(dsparam.split(",")[2]));
				dcs = CmCommonUtil.getDataContainers(values, null);
			} else {
				dcs = new DataContainer[0];
			}
		} else if (("district".equals(dsservice) || "com.asiainfo.crm.common.util.BsCommonDistrictUtil".equals(dsservice)) && "getCommonDistrictsByParentId".equals(dsmethod)) {
			IBOBsCommonDistrictValue[] values = BsCommonDistrictUtil.getCommonDistrictsByParentId(Long.parseLong(dsparam.split(",")[0]));
			dcs = CmCommonUtil.getDataContainers(values, null);
		} else if (("district".equals(dsservice) || "com.asiainfo.crm.common.util.BsCommonDistrictUtil".equals(dsservice)) && "getCommonDistrictsByParentCode".equals(dsmethod)) {
			IBOBsCommonDistrictValue[] values = BsCommonDistrictUtil.getCommonDistrictsByParentCode(dsparam.split(",")[0], Integer.parseInt(dsparam.split(",")[1]));
			dcs = CmCommonUtil.getDataContainers(values, null);
		} else if (("district".equals(dsservice) || "com.asiainfo.crm.common.util.BsCommonDistrictUtil".equals(dsservice)) && "getAllCityDistricts".equals(dsmethod)) {
			IBOBsCommonDistrictValue[] values = BsCommonDistrictUtil.getAllCityDistricts();
			dcs = CmCommonUtil.getDataContainers(values, null);
		} else if (("district".equals(dsservice) || "com.asiainfo.crm.common.util.BsCommonDistrictUtil".equals(dsservice)) && "getAllCountryDistricts".equals(dsmethod)) {
			IBOBsCommonDistrictValue[] values = BsCommonDistrictUtil.getAllCountryDistricts();
			dcs = CmCommonUtil.getDataContainers(values, null);
		} else { // 自定义的服务
			Object serviceObject = null;
			Class[] paramClaz = null;
			Object[] paramters = null;
			if (dsservice.endsWith("SV")) {
				serviceObject = ServiceFactory.getService(dsservice);
			} else {
				serviceObject = ServiceFactory.getSeviceOfLocal(DataType.getJavaClass(dsservice));
			}
			if (dsmethod.contains("(")) {
				int start = dsmethod.indexOf("(");
				int end = dsmethod.indexOf(")");
				String[] paramTypes = StringUtils.split(StringUtils.trim(StringUtils.substring(dsmethod, start + 1, end)));
				if (paramTypes != null) {
					String[] params = dsparam.split(",");
					if (paramTypes.length == params.length) {
						if (paramTypes != null) {
							paramClaz = new Class[paramTypes.length];
							paramters = new Object[paramTypes.length];
							for (int i = 0; i < paramTypes.length; i++) {
								paramClaz[i] = DataType.getJavaClass(StringUtils.trim(paramTypes[i]));
								paramters[i] = DataType.transfer(params[i], paramClaz[i]);
							}
						}
					}
				}
				dsmethod = dsmethod.substring(0, start);
			}
			// 获取服务定义的方法
			Method generatorMethod = null;
			if (serviceObject != null) {
				generatorMethod = serviceObject.getClass().getDeclaredMethod(StringUtils.trim(dsmethod), paramClaz);
			} else {
				generatorMethod = Class.forName(dsservice).getDeclaredMethod(StringUtils.trim(dsmethod), paramClaz);
			}
			Object retVal = generatorMethod.invoke(serviceObject, paramters);
			dcs = CmCommonUtil.getDataContainers(retVal, null);
		}
		dcs = warpDataContainer(dcs, dsdisplay, dsvalue);
		return dcs;
	}

	public IBOCmBatchFuncValue queryBatchFuncById(String configId) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.queryBatchFuncById(configId);
	}

	/**
	 * 
	 * @Function: CmBatchDataSVImpl.java
	 * @Description: 拼装DataContainer,将原 dsDisplay , dsValue 封装成 CODE_NAME , CODE_VALUE
	 * 				dsDisplay , dsValue 为空  默认为 CODE_NAME , CODE_VALUE 
	 *
	 * @param dcs
	 * @param dsDisplay
	 * @param dsValue
	 * @return
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 15, 2011 7:53:18 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 15, 2011     zhaiwg           v1.0.0               修改原因
	 */
	private DataContainer[] warpDataContainer(DataContainer[] dcs, String dsDisplay, String dsValue) {
		if (null == dcs || dcs.length == 0) {
			return dcs;
		}

		StringBuffer sb = null;
		for (int i = 0; i < dcs.length; i++) {
			if ("null".equals(dsDisplay) && "null".equals(dsValue)) {
				sb = new StringBuffer();
				sb.append(dcs[i].get("CODE_NAME")).append(" (").append(dcs[i].get("CODE_VALUE")).append(")");
				dcs[i].set("CODE_NAME", sb.toString());
			} else {
				sb = new StringBuffer();
				sb.append(dcs[i].get(dsDisplay)).append(" (").append(dcs[i].get(dsValue)).append(")");
				dcs[i].set("CODE_NAME", sb.toString());
				dcs[i].set("CODE_VALUE", dcs[i].get(dsValue));
			}
		}
		return dcs;
	}

	public long saveBatchData(IBOCmBatchDataValue value) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		String regionId = CmCommonUtil.getDefaultRegionId();
		value.setRegionId(regionId);
		return dao.saveBatchData(value);
	}

	public void saveBatchDataDetail(IBOCmBatchDataDetailValue[] values) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		String regionId = CmCommonUtil.getDefaultRegionId();
		for (int i = 0; i < values.length; i++) {
			values[i].setRegionId(regionId);
		}
		dao.saveBatchDataDetail(values);
	}
}
