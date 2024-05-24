class WeatherForecast implements Observer {

    private float pressure;
    private boolean forecastDisplayed;

    public WeatherForecast(Subject subject) {
        subject.registerObserver(this);
        this.pressure = subject.getPressure();
    }

    @Override
    public void update(float pressure) {
        if (!forecastDisplayed) {
            forecastDisplayed = true;
            displayWeatherForecast();
        }
        this.pressure = pressure;
    }

    private void displayWeatherForecast() {
        if (pressure < 1013) {
            System.out.println("Pogoda prawdopodobnie się pogorszy.");
        } else if (pressure > 1016) {
            System.out.println("Pogoda prawdopodobnie się poprawi.");
        } else {
            System.out.println("Nie ma znaczących zmian w pogodzie.");
        }
    }
}