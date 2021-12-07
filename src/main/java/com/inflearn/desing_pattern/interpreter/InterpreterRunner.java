package com.inflearn.desing_pattern.interpreter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
public class InterpreterRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }
}
