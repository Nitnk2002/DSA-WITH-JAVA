package DataStructures.SparseMatrixandPolynomialusingLinkedList;

public class CreatePolynomialRepresentation {

    static class Node{
        int coeff;
        int exp;
        Node next;
    }
    static Node poly = null;
    public static void createPolynomialLinkedList(int coeff,int exp){
        Node temp = new Node ();
        temp.coeff = coeff;
        temp.exp = exp;
        if(poly == null){
            temp.next = null;
            poly = temp;
        }else{
            Node p = poly;
            while (p.next != null){
                p = p.next;
            }
            temp.next = null;
            p.next = temp;
        }

    }
    public static void displayPolynomial(){
        Node p = poly;
        while (p != null){
            System.out.print (p.coeff+"X"+p.exp);
            if(p.next != null){
                System.out.print (" + ");
            }
            //System.out.print (p.coeff+" | "+p.exp+" -> ");
            p = p.next;
        }
        //System.out.println ("NULL");
    }

    public static void evaluate(int x){
        double sum = 0.0;
        Node q = poly;
        while (q != null){
            sum += q.coeff*Math.pow (x,q.exp);
            q = q.next;
        }
        System.out.println ("\nsum : "+sum);
    }

    public static void main(String[] args) {
        createPolynomialLinkedList (4,3);
        createPolynomialLinkedList (9,2);
        createPolynomialLinkedList (6,1);
        createPolynomialLinkedList (7,0);
        displayPolynomial ();
        evaluate (1);
    }
}
