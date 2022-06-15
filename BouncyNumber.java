package ComputerProjectClass12_1;

import java.util.Scanner;

public class BouncyNumber {
    
    static boolean isIncreasing(int n) {
        String s = String.valueOf(n);
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) > s.charAt(i + 1))
                return false;
        }
        return true;
    }
    
    static boolean isDecreasing(int n) {
        String s = String.valueOf(n);
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) < s.charAt(i + 1))
                return false;
        }
        return true;
    }
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        if(isIncreasing(n) || isDecreasing(n))
            System.out.println("Not a bouncy number");
        else 
            System.out.println("Bouncy number");
    }
}
/*
OUTPUT
Enter a number:
9146820
Bouncy number

ALGORITHM
1. Start
2. Create a function isIncreasing(int n) to check if number is increasing or not.
3. In this function, cast int to a String and loop through the string - 
   if s.charAt(i) > s.charAt(i + 1) at any iteration -> return false
   At the end of the function, return true
4. Create a function isDecreasing(int n) to check if number is decreasing or not.
5. In this function, cast int to a String and loop through the string - 
   if s.charAt(i) < s.charAt(i + 1) at any iteration -> return false
   At the end of the function, return true
6. In the main method, create Scanner object and input the number from user.
7. If isIncreasing(n) OR isDecreasing(n) (any one true) -> not a bouncy number.
8. Else the inputted number from the user is a bouncy number.
9. End.

VARIABLE DESCRIPTION TABLE
+---------------+--------+------------------------------------+
| Variable name | Type   | Function                           |
+---------------+--------+------------------------------------+
| n             | int    | Store the number.                  |
+---------------+--------+------------------------------------+
| s             | String | Store the number in String format. |
+---------------+--------+------------------------------------+
| i             | int    | Used in for-loop.                  |
+---------------+--------+------------------------------------+
*/