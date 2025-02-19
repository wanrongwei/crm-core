/**
 * 
 */
package com.asiainfo.crm.agreement.teaminvoke.out.service.bean;

import com.ai.appframe2.bo.DataContainer;

/**
 * Email TC Object for order's usage
 * @author zhangfh3
 *
 */
public class TCBOBean extends DataContainer{
	
	private String versionCode;
	private String termTitle;
	private String ftpPath;
	private byte[] fileBytes;
	
	/**
	 * @return 版本号
	 */
	public String getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	/**
	 * @return 条款名称
	 */
	public String getTermTitle() {
		return termTitle;
	}
	public void setTermTitle(String termTitle) {
		this.termTitle = termTitle;
	}
	/**
	 * @return ftp文件所在路径
	 */
	public String getFtpPath() {
		return ftpPath;
	}
	public void setFtpPath(String ftpPath) {
		this.ftpPath = ftpPath;
	}
	/**
	 * @return 文件字节流
	 */
	public byte[] getFileBytes() {
		return fileBytes;
	}
	public void setFileBytes(byte[] fileBytes) {
		this.fileBytes = fileBytes;
	}
	
}
