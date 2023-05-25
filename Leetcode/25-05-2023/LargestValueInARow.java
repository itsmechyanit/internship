import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;


 
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
public class LargestValueInARow {
    //We will be solving this problem using BFS
    public List<Integer> largestValues(TreeNode root){
        //we will be storing the max value of each row in ans
        List<Integer> ans = new ArrayList<>();
        //if the tree is empty do nothing
        if(root == null) return ans;
        //maintain a queue 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            //process each level
            int size = q.size();
            int maxVal = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                //if the current node's value is greater than the max value then update the max value
                if(curr.val > maxVal){
                    maxVal = curr.val;
                }
                //insert the left child in the queue
                if(curr.left != null){
                    q.add(curr.left);
                }
                //insert the right child in the queue
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            //add the max value of each row in the ans
            ans.add(maxVal);

        }

        return ans;
        
    }

    public static void main(String[] args) {
        LargestValueInARow lvr = new LargestValueInARow();
        System.out.println("Testing the first test case");
        TreeNode n11 = new TreeNode(1);
        TreeNode n12 = new TreeNode(2);
        TreeNode n13 = new TreeNode(3);
        TreeNode n14 = new TreeNode(9);
        TreeNode n15 = new TreeNode(5);
        TreeNode n16= new TreeNode(3);
        n11.left = n13;
        n11.right = n12;
        n12.right = n14;
        n13.left= n15;
        n13.right = n16;
        System.out.println("The largest value in each row is "+lvr.largestValues(n11));
        System.out.println("Testing the Second test case");
        TreeNode n21 = new TreeNode(1);
        TreeNode n22 = new TreeNode(2);
        TreeNode n23 = new TreeNode(3);
        n21.left = n22;
        n21.right = n23;
        System.out.println("The largest value in each row is "+lvr.largestValues(n21));


    }
    
}
