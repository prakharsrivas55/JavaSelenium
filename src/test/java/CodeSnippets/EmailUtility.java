
package CodeSnippets;

import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Authenticator;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailUtility {

    protected static WebDriver ldriver;
    protected static WebDriverWait wait;

    // public EmailUtility(WebDriver rdriver) {
    //     ldriver = rdriver;
    //     // ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    //     wait = new WebDriverWait(ldriver, 30);
    // }

    public static void sendEmail(String subject, String messagetext) {

        String from= "prakhar.srivastava@leverageedu.com";
        String to= "prakhar.srivastava@leverageedu.com";
        String to2="dirgha.singh@leverageedu.com";
        String host= "smtp.gmail.com";

        // Properties to configure the Gmail SMTP server
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "587"); // Use 587 for TLS
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");

        // Create a session with authentication
        Session session = Session.getInstance(properties,  new Authenticator(){
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                // Use environment variables or external configuration for passwords in production
                String email = "prakhar.srivastava@leverageedu.com"; // Replace with your actual email address
                return new javax.mail.PasswordAuthentication(email, "ermkkmrcznepmrgv");
            }
        });

        try {
            // Create a MimeMessage
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to2));
            message.setSubject(subject);
            message.setText(messagetext);

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
