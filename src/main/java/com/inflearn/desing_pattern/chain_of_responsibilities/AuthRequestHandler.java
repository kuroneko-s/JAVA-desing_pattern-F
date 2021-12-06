package com.inflearn.desing_pattern.chain_of_responsibilities;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었나?");
        return;
//        super.handle(request);
    }
}
