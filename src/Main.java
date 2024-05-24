public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherStatistics statisticsDisplay = new WeatherStatistics(weatherData);

        weatherData.setTemperature(15);
        weatherData.setTemperature(20);
        weatherData.setTemperature(25);
        weatherData.setTemperature(30);
        weatherData.setTemperature(35);
    }
}