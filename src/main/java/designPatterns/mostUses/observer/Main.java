package designPatterns.mostUses.observer;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        paymentManager.registerPaymentListener(event -> {
            System.out.println(":)");
        });

        PaymentListener p2 = new PaymentEventLogger("1234");
        paymentManager.registerPaymentListener(p2);

        paymentManager.pay();
        paymentManager.unregisterPaymentListener(p2);

        paymentManager.pay();
    }
}
