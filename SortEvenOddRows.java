package ComputerProjectClass12_1;

import java.util.Scanner;

public class SortEvenOddRows {
    
    public static void main(String args[]) {
        
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        cols = sc.nextInt();
        
        int Numbers[][] = new int[rows][cols];
        int temp;
        
        System.out.println("Enter the values: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                Numbers[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols - 1; j++) {
                for(int k = 0; k < cols - 1; k++) {
                    if(i % 2 == 0 ) {
                        if(Numbers[i][k] > Numbers[i][k + 1]) {
                            temp = Numbers[i][k + 1];
                            Numbers[i][k + 1] = Numbers[i][k];
                            Numbers[i][k] = temp;
                        } 
                    } else {
                        if(Numbers[i][k] < Numbers[i][k + 1]) {
                            temp = Numbers[i][k + 1];
                            Numbers[i][k + 1] = Numbers[i][k];
                            Numbers[i][k] = temp;
                        } 
                    }
                }
            }
        }
         
        System.out.println("Sorted numbers: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(Numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
OUTPUT
Enter the number of rows: 
3
Enter the number of columns: 
3
Enter the values: 
3 1 2
3 4 7
9 0 5
Sorted numbers: 
1 2 3 
7 4 3 
0 5 9 

ALGORITHM
1. Start.
2. Input the no. of rows and columns and initialize the matrix.
3. Input the elements in the matrix using Scanner object.
4. Run a for-loop from i = 0 to i < rows; i++
5. Run a nested for-loop from j = 0 to j < cols - 1; j++
6. Run a nested-nested for-loop from k = 0 to k < cols - 1; k++
7. In the last loop, if (i % 2) == 0 and Numbers[i][k] > Numbers[i][k + 1] -> swap elements
8. Else Numbers[i][k] < Numbers[i][k + 1] -> swap elements 
9. Lastly, display the elements using two for-loops.
10. End.

VARIABLE DESCRIPTION TABLE
+---------------+-------+---------------------------------+
| Variable name | Type  | Function                        |
+---------------+-------+---------------------------------+
| Numbers       | int[] | Store the numbers in the matrix |
+---------------+-------+---------------------------------+
| rows          | int   | Store the no. of rows           |
+---------------+-------+---------------------------------+
| cols          | int   | Store the no. of columns        |
+---------------+-------+---------------------------------+
| temp          | int   | Used in swapping elements       |
+---------------+-------+---------------------------------+
| i             | int   | Used in for-loop                |
+---------------+-------+---------------------------------+
| j             | int   | Used in for-loop                |
+---------------+-------+---------------------------------+
| k             | int   | Used in for-loop                |
+---------------+-------+---------------------------------+
*/