class Node {
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
}

public class Isomorphic {
    boolean isIsomorphic(Node root1, Node root2){
        //if both are null return true
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }

        if(root2 == null){
            return false;
        }
        //if the data of both the root are different return false
        if(root1.data != root2.data){
            return false;
        }
        //Check for cross isomorphic comapring left with right and right with left
        boolean a = isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left);
        //compare left with left and right with right
        boolean b = isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right);
        return a|| b;
    }

    public static void main(String[] args) {
        Isomorphic iso = new Isomorphic();
        System.out.println("Testing the first test case");
        Node t11 = new Node(1);
        Node t12 = new Node(2);
        Node t13 = new Node(3);
        Node t14 = new Node(4);
        Node t15 = new Node(1);
        Node t16 = new Node(2);
        Node t17 = new Node(3);
        Node t18 = new Node(4);
        t11.left = t12;
        t11.right = t13;
        t12.left = t14;
        t15.left = t17;
        t15.right = t16;
        t17.left = t18;
        System.out.println("Are the 2 trees isomorphic: " +iso.isIsomorphic(t11, t15));
        System.out.println("Testing the Second test case");
        Node t21 = new Node(1);
        Node t22 = new Node(2);
        Node t23 = new Node(3);
        Node t24 = new Node(4);
        Node t25 = new Node(1);
        Node t26 = new Node(2);
        Node t27 = new Node(3);
        Node t28 = new Node(4);
        t21.left = t22;
        t21.right = t23;
        t22.left = t24;
        t25.left = t27;
        t25.right = t26;
        t26.right = t28;
        System.out.println("Are the 2 trees isomorphic: " +iso.isIsomorphic(t21, t25));




    }
}
