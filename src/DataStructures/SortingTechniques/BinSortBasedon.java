package DataStructures.SortingTechniques;

import java.util.Arrays;

class Node{
    int value;
    Node next;
}
public class BinSortBasedon {

    public int max(int[] a,int n){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public void insert(Node[] ptrBins, int idx){
        Node temp = new Node ();
        temp.value = idx;
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
    public void binSort(int[] a,int n){
        int max = max (a,n);
        Node[] bins = new Node[max+1];

        for (int i = 0; i < max+1; i++) {
            bins[i] = null;
        }
        for (int i = 0; i < n; i++) {
            insert (bins,a[i]);
        }

        int i = 0;
        int j = 0;
        while (i < max+1){
            while (bins[i] != null){
                a[j++] = delete (bins,i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 3, 6, 7, 10};
        System.out.println ("A : "+ Arrays.toString (a));
        BinSortBasedon bsb = new BinSortBasedon ();
        bsb.binSort (a,a.length);
        System.out.println ("Sorted A : "+ Arrays.toString (a));
    }
    
}
