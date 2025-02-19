package com.asiainfo.crm.cm.common.util;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.dom4j.Element;

import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.AIExcelWriter;
import com.ai.appframe2.util.XmlUtil;
import com.ai.appframe2.util.charset.CharsetFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;

@SuppressWarnings("unchecked")
public class ExportExcelHellper {

	private static transient Log log = LogFactory.getLog(ExportExcelHellper.class);
	private static final String transCodeType = "CM_EXPORT_TRANS";

	private boolean isFirstRun = true;
	private ITransUtil transUtil = null;

	private ExportParserUtil parserTableInfo;
	int sheetIndex = 1;
	int rowIndex = 0;

	public static class ExportParserUtil {

		private static transient Log log = LogFactory.getLog(ExportParserUtil.class);

		public static final String CROSS_CENTER = "CrossCenter";
		public static final String S_USERINFO = "$USERINFO";
		public static final String S_ATTRCOLS = "$ATTRCOLS";
		public static final String S_STARTROWINDEX = "$STARTROWINDEX";
		public static final String S_ENDROWINDEX = "$ENDROWINDEX";

		private HashMap title_map = new HashMap();
		private List showCols = new ArrayList();

		private Map parameter = null;

		private String implservice_name = null;
		private String queryData_methodName = null;
		private String queryCount_methodName = null;

		private Object service_obj = null;

		private Object[][] queryData_methodParaInfo = (Object[][]) null;
		private Object[][] queryCount_methodParaInfo = (Object[][]) null;

		private String centerType = null;
		private String centerValue = null;
		private boolean isCross = false;
		private boolean isPagination = false;
		private String pagesize = null;

		private Class<?>[] dataMethodParaType = null;
		private Object[] dataMethodParaData = null;
		private Class<?>[] countMethodParaType = null;
		private Object[] countMethodParaData = null;

		public ExportParserUtil(String tableInfo, String columnTitles, Map parameter) throws Exception {
			this.parameter = parameter;
			if (this.parameter.containsKey("CenterType"))
				this.centerType = (String) parameter.get("CenterType");
			if (this.parameter.containsKey("CenterValue"))
				this.centerValue = (String) parameter.get("CenterValue");
			if (this.parameter.containsKey("CrossCenter"))
				this.isCross = true;

			ByteArrayInputStream in = new ByteArrayInputStream(tableInfo.getBytes(CharsetFactory.getDefaultCharset()));
			Element root = XmlUtil.parseXml(in);
			this.implservice_name = root.attributeValue("implservice_name");
			logDebug("implservice_name:" + this.implservice_name);

			this.queryData_methodName = root.attributeValue("implservice_querymethod");
			logDebug("implservice_querymethod:" + this.queryData_methodName);

			this.queryCount_methodName = root.attributeValue("implservice_countmethod");
			logDebug("queryCount_methodName:" + this.queryCount_methodName);

			this.pagesize = root.attributeValue("pagesize");
			logDebug("pagesize:" + this.pagesize);

			String[] titles = columnTitles.split(";");
			for (int i = 0; i < titles.length; i++) {
				if (!titles[i].equals("")) {
					int index = titles[i].indexOf("%3D");
					if (index == -1)
						continue;
					String columnName = titles[i].substring(0, index);
					String columnTitle = titles[i].substring(index + 3, titles[i].length());
					title_map.put(columnName, columnTitle);
					showCols.add(columnName);
				}
			}

			String queryData_paraString = "";
			int index1 = queryData_methodName.indexOf("(");
			int index2 = queryData_methodName.indexOf(")");

			if (index1 > -1 && (index2 > -1) && (index2 > index1)) {
				queryData_paraString = queryData_methodName.substring(index1 + 1, index2);
				queryData_methodName = queryData_methodName.substring(0, index1);
				logDebug("queryData_paraString:" + queryData_paraString);
				logDebug("queryData_methodName:" + queryData_methodName);

			} else if (index1 > -1 || index2 > -1 || index1 > index2) {
				String msg = "Analytical method queryData error";
				throw new Exception(msg);
			}
			queryData_methodParaInfo = analizeMethodParaString(queryData_paraString);

			if (queryCount_methodName == null || queryCount_methodName.equals(""))
				return;

			index1 = queryCount_methodName.indexOf("(");
			index2 = queryCount_methodName.indexOf(")");
			if (index1 > -1 && index2 > -1 && index2 > index1) {
				String queryCount_paraString = queryCount_methodName.substring(index1 + 1, index2);
				queryCount_methodName = queryCount_methodName.substring(0, index1);
				queryCount_methodParaInfo = analizeMethodParaString(queryCount_paraString);
			} else if (index1 > -1 || index2 > -1 || index1 > index2) {
				String msg = "Analytical method queryData error";
				throw new Exception(msg);
			}

			if (this.queryCount_methodName != null && !this.queryCount_methodName.equals("") && this.pagesize != null && !this.pagesize.equals("")
					&& this.queryCount_methodParaInfo != null) {
				this.isPagination = true;
			}

		}

