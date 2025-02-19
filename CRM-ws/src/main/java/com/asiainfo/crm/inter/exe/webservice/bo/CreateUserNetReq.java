package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class CreateUserNetReq implements Serializable {

	@JsonProperty(value="CreateUserOrder")
	public CreateUserOrder createUserOrder;
	@JsonProperty(value="ActionId")
	public int actionId;
	@JsonProperty(value="IsCheckPWD")
	public int isCheckPWD;
	@JsonProperty(value="AgentPWD")
	public String agentPWD;
	@JsonProperty(value="AgentPhone")
	public String agentPhone;
	
	public CreateUserOrder getCreateUserOrder() {
		return createUserOrder;
	}
	public void setCreateUserOrder(CreateUserOrder createUserOrder) {
		this.createUserOrder = createUserOrder;
	}
	public int getActionId() {
		return actionId;
	}
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	public int getIsCheckPWD() {
		return isCheckPWD;
	}
	public void setIsCheckPWD(int isCheckPWD) {
		this.isCheckPWD = isCheckPWD;
	}
	public String getAgentPWD() {
		return agentPWD;
	}
	public void setAgentPWD(String agentPWD) {
		this.agentPWD = agentPWD;
	}
	public String getAgentPhone() {
		return agentPhone;
	}
	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}
	
}
