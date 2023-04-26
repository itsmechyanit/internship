import java.util.HashSet;
import java.util.Set;
class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
             val = x;
             next = null;
        }
     }
    

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){

        Set<ListNode> s = new HashSet<>();
        ListNode currentA = headA;
        ListNode currentB = headB;
        //iterate all the nodes of first List and store it in a set data structure
        while(currentA != null){
            s.add(currentA);
            currentA = currentA.next;
        }
        //iterate all the nodes of the second list and check if the node is present in the set
         while(currentB != null){
            if(s.contains(currentB)) return currentB;
            currentB = currentB.next;
        }

        return null;

    }
}


