public abstract class OrderedCollection<E> {

    protected E[] array;
    protected int insertAt;
    protected int size;

    public OrderedCollection(int size) {
        array = (E[])new Object[size];
        insertAt = 0;
        size = 0;
    }

    public void add(E obj) {
        array[insertAt] = obj;
        insertAt = insertAt + 1;
        size = size + 1;
    }

    public abstract E next();

    @Override
    public String toString() {
        return "An Ordered Collection";
    }

}
