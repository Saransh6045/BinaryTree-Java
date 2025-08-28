import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int value){
        data = value;
        left = null;
        right = null;
    }
}
class BinaryTree{
    Node root;
    
    BinaryTree(){
        root = null;
    }
    
    void postorder(Node node){
        if (node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}
class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(7);
        tree.postorder(tree.root);
    }
}
