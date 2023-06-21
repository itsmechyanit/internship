class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 

public class Add1toLinkedList {
    public static Node addOne(Node head){
        //reverse the linkedList
        Node newHead = reverse(head);
        //999 --->999
        //279--->280
        Node current = newHead;
        int carry = 0;
        //start traversing the reversed LinkedList
        while(current!= null){
            //get the node's value
            int value = current.data;
            //if it is less than 9
            if(value < 9){
                //add one to the value
                current.data = value + 1;
                //reverse the linkedlist
                Node h = reverse(newHead);
                //return the head
                return h;
            }
            //if the value is 9
            else{
                //add 1 to the value
                int total = value + 1;
                //store 0 in the current node
                current.data = total % 10;
                carry = total/10;
                //if we are at the last node and there is a carry
                if(current.next == null && carry == 1){
                    //we will need to create a new node
                    Node newNode = new Node(carry);
                    current.next = newNode;
                    break;
                }
            }

            current = current.next;

            
            
        }

        //finally reverse the linkedList
        Node h = reverse(newHead);
        return h;


        
    }
    //helper function to reverse the linked list
    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        if(head == null) return head;
        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Testing out the first testcase");
        Node n11 = new Node(4);
        Node n12 = new Node(5);
        Node n13 = new Node(6);
        n11.next = n12;
        n12.next = n13;
        Node h1 = addOne(n11);
        System.out.println("Adding one to the linkedList gives us");
        printList(h1);
        System.out.println("Testing out the Second testcase");
        Node n21 = new Node(1);
        Node n22 = new Node(2);
        Node n23 = new Node(3);
        n21.next = n22;
        n22.next = n23;
        Node h2 = addOne(n21);
        System.out.println("Adding one to the linkedList gives us");
        printList(h2);



    }
}
