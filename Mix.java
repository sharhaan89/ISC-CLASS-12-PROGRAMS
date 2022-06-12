package ComputerProjectClass12_1;

import java.util.Scanner;

public class Mix {
    
    String wrd;
    int len;
    
    Mix() {
        wrd = "";
        len = 0;
    }
    
    void feedword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther word (in UPPER CASE): ");
        wrd = sc.nextLine();
    }
    
    void mix_word(Mix P, Mix Q) {
        
        String s;
        int len1 = P.wrd.length();
        int len2 = Q.wrd.length();
        int minLen = Math.min(len1, len2);
        
        if(len1 > len2) 
            s = P.wrd;
        else
            s = Q.wrd;
        
        for(int i = 0; i < minLen; i++) {
            this.wrd += P.wrd.charAt(i);
            this.wrd += Q.wrd.charAt(i);
        }
        
        for(int i = minLen; i < s.length(); i++) {
            this.wrd += s.charAt(i);
        }
    }
    
    void display() {
        System.out.println("Reformed word: "+this.wrd);
    }
    
    public static void main(String args[]) {
        
        Mix mix1 = new Mix();
        Mix mix2 = new Mix();
        mix1.feedword();
        mix2.feedword();
        
        Mix mix = new Mix();
        mix.mix_word(mix1, mix2);
        mix.display();
         
    }
}
/*
OUTPUT
Enter ther word (in UPPER CASE): 
JUMP
Enter ther word (in UPPER CASE): 
STROLL
Reformed word: JSUTMRPOLL

ALGORITHM
1. Start
2. Create a constructor Mix() to initialize the data values
3. Create a function feedword() to input the word using a Scanner object
4. Create a function mix_word(Mix P, Mix Q) to perform the mixing operation - 
   Create a String s (for storing the longest string)
   if len1 > len2 -> s = P.wrd
   if len2 > len1 -> s = Q.wrd
   Run a for-loop from i = 0 to minLen; i++ -> 
       this.wrd += P.wrd.charAt(i);
       this.wrd += Q.wrd.charAt(i);
   Run another for-loop from i = minLen to s.length(); i++ ->
       this.wrd += s.charAt(i);
5. Create a function display() to display the word (this.wrd)
6. In the main method, create two Mix objects - mix1, mix2 and call feedword()
7. Create a mix object and call mix_word(mix1, mix2)
8. Finally, call mix.display()
9. End.

VARIABLE DESCRIPTION TABLE
+---------------+--------+----------------------------------+
| Variable name | Type   | Function                         |
+---------------+--------+----------------------------------+
| wrd           | String | Store the word of the Mix class  |
+---------------+--------+----------------------------------+
| len           | int    | Store the length of the word     |
+---------------+--------+----------------------------------+
| s             | String | Store the longest word           |
+---------------+--------+----------------------------------+
| len1          | int    | Store the length of 1st word     |
+---------------+--------+----------------------------------+
| len2          | int    | Store the length of 2nd word     |
+---------------+--------+----------------------------------+
| minLen        | int    | Store the min. length of 2 words |
+---------------+--------+----------------------------------+
| i             | int    | Used in for-loop                 |
+---------------+--------+----------------------------------+
*/