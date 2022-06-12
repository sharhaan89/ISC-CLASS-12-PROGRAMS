package ComputerProjectClass12_1;

import java.util.Scanner;

public class ColumnSort {
    
    public static void main(String args[]) {
        
        int mat[][], size, temp;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        size = sc.nextInt();
        mat = new int[size][size];
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
         
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - 1; j++) {
                for(int k = j + 1; k < size; k++) {
                    if(mat[j][i] > mat[k][i]) {
                        temp = mat[j][i];
                        mat[j][i] = mat[k][i];
                        mat[k][i] = temp;
                    }
                }
            }
        }
        
        System.out.println("\nSorted elements (row wise): ");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
         
    }
}
/*
OUTPUT
Enter the size of the matrix: 
3
Enter the elements: 
9 3 6
3 0 1
5 2 8

Sorted elements (row wise): 
3 0 1 
5 2 6 
9 3 8 

ALGORITHM
1. Start
2. Create a matrix int mat[][] and input elements using Scanner object.
3. Run a for-loop from i = 0 to i < size; i++ 
4. Run another nested for-loop from j = 0 to j < size - 1; j++
5. Run another nested-nested for-loop from k = j + 1 to k < size; k++
6. In the last loop, if mat[j][i] > mat[k][i] -> exchange the elements
7. Lastly, display all the elements.
8. End.

VARIABLE DESCRIPTION TABLE
+---------------+-------+----------------------------------------+
| Variable name | Type  | Function                               |
+---------------+-------+----------------------------------------+
| mat           | int[] | Store the elements of matrix           |
+---------------+-------+----------------------------------------+
| size          | int   | Store the size of the matrix           |
+---------------+-------+----------------------------------------+
| temp          | int   | Store the temp. element while swapping |
+---------------+-------+----------------------------------------+
| i             | int   | Used in for-loop                       |
+---------------+-------+----------------------------------------+
| j             | int   | Used in for-loop                       |
+---------------+-------+----------------------------------------+
| k             | int   | Used in for-loop                       |
+---------------+-------+----------------------------------------+
*/