		public boolean hasPagination() {
			return this.isPagination;
		}

		private void logDebug(Object obj) {
			if (log.isDebugEnabled() && obj != null)
				log.debug("\n\n" + obj.toString() + "\n");
		}

		private Object[][] analizeMethodParaString(String methodParaString) throws Exception {
			List paraName = new ArrayList();
			List paraType = new ArrayList();
			List paraClass = new ArrayList();

			if ((methodParaString == null) || (methodParaString.equals("")))
				return new Object[0][0];

			String[] name_value = methodParaString.split(",");
			if (name_value != null) {
				for (int i = 0; i < name_value.length; i++) {
					if (name_value[i].equals(""))
						continue;
					String[] item = name_value[i].trim().split(" ");

					if ((item.length < 2) || (item[0].trim().equals("")) || (item[(item.length - 1)].trim().equals(""))) {
						continue;
					}
					paraName.add(item[(item.length - 1)].trim());
					paraType.add(item[0].trim());
					Class c = getJavaType(item[0].trim());
					paraClass.add(c);
				}
			}

			if (paraName.isEmpty())
				return new Object[0][0];

			Object[][] obj = new Object[paraName.size()][3];
			for (int i = 0; i < paraName.size(); i++) {
				obj[i][0] = paraName.get(i);
				obj[i][1] = paraType.get(i);
				obj[i][2] = paraClass.get(i);
			}

			return obj;
		}

		public int count() throws Exception {
			if (this.queryCount_methodName == null || this.queryCount_methodName.equals("") || this.pagesize == null || this.pagesize.equals("")
					|| this.queryCount_methodParaInfo == null) {
				return 0;
			}

			if ((this.countMethodParaType == null) || (this.countMethodParaData == null)) {
				this.countMethodParaType = new Class[this.queryCount_methodParaInfo.length];
				this.countMethodParaData = new Object[this.queryCount_methodParaInfo.length];

				for (int i = 0; i < this.queryCount_methodParaInfo.length; i++) {
					this.countMethodParaType[i] = ((Class) (Class) this.queryCount_methodParaInfo[i][2]);

					String name = (String) this.queryCount_methodParaInfo[i][0];
					if (name.equals("$USERINFO")) {
						this.countMethodParaData[i] = ServiceManager.getUser();
					} else {
						this.countMethodParaData[i] = this.parameter.get(name);
						if (this.countMethodParaData[i] != null) {
							this.countMethodParaData[i] = DataType.transfer(this.countMethodParaData[i], (String) (String) this.queryCount_methodParaInfo[i][1]);
						} else {
							this.countMethodParaData[i] = this.parameter.get(name);
							if (this.countMethodParaData[i] != null) {
								this.countMethodParaData[i] = new String(((String) this.countMethodParaData[i]).getBytes("ISO-8859-1"), "GBK");
								this.countMethodParaData[i] = DataType.transfer(this.countMethodParaData[i], (String) (String) this.queryCount_methodParaInfo[i][1]);
							}
						}
					}
				}
			}
			if ((!StringUtils.isBlank(this.centerType)) && (!StringUtils.isBlank(this.centerValue))) {
				CenterFactory.setCenterInfoByTypeAndValue(this.centerType, this.centerValue);
			} else {
				CenterFactory.setCenterInfoEmpty();
			}

			Object o = null;
			try {
				if (this.service_obj == null) {
					if (this.isCross) {
						this.service_obj = ServiceFactory.getCrossCenterService(this.implservice_name);
					} else {
						this.service_obj = ServiceFactory.getService(this.implservice_name);
					}
				}

				Method queryMethod = this.service_obj.getClass().getMethod(this.queryCount_methodName, this.countMethodParaType);

				o = queryMethod.invoke(this.service_obj, this.countMethodParaData);
			} finally {
				if (CenterFactory.isSetCenterInfo()) {
					CenterFactory.setCenterInfoEmpty();
				}
			}
			return ((Integer) o).intValue();
		}

