package com.inflearn.desing_pattern.facade;

import javax.mail.Session;
import java.util.Properties;

public class MailSettings {
    private String host = "127.0.0.1";

    public Session getSession() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        return Session.getDefaultInstance(properties);
    }
}
