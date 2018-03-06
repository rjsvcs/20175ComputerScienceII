import java.util.ArrayList;

public class ArrayListTest {


    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>(1000);


        Thread[] threads = new Thread[4];
        for(int i=0; i<threads.length; i++) {
            Adder adder = new Adder(list);
            threads[i] = new Thread(adder);
            threads[i].start();
        }

        for(Thread thread : threads) {
            thread.join();
        }

        System.out.println(list.size());

    }


    private static class Adder implements Runnable {

        private final ArrayList<Integer> list;

        private Adder(ArrayList<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            for(int i=0; i<1000; i++) {
                synchronized (list) {
                    list.add(i);
                }
            }
        }
    }

}
