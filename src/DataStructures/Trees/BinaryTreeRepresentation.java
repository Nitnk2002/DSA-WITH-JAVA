package DataStructures.Trees;

public class BinaryTreeRepresentation {

    static class Node{
        Node lChild;
        int data;
        Node rChild;
    }

    static Node root = null;
    public static void createTree(int x){
        Node t = new Node ();
        t.data = x;
        t.lChild = null;
        t.rChild = null;
        if(root == null){
            root = t;
            return;
        }

        Node current = root;
        Node parent = null;
        while (current != null){
            parent = current;
            if(x < current.data){
                current = current.lChild;
            } else if (x > root.data) {
                current = current.rChild;
            }else {
                return;
            }
        }
        if(x < parent.data){
            parent.lChild = t;
        }else {
            parent.rChild = t;
        }
    }
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.lChild);
            System.out.print(root.data + " ");
            inorder(root.rChild);
        }
    }

    public static void main(String[] args) {
        createTree (10);
        createTree (20);
        createTree (5);
        createTree (6);
        createTree (4);
        createTree (15);
        createTree (23);
        inorder (root);
    }
}
