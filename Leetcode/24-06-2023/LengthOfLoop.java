import javax.sql.rowset.spi.SyncResolver;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class LengthOfLoop {
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        //We will use floyd's technique here
        Node fast = head;
        Node slow = head;
        int len = 1;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //if slow is equal to fast then there is definately a loop
            //if there is a loop then they will meet at the tail
            if(slow == fast){
                Node temp = slow.next;
                while(temp != slow){
                    //increment length by 1 to get the loop length
                    len++;
                    temp = temp.next;
                }
                //break out of the loop
                break;
            }
        }
        //If this condition meets that means there is no loop
        if(fast == null || fast.next == null){
            return 0;
        }

        return len;
    }

    public static void main(String[] args) {
        System.out.println("Testing the first test case");
        Node n11 = new Node(25);
        Node n12 = new Node(14);
        Node n13 = new Node(19);
        Node n14 = new Node(33);
        Node n15 = new Node(10);
        Node n16 = new Node(21);
        Node n17 = new Node(39);
        Node n18 = new Node(90);
        Node n19 = new Node(58);
        Node n10 = new Node(45);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n15.next = n16;
        n16.next = n17;
        n17.next = n18;
        n18.next = n19;
        n19.next = n10;
        n10.next = n14;
        System.out.println("The length of the loop is: " +countNodesinLoop(n11));
        
        System.out.println("Testing the Second test case");
        Node n21 = new Node(1);
        Node n22 = new Node(0);
        n21.next = n22;
        n22.next = n21;
        System.out.println("The length of the loop is: " +countNodesinLoop(n21));
        
    }
}
