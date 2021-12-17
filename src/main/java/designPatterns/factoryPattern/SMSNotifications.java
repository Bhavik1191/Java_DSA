package designPatterns.factoryPattern;

public class SMSNotifications implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("SMS Notification send");
    }
}
