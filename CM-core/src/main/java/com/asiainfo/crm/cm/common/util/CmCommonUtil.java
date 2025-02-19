package com.asiainfo.crm.cm.common.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.set.FieldTypeDB;
import com.ai.appframe2.set.FieldTypeSetDB;
import com.ai.appframe2.set.FieldTypeSetDBFactory;
import com.ai.appframe2.util.locale.AppframeLocaleFactory;
import com.ai.common.cache.BsFtpCacheImpl;
import com.ai.common.cache.BsFtpPathCacheImpl;
import com.ai.common.cache.BsParaDetailCacheImpl;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsFtpPathValue;
import com.ai.common.ivalues.IBOBsFtpValue;
import com.ai.common.ivalues.IBOBsParaDetailValue;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.service.base.interfaces.ICommonSV;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.FtpUtil;
import com.ai.common.util.SNUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.client.SecframeClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.ailk.common.bo.BsResource;
import com.ailk.common.cache.MultilingualStaticI18nResourceCacheImpl;
import com.asiainfo.crm.ci.inter.out.bo.CustomerInteractionBean;
import com.asiainfo.crm.ci.inter.out.service.interfaces.ICustomerInteractionSV;
import com.asiainfo.crm.cm.common.CmBusinessOperation;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmRecordLog;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.config.CmConfigLoader;
import com.asiainfo.crm.cm.common.config.bean.CmIdGenerator;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTableAttrValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmDefaultRegionIdGetter;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmContactContMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFileSyncErrLogBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.common.util.CmLnFTPPath;
import com.asiainfo.crm.cm.model.ivalues.IClubActionValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.util.RBossUtil;
import com.asiainfo.isub.base.common.DataTypeUtils;
import com.asiainfo.push.inter.client.PushClient;

/**
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName CmCommonUtil
 * @Description 该类的功能描述
 * 
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-13 下午1:34:23
 * 
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* 2011-12-13 huzq2
 * v1.0.0 修改原因
 */
public class CmCommonUtil {

	private static transient Log log = LogFactory.getLog(CmCommonUtil.class);

	/**
	 * 存放当前事务的默认地市
	 */
	private static ThreadLocal defaultRegionId = new ThreadLocal();

	/**
	 * 从当前线程中获取已设置的地市编号，保证在同一个事务中使用同一个地市编码。
	 * 
	 * @Function getDefaultRegionId
	 * @Description
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 上午10:23:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-22 huzq v1.0.0 修改原因<br>
	 */
	public static String getDefaultRegionId() throws Exception {
		String regionId = (String) defaultRegionId.get();
		if (StringUtils.isBlank(regionId)) {
			String regionGetter = CmConfigLoader.getInstance().getDefaultRegionGetter();
			ICmDefaultRegionIdGetter getter = null;
			if (StringUtils.isNotBlank(regionGetter)) {
				getter = (ICmDefaultRegionIdGetter) ServiceFactory.getSeviceOfLocal(regionGetter);
			} else {
				getter = (ICmDefaultRegionIdGetter) ServiceFactory.getSeviceOfLocal(ICmDefaultRegionIdGetter.class);
			}
			regionId = getter.getDefaultRegionId();
			defaultRegionId.set(regionId);
		}
		// 需要判断当前是否设置中心，如果设置了则需要判断是否同一个地市，如果不是则需要修改线程变量中的值，重新获取一下。解决使用线程池的时候会互相影响的问题。
		if (CenterFactory.isSetCenterInfo()) {
			if (!StringUtils.equals(regionId, CenterFactory.getCenterInfo().getRegion())) {
				String regionGetter = CmConfigLoader.getInstance().getDefaultRegionGetter();
				ICmDefaultRegionIdGetter getter = null;
				if (StringUtils.isNotBlank(regionGetter)) {
					getter = (ICmDefaultRegionIdGetter) ServiceFactory.getSeviceOfLocal(regionGetter);
				} else {
					getter = (ICmDefaultRegionIdGetter) ServiceFactory.getSeviceOfLocal(ICmDefaultRegionIdGetter.class);
				}
				regionId = getter.getDefaultRegionId();
				defaultRegionId.set(regionId);
			}
		}
		return regionId;
	}

	/**
	 * 设置当前事务的regionId
	 * 
	 * @Function setDefaultRegionId
	 * @Description
	 * 
	 * @param regionId
	 * 
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 上午10:25:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-22 huzq v1.0.0 修改原因<br>
	 */
	public static void setDefaultRegionId(String regionId) {
		defaultRegionId.set(regionId);
	}

	/**
	 * @Title: getDataContainers
	 * @Description: 将Bean或Value对象/数组/列表转换为DataContainer数组
	 * @param object
	 *            Bean或Value对象/Bean或Vlaue对象数组/Bean或Value对象List
	 * @param addProps
	 *            需要额外增加的字段和值
	 * @return
	 * @throws Exception
	 */
	public static DataContainer[] getDataContainers(Object object, HashMap addProps) throws Exception {
		if (object == null) {
			return new DataContainer[0];
		}

		/* 将传入的对象全部转换为数组 */
		Object[] temp = null;
		if (object.getClass().isArray()) {
			temp = (Object[]) object;
		} else if (object instanceof List) {
			temp = ((List) object).toArray();
		} else {
			temp = new Object[] { object };
		}

		/* 生成DataContainer数组对象 */
		int length = temp.length;
		DataContainer[] dcs = new DataContainer[length];
		for (int i = 0; i < length; i++) {
			if (temp[i] != null) {
				Class clazz = temp[i].getClass();
				if (ClassUtils.isAssignable(clazz, DataContainer.class)) {
					Method propMethod = clazz.getMethod("getPropertyNames", new Class[] {});
					String[] props = (String[]) propMethod.invoke(temp[i], new Object[] {});

					Method getMethod = clazz.getMethod("get", new Class[] { String.class });
					dcs[i] = new DataContainer();
					for (int j = 0, size = props.length; j < size; j++) {
						dcs[i].set(props[j], getMethod.invoke(temp[i], new Object[] { props[j] }));
					}
					// 对dcs中需要增加的字段进行赋值
					if (addProps != null) {
						for (Iterator iterator = addProps.entrySet().iterator(); iterator.hasNext();) {
							Entry entry = (Entry) iterator.next();
							dcs[i].set(String.valueOf(entry.getKey()), entry.getValue());
						}
					}
				} else {
					ExceptionUtil.throwBusinessException("CMS0000160");
				}
			}
		}
		return dcs;
	}

	/**
	 * 获取DataContainer数组的老数据放置到一个new的DataContainer容器中
	 * 
	 * @param orginDcs
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 24, 2012 10:14:50 AM
	 */
	public static DataContainer getOldProperties(DataContainer[] orginDcs) throws Exception {
		if (orginDcs == null || orginDcs.length <= 0) {
			return null;
		}
		HashMap allProperties = new HashMap();
		for (int i = 0; i < orginDcs.length; i++) {
			allProperties.putAll(orginDcs[i].getOldProperties());
		}
		DataContainer result = new DataContainer();
		for (Iterator iterator = allProperties.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry name = (Map.Entry) iterator.next();
			if (name != null) {
				if (name.getKey() != null && name.getValue() != null) {
					String key = name.getKey().toString().trim();
					String value = name.getValue().toString().trim();
					if (StringUtils.isNotBlank(key) && StringUtils.isNotBlank(value)) {
						result.set(key.toUpperCase(), value);
					}
				}
			}
		}
		return result;
	}

