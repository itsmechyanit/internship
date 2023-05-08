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

public class IsUnivalTree {

    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        //check if left subtree is unival
        boolean left = isUnivalTree(root.left);
        //check if right subtree is unival
        boolean right = isUnivalTree(root.right);
        
        //if both are unival
        if(left && right){
            //check if value of the root is equal to the value of the left subtree's root and right subtree's root
            if(root.left != null && root.right != null){
                if(root.val == root.left.val && root.val == root.right.val){
                    return true;
                }
                else{
                    return false;
                }
            }
            //if the tree does not have the right subtree
            else if(root.left != null){
                if(root.val == root.left.val){
                    return true;
                }
                
                else{
                    return false;
                }
            }

            //if the tree does not have the left subtree
            
              else if(root.right != null){
                if(root.val == root.right.val){
                    return true;
                }
                
                else{
                    return false;
                }
            }
            
            else{
                return true;
            }
        }
        
        else{
            return false;
        }
    }
    
}
