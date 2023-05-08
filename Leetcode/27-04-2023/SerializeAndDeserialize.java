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
public class SerializeAndDeserialize {

    int i = 0;

    public void serializeHelper(TreeNode root, StringBuilder sb){
        //We will process the tree using preorder traversal
        if(root == null){
            sb.append("null,");
            return;
        }

        //if a node does not have the left/right child we will denote it by null in our string

        sb.append(root.val +",");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return deserializeHelper(arr);
    }

    public TreeNode deserializeHelper(String[] arr){
        if(i >= arr.length || arr[i] == "null"){
            i++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(arr[i]));
        i++;
        node.left = deserializeHelper(arr);
        node.right = deserializeHelper(arr);
        return node;
    }


    
}
