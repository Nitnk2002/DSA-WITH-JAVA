package DataStructures.Queue;

import java.util.Scanner;

public class CircularQueue {
    static class Queue{
        int size;
        int front;
        int rear;
        int[] Q;
    }

    public static void enqueue(Queue q,int x){
        if((q.rear+1) % q.size  == q.front){
            System.out.println ("Queue si full");
        }else {
            q.rear = (q.rear+1)%q.size;
            q.Q[q.rear] = x;
        }
    }
    public static int dequeue(Queue q){
        int x = -1;
        if(q.front == q.rear){
            System.out.println ("Queue is Empty");
        }else {
            q.front = (q.front+1) % q.size;
            x = q.Q[q.front];
        }
        return x;
    }
    public static void display(Queue q){
        System.out.println ("Front : "+q.front);
        System.out.println ("Rear : "+q.rear);
        System.out.print("Queue : [ ");

        int i = (q.front + 1) % q.size;
        while (i != (q.rear + 1) % q.size) {
            System.out.print(q.Q[i] + " ");
            i = (i + 1) % q.size;
        }

        System.out.println("]");
    }
    public static void main(String[] args) {
        Queue q = new Queue ();
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Size : ");
        q.size = sc.nextInt ()+1;
        q.Q = new int[q.size];
        q.front = q.rear = 0;
        enqueue (q,10);
        enqueue (q,20);
        enqueue (q,30);
        enqueue (q,40);
        display (q);
        System.out.println ("Dequeue Element : "+dequeue (q));
        display (q);
    }
}
