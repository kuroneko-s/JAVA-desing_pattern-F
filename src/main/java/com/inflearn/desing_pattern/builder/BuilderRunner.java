package com.inflearn.desing_pattern.builder;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class BuilderRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        TripDirector director = new TripDirector(new DefaultTripPlanBuilder());
//        System.out.println(director.japanTrip().toString());
//        System.out.println(director.shotJejuTrip().toString());

        StringBuilder stringBuilder = new StringBuilder();
        String hello = stringBuilder.append(15).append(2).append("Hello").toString();
        System.out.println(hello);

        // 제네릭 타입
        Stream<String> result = Stream.<String>builder().add("choi").add("dev").build();
        result.forEach(System.out::println);
    }
}
