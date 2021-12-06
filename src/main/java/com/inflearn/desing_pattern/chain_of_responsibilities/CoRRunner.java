package com.inflearn.desing_pattern.chain_of_responsibilities;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class CoRRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Request request = new Request("이번 놀이는 뽑기입니다,");
        RequestHandler requestHandler = makeChainHandler();
        requestHandler.handle(request);
    }

    private RequestHandler makeChainHandler(){
        return new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
    }

}
