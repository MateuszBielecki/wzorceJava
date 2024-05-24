public class Main {

    public static void main(String[] args) {

        Barometer barometer = new Barometer();
        User user1 = new User("Jan Kowalski");
        barometer.registerObserver(user1);

        WeatherForecast weatherForecast = new WeatherForecast(barometer);
        barometer.registerObserver(weatherForecast);

        barometer.simulatePressureChange();
    }
}
