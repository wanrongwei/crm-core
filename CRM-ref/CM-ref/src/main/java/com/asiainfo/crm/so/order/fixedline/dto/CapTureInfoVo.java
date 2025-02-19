package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;


public class  CapTureInfoVo implements Serializable {
	private static final long serialVersionUID = 25692909866666600L;
    private String preqResult;
    private String manualSelCo;
    private String manualOrder;
    private String superOrder;
    private CheckPSTNVo checkPSTN;
    private ActVo act;
    
    public ActVo getAct() {
		return act;
	}
	public void setAct(ActVo act) {
		this.act = act;
	}
	public void setPreqResult(String preqResult) {
         this.preqResult = preqResult;
     }
     public String getPreqResult() {
         return preqResult;
     }

    public void setManualSelCo(String manualSelCo) {
         this.manualSelCo = manualSelCo;
     }
     public String getManualSelCo() {
         return manualSelCo;
     }

    public void setManualOrder(String manualOrder) {
         this.manualOrder = manualOrder;
     }
     public String getManualOrder() {
         return manualOrder;
     }

    public void setSuperOrder(String superOrder) {
         this.superOrder = superOrder;
     }
     public String getSuperOrder() {
         return superOrder;
     }

    public void setCheckPSTN(CheckPSTNVo checkPSTN) {
         this.checkPSTN = checkPSTN;
     }
     public CheckPSTNVo getCheckPSTN() {
         return checkPSTN;
     }
}
