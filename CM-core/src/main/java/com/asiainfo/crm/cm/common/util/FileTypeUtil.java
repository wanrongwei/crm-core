package com.asiainfo.crm.cm.common.util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.ai.appframe2.util.StringUtils;

/**
 * 
* @Package: com.asiainfo.crm.customer.common.util   
* @Classname: FileTypeUtil.java
* Description: 文件类型判别工具类
* Copyright: Copyright (c) 2010
* Company: AsiaInfo-linkage
* @author: xialing
* @version: v1.0.0
* Create at: Dec 15, 2010 9:22:42 AM 
* 
* Modification History:
* Date               Author            Version            Description
* -------------------------------------------------------------------
* Dec 15, 2010     xialing             v1.0.0               修改原因
 */
public class FileTypeUtil {

	private final static Map FILE_TYPE_MAP_TEN_BYTES = new HashMap();	// 根据头部10个字节信息判断的文件类型
	private final static Map FILE_TYPE_MAP_OTHER_BYTES = new HashMap();	// 根据头部不确定个数字节信息判断的文件类型

	static {
		getAllFileType(); // 初始化文件类型信息
	}

	/**
	* @Title: getAllFileType 
	* @Description: 常见文件头信息
	* @return
	 */
	private static void getAllFileType() {
		FILE_TYPE_MAP_TEN_BYTES.put("ffd8ffe000104a464946", "jpg"); // JPEG (jpg)
		FILE_TYPE_MAP_TEN_BYTES.put("89504e470d0a1a0a0000", "png"); // PNG (png)
		FILE_TYPE_MAP_TEN_BYTES.put("47494638396126026f01", "gif"); // GIF (gif)
		FILE_TYPE_MAP_TEN_BYTES.put("49492a00227105008037", "tif"); // TIFF (tif)
		FILE_TYPE_MAP_TEN_BYTES.put("424d228c010000000000", "bmp"); // 16色位图(bmp)
		FILE_TYPE_MAP_TEN_BYTES.put("424d8240090000000000", "bmp"); // 24位位图(bmp)
		FILE_TYPE_MAP_TEN_BYTES.put("424d8e1b030000000000", "bmp"); // 256色位图(bmp)
		FILE_TYPE_MAP_TEN_BYTES.put("41433130313500000000", "dwg"); // CAD (dwg)
		FILE_TYPE_MAP_TEN_BYTES.put("3c21444f435459504520", "html"); // HTML (html)
		FILE_TYPE_MAP_TEN_BYTES.put("3c21646f637479706520", "htm"); // HTM (htm)
		FILE_TYPE_MAP_TEN_BYTES.put("48544d4c207b0d0a0942", "css"); // css
		FILE_TYPE_MAP_TEN_BYTES.put("696b2e71623d696b2e71", "js"); // js
		FILE_TYPE_MAP_TEN_BYTES.put("7b5c727466315c616e73", "rtf"); // Rich Text Format (rtf)
		FILE_TYPE_MAP_TEN_BYTES.put("38425053000100000000", "psd"); // Photoshop (psd)
		FILE_TYPE_MAP_TEN_BYTES.put("46726f6d3a203d3f6762", "eml"); // Email [Outlook Express 6] (eml)
		FILE_TYPE_MAP_TEN_BYTES.put("d0cf11e0a1b11ae10000", "doc"); // MS Excel 注意：word、msi 和 excel、Visio、WPS的文件头一样
		FILE_TYPE_MAP_TEN_BYTES.put("5374616e64617264204e", "mdb"); // MS Access (mdb)
		FILE_TYPE_MAP_TEN_BYTES.put("252150532d41646f6265", "ps");
		FILE_TYPE_MAP_TEN_BYTES.put("255044462d312e350d0a", "pdf"); // Adobe Acrobat (pdf)
		FILE_TYPE_MAP_TEN_BYTES.put("2e524d46000000120001", "rmvb"); // rmvb/rm相同
		FILE_TYPE_MAP_TEN_BYTES.put("464c5601050000000900", "flv"); // flv与f4v相同
		FILE_TYPE_MAP_TEN_BYTES.put("00000020667479706d70", "mp4");
		FILE_TYPE_MAP_TEN_BYTES.put("49443303000000002176", "mp3");
		FILE_TYPE_MAP_TEN_BYTES.put("000001ba210001000180", "mpg"); //
		FILE_TYPE_MAP_TEN_BYTES.put("3026b2758e66cf11a6d9", "wmv"); // wmv与asf相同
		FILE_TYPE_MAP_TEN_BYTES.put("52494646e27807005741", "wav"); // Wave (wav)
		FILE_TYPE_MAP_TEN_BYTES.put("52494646d07d60074156", "avi");
		FILE_TYPE_MAP_TEN_BYTES.put("4d546864000000060001", "mid"); // MIDI (mid)
		FILE_TYPE_MAP_TEN_BYTES.put("504b0304140000000800", "zip");
		FILE_TYPE_MAP_TEN_BYTES.put("526172211a0700cf9073", "rar");
		FILE_TYPE_MAP_TEN_BYTES.put("235468697320636f6e66", "ini");
		FILE_TYPE_MAP_TEN_BYTES.put("504b03040a0000000000", "jar");
		FILE_TYPE_MAP_TEN_BYTES.put("4d5a9000030000000400", "exe");// 可执行文件
		FILE_TYPE_MAP_TEN_BYTES.put("3c25402070616765206c", "jsp");// jsp文件
		FILE_TYPE_MAP_TEN_BYTES.put("4d616e69666573742d56", "mf");// MF文件
		FILE_TYPE_MAP_TEN_BYTES.put("3c3f786d6c2076657273", "xml");// xml文件
		FILE_TYPE_MAP_TEN_BYTES.put("494e5345525420494e54", "sql");// xml文件
		FILE_TYPE_MAP_TEN_BYTES.put("7061636b616765207765", "java");// java文件
		FILE_TYPE_MAP_TEN_BYTES.put("406563686f206f66660d", "bat");// bat文件
		FILE_TYPE_MAP_TEN_BYTES.put("1f8b0800000000000000", "gz");// gz文件
		FILE_TYPE_MAP_TEN_BYTES.put("6c6f67346a2e726f6f74", "properties");// properties文件
		FILE_TYPE_MAP_TEN_BYTES.put("cafebabe0000002e0041", "class");// class文件
		FILE_TYPE_MAP_TEN_BYTES.put("49545346030000006000", "chm");// chm文件
		FILE_TYPE_MAP_TEN_BYTES.put("04000000010000001300", "mxp");// mxp文件
		FILE_TYPE_MAP_TEN_BYTES.put("504b0304140006000800", "docx");// docx文件
		FILE_TYPE_MAP_TEN_BYTES.put("6431303a637265617465", "torrent");

		FILE_TYPE_MAP_OTHER_BYTES.put("6d6f6f76", "mov"); // Quicktime (mov)
		FILE_TYPE_MAP_OTHER_BYTES.put("ff575043", "wpd"); // WordPerfect (wpd)
		FILE_TYPE_MAP_OTHER_BYTES.put("cfad12fec5fd746f", "dbx"); // Outlook Express (dbx)
		FILE_TYPE_MAP_OTHER_BYTES.put("2142444e", "pst"); // Outlook (pst)
		FILE_TYPE_MAP_OTHER_BYTES.put("ac9ebd8f", "qdf"); // Quicken (qdf)
		FILE_TYPE_MAP_OTHER_BYTES.put("e3828596", "pwl"); // Windows Password (pwl)
		FILE_TYPE_MAP_OTHER_BYTES.put("2e7261fd", "ram"); // Real Audio (ram)
	}

