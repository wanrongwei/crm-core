package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import java.io.Serializable;

public class ReleaseProfileResponseBean implements Serializable {
    private ResponseStatusHeader statusHeader;
    private String profileStatus;

    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }

    public ResponseStatusHeader getStatusHeader() {
        return statusHeader;
    }

    public void setStatusHeader(ResponseStatusHeader statusHeader) {
        this.statusHeader = statusHeader;
    }
}
