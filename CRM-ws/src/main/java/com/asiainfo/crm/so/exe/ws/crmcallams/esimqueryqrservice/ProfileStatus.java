package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import java.io.Serializable;

public class ProfileStatus implements Serializable {

    private String iccid;
    private String state;
    private String statusLastUpdateTimestamp;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatusLastUpdateTimestamp() {
        return statusLastUpdateTimestamp;
    }

    public void setStatusLastUpdateTimestamp(String statusLastUpdateTimestamp) {
        this.statusLastUpdateTimestamp = statusLastUpdateTimestamp;
    }
}
