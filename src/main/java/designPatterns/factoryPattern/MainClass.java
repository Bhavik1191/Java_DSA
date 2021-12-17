package designPatterns.factoryPattern;

public class MainClass {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("f");
        notification.notifyUser();

    }
}
