package DataStructures.LinkedList;

public class CircularDoublyLinkedList {

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
            t.prev = t;
            t.next = t;
            head = t;
            return;
        }else{
            Node last = head.prev;
            t.next = head;
            t.prev = last;
            last.next = t;
            head.prev = t;
            head = t;
        }
    }

    public static void displayUsingNext(){
        Node temp = head;
        do{
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println ("NULL");
    }

    public static void displayUsingPrev(){
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        // move to last node
        Node temp = head.prev;
        Node last = temp;
        // traverse backward using prev
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }while (temp != last);
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        insertBeforeHead (10);
        insertBeforeHead (20);
        insertBeforeHead (30);
        insertBeforeHead (40);
        displayUsingNext ();
        displayUsingPrev ();
    }
}
