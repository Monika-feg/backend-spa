package com.spawithspa.spawithspa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "treatments")
public class Treatment {

    @Id
    private String id;
    private String treatmentType;
    private int price;

    public Treatment(String id, String treatmentType, int price) {
        this.id = id;
        this.treatmentType = treatmentType;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
