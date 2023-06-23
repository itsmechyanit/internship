import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
}

public class InorderTraversal {
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer>ans = new ArrayList<>();
        inOrderHelper(root, ans);
        return ans;
    }
    //helper function for inorder traversal
    //inorder traversal involves Left, Root, Right
     void inOrderHelper(Node current, ArrayList<Integer>ans){
        //base case
        if(current == null){
            return;
        }
        //traverse the left subtree
        inOrderHelper(current.left, ans);
        //traverse the root
        ans.add(current.data);
        //traverse the right subtree
        inOrderHelper(current.right, ans);

    }

    public static void main(String[] args) {
        InorderTraversal it = new InorderTraversal();
        System.out.println("Testing the first testcase");
        Node t11 = new Node(1);
        Node t12 = new Node(2);
        Node t13 = new Node(3);
        
        t11.left = t13;
        t11.right = t12; 
        ArrayList<Integer>ans1 = it.inOrder(t11);
        System.out.println("Here is the inorder traversal");
        for(Integer i : ans1){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Testing the first testcase");
        Node t21 = new Node(10);
        Node t22 = new Node(20);
        Node t23 = new Node(30);
        Node t24 = new Node(40);
        Node t25 = new Node(60);
        Node t26 = new Node(50);
        t21.left = t22;
        t21.right = t23;
        t22.left = t24;
        t22.right = t25;
        t23.left = t26;
        ArrayList<Integer>ans2 = it.inOrder(t21);
        System.out.println("Here is the inorder traversal");
        for(Integer i : ans2){
            System.out.print(i + " ");
        }


    }
}
