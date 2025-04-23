package com.spawithspa.spawithspa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "bookings")
public class Booking {

    @Id
    private String id;
    private String date;
    private String timeSlot;
    private String customerName;
    private Integer amountOfPeople;
    private Integer amountOfChildren;
    private Double price;
    private String treatmentType;

    @DocumentReference
    private Preson preson;

    @DocumentReference
    private Treatment treatment;

    @DocumentReference
    private Children children;

    public Booking(String id, String date, String timeSlot, String customerName, Integer amountOfPeople,
            Integer amountOfChildren, Double price, String treatmentType, Preson preson, Treatment treatment,
            Children children) {
        this.id = id;
        this.date = date;
        this.timeSlot = timeSlot;
        this.customerName = customerName;
        this.amountOfPeople = amountOfPeople;
        this.amountOfChildren = amountOfChildren;
        this.price = price;
        this.treatmentType = treatmentType;
        this.preson = preson;
        this.treatment = treatment;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(Integer amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public Integer getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(Integer amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public Preson getPreson() {
        return preson;
    }

    public void setPreson(Preson preson) {
        this.preson = preson;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    // Getters and setters for new fields

}