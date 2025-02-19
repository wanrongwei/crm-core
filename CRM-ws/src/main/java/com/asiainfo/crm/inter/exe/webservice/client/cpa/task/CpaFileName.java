package com.asiainfo.crm.inter.exe.webservice.client.cpa.task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CpaFileName {

	private String prefix;
	private String systemType;
	private String fileType;
	private String seqNum;
	private String createTime;
	private long fileSize;
	private String suffix;

	private String name;
	private boolean isValid = false;

	public CpaFileName() {
		this.isValid = true;
	}

	public CpaFileName(String name) {
		this.name = name;
		this.initial();
	}

	private void initial() {
		try {
			String[] split = this.name.split("\\.", 2);
			if (split.length == 2) {
				this.suffix = split[1];
				String[] fields = split[0].split("_");
				if (fields.length == 6) {
					this.prefix = fields[0];
					this.systemType = fields[1];
					this.fileType = fields[2];
					this.seqNum = fields[3];
					this.createTime = fields[4];
					this.fileSize = Long.parseLong(fields[5]);
					this.isValid = true;
				}
			}
		} catch (Exception e) {
		}
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getName() {
		return name;
	}

	public boolean isValid() {
		return isValid;
	}

	public boolean isTodayFile() {
		String todayStr = new SimpleDateFormat("yyyyMMdd").format(new Date());
		return this.createTime.startsWith(todayStr);
	}

	public boolean isDATEnding() {
		return this.suffix.toLowerCase().endsWith(FILE_ENDING);
	}

	public boolean isDATINGEnding() {
		return this.suffix.toLowerCase().endsWith(TMP_FILE_ENDING);
	}

	public String getTmpFileName() {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix).append("_").append(systemType).append("_").append(fileType).append("_");
		sb.append(seqNum).append("_").append(createTime).append(".").append(TMP_FILE_ENDING);
		return sb.toString();
	}

	public String getFinalFileName() {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix).append("_").append(systemType).append("_").append(fileType).append("_");
		sb.append(seqNum).append("_").append(createTime).append("_").append(fileSize).append(".").append(FILE_ENDING);
		return sb.toString();
	}

	public static final String FILE_ENDING = "dat";
	public static final String TMP_FILE_ENDING = "dat.ing";
}
