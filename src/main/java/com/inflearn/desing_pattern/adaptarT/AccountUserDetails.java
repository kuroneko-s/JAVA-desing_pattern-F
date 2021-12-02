package com.inflearn.desing_pattern.adaptarT;

public class AccountUserDetails implements UserDetails{

    Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getUserPassword() {
        return account.getPassword();
    }
}
