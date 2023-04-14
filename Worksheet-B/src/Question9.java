import java.util.Scanner;

public class Question9 {

    private static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null) return true;
        else if (root1 == null) return false;
        else if(root2 == null) return false;
        else{
            if(root1.data != root2.data)return false;
            else{
                boolean left = isIdentical(root1.LeftChild, root2.LeftChild);
                boolean right = isIdentical(root1.RightChild, root2.RightChild);
                if(left == true && right == true) return true;
                else return false;
            }
            
            
        }
    }

    public static void main(String[] args) {
        System.out.println("We will be creating 2 binary trees and then check if they are identical");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the elements of the first binary tree in a single line with spaces in between");
        String elems = sc.nextLine();
        String[] elemsArr = elems.split(" ");
        Node root1 = BinaryTree.createBinaryTree(elemsArr);
        System.out.println("printing the first binary tree");
        BinaryTree.print(root1);
        System.out.println("Please enter the elements of the second binary tree in a single line with spaces in between");
        String elems2 = sc.nextLine();
        String[] elemsArr2 = elems2.split(" ");
        Node root2 = BinaryTree.createBinaryTree(elemsArr2);
        System.out.println("printing the second binary tree");
        BinaryTree.print(root1);
        System.out.println("Checking if they are identical");
        boolean ans = isIdentical(root1, root2);
        if(ans == true){
            System.out.println("The 2 binary trees are identical");
        }
        else{
            System.out.println("The 2 binary trees are not identical");
        }

        sc.close();

    }


    
}
