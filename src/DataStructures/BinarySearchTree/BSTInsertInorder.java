package DataStructures.BinarySearchTree;


class Node{
    Node lchild;
    int data;
    Node rchild;
}
public class BSTInsertInorder {

    Node root;
    BSTInsertInorder(){
        root = null;
    }

    void Insert(int key){
        Node t = root;
        Node p;
        Node r = null;

        if(root == null){
            p = new Node ();
            p.data = key;
            p.lchild = null;
            p.rchild = null;
            root = p;
            return;
        }

        while (t != null){
            r = t;
            if(key < t.data){
                t = t.lchild;
            }else if(key > t.data){
                t = t.rchild;
            }else {
                return;
            }
        }

        p = new Node();
        p.data = key;
        p.lchild = null;
        p.rchild = null;

        if(key < r.data){
            r.lchild = p;
        }else {
            r.rchild = p;
        }
    }
    void Inorder(Node p){
        if(p != null){
            Inorder (p.lchild);
            System.out.print (p.data+", ");
            Inorder (p.rchild);
        }
    }
    Node getRoot(){
        return root;
    }

    Node Search(int key){
        Node t = root;
        while (t != null) {
            if (key == t.data) {
                return t;
            } else if (key < t.data) {
                t = t.lchild;
            } else {
                t = t.rchild;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BSTInsertInorder bst = new BSTInsertInorder ();

        bst.Insert(10);
        bst.Insert(5);
        bst.Insert(20);
        bst.Insert(8);
        bst.Insert(30);

        bst.Inorder (bst.getRoot ());
        System.out.println ();

        Node temp = bst.Search (30);
        if(temp != null){
            System.out.println (temp.data);
        }else {
            System.out.println ("Element not found ");
        }
    }
}
