public class ExtendsThread extends Thread {

    private final String name;

    ExtendsThread(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(name + " " + i);
        }
    }


    public static void main(String[] args) {
        new ExtendsThread("one").start();
        new ExtendsThread("two").start();

        for(int i=0; i<10; i++) {
            System.out.println("main " + i);
        }
    }

}
