package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class PreOccupyPhoneNumReq implements Serializable {
	@JsonProperty(value="OpId")
	public long opId;
	@JsonProperty(value="OrgId")
	public long orgId;
	@JsonProperty(value="TradeType")
	public int tradeType;
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="CertCardType")
	public int certCardType;
	@JsonProperty(value="CertCardNum")
	public String certCardNum;
	@JsonProperty(value="AgentServiceNum")
	public String agentServiceNum;
	public long getOpId() {
		return opId;
	}
	public void setOpId(long opId) {
		this.opId = opId;
	}
	public long getOrgId() {
		return orgId;
	}
	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
	public int getTradeType() {
		return tradeType;
	}
	public void setTradeType(int tradeType) {
		this.tradeType = tradeType;
	}
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public int getCertCardType() {
		return certCardType;
	}
	public void setCertCardType(int certCardType) {
		this.certCardType = certCardType;
	}
	public String getCertCardNum() {
		return certCardNum;
	}
	public void setCertCardNum(String certCardNum) {
		this.certCardNum = certCardNum;
	}
	public String getAgentServiceNum() {
		return agentServiceNum;
	}
	public void setAgentServiceNum(String agentServiceNum) {
		this.agentServiceNum = agentServiceNum;
	}
	
	
	

}
