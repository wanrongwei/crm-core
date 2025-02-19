/**
 * 
 */
package com.asiainfo.crm.so.exe.ws.oss;

import java.io.Serializable;

/**
 * @author pangyong
 * 
 */
public class Equipment implements Serializable{
	private String accessType;
	private String speedUp;
	private String speedDown;
	private String coType;

	public String getCoType() {
		return coType;
	}

	public void setCoType(String coType) {
		this.coType = coType;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getSpeedUp() {
		return speedUp;
	}

	public void setSpeedUp(String speedUp) {
		this.speedUp = speedUp;
	}

	public String getSpeedDown() {
		return speedDown;
	}

	public void setSpeedDown(String speedDown) {
		this.speedDown = speedDown;
	}

}
