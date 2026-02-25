package DataStructures.AvlTrees;

public class DeletionFromAVL extends LRRLRotation{

    public Node inPre(Node p){
        while (p != null && p.rchild != null){
            p = p.rchild;
        }
        return p;
    }
    public Node inSucc(Node p){
        while (p != null && p.lchild != null){
            p = p.lchild;
        }
        return p;
    }

    public Node delete(Node p, int key){
        if(p == null){
            return null;
        }

        if(p.lchild == null && p.rchild == null){
            if(p == root){
                root = null;
            }
            return null;
        }

        if(key < p.data){
            p.lchild = delete (p.lchild, key);
        }else if(key > p.data){
            p.rchild = delete (p.rchild , key);
        }else {
            Node q;
            if(NodeHeight (p.lchild) > NodeHeight (p.rchild)){
                q = inPre (p.lchild);
                p.data = q.data;
                p.lchild = delete (p.lchild, q.data);
            }else{
                q = inSucc (p.rchild);
                p.data = q.data;
                p.rchild = delete (p.rchild, q.data);
            }
        }

        p.height = NodeHeight (p);

        if(BalanceFactor (p) == 2 && BalanceFactor (p.lchild) == 1){
            return LLRotation (p);
        }else if(BalanceFactor (p) == 2 && BalanceFactor (p.lchild) == -1){
            return LRRotation (p);
        }else if(BalanceFactor (p) == -2 && BalanceFactor (p.lchild) == -1){
            return RRRotation (p);
        }else if(BalanceFactor (p) == -2 && BalanceFactor (p.lchild) == 1){
            return RLRotation (p);
        }else if(BalanceFactor (p) == 2 && BalanceFactor (p.lchild) == 0){
            return LLRotation (p);
        }else if(BalanceFactor (p) == -2 && BalanceFactor (p.lchild) == 0){
            return RRRotation (p);
        }

        return p;
    }

    public static void main(String[] args) {
        DeletionFromAVL tree = new DeletionFromAVL ();
        int[] a = {10,20,30,25,28,27,5};

        for (int i = 0; i < a.length; i++) {
            tree.root = tree.rInsert (tree.root,a[i]);
        }
        tree.Inorder ();
        System.out.println ();

        tree.delete (tree.root,28);

        tree.Inorder ();
        System.out.println ();
    }
}
