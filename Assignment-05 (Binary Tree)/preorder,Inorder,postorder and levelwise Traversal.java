import java.util.*;

public class practice {
    // ---------- Node class ----------
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // ---------- BinaryTree class ----------
    static class BinaryTree {
        static int index;
        public static Node buildTree(int[] nodes) {
            // move to next index
            index++;
            // Boundary check (VERY IMPORTANT)
            if (index >= nodes.length) {
                return null;
            }
            // -1 represents null node
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);

            // build left and right subtrees
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    // ---------- main ----------
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1,5,-1,-1, 3, -1, 6, -1, -1 };
        // reset index before building tree
        BinaryTree.index = -1;
        Node root = BinaryTree.buildTree(nodes);
        // test output
        System.out.println("The root of the Tree is: "+root.data); // Output: 1
        System.out.println("Binary Tree in pre-Order form: ");
        preorder(root);
        System.out.println("\nBinary Tree in In-Order form: ");
        inorder(root);
        System.out.println("\nBinary Tree in post-Order form: ");
        postorder(root);
        System.out.println("\nBinary Tree in level-wise traversal: ");
        levelwise(root);
    }
    // ---------- Pre-Order Traversal ----------
    static void preorder(Node root){
        if(root==null){
            return;
        }
        else{
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
     // ---------- In-Order Traversal ----------
    static void inorder(Node root){
        if(root==null){
            return;
        }
        else{  
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
     // ---------- Post-Order Traversal ----------
    static void postorder(Node root){
        if(root==null){
            return;
        }
        else{  
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
     // ---------- Level-wise Traversal ----------
    static void levelwise(Node root){

        Queue <Node> q1 = new LinkedList<>();
        q1.add(root);
        q1.add(null); //This one for seperating the level

        while (!q1.isEmpty()) {
            Node currentNode = q1.remove();
            if(currentNode==null){
                System.out.println();
                if(q1.isEmpty()){
                    break;
                }
                else{
                    q1.add(null);
                }
            }
            else{
                System.out.print(currentNode.data+" ");
                if(currentNode.left != null){
                    q1.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q1.add(currentNode.right);
                }
            }
        }
    }
}
