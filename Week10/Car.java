public class Car {

    private boolean arrived;

    public Car() {
        arrived = false;
    }

    public void startDriving() {
        arrived = false;
    }

    public void stopDriving() {
        arrived = true;
    }

    public boolean hasArrived() {
        return arrived;
    }
}
