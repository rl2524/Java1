package ch04lab1;

import java.util.Scanner;

/**
 * Asking for the user input and getting the next 10 sequences.
 * 2/21/2018
 * @author Ramiro
 * @author Andrew J
 */
public class CharacterTables {

    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);// variable for user input

      final int MIN_NUM = 0;//minimum number
      final int MAX_NUM = 118;//highest number
      final int NUM_ROW = 10;//number of rows

      int userNum;//user input
      int i = 0;//used for the loop
      char charAt = 65;//starting point of character
      String userAnswer;//user input if he/she wishes to continue.


      do {//is going to run the program once and depending on the user's input it will continue or stop the program.
         System.out.print("Enter a starting integer between 0 and 118: ");
         userNum = scnr.nextInt();//user's integer input.
         if ((userNum < MIN_NUM) || (userNum > MAX_NUM)) {//if user number isn't between 0-118 it will not run.
            System.out.print("Game over, thank you for playing.");
            break;
         }
         for (i = userNum; i < (userNum + NUM_ROW);i++) {//user number and character will show and increase by 1.
             System.out.println(i + " " + charAt);
             charAt++;
             }
             System.out.print("Enter C to continue, or Q to quit: ");
             userAnswer = scnr.next();//asking if user wishes to continue or quit.

      } while((userAnswer.equals("C")));//program will continue to run as long as the user doesn't input Q.






   }

   }









