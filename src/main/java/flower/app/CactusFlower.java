package flower.app;

public class CactusFlower extends Item {
    public CactusFlower() {
        description = "Cactus Flower";
    }

    @Override
    public double price() {
        return 10.0; // Set specific price
    }
}
