package com.example.recomendation.model;

import java.util.List;

public class Recommendation {
    private String id;
    private List<MedicalService> medicalServices;
    private List<Symptom> symptoms;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MedicalService> getMedicalServices() {
        return medicalServices;
    }

    public void setMedicalServices(List<MedicalService> medicalServices) {
        this.medicalServices = medicalServices;
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }
}
