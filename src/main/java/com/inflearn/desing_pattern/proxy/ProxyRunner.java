package com.inflearn.desing_pattern.proxy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class ProxyRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.gameStart();
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{ GameService.class }, (proxy, method, args) -> {
                    System.out.println("Hello dynamic proxy");
                    method.invoke(target, args);
                    return null;
                });
    }
}
