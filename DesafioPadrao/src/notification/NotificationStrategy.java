package notification;

public interface NotificationStrategy {
    void send(String message, String recipient);
}
