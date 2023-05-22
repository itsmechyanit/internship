import java.util.ArrayList;
import java.util.List;

class TreeNode{
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

public class BinaryTreePath {

    public List<String> binaryTreePaths(TreeNode root) {
        //output will hold all the root to leaf paths
        //We will use recursion to traverse the binary tee
        List<String> output = new ArrayList<String>();
        dfs(root, output, "");
        return output;
        
    }

    private void dfs(TreeNode current, List<String>output, String path){
        //if the current node is null then simply add the path to the output list
        if(current == null){
            output.add(path);
            return;
        }
        //if the current node is a leaf node
         if(current.left == null && current.right == null){
            //add the current's node value to the path and then add it to the output list
             output.add(path + String.valueOf(current.val));
             return;
        }

        //if the current node has a left child

        if(current.left != null){
            //call the function recursively on the left subtree
            dfs(current.left, output, path + String.valueOf(current.val) + "->");

        }

        //if the current node has a right child

         if(current.right != null){
            //call the function recursively on the right subtree
            dfs(current.right, output, path + String.valueOf(current.val) + "->");

        }

     }

     public static void main(String[] args) {
        BinaryTreePath btp = new BinaryTreePath();
        System.out.println("Testing out the first test case");
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(3);
        TreeNode t14 = new TreeNode(5);
        t11.left = t12;
        t11.right = t13;
        t12.right = t14;

        List<String> ans1 = btp.binaryTreePaths(t11);
        System.out.println("Here are all the root to leaf paths "+ans1);
        System.out.println("Testing out the Second test case");
        TreeNode t21 = new TreeNode(1);

        List<String> ans2 = btp.binaryTreePaths(t21);
        System.out.println("Here are all the root to leaf paths " +ans2);



     }
    
}
