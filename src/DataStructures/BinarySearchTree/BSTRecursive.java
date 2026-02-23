package DataStructures.BinarySearchTree;


public class BSTRecursive extends BSTInsertInorder {

    Node rInsert(Node p ,int key){
        Node t = root;
        if(p == null){
            t = new Node ();
            t.data = key;
            t.lchild = null;
            t.rchild = null;
            return t;
        }

        if(key < p.data){
            p.lchild = rInsert (p.lchild, key);
        }else if(key > p.data){
            p.rchild = rInsert (p.rchild,key);
        }
        return p;
    }
    Node rSearch(Node p,int key){
        if(p == null){
            return null;
        }
        if(key == p.data){
            return p;
        } else if (key < p.data) {
            return rSearch (p.lchild, key);
        }else {
            return rSearch (p.rchild,key);
        }
    }

    Node Delete(Node p, int key){
        Node q = null;

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
            p.lchild = Delete (p.lchild, key);
        }else if(key > p.data){
            p.rchild = Delete (p.rchild, key);
        }else {
            if(Height(p.lchild) > Height (p.rchild)){
                q = InPre(p.lchild);
                p.data = q.data;
                p.lchild = Delete (p.lchild, q.data);
            }else {
                q = InSucc(p.rchild);
                p.data = q.data;
                p.rchild = Delete (p.rchild, q.data);
            }
        }
        return p;
    }

    Node InSucc(Node p) {
        while (p != null && p.lchild != null){
            p = p.lchild;
        }
        return p;
    }

    Node InPre(Node p) {
        while (p != null && p.rchild != null){
            p = p.rchild;
        }
        return p;
    }

    int Height(Node p){
        int x;
        int y;
        if(p == null){
            return 0;
        }
        x = Height (p.lchild);
        y = Height (p.rchild);

        return x > y ? x +1 : y + 1;
    }
    public static void main(String[] args) {

        BSTRecursive bst = new BSTRecursive ();
        //recursive InSearch
        bst.Insert (30);
        bst.rInsert (bst.getRoot (), 50);
        bst.rInsert (bst.getRoot (),70);
        bst.rInsert (bst.getRoot (),1);
        bst.Inorder (bst.getRoot ());
        System.out.println ();

        //Recursive Search

        Node temp = bst.rSearch (bst.getRoot (),70);
        if(temp != null){
            System.out.println (temp.data);
        }else {
            System.out.println ("Element not found");
        }
        temp = bst.InPre (bst.getRoot ());
        System.out.println ("In pre : "+temp.data);
        temp = bst.InSucc (bst.getRoot ());
        System.out.println ("In Succ : "+temp.data);
        bst.Delete (bst.getRoot (),30);
        bst.Inorder (bst.getRoot ());
    }
}
