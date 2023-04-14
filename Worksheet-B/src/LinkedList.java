public class LinkedList<T> {

    Element<T> head;
    Element<T> tail;
    int size;

    void insert(T value) {
        Element<T> node = new Element<T>(value);
        if (head == null) {
            head = node;
            tail = node;
        }

        else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    T delete() {
        T ans = null;
        if (head == null)
            return ans;
        Element<T> current = head;
        if (head.next == null) {
            ans = head.data;
            head = null;
            tail = null;
            size--;
            return ans;
        }

        else if (head.next.next == null) {
            ans = tail.data;
            head.next = null;
            tail = head;
            size--;
            return ans;

        } else {
            while (current.next != tail) {
                current = current.next;
            }
            ans = tail.data;
            current.next = null;
            tail = current;
            size--;
            return ans;
        }

    }

    T deleteFirst() {
        Element<T> temp = head;
        Element<T> newHead = head.next;
        head.next = null;
        head = newHead;
        size--;
        return temp.data;

    }

    boolean search(T value) {
        if (size == 0)
            return false;
        Element<T> current = head;
        while (current != null) {
            if (current.data == value)
                return true;
            current = current.next;
        }
        return false;
    }

    void print() {
        if (size == 0)
            return;
        else if (size == 1)
            System.out.println(head.data + " ");
        else {
            Element<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}

