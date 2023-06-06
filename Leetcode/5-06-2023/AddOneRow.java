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



public class AddOneRow {
    //This is used to display the result exactly as Leetcode
    ArrayList<Integer> values = new ArrayList<>();
    //We will solve this problem using BFS traversal
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        //Edge case when the root itself needs to be replaced
        if(d == 1){
            TreeNode newNode = new TreeNode(v);
            newNode.left = root;
            return newNode;
        }
        //Queue to store the treenodes
        Queue<TreeNode> qu = new LinkedList<>();
        //We will reduce the depth value by 1 since we are interested in storing the parent nodes of a particular depth
        d = d-1;
        //add root to the queue
        qu.offer(root);
        int level = 1;
        //iterate until we only have nodes that we are interested in the queue i.e the parent nodes of a particular depth
        while(level != d){
            int size = qu.size();
            level++;
            while(size > 0){
                TreeNode head =qu.poll();
                if(head.left!=null){
                    qu.offer(head.left);
                }
                if(head.right!=null){
                    qu.offer(head.right);
                }
                size--;
            }
        }
        //process the parent nodes at a particular depth
        while(!qu.isEmpty()){
            TreeNode head = qu.poll();
            //get the leftchild reference of a current node
            TreeNode leftChild = head.left;
            //get a rightchild reference of a current node
            TreeNode rightChild = head.right;
            //create the new left and right child nodes
            TreeNode newLeft = new TreeNode(v);
            TreeNode newRight = new TreeNode(v);
            //make the current node's left child point to the newly created node
            head.left = newLeft;
            //make the current node's right child point to the newly created node
            head.right = newRight;
            //make the new node's left child point to the current node's previous left child
            newLeft.left = leftChild;
            ///make the new node's right child point to the current node's previous right child
            newRight.right = rightChild;
        }
        //return root
        return root;
    }

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
        AddOneRow aor1 = new AddOneRow();
        System.out.println("Testing out the first test case");
        TreeNode t11 = new TreeNode(4);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(6);
        TreeNode t14 = new TreeNode(3);
        TreeNode t15 = new TreeNode(1);
        TreeNode t16 = new TreeNode(5);
        t11.left = t12;
        t11.right = t13;
        t12.left = t13;
        t12.left = t14;
        t12.right = t15;
        t13.left = t16;
        int depth1 = 2;
        int val1 = 1;

        TreeNode ans1 = aor1.addOneRow(t11, val1, depth1);
        aor1.levelOrderTraversal(ans1);
        System.out.println("Here is the binary tree after adding a row of nodes: " + aor1.values);
        AddOneRow aor2 = new AddOneRow();
        System.out.println("Testing out the second test case");

        TreeNode t21 = new TreeNode(4);
        TreeNode t22 = new TreeNode(2);
        TreeNode t23 = new TreeNode(3);
        TreeNode t24 = new TreeNode(1);
        t21.left = t22;
        t22.left = t23;
        t22.right = t24;
        int val2 = 1;
        int depth2 = 3;
        TreeNode ans2 = aor2.addOneRow(t21, val2, depth2);
        aor2.levelOrderTraversal(ans2);
        System.out.println("Here is the binary tree after adding a row of nodes: " + aor2.values);



    }
}
