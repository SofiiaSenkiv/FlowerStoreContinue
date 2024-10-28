package flower.app;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<Item> flowers = new ArrayList<>();

    public void addFlowers(Item flower) {
        flowers.add(flower);
    }

    public Item searchFlower(String description) {
        return flowers.stream()
                      .filter(f -> f.getDescription().equals(description))
                      .findFirst()
                      .orElse(null);
    }

    @Override
    public double price() {
        return flowers.stream().mapToDouble(Item::price).sum();
    }
}

