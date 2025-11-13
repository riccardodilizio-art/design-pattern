package notifiche;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Email inviata "+message);
    }
}
