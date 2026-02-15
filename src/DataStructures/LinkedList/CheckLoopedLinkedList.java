package DataStructures.LinkedList;

public class CheckLoopedLinkedList {

    static class Node{
        int data;
        Node next;
    }

    static Node first = null;
    static Node last = null;

    public static Node insertAtFirst(int x, Node head){
        Node t = new Node ();
        t.data = x;
        t.next = head;
        return t;
    }

    public static Node loopInList(Node head){
        Node temp = head;
        while (temp != null){
            last = temp;
            temp = temp.next;
        }

        last.next = head;
        return head;
    }

    public static void displayWithLoop(Node head){
        Node temp = head;
        do{
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        } while(temp != first);
        System.out.println ("NULL");
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print (temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println ("NULL");
    }

    //floyd loop detection
    public static boolean isloop(Node head){

        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;           // move 1 step
            fast = fast.next.next;     // move 2 steps
            if (slow == fast) {
                return true;            // loop detected
            }
        }
        return false;
    }
    public static void main(String[] args) {
        first = insertAtFirst (5,first);
        first = insertAtFirst (15,first);
        first = insertAtFirst (25,first);
        first = insertAtFirst (35,first);
        //first = loopInList (first);
        //displayWithLoop (first);
        display (first);
        System.out.println (isloop (first));
    }
}
