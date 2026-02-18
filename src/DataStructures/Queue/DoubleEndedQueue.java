package DataStructures.Queue;

import java.util.Scanner;

public class DoubleEndedQueue {

    static class Queue{
        int size;
        int front;
        int rear;
        int[] Q;
    }
    public static void enqueueFromFront(Queue q, int x){
        if(q.rear == q.size -1){
            System.out.println ("Queue is full");
        }else {

            for (int i = q.rear; i > q.front; i--) {
                q.Q[i+1] = q.Q[i];
            }
            q.rear++;
            q.Q[q.front+1] = x;
        }
    }
    public static void enqueueFromRear(Queue q, int x){
        if(q.rear == q.size -1){
            System.out.println ("Queue is full");
        }else {
            q.rear++;
            q.Q[q.rear] = x;
        }
    }
    public static int dequeueFromFront(Queue q){
        int x = -1;
        if(q.front == q.rear){
            System.out.println ("Queue is empty");
        }else {
            q.front++;
            x = q.Q[q.front];
        }
        return x;
    }
    public static int dequeueFromRear(Queue q){
        int x = -1;
        if(q.front == q.rear){
            System.out.println ("Queue is empty");
        }else {
            x = q.Q[q.rear];
            q.rear--;
        }
        return x;
    }
    public static void display(Queue q){
        System.out.println ("Front : "+q.front);
        System.out.println ("Rear : "+q.rear);
        System.out.print("Queue : [ ");
        for (int i = q.front + 1; i <= q.rear; i++) {
            System.out.print(q.Q[i] + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Queue q = new Queue ();
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Size : ");
        q.size = sc.nextInt ();
        q.Q = new int[q.size];
        q.front = q.rear = -1;
        enqueueFromFront (q,1);
        enqueueFromFront (q,2);
        enqueueFromFront (q,3);
        enqueueFromRear (q,4);
        display (q);
        dequeueFromFront (q);
        display (q);
        dequeueFromRear (q);
        display (q);
    }
}
