package com.example.nzse_steffen_michael.DataObjects;

import java.util.ArrayList;

public class Buyer extends User {
    private final ArrayList<Listing> favorites = new ArrayList<>();
    private final ArrayList<Listing> notInterested = new ArrayList<>();
    private final ArrayList<Listing> pending = new ArrayList<>();

    public Buyer(String name, String telephone, String email, String password, String address) {
        super(name, telephone, email, password, address);
    }

    public void addFavorite(Listing listing) {
        favorites.add(listing);
    }

    public void removeFavorite(Listing listing) {
        favorites.remove(listing);
    }

    public void addNotInterested(Listing listing) {
        notInterested.add(listing);
    }

    public void addPending(Listing listing) {
        pending.add(listing);
    }

    public ArrayList<Listing> getFavorites() {
        return favorites;
    }

    public ArrayList<Listing> getNotInterested() {
        return notInterested;
    }

    public ArrayList<Listing> getPending() {
        return pending;
    }
}
