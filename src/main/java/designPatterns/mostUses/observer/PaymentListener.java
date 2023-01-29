package designPatterns.mostUses.observer;

@FunctionalInterface
public interface PaymentListener {
    void paymentMade(PaymentEvent event);
}
