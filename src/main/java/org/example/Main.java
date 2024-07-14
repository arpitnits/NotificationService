package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        NotificationService notificationService = new BaseNotifier();
        notificationService = new SMSBase(new EmailBase(notificationService));

        notificationService.sendNotification("Hello!"); // Output: Base Notification, Email Notification, SMS Notification
    }
}