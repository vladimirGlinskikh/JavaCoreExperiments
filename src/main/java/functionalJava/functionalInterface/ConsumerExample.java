package functionalJava.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*********"));

    public static void main(String[] args) {
        Customer vladimir = new Customer("Vladimir", "+777788789");
        greetCustomer(vladimir);

        //Consumer functional interface
        greetCustomerConsumer.accept(vladimir);
        greetCustomerConsumerV2.accept(vladimir, false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
