package com.asiainfo.crm.util;

import com.ai.security.SecurityFactory;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 通用方法类
 * @author zhaiwg
 *
 */
public class CommonUtil {

	/**
	 * 根据字符长度截取字符串，中文算两个字符
	 * @param str
	 * @param len
	 * @return
	 * @throws Exception
	 */
	public static String byteSubstring(String str, int len) throws Exception {
		String result = "";
		if (!com.ai.appframe2.util.StringUtils.isEmptyString(str)) {
			byte[] bt = str.getBytes("gbk");
			if (bt.length <= len) {
				result = new String(bt, 0, bt.length, "gbk");
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
				result = new String(bt, 0, len, "gbk");
			}
		}
		return result;
	}
	
	
	/**
	 * 获取字符串长度，中文算两个字符
	 * @param str
	 * @return
	 */
	public static int getStringLengthByChar(String str) {
		int result = 0;
		if (StringUtils.isNotBlank(str)) {
			StringBuilder sb = new StringBuilder();
			char[] chars = str.toCharArray();
			for (int i = 0, len = chars.length; i < len; i++)
			{
				Character.UnicodeBlock ub = Character.UnicodeBlock.of(chars[i]);
				if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
						|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
						|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
						|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
						|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
						|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS)
				{
					sb.append("**");
				}else {
					sb.append(chars[i]);
				}
			}
			result = sb.length();
		}
		return result;
	}
	
	/**
	 * 分隔一个超长字符串
	 * @param str
	 * @param len  每个分段的长度，中文算两个字符长度
	 * @return
	 * @throws Exception
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
	 * Json 中取节点
	 * @param inPackage
	 * @param paramKey
	 * @return
	 */
	public static String getParamValue(String inPackage, String paramKey) {
		String value = null;
		
		if( StringUtils.isNotBlank(inPackage) && StringUtils.isNotBlank(paramKey) ) {
			int index = inPackage.indexOf(paramKey);
			if( index<0 ) {
				index = inPackage.indexOf(paramKey.toUpperCase());
			}
			if( index>0 ) {
				index = inPackage.indexOf(':', index);
			}
			int begin=0, end=0;
			if( index>0 ) {
				begin = inPackage.indexOf('"', index);
			}
			if( begin>0 ) {
				end = inPackage.indexOf('"', begin + 1);
			}
			if( end>0 ) {
				value = inPackage.substring(begin + 1, end);
			}
		}
		
		return value;
	}
	
	public static String getTransactionNum(int number , int len){
		return StringUtils.leftPad(String.valueOf(SecurityFactory.getRandomizer().getRandomInteger(number)), len, "0") ; 
	}

}
