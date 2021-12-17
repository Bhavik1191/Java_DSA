package designPatterns.factoryPattern;

public class NotificationFactory {


    public Notification createNotification(String notificationRoute)
    {
        switch (notificationRoute)
        {
            case ("SMS"):
                return new SMSNotifications();

            case ("Email"):
                return new EmailNotification();

            case ("Push"):
                return new PushNotification();

            default:
                return null;
        }
    }
}
