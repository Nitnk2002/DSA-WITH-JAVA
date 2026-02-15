package DataStructures.LinkedList;

public class DoublyLinkedList {

    static class Node{
        Node prev;
        int data;
        Node next;
    }
    static Node head = null;
    public static void insertBeforeHead(int x){
        Node t = new Node ();
        t.data = x;
        if(head == null){
            t.prev = null;
            t.next = null;
        }else{
            t.prev = null;
            t.next = head;
            head.prev = t;
        }
        head = t;
    }
    public static void insertAtPos(int x,int pos){
        Node t = new Node ();
        t.data = x;
        if(head == null){
            t.prev = null;
            t.next = null;
        }else{
            Node temp = head;
            for (int i = 1; i < pos-1 ; i++) {
                temp = temp.next;
            }
            t.prev = temp;
            t.next = temp.next;
            if(temp.next != null){
                temp.next.prev = t;
            }
            temp.next = t;
        }
    }
    public static void deleteNodeFromHead(){
        Node p = head;
        head = head.next;
        System.out.println ("Deleted : "+p.data);
        if(head != null){
            head.prev = null;
        }
    }

    public static void deleteNodeAtPos(int pos){
        Node p = head;
        for (int i = 0; i < pos-1; i++) {
            p = p.next;
        }
        p.prev.next = p.next;
        if(p.next != null){
            p.next.prev = p.prev;
        }
        System.out.println ("Deleted : "+p.data);
    }

    public static void reverseDoublyLinkedList(){
        Node p = head;
        Node last = null;
        while(p != null){
            last = p;
            Node temp = p.next;
            p.next = p.prev;
            p.prev = temp;
            p = p.prev;
        }
        if(last != null){
            head = last;
        }
    }
    public static void displayUsingNext(){
        Node temp = head;
        while(temp != null){
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println ("NULL");
    }
    public static void displayUsingPrev(){
        if (head == null) {
            System.out.println("NULL");
            return;
        }

        Node temp = head;

        // move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // traverse backward using prev
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        insertBeforeHead (10);
        insertBeforeHead (20);
        insertBeforeHead (30);
        insertBeforeHead (40);
        displayUsingNext ();
        insertAtPos (15,2);
        displayUsingPrev ();
        deleteNodeFromHead ();
        displayUsingPrev ();
        deleteNodeAtPos (2);
        displayUsingNext ();
        reverseDoublyLinkedList ();
        displayUsingNext ();
    }
}
