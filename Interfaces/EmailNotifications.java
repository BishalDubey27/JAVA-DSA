package Interfaces;

public class EmailNotifications implements notificationServices {

    private String email;
    public class 
    @Override
    public void sendEmailNotification(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }

    @Override
    public void subscribeToNotifications(String email) {
        System.out.println("Subscribing " + email + " to notifications");
    }
    
}
