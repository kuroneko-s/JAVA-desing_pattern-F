package com.inflearn.desing_pattern.chain_of_responsibilities;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (request == null) return;
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
