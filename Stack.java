package ComputerProjectClass12_1;

public class Stack {
    
    int arr[], size, top;

    Stack(int n)
    {
        size = n;
        arr = new int[size];
        top = -1;
    }
    
    void push(int n) {
        
        if(top == size - 1) {
            System.out.println("STACK OVERFLOW");
        } else {
            top = top + 1;
            arr[top] = n;
            System.out.println("Element added: "+n);
        }        
    }

    int pop() {
        if(top == -1) {
            System.out.println("STACK UNDERFLOW");
            return -1;
        } else {
            int val = arr[top];
            top = top - 1;
            System.out.println("Element popped: "+val);
            return val;
        }
    }

    void display() {
        if(top == -1) {
            System.out.println("STACK IS EMPTY");
        } else {
            System.out.println("STACK ELEMENTS: ");
            for(int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
    
    public static void main(String args[]) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.display();
    }
}
/*
OUTPUT
Element added: 1
Element added: 2
Element added: 3
Element popped: 3
Element added: 4
STACK ELEMENTS: 
4
2
1

ALGORITHM
1. Start.
2. Create a constructor to initialize the data values
3. Create a function push(int n) to insert elements in the stack - 
   if top == size - 1 -> stack overflow
   else top = top + 1 & set arr[top] = n (inserted element)
4. Create a function pop() to remove elements from the stack - 
   if top == -1 -> stack underflow
   else set top = top - 1
5. Create a function display() to display the stack elements -  
   if top == -1 -> stack is empty
   else run a for-loop from i = top -> 0 and display elements
6. End

VARIABLE DESCRIPTION TABLE
+---------------+-------+--------------------------------+
| Variable name | Type  | Function                       |
+---------------+-------+--------------------------------+
| arr           | int[] | Store the elements of stack    |
+---------------+-------+--------------------------------+
| size          | int   | Store the size of the stack    |
+---------------+-------+--------------------------------+
| top           | int   | Store the top index of stack   |
+---------------+-------+--------------------------------+
| n             | int   | Used as a parameter in push()  |
+---------------+-------+--------------------------------+
| val           | int   | Store the element to be popped |
+---------------+-------+--------------------------------+
| i             | int   | Used in for-loop               |
+---------------+-------+--------------------------------+
*/