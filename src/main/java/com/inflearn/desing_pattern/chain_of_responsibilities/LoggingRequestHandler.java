package com.inflearn.desing_pattern.chain_of_responsibilities;

public class LoggingRequestHandler extends RequestHandler{
    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("Logging");
        super.handle(request);
    }
}
