package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import java.io.Serializable;

public class DownloadOrderResponseBean implements Serializable {
    private ResponseStatusHeader statusHeader;
    private String iccid;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public ResponseStatusHeader getStatusHeader() {
        return statusHeader;
    }

    public void setStatusHeader(ResponseStatusHeader statusHeader) {
        this.statusHeader = statusHeader;
    }
}
