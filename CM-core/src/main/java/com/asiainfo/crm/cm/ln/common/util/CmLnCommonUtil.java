package com.asiainfo.crm.cm.ln.common.util;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.bo.BOBsStaticDataBean;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCommonDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmVipScoreRuleValue;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmInterfaceSV;

public class CmLnCommonUtil {

	/**
	 * @Function isSameCenter
	 * @Description 判断是否为同一个中心
	 * 
	 * @param dc
	 * @return ret为真表示在一个中心，为假表示不在一个中心
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 27, 2012 9:12:43 AM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Aug 27, 2012 shitian v1.0.0 修改原因<br>
	 */
	public static boolean isSameCenter(DataStructInterface[] dc) throws Exception {
		// ret为真表示在一个中心，为假表示不在一个中心
		boolean ret = true;
		if (dc == null || dc.length == 0) {
			// 传入对象为空
			ExceptionUtil.throwBusinessException("CMS0071157");
		} else if (dc.length == 1) {
			ret = true;
		} else if (dc.length > 10) {
			ret = false;
		} else {
			int len = dc.length;
			String center = CenterUtil.getCenterByRegionId((String) dc[0].get("USER_REGION_CODE"));
			for (int i = 1; i < len; i++) {
				String otherCenter = CenterUtil.getCenterByRegionId((String) dc[i].get("USER_REGION_CODE"));
				if (!center.equals(otherCenter)) {
					ret = false;
					break;
				}
			}
		}
		return ret;
	}

	/**
	 * @Function initDcProperties
	 * @Description 将ivalue中的属性全部init，目的是在保存历史表的时候，所有的属性都进历史表中
	 * 
	 * @param dc
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 27, 2012 9:14:18 AM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Aug 27, 2012 shitian v1.0.0 修改原因<br>
	 */
	public static void initDcProperties(DataStructInterface dc) throws Exception {
		String[] props = dc.getPropertyNames();
		if (props != null) {
			for (int i = 0, len = props.length; i < len; i++) {
				dc.initProperty(props[i], dc.get(props[i]));
			}
		}
	}

	private transient static Log log = LogFactory.getLog(CmLnCommonUtil.class);

	public static String getQueryCount(String querySql, String conditonSql, Map tableSplit) throws Exception {
		log.debug("querySql:" + querySql);
		log.debug("conditonSql:" + conditonSql);

		StringBuilder sb = new StringBuilder("");
		if (querySql.toUpperCase().contains("SELECT")) {// 查询BO
			if (StringUtils.isNotBlank(conditonSql)) {
				sb.append("SELECT COUNT(*) AS CNT FROM (").append(querySql).append(") T WHERE  1=1 ");
			} else {
				if (querySql.toUpperCase().contains("UNION")) {
					sb.append("SELECT COUNT(*) AS CNT FROM (").append(querySql).append(") T WHERE  1=1 ");
				} else {
					int fromIndex = querySql.toUpperCase().indexOf("FROM");
					if (fromIndex > -1) {
						sb.append("SELECT COUNT(*) AS CNT ").append(querySql.substring(fromIndex, querySql.length()));
					} else {
						sb.append("SELECT COUNT(*) AS CNT FROM (").append(querySql).append(") T WHERE  1=1 ");
					}
				}
			}
		} else {// 单表BO
			sb.append("SELECT COUNT(*) AS CNT FROM ").append(querySql).append(" T WHERE  1=1 ");
		}

		if (StringUtils.isNotBlank(conditonSql)) {
			if (conditonSql.toUpperCase().trim().startsWith("AND")) {
				sb.append(conditonSql);
			} else {
				sb.append(" AND " + conditonSql);
			}
		}

		if (tableSplit == null) {
			tableSplit = new HashMap();
		}
		return SplitTableFactory.createQuerySQL(sb.toString(), tableSplit);
	}