		public Object getGridData(int startRowIndex, int endRowIndex) throws Exception {
			if ((this.queryData_methodName == null) || (this.queryData_methodName.equals("")) || (this.queryData_methodParaInfo == null)) {
				throw new Exception("queryData_methodName or queryData_methodParaInfo is null");
			}

			if ((this.dataMethodParaType == null) || (this.dataMethodParaData == null)) {
				this.dataMethodParaType = new Class[this.queryData_methodParaInfo.length];
				this.dataMethodParaData = new Object[this.queryData_methodParaInfo.length];
				for (int i = 0; i < this.queryData_methodParaInfo.length; i++) {
					this.dataMethodParaType[i] = ((Class) (Class) this.queryData_methodParaInfo[i][2]);

					String name = (String) this.queryData_methodParaInfo[i][0];
					if (name.equals("$USERINFO")) {
						this.dataMethodParaData[i] = ServiceManager.getUser();
					} else if (name.equals("$STARTROWINDEX")) {
						this.dataMethodParaData[i] = new Integer(startRowIndex);
					} else if (name.equals("$ENDROWINDEX")) {
						this.dataMethodParaData[i] = new Integer(endRowIndex);
					} else {
						this.dataMethodParaData[i] = this.parameter.get(name);
						if (this.dataMethodParaData[i] != null) {
							this.dataMethodParaData[i] = DataType.transfer(this.dataMethodParaData[i], (String) (String) this.queryData_methodParaInfo[i][1]);
						} else {
							this.dataMethodParaData[i] = this.parameter.get(name);
							if (this.dataMethodParaData[i] != null) {
								this.dataMethodParaData[i] = new String(((String) this.dataMethodParaData[i]).getBytes("ISO-8859-1"), "GBK");
								this.dataMethodParaData[i] = DataType.transfer(this.dataMethodParaData[i], (String) (String) this.queryData_methodParaInfo[i][1]);
							}
						}
					}
				}
			} else {
				for (int i = 0; i < this.queryData_methodParaInfo.length; i++) {
					String name = (String) this.queryData_methodParaInfo[i][0];
					if (name.equals("$STARTROWINDEX")) {
						this.dataMethodParaData[i] = new Integer(startRowIndex);
					} else if (name.equals("$ENDROWINDEX")) {
						this.dataMethodParaData[i] = new Integer(endRowIndex);
					}

				}

			}

			if ((!StringUtils.isBlank(this.centerType)) && (!StringUtils.isBlank(this.centerValue))) {
				CenterFactory.setCenterInfoByTypeAndValue(this.centerType, this.centerValue);
			} else {
				CenterFactory.setCenterInfoEmpty();
			}

			Object rtn = null;
			try {
				if (this.service_obj == null) {
					if (this.isCross) {
						this.service_obj = ServiceFactory.getCrossCenterService(this.implservice_name);
					} else {
						this.service_obj = ServiceFactory.getService(this.implservice_name);
					}
				}

				Method queryMethod = this.service_obj.getClass().getMethod(this.queryData_methodName, this.dataMethodParaType);

				rtn = queryMethod.invoke(this.service_obj, this.dataMethodParaData);
			} finally {
				if (CenterFactory.isSetCenterInfo()) {
					CenterFactory.setCenterInfoEmpty();
				}
			}
			return rtn;
		}

		private Class getJavaType(String type_name) throws Exception {
			if (type_name.endsWith("UserInfoInterface")) {
				return UserInfoInterface.class;
			}
			if (type_name.endsWith("HashMap"))
				return HashMap.class;
			if (type_name.endsWith("Map"))
				return Map.class;
			return DataType.getJavaClass(type_name);
		}

		public HashMap getTitleMap() {
			return this.title_map;
		}

		public List getShowCols() {
			return this.showCols;
		}

