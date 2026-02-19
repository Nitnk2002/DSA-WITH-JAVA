package DataStructures.Trees;

public class CountOfBinaryTree extends GeneratingTreeFromTraversal{

    int count(){
        return count(root);
    }
    int count(Node p){
        int x;
        int y;
        if(p != null){
            x = count (p.lchild);
            y = count (p.rchild);
            return x + y + 1;
        }
        return 0;
    }
    int sum(){
        return sum (root);
    }
    int sum(Node p){
        int x;
        int y;
        if(p != null){
            x = sum (p.lchild);
            y = sum (p.rchild);
            return x+y+p.data;
        }
        return 0;
    }

    int deg2NodeCount(){
        return deg2NodeCount (root);
    }
    int deg2NodeCount(Node p){
        int x;
        int y;
        if(p != null){
            x = deg2NodeCount (p.lchild);
            y = deg2NodeCount (p.rchild);
            if(p.lchild != null && p.rchild != null){
                return x+y+1;
            }else {
                return x+y;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        CountOfBinaryTree cbt = new CountOfBinaryTree ();
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
    }
}
