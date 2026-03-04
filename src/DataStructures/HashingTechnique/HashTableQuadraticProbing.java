package DataStructures.HashingTechnique;

import java.util.Arrays;

public class HashTableQuadraticProbing {

    private static final int SIZE = 10;

    public int hash(int key){
        return key % SIZE;
    }
    public int quadraticProbe(int[] h,int key){
        int idx = hash (key);
        int i = 0;
        while (h[Math.abs ((idx + i*i) % SIZE)] != 0){
            i++;
        }
        return Math.abs ((idx + i*i) % SIZE);
    }

    public void insert(int[] h,int key){
        int idx = hash (key);
        if(h[idx] != 0){
            idx = quadraticProbe (h,key);
        }
        h[idx] = key;
    }

    public int search(int[] h, int key){
        int idx = hash (key);
        int i =0;
        while (h[Math.abs ((idx + i*i) % SIZE)] != key){
            i++;
            if (h[Math.abs ((idx + i*i) % SIZE)] == 0){
                return -1;
            }
        }
        return Math.abs ((idx + i*i) % SIZE);
    }

    public static void main(String[] args) {
        int[] a = {26,30,45,23,25,43,74,19,29};
        int n = a.length;
        System.out.println ("A : "+ Arrays.toString (a));

        HashTableQuadraticProbing htqp = new HashTableQuadraticProbing ();
        int[] ht = new int[10];

        for (int i = 0; i < n; i++) {
            htqp.insert (ht,a[i]);
        }
        System.out.println ("HT : "+Arrays.toString (ht));

        int index = htqp.search (ht,25);
        System.out.println ("Key found at : "+index);

        index = htqp.search (ht,43);
        System.out.println ("Key found at : "+ index);
    }
}
