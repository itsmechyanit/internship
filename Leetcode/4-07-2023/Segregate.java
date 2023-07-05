class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class Segregate {
  static Node segregate(Node head)
    {
        // add your code here
        Node current = head;
        //zero holds the count of zeros
        int zero = 0;
        //one holds the count of ones
        int one = 0;
        //tow holds the count of twos
        int two = 0;
        //start iterating over the linked link and count the number of 0's, 1's , 2's
        while(current != null){
            if(current.data == 0){
                zero++;
            }
            
            else if(current.data == 1){
                one++;
            }
            
            else{
                two++;
            }
            
            current = current.next;
        }
        
        current = head;
      //make the first half of the linked list equal to 0
      for(int i = 0; i < zero; i++){
          current.data = 0;
          current = current.next;
      }
      //make the middle half equal to 1
      for(int i = 0; i < one; i++){
          current.data = 1;
          current = current.next;
      }
      //make the last half equal to 2
      for(int i = 0; i < two; i++){
          current.data = 2;
          current = current.next;
      }
      
      return head;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Testing out the first testcase");
        Node n11 = new Node(1);
        Node n12 = new Node(2);
        Node n13 = new Node(2);
        Node n14 = new Node(1);
        Node n15 = new Node(2);
        Node n16 = new Node(0);
        Node n17 = new Node(2);
        Node n18 = new Node(2);

        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n15.next = n16;
        n16.next = n17;
        n17.next = n18;
        Node h1 = segregate(n11);
        System.out.println("segregating the linked list gives us");
        printList(h1);
        System.out.println("Testing out the Second testcase");
        Node n21 = new Node(2);
        Node n22 = new Node(2);
        Node n23 = new Node(0);
        Node n24 = new Node(1);
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        Node h2 = segregate(n21);
        System.out.println("segregating the linked list gives us");
        printList(h2);


  }
}
