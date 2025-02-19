/**
 * 
 */
package com.asiainfo.crm.cm.dk.service.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmCustPreferenceInfoSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustPerferInfoBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustPerferInfomationBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfomationValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

/**   
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author mael
 * @date 2014-9-1 下午4:07:03
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-9-1     mael           v1.0.0               修改原因<br>
 */
public class CmCustPreferenceInfoSVImpl implements ICmCustPreferenceInfoSV {

	public IBOCmCustPerferInfomationValue[] queryCustPreferInformation(long custId, int start, int end) throws Exception {

		IBOCmCustPerferInfomationValue[] custPreferences = queryCustPreferInforDeal(custId, start, end);
		if (null != custPreferences && custPreferences.length > 0) {
			String delete = "";
			for (int i = 0; i < custPreferences.length; i++) {
				custPreferences[i].setUpContMedTypeId(3);
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteCustPreference(\"" + String.valueOf(custPreferences[i].getPreferChannelId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				custPreferences[i].setAction(delete);
				custPreferences[i].setContMedTypeName(String.valueOf(custPreferences[i].getContMedTypeId()));
				if (custPreferences[i].getPerferType() == CmConstants.PreferType.preferredMedium) {
					if (custPreferences[i].getEmailAddress() == null) {
						custPreferences[i].setPreferChannelName(custPreferences[i].getContNumber());
					} else {
						custPreferences[i].setPreferChannelName(custPreferences[i].getEmailAddress());
					}
				}
			}
			return custPreferences;
		}
		return new IBOCmCustPerferInfomationValue[0];
	}

	public int queryCustPreferInformationCount(long custId) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		if (custId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmCustPerferInfomationValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", custId);
		}
		String sql = CmCommonUtil.getDynamicCountSqlByConds(BOCmCustPerferInfomationBean.class, condition.toString(), paraMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		return inter[0].getAsInt("CNT");
	}

	public IBOCmCustPerferInfoValue[] queryCustPreferTimeInfor(long preferChannelId, int start, int end) throws Exception {
		IBOCmCustPerferInfoValue[] custPreferInfo = queryCustPreferTimeInforDeal(preferChannelId, start, end);
		if (null != custPreferInfo && custPreferInfo.length > 0) {
			String delete = "";
			for (int i = 0; i < custPreferInfo.length; i++) {
				delete = "<a href='javascript:void(0)' class='cellpath' onclick='deleteCustPreferTime(\"" + String.valueOf(custPreferInfo[i].getPreferPeriodId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + CrmLocaleFactory.getResource("CMS0000079") + "</a>";
				custPreferInfo[i].setAction(delete);
			}
			return custPreferInfo;
		}
		return new IBOCmCustPerferInfoValue[0];
	}

	public int queryCustPreferTimeInforCount(long preferChannelId) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		if (preferChannelId > 0) {
			condition.append(" AND ").append(IBOCmCustPerferInfoValue.S_PreferChannelId).append(" = :preferChannelId");
			paraMap.put("preferChannelId", preferChannelId);
		}

		String sql = CmCommonUtil.getDynamicCountSqlByConds(BOCmCustPerferInfoBean.class, condition.toString(), paraMap);
		DataContainerInterface[] inter = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, paraMap);
		return inter[0].getAsInt("CNT");
	}

	/**
	 * 
	 * @Function queryCustPreferInforDeal
	 * @Description 查询客户偏好信息
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-4 上午10:22:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-4     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmCustPerferInfomationValue[] queryCustPreferInforDeal(long custId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		if (custId > 0) {
			condition.append(" AND ");
			condition.append(IBOCmCustPerferInfomationValue.S_CustId).append(" = :custId ");
			paraMap.put("custId", custId);
		}

		String sql = CmCommonUtil.getDynamicSqlByConds(BOCmCustPerferInfomationBean.class, condition.toString(), paraMap, start, end);
		sql = sql + " ORDER BY T2.PRIOR ASC";
		IBOCmCustPerferInfomationValue[] results = (IBOCmCustPerferInfomationValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmCustPerferInfomationBean.class,
				sql, paraMap);
		if (null != results && results.length > 0) {
			return results;
		}
		return new IBOCmCustPerferInfomationValue[0];
	}

	public IBOCmCustPerferInfoValue[] queryCustPreferTimeInforDeal(long preferChannelId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		if (preferChannelId > 0) {
			condition.append(" AND ").append(IBOCmCustPerferInfoValue.S_PreferChannelId).append(" = :preferChannelId");
			paraMap.put("preferChannelId", preferChannelId);
		}
		String sql = CmCommonUtil.getDynamicSqlByConds(BOCmCustPerferInfoBean.class, condition.toString(), paraMap, start, end);
		IBOCmCustPerferInfoValue[] results = (IBOCmCustPerferInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmCustPerferInfoBean.class, sql, paraMap);
		if (null != results && results.length > 0) {
			return results;
		}
		return new IBOCmCustPerferInfoValue[0];
	}

	public IBOCmCustPerferInfoValue[] queryCustPrefer(long custId, int perferType) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IBOCmCustPerferInfoValue.S_CustId).append(" = :custId");
			paraMap.put("custId", custId);
			if (perferType > 0) {
				condition.append(" AND ").append(IBOCmCustPerferInfoValue.S_PerferType).append(" = :perferType");
				paraMap.put("perferType", perferType);
			}
			String sql = CmCommonUtil.getDynamicSqlByConds(BOCmCustPerferInfoBean.class, condition.toString(), paraMap, -1, -1);
			sql += " ORDER BY T2.PRIOR ASC";
			IBOCmCustPerferInfoValue[] results = (IBOCmCustPerferInfoValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmCustPerferInfoBean.class, sql, paraMap);
			if (results != null && results.length > 0) {
				return results;
			}
		}
		return new IBOCmCustPerferInfoValue[0];
	}

}
