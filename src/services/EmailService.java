package services;

public class EmailService implements NotificationService{
    public void sendNotification( String name,String message) {
        System.out.println("[EMAIL] Sending email notification: " + message);
    }
}
