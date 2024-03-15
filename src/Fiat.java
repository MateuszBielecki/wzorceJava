public class Fiat implements CarStrategy {
    @Override
    public int getMaxSpeed() {
        return 126;
    }

    @Override
    public String getCarName() {
        return "Fiat";
    }
}