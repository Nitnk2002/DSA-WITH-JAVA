package DataStructures.LinkedList;

import java.util.Stack;

public class MergeTwoLinkedList {

    static class Node{
        int data;
        Node next;
    }

    static Node first = null;
    static Node second = null;
    static Node third = null;
    static Node last = null;

    public static Node insertAtFirst(int x,Node head){
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
    public static Node mergeList(Node first,Node second){

        if(first.data <second.data){
            third = last = first;
            first = first.next;
            last.next = null;
        }else{
            third = last = second;
            second = second.next;
            last.next = null;
        }
        while(first != null && second != null){
            if(first.data < second.data){
                last.next = first;
                last = first;
                first = first.next;
                last.next = null;
            }else{
                last.next = second;
                last = second;
                second = second.next;
                last.next = null;
            }
        }
        if(first != null){
            last.next = first;
        }else{
            last.next = second;
        }
        return third;
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

        Node merged = mergeList (first,second);
        display (merged);
    }
}
