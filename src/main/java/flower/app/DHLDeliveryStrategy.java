package flower.app;
import java.util.List;
public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Items delivered by DHL.");
    }
}
