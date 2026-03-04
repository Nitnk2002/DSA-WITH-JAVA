package DataStructures.HashingTechnique;

import java.util.Arrays;

public class DoubleHashing {

    private static final int SIZE = 10;
    private static final int PRIME  = 7;

    public int hash(int key){
        return key % SIZE;
    }

    public int primeHash(int key){
        return PRIME - (key % PRIME);
    }

    public int doubleHash(int[] h, int key){
        int idx = hash (key);
        int i =0;
        while (h[Math.abs ((idx + i * primeHash (key)) % SIZE)] != 0){
            i++;
        }
        return  Math.abs ((idx + i * primeHash (key)) % SIZE);
    }

    public void insert(int[] h, int key){
        int idx = hash (key);
        if(h[idx] != 0){
            idx = doubleHash (h,key);
        }
        h[idx] = key;
    }

    public int search(int[] h, int key){
        int idx = hash (key);
        int i = 0;
        while (h[Math.abs ((idx + i * primeHash (key)) % SIZE)] != key){
            i++;
            if (h[Math.abs ((idx + i * primeHash (key)) % SIZE)] == 0){
                return -1;
            }
        }
        return Math.abs ((idx + i * primeHash (key)) % SIZE);
    }

    public static void main(String[] args) {

        int[] a = {26,30,45,23,25,43,74,19,29};
        int n = a.length;
        System.out.println ("A : "+ Arrays.toString (a));

        DoubleHashing dh = new DoubleHashing ();
        int[] ht = new int[10];

        for (int i = 0; i < n; i++) {
            dh.insert (ht,a[i]);
        }
        System.out.println ("HT : "+Arrays.toString (ht));

        int index = dh.search (ht,25);
        System.out.println ("Key found at : "+index);

        index = dh.search (ht,45);
        System.out.println ("Key found at : "+ index);
    }
}
