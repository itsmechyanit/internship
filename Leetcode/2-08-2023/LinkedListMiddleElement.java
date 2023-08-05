 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class LinkedListMiddleElement {
    //This is the most optimized solution
    //This is based on the cycle detection technique by floyd
    int getMiddle(Node head)
    {
         // Your code here.
         //By the time the fastPointer finishes traversal the slow pointer would be at the middle of the linked list
         Node slowPointer = head;
         Node fastPointer = head;
         while(fastPointer != null && fastPointer.next != null){
            //The fastPointer travels at twice the speed
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
         }

         return slowPointer.data;
         
    }

    public static void main(String[] args) {
        LinkedListMiddleElement lme = new LinkedListMiddleElement();
        System.out.println("Testing the first test case");
        Node n11 = new Node(1);
        Node n12 = new Node(2);
        Node n13 = new Node(3);
        Node n14 = new Node(4);
        Node n15 = new Node(5);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        System.out.println("The middle of the linked list is: " +lme.getMiddle(n11));
        System.out.println("Testing the second test case");
        Node n21 = new Node(2);
        Node n22 = new Node(4);
        Node n23 = new Node(6);
        Node n24 = new Node(7);
        Node n25 = new Node(5);
        Node n26 = new Node(1);
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;
        n25.next = n26;
        System.out.println("The middle of the linked list is: " +lme.getMiddle(n21));
    }
}
