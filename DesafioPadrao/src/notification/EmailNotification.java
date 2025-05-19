package notification;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando email para " + recipient + ": " + message);
    }
}