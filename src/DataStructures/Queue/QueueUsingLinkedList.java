package DataStructures.Queue;

public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
    }

    static Node front = null;
    static Node rear = null;

    public static void enqueue(int x){
        Node t = new Node ();
        if(t == null){
            System.out.println ("Queue is full");
        }else {
            t.data = x;
            t.next = null;
            if(front == null){
                front = rear = t;
            }else {
                rear.next = t;
                rear = t;
            }

        }
    }

    public static int dequeue(){
        int x = -1;
        Node p ;
        if(front == null){
            System.out.println ("Queue is empty");
        }else {
            p = front;
            front = front.next;
            x =  p.data;
        }
        return x;
    }
    public static void display(){
        System.out.println ("Front : "+front.data);
        System.out.println ("Rear : "+rear.data);
        System.out.print ("Queue : ");
        Node p = front;
        while (p != null){
            System.out.print (p.data+" -> ");
            p = p.next;
        }
        System.out.println ("NULL");
    }
    public static void main(String[] args) {
        enqueue (10);
        enqueue (20);
        enqueue (30);
        enqueue (40);
        display ();
        System.out.println ("Dequeue data : "+dequeue ());
        display ();

    }
}
