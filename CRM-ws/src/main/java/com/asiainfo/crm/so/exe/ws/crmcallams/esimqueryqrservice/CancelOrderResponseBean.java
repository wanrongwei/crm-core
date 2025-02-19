package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import java.io.Serializable;

public class CancelOrderResponseBean implements Serializable {
    private ResponseStatusHeader statusHeader;

    public ResponseStatusHeader getStatusHeader() {
        return statusHeader;
    }

    public void setStatusHeader(ResponseStatusHeader statusHeader) {
        this.statusHeader = statusHeader;
    }
}
