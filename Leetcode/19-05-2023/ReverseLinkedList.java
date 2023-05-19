
 class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //if the linkedList is Empty we do nothing
        if(head == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        //Traverse until the end of the linked List
        while(curr != null){
            //store the next of current in a temp variable
            ListNode temp = curr.next;
            //make the next of current point to the previous
            curr.next = prev;
            //update previous to current
            prev = curr;
            //update current to point to the temp
            curr = temp;
        }
        //return prev which will be the head of the reversed linked list
        return prev;
        
    }

    public static void main(String[] args) {
        ReverseLinkedList rll = new ReverseLinkedList();
        System.out.println("Testing the first test case");
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        ListNode l14 = new ListNode(4);
        ListNode l15 = new ListNode(5);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        l15.next = null;
        ListNode revHead1 = rll.reverseList(l11);
        ListNode current1 = revHead1;
        System.out.println("printing the rev linked list");
        while(current1!= null){
            System.out.print(current1.val + " ");
            current1 = current1.next;
        }

        System.out.println("Testing the Second test case");

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(2);
        l21.next = l22;
        l22.next = null;

        ListNode revHead2 = rll.reverseList(l21);
        ListNode current2 = revHead2;

        System.out.println("printing the rev linked list");
        while(current2!= null){
            System.out.print(current2.val + " ");
            current2 = current2.next;
        }
        

    }
}
