package DataStructures.AvlTrees;

import javax.xml.stream.events.NotationDeclaration;

class Node{
    Node lchild;
    int data;
    Node rchild;
    int height;
}
public class AVLTree {

    public Node root;

    AVLTree(){
        this.root = null;
    }

    public int NodeHeight(Node p){
        int hl;
        int hr;

        hl = ( p!= null && p.lchild != null) ? p.lchild.height : 0;
        hr = ( p!= null && p.rchild != null) ? p.rchild.height : 0;

        return hl > hr ? hl + 1 : hr + 1;
    }

    public int BalanceFactor(Node p){
        int hl;
        int hr;

        hl = (p != null && p.lchild != null) ? p.lchild.height : 0;
        hr = (p != null && p.rchild != null) ? p.rchild.height : 0;

        return hl - hr;
    }

    public Node LLRotation(Node p){
        Node pl = p.lchild;
        Node plr = p.rchild;

        pl.rchild = p;
        p.lchild = plr;

        p.height = NodeHeight (p);
        pl.height = NodeHeight (pl);

        if(root == p){
            root = pl;
        }
        return pl;
    }

    public Node RRRotation(Node p){
        Node pr = p.rchild;
        Node prl = pr.lchild;

        pr.lchild = p;
        p.rchild = prl;

        p.height = NodeHeight (p);
        pr.height = NodeHeight (pr);

        if(root == p){
            root = pr;
        }
        return pr;
    }
    public Node LRRotation(Node p){
        return null;
    }

    public Node RLRotation(Node p){
        return null;
    }
    public Node rInsert(Node p, int key){
        Node t;
        if(p == null){
            t = new Node ();
            t.data = key;
            t.lchild = null;
            t.rchild = null;
            t.height = 1;
            return t;
        }

        if(key < p.data){
            p.lchild = rInsert (p.lchild,key);
        }else if(key > p.data){
            p.rchild = rInsert (p.rchild,key);
        }

        p.height = NodeHeight (p);

        if(BalanceFactor (p) == 2 && BalanceFactor (p.lchild) == 1){
            return LLRotation (p);
        }else if(BalanceFactor (p) == 2 && BalanceFactor (p.lchild) == -1){
            return LRRotation (p);
        }else if(BalanceFactor (p) == -2 && BalanceFactor (p.rchild) == -1){
            return RRRotation (p);
        }else if(BalanceFactor (p) == -2 && BalanceFactor (p.rchild) == 1){
            return RLRotation (p);
        }

        return p;
    }

    public void Inorder(Node p){
        if(p != null){
            Inorder (p.lchild);
            System.out.print (p.data+", ");
            Inorder (p.rchild);
        }
    }
    public void Inorder(){
        Inorder (root);
    }

    public Node getRoot(){
        return root;
    }

    public static void main(String[] args) {

        AVLTree tll = new AVLTree ();
        tll.root = tll.rInsert (tll.root,30);
        tll.root = tll.rInsert (tll.root,20);
        tll.root = tll.rInsert (tll.root,10);

        tll.Inorder ();
        System.out.println ();
        AVLTree trr = new AVLTree ();
        trr.root = trr.rInsert (trr.root,30);
        trr.root = trr.rInsert (trr.root,20);
        trr.root = trr.rInsert (trr.root,10);

        trr.Inorder ();
        System.out.println ();
    }

}
