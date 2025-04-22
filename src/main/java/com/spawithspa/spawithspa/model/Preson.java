package com.spawithspa.spawithspa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "presons")
public class Preson {

    @Id
    private String id;
    private String name;
    private int amountOfAdults;

    public Preson(String id, String name, int amountOfAdults) {
        this.id = id;
        this.name = name;
        this.amountOfAdults = amountOfAdults;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfAdults() {
        return amountOfAdults;
    }

    public void setAmountOfAdults(int amountOfAdults) {
        this.amountOfAdults = amountOfAdults;
    }

}
