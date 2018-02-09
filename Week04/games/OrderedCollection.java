public abstract class OrderedCollection {

    protected Object[] array;
    protected int insertAt;
    protected int size;

    public OrderedCollection(int capacity) {
        array = new Object[capacity];
        insertAt = 0;
        size = 0;
    }

    public void add(Object obj) {
        array[insertAt] = obj;
        insertAt = insertAt + 1;
        size = size + 1;

    }

    public abstract Object next();

    public int getSize() {
        return size;
    }
}
