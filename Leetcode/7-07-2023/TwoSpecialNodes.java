//custom pair class to hold leaf to leaf Max Sum and Node to leaf Max Sum
class MyPair{
  int llMaxSum = Integer.MIN_VALUE;
  int nlMaxSum = Integer.MIN_VALUE;
}

class TreeNode
{
    int data;
    TreeNode left, right;

    TreeNode(int item)
    {
        data = item;
        left = right = null;
    }
}

public class TwoSpecialNodes {
 int maxPathSum(TreeNode root)
    { 
        // code here 
        MyPair ans = maxPathSumHelper(root);
        return ans.llMaxSum;
    } 

   MyPair maxPathSumHelper(TreeNode root){
    MyPair myAns = new MyPair();
    //base case
    if(root == null){
      return myAns;
    }
    //base case when the current node is a leaf node
    if(root.left == null && root.right == null){
      myAns.nlMaxSum = root.data;
      return myAns;
    }
    //use recursion to get the answer from the left subtree
    MyPair left = maxPathSumHelper(root.left);
    //use recursion to get the answer from the right subtree
    MyPair right = maxPathSumHelper(root.right);
    //get the max Leaf to leaf max sum
    myAns.llMaxSum = Math.max(left.llMaxSum, right.llMaxSum);
    //if the current node has both the left child and the right child
    if(root.left != null && root.right != null){
      myAns.llMaxSum = Math.max(myAns.llMaxSum, left.nlMaxSum + root.data + right.nlMaxSum);
    }
    //update the node to leaf Max Sum
    myAns.nlMaxSum = Math.max(left.nlMaxSum, right.nlMaxSum) + root.data;
    return myAns;
  }

  public static void main(String[] args) {
    TwoSpecialNodes tsp1 = new TwoSpecialNodes();
    System.out.println("Testing out the test case");
    TreeNode t11 = new TreeNode(3);
    TreeNode t12 = new TreeNode(4);
    TreeNode t13 = new TreeNode(5);
    TreeNode t14 = new TreeNode(-10);
    TreeNode t15 = new TreeNode(4);
    t11.left = t12;
    t11.right = t13;
    t12.left = t14;
    t12.right = t15;
    System.out.println("The max path sum between the 2 special node is: " + tsp1.maxPathSum(t11));
    

  }

  
}
