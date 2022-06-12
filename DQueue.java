package ComputerProjectClass12_1;

public class DQueue {
    
    int front, rear, deq[], size;
    
    DQueue(int size1) {
        size = size1;
        deq = new int[size];
        rear = -1;
        front = -1;
    }
    
    void enqueueFront(int x) {
        if(front == 0 && rear == (size - 1) || (rear + 1) % size == front) {
            System.out.println("Dequeue is full!");
        } else if(rear == -1 && front == -1) {
            rear = 0;
            front = 0;
            deq[front] = x;
        } else if (front == 0) {
            front = size - 1;
            deq[front] = x;
        } else {
            front--;
            deq[front] = x;
        }
    }
    
    void enqueueRear(int x) {
        if(front == 0 && rear == (size - 1) || (front % size) == (rear + 1)) {
            System.out.println("Dequeue is full!");
        } else if(front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            deq[rear] = x;
        } else if(rear == (size - 1)) {
            rear = 0;
            deq[rear] = x;
        } else {
            rear++;
            deq[rear] = x;
        }
    }
    
    void dequeueFront() {
        if(front == -1 && rear == -1) {
            System.out.println("Deque is full!");
        } else if(front == rear) {
            System.out.println("Deleted element is: "+deq[front]);
            front = -1;
            rear = -1;
        } else if(front == (size - 1)) {
            System.out.println("Deleted element is: "+deq[front]);
            front = 0;
        } else {
            System.out.println("Deleted element is: "+deq[front]);
            front++;
        }
    } 
    
    void dequeueRear() {
        if(front == -1 && rear == -1) {
            System.out.println("Deque is empty!");
        } else if(front == rear) {
            System.out.println("Deleted element is: "+deq[rear]);
            front = -1;
            rear = -1;
        } else if(rear == 0) {
            System.out.println("Deleted element is: "+deq[rear]);
            rear = size - 1;
        } else {
            System.out.println("Deleted element is: "+deq[rear]);
            rear--;
        }
    }
    
    void display() {
        int i = front;
        while(i != rear + 1) {
            System.out.println(deq[i]);
            i = (i + 1) % size;
        }
        System.out.println(deq[front]);
    }
    
    void getFront() {
        if(front == -1 && rear == -1) {
            System.out.println("Deque is empty!");
        } else {
            System.out.println("Value at the front is: "+deq[front]);
        }
    }
    
    void getRear() {
        if(front == -1 && rear == -1) {
            System.out.println("Deque is empty!");
        } else {
            System.out.println("Top element at rear is: "+deq[rear]);
        }
    }
    
    public static void main(String args[]) {
        
        DQueue dq = new DQueue(5);
        dq.enqueueFront(1);
        dq.enqueueRear(9);
        dq.enqueueFront(4);
        dq.enqueueRear(5);
        dq.dequeueFront();
        dq.display();
         
    }
}
/*
OUTPUT
Deleted element is: 4
1
9
5
1

ALGORITHM
1. Start.
2. Create a constructor to initialize the data values.
3. Create a function enqueueFront(int n) to insert element from the front - 
   if front == 0 && rear == size - 1 OR rear + 1 % size == front -> dqueue full
   else if rear == front == -1 -> set rear = front = 0 -> insert element
   else if front == 0 -> set front = size - 1 -> insert element
   else front-- -> insert element
4. Create a function enqueueRear(int n) to insert elements from the back - 
   if front == 0 && rear == size - 1 OR front % size == rear + 1 -> dqueue full
   else if front == rear == -1 -> set front = rear = 0 -> insert element
   else if rear == size - 1 -> set rear = 0 -> insert element
   else rear++ -> insert element
5. Create a function dequeueFront() to delete elements from the front - 
   if front == rear == -1 -> dqueue full
   else if front == rear -> set front = rear = -1
   else if front == size - 1 -> set front = 0
   else front++
6. Create a function dequeueRear() to delete elements from the back - 
   if front == rear == -1 -> dqueue empty
   else if front == rear -> set front = rear = -1
   else if rear == 0 -> set rear = size - 1
   else rear--;
7. Create a function getFront() to get element from the front - 
   if front == rear == -1 -> dqueue empty
   else display deq[front]
8. Create a function getRear() to get element from the back - 
   if front == rear == -1 -> dqueue empty
   lse display deq[rear]
9. Create a function display() to display the dqueue elements - 
   Run a while loop from i = front -> rear + 1 & set i = (i + 1) % size in loop
10. End

VARIABLE DESCRIPTION TABLE
+---------------+-------+----------------------------------+
| Variable name | Type  | Function                         |
+---------------+-------+----------------------------------+
| deq           | int[] | Store the elements of dequeue    |
+---------------+-------+----------------------------------+
| front         | int   | Store the front index            |
+---------------+-------+----------------------------------+
| rear          | int   | Store the end index              |
+---------------+-------+----------------------------------+
| size          | int   | Store the size of dequeue        |
+---------------+-------+----------------------------------+
| x             | int   | Used as a parameter in functions |
+---------------+-------+----------------------------------+
| i             | int   | Used in while-loop               |
+---------------+-------+----------------------------------+
*/