	public static String getQueryResult(String querySql, String conditonSql, int startNum, int endNum, Map tableSplit) throws Exception {
		log.debug("querySql:" + querySql);
		log.debug("conditonSql:" + conditonSql);

		StringBuilder sb = new StringBuilder("");

		if (querySql.toUpperCase().contains("SELECT")) {// 查询BO
			// sb.append("select * from (select t.* from ( ").append(querySql).append(" ) t where 1=1 ");
			if (querySql.toUpperCase().indexOf("WHERE") > -1) {
				sb.append(querySql);
			} else {
				sb.append(querySql).append(" WHERE 1=1 ");
			}

		} else {// 单表BO
			// sb.append("select * from (select t.* from ").append(querySql).append(" t where 1=1 ");
			sb.append(" SELECT * FROM ").append(querySql).append(" T WHERE 1=1 ");
		}

		if (StringUtils.isNotBlank(conditonSql))
			sb.append(conditonSql);

		if (startNum == -1 && endNum == -1) {
			// sb.append(") NM");
		} else {
			// sb.append(") NM");
			if (startNum > 0) {
				sb.append(" LIMIT ").append(startNum - 1).append(",").append(endNum - startNum + 1);
			} else {
				sb.append(" LIMIT ").append(startNum).append(",").append(endNum);
			}
		}

		if (tableSplit == null) {
			tableSplit = new HashMap();
		}
		return SplitTableFactory.createQuerySQL(sb.toString(), tableSplit);
	}

	/**
	 * @Function getRegionId
	 * @Description 获取随即中心
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 1, 2012 10:19:25 AM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Sep 1, 2012 shitian v1.0.0 修改原因<br>
	 */
	public static String getRegionId() throws Exception {
		String[] regionId = CenterUtil.getAllRegionIds();
		SecureRandom r = new SecureRandom();
		return regionId[r.nextInt(regionId.length)];
	}

	public static Timestamp getMaxDate() throws Exception {
		return com.ai.common.util.TimeUtil.getMaxExpire();
	}

