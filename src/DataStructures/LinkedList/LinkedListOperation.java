package DataStructures.LinkedList;

public class LinkedListOperation {
    static class Node{
        int data;
        Node next;
    }
    static Node head = null;
    static Node last  = null;
    public static void insertAtFirst(int x){
        Node t = new Node ();
        t.data = x;
        t.next = head;
        head = t;
        if(last == null){
            last = head;
        }
    }
    public static void removeDuplicateNode(){
        Node  p = head;
        Node q = head.next;
        while(q != null){
            if(p.data != q.data){
                p = q;
                q = q.next;
            }else{
                p.next = q.next;
                q = q.next;
            }
        }
    }
    public static void reversingElements(){
        Node p = head;
        int i = 0;
        int[] a = new int[100] ;
        while(p != null){
            a[i] = p.data;
            p = p.next;
            i++;
        }
        p = head;
        i--;
        while(p != null){
            p.data = a[i--];
            p = p.next;
        }
    }
    public static void reversingElementsOneLoop(){
        Node p = head;
        Node q = null;
        Node r = null;
        while(p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
    }
    public static void reversingLinks(){


    }
    public static void reverseWithRecursion(Node q,Node p){
        if(p != null){
            reverseWithRecursion (p, p.next);
            p.next = q;
        }else {
            head = q;
        }
    }
    public static void display(){
        Node temp = head;
        while (temp != null){
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println ("null");
    }
    public static void main(String[] args) {

        insertAtFirst (10);
        insertAtFirst (20);
        insertAtFirst (30);
        insertAtFirst (30);
        insertAtFirst (40);
        display ();
        removeDuplicateNode ();
        display ();
        reversingElements ();
        display ();
        Node q = null;
        reverseWithRecursion (q,head);
        display ();
    }
}
