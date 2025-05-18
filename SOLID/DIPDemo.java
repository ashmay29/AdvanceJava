
interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class Notification {
    private MessageService service;

    public Notification(MessageService service) {
        this.service = service;
    }

    public void notifyUser(String msg) {
        service.sendMessage(msg);
    }
}

class DIPDemo {
    public static void main(String[] args) {
        Notification n = new Notification(new EmailService());
        n.notifyUser("Welcome!");
    }
}
