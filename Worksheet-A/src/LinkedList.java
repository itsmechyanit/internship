import java.util.Scanner;

public class LinkedList {

    Element head;
    Element tail;
    int size;

    void createLinkedList(String value) {
        String[] values = value.strip().split(" ");

        for (String ele : values)
            this.insert(Integer.parseInt(ele));
    }

    static class Element {
        Element next;
        int data;

        Element(int val) {
            this.next = null;
            this.data = val;
        }
    }

    void insert(int val) {
        Element node = new Element(val);
        if (head == null) {
            head = node;
            tail = node;
        }

        else {
            tail.next = node;
            tail = node;
        }
        this.size++;
    }

    static Element insertInSorted(LinkedList sortedList, int value) {
        Element node = new Element(value);
        if (sortedList.head == null) {
            sortedList.insert(value);
        }

        else if (sortedList.head.data >= value) {
            node.next = sortedList.head;
            sortedList.head = node;
            sortedList.size++;
        }

        else {
            Element current = sortedList.head;
            Element previous = null;

            while (current != null && current.data < value) {
                previous = current;
                current = current.next;
            }

            if (current == null) {
                previous.next = node;
                sortedList.tail = node;
                sortedList.size++;
            }

            else {
                previous.next = node;
                node.next = current;
                sortedList.size++;
            }

        }

        return sortedList.head;

    }

    void print() {
        Element current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        System.out.println("We will be creating a sorted linked list");
        System.out.println("Please enter the elements in a sorted order");
        String elems = sc.nextLine();
        ll.createLinkedList(elems);
        System.out.println("Printing the sorted Linked List");
        ll.print();
        System.out.println("Please enter a value that you want to insert into the sorted list");
        int val = sc.nextInt();
        insertInSorted(ll, val);
        System.out.println("Printing the sorted Linked List");
        ll.print();
        sc.close();

    }

}
