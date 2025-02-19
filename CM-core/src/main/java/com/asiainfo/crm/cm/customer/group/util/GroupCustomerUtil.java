package com.asiainfo.crm.cm.customer.group.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.set.FieldTypeDB;
import com.ai.appframe2.set.FieldTypeSetDB;
import com.ai.appframe2.set.FieldTypeSetDBFactory;
import com.ai.appframe2.util.StringUtils;
import com.ai.common.bo.BOBsStaticDataBean;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmDistrictUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustAndExtraInfoValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.common.cache.BsCommonDistrictCacheImpl;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;

public class GroupCustomerUtil
{

	private static final String SET_NAME_GROUP_CUSTOMER_EXTRA_INFO = "com.asiainfo.crm.cm.customer.group.web.SETQCmGroupCustAndExtraInfo";
	private static transient Log log = LogFactory.getLog(GroupCustomerUtil.class);
	// 个人客户的必填字段
	private static final String[] GROUP_CUSTOMER_EXTRA_INFO_NEED_COLS = { 
			IQBOCmGroupCustAndExtraInfoValue.S_CustName,
			IQBOCmGroupCustAndExtraInfoValue.S_ContPhone1,
			IQBOCmGroupCustAndExtraInfoValue.S_CustAddress, 
			IQBOCmGroupCustAndExtraInfoValue.S_CustCertType, 
			IQBOCmGroupCustAndExtraInfoValue.S_ChnlProvinceId, 
			IQBOCmGroupCustAndExtraInfoValue.S_ChnlCityId,
			IQBOCmGroupCustAndExtraInfoValue.S_PostProvince,
			IQBOCmGroupCustAndExtraInfoValue.S_Vocation1,
			IQBOCmGroupCustAndExtraInfoValue.S_OrganType,
			IQBOCmGroupCustAndExtraInfoValue.S_GroupRegionType };

