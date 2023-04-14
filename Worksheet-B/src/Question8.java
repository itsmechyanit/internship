import java.util.Scanner;

public class Question8 {

    private static Node convertToMirror(Node root){
        if(root == null) return root;
        if(root.LeftChild == null && root.RightChild == null) return root;
        Node left = convertToMirror(root.LeftChild);
        Node right = convertToMirror(root.RightChild);
        root.LeftChild = right;
        root.RightChild = left;
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now we will be creating a binary tree");
        System.out.println("Please enter the elements in a single line with spaces in between");
        String elems = sc.nextLine();
        String[] elemsArr = elems.split(" ");
        Node root = BinaryTree.createBinaryTree(elemsArr);
        System.out.println("Printing the binary tree");
        BinaryTree.print(root);
        System.out.println("Converting the tree to its mirror");
        Node mirror = convertToMirror(root);
        System.out.println("Printing the mirrored binary tree");
        BinaryTree.print(mirror);
        sc.close();
    }
    
}
