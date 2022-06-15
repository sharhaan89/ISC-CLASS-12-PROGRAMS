package ComputerProjectClass12_1;

import java.util.Scanner;

public class UniqueNumber {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean flag = true; 
        String s = String.valueOf(n);
        
        for(int i = 0; i < s.length() - 1; i++) {
            for(int j = i + 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    break;
                }
            }
        }
        
        if(flag)
            System.out.println("Unique number");
        else
            System.out.println("Not a unique number");
    }
}
/*
OUTPUT
Enter a number:
123456
Unique number

ALGORITHM
1. Start
2. Create a Scanner object and input number from the user in a variable.
3. Create a boolean variable flag (initially true) to store the result.
4. Cast the number into a string s.
5. Run a for-loop from i = 0 -> i < s.length() - 1
   Run a nested for-loop from j = i + 1; j < s.length()
   At each iteration, if s.charAt(i) == s.charAt(j) -> set flag = false, break from loop
6. If flag == true -> print Unique number message.
7. Else -> print not a Unique number message.
8. End.

VARIABLE DESCRIPTION TABLE
+---------------+---------+------------------------------------+
| Variable name | Type    | Function                           |
+---------------+---------+------------------------------------+
| n             | int     | Store the number.                  |
+---------------+---------+------------------------------------+
| s             | String  | Store the number in String format. |
+---------------+---------+------------------------------------+
| flag          | boolean | Store the result of unique number. |
+---------------+---------+------------------------------------+
| i             | int     | Used in for-loop.                  |
+---------------+---------+------------------------------------+
| j             | int     | Used in for-loop.                  |
+---------------+---------+------------------------------------+
*/