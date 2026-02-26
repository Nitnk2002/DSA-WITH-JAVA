package DataStructures.Heap;

import java.util.ArrayList;

public class CreateHeap extends InsertInHeap{
    public void createHeapA(ArrayList<Integer> list,int[] a,int n){
        for (int i = 0; i < n; i++) {
            insertA(list,a[i]);
        }
    }
    public void createHeap(int[] a,int n){
        for (int i = 0; i < n; i++) {
            insertInPlace (a,i);
        }
    }
    public void insertInPlace(int[] a,int n){

        int i = n ;
        int temp = a[n];
        while (i > 0 && temp > a[(i - 1) / 2]){
            a[i] = a[(i - 1) / 2];
            i = (i - 1) / 2;
        }
        a[i] = temp;
    }
    public void print(int[] a,int n, String c){
        System.out.print (c+" : [");
        for (int i = 0; i < n; i++) {
            System.out.print (a[i]);
            if(i < n-1){
                System.out.print (", ");
            }
        }
        System.out.println ("]");
    }
    public void printA(ArrayList<Integer> a,int n, String c){
        System.out.print (c+" : [");
        for (int i = 0; i < n; i++) {
            System.out.print (a.get (i));
            if(i < n-1){
                System.out.print (", ");
            }
        }
        System.out.println ("]");
    }

    public static void main(String[] args) {
        System.out.println ("Create Heap");
        int[] b = {10,20,30,25,5,40,35};
        CreateHeap ch=  new CreateHeap ();
        ch.print (b,b.length,"b");
        ArrayList<Integer> list = new ArrayList<> ();
        ch.createHeapA (list,b,b.length);
        ch.printA (list,list.size (),"A");
        System.out.println ("InPlace Insert  : ");
        ch.createHeap (b,b.length);
        ch.print (b,b.length,"B");
    }

}
