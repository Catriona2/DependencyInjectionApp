package services;
public class SMSService implements NotificationService {
    @Override
    public void sendNotification( String name,String message) {
        System.out.println("[SMS] Sending SMS notification: " +"hello"+""+name+ "" +message);
    }
}
