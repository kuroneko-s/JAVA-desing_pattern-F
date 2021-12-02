package com.inflearn.desing_pattern.adaptarT;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//@Component
public class AdapterRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        AccountService accountService = new AccountService();
//        UserDetailesService userDetailesService = new AccountUserDetailesService(accountService);
        LoginHandler loginHandler = new LoginHandler(new AccountService());
        String result = loginHandler.login("dong", "dong");
        System.out.println(result);

        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list = Collections.list(enumeration);

        /*
            InputStream is = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)
         */
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")))){
            while(reader.ready()){
                System.out.println(reader.readLine());
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        HandlerAdapter handlerAdapter;
        DispatcherServlet dispatcherServlet;
    }

}
