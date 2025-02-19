package com.asiainfo.crm.cm.bi2oneframe.common;

public class Cm2OneframeConstants {

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmBjConstants
	 * @Description BI给oneframe中的表中的字段字符串
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 6, 2012 3:10:32 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Jun 6, 2012      shitian           v1.0.0               修改原因<br>
	 */
	public interface BI_OF_TABLE_COLUMN {

		/**
		 * 用户不满意总次数
		 */
		public static final String USER_SATISFACTION = "SURVEY_NO_SATI_NUM,SM_NO_SATI_NUM,CALL_NO_SATI_NUM";

		/**
		 * 用户喜好数量
		 */
		public static final String USER_HOBBY = "MMS,QUAN_QU,SHOPPING,CRBT,SPORT,HOT_POINT,FETION,SHOP_CARD,GIFT,MOBIE_GOOD_NEWS,WAP,DALIY_MARKETING,LOTTERY_SALES,CATER,GENERAL_SALES,MOBILE_EMAIL,JOIN_SALES_NUM,CONSULTING,RANK_SALES,MOVIE,FIRST_GET";

		/**
		 * 一个月内电渠接触总次数
		 */
		public static final String USER_CHANN_HOBBY = "WEB_ONLINE_TIMES,SM_CHANNEL_TIMES,IVR_CHANNEL_TIMES,CALL_TIMES,CHANGEL_CALL_TIMES";
	}

}
