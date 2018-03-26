import java.util.Scanner;

public class Customer implements Runnable {

    private final Car car;

    public Customer(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        while(!car.hasArrived()) {
            System.out.println("Waiting for car...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Car has arrived!");
    }

    public static void main(String[] args) {
        Car car = new Car();
        Customer customer = new Customer(car);
        car.startDriving();

        new Thread(customer).start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        car.stopDriving();
    }
}
