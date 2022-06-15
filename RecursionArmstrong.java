package ComputerProjectClass12_1;

import java.util.Scanner;

public class RecursionArmstrong {
    
    static int cubeSumDigits(int n) {
        if(n == 0) {
            return 0;
        } else {
            return (int)(Math.pow(n % 10, 3) + cubeSumDigits(n/10));
        }
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        if(cubeSumDigits(n) == n) 
            System.out.println("Armstrong Number");
        else 
            System.out.println("Not an Armstrong number");
    }
}
/*
OUTPUT
Enter a number:
153
Armstrong Number

ALGORITHM
1. Start
2. Create a function int cubeSumDigits(int n) to sum the cube of digits.
3. In the function, set base case -> if n == 0 then return 0
   Else -> return (int)Math.pow(n % 10, 3) + cubeSumDigits(n / 10)
4. In the main method, input number using Scanner object.
5. If cubeSumDigits(n) == n -> Print Armstrong number
6. Else -> Print not an Armstrong number
7. End

VARIABLE DESCRIPTION TABLE
+---------------+------+-------------------+
| Variable name | Type | Function          |
+---------------+------+-------------------+
| n             | int  | Store the number. |
+---------------+------+-------------------+
*/