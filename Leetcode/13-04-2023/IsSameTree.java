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

public class IsSameTree {
    //The tree has to be structurally similar
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //base case
        if(p == null && q == null) return true;
        else if (p == null) return false;
        else if(q == null) return false;
        else{
            if(p.val != q.val)return false;
            else{
                // for tree to be same all the 3 conditions should be met
                boolean left = isSameTree(p.left, q.left);
                boolean right = isSameTree(p.right, q.right);
                if(left == true && right == true) return true;
                else return false;
            }
            
            
        }
    }
}
