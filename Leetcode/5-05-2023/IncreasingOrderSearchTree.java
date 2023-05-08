import java.util.ArrayList;

public class IncreasingOrderSearchTree {

    ArrayList<TreeNode> nodes = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        //ADD the nodes in the inorder way in the increasing sequence
        addInorderNodes(root);
        //start constructing the tree
        //The loop will end at the second last node
        for(int i = 0; i < nodes.size() -1; i++){
            nodes.get(i).right = nodes.get(i + 1);
            nodes.get(i).left = null;
        }
        //for the last node make its left and right child as null
        nodes.get(nodes.size() - 1).right = null;
        nodes.get(nodes.size() - 1).left = null;
        return nodes.get(0);

    }

    public void addInorderNodes(TreeNode root){
        if(root == null) return;
        addInorderNodes(root.left);
        nodes.add(root);
        addInorderNodes(root.right);

    }
    
}
