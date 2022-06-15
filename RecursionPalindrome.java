package ComputerProjectClass12_1;

import java.util.Scanner;

public class RecursionPalindrome {
    
    static int getReverse(int n, int sum) {
        if(n <= 0) {
            return sum;
        } else {
            return getReverse(n / 10, (sum * 10) + (n % 10));
        }
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(getReverse(n, 0) == n) 
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}
/*
OUTPUT
Enter a number: 
12321
Palindrome number

ALGORITHM
1. Start
2. Create a function int getReverse(int n, int sum) to get reverse of number.
3. In the above function, set base case -> if n <= 0 -> return sum
   Else - > return getReverse(n / 10, (sum * 10) + (n % 10))
4. In the main method, input number using Scanner object
5. if getReverse(n, 0) == n -> Print message Palindrome number
6. else -> Print message not a Palindrome number
7. End.

VARIABLE DESCRIPTION TABLE
+---------------+------+------------------------------+
| Variable name | Type | Function                     |
+---------------+------+------------------------------+
| n             | int  | Store the number.            |
+---------------+------+------------------------------+
| sum           | int  | Store the reverse of number. |
+---------------+------+------------------------------+
*/