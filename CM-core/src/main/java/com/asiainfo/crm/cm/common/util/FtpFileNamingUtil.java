package com.asiainfo.crm.cm.common.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.ai.appframe2.util.StringUtils;
import com.ai.omframe.util.TimeUtil;

/**
 * 
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: FtpFileNamingUtil.java
 * @Description: 文件上传文件命名帮助类
 * 
 * @version: v1.0.0
 * @author: zhangxiang3
 * @date: 2012 5 18
 * 
 * Modification History: Date Author Version Description
 * --------------------------------------------------------- v1.0.0
 */
public class FtpFileNamingUtil {

	/**
	 * 获得昨日文件名
	 * 
	 * @param prefix
	 *            前缀
	 * @param suffix
	 *            后缀
	 * @param dateFomate
	 *            日期格式
	 * @return String 文件名
	 * @throws Exception
	 */
	public static String getYestodayFileName(String prefix, String suffix, String dateFomate) throws Exception {
		DateFormat objDateFormat = new SimpleDateFormat(dateFomate);
		String date = objDateFormat.format(TimeUtil.getDefaultSysDate().getTime() - 1000 * 60 * 60 * 24);
		StringBuffer sb = new StringBuffer();
		sb.append(prefix).append(date).append(suffix);
		return sb.toString();
	}

	/**
	 * 获得今日文件名
	 * 
	 * @param prefix
	 *            前缀
	 * @param suffix
	 *            后缀
	 * @param dateFomate
	 *            日期格式
	 * @return String 文件名
	 * @throws Exception
	 */
	public static String getTodayFileName(String prefix, String suffix, String dateFomate) throws Exception {
		DateFormat objDateFormat = new SimpleDateFormat(dateFomate);
		String date = objDateFormat.format(TimeUtil.getDefaultSysDate().getTime());
		StringBuffer sb = new StringBuffer();
		sb.append(prefix).append(date).append(suffix);
		return sb.toString();
	}

	/**
	 * 获得今日文件名
	 * 
	 * @param suffix
	 *            后缀
	 * @param dateFomate
	 *            日期格式
	 * @return String 文件名
	 * @throws Exception
	 */
	public static String getTodayFileName2(String suffix, String dateFomate) throws Exception {
		DateFormat objDateFormat = new SimpleDateFormat(dateFomate);
		String date = objDateFormat.format(TimeUtil.getDefaultSysDate().getTime());
		StringBuffer sb = new StringBuffer();
		sb.append(date).append(suffix);
		return sb.toString();
	}

	public static String getYesTodayFileName2(String suffix, String dateFomate) throws Exception {
		DateFormat objDateFormat = new SimpleDateFormat(dateFomate);
		String date = objDateFormat.format(TimeUtil.getDefaultSysDate().getTime() - 1000 * 60 * 60 * 24);
		StringBuffer sb = new StringBuffer();
		sb.append(date).append(suffix);
		return sb.toString();
	}

	public static String convertFileNameExpr(String nameExpr) throws Exception {
		String expr = "YYYYMMDD-YYYYMMDD";
		if (nameExpr.indexOf("[" + expr + "]") > 0) {
			DateFormat objDateFormat = new SimpleDateFormat("yyyyMMdd");
			String fileNameExp = "";
			fileNameExp = objDateFormat.format(com.ai.common.util.TimeUtil.getCurrentMonthFirstDate(com.ai.common.util.TimeUtil.getPrimaryDataSourceSysDate()));
			fileNameExp = (objDateFormat.format(com.ai.common.util.TimeUtil.getCurrentMonthFirstDate(com.ai.common.util.TimeUtil.getPrimaryDataSourceSysDate())) + "-" + objDateFormat
					.format(com.ai.common.util.TimeUtil.getCurrentMonthEndDate(com.ai.common.util.TimeUtil.getPrimaryDataSourceSysDate())));
			return StringUtils.replace(nameExpr, "[" + expr + "]", fileNameExp);
		}
		throw new Exception("File analytical expression is not configured properly.");
	}

	public static String convertFileNameLastExpr(String nameExpr) throws Exception {
		String expr = "YYYYMMDD-YYYYMMDD";
		if (nameExpr.indexOf("[" + expr + "]") > 0) {
			DateFormat objDateFormat = new SimpleDateFormat("yyyyMMdd");
			String fileNameExp = "";
			fileNameExp = objDateFormat.format(com.ai.common.util.TimeUtil.getBeforeMonthStartDate(com.ai.common.util.TimeUtil.getPrimaryDataSourceSysDate()));
			fileNameExp = (objDateFormat.format(com.ai.common.util.TimeUtil.getBeforeMonthStartDate(com.ai.common.util.TimeUtil.getPrimaryDataSourceSysDate())) + "-" + objDateFormat
					.format(com.ai.common.util.TimeUtil.getCurrentMonthEndDate(com.ai.common.util.TimeUtil.getBeforeMonthStartDate(com.ai.common.util.TimeUtil
							.getPrimaryDataSourceSysDate()))));
			return StringUtils.replace(nameExpr, "[" + expr + "]", fileNameExp);
		}
		throw new Exception("File analytical expression is not configured properly.");
	}

	public static Timestamp getBeforeMonthEndDay(Timestamp date) throws Exception {
		Calendar rightNow = Calendar.getInstance();
		date = com.ai.common.util.TimeUtil.getCurrentMonthFirstDate(date);
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, rightNow.get(Calendar.DAY_OF_MONTH) - 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MILLISECOND, 59);
		return new Timestamp(rightNow.getTimeInMillis());
	}
}
