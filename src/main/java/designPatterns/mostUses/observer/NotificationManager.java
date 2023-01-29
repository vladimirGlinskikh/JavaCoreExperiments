package designPatterns.mostUses.observer;

public class NotificationManager implements PaymentListener{
    private void sendNotification(){
        System.out.println("Notification sent");
    }

    @Override
    public void paymentMade(PaymentEvent event) {
        sendNotification();
    }
}
