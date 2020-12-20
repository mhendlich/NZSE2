package com.example.nzse_steffen_michael.DataObjects;

import java.util.ArrayList;

public class Seller extends User {
    private final ArrayList<Listing> listings = new ArrayList<>();

    public Seller(String name, String telephone, String email, String password, String address) {
        super(name, telephone, email, password, address);
    }

    public void addListing(Listing listing) {
    }

    public boolean deleteListing(Listing listing) {
        return listings.remove(listing);
    }
}
