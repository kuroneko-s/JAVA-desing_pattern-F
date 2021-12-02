package com.inflearn.desing_pattern.adaptarT;

public class AccountUserDetailesService implements UserDetailesService{
    AccountService accountService;

    public AccountUserDetailesService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
