package com.inflearn.desing_pattern.chain_of_responsibilities;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
