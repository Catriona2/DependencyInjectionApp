package consumers;

import services.NotificationService;


public class NotificationManager {
    private final NotificationService notificationService;

    {
        
    }
    static{

    }


    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(  String name,String message) {
        notificationService.sendNotification(name, message);
    }
}