		/*
		 * public HashMap getConditonMapFromRequest(String conditionName, Object[][] objs) throws Exception { if
		 * ((conditionName == null) || (conditionName.equals("")) || (objs == null) || (objs.length == 0)) return null;
		 * String conditionString = (String) parameter.get(conditionName); if (conditionString == null) {
		 * conditionString = (String) parameter.get(conditionName); if (conditionString != null) { conditionString = new
		 * String(conditionString.getBytes("ISO-8859-1"), "GBK"); } } if ((conditionString == null) ||
		 * (conditionString.equals(""))) return null; HashMap map = new HashMap(); String[] name_value =
		 * conditionString.split("&"); for (int i = 0; i < name_value.length; i++) { if (name_value[i].equals("")) {
		 * continue; } int index = name_value[i].indexOf("="); if (index == -1) continue; String name =
		 * name_value[i].substring(0, index); String value = name_value[i].substring(index + 1); for (int k = 0; k <
		 * objs.length; k++) { String type_name = (String) objs[k][1]; if (type_name.endsWith("UserInfoInterface")) {
		 * map.put((String) objs[k][0], ServiceManager.getUser()); } else if (name.equals(objs[k][0])) { Object v =
		 * DataType.transfer(value, type_name); map.put(name, v); } } } return map; } private Map
		 * getModelParaNameAdnValues() throws Exception { Map outPutParaMap = new HashMap(); if
		 * ((this.queryData_methodParaInfo != null) && (this.queryData_methodParaInfo.length > 0)) { for (int i = 0; i <
		 * this.queryData_methodParaInfo.length; i++) { String paraName = (String) this.queryData_methodParaInfo[i][0];
		 * if ((this.dataMethodParaData == null) || (this.dataMethodParaData[i] == null)) { continue; } if
		 * (outPutParaMap.containsKey(paraName)) { continue; } if ((paraName.equalsIgnoreCase("$USERINFO")) ||
		 * (paraName.equalsIgnoreCase("$ATTRCOLS")) || (paraName.equalsIgnoreCase("$STARTROWINDEX")) ||
		 * (paraName.equalsIgnoreCase("$ENDROWINDEX")) || (paraName.equalsIgnoreCase("$MOCONDITION")) ||
		 * (paraName.equalsIgnoreCase("$MOPARAMETER"))) { continue; } outPutParaMap.put(paraName,
		 * this.dataMethodParaData[i]); } } if ((this.queryCount_methodParaInfo != null) &&
		 * (this.queryCount_methodParaInfo.length > 0)) { for (int i = 0; i < this.queryCount_methodParaInfo.length;
		 * i++) { String paraName = (String) this.queryCount_methodParaInfo[i][0]; if ((this.countMethodParaData ==
		 * null) || (this.countMethodParaData[i] == null)) { continue; } if (outPutParaMap.containsKey(paraName)) {
		 * continue; } if ((paraName.equalsIgnoreCase("$USERINFO")) || (paraName.equalsIgnoreCase("$ATTRCOLS")) ||
		 * (paraName.equalsIgnoreCase("$STARTROWINDEX")) || (paraName.equalsIgnoreCase("$ENDROWINDEX")) ||
		 * (paraName.equalsIgnoreCase("$MOCONDITION")) || (paraName.equalsIgnoreCase("$MOPARAMETER"))) { continue; }
		 * outPutParaMap.put(paraName, this.countMethodParaData[i]); } } return outPutParaMap; }
		 */

	}

	public ExportExcelHellper(String tableInfo, String columnTitles, String conditionStr) throws Exception {
		Map parameter = new HashMap();
		StringTokenizer st = new StringTokenizer(conditionStr, "&");
		while (st.hasMoreTokens()) {
			String name_value = st.nextToken();

			int index = name_value.indexOf("=");
			if (index == -1)
				continue;
			String name = name_value.substring(0, index);
			String value = name_value.substring(index + 1);
			logDebug("paraName:" + name);
			logDebug("paraValue:" + value);
			parameter.put(name, value);
		}
		parserTableInfo = new ExportParserUtil(tableInfo, columnTitles, parameter);
	}

	/*
	 * 适合大数据量的导出
	 */
	public void toExcelByXmlFormat(OutputStream aOutputStream, int eachCount) throws Exception {
		Properties p = new Properties();
		p.put("resource.loader", "class");
		p.put("class.resource.loader.class", ClasspathResourceLoader.class.getName());

		Velocity.init(p);

		Template xlsTemplate = Velocity.getTemplate("template/export/VMXls.vm", CharsetFactory.getDefaultCharset());
		VelocityContext context = new VelocityContext();

		BufferedWriter awriter = new BufferedWriter(new OutputStreamWriter(aOutputStream));
		xlsTemplate.merge(context, awriter);

		int index = 1;
		Object obj = null;
		Boolean hasMoreData = true;
		do {
			obj = parserTableInfo.getGridData(eachCount * (index - 1) + 1, eachCount * index);

			int length = 0;
			if (obj == null)
				length = 0;
			else
				length = Array.getLength(obj);

			if (parserTableInfo.hasPagination()) {
				if (length < eachCount)
					hasMoreData = false;
			} else {
				hasMoreData = false;
			}

			DataContainerInterface[] tempDCI = null;
			if (length > 0)
				tempDCI = (DataContainerInterface[]) obj;

			this.getRowSetAsExcelByVM(awriter, tempDCI, parserTableInfo.getTitleMap(), parserTableInfo.getShowCols(), !hasMoreData);
			awriter.flush();

			if (!hasMoreData)
				break;

			index++;
		} while (true);

		awriter.write("</Workbook>");
		awriter.flush();
		awriter = null;
	}

