package DataStructures.AvlTrees;

public class LRRLRotation extends AVLTree{

    @Override
    public Node LRRotation(Node p) {
        Node pl = p.lchild;
        Node plr = pl.rchild;

        pl.rchild = plr.lchild;
        p.lchild = plr.rchild;

        plr.lchild = pl;
        plr.rchild = p;

        pl.height = NodeHeight (pl);
        p.height = NodeHeight (p);
        plr.height = NodeHeight (plr);

        if(p == root){
            root = plr;
        }

        return plr;
    }

    @Override
    public Node RLRotation(Node p){
        Node pr = p.rchild;
        Node prl = pr.lchild;

        pr.lchild = prl.rchild;
        p.rchild = prl.lchild;

        prl.rchild = pr;
        prl.lchild = p;

        pr.height = NodeHeight (pr);
        p.height = NodeHeight (prl);

        if(root == p){
            root = prl;
        }
        return prl;
    }

    public static void main(String[] args) {
        LRRLRotation tlr = new LRRLRotation ();
        tlr.root = tlr.rInsert (tlr.root,50);
        tlr.root = tlr.rInsert (tlr.root,10);
        tlr.root = tlr.rInsert (tlr.root,20);

        tlr.Inorder ();
        System.out.println ();
        System.out.println ("root : "+tlr.root.data);

        LRRLRotation trl = new LRRLRotation ();
        trl.root = trl.rInsert (trl.root,20);
        trl.root = trl.rInsert (trl.root,50);
        trl.root = trl.rInsert (trl.root,30);

        trl.Inorder ();
        System.out.println ();
        System.out.println ("root : "+trl.root.data);
    }
}
