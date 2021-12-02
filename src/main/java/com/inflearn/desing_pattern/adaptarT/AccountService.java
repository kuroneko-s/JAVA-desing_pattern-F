package com.inflearn.desing_pattern.adaptarT;

public class AccountService {

    Account findAccountByUsername(String username){
        Account account = new Account();
        account.setName(username);
        account.setPassword("dong");
        return account;
    }

}
