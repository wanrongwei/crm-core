package com.asiainfo.crm.cm.common.util;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.common.bo.BOBsStaticDataBean;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmConstants.TenantId;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 *
 * @ClassName: CmStaticDataUtil.java
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 20, 2011 1:41:13 PM
 * <p/>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * May 20, 2011		huzq2           v1.0.0               修改原因
 */

public class CmStaticDataUtil {

	private static transient Log log = LogFactory.getLog(CmStaticDataUtil.class);

	/**
	 * 获取客户管理静态数据生成下拉框[对平台StaticDataUtil.getStaticData(codeType)取到的数据进行了封装，可以自主选择是否增加" "选项]
	 *
	 * @param isChoose 是否需要" "选项
	 * @param codeType 静态数据类型
	 * @return 静态数据列表
	 * @throws Exception
	 * @Function: genStaticDataDs
	 * @Description: 获取客户管理静态数据生成下拉框[对平台StaticDataUtil.getStaticData(codeType)取到的数据进行了封装，可以自主选择是否增加" "选项]
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 1:44:18 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * May 20, 2011     huzq2           v1.0.0               修改原因
	 */
	public static IBOBsStaticDataValue[] genStaticDataDs(boolean isChoose, String codeType) throws Exception {
		return genStaticDataDs(isChoose, false, codeType);
	}

	/**
	 * 获取有关code_type的静态数据源
	 * @param codeType  静态数据对应的code_type
	 * @param codeValue 1,2,3 (逗号隔开)
	 * @param isDisplay 填的这些静态数据是否显示（true,显示；false,不显示）
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 14, 2012 2:21:54 PM
	 */
	public static IBOBsStaticDataValue[] genStaticDataDsAndFilterCodeValues(String codeType, String codeValue, boolean isDisplay) throws Exception {
		IBOBsStaticDataValue[] bsStaticDataValues = genStaticDataDs(false, false, codeType);
		if (StringUtils.isBlank(codeValue)) {
			return bsStaticDataValues;
		}
		List results = new ArrayList();
		String splitChar = ","; // 默认逗号
		if (StringUtils.indexOf(codeValue, "|") != -1) { // 如果有竖线（|）则以竖线分割
			splitChar = "\\|";
		} else if (StringUtils.indexOf(codeValue, "^") != -1) { // 如果有符号（^）则以竖线分割
			splitChar = "\\^";
		}
		String[] codeValues = codeValue.trim().split(splitChar);
		Set filterCodeValue = new HashSet();
		for (int i = 0; i < codeValues.length; i++) {
			filterCodeValue.add(codeValues[i].trim());
		}
		if (bsStaticDataValues != null && bsStaticDataValues.length > 0) {
			if (isDisplay) {
				for (int i = 0; i < bsStaticDataValues.length; i++) {
					if (filterCodeValue.contains(bsStaticDataValues[i].getCodeValue())) {
						results.add(bsStaticDataValues[i]);
					}
				}
			} else {
				for (int i = 0; i < bsStaticDataValues.length; i++) {
					if (!filterCodeValue.contains(bsStaticDataValues[i].getCodeValue())) {
						results.add(bsStaticDataValues[i]);
					}
				}
			}

		}
		return (IBOBsStaticDataValue[]) results.toArray(new IBOBsStaticDataValue[0]);
	}

	public static void main(String[] args) throws Exception {
		IBOBsStaticDataValue[] bsStaticDataValues = genStaticDataDsAndFilterCodeValues("CM_ACCOUNT_PAY_METHOD", "1,2", true);
		if (bsStaticDataValues != null) {
			for (int i = 0; i < bsStaticDataValues.length; i++) {
			}
		}
	}

	/**
	 * @param m
	 * @param n
	 * @return 符合条件的静态数据
	 * @throws Exception
	 * @throws java.rmi.RemoteException
	 * @Function: getYearsData
	 * @Description: 获取年份的静态数据枚举值
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 2:18:21 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * May 20, 2011     huzq2           v1.0.0               修改原因
	 */
	public static IBOBsStaticDataValue[] getYearsData(int m, int n) throws Exception {
		BOBsStaticDataBean[] datas = new BOBsStaticDataBean[m + n + 1];
		SimpleDateFormat strToDate = new SimpleDateFormat("yyyy");
		String strDate = strToDate.format(TimeUtil.getPrimaryDataSourceSysDate());
		// 当年过去12年,未来2年
		for (int i = m; i >= -n; i--) {
			datas[m - i] = new BOBsStaticDataBean();
			datas[m - i].setCodeName(String.valueOf(Integer.valueOf(strDate).intValue() - i));
			datas[m - i].setCodeValue(String.valueOf(Integer.valueOf(strDate).intValue() - i));
		}
		return datas;
	}

