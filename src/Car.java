public class Car {
    private String name;
    private ICarSpeedStrategy speedStrategy;

    public Car(String name, ICarSpeedStrategy speedStrategy) {
        this.name = name;
        this.speedStrategy = speedStrategy;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return speedStrategy.getMaxSpeed();
    }

    public void showCarName() {
        System.out.println(name);
    }
}