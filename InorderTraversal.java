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
    
    void preorder(Node node){
        if (node==null) return;
        preorder(node.left);
        System.out.print(node.data + " ");
        preorder(node.right);
    }
}
class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(7);
        tree.preorder(tree.root);
    }
}
