package com.example.nzse_steffen_michael.DataObjects;

import java.util.ArrayList;

public class Listing {
    private final int id;
    private final String title;
    private final String description;
    private final String address;
    private final ArrayList<String> images;
    private final float price;
    private final int numRooms;
    private final float area;
    private final PaymentType paymentType;

    public Listing(int id, String title, String description, String address, ArrayList<String> images, float price, int numRooms, float area, PaymentType paymentType) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.address = address;
        this.images = images;
        this.price = price;
        this.numRooms = numRooms;
        this.area = area;
        this.paymentType = paymentType;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public float getPrice() {
        return price;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public float getArea() {
        return area;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }
}
