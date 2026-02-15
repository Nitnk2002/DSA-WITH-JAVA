package DataStructures.LinkedList;

import java.util.Stack;

public class FindIntersectionIn2LinkedList {
    static class Node{
        int data;
        Node next;
    }

    static Node first = null;
    static Node second = null;

    public static Node insertAtFirst(int x, Node head){
        Node t = new Node ();
        t.data = x;
        t.next = head;
        return t;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println ("NULL");
    }
    public static void findIntersectionOf2LinkedList(){
        Node p = first;
        Node q = second;
        Stack<Node> s1 = new Stack<> ();
        Stack<Node> s2 = new Stack<> ();
        while (p != null){
            s1.push (p);
            p = p.next;
        }
        while(q != null){
            s2.push (q);
            q = q.next;
        }
        Node intersection = null;
        while(!s1.isEmpty () && !s2.isEmpty () && s1.peek () == s2.peek ()){
            intersection = s1.pop ();
            s2.pop ();
        }
        if (intersection != null) {
            System.out.println("Intersection Element : " + intersection.data);
        } else {
            System.out.println("No intersection found");
        }
    }
    public static void findIntersection(Node first, Node second) {

        Node p = first;
        Node q = second;

        while (p != q) {
            p = (p == null) ? second : p.next;
            q = (q == null) ? first : q.next;
        }

        if (p != null)
            System.out.println("Intersection Element : " + p.data);
        else
            System.out.println("No intersection found");
    }


    public static void main(String[] args) {
        first = insertAtFirst (40, first);
        first = insertAtFirst (30, first);
        first = insertAtFirst (20, first);
        first = insertAtFirst (10, first);
        display (first);
        second = insertAtFirst (35,second);
        second = insertAtFirst (20,second);
        second = insertAtFirst (15,second);
        second = insertAtFirst (5,second);
        display (second);

        findIntersection (first,second);

        Node common = new Node();
        common.data = 20;
        common.next = new Node();
        common.next.data = 30;
        common.next.next = null;

        first = insertAtFirst(10, null);
        first.next = common;

        second = insertAtFirst(5, null);
        second.next = insertAtFirst(15, null);
        second.next.next = common;
        display (first);
        display (second);
        findIntersectionOf2LinkedList ();
    }
}
