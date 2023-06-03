import java.util.ArrayList;

class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        //ArrayList will hold the result
        ArrayList<String> res = new ArrayList<>();

        tree2strHelper(root, res);

        String finalAnswer = "";

        for(int i = 0; i < res.size(); i++){
            finalAnswer = finalAnswer + res.get(i);
        }
        //This is done to remove the first opening and the last closing bracket
        return finalAnswer.substring(1, finalAnswer.length() - 1);


    }

    private void tree2strHelper(TreeNode root, ArrayList<String> res){
        //base case
        if(root == null){
            return;
        }
        //process the tree using the preorder traversal
        res.add("(");
        res.add(String.valueOf(root.val));
        //if the left child is null then we insert the ()
        //We will omit the parenthesis if the right child is null
        if(root.left == null && root.right != null){
            res.add("()");
        }
        //recursive call on the left sub tree
        tree2strHelper(root.left, res);
        //recursilvely call on the right sub tree
        tree2strHelper(root.right, res );
        //add the closing parenthesis
        //keep in mind this will also add the parenthesis around the root also
        //which we need to remove using the technique finalAnswer.substring(1, finalAnswer.length() - 1)
        res.add(")");
    }

    public static void main(String[] args) {
        ConstructStringFromBinaryTree cbt = new ConstructStringFromBinaryTree();
        System.out.println("Testing the first test case");
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(3);
        TreeNode t14 = new TreeNode(4);
        t11.left = t12;
        t11.right = t13;
        t12.left = t14;
        System.out.println("Constructing string from the binary tree " + cbt.tree2str(t11));

        System.out.println("Testing the second test case");


        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(2);
        TreeNode t23 = new TreeNode(3);
        TreeNode t24 = new TreeNode(4);
        t21.left = t22;
        t21.right = t23;
        t22.right = t24;
        System.out.println("Constructing string from the binary tree " + cbt.tree2str(t21));

        
    }
}
