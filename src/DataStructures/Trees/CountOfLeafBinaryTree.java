package DataStructures.Trees;

public class CountOfLeafBinaryTree extends CountOfBinaryTree {

    int leafNodeCount(Node p){

        int x;
        int y;
        if(p != null){
            x = leafNodeCount (p.lchild);
            y = leafNodeCount (p.rchild);
            if(p.lchild == null && p.rchild == null){
                return x+y+1;
            }else {
                return x+y;
            }
        }
        return 0;
    }
    int deg1OrDeg2NodeCount(Node p){

        int x;
        int y;
        if(p != null){
            x = deg1OrDeg2NodeCount (p.lchild);
            y = deg1OrDeg2NodeCount (p.rchild);
            if(p.lchild != null || p.rchild != null){
                return x+y+1;
            }else {
                return x+y;
            }
        }
        return 0;
    }
    int deg1NodeCount(Node p){

        int x;
        int y;
        if(p != null){
            x = deg1NodeCount (p.lchild);
            y = deg1NodeCount (p.rchild);
            if(p.lchild != null || p.rchild != null){
                return x+y+1;
            }else {
                return x+y;
            }
        }
        return 0;
    }
    void destroyTree(Node p){
        if(p != null){
            destroyTree (p.lchild);
            destroyTree (p.rchild);
            p.lchild = null;
            p.rchild = null;
        }
    }
    public static void main(String[] args) {
        CountOfLeafBinaryTree cbt = new CountOfLeafBinaryTree ();
        int preorder[] = {8, 3, 12, 4, 9, 7, 5, 10, 6, 2};
        int inorder[] = {12, 9, 4, 7, 3, 8, 10, 5, 2, 6};

        Node T = cbt.generateFromTraversal (inorder,preorder,0,preorder.length-1);

        System.out.println ("Preorder : ");
        cbt.preorder (T);
        System.out.println ();
        System.out.println ("Inorder : ");
        cbt.inorder (T);
        System.out.println ();
        System.out.println ("Height : "+cbt.height (T));
        System.out.println ("Count : "+cbt.count (T));
        System.out.println ("Sum : "+cbt.sum (T));
        System.out.println ("# of degree 2 Nodes : "+cbt.deg2NodeCount (T));
        System.out.println ("leaf Nodes : "+cbt.leafNodeCount (T));
        System.out.println ("degree 1 or degree 2 Nodes : "+cbt.deg1OrDeg2NodeCount (T));
        System.out.println ("# of degree 1 Nodes : "+cbt.deg1NodeCount (T));

        cbt.destroyTree (T);
        cbt.root = null;
        System.out.println ("!Tree Destroyed..!");
    }
}
