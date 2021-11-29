package com.inflearn.desing_pattern.factorymethod;

public abstract class DefaultShipFactory implements ShipFactory{
    @Override
    public void finished(String name) {
        System.out.println(name + " 다 만들었습니다.");
    }

    @Override
    public void preparedFor(String name, String email) {
        System.out.println("제조중 " + name);
    }

    @Override
    public void validate(String name, String email) {
        if ( isEmpty(name) ) {
            throw new IllegalArgumentException("이름이 없습니다!");
        }else if ( isEmpty(email) ) {
            throw new IllegalArgumentException("이메일이 없습니다!");
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
