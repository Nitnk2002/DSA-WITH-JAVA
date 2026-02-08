package DataStructures.sparseMatrixAndPolynomialRepresentation;


import java.util.Scanner;

public class SparseMatrix {

    public static class Element{
        int i;
        int j;
        int x;
    }

    public static class Sparse{
        int m;
        int n;
        int num;
        Element[] e;
    }
    public static void create (Sparse s){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter Dimension : ");
        s.m = sc.nextInt ();
        s.n = sc.nextInt ();
        System.out.println ("Enter no. of Zero : ");
        s.num = sc.nextInt ();
        s.e = new Element [s.num];
        System.out.println ("Enter all elements : ");
        for (int i = 0; i <s.num ; i++) {
            s.e[i] = new Element ();
            s.e[i].i = sc.nextInt ();
            s.e[i].j = sc.nextInt ();
            s.e[i].x = sc.nextInt ();

        }
    }
    public static Sparse add(Sparse s1, Sparse s2){
        Sparse sum;
        if(s1.m != s2.m || s1.n != s2.n){
            return null;
        }
        sum = new Sparse ();
        sum.m = s1.m;
        sum.n = s1.n;
        sum.e = new Element [s1.num+ s2.num];
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.num && j<s2.num){
            if (s1.e[i].i < s2.e[j].i ||
                    (s1.e[i].i == s2.e[j].i && s1.e[i].j < s2.e[j].j)) {

                sum.e[k++] = s1.e[i++];

            } else if (s1.e[i].i > s2.e[j].i ||
                    (s1.e[i].i == s2.e[j].i && s1.e[i].j > s2.e[j].j)) {

                sum.e[k++] = s2.e[j++];

            } else {
                sum.e[k] = new Element();
                sum.e[k].i = s1.e[i].i;
                sum.e[k].j = s1.e[i].j;
                sum.e[k].x = s1.e[i].x + s2.e[j].x;
                i++;
                j++;
                k++;
            }

        }
        while (i < s1.num)
            sum.e[k++] = s1.e[i++];

        while (j < s2.num)
            sum.e[k++] = s2.e[j++];

        sum.num = k;
        return sum;
    }
    public static void display(Sparse s) {
        int k = 0;

        for (int i = 1; i <= s.m; i++) {
            for (int j = 1; j <= s.n; j++) {
                if (k < s.num && s.e[k].i == i && s.e[k].j == j) {
                    System.out.print(s.e[k++].x + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Sparse s1 = new Sparse ();
        Sparse s2 = new Sparse ();
        create(s1);
        create (s2);
        Sparse sum = add(s1,s2);

        if (sum != null) {
            System.out.println("Resultant Matrix:");
            display(sum);
        } else {
            System.out.println("Addition not possible");
        }
    }
}
