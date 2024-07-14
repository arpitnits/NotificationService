package org.example;

public class SMSBase extends BaseDecorator {


    public SMSBase(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("SMS Notification");
    }
}
