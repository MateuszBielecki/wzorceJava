public class Skoda implements CarStrategy {
    @Override
    public int getMaxSpeed() {
        return 220;
    }

    @Override
    public String getCarName() {
        return "Skoda";
    }
}