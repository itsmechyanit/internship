
class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class AddTwoNumbers{

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //We start with a dummy node
        ListNode ans = new ListNode();

        int carry = 0;
        ListNode head = ans;
        //iterate over both the linked list
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum/10;
            ans.next = new ListNode(sum % 10);
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        //if there are still elements present in l1
        while(l1 != null){
             int sum = l1.val + carry;
            carry = sum/10;
            ans.next = new ListNode(sum % 10);
            ans = ans.next;
            l1 = l1.next;
            
            
        }

        //if there are elemnts still present in l2

        while(l2 != null){
            int sum = l2.val + carry;
            carry = sum/10;
            ans.next = new ListNode(sum % 10);
            ans = ans.next;
            l2 = l2.next;
            
        }
        //if there is a carry add it 
        if(carry != 0){
            ans.next = new ListNode(carry);
        }
        //We will return the next node and not the first node(head) which was dummy
        return head.next;
    }

    


}