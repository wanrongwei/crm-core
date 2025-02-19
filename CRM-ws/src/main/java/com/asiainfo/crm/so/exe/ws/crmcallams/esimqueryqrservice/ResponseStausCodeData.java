package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

import java.io.Serializable;

public class ResponseStausCodeData implements Serializable {
    private String subjectCode;
    private String reasonCode;
    private String subjectIdentifier;
    private String message;

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getSubjectIdentifier() {
        return subjectIdentifier;
    }

    public void setSubjectIdentifier(String subjectIdentifier) {
        this.subjectIdentifier = subjectIdentifier;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
