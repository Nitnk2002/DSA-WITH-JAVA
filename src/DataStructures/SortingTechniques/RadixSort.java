package DataStructures.SortingTechniques;


import java.util.Arrays;

public class RadixSort extends Node {

    public int max(int[] a,int n){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public int countDigits(int x){
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }
    public void initializeBins(Node[] p,int n){
        for (int i = 0; i < n; i++) {
            p[i] = null;
        }
    }
    public void insert(Node[] ptrBins,int value,int idx){
        Node temp = new Node ();
        temp.value = value;
        temp.next = null;
        if(ptrBins[idx] == null){
            ptrBins[idx] = temp;
        }else {
            Node p = ptrBins[idx];
            while (p.next != null){
                p = p.next;
            }
            p.next = temp;
        }
    }
    public int delete(Node[] ptrBins,int idx){
        Node p = ptrBins[idx];
        ptrBins[idx] = ptrBins[idx].next;
        int x = p.value;
        return x;
    }
    public int getBinIndex(int x, int idx){
        return (int) (x/ Math.pow (10,idx)) % 10;
    }

    public void radixSort(int[] a,int n){
        int max = max (a,n);
        int nPass = countDigits (max);

        Node[] bins = new Node[10];
        initializeBins (bins,10);

        for (int pass = 0; pass < nPass; pass++) {

            for (int i = 0; i < n; i++) {
                int binIdx = getBinIndex (a[i],pass);
                insert (bins,a[i],binIdx);
            }
            int i = 0;
            int j = 0;
            while (i < 10){
                while (bins[i] != null){
                    a[j++] = delete (bins,i);
                }
                i++;
            }
            initializeBins (bins,10);
        }
    }

    public static void main(String[] args) {
        int[] a = {237, 146, 259, 348, 152, 163, 235, 48, 36, 62};
        System.out.println ("A : "+ Arrays.toString (a));
        RadixSort rs = new RadixSort ();
        rs.radixSort (a,a.length);
        System.out.println ("Sorted A : "+ Arrays.toString (a));
    }

}
