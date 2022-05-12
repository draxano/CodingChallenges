package draxano.fundamentals.hacker;
import java.util.Scanner;

public class SubString {

         Scanner scan = new Scanner(System.in);
         String s = scan.next();
         int k = scan.nextInt();

        public static String getSmallestAndLargest(String s, int k) {
            String currStr = s.substring(0, k);
            String smallest = currStr;
            String largest = currStr;


            for(int i = k; i < s.length(); i++){
                currStr = currStr.substring(1,k) + s.charAt(i);
                if(largest.compareTo(currStr) < 0){
                    largest =currStr;
                }
                if(smallest.compareTo(currStr) > 0){
                    smallest = currStr;
                }
            }

            return smallest + "\n" + largest;

        }

}

// Okay, we need to understand what is going on here:
// I believe most important aspect of this program is the for-loop. WHat is going on there? Let's say we call the program with 3 different arguments
// Basically for loop is executed to generate sub-strings of s, and everytime new one is generated through iteration it's compared to the previous one. This process
// continues until max length of the s is reached and there is no more sub-strings remaining.


