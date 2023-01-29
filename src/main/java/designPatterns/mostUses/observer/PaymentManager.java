package designPatterns.mostUses.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager implements PaymentSubject {
    private final List<PaymentListener> paymentListeners =
            new ArrayList<>();

    PaymentEvent event = new PaymentEvent(this);

    public void pay() {
        paymentListeners.forEach(p -> p.paymentMade(event));
    }

    public void registerPaymentListener(PaymentListener p) {
        paymentListeners.add(p);
    }

    public void unregisterPaymentListener(PaymentListener p) {
        paymentListeners.remove(p);
    }
}
