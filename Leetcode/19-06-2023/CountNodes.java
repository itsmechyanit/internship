class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}


public class CountNodes {
    


    public static int getCount(Node head)
    {
        
        //Code here
        Node current = head;
        int len = 0;
        //Traverse the entire linkedList
        while(current != null){
            //increment the length by 1
            len++;
            current = current.next;
        }
        //return len
        return len;
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
        System.out.println("The length of the linked list is: " +getCount(n11));
        System.out.println("Testing the second test case");
        Node n21 = new Node(2);
        Node n22 = new Node(4);
        Node n23 = new Node(6);
        Node n24 = new Node(7);
        Node n25 = new Node(5);
        Node n26 = new Node(1);
        Node n27 = new Node(0);
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;
        n25.next = n26;
        n26.next = n27;
        System.out.println("The length of the linked list is: " +getCount(n21));
    }
    
}
