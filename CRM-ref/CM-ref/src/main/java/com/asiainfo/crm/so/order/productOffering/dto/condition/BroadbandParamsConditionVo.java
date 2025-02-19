package com.asiainfo.crm.so.order.productOffering.dto.condition;

import com.asiainfo.crm.so.order.fixedline.dto.PreQResultVo;

import java.io.Serializable;

public class BroadbandParamsConditionVo implements Serializable{
	private static final long serialVersionUID = 1482300823200347771L;
	
	private boolean hasPSTN;
	private boolean superOrder;
	private boolean manualSelCo;
	
	private String platform;
	private String io;
	private String technologyType;
	private String downloadSpeed; // 下载速度
	
	private String installationMethod; // GDS GIG DIGGIN
	
	private PreQResultVo tdcPreQResult;
	private PreQResultVo opennetPreQResult;
	
	public boolean isHasPSTN() {
		return hasPSTN;
	}
	public void setHasPSTN(boolean hasPSTN) {
		this.hasPSTN = hasPSTN;
	}
	public boolean isSuperOrder() {
		return superOrder;
	}
	public void setSuperOrder(boolean superOrder) {
		this.superOrder = superOrder;
	}
	public boolean isManualSelCo() {
		return manualSelCo;
	}
	public void setManualSelCo(boolean manualSelCo) {
		this.manualSelCo = manualSelCo;
	}
	public String getTechnologyType() {
		return technologyType;
	}
	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getIo() {
		return io;
	}
	public void setIo(String io) {
		this.io = io;
	}
	public String getDownloadSpeed() {
		return downloadSpeed;
	}
	public void setDownloadSpeed(String downloadSpeed) {
		this.downloadSpeed = downloadSpeed;
	}
	public PreQResultVo getTdcPreQResult() {
		return tdcPreQResult;
	}
	public void setTdcPreQResult(PreQResultVo tdcPreQResult) {
		this.tdcPreQResult = tdcPreQResult;
	}
	public PreQResultVo getOpennetPreQResult() {
		return opennetPreQResult;
	}
	public void setOpennetPreQResult(PreQResultVo opennetPreQResult) {
		this.opennetPreQResult = opennetPreQResult;
	}
	public String getInstallationMethod() {
		return installationMethod;
	}
	public void setInstallationMethod(String installationMethod) {
		this.installationMethod = installationMethod;
	}
	
}
