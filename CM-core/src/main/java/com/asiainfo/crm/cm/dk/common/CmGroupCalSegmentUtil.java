package com.asiainfo.crm.cm.dk.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.JexlCalculate;
import com.asiainfo.crm.cm.common.util.jexlFunction;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class CmGroupCalSegmentUtil {

	/**   
	 * @Function calGroupSegment
	 * @Description 计算集团客户细分，如果没有则为null
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-12 下午2:16:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-12     shitian           v1.0.0               修改原因<br>
	 */
	public static String calGroupSegment(long custId) throws Exception {
		// 查询静态规则配置参数
		IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData("CM_SEGMENT_CAL_RULE", "DK");
		String staticData = "";
		if (CmCommonUtil.isNotEmptyObject(staticDataValue)) {
			staticData = staticDataValue.getExternCodeType();
		}
		if (StringUtils.isBlank(staticData)) {
			throw new Exception(CrmLocaleFactory.getResource("CMS0030043", "CM_SEGMENT_CAL_RULE"));
		}

		// 查询集团客户信息
		String sql = "SELECT A.STAFF_AMOUNT,B.LEGAL_FORM,C.INDUSTRY_ID,C.SORT FROM {CM_GROUP_CUSTOMER} A LEFT JOIN {CM_GROUP_REL_INDUSTRY} C ON A.CUST_ID = C.CUST_ID, {CMX_GROUP_CUSTOMER} B WHERE A.CUST_ID = B.CUST_ID AND A.CUST_ID = :custId ";
		sql = SplitTableFactory.createQuerySQL(sql, new HashMap());
		Map map = new HashMap();
		map.put("custId", custId);
		DataContainer[] dcData = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, map);
		Map paraMap = new HashMap();
		if (CmCommonUtil.isNotEmptyObject(dcData)) {
			for (int i = 0; i < dcData.length; i++) {
				paraMap.put("INDUSTRY" + dcData[i].getAsLong("SORT"), dcData[i].getAsString("INDUSTRY_ID"));
				paraMap.put("LEGAL_FORM", dcData[i].getAsString("LEGAL_FORM"));
				paraMap.put("ENT_TOTAL_EMPLOYEES", dcData[i].getAsLong("STAFF_AMOUNT"));
			}
		}

		paraMap.put("FUNCTION", jexlFunction.class);

		// 计算规则
		JexlCalculate jexlCal = new JexlCalculate();
		// 根据规则得出对应的层级编码，-1为没有
		String segmentID = jexlCal.evaluateExpression(staticData, paraMap);
		if (StringUtils.isBlank(segmentID)) {
			return "";
		}
		return segmentID;
	}
}
