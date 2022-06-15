package ComputerProjectClass12_1;

import java.util.Scanner;

public class DiagonalSort {
    
    public static void main(String args[]) {
        
        int mat[][], size, temp;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size: ");
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
                if(mat[j][j] > mat[j + 1][j + 1]) {
                    temp = mat[j][j];
                    mat[j][j] = mat[j + 1][j + 1];
                    mat[j + 1][j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nDiagonal Sorted Matrix: ");
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
Enter the matrix size: 
3
Enter the elements: 
6 8 1
4 9 0
2 3 4

Diagonal Sorted Matrix: 
4 8 1 
4 6 0 
2 3 9 

ALGORITHM:
1. Start
2. Create a matrix int mat[][] and input elements using Scanner object.
3. Create a for-loop from i = 0 -> i < size; i++
   Create a nested for-loop from j = 0 -> j < size - 1; j++
   if mat[j][j] > mat[j + 1][j + 1] -> swap elements 
4. Print the diagonal sorted matrix using two for-loops.
5. End.

VARIABLE DESCRIPTION TABLE:
+---------------+---------+----------------------------+
| Variable name | Type    | Function                   |
+---------------+---------+----------------------------+
| mat           | int[][] | Store the matrix elements  |
+---------------+---------+----------------------------+
| size          | int     | Store the size of matrix   |
+---------------+---------+----------------------------+
| temp          | int     | Used for swapping elements |
+---------------+---------+----------------------------+
| i             | int     | Used in for-loop           |
+---------------+---------+----------------------------+
| j             | int     | Used in for-loop           |
+---------------+---------+----------------------------+
*/
