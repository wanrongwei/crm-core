package com.asiainfo.crm.inter.exe.webservice.client;

public class RspException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -236655620462118233L;
	
	private String rspCode;
	private String rspDesc;
	
	public RspException(String rspCode, String rspDesc) {
		super(wrapperMsg(rspCode, rspDesc));
		this.rspCode = rspCode;
		this.rspDesc = rspDesc;
	}
	
	public String getRspCode() {
		return rspCode;
	}

	public String getRspDesc() {
		return rspDesc;
	}

	private static String wrapperMsg(String rspCode, String rspDesc) {
		StringBuffer msg = new StringBuffer();
		msg.append("Invoke O2P Service Error: RspCode[").append(rspCode).append("] RspDesc[").append(rspDesc).append("].");
		return msg.toString();
	}
}
