public class WeatherStatistics implements Observer, DisplayElement {
    private float maxTemperature = Float.NEGATIVE_INFINITY;
    private float minTemperature = Float.POSITIVE_INFINITY;
    private float temperatureSum = 0;
    private int numReadings = 0;
    private Subject weatherData;

    public WeatherStatistics(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature) {
        temperatureSum += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        float averageTemperature = temperatureSum / numReadings;
        System.out.println("Temperatura średnia/maksymalna/minimalna = " + averageTemperature + "/" + maxTemperature + "/" + minTemperature);
    }
}