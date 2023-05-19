import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
    public List<Integer> rightSideView(TreeNode root) {
        //We will be following level order traversal and then print the last node's value in that level
        //Queue is used for level order traversal
        Queue<TreeNode> q = new LinkedList<>();
        //ans stores all the last node of a level
        List<Integer> ans = new ArrayList<>();
        //add root to the queue
        q.add(root);
        while(!q.isEmpty()){
            //process each level
            int size = q.size();
            for(int i = 0; i < size; i++){
                //pop out the node
                TreeNode current = q.poll();
                //check if it has left child or not if it does then insert into the queue
                if(current != null && current.left != null){
                    q.add(current.left);
                }
                //check if it has right child or not if it does then insert into the queue
                if(current != null && current.right != null){
                    q.add(current.right);
                }
                //check if the node is the last node of a level
                //if it is then add it to the ans list
                if(current != null && i == size -1){
                    ans.add(current.val);
                }
            }
        }
        //return ans
        return ans;
        
    }

    public static void main(String[] args) {
        RightView rv = new RightView();
        System.out.println("Testing out the first test case");
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(3);
        TreeNode t14 = new TreeNode(4);
        TreeNode t15 = new TreeNode(5);
        t11.left = t12;
        t11.right = t13;
        t12.right = t15;
        t13.right = t14;

        List<Integer> ans1 = rv.rightSideView(t11);
        System.out.println("Printing the right view of the tree " +ans1);

        System.out.println("Testing out the Second test case");
        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(3);
        t21.right = t22;

        List<Integer> ans2 = rv.rightSideView(t21);
        System.out.println("Printing the right view of the tree " +ans2);

        
    }

 
}
