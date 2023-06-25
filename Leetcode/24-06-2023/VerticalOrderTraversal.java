import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
}
//custom class to hold the current node and its vertical level in the binary tree
class NodeWithLevel{
    int level;
    Node current;
    NodeWithLevel(Node current, int level){
        this.current = current;
        this.level = level;
    }
}


public class VerticalOrderTraversal {
     static ArrayList <Integer> verticalOrder(Node root)
    {
        //for storing the final ans
        ArrayList<Integer> ans = new ArrayList<>();
        //Queue is used for traversing the binary tree in the level order fashion
        Queue<NodeWithLevel> q = new LinkedList<>();
        //Use tree map so that the keys are sorted
        //use treemap to map the level with the nodes
        TreeMap<Integer, ArrayList<Integer>> hm = new TreeMap();
        //root will have level 0
        NodeWithLevel c = new NodeWithLevel(root, 0);
        q.add(c);
        while(!q.isEmpty()){
            //get the current node with its level
            NodeWithLevel current = q.poll();
            //if the level is present in the hashmap
            if(hm.containsKey(current.level)){
                //add the node to the current lvel
                ArrayList<Integer> nodes = hm.get(current.level);
                nodes.add(current.current.data);
             }
            else{
                ArrayList<Integer> nodes = new ArrayList<>();
                nodes.add(current.current.data);
                hm.put(current.level, nodes);
            }
            //if the current node has a left child then the left child will have a level one less than the current node
            if(current.current.left != null){
               NodeWithLevel temp = new NodeWithLevel(current.current.left, current.level - 1);
               //add the left child to the queue
               q.add(temp);
            }
            //if the current node has a right child then the right child will have a level one more than the current node
            if(current.current.right != null){
               NodeWithLevel temp = new NodeWithLevel(current.current.right, current.level + 1);
               //add the right child to the queue
               q.add(temp);

            }
        }
        //iterate over the treemap and add the nodes to the final answer
        for(Integer level: hm.keySet()){
            ArrayList<Integer> nodes  = hm.get(level);
            for(Integer value:nodes){
                 ans.add(value);
             }
         }

         return ans;



    }

    public static void main(String[] args) {
        System.out.println("Testing out the first test case");
        Node n11 = new Node(1);
        Node n12 = new Node(2);
        Node n13 = new Node(3);
        Node n14 = new Node(4);
        Node n15 = new Node(5);
        Node n16 = new Node(6);
        n11.left = n12;
        n11.right = n13;
        n12.left = n14;
        n12.right = n15;
        n13.right = n16;
        ArrayList<Integer> ans1 = verticalOrder(n11);
        System.out.println("Here is the vertical order traversal of the binary tree");
        for(Integer i:ans1){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("Testing out the second test case");
        Node n21 = new Node(1);
        Node n22 = new Node(2);
        Node n23 = new Node(3);
        Node n24 = new Node(4);
        Node n25 = new Node(5);
        Node n26 = new Node(6);
        Node n27 = new Node(7);
        Node n28 = new Node(8);
        Node n29 = new Node(9);
        n21.left = n22;
        n21.right = n23;
        n22.left = n24;
        n22.right = n25;
        n23.left = n26;
        n23.right = n27;
        n26.right = n28;
        n27.right = n29;
        ArrayList<Integer> ans2 = verticalOrder(n21);
        System.out.println("Here is the vertical order traversal of the binary tree");
        for(Integer i:ans2){
            System.out.print(i +" ");
        }

    }

    
}
