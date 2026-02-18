package DataStructures.Queue;

import java.util.Arrays;
import java.util.Scanner;

public class QueueADT {

    static class Queue{
        int size;
        int front;
        int rear;
        int[] Q;
    }
    public static void enqueue(Queue q,int x){
        if(q.rear == q.size -1){
            System.out.println ("Queue is full");
        }else {
            q.rear++;
            q.Q[q.rear] = x;
        }
    }
    public static int dequeue(Queue q){
        int x = -1;
        if(q.front == q.rear){
            System.out.println ("Queue is empty");
        }else {
            q.front++;
            x = q.Q[q.front];
        }
        return x;
    }

    public static void display(Queue q) {
        System.out.println ("Front : " + q.front);
        System.out.println ("Rear : " + q.rear);
        System.out.print ("Queue : [ ");
        for (int i = q.front + 1; i <= q.rear; i++) {
            System.out.print (q.Q[i] + " ");
        }
        System.out.println ("]");
    }

    public static void main(String[] args) {
        Queue q = new Queue ();
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Size : ");
        q.size = sc.nextInt ();
        q.Q = new int[q.size];
        q.front = q.rear = -1;
        enqueue (q,10);
        enqueue (q,20);
        enqueue (q,30);
        enqueue (q,40);
        display (q);
        System.out.println ("Dequeue Element : "+dequeue (q));
        display (q);
    }
}
