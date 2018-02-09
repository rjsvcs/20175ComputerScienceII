public class Queue<E> extends OrderedCollection<E> {

    private int dequeueFrom;


    public Queue(int size) {
        super(size);
        dequeueFrom = 0;
    }

    @Override
    public E next() {
        E next = array[dequeueFrom];
        dequeueFrom = dequeueFrom + 1;
        size = size - 1;
        return next;
    }

    @Override
    public String toString() {
        return "A Queue";
    }
}
