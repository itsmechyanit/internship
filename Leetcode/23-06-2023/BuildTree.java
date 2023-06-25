import java.util.HashMap;

class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}
public class BuildTree {
    Node buildTree(int in[], int post[], int n) {
        // Your code here
       //map elements with their indexes
      HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i = 0; i < n; i++){
        hm.put(in[i], i);
       }

       Node root =  solve(in, post, 0, n-1, 0, n -1, hm);
       return root;
    }

    Node solve(int in[], int post[], int inOrderStart, int inOrderEnd, int postOrderStart, int postOrderEnd, HashMap<Integer, Integer> hm ){
        //base case
        if(inOrderStart > inOrderEnd || postOrderStart > postOrderEnd){
            return null;
        }
        //get the root node's value from the postorder array
        int element = post[postOrderEnd];
        //create the root
        Node root = new Node(element);
        //get the index of the root from the inorder array
        int inRoot = hm.get(element);
        //get the number of elements to the left of the root in the inorder array
        int numsLeft = inRoot - inOrderStart;
        
        //make a recursive call to build the left subtree
        root.left = solve(in, post, inOrderStart, inRoot - 1, postOrderStart,postOrderStart + numsLeft - 1,hm);
        //make a recursive call to build the right subtree
        root.right = solve(in,post,inRoot + 1,inOrderEnd, postOrderStart + numsLeft , postOrderEnd -1, hm);
        return root;
    }

    void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data +" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


    public static void main(String[] args) {
        BuildTree bt = new BuildTree();
        System.out.println("Testing out the first test case");
        int[] in1 = {4, 8, 2, 5, 1, 6, 3, 7};
        int[] post1 = {8, 4, 5, 2, 6, 7, 3, 1};
        int N1 = 8;
        Node root1 = bt.buildTree(in1, post1, N1);
        System.out.println("Here is the constructed tree");
        bt.preOrderTraversal(root1);
        System.out.println("Testing out the second test case");
        int[] in2 = {9,5,2,3,4};
        int[] post2 = {5,9,3,4,2};
        int N2 = 5;
        Node root2 = bt.buildTree(in2, post2, N2);
        System.out.println("Here is the constructed tree");
        bt.preOrderTraversal(root2);

    }
}
