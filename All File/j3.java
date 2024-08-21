//
//
//
//
////Tree traversal in java
//
//class  Node{
//    int item;
//    Node left,right;
//
//    public Node(int item){
//        this.item = item;
//        left = right = null;
//    }
//
//}
//
//class BinaryTree {
//    // Root of Binary Tree
//    Node root;
//
//
//    public BinaryTree() {
//        root = null;
//    }
//
//    void postOrder(Node node) {
//        if (node == null) {
//            return;
//        }
//
//        // Traverse the left subtree
//        postOrder(node.left);
//        // Traverse the right subtree
//        postOrder(node.right);
//        //Traverse the root
//        System.out.print(node.item + "->");
//
//
//    }
//
//    void inorder(Node node) {
//        if (node == null) {
//            return;
//        }
//        // Traverse the left subtree
//        inorder(node.left);
//        // Traverse the root
//        System.out.print(node.item + "->");
//        // Traverse the right subtree
//        inorder(node.right);
//    }
//
//    void preorder(Node node) {
//        if (node == null) {
//            return;
//        }
//        // Traverse the root
//        System.out.print(node.item + "->");
//        // Traverse the left subtree
//        preorder(node.left);
//        // Traverse the right subtree
//        preorder(node.right);
//    }
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(12);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//        tree.root.right.left = new Node(6);
//        tree.root.right.right = new Node(7);
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
