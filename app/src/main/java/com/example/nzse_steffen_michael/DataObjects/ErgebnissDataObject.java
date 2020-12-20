package com.example.nzse_steffen_michael.DataObjects;

public class ErgebnissDataObject {

    private String houseName;
    private String rent;
    private String price;
    private boolean fav;

    public ErgebnissDataObject(String houseName, String rent, String price, boolean fav) {
        this.houseName = houseName;
        this.rent = rent;
        this.fav = fav;
        this.price = price;
    }

    public ErgebnissDataObject(String houseName, String price, boolean fav) {
        this.houseName = houseName;
        this.price = price;
        this.fav = fav;
    }

    public ErgebnissDataObject() {
            // empty Constructor
    }

    public String getHouseName() {
        return houseName;
    }

    public String getRent() {
        return rent;
    }

    public String getPrice() {
        return price;
    }

    public boolean isFav() {
        return fav;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }



}
