package com.asiainfo.crm.cm.puremobile.utils;

public class PureMobileConstant {
	
	/**
	 * cm_ins_offerinst_rel 状态
	 */
	public interface CmInsOfferinstRelState{
		public static int VALID = 1;
		public static int INVALID = 0;
	}
	
	/**
	 * cm_ins_offerinst_rel offer区分类型
	 */
	public interface CmInsOfferinstRelSubType{
		public static String NEW_OFFER = "NEW_OFFER";
		public static String SEAT_OFFER = "SEAT_OFFER";
		public static String MainnumberOrWallboard_OFFER = "MainnumberOrWallboard";
	}
	
}
