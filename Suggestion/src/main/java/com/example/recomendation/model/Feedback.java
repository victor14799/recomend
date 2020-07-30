package com.example.recomendation.model;

public class Feedback {
    private String id;
    private String comment;
    private String accountId;
    private String medicalServiceId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMedicalServiceId() {
        return medicalServiceId;
    }

    public void setMedicalServiceId(String medicalServiceId) {
        this.medicalServiceId = medicalServiceId;
    }
}