	/**
	 * @Title: closeJDBC
	 * @Description: 关闭数据库相关资源
	 * @param conn
	 * @param sta
	 * @param rs
	 */
	public static void closeJDBC(Connection conn, Statement sta, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000161"), e);
				}
			}
		}
		if (sta != null) {
			try {
				sta.close();
			} catch (SQLException e) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000162"), e);
				}
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000163"), e);
				}
			}
		}
	}

	/**
	 * @Title: getUserParams
	 * @Description: 解析自定义的参数
	 * @param paramStr
	 * @return
	 * @throws Exception
	 */
	public static Map getUserParams(String paramStr) throws Exception {
		Map result = null;
		if (com.ai.appframe2.util.StringUtils.isEmptyString(paramStr)) {
			return result;
		}
		result = new HashMap();
		String[] params = paramStr.split("&"); // 多个参数以&分隔
		if (params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				if (params[i].indexOf("=") > 0) { // 符合code=value格式时
					String[] keyValue = params[i].split("=");
					result.put(keyValue[0].trim(), keyValue[1].trim());
				}
			}
		}
		return result;
	}

	/**
	 * @Title: parseFileInfo
	 * @Description: 解析批量文件
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static List parseFileInfo(String fileName) throws Exception {
		List result = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
			String fileType = FileTypeUtil.getFileType(fileName);
			if ("xls".equals(fileType)) { // 解析xls文件
				result = parseExcel(fis);
			} else if ("csv".equals(fileType)) { // 解析CSV文件
				result = parseCsv(fis);
			} else if ("txt".equals(fileType)) { // 解析文本文件
				result = parseTxt(fis);
			} else {
				ExceptionUtil.throwBusinessException("CMS0000164");
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
		return result;
	}

	/**
	 * @Title: parseExcel
	 * @Description: 解析excel文件
	 * @param instream
	 * @return
	 * @throws Exception
	 */
	public static List parseExcel(InputStream instream) throws Exception {
		List result = null;
		List oneRow = null;

		POIFSFileSystem poifs = new POIFSFileSystem(instream);
		// 创建工作簿
		HSSFWorkbook workBook = null;
		try {
			workBook = new HSSFWorkbook(poifs);
		} catch (FileNotFoundException fnfe) {
			log.info(fnfe.getMessage(), fnfe);
			ExceptionUtil.throwBusinessException("CMS0000165");
		}
		for (int i = 0, num = workBook.getNumberOfSheets(); i < num; i++) {
			// 创建工作表
			HSSFSheet sheet = workBook.getSheetAt(i);
			// 获得行数
			// int rows = sheet.getPhysicalNumberOfRows();
			if (sheet.getPhysicalNumberOfRows() > 0) { // 实际行数大于0时才对这个sheet处理
				int lastRowNum = sheet.getLastRowNum();
				if (!isNotEmptyObject(result)) {
					result = new ArrayList(); // 初始化结果集
				}
				sheet.getMargin(HSSFSheet.TopMargin);
				// 行循环
				for (int j = 0; j <= lastRowNum; j++) {
					oneRow = new ArrayList(); // 初始化一行
					HSSFRow row = sheet.getRow(j);
					if (row != null) {
						// 获得列数
						int cells = row.getLastCellNum();
						// 列循环
						for (short k = 0; k < cells; k++) {
							HSSFCell cell = row.getCell(k);
							if (cell != null) {
								String value = "";
								switch (cell.getCellType()) {
								// 数值型
									case HSSFCell.CELL_TYPE_NUMERIC:
										if (HSSFDateUtil.isCellDateFormatted(cell)) {
											// 如果是date类型则 ，获取该cell的date值
											value = new SimpleDateFormat("yyyy-MM-dd").format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue()));
										} else { // 纯数字
											value = BigDecimal.valueOf(cell.getNumericCellValue()).toString(); // 解决数字的科学计数问题
										}
										break;
									// 字符串型
									case HSSFCell.CELL_TYPE_STRING:
										value = cell.getStringCellValue();
										break;
									// 公式型
									case HSSFCell.CELL_TYPE_FORMULA:
										// 读公式计算值
										value = String.valueOf(cell.getNumericCellValue());
										// 如果获取的数据值为非法值,则转换为获取字符串
										if ("NaN".equals(value)) {
											value = cell.getStringCellValue();
										}
										break;
									// 布尔型
									case HSSFCell.CELL_TYPE_BOOLEAN:
										value = String.valueOf(cell.getBooleanCellValue());
										break;
									// 空值
									case HSSFCell.CELL_TYPE_BLANK:
										break;
									// 发生错误
									case HSSFCell.CELL_TYPE_ERROR:
										break;
									default:
										value = cell.getStringCellValue();
								}
								oneRow.add(value.trim()); // 将单元格值加入行中
							} else {
								oneRow.add(null); // 将单元格值置为null
							}
						}
						result.add(oneRow); // 将行加入结果集中
					}
				}
			}
		}
		return result;
	}

	/**
	 * @Title: parseTxt
	 * @Description: 解析txt文件
	 * @param instream
	 * @return
	 * @throws Exception
	 */
	public static List parseTxt(InputStream instream) throws Exception {
		List result = null;
		List oneRow = null;

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(instream));
			String oneLine = br.readLine();
			if (oneLine != null) {
				result = new ArrayList(); // 初始化结果集
			}
			String splitChar = null;
			while (oneLine != null) {
				// 没有内容的行不处理
				if (com.ai.appframe2.util.StringUtils.isEmptyString(oneLine)) {
					// 重新读取一行
					oneLine = br.readLine();
					continue;
				}

				String[] oneRowCell = null;
				// 使用逗号分隔的文件行
				if (oneLine.contains(",")) {
					splitChar = ",";
				} else if (oneLine.contains("|")) { // 使用竖线分隔的行
					splitChar = "\\|";
				} else if (oneLine.contains("\t")) { // 使用Tab分隔的行
					splitChar = "\t";
				} else if (oneLine.contains("^")) { // 使用^分隔的行
					splitChar = "^";
				} else if (oneLine.contains("，")) {
					splitChar = "，";
				}
				if (splitChar != null) {
					// 特殊处理.如果是多个分隔符号相连，必须处理成多个分隔符号中间用空格隔开
					// 否则造成字符串分割的数组长度不对
					for (int i = 0; i < 2; i++) {
						if (oneLine.contains(splitChar + "" + splitChar)) {
							oneLine = StringUtils.replace(oneLine, splitChar + "" + splitChar, splitChar + " " + splitChar);
						}
					}
					// 如果行最后是以分隔符号结束,那么需要补起一个空格加上分隔符号
					if (oneLine.endsWith(splitChar)) {
						oneLine = oneLine + " " + splitChar;
					}
					oneRowCell = oneLine.split(splitChar);
				} else {
					oneRowCell = new String[] { oneLine };
				}
				oneRow = new ArrayList(); // 初始化一行
				for (int i = 0, len = oneRowCell.length; i < len; i++) {
					oneRow.add(oneRowCell[i].trim());
				}
				result.add(oneRow); // 将行数据加入到结果集中
				// 重新读取一行
				oneLine = br.readLine();
			}
		} finally {
			if (br != null) {
				br.close();
			}
		}
		return result;
	}

	/**
	 * 解析CSV格式文件
	 * 
	 * @Function parseCsv
	 * @Description
	 * 
	 * @param instream
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-17 下午1:01:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-17 huzq2 v1.0.0 修改原因<br>
	 */
	public static List parseCsv(InputStream instream) throws Exception {
		List result = null;
		List oneRow = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(instream));
			String oneLine = br.readLine();
			if (oneLine != null) {
				result = new ArrayList(); // 初始化结果集
			}
			String tempValue = "";
			while (oneLine != null) {
				// 没有内容的行不处理
				if (com.ai.appframe2.util.StringUtils.isEmptyString(oneLine)) {
					// 重新读取一行
					oneLine = br.readLine();
					continue;
				}

				String[] oneRowCell = null;
				// 使用逗号分隔的文件行
				oneRowCell = oneLine.split(",");
				oneRow = new ArrayList(); // 初始化一行
				for (int i = 0, len = oneRowCell.length; i < len; i++) {
					tempValue = StringUtils.trim(oneRowCell[i]);
					if (StringUtils.isNotBlank(tempValue)) {
						// 去掉第一个双引号
						if (tempValue.startsWith("\"")) {
							tempValue = tempValue.substring(1);
						}
						// 去掉最后一个双引号
						if (tempValue.endsWith("\"")) {
							tempValue = tempValue.substring(0, tempValue.length() - 1);
						}
					}
					oneRow.add(tempValue);
				}
				result.add(oneRow); // 将行数据加入到结果集中
				// 重新读取一行
				oneLine = br.readLine();
			}
		} finally {
			if (br != null) {
				br.close();
			}
		}
		return result;
	}

	/**
	 * 判断集合是否为空
	 * 
	 * @Function: isNotEmptyObject
	 * @Description: 判断集合是否为空
	 * 
	 * @param collection
	 * @return true：非空；false：空
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 28, 2011 10:00:47 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Mar 28, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static boolean isNotEmptyObject(Collection collection) {
		return (collection != null && !collection.isEmpty());
	}

	/**
	 * 判断集合是否为空
	 * 
	 * @Function isEmptyObject
	 * @Description
	 * 
	 * @param collection
	 * @return true：空；false：非空
	 * 
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-11 下午3:24:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-11 huzq v1.0.0 修改原因<br>
	 */
	public static boolean isEmptyObject(Collection collection) {
		return (collection == null || collection.isEmpty());
	}

	/**
	 * 判断Map是否为空
	 * 
	 * @Function: isNotEmptyObject
	 * @Description: 判断Map是否为空
	 * 
	 * @param map
	 * @return true：非空；false：空
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 28, 2011 10:00:35 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Mar 28, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static boolean isNotEmptyObject(Map map) {
		return (map != null && !map.isEmpty());
	}

	/**
	 * 判断Map是否为空
	 * 
	 * @Function isEmptyObject
	 * @Description
	 * 
	 * @param map
	 * @return true：空；false：非空
	 * 
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-11 下午3:21:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-11 huzq v1.0.0 修改原因<br>
	 */
	public static boolean isEmptyObject(Map map) {
		return (map == null || map.isEmpty());
	}

	/**
	 * @Function: isNotEmptyObject
	 * @Description: 判断平台的容器是否为空
	 * 
	 * @param dataStruct
	 * @return true：非空；false：空
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 28, 2011 10:06:57 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Mar 28, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static boolean isNotEmptyObject(DataStructInterface dataStruct) {
		return (dataStruct != null && isNotEmptyObject(dataStruct.getProperties()));
	}

	/**
	 * 判断平台的容器是否为空
	 * 
	 * @Function isEmptyObject
	 * @Description
	 * 
	 * @param dataStruct
	 * @return true：空；false：非空
	 * 
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-11 下午3:20:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-11 huzq v1.0.0 修改原因<br>
	 */
	public static boolean isEmptyObject(DataStructInterface dataStruct) {
		return (dataStruct == null || isEmptyObject(dataStruct.getProperties()));
	}

	/**
	 * @Function: isNotEmptyObject
	 * @Description: 判断数组是否为空
	 * 
	 * @param objs
	 * @return true：非空；false：空
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 28, 2011 9:52:45 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Mar 28, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static boolean isNotEmptyObject(Object[] objs) {
		return (objs != null && Array.getLength(objs) > 0);
	}

	/**
	 * 判断数组是否为空
	 * 
	 * @Function isEmptyObject
	 * @Description
	 * 
	 * @param objs
	 * @return true：空；false：非空
	 * 
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-11 下午3:25:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-11 huzq v1.0.0 修改原因<br>
	 */
	public static boolean isEmptyObject(Object[] objs) {
		return (objs == null || Array.getLength(objs) <= 0);
	}

	/**
	 * @Function: CmCommonBusiRule.java
	 * @Description: 获取字段的国际化名称
	 * 
	 * @param setname
	 *            SET文件全名，参见本来中SET_NAME_开头的常量
	 * @return 返回给定SET中所有字段的国际化名称的Map Map中的key：SET文件中Field的Id值
	 *         Map中的value：SET文件中Field的Title值
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Mar 29, 2011 9:08:51 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Mar 29, 2011
	 * niwei v1.0.0 修改原因
	 */
	public static Map getFieldTitles(String setname) throws Exception {
		Map result = null;
		FieldTypeSetDB fieldTypeSet = FieldTypeSetDBFactory.getFieldTypeSet(setname, true);
		FieldTypeDB[] fieldTypeDBs = fieldTypeSet.getFieldList();

		if (fieldTypeDBs != null && fieldTypeDBs.length > 0) {
			result = new HashMap();
			for (int i = 0, length = fieldTypeDBs.length; i < length; i++) {
				result.put(fieldTypeDBs[i].getId(), fieldTypeDBs[i].getTitle());
			}
		}
		return result;
	}

	/**
	 * 
	 * @Function: CmCommonUtil.java
	 * @Description: 初始化数据对象的所有属性
	 * 
	 * @param dc
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 12, 2011 10:09:51 AM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* May 12, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public static void initDcProperties(DataContainer dc) {
		String[] props = dc.getPropertyNames();
		if (props != null) {
			for (int i = 0, len = props.length; i < len; i++) {
				dc.initProperty(props[i], dc.get(props[i]));
			}
		}
	}

	/**
	 * 将数据容器转换成Map
	 * 
	 * @Function: parseBeanToMap
	 * @Description: 该函数的功能描述
	 * 
	 * @param dc
	 * @return
	 * 
	 * @version: v1.0.0
	 * @author:
	 * @date: Jun 15, 2011 8:41:37 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jun 15, 2011
	 * v1.0.0 修改原因
	 */
	public static Map[] parseBeanToMap(DataContainer[] dc) {
		Map[] result = null;
		if (dc != null) {
			result = new HashMap[dc.length];
			String[] props = null; // dc中的所有属性
			for (int i = 0, len = dc.length; i < len; i++) {
				props = dc[i].getPropertyNames();
				// 设置所有属性的值到Map中
				result[i] = new HashMap();
				for (int j = 0, len2 = props.length; j < len2; j++) {
					result[i].put(props[j], dc[i].get(props[j]));
				}
			}
		}
		return result;
	}

	/**
	 * 
	 * @Function: getStringLengthByChar
	 * @Description: 获取字符串长度，中文算两个字符
	 * 
	 * @param str
	 * @return
	 * 
	 * @version: v1.0.0
	 * @author: xialing
	 * @date: Jul 12, 2011 9:40:24 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jul 12, 2011
	 * xialing v1.0.0 修改原因
	 */
	public static int getStringLengthByChar(String str) {
		int result = 0;
		if (!com.ai.appframe2.util.StringUtils.isEmptyString(str)) {
			result = str.replaceAll("[^x00-xff]", "**").length();
		}
		return result;
	}

	/**
	 * 
	 * @Function: subStringByCharLength
	 * @Description: 分隔一个超长字符串
	 * 
	 * @param str
	 * @param len
	 *            每个分段的长度，中文算两个字符长度
	 * @return
	 * 
	 * @version: v1.0.0
	 * @author: xialing
	 * @date: Jul 12, 2011 9:50:35 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jul 12, 2011
	 * xialing v1.0.0 修改原因
	 */
	public static List subStringByCharLength(String str, int len) throws Exception {
		List result = new ArrayList();
		if (com.ai.appframe2.util.StringUtils.isEmptyString(str)) {
			result.add("");
		} else if (len <= 0) {
			result.add(str);
		} else if (getStringLengthByChar(str) <= len) {
			result.add(str);
		} else {
			String tmp = null;
			while (!com.ai.appframe2.util.StringUtils.isEmptyString(str)) {
				tmp = byteSubstring(str, len);
				if (com.ai.appframe2.util.StringUtils.isEmptyString(tmp)) {
					result.add("");
					break;
				}
				result.add(tmp);
				str = str.substring(tmp.length());
			}
		}
		return result;
	}

	/**
	 * 
	 * @Function: byteSubstring
	 * @Description: 根据字符长度截取字符串，中文算两个字符
	 * 
	 * @param str
	 * @param len
	 * @return
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jul 12, 2011 10:56:08 PM
	 * 
	 * Modification History: Date xialing Version Description
	 * ---------------------------------------------------------* Jul 12, 2011
	 * xialing v1.0.0 修改原因
	 */
	public static String byteSubstring(String str, int len) throws Exception {
		String result = "";
		if (!com.ai.appframe2.util.StringUtils.isEmptyString(str)) {
			byte[] bt = str.getBytes(StandardCharsets.UTF_8);
			if (bt.length <= len) {
				result = new String(bt, 0, bt.length, StandardCharsets.UTF_8);
			} else {
				if (bt[len] < 0) { // 最后一个是否为负
					int count = 0; // 统计byte数组中负数的个数
					for (int i = 0; i < len; i++) {
						if (bt[i] < 0) {
							count++;
						}
					}
					if (count % 2 == 1) { // 如果是负的字节个数为奇数，那么丢弃最后一个负数
						len = len - 1;
					}
				}
				result = new String(bt, 0, len, StandardCharsets.UTF_8);
			}
		}
		return result;
	}

	/**
	 * 
	 * @Function: substringManagerName
	 * @Description: 对客户经理的姓名进行截取处理
	 * 
	 * @param managerName
	 * @return
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: xialing
	 * @date: Jul 14, 2011 11:14:42 AM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jul 14, 2011
	 * xialing v1.0.0 修改原因
	 */
	public static String substringManagerName(String managerName) throws Exception {
		String result = managerName;
		if (!com.ai.appframe2.util.StringUtils.isEmptyString(result)) {
			if (getStringLengthByChar(result) > 20) {
				result = result.replaceAll("[\\(\\（].*[\\）\\)]", "");
				if (getStringLengthByChar(result) > 20) {
					result = byteSubstring(result, 20);
				}
			}
		}
		return result;
	}

	/**
	 * 
	 * @Function: getBeforeMonth
	 * @Description: 获取当前月之前的count个月份,用作账期下拉列表【CODE_VALUE,CODE_NAME】
	 * 
	 * @param count
	 * @return
	 * 
	 * @version: v1.0.0
	 * @author: xialing
	 * @date: Jul 18, 2011 9:04:17 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jul 18, 2011
	 * xialing v1.0.0 修改原因
	 */
	public static DataContainer[] getBeforeMonth(int count) throws Exception {
		long now = 0L;
		if (count <= 0) {
			count = 0;
		} else {
			now = TimeUtil.getPrimaryDataSourceSysDate().getTime();
		}
		DataContainer[] result = new DataContainer[count];
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy" + CrmLocaleFactory.getResource("CMS0700001") + "MM" + CrmLocaleFactory.getResource("CMS0200066"));
		for (int i = 0, len = result.length; i < len; i++) {
			result[i] = new DataContainer();
			date = TimeUtil.addOrMinusMonth(now, -(i + 1));
			result[i].set("CODE_VALUE", TimeUtil.getYYYYMM(date));
			result[i].set("CODE_NAME", sdf.format(date));
		}
		return result;
	}

	/**
	 * @Function: getDataContainers
	 * @Description: 转换对象
	 * 
	 * @param object
	 * @return
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: zhangyin
	 * @date: 2011-12-9 下午05:12:19
	 * 
	 * Modification History: Date Author Version Description
	 * -------------------------------------------------------------------
	 * 2011-12-9 zhangyin v1.0.0 修改原因
	 */
	public static DataContainer[] getDataContainers(Object object) throws Exception {
		if (object == null) {
			return new DataContainer[0];
		}

		/* 将传入的对象全部转换为数组 */
		Object[] temp = null;
		if (object.getClass().isArray()) {
			temp = (Object[]) object;
		} else if (object instanceof List) {
			temp = ((List) object).toArray();
		} else {
			temp = new Object[] { object };
		}
		/* 生成DataContainer数组对象 */
		int length = temp.length;
		DataContainer[] dcs = new DataContainer[length];
		for (int i = 0; i < length; i++) {
			if (temp[i] != null) {
				Class clazz = temp[i].getClass();
				if (ClassUtils.isAssignable(clazz, DataContainer.class)) {
					Method propMethod = clazz.getMethod("getPropertyNames", new Class[] {});
					String[] props = (String[]) propMethod.invoke(temp[i], new Object[] {});

					Method getMethod = clazz.getMethod("get", new Class[] { String.class });
					dcs[i] = new DataContainer();
					for (int j = 0, size = props.length; j < size; j++) {
						dcs[i].set(props[j], getMethod.invoke(temp[i], new Object[] { props[j] }));
					}
				} else {
					ExceptionUtil.throwBusinessException("CMS0000160");
				}
			}
		}
		return dcs;
	}

	/**
	 * 通过传入的 bobean 类型对象 获取对应的sequence[不能传入查询BO]<br>
	 * 先执行特殊对象序列生成规则，如果没有配置特殊序列生成规则，则默认情况使用cfg_id_generator的配置生成主键。 特殊对象如客户、账户等。
	 * 对象序列号生成器目前是配置在静态数据表中的，静态数据编码为CM_OBJECT_ID_GENERATOR。 select t.*,rowid
	 * from base.bs_static_data t where t.code_type = 'CM_OBJECT_ID_GENERATOR';
	 * 
	 * @Function getNewSequence
	 * @Description 通过传入的 bobean 类型对象 获取对应的sequence[不能传入查询BO]
	 * 
	 * @param claz
	 * @return 指定Sequence的值
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-13 下午2:30:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-13 huzq2 v1.0.0 修改原因
	 */
	public static long getNewSequence(Class claz) throws Exception {
		ICmCommonSV sv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		return sv.getCommonNewSequence(claz);
	}

	/**
	 * 通过传入具体的 bobean实例生成该bobean的序列.<br>
	 * 先执行特殊对象序列生成规则，如果没有配置特殊序列生成规则，则默认情况使用cfg_id_generator的配置生成主键。 特殊对象如客户、账户等。
	 * 对象序列号生成器目前是配置在静态数据表中的，静态数据编码为CM_OBJECT_ID_GENERATOR。
	 * 其中字段CODE_DESC用于定于获取序列的方法定义，如果该方法不需要入参，则可以简单的配置该方法的名称，否则需要配置该方法的参数名称和参数类型，使用类似于getXXX(REGION_ID:String,CUST_TYPE:int)的格式。
	 * 
	 * @Function getNewSequence
	 * @Description
	 * 
	 * @param targetObject
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-21 下午11:45:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-21 huzq v1.0.0 修改原因<br>
	 */
	public static long getNewSequence(DataStructInterface targetObject) throws Exception {
		// 先执行特殊对象序列生成规则，如果没有配置特殊序列生成规则，则默认情况使用cfg_id_generator的配置生成主键。
		// 特殊对象如客户、账户等。
		// 对象序列号生成器目前是配置在静态数据表中的，静态数据编码为CM_OBJECT_ID_GENERATOR。
		CmIdGenerator idGenerator = CmConfigLoader.getInstance().getIdGenerator(targetObject.getClass());
		if (log.isDebugEnabled()) {
			log.debug(idGenerator);
		}
		if (idGenerator != null && idGenerator.getService() != null) {
			// 先验证参数是否配置正确
			idGenerator.validate();
			String serviceName = StringUtils.trim(idGenerator.getService().getName());
			String methodName = StringUtils.trim(idGenerator.getMethod().getName());
			Class[] paramClasses = null;
			Object[] paramObjects = null;
			if (idGenerator.getMethod().hasParameters()) {
				CmIdGenerator.Parameter[] parameters = idGenerator.getMethod().getParameters();
				paramClasses = new Class[parameters.length];
				paramObjects = new Object[parameters.length];
				for (int i = 0; i < parameters.length; i++) {
					paramClasses[i] = DataType.getJavaClass(parameters[i].getDataType());
					if (StringUtils.equals(parameters[i].getSource(), CmIdGenerator.Parameter.SOURCE_PARAMETER)) { // 从参数中获取
						paramObjects[i] = DataType.transfer(targetObject.get(parameters[i].getName()), paramClasses[i]);
						log.debug("\nParameter:" + parameters[i].getName() + "=" + targetObject.get(parameters[i].getName()));
					} else { // 从session中获取
						paramObjects[i] = DataType.transfer(SessionManager.getUser().get(parameters[i].getName()), paramClasses[i]);
					}
				}
			}
			Object svObject = null;
			// 如果是标准服务，则直接通过ServiceFactory获取
			if (serviceName.endsWith("SV")) {
				svObject = ServiceFactory.getService(serviceName);
			} else {
				// 否则通过获取本地服务，如果获取不到则认为该类是通过静态方法的方式调用，不需要获取服务实例。
				if (StringUtils.equals(idGenerator.getService().getModifier(), CmIdGenerator.Service.MODIFIER_PUBLIC)) {
					svObject = ServiceFactory.getSeviceOfLocal(serviceName);
				} else {
					svObject = null;
				}
			}
			// 获取服务定义的方法
			Method generatorMethod = null;
			if (svObject != null) {
				generatorMethod = svObject.getClass().getDeclaredMethod(StringUtils.trim(methodName), paramClasses);
			} else {
				generatorMethod = Class.forName(serviceName).getDeclaredMethod(StringUtils.trim(methodName), paramClasses);
			}
			// 动态调用获取序列的方法。
			Object id = generatorMethod.invoke(svObject, paramObjects);
			if (id != null) {
				return DataType.getAsLong(id);
			} else {
				// 生成序列号错误：调用类[{0}]的方法[{1}]返回了空对象！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000366"));
				}
				ExceptionUtil.throwBusinessException("CMS0000366");
			}
		}
		/*
		 * 默认情况使用cfg_id_generator的配置生成主键
		 */
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		return commonSV.getNewSequence(targetObject.getClass());
	}

	/**
	 * @Function getCustType
	 * @Description
	 * 
	 * @param custId
	 * @return 客户类型
	 * @throws Exception
	 *             根据传入的客户编号不能获取到正确的客户编号时抛出业务异常。
	 * 
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-15 上午10:31:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-15 huzq2 v1.0.0 修改原因 2012-1-11 huzq2 v1.0.0
	 * 直接使用common.jar中的方法，避免因规则变化时引起数据不一致的问题
	 */
	public static int getCustType(long custId) throws Exception {
		// 更改为直接使用common.jar中的方法 modified by huzq2 at 2012-1-11
		if (custId <= 0) {
			// 客户ID不能为空
			ExceptionUtil.throwBusinessException("CMS95000089");
		}
		int custType = -1;
		try {
			custType = SNUtil.getCustTypeByCustomerId(custId);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			ExceptionUtil.throwBusinessException("CMS0020525");
		}
		return custType;
	}

	/**
	 * @Function getSysDate
	 * @Description 获取系统时间
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author shitian
	 * @date Jan 12, 2012 4:47:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 12, 2012 shitian v1.0.0 修改原因<br>
	 */
	public static Timestamp getSysDate() throws Exception {
		return CmServiceFactory.getCommonSV().getSysDate();
	}

	/**
	 * @Function getNowTime
	 * @Description 获取系统时间 YYYY-MM-DD
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-5-20 4:47:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-5-20 zhuyy v1.0.0 修改原因<br>
	 */
	public static String getNowTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar now = Calendar.getInstance();
		return format.format(now.getTime());
	}

	/**
	 * 
	 * @Function getCycle
	 * @Description 获得起始账期，返回年月数组
	 * 
	 * @param startDate
	 *            格式为yyyy-MM-dd
	 * @param endDate
	 *            格式为yyyy-MM-dd
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 21, 2012 7:13:23 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 21, 2012 zhaofei3 v1.0.0 修改原因<br>
	 */
	public static String[] getCycleYYMM(String startDate, String endDate) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		List list = new ArrayList();
		if (StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)) {
			Date sDate = dateFormat.parse(startDate);
			Date eDate = dateFormat.parse(endDate);
			Calendar sCal = Calendar.getInstance();
			Calendar eCal = Calendar.getInstance();
			if (sDate != null) {
				sCal.setTime(sDate);
				eCal.setTime(eDate);
				if (eCal.compareTo(sCal) < 0) {
					// 错误：开始时间大于结束时间，不能计算帐期！
					ExceptionUtil.throwBusinessException("CMS0010041");
				}
			}
			while (eCal.compareTo(sCal) >= 0
					|| (eCal.compareTo(sCal) < 0 && (eCal.get(Calendar.YEAR) == sCal.get(Calendar.YEAR) && (eCal.get(Calendar.MONTH) == sCal.get(Calendar.MONTH))))) {
				list.add(String.valueOf(new Integer(sCal.get(Calendar.YEAR) * 100 + sCal.get(Calendar.MONTH) + 1)));
				sCal.add(Calendar.MONTH, 1);
			}
			if (!list.isEmpty()) {
				return (String[]) list.toArray(new String[0]);
			}
		}
		return null;
	}

	/**
	 * 
	 * @Function getCycleYY
	 * @Description 获得起始账期，返回年数组
	 * 
	 * @param startDate
	 *            格式为yyyy-MM-dd
	 * @param endDate
	 *            格式为yyyy-MM-dd
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 21, 2012 7:20:32 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 21, 2012 zhaofei3 v1.0.0 修改原因<br>
	 */
	public static String[] getCycleYY(String startDate, String endDate) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		List list = new ArrayList();
		if (StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)) {
			Date sDate = dateFormat.parse(startDate);
			Date eDate = dateFormat.parse(endDate);
			Calendar sCal = Calendar.getInstance();
			Calendar eCal = Calendar.getInstance();
			if (sDate != null) {
				sCal.setTime(sDate);
				eCal.setTime(eDate);
				if (eCal.compareTo(sCal) < 0) {
					// 错误：开始时间大于结束时间，不能计算帐期！
					ExceptionUtil.throwBusinessException("CMS0010041");
				}
			}
			while (eCal.compareTo(sCal) >= 0
					|| (eCal.compareTo(sCal) < 0 && (eCal.get(Calendar.YEAR) == sCal.get(Calendar.YEAR) && (eCal.get(Calendar.MONTH) == sCal.get(Calendar.MONTH))))) {
				list.add(String.valueOf(new Integer(sCal.get(Calendar.YEAR))));
				sCal.add(Calendar.YEAR, 1);
			}
			if (!list.isEmpty()) {
				return (String[]) list.toArray(new String[0]);
			}
		}
		return null;
	}

	/**
	 * 获取联合查询的SQL
	 * 
	 * @Function createUnionSql
	 * @Description
	 * 
	 * @param queryClass
	 * @param condition
	 * @param orderBy
	 * @param tableVars
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-12 下午3:56:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-12 zhangyin v1.0.0 修改原因<br>
	 */
	public static String createUnionSql(Class queryClass, StringBuilder condition, StringBuilder orderBy, TableVars[] tableVars) throws Exception {

		if (queryClass == null) {
			// 传入的Bean类型为空！
			ExceptionUtil.throwBusinessException("SCS0040062");
		}

		if (!ClassUtils.isAssignable(queryClass, DataContainerInterface.class)) {
			ExceptionUtil.throwBusinessException("SCS0040079", queryClass.getName(), DataContainerInterface.class.getName());
		}

		ObjectType objectType = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(queryClass);
		String mappingEntyType = objectType.getMapingEntyType();
		if ("query".equalsIgnoreCase(mappingEntyType)) {
			// 指定的Bean类MappingEntyTeyp为查询BO！
			ExceptionUtil.throwBusinessException("SCS0040063");
		}
		String tableName = objectType.getMapingEnty();
		if (StringUtils.isBlank(tableName)) {
			// 无法根据指定Bean类获取MappingEnty！
			ExceptionUtil.throwBusinessException("SCS0040064");
		}

		if (tableVars == null || tableVars.length == 0) {
			// 指定的分表列表为空！
			ExceptionUtil.throwBusinessException("SCS0040065");
		}

		StringBuilder unionSql = new StringBuilder().append("SELECT * FROM ( ");

		for (int i = 0; i < tableVars.length; i++) {
			unionSql.append(SplitTableFactory.createQuerySQL(createQuerySql(tableName, condition), tableVars[i]));
			if (i == tableVars.length - 1) {
				break;
			}

			unionSql.append(" UNION ALL ");
		}

		unionSql.append(" )");

		// 结果排序
		if (orderBy != null && StringUtils.isNotBlank(orderBy.toString())) {
			unionSql.append(" ORDER BY ").append(orderBy);
		}

		return unionSql.toString();
	}

	/**
	 * 拼接单表查询SQL
	 * 
	 * @Function createQuerySql
	 * @Description
	 * 
	 * @param tableName
	 * @param condition
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-12 下午3:56:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-12 zhangyin v1.0.0 修改原因<br>
	 */
	private static String createQuerySql(String tableName, StringBuilder condition) throws Exception {
		StringBuilder querySql = new StringBuilder();
		querySql.append("SELECT * FROM ").append(tableName);
		if (condition != null && StringUtils.isNotBlank(condition.toString())) {
			querySql.append(" WHERE ").append(condition);
		}
		return querySql.toString();
	}

	/**
	 * 从给定的DataContainer中获取指定的扩展属性对象。
	 * 
	 * @Function getAttrValuesFromDC
	 * @Description
	 * 
	 * @param dc
	 *            原始的DataContainer对象
	 * @param targetObjClasses
	 *            目标扩展属性对象类型
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 上午10:50:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26 huzq2 v1.0.0 修改原因<br>
	 */
	public static DataContainerInterface[] getAttrValuesFromDC(DataContainerInterface dc, Class[] targetObjClasses) throws Exception {
		if (isNotEmptyObject(targetObjClasses)) {
			List list = new ArrayList();
			for (int i = 0; i < targetObjClasses.length; i++) {
				ObjectType objectType = ServiceManager.getObjectTypeFactory().getInstance(StringUtils.stripEnd(targetObjClasses[i].getName(), "Bean"));
				// 如果获取不到对象类型，则跳过
				if (objectType == null) {
					continue;
				}
				// 如果不是Table类型则跳过
				if (!"table".equalsIgnoreCase(objectType.getMapingEntyType())) {
					continue;
				}
				IBOCmCfgTableAttrValue[] attrValues = CmCfgTableAttrUtil.getCfgTableAttrValues(objectType.getMapingEnty());
				if (CmCommonUtil.isNotEmptyObject(attrValues)) {
					for (int j = 0; j < attrValues.length; j++) {
						if (!dc.hasProperty(attrValues[j].getAttrCode())) {
							continue;
						}
						DataContainerInterface targetBean = DataContainerFactory.createDataContainerInstance(targetObjClasses[i], objectType);
						Map keyProperties = targetBean.getKeyProperties();
						if (dc.isPropertyInitial(attrValues[j].getAttrCode())) {
							// init 主键字段
							targetBean.initProperty(IBOCmCfgTableAttrValue.S_AttrCode, attrValues[j].getAttrCode());
							targetBean.initProperty("ATTR_VALUE", dc.get(attrValues[j].getAttrCode()));
							Iterator it = keyProperties.keySet().iterator();
							while (it.hasNext()) {
								String key = (String) it.next();
								// 跳过AttrCode字段
								if (IBOCmCfgTableAttrValue.S_AttrCode.equalsIgnoreCase(key)) {
									continue;
								}
								if ("ATTR_VALUE".equalsIgnoreCase(key)) {
									continue;
								}
								targetBean.initProperty(key, dc.get(key));
							}
							// 其他属性一并拷贝
							String[] targetPropNames = objectType.getPropertyNames();
							for (int k = 0; k < targetPropNames.length; k++) {
								// 跳过上面已经取过值的属性
								if (IBOCmCfgTableAttrValue.S_AttrCode.equalsIgnoreCase(targetPropNames[k])) {
									continue;
								}
								if ("ATTR_VALUE".equalsIgnoreCase(targetPropNames[k])) {
									continue;
								}
								if (keyProperties.containsKey(targetPropNames[k])) {
									continue;
								}
								// 主键字段已在上面处理过了，这里只需要处理除主键字段之外的字段
								if (dc.isPropertyInitial(targetPropNames[k])) {
									targetBean.initProperty(targetPropNames[k], dc.get(targetPropNames[k]));
								}
							}
						}
						if (dc.isPropertyModified(attrValues[j].getAttrCode())) {
							targetBean.set(IBOCmCfgTableAttrValue.S_AttrCode, attrValues[j].getAttrCode());
							targetBean.set("ATTR_VALUE", dc.get(attrValues[j].getAttrCode()));
							// set 主键字段
							Iterator it = keyProperties.keySet().iterator();
							while (it.hasNext()) {
								String key = (String) it.next();
								// 跳过AttrCode字段
								if (IBOCmCfgTableAttrValue.S_AttrCode.equalsIgnoreCase(key)) {
									continue;
								}
								// 跳过属性值字段
								if ("ATTR_VALUE".equalsIgnoreCase(key)) {
									continue;
								}
								// 主键不能塞null，需要处理一下
								if (dc.get(key) == null) {
									if (log.isErrorEnabled()) {
										log.error("The Key Property is null, it will be ignored:" + key);
									}
									continue;
								}
								targetBean.set(key, dc.get(key));
							}
							// 其他属性一并拷贝
							String[] targetPropNames = objectType.getPropertyNames();
							for (int k = 0; k < targetPropNames.length; k++) {
								// 跳过上面已经取过值的属性
								if (IBOCmCfgTableAttrValue.S_AttrCode.equalsIgnoreCase(targetPropNames[k])) {
									continue;
								}
								if ("ATTR_VALUE".equalsIgnoreCase(targetPropNames[k])) {
									continue;
								}
								if (keyProperties.containsKey(targetPropNames[k])) {
									continue;
								}
								// 主键字段已在上面处理过了，这里只需要处理除主键字段之外的字段
								if (dc.isPropertyModified(targetPropNames[k])) {
									targetBean.set(targetPropNames[k], dc.get(targetPropNames[k]));
								}
							}
						}
						// 如果传入的DC是删除状态，为了保证数据的一致性，则需要将这个属性也删除掉。
						if (dc.isDeleted()) {
							targetBean.delete();
						}
						list.add(targetBean);
					}
				}
			}
			return (DataContainerInterface[]) list.toArray(new DataContainerInterface[0]);
		}
		return new DataContainer[0];
	}

	/**
	 * 获取下周期时间
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: May 1, 2012 4:44:14 PM
	 */
	public static Timestamp getNextBillDate() throws Exception {
		return TimeUtil.getNextMonthStartDate(new Date());
	}

	/**
	 * 判断是否是手机号码
	 * 
	 * @param strBillId
	 * @return
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-9
	 */
	public static boolean isValidMobileNo(String strBillId) {
		if (strBillId == null || "".equals(strBillId)) {
			return false;
		}
		if (strBillId.trim().length() != 11 && strBillId.trim().length() != 8) {
			return false;
		}
		try {
			Long.parseLong(strBillId);
		} catch (NumberFormatException ex) {
			return false;
		}
		if (strBillId.trim().length() == 11) {
			if (!"13".equals(strBillId.substring(0, 2)) && !"14".equals(strBillId.substring(0, 2)) && !"15".equals(strBillId.substring(0, 2))
					&& !"18".equals(strBillId.substring(0, 2))) {
				return false;
			}

			if ("13".equals(strBillId.substring(0, 2))) {
				if ("0".equals(strBillId.substring(2, 3)) || "1".equals(strBillId.substring(2, 3)) || "2".equals(strBillId.substring(2, 3))
						|| "3".equals(strBillId.substring(2, 3))) {
					return false;
				}
			}
			if ("18".equals(strBillId.substring(0, 2))) {
				if ("9".equals(strBillId.substring(2, 3))) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * @Function getCreateDate
	 * @Description 获取用户在网时间
	 * 
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jan 12, 2012 4:47:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 12, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public static long getCreateDate(Timestamp time) throws Exception {
		Date nowDate = new Date();
		return RBossUtil.getBetweenMonth(time, nowDate);
	}

	/**
	 * 得到昨天日期，格式yyyy-MM-dd。
	 * 
	 * @return String 格式化的日期字符串
	 */
	public static String getYesterday() {
		Date cDate = new Date();
		cDate.setTime(cDate.getTime() - 24 * 3600 * 1000);
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * @Function isEmptyObj
	 * @Description 对象判空
	 * 
	 * @param obj
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 25, 2012 11:34:59 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 25, 2012 shitian v1.0.0 修改原因<br>
	 */
	public static boolean isEmptyObj(Object obj) throws Exception {
		if (obj == null || StringUtils.isBlank(obj.toString())) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @Function: getFtpUtil
	 * @Description: 构造新的文件上传工具类对象
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-10-10 上午11:01:24
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* 2011-5-1
	 * kangzk v1.0.0 修改原因
	 */
	public static FtpUtil getFtpUtil(String ftpPathCode) throws Exception {
		if (StringUtils.isEmpty(ftpPathCode)) {
			ftpPathCode = CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE;
		}
		IBOBsFtpPathValue objIBsFtpPathValue = (IBOBsFtpPathValue) CacheFactory.get(BsFtpPathCacheImpl.class, ftpPathCode);
		if (objIBsFtpPathValue == null || objIBsFtpPathValue.isNew()) {
			return null;
		}
		IBOBsFtpValue objIBsFtpValue = (IBOBsFtpValue) CacheFactory.get(BsFtpCacheImpl.class, objIBsFtpPathValue.getFtpCode());
		if (objIBsFtpValue == null || objIBsFtpValue.isNew()) {
			ftpPathCode = CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE;
		}
		return new FtpUtil(ftpPathCode);
	}

	public static void convertName(DataStructInterface[] values) throws Exception {
		if (values == null || values.length == 0) {
			return;
		}
		String firstName = "";
		String middleName = "";
		String lastName = "";
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				return;
			}
			String fullName = "";
			DataContainer targetBo = (DataContainer) DataContainerFactory.createDataContainerInstance(values[i].getClass(), null);
			String[] propNames = targetBo.getType().getPropertyNames();
			// get fullName
			for (int j = 0; j < propNames.length; j++) {
				if (propNames[j].equalsIgnoreCase(IBOCmIndivCustomerValue.S_FirstName)) {
					firstName = (String) values[i].get(IBOCmIndivCustomerValue.S_FirstName);
					firstName = StringUtils.isNotBlank(firstName) ? firstName : "";
				} else if (propNames[j].equalsIgnoreCase(IBOCmIndivCustomerValue.S_MiddleName)) {
					middleName = (String) values[i].get(IBOCmIndivCustomerValue.S_MiddleName);
					middleName = StringUtils.isNotBlank(middleName) ? middleName : "";
				} else if (propNames[j].equalsIgnoreCase(IBOCmIndivCustomerValue.S_LastName)) {
					lastName = (String) values[i].get(IBOCmIndivCustomerValue.S_LastName);
					lastName = StringUtils.isNotBlank(lastName) ? lastName : "";
				}
			}
			if (StringUtils.isBlank(middleName)) {
				fullName = firstName + " " + lastName;
			} else {
				fullName = firstName + " " + middleName + " " + lastName;
			}
			// set prop
			for (int j = 0; j < propNames.length; j++) {
				if (propNames[j].equalsIgnoreCase(IBOCmIndivCustomerValue.S_CustName) && StringUtils.isNotBlank(fullName)) {
					values[i].set(IBOCmIndivCustomerValue.S_CustName, fullName.trim());
				} else if (propNames[j].equalsIgnoreCase(IContactValue.S_PartyName) && StringUtils.isNotBlank(fullName)) {
					values[i].set(IContactValue.S_PartyName, fullName.trim());
				} else if (propNames[j].equalsIgnoreCase(IBOCmClubMemberValue.S_MemberName) && StringUtils.isNotBlank(fullName)) {
					values[i].set(IBOCmClubMemberValue.S_MemberName, fullName.trim());
				} else if (propNames[j].equalsIgnoreCase(IContactValue.S_ContName) && StringUtils.isNotBlank(fullName)) {
					try {
						String oldFullName = DataType.getAsString(values[i].getOldObj(IBOCmIndivCustomerValue.S_CustName));
						// 老值中没有cont_name,取出oldFullName塞m_back
						if (StringUtils.isNotBlank(oldFullName) && StringUtils.isBlank(DataType.getAsString(values[i].getOldObj(IContactValue.S_ContName)))) {
							values[i].initProperty(IContactValue.S_ContName, oldFullName.trim());
						}
					} catch (AIException ignored) {

					}
					values[i].set(IContactValue.S_ContName, fullName.trim());
				} else if (propNames[j].equalsIgnoreCase(IClubActionValue.S_ContactPerson) && StringUtils.isNotBlank(fullName)) {
					values[i].set(IClubActionValue.S_ContactPerson, fullName.trim());
				} else if (propNames[j].equalsIgnoreCase(IBOCmIndivCustomerValue.S_CustNameQry) && StringUtils.isNotBlank(fullName)) {
					values[i].set(IBOCmIndivCustomerValue.S_CustNameQry, fullName.toUpperCase().trim());
				} else if (propNames[j].equalsIgnoreCase(IBOCmIndivCustomerValue.S_FirstNameQry) && StringUtils.isNotBlank(firstName)) {
					values[i].set(IBOCmIndivCustomerValue.S_FirstNameQry, firstName.toUpperCase().trim());
				} else if (propNames[j].equalsIgnoreCase(IBOCmIndivCustomerValue.S_MiddleNameQry) && StringUtils.isNotBlank(middleName)) {
					values[i].set(IBOCmIndivCustomerValue.S_MiddleNameQry, middleName.toUpperCase().trim());
				} else if (propNames[j].equalsIgnoreCase(IBOCmIndivCustomerValue.S_LastNameQry) && StringUtils.isNotBlank(lastName)) {
					values[i].set(IBOCmIndivCustomerValue.S_LastNameQry, lastName.toUpperCase().trim());
				} else if (propNames[j].equalsIgnoreCase(IBOCmClubMemberValue.S_MemberNameQry) && StringUtils.isNotBlank(fullName)) {
					values[i].set(IBOCmClubMemberValue.S_MemberNameQry, fullName.toUpperCase().trim());
				} else if (propNames[j].equalsIgnoreCase(IClubActionValue.S_ContNameQry) && StringUtils.isNotBlank(fullName)) {
					values[i].set(IClubActionValue.S_ContNameQry, fullName.toUpperCase().trim());
				} else if (propNames[j].equalsIgnoreCase(ISpecialListValue.S_PartyNameQry) && StringUtils.isNotBlank(fullName)) {
					values[i].set(ISpecialListValue.S_PartyNameQry, fullName.toUpperCase().trim());
				}
			}
		}
	}

	/**
	 * @Function compareDate
	 * @Description 比较两个时间大小，ture为srcDate大于targetdate
	 * 
	 * @param srcDate
	 * @param targetdate
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author shitian
	 * @date Apr 8, 2014 5:29:56 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 8, 2014 shitian v1.0.0 修改原因<br>
	 */
	public static boolean compareDate(Date srcDate, Date targetdate) throws Exception {
		if (srcDate == null || targetdate == null) {
			return false;
		}
		Calendar srcCal = Calendar.getInstance();
		Calendar targetCal = Calendar.getInstance();
		srcCal.setTime(srcDate);
		targetCal.setTime(targetdate);
		int result = srcCal.compareTo(targetCal);
		return result > 0;
	}

	/**
	 * 
	 * @Function getDynamicSqlByConds
	 * @Description 根据查询条件获取记录动态SQL
	 * @param classBean
	 * @param paramter
	 * @param startNum
	 *            不分页传入-1
	 * @param endNum
	 *            不分页传入-1
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-6-11 下午4:21:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-11 yangjh v1.0.0 修改原因<br>
	 */
	public static String getDynamicSqlByConds(Class classBean, String condtion, Map paramter, int startNum, int endNum) throws Exception {
		StringBuffer dynamicSql = new StringBuffer();
		String sql = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(classBean).getMapingEnty().toUpperCase();
		int strIdx = sql.indexOf("SELECT");
		if (strIdx > -1) {
			Map<String, String> paramkey = new HashMap<String, String>();
			if (paramter != null) {
				Iterator<?> it = paramter.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					paramkey.put(":" + key.toUpperCase(), ":" + key);
				}
			}
			dynamicSql.append(sql);
			if (!sql.contains("WHERE")) {
				dynamicSql.append(" WHERE 1=1 ");
			}

			int endIdx = sql.indexOf("FROM");
			String[] cols = StringUtils.split(sql.substring(strIdx + 6, endIdx), ",");
			if (StringUtils.isNotBlank(condtion)) {
				// 将所有的查询列放入到map容器中
				Map<String, String> colsMap = new HashMap<String, String>();
				String[] innerCols = null;
				for (int i = 0; i < cols.length; i++) {
					if (cols[i].contains(" AS ")) {
						innerCols = StringUtils.split(cols[i], " ");
						if (innerCols.length > 2) {
							colsMap.put(innerCols[2], innerCols[0]);
						} else {
							colsMap.put(innerCols[1], innerCols[0]);
						}
					} else if (cols[i].contains(".")) {
						innerCols = StringUtils.split(cols[i], ".");
						colsMap.put(innerCols[1], cols[i]);
					} else {
						colsMap.put(cols[i], cols[i]);
					}
				}
				String innerKey = null;
				String[] innercols = null;
				String[] condtionCols = StringUtils.split(condtion.toUpperCase().replaceAll(" AND ", "|"), "\\|");
				StringBuffer whereCondtion = new StringBuffer("");
				if (condtionCols != null && condtionCols.length > 0) {
					for (int i = 0; i < condtionCols.length; i++) {
						innerKey = condtionCols[i];
						if ("1=1".equals(innerKey.replaceAll(" ", ""))) {
							continue;
						} else if (StringUtils.contains(innerKey, "<>") && StringUtils.contains(innerKey, ":")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "<>");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" <> ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" <> ").append(paramkey.get(innercols[1])).append(" ");
							}

						} else if (StringUtils.contains(innerKey, "!=") && StringUtils.contains(innerKey, ":")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "!=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" != ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" != ").append(paramkey.get(innercols[1])).append(" ");
							}

						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && !StringUtils.contains(innerKey, ">")
								&& !StringUtils.contains(innerKey, "<")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" = ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" = ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && StringUtils.contains(innerKey, ">")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), ">=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" >= ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && StringUtils.contains(innerKey, "<")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "<=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" <= ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else {
							whereCondtion.append(" AND ").append(innerKey);
						}
					}
				}
				dynamicSql.append(whereCondtion.toString().replaceAll("%Y-%M-%D %H:%I:%S", "%Y-%m-%d %H:%i:%s"));
			}
		} else {
			dynamicSql.append("SELECT * FROM ").append(sql).append(" WHERE ").append(condtion);

		}
		return CmLnCommonUtil.getQueryResult(dynamicSql.toString(), null, startNum, endNum, paramter);
	}

	/**
	 * 
	 * @Function getDynamicCountSqlByConds
	 * @Description 根据查询条件获取记录数量动态SQL
	 * @param classBean
	 * @param paramter
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-6-11 下午4:23:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-11 yangjh v1.0.0 修改原因<br>
	 */
	public static String getDynamicCountSqlByConds(Class classBean, String condtion, Map paramter) throws Exception {
		StringBuffer dynamicSql = new StringBuffer();
		String sql = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(classBean).getMapingEnty().toUpperCase();
		int strIdx = sql.indexOf("SELECT");
		if (strIdx > -1) {
			Map<String, String> paramkey = new HashMap<String, String>();
			if (paramter != null) {
				Iterator<?> it = paramter.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					paramkey.put(":" + key.toUpperCase(), ":" + key);
				}
			}
			dynamicSql.append(sql);
			if (!sql.contains("WHERE")) {
				dynamicSql.append(" WHERE 1=1 ");
			}

			int endIdx = sql.indexOf("FROM");
			String[] cols = StringUtils.split(sql.substring(strIdx + 6, endIdx), ",");
			if (StringUtils.isNotBlank(condtion)) {
				// 将所有的查询列放入到map容器中
				Map<String, String> colsMap = new HashMap<String, String>();
				String[] innerCols = null;
				for (int i = 0; i < cols.length; i++) {
					if (cols[i].contains(" AS ")) {
						innerCols = StringUtils.split(cols[i], " ");
						if (innerCols.length > 2) {
							colsMap.put(innerCols[2], innerCols[0]);
						} else {
							colsMap.put(innerCols[1], innerCols[0]);
						}
					} else if (cols[i].contains(".")) {
						innerCols = StringUtils.split(cols[i], ".");
						colsMap.put(innerCols[1], cols[i]);
					} else {
						colsMap.put(cols[i], cols[i]);
					}
				}
				String innerKey = null;
				String[] innercols = null;
				String[] condtionCols = StringUtils.split(condtion.toUpperCase().replaceAll(" AND ", "|"), "\\|");
				StringBuffer whereCondtion = new StringBuffer("");
				if (condtionCols != null && condtionCols.length > 0) {
					for (int i = 0; i < condtionCols.length; i++) {
						innerKey = condtionCols[i];
						if ("1=1".equals(innerKey.replaceAll(" ", ""))) {
							continue;
						} else if (StringUtils.contains(innerKey, "<>") && StringUtils.contains(innerKey, ":")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "<>");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" <> ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" <> ").append(paramkey.get(innercols[1])).append(" ");
							}

						} else if (StringUtils.contains(innerKey, "!=") && StringUtils.contains(innerKey, ":")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "!=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" != ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" != ").append(paramkey.get(innercols[1])).append(" ");
							}

						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && !StringUtils.contains(innerKey, ">")
								&& !StringUtils.contains(innerKey, "<")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" = ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" = ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && StringUtils.contains(innerKey, ">")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), ">=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" >= ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && StringUtils.contains(innerKey, "<")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "<=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" <= ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else {
							whereCondtion.append(" AND ").append(innerKey);
						}
					}

				}
				dynamicSql.append(whereCondtion);
			}
		} else {
			return CmLnCommonUtil.getQueryCount(sql, condtion, paramter);

		}
		return CmLnCommonUtil.getQueryCount(dynamicSql.toString(), null, paramter);
	}

	public static String getDynamicSqlByCondsForGrpMgr(Class classBean, String condtion, Map paramter, String custStatus, int startNum, int endNum) throws Exception {
		StringBuffer dynamicSql = new StringBuffer();
		String sql = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(classBean).getMapingEnty().toUpperCase();
		int strIdx = sql.indexOf("SELECT");
		if (strIdx > -1) {
			Map<String, String> paramkey = new HashMap<String, String>();
			if (paramter != null) {
				Iterator<?> it = paramter.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					paramkey.put(":" + key.toUpperCase(), ":" + key);
				}
			}
			dynamicSql.append(sql);
			if (sql.indexOf("WHERE") < 0) {
				dynamicSql.append(" WHERE 1=1 ");
			}

			int endIdx = sql.indexOf("FROM");
			String[] cols = StringUtils.split(sql.substring(strIdx + 6, endIdx), ",");
			if (StringUtils.isNotBlank(condtion)) {
				// 将所有的查询列放入到map容器中
				Map<String, String> colsMap = new HashMap<String, String>();
				String[] innerCols = null;
				for (int i = 0; i < cols.length; i++) {
					if (cols[i].contains(" AS ")) {
						innerCols = StringUtils.split(cols[i], " ");
						if (innerCols.length > 2) {
							colsMap.put(innerCols[2], innerCols[0]);
						} else {
							colsMap.put(innerCols[1], innerCols[0]);
						}
					} else if (cols[i].contains(".")) {
						innerCols = StringUtils.split(cols[i], ".");
						colsMap.put(innerCols[1], cols[i]);
					} else {
						colsMap.put(cols[i], cols[i]);
					}
				}
				String innerKey = null;
				String[] innercols = null;
				String[] condtionCols = StringUtils.split(condtion.toUpperCase().replaceAll(" AND ", "|"), "\\|");
				StringBuffer whereCondtion = new StringBuffer("");
				if (condtionCols != null && condtionCols.length > 0) {
					for (int i = 0; i < condtionCols.length; i++) {
						innerKey = condtionCols[i];
						if (innerKey.replaceAll(" ", "").equals("1=1")) {
							continue;
						} else if (StringUtils.contains(innerKey, "<>") && StringUtils.contains(innerKey, ":")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "<>");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" <> ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" <> ").append(paramkey.get(innercols[1])).append(" ");
							}

						} else if (StringUtils.contains(innerKey, "!=") && StringUtils.contains(innerKey, ":")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "!=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" != ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" != ").append(paramkey.get(innercols[1])).append(" ");
							}

						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && !StringUtils.contains(innerKey, ">")
								&& !StringUtils.contains(innerKey, "<") && !StringUtils.contains(innerKey, "IN")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" = ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" = ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && StringUtils.contains(innerKey, ">")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), ">=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" >= ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && StringUtils.contains(innerKey, "<")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "<=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" <= ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "IN")) {
							// 获取IN前面的查询列，只会有一个列
							String[] inQueryCols = StringUtils.split(innerKey.toUpperCase().replaceAll(" IN ", "|"), "\\|");
							// 将后面的where查询列获取到
							String[] inCondCods = StringUtils.split(innerKey.toUpperCase().replaceAll(" WHERE ", "|"), "\\|");
							if (inCondCods != null && inCondCods.length > 1) {
								String[] inWhereConds = StringUtils.split(inCondCods[1].replaceAll(" AND ", "|"), "\\|");
								// 将IN前面的查询字段，修改为具体表中的字段，如GC.CUST_ID
								inCondCods[0] = inCondCods[0].replaceFirst(inQueryCols[0].trim(), colsMap.get(inQueryCols[0].trim()));
								StringBuffer inBuffer = new StringBuffer();
								inBuffer.append(inCondCods[0]).append(" WHERE 1=1 ");
								String inWhereCol = null;
								String[] tempCondCols = null;
								for (int k = 0; k < inWhereConds.length; k++) {
									inWhereCol = inWhereConds[k];
									if (StringUtils.contains(inWhereCol, "=") && StringUtils.contains(inWhereCol, ":")) {
										tempCondCols = StringUtils.split(inWhereCol.replaceAll(" ", ""), "=");
										inBuffer.append(" AND ").append(tempCondCols[0]).append(" = ");
										if (StringUtils.contains(tempCondCols[1], "(")) {
											tempCondCols[1] = tempCondCols[1].replaceAll("\\(", "");
											inBuffer.append(paramkey.get(tempCondCols[1])).append("(");
										} else if (StringUtils.contains(tempCondCols[1], ")")) {
											tempCondCols[1] = tempCondCols[1].replaceAll("\\)", "");
											inBuffer.append(paramter.get(paramkey.get(tempCondCols[1]).replaceAll(":", ""))).append(")");
										}

										whereCondtion.append(" AND ").append(inBuffer.toString());
										inBuffer.delete(0, inBuffer.length());
									}
								}
							} else {
								// 将IN前面的查询字段，修改为具体表中的字段，如GC.CUST_ID
								inQueryCols[0] = inQueryCols[0].replaceAll(inQueryCols[0].trim(), colsMap.get(inQueryCols[0].trim()));
								StringBuffer inBuffer = new StringBuffer();
								inBuffer.append(inQueryCols[0]).append(" IN(");
								// 截取需要替换的绑定变量
								int start = inCondCods[0].indexOf("(");
								int end = inCondCods[0].indexOf(")");
								String tempParam = inCondCods[0].substring(start + 1, end);
								String[] inParams = tempParam.split(",");
								String inParam = null;
								for (int k = 0; k < inParams.length; k++) {
									inParam = inParams[k].trim();
									inBuffer.append(paramter.get(inParam.replaceAll(":", "")));
									if (k < inParams.length - 1) {
										inBuffer.append(",");
									}
								}
								whereCondtion.append(" AND ").append(inBuffer.toString()).append(")");
								inBuffer.delete(0, inBuffer.length());
							}
							// 支持多选框改造
							if (!CmCommonUtil.isEmptyObj(custStatus)) {
								whereCondtion.append(custStatus);
							}
						} else {
							whereCondtion.append(" AND ").append(innerKey);
						}
					}

				}
				dynamicSql.append(whereCondtion.toString().replaceAll("%Y-%M-%D %H:%I:%S", "%Y-%m-%d %H:%i:%s"));
			}
		} else {
			dynamicSql.append("SELECT * FROM ").append(sql).append(" WHERE ").append(condtion);

		}
		return CmLnCommonUtil.getQueryResult(dynamicSql.toString(), null, startNum, endNum, paramter);
	}

	/**
	 * 获取查询客户数量的SQL
	 * @param classBean
	 * @param condtion
	 * @param paramter
	 * @param custStatus
	 * @return
	 * @throws Exception
	 */
	public static String getDynamicCountSqlByCondsForGrpMgr(Class classBean, String condtion, Map paramter, String custStatus) throws Exception {
		StringBuffer dynamicSql = new StringBuffer();
		String sql = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(classBean).getMapingEnty().toUpperCase();
		int strIdx = sql.indexOf("SELECT");
		if (strIdx > -1) {
			Map<String, String> paramkey = new HashMap<String, String>();
			if (paramter != null) {
				Iterator<?> it = paramter.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					paramkey.put(":" + key.toUpperCase(), ":" + key);
				}
			}
			dynamicSql.append(sql);
			if (!sql.contains("WHERE")) {
				dynamicSql.append(" WHERE 1=1 ");
			}

			int endIdx = sql.indexOf("FROM");
			String[] cols = StringUtils.split(sql.substring(strIdx + 6, endIdx), ",");
			if (StringUtils.isNotBlank(condtion)) {
				// 将所有的查询列放入到map容器中
				Map<String, String> colsMap = new HashMap<String, String>();
				String[] innerCols = null;
				for (int i = 0; i < cols.length; i++) {
					if (cols[i].contains(" AS ")) {
						innerCols = StringUtils.split(cols[i], " ");
						if (innerCols.length > 2) {
							colsMap.put(innerCols[2], innerCols[0]);
						} else {
							colsMap.put(innerCols[1], innerCols[0]);
						}
					} else if (cols[i].contains(".")) {
						innerCols = StringUtils.split(cols[i], ".");
						colsMap.put(innerCols[1], cols[i]);
					} else {
						colsMap.put(cols[i], cols[i]);
					}
				}
				String innerKey = null;
				String[] innercols = null;
				String[] condtionCols = StringUtils.split(condtion.toUpperCase().replaceAll(" AND ", "|"), "\\|");
				StringBuffer whereCondtion = new StringBuffer("");
				if (condtionCols != null && condtionCols.length > 0) {
					for (int i = 0; i < condtionCols.length; i++) {
						innerKey = condtionCols[i];
						if ("1=1".equals(innerKey.replaceAll(" ", ""))) {
							continue;
						} else if (StringUtils.contains(innerKey, "<>") && StringUtils.contains(innerKey, ":")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "<>");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" <> ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" <> ").append(paramkey.get(innercols[1])).append(" ");
							}

						} else if (StringUtils.contains(innerKey, "!=") && StringUtils.contains(innerKey, ":")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "!=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" != ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" != ").append(paramkey.get(innercols[1])).append(" ");
							}

						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && !StringUtils.contains(innerKey, ">")
								&& !StringUtils.contains(innerKey, "<") && !StringUtils.contains(innerKey, "IN")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(colsMap.get(innercols[0])).append(" = ").append(paramkey.get(innercols[1])).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" = ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && StringUtils.contains(innerKey, ">")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), ">=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" >= ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ":") && StringUtils.contains(innerKey, "<")) {
							innercols = StringUtils.split(innerKey.replaceAll(" ", ""), "<=");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							} else {
								whereCondtion.append(" AND ").append(innercols[0]).append(" <= ").append(paramkey.get(innercols[1])).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "IN")) {
							// 获取IN前面的查询列，只会有一个列
							String[] inQueryCols = StringUtils.split(innerKey.toUpperCase().replaceAll(" IN ", "|"), "\\|");
							// 将后面的where查询列获取到
							String[] inCondCods = StringUtils.split(innerKey.toUpperCase().replaceAll(" WHERE ", "|"), "\\|");
							if (inCondCods != null && inCondCods.length > 1) {
								String[] inWhereConds = StringUtils.split(inCondCods[1].replaceAll(" AND ", "|"), "\\|");
								// 将IN前面的查询字段，修改为具体表中的字段，如GC.CUST_ID
								inCondCods[0] = inCondCods[0].replaceFirst(inQueryCols[0].trim(), colsMap.get(inQueryCols[0].trim()));
								StringBuffer inBuffer = new StringBuffer();
								inBuffer.append(inCondCods[0]).append(" WHERE 1=1 ");
								String inWhereCol = null;
								String[] tempCondCols = null;
								for (int k = 0; k < inWhereConds.length; k++) {
									inWhereCol = inWhereConds[k];
									if (StringUtils.contains(inWhereCol, "=") && StringUtils.contains(inWhereCol, ":")) {
										tempCondCols = StringUtils.split(inWhereCol.replaceAll(" ", ""), "=");
										inBuffer.append(" AND ").append(tempCondCols[0]).append(" = ");
										if (StringUtils.contains(tempCondCols[1], "(")) {
											tempCondCols[1] = tempCondCols[1].replaceAll("\\(", "");
											inBuffer.append(paramkey.get(tempCondCols[1])).append("(");
										} else if (StringUtils.contains(tempCondCols[1], ")")) {
											tempCondCols[1] = tempCondCols[1].replaceAll("\\)", "");
											inBuffer.append(paramter.get(paramkey.get(tempCondCols[1]).replaceAll(":", ""))).append(")");
										}

										whereCondtion.append(" AND ").append(inBuffer.toString());
										inBuffer.delete(0, inBuffer.length());
									}
								}
							} else {
								// 将IN前面的查询字段，修改为具体表中的字段，如GC.CUST_ID
								inQueryCols[0] = inQueryCols[0].replaceAll(inQueryCols[0].trim(), colsMap.get(inQueryCols[0].trim()));
								StringBuffer inBuffer = new StringBuffer();
								inBuffer.append(inQueryCols[0]).append(" IN(");
								// 截取需要替换的绑定变量
								int start = inCondCods[0].indexOf("(");
								int end = inCondCods[0].indexOf(")");
								String tempParam = inCondCods[0].substring(start + 1, end);
								String[] inParams = tempParam.split(",");
								String inParam = null;
								for (int k = 0; k < inParams.length; k++) {
									inParam = inParams[k].trim();
									inBuffer.append(paramter.get(inParam.replaceAll(":", "")));
									if (k < inParams.length - 1) {
										inBuffer.append(",");
									}
								}
								whereCondtion.append(" AND ").append(inBuffer.toString()).append(")");
								inBuffer.delete(0, inBuffer.length());
							}
							// 支持多选框改造
							if (!CmCommonUtil.isEmptyObj(custStatus)) {
								whereCondtion.append(custStatus);
							}
						} else {
							whereCondtion.append(" AND ").append(innerKey);
						}
					}

				}
				dynamicSql.append(whereCondtion.toString().replaceAll("%Y-%M-%D %H:%I:%S", "%Y-%m-%d %H:%i:%s"));
			}
		} else {
			dynamicSql.append("SELECT * FROM ").append(sql).append(" WHERE ").append(condtion);

		}
		return CmLnCommonUtil.getQueryCount(dynamicSql.toString(), null, paramter);
	}

	/**	
	 *  字符串转换到时间格式	 
	 *  @param dateStr 需要转换的字符串	 
	 *  @param formatStr 需要格式的目标字符串  举例 yyyy-MM-dd	 
	 *  @return Date 返回转换后的时间	 
	 *  @throws ParseException 转换异常	 
	 */
	public static Timestamp StringToDate(String dateStr, String formatStr) {
		DateFormat sdf = new SimpleDateFormat(formatStr);
		Date date;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			return null;
		}
		if (date != null) {
			return new Timestamp(date.getTime());
		} else {
			return null;
		}
	}

	public static String getParamByGetMethod(String paramStr, String paramName) throws Exception {
		String[] regs = paramStr.split("&");
		Map<String, String> map = new HashMap<String, String>();
		if (regs.length > 0) {
			for (int i = 0; i < regs.length; i++) {
				if (!"".equals(regs[i])) {
					if (!regs[i].contains("=")) {
						throw new Exception("Parameter contains illegal characters &");
					}
					String name = regs[i].substring(0, regs[i].indexOf("="));
					String value = regs[i].substring(regs[i].indexOf("=") + 1);
					map.put(name, value);
				}
			}
		} else {
			return null;
		}
		return map.get(paramName);
	}

	/**
	 * 异常信息保存
	 * @param errorMsg
	 * @throws Exception
	 */
	public static void saveCmFileSyncErrLog(String errorMsg, String fileName, String kobNumber) throws Exception {
		IBOCmFileSyncErrLogValue errorValue = new BOCmFileSyncErrLogBean();
		errorValue.setFileType(CmConstants.errFileType.KOB);
		errorValue.setRecordId(kobNumber);
		errorValue.setErrMsg(errorMsg);
		errorValue.setFileName(fileName);
		CmServiceFactory.getCustomerSV().saveCmFileSyncErrLog(errorValue);
	}

	/**
	 * 生成随机的regionId
	 * @return
	 * @throws Exception
	 */
	public static String generateRegionId() throws Exception {
		ICommonSV commonSV = (ICommonSV) ServiceFactory.getService(ICommonSV.class);
		return commonSV.getRegionIdByNewUser();
	}

	/**
	 * 
	 * map--->BOCmCustContactMediumBean
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public static IBOCmCustContactMediumValue mapConvertToContactBean(Map map, IBOCmCustContactMediumValue value) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(map)) {
			String mediumType = (String) map.get("MediumType");
			String mediumValue = (String) map.get("MediumValue");
			String priority = (String) map.get("Priority");
			String isNoDisturbing = (String) map.get("IsNoDisturbing");

			if (StringUtils.isBlank(mediumType) && value != null) {
				mediumType = String.valueOf(value.getContMedTypeId());
			}

			if (value == null) {
				value = new BOCmCustContactMediumBean();
			}

			value.setContMedTypeId(Long.parseLong(mediumType));
			// 如果是1开头则是实体地址
			if (mediumType.startsWith("1")) {
				value.setAddressDetail(mediumValue);
			}
			// 如果是2开头则是email
			if (mediumType.startsWith("2")) {
				value.setEmailAddress(mediumValue);
			}
			// 如果是3开头则是电子地址
			if (mediumType.startsWith("3")) {
				value.setContNumber(mediumValue);
			}
			if (StringUtils.isNotBlank(priority)) {
				value.setPriority(Long.parseLong(priority));
			}
			if (StringUtils.isNotBlank(isNoDisturbing)) {
				value.setIsNoDisturbing(Long.parseLong(isNoDisturbing));
			}
			return value;
		}
		return null;
	}

	/**
	 * 
	 * BOCmCustContactMediumBean-->map
	 * @param value
	 * @return
	 * @throws 
	 */
	public static Map contactBeanConvertToMap(IBOCmCustContactMediumValue value) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(value)) {
			Map map = new HashMap();
			map.put("MediumType", value.getContMedTypeId());
			// 如果1开头则是实体地址
			if (String.valueOf(value.getContMedTypeId()).startsWith("1")) {
				map.put("MediumValue", value.getAddressDetail());
			}
			// 如果2开头则是email
			if (String.valueOf(value.getContMedTypeId()).startsWith("2")) {
				map.put("MediumValue", value.getEmailAddress());
			}
			// 如果3开头则是电子地址
			if (String.valueOf(value.getContMedTypeId()).startsWith("3")) {
				map.put("MediumValue", value.getContNumber());
			}
			if (value.getPriority() > 0) {
				map.put("Priority", value.getPriority());
			}
			if (value.getIsNoDisturbing() > 0) {
				map.put("IsNoDisturbing", value.getIsNoDisturbing());
			}
			return map;
		}
		return null;
	}

	public static String getDynamicSqlByCondsForAcct(Class classBean, String condtion, Map paramter, int startNum, int endNum) throws Exception {
		StringBuffer dynamicSql = new StringBuffer();
		String sql = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(classBean).getMapingEnty().toUpperCase();
		int strIdx = sql.indexOf("SELECT");
		if (strIdx > -1) {
			Map<String, String> paramkey = new HashMap<String, String>();
			if (paramter != null) {
				Iterator<?> it = paramter.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					paramkey.put(":" + key.toUpperCase(), ":" + key);
				}
			}
			dynamicSql.append(sql);
			if (!sql.contains("WHERE")) {
				dynamicSql.append(" WHERE 1=1 ");
			}

			int endIdx = sql.indexOf("FROM");
			String[] cols = StringUtils.split(sql.substring(strIdx + 6, endIdx), ",");
			if (StringUtils.isNotBlank(condtion)) {
				// 将所有的查询列放入到map容器中
				Map<String, String> colsMap = new HashMap<String, String>();
				String[] innerCols = null;
				for (int i = 0; i < cols.length; i++) {
					if (cols[i].contains(" AS ")) {
						innerCols = StringUtils.split(cols[i], " ");
						if (innerCols.length > 2) {
							colsMap.put(innerCols[2], innerCols[0]);
						} else {
							colsMap.put(innerCols[1], innerCols[0]);
						}
					} else if (cols[i].contains(".")) {
						innerCols = StringUtils.split(cols[i], ".");
						colsMap.put(innerCols[1], cols[i]);
					} else {
						colsMap.put(cols[i], cols[i]);
					}
				}
				String innerKey = null;
				String[] innercols = null;
				String[] condtionCols = StringUtils.split(condtion.toUpperCase().replaceAll(" AND ", "|"), "\\|");
				StringBuffer whereCondtion = new StringBuffer("");
				if (condtionCols != null && condtionCols.length > 0) {
					for (int i = 0; i < condtionCols.length; i++) {
						innerKey = condtionCols[i];
						if ("1=1".equals(innerKey.replaceAll(" ", ""))) {
							continue;
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, ">")) {
							String tempCodition = null;
							if (colsMap.containsKey("CYCLE_EXPIRE_DATE")) {
								tempCodition = condtionCols[i].replaceAll("CYCLE_EXPIRE_DATE", colsMap.get("CYCLE_EXPIRE_DATE"));
								whereCondtion.append(" AND ").append(tempCodition).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "=") && StringUtils.contains(innerKey, "<")) {
							if (colsMap.containsKey("CYCLE_EFFECTIVE_DATE")) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll("CYCLE_EFFECTIVE_DATE", colsMap.get("CYCLE_EFFECTIVE_DATE"))).append(" ");
							}
						} else if (StringUtils.contains(innerKey, "IN")) {
							innercols = StringUtils.split(innerKey.toUpperCase().replaceAll(" IN ", "|"), "\\|");
							if (colsMap.containsKey(innercols[0])) {
								whereCondtion.append(" AND ").append(condtionCols[i].replaceAll(innercols[0], colsMap.get(innercols[0]))).append(" ");
							}
						} else {
							whereCondtion.append(" AND ").append(innerKey);
						}
					}

				}
				dynamicSql.append(whereCondtion);
			}
		} else {
			dynamicSql.append("SELECT * FROM ").append(sql).append(" WHERE ").append(condtion);

		}
		return CmLnCommonUtil.getQueryResult(dynamicSql.toString(), null, startNum, endNum, paramter);
	}

	public static UserInfoInterface getDefaultUser() throws Exception {
		String tenantId = TenantIDFactory.getTenant();
		// 设置操作员信息
		UserInfoInterface user = ServiceManager.getNewBlankUserInfo();
		user.setTenantId(tenantId);
		String opCode = CmStaticDataUtil.getCodeNameByCodeTypeAndCodeValue("CM_PROCESS_OP_CODE", tenantId);
		IBOSecOperatorValue val = OrgmodelClient.getOperatorByCode(opCode);
		user = OrgmodelClient.setUserInfo(val.getOperatorId());
		return user;
	}

	public static Map ValueToMapByGroupContact(IBOCmContactContMediumValue value) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(value)) {
			Map map = new HashMap();
			map.put("MediumType", value.getContMedTypeId());
			// 如果2开头则是email
			if (String.valueOf(value.getContMedTypeId()).startsWith("2")) {
				map.put("MediumValue", value.getEmailAddress());
			}
			// 如果3开头则是电子地址
			if (String.valueOf(value.getContMedTypeId()).startsWith("3")) {
				map.put("MediumValue", value.getContNumber());
			}
			if (value.getPriority() > 0) {
				map.put("Priority", value.getPriority());
			}
			if (value.getIsNoDisturbing() > 0) {
				map.put("IsNoDisturbing", value.getIsNoDisturbing());
			}
			return map;
		}
		return null;
	}

	public static IBOCmContactContMediumValue MapToValueByGroupContact(Map map, IBOCmContactContMediumValue value) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(map)) {
			String mediumType = (String) map.get("MediumType");
			String mediumValue = (String) map.get("MediumValue");
			String priority = (String) map.get("Priority");
			String isNoDisturbing = (String) map.get("IsNoDisturbing");

			if (StringUtils.isBlank(mediumType) && value != null) {
				mediumType = String.valueOf(value.getContMedTypeId());
			}

			if (value == null) {
				value = new BOCmContactContMediumBean();
			}

			value.setContMedTypeId(Long.parseLong(mediumType));
			// 如果是2开头则是email
			if (mediumType.startsWith("2")) {
				value.setEmailAddress(mediumValue);
			}
			// 如果是3开头则是电子地址
			if (mediumType.startsWith("3")) {
				value.setContNumber(mediumValue);
			}
			if (StringUtils.isNotBlank(priority)) {
				value.setPriority(DataType.getAsInt(priority));
			}
			if (StringUtils.isNotBlank(isNoDisturbing)) {
				value.setIsNoDisturbing(DataType.getAsInt(isNoDisturbing));
			}
			return value;
		}
		return null;
	}

	public static boolean isContain(int[] srcArray, int dest) throws Exception {
		if (srcArray != null && srcArray.length > 0) {
			for (int i = 0; i < srcArray.length; i++) {
				if (srcArray[i] == dest) {
					return true;
				}
			}
		}
		return false;
	}

	public static String getTenant() throws Exception {
		return TenantIDFactory.getTenant();
	}

	/**
	 * 推送消息
	 * @param notificationCode
	 * @param param 模板参数
	 * @param billID 目标发送手机号码
	 * @param custId  目标客户ID
	 * @param managerId 操作员ID
	 * @throws Exception
	 */
	public static void sendMsm(String notificationCode, Map param, String billID, long custId, long managerId) throws Exception {
		/**
		* 推送消息
		* @param notificationCode 通知编码（必填）
		* @param mediaType 媒体类型（必填）
		* @param targetAddress 目标地址（必填）
		* @param paramMap 模板参数（必填）
		* @param customerId 客户ID（可选）
		* @param opId 操作员ID（可选）
		* @param strategy 任务策略（可选）
		* @param ciInfo 客户接触信息（可选）
		* @return 推送任务ID
		* @throws Exception
		* @throws RemoteException
		*/
		PushClient.pushSms(notificationCode, null, billID, param, null, custId, managerId, null, null);
	}

	/**
	 * 
	 * @param custId  客户编号
	 * @param operId  操作员编号
	 * @param tenantId 租户编号
	 * @param srcBusiType  业务类型编码
	 * @param info   结果明细
	 * @throws Exception
	 */
	public static void createCustomerInteraction(long custId, long operId, String tenantId, long srcBusiType, String info) throws Exception {
		ICustomerInteractionSV interactionSV = (ICustomerInteractionSV) ServiceFactory.getService(ICustomerInteractionSV.class);
		CustomerInteractionBean interaction = new CustomerInteractionBean();
		// 业务源系统
		interaction.setSrcSysId("CRM");
		// 渠道代码
		interaction.setChannelCode("CustMgnt");
		// 客户编号
		interaction.setCustId(custId);
		// 操作员编号
		interaction.setOpId(operId);
		// 租户编号
		interaction.setTenantId(tenantId);
		// 接触类型 1：客户主动接触；2：客户被动接触
		interaction.setContactType(1);
		// 接触媒介 1：电话；2：短信；3：面对面；4：USSD；5：邮件；6：平信；7：IVR；8：彩信；9：Facebook；10：Twitter；11：便签；12：提醒；13：公告；14：传真
		interaction.setMediaType("3");
		// 业务类型编码
		interaction.setSrcBusiType(DataType.getAsString(srcBusiType));
		// 业务流水号
		interaction.setSrcInteractionEntityId("");
		// 交互时间
		interaction.setInteractionTime(DataTypeUtils.getCurrentDate());
		// 交互结束时间
		interaction.setInteractionCompleteTime(DataTypeUtils.getCurrentDate());
		// 交互结果 0：成功，1：失败
		interaction.setInteractionResult(0);
		// 结果明细
		interaction.setInteractionResultDetail(info);

		interactionSV.createCustomerInteraction(interaction);
	}

	/**
	 * 创建客户管理TT公单
	 * @Function CreateTicketForCM
	 * @Description 
	 *
	 * @param map{CUST_ID(必填),ERROR_CODE(必填),ERROR_MESSAGE(必填),SOURCE_SYSTEM(必填，CPR：个人  KOB：集团 ),ERROR_EXT_INFO()}
	 * @return 流水号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-21 下午1:02:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-21     yangjh           v1.0.0               修改原因<br>
	 */
	public static String CreateTicketForCM(Map map) throws Exception {
		String SerialNo = null;
		ICmCommonSV sv = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		SerialNo = sv.CreateTicketForCM(map);
		return SerialNo;
	}

	/**
	 * 获取客户信用度等级
	 * 
	 * @return
	 * @throws Exception
	 */
	public static IBOBsParaDetailValue[] getDkCreditClass() throws Exception {
		String cacheKey = "Sp_X_LEVEL_CM_DK_CREDIT";
		IBOBsParaDetailValue[] bsParamDetalValue = null;
		Object obj = CacheFactory.get(BsParaDetailCacheImpl.class, cacheKey);
		if (obj != null) {
			List bsParamDetailList = (List) obj;
			if (bsParamDetailList.size() > 0) {
				bsParamDetalValue = (IBOBsParaDetailValue[]) bsParamDetailList.toArray(new IBOBsParaDetailValue[0]);
				String codeName = "";
				for (int i = 0; i < bsParamDetalValue.length; i++) {
					if (bsParamDetalValue[i] != null) {
						codeName = getStaticResource(bsParamDetalValue[i].getPara2());
						bsParamDetalValue[i].setPara2(codeName);
					}
				}
			}
		}
		return bsParamDetalValue;
	}

	private static String getStaticResource(String key) {
		String rtn = null;
		try {
			if (AppframeLocaleFactory.getPrefLanguage()) {
				BsResource objBsResource = (BsResource) CacheFactory.get(MultilingualStaticI18nResourceCacheImpl.class, key);
				if (objBsResource != null) {
					Locale current = AppframeLocaleFactory.getCurrentLocale();
					String strLocale = current.toString();
					Map langColumnMap = CrmLocaleFactory.getLangColumnMap();
					rtn = objBsResource.getEnusRes();
					strLocale = strLocale.trim().toLowerCase();
					if (langColumnMap.containsKey(strLocale)) {
						String column = (String) langColumnMap.get(strLocale);
						rtn = (String) objBsResource.getLangResMap().get(column);
					}
				}
			}
		} catch (Exception ex) {
			throw new RuntimeException("key:" + key + ",resource found exception", ex);
		}
		return rtn;
	}

	/**
	 * 合并优先级后的细分
	 * @param oldSegID
	 * @param newSegID
	 * @return
	 * @throws Exception 
	 */
	public static long getSegmentAfterMergePriority(long oldSegID, long newSegID) throws Exception {
		if (oldSegID < 200000000000L || newSegID < 200000000000L) {
			throw new Exception("oldSegID:{" + oldSegID + "} or newSegID:{" + newSegID + "} is not correct!");
		}
		long finalSeg = 0;
		if (String.valueOf(oldSegID).equals(CmConstants.segment.NO_SEGMENT)) {
			finalSeg = newSegID;
		} else if (String.valueOf(newSegID).equals(CmConstants.segment.NO_SEGMENT)) {
			finalSeg = oldSegID;
		} else {
			Map map = new HashMap<Long, Long>();
			map.put(Long.parseLong(CmConstants.segment.KA), 5L);
			map.put(Long.parseLong(CmConstants.segment.LA), 4L);
			map.put(Long.parseLong(CmConstants.segment.PA), 3L);
			map.put(Long.parseLong(CmConstants.segment.MA), 2L);
			map.put(Long.parseLong(CmConstants.segment.SA), 1L);
			long innerOldSeg = (Long) map.get(oldSegID);
			long innerNewSeg = (Long) map.get(newSegID);
			if (innerNewSeg > innerOldSeg) {
				finalSeg = newSegID;
			} else {
				finalSeg = oldSegID;
			}
		}

		return finalSeg;
	}

	/**
	 * 
	 * @Function getEndOfQuarterOrMonth
	 * @Description 
	 *
	 * @param type(1:Quarter-1,2:month,3:Quarter-11);
	 * @return
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @throws Exception 
	 * @date 2015-9-22 下午1:04:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-22     yangjh           v1.0.0               修改原因<br>
	 */
	public static Date getLastDayOfQuarterOrMonth(int type, Date date) throws Exception {
		Date rtn;
		if (type == 1) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			rtn = TruncDate(getLastDayOfQuarter(calendar.get(Calendar.YEAR), getQuarterOfYear(date)));
		} else if (type == 2) {
			rtn = TruncDate(getLastDayOfMonth(date));
		} else {
			rtn = TruncDate(getLastDayOfSpecialQuarter(date));
		}
		return rtn;
	}

	/**
	 * 返回指定年季的季的最后一天
	 *
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static Date getLastDayOfQuarter(Integer year, Integer quarter) {
		Calendar calendar = Calendar.getInstance();
		Integer month;
		if (quarter == 1) {
			month = 3 - 1;
		} else if (quarter == 2) {
			month = 6 - 1;
		} else if (quarter == 3) {
			month = 9 - 1;
		} else if (quarter == 4) {
			month = 12 - 1;
		} else {
			month = calendar.get(Calendar.MONTH);
		}
		return getLastDayOfMonth(year, month);
	}

	/**
	 * 返回指定年月的月的最后一天
	 *
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getLastDayOfMonth(Integer year, Integer month) {
		Calendar calendar = Calendar.getInstance();
		if (year == null) {
			year = calendar.get(Calendar.YEAR);
		}
		if (month == null) {
			month = calendar.get(Calendar.MONTH);
		}
		calendar.set(year, month, 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	* 返回指定日期的季度
	*
	* @param date
	* @return
	*/
	public static int getQuarterOfYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) / 3 + 1;
	}

	/**
	 * 返回指定日期的月的最后一天
	 *
	 * @param date
	 * @return
	 */
	public static Date getLastDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		if (day >= 11) {
			calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
			calendar.roll(Calendar.DATE, -1);
		} else {
			calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) - 1, 1);
			calendar.roll(Calendar.DATE, -1);
		}
		return calendar.getTime();
	}

	private static Date TruncDate(Date data) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(data);
		return sdf.parse(s);
	}

	private static Date getLastDayOfSpecialQuarter(Date date) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		Integer year = calendar.get(Calendar.YEAR);
		Integer quarter = getQuarterOfYear(date);
		Integer month = calendar.get(Calendar.MONTH);
		Integer day = calendar.get(Calendar.DAY_OF_MONTH);
		if (quarter == 1) {
			if ((month + 1) == 3 && day >= 11) {
				month = month + 2;
			} else {
				month = 3 - 2;
			}
		} else if (quarter == 2) {
			if ((month + 1) == 6 && day >= 11) {
				month = month + 2;
			} else {
				month = 6 - 2;
			}
		} else if (quarter == 3) {
			if ((month + 1) == 9 && day >= 11) {
				month = month + 2;
			} else {
				month = 9 - 2;
			}
		} else if (quarter == 4) {
			if ((month + 1) == 12 && day >= 11) {
				month = month + 2;
			} else {
				month = 12 - 2;
			}
		} else {
			month = calendar.get(Calendar.MONTH);
		}
		return getLastDayOfMonth(year, month);
	}

	/**
	 * 
	 * @Function: validateSidedoer
	 * @Description:
	 * 
	 * @param sidedoer
	 * @return
	 * 
	 * @version: v1.0.0
	 * @author: huangqun
	 * @date: Jul 18, 2011 9:04:17 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Jul 18, 2011
	 * huangqun v1.0.0 修改原因
	 */
	public static boolean validateSidedoer(String sidedoer) throws Exception {
		if (StringUtils.isNotBlank(sidedoer)) {
			String maskSidedoer = sidedoer.toLowerCase().replaceAll("\\.", "").trim();
			IBOBsStaticDataValue[] values = StaticDataUtil.getStaticData("CM_SIDEDOER");
			if (CmCommonUtil.isNotEmptyObject(values)) {
				for (IBOBsStaticDataValue value : values) {
					if (maskSidedoer.endsWith(value.getCodeValue())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 获取标准地址描述
	 * @Function getStandAddressDesc
	 * @Description 
	 *
	 * @param inadress
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-3 下午6:11:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-3     yangjh           v1.0.0               修改原因<br>
	 */
	public static String getStandAddressDesc(address inadress) throws Exception {
		StringBuffer addrDesc = new StringBuffer("");
		if (inadress != null) {
			String addressType = inadress.getAddressType();
			if ("NON_STANDARD_ADDRESS".equalsIgnoreCase(addressType)) {
				return inadress.getAddrDesc();
			}
			String streetName = inadress.getStreetName();
			String houseNumber = inadress.getHouseNumber();
			String houseLetter = inadress.getHouseLetter();
			String direction = inadress.getApartment();
			String doorNumber = inadress.getDoorNumber();
			String county = inadress.getCounty();
			String poBox = inadress.getPoBox();
			String coName = inadress.getCoName();
			String country = inadress.getCountry();
			String floor = inadress.getFloor();
			String mainDoor = inadress.getMainDoor();
			String streetName2 = inadress.getStreetName2();
			String streetName3 = inadress.getStreetName3();
			String zipCode = inadress.getZipcode();
			String city = inadress.getCity();
			if (StringUtils.isNotBlank(coName)) {
				if (!coName.toUpperCase().contains("C/O")) {
					addrDesc.append("C/O ").append(coName);
				} else {
					addrDesc.append(coName);
				}
			}
			if (StringUtils.isNotBlank(poBox)) {
				addrDesc.append(" P.O.BOX ").append(poBox);
			}
			if (StringUtils.isNotBlank(streetName)) {
				addrDesc.append(" ").append(streetName);
				if (StringUtils.isNotBlank(houseNumber)) {
					addrDesc.append(" ").append(houseNumber);
				}
				if (StringUtils.isNotBlank(houseLetter)) {
					addrDesc.append(" ").append(houseLetter);
				}
				if (StringUtils.isNotBlank(floor)) {
					addrDesc.append(",").append(floor);
				}
				if (StringUtils.isNotBlank(mainDoor)) {//TELENOR_DEFECT_20181108_0004增加门牌号TV/TH的展示
					addrDesc.append(". ").append(mainDoor);
				}
				if (StringUtils.isNotBlank(direction)) {
					addrDesc.append(".").append(direction);
				} else if (StringUtils.isNotBlank(doorNumber)) {
					addrDesc.append(".").append(doorNumber);
				}

				if (StringUtils.isNotBlank(county)) {
					addrDesc.append(" ").append(county);
				}
				if (StringUtils.isNotBlank(streetName2)) {
					addrDesc.append(" ").append(streetName2);
				}
				if (StringUtils.isNotBlank(streetName3)) {
					addrDesc.append(" ").append(streetName3);
				}
				if (StringUtils.isNotEmpty(zipCode)) {
					addrDesc.append(" ").append(zipCode);
				}
				if (StringUtils.isNotEmpty(city)) {
					addrDesc.append(" ").append(city);
				}

			}
		}
		return addrDesc.toString().trim();

	}

	/**
	 * 
	 * @Function checkXmlChar
	 * @Description 将xml文件中的所有特殊字符替换
	 *
	 * @param data
	 * @param replace 需要替换的字符，空就删除特殊字符
	 * @return
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2017-3-10 上午11:29:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2017-3-10      shitian           v1.0.0               修改原因<br>
	 */
	public static String checkXmlChar(String data, String replace) {
		StringBuffer appender = new StringBuffer("");
		if (StringUtils.isNotBlank(data)) {
			appender = new StringBuffer(data.length());
			for (int i = 0; i < data.length(); i++) {
				char ch = data.charAt(i);
				if ((ch == 0x9) || (ch == 0xA) || (ch == 0xD) || ((ch >= 0x20) && (ch <= 0xD7FF)) || ((ch >= 0xE000) && (ch <= 0xFFFD)) || ((ch >= 0x10000) && (ch <= 0x10FFFF))) {
					appender.append(ch);
				} else {
					if (StringUtils.isNotBlank(replace)) {
						appender.append(replace);
					}
				}
			}
		}
		return appender.toString();
	}
	
	/**   
	 * 设置创建时间、工号等信息。
	 * 
	 * @Function setCommonValue
	 * @Description 
	 *
	 * @param dsi
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author wuchao5
	 * @date 2018-7-26 上午12:11:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2018-7-26     wuchao5           v1.0.0               修改原因<br>
	 */
	public static void setCommonValue(DataStructInterface dsi) throws Exception {
		String S_OP_ID = "OP_ID";
		String S_ORG_ID = "ORG_ID";
		String S_DONE_CODE = "DONE_CODE";
		String S_DONE_DATE = "DONE_DATE";
		String S_CREATE_DATE = "CREATE_DATE";
		String S_EFFECTIVE_DATE = "EFFECTIVE_DATE";
		String S_EXPIRE_DATE = "EXPIRE_DATE";
		String S_CREATE_OP_ID = "CREATE_OP_ID";
		String S_CREATE_ORG_ID = "CREATE_ORG_ID";
		String S_REGION_ID = "REGION_ID";
		String S_STATE = "STATE";
		
		ObjectType objectType = dsi.getObjectType();
		// 对于没有具体的BO类型的不处理
		if (objectType instanceof ObjectTypeNull) {
			return;
		}
		// 无任何值改变则跳过
		if (!dsi.isNew() && !dsi.isModified() && dsi.isDeleted()) {
			return;
		}
		Timestamp currDatetime = ServiceManager.getOpDateTime();
		if (dsi.isNew()) {
			// 创建时间
			if (objectType.hasProperty(S_CREATE_DATE) && dsi.get(S_CREATE_DATE) == null) {
				dsi.set(S_CREATE_DATE, currDatetime);
			}
			// 创建操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(S_CREATE_OP_ID) && dsi.get(S_CREATE_OP_ID) == null) {
					dsi.set(S_CREATE_OP_ID, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(S_CREATE_ORG_ID) && dsi.get(S_CREATE_ORG_ID) == null) {
					dsi.set(S_CREATE_ORG_ID, ServiceManager.getUser().getOrgId());
				}
			}
			// 地市
			if (objectType.hasProperty(S_REGION_ID) && dsi.get(S_REGION_ID) == null) {
				dsi.set(S_REGION_ID, CmCommonUtil.getDefaultRegionId());
			}
			// 记录状态
			if (objectType.hasProperty(S_STATE) && dsi.get(S_STATE) == null) {
				dsi.set(S_STATE, CmConstants.RecordState.USE);
			}
			// 失效时间
			if (objectType.hasProperty(S_EXPIRE_DATE) && dsi.get(S_EXPIRE_DATE) == null) {
				dsi.set(S_EXPIRE_DATE, TimeUtil.getMaxExpire());
			}
			// 当前业务操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(S_OP_ID) && dsi.get(S_OP_ID) == null) {
					dsi.set(S_OP_ID, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(S_ORG_ID) && dsi.get(S_ORG_ID) == null) {
					dsi.set(S_ORG_ID, ServiceManager.getUser().getOrgId());
				}
			}
			// 业务流水号
			if (objectType.hasProperty(S_DONE_CODE) && dsi.get(S_DONE_CODE) == null) {
				dsi.set(S_DONE_CODE, ServiceManager.getDoneCode());
			}
			// 当前业务操作时间
			if (objectType.hasProperty(S_DONE_DATE) && dsi.get(S_DONE_DATE) == null) {
				dsi.set(S_DONE_DATE, currDatetime);
			}
			// 生效时间
			if (objectType.hasProperty(S_EFFECTIVE_DATE) && dsi.get(S_EFFECTIVE_DATE) == null) {
				dsi.set(S_EFFECTIVE_DATE, currDatetime);
			}
		} else if (dsi.isModified()) {
			// 逻辑删除时置失效时间
			if (objectType.hasProperty(S_STATE) && dsi.isPropertyModified(S_STATE) && CmConstants.RecordState.ERASE.equals((String) dsi.get(S_STATE))) {
				if (objectType.hasProperty(S_EXPIRE_DATE) && !dsi.isPropertyModified(S_EXPIRE_DATE)) {
					dsi.set(S_EXPIRE_DATE, currDatetime);
				}
			}
			// 当前业务操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(S_OP_ID) && !dsi.isPropertyModified(S_OP_ID)) {
					dsi.set(S_OP_ID, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(S_ORG_ID) && !dsi.isPropertyModified(S_ORG_ID)) {
					dsi.set(S_ORG_ID, ServiceManager.getUser().getOrgId());
				}
			}

			// 业务流水号
			if (objectType.hasProperty(S_DONE_CODE) && !dsi.isPropertyModified(S_DONE_CODE)) {
				dsi.set(S_DONE_CODE, ServiceManager.getDoneCode());
			}
			// 当前业务操作时间
			if (objectType.hasProperty(S_DONE_DATE) && !dsi.isPropertyModified(S_DONE_DATE)) {
				dsi.set(S_DONE_DATE, currDatetime);
			}
			// 生效时间
			// if (objectType.hasProperty(S_EFFECTIVE_DATE) && !dsi.isPropertyModified(S_EFFECTIVE_DATE)) {
			// dsi.set(S_EFFECTIVE_DATE, currDatetime);
			// }
			// 失效时间
			if (objectType.hasProperty(S_EXPIRE_DATE) && dsi.get(S_EXPIRE_DATE) == null) {
				dsi.set(S_EXPIRE_DATE, TimeUtil.getMaxExpire());
			}
			// effictive_date
			// if(objectType.hasProperty(S_EFFECTIVE_DATE)){
			// dsi.set(S_EFFECTIVE_DATE,currDatetime);
			// }
			// 增加对REGION_ID的特殊处理:如果REGION_ID为空，则为了记录历史表能正常记录，暂时使用此方法来屏蔽因为记录历史表出错导致业务异常，但不是万全之策，需要具体的业务中控制REGION_ID在新增时就记录。
			if (objectType.hasProperty(S_REGION_ID) && dsi.get(S_REGION_ID) == null) {
				dsi.initProperty(S_REGION_ID, CmCommonUtil.getDefaultRegionId());
			}
		} else if (dsi.isDeleted()) {
			// 增加对REGION_ID的特殊处理:如果REGION_ID为空，则为了记录历史表能正常记录，暂时使用此方法来屏蔽因为记录历史表出错导致业务异常，但不是万全之策，需要具体的业务中控制REGION_ID在新增时就记录。
			if (objectType.hasProperty(S_REGION_ID) && dsi.get(S_REGION_ID) == null) {
				dsi.initProperty(S_REGION_ID, CmCommonUtil.getDefaultRegionId());
			}
			// 失效时间
			if (objectType.hasProperty(S_EXPIRE_DATE) && !dsi.isPropertyModified(S_EXPIRE_DATE)) {
				dsi.set(S_EXPIRE_DATE, currDatetime);
			}
			// 记录状态
			if (objectType.hasProperty(S_STATE) && !dsi.isPropertyModified(S_STATE)) {
				dsi.set(S_STATE, CmConstants.RecordState.ERASE);
			}
			// 当前业务操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(S_OP_ID) && !dsi.isPropertyModified(S_OP_ID)) {
					dsi.set(S_OP_ID, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(S_ORG_ID) && !dsi.isPropertyModified(S_ORG_ID)) {
					dsi.set(S_ORG_ID, ServiceManager.getUser().getOrgId());
				}
			}
			// 业务流水号
			if (objectType.hasProperty(S_DONE_CODE) && !dsi.isPropertyModified(S_DONE_CODE)) {
				dsi.set(S_DONE_CODE, ServiceManager.getDoneCode());
			}
			// 当前业务操作时间
			if (objectType.hasProperty(S_DONE_DATE) && !dsi.isPropertyModified(S_DONE_DATE)) {
				dsi.set(S_DONE_DATE, currDatetime);
			}
		}
	}

	public static boolean custRemarksCtrl() throws Exception {
		boolean sendFlag = true;
		IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_REMARKS_CONTROL");
		if(busiOperData!=null && busiOperData.length>0){
			if ("-1".equals(busiOperData[0].getCodeValue())) {
				sendFlag = false;
			}
		}
		return sendFlag;
	}

	/**
	 * 通过字符的ASCII码值加减进行首字母大写转换
	 * @param name 入参
	 * @return 首字母大写
	 */
	public static String capitalizeFirstLetter(String name) {
		try {
			if (StringUtils.isNotBlank(name) && Character.isLowerCase(name.charAt(0))) {
				char[] chars = name.toCharArray();
				chars[0] -= 32;
				return String.valueOf(chars);
			}
		} catch (Exception e) {
			log.error("capitalizeFirstLetter occur exception.", e);
		}
		return name;
	}

	/**
	 * CVS-18 判断B2C客户是否有权限展示Email Delivery Method
	 * @return
	 * @throws Exception
	 */
	public static boolean judgeShowEmailSec() throws Exception {
		long opId = SessionManager.getUser().getID();
		return SecframeClient.checkEntityPermission(opId, 10056116L, 10056116L);
	}

	/**
	 * AI-14092 重复客户判断逻辑
	 *
	 * @param custId
	 * @param birthday
	 * @param addressId
	 * @param addressDetail
	 * @param custName
	 * @throws Exception
	 */
	public static void judgeDuplicateCustomer(long custId, String birthday, long addressId, String addressDetail, String custName) throws Exception {
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmIndivCustomerValue[] indivValues = service.queryCmCustByCustInfoAndAddress(custName, birthday, addressId);
		if (CmCommonUtil.isNotEmptyObject(indivValues)) {
			if (indivValues[0].getCustId() != custId) {
				ExceptionUtil.throwBusinessException("CMS9988775");
			}
		} else if (StringUtils.isNotBlank(addressDetail)){
			// 根据地址id没匹配到cust再根据地址详情加强校验
			IBOCmIndivCustomerValue[] newIndivValues = service.queryCmCustByCustInfoByAddressDetail(custName, birthday, addressDetail);
			if (CmCommonUtil.isNotEmptyObject(newIndivValues) && newIndivValues[0].getCustId() != custId) {
				ExceptionUtil.throwBusinessException("CMS9988775");
			}
		}
	}

	/**
	 * 集团公司状态枚举转换
	 * @param status
	 * @return
	 * @throws Exception
	 */
	public static String transformCompanyStatus(String status) throws Exception {
		String finalStatus = "";
		if (StringUtils.isNotBlank(status)) {
			switch (status) {
				case "1":
					finalStatus = CmConstants.companyStatus.AKT;
					break;
				case "2":
					finalStatus = CmConstants.companyStatus.INA;
					break;
				case "3":
					finalStatus = CmConstants.companyStatus.OPH;
					break;
				default:
					finalStatus = status;
			}
		}
		return finalStatus;
	}

	/**
	 * KOB将错误表的数据导入到原始表限制数量
	 * @return
	 * @throws Exception
	 */
	public static int getKobLimitCount() throws Exception {
		int limitCount = 10000;
		IBOBsStaticDataValue[] staticData = StaticDataUtil.getStaticData("KOB_LIMIT_COUNT");
		if (staticData != null && staticData.length > 0 && StringUtils.isNumeric(staticData[0].getCodeValue())) {
			limitCount = Integer.parseInt(staticData[0].getCodeValue());
		}
		return limitCount;
	}

	/**
	 * 获取当前计算出来的细分对应的TSM
	 *
	 * @param managerGroupCode
	 * @return
	 * @throws Exception
	 */
	public static String getTSM(long managerGroupCode) throws Exception {
		// 取得虚拟组下成员
		String managerId = "";
		String[][] groupMembers = OrgmodelClient.getOperIdAndNamesByGroupId(managerGroupCode, true);
		if (CmCommonUtil.isNotEmptyObject(groupMembers)) {
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			for (String[] iGroupMem : groupMembers) {
				IQBOSecCustManagerValue mgrValue = iseCm.getEffectAmInfo(DataType.getAsLong(iGroupMem[0]), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
				if (CmCommonUtil.isNotEmptyObject(mgrValue)) {
					if (mgrValue.getStaffType() == CmLnConstants.CM_MANAGER_TYPE.TYPE_1) {
						// TSM
						managerId = String.valueOf(mgrValue.getManagerid());
						break;
					}
				}
			}
		}
		return managerId;
	}

	/**
	 * BMRT-4683记录层级CI变更记录
	 * @param custId
	 * @param newRootCustId
	 * @param oldRootCustId
	 * @param changeType
	 * @param changeReason
	 */
	public static void recordHierarchyChangeCi(long custId, long newRootCustId, long oldRootCustId, String changeType, String changeReason) throws Exception {
		if (StringUtils.isBlank(changeType)) {
			// 过滤不记录CI的场景
			return;
		}
		List<String> list = new ArrayList<>();
		// Added to hierarchy场景不记录Old Hierarchy PM
		if (!CmConstants.kobCiAttrValue.TYPE_ADD.equals(changeType)) {
			list.add(CmConstants.kobCiAttrName.OLD_PM + oldRootCustId);
		}
		// Removed from hierarchy场景不记录New Hierarchy PM
		if (newRootCustId != 0) {
			list.add(CmConstants.kobCiAttrName.NEW_PM + newRootCustId);
		}
		list.add(CmConstants.kobCiAttrName.KIERARCHY_CHANGE_TYPE + changeType);
		list.add(CmConstants.kobCiAttrName.KIERARCHY_CHANGE_REASON + changeReason);
		CmRecordLog.saveRecord(CmBusinessOperation.CM_GROUP_CUST_MOD, custId, list.toArray(new String[0]));
	}

	/**
	 * BMRT-4683加开关控制是否处理破产层级拆分场景，默认Y是打开
	 *
	 * @return
	 * @throws Exception
	 */
	public static boolean activeToBankruptControl() throws Exception {
		boolean flag = false;
		IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("BMRT_4683_CONTROL");
		if(staticValues != null && staticValues.length > 0 && RBossConst.SO_Yes.equalsIgnoreCase(staticValues[0].getCodeValue())) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 获取当月的第二个星期一的日期对应的sono03文件名称
	 *
	 * @return fileName
	 */
	public static String getCurMonthSono03FileName() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
		cal.set(Calendar.MONTH, Calendar.getInstance().get(Calendar.MONTH));
		// 设为第一天
		cal.set(Calendar.DATE, 1);
		while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
			cal.add(Calendar.DATE, 1);
		}
		cal.add(Calendar.DATE, 7);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return "full_sono03_" + sdf.format(cal.getTime()) + ".zip";
	}

	/**
	 * CVS-402需求：比较客户的名称生日与CPR返回是否匹配，不匹配报错
	 *
	 * @param firstName
	 * @param lastName
	 * @param birthDay
	 * @param custValue
	 * @param inputFirstName
	 * @param inputLastName
	 * @param inputBirthday
	 * @param saveScene
	 * @throws Exception
	 */
	public static boolean checkNameAndBirthdayMatch(String firstName, String lastName, String birthDay, ICustomerValue custValue,
													String inputFirstName, String inputLastName, String inputBirthday, String saveScene) throws Exception {
		// First word of First Name, full last name and/or Birthday doesn’t match with CPR returned name/birthday.
		boolean matchFlag = false;
		if (StringUtils.isNotBlank(custValue.getFirstName()) && StringUtils.isNotBlank(custValue.getLastName()) && custValue.getBirthday() != null) {
			// 点击save保存场景特殊处理，考虑页面输入
			if (CmConstants.YES.equalsIgnoreCase(saveScene)) {
				// 如果输入的名称与数据库保存的一致，则没修改CPR_PROFILE主要看客户原有名称生日与CPR返回的名称生日是否匹配
				if (custValue.getFirstName().equals(inputFirstName)
						&& custValue.getLastName().equals(inputLastName)
						&& CmTimeUtil.getNoLineYYYYMMDD(custValue.getBirthday()).equals(CmTimeUtil.getNoLineYYYYMMDD(CmTimeUtil.transferString2Date(inputBirthday)))) {
					// 客户原有名称生日与CPR返回的名称生日匹配
					return getFirstNameByAnalyze(custValue.getFirstName()).equalsIgnoreCase(getFirstNameByAnalyze(firstName.trim()))
							&& custValue.getLastName().equalsIgnoreCase(lastName.trim())
							&& CmTimeUtil.getNoLineYYYYMMDD(custValue.getBirthday()).equals(birthDay.trim());
				} else {
					// 不一致表示修改了CPR_PROFILE
					if (StringUtils.isNotBlank(inputFirstName) && StringUtils.isNotBlank(inputLastName) && StringUtils.isNotBlank(inputBirthday)) {
						// 客户原有名称生日与页面编辑输入名称生日匹配
						return getFirstNameByAnalyze(inputFirstName.trim()).equalsIgnoreCase(getFirstNameByAnalyze(custValue.getFirstName()))
								&& inputLastName.trim().equalsIgnoreCase(custValue.getLastName())
								&& CmTimeUtil.getNoLineYYYYMMDD(CmTimeUtil.transferString2Date(inputBirthday)).equals(CmTimeUtil.getNoLineYYYYMMDD(custValue.getBirthday()));
					}
				}
			} else {
				// 点击放大镜只需要比较CPR返回的名称生日与客户原有名称生日
				return getFirstNameByAnalyze(custValue.getFirstName()).equalsIgnoreCase(getFirstNameByAnalyze(firstName.trim()))
						&& custValue.getLastName().equalsIgnoreCase(lastName.trim())
						&& CmTimeUtil.getNoLineYYYYMMDD(custValue.getBirthday()).equals(birthDay.trim());
			}
		} else {
			matchFlag = true;
		}
		return matchFlag;
	}

	/**
	 * 获取firstName第一个空格之前的名字
	 *
	 * @param firstName
	 * @return
	 */
	private static String getFirstNameByAnalyze(String firstName) {
		String resultFirstName = firstName;
		if (StringUtils.isNotEmpty(resultFirstName)) {
			resultFirstName = resultFirstName.substring(0, resultFirstName.indexOf(" ") > 0 ? resultFirstName.indexOf(" ") : resultFirstName.length());
		}
		return resultFirstName;
	}

	/**
	 * CVS-402 判断操作员是否有修改CPR相关信息的超级权限
	 *
	 * @return
	 * @throws Exception
	 */
	public static boolean judgeCprProfileSec() throws Exception {
		long opId = SessionManager.getUser().getID();
		return SecframeClient.checkEntityPermission(opId, CmConstants.controlCprInfo.ent_id, CmConstants.controlCprInfo.priv_id);
	}

	/**
	 * CVS-405需求：比较Party的名称生日与CPR返回是否匹配，不匹配报错
	 *
	 * @param firstName
	 * @param lastName
	 * @param birthDay
	 * @param partyValue
	 * @param inputFirstName
	 * @param inputLastName
	 * @param inputBirthday
	 * @return
	 */
	public static boolean checkCprProfileMatchForPayer(String firstName, String lastName, String birthDay, IQBOCmPayerInfoValue partyValue, String inputFirstName, String inputLastName, String inputBirthday) throws Exception {
		// 输入的字段不为空代表save场景考虑页面输入
		if (StringUtils.isNotBlank(inputFirstName) && StringUtils.isNotBlank(inputLastName) && StringUtils.isNotBlank(inputBirthday)) {
			// 如果输入的名称与数据库保存的一致，则没修改CPR_PROFILE主要看客户原有名称生日与CPR返回的名称生日是否匹配
			if (StringUtils.equals(partyValue.getFirstName(), inputFirstName)
					&& StringUtils.equals(partyValue.getLastName(), inputLastName)
					&& StringUtils.equals(CmTimeUtil.getNoLineYYYYMMDD(partyValue.getBirthday()), CmTimeUtil.getNoLineYYYYMMDD(CmTimeUtil.transferString2Date(inputBirthday)))) {
				// 客户原有名称生日与CPR返回的名称生日匹配
				return StringUtils.equalsIgnoreCase(getFirstNameByAnalyze(partyValue.getFirstName()), getFirstNameByAnalyze(firstName.trim()))
						&& StringUtils.equalsIgnoreCase(partyValue.getLastName(), lastName.trim())
						&& StringUtils.equalsIgnoreCase(CmTimeUtil.getNoLineYYYYMMDD(partyValue.getBirthday()), birthDay.trim());
			} else {
				// 不一致表示修改了CPR_PROFILE
				// 客户原有名称生日与页面编辑输入名称生日匹配
				return StringUtils.equalsIgnoreCase(getFirstNameByAnalyze(partyValue.getFirstName()), getFirstNameByAnalyze(inputFirstName.trim()))
						&& StringUtils.equalsIgnoreCase(partyValue.getLastName(), inputLastName.trim())
						&& StringUtils.equalsIgnoreCase(CmTimeUtil.getNoLineYYYYMMDD(partyValue.getBirthday()), CmTimeUtil.getNoLineYYYYMMDD(CmTimeUtil.transferString2Date(inputBirthday)));
			}
		} else {
            // 点击放大镜只需要比较CPR返回的名称生日与客户原有名称生日
			return StringUtils.equalsIgnoreCase(getFirstNameByAnalyze(partyValue.getFirstName()), getFirstNameByAnalyze(firstName.trim()))
					&& StringUtils.equalsIgnoreCase(partyValue.getLastName(), lastName.trim())
					&& StringUtils.equalsIgnoreCase(CmTimeUtil.getNoLineYYYYMMDD(partyValue.getBirthday()), birthDay.trim());
		}
	}
}
