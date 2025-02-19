package com.asiainfo.crm.res.common.valuebean;
import com.asiainfo.crm.util.StringUtil;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FieldValue implements Serializable {
	/**
	 * serialVersionUID 序列号
	 */
	private static final long serialVersionUID = 2059964679530779453L;

	public static enum Operator {
		EQUAL(" = "), LT(" < "), LE(" <= "), GT(" > "), GE(" >= "), NE(" <> "), NOTNULL(
				" IS NOT NULL "), ISNULL(" IS NULL "), LIKE(" LIKE "), BW(
				" BW "), IN(" IN ");

		private String text;

		private Operator(String text) {
			this.text = text;
		}

		private String getOpText() {
			return this.text;
		}

		public String toString() {
			return this.text;
		}
	}

	public static String MINVALUE = "MINVALUE";
	public static String MAXVALUE = "MAXVALUE";

	// 保存查询条件的列
	private String fieldName;

	// 保存查询条件的值
	private Object fieldValue;

	// 保存查询条件的值
	private Object[] inValue;

	// 要查询的数据类型,比较的时候用着
	private Class dataType;

	// 查询的操作符
	private Operator operator;

	// 比较查询的最小值
	private Object minValue;

	// 比较查询的最大值
	private Object maxValue;

	// 主要用于时间的格式
	private String format = "yyyy-MM-dd hh:mm:ss";

	// and 还是 or true 为 and false 为 or
	private boolean isXOR;

	// like 语句的%位置 1为前缀 2为后缀 3为包围 0为不加
	private int likeMode;

	public FieldValue() {

	}

	public FieldValue(String fieldName, Operator operator, Class dataType,
                      Object minValue, Object maxValue) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.dataType = dataType;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public FieldValue(String fieldName, Operator operator, Class dataType,
                      Object minValue, Object maxValue, boolean isXOR) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.dataType = dataType;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.isXOR = isXOR;
	}

	public FieldValue(String fieldName, Operator operator, Class dataType,
                      String format, Object minValue, Object maxValue) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.dataType = dataType;
		this.format = format;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public FieldValue(String fieldName, Operator operator, Class dataType,
                      String format, Object minValue, Object maxValue, boolean isXOR) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.dataType = dataType;
		this.format = format;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.isXOR = isXOR;
	}

	public FieldValue(String fieldName, Operator operator, Object fieldValue) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.fieldValue = fieldValue;
	}

	public FieldValue(String fieldName, Operator operator, Object[] inValue) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.inValue = inValue;
	}

	public FieldValue(String fieldName, Operator operator, Object[] inValue,
                      boolean isXOR) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.inValue = inValue;
		this.isXOR = isXOR;
	}

	public FieldValue(String fieldName, Operator operator, Object fieldValue,
                      boolean isXOR) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.fieldValue = fieldValue;
		this.isXOR = isXOR;
	}

	public FieldValue(String fieldName, Operator operator, Object fieldValue,
                      int likeMode) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.fieldValue = fieldValue;
		this.likeMode = likeMode;
	}

	public FieldValue(String fieldName, Operator operator, Object fieldValue,
                      int likeMode, boolean isXOR) {
		this.fieldName = fieldName;
		this.operator = operator;
		this.fieldValue = fieldValue;
		this.likeMode = likeMode;
		this.isXOR = isXOR;
	}

	public FieldValue(String fieldName, Operator operator) {
		this.fieldName = fieldName;
		this.operator = operator;
	}

	public String toCondition() {
		StringBuilder con = new StringBuilder();
		if (this.isXOR) {
			con.append(" AND ");
		} else {
			con.append(" OR ");
		}
		switch (operator) {
		case EQUAL:
		case LT:
		case LE:
		case GT:
		case GE:
		case NE:
		case LIKE:
			con.append(this.getFieldName());
			con.append(operator.getOpText());
			con.append(":");
			con.append(this.getFieldName().toUpperCase());
			break;
		case IN:
			if (!StringUtil.isEmpty(inValue)) {
				con.append(this.getFieldName());
				con.append(operator.getOpText());
				con.append(this.getInIdWhere(inValue));
			}
			break;
		case NOTNULL:
		case ISNULL:
			con.append(this.getFieldName());
			con.append(operator.getOpText());
			break;
		case BW:
			if (dataType == Date.class || dataType == java.sql.Date.class) {
				if (!StringUtil.isEmpty(this.getMinValue())
						&& !StringUtil.isEmpty(this.getMaxValue())) {
					con.append(this.getFieldName());
					String tmpMinValue = FieldValue.MINVALUE + "_"
							+ this.getFieldName().toUpperCase();
					con.append(StringUtil.format("  >= TO_DATE( :{0}, '{1}')",
							tmpMinValue, this.getFormat()));
					con.append(" AND ");
					con.append(this.getFieldName());
					String tmpMaxValue = FieldValue.MAXVALUE + "_"
							+ this.getFieldName().toUpperCase();
					con.append(StringUtil.format("  <= TO_DATE( :{0}, '{1}')",
							tmpMaxValue, this.getFormat()));
				}
			} else {
				if (!StringUtil.isEmpty(this.getMinValue())
						&& !StringUtil.isEmpty(this.getMaxValue())) {
					con.append(this.getFieldName());
					String tmpMinValue = FieldValue.MINVALUE + "_"
							+ this.getFieldName().toUpperCase();
					con.append(StringUtil.format("  >= :{0} ", tmpMinValue));
					con.append(" AND ");
					con.append(this.getFieldName());
					String tmpMaxValue = FieldValue.MAXVALUE + "_"
							+ this.getFieldName().toUpperCase();
					con.append(StringUtil.format("  <= :{0} ", tmpMaxValue));
				}
			}
			break;
		default:
			break;
		}
		return con.toString();
	}

	public Map toConditionValue() {
		HashMap map = new HashMap();
		switch (operator) {
		case EQUAL:
		case LT:
		case LE:
		case GT:
		case GE:
		case NE:
			map.put(this.getFieldName().toUpperCase(), this.getFieldValue());
			break;
		case NOTNULL:
		case ISNULL:
		case IN:
			break;
		case BW:
			if (!StringUtil.isEmpty(this.getMinValue())
					&& !StringUtil.isEmpty(this.getMaxValue())) {
				map.put(FieldValue.MINVALUE + "_"
						+ this.getFieldName().toUpperCase(), this.getMinValue());
				map.put(FieldValue.MAXVALUE + "_"
						+ this.getFieldName().toUpperCase(), this.getMaxValue());
			}
			break;
		case LIKE:
			switch (this.likeMode) {
			case 0:
				map.put(this.getFieldName().toUpperCase(), this.getFieldValue());
				break;
			case 1:
				map.put(this.getFieldName().toUpperCase(),
						"%" + this.getFieldValue());
				break;
			case 2:
				map.put(this.getFieldName().toUpperCase(), this.getFieldValue()
						+ "%");
				break;
			case 3:
				map.put(this.getFieldName().toUpperCase(),
						"%" + this.getFieldValue() + "%");
				break;
			default:
				map.put(this.getFieldName().toUpperCase(), this.getFieldValue());
				break;
			}
			break;
		default:
			break;
		}
		return map;
	}

	public int getLikeMode() {
		return likeMode;
	}

	public void setLikeMode(int likeMode) {
		this.likeMode = likeMode;
	}

	public boolean getIsXOR() {
		return isXOR;
	}

	public void setIsXOR(boolean isXOR) {
		this.isXOR = isXOR;
	}

	public Object getMinValue() {
		return minValue;
	}

	public void setMinValue(Object minValue) {
		this.minValue = minValue;
	}

	public Object getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Object maxValue) {
		this.maxValue = maxValue;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Class getDataType() {
		return dataType;
	}

	public void setDataType(Class dateType) {
		this.dataType = dateType;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Object[] getInValue() {
		return inValue;
	}

	public void setInValue(Object[] inValue) {
		this.inValue = inValue;
	}

	public String getInIdWhere(Object[] tmpArrs) {
		if (!StringUtil.isEmpty(tmpArrs)) {
			StringBuffer inStr = new StringBuffer(" (");
			inStr.append('\'');
			inStr.append(tmpArrs[0]);
			inStr.append('\'');
			for (int i = 1; i < tmpArrs.length; i++) {
				inStr.append(',');
				inStr.append('\'');
				inStr.append(tmpArrs[i].toString());
				inStr.append('\'');
			}
			inStr.append(") ");
			return inStr.toString();
		}
		return "('')";
	}
}
