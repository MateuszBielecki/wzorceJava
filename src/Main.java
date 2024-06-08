public class Main {
    public static void main(String[] args) {
        ICarSpeedStrategy fiatSpeedStrategy = new FixedSpeedStrategy(126);
        ICarSpeedStrategy skodaSpeedStrategy = new FixedSpeedStrategy(220);

        Car fiat = new Car("Fiat", fiatSpeedStrategy);
        Car skoda = new Car("Skoda", skodaSpeedStrategy);

        fiat.showCarName();
        System.out.println("Maksymalna prędkość Fiata: " + fiat.getMaxSpeed());

        skoda.showCarName();
        System.out.println("Maksymalna prędkość Skody: " + skoda.getMaxSpeed());
    }
}