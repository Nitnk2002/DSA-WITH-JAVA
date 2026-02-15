package DataStructures.LinkedList;

public class LinkedListAllMethod {
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
    public static void insertAtPos(int x,int pos){
        Node temp = new Node();
        temp.data = x;
        if (pos == 1) {
            temp.next = head;
            head = temp;
            return;
        }
        Node p = head;
        for (int i = 1; i < pos-1; i++) {
            p = p.next;
        }
        temp.next = p.next;
        p.next = temp;
    }
    public static void insertAtLast(int x){
        Node temp = new Node ();
        temp.data =x;
        temp.next = null;
        if(head ==  null){
            head = last = temp;
        }
        else {
            last.next = temp;
            last = temp;
        }
    }
    public static void deleteFromFirst(){
        int x =0;
        if(head == null){
            System.out.println ("List is empty..");
        }
        x= head.data;
        head = head.next;
        System.out.println ("Delete : "+x);
        if(head == null){
            last = null;
        }
    }
    public static void deleteFromLast(){
        int x = 0;
        if(head == null){
            System.out.println ("List is empty..");
            return;
        }
        x = last.data;
        Node temp = head;
        while (temp.next != last){
                temp = temp.next;
        }
        temp.next = null;
        last = temp;
        System.out.println ("Delete : "+x);

    }
    public static void deleteFromPos(int pos){
        int x = 0;
        if(head == null){
            System.out.println ("List is empty..");
            return;
        }
        if(pos == 1){
            deleteFromFirst ();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos-1  && temp.next != null; i++) {
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println ("Invalid Positon..");
            return;
        }
        if(temp.next == last){
            last = temp;
        }
        x = temp.next.data;
        temp.next = temp.next.next;
        System.out.println ("Delete : "+x);
    }

    public static void findMiddleNode(){
        Node p = head,q = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
        }
        System.out.println ("Middle Node Element : "+p.data);
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
        insertAtFirst (40);
        insertAtLast (5);
        display ();
        insertAtPos (15,3);
        insertAtPos (25,4);
        display ();
        findMiddleNode ();
        deleteFromFirst ();
        deleteFromLast ();
        deleteFromPos (4);
        display ();
        findMiddleNode ();
    }
}
