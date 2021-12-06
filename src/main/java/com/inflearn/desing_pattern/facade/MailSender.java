package com.inflearn.desing_pattern.facade;

import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
    private MailSettings mailSettings;

    public MailSender(MailSettings mailSettings) {
        this.mailSettings = mailSettings;
    }

    public void sendMail(MailMessage mailMessage) throws Exception{
        MimeMessage message = new MimeMessage(mailSettings.getSession());
        message.setFrom(new InternetAddress(mailMessage.getFrom()));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(mailMessage.getTo()));
        message.setSubject(mailMessage.getSubject());
        message.setText(mailMessage.getText());

        Transport.send(message);
    }
}