	/**
	* @Title: bytesToHexString 
	* @Description: 字节数组转换成16进制串
	* @param src
	* @return
	 */
	public static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder();
		if (src == null || src.length == 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString().toLowerCase();
	}

	/**
	 * 根据特定文件的文件头信息判断其文件类型
	 * @param fileName
	 * @return
	 */
	public static String getFileType(String fileName) throws Exception {
		String fileType = null;

		FileInputStream fis = null;
		byte[] b = null;
		try {
			fis = new FileInputStream(fileName);
			b = new byte[10];
			fis.read(b, 0, b.length);
		} finally {
			if (fis != null) {
				fis.close();
			}
		}

		// 获取文件头信息
		String headCode = bytesToHexString(b);

		// 首先比对前10个字节信息的文件类型
		Object tmpTypeObj = FILE_TYPE_MAP_TEN_BYTES.get(headCode);
		fileType = (tmpTypeObj == null ? null : tmpTypeObj.toString());

		// 如果没有获取到10字节的文件类型,则比对不确定字节数的文件类型
		if (StringUtils.isEmptyString(fileType)) {
			String otherByteKey = null;
			for (Iterator otherByteIter = FILE_TYPE_MAP_OTHER_BYTES.keySet().iterator(); otherByteIter.hasNext();) {
				otherByteKey = (String) otherByteIter.next();
				if (headCode.startsWith(otherByteKey)) {
					fileType = FILE_TYPE_MAP_OTHER_BYTES.get(otherByteKey).toString();
					break;
				}
			}
			// 依然没有找到对应的常用文件类型,默认为txt文本类型
			if (StringUtils.isEmptyString(fileType) && fileName.endsWith(".txt")) {
				fileType = "txt";
			} else if (StringUtils.isEmptyString(fileType) && fileName.endsWith(".csv")) { // 如果依然找不到且后缀为csv，则默认为csv文件。
				fileType = "csv";
			}
		} else if ("doc".equals(fileType) && fileName.endsWith(".xls")) {	// 判断excel类型
			fileType = "xls";
		}

		return fileType;
	}
}
