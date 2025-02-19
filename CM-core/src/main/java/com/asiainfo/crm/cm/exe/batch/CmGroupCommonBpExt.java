package com.asiainfo.crm.cm.exe.batch;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpParseCol;
import com.asiainfo.crm.cm.batch.util.CmBatchUtil;

public class CmGroupCommonBpExt extends CmCommonBp {

	public BpParseCol[] parseLine(String oneLine, String splitChar, String busiParam) throws Exception {
		BpParseCol[] parseCols = null;
		// 解析文本行
		if(StringUtils.isBlank(splitChar)) {
			splitChar = ",";	//默认为逗号
		}
		if(!StringUtils.isBlank(oneLine)) {
			String[] splitLineContent = null;
			if(oneLine.indexOf(splitChar) != -1) {	// 使用提供的分隔符
				splitLineContent = oneLine.split(splitChar);
			}else if (oneLine.indexOf("|") != -1) {		// 使用竖线
				splitLineContent = oneLine.split("\\|");
			}else if(oneLine.indexOf(" ") != -1){	//使用空格
				splitLineContent = oneLine.split(" ");
			}else if (oneLine.indexOf("\t") != -1) {	// 使用Tab
				splitLineContent = oneLine.split("\t");
			} else{
				splitLineContent = new String[] { oneLine };
			}
			//解析业务公共信息
			Map commonInfo = CmBatchUtil.getCommonInfo(busiParam);
			//解析公共信息中的数据库字段
			String batchColIds = commonInfo.get("batchColIds").toString();
			String[] splitDbCols = batchColIds.split(",");
			
			 //默认值
			String defaultValue = commonInfo.get("defaultValue").toString();  
			String[] defaults = null;
			if(!StringUtils.isBlank(defaultValue)){
				if(defaultValue.indexOf(splitChar) != -1) {	// 使用提供的分隔符
					defaults = defaultValue.split(splitChar);
				}else if (defaultValue.indexOf("|") != -1) {		// 使用竖线
					defaults = defaultValue.split("\\|");
				}else if(defaultValue.indexOf(" ") != -1){	//使用空格
					defaults = defaultValue.split(" ");
				}else if (defaultValue.indexOf("\t") != -1) {	// 使用Tab
					defaults = defaultValue.split("\t");
				} else{
					defaults = new String[] { defaultValue };
				}
			}else{
				defaults = new String[0];
			}
			
			// 文本值 与 默认值 合并
			String[] lineContent = new String[splitLineContent.length + defaults.length];
			System.arraycopy(splitLineContent, 0, lineContent, 0,splitLineContent.length );
			System.arraycopy(defaults, 0, lineContent, splitLineContent.length, defaults.length);
			
			//和业务参数中用户选择的列做比对
			if(splitDbCols.length != lineContent.length) {
				ExceptionUtil.throwBusinessException("CMS0009060");
			}else {
				parseCols = new BpParseCol[lineContent.length];
				for(int i=0,len=parseCols.length; i<len; i++) {
					//此处colId取的是该列在行中的索引位置
					if(i == 0) {
						parseCols[i] = new BpParseCol(true, Integer.parseInt(splitDbCols[i].trim()), lineContent[i].trim());	//默认第一列作为文本行的key
					}else {
						parseCols[i] = new BpParseCol(false, Integer.parseInt(splitDbCols[i].trim()), lineContent[i].trim());
					}
				}
			}
		}
			
		return parseCols;
	}

}
