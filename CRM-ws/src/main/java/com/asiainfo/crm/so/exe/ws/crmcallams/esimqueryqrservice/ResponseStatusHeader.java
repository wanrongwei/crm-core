package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import java.io.Serializable;

public class ResponseStatusHeader implements Serializable {

    private ResponseStausCodeData statusCodeData;
    private String status;

    public ResponseStausCodeData getStatusCodeData() {
        return statusCodeData;
    }

    public void setStatusCodeData(ResponseStausCodeData statusCodeData) {
        this.statusCodeData = statusCodeData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
