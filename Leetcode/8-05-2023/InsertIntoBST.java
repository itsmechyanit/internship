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


public class InsertIntoBST {
    public TreeNode insertIntoBSTHelper(TreeNode root, TreeNode node){
        //if the root is null then node is the first element in the tree
        if(root == null){
            return node;
        }

        
        else if(root.val > node.val){
            //insert the node in the leftSubTree
            TreeNode leftChild = insertIntoBSTHelper(root.left, node);
            root.left = leftChild;
            return root;
        }
        
        else{
            //insert the node in the right subtree
            TreeNode rightChild = insertIntoBSTHelper(root.right, node);
            root.right = rightChild;
            return root;
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //create a new TreeNode
        TreeNode newNode = new TreeNode(val);
        return insertIntoBSTHelper(root, newNode);
        
        
    }
}
