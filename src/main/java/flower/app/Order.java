package flower.app;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private List<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::price).sum();
    }

    public void processOrder() {
        double totalPrice = calculateTotalPrice();
        if (payment != null) {
            payment.pay(totalPrice);
        }
        if (delivery != null) {
            delivery.deliver(items);
        }
    }
}

