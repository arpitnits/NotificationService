package org.example;

public class BaseNotifier implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Base Notification");
    }
}