	private void getRowSetAsExcelByVM(Writer awriter, DataContainerInterface[] aDataList, HashMap title_map, List showColsArray, boolean endOfFile) throws Exception {
		StringBuilder insertSB = new StringBuilder("");
		if (rowIndex == 0) {
			insertSB.delete(0, insertSB.length());
			insertSB.append("<Worksheet ss:Name=\"sheet").append(sheetIndex++).append("\"><Table>\r\n");
			logDebug(insertSB.toString());
			awriter.write(insertSB.toString());
		}
		if (rowIndex == 0) {
			getTitleRow4VM(awriter, title_map, showColsArray);
			rowIndex++;
		}

		if (aDataList != null) {
			for (DataContainerInterface dci : aDataList) {
				this.transValue(dci);

				if (rowIndex >= 65530) {
					logDebug("</Table></Worksheet>");
					awriter.write("</Table></Worksheet>\r\n");

					rowIndex = 0;

					insertSB.delete(0, insertSB.length());
					insertSB.append("<Worksheet ss:Name=\"sheet").append(sheetIndex++).append("\"><Table>\r\n");
					logDebug(insertSB.toString());

					awriter.write(insertSB.toString());
					getTitleRow4VM(awriter, title_map, showColsArray);
					rowIndex++;
				}
				logDebug("<Row>");

				awriter.write("<Row>\r\n");
				for (int j = 0; j < showColsArray.size(); j++) {
					String column_name = (String) showColsArray.get(j);
					Object extObj = dci.getExtAttr(column_name);
					String aValue = (extObj != null && !"".equals(extObj.toString()) ? extObj.toString() : dci.getAsString(column_name));

					if (aValue == null)
						aValue = "";

					insertSB.delete(0, insertSB.length());
					insertSB.append("<Cell><Data ss:Type=\"String\">").append(encode4xls(aValue)).append("</Data></Cell>\r\n");
					logDebug(insertSB.toString());
					awriter.write(insertSB.toString());
				}

				awriter.write("</Row>\r\n");
				logDebug("</Row>");

				rowIndex++;
			}
		}

		if (rowIndex >= 65530) {
			awriter.write("</Table></Worksheet>\r\n");
			logDebug("</Table></Worksheet>");
			rowIndex = 0;
		}

		if (endOfFile && rowIndex != 0) {
			awriter.write("</Table></Worksheet>\r\n");
			logDebug("</Table></Worksheet>");
		}
	}

	/*
	 * 适合65530以内数据量的导出
	 */
	public void toExcelByBinaryFormat(OutputStream aOutputStream, int eachCount) throws Exception {
		AIExcelWriter excelWriter = new AIExcelWriter(aOutputStream);

		int index = 1;
		Boolean hasMoreData = true;

		while (true) {
			Object obj = parserTableInfo.getGridData(eachCount * (index - 1) + 1, eachCount * index);
			if (parserTableInfo.hasPagination()) {
				int length = 0;
				if (obj == null)
					length = 0;
				else
					length = Array.getLength(obj);

				if (length < eachCount)
					hasMoreData = false;
			} else {
				hasMoreData = false;
			}

			this.getRowSetAsExcelBinary(excelWriter, (DataContainerInterface[]) obj, parserTableInfo.getTitleMap(), parserTableInfo.getShowCols());
			excelWriter.save();

			if (!hasMoreData)
				break;

			index++;
		}

		excelWriter.save();
	}

	private void getRowSetAsExcelBinary(AIExcelWriter excelWriter, DataContainerInterface[] aDataList, HashMap title_map, List showColsArray) throws Exception {

		String rowContent[] = null;
		if (rowIndex == 0) {
			rowContent = new String[showColsArray.size()];
			for (int i = 0; i < showColsArray.size(); i++) {
				String column_name = (String) showColsArray.get(i);
				String aValue = null;
				aValue = (String) title_map.get(column_name);
				rowContent[i] = aValue;
			}

			excelWriter.writeStringArray(rowContent);
			rowIndex++;
		}

		rowContent = new String[showColsArray.size()];
		for (DataContainerInterface dci : aDataList) {
			transValue(dci);
			for (int j = 0; j < showColsArray.size(); j++) {
				String col_name = (String) showColsArray.get(j);
				String aValue = dci.getAsString(col_name);

				if (aValue == null)
					aValue = "";

				rowContent[j] = encode4xls(aValue);
			}

			excelWriter.writeStringArray(rowContent);
			rowIndex++;
		}
	}

