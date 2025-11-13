package notifiche;

public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Inviato SMS "+ message);
    }
}
