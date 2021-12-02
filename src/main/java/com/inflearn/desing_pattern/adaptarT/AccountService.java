package com.inflearn.desing_pattern.adaptarT;

public class AccountService implements UserDetailesService{

    Account findAccountByUsername(String username){
        Account account = new Account();
        account.setName(username);
        account.setPassword("dong");
        return account;
    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
