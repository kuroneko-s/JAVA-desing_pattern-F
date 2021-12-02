package com.inflearn.desing_pattern.adaptarT;

public class Account implements UserDetails{
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public String getUserPassword() {
        return this.password;
    }
}
