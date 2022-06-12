package ComputerProjectClass12_1;

import java.util.*;

public class CQueue {
    
    int arr[], front, rear, size;
    
    CQueue(int size1) {
        size = size1;
        arr = new int[size];
        front = -1; rear = -1;
    }
    
    void enqueue(int n) {
        if(rear == -1 && front == -1) {
            rear = 0;
            front = 0;
            arr[rear] = n;
        } else if(rear + 1 % size == front) {
            System.out.println("Circular queue is full");
        } else {
            rear = rear + 1 % size;
            arr[rear] = n;
        }
    }
    
    void dequeue() {
        if(rear == -1 && front == -1) {
            System.out.println("Circular queue is empty");
        } else if (rear == front) {
            System.out.println("The element to be deleted is "+arr[front]);
            rear = -1; front = -1;
        } else {
            System.out.println("The deleted value: "+arr[front]);
            front = front + 1 % size;
        }
    }
    
    void display() {
        System.out.println("Displayed Elements:");
        int i = front;
        while(i != rear + 1) {
            System.out.println(arr[i]);
            i++;
        }
    }
    
    public static void main(String args[]) {
        
        CQueue obj = new CQueue(5);
        Scanner sc = new Scanner(System.in);
        
        obj.enqueue(1);
        obj.enqueue(5);
        obj.enqueue(10);
        obj.dequeue();
        obj.display();
    }
}
/*
OUTPUT 
The deleted value: 1
Displayed Elements:
5
10

ALGORITHM
1. Start.
2. Create a constructor to initialize the data values.
3. Create a method enqueue(int n) to insert elements - 
   if rear & front == -1 -> set rear = front = 0 -> insert element
   else if rear + 1 % size == front -> cqueue is full
   else set rear = rear + 1 % size -> insert element
4. Create a method dequeue() to delete elements - 
   if rear == front == -1 -> cqueue is empty
   else if rear == front -> set rear = front = -1
   else set front = front + 1 % size 
5. Create a method display() to display the elements - using for loop from front -> rear
6. End.

VARIABLE DESCRIPTION TABLE
+---------------+-------+----------------------------------+
| Variable name | Type  | Function                         |
+---------------+-------+----------------------------------+
| arr           | int[] | Store the elements of cqueue     |
+---------------+-------+----------------------------------+
| front         | int   | Store the front index            |
+---------------+-------+----------------------------------+
| rear          | int   | Store the end index              |
+---------------+-------+----------------------------------+
| size          | int   | Store the size of cqueue         |
+---------------+-------+----------------------------------+
| n             | int   | Used as a parameter in enqueue() |
+---------------+-------+----------------------------------+
| i             | int   | Used in while-loop               |
+---------------+-------+----------------------------------+
*/