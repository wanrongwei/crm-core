package com.asiainfo.crm.so.exe.ws.crmcallams.common;

public class CrmCallAmsUtil {

	public static String formateStrByLenth(String str, int size) {
		int strSize = str.getBytes().length;
		StringBuffer sb = new StringBuffer();
		int count = 0;
		if (strSize > size) {
			String[] strArray = str.split("");
			for (int i = 0; i < strArray.length; i++) {
				sb.append(strArray[i]);
				count += strArray[i].getBytes().length;
				if (count >= size) {
					break;
				}
			}
		}
		if (sb.length() > 0) {
			str = sb.toString();
		}
		if (str.getBytes().length > size) {
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

}
