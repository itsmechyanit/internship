class TreeNode{
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

public class SumNumbers {
    //num will hold the current sum
    public int sumNumbers(TreeNode root) {
        return getSum(root, 0);
        
    }

    private int getSum(TreeNode current, int num){
        //base case
        if(current == null){
            return 0;
        }
        //add the nodes value to the current sum
        num = num*10 + current.val;
        //if it is a leaf node then return the current num
        if(current.left == null && current.right == null){
            return num;
        }
        //Traverse the tree using preorder traversal
        return getSum(current.left, num) + getSum(current.right, num);

        
    }

    public static void main(String[] args) {
        SumNumbers sn = new SumNumbers();
        System.out.println("Testing out the first test case");
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(3);
        t11.left = t12;
        t11.right = t13;
        System.out.println("The total sum of all root-to-leaf numbers "+sn.sumNumbers(t11));

        System.out.println("Testing out the Second test case");
        TreeNode t21 = new TreeNode(4);
        TreeNode t22 = new TreeNode(9);
        TreeNode t23 = new TreeNode(0);
        TreeNode t24 = new TreeNode(5);
        TreeNode t25 = new TreeNode(1);
        t21.left = t22;
        t21.right = t23;
        t22.left = t24;
        t22.right = t25;
        System.out.println("The total sum of all root-to-leaf numbers "+sn.sumNumbers(t21));


    }


    
}
