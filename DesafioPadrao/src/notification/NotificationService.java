package notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private static NotificationService instance;
    private List<NotificationClient> clients = new ArrayList<>();
    private NotificationStrategy strategy;

    private NotificationService() {}  // Construtor privado para Singleton

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void addClient(NotificationClient client) {
        clients.add(client);
    }

    public void notifyClients(String message) {
        for (NotificationClient client : clients) {
            strategy.send(message, client.getEmail());
        }
    }
}