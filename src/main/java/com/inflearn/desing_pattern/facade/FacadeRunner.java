package com.inflearn.desing_pattern.facade;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FacadeRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        MailSettings mailSettings = new MailSettings();
        MailSender mailSender = new MailSender(mailSettings);
        MailMessage mailMessage = new MailMessage();
        mailMessage.setFrom("choidh.dev@gmail.com");
        mailMessage.setTo("kuroneko2@naver.com");
        mailMessage.setSubject("Test Mail from Java Program");
        mailMessage.setText("message");

        mailSender.sendMail(mailMessage);
    }
}
