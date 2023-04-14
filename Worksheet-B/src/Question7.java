import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question7 {

    private static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        HashMap<Integer, Node> mapping = new HashMap<>();
        MyQueue<MyPair> q = new MyQueue<>();
        q.enqueue(new MyPair(0, root));

        while(!q.isEmpty()){
            MyPair temp = q.dequeue();
            Node frontNode = temp.node;
            int hd = temp.hd;
            mapping.put(hd, frontNode);
            if(frontNode.LeftChild != null){
                q.enqueue(new MyPair(hd - 1, frontNode.LeftChild));
            }

            if(frontNode.RightChild != null){
                q.enqueue(new MyPair(hd + 1, frontNode.RightChild));
            }

        }

        for(Map.Entry<Integer, Node> entry : mapping.entrySet()){
            ans.add(entry.getValue().data);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now we will be creating a binary tree");
        System.out.println("Please enter the elements in a single line with spaces in between");
        String elems = sc.nextLine();
        String[] elemsArr = elems.split(" ");
        Node root = BinaryTree.createBinaryTree(elemsArr);
        System.out.println("Printing the binary tree");
        BinaryTree.print(root);
        System.out.println("printing the bottom view of the tree");
        ArrayList<Integer> ans = bottomView(root);
        System.out.print(ans);
        sc.close();
    }
    
}
