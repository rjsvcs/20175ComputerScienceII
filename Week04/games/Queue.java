public class Queue extends OrderedCollection {

    private int dequeueFrom;

    public Queue(int capacity) {
        super(capacity);

        dequeueFrom = 0;
    }

    @Override
    public Object next() {
        Object item = array[dequeueFrom];
        array[dequeueFrom] = null;
        dequeueFrom = dequeueFrom + 1;
        size = size - 1;
        return item;
    }

    public static void main(String[] args) {
        OrderedCollection ogoc = new Queue(10);

        while(ogoc.getSize() < ogoc.array.length) {
            ogoc.add(ogoc.size);
        }

        while(ogoc.size > 0) {
            System.out.println(ogoc.next());
        }

    }
}
