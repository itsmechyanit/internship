public class BinaryTree {

    static void addToBinaryTree(Node root, Node el) {
        // This function will add a node to a Normal Binary Tree
        if (root == null) {
            root = el;
            return;
        }
        MyQueue<Node> mq = new MyQueue<>();
        mq.enqueue(root);
        while (!mq.isEmpty()) {
            Node element = mq.dequeue();
            if (element.LeftChild == null) {
                element.LeftChild = el;
                return;
            }
            if (element.RightChild == null) {
                element.RightChild = el;
                return;
            }
            mq.enqueue(element.LeftChild);
            mq.enqueue(element.RightChild);
        }
    }

    static Node createBinaryTree(String[] arr) {
        // This function will create a Normal Binary Tree
        if (arr.length == 0)
            return null;
        Node root = new Node(Integer.parseInt(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            int val = Integer.parseInt(arr[i]);
            Node el = new Node(val);
            addToBinaryTree(root, el);
        }
        return root;
    }

    static void print(Node root){
        if (root == null)
            return;
        System.out.print(root.data + ":");

        if (root.LeftChild != null) {
            System.out.print("L:" + root.LeftChild.data + ",");
        }

        if (root.RightChild != null) {
            System.out.print("R:" + root.RightChild.data);
        }

        System.out.println();
        print(root.LeftChild);
        print(root.RightChild);
    }
    
}
