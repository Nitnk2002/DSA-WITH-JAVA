package DataStructures.BinarySearchTree;

import java.util.Stack;

public class BSTFromPreorder extends BSTRecursive{

    public void createFromPreorder(int[] pre , int n){

        int i = 0;
        root = new Node ();
        root.data = pre[i++];
        root.lchild = null;
        root.rchild = null;

        Node t ;
        Node p  = root;
        Stack<Node> st = new Stack<> ();

        while (i < n){
            if(pre[i] < p.data){
                t = new Node ();
                t.data = pre[i++];
                t.lchild = null;
                t.rchild = null;
                p.lchild = t;
                st.push (p);
                p = t;
            }else {
                if(pre[i] > p.data && pre[i] < (st.isEmpty () ? 32767 : st.peek ().data)){
                    t = new Node ();
                    t.data = pre[i++];
                    t.lchild = null;
                    t.rchild = null;
                    p.rchild = t;
                    p = t;
                }else {
                    p = st.peek ();
                    st.pop ();
                }
            }
        }
    }

    public static void main(String[] args) {
        BSTFromPreorder bst = new BSTFromPreorder ();
        int[]  pre = {30,20,10,15,25,40,50,45};
        bst.createFromPreorder (pre,pre.length);
        bst.Inorder (bst.getRoot ());
    }
}
