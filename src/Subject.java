import java.util.ArrayList;
import java.util.List;
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private float pressure;

    void registerObserver(Observer observer) {
        observers.add(observer);
    }

    void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(pressure);
        }
    }

    void setPressure(float pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    float getPressure() {
        return pressure;
    }
}
