package DataStructures.Trees;

import java.util.Stack;

public class IterativeMethod extends Tree{

    void iterativePreorder(){
        iterativePreorder (root);
    }
    void iterativePreorder(Node p){
        Stack<Node> stk = new Stack<> ();
        while (p != null || !stk.isEmpty ()){
            if(p != null){
                System.out.print (p.data+", ");
                stk.push (p);
                p = p.lchild;
            }else {
                p = stk.peek ();
                stk.pop ();
                p = p.rchild;
            }
        }
        System.out.println ();
    }
    void iterativeInorder(){
        iterativeInorder (root);
    }
    void iterativeInorder(Node p){
        Stack<Node> stk = new Stack<> ();
        while (p != null || !stk.isEmpty ()){
            if(p != null){

                stk.push (p);
                p = p.lchild;
            }else {
                p = stk.peek ();
                stk.pop ();
                System.out.print (p.data+", ");
                p = p.rchild;
            }
        }
        System.out.println ();
    }

    void iterativePostorder(){
        iterativePostorder (root);
    }
    void iterativePostorder(Node p){
        Stack<Node> stk = new Stack<> ();
        Node lastVisited = null;
        while (p != null || !stk.isEmpty ()){
            if(p != null){
                stk.push (p);
                p = p.lchild;
            }else {
                Node peekNode = stk.peek();

                // if right child exists and not processed yet
                if (peekNode.rchild != null && lastVisited != peekNode.rchild) {
                    p = peekNode.rchild;
                } else {
                    System.out.print(peekNode.data + " ");
                    lastVisited = stk.pop();
                }
            }
        }
        System.out.println ();
    }
    public static void main(String[] args) {

        IterativeMethod im = new IterativeMethod ();
        im.createTree ();
        im.iterativePreorder ();
        im.iterativeInorder ();
        im.iterativePostorder ();
    }
}
