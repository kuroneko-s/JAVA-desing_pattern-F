package com.inflearn.desing_pattern.adaptarT;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AdapterRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        AccountService accountService = new AccountService();
//        UserDetailesService userDetailesService = new AccountUserDetailesService(accountService);
        LoginHandler loginHandler = new LoginHandler(new AccountService());
        String result = loginHandler.login("dong", "dong");
        System.out.println(result);
    }
}
