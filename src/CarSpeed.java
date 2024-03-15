public class CarSpeed {
    private final CarStrategy strategy;

    public CarSpeed(CarStrategy strategy) {
        this.strategy = strategy;
    }

    public int getMaxSpeed() {
        return strategy.getMaxSpeed();
    }

    public String getCarName() {
        return strategy.getCarName();
    }
}