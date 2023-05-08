import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

public class DuplicateSubTrees {

    HashMap<String, Integer> hm = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
        //traverse the tree using inorder traversal
        getSubtreeString(root);
        return result;

    }

    public String getSubtreeString(TreeNode root){
        if(root == null){
            return "NULL";
        }

        String ans = String.valueOf(root.val) + "," + getSubtreeString(root.left) + getSubtreeString(root.right);
        //check if the map contains the substring or not
        if(hm.containsKey(ans)){
            //The subtree is a duplicate
            if(hm.get(ans) == 1){
                result.add(root);
            }

            hm.put(ans, hm.get(ans) + 1);
        }

        else{
            hm.put(ans, 1);
        }

        return ans;
    }
    
}
