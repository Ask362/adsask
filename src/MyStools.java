public class MyStools<T extends Comparable<? super T>> {
    private MyKelandist<T> list = new MyKelandist<>();

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (list.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (list.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}