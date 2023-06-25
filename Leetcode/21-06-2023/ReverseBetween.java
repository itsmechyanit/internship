
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

public class ReverseBetween {
    public static Node reverseBetween(Node head, int m, int n)
    {
        //code here
        //Dummy node will come handy when dealing with edge cases
        Node dummy = new Node(0);
        dummy.next = head;
        //represents the node previous to the mth position node
        Node leftM = dummy;
        Node current = head;
        //traverse until the current points to the mth position node
        for(int i = 1; i < m; i++){
            leftM = current;
            current = current.next;
        }

        Node prev = null;
        //reverse the linked list from mth position to the nth position
        for(int i = 1; i <= n -m + 1; i++){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        //connect the reversed linked list to the remaining linked list
        leftM.next.next = current;
        leftM.next = prev;
        return dummy.next;
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
        Node n12 = new Node(7);
        Node n13 = new Node(5);
        Node n14 = new Node(3);
        Node n15 = new Node(9);
        Node n16 = new Node(8);
        Node n17 = new Node(10);
        Node n18 = new Node(2);
        Node n19 = new Node(2);
        Node n10 = new Node(5);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n15.next = n16;
        n16.next = n17;
        n17.next = n18;
        n18.next = n19;
        n19.next = n10; 
        int m1 = 1;
        int n1 = 8;
        Node head1 = reverseBetween(n11, m1, n1);
        System.out.println("Here is the linkedList after reversing the sublist");
        printList(head1);
        System.out.println();
        System.out.println("Testing out the Second test case");
        Node n21 = new Node(1);
        Node n22 = new Node(2);
        Node n23 = new Node(3);
        Node n24 = new Node(4);
        Node n25 = new Node(5);
        Node n26 = new Node(6);
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        n24.next = n25;
        n25.next = n26;
        int m2 = 2;
        int n2 = 4;
        Node head2 = reverseBetween(n21, m2, n2);
        System.out.println("Here is the linkedList after reversing the sublist");
        printList(head2);





    }
}
