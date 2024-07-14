package org.example;

public class EmailBase extends BaseDecorator {


    public EmailBase(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("Email Notification");
    }
}
