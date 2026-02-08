package DataStructures.sparseMatrixAndPolynomialRepresentation;

import java.util.Scanner;

public class PolynomialRepresentation {

    static class Term{
        int coeff; //coefficient
        int exp; // Exponential
    }
    static  class Poly{
        int n; // no. of term
        Term[] t;
    }
    public static void create (Poly p){
        Scanner sc = new Scanner (System.in);
        System.out.println ("No. of non-zero terms : ");
        p.n = sc.nextInt ();
        p.t = new Term [p.n];
        System.out.println ("Enter Polynomial terms : ");
        for (int i = 0; i < p.n; i++) {
            System.out.println ("Term no : "+(i+1));
            p.t[i] = new Term ();
            p.t[i].coeff = sc.nextInt ();
            p.t[i].exp = sc.nextInt ();
        }
    }
    public static int evaluate(int x,Poly p){
        int sum = 0;
        for (int i = 0; i < p.n; i++) {
            sum += p.t[i].coeff * Math.pow(x, p.t[i].exp);
        }
        return sum;
    }
    public static Poly add (Poly p1,Poly p2){
        Poly p3 = new Poly ();

        p3.t = new Term[p1.n + p2.n];
        int i = 0, j = 0, k = 0;

        while (i < p1.n && j < p2.n) {

            if (p1.t[i].exp > p2.t[j].exp) {
                p3.t[k++] = p1.t[i++];

            } else if (p1.t[i].exp < p2.t[j].exp) {
                p3.t[k++] = p2.t[j++];

            } else {
                p3.t[k] = new Term();
                p3.t[k].exp = p1.t[i].exp;
                p3.t[k].coeff = p1.t[i].coeff + p2.t[j].coeff;
                i++; j++; k++;
            }
        }

        while (i < p1.n)
            p3.t[k++] = p1.t[i++];

        while (j < p2.n)
            p3.t[k++] = p2.t[j++];

        p3.n = k;

        return p3;
    }
    public static void display(Poly p){
        for (int i = 0; i < p.n; i++) {
            System.out.print(p.t[i].coeff + "x^" + p.t[i].exp);
            if (i != p.n - 1)
                System.out.print(" + ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Poly p1 = new Poly();
        Poly p2 = new Poly();

        create(p1);
        create(p2);

        System.out.println("P1 = ");
        display(p1);

        System.out.println("P2 = ");
        display(p2);

        System.out.println("P1(2) = " + evaluate(2, p1));

        Poly sum = add(p1, p2);

        System.out.println("P1 + P2 = ");
        display(sum);

    }
}
