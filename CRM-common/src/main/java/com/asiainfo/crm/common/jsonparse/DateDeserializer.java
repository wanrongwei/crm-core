package com.asiainfo.crm.common.jsonparse;

import org.apache.commons.lang.time.DateUtils;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class DateDeserializer extends JsonDeserializer<Date> {

	@Override
	public Date deserialize(JsonParser jsonparser,
			DeserializationContext deserializationcontext) throws IOException,
			JsonProcessingException {
		String[] pattern = new String[]{"yyyyMMddHHmmss","yyyy-MM-dd HH:mm:ss"};
		
		Date date = null;
		try {
			date = DateUtils.parseDate(jsonparser.getText(), pattern);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	

//	public static void main(String[] args) throws Exception{
//		String o = "20130104";
//		String[] pattern = new String[]{
//    			"yyyyMMddHHmmss","yyyy-MM-dd HH:mm:ss"};
//		Date date = DateUtils.parseDate(o, pattern);
//		System.out.println(date);
//	}
}