package com.example.nzse_steffen_michael.DataObjects;

public class User {
    private String name;
    private String telephone;
    private String email;
    private String password;
    private String address;

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
