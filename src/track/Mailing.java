package track;

import fileReading.SavfReading;
import fileReading.TextReading;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Mailing {

    public Mailing() {
        // Smtp server kurulumu ve gönderici email hesabı girişi
        String host = "smtp-mail.outlook.com";
        String port = "587";


        // TODO kullanıcı email ve şifresi
        SavfReading svf = new SavfReading();
        svf.scan("./data/settings.savf");
        String senderEmail = svf.getValue("s_mail");
        String senderPassword = svf.getValue("s_pass");
        String receiverMail = svf.getValue("r_mail");


        // Email giriş özelliklerini belirleme
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        // Şifre doğrulama
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(senderEmail, senderPassword);
                    }
                });
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(receiverMail));
            message.setSubject("Log file");
            message.setText("Testing");

            MimeBodyPart messageBodyPart = new MimeBodyPart();

            Multipart multipart = new MimeMultipart();

            String file = "./data/info.log";
            String fileName = "info.log";
            DataSource source = new FileDataSource(file);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            System.out.println("Sending");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