	/**
	 * <pre>
	 *  新增给集团客户默认值
	 * </pre>
	 * 
	 * @param groupCustAndExtraInfoBean
	 * @return IQBOCmGroupCustAndExtraInfoValue
	 * @throws Exception
	 */
	public static IQBOCmGroupCustAndExtraInfoValue setInitFieldGroupCustAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoBean,long regionId) throws Exception
	{
		groupCustAndExtraInfoBean.setCustCertType(CmxConstants.CertificateType.BUSINESS_LICENSE);
		groupCustAndExtraInfoBean.setPostProvince(571);
		groupCustAndExtraInfoBean.setChnlRegionDetail(0);	//大客户中心
		groupCustAndExtraInfoBean.setChnlProvinceId(571);
		groupCustAndExtraInfoBean.setOrganType(CmxConstants.GroupCustStaticData.GRGAN_TYPE_1);
		groupCustAndExtraInfoBean.setVocation3(0);
		return groupCustAndExtraInfoBean;
	}

	/**
	 * <pre>
	 * 验证集团客户的必填字段是否已填
	 * </pre>
	 * 
	 * @param groupCustAndExtraInfoBean
	 * @return Map中key为isAllFilled：是否全部已填 Map中key为notFilledCols：
	 *         如果isAllFilled的value为Boolean.FALSE，则返回所有未填写的列的国际化名称，以[开头、以]结尾、中间以,分隔
	 * @throws Exception
	 */
	public static Map isGroupCustFilled(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoBean) throws Exception
	{
		Map result = new HashMap();
		List notFilledCols = new ArrayList();// 未填字段名称

		String setName = SET_NAME_GROUP_CUSTOMER_EXTRA_INFO;
		Map titleMap = getFieldTitles(setName);

		for (int i = 0; i < GROUP_CUSTOMER_EXTRA_INFO_NEED_COLS.length; i++)
		{
			if ((groupCustAndExtraInfoBean == null) || groupCustAndExtraInfoBean.get(GROUP_CUSTOMER_EXTRA_INFO_NEED_COLS[i]) == null || StringUtils.isEmptyString(groupCustAndExtraInfoBean.get(GROUP_CUSTOMER_EXTRA_INFO_NEED_COLS[i]).toString().trim()) || "-1".equals(groupCustAndExtraInfoBean.get(GROUP_CUSTOMER_EXTRA_INFO_NEED_COLS[i]).toString()))
			{
				notFilledCols.add(titleMap.get(GROUP_CUSTOMER_EXTRA_INFO_NEED_COLS[i]));
			}
		}

		boolean isAllFilled = true;
		if (notFilledCols.size() > 0)
		{
			isAllFilled = false;
		}
		result.put("isAllFilled", Boolean.valueOf(isAllFilled));
		result.put("notFilledCols", notFilledCols.toString());
		return result;
	}

	/**
	 * <pre>
	 * 获取字段的国际化名称
	 * </pre>
	 * 
	 * @param setname
	 *            SET文件全名，参见本来中SET_NAME_开头的常量
	 * @return 返回给定SET中所有字段的国际化名称的Map Map中的key：SET文件中Field的Id值
	 *         Map中的value：SET文件中Field的Title值
	 * @throws Exception
	 */
	private static Map getFieldTitles(String setname) throws Exception
	{
		Map result = null;
		FieldTypeSetDB fieldTypeSet = FieldTypeSetDBFactory.getFieldTypeSet(setname, true);
		FieldTypeDB[] fieldTypeDBs = fieldTypeSet.getFieldList();

		if (fieldTypeDBs != null && fieldTypeDBs.length > 0)
		{
			result = new HashMap();
			for (int i = 0, length = fieldTypeDBs.length; i < length; i++)
			{
				result.put(fieldTypeDBs[i].getId(), fieldTypeDBs[i].getTitle());
			}
		}
		return result;
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
	public static IBOBsStaticDataValue[] getGroupInfoLevel(boolean isChoose, String codeType, String parentCodeValue) throws Exception {
		if(CmLnConstants.AuditTypeGrp.AuditTypeCreReq_3.equals(parentCodeValue) || CmLnConstants.AuditTypeGrp.AuditTypeCreReq_4.equals(parentCodeValue) || CmLnConstants.AuditTypeGrp.AuditTypeCreReq_5.equals(parentCodeValue))
		{
			parentCodeValue = CmLnConstants.AuditTypeGrp.AuditTypeCreReq_2;
		}
		IBOBsStaticDataValue[] result = genStaticDataDs(isChoose, new StringBuffer(codeType).append("_").append(parentCodeValue).toString());
		if (result.length > 0) {
			return result;
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
	 * 根据父级行政区域编码和父级行政区域类型获取其子行政区域外省信息
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
	public static IBOBsCommonDistrictValue[] getCommonDistrictsByParentCodeOutLn(String parentCode, int parentType) throws Exception {
		List list = (List) CacheFactory.get(BsCommonDistrictCacheImpl.class, BsCommonDistrictCacheImpl.IDX_BY_PARENT_CODE_KEY + BsCommonDistrictCacheImpl.SPLIT_CODE + parentCode
				+ BsCommonDistrictCacheImpl.SPLIT_CODE + parentType);
		if (list != null) {
			for(int k = 0;k<list.size();k++)
			{
				IBOBsCommonDistrictValue value = (IBOBsCommonDistrictValue)list.get(k);
				if(value.getDistrictCode().equals(CmDistrictUtil.getProvinceCode()))
				{
					list.remove(k);
				}
			}
			return (IBOBsCommonDistrictValue[]) list.toArray(new IBOBsCommonDistrictValue[0]);
		}
		return new IBOBsCommonDistrictValue[0];
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
	public static IBOBsStaticDataValue[] getCreditLevel(boolean isChoose,String custId) throws Exception {
		
		int custType = CmCommonUtil.getCustType(Long.valueOf(custId));
		String codeType = "";
		if(custType == CmConstants.CustomerType.INDIVIDUAL)
		{
			codeType = "CM_CREDIT_LEVEL";
		}else if(custType == CmConstants.CustomerType.GROUP)
		{
			codeType = "CM_GRP_CREDIT_LEVEL";
		}
		
		return genStaticDataDs(isChoose, false, codeType);
	}
	
	
	
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
}
