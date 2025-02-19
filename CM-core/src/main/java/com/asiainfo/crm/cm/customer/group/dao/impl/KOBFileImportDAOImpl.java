package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CommonTool;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.IKOBFileImportDAO;

public class KOBFileImportDAOImpl implements IKOBFileImportDAO{
	
	/**
	 *  查询KOB文件数据
	 */
	public DataContainer[] queryDataForFile(String tenantId,String regionId, int fileNo) throws Exception {
		StringBuffer condition = new StringBuffer();
		switch (fileNo) {
			case 1:
				condition.append("SELECT KOB_NUMBER, NAME, ADDRESSE_1, ADDRESSE_2, ZIP_CODE, CITY, PHONE_NUMBER, SE_NUMBER, LEGAL_FORM, REGISTRATION_NUMBERBER, STATUS, REGISTRATION_DATE, EMPLOYEE_CODE, EMPLOYEE_NUMBER, ESTABLISHED, SHARE_CAPITAL, INDUSTRIAL_CLASSIFICATION, INDUSTRY_OVERVIEW, ADVERTISING_PRIVACY, WORKPLACE_CODE, WORKPLACE_NUMBERBER, ROAD_CODE, MUNICIPALITY_CODE, MUNICIPALITY_CODE_TEXT, REGION_CODE, REGION_CODE_TEXT, JURISDICTION_CODE, JURISDICTION_CODE_TEXT, FAX_NUMBERBER, LISTED_ON_STOCK_EXCHANGE, KAP_HISTORY_DATE, KAP_HISTORIK_CURRENCY, KAP_HISTORY_AMOUNT, KAP_HISTORY_INH_CODE, KAP_HISTORY_CHANGE_AMOUNTS, KAP_HISTORY_MARKET_VALUE, EXPORT_COUNTRY_CODE, EXPORT_COUNTRY_CODE_TEXT, EXPORT_TURNOVER_RATIO, CVR_NUMBERBER, P_NUMBERBER, HOUSE_NUMBERBER, HOUSE_LETTER, APARTMENT_FLOOR, UNKNOWN_ADDRESS, STREET_NAME FROM CM_KOB_FILE_SONO01");
				break;
			case 2:
				condition.append("SELECT KOB_NUMBER, TYPE, NAME FROM CM_KOB_FILE_SONO02");
				break;
			case 3:
				condition.append("SELECT KOB_NUMBER, ROLE, NAME, COUNTRY_CODE, UP_DOWN, RELATED_KOB_NUMBER, CONTRY_CODE_TEXT FROM CM_KOB_FILE_SONO03");
				break;
			default:
				break;
		}		
		return CommonTool.queryBeansFromSql(condition.toString(), null, -1, -1);
	}
	
	/**
	 * 查询集团客户的行业信息
	 * @param tenantId
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] queryIndustrys(String tenantId, long custId) throws Exception {
		String sql = "";
		StringBuffer condition = new StringBuffer();
		condition.append("SELECT * FROM {CM_GROUP_REL_INDUSTRY} WHERE cust_id='");
		condition.append(custId + "'");
		if(StringUtils.isNotBlank(tenantId)){
			sql = SplitTableFactory.createQuerySQL(condition.toString(),new HashMap());
		}else{
			ExceptionUtil.throwBusinessException("Dtenant.id not found!!");
		}
		return  CommonTool.queryBeansFromSql(sql, null, -1, -1);
	}
}
