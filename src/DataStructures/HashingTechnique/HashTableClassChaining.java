package DataStructures.HashingTechnique;

class Node{
    int data;
    Node next;
}
public class HashTableClassChaining {

    Node[] ht;

    HashTableClassChaining(){
        ht = new Node[10];
        for (int i = 0; i < 10; i++) {
            ht[i] = null;
        }
    }

    public int hash(int key){
        return key % 10;
    }

    public void insert(int key){
        int hIdx = hash (key);
        Node t = new Node ();
        t.data = key;
        t.next = null;

        if(ht[hIdx] == null){
            ht[hIdx] = t;
        }else {
            Node p = ht[hIdx];
            Node q = ht[hIdx];

            while (p != null && p.data < key){
                q = p;
                p = p.next;
            }
            if(q == ht[hIdx]){
                t.next = ht[hIdx];
                ht[hIdx] = t;
            }else {
                t.next = q.next;
                q.next = t;
            }
        }
    }
    public int search(int key){
        int hIdx = hash (key);
        Node p = ht[hIdx];
        while (p != null){
            if(p.data == key){
                return p.data;
            }
            p = p.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {16, 12, 25, 39, 6, 122, 5, 68, 75};
        int n = a.length;
        HashTableClassChaining htcc = new HashTableClassChaining ();
        for (int i = 0; i < n; i++) {
            htcc.insert (a[i]);
        }
        System.out.println ("Successful Search");
        int key = 6;
        int value =  htcc.search (key);
        System.out.println ("Key : "+key+" Value : "+value);
        System.out.println ("Unsuccessful Search");
        key = 95;
        value = htcc.search (key);
        System.out.println ("Key : "+key+" Value : "+value);

    }
}
