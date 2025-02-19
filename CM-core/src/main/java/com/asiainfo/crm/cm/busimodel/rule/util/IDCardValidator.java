package com.asiainfo.crm.cm.busimodel.rule.util;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/** 
 *         <p> 
 *         类说明:身份证合法性校验 
 *         </p> 
 *         <p> 
 *         --15位身份证号码：第7、8位为出生年份(两位数)，第9、10位为出生月份，第11、12位代表出生日期，第15位代表性别，奇数为男，偶数为女。 
 *         --18位身份证号码：第7、8、9、10位为出生年份(四位数)，第11、第12位为出生月份，第13、14位代表出生日期，第17位代表性别，奇数为男，偶数为女。 
 *         </p> 
 */
public class IDCardValidator {

	/**
	 * 每位加权因子
	 */
	private static int _POWER[] = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };

	/** 
	 * 验证所有的身份证的合法性 
	 * @param idcard 
	 * @return 
	 */
	public static boolean isValidatedIdcard(String idcard) {
		if (StringUtils.isBlank(idcard)) {
			return false;
		}
		if (idcard.length() == 15) {
			idcard = convertIdcarBy15bit(idcard);
		}
		return isValidate18Idcard(idcard);
	}

	/** 
	 * <p> 
	 * 判断18位身份证的合法性 
	 * </p> 
	 * 根据〖中华人民共和国国家标准GB11643-1999〗中有关公民身份号码的规定，公民身份号码是特征组合码，由十七位数字本体码和一位数字校验码组成。 
	 * 排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。 
	 * <p> 
	 * 顺序码: 表示在同一地址码所标识的区域范围内，对同年、同月、同 日出生的人编定的顺序号，顺序码的奇数分配给男性，偶数分配 给女性。 
	 * </p> 
	 * <p> 
	 * 1.前1、2位数字表示：所在省份的代码； 2.第3、4位数字表示：所在城市的代码； 3.第5、6位数字表示：所在区县的代码； 
	 * 4.第7~14位数字表示：出生年、月、日； 5.第15、16位数字表示：所在地的派出所的代码； 
	 * 6.第17位数字表示性别：奇数表示男性，偶数表示女性； 
	 * 7.第18位数字是校检码：也有的说是个人信息码，一般是随计算机的随机产生，用来检验身份证的正确性。校检码可以是0~9的数字，有时也用x表示。 
	 * </p> 
	 * <p> 
	 * 第十八位数字(校验码)的计算方法为： 1.将前面的身份证号码17位数分别乘以不同的系数。从第一位到第十七位的系数分别为：7 9 10 5 8 4 
	 * 2 1 6 3 7 9 10 5 8 4 2 
	 * </p> 
	 * <p> 
	 * 2.将这17位数字和系数相乘的结果相加。 
	 * </p> 
	 * <p> 
	 * 3.用加出来和除以11，看余数是多少？ 
	 * </p> 
	 * 4.余数只可能有0 1 2 3 4 5 6 7 8 9 10这11个数字。其分别对应的最后一位身份证的号码为1 0 X 9 8 7 6 5 4 3 
	 * 2。 
	 * <p> 
	 * 5.通过上面得知如果余数是2，就会在身份证的第18位数字上出现罗马数字的Ⅹ。如果余数是10，身份证的最后一位号码就是2。 
	 * </p> 
	 *  
	 * @param idcard 
	 * @return 
	 */
	private static boolean isValidate18Idcard(String idcard) {
		if (StringUtils.isBlank(idcard)) {
			return false;
		}
		// 非18位为假
		if (idcard.length() != 18) {
			return false;
		}
		// 获取前17位
		String idcard17 = idcard.substring(0, 17);
		// 获取第18位
		String idcard18Code = idcard.substring(17, 18);
		char c[] = null;
		String checkCode = "";
		// 是否都为数字
		if (isDigital(idcard17)) {
			c = idcard17.toCharArray();
		} else {
			return false;
		}

		if (null != c) {
			int bit[] = null;

			bit = converCharToInt(c);

			int sum17 = 0;

			sum17 = getPowerSum(bit);

			// 将和值与11取模得到余数进行校验码判断
			checkCode = getCheckCodeBySum(sum17);
			if (null == checkCode) {
				return false;
			}
			// 将身份证的第18位与算出来的校码进行匹配，不相等就为假
			if (!idcard18Code.equalsIgnoreCase(checkCode)) {
				return false;
			}
		}
		return true;
	}

	/** 
	 * 将15位的身份证转成18位身份证 
	 *  
	 * @param idcard 
	 * @return 
	 */
	public static String convertIdcarBy15bit(String idcard) {
		if (StringUtils.isBlank(idcard)) {
			return null;
		}
		String idcard17 = null;
		// 非15位身份证
		if (idcard.length() != 15) {
			return null;
		}

		if (isDigital(idcard)) {
			// 获取出生年月日：一般15位的都是2000年以前出生的人，所以可以直接在两位的年份之前插入"19"即可。
			idcard17 = idcard.substring(0, 6) + "19" + idcard.substring(6);
			char c[] = idcard17.toCharArray();
			String checkCode = "";

			if (null != c) {
				int bit[] = null;

				// 将字符数组转为整型数组
				bit = converCharToInt(c);
				int sum17 = 0;
				sum17 = getPowerSum(bit);

				// 获取和值与11取模得到余数进行校验码
				checkCode = getCheckCodeBySum(sum17);
				// 获取不到校验位
				if (null == checkCode) {
					return null;
				}
				// 将前17位与第18位校验码拼接
				idcard17 += checkCode;
			}
		} else { // 身份证包含数字
			return null;
		}
		return idcard17;
	}

	/**
	* 15位和18位身份证号码的基本数字和位数验校
	*
	* @param idcard
	* @return
	*/
	public static boolean isIdcard(String idcard) {
		return idcard == null || "".equals(idcard) ? false : Pattern.matches("(^\\d{15}$)|(\\d{17}(?:\\d|x|X)$)", idcard);
	}

	/**
	* 15位身份证号码的基本数字和位数验校
	*
	* @param idcard
	* @return
	*/
	public static boolean is15Idcard(String idcard) {
		return idcard == null || "".equals(idcard) ? false : Pattern.matches("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$", idcard);
	}

	/**
	* 18位身份证号码的基本数字和位数验校
	*
	* @param idcard
	* @return
	*/
	public static boolean is18Idcard(String idcard) {
		return Pattern.matches("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([\\d|x|X]{1})$", idcard);
	}

	/** 
	 * 数字验证 
	 *  
	 * @param str 
	 * @return 
	 */
	private static boolean isDigital(String str) {
		return str == null || "".equals(str) ? false : str.matches("^[0-9]*$");
	}

	/** 
	 * 将身份证的每位和对应位的加权因子相乘之后，再得到和值 
	 *  
	 * @param bit 
	 * @return 
	 */
	private static int getPowerSum(int[] bit) {

		int sum = 0;
		if (bit != null && _POWER.length == bit.length) {
			for (int i = 0, len = bit.length; i < len; i++) {
				sum = sum + bit[i] * _POWER[i];
			}
		}
		return sum;
	}

	/** 
	 * 将和值与11取模得到余数进行校验码判断 
	 *  
	 * @param sum17
	 * @return 校验位 
	 */
	private static String getCheckCodeBySum(int sum17) {
		String checkCode = null;
		int modValue = sum17 % 11;
		if (modValue > 2) {
			checkCode = String.valueOf(12 - modValue);
		} else if (modValue == 2) {
			checkCode = "x";
		} else if (modValue == 1) {
			checkCode = "0";
		} else if (modValue == 0) {
			checkCode = "1";
		}
		return checkCode;
	}

	/** 
	 * 将字符数组转为整型数组 
	 *  
	 * @param c 
	 * @return 
	 * @throws NumberFormatException 
	 */
	private static int[] converCharToInt(char[] c) throws NumberFormatException {
		int length = (c == null) ? 0 : c.length;
		int[] a = new int[length];
		for (int k = 0; k < length;) {
			char temp = c[k];
			a[k++] = Integer.parseInt(String.valueOf(temp));
		}
		return a;
	}

	
	
	/** 
	 * 身份证地区校验
	 *  
	 * @param idcard 
	 * <p> 
	 * 11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西藏",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外"
	 * </p> 
	 */
	public static boolean isCardArea(String idcard) {
		String area= "11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65,71,81,82,91";
		if(area.indexOf(idcard.substring(0,2)) > -1){
			return true;
		}
		return false;
	}
	
}