package org.example;

public abstract class BaseDecorator implements NotificationService {

    protected final NotificationService notificationService;

    public BaseDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void sendNotification(String msg) {
        notificationService.sendNotification(msg);
    }
}