	/**
	 * @param codeType
	 * @param codeValue
	 * @return
	 * @throws Exception
	 * @throws java.rmi.RemoteException
	 * @Function: getCodeNameByCodeTypeAndCodeValue
	 * @Description: 根据codeType和codeValue获取codeName
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 2:21:40 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * May 20, 2011     huzq2           v1.0.0               修改原因
	 */
	public static String getCodeNameByCodeTypeAndCodeValue(String codeType, String codeValue) throws Exception {
		String result = "";
		IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(codeType, codeValue);
		if (staticDataValue != null) {
			result = staticDataValue.getCodeName();
		}
		return result;
	}

	/**
	 * @param isChoose 增加空白选项
	 * @param isAll    增加“所有”选项
	 * @param codeType
	 * @return
	 * @throws Exception
	 * @throws java.rmi.RemoteException
	 * @Function: genStaticDataDs
	 * @Description: 该函数的功能描述
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 2:22:42 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * May 20, 2011     huzq2           v1.0.0               修改原因
	 */
	public static IBOBsStaticDataValue[] genStaticDataDs(boolean isChoose, boolean isAll, String codeType) throws Exception {
		codeType = codeType.trim();
		if (log.isDebugEnabled()) {
			log.debug(new StringBuilder().append("get static datas,the codeType is [").append(codeType).append("]"));
		}
		// 首先从基础库的静态数据中获取
		IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData(codeType);
		//针对cust_cert_type做特殊处理
		if("CM_CERT_TYPE".equals(codeType)){
			if(TenantIDFactory.getTenantId().equalsIgnoreCase("22")){
				values=StaticDataUtil.getStaticData("CM_IDENTIFICATION");
			}
		}
		// 对数据根据SORT_ID字段进行排序
		if (values == null) {
			values = new IBOBsStaticDataValue[0];
		}
		// 增加对一些特殊静态数据的过滤处理
		if (getSystemSwitch(codeType)) {
			List list = new ArrayList();
			for (int i = 0; i < values.length; i++) {
				// 过滤掉排序编号小于0的
				if (values[i].getSortId() < 0) {
					continue;
				}
				list.add(values[i]);
			}
			values = (IBOBsStaticDataValue[]) list.toArray(new IBOBsStaticDataValue[0]);
		}

		Arrays.sort(values, new Comparator() {

			public int compare(Object obj1, Object obj2) {
				int sortId1 = ((IBOBsStaticDataValue) obj1).getSortId();
				int sortId2 = ((IBOBsStaticDataValue) obj2).getSortId();
				return sortId1 - sortId2;
			}
		});

		if (log.isDebugEnabled()) {
			log.debug(new StringBuilder().append("the number of getted static data is ").append(values.length));
		}
		// 需要增加" "选项
		if (isChoose) {
			if (log.isDebugEnabled()) {
				log.debug("need to add 'please choose…' item!");
			}
			int length = (values == null) ? 0 : values.length;
			IBOBsStaticDataValue[] tmp = new IBOBsStaticDataValue[length + 1];
			// 生成" "节点对象
			tmp[0] = new BOBsStaticDataBean();
			tmp[0].setCodeType(codeType);
			tmp[0].setCodeName(" ");
			tmp[0].setCodeValue("-1");
			tmp[0].setSortId(-1);
			tmp[0].setState("U");
			// 将真实的静态数据拷贝到"请选择…"节点之后
			if (length > 0) {
				System.arraycopy(values, 0, tmp, 1, length);
			}
			values = tmp;
		}
		if (isAll) {
			int length = (values == null) ? 0 : values.length;
			IBOBsStaticDataValue[] tmp = new IBOBsStaticDataValue[length + 1];
			// 生成“所有”节点
			tmp[0] = new BOBsStaticDataBean();
			tmp[0].setCodeType(codeType);
			tmp[0].setCodeName(CrmLocaleFactory.getResource("CMS0000362"));
			tmp[0].setCodeValue("-2");
			tmp[0].setSortId(-2);
			tmp[0].setState("U");
			// 将真实的静态数据拷贝到"请选择…"节点之后
			if (length > 0) {
				System.arraycopy(values, 0, tmp, 1, length);
			}
			values = tmp;
		}
		return values;
	}

