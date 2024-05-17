/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author PHUCBAO
 */
public class gmail {

    public static void send(String togmail, String name, String code) {
        final String username = "yumfood3010@gmail.com";
        final String password = "zxikjfuppdcqoqha";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", 587);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(togmail)
            );
            message.setSubject("YumFood: ");
            message.setText("Dear " + name + ","
                    + "\n\n This is your verification code: " + code);

            Transport.send(message);

        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }

    public static void sendReport(String togmail, String name, File fileReport) {
        final String username = "hoangtdtps30071@fpt.edu.vn";
        final String password = "lwsixgvnmtkwqnhz";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", 587);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(togmail)
            );
            message.setSubject("Báo cáo: ");
            message.setText("Dear " + name + ","
                    + "\n\n This is your report");

            MimeBodyPart path = new MimeBodyPart();

            FileDataSource fds = new FileDataSource(fileReport);
            path.setDataHandler(new DataHandler(fds));
            path.setFileName(fileReport.getName());

            MimeMultipart mutiPath = new MimeMultipart();
            mutiPath.addBodyPart(path);

            message.setContent(mutiPath);

            Transport.send(message);

        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
}
