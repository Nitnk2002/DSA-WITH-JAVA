package DataStructures.Trees;

public class GeneratingTreeFromTraversal extends Tree{

    int searchInorder(int[] inArray,int inStart,int inEnd,int data){
        for (int i = inStart; i <= inEnd; i++) {
            if(inArray[i] == data){
                return i;
            }
        }
        return -1;
    }

    static int preIndex = 0;

    Node generateFromTraversal(int[] inorder,int[] preorder,int inStart,int inEnd){
        if(inStart > inEnd){
            return null;
        }

        Node node =  new Node(preorder[preIndex++]);

        if(inStart == inEnd){
            return node;
        }

        int splitIndex = searchInorder (inorder,inStart,inEnd,node.data);
        node.lchild = generateFromTraversal (inorder,preorder,inStart,splitIndex-1);
        node.rchild = generateFromTraversal (inorder,preorder,splitIndex+1,inEnd);

        return node;

    }

    public static void main(String[] args) {
        GeneratingTreeFromTraversal gener = new GeneratingTreeFromTraversal ();

        int preorder[] = {4, 7, 9, 6, 3, 2, 5, 8, 1};
        int inorder[] = {7, 6, 9, 3, 4, 5, 8, 2, 1};
        Node T = gener.generateFromTraversal (inorder,preorder,0,preorder.length-1);
        gener.preorder (T);
        System.out.println ();
        gener.inorder (T);
    }

}
