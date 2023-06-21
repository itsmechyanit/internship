 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class LoopDetection {
     public static boolean detectLoop(Node head){
        // Add code here
        //This is based on floyd's cycle detection algorithm
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //if there is no cycle then the fast will become null and we return false
            //if there is a cycle then at some point fast and slow will meet
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
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
        n15.next = n12;
        System.out.println("Is there a cycle in the above linked list: " + detectLoop(n11));
        System.out.println("There is a cycle because the tail is connected to Node 2");
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
        System.out.println("Is there a cycle in the above linked list: " + detectLoop(n21));



    }
}
