package DataStructures.Heap;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInHeap {

    public void insert(int[] a,int n){
        int i = n;
        int temp = a[n];

        while (i > 0 && temp > a[(i - 1) / 2]){
            a[i] = a[(i - 1) / 2];
            i = (i - 1) / 2;
        }
        a[i] = temp;
    }

    public void insertA(ArrayList<Integer> list, int key){
        int i = list.size ();
        list.add (key);

        while (i > 0 && key > list.get ((i - 1) / 2)){
            list.set (
                    i,
                    list.get ((i - 1) / 2)
            );
            i = (i - 1) / 2;
        }
        list.set (i,key);
    }

    public static void main(String[] args) {
        int[] a = {45, 35, 15, 30, 10, 12, 6, 5, 20, 50};
        InsertInHeap ih = new InsertInHeap ();

        ih.insert (a,a.length-1);
        System.out.println (Arrays.toString (a));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(35);
        list.add(15);
        list.add(30);
        list.add(10);
        list.add(12);
        list.add(6);
        list.add(5);
        list.add(20);

        ih.insertA(list, 50);
        System.out.println(list);
    }
}
