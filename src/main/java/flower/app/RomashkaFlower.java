package flower.app;

public class RomashkaFlower extends Item {
    public RomashkaFlower() {
        description = "Romashka Flower";
    }

    @Override
    public double price() {
        return 8.0; // Set specific price
    }
}
