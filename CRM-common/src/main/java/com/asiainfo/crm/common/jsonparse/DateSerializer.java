package com.asiainfo.crm.common.jsonparse;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date arg0, JsonGenerator arg1,	SerializerProvider arg2) throws IOException,
			JsonProcessingException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd"); 
		String formattedDate = formatter.format(arg0); 
		arg1.writeString(formattedDate);
	}

}