

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
 
public class DeleteNode {
    public void deleteNode(ListNode node) {

        //This is the most optimal solution
        //1 ->2 -> 5 ->7 suppose the node to be deleted is 2
        //1 ->5->5->7 shift the next node's value to the current(the node to be deleted)
        //Now this questions boild down to deleting the second 5

        ListNode current = node;
        current.val = current.next.val;
        current.next = current.next.next;
       
        
    }
}
