import notification.*;

public class App {
    public static void main(String[] args) {
        // Configuração do serviço (Singleton)
        NotificationService service = NotificationService.getInstance();
        
        // Criando clientes
        NotificationClient client1 = new NotificationClient("João", "joao@email.com");
        NotificationClient client2 = new NotificationClient("Maria", "maria@email.com");
        
        // Registrando clientes (Observer)
        service.addClient(client1);
        service.addClient(client2);
        
        // Enviando notificações por email (Strategy)
        service.setStrategy(new EmailNotification());
        service.notifyClients("Promoção especial hoje!");
        
        // Mudando para SMS (Strategy)
        service.setStrategy(new SMSNotification());
        service.notifyClients("Seu pedido foi enviado");
        
        // Adicionando novo cliente
        NotificationClient client3 = new NotificationClient("Carlos", "carlos@email.com");
        service.addClient(client3);
        
        // Enviando push notification
        service.setStrategy(new PushNotification());
        service.notifyClients("Novo recurso disponível!");
    }
}