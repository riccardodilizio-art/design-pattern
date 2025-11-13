package notifiche;

public class Demo {
    public static void main(String[] args) {
        Notifier notifica = new EmailNotifier();

        notifica = new SMSNotifier(notifica);
        notifica = new PushNotifier(notifica);
        notifica = new WhatsAppNotifier(notifica);

        notifica.send("Offerta speciale! Sconto del 20% su tutti i prodotti!");
    }
}
