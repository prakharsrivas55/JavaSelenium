package CodeSnippets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlackAlerts {

    protected static WebDriver ldriver;
    protected static WebDriverWait wait;

    // public static void SlackAlerts(WebDriver rdriver) {
    //     ldriver = rdriver;
    //     // ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    //     wait = new WebDriverWait(ldriver, 30);
    // }


    public static void sendSlackAlert(String message) {
        String slackWebhookUrl = "https://hooks.slack.com/services/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";  // Replace with your Slack Webhook URL
        
        try {
            // Create the JSON payload for the Slack message
            String slackPayload = "{ \"text\": \"" + message + "\" }";
            
            // Send POST request to Slack Webhook
            HttpURLConnection slackConnection = (HttpURLConnection) new URL(slackWebhookUrl).openConnection();
            slackConnection.setRequestMethod("POST");
            slackConnection.setRequestProperty("Content-Type", "application/json");
            slackConnection.setDoOutput(true);
                 
            // Send the JSON payload to Slack
            try (OutputStream os = slackConnection.getOutputStream()) {
                byte[] input = slackPayload.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Get the response code from Slack (optional)
            int slackResponseCode = slackConnection.getResponseCode();
            System.out.println("Slack response code: " + slackResponseCode);
            slackConnection.disconnect();

        } catch (IOException e) {
            System.out.println("Error sending Slack alert: " + e.getMessage());
        }
    }
    
}
