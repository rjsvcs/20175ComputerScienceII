public class ImplementsRunnable implements Runnable {
    private final String name;

    ImplementsRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(name + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(new ImplementsRunnable("one"));
        one.start();

        ImplementsRunnable twoRunnable = new ImplementsRunnable("two");
        Thread two = new Thread(twoRunnable);
        two.start();

        one.join();
        two.join();


        for (int i=0; i<10; i++) {
            System.out.println("main " + i);
        }

    }
}
