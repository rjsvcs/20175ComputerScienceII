import java.util.HashSet;
import java.util.Set;

public class UberDriver {

    private boolean arrived;

    private final Set<UberDriverObserver> observers;

    public UberDriver() {
        arrived = false;
        this.observers = new HashSet<>();
    }

    void addObserver(UberDriverObserver observer) {
        observers.add(observer);
    }

    void removeObserver(UberDriverObserver observer) {
        observers.remove(observer);
    }

    void startDriving() {
        arrived = false;
        for(UberDriverObserver observer : observers) {
            observer.startedDriving(this);
        }
    }

    void stopDriving() {
        arrived = true;
        for(UberDriverObserver observer : observers) {
            observer.stoppedDriving(this);
        }
    }


    boolean hasArrived() {
        return arrived;
    }
}
