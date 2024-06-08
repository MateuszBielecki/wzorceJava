public class FixedSpeedStrategy implements ICarSpeedStrategy {
    private int maxSpeed;

    public FixedSpeedStrategy(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}