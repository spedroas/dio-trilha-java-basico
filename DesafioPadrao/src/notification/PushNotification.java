package notification;

public class PushNotification implements NotificationStrategy {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Enviando push para " + recipient + ": " + message);
    }
}