package services;


public class SMSService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("[SMS] Sending SMS notification: " + message);
    }
}
