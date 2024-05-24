class Barometer extends Subject {
    private float pressure;

    public void simulatePressureChange() {
        float minPressure = 960.2f; // najniższe ciśnienie atmosferyczne odnotowane w Polsce
        float maxPressure = 1054.0f; // najwyższe ciśnienie atmosferyczne odnotowane w Polsce
        float newPressure = minPressure + (float) (Math.random() * (maxPressure - minPressure));
        setPressure(newPressure);
    }
}