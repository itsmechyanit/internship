import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    Node root;
    int size;

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    Node insert(Node root, int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            size++;
            return root;
        }

        if (root.left == null) {
            root.left = insert(root.left, val);
            size++;
            return root;
        }

        else {
            root.right = insert(root.right, val);
            size++;
            return root;
        }

    }

    void insert(int val) {
        this.root = insert(this.root, val);
    }

    static Node insertIntoBST(Node root, int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return root;
        }

        if (val < root.data) {
            root.left = insertIntoBST(root.left, val);
            return root;
        } else {
            root.right = insertIntoBST(root.right, val);
            return root;
        }
    }

    void createBinaryTree(String value) {
        String[] values = value.strip().split(" ");

        for (String ele : values)
            this.insert(Integer.parseInt(ele));
    }

    static Node createBinarySearchTree(String value) {
        String[] values = value.strip().split(" ");
        Node root = null;
        for (String ele : values) {
            root = insertIntoBST(root, Integer.parseInt(ele));

        }

        return root;

    }

    void leftView() {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        Node s = new Node(Integer.MAX_VALUE);

        q.add(s);
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node a = q.poll();
            if (a != null && a.data == Integer.MAX_VALUE) {
                if (q.peek() != null) {
                    System.out.print(q.peek().data + " ");
                    q.add(a);
                } else {
                    break;
                }

            } else if (a == null && !q.isEmpty()) {
                q.add(null);
            }

            else if (a == null && q.isEmpty()) {
                break;
            }

            else {
                if (a.left != null)
                    q.add(a.left);
                if (a.right != null)
                    q.add(a.right);

            }

        }

        System.out.println();
    }

    int heightHelper(Node root) {
        if (root == null)
            return 0;

        int leftHeight = heightHelper(root.left);
        int rightHeight = heightHelper(root.right);
        if (leftHeight > rightHeight) {
            return 1 + leftHeight;
        } else {
            return 1 + rightHeight;
        }
    }

    int height() {
        return heightHelper(this.root);
    }

    void print(Node root) {
        // helper function to print the binary tree in a more visual appealing way
        if (root == null)
            return;
        System.out.print(root.data + ":");

        if (root.left != null) {
            System.out.print("L:" + root.left.data + ",");
        }

        if (root.right != null) {
            System.out.print("R:" + root.right.data);
        }

        System.out.println();
        print(root.left);
        print(root.right);

    }

    void print() {
        // function to print the binary tree in a more visual appealing way
        print(this.root);
    }

    static void inOrder(Node root, ArrayList<Integer> output) {
        if (root == null)
            return;
        inOrder(root.left, output);
        output.add(root.data);
        inOrder(root.right, output);
    }

    static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        inOrder(root, output);
        return output;

    }

    static boolean isSorted(ArrayList<Integer> al) {
        if (al.size() == 0)
            return true;
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i + 1) >= al.get(i))
                continue;
            else
                return false;
        }
        return true;
    }

    static boolean isBST(Node root) {
        ArrayList<Integer> al = inOrder(root);
        if (isSorted(al))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        BinaryTree bst = new BinaryTree();
        System.out.println("We will be creating a binary tree which is not necessariy a binay seearch tree");
        System.out
                .println("Please enter the nodes in your binary tree following the pattern as shown here 10 -7 0 14 5");
        String elems = sc.nextLine();
        bt.createBinaryTree(elems);
        System.out.println("Printing the binary tree");
        bt.print();
        System.out.println("The height of the binary tree is " + bt.height());
        System.out.println("Now we will be printing the left view of a binary tree");
        bt.leftView();
        System.out.println(
                "Now we will create a binary search tree and verify that it is indeed a binary seearch tree using our isBST function");
        System.out
                .println(
                        "Please enter the nodes in your binary search tree following the pattern as shown here 10 -7 0 14 5");
        String elemsBST = sc.nextLine();
        bst.root = createBinarySearchTree(elemsBST);
        System.out.println("Printing the binary search tree");
        bst.print();

        boolean is_bst = isBST(bst.root);

        if (is_bst)
            System.out.println("This binary tree is also a binary search tree");
        else
            System.out.println("This binary tree is not a binary search tree");

        sc.close();

    }

}
