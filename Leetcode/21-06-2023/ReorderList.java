public class ReorderList {
    static void reorderlist(Node head) {
        // Your code here
        //The key to solving this problem is to break the entire linked list into 2 halves
        Node slow = head;
        Node fast = head.next;
        //iterate over the array to get a pointer to the start of the second half
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node firstHalf = head;
        Node secondHalf = slow.next;
        slow.next = null;
        Node prev = null;
        //reverse the 2nd half of the linked list
        while(secondHalf != null){
            Node temp = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = temp;
        }
        //secondhalf points to the head of the 2nd half of the list
        secondHalf = prev;
        //manipulate the pointers to get the required linkedlist structure
        while(secondHalf != null){
            Node temp1 = firstHalf.next;
            Node temp2 = secondHalf.next;
            secondHalf.next = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = temp1;
            secondHalf = temp2;

        }
        
    }

     public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing out the first test case");
        Node n11 = new Node(1);
        Node n12 = new Node(2);
        Node n13 = new Node(3);

        n11.next = n12;
        n12.next = n13;
        reorderlist(n11);
        System.out.println("Here is the linkedList after reordering");
        printList(n11);
        System.out.println();
        System.out.println("Testing out the Second test case");
        Node n21 = new Node(1);
        Node n22 = new Node(7);
        Node n23 = new Node(3);
        Node n24 = new Node(4);
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        reorderlist(n21);
        System.out.println("Here is the linkedList after reordering");
        printList(n21);



    }
}
