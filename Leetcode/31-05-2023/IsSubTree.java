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

public class IsSubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //if the subroot is null then return true regardless of the root
        if(subRoot == null){
            return true;
        }
        //if root is null then return false
        if(root == null){
            return false;
        }
        //check if root and subroot are the same true
        if(isSameTree(root, subRoot)){
            return true;
        }
        //check if root's left subtree is subroot tree || root's right subtree is subroot tree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        
    }
    //helper function if the two tree are the same
    private boolean isSameTree(TreeNode root, TreeNode subRoot){
        //if both are null then return true
        if(root == null && subRoot == null){
            return true;
        }

        
        //if both the roots are not null and they contain the same data
        if(root != null && subRoot != null && root.val == subRoot.val){
            //check if their left subtrees and right subtrees are the same
            return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
        }
        //return false if either of them is null and the other one is not
        return false;
    }

    public static void main(String[] args) {
        IsSubTree ist = new IsSubTree();
        System.out.println("Testing out the first test case");
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(2);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(1);
        TreeNode t8 = new TreeNode(2);
        t6.left = t7;
        t6.right = t8;
        System.out.println("Is the 2nd tree a subtree of the first tree: " +ist.isSubtree(t1, t6));

        System.out.println("Testing out the second test case");
        TreeNode t9 = new TreeNode(3);
        TreeNode t10 = new TreeNode(4);
        TreeNode t11 = new TreeNode(5);
        TreeNode t12 = new TreeNode(1);
        TreeNode t13 = new TreeNode(2);
        TreeNode t14 = new TreeNode(0);
        t9.left = t10;
        t9.right = t11;
        t10.left = t12;
        t10.right = t13;
        t13.left = t14;

        TreeNode t15 = new TreeNode(4);
        TreeNode t16 = new TreeNode(1);
        TreeNode t17 = new TreeNode(2);
        t15.left = t16;
        t15.right = t17;

        System.out.println("Is the 2nd tree a subtree of the first tree: " +ist.isSubtree(t9, t15));




    }
}
