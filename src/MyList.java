import java.util.Comparator;

public interface MyList<T> extends Iterable<T> {
    void add(T item);
    void add(int index, T item);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);
    T getFirst();
    T getLast();
    T remove(int index);
    T removeFirst(); // T қайтарады
    void removeLast();
    void sort();
    int indexOf(Object object);
    int lastIndexOf(Object object);
    boolean exists(Object object);
    Object[] toArray();
    void clear();
    int size();
}