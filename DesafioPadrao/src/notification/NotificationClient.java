package notification;

public class NotificationClient {
    private String name;
    private String email;

    public NotificationClient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}