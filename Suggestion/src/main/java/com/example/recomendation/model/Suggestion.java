package com.example.recomendation.model;

import java.util.Date;

public class Suggestion {
    private String recomentId;
    private String userName;
    private Date datetime;

    public String getRecomentId() {
        return recomentId;
    }

    public void setRecomentId(String recomentId) {
        this.recomentId = recomentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
