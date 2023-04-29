import java.util.Deque;
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
 
class Pair{
    TreeNode node;
    int pos;
    Pair(TreeNode node, int pos){
        this.node = node;
        this.pos = pos;
    }
}
public class WidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int maxWidth = 1;
        Deque<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            int count = q.size();
            int start = q.getFirst().pos;
            int end = q.getLast().pos;
            
            maxWidth = max(maxWidth, end - start + 1);
            for(int i = 0; i < count; i++){
                
                Pair curr = q.getFirst();
                int p = curr.pos;
                TreeNode currentNode = curr.node;
                q.pollFirst();
                if(currentNode.left != null){
                    Pair t = new Pair(currentNode.left, 2 *p + 1);
                    q.add(t);
                }

                if(currentNode.right != null){
                    Pair t = new Pair(currentNode.right, 2 *p + 2);
                    q.add(t);
                }


            }
           
            

           

        }

        return maxWidth;

    }

    private int max(int a, int b){
        return a >=b ? a :b;
    }
}
