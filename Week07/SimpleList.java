public class SimpleList {

    private int size;
    private int[] array;

    public SimpleList(int capacity) {
        array = new int[capacity];

        size = 0;
    }

    public void add(int value) {
        synchronized (array) {
            if (array.length == size) {
                int[] bigger = new int[size * 2];

                System.arraycopy(array, 0, bigger, 0, size);

                array = bigger;
            }

            array[size++] = value;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        SimpleList list = new SimpleList(1000);


        Thread[] threads = new Thread[4];
        for(int i=0; i<threads.length; i++) {
            Adder adder = new Adder(list);
            threads[i] = new Thread(adder);
            threads[i].start();
        }

        for(Thread thread : threads) {
            thread.join();
        }

        System.out.println(list.size);
        for(int i : list.array) {
            System.out.print(i + " ");
        }

    }


    private static class Adder implements Runnable {

        private final SimpleList list;

        private Adder(SimpleList list) {
            this.list = list;
        }

        @Override
        public void run() {
            for(int i=0; i<1000; i++) {
                list.add(i);
            }
        }
    }

}
