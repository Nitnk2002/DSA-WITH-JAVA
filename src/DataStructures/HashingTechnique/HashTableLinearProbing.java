package DataStructures.HashingTechnique;

import java.util.Arrays;

public class HashTableLinearProbing {

    private static final int SIZE = 10;
    public int hash(int key){
        return key % SIZE;
    }

    public int LinearProbe(int[] h,int key){
        int idx = hash (key);
        int i = 0;
        while (h[Math.abs ((idx + i) % SIZE)] != 0){
            i++;
        }
        return Math.abs ((idx + i) % SIZE);
    }

    public void insert(int[] h,int key){
        int idx = hash (key);
        if(h[idx] != 0){
            idx = LinearProbe (h,key);
        }
        h[idx] = key;
    }

    public int search(int[] h, int key){
        int idx = hash (key);
        int i = 0;
        while (h[Math.abs ((idx + i) % SIZE)] != key){
            i++;
            if (h[Math.abs ((idx + i) % SIZE)] == 0){
                return -1;
            }
        }
        return Math.abs ((idx + i) % SIZE);
    }

    public static void main(String[] args) {

        int[] a = {26,30,45,23,25,43,74,19,29};
        int n = a.length;
        System.out.println ("A : "+ Arrays.toString (a));

        HashTableLinearProbing htlp = new HashTableLinearProbing ();
        int[] ht = new int[10];

        for (int i = 0; i < n; i++) {
            htlp.insert (ht,a[i]);
        }
        System.out.println ("HT : "+Arrays.toString (ht));

        int index = htlp.search (ht,25);
        System.out.println ("Key found at : "+index);

        index = htlp.search (ht,95);
        System.out.println ("Key found at : "+ index);
    }

}