	/**   
	 * 获取级联下拉列表静态数据
	 * @Function: getStaticDataByParent
	 * @Description: 获取级联下拉列表静态数据
	 *
	 * @param isChoose 是否需要" "选项
	 * @param codeType 静态数据类型
	 * @param parent 上级codeValue
	 * @return 静态数据
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 2:14:00 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 20, 2011     huzq2           v1.0.0               修改原因
	 */
	public static IBOBsStaticDataValue[] getStaticDataByParent(boolean isChoose, String codeType, String parentCodeValue) throws Exception {
		IBOBsStaticDataValue[] result = genStaticDataDs(isChoose, new StringBuffer(codeType).append("_").append(parentCodeValue).toString());
		if (result.length > 0) {
			List dataList = new ArrayList();
			String tenantId = TenantIDFactory.getTenantId();
			for (int i = 0; i < result.length; i++) {
				if (StringUtils.isBlank(result[i].getExternCodeType()) || StringUtils.contains(result[i].getExternCodeType(), tenantId)
						|| (!StringUtils.contains(result[i].getExternCodeType(), TenantId.TENANT_21) && !StringUtils.contains(result[i].getExternCodeType(), TenantId.TENANT_91))) {
					dataList.add(result[i]);
				}
			}
			return (IBOBsStaticDataValue[]) dataList.toArray(new IBOBsStaticDataValue[0]);
		}
		IBOBsStaticDataValue[] values = genStaticDataDs(isChoose, codeType);
		IBOBsStaticDataValue[] obj = new IBOBsStaticDataValue[0];
		List list = new ArrayList();
		int i = 0;
		while (values != null && i < values.length) {
			if ("-1".equals(values[i].getCodeValue())) {
				list.add(values[i]);
			}
			if (values[i].getExternCodeType() != null && values[i].getExternCodeType().equals(parentCodeValue)) {
				list.add(values[i]);
			}
			i++;
		}
		// values = null;
		return (IBOBsStaticDataValue[]) list.toArray(obj);
	}

