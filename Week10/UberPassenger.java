import java.util.Scanner;

public class UberPassenger implements UberDriverObserver {

    private final UberDriver driver;

    public UberPassenger(UberDriver driver) {
        this.driver = driver;
        driver.addObserver(this);
    }

    @Override
    public void startedDriving(UberDriver driver) {
        System.out.println("The car is on its way...");
    }

    @Override
    public void stoppedDriving(UberDriver driver) {
        System.out.println("The car is here! Yay!");
        driver.removeObserver(this);
    }

    public static void main(String[] args) {

        UberDriver driver = new UberDriver();
        UberPassenger passenger = new UberPassenger(driver);

        driver.startDriving();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        driver.stopDriving();


        driver.startDriving();

    }

}
