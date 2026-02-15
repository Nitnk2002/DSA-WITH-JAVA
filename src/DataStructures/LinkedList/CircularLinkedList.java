package DataStructures.LinkedList;

public class CircularLinkedList {

    static class Node{
        int data;
        Node next;
    }

    static Node head = null;

    public static void insertBeforeHead(int x){
        Node t = new Node ();
        if(head == null){
            t.data = x;
            t.next = t;
            head = t;
            return;
        }else {
            Node p = head;
            t.data = x;
            t.next = head;
            while (p.next != head) {
                p = p.next;
            }
            p.next = t;
            head = t;
        }
    }

    public static void insertAtAnyPos(int x,int pos){
        Node p = head;
        Node t = new Node ();
        if(head == null){
            t.data = x;
            t.next = t;
            head = t;
            return;
        }
        for (int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        t.data = x;
        t.next = p.next;
        p.next = t;
    }

    public static void deleteHeadNode(){
        Node p = head;
        while (p.next != head){
            p = p.next;
        }
        p.next = head.next;
        System.out.println ("Deleted : "+head.data);
        head = p.next;
    }
    public static void deleteNodeAtPos(int pos){
        Node p ;
        Node q = null;
        if(pos == 1){
            p = head;
            while(p.next != head){
                p = p.next;
            }
            System.out.println ("Deleted : "+head.data);
            if(p == head){
                head = null;
            }else {
                p.next = head.next;
                head = p.next;
            }
        }else {
            p = head;
            for (int i = 0; i < pos-2; i++) {
                p = p.next;
            }
            q = p.next;
            System.out.println ("Deleted : "+q.data);
            p.next = q.next;
            head = p;
        }
    }
    public static void display(){
        Node temp = head;
        do{
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        }while (temp != head);

        System.out.println ("NULL");
    }
    public static void main(String[] args) {
//        insertBeforeHead (10);
//        insertBeforeHead (20);
//        insertBeforeHead (30);
//        insertBeforeHead (40);
//        display ();
        insertAtAnyPos (10,1);
        insertAtAnyPos (20,1);
        insertAtAnyPos (30,2);
        insertAtAnyPos (40,3);
        display ();
        deleteHeadNode ();
        display ();
        deleteNodeAtPos (2);
        display ();
    }
}