	/**
	 * 获取系统时间
	 * 
	 * @Function getSysDateTime
	 * @Description
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 10, 2012 9:44:47 AM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 10, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static Timestamp getSysDateTime() throws Exception {
		return TimeUtil.getPrimaryDataSourceSysDate();
	}

	/**
	 * 得到昨天日期，格式yyyy-MM-dd。
	 * 
	 * @Function getYesterday
	 * @Description
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 10, 2012 9:44:47 AM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 10, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static String getYesterday() {
		return getDateDay(1);
	}

	/**
	 * 获得当前天往前相加的天数 或者往后相加的天数
	 * 
	 * @param day
	 *            day为正直 往前推算 day为负值 往后推算
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 10, 2012 9:44:47 AM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 10, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static String getDateDay(int day) {
		Date cDate = new Date();
		day = day * 24;
		cDate.setTime(cDate.getTime() - day * 3600 * 1000);
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 获得当前月份的上月或者下月
	 * 
	 * @param day
	 *            day为正直 往前推算 day为负值 往后推算
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 10, 2012 9:44:47 AM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 10, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static String getDateMonthDay(int month) throws Exception {
		Timestamp sysDate = ServiceManager.getOpDateTime();
		Date date = addOrMinusMonth(sysDate.getTime(), month);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
		String timestamp = dateFormat.format(date);
		return timestamp;
	}

	/**
	 * 在一个时间上加上对应的月份数
	 * 
	 * @param ti
	 *            long
	 * @param i
	 *            int
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
	 * 根据指定的日期获取下个月指定的天数
	 * 
	 * @param date
	 * @return
	 * @author shaosm
	 * @throws ParseException
	 */
	public static Timestamp getDateOfNextMonthFirstDay(Date date, int day) throws ParseException {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, day);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH) + 1);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 将当前时间转换为字符串格式yyyyMM
	 * 
	 * @Function getDateTimeString
	 * @Description
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 29, 2012 5:42:34 PM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 29, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static String getDateTimeYYYMM() throws Exception {
		Timestamp sysDate = getSysDateTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMM");
		return dateFormat.format(sysDate);
	}

	/**
	 * 将当前时间转换为字符串格式yyyyMMdd
	 * 
	 * @Function getDateTimeString
	 * @Description
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 29, 2012 5:42:34 PM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 29, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static String getDateTimeYYYMMDD() throws Exception {
		Timestamp sysDate = getSysDateTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		return dateFormat.format(sysDate);
	}

	/**
	 * 将当前时间转换为字符串格式yyyy-MM-dd
	 * 
	 * @Function getDateTimeYYYYMMDD
	 * @Description
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 29, 2012 5:42:34 PM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 29, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static String getDateTimeYYYYMMDD() throws Exception {
		Timestamp sysDate = getSysDateTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
		return dateFormat.format(sysDate);
	}

	/**
	 * 将当前时间转换为字符串格式yyyy-MM-dd
	 * 
	 * @Function getDateTime
	 * @Description
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 29, 2012 5:42:34 PM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 29, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static String getDateTime() throws Exception {
		String sysDate = getSysDateTime().toString();
		return sysDate.substring(0, 10);
	}

	/**
	 * 获取级联下拉列表静态数据
	 * 
	 * @Function: getStaticDataByParent
	 * @Description: 获取级联下拉列表静态数据
	 * 
	 * @param isChoose
	 *            是否需要" "选项
	 * @param codeType
	 *            静态数据类型
	 * @param parent
	 *            上级codeValue
	 * @return 静态数据
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 20, 2011 2:14:00 PM
	 * 
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------* May 20,
	 *        2011 huzq2 v1.0.0 修改原因
	 */
	public static IBOBsStaticDataValue[] getStaticDataByParent(boolean isChoose, String codeType, String parentCodeValue) throws Exception {
		IBOBsStaticDataValue[] result = null;
		// 针对集团重要行业类型，增加“否”选项，默认isChoose=false
		result = CmStaticDataUtil.genStaticDataDs(isChoose, new StringBuffer(codeType).append("_").append(parentCodeValue).toString());
		if (result != null && result.length > 0) {
			return result;
		}
		int length = (result == null) ? 0 : result.length;
		IBOBsStaticDataValue[] tmp = new IBOBsStaticDataValue[length + 1];
		// 生成“所有”节点
		tmp[length] = new BOBsStaticDataBean();
		tmp[length].setCodeType(codeType);
		tmp[length].setCodeName("No");
		tmp[length].setCodeValue("-3");
		tmp[length].setSortId(-3);
		tmp[length].setState("U");
		// 将真实的静态数据拷贝到"请选择…"节点之后
		if (length > 0) {
			System.arraycopy(result, 0, tmp, 0, length);
		}
		result = tmp;

		return result;
	}

	/**
	 * 获得VIP扣减积分值
	 * 
	 * @Function getVipScoreRul
	 * @Description
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 29, 2012 5:42:34 PM
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       Feb 29, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static long getVipScoreRul(long serviceType, long ServiceLevel, int isVip, int onLineTime) throws Exception {
		ICmCommonDAO cmCommonDao = (ICmCommonDAO) ServiceFactory.getService(ICmCommonDAO.class);
		IBOCmVipScoreRuleValue[] iboCmVip = cmCommonDao.getCmVipScoreRuleClass();
		long vipScore = 0;
		for (int i = 0; i < iboCmVip.length; i++) {
			if (iboCmVip[i].getServiceType() == serviceType && iboCmVip[i].getServiceLevel() == ServiceLevel && iboCmVip[i].getIsVip() == isVip
					&& iboCmVip[i].getOnlineTime() == onLineTime) {
				vipScore = iboCmVip[i].getNeedScore();
				break;
			}
		}
		return vipScore;
	}

	/**
	 * 根据地市类型和地市编码获得片区对象信息
	 * 
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
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2012-5-7 kangzk v1.0.0 修改原因<br>
	 */
	// public static IBOSecOwerareaValue[] getCommonDistrictsByParentCode(String
	// parentCode, int parentType) throws
	// Exception {
	// /*根据传入的district_code和queryType，查询下级的district_code和district_name
	// queryType取值为（2：地市；3：区县；4：片区；5：乡镇；6：行政村）
	// OrgmodelClient.getOwerareaByParentIdAndType*/
	// ISec2CmSV isec=(ISec2CmSV)ServiceFactory.getService(ISec2CmSV.class);
	// IBOSecOwerareaValue[] SecOwerareaValue =
	// isec.getOwerareaByParentIdAndType(parentCode,parentType);
	// if (SecOwerareaValue != null) {
	// return SecOwerareaValue;
	// }
	// return new IBOSecOwerareaValue[0];
	// }

	// 生成银行托收协议号
	public static String dealBankContract(int custType, IAcctPaymentValue value) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("\n\n dealBankContract---------------------------------------------------------------");
			log.debug("isDelete:" + value.isDeleted());
			log.debug("isNew:" + value.isNew());
			log.debug("isMod:" + value.isModified());
		}

		if (value == null)
			return "";

		// 不是银行托收,直接返回
		if (value.getPayMethod() != CmConstants.CmAccountPayMethod.CM_ACCOUNT_PAY_METHOD_21)
			return "";

		if (value.isDeleted()) {
			return "";
		} else if (value.isModified()) {
			if (value.isPropertyModified("PAY_METHOD")) {

			} else {
				if (value.getBankContract() != null && !value.getBankContract().trim().equals(""))
					return value.getBankContract().trim();
			}
		} else if (value.isNew()) {

		} else// 没有修改支付方案信息,并且有值直接返回
		{
			if (value.getBankContract() != null && !value.getBankContract().trim().equals(""))
				return value.getBankContract().trim();
		}

		String regionId = null;

		if (value.getRegionId() != null && !value.getRegionId().equals("")) {
			regionId = value.getRegionId();
		} else if (value.getAcctId() > 0) {
			regionId = CenterUtil.getRegionIdByAcctId(value.getAcctId());
		}

		if (regionId == null || regionId.equals(""))
			return "";

		StringBuilder sb = new StringBuilder("");

		if (custType == CmConstants.CustomerType.GROUP) {
			/*
			 * 沈阳 手工输入 其他地市 自动生成 生成规则： 普通托收合同号编码 select
			 * to_char(ZK.SEQ_TRUST_ACCT_ID.NEXTVAL) next_value from dual
			 * （老系统的序列，可以新增一个新的序列） 最终生成托收合同号：4100000000295532 前3位 地市编码， 后面13位序列
			 */
			if (!"240".equals(regionId)) {
				sb.append(regionId).append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_GROUP").toUpperCase()).longValue()), 13));
				value.setBankContract(sb.toString());
			}
		} else if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			if ("240".equals(regionId))// 沈阳
			{
				// TODO 手动输入
				/*
				 * 托收协议号共29位， 第1位至第12位1是企业开户银行行号， 第13位至22位是付款人组织机构代码证编号，
				 * 第23位至27位是移动项目代码00403，第28位至29位是序列号。
				 */
			} else if ("411".equals(regionId)) // 大连
			{
				/*
				 * 托收协议号共16位，前7位为我公司在人民银行统一代收付系统的代码“2220008”，
				 * 中间3位为用户开户行行号，最后6位为系统随机产生的流水号。
				 */
				if (value.getPaymentBankCode() != null && value.getPaymentBankCode().length() > 0) {
					String bankCode = null;
					if (value.getPaymentBankCode().length() > 3)
						bankCode = value.getPaymentBankCode().substring(0, 3);
					else
						bankCode = value.getPaymentBankCode();

					sb.append("2220008").append(getZeroLength(bankCode, 3))
							.append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 6));
					value.setBankContract(sb.toString());
				}
			} else if ("412".equals(regionId)) // 鞍山
			{
				/*
				 * 托收协议号共16位，前11位为人民银行分配小额支付代码“22300010000”，最后5位为移动公司排序的流水号。
				 */
				sb.append("22300010000").append(
						getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 5));
				value.setBankContract(sb.toString());
			} else if ("413".equals(regionId)) // 抚顺
			{
				/*
				 * 托收协议号共16位，前6位为我公司在人民银行统一代收付系统的代码“224003”，最后10位为按顺序排序产生的流水号。
				 */
				sb.append("224003").append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 10));
				value.setBankContract(sb.toString());
			} else if ("414".equals(regionId)) // 本溪
			{
				/*
				 * 托收协议号共16位，前7位为我公司在人民银行统一代收付系统的代码“2250010”，中间3位为用户开户行行号，
				 * 最后6位为系统随机产生的流水号。
				 */
				if (value.getPaymentBankCode() != null && value.getPaymentBankCode().length() > 0) {
					String bankCode = null;
					if (value.getPaymentBankCode().length() > 3)
						bankCode = value.getPaymentBankCode().substring(0, 3);
					else
						bankCode = value.getPaymentBankCode();

					sb.append("2250010").append(getZeroLength(bankCode, 3))
							.append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 6));
					value.setBankContract(sb.toString());
				}
			} else if ("415".equals(regionId)) // 丹东
			{
				/*
				 * 托收协议号码由16位组成，前7位为我公司在人民银行统一代收付系统的代码:2260101，后九位为随机产生的流水号。例如：
				 * 2260101000000123
				 */
				sb.append("2260101").append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 9));
				value.setBankContract(sb.toString());
			} else if ("416".equals(regionId)) // 锦州
			{
				/*
				 * 托收协议号共16位“2270006000XXXXXX”，前7位为我公司在人民银行统一代收付系统的代码“2270006”中间3位为
				 * “000”最后6位为系统随机产生的流水号。
				 */
				sb.append("2270006").append("000")
						.append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 6));
				value.setBankContract(sb.toString());
			} else if ("417".equals(regionId)) // 营口
			{
				/*
				 * 托收协议号共16位，前7位为我公司在人民银行统一代收付系统的代码“2280001”，
				 * 剩余号码为托收用户的排列顺序，按号码的递增排列。目前已使用到000000224号。
				 */
				sb.append("2280001").append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 9));
				value.setBankContract(sb.toString());
			} else if ("418".equals(regionId)) // 阜新
			{
				/*
				 * 托收协议号共16位，在2290010000000001至2290010000000999 人工按顺序为托收用户排列
				 */
				sb.append("229001").append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 10));
				value.setBankContract(sb.toString());
			} else if ("419".equals(regionId)) // 辽阳
			{
				/*
				 * 托收协议号共16位，前7位为我公司在人民银行统一代收付系统的代码“2310043”，中间3位为用户开户行行号，
				 * 最后6位为系统随机产生的流水号。
				 */
				if (value.getPaymentBankCode() != null && value.getPaymentBankCode().length() > 0) {
					String bankCode = null;
					if (value.getPaymentBankCode().length() > 3)
						bankCode = value.getPaymentBankCode().substring(0, 3);
					else
						bankCode = value.getPaymentBankCode();

					sb.append("2310043").append(getZeroLength(bankCode, 3))
							.append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 6));
					value.setBankContract(sb.toString());
				}
			} else if ("421".equals(regionId)) // 朝阳
			{
				// TODO
				/*
				 * 由16位数字组成，第1位至第11位每个托收行都一样，后5位按不同行代码依次生成。例：
				 * 工行春风支行2340005000013001依次生成、
				 * 工行新华支行2340005000009001依次生成、建行三燕支行2340005000003002依次生成
				 * 、营州信用社2340005000028001依次生成
				 */
				sb.append("23400050000").append(
						getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 5));
				value.setBankContract(sb.toString());
			} else if ("410".equals(regionId)) // 铁岭
			{
				/*
				 * 托收协议号共16位，前7位为我公司在建行统一代收付系统的代码“2330008”，中间3位为用户开户行行号，
				 * 最后6位为系统随机产生的流水号。
				 */
				if (value.getPaymentBankCode() != null && value.getPaymentBankCode().length() > 0) {
					String bankCode = null;
					if (value.getPaymentBankCode().length() > 3)
						bankCode = value.getPaymentBankCode().substring(0, 3);
					else
						bankCode = value.getPaymentBankCode();

					sb.append("2330008").append(getZeroLength(bankCode, 3))
							.append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 6));
					value.setBankContract(sb.toString());
				}

			} else if ("427".equals(regionId)) // 盘锦
			{
				/*
				 * 托收协议号共16位，前7位为我公司在建设银行统一代收付系统的代码“2320004”，中间3位为用户开户行行号，
				 * 最后6位为系统随机产生的流水号。
				 */
				if (value.getPaymentBankCode() != null && value.getPaymentBankCode().length() > 0) {
					String bankCode = null;
					if (value.getPaymentBankCode().length() > 3)
						bankCode = value.getPaymentBankCode().substring(0, 3);
					else
						bankCode = value.getPaymentBankCode();

					sb.append("2320004").append(getZeroLength(bankCode, 3))
							.append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 6));
					value.setBankContract(sb.toString());
				}

			} else if ("429".equals(regionId)) // 葫芦岛
			{
				/*
				 * 托收协议号共16位，前7位为我公司在人民银行统一代收付系统的代码“2276003”，中间3位为用户开户行行号，
				 * 最后6位为系统随机产生的流水号。
				 */
				if (value.getPaymentBankCode() != null && value.getPaymentBankCode().length() > 0) {
					String bankCode = null;
					if (value.getPaymentBankCode().length() > 3)
						bankCode = value.getPaymentBankCode().substring(0, 3);
					else
						bankCode = value.getPaymentBankCode();

					sb.append("2276003").append(getZeroLength(bankCode, 3))
							.append(getZeroLength(String.valueOf(ServiceManager.getIdGenerator().getNewId(("CM_BANKCONTRACT_" + regionId).toUpperCase()).longValue()), 6));
					value.setBankContract(sb.toString());
				}
			}
		}

		return value.getBankContract();
	}

	public static String getZeroLength(String source, int length) {
		if (length < 0)
			return source;

		StringBuilder sb = new StringBuilder("");
		int sourceLength = -1;

		if (source == null || "".equals(source)) {
			sourceLength = 0;
		} else {
			sourceLength = source.length();
		}

		for (int i = sourceLength; i < length; i++) {
			sb.append("0");
		}
		sb.append(source);

		return sb.toString();
	}

	public static Boolean delManagerRel(long managerId, String managerType) throws Exception {
		ICmInterfaceSV sv = (ICmInterfaceSV) ServiceFactory.getService(ICmInterfaceSV.class);
		return sv.delManagerRel(managerId, managerType);
	}

}
