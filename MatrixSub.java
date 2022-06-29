package ComputerProjectClass12_1;

import java.util.Scanner;

public class MatrixSub {
    
    int mat[][];
    int size;
    
    public MatrixSub(int size1) {
        size = size1;
        mat = new int[size][size];
    }
    
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix elements:");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }
    
    MatrixSub subtract(MatrixSub A, MatrixSub B) {
        
        if(A.size != B.size)
            return null;
        
        MatrixSub M = new MatrixSub(A.size);
        for(int i = 0; i < A.size; i++) {
            for(int j = 0; j < A.size; j++) {
                M.mat[i][j] = A.mat[i][j] - B.mat[i][j];
            }
        }
       
        return M;
    }
    
    void display() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        
        MatrixSub A = new MatrixSub(3);
        MatrixSub B = new MatrixSub(3);
        A.input();
        B.input();
        MatrixSub M = new MatrixSub(3);
        M = M.subtract(A, B);
        M.display();
    }
}
/*
OUTPUT
Enter the matrix elements:
4 7 9
2 5 6
1 2 3

Enter the matrix elements:
0 4 6
1 8 9
9 2 7

4 3 3 
1 -3 -3 
-8 0 -4

ALGORITHM
1. Start
2. Create a constructor to initialize the matrix with size.
3. Create a function input() to input the matrix elements using Scanner object.
4. Create a function MatrixSub subtract(MatrixSub A, MatrixSub B) -
   Create a MatrixSub object M to store the subtracted elements.
   Run a for-loop from i = 0 -> i < size; i++
   Run a nested for-loop from j = 0 -> j < size; j++
   In each iteration, set M.mat[i][j] = A.mat[i][j] - B.mat[i][j]
5. Create a function display() to display the elements using two for-loops.
6. In the main method, create three class objects - 
   Two for storing the numbers, one for storing the numbers after subtraction.
   Use the created functions to carry out the process.
7. End.

VARIABLE DESCRIPTION TABLE
+---------------+---------+------------------------------+
| Variable name | Type    | Function                     |
+---------------+---------+------------------------------+
| mat           | int[][] | Store the matrix elements    |
+---------------+---------+------------------------------+
| size          | int     | Store the size of the matrix |
+---------------+---------+------------------------------+
| i             | int     | Used in for-loop             |
+---------------+---------+------------------------------+
| j             | int     | Used in for-loop             |
+---------------+---------+------------------------------+
*/