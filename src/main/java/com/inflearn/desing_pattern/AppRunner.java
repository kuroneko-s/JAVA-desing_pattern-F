package com.inflearn.desing_pattern;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.Iterator;
import java.util.List;

@Component
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        GenericEx genericEx = new GenericEx(1);
        System.out.println(genericEx.getField());
        List myList = genericEx.getMyList();
        myList.add("1");
        myList.add(1);
        Iterator iterator = myList.iterator();
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        RequestMappingHandlerAdapter
    }
}
