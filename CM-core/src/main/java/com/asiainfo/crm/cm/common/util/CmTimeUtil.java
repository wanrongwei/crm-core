package com.asiainfo.crm.cm.common.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang.time.DateUtils;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.cache.impl.SysDateCacheImpl;
import com.ai.appframe2.complex.datasource.DataSourceFactory;
import com.ai.common.i18n.BusinessException;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.common.notes.tl.util.StringUtil;

public class CmTimeUtil {

	/**
	 * 获取数据库系统时间
	 * @return
	 * @throws Exception
	 */
	public java.sql.Timestamp getSysdate() throws Exception {
		return null;
	}

	/**
	 * 在一个时间上加上对应的年
	 * @param ti long
	 * @param i int
	 * @throws Exception
	 * @return Date
	 */
	public static Date addOrMinusYear(long ti, int i) throws Exception {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(GregorianCalendar.YEAR, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上对应的月份数
	 * @param ti long
	 * @param i int
	 * @throws Exception
	 * @return Date
	 */
	public static Date addOrMinusMonth(long ti, int i) throws Exception {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(GregorianCalendar.MONTH, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去周
	 * @param ti long
	 * @param i int
	 * @return Date
	 */
	public static Date addOrMinusWeek(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(GregorianCalendar.WEEK_OF_YEAR, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去天数
	 * @param ti long
	 * @param i int
	 * @return Date
	 */
	public static Date addOrMinusDays(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(GregorianCalendar.DAY_OF_MONTH, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去小时
	 * @param ti long
	 * @param i int
	 * @return Date
	 */
	public static Date addOrMinusHours(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(GregorianCalendar.HOUR, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去分钟
	 * @param ti long
	 * @param i int
	 * @return Date
	 */
	public static Date addOrMinusMinutes(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(GregorianCalendar.MINUTE, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去秒数
	 * @param ti long
	 * @param i int
	 * @return Date
	 */
	public static Date addOrMinusSecond(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(GregorianCalendar.SECOND, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 两个日期之间的年数
	 * @param start Date
	 * @param end Date
	 * @return int
	 */
	public static int yearsBetween(Date start, Date end) {
		return Years.yearsBetween(LocalDate.fromDateFields(start), LocalDate.fromDateFields(end)).getYears();
	}

	/**
	 * 两个日期之间的月数
	 * @param start Date
	 * @param end Date
	 * @return int
	 */
	public static int monthsBetween(Date start, Date end) {
		return Months.monthsBetween(LocalDate.fromDateFields(start), LocalDate.fromDateFields(end)).getMonths();
	}

	/**
	 * 两个日期之间的周数
	 * @param start Date
	 * @param end Date
	 * @return int
	 */
	public static int weeksBetween(Date start, Date end) {
		return Weeks.weeksBetween(LocalDate.fromDateFields(start), LocalDate.fromDateFields(end)).getWeeks();
	}

	/**
	 * 两个日期之间的天数
	 * @param start Date
	 * @param end Date
	 * @return int
	 */
	public static int daysBetween(Date start, Date end) {
		return Days.daysBetween(LocalDate.fromDateFields(start), LocalDate.fromDateFields(end)).getDays();
	}

	/**
	 * 两个日期之间的小时数
	 * @param start Date
	 * @param end Date
	 * @return int
	 */
	public static int hoursBetween(Date start, Date end) {
		return Hours.hoursBetween(LocalDate.fromDateFields(start), LocalDate.fromDateFields(end)).getHours();
	}

	/**
	 * 两个日期之间的分钟数
	 * @param start Date
	 * @param end Date
	 * @return int
	 */
	public static int minutesBetween(Date start, Date end) {
		return Minutes.minutesBetween(LocalDate.fromDateFields(start), LocalDate.fromDateFields(end)).getMinutes();
	}

	/**
	 * 两个日期之间的秒数
	 * @param start Date
	 * @param end Date
	 * @return int
	 */
	public static int secondsBetween(Date start, Date end) {
		return Seconds.secondsBetween(LocalDate.fromDateFields(start), LocalDate.fromDateFields(end)).getSeconds();
	}

	/**
	 * 根据指定的日期获取下个月的第一天的时间
	 * @param date
	 * @return
	 * @author shaosm
	 */
	public static Timestamp getDateOfNextMonthFirstDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH) + 1);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定的日期获取上个月的第一天的时间
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp getDateOfPreMonthFirstDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH) - 1);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 将带有时间类型的日期转换成不带时间的日期
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp formatDateTimeToDate(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取该月的最后一天的最后时间点
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp getDateOfCurrentMonthEndDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, rightNow.getActualMaximum(Calendar.DAY_OF_MONTH));
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取当天的最后的时间点
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp getLastDate(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取前一天的最后的时间点
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp getPreLastDate(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, rightNow.get(Calendar.DAY_OF_MONTH) - 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取下一天的开始的时间点
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp getNextDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, rightNow.get(Calendar.DAY_OF_MONTH) + 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 将时间格式化为YYYY-MM-DD
	 * @param date
	 * @return
	 */
	public static String getYYYYMMDD(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		return dateformat.format(date);
	}

	/**
	 * 将时间格式化为YYYY-MM-DD
	 * @param date
	 * @return
	 */
	public static String getNoLineYYYYMMDD(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
		return dateformat.format(date);
	}

	/**
	 * 将时间格式化为YYYYMM
	 * @param date
	 * @return
	 */
	public static String getNoLineYYYYMM(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyyMM");
		return dateformat.format(date);
	}

	/**
	 * 将时间格式化为YYYY-MM-DD
	 * @param date
	 * @return
	 * @author wenhl
	 */
	public static String getTimeYYYYMMDD(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		return dateformat.format(date);
	}

	/**
	 * 将时间格式化为YYYY-MM-DD-HH-MM-SS
	 * @param date
	 * @return
	 */
	public static String getNoLineYYYYMMDDHHMISS(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyyMMddHH24MMSS");
		return dateformat.format(date);
	}

	/**
	 * 将时间格式化为yyyyMMdd HH:mm:ss
	 * @param date
	 * @return
	 */
	public static String getNoLineYYYYMMDDHHMMSS(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		return dateformat.format(date);
	}

	/**
	 *
	 * @throws Exception
	 * @return Timestamp
	 */
	public static Timestamp getDefaultSysDate() throws Exception {
		Timestamp rtn;
		if (CacheFactory._getCacheInstances().containsKey(SysDateCacheImpl.class)) {
			rtn = ServiceManager.getIdGenerator().getSysDate(DataSourceFactory.getDataSource().getPrimaryDataSource());
		} else {
			rtn = new Timestamp(System.currentTimeMillis());
		}
		return rtn;
	}

	/**
	 * 处理计费月时间
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	public static Timestamp getBillMonthDate(Date beginDate, Date endDate) {
		if (null == beginDate) {
			return null;
		}
		// 获取结束时间的月底时间
		Timestamp monthEndDate = new Timestamp(CmTimeUtil.addOrMinusDays(CmTimeUtil.getDateOfNextMonthFirstDay(endDate).getTime(), -1).getTime());
		return new Timestamp(monthEndDate.getTime());
	}

	/**
	 * 将指定的日期取整
	 * @param date
	 * @return
	 * @author shaosm
	 */
	public static Timestamp getTruncDate(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定的日期获取月的第一天的时间
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp getDateOfMonthFirstDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取最后时间点
	 *
	 * @param date
	 * @return
	 */
	public static Timestamp getDateOfCurrentEndDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	public static Date parseYYYYDate(String date) throws Exception {
		/**
		 * 确保pattern中，yyyy-MM在yyyyMMdd最前面，yyyyMMdd也能够匹配2009-10,且匹配出的结果是不正确的时间
		 */
		String[] pattern = new String[] { "yyyy-MM", "yyyyMM", "MM/yyyy", "yyyyMMdd", "yyyy-MM-dd", "MM/dd/yyyyy", "yyyyMMddHHmmss", "yyyy-MM-dd HH:mm:ss", "MM/dd/yyyy HH:mm:ss" };
		return DateUtils.parseDate(date, pattern);
	}

	public static Date parseYYDate(String date) throws Exception {
		/**
		 * 确保pattern中，yy-MM在yyMMdd最前面，yyMMdd也能够匹配09-10,且匹配出的结果是不正确的时间
		 */
		String[] pattern = new String[] { "yy-MM", "yyMM", "MM/yy", "yyMMdd", "yy-MM-dd", "MM/dd/yy", "yyMMddHHmmss", "yy-MM-dd HH:mm:ss", "MM/dd/yy HH:mm:ss" };
		return DateUtils.parseDate(date, pattern);
	}

	public static Timestamp get2099LastTime() throws Exception {
		return getLastTimeOfYear(2099);
	}

	public static Timestamp getLastTimeOfYear(int year) throws Exception {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return new Timestamp(format.parse(year + "-12-31 23:59:59").getTime());
	}

	/*
	 * 得到某一日期的下个月的开始日期
	 * param dateString 格式yyyyMMdd
	 * return 8位日期值
	 */
	public static String getBeginningDateOfLastMonth(String dateString) {
		String lastYear = getLastYear(dateString);// 该日期下年年份
		String lastMonth = getLastMonth(dateString);// 改日期下月月份
		if ("01".equals(lastMonth)) {
			return lastYear + "-" + lastMonth + "-01 00:00:00";
		} else {
			return dateString.substring(0, 5) + lastMonth + "-01 " + "00:00:00";
		}
	}

	public static int getEndDateOfCurMonth(String billingCycleId) throws ParseException, BusinessException {
		if (StringUtil.isBlank(billingCycleId) || !billingCycleId.matches("[0-9]{6}")) {
			ExceptionUtil.throwBusinessException("AMS1300405");
		}
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		java.util.Date date = sdf.parse(billingCycleId);
		cal.setTime(date);
		cal.roll(Calendar.DATE, false);
		return cal.get(Calendar.DATE);
	}

	// 得到某个日期下一年的年份
	public static String getLastYear(String dateString) {
		String currentYear = dateString.substring(0, 4);// 该日期的所在年份
		return String.valueOf(Integer.parseInt(currentYear) + 1);
	}

	// 得到某个日期下月的月份
	public static String getLastMonth(String dateString) {
		String currentMonth = dateString.substring(5, 7);// 改日期所在月份
		if ("12".equals(currentMonth)) {
			currentMonth = "01";
		} else if (Integer.parseInt(currentMonth) > 10) {
			currentMonth = String.valueOf(Integer.parseInt(currentMonth) + 1);
		} else {
			currentMonth = "0" + (Integer.parseInt(currentMonth) + 1);
		}
		return currentMonth;
	}

	/**
	 * 获取两个时间之间的相差月份数
	 * @throws java.text.ParseException
	 */
	public static int getMonthSpace(String date1, String date2) throws ParseException {
		int result = 0;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.setTime(sdf.parse(date1));
		c2.setTime(sdf.parse(date2));

		if (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)) {
			result = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
		} else {
			result = 12 * (c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR)) + c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
		}
		return result == 0 ? 0 : Math.abs(result);
	}

	/**
	 * 获取两个时间之间的相差月份数
	 * @throws ParseException
	 */
	public static int getMonthSpace(Timestamp date1, Timestamp date2) throws ParseException {
		int result = 0;

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(date1);
		c2.setTime(date2);

		if (c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)) {
			result = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
		} else {
			result = 12 * (c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR)) + c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
		}
		return result == 0 ? 0 : Math.abs(result);
	}

	/**
	 * 月份相加
	 * @Function: DateAddMonth
	 *
	 * @param time
	 * @param month
	 * @return
	 *
	 * @version: v1.0.0
	 * @author: wangxw3
	 * @date: 2012-10-28 上午10:50:09
	 */
	public static Timestamp timeAddMonth(Timestamp time, int month) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		cal.add(Calendar.MONTH, month);
		return new Timestamp(cal.getTimeInMillis());
	}

	/**
	 * 
	 * @Function changeDateFormat
	 * @Description  时间格式转换
	 *
	 * @param dateString 要转换的初始值
	 * @param formate1  初始值格式
	 * @param formate2  转换后的格式
	 * @return
	 * @throws ParseException
	 *
	 * @version v1.0.0
	 * @author lilong
	 */
	public static String changeDateFormat(String dateString, String formate1, String formate2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(formate1);
		Date date;
		if (dateString == null || "".equals(dateString.trim())) {
			date = new Date();
		} else {
			date = sdf.parse(dateString);
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat(formate2);
		return sdf2.format(date);

	}

	public static int getDayForWeek(String date, String formate) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(date));
		int dayForWeek = 0;
		if (c.get(Calendar.DAY_OF_WEEK) == 1) {
			dayForWeek = 7;
		} else {
			dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		}
		return dayForWeek;
	}

	public static Date transferString2Date(String s) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(s);
	}
}
