package DaoUtility;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtility {
    public MailUtility() {
    }


    public static boolean sendMail(String recepients,String subject,String text) throws Exception {
        System.out.println("preparing to sent emails");
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");

        String emailAccount = "parking321321@gmail.com\n";
        String password = "bcylgxpjpsofxdua";
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailAccount, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailAccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepients));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
            System.out.println("meassage is sent successfull");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
