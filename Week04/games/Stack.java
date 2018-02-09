public class Stack extends OrderedCollection {
    public Stack(int capacity) {
        super(capacity);
    }

    @Override
    public Object next() {
        insertAt = insertAt - 1;
        Object next = array[insertAt];
        array[insertAt] = null;
        size = size - 1;
        return next;
    }

    public static void main(String[] args) {
        OrderedCollection ogoc = new Stack(10);

        while(ogoc.getSize() < ogoc.array.length) {
            ogoc.add(ogoc.size);
        }

        while(ogoc.size > 0) {
            System.out.println(ogoc.next());
        }

    }

}
