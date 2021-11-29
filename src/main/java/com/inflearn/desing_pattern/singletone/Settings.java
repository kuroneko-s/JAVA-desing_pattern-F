package com.inflearn.desing_pattern.singletone;

import java.io.Serializable;

public class Settings implements Serializable {

    // private static Settings INSTANCE = new Settings();
    private static volatile Settings settings;

    private Settings(){}

    public static Settings getINSTANCE() {
        if ( settings == null ) {
            synchronized (Settings.class) {
                if ( settings == null ) {
                    settings = new Settings();
                }
            }
        }

        return settings;
    }

    // 직렬화 방어
    /*
    protected Object readResolve() {
        return getINSTANCE();
    }
     */

}
