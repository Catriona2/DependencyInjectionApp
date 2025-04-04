package app;

import consumers.NotificationManager;
import services.EmailService;
import services.SMSService;

import java.util.Scanner;

public class DependencyInjectionApp {
    public static void main(String[] args) {
        Scanner  keyboardData=new Scanner(System.in);
        System.out.println(" please Enter Recipent name ");
        String  Username=keyboardData.nextLine();
        System.out.println("please Enter the Email message");
        String useremailMessage =keyboardData.nextLine();
        //  Injection point
        NotificationManager emailNotifier = new NotificationManager(new EmailService());
        emailNotifier.notifyUser(Username,useremailMessage);
        //  Another Injection  point
        NotificationManager smsNotifier = new NotificationManager(new SMSService());
        System.out.println("please Enter the sms message");
        String userSMSmessage =keyboardData.nextLine();
        smsNotifier.notifyUser(Username,userSMSmessage);
    }
}
