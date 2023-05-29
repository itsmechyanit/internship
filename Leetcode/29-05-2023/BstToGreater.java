import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    

public class BstToGreater {

    int sum = 0;
    //This is used to display the result exactly as Leetcode
    ArrayList<Integer> values = new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
       
        convertBSTHelper(root);
        return root;
    }

    private void convertBSTHelper(TreeNode root){
        if(root == null){
            return;
        }

        //find the rightmodt node with the highest value
        //basically we are traversing the tree in the reverse in order style
        convertBSTHelper(root.right);

        sum = sum + root.val;

        root.val = sum;

        
        
        convertBSTHelper(root.left);

    }

   
    //This function is used to display the result in the leetcode style
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
        System.out.println("Testing out the first TestCase");
        BstToGreater bg1 = new BstToGreater();
        TreeNode t11 = new TreeNode(4);
        TreeNode t12 = new TreeNode(1);
        TreeNode t13 = new TreeNode(6);
        TreeNode t14 = new TreeNode(0);
        TreeNode t15 = new TreeNode(2);
        TreeNode t16 = new TreeNode(5);
        TreeNode t17 = new TreeNode(7);
        TreeNode t18 = new TreeNode(3);
        TreeNode t19 = new TreeNode(8);
        t11.left = t12;
        t11.right = t13;
        t12.left = t14;
        t12.right = t15;
        t13.left = t16;
        t13.right = t17;
        t15.right = t18;
        t17.right = t19;
        bg1.convertBST(t11);
        bg1.levelOrderTraversal(t11);
        System.out.println("here is the output: " + bg1.values);
        System.out.println("Testing out the Second TestCase");
        BstToGreater bg2 = new BstToGreater();
        TreeNode t21 = new TreeNode(0);
        TreeNode t22 = new TreeNode(1);
        t21.right = t22;
        bg2.convertBST(t21);
        bg2.levelOrderTraversal(t21);
        System.out.println("here is the output: " + bg2.values);



    }
    
}
