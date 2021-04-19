package com.email;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


public class email {
    public static void main(String[] args) {
        String to = "moryaloy@gmail.com";
        String from = "noreply@gmail.com";
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host",host);
        Session session = Session.getDefaultInstance(properties);
        try {
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
         message.setSubject("Это тема письма!");
         message.setText("Это актуальное сообщение");
         Transport.send(message);
         System.out.println("Сообщение успешно отправлено....");
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
