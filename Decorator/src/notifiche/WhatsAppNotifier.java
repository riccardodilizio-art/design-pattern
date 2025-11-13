package notifiche;

public class WhatsAppNotifier extends NotifierDecorator{
    public  WhatsAppNotifier(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Inviato messaggio WP "+ message);
    }
}
