package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import java.io.Serializable;

public class EsimProfilesStatusResponseBean implements Serializable {
    private ResponseStatusHeader statusHeader;

    public ResponseStatusHeader getStatusHeader() {
        return statusHeader;
    }

    public void setStatusHeader(ResponseStatusHeader statusHeader) {
        this.statusHeader = statusHeader;
    }

    public ProfileStatus [] profileStatuses;

    public ProfileStatus[] getProfileStatuses() {
        return profileStatuses;
    }

    public void setProfileStatuses(ProfileStatus[] profileStatuses) {
        this.profileStatuses = profileStatuses;
    }
}