	/**   
	 * @Function isLegalStaticData
	 * @Description 校验传入的静态数据的枚举值是否在数据库中定义的范围内
	 *
	 * @param codeType
	 * @param value
	 * @return true：在；false：不在
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 10, 2012 4:38:54 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 10, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static boolean isLegalStaticData(String codeType, String value) throws Exception {
		return (StaticDataUtil.getStaticData(codeType, value) != null);
	}

	/**   
	 * @Function getStaticDataName
	 * @Description 封装平台获取静态数据的方法，返回静态数据对应的中文名
	 *
	 * @param codeType
	 * @param codeValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 9, 2012 10:53:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 9, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static String getStaticDataName(String codeType, String codeValue) throws Exception {
		IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(codeType, codeValue);
		if (null != staticDataValue) {
			return staticDataValue.getCodeName();
		}
		return null;
	}

	/**   
	 * 获取系统开关参数
	 * @Function getSystemSwitch
	 * @Description 
	 *
	 * @param codeValue
	 * @return 是否打开。true：打开，false：关闭
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-22 下午10:46:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-22     huzq2           v1.0.0               修改原因<br>
	 */
	public static boolean getSystemSwitch(String codeValue) throws Exception {
		IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.SYSTEM_SWITCH, codeValue);
		if (null != staticDataValue) {
			return DataType.getAsBoolean(staticDataValue.getCodeName());
		}
		return false;
	}

	/**   
	 * 获取附件文件扩展名正则表达式
	 * @Function getAttachFileExtPattern
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-10 上午11:03:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-10     huzq2           v1.0.0               修改原因<br>
	 */
	public static String getAttachFileExtPattern() throws Exception {
		IBOBsStaticDataValue[] attachFileExtValues = StaticDataUtil.getStaticData("CM_ATTACH_FILE_TYPE");
		StringBuffer sb = new StringBuffer();
		if (CmCommonUtil.isNotEmptyObject(attachFileExtValues)) {
			for (int i = 0; i < attachFileExtValues.length; i++) {
				sb.append(attachFileExtValues[i].getCodeName()).append("|");
			}
			if (sb.length() > 0) {
				sb.deleteCharAt(sb.length() - 1);
			}
		}
		return ".*(" + sb.toString() + ")$";
	}

	/**
	 * 静态数据表，通过codetype和codeName获取codeValue
	 * @param codeType
	 * @param codeName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 4, 2012 10:17:46 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 4, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public static String getCodeValueByTypeAndName(String codeType, String codeName) throws Exception {
		codeType = codeType.trim();
		if (log.isDebugEnabled()) {
			log.debug(new StringBuilder().append("get static datas,the codeType is [").append(codeType).append("]"));
		}
		// 首先从基础库的静态数据中获取
		IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData(codeType);

		// 遍历数组，得到结果
		for (int i = 0; i < values.length; i++) {
			if (codeName.equals(values[i].getCodeName())) {
				return values[i].getCodeValue();
			}
		}
		return null;
	}

	/**   
	 * 获取支付方式
	 * @Function: getPayMethod
	 * @Description: 
	 *
	 * @param isChoose
	 * @param acctTypeValue 账户类型
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 3:04:45 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 20, 2011     huzq2           v1.0.0               修改原因
	 */
	public static IBOBsStaticDataValue[] getPayMethod(boolean isChoose, int acctTypeValue) throws Exception, RemoteException {
		// 根据账户类型的值拼写对应的支付方式的codeType
		String codeType = CmConstants.CmStaticDataCodeType.ACCOUNT_TYPE + "_" + String.valueOf(acctTypeValue);
		return genStaticDataDs(isChoose, codeType);
	}

	/**   
	 * 获取支付方式
	 * @Function: getPayMethod
	 * @Description: 
	 *
	 * @param isChoose
	 * @param acctTypeValue 账户类型
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 3:04:45 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 20, 2011     huzq2           v1.0.0               修改原因
	 */
	public static IBOBsStaticDataValue[] getPayMethod(boolean isChoose) throws Exception, RemoteException {
		// 根据账户类型的值拼写对应的支付方式的codeType
		String codeType = CmConstants.CmStaticDataCodeType.ACCOUNT_TYPE;
		return genStaticDataDs(isChoose, codeType);
	}

	public static DataContainerInterface getAcctAliasName(String acctId) throws Exception {
		HashMap parameter = new HashMap();
		parameter.put("acctId", Long.valueOf(acctId).longValue());
		String condition = " state = 'U' and acct_id = :acctId ";
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition, parameter, -1, -1);
		if (values != null && values.length > 0) {
			if (values[0].getAsString(BOCmCustAcctRelBean.S_AcctAliasName) == null)
				values[0].initProperty(BOCmCustAcctRelBean.S_AcctAliasName, " ");
			return values[0];
		}
		return null;
	}

	/**
	 * 根据租户获取对应的静态数据
	 * @Function getStaticDataByTenantID
	 * @Description 
	 *
	 * @param codeType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-8-7 下午2:39:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-7     yangjh           v1.0.0               修改原因<br>
	 */
	public static IBOBsStaticDataValue[] getStaticDataByTenantID(String codeType) throws Exception {
		String tenantId = TenantIDFactory.getTenantId();
		IBOBsStaticDataValue[] vals = StaticDataUtil.getStaticData(codeType);
		if (vals != null && vals.length > 0) {
			ArrayList<IBOBsStaticDataValue> list = new ArrayList<IBOBsStaticDataValue>();
			for (int i = 0; i < vals.length; i++) {
				if (StringUtils.isBlank(vals[i].getExternCodeType()) || StringUtils.contains(vals[i].getExternCodeType(), tenantId)) {
					list.add(vals[i]);
				}
			}
			if (list.size() > 0) {
				return (IBOBsStaticDataValue[]) list.toArray(new IBOBsStaticDataValue[0]);
			}
		}
		return null;
	}
}