	public void toTXT(OutputStream aOutputStream, int eachCount) throws Exception {
		boolean hasMoreData = true;
		Object obj = null;
		int index = 1;
		boolean showTitle = true;
		BufferedWriter awriter = new BufferedWriter(new OutputStreamWriter(aOutputStream));

		while (true) {
			obj = parserTableInfo.getGridData(eachCount * (index - 1) + 1, eachCount * index);
			if (parserTableInfo.hasPagination()) {
				int length = 0;

				if (obj == null)
					length = 0;
				else
					length = Array.getLength(obj);

				if (length < eachCount)
					hasMoreData = false;
			} else {
				hasMoreData = false;
			}

			this.getRowSetAsTXT(awriter, (DataContainerInterface[]) obj, parserTableInfo.getTitleMap(), parserTableInfo.getShowCols(), showTitle);
			awriter.flush();

			if (!hasMoreData)
				break;

			index++;

		}
		awriter.flush();
	}

	private void getRowSetAsTXT(Writer awriter, DataContainerInterface[] aDataList, HashMap title_map, List showColsArray, boolean showTitle) throws Exception {
		StringBuilder insertSB = new StringBuilder("");
		if (showTitle) {
			for (int i = 0; i < showColsArray.size(); i++) {
				String column_name = (String) showColsArray.get(i);
				String aValue = null;
				aValue = (String) title_map.get(column_name);

				awriter.write(aValue);
				if (i == showColsArray.size() - 1)
					awriter.write("\r\n");
				else
					awriter.write("\t");
			}

		}

		for (DataContainerInterface dci : aDataList) {
			transValue(dci);
			for (int j = 0; j < showColsArray.size(); j++) {
				String col_name = (String) showColsArray.get(j);
				String aValue = dci.getAsString(col_name);

				if (aValue == null)
					aValue = "";

				insertSB.append(aValue).append("\t");
			}
			awriter.write(insertSB.toString());
			awriter.write("\r\n");
		}
	}

	private void transValue(DataContainerInterface dci) {
		try {
			if (isFirstRun) {
				isFirstRun = false;
				String transClass = "com.asiainfo.crm.cm.common.util.CommonTransUtil";
				if (!(dci.getObjectType() instanceof ObjectTypeNull)) {
					String boName = dci.getTypeName();
					IBOBsStaticDataValue staticValue = StaticDataUtil.getStaticData(transCodeType, boName);
					if (staticValue != null && staticValue.getCodeName() != null && !staticValue.getCodeName().equals(""))
						transClass = staticValue.getCodeName();
				}
				transUtil = (ITransUtil) Class.forName(transClass).newInstance();
			}

			if (transUtil != null)
				transUtil.trans(dci);
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
	}

	private void getTitleRow4VM(Writer awriter, HashMap title_map, List showColsArray) throws Exception {
		StringBuilder insertSB = new StringBuilder("");
		logDebug("<Row>");
		awriter.write("<Row>\r\n");
		for (int i = 0; i < showColsArray.size(); i++) {
			String column_name = (String) showColsArray.get(i);
			String aValue = null;
			if (title_map != null)
				aValue = (String) title_map.get(column_name);

			insertSB.delete(0, insertSB.length());
			insertSB.append("<Cell><Data ss:Type=\"String\">").append(encode4xls(aValue)).append("</Data></Cell>\r\n");
			awriter.write(insertSB.toString());
			logDebug(insertSB.toString());
		}

		awriter.write("</Row>\r\n");
		logDebug("</Row>");
	}

	private String encode4xls(String str) {
		str = StringUtils.replace(str, "&", "&amp;");
		str = StringUtils.replace(str, "\"", "&quot;");
		str = StringUtils.replace(str, "<", "&lt;");
		str = StringUtils.replace(str, ">", "&gt;");
		return str;
	}

	private void logDebug(Object obj) {
		if (log.isDebugEnabled() && obj != null)
			log.debug("\n\n" + obj.toString() + "\n");
	}
}