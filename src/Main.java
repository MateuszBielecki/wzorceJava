public class Main {
    public static void main(String[] args) {
        CarSpeed fiat = new CarSpeed(new Fiat());
        CarSpeed skoda = new CarSpeed(new Skoda());

        System.out.println("Maksymalna prędkość Fiata: " + fiat.getMaxSpeed());
        System.out.println("Nazwa Fiata: " + fiat.getCarName());

        System.out.println("Maksymalna prędkość Skody: " + skoda.getMaxSpeed());
        System.out.println("Nazwa Skody: " + skoda.getCarName());
    }
}