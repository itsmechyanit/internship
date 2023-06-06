import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePruning {

     //This is used to display the result exactly as Leetcode
     ArrayList<Integer> values = new ArrayList<>();

    //This question boils down to finding out the total no of 1's in the left subtree and right subtree
    int pruneTreeHelper(TreeNode root){
        //base case
        if(root==null){
            return 0;
        }
        //get the total no of ones in the left subtree
        int leftNumberOfOnes = pruneTreeHelper(root.left);
        //get the total no of ones in the right subtree
        int rightNumberOfOnes = pruneTreeHelper(root.right);
        //if the no of ones is zero then remove the left subtree
        if(leftNumberOfOnes == 0){
            root.left = null;
        }
        //if the number of ones is zero then remove the right subtree
        if(rightNumberOfOnes == 0){
            root.right = null;
        }
        //return the total no of ones
        return leftNumberOfOnes + rightNumberOfOnes + (root.val == 1 ? 1:0);
    }
    public TreeNode pruneTree(TreeNode root) {
        //if the total no of ones is zero then return null
        if(pruneTreeHelper(root) == 0){
            return null;
        }
        //return root
        return root;
    }

    private void levelOrderTraversal(TreeNode root){
        //We are traversing the tree in the lvelorderstyle
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return;
        q.add(root);
        while(!q.isEmpty()){
            
            TreeNode current = q.poll();
            if(current == null){
                values.add(null);
                continue;
            }
            values.add(current.val);
           
            q.add(current.left);
            q.add(current.right);
        }
        //This is used to remove the extra null values at the end
        int k = values.size() -1;
        while(k >= 0 && values.get(k) == null){
            values.remove(k);
            k--;
        }
    }

    public static void main(String[] args) {
        BinaryTreePruning btp1 = new BinaryTreePruning();
        System.out.println("Testing out the first test case");
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(0);
        TreeNode t13 = new TreeNode(0);
        TreeNode t14 = new TreeNode(1);
        t11.right = t12;
        t12.left = t13;
        t12.right = t14;
        TreeNode ans1 = btp1.pruneTree(t11);
        btp1.levelOrderTraversal(ans1);
        System.out.println("here is the pruned tree: " + btp1.values);
        BinaryTreePruning btp2 = new BinaryTreePruning();
        System.out.println("Testing out the Second test case");
        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(0);
        TreeNode t23 = new TreeNode(1);
        TreeNode t24 = new TreeNode(0);
        TreeNode t25 = new TreeNode(0);
        TreeNode t26 = new TreeNode(0);
        TreeNode t27 = new TreeNode(1);
        t21.left = t22;
        t21.right = t23;
        t22.left = t24;
        t22.right = t25;
        t23.left = t26;
        t23.right = t27;
        TreeNode ans2 = btp1.pruneTree(t21);
        btp2.levelOrderTraversal(ans2);
        System.out.println("here is the pruned tree: " + btp2.values);



        


    }
}
