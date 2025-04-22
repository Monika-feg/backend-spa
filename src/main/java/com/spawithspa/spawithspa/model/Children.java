package com.spawithspa.spawithspa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "children")
public class Children {

    @Id
    private String id;
    private int amountOfChildren;

    public Children(String id, int amountOfChildren) {
        this.id = id;
        this.amountOfChildren = amountOfChildren;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

}
