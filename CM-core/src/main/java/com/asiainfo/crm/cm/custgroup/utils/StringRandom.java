package com.asiainfo.crm.cm.custgroup.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringRandom {
	
	//生成随机数字和字母,
	public static String getStringRandom(int length) {
		 return getStringRandomMust(length,false);
	}
	
	public static String getStringRandomMust(int length,boolean isMust) {
		String val = "";
		Random random = new Random();
		//参数length，表示生成几位随机数
		for(int i = 0; i < length; i++) {
			//输出字母还是数字
			String charOrNum = (isMust?i:random.nextInt(2)) % 2 == 0 ? "char" : "num";
			if( "char".equalsIgnoreCase(charOrNum) ) {
				//输出是大写字母还是小写字母
				int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char)(random.nextInt(26) + temp);
			} else if( "num".equalsIgnoreCase(charOrNum) ) {
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}
	
	//生成随机，一定有数字和字母,
		public static String getStringRandomWithCharAndNum(int length) {
			 return getStringRandomMust(length,true);
		}
	
	//生成随机数字和字母,
	//参数length，表示生成几位随机数
	public static String getStringRandomWithNumber(int length) {
		String val = "";
		Random random = new Random();
		int i = 0;
		while( i < length ){
			String str = String.valueOf(random.nextInt(10));
			if ( i==0 && "0".equals(str) ){
				continue;
			}
			i++;
			val += str;
		}
		return val;
	}
	
	/**
	 * 根据枚举字符集合   生成 指定长度的  随机字符串
	 * @param enumList
	 * @param length
	 * @return
	 */
	public static String getStringRandomWithEnum(List<Character> enumList, int length){
		String val = "";
		Random random = new Random();
		int i = 0;
		while( i < length ){
			int index = random.nextInt(enumList.size());
			Character ch = enumList.get(index);

			i++;
			val += ch;
		}
		return val;
	}
	
	/**
	 * 根据表达式  生成 字符串
	 * @param expression  表达式格式  [枚举字符]{数字}[枚举字符-枚举字符]{数字}··· 例如 [abc]{1}[0-9]{2}
	 * @return
	 */
	public static String getStringRandomWithExpression(String expression){
		String val = "";
		
		List<Character> enumList = new ArrayList<Character>();
		
		int i=0;
		while ( i<expression.length() ){
			char ch = expression.charAt(i);
			if ( ch=='[' || ch==']' ){
				i++;
				continue;
			}
			
			if ( ch=='{' ){
				int startIndex = i+1;
				int endIndex = startIndex + expression.substring(startIndex).indexOf("}");
				int length = Integer.valueOf( expression.substring(startIndex, endIndex) );

				val += getStringRandomWithEnum(enumList, length);
				enumList.clear();
				
				i = endIndex + 1;
				continue;
			}
			
			enumList.add(ch);
			i++;
			
			// 支持 [0-9]   [a-z]
			if ( enumList.size() == 3 && enumList.get( 1 )=='-' ){
				char start = enumList.get(0);
				char end = enumList.get(2);
				
				enumList.clear();
				for (char j=start; j<=end; j++ ){
					enumList.add(j);
				}
			}
		}
		
		return val;
	}
	
	public static void  main(String[] args) {
		//测试
//		System.out.println(getStringRandom(8));
		String a = "ABA11";
		System.out.println( a.matches("[AEIOUYÆæØøÅå]{1}[BCDFGHJKLMNPQRSTVWXZ]{1}[AEIOUYÆæØøÅå]{1}1{2}") );
		
		System.out.println(getStringRandomWithExpression("[AEIOUYÆæØøÅå]{1}[BCDFGHJKLMNPQRSTVWXZ]{1}[AEIOUYÆæØøÅå]{1}[a-z]{2}"));

//		String expression = "[AEIOUYÆæØøÅå]{1}[BCDFGHJKLMNPQRSTVWXZ]{1}[AEIOUYÆæØøÅå]{1}1{2}";
//		int i = 14;
//		int startIndex = i+1;
//		int endIndex = startIndex + expression.substring(startIndex).indexOf("}");
//		String numberStr = expression.substring(startIndex, endIndex);
//		System.out.println(startIndex + " " + endIndex + " " + numberStr);
//		
//		char start = 'a';
//		char end = 'z';
//		
//		List<Character> enumList = new ArrayList<Character>();
//		for (char j=start; j<=end; j++ ){
//			enumList.add(j);
//		}
//		System.out.println(enumList);
	}
	
}
