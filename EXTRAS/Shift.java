package ComputerProjectClass12_1;

import java.util.Scanner;

public class Shift {
    
    int mat[][];
    int m, n;
    
    Shift(int mm, int nn) {
        m = mm;
        n = nn;
    }
    
    void input() {
        mat = new int[m][n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    
    void cyclic(Shift P) {
        int t[] = mat[0];
        
        for(int i = 0; i < m - 1; i++) {
            mat[i] = mat[i + 1];
        }
        
        mat[m - 1] = t;
    }
    
    void display() {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Shift shift = new Shift(3, 3);
        shift.input();
        shift.cyclic(shift);
        shift.display();
    }
}
/*
OUTPUT
Enter the elements
1 2 3
4 5 6
7 8 9

4 5 6 
7 8 9 
1 2 3 

ALGORITHM
1. Start
2. Create a constructor to initialize the data members with values
3. Create a function input() to input the elements using Scanner object 
4. Create a function cyclic(Shift P) for performing the shift operation - 
   Create int t[] = mat[0];
   Run a for-loop from i = 0 to i < m - 1; i++ -> mat[i] = mat[i + 1]
   Set mat[m - 1] = t;
5. Create a function display() to display the matrix elements
6. In the main method, create a Shift object with arguments (m, n)
7. Call shift.input(), shift.cyclic(shift), shift.display()
8. End

VARIABLE DESCRIPTION TABLE
+---------------+---------+---------------------------+
| Variable name | Type    | Function                  |
+---------------+---------+---------------------------+
| mat           | int[][] | Store the matrix elements |
+---------------+---------+---------------------------+
| m             | int     | Store the no. of rows     |
+---------------+---------+---------------------------+
| n             | int     | Store the no. of columns  |
+---------------+---------+---------------------------+
| mm            | int     | Used as a parameter       |
+---------------+---------+---------------------------+
| nn            | int     | Used as a parameter       |
+---------------+---------+---------------------------+
| t             | int[]   | Used to store the 1st row |
+---------------+---------+---------------------------+
| i             | int     | Used in for-loop          |
+---------------+---------+---------------------------+
| j             | int     | Used in for-loop          |
+---------------+---------+---------------------------+
*/