package DataStructures.Trees;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeAllMethod {

    public Tree tree;

    public class Node{
        Node lchild;
        int data;
        Node rchild;
    }

    public class Tree{
        Node root;

        Tree(){
            root = null;
        }
        void createTree(){
            Node p;
            Node t;
            int x;
            Queue<Node> q = new LinkedList<> ();

            root = new Node ();
            Scanner sc = new Scanner (System.in);
            System.out.print ("Enter root data : ");
            x = sc.nextInt ();
            root.data = x;
            root.lchild = null;
            root.rchild = null;
            q.add (root);

            while (!q.isEmpty ()){
                p = q.poll ();

                System.out.print ("Enter left child data of "+p.data+" : ");
                x = sc.nextInt ();
                if(x != -1){
                    t = new Node ();
                    t.data = x;
                    t.lchild = null;
                    t.rchild = null;
                    p.lchild = t;
                    q.add (t);
                }
                System.out.print ("Enter right child data of "+p.data+" : ");
                x = sc.nextInt ();
                if(x != -1){
                    t = new Node ();
                    t.data = x;
                    t.lchild = null;
                    t.rchild = null;
                    p.rchild = t;
                    q.add (t);
                }
            }
        }
        void preorder(){
            preorder (root);
            System.out.println ();
        }
        void preorder(Node p){
            if(p != null){
                System.out.print (p.data+", ");
                preorder (p.lchild);
                preorder (p.rchild);
            }
        }
        void inorder(){
            inorder (root);
            System.out.println ();
        }
        void inorder(Node p){
            if(p != null){
                inorder (p.lchild);
                System.out.print (p.data+", ");
                inorder (p.rchild);
            }
        }
        void postorder(){
            postorder (root);
            System.out.println ();
        }
        void postorder(Node p){
            if(p != null){
                postorder (p.lchild);
                postorder (p.rchild);
                System.out.print (p.data+", ");
            }
        }
        void levelOrder(){
            levelOrder (root);
            System.out.println ();
        }
        void levelOrder(Node p){
            Queue<Node> q = new LinkedList<> ();
            System.out.print (root.data+", ");
            q.add (root);

            while (!q.isEmpty ()){
                p = q.poll ();
                if(p.lchild != null){
                    System.out.print (p.lchild.data+", ");
                    q.add (p.lchild);
                }
                if(p.rchild != null){
                    System.out.print (p.rchild.data+", ");
                    q.add (p.rchild);
                }
            }
        }
        int height(){
            return height (root);
        }
        int height(Node p){
            int l = 0;
            int r = 0;
            if(p == null){
                return 0;
            }
            l = height (p.lchild);
            r = height (p.rchild);

            if(l > r){
                return l+1;
            }else {
                return r+1;
            }
        }
    }

    public static void main(String[] args) {
        TreeAllMethod tm = new TreeAllMethod ();
        tm.tree = tm.new Tree ();
        tm.tree.createTree();
        System.out.println("Preorder : ");
        tm.tree.preorder();
        System.out.println("Inorder : ");
        tm.tree.inorder();
        System.out.println("Postorder : ");
        tm.tree.postorder();
        System.out.println("Level order : ");
        tm.tree.levelOrder ();
        System.out.println("Height : "+tm.tree.height ());

    }
}
