package com.asiainfo.crm.cm.custgroup.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InvitationCodeUtils {
	
	public static String getInvitationCodesById(List<Character[]> charsList, long id)throws Exception{
		// 校验id是否超过了 最大限制
		long maxId = 1;
		for ( int i=0; i<charsList.size(); i++ ){
			maxId *= charsList.get(i).length;
		}
		if ( id>=maxId ){
			return null;
		}
		
		String rtn = "";
		// 获取各个位置 的 数值
		for ( int i=charsList.size()-1; i>=0; i--  ){
			Character[] chars = charsList.get(i);
			int index =(int) (id % chars.length);
			
			rtn = chars[index] + rtn;
			id = id / chars.length;
		}

		return rtn;
	}
	
	public static Object[] randomChange(Object[] chars, int randomNum){
		Random random = new Random();
		int i = 0;
		while( i < randomNum ){
			int index = random.nextInt(chars.length);
			if ( index!=0 ){
				Object temp = chars[0];
				chars[0] = chars[index];
				chars[index] = temp;
			}
			i++;
		}
		
		return chars;
	}
	
	public static void out(Character[] chars){
		for (Character ch:chars){
			System.out.print("'" + ch + "', ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception{
		// invitation code串 每一位 所对应的 字符  
		List<Character[]> charsList = new ArrayList<Character[]>();
		// 序列开始值
		long startSequence = 360001; 
		
		// 丹麦 辅音
		Character[] fuyins = new Character[]{'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};  
		// 丹麦 元音
		Character[] yuanyins = new Character[]{'A', 'E', 'I', 'O', 'U', 'Y', 'Æ', 'Ø', 'Å'};
		// 数字
		Character[] numbers = new Character[]{'0','1','2','3','4','5','6','7','8','9'};
		//code排列----辅音  元音  辅音  数字  数字  
		charsList.add( fuyins );
		charsList.add( yuanyins );
		charsList.add( fuyins );
		charsList.add( numbers );
		charsList.add( numbers );
		charsList.add( numbers );

		int maxLength = 1;
		for (Character[] chars:charsList){
			maxLength *= chars.length;
		}
		System.out.println("----maxLength: "+ maxLength);
		
		List<String> list = new ArrayList<String>();
		for ( int i=0; i<maxLength; i++ ){
			list.add( getInvitationCodesById(charsList, i) );
		}
		
		String[] invitationCodes = (String[])randomChange(list.toArray(new String[0]), maxLength*10);
		
		File file = new File("g://cm_invitation_code_21_dml_" + startSequence + "_to_" + (startSequence+maxLength-1) + ".sql");
		FileWriter fos = new FileWriter(file);
		BufferedWriter bufferWrite = new BufferedWriter(fos);
		
		bufferWrite.write("delete from party.`cm_invitation_code_21` where INVITATION_CODE_ID between " + startSequence + " and " + (maxLength+startSequence-1) + " ;" );
		bufferWrite.newLine();
		bufferWrite.write("INSERT INTO party.`cm_invitation_code_21` (`INVITATION_CODE_ID`, `INVITATION_CODE`, `MANAGE_STATUS`, `STATE`, `REMARKS`) VALUES ");
		bufferWrite.newLine();
		for ( int i=0; i<maxLength; i++ ){
			bufferWrite.write("  ( '"+ (i+startSequence) + "', '" + invitationCodes[i] + "', '0',  'U', '' )" );
			if ( i==maxLength-1 ){
				bufferWrite.write(";");
			}else{
				bufferWrite.write(",");
			}
			bufferWrite.newLine();
		}
		bufferWrite.flush();
		bufferWrite.close();
		fos.close();
	}
	
}
