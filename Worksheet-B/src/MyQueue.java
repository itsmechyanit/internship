import java.util.NoSuchElementException;

public class MyQueue<T> {

    LinkedList<T> container = new LinkedList<>();
    

    boolean isEmpty() {
        return container.size == 0;
    }

    T peek() {
        if (container.size == 0) {
            return null;

        }

        return container.head.data;
    }

    void enqueue(T val) {
        container.insert(val);
    }

    T dequeue() {
        if (container.size == 0) {
            throw new NoSuchElementException();

        }

        return container.deleteFirst();
    }

    T poll() {
        if (container.size == 0) {
            return null;

        }

        return container.deleteFirst();
    }

    void print() {
        container.print();
    }

    boolean search(T value) {
        boolean ans = container.search(value);
        return ans;
    }
    
}
