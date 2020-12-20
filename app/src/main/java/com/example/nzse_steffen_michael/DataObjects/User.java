package com.example.nzse_steffen_michael.DataObjects;

public abstract class User {
    private final String name;
    private final String telephone;
    private final String email;
    private final String password;
    private final String address;

    public User(String name, String telephone, String email, String password, String address) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }
}
