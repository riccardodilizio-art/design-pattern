package notifiche;

public class PushNotifier extends NotifierDecorator{
    public PushNotifier(Notifier notifier){
        super(notifier);
    }
    @Override
    public void send(String message){
        super.send(message);
        System.out.println("Inviata notifica push "+ message);
    }
}
