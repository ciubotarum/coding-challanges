package theory.examples;

import java.util.ArrayList;

public class Strategy {
    // theory.examples.Strategy Interface
    public static interface PaymentStrategy {
        void pay(int amount);
    }

    // Concrete theory.examples.Strategy
    public static class CreditCardPayment implements PaymentStrategy {
        private String cardNumber;

        public CreditCardPayment(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        @Override
        public void pay(int amount) {
            System.out.println(amount + " paid with credit card: " + cardNumber);
        }
    }

    // Concrete theory.examples.Strategy
    public static class PayPalPayment implements PaymentStrategy {
        private String email;

        public PayPalPayment(String email) {
            this.email = email;
        }

        @Override
        public void pay(int amount) {
            System.out.println(amount + " paid using PayPal: " + email);
        }
    }

    // Context
    public static class ShoppingCart {
        private List<Item> items;
        private PaymentStrategy paymentStrategy;

        public ShoppingCart() {
            this.items = new ArrayList<>();
        }

        public void addItem(Item item) {
            items.add(item);
        }

        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void checkout() {
            int amount = items.stream().mapToInt(Item::getPrice).sum();
            paymentStrategy.pay(amount);
        }
    }

    // Usage
    public static class Client {
        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            cart.addItem(new Item("Laptop", 1000));
            cart.addItem(new Item("Phone", 500));

            cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9101-1121"));
            cart.checkout();

            cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
            cart.checkout();
        }
    }

}
