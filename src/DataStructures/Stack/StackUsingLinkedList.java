package DataStructures.Stack;

import org.w3c.dom.ls.LSOutput;

public class StackUsingLinkedList {

    static class Node{
        int data;
        Node next;
    }

    static Node top = null;
    public static void push(int x){
        Node t = new Node ();
        if(t == null){
            System.out.println ("Stack Overflow");
        }else{
            t.data = x;
            t.next = top;
            top = t;
            System.out.println ("Pushed data : "+t.data);
        }
    }

    public static int pop(){
        Node p;
        int x = -1;
        if(top == null){
            System.out.println ("Stack is Empty");
        }else{
            p = top;
            top = top.next;
            x = p.data;
            p.next = null;
        }
        return x;
    }
    public static int peek(int pos){
        int x = -1;
        Node p = top;
        for (int i = 0; p != null && i < pos-1; i++) {
            p = p.next;
        }
        if(p != null){
            x = p.data;
        }
        return x;
    }

    public static void displayStack(){
        Node temp = top;
        System.out.print ("Stack Elements : ");
        while (temp != null){
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println ("NULL");
    }
    public static void main(String[] args) {
        push (10);
        push (20);
        push (30);
        push (40);
        displayStack ();
        System.out.println ("Popped data : "+pop ());
        displayStack ();
        System.out.println ("Peeked Data : "+peek (2));
    }
}
