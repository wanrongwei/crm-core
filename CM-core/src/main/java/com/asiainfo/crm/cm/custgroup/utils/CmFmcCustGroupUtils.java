package com.asiainfo.crm.cm.custgroup.utils;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmFmcCustGroupUtils {
	
	private static boolean isInScope(String scope,int num){
		boolean flag = false;
		String leftSymbol = scope.substring(0,1);
		String rightSymbol = scope.substring(scope.length()-1,scope.length());
		int commaIndex = scope.indexOf(",");
		String leftNum = scope.substring(1,commaIndex);
		String rightNum = scope.substring(commaIndex+1,scope.length()-1);
		boolean leftFlag = false;
		boolean rightFlag = false;
		if(StringUtils.isNumeric(leftNum)){
			if("(".equals(leftSymbol) && num>Integer.parseInt(leftNum)){
				leftFlag = true;
			}
			if("[".equals(leftSymbol) && num>=Integer.parseInt(leftNum)){
				leftFlag = true;
			}
		}else{
			leftFlag = true;
		}
		
		if(StringUtils.isNumeric(rightNum)){
			if(")".equals(rightSymbol) && num<Integer.parseInt(rightNum)){
				rightFlag = true;
			}
			if("]".equals(rightSymbol) && num<=Integer.parseInt(rightNum)){
				rightFlag = true;
			}
		}else{
			rightFlag = true;
		}
		
		if(leftFlag && rightFlag){
			flag = true;
		}
		return flag;
	}

	/**
	 * 计算表达式  优惠百分比  
	 * @param ruleStr
	 * @param num
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
    public static Map calculationOfPreferential(String ruleStr,int num)throws RemoteException, Exception{
		Map<String,String> resultMap = new HashMap<String,String>();
		String percentage = "0%";
		if(StringUtils.isNotBlank(ruleStr)){
			//每个group的配置公式
			String[] formulas = ruleStr.split("\\;");
			if(formulas!=null && formulas.length>0){
				for (String formula : formulas) {
					//公式的具体参数
					String[] formulaParas = formula.split("\\|");
					if(formulaParas!=null && formulaParas.length>0){
						String lev = formulaParas[0];
						String scope = formulaParas[1];
						String percentageDiscount = formulaParas[2];
						boolean inScope = isInScope(scope, num);
						if(inScope){
							resultMap.put("LEV", lev);
							if(StringUtils.isNotBlank(percentageDiscount)){
								String[] percentageDiscountArray = percentageDiscount.split("\\/");
								resultMap.put("NUMERATOR", percentageDiscountArray[0]);
								resultMap.put("DENOMINATOR", percentageDiscountArray[1]);
								try{
									percentage = new BigDecimal(percentageDiscountArray[0]).multiply(new BigDecimal(100)).divide(new BigDecimal(percentageDiscountArray[1])).setScale(0, BigDecimal.ROUND_HALF_UP)+"%";
								}catch(Exception e){
									e.printStackTrace();
								}
								resultMap.put("PERCENTAGE", percentage);
							}
							resultMap.put("EFFECTIVE_NUMBER", String.valueOf(num));
							break;
						}
					}
				}
			}
		}
		
		
		if(StringUtils.isBlank(resultMap.get("LEV"))){
			resultMap.put("LEV", "N/A");
			resultMap.put("NUMERATOR", "0");
			resultMap.put("DENOMINATOR", "10000");
			resultMap.put("EFFECTIVE_NUMBER", "0");
			resultMap.put("PERCENTAGE", "0%");
		}
		
		return resultMap;
	}
    
	
	public static void setCommonFields(DataStructInterface data) throws Exception {
		if (null != data) {
			List<String> propertyList = Arrays.asList(data.getPropertyNames());
			if(data.isNew()){
				if (propertyList.contains("CREATE_ORG_ID") && null == data.get("CREATE_ORG_ID")) {
					data.set("CREATE_ORG_ID", new BigDecimal(ServiceManager.getUser().getOrgId()));
				}

				if (propertyList.contains("CREATE_OP_ID") && null == data.get("CREATE_OP_ID")) {
					data.set("CREATE_OP_ID", new BigDecimal(ServiceManager.getUser().getID()));
				}

				if (propertyList.contains("CREATE_DATE") && null == data.get("CREATE_DATE")) {
					data.set("CREATE_DATE", ServiceManager.getOpDateTime());
				}
				if (propertyList.contains("REGION_ID") && null == data.get("REGION_ID")) {
					data.set("REGION_ID", CmCommonUtil.getDefaultRegionId());
				}
			}
			
			if (propertyList.contains("DONE_DATE")) {
				data.set("DONE_DATE", ServiceManager.getOpDateTime());
			}

			if (propertyList.contains("ORG_ID") && ServiceManager.getUser()!=null && ServiceManager.getUser().getOrgId()>0 ) {
				data.set("ORG_ID", new BigDecimal(ServiceManager.getUser().getOrgId()));
			}

			if (propertyList.contains("OP_ID") && ServiceManager.getUser()!=null && ServiceManager.getUser().getID()>0 ) {
				data.set("OP_ID", new BigDecimal(ServiceManager.getUser().getID()));
			}
		}
	}
}
