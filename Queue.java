package ComputerProjectClass12_1;

public class Queue {
    
    int arr[], front, rear, size;
    
    Queue(int size1) {
        size = size1;
        arr = new int[size];
        front = rear = -1;
    }
    
    public void enqueue(int n) {
        if(rear == (size - 1)) {
            System.out.println("Queue overflow!");
        } else {
            rear++; //Increment rear because element is added to the queue from rear end
            arr[rear] = n;
            if(front == -1)//if first element is being added
                front = 0;
            System.out.println("Element added to the queue: "+n);
        }
    }
    
    public int dequeue() {
        int x;
        if(front == -1) {// check whether queue contains any element to be deleted or not
            x = -1; //sentinel value
        } else {
            x = arr[front];
            arr[front] = 0;
            if(front == rear) //if last element is removed queue again becomes empty
                front = rear = -1;
            else
                front++; //because element is removed from queue from front end
            System.out.println("Element removed from the queue: "+x);
        }
        return x;
    }
    
    public void display() {
        if(front == -1) {
            System.out.println("Queue is empty");
            return;
        } else {
            System.out.println("\nDisplayed elements: ");
            for(int i = front; i <= rear; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    } //end of method
    
    public static void main(String args[]) {
        
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.display();
    }
}
/*
OUTPUT
Element added to the queue: 1
Element added to the queue: 2
Element added to the queue: 3
Element removed from the queue: 1
Element added to the queue: 4

Displayed elements: 
2 3 4 

ALGORITHM
1. Start.
2. Create a constructor to initialize the data values.
3. Create a function enqueue(int n) to insert an element - 
   if rear == size - 1 -> queue overflow
   else rear ++ -> insert element
   if front == -1 -> set front = 0
4. Create a method dequeue() to remove element - 
   Create a temp. int variable x to store the deleted element to be returned
   if front == -1 -> set x = -1 (sentinel value)
   else x = arr[front] -> set arr[front] = 0,
       if front == rear -> set front = rear - 1
       else front++
   Return x (the deleted element)
5. Create a method display() to display the queue elements -
   if front == -1 -> queue empty -> return function
   else run for loop from i = front -> rear and display elements
6. End.

VARIABLE DESCRIPTION TABLE
+---------------+-------+----------------------------------+
| Variable name | Type  | Function                         |
+---------------+-------+----------------------------------+
| arr           | int[] | Store the elements of queue      |
+---------------+-------+----------------------------------+
| front         | int   | Store the front index            |
+---------------+-------+----------------------------------+
| rear          | int   | Store the end index              |
+---------------+-------+----------------------------------+
| size          | int   | Store the size of queue          |
+---------------+-------+----------------------------------+
| x             | int   | Store the element to be deleted  |
+---------------+-------+----------------------------------+
| n             | int   | Used as a parameter in enqueue() |
+---------------+-------+----------------------------------+
| i             | int   | Used in for-loop                 |
+---------------+-------+----------------------------------+
*/