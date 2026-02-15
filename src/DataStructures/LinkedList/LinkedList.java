package DataStructures.LinkedList;

public class LinkedList {

    static class Node{
        int data;
        Node next;
    }

    static Node head = null;

    //insert at end
    public static  void create(int x){
        Node newNode = new Node ();
        newNode.data = x;
        newNode.next = null;

        if(head == null){
            head = newNode;
            return;
        }

        Node temp  = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println ("NULL");
    }
    public static int count(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static int add(){
        int sum =0;
        Node temp = head;
        while(temp !=null){
            sum = sum + temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public static int max(){
        int max = Integer.MIN_VALUE;
        Node temp = head;
        while(temp != null){
            if(temp.data > max){
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
    public static Node search(int key){
        Node temp = head;
        while(temp != null){
            if(key == temp.data){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        create (10);
        create (20);
        create (30);
        create (40);
        display ();
        System.out.println (add ());
        System.out.println (max ());
        System.out.println (count ());
        System.out.println (search (30));
    }
}
