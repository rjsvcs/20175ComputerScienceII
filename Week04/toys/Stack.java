public class Stack<Q extends Toy> extends OrderedCollection<Q> {
    public Stack(int size) {
        super(size);
    }

    @Override
    public Q next() {
        insertAt = insertAt - 1;
        Q top = array[insertAt];
        array[insertAt] = null;
        size = size - 1;
        return top;
    }
}
