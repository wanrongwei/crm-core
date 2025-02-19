package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import java.io.Serializable;

public class EsimQrCodeResponseBean implements Serializable {
    private ResponseStatusHeader statusHeader;
    private String data;
    private String deepLink;

    public ResponseStatusHeader getStatusHeader() {
        return statusHeader;
    }

    public void setStatusHeader(ResponseStatusHeader statusHeader) {
        this.statusHeader = statusHeader;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }
}
