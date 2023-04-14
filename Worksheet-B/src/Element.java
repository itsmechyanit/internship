public class Element<T> {

    T data;
    Element<T> next;

    Element(T value) {
        data = value;
        next = null;
    }

}

