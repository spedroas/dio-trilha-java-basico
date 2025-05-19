package notification;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando SMS para " + recipient + ": " + message);
    }
}